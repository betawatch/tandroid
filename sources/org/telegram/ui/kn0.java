package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ kn0(PhotoViewer photoViewer, Bitmap bitmap, int i3) {
        this.a = i3;
        this.b = photoViewer;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Bitmap bitmap = this.c;
        PhotoViewer photoViewer = this.b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.g0.h3(new kn0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.g0.h3(new kn0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.g0.h3(new kn0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.V8;
                photoViewer.o0(bitmap);
                break;
            case 4:
                photoViewer.D4.v0(bitmap);
                photoViewer.u5.setUndoCutState(true);
                photoViewer.d3(true, true);
                break;
            case 5:
                photoViewer.D4.v0(bitmap);
                photoViewer.u5.setUndoCutState(true);
                photoViewer.d3(true, true);
                break;
            default:
                photoViewer.D4.v0(bitmap);
                photoViewer.u5.setUndoCutState(true);
                photoViewer.d3(true, true);
                break;
        }
    }
}
