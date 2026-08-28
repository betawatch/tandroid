package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class il extends rt0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ qn c;

    public il(qn qnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = qnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ImageReceiver.BitmapHolder j(int i9) {
        return new ImageReceiver.BitmapHolder(this.a, (String) null, 0);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        this.c.r((MediaController.PhotoEntry) this.b.get(0), videoEditedInfo, z10, i10, 0, z11, 0L);
    }
}
