package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pe0 extends FrameLayout {
    public final vh.z8 a;
    public final vh.d b;
    public final bt c;
    public u61 d;
    public long e;
    public float f;
    public vh.n2 h;
    public org.telegram.messenger.q20 n;
    public Runnable r;

    public pe0(Context context, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, p6Var);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.setTitle(org.telegram.messenger.cd.L0(2131751206, null));
        lVar.D(-1, false);
        lVar.C(587202559, false);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 6));
        addView(lVar, w7.b6.e(-1, -2, 55));
        vh.z8 z8Var = new vh.z8(context, null, null, p6Var, s9Var);
        this.a = z8Var;
        z8Var.X0 = true;
        addView(z8Var, w7.b6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        vh.d dVar = new vh.d(context, p6Var, true);
        this.b = dVar;
        dVar.i(org.telegram.messenger.cd.L0(2131751207, null), false, true);
        dVar.f();
        addView(dVar, w7.b6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        bt btVar = new bt(context, org.telegram.messenger.cd.L0(2131751208, null));
        this.c = btVar;
        btVar.setOnClickListener(new ag.i(this, context, p6Var, 20));
        addView(btVar, w7.b6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        z8Var.setDelegate(new m5.e(this));
    }

    public final void a(org.telegram.messenger.ef efVar, u61 u61Var, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        vh.d dVar = this.b;
        dVar.a = p6Var;
        dVar.E = false;
        dVar.updateColors();
        int i11 = efVar.F;
        if (i11 <= 0 || (i10 = efVar.G) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.i(i10 / i11, 1.39f, 0.85f);
        }
        this.d = u61Var;
        long j10 = efVar.d;
        if (j10 >= 0) {
            this.e = j10;
            u61Var.q0(j10, false);
        } else {
            this.e = u61Var.S();
        }
        String path = u61Var.F.getPath();
        long U = u61Var.U();
        i2.i0 i0Var = u61Var.d;
        i0Var.F1();
        this.a.o(false, path, U, i0Var.b0);
        long U2 = u61Var.U();
        float max = 2.8f / Math.max(60L, U2);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, u61Var.U()));
        vh.z8 z8Var = this.a;
        z8Var.setVideoLeft(max2);
        z8Var.setVideoRight(max2 + max);
        z8Var.Z0 = 0L;
        z8Var.a1 = U2;
        vh.u8 u8Var = z8Var.h;
        if (u8Var != null) {
            vh.u8.a(u8Var, true);
        }
        z8Var.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.q20 q20Var) {
        this.n = q20Var;
    }
}
