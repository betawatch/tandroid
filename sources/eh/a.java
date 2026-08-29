package eh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import nh.d6;
import org.telegram.ui.Components.on;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ a(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        f fVar = this.b;
        switch (i10) {
            case 0:
                d6 d6Var = fVar.g0;
                if (d6Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.f0.keySet());
                    on onVar = (on) d6Var.b;
                    ArrayList arrayList2 = onVar.L0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = onVar.H0;
                    if (i11 >= 0) {
                        onVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                d6 d6Var2 = fVar.g0;
                if (d6Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f0.keySet());
                    on onVar2 = (on) d6Var2.b;
                    ArrayList arrayList4 = onVar2.L0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = onVar2.H0;
                    if (i12 >= 0) {
                        onVar2.r.m(i12);
                    }
                }
                fVar.dismiss();
                break;
            case 2:
                HashMap hashMap = fVar.f0;
                hashMap.clear();
                fVar.d0.b();
                fVar.Z.N(true);
                fVar.a0.c(hashMap.size(), true);
                break;
            case 3:
                fVar.S(view);
                break;
            default:
                int i13 = f.n0;
                fVar.S(view);
                break;
        }
    }
}
