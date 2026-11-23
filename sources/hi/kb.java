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
import org.telegram.messenger.ff;
import org.telegram.messenger.k10;
import org.telegram.messenger.r10;
import org.telegram.messenger.xe;
import org.telegram.messenger.y10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cd0;
import org.telegram.ui.d01;
import org.telegram.ui.hn0;
import org.telegram.ui.mc0;
import org.telegram.ui.un0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class kb implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kb(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0474  */
    @Override // org.telegram.messenger.y10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i7;
        int i10;
        tg.c2[] c2VarArr;
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
                y10 y10Var = (y10) this.d;
                pb pbVar = (pb) obj;
                if (z10) {
                    t1Var.c(350L);
                }
                y10Var.a(pbVar);
                break;
            case 1:
                xl xlVar = (xl) this.c;
                File file = (File) this.d;
                boolean z11 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.e;
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
                            ff ffVar = new ff(i12, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i11, i10);
                            ffVar.L = true;
                            chatAttachAlertPhotoLayout.m0(ffVar, z11, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i7 = 0;
                    }
                    int i112 = i7;
                    int i122 = ChatAttachAlertPhotoLayout.v1;
                    ChatAttachAlertPhotoLayout.v1 = i122 - 1;
                    ff ffVar2 = new ff(i122, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i112, i10);
                    ffVar2.L = true;
                    chatAttachAlertPhotoLayout.m0(ffVar2, z11, false);
                }
                break;
            case 2:
                ny nyVar = (ny) this.c;
                boolean z12 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = nyVar.r;
                oy oyVar = nyVar.x;
                if (oyVar.N == nyVar.b) {
                    int i13 = 0;
                    if (z12) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        oyVar.E = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        nyVar.w.put(document.id, document);
                    }
                    nyVar.f.put(arrayList2, oyVar.O);
                    runnable.run();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z13 = this.b;
                ye yeVar = (ye) this.d;
                tg.c2 c2Var = (tg.c2) obj;
                tg.f2 f2Var = photoViewer.p5;
                if (!f2Var.E || (c2VarArr = f2Var.I) == null || c2VarArr.length <= 0) {
                    photoViewer.t5.setCutOutState(true);
                    photoViewer.V2(false, true);
                } else {
                    oz0 thanosEffect = photoViewer.p5.getThanosEffect();
                    tg.f2 f2Var2 = photoViewer.p5;
                    f2Var2.M = true;
                    f2Var2.F = c2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i14 = photoViewer.C4.V;
                    tg.c2 c2Var2 = f2Var2.F;
                    Bitmap b10 = c2Var2 == null ? f2Var2.J : (!z13 || n10 == null) ? c2Var2.b() : f2Var2.e(n10);
                    ff ffVar3 = (ff) photoViewer.g7.get(photoViewer.P4);
                    if (thanosEffect == null) {
                        Utilities.i.c(new un0(photoViewer, b10, 0));
                        photoViewer.p5.f();
                        photoViewer.f0.invalidate();
                        break;
                    } else {
                        tg.f2 f2Var3 = photoViewer.p5;
                        int i15 = photoViewer.C4.V;
                        f2Var3.getClass();
                        String str = ffVar3.i;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : f2Var3.getSourceBitmap();
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(ffVar3.j);
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
                        tg.c2 c2Var3 = f2Var3.F;
                        if (c2Var3 == null) {
                            tg.c2[] c2VarArr2 = f2Var3.I;
                            if (c2VarArr2.length > 0) {
                                c2Var3 = c2VarArr2[0];
                            }
                        }
                        if (c2Var3 == null) {
                            bitmap2 = null;
                            f10 = 2.0f;
                        } else {
                            if (c2Var3.c == 0 || !ffVar3.u) {
                                bitmap = createBitmap;
                                f10 = 2.0f;
                                canvas.drawBitmap(c2Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f10 = 2.0f;
                                bitmap = createBitmap;
                                matrix.postRotate(c2Var3.c, c2Var3.a().getWidth() / 2.0f, c2Var3.a().getHeight() / 2.0f);
                                if ((c2Var3.c / 90) % 2 != 0) {
                                    float height2 = (c2Var3.a().getHeight() - c2Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap3.getWidth() / c2Var3.a().getHeight(), bitmap3.getHeight() / c2Var3.a().getWidth());
                                canvas.drawBitmap(c2Var3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (c2Var3.c == 0 || ffVar3.u) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-c2Var3.c, decodeFile2.getWidth() / f10, decodeFile2.getHeight() / f10);
                                    if ((c2Var3.c / 90) % 2 != 0) {
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
                            Utilities.i.c(new un0(photoViewer, b10, 1));
                            photoViewer.p5.f();
                            photoViewer.f0.invalidate();
                            break;
                        } else {
                            xe xeVar = yeVar.A;
                            if (xeVar != null) {
                                ImageReceiver imageReceiver = photoViewer.C4;
                                bitmap2 = PhotoViewer.C0(bitmap2, xeVar, new int[]{imageReceiver.V, imageReceiver.W}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.i.c(new un0(photoViewer, b10, 2));
                                photoViewer.p5.f();
                                photoViewer.f0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmap2.getWidth();
                                int height4 = bitmap2.getHeight();
                                if (!ffVar3.w && (photoViewer.C4.V / 90) % 2 != 0) {
                                    width2 = bitmap2.getHeight();
                                    height4 = bitmap2.getWidth();
                                }
                                float f15 = width2;
                                float f16 = height4;
                                float min = Math.min(photoViewer.g1(photoViewer.u4) / f15, photoViewer.e1() / f16);
                                float f17 = f15 * min;
                                float f18 = f16 * min;
                                if ((photoViewer.C4.V == 0 || ffVar3.w) && photoViewer.b6 == 0.0f) {
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
                                    canvas2.rotate((ffVar3.w ? 0 : photoViewer.C4.V) + photoViewer.b6, sqrt, sqrt);
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
                                Utilities.i.c(new un0(photoViewer, b10, 3));
                                hn0 hn0Var = new hn0(photoViewer, 14);
                                mc0 mc0Var = new mc0(photoViewer, b10, hn0Var, 19);
                                cd0 cd0Var = new cd0(3);
                                mz0 mz0Var = thanosEffect.a;
                                if (mz0Var != null) {
                                    mz0Var.c(matrix3, bitmap2, mc0Var, cd0Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new nz0(matrix3, bitmap2, mc0Var, cd0Var));
                                }
                                org.telegram.messenger.g0.h3(hn0Var, 1200L);
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
                    lv0.G3.c(k10.t0, str2, new d01(linkedHashSet, runnable2, 1));
                    break;
                }
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.c;
                r10 r10Var = (r10) this.d;
                boolean z15 = this.b;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj;
                if (r0Var == null) {
                    Exception exc = u0Var.c.f;
                    String message = exc != null ? exc.getMessage() : null;
                    if (!"AUTH_CANCELED".equals(message)) {
                        org.telegram.ui.Wallet.u0.n("getSecretPhrase: local phrase unavailable: " + message);
                        r10Var.a(null, (message == null || !message.startsWith("AUTH_")) ? "LOCAL_STORAGE_ERROR" : "WALLET_UNLOCK_FAILED");
                        break;
                    } else {
                        org.telegram.ui.Wallet.u0.P("getSecretPhrase: unlock canceled");
                        if (z15) {
                            r10Var.a(null, "WALLET_SEND_CANCELLED");
                            break;
                        }
                    }
                } else {
                    r10Var.a(r0Var, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kb(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ kb(boolean z10, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
    }
}
