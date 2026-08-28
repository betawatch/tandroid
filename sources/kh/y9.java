package kh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;
    public final /* synthetic */ g6 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ a8 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Runnable r;

    public /* synthetic */ y9(wb wbVar, ya yaVar, int i9, int i10, a8 a8Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.a = i11;
        this.b = wbVar;
        this.c = yaVar;
        this.d = i9;
        this.e = i10;
        this.f = a8Var;
        this.h = z10;
        this.n = z11;
        this.r = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e8, code lost:
    
        if (r10.isRecycled() != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c8 A[LOOP:1: B:135:0x03c1->B:137:0x03c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04c6 A[LOOP:2: B:149:0x04c4->B:150:0x04c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170 A[LOOP:0: B:50:0x0169->B:52:0x0170, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        g6 g6Var;
        File file;
        File file2;
        ArrayList arrayList;
        File file3;
        a8 a8Var;
        final File file4;
        a8 a8Var2;
        File file5;
        final File file6;
        final File file7;
        int size;
        int i9;
        g6 g6Var2;
        yf.e1 s02;
        ImageReceiver imageReceiver;
        int i10;
        g6 g6Var3;
        File file8;
        ArrayList arrayList2;
        File file9;
        a8 a8Var3;
        File file10;
        boolean z10;
        final File file11;
        g6 g6Var4;
        a8 a8Var4;
        File file12;
        final File file13;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        int i11;
        File file14;
        switch (this.a) {
            case 0:
                final bg.c2 c2Var = (bg.c2) this.r;
                wb wbVar = this.b;
                int i12 = wbVar.c;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                g6 g6Var5 = this.c;
                a8 a8Var5 = this.f;
                g6Var5.t0(arrayList4, false, false, false, false, a8Var5);
                if (!a8Var5.K) {
                    a8Var5.S0 = Utilities.clamp(g6Var5.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = g6Var5.getMasks();
                ArrayList arrayList5 = masks != null ? new ArrayList(masks) : null;
                boolean z11 = a8Var5.K;
                boolean E = a8Var5.E();
                arrayList4.clear();
                Bitmap t02 = g6Var5.t0(arrayList4, true, false, false, !z11, a8Var5);
                if (arrayList4.isEmpty()) {
                    arrayList4 = null;
                }
                File w8 = a8.w(i12, "png");
                arrayList3.add(new aa(t02, w8, 0));
                final ArrayList arrayList6 = arrayList5;
                if (a8Var5.u) {
                    long j10 = a8Var5.z0;
                    if (j10 != Long.MIN_VALUE) {
                        Drawable drawable = a8Var5.x0;
                        if (drawable == null) {
                            drawable = r6.e(null, i12, j10, wbVar.Y1);
                        }
                        if (drawable != null) {
                            file = a8.w(i12, "webp");
                            Bitmap createBitmap = Bitmap.createBitmap(this.d, this.e, Bitmap.Config.ARGB_8888);
                            g6Var = g6Var5;
                            a8.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            arrayList3.add(new aa(createBitmap, file, 1));
                            if (a8Var5.u && a8Var5.K) {
                                int i13 = a8Var5.k0;
                                int i14 = a8Var5.l0;
                                s02 = g6Var.s0();
                                if (s02 != null) {
                                    yf.x0 x0Var = s02.n0;
                                    if (x0Var.getChildCount() == 1 && i13 > 0 && i14 > 0) {
                                        if (x0Var.getChildAt(0) instanceof org.telegram.ui.Cells.t1) {
                                            imageReceiver = ((org.telegram.ui.Cells.t1) x0Var.getChildAt(0)).getPhotoImage();
                                            if (imageReceiver != null && ((int) imageReceiver.getImageWidth()) > 0 && ((int) imageReceiver.getImageHeight()) > 0) {
                                                float f10 = i13;
                                                float f11 = i14;
                                                float max = Math.max(imageReceiver.getImageWidth() / f10, imageReceiver.getImageHeight() / f11);
                                                int i15 = (int) ((f10 * max) / 2.0f);
                                                int i16 = (int) ((f11 * max) / 2.0f);
                                                Bitmap createBitmap2 = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
                                                float[] fArr = new float[8];
                                                file2 = file;
                                                arrayList = arrayList4;
                                                for (i10 = 0; i10 < imageReceiver.getRoundRadius().length; i10++) {
                                                    int i17 = i10 * 2;
                                                    fArr[i17] = imageReceiver.getRoundRadius()[r20];
                                                    fArr[i17 + 1] = imageReceiver.getRoundRadius()[r20];
                                                }
                                                Canvas canvas = new Canvas(createBitmap2);
                                                Path path = new Path();
                                                file3 = w8;
                                                canvas.scale(0.5f, 0.5f);
                                                RectF rectF = AndroidUtilities.rectTmp;
                                                float f12 = (i15 * 2.0f) / 2.0f;
                                                float f13 = (i16 * 2.0f) / 2.0f;
                                                a8Var = a8Var5;
                                                rectF.set(f12 - (imageReceiver.getImageWidth() / 2.0f), f13 - (imageReceiver.getImageHeight() / 2.0f), (imageReceiver.getImageWidth() / 2.0f) + f12, (imageReceiver.getImageHeight() / 2.0f) + f13);
                                                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                                Paint paint = new Paint(1);
                                                paint.setColor(-1);
                                                canvas.drawPath(path, paint);
                                                File w10 = a8.w(i12, "webp");
                                                arrayList3.add(new aa(createBitmap2, w10, 2));
                                                file4 = w10;
                                                if (g6Var.u0()) {
                                                    a8Var2 = a8Var;
                                                    file5 = a8Var2.R0;
                                                    file6 = a8Var2.Q0;
                                                } else {
                                                    if (E) {
                                                        g6Var2 = g6Var;
                                                        a8Var2 = a8Var;
                                                        file5 = null;
                                                    } else {
                                                        g6Var2 = g6Var;
                                                        a8 a8Var6 = a8Var;
                                                        Bitmap t03 = g6Var2.t0(new ArrayList(), false, true, false, false, a8Var6);
                                                        a8Var2 = a8Var6;
                                                        file5 = a8.w(i12, "png");
                                                        arrayList3.add(new aa(t03, file5, 3));
                                                    }
                                                    if (!this.h) {
                                                        file7 = file5;
                                                        file6 = null;
                                                        final int i18 = 1;
                                                        final a8 a8Var7 = a8Var2;
                                                        final boolean z12 = this.n;
                                                        final File file15 = file2;
                                                        final ArrayList arrayList7 = arrayList;
                                                        final File file16 = file3;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.z9
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i18) {
                                                                    case 0:
                                                                        a8 a8Var8 = a8Var7;
                                                                        v9 v9Var = (v9) c2Var;
                                                                        try {
                                                                            File file17 = a8Var8.P0;
                                                                            if (file17 != null) {
                                                                                file17.delete();
                                                                            }
                                                                        } catch (Exception unused) {
                                                                        }
                                                                        try {
                                                                            File file18 = a8Var8.R0;
                                                                            if (file18 != null) {
                                                                                file18.delete();
                                                                            }
                                                                        } catch (Exception unused2) {
                                                                        }
                                                                        try {
                                                                            File file19 = a8Var8.Q0;
                                                                            if (file19 != null) {
                                                                                file19.delete();
                                                                            }
                                                                        } catch (Exception unused3) {
                                                                        }
                                                                        a8Var8.P0 = null;
                                                                        a8Var8.R0 = null;
                                                                        a8Var8.Q0 = null;
                                                                        File file20 = a8Var8.Y0;
                                                                        if (file20 != null) {
                                                                            try {
                                                                                file20.delete();
                                                                            } catch (Exception e10) {
                                                                                FileLog.e(e10);
                                                                            }
                                                                            a8Var8.Y0 = null;
                                                                        }
                                                                        File file21 = a8Var8.X0;
                                                                        if (file21 != null) {
                                                                            try {
                                                                                file21.delete();
                                                                            } catch (Exception e11) {
                                                                                FileLog.e(e11);
                                                                            }
                                                                            a8Var8.X0 = null;
                                                                        }
                                                                        a8Var8.j |= z12;
                                                                        a8Var8.T0 = arrayList7;
                                                                        a8Var8.P0 = file16;
                                                                        a8Var8.Y0 = file15;
                                                                        a8Var8.R0 = file7;
                                                                        a8Var8.X0 = file4;
                                                                        a8Var8.Q0 = file6;
                                                                        a8Var8.U0 = arrayList6;
                                                                        v9Var.run();
                                                                        break;
                                                                    default:
                                                                        a8 a8Var9 = a8Var7;
                                                                        bg.c2 c2Var2 = (bg.c2) c2Var;
                                                                        try {
                                                                            File file22 = a8Var9.P0;
                                                                            if (file22 != null) {
                                                                                file22.delete();
                                                                            }
                                                                        } catch (Exception unused4) {
                                                                        }
                                                                        try {
                                                                            File file23 = a8Var9.R0;
                                                                            if (file23 != null) {
                                                                                file23.delete();
                                                                            }
                                                                        } catch (Exception unused5) {
                                                                        }
                                                                        try {
                                                                            File file24 = a8Var9.Q0;
                                                                            if (file24 != null) {
                                                                                file24.delete();
                                                                            }
                                                                        } catch (Exception unused6) {
                                                                        }
                                                                        a8Var9.P0 = null;
                                                                        a8Var9.R0 = null;
                                                                        a8Var9.Q0 = null;
                                                                        File file25 = a8Var9.Y0;
                                                                        if (file25 != null) {
                                                                            try {
                                                                                file25.delete();
                                                                            } catch (Exception e12) {
                                                                                FileLog.e(e12);
                                                                            }
                                                                            a8Var9.Y0 = null;
                                                                        }
                                                                        File file26 = a8Var9.X0;
                                                                        if (file26 != null) {
                                                                            try {
                                                                                file26.delete();
                                                                            } catch (Exception e13) {
                                                                                FileLog.e(e13);
                                                                            }
                                                                            a8Var9.X0 = null;
                                                                        }
                                                                        a8Var9.j |= z12;
                                                                        a8Var9.T0 = arrayList7;
                                                                        a8Var9.P0 = file16;
                                                                        a8Var9.Y0 = file15;
                                                                        a8Var9.R0 = file7;
                                                                        a8Var9.X0 = file4;
                                                                        a8Var9.Q0 = file6;
                                                                        a8Var9.U0 = arrayList6;
                                                                        c2Var2.run();
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        size = arrayList3.size();
                                                        i9 = 0;
                                                        while (i9 < size) {
                                                            Object obj = arrayList3.get(i9);
                                                            i9++;
                                                            ((Runnable) obj).run();
                                                        }
                                                        return;
                                                    }
                                                    Bitmap blurBitmap = g6Var2.getBlurBitmap();
                                                    file6 = a8.w(i12, "png");
                                                    arrayList3.add(new aa(blurBitmap, file6, 4));
                                                }
                                                file7 = file5;
                                                final int i182 = 1;
                                                final a8 a8Var72 = a8Var2;
                                                final boolean z122 = this.n;
                                                final File file152 = file2;
                                                final ArrayList arrayList72 = arrayList;
                                                final File file162 = file3;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.z9
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i182) {
                                                            case 0:
                                                                a8 a8Var8 = a8Var72;
                                                                v9 v9Var = (v9) c2Var;
                                                                try {
                                                                    File file17 = a8Var8.P0;
                                                                    if (file17 != null) {
                                                                        file17.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file18 = a8Var8.R0;
                                                                    if (file18 != null) {
                                                                        file18.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file19 = a8Var8.Q0;
                                                                    if (file19 != null) {
                                                                        file19.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                a8Var8.P0 = null;
                                                                a8Var8.R0 = null;
                                                                a8Var8.Q0 = null;
                                                                File file20 = a8Var8.Y0;
                                                                if (file20 != null) {
                                                                    try {
                                                                        file20.delete();
                                                                    } catch (Exception e10) {
                                                                        FileLog.e(e10);
                                                                    }
                                                                    a8Var8.Y0 = null;
                                                                }
                                                                File file21 = a8Var8.X0;
                                                                if (file21 != null) {
                                                                    try {
                                                                        file21.delete();
                                                                    } catch (Exception e11) {
                                                                        FileLog.e(e11);
                                                                    }
                                                                    a8Var8.X0 = null;
                                                                }
                                                                a8Var8.j |= z122;
                                                                a8Var8.T0 = arrayList72;
                                                                a8Var8.P0 = file162;
                                                                a8Var8.Y0 = file152;
                                                                a8Var8.R0 = file7;
                                                                a8Var8.X0 = file4;
                                                                a8Var8.Q0 = file6;
                                                                a8Var8.U0 = arrayList6;
                                                                v9Var.run();
                                                                break;
                                                            default:
                                                                a8 a8Var9 = a8Var72;
                                                                bg.c2 c2Var2 = (bg.c2) c2Var;
                                                                try {
                                                                    File file22 = a8Var9.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file23 = a8Var9.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file24 = a8Var9.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                a8Var9.P0 = null;
                                                                a8Var9.R0 = null;
                                                                a8Var9.Q0 = null;
                                                                File file25 = a8Var9.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e12) {
                                                                        FileLog.e(e12);
                                                                    }
                                                                    a8Var9.Y0 = null;
                                                                }
                                                                File file26 = a8Var9.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e13) {
                                                                        FileLog.e(e13);
                                                                    }
                                                                    a8Var9.X0 = null;
                                                                }
                                                                a8Var9.j |= z122;
                                                                a8Var9.T0 = arrayList72;
                                                                a8Var9.P0 = file162;
                                                                a8Var9.Y0 = file152;
                                                                a8Var9.R0 = file7;
                                                                a8Var9.X0 = file4;
                                                                a8Var9.Q0 = file6;
                                                                a8Var9.U0 = arrayList6;
                                                                c2Var2.run();
                                                                break;
                                                        }
                                                    }
                                                });
                                                size = arrayList3.size();
                                                i9 = 0;
                                                while (i9 < size) {
                                                }
                                                return;
                                            }
                                        }
                                        imageReceiver = null;
                                        if (imageReceiver != null) {
                                            float f102 = i13;
                                            float f112 = i14;
                                            float max2 = Math.max(imageReceiver.getImageWidth() / f102, imageReceiver.getImageHeight() / f112);
                                            int i152 = (int) ((f102 * max2) / 2.0f);
                                            int i162 = (int) ((f112 * max2) / 2.0f);
                                            Bitmap createBitmap22 = Bitmap.createBitmap(i152, i162, Bitmap.Config.ARGB_8888);
                                            float[] fArr2 = new float[8];
                                            file2 = file;
                                            arrayList = arrayList4;
                                            while (i10 < imageReceiver.getRoundRadius().length) {
                                            }
                                            Canvas canvas2 = new Canvas(createBitmap22);
                                            Path path2 = new Path();
                                            file3 = w8;
                                            canvas2.scale(0.5f, 0.5f);
                                            RectF rectF2 = AndroidUtilities.rectTmp;
                                            float f122 = (i152 * 2.0f) / 2.0f;
                                            float f132 = (i162 * 2.0f) / 2.0f;
                                            a8Var = a8Var5;
                                            rectF2.set(f122 - (imageReceiver.getImageWidth() / 2.0f), f132 - (imageReceiver.getImageHeight() / 2.0f), (imageReceiver.getImageWidth() / 2.0f) + f122, (imageReceiver.getImageHeight() / 2.0f) + f132);
                                            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                            Paint paint2 = new Paint(1);
                                            paint2.setColor(-1);
                                            canvas2.drawPath(path2, paint2);
                                            File w102 = a8.w(i12, "webp");
                                            arrayList3.add(new aa(createBitmap22, w102, 2));
                                            file4 = w102;
                                            if (g6Var.u0()) {
                                            }
                                            file7 = file5;
                                            final int i1822 = 1;
                                            final a8 a8Var722 = a8Var2;
                                            final boolean z1222 = this.n;
                                            final File file1522 = file2;
                                            final ArrayList arrayList722 = arrayList;
                                            final File file1622 = file3;
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.z9
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i1822) {
                                                        case 0:
                                                            a8 a8Var8 = a8Var722;
                                                            v9 v9Var = (v9) c2Var;
                                                            try {
                                                                File file17 = a8Var8.P0;
                                                                if (file17 != null) {
                                                                    file17.delete();
                                                                }
                                                            } catch (Exception unused) {
                                                            }
                                                            try {
                                                                File file18 = a8Var8.R0;
                                                                if (file18 != null) {
                                                                    file18.delete();
                                                                }
                                                            } catch (Exception unused2) {
                                                            }
                                                            try {
                                                                File file19 = a8Var8.Q0;
                                                                if (file19 != null) {
                                                                    file19.delete();
                                                                }
                                                            } catch (Exception unused3) {
                                                            }
                                                            a8Var8.P0 = null;
                                                            a8Var8.R0 = null;
                                                            a8Var8.Q0 = null;
                                                            File file20 = a8Var8.Y0;
                                                            if (file20 != null) {
                                                                try {
                                                                    file20.delete();
                                                                } catch (Exception e10) {
                                                                    FileLog.e(e10);
                                                                }
                                                                a8Var8.Y0 = null;
                                                            }
                                                            File file21 = a8Var8.X0;
                                                            if (file21 != null) {
                                                                try {
                                                                    file21.delete();
                                                                } catch (Exception e11) {
                                                                    FileLog.e(e11);
                                                                }
                                                                a8Var8.X0 = null;
                                                            }
                                                            a8Var8.j |= z1222;
                                                            a8Var8.T0 = arrayList722;
                                                            a8Var8.P0 = file1622;
                                                            a8Var8.Y0 = file1522;
                                                            a8Var8.R0 = file7;
                                                            a8Var8.X0 = file4;
                                                            a8Var8.Q0 = file6;
                                                            a8Var8.U0 = arrayList6;
                                                            v9Var.run();
                                                            break;
                                                        default:
                                                            a8 a8Var9 = a8Var722;
                                                            bg.c2 c2Var2 = (bg.c2) c2Var;
                                                            try {
                                                                File file22 = a8Var9.P0;
                                                                if (file22 != null) {
                                                                    file22.delete();
                                                                }
                                                            } catch (Exception unused4) {
                                                            }
                                                            try {
                                                                File file23 = a8Var9.R0;
                                                                if (file23 != null) {
                                                                    file23.delete();
                                                                }
                                                            } catch (Exception unused5) {
                                                            }
                                                            try {
                                                                File file24 = a8Var9.Q0;
                                                                if (file24 != null) {
                                                                    file24.delete();
                                                                }
                                                            } catch (Exception unused6) {
                                                            }
                                                            a8Var9.P0 = null;
                                                            a8Var9.R0 = null;
                                                            a8Var9.Q0 = null;
                                                            File file25 = a8Var9.Y0;
                                                            if (file25 != null) {
                                                                try {
                                                                    file25.delete();
                                                                } catch (Exception e12) {
                                                                    FileLog.e(e12);
                                                                }
                                                                a8Var9.Y0 = null;
                                                            }
                                                            File file26 = a8Var9.X0;
                                                            if (file26 != null) {
                                                                try {
                                                                    file26.delete();
                                                                } catch (Exception e13) {
                                                                    FileLog.e(e13);
                                                                }
                                                                a8Var9.X0 = null;
                                                            }
                                                            a8Var9.j |= z1222;
                                                            a8Var9.T0 = arrayList722;
                                                            a8Var9.P0 = file1622;
                                                            a8Var9.Y0 = file1522;
                                                            a8Var9.R0 = file7;
                                                            a8Var9.X0 = file4;
                                                            a8Var9.Q0 = file6;
                                                            a8Var9.U0 = arrayList6;
                                                            c2Var2.run();
                                                            break;
                                                    }
                                                }
                                            });
                                            size = arrayList3.size();
                                            i9 = 0;
                                            while (i9 < size) {
                                            }
                                            return;
                                        }
                                    }
                                }
                                imageReceiver = null;
                                if (imageReceiver != null) {
                                }
                            }
                            file2 = file;
                            arrayList = arrayList4;
                            file3 = w8;
                            a8Var = a8Var5;
                            file4 = null;
                            if (g6Var.u0()) {
                            }
                            file7 = file5;
                            final int i18222 = 1;
                            final a8 a8Var7222 = a8Var2;
                            final boolean z12222 = this.n;
                            final File file15222 = file2;
                            final ArrayList arrayList7222 = arrayList;
                            final File file16222 = file3;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.z9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i18222) {
                                        case 0:
                                            a8 a8Var8 = a8Var7222;
                                            v9 v9Var = (v9) c2Var;
                                            try {
                                                File file17 = a8Var8.P0;
                                                if (file17 != null) {
                                                    file17.delete();
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                File file18 = a8Var8.R0;
                                                if (file18 != null) {
                                                    file18.delete();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                File file19 = a8Var8.Q0;
                                                if (file19 != null) {
                                                    file19.delete();
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            a8Var8.P0 = null;
                                            a8Var8.R0 = null;
                                            a8Var8.Q0 = null;
                                            File file20 = a8Var8.Y0;
                                            if (file20 != null) {
                                                try {
                                                    file20.delete();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                                a8Var8.Y0 = null;
                                            }
                                            File file21 = a8Var8.X0;
                                            if (file21 != null) {
                                                try {
                                                    file21.delete();
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                }
                                                a8Var8.X0 = null;
                                            }
                                            a8Var8.j |= z12222;
                                            a8Var8.T0 = arrayList7222;
                                            a8Var8.P0 = file16222;
                                            a8Var8.Y0 = file15222;
                                            a8Var8.R0 = file7;
                                            a8Var8.X0 = file4;
                                            a8Var8.Q0 = file6;
                                            a8Var8.U0 = arrayList6;
                                            v9Var.run();
                                            break;
                                        default:
                                            a8 a8Var9 = a8Var7222;
                                            bg.c2 c2Var2 = (bg.c2) c2Var;
                                            try {
                                                File file22 = a8Var9.P0;
                                                if (file22 != null) {
                                                    file22.delete();
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                File file23 = a8Var9.R0;
                                                if (file23 != null) {
                                                    file23.delete();
                                                }
                                            } catch (Exception unused5) {
                                            }
                                            try {
                                                File file24 = a8Var9.Q0;
                                                if (file24 != null) {
                                                    file24.delete();
                                                }
                                            } catch (Exception unused6) {
                                            }
                                            a8Var9.P0 = null;
                                            a8Var9.R0 = null;
                                            a8Var9.Q0 = null;
                                            File file25 = a8Var9.Y0;
                                            if (file25 != null) {
                                                try {
                                                    file25.delete();
                                                } catch (Exception e12) {
                                                    FileLog.e(e12);
                                                }
                                                a8Var9.Y0 = null;
                                            }
                                            File file26 = a8Var9.X0;
                                            if (file26 != null) {
                                                try {
                                                    file26.delete();
                                                } catch (Exception e13) {
                                                    FileLog.e(e13);
                                                }
                                                a8Var9.X0 = null;
                                            }
                                            a8Var9.j |= z12222;
                                            a8Var9.T0 = arrayList7222;
                                            a8Var9.P0 = file16222;
                                            a8Var9.Y0 = file15222;
                                            a8Var9.R0 = file7;
                                            a8Var9.X0 = file4;
                                            a8Var9.Q0 = file6;
                                            a8Var9.U0 = arrayList6;
                                            c2Var2.run();
                                            break;
                                    }
                                }
                            });
                            size = arrayList3.size();
                            i9 = 0;
                            while (i9 < size) {
                            }
                            return;
                        }
                    }
                }
                g6Var = g6Var5;
                file = null;
                if (a8Var5.u) {
                    int i132 = a8Var5.k0;
                    int i142 = a8Var5.l0;
                    s02 = g6Var.s0();
                    if (s02 != null) {
                    }
                    imageReceiver = null;
                    if (imageReceiver != null) {
                    }
                }
                file2 = file;
                arrayList = arrayList4;
                file3 = w8;
                a8Var = a8Var5;
                file4 = null;
                if (g6Var.u0()) {
                }
                file7 = file5;
                final int i182222 = 1;
                final a8 a8Var72222 = a8Var2;
                final boolean z122222 = this.n;
                final File file152222 = file2;
                final ArrayList arrayList72222 = arrayList;
                final File file162222 = file3;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.z9
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i182222) {
                            case 0:
                                a8 a8Var8 = a8Var72222;
                                v9 v9Var = (v9) c2Var;
                                try {
                                    File file17 = a8Var8.P0;
                                    if (file17 != null) {
                                        file17.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18 = a8Var8.R0;
                                    if (file18 != null) {
                                        file18.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19 = a8Var8.Q0;
                                    if (file19 != null) {
                                        file19.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                a8Var8.P0 = null;
                                a8Var8.R0 = null;
                                a8Var8.Q0 = null;
                                File file20 = a8Var8.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    a8Var8.Y0 = null;
                                }
                                File file21 = a8Var8.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a8Var8.X0 = null;
                                }
                                a8Var8.j |= z122222;
                                a8Var8.T0 = arrayList72222;
                                a8Var8.P0 = file162222;
                                a8Var8.Y0 = file152222;
                                a8Var8.R0 = file7;
                                a8Var8.X0 = file4;
                                a8Var8.Q0 = file6;
                                a8Var8.U0 = arrayList6;
                                v9Var.run();
                                break;
                            default:
                                a8 a8Var9 = a8Var72222;
                                bg.c2 c2Var2 = (bg.c2) c2Var;
                                try {
                                    File file22 = a8Var9.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = a8Var9.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = a8Var9.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                a8Var9.P0 = null;
                                a8Var9.R0 = null;
                                a8Var9.Q0 = null;
                                File file25 = a8Var9.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a8Var9.Y0 = null;
                                }
                                File file26 = a8Var9.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    a8Var9.X0 = null;
                                }
                                a8Var9.j |= z122222;
                                a8Var9.T0 = arrayList72222;
                                a8Var9.P0 = file162222;
                                a8Var9.Y0 = file152222;
                                a8Var9.R0 = file7;
                                a8Var9.X0 = file4;
                                a8Var9.Q0 = file6;
                                a8Var9.U0 = arrayList6;
                                c2Var2.run();
                                break;
                        }
                    }
                });
                size = arrayList3.size();
                i9 = 0;
                while (i9 < size) {
                }
                return;
            default:
                final v9 v9Var = (v9) this.r;
                wb wbVar2 = this.b;
                int i19 = wbVar2.c;
                ArrayList arrayList8 = new ArrayList();
                g6 g6Var6 = this.c;
                a8 a8Var8 = this.f;
                g6Var6.t0(arrayList8, false, false, false, false, a8Var8);
                if (!a8Var8.K) {
                    a8Var8.S0 = Utilities.clamp(g6Var6.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = g6Var6.getMasks();
                ArrayList arrayList9 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z13 = a8Var8.K;
                boolean E2 = a8Var8.E();
                arrayList8.clear();
                Bitmap t04 = g6Var6.t0(arrayList8, true, false, false, !z13, a8Var8);
                ArrayList arrayList10 = arrayList8.isEmpty() ? null : arrayList8;
                File pathToAttach = FileLoader.getInstance(i19).getPathToAttach(ImageLoader.scaleAndSaveImage(t04, Bitmap.CompressFormat.PNG, a8Var8.i0, a8Var8.j0, 87, false, 101, 101), true);
                if (t04 != null && !t04.isRecycled()) {
                    t04.recycle();
                }
                boolean z14 = a8Var8.u;
                int i20 = this.d;
                int i21 = this.e;
                final ArrayList arrayList11 = arrayList9;
                if (z14) {
                    long j11 = a8Var8.z0;
                    if (j11 != Long.MIN_VALUE) {
                        Drawable drawable2 = a8Var8.x0;
                        if (drawable2 == null) {
                            drawable2 = r6.e(null, i19, j11, wbVar2.Y1);
                        }
                        if (drawable2 != null) {
                            file8 = a8.w(i19, "webp");
                            Bitmap createBitmap3 = Bitmap.createBitmap(i20, i21, Bitmap.Config.ARGB_8888);
                            g6Var3 = g6Var6;
                            a8.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
                            try {
                                try {
                                    createBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file8));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
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
                g6Var3 = g6Var6;
                file8 = null;
                if (a8Var8.u && a8Var8.K) {
                    int i22 = a8Var8.k0;
                    int i23 = a8Var8.l0;
                    yf.e1 s03 = g6Var3.s0();
                    if (s03 != null) {
                        yf.x0 x0Var2 = s03.n0;
                        if (x0Var2.getChildCount() == 1 && i22 > 0 && i23 > 0) {
                            if (x0Var2.getChildAt(0) instanceof org.telegram.ui.Cells.t1) {
                                imageReceiver2 = ((org.telegram.ui.Cells.t1) x0Var2.getChildAt(0)).getPhotoImage();
                                if (imageReceiver2 != null && ((int) imageReceiver2.getImageWidth()) > 0 && ((int) imageReceiver2.getImageHeight()) > 0) {
                                    float f14 = i22;
                                    float f15 = i23;
                                    float max3 = Math.max(imageReceiver2.getImageWidth() / f14, imageReceiver2.getImageHeight() / f15);
                                    int i24 = (int) ((f14 * max3) / 2.0f);
                                    int i25 = (int) ((f15 * max3) / 2.0f);
                                    Bitmap createBitmap4 = Bitmap.createBitmap(i24, i25, Bitmap.Config.ARGB_8888);
                                    float[] fArr3 = new float[8];
                                    imageReceiver3 = imageReceiver2;
                                    arrayList2 = arrayList10;
                                    for (i11 = 0; i11 < imageReceiver3.getRoundRadius().length; i11++) {
                                        int i26 = i11 * 2;
                                        fArr3[i26] = imageReceiver3.getRoundRadius()[r25];
                                        fArr3[i26 + 1] = imageReceiver3.getRoundRadius()[r25];
                                    }
                                    Canvas canvas3 = new Canvas(createBitmap4);
                                    Path path3 = new Path();
                                    file9 = pathToAttach;
                                    canvas3.scale(0.5f, 0.5f);
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float f16 = (i24 * 2.0f) / 2.0f;
                                    float f17 = (i25 * 2.0f) / 2.0f;
                                    a8Var3 = a8Var8;
                                    file10 = file8;
                                    rectF3.set(f16 - (imageReceiver3.getImageWidth() / 2.0f), f17 - (imageReceiver3.getImageHeight() / 2.0f), (imageReceiver3.getImageWidth() / 2.0f) + f16, (imageReceiver3.getImageHeight() / 2.0f) + f17);
                                    path3.addRoundRect(rectF3, fArr3, Path.Direction.CW);
                                    z10 = true;
                                    Paint paint3 = new Paint(1);
                                    paint3.setColor(-1);
                                    canvas3.drawPath(path3, paint3);
                                    try {
                                        File w11 = a8.w(i19, "webp");
                                        createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w11));
                                        file14 = w11;
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                        file14 = null;
                                    }
                                    createBitmap4.recycle();
                                    file11 = file14;
                                    if (E2) {
                                        g6Var4 = g6Var3;
                                        a8Var4 = a8Var3;
                                        file12 = null;
                                    } else {
                                        g6Var4 = g6Var3;
                                        a8Var4 = a8Var3;
                                        Bitmap t05 = g6Var4.t0(new ArrayList(), false, true, false, false, a8Var4);
                                        file12 = FileLoader.getInstance(i19).getPathToAttach(ImageLoader.scaleAndSaveImage(t05, Bitmap.CompressFormat.PNG, i20, i21, 87, false, 101, 101), z10);
                                        if (t05 != null && !t05.isRecycled()) {
                                            t05.recycle();
                                        }
                                    }
                                    if (this.h) {
                                        Bitmap blurBitmap2 = g6Var4.getBlurBitmap();
                                        file13 = FileLoader.getInstance(i19).getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap2, Bitmap.CompressFormat.PNG, i20, i21, 87, false, 101, 101), z10);
                                        if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                                            blurBitmap2.recycle();
                                        }
                                    } else {
                                        file13 = null;
                                    }
                                    final int i27 = 0;
                                    final boolean z15 = this.n;
                                    final File file17 = file12;
                                    final a8 a8Var9 = a8Var4;
                                    final ArrayList arrayList12 = arrayList2;
                                    final File file18 = file9;
                                    final File file19 = file10;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.z9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    a8 a8Var82 = a8Var9;
                                                    v9 v9Var2 = (v9) v9Var;
                                                    try {
                                                        File file172 = a8Var82.P0;
                                                        if (file172 != null) {
                                                            file172.delete();
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        File file182 = a8Var82.R0;
                                                        if (file182 != null) {
                                                            file182.delete();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    try {
                                                        File file192 = a8Var82.Q0;
                                                        if (file192 != null) {
                                                            file192.delete();
                                                        }
                                                    } catch (Exception unused3) {
                                                    }
                                                    a8Var82.P0 = null;
                                                    a8Var82.R0 = null;
                                                    a8Var82.Q0 = null;
                                                    File file20 = a8Var82.Y0;
                                                    if (file20 != null) {
                                                        try {
                                                            file20.delete();
                                                        } catch (Exception e102) {
                                                            FileLog.e(e102);
                                                        }
                                                        a8Var82.Y0 = null;
                                                    }
                                                    File file21 = a8Var82.X0;
                                                    if (file21 != null) {
                                                        try {
                                                            file21.delete();
                                                        } catch (Exception e112) {
                                                            FileLog.e(e112);
                                                        }
                                                        a8Var82.X0 = null;
                                                    }
                                                    a8Var82.j |= z15;
                                                    a8Var82.T0 = arrayList12;
                                                    a8Var82.P0 = file18;
                                                    a8Var82.Y0 = file19;
                                                    a8Var82.R0 = file17;
                                                    a8Var82.X0 = file11;
                                                    a8Var82.Q0 = file13;
                                                    a8Var82.U0 = arrayList11;
                                                    v9Var2.run();
                                                    break;
                                                default:
                                                    a8 a8Var92 = a8Var9;
                                                    bg.c2 c2Var2 = (bg.c2) v9Var;
                                                    try {
                                                        File file22 = a8Var92.P0;
                                                        if (file22 != null) {
                                                            file22.delete();
                                                        }
                                                    } catch (Exception unused4) {
                                                    }
                                                    try {
                                                        File file23 = a8Var92.R0;
                                                        if (file23 != null) {
                                                            file23.delete();
                                                        }
                                                    } catch (Exception unused5) {
                                                    }
                                                    try {
                                                        File file24 = a8Var92.Q0;
                                                        if (file24 != null) {
                                                            file24.delete();
                                                        }
                                                    } catch (Exception unused6) {
                                                    }
                                                    a8Var92.P0 = null;
                                                    a8Var92.R0 = null;
                                                    a8Var92.Q0 = null;
                                                    File file25 = a8Var92.Y0;
                                                    if (file25 != null) {
                                                        try {
                                                            file25.delete();
                                                        } catch (Exception e12) {
                                                            FileLog.e(e12);
                                                        }
                                                        a8Var92.Y0 = null;
                                                    }
                                                    File file26 = a8Var92.X0;
                                                    if (file26 != null) {
                                                        try {
                                                            file26.delete();
                                                        } catch (Exception e13) {
                                                            FileLog.e(e13);
                                                        }
                                                        a8Var92.X0 = null;
                                                    }
                                                    a8Var92.j |= z15;
                                                    a8Var92.T0 = arrayList12;
                                                    a8Var92.P0 = file18;
                                                    a8Var92.Y0 = file19;
                                                    a8Var92.R0 = file17;
                                                    a8Var92.X0 = file11;
                                                    a8Var92.Q0 = file13;
                                                    a8Var92.U0 = arrayList11;
                                                    c2Var2.run();
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            imageReceiver2 = null;
                            if (imageReceiver2 != null) {
                                float f142 = i22;
                                float f152 = i23;
                                float max32 = Math.max(imageReceiver2.getImageWidth() / f142, imageReceiver2.getImageHeight() / f152);
                                int i242 = (int) ((f142 * max32) / 2.0f);
                                int i252 = (int) ((f152 * max32) / 2.0f);
                                Bitmap createBitmap42 = Bitmap.createBitmap(i242, i252, Bitmap.Config.ARGB_8888);
                                float[] fArr32 = new float[8];
                                imageReceiver3 = imageReceiver2;
                                arrayList2 = arrayList10;
                                while (i11 < imageReceiver3.getRoundRadius().length) {
                                }
                                Canvas canvas32 = new Canvas(createBitmap42);
                                Path path32 = new Path();
                                file9 = pathToAttach;
                                canvas32.scale(0.5f, 0.5f);
                                RectF rectF32 = AndroidUtilities.rectTmp;
                                float f162 = (i242 * 2.0f) / 2.0f;
                                float f172 = (i252 * 2.0f) / 2.0f;
                                a8Var3 = a8Var8;
                                file10 = file8;
                                rectF32.set(f162 - (imageReceiver3.getImageWidth() / 2.0f), f172 - (imageReceiver3.getImageHeight() / 2.0f), (imageReceiver3.getImageWidth() / 2.0f) + f162, (imageReceiver3.getImageHeight() / 2.0f) + f172);
                                path32.addRoundRect(rectF32, fArr32, Path.Direction.CW);
                                z10 = true;
                                Paint paint32 = new Paint(1);
                                paint32.setColor(-1);
                                canvas32.drawPath(path32, paint32);
                                File w112 = a8.w(i19, "webp");
                                createBitmap42.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w112));
                                file14 = w112;
                                createBitmap42.recycle();
                                file11 = file14;
                                if (E2) {
                                }
                                if (this.h) {
                                }
                                final int i272 = 0;
                                final boolean z152 = this.n;
                                final File file172 = file12;
                                final a8 a8Var92 = a8Var4;
                                final ArrayList arrayList122 = arrayList2;
                                final File file182 = file9;
                                final File file192 = file10;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.z9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i272) {
                                            case 0:
                                                a8 a8Var82 = a8Var92;
                                                v9 v9Var2 = (v9) v9Var;
                                                try {
                                                    File file1722 = a8Var82.P0;
                                                    if (file1722 != null) {
                                                        file1722.delete();
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    File file1822 = a8Var82.R0;
                                                    if (file1822 != null) {
                                                        file1822.delete();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                try {
                                                    File file1922 = a8Var82.Q0;
                                                    if (file1922 != null) {
                                                        file1922.delete();
                                                    }
                                                } catch (Exception unused3) {
                                                }
                                                a8Var82.P0 = null;
                                                a8Var82.R0 = null;
                                                a8Var82.Q0 = null;
                                                File file20 = a8Var82.Y0;
                                                if (file20 != null) {
                                                    try {
                                                        file20.delete();
                                                    } catch (Exception e102) {
                                                        FileLog.e(e102);
                                                    }
                                                    a8Var82.Y0 = null;
                                                }
                                                File file21 = a8Var82.X0;
                                                if (file21 != null) {
                                                    try {
                                                        file21.delete();
                                                    } catch (Exception e112) {
                                                        FileLog.e(e112);
                                                    }
                                                    a8Var82.X0 = null;
                                                }
                                                a8Var82.j |= z152;
                                                a8Var82.T0 = arrayList122;
                                                a8Var82.P0 = file182;
                                                a8Var82.Y0 = file192;
                                                a8Var82.R0 = file172;
                                                a8Var82.X0 = file11;
                                                a8Var82.Q0 = file13;
                                                a8Var82.U0 = arrayList11;
                                                v9Var2.run();
                                                break;
                                            default:
                                                a8 a8Var922 = a8Var92;
                                                bg.c2 c2Var2 = (bg.c2) v9Var;
                                                try {
                                                    File file22 = a8Var922.P0;
                                                    if (file22 != null) {
                                                        file22.delete();
                                                    }
                                                } catch (Exception unused4) {
                                                }
                                                try {
                                                    File file23 = a8Var922.R0;
                                                    if (file23 != null) {
                                                        file23.delete();
                                                    }
                                                } catch (Exception unused5) {
                                                }
                                                try {
                                                    File file24 = a8Var922.Q0;
                                                    if (file24 != null) {
                                                        file24.delete();
                                                    }
                                                } catch (Exception unused6) {
                                                }
                                                a8Var922.P0 = null;
                                                a8Var922.R0 = null;
                                                a8Var922.Q0 = null;
                                                File file25 = a8Var922.Y0;
                                                if (file25 != null) {
                                                    try {
                                                        file25.delete();
                                                    } catch (Exception e12) {
                                                        FileLog.e(e12);
                                                    }
                                                    a8Var922.Y0 = null;
                                                }
                                                File file26 = a8Var922.X0;
                                                if (file26 != null) {
                                                    try {
                                                        file26.delete();
                                                    } catch (Exception e13) {
                                                        FileLog.e(e13);
                                                    }
                                                    a8Var922.X0 = null;
                                                }
                                                a8Var922.j |= z152;
                                                a8Var922.T0 = arrayList122;
                                                a8Var922.P0 = file182;
                                                a8Var922.Y0 = file192;
                                                a8Var922.R0 = file172;
                                                a8Var922.X0 = file11;
                                                a8Var922.Q0 = file13;
                                                a8Var922.U0 = arrayList11;
                                                c2Var2.run();
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    imageReceiver2 = null;
                    if (imageReceiver2 != null) {
                    }
                }
                arrayList2 = arrayList10;
                file9 = pathToAttach;
                a8Var3 = a8Var8;
                file10 = file8;
                z10 = true;
                file11 = null;
                if (E2) {
                }
                if (this.h) {
                }
                final int i2722 = 0;
                final boolean z1522 = this.n;
                final File file1722 = file12;
                final a8 a8Var922 = a8Var4;
                final ArrayList arrayList1222 = arrayList2;
                final File file1822 = file9;
                final File file1922 = file10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.z9
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2722) {
                            case 0:
                                a8 a8Var82 = a8Var922;
                                v9 v9Var2 = (v9) v9Var;
                                try {
                                    File file17222 = a8Var82.P0;
                                    if (file17222 != null) {
                                        file17222.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18222 = a8Var82.R0;
                                    if (file18222 != null) {
                                        file18222.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19222 = a8Var82.Q0;
                                    if (file19222 != null) {
                                        file19222.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                a8Var82.P0 = null;
                                a8Var82.R0 = null;
                                a8Var82.Q0 = null;
                                File file20 = a8Var82.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e102) {
                                        FileLog.e(e102);
                                    }
                                    a8Var82.Y0 = null;
                                }
                                File file21 = a8Var82.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e112) {
                                        FileLog.e(e112);
                                    }
                                    a8Var82.X0 = null;
                                }
                                a8Var82.j |= z1522;
                                a8Var82.T0 = arrayList1222;
                                a8Var82.P0 = file1822;
                                a8Var82.Y0 = file1922;
                                a8Var82.R0 = file1722;
                                a8Var82.X0 = file11;
                                a8Var82.Q0 = file13;
                                a8Var82.U0 = arrayList11;
                                v9Var2.run();
                                break;
                            default:
                                a8 a8Var9222 = a8Var922;
                                bg.c2 c2Var2 = (bg.c2) v9Var;
                                try {
                                    File file22 = a8Var9222.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = a8Var9222.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = a8Var9222.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                a8Var9222.P0 = null;
                                a8Var9222.R0 = null;
                                a8Var9222.Q0 = null;
                                File file25 = a8Var9222.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a8Var9222.Y0 = null;
                                }
                                File file26 = a8Var9222.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    a8Var9222.X0 = null;
                                }
                                a8Var9222.j |= z1522;
                                a8Var9222.T0 = arrayList1222;
                                a8Var9222.P0 = file1822;
                                a8Var9222.Y0 = file1922;
                                a8Var9222.R0 = file1722;
                                a8Var9222.X0 = file11;
                                a8Var9222.Q0 = file13;
                                a8Var9222.U0 = arrayList11;
                                c2Var2.run();
                                break;
                        }
                    }
                });
                return;
        }
    }
}
