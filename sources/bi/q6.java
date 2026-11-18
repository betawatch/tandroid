package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.l9;
import c8.ma;
import c8.ra;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class q6 extends FrameLayout implements fs {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final mp G;
    public final FrameLayout H;
    public int I;
    public y60 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public ri.q O;
    public boolean P;
    public int Q;
    public final c5 R;
    public final te.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.h2 a;
    public final int b;
    public final long c;
    public final di.o8 d;
    public final di.m8 e;
    public final org.telegram.ui.ActionBar.i6 f;
    public final n5 h;
    public final f71 n;
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
    public q6(org.telegram.ui.ActionBar.h2 h2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context);
        String str;
        int i10;
        String str2;
        this.I = -1;
        eq0 eq0Var = (eq0) this;
        int i11 = 0;
        this.R = new c5(eq0Var, i11);
        this.S = new te.a(0, new h5(eq0Var), lr.h, 380L, true);
        this.U = org.telegram.messenger.g0.q.y;
        this.a = h2Var;
        this.b = i7;
        if (org.telegram.messenger.n5.C(j3)) {
            TLRPC.EncryptedChat c12 = org.telegram.messenger.mp.u1(i7).c1(Integer.valueOf((int) (4294967295L & j3)));
            if (c12 != null) {
                this.c = c12.user_id;
            } else {
                this.c = j3;
            }
        } else {
            this.c = j3;
        }
        di.x8.y(i7, false).O(this.c);
        int i12 = 1;
        di.o8 G = di.x8.y(i7, false).G(this.c, true);
        this.d = G;
        di.m8 F = di.x8.y(i7, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((h2Var instanceof ProfileActivity) && ((ProfileActivity) h2Var).v1) {
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
        n5 n5Var = new n5(eq0Var, context, h2Var, i11);
        this.h = n5Var;
        n5Var.setAllowDisallowInterceptTouch(true);
        n5Var.setAdapter(new o5(eq0Var, i7, i6Var));
        addView(n5Var, ma.e(-1, -1, ks.E1));
        f71 i13 = n5Var.i(10, true);
        this.n = i13;
        i13.h(org.telegram.ui.ActionBar.n6.xi, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.vi, org.telegram.ui.ActionBar.n6.yi, org.telegram.ui.ActionBar.n6.s8);
        i13.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i13.setClipToPadding(false);
        i13.r = 12;
        i13.setPreTabClick(new h5(eq0Var));
        i13.setOnTabLongClick(new j5(eq0Var, i7, h2Var, context, i6Var, 0));
        addView(i13, ma.e(-1, 42, 48));
        hh0 hh0Var = new hh0(context);
        fh.g c10 = cVar.c(hh0Var, new gh.b(org.telegram.ui.ActionBar.n6.d6, i6Var), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        hh0Var.setBackground(c10);
        ra.b(hh0Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e10 = ma.e(-1, 60, 87);
        e10.bottomMargin += org.telegram.messenger.g0.n;
        addView(frameLayout, e10);
        frameLayout.addView(hh0Var, ma.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 24, 24);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M, i6Var);
        mp mpVar = new mp(24, context, i6Var);
        this.G = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.j7, org.telegram.ui.ActionBar.n6.k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(false, false);
        mpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(mpVar, ma.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.F = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
        i5.c.r(14.0f, 1, 2131750241, textView, null);
        linearLayout.addView(textView, ma.t(-2, -2, 16, 9, 0, 0, 0));
        hh0Var.addView(linearLayout, ma.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        ra.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new f5(eq0Var, h2Var, i7, i12));
        Boolean bool = G.h;
        if (bool != null) {
            mpVar.a(bool.booleanValue(), false);
        }
        TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(c22 == null || o10.C(c22) || o10.u(c22));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j10 = this.c;
            if (j10 >= 0) {
                str2 = gd.a0(null, null, 2131746471, org.telegram.messenger.n5.t(j10));
                sb2.append(str2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new lq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(i5.c.k(2131746480, null, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new lq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                hi.d dVar = new hi.d(context, i6Var, true);
                this.x = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                dVar.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                dVar.i(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                hh0Var.addView(dVar, ma.e(-2, -1, 17));
                hh0Var.setOnClickListener(new k5(eq0Var, z10, i7, 0));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(!d() ? 0 : 8);
                this.y = 60;
                addView(frameLayout2, ma.e(-1, ks.e3, 87));
                m();
                o();
            }
            i10 = 2131746472;
            str = null;
        } else {
            str = null;
            i10 = 2131746473;
        }
        str2 = gd.M0(i10, str);
        sb2.append(str2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new lq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(i5.c.k(2131746480, null, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new lq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        hi.d dVar2 = new hi.d(context, i6Var, true);
        this.x = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar2.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
        dVar2.i(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        hh0Var.addView(dVar2, ma.e(-2, -1, 17));
        hh0Var.setOnClickListener(new k5(eq0Var, z10, i7, 0));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(!d() ? 0 : 8);
        this.y = 60;
        addView(frameLayout2, ma.e(-1, ks.e3, 87));
        m();
        o();
    }

    public static void j(org.telegram.ui.ActionBar.z0 z0Var, di.o8 o8Var, Runnable runnable, int i7) {
        z0Var.setOnClickListener(new f5(o8Var, i7, runnable, 0));
        z0Var.setOnLongClickListener(new g5(o8Var, i7, runnable));
    }

    public final void a() {
        di.o8 o8Var;
        k6 currentPage = getCurrentPage();
        if (currentPage == null || (o8Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i7 = o8Var.d;
        new l8(this.a, this.c, i7, new e5(this, i7, currentPage, 0)).show();
    }

    public final boolean b() {
        di.m8 m8Var = this.e;
        return m8Var.h() && m8Var.d().size() < ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.b).A7.y.b).c;
    }

    public final boolean c() {
        long j3 = this.c;
        int i7 = this.b;
        return j3 >= 0 ? j3 == 0 || j3 == j10.i(i7).e() : org.telegram.messenger.v3.w(5, org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.I3;
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
        if (i7 == ks.J3) {
            if (((Long) objArr[0]).longValue() != j3) {
                return;
            }
            f(true);
            o();
            return;
        }
        if (i7 == ks.r) {
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
        this.n.e(tL_starGiftCollection.collection_id, i7 + 1);
    }

    public final void f(boolean z10) {
        n5 n5Var = this.h;
        if (n5Var == null || this.n == null) {
            return;
        }
        n5Var.j(z10);
        e();
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        k6 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.f3.z(this.y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-r0.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.y));
        }
        return (int) (org.telegram.messenger.g0.L(this.y) - translationY);
    }

    public di.o8 getCurrentList() {
        k6 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public ck0 getCurrentListView() {
        k6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public k6 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (k6) currentView;
    }

    public int getGiftsCount() {
        int i7;
        di.o8 o8Var;
        int i10;
        k6 currentPage = getCurrentPage();
        di.o8 o8Var2 = this.d;
        if (currentPage == null || (o8Var = currentPage.e) == o8Var2) {
            if (o8Var2 != null && (i7 = o8Var2.n) > 0) {
                return i7;
            }
        } else if (o8Var != null && (i10 = o8Var.n) > 0) {
            return i10;
        }
        long j3 = this.c;
        int i11 = this.b;
        if (j3 >= 0) {
            TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i11).d2(j3);
            if (d2 != null) {
                return d2.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i11).P0(-j3);
        if (P0 != null) {
            return P0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        di.o8 o8Var = this.d;
        if (o8Var != null && !o8Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < o8Var.l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) o8Var.l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        n5 n5Var = this.h;
        float f10 = 0.0f;
        if (n5Var.getViewPages() != null) {
            for (View view : n5Var.getViewPages()) {
                if (view instanceof k6) {
                    f10 = (((k6) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        f71 f71Var = this.n;
        if (f71Var != null) {
            return f71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, x10 x10Var) {
        r60 r60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i7 = 1;
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        int i10 = 0;
        org.telegram.ui.ActionBar.i6 i6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (str != null) {
            u1Var.S = gd.M0(2131750199, null);
        } else {
            u1Var.S = gd.M0(2131750079, null);
            u1Var.U = gd.M0(2131750080, null);
        }
        r5 r5Var = new r5(this, context, i6Var);
        r5Var.s0 = true;
        r5Var.setOnEditorActionListener(new s5(r5Var, x10Var, u1VarArr, currentFocus, 0));
        ri.d0(this.b).O(org.telegram.messenger.g0.G0(), true);
        r5Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.U(r5Var, org.telegram.ui.ActionBar.n6.j5, i6Var);
        org.telegram.ui.ActionBar.u6.l(r5Var, 34, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        r5Var.setHintText(gd.M0(2131750081, null));
        r5Var.setFocusable(true);
        r5Var.setInputType(147457);
        org.telegram.ui.ActionBar.u6.F(r5Var, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, i6Var);
        r5Var.setImeOptions(6);
        r5Var.setBackgroundDrawable(null);
        r5Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        r5Var.addTextChangedListener(new t5(i10, r5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        r5Var.setText(str);
        linearLayout.addView(r5Var, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.k(gd.M0(str != null ? 2131751324 : 2131751742, null), new ab.g(3, r5Var, x10Var));
        alertDialog$Builder.h(gd.M0(2131752578, null), new a3.l(21));
        u1VarArr[0] = u1Var;
        y60 y60Var = this.J;
        if (y60Var != null && (r60Var = y60Var.m) != null) {
            r60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Y2(W, this.a.getClassGuid());
        u1VarArr[0].setOnDismissListener(new k(this, r5Var, W, i7));
        u1VarArr[0].setOnShowListener(new l(r5Var, i7));
        u1VarArr[0].show();
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.k0 = false;
        u1Var2.d(-1);
        r5Var.setSelection(r5Var.getText().length());
    }

    public final void i() {
        k6 currentPage = getCurrentPage();
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
            di.m8 m8Var = this.e;
            if (i10 < m8Var.d().size()) {
                di.o8 e10 = (i10 < 0 || i10 >= m8Var.d().size()) ? null : m8Var.e(((TL_stars.TL_starGiftCollection) m8Var.d().get(i10)).collection_id);
                if (e10 != null) {
                    return e10.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        lb lbVar;
        n5 n5Var = this.h;
        if (n5Var == null) {
            return;
        }
        if (n5Var.getCurrentPosition() == n5Var.getNextPosition()) {
            nextPositionAlpha = k(n5Var.getCurrentPosition()) ? 1.0f : 0.0f;
        } else {
            nextPositionAlpha = (n5Var.getNextPositionAlpha() * (k(n5Var.getNextPosition()) ? 1.0f : 0.0f)) + (n5Var.getCurrentPositionAlpha() * (k(n5Var.getCurrentPosition()) ? 1.0f : 0.0f));
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
        this.x.i((!this.e.h() || n5Var.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
        gc gcVar = gc.w;
        if (gcVar == null || (lbVar = gcVar.e) == null) {
            return;
        }
        lbVar.updatePosition();
    }

    public final void m() {
        hi.d dVar = this.x;
        dVar.updateColors();
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f;
        int h12 = ((eq0) this).W.h1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        if (!(dVar.getBackground() instanceof ShapeDrawable)) {
            dVar.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(19.0f), h12));
        } else if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != h12) {
            org.telegram.ui.ActionBar.n6.C1(h12, dVar.getBackground());
            dVar.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    k6 k6Var = (k6) view;
                    org.telegram.ui.ActionBar.i6 i6Var2 = k6Var.c;
                    if (k6Var.r != null) {
                        k6Var.w.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var2));
                        k6Var.x.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var2));
                    } else {
                        k6Var.F.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var2));
                        k6Var.G.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var2));
                        k6Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, i6Var));
    }

    public final void n() {
        for (View view : this.h.getViewPages()) {
            if (view instanceof k6) {
                k6 k6Var = (k6) view;
                d6 d6Var = k6Var.f;
                int paddingTop = d6Var.getPaddingTop();
                k6Var.g();
                int paddingTop2 = paddingTop - d6Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(d6Var, new l5(k6Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10 = !this.e.d().isEmpty() || b();
        n5 n5Var = this.h;
        if (n5Var.getViewPages() != null) {
            for (View view : n5Var.getViewPages()) {
                if (view instanceof k6) {
                    ((k6) view).setHasTabs(z10);
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
        k6 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        di.o8 o8Var = this.d;
        if (o8Var != null) {
            o8Var.o = true;
            o8Var.a();
        }
        di.m8 m8Var = this.e;
        if (m8Var != null) {
            m8Var.j = true;
            m8Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k6 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.b;
        ks.f(i7).n(this, ks.I3);
        ks.f(i7).n(this, ks.J3);
        ks.f(i7).n(this, ks.r);
        di.o8 o8Var = this.d;
        if (o8Var != null) {
            o8Var.o = false;
        }
        di.m8 m8Var = this.e;
        if (m8Var != null) {
            m8Var.j = false;
        }
    }

    public final void p() {
        float f10;
        f71 f71Var = this.n;
        if (f71Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        f71Var.setTranslationY(min);
        f71Var.setScaleX(T1);
        f71Var.setScaleY(T1);
        n5 n5Var = this.h;
        if (n5Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : n5Var.getViewPages()) {
                if (view instanceof k6) {
                    f10 += ((k6) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        f71Var.setAlpha(l9.a(f10, 0.0f, 1.0f) * l10);
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
        n5 n5Var = this.h;
        qVar.c(n5Var);
        for (View view : n5Var.getViewPages()) {
            if (view instanceof k6) {
                qVar.b(((k6) view).f);
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
        k6 currentPage = getCurrentPage();
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
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.X4(false);
                org.telegram.messenger.g0.g3(new m5(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        c5 c5Var = this.R;
        org.telegram.messenger.g0.r(c5Var);
        org.telegram.messenger.g0.g3(c5Var);
    }

    public void setVisibleHeight(int i7) {
        this.U = i7;
        l();
        n5 n5Var = this.h;
        if (n5Var != null) {
            for (View view : n5Var.getViewPages()) {
                if (view instanceof k6) {
                    ((k6) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
