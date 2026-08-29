package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xl e;

    public /* synthetic */ kl(pl plVar, boolean z10, boolean z11, int i10) {
        this.e = plVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                ni niVar = ((sl) this.e).b.b;
                if (niVar != null) {
                    niVar.E1 = true;
                }
                niVar.V1.B1(7, true, this.b, this.d, 0, 0L, niVar.s1(), this.c, l10.longValue());
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
                pl plVar = (pl) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().K = false;
                PhotoViewer.t1().q2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = plVar.c;
                ni niVar2 = chatAttachAlertPhotoLayout.b;
                niVar2.o2 = true;
                niVar2.E1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                li liVar = niVar2.V1;
                boolean z10 = this.b;
                liVar.B1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, niVar2.s1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.n1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                ChatAttachAlertPhotoLayout.o1.clear();
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                niVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().q2 = true;
                break;
        }
    }

    public /* synthetic */ kl(sl slVar, boolean z10, int i10, boolean z11) {
        this.e = slVar;
        this.b = z10;
        this.d = i10;
        this.c = z11;
    }
}
