package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xl e;

    public /* synthetic */ kl(ql qlVar, boolean z10, boolean z11, int i10) {
        this.e = qlVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                bi biVar = ((sl) this.e).b.b;
                if (biVar != null) {
                    biVar.C3 = true;
                }
                biVar.T3.H0(7, true, this.b, this.d, 0, 0L, biVar.e1(), this.c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                hashMap.clear();
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().P, false);
                PhotoViewer.v1().u2 = true;
                break;
            default:
                ql qlVar = (ql) this.e;
                Long l10 = (Long) obj;
                PhotoViewer.v1();
                PhotoViewer.v1().O = false;
                PhotoViewer.v1().u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = qlVar.c;
                bi biVar2 = chatAttachAlertPhotoLayout.b;
                biVar2.p4 = true;
                biVar2.C3 = true;
                chatAttachAlertPhotoLayout.b0(false);
                ai aiVar = biVar2.T3;
                boolean z10 = this.b;
                aiVar.H0(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, biVar2.e1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.w.f();
                biVar2.a(true);
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().P, false);
                PhotoViewer.v1().u2 = true;
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
