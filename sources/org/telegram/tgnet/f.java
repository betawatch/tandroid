package org.telegram.tgnet;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements OnSuccessListener, OnFailureListener, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(int i9, int i10, long j10, Utilities.Callback callback) {
        this.a = i9;
        this.d = callback;
        this.c = i10;
        this.b = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        List list;
        Bitmap bitmap;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        ImageReceiver.BitmapHolder drawableSafe = imageReceiver.getDrawableSafe();
        if (!z10 || bitmapSafe == null) {
            return;
        }
        if (drawableSafe != null) {
            Drawable drawable = drawableSafe.drawable;
            if (drawable instanceof lf.b) {
                list = ((lf.b) drawable).a;
                bitmap = bitmapSafe.bitmap;
                if (bitmap == null) {
                    Drawable drawable2 = bitmapSafe.drawable;
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    }
                }
                lf.a aVar = new lf.a(bitmap, this.a, list);
                if (callback != null) {
                    callback.run(aVar);
                }
                ChatThemeController.getInstance(this.c).saveWallpaperBitmap(aVar, this.b);
            }
        }
        list = null;
        bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
        }
        lf.a aVar2 = new lf.a(bitmap, this.a, list);
        if (callback != null) {
        }
        ChatThemeController.getInstance(this.c).saveWallpaperBitmap(aVar2, this.b);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.a, this.b, this.c, (String) this.d, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.a, this.b, this.c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public /* synthetic */ f(int i9, long j10, String str, int i10) {
        this.a = i9;
        this.b = j10;
        this.c = i10;
        this.d = str;
    }
}
