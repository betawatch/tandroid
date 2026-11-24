// default package

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class nt4 extends z49 {
    public final /* synthetic */ tt4 c;

    public nt4(tt4 tt4Var) {
        this.c = tt4Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 2;
    }

    @Override // z49
    public final String F(int i) {
        jo6 jo6Var;
        int i2 = i - 2;
        tt4 tt4Var = this.c;
        ArrayList arrayList = tt4Var.c0;
        if (tt4Var.d0) {
            if (i2 == 0) {
                return null;
            }
            i2 = i - 3;
        } else if (tt4Var.e0) {
            if (i2 >= 0 && i2 < arrayList.size()) {
                return jb6.e0(((g6b) arrayList.get(i2)).d / 1000, true);
            }
            i2 -= arrayList.size();
        }
        ArrayList arrayList2 = tt4Var.g0;
        if (arrayList2 == null || i2 < 0 || i2 >= arrayList2.size() || (jo6Var = (jo6) tt4Var.g0.get(i2)) == null) {
            return null;
        }
        long j = jo6Var.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j /= 1000;
        }
        return jb6.e0(j, true);
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        int e = e();
        float width = (r59Var.getWidth() - r59Var.getPaddingLeft()) - r59Var.getPaddingRight();
        tt4 tt4Var = this.c;
        as0 as0Var = tt4Var.e;
        float f2 = as0Var.J;
        int i = (int) (((int) (width / f2)) * tt4Var.P);
        int ceil = (int) Math.ceil(e / f2);
        float U1 = (gm.U1(f, 0, Math.max(0, r1 - ((gm.q.y - r59Var.getPaddingTop()) - r59Var.getPaddingBottom()))) / (ceil * i)) * ceil;
        int round = Math.round(U1);
        iArr[0] = Math.max(0, as0Var.J * round) + 2;
        iArr[1] = r59Var.getPaddingTop() + ((int) ((U1 - round) * i));
    }

    @Override // z49
    public final float H(r59 r59Var) {
        int e = e();
        float width = (r59Var.getWidth() - r59Var.getPaddingLeft()) - r59Var.getPaddingRight();
        float f = this.c.e.J;
        return (Math.max(0, r59Var.computeVerticalScrollOffset() - r4.getPadding()) - r59Var.getPaddingTop()) / ((((int) Math.ceil(e / f)) * ((int) (((int) (width / f)) * r4.P))) - (gm.q.y - r59Var.getPaddingTop()));
    }

    @Override // y59
    public final int b() {
        return e() + 3;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0 || i == b() - 1) {
            return 0;
        }
        return i == 1 ? 1 : 2;
    }

    @Override // y59
    public final int e() {
        tt4 tt4Var = this.c;
        ArrayList arrayList = tt4Var.g0;
        int size = arrayList == null ? 0 : arrayList.size();
        return tt4Var.d0 ? size + 1 : tt4Var.e0 ? tt4Var.c0.size() + size : size;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        tt4 tt4Var = this.c;
        ArrayList arrayList = tt4Var.i0;
        ArrayList arrayList2 = tt4Var.c0;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            ((qt4) view).a = i == 0 ? tt4Var.getPadding() : -1;
            return;
        }
        if (i2 == 2) {
            pt4 pt4Var = (pt4) view;
            char c = 1;
            byte b = 0;
            boolean z = i == 2;
            boolean z2 = i == 4;
            pt4Var.V = z;
            pt4Var.W = z2;
            pt4Var.N = new mt4(this, pt4Var, b);
            pt4Var.O = new mt4(this, pt4Var, c == true ? 1 : 0);
            int i3 = i - 2;
            if (tt4Var.d0) {
                if (i3 == 0) {
                    pt4Var.f(-1, false, false);
                    pt4Var.e(arrayList2.size(), (g6b) arrayList2.get(0));
                    return;
                }
                i3 = i - 3;
            } else if (tt4Var.e0) {
                if (i3 >= 0 && i3 < arrayList2.size()) {
                    pt4Var.f(-1, false, false);
                    pt4Var.e(0, (g6b) arrayList2.get(i3));
                    return;
                }
                i3 -= arrayList2.size();
            }
            ArrayList arrayList3 = tt4Var.g0;
            if (arrayList3 == null || i3 < 0 || i3 >= arrayList3.size()) {
                return;
            }
            jo6 jo6Var = (jo6) tt4Var.g0.get(i3);
            pt4Var.f(arrayList.indexOf(jo6Var), !arrayList.isEmpty() || tt4Var.R, pt4Var.T == jo6Var);
            pt4Var.T = jo6Var;
            pt4Var.g((jo6Var == null || !jo6Var.b || jo6Var.d()) ? null : gm.g0(jo6Var.E, false, false));
            pt4Var.G = null;
            if (jo6Var == null) {
                pt4Var.P = null;
            } else if (jo6Var.b) {
                pt4Var.P = jb6.M0(2131753898, null) + ", " + jb6.z(jo6Var.E);
            } else {
                pt4Var.P = jb6.M0(2131753913, null);
            }
            pt4Var.b(jo6Var);
            pt4Var.invalidate();
            if (tt4Var.N) {
                pt4Var.J.setOnClickListener(new b0(this, jo6Var, pt4Var, (byte) 29));
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View pt4Var;
        tt4 tt4Var = this.c;
        if (i == 0) {
            pt4Var = new qt4(tt4Var, tt4Var.getContext());
        } else if (i == 1) {
            Context context = tt4Var.getContext();
            boolean z = tt4Var.M;
            a6 a6Var = new a6(context, (byte) 14);
            a6Var.setPadding(gm.L(z ? 14.0f : 16.0f), gm.L(16.0f), gm.L(8.0f), gm.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(gm.o());
            textView.setText(tt4Var.getTitle());
            a6Var.addView(textView, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, z ? 32.0f : 0.0f, 0.0f));
            tt4Var.j0 = a6Var;
            pt4Var = a6Var;
        } else {
            pt4Var = new pt4(tt4Var.getContext(), tt4Var.b, tt4Var.P, tt4Var.N);
        }
        return new b59(pt4Var);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        tt4 tt4Var = this.c;
        ArrayList arrayList = tt4Var.i0;
        if (u69Var.f == 2) {
            pt4 pt4Var = (pt4) u69Var.a;
            Object obj = pt4Var.T;
            if (!(obj instanceof jo6)) {
                pt4Var.f(-1, false, false);
            } else {
                pt4Var.f(arrayList.indexOf((jo6) obj), !arrayList.isEmpty() || tt4Var.R, false);
            }
        }
    }
}
