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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class xz extends View {
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
        y = org.telegram.messenger.tz.o() == 0 ? 50 : 60;
        D = org.telegram.messenger.tz.o() == 0 ? 20 : 30;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        s = new Paint[iArr.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = s;
            if (i10 >= paintArr.length) {
                return;
            }
            Paint paint = new Paint(1);
            paintArr[i10] = paint;
            paint.setColor(E[i10]);
            i10++;
        }
    }

    public xz(Context context) {
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
    public final wz a(boolean z10) {
        wz wzVar = new wz(this);
        try {
            SecureRandom secureRandom = Utilities.b;
            byte nextInt = (byte) secureRandom.nextInt(2);
            wzVar.a = nextInt;
            if (this.h && nextInt == 0) {
                wzVar.a = (byte) 2;
                wzVar.b = (byte) secureRandom.nextInt(F.length);
            } else if (this.n && secureRandom.nextBoolean()) {
                wzVar.a = (byte) 2;
                wzVar.b = (byte) secureRandom.nextInt(G.length);
            } else {
                wzVar.b = (byte) secureRandom.nextInt(E.length);
            }
            wzVar.c = (byte) secureRandom.nextInt(2);
            wzVar.f = (byte) (secureRandom.nextInt(2) + 1);
            byte b10 = wzVar.a;
            if (b10 != 0 && b10 != 2) {
                wzVar.d = (byte) ((secureRandom.nextFloat() * 4.0f) + 4.0f);
                if (!z10) {
                    wzVar.h = (-secureRandom.nextFloat()) * getHeightForAnimation() * 1.2f;
                    wzVar.g = org.telegram.messenger.i0.L(5.0f) + secureRandom.nextInt(Math.max(1, getWidthForAnimation() - org.telegram.messenger.i0.L(10.0f)));
                    wzVar.e = wzVar.f;
                    return wzVar;
                }
                int L = org.telegram.messenger.i0.L(secureRandom.nextInt(10) + 4);
                int heightForAnimation = getHeightForAnimation() / 4;
                if (wzVar.c == 0) {
                    wzVar.g = -L;
                } else {
                    wzVar.g = getWidthForAnimation() + L;
                }
                wzVar.j = c3.i0.C(secureRandom.nextFloat(), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(1.2f), wzVar.c == 0 ? 1 : -1);
                wzVar.k = -((secureRandom.nextFloat() * org.telegram.messenger.i0.L(4.0f)) + org.telegram.messenger.i0.L(4.0f));
                wzVar.h = (heightForAnimation / 2) + secureRandom.nextInt(Math.max(1, heightForAnimation * 2));
                return wzVar;
            }
            wzVar.d = (byte) ((secureRandom.nextFloat() * 2.0f) + 4.0f);
            if (!z10) {
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return wzVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r4 == 14) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(boolean z10) {
        this.n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.c = true;
        this.d = false;
        this.f = 0;
        this.e = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(5);
        if (calendar.get(2) == 1) {
            boolean z12 = org.telegram.messenger.v2.a;
        }
        z11 = false;
        this.h = z11;
        if (z11) {
            if (w == null) {
                w = new Drawable[F.length];
                int i11 = 0;
                while (true) {
                    Drawable[] drawableArr = w;
                    if (i11 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i11] = i0.a.f(org.telegram.messenger.w0.b, R.drawable.heart_confetti);
                    w[i11].setColorFilter(new PorterDuffColorFilter(F[i11], PorterDuff.Mode.MULTIPLY));
                    i11++;
                }
            }
        } else if (z10 && x == null) {
            x = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = x;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = i0.a.f(org.telegram.messenger.w0.b, R.drawable.msg_settings_premium);
                x[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = y;
        int j10 = Utilities.j(i13 - this.r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < j10; i14++) {
            this.r.add(a(false));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (int) (elapsedRealtime - this.b);
        this.b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            wz wzVar = (wz) arrayList.get(i11);
            xz xzVar = wzVar.l;
            byte b10 = wzVar.a;
            Paint[] paintArr = s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(wzVar.g, wzVar.h, org.telegram.messenger.i0.L(wzVar.d), paintArr[wzVar.b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = xzVar.a;
                    f10 = 16.0f;
                    rectF.set(wzVar.g - org.telegram.messenger.i0.L(wzVar.d), wzVar.h - org.telegram.messenger.i0.L(2.0f), wzVar.g + org.telegram.messenger.i0.L(wzVar.d), wzVar.h + org.telegram.messenger.i0.L(2.0f));
                    canvas.save();
                    canvas.rotate(wzVar.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paintArr[wzVar.b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = x;
                        Drawable drawable = drawableArr != null ? drawableArr[wzVar.b] : null;
                        Drawable[] drawableArr2 = w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[wzVar.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) wzVar.g;
                            int i13 = (int) wzVar.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(wzVar.i, wzVar.g, wzVar.h);
                            float f11 = wzVar.d / 6.0f;
                            canvas.scale(f11, f11, wzVar.g, wzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            xz xzVar2 = wzVar.l;
            float f12 = i10 / f10;
            float f13 = wzVar.g;
            float f14 = wzVar.j;
            wzVar.g = (f14 * f12) + f13;
            wzVar.h = (wzVar.k * f12) + wzVar.h;
            if (wzVar.e != 0) {
                float L = org.telegram.messenger.i0.L(1.0f) * 0.5f;
                if (wzVar.e == 1) {
                    float u10 = c3.i0.u(L, f12, 0.05f, wzVar.j);
                    wzVar.j = u10;
                    if (u10 >= L) {
                        wzVar.e = (byte) 2;
                    }
                } else {
                    float x10 = org.telegram.ui.Cells.f1.x(L, f12, 0.05f, wzVar.j);
                    wzVar.j = x10;
                    if (x10 <= (-L)) {
                        wzVar.e = (byte) 1;
                    }
                }
            } else if (wzVar.c == 0) {
                if (f14 > 0.0f) {
                    float f15 = f14 - (0.05f * f12);
                    wzVar.j = f15;
                    if (f15 <= 0.0f) {
                        wzVar.j = 0.0f;
                        wzVar.e = wzVar.f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f16 = (0.05f * f12) + f14;
                wzVar.j = f16;
                if (f16 >= 0.0f) {
                    wzVar.j = 0.0f;
                    wzVar.e = wzVar.f;
                }
            }
            float f17 = (-org.telegram.messenger.i0.L(1.0f)) / f7;
            float f18 = wzVar.k;
            boolean z10 = f18 < f17;
            if (f18 > f17) {
                wzVar.k = ((org.telegram.messenger.i0.L(1.0f) / 3.0f) * f12 * xzVar2.e) + f18;
            } else {
                wzVar.k = a1.g.c(org.telegram.messenger.i0.L(1.0f), 3.0f, f12, f18);
            }
            if (z10 && wzVar.k > f17) {
                xzVar2.f++;
            }
            byte b11 = wzVar.a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + wzVar.i);
                wzVar.i = s10;
                if (s10 > 360) {
                    wzVar.i = (short) (s10 - 360);
                }
            }
            if (wzVar.h >= xzVar2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f >= y / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < D; i14++) {
                    arrayList.add(a(true));
                }
            }
            float v = org.telegram.messenger.z20.v(i10, 16.0f, 0.15f, this.e);
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
        org.telegram.messenger.i0.g3(new ho(this, 19));
        b();
    }

    public void b() {
    }
}
