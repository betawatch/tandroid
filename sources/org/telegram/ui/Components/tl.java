package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dm e;

    public /* synthetic */ tl(yl ylVar, boolean z10, boolean z11, int i7) {
        this.e = ylVar;
        this.b = z10;
        this.c = z11;
        this.d = i7;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                ti tiVar = ((am) this.e).b.b;
                if (tiVar != null) {
                    tiVar.G3 = true;
                }
                tiVar.X3.y1(7, true, this.b, this.d, 0, 0L, tiVar.g1(), this.c, l10.longValue());
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
                yl ylVar = (yl) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().P = false;
                PhotoViewer.p1().v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.c;
                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                tiVar2.t4 = true;
                tiVar2.G3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                ri riVar = tiVar2.X3;
                boolean z10 = this.b;
                riVar.y1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, tiVar2.g1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                tiVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().v2 = true;
                break;
        }
    }

    public /* synthetic */ tl(am amVar, boolean z10, int i7, boolean z11) {
        this.e = amVar;
        this.b = z10;
        this.d = i7;
        this.c = z11;
    }
}
