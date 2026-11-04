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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class gz extends View {
    public static final int E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
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
        y = org.telegram.messenger.az.o() == 0 ? 50 : 60;
        E = org.telegram.messenger.az.o() == 0 ? 20 : 30;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        F = iArr;
        G = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        H = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        s = new Paint[iArr.length];
        int i3 = 0;
        while (true) {
            Paint[] paintArr = s;
            if (i3 >= paintArr.length) {
                return;
            }
            Paint paint = new Paint(1);
            paintArr[i3] = paint;
            paint.setColor(F[i3]);
            i3++;
        }
    }

    public gz(Context context) {
        super(context);
        this.a = new RectF();
        this.e = 1.0f;
        this.r = new ArrayList(y + E);
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
    public final fz a(boolean z10) {
        fz fzVar = new fz(this);
        try {
            SecureRandom secureRandom = Utilities.b;
            byte nextInt = (byte) secureRandom.nextInt(2);
            fzVar.a = nextInt;
            if (this.h && nextInt == 0) {
                fzVar.a = (byte) 2;
                fzVar.b = (byte) secureRandom.nextInt(G.length);
            } else if (this.n && secureRandom.nextBoolean()) {
                fzVar.a = (byte) 2;
                fzVar.b = (byte) secureRandom.nextInt(H.length);
            } else {
                fzVar.b = (byte) secureRandom.nextInt(F.length);
            }
            fzVar.c = (byte) secureRandom.nextInt(2);
            fzVar.f = (byte) (secureRandom.nextInt(2) + 1);
            byte b10 = fzVar.a;
            if (b10 != 0 && b10 != 2) {
                fzVar.d = (byte) ((secureRandom.nextFloat() * 4.0f) + 4.0f);
                if (!z10) {
                    fzVar.h = (-secureRandom.nextFloat()) * getHeightForAnimation() * 1.2f;
                    fzVar.g = org.telegram.messenger.g0.L(5.0f) + secureRandom.nextInt(Math.max(1, getWidthForAnimation() - org.telegram.messenger.g0.L(10.0f)));
                    fzVar.e = fzVar.f;
                    return fzVar;
                }
                int L = org.telegram.messenger.g0.L(secureRandom.nextInt(10) + 4);
                int heightForAnimation = getHeightForAnimation() / 4;
                if (fzVar.c == 0) {
                    fzVar.g = -L;
                } else {
                    fzVar.g = getWidthForAnimation() + L;
                }
                fzVar.j = com.google.android.recaptcha.internal.a.A(secureRandom.nextFloat(), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.2f), fzVar.c == 0 ? 1 : -1);
                fzVar.k = -((secureRandom.nextFloat() * org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f));
                fzVar.h = (heightForAnimation / 2) + secureRandom.nextInt(Math.max(1, heightForAnimation * 2));
                return fzVar;
            }
            fzVar.d = (byte) ((secureRandom.nextFloat() * 2.0f) + 4.0f);
            if (!z10) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return fzVar;
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
        int i3 = calendar.get(5);
        if (calendar.get(2) == 1) {
            boolean z12 = org.telegram.messenger.r2.a;
        }
        z11 = false;
        this.h = z11;
        if (z11) {
            if (w == null) {
                w = new Drawable[G.length];
                int i10 = 0;
                while (true) {
                    Drawable[] drawableArr = w;
                    if (i10 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i10] = k2.p1.g(org.telegram.messenger.t0.b, R.drawable.heart_confetti);
                    w[i10].setColorFilter(new PorterDuffColorFilter(G[i10], PorterDuff.Mode.MULTIPLY));
                    i10++;
                }
            }
        } else if (z10 && x == null) {
            x = new Drawable[H.length];
            int i11 = 0;
            while (true) {
                Drawable[] drawableArr2 = x;
                if (i11 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i11] = k2.p1.g(org.telegram.messenger.t0.b, R.drawable.msg_settings_premium);
                x[i11].setColorFilter(new PorterDuffColorFilter(H[i11], PorterDuff.Mode.MULTIPLY));
                i11++;
            }
        }
        int i12 = y;
        int j10 = Utilities.j(i12 - this.r.size(), i12, i12 / 3);
        for (int i13 = 0; i13 < j10; i13++) {
            this.r.add(a(false));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = (int) (elapsedRealtime - this.b);
        this.b = elapsedRealtime;
        if (i3 > 18) {
            i3 = 16;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            fz fzVar = (fz) arrayList.get(i10);
            gz gzVar = fzVar.l;
            byte b10 = fzVar.a;
            Paint[] paintArr = s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(fzVar.g, fzVar.h, org.telegram.messenger.g0.L(fzVar.d), paintArr[fzVar.b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = gzVar.a;
                    f11 = 16.0f;
                    rectF.set(fzVar.g - org.telegram.messenger.g0.L(fzVar.d), fzVar.h - org.telegram.messenger.g0.L(2.0f), fzVar.g + org.telegram.messenger.g0.L(fzVar.d), fzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(fzVar.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[fzVar.b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = x;
                        Drawable drawable = drawableArr != null ? drawableArr[fzVar.b] : null;
                        Drawable[] drawableArr2 = w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[fzVar.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) fzVar.g;
                            int i12 = (int) fzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(fzVar.i, fzVar.g, fzVar.h);
                            float f12 = fzVar.d / 6.0f;
                            canvas.scale(f12, f12, fzVar.g, fzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            gz gzVar2 = fzVar.l;
            float f13 = i3 / f11;
            float f14 = fzVar.g;
            float f15 = fzVar.j;
            fzVar.g = (f15 * f13) + f14;
            fzVar.h = (fzVar.k * f13) + fzVar.h;
            if (fzVar.e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (fzVar.e == 1) {
                    float v = com.google.android.recaptcha.internal.a.v(L, f13, 0.05f, fzVar.j);
                    fzVar.j = v;
                    if (v >= L) {
                        fzVar.e = (byte) 2;
                    }
                } else {
                    float A = org.telegram.ui.Cells.f1.A(L, f13, 0.05f, fzVar.j);
                    fzVar.j = A;
                    if (A <= (-L)) {
                        fzVar.e = (byte) 1;
                    }
                }
            } else if (fzVar.c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    fzVar.j = f16;
                    if (f16 <= 0.0f) {
                        fzVar.j = 0.0f;
                        fzVar.e = fzVar.f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                fzVar.j = f17;
                if (f17 >= 0.0f) {
                    fzVar.j = 0.0f;
                    fzVar.e = fzVar.f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = fzVar.k;
            boolean z10 = f19 < f18;
            if (f19 > f18) {
                fzVar.k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * gzVar2.e) + f19;
            } else {
                fzVar.k = a1.g.A(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z10 && fzVar.k > f18) {
                gzVar2.f++;
            }
            byte b11 = fzVar.a;
            if (b11 == 1 || b11 == 2) {
                short s6 = (short) ((f13 * 10.0f) + fzVar.i);
                fzVar.i = s6;
                if (s6 > 360) {
                    fzVar.i = (short) (s6 - 360);
                }
            }
            if (fzVar.h >= gzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f >= y / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < E; i13++) {
                    arrayList.add(a(true));
                }
            }
            float v10 = org.telegram.messenger.camera.q.v(i3, 16.0f, 0.15f, this.e);
            this.e = v10;
            if (v10 < 0.2f) {
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
