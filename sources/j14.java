// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j14 extends q9c {
    public j14(Context context, int i, icc iccVar, ncc nccVar, vnb vnbVar) {
        super(context, i, -1, false, iccVar, nccVar, null, vnbVar, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void M1(View view) {
        if (view != null) {
            float L = hl.L(92.0f);
            float width = getWidth() - L;
            float x = view.getX();
            float width2 = view.getWidth() + x;
            int i = x < L ? (int) (x - L) : width2 > width ? (int) (width2 - width) : 0;
            if (i != 0) {
                hl.J(this, new bf7((Object) this, (Object) view, i, (byte) 28));
            }
        }
    }
}
