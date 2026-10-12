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
import org.telegram.ui.qj1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qp implements ti {
    public final /* synthetic */ zp a;

    public qp(zp zpVar) {
        this.a = zpVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void U(Object obj) {
        np npVar = new np(obj, null, true, 3);
        zp zpVar = this.a;
        npVar.V1 = zpVar.f0;
        npVar.c1(zpVar.v.a());
        npVar.I1 = new pp(this, 1);
        zp.s(zpVar, npVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        zp zpVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = zpVar.Y.j0.getSelectedPhotos();
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
                np npVar = new np(new qj1(file, file, ""), loadBitmap, false, 2);
                npVar.V1 = zpVar.f0;
                npVar.F1 = false;
                npVar.E1 = false;
                npVar.n1 = 0.2f;
                npVar.c1(zpVar.v.a());
                npVar.I1 = new pp(this, 0);
                zp.s(zpVar, npVar);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean p0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void W(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
