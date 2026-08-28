package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lh extends org.telegram.ui.rt0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ ki b;

    public lh(ki kiVar, MediaController.PhotoEntry photoEntry) {
        this.b = kiVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, int i11, final boolean z11) {
        ki kiVar = this.b;
        kiVar.o2 = true;
        if (kiVar.V1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        y4.a0(kiVar.F1, kiVar.j1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.kh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.p1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                lh.this.b.V1.L(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
