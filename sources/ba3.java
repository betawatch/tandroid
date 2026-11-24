// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ba3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ ba3(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = 2 - i;
                if (i2 != this.b) {
                    gda.v(i2);
                    break;
                } else {
                    gda.v(-1);
                    break;
                }
            default:
                int i3 = 2 - i;
                if (i3 != this.b) {
                    gda.v(i3);
                    break;
                } else {
                    gda.v(-1);
                    break;
                }
        }
    }
}
