package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class bu0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public bu0(PhotoViewer photoViewer, String str, long j3, int i10) {
        this.d = photoViewer;
        this.a = str;
        this.b = j3;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.x8 != this) {
            return;
        }
        int videoBitrate = MediaController.getVideoBitrate(this.a);
        int[] iArr = new int[11];
        AnimatedFileNative.d(this.a, iArr, this.b);
        boolean z10 = iArr[10] != 0;
        this.d.k8 = (iArr[0] == 0 || (z10 && iArr[9] == 0)) ? false : true;
        PhotoViewer photoViewer = this.d;
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        photoViewer.g8 = videoBitrate;
        photoViewer.h8 = videoBitrate;
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
                i12 = photoViewer5.u2();
            }
            photoViewer5.Y7 = i12;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.g8 != 0 && photoViewer6.c2 != 1) {
                Size p02 = photoViewer6.p0();
                if (p02.getWidth() == photoViewer6.c8 && p02.getHeight() == photoViewer6.d8) {
                    MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer6.h8, false);
                } else {
                    MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer6.d8, photoViewer6.c8, photoViewer6.h8, p02.getHeight(), p02.getWidth()), false);
                }
            }
            this.d.l8 = MediaController.isH264Video(this.a);
        }
        if (this.d.x8 != this) {
            return;
        }
        AndroidUtilities.runOnUIThread(new jf0(this, this, iArr, 20));
    }
}
