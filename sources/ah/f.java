package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final i6 a;
    public final TextView b;

    public f(Context context, i6 i6Var) {
        super(context);
        this.a = i6Var;
        u6.h(n6.e7, this, i6Var);
        TextView textView = new TextView(getContext());
        this.b = textView;
        i5.c.x(textView, 1, 14.0f);
        u6.U(textView, n6.f7, i6Var);
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
        u6.U(this.b, i7, this.a);
    }
}
