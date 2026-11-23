package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class nc1 implements org.telegram.ui.Components.o71 {
    public final /* synthetic */ WallpapersListActivity a;

    public nc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(File file, Bitmap bitmap, boolean z10) {
        x71 x71Var = new x71(new sc1(file, file, ""), bitmap, false);
        x71Var.h1(0L);
        this.a.presentFragment(x71Var, z10);
    }

    @Override // org.telegram.ui.Components.o71
    public final void a() {
    }
}
