// default package

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class or9 extends oc3 {
    @Override // oc3
    public final void a(Context context, int i, y30 y30Var, Handler handler, n64 n64Var, ArrayList arrayList) {
        arrayList.add(new nr9(context, this.b, handler, n64Var, y30Var));
    }

    @Override // oc3
    public final void c(Context context, int i, Handler handler, n64 n64Var, ArrayList arrayList) {
        zm6 zm6Var = new zm6(context);
        zm6Var.c = this.b;
        zm6Var.d = (short) 5000;
        zm6Var.e = handler;
        zm6Var.f = n64Var;
        zm6Var.g = (byte) 50;
        arrayList.add(new pr9(zm6Var));
    }
}
