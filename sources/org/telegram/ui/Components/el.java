package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ol e;

    public /* synthetic */ el(jl jlVar, boolean z10, boolean z11, int i3) {
        this.e = jlVar;
        this.b = z10;
        this.c = z11;
        this.d = i3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                bi biVar = ((ll) this.e).b.b;
                if (biVar != null) {
                    biVar.D3 = true;
                }
                biVar.U3.o1(7, true, this.b, this.d, 0, 0L, biVar.f1(), this.c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                hashMap.clear();
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().Q, false);
                PhotoViewer.v1().v2 = true;
                break;
            default:
                jl jlVar = (jl) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.v1();
                PhotoViewer.v1().P = false;
                PhotoViewer.v1().v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jlVar.c;
                bi biVar2 = chatAttachAlertPhotoLayout.b;
                biVar2.q4 = true;
                biVar2.D3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                zh zhVar = biVar2.U3;
                boolean z10 = this.b;
                zhVar.o1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, biVar2.f1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                biVar2.a(true);
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().Q, false);
                PhotoViewer.v1().v2 = true;
                break;
        }
    }

    public /* synthetic */ el(ll llVar, boolean z10, int i3, boolean z11) {
        this.e = llVar;
        this.b = z10;
        this.d = i3;
        this.c = z11;
    }
}
