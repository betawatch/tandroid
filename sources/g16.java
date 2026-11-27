// default package

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g16 implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ g16(int i, HashMap hashMap, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = i;
        this.c = hashMap;
        this.d = z;
        this.e = z2;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 0:
                int i2 = this.b;
                HashMap hashMap = this.c;
                boolean z = this.d;
                boolean z2 = this.e;
                String str = LaunchActivity.C1;
                Utilities.e.c(new vu2(lv2.r(i2), hashMap, z, z2, false, (byte) 0));
                break;
            case 1:
                int i3 = this.b;
                HashMap hashMap2 = this.c;
                boolean z3 = this.d;
                boolean z4 = this.e;
                String str2 = LaunchActivity.C1;
                Utilities.e.c(new vu2(lv2.r(i3), hashMap2, z3, z4, true, (byte) 0));
                break;
            default:
                int i4 = this.b;
                HashMap hashMap3 = this.c;
                boolean z5 = this.d;
                boolean z6 = this.e;
                String str3 = LaunchActivity.C1;
                Utilities.e.c(new vu2(lv2.r(i4), hashMap3, z5, z6, true, (byte) 0));
                break;
        }
    }
}
