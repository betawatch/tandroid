package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class jt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public jt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.s71 s71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (s71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new xi0(22, this, s71Var));
        }
    }
}
