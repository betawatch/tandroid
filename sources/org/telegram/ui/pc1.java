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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pc1 extends yt0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ qc1 b;

    public pc1(qc1 qc1Var, MediaController.PhotoEntry photoEntry) {
        this.b = qc1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        cd1 cd1Var = this.b.a;
        MediaController.PhotoEntry photoEntry = this.a;
        if (photoEntry.imagePath != null) {
            File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            cd1Var.y1 = new ni1(file2, file2, "");
            cd1Var.z1 = loadBitmap;
            cd1Var.Y1 = 0;
            cd1Var.u0.requestLayout();
            cd1Var.b1(false);
            cd1Var.t1 = null;
            cd1Var.i1();
        }
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean z() {
        return false;
    }
}
