package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class o extends FrameLayout implements c6 {
    public final q9 a;

    public o(Context context) {
        super(context);
        q9 q9Var = new q9(context);
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(q9Var, ma.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = n6.S0;
        q9 q9Var = this.a;
        bg.t.a(canvas, drawable, (q9Var.getWidth() / 2.0f) + q9Var.getLeft(), (q9Var.getHeight() / 2.0f) + q9Var.getTop(), q9Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(136.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
