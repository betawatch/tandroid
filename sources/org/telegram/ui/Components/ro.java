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
import org.telegram.ui.xh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ro implements ei {
    public final /* synthetic */ ap a;

    public ro(ap apVar) {
        this.a = apVar;
    }

    @Override // org.telegram.ui.Components.ei
    public final void I(Object obj) {
        oo ooVar = new oo(obj, null, true, 3);
        ap apVar = this.a;
        ooVar.R1 = apVar.b0;
        ooVar.c1(apVar.v.a());
        ooVar.E1 = new qo(this, 1);
        ap.r(apVar, ooVar);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean N0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ei
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ap apVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = apVar.U.f0.getSelectedPhotos();
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
                oo ooVar = new oo(new xh1(file, file, ""), loadBitmap, false, 2);
                ooVar.R1 = apVar.b0;
                ooVar.B1 = false;
                ooVar.A1 = false;
                ooVar.j1 = 0.2f;
                ooVar.c1(apVar.v.a());
                ooVar.E1 = new qo(this, 0);
                ap.r(apVar, ooVar);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public final void y(sg sgVar) {
        sgVar.run();
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void g0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
