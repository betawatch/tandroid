package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                b90 b90Var = (b90) this.b;
                b90.x(b90Var.getContext(), b90Var.d, b90Var.r, this.c);
                break;
            case 1:
                b90 b90Var2 = (b90) this.b;
                b90.x(b90Var2.getContext(), b90Var2.d, b90Var2.r, this.c);
                break;
            default:
                ei.vb vbVar = (ei.vb) this.b;
                vbVar.z2 = false;
                vbVar.X0.x(7, true);
                if (this.c) {
                    vbVar.p(true);
                    break;
                }
                break;
        }
    }
}
