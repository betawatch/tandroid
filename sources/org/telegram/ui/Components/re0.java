package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class re0 extends FrameLayout {
    public final kh.gc a;
    public final kh.d b;
    public final bt c;
    public k61 d;
    public long e;
    public float f;
    public kh.u3 h;
    public Utilities.Callback n;
    public Runnable r;

    public re0(Context context, org.telegram.ui.ActionBar.b6 b6Var, ba baVar) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.A(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 5));
        addView(kVar, g7.e6.e(-1, -2, 55));
        kh.gc gcVar = new kh.gc(context, null, null, b6Var, baVar);
        this.a = gcVar;
        gcVar.T0 = true;
        addView(gcVar, g7.e6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, g7.e6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        bt btVar = new bt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.c = btVar;
        btVar.setOnClickListener(new gd0(this, context, b6Var, 1));
        addView(btVar, g7.e6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        gcVar.setDelegate(new org.telegram.ui.Cells.e3(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, k61 k61Var, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9;
        kh.d dVar = this.b;
        dVar.a = b6Var;
        dVar.j();
        int i10 = photoEntry.width;
        if (i10 <= 0 || (i9 = photoEntry.height) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.clamp(i9 / i10, 1.39f, 0.85f);
        }
        this.d = k61Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            k61Var.M(j10, false);
        } else {
            this.e = k61Var.o();
        }
        String path = k61Var.B.getPath();
        long q10 = k61Var.q();
        h3.k0 k0Var = k61Var.d;
        k0Var.q0();
        this.a.o(false, path, q10, k0Var.a0);
        long q11 = k61Var.q();
        float max = 2.8f / Math.max(60L, q11);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, k61Var.q()));
        kh.gc gcVar = this.a;
        gcVar.setVideoLeft(max2);
        gcVar.setVideoRight(max2 + max);
        gcVar.V0 = 0L;
        gcVar.W0 = q11;
        kh.bc bcVar = gcVar.h;
        if (bcVar != null) {
            kh.bc.a(bcVar, true);
        }
        gcVar.k();
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
