// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gv3 extends v26 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv3(byte b, Context context, Object obj) {
        super(context, 2);
        this.q = b;
        this.r = obj;
    }

    @Override // v26, o49
    public final void e() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((jv3) obj).j3 = true;
                break;
            case 1:
                ((t14) obj).g0 = true;
                break;
            case 4:
                ((tx9) obj).y1 = true;
                break;
        }
    }

    @Override // v26
    public final void i() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((jv3) obj).j3 = false;
                break;
            case 1:
                ((t14) obj).g0 = false;
                break;
            case 2:
                ((uz3) obj).Q.g0 = false;
                break;
            case 3:
                ((iw9) obj).R.y1 = false;
                break;
            case 4:
                ((tx9) obj).y1 = false;
                break;
            default:
                ((iw9) obj).R.y1 = false;
                break;
        }
    }
}
