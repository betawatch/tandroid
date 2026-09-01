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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f6 implements NotificationCenter.NotificationCenterDelegate {
    public static f6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z4) {
        ArrayList arrayList;
        if (c == null || z4) {
            ArrayList arrayList2 = null;
            int i10 = 0;
            while (i10 < 5) {
                j6 j6Var = (j6) k6.H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (j6Var != null && (arrayList = j6Var.Y) != null && !arrayList.isEmpty()) {
                    int size = j6Var.Y.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        i6 i6Var = (i6) j6Var.Y.get(i11);
                        if (i6Var.a != k6.n && !TextUtils.isEmpty(i6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(i6Var);
                        }
                    }
                }
                i10++;
            }
            f6 f6Var = new f6();
            f6Var.a = UserConfig.selectedAccount;
            if (arrayList2 != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.h(11, f6Var, arrayList2));
            }
            c = f6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z4, File file, i6 i6Var) {
        Bitmap bitmap2;
        int patternColor;
        int i10;
        int i11;
        int i12;
        try {
            File d = i6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            j6 j6Var = i6Var.b;
            SparseIntArray Q0 = k6.Q0(null, j6Var.d, null);
            k6.G(Q0, j6Var);
            int i13 = i6Var.c;
            int i14 = (int) i6Var.j;
            long j10 = i6Var.k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = Q0.get(k6.Od);
                if (i16 != 0) {
                    i15 = k6.B(j6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = i6Var.l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = Q0.get(k6.Pd)) != 0) {
                i17 = k6.B(j6Var, i13, i12);
            }
            long j12 = i6Var.m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i11 = Q0.get(k6.Qd)) != 0) {
                i18 = k6.B(j6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = Q0.get(k6.Nd)) != 0) {
                i14 = k6.B(j6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = fc0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable o9Var = new o9(o9.d(i6Var.n), new int[]{i14, i15});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i14, i15));
                drawable = o9Var;
            } else {
                drawable = new ColorDrawable(i14);
                patternColor = AndroidUtilities.getPatternColor(i14);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                bitmap2 = z4 ? SvgHelper.getBitmap(file, min, Math.max(point2.x, point2.y), false, SvgHelper.ScaleMode.ByWidth) : k6.i1(new FileInputStream(file), 0);
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
                paint.setAlpha((int) (Math.abs(i6Var.p) * 255.0f));
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
        boolean z4 = false;
        if (i10 == NotificationCenter.fileLoaded) {
            e6 e6Var = (e6) hashMap.remove((String) objArr[0]);
            if (e6Var != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.h(12, this, e6Var));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadFailed || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new mh.r5(this, (Object) null, z4, 6));
    }
}
