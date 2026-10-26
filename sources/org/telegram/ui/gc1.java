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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gc1 extends gu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ hc1 b;

    public gc1(hc1 hc1Var, MediaController.PhotoEntry photoEntry) {
        this.b = hc1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        tc1 tc1Var = this.b.a;
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
            tc1Var.C1 = new ci1(file2, file2, "");
            tc1Var.D1 = loadBitmap;
            tc1Var.c2 = 0;
            tc1Var.y0.requestLayout();
            tc1Var.c1(false);
            tc1Var.x1 = null;
            tc1Var.j1();
        }
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean z() {
        return false;
    }
}
