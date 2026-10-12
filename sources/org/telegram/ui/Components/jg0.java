package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jg0 extends FrameLayout {
    public final di.uc a;
    public final di.d b;
    public final cu c;
    public h81 d;
    public long e;
    public float f;
    public di.z3 h;
    public Utilities.Callback n;
    public Runnable r;

    public jg0(Context context, org.telegram.ui.ActionBar.c6 c6Var, la laVar) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.D(-1, false);
        kVar.B(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 12));
        addView(kVar, w7.a6.e(-1, -2, 55));
        di.uc ucVar = new di.uc(context, null, null, c6Var, laVar);
        this.a = ucVar;
        ucVar.X0 = true;
        addView(ucVar, w7.a6.a(388, 0.0f, 0.0f, 0.0f, 74.0f, -1, 87));
        di.d dVar = new di.d(context, c6Var, true);
        this.b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.a6.a(48.0f, 16.0f, 10.0f, 16.0f, 16.0f, -1, 87));
        cu cuVar = new cu(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.c = cuVar;
        cuVar.setOnClickListener(new bi.x(this, context, c6Var, 26));
        addView(cuVar, w7.a6.a(32.0f, 60.0f, 0.0f, 60.0f, 134.0f, -1, 87));
        ucVar.setDelegate(new m4.c(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, h81 h81Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        di.d dVar = this.b;
        dVar.a = c6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 <= 0 || (i10 = photoEntry.height) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        }
        this.d = h81Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            h81Var.L(j10, false);
        } else {
            this.e = h81Var.n();
        }
        String path = h81Var.F.getPath();
        long p5 = h81Var.p();
        i2.h0 h0Var = h81Var.d;
        h0Var.F1();
        this.a.o(false, path, p5, h0Var.b0);
        long p9 = h81Var.p();
        float max = 2.8f / Math.max(60L, p9);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, h81Var.p()));
        di.uc ucVar = this.a;
        ucVar.setVideoLeft(max2);
        ucVar.setVideoRight(max2 + max);
        ucVar.Z0 = 0L;
        ucVar.a1 = p9;
        di.pc pcVar = ucVar.h;
        if (pcVar != null) {
            di.pc.a(pcVar, true);
        }
        ucVar.k();
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
