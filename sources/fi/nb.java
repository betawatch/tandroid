package fi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.gf;
import org.telegram.messenger.p10;
import org.telegram.messenger.ye;
import org.telegram.messenger.ze;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a01;
import org.telegram.ui.cn0;
import org.telegram.ui.mc0;
import org.telegram.ui.pn0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nb(Object obj, boolean z9, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041b  */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i7;
        int i10;
        tg.z1[] z1VarArr;
        Bitmap bitmap;
        float f10;
        Bitmap bitmap2;
        float f11;
        float f12;
        float f13;
        switch (this.a) {
            case 0:
                boolean z9 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                c20 c20Var = (c20) this.d;
                sb sbVar = (sb) obj;
                if (z9) {
                    u1Var.c(350L);
                }
                c20Var.a(sbVar);
                break;
            case 1:
                hl hlVar = (hl) this.c;
                File file = (File) this.d;
                boolean z10 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hlVar.e;
                chatAttachAlertPhotoLayout.s0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.M1) {
                    ChatAttachAlertPhotoLayout.q1 = false;
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
                            int i12 = ChatAttachAlertPhotoLayout.u1;
                            ChatAttachAlertPhotoLayout.u1 = i12 - 1;
                            gf gfVar = new gf(i12, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i11, i10);
                            gfVar.L = true;
                            chatAttachAlertPhotoLayout.m0(gfVar, z10, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i7 = 0;
                    }
                    int i112 = i7;
                    int i122 = ChatAttachAlertPhotoLayout.u1;
                    ChatAttachAlertPhotoLayout.u1 = i122 - 1;
                    gf gfVar2 = new gf(i122, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i112, i10);
                    gfVar2.L = true;
                    chatAttachAlertPhotoLayout.m0(gfVar2, z10, false);
                }
                break;
            case 2:
                ay ayVar = (ay) this.c;
                boolean z11 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ayVar.r;
                cy cyVar = ayVar.x;
                if (cyVar.M == ayVar.b) {
                    int i13 = 0;
                    if (z11) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        cyVar.D = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        ayVar.w.put(document.id, document);
                    }
                    ayVar.f.put(arrayList2, cyVar.N);
                    runnable.run();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z12 = this.b;
                ze zeVar = (ze) this.d;
                tg.z1 z1Var = (tg.z1) obj;
                tg.c2 c2Var = photoViewer.o5;
                if (!c2Var.D || (z1VarArr = c2Var.H) == null || z1VarArr.length <= 0) {
                    photoViewer.s5.setCutOutState(true);
                    photoViewer.U2(false, true);
                } else {
                    dz0 thanosEffect = photoViewer.o5.getThanosEffect();
                    tg.c2 c2Var2 = photoViewer.o5;
                    c2Var2.L = true;
                    c2Var2.E = z1Var;
                    Bitmap n10 = photoViewer.B4.n();
                    int i14 = photoViewer.B4.U;
                    tg.z1 z1Var2 = c2Var2.E;
                    Bitmap b10 = z1Var2 == null ? c2Var2.I : (!z12 || n10 == null) ? z1Var2.b() : c2Var2.e(n10);
                    gf gfVar3 = (gf) photoViewer.f7.get(photoViewer.O4);
                    if (thanosEffect == null) {
                        Utilities.i.c(new pn0(photoViewer, b10, 0));
                        photoViewer.o5.f();
                        photoViewer.e0.invalidate();
                        break;
                    } else {
                        tg.c2 c2Var3 = photoViewer.o5;
                        int i15 = photoViewer.B4.U;
                        c2Var3.getClass();
                        String str = gfVar3.i;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : c2Var3.getSourceBitmap();
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(gfVar3.j);
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
                        tg.z1 z1Var3 = c2Var3.E;
                        if (z1Var3 == null) {
                            tg.z1[] z1VarArr2 = c2Var3.H;
                            if (z1VarArr2.length > 0) {
                                z1Var3 = z1VarArr2[0];
                            }
                        }
                        if (z1Var3 == null) {
                            bitmap2 = null;
                            f10 = 2.0f;
                        } else {
                            if (z1Var3.c == 0 || !gfVar3.u) {
                                bitmap = createBitmap;
                                f10 = 2.0f;
                                canvas.drawBitmap(z1Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f10 = 2.0f;
                                bitmap = createBitmap;
                                matrix.postRotate(z1Var3.c, z1Var3.a().getWidth() / 2.0f, z1Var3.a().getHeight() / 2.0f);
                                if ((z1Var3.c / 90) % 2 != 0) {
                                    float height2 = (z1Var3.a().getHeight() - z1Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap3.getWidth() / z1Var3.a().getHeight(), bitmap3.getHeight() / z1Var3.a().getWidth());
                                canvas.drawBitmap(z1Var3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (z1Var3.c == 0 || gfVar3.u) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-z1Var3.c, decodeFile2.getWidth() / f10, decodeFile2.getHeight() / f10);
                                    if ((z1Var3.c / 90) % 2 != 0) {
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
                            Utilities.i.c(new pn0(photoViewer, b10, 1));
                            photoViewer.o5.f();
                            photoViewer.e0.invalidate();
                            break;
                        } else {
                            ye yeVar = zeVar.A;
                            if (yeVar != null) {
                                ImageReceiver imageReceiver = photoViewer.B4;
                                bitmap2 = PhotoViewer.C0(bitmap2, yeVar, new int[]{imageReceiver.U, imageReceiver.V}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.i.c(new pn0(photoViewer, b10, 2));
                                photoViewer.o5.f();
                                photoViewer.e0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmap2.getWidth();
                                int height4 = bitmap2.getHeight();
                                if (!gfVar3.w && (photoViewer.B4.U / 90) % 2 != 0) {
                                    width2 = bitmap2.getHeight();
                                    height4 = bitmap2.getWidth();
                                }
                                float f15 = width2;
                                float f16 = height4;
                                float min = Math.min(photoViewer.g1(photoViewer.t4) / f15, photoViewer.e1() / f16);
                                float f17 = f15 * min;
                                float f18 = f16 * min;
                                if ((photoViewer.B4.U == 0 || gfVar3.w) && photoViewer.a6 == 0.0f) {
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
                                    canvas2.rotate((gfVar3.w ? 0 : photoViewer.B4.U) + photoViewer.a6, sqrt, sqrt);
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
                                float f24 = photoViewer.Z5;
                                matrix3.postScale(f24, f24, f11 / f10, f12 / f10);
                                matrix3.postTranslate(photoViewer.W5 + f14 + Math.max(0, (int) ((photoViewer.g1(photoViewer.t4) - f17) / f10)), photoViewer.X5 + f13 + Math.max(0, (int) ((photoViewer.e1() - f18) / f10)));
                                photoViewer.o5.V = true;
                                Utilities.i.c(new pn0(photoViewer, b10, 3));
                                cn0 cn0Var = new cn0(photoViewer, 14);
                                mc0 mc0Var = new mc0(photoViewer, b10, cn0Var, 19);
                                vs vsVar = new vs(27);
                                bz0 bz0Var = thanosEffect.a;
                                if (bz0Var != null) {
                                    bz0Var.c(matrix3, bitmap2, mc0Var, vsVar);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new cz0(matrix3, bitmap2, mc0Var, vsVar));
                                }
                                org.telegram.messenger.g0.i3(cn0Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.o5.f();
                photoViewer.e0.invalidate();
                break;
            default:
                boolean z13 = this.b;
                String str2 = (String) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                Runnable runnable2 = (Runnable) obj;
                if (!z13) {
                    runnable2.run();
                    break;
                } else {
                    yu0.F3.c(p10.s0, str2, new a01(linkedHashSet, runnable2, 1));
                    break;
                }
        }
    }

    public /* synthetic */ nb(hl hlVar, File file, boolean z9) {
        this.a = 1;
        this.c = hlVar;
        this.d = file;
        this.b = z9;
    }

    public /* synthetic */ nb(boolean z9, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = z9;
        this.c = obj;
        this.d = obj2;
    }
}
