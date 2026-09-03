package gh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.pn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                o3.c cVar = fVar.h0;
                if (cVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.g0.keySet());
                    pn pnVar = (pn) cVar.b;
                    ArrayList arrayList2 = pnVar.M0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = pnVar.I0;
                    if (i11 >= 0) {
                        pnVar.r.m(i11);
                    }
                }
                fVar.dismiss();
                break;
            case 1:
                o3.c cVar2 = fVar.h0;
                if (cVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.g0.keySet());
                    pn pnVar2 = (pn) cVar2.b;
                    ArrayList arrayList4 = pnVar2.M0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = pnVar2.I0;
                    if (i12 >= 0) {
                        pnVar2.r.m(i12);
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
