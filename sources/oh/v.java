package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import dg.w2;
import java.util.ArrayList;
import k7.b6;
import lh.m5;
import nh.d6;
import nh.e5;
import nh.s6;
import nh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.sl0;
import ph.u6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray B;
    public static LongSparseArray C;
    public final p2 a;
    public final int b;
    public final f6 c;
    public final long d;
    public final d6 e;
    public final ArrayList f;
    public final ArrayList h;
    public final a n;
    public final k81 r;
    public Boolean s;
    public int v;
    public float w;
    public ValueAnimator x;
    public int y;

    public v(Context context, p2 p2Var, long j10) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.a = p2Var;
        int currentAccount = p2Var.getCurrentAccount();
        this.b = currentAccount;
        f6 resourceProvider = p2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j10;
        setBackgroundColor(j6.v(j6.v0(j6.d6, resourceProvider), j6.l1(0.04f, j6.v0(j6.G6, resourceProvider))));
        if (C == null) {
            C = new LongSparseArray();
        }
        long j11 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) C.get(j11);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = C;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        d6 d6Var = (d6) longSparseArray.get(j10);
        if (d6Var == null) {
            d6 d6Var2 = new d6(currentAccount, j10, "", null);
            longSparseArray.put(j10, d6Var2);
            d6Var = d6Var2;
        }
        this.e = d6Var;
        nr0 nr0Var = (nr0) this;
        a aVar = new a(nr0Var, context);
        this.n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(nr0Var, context));
        addView(aVar, b6.e(-1, -1, 119));
        k81 n10 = aVar.n(9, true);
        this.r = n10;
        n10.r = 12;
        n10.setPreTabClick(new m5(nr0Var, 15));
        addView(n10, b6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        p2 p2Var = this.a;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        li liVar = new li(p2Var.getParentActivity(), this.a, false, false, false, this.c);
        liVar.J1(1, false);
        liVar.Q0 = true;
        liVar.P0 = false;
        liVar.g1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
        liVar.g0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            AndroidUtilities.hideKeyboard(p2Var.getFragmentView().findFocus());
        }
        liVar.W1 = new c(this, liVar, str);
        liVar.r1();
        liVar.show();
    }

    public final void b(String str) {
        d6 d6Var;
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
                d6Var = null;
                break;
            }
            d6Var = (d6) arrayList.get(i10);
            if (d6Var != null && TextUtils.equals(d6Var.E, str)) {
                break;
            } else {
                i10++;
            }
        }
        if (d6Var != null) {
            ArrayList arrayList2 = d6Var.i;
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
        d6 d6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (d6Var = ((r) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = d6Var.i;
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
        d6 d6Var = this.e;
        if (obj == d6Var) {
            i(true);
            View[] viewPages2 = aVar.getViewPages();
            int length2 = viewPages2.length;
            while (i13 < length2) {
                View view2 = viewPages2[i13];
                if (view2 instanceof r) {
                    r rVar = (r) view2;
                    if (rVar.a == d6Var) {
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
        d6 d6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (d6Var = ((r) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = d6Var.i;
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
        StringBuilder sb = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof r) {
            d6 d6Var = ((r) currentView).a;
            if (d6Var != null) {
                ArrayList arrayList = d6Var.i;
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
                sb.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
            }
            if (i11 > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
            }
        }
        return sb.toString();
    }

    public String getCurrentLang() {
        View view;
        d6 d6Var;
        a aVar = this.n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof r) || (d6Var = ((r) view).a) == null) {
            return null;
        }
        return d6Var.E;
    }

    public d6 getCurrentList() {
        d6 d6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (d6Var = ((r) currentView).a) == null) {
            return null;
        }
        return d6Var;
    }

    public sl0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof r) {
            return ((r) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        d6 d6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (d6Var = ((r) currentView).a) == null) {
            return 0;
        }
        return d6Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        d6 d6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (d6Var = ((r) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = d6Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (c((MessageObject) arrayList.get(i10))) {
                g((MessageObject) arrayList.get(i10));
            }
        }
    }

    public final void i(boolean z4) {
        d6 d6Var;
        u6 u6Var;
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
        t6 storiesController = MessagesController.getInstance(this.b).getStoriesController();
        long j10 = this.d;
        ArrayList E = storiesController.E(j10);
        if (E != null) {
            int size2 = E.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E.get(i11);
                i11++;
                s6 s6Var = (s6) obj2;
                if (s6Var != null && (u6Var = s6Var.c) != null && u6Var.J0 == j10 && !TextUtils.isEmpty(u6Var.K0) && !arrayList.contains(u6Var.K0)) {
                    arrayList.add(u6Var.K0);
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
                    d6Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((d6) arrayList4.get(i13)).E, str2)) {
                        d6Var = (d6) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                }
            }
            if (d6Var == null) {
                d6 d6Var2 = new d6(this.b, this.d, str2, null);
                d6Var2.H(null);
                d6Var = d6Var2;
            }
            arrayList3.add(d6Var);
        }
        a aVar = this.n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(y3.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        mq mqVar = new mq(R.drawable.msg_filled_plus, 0);
        mqVar.setScale(0.9f, 0.9f);
        mqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(mqVar, 0, 1, 33);
        k81 k81Var = this.r;
        k81Var.a(-1, spannableString);
        k81Var.x.l();
        boolean z10 = arrayList3.size() + 1 > 1;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z10) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.s = Boolean.valueOf(z10);
            if (!z4) {
                this.w = z10 ? 1.0f : 0.0f;
                k81Var.setTranslationY(AndroidUtilities.dp(z10 ? 0.0f : -42.0f));
                aVar.setTranslationY(AndroidUtilities.dp(z10 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new e5(this, 3));
            this.x.addListener(new w2(8, this, z10));
            this.x.setDuration(320L);
            this.x.setInterpolator(nr.h);
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
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    r7Var.i(rVar.T.c(r7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (B == null) {
            B = new LongSparseArray();
        }
        LongSparseArray longSparseArray = B;
        int i10 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = new LongSparseArray();
            B.put(i10, longSparseArray3);
            longSparseArray2 = longSparseArray3;
        }
        longSparseArray2.put(this.d, this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (B == null) {
            B = new LongSparseArray();
        }
        LongSparseArray longSparseArray = B;
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
