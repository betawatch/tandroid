package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import c8.ra;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lq;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class l7 extends TextView {
    public final lq a;
    public final int b;
    public final boolean c;

    public l7(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.c = z10;
        if (z10) {
            org.telegram.ui.ActionBar.u6.U(this, org.telegram.ui.ActionBar.n6.G6, i6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = org.telegram.ui.ActionBar.n6.y8;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            org.telegram.ui.ActionBar.u6.U(this, i7, i6Var);
            org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(org.telegram.ui.ActionBar.n6.r1(0.08f, w02), org.telegram.ui.ActionBar.n6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.08f, i7);
            org.telegram.ui.ActionBar.q6 K2 = org.telegram.ui.ActionBar.u6.K(0.15f, i7);
            setBackground(b02);
            org.telegram.ui.ActionBar.u6.j(this, b02, K, K2, i6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z10) {
            ra.a(this);
        }
        lq lqVar = new lq(R.drawable.arrows_select, 0);
        this.a = lqVar;
        lqVar.H = 0.8f;
        float L = org.telegram.messenger.g0.L(1.0f);
        lqVar.r = 0.0f;
        lqVar.s = L;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.b, TLObject.FLAG_30));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.c && super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSorting(t7 t7Var) {
        lq lqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        lq lqVar2 = null;
        if (t7Var == t7.b) {
            lqVar = new lq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) gd.M0(2131745947, null));
        } else {
            if (t7Var != t7.a) {
                if (t7Var == t7.c) {
                    lqVar = new lq(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) gd.M0(2131745945, null));
                }
                if (lqVar2 != null) {
                    float L = org.telegram.messenger.g0.L(1.0f);
                    lqVar2.r = 0.0f;
                    lqVar2.s = L;
                }
                setText(spannableStringBuilder);
            }
            lqVar = new lq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) gd.M0(2131745943, null));
        }
        lqVar2 = lqVar;
        if (lqVar2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
