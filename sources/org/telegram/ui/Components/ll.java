package org.telegram.ui.Components;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ll(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0434  */
    @Override // org.telegram.messenger.q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i10;
        int i11;
        jg.s2[] s2VarArr;
        Bitmap bitmap;
        float f7;
        Bitmap bitmap2;
        float f10;
        float f11;
        float f12;
        switch (this.a) {
            case 0:
                nl nlVar = (nl) this.c;
                File file = (File) this.d;
                boolean z10 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.e;
                chatAttachAlertPhotoLayout.s0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.M1) {
                    ChatAttachAlertPhotoLayout.q1 = false;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                        i10 = options.outWidth;
                        try {
                            i11 = options.outHeight;
                        } catch (Exception unused) {
                            i11 = 0;
                            int i12 = i10;
                            int i13 = ChatAttachAlertPhotoLayout.u1;
                            ChatAttachAlertPhotoLayout.u1 = i13 - 1;
                            org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(i13, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i12, i11);
                            efVar.L = true;
                            chatAttachAlertPhotoLayout.k0(efVar, z10, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i10 = 0;
                    }
                    int i122 = i10;
                    int i132 = ChatAttachAlertPhotoLayout.u1;
                    ChatAttachAlertPhotoLayout.u1 = i132 - 1;
                    org.telegram.messenger.ef efVar2 = new org.telegram.messenger.ef(i132, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i122, i11);
                    efVar2.L = true;
                    chatAttachAlertPhotoLayout.k0(efVar2, z10, false);
                }
                break;
            case 1:
                py pyVar = (py) this.c;
                boolean z11 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = pyVar.r;
                qy qyVar = pyVar.x;
                if (qyVar.M == pyVar.b) {
                    int i14 = 0;
                    if (z11) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        qyVar.D = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        pyVar.w.put(document.id, document);
                    }
                    pyVar.f.put(arrayList2, qyVar.N);
                    runnable.run();
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z12 = this.b;
                org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) this.d;
                jg.s2 s2Var = (jg.s2) obj;
                jg.v2 v2Var = photoViewer.p5;
                if (!v2Var.D || (s2VarArr = v2Var.H) == null || s2VarArr.length <= 0) {
                    photoViewer.t5.setCutOutState(true);
                    photoViewer.a3(false, true);
                } else {
                    h01 thanosEffect = photoViewer.p5.getThanosEffect();
                    jg.v2 v2Var2 = photoViewer.p5;
                    v2Var2.L = true;
                    v2Var2.E = s2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i15 = photoViewer.C4.U;
                    jg.s2 s2Var2 = v2Var2.E;
                    Bitmap b10 = s2Var2 == null ? v2Var2.I : (!z12 || n10 == null) ? s2Var2.b() : v2Var2.e(n10);
                    org.telegram.messenger.ef efVar3 = (org.telegram.messenger.ef) photoViewer.g7.get(photoViewer.P4);
                    if (thanosEffect == null) {
                        Utilities.i.c(new org.telegram.ui.bp0(photoViewer, b10, 0));
                        photoViewer.p5.f();
                        photoViewer.e0.invalidate();
                        break;
                    } else {
                        jg.v2 v2Var3 = photoViewer.p5;
                        int i16 = photoViewer.C4.U;
                        v2Var3.getClass();
                        String str = efVar3.i;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : v2Var3.getSourceBitmap();
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
                        float f13 = 0.0f;
                        Bitmap bitmap3 = decodeFile;
                        rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
                        jg.s2 s2Var3 = v2Var3.E;
                        if (s2Var3 == null) {
                            jg.s2[] s2VarArr2 = v2Var3.H;
                            if (s2VarArr2.length > 0) {
                                s2Var3 = s2VarArr2[0];
                            }
                        }
                        if (s2Var3 == null) {
                            bitmap2 = null;
                            f7 = 2.0f;
                        } else {
                            if (s2Var3.c == 0 || !efVar3.u) {
                                bitmap = createBitmap;
                                f7 = 2.0f;
                                canvas.drawBitmap(s2Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f7 = 2.0f;
                                bitmap = createBitmap;
                                matrix.postRotate(s2Var3.c, s2Var3.a().getWidth() / 2.0f, s2Var3.a().getHeight() / 2.0f);
                                if ((s2Var3.c / 90) % 2 != 0) {
                                    float height2 = (s2Var3.a().getHeight() - s2Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap3.getWidth() / s2Var3.a().getHeight(), bitmap3.getHeight() / s2Var3.a().getWidth());
                                canvas.drawBitmap(s2Var3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (s2Var3.c == 0 || efVar3.u) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-s2Var3.c, decodeFile2.getWidth() / f7, decodeFile2.getHeight() / f7);
                                    if ((s2Var3.c / 90) % 2 != 0) {
                                        float height3 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / f7;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap3.getWidth() / decodeFile2.getHeight(), bitmap3.getHeight() / decodeFile2.getWidth());
                                    canvas.drawBitmap(decodeFile2, matrix2, paint);
                                }
                            }
                            bitmap2 = bitmap;
                        }
                        if (bitmap2 == null) {
                            Utilities.i.c(new org.telegram.ui.bp0(photoViewer, b10, 1));
                            photoViewer.p5.f();
                            photoViewer.e0.invalidate();
                            break;
                        } else {
                            org.telegram.messenger.ye yeVar = zeVar.A;
                            if (yeVar != null) {
                                ImageReceiver imageReceiver = photoViewer.C4;
                                bitmap2 = PhotoViewer.J0(bitmap2, yeVar, new int[]{imageReceiver.U, imageReceiver.V}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.i.c(new org.telegram.ui.bp0(photoViewer, b10, 2));
                                photoViewer.p5.f();
                                photoViewer.e0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmap2.getWidth();
                                int height4 = bitmap2.getHeight();
                                if (!efVar3.w && (photoViewer.C4.U / 90) % 2 != 0) {
                                    width2 = bitmap2.getHeight();
                                    height4 = bitmap2.getWidth();
                                }
                                float f14 = width2;
                                float f15 = height4;
                                float min = Math.min(photoViewer.m1(photoViewer.u4) / f14, photoViewer.k1() / f15);
                                float f16 = f14 * min;
                                float f17 = f15 * min;
                                if ((photoViewer.C4.U == 0 || efVar3.w) && photoViewer.b6 == 0.0f) {
                                    f10 = f16;
                                    f11 = f17;
                                    f12 = 0.0f;
                                } else {
                                    float width3 = bitmap2.getWidth();
                                    float height5 = bitmap2.getHeight();
                                    float f18 = width3 / f7;
                                    float f19 = height5 / f7;
                                    float sqrt = (float) Math.sqrt((f19 * f19) + (f18 * f18));
                                    float f20 = sqrt * f7;
                                    int i17 = (int) f20;
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i17, i17, config);
                                    Canvas canvas2 = new Canvas(createBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((efVar3.w ? 0 : photoViewer.C4.U) + photoViewer.b6, sqrt, sqrt);
                                    canvas2.drawBitmap(bitmap2, (f20 - width3) / f7, (f20 - height5) / f7, (Paint) null);
                                    bitmap2.recycle();
                                    float f21 = f16 / f7;
                                    float f22 = f17 / f7;
                                    f10 = ((float) Math.sqrt((f22 * f22) + (f21 * f21))) * f7;
                                    f12 = (-(f10 - f17)) / f7;
                                    f13 = (-(f10 - f16)) / f7;
                                    bitmap2 = createBitmap2;
                                    f11 = f10;
                                }
                                matrix3.postScale(f10, f11);
                                float f23 = photoViewer.a6;
                                matrix3.postScale(f23, f23, f10 / f7, f11 / f7);
                                matrix3.postTranslate(photoViewer.X5 + f13 + Math.max(0, (int) ((photoViewer.m1(photoViewer.u4) - f16) / f7)), photoViewer.Y5 + f12 + Math.max(0, (int) ((photoViewer.k1() - f17) / f7)));
                                photoViewer.p5.V = true;
                                Utilities.i.c(new org.telegram.ui.bp0(photoViewer, b10, 3));
                                org.telegram.ui.qo0 qo0Var = new org.telegram.ui.qo0(photoViewer, 13);
                                org.telegram.ui.qd0 qd0Var = new org.telegram.ui.qd0(photoViewer, b10, qo0Var, 21);
                                org.telegram.ui.Components.voip.m0 m0Var = new org.telegram.ui.Components.voip.m0(13);
                                f01 f01Var = thanosEffect.a;
                                if (f01Var != null) {
                                    f01Var.c(matrix3, bitmap2, qd0Var, m0Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new g01(matrix3, bitmap2, qd0Var, m0Var));
                                }
                                org.telegram.messenger.i0.h3(qo0Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.p5.f();
                photoViewer.e0.invalidate();
                break;
            case 3:
                boolean z13 = this.b;
                String str2 = (String) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                Runnable runnable2 = (Runnable) obj;
                if (!z13) {
                    runnable2.run();
                    break;
                } else {
                    bw0.F3.c(org.telegram.messenger.d20.s0, str2, new org.telegram.ui.r11(linkedHashSet, runnable2, 1));
                    break;
                }
            default:
                boolean z14 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.d;
                vh.k9 k9Var = (vh.k9) obj;
                if (z14) {
                    x1Var.c(350L);
                }
                q20Var.a(k9Var);
                break;
        }
    }

    public /* synthetic */ ll(nl nlVar, File file, boolean z10) {
        this.a = 0;
        this.c = nlVar;
        this.d = file;
        this.b = z10;
    }

    public /* synthetic */ ll(boolean z10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
    }
}
