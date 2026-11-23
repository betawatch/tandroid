package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fe0 extends FrameLayout {
    public final hi.cb a;
    public final hi.e b;
    public final et c;
    public i61 d;
    public long e;
    public float f;
    public hi.h3 h;
    public org.telegram.messenger.y10 n;
    public Runnable r;

    public fe0(Context context, org.telegram.ui.ActionBar.h6 h6Var, ca caVar) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, h6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(org.telegram.messenger.hd.N0(2131751193, null));
        kVar.G(-1, false);
        kVar.F(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 18));
        addView(kVar, c8.ma.e(-1, -2, 55));
        hi.cb cbVar = new hi.cb(context, null, null, h6Var, caVar);
        this.a = cbVar;
        cbVar.Y0 = true;
        addView(cbVar, c8.ma.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        hi.e eVar = new hi.e(context, h6Var, true);
        this.b = eVar;
        eVar.i(org.telegram.messenger.hd.N0(2131751194, null), false, true);
        eVar.f();
        addView(eVar, c8.ma.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        et etVar = new et(context, org.telegram.messenger.hd.N0(2131751195, null));
        this.c = etVar;
        etVar.setOnClickListener(new st(this, context, h6Var, 5));
        addView(etVar, c8.ma.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        cbVar.setDelegate(new ji.l(this));
    }

    public final void a(org.telegram.messenger.ff ffVar, i61 i61Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        hi.e eVar = this.b;
        eVar.a = h6Var;
        eVar.F = false;
        eVar.updateColors();
        int i10 = ffVar.F;
        if (i10 <= 0 || (i7 = ffVar.G) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        }
        this.d = i61Var;
        long j3 = ffVar.d;
        if (j3 >= 0) {
            this.e = j3;
            i61Var.q0(j3, false);
        } else {
            this.e = i61Var.S();
        }
        String path = i61Var.G.getPath();
        long U = i61Var.U();
        l2.f0 f0Var = i61Var.d;
        f0Var.F1();
        this.a.o(false, path, U, f0Var.b0);
        long U2 = i61Var.U();
        float max = 2.8f / Math.max(60L, U2);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, i61Var.U()));
        hi.cb cbVar = this.a;
        cbVar.setVideoLeft(max2);
        cbVar.setVideoRight(max2 + max);
        cbVar.a1 = 0L;
        cbVar.b1 = U2;
        hi.xa xaVar = cbVar.h;
        if (xaVar != null) {
            hi.xa.a(xaVar, true);
        }
        cbVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.y10 y10Var) {
        this.n = y10Var;
    }
}
