// default package

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c48 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final v41 l;
    public boolean m;
    public final mm n;
    public int o;
    public final /* synthetic */ d48 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public c48(d48 d48Var) {
        this.r = d48Var;
        this.l = new v41(d48Var);
        this.n = new mm(d48Var, 0L, 320L, k43.h);
    }

    public final void a(kc7 kc7Var) {
        d48 d48Var = this.r;
        vnb vnbVar = d48Var.a;
        if (kc7Var == null) {
            return;
        }
        int[] iArr = kc7Var.g;
        int[] iArr2 = kc7Var.h;
        boolean o = vnbVar == null ? aob.I.o() : vnbVar.a();
        byte b = d48Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (b != 1) {
            paint2.setColor(kc7Var.e(0, vnbVar));
            paint.setColor(kc7Var.o(o) ? kc7Var.e(1, vnbVar) : kc7Var.e(0, vnbVar));
            this.f = kc7Var.o(o);
            this.g = false;
            return;
        }
        if (o && kc7Var.g() != kc7Var.f() && kc7Var.i() == kc7Var.f()) {
            paint2.setColor(kc7Var.e(1, vnbVar));
            paint.setColor(kc7Var.e(0, vnbVar));
        } else {
            paint2.setColor(kc7Var.e(0, vnbVar));
            paint.setColor(kc7Var.e(1, vnbVar));
        }
        this.c.setColor(kc7Var.e(2, vnbVar));
        this.f = kc7Var.h(o) != (o ? iArr2 : iArr)[0];
        int j = kc7Var.j(o);
        if (o) {
            iArr = iArr2;
        }
        this.g = j != iArr[0];
    }
}
