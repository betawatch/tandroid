// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class m31 extends p21 {
    public final ImageView a;
    public final l66 b;

    public m31(Context context, ylb ylbVar) {
        super(context, ylbVar);
        int i = cmb.xj;
        getThemedColor(i);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        l66 l66Var = new l66(context, null);
        this.b = l66Var;
        l66Var.setDisablePaddingsOffsetY(true);
        l66Var.setSingleLine();
        anb.X(l66Var, i, ylbVar);
        l66Var.setTypeface(Typeface.SANS_SERIF);
        l66Var.setTextSize(1, 15.0f);
        addView(l66Var, qoe.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // y21
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
