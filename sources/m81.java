// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class m81 implements n8c, o8c, no7 {
    public final /* synthetic */ z81 a;

    public /* synthetic */ m81(z81 z81Var) {
        this.a = z81Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        return this.a.onInsetsInternal(view, vxcVar);
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        Object obj = c4cVar.H;
        if (obj instanceof w81) {
            this.a.Z(((w81) obj).c, (v81) view);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.i0((c4c) obj, (View) obj2);
    }
}
