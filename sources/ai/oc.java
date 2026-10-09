package ai;

import android.graphics.Canvas;
import android.view.View;
import ci.kd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class oc extends lc {
    public final nc a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ pc d;

    public oc(pc pcVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = pcVar;
        this.b = tL_mediaAreaWeather;
        kd kdVar = new kd();
        kdVar.c = tL_mediaAreaWeather.emoji;
        kdVar.d = (float) tL_mediaAreaWeather.temperature_c;
        nc ncVar = new nc(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = ncVar;
        ncVar.setMaxWidth(AndroidUtilities.displaySize.x);
        ncVar.setIsVideo(false);
        ncVar.d(UserConfig.selectedAccount, kdVar.c);
        ncVar.setText(kdVar.a());
        ncVar.e(3, tL_mediaAreaWeather.color);
        ncVar.f();
    }

    @Override // ai.lc
    public final void a(Canvas canvas, float f7) {
        pc pcVar = this.d;
        double d = pcVar.b;
        double d10 = pcVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = pcVar.c;
        double d12 = pcVar.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        nc ncVar = this.a;
        float min = Math.min(f12 / ((ncVar.getWidthInternal() - ncVar.getPaddingLeft()) - ncVar.getPaddingRight()), f13 / ((ncVar.getHeightInternal() - ncVar.getPaddingTop()) - ncVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - ncVar.getPaddingLeft(), ((-r6) / 2.0f) - ncVar.getPaddingTop());
        ncVar.a(canvas);
        canvas.restore();
    }

    @Override // ai.lc
    public final void b(boolean z10) {
        nc ncVar = this.a;
        if (!z10) {
            ncVar.K = false;
            ncVar.r.onDetachedFromWindow();
            ncVar.s.onDetachedFromWindow();
        } else {
            ncVar.K = true;
            if (ncVar.L) {
                ncVar.s.onAttachedToWindow();
            } else {
                ncVar.r.onAttachedToWindow();
            }
        }
    }

    @Override // ai.lc
    public final void c(View view) {
        this.c = view;
    }
}
