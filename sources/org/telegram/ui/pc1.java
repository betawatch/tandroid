package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pc1 implements org.telegram.ui.Components.a71 {
    public final /* synthetic */ WallpapersListActivity a;

    public pc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.a71
    public final void b(File file, Bitmap bitmap, boolean z9) {
        x71 x71Var = new x71(new uc1(file, file, ""), bitmap, false);
        x71Var.h1(0L);
        this.a.presentFragment(x71Var, z9);
    }

    @Override // org.telegram.ui.Components.a71
    public final void a() {
    }
}
