package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zl e;

    public /* synthetic */ kl(ql qlVar, boolean z4, boolean z10, int i10) {
        this.e = qlVar;
        this.b = z4;
        this.c = z10;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                li liVar = ((ul) this.e).b.b;
                if (liVar != null) {
                    liVar.F1 = true;
                }
                liVar.W1.H(7, true, this.b, this.d, 0, 0L, liVar.s1(), this.c, l10.longValue());
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
                ql qlVar = (ql) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().L = false;
                PhotoViewer.t1().r2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = qlVar.c;
                li liVar2 = chatAttachAlertPhotoLayout.b;
                liVar2.p2 = true;
                liVar2.F1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ji jiVar = liVar2.W1;
                boolean z4 = this.b;
                jiVar.H(z4 ? 4 : 8, true, this.c, this.d, 0, 0L, liVar2.s1(), z4, l11.longValue());
                ChatAttachAlertPhotoLayout.o1.clear();
                ChatAttachAlertPhotoLayout.q1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                chatAttachAlertPhotoLayout.D.l();
                chatAttachAlertPhotoLayout.v.l();
                liVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().r2 = true;
                break;
        }
    }

    public /* synthetic */ kl(ul ulVar, boolean z4, int i10, boolean z10) {
        this.e = ulVar;
        this.b = z4;
        this.d = i10;
        this.c = z10;
    }
}
