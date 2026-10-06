package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fm e;

    public /* synthetic */ sl(xl xlVar, boolean z10, boolean z11, int i10) {
        this.e = xlVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                xi xiVar = ((am) this.e).b.b;
                if (xiVar != null) {
                    xiVar.I1 = true;
                }
                xiVar.Z1.B1(7, true, this.b, this.d, 0, 0L, xiVar.r1(), this.c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().u2 = true;
                break;
            default:
                xl xlVar = (xl) this.e;
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.c;
                xi xiVar2 = chatAttachAlertPhotoLayout.b;
                xiVar2.s2 = true;
                xiVar2.I1 = true;
                chatAttachAlertPhotoLayout.Z(false);
                vi viVar = xiVar2.Z1;
                boolean z10 = this.b;
                viVar.B1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, xiVar2.r1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                xiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().u2 = true;
                break;
        }
    }

    public /* synthetic */ sl(am amVar, boolean z10, int i10, boolean z11) {
        this.e = amVar;
        this.b = z10;
        this.d = i10;
        this.c = z11;
    }
}
