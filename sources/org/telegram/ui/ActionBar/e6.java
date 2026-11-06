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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.sz;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.qa0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e6 implements ls {
    public static e6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z9) {
        ArrayList arrayList;
        if (c == null || z9) {
            ArrayList arrayList2 = null;
            int i7 = 0;
            while (i7 < 5) {
                j6 j6Var = (j6) k6.H.get(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (j6Var != null && (arrayList = j6Var.b0) != null && !arrayList.isEmpty()) {
                    int size = j6Var.b0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        h6 h6Var = (h6) j6Var.b0.get(i10);
                        if (h6Var.a != k6.n && !TextUtils.isEmpty(h6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(h6Var);
                        }
                    }
                }
                i7++;
            }
            e6 e6Var = new e6();
            e6Var.a = p10.s0;
            if (arrayList2 != null) {
                Utilities.e.c(new p(2, e6Var, arrayList2));
            }
            c = e6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z9, File file, h6 h6Var) {
        Bitmap bitmap2;
        int V0;
        int i7;
        int i10;
        int i11;
        try {
            File e10 = h6Var.e();
            Drawable drawable = null;
            if (e10 == null) {
                return null;
            }
            j6 j6Var = h6Var.b;
            SparseIntArray T0 = k6.T0(null, j6Var.d, null);
            k6.H(T0, j6Var);
            int i12 = h6Var.c;
            int i13 = (int) h6Var.j;
            long j3 = h6Var.k;
            int i14 = (int) j3;
            if (i14 == 0 && j3 == 0) {
                if (i13 != 0) {
                    i12 = i13;
                }
                int i15 = T0.get(k6.Ce);
                if (i15 != 0) {
                    i14 = k6.C(j6Var, i12, i15);
                }
            } else {
                i12 = 0;
            }
            long j10 = h6Var.l;
            int i16 = (int) j10;
            if (i16 == 0 && j10 == 0 && (i11 = T0.get(k6.De)) != 0) {
                i16 = k6.C(j6Var, i12, i11);
            }
            long j11 = h6Var.m;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i10 = T0.get(k6.Ee)) != 0) {
                i17 = k6.C(j6Var, i12, i10);
            }
            if (i13 == 0 && (i7 = T0.get(k6.Be)) != 0) {
                i13 = k6.C(j6Var, i12, i7);
            }
            if (i16 != 0) {
                V0 = qa0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable k9Var = new k9(k9.d(h6Var.n), new int[]{i13, i14});
                V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i13, i14), false);
                drawable = k9Var;
            } else {
                drawable = new ColorDrawable(i13);
                V0 = org.telegram.messenger.g0.V0(i13, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.g0.q;
                bitmap2 = z9 ? sz.f(file, Math.min(point.x, point.y), Math.max(point.x, point.y), 2) : k6.n1(new FileInputStream(file), 0);
            } else {
                bitmap2 = bitmap;
            }
            try {
                if (drawable == null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(e10);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return bitmap2;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                drawable.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(V0, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) (Math.abs(h6Var.p) * 255.0f));
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(e10));
                return bitmap2;
            } catch (Throwable th2) {
                th = th2;
                a8.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        HashMap hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        boolean z9 = false;
        if (i7 == qs.Y1) {
            d6 d6Var = (d6) hashMap.remove((String) objArr[0]);
            if (d6Var != null) {
                Utilities.e.c(new p(3, this, d6Var));
                return;
            }
            return;
        }
        if (i7 != qs.Z1 || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new u7(this, (Object) null, z9, 13));
    }
}
