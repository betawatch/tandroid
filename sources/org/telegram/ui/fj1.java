package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fj1 implements org.telegram.ui.Components.b91 {
    public final /* synthetic */ WallpapersListActivity a;

    public fj1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.b91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        ae1 ae1Var = new ae1(new lj1(file, file, ""), bitmap, false);
        ae1Var.c1(0L);
        this.a.presentFragment(ae1Var, z10);
    }

    @Override // org.telegram.ui.Components.b91
    public final void a() {
    }
}
