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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dc1 extends pt0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ ec1 b;

    public dc1(ec1 ec1Var, MediaController.PhotoEntry photoEntry) {
        this.b = ec1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        qc1 qc1Var = this.b.a;
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
            qc1Var.x1 = new ai1(file2, file2, "");
            qc1Var.y1 = loadBitmap;
            qc1Var.X1 = 0;
            qc1Var.t0.requestLayout();
            qc1Var.b1(false);
            qc1Var.s1 = null;
            qc1Var.i1();
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean z() {
        return false;
    }
}
