package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class iu0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public iu0(PhotoViewer photoViewer, String str, long j3, int i10) {
        this.d = photoViewer;
        this.a = str;
        this.b = j3;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.w8 != this) {
            return;
        }
        int videoBitrate = MediaController.getVideoBitrate(this.a);
        int[] iArr = new int[11];
        AnimatedFileNative.d(this.a, iArr, this.b);
        boolean z10 = iArr[10] != 0;
        this.d.j8 = (iArr[0] == 0 || (z10 && iArr[9] == 0)) ? false : true;
        PhotoViewer photoViewer = this.d;
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        photoViewer.f8 = videoBitrate;
        photoViewer.g8 = videoBitrate;
        if (this.d.j8) {
            PhotoViewer photoViewer2 = this.d;
            int i10 = iArr[1];
            photoViewer2.b8 = i10;
            photoViewer2.d8 = i10;
            PhotoViewer photoViewer3 = this.d;
            int i11 = iArr[2];
            photoViewer3.c8 = i11;
            photoViewer3.e8 = i11;
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
            int i12 = this.c;
            if (i12 == -1) {
                i12 = photoViewer5.v2();
            }
            photoViewer5.X7 = i12;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.f8 != 0 && photoViewer6.c2 != 1) {
                Size p02 = photoViewer6.p0();
                if (p02.getWidth() == photoViewer6.b8 && p02.getHeight() == photoViewer6.c8) {
                    MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer6.g8, false);
                } else {
                    MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer6.c8, photoViewer6.b8, photoViewer6.g8, p02.getHeight(), p02.getWidth()), false);
                }
            }
            this.d.k8 = MediaController.isH264Video(this.a);
        }
        if (this.d.w8 != this) {
            return;
        }
        AndroidUtilities.runOnUIThread(new pf0(this, this, iArr, 20));
    }
}
