// default package

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class itc implements etc {
    public final /* synthetic */ WallpapersListActivity a;

    public itc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // etc
    public final void b(File file, Bitmap bitmap, boolean z) {
        rob robVar = new rob(new ntc(file, file, ""), bitmap, false);
        robVar.h1(0L);
        this.a.presentFragment(robVar, z);
    }

    @Override // etc
    public final void a() {
    }
}
