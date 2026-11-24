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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ jm7 f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i4a(a6a a6aVar, int i, TLRPC.Message message, int i2, int i3, TLRPC.Message message2, k47 k47Var, int i4) {
        this.a = (byte) 0;
        this.f = a6aVar;
        this.b = i;
        this.h = message;
        this.d = i2;
        this.e = i3;
        this.n = message2;
        this.r = k47Var;
        this.c = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        if (r8.isRecycled() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f9, code lost:
    
        r8.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f7, code lost:
    
        if (r8.isRecycled() != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0468 A[LOOP:2: B:151:0x0466->B:152:0x0468, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [org.telegram.messenger.ImageReceiver] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        File file2;
        File file3;
        boolean z;
        ArrayList arrayList;
        final File file4;
        File file5;
        final File file6;
        final File file7;
        final File file8;
        int size;
        int i;
        u37 p0;
        ?? r13;
        boolean z2;
        String str;
        File file9;
        File file10;
        File file11;
        boolean z3;
        final File file12;
        g6b g6bVar;
        final File file13;
        final File file14;
        ImageReceiver imageReceiver;
        File file15;
        byte b = this.a;
        boolean z4 = this.d;
        Object obj = this.r;
        Object obj2 = this.n;
        int i2 = this.c;
        int i3 = this.b;
        Object obj3 = this.h;
        jm7 jm7Var = this.f;
        switch (b) {
            case 0:
                a6a a6aVar = (a6a) jm7Var;
                TLRPC.Message message = (TLRPC.Message) obj3;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                k47 k47Var = (k47) obj;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(i3));
                oc7 messagesController = a6aVar.getMessagesController();
                long j = message.dialog_id;
                boolean z5 = this.e;
                messagesController.X(arrayList2, null, null, j, false, this.d ? 1 : 0, false, 0L, null, 0, z5, message2.id);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new k47(k47Var.K1, k47Var.k, true, true));
                a6aVar.getMessagesController().t5(z5 ? 1 : 0, message.dialog_id, arrayList3);
                a6aVar.getMediaDataController().x0(message.dialog_id);
                a6aVar.c0(i3);
                a6aVar.h0(i3, i2 != 0);
                return;
            case 1:
                v9b v9bVar = (v9b) jm7Var;
                z8b z8bVar = (z8b) obj3;
                final g6b g6bVar2 = (g6b) obj2;
                final ge7 ge7Var = (ge7) obj;
                int i4 = v9bVar.c;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                z8bVar.q0(arrayList5, false, false, false, false, g6bVar2);
                if (!g6bVar2.K) {
                    g6bVar2.S0 = Utilities.k(z8bVar.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = z8bVar.getMasks();
                final ArrayList arrayList6 = masks != null ? new ArrayList(masks) : null;
                boolean z6 = g6bVar2.K;
                boolean D = g6bVar2.D();
                arrayList5.clear();
                final Bitmap q0 = z8bVar.q0(arrayList5, true, false, false, !z6, g6bVar2);
                ArrayList arrayList7 = arrayList5.isEmpty() ? null : arrayList5;
                final File w = g6b.w(i4, "png");
                final byte b2 = 0;
                arrayList4.add(new Runnable() { // from class: j8b
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        File file16 = w;
                        Bitmap bitmap = q0;
                        try {
                            try {
                                switch (b3) {
                                    case 0:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                            return;
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                            return;
                                        }
                                    case 1:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                            if (bitmap.isRecycled()) {
                                                return;
                                            }
                                        } catch (Exception e2) {
                                            fc4.g(e2, true);
                                            if (bitmap.isRecycled()) {
                                                return;
                                            }
                                        }
                                        bitmap.recycle();
                                        return;
                                    case 2:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                        } catch (Exception e3) {
                                            fc4.g(e3, true);
                                        }
                                        return;
                                    case 3:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                            return;
                                        } catch (Exception e4) {
                                            fc4.g(e4, true);
                                            return;
                                        }
                                    default:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                            return;
                                        } catch (Exception e5) {
                                            fc4.g(e5, true);
                                            return;
                                        }
                                }
                            } finally {
                                gm.w2(bitmap);
                            }
                        } catch (Throwable th) {
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            throw th;
                        }
                    }
                });
                if (g6bVar2.u) {
                    long j2 = g6bVar2.z0;
                    if (j2 != Long.MIN_VALUE) {
                        Drawable drawable = g6bVar2.x0;
                        if (drawable == null) {
                            boolean z7 = v9bVar.d2;
                            file = null;
                            drawable = cl8.d(null, i4, j2, z7);
                        } else {
                            file = null;
                        }
                        if (drawable != null) {
                            final File w2 = g6b.w(i4, "webp");
                            final Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                            g6b.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            final byte b3 = 1;
                            arrayList4.add(new Runnable() { // from class: j8b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b32 = b3;
                                    File file16 = w2;
                                    Bitmap bitmap = createBitmap;
                                    try {
                                        try {
                                            switch (b32) {
                                                case 0:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                        return;
                                                    } catch (Exception e) {
                                                        fc4.g(e, true);
                                                        return;
                                                    }
                                                case 1:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                        if (bitmap.isRecycled()) {
                                                            return;
                                                        }
                                                    } catch (Exception e2) {
                                                        fc4.g(e2, true);
                                                        if (bitmap.isRecycled()) {
                                                            return;
                                                        }
                                                    }
                                                    bitmap.recycle();
                                                    return;
                                                case 2:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                    } catch (Exception e3) {
                                                        fc4.g(e3, true);
                                                    }
                                                    return;
                                                case 3:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                        return;
                                                    } catch (Exception e4) {
                                                        fc4.g(e4, true);
                                                        return;
                                                    }
                                                default:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                        return;
                                                    } catch (Exception e5) {
                                                        fc4.g(e5, true);
                                                        return;
                                                    }
                                            }
                                        } finally {
                                            gm.w2(bitmap);
                                        }
                                    } catch (Throwable th) {
                                        if (!bitmap.isRecycled()) {
                                            bitmap.recycle();
                                        }
                                        throw th;
                                    }
                                }
                            });
                            file2 = w2;
                            if (g6bVar2.u && g6bVar2.K) {
                                int i5 = g6bVar2.k0;
                                int i6 = g6bVar2.l0;
                                p0 = z8bVar.p0();
                                if (p0 != null) {
                                    o37 o37Var = p0.t0;
                                    if (o37Var.getChildCount() == 1 && i5 > 0 && i6 > 0 && (o37Var.getChildAt(0) instanceof rc2)) {
                                        r13 = ((rc2) o37Var.getChildAt(0)).getPhotoImage();
                                        if (r13 != 0) {
                                            float f = r13.N0;
                                            if (((int) f) > 0) {
                                                float f2 = r13.O0;
                                                if (((int) f2) > 0) {
                                                    float f3 = i5;
                                                    float f4 = i6;
                                                    float max = Math.max(f / f3, f2 / f4);
                                                    int i7 = (int) ((f3 * max) / 2.0f);
                                                    int i8 = (int) ((f4 * max) / 2.0f);
                                                    final Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                                                    float[] fArr = new float[8];
                                                    file3 = file2;
                                                    int i9 = 0;
                                                    while (true) {
                                                        int[] iArr = r13.X0;
                                                        z = D;
                                                        if (i9 >= iArr.length) {
                                                            Canvas canvas = new Canvas(createBitmap2);
                                                            Path path = new Path();
                                                            canvas.scale(0.5f, 0.5f);
                                                            RectF rectF = gm.P;
                                                            float f5 = (i7 * 2.0f) / 2.0f;
                                                            arrayList = arrayList7;
                                                            float f6 = r13.N0 / 2.0f;
                                                            float f7 = (i8 * 2.0f) / 2.0f;
                                                            float f8 = r13.O0 / 2.0f;
                                                            rectF.set(f5 - f6, f7 - f8, f6 + f5, f8 + f7);
                                                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                                            Paint paint = new Paint(1);
                                                            paint.setColor(-1);
                                                            canvas.drawPath(path, paint);
                                                            final File w3 = g6b.w(i4, "webp");
                                                            final byte b4 = 2;
                                                            arrayList4.add(new Runnable() { // from class: j8b
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b32 = b4;
                                                                    File file16 = w3;
                                                                    Bitmap bitmap = createBitmap2;
                                                                    try {
                                                                        try {
                                                                            switch (b32) {
                                                                                case 0:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                        return;
                                                                                    } catch (Exception e) {
                                                                                        fc4.g(e, true);
                                                                                        return;
                                                                                    }
                                                                                case 1:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                                                        if (bitmap.isRecycled()) {
                                                                                            return;
                                                                                        }
                                                                                    } catch (Exception e2) {
                                                                                        fc4.g(e2, true);
                                                                                        if (bitmap.isRecycled()) {
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    bitmap.recycle();
                                                                                    return;
                                                                                case 2:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                                                    } catch (Exception e3) {
                                                                                        fc4.g(e3, true);
                                                                                    }
                                                                                    return;
                                                                                case 3:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                        return;
                                                                                    } catch (Exception e4) {
                                                                                        fc4.g(e4, true);
                                                                                        return;
                                                                                    }
                                                                                default:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                        return;
                                                                                    } catch (Exception e5) {
                                                                                        fc4.g(e5, true);
                                                                                        return;
                                                                                    }
                                                                            }
                                                                        } finally {
                                                                            gm.w2(bitmap);
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        if (!bitmap.isRecycled()) {
                                                                            bitmap.recycle();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                            });
                                                            file4 = w3;
                                                            if (z8bVar.r0()) {
                                                                file5 = g6bVar2.R0;
                                                                file6 = g6bVar2.Q0;
                                                            } else {
                                                                if (z) {
                                                                    file5 = null;
                                                                } else {
                                                                    final Bitmap q02 = z8bVar.q0(new ArrayList(), false, true, false, false, g6bVar2);
                                                                    final File w4 = g6b.w(i4, "png");
                                                                    final byte b5 = 3;
                                                                    arrayList4.add(new Runnable() { // from class: j8b
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            byte b32 = b5;
                                                                            File file16 = w4;
                                                                            Bitmap bitmap = q02;
                                                                            try {
                                                                                try {
                                                                                    switch (b32) {
                                                                                        case 0:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                                return;
                                                                                            } catch (Exception e) {
                                                                                                fc4.g(e, true);
                                                                                                return;
                                                                                            }
                                                                                        case 1:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                                                                if (bitmap.isRecycled()) {
                                                                                                    return;
                                                                                                }
                                                                                            } catch (Exception e2) {
                                                                                                fc4.g(e2, true);
                                                                                                if (bitmap.isRecycled()) {
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            bitmap.recycle();
                                                                                            return;
                                                                                        case 2:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                                                            } catch (Exception e3) {
                                                                                                fc4.g(e3, true);
                                                                                            }
                                                                                            return;
                                                                                        case 3:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                                return;
                                                                                            } catch (Exception e4) {
                                                                                                fc4.g(e4, true);
                                                                                                return;
                                                                                            }
                                                                                        default:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                                return;
                                                                                            } catch (Exception e5) {
                                                                                                fc4.g(e5, true);
                                                                                                return;
                                                                                            }
                                                                                    }
                                                                                } finally {
                                                                                    gm.w2(bitmap);
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                if (!bitmap.isRecycled()) {
                                                                                    bitmap.recycle();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    });
                                                                    file5 = w4;
                                                                }
                                                                if (!z4) {
                                                                    file8 = file5;
                                                                    file7 = null;
                                                                    final byte b6 = 1;
                                                                    final boolean z8 = this.e;
                                                                    final File file16 = file3;
                                                                    final ArrayList arrayList8 = arrayList;
                                                                    gm.c3(new Runnable() { // from class: i8b
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            byte b7 = b6;
                                                                            Runnable runnable = ge7Var;
                                                                            ArrayList arrayList9 = arrayList6;
                                                                            File file17 = file7;
                                                                            File file18 = file4;
                                                                            File file19 = file8;
                                                                            File file20 = file16;
                                                                            File file21 = w;
                                                                            ArrayList arrayList10 = arrayList8;
                                                                            boolean z9 = z8;
                                                                            g6b g6bVar3 = g6bVar2;
                                                                            switch (b7) {
                                                                                case 0:
                                                                                    f8b f8bVar = (f8b) runnable;
                                                                                    try {
                                                                                        File file22 = g6bVar3.P0;
                                                                                        if (file22 != null) {
                                                                                            file22.delete();
                                                                                        }
                                                                                    } catch (Exception unused) {
                                                                                    }
                                                                                    try {
                                                                                        File file23 = g6bVar3.R0;
                                                                                        if (file23 != null) {
                                                                                            file23.delete();
                                                                                        }
                                                                                    } catch (Exception unused2) {
                                                                                    }
                                                                                    try {
                                                                                        File file24 = g6bVar3.Q0;
                                                                                        if (file24 != null) {
                                                                                            file24.delete();
                                                                                        }
                                                                                    } catch (Exception unused3) {
                                                                                    }
                                                                                    g6bVar3.P0 = null;
                                                                                    g6bVar3.R0 = null;
                                                                                    g6bVar3.Q0 = null;
                                                                                    File file25 = g6bVar3.Y0;
                                                                                    if (file25 != null) {
                                                                                        try {
                                                                                            file25.delete();
                                                                                        } catch (Exception e) {
                                                                                            fc4.g(e, true);
                                                                                        }
                                                                                        g6bVar3.Y0 = null;
                                                                                    }
                                                                                    File file26 = g6bVar3.X0;
                                                                                    if (file26 != null) {
                                                                                        try {
                                                                                            file26.delete();
                                                                                        } catch (Exception e2) {
                                                                                            fc4.g(e2, true);
                                                                                        }
                                                                                        g6bVar3.X0 = null;
                                                                                    }
                                                                                    g6bVar3.j |= z9;
                                                                                    g6bVar3.T0 = arrayList10;
                                                                                    g6bVar3.P0 = file21;
                                                                                    g6bVar3.Y0 = file20;
                                                                                    g6bVar3.R0 = file19;
                                                                                    g6bVar3.X0 = file18;
                                                                                    g6bVar3.Q0 = file17;
                                                                                    g6bVar3.U0 = arrayList9;
                                                                                    f8bVar.run();
                                                                                    break;
                                                                                default:
                                                                                    ge7 ge7Var2 = (ge7) runnable;
                                                                                    try {
                                                                                        File file27 = g6bVar3.P0;
                                                                                        if (file27 != null) {
                                                                                            file27.delete();
                                                                                        }
                                                                                    } catch (Exception unused4) {
                                                                                    }
                                                                                    try {
                                                                                        File file28 = g6bVar3.R0;
                                                                                        if (file28 != null) {
                                                                                            file28.delete();
                                                                                        }
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    try {
                                                                                        File file29 = g6bVar3.Q0;
                                                                                        if (file29 != null) {
                                                                                            file29.delete();
                                                                                        }
                                                                                    } catch (Exception unused6) {
                                                                                    }
                                                                                    g6bVar3.P0 = null;
                                                                                    g6bVar3.R0 = null;
                                                                                    g6bVar3.Q0 = null;
                                                                                    File file30 = g6bVar3.Y0;
                                                                                    if (file30 != null) {
                                                                                        try {
                                                                                            file30.delete();
                                                                                        } catch (Exception e3) {
                                                                                            fc4.g(e3, true);
                                                                                        }
                                                                                        g6bVar3.Y0 = null;
                                                                                    }
                                                                                    File file31 = g6bVar3.X0;
                                                                                    if (file31 != null) {
                                                                                        try {
                                                                                            file31.delete();
                                                                                        } catch (Exception e4) {
                                                                                            fc4.g(e4, true);
                                                                                        }
                                                                                        g6bVar3.X0 = null;
                                                                                    }
                                                                                    g6bVar3.j |= z9;
                                                                                    g6bVar3.T0 = arrayList10;
                                                                                    g6bVar3.P0 = file21;
                                                                                    g6bVar3.Y0 = file20;
                                                                                    g6bVar3.R0 = file19;
                                                                                    g6bVar3.X0 = file18;
                                                                                    g6bVar3.Q0 = file17;
                                                                                    g6bVar3.U0 = arrayList9;
                                                                                    ge7Var2.run();
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    size = arrayList4.size();
                                                                    i = 0;
                                                                    while (i < size) {
                                                                        Object obj4 = arrayList4.get(i);
                                                                        i++;
                                                                        ((Runnable) obj4).run();
                                                                    }
                                                                    return;
                                                                }
                                                                final Bitmap blurBitmap = z8bVar.getBlurBitmap();
                                                                file6 = g6b.w(i4, "png");
                                                                final byte b7 = 4;
                                                                arrayList4.add(new Runnable() { // from class: j8b
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        byte b32 = b7;
                                                                        File file162 = file6;
                                                                        Bitmap bitmap = blurBitmap;
                                                                        try {
                                                                            try {
                                                                                switch (b32) {
                                                                                    case 0:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file162));
                                                                                            return;
                                                                                        } catch (Exception e) {
                                                                                            fc4.g(e, true);
                                                                                            return;
                                                                                        }
                                                                                    case 1:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file162));
                                                                                            if (bitmap.isRecycled()) {
                                                                                                return;
                                                                                            }
                                                                                        } catch (Exception e2) {
                                                                                            fc4.g(e2, true);
                                                                                            if (bitmap.isRecycled()) {
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        bitmap.recycle();
                                                                                        return;
                                                                                    case 2:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file162));
                                                                                        } catch (Exception e3) {
                                                                                            fc4.g(e3, true);
                                                                                        }
                                                                                        return;
                                                                                    case 3:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file162));
                                                                                            return;
                                                                                        } catch (Exception e4) {
                                                                                            fc4.g(e4, true);
                                                                                            return;
                                                                                        }
                                                                                    default:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file162));
                                                                                            return;
                                                                                        } catch (Exception e5) {
                                                                                            fc4.g(e5, true);
                                                                                            return;
                                                                                        }
                                                                                }
                                                                            } finally {
                                                                                gm.w2(bitmap);
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            if (!bitmap.isRecycled()) {
                                                                                bitmap.recycle();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                });
                                                            }
                                                            file8 = file5;
                                                            file7 = file6;
                                                            final byte b62 = 1;
                                                            final boolean z82 = this.e;
                                                            final File file162 = file3;
                                                            final ArrayList arrayList82 = arrayList;
                                                            gm.c3(new Runnable() { // from class: i8b
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b72 = b62;
                                                                    Runnable runnable = ge7Var;
                                                                    ArrayList arrayList9 = arrayList6;
                                                                    File file17 = file7;
                                                                    File file18 = file4;
                                                                    File file19 = file8;
                                                                    File file20 = file162;
                                                                    File file21 = w;
                                                                    ArrayList arrayList10 = arrayList82;
                                                                    boolean z9 = z82;
                                                                    g6b g6bVar3 = g6bVar2;
                                                                    switch (b72) {
                                                                        case 0:
                                                                            f8b f8bVar = (f8b) runnable;
                                                                            try {
                                                                                File file22 = g6bVar3.P0;
                                                                                if (file22 != null) {
                                                                                    file22.delete();
                                                                                }
                                                                            } catch (Exception unused) {
                                                                            }
                                                                            try {
                                                                                File file23 = g6bVar3.R0;
                                                                                if (file23 != null) {
                                                                                    file23.delete();
                                                                                }
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                            try {
                                                                                File file24 = g6bVar3.Q0;
                                                                                if (file24 != null) {
                                                                                    file24.delete();
                                                                                }
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            g6bVar3.P0 = null;
                                                                            g6bVar3.R0 = null;
                                                                            g6bVar3.Q0 = null;
                                                                            File file25 = g6bVar3.Y0;
                                                                            if (file25 != null) {
                                                                                try {
                                                                                    file25.delete();
                                                                                } catch (Exception e) {
                                                                                    fc4.g(e, true);
                                                                                }
                                                                                g6bVar3.Y0 = null;
                                                                            }
                                                                            File file26 = g6bVar3.X0;
                                                                            if (file26 != null) {
                                                                                try {
                                                                                    file26.delete();
                                                                                } catch (Exception e2) {
                                                                                    fc4.g(e2, true);
                                                                                }
                                                                                g6bVar3.X0 = null;
                                                                            }
                                                                            g6bVar3.j |= z9;
                                                                            g6bVar3.T0 = arrayList10;
                                                                            g6bVar3.P0 = file21;
                                                                            g6bVar3.Y0 = file20;
                                                                            g6bVar3.R0 = file19;
                                                                            g6bVar3.X0 = file18;
                                                                            g6bVar3.Q0 = file17;
                                                                            g6bVar3.U0 = arrayList9;
                                                                            f8bVar.run();
                                                                            break;
                                                                        default:
                                                                            ge7 ge7Var2 = (ge7) runnable;
                                                                            try {
                                                                                File file27 = g6bVar3.P0;
                                                                                if (file27 != null) {
                                                                                    file27.delete();
                                                                                }
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                            try {
                                                                                File file28 = g6bVar3.R0;
                                                                                if (file28 != null) {
                                                                                    file28.delete();
                                                                                }
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                            try {
                                                                                File file29 = g6bVar3.Q0;
                                                                                if (file29 != null) {
                                                                                    file29.delete();
                                                                                }
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                            g6bVar3.P0 = null;
                                                                            g6bVar3.R0 = null;
                                                                            g6bVar3.Q0 = null;
                                                                            File file30 = g6bVar3.Y0;
                                                                            if (file30 != null) {
                                                                                try {
                                                                                    file30.delete();
                                                                                } catch (Exception e3) {
                                                                                    fc4.g(e3, true);
                                                                                }
                                                                                g6bVar3.Y0 = null;
                                                                            }
                                                                            File file31 = g6bVar3.X0;
                                                                            if (file31 != null) {
                                                                                try {
                                                                                    file31.delete();
                                                                                } catch (Exception e4) {
                                                                                    fc4.g(e4, true);
                                                                                }
                                                                                g6bVar3.X0 = null;
                                                                            }
                                                                            g6bVar3.j |= z9;
                                                                            g6bVar3.T0 = arrayList10;
                                                                            g6bVar3.P0 = file21;
                                                                            g6bVar3.Y0 = file20;
                                                                            g6bVar3.R0 = file19;
                                                                            g6bVar3.X0 = file18;
                                                                            g6bVar3.Q0 = file17;
                                                                            g6bVar3.U0 = arrayList9;
                                                                            ge7Var2.run();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            size = arrayList4.size();
                                                            i = 0;
                                                            while (i < size) {
                                                            }
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
                                r13 = file;
                                if (r13 != 0) {
                                }
                            }
                            file3 = file2;
                            z = D;
                            arrayList = arrayList7;
                            file4 = null;
                            if (z8bVar.r0()) {
                            }
                            file8 = file5;
                            file7 = file6;
                            final byte b622 = 1;
                            final boolean z822 = this.e;
                            final File file1622 = file3;
                            final ArrayList arrayList822 = arrayList;
                            gm.c3(new Runnable() { // from class: i8b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b622;
                                    Runnable runnable = ge7Var;
                                    ArrayList arrayList9 = arrayList6;
                                    File file17 = file7;
                                    File file18 = file4;
                                    File file19 = file8;
                                    File file20 = file1622;
                                    File file21 = w;
                                    ArrayList arrayList10 = arrayList822;
                                    boolean z9 = z822;
                                    g6b g6bVar3 = g6bVar2;
                                    switch (b72) {
                                        case 0:
                                            f8b f8bVar = (f8b) runnable;
                                            try {
                                                File file22 = g6bVar3.P0;
                                                if (file22 != null) {
                                                    file22.delete();
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                File file23 = g6bVar3.R0;
                                                if (file23 != null) {
                                                    file23.delete();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                File file24 = g6bVar3.Q0;
                                                if (file24 != null) {
                                                    file24.delete();
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            g6bVar3.P0 = null;
                                            g6bVar3.R0 = null;
                                            g6bVar3.Q0 = null;
                                            File file25 = g6bVar3.Y0;
                                            if (file25 != null) {
                                                try {
                                                    file25.delete();
                                                } catch (Exception e) {
                                                    fc4.g(e, true);
                                                }
                                                g6bVar3.Y0 = null;
                                            }
                                            File file26 = g6bVar3.X0;
                                            if (file26 != null) {
                                                try {
                                                    file26.delete();
                                                } catch (Exception e2) {
                                                    fc4.g(e2, true);
                                                }
                                                g6bVar3.X0 = null;
                                            }
                                            g6bVar3.j |= z9;
                                            g6bVar3.T0 = arrayList10;
                                            g6bVar3.P0 = file21;
                                            g6bVar3.Y0 = file20;
                                            g6bVar3.R0 = file19;
                                            g6bVar3.X0 = file18;
                                            g6bVar3.Q0 = file17;
                                            g6bVar3.U0 = arrayList9;
                                            f8bVar.run();
                                            break;
                                        default:
                                            ge7 ge7Var2 = (ge7) runnable;
                                            try {
                                                File file27 = g6bVar3.P0;
                                                if (file27 != null) {
                                                    file27.delete();
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                File file28 = g6bVar3.R0;
                                                if (file28 != null) {
                                                    file28.delete();
                                                }
                                            } catch (Exception unused5) {
                                            }
                                            try {
                                                File file29 = g6bVar3.Q0;
                                                if (file29 != null) {
                                                    file29.delete();
                                                }
                                            } catch (Exception unused6) {
                                            }
                                            g6bVar3.P0 = null;
                                            g6bVar3.R0 = null;
                                            g6bVar3.Q0 = null;
                                            File file30 = g6bVar3.Y0;
                                            if (file30 != null) {
                                                try {
                                                    file30.delete();
                                                } catch (Exception e3) {
                                                    fc4.g(e3, true);
                                                }
                                                g6bVar3.Y0 = null;
                                            }
                                            File file31 = g6bVar3.X0;
                                            if (file31 != null) {
                                                try {
                                                    file31.delete();
                                                } catch (Exception e4) {
                                                    fc4.g(e4, true);
                                                }
                                                g6bVar3.X0 = null;
                                            }
                                            g6bVar3.j |= z9;
                                            g6bVar3.T0 = arrayList10;
                                            g6bVar3.P0 = file21;
                                            g6bVar3.Y0 = file20;
                                            g6bVar3.R0 = file19;
                                            g6bVar3.X0 = file18;
                                            g6bVar3.Q0 = file17;
                                            g6bVar3.U0 = arrayList9;
                                            ge7Var2.run();
                                            break;
                                    }
                                }
                            });
                            size = arrayList4.size();
                            i = 0;
                            while (i < size) {
                            }
                            return;
                        }
                        file2 = file;
                        if (g6bVar2.u) {
                            int i52 = g6bVar2.k0;
                            int i62 = g6bVar2.l0;
                            p0 = z8bVar.p0();
                            if (p0 != null) {
                            }
                            r13 = file;
                            if (r13 != 0) {
                            }
                        }
                        file3 = file2;
                        z = D;
                        arrayList = arrayList7;
                        file4 = null;
                        if (z8bVar.r0()) {
                        }
                        file8 = file5;
                        file7 = file6;
                        final byte b6222 = 1;
                        final boolean z8222 = this.e;
                        final File file16222 = file3;
                        final ArrayList arrayList8222 = arrayList;
                        gm.c3(new Runnable() { // from class: i8b
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b72 = b6222;
                                Runnable runnable = ge7Var;
                                ArrayList arrayList9 = arrayList6;
                                File file17 = file7;
                                File file18 = file4;
                                File file19 = file8;
                                File file20 = file16222;
                                File file21 = w;
                                ArrayList arrayList10 = arrayList8222;
                                boolean z9 = z8222;
                                g6b g6bVar3 = g6bVar2;
                                switch (b72) {
                                    case 0:
                                        f8b f8bVar = (f8b) runnable;
                                        try {
                                            File file22 = g6bVar3.P0;
                                            if (file22 != null) {
                                                file22.delete();
                                            }
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            File file23 = g6bVar3.R0;
                                            if (file23 != null) {
                                                file23.delete();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        try {
                                            File file24 = g6bVar3.Q0;
                                            if (file24 != null) {
                                                file24.delete();
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        g6bVar3.P0 = null;
                                        g6bVar3.R0 = null;
                                        g6bVar3.Q0 = null;
                                        File file25 = g6bVar3.Y0;
                                        if (file25 != null) {
                                            try {
                                                file25.delete();
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                            }
                                            g6bVar3.Y0 = null;
                                        }
                                        File file26 = g6bVar3.X0;
                                        if (file26 != null) {
                                            try {
                                                file26.delete();
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                            }
                                            g6bVar3.X0 = null;
                                        }
                                        g6bVar3.j |= z9;
                                        g6bVar3.T0 = arrayList10;
                                        g6bVar3.P0 = file21;
                                        g6bVar3.Y0 = file20;
                                        g6bVar3.R0 = file19;
                                        g6bVar3.X0 = file18;
                                        g6bVar3.Q0 = file17;
                                        g6bVar3.U0 = arrayList9;
                                        f8bVar.run();
                                        break;
                                    default:
                                        ge7 ge7Var2 = (ge7) runnable;
                                        try {
                                            File file27 = g6bVar3.P0;
                                            if (file27 != null) {
                                                file27.delete();
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            File file28 = g6bVar3.R0;
                                            if (file28 != null) {
                                                file28.delete();
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        try {
                                            File file29 = g6bVar3.Q0;
                                            if (file29 != null) {
                                                file29.delete();
                                            }
                                        } catch (Exception unused6) {
                                        }
                                        g6bVar3.P0 = null;
                                        g6bVar3.R0 = null;
                                        g6bVar3.Q0 = null;
                                        File file30 = g6bVar3.Y0;
                                        if (file30 != null) {
                                            try {
                                                file30.delete();
                                            } catch (Exception e3) {
                                                fc4.g(e3, true);
                                            }
                                            g6bVar3.Y0 = null;
                                        }
                                        File file31 = g6bVar3.X0;
                                        if (file31 != null) {
                                            try {
                                                file31.delete();
                                            } catch (Exception e4) {
                                                fc4.g(e4, true);
                                            }
                                            g6bVar3.X0 = null;
                                        }
                                        g6bVar3.j |= z9;
                                        g6bVar3.T0 = arrayList10;
                                        g6bVar3.P0 = file21;
                                        g6bVar3.Y0 = file20;
                                        g6bVar3.R0 = file19;
                                        g6bVar3.X0 = file18;
                                        g6bVar3.Q0 = file17;
                                        g6bVar3.U0 = arrayList9;
                                        ge7Var2.run();
                                        break;
                                }
                            }
                        });
                        size = arrayList4.size();
                        i = 0;
                        while (i < size) {
                        }
                        return;
                    }
                }
                file = null;
                file2 = file;
                if (g6bVar2.u) {
                }
                file3 = file2;
                z = D;
                arrayList = arrayList7;
                file4 = null;
                if (z8bVar.r0()) {
                }
                file8 = file5;
                file7 = file6;
                final byte b62222 = 1;
                final boolean z82222 = this.e;
                final File file162222 = file3;
                final ArrayList arrayList82222 = arrayList;
                gm.c3(new Runnable() { // from class: i8b
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b72 = b62222;
                        Runnable runnable = ge7Var;
                        ArrayList arrayList9 = arrayList6;
                        File file17 = file7;
                        File file18 = file4;
                        File file19 = file8;
                        File file20 = file162222;
                        File file21 = w;
                        ArrayList arrayList10 = arrayList82222;
                        boolean z9 = z82222;
                        g6b g6bVar3 = g6bVar2;
                        switch (b72) {
                            case 0:
                                f8b f8bVar = (f8b) runnable;
                                try {
                                    File file22 = g6bVar3.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file23 = g6bVar3.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file24 = g6bVar3.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                g6bVar3.P0 = null;
                                g6bVar3.R0 = null;
                                g6bVar3.Q0 = null;
                                File file25 = g6bVar3.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    g6bVar3.Y0 = null;
                                }
                                File file26 = g6bVar3.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e2) {
                                        fc4.g(e2, true);
                                    }
                                    g6bVar3.X0 = null;
                                }
                                g6bVar3.j |= z9;
                                g6bVar3.T0 = arrayList10;
                                g6bVar3.P0 = file21;
                                g6bVar3.Y0 = file20;
                                g6bVar3.R0 = file19;
                                g6bVar3.X0 = file18;
                                g6bVar3.Q0 = file17;
                                g6bVar3.U0 = arrayList9;
                                f8bVar.run();
                                break;
                            default:
                                ge7 ge7Var2 = (ge7) runnable;
                                try {
                                    File file27 = g6bVar3.P0;
                                    if (file27 != null) {
                                        file27.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file28 = g6bVar3.R0;
                                    if (file28 != null) {
                                        file28.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file29 = g6bVar3.Q0;
                                    if (file29 != null) {
                                        file29.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                g6bVar3.P0 = null;
                                g6bVar3.R0 = null;
                                g6bVar3.Q0 = null;
                                File file30 = g6bVar3.Y0;
                                if (file30 != null) {
                                    try {
                                        file30.delete();
                                    } catch (Exception e3) {
                                        fc4.g(e3, true);
                                    }
                                    g6bVar3.Y0 = null;
                                }
                                File file31 = g6bVar3.X0;
                                if (file31 != null) {
                                    try {
                                        file31.delete();
                                    } catch (Exception e4) {
                                        fc4.g(e4, true);
                                    }
                                    g6bVar3.X0 = null;
                                }
                                g6bVar3.j |= z9;
                                g6bVar3.T0 = arrayList10;
                                g6bVar3.P0 = file21;
                                g6bVar3.Y0 = file20;
                                g6bVar3.R0 = file19;
                                g6bVar3.X0 = file18;
                                g6bVar3.Q0 = file17;
                                g6bVar3.U0 = arrayList9;
                                ge7Var2.run();
                                break;
                        }
                    }
                });
                size = arrayList4.size();
                i = 0;
                while (i < size) {
                }
                return;
            default:
                v9b v9bVar2 = (v9b) jm7Var;
                z8b z8bVar2 = (z8b) obj3;
                g6b g6bVar3 = (g6b) obj2;
                final f8b f8bVar = (f8b) obj;
                int i11 = v9bVar2.c;
                ArrayList arrayList9 = new ArrayList();
                z8bVar2.q0(arrayList9, false, false, false, false, g6bVar3);
                if (g6bVar3.K) {
                    z2 = z4;
                } else {
                    z2 = z4;
                    g6bVar3.S0 = Utilities.k(z8bVar2.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = z8bVar2.getMasks();
                final ArrayList arrayList10 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z9 = g6bVar3.K;
                boolean D2 = g6bVar3.D();
                arrayList9.clear();
                Bitmap q03 = z8bVar2.q0(arrayList9, true, false, false, !z9, g6bVar3);
                ArrayList arrayList11 = arrayList9.isEmpty() ? null : arrayList9;
                bc4.G(i11);
                File J = bc4.J(fn5.V(q03, Bitmap.CompressFormat.PNG, g6bVar3.i0, g6bVar3.j0, 87), null, true, true);
                if (q03 != null && !q03.isRecycled()) {
                    q03.recycle();
                }
                if (g6bVar3.u) {
                    long j3 = g6bVar3.z0;
                    if (j3 != Long.MIN_VALUE) {
                        Drawable drawable2 = g6bVar3.x0;
                        if (drawable2 == null) {
                            drawable2 = cl8.d(null, i11, j3, v9bVar2.d2);
                        }
                        str = "webp";
                        if (drawable2 != null) {
                            file9 = g6b.w(i11, str);
                            Bitmap createBitmap3 = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                            g6b.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
                            try {
                                try {
                                    createBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file9));
                                    break;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    break;
                                }
                            } catch (Throwable th) {
                                if (!createBitmap3.isRecycled()) {
                                    createBitmap3.recycle();
                                }
                                throw th;
                            }
                        }
                    } else {
                        str = "webp";
                    }
                } else {
                    str = "webp";
                }
                file9 = null;
                if (g6bVar3.u && g6bVar3.K) {
                    int i12 = g6bVar3.k0;
                    int i13 = g6bVar3.l0;
                    u37 p02 = z8bVar2.p0();
                    if (p02 != null) {
                        o37 o37Var2 = p02.t0;
                        if (o37Var2.getChildCount() == 1 && i12 > 0 && i13 > 0 && (o37Var2.getChildAt(0) instanceof rc2)) {
                            imageReceiver = ((rc2) o37Var2.getChildAt(0)).getPhotoImage();
                            if (imageReceiver != null) {
                                float f10 = imageReceiver.N0;
                                if (((int) f10) > 0) {
                                    float f11 = imageReceiver.O0;
                                    if (((int) f11) > 0) {
                                        float f12 = i12;
                                        float f13 = i13;
                                        float max2 = Math.max(f10 / f12, f11 / f13);
                                        int i14 = (int) ((f12 * max2) / 2.0f);
                                        int i15 = (int) ((f13 * max2) / 2.0f);
                                        Bitmap createBitmap4 = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                                        float[] fArr2 = new float[8];
                                        file10 = J;
                                        int i16 = 0;
                                        while (true) {
                                            int[] iArr2 = imageReceiver.X0;
                                            file11 = file9;
                                            if (i16 >= iArr2.length) {
                                                Canvas canvas2 = new Canvas(createBitmap4);
                                                Path path2 = new Path();
                                                canvas2.scale(0.5f, 0.5f);
                                                RectF rectF2 = gm.P;
                                                float f14 = (i14 * 2.0f) / 2.0f;
                                                float f15 = imageReceiver.N0 / 2.0f;
                                                float f16 = (i15 * 2.0f) / 2.0f;
                                                float f17 = imageReceiver.O0 / 2.0f;
                                                z3 = D2;
                                                rectF2.set(f14 - f15, f16 - f17, f15 + f14, f17 + f16);
                                                path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                                Paint paint2 = new Paint(1);
                                                paint2.setColor(-1);
                                                canvas2.drawPath(path2, paint2);
                                                try {
                                                    file15 = g6b.w(i11, str);
                                                    createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file15));
                                                } catch (Exception e2) {
                                                    fc4.g(e2, true);
                                                    file15 = null;
                                                }
                                                createBitmap4.recycle();
                                                file12 = file15;
                                                if (z3) {
                                                    g6bVar = g6bVar3;
                                                    Bitmap q04 = z8bVar2.q0(new ArrayList(), false, true, false, false, g6bVar);
                                                    bc4.G(i11);
                                                    File J2 = bc4.J(fn5.V(q04, Bitmap.CompressFormat.PNG, i3, i2, 87), null, true, true);
                                                    if (q04 != null && !q04.isRecycled()) {
                                                        q04.recycle();
                                                    }
                                                    file13 = J2;
                                                } else {
                                                    g6bVar = g6bVar3;
                                                    file13 = null;
                                                }
                                                if (z2) {
                                                    file14 = null;
                                                } else {
                                                    Bitmap blurBitmap2 = z8bVar2.getBlurBitmap();
                                                    bc4.G(i11);
                                                    File J3 = bc4.J(fn5.V(blurBitmap2, Bitmap.CompressFormat.PNG, i3, i2, 87), null, true, true);
                                                    if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                                                        blurBitmap2.recycle();
                                                    }
                                                    file14 = J3;
                                                }
                                                final byte b8 = 0;
                                                final boolean z10 = this.e;
                                                final ArrayList arrayList12 = arrayList11;
                                                final g6b g6bVar4 = g6bVar;
                                                final File file17 = file10;
                                                final File file18 = file11;
                                                gm.c3(new Runnable() { // from class: i8b
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        byte b72 = b8;
                                                        Runnable runnable = f8bVar;
                                                        ArrayList arrayList92 = arrayList10;
                                                        File file172 = file14;
                                                        File file182 = file12;
                                                        File file19 = file13;
                                                        File file20 = file18;
                                                        File file21 = file17;
                                                        ArrayList arrayList102 = arrayList12;
                                                        boolean z92 = z10;
                                                        g6b g6bVar32 = g6bVar4;
                                                        switch (b72) {
                                                            case 0:
                                                                f8b f8bVar2 = (f8b) runnable;
                                                                try {
                                                                    File file22 = g6bVar32.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file23 = g6bVar32.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file24 = g6bVar32.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                g6bVar32.P0 = null;
                                                                g6bVar32.R0 = null;
                                                                g6bVar32.Q0 = null;
                                                                File file25 = g6bVar32.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e3) {
                                                                        fc4.g(e3, true);
                                                                    }
                                                                    g6bVar32.Y0 = null;
                                                                }
                                                                File file26 = g6bVar32.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e22) {
                                                                        fc4.g(e22, true);
                                                                    }
                                                                    g6bVar32.X0 = null;
                                                                }
                                                                g6bVar32.j |= z92;
                                                                g6bVar32.T0 = arrayList102;
                                                                g6bVar32.P0 = file21;
                                                                g6bVar32.Y0 = file20;
                                                                g6bVar32.R0 = file19;
                                                                g6bVar32.X0 = file182;
                                                                g6bVar32.Q0 = file172;
                                                                g6bVar32.U0 = arrayList92;
                                                                f8bVar2.run();
                                                                break;
                                                            default:
                                                                ge7 ge7Var2 = (ge7) runnable;
                                                                try {
                                                                    File file27 = g6bVar32.P0;
                                                                    if (file27 != null) {
                                                                        file27.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file28 = g6bVar32.R0;
                                                                    if (file28 != null) {
                                                                        file28.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file29 = g6bVar32.Q0;
                                                                    if (file29 != null) {
                                                                        file29.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                g6bVar32.P0 = null;
                                                                g6bVar32.R0 = null;
                                                                g6bVar32.Q0 = null;
                                                                File file30 = g6bVar32.Y0;
                                                                if (file30 != null) {
                                                                    try {
                                                                        file30.delete();
                                                                    } catch (Exception e32) {
                                                                        fc4.g(e32, true);
                                                                    }
                                                                    g6bVar32.Y0 = null;
                                                                }
                                                                File file31 = g6bVar32.X0;
                                                                if (file31 != null) {
                                                                    try {
                                                                        file31.delete();
                                                                    } catch (Exception e4) {
                                                                        fc4.g(e4, true);
                                                                    }
                                                                    g6bVar32.X0 = null;
                                                                }
                                                                g6bVar32.j |= z92;
                                                                g6bVar32.T0 = arrayList102;
                                                                g6bVar32.P0 = file21;
                                                                g6bVar32.Y0 = file20;
                                                                g6bVar32.R0 = file19;
                                                                g6bVar32.X0 = file182;
                                                                g6bVar32.Q0 = file172;
                                                                g6bVar32.U0 = arrayList92;
                                                                ge7Var2.run();
                                                                break;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            int i17 = i16 << 1;
                                            float f18 = iArr2[i16];
                                            fArr2[i17] = f18;
                                            fArr2[i17 + 1] = f18;
                                            i16++;
                                            file9 = file11;
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
                file10 = J;
                file11 = file9;
                z3 = D2;
                file12 = null;
                if (z3) {
                }
                if (z2) {
                }
                final byte b82 = 0;
                final boolean z102 = this.e;
                final ArrayList arrayList122 = arrayList11;
                final g6b g6bVar42 = g6bVar;
                final File file172 = file10;
                final File file182 = file11;
                gm.c3(new Runnable() { // from class: i8b
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b72 = b82;
                        Runnable runnable = f8bVar;
                        ArrayList arrayList92 = arrayList10;
                        File file1722 = file14;
                        File file1822 = file12;
                        File file19 = file13;
                        File file20 = file182;
                        File file21 = file172;
                        ArrayList arrayList102 = arrayList122;
                        boolean z92 = z102;
                        g6b g6bVar32 = g6bVar42;
                        switch (b72) {
                            case 0:
                                f8b f8bVar2 = (f8b) runnable;
                                try {
                                    File file22 = g6bVar32.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file23 = g6bVar32.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file24 = g6bVar32.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                g6bVar32.P0 = null;
                                g6bVar32.R0 = null;
                                g6bVar32.Q0 = null;
                                File file25 = g6bVar32.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e3) {
                                        fc4.g(e3, true);
                                    }
                                    g6bVar32.Y0 = null;
                                }
                                File file26 = g6bVar32.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e22) {
                                        fc4.g(e22, true);
                                    }
                                    g6bVar32.X0 = null;
                                }
                                g6bVar32.j |= z92;
                                g6bVar32.T0 = arrayList102;
                                g6bVar32.P0 = file21;
                                g6bVar32.Y0 = file20;
                                g6bVar32.R0 = file19;
                                g6bVar32.X0 = file1822;
                                g6bVar32.Q0 = file1722;
                                g6bVar32.U0 = arrayList92;
                                f8bVar2.run();
                                break;
                            default:
                                ge7 ge7Var2 = (ge7) runnable;
                                try {
                                    File file27 = g6bVar32.P0;
                                    if (file27 != null) {
                                        file27.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file28 = g6bVar32.R0;
                                    if (file28 != null) {
                                        file28.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file29 = g6bVar32.Q0;
                                    if (file29 != null) {
                                        file29.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                g6bVar32.P0 = null;
                                g6bVar32.R0 = null;
                                g6bVar32.Q0 = null;
                                File file30 = g6bVar32.Y0;
                                if (file30 != null) {
                                    try {
                                        file30.delete();
                                    } catch (Exception e32) {
                                        fc4.g(e32, true);
                                    }
                                    g6bVar32.Y0 = null;
                                }
                                File file31 = g6bVar32.X0;
                                if (file31 != null) {
                                    try {
                                        file31.delete();
                                    } catch (Exception e4) {
                                        fc4.g(e4, true);
                                    }
                                    g6bVar32.X0 = null;
                                }
                                g6bVar32.j |= z92;
                                g6bVar32.T0 = arrayList102;
                                g6bVar32.P0 = file21;
                                g6bVar32.Y0 = file20;
                                g6bVar32.R0 = file19;
                                g6bVar32.X0 = file1822;
                                g6bVar32.Q0 = file1722;
                                g6bVar32.U0 = arrayList92;
                                ge7Var2.run();
                                break;
                        }
                    }
                });
                return;
        }
    }

    public /* synthetic */ i4a(v9b v9bVar, z8b z8bVar, int i, int i2, g6b g6bVar, boolean z, boolean z2, Runnable runnable, byte b) {
        this.a = b;
        this.f = v9bVar;
        this.h = z8bVar;
        this.b = i;
        this.c = i2;
        this.n = g6bVar;
        this.d = z;
        this.e = z2;
        this.r = runnable;
    }
}
