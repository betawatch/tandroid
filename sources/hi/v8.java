package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ec;
import org.telegram.messenger.fs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object r;

    public /* synthetic */ v8(ta taVar, v9 v9Var, int i7, int i10, d7 d7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.a = i11;
        this.b = taVar;
        this.c = v9Var;
        this.d = i7;
        this.e = i10;
        this.f = d7Var;
        this.h = z10;
        this.n = z11;
        this.r = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0100, code lost:
    
        if (r13.isRecycled() != false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0490 A[LOOP:2: B:153:0x048e->B:154:0x0490, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.telegram.messenger.ImageReceiver] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        l5 l5Var;
        File file;
        File file2;
        File file3;
        String str;
        boolean z11;
        File file4;
        final File file5;
        final File file6;
        final File file7;
        final File file8;
        int size;
        int i7;
        l5 l5Var2;
        String str2;
        tg.u0 p02;
        ?? r12;
        File file9;
        File file10;
        l5 l5Var3;
        int i10;
        int i11;
        d7 d7Var;
        File file11;
        int i12;
        l5 l5Var4;
        int i13;
        d7 d7Var2;
        int i14;
        File file12;
        File file13;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 0:
                ta taVar = (ta) this.b;
                l5 l5Var5 = (l5) this.c;
                final d7 d7Var3 = (d7) this.f;
                final ai.w0 w0Var = (ai.w0) this.r;
                int i15 = taVar.c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                l5Var5.q0(arrayList2, false, false, false, false, d7Var3);
                if (!d7Var3.K) {
                    d7Var3.S0 = Utilities.k(l5Var5.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = l5Var5.getMasks();
                final ArrayList arrayList3 = masks != null ? new ArrayList(masks) : null;
                boolean z12 = d7Var3.K;
                boolean E = d7Var3.E();
                arrayList2.clear();
                final Bitmap q02 = l5Var5.q0(arrayList2, true, false, false, !z12, d7Var3);
                ArrayList arrayList4 = arrayList2.isEmpty() ? null : arrayList2;
                final File w10 = d7.w(i15, "png");
                final int i16 = 0;
                arrayList.add(new Runnable() { // from class: hi.x8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                try {
                                    q02.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w10));
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            case 1:
                                Bitmap bitmap = q02;
                                try {
                                    try {
                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                                        if (bitmap.isRecycled()) {
                                            return;
                                        }
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                        if (bitmap.isRecycled()) {
                                            return;
                                        }
                                    }
                                    bitmap.recycle();
                                    return;
                                } catch (Throwable th2) {
                                    if (!bitmap.isRecycled()) {
                                        bitmap.recycle();
                                    }
                                    throw th2;
                                }
                            case 2:
                                Bitmap bitmap2 = q02;
                                try {
                                    try {
                                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                                    } catch (Exception e12) {
                                        org.telegram.messenger.a8.g(e12, true);
                                    }
                                    return;
                                } finally {
                                    org.telegram.messenger.g0.z2(bitmap2);
                                }
                            case 3:
                                try {
                                    q02.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w10));
                                    return;
                                } catch (Exception e13) {
                                    org.telegram.messenger.a8.g(e13, true);
                                    return;
                                }
                            default:
                                try {
                                    q02.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w10));
                                    return;
                                } catch (Exception e14) {
                                    org.telegram.messenger.a8.g(e14, true);
                                    return;
                                }
                        }
                    }
                });
                if (d7Var3.u) {
                    z10 = E;
                    long j3 = d7Var3.z0;
                    if (j3 != Long.MIN_VALUE) {
                        Drawable drawable = d7Var3.x0;
                        if (drawable == null) {
                            file = null;
                            drawable = w5.e(null, i15, j3, taVar.d2);
                        } else {
                            file = null;
                        }
                        if (drawable != null) {
                            final File w11 = d7.w(i15, "webp");
                            final Bitmap createBitmap = Bitmap.createBitmap(this.d, this.e, Bitmap.Config.ARGB_8888);
                            l5Var = l5Var5;
                            d7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            final int i17 = 1;
                            arrayList.add(new Runnable() { // from class: hi.x8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            try {
                                                createBitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w11));
                                                return;
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                                return;
                                            }
                                        case 1:
                                            Bitmap bitmap = createBitmap;
                                            try {
                                                try {
                                                    bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w11));
                                                    if (bitmap.isRecycled()) {
                                                        return;
                                                    }
                                                } catch (Exception e11) {
                                                    org.telegram.messenger.a8.g(e11, true);
                                                    if (bitmap.isRecycled()) {
                                                        return;
                                                    }
                                                }
                                                bitmap.recycle();
                                                return;
                                            } catch (Throwable th2) {
                                                if (!bitmap.isRecycled()) {
                                                    bitmap.recycle();
                                                }
                                                throw th2;
                                            }
                                        case 2:
                                            Bitmap bitmap2 = createBitmap;
                                            try {
                                                try {
                                                    bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w11));
                                                } catch (Exception e12) {
                                                    org.telegram.messenger.a8.g(e12, true);
                                                }
                                                return;
                                            } finally {
                                                org.telegram.messenger.g0.z2(bitmap2);
                                            }
                                        case 3:
                                            try {
                                                createBitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w11));
                                                return;
                                            } catch (Exception e13) {
                                                org.telegram.messenger.a8.g(e13, true);
                                                return;
                                            }
                                        default:
                                            try {
                                                createBitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w11));
                                                return;
                                            } catch (Exception e14) {
                                                org.telegram.messenger.a8.g(e14, true);
                                                return;
                                            }
                                    }
                                }
                            });
                            file9 = w11;
                        } else {
                            l5Var = l5Var5;
                            file9 = file;
                        }
                        file2 = file9;
                        if (d7Var3.u && d7Var3.K) {
                            int i18 = d7Var3.k0;
                            int i19 = d7Var3.l0;
                            p02 = l5Var.p0();
                            if (p02 != null) {
                                tg.p0 p0Var = p02.s0;
                                if (p0Var.getChildCount() == 1 && i18 > 0 && i19 > 0) {
                                    if (p0Var.getChildAt(0) instanceof org.telegram.ui.Cells.q1) {
                                        r12 = ((org.telegram.ui.Cells.q1) p0Var.getChildAt(0)).getPhotoImage();
                                        if (r12 != 0) {
                                            float f10 = r12.N0;
                                            if (((int) f10) > 0) {
                                                float f11 = r12.O0;
                                                file3 = file2;
                                                if (((int) f11) > 0) {
                                                    float f12 = i18;
                                                    float f13 = i19;
                                                    float max = Math.max(f10 / f12, f11 / f13);
                                                    int i20 = (int) ((f12 * max) / 2.0f);
                                                    int i21 = (int) ((f13 * max) / 2.0f);
                                                    final Bitmap createBitmap2 = Bitmap.createBitmap(i20, i21, Bitmap.Config.ARGB_8888);
                                                    float[] fArr = new float[8];
                                                    str = "png";
                                                    int i22 = 0;
                                                    while (true) {
                                                        int[] iArr = r12.X0;
                                                        z11 = z10;
                                                        if (i22 >= iArr.length) {
                                                            Canvas canvas = new Canvas(createBitmap2);
                                                            Path path = new Path();
                                                            canvas.scale(0.5f, 0.5f);
                                                            RectF rectF = org.telegram.messenger.g0.P;
                                                            float f14 = (i20 * 2.0f) / 2.0f;
                                                            float f15 = r12.N0 / 2.0f;
                                                            float f16 = (i21 * 2.0f) / 2.0f;
                                                            float f17 = r12.O0 / 2.0f;
                                                            file4 = w10;
                                                            rectF.set(f14 - f15, f16 - f17, f15 + f14, f17 + f16);
                                                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                                            Paint paint = new Paint(1);
                                                            paint.setColor(-1);
                                                            canvas.drawPath(path, paint);
                                                            final File w12 = d7.w(i15, "webp");
                                                            final int i23 = 2;
                                                            arrayList.add(new Runnable() { // from class: hi.x8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i23) {
                                                                        case 0:
                                                                            try {
                                                                                createBitmap2.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w12));
                                                                                return;
                                                                            } catch (Exception e10) {
                                                                                org.telegram.messenger.a8.g(e10, true);
                                                                                return;
                                                                            }
                                                                        case 1:
                                                                            Bitmap bitmap = createBitmap2;
                                                                            try {
                                                                                try {
                                                                                    bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w12));
                                                                                    if (bitmap.isRecycled()) {
                                                                                        return;
                                                                                    }
                                                                                } catch (Exception e11) {
                                                                                    org.telegram.messenger.a8.g(e11, true);
                                                                                    if (bitmap.isRecycled()) {
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                bitmap.recycle();
                                                                                return;
                                                                            } catch (Throwable th2) {
                                                                                if (!bitmap.isRecycled()) {
                                                                                    bitmap.recycle();
                                                                                }
                                                                                throw th2;
                                                                            }
                                                                        case 2:
                                                                            Bitmap bitmap2 = createBitmap2;
                                                                            try {
                                                                                try {
                                                                                    bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w12));
                                                                                } catch (Exception e12) {
                                                                                    org.telegram.messenger.a8.g(e12, true);
                                                                                }
                                                                                return;
                                                                            } finally {
                                                                                org.telegram.messenger.g0.z2(bitmap2);
                                                                            }
                                                                        case 3:
                                                                            try {
                                                                                createBitmap2.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w12));
                                                                                return;
                                                                            } catch (Exception e13) {
                                                                                org.telegram.messenger.a8.g(e13, true);
                                                                                return;
                                                                            }
                                                                        default:
                                                                            try {
                                                                                createBitmap2.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w12));
                                                                                return;
                                                                            } catch (Exception e14) {
                                                                                org.telegram.messenger.a8.g(e14, true);
                                                                                return;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            file5 = w12;
                                                            if (l5Var.r0()) {
                                                                file6 = d7Var3.R0;
                                                                file7 = d7Var3.Q0;
                                                            } else {
                                                                if (z11) {
                                                                    l5Var2 = l5Var;
                                                                    str2 = str;
                                                                    file6 = file;
                                                                } else {
                                                                    l5Var2 = l5Var;
                                                                    str2 = str;
                                                                    final Bitmap q03 = l5Var2.q0(new ArrayList(), false, true, false, false, d7Var3);
                                                                    file6 = d7.w(i15, str2);
                                                                    final int i24 = 3;
                                                                    arrayList.add(new Runnable() { // from class: hi.x8
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i24) {
                                                                                case 0:
                                                                                    try {
                                                                                        q03.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file6));
                                                                                        return;
                                                                                    } catch (Exception e10) {
                                                                                        org.telegram.messenger.a8.g(e10, true);
                                                                                        return;
                                                                                    }
                                                                                case 1:
                                                                                    Bitmap bitmap = q03;
                                                                                    try {
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file6));
                                                                                            if (bitmap.isRecycled()) {
                                                                                                return;
                                                                                            }
                                                                                        } catch (Exception e11) {
                                                                                            org.telegram.messenger.a8.g(e11, true);
                                                                                            if (bitmap.isRecycled()) {
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        bitmap.recycle();
                                                                                        return;
                                                                                    } catch (Throwable th2) {
                                                                                        if (!bitmap.isRecycled()) {
                                                                                            bitmap.recycle();
                                                                                        }
                                                                                        throw th2;
                                                                                    }
                                                                                case 2:
                                                                                    Bitmap bitmap2 = q03;
                                                                                    try {
                                                                                        try {
                                                                                            bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file6));
                                                                                        } catch (Exception e12) {
                                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                                        }
                                                                                        return;
                                                                                    } finally {
                                                                                        org.telegram.messenger.g0.z2(bitmap2);
                                                                                    }
                                                                                case 3:
                                                                                    try {
                                                                                        q03.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file6));
                                                                                        return;
                                                                                    } catch (Exception e13) {
                                                                                        org.telegram.messenger.a8.g(e13, true);
                                                                                        return;
                                                                                    }
                                                                                default:
                                                                                    try {
                                                                                        q03.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file6));
                                                                                        return;
                                                                                    } catch (Exception e14) {
                                                                                        org.telegram.messenger.a8.g(e14, true);
                                                                                        return;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                                if (!this.h) {
                                                                    file8 = file;
                                                                    final int i25 = 1;
                                                                    final boolean z13 = this.n;
                                                                    final ArrayList arrayList5 = arrayList4;
                                                                    final File file14 = file3;
                                                                    final File file15 = file6;
                                                                    final File file16 = file4;
                                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.w8
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i25) {
                                                                                case 0:
                                                                                    d7 d7Var4 = d7Var3;
                                                                                    s8 s8Var = (s8) w0Var;
                                                                                    try {
                                                                                        File file17 = d7Var4.P0;
                                                                                        if (file17 != null) {
                                                                                            file17.delete();
                                                                                        }
                                                                                    } catch (Exception unused) {
                                                                                    }
                                                                                    try {
                                                                                        File file18 = d7Var4.R0;
                                                                                        if (file18 != null) {
                                                                                            file18.delete();
                                                                                        }
                                                                                    } catch (Exception unused2) {
                                                                                    }
                                                                                    try {
                                                                                        File file19 = d7Var4.Q0;
                                                                                        if (file19 != null) {
                                                                                            file19.delete();
                                                                                        }
                                                                                    } catch (Exception unused3) {
                                                                                    }
                                                                                    d7Var4.P0 = null;
                                                                                    d7Var4.R0 = null;
                                                                                    d7Var4.Q0 = null;
                                                                                    File file20 = d7Var4.Y0;
                                                                                    if (file20 != null) {
                                                                                        try {
                                                                                            file20.delete();
                                                                                        } catch (Exception e10) {
                                                                                            org.telegram.messenger.a8.g(e10, true);
                                                                                        }
                                                                                        d7Var4.Y0 = null;
                                                                                    }
                                                                                    File file21 = d7Var4.X0;
                                                                                    if (file21 != null) {
                                                                                        try {
                                                                                            file21.delete();
                                                                                        } catch (Exception e11) {
                                                                                            org.telegram.messenger.a8.g(e11, true);
                                                                                        }
                                                                                        d7Var4.X0 = null;
                                                                                    }
                                                                                    d7Var4.j |= z13;
                                                                                    d7Var4.T0 = arrayList5;
                                                                                    d7Var4.P0 = file16;
                                                                                    d7Var4.Y0 = file14;
                                                                                    d7Var4.R0 = file15;
                                                                                    d7Var4.X0 = file5;
                                                                                    d7Var4.Q0 = file8;
                                                                                    d7Var4.U0 = arrayList3;
                                                                                    s8Var.run();
                                                                                    break;
                                                                                default:
                                                                                    d7 d7Var5 = d7Var3;
                                                                                    ai.w0 w0Var2 = (ai.w0) w0Var;
                                                                                    try {
                                                                                        File file22 = d7Var5.P0;
                                                                                        if (file22 != null) {
                                                                                            file22.delete();
                                                                                        }
                                                                                    } catch (Exception unused4) {
                                                                                    }
                                                                                    try {
                                                                                        File file23 = d7Var5.R0;
                                                                                        if (file23 != null) {
                                                                                            file23.delete();
                                                                                        }
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    try {
                                                                                        File file24 = d7Var5.Q0;
                                                                                        if (file24 != null) {
                                                                                            file24.delete();
                                                                                        }
                                                                                    } catch (Exception unused6) {
                                                                                    }
                                                                                    d7Var5.P0 = null;
                                                                                    d7Var5.R0 = null;
                                                                                    d7Var5.Q0 = null;
                                                                                    File file25 = d7Var5.Y0;
                                                                                    if (file25 != null) {
                                                                                        try {
                                                                                            file25.delete();
                                                                                        } catch (Exception e12) {
                                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                                        }
                                                                                        d7Var5.Y0 = null;
                                                                                    }
                                                                                    File file26 = d7Var5.X0;
                                                                                    if (file26 != null) {
                                                                                        try {
                                                                                            file26.delete();
                                                                                        } catch (Exception e13) {
                                                                                            org.telegram.messenger.a8.g(e13, true);
                                                                                        }
                                                                                        d7Var5.X0 = null;
                                                                                    }
                                                                                    d7Var5.j |= z13;
                                                                                    d7Var5.T0 = arrayList5;
                                                                                    d7Var5.P0 = file16;
                                                                                    d7Var5.Y0 = file14;
                                                                                    d7Var5.R0 = file15;
                                                                                    d7Var5.X0 = file5;
                                                                                    d7Var5.Q0 = file8;
                                                                                    d7Var5.U0 = arrayList3;
                                                                                    w0Var2.run();
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    size = arrayList.size();
                                                                    i7 = 0;
                                                                    while (i7 < size) {
                                                                        Object obj = arrayList.get(i7);
                                                                        i7++;
                                                                        ((Runnable) obj).run();
                                                                    }
                                                                    return;
                                                                }
                                                                final Bitmap blurBitmap = l5Var2.getBlurBitmap();
                                                                file7 = d7.w(i15, str2);
                                                                final int i26 = 4;
                                                                arrayList.add(new Runnable() { // from class: hi.x8
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i26) {
                                                                            case 0:
                                                                                try {
                                                                                    blurBitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file7));
                                                                                    return;
                                                                                } catch (Exception e10) {
                                                                                    org.telegram.messenger.a8.g(e10, true);
                                                                                    return;
                                                                                }
                                                                            case 1:
                                                                                Bitmap bitmap = blurBitmap;
                                                                                try {
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file7));
                                                                                        if (bitmap.isRecycled()) {
                                                                                            return;
                                                                                        }
                                                                                    } catch (Exception e11) {
                                                                                        org.telegram.messenger.a8.g(e11, true);
                                                                                        if (bitmap.isRecycled()) {
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    bitmap.recycle();
                                                                                    return;
                                                                                } catch (Throwable th2) {
                                                                                    if (!bitmap.isRecycled()) {
                                                                                        bitmap.recycle();
                                                                                    }
                                                                                    throw th2;
                                                                                }
                                                                            case 2:
                                                                                Bitmap bitmap2 = blurBitmap;
                                                                                try {
                                                                                    try {
                                                                                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file7));
                                                                                    } catch (Exception e12) {
                                                                                        org.telegram.messenger.a8.g(e12, true);
                                                                                    }
                                                                                    return;
                                                                                } finally {
                                                                                    org.telegram.messenger.g0.z2(bitmap2);
                                                                                }
                                                                            case 3:
                                                                                try {
                                                                                    blurBitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file7));
                                                                                    return;
                                                                                } catch (Exception e13) {
                                                                                    org.telegram.messenger.a8.g(e13, true);
                                                                                    return;
                                                                                }
                                                                            default:
                                                                                try {
                                                                                    blurBitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file7));
                                                                                    return;
                                                                                } catch (Exception e14) {
                                                                                    org.telegram.messenger.a8.g(e14, true);
                                                                                    return;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                            }
                                                            file8 = file7;
                                                            final int i252 = 1;
                                                            final boolean z132 = this.n;
                                                            final ArrayList arrayList52 = arrayList4;
                                                            final File file142 = file3;
                                                            final File file152 = file6;
                                                            final File file162 = file4;
                                                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.w8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i252) {
                                                                        case 0:
                                                                            d7 d7Var4 = d7Var3;
                                                                            s8 s8Var = (s8) w0Var;
                                                                            try {
                                                                                File file17 = d7Var4.P0;
                                                                                if (file17 != null) {
                                                                                    file17.delete();
                                                                                }
                                                                            } catch (Exception unused) {
                                                                            }
                                                                            try {
                                                                                File file18 = d7Var4.R0;
                                                                                if (file18 != null) {
                                                                                    file18.delete();
                                                                                }
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                            try {
                                                                                File file19 = d7Var4.Q0;
                                                                                if (file19 != null) {
                                                                                    file19.delete();
                                                                                }
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            d7Var4.P0 = null;
                                                                            d7Var4.R0 = null;
                                                                            d7Var4.Q0 = null;
                                                                            File file20 = d7Var4.Y0;
                                                                            if (file20 != null) {
                                                                                try {
                                                                                    file20.delete();
                                                                                } catch (Exception e10) {
                                                                                    org.telegram.messenger.a8.g(e10, true);
                                                                                }
                                                                                d7Var4.Y0 = null;
                                                                            }
                                                                            File file21 = d7Var4.X0;
                                                                            if (file21 != null) {
                                                                                try {
                                                                                    file21.delete();
                                                                                } catch (Exception e11) {
                                                                                    org.telegram.messenger.a8.g(e11, true);
                                                                                }
                                                                                d7Var4.X0 = null;
                                                                            }
                                                                            d7Var4.j |= z132;
                                                                            d7Var4.T0 = arrayList52;
                                                                            d7Var4.P0 = file162;
                                                                            d7Var4.Y0 = file142;
                                                                            d7Var4.R0 = file152;
                                                                            d7Var4.X0 = file5;
                                                                            d7Var4.Q0 = file8;
                                                                            d7Var4.U0 = arrayList3;
                                                                            s8Var.run();
                                                                            break;
                                                                        default:
                                                                            d7 d7Var5 = d7Var3;
                                                                            ai.w0 w0Var2 = (ai.w0) w0Var;
                                                                            try {
                                                                                File file22 = d7Var5.P0;
                                                                                if (file22 != null) {
                                                                                    file22.delete();
                                                                                }
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                            try {
                                                                                File file23 = d7Var5.R0;
                                                                                if (file23 != null) {
                                                                                    file23.delete();
                                                                                }
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                            try {
                                                                                File file24 = d7Var5.Q0;
                                                                                if (file24 != null) {
                                                                                    file24.delete();
                                                                                }
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                            d7Var5.P0 = null;
                                                                            d7Var5.R0 = null;
                                                                            d7Var5.Q0 = null;
                                                                            File file25 = d7Var5.Y0;
                                                                            if (file25 != null) {
                                                                                try {
                                                                                    file25.delete();
                                                                                } catch (Exception e12) {
                                                                                    org.telegram.messenger.a8.g(e12, true);
                                                                                }
                                                                                d7Var5.Y0 = null;
                                                                            }
                                                                            File file26 = d7Var5.X0;
                                                                            if (file26 != null) {
                                                                                try {
                                                                                    file26.delete();
                                                                                } catch (Exception e13) {
                                                                                    org.telegram.messenger.a8.g(e13, true);
                                                                                }
                                                                                d7Var5.X0 = null;
                                                                            }
                                                                            d7Var5.j |= z132;
                                                                            d7Var5.T0 = arrayList52;
                                                                            d7Var5.P0 = file162;
                                                                            d7Var5.Y0 = file142;
                                                                            d7Var5.R0 = file152;
                                                                            d7Var5.X0 = file5;
                                                                            d7Var5.Q0 = file8;
                                                                            d7Var5.U0 = arrayList3;
                                                                            w0Var2.run();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            size = arrayList.size();
                                                            i7 = 0;
                                                            while (i7 < size) {
                                                            }
                                                            return;
                                                        }
                                                        int i27 = i22 * 2;
                                                        float f18 = iArr[i22];
                                                        fArr[i27] = f18;
                                                        fArr[i27 + 1] = f18;
                                                        i22++;
                                                        z10 = z11;
                                                    }
                                                }
                                                str = "png";
                                                z11 = z10;
                                                file4 = w10;
                                                file5 = file;
                                                if (l5Var.r0()) {
                                                }
                                                file8 = file7;
                                                final int i2522 = 1;
                                                final boolean z1322 = this.n;
                                                final ArrayList arrayList522 = arrayList4;
                                                final File file1422 = file3;
                                                final File file1522 = file6;
                                                final File file1622 = file4;
                                                org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.w8
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i2522) {
                                                            case 0:
                                                                d7 d7Var4 = d7Var3;
                                                                s8 s8Var = (s8) w0Var;
                                                                try {
                                                                    File file17 = d7Var4.P0;
                                                                    if (file17 != null) {
                                                                        file17.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file18 = d7Var4.R0;
                                                                    if (file18 != null) {
                                                                        file18.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file19 = d7Var4.Q0;
                                                                    if (file19 != null) {
                                                                        file19.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                d7Var4.P0 = null;
                                                                d7Var4.R0 = null;
                                                                d7Var4.Q0 = null;
                                                                File file20 = d7Var4.Y0;
                                                                if (file20 != null) {
                                                                    try {
                                                                        file20.delete();
                                                                    } catch (Exception e10) {
                                                                        org.telegram.messenger.a8.g(e10, true);
                                                                    }
                                                                    d7Var4.Y0 = null;
                                                                }
                                                                File file21 = d7Var4.X0;
                                                                if (file21 != null) {
                                                                    try {
                                                                        file21.delete();
                                                                    } catch (Exception e11) {
                                                                        org.telegram.messenger.a8.g(e11, true);
                                                                    }
                                                                    d7Var4.X0 = null;
                                                                }
                                                                d7Var4.j |= z1322;
                                                                d7Var4.T0 = arrayList522;
                                                                d7Var4.P0 = file1622;
                                                                d7Var4.Y0 = file1422;
                                                                d7Var4.R0 = file1522;
                                                                d7Var4.X0 = file5;
                                                                d7Var4.Q0 = file8;
                                                                d7Var4.U0 = arrayList3;
                                                                s8Var.run();
                                                                break;
                                                            default:
                                                                d7 d7Var5 = d7Var3;
                                                                ai.w0 w0Var2 = (ai.w0) w0Var;
                                                                try {
                                                                    File file22 = d7Var5.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file23 = d7Var5.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file24 = d7Var5.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                d7Var5.P0 = null;
                                                                d7Var5.R0 = null;
                                                                d7Var5.Q0 = null;
                                                                File file25 = d7Var5.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e12) {
                                                                        org.telegram.messenger.a8.g(e12, true);
                                                                    }
                                                                    d7Var5.Y0 = null;
                                                                }
                                                                File file26 = d7Var5.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e13) {
                                                                        org.telegram.messenger.a8.g(e13, true);
                                                                    }
                                                                    d7Var5.X0 = null;
                                                                }
                                                                d7Var5.j |= z1322;
                                                                d7Var5.T0 = arrayList522;
                                                                d7Var5.P0 = file1622;
                                                                d7Var5.Y0 = file1422;
                                                                d7Var5.R0 = file1522;
                                                                d7Var5.X0 = file5;
                                                                d7Var5.Q0 = file8;
                                                                d7Var5.U0 = arrayList3;
                                                                w0Var2.run();
                                                                break;
                                                        }
                                                    }
                                                });
                                                size = arrayList.size();
                                                i7 = 0;
                                                while (i7 < size) {
                                                }
                                                return;
                                            }
                                        }
                                    }
                                    r12 = file;
                                    if (r12 != 0) {
                                    }
                                }
                            }
                            r12 = file;
                            if (r12 != 0) {
                            }
                        }
                        file3 = file2;
                        str = "png";
                        z11 = z10;
                        file4 = w10;
                        file5 = file;
                        if (l5Var.r0()) {
                        }
                        file8 = file7;
                        final int i25222 = 1;
                        final boolean z13222 = this.n;
                        final ArrayList arrayList5222 = arrayList4;
                        final File file14222 = file3;
                        final File file15222 = file6;
                        final File file16222 = file4;
                        org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.w8
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i25222) {
                                    case 0:
                                        d7 d7Var4 = d7Var3;
                                        s8 s8Var = (s8) w0Var;
                                        try {
                                            File file17 = d7Var4.P0;
                                            if (file17 != null) {
                                                file17.delete();
                                            }
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            File file18 = d7Var4.R0;
                                            if (file18 != null) {
                                                file18.delete();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        try {
                                            File file19 = d7Var4.Q0;
                                            if (file19 != null) {
                                                file19.delete();
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        d7Var4.P0 = null;
                                        d7Var4.R0 = null;
                                        d7Var4.Q0 = null;
                                        File file20 = d7Var4.Y0;
                                        if (file20 != null) {
                                            try {
                                                file20.delete();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            d7Var4.Y0 = null;
                                        }
                                        File file21 = d7Var4.X0;
                                        if (file21 != null) {
                                            try {
                                                file21.delete();
                                            } catch (Exception e11) {
                                                org.telegram.messenger.a8.g(e11, true);
                                            }
                                            d7Var4.X0 = null;
                                        }
                                        d7Var4.j |= z13222;
                                        d7Var4.T0 = arrayList5222;
                                        d7Var4.P0 = file16222;
                                        d7Var4.Y0 = file14222;
                                        d7Var4.R0 = file15222;
                                        d7Var4.X0 = file5;
                                        d7Var4.Q0 = file8;
                                        d7Var4.U0 = arrayList3;
                                        s8Var.run();
                                        break;
                                    default:
                                        d7 d7Var5 = d7Var3;
                                        ai.w0 w0Var2 = (ai.w0) w0Var;
                                        try {
                                            File file22 = d7Var5.P0;
                                            if (file22 != null) {
                                                file22.delete();
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            File file23 = d7Var5.R0;
                                            if (file23 != null) {
                                                file23.delete();
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        try {
                                            File file24 = d7Var5.Q0;
                                            if (file24 != null) {
                                                file24.delete();
                                            }
                                        } catch (Exception unused6) {
                                        }
                                        d7Var5.P0 = null;
                                        d7Var5.R0 = null;
                                        d7Var5.Q0 = null;
                                        File file25 = d7Var5.Y0;
                                        if (file25 != null) {
                                            try {
                                                file25.delete();
                                            } catch (Exception e12) {
                                                org.telegram.messenger.a8.g(e12, true);
                                            }
                                            d7Var5.Y0 = null;
                                        }
                                        File file26 = d7Var5.X0;
                                        if (file26 != null) {
                                            try {
                                                file26.delete();
                                            } catch (Exception e13) {
                                                org.telegram.messenger.a8.g(e13, true);
                                            }
                                            d7Var5.X0 = null;
                                        }
                                        d7Var5.j |= z13222;
                                        d7Var5.T0 = arrayList5222;
                                        d7Var5.P0 = file16222;
                                        d7Var5.Y0 = file14222;
                                        d7Var5.R0 = file15222;
                                        d7Var5.X0 = file5;
                                        d7Var5.Q0 = file8;
                                        d7Var5.U0 = arrayList3;
                                        w0Var2.run();
                                        break;
                                }
                            }
                        });
                        size = arrayList.size();
                        i7 = 0;
                        while (i7 < size) {
                        }
                        return;
                    }
                } else {
                    z10 = E;
                }
                l5Var = l5Var5;
                file = null;
                file2 = null;
                if (d7Var3.u) {
                    int i182 = d7Var3.k0;
                    int i192 = d7Var3.l0;
                    p02 = l5Var.p0();
                    if (p02 != null) {
                    }
                    r12 = file;
                    if (r12 != 0) {
                    }
                }
                file3 = file2;
                str = "png";
                z11 = z10;
                file4 = w10;
                file5 = file;
                if (l5Var.r0()) {
                }
                file8 = file7;
                final int i252222 = 1;
                final boolean z132222 = this.n;
                final ArrayList arrayList52222 = arrayList4;
                final File file142222 = file3;
                final File file152222 = file6;
                final File file162222 = file4;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.w8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i252222) {
                            case 0:
                                d7 d7Var4 = d7Var3;
                                s8 s8Var = (s8) w0Var;
                                try {
                                    File file17 = d7Var4.P0;
                                    if (file17 != null) {
                                        file17.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18 = d7Var4.R0;
                                    if (file18 != null) {
                                        file18.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19 = d7Var4.Q0;
                                    if (file19 != null) {
                                        file19.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                d7Var4.P0 = null;
                                d7Var4.R0 = null;
                                d7Var4.Q0 = null;
                                File file20 = d7Var4.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    d7Var4.Y0 = null;
                                }
                                File file21 = d7Var4.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                    d7Var4.X0 = null;
                                }
                                d7Var4.j |= z132222;
                                d7Var4.T0 = arrayList52222;
                                d7Var4.P0 = file162222;
                                d7Var4.Y0 = file142222;
                                d7Var4.R0 = file152222;
                                d7Var4.X0 = file5;
                                d7Var4.Q0 = file8;
                                d7Var4.U0 = arrayList3;
                                s8Var.run();
                                break;
                            default:
                                d7 d7Var5 = d7Var3;
                                ai.w0 w0Var2 = (ai.w0) w0Var;
                                try {
                                    File file22 = d7Var5.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = d7Var5.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = d7Var5.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                d7Var5.P0 = null;
                                d7Var5.R0 = null;
                                d7Var5.Q0 = null;
                                File file25 = d7Var5.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e12) {
                                        org.telegram.messenger.a8.g(e12, true);
                                    }
                                    d7Var5.Y0 = null;
                                }
                                File file26 = d7Var5.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                    }
                                    d7Var5.X0 = null;
                                }
                                d7Var5.j |= z132222;
                                d7Var5.T0 = arrayList52222;
                                d7Var5.P0 = file162222;
                                d7Var5.Y0 = file142222;
                                d7Var5.R0 = file152222;
                                d7Var5.X0 = file5;
                                d7Var5.Q0 = file8;
                                d7Var5.U0 = arrayList3;
                                w0Var2.run();
                                break;
                        }
                    }
                });
                size = arrayList.size();
                i7 = 0;
                while (i7 < size) {
                }
                return;
            case 1:
                ta taVar2 = (ta) this.b;
                l5 l5Var6 = (l5) this.c;
                d7 d7Var4 = (d7) this.f;
                final s8 s8Var = (s8) this.r;
                int i28 = taVar2.c;
                ArrayList arrayList6 = new ArrayList();
                l5Var6.q0(arrayList6, false, false, false, false, d7Var4);
                if (!d7Var4.K) {
                    d7Var4.S0 = Utilities.k(l5Var6.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = l5Var6.getMasks();
                ArrayList arrayList7 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z14 = d7Var4.K;
                boolean E2 = d7Var4.E();
                arrayList6.clear();
                Bitmap q04 = l5Var6.q0(arrayList6, true, false, false, !z14, d7Var4);
                ArrayList arrayList8 = arrayList6.isEmpty() ? null : arrayList6;
                org.telegram.messenger.w7.G(i28);
                final File J = org.telegram.messenger.w7.J(ec.a0(q04, Bitmap.CompressFormat.PNG, d7Var4.i0, d7Var4.j0, 87), null, true, true);
                if (q04 != null && !q04.isRecycled()) {
                    q04.recycle();
                }
                boolean z15 = d7Var4.u;
                int i29 = this.d;
                int i30 = this.e;
                final ArrayList arrayList9 = arrayList7;
                if (z15) {
                    long j10 = d7Var4.z0;
                    if (j10 != Long.MIN_VALUE) {
                        Drawable drawable2 = d7Var4.x0;
                        if (drawable2 == null) {
                            drawable2 = w5.e(null, i28, j10, taVar2.d2);
                        }
                        if (drawable2 != null) {
                            file10 = d7.w(i28, "webp");
                            Bitmap createBitmap3 = Bitmap.createBitmap(i29, i30, Bitmap.Config.ARGB_8888);
                            d7.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
                            try {
                                try {
                                    createBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file10));
                                    break;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    break;
                                }
                            } finally {
                                if (!createBitmap3.isRecycled()) {
                                    createBitmap3.recycle();
                                }
                            }
                        }
                    }
                }
                file10 = null;
                if (d7Var4.u && d7Var4.K) {
                    int i31 = d7Var4.k0;
                    int i32 = d7Var4.l0;
                    tg.u0 p03 = l5Var6.p0();
                    if (p03 != null) {
                        tg.p0 p0Var2 = p03.s0;
                        if (p0Var2.getChildCount() == 1 && i31 > 0 && i32 > 0) {
                            if (p0Var2.getChildAt(0) instanceof org.telegram.ui.Cells.q1) {
                                imageReceiver = ((org.telegram.ui.Cells.q1) p0Var2.getChildAt(0)).getPhotoImage();
                                if (imageReceiver != null) {
                                    float f19 = imageReceiver.N0;
                                    if (((int) f19) > 0) {
                                        float f20 = imageReceiver.O0;
                                        l5Var3 = l5Var6;
                                        if (((int) f20) > 0) {
                                            float f21 = i31;
                                            float f22 = i32;
                                            float max2 = Math.max(f19 / f21, f20 / f22);
                                            int i33 = (int) ((f21 * max2) / 2.0f);
                                            int i34 = (int) ((f22 * max2) / 2.0f);
                                            Bitmap createBitmap4 = Bitmap.createBitmap(i33, i34, Bitmap.Config.ARGB_8888);
                                            float[] fArr2 = new float[8];
                                            i10 = i29;
                                            int i35 = 0;
                                            while (true) {
                                                int[] iArr2 = imageReceiver.X0;
                                                i11 = i30;
                                                if (i35 >= iArr2.length) {
                                                    Canvas canvas2 = new Canvas(createBitmap4);
                                                    Path path2 = new Path();
                                                    canvas2.scale(0.5f, 0.5f);
                                                    RectF rectF2 = org.telegram.messenger.g0.P;
                                                    float f23 = (i33 * 2.0f) / 2.0f;
                                                    float f24 = imageReceiver.N0 / 2.0f;
                                                    float f25 = (i34 * 2.0f) / 2.0f;
                                                    float f26 = imageReceiver.O0 / 2.0f;
                                                    d7Var = d7Var4;
                                                    rectF2.set(f23 - f24, f25 - f26, f24 + f23, f26 + f25);
                                                    path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                                    Paint paint2 = new Paint(1);
                                                    paint2.setColor(-1);
                                                    canvas2.drawPath(path2, paint2);
                                                    try {
                                                        file11 = d7.w(i28, "webp");
                                                        createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file11));
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        file11 = null;
                                                    }
                                                    createBitmap4.recycle();
                                                    if (E2) {
                                                        i12 = i10;
                                                        l5Var4 = l5Var3;
                                                        i13 = i11;
                                                        d7Var2 = d7Var;
                                                        i14 = 87;
                                                        file12 = null;
                                                    } else {
                                                        i12 = i10;
                                                        l5Var4 = l5Var3;
                                                        i13 = i11;
                                                        d7Var2 = d7Var;
                                                        i14 = 87;
                                                        Bitmap q05 = l5Var4.q0(new ArrayList(), false, true, false, false, d7Var2);
                                                        org.telegram.messenger.w7.G(i28);
                                                        File J2 = org.telegram.messenger.w7.J(ec.a0(q05, Bitmap.CompressFormat.PNG, i12, i13, 87), null, true, true);
                                                        if (q05 != null && !q05.isRecycled()) {
                                                            q05.recycle();
                                                        }
                                                        file12 = J2;
                                                    }
                                                    if (this.h) {
                                                        Bitmap blurBitmap2 = l5Var4.getBlurBitmap();
                                                        org.telegram.messenger.w7.G(i28);
                                                        file13 = org.telegram.messenger.w7.J(ec.a0(blurBitmap2, Bitmap.CompressFormat.PNG, i12, i13, i14), null, true, true);
                                                        if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                                                            blurBitmap2.recycle();
                                                        }
                                                    } else {
                                                        file13 = null;
                                                    }
                                                    final d7 d7Var5 = d7Var2;
                                                    final File file17 = file10;
                                                    final File file18 = file13;
                                                    final File file19 = file12;
                                                    final ArrayList arrayList10 = arrayList8;
                                                    final int i36 = 0;
                                                    final boolean z16 = this.n;
                                                    final File file20 = file11;
                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.w8
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i36) {
                                                                case 0:
                                                                    d7 d7Var42 = d7Var5;
                                                                    s8 s8Var2 = (s8) s8Var;
                                                                    try {
                                                                        File file172 = d7Var42.P0;
                                                                        if (file172 != null) {
                                                                            file172.delete();
                                                                        }
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    try {
                                                                        File file182 = d7Var42.R0;
                                                                        if (file182 != null) {
                                                                            file182.delete();
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                    }
                                                                    try {
                                                                        File file192 = d7Var42.Q0;
                                                                        if (file192 != null) {
                                                                            file192.delete();
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                    }
                                                                    d7Var42.P0 = null;
                                                                    d7Var42.R0 = null;
                                                                    d7Var42.Q0 = null;
                                                                    File file202 = d7Var42.Y0;
                                                                    if (file202 != null) {
                                                                        try {
                                                                            file202.delete();
                                                                        } catch (Exception e102) {
                                                                            org.telegram.messenger.a8.g(e102, true);
                                                                        }
                                                                        d7Var42.Y0 = null;
                                                                    }
                                                                    File file21 = d7Var42.X0;
                                                                    if (file21 != null) {
                                                                        try {
                                                                            file21.delete();
                                                                        } catch (Exception e112) {
                                                                            org.telegram.messenger.a8.g(e112, true);
                                                                        }
                                                                        d7Var42.X0 = null;
                                                                    }
                                                                    d7Var42.j |= z16;
                                                                    d7Var42.T0 = arrayList10;
                                                                    d7Var42.P0 = J;
                                                                    d7Var42.Y0 = file17;
                                                                    d7Var42.R0 = file19;
                                                                    d7Var42.X0 = file20;
                                                                    d7Var42.Q0 = file18;
                                                                    d7Var42.U0 = arrayList9;
                                                                    s8Var2.run();
                                                                    break;
                                                                default:
                                                                    d7 d7Var52 = d7Var5;
                                                                    ai.w0 w0Var2 = (ai.w0) s8Var;
                                                                    try {
                                                                        File file22 = d7Var52.P0;
                                                                        if (file22 != null) {
                                                                            file22.delete();
                                                                        }
                                                                    } catch (Exception unused4) {
                                                                    }
                                                                    try {
                                                                        File file23 = d7Var52.R0;
                                                                        if (file23 != null) {
                                                                            file23.delete();
                                                                        }
                                                                    } catch (Exception unused5) {
                                                                    }
                                                                    try {
                                                                        File file24 = d7Var52.Q0;
                                                                        if (file24 != null) {
                                                                            file24.delete();
                                                                        }
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                    d7Var52.P0 = null;
                                                                    d7Var52.R0 = null;
                                                                    d7Var52.Q0 = null;
                                                                    File file25 = d7Var52.Y0;
                                                                    if (file25 != null) {
                                                                        try {
                                                                            file25.delete();
                                                                        } catch (Exception e12) {
                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                        }
                                                                        d7Var52.Y0 = null;
                                                                    }
                                                                    File file26 = d7Var52.X0;
                                                                    if (file26 != null) {
                                                                        try {
                                                                            file26.delete();
                                                                        } catch (Exception e13) {
                                                                            org.telegram.messenger.a8.g(e13, true);
                                                                        }
                                                                        d7Var52.X0 = null;
                                                                    }
                                                                    d7Var52.j |= z16;
                                                                    d7Var52.T0 = arrayList10;
                                                                    d7Var52.P0 = J;
                                                                    d7Var52.Y0 = file17;
                                                                    d7Var52.R0 = file19;
                                                                    d7Var52.X0 = file20;
                                                                    d7Var52.Q0 = file18;
                                                                    d7Var52.U0 = arrayList9;
                                                                    w0Var2.run();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                int i37 = i35 * 2;
                                                float f27 = iArr2[i35];
                                                fArr2[i37] = f27;
                                                fArr2[i37 + 1] = f27;
                                                i35++;
                                                i30 = i11;
                                            }
                                        }
                                        i10 = i29;
                                        i11 = i30;
                                        d7Var = d7Var4;
                                        file11 = null;
                                        if (E2) {
                                        }
                                        if (this.h) {
                                        }
                                        final d7 d7Var52 = d7Var2;
                                        final File file172 = file10;
                                        final File file182 = file13;
                                        final File file192 = file12;
                                        final ArrayList arrayList102 = arrayList8;
                                        final int i362 = 0;
                                        final boolean z162 = this.n;
                                        final File file202 = file11;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.w8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i362) {
                                                    case 0:
                                                        d7 d7Var42 = d7Var52;
                                                        s8 s8Var2 = (s8) s8Var;
                                                        try {
                                                            File file1722 = d7Var42.P0;
                                                            if (file1722 != null) {
                                                                file1722.delete();
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                        try {
                                                            File file1822 = d7Var42.R0;
                                                            if (file1822 != null) {
                                                                file1822.delete();
                                                            }
                                                        } catch (Exception unused2) {
                                                        }
                                                        try {
                                                            File file1922 = d7Var42.Q0;
                                                            if (file1922 != null) {
                                                                file1922.delete();
                                                            }
                                                        } catch (Exception unused3) {
                                                        }
                                                        d7Var42.P0 = null;
                                                        d7Var42.R0 = null;
                                                        d7Var42.Q0 = null;
                                                        File file2022 = d7Var42.Y0;
                                                        if (file2022 != null) {
                                                            try {
                                                                file2022.delete();
                                                            } catch (Exception e102) {
                                                                org.telegram.messenger.a8.g(e102, true);
                                                            }
                                                            d7Var42.Y0 = null;
                                                        }
                                                        File file21 = d7Var42.X0;
                                                        if (file21 != null) {
                                                            try {
                                                                file21.delete();
                                                            } catch (Exception e112) {
                                                                org.telegram.messenger.a8.g(e112, true);
                                                            }
                                                            d7Var42.X0 = null;
                                                        }
                                                        d7Var42.j |= z162;
                                                        d7Var42.T0 = arrayList102;
                                                        d7Var42.P0 = J;
                                                        d7Var42.Y0 = file172;
                                                        d7Var42.R0 = file192;
                                                        d7Var42.X0 = file202;
                                                        d7Var42.Q0 = file182;
                                                        d7Var42.U0 = arrayList9;
                                                        s8Var2.run();
                                                        break;
                                                    default:
                                                        d7 d7Var522 = d7Var52;
                                                        ai.w0 w0Var2 = (ai.w0) s8Var;
                                                        try {
                                                            File file22 = d7Var522.P0;
                                                            if (file22 != null) {
                                                                file22.delete();
                                                            }
                                                        } catch (Exception unused4) {
                                                        }
                                                        try {
                                                            File file23 = d7Var522.R0;
                                                            if (file23 != null) {
                                                                file23.delete();
                                                            }
                                                        } catch (Exception unused5) {
                                                        }
                                                        try {
                                                            File file24 = d7Var522.Q0;
                                                            if (file24 != null) {
                                                                file24.delete();
                                                            }
                                                        } catch (Exception unused6) {
                                                        }
                                                        d7Var522.P0 = null;
                                                        d7Var522.R0 = null;
                                                        d7Var522.Q0 = null;
                                                        File file25 = d7Var522.Y0;
                                                        if (file25 != null) {
                                                            try {
                                                                file25.delete();
                                                            } catch (Exception e12) {
                                                                org.telegram.messenger.a8.g(e12, true);
                                                            }
                                                            d7Var522.Y0 = null;
                                                        }
                                                        File file26 = d7Var522.X0;
                                                        if (file26 != null) {
                                                            try {
                                                                file26.delete();
                                                            } catch (Exception e13) {
                                                                org.telegram.messenger.a8.g(e13, true);
                                                            }
                                                            d7Var522.X0 = null;
                                                        }
                                                        d7Var522.j |= z162;
                                                        d7Var522.T0 = arrayList102;
                                                        d7Var522.P0 = J;
                                                        d7Var522.Y0 = file172;
                                                        d7Var522.R0 = file192;
                                                        d7Var522.X0 = file202;
                                                        d7Var522.Q0 = file182;
                                                        d7Var522.U0 = arrayList9;
                                                        w0Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                            imageReceiver = null;
                            if (imageReceiver != null) {
                            }
                        }
                    }
                    imageReceiver = null;
                    if (imageReceiver != null) {
                    }
                }
                l5Var3 = l5Var6;
                i10 = i29;
                i11 = i30;
                d7Var = d7Var4;
                file11 = null;
                if (E2) {
                }
                if (this.h) {
                }
                final d7 d7Var522 = d7Var2;
                final File file1722 = file10;
                final File file1822 = file13;
                final File file1922 = file12;
                final ArrayList arrayList1022 = arrayList8;
                final int i3622 = 0;
                final boolean z1622 = this.n;
                final File file2022 = file11;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.w8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3622) {
                            case 0:
                                d7 d7Var42 = d7Var522;
                                s8 s8Var2 = (s8) s8Var;
                                try {
                                    File file17222 = d7Var42.P0;
                                    if (file17222 != null) {
                                        file17222.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18222 = d7Var42.R0;
                                    if (file18222 != null) {
                                        file18222.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19222 = d7Var42.Q0;
                                    if (file19222 != null) {
                                        file19222.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                d7Var42.P0 = null;
                                d7Var42.R0 = null;
                                d7Var42.Q0 = null;
                                File file20222 = d7Var42.Y0;
                                if (file20222 != null) {
                                    try {
                                        file20222.delete();
                                    } catch (Exception e102) {
                                        org.telegram.messenger.a8.g(e102, true);
                                    }
                                    d7Var42.Y0 = null;
                                }
                                File file21 = d7Var42.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e112) {
                                        org.telegram.messenger.a8.g(e112, true);
                                    }
                                    d7Var42.X0 = null;
                                }
                                d7Var42.j |= z1622;
                                d7Var42.T0 = arrayList1022;
                                d7Var42.P0 = J;
                                d7Var42.Y0 = file1722;
                                d7Var42.R0 = file1922;
                                d7Var42.X0 = file2022;
                                d7Var42.Q0 = file1822;
                                d7Var42.U0 = arrayList9;
                                s8Var2.run();
                                break;
                            default:
                                d7 d7Var5222 = d7Var522;
                                ai.w0 w0Var2 = (ai.w0) s8Var;
                                try {
                                    File file22 = d7Var5222.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = d7Var5222.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = d7Var5222.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                d7Var5222.P0 = null;
                                d7Var5222.R0 = null;
                                d7Var5222.Q0 = null;
                                File file25 = d7Var5222.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e12) {
                                        org.telegram.messenger.a8.g(e12, true);
                                    }
                                    d7Var5222.Y0 = null;
                                }
                                File file26 = d7Var5222.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                    }
                                    d7Var5222.X0 = null;
                                }
                                d7Var5222.j |= z1622;
                                d7Var5222.T0 = arrayList1022;
                                d7Var5222.P0 = J;
                                d7Var5222.Y0 = file1722;
                                d7Var5222.R0 = file1922;
                                d7Var5222.X0 = file2022;
                                d7Var5222.Q0 = file1822;
                                d7Var5222.U0 = arrayList9;
                                w0Var2.run();
                                break;
                        }
                    }
                });
                return;
            default:
                MediaController.c((MediaController) this.b, (File) this.c, (File) this.f, (TLRPC.TL_document) this.r, this.d, this.h, this.e, this.n);
                return;
        }
    }

    public /* synthetic */ v8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
        this.a = 2;
        this.b = mediaController;
        this.c = file;
        this.f = file2;
        this.r = tL_document;
        this.d = i7;
        this.h = z10;
        this.e = i10;
        this.n = z11;
    }
}
