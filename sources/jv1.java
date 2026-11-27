// default package

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jv1 extends LinearLayout {
    public final kv1[] a;

    public jv1(Context context) {
        super(context);
        this.a = new kv1[2];
    }

    public final void a(pr1 pr1Var, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = pr1Var;
            addView(pr1Var, layoutParams);
        }
    }

    public kv1[] getButtons() {
        return this.a;
    }
}
