package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vd0 extends FrameLayout {
    public final fi.fb a;
    public final fi.d b;
    public final ps c;
    public u51 d;
    public long e;
    public float f;
    public fi.j3 h;
    public org.telegram.messenger.c20 n;
    public Runnable r;

    public vd0(Context context, org.telegram.ui.ActionBar.g6 g6Var, y9 y9Var) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(org.telegram.messenger.id.M0(2131751205, null));
        kVar.E(-1, false);
        kVar.D(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 15));
        addView(kVar, c8.ha.e(-1, -2, 55));
        fi.fb fbVar = new fi.fb(context, null, null, g6Var, y9Var);
        this.a = fbVar;
        fbVar.X0 = true;
        addView(fbVar, c8.ha.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        fi.d dVar = new fi.d(context, g6Var, true);
        this.b = dVar;
        dVar.i(org.telegram.messenger.id.M0(2131751206, null), false, true);
        dVar.f();
        addView(dVar, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ps psVar = new ps(context, org.telegram.messenger.id.M0(2131751207, null));
        this.c = psVar;
        psVar.setOnClickListener(new ud0(this, context, g6Var, 0));
        addView(psVar, c8.ha.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        fbVar.setDelegate(new j2.n(this));
    }

    public final void a(org.telegram.messenger.gf gfVar, u51 u51Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i7;
        fi.d dVar = this.b;
        dVar.a = g6Var;
        dVar.E = false;
        dVar.updateColors();
        int i10 = gfVar.F;
        if (i10 <= 0 || (i7 = gfVar.G) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        }
        this.d = u51Var;
        long j3 = gfVar.d;
        if (j3 >= 0) {
            this.e = j3;
            u51Var.q0(j3, false);
        } else {
            this.e = u51Var.S();
        }
        String path = u51Var.F.getPath();
        long U = u51Var.U();
        l2.i0 i0Var = u51Var.d;
        i0Var.F1();
        this.a.o(false, path, U, i0Var.b0);
        long U2 = u51Var.U();
        float max = 2.8f / Math.max(60L, U2);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, u51Var.U()));
        fi.fb fbVar = this.a;
        fbVar.setVideoLeft(max2);
        fbVar.setVideoRight(max2 + max);
        fbVar.Z0 = 0L;
        fbVar.a1 = U2;
        fi.ab abVar = fbVar.h;
        if (abVar != null) {
            fi.ab.a(abVar, true);
        }
        fbVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.c20 c20Var) {
        this.n = c20Var;
    }
}
