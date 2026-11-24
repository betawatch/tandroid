// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b22 extends d22 {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ i22 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b22(i22 i22Var, Context context) {
        super(context);
        this.d = i22Var;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = i22.G4;
        ylb ylbVar = i22Var.J0;
        qz4 qz4Var = new qz4(context);
        qz4Var.d = ylbVar;
        qz4Var.R = true;
        TextView textView = qz4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        qz4Var.b.setVisibility(8);
        qz4Var.b(false);
        bf0 bf0Var = new bf0(context);
        qz4Var.c = bf0Var;
        qz4Var.addView(bf0Var, qoe.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        qz4Var.x = cmb.v0(cmb.Sl, ylbVar);
        qz4Var.s = cmb.v0(cmb.Ql, ylbVar);
        qz4Var.w = cmb.v0(cmb.Rl, ylbVar);
        qz4Var.a();
        this.a = qz4Var;
        qz4Var.getBackupImageView().a.h1 = new qn0((byte) 25);
        addView(this.a, qoe.c(-1.0f, -1));
    }

    public final void a(boolean z) {
        boolean z2 = this.c != null && (-this.b.id) == this.d.T2;
        this.a.f(z2, z);
        p09 y = this.a.getBackupImageView().getImageReceiver().y();
        if (!z) {
            if (y != null) {
                y.stop();
                y.O(false, 0.0f);
                return;
            }
            return;
        }
        if (!z2 || y == null) {
            return;
        }
        y.F(0);
        y.K(-1);
        y.O(false, 0.0f);
        y.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
