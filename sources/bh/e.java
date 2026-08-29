package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e extends View {
    public final vd.a a;
    public final Drawable b;
    public final Drawable c;

    public e(Context context) {
        super(context);
        this.a = new vd.a(this, jr.h, 320L);
        this.b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f9 = this.a.e;
        jf.r.b(canvas, this.b, 1.0f - f9);
        jf.r.b(canvas, this.c, f9);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f9 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        jf.r.d(this.b, f9, f10, 17);
        jf.r.d(this.c, f9, f10, 17);
    }
}
