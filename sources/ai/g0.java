package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.r9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yi;
import w7.a6;
import zh.h5;
import zh.i5;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class g0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final p2 a;
    public final int b;
    public final f6 c;
    public final long d;
    public final s4 e;
    public final ArrayList f;
    public final ArrayList h;
    public final c n;
    public final u81 r;
    public Boolean s;
    public int v;
    public float w;
    public ValueAnimator x;
    public int y;

    public g0(Context context, p2 p2Var, long j3) {
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
        this.d = j3;
        setBackgroundColor(j6.v(j6.v0(j6.d6, resourceProvider), j6.l1(0.04f, j6.v0(j6.G6, resourceProvider))));
        if (F == null) {
            F = new LongSparseArray();
        }
        long j10 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) F.get(j10);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = F;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        s4 s4Var = (s4) longSparseArray.get(j3);
        if (s4Var == null) {
            s4 s4Var2 = new s4(currentAccount, j3, "", null);
            longSparseArray.put(j3, s4Var2);
            s4Var = s4Var2;
        }
        this.e = s4Var;
        vr0 vr0Var = (vr0) this;
        c cVar = new c(vr0Var, context);
        this.n = cVar;
        cVar.setAllowDisallowInterceptTouch(true);
        cVar.setAdapter(new d(vr0Var, context));
        addView(cVar, a6.e(-1, -1, 119));
        u81 n10 = cVar.n(9, true);
        this.r = n10;
        n10.r = 12;
        n10.setPreTabClick(new a1.c(vr0Var, 2));
        addView(n10, a6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        p2 p2Var = this.a;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        yi yiVar = new yi(p2Var.getParentActivity(), this.a, false, false, false, this.c);
        yiVar.J1(1, false);
        yiVar.T0 = true;
        yiVar.S0 = false;
        yiVar.j1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
        yiVar.j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            AndroidUtilities.hideKeyboard(p2Var.getFragmentView().findFocus());
        }
        yiVar.Z1 = new f(this, yiVar, str);
        yiVar.r1();
        yiVar.show();
    }

    public final void b(String str) {
        s4 s4Var;
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
                s4Var = null;
                break;
            }
            s4Var = (s4) arrayList.get(i10);
            if (s4Var != null && TextUtils.equals(s4Var.E, str)) {
                break;
            } else {
                i10++;
            }
        }
        if (s4Var != null) {
            ArrayList arrayList2 = s4Var.i;
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
        s4 s4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof a0) || (s4Var = ((a0) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = s4Var.i;
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
        c cVar = this.n;
        int i13 = 0;
        if (i10 != i12) {
            if (i10 == NotificationCenter.storiesUpdated) {
                i(true);
                View[] viewPages = cVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof a0) {
                        ((a0) view).v.l();
                    }
                    i13++;
                }
                return;
            }
            return;
        }
        Object obj = objArr[0];
        s4 s4Var = this.e;
        if (obj == s4Var) {
            i(true);
            View[] viewPages2 = cVar.getViewPages();
            int length2 = viewPages2.length;
            while (i13 < length2) {
                View view2 = viewPages2[i13];
                if (view2 instanceof a0) {
                    a0 a0Var = (a0) view2;
                    if (a0Var.a == s4Var) {
                        a0Var.v.l();
                    }
                }
                i13++;
            }
            return;
        }
        if (this.f.indexOf(obj) >= 0) {
            View[] viewPages3 = cVar.getViewPages();
            for (View view3 : viewPages3) {
                if (view3 instanceof a0) {
                    a0 a0Var2 = (a0) view3;
                    if (a0Var2.a == objArr[0]) {
                        a0Var2.v.l();
                    }
                }
            }
        }
    }

    public abstract boolean e(MessageObject messageObject);

    public final void f() {
        s4 s4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof a0) || (s4Var = ((a0) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = s4Var.i;
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
        if (currentView instanceof a0) {
            s4 s4Var = ((a0) currentView).a;
            if (s4Var != null) {
                ArrayList arrayList = s4Var.i;
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
        s4 s4Var;
        c cVar = this.n;
        View[] viewPages = cVar.getViewPages();
        if (Math.abs(cVar.getCurrentPosition() - cVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof a0) || (s4Var = ((a0) view).a) == null) {
            return null;
        }
        return s4Var.E;
    }

    public s4 getCurrentList() {
        s4 s4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof a0) || (s4Var = ((a0) currentView).a) == null) {
            return null;
        }
        return s4Var;
    }

    public vl0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof a0) {
            return ((a0) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        s4 s4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof a0) || (s4Var = ((a0) currentView).a) == null) {
            return 0;
        }
        return s4Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        s4 s4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof a0) || (s4Var = ((a0) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = s4Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (c((MessageObject) arrayList.get(i10))) {
                g((MessageObject) arrayList.get(i10));
            }
        }
    }

    public final void i(boolean z10) {
        s4 s4Var;
        r9 r9Var;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        i5 storiesController = MessagesController.getInstance(this.b).getStoriesController();
        long j3 = this.d;
        ArrayList E2 = storiesController.E(j3);
        if (E2 != null) {
            int size2 = E2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = E2.get(i12);
                i12++;
                h5 h5Var = (h5) obj2;
                if (h5Var != null && (r9Var = h5Var.c) != null && r9Var.J0 == j3 && !TextUtils.isEmpty(r9Var.K0) && !arrayList.contains(r9Var.K0)) {
                    arrayList.add(r9Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            String str2 = (String) obj3;
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList4.size()) {
                    s4Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((s4) arrayList4.get(i14)).E, str2)) {
                        s4Var = (s4) arrayList4.get(i14);
                        break;
                    }
                    i14++;
                }
            }
            if (s4Var == null) {
                s4 s4Var2 = new s4(this.b, this.d, str2, null);
                s4Var2.H(null);
                s4Var = s4Var2;
            }
            arrayList3.add(s4Var);
        }
        c cVar = this.n;
        cVar.o(true);
        SpannableString spannableString = new SpannableString(a2.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        uq uqVar = new uq(R.drawable.msg_filled_plus, 0);
        uqVar.setScale(0.9f, 0.9f);
        uqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(uqVar, 0, 1, 33);
        u81 u81Var = this.r;
        u81Var.a(-1, spannableString);
        u81Var.x.l();
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
                u81Var.setTranslationY(AndroidUtilities.dp(z11 ? 0.0f : -42.0f));
                cVar.setTranslationY(AndroidUtilities.dp(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z11 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new a(this, i10));
            this.x.addListener(new e(i10, this, z11));
            this.x.setDuration(320L);
            this.x.setInterpolator(wr.h);
            this.x.start();
        }
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof a0) {
            a0 a0Var = (a0) currentView;
            o oVar = a0Var.f;
            for (int i10 = 0; i10 < oVar.getChildCount(); i10++) {
                View childAt = oVar.getChildAt(i10);
                if (childAt instanceof u7) {
                    u7 u7Var = (u7) childAt;
                    u7Var.i(a0Var.W.c(u7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i10 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = new LongSparseArray();
            E.put(i10, longSparseArray3);
            longSparseArray2 = longSparseArray3;
        }
        longSparseArray2.put(this.d, this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
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
                if (view instanceof a0) {
                    ((a0) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
