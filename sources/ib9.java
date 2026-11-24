// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ib9 extends TextView {
    public final pn2 a;
    public final int b;
    public final boolean c;

    public ib9(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.c = z;
        if (z) {
            anb.X(this, cmb.F6, ylbVar);
            setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = gm.L(40.0f);
        } else {
            int i = cmb.x8;
            int v0 = cmb.v0(i, ylbVar);
            anb.X(this, i, ylbVar);
            fg0 Z = cmb.Z(cmb.p1(0.08f, v0), cmb.p1(0.15f, v0), gm.L(13.0f), gm.L(13.0f));
            wmb K = anb.K(0.08f, i);
            wmb K2 = anb.K(0.15f, i);
            setBackground(Z);
            anb.j(this, Z, K, K2, ylbVar);
            setPadding(gm.L(11.0f), 0, gm.L(11.0f), 0);
            this.b = gm.L(26.0f);
        }
        setGravity(17);
        setTypeface(gm.o());
        if (!z) {
            rve.a(this);
        }
        pn2 pn2Var = new pn2(R.drawable.arrows_select, 0);
        this.a = pn2Var;
        pn2Var.H = 0.8f;
        float L = gm.L(1.0f);
        pn2Var.r = 0.0f;
        pn2Var.s = L;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.b, TLObject.FLAG_30));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.c && super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSorting(pb9 pb9Var) {
        pn2 pn2Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        pn2 pn2Var2 = null;
        if (pb9Var == pb9.b) {
            pn2Var = new pn2(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131745875, null));
        } else {
            if (pb9Var != pb9.a) {
                if (pb9Var == pb9.c) {
                    pn2Var = new pn2(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131745873, null));
                }
                if (pn2Var2 != null) {
                    float L = gm.L(1.0f);
                    pn2Var2.r = 0.0f;
                    pn2Var2.s = L;
                }
                setText(spannableStringBuilder);
            }
            pn2Var = new pn2(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131745871, null));
        }
        pn2Var2 = pn2Var;
        if (pn2Var2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
