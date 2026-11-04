package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o5 extends TextView {
    public final wp a;

    public o5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3 = org.telegram.ui.ActionBar.k6.y8;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.r6.V(this, i3, e6Var);
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.r1(0.08f, w02), org.telegram.ui.ActionBar.k6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.08f, i3);
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.15f, i3);
        setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(this, b02, L, L2, e6Var);
        setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        pf.a(this);
        wp wpVar = new wp(R.drawable.arrows_select, 0);
        this.a = wpVar;
        wpVar.H = 0.8f;
        float L3 = org.telegram.messenger.g0.L(1.0f);
        wpVar.r = 0.0f;
        wpVar.s = L3;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSorting(v5 v5Var) {
        wp wpVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        wp wpVar2 = null;
        if (v5Var == v5.b) {
            wpVar = new wp(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) bd.M0(2131746152, null));
        } else {
            if (v5Var != v5.a) {
                if (v5Var == v5.c) {
                    wpVar = new wp(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) bd.M0(2131746150, null));
                }
                if (wpVar2 != null) {
                    float L = org.telegram.messenger.g0.L(1.0f);
                    wpVar2.r = 0.0f;
                    wpVar2.s = L;
                }
                setText(spannableStringBuilder);
            }
            wpVar = new wp(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) bd.M0(2131746148, null));
        }
        wpVar2 = wpVar;
        if (wpVar2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
