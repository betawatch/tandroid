package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ht0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public ht0(PhotoViewer photoViewer, String str, long j10, int i9) {
        this.d = photoViewer;
        this.a = str;
        this.b = j10;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.s8 != this) {
            return;
        }
        int videoBitrate = MediaController.getVideoBitrate(this.a);
        int[] iArr = new int[11];
        AnimatedFileNative.d(this.a, iArr, this.b);
        boolean z10 = iArr[10] != 0;
        this.d.f8 = (iArr[0] == 0 || (z10 && iArr[9] == 0)) ? false : true;
        PhotoViewer photoViewer = this.d;
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        photoViewer.b8 = videoBitrate;
        photoViewer.c8 = videoBitrate;
        if (this.d.f8) {
            PhotoViewer photoViewer2 = this.d;
            int i9 = iArr[1];
            photoViewer2.X7 = i9;
            photoViewer2.Z7 = i9;
            PhotoViewer photoViewer3 = this.d;
            int i10 = iArr[2];
            photoViewer3.Y7 = i10;
            photoViewer3.a8 = i10;
            PhotoViewer photoViewer4 = this.d;
            int max = Math.max(photoViewer4.X7, this.d.Y7);
            if (max > 1280) {
                photoViewer4.U7 = 4;
            } else if (max > 854) {
                photoViewer4.U7 = 3;
            } else if (max > 640) {
                photoViewer4.U7 = 2;
            } else {
                photoViewer4.U7 = 1;
            }
            PhotoViewer photoViewer5 = this.d;
            int i11 = this.c;
            if (i11 == -1) {
                i11 = photoViewer5.v2();
            }
            photoViewer5.T7 = i11;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.b8 != 0 && photoViewer6.Y1 != 1) {
                Size o02 = photoViewer6.o0();
                if (o02.getWidth() == photoViewer6.X7 && o02.getHeight() == photoViewer6.Y7) {
                    MediaController.extractRealEncoderBitrate(o02.getWidth(), o02.getHeight(), photoViewer6.c8, false);
                } else {
                    MediaController.extractRealEncoderBitrate(o02.getWidth(), o02.getHeight(), MediaController.makeVideoBitrate(photoViewer6.Y7, photoViewer6.X7, photoViewer6.c8, o02.getHeight(), o02.getWidth()), false);
                }
            }
            this.d.g8 = MediaController.isH264Video(this.a);
        }
        if (this.d.s8 != this) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ye0(this, this, iArr, 20));
    }
}
