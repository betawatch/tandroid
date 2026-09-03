package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pi1 implements org.telegram.ui.Components.r81 {
    public final /* synthetic */ WallpapersListActivity a;

    public pi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.r81
    public final void b(File file, Bitmap bitmap, boolean z4) {
        jd1 jd1Var = new jd1(new wi1(file, file, ""), bitmap, false);
        jd1Var.c1(0L);
        this.a.presentFragment(jd1Var, z4);
    }

    @Override // org.telegram.ui.Components.r81
    public final void a() {
    }
}
