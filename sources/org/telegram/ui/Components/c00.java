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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class c00 extends View {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
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
        A = iArr;
        B = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        C = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        s = new Paint[iArr.length];
        int i9 = 0;
        while (true) {
            Paint[] paintArr = s;
            if (i9 >= paintArr.length) {
                return;
            }
            Paint paint = new Paint(1);
            paintArr[i9] = paint;
            paint.setColor(A[i9]);
            i9++;
        }
    }

    public c00(Context context) {
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
    public final b00 a(boolean z10) {
        b00 b00Var = new b00(this);
        try {
            byte nextInt = (byte) Utilities.random.nextInt(2);
            b00Var.a = nextInt;
            if (this.h && nextInt == 0) {
                b00Var.a = (byte) 2;
                b00Var.b = (byte) Utilities.random.nextInt(B.length);
            } else if (this.n && Utilities.random.nextBoolean()) {
                b00Var.a = (byte) 2;
                b00Var.b = (byte) Utilities.random.nextInt(C.length);
            } else {
                b00Var.b = (byte) Utilities.random.nextInt(A.length);
            }
            b00Var.c = (byte) Utilities.random.nextInt(2);
            b00Var.f = (byte) (Utilities.random.nextInt(2) + 1);
            byte b10 = b00Var.a;
            if (b10 != 0 && b10 != 2) {
                b00Var.d = (byte) ((Utilities.random.nextFloat() * 4.0f) + 4.0f);
                if (!z10) {
                    b00Var.h = (-Utilities.random.nextFloat()) * getHeightForAnimation() * 1.2f;
                    b00Var.g = AndroidUtilities.dp(5.0f) + Utilities.random.nextInt(Math.max(1, getWidthForAnimation() - AndroidUtilities.dp(10.0f)));
                    b00Var.e = b00Var.f;
                    return b00Var;
                }
                int dp = AndroidUtilities.dp(Utilities.random.nextInt(10) + 4);
                int heightForAnimation = getHeightForAnimation() / 4;
                if (b00Var.c == 0) {
                    b00Var.g = -dp;
                } else {
                    b00Var.g = getWidthForAnimation() + dp;
                }
                b00Var.j = e2.c.B(Utilities.random.nextFloat(), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.2f), b00Var.c == 0 ? 1 : -1);
                b00Var.k = -((Utilities.random.nextFloat() * AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f));
                b00Var.h = (heightForAnimation / 2) + Utilities.random.nextInt(Math.max(1, heightForAnimation * 2));
                return b00Var;
            }
            b00Var.d = (byte) ((Utilities.random.nextFloat() * 2.0f) + 4.0f);
            if (!z10) {
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            return b00Var;
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
        int i9 = calendar.get(5);
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i9 != 14)) {
            z11 = false;
        }
        this.h = z11;
        if (z11) {
            if (v == null) {
                v = new Drawable[B.length];
                int i10 = 0;
                while (true) {
                    Drawable[] drawableArr = v;
                    if (i10 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i10] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.heart_confetti).mutate();
                    v[i10].setColorFilter(new PorterDuffColorFilter(B[i10], PorterDuff.Mode.MULTIPLY));
                    i10++;
                }
            }
        } else if (z10 && w == null) {
            w = new Drawable[C.length];
            int i11 = 0;
            while (true) {
                Drawable[] drawableArr2 = w;
                if (i11 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i11] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                w[i11].setColorFilter(new PorterDuffColorFilter(C[i11], PorterDuff.Mode.MULTIPLY));
                i11++;
            }
        }
        int i12 = x;
        int clamp = Utilities.clamp(i12 - this.r.size(), i12, i12 / 3);
        for (int i13 = 0; i13 < clamp; i13++) {
            this.r.add(a(false));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i9 = (int) (elapsedRealtime - this.b);
        this.b = elapsedRealtime;
        if (i9 > 18) {
            i9 = 16;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            b00 b00Var = (b00) arrayList.get(i10);
            c00 c00Var = b00Var.l;
            byte b10 = b00Var.a;
            Paint[] paintArr = s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(b00Var.g, b00Var.h, AndroidUtilities.dp(b00Var.d), paintArr[b00Var.b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = c00Var.a;
                    f11 = 16.0f;
                    rectF.set(b00Var.g - AndroidUtilities.dp(b00Var.d), b00Var.h - AndroidUtilities.dp(2.0f), b00Var.g + AndroidUtilities.dp(b00Var.d), b00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(b00Var.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[b00Var.b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = w;
                        Drawable drawable = drawableArr != null ? drawableArr[b00Var.b] : null;
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[b00Var.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) b00Var.g;
                            int i12 = (int) b00Var.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(b00Var.i, b00Var.g, b00Var.h);
                            float f12 = b00Var.d / 6.0f;
                            canvas.scale(f12, f12, b00Var.g, b00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            c00 c00Var2 = b00Var.l;
            float f13 = i9 / f11;
            float f14 = b00Var.g;
            float f15 = b00Var.j;
            b00Var.g = (f15 * f13) + f14;
            b00Var.h = (b00Var.k * f13) + b00Var.h;
            if (b00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (b00Var.e == 1) {
                    float x10 = e2.c.x(dp, f13, 0.05f, b00Var.j);
                    b00Var.j = x10;
                    if (x10 >= dp) {
                        b00Var.e = (byte) 2;
                    }
                } else {
                    float f16 = b00Var.j - ((dp * f13) * 0.05f);
                    b00Var.j = f16;
                    if (f16 <= (-dp)) {
                        b00Var.e = (byte) 1;
                    }
                }
            } else if (b00Var.c == 0) {
                if (f15 > 0.0f) {
                    float f17 = f15 - (0.05f * f13);
                    b00Var.j = f17;
                    if (f17 <= 0.0f) {
                        b00Var.j = 0.0f;
                        b00Var.e = b00Var.f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f18 = (0.05f * f13) + f15;
                b00Var.j = f18;
                if (f18 >= 0.0f) {
                    b00Var.j = 0.0f;
                    b00Var.e = b00Var.f;
                }
            }
            float f19 = (-AndroidUtilities.dp(1.0f)) / f10;
            float f20 = b00Var.k;
            boolean z10 = f20 < f19;
            if (f20 > f19) {
                b00Var.k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f13 * c00Var2.e) + f20;
            } else {
                b00Var.k = org.telegram.ui.Cells.j2.b(AndroidUtilities.dp(1.0f), 3.0f, f13, f20);
            }
            if (z10 && b00Var.k > f19) {
                c00Var2.f++;
            }
            byte b11 = b00Var.a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f13 * 10.0f) + b00Var.i);
                b00Var.i = s10;
                if (s10 > 360) {
                    b00Var.i = (short) (s10 - 360);
                }
            }
            if (b00Var.h >= c00Var2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f >= x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < y; i13++) {
                    arrayList.add(a(true));
                }
            }
            float c10 = org.telegram.messenger.ll.c(i9, 16.0f, 0.15f, this.e);
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
        AndroidUtilities.runOnUIThread(new np(this, 18));
        b();
    }

    public void b() {
    }
}
