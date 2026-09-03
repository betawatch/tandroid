package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lh extends org.telegram.ui.fu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ mi b;

    public lh(mi miVar, MediaController.PhotoEntry photoEntry) {
        this.b = miVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z4, final int i11, int i12, final boolean z10) {
        mi miVar = this.b;
        miVar.p2 = true;
        if (miVar.W1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        z4.a0(miVar.G1, miVar.j1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.kh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.q1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.p1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                lh.this.b.W1.I1(7, true, z4, i11, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
