// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class i93 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ i93(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = 2 - i;
                if (i2 != this.b) {
                    xea.v(i2);
                    break;
                } else {
                    xea.v(-1);
                    break;
                }
            default:
                int i3 = 2 - i;
                if (i3 != this.b) {
                    xea.v(i3);
                    break;
                } else {
                    xea.v(-1);
                    break;
                }
        }
    }
}
