package gi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.regex.Pattern;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m7 extends org.telegram.ui.Components.ma implements cs {
    public ci.j0 Q1;
    public final org.telegram.ui.Cells.k3 R1;
    public final org.telegram.ui.Cells.k3 S1;
    public final FrameLayout T1;
    public final d U1;
    public boolean V1;
    public boolean W1;
    public ai.o1 X1;
    public long Y1;
    public TLRPC.WebPage Z1;
    public boolean a2;
    public int b2;
    public String c2;
    public final h7 d2;
    public Pattern e2;
    public boolean f2;
    public boolean g2;
    public boolean h2;

    public m7(Context context, e5 e5Var, y5 y5Var, ai.o1 o1Var) {
        super(context, null, true, true, 2, e5Var);
        this.d2 = new h7(this, 0);
        this.X1 = o1Var;
        N();
        Y0();
        this.A1 = org.telegram.messenger.g0.L(4.0f);
        this.B1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, bd.M0(2131744642, null), true, false, -1, e5Var);
        this.R1 = k3Var;
        int i3 = 1;
        h7 h7Var = new h7(this, i3);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        int i10 = 2;
        i3Var.setOnEditorActionListener(new m.r2(h7Var, i10));
        i3Var.setHandlesColor(-12476440);
        i3Var.setCursorColor(-11230757);
        i3Var.setText("https://");
        i3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131747443, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.k6.o6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.r6.V(textView, i11, e5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i11);
        org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i11);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, L2, L3, e5Var);
        pf.b(textView, 0.1f, 1.5f);
        k3Var.addView(textView, mf.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        g2.c cVar = new g2.c(23, this, textView);
        textView.setOnClickListener(new ai.d(20, this, cVar));
        cVar.run();
        i3Var.addTextChangedListener(new ai.a0(7, this, cVar));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, bd.M0(2131744646, null), true, false, -1, e5Var);
        this.S1 = k3Var2;
        h7 h7Var2 = new h7(this, i3);
        org.telegram.ui.Cells.i3 i3Var2 = k3Var2.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.r2(h7Var2, i10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        d dVar = new d(context, e5Var, true);
        this.U1 = dVar;
        dVar.i(bd.M0(2131744655, null), false, true);
        dVar.setOnClickListener(new g7(this, 1));
        dVar.setEnabled(f1(k3Var.getText().toString()));
        frameLayout.addView(dVar, mf.d(-1, 48.0f, hs.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        this.s1 = 0.2f;
        this.G1 = true;
        this.Q0 = true;
        this.R0 = true;
        i7 i7Var = new i7(this);
        i7Var.m = false;
        i7Var.C = false;
        i7Var.o(xq.h);
        i7Var.n(350L);
        this.l1.setItemAnimator(i7Var);
        tj0 tj0Var = this.l1;
        int i12 = this.u0;
        tj0Var.setPadding(i12, 0, i12, 0);
        this.l1.setOnItemClickListener(new ei.h0(this, context, y5Var, i10));
        ci.j0 j0Var = this.Q1;
        if (j0Var != null) {
            j0Var.O(false);
        }
    }

    public static void d1(m7 m7Var, String str) {
        h7 h7Var = m7Var.d2;
        if (str == null || TextUtils.equals(str, m7Var.c2)) {
            return;
        }
        m7Var.c2 = str;
        boolean f12 = m7Var.f1(str);
        org.telegram.messenger.g0.r(h7Var);
        if (f12) {
            if (!m7Var.a2 || m7Var.Z1 != null) {
                m7Var.a2 = true;
                m7Var.Z1 = null;
                ci.j0 j0Var = m7Var.Q1;
                if (j0Var != null) {
                    j0Var.O(true);
                }
            }
            org.telegram.messenger.g0.i3(h7Var, 700L);
        } else if (m7Var.a2 || m7Var.Z1 != null) {
            m7Var.a2 = false;
            m7Var.Z1 = null;
            if (m7Var.b2 != 0) {
                ConnectionsManager.getInstance(m7Var.a).cancelRequest(m7Var.b2, true);
                m7Var.b2 = 0;
            }
            ci.j0 j0Var2 = m7Var.Q1;
            if (j0Var2 != null) {
                j0Var2.O(true);
            }
        }
        m7Var.U1.setEnabled(f12);
    }

    public static boolean g1(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        ci.j0 j0Var = new ci.j0(this.l1, getContext(), this.a, 0, true, new q4(this, 1), this.J0, 1);
        this.Q1 = j0Var;
        return j0Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(2131744652, null);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != hs.w0 || this.Y1 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
            if (webPage != null && this.Y1 == webPage.id) {
                if (g1(webPage)) {
                    webPage = null;
                }
                this.Z1 = webPage;
                this.a2 = false;
                this.Y1 = 0L;
                ci.j0 j0Var = this.Q1;
                if (j0Var != null) {
                    j0Var.O(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.R1.d);
        org.telegram.messenger.g0.v1(this.S1.d);
        super.dismiss();
        hs.f(this.a).n(this, hs.w0);
    }

    public final void e1() {
        this.a2 = false;
        this.Z1 = null;
        if (this.b2 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.b2, true);
            this.b2 = 0;
        }
        ci.j0 j0Var = this.Q1;
        if (j0Var != null) {
            j0Var.O(true);
        }
    }

    public final boolean f1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.e2 == null) {
            this.e2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.e2.matcher(str).find();
    }

    public final void h1() {
        if (this.U1.d0) {
            if (this.X1 != null) {
                ug.g0 g0Var = new ug.g0();
                g0Var.c = this.R1.d.getText().toString();
                g0Var.b = this.f2 ? this.S1.d.getText().toString() : null;
                g0Var.d = this.Z1;
                g0Var.e = this.h2;
                g0Var.f = this.g2;
                this.X1.a(g0Var);
                this.X1 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        hs.f(this.a).c(this, hs.w0);
        org.telegram.messenger.g0.i3(new h7(this, 2), 150L);
    }
}
