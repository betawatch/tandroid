package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.g7;
import bi.p5;
import c8.ma;
import di.i4;
import di.v6;
import fi.a6;
import fi.o6;
import fi.p6;
import hi.c7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public abstract class q extends FrameLayout implements b6, gs {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final g2 a;
    public final int b;
    public final h6 c;
    public final long d;
    public final a6 e;
    public final ArrayList f;
    public final ArrayList h;
    public final p5 n;
    public final i71 r;
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
        this.E = Utilities.j(cz.u1, 6, 2);
        this.a = g2Var;
        int currentAccount = g2Var.getCurrentAccount();
        this.b = currentAccount;
        h6 resourceProvider = g2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j3;
        setBackgroundColor(m6.w(m6.w0(m6.d6, resourceProvider), m6.r1(0.04f, m6.w0(m6.G6, resourceProvider))));
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
        fq0 fq0Var = (fq0) this;
        p5 p5Var = new p5(fq0Var, context);
        this.n = p5Var;
        p5Var.setAllowDisallowInterceptTouch(true);
        p5Var.setAdapter(new i4(1, context, fq0Var));
        addView(p5Var, ma.e(-1, -1, ls.E1));
        i71 i7 = p5Var.i(9, true);
        this.r = i7;
        i7.r = 12;
        i7.setPreTabClick(new v6(fq0Var, 14));
        addView(i7, ma.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        g2 g2Var = this.a;
        if (g2Var == null || g2Var.getParentActivity() == null) {
            return;
        }
        ui uiVar = new ui(g2Var.getParentActivity(), this.a, false, false, false, this.c);
        uiVar.z1(1, false);
        uiVar.R2 = true;
        uiVar.Q2 = false;
        uiVar.h3.setText(hd.N0(2131752109, null));
        uiVar.e2.i0();
        uiVar.X3 = new a0(this, uiVar, str);
        uiVar.f1();
        uiVar.show();
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
            deletepreviewmedia.bot = np.u1(i10).q1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((gj) arrayList2.get(i11)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(np.l5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.e(-1, 0);
    }

    public abstract boolean c(gj gjVar);

    public final boolean d() {
        a6 a6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (a6Var = ((m) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = a6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((gj) arrayList.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.A5;
        p5 p5Var = this.n;
        int i12 = 0;
        if (i7 != i11) {
            if (i7 == ls.y5) {
                i(true);
                View[] viewPages = p5Var.getViewPages();
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
            View[] viewPages2 = p5Var.getViewPages();
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
            View[] viewPages3 = p5Var.getViewPages();
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

    public abstract boolean e(gj gjVar);

    public final void f() {
        a6 a6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (a6Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = a6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((gj) arrayList.get(i7))) {
                e((gj) arrayList.get(i7));
            }
        }
    }

    public abstract boolean g(gj gjVar);

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
                    gj gjVar = (gj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = gjVar.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (gj.K4(messageMedia.document)) {
                            i10++;
                        } else if (gjVar.l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return hd.N0(2131753002, null);
            }
            if (i7 > 0) {
                sb2.append(hd.G(i7, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        a6 a6Var;
        p5 p5Var = this.n;
        View[] viewPages = p5Var.getViewPages();
        if (Math.abs(p5Var.getCurrentPosition() - p5Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
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
            if (c((gj) arrayList.get(i7))) {
                g((gj) arrayList.get(i7));
            }
        }
    }

    public final void i(boolean z10) {
        a6 a6Var;
        c7 c7Var;
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
        p6 R1 = np.u1(this.b).R1();
        long j3 = this.d;
        ArrayList F2 = R1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                o6 o6Var = (o6) obj2;
                if (o6Var != null && (c7Var = o6Var.c) != null && c7Var.J0 == j3 && !TextUtils.isEmpty(c7Var.K0) && !arrayList.contains(c7Var.K0)) {
                    arrayList.add(c7Var.K0);
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
        p5 p5Var = this.n;
        p5Var.j(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746515, null, new StringBuilder("+ ")));
        nq nqVar = new nq(R.drawable.msg_filled_plus, 0);
        nqVar.I = 0.9f;
        nqVar.J = 0.9f;
        nqVar.H = 0.85f;
        spannableString.setSpan(nqVar, 0, 1, 33);
        i71 i71Var = this.r;
        i71Var.a(-1, spannableString);
        i71Var.y.f();
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
                i71Var.setTranslationY(g0.L(z11 ? 0.0f : -42.0f));
                p5Var.setTranslationY(g0.L(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z11 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 25));
            this.y.addListener(new g7(5, this, z11));
            this.y.setDuration(320L);
            this.y.setInterpolator(nr.h);
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
                if (childAt instanceof p7) {
                    p7 p7Var = (p7) childAt;
                    p7Var.i(mVar.a0.c(p7Var.getMessageObject()), true);
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
        ls.f(i7).c(this, ls.A5);
        ls.f(i7).c(this, ls.y5);
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
        ls.f(i7).n(this, ls.A5);
        ls.f(i7).n(this, ls.y5);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        h6 h6Var = this.c;
        try {
            setBackgroundColor(m6.w(m6.w0(m6.d6, h6Var), m6.r1(0.04f, m6.w0(m6.G6, h6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
