// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lv7 extends FrameLayout {
    public final ry8 a;

    public lv7(Context context) {
        super(context);
        ry8 ry8Var = new ry8(context);
        this.a = ry8Var;
        ry8Var.setOnClickListener(new fr7(this, (byte) 4));
        int L = gl.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView(ry8Var, layoutParams);
        setPadding(0, gl.L(32.0f), 0, 0);
        setLayoutParams(new e49(-1, -2));
    }
}
