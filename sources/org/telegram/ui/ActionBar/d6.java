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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d6 implements NotificationCenter.NotificationCenterDelegate {
    public static d6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z10) {
        ArrayList arrayList;
        if (c == null || z10) {
            ArrayList arrayList2 = null;
            int i10 = 0;
            while (i10 < 5) {
                h6 h6Var = (h6) i6.H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (h6Var != null && (arrayList = h6Var.b0) != null && !arrayList.isEmpty()) {
                    int size = h6Var.b0.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        g6 g6Var = (g6) h6Var.b0.get(i11);
                        if (g6Var.a != i6.n && !TextUtils.isEmpty(g6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(g6Var);
                        }
                    }
                }
                i10++;
            }
            d6 d6Var = new d6();
            d6Var.a = UserConfig.selectedAccount;
            if (arrayList2 != null) {
                Utilities.globalQueue.postRunnable(new m4.g0(24, d6Var, arrayList2));
            }
            c = d6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, g6 g6Var) {
        Bitmap bitmap2;
        int patternColor;
        int i10;
        int i11;
        int i12;
        try {
            File d = g6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            h6 h6Var = g6Var.b;
            SparseIntArray Q0 = i6.Q0(null, h6Var.d, null);
            i6.G(Q0, h6Var);
            int i13 = g6Var.c;
            int i14 = (int) g6Var.j;
            long j3 = g6Var.k;
            int i15 = (int) j3;
            if (i15 == 0 && j3 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = Q0.get(i6.Od);
                if (i16 != 0) {
                    i15 = i6.B(h6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j10 = g6Var.l;
            int i17 = (int) j10;
            if (i17 == 0 && j10 == 0 && (i12 = Q0.get(i6.Pd)) != 0) {
                i17 = i6.B(h6Var, i13, i12);
            }
            long j11 = g6Var.m;
            int i18 = (int) j11;
            if (i18 == 0 && j11 == 0 && (i11 = Q0.get(i6.Qd)) != 0) {
                i18 = i6.B(h6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = Q0.get(i6.Nd)) != 0) {
                i14 = i6.B(h6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = cc0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable t9Var = new t9(t9.d(g6Var.n), new int[]{i14, i15});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i14, i15));
                drawable = t9Var;
            } else {
                drawable = new ColorDrawable(i14);
                patternColor = AndroidUtilities.getPatternColor(i14);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                bitmap2 = z10 ? SvgHelper.getBitmap(file, min, Math.max(point2.x, point2.y), false, SvgHelper.ScaleMode.ByWidth) : i6.i1(new FileInputStream(file), 0);
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
                paint.setAlpha((int) (Math.abs(g6Var.p) * 255.0f));
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
            c6 c6Var = (c6) hashMap.remove((String) objArr[0]);
            if (c6Var != null) {
                Utilities.globalQueue.postRunnable(new m4.g0(25, this, c6Var));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadFailed || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ci.y0(this, (Object) null, z10, 10));
    }
}
