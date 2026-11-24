// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j8 extends FrameLayout {
    public final Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(int i, ylb ylbVar, Context context) {
        super(context);
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.a7, ylbVar);
        this.a = cmb.V0(getContext(), R.drawable.greydivider, v02);
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

    public j8(Context context, ylb ylbVar) {
        this(cmb.G8, ylbVar, context);
    }
}
