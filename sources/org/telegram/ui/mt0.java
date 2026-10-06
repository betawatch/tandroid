package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class mt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public mt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.e81 e81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (e81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new wj0(19, this, e81Var));
        }
    }
}
