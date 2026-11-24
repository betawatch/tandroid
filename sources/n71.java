// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n71 extends FrameLayout {
    public final o39 a;

    public n71(o39 o39Var, Context context) {
        super(context);
        this.a = o39Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(o39Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
