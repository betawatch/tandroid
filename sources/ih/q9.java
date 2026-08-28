package ih;

import android.graphics.Canvas;
import android.view.View;
import kh.tc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q9 extends n9 {
    public final p9 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ r9 d;

    public q9(r9 r9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = r9Var;
        this.b = tL_mediaAreaWeather;
        tc tcVar = new tc();
        tcVar.c = tL_mediaAreaWeather.emoji;
        tcVar.d = (float) tL_mediaAreaWeather.temperature_c;
        p9 p9Var = new p9(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = p9Var;
        p9Var.setMaxWidth(AndroidUtilities.displaySize.x);
        p9Var.setIsVideo(false);
        p9Var.d(UserConfig.selectedAccount, tcVar.c);
        p9Var.setText(tcVar.a());
        p9Var.e(3, tL_mediaAreaWeather.color);
        p9Var.f();
    }

    @Override // ih.n9
    public final void a(Canvas canvas, float f10) {
        r9 r9Var = this.d;
        double d = r9Var.b;
        double d9 = r9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f11 = (float) (((mediaAreaCoordinates.x * d9) / 100.0d) + d);
        double d10 = r9Var.c;
        double d11 = r9Var.e;
        float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
        float f13 = (float) ((d9 * mediaAreaCoordinates.w) / 100.0d);
        float f14 = (float) ((d11 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f11, f12);
        p9 p9Var = this.a;
        float min = Math.min(f13 / ((p9Var.getWidthInternal() - p9Var.getPaddingLeft()) - p9Var.getPaddingRight()), f14 / ((p9Var.getHeightInternal() - p9Var.getPaddingTop()) - p9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-r3) / 2.0f) - p9Var.getPaddingLeft(), ((-r6) / 2.0f) - p9Var.getPaddingTop());
        p9Var.a(canvas);
        canvas.restore();
    }

    @Override // ih.n9
    public final void b(boolean z10) {
        p9 p9Var = this.a;
        if (!z10) {
            p9Var.G = false;
            p9Var.r.onDetachedFromWindow();
            p9Var.s.onDetachedFromWindow();
        } else {
            p9Var.G = true;
            if (p9Var.H) {
                p9Var.s.onAttachedToWindow();
            } else {
                p9Var.r.onAttachedToWindow();
            }
        }
    }

    @Override // ih.n9
    public final void c(View view) {
        this.c = view;
    }
}
