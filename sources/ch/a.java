package ch;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import n2.b0;
import org.telegram.ui.Components.in;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ a(h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        h hVar = this.b;
        switch (i10) {
            case 0:
                b0 b0Var = hVar.g0;
                if (b0Var != null) {
                    ArrayList arrayList = new ArrayList(hVar.f0.keySet());
                    in inVar = (in) b0Var.b;
                    ArrayList arrayList2 = inVar.L0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = inVar.H0;
                    if (i11 >= 0) {
                        inVar.r.m(i11);
                    }
                }
                hVar.dismiss();
                break;
            case 1:
                b0 b0Var2 = hVar.g0;
                if (b0Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(hVar.f0.keySet());
                    in inVar2 = (in) b0Var2.b;
                    ArrayList arrayList4 = inVar2.L0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = inVar2.H0;
                    if (i12 >= 0) {
                        inVar2.r.m(i12);
                    }
                }
                hVar.dismiss();
                break;
            case 2:
                HashMap hashMap = hVar.f0;
                hashMap.clear();
                hVar.d0.b();
                hVar.Z.N(true);
                hVar.a0.c(hashMap.size(), true);
                break;
            case 3:
                hVar.S(view);
                break;
            default:
                int i13 = h.n0;
                hVar.S(view);
                break;
        }
    }
}
