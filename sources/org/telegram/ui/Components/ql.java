package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ql implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dm e;

    public /* synthetic */ ql(vl vlVar, boolean z10, boolean z11, int i10) {
        this.e = vlVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                wi wiVar = ((yl) this.e).b.b;
                if (wiVar != null) {
                    wiVar.I1 = true;
                }
                wiVar.Z1.B1(7, true, this.b, this.d, 0, 0L, wiVar.s1(), this.c, l4.longValue());
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
                vl vlVar = (vl) this.e;
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.c;
                wi wiVar2 = chatAttachAlertPhotoLayout.b;
                wiVar2.s2 = true;
                wiVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ui uiVar = wiVar2.Z1;
                boolean z10 = this.b;
                uiVar.B1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, wiVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                wiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().u2 = true;
                break;
        }
    }

    public /* synthetic */ ql(yl ylVar, boolean z10, int i10, boolean z11) {
        this.e = ylVar;
        this.b = z10;
        this.d = i10;
        this.c = z11;
    }
}
