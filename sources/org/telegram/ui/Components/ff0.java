package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ff0 extends FrameLayout {
    public final nh.qb a;
    public final nh.d b;
    public final ht c;
    public x61 d;
    public long e;
    public float f;
    public nh.r3 h;
    public Utilities.Callback n;
    public Runnable r;

    public ff0(Context context, org.telegram.ui.ActionBar.c6 c6Var, ga gaVar) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        lVar.C(-1, false);
        lVar.B(587202559, false);
        lVar.setActionBarMenuOnItemClick(new cg.n1(this, 27));
        addView(lVar, i7.f6.e(-1, -2, 55));
        nh.qb qbVar = new nh.qb(context, null, null, c6Var, gaVar);
        this.a = qbVar;
        qbVar.T0 = true;
        addView(qbVar, i7.f6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        nh.d dVar = new nh.d(context, c6Var, true);
        this.b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, i7.f6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ht htVar = new ht(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.c = htVar;
        htVar.setOnClickListener(new ya0(this, context, c6Var, 2));
        addView(htVar, i7.f6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        qbVar.setDelegate(new oc.i(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, x61 x61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        nh.d dVar = this.b;
        dVar.a = c6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 <= 0 || (i10 = photoEntry.height) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        }
        this.d = x61Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            x61Var.M(j10, false);
        } else {
            this.e = x61Var.o();
        }
        String path = x61Var.B.getPath();
        long q6 = x61Var.q();
        j3.k0 k0Var = x61Var.d;
        k0Var.q0();
        this.a.o(false, path, q6, k0Var.a0);
        long q9 = x61Var.q();
        float max = 2.8f / Math.max(60L, q9);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, x61Var.q()));
        nh.qb qbVar = this.a;
        qbVar.setVideoLeft(max2);
        qbVar.setVideoRight(max2 + max);
        qbVar.V0 = 0L;
        qbVar.W0 = q9;
        nh.lb lbVar = qbVar.h;
        if (lbVar != null) {
            nh.lb.a(lbVar, true);
        }
        qbVar.k();
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
