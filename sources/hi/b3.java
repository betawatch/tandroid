package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class b3 extends View {
    public int a;
    public final /* synthetic */ e3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(e3 e3Var, Context context) {
        super(context);
        this.b = e3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        e3 e3Var = this.b;
        gi.g gVar = e3Var.e;
        ArrayList arrayList = e3Var.c0;
        int size = View.MeasureSpec.getSize(i7);
        int i12 = this.a;
        if (i12 != -1) {
            setMeasuredDimension(size, i12);
            return;
        }
        if (e3Var.f0 == e3.k0) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = e3Var.g0;
            if (arrayList2 != null) {
                i11 = (e3Var.e0 ? arrayList.size() : 0) + arrayList2.size() + (e3Var.d0 ? 1 : 0);
            } else {
                i11 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / gVar.J)) * e3Var.P)) * ((int) Math.ceil(i11 / gVar.J)))));
    }
}
