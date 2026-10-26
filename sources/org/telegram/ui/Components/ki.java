package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.gu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ ti b;

    public ki(ti tiVar, MediaController.PhotoEntry photoEntry) {
        this.b = tiVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ti tiVar = this.b;
        tiVar.y2 = true;
        if (tiVar.c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        g5.Z(tiVar.M1, tiVar.o1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.ji
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
