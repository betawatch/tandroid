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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e6 implements NotificationCenter.NotificationCenterDelegate {
    public static e6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z4) {
        ArrayList arrayList;
        if (c == null || z4) {
            ArrayList arrayList2 = null;
            int i10 = 0;
            while (i10 < 5) {
                i6 i6Var = (i6) j6.H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (i6Var != null && (arrayList = i6Var.Y) != null && !arrayList.isEmpty()) {
                    int size = i6Var.Y.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        h6 h6Var = (h6) i6Var.Y.get(i11);
                        if (h6Var.a != j6.n && !TextUtils.isEmpty(h6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(h6Var);
                        }
                    }
                }
                i10++;
            }
            e6 e6Var = new e6();
            e6Var.a = UserConfig.selectedAccount;
            if (arrayList2 != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.h(11, e6Var, arrayList2));
            }
            c = e6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z4, File file, h6 h6Var) {
        Bitmap bitmap2;
        int patternColor;
        int i10;
        int i11;
        int i12;
        try {
            File d = h6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            i6 i6Var = h6Var.b;
            SparseIntArray Q0 = j6.Q0(null, i6Var.d, null);
            j6.G(Q0, i6Var);
            int i13 = h6Var.c;
            int i14 = (int) h6Var.j;
            long j10 = h6Var.k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = Q0.get(j6.Od);
                if (i16 != 0) {
                    i15 = j6.B(i6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = h6Var.l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = Q0.get(j6.Pd)) != 0) {
                i17 = j6.B(i6Var, i13, i12);
            }
            long j12 = h6Var.m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i11 = Q0.get(j6.Qd)) != 0) {
                i18 = j6.B(i6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = Q0.get(j6.Nd)) != 0) {
                i14 = j6.B(i6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = ec0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable o9Var = new o9(o9.d(h6Var.n), new int[]{i14, i15});
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
                bitmap2 = z4 ? SvgHelper.getBitmap(file, min, Math.max(point2.x, point2.y), false, SvgHelper.ScaleMode.ByWidth) : j6.i1(new FileInputStream(file), 0);
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
                paint.setAlpha((int) (Math.abs(h6Var.p) * 255.0f));
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
            d6 d6Var = (d6) hashMap.remove((String) objArr[0]);
            if (d6Var != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.h(12, this, d6Var));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadFailed || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new lh.r5(this, (Object) null, z4, 6));
    }
}
