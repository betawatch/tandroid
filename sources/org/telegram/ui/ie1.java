package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ie1 implements org.telegram.ui.Components.b81 {
    public final /* synthetic */ WallpapersListActivity a;

    public ie1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.b81
    public final void b(File file, Bitmap bitmap, boolean z10) {
        m91 m91Var = new m91(new ne1(file, file, ""), bitmap, false);
        m91Var.g1(0L);
        this.a.presentFragment(m91Var, z10);
    }

    @Override // org.telegram.ui.Components.b81
    public final void a() {
    }
}
