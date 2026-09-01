package hh;

import android.view.View;
import androidx.biometric.f0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.sn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                f0 f0Var = fVar.h0;
                if (f0Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.g0.keySet());
                    sn snVar = (sn) f0Var.b;
                    ArrayList arrayList2 = snVar.M0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = snVar.I0;
                    if (i11 >= 0) {
                        snVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                f0 f0Var2 = fVar.h0;
                if (f0Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.g0.keySet());
                    sn snVar2 = (sn) f0Var2.b;
                    ArrayList arrayList4 = snVar2.M0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = snVar2.I0;
                    if (i12 >= 0) {
                        snVar2.r.m(i12);
                    }
                }
                fVar.dismiss();
                break;
            case 2:
                HashMap hashMap = fVar.g0;
                hashMap.clear();
                fVar.e0.b();
                fVar.a0.N(true);
                fVar.b0.c(hashMap.size(), true);
                break;
            case 3:
                fVar.S(view);
                break;
            default:
                int i13 = f.o0;
                fVar.S(view);
                break;
        }
    }
}
