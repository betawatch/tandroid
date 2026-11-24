// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class hha extends z49 {
    public final Context c;
    public boolean d;
    public jd4 e;
    public final /* synthetic */ nha f;

    public hha(nha nhaVar, Context context) {
        this.f = nhaVar;
        this.c = context;
    }

    @Override // q59
    public boolean D(u69 u69Var) {
        return false;
    }

    @Override // z49
    public final boolean E(r59 r59Var) {
        nha nhaVar = this.f;
        if (!nhaVar.q0()) {
            int ceil = (int) Math.ceil(e() / ((this == nhaVar.K || nhaVar.x1(this) != -1) ? nhaVar.p1[0] : nhaVar.t1));
            if (r59Var.getChildCount() != 0 && r59Var.getChildAt(0).getMeasuredHeight() * ceil > r59Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // z49
    public String F(int i) {
        ArrayList arrayList = this.f.w1[0].e;
        if (arrayList.isEmpty()) {
            return "";
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i <= ((nga) arrayList.get(i2)).b) {
                return ((nga) arrayList.get(i2)).a;
            }
        }
        return ((nga) b10.f(1, arrayList)).a;
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        int i;
        int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
        nha nhaVar = this.f;
        if (nhaVar.y1(this) != -1 || this == nhaVar.L) {
            i = nhaVar.t1;
        } else {
            int x1 = nhaVar.x1(this);
            int[] iArr2 = nhaVar.p1;
            i = x1 != -1 ? iArr2[1] : iArr2[0];
        }
        int ceil = (int) (Math.ceil(e() / i) * measuredHeight);
        int measuredHeight2 = r59Var.getMeasuredHeight() - r59Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f2 = f * (ceil - measuredHeight2);
            iArr[0] = ((int) (f2 / measuredHeight)) * i;
            iArr[1] = ((int) f2) % measuredHeight;
        }
    }

    @Override // z49
    public final float H(r59 r59Var) {
        int i;
        nha nhaVar = this.f;
        if (this == nhaVar.L || nhaVar.y1(this) != -1) {
            i = nhaVar.t1;
        } else {
            int x1 = nhaVar.x1(this);
            int[] iArr = nhaVar.p1;
            i = x1 != -1 ? iArr[1] : iArr[0];
        }
        int ceil = (int) Math.ceil(e() / i);
        if (r59Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(r59Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r3 / i) * measuredHeight) - (r2.getTop() - r59Var.getPaddingTop())) / ((ceil * measuredHeight) - (r59Var.getMeasuredHeight() - r59Var.getPaddingTop()));
    }

    @Override // z49
    public void I() {
        this.f.n1(0, true);
    }

    @Override // z49
    public final void J(r59 r59Var) {
        if (this.d) {
            this.d = false;
            int i = 0;
            for (int i2 = 0; i2 < r59Var.getChildCount(); i2++) {
                View childAt = r59Var.getChildAt(i2);
                if (childAt instanceof sha) {
                    i = ((sha) childAt).getMessageId();
                }
                if (i != 0) {
                    break;
                }
            }
            if (i == 0) {
                this.f.L(0, r59Var, true);
            }
        }
    }

    @Override // z49
    public final void K() {
        this.d = true;
        iga P = this.f.P(0);
        if (P != null) {
            nha.m1(P, null, false);
        }
    }

    public int L(int i) {
        return this.f.w1[0].m + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r0[1] != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r5[1] != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r3[1] != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r0.l == false) goto L39;
     */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        int size;
        nha nhaVar = this.f;
        boolean B = pg3.B(nhaVar.m1);
        cha[] chaVarArr = nhaVar.w1;
        if (B) {
            if (chaVarArr[0].a.size() != 0 || chaVarArr[0].g) {
                if (chaVarArr[0].a.size() == 0) {
                    boolean[] zArr = chaVarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                size = chaVarArr[0].c().size() + chaVarArr[0].d();
                if (size != 0) {
                    boolean[] zArr2 = chaVarArr[0].i;
                    if (zArr2[0]) {
                    }
                    return size + 1;
                }
                return size;
            }
            return 1;
        }
        cha chaVar = chaVarArr[0];
        if (chaVar.o) {
            return chaVar.e();
        }
        if (chaVar.a.size() != 0 || chaVarArr[0].g) {
            if (chaVarArr[0].a.size() == 0) {
                cha chaVar2 = chaVarArr[0];
                boolean[] zArr3 = chaVar2.i;
                if (zArr3[0]) {
                }
            }
            if (chaVarArr[0].e() != 0) {
                return Math.max(chaVarArr[0].e(), chaVarArr[0].c().size() + chaVarArr[0].d());
            }
            size = chaVarArr[0].c().size() + chaVarArr[0].d();
            if (size == 0) {
                return size;
            }
            cha chaVar3 = chaVarArr[0];
            boolean[] zArr4 = chaVar3.i;
            if (zArr4[0] && zArr4[1]) {
                return size;
            }
            boolean z = chaVar3.r;
            if ((z ? chaVar3.u : chaVar3.n) != 0) {
                return (z ? chaVar3.u : chaVar3.n) + size;
            }
            return size + 1;
        }
        return 1;
    }

    @Override // y59
    public int d(int i) {
        cha[] chaVarArr = this.f.w1;
        if (!this.d && chaVarArr[0].c().size() == 0) {
            cha chaVar = chaVarArr[0];
            if (!chaVar.g && chaVar.l) {
                return 2;
            }
        }
        chaVarArr[0].getClass();
        chaVarArr[0].c().size();
        chaVarArr[0].getClass();
        return 0;
    }

    @Override // y59
    public int e() {
        return this.f.w1[0].e();
    }

    @Override // y59
    public void t(u69 u69Var, int i) {
        nha nhaVar = this.f;
        int[] iArr = nhaVar.p1;
        cha[] chaVarArr = nhaVar.w1;
        if (u69Var.f == 0) {
            ArrayList c = chaVarArr[0].c();
            int d = i - chaVarArr[0].d();
            View view = u69Var.a;
            if (view instanceof sha) {
                sha shaVar = (sha) view;
                int messageId = shaVar.getMessageId();
                int i2 = this == nhaVar.K ? iArr[0] : nhaVar.x1(this) != -1 ? iArr[1] : nhaVar.t1;
                if (d < 0 || d >= c.size()) {
                    shaVar.k(null, i2, false);
                    shaVar.i(false, false);
                    return;
                }
                k47 k47Var = (k47) c.get(d);
                boolean z = k47Var.e1() == messageId;
                if (nhaVar.F1) {
                    shaVar.i(nhaVar.c1[(k47.B0(k47Var.k) > nhaVar.m1 ? 1 : (k47.B0(k47Var.k) == nhaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k47Var.e1()) >= 0, z);
                } else {
                    shaVar.i(false, z);
                }
                shaVar.k(k47Var, i2, false);
            }
        }
    }

    @Override // y59
    public u69 x(ViewGroup viewGroup, int i) {
        nha nhaVar = this.f;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        if (i != 0 && i != 19) {
            bj G = nha.G(0, nhaVar.m1, ylbVar, context);
            G.setLayoutParams(new g69(-1, -1));
            return new b59(G);
        }
        if (this.e == null) {
            this.e = new jd4(viewGroup.getContext(), ylbVar);
        }
        sha shaVar = new sha(context, this.e, nhaVar.y1.getCurrentAccount());
        if (i == 19) {
            shaVar.x0 = true;
        }
        shaVar.setGradientView(nhaVar.E);
        if (nhaVar.x1(this) != -1) {
            shaVar.e0 = true;
        }
        shaVar.setLayoutParams(new g69(-1, -2));
        return new b59(shaVar);
    }
}
