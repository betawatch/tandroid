package gi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a3 extends View {
    public int a;
    public final /* synthetic */ d3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(d3 d3Var, Context context) {
        super(context);
        this.b = d3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        d3 d3Var = this.b;
        fi.g gVar = d3Var.e;
        ArrayList arrayList = d3Var.c0;
        int size = View.MeasureSpec.getSize(i3);
        int i12 = this.a;
        if (i12 != -1) {
            setMeasuredDimension(size, i12);
            return;
        }
        if (d3Var.f0 == d3.k0) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = d3Var.g0;
            if (arrayList2 != null) {
                i11 = (d3Var.e0 ? arrayList.size() : 0) + arrayList2.size() + (d3Var.d0 ? 1 : 0);
            } else {
                i11 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / gVar.J)) * d3Var.P)) * ((int) Math.ceil(i11 / gVar.J)))));
    }
}
