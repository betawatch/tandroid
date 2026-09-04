package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
