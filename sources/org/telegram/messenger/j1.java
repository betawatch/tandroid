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
import org.telegram.ui.Components.xm0;
import org.telegram.ui.bb1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements ResultCallback, WriteToSocketDelegate, OnTokenCanceledListener, OnSuccessListener, OnFailureListener, hi.a7, kc, RequestTimeDelegate, xm0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.xm0
    public void a(float f10) {
        gj gjVar = ((yt) this.b).X;
        if (gjVar == null) {
            return;
        }
        gjVar.b0 = f10;
        MediaController.B().i0(gjVar, f10);
    }

    @Override // hi.a7
    public Bitmap c(BitmapFactory.Options options) {
        ff ffVar = (ff) this.b;
        String str = ffVar.i;
        if (str == null) {
            str = ffVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ((org.telegram.ui.bn) this.b).presentFragment(new bb1(6, null));
    }

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
        if (!z10) {
            boolean z13 = MusicPlayerService.s;
        } else {
            if (TextUtils.isEmpty(musicPlayerService.n)) {
                return;
            }
            gj gjVar = MediaController.B().v0;
            if (gjVar != null) {
                musicPlayerService.a(gjVar, true);
            }
            musicPlayerService.n = null;
        }
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
                f4 f4Var = (f4) this.b;
                Pair pair = (Pair) obj;
                if (pair == null) {
                    f4Var.getClass();
                    break;
                } else {
                    f4Var.a.put((Long) pair.first, (Bitmap) pair.second);
                    break;
                }
            default:
                org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) this.b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    q3Var.a(null);
                    break;
                } else {
                    q3Var.a(new gg.a(bitmap, 0, null));
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
        ((nc) this.b).q(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((oc) this.b).a((String) obj);
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        g0.g3(new od((bz) this.b, j3, 2));
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

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.xm0
    public /* synthetic */ void g(float f10) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
