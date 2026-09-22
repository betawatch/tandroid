package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gj1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class dp implements ti {
    public final /* synthetic */ mp a;

    public dp(mp mpVar) {
        this.a = mpVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void C1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        mp mpVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = mpVar.Y.j0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            if (str != null) {
                File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                Bitmap loadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                ap apVar = new ap(new gj1(file, file, ""), loadBitmap, false, 2);
                apVar.V1 = mpVar.f0;
                apVar.F1 = false;
                apVar.E1 = false;
                apVar.n1 = 0.2f;
                apVar.c1(mpVar.v.a());
                apVar.I1 = new cp(this, 0);
                mp.q(mpVar, apVar);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void V0(Object obj) {
        ap apVar = new ap(obj, null, true, 3);
        mp mpVar = this.a;
        apVar.V1 = mpVar.f0;
        apVar.c1(mpVar.v.a());
        apVar.I1 = new cp(this, 1);
        mp.q(mpVar, apVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void y0(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void k1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
