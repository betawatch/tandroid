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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ml(Object obj, boolean z4, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x044c  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int i10;
        int i11;
        eg.l3[] l3VarArr;
        Bitmap bitmap;
        float f10;
        Bitmap bitmap2;
        float f11;
        float f12;
        float f13;
        switch (this.a) {
            case 0:
                ol olVar = (ol) this.c;
                File file = (File) this.d;
                boolean z4 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = olVar.e;
                chatAttachAlertPhotoLayout.p0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.S) {
                    ChatAttachAlertPhotoLayout.n1 = false;
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
                            int i13 = ChatAttachAlertPhotoLayout.r1;
                            ChatAttachAlertPhotoLayout.r1 = i13 - 1;
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i12, i11, 0L);
                            photoEntry.canDeleteAfter = true;
                            chatAttachAlertPhotoLayout.j0(photoEntry, z4, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i10 = 0;
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
                fz fzVar = (fz) this.c;
                boolean z10 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = fzVar.r;
                hz hzVar = fzVar.w;
                if (hzVar.J == fzVar.b) {
                    int i14 = 0;
                    if (z10) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        hzVar.y = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        fzVar.v.put(document.id, document);
                    }
                    fzVar.f.put(arrayList2, hzVar.K);
                    runnable.run();
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z11 = this.b;
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) this.d;
                eg.l3 l3Var = (eg.l3) obj;
                eg.o3 o3Var = photoViewer.m5;
                if (!o3Var.y || (l3VarArr = o3Var.E) == null || l3VarArr.length <= 0) {
                    photoViewer.q5.setCutOutState(true);
                    photoViewer.X2(false, true);
                } else {
                    a11 thanosEffect = photoViewer.m5.getThanosEffect();
                    eg.o3 o3Var2 = photoViewer.m5;
                    o3Var2.I = true;
                    o3Var2.B = l3Var;
                    Bitmap bitmap3 = photoViewer.z4.getBitmap();
                    photoViewer.z4.getOrientation();
                    eg.l3 l3Var2 = o3Var2.B;
                    Bitmap b10 = l3Var2 == null ? o3Var2.F : (!z11 || bitmap3 == null) ? l3Var2.b() : o3Var2.e(bitmap3);
                    MediaController.PhotoEntry photoEntry3 = (MediaController.PhotoEntry) photoViewer.d7.get(photoViewer.M4);
                    if (thanosEffect == null) {
                        Utilities.themeQueue.postRunnable(new org.telegram.ui.fr0(photoViewer, b10, 0));
                        photoViewer.m5.f();
                        photoViewer.b0.invalidate();
                        break;
                    } else {
                        eg.o3 o3Var3 = photoViewer.m5;
                        photoViewer.z4.getOrientation();
                        o3Var3.getClass();
                        String str = photoEntry3.filterPath;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : o3Var3.getSourceBitmap();
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
                        eg.l3 l3Var3 = o3Var3.B;
                        if (l3Var3 == null) {
                            eg.l3[] l3VarArr2 = o3Var3.E;
                            if (l3VarArr2.length > 0) {
                                l3Var3 = l3VarArr2[0];
                            }
                        }
                        if (l3Var3 == null) {
                            bitmap2 = null;
                            f10 = 2.0f;
                        } else {
                            if (l3Var3.c == 0 || !photoEntry3.isFiltered) {
                                bitmap = createBitmap;
                                f10 = 2.0f;
                                canvas.drawBitmap(l3Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f10 = 2.0f;
                                bitmap = createBitmap;
                                matrix.postRotate(l3Var3.c, l3Var3.a().getWidth() / 2.0f, l3Var3.a().getHeight() / 2.0f);
                                if ((l3Var3.c / 90) % 2 != 0) {
                                    float height2 = (l3Var3.a().getHeight() - l3Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap4.getWidth() / l3Var3.a().getHeight(), bitmap4.getHeight() / l3Var3.a().getWidth());
                                canvas.drawBitmap(l3Var3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (l3Var3.c == 0 || photoEntry3.isFiltered) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-l3Var3.c, decodeFile2.getWidth() / f10, decodeFile2.getHeight() / f10);
                                    if ((l3Var3.c / 90) % 2 != 0) {
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
                            Utilities.themeQueue.postRunnable(new org.telegram.ui.fr0(photoViewer, b10, 1));
                            photoViewer.m5.f();
                            photoViewer.b0.invalidate();
                            break;
                        } else {
                            MediaController.CropState cropState = mediaEditState.cropState;
                            if (cropState != null) {
                                bitmap2 = PhotoViewer.I0(bitmap2, cropState, new int[]{photoViewer.z4.getOrientation(), photoViewer.z4.getInvert()}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.themeQueue.postRunnable(new org.telegram.ui.fr0(photoViewer, b10, 2));
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
                                Utilities.themeQueue.postRunnable(new org.telegram.ui.fr0(photoViewer, b10, 3));
                                org.telegram.ui.tq0 tq0Var = new org.telegram.ui.tq0(photoViewer, 13);
                                org.telegram.ui.if0 if0Var = new org.telegram.ui.if0(photoViewer, b10, tq0Var, 18);
                                org.telegram.ui.sj0 sj0Var = new org.telegram.ui.sj0(1);
                                y01 y01Var = thanosEffect.a;
                                if (y01Var != null) {
                                    y01Var.c(matrix3, bitmap2, if0Var, sj0Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new z01(matrix3, bitmap2, if0Var, sj0Var));
                                }
                                AndroidUtilities.runOnUIThread(tq0Var, 1200L);
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
                    xw0.v3.fetch(UserConfig.selectedAccount, str2, new org.telegram.ui.e51(linkedHashSet, runnable2, 1));
                    break;
                }
            default:
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                qh.wa waVar = (qh.wa) obj;
                if (z13) {
                    d2Var.c(350L);
                }
                callback.run(waVar);
                break;
        }
    }

    public /* synthetic */ ml(ol olVar, File file, boolean z4) {
        this.a = 0;
        this.c = olVar;
        this.d = file;
        this.b = z4;
    }

    public /* synthetic */ ml(boolean z4, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = z4;
        this.c = obj;
        this.d = obj2;
    }
}
