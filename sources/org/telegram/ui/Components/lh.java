package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lh extends org.telegram.ui.yt0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ li b;

    public lh(li liVar, MediaController.PhotoEntry photoEntry) {
        this.b = liVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z4, final int i11, int i12, final boolean z10) {
        li liVar = this.b;
        liVar.p2 = true;
        if (liVar.W1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        z4.a0(liVar.G1, liVar.j1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.kh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.q1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.p1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                lh.this.b.W1.H(7, true, z4, i11, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
