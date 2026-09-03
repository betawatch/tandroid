package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lt0 extends eg.o1 {
    public final /* synthetic */ PhotoViewer H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(PhotoViewer photoViewer, Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context, i10, bitmap, bitmap2, i11, cropState);
        this.H = photoViewer;
    }
}
