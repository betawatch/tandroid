package ci;

import android.graphics.Canvas;
import android.view.View;
import ei.tc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class ea extends ba {
    public final da a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ fa d;

    public ea(fa faVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = faVar;
        this.b = tL_mediaAreaWeather;
        tc tcVar = new tc();
        tcVar.c = tL_mediaAreaWeather.emoji;
        tcVar.d = (float) tL_mediaAreaWeather.temperature_c;
        da daVar = new da(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = daVar;
        daVar.setMaxWidth(AndroidUtilities.displaySize.x);
        daVar.setIsVideo(false);
        daVar.d(UserConfig.selectedAccount, tcVar.c);
        daVar.setText(tcVar.a());
        daVar.e(3, tL_mediaAreaWeather.color);
        daVar.f();
    }

    @Override // ci.ba
    public final void a(Canvas canvas, float f7) {
        fa faVar = this.d;
        double d = faVar.b;
        double d10 = faVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = faVar.c;
        double d12 = faVar.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        da daVar = this.a;
        float min = Math.min(f12 / ((daVar.getWidthInternal() - daVar.getPaddingLeft()) - daVar.getPaddingRight()), f13 / ((daVar.getHeightInternal() - daVar.getPaddingTop()) - daVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - daVar.getPaddingLeft(), ((-r6) / 2.0f) - daVar.getPaddingTop());
        daVar.a(canvas);
        canvas.restore();
    }

    @Override // ci.ba
    public final void b(boolean z10) {
        da daVar = this.a;
        if (!z10) {
            daVar.K = false;
            daVar.r.onDetachedFromWindow();
            daVar.s.onDetachedFromWindow();
        } else {
            daVar.K = true;
            if (daVar.L) {
                daVar.s.onAttachedToWindow();
            } else {
                daVar.r.onAttachedToWindow();
            }
        }
    }

    @Override // ci.ba
    public final void c(View view) {
        this.c = view;
    }
}
