package ai;

import android.graphics.Canvas;
import android.view.View;
import ci.nd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class nc extends kc {
    public final mc a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ oc d;

    public nc(oc ocVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = ocVar;
        this.b = tL_mediaAreaWeather;
        nd ndVar = new nd();
        ndVar.c = tL_mediaAreaWeather.emoji;
        ndVar.d = (float) tL_mediaAreaWeather.temperature_c;
        mc mcVar = new mc(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = mcVar;
        mcVar.setMaxWidth(AndroidUtilities.displaySize.x);
        mcVar.setIsVideo(false);
        mcVar.d(UserConfig.selectedAccount, ndVar.c);
        mcVar.setText(ndVar.a());
        mcVar.e(3, tL_mediaAreaWeather.color);
        mcVar.f();
    }

    @Override // ai.kc
    public final void a(Canvas canvas, float f7) {
        oc ocVar = this.d;
        double d = ocVar.b;
        double d10 = ocVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = ocVar.c;
        double d12 = ocVar.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        mc mcVar = this.a;
        float min = Math.min(f12 / ((mcVar.getWidthInternal() - mcVar.getPaddingLeft()) - mcVar.getPaddingRight()), f13 / ((mcVar.getHeightInternal() - mcVar.getPaddingTop()) - mcVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - mcVar.getPaddingLeft(), ((-r6) / 2.0f) - mcVar.getPaddingTop());
        mcVar.a(canvas);
        canvas.restore();
    }

    @Override // ai.kc
    public final void b(boolean z10) {
        mc mcVar = this.a;
        if (!z10) {
            mcVar.K = false;
            mcVar.r.onDetachedFromWindow();
            mcVar.s.onDetachedFromWindow();
        } else {
            mcVar.K = true;
            if (mcVar.L) {
                mcVar.s.onAttachedToWindow();
            } else {
                mcVar.r.onAttachedToWindow();
            }
        }
    }

    @Override // ai.kc
    public final void c(View view) {
        this.c = view;
    }
}
