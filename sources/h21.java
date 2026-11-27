// default package

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class h21 extends q11 {
    public final de0 a;
    public final TextView b;

    public h21(Context context, vnb vnbVar) {
        super(context, vnbVar);
        de0 de0Var = new de0(getContext());
        this.a = de0Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(de0Var, tre.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        yob.X(textView, aob.yj, vnbVar);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, tre.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // z11
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
