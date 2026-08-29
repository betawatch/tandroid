package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ll extends pt0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ tn c;

    public ll(tn tnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = tnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.a, (String) null, 0);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.c.r((MediaController.PhotoEntry) this.b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
