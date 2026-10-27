package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pl extends iu0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wn c;

    public pl(wn wnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = wnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.a, (String) null, 0);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.c.r((MediaController.PhotoEntry) this.b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
