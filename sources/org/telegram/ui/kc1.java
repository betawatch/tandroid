package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kc1 implements org.telegram.ui.Components.b71 {
    public final /* synthetic */ WallpapersListActivity a;

    public kc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(File file, Bitmap bitmap, boolean z10) {
        t71 t71Var = new t71(new pc1(file, file, ""), bitmap, false);
        t71Var.h1(0L);
        this.a.presentFragment(t71Var, z10);
    }

    @Override // org.telegram.ui.Components.b71
    public final void a() {
    }
}
