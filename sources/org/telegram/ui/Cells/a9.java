package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a9 extends FrameLayout {
    public final TextView a;
    public final TextView b;

    public a9(Context context) {
        super(context);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((hd.a0 ? 5 : 3) | 16);
        addView(textView, c8.ha.d(-2, -1.0f, (hd.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((hd.a0 ? 3 : 5) | 16);
        addView(textView2, c8.ha.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z9) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        if (str2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(4);
        }
        if (z9) {
            int i7 = org.telegram.ui.ActionBar.k6.G6;
            setTag(Integer.valueOf(i7));
            org.telegram.ui.ActionBar.r6.V(textView, i7, null);
            org.telegram.ui.ActionBar.r6.V(textView2, i7, null);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTypeface(org.telegram.messenger.g0.o());
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.z6;
            setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.r6.V(textView, i10, null);
            org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
            Typeface typeface = Typeface.DEFAULT;
            textView.setTypeface(typeface);
            textView2.setTypeface(typeface);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(40.0f));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        TextView textView = this.b;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.a.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - textView.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setTextColor(int i7) {
        this.a.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        this.b.setTextColor(i7);
    }
}
