// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o04 extends q5c {
    public o04(Context context, int i, i8c i8cVar, n8c n8cVar, wjb wjbVar) {
        super(context, i, -1, false, i8cVar, n8cVar, null, wjbVar, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        if (view != null) {
            float L = gl.L(92.0f);
            float width = getWidth() - L;
            float x = view.getX();
            float width2 = view.getWidth() + x;
            int i = x < L ? (int) (x - L) : width2 > width ? (int) (width2 - width) : 0;
            if (i != 0) {
                gl.J(this, new va7((Object) this, (Object) view, i, (byte) 28));
            }
        }
    }
}
