// default package

import android.location.Location;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class bd6 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id6 b;

    public /* synthetic */ bd6(id6 id6Var, byte b) {
        this.a = b;
        this.b = id6Var;
    }

    @Override // pt2
    public final void accept(Object obj) {
        byte b = this.a;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                id6Var.m((Location) obj);
                break;
            default:
                Integer num = (Integer) obj;
                id6Var.getClass();
                int intValue = num.intValue();
                boolean z = true;
                if (intValue == 0) {
                    Utilities.d.c(new xac((byte) 25, id6Var, z));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new cd6(id6Var, num, (byte) 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new zc6(id6Var, (byte) 3));
                    break;
                }
                break;
        }
    }
}
