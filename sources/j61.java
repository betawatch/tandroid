// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
