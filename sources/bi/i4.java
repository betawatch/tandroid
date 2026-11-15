package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.i9;
import c8.ja;
import c8.na;
import di.j8;
import di.l8;
import di.u8;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eh0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class i4 extends FrameLayout implements is {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final fp G;
    public final FrameLayout H;
    public int I;
    public m60 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public ri.q O;
    public boolean P;
    public int Q;
    public final t2 R;
    public final te.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.e2 a;
    public final int b;
    public final long c;
    public final l8 d;
    public final j8 e;
    public final org.telegram.ui.ActionBar.e6 f;
    public final f3 h;
    public final v61 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final hi.d x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i4(org.telegram.ui.ActionBar.e2 e2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, dh.c cVar) {
        super(context);
        String str;
        int i10;
        String str2;
        this.I = -1;
        wp0 wp0Var = (wp0) this;
        int i11 = 0;
        this.R = new t2(wp0Var, i11);
        this.S = new te.a(0, new z2(wp0Var), er.h, 380L, true);
        this.U = org.telegram.messenger.g0.q.y;
        this.a = e2Var;
        this.b = i7;
        if (org.telegram.messenger.m5.C(j3)) {
            TLRPC.EncryptedChat a12 = np.s1(i7).a1(Integer.valueOf((int) (4294967295L & j3)));
            if (a12 != null) {
                this.c = a12.user_id;
            } else {
                this.c = j3;
            }
        } else {
            this.c = j3;
        }
        u8.y(i7, false).P(this.c);
        int i12 = 1;
        l8 G = u8.y(i7, false).G(this.c, true);
        this.d = G;
        j8 F = u8.y(i7, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).v1) {
            G.g = 4;
            G.e = true;
            G.j(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.j(true);
        }
        G.a();
        this.f = e6Var;
        f3 f3Var = new f3(wp0Var, context, e2Var, i11);
        this.h = f3Var;
        f3Var.setAllowDisallowInterceptTouch(true);
        f3Var.setAdapter(new g3(wp0Var, i7, e6Var));
        addView(f3Var, ja.e(-1, -1, ns.E1));
        v61 i13 = f3Var.i(10, true);
        this.n = i13;
        i13.g(org.telegram.ui.ActionBar.j6.xi, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.vi, org.telegram.ui.ActionBar.j6.yi, org.telegram.ui.ActionBar.j6.s8);
        i13.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i13.setClipToPadding(false);
        i13.r = 12;
        i13.setPreTabClick(new z2(wp0Var));
        i13.setOnTabLongClick(new b3(wp0Var, i7, e2Var, context, e6Var, 0));
        addView(i13, ja.e(-1, 42, 48));
        eh0 eh0Var = new eh0(context);
        fh.g c10 = cVar.c(eh0Var, new gh.b(org.telegram.ui.ActionBar.j6.d6, e6Var), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        eh0Var.setBackground(c10);
        na.b(eh0Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e10 = ja.e(-1, 60, 87);
        e10.bottomMargin += org.telegram.messenger.g0.n;
        addView(frameLayout, e10);
        frameLayout.addView(eh0Var, ja.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 24, 24);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(linearLayout, a02, null, M, e6Var);
        fp fpVar = new fp(24, context, e6Var);
        this.G = fpVar;
        fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        fpVar.setDrawUnchecked(true);
        fpVar.a(false, false);
        fpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(fpVar, ja.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.F = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var);
        i5.c.w(textView, 1, 14.0f, null, 2131750257);
        linearLayout.addView(textView, ja.t(-2, -2, 16, 9, 0, 0, 0));
        eh0Var.addView(linearLayout, ja.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        na.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new x2(wp0Var, e2Var, i7, i12));
        Boolean bool = G.h;
        if (bool != null) {
            fpVar.a(bool.booleanValue(), false);
        }
        TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(a22 == null || q10.B(a22) || q10.t(a22));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j10 = this.c;
            if (j10 >= 0) {
                str2 = hd.a0(null, null, 2131746666, org.telegram.messenger.m5.t(j10));
                sb2.append(str2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new eq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(i5.c.k(2131746675, null, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new eq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                hi.d dVar = new hi.d(context, e6Var, true);
                this.x = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                dVar.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                dVar.i(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                eh0Var.addView(dVar, ja.e(-2, -1, 17));
                eh0Var.setOnClickListener(new c3(wp0Var, z10, i7, 0));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(!d() ? 0 : 8);
                this.y = 60;
                addView(frameLayout2, ja.e(-1, ns.e3, 87));
                m();
                o();
            }
            i10 = 2131746667;
            str = null;
        } else {
            str = null;
            i10 = 2131746668;
        }
        str2 = hd.M0(i10, str);
        sb2.append(str2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new eq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(i5.c.k(2131746675, null, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new eq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        hi.d dVar2 = new hi.d(context, e6Var, true);
        this.x = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar2.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
        dVar2.i(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        eh0Var.addView(dVar2, ja.e(-2, -1, 17));
        eh0Var.setOnClickListener(new c3(wp0Var, z10, i7, 0));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(!d() ? 0 : 8);
        this.y = 60;
        addView(frameLayout2, ja.e(-1, ns.e3, 87));
        m();
        o();
    }

    public static void j(org.telegram.ui.ActionBar.z0 z0Var, l8 l8Var, Runnable runnable, int i7) {
        z0Var.setOnClickListener(new x2(l8Var, i7, runnable, 0));
        z0Var.setOnLongClickListener(new y2(l8Var, i7, runnable));
    }

    public final void a() {
        l8 l8Var;
        c4 currentPage = getCurrentPage();
        if (currentPage == null || (l8Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i7 = l8Var.d;
        new e6(this.a, this.c, i7, new w2(this, i7, currentPage, 0)).show();
    }

    public final boolean b() {
        j8 j8Var = this.e;
        return j8Var.h() && j8Var.d().size() < ((org.telegram.messenger.j0) np.s1(this.b).y7.t.b).c;
    }

    public final boolean c() {
        long j3 = this.c;
        int i7 = this.b;
        return j3 >= 0 ? j3 == 0 || j3 == m10.i(i7).e() : org.telegram.messenger.t3.w(5, np.s1(i7).M0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.G3;
        LinearLayout linearLayout = this.E;
        hi.d dVar = this.x;
        long j3 = this.c;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() != j3) {
                return;
            }
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.y = 60;
            Boolean bool = this.d.h;
            if (bool != null) {
                this.G.a(bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i7 == ns.H3) {
            if (((Long) objArr[0]).longValue() != j3) {
                return;
            }
            f(true);
            o();
            return;
        }
        if (i7 == ns.r) {
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.y = 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q <= 0) {
            return;
        }
        ArrayList d = this.e.d();
        int i7 = 0;
        while (true) {
            if (i7 >= d.size()) {
                i7 = -1;
                tL_starGiftCollection = null;
                break;
            } else {
                if (((TL_stars.TL_starGiftCollection) d.get(i7)).collection_id == this.Q) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i7);
                    break;
                }
                i7++;
            }
        }
        if (i7 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.Q = 0;
        this.n.d(tL_starGiftCollection.collection_id, i7 + 1);
    }

    public final void f(boolean z10) {
        f3 f3Var = this.h;
        if (f3Var == null || this.n == null) {
            return;
        }
        f3Var.k(z10);
        e();
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        c4 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.k5.z(this.y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-r0.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.y));
        }
        return (int) (org.telegram.messenger.g0.L(this.y) - translationY);
    }

    public l8 getCurrentList() {
        c4 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public uj0 getCurrentListView() {
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public c4 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (c4) currentView;
    }

    public int getGiftsCount() {
        int i7;
        l8 l8Var;
        int i10;
        c4 currentPage = getCurrentPage();
        l8 l8Var2 = this.d;
        if (currentPage == null || (l8Var = currentPage.e) == l8Var2) {
            if (l8Var2 != null && (i7 = l8Var2.n) > 0) {
                return i7;
            }
        } else if (l8Var != null && (i10 = l8Var.n) > 0) {
            return i10;
        }
        long j3 = this.c;
        int i11 = this.b;
        if (j3 >= 0) {
            TLRPC.UserFull b22 = np.s1(i11).b2(j3);
            if (b22 != null) {
                return b22.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull N0 = np.s1(i11).N0(-j3);
        if (N0 != null) {
            return N0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        l8 l8Var = this.d;
        if (l8Var != null && !l8Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < l8Var.l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) l8Var.l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        f3 f3Var = this.h;
        float f10 = 0.0f;
        if (f3Var.getViewPages() != null) {
            for (View view : f3Var.getViewPages()) {
                if (view instanceof c4) {
                    f10 = (((c4) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        v61 v61Var = this.n;
        if (v61Var != null) {
            return v61Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, z10 z10Var) {
        i60 i60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i7 = 1;
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        int i10 = 0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (str != null) {
            t1Var.S = hd.M0(2131750215, null);
        } else {
            t1Var.S = hd.M0(2131750095, null);
            t1Var.U = hd.M0(2131750096, null);
        }
        j3 j3Var = new j3(this, context, e6Var);
        j3Var.s0 = true;
        j3Var.setOnEditorActionListener(new k3(j3Var, z10Var, t1VarArr, currentFocus, 0));
        si.b0(this.b).M(org.telegram.messenger.g0.G0(), true);
        j3Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(j3Var, org.telegram.ui.ActionBar.j6.j5, e6Var);
        org.telegram.ui.ActionBar.q6.l(j3Var, 34, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        j3Var.setHintText(hd.M0(2131750097, null));
        j3Var.setFocusable(true);
        j3Var.setInputType(147457);
        org.telegram.ui.ActionBar.q6.F(j3Var, org.telegram.ui.ActionBar.j6.k6, org.telegram.ui.ActionBar.j6.l6, org.telegram.ui.ActionBar.j6.p7, e6Var);
        j3Var.setImeOptions(6);
        j3Var.setBackgroundDrawable(null);
        j3Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        j3Var.addTextChangedListener(new l3(i10, j3Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j3Var.setText(str);
        linearLayout.addView(j3Var, ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.k(hd.M0(str != null ? 2131751335 : 2131751753, null), new ab.g(4, j3Var, z10Var));
        alertDialog$Builder.h(hd.M0(2131752589, null), new a3.l(20));
        t1VarArr[0] = t1Var;
        m60 m60Var = this.J;
        if (m60Var != null && (i60Var = m60Var.m) != null) {
            i60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Z2(W, this.a.getClassGuid());
        t1VarArr[0].setOnDismissListener(new k(this, j3Var, W, i7));
        t1VarArr[0].setOnShowListener(new l(j3Var, i7));
        t1VarArr[0].show();
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.k0 = false;
        t1Var2.d(-1);
        j3Var.setSelection(j3Var.getText().length());
    }

    public final void i() {
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i7) {
        if (i7 == 0) {
            return false;
        }
        int i10 = i7 - 1;
        if (i10 >= 0) {
            j8 j8Var = this.e;
            if (i10 < j8Var.d().size()) {
                l8 e10 = (i10 < 0 || i10 >= j8Var.d().size()) ? null : j8Var.e(((TL_stars.TL_starGiftCollection) j8Var.d().get(i10)).collection_id);
                if (e10 != null) {
                    return e10.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        cb cbVar;
        f3 f3Var = this.h;
        if (f3Var == null) {
            return;
        }
        if (f3Var.getCurrentPosition() == f3Var.getNextPosition()) {
            nextPositionAlpha = k(f3Var.getCurrentPosition()) ? 1.0f : 0.0f;
        } else {
            nextPositionAlpha = (f3Var.getNextPositionAlpha() * (k(f3Var.getNextPosition()) ? 1.0f : 0.0f)) + (f3Var.getCurrentPositionAlpha() * (k(f3Var.getCurrentPosition()) ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout = this.r;
        float z10 = org.telegram.messenger.k5.z(this.y, (-frameLayout.getTop()) + this.U, 1);
        float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z10;
        boolean z11 = this.U > org.telegram.messenger.g0.L(184.0f);
        te.a aVar = this.S;
        aVar.a(z11, true);
        float f10 = aVar.e;
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z10, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z10, f10);
        float f11 = (1.0f - nextPositionAlpha) * f10;
        this.H.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f10) - org.telegram.messenger.g0.L(200.0f));
        frameLayout.setTranslationY(T1 - this.T);
        frameLayout.setAlpha(f11);
        frameLayout.setVisibility(f11 <= 0.0f ? 4 : 0);
        this.x.i((!this.e.h() || f3Var.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
        xb xbVar = xb.w;
        if (xbVar == null || (cbVar = xbVar.e) == null) {
            return;
        }
        cbVar.updatePosition();
    }

    public final void m() {
        hi.d dVar = this.x;
        dVar.updateColors();
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        int h12 = ((wp0) this).W.h1(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        if (!(dVar.getBackground() instanceof ShapeDrawable)) {
            dVar.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(19.0f), h12));
        } else if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != h12) {
            org.telegram.ui.ActionBar.j6.C1(h12, dVar.getBackground());
            dVar.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    c4 c4Var = (c4) view;
                    org.telegram.ui.ActionBar.e6 e6Var2 = c4Var.c;
                    if (c4Var.r != null) {
                        c4Var.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var2));
                        c4Var.x.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var2));
                    } else {
                        c4Var.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var2));
                        c4Var.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, e6Var2));
                        c4Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.j5, e6Var));
    }

    public final void n() {
        for (View view : this.h.getViewPages()) {
            if (view instanceof c4) {
                c4 c4Var = (c4) view;
                v3 v3Var = c4Var.f;
                int paddingTop = v3Var.getPaddingTop();
                c4Var.g();
                int paddingTop2 = paddingTop - v3Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(v3Var, new d3(c4Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10 = !this.e.d().isEmpty() || b();
        f3 f3Var = this.h;
        if (f3Var.getViewPages() != null) {
            for (View view : f3Var.getViewPages()) {
                if (view instanceof c4) {
                    ((c4) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.b;
        ns.f(i7).c(this, ns.G3);
        ns.f(i7).c(this, ns.H3);
        ns.f(i7).c(this, ns.r);
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        l8 l8Var = this.d;
        if (l8Var != null) {
            l8Var.o = true;
            l8Var.a();
        }
        j8 j8Var = this.e;
        if (j8Var != null) {
            j8Var.j = true;
            j8Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c4 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.b;
        ns.f(i7).n(this, ns.G3);
        ns.f(i7).n(this, ns.H3);
        ns.f(i7).n(this, ns.r);
        l8 l8Var = this.d;
        if (l8Var != null) {
            l8Var.o = false;
        }
        j8 j8Var = this.e;
        if (j8Var != null) {
            j8Var.j = false;
        }
    }

    public final void p() {
        float f10;
        v61 v61Var = this.n;
        if (v61Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        v61Var.setTranslationY(min);
        v61Var.setScaleX(T1);
        v61Var.setScaleY(T1);
        f3 f3Var = this.h;
        if (f3Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : f3Var.getViewPages()) {
                if (view instanceof c4) {
                    f10 += ((c4) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        v61Var.setAlpha(i9.a(f10, 0.0f, 1.0f) * l10);
    }

    public abstract void q(boolean z10);

    public void setButtonOffset(int i7) {
        if (this.T != i7) {
            this.T = i7;
            l();
        }
    }

    public void setGlassEngine(ri.q qVar) {
        this.O = qVar;
        f3 f3Var = this.h;
        qVar.c(f3Var);
        for (View view : f3Var.getViewPages()) {
            if (view instanceof c4) {
                qVar.b(((c4) view).f);
            }
        }
    }

    public void setPaddingTop(int i7) {
        if (this.L != i7) {
            this.L = i7;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z10) {
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        q(g());
        this.n.setReordering(z10);
        if (z10) {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.W4(false);
                org.telegram.messenger.g0.h3(new e3(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        t2 t2Var = this.R;
        org.telegram.messenger.g0.r(t2Var);
        org.telegram.messenger.g0.h3(t2Var);
    }

    public void setVisibleHeight(int i7) {
        this.U = i7;
        l();
        f3 f3Var = this.h;
        if (f3Var != null) {
            for (View view : f3Var.getViewPages()) {
                if (view instanceof c4) {
                    ((c4) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
