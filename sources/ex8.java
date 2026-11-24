// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ex8 implements n8c, o8c {
    public final /* synthetic */ kx8 a;

    public /* synthetic */ ex8(kx8 kx8Var) {
        this.a = kx8Var;
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        boolean z = false;
        if (c4cVar.a == 16) {
            Object obj = c4cVar.H;
            if (!(obj instanceof nx8) || !((nx8) obj).g) {
                this.a.h0(c4cVar, view);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.f0((c4c) obj, (View) obj2);
    }
}
