// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ly2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ry2 b;

    public /* synthetic */ ly2(ry2 ry2Var, byte b) {
        this.a = b;
        this.b = ry2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ry2 ry2Var = this.b;
        switch (b) {
            case 0:
                wz4 wz4Var = ry2Var.f2;
                if (wz4Var != null) {
                    ArrayList arrayList = new ArrayList(ry2Var.e2.keySet());
                    a72 a72Var = (a72) wz4Var.a;
                    ArrayList arrayList2 = a72Var.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i = a72Var.M0;
                    if (i >= 0) {
                        a72Var.r.g(i);
                    }
                }
                ry2Var.dismiss();
                break;
            case 1:
                wz4 wz4Var2 = ry2Var.f2;
                if (wz4Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(ry2Var.e2.keySet());
                    a72 a72Var2 = (a72) wz4Var2.a;
                    ArrayList arrayList4 = a72Var2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i2 = a72Var2.M0;
                    if (i2 >= 0) {
                        a72Var2.r.g(i2);
                    }
                }
                ry2Var.dismiss();
                break;
            case 2:
                HashMap hashMap = ry2Var.e2;
                hashMap.clear();
                ry2Var.c2.b();
                ry2Var.Y1.O(true);
                ry2Var.Z1.c(hashMap.size(), true);
                break;
            case 3:
                ry2Var.c1(view);
                break;
            default:
                int i3 = ry2.m2;
                ry2Var.c1(view);
                break;
        }
    }
}
