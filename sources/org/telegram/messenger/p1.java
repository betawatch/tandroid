package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, gi.d7, ec, RequestTimeDelegate, lm0, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.lm0
    public void c(float f10) {
        zi ziVar = ((vt) this.b).X;
        if (ziVar == null) {
            return;
        }
        ziVar.b0 = f10;
        MediaController.B().i0(ziVar, f10);
    }

    @Override // gi.d7
    public Bitmap f(BitmapFactory.Options options) {
        ye yeVar = (ye) this.b;
        String str = yeVar.i;
        if (str == null) {
            str = yeVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ((org.telegram.ui.wm) this.b).presentFragment(new ra1(6, null));
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
        if (!z10) {
            boolean z13 = MusicPlayerService.w;
        } else {
            if (TextUtils.isEmpty(musicPlayerService.r)) {
                return;
            }
            zi ziVar = MediaController.B().v0;
            if (ziVar != null) {
                musicPlayerService.a(ziVar, true);
            }
            musicPlayerService.r = null;
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
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    n3Var.a(null);
                    break;
                } else {
                    n3Var.a(new hg.a(bitmap, 0, null));
                    break;
                }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        int i3 = this.a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((ic) this.b).s(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((jc) this.b).a((String) obj);
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        g0.h3(new id((zy) this.b, j10, 1));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        int i3 = this.a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.tgnet.WriteToSocketDelegate
    public void run() {
        Utilities.d.c(new u8((y8) this.b, 3));
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
