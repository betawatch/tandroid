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
import org.telegram.ui.yh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class to implements ii {
    public final /* synthetic */ cp a;

    public to(cp cpVar) {
        this.a = cpVar;
    }

    @Override // org.telegram.ui.Components.ii
    public final void A(Object obj) {
        qo qoVar = new qo(obj, null, true, 3);
        cp cpVar = this.a;
        qoVar.R1 = cpVar.b0;
        qoVar.c1(cpVar.v.a());
        qoVar.E1 = new so(this, 1);
        cp.q(cpVar, qoVar);
    }

    @Override // org.telegram.ui.Components.ii
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        cp cpVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = cpVar.U.f0.getSelectedPhotos();
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
                qo qoVar = new qo(new yh1(file, file, ""), loadBitmap, false, 2);
                qoVar.R1 = cpVar.b0;
                qoVar.B1 = false;
                qoVar.A1 = false;
                qoVar.j1 = 0.2f;
                qoVar.c1(cpVar.v.a());
                qoVar.E1 = new so(this, 0);
                cp.q(cpVar, qoVar);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void t(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean t0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void E(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
