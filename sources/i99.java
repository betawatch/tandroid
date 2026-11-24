// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i99 extends TextView {
    public final cm2 a;
    public final int b;
    public final boolean c;

    public i99(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.c = z;
        if (z) {
            zkb.X(this, bkb.F6, wjbVar);
            setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = gl.L(40.0f);
        } else {
            int i = bkb.x8;
            int v0 = bkb.v0(i, wjbVar);
            zkb.X(this, i, wjbVar);
            ff0 Z = bkb.Z(bkb.p1(0.08f, v0), bkb.p1(0.15f, v0), gl.L(13.0f), gl.L(13.0f));
            vkb K = zkb.K(0.08f, i);
            vkb K2 = zkb.K(0.15f, i);
            setBackground(Z);
            zkb.j(this, Z, K, K2, wjbVar);
            setPadding(gl.L(11.0f), 0, gl.L(11.0f), 0);
            this.b = gl.L(26.0f);
        }
        setGravity(17);
        setTypeface(gl.o());
        if (!z) {
            ote.a(this);
        }
        cm2 cm2Var = new cm2(R.drawable.arrows_select, 0);
        this.a = cm2Var;
        cm2Var.H = 0.8f;
        float L = gl.L(1.0f);
        cm2Var.r = 0.0f;
        cm2Var.s = L;
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
    public void setSorting(p99 p99Var) {
        cm2 cm2Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        cm2 cm2Var2 = null;
        if (p99Var == p99.b) {
            cm2Var = new cm2(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) k96.M0(2131745949, null));
        } else {
            if (p99Var != p99.a) {
                if (p99Var == p99.c) {
                    cm2Var = new cm2(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) k96.M0(2131745947, null));
                }
                if (cm2Var2 != null) {
                    float L = gl.L(1.0f);
                    cm2Var2.r = 0.0f;
                    cm2Var2.s = L;
                }
                setText(spannableStringBuilder);
            }
            cm2Var = new cm2(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) k96.M0(2131745945, null));
        }
        cm2Var2 = cm2Var;
        if (cm2Var2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
