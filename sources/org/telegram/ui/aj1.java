package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class aj1 implements org.telegram.ui.Components.o81 {
    public final /* synthetic */ WallpapersListActivity a;

    public aj1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(File file, Bitmap bitmap, boolean z10) {
        wd1 wd1Var = new wd1(new hj1(file, file, ""), bitmap, false);
        wd1Var.c1(0L);
        this.a.presentFragment(wd1Var, z10);
    }

    @Override // org.telegram.ui.Components.o81
    public final void a() {
    }
}
