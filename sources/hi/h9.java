package hi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    public /* synthetic */ h9(ta taVar, int i7) {
        this.a = i7;
        this.b = taVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ta taVar = this.b;
                taVar.Y0.x(3, false);
                taVar.r0 = null;
                break;
            default:
                ha haVar = this.b.Y0;
                if (haVar != null) {
                    haVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
