package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j3 extends View {
    public int a;
    public final /* synthetic */ m3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(m3 m3Var, Context context) {
        super(context);
        this.b = m3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        m3 m3Var = this.b;
        gi.g gVar = m3Var.e;
        ArrayList arrayList = m3Var.c0;
        int size = View.MeasureSpec.getSize(i7);
        int i12 = this.a;
        if (i12 != -1) {
            setMeasuredDimension(size, i12);
            return;
        }
        if (m3Var.f0 == m3.k0) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = m3Var.g0;
            if (arrayList2 != null) {
                i11 = (m3Var.e0 ? arrayList.size() : 0) + arrayList2.size() + (m3Var.d0 ? 1 : 0);
            } else {
                i11 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / gVar.J)) * m3Var.P)) * ((int) Math.ceil(i11 / gVar.J)))));
    }
}
