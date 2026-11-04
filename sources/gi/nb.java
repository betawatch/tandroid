package gi;

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
import org.telegram.messenger.h10;
import org.telegram.messenger.re;
import org.telegram.messenger.se;
import org.telegram.messenger.u10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yx;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hc0;
import org.telegram.ui.kn0;
import org.telegram.ui.rz0;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nb(Object obj, boolean z10, Object obj2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041b  */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i3;
        int i10;
        ug.z1[] z1VarArr;
        Bitmap bitmap;
        float f10;
        Bitmap bitmap2;
        float f11;
        float f12;
        float f13;
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.c;
                u10 u10Var = (u10) this.d;
                sb sbVar = (sb) obj;
                if (z10) {
                    s1Var.c(350L);
                }
                u10Var.a(sbVar);
                break;
            case 1:
                gl glVar = (gl) this.c;
                File file = (File) this.d;
                boolean z11 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = glVar.e;
                chatAttachAlertPhotoLayout.t0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.N1) {
                    ChatAttachAlertPhotoLayout.r1 = false;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                        i3 = options.outWidth;
                        try {
                            i10 = options.outHeight;
                        } catch (Exception unused) {
                            i10 = 0;
                            int i11 = i3;
                            int i12 = ChatAttachAlertPhotoLayout.v1;
                            ChatAttachAlertPhotoLayout.v1 = i12 - 1;
                            ye yeVar = new ye(i12, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i11, i10);
                            yeVar.L = true;
                            chatAttachAlertPhotoLayout.m0(yeVar, z11, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i3 = 0;
                    }
                    int i112 = i3;
                    int i122 = ChatAttachAlertPhotoLayout.v1;
                    ChatAttachAlertPhotoLayout.v1 = i122 - 1;
                    ye yeVar2 = new ye(i122, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i112, i10);
                    yeVar2.L = true;
                    chatAttachAlertPhotoLayout.m0(yeVar2, z11, false);
                }
                break;
            case 2:
                xx xxVar = (xx) this.c;
                boolean z12 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = xxVar.r;
                yx yxVar = xxVar.x;
                if (yxVar.N == xxVar.b) {
                    int i13 = 0;
                    if (z12) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        yxVar.E = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        xxVar.w.put(document.id, document);
                    }
                    xxVar.f.put(arrayList2, yxVar.O);
                    runnable.run();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z13 = this.b;
                se seVar = (se) this.d;
                ug.z1 z1Var = (ug.z1) obj;
                ug.c2 c2Var = photoViewer.q5;
                if (!c2Var.E || (z1VarArr = c2Var.I) == null || z1VarArr.length <= 0) {
                    photoViewer.u5.setCutOutState(true);
                    photoViewer.a3(false, true);
                } else {
                    cz0 thanosEffect = photoViewer.q5.getThanosEffect();
                    ug.c2 c2Var2 = photoViewer.q5;
                    c2Var2.M = true;
                    c2Var2.F = z1Var;
                    Bitmap n4 = photoViewer.D4.n();
                    int i14 = photoViewer.D4.V;
                    ug.z1 z1Var2 = c2Var2.F;
                    Bitmap b10 = z1Var2 == null ? c2Var2.J : (!z13 || n4 == null) ? z1Var2.b() : c2Var2.e(n4);
                    ye yeVar3 = (ye) photoViewer.h7.get(photoViewer.Q4);
                    if (thanosEffect == null) {
                        Utilities.i.c(new kn0(photoViewer, b10, 0));
                        photoViewer.q5.f();
                        photoViewer.f0.invalidate();
                        break;
                    } else {
                        ug.c2 c2Var3 = photoViewer.q5;
                        int i15 = photoViewer.D4.V;
                        c2Var3.getClass();
                        String str = yeVar3.i;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : c2Var3.getSourceBitmap();
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(yeVar3.j);
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
                        ug.z1 z1Var3 = c2Var3.F;
                        if (z1Var3 == null) {
                            ug.z1[] z1VarArr2 = c2Var3.I;
                            if (z1VarArr2.length > 0) {
                                z1Var3 = z1VarArr2[0];
                            }
                        }
                        if (z1Var3 == null) {
                            bitmap2 = null;
                            f10 = 2.0f;
                        } else {
                            if (z1Var3.c == 0 || !yeVar3.u) {
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
                                if (z1Var3.c == 0 || yeVar3.u) {
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
                            Utilities.i.c(new kn0(photoViewer, b10, 1));
                            photoViewer.q5.f();
                            photoViewer.f0.invalidate();
                            break;
                        } else {
                            re reVar = seVar.A;
                            if (reVar != null) {
                                ImageReceiver imageReceiver = photoViewer.D4;
                                bitmap2 = PhotoViewer.J0(bitmap2, reVar, new int[]{imageReceiver.V, imageReceiver.W}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.i.c(new kn0(photoViewer, b10, 2));
                                photoViewer.q5.f();
                                photoViewer.f0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmap2.getWidth();
                                int height4 = bitmap2.getHeight();
                                if (!yeVar3.w && (photoViewer.D4.V / 90) % 2 != 0) {
                                    width2 = bitmap2.getHeight();
                                    height4 = bitmap2.getWidth();
                                }
                                float f15 = width2;
                                float f16 = height4;
                                float min = Math.min(photoViewer.m1(photoViewer.v4) / f15, photoViewer.k1() / f16);
                                float f17 = f15 * min;
                                float f18 = f16 * min;
                                if ((photoViewer.D4.V == 0 || yeVar3.w) && photoViewer.c6 == 0.0f) {
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
                                    canvas2.rotate((yeVar3.w ? 0 : photoViewer.D4.V) + photoViewer.c6, sqrt, sqrt);
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
                                float f24 = photoViewer.b6;
                                matrix3.postScale(f24, f24, f11 / f10, f12 / f10);
                                matrix3.postTranslate(photoViewer.Y5 + f14 + Math.max(0, (int) ((photoViewer.m1(photoViewer.v4) - f17) / f10)), photoViewer.Z5 + f13 + Math.max(0, (int) ((photoViewer.k1() - f18) / f10)));
                                photoViewer.q5.W = true;
                                Utilities.i.c(new kn0(photoViewer, b10, 3));
                                xm0 xm0Var = new xm0(photoViewer, 13);
                                hc0 hc0Var = new hc0(photoViewer, b10, xm0Var, 20);
                                go goVar = new go(26);
                                az0 az0Var = thanosEffect.a;
                                if (az0Var != null) {
                                    az0Var.c(matrix3, bitmap2, hc0Var, goVar);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new bz0(matrix3, bitmap2, hc0Var, goVar));
                                }
                                org.telegram.messenger.g0.i3(xm0Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.q5.f();
                photoViewer.f0.invalidate();
                break;
            default:
                boolean z14 = this.b;
                String str2 = (String) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                Runnable runnable2 = (Runnable) obj;
                if (!z14) {
                    runnable2.run();
                    break;
                } else {
                    xu0.G3.c(h10.t0, str2, new rz0(linkedHashSet, runnable2, 1));
                    break;
                }
        }
    }

    public /* synthetic */ nb(gl glVar, File file, boolean z10) {
        this.a = 1;
        this.c = glVar;
        this.d = file;
        this.b = z10;
    }

    public /* synthetic */ nb(boolean z10, Object obj, Object obj2, int i3) {
        this.a = i3;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
    }
}
