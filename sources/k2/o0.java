package k2;

import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import android.util.Rational;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o0 {
    public final Object a;
    public Object b;

    public o0() {
        this.a = new Rect();
        this.b = new Point();
    }

    public PictureInPictureParams.Builder a() {
        int i10;
        Rect rect = (Rect) this.a;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = (Point) this.b;
        int i11 = point.x;
        if (i11 <= 0 || (i10 = point.y) <= 0) {
            builder.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(null);
            }
        } else {
            double d = i11 / i10;
            Rational rational = d < 0.45d ? new Rational(45, 100) : d > 2.35d ? new Rational(235, 100) : new Rational(point.x, point.y);
            builder.setAspectRatio(rational);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(rational);
            }
        }
        if (rect.isEmpty()) {
            builder.setSourceRectHint(null);
            return builder;
        }
        builder.setSourceRectHint(rect);
        return builder;
    }

    public h b(b2.f fVar, b2.x xVar) {
        boolean booleanValue;
        xVar.getClass();
        int i10 = xVar.L;
        fVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || i10 == -1) {
            return h.d;
        }
        Context context = (Context) this.a;
        Boolean bool = (Boolean) this.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = c2.j.e(context).getParameters("offloadVariableRateSupported");
                this.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.b = Boolean.FALSE;
            }
            booleanValue = ((Boolean) this.b).booleanValue();
        }
        String str = xVar.s;
        str.getClass();
        int c10 = b2.w0.c(str, xVar.k);
        if (c10 == 0 || i11 < e2.n0.s(c10)) {
            return h.d;
        }
        int t10 = e2.n0.t(xVar.K);
        if (t10 == 0) {
            return h.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(t10).setEncoding(c10).build();
            if (i11 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, fVar.b());
                if ((directPlaybackSupport & 1) == 0) {
                    return h.d;
                }
                r4 = (directPlaybackSupport & 3) == 3;
                cc.d dVar = new cc.d();
                dVar.a = true;
                dVar.b = r4;
                dVar.c = booleanValue;
                return dVar.a();
            }
            if (i11 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, fVar.b())) {
                    return h.d;
                }
                cc.d dVar2 = new cc.d();
                dVar2.a = true;
                dVar2.c = booleanValue;
                return dVar2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, fVar.b());
            if (playbackOffloadSupport == 0) {
                return h.d;
            }
            cc.d dVar3 = new cc.d();
            if (i11 > 32 && playbackOffloadSupport == 2) {
                r4 = true;
            }
            dVar3.a = true;
            dVar3.b = r4;
            dVar3.c = booleanValue;
            return dVar3.a();
        } catch (IllegalArgumentException unused) {
            return h.d;
        }
    }

    public boolean c() {
        if (((Rect) this.a).isEmpty()) {
            return false;
        }
        Point point = (Point) this.b;
        return point.x > 0 && point.y > 0;
    }

    public boolean d(int i10, int i11) {
        Point point = (Point) this.b;
        if (point.x == i10 && point.y == i11) {
            return false;
        }
        point.set(i10, i11);
        return true;
    }

    public o0(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }
}
