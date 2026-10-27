package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import bi.u7;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t6 implements NotificationCenter.NotificationCenterDelegate {
    public static t6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z10) {
        ArrayList arrayList;
        if (c == null || z10) {
            ArrayList arrayList2 = null;
            int i10 = 0;
            while (i10 < 5) {
                x6 x6Var = (x6) y6.H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (x6Var != null && (arrayList = x6Var.b0) != null && !arrayList.isEmpty()) {
                    int size = x6Var.b0.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        w6 w6Var = (w6) x6Var.b0.get(i11);
                        if (w6Var.a != y6.n && !TextUtils.isEmpty(w6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(w6Var);
                        }
                    }
                }
                i10++;
            }
            t6 t6Var = new t6();
            t6Var.a = UserConfig.selectedAccount;
            if (arrayList2 != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.m0(7, t6Var, arrayList2));
            }
            c = t6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, w6 w6Var) {
        Bitmap bitmap2;
        int patternColor;
        int i10;
        int i11;
        int i12;
        try {
            File d = w6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            x6 x6Var = w6Var.b;
            SparseIntArray S0 = y6.S0(null, x6Var.d, null);
            y6.G(S0, x6Var);
            int i13 = w6Var.c;
            int i14 = (int) w6Var.j;
            long j10 = w6Var.k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = S0.get(y6.Od);
                if (i16 != 0) {
                    i15 = y6.B(x6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = w6Var.l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = S0.get(y6.Pd)) != 0) {
                i17 = y6.B(x6Var, i13, i12);
            }
            long j12 = w6Var.m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i11 = S0.get(y6.Qd)) != 0) {
                i18 = y6.B(x6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = S0.get(y6.Nd)) != 0) {
                i14 = y6.B(x6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = vc0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable x9Var = new x9(x9.d(w6Var.n), new int[]{i14, i15});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i14, i15));
                drawable = x9Var;
            } else {
                drawable = new ColorDrawable(i14);
                patternColor = AndroidUtilities.getPatternColor(i14);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                bitmap2 = z10 ? SvgHelper.getBitmap(file, min, Math.max(point2.x, point2.y), false, SvgHelper.ScaleMode.ByWidth) : y6.l1(new FileInputStream(file), 0);
            } else {
                bitmap2 = bitmap;
            }
            try {
                if (drawable == null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(d);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return bitmap2;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                drawable.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) (Math.abs(w6Var.p) * 255.0f));
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(d));
                return bitmap2;
            } catch (Throwable th2) {
                th = th2;
                FileLog.e(th);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        HashMap hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        boolean z10 = false;
        if (i10 == NotificationCenter.fileLoaded) {
            s6 s6Var = (s6) hashMap.remove((String) objArr[0]);
            if (s6Var != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.m0(8, this, s6Var));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadFailed || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new u7(this, (Object) null, z10, 13));
    }
}
