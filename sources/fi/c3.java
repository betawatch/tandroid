package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c3 extends View {
    public int a;
    public final /* synthetic */ f3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(f3 f3Var, Context context) {
        super(context);
        this.b = f3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        f3 f3Var = this.b;
        ei.h hVar = f3Var.e;
        ArrayList arrayList = f3Var.b0;
        int size = View.MeasureSpec.getSize(i7);
        int i12 = this.a;
        if (i12 != -1) {
            setMeasuredDimension(size, i12);
            return;
        }
        if (f3Var.e0 == f3.j0) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = f3Var.f0;
            if (arrayList2 != null) {
                i11 = (f3Var.d0 ? arrayList.size() : 0) + arrayList2.size() + (f3Var.c0 ? 1 : 0);
            } else {
                i11 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / hVar.J)) * f3Var.O)) * ((int) Math.ceil(i11 / hVar.J)))));
    }
}
