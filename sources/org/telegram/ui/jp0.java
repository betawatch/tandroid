package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ jp0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.H0(true, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.i3(1, false);
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.i3(-1, false);
                break;
            default:
                PhotoViewer.T(photoViewer);
                break;
        }
    }
}
