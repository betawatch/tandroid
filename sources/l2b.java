// default package

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class l2b extends c79 {
    public int c;
    public final /* synthetic */ t2b d;

    public l2b(t2b t2bVar) {
        this.d = t2bVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 1;
    }

    @Override // j79
    public final int b() {
        t2b t2bVar = this.d;
        q2b[] q2bVarArr = t2bVar.g3;
        int length = (q2bVarArr == null ? 0 : q2bVarArr.length) + 1;
        if (length != this.c) {
            nf9 nf9Var = t2bVar.t3;
            if (nf9Var != null) {
                nf9Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // j79
    public final int d(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        t2b t2bVar;
        q2b[] q2bVarArr;
        if (f89Var.f != 1 || (q2bVarArr = (t2bVar = this.d).g3) == null) {
            return;
        }
        int i2 = i - 1;
        q2b q2bVar = q2bVarArr[i2];
        final p2b p2bVar = (p2b) f89Var.a;
        boolean z = t2bVar.u3 == i2;
        p2bVar.getClass();
        if (!TextUtils.isEmpty(q2bVar.d)) {
            p2bVar.setContentDescription(q2bVar.d);
        } else if (TextUtils.isEmpty(q2bVar.a)) {
            p2bVar.setContentDescription(null);
        } else {
            p2bVar.setContentDescription(q2bVar.a);
        }
        ValueAnimator valueAnimator = p2bVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            p2bVar.H = null;
        }
        p2bVar.setImageResource(0);
        p2bVar.a();
        final boolean C1 = p2bVar.I.C1();
        p2bVar.x = false;
        p2bVar.E = 1.0f;
        wl.g(yac.t0).b(q2bVar.c, new tl() { // from class: n2b
            @Override // tl
            public final void a(TLRPC.Document document) {
                boolean z2 = !C1;
                p2b p2bVar2 = p2b.this;
                p2bVar2.setOnlyLastFrame(z2);
                p2bVar2.g(24, 24, document);
                p2bVar2.d();
            }
        });
        hl.d3(new uoa((Object) p2bVar, (byte) 18), 60L);
        p2bVar.l(z, false);
        p2bVar.setAlpha(t2bVar.w3);
        p2bVar.setScaleX(t2bVar.w3);
        p2bVar.setScaleY(t2bVar.w3);
        p2bVar.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        p2b p2bVar;
        t2b t2bVar = this.d;
        if (i == 0) {
            nf9 nf9Var = new nf9((byte) 10, t2bVar.getContext(), this);
            t2bVar.t3 = nf9Var;
            p2bVar = nf9Var;
        } else {
            p2bVar = new p2b(t2bVar, t2bVar.getContext());
        }
        return new n69(p2bVar);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        if (f89Var.f == 1) {
            p2b p2bVar = (p2b) f89Var.a;
            p2bVar.l(this.d.u3 == f89Var.b() - 1, false);
            p2bVar.j();
        }
    }
}
