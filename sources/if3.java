// default package

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class if3 extends FrameLayout {
    public int a;
    public TextView b;
    public TextView c;
    public RadioButton d;
    public boolean e;
    public int f;

    public final void a(boolean z, boolean z2) {
        RadioButton radioButton = this.d;
        TextView textView = this.c;
        setEnabled(z);
        TextView textView2 = this.b;
        if (z2) {
            textView2.animate().alpha(z ? 1.0f : 0.5f).start();
            textView.animate().alpha(z ? 1.0f : 0.5f).start();
            radioButton.animate().alpha(z ? 1.0f : 0.5f).start();
        } else {
            textView2.setAlpha(z ? 1.0f : 0.5f);
            textView.setAlpha(z ? 1.0f : 0.5f);
            radioButton.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public final void b() {
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d2;
        TextView textView = this.b;
        TextView textView2 = this.c;
        int visibility = textView2.getVisibility();
        boolean z = k96.a0;
        if (visibility == 0) {
            d = nme.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? this.f : 61.0f, 0.0f, z ? 61.0f : this.f, 0.0f);
        } else {
            d = nme.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 61.0f : this.f, 0.0f, z ? this.f : 61.0f, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        int visibility2 = textView2.getVisibility();
        boolean z2 = k96.a0;
        if (visibility2 == 0) {
            d2 = nme.d(22, 22.0f, (z2 ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            d2 = nme.d(22, 22.0f, (z2 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(gl.L(k96.a0 ? 0.0f : this.f), getHeight() - 1, getMeasuredWidth() - gl.L(k96.a0 ? this.f : 0.0f), getHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i3 = this.f + 61;
        TextView textView = this.c;
        int L = measuredWidth - gl.L(i3 + (textView.getVisibility() == 0 ? 12 : 0));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), TLObject.FLAG_30));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            L = ug8.B(12.0f, textView.getMeasuredWidth(), L);
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setHorizontalPadding(int i) {
        TextView textView = this.c;
        if (this.f != i) {
            this.f = i;
            float f = i;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = gl.L(f);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = gl.L(f);
            b();
        }
    }

    public void setTextColor(int i) {
        this.b.setTextColor(i);
    }
}
