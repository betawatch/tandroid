package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ mr0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.G0(true, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer.f3(1, false);
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer.f3(-1, false);
                break;
            default:
                PhotoViewer.S(photoViewer);
                break;
        }
    }
}
