// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                hl.J(this, new ze7((Object) this, (Object) view, i, (byte) 28));
            }
        }
    }
}
