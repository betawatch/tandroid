package ci;

import android.graphics.Canvas;
import android.view.View;
import ei.tc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class da extends aa {
    public final ca a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ ea d;

    public da(ea eaVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = eaVar;
        this.b = tL_mediaAreaWeather;
        tc tcVar = new tc();
        tcVar.c = tL_mediaAreaWeather.emoji;
        tcVar.d = (float) tL_mediaAreaWeather.temperature_c;
        ca caVar = new ca(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = caVar;
        caVar.setMaxWidth(AndroidUtilities.displaySize.x);
        caVar.setIsVideo(false);
        caVar.d(UserConfig.selectedAccount, tcVar.c);
        caVar.setText(tcVar.a());
        caVar.e(3, tL_mediaAreaWeather.color);
        caVar.f();
    }

    @Override // ci.aa
    public final void a(Canvas canvas, float f7) {
        ea eaVar = this.d;
        double d = eaVar.b;
        double d10 = eaVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = eaVar.c;
        double d12 = eaVar.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        ca caVar = this.a;
        float min = Math.min(f12 / ((caVar.getWidthInternal() - caVar.getPaddingLeft()) - caVar.getPaddingRight()), f13 / ((caVar.getHeightInternal() - caVar.getPaddingTop()) - caVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - caVar.getPaddingLeft(), ((-r6) / 2.0f) - caVar.getPaddingTop());
        caVar.a(canvas);
        canvas.restore();
    }

    @Override // ci.aa
    public final void b(boolean z10) {
        ca caVar = this.a;
        if (!z10) {
            caVar.K = false;
            caVar.r.onDetachedFromWindow();
            caVar.s.onDetachedFromWindow();
        } else {
            caVar.K = true;
            if (caVar.L) {
                caVar.s.onAttachedToWindow();
            } else {
                caVar.r.onAttachedToWindow();
            }
        }
    }

    @Override // ci.aa
    public final void c(View view) {
        this.c = view;
    }
}
