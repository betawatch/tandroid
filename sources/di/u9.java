package di;

import android.graphics.Canvas;
import android.view.View;
import fi.sb;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u9 extends r9 {
    public final t9 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ v9 d;

    public u9(v9 v9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = v9Var;
        this.b = tL_mediaAreaWeather;
        sb sbVar = new sb();
        sbVar.c = tL_mediaAreaWeather.emoji;
        sbVar.d = (float) tL_mediaAreaWeather.temperature_c;
        t9 t9Var = new t9(this, org.telegram.messenger.t0.b, org.telegram.messenger.g0.p);
        this.a = t9Var;
        t9Var.setMaxWidth(org.telegram.messenger.g0.q.x);
        t9Var.setIsVideo(false);
        t9Var.d(p10.s0, sbVar.c);
        t9Var.setText(sbVar.a());
        t9Var.e(3, tL_mediaAreaWeather.color);
        t9Var.f();
    }

    @Override // di.r9
    public final void a(Canvas canvas, float f10) {
        v9 v9Var = this.d;
        double d = v9Var.b;
        double d2 = v9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f11 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
        double d10 = v9Var.c;
        double d11 = v9Var.e;
        float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
        float f13 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
        float f14 = (float) ((d11 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f11, f12);
        t9 t9Var = this.a;
        float min = Math.min(f13 / ((t9Var.getWidthInternal() - t9Var.getPaddingLeft()) - t9Var.getPaddingRight()), f14 / ((t9Var.getHeightInternal() - t9Var.getPaddingTop()) - t9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-r3) / 2.0f) - t9Var.getPaddingLeft(), ((-r6) / 2.0f) - t9Var.getPaddingTop());
        t9Var.a(canvas);
        canvas.restore();
    }

    @Override // di.r9
    public final void b(boolean z9) {
        t9 t9Var = this.a;
        if (!z9) {
            t9Var.K = false;
            t9Var.r.R();
            t9Var.s.R();
        } else {
            t9Var.K = true;
            if (t9Var.L) {
                t9Var.s.P();
            } else {
                t9Var.r.P();
            }
        }
    }

    @Override // di.r9
    public final void c(View view) {
        this.c = view;
    }
}
