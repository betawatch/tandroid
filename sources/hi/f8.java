package hi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f8 extends org.telegram.ui.Components.ra implements fs {
    public di.f0 T1;
    public final org.telegram.ui.Cells.l3 U1;
    public final org.telegram.ui.Cells.l3 V1;
    public final FrameLayout W1;
    public final e X1;
    public boolean Y1;
    public boolean Z1;
    public ai.s1 a2;
    public long b2;
    public TLRPC.WebPage c2;
    public boolean d2;
    public int e2;
    public String f2;
    public final a8 g2;
    public Pattern h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;

    public f8(Context context, n5 n5Var, f6 f6Var, ai.s1 s1Var) {
        super(context, null, true, true, 2, n5Var);
        this.g2 = new a8(this, 0);
        this.a2 = s1Var;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, gd.N0(2131744388, null), true, false, -1, n5Var);
        this.U1 = l3Var;
        int i7 = 1;
        a8 a8Var = new a8(this, i7);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        int i10 = 2;
        j3Var.setOnEditorActionListener(new m.r2(a8Var, i10));
        j3Var.setHandlesColor(-12476440);
        j3Var.setCursorColor(-11230757);
        j3Var.setText("https://");
        j3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.N0(2131747241, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.n6.o6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.u6.U(textView, i11, n5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i11);
        org.telegram.ui.ActionBar.q6 K2 = org.telegram.ui.ActionBar.u6.K(0.15f, i11);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, K, K2, n5Var);
        c8.sa.b(textView, 0.1f, 1.5f);
        l3Var.addView(textView, c8.na.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        c cVar = new c(18, this, textView);
        textView.setOnClickListener(new ai.p2(22, this, cVar));
        cVar.run();
        j3Var.addTextChangedListener(new bi.v(7, this, cVar));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, gd.N0(2131744392, null), true, false, -1, n5Var);
        this.V1 = l3Var2;
        a8 a8Var2 = new a8(this, i7);
        org.telegram.ui.Cells.j3 j3Var2 = l3Var2.d;
        j3Var2.setImeOptions(6);
        j3Var2.setOnEditorActionListener(new m.r2(a8Var2, i10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        e eVar = new e(context, n5Var, true);
        this.X1 = eVar;
        eVar.i(gd.N0(2131744401, null), false, true);
        eVar.setOnClickListener(new z7(this, 1));
        eVar.setEnabled(g1(l3Var.getText().toString()));
        frameLayout.addView(eVar, c8.na.d(-1, 48.0f, ks.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v1 = 0.2f;
        this.J1 = true;
        this.Q0 = true;
        this.R0 = true;
        b8 b8Var = new b8(this);
        b8Var.m = false;
        b8Var.C = false;
        b8Var.o(kr.h);
        b8Var.n(350L);
        this.o1.setItemAnimator(b8Var);
        ek0 ek0Var = this.o1;
        int i12 = this.u0;
        ek0Var.setPadding(i12, 0, i12, 0);
        this.o1.setOnItemClickListener(new bi.u1(this, context, f6Var, 3));
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(false);
        }
    }

    public static void e1(f8 f8Var, String str) {
        a8 a8Var = f8Var.g2;
        if (str == null || TextUtils.equals(str, f8Var.f2)) {
            return;
        }
        f8Var.f2 = str;
        boolean g12 = f8Var.g1(str);
        org.telegram.messenger.g0.r(a8Var);
        if (g12) {
            if (!f8Var.d2 || f8Var.c2 != null) {
                f8Var.d2 = true;
                f8Var.c2 = null;
                di.f0 f0Var = f8Var.T1;
                if (f0Var != null) {
                    f0Var.O(true);
                }
            }
            org.telegram.messenger.g0.h3(a8Var, 700L);
        } else if (f8Var.d2 || f8Var.c2 != null) {
            f8Var.d2 = false;
            f8Var.c2 = null;
            if (f8Var.e2 != 0) {
                ConnectionsManager.getInstance(f8Var.a).cancelRequest(f8Var.e2, true);
                f8Var.e2 = 0;
            }
            di.f0 f0Var2 = f8Var.T1;
            if (f0Var2 != null) {
                f0Var2.O(true);
            }
        }
        f8Var.X1.setEnabled(g12);
    }

    public static boolean h1(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        di.f0 f0Var = new di.f0(this.o1, getContext(), this.a, 0, true, new y7(this, 0), this.J0, 1);
        this.T1 = f0Var;
        return f0Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return gd.N0(2131744398, null);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.w0 || this.b2 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
            if (webPage != null && this.b2 == webPage.id) {
                if (h1(webPage)) {
                    webPage = null;
                }
                this.c2 = webPage;
                this.d2 = false;
                this.b2 = 0L;
                di.f0 f0Var = this.T1;
                if (f0Var != null) {
                    f0Var.O(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.U1.d);
        org.telegram.messenger.g0.v1(this.V1.d);
        super.dismiss();
        ks.f(this.a).n(this, ks.w0);
    }

    public final void f1() {
        this.d2 = false;
        this.c2 = null;
        if (this.e2 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.e2, true);
            this.e2 = 0;
        }
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(true);
        }
    }

    public final boolean g1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.h2 == null) {
            this.h2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.h2.matcher(str).find();
    }

    public final void i1() {
        if (this.X1.e0) {
            if (this.a2 != null) {
                tg.m0 m0Var = new tg.m0();
                m0Var.c = this.U1.d.getText().toString();
                m0Var.b = this.i2 ? this.V1.d.getText().toString() : null;
                m0Var.d = this.c2;
                m0Var.e = this.k2;
                m0Var.f = this.j2;
                this.a2.a(m0Var);
                this.a2 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        ks.f(this.a).c(this, ks.w0);
        org.telegram.messenger.g0.h3(new a8(this, 2), 150L);
    }
}
