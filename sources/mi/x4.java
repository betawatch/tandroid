package mi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.w7;
import org.telegram.messenger.yy;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4 b;

    public /* synthetic */ x4(z4 z4Var, int i3) {
        this.a = i3;
        this.b = z4Var;
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
                z4 z4Var = this.b;
                String str = z4Var.b;
                TLRPC.Document document = z4Var.r;
                String str2 = null;
                if (document != null && !TextUtils.isEmpty(str)) {
                    try {
                        String str3 = document.mime_type;
                        String lowerCase = str3 == null ? "" : str3.toLowerCase();
                        bitmap = lowerCase.startsWith("image/") ? zb.K(str, null, 320.0f, 320.0f, true) : lowerCase.equals("video/mp4") ? yy.r(1, str) : null;
                        if (bitmap != null) {
                            try {
                                ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                                int size = arrayList.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 < size) {
                                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i3);
                                        i3++;
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                        }
                                    } else {
                                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                        tL_documentAttributeImageSize.w = bitmap.getWidth();
                                        tL_documentAttributeImageSize.h = bitmap.getHeight();
                                        document.attributes.add(tL_documentAttributeImageSize);
                                    }
                                }
                                TLRPC.PhotoSize Z = zb.Z(bitmap, 320.0f, 320.0f, 80, false);
                                if (Z != null) {
                                    document.thumbs.clear();
                                    document.thumbs.add(Z);
                                    document.flags |= 1;
                                    w7.G(z4Var.a);
                                    File K = w7.K(Z, null, true, true);
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
                                z4Var.G = str2;
                                org.telegram.messenger.g0.h3(new x4(z4Var, 2));
                                return;
                            }
                        } else if (bitmap != null) {
                            break;
                        }
                    } catch (Throwable unused2) {
                        bitmap = null;
                    }
                }
                z4Var.G = str2;
                org.telegram.messenger.g0.h3(new x4(z4Var, 2));
                return;
            case 1:
                z4 z4Var2 = this.b;
                String str4 = z4Var2.b;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str4, options);
                    String str5 = options.outMimeType;
                    boolean z10 = str5 != null && (str5.equalsIgnoreCase("image/jpeg") || str5.equalsIgnoreCase("image/jpg"));
                    float Z0 = org.telegram.messenger.g0.Z0(false);
                    Bitmap K2 = zb.K(str4, null, Z0, Z0, true);
                    if (K2 == null) {
                        K2 = zb.K(str4, null, 800.0f, 800.0f, true);
                    }
                    if (K2 != null) {
                        File file = new File(w7.z(4), "rich_jpeg_" + Math.abs(str4.hashCode()) + ".jpg");
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
                org.telegram.messenger.g0.h3(new m2.s(10, z4Var2, str4));
                return;
            default:
                z4 z4Var3 = this.b;
                if (z4Var3.x || z4Var3.y) {
                    return;
                }
                z4Var3.a(z4Var3.b);
                return;
        }
    }
}
