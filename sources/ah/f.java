package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final h6 a;
    public final TextView b;

    public f(Context context, h6 h6Var) {
        super(context);
        this.a = h6Var;
        t6.h(m6.e7, this, h6Var);
        TextView textView = new TextView(getContext());
        this.b = textView;
        i5.c.x(textView, 1, 14.0f);
        t6.U(textView, m6.f7, h6Var);
        textView.setGravity((gd.a0 ? 5 : 3) | 16);
        addView(textView, ma.d(-1, -1.0f, (gd.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        t6.U(this.b, i7, this.a);
    }
}
