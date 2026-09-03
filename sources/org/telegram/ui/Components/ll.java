package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ am e;

    public /* synthetic */ ll(rl rlVar, boolean z4, boolean z10, int i10) {
        this.e = rlVar;
        this.b = z4;
        this.c = z10;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                mi miVar = ((vl) this.e).b.b;
                if (miVar != null) {
                    miVar.F1 = true;
                }
                miVar.W1.I1(7, true, this.b, this.d, 0, 0L, miVar.s1(), this.c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.p1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.o1.clear();
                ChatAttachAlertPhotoLayout.q1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().r2 = true;
                break;
            default:
                rl rlVar = (rl) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().L = false;
                PhotoViewer.t1().r2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.c;
                mi miVar2 = chatAttachAlertPhotoLayout.b;
                miVar2.p2 = true;
                miVar2.F1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ki kiVar = miVar2.W1;
                boolean z4 = this.b;
                kiVar.I1(z4 ? 4 : 8, true, this.c, this.d, 0, 0L, miVar2.s1(), z4, l11.longValue());
                ChatAttachAlertPhotoLayout.o1.clear();
                ChatAttachAlertPhotoLayout.q1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                chatAttachAlertPhotoLayout.D.l();
                chatAttachAlertPhotoLayout.v.l();
                miVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().r2 = true;
                break;
        }
    }

    public /* synthetic */ ll(vl vlVar, boolean z4, int i10, boolean z10) {
        this.e = vlVar;
        this.b = z4;
        this.d = i10;
        this.c = z10;
    }
}
