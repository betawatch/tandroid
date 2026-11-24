// default package

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ic0 extends r59 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final js i3;
    public hc0 j3;
    public final /* synthetic */ mc0 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(mc0 mc0Var, Activity activity) {
        super(activity, null);
        byte b;
        byte b2;
        this.k3 = mc0Var;
        this.f3 = new ArrayList();
        this.g3 = nm7.d3;
        this.h3 = -1;
        u46 u46Var = new u46();
        u46Var.i1(0);
        setLayoutManager(u46Var);
        int i = 0;
        while (true) {
            b = 7;
            b2 = 1;
            if (i >= 7) {
                break;
            }
            hc0 hc0Var = new hc0();
            int i2 = this.g3;
            this.g3 = i2 + 1;
            hc0Var.a = i2;
            int[] iArr = mc0.d0[i];
            hc0Var.c = iArr[0];
            hc0Var.d = iArr[1];
            hc0Var.e = iArr[2];
            hc0Var.f = iArr[3];
            this.f3.add(hc0Var);
            i++;
        }
        for (int i3 = 0; i3 < 30; i3++) {
            hc0 hc0Var2 = new hc0();
            int i4 = this.g3;
            this.g3 = i4 + 1;
            hc0Var2.a = i4;
            int[] iArr2 = mc0.e0[i3];
            hc0Var2.c = iArr2[0];
            hc0Var2.d = iArr2[1];
            hc0Var2.e = 0;
            hc0Var2.f = 0;
            hc0Var2.b = true;
            this.f3.add(hc0Var2);
        }
        setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        setOnItemClickListener(new u(this, b));
        js jsVar = new js(this, b2);
        this.i3 = jsVar;
        setAdapter(jsVar);
        setOverScrollMode(1);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) / this.i3.b();
        mc0 mc0Var = this.k3;
        mc0Var.Q = size;
        if (size < gm.L(39.0f)) {
            mc0Var.Q = gm.L(39.0f);
        } else if (mc0Var.Q > gm.L(150.0f)) {
            mc0Var.Q = gm.L(48.0f);
        }
        super.onMeasure(i, i2);
    }

    public final void z1(hc0 hc0Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i >= arrayList.size()) {
                this.j3 = hc0Var;
                this.h3 = 1;
                break;
            } else {
                if (((hc0) arrayList.get(i)).equals(hc0Var)) {
                    this.h3 = ((hc0) arrayList.get(i)).a;
                    break;
                }
                i++;
            }
        }
        this.i3.f();
    }
}
