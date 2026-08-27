package jh;

import android.graphics.Canvas;
import android.view.View;
import lh.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m9 extends j9 {
    public final l9 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ n9 d;

    public m9(n9 n9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = n9Var;
        this.b = tL_mediaAreaWeather;
        pc pcVar = new pc();
        pcVar.c = tL_mediaAreaWeather.emoji;
        pcVar.d = (float) tL_mediaAreaWeather.temperature_c;
        l9 l9Var = new l9(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = l9Var;
        l9Var.setMaxWidth(AndroidUtilities.displaySize.x);
        l9Var.setIsVideo(false);
        l9Var.d(UserConfig.selectedAccount, pcVar.c);
        l9Var.setText(pcVar.a());
        l9Var.e(3, tL_mediaAreaWeather.color);
        l9Var.f();
    }

    @Override // jh.j9
    public final void a(Canvas canvas, float f10) {
        n9 n9Var = this.d;
        double d = n9Var.b;
        double d10 = n9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f11 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = n9Var.c;
        double d12 = n9Var.e;
        float f12 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f13 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f14 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f11, f12);
        l9 l9Var = this.a;
        float min = Math.min(f13 / ((l9Var.getWidthInternal() - l9Var.getPaddingLeft()) - l9Var.getPaddingRight()), f14 / ((l9Var.getHeightInternal() - l9Var.getPaddingTop()) - l9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - l9Var.getPaddingLeft(), ((-r6) / 2.0f) - l9Var.getPaddingTop());
        l9Var.a(canvas);
        canvas.restore();
    }

    @Override // jh.j9
    public final void b(boolean z10) {
        l9 l9Var = this.a;
        if (!z10) {
            l9Var.G = false;
            l9Var.r.onDetachedFromWindow();
            l9Var.s.onDetachedFromWindow();
        } else {
            l9Var.G = true;
            if (l9Var.H) {
                l9Var.s.onAttachedToWindow();
            } else {
                l9Var.r.onAttachedToWindow();
            }
        }
    }

    @Override // jh.j9
    public final void c(View view) {
        this.c = view;
    }
}
