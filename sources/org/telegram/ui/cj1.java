package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cj1 implements org.telegram.ui.Components.u91 {
    public final /* synthetic */ WallpapersListActivity a;

    public cj1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.u91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        xd1 xd1Var = new xd1(new jj1(file, file, ""), bitmap, false);
        xd1Var.c1(0L);
        this.a.presentFragment(xd1Var, z10);
    }

    @Override // org.telegram.ui.Components.u91
    public final void a() {
    }
}
