package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class eq0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public eq0(PhotoViewer photoViewer, String str, long j3, int i7) {
        this.d = photoViewer;
        this.a = str;
        this.b = j3;
        this.c = i7;
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
            int i7 = iArr[1];
            photoViewer2.c8 = i7;
            photoViewer2.e8 = i7;
            PhotoViewer photoViewer3 = this.d;
            int i10 = iArr[2];
            photoViewer3.d8 = i10;
            photoViewer3.f8 = i10;
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
            int i11 = this.c;
            if (i11 == -1) {
                i11 = photoViewer5.t2();
            }
            photoViewer5.Y7 = i11;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.g8 != 0 && photoViewer6.d2 != 1) {
                Size i02 = photoViewer6.i0();
                if (i02.getWidth() == photoViewer6.c8 && i02.getHeight() == photoViewer6.d8) {
                    MediaController.v(i02.getWidth(), i02.getHeight(), photoViewer6.h8, false);
                } else {
                    MediaController.v(i02.getWidth(), i02.getHeight(), MediaController.Q(photoViewer6.d8, photoViewer6.c8, photoViewer6.h8, i02.getHeight(), i02.getWidth()), false);
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
                            z10 = true;
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                photoViewer7.l8 = z10;
            } finally {
                mediaExtractor.release();
            }
        }
        if (this.d.x8 != this) {
            return;
        }
        org.telegram.messenger.g0.g3(new mc0(this, this, iArr, 22));
    }
}
