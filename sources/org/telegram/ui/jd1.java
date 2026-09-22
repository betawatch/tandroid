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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jd1 extends tu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ kd1 b;

    public jd1(kd1 kd1Var, MediaController.PhotoEntry photoEntry) {
        this.b = kd1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wd1 wd1Var = this.b.a;
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
            wd1Var.B1 = new hj1(file2, file2, "");
            wd1Var.C1 = loadBitmap;
            wd1Var.b2 = 0;
            wd1Var.x0.requestLayout();
            wd1Var.b1(false);
            wd1Var.w1 = null;
            wd1Var.i1();
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean z() {
        return false;
    }
}
