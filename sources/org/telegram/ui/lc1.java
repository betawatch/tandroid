package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lc1 implements org.telegram.ui.Components.p71 {
    public final /* synthetic */ WallpapersListActivity a;

    public lc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.p71
    public final void b(File file, Bitmap bitmap, boolean z10) {
        v71 v71Var = new v71(new qc1(file, file, ""), bitmap, false);
        v71Var.h1(0L);
        this.a.presentFragment(v71Var, z10);
    }

    @Override // org.telegram.ui.Components.p71
    public final void a() {
    }
}
