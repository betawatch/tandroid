package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c91 {
    public String a;
    public final Activity b;
    public final org.telegram.ui.ActionBar.p2 c;
    public final b91 d;
    public File e;

    public c91(Activity activity, WallpapersListActivity wallpapersListActivity, b91 b91Var) {
        this.b = activity;
        this.c = wallpapersListActivity;
        this.d = b91Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, int i11, Intent intent) {
        FileOutputStream fileOutputStream;
        if (i11 == -1) {
            ?? r10 = 10;
            b91 b91Var = this.d;
            FileOutputStream fileOutputStream2 = null;
            if (i10 != 10) {
                if (i10 != 11 || intent == null || intent.getData() == null) {
                    return;
                }
                try {
                    this.e = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(null, intent.getData(), (float) realScreenSize.x, (float) realScreenSize.y, true);
                    loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(this.e));
                    b91Var.b(this.e, loadBitmap, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            AndroidUtilities.addMediaToGallery(this.a);
            try {
                try {
                    this.e = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize2 = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap2 = ImageLoader.loadBitmap(this.a, null, (float) realScreenSize2.x, (float) realScreenSize2.y, true);
                    fileOutputStream = new FileOutputStream(this.e);
                    try {
                        loadBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        b91Var.b(this.e, loadBitmap2, false);
                        r10 = fileOutputStream;
                    } catch (Exception e7) {
                        e = e7;
                        FileLog.e(e);
                        r10 = fileOutputStream;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = r10;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (fileOutputStream2 != null) {
                }
                throw th;
            }
            try {
                r10.close();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            this.a = null;
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        if (p2Var == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.b.startActivityForResult(intent, 11);
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
        if (parentActivity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                    return;
                }
            } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        org.telegram.ui.kq0 kq0Var = new org.telegram.ui.kq0(2, false, false, null);
        kq0Var.x = false;
        kq0Var.V = new a91(this);
        p2Var.presentFragment(kq0Var);
    }
}
