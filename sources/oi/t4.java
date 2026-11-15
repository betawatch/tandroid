package oi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.messenger.fc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ t4(w4 w4Var, int i7) {
        this.a = i7;
        this.b = w4Var;
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
                w4 w4Var = this.b;
                String str = w4Var.b;
                TLRPC.Document document = w4Var.r;
                String str2 = null;
                if (document != null && !TextUtils.isEmpty(str)) {
                    try {
                        String str3 = document.mime_type;
                        String lowerCase = str3 == null ? "" : str3.toLowerCase();
                        bitmap = lowerCase.startsWith("image/") ? fc.K(str, null, 320.0f, 320.0f, true) : lowerCase.equals("video/mp4") ? ez.r(1, str) : null;
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
                                TLRPC.PhotoSize Z = fc.Z(bitmap, 320.0f, 320.0f, 80, false);
                                if (Z != null) {
                                    document.thumbs.clear();
                                    document.thumbs.add(Z);
                                    document.flags |= 1;
                                    w7.G(w4Var.a);
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
                                w4Var.G = str2;
                                org.telegram.messenger.g0.h3(new t4(w4Var, 2));
                                return;
                            }
                        } else if (bitmap != null) {
                            break;
                        }
                    } catch (Throwable unused2) {
                        bitmap = null;
                    }
                }
                w4Var.G = str2;
                org.telegram.messenger.g0.h3(new t4(w4Var, 2));
                return;
            case 1:
                w4 w4Var2 = this.b;
                String str4 = w4Var2.b;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str4, options);
                    String str5 = options.outMimeType;
                    boolean z10 = str5 != null && (str5.equalsIgnoreCase("image/jpeg") || str5.equalsIgnoreCase("image/jpg"));
                    float Z0 = org.telegram.messenger.g0.Z0(false);
                    Bitmap K = fc.K(str4, null, Z0, Z0, true);
                    if (K == null) {
                        K = fc.K(str4, null, 800.0f, 800.0f, true);
                    }
                    if (K != null) {
                        File file = new File(w7.z(4), "rich_jpeg_" + Math.abs(str4.hashCode()) + ".jpg");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                boolean compress = K.compress(Bitmap.CompressFormat.JPEG, 89, fileOutputStream);
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
                            K.recycle();
                        }
                    }
                } catch (Throwable unused3) {
                }
                org.telegram.messenger.g0.h3(new u4(1, w4Var2, str4));
                return;
            default:
                w4 w4Var3 = this.b;
                if (w4Var3.x || w4Var3.y) {
                    return;
                }
                w4Var3.a(w4Var3.b);
                return;
        }
    }
}
