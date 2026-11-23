package hi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class k7 extends org.telegram.ui.Components.sa implements gs {
    public di.f0 T1;
    public final org.telegram.ui.Cells.l3 U1;
    public final org.telegram.ui.Cells.l3 V1;
    public final FrameLayout W1;
    public final e X1;
    public boolean Y1;
    public boolean Z1;
    public ai.y1 a2;
    public long b2;
    public TLRPC.WebPage c2;
    public boolean d2;
    public int e2;
    public String f2;
    public final f7 g2;
    public Pattern h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;

    public k7(Context context, c5 c5Var, v5 v5Var, ai.y1 y1Var) {
        super(context, null, true, true, 2, c5Var);
        this.g2 = new f7(this, 0);
        this.a2 = y1Var;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, hd.N0(2131744389, null), true, false, -1, c5Var);
        this.U1 = l3Var;
        int i7 = 1;
        f7 f7Var = new f7(this, i7);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        int i10 = 2;
        j3Var.setOnEditorActionListener(new m.r2(f7Var, i10));
        j3Var.setHandlesColor(-12476440);
        j3Var.setCursorColor(-11230757);
        j3Var.setText("https://");
        j3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.N0(2131747241, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.m6.o6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.t6.U(textView, i11, c5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i11);
        org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.15f, i11);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, K, K2, c5Var);
        c8.ra.b(textView, 0.1f, 1.5f);
        l3Var.addView(textView, c8.ma.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        c cVar = new c(16, this, textView);
        textView.setOnClickListener(new ai.y2(22, this, cVar));
        cVar.run();
        j3Var.addTextChangedListener(new bi.v(7, this, cVar));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, hd.N0(2131744393, null), true, false, -1, c5Var);
        this.V1 = l3Var2;
        f7 f7Var2 = new f7(this, i7);
        org.telegram.ui.Cells.j3 j3Var2 = l3Var2.d;
        j3Var2.setImeOptions(6);
        j3Var2.setOnEditorActionListener(new m.r2(f7Var2, i10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        e eVar = new e(context, c5Var, true);
        this.X1 = eVar;
        eVar.i(hd.N0(2131744402, null), false, true);
        eVar.setOnClickListener(new e7(this, 1));
        eVar.setEnabled(g1(l3Var.getText().toString()));
        frameLayout.addView(eVar, c8.ma.d(-1, 48.0f, ls.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v1 = 0.2f;
        this.J1 = true;
        this.Q0 = true;
        this.R0 = true;
        g7 g7Var = new g7(this);
        g7Var.m = false;
        g7Var.C = false;
        g7Var.o(nr.h);
        g7Var.n(350L);
        this.o1.setItemAnimator(g7Var);
        ek0 ek0Var = this.o1;
        int i12 = this.u0;
        ek0Var.setPadding(i12, 0, i12, 0);
        this.o1.setOnItemClickListener(new bi.t1(this, context, v5Var, 3));
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(false);
        }
    }

    public static void e1(k7 k7Var, String str) {
        f7 f7Var = k7Var.g2;
        if (str == null || TextUtils.equals(str, k7Var.f2)) {
            return;
        }
        k7Var.f2 = str;
        boolean g12 = k7Var.g1(str);
        org.telegram.messenger.g0.r(f7Var);
        if (g12) {
            if (!k7Var.d2 || k7Var.c2 != null) {
                k7Var.d2 = true;
                k7Var.c2 = null;
                di.f0 f0Var = k7Var.T1;
                if (f0Var != null) {
                    f0Var.O(true);
                }
            }
            org.telegram.messenger.g0.h3(f7Var, 700L);
        } else if (k7Var.d2 || k7Var.c2 != null) {
            k7Var.d2 = false;
            k7Var.c2 = null;
            if (k7Var.e2 != 0) {
                ConnectionsManager.getInstance(k7Var.a).cancelRequest(k7Var.e2, true);
                k7Var.e2 = 0;
            }
            di.f0 f0Var2 = k7Var.T1;
            if (f0Var2 != null) {
                f0Var2.O(true);
            }
        }
        k7Var.X1.setEnabled(g12);
    }

    public static boolean h1(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        di.f0 f0Var = new di.f0(this.o1, getContext(), this.a, 0, true, new d7(this, 0), this.J0, 1);
        this.T1 = f0Var;
        return f0Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return hd.N0(2131744399, null);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ls.w0 || this.b2 == 0) {
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
        ls.f(this.a).n(this, ls.w0);
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
                tg.i0 i0Var = new tg.i0();
                i0Var.c = this.U1.d.getText().toString();
                i0Var.b = this.i2 ? this.V1.d.getText().toString() : null;
                i0Var.d = this.c2;
                i0Var.e = this.k2;
                i0Var.f = this.j2;
                this.a2.a(i0Var);
                this.a2 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        ls.f(this.a).c(this, ls.w0);
        org.telegram.messenger.g0.h3(new f7(this, 2), 150L);
    }
}
