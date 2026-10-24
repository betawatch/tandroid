package ei;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class ha implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    public /* synthetic */ ha(vb vbVar, int i10) {
        this.a = i10;
        this.b = vbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                vb vbVar = this.b;
                vbVar.X0.x(3, false);
                vbVar.q0 = null;
                break;
            default:
                jb jbVar = this.b.X0;
                if (jbVar != null) {
                    jbVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
