package hi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l7 extends org.telegram.ui.Components.ja implements is {
    public di.f0 T1;
    public final org.telegram.ui.Cells.k3 U1;
    public final org.telegram.ui.Cells.k3 V1;
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
    public final f7 g2;
    public Pattern h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;

    public l7(Context context, e5 e5Var, x5 x5Var, ai.v1 v1Var) {
        super(context, null, true, true, 2, e5Var);
        this.g2 = new f7(this, 0);
        this.a2 = v1Var;
        O();
        Y0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131744632, null), true, false, -1, e5Var);
        this.U1 = k3Var;
        int i7 = 1;
        f7 f7Var = new f7(this, i7);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        int i10 = 2;
        i3Var.setOnEditorActionListener(new m.r2(f7Var, i10));
        i3Var.setHandlesColor(-12476440);
        i3Var.setCursorColor(-11230757);
        i3Var.setText("https://");
        i3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131747435, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.j6.o6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.q6.U(textView, i11, e5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.j6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.12f, i11);
        org.telegram.ui.ActionBar.m6 K2 = org.telegram.ui.ActionBar.q6.K(0.15f, i11);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView, k02, K, K2, e5Var);
        c8.na.b(textView, 0.1f, 1.5f);
        k3Var.addView(textView, c8.ja.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        h4 h4Var = new h4(12, this, textView);
        textView.setOnClickListener(new ai.v2(21, this, h4Var));
        h4Var.run();
        i3Var.addTextChangedListener(new bi.v(7, this, h4Var));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, hd.M0(2131744636, null), true, false, -1, e5Var);
        this.V1 = k3Var2;
        f7 f7Var2 = new f7(this, i7);
        org.telegram.ui.Cells.i3 i3Var2 = k3Var2.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.r2(f7Var2, i10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        d dVar = new d(context, e5Var, true);
        this.X1 = dVar;
        dVar.i(hd.M0(2131744645, null), false, true);
        dVar.setOnClickListener(new e7(this, 1));
        dVar.setEnabled(f1(k3Var.getText().toString()));
        frameLayout.addView(dVar, c8.ja.d(-1, 48.0f, ns.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v1 = 0.2f;
        this.J1 = true;
        this.Q0 = true;
        this.R0 = true;
        h7 h7Var = new h7(this);
        h7Var.m = false;
        h7Var.C = false;
        h7Var.o(er.h);
        h7Var.n(350L);
        this.o1.setItemAnimator(h7Var);
        uj0 uj0Var = this.o1;
        int i12 = this.u0;
        uj0Var.setPadding(i12, 0, i12, 0);
        this.o1.setOnItemClickListener(new fi.f0(this, context, x5Var, i10));
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(false);
        }
    }

    public static void d1(l7 l7Var, String str) {
        f7 f7Var = l7Var.g2;
        if (str == null || TextUtils.equals(str, l7Var.f2)) {
            return;
        }
        l7Var.f2 = str;
        boolean f12 = l7Var.f1(str);
        org.telegram.messenger.g0.r(f7Var);
        if (f12) {
            if (!l7Var.d2 || l7Var.c2 != null) {
                l7Var.d2 = true;
                l7Var.c2 = null;
                di.f0 f0Var = l7Var.T1;
                if (f0Var != null) {
                    f0Var.O(true);
                }
            }
            org.telegram.messenger.g0.i3(f7Var, 700L);
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
        l7Var.X1.setEnabled(f12);
    }

    public static boolean g1(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        di.f0 f0Var = new di.f0(this.o1, getContext(), this.a, 0, true, new q4(this, 1), this.J0, 1);
        this.T1 = f0Var;
        return f0Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(2131744642, null);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ns.w0 || this.b2 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
            if (webPage != null && this.b2 == webPage.id) {
                if (g1(webPage)) {
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

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.U1.d);
        org.telegram.messenger.g0.v1(this.V1.d);
        super.dismiss();
        ns.f(this.a).n(this, ns.w0);
    }

    public final void e1() {
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

    public final boolean f1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.h2 == null) {
            this.h2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.h2.matcher(str).find();
    }

    public final void h1() {
        if (this.X1.d0) {
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

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        ns.f(this.a).c(this, ns.w0);
        org.telegram.messenger.g0.i3(new f7(this, 2), 150L);
    }
}
