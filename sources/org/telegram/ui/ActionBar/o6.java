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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d00;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.jb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o6 implements us {
    public static o6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z10) {
        ArrayList arrayList;
        if (c == null || z10) {
            ArrayList arrayList2 = null;
            int i10 = 0;
            while (i10 < 5) {
                s6 s6Var = (s6) t6.H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (s6Var != null && (arrayList = s6Var.b0) != null && !arrayList.isEmpty()) {
                    int size = s6Var.b0.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        r6 r6Var = (r6) s6Var.b0.get(i11);
                        if (r6Var.a != t6.n && !TextUtils.isEmpty(r6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(r6Var);
                        }
                    }
                }
                i10++;
            }
            o6 o6Var = new o6();
            o6Var.a = d20.s0;
            if (arrayList2 != null) {
                Utilities.e.c(new mh.k(26, o6Var, arrayList2));
            }
            c = o6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, r6 r6Var) {
        Bitmap bitmap2;
        int V0;
        int i10;
        int i11;
        int i12;
        try {
            File e = r6Var.e();
            Drawable drawable = null;
            if (e == null) {
                return null;
            }
            s6 s6Var = r6Var.b;
            SparseIntArray T0 = t6.T0(null, s6Var.d, null);
            t6.H(T0, s6Var);
            int i13 = r6Var.c;
            int i14 = (int) r6Var.j;
            long j10 = r6Var.k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = T0.get(t6.Ce);
                if (i16 != 0) {
                    i15 = t6.C(s6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = r6Var.l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = T0.get(t6.De)) != 0) {
                i17 = t6.C(s6Var, i13, i12);
            }
            long j12 = r6Var.m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i11 = T0.get(t6.Ee)) != 0) {
                i18 = t6.C(s6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = T0.get(t6.Be)) != 0) {
                i14 = t6.C(s6Var, i13, i10);
            }
            if (i17 != 0) {
                V0 = jb0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable f9Var = new f9(f9.d(r6Var.n), new int[]{i14, i15});
                V0 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(i14, i15), false);
                drawable = f9Var;
            } else {
                drawable = new ColorDrawable(i14);
                V0 = org.telegram.messenger.i0.V0(i14, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.i0.q;
                bitmap2 = z10 ? d00.f(file, Math.min(point.x, point.y), Math.max(point.x, point.y), 2) : t6.n1(new FileInputStream(file), 0);
            } else {
                bitmap2 = bitmap;
            }
            try {
                if (drawable == null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(e);
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
                paint.setAlpha((int) (Math.abs(r6Var.p) * 255.0f));
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(e));
                return bitmap2;
            } catch (Throwable th2) {
                th = th2;
                f8.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        HashMap hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        boolean z10 = false;
        if (i10 == zs.Y1) {
            n6 n6Var = (n6) hashMap.remove((String) objArr[0]);
            if (n6Var != null) {
                Utilities.e.c(new mh.k(27, this, n6Var));
                return;
            }
            return;
        }
        if (i10 != zs.Z1 || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        org.telegram.messenger.i0.g3(new ag.j0(this, (Object) null, z10, 10));
    }
}
