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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class cd1 extends ou0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ dd1 b;

    public cd1(dd1 dd1Var, MediaController.PhotoEntry photoEntry) {
        this.b = dd1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        pd1 pd1Var = this.b.a;
        MediaController.PhotoEntry photoEntry = this.a;
        if (photoEntry.imagePath != null) {
            File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e7) {
                e7.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            pd1Var.B1 = new xi1(file2, file2, "");
            pd1Var.C1 = loadBitmap;
            pd1Var.b2 = 0;
            pd1Var.x0.requestLayout();
            pd1Var.b1(false);
            pd1Var.w1 = null;
            pd1Var.i1();
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean z() {
        return false;
    }
}
