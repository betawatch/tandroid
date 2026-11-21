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
import org.telegram.ui.Components.nq;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class p7 extends TextView {
    public final nq a;
    public final int b;
    public final boolean c;

    public p7(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.c = z10;
        if (z10) {
            org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.G6, h6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = org.telegram.ui.ActionBar.m6.y8;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            org.telegram.ui.ActionBar.t6.U(this, i7, h6Var);
            org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(org.telegram.ui.ActionBar.m6.r1(0.08f, w02), org.telegram.ui.ActionBar.m6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.08f, i7);
            org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.15f, i7);
            setBackground(b02);
            org.telegram.ui.ActionBar.t6.j(this, b02, K, K2, h6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z10) {
            ra.a(this);
        }
        nq nqVar = new nq(R.drawable.arrows_select, 0);
        this.a = nqVar;
        nqVar.H = 0.8f;
        float L = org.telegram.messenger.g0.L(1.0f);
        nqVar.r = 0.0f;
        nqVar.s = L;
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
    public void setSorting(x7 x7Var) {
        nq nqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        nq nqVar2 = null;
        if (x7Var == x7.b) {
            nqVar = new nq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) gd.N0(2131745946, null));
        } else {
            if (x7Var != x7.a) {
                if (x7Var == x7.c) {
                    nqVar = new nq(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) gd.N0(2131745944, null));
                }
                if (nqVar2 != null) {
                    float L = org.telegram.messenger.g0.L(1.0f);
                    nqVar2.r = 0.0f;
                    nqVar2.s = L;
                }
                setText(spannableStringBuilder);
            }
            nqVar = new nq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) gd.N0(2131745942, null));
        }
        nqVar2 = nqVar;
        if (nqVar2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
