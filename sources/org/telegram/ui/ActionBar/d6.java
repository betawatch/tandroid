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
import ci.v6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.kz;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.la0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d6 implements cs {
    public static d6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z10) {
        ArrayList arrayList;
        if (c == null || z10) {
            ArrayList arrayList2 = null;
            int i3 = 0;
            while (i3 < 5) {
                j6 j6Var = (j6) k6.H.get(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (j6Var != null && (arrayList = j6Var.c0) != null && !arrayList.isEmpty()) {
                    int size = j6Var.c0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        g6 g6Var = (g6) j6Var.c0.get(i10);
                        if (g6Var.a != k6.n && !TextUtils.isEmpty(g6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(g6Var);
                        }
                    }
                }
                i3++;
            }
            d6 d6Var = new d6();
            d6Var.a = h10.t0;
            if (arrayList2 != null) {
                Utilities.e.c(new org.telegram.messenger.voip.l0(7, d6Var, arrayList2));
            }
            c = d6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, g6 g6Var) {
        Bitmap bitmap2;
        int V0;
        int i3;
        int i10;
        int i11;
        try {
            File e10 = g6Var.e();
            Drawable drawable = null;
            if (e10 == null) {
                return null;
            }
            j6 j6Var = g6Var.b;
            SparseIntArray T0 = k6.T0(null, j6Var.d, null);
            k6.H(T0, j6Var);
            int i12 = g6Var.c;
            int i13 = (int) g6Var.j;
            long j10 = g6Var.k;
            int i14 = (int) j10;
            if (i14 == 0 && j10 == 0) {
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
            long j11 = g6Var.l;
            int i16 = (int) j11;
            if (i16 == 0 && j11 == 0 && (i11 = T0.get(k6.De)) != 0) {
                i16 = k6.C(j6Var, i12, i11);
            }
            long j12 = g6Var.m;
            int i17 = (int) j12;
            if (i17 == 0 && j12 == 0 && (i10 = T0.get(k6.Ee)) != 0) {
                i17 = k6.C(j6Var, i12, i10);
            }
            if (i13 == 0 && (i3 = T0.get(k6.Be)) != 0) {
                i13 = k6.C(j6Var, i12, i3);
            }
            if (i16 != 0) {
                V0 = la0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable j9Var = new j9(j9.d(g6Var.n), new int[]{i13, i14});
                V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i13, i14), false);
                drawable = j9Var;
            } else {
                drawable = new ColorDrawable(i13);
                V0 = org.telegram.messenger.g0.V0(i13, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.g0.q;
                bitmap2 = z10 ? kz.f(file, Math.min(point.x, point.y), Math.max(point.x, point.y), 2) : k6.n1(new FileInputStream(file), 0);
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
                paint.setAlpha((int) (Math.abs(g6Var.p) * 255.0f));
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

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        HashMap hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        boolean z10 = false;
        if (i3 == hs.Y1) {
            c6 c6Var = (c6) hashMap.remove((String) objArr[0]);
            if (c6Var != null) {
                Utilities.e.c(new org.telegram.messenger.voip.l0(8, this, c6Var));
                return;
            }
            return;
        }
        if (i3 != hs.Z1 || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new v6(this, (Object) null, z10, 13));
    }
}
