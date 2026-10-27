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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ic1 extends iu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ jc1 b;

    public ic1(jc1 jc1Var, MediaController.PhotoEntry photoEntry) {
        this.b = jc1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        vc1 vc1Var = this.b.a;
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
            vc1Var.C1 = new ei1(file2, file2, "");
            vc1Var.D1 = loadBitmap;
            vc1Var.c2 = 0;
            vc1Var.y0.requestLayout();
            vc1Var.c1(false);
            vc1Var.x1 = null;
            vc1Var.j1();
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean z() {
        return false;
    }
}
