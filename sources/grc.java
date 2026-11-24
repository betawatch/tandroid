// default package

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
