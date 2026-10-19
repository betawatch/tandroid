package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class nh1 implements org.telegram.ui.Components.j91 {
    public final /* synthetic */ WallpapersListActivity a;

    public nh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.j91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        kc1 kc1Var = new kc1(new th1(file, file, ""), bitmap, false);
        kc1Var.c1(0L);
        this.a.presentFragment(kc1Var, z10);
    }

    @Override // org.telegram.ui.Components.j91
    public final void a() {
    }
}
