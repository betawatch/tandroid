// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j61 extends g61 {
    public final /* synthetic */ r61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j61(r61 r61Var, Context context) {
        super(context);
        this.d = r61Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = gl.L(5.0f);
        this.a.setOnClickListener(new j1(this, (byte) 25));
    }
}
