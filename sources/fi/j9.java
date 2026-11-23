package fi;

import android.graphics.Canvas;
import android.view.View;
import hi.pb;
import org.telegram.messenger.k10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class j9 extends g9 {
    public final i9 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ k9 d;

    public j9(k9 k9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = k9Var;
        this.b = tL_mediaAreaWeather;
        pb pbVar = new pb();
        pbVar.c = tL_mediaAreaWeather.emoji;
        pbVar.d = (float) tL_mediaAreaWeather.temperature_c;
        i9 i9Var = new i9(this, org.telegram.messenger.t0.b, org.telegram.messenger.g0.p);
        this.a = i9Var;
        i9Var.setMaxWidth(org.telegram.messenger.g0.q.x);
        i9Var.setIsVideo(false);
        i9Var.d(k10.t0, pbVar.c);
        i9Var.setText(pbVar.a());
        i9Var.e(3, tL_mediaAreaWeather.color);
        i9Var.f();
    }

    @Override // fi.g9
    public final void a(Canvas canvas, float f10) {
        k9 k9Var = this.d;
        double d = k9Var.b;
        double d2 = k9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f11 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
        double d10 = k9Var.c;
        double d11 = k9Var.e;
        float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
        float f13 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
        float f14 = (float) ((d11 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f11, f12);
        i9 i9Var = this.a;
        float min = Math.min(f13 / ((i9Var.getWidthInternal() - i9Var.getPaddingLeft()) - i9Var.getPaddingRight()), f14 / ((i9Var.getHeightInternal() - i9Var.getPaddingTop()) - i9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-r3) / 2.0f) - i9Var.getPaddingLeft(), ((-r6) / 2.0f) - i9Var.getPaddingTop());
        i9Var.a(canvas);
        canvas.restore();
    }

    @Override // fi.g9
    public final void b(boolean z10) {
        i9 i9Var = this.a;
        if (!z10) {
            i9Var.L = false;
            i9Var.r.R();
            i9Var.s.R();
        } else {
            i9Var.L = true;
            if (i9Var.M) {
                i9Var.s.P();
            } else {
                i9Var.r.P();
            }
        }
    }

    @Override // fi.g9
    public final void c(View view) {
        this.c = view;
    }
}
