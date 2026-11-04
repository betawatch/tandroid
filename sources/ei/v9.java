package ei;

import android.graphics.Canvas;
import android.view.View;
import gi.sb;
import org.telegram.messenger.h10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v9 extends s9 {
    public final u9 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ w9 d;

    public v9(w9 w9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = w9Var;
        this.b = tL_mediaAreaWeather;
        sb sbVar = new sb();
        sbVar.c = tL_mediaAreaWeather.emoji;
        sbVar.d = (float) tL_mediaAreaWeather.temperature_c;
        u9 u9Var = new u9(this, org.telegram.messenger.t0.b, org.telegram.messenger.g0.p);
        this.a = u9Var;
        u9Var.setMaxWidth(org.telegram.messenger.g0.q.x);
        u9Var.setIsVideo(false);
        u9Var.d(h10.t0, sbVar.c);
        u9Var.setText(sbVar.a());
        u9Var.e(3, tL_mediaAreaWeather.color);
        u9Var.f();
    }

    @Override // ei.s9
    public final void a(Canvas canvas, float f10) {
        w9 w9Var = this.d;
        double d = w9Var.b;
        double d10 = w9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f11 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = w9Var.c;
        double d12 = w9Var.e;
        float f12 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f13 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f14 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f11, f12);
        u9 u9Var = this.a;
        float min = Math.min(f13 / ((u9Var.getWidthInternal() - u9Var.getPaddingLeft()) - u9Var.getPaddingRight()), f14 / ((u9Var.getHeightInternal() - u9Var.getPaddingTop()) - u9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - u9Var.getPaddingLeft(), ((-r6) / 2.0f) - u9Var.getPaddingTop());
        u9Var.a(canvas);
        canvas.restore();
    }

    @Override // ei.s9
    public final void b(boolean z10) {
        u9 u9Var = this.a;
        if (!z10) {
            u9Var.L = false;
            u9Var.r.R();
            u9Var.s.R();
        } else {
            u9Var.L = true;
            if (u9Var.M) {
                u9Var.s.P();
            } else {
                u9Var.r.P();
            }
        }
    }

    @Override // ei.s9
    public final void c(View view) {
        this.c = view;
    }
}
