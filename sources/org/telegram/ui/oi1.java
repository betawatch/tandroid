package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oi1 implements org.telegram.ui.Components.r81 {
    public final /* synthetic */ WallpapersListActivity a;

    public oi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.r81
    public final void b(File file, Bitmap bitmap, boolean z4) {
        jd1 jd1Var = new jd1(new vi1(file, file, ""), bitmap, false);
        jd1Var.c1(0L);
        this.a.presentFragment(jd1Var, z4);
    }

    @Override // org.telegram.ui.Components.r81
    public final void a() {
    }
}
