package org.telegram.messenger;

import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class vg implements ImageDecoder.OnHeaderDecodedListener {
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        NotificationsController.lambda$loadRoundAvatar$47(imageDecoder, imageInfo, source);
    }
}
