package fi;

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
import org.telegram.messenger.gc;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object r;

    public /* synthetic */ x8(va vaVar, x9 x9Var, int i7, int i10, e7 e7Var, boolean z9, boolean z10, Runnable runnable, int i11) {
        this.a = i11;
        this.b = vaVar;
        this.c = x9Var;
        this.d = i7;
        this.e = i10;
        this.f = e7Var;
        this.h = z9;
        this.n = z10;
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
        boolean z9;
        o5 o5Var;
        File file;
        File file2;
        File file3;
        String str;
        boolean z10;
        File file4;
        final File file5;
        File file6;
        File file7;
        final File file8;
        int size;
        int i7;
        o5 o5Var2;
        String str2;
        tg.u0 p02;
        ?? r12;
        File file9;
        File file10;
        o5 o5Var3;
        int i10;
        int i11;
        e7 e7Var;
        File file11;
        int i12;
        o5 o5Var4;
        int i13;
        e7 e7Var2;
        int i14;
        File file12;
        File file13;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 0:
                va vaVar = (va) this.b;
                o5 o5Var5 = (o5) this.c;
                final e7 e7Var3 = (e7) this.f;
                final bg.m0 m0Var = (bg.m0) this.r;
                int i15 = vaVar.c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                o5Var5.q0(arrayList2, false, false, false, false, e7Var3);
                if (!e7Var3.K) {
                    e7Var3.S0 = Utilities.k(o5Var5.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = o5Var5.getMasks();
                final ArrayList arrayList3 = masks != null ? new ArrayList(masks) : null;
                boolean z11 = e7Var3.K;
                boolean E = e7Var3.E();
                arrayList2.clear();
                Bitmap q02 = o5Var5.q0(arrayList2, true, false, false, !z11, e7Var3);
                ArrayList arrayList4 = arrayList2.isEmpty() ? null : arrayList2;
                File w10 = e7.w(i15, "png");
                arrayList.add(new z8(q02, w10, 0));
                if (e7Var3.u) {
                    z9 = E;
                    long j3 = e7Var3.z0;
                    if (j3 != Long.MIN_VALUE) {
                        Drawable drawable = e7Var3.x0;
                        if (drawable == null) {
                            file = null;
                            drawable = y5.e(null, i15, j3, vaVar.c2);
                        } else {
                            file = null;
                        }
                        if (drawable != null) {
                            File w11 = e7.w(i15, "webp");
                            Bitmap createBitmap = Bitmap.createBitmap(this.d, this.e, Bitmap.Config.ARGB_8888);
                            o5Var = o5Var5;
                            e7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            arrayList.add(new z8(createBitmap, w11, 1));
                            file9 = w11;
                        } else {
                            o5Var = o5Var5;
                            file9 = file;
                        }
                        file2 = file9;
                        if (e7Var3.u && e7Var3.K) {
                            int i16 = e7Var3.k0;
                            int i17 = e7Var3.l0;
                            p02 = o5Var.p0();
                            if (p02 != null) {
                                tg.p0 p0Var = p02.r0;
                                if (p0Var.getChildCount() == 1 && i16 > 0 && i17 > 0) {
                                    if (p0Var.getChildAt(0) instanceof org.telegram.ui.Cells.q1) {
                                        r12 = ((org.telegram.ui.Cells.q1) p0Var.getChildAt(0)).getPhotoImage();
                                        if (r12 != 0) {
                                            float f10 = r12.M0;
                                            if (((int) f10) > 0) {
                                                float f11 = r12.N0;
                                                file3 = file2;
                                                if (((int) f11) > 0) {
                                                    float f12 = i16;
                                                    float f13 = i17;
                                                    float max = Math.max(f10 / f12, f11 / f13);
                                                    int i18 = (int) ((f12 * max) / 2.0f);
                                                    int i19 = (int) ((f13 * max) / 2.0f);
                                                    Bitmap createBitmap2 = Bitmap.createBitmap(i18, i19, Bitmap.Config.ARGB_8888);
                                                    float[] fArr = new float[8];
                                                    str = "png";
                                                    int i20 = 0;
                                                    while (true) {
                                                        int[] iArr = r12.W0;
                                                        z10 = z9;
                                                        if (i20 >= iArr.length) {
                                                            Canvas canvas = new Canvas(createBitmap2);
                                                            Path path = new Path();
                                                            canvas.scale(0.5f, 0.5f);
                                                            RectF rectF = org.telegram.messenger.g0.P;
                                                            float f14 = (i18 * 2.0f) / 2.0f;
                                                            float f15 = r12.M0 / 2.0f;
                                                            float f16 = (i19 * 2.0f) / 2.0f;
                                                            float f17 = r12.N0 / 2.0f;
                                                            file4 = w10;
                                                            rectF.set(f14 - f15, f16 - f17, f15 + f14, f17 + f16);
                                                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                                            Paint paint = new Paint(1);
                                                            paint.setColor(-1);
                                                            canvas.drawPath(path, paint);
                                                            File w12 = e7.w(i15, "webp");
                                                            arrayList.add(new z8(createBitmap2, w12, 2));
                                                            file5 = w12;
                                                            if (o5Var.r0()) {
                                                                file6 = e7Var3.R0;
                                                                file7 = e7Var3.Q0;
                                                            } else {
                                                                if (z10) {
                                                                    o5Var2 = o5Var;
                                                                    str2 = str;
                                                                    file6 = file;
                                                                } else {
                                                                    o5Var2 = o5Var;
                                                                    str2 = str;
                                                                    Bitmap q03 = o5Var2.q0(new ArrayList(), false, true, false, false, e7Var3);
                                                                    file6 = e7.w(i15, str2);
                                                                    arrayList.add(new z8(q03, file6, 3));
                                                                }
                                                                if (!this.h) {
                                                                    file8 = file;
                                                                    final int i21 = 1;
                                                                    final boolean z12 = this.n;
                                                                    final ArrayList arrayList5 = arrayList4;
                                                                    final File file14 = file3;
                                                                    final File file15 = file6;
                                                                    final File file16 = file4;
                                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y8
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i21) {
                                                                                case 0:
                                                                                    e7 e7Var4 = e7Var3;
                                                                                    u8 u8Var = (u8) m0Var;
                                                                                    try {
                                                                                        File file17 = e7Var4.P0;
                                                                                        if (file17 != null) {
                                                                                            file17.delete();
                                                                                        }
                                                                                    } catch (Exception unused) {
                                                                                    }
                                                                                    try {
                                                                                        File file18 = e7Var4.R0;
                                                                                        if (file18 != null) {
                                                                                            file18.delete();
                                                                                        }
                                                                                    } catch (Exception unused2) {
                                                                                    }
                                                                                    try {
                                                                                        File file19 = e7Var4.Q0;
                                                                                        if (file19 != null) {
                                                                                            file19.delete();
                                                                                        }
                                                                                    } catch (Exception unused3) {
                                                                                    }
                                                                                    e7Var4.P0 = null;
                                                                                    e7Var4.R0 = null;
                                                                                    e7Var4.Q0 = null;
                                                                                    File file20 = e7Var4.Y0;
                                                                                    if (file20 != null) {
                                                                                        try {
                                                                                            file20.delete();
                                                                                        } catch (Exception e10) {
                                                                                            org.telegram.messenger.a8.g(e10, true);
                                                                                        }
                                                                                        e7Var4.Y0 = null;
                                                                                    }
                                                                                    File file21 = e7Var4.X0;
                                                                                    if (file21 != null) {
                                                                                        try {
                                                                                            file21.delete();
                                                                                        } catch (Exception e11) {
                                                                                            org.telegram.messenger.a8.g(e11, true);
                                                                                        }
                                                                                        e7Var4.X0 = null;
                                                                                    }
                                                                                    e7Var4.j |= z12;
                                                                                    e7Var4.T0 = arrayList5;
                                                                                    e7Var4.P0 = file16;
                                                                                    e7Var4.Y0 = file14;
                                                                                    e7Var4.R0 = file15;
                                                                                    e7Var4.X0 = file5;
                                                                                    e7Var4.Q0 = file8;
                                                                                    e7Var4.U0 = arrayList3;
                                                                                    u8Var.run();
                                                                                    break;
                                                                                default:
                                                                                    e7 e7Var5 = e7Var3;
                                                                                    bg.m0 m0Var2 = (bg.m0) m0Var;
                                                                                    try {
                                                                                        File file22 = e7Var5.P0;
                                                                                        if (file22 != null) {
                                                                                            file22.delete();
                                                                                        }
                                                                                    } catch (Exception unused4) {
                                                                                    }
                                                                                    try {
                                                                                        File file23 = e7Var5.R0;
                                                                                        if (file23 != null) {
                                                                                            file23.delete();
                                                                                        }
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    try {
                                                                                        File file24 = e7Var5.Q0;
                                                                                        if (file24 != null) {
                                                                                            file24.delete();
                                                                                        }
                                                                                    } catch (Exception unused6) {
                                                                                    }
                                                                                    e7Var5.P0 = null;
                                                                                    e7Var5.R0 = null;
                                                                                    e7Var5.Q0 = null;
                                                                                    File file25 = e7Var5.Y0;
                                                                                    if (file25 != null) {
                                                                                        try {
                                                                                            file25.delete();
                                                                                        } catch (Exception e12) {
                                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                                        }
                                                                                        e7Var5.Y0 = null;
                                                                                    }
                                                                                    File file26 = e7Var5.X0;
                                                                                    if (file26 != null) {
                                                                                        try {
                                                                                            file26.delete();
                                                                                        } catch (Exception e13) {
                                                                                            org.telegram.messenger.a8.g(e13, true);
                                                                                        }
                                                                                        e7Var5.X0 = null;
                                                                                    }
                                                                                    e7Var5.j |= z12;
                                                                                    e7Var5.T0 = arrayList5;
                                                                                    e7Var5.P0 = file16;
                                                                                    e7Var5.Y0 = file14;
                                                                                    e7Var5.R0 = file15;
                                                                                    e7Var5.X0 = file5;
                                                                                    e7Var5.Q0 = file8;
                                                                                    e7Var5.U0 = arrayList3;
                                                                                    m0Var2.run();
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
                                                                Bitmap blurBitmap = o5Var2.getBlurBitmap();
                                                                file7 = e7.w(i15, str2);
                                                                arrayList.add(new z8(blurBitmap, file7, 4));
                                                            }
                                                            file8 = file7;
                                                            final int i212 = 1;
                                                            final boolean z122 = this.n;
                                                            final ArrayList arrayList52 = arrayList4;
                                                            final File file142 = file3;
                                                            final File file152 = file6;
                                                            final File file162 = file4;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i212) {
                                                                        case 0:
                                                                            e7 e7Var4 = e7Var3;
                                                                            u8 u8Var = (u8) m0Var;
                                                                            try {
                                                                                File file17 = e7Var4.P0;
                                                                                if (file17 != null) {
                                                                                    file17.delete();
                                                                                }
                                                                            } catch (Exception unused) {
                                                                            }
                                                                            try {
                                                                                File file18 = e7Var4.R0;
                                                                                if (file18 != null) {
                                                                                    file18.delete();
                                                                                }
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                            try {
                                                                                File file19 = e7Var4.Q0;
                                                                                if (file19 != null) {
                                                                                    file19.delete();
                                                                                }
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            e7Var4.P0 = null;
                                                                            e7Var4.R0 = null;
                                                                            e7Var4.Q0 = null;
                                                                            File file20 = e7Var4.Y0;
                                                                            if (file20 != null) {
                                                                                try {
                                                                                    file20.delete();
                                                                                } catch (Exception e10) {
                                                                                    org.telegram.messenger.a8.g(e10, true);
                                                                                }
                                                                                e7Var4.Y0 = null;
                                                                            }
                                                                            File file21 = e7Var4.X0;
                                                                            if (file21 != null) {
                                                                                try {
                                                                                    file21.delete();
                                                                                } catch (Exception e11) {
                                                                                    org.telegram.messenger.a8.g(e11, true);
                                                                                }
                                                                                e7Var4.X0 = null;
                                                                            }
                                                                            e7Var4.j |= z122;
                                                                            e7Var4.T0 = arrayList52;
                                                                            e7Var4.P0 = file162;
                                                                            e7Var4.Y0 = file142;
                                                                            e7Var4.R0 = file152;
                                                                            e7Var4.X0 = file5;
                                                                            e7Var4.Q0 = file8;
                                                                            e7Var4.U0 = arrayList3;
                                                                            u8Var.run();
                                                                            break;
                                                                        default:
                                                                            e7 e7Var5 = e7Var3;
                                                                            bg.m0 m0Var2 = (bg.m0) m0Var;
                                                                            try {
                                                                                File file22 = e7Var5.P0;
                                                                                if (file22 != null) {
                                                                                    file22.delete();
                                                                                }
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                            try {
                                                                                File file23 = e7Var5.R0;
                                                                                if (file23 != null) {
                                                                                    file23.delete();
                                                                                }
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                            try {
                                                                                File file24 = e7Var5.Q0;
                                                                                if (file24 != null) {
                                                                                    file24.delete();
                                                                                }
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                            e7Var5.P0 = null;
                                                                            e7Var5.R0 = null;
                                                                            e7Var5.Q0 = null;
                                                                            File file25 = e7Var5.Y0;
                                                                            if (file25 != null) {
                                                                                try {
                                                                                    file25.delete();
                                                                                } catch (Exception e12) {
                                                                                    org.telegram.messenger.a8.g(e12, true);
                                                                                }
                                                                                e7Var5.Y0 = null;
                                                                            }
                                                                            File file26 = e7Var5.X0;
                                                                            if (file26 != null) {
                                                                                try {
                                                                                    file26.delete();
                                                                                } catch (Exception e13) {
                                                                                    org.telegram.messenger.a8.g(e13, true);
                                                                                }
                                                                                e7Var5.X0 = null;
                                                                            }
                                                                            e7Var5.j |= z122;
                                                                            e7Var5.T0 = arrayList52;
                                                                            e7Var5.P0 = file162;
                                                                            e7Var5.Y0 = file142;
                                                                            e7Var5.R0 = file152;
                                                                            e7Var5.X0 = file5;
                                                                            e7Var5.Q0 = file8;
                                                                            e7Var5.U0 = arrayList3;
                                                                            m0Var2.run();
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
                                                        int i22 = i20 * 2;
                                                        float f18 = iArr[i20];
                                                        fArr[i22] = f18;
                                                        fArr[i22 + 1] = f18;
                                                        i20++;
                                                        z9 = z10;
                                                    }
                                                }
                                                str = "png";
                                                z10 = z9;
                                                file4 = w10;
                                                file5 = file;
                                                if (o5Var.r0()) {
                                                }
                                                file8 = file7;
                                                final int i2122 = 1;
                                                final boolean z1222 = this.n;
                                                final ArrayList arrayList522 = arrayList4;
                                                final File file1422 = file3;
                                                final File file1522 = file6;
                                                final File file1622 = file4;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y8
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i2122) {
                                                            case 0:
                                                                e7 e7Var4 = e7Var3;
                                                                u8 u8Var = (u8) m0Var;
                                                                try {
                                                                    File file17 = e7Var4.P0;
                                                                    if (file17 != null) {
                                                                        file17.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file18 = e7Var4.R0;
                                                                    if (file18 != null) {
                                                                        file18.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file19 = e7Var4.Q0;
                                                                    if (file19 != null) {
                                                                        file19.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                e7Var4.P0 = null;
                                                                e7Var4.R0 = null;
                                                                e7Var4.Q0 = null;
                                                                File file20 = e7Var4.Y0;
                                                                if (file20 != null) {
                                                                    try {
                                                                        file20.delete();
                                                                    } catch (Exception e10) {
                                                                        org.telegram.messenger.a8.g(e10, true);
                                                                    }
                                                                    e7Var4.Y0 = null;
                                                                }
                                                                File file21 = e7Var4.X0;
                                                                if (file21 != null) {
                                                                    try {
                                                                        file21.delete();
                                                                    } catch (Exception e11) {
                                                                        org.telegram.messenger.a8.g(e11, true);
                                                                    }
                                                                    e7Var4.X0 = null;
                                                                }
                                                                e7Var4.j |= z1222;
                                                                e7Var4.T0 = arrayList522;
                                                                e7Var4.P0 = file1622;
                                                                e7Var4.Y0 = file1422;
                                                                e7Var4.R0 = file1522;
                                                                e7Var4.X0 = file5;
                                                                e7Var4.Q0 = file8;
                                                                e7Var4.U0 = arrayList3;
                                                                u8Var.run();
                                                                break;
                                                            default:
                                                                e7 e7Var5 = e7Var3;
                                                                bg.m0 m0Var2 = (bg.m0) m0Var;
                                                                try {
                                                                    File file22 = e7Var5.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file23 = e7Var5.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file24 = e7Var5.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                e7Var5.P0 = null;
                                                                e7Var5.R0 = null;
                                                                e7Var5.Q0 = null;
                                                                File file25 = e7Var5.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e12) {
                                                                        org.telegram.messenger.a8.g(e12, true);
                                                                    }
                                                                    e7Var5.Y0 = null;
                                                                }
                                                                File file26 = e7Var5.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e13) {
                                                                        org.telegram.messenger.a8.g(e13, true);
                                                                    }
                                                                    e7Var5.X0 = null;
                                                                }
                                                                e7Var5.j |= z1222;
                                                                e7Var5.T0 = arrayList522;
                                                                e7Var5.P0 = file1622;
                                                                e7Var5.Y0 = file1422;
                                                                e7Var5.R0 = file1522;
                                                                e7Var5.X0 = file5;
                                                                e7Var5.Q0 = file8;
                                                                e7Var5.U0 = arrayList3;
                                                                m0Var2.run();
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
                        z10 = z9;
                        file4 = w10;
                        file5 = file;
                        if (o5Var.r0()) {
                        }
                        file8 = file7;
                        final int i21222 = 1;
                        final boolean z12222 = this.n;
                        final ArrayList arrayList5222 = arrayList4;
                        final File file14222 = file3;
                        final File file15222 = file6;
                        final File file16222 = file4;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y8
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i21222) {
                                    case 0:
                                        e7 e7Var4 = e7Var3;
                                        u8 u8Var = (u8) m0Var;
                                        try {
                                            File file17 = e7Var4.P0;
                                            if (file17 != null) {
                                                file17.delete();
                                            }
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            File file18 = e7Var4.R0;
                                            if (file18 != null) {
                                                file18.delete();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        try {
                                            File file19 = e7Var4.Q0;
                                            if (file19 != null) {
                                                file19.delete();
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        e7Var4.P0 = null;
                                        e7Var4.R0 = null;
                                        e7Var4.Q0 = null;
                                        File file20 = e7Var4.Y0;
                                        if (file20 != null) {
                                            try {
                                                file20.delete();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            e7Var4.Y0 = null;
                                        }
                                        File file21 = e7Var4.X0;
                                        if (file21 != null) {
                                            try {
                                                file21.delete();
                                            } catch (Exception e11) {
                                                org.telegram.messenger.a8.g(e11, true);
                                            }
                                            e7Var4.X0 = null;
                                        }
                                        e7Var4.j |= z12222;
                                        e7Var4.T0 = arrayList5222;
                                        e7Var4.P0 = file16222;
                                        e7Var4.Y0 = file14222;
                                        e7Var4.R0 = file15222;
                                        e7Var4.X0 = file5;
                                        e7Var4.Q0 = file8;
                                        e7Var4.U0 = arrayList3;
                                        u8Var.run();
                                        break;
                                    default:
                                        e7 e7Var5 = e7Var3;
                                        bg.m0 m0Var2 = (bg.m0) m0Var;
                                        try {
                                            File file22 = e7Var5.P0;
                                            if (file22 != null) {
                                                file22.delete();
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            File file23 = e7Var5.R0;
                                            if (file23 != null) {
                                                file23.delete();
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        try {
                                            File file24 = e7Var5.Q0;
                                            if (file24 != null) {
                                                file24.delete();
                                            }
                                        } catch (Exception unused6) {
                                        }
                                        e7Var5.P0 = null;
                                        e7Var5.R0 = null;
                                        e7Var5.Q0 = null;
                                        File file25 = e7Var5.Y0;
                                        if (file25 != null) {
                                            try {
                                                file25.delete();
                                            } catch (Exception e12) {
                                                org.telegram.messenger.a8.g(e12, true);
                                            }
                                            e7Var5.Y0 = null;
                                        }
                                        File file26 = e7Var5.X0;
                                        if (file26 != null) {
                                            try {
                                                file26.delete();
                                            } catch (Exception e13) {
                                                org.telegram.messenger.a8.g(e13, true);
                                            }
                                            e7Var5.X0 = null;
                                        }
                                        e7Var5.j |= z12222;
                                        e7Var5.T0 = arrayList5222;
                                        e7Var5.P0 = file16222;
                                        e7Var5.Y0 = file14222;
                                        e7Var5.R0 = file15222;
                                        e7Var5.X0 = file5;
                                        e7Var5.Q0 = file8;
                                        e7Var5.U0 = arrayList3;
                                        m0Var2.run();
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
                    z9 = E;
                }
                o5Var = o5Var5;
                file = null;
                file2 = null;
                if (e7Var3.u) {
                    int i162 = e7Var3.k0;
                    int i172 = e7Var3.l0;
                    p02 = o5Var.p0();
                    if (p02 != null) {
                    }
                    r12 = file;
                    if (r12 != 0) {
                    }
                }
                file3 = file2;
                str = "png";
                z10 = z9;
                file4 = w10;
                file5 = file;
                if (o5Var.r0()) {
                }
                file8 = file7;
                final int i212222 = 1;
                final boolean z122222 = this.n;
                final ArrayList arrayList52222 = arrayList4;
                final File file142222 = file3;
                final File file152222 = file6;
                final File file162222 = file4;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i212222) {
                            case 0:
                                e7 e7Var4 = e7Var3;
                                u8 u8Var = (u8) m0Var;
                                try {
                                    File file17 = e7Var4.P0;
                                    if (file17 != null) {
                                        file17.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18 = e7Var4.R0;
                                    if (file18 != null) {
                                        file18.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19 = e7Var4.Q0;
                                    if (file19 != null) {
                                        file19.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                e7Var4.P0 = null;
                                e7Var4.R0 = null;
                                e7Var4.Q0 = null;
                                File file20 = e7Var4.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    e7Var4.Y0 = null;
                                }
                                File file21 = e7Var4.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                    e7Var4.X0 = null;
                                }
                                e7Var4.j |= z122222;
                                e7Var4.T0 = arrayList52222;
                                e7Var4.P0 = file162222;
                                e7Var4.Y0 = file142222;
                                e7Var4.R0 = file152222;
                                e7Var4.X0 = file5;
                                e7Var4.Q0 = file8;
                                e7Var4.U0 = arrayList3;
                                u8Var.run();
                                break;
                            default:
                                e7 e7Var5 = e7Var3;
                                bg.m0 m0Var2 = (bg.m0) m0Var;
                                try {
                                    File file22 = e7Var5.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = e7Var5.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = e7Var5.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                e7Var5.P0 = null;
                                e7Var5.R0 = null;
                                e7Var5.Q0 = null;
                                File file25 = e7Var5.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e12) {
                                        org.telegram.messenger.a8.g(e12, true);
                                    }
                                    e7Var5.Y0 = null;
                                }
                                File file26 = e7Var5.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                    }
                                    e7Var5.X0 = null;
                                }
                                e7Var5.j |= z122222;
                                e7Var5.T0 = arrayList52222;
                                e7Var5.P0 = file162222;
                                e7Var5.Y0 = file142222;
                                e7Var5.R0 = file152222;
                                e7Var5.X0 = file5;
                                e7Var5.Q0 = file8;
                                e7Var5.U0 = arrayList3;
                                m0Var2.run();
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
                va vaVar2 = (va) this.b;
                o5 o5Var6 = (o5) this.c;
                e7 e7Var4 = (e7) this.f;
                final u8 u8Var = (u8) this.r;
                int i23 = vaVar2.c;
                ArrayList arrayList6 = new ArrayList();
                o5Var6.q0(arrayList6, false, false, false, false, e7Var4);
                if (!e7Var4.K) {
                    e7Var4.S0 = Utilities.k(o5Var6.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = o5Var6.getMasks();
                ArrayList arrayList7 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z13 = e7Var4.K;
                boolean E2 = e7Var4.E();
                arrayList6.clear();
                Bitmap q04 = o5Var6.q0(arrayList6, true, false, false, !z13, e7Var4);
                ArrayList arrayList8 = arrayList6.isEmpty() ? null : arrayList6;
                org.telegram.messenger.w7.G(i23);
                final File J = org.telegram.messenger.w7.J(gc.a0(q04, Bitmap.CompressFormat.PNG, e7Var4.i0, e7Var4.j0, 87), null, true, true);
                if (q04 != null && !q04.isRecycled()) {
                    q04.recycle();
                }
                boolean z14 = e7Var4.u;
                int i24 = this.d;
                int i25 = this.e;
                final ArrayList arrayList9 = arrayList7;
                if (z14) {
                    long j10 = e7Var4.z0;
                    if (j10 != Long.MIN_VALUE) {
                        Drawable drawable2 = e7Var4.x0;
                        if (drawable2 == null) {
                            drawable2 = y5.e(null, i23, j10, vaVar2.c2);
                        }
                        if (drawable2 != null) {
                            file10 = e7.w(i23, "webp");
                            Bitmap createBitmap3 = Bitmap.createBitmap(i24, i25, Bitmap.Config.ARGB_8888);
                            e7.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
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
                if (e7Var4.u && e7Var4.K) {
                    int i26 = e7Var4.k0;
                    int i27 = e7Var4.l0;
                    tg.u0 p03 = o5Var6.p0();
                    if (p03 != null) {
                        tg.p0 p0Var2 = p03.r0;
                        if (p0Var2.getChildCount() == 1 && i26 > 0 && i27 > 0) {
                            if (p0Var2.getChildAt(0) instanceof org.telegram.ui.Cells.q1) {
                                imageReceiver = ((org.telegram.ui.Cells.q1) p0Var2.getChildAt(0)).getPhotoImage();
                                if (imageReceiver != null) {
                                    float f19 = imageReceiver.M0;
                                    if (((int) f19) > 0) {
                                        float f20 = imageReceiver.N0;
                                        o5Var3 = o5Var6;
                                        if (((int) f20) > 0) {
                                            float f21 = i26;
                                            float f22 = i27;
                                            float max2 = Math.max(f19 / f21, f20 / f22);
                                            int i28 = (int) ((f21 * max2) / 2.0f);
                                            int i29 = (int) ((f22 * max2) / 2.0f);
                                            Bitmap createBitmap4 = Bitmap.createBitmap(i28, i29, Bitmap.Config.ARGB_8888);
                                            float[] fArr2 = new float[8];
                                            i10 = i24;
                                            int i30 = 0;
                                            while (true) {
                                                int[] iArr2 = imageReceiver.W0;
                                                i11 = i25;
                                                if (i30 >= iArr2.length) {
                                                    Canvas canvas2 = new Canvas(createBitmap4);
                                                    Path path2 = new Path();
                                                    canvas2.scale(0.5f, 0.5f);
                                                    RectF rectF2 = org.telegram.messenger.g0.P;
                                                    float f23 = (i28 * 2.0f) / 2.0f;
                                                    float f24 = imageReceiver.M0 / 2.0f;
                                                    float f25 = (i29 * 2.0f) / 2.0f;
                                                    float f26 = imageReceiver.N0 / 2.0f;
                                                    e7Var = e7Var4;
                                                    rectF2.set(f23 - f24, f25 - f26, f24 + f23, f26 + f25);
                                                    path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                                    Paint paint2 = new Paint(1);
                                                    paint2.setColor(-1);
                                                    canvas2.drawPath(path2, paint2);
                                                    try {
                                                        file11 = e7.w(i23, "webp");
                                                        createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file11));
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        file11 = null;
                                                    }
                                                    createBitmap4.recycle();
                                                    if (E2) {
                                                        i12 = i10;
                                                        o5Var4 = o5Var3;
                                                        i13 = i11;
                                                        e7Var2 = e7Var;
                                                        i14 = 87;
                                                        file12 = null;
                                                    } else {
                                                        i12 = i10;
                                                        o5Var4 = o5Var3;
                                                        i13 = i11;
                                                        e7Var2 = e7Var;
                                                        i14 = 87;
                                                        Bitmap q05 = o5Var4.q0(new ArrayList(), false, true, false, false, e7Var2);
                                                        org.telegram.messenger.w7.G(i23);
                                                        File J2 = org.telegram.messenger.w7.J(gc.a0(q05, Bitmap.CompressFormat.PNG, i12, i13, 87), null, true, true);
                                                        if (q05 != null && !q05.isRecycled()) {
                                                            q05.recycle();
                                                        }
                                                        file12 = J2;
                                                    }
                                                    if (this.h) {
                                                        Bitmap blurBitmap2 = o5Var4.getBlurBitmap();
                                                        org.telegram.messenger.w7.G(i23);
                                                        file13 = org.telegram.messenger.w7.J(gc.a0(blurBitmap2, Bitmap.CompressFormat.PNG, i12, i13, i14), null, true, true);
                                                        if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                                                            blurBitmap2.recycle();
                                                        }
                                                    } else {
                                                        file13 = null;
                                                    }
                                                    final e7 e7Var5 = e7Var2;
                                                    final File file17 = file10;
                                                    final File file18 = file13;
                                                    final File file19 = file12;
                                                    final ArrayList arrayList10 = arrayList8;
                                                    final int i31 = 0;
                                                    final boolean z15 = this.n;
                                                    final File file20 = file11;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y8
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i31) {
                                                                case 0:
                                                                    e7 e7Var42 = e7Var5;
                                                                    u8 u8Var2 = (u8) u8Var;
                                                                    try {
                                                                        File file172 = e7Var42.P0;
                                                                        if (file172 != null) {
                                                                            file172.delete();
                                                                        }
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    try {
                                                                        File file182 = e7Var42.R0;
                                                                        if (file182 != null) {
                                                                            file182.delete();
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                    }
                                                                    try {
                                                                        File file192 = e7Var42.Q0;
                                                                        if (file192 != null) {
                                                                            file192.delete();
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                    }
                                                                    e7Var42.P0 = null;
                                                                    e7Var42.R0 = null;
                                                                    e7Var42.Q0 = null;
                                                                    File file202 = e7Var42.Y0;
                                                                    if (file202 != null) {
                                                                        try {
                                                                            file202.delete();
                                                                        } catch (Exception e102) {
                                                                            org.telegram.messenger.a8.g(e102, true);
                                                                        }
                                                                        e7Var42.Y0 = null;
                                                                    }
                                                                    File file21 = e7Var42.X0;
                                                                    if (file21 != null) {
                                                                        try {
                                                                            file21.delete();
                                                                        } catch (Exception e112) {
                                                                            org.telegram.messenger.a8.g(e112, true);
                                                                        }
                                                                        e7Var42.X0 = null;
                                                                    }
                                                                    e7Var42.j |= z15;
                                                                    e7Var42.T0 = arrayList10;
                                                                    e7Var42.P0 = J;
                                                                    e7Var42.Y0 = file17;
                                                                    e7Var42.R0 = file19;
                                                                    e7Var42.X0 = file20;
                                                                    e7Var42.Q0 = file18;
                                                                    e7Var42.U0 = arrayList9;
                                                                    u8Var2.run();
                                                                    break;
                                                                default:
                                                                    e7 e7Var52 = e7Var5;
                                                                    bg.m0 m0Var2 = (bg.m0) u8Var;
                                                                    try {
                                                                        File file22 = e7Var52.P0;
                                                                        if (file22 != null) {
                                                                            file22.delete();
                                                                        }
                                                                    } catch (Exception unused4) {
                                                                    }
                                                                    try {
                                                                        File file23 = e7Var52.R0;
                                                                        if (file23 != null) {
                                                                            file23.delete();
                                                                        }
                                                                    } catch (Exception unused5) {
                                                                    }
                                                                    try {
                                                                        File file24 = e7Var52.Q0;
                                                                        if (file24 != null) {
                                                                            file24.delete();
                                                                        }
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                    e7Var52.P0 = null;
                                                                    e7Var52.R0 = null;
                                                                    e7Var52.Q0 = null;
                                                                    File file25 = e7Var52.Y0;
                                                                    if (file25 != null) {
                                                                        try {
                                                                            file25.delete();
                                                                        } catch (Exception e12) {
                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                        }
                                                                        e7Var52.Y0 = null;
                                                                    }
                                                                    File file26 = e7Var52.X0;
                                                                    if (file26 != null) {
                                                                        try {
                                                                            file26.delete();
                                                                        } catch (Exception e13) {
                                                                            org.telegram.messenger.a8.g(e13, true);
                                                                        }
                                                                        e7Var52.X0 = null;
                                                                    }
                                                                    e7Var52.j |= z15;
                                                                    e7Var52.T0 = arrayList10;
                                                                    e7Var52.P0 = J;
                                                                    e7Var52.Y0 = file17;
                                                                    e7Var52.R0 = file19;
                                                                    e7Var52.X0 = file20;
                                                                    e7Var52.Q0 = file18;
                                                                    e7Var52.U0 = arrayList9;
                                                                    m0Var2.run();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                int i32 = i30 * 2;
                                                float f27 = iArr2[i30];
                                                fArr2[i32] = f27;
                                                fArr2[i32 + 1] = f27;
                                                i30++;
                                                i25 = i11;
                                            }
                                        }
                                        i10 = i24;
                                        i11 = i25;
                                        e7Var = e7Var4;
                                        file11 = null;
                                        if (E2) {
                                        }
                                        if (this.h) {
                                        }
                                        final e7 e7Var52 = e7Var2;
                                        final File file172 = file10;
                                        final File file182 = file13;
                                        final File file192 = file12;
                                        final ArrayList arrayList102 = arrayList8;
                                        final int i312 = 0;
                                        final boolean z152 = this.n;
                                        final File file202 = file11;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i312) {
                                                    case 0:
                                                        e7 e7Var42 = e7Var52;
                                                        u8 u8Var2 = (u8) u8Var;
                                                        try {
                                                            File file1722 = e7Var42.P0;
                                                            if (file1722 != null) {
                                                                file1722.delete();
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                        try {
                                                            File file1822 = e7Var42.R0;
                                                            if (file1822 != null) {
                                                                file1822.delete();
                                                            }
                                                        } catch (Exception unused2) {
                                                        }
                                                        try {
                                                            File file1922 = e7Var42.Q0;
                                                            if (file1922 != null) {
                                                                file1922.delete();
                                                            }
                                                        } catch (Exception unused3) {
                                                        }
                                                        e7Var42.P0 = null;
                                                        e7Var42.R0 = null;
                                                        e7Var42.Q0 = null;
                                                        File file2022 = e7Var42.Y0;
                                                        if (file2022 != null) {
                                                            try {
                                                                file2022.delete();
                                                            } catch (Exception e102) {
                                                                org.telegram.messenger.a8.g(e102, true);
                                                            }
                                                            e7Var42.Y0 = null;
                                                        }
                                                        File file21 = e7Var42.X0;
                                                        if (file21 != null) {
                                                            try {
                                                                file21.delete();
                                                            } catch (Exception e112) {
                                                                org.telegram.messenger.a8.g(e112, true);
                                                            }
                                                            e7Var42.X0 = null;
                                                        }
                                                        e7Var42.j |= z152;
                                                        e7Var42.T0 = arrayList102;
                                                        e7Var42.P0 = J;
                                                        e7Var42.Y0 = file172;
                                                        e7Var42.R0 = file192;
                                                        e7Var42.X0 = file202;
                                                        e7Var42.Q0 = file182;
                                                        e7Var42.U0 = arrayList9;
                                                        u8Var2.run();
                                                        break;
                                                    default:
                                                        e7 e7Var522 = e7Var52;
                                                        bg.m0 m0Var2 = (bg.m0) u8Var;
                                                        try {
                                                            File file22 = e7Var522.P0;
                                                            if (file22 != null) {
                                                                file22.delete();
                                                            }
                                                        } catch (Exception unused4) {
                                                        }
                                                        try {
                                                            File file23 = e7Var522.R0;
                                                            if (file23 != null) {
                                                                file23.delete();
                                                            }
                                                        } catch (Exception unused5) {
                                                        }
                                                        try {
                                                            File file24 = e7Var522.Q0;
                                                            if (file24 != null) {
                                                                file24.delete();
                                                            }
                                                        } catch (Exception unused6) {
                                                        }
                                                        e7Var522.P0 = null;
                                                        e7Var522.R0 = null;
                                                        e7Var522.Q0 = null;
                                                        File file25 = e7Var522.Y0;
                                                        if (file25 != null) {
                                                            try {
                                                                file25.delete();
                                                            } catch (Exception e12) {
                                                                org.telegram.messenger.a8.g(e12, true);
                                                            }
                                                            e7Var522.Y0 = null;
                                                        }
                                                        File file26 = e7Var522.X0;
                                                        if (file26 != null) {
                                                            try {
                                                                file26.delete();
                                                            } catch (Exception e13) {
                                                                org.telegram.messenger.a8.g(e13, true);
                                                            }
                                                            e7Var522.X0 = null;
                                                        }
                                                        e7Var522.j |= z152;
                                                        e7Var522.T0 = arrayList102;
                                                        e7Var522.P0 = J;
                                                        e7Var522.Y0 = file172;
                                                        e7Var522.R0 = file192;
                                                        e7Var522.X0 = file202;
                                                        e7Var522.Q0 = file182;
                                                        e7Var522.U0 = arrayList9;
                                                        m0Var2.run();
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
                o5Var3 = o5Var6;
                i10 = i24;
                i11 = i25;
                e7Var = e7Var4;
                file11 = null;
                if (E2) {
                }
                if (this.h) {
                }
                final e7 e7Var522 = e7Var2;
                final File file1722 = file10;
                final File file1822 = file13;
                final File file1922 = file12;
                final ArrayList arrayList1022 = arrayList8;
                final int i3122 = 0;
                final boolean z1522 = this.n;
                final File file2022 = file11;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3122) {
                            case 0:
                                e7 e7Var42 = e7Var522;
                                u8 u8Var2 = (u8) u8Var;
                                try {
                                    File file17222 = e7Var42.P0;
                                    if (file17222 != null) {
                                        file17222.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18222 = e7Var42.R0;
                                    if (file18222 != null) {
                                        file18222.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19222 = e7Var42.Q0;
                                    if (file19222 != null) {
                                        file19222.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                e7Var42.P0 = null;
                                e7Var42.R0 = null;
                                e7Var42.Q0 = null;
                                File file20222 = e7Var42.Y0;
                                if (file20222 != null) {
                                    try {
                                        file20222.delete();
                                    } catch (Exception e102) {
                                        org.telegram.messenger.a8.g(e102, true);
                                    }
                                    e7Var42.Y0 = null;
                                }
                                File file21 = e7Var42.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e112) {
                                        org.telegram.messenger.a8.g(e112, true);
                                    }
                                    e7Var42.X0 = null;
                                }
                                e7Var42.j |= z1522;
                                e7Var42.T0 = arrayList1022;
                                e7Var42.P0 = J;
                                e7Var42.Y0 = file1722;
                                e7Var42.R0 = file1922;
                                e7Var42.X0 = file2022;
                                e7Var42.Q0 = file1822;
                                e7Var42.U0 = arrayList9;
                                u8Var2.run();
                                break;
                            default:
                                e7 e7Var5222 = e7Var522;
                                bg.m0 m0Var2 = (bg.m0) u8Var;
                                try {
                                    File file22 = e7Var5222.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = e7Var5222.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = e7Var5222.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                e7Var5222.P0 = null;
                                e7Var5222.R0 = null;
                                e7Var5222.Q0 = null;
                                File file25 = e7Var5222.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e12) {
                                        org.telegram.messenger.a8.g(e12, true);
                                    }
                                    e7Var5222.Y0 = null;
                                }
                                File file26 = e7Var5222.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                    }
                                    e7Var5222.X0 = null;
                                }
                                e7Var5222.j |= z1522;
                                e7Var5222.T0 = arrayList1022;
                                e7Var5222.P0 = J;
                                e7Var5222.Y0 = file1722;
                                e7Var5222.R0 = file1922;
                                e7Var5222.X0 = file2022;
                                e7Var5222.Q0 = file1822;
                                e7Var5222.U0 = arrayList9;
                                m0Var2.run();
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

    public /* synthetic */ x8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z9, int i10, boolean z10) {
        this.a = 2;
        this.b = mediaController;
        this.c = file;
        this.f = file2;
        this.r = tL_document;
        this.d = i7;
        this.h = z9;
        this.e = i10;
        this.n = z10;
    }
}
