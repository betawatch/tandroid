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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class l7 extends org.telegram.ui.Components.sa implements fs {
    public di.f0 T1;
    public final org.telegram.ui.Cells.l3 U1;
    public final org.telegram.ui.Cells.l3 V1;
    public final FrameLayout W1;
    public final d X1;
    public boolean Y1;
    public boolean Z1;
    public ai.v1 a2;
    public long b2;
    public TLRPC.WebPage c2;
    public boolean d2;
    public int e2;
    public String f2;
    public final g7 g2;
    public Pattern h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;

    public l7(Context context, d5 d5Var, w5 w5Var, ai.v1 v1Var) {
        super(context, null, true, true, 2, d5Var);
        this.g2 = new g7(this, 0);
        this.a2 = v1Var;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, gd.M0(2131744397, null), true, false, -1, d5Var);
        this.U1 = l3Var;
        int i7 = 1;
        g7 g7Var = new g7(this, i7);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        int i10 = 2;
        j3Var.setOnEditorActionListener(new m.r2(g7Var, i10));
        j3Var.setHandlesColor(-12476440);
        j3Var.setCursorColor(-11230757);
        j3Var.setText("https://");
        j3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.M0(2131747242, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.n6.o6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.u6.U(textView, i11, d5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i11);
        org.telegram.ui.ActionBar.q6 K2 = org.telegram.ui.ActionBar.u6.K(0.15f, i11);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, K, K2, d5Var);
        c8.ra.b(textView, 0.1f, 1.5f);
        l3Var.addView(textView, c8.ma.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        r1 r1Var = new r1(14, this, textView);
        textView.setOnClickListener(new ai.v2(23, this, r1Var));
        r1Var.run();
        j3Var.addTextChangedListener(new bi.v(7, this, r1Var));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, gd.M0(2131744401, null), true, false, -1, d5Var);
        this.V1 = l3Var2;
        g7 g7Var2 = new g7(this, i7);
        org.telegram.ui.Cells.j3 j3Var2 = l3Var2.d;
        j3Var2.setImeOptions(6);
        j3Var2.setOnEditorActionListener(new m.r2(g7Var2, i10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        d dVar = new d(context, d5Var, true);
        this.X1 = dVar;
        dVar.i(gd.M0(2131744410, null), false, true);
        dVar.setOnClickListener(new f7(this, 1));
        dVar.setEnabled(g1(l3Var.getText().toString()));
        frameLayout.addView(dVar, c8.ma.d(-1, 48.0f, ks.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v1 = 0.2f;
        this.J1 = true;
        this.Q0 = true;
        this.R0 = true;
        h7 h7Var = new h7(this);
        h7Var.m = false;
        h7Var.C = false;
        h7Var.o(lr.h);
        h7Var.n(350L);
        this.o1.setItemAnimator(h7Var);
        ck0 ck0Var = this.o1;
        int i12 = this.u0;
        ck0Var.setPadding(i12, 0, i12, 0);
        this.o1.setOnItemClickListener(new bi.p1(this, context, w5Var, 3));
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(false);
        }
    }

    public static void e1(l7 l7Var, String str) {
        g7 g7Var = l7Var.g2;
        if (str == null || TextUtils.equals(str, l7Var.f2)) {
            return;
        }
        l7Var.f2 = str;
        boolean g12 = l7Var.g1(str);
        org.telegram.messenger.g0.r(g7Var);
        if (g12) {
            if (!l7Var.d2 || l7Var.c2 != null) {
                l7Var.d2 = true;
                l7Var.c2 = null;
                di.f0 f0Var = l7Var.T1;
                if (f0Var != null) {
                    f0Var.O(true);
                }
            }
            org.telegram.messenger.g0.h3(g7Var, 700L);
        } else if (l7Var.d2 || l7Var.c2 != null) {
            l7Var.d2 = false;
            l7Var.c2 = null;
            if (l7Var.e2 != 0) {
                ConnectionsManager.getInstance(l7Var.a).cancelRequest(l7Var.e2, true);
                l7Var.e2 = 0;
            }
            di.f0 f0Var2 = l7Var.T1;
            if (f0Var2 != null) {
                f0Var2.O(true);
            }
        }
        l7Var.X1.setEnabled(g12);
    }

    public static boolean h1(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        di.f0 f0Var = new di.f0(this.o1, getContext(), this.a, 0, true, new e7(this, 0), this.J0, 1);
        this.T1 = f0Var;
        return f0Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return gd.M0(2131744407, null);
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

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
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
                tg.h0 h0Var = new tg.h0();
                h0Var.c = this.U1.d.getText().toString();
                h0Var.b = this.i2 ? this.V1.d.getText().toString() : null;
                h0Var.d = this.c2;
                h0Var.e = this.k2;
                h0Var.f = this.j2;
                this.a2.a(h0Var);
                this.a2 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        ks.f(this.a).c(this, ks.w0);
        org.telegram.messenger.g0.h3(new g7(this, 2), 150L);
    }
}
