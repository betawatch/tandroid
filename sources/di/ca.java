package di;

import android.graphics.Canvas;
import android.view.View;
import fi.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ca extends z9 {
    public final ba a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ da d;

    public ca(da daVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = daVar;
        this.b = tL_mediaAreaWeather;
        pc pcVar = new pc();
        pcVar.c = tL_mediaAreaWeather.emoji;
        pcVar.d = (float) tL_mediaAreaWeather.temperature_c;
        ba baVar = new ba(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = baVar;
        baVar.setMaxWidth(AndroidUtilities.displaySize.x);
        baVar.setIsVideo(false);
        baVar.d(UserConfig.selectedAccount, pcVar.c);
        baVar.setText(pcVar.a());
        baVar.e(3, tL_mediaAreaWeather.color);
        baVar.f();
    }

    @Override // di.z9
    public final void a(Canvas canvas, float f7) {
        da daVar = this.d;
        double d = daVar.b;
        double d10 = daVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = daVar.c;
        double d12 = daVar.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        ba baVar = this.a;
        float min = Math.min(f12 / ((baVar.getWidthInternal() - baVar.getPaddingLeft()) - baVar.getPaddingRight()), f13 / ((baVar.getHeightInternal() - baVar.getPaddingTop()) - baVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - baVar.getPaddingLeft(), ((-r6) / 2.0f) - baVar.getPaddingTop());
        baVar.a(canvas);
        canvas.restore();
    }

    @Override // di.z9
    public final void b(boolean z10) {
        ba baVar = this.a;
        if (!z10) {
            baVar.K = false;
            baVar.r.onDetachedFromWindow();
            baVar.s.onDetachedFromWindow();
        } else {
            baVar.K = true;
            if (baVar.L) {
                baVar.s.onAttachedToWindow();
            } else {
                baVar.r.onAttachedToWindow();
            }
        }
    }

    @Override // di.z9
    public final void c(View view) {
        this.c = view;
    }
}
