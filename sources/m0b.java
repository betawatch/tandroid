// default package

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m0b extends q59 {
    public int c;
    public final /* synthetic */ u0b d;

    public m0b(u0b u0bVar) {
        this.d = u0bVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 1;
    }

    @Override // y59
    public final int b() {
        u0b u0bVar = this.d;
        r0b[] r0bVarArr = u0bVar.g3;
        int length = (r0bVarArr == null ? 0 : r0bVarArr.length) + 1;
        if (length != this.c) {
            xd9 xd9Var = u0bVar.t3;
            if (xd9Var != null) {
                xd9Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // y59
    public final int d(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        u0b u0bVar;
        r0b[] r0bVarArr;
        if (u69Var.f != 1 || (r0bVarArr = (u0bVar = this.d).g3) == null) {
            return;
        }
        int i2 = i - 1;
        r0b r0bVar = r0bVarArr[i2];
        final q0b q0bVar = (q0b) u69Var.a;
        boolean z = u0bVar.u3 == i2;
        q0bVar.getClass();
        if (!TextUtils.isEmpty(r0bVar.d)) {
            q0bVar.setContentDescription(r0bVar.d);
        } else if (TextUtils.isEmpty(r0bVar.a)) {
            q0bVar.setContentDescription(null);
        } else {
            q0bVar.setContentDescription(r0bVar.a);
        }
        ValueAnimator valueAnimator = q0bVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            q0bVar.H = null;
        }
        q0bVar.setImageResource(0);
        q0bVar.a();
        final boolean B1 = q0bVar.I.B1();
        q0bVar.x = false;
        q0bVar.E = 1.0f;
        vm.g(z8c.t0).b(r0bVar.c, new sm() { // from class: o0b
            @Override // sm
            public final void a(TLRPC.Document document) {
                boolean z2 = !B1;
                q0b q0bVar2 = q0b.this;
                q0bVar2.setOnlyLastFrame(z2);
                q0bVar2.g(24, 24, document);
                q0bVar2.d();
            }
        });
        gm.d3(new nsa((Object) q0bVar, (byte) 9), 60L);
        q0bVar.l(z, false);
        q0bVar.setAlpha(u0bVar.w3);
        q0bVar.setScaleX(u0bVar.w3);
        q0bVar.setScaleY(u0bVar.w3);
        q0bVar.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        q0b q0bVar;
        u0b u0bVar = this.d;
        if (i == 0) {
            xd9 xd9Var = new xd9((byte) 10, u0bVar.getContext(), this);
            u0bVar.t3 = xd9Var;
            q0bVar = xd9Var;
        } else {
            q0bVar = new q0b(u0bVar, u0bVar.getContext());
        }
        return new b59(q0bVar);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        if (u69Var.f == 1) {
            q0b q0bVar = (q0b) u69Var.a;
            q0bVar.l(this.d.u3 == u69Var.b() - 1, false);
            q0bVar.j();
        }
    }
}
