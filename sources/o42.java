// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class o42 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o42(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0490  */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i;
        int i2;
        jza[] jzaVarArr;
        float f;
        Bitmap bitmap;
        byte b;
        float f2;
        float f3;
        float f4;
        float f5;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                q42 q42Var = (q42) this.c;
                File file = (File) this.d;
                boolean z = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = q42Var.e;
                chatAttachAlertPhotoLayout.t0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.P1) {
                    ChatAttachAlertPhotoLayout.r1 = false;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                        i = options.outWidth;
                        try {
                            i2 = options.outHeight;
                        } catch (Exception unused) {
                            i2 = 0;
                            int i3 = i;
                            int i4 = ChatAttachAlertPhotoLayout.v1;
                            ChatAttachAlertPhotoLayout.v1 = i4 - 1;
                            jm6 jm6Var = new jm6(i4, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i3, i2);
                            jm6Var.L = true;
                            chatAttachAlertPhotoLayout.m0(jm6Var, z, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i = 0;
                    }
                    int i32 = i;
                    int i42 = ChatAttachAlertPhotoLayout.v1;
                    ChatAttachAlertPhotoLayout.v1 = i42 - 1;
                    jm6 jm6Var2 = new jm6(i42, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i32, i2);
                    jm6Var2.L = true;
                    chatAttachAlertPhotoLayout.m0(jm6Var2, z, false);
                }
                break;
            case 1:
                n14 n14Var = (n14) this.c;
                boolean z2 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = n14Var.r;
                o14 o14Var = n14Var.x;
                if (o14Var.N == n14Var.b) {
                    if (z2) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        o14Var.E = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList.get(i5);
                        i5++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        n14Var.w.put(document.id, document);
                    }
                    n14Var.f.put(arrayList2, o14Var.O);
                    runnable.run();
                    break;
                }
                break;
            case 2:
                c cVar = (c) this.c;
                i8c i8cVar = (i8c) this.d;
                boolean z3 = this.b;
                y05 y05Var = (y05) obj;
                if (y05Var == null) {
                    Exception exc = cVar.c.f;
                    String message = exc != null ? exc.getMessage() : null;
                    if (!"AUTH_CANCELED".equals(message)) {
                        c.m("getSecretPhrase: local phrase unavailable: " + message);
                        i8cVar.a(null, (message == null || !message.startsWith("AUTH_")) ? "LOCAL_STORAGE_ERROR" : "WALLET_UNLOCK_FAILED");
                        break;
                    } else {
                        c.O("getSecretPhrase: unlock canceled");
                        if (z3) {
                            i8cVar.a(null, "WALLET_SEND_CANCELLED");
                            break;
                        }
                    }
                } else {
                    i8cVar.a(y05Var, null);
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z4 = this.b;
                bm6 bm6Var = (bm6) this.d;
                jza jzaVar = (jza) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                mza mzaVar = photoViewer.o5;
                if (!mzaVar.E || (jzaVarArr = mzaVar.I) == null || jzaVarArr.length <= 0) {
                    photoViewer.s5.setCutOutState(true);
                    photoViewer.g2(false, true);
                } else {
                    ijb thanosEffect = photoViewer.o5.getThanosEffect();
                    mza mzaVar2 = photoViewer.o5;
                    mzaVar2.M = true;
                    mzaVar2.F = jzaVar;
                    Bitmap n = photoViewer.B4.n();
                    int i6 = photoViewer.B4.V;
                    jza jzaVar2 = mzaVar2.F;
                    Bitmap b3 = jzaVar2 == null ? mzaVar2.J : (!z4 || n == null) ? jzaVar2.b() : mzaVar2.e(n);
                    jm6 jm6Var3 = (jm6) photoViewer.f7.get(photoViewer.O4);
                    if (thanosEffect == null) {
                        Utilities.i.c(new u68(photoViewer, b3, b2));
                        photoViewer.o5.f();
                        photoViewer.f0.invalidate();
                        break;
                    } else {
                        mza mzaVar3 = photoViewer.o5;
                        int i7 = photoViewer.B4.V;
                        mzaVar3.getClass();
                        String str = jm6Var3.i;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : mzaVar3.getSourceBitmap();
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(jm6Var3.j);
                        int width = decodeFile.getWidth();
                        int height = decodeFile.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        Paint paint2 = new Paint(3);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint2);
                        Rect rect = new Rect();
                        rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
                        jza jzaVar3 = mzaVar3.F;
                        if (jzaVar3 == null) {
                            jza[] jzaVarArr2 = mzaVar3.I;
                            if (jzaVarArr2.length > 0) {
                                jzaVar3 = jzaVarArr2[0];
                            }
                        }
                        if (jzaVar3 == null) {
                            createBitmap = null;
                            f = 2.0f;
                            b = 2;
                        } else {
                            f = 2.0f;
                            if (jzaVar3.c == 0 || !jm6Var3.u) {
                                bitmap = decodeFile;
                                b = 2;
                                canvas.drawBitmap(jzaVar3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                b = 2;
                                bitmap = decodeFile;
                                matrix.postRotate(jzaVar3.c, jzaVar3.a().getWidth() / 2.0f, jzaVar3.a().getHeight() / 2.0f);
                                if ((jzaVar3.c / 90) % 2 != 0) {
                                    float height2 = (jzaVar3.a().getHeight() - jzaVar3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap.getWidth() / jzaVar3.a().getHeight(), bitmap.getHeight() / jzaVar3.a().getWidth());
                                canvas.drawBitmap(jzaVar3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (jzaVar3.c == 0 || jm6Var3.u) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-jzaVar3.c, decodeFile2.getWidth() / 2.0f, decodeFile2.getHeight() / 2.0f);
                                    if ((jzaVar3.c / 90) % 2 != 0) {
                                        float height3 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / 2.0f;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap.getWidth() / decodeFile2.getHeight(), bitmap.getHeight() / decodeFile2.getWidth());
                                    canvas.drawBitmap(decodeFile2, matrix2, paint);
                                }
                            }
                        }
                        if (createBitmap == null) {
                            Utilities.i.c(new u68(photoViewer, b3, (byte) 1));
                            photoViewer.o5.f();
                            photoViewer.f0.invalidate();
                            break;
                        } else {
                            zl6 zl6Var = bm6Var.A;
                            if (zl6Var != null) {
                                ImageReceiver imageReceiver = photoViewer.B4;
                                createBitmap = PhotoViewer.E(createBitmap, zl6Var, new int[]{imageReceiver.V, imageReceiver.W}, true);
                            }
                            if (createBitmap == null) {
                                Utilities.i.c(new u68(photoViewer, b3, b));
                                photoViewer.o5.f();
                                photoViewer.f0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = createBitmap.getWidth();
                                int height4 = createBitmap.getHeight();
                                if (!jm6Var3.w && (photoViewer.B4.V / 90) % 2 != 0) {
                                    width2 = createBitmap.getHeight();
                                    height4 = createBitmap.getWidth();
                                }
                                float f6 = width2;
                                float f7 = height4;
                                float min = Math.min(photoViewer.i0(photoViewer.t4) / f6, photoViewer.g0() / f7);
                                float f8 = f6 * min;
                                float f9 = f7 * min;
                                if ((photoViewer.B4.V == 0 || jm6Var3.w) && photoViewer.a6 == 0.0f) {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    f4 = f8;
                                    f5 = f9;
                                } else {
                                    float width3 = createBitmap.getWidth();
                                    float height5 = createBitmap.getHeight();
                                    float f10 = width3 / f;
                                    float f11 = height5 / f;
                                    float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                                    float f12 = sqrt * f;
                                    int i8 = (int) f12;
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i8, i8, config);
                                    Canvas canvas2 = new Canvas(createBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((jm6Var3.w ? 0 : photoViewer.B4.V) + photoViewer.a6, sqrt, sqrt);
                                    canvas2.drawBitmap(createBitmap, (f12 - width3) / f, (f12 - height5) / f, (Paint) null);
                                    createBitmap.recycle();
                                    float f13 = f8 / f;
                                    float f14 = f9 / f;
                                    f4 = ((float) Math.sqrt((f14 * f14) + (f13 * f13))) * f;
                                    f2 = (-(f4 - f8)) / f;
                                    f3 = (-(f4 - f9)) / f;
                                    f5 = f4;
                                    createBitmap = createBitmap2;
                                }
                                matrix3.postScale(f4, f5);
                                float f15 = photoViewer.Z5;
                                matrix3.postScale(f15, f15, f4 / f, f5 / f);
                                matrix3.postTranslate(photoViewer.W5 + f2 + Math.max(0, (int) ((photoViewer.i0(photoViewer.t4) - f8) / f)), photoViewer.X5 + f3 + Math.max(0, (int) ((photoViewer.g0() - f9) / f)));
                                photoViewer.o5.W = true;
                                Utilities.i.c(new u68(photoViewer, b3, (byte) 3));
                                l68 l68Var = new l68(photoViewer, (byte) 9);
                                pc7 pc7Var = new pc7((Object) photoViewer, (Object) b3, (Object) l68Var, (byte) 21);
                                am6 am6Var = new am6((byte) 11);
                                gjb gjbVar = thanosEffect.a;
                                if (gjbVar != null) {
                                    gjbVar.c(matrix3, createBitmap, pc7Var, am6Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new hjb(matrix3, createBitmap, pc7Var, am6Var));
                                }
                                gl.d3(l68Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.o5.f();
                photoViewer.f0.invalidate();
                break;
            case 4:
                boolean z5 = this.b;
                String str2 = (String) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                Runnable runnable2 = (Runnable) obj;
                if (!z5) {
                    runnable2.run();
                    break;
                } else {
                    tya.G3.c(y6c.t0, str2, new dw9(linkedHashSet, runnable2, (byte) 1));
                    break;
                }
            default:
                boolean z6 = this.b;
                hd hdVar = (hd) this.c;
                p8c p8cVar = (p8c) this.d;
                fsc fscVar = (fsc) obj;
                if (z6) {
                    hdVar.b(350L);
                }
                p8cVar.a(fscVar);
                break;
        }
    }

    public /* synthetic */ o42(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ o42(boolean z, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
