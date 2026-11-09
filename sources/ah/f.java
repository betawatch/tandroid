package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final g6 a;
    public final TextView b;

    public f(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
        s6.h(l6.e7, this, g6Var);
        TextView textView = new TextView(getContext());
        this.b = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        s6.U(textView, l6.f7, g6Var);
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
        s6.U(this.b, i7, this.a);
    }
}
