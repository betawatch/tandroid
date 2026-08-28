package fh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f5 extends LinearLayout {
    public final TextView a;

    public f5(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        setOrientation(1);
        o9 o9Var = new o9(context);
        o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        addView(o9Var, g7.e6.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.A6, b6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        addView(textView, g7.e6.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
