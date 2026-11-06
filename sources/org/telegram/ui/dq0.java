package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dq0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public dq0(PhotoViewer photoViewer, String str, long j3, int i7) {
        this.d = photoViewer;
        this.a = str;
        this.b = j3;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.w8 != this) {
            return;
        }
        int E = MediaController.E(this.a);
        int[] iArr = new int[11];
        AnimatedFileNative.d(this.a, iArr, this.b);
        boolean z9 = false;
        this.d.j8 = (iArr[0] == 0 || ((iArr[10] != 0) && iArr[9] == 0)) ? false : true;
        PhotoViewer photoViewer = this.d;
        if (E == -1) {
            E = iArr[3];
        }
        photoViewer.f8 = E;
        photoViewer.g8 = E;
        if (this.d.j8) {
            PhotoViewer photoViewer2 = this.d;
            int i7 = iArr[1];
            photoViewer2.b8 = i7;
            photoViewer2.d8 = i7;
            PhotoViewer photoViewer3 = this.d;
            int i10 = iArr[2];
            photoViewer3.c8 = i10;
            photoViewer3.e8 = i10;
            PhotoViewer photoViewer4 = this.d;
            int max = Math.max(photoViewer4.b8, this.d.c8);
            if (max > 1280) {
                photoViewer4.Y7 = 4;
            } else if (max > 854) {
                photoViewer4.Y7 = 3;
            } else if (max > 640) {
                photoViewer4.Y7 = 2;
            } else {
                photoViewer4.Y7 = 1;
            }
            PhotoViewer photoViewer5 = this.d;
            int i11 = this.c;
            if (i11 == -1) {
                i11 = photoViewer5.s2();
            }
            photoViewer5.X7 = i11;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.f8 != 0 && photoViewer6.c2 != 1) {
                Size i02 = photoViewer6.i0();
                if (i02.getWidth() == photoViewer6.b8 && i02.getHeight() == photoViewer6.c8) {
                    MediaController.v(i02.getWidth(), i02.getHeight(), photoViewer6.g8, false);
                } else {
                    MediaController.v(i02.getWidth(), i02.getHeight(), MediaController.Q(photoViewer6.c8, photoViewer6.b8, photoViewer6.g8, i02.getHeight(), i02.getWidth()), false);
                }
            }
            PhotoViewer photoViewer7 = this.d;
            String str = this.a;
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                try {
                    mediaExtractor.setDataSource(str);
                    int w10 = MediaController.w(mediaExtractor, false);
                    if (w10 >= 0) {
                        if (mediaExtractor.getTrackFormat(w10).getString("mime").equals("video/avc")) {
                            z9 = true;
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                photoViewer7.k8 = z9;
            } finally {
                mediaExtractor.release();
            }
        }
        if (this.d.w8 != this) {
            return;
        }
        org.telegram.messenger.g0.h3(new mc0(this, this, iArr, 22));
    }
}
