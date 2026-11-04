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
import org.telegram.messenger.cc;
import org.telegram.messenger.d4;
import org.telegram.messenger.ec;
import org.telegram.messenger.fg;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements OnSuccessListener, OnFailureListener, ec {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(int i3, int i10, long j10, u10 u10Var) {
        this.a = i3;
        this.d = u10Var;
        this.c = i10;
        this.b = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    @Override // org.telegram.messenger.ec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        List list;
        Bitmap bitmap;
        int i3 = this.a;
        u10 u10Var = (u10) this.d;
        int i10 = this.c;
        long j10 = this.b;
        cc p10 = imageReceiver.p();
        cc u10 = imageReceiver.u();
        if (!z10 || p10 == null) {
            return;
        }
        if (u10 != null) {
            Drawable drawable = u10.d;
            if (drawable instanceof hg.b) {
                list = ((hg.b) drawable).a;
                bitmap = p10.c;
                if (bitmap == null) {
                    Drawable drawable2 = p10.d;
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    }
                }
                u10Var.a(new hg.a(bitmap, i3, list));
                d4 f10 = d4.f(i10);
                if (i3 != 0) {
                    d4.s.c(new b4(24, f10.g(j10), bitmap));
                    return;
                } else {
                    if (i3 == 1) {
                        File i11 = t0.i();
                        Locale locale = Locale.US;
                        d4.s.c(new fg(new File(i11, t4.c.e(j10, "pattern_", ".pgm.gz")), list, bitmap, 13));
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
        u10Var.a(new hg.a(bitmap, i3, list));
        d4 f102 = d4.f(i10);
        if (i3 != 0) {
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

    public /* synthetic */ f(int i3, long j10, String str, int i10) {
        this.a = i3;
        this.b = j10;
        this.c = i10;
        this.d = str;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
