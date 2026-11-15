package bi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e5 extends LinearLayout {
    public final TextView a;

    public e5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(1);
        i9 i9Var = new i9(context);
        i9Var.setImageDrawable(new ch0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        addView(i9Var, ja.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.A6, e6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, ja.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
