package bi;

import android.graphics.Canvas;
import android.view.View;
import di.id;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class wb extends tb {
    public final vb a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ xb d;

    public wb(xb xbVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = xbVar;
        this.b = tL_mediaAreaWeather;
        id idVar = new id();
        idVar.c = tL_mediaAreaWeather.emoji;
        idVar.d = (float) tL_mediaAreaWeather.temperature_c;
        vb vbVar = new vb(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = vbVar;
        vbVar.setMaxWidth(AndroidUtilities.displaySize.x);
        vbVar.setIsVideo(false);
        vbVar.d(UserConfig.selectedAccount, idVar.c);
        vbVar.setText(idVar.a());
        vbVar.e(3, tL_mediaAreaWeather.color);
        vbVar.f();
    }

    @Override // bi.tb
    public final void a(Canvas canvas, float f7) {
        xb xbVar = this.d;
        double d = xbVar.b;
        double d10 = xbVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = xbVar.c;
        double d12 = xbVar.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        vb vbVar = this.a;
        float min = Math.min(f12 / ((vbVar.getWidthInternal() - vbVar.getPaddingLeft()) - vbVar.getPaddingRight()), f13 / ((vbVar.getHeightInternal() - vbVar.getPaddingTop()) - vbVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - vbVar.getPaddingLeft(), ((-r6) / 2.0f) - vbVar.getPaddingTop());
        vbVar.a(canvas);
        canvas.restore();
    }

    @Override // bi.tb
    public final void b(boolean z10) {
        vb vbVar = this.a;
        if (!z10) {
            vbVar.K = false;
            vbVar.r.onDetachedFromWindow();
            vbVar.s.onDetachedFromWindow();
        } else {
            vbVar.K = true;
            if (vbVar.L) {
                vbVar.s.onAttachedToWindow();
            } else {
                vbVar.r.onAttachedToWindow();
            }
        }
    }

    @Override // bi.tb
    public final void c(View view) {
        this.c = view;
    }
}
