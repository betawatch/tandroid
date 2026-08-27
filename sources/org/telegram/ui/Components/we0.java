package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class we0 extends FrameLayout {
    public final lh.cc a;
    public final lh.d b;
    public final at c;
    public m61 d;
    public long e;
    public float f;
    public lh.t3 h;
    public Utilities.Callback n;
    public Runnable r;

    public we0(Context context, org.telegram.ui.ActionBar.c6 c6Var, z9 z9Var) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.D(-1, false);
        kVar.C(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 6));
        addView(kVar, h7.z5.e(-1, -2, 55));
        lh.cc ccVar = new lh.cc(context, null, null, c6Var, z9Var);
        this.a = ccVar;
        ccVar.T0 = true;
        addView(ccVar, h7.z5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        lh.d dVar = new lh.d(context, c6Var, true);
        this.b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, h7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        at atVar = new at(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.c = atVar;
        atVar.setOnClickListener(new ld0(this, context, c6Var, 1));
        addView(atVar, h7.z5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        ccVar.setDelegate(new org.telegram.ui.i6(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, m61 m61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        lh.d dVar = this.b;
        dVar.a = c6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 <= 0 || (i10 = photoEntry.height) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        }
        this.d = m61Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            m61Var.M(j10, false);
        } else {
            this.e = m61Var.o();
        }
        String path = m61Var.B.getPath();
        long q6 = m61Var.q();
        h3.k0 k0Var = m61Var.d;
        k0Var.q0();
        this.a.o(false, path, q6, k0Var.a0);
        long q9 = m61Var.q();
        float max = 2.8f / Math.max(60L, q9);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, m61Var.q()));
        lh.cc ccVar = this.a;
        ccVar.setVideoLeft(max2);
        ccVar.setVideoRight(max2 + max);
        ccVar.V0 = 0L;
        ccVar.W0 = q9;
        lh.xb xbVar = ccVar.h;
        if (xbVar != null) {
            lh.xb.a(xbVar, true);
        }
        ccVar.k();
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
