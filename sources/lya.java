// default package

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lya extends n39 {
    public int c;
    public final /* synthetic */ tya d;

    public lya(tya tyaVar) {
        this.d = tyaVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 1;
    }

    @Override // w39
    public final int b() {
        tya tyaVar = this.d;
        qya[] qyaVarArr = tyaVar.g3;
        int length = (qyaVarArr == null ? 0 : qyaVarArr.length) + 1;
        if (length != this.c) {
            si9 si9Var = tyaVar.t3;
            if (si9Var != null) {
                si9Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // w39
    public final int d(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        tya tyaVar;
        qya[] qyaVarArr;
        byte b = 1;
        if (s49Var.f != 1 || (qyaVarArr = (tyaVar = this.d).g3) == null) {
            return;
        }
        int i2 = i - 1;
        qya qyaVar = qyaVarArr[i2];
        final pya pyaVar = (pya) s49Var.a;
        boolean z = tyaVar.u3 == i2;
        pyaVar.getClass();
        if (!TextUtils.isEmpty(qyaVar.d)) {
            pyaVar.setContentDescription(qyaVar.d);
        } else if (TextUtils.isEmpty(qyaVar.a)) {
            pyaVar.setContentDescription(null);
        } else {
            pyaVar.setContentDescription(qyaVar.a);
        }
        ValueAnimator valueAnimator = pyaVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            pyaVar.H = null;
        }
        pyaVar.setImageResource(0);
        pyaVar.a();
        final boolean B1 = pyaVar.I.B1();
        pyaVar.x = false;
        pyaVar.E = 1.0f;
        vl.g(y6c.t0).b(qyaVar.c, new sl() { // from class: nya
            @Override // sl
            public final void a(TLRPC.Document document) {
                boolean z2 = !B1;
                pya pyaVar2 = pya.this;
                pyaVar2.setOnlyLastFrame(z2);
                pyaVar2.g(24, 24, document);
                pyaVar2.d();
            }
        });
        gl.e3(new kya(pyaVar, b), 60L);
        pyaVar.l(z, false);
        pyaVar.setAlpha(tyaVar.w3);
        pyaVar.setScaleX(tyaVar.w3);
        pyaVar.setScaleY(tyaVar.w3);
        pyaVar.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        pya pyaVar;
        tya tyaVar = this.d;
        if (i == 0) {
            si9 si9Var = new si9((byte) 9, tyaVar.getContext(), this);
            tyaVar.t3 = si9Var;
            pyaVar = si9Var;
        } else {
            pyaVar = new pya(tyaVar, tyaVar.getContext());
        }
        return new y29(pyaVar);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        if (s49Var.f == 1) {
            pya pyaVar = (pya) s49Var.a;
            pyaVar.l(this.d.u3 == s49Var.b() - 1, false);
            pyaVar.j();
        }
    }
}
