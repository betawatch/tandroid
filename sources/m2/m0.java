package m2;

import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import android.util.Rational;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 {
    public final Object a;
    public Object b;

    public m0() {
        this.a = new Rect();
        this.b = new Point();
    }

    public PictureInPictureParams.Builder a() {
        int i3;
        Rect rect = (Rect) this.a;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = (Point) this.b;
        int i10 = point.x;
        if (i10 <= 0 || (i3 = point.y) <= 0) {
            builder.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(null);
            }
        } else {
            double d = i10 / i3;
            Rational rational = d < 0.45d ? new Rational(45, 100) : d > 2.35d ? new Rational(hs.K3, 100) : new Rational(point.x, point.y);
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

    public f b(d2.f fVar, d2.v vVar) {
        boolean booleanValue;
        vVar.getClass();
        int i3 = vVar.L;
        fVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i3 == -1) {
            return f.d;
        }
        Context context = (Context) this.a;
        Boolean bool = (Boolean) this.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = e2.h.e(context).getParameters("offloadVariableRateSupported");
                this.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.b = Boolean.FALSE;
            }
            booleanValue = ((Boolean) this.b).booleanValue();
        }
        String str = vVar.s;
        str.getClass();
        int c2 = d2.u0.c(str, vVar.k);
        if (c2 == 0 || i10 < g2.n0.s(c2)) {
            return f.d;
        }
        int t10 = g2.n0.t(vVar.K);
        if (t10 == 0) {
            return f.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i3).setChannelMask(t10).setEncoding(c2).build();
            if (i10 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, fVar.b());
                if ((directPlaybackSupport & 1) == 0) {
                    return f.d;
                }
                r4 = (directPlaybackSupport & 3) == 3;
                ha.a aVar = new ha.a();
                aVar.a = true;
                aVar.b = r4;
                aVar.c = booleanValue;
                return aVar.a();
            }
            if (i10 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, fVar.b())) {
                    return f.d;
                }
                ha.a aVar2 = new ha.a();
                aVar2.a = true;
                aVar2.c = booleanValue;
                return aVar2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, fVar.b());
            if (playbackOffloadSupport == 0) {
                return f.d;
            }
            ha.a aVar3 = new ha.a();
            if (i10 > 32 && playbackOffloadSupport == 2) {
                r4 = true;
            }
            aVar3.a = true;
            aVar3.b = r4;
            aVar3.c = booleanValue;
            return aVar3.a();
        } catch (IllegalArgumentException unused) {
            return f.d;
        }
    }

    public boolean c() {
        if (((Rect) this.a).isEmpty()) {
            return false;
        }
        Point point = (Point) this.b;
        return point.x > 0 && point.y > 0;
    }

    public boolean d(int i3, int i10) {
        Point point = (Point) this.b;
        if (point.x == i3 && point.y == i10) {
            return false;
        }
        point.set(i3, i10);
        return true;
    }

    public m0(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }
}
