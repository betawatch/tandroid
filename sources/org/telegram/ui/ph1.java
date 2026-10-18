package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
