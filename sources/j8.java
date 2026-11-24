// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j8 extends FrameLayout {
    public final Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(int i, wjb wjbVar, Context context) {
        super(context);
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(bkb.a7, wjbVar);
        this.a = bkb.V0(getContext(), R.drawable.greydivider, v02);
        setBackgroundColor(v0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i) {
        setBackgroundColor(i);
    }

    public j8(Context context, wjb wjbVar) {
        this(bkb.G8, wjbVar, context);
    }
}
