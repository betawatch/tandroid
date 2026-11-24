// default package

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class grc implements crc {
    public final /* synthetic */ WallpapersListActivity a;

    public grc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // crc
    public final void b(File file, Bitmap bitmap, boolean z) {
        qmb qmbVar = new qmb(new lrc(file, file, ""), bitmap, false);
        qmbVar.g1(0L);
        this.a.presentFragment(qmbVar, z);
    }

    @Override // crc
    public final void a() {
    }
}
