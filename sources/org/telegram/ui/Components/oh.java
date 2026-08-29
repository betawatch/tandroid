package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oh extends org.telegram.ui.pt0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ ni b;

    public oh(ni niVar, MediaController.PhotoEntry photoEntry) {
        this.b = niVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ni niVar = this.b;
        niVar.o2 = true;
        if (niVar.V1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        c5.a0(niVar.F1, niVar.j1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.nh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.p1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                oh.this.b.V1.B1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
