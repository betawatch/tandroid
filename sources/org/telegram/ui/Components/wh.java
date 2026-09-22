package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wh extends org.telegram.ui.tu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ vi b;

    public wh(vi viVar, MediaController.PhotoEntry photoEntry) {
        this.b = viVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        vi viVar = this.b;
        viVar.s2 = true;
        if (viVar.Z1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        c5.a0(viVar.J1, viVar.j1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.vh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                wh.this.b.Z1.B1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
