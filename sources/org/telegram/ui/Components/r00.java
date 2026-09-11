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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class r00 extends View {
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

    public r00(Context context) {
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
    public final q00 a(boolean z10) {
        q00 q00Var = new q00(this);
        try {
            byte nextInt = (byte) Utilities.random.nextInt(2);
            q00Var.a = nextInt;
            if (this.h && nextInt == 0) {
                q00Var.a = (byte) 2;
                q00Var.b = (byte) Utilities.random.nextInt(F.length);
            } else if (this.n && Utilities.random.nextBoolean()) {
                q00Var.a = (byte) 2;
                q00Var.b = (byte) Utilities.random.nextInt(G.length);
            } else {
                q00Var.b = (byte) Utilities.random.nextInt(E.length);
            }
            q00Var.c = (byte) Utilities.random.nextInt(2);
            q00Var.f = (byte) (Utilities.random.nextInt(2) + 1);
            byte b10 = q00Var.a;
            if (b10 != 0 && b10 != 2) {
                q00Var.d = (byte) ((Utilities.random.nextFloat() * 4.0f) + 4.0f);
                if (!z10) {
                    q00Var.h = (-Utilities.random.nextFloat()) * getHeightForAnimation() * 1.2f;
                    q00Var.g = AndroidUtilities.dp(5.0f) + Utilities.random.nextInt(Math.max(1, getWidthForAnimation() - AndroidUtilities.dp(10.0f)));
                    q00Var.e = q00Var.f;
                    return q00Var;
                }
                int dp = AndroidUtilities.dp(Utilities.random.nextInt(10) + 4);
                int heightForAnimation = getHeightForAnimation() / 4;
                if (q00Var.c == 0) {
                    q00Var.g = -dp;
                } else {
                    q00Var.g = getWidthForAnimation() + dp;
                }
                q00Var.j = com.google.android.gms.internal.vision.e2.B(Utilities.random.nextFloat(), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.2f), q00Var.c == 0 ? 1 : -1);
                q00Var.k = -((Utilities.random.nextFloat() * AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f));
                q00Var.h = (heightForAnimation / 2) + Utilities.random.nextInt(Math.max(1, heightForAnimation * 2));
                return q00Var;
            }
            q00Var.d = (byte) ((Utilities.random.nextFloat() * 2.0f) + 4.0f);
            if (!z10) {
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            return q00Var;
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
            q00 q00Var = (q00) arrayList.get(i11);
            r00 r00Var = q00Var.l;
            byte b10 = q00Var.a;
            Paint[] paintArr = s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(q00Var.g, q00Var.h, AndroidUtilities.dp(q00Var.d), paintArr[q00Var.b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = r00Var.a;
                    f10 = 16.0f;
                    rectF.set(q00Var.g - AndroidUtilities.dp(q00Var.d), q00Var.h - AndroidUtilities.dp(2.0f), q00Var.g + AndroidUtilities.dp(q00Var.d), q00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(q00Var.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[q00Var.b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = w;
                        Drawable drawable = drawableArr != null ? drawableArr[q00Var.b] : null;
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[q00Var.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) q00Var.g;
                            int i13 = (int) q00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(q00Var.i, q00Var.g, q00Var.h);
                            float f11 = q00Var.d / 6.0f;
                            canvas.scale(f11, f11, q00Var.g, q00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            r00 r00Var2 = q00Var.l;
            float f12 = i10 / f10;
            float f13 = q00Var.g;
            float f14 = q00Var.j;
            q00Var.g = (f14 * f12) + f13;
            q00Var.h = (q00Var.k * f12) + q00Var.h;
            if (q00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (q00Var.e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(dp, f12, 0.05f, q00Var.j);
                    q00Var.j = x10;
                    if (x10 >= dp) {
                        q00Var.e = (byte) 2;
                    }
                } else {
                    float f15 = q00Var.j - ((dp * f12) * 0.05f);
                    q00Var.j = f15;
                    if (f15 <= (-dp)) {
                        q00Var.e = (byte) 1;
                    }
                }
            } else if (q00Var.c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    q00Var.j = f16;
                    if (f16 <= 0.0f) {
                        q00Var.j = 0.0f;
                        q00Var.e = q00Var.f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                q00Var.j = f17;
                if (f17 >= 0.0f) {
                    q00Var.j = 0.0f;
                    q00Var.e = q00Var.f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = q00Var.k;
            boolean z10 = f19 < f18;
            if (f19 > f18) {
                q00Var.k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * r00Var2.e) + f19;
            } else {
                q00Var.k = a4.a.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && q00Var.k > f18) {
                r00Var2.f++;
            }
            byte b11 = q00Var.a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + q00Var.i);
                q00Var.i = s10;
                if (s10 > 360) {
                    q00Var.i = (short) (s10 - 360);
                }
            }
            if (q00Var.h >= r00Var2.getHeightForAnimation()) {
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
            float c10 = org.telegram.messenger.vl.c(i10, 16.0f, 0.15f, this.e);
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
        AndroidUtilities.runOnUIThread(new wp(this, 18));
        b();
    }

    public void b() {
    }
}
