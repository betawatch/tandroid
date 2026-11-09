package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class oc1 implements org.telegram.ui.Components.b71 {
    public final /* synthetic */ WallpapersListActivity a;

    public oc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(File file, Bitmap bitmap, boolean z9) {
        w71 w71Var = new w71(new tc1(file, file, ""), bitmap, false);
        w71Var.h1(0L);
        this.a.presentFragment(w71Var, z9);
    }

    @Override // org.telegram.ui.Components.b71
    public final void a() {
    }
}
