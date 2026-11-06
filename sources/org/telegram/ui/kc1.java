package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
