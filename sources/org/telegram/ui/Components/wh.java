package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wh extends org.telegram.ui.av0 {
    public final /* synthetic */ MediaController.PhotoEntry a;
    public final /* synthetic */ vi b;

    public wh(vi viVar, MediaController.PhotoEntry photoEntry) {
        this.b = viVar;
        this.a = photoEntry;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        vi viVar = this.b;
        viVar.v2 = true;
        if (viVar.c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.a;
        photoEntry.editedInfo = videoEditedInfo;
        g5.Z(viVar.M1, viVar.l1() + 1, 0L, new Utilities.Callback() { // from class: org.telegram.ui.Components.vh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                wh.this.b.c2.g0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
