package hi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.Choreographer;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ef;
import org.telegram.messenger.i10;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.messenger.we;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.vl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b01;
import org.telegram.ui.cd0;
import org.telegram.ui.kn0;
import org.telegram.ui.lc0;
import org.telegram.ui.sn0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class fc implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fc(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0474  */
    @Override // org.telegram.messenger.w10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i7;
        int i10;
        tg.f2[] f2VarArr;
        Bitmap bitmap;
        float f10;
        Bitmap bitmap2;
        float f11;
        float f12;
        float f13;
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                w10 w10Var = (w10) this.d;
                kc kcVar = (kc) obj;
                if (z10) {
                    t1Var.c(350L);
                }
                w10Var.a(kcVar);
                break;
            case 1:
                vl vlVar = (vl) this.c;
                File file = (File) this.d;
                boolean z11 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.e;
                chatAttachAlertPhotoLayout.t0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.Q1) {
                    ChatAttachAlertPhotoLayout.r1 = false;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                        i7 = options.outWidth;
                        try {
                            i10 = options.outHeight;
                        } catch (Exception unused) {
                            i10 = 0;
                            int i11 = i7;
                            int i12 = ChatAttachAlertPhotoLayout.v1;
                            ChatAttachAlertPhotoLayout.v1 = i12 - 1;
                            ef efVar = new ef(i12, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i11, i10);
                            efVar.L = true;
                            chatAttachAlertPhotoLayout.m0(efVar, z11, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i7 = 0;
                    }
                    int i112 = i7;
                    int i122 = ChatAttachAlertPhotoLayout.v1;
                    ChatAttachAlertPhotoLayout.v1 = i122 - 1;
                    ef efVar2 = new ef(i122, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i112, i10);
                    efVar2.L = true;
                    chatAttachAlertPhotoLayout.m0(efVar2, z11, false);
                }
                break;
            case 2:
                ky kyVar = (ky) this.c;
                boolean z12 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = kyVar.r;
                ly lyVar = kyVar.x;
                if (lyVar.N == kyVar.b) {
                    int i13 = 0;
                    if (z12) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        lyVar.E = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        kyVar.w.put(document.id, document);
                    }
                    kyVar.f.put(arrayList2, lyVar.O);
                    runnable.run();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z13 = this.b;
                xe xeVar = (xe) this.d;
                tg.f2 f2Var = (tg.f2) obj;
                tg.i2 i2Var = photoViewer.p5;
                if (!i2Var.E || (f2VarArr = i2Var.I) == null || f2VarArr.length <= 0) {
                    photoViewer.t5.setCutOutState(true);
                    photoViewer.W2(false, true);
                } else {
                    nz0 thanosEffect = photoViewer.p5.getThanosEffect();
                    tg.i2 i2Var2 = photoViewer.p5;
                    i2Var2.M = true;
                    i2Var2.F = f2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i14 = photoViewer.C4.V;
                    tg.f2 f2Var2 = i2Var2.F;
                    Bitmap b10 = f2Var2 == null ? i2Var2.J : (!z13 || n10 == null) ? f2Var2.b() : i2Var2.e(n10);
                    ef efVar3 = (ef) photoViewer.g7.get(photoViewer.P4);
                    if (thanosEffect == null) {
                        Utilities.i.c(new sn0(photoViewer, b10, 0));
                        photoViewer.p5.f();
                        photoViewer.f0.invalidate();
                        break;
                    } else {
                        tg.i2 i2Var3 = photoViewer.p5;
                        int i15 = photoViewer.C4.V;
                        i2Var3.getClass();
                        String str = efVar3.i;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : i2Var3.getSourceBitmap();
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(efVar3.j);
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
                        float f14 = 0.0f;
                        Bitmap bitmap3 = decodeFile;
                        rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
                        tg.f2 f2Var3 = i2Var3.F;
                        if (f2Var3 == null) {
                            tg.f2[] f2VarArr2 = i2Var3.I;
                            if (f2VarArr2.length > 0) {
                                f2Var3 = f2VarArr2[0];
                            }
                        }
                        if (f2Var3 == null) {
                            bitmap2 = null;
                            f10 = 2.0f;
                        } else {
                            if (f2Var3.c == 0 || !efVar3.u) {
                                bitmap = createBitmap;
                                f10 = 2.0f;
                                canvas.drawBitmap(f2Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f10 = 2.0f;
                                bitmap = createBitmap;
                                matrix.postRotate(f2Var3.c, f2Var3.a().getWidth() / 2.0f, f2Var3.a().getHeight() / 2.0f);
                                if ((f2Var3.c / 90) % 2 != 0) {
                                    float height2 = (f2Var3.a().getHeight() - f2Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap3.getWidth() / f2Var3.a().getHeight(), bitmap3.getHeight() / f2Var3.a().getWidth());
                                canvas.drawBitmap(f2Var3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (f2Var3.c == 0 || efVar3.u) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-f2Var3.c, decodeFile2.getWidth() / f10, decodeFile2.getHeight() / f10);
                                    if ((f2Var3.c / 90) % 2 != 0) {
                                        float height3 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / f10;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap3.getWidth() / decodeFile2.getHeight(), bitmap3.getHeight() / decodeFile2.getWidth());
                                    canvas.drawBitmap(decodeFile2, matrix2, paint);
                                }
                            }
                            bitmap2 = bitmap;
                        }
                        if (bitmap2 == null) {
                            Utilities.i.c(new sn0(photoViewer, b10, 1));
                            photoViewer.p5.f();
                            photoViewer.f0.invalidate();
                            break;
                        } else {
                            we weVar = xeVar.A;
                            if (weVar != null) {
                                ImageReceiver imageReceiver = photoViewer.C4;
                                bitmap2 = PhotoViewer.C0(bitmap2, weVar, new int[]{imageReceiver.V, imageReceiver.W}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.i.c(new sn0(photoViewer, b10, 2));
                                photoViewer.p5.f();
                                photoViewer.f0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmap2.getWidth();
                                int height4 = bitmap2.getHeight();
                                if (!efVar3.w && (photoViewer.C4.V / 90) % 2 != 0) {
                                    width2 = bitmap2.getHeight();
                                    height4 = bitmap2.getWidth();
                                }
                                float f15 = width2;
                                float f16 = height4;
                                float min = Math.min(photoViewer.g1(photoViewer.u4) / f15, photoViewer.e1() / f16);
                                float f17 = f15 * min;
                                float f18 = f16 * min;
                                if ((photoViewer.C4.V == 0 || efVar3.w) && photoViewer.b6 == 0.0f) {
                                    f11 = f17;
                                    f12 = f18;
                                    f13 = 0.0f;
                                } else {
                                    float width3 = bitmap2.getWidth();
                                    float height5 = bitmap2.getHeight();
                                    float f19 = width3 / f10;
                                    float f20 = height5 / f10;
                                    float sqrt = (float) Math.sqrt((f20 * f20) + (f19 * f19));
                                    float f21 = sqrt * f10;
                                    int i16 = (int) f21;
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i16, i16, config);
                                    Canvas canvas2 = new Canvas(createBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((efVar3.w ? 0 : photoViewer.C4.V) + photoViewer.b6, sqrt, sqrt);
                                    canvas2.drawBitmap(bitmap2, (f21 - width3) / f10, (f21 - height5) / f10, (Paint) null);
                                    bitmap2.recycle();
                                    float f22 = f17 / f10;
                                    float f23 = f18 / f10;
                                    f11 = ((float) Math.sqrt((f23 * f23) + (f22 * f22))) * f10;
                                    f13 = (-(f11 - f18)) / f10;
                                    f14 = (-(f11 - f17)) / f10;
                                    bitmap2 = createBitmap2;
                                    f12 = f11;
                                }
                                matrix3.postScale(f11, f12);
                                float f24 = photoViewer.a6;
                                matrix3.postScale(f24, f24, f11 / f10, f12 / f10);
                                matrix3.postTranslate(photoViewer.X5 + f14 + Math.max(0, (int) ((photoViewer.g1(photoViewer.u4) - f17) / f10)), photoViewer.Y5 + f13 + Math.max(0, (int) ((photoViewer.e1() - f18) / f10)));
                                photoViewer.p5.W = true;
                                Utilities.i.c(new sn0(photoViewer, b10, 3));
                                kn0 kn0Var = new kn0(photoViewer, 8);
                                lc0 lc0Var = new lc0(photoViewer, b10, kn0Var, 21);
                                cd0 cd0Var = new cd0(3);
                                lz0 lz0Var = thanosEffect.a;
                                if (lz0Var != null) {
                                    lz0Var.c(matrix3, bitmap2, lc0Var, cd0Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new mz0(matrix3, bitmap2, lc0Var, cd0Var));
                                }
                                org.telegram.messenger.g0.h3(kn0Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.p5.f();
                photoViewer.f0.invalidate();
                break;
            case 4:
                boolean z14 = this.b;
                String str2 = (String) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                Runnable runnable2 = (Runnable) obj;
                if (!z14) {
                    runnable2.run();
                    break;
                } else {
                    kv0.G3.c(i10.t0, str2, new b01(linkedHashSet, runnable2, 1));
                    break;
                }
            default:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.c;
                p10 p10Var = (p10) this.d;
                boolean z15 = this.b;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) obj;
                if (s0Var == null) {
                    Exception exc = v0Var.c.f;
                    String message = exc != null ? exc.getMessage() : null;
                    if (!"AUTH_CANCELED".equals(message)) {
                        org.telegram.ui.Wallet.v0.n("getSecretPhrase: local phrase unavailable: " + message);
                        p10Var.a(null, (message == null || !message.startsWith("AUTH_")) ? "LOCAL_STORAGE_ERROR" : "WALLET_UNLOCK_FAILED");
                        break;
                    } else {
                        org.telegram.ui.Wallet.v0.P("getSecretPhrase: unlock canceled");
                        if (z15) {
                            p10Var.a(null, "WALLET_SEND_CANCELLED");
                            break;
                        }
                    }
                } else {
                    p10Var.a(s0Var, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fc(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ fc(boolean z10, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
    }
}
