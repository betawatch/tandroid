package fi;

import android.graphics.Canvas;
import android.view.View;
import hi.pb;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m9 extends j9 {
    public final l9 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ n9 d;

    public m9(n9 n9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = n9Var;
        this.b = tL_mediaAreaWeather;
        pb pbVar = new pb();
        pbVar.c = tL_mediaAreaWeather.emoji;
        pbVar.d = (float) tL_mediaAreaWeather.temperature_c;
        l9 l9Var = new l9(this, org.telegram.messenger.t0.b, org.telegram.messenger.g0.p);
        this.a = l9Var;
        l9Var.setMaxWidth(org.telegram.messenger.g0.q.x);
        l9Var.setIsVideo(false);
        l9Var.d(m10.t0, pbVar.c);
        l9Var.setText(pbVar.a());
        l9Var.e(3, tL_mediaAreaWeather.color);
        l9Var.f();
    }

    @Override // fi.j9
    public final void a(Canvas canvas, float f10) {
        n9 n9Var = this.d;
        double d = n9Var.b;
        double d2 = n9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f11 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
        double d10 = n9Var.c;
        double d11 = n9Var.e;
        float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
        float f13 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
        float f14 = (float) ((d11 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f11, f12);
        l9 l9Var = this.a;
        float min = Math.min(f13 / ((l9Var.getWidthInternal() - l9Var.getPaddingLeft()) - l9Var.getPaddingRight()), f14 / ((l9Var.getHeightInternal() - l9Var.getPaddingTop()) - l9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-r3) / 2.0f) - l9Var.getPaddingLeft(), ((-r6) / 2.0f) - l9Var.getPaddingTop());
        l9Var.a(canvas);
        canvas.restore();
    }

    @Override // fi.j9
    public final void b(boolean z10) {
        l9 l9Var = this.a;
        if (!z10) {
            l9Var.L = false;
            l9Var.r.R();
            l9Var.s.R();
        } else {
            l9Var.L = true;
            if (l9Var.M) {
                l9Var.s.P();
            } else {
                l9Var.r.P();
            }
        }
    }

    @Override // fi.j9
    public final void c(View view) {
        this.c = view;
    }
}
