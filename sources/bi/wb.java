package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;
    public final /* synthetic */ r7 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ r9 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Runnable r;

    public /* synthetic */ wb(ce ceVar, ad adVar, int i10, int i11, r9 r9Var, boolean z10, boolean z11, Runnable runnable, int i12) {
        this.a = i12;
        this.b = ceVar;
        this.c = adVar;
        this.d = i10;
        this.e = i11;
        this.f = r9Var;
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
        r7 r7Var;
        File file;
        File file2;
        ArrayList arrayList;
        File file3;
        r9 r9Var;
        final File file4;
        r9 r9Var2;
        File file5;
        final File file6;
        final File file7;
        int size;
        int i10;
        r7 r7Var2;
        pg.e1 s02;
        ImageReceiver imageReceiver;
        int i11;
        r7 r7Var3;
        File file8;
        ArrayList arrayList2;
        File file9;
        r9 r9Var3;
        File file10;
        boolean z10;
        final File file11;
        r7 r7Var4;
        r9 r9Var4;
        File file12;
        final File file13;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        int i12;
        File file14;
        switch (this.a) {
            case 0:
                final s sVar = (s) this.r;
                ce ceVar = this.b;
                int i13 = ceVar.c;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                r7 r7Var5 = this.c;
                r9 r9Var5 = this.f;
                r7Var5.t0(arrayList4, false, false, false, false, r9Var5);
                if (!r9Var5.K) {
                    r9Var5.S0 = Utilities.clamp(r7Var5.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = r7Var5.getMasks();
                ArrayList arrayList5 = masks != null ? new ArrayList(masks) : null;
                boolean z11 = r9Var5.K;
                boolean E = r9Var5.E();
                arrayList4.clear();
                Bitmap t02 = r7Var5.t0(arrayList4, true, false, false, !z11, r9Var5);
                if (arrayList4.isEmpty()) {
                    arrayList4 = null;
                }
                File w10 = r9.w(i13, "png");
                arrayList3.add(new yb(t02, w10, 0));
                final ArrayList arrayList6 = arrayList5;
                if (r9Var5.u) {
                    long j3 = r9Var5.z0;
                    if (j3 != Long.MIN_VALUE) {
                        Drawable drawable = r9Var5.x0;
                        if (drawable == null) {
                            drawable = e8.e(null, i13, j3, ceVar.c2);
                        }
                        if (drawable != null) {
                            file = r9.w(i13, "webp");
                            Bitmap createBitmap = Bitmap.createBitmap(this.d, this.e, Bitmap.Config.ARGB_8888);
                            r7Var = r7Var5;
                            r9.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            arrayList3.add(new yb(createBitmap, file, 1));
                            if (r9Var5.u && r9Var5.K) {
                                int i14 = r9Var5.k0;
                                int i15 = r9Var5.l0;
                                s02 = r7Var.s0();
                                if (s02 != null) {
                                    pg.x0 x0Var = s02.r0;
                                    if (x0Var.getChildCount() == 1 && i14 > 0 && i15 > 0) {
                                        if (x0Var.getChildAt(0) instanceof org.telegram.ui.Cells.t1) {
                                            imageReceiver = ((org.telegram.ui.Cells.t1) x0Var.getChildAt(0)).getPhotoImage();
                                            if (imageReceiver != null && ((int) imageReceiver.getImageWidth()) > 0 && ((int) imageReceiver.getImageHeight()) > 0) {
                                                float f7 = i14;
                                                float f10 = i15;
                                                float max = Math.max(imageReceiver.getImageWidth() / f7, imageReceiver.getImageHeight() / f10);
                                                int i16 = (int) ((f7 * max) / 2.0f);
                                                int i17 = (int) ((f10 * max) / 2.0f);
                                                Bitmap createBitmap2 = Bitmap.createBitmap(i16, i17, Bitmap.Config.ARGB_8888);
                                                float[] fArr = new float[8];
                                                file2 = file;
                                                arrayList = arrayList4;
                                                for (i11 = 0; i11 < imageReceiver.getRoundRadius().length; i11++) {
                                                    int i18 = i11 * 2;
                                                    fArr[i18] = imageReceiver.getRoundRadius()[r20];
                                                    fArr[i18 + 1] = imageReceiver.getRoundRadius()[r20];
                                                }
                                                Canvas canvas = new Canvas(createBitmap2);
                                                Path path = new Path();
                                                file3 = w10;
                                                canvas.scale(0.5f, 0.5f);
                                                RectF rectF = AndroidUtilities.rectTmp;
                                                float f11 = (i16 * 2.0f) / 2.0f;
                                                float f12 = (i17 * 2.0f) / 2.0f;
                                                r9Var = r9Var5;
                                                rectF.set(f11 - (imageReceiver.getImageWidth() / 2.0f), f12 - (imageReceiver.getImageHeight() / 2.0f), (imageReceiver.getImageWidth() / 2.0f) + f11, (imageReceiver.getImageHeight() / 2.0f) + f12);
                                                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                                Paint paint = new Paint(1);
                                                paint.setColor(-1);
                                                canvas.drawPath(path, paint);
                                                File w11 = r9.w(i13, "webp");
                                                arrayList3.add(new yb(createBitmap2, w11, 2));
                                                file4 = w11;
                                                if (r7Var.u0()) {
                                                    r9Var2 = r9Var;
                                                    file5 = r9Var2.R0;
                                                    file6 = r9Var2.Q0;
                                                } else {
                                                    if (E) {
                                                        r7Var2 = r7Var;
                                                        r9Var2 = r9Var;
                                                        file5 = null;
                                                    } else {
                                                        r7Var2 = r7Var;
                                                        r9 r9Var6 = r9Var;
                                                        Bitmap t03 = r7Var2.t0(new ArrayList(), false, true, false, false, r9Var6);
                                                        r9Var2 = r9Var6;
                                                        file5 = r9.w(i13, "png");
                                                        arrayList3.add(new yb(t03, file5, 3));
                                                    }
                                                    if (!this.h) {
                                                        file7 = file5;
                                                        file6 = null;
                                                        final int i19 = 1;
                                                        final r9 r9Var7 = r9Var2;
                                                        final boolean z12 = this.n;
                                                        final File file15 = file2;
                                                        final ArrayList arrayList7 = arrayList;
                                                        final File file16 = file3;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.xb
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i19) {
                                                                    case 0:
                                                                        r9 r9Var8 = r9Var7;
                                                                        tb tbVar = (tb) sVar;
                                                                        try {
                                                                            File file17 = r9Var8.P0;
                                                                            if (file17 != null) {
                                                                                file17.delete();
                                                                            }
                                                                        } catch (Exception unused) {
                                                                        }
                                                                        try {
                                                                            File file18 = r9Var8.R0;
                                                                            if (file18 != null) {
                                                                                file18.delete();
                                                                            }
                                                                        } catch (Exception unused2) {
                                                                        }
                                                                        try {
                                                                            File file19 = r9Var8.Q0;
                                                                            if (file19 != null) {
                                                                                file19.delete();
                                                                            }
                                                                        } catch (Exception unused3) {
                                                                        }
                                                                        r9Var8.P0 = null;
                                                                        r9Var8.R0 = null;
                                                                        r9Var8.Q0 = null;
                                                                        File file20 = r9Var8.Y0;
                                                                        if (file20 != null) {
                                                                            try {
                                                                                file20.delete();
                                                                            } catch (Exception e) {
                                                                                FileLog.e(e);
                                                                            }
                                                                            r9Var8.Y0 = null;
                                                                        }
                                                                        File file21 = r9Var8.X0;
                                                                        if (file21 != null) {
                                                                            try {
                                                                                file21.delete();
                                                                            } catch (Exception e7) {
                                                                                FileLog.e(e7);
                                                                            }
                                                                            r9Var8.X0 = null;
                                                                        }
                                                                        r9Var8.j |= z12;
                                                                        r9Var8.T0 = arrayList7;
                                                                        r9Var8.P0 = file16;
                                                                        r9Var8.Y0 = file15;
                                                                        r9Var8.R0 = file7;
                                                                        r9Var8.X0 = file4;
                                                                        r9Var8.Q0 = file6;
                                                                        r9Var8.U0 = arrayList6;
                                                                        tbVar.run();
                                                                        break;
                                                                    default:
                                                                        r9 r9Var9 = r9Var7;
                                                                        s sVar2 = (s) sVar;
                                                                        try {
                                                                            File file22 = r9Var9.P0;
                                                                            if (file22 != null) {
                                                                                file22.delete();
                                                                            }
                                                                        } catch (Exception unused4) {
                                                                        }
                                                                        try {
                                                                            File file23 = r9Var9.R0;
                                                                            if (file23 != null) {
                                                                                file23.delete();
                                                                            }
                                                                        } catch (Exception unused5) {
                                                                        }
                                                                        try {
                                                                            File file24 = r9Var9.Q0;
                                                                            if (file24 != null) {
                                                                                file24.delete();
                                                                            }
                                                                        } catch (Exception unused6) {
                                                                        }
                                                                        r9Var9.P0 = null;
                                                                        r9Var9.R0 = null;
                                                                        r9Var9.Q0 = null;
                                                                        File file25 = r9Var9.Y0;
                                                                        if (file25 != null) {
                                                                            try {
                                                                                file25.delete();
                                                                            } catch (Exception e10) {
                                                                                FileLog.e(e10);
                                                                            }
                                                                            r9Var9.Y0 = null;
                                                                        }
                                                                        File file26 = r9Var9.X0;
                                                                        if (file26 != null) {
                                                                            try {
                                                                                file26.delete();
                                                                            } catch (Exception e11) {
                                                                                FileLog.e(e11);
                                                                            }
                                                                            r9Var9.X0 = null;
                                                                        }
                                                                        r9Var9.j |= z12;
                                                                        r9Var9.T0 = arrayList7;
                                                                        r9Var9.P0 = file16;
                                                                        r9Var9.Y0 = file15;
                                                                        r9Var9.R0 = file7;
                                                                        r9Var9.X0 = file4;
                                                                        r9Var9.Q0 = file6;
                                                                        r9Var9.U0 = arrayList6;
                                                                        sVar2.run();
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        size = arrayList3.size();
                                                        i10 = 0;
                                                        while (i10 < size) {
                                                            Object obj = arrayList3.get(i10);
                                                            i10++;
                                                            ((Runnable) obj).run();
                                                        }
                                                        return;
                                                    }
                                                    Bitmap blurBitmap = r7Var2.getBlurBitmap();
                                                    file6 = r9.w(i13, "png");
                                                    arrayList3.add(new yb(blurBitmap, file6, 4));
                                                }
                                                file7 = file5;
                                                final int i192 = 1;
                                                final r9 r9Var72 = r9Var2;
                                                final boolean z122 = this.n;
                                                final File file152 = file2;
                                                final ArrayList arrayList72 = arrayList;
                                                final File file162 = file3;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.xb
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i192) {
                                                            case 0:
                                                                r9 r9Var8 = r9Var72;
                                                                tb tbVar = (tb) sVar;
                                                                try {
                                                                    File file17 = r9Var8.P0;
                                                                    if (file17 != null) {
                                                                        file17.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file18 = r9Var8.R0;
                                                                    if (file18 != null) {
                                                                        file18.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file19 = r9Var8.Q0;
                                                                    if (file19 != null) {
                                                                        file19.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                r9Var8.P0 = null;
                                                                r9Var8.R0 = null;
                                                                r9Var8.Q0 = null;
                                                                File file20 = r9Var8.Y0;
                                                                if (file20 != null) {
                                                                    try {
                                                                        file20.delete();
                                                                    } catch (Exception e) {
                                                                        FileLog.e(e);
                                                                    }
                                                                    r9Var8.Y0 = null;
                                                                }
                                                                File file21 = r9Var8.X0;
                                                                if (file21 != null) {
                                                                    try {
                                                                        file21.delete();
                                                                    } catch (Exception e7) {
                                                                        FileLog.e(e7);
                                                                    }
                                                                    r9Var8.X0 = null;
                                                                }
                                                                r9Var8.j |= z122;
                                                                r9Var8.T0 = arrayList72;
                                                                r9Var8.P0 = file162;
                                                                r9Var8.Y0 = file152;
                                                                r9Var8.R0 = file7;
                                                                r9Var8.X0 = file4;
                                                                r9Var8.Q0 = file6;
                                                                r9Var8.U0 = arrayList6;
                                                                tbVar.run();
                                                                break;
                                                            default:
                                                                r9 r9Var9 = r9Var72;
                                                                s sVar2 = (s) sVar;
                                                                try {
                                                                    File file22 = r9Var9.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file23 = r9Var9.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file24 = r9Var9.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                r9Var9.P0 = null;
                                                                r9Var9.R0 = null;
                                                                r9Var9.Q0 = null;
                                                                File file25 = r9Var9.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e10) {
                                                                        FileLog.e(e10);
                                                                    }
                                                                    r9Var9.Y0 = null;
                                                                }
                                                                File file26 = r9Var9.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e11) {
                                                                        FileLog.e(e11);
                                                                    }
                                                                    r9Var9.X0 = null;
                                                                }
                                                                r9Var9.j |= z122;
                                                                r9Var9.T0 = arrayList72;
                                                                r9Var9.P0 = file162;
                                                                r9Var9.Y0 = file152;
                                                                r9Var9.R0 = file7;
                                                                r9Var9.X0 = file4;
                                                                r9Var9.Q0 = file6;
                                                                r9Var9.U0 = arrayList6;
                                                                sVar2.run();
                                                                break;
                                                        }
                                                    }
                                                });
                                                size = arrayList3.size();
                                                i10 = 0;
                                                while (i10 < size) {
                                                }
                                                return;
                                            }
                                        }
                                        imageReceiver = null;
                                        if (imageReceiver != null) {
                                            float f72 = i14;
                                            float f102 = i15;
                                            float max2 = Math.max(imageReceiver.getImageWidth() / f72, imageReceiver.getImageHeight() / f102);
                                            int i162 = (int) ((f72 * max2) / 2.0f);
                                            int i172 = (int) ((f102 * max2) / 2.0f);
                                            Bitmap createBitmap22 = Bitmap.createBitmap(i162, i172, Bitmap.Config.ARGB_8888);
                                            float[] fArr2 = new float[8];
                                            file2 = file;
                                            arrayList = arrayList4;
                                            while (i11 < imageReceiver.getRoundRadius().length) {
                                            }
                                            Canvas canvas2 = new Canvas(createBitmap22);
                                            Path path2 = new Path();
                                            file3 = w10;
                                            canvas2.scale(0.5f, 0.5f);
                                            RectF rectF2 = AndroidUtilities.rectTmp;
                                            float f112 = (i162 * 2.0f) / 2.0f;
                                            float f122 = (i172 * 2.0f) / 2.0f;
                                            r9Var = r9Var5;
                                            rectF2.set(f112 - (imageReceiver.getImageWidth() / 2.0f), f122 - (imageReceiver.getImageHeight() / 2.0f), (imageReceiver.getImageWidth() / 2.0f) + f112, (imageReceiver.getImageHeight() / 2.0f) + f122);
                                            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                            Paint paint2 = new Paint(1);
                                            paint2.setColor(-1);
                                            canvas2.drawPath(path2, paint2);
                                            File w112 = r9.w(i13, "webp");
                                            arrayList3.add(new yb(createBitmap22, w112, 2));
                                            file4 = w112;
                                            if (r7Var.u0()) {
                                            }
                                            file7 = file5;
                                            final int i1922 = 1;
                                            final r9 r9Var722 = r9Var2;
                                            final boolean z1222 = this.n;
                                            final File file1522 = file2;
                                            final ArrayList arrayList722 = arrayList;
                                            final File file1622 = file3;
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.xb
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i1922) {
                                                        case 0:
                                                            r9 r9Var8 = r9Var722;
                                                            tb tbVar = (tb) sVar;
                                                            try {
                                                                File file17 = r9Var8.P0;
                                                                if (file17 != null) {
                                                                    file17.delete();
                                                                }
                                                            } catch (Exception unused) {
                                                            }
                                                            try {
                                                                File file18 = r9Var8.R0;
                                                                if (file18 != null) {
                                                                    file18.delete();
                                                                }
                                                            } catch (Exception unused2) {
                                                            }
                                                            try {
                                                                File file19 = r9Var8.Q0;
                                                                if (file19 != null) {
                                                                    file19.delete();
                                                                }
                                                            } catch (Exception unused3) {
                                                            }
                                                            r9Var8.P0 = null;
                                                            r9Var8.R0 = null;
                                                            r9Var8.Q0 = null;
                                                            File file20 = r9Var8.Y0;
                                                            if (file20 != null) {
                                                                try {
                                                                    file20.delete();
                                                                } catch (Exception e) {
                                                                    FileLog.e(e);
                                                                }
                                                                r9Var8.Y0 = null;
                                                            }
                                                            File file21 = r9Var8.X0;
                                                            if (file21 != null) {
                                                                try {
                                                                    file21.delete();
                                                                } catch (Exception e7) {
                                                                    FileLog.e(e7);
                                                                }
                                                                r9Var8.X0 = null;
                                                            }
                                                            r9Var8.j |= z1222;
                                                            r9Var8.T0 = arrayList722;
                                                            r9Var8.P0 = file1622;
                                                            r9Var8.Y0 = file1522;
                                                            r9Var8.R0 = file7;
                                                            r9Var8.X0 = file4;
                                                            r9Var8.Q0 = file6;
                                                            r9Var8.U0 = arrayList6;
                                                            tbVar.run();
                                                            break;
                                                        default:
                                                            r9 r9Var9 = r9Var722;
                                                            s sVar2 = (s) sVar;
                                                            try {
                                                                File file22 = r9Var9.P0;
                                                                if (file22 != null) {
                                                                    file22.delete();
                                                                }
                                                            } catch (Exception unused4) {
                                                            }
                                                            try {
                                                                File file23 = r9Var9.R0;
                                                                if (file23 != null) {
                                                                    file23.delete();
                                                                }
                                                            } catch (Exception unused5) {
                                                            }
                                                            try {
                                                                File file24 = r9Var9.Q0;
                                                                if (file24 != null) {
                                                                    file24.delete();
                                                                }
                                                            } catch (Exception unused6) {
                                                            }
                                                            r9Var9.P0 = null;
                                                            r9Var9.R0 = null;
                                                            r9Var9.Q0 = null;
                                                            File file25 = r9Var9.Y0;
                                                            if (file25 != null) {
                                                                try {
                                                                    file25.delete();
                                                                } catch (Exception e10) {
                                                                    FileLog.e(e10);
                                                                }
                                                                r9Var9.Y0 = null;
                                                            }
                                                            File file26 = r9Var9.X0;
                                                            if (file26 != null) {
                                                                try {
                                                                    file26.delete();
                                                                } catch (Exception e11) {
                                                                    FileLog.e(e11);
                                                                }
                                                                r9Var9.X0 = null;
                                                            }
                                                            r9Var9.j |= z1222;
                                                            r9Var9.T0 = arrayList722;
                                                            r9Var9.P0 = file1622;
                                                            r9Var9.Y0 = file1522;
                                                            r9Var9.R0 = file7;
                                                            r9Var9.X0 = file4;
                                                            r9Var9.Q0 = file6;
                                                            r9Var9.U0 = arrayList6;
                                                            sVar2.run();
                                                            break;
                                                    }
                                                }
                                            });
                                            size = arrayList3.size();
                                            i10 = 0;
                                            while (i10 < size) {
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
                            file3 = w10;
                            r9Var = r9Var5;
                            file4 = null;
                            if (r7Var.u0()) {
                            }
                            file7 = file5;
                            final int i19222 = 1;
                            final r9 r9Var7222 = r9Var2;
                            final boolean z12222 = this.n;
                            final File file15222 = file2;
                            final ArrayList arrayList7222 = arrayList;
                            final File file16222 = file3;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.xb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i19222) {
                                        case 0:
                                            r9 r9Var8 = r9Var7222;
                                            tb tbVar = (tb) sVar;
                                            try {
                                                File file17 = r9Var8.P0;
                                                if (file17 != null) {
                                                    file17.delete();
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                File file18 = r9Var8.R0;
                                                if (file18 != null) {
                                                    file18.delete();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                File file19 = r9Var8.Q0;
                                                if (file19 != null) {
                                                    file19.delete();
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            r9Var8.P0 = null;
                                            r9Var8.R0 = null;
                                            r9Var8.Q0 = null;
                                            File file20 = r9Var8.Y0;
                                            if (file20 != null) {
                                                try {
                                                    file20.delete();
                                                } catch (Exception e) {
                                                    FileLog.e(e);
                                                }
                                                r9Var8.Y0 = null;
                                            }
                                            File file21 = r9Var8.X0;
                                            if (file21 != null) {
                                                try {
                                                    file21.delete();
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
                                                }
                                                r9Var8.X0 = null;
                                            }
                                            r9Var8.j |= z12222;
                                            r9Var8.T0 = arrayList7222;
                                            r9Var8.P0 = file16222;
                                            r9Var8.Y0 = file15222;
                                            r9Var8.R0 = file7;
                                            r9Var8.X0 = file4;
                                            r9Var8.Q0 = file6;
                                            r9Var8.U0 = arrayList6;
                                            tbVar.run();
                                            break;
                                        default:
                                            r9 r9Var9 = r9Var7222;
                                            s sVar2 = (s) sVar;
                                            try {
                                                File file22 = r9Var9.P0;
                                                if (file22 != null) {
                                                    file22.delete();
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                File file23 = r9Var9.R0;
                                                if (file23 != null) {
                                                    file23.delete();
                                                }
                                            } catch (Exception unused5) {
                                            }
                                            try {
                                                File file24 = r9Var9.Q0;
                                                if (file24 != null) {
                                                    file24.delete();
                                                }
                                            } catch (Exception unused6) {
                                            }
                                            r9Var9.P0 = null;
                                            r9Var9.R0 = null;
                                            r9Var9.Q0 = null;
                                            File file25 = r9Var9.Y0;
                                            if (file25 != null) {
                                                try {
                                                    file25.delete();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                                r9Var9.Y0 = null;
                                            }
                                            File file26 = r9Var9.X0;
                                            if (file26 != null) {
                                                try {
                                                    file26.delete();
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                }
                                                r9Var9.X0 = null;
                                            }
                                            r9Var9.j |= z12222;
                                            r9Var9.T0 = arrayList7222;
                                            r9Var9.P0 = file16222;
                                            r9Var9.Y0 = file15222;
                                            r9Var9.R0 = file7;
                                            r9Var9.X0 = file4;
                                            r9Var9.Q0 = file6;
                                            r9Var9.U0 = arrayList6;
                                            sVar2.run();
                                            break;
                                    }
                                }
                            });
                            size = arrayList3.size();
                            i10 = 0;
                            while (i10 < size) {
                            }
                            return;
                        }
                    }
                }
                r7Var = r7Var5;
                file = null;
                if (r9Var5.u) {
                    int i142 = r9Var5.k0;
                    int i152 = r9Var5.l0;
                    s02 = r7Var.s0();
                    if (s02 != null) {
                    }
                    imageReceiver = null;
                    if (imageReceiver != null) {
                    }
                }
                file2 = file;
                arrayList = arrayList4;
                file3 = w10;
                r9Var = r9Var5;
                file4 = null;
                if (r7Var.u0()) {
                }
                file7 = file5;
                final int i192222 = 1;
                final r9 r9Var72222 = r9Var2;
                final boolean z122222 = this.n;
                final File file152222 = file2;
                final ArrayList arrayList72222 = arrayList;
                final File file162222 = file3;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.xb
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i192222) {
                            case 0:
                                r9 r9Var8 = r9Var72222;
                                tb tbVar = (tb) sVar;
                                try {
                                    File file17 = r9Var8.P0;
                                    if (file17 != null) {
                                        file17.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18 = r9Var8.R0;
                                    if (file18 != null) {
                                        file18.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19 = r9Var8.Q0;
                                    if (file19 != null) {
                                        file19.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                r9Var8.P0 = null;
                                r9Var8.R0 = null;
                                r9Var8.Q0 = null;
                                File file20 = r9Var8.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    r9Var8.Y0 = null;
                                }
                                File file21 = r9Var8.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    r9Var8.X0 = null;
                                }
                                r9Var8.j |= z122222;
                                r9Var8.T0 = arrayList72222;
                                r9Var8.P0 = file162222;
                                r9Var8.Y0 = file152222;
                                r9Var8.R0 = file7;
                                r9Var8.X0 = file4;
                                r9Var8.Q0 = file6;
                                r9Var8.U0 = arrayList6;
                                tbVar.run();
                                break;
                            default:
                                r9 r9Var9 = r9Var72222;
                                s sVar2 = (s) sVar;
                                try {
                                    File file22 = r9Var9.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = r9Var9.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = r9Var9.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                r9Var9.P0 = null;
                                r9Var9.R0 = null;
                                r9Var9.Q0 = null;
                                File file25 = r9Var9.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    r9Var9.Y0 = null;
                                }
                                File file26 = r9Var9.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    r9Var9.X0 = null;
                                }
                                r9Var9.j |= z122222;
                                r9Var9.T0 = arrayList72222;
                                r9Var9.P0 = file162222;
                                r9Var9.Y0 = file152222;
                                r9Var9.R0 = file7;
                                r9Var9.X0 = file4;
                                r9Var9.Q0 = file6;
                                r9Var9.U0 = arrayList6;
                                sVar2.run();
                                break;
                        }
                    }
                });
                size = arrayList3.size();
                i10 = 0;
                while (i10 < size) {
                }
                return;
            default:
                final tb tbVar = (tb) this.r;
                ce ceVar2 = this.b;
                int i20 = ceVar2.c;
                ArrayList arrayList8 = new ArrayList();
                r7 r7Var6 = this.c;
                r9 r9Var8 = this.f;
                r7Var6.t0(arrayList8, false, false, false, false, r9Var8);
                if (!r9Var8.K) {
                    r9Var8.S0 = Utilities.clamp(r7Var6.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = r7Var6.getMasks();
                ArrayList arrayList9 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z13 = r9Var8.K;
                boolean E2 = r9Var8.E();
                arrayList8.clear();
                Bitmap t04 = r7Var6.t0(arrayList8, true, false, false, !z13, r9Var8);
                ArrayList arrayList10 = arrayList8.isEmpty() ? null : arrayList8;
                File pathToAttach = FileLoader.getInstance(i20).getPathToAttach(ImageLoader.scaleAndSaveImage(t04, Bitmap.CompressFormat.PNG, r9Var8.i0, r9Var8.j0, 87, false, 101, 101), true);
                if (t04 != null && !t04.isRecycled()) {
                    t04.recycle();
                }
                boolean z14 = r9Var8.u;
                int i21 = this.d;
                int i22 = this.e;
                final ArrayList arrayList11 = arrayList9;
                if (z14) {
                    long j10 = r9Var8.z0;
                    if (j10 != Long.MIN_VALUE) {
                        Drawable drawable2 = r9Var8.x0;
                        if (drawable2 == null) {
                            drawable2 = e8.e(null, i20, j10, ceVar2.c2);
                        }
                        if (drawable2 != null) {
                            file8 = r9.w(i20, "webp");
                            Bitmap createBitmap3 = Bitmap.createBitmap(i21, i22, Bitmap.Config.ARGB_8888);
                            r7Var3 = r7Var6;
                            r9.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
                            try {
                                try {
                                    createBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file8));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
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
                r7Var3 = r7Var6;
                file8 = null;
                if (r9Var8.u && r9Var8.K) {
                    int i23 = r9Var8.k0;
                    int i24 = r9Var8.l0;
                    pg.e1 s03 = r7Var3.s0();
                    if (s03 != null) {
                        pg.x0 x0Var2 = s03.r0;
                        if (x0Var2.getChildCount() == 1 && i23 > 0 && i24 > 0) {
                            if (x0Var2.getChildAt(0) instanceof org.telegram.ui.Cells.t1) {
                                imageReceiver2 = ((org.telegram.ui.Cells.t1) x0Var2.getChildAt(0)).getPhotoImage();
                                if (imageReceiver2 != null && ((int) imageReceiver2.getImageWidth()) > 0 && ((int) imageReceiver2.getImageHeight()) > 0) {
                                    float f13 = i23;
                                    float f14 = i24;
                                    float max3 = Math.max(imageReceiver2.getImageWidth() / f13, imageReceiver2.getImageHeight() / f14);
                                    int i25 = (int) ((f13 * max3) / 2.0f);
                                    int i26 = (int) ((f14 * max3) / 2.0f);
                                    Bitmap createBitmap4 = Bitmap.createBitmap(i25, i26, Bitmap.Config.ARGB_8888);
                                    float[] fArr3 = new float[8];
                                    imageReceiver3 = imageReceiver2;
                                    arrayList2 = arrayList10;
                                    for (i12 = 0; i12 < imageReceiver3.getRoundRadius().length; i12++) {
                                        int i27 = i12 * 2;
                                        fArr3[i27] = imageReceiver3.getRoundRadius()[r25];
                                        fArr3[i27 + 1] = imageReceiver3.getRoundRadius()[r25];
                                    }
                                    Canvas canvas3 = new Canvas(createBitmap4);
                                    Path path3 = new Path();
                                    file9 = pathToAttach;
                                    canvas3.scale(0.5f, 0.5f);
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float f15 = (i25 * 2.0f) / 2.0f;
                                    float f16 = (i26 * 2.0f) / 2.0f;
                                    r9Var3 = r9Var8;
                                    file10 = file8;
                                    rectF3.set(f15 - (imageReceiver3.getImageWidth() / 2.0f), f16 - (imageReceiver3.getImageHeight() / 2.0f), (imageReceiver3.getImageWidth() / 2.0f) + f15, (imageReceiver3.getImageHeight() / 2.0f) + f16);
                                    path3.addRoundRect(rectF3, fArr3, Path.Direction.CW);
                                    z10 = true;
                                    Paint paint3 = new Paint(1);
                                    paint3.setColor(-1);
                                    canvas3.drawPath(path3, paint3);
                                    try {
                                        File w12 = r9.w(i20, "webp");
                                        createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w12));
                                        file14 = w12;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        file14 = null;
                                    }
                                    createBitmap4.recycle();
                                    file11 = file14;
                                    if (E2) {
                                        r7Var4 = r7Var3;
                                        r9Var4 = r9Var3;
                                        file12 = null;
                                    } else {
                                        r7Var4 = r7Var3;
                                        r9Var4 = r9Var3;
                                        Bitmap t05 = r7Var4.t0(new ArrayList(), false, true, false, false, r9Var4);
                                        file12 = FileLoader.getInstance(i20).getPathToAttach(ImageLoader.scaleAndSaveImage(t05, Bitmap.CompressFormat.PNG, i21, i22, 87, false, 101, 101), z10);
                                        if (t05 != null && !t05.isRecycled()) {
                                            t05.recycle();
                                        }
                                    }
                                    if (this.h) {
                                        Bitmap blurBitmap2 = r7Var4.getBlurBitmap();
                                        file13 = FileLoader.getInstance(i20).getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap2, Bitmap.CompressFormat.PNG, i21, i22, 87, false, 101, 101), z10);
                                        if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                                            blurBitmap2.recycle();
                                        }
                                    } else {
                                        file13 = null;
                                    }
                                    final int i28 = 0;
                                    final boolean z15 = this.n;
                                    final File file17 = file12;
                                    final r9 r9Var9 = r9Var4;
                                    final ArrayList arrayList12 = arrayList2;
                                    final File file18 = file9;
                                    final File file19 = file10;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.xb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    r9 r9Var82 = r9Var9;
                                                    tb tbVar2 = (tb) tbVar;
                                                    try {
                                                        File file172 = r9Var82.P0;
                                                        if (file172 != null) {
                                                            file172.delete();
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        File file182 = r9Var82.R0;
                                                        if (file182 != null) {
                                                            file182.delete();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    try {
                                                        File file192 = r9Var82.Q0;
                                                        if (file192 != null) {
                                                            file192.delete();
                                                        }
                                                    } catch (Exception unused3) {
                                                    }
                                                    r9Var82.P0 = null;
                                                    r9Var82.R0 = null;
                                                    r9Var82.Q0 = null;
                                                    File file20 = r9Var82.Y0;
                                                    if (file20 != null) {
                                                        try {
                                                            file20.delete();
                                                        } catch (Exception e10) {
                                                            FileLog.e(e10);
                                                        }
                                                        r9Var82.Y0 = null;
                                                    }
                                                    File file21 = r9Var82.X0;
                                                    if (file21 != null) {
                                                        try {
                                                            file21.delete();
                                                        } catch (Exception e72) {
                                                            FileLog.e(e72);
                                                        }
                                                        r9Var82.X0 = null;
                                                    }
                                                    r9Var82.j |= z15;
                                                    r9Var82.T0 = arrayList12;
                                                    r9Var82.P0 = file18;
                                                    r9Var82.Y0 = file19;
                                                    r9Var82.R0 = file17;
                                                    r9Var82.X0 = file11;
                                                    r9Var82.Q0 = file13;
                                                    r9Var82.U0 = arrayList11;
                                                    tbVar2.run();
                                                    break;
                                                default:
                                                    r9 r9Var92 = r9Var9;
                                                    s sVar2 = (s) tbVar;
                                                    try {
                                                        File file22 = r9Var92.P0;
                                                        if (file22 != null) {
                                                            file22.delete();
                                                        }
                                                    } catch (Exception unused4) {
                                                    }
                                                    try {
                                                        File file23 = r9Var92.R0;
                                                        if (file23 != null) {
                                                            file23.delete();
                                                        }
                                                    } catch (Exception unused5) {
                                                    }
                                                    try {
                                                        File file24 = r9Var92.Q0;
                                                        if (file24 != null) {
                                                            file24.delete();
                                                        }
                                                    } catch (Exception unused6) {
                                                    }
                                                    r9Var92.P0 = null;
                                                    r9Var92.R0 = null;
                                                    r9Var92.Q0 = null;
                                                    File file25 = r9Var92.Y0;
                                                    if (file25 != null) {
                                                        try {
                                                            file25.delete();
                                                        } catch (Exception e102) {
                                                            FileLog.e(e102);
                                                        }
                                                        r9Var92.Y0 = null;
                                                    }
                                                    File file26 = r9Var92.X0;
                                                    if (file26 != null) {
                                                        try {
                                                            file26.delete();
                                                        } catch (Exception e11) {
                                                            FileLog.e(e11);
                                                        }
                                                        r9Var92.X0 = null;
                                                    }
                                                    r9Var92.j |= z15;
                                                    r9Var92.T0 = arrayList12;
                                                    r9Var92.P0 = file18;
                                                    r9Var92.Y0 = file19;
                                                    r9Var92.R0 = file17;
                                                    r9Var92.X0 = file11;
                                                    r9Var92.Q0 = file13;
                                                    r9Var92.U0 = arrayList11;
                                                    sVar2.run();
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            imageReceiver2 = null;
                            if (imageReceiver2 != null) {
                                float f132 = i23;
                                float f142 = i24;
                                float max32 = Math.max(imageReceiver2.getImageWidth() / f132, imageReceiver2.getImageHeight() / f142);
                                int i252 = (int) ((f132 * max32) / 2.0f);
                                int i262 = (int) ((f142 * max32) / 2.0f);
                                Bitmap createBitmap42 = Bitmap.createBitmap(i252, i262, Bitmap.Config.ARGB_8888);
                                float[] fArr32 = new float[8];
                                imageReceiver3 = imageReceiver2;
                                arrayList2 = arrayList10;
                                while (i12 < imageReceiver3.getRoundRadius().length) {
                                }
                                Canvas canvas32 = new Canvas(createBitmap42);
                                Path path32 = new Path();
                                file9 = pathToAttach;
                                canvas32.scale(0.5f, 0.5f);
                                RectF rectF32 = AndroidUtilities.rectTmp;
                                float f152 = (i252 * 2.0f) / 2.0f;
                                float f162 = (i262 * 2.0f) / 2.0f;
                                r9Var3 = r9Var8;
                                file10 = file8;
                                rectF32.set(f152 - (imageReceiver3.getImageWidth() / 2.0f), f162 - (imageReceiver3.getImageHeight() / 2.0f), (imageReceiver3.getImageWidth() / 2.0f) + f152, (imageReceiver3.getImageHeight() / 2.0f) + f162);
                                path32.addRoundRect(rectF32, fArr32, Path.Direction.CW);
                                z10 = true;
                                Paint paint32 = new Paint(1);
                                paint32.setColor(-1);
                                canvas32.drawPath(path32, paint32);
                                File w122 = r9.w(i20, "webp");
                                createBitmap42.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w122));
                                file14 = w122;
                                createBitmap42.recycle();
                                file11 = file14;
                                if (E2) {
                                }
                                if (this.h) {
                                }
                                final int i282 = 0;
                                final boolean z152 = this.n;
                                final File file172 = file12;
                                final r9 r9Var92 = r9Var4;
                                final ArrayList arrayList122 = arrayList2;
                                final File file182 = file9;
                                final File file192 = file10;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.xb
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i282) {
                                            case 0:
                                                r9 r9Var82 = r9Var92;
                                                tb tbVar2 = (tb) tbVar;
                                                try {
                                                    File file1722 = r9Var82.P0;
                                                    if (file1722 != null) {
                                                        file1722.delete();
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    File file1822 = r9Var82.R0;
                                                    if (file1822 != null) {
                                                        file1822.delete();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                try {
                                                    File file1922 = r9Var82.Q0;
                                                    if (file1922 != null) {
                                                        file1922.delete();
                                                    }
                                                } catch (Exception unused3) {
                                                }
                                                r9Var82.P0 = null;
                                                r9Var82.R0 = null;
                                                r9Var82.Q0 = null;
                                                File file20 = r9Var82.Y0;
                                                if (file20 != null) {
                                                    try {
                                                        file20.delete();
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                    }
                                                    r9Var82.Y0 = null;
                                                }
                                                File file21 = r9Var82.X0;
                                                if (file21 != null) {
                                                    try {
                                                        file21.delete();
                                                    } catch (Exception e72) {
                                                        FileLog.e(e72);
                                                    }
                                                    r9Var82.X0 = null;
                                                }
                                                r9Var82.j |= z152;
                                                r9Var82.T0 = arrayList122;
                                                r9Var82.P0 = file182;
                                                r9Var82.Y0 = file192;
                                                r9Var82.R0 = file172;
                                                r9Var82.X0 = file11;
                                                r9Var82.Q0 = file13;
                                                r9Var82.U0 = arrayList11;
                                                tbVar2.run();
                                                break;
                                            default:
                                                r9 r9Var922 = r9Var92;
                                                s sVar2 = (s) tbVar;
                                                try {
                                                    File file22 = r9Var922.P0;
                                                    if (file22 != null) {
                                                        file22.delete();
                                                    }
                                                } catch (Exception unused4) {
                                                }
                                                try {
                                                    File file23 = r9Var922.R0;
                                                    if (file23 != null) {
                                                        file23.delete();
                                                    }
                                                } catch (Exception unused5) {
                                                }
                                                try {
                                                    File file24 = r9Var922.Q0;
                                                    if (file24 != null) {
                                                        file24.delete();
                                                    }
                                                } catch (Exception unused6) {
                                                }
                                                r9Var922.P0 = null;
                                                r9Var922.R0 = null;
                                                r9Var922.Q0 = null;
                                                File file25 = r9Var922.Y0;
                                                if (file25 != null) {
                                                    try {
                                                        file25.delete();
                                                    } catch (Exception e102) {
                                                        FileLog.e(e102);
                                                    }
                                                    r9Var922.Y0 = null;
                                                }
                                                File file26 = r9Var922.X0;
                                                if (file26 != null) {
                                                    try {
                                                        file26.delete();
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                    }
                                                    r9Var922.X0 = null;
                                                }
                                                r9Var922.j |= z152;
                                                r9Var922.T0 = arrayList122;
                                                r9Var922.P0 = file182;
                                                r9Var922.Y0 = file192;
                                                r9Var922.R0 = file172;
                                                r9Var922.X0 = file11;
                                                r9Var922.Q0 = file13;
                                                r9Var922.U0 = arrayList11;
                                                sVar2.run();
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
                r9Var3 = r9Var8;
                file10 = file8;
                z10 = true;
                file11 = null;
                if (E2) {
                }
                if (this.h) {
                }
                final int i2822 = 0;
                final boolean z1522 = this.n;
                final File file1722 = file12;
                final r9 r9Var922 = r9Var4;
                final ArrayList arrayList1222 = arrayList2;
                final File file1822 = file9;
                final File file1922 = file10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.xb
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2822) {
                            case 0:
                                r9 r9Var82 = r9Var922;
                                tb tbVar2 = (tb) tbVar;
                                try {
                                    File file17222 = r9Var82.P0;
                                    if (file17222 != null) {
                                        file17222.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18222 = r9Var82.R0;
                                    if (file18222 != null) {
                                        file18222.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19222 = r9Var82.Q0;
                                    if (file19222 != null) {
                                        file19222.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                r9Var82.P0 = null;
                                r9Var82.R0 = null;
                                r9Var82.Q0 = null;
                                File file20 = r9Var82.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    r9Var82.Y0 = null;
                                }
                                File file21 = r9Var82.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e72) {
                                        FileLog.e(e72);
                                    }
                                    r9Var82.X0 = null;
                                }
                                r9Var82.j |= z1522;
                                r9Var82.T0 = arrayList1222;
                                r9Var82.P0 = file1822;
                                r9Var82.Y0 = file1922;
                                r9Var82.R0 = file1722;
                                r9Var82.X0 = file11;
                                r9Var82.Q0 = file13;
                                r9Var82.U0 = arrayList11;
                                tbVar2.run();
                                break;
                            default:
                                r9 r9Var9222 = r9Var922;
                                s sVar2 = (s) tbVar;
                                try {
                                    File file22 = r9Var9222.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = r9Var9222.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = r9Var9222.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                r9Var9222.P0 = null;
                                r9Var9222.R0 = null;
                                r9Var9222.Q0 = null;
                                File file25 = r9Var9222.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e102) {
                                        FileLog.e(e102);
                                    }
                                    r9Var9222.Y0 = null;
                                }
                                File file26 = r9Var9222.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    r9Var9222.X0 = null;
                                }
                                r9Var9222.j |= z1522;
                                r9Var9222.T0 = arrayList1222;
                                r9Var9222.P0 = file1822;
                                r9Var9222.Y0 = file1922;
                                r9Var9222.R0 = file1722;
                                r9Var9222.X0 = file11;
                                r9Var9222.Q0 = file13;
                                r9Var9222.U0 = arrayList11;
                                sVar2.run();
                                break;
                        }
                    }
                });
                return;
        }
    }
}
