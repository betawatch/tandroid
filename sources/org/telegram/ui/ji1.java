package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ji1 implements org.telegram.ui.Components.s81 {
    public final /* synthetic */ WallpapersListActivity a;

    public ji1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.s81
    public final void b(File file, Bitmap bitmap, boolean z4) {
        ed1 ed1Var = new ed1(new qi1(file, file, ""), bitmap, false);
        ed1Var.c1(0L);
        this.a.presentFragment(ed1Var, z4);
    }

    @Override // org.telegram.ui.Components.s81
    public final void a() {
    }
}
