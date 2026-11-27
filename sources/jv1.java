// default package

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
