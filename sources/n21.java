// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class n21 extends q11 {
    public final ImageView a;
    public final p66 b;

    public n21(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i = aob.yj;
        getThemedColor(i);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        p66 p66Var = new p66(context, null);
        this.b = p66Var;
        p66Var.setDisablePaddingsOffsetY(true);
        p66Var.setSingleLine();
        yob.X(p66Var, i, vnbVar);
        p66Var.setTypeface(Typeface.SANS_SERIF);
        p66Var.setTextSize(1, 15.0f);
        addView(p66Var, tre.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // z11
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
