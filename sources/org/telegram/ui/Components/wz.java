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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class wz extends View {
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
        y = org.telegram.messenger.bz.o() == 0 ? 50 : 60;
        E = org.telegram.messenger.bz.o() == 0 ? 20 : 30;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        F = iArr;
        G = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        H = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        s = new Paint[iArr.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = s;
            if (i7 >= paintArr.length) {
                return;
            }
            Paint paint = new Paint(1);
            paintArr[i7] = paint;
            paint.setColor(F[i7]);
            i7++;
        }
    }

    public wz(Context context) {
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
    public final vz a(boolean z10) {
        vz vzVar = new vz(this);
        try {
            SecureRandom secureRandom = Utilities.b;
            byte nextInt = (byte) secureRandom.nextInt(2);
            vzVar.a = nextInt;
            if (this.h && nextInt == 0) {
                vzVar.a = (byte) 2;
                vzVar.b = (byte) secureRandom.nextInt(G.length);
            } else if (this.n && secureRandom.nextBoolean()) {
                vzVar.a = (byte) 2;
                vzVar.b = (byte) secureRandom.nextInt(H.length);
            } else {
                vzVar.b = (byte) secureRandom.nextInt(F.length);
            }
            vzVar.c = (byte) secureRandom.nextInt(2);
            vzVar.f = (byte) (secureRandom.nextInt(2) + 1);
            byte b10 = vzVar.a;
            if (b10 != 0 && b10 != 2) {
                vzVar.d = (byte) ((secureRandom.nextFloat() * 4.0f) + 4.0f);
                if (!z10) {
                    vzVar.h = (-secureRandom.nextFloat()) * getHeightForAnimation() * 1.2f;
                    vzVar.g = org.telegram.messenger.g0.L(5.0f) + secureRandom.nextInt(Math.max(1, getWidthForAnimation() - org.telegram.messenger.g0.L(10.0f)));
                    vzVar.e = vzVar.f;
                    return vzVar;
                }
                int L = org.telegram.messenger.g0.L(secureRandom.nextInt(10) + 4);
                int heightForAnimation = getHeightForAnimation() / 4;
                if (vzVar.c == 0) {
                    vzVar.g = -L;
                } else {
                    vzVar.g = getWidthForAnimation() + L;
                }
                vzVar.j = com.google.android.gms.internal.vision.e2.B(secureRandom.nextFloat(), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.2f), vzVar.c == 0 ? 1 : -1);
                vzVar.k = -((secureRandom.nextFloat() * org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f));
                vzVar.h = (heightForAnimation / 2) + secureRandom.nextInt(Math.max(1, heightForAnimation * 2));
                return vzVar;
            }
            vzVar.d = (byte) ((secureRandom.nextFloat() * 2.0f) + 4.0f);
            if (!z10) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return vzVar;
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
        int i7 = calendar.get(5);
        if (calendar.get(2) == 1) {
            boolean z12 = org.telegram.messenger.s2.a;
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
                    drawableArr[i10] = i5.c.g(org.telegram.messenger.t0.b, R.drawable.heart_confetti);
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
                drawableArr2[i11] = i5.c.g(org.telegram.messenger.t0.b, R.drawable.msg_settings_premium);
                x[i11].setColorFilter(new PorterDuffColorFilter(H[i11], PorterDuff.Mode.MULTIPLY));
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
            vz vzVar = (vz) arrayList.get(i10);
            wz wzVar = vzVar.l;
            byte b10 = vzVar.a;
            Paint[] paintArr = s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(vzVar.g, vzVar.h, org.telegram.messenger.g0.L(vzVar.d), paintArr[vzVar.b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = wzVar.a;
                    f11 = 16.0f;
                    rectF.set(vzVar.g - org.telegram.messenger.g0.L(vzVar.d), vzVar.h - org.telegram.messenger.g0.L(2.0f), vzVar.g + org.telegram.messenger.g0.L(vzVar.d), vzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(vzVar.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[vzVar.b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = x;
                        Drawable drawable = drawableArr != null ? drawableArr[vzVar.b] : null;
                        Drawable[] drawableArr2 = w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[vzVar.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) vzVar.g;
                            int i12 = (int) vzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(vzVar.i, vzVar.g, vzVar.h);
                            float f12 = vzVar.d / 6.0f;
                            canvas.scale(f12, f12, vzVar.g, vzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            wz wzVar2 = vzVar.l;
            float f13 = i7 / f11;
            float f14 = vzVar.g;
            float f15 = vzVar.j;
            vzVar.g = (f15 * f13) + f14;
            vzVar.h = (vzVar.k * f13) + vzVar.h;
            if (vzVar.e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (vzVar.e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(L, f13, 0.05f, vzVar.j);
                    vzVar.j = x10;
                    if (x10 >= L) {
                        vzVar.e = (byte) 2;
                    }
                } else {
                    float z10 = org.telegram.ui.Cells.c0.z(L, f13, 0.05f, vzVar.j);
                    vzVar.j = z10;
                    if (z10 <= (-L)) {
                        vzVar.e = (byte) 1;
                    }
                }
            } else if (vzVar.c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    vzVar.j = f16;
                    if (f16 <= 0.0f) {
                        vzVar.j = 0.0f;
                        vzVar.e = vzVar.f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                vzVar.j = f17;
                if (f17 >= 0.0f) {
                    vzVar.j = 0.0f;
                    vzVar.e = vzVar.f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = vzVar.k;
            boolean z11 = f19 < f18;
            if (f19 > f18) {
                vzVar.k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * wzVar2.e) + f19;
            } else {
                vzVar.k = com.google.android.gms.internal.vision.e2.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z11 && vzVar.k > f18) {
                wzVar2.f++;
            }
            byte b11 = vzVar.a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + vzVar.i);
                vzVar.i = s5;
                if (s5 > 360) {
                    vzVar.i = (short) (s5 - 360);
                }
            }
            if (vzVar.h >= wzVar2.getHeightForAnimation()) {
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
            float w10 = org.telegram.messenger.n10.w(i7, 16.0f, 0.15f, this.e);
            this.e = w10;
            if (w10 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.c = false;
        org.telegram.messenger.g0.g3(new oo(this, 19));
        b();
    }

    public void b() {
    }
}
