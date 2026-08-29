package nh;

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
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.yy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ef0;
import org.telegram.ui.gq0;
import org.telegram.ui.n41;
import org.telegram.ui.rq0;
import org.telegram.ui.xe0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class yb implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yb(Object obj, boolean z10, Object obj2, int i10) {
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
        bg.r3[] r3VarArr;
        Bitmap bitmap;
        float f9;
        Bitmap bitmap2;
        float f10;
        float f11;
        float f12;
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                dc dcVar = (dc) obj;
                if (z10) {
                    c2Var.c(350L);
                }
                callback.run(dcVar);
                break;
            case 1:
                ml mlVar = (ml) this.c;
                File file = (File) this.d;
                boolean z11 = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = mlVar.e;
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
                yy yyVar = (yy) this.c;
                boolean z12 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = yyVar.r;
                az azVar = yyVar.w;
                if (azVar.I == yyVar.b) {
                    int i14 = 0;
                    if (z12) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        azVar.y = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        yyVar.v.put(document.id, document);
                    }
                    yyVar.f.put(arrayList2, azVar.J);
                    runnable.run();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z13 = this.b;
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) this.d;
                bg.r3 r3Var = (bg.r3) obj;
                bg.u3 u3Var = photoViewer.l5;
                if (!u3Var.y || (r3VarArr = u3Var.D) == null || r3VarArr.length <= 0) {
                    photoViewer.p5.setCutOutState(true);
                    photoViewer.X2(false, true);
                } else {
                    p01 thanosEffect = photoViewer.l5.getThanosEffect();
                    bg.u3 u3Var2 = photoViewer.l5;
                    u3Var2.H = true;
                    u3Var2.A = r3Var;
                    Bitmap bitmap3 = photoViewer.y4.getBitmap();
                    photoViewer.y4.getOrientation();
                    bg.r3 r3Var2 = u3Var2.A;
                    Bitmap b10 = r3Var2 == null ? u3Var2.E : (!z13 || bitmap3 == null) ? r3Var2.b() : u3Var2.e(bitmap3);
                    MediaController.PhotoEntry photoEntry3 = (MediaController.PhotoEntry) photoViewer.c7.get(photoViewer.L4);
                    if (thanosEffect == null) {
                        Utilities.themeQueue.postRunnable(new rq0(photoViewer, b10, 0));
                        photoViewer.l5.f();
                        photoViewer.a0.invalidate();
                        break;
                    } else {
                        bg.u3 u3Var3 = photoViewer.l5;
                        photoViewer.y4.getOrientation();
                        u3Var3.getClass();
                        String str = photoEntry3.filterPath;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : u3Var3.getSourceBitmap();
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
                        bg.r3 r3Var3 = u3Var3.A;
                        if (r3Var3 == null) {
                            bg.r3[] r3VarArr2 = u3Var3.D;
                            if (r3VarArr2.length > 0) {
                                r3Var3 = r3VarArr2[0];
                            }
                        }
                        if (r3Var3 == null) {
                            bitmap2 = null;
                            f9 = 2.0f;
                        } else {
                            if (r3Var3.c == 0 || !photoEntry3.isFiltered) {
                                bitmap = createBitmap;
                                f9 = 2.0f;
                                canvas.drawBitmap(r3Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f9 = 2.0f;
                                bitmap = createBitmap;
                                matrix.postRotate(r3Var3.c, r3Var3.a().getWidth() / 2.0f, r3Var3.a().getHeight() / 2.0f);
                                if ((r3Var3.c / 90) % 2 != 0) {
                                    float height2 = (r3Var3.a().getHeight() - r3Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap4.getWidth() / r3Var3.a().getHeight(), bitmap4.getHeight() / r3Var3.a().getWidth());
                                canvas.drawBitmap(r3Var3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (r3Var3.c == 0 || photoEntry3.isFiltered) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-r3Var3.c, decodeFile2.getWidth() / f9, decodeFile2.getHeight() / f9);
                                    if ((r3Var3.c / 90) % 2 != 0) {
                                        float height3 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / f9;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap4.getWidth() / decodeFile2.getHeight(), bitmap4.getHeight() / decodeFile2.getWidth());
                                    canvas.drawBitmap(decodeFile2, matrix2, paint);
                                }
                            }
                            bitmap2 = bitmap;
                        }
                        if (bitmap2 == null) {
                            Utilities.themeQueue.postRunnable(new rq0(photoViewer, b10, 1));
                            photoViewer.l5.f();
                            photoViewer.a0.invalidate();
                            break;
                        } else {
                            MediaController.CropState cropState = mediaEditState.cropState;
                            if (cropState != null) {
                                bitmap2 = PhotoViewer.I0(bitmap2, cropState, new int[]{photoViewer.y4.getOrientation(), photoViewer.y4.getInvert()}, true);
                            }
                            if (bitmap2 == null) {
                                Utilities.themeQueue.postRunnable(new rq0(photoViewer, b10, 2));
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
                                float f14 = width2;
                                float f15 = height4;
                                float min = Math.min(photoViewer.k1(photoViewer.q4) / f14, photoViewer.i1() / f15);
                                float f16 = f14 * min;
                                float f17 = f15 * min;
                                if ((photoViewer.y4.getOrientation() == 0 || photoEntry3.isCropped) && photoViewer.X5 == 0.0f) {
                                    f10 = f16;
                                    f11 = f17;
                                    f12 = 0.0f;
                                } else {
                                    float width3 = bitmap2.getWidth();
                                    float height5 = bitmap2.getHeight();
                                    float f18 = width3 / f9;
                                    float f19 = height5 / f9;
                                    float sqrt = (float) Math.sqrt((f19 * f19) + (f18 * f18));
                                    float f20 = sqrt * f9;
                                    int i15 = (int) f20;
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i15, i15, config);
                                    Canvas canvas2 = new Canvas(createBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((photoEntry3.isCropped ? 0 : photoViewer.y4.getOrientation()) + photoViewer.X5, sqrt, sqrt);
                                    canvas2.drawBitmap(bitmap2, (f20 - width3) / f9, (f20 - height5) / f9, (Paint) null);
                                    bitmap2.recycle();
                                    float f21 = f16 / f9;
                                    float f22 = f17 / f9;
                                    f10 = ((float) Math.sqrt((f22 * f22) + (f21 * f21))) * f9;
                                    f12 = (-(f10 - f17)) / f9;
                                    f13 = (-(f10 - f16)) / f9;
                                    bitmap2 = createBitmap2;
                                    f11 = f10;
                                }
                                matrix3.postScale(f10, f11);
                                float f23 = photoViewer.W5;
                                matrix3.postScale(f23, f23, f10 / f9, f11 / f9);
                                matrix3.postTranslate(photoViewer.T5 + f13 + Math.max(0, (int) ((photoViewer.k1(photoViewer.q4) - f16) / f9)), photoViewer.U5 + f12 + Math.max(0, (int) ((photoViewer.i1() - f17) / f9)));
                                photoViewer.l5.R = true;
                                Utilities.themeQueue.postRunnable(new rq0(photoViewer, b10, 3));
                                gq0 gq0Var = new gq0(photoViewer, 13);
                                xe0 xe0Var = new xe0(photoViewer, b10, gq0Var, 18);
                                ef0 ef0Var = new ef0(3);
                                n01 n01Var = thanosEffect.a;
                                if (n01Var != null) {
                                    n01Var.c(matrix3, bitmap2, xe0Var, ef0Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new o01(matrix3, bitmap2, xe0Var, ef0Var));
                                }
                                AndroidUtilities.runOnUIThread(gq0Var, 1200L);
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
                    ow0.u3.fetch(UserConfig.selectedAccount, str2, new n41(linkedHashSet, runnable2, 1));
                    break;
                }
        }
    }

    public /* synthetic */ yb(ml mlVar, File file, boolean z10) {
        this.a = 1;
        this.c = mlVar;
        this.d = file;
        this.b = z10;
    }

    public /* synthetic */ yb(boolean z10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
    }
}
