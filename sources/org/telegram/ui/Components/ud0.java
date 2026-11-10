package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ud0 extends FrameLayout {
    public final fi.fb a;
    public final fi.d b;
    public final os c;
    public t51 d;
    public long e;
    public float f;
    public fi.j3 h;
    public org.telegram.messenger.c20 n;
    public Runnable r;

    public ud0(Context context, org.telegram.ui.ActionBar.h6 h6Var, x9 x9Var) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, h6Var);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.setTitle(org.telegram.messenger.id.M0(2131751205, null));
        lVar.G(-1, false);
        lVar.E(587202559, false);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 15));
        addView(lVar, c8.ha.e(-1, -2, 55));
        fi.fb fbVar = new fi.fb(context, null, null, h6Var, x9Var);
        this.a = fbVar;
        fbVar.X0 = true;
        addView(fbVar, c8.ha.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        fi.d dVar = new fi.d(context, h6Var, true);
        this.b = dVar;
        dVar.i(org.telegram.messenger.id.M0(2131751206, null), false, true);
        dVar.f();
        addView(dVar, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        os osVar = new os(context, org.telegram.messenger.id.M0(2131751207, null));
        this.c = osVar;
        osVar.setOnClickListener(new td0(this, context, h6Var, 0));
        addView(osVar, c8.ha.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        fbVar.setDelegate(new j2.n(this));
    }

    public final void a(org.telegram.messenger.gf gfVar, t51 t51Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        fi.d dVar = this.b;
        dVar.a = h6Var;
        dVar.E = false;
        dVar.updateColors();
        int i10 = gfVar.F;
        if (i10 <= 0 || (i7 = gfVar.G) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        }
        this.d = t51Var;
        long j3 = gfVar.d;
        if (j3 >= 0) {
            this.e = j3;
            t51Var.q0(j3, false);
        } else {
            this.e = t51Var.S();
        }
        String path = t51Var.F.getPath();
        long U = t51Var.U();
        l2.i0 i0Var = t51Var.d;
        i0Var.F1();
        this.a.o(false, path, U, i0Var.b0);
        long U2 = t51Var.U();
        float max = 2.8f / Math.max(60L, U2);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, t51Var.U()));
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
