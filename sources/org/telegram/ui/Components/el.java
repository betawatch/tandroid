package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ol e;

    public /* synthetic */ el(jl jlVar, boolean z9, boolean z10, int i7) {
        this.e = jlVar;
        this.b = z9;
        this.c = z10;
        this.d = i7;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                ci ciVar = ((ll) this.e).b.b;
                if (ciVar != null) {
                    ciVar.F3 = true;
                }
                ciVar.W3.o1(7, true, this.b, this.d, 0, 0L, ciVar.f1(), this.c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().P, false);
                PhotoViewer.p1().u2 = true;
                break;
            default:
                jl jlVar = (jl) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().O = false;
                PhotoViewer.p1().u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jlVar.c;
                ci ciVar2 = chatAttachAlertPhotoLayout.b;
                ciVar2.s4 = true;
                ciVar2.F3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                ai aiVar = ciVar2.W3;
                boolean z9 = this.b;
                aiVar.o1(z9 ? 4 : 8, true, this.c, this.d, 0, 0L, ciVar2.f1(), z9, l11.longValue());
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.w.f();
                ciVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().P, false);
                PhotoViewer.p1().u2 = true;
                break;
        }
    }

    public /* synthetic */ el(ll llVar, boolean z9, int i7, boolean z10) {
        this.e = llVar;
        this.b = z9;
        this.d = i7;
        this.c = z10;
    }
}
