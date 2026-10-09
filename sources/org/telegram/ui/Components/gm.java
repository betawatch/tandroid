package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gm implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ tm e;

    public /* synthetic */ gm(lm lmVar, boolean z10, boolean z11, int i10) {
        this.e = lmVar;
        this.b = z10;
        this.c = z11;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                yi yiVar = ((om) this.e).b.b;
                if (yiVar != null) {
                    yiVar.L1 = true;
                }
                yiVar.c2.I1(7, true, this.b, this.d, 0, 0L, yiVar.u1(), this.c, l4.longValue());
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
                lm lmVar = (lm) this.e;
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = lmVar.c;
                yi yiVar2 = chatAttachAlertPhotoLayout.b;
                yiVar2.v2 = true;
                yiVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                wi wiVar = yiVar2.c2;
                boolean z10 = this.b;
                wiVar.I1(z10 ? 4 : 8, true, this.c, this.d, 0, 0L, yiVar2.u1(), z10, l10.longValue());
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

    public /* synthetic */ gm(om omVar, boolean z10, int i10, boolean z11) {
        this.e = omVar;
        this.b = z10;
        this.d = i10;
        this.c = z11;
    }
}
