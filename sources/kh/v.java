package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import h3.x;
import h7.z5;
import java.util.ArrayList;
import jh.b6;
import jh.r6;
import jh.s6;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray A;
    public static LongSparseArray B;
    public final n2 a;
    public final int b;
    public final c6 c;
    public final long d;
    public final b6 e;
    public final ArrayList f;
    public final ArrayList h;
    public final a n;
    public final o71 r;
    public Boolean s;
    public int v;
    public float w;
    public ValueAnimator x;
    public int y;

    public v(Context context, n2 n2Var, long j10) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.a = n2Var;
        int currentAccount = n2Var.getCurrentAccount();
        this.b = currentAccount;
        c6 resourceProvider = n2Var.getResourceProvider();
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
        b6 b6Var = (b6) longSparseArray.get(j10);
        if (b6Var == null) {
            b6 b6Var2 = new b6(currentAccount, j10, "", null);
            longSparseArray.put(j10, b6Var2);
            b6Var = b6Var2;
        }
        this.e = b6Var;
        vq0 vq0Var = (vq0) this;
        a aVar = new a(vq0Var, context);
        this.n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(vq0Var, context));
        addView(aVar, z5.e(-1, -1, 119));
        o71 n10 = aVar.n(9, true);
        this.r = n10;
        n10.r = 12;
        n10.setPreTabClick(new x(vq0Var, 28));
        addView(n10, z5.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        n2 n2Var = this.a;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        gi giVar = new gi(n2Var.getParentActivity(), this.a, false, false, false, this.c);
        giVar.J1(1, false);
        giVar.P0 = true;
        giVar.O0 = false;
        giVar.f1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
        giVar.f0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            AndroidUtilities.hideKeyboard(n2Var.getFragmentView().findFocus());
        }
        giVar.V1 = new d(this, giVar, str);
        giVar.r1();
        giVar.show();
    }

    public final void b(String str) {
        b6 b6Var;
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
                b6Var = null;
                break;
            }
            b6Var = (b6) arrayList.get(i10);
            if (b6Var != null && TextUtils.equals(b6Var.E, str)) {
                break;
            } else {
                i10++;
            }
        }
        if (b6Var != null) {
            ArrayList arrayList2 = b6Var.i;
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
        b6 b6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (b6Var = ((r) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = b6Var.i;
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
        b6 b6Var = this.e;
        if (obj == b6Var) {
            i(true);
            View[] viewPages2 = aVar.getViewPages();
            int length2 = viewPages2.length;
            while (i13 < length2) {
                View view2 = viewPages2[i13];
                if (view2 instanceof r) {
                    r rVar = (r) view2;
                    if (rVar.a == b6Var) {
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
        b6 b6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (b6Var = ((r) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = b6Var.i;
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
            b6 b6Var = ((r) currentView).a;
            if (b6Var != null) {
                ArrayList arrayList = b6Var.i;
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
        b6 b6Var;
        a aVar = this.n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof r) || (b6Var = ((r) view).a) == null) {
            return null;
        }
        return b6Var.E;
    }

    public b6 getCurrentList() {
        b6 b6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (b6Var = ((r) currentView).a) == null) {
            return null;
        }
        return b6Var;
    }

    public zk0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof r) {
            return ((r) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        b6 b6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (b6Var = ((r) currentView).a) == null) {
            return 0;
        }
        return b6Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        b6 b6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof r) || (b6Var = ((r) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = b6Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (c((MessageObject) arrayList.get(i10))) {
                g((MessageObject) arrayList.get(i10));
            }
        }
    }

    public final void i(boolean z10) {
        b6 b6Var;
        z7 z7Var;
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
                if (r6Var != null && (z7Var = r6Var.c) != null && z7Var.J0 == j10 && !TextUtils.isEmpty(z7Var.K0) && !arrayList.contains(z7Var.K0)) {
                    arrayList.add(z7Var.K0);
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
                    b6Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((b6) arrayList4.get(i13)).E, str2)) {
                        b6Var = (b6) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                }
            }
            if (b6Var == null) {
                b6 b6Var2 = new b6(this.b, this.d, str2, null);
                b6Var2.H(null);
                b6Var = b6Var2;
            }
            arrayList3.add(b6Var);
        }
        a aVar = this.n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(y1.i(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        cq cqVar = new cq(R.drawable.msg_filled_plus, 0);
        cqVar.setScale(0.9f, 0.9f);
        cqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(cqVar, 0, 1, 33);
        o71 o71Var = this.r;
        o71Var.a(-1, spannableString);
        o71Var.x.l();
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
                o71Var.setTranslationY(AndroidUtilities.dp(z11 ? 0.0f : -42.0f));
                aVar.setTranslationY(AndroidUtilities.dp(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z11 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ag.u(this, 27));
            this.x.addListener(new ag.x(7, this, z11));
            this.x.setDuration(320L);
            this.x.setInterpolator(er.h);
            this.x.start();
        }
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof r) {
            r rVar = (r) currentView;
            j jVar = rVar.f;
            for (int i10 = 0; i10 < jVar.getChildCount(); i10++) {
                View childAt = jVar.getChildAt(i10);
                if (childAt instanceof o7) {
                    o7 o7Var = (o7) childAt;
                    o7Var.i(rVar.S.c(o7Var.getMessageObject()), true);
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
