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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class e52 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e52(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0490  */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i;
        int i2;
        h3b[] h3bVarArr;
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
                g52 g52Var = (g52) this.c;
                File file = (File) this.d;
                boolean z = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = g52Var.e;
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
                            no6 no6Var = new no6(i4, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i3, i2);
                            no6Var.L = true;
                            chatAttachAlertPhotoLayout.l0(no6Var, z, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i = 0;
                    }
                    int i32 = i;
                    int i42 = ChatAttachAlertPhotoLayout.v1;
                    ChatAttachAlertPhotoLayout.v1 = i42 - 1;
                    no6 no6Var2 = new no6(i42, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i32, i2);
                    no6Var2.L = true;
                    chatAttachAlertPhotoLayout.l0(no6Var2, z, false);
                }
                break;
            case 1:
                i24 i24Var = (i24) this.c;
                boolean z2 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = i24Var.r;
                j24 j24Var = i24Var.x;
                if (j24Var.N == i24Var.b) {
                    if (z2) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        j24Var.E = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList.get(i5);
                        i5++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        i24Var.w.put(document.id, document);
                    }
                    i24Var.f.put(arrayList2, j24Var.O);
                    runnable.run();
                    break;
                }
                break;
            case 2:
                c cVar = (c) this.c;
                icc iccVar = (icc) this.d;
                boolean z3 = this.b;
                c35 c35Var = (c35) obj;
                if (c35Var == null) {
                    Exception exc = cVar.c.f;
                    String message = exc != null ? exc.getMessage() : null;
                    if (!"AUTH_CANCELED".equals(message)) {
                        c.m("getSecretPhrase: local phrase unavailable: " + message);
                        iccVar.a(null, (message == null || !message.startsWith("AUTH_")) ? "LOCAL_STORAGE_ERROR" : "WALLET_UNLOCK_FAILED");
                        break;
                    } else {
                        c.P("getSecretPhrase: unlock canceled");
                        if (z3) {
                            iccVar.a(null, "WALLET_SEND_CANCELLED");
                            break;
                        }
                    }
                } else {
                    iccVar.a(c35Var, null);
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z4 = this.b;
                go6 go6Var = (go6) this.d;
                h3b h3bVar = (h3b) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                k3b k3bVar = photoViewer.o5;
                if (!k3bVar.E || (h3bVarArr = k3bVar.I) == null || h3bVarArr.length <= 0) {
                    photoViewer.s5.setCutOutState(true);
                    photoViewer.g2(false, true);
                } else {
                    hnb thanosEffect = photoViewer.o5.getThanosEffect();
                    k3b k3bVar2 = photoViewer.o5;
                    k3bVar2.M = true;
                    k3bVar2.F = h3bVar;
                    Bitmap n = photoViewer.B4.n();
                    int i6 = photoViewer.B4.V;
                    h3b h3bVar2 = k3bVar2.F;
                    Bitmap b3 = h3bVar2 == null ? k3bVar2.J : (!z4 || n == null) ? h3bVar2.b() : k3bVar2.e(n);
                    no6 no6Var3 = (no6) photoViewer.f7.get(photoViewer.O4);
                    if (thanosEffect == null) {
                        Utilities.i.c(new ka8(photoViewer, b3, b2));
                        photoViewer.o5.f();
                        photoViewer.f0.invalidate();
                        break;
                    } else {
                        k3b k3bVar3 = photoViewer.o5;
                        int i7 = photoViewer.B4.V;
                        k3bVar3.getClass();
                        String str = no6Var3.i;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : k3bVar3.getSourceBitmap();
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(no6Var3.j);
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
                        h3b h3bVar3 = k3bVar3.F;
                        if (h3bVar3 == null) {
                            h3b[] h3bVarArr2 = k3bVar3.I;
                            if (h3bVarArr2.length > 0) {
                                h3bVar3 = h3bVarArr2[0];
                            }
                        }
                        if (h3bVar3 == null) {
                            createBitmap = null;
                            f = 2.0f;
                            b = 2;
                        } else {
                            f = 2.0f;
                            if (h3bVar3.c == 0 || !no6Var3.u) {
                                bitmap = decodeFile;
                                b = 2;
                                canvas.drawBitmap(h3bVar3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                b = 2;
                                bitmap = decodeFile;
                                matrix.postRotate(h3bVar3.c, h3bVar3.a().getWidth() / 2.0f, h3bVar3.a().getHeight() / 2.0f);
                                if ((h3bVar3.c / 90) % 2 != 0) {
                                    float height2 = (h3bVar3.a().getHeight() - h3bVar3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap.getWidth() / h3bVar3.a().getHeight(), bitmap.getHeight() / h3bVar3.a().getWidth());
                                canvas.drawBitmap(h3bVar3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (h3bVar3.c == 0 || no6Var3.u) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-h3bVar3.c, decodeFile2.getWidth() / 2.0f, decodeFile2.getHeight() / 2.0f);
                                    if ((h3bVar3.c / 90) % 2 != 0) {
                                        float height3 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / 2.0f;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap.getWidth() / decodeFile2.getHeight(), bitmap.getHeight() / decodeFile2.getWidth());
                                    canvas.drawBitmap(decodeFile2, matrix2, paint);
                                }
                            }
                        }
                        if (createBitmap == null) {
                            Utilities.i.c(new ka8(photoViewer, b3, (byte) 1));
                            photoViewer.o5.f();
                            photoViewer.f0.invalidate();
                            break;
                        } else {
                            fo6 fo6Var = go6Var.A;
                            if (fo6Var != null) {
                                ImageReceiver imageReceiver = photoViewer.B4;
                                createBitmap = PhotoViewer.D(createBitmap, fo6Var, new int[]{imageReceiver.V, imageReceiver.W}, true);
                            }
                            if (createBitmap == null) {
                                Utilities.i.c(new ka8(photoViewer, b3, b));
                                photoViewer.o5.f();
                                photoViewer.f0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = createBitmap.getWidth();
                                int height4 = createBitmap.getHeight();
                                if (!no6Var3.w && (photoViewer.B4.V / 90) % 2 != 0) {
                                    width2 = createBitmap.getHeight();
                                    height4 = createBitmap.getWidth();
                                }
                                float f6 = width2;
                                float f7 = height4;
                                float min = Math.min(photoViewer.h0(photoViewer.t4) / f6, photoViewer.f0() / f7);
                                float f8 = f6 * min;
                                float f9 = f7 * min;
                                if ((photoViewer.B4.V == 0 || no6Var3.w) && photoViewer.a6 == 0.0f) {
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
                                    canvas2.rotate((no6Var3.w ? 0 : photoViewer.B4.V) + photoViewer.a6, sqrt, sqrt);
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
                                matrix3.postTranslate(photoViewer.W5 + f2 + Math.max(0, (int) ((photoViewer.h0(photoViewer.t4) - f8) / f)), photoViewer.X5 + f3 + Math.max(0, (int) ((photoViewer.f0() - f9) / f)));
                                photoViewer.o5.W = true;
                                Utilities.i.c(new ka8(photoViewer, b3, (byte) 3));
                                y98 y98Var = new y98(photoViewer, (byte) 9);
                                fd7 fd7Var = new fd7((Object) photoViewer, (Object) b3, (Object) y98Var, (byte) 28);
                                pg6 pg6Var = new pg6((byte) 14);
                                fnb fnbVar = thanosEffect.a;
                                if (fnbVar != null) {
                                    fnbVar.c(matrix3, createBitmap, fd7Var, pg6Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new gnb(matrix3, createBitmap, fd7Var, pg6Var));
                                }
                                hl.d3(y98Var, 1200L);
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
                    t2b.G3.c(yac.t0, str2, new xz9(linkedHashSet, runnable2, (byte) 1));
                    break;
                }
            default:
                boolean z6 = this.b;
                id idVar = (id) this.c;
                pcc pccVar = (pcc) this.d;
                vwc vwcVar = (vwc) obj;
                if (z6) {
                    idVar.b(350L);
                }
                pccVar.a(vwcVar);
                break;
        }
    }

    public /* synthetic */ e52(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ e52(boolean z, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
