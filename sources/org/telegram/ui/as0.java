package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ as0(PhotoViewer photoViewer, int i10) {
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
                photoViewer.G0(true, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.e3(1, false);
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.e3(-1, false);
                break;
            default:
                PhotoViewer.S(photoViewer);
                break;
        }
    }
}
