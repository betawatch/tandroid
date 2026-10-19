package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class am implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nm e;

    public /* synthetic */ am(fm fmVar, boolean z10, boolean z11, int i10) {
        this.e = fmVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                ti tiVar = ((im) this.e).b.b;
                if (tiVar != null) {
                    tiVar.L1 = true;
                }
                tiVar.c2.b0(7, true, this.b, this.d, 0, 0L, tiVar.u1(), this.c, l4.longValue());
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
                fm fmVar = (fm) this.e;
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = fmVar.c;
                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                tiVar2.v2 = true;
                tiVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ri riVar = tiVar2.c2;
                boolean z10 = this.b;
                riVar.b0(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, tiVar2.u1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                tiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().u2 = true;
                break;
        }
    }

    public /* synthetic */ am(im imVar, boolean z10, int i10, boolean z11) {
        this.e = imVar;
        this.b = z10;
        this.d = i10;
        this.c = z11;
    }
}
