package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lg0 extends FrameLayout {
    public final ci.wc a;
    public final ci.d b;
    public final fu c;
    public k81 d;
    public long e;
    public float f;
    public ci.z3 h;
    public Utilities.Callback n;
    public Runnable r;

    public lg0(Context context, org.telegram.ui.ActionBar.e6 e6Var, ma maVar) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.D(-1, false);
        kVar.C(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 10));
        addView(kVar, w7.x5.e(-1, -2, 55));
        ci.wc wcVar = new ci.wc(context, null, null, e6Var, maVar);
        this.a = wcVar;
        wcVar.X0 = true;
        addView(wcVar, w7.x5.a(388, 0.0f, 0.0f, 0.0f, 74.0f, -1, 87));
        ci.d dVar = new ci.d(context, e6Var, true);
        this.b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.x5.a(48.0f, 16.0f, 10.0f, 16.0f, 16.0f, -1, 87));
        fu fuVar = new fu(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.c = fuVar;
        fuVar.setOnClickListener(new ai.d0(this, context, e6Var, 26));
        addView(fuVar, w7.x5.a(32.0f, 60.0f, 0.0f, 60.0f, 134.0f, -1, 87));
        wcVar.setDelegate(new org.telegram.ui.ActionBar.b5(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, k81 k81Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        ci.d dVar = this.b;
        dVar.a = e6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 <= 0 || (i10 = photoEntry.height) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        }
        this.d = k81Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.e = j3;
            k81Var.L(j3, false);
        } else {
            this.e = k81Var.n();
        }
        String path = k81Var.F.getPath();
        long p5 = k81Var.p();
        i2.f0 f0Var = k81Var.d;
        f0Var.D1();
        this.a.o(false, path, p5, f0Var.Z);
        long p10 = k81Var.p();
        float max = 2.8f / Math.max(60L, p10);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, k81Var.p()));
        ci.wc wcVar = this.a;
        wcVar.setVideoLeft(max2);
        wcVar.setVideoRight(max2 + max);
        wcVar.Z0 = 0L;
        wcVar.a1 = p10;
        ci.qc qcVar = wcVar.h;
        if (qcVar != null) {
            ci.qc.a(qcVar, true);
        }
        wcVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.n = callback;
    }
}
