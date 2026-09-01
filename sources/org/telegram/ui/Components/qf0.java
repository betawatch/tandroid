package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qf0 extends FrameLayout {
    public final qh.ma a;
    public final qh.d b;
    public final nt c;
    public k71 d;
    public long e;
    public float f;
    public qh.d3 h;
    public Utilities.Callback n;
    public Runnable r;

    public qf0(Context context, org.telegram.ui.ActionBar.g6 g6Var, ba baVar) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.B(587202559, false);
        kVar.setActionBarMenuOnItemClick(new fg.l1(this, 27));
        addView(kVar, k7.c6.e(-1, -2, 55));
        qh.ma maVar = new qh.ma(context, null, null, g6Var, baVar);
        this.a = maVar;
        maVar.U0 = true;
        addView(maVar, k7.c6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, k7.c6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        nt ntVar = new nt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.c = ntVar;
        ntVar.setOnClickListener(new eg.o(this, context, g6Var, 29));
        addView(ntVar, k7.c6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        maVar.setDelegate(new n7.qa(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, k71 k71Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        qh.d dVar = this.b;
        dVar.a = g6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 <= 0 || (i10 = photoEntry.height) <= 0) {
            this.f = 1.39f;
        } else {
            this.f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        }
        this.d = k71Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            k71Var.L(j10, false);
        } else {
            this.e = k71Var.n();
        }
        String path = k71Var.C.getPath();
        long p10 = k71Var.p();
        j3.f0 f0Var = k71Var.d;
        f0Var.j0();
        this.a.o(false, path, p10, f0Var.Y);
        long p11 = k71Var.p();
        float max = 2.8f / Math.max(60L, p11);
        float max2 = (1.0f - max) * (this.e / Math.max(1L, k71Var.p()));
        qh.ma maVar = this.a;
        maVar.setVideoLeft(max2);
        maVar.setVideoRight(max2 + max);
        maVar.W0 = 0L;
        maVar.X0 = p11;
        qh.ha haVar = maVar.h;
        if (haVar != null) {
            qh.ha.a(haVar, true);
        }
        maVar.k();
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
