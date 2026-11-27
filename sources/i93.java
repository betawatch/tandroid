// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
