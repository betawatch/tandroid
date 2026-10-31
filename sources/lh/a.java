package lh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.jn;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        g gVar = this.b;
        switch (i10) {
            case 0:
                l2.f fVar = gVar.c2;
                if (fVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.b2.keySet());
                    jn jnVar = (jn) fVar.b;
                    ArrayList arrayList2 = jnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = jnVar.L0;
                    if (i11 >= 0) {
                        jnVar.r.g(i11);
                    }
                }
                gVar.dismiss();
                break;
            case 1:
                l2.f fVar2 = gVar.c2;
                if (fVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.b2.keySet());
                    jn jnVar2 = (jn) fVar2.b;
                    ArrayList arrayList4 = jnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = jnVar2.L0;
                    if (i12 >= 0) {
                        jnVar2.r.g(i12);
                    }
                }
                gVar.dismiss();
                break;
            case 2:
                HashMap hashMap = gVar.b2;
                hashMap.clear();
                gVar.Z1.b();
                gVar.V1.O(true);
                gVar.W1.c(hashMap.size(), true);
                break;
            case 3:
                gVar.g1(view);
                break;
            default:
                int i13 = g.j2;
                gVar.g1(view);
                break;
        }
    }
}
