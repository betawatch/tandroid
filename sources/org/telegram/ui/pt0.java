package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class pt0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public pt0(PhotoViewer photoViewer, String str, long j10, int i10) {
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
                i12 = photoViewer5.x2();
            }
            photoViewer5.Y7 = i12;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.g8 != 0 && photoViewer6.c2 != 1) {
                Size q02 = photoViewer6.q0();
                if (q02.getWidth() == photoViewer6.c8 && q02.getHeight() == photoViewer6.d8) {
                    MediaController.extractRealEncoderBitrate(q02.getWidth(), q02.getHeight(), photoViewer6.h8, false);
                } else {
                    MediaController.extractRealEncoderBitrate(q02.getWidth(), q02.getHeight(), MediaController.makeVideoBitrate(photoViewer6.d8, photoViewer6.c8, photoViewer6.h8, q02.getHeight(), q02.getWidth()), false);
                }
            }
            this.d.l8 = MediaController.isH264Video(this.a);
        }
        if (this.d.x8 != this) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ve0(this, this, iArr, 21));
    }
}
