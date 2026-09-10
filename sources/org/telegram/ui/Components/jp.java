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
import org.telegram.ui.lj1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jp implements wi {
    public final /* synthetic */ sp a;

    public jp(sp spVar) {
        this.a = spVar;
    }

    @Override // org.telegram.ui.Components.wi
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        sp spVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = spVar.Y.j0.getSelectedPhotos();
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
                gp gpVar = new gp(new lj1(file, file, ""), loadBitmap, false, 2);
                gpVar.V1 = spVar.f0;
                gpVar.F1 = false;
                gpVar.E1 = false;
                gpVar.n1 = 0.2f;
                gpVar.c1(spVar.v.a());
                gpVar.I1 = new ip(this, 0);
                sp.q(spVar, gpVar);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean R1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.wi
    public final void U0(Object obj) {
        gp gpVar = new gp(obj, null, true, 3);
        sp spVar = this.a;
        gpVar.V1 = spVar.f0;
        gpVar.c1(spVar.v.a());
        gpVar.I1 = new ip(this, 1);
        sp.q(spVar, gpVar);
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void y0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void i1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
