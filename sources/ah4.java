// default package

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ah4 extends q59 {
    public final Context c;
    public final /* synthetic */ ch4 d;

    public ah4(ch4 ch4Var, Context context) {
        this.d = ch4Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        ch4 ch4Var = this.d;
        if (ch4Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r0.size() / ch4Var.s)) + (!ch4Var.O ? 1 : 0);
    }

    @Override // y59
    public final int d(int i) {
        ch4 ch4Var = this.d;
        return i < ((int) Math.ceil((double) (((float) ch4Var.f.size()) / ((float) ch4Var.s)))) ? 0 : 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        ch4 ch4Var = this.d;
        ug4 ug4Var = ch4Var.T;
        ArrayList arrayList = ch4Var.f;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 != 3) {
                if (i2 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / ch4Var.s);
                    byte b = ch4Var.s;
                    ((tk4) view).w = b - ((ceil * b) - arrayList.size());
                    return;
                }
                return;
            }
            hg3 hg3Var = (hg3) view;
            hg3Var.t2 = i != b() - 1;
            k47 k47Var = (k47) arrayList.get(i);
            boolean z = hg3Var.getMessage() != null && hg3Var.getMessage().e1() == k47Var.e1();
            hg3Var.P = ch4Var.q0;
            hg3Var.e0(k47.B0(k47Var.k), k47Var, k47Var.k.date, false, false);
            if (!ch4Var.p0.u()) {
                hg3Var.d0(false, z);
                return;
            }
            int e1 = k47Var.e1();
            ug4Var.a = k47.B0(k47Var.k);
            ug4Var.b = e1;
            hg3Var.d0(ch4Var.p0.e(ug4Var), z);
            return;
        }
        tha thaVar = (tha) view;
        thaVar.setItemsCount(ch4Var.s);
        thaVar.setIsFirst(i == 0);
        int i3 = 0;
        while (true) {
            byte b2 = ch4Var.s;
            if (i3 >= b2) {
                thaVar.requestLayout();
                return;
            }
            int i4 = (b2 * i) + i3;
            if (i4 < arrayList.size()) {
                k47 k47Var2 = (k47) arrayList.get(i4);
                thaVar.c(i3, arrayList.indexOf(k47Var2), k47Var2);
                if (ch4Var.p0.u()) {
                    int e12 = k47Var2.e1();
                    ug4Var.a = k47.B0(k47Var2.k);
                    ug4Var.b = e12;
                    thaVar.b(i3, ch4Var.p0.e(ug4Var), true);
                } else {
                    thaVar.b(i3, false, true);
                }
            } else {
                thaVar.c(i3, i4, null);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [pg4, tk4] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        byte b = 0;
        Context context = this.c;
        if (i == 0) {
            tha thaVar = new tha(context);
            Paint paint = new Paint();
            thaVar.n = paint;
            thaVar.s = z8c.t0;
            thaVar.r = true;
            paint.setColor(cmb.w0(null, cmb.Bi, false));
            thaVar.b = new k47[6];
            thaVar.a = new pha[6];
            thaVar.c = new int[6];
            for (int i2 = 0; i2 < 6; i2++) {
                thaVar.a[i2] = new pha(thaVar, context);
                thaVar.addView(thaVar.a[i2]);
                thaVar.a[i2].setVisibility(4);
                thaVar.a[i2].setTag(Integer.valueOf(i2));
                thaVar.a[i2].setOnClickListener(new oha(thaVar, b));
                thaVar.a[i2].setOnLongClickListener(new au(thaVar, (byte) 17));
            }
            thaVar.setDelegate(new sz4(this));
            frameLayout = thaVar;
        } else if (i != 2) {
            ?? pg4Var = new pg4((byte) 1, context, this);
            pg4Var.setIsSingleCell(true);
            pg4Var.setViewType(2);
            frameLayout = pg4Var;
        } else {
            FrameLayout l55Var = new l55(context, null);
            l55Var.setBackgroundColor(cmb.w0(null, cmb.d7, false) & (-218103809));
            frameLayout = l55Var;
        }
        return kt6.h(frameLayout, frameLayout, -1, -2);
    }
}
