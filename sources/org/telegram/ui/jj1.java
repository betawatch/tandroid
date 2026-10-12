package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jj1 implements org.telegram.ui.Components.q91 {
    public final /* synthetic */ WallpapersListActivity a;

    public jj1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.q91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        ce1 ce1Var = new ce1(new qj1(file, file, ""), bitmap, false);
        ce1Var.c1(0L);
        this.a.presentFragment(ce1Var, z10);
    }

    @Override // org.telegram.ui.Components.q91
    public final void a() {
    }
}
