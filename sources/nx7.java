// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nx7 extends FrameLayout {
    public final s09 a;

    public nx7(Context context) {
        super(context);
        s09 s09Var = new s09(context);
        this.a = s09Var;
        s09Var.setOnClickListener(new m67(this, (byte) 7));
        int L = gm.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView(s09Var, layoutParams);
        setPadding(0, gm.L(32.0f), 0, 0);
        setLayoutParams(new g69(-1, -2));
    }
}
