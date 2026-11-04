package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.be;
import b8.mf;
import b8.pf;
import ci.e9;
import ci.s8;
import ci.v8;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class u4 extends FrameLayout implements cs {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final wo G;
    public final FrameLayout H;
    public int I;
    public f60 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public pi.q O;
    public boolean P;
    public int Q;
    public final c3 R;
    public final qe.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.d2 a;
    public final int b;
    public final long c;
    public final v8 d;
    public final s8 e;
    public final org.telegram.ui.ActionBar.e6 f;
    public final q3 h;
    public final m61 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final gi.d x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u4(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, eh.c cVar) {
        super(context);
        String str;
        int i10;
        String str2;
        this.I = -1;
        vp0 vp0Var = (vp0) this;
        int i11 = 0;
        this.R = new c3(vp0Var, i11);
        this.S = new qe.a(0, new j3(vp0Var), xq.h, 380L, true);
        this.U = org.telegram.messenger.g0.q.y;
        this.a = d2Var;
        this.b = i3;
        if (org.telegram.messenger.m5.C(j10)) {
            TLRPC.EncryptedChat a12 = hp.s1(i3).a1(Integer.valueOf((int) (4294967295L & j10)));
            if (a12 != null) {
                this.c = a12.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        e9.y(i3, false).P(this.c);
        int i12 = 1;
        v8 G = e9.y(i3, false).G(this.c, true);
        this.d = G;
        s8 F = e9.y(i3, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).v1) {
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
        q3 q3Var = new q3(vp0Var, context, d2Var, i11);
        this.h = q3Var;
        q3Var.setAllowDisallowInterceptTouch(true);
        q3Var.setAdapter(new r3(vp0Var, i3, e6Var));
        addView(q3Var, mf.e(-1, -1, hs.E1));
        m61 j11 = q3Var.j(10, true);
        this.n = j11;
        j11.g(org.telegram.ui.ActionBar.k6.ui, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.si, org.telegram.ui.ActionBar.k6.vi, org.telegram.ui.ActionBar.k6.s8);
        j11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        j11.setClipToPadding(false);
        j11.r = 12;
        j11.setPreTabClick(new j3(vp0Var));
        j11.setOnTabLongClick(new m3(vp0Var, i3, d2Var, context, e6Var, 0));
        addView(j11, mf.e(-1, 42, 48));
        yg0 yg0Var = new yg0(context);
        gh.g c2 = cVar.c(yg0Var, new hh.b(org.telegram.ui.ActionBar.k6.d6, e6Var), false);
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(22.0f));
        yg0Var.setBackground(c2);
        pf.b(yg0Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e10 = mf.e(-1, 60, 87);
        e10.bottomMargin += org.telegram.messenger.g0.n;
        addView(frameLayout, e10);
        frameLayout.addView(yg0Var, mf.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i13 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var), 24, 24);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, e6Var);
        wo woVar = new wo(24, context, e6Var);
        this.G = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, mf.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.F = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
        k2.p1.u(textView, 1, 14.0f, null, 2131750265);
        linearLayout.addView(textView, mf.t(-2, -2, 16, 9, 0, 0, 0));
        yg0Var.addView(linearLayout, mf.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        pf.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new h3(vp0Var, d2Var, i3, i12));
        Boolean bool = G.h;
        if (bool != null) {
            woVar.a(bool.booleanValue(), false);
        }
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(a22 == null || l10.B(a22) || l10.t(a22));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j12 = this.c;
            if (j12 >= 0) {
                str2 = bd.a0(null, null, 2131746674, org.telegram.messenger.m5.t(j12));
                sb2.append(str2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new wp(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k2.p1.k(2131746683, null, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new wp(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                gi.d dVar = new gi.d(context, e6Var, true);
                this.x = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                dVar.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                dVar.i(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                yg0Var.addView(dVar, mf.e(-2, -1, 17));
                yg0Var.setOnClickListener(new n3(vp0Var, z10, i3, 0));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(!d() ? 0 : 8);
                this.y = 60;
                addView(frameLayout2, mf.e(-1, hs.e3, 87));
                m();
                o();
            }
            i10 = 2131746675;
            str = null;
        } else {
            str = null;
            i10 = 2131746676;
        }
        str2 = bd.M0(i10, str);
        sb2.append(str2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new wp(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(k2.p1.k(2131746683, null, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new wp(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        gi.d dVar2 = new gi.d(context, e6Var, true);
        this.x = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar2.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
        dVar2.i(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        yg0Var.addView(dVar2, mf.e(-2, -1, 17));
        yg0Var.setOnClickListener(new n3(vp0Var, z10, i3, 0));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(!d() ? 0 : 8);
        this.y = 60;
        addView(frameLayout2, mf.e(-1, hs.e3, 87));
        m();
        o();
    }

    public static void j(org.telegram.ui.ActionBar.y0 y0Var, v8 v8Var, Runnable runnable, int i3) {
        y0Var.setOnClickListener(new h3(v8Var, i3, runnable, 0));
        y0Var.setOnLongClickListener(new i3(v8Var, i3, runnable));
    }

    public final void a() {
        v8 v8Var;
        o4 currentPage = getCurrentPage();
        if (currentPage == null || (v8Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i3 = v8Var.d;
        new m6(this.a, this.c, i3, new g3(this, i3, currentPage, 0)).show();
    }

    public final boolean b() {
        s8 s8Var = this.e;
        return s8Var.h() && s8Var.d().size() < ((org.telegram.messenger.j0) hp.s1(this.b).x7.t.b).c;
    }

    public final boolean c() {
        long j10 = this.c;
        int i3 = this.b;
        return j10 >= 0 ? j10 == 0 || j10 == h10.i(i3).e() : org.telegram.messenger.t3.w(5, hp.s1(i3).M0(Long.valueOf(-j10)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.G3;
        LinearLayout linearLayout = this.E;
        gi.d dVar = this.x;
        long j10 = this.c;
        if (i3 == i11) {
            if (((Long) objArr[0]).longValue() != j10) {
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
        if (i3 == hs.H3) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            f(true);
            o();
            return;
        }
        if (i3 == hs.r) {
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
        int i3 = 0;
        while (true) {
            if (i3 >= d.size()) {
                i3 = -1;
                tL_starGiftCollection = null;
                break;
            } else {
                if (((TL_stars.TL_starGiftCollection) d.get(i3)).collection_id == this.Q) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i3);
                    break;
                }
                i3++;
            }
        }
        if (i3 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.Q = 0;
        this.n.d(tL_starGiftCollection.collection_id, i3 + 1);
    }

    public final void f(boolean z10) {
        q3 q3Var = this.h;
        if (q3Var == null || this.n == null) {
            return;
        }
        q3Var.k(z10);
        e();
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        o4 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.k5.z(this.y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-r0.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.y));
        }
        return (int) (org.telegram.messenger.g0.L(this.y) - translationY);
    }

    public v8 getCurrentList() {
        o4 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public tj0 getCurrentListView() {
        o4 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public o4 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (o4) currentView;
    }

    public int getGiftsCount() {
        int i3;
        v8 v8Var;
        int i10;
        o4 currentPage = getCurrentPage();
        v8 v8Var2 = this.d;
        if (currentPage == null || (v8Var = currentPage.e) == v8Var2) {
            if (v8Var2 != null && (i3 = v8Var2.n) > 0) {
                return i3;
            }
        } else if (v8Var != null && (i10 = v8Var.n) > 0) {
            return i10;
        }
        long j10 = this.c;
        int i11 = this.b;
        if (j10 >= 0) {
            TLRPC.UserFull b22 = hp.s1(i11).b2(j10);
            if (b22 != null) {
                return b22.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull N0 = hp.s1(i11).N0(-j10);
        if (N0 != null) {
            return N0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        v8 v8Var = this.d;
        if (v8Var != null && !v8Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i3 = 0;
            for (int i10 = 0; i3 < 3 && i10 < v8Var.l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) v8Var.l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.id));
                    i3++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        q3 q3Var = this.h;
        float f10 = 0.0f;
        if (q3Var.getViewPages() != null) {
            for (View view : q3Var.getViewPages()) {
                if (view instanceof o4) {
                    f10 = (((o4) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        m61 m61Var = this.n;
        if (m61Var != null) {
            return m61Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, u10 u10Var) {
        b60 b60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i3 = 1;
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        int i10 = 0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        if (str != null) {
            s1Var.S = bd.M0(2131750223, null);
        } else {
            s1Var.S = bd.M0(2131750103, null);
            s1Var.U = bd.M0(2131750104, null);
        }
        u3 u3Var = new u3(this, context, e6Var);
        u3Var.s0 = true;
        u3Var.setOnEditorActionListener(new v3(u3Var, u10Var, s1VarArr, currentFocus, 0));
        li.b0(this.b).M(org.telegram.messenger.g0.G0(), true);
        u3Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(u3Var, org.telegram.ui.ActionBar.k6.j5, e6Var);
        org.telegram.ui.ActionBar.r6.m(u3Var, 34, org.telegram.ui.ActionBar.k6.Li, e6Var);
        u3Var.setHintText(bd.M0(2131750105, null));
        u3Var.setFocusable(true);
        u3Var.setInputType(147457);
        org.telegram.ui.ActionBar.r6.G(u3Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, e6Var);
        u3Var.setImeOptions(6);
        u3Var.setBackgroundDrawable(null);
        u3Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        u3Var.addTextChangedListener(new w3(i10, u3Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        u3Var.setText(str);
        linearLayout.addView(u3Var, mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        s1Var.a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.k(bd.M0(str != null ? 2131751336 : 2131751753, null), new n(i3, u3Var, u10Var));
        alertDialog$Builder.h(bd.M0(2131752589, null), new a3.j(2));
        s1VarArr[0] = s1Var;
        f60 f60Var = this.J;
        if (f60Var != null && (b60Var = f60Var.m) != null) {
            b60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Z2(W, this.a.getClassGuid());
        s1VarArr[0].setOnDismissListener(new o(this, u3Var, W, i3));
        s1VarArr[0].setOnShowListener(new p(u3Var, i3));
        s1VarArr[0].show();
        org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
        s1Var2.k0 = false;
        s1Var2.d(-1);
        u3Var.setSelection(u3Var.getText().length());
    }

    public final void i() {
        o4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i3) {
        if (i3 == 0) {
            return false;
        }
        int i10 = i3 - 1;
        if (i10 >= 0) {
            s8 s8Var = this.e;
            if (i10 < s8Var.d().size()) {
                v8 e10 = (i10 < 0 || i10 >= s8Var.d().size()) ? null : s8Var.e(((TL_stars.TL_starGiftCollection) s8Var.d().get(i10)).collection_id);
                if (e10 != null) {
                    return e10.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        fb fbVar;
        q3 q3Var = this.h;
        if (q3Var == null) {
            return;
        }
        if (q3Var.getCurrentPosition() == q3Var.getNextPosition()) {
            nextPositionAlpha = k(q3Var.getCurrentPosition()) ? 1.0f : 0.0f;
        } else {
            nextPositionAlpha = (q3Var.getNextPositionAlpha() * (k(q3Var.getNextPosition()) ? 1.0f : 0.0f)) + (q3Var.getCurrentPositionAlpha() * (k(q3Var.getCurrentPosition()) ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout = this.r;
        float z10 = org.telegram.messenger.k5.z(this.y, (-frameLayout.getTop()) + this.U, 1);
        float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z10;
        boolean z11 = this.U > org.telegram.messenger.g0.L(184.0f);
        qe.a aVar = this.S;
        aVar.a(z11, true);
        float f10 = aVar.e;
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z10, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z10, f10);
        float f11 = (1.0f - nextPositionAlpha) * f10;
        this.H.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f10) - org.telegram.messenger.g0.L(200.0f));
        frameLayout.setTranslationY(T1 - this.T);
        frameLayout.setAlpha(f11);
        frameLayout.setVisibility(f11 <= 0.0f ? 4 : 0);
        this.x.i((!this.e.h() || q3Var.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
        ac acVar = ac.w;
        if (acVar == null || (fbVar = acVar.e) == null) {
            return;
        }
        fbVar.updatePosition();
    }

    public final void m() {
        gi.d dVar = this.x;
        dVar.updateColors();
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        int f12 = ((vp0) this).W.f1(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        if (!(dVar.getBackground() instanceof ShapeDrawable)) {
            dVar.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(19.0f), f12));
        } else if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != f12) {
            org.telegram.ui.ActionBar.k6.C1(f12, dVar.getBackground());
            dVar.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    o4 o4Var = (o4) view;
                    org.telegram.ui.ActionBar.e6 e6Var2 = o4Var.c;
                    if (o4Var.r != null) {
                        o4Var.w.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var2));
                        o4Var.x.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var2));
                    } else {
                        o4Var.F.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var2));
                        o4Var.G.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var2));
                        o4Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, e6Var));
    }

    public final void n() {
        for (View view : this.h.getViewPages()) {
            if (view instanceof o4) {
                o4 o4Var = (o4) view;
                h4 h4Var = o4Var.f;
                int paddingTop = h4Var.getPaddingTop();
                o4Var.g();
                int paddingTop2 = paddingTop - h4Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(h4Var, new o3(o4Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10 = !this.e.d().isEmpty() || b();
        q3 q3Var = this.h;
        if (q3Var.getViewPages() != null) {
            for (View view : q3Var.getViewPages()) {
                if (view instanceof o4) {
                    ((o4) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.b;
        hs.f(i3).c(this, hs.G3);
        hs.f(i3).c(this, hs.H3);
        hs.f(i3).c(this, hs.r);
        o4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        v8 v8Var = this.d;
        if (v8Var != null) {
            v8Var.o = true;
            v8Var.a();
        }
        s8 s8Var = this.e;
        if (s8Var != null) {
            s8Var.j = true;
            s8Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o4 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i3 = this.b;
        hs.f(i3).n(this, hs.G3);
        hs.f(i3).n(this, hs.H3);
        hs.f(i3).n(this, hs.r);
        v8 v8Var = this.d;
        if (v8Var != null) {
            v8Var.o = false;
        }
        s8 s8Var = this.e;
        if (s8Var != null) {
            s8Var.j = false;
        }
    }

    public final void p() {
        float f10;
        m61 m61Var = this.n;
        if (m61Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        m61Var.setTranslationY(min);
        m61Var.setScaleX(T1);
        m61Var.setScaleY(T1);
        q3 q3Var = this.h;
        if (q3Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : q3Var.getViewPages()) {
                if (view instanceof o4) {
                    f10 += ((o4) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        m61Var.setAlpha(be.a(f10, 0.0f, 1.0f) * l10);
    }

    public abstract void q(boolean z10);

    public void setButtonOffset(int i3) {
        if (this.T != i3) {
            this.T = i3;
            l();
        }
    }

    public void setGlassEngine(pi.q qVar) {
        this.O = qVar;
        q3 q3Var = this.h;
        qVar.c(q3Var);
        for (View view : q3Var.getViewPages()) {
            if (view instanceof o4) {
                qVar.b(((o4) view).f);
            }
        }
    }

    public void setPaddingTop(int i3) {
        if (this.L != i3) {
            this.L = i3;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z10) {
        o4 currentPage = getCurrentPage();
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
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.U4(false);
                org.telegram.messenger.g0.h3(new p3(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        c3 c3Var = this.R;
        org.telegram.messenger.g0.r(c3Var);
        org.telegram.messenger.g0.h3(c3Var);
    }

    public void setVisibleHeight(int i3) {
        this.U = i3;
        l();
        q3 q3Var = this.h;
        if (q3Var != null) {
            for (View view : q3Var.getViewPages()) {
                if (view instanceof o4) {
                    ((o4) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
