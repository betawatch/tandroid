package bi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.b8;
import org.telegram.messenger.hc;
import org.telegram.messenger.qz;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ j5(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0188, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0116, code lost:
    
        r1.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0154, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
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
                l5 l5Var = this.b;
                String str = l5Var.b;
                TLRPC.Document document = l5Var.r;
                String str2 = null;
                if (document != null && !TextUtils.isEmpty(str)) {
                    try {
                        String str3 = document.mime_type;
                        String lowerCase = str3 == null ? "" : str3.toLowerCase();
                        bitmap = lowerCase.startsWith("image/") ? hc.K(str, null, 320.0f, 320.0f, true) : lowerCase.equals("video/mp4") ? qz.r(1, str) : null;
                        if (bitmap != null) {
                            try {
                                ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                                        i10++;
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                        }
                                    } else {
                                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                        tL_documentAttributeImageSize.w = bitmap.getWidth();
                                        tL_documentAttributeImageSize.h = bitmap.getHeight();
                                        document.attributes.add(tL_documentAttributeImageSize);
                                    }
                                }
                                TLRPC.PhotoSize Z = hc.Z(bitmap, 320.0f, 320.0f, 80, false);
                                if (Z != null) {
                                    document.thumbs.clear();
                                    document.thumbs.add(Z);
                                    document.flags |= 1;
                                    b8.G(l5Var.a);
                                    File K = b8.K(Z, null, true, true);
                                    if (K != null && K.exists()) {
                                        str2 = K.getAbsolutePath();
                                    }
                                    break;
                                } else {
                                    break;
                                }
                            } catch (Throwable unused) {
                                if (bitmap != null) {
                                    break;
                                }
                                l5Var.F = str2;
                                org.telegram.messenger.i0.g3(new j5(l5Var, 2));
                                return;
                            }
                        } else if (bitmap != null) {
                            break;
                        }
                    } catch (Throwable unused2) {
                        bitmap = null;
                    }
                }
                l5Var.F = str2;
                org.telegram.messenger.i0.g3(new j5(l5Var, 2));
                return;
            case 1:
                l5 l5Var2 = this.b;
                String str4 = l5Var2.b;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str4, options);
                    String str5 = options.outMimeType;
                    boolean z10 = str5 != null && (str5.equalsIgnoreCase("image/jpeg") || str5.equalsIgnoreCase("image/jpg"));
                    float Z0 = org.telegram.messenger.i0.Z0(false);
                    Bitmap K2 = hc.K(str4, null, Z0, Z0, true);
                    if (K2 == null) {
                        K2 = hc.K(str4, null, 800.0f, 800.0f, true);
                    }
                    if (K2 != null) {
                        File file = new File(b8.z(4), "rich_jpeg_" + Math.abs(str4.hashCode()) + ".jpg");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                boolean compress = K2.compress(Bitmap.CompressFormat.JPEG, 89, fileOutputStream);
                                fileOutputStream.close();
                                if (compress && file.length() > 0) {
                                    if (z10) {
                                        long length = new File(str4).length();
                                        if (length > 0 && file.length() >= length) {
                                        }
                                    }
                                    str4 = file.getAbsolutePath();
                                }
                            } finally {
                            }
                        } finally {
                            K2.recycle();
                        }
                    }
                } catch (Throwable unused3) {
                }
                org.telegram.messenger.i0.g3(new a1.f(24, l5Var2, str4));
                return;
            default:
                l5 l5Var3 = this.b;
                if (l5Var3.x || l5Var3.y) {
                    return;
                }
                l5Var3.a(l5Var3.b);
                return;
        }
    }
}
