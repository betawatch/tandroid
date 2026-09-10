package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class na {
    public String a;
    public Bitmap b;
    public final Paint c;
    public final int d;
    public final Runnable e;
    public org.telegram.messenger.e8 f;

    public na(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = i10;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        this.a = null;
        if (this.f != null) {
            Utilities.globalQueue.cancelRunnable(this.f);
        }
        Bitmap bitmap = this.b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.b.recycle();
        }
        this.b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r8.f != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(Bitmap bitmap, String str, int i10, int i11, boolean z10) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (TextUtils.equals(this.a, str)) {
                Bitmap bitmap2 = this.b;
                if (bitmap2 != null) {
                    return bitmap2;
                }
            }
            if (this.f != null) {
                Utilities.globalQueue.cancelRunnable(this.f);
            }
            this.a = str;
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            org.telegram.messenger.e8 e8Var = new org.telegram.messenger.e8(this, bitmap, i10, i11, str, z10);
            this.f = e8Var;
            dispatchQueue.postRunnable(e8Var);
            return this.b;
        }
        return null;
    }

    public final Bitmap c(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder == null) {
            return null;
        }
        return b(bitmapHolder.bitmap, bitmapHolder.getKey(), bitmapHolder.orientation, 0, false);
    }

    public final Bitmap d(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return b(imageReceiver.getBitmap(), imageReceiver.getImageKey(), imageReceiver.getOrientation(), imageReceiver.getInvert(), false);
    }
}
