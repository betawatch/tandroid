package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ph1 implements org.telegram.ui.Components.i91 {
    public final /* synthetic */ WallpapersListActivity a;

    public ph1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.i91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        mc1 mc1Var = new mc1(new vh1(file, file, ""), bitmap, false);
        mc1Var.c1(0L);
        this.a.presentFragment(mc1Var, z10);
    }

    @Override // org.telegram.ui.Components.i91
    public final void a() {
    }
}
