package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                o80 o80Var = (o80) this.b;
                o80.w(o80Var.getContext(), o80Var.c, o80Var.n, this.c);
                break;
            case 1:
                o80 o80Var2 = (o80) this.b;
                o80.w(o80Var2.getContext(), o80Var2.c, o80Var2.n, this.c);
                break;
            default:
                ci.oc ocVar = (ci.oc) this.b;
                ocVar.z2 = false;
                ocVar.X0.x(7, true);
                if (this.c) {
                    ocVar.q(true);
                    break;
                }
                break;
        }
    }
}
