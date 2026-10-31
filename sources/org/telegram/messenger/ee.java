package org.telegram.messenger;

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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ us f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ee(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11) {
        this.a = 0;
        this.f = mediaController;
        this.h = file;
        this.n = file2;
        this.r = tL_document;
        this.b = i10;
        this.d = z10;
        this.c = i11;
        this.e = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e0, code lost:
    
        if (r13.isRecycled() != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0470 A[LOOP:2: B:151:0x046e->B:152:0x0470, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.telegram.messenger.ImageReceiver] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        vh.b4 b4Var;
        File file;
        File file2;
        File file3;
        String str;
        boolean z11;
        File file4;
        final File file5;
        File file6;
        File file7;
        final File file8;
        int size;
        int i10;
        vh.b4 b4Var2;
        String str2;
        jg.j1 p02;
        ?? r12;
        File file9;
        File file10;
        vh.b4 b4Var3;
        int i11;
        int i12;
        vh.n5 n5Var;
        File file11;
        int i13;
        vh.b4 b4Var4;
        int i14;
        vh.n5 n5Var2;
        int i15;
        File file12;
        File file13;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 0:
                MediaController.c((MediaController) this.f, (File) this.h, (File) this.n, (TLRPC.TL_document) this.r, this.b, this.d, this.c, this.e);
                return;
            case 1:
                vh.o8 o8Var = (vh.o8) this.f;
                vh.b4 b4Var5 = (vh.b4) this.h;
                final vh.n5 n5Var3 = (vh.n5) this.n;
                final org.telegram.utils.twidget.v vVar = (org.telegram.utils.twidget.v) this.r;
                int i16 = o8Var.c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                b4Var5.q0(arrayList2, false, false, false, false, n5Var3);
                if (!n5Var3.K) {
                    n5Var3.S0 = Utilities.k(b4Var5.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = b4Var5.getMasks();
                final ArrayList arrayList3 = masks != null ? new ArrayList(masks) : null;
                boolean z12 = n5Var3.K;
                boolean E = n5Var3.E();
                arrayList2.clear();
                Bitmap q02 = b4Var5.q0(arrayList2, true, false, false, !z12, n5Var3);
                ArrayList arrayList4 = arrayList2.isEmpty() ? null : arrayList2;
                File w9 = vh.n5.w(i16, "png");
                arrayList.add(new org.telegram.ui.ActionBar.w3(q02, w9, 1));
                if (n5Var3.u) {
                    z10 = E;
                    long j10 = n5Var3.z0;
                    if (j10 != Long.MIN_VALUE) {
                        Drawable drawable = n5Var3.x0;
                        if (drawable == null) {
                            file = null;
                            drawable = vh.k4.e(null, i16, j10, o8Var.c2);
                        } else {
                            file = null;
                        }
                        if (drawable != null) {
                            File w10 = vh.n5.w(i16, "webp");
                            Bitmap createBitmap = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                            b4Var = b4Var5;
                            vh.n5.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            arrayList.add(new org.telegram.ui.ActionBar.w3(createBitmap, w10, 2));
                            file9 = w10;
                        } else {
                            b4Var = b4Var5;
                            file9 = file;
                        }
                        file2 = file9;
                        if (n5Var3.u && n5Var3.K) {
                            int i17 = n5Var3.k0;
                            int i18 = n5Var3.l0;
                            p02 = b4Var.p0();
                            if (p02 != null) {
                                jg.c1 c1Var = p02.r0;
                                if (c1Var.getChildCount() == 1 && i17 > 0 && i18 > 0) {
                                    if (c1Var.getChildAt(0) instanceof org.telegram.ui.Cells.q1) {
                                        r12 = ((org.telegram.ui.Cells.q1) c1Var.getChildAt(0)).getPhotoImage();
                                        if (r12 != 0) {
                                            float f7 = r12.M0;
                                            if (((int) f7) > 0) {
                                                float f10 = r12.N0;
                                                file3 = file2;
                                                if (((int) f10) > 0) {
                                                    float f11 = i17;
                                                    float f12 = i18;
                                                    float max = Math.max(f7 / f11, f10 / f12);
                                                    int i19 = (int) ((f11 * max) / 2.0f);
                                                    int i20 = (int) ((f12 * max) / 2.0f);
                                                    Bitmap createBitmap2 = Bitmap.createBitmap(i19, i20, Bitmap.Config.ARGB_8888);
                                                    float[] fArr = new float[8];
                                                    str = "png";
                                                    int i21 = 0;
                                                    while (true) {
                                                        int[] iArr = r12.W0;
                                                        z11 = z10;
                                                        if (i21 >= iArr.length) {
                                                            Canvas canvas = new Canvas(createBitmap2);
                                                            Path path = new Path();
                                                            canvas.scale(0.5f, 0.5f);
                                                            RectF rectF = i0.P;
                                                            float f13 = (i19 * 2.0f) / 2.0f;
                                                            float f14 = r12.M0 / 2.0f;
                                                            float f15 = (i20 * 2.0f) / 2.0f;
                                                            float f16 = r12.N0 / 2.0f;
                                                            file4 = w9;
                                                            rectF.set(f13 - f14, f15 - f16, f14 + f13, f16 + f15);
                                                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                                            Paint paint = new Paint(1);
                                                            paint.setColor(-1);
                                                            canvas.drawPath(path, paint);
                                                            File w11 = vh.n5.w(i16, "webp");
                                                            arrayList.add(new org.telegram.ui.ActionBar.w3(createBitmap2, w11, 3));
                                                            file5 = w11;
                                                            if (b4Var.r0()) {
                                                                file6 = n5Var3.R0;
                                                                file7 = n5Var3.Q0;
                                                            } else {
                                                                if (z11) {
                                                                    b4Var2 = b4Var;
                                                                    str2 = str;
                                                                    file6 = file;
                                                                } else {
                                                                    b4Var2 = b4Var;
                                                                    str2 = str;
                                                                    Bitmap q03 = b4Var2.q0(new ArrayList(), false, true, false, false, n5Var3);
                                                                    file6 = vh.n5.w(i16, str2);
                                                                    arrayList.add(new org.telegram.ui.ActionBar.w3(q03, file6, 4));
                                                                }
                                                                if (!this.d) {
                                                                    file8 = file;
                                                                    final int i22 = 1;
                                                                    final boolean z13 = this.e;
                                                                    final ArrayList arrayList5 = arrayList4;
                                                                    final File file14 = file3;
                                                                    final File file15 = file6;
                                                                    final File file16 = file4;
                                                                    i0.g3(new Runnable() { // from class: vh.b7
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i22) {
                                                                                case 0:
                                                                                    n5 n5Var4 = n5Var3;
                                                                                    y6 y6Var = (y6) vVar;
                                                                                    try {
                                                                                        File file17 = n5Var4.P0;
                                                                                        if (file17 != null) {
                                                                                            file17.delete();
                                                                                        }
                                                                                    } catch (Exception unused) {
                                                                                    }
                                                                                    try {
                                                                                        File file18 = n5Var4.R0;
                                                                                        if (file18 != null) {
                                                                                            file18.delete();
                                                                                        }
                                                                                    } catch (Exception unused2) {
                                                                                    }
                                                                                    try {
                                                                                        File file19 = n5Var4.Q0;
                                                                                        if (file19 != null) {
                                                                                            file19.delete();
                                                                                        }
                                                                                    } catch (Exception unused3) {
                                                                                    }
                                                                                    n5Var4.P0 = null;
                                                                                    n5Var4.R0 = null;
                                                                                    n5Var4.Q0 = null;
                                                                                    File file20 = n5Var4.Y0;
                                                                                    if (file20 != null) {
                                                                                        try {
                                                                                            file20.delete();
                                                                                        } catch (Exception e) {
                                                                                            org.telegram.messenger.f8.g(e, true);
                                                                                        }
                                                                                        n5Var4.Y0 = null;
                                                                                    }
                                                                                    File file21 = n5Var4.X0;
                                                                                    if (file21 != null) {
                                                                                        try {
                                                                                            file21.delete();
                                                                                        } catch (Exception e7) {
                                                                                            org.telegram.messenger.f8.g(e7, true);
                                                                                        }
                                                                                        n5Var4.X0 = null;
                                                                                    }
                                                                                    n5Var4.j |= z13;
                                                                                    n5Var4.T0 = arrayList5;
                                                                                    n5Var4.P0 = file16;
                                                                                    n5Var4.Y0 = file14;
                                                                                    n5Var4.R0 = file15;
                                                                                    n5Var4.X0 = file5;
                                                                                    n5Var4.Q0 = file8;
                                                                                    n5Var4.U0 = arrayList3;
                                                                                    y6Var.run();
                                                                                    break;
                                                                                default:
                                                                                    n5 n5Var5 = n5Var3;
                                                                                    org.telegram.utils.twidget.v vVar2 = (org.telegram.utils.twidget.v) vVar;
                                                                                    try {
                                                                                        File file22 = n5Var5.P0;
                                                                                        if (file22 != null) {
                                                                                            file22.delete();
                                                                                        }
                                                                                    } catch (Exception unused4) {
                                                                                    }
                                                                                    try {
                                                                                        File file23 = n5Var5.R0;
                                                                                        if (file23 != null) {
                                                                                            file23.delete();
                                                                                        }
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    try {
                                                                                        File file24 = n5Var5.Q0;
                                                                                        if (file24 != null) {
                                                                                            file24.delete();
                                                                                        }
                                                                                    } catch (Exception unused6) {
                                                                                    }
                                                                                    n5Var5.P0 = null;
                                                                                    n5Var5.R0 = null;
                                                                                    n5Var5.Q0 = null;
                                                                                    File file25 = n5Var5.Y0;
                                                                                    if (file25 != null) {
                                                                                        try {
                                                                                            file25.delete();
                                                                                        } catch (Exception e10) {
                                                                                            org.telegram.messenger.f8.g(e10, true);
                                                                                        }
                                                                                        n5Var5.Y0 = null;
                                                                                    }
                                                                                    File file26 = n5Var5.X0;
                                                                                    if (file26 != null) {
                                                                                        try {
                                                                                            file26.delete();
                                                                                        } catch (Exception e11) {
                                                                                            org.telegram.messenger.f8.g(e11, true);
                                                                                        }
                                                                                        n5Var5.X0 = null;
                                                                                    }
                                                                                    n5Var5.j |= z13;
                                                                                    n5Var5.T0 = arrayList5;
                                                                                    n5Var5.P0 = file16;
                                                                                    n5Var5.Y0 = file14;
                                                                                    n5Var5.R0 = file15;
                                                                                    n5Var5.X0 = file5;
                                                                                    n5Var5.Q0 = file8;
                                                                                    n5Var5.U0 = arrayList3;
                                                                                    vVar2.run();
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    size = arrayList.size();
                                                                    i10 = 0;
                                                                    while (i10 < size) {
                                                                        Object obj = arrayList.get(i10);
                                                                        i10++;
                                                                        ((Runnable) obj).run();
                                                                    }
                                                                    return;
                                                                }
                                                                Bitmap blurBitmap = b4Var2.getBlurBitmap();
                                                                file7 = vh.n5.w(i16, str2);
                                                                arrayList.add(new org.telegram.ui.ActionBar.w3(blurBitmap, file7, 5));
                                                            }
                                                            file8 = file7;
                                                            final int i222 = 1;
                                                            final boolean z132 = this.e;
                                                            final ArrayList arrayList52 = arrayList4;
                                                            final File file142 = file3;
                                                            final File file152 = file6;
                                                            final File file162 = file4;
                                                            i0.g3(new Runnable() { // from class: vh.b7
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i222) {
                                                                        case 0:
                                                                            n5 n5Var4 = n5Var3;
                                                                            y6 y6Var = (y6) vVar;
                                                                            try {
                                                                                File file17 = n5Var4.P0;
                                                                                if (file17 != null) {
                                                                                    file17.delete();
                                                                                }
                                                                            } catch (Exception unused) {
                                                                            }
                                                                            try {
                                                                                File file18 = n5Var4.R0;
                                                                                if (file18 != null) {
                                                                                    file18.delete();
                                                                                }
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                            try {
                                                                                File file19 = n5Var4.Q0;
                                                                                if (file19 != null) {
                                                                                    file19.delete();
                                                                                }
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            n5Var4.P0 = null;
                                                                            n5Var4.R0 = null;
                                                                            n5Var4.Q0 = null;
                                                                            File file20 = n5Var4.Y0;
                                                                            if (file20 != null) {
                                                                                try {
                                                                                    file20.delete();
                                                                                } catch (Exception e) {
                                                                                    org.telegram.messenger.f8.g(e, true);
                                                                                }
                                                                                n5Var4.Y0 = null;
                                                                            }
                                                                            File file21 = n5Var4.X0;
                                                                            if (file21 != null) {
                                                                                try {
                                                                                    file21.delete();
                                                                                } catch (Exception e7) {
                                                                                    org.telegram.messenger.f8.g(e7, true);
                                                                                }
                                                                                n5Var4.X0 = null;
                                                                            }
                                                                            n5Var4.j |= z132;
                                                                            n5Var4.T0 = arrayList52;
                                                                            n5Var4.P0 = file162;
                                                                            n5Var4.Y0 = file142;
                                                                            n5Var4.R0 = file152;
                                                                            n5Var4.X0 = file5;
                                                                            n5Var4.Q0 = file8;
                                                                            n5Var4.U0 = arrayList3;
                                                                            y6Var.run();
                                                                            break;
                                                                        default:
                                                                            n5 n5Var5 = n5Var3;
                                                                            org.telegram.utils.twidget.v vVar2 = (org.telegram.utils.twidget.v) vVar;
                                                                            try {
                                                                                File file22 = n5Var5.P0;
                                                                                if (file22 != null) {
                                                                                    file22.delete();
                                                                                }
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                            try {
                                                                                File file23 = n5Var5.R0;
                                                                                if (file23 != null) {
                                                                                    file23.delete();
                                                                                }
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                            try {
                                                                                File file24 = n5Var5.Q0;
                                                                                if (file24 != null) {
                                                                                    file24.delete();
                                                                                }
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                            n5Var5.P0 = null;
                                                                            n5Var5.R0 = null;
                                                                            n5Var5.Q0 = null;
                                                                            File file25 = n5Var5.Y0;
                                                                            if (file25 != null) {
                                                                                try {
                                                                                    file25.delete();
                                                                                } catch (Exception e10) {
                                                                                    org.telegram.messenger.f8.g(e10, true);
                                                                                }
                                                                                n5Var5.Y0 = null;
                                                                            }
                                                                            File file26 = n5Var5.X0;
                                                                            if (file26 != null) {
                                                                                try {
                                                                                    file26.delete();
                                                                                } catch (Exception e11) {
                                                                                    org.telegram.messenger.f8.g(e11, true);
                                                                                }
                                                                                n5Var5.X0 = null;
                                                                            }
                                                                            n5Var5.j |= z132;
                                                                            n5Var5.T0 = arrayList52;
                                                                            n5Var5.P0 = file162;
                                                                            n5Var5.Y0 = file142;
                                                                            n5Var5.R0 = file152;
                                                                            n5Var5.X0 = file5;
                                                                            n5Var5.Q0 = file8;
                                                                            n5Var5.U0 = arrayList3;
                                                                            vVar2.run();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            size = arrayList.size();
                                                            i10 = 0;
                                                            while (i10 < size) {
                                                            }
                                                            return;
                                                        }
                                                        int i23 = i21 * 2;
                                                        float f17 = iArr[i21];
                                                        fArr[i23] = f17;
                                                        fArr[i23 + 1] = f17;
                                                        i21++;
                                                        z10 = z11;
                                                    }
                                                }
                                                str = "png";
                                                z11 = z10;
                                                file4 = w9;
                                                file5 = file;
                                                if (b4Var.r0()) {
                                                }
                                                file8 = file7;
                                                final int i2222 = 1;
                                                final boolean z1322 = this.e;
                                                final ArrayList arrayList522 = arrayList4;
                                                final File file1422 = file3;
                                                final File file1522 = file6;
                                                final File file1622 = file4;
                                                i0.g3(new Runnable() { // from class: vh.b7
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i2222) {
                                                            case 0:
                                                                n5 n5Var4 = n5Var3;
                                                                y6 y6Var = (y6) vVar;
                                                                try {
                                                                    File file17 = n5Var4.P0;
                                                                    if (file17 != null) {
                                                                        file17.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file18 = n5Var4.R0;
                                                                    if (file18 != null) {
                                                                        file18.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file19 = n5Var4.Q0;
                                                                    if (file19 != null) {
                                                                        file19.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                n5Var4.P0 = null;
                                                                n5Var4.R0 = null;
                                                                n5Var4.Q0 = null;
                                                                File file20 = n5Var4.Y0;
                                                                if (file20 != null) {
                                                                    try {
                                                                        file20.delete();
                                                                    } catch (Exception e) {
                                                                        org.telegram.messenger.f8.g(e, true);
                                                                    }
                                                                    n5Var4.Y0 = null;
                                                                }
                                                                File file21 = n5Var4.X0;
                                                                if (file21 != null) {
                                                                    try {
                                                                        file21.delete();
                                                                    } catch (Exception e7) {
                                                                        org.telegram.messenger.f8.g(e7, true);
                                                                    }
                                                                    n5Var4.X0 = null;
                                                                }
                                                                n5Var4.j |= z1322;
                                                                n5Var4.T0 = arrayList522;
                                                                n5Var4.P0 = file1622;
                                                                n5Var4.Y0 = file1422;
                                                                n5Var4.R0 = file1522;
                                                                n5Var4.X0 = file5;
                                                                n5Var4.Q0 = file8;
                                                                n5Var4.U0 = arrayList3;
                                                                y6Var.run();
                                                                break;
                                                            default:
                                                                n5 n5Var5 = n5Var3;
                                                                org.telegram.utils.twidget.v vVar2 = (org.telegram.utils.twidget.v) vVar;
                                                                try {
                                                                    File file22 = n5Var5.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file23 = n5Var5.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file24 = n5Var5.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                n5Var5.P0 = null;
                                                                n5Var5.R0 = null;
                                                                n5Var5.Q0 = null;
                                                                File file25 = n5Var5.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e10) {
                                                                        org.telegram.messenger.f8.g(e10, true);
                                                                    }
                                                                    n5Var5.Y0 = null;
                                                                }
                                                                File file26 = n5Var5.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e11) {
                                                                        org.telegram.messenger.f8.g(e11, true);
                                                                    }
                                                                    n5Var5.X0 = null;
                                                                }
                                                                n5Var5.j |= z1322;
                                                                n5Var5.T0 = arrayList522;
                                                                n5Var5.P0 = file1622;
                                                                n5Var5.Y0 = file1422;
                                                                n5Var5.R0 = file1522;
                                                                n5Var5.X0 = file5;
                                                                n5Var5.Q0 = file8;
                                                                n5Var5.U0 = arrayList3;
                                                                vVar2.run();
                                                                break;
                                                        }
                                                    }
                                                });
                                                size = arrayList.size();
                                                i10 = 0;
                                                while (i10 < size) {
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
                        file4 = w9;
                        file5 = file;
                        if (b4Var.r0()) {
                        }
                        file8 = file7;
                        final int i22222 = 1;
                        final boolean z13222 = this.e;
                        final ArrayList arrayList5222 = arrayList4;
                        final File file14222 = file3;
                        final File file15222 = file6;
                        final File file16222 = file4;
                        i0.g3(new Runnable() { // from class: vh.b7
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i22222) {
                                    case 0:
                                        n5 n5Var4 = n5Var3;
                                        y6 y6Var = (y6) vVar;
                                        try {
                                            File file17 = n5Var4.P0;
                                            if (file17 != null) {
                                                file17.delete();
                                            }
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            File file18 = n5Var4.R0;
                                            if (file18 != null) {
                                                file18.delete();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        try {
                                            File file19 = n5Var4.Q0;
                                            if (file19 != null) {
                                                file19.delete();
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        n5Var4.P0 = null;
                                        n5Var4.R0 = null;
                                        n5Var4.Q0 = null;
                                        File file20 = n5Var4.Y0;
                                        if (file20 != null) {
                                            try {
                                                file20.delete();
                                            } catch (Exception e) {
                                                org.telegram.messenger.f8.g(e, true);
                                            }
                                            n5Var4.Y0 = null;
                                        }
                                        File file21 = n5Var4.X0;
                                        if (file21 != null) {
                                            try {
                                                file21.delete();
                                            } catch (Exception e7) {
                                                org.telegram.messenger.f8.g(e7, true);
                                            }
                                            n5Var4.X0 = null;
                                        }
                                        n5Var4.j |= z13222;
                                        n5Var4.T0 = arrayList5222;
                                        n5Var4.P0 = file16222;
                                        n5Var4.Y0 = file14222;
                                        n5Var4.R0 = file15222;
                                        n5Var4.X0 = file5;
                                        n5Var4.Q0 = file8;
                                        n5Var4.U0 = arrayList3;
                                        y6Var.run();
                                        break;
                                    default:
                                        n5 n5Var5 = n5Var3;
                                        org.telegram.utils.twidget.v vVar2 = (org.telegram.utils.twidget.v) vVar;
                                        try {
                                            File file22 = n5Var5.P0;
                                            if (file22 != null) {
                                                file22.delete();
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            File file23 = n5Var5.R0;
                                            if (file23 != null) {
                                                file23.delete();
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        try {
                                            File file24 = n5Var5.Q0;
                                            if (file24 != null) {
                                                file24.delete();
                                            }
                                        } catch (Exception unused6) {
                                        }
                                        n5Var5.P0 = null;
                                        n5Var5.R0 = null;
                                        n5Var5.Q0 = null;
                                        File file25 = n5Var5.Y0;
                                        if (file25 != null) {
                                            try {
                                                file25.delete();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.f8.g(e10, true);
                                            }
                                            n5Var5.Y0 = null;
                                        }
                                        File file26 = n5Var5.X0;
                                        if (file26 != null) {
                                            try {
                                                file26.delete();
                                            } catch (Exception e11) {
                                                org.telegram.messenger.f8.g(e11, true);
                                            }
                                            n5Var5.X0 = null;
                                        }
                                        n5Var5.j |= z13222;
                                        n5Var5.T0 = arrayList5222;
                                        n5Var5.P0 = file16222;
                                        n5Var5.Y0 = file14222;
                                        n5Var5.R0 = file15222;
                                        n5Var5.X0 = file5;
                                        n5Var5.Q0 = file8;
                                        n5Var5.U0 = arrayList3;
                                        vVar2.run();
                                        break;
                                }
                            }
                        });
                        size = arrayList.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        return;
                    }
                } else {
                    z10 = E;
                }
                b4Var = b4Var5;
                file = null;
                file2 = null;
                if (n5Var3.u) {
                    int i172 = n5Var3.k0;
                    int i182 = n5Var3.l0;
                    p02 = b4Var.p0();
                    if (p02 != null) {
                    }
                    r12 = file;
                    if (r12 != 0) {
                    }
                }
                file3 = file2;
                str = "png";
                z11 = z10;
                file4 = w9;
                file5 = file;
                if (b4Var.r0()) {
                }
                file8 = file7;
                final int i222222 = 1;
                final boolean z132222 = this.e;
                final ArrayList arrayList52222 = arrayList4;
                final File file142222 = file3;
                final File file152222 = file6;
                final File file162222 = file4;
                i0.g3(new Runnable() { // from class: vh.b7
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i222222) {
                            case 0:
                                n5 n5Var4 = n5Var3;
                                y6 y6Var = (y6) vVar;
                                try {
                                    File file17 = n5Var4.P0;
                                    if (file17 != null) {
                                        file17.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18 = n5Var4.R0;
                                    if (file18 != null) {
                                        file18.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19 = n5Var4.Q0;
                                    if (file19 != null) {
                                        file19.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                n5Var4.P0 = null;
                                n5Var4.R0 = null;
                                n5Var4.Q0 = null;
                                File file20 = n5Var4.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    n5Var4.Y0 = null;
                                }
                                File file21 = n5Var4.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e7) {
                                        org.telegram.messenger.f8.g(e7, true);
                                    }
                                    n5Var4.X0 = null;
                                }
                                n5Var4.j |= z132222;
                                n5Var4.T0 = arrayList52222;
                                n5Var4.P0 = file162222;
                                n5Var4.Y0 = file142222;
                                n5Var4.R0 = file152222;
                                n5Var4.X0 = file5;
                                n5Var4.Q0 = file8;
                                n5Var4.U0 = arrayList3;
                                y6Var.run();
                                break;
                            default:
                                n5 n5Var5 = n5Var3;
                                org.telegram.utils.twidget.v vVar2 = (org.telegram.utils.twidget.v) vVar;
                                try {
                                    File file22 = n5Var5.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = n5Var5.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = n5Var5.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                n5Var5.P0 = null;
                                n5Var5.R0 = null;
                                n5Var5.Q0 = null;
                                File file25 = n5Var5.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.f8.g(e10, true);
                                    }
                                    n5Var5.Y0 = null;
                                }
                                File file26 = n5Var5.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.f8.g(e11, true);
                                    }
                                    n5Var5.X0 = null;
                                }
                                n5Var5.j |= z132222;
                                n5Var5.T0 = arrayList52222;
                                n5Var5.P0 = file162222;
                                n5Var5.Y0 = file142222;
                                n5Var5.R0 = file152222;
                                n5Var5.X0 = file5;
                                n5Var5.Q0 = file8;
                                n5Var5.U0 = arrayList3;
                                vVar2.run();
                                break;
                        }
                    }
                });
                size = arrayList.size();
                i10 = 0;
                while (i10 < size) {
                }
                return;
            default:
                vh.o8 o8Var2 = (vh.o8) this.f;
                vh.b4 b4Var6 = (vh.b4) this.h;
                vh.n5 n5Var4 = (vh.n5) this.n;
                final vh.y6 y6Var = (vh.y6) this.r;
                int i24 = o8Var2.c;
                ArrayList arrayList6 = new ArrayList();
                b4Var6.q0(arrayList6, false, false, false, false, n5Var4);
                if (!n5Var4.K) {
                    n5Var4.S0 = Utilities.k(b4Var6.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = b4Var6.getMasks();
                ArrayList arrayList7 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z14 = n5Var4.K;
                boolean E2 = n5Var4.E();
                arrayList6.clear();
                Bitmap q04 = b4Var6.q0(arrayList6, true, false, false, !z14, n5Var4);
                ArrayList arrayList8 = arrayList6.isEmpty() ? null : arrayList6;
                b8.G(i24);
                final File K = b8.K(hc.a0(q04, Bitmap.CompressFormat.PNG, n5Var4.i0, n5Var4.j0, 87), null, true, true);
                if (q04 != null && !q04.isRecycled()) {
                    q04.recycle();
                }
                boolean z15 = n5Var4.u;
                int i25 = this.b;
                int i26 = this.c;
                final ArrayList arrayList9 = arrayList7;
                if (z15) {
                    long j11 = n5Var4.z0;
                    if (j11 != Long.MIN_VALUE) {
                        Drawable drawable2 = n5Var4.x0;
                        if (drawable2 == null) {
                            drawable2 = vh.k4.e(null, i24, j11, o8Var2.c2);
                        }
                        if (drawable2 != null) {
                            file10 = vh.n5.w(i24, "webp");
                            Bitmap createBitmap3 = Bitmap.createBitmap(i25, i26, Bitmap.Config.ARGB_8888);
                            vh.n5.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
                            try {
                                try {
                                    createBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file10));
                                    break;
                                } catch (Exception e) {
                                    f8.g(e, true);
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
                if (n5Var4.u && n5Var4.K) {
                    int i27 = n5Var4.k0;
                    int i28 = n5Var4.l0;
                    jg.j1 p03 = b4Var6.p0();
                    if (p03 != null) {
                        jg.c1 c1Var2 = p03.r0;
                        if (c1Var2.getChildCount() == 1 && i27 > 0 && i28 > 0) {
                            if (c1Var2.getChildAt(0) instanceof org.telegram.ui.Cells.q1) {
                                imageReceiver = ((org.telegram.ui.Cells.q1) c1Var2.getChildAt(0)).getPhotoImage();
                                if (imageReceiver != null) {
                                    float f18 = imageReceiver.M0;
                                    if (((int) f18) > 0) {
                                        float f19 = imageReceiver.N0;
                                        b4Var3 = b4Var6;
                                        if (((int) f19) > 0) {
                                            float f20 = i27;
                                            float f21 = i28;
                                            float max2 = Math.max(f18 / f20, f19 / f21);
                                            int i29 = (int) ((f20 * max2) / 2.0f);
                                            int i30 = (int) ((f21 * max2) / 2.0f);
                                            Bitmap createBitmap4 = Bitmap.createBitmap(i29, i30, Bitmap.Config.ARGB_8888);
                                            float[] fArr2 = new float[8];
                                            i11 = i25;
                                            int i31 = 0;
                                            while (true) {
                                                int[] iArr2 = imageReceiver.W0;
                                                i12 = i26;
                                                if (i31 >= iArr2.length) {
                                                    Canvas canvas2 = new Canvas(createBitmap4);
                                                    Path path2 = new Path();
                                                    canvas2.scale(0.5f, 0.5f);
                                                    RectF rectF2 = i0.P;
                                                    float f22 = (i29 * 2.0f) / 2.0f;
                                                    float f23 = imageReceiver.M0 / 2.0f;
                                                    float f24 = (i30 * 2.0f) / 2.0f;
                                                    float f25 = imageReceiver.N0 / 2.0f;
                                                    n5Var = n5Var4;
                                                    rectF2.set(f22 - f23, f24 - f25, f23 + f22, f25 + f24);
                                                    path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                                    Paint paint2 = new Paint(1);
                                                    paint2.setColor(-1);
                                                    canvas2.drawPath(path2, paint2);
                                                    try {
                                                        file11 = vh.n5.w(i24, "webp");
                                                        createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file11));
                                                    } catch (Exception e7) {
                                                        f8.g(e7, true);
                                                        file11 = null;
                                                    }
                                                    createBitmap4.recycle();
                                                    if (E2) {
                                                        i13 = i11;
                                                        b4Var4 = b4Var3;
                                                        i14 = i12;
                                                        n5Var2 = n5Var;
                                                        i15 = 87;
                                                        file12 = null;
                                                    } else {
                                                        i13 = i11;
                                                        b4Var4 = b4Var3;
                                                        i14 = i12;
                                                        n5Var2 = n5Var;
                                                        i15 = 87;
                                                        Bitmap q05 = b4Var4.q0(new ArrayList(), false, true, false, false, n5Var2);
                                                        b8.G(i24);
                                                        File K2 = b8.K(hc.a0(q05, Bitmap.CompressFormat.PNG, i13, i14, 87), null, true, true);
                                                        if (q05 != null && !q05.isRecycled()) {
                                                            q05.recycle();
                                                        }
                                                        file12 = K2;
                                                    }
                                                    if (this.d) {
                                                        Bitmap blurBitmap2 = b4Var4.getBlurBitmap();
                                                        b8.G(i24);
                                                        file13 = b8.K(hc.a0(blurBitmap2, Bitmap.CompressFormat.PNG, i13, i14, i15), null, true, true);
                                                        if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                                                            blurBitmap2.recycle();
                                                        }
                                                    } else {
                                                        file13 = null;
                                                    }
                                                    final vh.n5 n5Var5 = n5Var2;
                                                    final File file17 = file10;
                                                    final File file18 = file13;
                                                    final File file19 = file12;
                                                    final ArrayList arrayList10 = arrayList8;
                                                    final int i32 = 0;
                                                    final boolean z16 = this.e;
                                                    final File file20 = file11;
                                                    i0.g3(new Runnable() { // from class: vh.b7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i32) {
                                                                case 0:
                                                                    n5 n5Var42 = n5Var5;
                                                                    y6 y6Var2 = (y6) y6Var;
                                                                    try {
                                                                        File file172 = n5Var42.P0;
                                                                        if (file172 != null) {
                                                                            file172.delete();
                                                                        }
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    try {
                                                                        File file182 = n5Var42.R0;
                                                                        if (file182 != null) {
                                                                            file182.delete();
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                    }
                                                                    try {
                                                                        File file192 = n5Var42.Q0;
                                                                        if (file192 != null) {
                                                                            file192.delete();
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                    }
                                                                    n5Var42.P0 = null;
                                                                    n5Var42.R0 = null;
                                                                    n5Var42.Q0 = null;
                                                                    File file202 = n5Var42.Y0;
                                                                    if (file202 != null) {
                                                                        try {
                                                                            file202.delete();
                                                                        } catch (Exception e10) {
                                                                            org.telegram.messenger.f8.g(e10, true);
                                                                        }
                                                                        n5Var42.Y0 = null;
                                                                    }
                                                                    File file21 = n5Var42.X0;
                                                                    if (file21 != null) {
                                                                        try {
                                                                            file21.delete();
                                                                        } catch (Exception e72) {
                                                                            org.telegram.messenger.f8.g(e72, true);
                                                                        }
                                                                        n5Var42.X0 = null;
                                                                    }
                                                                    n5Var42.j |= z16;
                                                                    n5Var42.T0 = arrayList10;
                                                                    n5Var42.P0 = K;
                                                                    n5Var42.Y0 = file17;
                                                                    n5Var42.R0 = file19;
                                                                    n5Var42.X0 = file20;
                                                                    n5Var42.Q0 = file18;
                                                                    n5Var42.U0 = arrayList9;
                                                                    y6Var2.run();
                                                                    break;
                                                                default:
                                                                    n5 n5Var52 = n5Var5;
                                                                    org.telegram.utils.twidget.v vVar2 = (org.telegram.utils.twidget.v) y6Var;
                                                                    try {
                                                                        File file22 = n5Var52.P0;
                                                                        if (file22 != null) {
                                                                            file22.delete();
                                                                        }
                                                                    } catch (Exception unused4) {
                                                                    }
                                                                    try {
                                                                        File file23 = n5Var52.R0;
                                                                        if (file23 != null) {
                                                                            file23.delete();
                                                                        }
                                                                    } catch (Exception unused5) {
                                                                    }
                                                                    try {
                                                                        File file24 = n5Var52.Q0;
                                                                        if (file24 != null) {
                                                                            file24.delete();
                                                                        }
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                    n5Var52.P0 = null;
                                                                    n5Var52.R0 = null;
                                                                    n5Var52.Q0 = null;
                                                                    File file25 = n5Var52.Y0;
                                                                    if (file25 != null) {
                                                                        try {
                                                                            file25.delete();
                                                                        } catch (Exception e102) {
                                                                            org.telegram.messenger.f8.g(e102, true);
                                                                        }
                                                                        n5Var52.Y0 = null;
                                                                    }
                                                                    File file26 = n5Var52.X0;
                                                                    if (file26 != null) {
                                                                        try {
                                                                            file26.delete();
                                                                        } catch (Exception e11) {
                                                                            org.telegram.messenger.f8.g(e11, true);
                                                                        }
                                                                        n5Var52.X0 = null;
                                                                    }
                                                                    n5Var52.j |= z16;
                                                                    n5Var52.T0 = arrayList10;
                                                                    n5Var52.P0 = K;
                                                                    n5Var52.Y0 = file17;
                                                                    n5Var52.R0 = file19;
                                                                    n5Var52.X0 = file20;
                                                                    n5Var52.Q0 = file18;
                                                                    n5Var52.U0 = arrayList9;
                                                                    vVar2.run();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                int i33 = i31 * 2;
                                                float f26 = iArr2[i31];
                                                fArr2[i33] = f26;
                                                fArr2[i33 + 1] = f26;
                                                i31++;
                                                i26 = i12;
                                            }
                                        }
                                        i11 = i25;
                                        i12 = i26;
                                        n5Var = n5Var4;
                                        file11 = null;
                                        if (E2) {
                                        }
                                        if (this.d) {
                                        }
                                        final vh.n5 n5Var52 = n5Var2;
                                        final File file172 = file10;
                                        final File file182 = file13;
                                        final File file192 = file12;
                                        final ArrayList arrayList102 = arrayList8;
                                        final int i322 = 0;
                                        final boolean z162 = this.e;
                                        final File file202 = file11;
                                        i0.g3(new Runnable() { // from class: vh.b7
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i322) {
                                                    case 0:
                                                        n5 n5Var42 = n5Var52;
                                                        y6 y6Var2 = (y6) y6Var;
                                                        try {
                                                            File file1722 = n5Var42.P0;
                                                            if (file1722 != null) {
                                                                file1722.delete();
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                        try {
                                                            File file1822 = n5Var42.R0;
                                                            if (file1822 != null) {
                                                                file1822.delete();
                                                            }
                                                        } catch (Exception unused2) {
                                                        }
                                                        try {
                                                            File file1922 = n5Var42.Q0;
                                                            if (file1922 != null) {
                                                                file1922.delete();
                                                            }
                                                        } catch (Exception unused3) {
                                                        }
                                                        n5Var42.P0 = null;
                                                        n5Var42.R0 = null;
                                                        n5Var42.Q0 = null;
                                                        File file2022 = n5Var42.Y0;
                                                        if (file2022 != null) {
                                                            try {
                                                                file2022.delete();
                                                            } catch (Exception e10) {
                                                                org.telegram.messenger.f8.g(e10, true);
                                                            }
                                                            n5Var42.Y0 = null;
                                                        }
                                                        File file21 = n5Var42.X0;
                                                        if (file21 != null) {
                                                            try {
                                                                file21.delete();
                                                            } catch (Exception e72) {
                                                                org.telegram.messenger.f8.g(e72, true);
                                                            }
                                                            n5Var42.X0 = null;
                                                        }
                                                        n5Var42.j |= z162;
                                                        n5Var42.T0 = arrayList102;
                                                        n5Var42.P0 = K;
                                                        n5Var42.Y0 = file172;
                                                        n5Var42.R0 = file192;
                                                        n5Var42.X0 = file202;
                                                        n5Var42.Q0 = file182;
                                                        n5Var42.U0 = arrayList9;
                                                        y6Var2.run();
                                                        break;
                                                    default:
                                                        n5 n5Var522 = n5Var52;
                                                        org.telegram.utils.twidget.v vVar2 = (org.telegram.utils.twidget.v) y6Var;
                                                        try {
                                                            File file22 = n5Var522.P0;
                                                            if (file22 != null) {
                                                                file22.delete();
                                                            }
                                                        } catch (Exception unused4) {
                                                        }
                                                        try {
                                                            File file23 = n5Var522.R0;
                                                            if (file23 != null) {
                                                                file23.delete();
                                                            }
                                                        } catch (Exception unused5) {
                                                        }
                                                        try {
                                                            File file24 = n5Var522.Q0;
                                                            if (file24 != null) {
                                                                file24.delete();
                                                            }
                                                        } catch (Exception unused6) {
                                                        }
                                                        n5Var522.P0 = null;
                                                        n5Var522.R0 = null;
                                                        n5Var522.Q0 = null;
                                                        File file25 = n5Var522.Y0;
                                                        if (file25 != null) {
                                                            try {
                                                                file25.delete();
                                                            } catch (Exception e102) {
                                                                org.telegram.messenger.f8.g(e102, true);
                                                            }
                                                            n5Var522.Y0 = null;
                                                        }
                                                        File file26 = n5Var522.X0;
                                                        if (file26 != null) {
                                                            try {
                                                                file26.delete();
                                                            } catch (Exception e11) {
                                                                org.telegram.messenger.f8.g(e11, true);
                                                            }
                                                            n5Var522.X0 = null;
                                                        }
                                                        n5Var522.j |= z162;
                                                        n5Var522.T0 = arrayList102;
                                                        n5Var522.P0 = K;
                                                        n5Var522.Y0 = file172;
                                                        n5Var522.R0 = file192;
                                                        n5Var522.X0 = file202;
                                                        n5Var522.Q0 = file182;
                                                        n5Var522.U0 = arrayList9;
                                                        vVar2.run();
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
                b4Var3 = b4Var6;
                i11 = i25;
                i12 = i26;
                n5Var = n5Var4;
                file11 = null;
                if (E2) {
                }
                if (this.d) {
                }
                final vh.n5 n5Var522 = n5Var2;
                final File file1722 = file10;
                final File file1822 = file13;
                final File file1922 = file12;
                final ArrayList arrayList1022 = arrayList8;
                final int i3222 = 0;
                final boolean z1622 = this.e;
                final File file2022 = file11;
                i0.g3(new Runnable() { // from class: vh.b7
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3222) {
                            case 0:
                                n5 n5Var42 = n5Var522;
                                y6 y6Var2 = (y6) y6Var;
                                try {
                                    File file17222 = n5Var42.P0;
                                    if (file17222 != null) {
                                        file17222.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18222 = n5Var42.R0;
                                    if (file18222 != null) {
                                        file18222.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19222 = n5Var42.Q0;
                                    if (file19222 != null) {
                                        file19222.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                n5Var42.P0 = null;
                                n5Var42.R0 = null;
                                n5Var42.Q0 = null;
                                File file20222 = n5Var42.Y0;
                                if (file20222 != null) {
                                    try {
                                        file20222.delete();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.f8.g(e10, true);
                                    }
                                    n5Var42.Y0 = null;
                                }
                                File file21 = n5Var42.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e72) {
                                        org.telegram.messenger.f8.g(e72, true);
                                    }
                                    n5Var42.X0 = null;
                                }
                                n5Var42.j |= z1622;
                                n5Var42.T0 = arrayList1022;
                                n5Var42.P0 = K;
                                n5Var42.Y0 = file1722;
                                n5Var42.R0 = file1922;
                                n5Var42.X0 = file2022;
                                n5Var42.Q0 = file1822;
                                n5Var42.U0 = arrayList9;
                                y6Var2.run();
                                break;
                            default:
                                n5 n5Var5222 = n5Var522;
                                org.telegram.utils.twidget.v vVar2 = (org.telegram.utils.twidget.v) y6Var;
                                try {
                                    File file22 = n5Var5222.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = n5Var5222.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = n5Var5222.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                n5Var5222.P0 = null;
                                n5Var5222.R0 = null;
                                n5Var5222.Q0 = null;
                                File file25 = n5Var5222.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e102) {
                                        org.telegram.messenger.f8.g(e102, true);
                                    }
                                    n5Var5222.Y0 = null;
                                }
                                File file26 = n5Var5222.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.f8.g(e11, true);
                                    }
                                    n5Var5222.X0 = null;
                                }
                                n5Var5222.j |= z1622;
                                n5Var5222.T0 = arrayList1022;
                                n5Var5222.P0 = K;
                                n5Var5222.Y0 = file1722;
                                n5Var5222.R0 = file1922;
                                n5Var5222.X0 = file2022;
                                n5Var5222.Q0 = file1822;
                                n5Var5222.U0 = arrayList9;
                                vVar2.run();
                                break;
                        }
                    }
                });
                return;
        }
    }

    public /* synthetic */ ee(vh.o8 o8Var, vh.s7 s7Var, int i10, int i11, vh.n5 n5Var, boolean z10, boolean z11, Runnable runnable, int i12) {
        this.a = i12;
        this.f = o8Var;
        this.h = s7Var;
        this.b = i10;
        this.c = i11;
        this.n = n5Var;
        this.d = z10;
        this.e = z11;
        this.r = runnable;
    }
}
