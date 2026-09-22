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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class kd1 extends tu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ ld1 b;

    public kd1(ld1 ld1Var, MediaController.PhotoEntry photoEntry) {
        this.b = ld1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        xd1 xd1Var = this.b.a;
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
            xd1Var.B1 = new gj1(file2, file2, "");
            xd1Var.C1 = loadBitmap;
            xd1Var.b2 = 0;
            xd1Var.x0.requestLayout();
            xd1Var.b1(false);
            xd1Var.w1 = null;
            xd1Var.i1();
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean z() {
        return false;
    }
}
