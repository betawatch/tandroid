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
import org.telegram.messenger.fs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object r;

    public /* synthetic */ p9(nb nbVar, pa paVar, int i7, int i10, x7 x7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.a = i11;
        this.b = nbVar;
        this.c = paVar;
        this.d = i7;
        this.e = i10;
        this.f = x7Var;
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
        v5 v5Var;
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
        v5 v5Var2;
        String str2;
        tg.z0 r02;
        ?? r12;
        File file9;
        File file10;
        v5 v5Var3;
        int i10;
        int i11;
        x7 x7Var;
        File file11;
        int i12;
        v5 v5Var4;
        int i13;
        x7 x7Var2;
        int i14;
        File file12;
        File file13;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 0:
                nb nbVar = (nb) this.b;
                v5 v5Var5 = (v5) this.c;
                final x7 x7Var3 = (x7) this.f;
                final ai.u0 u0Var = (ai.u0) this.r;
                int i15 = nbVar.c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                v5Var5.s0(arrayList2, false, false, false, false, x7Var3);
                if (!x7Var3.K) {
                    x7Var3.S0 = Utilities.k(v5Var5.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = v5Var5.getMasks();
                final ArrayList arrayList3 = masks != null ? new ArrayList(masks) : null;
                boolean z12 = x7Var3.K;
                boolean E = x7Var3.E();
                arrayList2.clear();
                final Bitmap s02 = v5Var5.s0(arrayList2, true, false, false, !z12, x7Var3);
                ArrayList arrayList4 = arrayList2.isEmpty() ? null : arrayList2;
                final File w10 = x7.w(i15, "png");
                final int i16 = 0;
                arrayList.add(new Runnable() { // from class: hi.r9
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                try {
                                    s02.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w10));
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            case 1:
                                Bitmap bitmap = s02;
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
                                Bitmap bitmap2 = s02;
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
                                    s02.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w10));
                                    return;
                                } catch (Exception e13) {
                                    org.telegram.messenger.a8.g(e13, true);
                                    return;
                                }
                            default:
                                try {
                                    s02.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(w10));
                                    return;
                                } catch (Exception e14) {
                                    org.telegram.messenger.a8.g(e14, true);
                                    return;
                                }
                        }
                    }
                });
                if (x7Var3.u) {
                    z10 = E;
                    long j3 = x7Var3.z0;
                    if (j3 != Long.MIN_VALUE) {
                        Drawable drawable = x7Var3.x0;
                        if (drawable == null) {
                            file = null;
                            drawable = f6.e(null, i15, j3, nbVar.d2);
                        } else {
                            file = null;
                        }
                        if (drawable != null) {
                            final File w11 = x7.w(i15, "webp");
                            final Bitmap createBitmap = Bitmap.createBitmap(this.d, this.e, Bitmap.Config.ARGB_8888);
                            v5Var = v5Var5;
                            x7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            final int i17 = 1;
                            arrayList.add(new Runnable() { // from class: hi.r9
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
                            v5Var = v5Var5;
                            file9 = file;
                        }
                        file2 = file9;
                        if (x7Var3.u && x7Var3.K) {
                            int i18 = x7Var3.k0;
                            int i19 = x7Var3.l0;
                            r02 = v5Var.r0();
                            if (r02 != null) {
                                tg.u0 u0Var2 = r02.t0;
                                if (u0Var2.getChildCount() == 1 && i18 > 0 && i19 > 0) {
                                    if (u0Var2.getChildAt(0) instanceof org.telegram.ui.Cells.r1) {
                                        r12 = ((org.telegram.ui.Cells.r1) u0Var2.getChildAt(0)).getPhotoImage();
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
                                                            final File w12 = x7.w(i15, "webp");
                                                            final int i23 = 2;
                                                            arrayList.add(new Runnable() { // from class: hi.r9
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
                                                            if (v5Var.t0()) {
                                                                file6 = x7Var3.R0;
                                                                file7 = x7Var3.Q0;
                                                            } else {
                                                                if (z11) {
                                                                    v5Var2 = v5Var;
                                                                    str2 = str;
                                                                    file6 = file;
                                                                } else {
                                                                    v5Var2 = v5Var;
                                                                    str2 = str;
                                                                    final Bitmap s03 = v5Var2.s0(new ArrayList(), false, true, false, false, x7Var3);
                                                                    file6 = x7.w(i15, str2);
                                                                    final int i24 = 3;
                                                                    arrayList.add(new Runnable() { // from class: hi.r9
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i24) {
                                                                                case 0:
                                                                                    try {
                                                                                        s03.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file6));
                                                                                        return;
                                                                                    } catch (Exception e10) {
                                                                                        org.telegram.messenger.a8.g(e10, true);
                                                                                        return;
                                                                                    }
                                                                                case 1:
                                                                                    Bitmap bitmap = s03;
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
                                                                                    Bitmap bitmap2 = s03;
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
                                                                                        s03.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file6));
                                                                                        return;
                                                                                    } catch (Exception e13) {
                                                                                        org.telegram.messenger.a8.g(e13, true);
                                                                                        return;
                                                                                    }
                                                                                default:
                                                                                    try {
                                                                                        s03.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file6));
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
                                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.q9
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i25) {
                                                                                case 0:
                                                                                    x7 x7Var4 = x7Var3;
                                                                                    m9 m9Var = (m9) u0Var;
                                                                                    try {
                                                                                        File file17 = x7Var4.P0;
                                                                                        if (file17 != null) {
                                                                                            file17.delete();
                                                                                        }
                                                                                    } catch (Exception unused) {
                                                                                    }
                                                                                    try {
                                                                                        File file18 = x7Var4.R0;
                                                                                        if (file18 != null) {
                                                                                            file18.delete();
                                                                                        }
                                                                                    } catch (Exception unused2) {
                                                                                    }
                                                                                    try {
                                                                                        File file19 = x7Var4.Q0;
                                                                                        if (file19 != null) {
                                                                                            file19.delete();
                                                                                        }
                                                                                    } catch (Exception unused3) {
                                                                                    }
                                                                                    x7Var4.P0 = null;
                                                                                    x7Var4.R0 = null;
                                                                                    x7Var4.Q0 = null;
                                                                                    File file20 = x7Var4.Y0;
                                                                                    if (file20 != null) {
                                                                                        try {
                                                                                            file20.delete();
                                                                                        } catch (Exception e10) {
                                                                                            org.telegram.messenger.a8.g(e10, true);
                                                                                        }
                                                                                        x7Var4.Y0 = null;
                                                                                    }
                                                                                    File file21 = x7Var4.X0;
                                                                                    if (file21 != null) {
                                                                                        try {
                                                                                            file21.delete();
                                                                                        } catch (Exception e11) {
                                                                                            org.telegram.messenger.a8.g(e11, true);
                                                                                        }
                                                                                        x7Var4.X0 = null;
                                                                                    }
                                                                                    x7Var4.j |= z13;
                                                                                    x7Var4.T0 = arrayList5;
                                                                                    x7Var4.P0 = file16;
                                                                                    x7Var4.Y0 = file14;
                                                                                    x7Var4.R0 = file15;
                                                                                    x7Var4.X0 = file5;
                                                                                    x7Var4.Q0 = file8;
                                                                                    x7Var4.U0 = arrayList3;
                                                                                    m9Var.run();
                                                                                    break;
                                                                                default:
                                                                                    x7 x7Var5 = x7Var3;
                                                                                    ai.u0 u0Var3 = (ai.u0) u0Var;
                                                                                    try {
                                                                                        File file22 = x7Var5.P0;
                                                                                        if (file22 != null) {
                                                                                            file22.delete();
                                                                                        }
                                                                                    } catch (Exception unused4) {
                                                                                    }
                                                                                    try {
                                                                                        File file23 = x7Var5.R0;
                                                                                        if (file23 != null) {
                                                                                            file23.delete();
                                                                                        }
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    try {
                                                                                        File file24 = x7Var5.Q0;
                                                                                        if (file24 != null) {
                                                                                            file24.delete();
                                                                                        }
                                                                                    } catch (Exception unused6) {
                                                                                    }
                                                                                    x7Var5.P0 = null;
                                                                                    x7Var5.R0 = null;
                                                                                    x7Var5.Q0 = null;
                                                                                    File file25 = x7Var5.Y0;
                                                                                    if (file25 != null) {
                                                                                        try {
                                                                                            file25.delete();
                                                                                        } catch (Exception e12) {
                                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                                        }
                                                                                        x7Var5.Y0 = null;
                                                                                    }
                                                                                    File file26 = x7Var5.X0;
                                                                                    if (file26 != null) {
                                                                                        try {
                                                                                            file26.delete();
                                                                                        } catch (Exception e13) {
                                                                                            org.telegram.messenger.a8.g(e13, true);
                                                                                        }
                                                                                        x7Var5.X0 = null;
                                                                                    }
                                                                                    x7Var5.j |= z13;
                                                                                    x7Var5.T0 = arrayList5;
                                                                                    x7Var5.P0 = file16;
                                                                                    x7Var5.Y0 = file14;
                                                                                    x7Var5.R0 = file15;
                                                                                    x7Var5.X0 = file5;
                                                                                    x7Var5.Q0 = file8;
                                                                                    x7Var5.U0 = arrayList3;
                                                                                    u0Var3.run();
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
                                                                final Bitmap blurBitmap = v5Var2.getBlurBitmap();
                                                                file7 = x7.w(i15, str2);
                                                                final int i26 = 4;
                                                                arrayList.add(new Runnable() { // from class: hi.r9
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
                                                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.q9
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i252) {
                                                                        case 0:
                                                                            x7 x7Var4 = x7Var3;
                                                                            m9 m9Var = (m9) u0Var;
                                                                            try {
                                                                                File file17 = x7Var4.P0;
                                                                                if (file17 != null) {
                                                                                    file17.delete();
                                                                                }
                                                                            } catch (Exception unused) {
                                                                            }
                                                                            try {
                                                                                File file18 = x7Var4.R0;
                                                                                if (file18 != null) {
                                                                                    file18.delete();
                                                                                }
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                            try {
                                                                                File file19 = x7Var4.Q0;
                                                                                if (file19 != null) {
                                                                                    file19.delete();
                                                                                }
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            x7Var4.P0 = null;
                                                                            x7Var4.R0 = null;
                                                                            x7Var4.Q0 = null;
                                                                            File file20 = x7Var4.Y0;
                                                                            if (file20 != null) {
                                                                                try {
                                                                                    file20.delete();
                                                                                } catch (Exception e10) {
                                                                                    org.telegram.messenger.a8.g(e10, true);
                                                                                }
                                                                                x7Var4.Y0 = null;
                                                                            }
                                                                            File file21 = x7Var4.X0;
                                                                            if (file21 != null) {
                                                                                try {
                                                                                    file21.delete();
                                                                                } catch (Exception e11) {
                                                                                    org.telegram.messenger.a8.g(e11, true);
                                                                                }
                                                                                x7Var4.X0 = null;
                                                                            }
                                                                            x7Var4.j |= z132;
                                                                            x7Var4.T0 = arrayList52;
                                                                            x7Var4.P0 = file162;
                                                                            x7Var4.Y0 = file142;
                                                                            x7Var4.R0 = file152;
                                                                            x7Var4.X0 = file5;
                                                                            x7Var4.Q0 = file8;
                                                                            x7Var4.U0 = arrayList3;
                                                                            m9Var.run();
                                                                            break;
                                                                        default:
                                                                            x7 x7Var5 = x7Var3;
                                                                            ai.u0 u0Var3 = (ai.u0) u0Var;
                                                                            try {
                                                                                File file22 = x7Var5.P0;
                                                                                if (file22 != null) {
                                                                                    file22.delete();
                                                                                }
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                            try {
                                                                                File file23 = x7Var5.R0;
                                                                                if (file23 != null) {
                                                                                    file23.delete();
                                                                                }
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                            try {
                                                                                File file24 = x7Var5.Q0;
                                                                                if (file24 != null) {
                                                                                    file24.delete();
                                                                                }
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                            x7Var5.P0 = null;
                                                                            x7Var5.R0 = null;
                                                                            x7Var5.Q0 = null;
                                                                            File file25 = x7Var5.Y0;
                                                                            if (file25 != null) {
                                                                                try {
                                                                                    file25.delete();
                                                                                } catch (Exception e12) {
                                                                                    org.telegram.messenger.a8.g(e12, true);
                                                                                }
                                                                                x7Var5.Y0 = null;
                                                                            }
                                                                            File file26 = x7Var5.X0;
                                                                            if (file26 != null) {
                                                                                try {
                                                                                    file26.delete();
                                                                                } catch (Exception e13) {
                                                                                    org.telegram.messenger.a8.g(e13, true);
                                                                                }
                                                                                x7Var5.X0 = null;
                                                                            }
                                                                            x7Var5.j |= z132;
                                                                            x7Var5.T0 = arrayList52;
                                                                            x7Var5.P0 = file162;
                                                                            x7Var5.Y0 = file142;
                                                                            x7Var5.R0 = file152;
                                                                            x7Var5.X0 = file5;
                                                                            x7Var5.Q0 = file8;
                                                                            x7Var5.U0 = arrayList3;
                                                                            u0Var3.run();
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
                                                if (v5Var.t0()) {
                                                }
                                                file8 = file7;
                                                final int i2522 = 1;
                                                final boolean z1322 = this.n;
                                                final ArrayList arrayList522 = arrayList4;
                                                final File file1422 = file3;
                                                final File file1522 = file6;
                                                final File file1622 = file4;
                                                org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.q9
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i2522) {
                                                            case 0:
                                                                x7 x7Var4 = x7Var3;
                                                                m9 m9Var = (m9) u0Var;
                                                                try {
                                                                    File file17 = x7Var4.P0;
                                                                    if (file17 != null) {
                                                                        file17.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file18 = x7Var4.R0;
                                                                    if (file18 != null) {
                                                                        file18.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file19 = x7Var4.Q0;
                                                                    if (file19 != null) {
                                                                        file19.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                x7Var4.P0 = null;
                                                                x7Var4.R0 = null;
                                                                x7Var4.Q0 = null;
                                                                File file20 = x7Var4.Y0;
                                                                if (file20 != null) {
                                                                    try {
                                                                        file20.delete();
                                                                    } catch (Exception e10) {
                                                                        org.telegram.messenger.a8.g(e10, true);
                                                                    }
                                                                    x7Var4.Y0 = null;
                                                                }
                                                                File file21 = x7Var4.X0;
                                                                if (file21 != null) {
                                                                    try {
                                                                        file21.delete();
                                                                    } catch (Exception e11) {
                                                                        org.telegram.messenger.a8.g(e11, true);
                                                                    }
                                                                    x7Var4.X0 = null;
                                                                }
                                                                x7Var4.j |= z1322;
                                                                x7Var4.T0 = arrayList522;
                                                                x7Var4.P0 = file1622;
                                                                x7Var4.Y0 = file1422;
                                                                x7Var4.R0 = file1522;
                                                                x7Var4.X0 = file5;
                                                                x7Var4.Q0 = file8;
                                                                x7Var4.U0 = arrayList3;
                                                                m9Var.run();
                                                                break;
                                                            default:
                                                                x7 x7Var5 = x7Var3;
                                                                ai.u0 u0Var3 = (ai.u0) u0Var;
                                                                try {
                                                                    File file22 = x7Var5.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file23 = x7Var5.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file24 = x7Var5.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                x7Var5.P0 = null;
                                                                x7Var5.R0 = null;
                                                                x7Var5.Q0 = null;
                                                                File file25 = x7Var5.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e12) {
                                                                        org.telegram.messenger.a8.g(e12, true);
                                                                    }
                                                                    x7Var5.Y0 = null;
                                                                }
                                                                File file26 = x7Var5.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e13) {
                                                                        org.telegram.messenger.a8.g(e13, true);
                                                                    }
                                                                    x7Var5.X0 = null;
                                                                }
                                                                x7Var5.j |= z1322;
                                                                x7Var5.T0 = arrayList522;
                                                                x7Var5.P0 = file1622;
                                                                x7Var5.Y0 = file1422;
                                                                x7Var5.R0 = file1522;
                                                                x7Var5.X0 = file5;
                                                                x7Var5.Q0 = file8;
                                                                x7Var5.U0 = arrayList3;
                                                                u0Var3.run();
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
                        if (v5Var.t0()) {
                        }
                        file8 = file7;
                        final int i25222 = 1;
                        final boolean z13222 = this.n;
                        final ArrayList arrayList5222 = arrayList4;
                        final File file14222 = file3;
                        final File file15222 = file6;
                        final File file16222 = file4;
                        org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.q9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i25222) {
                                    case 0:
                                        x7 x7Var4 = x7Var3;
                                        m9 m9Var = (m9) u0Var;
                                        try {
                                            File file17 = x7Var4.P0;
                                            if (file17 != null) {
                                                file17.delete();
                                            }
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            File file18 = x7Var4.R0;
                                            if (file18 != null) {
                                                file18.delete();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        try {
                                            File file19 = x7Var4.Q0;
                                            if (file19 != null) {
                                                file19.delete();
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        x7Var4.P0 = null;
                                        x7Var4.R0 = null;
                                        x7Var4.Q0 = null;
                                        File file20 = x7Var4.Y0;
                                        if (file20 != null) {
                                            try {
                                                file20.delete();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            x7Var4.Y0 = null;
                                        }
                                        File file21 = x7Var4.X0;
                                        if (file21 != null) {
                                            try {
                                                file21.delete();
                                            } catch (Exception e11) {
                                                org.telegram.messenger.a8.g(e11, true);
                                            }
                                            x7Var4.X0 = null;
                                        }
                                        x7Var4.j |= z13222;
                                        x7Var4.T0 = arrayList5222;
                                        x7Var4.P0 = file16222;
                                        x7Var4.Y0 = file14222;
                                        x7Var4.R0 = file15222;
                                        x7Var4.X0 = file5;
                                        x7Var4.Q0 = file8;
                                        x7Var4.U0 = arrayList3;
                                        m9Var.run();
                                        break;
                                    default:
                                        x7 x7Var5 = x7Var3;
                                        ai.u0 u0Var3 = (ai.u0) u0Var;
                                        try {
                                            File file22 = x7Var5.P0;
                                            if (file22 != null) {
                                                file22.delete();
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            File file23 = x7Var5.R0;
                                            if (file23 != null) {
                                                file23.delete();
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        try {
                                            File file24 = x7Var5.Q0;
                                            if (file24 != null) {
                                                file24.delete();
                                            }
                                        } catch (Exception unused6) {
                                        }
                                        x7Var5.P0 = null;
                                        x7Var5.R0 = null;
                                        x7Var5.Q0 = null;
                                        File file25 = x7Var5.Y0;
                                        if (file25 != null) {
                                            try {
                                                file25.delete();
                                            } catch (Exception e12) {
                                                org.telegram.messenger.a8.g(e12, true);
                                            }
                                            x7Var5.Y0 = null;
                                        }
                                        File file26 = x7Var5.X0;
                                        if (file26 != null) {
                                            try {
                                                file26.delete();
                                            } catch (Exception e13) {
                                                org.telegram.messenger.a8.g(e13, true);
                                            }
                                            x7Var5.X0 = null;
                                        }
                                        x7Var5.j |= z13222;
                                        x7Var5.T0 = arrayList5222;
                                        x7Var5.P0 = file16222;
                                        x7Var5.Y0 = file14222;
                                        x7Var5.R0 = file15222;
                                        x7Var5.X0 = file5;
                                        x7Var5.Q0 = file8;
                                        x7Var5.U0 = arrayList3;
                                        u0Var3.run();
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
                v5Var = v5Var5;
                file = null;
                file2 = null;
                if (x7Var3.u) {
                    int i182 = x7Var3.k0;
                    int i192 = x7Var3.l0;
                    r02 = v5Var.r0();
                    if (r02 != null) {
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
                if (v5Var.t0()) {
                }
                file8 = file7;
                final int i252222 = 1;
                final boolean z132222 = this.n;
                final ArrayList arrayList52222 = arrayList4;
                final File file142222 = file3;
                final File file152222 = file6;
                final File file162222 = file4;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.q9
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i252222) {
                            case 0:
                                x7 x7Var4 = x7Var3;
                                m9 m9Var = (m9) u0Var;
                                try {
                                    File file17 = x7Var4.P0;
                                    if (file17 != null) {
                                        file17.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18 = x7Var4.R0;
                                    if (file18 != null) {
                                        file18.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19 = x7Var4.Q0;
                                    if (file19 != null) {
                                        file19.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                x7Var4.P0 = null;
                                x7Var4.R0 = null;
                                x7Var4.Q0 = null;
                                File file20 = x7Var4.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    x7Var4.Y0 = null;
                                }
                                File file21 = x7Var4.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                    x7Var4.X0 = null;
                                }
                                x7Var4.j |= z132222;
                                x7Var4.T0 = arrayList52222;
                                x7Var4.P0 = file162222;
                                x7Var4.Y0 = file142222;
                                x7Var4.R0 = file152222;
                                x7Var4.X0 = file5;
                                x7Var4.Q0 = file8;
                                x7Var4.U0 = arrayList3;
                                m9Var.run();
                                break;
                            default:
                                x7 x7Var5 = x7Var3;
                                ai.u0 u0Var3 = (ai.u0) u0Var;
                                try {
                                    File file22 = x7Var5.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = x7Var5.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = x7Var5.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                x7Var5.P0 = null;
                                x7Var5.R0 = null;
                                x7Var5.Q0 = null;
                                File file25 = x7Var5.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e12) {
                                        org.telegram.messenger.a8.g(e12, true);
                                    }
                                    x7Var5.Y0 = null;
                                }
                                File file26 = x7Var5.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                    }
                                    x7Var5.X0 = null;
                                }
                                x7Var5.j |= z132222;
                                x7Var5.T0 = arrayList52222;
                                x7Var5.P0 = file162222;
                                x7Var5.Y0 = file142222;
                                x7Var5.R0 = file152222;
                                x7Var5.X0 = file5;
                                x7Var5.Q0 = file8;
                                x7Var5.U0 = arrayList3;
                                u0Var3.run();
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
                nb nbVar2 = (nb) this.b;
                v5 v5Var6 = (v5) this.c;
                x7 x7Var4 = (x7) this.f;
                final m9 m9Var = (m9) this.r;
                int i28 = nbVar2.c;
                ArrayList arrayList6 = new ArrayList();
                v5Var6.s0(arrayList6, false, false, false, false, x7Var4);
                if (!x7Var4.K) {
                    x7Var4.S0 = Utilities.k(v5Var6.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = v5Var6.getMasks();
                ArrayList arrayList7 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z14 = x7Var4.K;
                boolean E2 = x7Var4.E();
                arrayList6.clear();
                Bitmap s04 = v5Var6.s0(arrayList6, true, false, false, !z14, x7Var4);
                ArrayList arrayList8 = arrayList6.isEmpty() ? null : arrayList6;
                org.telegram.messenger.w7.G(i28);
                final File J = org.telegram.messenger.w7.J(org.telegram.messenger.ec.a0(s04, Bitmap.CompressFormat.PNG, x7Var4.i0, x7Var4.j0, 87), null, true, true);
                if (s04 != null && !s04.isRecycled()) {
                    s04.recycle();
                }
                boolean z15 = x7Var4.u;
                int i29 = this.d;
                int i30 = this.e;
                final ArrayList arrayList9 = arrayList7;
                if (z15) {
                    long j10 = x7Var4.z0;
                    if (j10 != Long.MIN_VALUE) {
                        Drawable drawable2 = x7Var4.x0;
                        if (drawable2 == null) {
                            drawable2 = f6.e(null, i28, j10, nbVar2.d2);
                        }
                        if (drawable2 != null) {
                            file10 = x7.w(i28, "webp");
                            Bitmap createBitmap3 = Bitmap.createBitmap(i29, i30, Bitmap.Config.ARGB_8888);
                            x7.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
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
                if (x7Var4.u && x7Var4.K) {
                    int i31 = x7Var4.k0;
                    int i32 = x7Var4.l0;
                    tg.z0 r03 = v5Var6.r0();
                    if (r03 != null) {
                        tg.u0 u0Var3 = r03.t0;
                        if (u0Var3.getChildCount() == 1 && i31 > 0 && i32 > 0) {
                            if (u0Var3.getChildAt(0) instanceof org.telegram.ui.Cells.r1) {
                                imageReceiver = ((org.telegram.ui.Cells.r1) u0Var3.getChildAt(0)).getPhotoImage();
                                if (imageReceiver != null) {
                                    float f19 = imageReceiver.N0;
                                    if (((int) f19) > 0) {
                                        float f20 = imageReceiver.O0;
                                        v5Var3 = v5Var6;
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
                                                    x7Var = x7Var4;
                                                    rectF2.set(f23 - f24, f25 - f26, f24 + f23, f26 + f25);
                                                    path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                                    Paint paint2 = new Paint(1);
                                                    paint2.setColor(-1);
                                                    canvas2.drawPath(path2, paint2);
                                                    try {
                                                        file11 = x7.w(i28, "webp");
                                                        createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file11));
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        file11 = null;
                                                    }
                                                    createBitmap4.recycle();
                                                    if (E2) {
                                                        i12 = i10;
                                                        v5Var4 = v5Var3;
                                                        i13 = i11;
                                                        x7Var2 = x7Var;
                                                        i14 = 87;
                                                        file12 = null;
                                                    } else {
                                                        i12 = i10;
                                                        v5Var4 = v5Var3;
                                                        i13 = i11;
                                                        x7Var2 = x7Var;
                                                        i14 = 87;
                                                        Bitmap s05 = v5Var4.s0(new ArrayList(), false, true, false, false, x7Var2);
                                                        org.telegram.messenger.w7.G(i28);
                                                        File J2 = org.telegram.messenger.w7.J(org.telegram.messenger.ec.a0(s05, Bitmap.CompressFormat.PNG, i12, i13, 87), null, true, true);
                                                        if (s05 != null && !s05.isRecycled()) {
                                                            s05.recycle();
                                                        }
                                                        file12 = J2;
                                                    }
                                                    if (this.h) {
                                                        Bitmap blurBitmap2 = v5Var4.getBlurBitmap();
                                                        org.telegram.messenger.w7.G(i28);
                                                        file13 = org.telegram.messenger.w7.J(org.telegram.messenger.ec.a0(blurBitmap2, Bitmap.CompressFormat.PNG, i12, i13, i14), null, true, true);
                                                        if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                                                            blurBitmap2.recycle();
                                                        }
                                                    } else {
                                                        file13 = null;
                                                    }
                                                    final x7 x7Var5 = x7Var2;
                                                    final File file17 = file10;
                                                    final File file18 = file13;
                                                    final File file19 = file12;
                                                    final ArrayList arrayList10 = arrayList8;
                                                    final int i36 = 0;
                                                    final boolean z16 = this.n;
                                                    final File file20 = file11;
                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.q9
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i36) {
                                                                case 0:
                                                                    x7 x7Var42 = x7Var5;
                                                                    m9 m9Var2 = (m9) m9Var;
                                                                    try {
                                                                        File file172 = x7Var42.P0;
                                                                        if (file172 != null) {
                                                                            file172.delete();
                                                                        }
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    try {
                                                                        File file182 = x7Var42.R0;
                                                                        if (file182 != null) {
                                                                            file182.delete();
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                    }
                                                                    try {
                                                                        File file192 = x7Var42.Q0;
                                                                        if (file192 != null) {
                                                                            file192.delete();
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                    }
                                                                    x7Var42.P0 = null;
                                                                    x7Var42.R0 = null;
                                                                    x7Var42.Q0 = null;
                                                                    File file202 = x7Var42.Y0;
                                                                    if (file202 != null) {
                                                                        try {
                                                                            file202.delete();
                                                                        } catch (Exception e102) {
                                                                            org.telegram.messenger.a8.g(e102, true);
                                                                        }
                                                                        x7Var42.Y0 = null;
                                                                    }
                                                                    File file21 = x7Var42.X0;
                                                                    if (file21 != null) {
                                                                        try {
                                                                            file21.delete();
                                                                        } catch (Exception e112) {
                                                                            org.telegram.messenger.a8.g(e112, true);
                                                                        }
                                                                        x7Var42.X0 = null;
                                                                    }
                                                                    x7Var42.j |= z16;
                                                                    x7Var42.T0 = arrayList10;
                                                                    x7Var42.P0 = J;
                                                                    x7Var42.Y0 = file17;
                                                                    x7Var42.R0 = file19;
                                                                    x7Var42.X0 = file20;
                                                                    x7Var42.Q0 = file18;
                                                                    x7Var42.U0 = arrayList9;
                                                                    m9Var2.run();
                                                                    break;
                                                                default:
                                                                    x7 x7Var52 = x7Var5;
                                                                    ai.u0 u0Var32 = (ai.u0) m9Var;
                                                                    try {
                                                                        File file22 = x7Var52.P0;
                                                                        if (file22 != null) {
                                                                            file22.delete();
                                                                        }
                                                                    } catch (Exception unused4) {
                                                                    }
                                                                    try {
                                                                        File file23 = x7Var52.R0;
                                                                        if (file23 != null) {
                                                                            file23.delete();
                                                                        }
                                                                    } catch (Exception unused5) {
                                                                    }
                                                                    try {
                                                                        File file24 = x7Var52.Q0;
                                                                        if (file24 != null) {
                                                                            file24.delete();
                                                                        }
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                    x7Var52.P0 = null;
                                                                    x7Var52.R0 = null;
                                                                    x7Var52.Q0 = null;
                                                                    File file25 = x7Var52.Y0;
                                                                    if (file25 != null) {
                                                                        try {
                                                                            file25.delete();
                                                                        } catch (Exception e12) {
                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                        }
                                                                        x7Var52.Y0 = null;
                                                                    }
                                                                    File file26 = x7Var52.X0;
                                                                    if (file26 != null) {
                                                                        try {
                                                                            file26.delete();
                                                                        } catch (Exception e13) {
                                                                            org.telegram.messenger.a8.g(e13, true);
                                                                        }
                                                                        x7Var52.X0 = null;
                                                                    }
                                                                    x7Var52.j |= z16;
                                                                    x7Var52.T0 = arrayList10;
                                                                    x7Var52.P0 = J;
                                                                    x7Var52.Y0 = file17;
                                                                    x7Var52.R0 = file19;
                                                                    x7Var52.X0 = file20;
                                                                    x7Var52.Q0 = file18;
                                                                    x7Var52.U0 = arrayList9;
                                                                    u0Var32.run();
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
                                        x7Var = x7Var4;
                                        file11 = null;
                                        if (E2) {
                                        }
                                        if (this.h) {
                                        }
                                        final x7 x7Var52 = x7Var2;
                                        final File file172 = file10;
                                        final File file182 = file13;
                                        final File file192 = file12;
                                        final ArrayList arrayList102 = arrayList8;
                                        final int i362 = 0;
                                        final boolean z162 = this.n;
                                        final File file202 = file11;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.q9
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i362) {
                                                    case 0:
                                                        x7 x7Var42 = x7Var52;
                                                        m9 m9Var2 = (m9) m9Var;
                                                        try {
                                                            File file1722 = x7Var42.P0;
                                                            if (file1722 != null) {
                                                                file1722.delete();
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                        try {
                                                            File file1822 = x7Var42.R0;
                                                            if (file1822 != null) {
                                                                file1822.delete();
                                                            }
                                                        } catch (Exception unused2) {
                                                        }
                                                        try {
                                                            File file1922 = x7Var42.Q0;
                                                            if (file1922 != null) {
                                                                file1922.delete();
                                                            }
                                                        } catch (Exception unused3) {
                                                        }
                                                        x7Var42.P0 = null;
                                                        x7Var42.R0 = null;
                                                        x7Var42.Q0 = null;
                                                        File file2022 = x7Var42.Y0;
                                                        if (file2022 != null) {
                                                            try {
                                                                file2022.delete();
                                                            } catch (Exception e102) {
                                                                org.telegram.messenger.a8.g(e102, true);
                                                            }
                                                            x7Var42.Y0 = null;
                                                        }
                                                        File file21 = x7Var42.X0;
                                                        if (file21 != null) {
                                                            try {
                                                                file21.delete();
                                                            } catch (Exception e112) {
                                                                org.telegram.messenger.a8.g(e112, true);
                                                            }
                                                            x7Var42.X0 = null;
                                                        }
                                                        x7Var42.j |= z162;
                                                        x7Var42.T0 = arrayList102;
                                                        x7Var42.P0 = J;
                                                        x7Var42.Y0 = file172;
                                                        x7Var42.R0 = file192;
                                                        x7Var42.X0 = file202;
                                                        x7Var42.Q0 = file182;
                                                        x7Var42.U0 = arrayList9;
                                                        m9Var2.run();
                                                        break;
                                                    default:
                                                        x7 x7Var522 = x7Var52;
                                                        ai.u0 u0Var32 = (ai.u0) m9Var;
                                                        try {
                                                            File file22 = x7Var522.P0;
                                                            if (file22 != null) {
                                                                file22.delete();
                                                            }
                                                        } catch (Exception unused4) {
                                                        }
                                                        try {
                                                            File file23 = x7Var522.R0;
                                                            if (file23 != null) {
                                                                file23.delete();
                                                            }
                                                        } catch (Exception unused5) {
                                                        }
                                                        try {
                                                            File file24 = x7Var522.Q0;
                                                            if (file24 != null) {
                                                                file24.delete();
                                                            }
                                                        } catch (Exception unused6) {
                                                        }
                                                        x7Var522.P0 = null;
                                                        x7Var522.R0 = null;
                                                        x7Var522.Q0 = null;
                                                        File file25 = x7Var522.Y0;
                                                        if (file25 != null) {
                                                            try {
                                                                file25.delete();
                                                            } catch (Exception e12) {
                                                                org.telegram.messenger.a8.g(e12, true);
                                                            }
                                                            x7Var522.Y0 = null;
                                                        }
                                                        File file26 = x7Var522.X0;
                                                        if (file26 != null) {
                                                            try {
                                                                file26.delete();
                                                            } catch (Exception e13) {
                                                                org.telegram.messenger.a8.g(e13, true);
                                                            }
                                                            x7Var522.X0 = null;
                                                        }
                                                        x7Var522.j |= z162;
                                                        x7Var522.T0 = arrayList102;
                                                        x7Var522.P0 = J;
                                                        x7Var522.Y0 = file172;
                                                        x7Var522.R0 = file192;
                                                        x7Var522.X0 = file202;
                                                        x7Var522.Q0 = file182;
                                                        x7Var522.U0 = arrayList9;
                                                        u0Var32.run();
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
                v5Var3 = v5Var6;
                i10 = i29;
                i11 = i30;
                x7Var = x7Var4;
                file11 = null;
                if (E2) {
                }
                if (this.h) {
                }
                final x7 x7Var522 = x7Var2;
                final File file1722 = file10;
                final File file1822 = file13;
                final File file1922 = file12;
                final ArrayList arrayList1022 = arrayList8;
                final int i3622 = 0;
                final boolean z1622 = this.n;
                final File file2022 = file11;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.q9
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3622) {
                            case 0:
                                x7 x7Var42 = x7Var522;
                                m9 m9Var2 = (m9) m9Var;
                                try {
                                    File file17222 = x7Var42.P0;
                                    if (file17222 != null) {
                                        file17222.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18222 = x7Var42.R0;
                                    if (file18222 != null) {
                                        file18222.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19222 = x7Var42.Q0;
                                    if (file19222 != null) {
                                        file19222.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                x7Var42.P0 = null;
                                x7Var42.R0 = null;
                                x7Var42.Q0 = null;
                                File file20222 = x7Var42.Y0;
                                if (file20222 != null) {
                                    try {
                                        file20222.delete();
                                    } catch (Exception e102) {
                                        org.telegram.messenger.a8.g(e102, true);
                                    }
                                    x7Var42.Y0 = null;
                                }
                                File file21 = x7Var42.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e112) {
                                        org.telegram.messenger.a8.g(e112, true);
                                    }
                                    x7Var42.X0 = null;
                                }
                                x7Var42.j |= z1622;
                                x7Var42.T0 = arrayList1022;
                                x7Var42.P0 = J;
                                x7Var42.Y0 = file1722;
                                x7Var42.R0 = file1922;
                                x7Var42.X0 = file2022;
                                x7Var42.Q0 = file1822;
                                x7Var42.U0 = arrayList9;
                                m9Var2.run();
                                break;
                            default:
                                x7 x7Var5222 = x7Var522;
                                ai.u0 u0Var32 = (ai.u0) m9Var;
                                try {
                                    File file22 = x7Var5222.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = x7Var5222.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = x7Var5222.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                x7Var5222.P0 = null;
                                x7Var5222.R0 = null;
                                x7Var5222.Q0 = null;
                                File file25 = x7Var5222.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e12) {
                                        org.telegram.messenger.a8.g(e12, true);
                                    }
                                    x7Var5222.Y0 = null;
                                }
                                File file26 = x7Var5222.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                    }
                                    x7Var5222.X0 = null;
                                }
                                x7Var5222.j |= z1622;
                                x7Var5222.T0 = arrayList1022;
                                x7Var5222.P0 = J;
                                x7Var5222.Y0 = file1722;
                                x7Var5222.R0 = file1922;
                                x7Var5222.X0 = file2022;
                                x7Var5222.Q0 = file1822;
                                x7Var5222.U0 = arrayList9;
                                u0Var32.run();
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

    public /* synthetic */ p9(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
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
