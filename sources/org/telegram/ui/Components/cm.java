package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cm implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pm e;

    public /* synthetic */ cm(hm hmVar, boolean z10, boolean z11, int i10) {
        this.e = hmVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                vi viVar = ((km) this.e).b.b;
                if (viVar != null) {
                    viVar.L1 = true;
                }
                viVar.c2.b0(7, true, this.b, this.d, 0, 0L, viVar.u1(), this.c, l4.longValue());
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
                hm hmVar = (hm) this.e;
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.c;
                vi viVar2 = chatAttachAlertPhotoLayout.b;
                viVar2.v2 = true;
                viVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ti tiVar = viVar2.c2;
                boolean z10 = this.b;
                tiVar.b0(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, viVar2.u1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                viVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().u2 = true;
                break;
        }
    }

    public /* synthetic */ cm(km kmVar, boolean z10, int i10, boolean z11) {
        this.e = kmVar;
        this.b = z10;
        this.d = i10;
        this.c = z11;
    }
}
