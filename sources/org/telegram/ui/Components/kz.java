package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class kz extends View {
    public static final int D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] s;
    public static Drawable[] w;
    public static Drawable[] x;
    public static final int y;
    public final RectF a;
    public long b;
    public boolean c;
    public boolean d;
    public float e;
    public int f;
    public boolean h;
    public boolean n;
    public final ArrayList r;

    static {
        y = org.telegram.messenger.iz.o() == 0 ? 50 : 60;
        D = org.telegram.messenger.iz.o() == 0 ? 20 : 30;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        s = new Paint[iArr.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = s;
            if (i7 >= paintArr.length) {
                return;
            }
            Paint paint = new Paint(1);
            paintArr[i7] = paint;
            paint.setColor(E[i7]);
            i7++;
        }
    }

    public kz(Context context) {
        super(context);
        this.a = new RectF();
        this.e = 1.0f;
        this.r = new ArrayList(y + D);
    }

    private int getHeightForAnimation() {
        return getMeasuredHeight() == 0 ? ((View) getParent()).getHeight() : getMeasuredHeight();
    }

    private int getWidthForAnimation() {
        return getMeasuredWidth() == 0 ? ((View) getParent()).getWidth() : getMeasuredWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0006, B:6:0x0016, B:7:0x0047, B:11:0x005f, B:14:0x007b, B:17:0x00ab, B:19:0x00c2, B:20:0x00cf, B:23:0x00d6, B:26:0x00c7, B:27:0x006a, B:28:0x0026, B:30:0x002a, B:32:0x0030, B:33:0x003d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0006, B:6:0x0016, B:7:0x0047, B:11:0x005f, B:14:0x007b, B:17:0x00ab, B:19:0x00c2, B:20:0x00cf, B:23:0x00d6, B:26:0x00c7, B:27:0x006a, B:28:0x0026, B:30:0x002a, B:32:0x0030, B:33:0x003d), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jz a(boolean z9) {
        jz jzVar = new jz(this);
        try {
            SecureRandom secureRandom = Utilities.b;
            byte nextInt = (byte) secureRandom.nextInt(2);
            jzVar.a = nextInt;
            if (this.h && nextInt == 0) {
                jzVar.a = (byte) 2;
                jzVar.b = (byte) secureRandom.nextInt(F.length);
            } else if (this.n && secureRandom.nextBoolean()) {
                jzVar.a = (byte) 2;
                jzVar.b = (byte) secureRandom.nextInt(G.length);
            } else {
                jzVar.b = (byte) secureRandom.nextInt(E.length);
            }
            jzVar.c = (byte) secureRandom.nextInt(2);
            jzVar.f = (byte) (secureRandom.nextInt(2) + 1);
            byte b10 = jzVar.a;
            if (b10 != 0 && b10 != 2) {
                jzVar.d = (byte) ((secureRandom.nextFloat() * 4.0f) + 4.0f);
                if (!z9) {
                    jzVar.h = (-secureRandom.nextFloat()) * getHeightForAnimation() * 1.2f;
                    jzVar.g = org.telegram.messenger.g0.L(5.0f) + secureRandom.nextInt(Math.max(1, getWidthForAnimation() - org.telegram.messenger.g0.L(10.0f)));
                    jzVar.e = jzVar.f;
                    return jzVar;
                }
                int L = org.telegram.messenger.g0.L(secureRandom.nextInt(10) + 4);
                int heightForAnimation = getHeightForAnimation() / 4;
                if (jzVar.c == 0) {
                    jzVar.g = -L;
                } else {
                    jzVar.g = getWidthForAnimation() + L;
                }
                jzVar.j = com.google.android.recaptcha.internal.a.B(secureRandom.nextFloat(), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.2f), jzVar.c == 0 ? 1 : -1);
                jzVar.k = -((secureRandom.nextFloat() * org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f));
                jzVar.h = (heightForAnimation / 2) + secureRandom.nextInt(Math.max(1, heightForAnimation * 2));
                return jzVar;
            }
            jzVar.d = (byte) ((secureRandom.nextFloat() * 2.0f) + 4.0f);
            if (!z9) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return jzVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r4 == 14) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(boolean z9) {
        this.n = z9;
        setLayerType(2, null);
        boolean z10 = true;
        this.c = true;
        this.d = false;
        this.f = 0;
        this.e = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i7 = calendar.get(5);
        if (calendar.get(2) == 1) {
            boolean z11 = org.telegram.messenger.r2.a;
        }
        z10 = false;
        this.h = z10;
        if (z10) {
            if (w == null) {
                w = new Drawable[F.length];
                int i10 = 0;
                while (true) {
                    Drawable[] drawableArr = w;
                    if (i10 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i10] = jg.g.h(org.telegram.messenger.t0.b, R.drawable.heart_confetti);
                    w[i10].setColorFilter(new PorterDuffColorFilter(F[i10], PorterDuff.Mode.MULTIPLY));
                    i10++;
                }
            }
        } else if (z9 && x == null) {
            x = new Drawable[G.length];
            int i11 = 0;
            while (true) {
                Drawable[] drawableArr2 = x;
                if (i11 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i11] = jg.g.h(org.telegram.messenger.t0.b, R.drawable.msg_settings_premium);
                x[i11].setColorFilter(new PorterDuffColorFilter(G[i11], PorterDuff.Mode.MULTIPLY));
                i11++;
            }
        }
        int i12 = y;
        int j3 = Utilities.j(i12 - this.r.size(), i12, i12 / 3);
        for (int i13 = 0; i13 < j3; i13++) {
            this.r.add(a(false));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = (int) (elapsedRealtime - this.b);
        this.b = elapsedRealtime;
        if (i7 > 18) {
            i7 = 16;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            jz jzVar = (jz) arrayList.get(i10);
            kz kzVar = jzVar.l;
            byte b10 = jzVar.a;
            Paint[] paintArr = s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(jzVar.g, jzVar.h, org.telegram.messenger.g0.L(jzVar.d), paintArr[jzVar.b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = kzVar.a;
                    f11 = 16.0f;
                    rectF.set(jzVar.g - org.telegram.messenger.g0.L(jzVar.d), jzVar.h - org.telegram.messenger.g0.L(2.0f), jzVar.g + org.telegram.messenger.g0.L(jzVar.d), jzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(jzVar.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[jzVar.b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = x;
                        Drawable drawable = drawableArr != null ? drawableArr[jzVar.b] : null;
                        Drawable[] drawableArr2 = w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[jzVar.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) jzVar.g;
                            int i12 = (int) jzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(jzVar.i, jzVar.g, jzVar.h);
                            float f12 = jzVar.d / 6.0f;
                            canvas.scale(f12, f12, jzVar.g, jzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            kz kzVar2 = jzVar.l;
            float f13 = i7 / f11;
            float f14 = jzVar.g;
            float f15 = jzVar.j;
            jzVar.g = (f15 * f13) + f14;
            jzVar.h = (jzVar.k * f13) + jzVar.h;
            if (jzVar.e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (jzVar.e == 1) {
                    float x10 = com.google.android.recaptcha.internal.a.x(L, f13, 0.05f, jzVar.j);
                    jzVar.j = x10;
                    if (x10 >= L) {
                        jzVar.e = (byte) 2;
                    }
                } else {
                    float x11 = org.telegram.ui.Cells.f1.x(L, f13, 0.05f, jzVar.j);
                    jzVar.j = x11;
                    if (x11 <= (-L)) {
                        jzVar.e = (byte) 1;
                    }
                }
            } else if (jzVar.c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    jzVar.j = f16;
                    if (f16 <= 0.0f) {
                        jzVar.j = 0.0f;
                        jzVar.e = jzVar.f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                jzVar.j = f17;
                if (f17 >= 0.0f) {
                    jzVar.j = 0.0f;
                    jzVar.e = jzVar.f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = jzVar.k;
            boolean z9 = f19 < f18;
            if (f19 > f18) {
                jzVar.k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * kzVar2.e) + f19;
            } else {
                jzVar.k = com.google.android.recaptcha.internal.a.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z9 && jzVar.k > f18) {
                kzVar2.f++;
            }
            byte b11 = jzVar.a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + jzVar.i);
                jzVar.i = s5;
                if (s5 > 360) {
                    jzVar.i = (short) (s5 - 360);
                }
            }
            if (jzVar.h >= kzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f >= y / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < D; i13++) {
                    arrayList.add(a(true));
                }
            }
            float v = org.telegram.messenger.camera.q.v(i7, 16.0f, 0.15f, this.e);
            this.e = v;
            if (v < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.c = false;
        org.telegram.messenger.g0.h3(new gp(this, 17));
        b();
    }

    public void b() {
    }
}
