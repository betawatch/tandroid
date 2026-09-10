package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ hm e;

    public /* synthetic */ ul(zl zlVar, boolean z10, boolean z11, int i10) {
        this.e = zlVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                yi yiVar = ((cm) this.e).b.b;
                if (yiVar != null) {
                    yiVar.I1 = true;
                }
                yiVar.Z1.A1(7, true, this.b, this.d, 0, 0L, yiVar.s1(), this.c, l4.longValue());
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
                zl zlVar = (zl) this.e;
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.c;
                yi yiVar2 = chatAttachAlertPhotoLayout.b;
                yiVar2.s2 = true;
                yiVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                wi wiVar = yiVar2.Z1;
                boolean z10 = this.b;
                wiVar.A1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, yiVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                yiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().u2 = true;
                break;
        }
    }

    public /* synthetic */ ul(cm cmVar, boolean z10, int i10, boolean z11) {
        this.e = cmVar;
        this.b = z10;
        this.d = i10;
        this.c = z11;
    }
}
