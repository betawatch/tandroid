// default package

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class o98 extends FrameLayout {
    public m98[] a;
    public do6[] b;
    public int c;
    public n98 d;
    public Paint e;

    public final void a(int i, do6 do6Var) {
        String str;
        this.b[i] = do6Var;
        m98[] m98VarArr = this.a;
        if (do6Var == null) {
            m98VarArr[i].setVisibility(4);
            return;
        }
        no6 no6Var = do6Var.d;
        m98 m98Var = m98VarArr[i];
        de0 de0Var = m98Var.b;
        de0Var.q();
        if (no6Var == null || (str = no6Var.I) == null) {
            de0Var.setImageDrawable(aob.R4);
        } else {
            de0Var.r(no6Var.J, no6Var.K, true);
            boolean z = no6Var.b;
            int i2 = no6Var.C;
            if (z) {
                de0Var.o(dze.d("vthumb://", i2, ":", str), null, aob.R4);
            } else {
                de0Var.o(dze.d("thumb://", i2, ":", str), null, aob.R4);
            }
        }
        ((TextView) m98Var.c).setText(do6Var.c);
        ((TextView) m98Var.d).setText(String.format("%d", Integer.valueOf(do6Var.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View[] viewArr = this.a;
        int L = hl.O1() ? ((hl.L(490.0f) - hl.L(12.0f)) - (hl.L(4.0f) * (this.c - 1))) / this.c : ((hl.q.x - hl.L(12.0f)) - (hl.L(4.0f) * (this.c - 1))) / this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = hl.L(4.0f);
            layoutParams.leftMargin = (hl.L(4.0f) + L) * i3;
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        super.onMeasure(i, ik8.E(4.0f, L, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i) {
        int i2 = 0;
        while (true) {
            m98[] m98VarArr = this.a;
            if (i2 >= m98VarArr.length) {
                this.c = i;
                return;
            } else {
                m98VarArr[i2].setVisibility(i2 < i ? 0 : 4);
                i2++;
            }
        }
    }

    public void setDelegate(n98 n98Var) {
        this.d = n98Var;
    }
}
