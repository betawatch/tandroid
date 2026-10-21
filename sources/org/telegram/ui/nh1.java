package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class nh1 implements org.telegram.ui.Components.k91 {
    public final /* synthetic */ WallpapersListActivity a;

    public nh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.k91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        kc1 kc1Var = new kc1(new th1(file, file, ""), bitmap, false);
        kc1Var.c1(0L);
        this.a.presentFragment(kc1Var, z10);
    }

    @Override // org.telegram.ui.Components.k91
    public final void a() {
    }
}
