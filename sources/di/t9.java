package di;

import android.graphics.Canvas;
import android.view.View;
import fi.sb;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t9 extends q9 {
    public final s9 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ u9 d;

    public t9(u9 u9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = u9Var;
        this.b = tL_mediaAreaWeather;
        sb sbVar = new sb();
        sbVar.c = tL_mediaAreaWeather.emoji;
        sbVar.d = (float) tL_mediaAreaWeather.temperature_c;
        s9 s9Var = new s9(this, org.telegram.messenger.t0.b, org.telegram.messenger.g0.p);
        this.a = s9Var;
        s9Var.setMaxWidth(org.telegram.messenger.g0.q.x);
        s9Var.setIsVideo(false);
        s9Var.d(p10.s0, sbVar.c);
        s9Var.setText(sbVar.a());
        s9Var.e(3, tL_mediaAreaWeather.color);
        s9Var.f();
    }

    @Override // di.q9
    public final void a(Canvas canvas, float f10) {
        u9 u9Var = this.d;
        double d = u9Var.b;
        double d2 = u9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f11 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
        double d10 = u9Var.c;
        double d11 = u9Var.e;
        float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
        float f13 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
        float f14 = (float) ((d11 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f11, f12);
        s9 s9Var = this.a;
        float min = Math.min(f13 / ((s9Var.getWidthInternal() - s9Var.getPaddingLeft()) - s9Var.getPaddingRight()), f14 / ((s9Var.getHeightInternal() - s9Var.getPaddingTop()) - s9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-r3) / 2.0f) - s9Var.getPaddingLeft(), ((-r6) / 2.0f) - s9Var.getPaddingTop());
        s9Var.a(canvas);
        canvas.restore();
    }

    @Override // di.q9
    public final void b(boolean z9) {
        s9 s9Var = this.a;
        if (!z9) {
            s9Var.K = false;
            s9Var.r.R();
            s9Var.s.R();
        } else {
            s9Var.K = true;
            if (s9Var.L) {
                s9Var.s.P();
            } else {
                s9Var.r.P();
            }
        }
    }

    @Override // di.q9
    public final void c(View view) {
        this.c = view;
    }
}
