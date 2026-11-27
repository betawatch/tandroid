// default package

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nf implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ LinearLayout c;

    public /* synthetic */ nf(LinearLayout linearLayout, int[] iArr) {
        this.c = linearLayout;
        this.b = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        LinearLayout linearLayout = this.c;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    j29 j29Var = (j29) linearLayout.getChildAt(i);
                    j29Var.c.a(j29Var == view, true);
                }
                iArr[0] = ykb.f[((Integer) view.getTag()).intValue()];
                break;
            default:
                iArr[0] = ((Integer) view.getTag()).intValue();
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt = linearLayout.getChildAt(i2);
                    if (childAt instanceof j29) {
                        ((j29) childAt).c.a(childAt == view, true);
                    }
                }
                break;
        }
    }

    public /* synthetic */ nf(int[] iArr, LinearLayout linearLayout) {
        this.b = iArr;
        this.c = linearLayout;
    }
}
