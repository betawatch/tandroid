package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        t6.U(textView, m6.f7, h6Var);
        textView.setGravity((id.a0 ? 5 : 3) | 16);
        addView(textView, ha.d(-1, -1.0f, (id.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
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
