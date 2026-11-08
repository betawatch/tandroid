package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class lc1 implements org.telegram.ui.Components.a71 {
    public final /* synthetic */ WallpapersListActivity a;

    public lc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.a71
    public final void b(File file, Bitmap bitmap, boolean z9) {
        v71 v71Var = new v71(new qc1(file, file, ""), bitmap, false);
        v71Var.h1(0L);
        this.a.presentFragment(v71Var, z9);
    }

    @Override // org.telegram.ui.Components.a71
    public final void a() {
    }
}
