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
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class y00 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] s;
    public static Drawable[] v;
    public static Drawable[] w;
    public static final int x;
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
        x = SharedConfig.getDevicePerformanceClass() == 0 ? 50 : 60;
        y = SharedConfig.getDevicePerformanceClass() == 0 ? 20 : 30;
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

    public y00(Context context) {
        super(context);
        this.a = new RectF();
        this.e = 1.0f;
        this.r = new ArrayList(x + y);
    }

    private int getHeightForAnimation() {
        return getMeasuredHeight() == 0 ? ((View) getParent()).getHeight() : getMeasuredHeight();
    }

    private int getWidthForAnimation() {
        return getMeasuredWidth() == 0 ? ((View) getParent()).getWidth() : getMeasuredWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0005, B:6:0x0015, B:7:0x004e, B:11:0x006b, B:14:0x008d, B:17:0x00c3, B:19:0x00dc, B:20:0x00e9, B:23:0x00f0, B:26:0x00e1, B:27:0x0079, B:28:0x0027, B:30:0x002b, B:32:0x0033, B:33:0x0042), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0005, B:6:0x0015, B:7:0x004e, B:11:0x006b, B:14:0x008d, B:17:0x00c3, B:19:0x00dc, B:20:0x00e9, B:23:0x00f0, B:26:0x00e1, B:27:0x0079, B:28:0x0027, B:30:0x002b, B:32:0x0033, B:33:0x0042), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x00 a(boolean z10) {
        x00 x00Var = new x00(this);
        try {
            byte nextInt = (byte) Utilities.random.nextInt(2);
            x00Var.a = nextInt;
            if (this.h && nextInt == 0) {
                x00Var.a = (byte) 2;
                x00Var.b = (byte) Utilities.random.nextInt(F.length);
            } else if (this.n && Utilities.random.nextBoolean()) {
                x00Var.a = (byte) 2;
                x00Var.b = (byte) Utilities.random.nextInt(G.length);
            } else {
                x00Var.b = (byte) Utilities.random.nextInt(E.length);
            }
            x00Var.c = (byte) Utilities.random.nextInt(2);
            x00Var.f = (byte) (Utilities.random.nextInt(2) + 1);
            byte b10 = x00Var.a;
            if (b10 != 0 && b10 != 2) {
                x00Var.d = (byte) ((Utilities.random.nextFloat() * 4.0f) + 4.0f);
                if (!z10) {
                    x00Var.h = (-Utilities.random.nextFloat()) * getHeightForAnimation() * 1.2f;
                    x00Var.g = AndroidUtilities.dp(5.0f) + Utilities.random.nextInt(Math.max(1, getWidthForAnimation() - AndroidUtilities.dp(10.0f)));
                    x00Var.e = x00Var.f;
                    return x00Var;
                }
                int dp = AndroidUtilities.dp(Utilities.random.nextInt(10) + 4);
                int heightForAnimation = getHeightForAnimation() / 4;
                if (x00Var.c == 0) {
                    x00Var.g = -dp;
                } else {
                    x00Var.g = getWidthForAnimation() + dp;
                }
                x00Var.j = com.google.android.gms.internal.vision.e2.B(Utilities.random.nextFloat(), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.2f), x00Var.c == 0 ? 1 : -1);
                x00Var.k = -((Utilities.random.nextFloat() * AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f));
                x00Var.h = (heightForAnimation / 2) + Utilities.random.nextInt(Math.max(1, heightForAnimation * 2));
                return x00Var;
            }
            x00Var.d = (byte) ((Utilities.random.nextFloat() * 2.0f) + 4.0f);
            if (!z10) {
            }
        } catch (Exception e) {
            FileLog.e(e);
            return x00Var;
        }
    }

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
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i10 != 14)) {
            z11 = false;
        }
        this.h = z11;
        if (z11) {
            if (v == null) {
                v = new Drawable[F.length];
                int i11 = 0;
                while (true) {
                    Drawable[] drawableArr = v;
                    if (i11 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i11] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.heart_confetti).mutate();
                    v[i11].setColorFilter(new PorterDuffColorFilter(F[i11], PorterDuff.Mode.MULTIPLY));
                    i11++;
                }
            }
        } else if (z10 && w == null) {
            w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = x;
        int clamp = Utilities.clamp(i13 - this.r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
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
            x00 x00Var = (x00) arrayList.get(i11);
            y00 y00Var = x00Var.l;
            byte b10 = x00Var.a;
            Paint[] paintArr = s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(x00Var.g, x00Var.h, AndroidUtilities.dp(x00Var.d), paintArr[x00Var.b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = y00Var.a;
                    f10 = 16.0f;
                    rectF.set(x00Var.g - AndroidUtilities.dp(x00Var.d), x00Var.h - AndroidUtilities.dp(2.0f), x00Var.g + AndroidUtilities.dp(x00Var.d), x00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(x00Var.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[x00Var.b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = w;
                        Drawable drawable = drawableArr != null ? drawableArr[x00Var.b] : null;
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[x00Var.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) x00Var.g;
                            int i13 = (int) x00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(x00Var.i, x00Var.g, x00Var.h);
                            float f11 = x00Var.d / 6.0f;
                            canvas.scale(f11, f11, x00Var.g, x00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            y00 y00Var2 = x00Var.l;
            float f12 = i10 / f10;
            float f13 = x00Var.g;
            float f14 = x00Var.j;
            x00Var.g = (f14 * f12) + f13;
            x00Var.h = (x00Var.k * f12) + x00Var.h;
            if (x00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (x00Var.e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(dp, f12, 0.05f, x00Var.j);
                    x00Var.j = x10;
                    if (x10 >= dp) {
                        x00Var.e = (byte) 2;
                    }
                } else {
                    float f15 = x00Var.j - ((dp * f12) * 0.05f);
                    x00Var.j = f15;
                    if (f15 <= (-dp)) {
                        x00Var.e = (byte) 1;
                    }
                }
            } else if (x00Var.c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    x00Var.j = f16;
                    if (f16 <= 0.0f) {
                        x00Var.j = 0.0f;
                        x00Var.e = x00Var.f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                x00Var.j = f17;
                if (f17 >= 0.0f) {
                    x00Var.j = 0.0f;
                    x00Var.e = x00Var.f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = x00Var.k;
            boolean z10 = f19 < f18;
            if (f19 > f18) {
                x00Var.k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * y00Var2.e) + f19;
            } else {
                x00Var.k = a4.a.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && x00Var.k > f18) {
                y00Var2.f++;
            }
            byte b11 = x00Var.a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + x00Var.i);
                x00Var.i = s10;
                if (s10 > 360) {
                    x00Var.i = (short) (s10 - 360);
                }
            }
            if (x00Var.h >= y00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f >= x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float c10 = org.telegram.messenger.em.c(i10, 16.0f, 0.15f, this.e);
            this.e = c10;
            if (c10 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.c = false;
        AndroidUtilities.runOnUIThread(new dq(this, 18));
        b();
    }

    public void b() {
    }
}
