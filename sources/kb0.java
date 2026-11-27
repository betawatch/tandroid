// default package

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kb0 extends d79 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final kr i3;
    public jb0 j3;
    public final /* synthetic */ ob0 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(ob0 ob0Var, Activity activity) {
        super(activity, null);
        byte b;
        this.k3 = ob0Var;
        this.f3 = new ArrayList();
        this.g3 = jn7.d3;
        this.h3 = -1;
        x46 x46Var = new x46();
        x46Var.i1(0);
        setLayoutManager(x46Var);
        int i = 0;
        while (true) {
            b = 1;
            if (i >= 7) {
                break;
            }
            jb0 jb0Var = new jb0();
            int i2 = this.g3;
            this.g3 = i2 + 1;
            jb0Var.a = i2;
            int[] iArr = ob0.d0[i];
            jb0Var.c = iArr[0];
            jb0Var.d = iArr[1];
            jb0Var.e = iArr[2];
            jb0Var.f = iArr[3];
            this.f3.add(jb0Var);
            i++;
        }
        for (int i3 = 0; i3 < 30; i3++) {
            jb0 jb0Var2 = new jb0();
            int i4 = this.g3;
            this.g3 = i4 + 1;
            jb0Var2.a = i4;
            int[] iArr2 = ob0.e0[i3];
            jb0Var2.c = iArr2[0];
            jb0Var2.d = iArr2[1];
            jb0Var2.e = 0;
            jb0Var2.f = 0;
            jb0Var2.b = true;
            this.f3.add(jb0Var2);
        }
        setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        setOnItemClickListener(new u(this, (byte) 6));
        kr krVar = new kr(this, b);
        this.i3 = krVar;
        setAdapter(krVar);
        setOverScrollMode(1);
    }

    public final void A1(jb0 jb0Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i >= arrayList.size()) {
                this.j3 = jb0Var;
                this.h3 = 1;
                break;
            } else {
                if (((jb0) arrayList.get(i)).equals(jb0Var)) {
                    this.h3 = ((jb0) arrayList.get(i)).a;
                    break;
                }
                i++;
            }
        }
        this.i3.f();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) / this.i3.b();
        ob0 ob0Var = this.k3;
        ob0Var.Q = size;
        if (size < hl.L(39.0f)) {
            ob0Var.Q = hl.L(39.0f);
        } else if (ob0Var.Q > hl.L(150.0f)) {
            ob0Var.Q = hl.L(48.0f);
        }
        super.onMeasure(i, i2);
    }
}
