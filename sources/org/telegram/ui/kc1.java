package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class kc1 implements org.telegram.ui.Components.a71 {
    public final /* synthetic */ WallpapersListActivity a;

    public kc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.a71
    public final void b(File file, Bitmap bitmap, boolean z9) {
        u71 u71Var = new u71(new pc1(file, file, ""), bitmap, false);
        u71Var.h1(0L);
        this.a.presentFragment(u71Var, z9);
    }

    @Override // org.telegram.ui.Components.a71
    public final void a() {
    }
}
