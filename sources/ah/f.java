package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final f6 a;
    public final TextView b;

    public f(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
        r6.i(k6.e7, this, f6Var);
        TextView textView = new TextView(getContext());
        this.b = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        r6.V(textView, k6.f7, f6Var);
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
        r6.V(this.b, i7, this.a);
    }
}
