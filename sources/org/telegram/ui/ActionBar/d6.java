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
import org.telegram.messenger.a8;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.qz;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d6 implements is {
    public static d6 c;
    public int a;
    public HashMap b;

    public static void a(boolean z10) {
        ArrayList arrayList;
        if (c == null || z10) {
            ArrayList arrayList2 = null;
            int i7 = 0;
            while (i7 < 5) {
                i6 i6Var = (i6) j6.H.get(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (i6Var != null && (arrayList = i6Var.c0) != null && !arrayList.isEmpty()) {
                    int size = i6Var.c0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        g6 g6Var = (g6) i6Var.c0.get(i10);
                        if (g6Var.a != j6.n && !TextUtils.isEmpty(g6Var.o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(g6Var);
                        }
                    }
                }
                i7++;
            }
            d6 d6Var = new d6();
            d6Var.a = m10.t0;
            if (arrayList2 != null) {
                Utilities.e.c(new oi.u4(21, d6Var, arrayList2));
            }
            c = d6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, g6 g6Var) {
        Bitmap bitmap2;
        int V0;
        int i7;
        int i10;
        int i11;
        try {
            File e10 = g6Var.e();
            Drawable drawable = null;
            if (e10 == null) {
                return null;
            }
            i6 i6Var = g6Var.b;
            SparseIntArray T0 = j6.T0(null, i6Var.d, null);
            j6.H(T0, i6Var);
            int i12 = g6Var.c;
            int i13 = (int) g6Var.j;
            long j3 = g6Var.k;
            int i14 = (int) j3;
            if (i14 == 0 && j3 == 0) {
                if (i13 != 0) {
                    i12 = i13;
                }
                int i15 = T0.get(j6.Fe);
                if (i15 != 0) {
                    i14 = j6.C(i6Var, i12, i15);
                }
            } else {
                i12 = 0;
            }
            long j10 = g6Var.l;
            int i16 = (int) j10;
            if (i16 == 0 && j10 == 0 && (i11 = T0.get(j6.Ge)) != 0) {
                i16 = j6.C(i6Var, i12, i11);
            }
            long j11 = g6Var.m;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i10 = T0.get(j6.He)) != 0) {
                i17 = j6.C(i6Var, i12, i10);
            }
            if (i13 == 0 && (i7 = T0.get(j6.Ee)) != 0) {
                i13 = j6.C(i6Var, i12, i7);
            }
            if (i16 != 0) {
                V0 = ra0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable h9Var = new h9(h9.d(g6Var.n), new int[]{i13, i14});
                V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i13, i14), false);
                drawable = h9Var;
            } else {
                drawable = new ColorDrawable(i13);
                V0 = org.telegram.messenger.g0.V0(i13, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.g0.q;
                bitmap2 = z10 ? qz.f(file, Math.min(point.x, point.y), Math.max(point.x, point.y), 2) : j6.n1(new FileInputStream(file), 0);
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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        HashMap hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        boolean z10 = false;
        if (i7 == ns.Y1) {
            c6 c6Var = (c6) hashMap.remove((String) objArr[0]);
            if (c6Var != null) {
                Utilities.e.c(new oi.u4(22, this, c6Var));
                return;
            }
            return;
        }
        if (i7 != ns.Z1 || hashMap.remove((String) objArr[0]) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new di.m6(this, (Object) null, z10, 13));
    }
}
