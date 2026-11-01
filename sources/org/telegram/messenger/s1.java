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
import org.telegram.ui.Components.kn0;
import org.telegram.ui.rc1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, vh.l5, nc, RequestTimeDelegate, kn0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.kn0
    public void c(float f7) {
        kj kjVar = ((pu) this.b).W;
        if (kjVar == null) {
            return;
        }
        kjVar.b0 = f7;
        MediaController.B().i0(kjVar, f7);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ((org.telegram.ui.un) this.b).presentFragment(new rc1(6, null));
    }

    @Override // vh.l5
    public Bitmap i(BitmapFactory.Options options) {
        ff ffVar = (ff) this.b;
        String str = ffVar.i;
        if (str == null) {
            str = ffVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        switch (this.a) {
            case 1:
                g4 g4Var = (g4) this.b;
                Pair pair = (Pair) obj;
                if (pair == null) {
                    g4Var.getClass();
                    break;
                } else {
                    g4Var.a.put((Long) pair.first, (Bitmap) pair.second);
                    break;
                }
            default:
                org.telegram.ui.ActionBar.v3 v3Var = (org.telegram.ui.ActionBar.v3) this.b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    v3Var.a(null);
                    break;
                } else {
                    v3Var.a(new wf.a(bitmap, 0, null));
                    break;
                }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        int i10 = this.a;
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((qc) this.b).p(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((rc) this.b).a((String) obj);
    }

    @Override // org.telegram.messenger.nc
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
        if (!z10) {
            boolean z13 = MusicPlayerService.w;
        } else {
            if (TextUtils.isEmpty(musicPlayerService.r)) {
                return;
            }
            kj kjVar = MediaController.B().u0;
            if (kjVar != null) {
                musicPlayerService.a(kjVar, true);
            }
            musicPlayerService.r = null;
        }
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        i0.g3(new ld((tz) this.b, j10, 1));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        int i10 = this.a;
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.tgnet.WriteToSocketDelegate
    public void run() {
        Utilities.d.c(new z8((d9) this.b, 3));
    }

    @Override // org.telegram.ui.Components.kn0
    public /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }
}
