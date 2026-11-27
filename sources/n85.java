// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n85 extends LinearLayout {
    public final /* synthetic */ byte a = 1;
    public final LinearLayout b;
    public final LinearLayout c;

    public n85(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
        LinearLayout a = a(R.drawable.msg_replace, ob6.M0(2131745998, null));
        this.c = a;
        addView(a, tre.o(-2, -1));
        LinearLayout a2 = a(R.drawable.media_button_restore, ob6.M0(2131751300, null));
        this.b = a2;
        addView(a2, tre.o(-2, -1));
    }

    public final LinearLayout a(int i, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(hl.L(25.0f), hl.L(7.0f), hl.L(25.0f), hl.L(7.0f));
        linearLayout.addView(qd4.k(context, i), tre.k(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, tre.o(-2, -2));
        iye.a(linearLayout);
        return linearLayout;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        LinearLayout linearLayout = this.c;
        LinearLayout linearLayout2 = this.b;
        switch (b) {
            case 0:
                linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31), 0);
                if (linearLayout == null) {
                    setMeasuredDimension(linearLayout2.getMeasuredWidth(), linearLayout2.getMeasuredHeight());
                    break;
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout2.getMeasuredWidth(), TLObject.FLAG_30), 0);
                    setMeasuredDimension(linearLayout2.getMeasuredWidth(), linearLayout.getMeasuredHeight() + linearLayout2.getMeasuredHeight());
                    break;
                }
            default:
                ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int max = Math.max(0, size - paddingRight);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - paddingBottom), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31);
                linearLayout2.measure(makeMeasureSpec2, makeMeasureSpec);
                linearLayout.measure(makeMeasureSpec2, makeMeasureSpec);
                int min = Math.min(Math.max(linearLayout2.getMeasuredWidth(), linearLayout.getMeasuredWidth()), max / 2);
                layoutParams2.width = min;
                layoutParams.width = min;
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n85(Context context, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(context);
        this.b = linearLayout;
        this.c = linearLayout2;
    }
}
