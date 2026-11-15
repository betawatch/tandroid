package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ wl e;

    public /* synthetic */ ml(rl rlVar, boolean z10, boolean z11, int i7) {
        this.e = rlVar;
        this.b = z10;
        this.c = z11;
        this.d = i7;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                ki kiVar = ((tl) this.e).b.b;
                if (kiVar != null) {
                    kiVar.G3 = true;
                }
                kiVar.X3.y1(7, true, this.b, this.d, 0, 0L, kiVar.f1(), this.c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().v2 = true;
                break;
            default:
                rl rlVar = (rl) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().P = false;
                PhotoViewer.p1().v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.c;
                ki kiVar2 = chatAttachAlertPhotoLayout.b;
                kiVar2.t4 = true;
                kiVar2.G3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                ii iiVar = kiVar2.X3;
                boolean z10 = this.b;
                iiVar.y1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, kiVar2.f1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                kiVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().v2 = true;
                break;
        }
    }

    public /* synthetic */ ml(tl tlVar, boolean z10, int i7, boolean z11) {
        this.e = tlVar;
        this.b = z10;
        this.d = i7;
        this.c = z11;
    }
}
