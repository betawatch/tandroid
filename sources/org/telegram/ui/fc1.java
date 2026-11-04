package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fc1 implements org.telegram.ui.Components.s61 {
    public final /* synthetic */ WallpapersListActivity a;

    public fc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.s61
    public final void b(File file, Bitmap bitmap, boolean z10) {
        l71 l71Var = new l71(new lc1(file, file, ""), bitmap, false);
        l71Var.h1(0L);
        this.a.presentFragment(l71Var, z10);
    }

    @Override // org.telegram.ui.Components.s61
    public final void a() {
    }
}
