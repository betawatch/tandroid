package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class aj1 implements org.telegram.ui.Components.o81 {
    public final /* synthetic */ WallpapersListActivity a;

    public aj1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(File file, Bitmap bitmap, boolean z10) {
        wd1 wd1Var = new wd1(new hj1(file, file, ""), bitmap, false);
        wd1Var.c1(0L);
        this.a.presentFragment(wd1Var, z10);
    }

    @Override // org.telegram.ui.Components.o81
    public final void a() {
    }
}
