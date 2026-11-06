package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class m7 extends vc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.ls c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.b = i7;
        this.c = lsVar;
    }

    @Override // org.telegram.ui.Components.vc
    public final void c(boolean z9) {
        switch (this.b) {
            case 0:
                b8 b8Var = (b8) this.c;
                b8Var.updateColors();
                org.telegram.ui.uq uqVar = b8Var.E1;
                if (uqVar != null) {
                    uqVar.a(d1.f.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.z0 z0Var = photoViewer.F0;
                if (z0Var != null) {
                    z0Var.f(z9);
                    photoViewer.F0.setSelectorColor(z9 ? 259241196 : 268435455);
                }
                n51 n51Var = photoViewer.F2;
                if (n51Var != null) {
                    n51Var.t0(d1.f.u() || photoViewer.r);
                }
                org.telegram.ui.uq uqVar2 = photoViewer.w0;
                if (uqVar2 != null) {
                    uqVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
