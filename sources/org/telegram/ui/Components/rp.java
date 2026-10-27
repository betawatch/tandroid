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
import org.telegram.ui.ei1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rp implements ri {
    public final /* synthetic */ zp a;

    public rp(zp zpVar) {
        this.a = zpVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void A(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void T(Object obj) {
        op opVar = new op(obj, null, true, 3);
        zp zpVar = this.a;
        opVar.W1 = zpVar.e0;
        opVar.d1(zpVar.v.a());
        opVar.J1 = new qp(this, 1);
        zp.q(zpVar, opVar);
    }

    @Override // org.telegram.ui.Components.ri
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        zp zpVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = zpVar.X.j0.getSelectedPhotos();
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
                op opVar = new op(new ei1(file, file, ""), loadBitmap, false, 2);
                opVar.W1 = zpVar.e0;
                opVar.G1 = false;
                opVar.F1 = false;
                opVar.o1 = 0.2f;
                opVar.d1(zpVar.v.a());
                opVar.J1 = new qp(this, 0);
                zp.q(zpVar, opVar);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean x0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void R() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void Y(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
