// default package

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class mr4 extends w29 {
    public final /* synthetic */ sr4 c;

    public mr4(sr4 sr4Var) {
        this.c = sr4Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 2;
    }

    @Override // w29
    public final String F(int i) {
        jm6 jm6Var;
        int i2 = i - 2;
        sr4 sr4Var = this.c;
        ArrayList arrayList = sr4Var.c0;
        if (sr4Var.d0) {
            if (i2 == 0) {
                return null;
            }
            i2 = i - 3;
        } else if (sr4Var.e0) {
            if (i2 >= 0 && i2 < arrayList.size()) {
                return k96.e0(((f4b) arrayList.get(i2)).d / 1000, true);
            }
            i2 -= arrayList.size();
        }
        ArrayList arrayList2 = sr4Var.g0;
        if (arrayList2 == null || i2 < 0 || i2 >= arrayList2.size() || (jm6Var = (jm6) sr4Var.g0.get(i2)) == null) {
            return null;
        }
        long j = jm6Var.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j /= 1000;
        }
        return k96.e0(j, true);
    }

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
        int e = e();
        float width = (o39Var.getWidth() - o39Var.getPaddingLeft()) - o39Var.getPaddingRight();
        sr4 sr4Var = this.c;
        ar0 ar0Var = sr4Var.e;
        float f2 = ar0Var.J;
        int i = (int) (((int) (width / f2)) * sr4Var.P);
        int ceil = (int) Math.ceil(e / f2);
        float U1 = (gl.U1(f, 0, Math.max(0, r1 - ((gl.q.y - o39Var.getPaddingTop()) - o39Var.getPaddingBottom()))) / (ceil * i)) * ceil;
        int round = Math.round(U1);
        iArr[0] = Math.max(0, ar0Var.J * round) + 2;
        iArr[1] = o39Var.getPaddingTop() + ((int) ((U1 - round) * i));
    }

    @Override // w29
    public final float H(o39 o39Var) {
        int e = e();
        float width = (o39Var.getWidth() - o39Var.getPaddingLeft()) - o39Var.getPaddingRight();
        float f = this.c.e.J;
        return (Math.max(0, o39Var.computeVerticalScrollOffset() - r4.getPadding()) - o39Var.getPaddingTop()) / ((((int) Math.ceil(e / f)) * ((int) (((int) (width / f)) * r4.P))) - (gl.q.y - o39Var.getPaddingTop()));
    }

    @Override // w39
    public final int b() {
        return e() + 3;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0 || i == b() - 1) {
            return 0;
        }
        return i == 1 ? 1 : 2;
    }

    @Override // w39
    public final int e() {
        sr4 sr4Var = this.c;
        ArrayList arrayList = sr4Var.g0;
        int size = arrayList == null ? 0 : arrayList.size();
        return sr4Var.d0 ? size + 1 : sr4Var.e0 ? sr4Var.c0.size() + size : size;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        sr4 sr4Var = this.c;
        ArrayList arrayList = sr4Var.i0;
        ArrayList arrayList2 = sr4Var.c0;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            ((pr4) view).a = i == 0 ? sr4Var.getPadding() : -1;
            return;
        }
        if (i2 == 2) {
            or4 or4Var = (or4) view;
            char c = 1;
            byte b = 0;
            boolean z = i == 2;
            boolean z2 = i == 4;
            or4Var.V = z;
            or4Var.W = z2;
            or4Var.N = new lr4(this, or4Var, b);
            or4Var.O = new lr4(this, or4Var, c == true ? 1 : 0);
            int i3 = i - 2;
            if (sr4Var.d0) {
                if (i3 == 0) {
                    or4Var.f(-1, false, false);
                    or4Var.e(arrayList2.size(), (f4b) arrayList2.get(0));
                    return;
                }
                i3 = i - 3;
            } else if (sr4Var.e0) {
                if (i3 >= 0 && i3 < arrayList2.size()) {
                    or4Var.f(-1, false, false);
                    or4Var.e(0, (f4b) arrayList2.get(i3));
                    return;
                }
                i3 -= arrayList2.size();
            }
            ArrayList arrayList3 = sr4Var.g0;
            if (arrayList3 == null || i3 < 0 || i3 >= arrayList3.size()) {
                return;
            }
            jm6 jm6Var = (jm6) sr4Var.g0.get(i3);
            or4Var.f(arrayList.indexOf(jm6Var), !arrayList.isEmpty() || sr4Var.R, or4Var.T == jm6Var);
            or4Var.T = jm6Var;
            or4Var.g((jm6Var == null || !jm6Var.b || jm6Var.d()) ? null : gl.g0(jm6Var.E, false, false));
            or4Var.G = null;
            if (jm6Var == null) {
                or4Var.P = null;
            } else if (jm6Var.b) {
                or4Var.P = k96.M0(2131753930, null) + ", " + k96.z(jm6Var.E);
            } else {
                or4Var.P = k96.M0(2131753945, null);
            }
            or4Var.b(jm6Var);
            or4Var.invalidate();
            if (sr4Var.N) {
                or4Var.J.setOnClickListener(new b0(this, jm6Var, or4Var, (byte) 29));
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View or4Var;
        sr4 sr4Var = this.c;
        if (i == 0) {
            or4Var = new pr4(sr4Var, sr4Var.getContext());
        } else if (i == 1) {
            Context context = sr4Var.getContext();
            boolean z = sr4Var.M;
            a6 a6Var = new a6(context, (byte) 14);
            a6Var.setPadding(gl.L(z ? 14.0f : 16.0f), gl.L(16.0f), gl.L(8.0f), gl.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(gl.o());
            textView.setText(sr4Var.getTitle());
            a6Var.addView(textView, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, z ? 32.0f : 0.0f, 0.0f));
            sr4Var.j0 = a6Var;
            or4Var = a6Var;
        } else {
            or4Var = new or4(sr4Var.getContext(), sr4Var.b, sr4Var.P, sr4Var.N);
        }
        return new y29(or4Var);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        sr4 sr4Var = this.c;
        ArrayList arrayList = sr4Var.i0;
        if (s49Var.f == 2) {
            or4 or4Var = (or4) s49Var.a;
            Object obj = or4Var.T;
            if (!(obj instanceof jm6)) {
                or4Var.f(-1, false, false);
            } else {
                or4Var.f(arrayList.indexOf((jm6) obj), !arrayList.isEmpty() || sr4Var.R, false);
            }
        }
    }
}
