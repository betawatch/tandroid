// default package

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jt4 extends LinearLayout {
    public final c51 a;
    public final c51 b;
    public final c51 c;
    public final long d;

    public jt4(Context context, int i) {
        super(context);
        TLRPC.TL_emojiList a = qb0.a(i);
        setOrientation(1);
        de0 de0Var = new de0(context);
        de0Var.setImageDrawable(new b29(R.raw.utyan_gallery, hl.L(110.0f), hl.L(110.0f)));
        if (!hl.O1()) {
            addView(de0Var, tre.r(jn7.u1, jn7.u1, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        yob.X(textView, aob.G6, null);
        textView.setGravity(1);
        textView.setText(ob6.M0(2131750444, null));
        textView.setTypeface(hl.o());
        addView(textView, tre.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.c7, null);
        textView2.setGravity(1);
        textView2.setText(ob6.M0(yac.h(i).p() ? 2131750439 : 2131750440, null));
        textView2.setMaxWidth(hl.L(260.0f));
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView2, tre.t(-2, -2, 49, 0, 0, 0, 14));
        c51 c51Var = new c51(null, context, true);
        this.a = c51Var;
        c51Var.f();
        c51Var.i(ob6.M0(2131750443, null), false, true);
        addView(c51Var, tre.r(-2, 44, 49));
        c51 c51Var2 = new c51(null, context, false);
        this.b = c51Var2;
        c51Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new wm2(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) ob6.M0(2131750441, null));
        c51Var2.i(spannableStringBuilder, false, true);
        addView(c51Var2, tre.t(-2, 44, 49, 0, 8, 0, 0));
        c51 c51Var3 = new c51(null, context, false);
        this.c = c51Var3;
        c51Var3.f();
        c51Var3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a.document_id;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d = 0L;
        } else {
            long longValue = a.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new hm(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        }
        spannableStringBuilder2.append((CharSequence) ob6.M0(2131743452, null));
        c51Var3.i(spannableStringBuilder2, false, true);
        addView(c51Var3, tre.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(44.0f), TLObject.FLAG_30);
        c51 c51Var = this.a;
        c51Var.setUseWrapContent(true);
        c51 c51Var2 = this.b;
        c51Var2.setUseWrapContent(true);
        c51 c51Var3 = this.c;
        c51Var3.setUseWrapContent(true);
        c51Var.measure(makeMeasureSpec, makeMeasureSpec2);
        c51Var2.measure(makeMeasureSpec, makeMeasureSpec2);
        c51Var3.measure(makeMeasureSpec, makeMeasureSpec2);
        c51Var.setUseWrapContent(false);
        c51Var2.setUseWrapContent(false);
        c51Var3.setUseWrapContent(false);
        int max = Math.max(Math.max(c51Var.getMeasuredWidth(), c51Var2.getMeasuredWidth()), c51Var3.getMeasuredWidth());
        c51Var.getLayoutParams().width = hl.L(80.0f) + max;
        c51Var2.getLayoutParams().width = hl.L(80.0f) + max;
        c51Var3.getLayoutParams().width = hl.L(80.0f) + max;
        super.onMeasure(i, i2);
    }

    public void setUseAnEmojiVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }
}
