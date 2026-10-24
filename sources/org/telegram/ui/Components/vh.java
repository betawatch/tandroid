package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vh extends org.telegram.ui.cu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ ti b;

    public vh(ti tiVar, MediaController.PhotoEntry photoEntry) {
        this.b = tiVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ti tiVar = this.b;
        tiVar.y2 = true;
        if (tiVar.c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        f5.a0(tiVar.M1, tiVar.o1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.uh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                vh.this.b.c2.b0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
