package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fm e;

    public /* synthetic */ vl(am amVar, boolean z10, boolean z11, int i7) {
        this.e = amVar;
        this.b = z10;
        this.c = z11;
        this.d = i7;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                ui uiVar = ((cm) this.e).b.b;
                if (uiVar != null) {
                    uiVar.G3 = true;
                }
                uiVar.X3.y1(7, true, this.b, this.d, 0, 0L, uiVar.g1(), this.c, l10.longValue());
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
                am amVar = (am) this.e;
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().P = false;
                PhotoViewer.p1().v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.c;
                ui uiVar2 = chatAttachAlertPhotoLayout.b;
                uiVar2.t4 = true;
                uiVar2.G3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                si siVar = uiVar2.X3;
                boolean z10 = this.b;
                siVar.y1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, uiVar2.g1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                uiVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().v2 = true;
                break;
        }
    }

    public /* synthetic */ vl(cm cmVar, boolean z10, int i7, boolean z11) {
        this.e = cmVar;
        this.b = z10;
        this.d = i7;
        this.c = z11;
    }
}
