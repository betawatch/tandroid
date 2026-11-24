// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bz2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hz2 b;

    public /* synthetic */ bz2(hz2 hz2Var, byte b) {
        this.a = b;
        this.b = hz2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        hz2 hz2Var = this.b;
        switch (b) {
            case 0:
                sz4 sz4Var = hz2Var.f2;
                if (sz4Var != null) {
                    ArrayList arrayList = new ArrayList(hz2Var.e2.keySet());
                    v72 v72Var = (v72) sz4Var.a;
                    ArrayList arrayList2 = v72Var.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i = v72Var.M0;
                    if (i >= 0) {
                        v72Var.r.g(i);
                    }
                }
                hz2Var.dismiss();
                break;
            case 1:
                sz4 sz4Var2 = hz2Var.f2;
                if (sz4Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(hz2Var.e2.keySet());
                    v72 v72Var2 = (v72) sz4Var2.a;
                    ArrayList arrayList4 = v72Var2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i2 = v72Var2.M0;
                    if (i2 >= 0) {
                        v72Var2.r.g(i2);
                    }
                }
                hz2Var.dismiss();
                break;
            case 2:
                HashMap hashMap = hz2Var.e2;
                hashMap.clear();
                hz2Var.c2.b();
                hz2Var.Y1.O(true);
                hz2Var.Z1.c(hashMap.size(), true);
                break;
            case 3:
                hz2Var.b1(view);
                break;
            default:
                int i3 = hz2.m2;
                hz2Var.b1(view);
                break;
        }
    }
}
