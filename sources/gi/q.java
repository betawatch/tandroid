package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.j7;
import bi.s5;
import c8.na;
import di.i4;
import di.v6;
import fi.a6;
import fi.o6;
import fi.p6;
import hi.x7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class q extends FrameLayout implements c6, fs {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final g2 a;
    public final int b;
    public final i6 c;
    public final long d;
    public final a6 e;
    public final ArrayList f;
    public final ArrayList h;
    public final s5 n;
    public final j71 r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public q(Context context, g2 g2Var, long j3) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = g0.q.y;
        this.E = Utilities.j(bz.u1, 6, 2);
        this.a = g2Var;
        int currentAccount = g2Var.getCurrentAccount();
        this.b = currentAccount;
        i6 resourceProvider = g2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j3;
        setBackgroundColor(n6.w(n6.w0(n6.d6, resourceProvider), n6.r1(0.04f, n6.w0(n6.G6, resourceProvider))));
        if (G == null) {
            G = new LongSparseArray();
        }
        long j10 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) G.get(j10);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = G;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        a6 a6Var = (a6) longSparseArray.get(j3);
        if (a6Var == null) {
            a6 a6Var2 = new a6(currentAccount, j3, "", null);
            longSparseArray.put(j3, a6Var2);
            a6Var = a6Var2;
        }
        this.e = a6Var;
        eq0 eq0Var = (eq0) this;
        s5 s5Var = new s5(eq0Var, context);
        this.n = s5Var;
        s5Var.setAllowDisallowInterceptTouch(true);
        s5Var.setAdapter(new i4(1, context, eq0Var));
        addView(s5Var, na.e(-1, -1, ks.E1));
        j71 k10 = s5Var.k(9, true);
        this.r = k10;
        k10.r = 12;
        k10.setPreTabClick(new v6(eq0Var, 14));
        addView(k10, na.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        g2 g2Var = this.a;
        if (g2Var == null || g2Var.getParentActivity() == null) {
            return;
        }
        ti tiVar = new ti(g2Var.getParentActivity(), this.a, false, false, false, this.c);
        tiVar.z1(1, false);
        tiVar.R2 = true;
        tiVar.Q2 = false;
        tiVar.h3.setText(gd.N0(2131752109, null));
        tiVar.e2.i0();
        tiVar.X3 = new a0(this, tiVar, str);
        tiVar.f1();
        tiVar.show();
    }

    public final void b(String str) {
        a6 a6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i7 >= arrayList.size()) {
                a6Var = null;
                break;
            }
            a6Var = (a6) arrayList.get(i7);
            if (a6Var != null && TextUtils.equals(a6Var.E, str)) {
                break;
            } else {
                i7++;
            }
        }
        if (a6Var != null) {
            ArrayList arrayList2 = a6Var.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.b;
            deletepreviewmedia.bot = mp.u1(i10).q1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((fj) arrayList2.get(i11)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(mp.l5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.e(-1, 0);
    }

    public abstract boolean c(fj fjVar);

    public final boolean d() {
        a6 a6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (a6Var = ((m) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = a6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((fj) arrayList.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.A5;
        s5 s5Var = this.n;
        int i12 = 0;
        if (i7 != i11) {
            if (i7 == ks.y5) {
                i(true);
                View[] viewPages = s5Var.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof m) {
                        ((m) view).w.f();
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        Object obj = objArr[0];
        a6 a6Var = this.e;
        if (obj == a6Var) {
            i(true);
            View[] viewPages2 = s5Var.getViewPages();
            int length2 = viewPages2.length;
            while (i12 < length2) {
                View view2 = viewPages2[i12];
                if (view2 instanceof m) {
                    m mVar = (m) view2;
                    if (mVar.a == a6Var) {
                        mVar.w.f();
                    }
                }
                i12++;
            }
            return;
        }
        if (this.f.indexOf(obj) >= 0) {
            View[] viewPages3 = s5Var.getViewPages();
            for (View view3 : viewPages3) {
                if (view3 instanceof m) {
                    m mVar2 = (m) view3;
                    if (mVar2.a == objArr[0]) {
                        mVar2.w.f();
                    }
                }
            }
        }
    }

    public abstract boolean e(fj fjVar);

    public final void f() {
        a6 a6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (a6Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = a6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((fj) arrayList.get(i7))) {
                e((fj) arrayList.get(i7));
            }
        }
    }

    public abstract boolean g(fj fjVar);

    public String getBotPreviewsSubtitle() {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            a6 a6Var = ((m) currentView).a;
            if (a6Var != null) {
                ArrayList arrayList = a6Var.i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    fj fjVar = (fj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = fjVar.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (fj.K4(messageMedia.document)) {
                            i10++;
                        } else if (fjVar.l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return gd.N0(2131753002, null);
            }
            if (i7 > 0) {
                sb2.append(gd.G(i7, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(gd.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        a6 a6Var;
        s5 s5Var = this.n;
        View[] viewPages = s5Var.getViewPages();
        if (Math.abs(s5Var.getCurrentPosition() - s5Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof m) || (a6Var = ((m) view).a) == null) {
            return null;
        }
        return a6Var.E;
    }

    public a6 getCurrentList() {
        a6 a6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (a6Var = ((m) currentView).a) == null) {
            return null;
        }
        return a6Var;
    }

    public ek0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        a6 a6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (a6Var = ((m) currentView).a) == null) {
            return 0;
        }
        return a6Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        a6 a6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (a6Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = a6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (c((fj) arrayList.get(i7))) {
                g((fj) arrayList.get(i7));
            }
        }
    }

    public final void i(boolean z10) {
        a6 a6Var;
        x7 x7Var;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        p6 R1 = mp.u1(this.b).R1();
        long j3 = this.d;
        ArrayList F2 = R1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                o6 o6Var = (o6) obj2;
                if (o6Var != null && (x7Var = o6Var.c) != null && x7Var.J0 == j3 && !TextUtils.isEmpty(x7Var.K0) && !arrayList.contains(x7Var.K0)) {
                    arrayList.add(x7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            String str2 = (String) obj3;
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList4.size()) {
                    a6Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((a6) arrayList4.get(i12)).E, str2)) {
                        a6Var = (a6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (a6Var == null) {
                a6 a6Var2 = new a6(this.b, this.d, str2, null);
                a6Var2.H(null);
                a6Var = a6Var2;
            }
            arrayList3.add(a6Var);
        }
        s5 s5Var = this.n;
        s5Var.l(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746515, null, new StringBuilder("+ ")));
        kq kqVar = new kq(R.drawable.msg_filled_plus, 0);
        kqVar.I = 0.9f;
        kqVar.J = 0.9f;
        kqVar.H = 0.85f;
        spannableString.setSpan(kqVar, 0, 1, 33);
        j71 j71Var = this.r;
        j71Var.a(-1, spannableString);
        j71Var.y.f();
        boolean z11 = arrayList3.size() + 1 > 1;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z11) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.s = Boolean.valueOf(z11);
            if (!z10) {
                this.x = z11 ? 1.0f : 0.0f;
                j71Var.setTranslationY(g0.L(z11 ? 0.0f : -42.0f));
                s5Var.setTranslationY(g0.L(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z11 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 25));
            this.y.addListener(new j7(5, this, z11));
            this.y.setDuration(320L);
            this.y.setInterpolator(kr.h);
            this.y.start();
        }
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            m mVar = (m) currentView;
            e eVar = mVar.f;
            for (int i7 = 0; i7 < eVar.getChildCount(); i7++) {
                View childAt = eVar.getChildAt(i7);
                if (childAt instanceof o7) {
                    o7 o7Var = (o7) childAt;
                    o7Var.i(mVar.a0.c(o7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = F;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        ks.f(i7).c(this, ks.A5);
        ks.f(i7).c(this, ks.y5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        ks.f(i7).n(this, ks.A5);
        ks.f(i7).n(this, ks.y5);
    }

    public void setVisibleHeight(int i7) {
        this.w = i7;
        View[] viewPages = this.n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof m) {
                    ((m) view).setVisibleHeight(i7);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        i6 i6Var = this.c;
        try {
            setBackgroundColor(n6.w(n6.w0(n6.d6, i6Var), n6.r1(0.04f, n6.w0(n6.G6, i6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
