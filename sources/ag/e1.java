package ag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.uk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e1 extends pk0 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final /* synthetic */ h1 x;

    public e1(h1 h1Var, Context context) {
        this.x = h1Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i10 = e20.s0;
        this.s = i10;
        this.w = context;
        arrayList.addAll(i3.f(i10).e());
    }

    @Override // org.telegram.ui.Components.bk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.bk0
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pk0
    public final int M(int i10) {
        if (i10 == 0 || i10 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.pk0
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.pk0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.pk0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.pk0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return (i10 == 0 || i10 == 2 || i11 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f == 0) {
            y2 y2Var = (y2) c1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof h3) {
                h3 h3Var = (h3) O;
                y2Var.a(h3Var, null, z10);
                y2Var.d.a(this.x.x.contains(Integer.valueOf(h3Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.pk0, s4.g0
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(i3.f(this.s).e());
        X(false);
        this.x.O();
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View y2Var;
        Context context = this.w;
        if (i10 == 0) {
            y2Var = new y2(context, this.x.a, false);
        } else if (i10 != 1) {
            y2Var = new View(context);
            y2Var.setTag(-33024);
        } else {
            y2Var = new View(context);
            y2Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
            y2Var.setTag(-33024);
        }
        return new dk0(y2Var);
    }
}
