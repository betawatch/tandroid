// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class b00 implements mfb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b00(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // mfb
    public final Object get() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return j00.e(context);
            case 1:
                return new jc3(context, new db3());
            case 2:
                return new oc3(context);
            case 3:
                return new jc3(context, new db3());
            case 4:
                return new ld3(context, new faf((byte) 13));
            default:
                return la3.d(context);
        }
    }
}
