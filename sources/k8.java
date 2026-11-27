// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k8 extends FrameLayout {
    public final Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(int i, vnb vnbVar, Context context) {
        super(context);
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.b7, vnbVar);
        this.a = aob.V0(getContext(), R.drawable.greydivider, v02);
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

    public k8(Context context, vnb vnbVar) {
        this(aob.H8, vnbVar, context);
    }
}
