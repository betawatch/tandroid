package jg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import t7.u;
import u2.f0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class f {
    public boolean a;
    public int b;
    public Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;

    public f(c3.m mVar, u uVar) {
        this.c = mVar;
        this.g = uVar;
        this.d = new HashMap();
        this.e = new HashMap();
        this.a = true;
        this.b = 3;
    }

    public static void a(f fVar) {
        c3.m mVar = (c3.m) fVar.c;
        synchronized (mVar) {
            mVar.f = 1;
        }
    }

    public f0 b(int i10) {
        d9.u uVar;
        d9.u oVar;
        HashMap hashMap = (HashMap) this.e;
        f0 f0Var = (f0) hashMap.get(Integer.valueOf(i10));
        if (f0Var != null) {
            return f0Var;
        }
        HashMap hashMap2 = (HashMap) this.d;
        d9.u uVar2 = (d9.u) hashMap2.get(Integer.valueOf(i10));
        if (uVar2 == null) {
            final qf.b bVar = (qf.b) this.f;
            bVar.getClass();
            if (i10 != 0) {
                final int i11 = 1;
                if (i10 != 1) {
                    final int i12 = 2;
                    if (i10 != 2) {
                        final int i13 = 3;
                        if (i10 == 3) {
                            oVar = new i2.o(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        } else {
                            if (i10 != 4) {
                                throw new IllegalArgumentException(i2.e.j(i10, "Unrecognized contentType: "));
                            }
                            oVar = new d9.u() { // from class: u2.p
                                @Override // d9.u
                                public final Object get() {
                                    switch (i13) {
                                        case 0:
                                            return q.e((Class) this, bVar);
                                        case 1:
                                            return q.e((Class) this, bVar);
                                        case 2:
                                            return q.e((Class) this, bVar);
                                        default:
                                            return new y0(bVar, (c3.m) ((jg.f) this).c);
                                    }
                                }
                            };
                        }
                        uVar2 = oVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        uVar = new d9.u() { // from class: u2.p
                            @Override // d9.u
                            public final Object get() {
                                switch (i12) {
                                    case 0:
                                        return q.e((Class) asSubclass, bVar);
                                    case 1:
                                        return q.e((Class) asSubclass, bVar);
                                    case 2:
                                        return q.e((Class) asSubclass, bVar);
                                    default:
                                        return new y0(bVar, (c3.m) ((jg.f) asSubclass).c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    uVar = new d9.u() { // from class: u2.p
                        @Override // d9.u
                        public final Object get() {
                            switch (i11) {
                                case 0:
                                    return q.e((Class) asSubclass2, bVar);
                                case 1:
                                    return q.e((Class) asSubclass2, bVar);
                                case 2:
                                    return q.e((Class) asSubclass2, bVar);
                                default:
                                    return new y0(bVar, (c3.m) ((jg.f) asSubclass2).c);
                            }
                        }
                    };
                }
                uVar2 = uVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                final int i14 = 0;
                uVar2 = new d9.u() { // from class: u2.p
                    @Override // d9.u
                    public final Object get() {
                        switch (i14) {
                            case 0:
                                return q.e((Class) asSubclass3, bVar);
                            case 1:
                                return q.e((Class) asSubclass3, bVar);
                            case 2:
                                return q.e((Class) asSubclass3, bVar);
                            default:
                                return new y0(bVar, (c3.m) ((jg.f) asSubclass3).c);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i10), uVar2);
        }
        f0 f0Var2 = (f0) uVar2.get();
        f0Var2.d((u) this.g);
        f0Var2.b(this.a);
        f0Var2.c(this.b);
        hashMap.put(Integer.valueOf(i10), f0Var2);
        return f0Var2;
    }

    public Bitmap c(int i10, int i11) {
        RectF rectF = (RectF) this.e;
        int i12 = (i10 + i11) << 10;
        if (i12 != this.b || this.a) {
            this.a = false;
            this.b = i12;
            this.c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.d = new Canvas((Bitmap) this.c);
            rectF.set(0.0f, 0.0f, i11, i10);
            ((Canvas) this.d).drawColor(h6.w0(h6.d6, (d6) this.g));
            ((Canvas) this.d).drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (Paint) this.f);
        }
        return (Bitmap) this.c;
    }

    public f(d6 d6Var) {
        this.e = new RectF();
        Paint paint = new Paint(1);
        this.f = paint;
        this.b = 0;
        this.a = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.g = d6Var;
    }
}
