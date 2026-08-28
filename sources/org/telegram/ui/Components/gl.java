package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ tl e;

    public /* synthetic */ gl(ll llVar, boolean z10, boolean z11, int i9) {
        this.e = llVar;
        this.b = z10;
        this.c = z11;
        this.d = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                ki kiVar = ((ol) this.e).b.b;
                if (kiVar != null) {
                    kiVar.E1 = true;
                }
                kiVar.V1.L(7, true, this.b, this.d, 0, 0L, kiVar.s1(), this.c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.n1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().F0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().q2 = true;
                break;
            default:
                ll llVar = (ll) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().K = false;
                PhotoViewer.t1().q2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = llVar.c;
                ki kiVar2 = chatAttachAlertPhotoLayout.b;
                kiVar2.o2 = true;
                kiVar2.E1 = true;
                chatAttachAlertPhotoLayout.Z(false);
                ii iiVar = kiVar2.V1;
                boolean z10 = this.b;
                iiVar.L(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, kiVar2.s1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.n1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                ChatAttachAlertPhotoLayout.o1.clear();
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                kiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().F0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().q2 = true;
                break;
        }
    }

    public /* synthetic */ gl(ol olVar, boolean z10, int i9, boolean z11) {
        this.e = olVar;
        this.b = z10;
        this.d = i9;
        this.c = z11;
    }
}
