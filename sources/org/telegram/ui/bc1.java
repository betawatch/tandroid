package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bc1 extends rt0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ cc1 b;

    public bc1(cc1 cc1Var, MediaController.PhotoEntry photoEntry) {
        this.b = cc1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        oc1 oc1Var = this.b.a;
        MediaController.PhotoEntry photoEntry = this.a;
        if (photoEntry.imagePath != null) {
            File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            oc1Var.x1 = new yh1(file2, file2, "");
            oc1Var.y1 = loadBitmap;
            oc1Var.X1 = 0;
            oc1Var.t0.requestLayout();
            oc1Var.b1(false);
            oc1Var.s1 = null;
            oc1Var.i1();
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean z() {
        return false;
    }
}
