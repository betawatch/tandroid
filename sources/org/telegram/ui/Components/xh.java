package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xh extends org.telegram.ui.mu0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ wi b;

    public xh(wi wiVar, MediaController.PhotoEntry photoEntry) {
        this.b = wiVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        wi wiVar = this.b;
        wiVar.s2 = true;
        if (wiVar.Z1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        e5.a0(wiVar.J1, wiVar.j1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.wh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                xh.this.b.Z1.B1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
