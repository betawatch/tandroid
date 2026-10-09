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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class h10 extends View {
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

    public h10(Context context) {
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0005, B:6:0x0015, B:7:0x004e, B:11:0x006b, B:14:0x008b, B:17:0x00bf, B:19:0x00d8, B:20:0x00e5, B:23:0x00ec, B:26:0x00dd, B:27:0x0078, B:28:0x0027, B:30:0x002b, B:32:0x0033, B:33:0x0042), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0005, B:6:0x0015, B:7:0x004e, B:11:0x006b, B:14:0x008b, B:17:0x00bf, B:19:0x00d8, B:20:0x00e5, B:23:0x00ec, B:26:0x00dd, B:27:0x0078, B:28:0x0027, B:30:0x002b, B:32:0x0033, B:33:0x0042), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g10 a(boolean z10) {
        g10 g10Var = new g10(this);
        try {
            byte nextInt = (byte) Utilities.random.nextInt(2);
            g10Var.a = nextInt;
            if (this.h && nextInt == 0) {
                g10Var.a = (byte) 2;
                g10Var.b = (byte) Utilities.random.nextInt(F.length);
            } else if (this.n && Utilities.random.nextBoolean()) {
                g10Var.a = (byte) 2;
                g10Var.b = (byte) Utilities.random.nextInt(G.length);
            } else {
                g10Var.b = (byte) Utilities.random.nextInt(E.length);
            }
            g10Var.c = (byte) Utilities.random.nextInt(2);
            g10Var.f = (byte) (Utilities.random.nextInt(2) + 1);
            byte b10 = g10Var.a;
            if (b10 != 0 && b10 != 2) {
                g10Var.d = (byte) ((Utilities.random.nextFloat() * 4.0f) + 4.0f);
                if (!z10) {
                    g10Var.h = (-Utilities.random.nextFloat()) * getHeightForAnimation() * 1.2f;
                    g10Var.g = AndroidUtilities.dp(5.0f) + Utilities.random.nextInt(Math.max(1, getWidthForAnimation() - AndroidUtilities.dp(10.0f)));
                    g10Var.e = g10Var.f;
                    return g10Var;
                }
                int dp = AndroidUtilities.dp(Utilities.random.nextInt(10) + 4);
                int heightForAnimation = getHeightForAnimation() / 4;
                if (g10Var.c == 0) {
                    g10Var.g = -dp;
                } else {
                    g10Var.g = getWidthForAnimation() + dp;
                }
                g10Var.j = com.google.android.gms.internal.vision.e2.A(Utilities.random.nextFloat(), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.2f), g10Var.c == 0 ? 1 : -1);
                g10Var.k = -((Utilities.random.nextFloat() * AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f));
                g10Var.h = (heightForAnimation / 2) + Utilities.random.nextInt(Math.max(1, heightForAnimation * 2));
                return g10Var;
            }
            g10Var.d = (byte) ((Utilities.random.nextFloat() * 2.0f) + 4.0f);
            if (!z10) {
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            return g10Var;
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
            g10 g10Var = (g10) arrayList.get(i11);
            h10 h10Var = g10Var.l;
            byte b10 = g10Var.a;
            Paint[] paintArr = s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(g10Var.g, g10Var.h, AndroidUtilities.dp(g10Var.d), paintArr[g10Var.b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = h10Var.a;
                    f10 = 16.0f;
                    rectF.set(g10Var.g - AndroidUtilities.dp(g10Var.d), g10Var.h - AndroidUtilities.dp(2.0f), g10Var.g + AndroidUtilities.dp(g10Var.d), g10Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(g10Var.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[g10Var.b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = w;
                        Drawable drawable = drawableArr != null ? drawableArr[g10Var.b] : null;
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[g10Var.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) g10Var.g;
                            int i13 = (int) g10Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(g10Var.i, g10Var.g, g10Var.h);
                            float f11 = g10Var.d / 6.0f;
                            canvas.scale(f11, f11, g10Var.g, g10Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            h10 h10Var2 = g10Var.l;
            float f12 = i10 / f10;
            float f13 = g10Var.g;
            float f14 = g10Var.j;
            g10Var.g = (f14 * f12) + f13;
            g10Var.h = (g10Var.k * f12) + g10Var.h;
            if (g10Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (g10Var.e == 1) {
                    float w10 = com.google.android.gms.internal.vision.e2.w(dp, f12, 0.05f, g10Var.j);
                    g10Var.j = w10;
                    if (w10 >= dp) {
                        g10Var.e = (byte) 2;
                    }
                } else {
                    float f15 = g10Var.j - ((dp * f12) * 0.05f);
                    g10Var.j = f15;
                    if (f15 <= (-dp)) {
                        g10Var.e = (byte) 1;
                    }
                }
            } else if (g10Var.c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    g10Var.j = f16;
                    if (f16 <= 0.0f) {
                        g10Var.j = 0.0f;
                        g10Var.e = g10Var.f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                g10Var.j = f17;
                if (f17 >= 0.0f) {
                    g10Var.j = 0.0f;
                    g10Var.e = g10Var.f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = g10Var.k;
            boolean z10 = f19 < f18;
            if (f19 > f18) {
                g10Var.k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * h10Var2.e) + f19;
            } else {
                g10Var.k = a1.g.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && g10Var.k > f18) {
                h10Var2.f++;
            }
            byte b11 = g10Var.a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + g10Var.i);
                g10Var.i = s10;
                if (s10 > 360) {
                    g10Var.i = (short) (s10 - 360);
                }
            }
            if (g10Var.h >= h10Var2.getHeightForAnimation()) {
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
            float b12 = org.telegram.messenger.bi.b(i10, 16.0f, 0.15f, this.e);
            this.e = b12;
            if (b12 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.c = false;
        AndroidUtilities.runOnUIThread(new nq(this, 18));
        b();
    }

    public void b() {
    }
}
