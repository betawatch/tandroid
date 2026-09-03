package hh;

import android.view.View;
import androidx.biometric.f0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.rn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                    rn rnVar = (rn) f0Var.b;
                    ArrayList arrayList2 = rnVar.M0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = rnVar.I0;
                    if (i11 >= 0) {
                        rnVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                f0 f0Var2 = fVar.h0;
                if (f0Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.g0.keySet());
                    rn rnVar2 = (rn) f0Var2.b;
                    ArrayList arrayList4 = rnVar2.M0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = rnVar2.I0;
                    if (i12 >= 0) {
                        rnVar2.r.m(i12);
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
