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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bd1 extends mu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ cd1 b;

    public bd1(cd1 cd1Var, MediaController.PhotoEntry photoEntry) {
        this.b = cd1Var;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        od1 od1Var = this.b.a;
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
            od1Var.B1 = new zi1(file2, file2, "");
            od1Var.C1 = loadBitmap;
            od1Var.b2 = 0;
            od1Var.x0.requestLayout();
            od1Var.b1(false);
            od1Var.w1 = null;
            od1Var.i1();
        }
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean z() {
        return false;
    }
}
