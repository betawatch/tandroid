package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ij1 implements org.telegram.ui.Components.r91 {
    public final /* synthetic */ WallpapersListActivity a;

    public ij1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.r91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        ce1 ce1Var = new ce1(new pj1(file, file, ""), bitmap, false);
        ce1Var.c1(0L);
        this.a.presentFragment(ce1Var, z10);
    }

    @Override // org.telegram.ui.Components.r91
    public final void a() {
    }
}
