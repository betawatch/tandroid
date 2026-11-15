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
import org.telegram.messenger.d4;
import org.telegram.messenger.ic;
import org.telegram.messenger.kc;
import org.telegram.messenger.mg;
import org.telegram.messenger.t0;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements OnSuccessListener, OnFailureListener, kc {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(int i7, int i10, long j3, z10 z10Var) {
        this.a = i7;
        this.d = z10Var;
        this.c = i10;
        this.b = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    @Override // org.telegram.messenger.kc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        List list;
        Bitmap bitmap;
        int i7 = this.a;
        z10 z10Var = (z10) this.d;
        int i10 = this.c;
        long j3 = this.b;
        ic p10 = imageReceiver.p();
        ic u10 = imageReceiver.u();
        if (!z10 || p10 == null) {
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
                z10Var.a(new gg.a(bitmap, i7, list));
                d4 f10 = d4.f(i10);
                if (i7 != 0) {
                    d4.s.c(new b4(24, f10.g(j3), bitmap));
                    return;
                } else {
                    if (i7 == 1) {
                        File i11 = t0.i();
                        Locale locale = Locale.US;
                        d4.s.c(new mg(new File(i11, r.b.j(j3, "pattern_", ".pgm.gz")), list, bitmap, 13));
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
        z10Var.a(new gg.a(bitmap, i7, list));
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

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }
}
