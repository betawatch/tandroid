package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gi1 implements org.telegram.ui.Components.r81 {
    public final /* synthetic */ WallpapersListActivity a;

    public gi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.r81
    public final void b(File file, Bitmap bitmap, boolean z4) {
        cd1 cd1Var = new cd1(new ni1(file, file, ""), bitmap, false);
        cd1Var.c1(0L);
        this.a.presentFragment(cd1Var, z4);
    }

    @Override // org.telegram.ui.Components.r81
    public final void a() {
    }
}
