package bi;

import android.graphics.Canvas;
import android.view.View;
import di.nd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class tb extends qb {
    public final sb a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ ub d;

    public tb(ub ubVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = ubVar;
        this.b = tL_mediaAreaWeather;
        nd ndVar = new nd();
        ndVar.c = tL_mediaAreaWeather.emoji;
        ndVar.d = (float) tL_mediaAreaWeather.temperature_c;
        sb sbVar = new sb(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = sbVar;
        sbVar.setMaxWidth(AndroidUtilities.displaySize.x);
        sbVar.setIsVideo(false);
        sbVar.d(UserConfig.selectedAccount, ndVar.c);
        sbVar.setText(ndVar.a());
        sbVar.e(3, tL_mediaAreaWeather.color);
        sbVar.f();
    }

    @Override // bi.qb
    public final void a(Canvas canvas, float f7) {
        ub ubVar = this.d;
        double d = ubVar.b;
        double d10 = ubVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = ubVar.c;
        double d12 = ubVar.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        sb sbVar = this.a;
        float min = Math.min(f12 / ((sbVar.getWidthInternal() - sbVar.getPaddingLeft()) - sbVar.getPaddingRight()), f13 / ((sbVar.getHeightInternal() - sbVar.getPaddingTop()) - sbVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - sbVar.getPaddingLeft(), ((-r6) / 2.0f) - sbVar.getPaddingTop());
        sbVar.a(canvas);
        canvas.restore();
    }

    @Override // bi.qb
    public final void b(boolean z10) {
        sb sbVar = this.a;
        if (!z10) {
            sbVar.K = false;
            sbVar.r.onDetachedFromWindow();
            sbVar.s.onDetachedFromWindow();
        } else {
            sbVar.K = true;
            if (sbVar.L) {
                sbVar.s.onAttachedToWindow();
            } else {
                sbVar.r.onAttachedToWindow();
            }
        }
    }

    @Override // bi.qb
    public final void c(View view) {
        this.c = view;
    }
}
