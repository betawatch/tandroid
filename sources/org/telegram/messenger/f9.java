package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ boolean[] f;

    public /* synthetic */ f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f;
                this.b.lambda$loadRecentAndTopReactions$238(this.c, this.d, sharedPreferences, zArr);
                break;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f;
                this.b.lambda$loadRecentAndTopReactions$236(this.c, this.d, sharedPreferences2, zArr2);
                break;
        }
    }
}
