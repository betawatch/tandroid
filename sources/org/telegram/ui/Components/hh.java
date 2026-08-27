package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hh extends org.telegram.ui.st0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ gi b;

    public hh(gi giVar, MediaController.PhotoEntry photoEntry) {
        this.b = giVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        gi giVar = this.b;
        giVar.o2 = true;
        if (giVar.V1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        y4.a0(giVar.F1, giVar.j1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.gh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.p1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                hh.this.b.V1.n0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
