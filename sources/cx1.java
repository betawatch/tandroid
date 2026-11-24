// default package

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cx1 extends ap0 {
    public boolean s;
    public final /* synthetic */ ChatActivityEnterView w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.w = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new zw8((byte) 3);
        fu fuVar = new fu((byte) 1, context, (Object) this);
        this.c = fuVar;
        fuVar.setOverScrollMode(2);
        fuVar.setClipToPadding(false);
        fuVar.setClipToOutline(true);
        fuVar.j(new y(this, (byte) 7));
        addView(fuVar);
        paint.setColor(bkb.w0(null, bkb.yj, false));
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.s) {
            return;
        }
        this.s = true;
        this.w.i2();
    }
}
