package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class tf0 extends FrameLayout {
    public final ci.zc a;
    public final ci.d b;
    public final pt c;
    public u71 d;
    public long e;
    public float f;
    public ci.b4 h;
    public Utilities.Callback n;
    public Runnable r;

    public tf0(Context context, org.telegram.ui.ActionBar.e6 e6Var, ja jaVar) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.B(-1, false);
        kVar.A(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 10));
        addView(kVar, w7.y5.e(-1, -2, 55));
        ci.zc zcVar = new ci.zc(context, null, null, e6Var, jaVar);
        this.a = zcVar;
        zcVar.X0 = true;
        addView(zcVar, w7.y5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ci.d dVar = new ci.d(context, e6Var, true);
        this.b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.y5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        pt ptVar = new pt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.c = ptVar;
        ptVar.setOnClickListener(new ai.d0(this, context, e6Var, 26));
        addView(ptVar, w7.y5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        zcVar.setDelegate(new n7.z0(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, u71 u71Var, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.d = u71Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.e = j3;
            u71Var.L(j3, false);
        } else {
            this.e = u71Var.n();
        }
        String path = u71Var.F.getPath();
        long p5 = u71Var.p();
        i2.e0 e0Var = u71Var.d;
        e0Var.B1();
        this.a.o(false, path, p5, e0Var.Z);
        long p10 = u71Var.p();
        float max = 2.8f / Math.max(60L, p10);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, u71Var.p()));
        ci.zc zcVar = this.a;
        zcVar.setVideoLeft(max2);
        zcVar.setVideoRight(max2 + max);
        zcVar.Z0 = 0L;
        zcVar.a1 = p10;
        ci.tc tcVar = zcVar.h;
        if (tcVar != null) {
            ci.tc.a(tcVar, true);
        }
        zcVar.k();
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
