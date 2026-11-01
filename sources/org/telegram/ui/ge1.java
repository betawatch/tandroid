package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ge1 implements org.telegram.ui.Components.c81 {
    public final /* synthetic */ WallpapersListActivity a;

    public ge1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(File file, Bitmap bitmap, boolean z10) {
        k91 k91Var = new k91(new le1(file, file, ""), bitmap, false);
        k91Var.h1(0L);
        this.a.presentFragment(k91Var, z10);
    }

    @Override // org.telegram.ui.Components.c81
    public final void a() {
    }
}
