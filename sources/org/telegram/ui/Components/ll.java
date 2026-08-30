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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ll(Object obj, boolean z4, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x044d  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int i10;
        int i11;
        BitmapFactory.Options options;
        dg.n3[] n3VarArr;
        Bitmap bitmap;
        float f10;
        Bitmap bitmap2;
        float f11;
        float f12;
        float f13;
        switch (this.a) {
            case 0:
                nl nlVar = (nl) this.c;
                File file = (File) this.d;
                boolean z4 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.e;
                chatAttachAlertPhotoLayout.p0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.S) {
                    ChatAttachAlertPhotoLayout.n1 = false;
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
                        int i13 = ChatAttachAlertPhotoLayout.r1;
                        ChatAttachAlertPhotoLayout.r1 = i13 - 1;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i12, i11, 0L);
                        photoEntry.canDeleteAfter = true;
                        chatAttachAlertPhotoLayout.j0(photoEntry, z4, false);
                        return;
                    }
                    int i122 = i10;
                    int i132 = ChatAttachAlertPhotoLayout.r1;
                    ChatAttachAlertPhotoLayout.r1 = i132 - 1;
                    MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i132, 0L, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i122, i11, 0L);
                    photoEntry2.canDeleteAfter = true;
                    chatAttachAlertPhotoLayout.j0(photoEntry2, z4, false);
                }
                break;
            case 1:
                dz dzVar = (dz) this.c;
                boolean z10 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = dzVar.r;
                fz fzVar = dzVar.w;
                if (fzVar.J == dzVar.b) {
                    int i14 = 0;
                    if (z10) {
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
                    dzVar.f.put(arrayList2, fzVar.K);
                    runnable.run();
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z11 = this.b;
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) this.d;
                dg.n3 n3Var = (dg.n3) obj;
                dg.q3 q3Var = photoViewer.m5;
                if (!q3Var.y || (n3VarArr = q3Var.E) == null || n3VarArr.length <= 0) {
                    photoViewer.q5.setCutOutState(true);
                    photoViewer.X2(false, true);
                } else {
                    a11 thanosEffect = photoViewer.m5.getThanosEffect();
                    dg.q3 q3Var2 = photoViewer.m5;
                    q3Var2.I = true;
                    q3Var2.B = n3Var;
                    Bitmap bitmap3 = photoViewer.z4.getBitmap();
                    photoViewer.z4.getOrientation();
                    dg.n3 n3Var2 = q3Var2.B;
                    Bitmap b10 = n3Var2 == null ? q3Var2.F : (!z11 || bitmap3 == null) ? n3Var2.b() : q3Var2.e(bitmap3);
                    MediaController.PhotoEntry photoEntry3 = (MediaController.PhotoEntry) photoViewer.d7.get(photoViewer.M4);
                    if (thanosEffect == null) {
                        Utilities.themeQueue.postRunnable(new org.telegram.ui.yq0(photoViewer, b10, 0));
                        photoViewer.m5.f();
                        photoViewer.b0.invalidate();
                        break;
                    } else {
                        dg.q3 q3Var3 = photoViewer.m5;
                        photoViewer.z4.getOrientation();
                        q3Var3.getClass();
                        String str = photoEntry3.filterPath;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : q3Var3.getSourceBitmap();
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
                        dg.n3 n3Var3 = q3Var3.B;
                        if (n3Var3 == null) {
                            dg.n3[] n3VarArr2 = q3Var3.E;
                            if (n3VarArr2.length > 0) {
                                n3Var3 = n3VarArr2[0];
                            }
                        }
                        if (n3Var3 == null) {
                            bitmap2 = null;
                            f10 = 2.0f;
                        } else {
                            if (n3Var3.c == 0 || !photoEntry3.isFiltered) {
                                bitmap = createBitmap;
                                f10 = 2.0f;
                                canvas.drawBitmap(n3Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f10 = 2.0f;
                                bitmap = createBitmap;
                                matrix.postRotate(n3Var3.c, n3Var3.a().getWidth() / 2.0f, n3Var3.a().getHeight() / 2.0f);
                                if ((n3Var3.c / 90) % 2 != 0) {
                                    float height2 = (n3Var3.a().getHeight() - n3Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap4.getWidth() / n3Var3.a().getHeight(), bitmap4.getHeight() / n3Var3.a().getWidth());
                                canvas.drawBitmap(n3Var3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (n3Var3.c == 0 || photoEntry3.isFiltered) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-n3Var3.c, decodeFile2.getWidth() / f10, decodeFile2.getHeight() / f10);
                                    if ((n3Var3.c / 90) % 2 != 0) {
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
                            Utilities.themeQueue.postRunnable(new org.telegram.ui.yq0(photoViewer, b10, 1));
                            photoViewer.m5.f();
                            photoViewer.b0.invalidate();
                            break;
                        } else {
                            MediaController.CropState cropState = mediaEditState.cropState;
                            if (cropState != null) {
                                bitmap2 = PhotoViewer.I0(bitmap2, cropState, new int[]{photoViewer.z4.getOrientation(), photoViewer.z4.getInvert()}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.themeQueue.postRunnable(new org.telegram.ui.yq0(photoViewer, b10, 2));
                                photoViewer.m5.f();
                                photoViewer.b0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmap2.getWidth();
                                int height4 = bitmap2.getHeight();
                                if (!photoEntry3.isCropped && (photoViewer.z4.getOrientation() / 90) % 2 != 0) {
                                    width2 = bitmap2.getHeight();
                                    height4 = bitmap2.getWidth();
                                }
                                float f15 = width2;
                                float f16 = height4;
                                float min = Math.min(photoViewer.k1(photoViewer.r4) / f15, photoViewer.i1() / f16);
                                float f17 = f15 * min;
                                float f18 = f16 * min;
                                if ((photoViewer.z4.getOrientation() == 0 || photoEntry3.isCropped) && photoViewer.Y5 == 0.0f) {
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
                                    canvas2.rotate((photoEntry3.isCropped ? 0 : photoViewer.z4.getOrientation()) + photoViewer.Y5, sqrt, sqrt);
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
                                float f24 = photoViewer.X5;
                                matrix3.postScale(f24, f24, f11 / f10, f12 / f10);
                                matrix3.postTranslate(photoViewer.U5 + f14 + Math.max(0, (int) ((photoViewer.k1(photoViewer.r4) - f17) / f10)), photoViewer.V5 + f13 + Math.max(0, (int) ((photoViewer.i1() - f18) / f10)));
                                photoViewer.m5.S = true;
                                Utilities.themeQueue.postRunnable(new org.telegram.ui.yq0(photoViewer, b10, 3));
                                org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0(photoViewer, 13);
                                org.telegram.ui.hf0 hf0Var = new org.telegram.ui.hf0(photoViewer, b10, mq0Var, 18);
                                mc mcVar = new mc(29);
                                y01 y01Var = thanosEffect.a;
                                if (y01Var != null) {
                                    y01Var.c(matrix3, bitmap2, hf0Var, mcVar);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new z01(matrix3, bitmap2, hf0Var, mcVar));
                                }
                                AndroidUtilities.runOnUIThread(mq0Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.m5.f();
                photoViewer.b0.invalidate();
                break;
            case 3:
                boolean z12 = this.b;
                String str2 = (String) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                Runnable runnable2 = (Runnable) obj;
                if (!z12) {
                    runnable2.run();
                    break;
                } else {
                    xw0.v3.fetch(UserConfig.selectedAccount, str2, new org.telegram.ui.x41(linkedHashSet, runnable2, 1));
                    break;
                }
            default:
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                ph.za zaVar = (ph.za) obj;
                if (z13) {
                    d2Var.c(350L);
                }
                callback.run(zaVar);
                break;
        }
    }

    public /* synthetic */ ll(nl nlVar, File file, boolean z4) {
        this.a = 0;
        this.c = nlVar;
        this.d = file;
        this.b = z4;
    }

    public /* synthetic */ ll(boolean z4, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = z4;
        this.c = obj;
        this.d = obj2;
    }
}
