// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
