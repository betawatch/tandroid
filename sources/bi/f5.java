package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f5 extends TextView {
    public final eq a;
    public final int b;
    public final boolean c;

    public f5(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.c = z10;
        if (z10) {
            org.telegram.ui.ActionBar.q6.U(this, org.telegram.ui.ActionBar.j6.G6, e6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = org.telegram.ui.ActionBar.j6.y8;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            org.telegram.ui.ActionBar.q6.U(this, i7, e6Var);
            org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(org.telegram.ui.ActionBar.j6.r1(0.08f, w02), org.telegram.ui.ActionBar.j6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.08f, i7);
            org.telegram.ui.ActionBar.m6 K2 = org.telegram.ui.ActionBar.q6.K(0.15f, i7);
            setBackground(b02);
            org.telegram.ui.ActionBar.q6.j(this, b02, K, K2, e6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z10) {
            na.a(this);
        }
        eq eqVar = new eq(R.drawable.arrows_select, 0);
        this.a = eqVar;
        eqVar.H = 0.8f;
        float L = org.telegram.messenger.g0.L(1.0f);
        eqVar.r = 0.0f;
        eqVar.s = L;
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
    public void setSorting(n5 n5Var) {
        eq eqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        eq eqVar2 = null;
        if (n5Var == n5.b) {
            eqVar = new eq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) hd.M0(2131746142, null));
        } else {
            if (n5Var != n5.a) {
                if (n5Var == n5.c) {
                    eqVar = new eq(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) hd.M0(2131746140, null));
                }
                if (eqVar2 != null) {
                    float L = org.telegram.messenger.g0.L(1.0f);
                    eqVar2.r = 0.0f;
                    eqVar2.s = L;
                }
                setText(spannableStringBuilder);
            }
            eqVar = new eq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) hd.M0(2131746138, null));
        }
        eqVar2 = eqVar;
        if (eqVar2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
