package di;

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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class na implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;
    public final /* synthetic */ q6 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ o8 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Runnable r;

    public /* synthetic */ na(pc pcVar, rb rbVar, int i10, int i11, o8 o8Var, boolean z10, boolean z11, Runnable runnable, int i12) {
        this.a = i12;
        this.b = pcVar;
        this.c = rbVar;
        this.d = i10;
        this.e = i11;
        this.f = o8Var;
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
        q6 q6Var;
        File file;
        File file2;
        ArrayList arrayList;
        File file3;
        o8 o8Var;
        final File file4;
        o8 o8Var2;
        File file5;
        final File file6;
        final File file7;
        int size;
        int i10;
        q6 q6Var2;
        rg.g1 s02;
        ImageReceiver imageReceiver;
        int i11;
        q6 q6Var3;
        File file8;
        ArrayList arrayList2;
        File file9;
        o8 o8Var3;
        File file10;
        boolean z10;
        final File file11;
        q6 q6Var4;
        o8 o8Var4;
        File file12;
        final File file13;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        int i12;
        File file14;
        switch (this.a) {
            case 0:
                final ah.g gVar = (ah.g) this.r;
                pc pcVar = this.b;
                int i13 = pcVar.c;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                q6 q6Var5 = this.c;
                o8 o8Var5 = this.f;
                q6Var5.t0(arrayList4, false, false, false, false, o8Var5);
                if (!o8Var5.K) {
                    o8Var5.S0 = Utilities.clamp(q6Var5.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = q6Var5.getMasks();
                ArrayList arrayList5 = masks != null ? new ArrayList(masks) : null;
                boolean z11 = o8Var5.K;
                boolean E = o8Var5.E();
                arrayList4.clear();
                Bitmap t02 = q6Var5.t0(arrayList4, true, false, false, !z11, o8Var5);
                if (arrayList4.isEmpty()) {
                    arrayList4 = null;
                }
                File w10 = o8.w(i13, "png");
                arrayList3.add(new pa(t02, w10, 0));
                final ArrayList arrayList6 = arrayList5;
                if (o8Var5.u) {
                    long j3 = o8Var5.z0;
                    if (j3 != Long.MIN_VALUE) {
                        Drawable drawable = o8Var5.x0;
                        if (drawable == null) {
                            drawable = d7.e(null, i13, j3, pcVar.c2);
                        }
                        if (drawable != null) {
                            file = o8.w(i13, "webp");
                            Bitmap createBitmap = Bitmap.createBitmap(this.d, this.e, Bitmap.Config.ARGB_8888);
                            q6Var = q6Var5;
                            o8.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            arrayList3.add(new pa(createBitmap, file, 1));
                            if (o8Var5.u && o8Var5.K) {
                                int i14 = o8Var5.k0;
                                int i15 = o8Var5.l0;
                                s02 = q6Var.s0();
                                if (s02 != null) {
                                    rg.z0 z0Var = s02.r0;
                                    if (z0Var.getChildCount() == 1 && i14 > 0 && i15 > 0) {
                                        if (z0Var.getChildAt(0) instanceof org.telegram.ui.Cells.t1) {
                                            imageReceiver = ((org.telegram.ui.Cells.t1) z0Var.getChildAt(0)).getPhotoImage();
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
                                                o8Var = o8Var5;
                                                rectF.set(f11 - (imageReceiver.getImageWidth() / 2.0f), f12 - (imageReceiver.getImageHeight() / 2.0f), (imageReceiver.getImageWidth() / 2.0f) + f11, (imageReceiver.getImageHeight() / 2.0f) + f12);
                                                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                                Paint paint = new Paint(1);
                                                paint.setColor(-1);
                                                canvas.drawPath(path, paint);
                                                File w11 = o8.w(i13, "webp");
                                                arrayList3.add(new pa(createBitmap2, w11, 2));
                                                file4 = w11;
                                                if (q6Var.u0()) {
                                                    o8Var2 = o8Var;
                                                    file5 = o8Var2.R0;
                                                    file6 = o8Var2.Q0;
                                                } else {
                                                    if (E) {
                                                        q6Var2 = q6Var;
                                                        o8Var2 = o8Var;
                                                        file5 = null;
                                                    } else {
                                                        q6Var2 = q6Var;
                                                        o8 o8Var6 = o8Var;
                                                        Bitmap t03 = q6Var2.t0(new ArrayList(), false, true, false, false, o8Var6);
                                                        o8Var2 = o8Var6;
                                                        file5 = o8.w(i13, "png");
                                                        arrayList3.add(new pa(t03, file5, 3));
                                                    }
                                                    if (!this.h) {
                                                        file7 = file5;
                                                        file6 = null;
                                                        final int i19 = 1;
                                                        final o8 o8Var7 = o8Var2;
                                                        final boolean z12 = this.n;
                                                        final File file15 = file2;
                                                        final ArrayList arrayList7 = arrayList;
                                                        final File file16 = file3;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.oa
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i19) {
                                                                    case 0:
                                                                        o8 o8Var8 = o8Var7;
                                                                        ka kaVar = (ka) gVar;
                                                                        try {
                                                                            File file17 = o8Var8.P0;
                                                                            if (file17 != null) {
                                                                                file17.delete();
                                                                            }
                                                                        } catch (Exception unused) {
                                                                        }
                                                                        try {
                                                                            File file18 = o8Var8.R0;
                                                                            if (file18 != null) {
                                                                                file18.delete();
                                                                            }
                                                                        } catch (Exception unused2) {
                                                                        }
                                                                        try {
                                                                            File file19 = o8Var8.Q0;
                                                                            if (file19 != null) {
                                                                                file19.delete();
                                                                            }
                                                                        } catch (Exception unused3) {
                                                                        }
                                                                        o8Var8.P0 = null;
                                                                        o8Var8.R0 = null;
                                                                        o8Var8.Q0 = null;
                                                                        File file20 = o8Var8.Y0;
                                                                        if (file20 != null) {
                                                                            try {
                                                                                file20.delete();
                                                                            } catch (Exception e7) {
                                                                                FileLog.e(e7);
                                                                            }
                                                                            o8Var8.Y0 = null;
                                                                        }
                                                                        File file21 = o8Var8.X0;
                                                                        if (file21 != null) {
                                                                            try {
                                                                                file21.delete();
                                                                            } catch (Exception e10) {
                                                                                FileLog.e(e10);
                                                                            }
                                                                            o8Var8.X0 = null;
                                                                        }
                                                                        o8Var8.j |= z12;
                                                                        o8Var8.T0 = arrayList7;
                                                                        o8Var8.P0 = file16;
                                                                        o8Var8.Y0 = file15;
                                                                        o8Var8.R0 = file7;
                                                                        o8Var8.X0 = file4;
                                                                        o8Var8.Q0 = file6;
                                                                        o8Var8.U0 = arrayList6;
                                                                        kaVar.run();
                                                                        break;
                                                                    default:
                                                                        o8 o8Var9 = o8Var7;
                                                                        ah.g gVar2 = (ah.g) gVar;
                                                                        try {
                                                                            File file22 = o8Var9.P0;
                                                                            if (file22 != null) {
                                                                                file22.delete();
                                                                            }
                                                                        } catch (Exception unused4) {
                                                                        }
                                                                        try {
                                                                            File file23 = o8Var9.R0;
                                                                            if (file23 != null) {
                                                                                file23.delete();
                                                                            }
                                                                        } catch (Exception unused5) {
                                                                        }
                                                                        try {
                                                                            File file24 = o8Var9.Q0;
                                                                            if (file24 != null) {
                                                                                file24.delete();
                                                                            }
                                                                        } catch (Exception unused6) {
                                                                        }
                                                                        o8Var9.P0 = null;
                                                                        o8Var9.R0 = null;
                                                                        o8Var9.Q0 = null;
                                                                        File file25 = o8Var9.Y0;
                                                                        if (file25 != null) {
                                                                            try {
                                                                                file25.delete();
                                                                            } catch (Exception e11) {
                                                                                FileLog.e(e11);
                                                                            }
                                                                            o8Var9.Y0 = null;
                                                                        }
                                                                        File file26 = o8Var9.X0;
                                                                        if (file26 != null) {
                                                                            try {
                                                                                file26.delete();
                                                                            } catch (Exception e12) {
                                                                                FileLog.e(e12);
                                                                            }
                                                                            o8Var9.X0 = null;
                                                                        }
                                                                        o8Var9.j |= z12;
                                                                        o8Var9.T0 = arrayList7;
                                                                        o8Var9.P0 = file16;
                                                                        o8Var9.Y0 = file15;
                                                                        o8Var9.R0 = file7;
                                                                        o8Var9.X0 = file4;
                                                                        o8Var9.Q0 = file6;
                                                                        o8Var9.U0 = arrayList6;
                                                                        gVar2.run();
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
                                                    Bitmap blurBitmap = q6Var2.getBlurBitmap();
                                                    file6 = o8.w(i13, "png");
                                                    arrayList3.add(new pa(blurBitmap, file6, 4));
                                                }
                                                file7 = file5;
                                                final int i192 = 1;
                                                final o8 o8Var72 = o8Var2;
                                                final boolean z122 = this.n;
                                                final File file152 = file2;
                                                final ArrayList arrayList72 = arrayList;
                                                final File file162 = file3;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.oa
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i192) {
                                                            case 0:
                                                                o8 o8Var8 = o8Var72;
                                                                ka kaVar = (ka) gVar;
                                                                try {
                                                                    File file17 = o8Var8.P0;
                                                                    if (file17 != null) {
                                                                        file17.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file18 = o8Var8.R0;
                                                                    if (file18 != null) {
                                                                        file18.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file19 = o8Var8.Q0;
                                                                    if (file19 != null) {
                                                                        file19.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                o8Var8.P0 = null;
                                                                o8Var8.R0 = null;
                                                                o8Var8.Q0 = null;
                                                                File file20 = o8Var8.Y0;
                                                                if (file20 != null) {
                                                                    try {
                                                                        file20.delete();
                                                                    } catch (Exception e7) {
                                                                        FileLog.e(e7);
                                                                    }
                                                                    o8Var8.Y0 = null;
                                                                }
                                                                File file21 = o8Var8.X0;
                                                                if (file21 != null) {
                                                                    try {
                                                                        file21.delete();
                                                                    } catch (Exception e10) {
                                                                        FileLog.e(e10);
                                                                    }
                                                                    o8Var8.X0 = null;
                                                                }
                                                                o8Var8.j |= z122;
                                                                o8Var8.T0 = arrayList72;
                                                                o8Var8.P0 = file162;
                                                                o8Var8.Y0 = file152;
                                                                o8Var8.R0 = file7;
                                                                o8Var8.X0 = file4;
                                                                o8Var8.Q0 = file6;
                                                                o8Var8.U0 = arrayList6;
                                                                kaVar.run();
                                                                break;
                                                            default:
                                                                o8 o8Var9 = o8Var72;
                                                                ah.g gVar2 = (ah.g) gVar;
                                                                try {
                                                                    File file22 = o8Var9.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file23 = o8Var9.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file24 = o8Var9.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                o8Var9.P0 = null;
                                                                o8Var9.R0 = null;
                                                                o8Var9.Q0 = null;
                                                                File file25 = o8Var9.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e11) {
                                                                        FileLog.e(e11);
                                                                    }
                                                                    o8Var9.Y0 = null;
                                                                }
                                                                File file26 = o8Var9.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e12) {
                                                                        FileLog.e(e12);
                                                                    }
                                                                    o8Var9.X0 = null;
                                                                }
                                                                o8Var9.j |= z122;
                                                                o8Var9.T0 = arrayList72;
                                                                o8Var9.P0 = file162;
                                                                o8Var9.Y0 = file152;
                                                                o8Var9.R0 = file7;
                                                                o8Var9.X0 = file4;
                                                                o8Var9.Q0 = file6;
                                                                o8Var9.U0 = arrayList6;
                                                                gVar2.run();
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
                                            o8Var = o8Var5;
                                            rectF2.set(f112 - (imageReceiver.getImageWidth() / 2.0f), f122 - (imageReceiver.getImageHeight() / 2.0f), (imageReceiver.getImageWidth() / 2.0f) + f112, (imageReceiver.getImageHeight() / 2.0f) + f122);
                                            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                            Paint paint2 = new Paint(1);
                                            paint2.setColor(-1);
                                            canvas2.drawPath(path2, paint2);
                                            File w112 = o8.w(i13, "webp");
                                            arrayList3.add(new pa(createBitmap22, w112, 2));
                                            file4 = w112;
                                            if (q6Var.u0()) {
                                            }
                                            file7 = file5;
                                            final int i1922 = 1;
                                            final o8 o8Var722 = o8Var2;
                                            final boolean z1222 = this.n;
                                            final File file1522 = file2;
                                            final ArrayList arrayList722 = arrayList;
                                            final File file1622 = file3;
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.oa
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i1922) {
                                                        case 0:
                                                            o8 o8Var8 = o8Var722;
                                                            ka kaVar = (ka) gVar;
                                                            try {
                                                                File file17 = o8Var8.P0;
                                                                if (file17 != null) {
                                                                    file17.delete();
                                                                }
                                                            } catch (Exception unused) {
                                                            }
                                                            try {
                                                                File file18 = o8Var8.R0;
                                                                if (file18 != null) {
                                                                    file18.delete();
                                                                }
                                                            } catch (Exception unused2) {
                                                            }
                                                            try {
                                                                File file19 = o8Var8.Q0;
                                                                if (file19 != null) {
                                                                    file19.delete();
                                                                }
                                                            } catch (Exception unused3) {
                                                            }
                                                            o8Var8.P0 = null;
                                                            o8Var8.R0 = null;
                                                            o8Var8.Q0 = null;
                                                            File file20 = o8Var8.Y0;
                                                            if (file20 != null) {
                                                                try {
                                                                    file20.delete();
                                                                } catch (Exception e7) {
                                                                    FileLog.e(e7);
                                                                }
                                                                o8Var8.Y0 = null;
                                                            }
                                                            File file21 = o8Var8.X0;
                                                            if (file21 != null) {
                                                                try {
                                                                    file21.delete();
                                                                } catch (Exception e10) {
                                                                    FileLog.e(e10);
                                                                }
                                                                o8Var8.X0 = null;
                                                            }
                                                            o8Var8.j |= z1222;
                                                            o8Var8.T0 = arrayList722;
                                                            o8Var8.P0 = file1622;
                                                            o8Var8.Y0 = file1522;
                                                            o8Var8.R0 = file7;
                                                            o8Var8.X0 = file4;
                                                            o8Var8.Q0 = file6;
                                                            o8Var8.U0 = arrayList6;
                                                            kaVar.run();
                                                            break;
                                                        default:
                                                            o8 o8Var9 = o8Var722;
                                                            ah.g gVar2 = (ah.g) gVar;
                                                            try {
                                                                File file22 = o8Var9.P0;
                                                                if (file22 != null) {
                                                                    file22.delete();
                                                                }
                                                            } catch (Exception unused4) {
                                                            }
                                                            try {
                                                                File file23 = o8Var9.R0;
                                                                if (file23 != null) {
                                                                    file23.delete();
                                                                }
                                                            } catch (Exception unused5) {
                                                            }
                                                            try {
                                                                File file24 = o8Var9.Q0;
                                                                if (file24 != null) {
                                                                    file24.delete();
                                                                }
                                                            } catch (Exception unused6) {
                                                            }
                                                            o8Var9.P0 = null;
                                                            o8Var9.R0 = null;
                                                            o8Var9.Q0 = null;
                                                            File file25 = o8Var9.Y0;
                                                            if (file25 != null) {
                                                                try {
                                                                    file25.delete();
                                                                } catch (Exception e11) {
                                                                    FileLog.e(e11);
                                                                }
                                                                o8Var9.Y0 = null;
                                                            }
                                                            File file26 = o8Var9.X0;
                                                            if (file26 != null) {
                                                                try {
                                                                    file26.delete();
                                                                } catch (Exception e12) {
                                                                    FileLog.e(e12);
                                                                }
                                                                o8Var9.X0 = null;
                                                            }
                                                            o8Var9.j |= z1222;
                                                            o8Var9.T0 = arrayList722;
                                                            o8Var9.P0 = file1622;
                                                            o8Var9.Y0 = file1522;
                                                            o8Var9.R0 = file7;
                                                            o8Var9.X0 = file4;
                                                            o8Var9.Q0 = file6;
                                                            o8Var9.U0 = arrayList6;
                                                            gVar2.run();
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
                            o8Var = o8Var5;
                            file4 = null;
                            if (q6Var.u0()) {
                            }
                            file7 = file5;
                            final int i19222 = 1;
                            final o8 o8Var7222 = o8Var2;
                            final boolean z12222 = this.n;
                            final File file15222 = file2;
                            final ArrayList arrayList7222 = arrayList;
                            final File file16222 = file3;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.oa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i19222) {
                                        case 0:
                                            o8 o8Var8 = o8Var7222;
                                            ka kaVar = (ka) gVar;
                                            try {
                                                File file17 = o8Var8.P0;
                                                if (file17 != null) {
                                                    file17.delete();
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                File file18 = o8Var8.R0;
                                                if (file18 != null) {
                                                    file18.delete();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                File file19 = o8Var8.Q0;
                                                if (file19 != null) {
                                                    file19.delete();
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            o8Var8.P0 = null;
                                            o8Var8.R0 = null;
                                            o8Var8.Q0 = null;
                                            File file20 = o8Var8.Y0;
                                            if (file20 != null) {
                                                try {
                                                    file20.delete();
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
                                                }
                                                o8Var8.Y0 = null;
                                            }
                                            File file21 = o8Var8.X0;
                                            if (file21 != null) {
                                                try {
                                                    file21.delete();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                                o8Var8.X0 = null;
                                            }
                                            o8Var8.j |= z12222;
                                            o8Var8.T0 = arrayList7222;
                                            o8Var8.P0 = file16222;
                                            o8Var8.Y0 = file15222;
                                            o8Var8.R0 = file7;
                                            o8Var8.X0 = file4;
                                            o8Var8.Q0 = file6;
                                            o8Var8.U0 = arrayList6;
                                            kaVar.run();
                                            break;
                                        default:
                                            o8 o8Var9 = o8Var7222;
                                            ah.g gVar2 = (ah.g) gVar;
                                            try {
                                                File file22 = o8Var9.P0;
                                                if (file22 != null) {
                                                    file22.delete();
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                File file23 = o8Var9.R0;
                                                if (file23 != null) {
                                                    file23.delete();
                                                }
                                            } catch (Exception unused5) {
                                            }
                                            try {
                                                File file24 = o8Var9.Q0;
                                                if (file24 != null) {
                                                    file24.delete();
                                                }
                                            } catch (Exception unused6) {
                                            }
                                            o8Var9.P0 = null;
                                            o8Var9.R0 = null;
                                            o8Var9.Q0 = null;
                                            File file25 = o8Var9.Y0;
                                            if (file25 != null) {
                                                try {
                                                    file25.delete();
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                }
                                                o8Var9.Y0 = null;
                                            }
                                            File file26 = o8Var9.X0;
                                            if (file26 != null) {
                                                try {
                                                    file26.delete();
                                                } catch (Exception e12) {
                                                    FileLog.e(e12);
                                                }
                                                o8Var9.X0 = null;
                                            }
                                            o8Var9.j |= z12222;
                                            o8Var9.T0 = arrayList7222;
                                            o8Var9.P0 = file16222;
                                            o8Var9.Y0 = file15222;
                                            o8Var9.R0 = file7;
                                            o8Var9.X0 = file4;
                                            o8Var9.Q0 = file6;
                                            o8Var9.U0 = arrayList6;
                                            gVar2.run();
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
                q6Var = q6Var5;
                file = null;
                if (o8Var5.u) {
                    int i142 = o8Var5.k0;
                    int i152 = o8Var5.l0;
                    s02 = q6Var.s0();
                    if (s02 != null) {
                    }
                    imageReceiver = null;
                    if (imageReceiver != null) {
                    }
                }
                file2 = file;
                arrayList = arrayList4;
                file3 = w10;
                o8Var = o8Var5;
                file4 = null;
                if (q6Var.u0()) {
                }
                file7 = file5;
                final int i192222 = 1;
                final o8 o8Var72222 = o8Var2;
                final boolean z122222 = this.n;
                final File file152222 = file2;
                final ArrayList arrayList72222 = arrayList;
                final File file162222 = file3;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.oa
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i192222) {
                            case 0:
                                o8 o8Var8 = o8Var72222;
                                ka kaVar = (ka) gVar;
                                try {
                                    File file17 = o8Var8.P0;
                                    if (file17 != null) {
                                        file17.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18 = o8Var8.R0;
                                    if (file18 != null) {
                                        file18.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19 = o8Var8.Q0;
                                    if (file19 != null) {
                                        file19.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                o8Var8.P0 = null;
                                o8Var8.R0 = null;
                                o8Var8.Q0 = null;
                                File file20 = o8Var8.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    o8Var8.Y0 = null;
                                }
                                File file21 = o8Var8.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o8Var8.X0 = null;
                                }
                                o8Var8.j |= z122222;
                                o8Var8.T0 = arrayList72222;
                                o8Var8.P0 = file162222;
                                o8Var8.Y0 = file152222;
                                o8Var8.R0 = file7;
                                o8Var8.X0 = file4;
                                o8Var8.Q0 = file6;
                                o8Var8.U0 = arrayList6;
                                kaVar.run();
                                break;
                            default:
                                o8 o8Var9 = o8Var72222;
                                ah.g gVar2 = (ah.g) gVar;
                                try {
                                    File file22 = o8Var9.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = o8Var9.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = o8Var9.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                o8Var9.P0 = null;
                                o8Var9.R0 = null;
                                o8Var9.Q0 = null;
                                File file25 = o8Var9.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    o8Var9.Y0 = null;
                                }
                                File file26 = o8Var9.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    o8Var9.X0 = null;
                                }
                                o8Var9.j |= z122222;
                                o8Var9.T0 = arrayList72222;
                                o8Var9.P0 = file162222;
                                o8Var9.Y0 = file152222;
                                o8Var9.R0 = file7;
                                o8Var9.X0 = file4;
                                o8Var9.Q0 = file6;
                                o8Var9.U0 = arrayList6;
                                gVar2.run();
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
                final ka kaVar = (ka) this.r;
                pc pcVar2 = this.b;
                int i20 = pcVar2.c;
                ArrayList arrayList8 = new ArrayList();
                q6 q6Var6 = this.c;
                o8 o8Var8 = this.f;
                q6Var6.t0(arrayList8, false, false, false, false, o8Var8);
                if (!o8Var8.K) {
                    o8Var8.S0 = Utilities.clamp(q6Var6.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = q6Var6.getMasks();
                ArrayList arrayList9 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z13 = o8Var8.K;
                boolean E2 = o8Var8.E();
                arrayList8.clear();
                Bitmap t04 = q6Var6.t0(arrayList8, true, false, false, !z13, o8Var8);
                ArrayList arrayList10 = arrayList8.isEmpty() ? null : arrayList8;
                File pathToAttach = FileLoader.getInstance(i20).getPathToAttach(ImageLoader.scaleAndSaveImage(t04, Bitmap.CompressFormat.PNG, o8Var8.i0, o8Var8.j0, 87, false, 101, 101), true);
                if (t04 != null && !t04.isRecycled()) {
                    t04.recycle();
                }
                boolean z14 = o8Var8.u;
                int i21 = this.d;
                int i22 = this.e;
                final ArrayList arrayList11 = arrayList9;
                if (z14) {
                    long j10 = o8Var8.z0;
                    if (j10 != Long.MIN_VALUE) {
                        Drawable drawable2 = o8Var8.x0;
                        if (drawable2 == null) {
                            drawable2 = d7.e(null, i20, j10, pcVar2.c2);
                        }
                        if (drawable2 != null) {
                            file8 = o8.w(i20, "webp");
                            Bitmap createBitmap3 = Bitmap.createBitmap(i21, i22, Bitmap.Config.ARGB_8888);
                            q6Var3 = q6Var6;
                            o8.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
                            try {
                                try {
                                    createBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file8));
                                    break;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
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
                q6Var3 = q6Var6;
                file8 = null;
                if (o8Var8.u && o8Var8.K) {
                    int i23 = o8Var8.k0;
                    int i24 = o8Var8.l0;
                    rg.g1 s03 = q6Var3.s0();
                    if (s03 != null) {
                        rg.z0 z0Var2 = s03.r0;
                        if (z0Var2.getChildCount() == 1 && i23 > 0 && i24 > 0) {
                            if (z0Var2.getChildAt(0) instanceof org.telegram.ui.Cells.t1) {
                                imageReceiver2 = ((org.telegram.ui.Cells.t1) z0Var2.getChildAt(0)).getPhotoImage();
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
                                    o8Var3 = o8Var8;
                                    file10 = file8;
                                    rectF3.set(f15 - (imageReceiver3.getImageWidth() / 2.0f), f16 - (imageReceiver3.getImageHeight() / 2.0f), (imageReceiver3.getImageWidth() / 2.0f) + f15, (imageReceiver3.getImageHeight() / 2.0f) + f16);
                                    path3.addRoundRect(rectF3, fArr3, Path.Direction.CW);
                                    z10 = true;
                                    Paint paint3 = new Paint(1);
                                    paint3.setColor(-1);
                                    canvas3.drawPath(path3, paint3);
                                    try {
                                        File w12 = o8.w(i20, "webp");
                                        createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w12));
                                        file14 = w12;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        file14 = null;
                                    }
                                    createBitmap4.recycle();
                                    file11 = file14;
                                    if (E2) {
                                        q6Var4 = q6Var3;
                                        o8Var4 = o8Var3;
                                        file12 = null;
                                    } else {
                                        q6Var4 = q6Var3;
                                        o8Var4 = o8Var3;
                                        Bitmap t05 = q6Var4.t0(new ArrayList(), false, true, false, false, o8Var4);
                                        file12 = FileLoader.getInstance(i20).getPathToAttach(ImageLoader.scaleAndSaveImage(t05, Bitmap.CompressFormat.PNG, i21, i22, 87, false, 101, 101), z10);
                                        if (t05 != null && !t05.isRecycled()) {
                                            t05.recycle();
                                        }
                                    }
                                    if (this.h) {
                                        Bitmap blurBitmap2 = q6Var4.getBlurBitmap();
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
                                    final o8 o8Var9 = o8Var4;
                                    final ArrayList arrayList12 = arrayList2;
                                    final File file18 = file9;
                                    final File file19 = file10;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.oa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    o8 o8Var82 = o8Var9;
                                                    ka kaVar2 = (ka) kaVar;
                                                    try {
                                                        File file172 = o8Var82.P0;
                                                        if (file172 != null) {
                                                            file172.delete();
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        File file182 = o8Var82.R0;
                                                        if (file182 != null) {
                                                            file182.delete();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    try {
                                                        File file192 = o8Var82.Q0;
                                                        if (file192 != null) {
                                                            file192.delete();
                                                        }
                                                    } catch (Exception unused3) {
                                                    }
                                                    o8Var82.P0 = null;
                                                    o8Var82.R0 = null;
                                                    o8Var82.Q0 = null;
                                                    File file20 = o8Var82.Y0;
                                                    if (file20 != null) {
                                                        try {
                                                            file20.delete();
                                                        } catch (Exception e72) {
                                                            FileLog.e(e72);
                                                        }
                                                        o8Var82.Y0 = null;
                                                    }
                                                    File file21 = o8Var82.X0;
                                                    if (file21 != null) {
                                                        try {
                                                            file21.delete();
                                                        } catch (Exception e102) {
                                                            FileLog.e(e102);
                                                        }
                                                        o8Var82.X0 = null;
                                                    }
                                                    o8Var82.j |= z15;
                                                    o8Var82.T0 = arrayList12;
                                                    o8Var82.P0 = file18;
                                                    o8Var82.Y0 = file19;
                                                    o8Var82.R0 = file17;
                                                    o8Var82.X0 = file11;
                                                    o8Var82.Q0 = file13;
                                                    o8Var82.U0 = arrayList11;
                                                    kaVar2.run();
                                                    break;
                                                default:
                                                    o8 o8Var92 = o8Var9;
                                                    ah.g gVar2 = (ah.g) kaVar;
                                                    try {
                                                        File file22 = o8Var92.P0;
                                                        if (file22 != null) {
                                                            file22.delete();
                                                        }
                                                    } catch (Exception unused4) {
                                                    }
                                                    try {
                                                        File file23 = o8Var92.R0;
                                                        if (file23 != null) {
                                                            file23.delete();
                                                        }
                                                    } catch (Exception unused5) {
                                                    }
                                                    try {
                                                        File file24 = o8Var92.Q0;
                                                        if (file24 != null) {
                                                            file24.delete();
                                                        }
                                                    } catch (Exception unused6) {
                                                    }
                                                    o8Var92.P0 = null;
                                                    o8Var92.R0 = null;
                                                    o8Var92.Q0 = null;
                                                    File file25 = o8Var92.Y0;
                                                    if (file25 != null) {
                                                        try {
                                                            file25.delete();
                                                        } catch (Exception e11) {
                                                            FileLog.e(e11);
                                                        }
                                                        o8Var92.Y0 = null;
                                                    }
                                                    File file26 = o8Var92.X0;
                                                    if (file26 != null) {
                                                        try {
                                                            file26.delete();
                                                        } catch (Exception e12) {
                                                            FileLog.e(e12);
                                                        }
                                                        o8Var92.X0 = null;
                                                    }
                                                    o8Var92.j |= z15;
                                                    o8Var92.T0 = arrayList12;
                                                    o8Var92.P0 = file18;
                                                    o8Var92.Y0 = file19;
                                                    o8Var92.R0 = file17;
                                                    o8Var92.X0 = file11;
                                                    o8Var92.Q0 = file13;
                                                    o8Var92.U0 = arrayList11;
                                                    gVar2.run();
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
                                o8Var3 = o8Var8;
                                file10 = file8;
                                rectF32.set(f152 - (imageReceiver3.getImageWidth() / 2.0f), f162 - (imageReceiver3.getImageHeight() / 2.0f), (imageReceiver3.getImageWidth() / 2.0f) + f152, (imageReceiver3.getImageHeight() / 2.0f) + f162);
                                path32.addRoundRect(rectF32, fArr32, Path.Direction.CW);
                                z10 = true;
                                Paint paint32 = new Paint(1);
                                paint32.setColor(-1);
                                canvas32.drawPath(path32, paint32);
                                File w122 = o8.w(i20, "webp");
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
                                final o8 o8Var92 = o8Var4;
                                final ArrayList arrayList122 = arrayList2;
                                final File file182 = file9;
                                final File file192 = file10;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.oa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i282) {
                                            case 0:
                                                o8 o8Var82 = o8Var92;
                                                ka kaVar2 = (ka) kaVar;
                                                try {
                                                    File file1722 = o8Var82.P0;
                                                    if (file1722 != null) {
                                                        file1722.delete();
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    File file1822 = o8Var82.R0;
                                                    if (file1822 != null) {
                                                        file1822.delete();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                try {
                                                    File file1922 = o8Var82.Q0;
                                                    if (file1922 != null) {
                                                        file1922.delete();
                                                    }
                                                } catch (Exception unused3) {
                                                }
                                                o8Var82.P0 = null;
                                                o8Var82.R0 = null;
                                                o8Var82.Q0 = null;
                                                File file20 = o8Var82.Y0;
                                                if (file20 != null) {
                                                    try {
                                                        file20.delete();
                                                    } catch (Exception e72) {
                                                        FileLog.e(e72);
                                                    }
                                                    o8Var82.Y0 = null;
                                                }
                                                File file21 = o8Var82.X0;
                                                if (file21 != null) {
                                                    try {
                                                        file21.delete();
                                                    } catch (Exception e102) {
                                                        FileLog.e(e102);
                                                    }
                                                    o8Var82.X0 = null;
                                                }
                                                o8Var82.j |= z152;
                                                o8Var82.T0 = arrayList122;
                                                o8Var82.P0 = file182;
                                                o8Var82.Y0 = file192;
                                                o8Var82.R0 = file172;
                                                o8Var82.X0 = file11;
                                                o8Var82.Q0 = file13;
                                                o8Var82.U0 = arrayList11;
                                                kaVar2.run();
                                                break;
                                            default:
                                                o8 o8Var922 = o8Var92;
                                                ah.g gVar2 = (ah.g) kaVar;
                                                try {
                                                    File file22 = o8Var922.P0;
                                                    if (file22 != null) {
                                                        file22.delete();
                                                    }
                                                } catch (Exception unused4) {
                                                }
                                                try {
                                                    File file23 = o8Var922.R0;
                                                    if (file23 != null) {
                                                        file23.delete();
                                                    }
                                                } catch (Exception unused5) {
                                                }
                                                try {
                                                    File file24 = o8Var922.Q0;
                                                    if (file24 != null) {
                                                        file24.delete();
                                                    }
                                                } catch (Exception unused6) {
                                                }
                                                o8Var922.P0 = null;
                                                o8Var922.R0 = null;
                                                o8Var922.Q0 = null;
                                                File file25 = o8Var922.Y0;
                                                if (file25 != null) {
                                                    try {
                                                        file25.delete();
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                    }
                                                    o8Var922.Y0 = null;
                                                }
                                                File file26 = o8Var922.X0;
                                                if (file26 != null) {
                                                    try {
                                                        file26.delete();
                                                    } catch (Exception e12) {
                                                        FileLog.e(e12);
                                                    }
                                                    o8Var922.X0 = null;
                                                }
                                                o8Var922.j |= z152;
                                                o8Var922.T0 = arrayList122;
                                                o8Var922.P0 = file182;
                                                o8Var922.Y0 = file192;
                                                o8Var922.R0 = file172;
                                                o8Var922.X0 = file11;
                                                o8Var922.Q0 = file13;
                                                o8Var922.U0 = arrayList11;
                                                gVar2.run();
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
                o8Var3 = o8Var8;
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
                final o8 o8Var922 = o8Var4;
                final ArrayList arrayList1222 = arrayList2;
                final File file1822 = file9;
                final File file1922 = file10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.oa
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2822) {
                            case 0:
                                o8 o8Var82 = o8Var922;
                                ka kaVar2 = (ka) kaVar;
                                try {
                                    File file17222 = o8Var82.P0;
                                    if (file17222 != null) {
                                        file17222.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file18222 = o8Var82.R0;
                                    if (file18222 != null) {
                                        file18222.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file19222 = o8Var82.Q0;
                                    if (file19222 != null) {
                                        file19222.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                o8Var82.P0 = null;
                                o8Var82.R0 = null;
                                o8Var82.Q0 = null;
                                File file20 = o8Var82.Y0;
                                if (file20 != null) {
                                    try {
                                        file20.delete();
                                    } catch (Exception e72) {
                                        FileLog.e(e72);
                                    }
                                    o8Var82.Y0 = null;
                                }
                                File file21 = o8Var82.X0;
                                if (file21 != null) {
                                    try {
                                        file21.delete();
                                    } catch (Exception e102) {
                                        FileLog.e(e102);
                                    }
                                    o8Var82.X0 = null;
                                }
                                o8Var82.j |= z1522;
                                o8Var82.T0 = arrayList1222;
                                o8Var82.P0 = file1822;
                                o8Var82.Y0 = file1922;
                                o8Var82.R0 = file1722;
                                o8Var82.X0 = file11;
                                o8Var82.Q0 = file13;
                                o8Var82.U0 = arrayList11;
                                kaVar2.run();
                                break;
                            default:
                                o8 o8Var9222 = o8Var922;
                                ah.g gVar2 = (ah.g) kaVar;
                                try {
                                    File file22 = o8Var9222.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file23 = o8Var9222.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file24 = o8Var9222.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                o8Var9222.P0 = null;
                                o8Var9222.R0 = null;
                                o8Var9222.Q0 = null;
                                File file25 = o8Var9222.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    o8Var9222.Y0 = null;
                                }
                                File file26 = o8Var9222.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    o8Var9222.X0 = null;
                                }
                                o8Var9222.j |= z1522;
                                o8Var9222.T0 = arrayList1222;
                                o8Var9222.P0 = file1822;
                                o8Var9222.Y0 = file1922;
                                o8Var9222.R0 = file1722;
                                o8Var9222.X0 = file11;
                                o8Var9222.Q0 = file13;
                                o8Var9222.U0 = arrayList11;
                                gVar2.run();
                                break;
                        }
                    }
                });
                return;
        }
    }
}
