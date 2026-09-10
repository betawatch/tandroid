package hi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ b5(d5 d5Var, int i10) {
        this.a = i10;
        this.b = d5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0116, code lost:
    
        r1.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0156, code lost:
    
        if (r1.isRecycled() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0182, code lost:
    
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
                d5 d5Var = this.b;
                String str = d5Var.b;
                TLRPC.Document document = d5Var.r;
                String str2 = null;
                if (document != null && !TextUtils.isEmpty(str)) {
                    try {
                        String str3 = document.mime_type;
                        String lowerCase = str3 == null ? "" : str3.toLowerCase();
                        bitmap = lowerCase.startsWith("image/") ? ImageLoader.loadBitmap(str, null, 320.0f, 320.0f, true) : lowerCase.equals("video/mp4") ? SendMessagesHelper.createVideoThumbnail(str, 1) : null;
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
                                TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 320.0f, 320.0f, 80, false);
                                if (scaleAndSaveImage != null) {
                                    document.thumbs.clear();
                                    document.thumbs.add(scaleAndSaveImage);
                                    document.flags |= 1;
                                    File pathToAttach = FileLoader.getInstance(d5Var.a).getPathToAttach(scaleAndSaveImage, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        str2 = pathToAttach.getAbsolutePath();
                                    }
                                    break;
                                } else {
                                    break;
                                }
                            } catch (Throwable unused) {
                                if (bitmap != null) {
                                    break;
                                }
                                d5Var.F = str2;
                                AndroidUtilities.runOnUIThread(new b5(d5Var, 2));
                                return;
                            }
                        } else if (bitmap != null) {
                            break;
                        }
                    } catch (Throwable unused2) {
                        bitmap = null;
                    }
                }
                d5Var.F = str2;
                AndroidUtilities.runOnUIThread(new b5(d5Var, 2));
                return;
            case 1:
                d5 d5Var2 = this.b;
                String str4 = d5Var2.b;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str4, options);
                    String str5 = options.outMimeType;
                    boolean z10 = str5 != null && (str5.equalsIgnoreCase("image/jpeg") || str5.equalsIgnoreCase("image/jpg"));
                    float photoSize = AndroidUtilities.getPhotoSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(str4, null, photoSize, photoSize, true);
                    if (loadBitmap == null) {
                        loadBitmap = ImageLoader.loadBitmap(str4, null, 800.0f, 800.0f, true);
                    }
                    if (loadBitmap != null) {
                        File file = new File(FileLoader.getDirectory(4), "rich_jpeg_" + Math.abs(str4.hashCode()) + ".jpg");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                boolean compress = loadBitmap.compress(Bitmap.CompressFormat.JPEG, 89, fileOutputStream);
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
                            loadBitmap.recycle();
                        }
                    }
                } catch (Throwable unused3) {
                }
                AndroidUtilities.runOnUIThread(new fg.s1(17, d5Var2, str4));
                return;
            default:
                d5 d5Var3 = this.b;
                if (d5Var3.w || d5Var3.x) {
                    return;
                }
                d5Var3.a(d5Var3.b);
                return;
        }
    }
}
