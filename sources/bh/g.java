package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g extends View {
    public final Drawable a;
    public final vd.a b;
    public final int c;
    public h d;

    public g(Context context, int i10) {
        super(context);
        this.b = new vd.a(this, jr.h, 380L);
        this.c = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.a = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.o7, false), PorterDuff.Mode.SRC_IN));
    }

    public final void a(h hVar, boolean z10) {
        h hVar2;
        h hVar3;
        this.b.a(hVar != null, z10);
        if (isAttachedToWindow() && (hVar3 = this.d) != null) {
            hVar3.b();
        }
        this.d = hVar;
        if (!isAttachedToWindow() || (hVar2 = this.d) == null) {
            return;
        }
        hVar2.a(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.d;
        if (hVar != null) {
            hVar.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.d;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f9 = this.b.e;
        if (f9 < 1.0f) {
            canvas.save();
            float f10 = 1.0f - f9;
            canvas.scale(f10, f10, width, height);
            this.a.draw(canvas);
            canvas.restore();
        }
        if (f9 > 0.0f) {
            float f11 = this.c;
            int dp = AndroidUtilities.dp(f11);
            int width2 = (getWidth() - dp) / 2;
            int height2 = (getHeight() - dp) / 2;
            canvas.save();
            canvas.translate(width2, height2);
            canvas.scale(f9, f9, AndroidUtilities.dp(f11) / 2.0f, AndroidUtilities.dp(f11) / 2.0f);
            h hVar = this.d;
            if (hVar != null) {
                hVar.c(canvas, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(24.0f);
        int i14 = (i10 - dp) / 2;
        int i15 = (i11 - dp) / 2;
        this.a.setBounds(i14, i15, i14 + dp, dp + i15);
    }
}
