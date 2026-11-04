package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class od0 extends FrameLayout {
    public final gi.fb a;
    public final gi.d b;
    public final ps c;
    public m51 d;
    public long e;
    public float f;
    public gi.h3 h;
    public org.telegram.messenger.u10 n;
    public Runnable r;

    public od0(Context context, org.telegram.ui.ActionBar.e6 e6Var, x9 x9Var) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(org.telegram.messenger.bd.M0(2131751206, null));
        kVar.D(-1, false);
        kVar.C(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 16));
        addView(kVar, b8.mf.e(-1, -2, 55));
        gi.fb fbVar = new gi.fb(context, null, null, e6Var, x9Var);
        this.a = fbVar;
        fbVar.Y0 = true;
        addView(fbVar, b8.mf.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.b = dVar;
        dVar.i(org.telegram.messenger.bd.M0(2131751207, null), false, true);
        dVar.f();
        addView(dVar, b8.mf.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ps psVar = new ps(context, org.telegram.messenger.bd.M0(2131751208, null));
        this.c = psVar;
        psVar.setOnClickListener(new ct(this, context, e6Var, 5));
        addView(psVar, b8.mf.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        fbVar.setDelegate(new mi.h0(this));
    }

    public final void a(org.telegram.messenger.ye yeVar, m51 m51Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        gi.d dVar = this.b;
        dVar.a = e6Var;
        dVar.F = false;
        dVar.updateColors();
        int i10 = yeVar.F;
        if (i10 <= 0 || (i3 = yeVar.G) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.i(i3 / i10, 1.39f, 0.85f);
        }
        this.d = m51Var;
        long j10 = yeVar.d;
        if (j10 >= 0) {
            this.e = j10;
            m51Var.q0(j10, false);
        } else {
            this.e = m51Var.S();
        }
        String path = m51Var.G.getPath();
        long U = m51Var.U();
        k2.i0 i0Var = m51Var.d;
        i0Var.F1();
        this.a.o(false, path, U, i0Var.b0);
        long U2 = m51Var.U();
        float max = 2.8f / Math.max(60L, U2);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, m51Var.U()));
        gi.fb fbVar = this.a;
        fbVar.setVideoLeft(max2);
        fbVar.setVideoRight(max2 + max);
        fbVar.a1 = 0L;
        fbVar.b1 = U2;
        gi.ab abVar = fbVar.h;
        if (abVar != null) {
            gi.ab.a(abVar, true);
        }
        fbVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.u10 u10Var) {
        this.n = u10Var;
    }
}
