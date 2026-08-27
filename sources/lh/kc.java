package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.el;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.ty;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bf0;
import org.telegram.ui.hq0;
import org.telegram.ui.k41;
import org.telegram.ui.sq0;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class kc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kc(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0433  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int i10;
        int i11;
        BitmapFactory.Options options;
        zf.k2[] k2VarArr;
        Bitmap bitmap;
        float f10;
        Bitmap bitmap2;
        float f11;
        float f12;
        float f13;
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                pc pcVar = (pc) obj;
                if (z10) {
                    b2Var.c(350L);
                }
                callback.run(pcVar);
                break;
            case 1:
                el elVar = (el) this.c;
                File file = (File) this.d;
                boolean z11 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = elVar.e;
                chatAttachAlertPhotoLayout.o0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.R) {
                    ChatAttachAlertPhotoLayout.m1 = false;
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                        i10 = options.outWidth;
                    } catch (Exception unused) {
                        i10 = 0;
                    }
                    try {
                        i11 = options.outHeight;
                    } catch (Exception unused2) {
                        i11 = 0;
                        int i12 = i10;
                        int i13 = ChatAttachAlertPhotoLayout.q1;
                        ChatAttachAlertPhotoLayout.q1 = i13 - 1;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i12, i11, 0L);
                        photoEntry.canDeleteAfter = true;
                        chatAttachAlertPhotoLayout.j0(photoEntry, z11, false);
                        return;
                    }
                    int i122 = i10;
                    int i132 = ChatAttachAlertPhotoLayout.q1;
                    ChatAttachAlertPhotoLayout.q1 = i132 - 1;
                    MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i132, 0L, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i122, i11, 0L);
                    photoEntry2.canDeleteAfter = true;
                    chatAttachAlertPhotoLayout.j0(photoEntry2, z11, false);
                }
                break;
            case 2:
                ry ryVar = (ry) this.c;
                boolean z12 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ryVar.r;
                ty tyVar = ryVar.w;
                if (tyVar.I == ryVar.b) {
                    int i14 = 0;
                    if (z12) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        tyVar.y = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        ryVar.v.put(document.id, document);
                    }
                    ryVar.f.put(arrayList2, tyVar.J);
                    runnable.run();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z13 = this.b;
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) this.d;
                zf.k2 k2Var = (zf.k2) obj;
                zf.n2 n2Var = photoViewer.l5;
                if (!n2Var.y || (k2VarArr = n2Var.D) == null || k2VarArr.length <= 0) {
                    photoViewer.p5.setCutOutState(true);
                    photoViewer.X2(false, true);
                } else {
                    f01 thanosEffect = photoViewer.l5.getThanosEffect();
                    zf.n2 n2Var2 = photoViewer.l5;
                    n2Var2.H = true;
                    n2Var2.A = k2Var;
                    Bitmap bitmap3 = photoViewer.y4.getBitmap();
                    photoViewer.y4.getOrientation();
                    zf.k2 k2Var2 = n2Var2.A;
                    Bitmap b10 = k2Var2 == null ? n2Var2.E : (!z13 || bitmap3 == null) ? k2Var2.b() : n2Var2.e(bitmap3);
                    MediaController.PhotoEntry photoEntry3 = (MediaController.PhotoEntry) photoViewer.c7.get(photoViewer.L4);
                    if (thanosEffect == null) {
                        Utilities.themeQueue.postRunnable(new sq0(photoViewer, b10, 0));
                        photoViewer.l5.f();
                        photoViewer.a0.invalidate();
                        break;
                    } else {
                        zf.n2 n2Var3 = photoViewer.l5;
                        photoViewer.y4.getOrientation();
                        n2Var3.getClass();
                        String str = photoEntry3.filterPath;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : n2Var3.getSourceBitmap();
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(photoEntry3.paintPath);
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
                        Bitmap bitmap4 = decodeFile;
                        rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
                        zf.k2 k2Var3 = n2Var3.A;
                        if (k2Var3 == null) {
                            zf.k2[] k2VarArr2 = n2Var3.D;
                            if (k2VarArr2.length > 0) {
                                k2Var3 = k2VarArr2[0];
                            }
                        }
                        if (k2Var3 == null) {
                            bitmap2 = null;
                            f10 = 2.0f;
                        } else {
                            if (k2Var3.c == 0 || !photoEntry3.isFiltered) {
                                bitmap = createBitmap;
                                f10 = 2.0f;
                                canvas.drawBitmap(k2Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f10 = 2.0f;
                                bitmap = createBitmap;
                                matrix.postRotate(k2Var3.c, k2Var3.a().getWidth() / 2.0f, k2Var3.a().getHeight() / 2.0f);
                                if ((k2Var3.c / 90) % 2 != 0) {
                                    float height2 = (k2Var3.a().getHeight() - k2Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap4.getWidth() / k2Var3.a().getHeight(), bitmap4.getHeight() / k2Var3.a().getWidth());
                                canvas.drawBitmap(k2Var3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (k2Var3.c == 0 || photoEntry3.isFiltered) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-k2Var3.c, decodeFile2.getWidth() / f10, decodeFile2.getHeight() / f10);
                                    if ((k2Var3.c / 90) % 2 != 0) {
                                        float height3 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / f10;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap4.getWidth() / decodeFile2.getHeight(), bitmap4.getHeight() / decodeFile2.getWidth());
                                    canvas.drawBitmap(decodeFile2, matrix2, paint);
                                }
                            }
                            bitmap2 = bitmap;
                        }
                        if (bitmap2 == null) {
                            Utilities.themeQueue.postRunnable(new sq0(photoViewer, b10, 1));
                            photoViewer.l5.f();
                            photoViewer.a0.invalidate();
                            break;
                        } else {
                            MediaController.CropState cropState = mediaEditState.cropState;
                            if (cropState != null) {
                                bitmap2 = PhotoViewer.I0(bitmap2, cropState, new int[]{photoViewer.y4.getOrientation(), photoViewer.y4.getInvert()}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.themeQueue.postRunnable(new sq0(photoViewer, b10, 2));
                                photoViewer.l5.f();
                                photoViewer.a0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmap2.getWidth();
                                int height4 = bitmap2.getHeight();
                                if (!photoEntry3.isCropped && (photoViewer.y4.getOrientation() / 90) % 2 != 0) {
                                    width2 = bitmap2.getHeight();
                                    height4 = bitmap2.getWidth();
                                }
                                float f15 = width2;
                                float f16 = height4;
                                float min = Math.min(photoViewer.k1(photoViewer.q4) / f15, photoViewer.i1() / f16);
                                float f17 = f15 * min;
                                float f18 = f16 * min;
                                if ((photoViewer.y4.getOrientation() == 0 || photoEntry3.isCropped) && photoViewer.X5 == 0.0f) {
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
                                    int i15 = (int) f21;
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i15, i15, config);
                                    Canvas canvas2 = new Canvas(createBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((photoEntry3.isCropped ? 0 : photoViewer.y4.getOrientation()) + photoViewer.X5, sqrt, sqrt);
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
                                float f24 = photoViewer.W5;
                                matrix3.postScale(f24, f24, f11 / f10, f12 / f10);
                                matrix3.postTranslate(photoViewer.T5 + f14 + Math.max(0, (int) ((photoViewer.k1(photoViewer.q4) - f17) / f10)), photoViewer.U5 + f13 + Math.max(0, (int) ((photoViewer.i1() - f18) / f10)));
                                photoViewer.l5.R = true;
                                Utilities.themeQueue.postRunnable(new sq0(photoViewer, b10, 3));
                                hq0 hq0Var = new hq0(photoViewer, 13);
                                bf0 bf0Var = new bf0(photoViewer, b10, hq0Var, 18);
                                tq0 tq0Var = new tq0(0);
                                d01 d01Var = thanosEffect.a;
                                if (d01Var != null) {
                                    d01Var.c(matrix3, bitmap2, bf0Var, tq0Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new e01(matrix3, bitmap2, bf0Var, tq0Var));
                                }
                                AndroidUtilities.runOnUIThread(hq0Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.l5.f();
                photoViewer.a0.invalidate();
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
                    gw0.u3.fetch(UserConfig.selectedAccount, str2, new k41(linkedHashSet, runnable2, 1));
                    break;
                }
        }
    }

    public /* synthetic */ kc(el elVar, File file, boolean z10) {
        this.a = 1;
        this.c = elVar;
        this.d = file;
        this.b = z10;
    }

    public /* synthetic */ kc(boolean z10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
    }
}
