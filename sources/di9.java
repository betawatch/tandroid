// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class di9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fi9 b;

    public /* synthetic */ di9(fi9 fi9Var, byte b) {
        this.a = b;
        this.b = fi9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r1.length() >= r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0104, code lost:
    
        if (r0.isRecycled() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0177, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0140, code lost:
    
        if (r0.isRecycled() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016b, code lost:
    
        if (r0.isRecycled() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0175, code lost:
    
        if (r0.isRecycled() == false) goto L93;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        byte b = this.a;
        String str = null;
        fi9 fi9Var = this.b;
        switch (b) {
            case 0:
                String str2 = fi9Var.b;
                TLRPC.Document document = fi9Var.r;
                if (document != null && !TextUtils.isEmpty(str2)) {
                    try {
                        String str3 = document.mime_type;
                        String lowerCase = str3 == null ? "" : str3.toLowerCase();
                        bitmap = lowerCase.startsWith("image/") ? fn5.G(str2, null, 320.0f, 320.0f, true) : lowerCase.equals("video/mp4") ? a6a.q(1, str2) : null;
                        if (bitmap != null) {
                            try {
                                ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i < size) {
                                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i);
                                        i++;
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                        }
                                    } else {
                                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                        tL_documentAttributeImageSize.w = bitmap.getWidth();
                                        tL_documentAttributeImageSize.h = bitmap.getHeight();
                                        document.attributes.add(tL_documentAttributeImageSize);
                                    }
                                }
                                TLRPC.PhotoSize U = fn5.U(bitmap, 320.0f, 320.0f, 80, false);
                                if (U != null) {
                                    document.thumbs.clear();
                                    document.thumbs.add(U);
                                    document.flags |= 1;
                                    bc4.G(fi9Var.a);
                                    File J = bc4.J(U, null, true, true);
                                    if (J != null && J.exists()) {
                                        str = J.getAbsolutePath();
                                    }
                                    break;
                                } else {
                                    break;
                                }
                            } catch (Throwable unused) {
                                if (bitmap != null) {
                                    break;
                                }
                                fi9Var.G = str;
                                gm.c3(new di9(fi9Var, (byte) 2));
                                return;
                            }
                        } else if (bitmap != null) {
                            break;
                        }
                    } catch (Throwable unused2) {
                        bitmap = null;
                    }
                }
                fi9Var.G = str;
                gm.c3(new di9(fi9Var, (byte) 2));
                return;
            case 1:
                String str4 = fi9Var.b;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str4, options);
                    String str5 = options.outMimeType;
                    boolean z = str5 != null && (str5.equalsIgnoreCase("image/jpeg") || str5.equalsIgnoreCase("image/jpg"));
                    float Y0 = gm.Y0(false);
                    Bitmap G = fn5.G(str4, null, Y0, Y0, true);
                    if (G == null) {
                        G = fn5.G(str4, null, 800.0f, 800.0f, true);
                    }
                    if (G != null) {
                        File file = new File(bc4.z(4), "rich_jpeg_" + Math.abs(str4.hashCode()) + ".jpg");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                boolean compress = G.compress(Bitmap.CompressFormat.JPEG, 89, fileOutputStream);
                                fileOutputStream.close();
                                if (compress && file.length() > 0) {
                                    if (z) {
                                        long length = new File(str4).length();
                                        if (length > 0) {
                                            break;
                                        }
                                    }
                                    str4 = file.getAbsolutePath();
                                }
                            } finally {
                            }
                        } finally {
                            G.recycle();
                        }
                    }
                } catch (Throwable unused3) {
                }
                gm.c3(new ey8(fi9Var, str4, (byte) 26));
                return;
            default:
                if (fi9Var.x || fi9Var.y) {
                    return;
                }
                fi9Var.a(fi9Var.b);
                return;
        }
    }
}
