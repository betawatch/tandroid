// default package

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ bg(LinearLayout linearLayout, int[] iArr) {
        this.b = linearLayout;
        this.c = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int[] iArr = this.c;
        LinearLayout linearLayout = this.b;
        switch (b) {
            case 0:
                iArr[0] = ((Integer) view.getTag()).intValue();
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof x09) {
                        ((x09) childAt).c.a(childAt == view, true);
                    }
                }
                break;
            default:
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    x09 x09Var = (x09) linearLayout.getChildAt(i2);
                    x09Var.c.a(x09Var == view, true);
                }
                iArr[0] = djb.f[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public /* synthetic */ bg(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}
