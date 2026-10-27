package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.iu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ ti b;

    public ki(ti tiVar, MediaController.PhotoEntry photoEntry) {
        this.b = tiVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ti tiVar = this.b;
        tiVar.y2 = true;
        if (tiVar.c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        g5.Z(tiVar.M1, tiVar.p1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.ji
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                ki.this.b.c2.p0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
