package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fs0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public fs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        MessageObject messageObject = photoViewer.Q4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.Q4.getDocument(), true, false);
    }
}
