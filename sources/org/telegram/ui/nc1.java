package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nc1 implements org.telegram.ui.Components.l71 {
    public final /* synthetic */ WallpapersListActivity a;

    public nc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.l71
    public final void b(File file, Bitmap bitmap, boolean z10) {
        x71 x71Var = new x71(new sc1(file, file, ""), bitmap, false);
        x71Var.h1(0L);
        this.a.presentFragment(x71Var, z10);
    }

    @Override // org.telegram.ui.Components.l71
    public final void a() {
    }
}
