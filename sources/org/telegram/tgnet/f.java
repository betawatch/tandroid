package org.telegram.tgnet;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.io.File;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b4;
import org.telegram.messenger.c20;
import org.telegram.messenger.d4;
import org.telegram.messenger.jc;
import org.telegram.messenger.lc;
import org.telegram.messenger.ng;
import org.telegram.messenger.t0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements OnSuccessListener, OnFailureListener, lc {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(int i7, int i10, long j3, c20 c20Var) {
        this.a = i7;
        this.d = c20Var;
        this.c = i10;
        this.b = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    @Override // org.telegram.messenger.lc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        List list;
        Bitmap bitmap;
        int i7 = this.a;
        c20 c20Var = (c20) this.d;
        int i10 = this.c;
        long j3 = this.b;
        jc p10 = imageReceiver.p();
        jc u10 = imageReceiver.u();
        if (!z9 || p10 == null) {
            return;
        }
        if (u10 != null) {
            Drawable drawable = u10.d;
            if (drawable instanceof gg.b) {
                list = ((gg.b) drawable).a;
                bitmap = p10.c;
                if (bitmap == null) {
                    Drawable drawable2 = p10.d;
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    }
                }
                c20Var.a(new gg.a(bitmap, i7, list));
                d4 f10 = d4.f(i10);
                if (i7 != 0) {
                    d4.s.c(new b4(24, f10.g(j3), bitmap));
                    return;
                } else {
                    if (i7 == 1) {
                        File i11 = t0.i();
                        Locale locale = Locale.US;
                        d4.s.c(new ng(new File(i11, rf.b.h(j3, "pattern_", ".pgm.gz")), list, bitmap, 13));
                        return;
                    }
                    return;
                }
            }
        }
        list = null;
        bitmap = p10.c;
        if (bitmap == null) {
        }
        c20Var.a(new gg.a(bitmap, i7, list));
        d4 f102 = d4.f(i10);
        if (i7 != 0) {
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.a, this.b, this.c, (String) this.d, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.a, this.b, this.c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public /* synthetic */ f(int i7, long j3, String str, int i10) {
        this.a = i7;
        this.b = j3;
        this.c = i10;
        this.d = str;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
