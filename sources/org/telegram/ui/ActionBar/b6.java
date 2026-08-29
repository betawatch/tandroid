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
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b6 implements NotificationCenter.NotificationCenterDelegate {
    public static b6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z10) {
        ArrayList arrayList;
        if (c == null || z10) {
            ArrayList arrayList2 = null;
            int i10 = 0;
            while (i10 < 5) {
                f6 f6Var = (f6) g6.H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (f6Var != null && (arrayList = f6Var.X) != null && !arrayList.isEmpty()) {
                    int size = f6Var.X.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        e6 e6Var = (e6) f6Var.X.get(i11);
                        if (e6Var.a != g6.n && !TextUtils.isEmpty(e6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(e6Var);
                        }
                    }
                }
                i10++;
            }
            b6 b6Var = new b6();
            b6Var.a = UserConfig.selectedAccount;
            if (arrayList2 != null) {
                Utilities.globalQueue.postRunnable(new c(3, b6Var, arrayList2));
            }
            c = b6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, e6 e6Var) {
        Bitmap bitmap2;
        int patternColor;
        int i10;
        int i11;
        int i12;
        try {
            File d = e6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            f6 f6Var = e6Var.b;
            SparseIntArray Q0 = g6.Q0(null, f6Var.d, null);
            g6.G(Q0, f6Var);
            int i13 = e6Var.c;
            int i14 = (int) e6Var.j;
            long j10 = e6Var.k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = Q0.get(g6.Od);
                if (i16 != 0) {
                    i15 = g6.B(f6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = e6Var.l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = Q0.get(g6.Pd)) != 0) {
                i17 = g6.B(f6Var, i13, i12);
            }
            long j12 = e6Var.m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i11 = Q0.get(g6.Qd)) != 0) {
                i18 = g6.B(f6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = Q0.get(g6.Nd)) != 0) {
                i14 = g6.B(f6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = yb0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable s9Var = new s9(s9.d(e6Var.n), new int[]{i14, i15});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i14, i15));
                drawable = s9Var;
            } else {
                drawable = new ColorDrawable(i14);
                patternColor = AndroidUtilities.getPatternColor(i14);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                bitmap2 = z10 ? SvgHelper.getBitmap(file, min, Math.max(point2.x, point2.y), false, SvgHelper.ScaleMode.ByWidth) : g6.i1(new FileInputStream(file), 0);
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
                paint.setAlpha((int) (Math.abs(e6Var.p) * 255.0f));
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
            a6 a6Var = (a6) hashMap.remove((String) objArr[0]);
            if (a6Var != null) {
                Utilities.globalQueue.postRunnable(new c(4, this, a6Var));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadFailed || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new jh.r5(this, (Object) null, z10, 8));
    }
}
