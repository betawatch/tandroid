package dh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e extends View {
    public final xd.a a;
    public final Drawable b;
    public final Drawable c;

    public e(Context context) {
        super(context);
        this.a = new xd.a(this, mr.h, 320L);
        this.b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.a.e;
        kf.r.b(canvas, this.b, 1.0f - f10);
        kf.r.b(canvas, this.c, f10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        float f11 = i11 / 2.0f;
        kf.r.d(this.b, f10, f11, 17);
        kf.r.d(this.c, f10, f11, 17);
    }
}
