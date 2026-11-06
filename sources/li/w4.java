package li;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.gc;
import org.telegram.messenger.gz;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4 b;

    public /* synthetic */ w4(y4 y4Var, int i7) {
        this.a = i7;
        this.b = y4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0187, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0115, code lost:
    
        r1.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017e, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                y4 y4Var = this.b;
                String str = y4Var.b;
                TLRPC.Document document = y4Var.r;
                String str2 = null;
                if (document != null && !TextUtils.isEmpty(str)) {
                    try {
                        String str3 = document.mime_type;
                        String lowerCase = str3 == null ? "" : str3.toLowerCase();
                        bitmap = lowerCase.startsWith("image/") ? gc.K(str, null, 320.0f, 320.0f, true) : lowerCase.equals("video/mp4") ? gz.r(1, str) : null;
                        if (bitmap != null) {
                            try {
                                ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                                int size = arrayList.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 < size) {
                                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i7);
                                        i7++;
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                        }
                                    } else {
                                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                        tL_documentAttributeImageSize.w = bitmap.getWidth();
                                        tL_documentAttributeImageSize.h = bitmap.getHeight();
                                        document.attributes.add(tL_documentAttributeImageSize);
                                    }
                                }
                                TLRPC.PhotoSize Z = gc.Z(bitmap, 320.0f, 320.0f, 80, false);
                                if (Z != null) {
                                    document.thumbs.clear();
                                    document.thumbs.add(Z);
                                    document.flags |= 1;
                                    w7.G(y4Var.a);
                                    File J = w7.J(Z, null, true, true);
                                    if (J != null && J.exists()) {
                                        str2 = J.getAbsolutePath();
                                    }
                                    break;
                                } else {
                                    break;
                                }
                            } catch (Throwable unused) {
                                if (bitmap != null) {
                                    break;
                                }
                                y4Var.F = str2;
                                org.telegram.messenger.g0.h3(new w4(y4Var, 2));
                                return;
                            }
                        } else if (bitmap != null) {
                            break;
                        }
                    } catch (Throwable unused2) {
                        bitmap = null;
                    }
                }
                y4Var.F = str2;
                org.telegram.messenger.g0.h3(new w4(y4Var, 2));
                return;
            case 1:
                y4 y4Var2 = this.b;
                String str4 = y4Var2.b;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str4, options);
                    String str5 = options.outMimeType;
                    boolean z9 = str5 != null && (str5.equalsIgnoreCase("image/jpeg") || str5.equalsIgnoreCase("image/jpg"));
                    float Z0 = org.telegram.messenger.g0.Z0(false);
                    Bitmap K = gc.K(str4, null, Z0, Z0, true);
                    if (K == null) {
                        K = gc.K(str4, null, 800.0f, 800.0f, true);
                    }
                    if (K != null) {
                        File file = new File(w7.z(4), "rich_jpeg_" + Math.abs(str4.hashCode()) + ".jpg");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                boolean compress = K.compress(Bitmap.CompressFormat.JPEG, 89, fileOutputStream);
                                fileOutputStream.close();
                                if (compress && file.length() > 0) {
                                    if (z9) {
                                        long length = new File(str4).length();
                                        if (length > 0 && file.length() >= length) {
                                        }
                                    }
                                    str4 = file.getAbsolutePath();
                                }
                            } finally {
                            }
                        } finally {
                            K.recycle();
                        }
                    }
                } catch (Throwable unused3) {
                }
                org.telegram.messenger.g0.h3(new j3(2, y4Var2, str4));
                return;
            default:
                y4 y4Var3 = this.b;
                if (y4Var3.x || y4Var3.y) {
                    return;
                }
                y4Var3.a(y4Var3.b);
                return;
        }
    }
}
