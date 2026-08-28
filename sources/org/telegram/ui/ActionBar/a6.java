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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.n9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a6 implements NotificationCenter.NotificationCenterDelegate {
    public static a6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z10) {
        ArrayList arrayList;
        if (c == null || z10) {
            ArrayList arrayList2 = null;
            int i9 = 0;
            while (i9 < 5) {
                e6 e6Var = (e6) f6.H.get(i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (e6Var != null && (arrayList = e6Var.X) != null && !arrayList.isEmpty()) {
                    int size = e6Var.X.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        d6 d6Var = (d6) e6Var.X.get(i10);
                        if (d6Var.a != f6.n && !TextUtils.isEmpty(d6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(d6Var);
                        }
                    }
                }
                i9++;
            }
            a6 a6Var = new a6();
            a6Var.a = UserConfig.selectedAccount;
            if (arrayList2 != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(6, a6Var, arrayList2));
            }
            c = a6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, d6 d6Var) {
        Bitmap bitmap2;
        int patternColor;
        int i9;
        int i10;
        int i11;
        try {
            File d = d6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            e6 e6Var = d6Var.b;
            SparseIntArray Q0 = f6.Q0(null, e6Var.d, null);
            f6.G(Q0, e6Var);
            int i12 = d6Var.c;
            int i13 = (int) d6Var.j;
            long j10 = d6Var.k;
            int i14 = (int) j10;
            if (i14 == 0 && j10 == 0) {
                if (i13 != 0) {
                    i12 = i13;
                }
                int i15 = Q0.get(f6.Od);
                if (i15 != 0) {
                    i14 = f6.B(e6Var, i12, i15);
                }
            } else {
                i12 = 0;
            }
            long j11 = d6Var.l;
            int i16 = (int) j11;
            if (i16 == 0 && j11 == 0 && (i11 = Q0.get(f6.Pd)) != 0) {
                i16 = f6.B(e6Var, i12, i11);
            }
            long j12 = d6Var.m;
            int i17 = (int) j12;
            if (i17 == 0 && j12 == 0 && (i10 = Q0.get(f6.Qd)) != 0) {
                i17 = f6.B(e6Var, i12, i10);
            }
            if (i13 == 0 && (i9 = Q0.get(f6.Nd)) != 0) {
                i13 = f6.B(e6Var, i12, i9);
            }
            if (i16 != 0) {
                patternColor = jb0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable n9Var = new n9(n9.d(d6Var.n), new int[]{i13, i14});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i13, i14));
                drawable = n9Var;
            } else {
                drawable = new ColorDrawable(i13);
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                bitmap2 = z10 ? SvgHelper.getBitmap(file, min, Math.max(point2.x, point2.y), false, SvgHelper.ScaleMode.ByWidth) : f6.i1(new FileInputStream(file), 0);
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
                paint.setAlpha((int) (Math.abs(d6Var.p) * 255.0f));
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(d));
                return bitmap2;
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap2 = bitmap;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        HashMap hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        boolean z10 = false;
        if (i9 == NotificationCenter.fileLoaded) {
            z5 z5Var = (z5) hashMap.remove((String) objArr[0]);
            if (z5Var != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(7, this, z5Var));
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.fileLoadFailed || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gh.u5(this, (Object) null, z10, 8));
    }
}
