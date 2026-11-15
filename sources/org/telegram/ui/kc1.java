package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
