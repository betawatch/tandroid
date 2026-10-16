package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class c7 extends FrameLayout implements r0.m {
    public final b2.v0 a;
    public final /* synthetic */ e7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(e7 e7Var, Context context) {
        super(context);
        this.b = e7Var;
        this.a = new b2.v0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        e7 e7Var = this.b;
        sb sbVar = e7Var.r;
        if (e7Var.x > 0) {
            return;
        }
        float f7 = sbVar.e0;
        float f10 = e7Var.c;
        if (f7 >= f10 || i11 <= 0) {
            return;
        }
        float f11 = f7 + i11;
        iArr[1] = i11;
        if (f11 <= f10) {
            f10 = f11;
        }
        e7Var.setOffset(f10);
        sbVar.e0 = f10;
        q5 currentPeerView = sbVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        hb hbVar = sbVar.v;
        if (hbVar != null) {
            hbVar.invalidate();
        }
    }

    @Override // r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        e7 e7Var = this.b;
        sb sbVar = e7Var.r;
        if (e7Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = sbVar.e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            e7Var.setOffset(f7);
            sbVar.e0 = f7;
            q5 currentPeerView = sbVar.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            hb hbVar = sbVar.v;
            if (hbVar != null) {
                hbVar.invalidate();
            }
        }
    }

    @Override // r0.l
    public final void n(int i10, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return this.b.x <= 0 && i10 == 2;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.a.a = i10;
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
