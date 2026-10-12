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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pd1 extends av0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ qd1 b;

    public pd1(qd1 qd1Var, MediaController.PhotoEntry photoEntry) {
        this.b = qd1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ce1 ce1Var = this.b.a;
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
            ce1Var.B1 = new qj1(file2, file2, "");
            ce1Var.C1 = loadBitmap;
            ce1Var.b2 = 0;
            ce1Var.x0.requestLayout();
            ce1Var.b1(false);
            ce1Var.w1 = null;
            ce1Var.i1();
        }
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean z() {
        return false;
    }
}
