package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pl e;

    public /* synthetic */ cl(hl hlVar, boolean z10, boolean z11, int i10) {
        this.e = hlVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                gi giVar = ((kl) this.e).b.b;
                if (giVar != null) {
                    giVar.E1 = true;
                }
                giVar.V1.n0(7, true, this.b, this.d, 0, 0L, giVar.s1(), this.c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.n1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().q2 = true;
                break;
            default:
                hl hlVar = (hl) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().K = false;
                PhotoViewer.t1().q2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hlVar.c;
                gi giVar2 = chatAttachAlertPhotoLayout.b;
                giVar2.o2 = true;
                giVar2.E1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ei eiVar = giVar2.V1;
                boolean z10 = this.b;
                eiVar.n0(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, giVar2.s1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.n1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                ChatAttachAlertPhotoLayout.o1.clear();
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                giVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().q2 = true;
                break;
        }
    }

    public /* synthetic */ cl(kl klVar, boolean z10, int i10, boolean z11) {
        this.e = klVar;
        this.b = z10;
        this.d = i10;
        this.c = z11;
    }
}
