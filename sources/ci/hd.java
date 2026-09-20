package ci;

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
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.jr0;
import org.telegram.ui.rf0;
import org.telegram.ui.t51;
import org.telegram.ui.ur0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class hd implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hd(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0434  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int i10;
        int i11;
        BitmapFactory.Options options;
        qg.k2[] k2VarArr;
        Bitmap bitmap;
        float f7;
        Bitmap bitmap2;
        float f10;
        float f11;
        float f12;
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                nd ndVar = (nd) obj;
                if (z10) {
                    b2Var.c(350L);
                }
                callback.run(ndVar);
                break;
            case 1:
                rl rlVar = (rl) this.c;
                File file = (File) this.d;
                boolean z11 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.e;
                chatAttachAlertPhotoLayout.s0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.V) {
                    ChatAttachAlertPhotoLayout.q1 = false;
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
                        int i13 = ChatAttachAlertPhotoLayout.u1;
                        ChatAttachAlertPhotoLayout.u1 = i13 - 1;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i12, i11, 0L);
                        photoEntry.canDeleteAfter = true;
                        chatAttachAlertPhotoLayout.j0(photoEntry, z11, false);
                        return;
                    }
                    int i122 = i10;
                    int i132 = ChatAttachAlertPhotoLayout.u1;
                    ChatAttachAlertPhotoLayout.u1 = i132 - 1;
                    MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i132, 0L, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i122, i11, 0L);
                    photoEntry2.canDeleteAfter = true;
                    chatAttachAlertPhotoLayout.j0(photoEntry2, z11, false);
                }
                break;
            case 2:
                dz dzVar = (dz) this.c;
                boolean z12 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = dzVar.r;
                fz fzVar = dzVar.w;
                if (fzVar.M == dzVar.b) {
                    int i14 = 0;
                    if (z12) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        fzVar.y = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        dzVar.v.put(document.id, document);
                    }
                    dzVar.f.put(arrayList2, fzVar.N);
                    runnable.run();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z13 = this.b;
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) this.d;
                qg.k2 k2Var = (qg.k2) obj;
                qg.n2 n2Var = photoViewer.p5;
                if (!n2Var.y || (k2VarArr = n2Var.H) == null || k2VarArr.length <= 0) {
                    photoViewer.t5.setCutOutState(true);
                    photoViewer.W2(false, true);
                } else {
                    l11 thanosEffect = photoViewer.p5.getThanosEffect();
                    qg.n2 n2Var2 = photoViewer.p5;
                    n2Var2.L = true;
                    n2Var2.E = k2Var;
                    Bitmap bitmap3 = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    qg.k2 k2Var2 = n2Var2.E;
                    Bitmap b10 = k2Var2 == null ? n2Var2.I : (!z13 || bitmap3 == null) ? k2Var2.b() : n2Var2.e(bitmap3);
                    MediaController.PhotoEntry photoEntry3 = (MediaController.PhotoEntry) photoViewer.g7.get(photoViewer.P4);
                    if (thanosEffect == null) {
                        Utilities.themeQueue.postRunnable(new ur0(photoViewer, b10, 0));
                        photoViewer.p5.f();
                        photoViewer.e0.invalidate();
                        break;
                    } else {
                        qg.n2 n2Var3 = photoViewer.p5;
                        photoViewer.C4.getOrientation();
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
                        float f13 = 0.0f;
                        Bitmap bitmap4 = decodeFile;
                        rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
                        qg.k2 k2Var3 = n2Var3.E;
                        if (k2Var3 == null) {
                            qg.k2[] k2VarArr2 = n2Var3.H;
                            if (k2VarArr2.length > 0) {
                                k2Var3 = k2VarArr2[0];
                            }
                        }
                        if (k2Var3 == null) {
                            bitmap2 = null;
                            f7 = 2.0f;
                        } else {
                            if (k2Var3.c == 0 || !photoEntry3.isFiltered) {
                                bitmap = createBitmap;
                                f7 = 2.0f;
                                canvas.drawBitmap(k2Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f7 = 2.0f;
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
                                    matrix2.postRotate(-k2Var3.c, decodeFile2.getWidth() / f7, decodeFile2.getHeight() / f7);
                                    if ((k2Var3.c / 90) % 2 != 0) {
                                        float height3 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / f7;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap4.getWidth() / decodeFile2.getHeight(), bitmap4.getHeight() / decodeFile2.getWidth());
                                    canvas.drawBitmap(decodeFile2, matrix2, paint);
                                }
                            }
                            bitmap2 = bitmap;
                        }
                        if (bitmap2 == null) {
                            Utilities.themeQueue.postRunnable(new ur0(photoViewer, b10, 1));
                            photoViewer.p5.f();
                            photoViewer.e0.invalidate();
                            break;
                        } else {
                            MediaController.CropState cropState = mediaEditState.cropState;
                            if (cropState != null) {
                                bitmap2 = PhotoViewer.I0(bitmap2, cropState, new int[]{photoViewer.C4.getOrientation(), photoViewer.C4.getInvert()}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.themeQueue.postRunnable(new ur0(photoViewer, b10, 2));
                                photoViewer.p5.f();
                                photoViewer.e0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmap2.getWidth();
                                int height4 = bitmap2.getHeight();
                                if (!photoEntry3.isCropped && (photoViewer.C4.getOrientation() / 90) % 2 != 0) {
                                    width2 = bitmap2.getHeight();
                                    height4 = bitmap2.getWidth();
                                }
                                float f14 = width2;
                                float f15 = height4;
                                float min = Math.min(photoViewer.k1(photoViewer.u4) / f14, photoViewer.i1() / f15);
                                float f16 = f14 * min;
                                float f17 = f15 * min;
                                if ((photoViewer.C4.getOrientation() == 0 || photoEntry3.isCropped) && photoViewer.b6 == 0.0f) {
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
                                    int i15 = (int) f20;
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i15, i15, config);
                                    Canvas canvas2 = new Canvas(createBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((photoEntry3.isCropped ? 0 : photoViewer.C4.getOrientation()) + photoViewer.b6, sqrt, sqrt);
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
                                matrix3.postTranslate(photoViewer.X5 + f13 + Math.max(0, (int) ((photoViewer.k1(photoViewer.u4) - f16) / f7)), photoViewer.Y5 + f12 + Math.max(0, (int) ((photoViewer.i1() - f17) / f7)));
                                photoViewer.p5.V = true;
                                Utilities.themeQueue.postRunnable(new ur0(photoViewer, b10, 3));
                                jr0 jr0Var = new jr0(photoViewer, 13);
                                rf0 rf0Var = new rf0(photoViewer, b10, jr0Var, 18);
                                sh shVar = new sh(28);
                                j11 j11Var = thanosEffect.a;
                                if (j11Var != null) {
                                    j11Var.c(matrix3, bitmap2, rf0Var, shVar);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new k11(matrix3, bitmap2, rf0Var, shVar));
                                }
                                AndroidUtilities.runOnUIThread(jr0Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.p5.f();
                photoViewer.e0.invalidate();
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
                    hx0.y3.fetch(UserConfig.selectedAccount, str2, new t51(linkedHashSet, runnable2, 1));
                    break;
                }
        }
    }

    public /* synthetic */ hd(rl rlVar, File file, boolean z10) {
        this.a = 1;
        this.c = rlVar;
        this.d = file;
        this.b = z10;
    }

    public /* synthetic */ hd(boolean z10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
    }
}
