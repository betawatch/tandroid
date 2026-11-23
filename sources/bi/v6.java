package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.m9;
import c8.na;
import c8.sa;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class v6 extends FrameLayout implements fs {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final lp G;
    public final FrameLayout H;
    public int I;
    public x60 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public ri.q O;
    public boolean P;
    public int Q;
    public final h5 R;
    public final te.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.g2 a;
    public final int b;
    public final long c;
    public final di.p8 d;
    public final di.n8 e;
    public final org.telegram.ui.ActionBar.i6 f;
    public final s5 h;
    public final j71 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final hi.e x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v6(org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context);
        String str;
        int i10;
        String str2;
        this.I = -1;
        fq0 fq0Var = (fq0) this;
        int i11 = 0;
        this.R = new h5(fq0Var, i11);
        this.S = new te.a(0, new m5(fq0Var), kr.h, 380L, true);
        this.U = org.telegram.messenger.g0.q.y;
        this.a = g2Var;
        this.b = i7;
        if (org.telegram.messenger.n5.C(j3)) {
            TLRPC.EncryptedChat c12 = mp.u1(i7).c1(Integer.valueOf((int) (4294967295L & j3)));
            if (c12 != null) {
                this.c = c12.user_id;
            } else {
                this.c = j3;
            }
        } else {
            this.c = j3;
        }
        di.y8.y(i7, false).O(this.c);
        int i12 = 1;
        di.p8 G = di.y8.y(i7, false).G(this.c, true);
        this.d = G;
        di.n8 F = di.y8.y(i7, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).v1) {
            G.g = 4;
            G.e = true;
            G.k(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.k(true);
        }
        G.a();
        this.f = i6Var;
        s5 s5Var = new s5(fq0Var, context, g2Var, i11);
        this.h = s5Var;
        s5Var.setAllowDisallowInterceptTouch(true);
        s5Var.setAdapter(new t5(fq0Var, i7, i6Var));
        addView(s5Var, na.e(-1, -1, ks.E1));
        j71 k10 = s5Var.k(10, true);
        this.n = k10;
        k10.h(org.telegram.ui.ActionBar.n6.xi, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.vi, org.telegram.ui.ActionBar.n6.yi, org.telegram.ui.ActionBar.n6.s8);
        k10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        k10.setClipToPadding(false);
        k10.r = 12;
        k10.setPreTabClick(new m5(fq0Var));
        k10.setOnTabLongClick(new o5(fq0Var, i7, g2Var, context, i6Var, 0));
        addView(k10, na.e(-1, 42, 48));
        gh0 gh0Var = new gh0(context);
        fh.g c10 = cVar.c(gh0Var, new gh.b(org.telegram.ui.ActionBar.n6.d6, i6Var), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        gh0Var.setBackground(c10);
        sa.b(gh0Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e10 = na.e(-1, 60, 87);
        e10.bottomMargin += org.telegram.messenger.g0.n;
        addView(frameLayout, e10);
        frameLayout.addView(gh0Var, na.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i13 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 24, 24);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M, i6Var);
        lp lpVar = new lp(24, context, i6Var);
        this.G = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.j7, org.telegram.ui.ActionBar.n6.k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(false, false);
        lpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(lpVar, na.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.F = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
        i5.c.r(14.0f, 1, 2131750240, textView, null);
        linearLayout.addView(textView, na.t(-2, -2, 16, 9, 0, 0, 0));
        gh0Var.addView(linearLayout, na.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        sa.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new k5(fq0Var, g2Var, i7, i12));
        Boolean bool = G.h;
        if (bool != null) {
            lpVar.a(bool.booleanValue(), false);
        }
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(c22 == null || n10.C(c22) || n10.u(c22));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j10 = this.c;
            if (j10 >= 0) {
                str2 = gd.a0(null, null, 2131746470, org.telegram.messenger.n5.t(j10));
                sb2.append(str2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new kq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(i5.c.k(2131746479, null, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new kq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                hi.e eVar = new hi.e(context, i6Var, true);
                this.x = eVar;
                eVar.setUseWrapContent(true);
                eVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                eVar.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                eVar.i(spannableStringBuilder, false, true);
                eVar.setStateListAnimator(null);
                gh0Var.addView(eVar, na.e(-2, -1, 17));
                gh0Var.setOnClickListener(new p5(fq0Var, z10, i7, 0));
                eVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(!d() ? 0 : 8);
                this.y = 60;
                addView(frameLayout2, na.e(-1, ks.e3, 87));
                m();
                o();
            }
            i10 = 2131746471;
            str = null;
        } else {
            str = null;
            i10 = 2131746472;
        }
        str2 = gd.N0(i10, str);
        sb2.append(str2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new kq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(i5.c.k(2131746479, null, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new kq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        hi.e eVar2 = new hi.e(context, i6Var, true);
        this.x = eVar2;
        eVar2.setUseWrapContent(true);
        eVar2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        eVar2.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
        eVar2.i(spannableStringBuilder3, false, true);
        eVar2.setStateListAnimator(null);
        gh0Var.addView(eVar2, na.e(-2, -1, 17));
        gh0Var.setOnClickListener(new p5(fq0Var, z10, i7, 0));
        eVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(!d() ? 0 : 8);
        this.y = 60;
        addView(frameLayout2, na.e(-1, ks.e3, 87));
        m();
        o();
    }

    public static void j(org.telegram.ui.ActionBar.y0 y0Var, di.p8 p8Var, Runnable runnable, int i7) {
        y0Var.setOnClickListener(new k5(p8Var, i7, runnable, 0));
        y0Var.setOnLongClickListener(new l5(p8Var, i7, runnable));
    }

    public final void a() {
        di.p8 p8Var;
        p6 currentPage = getCurrentPage();
        if (currentPage == null || (p8Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i7 = p8Var.d;
        new q8(this.a, this.c, i7, new j5(this, i7, currentPage, 0)).show();
    }

    public final boolean b() {
        di.n8 n8Var = this.e;
        return n8Var.h() && n8Var.d().size() < ((org.telegram.messenger.j0) mp.u1(this.b).A7.y.b).c;
    }

    public final boolean c() {
        long j3 = this.c;
        int i7 = this.b;
        return j3 >= 0 ? j3 == 0 || j3 == i10.i(i7).e() : org.telegram.messenger.v3.w(5, mp.u1(i7).O0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.I3;
        LinearLayout linearLayout = this.E;
        hi.e eVar = this.x;
        long j3 = this.c;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() != j3) {
                return;
            }
            eVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.y = 60;
            Boolean bool = this.d.h;
            if (bool != null) {
                this.G.a(bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i7 == ks.J3) {
            if (((Long) objArr[0]).longValue() != j3) {
                return;
            }
            f(true);
            o();
            return;
        }
        if (i7 == ks.r) {
            eVar.setVisibility(d() ? 8 : 0);
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
        this.n.e(tL_starGiftCollection.collection_id, i7 + 1);
    }

    public final void f(boolean z10) {
        s5 s5Var = this.h;
        if (s5Var == null || this.n == null) {
            return;
        }
        s5Var.l(z10);
        e();
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        p6 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.f3.z(this.y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-r0.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.y));
        }
        return (int) (org.telegram.messenger.g0.L(this.y) - translationY);
    }

    public di.p8 getCurrentList() {
        p6 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public ek0 getCurrentListView() {
        p6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public p6 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (p6) currentView;
    }

    public int getGiftsCount() {
        int i7;
        di.p8 p8Var;
        int i10;
        p6 currentPage = getCurrentPage();
        di.p8 p8Var2 = this.d;
        if (currentPage == null || (p8Var = currentPage.e) == p8Var2) {
            if (p8Var2 != null && (i7 = p8Var2.n) > 0) {
                return i7;
            }
        } else if (p8Var != null && (i10 = p8Var.n) > 0) {
            return i10;
        }
        long j3 = this.c;
        int i11 = this.b;
        if (j3 >= 0) {
            TLRPC.UserFull d2 = mp.u1(i11).d2(j3);
            if (d2 != null) {
                return d2.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull P0 = mp.u1(i11).P0(-j3);
        if (P0 != null) {
            return P0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        di.p8 p8Var = this.d;
        if (p8Var != null && !p8Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < p8Var.l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) p8Var.l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        s5 s5Var = this.h;
        float f10 = 0.0f;
        if (s5Var.getViewPages() != null) {
            for (View view : s5Var.getViewPages()) {
                if (view instanceof p6) {
                    f10 = (((p6) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        j71 j71Var = this.n;
        if (j71Var != null) {
            return j71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, w10 w10Var) {
        q60 q60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i7 = 1;
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        int i10 = 0;
        org.telegram.ui.ActionBar.i6 i6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (str != null) {
            t1Var.S = gd.N0(2131750198, null);
        } else {
            t1Var.S = gd.N0(2131750078, null);
            t1Var.U = gd.N0(2131750079, null);
        }
        w5 w5Var = new w5(this, context, i6Var);
        w5Var.s0 = true;
        w5Var.setOnEditorActionListener(new x5(w5Var, w10Var, t1VarArr, currentFocus, 0));
        ri.d0(this.b).O(org.telegram.messenger.g0.G0(), true);
        w5Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.U(w5Var, org.telegram.ui.ActionBar.n6.j5, i6Var);
        org.telegram.ui.ActionBar.u6.l(w5Var, 34, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        w5Var.setHintText(gd.N0(2131750080, null));
        w5Var.setFocusable(true);
        w5Var.setInputType(147457);
        org.telegram.ui.ActionBar.u6.F(w5Var, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, i6Var);
        w5Var.setImeOptions(6);
        w5Var.setBackgroundDrawable(null);
        w5Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        w5Var.addTextChangedListener(new y5(i10, w5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        w5Var.setText(str);
        linearLayout.addView(w5Var, na.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.k(gd.N0(str != null ? 2131751323 : 2131751741, null), new ab.g(3, w5Var, w10Var));
        alertDialog$Builder.h(gd.N0(2131752577, null), new a3.l(21));
        t1VarArr[0] = t1Var;
        x60 x60Var = this.J;
        if (x60Var != null && (q60Var = x60Var.m) != null) {
            q60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Y2(W, this.a.getClassGuid());
        t1VarArr[0].setOnDismissListener(new k(this, w5Var, W, i7));
        t1VarArr[0].setOnShowListener(new l(w5Var, i7));
        t1VarArr[0].show();
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.k0 = false;
        t1Var2.d(-1);
        w5Var.setSelection(w5Var.getText().length());
    }

    public final void i() {
        p6 currentPage = getCurrentPage();
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
            di.n8 n8Var = this.e;
            if (i10 < n8Var.d().size()) {
                di.p8 e10 = (i10 < 0 || i10 >= n8Var.d().size()) ? null : n8Var.e(((TL_stars.TL_starGiftCollection) n8Var.d().get(i10)).collection_id);
                if (e10 != null) {
                    return e10.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        kb kbVar;
        s5 s5Var = this.h;
        if (s5Var == null) {
            return;
        }
        if (s5Var.getCurrentPosition() == s5Var.getNextPosition()) {
            nextPositionAlpha = k(s5Var.getCurrentPosition()) ? 1.0f : 0.0f;
        } else {
            nextPositionAlpha = (s5Var.getNextPositionAlpha() * (k(s5Var.getNextPosition()) ? 1.0f : 0.0f)) + (s5Var.getCurrentPositionAlpha() * (k(s5Var.getCurrentPosition()) ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout = this.r;
        float z10 = org.telegram.messenger.f3.z(this.y, (-frameLayout.getTop()) + this.U, 1);
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
        this.x.i((!this.e.h() || s5Var.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
        fc fcVar = fc.w;
        if (fcVar == null || (kbVar = fcVar.e) == null) {
            return;
        }
        kbVar.updatePosition();
    }

    public final void m() {
        hi.e eVar = this.x;
        eVar.updateColors();
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f;
        int h12 = ((fq0) this).W.h1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        if (!(eVar.getBackground() instanceof ShapeDrawable)) {
            eVar.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(19.0f), h12));
        } else if (((ShapeDrawable) eVar.getBackground()).getPaint().getColor() != h12) {
            org.telegram.ui.ActionBar.n6.C1(h12, eVar.getBackground());
            eVar.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    p6 p6Var = (p6) view;
                    org.telegram.ui.ActionBar.i6 i6Var2 = p6Var.c;
                    if (p6Var.r != null) {
                        p6Var.w.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var2));
                        p6Var.x.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var2));
                    } else {
                        p6Var.F.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var2));
                        p6Var.G.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var2));
                        p6Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, i6Var));
    }

    public final void n() {
        for (View view : this.h.getViewPages()) {
            if (view instanceof p6) {
                p6 p6Var = (p6) view;
                i6 i6Var = p6Var.f;
                int paddingTop = i6Var.getPaddingTop();
                p6Var.g();
                int paddingTop2 = paddingTop - i6Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(i6Var, new q5(p6Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10 = !this.e.d().isEmpty() || b();
        s5 s5Var = this.h;
        if (s5Var.getViewPages() != null) {
            for (View view : s5Var.getViewPages()) {
                if (view instanceof p6) {
                    ((p6) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.b;
        ks.f(i7).c(this, ks.I3);
        ks.f(i7).c(this, ks.J3);
        ks.f(i7).c(this, ks.r);
        p6 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        di.p8 p8Var = this.d;
        if (p8Var != null) {
            p8Var.o = true;
            p8Var.a();
        }
        di.n8 n8Var = this.e;
        if (n8Var != null) {
            n8Var.j = true;
            n8Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p6 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.b;
        ks.f(i7).n(this, ks.I3);
        ks.f(i7).n(this, ks.J3);
        ks.f(i7).n(this, ks.r);
        di.p8 p8Var = this.d;
        if (p8Var != null) {
            p8Var.o = false;
        }
        di.n8 n8Var = this.e;
        if (n8Var != null) {
            n8Var.j = false;
        }
    }

    public final void p() {
        float f10;
        j71 j71Var = this.n;
        if (j71Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        j71Var.setTranslationY(min);
        j71Var.setScaleX(T1);
        j71Var.setScaleY(T1);
        s5 s5Var = this.h;
        if (s5Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : s5Var.getViewPages()) {
                if (view instanceof p6) {
                    f10 += ((p6) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        j71Var.setAlpha(m9.a(f10, 0.0f, 1.0f) * l10);
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
        s5 s5Var = this.h;
        qVar.c(s5Var);
        for (View view : s5Var.getViewPages()) {
            if (view instanceof p6) {
                qVar.b(((p6) view).f);
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
        p6 currentPage = getCurrentPage();
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
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.X4(false);
                org.telegram.messenger.g0.g3(new r5(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        h5 h5Var = this.R;
        org.telegram.messenger.g0.r(h5Var);
        org.telegram.messenger.g0.g3(h5Var);
    }

    public void setVisibleHeight(int i7) {
        this.U = i7;
        l();
        s5 s5Var = this.h;
        if (s5Var != null) {
            for (View view : s5Var.getViewPages()) {
                if (view instanceof p6) {
                    ((p6) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
