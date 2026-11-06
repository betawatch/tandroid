package fi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class m7 extends org.telegram.ui.Components.na implements ls {
    public bi.o0 P1;
    public final org.telegram.ui.Cells.k3 Q1;
    public final org.telegram.ui.Cells.k3 R1;
    public final FrameLayout S1;
    public final d T1;
    public boolean U1;
    public boolean V1;
    public ai.f1 W1;
    public long X1;
    public TLRPC.WebPage Y1;
    public boolean Z1;
    public int a2;
    public String b2;
    public final g7 c2;
    public Pattern d2;
    public boolean e2;
    public boolean f2;
    public boolean g2;

    public m7(Context context, g5 g5Var, y5 y5Var, ai.f1 f1Var) {
        super(context, null, true, true, 2, g5Var);
        int i7 = 0;
        this.c2 = new g7(this, i7);
        this.W1 = f1Var;
        N();
        Y0();
        this.z1 = org.telegram.messenger.g0.L(4.0f);
        this.A1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131744633, null), true, false, -1, g5Var);
        this.Q1 = k3Var;
        int i10 = 1;
        g7 g7Var = new g7(this, i10);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        int i11 = 2;
        i3Var.setOnEditorActionListener(new m.s2(g7Var, i11));
        i3Var.setHandlesColor(-12476440);
        i3Var.setCursorColor(-11230757);
        i3Var.setText("https://");
        i3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131747434, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.k6.o6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.I0);
        org.telegram.ui.ActionBar.r6.V(textView, i12, g5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i12);
        org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i12);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, L2, L3, g5Var);
        c8.ka.b(textView, 0.1f, 1.5f);
        k3Var.addView(textView, c8.ha.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        f2.h hVar = new f2.h(17, this, textView);
        textView.setOnClickListener(new bi.r(14, this, hVar));
        hVar.run();
        i3Var.addTextChangedListener(new h7(i7, this, hVar));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, hd.M0(2131744637, null), true, false, -1, g5Var);
        this.R1 = k3Var2;
        g7 g7Var2 = new g7(this, i10);
        org.telegram.ui.Cells.i3 i3Var2 = k3Var2.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.s2(g7Var2, i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        d dVar = new d(context, g5Var, true);
        this.T1 = dVar;
        dVar.i(hd.M0(2131744646, null), false, true);
        dVar.setOnClickListener(new f7(this, 1));
        dVar.setEnabled(f1(k3Var.getText().toString()));
        frameLayout.addView(dVar, c8.ha.d(-1, 48.0f, qs.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        this.r1 = 0.2f;
        this.F1 = true;
        this.P0 = true;
        this.Q0 = true;
        i7 i7Var = new i7(this);
        i7Var.m = false;
        i7Var.C = false;
        i7Var.o(xq.h);
        i7Var.n(350L);
        this.k1.setItemAnimator(i7Var);
        pj0 pj0Var = this.k1;
        int i13 = this.t0;
        pj0Var.setPadding(i13, 0, i13, 0);
        this.k1.setOnItemClickListener(new di.f0(this, context, y5Var, i11));
        bi.o0 o0Var = this.P1;
        if (o0Var != null) {
            o0Var.O(false);
        }
    }

    public static void d1(m7 m7Var, String str) {
        g7 g7Var = m7Var.c2;
        if (str == null || TextUtils.equals(str, m7Var.b2)) {
            return;
        }
        m7Var.b2 = str;
        boolean f12 = m7Var.f1(str);
        org.telegram.messenger.g0.r(g7Var);
        if (f12) {
            if (!m7Var.Z1 || m7Var.Y1 != null) {
                m7Var.Z1 = true;
                m7Var.Y1 = null;
                bi.o0 o0Var = m7Var.P1;
                if (o0Var != null) {
                    o0Var.O(true);
                }
            }
            org.telegram.messenger.g0.i3(g7Var, 700L);
        } else if (m7Var.Z1 || m7Var.Y1 != null) {
            m7Var.Z1 = false;
            m7Var.Y1 = null;
            if (m7Var.a2 != 0) {
                ConnectionsManager.getInstance(m7Var.a).cancelRequest(m7Var.a2, true);
                m7Var.a2 = 0;
            }
            bi.o0 o0Var2 = m7Var.P1;
            if (o0Var2 != null) {
                o0Var2.O(true);
            }
        }
        m7Var.T1.setEnabled(f12);
    }

    public static boolean g1(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        bi.o0 o0Var = new bi.o0(this.k1, getContext(), this.a, 0, true, new ai.e(this, 21), this.I0, 1);
        this.P1 = o0Var;
        return o0Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return hd.M0(2131744643, null);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != qs.w0 || this.X1 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
            if (webPage != null && this.X1 == webPage.id) {
                if (g1(webPage)) {
                    webPage = null;
                }
                this.Y1 = webPage;
                this.Z1 = false;
                this.X1 = 0L;
                bi.o0 o0Var = this.P1;
                if (o0Var != null) {
                    o0Var.O(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.Q1.d);
        org.telegram.messenger.g0.v1(this.R1.d);
        super.dismiss();
        qs.f(this.a).n(this, qs.w0);
    }

    public final void e1() {
        this.Z1 = false;
        this.Y1 = null;
        if (this.a2 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.a2, true);
            this.a2 = 0;
        }
        bi.o0 o0Var = this.P1;
        if (o0Var != null) {
            o0Var.O(true);
        }
    }

    public final boolean f1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.d2 == null) {
            this.d2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.d2.matcher(str).find();
    }

    public final void h1() {
        if (this.T1.c0) {
            if (this.W1 != null) {
                tg.h0 h0Var = new tg.h0();
                h0Var.c = this.Q1.d.getText().toString();
                h0Var.b = this.e2 ? this.R1.d.getText().toString() : null;
                h0Var.d = this.Y1;
                h0Var.e = this.g2;
                h0Var.f = this.f2;
                this.W1.a(h0Var);
                this.W1 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        qs.f(this.a).c(this, qs.w0);
        org.telegram.messenger.g0.i3(new g7(this, 2), 150L);
    }
}
