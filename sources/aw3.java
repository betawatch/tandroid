// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class aw3 extends z46 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw3(byte b, Context context, Object obj) {
        super(context, 2);
        this.q = b;
        this.r = obj;
    }

    @Override // z46, b89
    public final void e() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((dw3) obj).j3 = true;
                break;
            case 1:
                ((o24) obj).g0 = true;
                break;
            case 4:
                ((n1a) obj).y1 = true;
                break;
        }
    }

    @Override // z46
    public final void i() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((dw3) obj).j3 = false;
                break;
            case 1:
                ((o24) obj).g0 = false;
                break;
            case 2:
                ((p04) obj).Q.g0 = false;
                break;
            case 3:
                ((b0a) obj).R.y1 = false;
                break;
            case 4:
                ((n1a) obj).y1 = false;
                break;
            default:
                ((b0a) obj).R.y1 = false;
                break;
        }
    }
}
