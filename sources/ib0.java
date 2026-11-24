// default package

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ib0 extends o39 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final jr i3;
    public hb0 j3;
    public final /* synthetic */ mb0 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib0(mb0 mb0Var, Activity activity) {
        super(activity, null);
        byte b;
        this.k3 = mb0Var;
        this.f3 = new ArrayList();
        this.g3 = kk7.d3;
        this.h3 = -1;
        t26 t26Var = new t26();
        t26Var.i1(0);
        setLayoutManager(t26Var);
        int i = 0;
        while (true) {
            b = 1;
            if (i >= 7) {
                break;
            }
            hb0 hb0Var = new hb0();
            int i2 = this.g3;
            this.g3 = i2 + 1;
            hb0Var.a = i2;
            int[] iArr = mb0.d0[i];
            hb0Var.c = iArr[0];
            hb0Var.d = iArr[1];
            hb0Var.e = iArr[2];
            hb0Var.f = iArr[3];
            this.f3.add(hb0Var);
            i++;
        }
        for (int i3 = 0; i3 < 30; i3++) {
            hb0 hb0Var2 = new hb0();
            int i4 = this.g3;
            this.g3 = i4 + 1;
            hb0Var2.a = i4;
            int[] iArr2 = mb0.e0[i3];
            hb0Var2.c = iArr2[0];
            hb0Var2.d = iArr2[1];
            hb0Var2.e = 0;
            hb0Var2.f = 0;
            hb0Var2.b = true;
            this.f3.add(hb0Var2);
        }
        setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        setOnItemClickListener(new u(this, (byte) 6));
        jr jrVar = new jr(this, b);
        this.i3 = jrVar;
        setAdapter(jrVar);
        setOverScrollMode(1);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) / this.i3.b();
        mb0 mb0Var = this.k3;
        mb0Var.Q = size;
        if (size < gl.L(39.0f)) {
            mb0Var.Q = gl.L(39.0f);
        } else if (mb0Var.Q > gl.L(150.0f)) {
            mb0Var.Q = gl.L(48.0f);
        }
        super.onMeasure(i, i2);
    }

    public final void z1(hb0 hb0Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i >= arrayList.size()) {
                this.j3 = hb0Var;
                this.h3 = 1;
                break;
            } else {
                if (((hb0) arrayList.get(i)).equals(hb0Var)) {
                    this.h3 = ((hb0) arrayList.get(i)).a;
                    break;
                }
                i++;
            }
        }
        this.i3.f();
    }
}
