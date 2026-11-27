// default package

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ fn7 f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b6a(r7a r7aVar, int i, TLRPC.Message message, int i2, int i3, TLRPC.Message message2, r47 r47Var, int i4) {
        this.a = (byte) 0;
        this.f = r7aVar;
        this.b = i;
        this.h = message;
        this.d = i2;
        this.e = i3;
        this.n = message2;
        this.r = r47Var;
        this.c = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0302, code lost:
    
        r9.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0300, code lost:
    
        if (r9.isRecycled() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f4, code lost:
    
        if (r9.isRecycled() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0305, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0219 A[LOOP:1: B:53:0x0217->B:54:0x0219, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        boolean z;
        File file2;
        final File file3;
        c8b c8bVar;
        final File file4;
        final File file5;
        b47 p0;
        ImageReceiver imageReceiver;
        File file6;
        File file7;
        boolean z2;
        File file8;
        File file9;
        File file10;
        boolean z3;
        final File file11;
        final File file12;
        final File file13;
        final File file14;
        final File file15;
        int size;
        int i;
        b47 p02;
        ImageReceiver imageReceiver2;
        byte b = this.a;
        boolean z4 = this.d;
        Object obj = this.r;
        Object obj2 = this.n;
        int i2 = this.c;
        int i3 = this.b;
        Object obj3 = this.h;
        fn7 fn7Var = this.f;
        final byte b2 = 0;
        switch (b) {
            case 0:
                r7a r7aVar = (r7a) fn7Var;
                TLRPC.Message message = (TLRPC.Message) obj3;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                r47 r47Var = (r47) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(i3));
                uc7 messagesController = r7aVar.getMessagesController();
                long j = message.dialog_id;
                boolean z5 = this.e;
                messagesController.Z(arrayList, null, null, j, false, this.d ? 1 : 0, false, 0L, null, 0, z5, message2.id);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new r47(r47Var.K1, r47Var.k, true, true));
                r7aVar.getMessagesController().z5(z5 ? 1 : 0, message.dialog_id, arrayList2);
                r7aVar.getMediaDataController().x0(message.dialog_id);
                r7aVar.c0(i3);
                r7aVar.h0(i3, i2 != 0);
                return;
            case 1:
                rbb rbbVar = (rbb) fn7Var;
                vab vabVar = (vab) obj3;
                c8b c8bVar2 = (c8b) obj2;
                final mab mabVar = (mab) obj;
                int i4 = rbbVar.c;
                ArrayList arrayList3 = new ArrayList();
                vabVar.q0(arrayList3, false, false, false, false, c8bVar2);
                if (!c8bVar2.K) {
                    c8bVar2.S0 = Utilities.k(vabVar.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = vabVar.getMasks();
                final ArrayList arrayList4 = masks != null ? new ArrayList(masks) : null;
                boolean z6 = c8bVar2.K;
                boolean D = c8bVar2.D();
                arrayList3.clear();
                Bitmap q0 = vabVar.q0(arrayList3, true, false, false, !z6, c8bVar2);
                ArrayList arrayList5 = arrayList3.isEmpty() ? null : arrayList3;
                xb4.G(i4);
                final File J = xb4.J(in5.V(q0, Bitmap.CompressFormat.PNG, c8bVar2.i0, c8bVar2.j0, 87), null, true, true);
                if (q0 != null && !q0.isRecycled()) {
                    q0.recycle();
                }
                if (c8bVar2.u) {
                    long j2 = c8bVar2.z0;
                    if (j2 != Long.MIN_VALUE) {
                        Drawable drawable = c8bVar2.x0;
                        if (drawable == null) {
                            drawable = mm8.d(null, i4, j2, rbbVar.d2);
                        }
                        if (drawable != null) {
                            File w = c8b.w(i4, "webp");
                            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                            c8b.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            try {
                                try {
                                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                                    break;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    break;
                                }
                            } catch (Throwable th) {
                                if (!createBitmap.isRecycled()) {
                                    createBitmap.recycle();
                                }
                                throw th;
                            }
                        } else {
                            file7 = null;
                        }
                        file = file7;
                        if (c8bVar2.u && c8bVar2.K) {
                            int i5 = c8bVar2.k0;
                            int i6 = c8bVar2.l0;
                            p0 = vabVar.p0();
                            if (p0 != null) {
                                v37 v37Var = p0.t0;
                                if (v37Var.getChildCount() == 1 && i5 > 0 && i6 > 0 && (v37Var.getChildAt(0) instanceof wb2)) {
                                    imageReceiver = ((wb2) v37Var.getChildAt(0)).getPhotoImage();
                                    if (imageReceiver != null) {
                                        float f = imageReceiver.N0;
                                        if (((int) f) > 0) {
                                            float f2 = imageReceiver.O0;
                                            if (((int) f2) > 0) {
                                                float f3 = i5;
                                                float f4 = i6;
                                                float max = Math.max(f / f3, f2 / f4);
                                                int i7 = (int) ((f3 * max) / 2.0f);
                                                int i8 = (int) ((f4 * max) / 2.0f);
                                                Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                                                float[] fArr = new float[8];
                                                int i9 = 0;
                                                while (true) {
                                                    int[] iArr = imageReceiver.X0;
                                                    z = D;
                                                    if (i9 >= iArr.length) {
                                                        Canvas canvas = new Canvas(createBitmap2);
                                                        Path path = new Path();
                                                        canvas.scale(0.5f, 0.5f);
                                                        RectF rectF = hl.P;
                                                        float f5 = (i7 * 2.0f) / 2.0f;
                                                        float f6 = imageReceiver.N0 / 2.0f;
                                                        float f7 = (i8 * 2.0f) / 2.0f;
                                                        float f8 = imageReceiver.O0 / 2.0f;
                                                        file2 = file;
                                                        rectF.set(f5 - f6, f7 - f8, f6 + f5, f8 + f7);
                                                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                                        Paint paint = new Paint(1);
                                                        paint.setColor(-1);
                                                        canvas.drawPath(path, paint);
                                                        try {
                                                            file6 = c8b.w(i4, "webp");
                                                            createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file6));
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            file6 = null;
                                                        }
                                                        createBitmap2.recycle();
                                                        file3 = file6;
                                                        if (z) {
                                                            c8bVar = c8bVar2;
                                                            file4 = null;
                                                        } else {
                                                            c8bVar = c8bVar2;
                                                            Bitmap q02 = vabVar.q0(new ArrayList(), false, true, false, false, c8bVar);
                                                            xb4.G(i4);
                                                            File J2 = xb4.J(in5.V(q02, Bitmap.CompressFormat.PNG, i3, i2, 87), null, true, true);
                                                            if (q02 != null && !q02.isRecycled()) {
                                                                q02.recycle();
                                                            }
                                                            file4 = J2;
                                                        }
                                                        if (z4) {
                                                            Bitmap blurBitmap = vabVar.getBlurBitmap();
                                                            xb4.G(i4);
                                                            File J3 = xb4.J(in5.V(blurBitmap, Bitmap.CompressFormat.PNG, i3, i2, 87), null, true, true);
                                                            if (blurBitmap != null && !blurBitmap.isRecycled()) {
                                                                blurBitmap.recycle();
                                                            }
                                                            file5 = J3;
                                                        } else {
                                                            file5 = null;
                                                        }
                                                        final byte b3 = 0;
                                                        final boolean z7 = this.e;
                                                        final ArrayList arrayList6 = arrayList5;
                                                        final c8b c8bVar3 = c8bVar;
                                                        final File file16 = file2;
                                                        hl.c3(new Runnable() { // from class: fab
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b4 = b3;
                                                                Runnable runnable = mabVar;
                                                                ArrayList arrayList7 = arrayList4;
                                                                File file17 = file5;
                                                                File file18 = file3;
                                                                File file19 = file4;
                                                                File file20 = file16;
                                                                File file21 = J;
                                                                ArrayList arrayList8 = arrayList6;
                                                                boolean z8 = z7;
                                                                c8b c8bVar4 = c8bVar3;
                                                                switch (b4) {
                                                                    case 0:
                                                                        mab mabVar2 = (mab) runnable;
                                                                        try {
                                                                            File file22 = c8bVar4.P0;
                                                                            if (file22 != null) {
                                                                                file22.delete();
                                                                            }
                                                                        } catch (Exception unused) {
                                                                        }
                                                                        try {
                                                                            File file23 = c8bVar4.R0;
                                                                            if (file23 != null) {
                                                                                file23.delete();
                                                                            }
                                                                        } catch (Exception unused2) {
                                                                        }
                                                                        try {
                                                                            File file24 = c8bVar4.Q0;
                                                                            if (file24 != null) {
                                                                                file24.delete();
                                                                            }
                                                                        } catch (Exception unused3) {
                                                                        }
                                                                        c8bVar4.P0 = null;
                                                                        c8bVar4.R0 = null;
                                                                        c8bVar4.Q0 = null;
                                                                        File file25 = c8bVar4.Y0;
                                                                        if (file25 != null) {
                                                                            try {
                                                                                file25.delete();
                                                                            } catch (Exception e3) {
                                                                                cc4.g(e3, true);
                                                                            }
                                                                            c8bVar4.Y0 = null;
                                                                        }
                                                                        File file26 = c8bVar4.X0;
                                                                        if (file26 != null) {
                                                                            try {
                                                                                file26.delete();
                                                                            } catch (Exception e4) {
                                                                                cc4.g(e4, true);
                                                                            }
                                                                            c8bVar4.X0 = null;
                                                                        }
                                                                        c8bVar4.j |= z8;
                                                                        c8bVar4.T0 = arrayList8;
                                                                        c8bVar4.P0 = file21;
                                                                        c8bVar4.Y0 = file20;
                                                                        c8bVar4.R0 = file19;
                                                                        c8bVar4.X0 = file18;
                                                                        c8bVar4.Q0 = file17;
                                                                        c8bVar4.U0 = arrayList7;
                                                                        mabVar2.run();
                                                                        break;
                                                                    default:
                                                                        me7 me7Var = (me7) runnable;
                                                                        try {
                                                                            File file27 = c8bVar4.P0;
                                                                            if (file27 != null) {
                                                                                file27.delete();
                                                                            }
                                                                        } catch (Exception unused4) {
                                                                        }
                                                                        try {
                                                                            File file28 = c8bVar4.R0;
                                                                            if (file28 != null) {
                                                                                file28.delete();
                                                                            }
                                                                        } catch (Exception unused5) {
                                                                        }
                                                                        try {
                                                                            File file29 = c8bVar4.Q0;
                                                                            if (file29 != null) {
                                                                                file29.delete();
                                                                            }
                                                                        } catch (Exception unused6) {
                                                                        }
                                                                        c8bVar4.P0 = null;
                                                                        c8bVar4.R0 = null;
                                                                        c8bVar4.Q0 = null;
                                                                        File file30 = c8bVar4.Y0;
                                                                        if (file30 != null) {
                                                                            try {
                                                                                file30.delete();
                                                                            } catch (Exception e5) {
                                                                                cc4.g(e5, true);
                                                                            }
                                                                            c8bVar4.Y0 = null;
                                                                        }
                                                                        File file31 = c8bVar4.X0;
                                                                        if (file31 != null) {
                                                                            try {
                                                                                file31.delete();
                                                                            } catch (Exception e6) {
                                                                                cc4.g(e6, true);
                                                                            }
                                                                            c8bVar4.X0 = null;
                                                                        }
                                                                        c8bVar4.j |= z8;
                                                                        c8bVar4.T0 = arrayList8;
                                                                        c8bVar4.P0 = file21;
                                                                        c8bVar4.Y0 = file20;
                                                                        c8bVar4.R0 = file19;
                                                                        c8bVar4.X0 = file18;
                                                                        c8bVar4.Q0 = file17;
                                                                        c8bVar4.U0 = arrayList7;
                                                                        me7Var.run();
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    int i10 = i9 << 1;
                                                    float f9 = iArr[i9];
                                                    fArr[i10] = f9;
                                                    fArr[i10 + 1] = f9;
                                                    i9++;
                                                    D = z;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            imageReceiver = null;
                            if (imageReceiver != null) {
                            }
                        }
                        z = D;
                        file2 = file;
                        file3 = null;
                        if (z) {
                        }
                        if (z4) {
                        }
                        final byte b32 = 0;
                        final boolean z72 = this.e;
                        final ArrayList arrayList62 = arrayList5;
                        final c8b c8bVar32 = c8bVar;
                        final File file162 = file2;
                        hl.c3(new Runnable() { // from class: fab
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = b32;
                                Runnable runnable = mabVar;
                                ArrayList arrayList7 = arrayList4;
                                File file17 = file5;
                                File file18 = file3;
                                File file19 = file4;
                                File file20 = file162;
                                File file21 = J;
                                ArrayList arrayList8 = arrayList62;
                                boolean z8 = z72;
                                c8b c8bVar4 = c8bVar32;
                                switch (b4) {
                                    case 0:
                                        mab mabVar2 = (mab) runnable;
                                        try {
                                            File file22 = c8bVar4.P0;
                                            if (file22 != null) {
                                                file22.delete();
                                            }
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            File file23 = c8bVar4.R0;
                                            if (file23 != null) {
                                                file23.delete();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        try {
                                            File file24 = c8bVar4.Q0;
                                            if (file24 != null) {
                                                file24.delete();
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        c8bVar4.P0 = null;
                                        c8bVar4.R0 = null;
                                        c8bVar4.Q0 = null;
                                        File file25 = c8bVar4.Y0;
                                        if (file25 != null) {
                                            try {
                                                file25.delete();
                                            } catch (Exception e3) {
                                                cc4.g(e3, true);
                                            }
                                            c8bVar4.Y0 = null;
                                        }
                                        File file26 = c8bVar4.X0;
                                        if (file26 != null) {
                                            try {
                                                file26.delete();
                                            } catch (Exception e4) {
                                                cc4.g(e4, true);
                                            }
                                            c8bVar4.X0 = null;
                                        }
                                        c8bVar4.j |= z8;
                                        c8bVar4.T0 = arrayList8;
                                        c8bVar4.P0 = file21;
                                        c8bVar4.Y0 = file20;
                                        c8bVar4.R0 = file19;
                                        c8bVar4.X0 = file18;
                                        c8bVar4.Q0 = file17;
                                        c8bVar4.U0 = arrayList7;
                                        mabVar2.run();
                                        break;
                                    default:
                                        me7 me7Var = (me7) runnable;
                                        try {
                                            File file27 = c8bVar4.P0;
                                            if (file27 != null) {
                                                file27.delete();
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            File file28 = c8bVar4.R0;
                                            if (file28 != null) {
                                                file28.delete();
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        try {
                                            File file29 = c8bVar4.Q0;
                                            if (file29 != null) {
                                                file29.delete();
                                            }
                                        } catch (Exception unused6) {
                                        }
                                        c8bVar4.P0 = null;
                                        c8bVar4.R0 = null;
                                        c8bVar4.Q0 = null;
                                        File file30 = c8bVar4.Y0;
                                        if (file30 != null) {
                                            try {
                                                file30.delete();
                                            } catch (Exception e5) {
                                                cc4.g(e5, true);
                                            }
                                            c8bVar4.Y0 = null;
                                        }
                                        File file31 = c8bVar4.X0;
                                        if (file31 != null) {
                                            try {
                                                file31.delete();
                                            } catch (Exception e6) {
                                                cc4.g(e6, true);
                                            }
                                            c8bVar4.X0 = null;
                                        }
                                        c8bVar4.j |= z8;
                                        c8bVar4.T0 = arrayList8;
                                        c8bVar4.P0 = file21;
                                        c8bVar4.Y0 = file20;
                                        c8bVar4.R0 = file19;
                                        c8bVar4.X0 = file18;
                                        c8bVar4.Q0 = file17;
                                        c8bVar4.U0 = arrayList7;
                                        me7Var.run();
                                        break;
                                }
                            }
                        });
                        return;
                    }
                }
                file = null;
                if (c8bVar2.u) {
                    int i52 = c8bVar2.k0;
                    int i62 = c8bVar2.l0;
                    p0 = vabVar.p0();
                    if (p0 != null) {
                    }
                    imageReceiver = null;
                    if (imageReceiver != null) {
                    }
                }
                z = D;
                file2 = file;
                file3 = null;
                if (z) {
                }
                if (z4) {
                }
                final byte b322 = 0;
                final boolean z722 = this.e;
                final ArrayList arrayList622 = arrayList5;
                final c8b c8bVar322 = c8bVar;
                final File file1622 = file2;
                hl.c3(new Runnable() { // from class: fab
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b322;
                        Runnable runnable = mabVar;
                        ArrayList arrayList7 = arrayList4;
                        File file17 = file5;
                        File file18 = file3;
                        File file19 = file4;
                        File file20 = file1622;
                        File file21 = J;
                        ArrayList arrayList8 = arrayList622;
                        boolean z8 = z722;
                        c8b c8bVar4 = c8bVar322;
                        switch (b4) {
                            case 0:
                                mab mabVar2 = (mab) runnable;
                                try {
                                    File file22 = c8bVar4.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file23 = c8bVar4.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file24 = c8bVar4.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                c8bVar4.P0 = null;
                                c8bVar4.R0 = null;
                                c8bVar4.Q0 = null;
                                File file25 = c8bVar4.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e3) {
                                        cc4.g(e3, true);
                                    }
                                    c8bVar4.Y0 = null;
                                }
                                File file26 = c8bVar4.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e4) {
                                        cc4.g(e4, true);
                                    }
                                    c8bVar4.X0 = null;
                                }
                                c8bVar4.j |= z8;
                                c8bVar4.T0 = arrayList8;
                                c8bVar4.P0 = file21;
                                c8bVar4.Y0 = file20;
                                c8bVar4.R0 = file19;
                                c8bVar4.X0 = file18;
                                c8bVar4.Q0 = file17;
                                c8bVar4.U0 = arrayList7;
                                mabVar2.run();
                                break;
                            default:
                                me7 me7Var = (me7) runnable;
                                try {
                                    File file27 = c8bVar4.P0;
                                    if (file27 != null) {
                                        file27.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file28 = c8bVar4.R0;
                                    if (file28 != null) {
                                        file28.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file29 = c8bVar4.Q0;
                                    if (file29 != null) {
                                        file29.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                c8bVar4.P0 = null;
                                c8bVar4.R0 = null;
                                c8bVar4.Q0 = null;
                                File file30 = c8bVar4.Y0;
                                if (file30 != null) {
                                    try {
                                        file30.delete();
                                    } catch (Exception e5) {
                                        cc4.g(e5, true);
                                    }
                                    c8bVar4.Y0 = null;
                                }
                                File file31 = c8bVar4.X0;
                                if (file31 != null) {
                                    try {
                                        file31.delete();
                                    } catch (Exception e6) {
                                        cc4.g(e6, true);
                                    }
                                    c8bVar4.X0 = null;
                                }
                                c8bVar4.j |= z8;
                                c8bVar4.T0 = arrayList8;
                                c8bVar4.P0 = file21;
                                c8bVar4.Y0 = file20;
                                c8bVar4.R0 = file19;
                                c8bVar4.X0 = file18;
                                c8bVar4.Q0 = file17;
                                c8bVar4.U0 = arrayList7;
                                me7Var.run();
                                break;
                        }
                    }
                });
                return;
            default:
                rbb rbbVar2 = (rbb) fn7Var;
                vab vabVar2 = (vab) obj3;
                final c8b c8bVar4 = (c8b) obj2;
                final me7 me7Var = (me7) obj;
                int i11 = rbbVar2.c;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                vabVar2.q0(arrayList8, false, false, false, false, c8bVar4);
                if (c8bVar4.K) {
                    z2 = z4;
                } else {
                    z2 = z4;
                    c8bVar4.S0 = Utilities.k(vabVar2.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = vabVar2.getMasks();
                final ArrayList arrayList9 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z8 = c8bVar4.K;
                boolean D2 = c8bVar4.D();
                arrayList8.clear();
                final Bitmap q03 = vabVar2.q0(arrayList8, true, false, false, !z8, c8bVar4);
                ArrayList arrayList10 = arrayList8.isEmpty() ? null : arrayList8;
                final File w2 = c8b.w(i11, "png");
                arrayList7.add(new Runnable() { // from class: gab
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        File file17 = w2;
                        Bitmap bitmap = q03;
                        try {
                            try {
                                switch (b4) {
                                    case 0:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                            return;
                                        } catch (Exception e3) {
                                            cc4.g(e3, true);
                                            return;
                                        }
                                    case 1:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file17));
                                            if (bitmap.isRecycled()) {
                                                return;
                                            }
                                        } catch (Exception e4) {
                                            cc4.g(e4, true);
                                            if (bitmap.isRecycled()) {
                                                return;
                                            }
                                        }
                                        bitmap.recycle();
                                        return;
                                    case 2:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file17));
                                        } catch (Exception e5) {
                                            cc4.g(e5, true);
                                        }
                                        return;
                                    case 3:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                            return;
                                        } catch (Exception e6) {
                                            cc4.g(e6, true);
                                            return;
                                        }
                                    default:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                            return;
                                        } catch (Exception e7) {
                                            cc4.g(e7, true);
                                            return;
                                        }
                                }
                            } finally {
                                hl.w2(bitmap);
                            }
                        } catch (Throwable th2) {
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            throw th2;
                        }
                    }
                });
                if (c8bVar4.u) {
                    long j3 = c8bVar4.z0;
                    if (j3 != Long.MIN_VALUE) {
                        Drawable drawable2 = c8bVar4.x0;
                        if (drawable2 == null) {
                            drawable2 = mm8.d(null, i11, j3, rbbVar2.d2);
                        }
                        if (drawable2 != null) {
                            final File w3 = c8b.w(i11, "webp");
                            final Bitmap createBitmap3 = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                            c8b.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
                            final byte b4 = 1;
                            arrayList7.add(new Runnable() { // from class: gab
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b42 = b4;
                                    File file17 = w3;
                                    Bitmap bitmap = createBitmap3;
                                    try {
                                        try {
                                            switch (b42) {
                                                case 0:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                        return;
                                                    } catch (Exception e3) {
                                                        cc4.g(e3, true);
                                                        return;
                                                    }
                                                case 1:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file17));
                                                        if (bitmap.isRecycled()) {
                                                            return;
                                                        }
                                                    } catch (Exception e4) {
                                                        cc4.g(e4, true);
                                                        if (bitmap.isRecycled()) {
                                                            return;
                                                        }
                                                    }
                                                    bitmap.recycle();
                                                    return;
                                                case 2:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file17));
                                                    } catch (Exception e5) {
                                                        cc4.g(e5, true);
                                                    }
                                                    return;
                                                case 3:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                        return;
                                                    } catch (Exception e6) {
                                                        cc4.g(e6, true);
                                                        return;
                                                    }
                                                default:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                        return;
                                                    } catch (Exception e7) {
                                                        cc4.g(e7, true);
                                                        return;
                                                    }
                                            }
                                        } finally {
                                            hl.w2(bitmap);
                                        }
                                    } catch (Throwable th2) {
                                        if (!bitmap.isRecycled()) {
                                            bitmap.recycle();
                                        }
                                        throw th2;
                                    }
                                }
                            });
                            file8 = w3;
                            if (c8bVar4.u && c8bVar4.K) {
                                int i12 = c8bVar4.k0;
                                int i13 = c8bVar4.l0;
                                p02 = vabVar2.p0();
                                if (p02 != null) {
                                    v37 v37Var2 = p02.t0;
                                    if (v37Var2.getChildCount() == 1 && i12 > 0 && i13 > 0 && (v37Var2.getChildAt(0) instanceof wb2)) {
                                        imageReceiver2 = ((wb2) v37Var2.getChildAt(0)).getPhotoImage();
                                        if (imageReceiver2 != null) {
                                            float f10 = imageReceiver2.N0;
                                            if (((int) f10) > 0) {
                                                float f11 = imageReceiver2.O0;
                                                if (((int) f11) > 0) {
                                                    float f12 = i12;
                                                    float f13 = i13;
                                                    float max2 = Math.max(f10 / f12, f11 / f13);
                                                    int i14 = (int) ((f12 * max2) / 2.0f);
                                                    int i15 = (int) ((f13 * max2) / 2.0f);
                                                    final Bitmap createBitmap4 = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                                                    float[] fArr2 = new float[8];
                                                    file9 = w2;
                                                    int i16 = 0;
                                                    while (true) {
                                                        int[] iArr2 = imageReceiver2.X0;
                                                        file10 = file8;
                                                        if (i16 >= iArr2.length) {
                                                            Canvas canvas2 = new Canvas(createBitmap4);
                                                            Path path2 = new Path();
                                                            canvas2.scale(0.5f, 0.5f);
                                                            RectF rectF2 = hl.P;
                                                            float f14 = (i14 * 2.0f) / 2.0f;
                                                            float f15 = imageReceiver2.N0 / 2.0f;
                                                            float f16 = (i15 * 2.0f) / 2.0f;
                                                            float f17 = imageReceiver2.O0 / 2.0f;
                                                            z3 = D2;
                                                            rectF2.set(f14 - f15, f16 - f17, f15 + f14, f17 + f16);
                                                            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                                            Paint paint2 = new Paint(1);
                                                            paint2.setColor(-1);
                                                            canvas2.drawPath(path2, paint2);
                                                            final File w4 = c8b.w(i11, "webp");
                                                            final byte b5 = 2;
                                                            arrayList7.add(new Runnable() { // from class: gab
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b42 = b5;
                                                                    File file17 = w4;
                                                                    Bitmap bitmap = createBitmap4;
                                                                    try {
                                                                        try {
                                                                            switch (b42) {
                                                                                case 0:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                                                        return;
                                                                                    } catch (Exception e3) {
                                                                                        cc4.g(e3, true);
                                                                                        return;
                                                                                    }
                                                                                case 1:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file17));
                                                                                        if (bitmap.isRecycled()) {
                                                                                            return;
                                                                                        }
                                                                                    } catch (Exception e4) {
                                                                                        cc4.g(e4, true);
                                                                                        if (bitmap.isRecycled()) {
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    bitmap.recycle();
                                                                                    return;
                                                                                case 2:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file17));
                                                                                    } catch (Exception e5) {
                                                                                        cc4.g(e5, true);
                                                                                    }
                                                                                    return;
                                                                                case 3:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                                                        return;
                                                                                    } catch (Exception e6) {
                                                                                        cc4.g(e6, true);
                                                                                        return;
                                                                                    }
                                                                                default:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                                                        return;
                                                                                    } catch (Exception e7) {
                                                                                        cc4.g(e7, true);
                                                                                        return;
                                                                                    }
                                                                            }
                                                                        } finally {
                                                                            hl.w2(bitmap);
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        if (!bitmap.isRecycled()) {
                                                                            bitmap.recycle();
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                            });
                                                            file11 = w4;
                                                            if (vabVar2.r0()) {
                                                                if (z3) {
                                                                    file12 = null;
                                                                } else {
                                                                    final Bitmap q04 = vabVar2.q0(new ArrayList(), false, true, false, false, c8bVar4);
                                                                    file12 = c8b.w(i11, "png");
                                                                    final byte b6 = 3;
                                                                    arrayList7.add(new Runnable() { // from class: gab
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            byte b42 = b6;
                                                                            File file17 = file12;
                                                                            Bitmap bitmap = q04;
                                                                            try {
                                                                                try {
                                                                                    switch (b42) {
                                                                                        case 0:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                                                                return;
                                                                                            } catch (Exception e3) {
                                                                                                cc4.g(e3, true);
                                                                                                return;
                                                                                            }
                                                                                        case 1:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file17));
                                                                                                if (bitmap.isRecycled()) {
                                                                                                    return;
                                                                                                }
                                                                                            } catch (Exception e4) {
                                                                                                cc4.g(e4, true);
                                                                                                if (bitmap.isRecycled()) {
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            bitmap.recycle();
                                                                                            return;
                                                                                        case 2:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file17));
                                                                                            } catch (Exception e5) {
                                                                                                cc4.g(e5, true);
                                                                                            }
                                                                                            return;
                                                                                        case 3:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                                                                return;
                                                                                            } catch (Exception e6) {
                                                                                                cc4.g(e6, true);
                                                                                                return;
                                                                                            }
                                                                                        default:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file17));
                                                                                                return;
                                                                                            } catch (Exception e7) {
                                                                                                cc4.g(e7, true);
                                                                                                return;
                                                                                            }
                                                                                    }
                                                                                } finally {
                                                                                    hl.w2(bitmap);
                                                                                }
                                                                            } catch (Throwable th2) {
                                                                                if (!bitmap.isRecycled()) {
                                                                                    bitmap.recycle();
                                                                                }
                                                                                throw th2;
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                                if (!z2) {
                                                                    file15 = file12;
                                                                    file14 = null;
                                                                    final File file17 = file9;
                                                                    final byte b7 = 1;
                                                                    final boolean z9 = this.e;
                                                                    final ArrayList arrayList11 = arrayList10;
                                                                    final File file18 = file10;
                                                                    hl.c3(new Runnable() { // from class: fab
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            byte b42 = b7;
                                                                            Runnable runnable = me7Var;
                                                                            ArrayList arrayList72 = arrayList9;
                                                                            File file172 = file14;
                                                                            File file182 = file11;
                                                                            File file19 = file15;
                                                                            File file20 = file18;
                                                                            File file21 = file17;
                                                                            ArrayList arrayList82 = arrayList11;
                                                                            boolean z82 = z9;
                                                                            c8b c8bVar42 = c8bVar4;
                                                                            switch (b42) {
                                                                                case 0:
                                                                                    mab mabVar2 = (mab) runnable;
                                                                                    try {
                                                                                        File file22 = c8bVar42.P0;
                                                                                        if (file22 != null) {
                                                                                            file22.delete();
                                                                                        }
                                                                                    } catch (Exception unused) {
                                                                                    }
                                                                                    try {
                                                                                        File file23 = c8bVar42.R0;
                                                                                        if (file23 != null) {
                                                                                            file23.delete();
                                                                                        }
                                                                                    } catch (Exception unused2) {
                                                                                    }
                                                                                    try {
                                                                                        File file24 = c8bVar42.Q0;
                                                                                        if (file24 != null) {
                                                                                            file24.delete();
                                                                                        }
                                                                                    } catch (Exception unused3) {
                                                                                    }
                                                                                    c8bVar42.P0 = null;
                                                                                    c8bVar42.R0 = null;
                                                                                    c8bVar42.Q0 = null;
                                                                                    File file25 = c8bVar42.Y0;
                                                                                    if (file25 != null) {
                                                                                        try {
                                                                                            file25.delete();
                                                                                        } catch (Exception e3) {
                                                                                            cc4.g(e3, true);
                                                                                        }
                                                                                        c8bVar42.Y0 = null;
                                                                                    }
                                                                                    File file26 = c8bVar42.X0;
                                                                                    if (file26 != null) {
                                                                                        try {
                                                                                            file26.delete();
                                                                                        } catch (Exception e4) {
                                                                                            cc4.g(e4, true);
                                                                                        }
                                                                                        c8bVar42.X0 = null;
                                                                                    }
                                                                                    c8bVar42.j |= z82;
                                                                                    c8bVar42.T0 = arrayList82;
                                                                                    c8bVar42.P0 = file21;
                                                                                    c8bVar42.Y0 = file20;
                                                                                    c8bVar42.R0 = file19;
                                                                                    c8bVar42.X0 = file182;
                                                                                    c8bVar42.Q0 = file172;
                                                                                    c8bVar42.U0 = arrayList72;
                                                                                    mabVar2.run();
                                                                                    break;
                                                                                default:
                                                                                    me7 me7Var2 = (me7) runnable;
                                                                                    try {
                                                                                        File file27 = c8bVar42.P0;
                                                                                        if (file27 != null) {
                                                                                            file27.delete();
                                                                                        }
                                                                                    } catch (Exception unused4) {
                                                                                    }
                                                                                    try {
                                                                                        File file28 = c8bVar42.R0;
                                                                                        if (file28 != null) {
                                                                                            file28.delete();
                                                                                        }
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    try {
                                                                                        File file29 = c8bVar42.Q0;
                                                                                        if (file29 != null) {
                                                                                            file29.delete();
                                                                                        }
                                                                                    } catch (Exception unused6) {
                                                                                    }
                                                                                    c8bVar42.P0 = null;
                                                                                    c8bVar42.R0 = null;
                                                                                    c8bVar42.Q0 = null;
                                                                                    File file30 = c8bVar42.Y0;
                                                                                    if (file30 != null) {
                                                                                        try {
                                                                                            file30.delete();
                                                                                        } catch (Exception e5) {
                                                                                            cc4.g(e5, true);
                                                                                        }
                                                                                        c8bVar42.Y0 = null;
                                                                                    }
                                                                                    File file31 = c8bVar42.X0;
                                                                                    if (file31 != null) {
                                                                                        try {
                                                                                            file31.delete();
                                                                                        } catch (Exception e6) {
                                                                                            cc4.g(e6, true);
                                                                                        }
                                                                                        c8bVar42.X0 = null;
                                                                                    }
                                                                                    c8bVar42.j |= z82;
                                                                                    c8bVar42.T0 = arrayList82;
                                                                                    c8bVar42.P0 = file21;
                                                                                    c8bVar42.Y0 = file20;
                                                                                    c8bVar42.R0 = file19;
                                                                                    c8bVar42.X0 = file182;
                                                                                    c8bVar42.Q0 = file172;
                                                                                    c8bVar42.U0 = arrayList72;
                                                                                    me7Var2.run();
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    size = arrayList7.size();
                                                                    i = 0;
                                                                    while (i < size) {
                                                                        Object obj4 = arrayList7.get(i);
                                                                        i++;
                                                                        ((Runnable) obj4).run();
                                                                    }
                                                                    return;
                                                                }
                                                                final Bitmap blurBitmap2 = vabVar2.getBlurBitmap();
                                                                file13 = c8b.w(i11, "png");
                                                                final byte b8 = 4;
                                                                arrayList7.add(new Runnable() { // from class: gab
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        byte b42 = b8;
                                                                        File file172 = file13;
                                                                        Bitmap bitmap = blurBitmap2;
                                                                        try {
                                                                            try {
                                                                                switch (b42) {
                                                                                    case 0:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file172));
                                                                                            return;
                                                                                        } catch (Exception e3) {
                                                                                            cc4.g(e3, true);
                                                                                            return;
                                                                                        }
                                                                                    case 1:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file172));
                                                                                            if (bitmap.isRecycled()) {
                                                                                                return;
                                                                                            }
                                                                                        } catch (Exception e4) {
                                                                                            cc4.g(e4, true);
                                                                                            if (bitmap.isRecycled()) {
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        bitmap.recycle();
                                                                                        return;
                                                                                    case 2:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file172));
                                                                                        } catch (Exception e5) {
                                                                                            cc4.g(e5, true);
                                                                                        }
                                                                                        return;
                                                                                    case 3:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file172));
                                                                                            return;
                                                                                        } catch (Exception e6) {
                                                                                            cc4.g(e6, true);
                                                                                            return;
                                                                                        }
                                                                                    default:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file172));
                                                                                            return;
                                                                                        } catch (Exception e7) {
                                                                                            cc4.g(e7, true);
                                                                                            return;
                                                                                        }
                                                                                }
                                                                            } finally {
                                                                                hl.w2(bitmap);
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            if (!bitmap.isRecycled()) {
                                                                                bitmap.recycle();
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                });
                                                            } else {
                                                                file12 = c8bVar4.R0;
                                                                file13 = c8bVar4.Q0;
                                                            }
                                                            file15 = file12;
                                                            file14 = file13;
                                                            final File file172 = file9;
                                                            final byte b72 = 1;
                                                            final boolean z92 = this.e;
                                                            final ArrayList arrayList112 = arrayList10;
                                                            final File file182 = file10;
                                                            hl.c3(new Runnable() { // from class: fab
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b42 = b72;
                                                                    Runnable runnable = me7Var;
                                                                    ArrayList arrayList72 = arrayList9;
                                                                    File file1722 = file14;
                                                                    File file1822 = file11;
                                                                    File file19 = file15;
                                                                    File file20 = file182;
                                                                    File file21 = file172;
                                                                    ArrayList arrayList82 = arrayList112;
                                                                    boolean z82 = z92;
                                                                    c8b c8bVar42 = c8bVar4;
                                                                    switch (b42) {
                                                                        case 0:
                                                                            mab mabVar2 = (mab) runnable;
                                                                            try {
                                                                                File file22 = c8bVar42.P0;
                                                                                if (file22 != null) {
                                                                                    file22.delete();
                                                                                }
                                                                            } catch (Exception unused) {
                                                                            }
                                                                            try {
                                                                                File file23 = c8bVar42.R0;
                                                                                if (file23 != null) {
                                                                                    file23.delete();
                                                                                }
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                            try {
                                                                                File file24 = c8bVar42.Q0;
                                                                                if (file24 != null) {
                                                                                    file24.delete();
                                                                                }
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            c8bVar42.P0 = null;
                                                                            c8bVar42.R0 = null;
                                                                            c8bVar42.Q0 = null;
                                                                            File file25 = c8bVar42.Y0;
                                                                            if (file25 != null) {
                                                                                try {
                                                                                    file25.delete();
                                                                                } catch (Exception e3) {
                                                                                    cc4.g(e3, true);
                                                                                }
                                                                                c8bVar42.Y0 = null;
                                                                            }
                                                                            File file26 = c8bVar42.X0;
                                                                            if (file26 != null) {
                                                                                try {
                                                                                    file26.delete();
                                                                                } catch (Exception e4) {
                                                                                    cc4.g(e4, true);
                                                                                }
                                                                                c8bVar42.X0 = null;
                                                                            }
                                                                            c8bVar42.j |= z82;
                                                                            c8bVar42.T0 = arrayList82;
                                                                            c8bVar42.P0 = file21;
                                                                            c8bVar42.Y0 = file20;
                                                                            c8bVar42.R0 = file19;
                                                                            c8bVar42.X0 = file1822;
                                                                            c8bVar42.Q0 = file1722;
                                                                            c8bVar42.U0 = arrayList72;
                                                                            mabVar2.run();
                                                                            break;
                                                                        default:
                                                                            me7 me7Var2 = (me7) runnable;
                                                                            try {
                                                                                File file27 = c8bVar42.P0;
                                                                                if (file27 != null) {
                                                                                    file27.delete();
                                                                                }
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                            try {
                                                                                File file28 = c8bVar42.R0;
                                                                                if (file28 != null) {
                                                                                    file28.delete();
                                                                                }
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                            try {
                                                                                File file29 = c8bVar42.Q0;
                                                                                if (file29 != null) {
                                                                                    file29.delete();
                                                                                }
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                            c8bVar42.P0 = null;
                                                                            c8bVar42.R0 = null;
                                                                            c8bVar42.Q0 = null;
                                                                            File file30 = c8bVar42.Y0;
                                                                            if (file30 != null) {
                                                                                try {
                                                                                    file30.delete();
                                                                                } catch (Exception e5) {
                                                                                    cc4.g(e5, true);
                                                                                }
                                                                                c8bVar42.Y0 = null;
                                                                            }
                                                                            File file31 = c8bVar42.X0;
                                                                            if (file31 != null) {
                                                                                try {
                                                                                    file31.delete();
                                                                                } catch (Exception e6) {
                                                                                    cc4.g(e6, true);
                                                                                }
                                                                                c8bVar42.X0 = null;
                                                                            }
                                                                            c8bVar42.j |= z82;
                                                                            c8bVar42.T0 = arrayList82;
                                                                            c8bVar42.P0 = file21;
                                                                            c8bVar42.Y0 = file20;
                                                                            c8bVar42.R0 = file19;
                                                                            c8bVar42.X0 = file1822;
                                                                            c8bVar42.Q0 = file1722;
                                                                            c8bVar42.U0 = arrayList72;
                                                                            me7Var2.run();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            size = arrayList7.size();
                                                            i = 0;
                                                            while (i < size) {
                                                            }
                                                            return;
                                                        }
                                                        int i17 = i16 << 1;
                                                        float f18 = iArr2[i16];
                                                        fArr2[i17] = f18;
                                                        fArr2[i17 + 1] = f18;
                                                        i16++;
                                                        file8 = file10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                imageReceiver2 = null;
                                if (imageReceiver2 != null) {
                                }
                            }
                            file9 = w2;
                            file10 = file8;
                            z3 = D2;
                            file11 = null;
                            if (vabVar2.r0()) {
                            }
                            file15 = file12;
                            file14 = file13;
                            final File file1722 = file9;
                            final byte b722 = 1;
                            final boolean z922 = this.e;
                            final ArrayList arrayList1122 = arrayList10;
                            final File file1822 = file10;
                            hl.c3(new Runnable() { // from class: fab
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b42 = b722;
                                    Runnable runnable = me7Var;
                                    ArrayList arrayList72 = arrayList9;
                                    File file17222 = file14;
                                    File file18222 = file11;
                                    File file19 = file15;
                                    File file20 = file1822;
                                    File file21 = file1722;
                                    ArrayList arrayList82 = arrayList1122;
                                    boolean z82 = z922;
                                    c8b c8bVar42 = c8bVar4;
                                    switch (b42) {
                                        case 0:
                                            mab mabVar2 = (mab) runnable;
                                            try {
                                                File file22 = c8bVar42.P0;
                                                if (file22 != null) {
                                                    file22.delete();
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                File file23 = c8bVar42.R0;
                                                if (file23 != null) {
                                                    file23.delete();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                File file24 = c8bVar42.Q0;
                                                if (file24 != null) {
                                                    file24.delete();
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            c8bVar42.P0 = null;
                                            c8bVar42.R0 = null;
                                            c8bVar42.Q0 = null;
                                            File file25 = c8bVar42.Y0;
                                            if (file25 != null) {
                                                try {
                                                    file25.delete();
                                                } catch (Exception e3) {
                                                    cc4.g(e3, true);
                                                }
                                                c8bVar42.Y0 = null;
                                            }
                                            File file26 = c8bVar42.X0;
                                            if (file26 != null) {
                                                try {
                                                    file26.delete();
                                                } catch (Exception e4) {
                                                    cc4.g(e4, true);
                                                }
                                                c8bVar42.X0 = null;
                                            }
                                            c8bVar42.j |= z82;
                                            c8bVar42.T0 = arrayList82;
                                            c8bVar42.P0 = file21;
                                            c8bVar42.Y0 = file20;
                                            c8bVar42.R0 = file19;
                                            c8bVar42.X0 = file18222;
                                            c8bVar42.Q0 = file17222;
                                            c8bVar42.U0 = arrayList72;
                                            mabVar2.run();
                                            break;
                                        default:
                                            me7 me7Var2 = (me7) runnable;
                                            try {
                                                File file27 = c8bVar42.P0;
                                                if (file27 != null) {
                                                    file27.delete();
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                File file28 = c8bVar42.R0;
                                                if (file28 != null) {
                                                    file28.delete();
                                                }
                                            } catch (Exception unused5) {
                                            }
                                            try {
                                                File file29 = c8bVar42.Q0;
                                                if (file29 != null) {
                                                    file29.delete();
                                                }
                                            } catch (Exception unused6) {
                                            }
                                            c8bVar42.P0 = null;
                                            c8bVar42.R0 = null;
                                            c8bVar42.Q0 = null;
                                            File file30 = c8bVar42.Y0;
                                            if (file30 != null) {
                                                try {
                                                    file30.delete();
                                                } catch (Exception e5) {
                                                    cc4.g(e5, true);
                                                }
                                                c8bVar42.Y0 = null;
                                            }
                                            File file31 = c8bVar42.X0;
                                            if (file31 != null) {
                                                try {
                                                    file31.delete();
                                                } catch (Exception e6) {
                                                    cc4.g(e6, true);
                                                }
                                                c8bVar42.X0 = null;
                                            }
                                            c8bVar42.j |= z82;
                                            c8bVar42.T0 = arrayList82;
                                            c8bVar42.P0 = file21;
                                            c8bVar42.Y0 = file20;
                                            c8bVar42.R0 = file19;
                                            c8bVar42.X0 = file18222;
                                            c8bVar42.Q0 = file17222;
                                            c8bVar42.U0 = arrayList72;
                                            me7Var2.run();
                                            break;
                                    }
                                }
                            });
                            size = arrayList7.size();
                            i = 0;
                            while (i < size) {
                            }
                            return;
                        }
                    }
                }
                file8 = null;
                if (c8bVar4.u) {
                    int i122 = c8bVar4.k0;
                    int i132 = c8bVar4.l0;
                    p02 = vabVar2.p0();
                    if (p02 != null) {
                    }
                    imageReceiver2 = null;
                    if (imageReceiver2 != null) {
                    }
                }
                file9 = w2;
                file10 = file8;
                z3 = D2;
                file11 = null;
                if (vabVar2.r0()) {
                }
                file15 = file12;
                file14 = file13;
                final File file17222 = file9;
                final byte b7222 = 1;
                final boolean z9222 = this.e;
                final ArrayList arrayList11222 = arrayList10;
                final File file18222 = file10;
                hl.c3(new Runnable() { // from class: fab
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b7222;
                        Runnable runnable = me7Var;
                        ArrayList arrayList72 = arrayList9;
                        File file172222 = file14;
                        File file182222 = file11;
                        File file19 = file15;
                        File file20 = file18222;
                        File file21 = file17222;
                        ArrayList arrayList82 = arrayList11222;
                        boolean z82 = z9222;
                        c8b c8bVar42 = c8bVar4;
                        switch (b42) {
                            case 0:
                                mab mabVar2 = (mab) runnable;
                                try {
                                    File file22 = c8bVar42.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file23 = c8bVar42.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file24 = c8bVar42.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                c8bVar42.P0 = null;
                                c8bVar42.R0 = null;
                                c8bVar42.Q0 = null;
                                File file25 = c8bVar42.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e3) {
                                        cc4.g(e3, true);
                                    }
                                    c8bVar42.Y0 = null;
                                }
                                File file26 = c8bVar42.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e4) {
                                        cc4.g(e4, true);
                                    }
                                    c8bVar42.X0 = null;
                                }
                                c8bVar42.j |= z82;
                                c8bVar42.T0 = arrayList82;
                                c8bVar42.P0 = file21;
                                c8bVar42.Y0 = file20;
                                c8bVar42.R0 = file19;
                                c8bVar42.X0 = file182222;
                                c8bVar42.Q0 = file172222;
                                c8bVar42.U0 = arrayList72;
                                mabVar2.run();
                                break;
                            default:
                                me7 me7Var2 = (me7) runnable;
                                try {
                                    File file27 = c8bVar42.P0;
                                    if (file27 != null) {
                                        file27.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file28 = c8bVar42.R0;
                                    if (file28 != null) {
                                        file28.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file29 = c8bVar42.Q0;
                                    if (file29 != null) {
                                        file29.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                c8bVar42.P0 = null;
                                c8bVar42.R0 = null;
                                c8bVar42.Q0 = null;
                                File file30 = c8bVar42.Y0;
                                if (file30 != null) {
                                    try {
                                        file30.delete();
                                    } catch (Exception e5) {
                                        cc4.g(e5, true);
                                    }
                                    c8bVar42.Y0 = null;
                                }
                                File file31 = c8bVar42.X0;
                                if (file31 != null) {
                                    try {
                                        file31.delete();
                                    } catch (Exception e6) {
                                        cc4.g(e6, true);
                                    }
                                    c8bVar42.X0 = null;
                                }
                                c8bVar42.j |= z82;
                                c8bVar42.T0 = arrayList82;
                                c8bVar42.P0 = file21;
                                c8bVar42.Y0 = file20;
                                c8bVar42.R0 = file19;
                                c8bVar42.X0 = file182222;
                                c8bVar42.Q0 = file172222;
                                c8bVar42.U0 = arrayList72;
                                me7Var2.run();
                                break;
                        }
                    }
                });
                size = arrayList7.size();
                i = 0;
                while (i < size) {
                }
                return;
        }
    }

    public /* synthetic */ b6a(rbb rbbVar, vab vabVar, int i, int i2, c8b c8bVar, boolean z, boolean z2, Runnable runnable, byte b) {
        this.a = b;
        this.f = rbbVar;
        this.h = vabVar;
        this.b = i;
        this.c = i2;
        this.n = c8bVar;
        this.d = z;
        this.e = z2;
        this.r = runnable;
    }
}
