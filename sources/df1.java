// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class df1 implements Runnable {
    public final /* synthetic */ wf1 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ df1(wf1 wf1Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        this.a = wf1Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f;
        this.h = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.T0(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
