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
import org.telegram.messenger.e4;
import org.telegram.messenger.g4;
import org.telegram.messenger.lc;
import org.telegram.messenger.nc;
import org.telegram.messenger.ng;
import org.telegram.messenger.r20;
import org.telegram.messenger.w0;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements OnSuccessListener, OnFailureListener, nc {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(int i10, int i11, long j10, r20 r20Var) {
        this.a = i10;
        this.d = r20Var;
        this.c = i11;
        this.b = j10;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.a, this.b, this.c, (String) this.d, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.a, this.b, this.c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    @Override // org.telegram.messenger.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        List list;
        Bitmap bitmap;
        int i10 = this.a;
        r20 r20Var = (r20) this.d;
        int i11 = this.c;
        long j10 = this.b;
        lc p5 = imageReceiver.p();
        lc u10 = imageReceiver.u();
        if (!z10 || p5 == null) {
            return;
        }
        if (u10 != null) {
            Drawable drawable = u10.d;
            if (drawable instanceof wf.b) {
                list = ((wf.b) drawable).a;
                bitmap = p5.c;
                if (bitmap == null) {
                    Drawable drawable2 = p5.d;
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    }
                }
                r20Var.a(new wf.a(bitmap, i10, list));
                g4 f7 = g4.f(i11);
                if (i10 != 0) {
                    g4.s.c(new e4(22, f7.g(j10), bitmap));
                    return;
                } else {
                    if (i10 == 1) {
                        File i12 = w0.i();
                        Locale locale = Locale.US;
                        g4.s.c(new ng(new File(i12, f1.n(j10, "pattern_", ".pgm.gz")), list, bitmap, 13));
                        return;
                    }
                    return;
                }
            }
        }
        list = null;
        bitmap = p5.c;
        if (bitmap == null) {
        }
        r20Var.a(new wf.a(bitmap, i10, list));
        g4 f72 = g4.f(i11);
        if (i10 != 0) {
        }
    }

    public /* synthetic */ g(int i10, long j10, String str, int i11) {
        this.a = i10;
        this.b = j10;
        this.c = i11;
        this.d = str;
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }
}
