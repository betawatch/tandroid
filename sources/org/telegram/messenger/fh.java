package org.telegram.messenger;

import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class fh implements ImageDecoder.OnHeaderDecodedListener {
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        NotificationsController.lambda$loadRoundAvatar$47(imageDecoder, imageInfo, source);
    }
}
