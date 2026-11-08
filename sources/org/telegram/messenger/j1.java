package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.Components.im0;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements ResultCallback, WriteToSocketDelegate, OnTokenCanceledListener, OnSuccessListener, OnFailureListener, fi.c7, lc, RequestTimeDelegate, im0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.im0
    public void a(float f10) {
        ij ijVar = ((du) this.b).W;
        if (ijVar == null) {
            return;
        }
        ijVar.b0 = f10;
        MediaController.B().i0(ijVar, f10);
    }

    @Override // fi.c7
    public Bitmap c(BitmapFactory.Options options) {
        gf gfVar = (gf) this.b;
        String str = gfVar.i;
        if (str == null) {
            str = gfVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
        if (!z9) {
            boolean z12 = MusicPlayerService.w;
        } else {
            if (TextUtils.isEmpty(musicPlayerService.r)) {
                return;
            }
            ij ijVar = MediaController.B().u0;
            if (ijVar != null) {
                musicPlayerService.a(ijVar, true);
            }
            musicPlayerService.r = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ((org.telegram.ui.an) this.b).presentFragment(new za1(6, null));
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        Runnable runnable = ((Runnable[]) this.b)[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        switch (this.a) {
            case 1:
                d4 d4Var = (d4) this.b;
                Pair pair = (Pair) obj;
                if (pair == null) {
                    d4Var.getClass();
                    break;
                } else {
                    d4Var.a.put((Long) pair.first, (Bitmap) pair.second);
                    break;
                }
            default:
                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) this.b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    p3Var.a(null);
                    break;
                } else {
                    p3Var.a(new gg.a(bitmap, 0, null));
                    break;
                }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        int i7 = this.a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((oc) this.b).r(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((pc) this.b).a((String) obj);
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        g0.h3(new pd((hz) this.b, j3, 1));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        int i7 = this.a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.tgnet.WriteToSocketDelegate
    public void run() {
        Utilities.d.c(new u8((y8) this.b, 3));
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.im0
    public /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
