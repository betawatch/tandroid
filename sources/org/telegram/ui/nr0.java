package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nr0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public nr0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.a = str;
        this.b = j10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.x8 != this) {
            return;
        }
        int E = MediaController.E(this.a);
        int[] iArr = new int[11];
        AnimatedFileNative.d(this.a, iArr, this.b);
        boolean z10 = false;
        this.d.k8 = (iArr[0] == 0 || ((iArr[10] != 0) && iArr[9] == 0)) ? false : true;
        PhotoViewer photoViewer = this.d;
        if (E == -1) {
            E = iArr[3];
        }
        photoViewer.g8 = E;
        photoViewer.h8 = E;
        if (this.d.k8) {
            PhotoViewer photoViewer2 = this.d;
            int i10 = iArr[1];
            photoViewer2.c8 = i10;
            photoViewer2.e8 = i10;
            PhotoViewer photoViewer3 = this.d;
            int i11 = iArr[2];
            photoViewer3.d8 = i11;
            photoViewer3.f8 = i11;
            PhotoViewer photoViewer4 = this.d;
            int max = Math.max(photoViewer4.c8, this.d.d8);
            if (max > 1280) {
                photoViewer4.Z7 = 4;
            } else if (max > 854) {
                photoViewer4.Z7 = 3;
            } else if (max > 640) {
                photoViewer4.Z7 = 2;
            } else {
                photoViewer4.Z7 = 1;
            }
            PhotoViewer photoViewer5 = this.d;
            int i12 = this.c;
            if (i12 == -1) {
                i12 = photoViewer5.y2();
            }
            photoViewer5.Y7 = i12;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.g8 != 0 && photoViewer6.c2 != 1) {
                Size q02 = photoViewer6.q0();
                if (q02.getWidth() == photoViewer6.c8 && q02.getHeight() == photoViewer6.d8) {
                    MediaController.v(q02.getWidth(), q02.getHeight(), photoViewer6.h8, false);
                } else {
                    MediaController.v(q02.getWidth(), q02.getHeight(), MediaController.Q(photoViewer6.d8, photoViewer6.c8, photoViewer6.h8, q02.getHeight(), q02.getWidth()), false);
                }
            }
            PhotoViewer photoViewer7 = this.d;
            String str = this.a;
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                try {
                    mediaExtractor.setDataSource(str);
                    int w9 = MediaController.w(mediaExtractor, false);
                    if (w9 >= 0) {
                        if (mediaExtractor.getTrackFormat(w9).getString("mime").equals("video/avc")) {
                            z10 = true;
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                photoViewer7.l8 = z10;
            } finally {
                mediaExtractor.release();
            }
        }
        if (this.d.x8 != this) {
            return;
        }
        org.telegram.messenger.i0.g3(new qd0(this, this, iArr, 23));
    }
}
