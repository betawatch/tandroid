package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bg.z2;
import i7.f6;
import java.util.ArrayList;
import l4.s0;
import lh.d5;
import lh.r6;
import lh.s6;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.y71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray A;
    public static LongSparseArray B;
    public final o2 a;
    public final int b;
    public final c6 c;
    public final long d;
    public final lh.c6 e;
    public final ArrayList f;
    public final ArrayList h;
    public final a n;
    public final y71 r;
    public Boolean s;
    public int v;
    public float w;
    public ValueAnimator x;
    public int y;

    public v(Context context, o2 o2Var, long j10) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.a = o2Var;
        int currentAccount = o2Var.getCurrentAccount();
        this.b = currentAccount;
        c6 resourceProvider = o2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j10;
        setBackgroundColor(g6.v(g6.v0(g6.d6, resourceProvider), g6.l1(0.04f, g6.v0(g6.G6, resourceProvider))));
        if (B == null) {
            B = new LongSparseArray();
        }
        long j11 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) B.get(j11);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = B;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        lh.c6 c6Var = (lh.c6) longSparseArray.get(j10);
        if (c6Var == null) {
            lh.c6 c6Var2 = new lh.c6(currentAccount, j10, "", null);
            longSparseArray.put(j10, c6Var2);
            c6Var = c6Var2;
        }
        this.e = c6Var;
        fr0 fr0Var = (fr0) this;
        a aVar = new a(fr0Var, context);
        this.n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(fr0Var, context));
        addView(aVar, f6.e(-1, -1, 119));
        y71 n10 = aVar.n(9, true);
        this.r = n10;
        n10.r = 12;
        n10.setPreTabClick(new s0(fr0Var, 10));
        addView(n10, f6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        o2 o2Var = this.a;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        ni niVar = new ni(o2Var.getParentActivity(), this.a, false, false, false, this.c);
        niVar.J1(1, false);
        niVar.P0 = true;
        niVar.O0 = false;
        niVar.f1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
        niVar.f0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            AndroidUtilities.hideKeyboard(o2Var.getFragmentView().findFocus());
        }
        niVar.V1 = new c(this, niVar, str);
        niVar.r1();
        niVar.show();
    }

    public final void b(String str) {
        lh.c6 c6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i10 >= arrayList.size()) {
                c6Var = null;
                break;
            }
            c6Var = (lh.c6) arrayList.get(i10);
            if (c6Var != null && TextUtils.equals(c6Var.E, str)) {
                break;
            } else {
                i10++;
            }
        }
        if (c6Var != null) {
            ArrayList arrayList2 = c6Var.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.b;
            deletepreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList2.get(i12)).storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(MessagesController.toInputMedia(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        lh.c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (c6Var = ((r) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = c6Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!c((MessageObject) arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.storiesListUpdated;
        a aVar = this.n;
        int i13 = 0;
        if (i10 != i12) {
            if (i10 == NotificationCenter.storiesUpdated) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof r) {
                        ((r) view).v.l();
                    }
                    i13++;
                }
                return;
            }
            return;
        }
        Object obj = objArr[0];
        lh.c6 c6Var = this.e;
        if (obj == c6Var) {
            i(true);
            View[] viewPages2 = aVar.getViewPages();
            int length2 = viewPages2.length;
            while (i13 < length2) {
                View view2 = viewPages2[i13];
                if (view2 instanceof r) {
                    r rVar = (r) view2;
                    if (rVar.a == c6Var) {
                        rVar.v.l();
                    }
                }
                i13++;
            }
            return;
        }
        if (this.f.indexOf(obj) >= 0) {
            View[] viewPages3 = aVar.getViewPages();
            for (View view3 : viewPages3) {
                if (view3 instanceof r) {
                    r rVar2 = (r) view3;
                    if (rVar2.a == objArr[0]) {
                        rVar2.v.l();
                    }
                }
            }
        }
    }

    public abstract boolean e(MessageObject messageObject);

    public final void f() {
        lh.c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (c6Var = ((r) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = c6Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!c((MessageObject) arrayList.get(i10))) {
                e((MessageObject) arrayList.get(i10));
            }
        }
    }

    public abstract boolean g(MessageObject messageObject);

    public String getBotPreviewsSubtitle() {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof r) {
            lh.c6 c6Var = ((r) currentView).a;
            if (c6Var != null) {
                ArrayList arrayList = c6Var.i;
                i10 = 0;
                i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    TL_stories.StoryItem storyItem = messageObject.storyItem;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (MessageObject.isVideoDocument(messageMedia.document)) {
                            i11++;
                        } else if (messageObject.storyItem.media.photo != null) {
                            i10++;
                        }
                    }
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return LocaleController.getString(R.string.BotPreviewEmpty);
            }
            if (i10 > 0) {
                sb2.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
            }
            if (i11 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        lh.c6 c6Var;
        a aVar = this.n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof r) || (c6Var = ((r) view).a) == null) {
            return null;
        }
        return c6Var.E;
    }

    public lh.c6 getCurrentList() {
        lh.c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (c6Var = ((r) currentView).a) == null) {
            return null;
        }
        return c6Var;
    }

    public jl0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof r) {
            return ((r) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        lh.c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (c6Var = ((r) currentView).a) == null) {
            return 0;
        }
        return c6Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        lh.c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (c6Var = ((r) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = c6Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (c((MessageObject) arrayList.get(i10))) {
                g((MessageObject) arrayList.get(i10));
            }
        }
    }

    public final void i(boolean z10) {
        lh.c6 c6Var;
        o7 o7Var;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        s6 storiesController = MessagesController.getInstance(this.b).getStoriesController();
        long j10 = this.d;
        ArrayList E = storiesController.E(j10);
        if (E != null) {
            int size2 = E.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E.get(i11);
                i11++;
                r6 r6Var = (r6) obj2;
                if (r6Var != null && (o7Var = r6Var.c) != null && o7Var.J0 == j10 && !TextUtils.isEmpty(o7Var.K0) && !arrayList.contains(o7Var.K0)) {
                    arrayList.add(o7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            String str2 = (String) obj3;
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList4.size()) {
                    c6Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((lh.c6) arrayList4.get(i13)).E, str2)) {
                        c6Var = (lh.c6) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                }
            }
            if (c6Var == null) {
                lh.c6 c6Var2 = new lh.c6(this.b, this.d, str2, null);
                c6Var2.H(null);
                c6Var = c6Var2;
            }
            arrayList3.add(c6Var);
        }
        a aVar = this.n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(x3.i(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        iq iqVar = new iq(R.drawable.msg_filled_plus, 0);
        iqVar.setScale(0.9f, 0.9f);
        iqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(iqVar, 0, 1, 33);
        y71 y71Var = this.r;
        y71Var.a(-1, spannableString);
        y71Var.x.l();
        boolean z11 = arrayList3.size() + 1 > 1;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z11) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.s = Boolean.valueOf(z11);
            if (!z10) {
                this.w = z11 ? 1.0f : 0.0f;
                y71Var.setTranslationY(AndroidUtilities.dp(z11 ? 0.0f : -42.0f));
                aVar.setTranslationY(AndroidUtilities.dp(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z11 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new d5(this, 3));
            this.x.addListener(new z2(8, this, z11));
            this.x.setDuration(320L);
            this.x.setInterpolator(jr.h);
            this.x.start();
        }
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof r) {
            r rVar = (r) currentView;
            i iVar = rVar.f;
            for (int i10 = 0; i10 < iVar.getChildCount(); i10++) {
                View childAt = iVar.getChildAt(i10);
                if (childAt instanceof p7) {
                    p7 p7Var = (p7) childAt;
                    p7Var.i(rVar.S.c(p7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (A == null) {
            A = new LongSparseArray();
        }
        LongSparseArray longSparseArray = A;
        int i10 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = new LongSparseArray();
            A.put(i10, longSparseArray3);
            longSparseArray2 = longSparseArray3;
        }
        longSparseArray2.put(this.d, this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (A == null) {
            A = new LongSparseArray();
        }
        LongSparseArray longSparseArray = A;
        int i10 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof r) {
                    ((r) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
