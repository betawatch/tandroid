// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
