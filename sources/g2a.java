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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gk7 f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g2a(z3a z3aVar, int i, TLRPC.Message message, int i2, int i3, TLRPC.Message message2, k27 k27Var, int i4) {
        this.a = (byte) 0;
        this.f = z3aVar;
        this.b = i;
        this.h = message;
        this.d = i2;
        this.e = i3;
        this.n = message2;
        this.r = k27Var;
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
        u17 p0;
        ?? r13;
        boolean z2;
        String str;
        File file9;
        File file10;
        File file11;
        boolean z3;
        final File file12;
        f4b f4bVar;
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
        gk7 gk7Var = this.f;
        switch (b) {
            case 0:
                z3a z3aVar = (z3a) gk7Var;
                TLRPC.Message message = (TLRPC.Message) obj3;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                k27 k27Var = (k27) obj;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(i3));
                na7 messagesController = z3aVar.getMessagesController();
                long j = message.dialog_id;
                boolean z5 = this.e;
                messagesController.X(arrayList2, null, null, j, false, this.d ? 1 : 0, false, 0L, null, 0, z5, message2.id);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new k27(k27Var.K1, k27Var.k, true, true));
                z3aVar.getMessagesController().q5(z5 ? 1 : 0, message.dialog_id, arrayList3);
                z3aVar.getMediaDataController().x0(message.dialog_id);
                z3aVar.c0(i3);
                z3aVar.h0(i3, i2 != 0);
                return;
            case 1:
                t7b t7bVar = (t7b) gk7Var;
                x6b x6bVar = (x6b) obj3;
                final f4b f4bVar2 = (f4b) obj2;
                final on7 on7Var = (on7) obj;
                int i4 = t7bVar.c;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                x6bVar.q0(arrayList5, false, false, false, false, f4bVar2);
                if (!f4bVar2.K) {
                    f4bVar2.S0 = Utilities.k(x6bVar.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = x6bVar.getMasks();
                final ArrayList arrayList6 = masks != null ? new ArrayList(masks) : null;
                boolean z6 = f4bVar2.K;
                boolean D = f4bVar2.D();
                arrayList5.clear();
                final Bitmap q0 = x6bVar.q0(arrayList5, true, false, false, !z6, f4bVar2);
                ArrayList arrayList7 = arrayList5.isEmpty() ? null : arrayList5;
                final File w = f4b.w(i4, "png");
                final byte b2 = 0;
                arrayList4.add(new Runnable() { // from class: h6b
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
                                            fa4.g(e, true);
                                            return;
                                        }
                                    case 1:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                            if (bitmap.isRecycled()) {
                                                return;
                                            }
                                        } catch (Exception e2) {
                                            fa4.g(e2, true);
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
                                            fa4.g(e3, true);
                                        }
                                        return;
                                    case 3:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                            return;
                                        } catch (Exception e4) {
                                            fa4.g(e4, true);
                                            return;
                                        }
                                    default:
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                            return;
                                        } catch (Exception e5) {
                                            fa4.g(e5, true);
                                            return;
                                        }
                                }
                            } finally {
                                gl.w2(bitmap);
                            }
                        } catch (Throwable th) {
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            throw th;
                        }
                    }
                });
                if (f4bVar2.u) {
                    long j2 = f4bVar2.z0;
                    if (j2 != Long.MIN_VALUE) {
                        Drawable drawable = f4bVar2.x0;
                        if (drawable == null) {
                            boolean z7 = t7bVar.d2;
                            file = null;
                            drawable = zi8.d(null, i4, j2, z7);
                        } else {
                            file = null;
                        }
                        if (drawable != null) {
                            final File w2 = f4b.w(i4, "webp");
                            final Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                            f4b.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                            final byte b3 = 1;
                            arrayList4.add(new Runnable() { // from class: h6b
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
                                                        fa4.g(e, true);
                                                        return;
                                                    }
                                                case 1:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                        if (bitmap.isRecycled()) {
                                                            return;
                                                        }
                                                    } catch (Exception e2) {
                                                        fa4.g(e2, true);
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
                                                        fa4.g(e3, true);
                                                    }
                                                    return;
                                                case 3:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                        return;
                                                    } catch (Exception e4) {
                                                        fa4.g(e4, true);
                                                        return;
                                                    }
                                                default:
                                                    try {
                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                        return;
                                                    } catch (Exception e5) {
                                                        fa4.g(e5, true);
                                                        return;
                                                    }
                                            }
                                        } finally {
                                            gl.w2(bitmap);
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
                            if (f4bVar2.u && f4bVar2.K) {
                                int i5 = f4bVar2.k0;
                                int i6 = f4bVar2.l0;
                                p0 = x6bVar.p0();
                                if (p0 != null) {
                                    o17 o17Var = p0.t0;
                                    if (o17Var.getChildCount() == 1 && i5 > 0 && i6 > 0 && (o17Var.getChildAt(0) instanceof gb2)) {
                                        r13 = ((gb2) o17Var.getChildAt(0)).getPhotoImage();
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
                                                            RectF rectF = gl.P;
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
                                                            final File w3 = f4b.w(i4, "webp");
                                                            final byte b4 = 2;
                                                            arrayList4.add(new Runnable() { // from class: h6b
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
                                                                                        fa4.g(e, true);
                                                                                        return;
                                                                                    }
                                                                                case 1:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                                                        if (bitmap.isRecycled()) {
                                                                                            return;
                                                                                        }
                                                                                    } catch (Exception e2) {
                                                                                        fa4.g(e2, true);
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
                                                                                        fa4.g(e3, true);
                                                                                    }
                                                                                    return;
                                                                                case 3:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                        return;
                                                                                    } catch (Exception e4) {
                                                                                        fa4.g(e4, true);
                                                                                        return;
                                                                                    }
                                                                                default:
                                                                                    try {
                                                                                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                        return;
                                                                                    } catch (Exception e5) {
                                                                                        fa4.g(e5, true);
                                                                                        return;
                                                                                    }
                                                                            }
                                                                        } finally {
                                                                            gl.w2(bitmap);
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
                                                            if (x6bVar.r0()) {
                                                                file5 = f4bVar2.R0;
                                                                file6 = f4bVar2.Q0;
                                                            } else {
                                                                if (z) {
                                                                    file5 = null;
                                                                } else {
                                                                    final Bitmap q02 = x6bVar.q0(new ArrayList(), false, true, false, false, f4bVar2);
                                                                    final File w4 = f4b.w(i4, "png");
                                                                    final byte b5 = 3;
                                                                    arrayList4.add(new Runnable() { // from class: h6b
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
                                                                                                fa4.g(e, true);
                                                                                                return;
                                                                                            }
                                                                                        case 1:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file16));
                                                                                                if (bitmap.isRecycled()) {
                                                                                                    return;
                                                                                                }
                                                                                            } catch (Exception e2) {
                                                                                                fa4.g(e2, true);
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
                                                                                                fa4.g(e3, true);
                                                                                            }
                                                                                            return;
                                                                                        case 3:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                                return;
                                                                                            } catch (Exception e4) {
                                                                                                fa4.g(e4, true);
                                                                                                return;
                                                                                            }
                                                                                        default:
                                                                                            try {
                                                                                                bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file16));
                                                                                                return;
                                                                                            } catch (Exception e5) {
                                                                                                fa4.g(e5, true);
                                                                                                return;
                                                                                            }
                                                                                    }
                                                                                } finally {
                                                                                    gl.w2(bitmap);
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
                                                                    gl.d3(new Runnable() { // from class: g6b
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            byte b7 = b6;
                                                                            Runnable runnable = on7Var;
                                                                            ArrayList arrayList9 = arrayList6;
                                                                            File file17 = file7;
                                                                            File file18 = file4;
                                                                            File file19 = file8;
                                                                            File file20 = file16;
                                                                            File file21 = w;
                                                                            ArrayList arrayList10 = arrayList8;
                                                                            boolean z9 = z8;
                                                                            f4b f4bVar3 = f4bVar2;
                                                                            switch (b7) {
                                                                                case 0:
                                                                                    d6b d6bVar = (d6b) runnable;
                                                                                    try {
                                                                                        File file22 = f4bVar3.P0;
                                                                                        if (file22 != null) {
                                                                                            file22.delete();
                                                                                        }
                                                                                    } catch (Exception unused) {
                                                                                    }
                                                                                    try {
                                                                                        File file23 = f4bVar3.R0;
                                                                                        if (file23 != null) {
                                                                                            file23.delete();
                                                                                        }
                                                                                    } catch (Exception unused2) {
                                                                                    }
                                                                                    try {
                                                                                        File file24 = f4bVar3.Q0;
                                                                                        if (file24 != null) {
                                                                                            file24.delete();
                                                                                        }
                                                                                    } catch (Exception unused3) {
                                                                                    }
                                                                                    f4bVar3.P0 = null;
                                                                                    f4bVar3.R0 = null;
                                                                                    f4bVar3.Q0 = null;
                                                                                    File file25 = f4bVar3.Y0;
                                                                                    if (file25 != null) {
                                                                                        try {
                                                                                            file25.delete();
                                                                                        } catch (Exception e) {
                                                                                            fa4.g(e, true);
                                                                                        }
                                                                                        f4bVar3.Y0 = null;
                                                                                    }
                                                                                    File file26 = f4bVar3.X0;
                                                                                    if (file26 != null) {
                                                                                        try {
                                                                                            file26.delete();
                                                                                        } catch (Exception e2) {
                                                                                            fa4.g(e2, true);
                                                                                        }
                                                                                        f4bVar3.X0 = null;
                                                                                    }
                                                                                    f4bVar3.j |= z9;
                                                                                    f4bVar3.T0 = arrayList10;
                                                                                    f4bVar3.P0 = file21;
                                                                                    f4bVar3.Y0 = file20;
                                                                                    f4bVar3.R0 = file19;
                                                                                    f4bVar3.X0 = file18;
                                                                                    f4bVar3.Q0 = file17;
                                                                                    f4bVar3.U0 = arrayList9;
                                                                                    d6bVar.run();
                                                                                    break;
                                                                                default:
                                                                                    on7 on7Var2 = (on7) runnable;
                                                                                    try {
                                                                                        File file27 = f4bVar3.P0;
                                                                                        if (file27 != null) {
                                                                                            file27.delete();
                                                                                        }
                                                                                    } catch (Exception unused4) {
                                                                                    }
                                                                                    try {
                                                                                        File file28 = f4bVar3.R0;
                                                                                        if (file28 != null) {
                                                                                            file28.delete();
                                                                                        }
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    try {
                                                                                        File file29 = f4bVar3.Q0;
                                                                                        if (file29 != null) {
                                                                                            file29.delete();
                                                                                        }
                                                                                    } catch (Exception unused6) {
                                                                                    }
                                                                                    f4bVar3.P0 = null;
                                                                                    f4bVar3.R0 = null;
                                                                                    f4bVar3.Q0 = null;
                                                                                    File file30 = f4bVar3.Y0;
                                                                                    if (file30 != null) {
                                                                                        try {
                                                                                            file30.delete();
                                                                                        } catch (Exception e3) {
                                                                                            fa4.g(e3, true);
                                                                                        }
                                                                                        f4bVar3.Y0 = null;
                                                                                    }
                                                                                    File file31 = f4bVar3.X0;
                                                                                    if (file31 != null) {
                                                                                        try {
                                                                                            file31.delete();
                                                                                        } catch (Exception e4) {
                                                                                            fa4.g(e4, true);
                                                                                        }
                                                                                        f4bVar3.X0 = null;
                                                                                    }
                                                                                    f4bVar3.j |= z9;
                                                                                    f4bVar3.T0 = arrayList10;
                                                                                    f4bVar3.P0 = file21;
                                                                                    f4bVar3.Y0 = file20;
                                                                                    f4bVar3.R0 = file19;
                                                                                    f4bVar3.X0 = file18;
                                                                                    f4bVar3.Q0 = file17;
                                                                                    f4bVar3.U0 = arrayList9;
                                                                                    on7Var2.run();
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
                                                                final Bitmap blurBitmap = x6bVar.getBlurBitmap();
                                                                file6 = f4b.w(i4, "png");
                                                                final byte b7 = 4;
                                                                arrayList4.add(new Runnable() { // from class: h6b
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
                                                                                            fa4.g(e, true);
                                                                                            return;
                                                                                        }
                                                                                    case 1:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file162));
                                                                                            if (bitmap.isRecycled()) {
                                                                                                return;
                                                                                            }
                                                                                        } catch (Exception e2) {
                                                                                            fa4.g(e2, true);
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
                                                                                            fa4.g(e3, true);
                                                                                        }
                                                                                        return;
                                                                                    case 3:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file162));
                                                                                            return;
                                                                                        } catch (Exception e4) {
                                                                                            fa4.g(e4, true);
                                                                                            return;
                                                                                        }
                                                                                    default:
                                                                                        try {
                                                                                            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file162));
                                                                                            return;
                                                                                        } catch (Exception e5) {
                                                                                            fa4.g(e5, true);
                                                                                            return;
                                                                                        }
                                                                                }
                                                                            } finally {
                                                                                gl.w2(bitmap);
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
                                                            gl.d3(new Runnable() { // from class: g6b
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b72 = b62;
                                                                    Runnable runnable = on7Var;
                                                                    ArrayList arrayList9 = arrayList6;
                                                                    File file17 = file7;
                                                                    File file18 = file4;
                                                                    File file19 = file8;
                                                                    File file20 = file162;
                                                                    File file21 = w;
                                                                    ArrayList arrayList10 = arrayList82;
                                                                    boolean z9 = z82;
                                                                    f4b f4bVar3 = f4bVar2;
                                                                    switch (b72) {
                                                                        case 0:
                                                                            d6b d6bVar = (d6b) runnable;
                                                                            try {
                                                                                File file22 = f4bVar3.P0;
                                                                                if (file22 != null) {
                                                                                    file22.delete();
                                                                                }
                                                                            } catch (Exception unused) {
                                                                            }
                                                                            try {
                                                                                File file23 = f4bVar3.R0;
                                                                                if (file23 != null) {
                                                                                    file23.delete();
                                                                                }
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                            try {
                                                                                File file24 = f4bVar3.Q0;
                                                                                if (file24 != null) {
                                                                                    file24.delete();
                                                                                }
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            f4bVar3.P0 = null;
                                                                            f4bVar3.R0 = null;
                                                                            f4bVar3.Q0 = null;
                                                                            File file25 = f4bVar3.Y0;
                                                                            if (file25 != null) {
                                                                                try {
                                                                                    file25.delete();
                                                                                } catch (Exception e) {
                                                                                    fa4.g(e, true);
                                                                                }
                                                                                f4bVar3.Y0 = null;
                                                                            }
                                                                            File file26 = f4bVar3.X0;
                                                                            if (file26 != null) {
                                                                                try {
                                                                                    file26.delete();
                                                                                } catch (Exception e2) {
                                                                                    fa4.g(e2, true);
                                                                                }
                                                                                f4bVar3.X0 = null;
                                                                            }
                                                                            f4bVar3.j |= z9;
                                                                            f4bVar3.T0 = arrayList10;
                                                                            f4bVar3.P0 = file21;
                                                                            f4bVar3.Y0 = file20;
                                                                            f4bVar3.R0 = file19;
                                                                            f4bVar3.X0 = file18;
                                                                            f4bVar3.Q0 = file17;
                                                                            f4bVar3.U0 = arrayList9;
                                                                            d6bVar.run();
                                                                            break;
                                                                        default:
                                                                            on7 on7Var2 = (on7) runnable;
                                                                            try {
                                                                                File file27 = f4bVar3.P0;
                                                                                if (file27 != null) {
                                                                                    file27.delete();
                                                                                }
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                            try {
                                                                                File file28 = f4bVar3.R0;
                                                                                if (file28 != null) {
                                                                                    file28.delete();
                                                                                }
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                            try {
                                                                                File file29 = f4bVar3.Q0;
                                                                                if (file29 != null) {
                                                                                    file29.delete();
                                                                                }
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                            f4bVar3.P0 = null;
                                                                            f4bVar3.R0 = null;
                                                                            f4bVar3.Q0 = null;
                                                                            File file30 = f4bVar3.Y0;
                                                                            if (file30 != null) {
                                                                                try {
                                                                                    file30.delete();
                                                                                } catch (Exception e3) {
                                                                                    fa4.g(e3, true);
                                                                                }
                                                                                f4bVar3.Y0 = null;
                                                                            }
                                                                            File file31 = f4bVar3.X0;
                                                                            if (file31 != null) {
                                                                                try {
                                                                                    file31.delete();
                                                                                } catch (Exception e4) {
                                                                                    fa4.g(e4, true);
                                                                                }
                                                                                f4bVar3.X0 = null;
                                                                            }
                                                                            f4bVar3.j |= z9;
                                                                            f4bVar3.T0 = arrayList10;
                                                                            f4bVar3.P0 = file21;
                                                                            f4bVar3.Y0 = file20;
                                                                            f4bVar3.R0 = file19;
                                                                            f4bVar3.X0 = file18;
                                                                            f4bVar3.Q0 = file17;
                                                                            f4bVar3.U0 = arrayList9;
                                                                            on7Var2.run();
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
                            if (x6bVar.r0()) {
                            }
                            file8 = file5;
                            file7 = file6;
                            final byte b622 = 1;
                            final boolean z822 = this.e;
                            final File file1622 = file3;
                            final ArrayList arrayList822 = arrayList;
                            gl.d3(new Runnable() { // from class: g6b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b622;
                                    Runnable runnable = on7Var;
                                    ArrayList arrayList9 = arrayList6;
                                    File file17 = file7;
                                    File file18 = file4;
                                    File file19 = file8;
                                    File file20 = file1622;
                                    File file21 = w;
                                    ArrayList arrayList10 = arrayList822;
                                    boolean z9 = z822;
                                    f4b f4bVar3 = f4bVar2;
                                    switch (b72) {
                                        case 0:
                                            d6b d6bVar = (d6b) runnable;
                                            try {
                                                File file22 = f4bVar3.P0;
                                                if (file22 != null) {
                                                    file22.delete();
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                File file23 = f4bVar3.R0;
                                                if (file23 != null) {
                                                    file23.delete();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                File file24 = f4bVar3.Q0;
                                                if (file24 != null) {
                                                    file24.delete();
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            f4bVar3.P0 = null;
                                            f4bVar3.R0 = null;
                                            f4bVar3.Q0 = null;
                                            File file25 = f4bVar3.Y0;
                                            if (file25 != null) {
                                                try {
                                                    file25.delete();
                                                } catch (Exception e) {
                                                    fa4.g(e, true);
                                                }
                                                f4bVar3.Y0 = null;
                                            }
                                            File file26 = f4bVar3.X0;
                                            if (file26 != null) {
                                                try {
                                                    file26.delete();
                                                } catch (Exception e2) {
                                                    fa4.g(e2, true);
                                                }
                                                f4bVar3.X0 = null;
                                            }
                                            f4bVar3.j |= z9;
                                            f4bVar3.T0 = arrayList10;
                                            f4bVar3.P0 = file21;
                                            f4bVar3.Y0 = file20;
                                            f4bVar3.R0 = file19;
                                            f4bVar3.X0 = file18;
                                            f4bVar3.Q0 = file17;
                                            f4bVar3.U0 = arrayList9;
                                            d6bVar.run();
                                            break;
                                        default:
                                            on7 on7Var2 = (on7) runnable;
                                            try {
                                                File file27 = f4bVar3.P0;
                                                if (file27 != null) {
                                                    file27.delete();
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                File file28 = f4bVar3.R0;
                                                if (file28 != null) {
                                                    file28.delete();
                                                }
                                            } catch (Exception unused5) {
                                            }
                                            try {
                                                File file29 = f4bVar3.Q0;
                                                if (file29 != null) {
                                                    file29.delete();
                                                }
                                            } catch (Exception unused6) {
                                            }
                                            f4bVar3.P0 = null;
                                            f4bVar3.R0 = null;
                                            f4bVar3.Q0 = null;
                                            File file30 = f4bVar3.Y0;
                                            if (file30 != null) {
                                                try {
                                                    file30.delete();
                                                } catch (Exception e3) {
                                                    fa4.g(e3, true);
                                                }
                                                f4bVar3.Y0 = null;
                                            }
                                            File file31 = f4bVar3.X0;
                                            if (file31 != null) {
                                                try {
                                                    file31.delete();
                                                } catch (Exception e4) {
                                                    fa4.g(e4, true);
                                                }
                                                f4bVar3.X0 = null;
                                            }
                                            f4bVar3.j |= z9;
                                            f4bVar3.T0 = arrayList10;
                                            f4bVar3.P0 = file21;
                                            f4bVar3.Y0 = file20;
                                            f4bVar3.R0 = file19;
                                            f4bVar3.X0 = file18;
                                            f4bVar3.Q0 = file17;
                                            f4bVar3.U0 = arrayList9;
                                            on7Var2.run();
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
                        if (f4bVar2.u) {
                            int i52 = f4bVar2.k0;
                            int i62 = f4bVar2.l0;
                            p0 = x6bVar.p0();
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
                        if (x6bVar.r0()) {
                        }
                        file8 = file5;
                        file7 = file6;
                        final byte b6222 = 1;
                        final boolean z8222 = this.e;
                        final File file16222 = file3;
                        final ArrayList arrayList8222 = arrayList;
                        gl.d3(new Runnable() { // from class: g6b
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b72 = b6222;
                                Runnable runnable = on7Var;
                                ArrayList arrayList9 = arrayList6;
                                File file17 = file7;
                                File file18 = file4;
                                File file19 = file8;
                                File file20 = file16222;
                                File file21 = w;
                                ArrayList arrayList10 = arrayList8222;
                                boolean z9 = z8222;
                                f4b f4bVar3 = f4bVar2;
                                switch (b72) {
                                    case 0:
                                        d6b d6bVar = (d6b) runnable;
                                        try {
                                            File file22 = f4bVar3.P0;
                                            if (file22 != null) {
                                                file22.delete();
                                            }
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            File file23 = f4bVar3.R0;
                                            if (file23 != null) {
                                                file23.delete();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        try {
                                            File file24 = f4bVar3.Q0;
                                            if (file24 != null) {
                                                file24.delete();
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        f4bVar3.P0 = null;
                                        f4bVar3.R0 = null;
                                        f4bVar3.Q0 = null;
                                        File file25 = f4bVar3.Y0;
                                        if (file25 != null) {
                                            try {
                                                file25.delete();
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                            }
                                            f4bVar3.Y0 = null;
                                        }
                                        File file26 = f4bVar3.X0;
                                        if (file26 != null) {
                                            try {
                                                file26.delete();
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                            }
                                            f4bVar3.X0 = null;
                                        }
                                        f4bVar3.j |= z9;
                                        f4bVar3.T0 = arrayList10;
                                        f4bVar3.P0 = file21;
                                        f4bVar3.Y0 = file20;
                                        f4bVar3.R0 = file19;
                                        f4bVar3.X0 = file18;
                                        f4bVar3.Q0 = file17;
                                        f4bVar3.U0 = arrayList9;
                                        d6bVar.run();
                                        break;
                                    default:
                                        on7 on7Var2 = (on7) runnable;
                                        try {
                                            File file27 = f4bVar3.P0;
                                            if (file27 != null) {
                                                file27.delete();
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            File file28 = f4bVar3.R0;
                                            if (file28 != null) {
                                                file28.delete();
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        try {
                                            File file29 = f4bVar3.Q0;
                                            if (file29 != null) {
                                                file29.delete();
                                            }
                                        } catch (Exception unused6) {
                                        }
                                        f4bVar3.P0 = null;
                                        f4bVar3.R0 = null;
                                        f4bVar3.Q0 = null;
                                        File file30 = f4bVar3.Y0;
                                        if (file30 != null) {
                                            try {
                                                file30.delete();
                                            } catch (Exception e3) {
                                                fa4.g(e3, true);
                                            }
                                            f4bVar3.Y0 = null;
                                        }
                                        File file31 = f4bVar3.X0;
                                        if (file31 != null) {
                                            try {
                                                file31.delete();
                                            } catch (Exception e4) {
                                                fa4.g(e4, true);
                                            }
                                            f4bVar3.X0 = null;
                                        }
                                        f4bVar3.j |= z9;
                                        f4bVar3.T0 = arrayList10;
                                        f4bVar3.P0 = file21;
                                        f4bVar3.Y0 = file20;
                                        f4bVar3.R0 = file19;
                                        f4bVar3.X0 = file18;
                                        f4bVar3.Q0 = file17;
                                        f4bVar3.U0 = arrayList9;
                                        on7Var2.run();
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
                if (f4bVar2.u) {
                }
                file3 = file2;
                z = D;
                arrayList = arrayList7;
                file4 = null;
                if (x6bVar.r0()) {
                }
                file8 = file5;
                file7 = file6;
                final byte b62222 = 1;
                final boolean z82222 = this.e;
                final File file162222 = file3;
                final ArrayList arrayList82222 = arrayList;
                gl.d3(new Runnable() { // from class: g6b
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b72 = b62222;
                        Runnable runnable = on7Var;
                        ArrayList arrayList9 = arrayList6;
                        File file17 = file7;
                        File file18 = file4;
                        File file19 = file8;
                        File file20 = file162222;
                        File file21 = w;
                        ArrayList arrayList10 = arrayList82222;
                        boolean z9 = z82222;
                        f4b f4bVar3 = f4bVar2;
                        switch (b72) {
                            case 0:
                                d6b d6bVar = (d6b) runnable;
                                try {
                                    File file22 = f4bVar3.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file23 = f4bVar3.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file24 = f4bVar3.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                f4bVar3.P0 = null;
                                f4bVar3.R0 = null;
                                f4bVar3.Q0 = null;
                                File file25 = f4bVar3.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    f4bVar3.Y0 = null;
                                }
                                File file26 = f4bVar3.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e2) {
                                        fa4.g(e2, true);
                                    }
                                    f4bVar3.X0 = null;
                                }
                                f4bVar3.j |= z9;
                                f4bVar3.T0 = arrayList10;
                                f4bVar3.P0 = file21;
                                f4bVar3.Y0 = file20;
                                f4bVar3.R0 = file19;
                                f4bVar3.X0 = file18;
                                f4bVar3.Q0 = file17;
                                f4bVar3.U0 = arrayList9;
                                d6bVar.run();
                                break;
                            default:
                                on7 on7Var2 = (on7) runnable;
                                try {
                                    File file27 = f4bVar3.P0;
                                    if (file27 != null) {
                                        file27.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file28 = f4bVar3.R0;
                                    if (file28 != null) {
                                        file28.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file29 = f4bVar3.Q0;
                                    if (file29 != null) {
                                        file29.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                f4bVar3.P0 = null;
                                f4bVar3.R0 = null;
                                f4bVar3.Q0 = null;
                                File file30 = f4bVar3.Y0;
                                if (file30 != null) {
                                    try {
                                        file30.delete();
                                    } catch (Exception e3) {
                                        fa4.g(e3, true);
                                    }
                                    f4bVar3.Y0 = null;
                                }
                                File file31 = f4bVar3.X0;
                                if (file31 != null) {
                                    try {
                                        file31.delete();
                                    } catch (Exception e4) {
                                        fa4.g(e4, true);
                                    }
                                    f4bVar3.X0 = null;
                                }
                                f4bVar3.j |= z9;
                                f4bVar3.T0 = arrayList10;
                                f4bVar3.P0 = file21;
                                f4bVar3.Y0 = file20;
                                f4bVar3.R0 = file19;
                                f4bVar3.X0 = file18;
                                f4bVar3.Q0 = file17;
                                f4bVar3.U0 = arrayList9;
                                on7Var2.run();
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
                t7b t7bVar2 = (t7b) gk7Var;
                x6b x6bVar2 = (x6b) obj3;
                f4b f4bVar3 = (f4b) obj2;
                final d6b d6bVar = (d6b) obj;
                int i11 = t7bVar2.c;
                ArrayList arrayList9 = new ArrayList();
                x6bVar2.q0(arrayList9, false, false, false, false, f4bVar3);
                if (f4bVar3.K) {
                    z2 = z4;
                } else {
                    z2 = z4;
                    f4bVar3.S0 = Utilities.k(x6bVar2.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = x6bVar2.getMasks();
                final ArrayList arrayList10 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z9 = f4bVar3.K;
                boolean D2 = f4bVar3.D();
                arrayList9.clear();
                Bitmap q03 = x6bVar2.q0(arrayList9, true, false, false, !z9, f4bVar3);
                ArrayList arrayList11 = arrayList9.isEmpty() ? null : arrayList9;
                ba4.G(i11);
                File J = ba4.J(fl5.V(q03, Bitmap.CompressFormat.PNG, f4bVar3.i0, f4bVar3.j0, 87), null, true, true);
                if (q03 != null && !q03.isRecycled()) {
                    q03.recycle();
                }
                if (f4bVar3.u) {
                    long j3 = f4bVar3.z0;
                    if (j3 != Long.MIN_VALUE) {
                        Drawable drawable2 = f4bVar3.x0;
                        if (drawable2 == null) {
                            drawable2 = zi8.d(null, i11, j3, t7bVar2.d2);
                        }
                        str = "webp";
                        if (drawable2 != null) {
                            file9 = f4b.w(i11, str);
                            Bitmap createBitmap3 = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                            f4b.j(new Canvas(createBitmap3), drawable2, createBitmap3.getWidth(), createBitmap3.getHeight());
                            try {
                                try {
                                    createBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file9));
                                    break;
                                } catch (Exception e) {
                                    fa4.g(e, true);
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
                if (f4bVar3.u && f4bVar3.K) {
                    int i12 = f4bVar3.k0;
                    int i13 = f4bVar3.l0;
                    u17 p02 = x6bVar2.p0();
                    if (p02 != null) {
                        o17 o17Var2 = p02.t0;
                        if (o17Var2.getChildCount() == 1 && i12 > 0 && i13 > 0 && (o17Var2.getChildAt(0) instanceof gb2)) {
                            imageReceiver = ((gb2) o17Var2.getChildAt(0)).getPhotoImage();
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
                                                RectF rectF2 = gl.P;
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
                                                    file15 = f4b.w(i11, str);
                                                    createBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file15));
                                                } catch (Exception e2) {
                                                    fa4.g(e2, true);
                                                    file15 = null;
                                                }
                                                createBitmap4.recycle();
                                                file12 = file15;
                                                if (z3) {
                                                    f4bVar = f4bVar3;
                                                    Bitmap q04 = x6bVar2.q0(new ArrayList(), false, true, false, false, f4bVar);
                                                    ba4.G(i11);
                                                    File J2 = ba4.J(fl5.V(q04, Bitmap.CompressFormat.PNG, i3, i2, 87), null, true, true);
                                                    if (q04 != null && !q04.isRecycled()) {
                                                        q04.recycle();
                                                    }
                                                    file13 = J2;
                                                } else {
                                                    f4bVar = f4bVar3;
                                                    file13 = null;
                                                }
                                                if (z2) {
                                                    file14 = null;
                                                } else {
                                                    Bitmap blurBitmap2 = x6bVar2.getBlurBitmap();
                                                    ba4.G(i11);
                                                    File J3 = ba4.J(fl5.V(blurBitmap2, Bitmap.CompressFormat.PNG, i3, i2, 87), null, true, true);
                                                    if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                                                        blurBitmap2.recycle();
                                                    }
                                                    file14 = J3;
                                                }
                                                final byte b8 = 0;
                                                final boolean z10 = this.e;
                                                final ArrayList arrayList12 = arrayList11;
                                                final f4b f4bVar4 = f4bVar;
                                                final File file17 = file10;
                                                final File file18 = file11;
                                                gl.d3(new Runnable() { // from class: g6b
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        byte b72 = b8;
                                                        Runnable runnable = d6bVar;
                                                        ArrayList arrayList92 = arrayList10;
                                                        File file172 = file14;
                                                        File file182 = file12;
                                                        File file19 = file13;
                                                        File file20 = file18;
                                                        File file21 = file17;
                                                        ArrayList arrayList102 = arrayList12;
                                                        boolean z92 = z10;
                                                        f4b f4bVar32 = f4bVar4;
                                                        switch (b72) {
                                                            case 0:
                                                                d6b d6bVar2 = (d6b) runnable;
                                                                try {
                                                                    File file22 = f4bVar32.P0;
                                                                    if (file22 != null) {
                                                                        file22.delete();
                                                                    }
                                                                } catch (Exception unused) {
                                                                }
                                                                try {
                                                                    File file23 = f4bVar32.R0;
                                                                    if (file23 != null) {
                                                                        file23.delete();
                                                                    }
                                                                } catch (Exception unused2) {
                                                                }
                                                                try {
                                                                    File file24 = f4bVar32.Q0;
                                                                    if (file24 != null) {
                                                                        file24.delete();
                                                                    }
                                                                } catch (Exception unused3) {
                                                                }
                                                                f4bVar32.P0 = null;
                                                                f4bVar32.R0 = null;
                                                                f4bVar32.Q0 = null;
                                                                File file25 = f4bVar32.Y0;
                                                                if (file25 != null) {
                                                                    try {
                                                                        file25.delete();
                                                                    } catch (Exception e3) {
                                                                        fa4.g(e3, true);
                                                                    }
                                                                    f4bVar32.Y0 = null;
                                                                }
                                                                File file26 = f4bVar32.X0;
                                                                if (file26 != null) {
                                                                    try {
                                                                        file26.delete();
                                                                    } catch (Exception e22) {
                                                                        fa4.g(e22, true);
                                                                    }
                                                                    f4bVar32.X0 = null;
                                                                }
                                                                f4bVar32.j |= z92;
                                                                f4bVar32.T0 = arrayList102;
                                                                f4bVar32.P0 = file21;
                                                                f4bVar32.Y0 = file20;
                                                                f4bVar32.R0 = file19;
                                                                f4bVar32.X0 = file182;
                                                                f4bVar32.Q0 = file172;
                                                                f4bVar32.U0 = arrayList92;
                                                                d6bVar2.run();
                                                                break;
                                                            default:
                                                                on7 on7Var2 = (on7) runnable;
                                                                try {
                                                                    File file27 = f4bVar32.P0;
                                                                    if (file27 != null) {
                                                                        file27.delete();
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                                try {
                                                                    File file28 = f4bVar32.R0;
                                                                    if (file28 != null) {
                                                                        file28.delete();
                                                                    }
                                                                } catch (Exception unused5) {
                                                                }
                                                                try {
                                                                    File file29 = f4bVar32.Q0;
                                                                    if (file29 != null) {
                                                                        file29.delete();
                                                                    }
                                                                } catch (Exception unused6) {
                                                                }
                                                                f4bVar32.P0 = null;
                                                                f4bVar32.R0 = null;
                                                                f4bVar32.Q0 = null;
                                                                File file30 = f4bVar32.Y0;
                                                                if (file30 != null) {
                                                                    try {
                                                                        file30.delete();
                                                                    } catch (Exception e32) {
                                                                        fa4.g(e32, true);
                                                                    }
                                                                    f4bVar32.Y0 = null;
                                                                }
                                                                File file31 = f4bVar32.X0;
                                                                if (file31 != null) {
                                                                    try {
                                                                        file31.delete();
                                                                    } catch (Exception e4) {
                                                                        fa4.g(e4, true);
                                                                    }
                                                                    f4bVar32.X0 = null;
                                                                }
                                                                f4bVar32.j |= z92;
                                                                f4bVar32.T0 = arrayList102;
                                                                f4bVar32.P0 = file21;
                                                                f4bVar32.Y0 = file20;
                                                                f4bVar32.R0 = file19;
                                                                f4bVar32.X0 = file182;
                                                                f4bVar32.Q0 = file172;
                                                                f4bVar32.U0 = arrayList92;
                                                                on7Var2.run();
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
                final f4b f4bVar42 = f4bVar;
                final File file172 = file10;
                final File file182 = file11;
                gl.d3(new Runnable() { // from class: g6b
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b72 = b82;
                        Runnable runnable = d6bVar;
                        ArrayList arrayList92 = arrayList10;
                        File file1722 = file14;
                        File file1822 = file12;
                        File file19 = file13;
                        File file20 = file182;
                        File file21 = file172;
                        ArrayList arrayList102 = arrayList122;
                        boolean z92 = z102;
                        f4b f4bVar32 = f4bVar42;
                        switch (b72) {
                            case 0:
                                d6b d6bVar2 = (d6b) runnable;
                                try {
                                    File file22 = f4bVar32.P0;
                                    if (file22 != null) {
                                        file22.delete();
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    File file23 = f4bVar32.R0;
                                    if (file23 != null) {
                                        file23.delete();
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file24 = f4bVar32.Q0;
                                    if (file24 != null) {
                                        file24.delete();
                                    }
                                } catch (Exception unused3) {
                                }
                                f4bVar32.P0 = null;
                                f4bVar32.R0 = null;
                                f4bVar32.Q0 = null;
                                File file25 = f4bVar32.Y0;
                                if (file25 != null) {
                                    try {
                                        file25.delete();
                                    } catch (Exception e3) {
                                        fa4.g(e3, true);
                                    }
                                    f4bVar32.Y0 = null;
                                }
                                File file26 = f4bVar32.X0;
                                if (file26 != null) {
                                    try {
                                        file26.delete();
                                    } catch (Exception e22) {
                                        fa4.g(e22, true);
                                    }
                                    f4bVar32.X0 = null;
                                }
                                f4bVar32.j |= z92;
                                f4bVar32.T0 = arrayList102;
                                f4bVar32.P0 = file21;
                                f4bVar32.Y0 = file20;
                                f4bVar32.R0 = file19;
                                f4bVar32.X0 = file1822;
                                f4bVar32.Q0 = file1722;
                                f4bVar32.U0 = arrayList92;
                                d6bVar2.run();
                                break;
                            default:
                                on7 on7Var2 = (on7) runnable;
                                try {
                                    File file27 = f4bVar32.P0;
                                    if (file27 != null) {
                                        file27.delete();
                                    }
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file28 = f4bVar32.R0;
                                    if (file28 != null) {
                                        file28.delete();
                                    }
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file29 = f4bVar32.Q0;
                                    if (file29 != null) {
                                        file29.delete();
                                    }
                                } catch (Exception unused6) {
                                }
                                f4bVar32.P0 = null;
                                f4bVar32.R0 = null;
                                f4bVar32.Q0 = null;
                                File file30 = f4bVar32.Y0;
                                if (file30 != null) {
                                    try {
                                        file30.delete();
                                    } catch (Exception e32) {
                                        fa4.g(e32, true);
                                    }
                                    f4bVar32.Y0 = null;
                                }
                                File file31 = f4bVar32.X0;
                                if (file31 != null) {
                                    try {
                                        file31.delete();
                                    } catch (Exception e4) {
                                        fa4.g(e4, true);
                                    }
                                    f4bVar32.X0 = null;
                                }
                                f4bVar32.j |= z92;
                                f4bVar32.T0 = arrayList102;
                                f4bVar32.P0 = file21;
                                f4bVar32.Y0 = file20;
                                f4bVar32.R0 = file19;
                                f4bVar32.X0 = file1822;
                                f4bVar32.Q0 = file1722;
                                f4bVar32.U0 = arrayList92;
                                on7Var2.run();
                                break;
                        }
                    }
                });
                return;
        }
    }

    public /* synthetic */ g2a(t7b t7bVar, x6b x6bVar, int i, int i2, f4b f4bVar, boolean z, boolean z2, Runnable runnable, byte b) {
        this.a = b;
        this.f = t7bVar;
        this.h = x6bVar;
        this.b = i;
        this.c = i2;
        this.n = f4bVar;
        this.d = z;
        this.e = z2;
        this.r = runnable;
    }
}
