package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qe0 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public final LinearLayout b;
    public final LinearLayout c;

    public qe0(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        LinearLayout a2 = a(R.drawable.msg_replace, org.telegram.messenger.cd.L0(2131746286, null));
        this.c = a2;
        addView(a2, w7.b6.o(-2, -1));
        LinearLayout a10 = a(R.drawable.media_button_restore, org.telegram.messenger.cd.L0(2131751336, null));
        this.b = a10;
        addView(a10, w7.b6.o(-2, -1));
    }

    public LinearLayout a(int i10, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(7.0f));
        linearLayout.addView(org.telegram.messenger.z20.e(context, i10), w7.b6.k(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, w7.b6.o(-2, -2));
        w7.e6.a(linearLayout);
        return linearLayout;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = this.b;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int max = Math.max(0, size - paddingRight);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - paddingBottom), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31);
                linearLayout.measure(makeMeasureSpec2, makeMeasureSpec);
                LinearLayout linearLayout2 = this.c;
                linearLayout2.measure(makeMeasureSpec2, makeMeasureSpec);
                int min = Math.min(Math.max(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredWidth()), max / 2);
                layoutParams2.width = min;
                layoutParams.width = min;
                super.onMeasure(i10, i11);
                break;
            default:
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31);
                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
                LinearLayout linearLayout3 = this.b;
                linearLayout3.measure(makeMeasureSpec3, makeMeasureSpec4);
                LinearLayout linearLayout4 = this.c;
                if (linearLayout4 == null) {
                    setMeasuredDimension(linearLayout3.getMeasuredWidth(), linearLayout3.getMeasuredHeight());
                    break;
                } else {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(linearLayout3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout3.getMeasuredWidth(), linearLayout4.getMeasuredHeight() + linearLayout3.getMeasuredHeight());
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(Context context, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(context);
        this.b = linearLayout;
        this.c = linearLayout2;
    }
}
