package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ boolean[] f;

    public /* synthetic */ z6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
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
                this.b.lambda$loadRecentAndTopReactions$237(this.c, this.d, sharedPreferences, zArr);
                break;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f;
                this.b.lambda$loadRecentAndTopReactions$235(this.c, this.d, sharedPreferences2, zArr2);
                break;
        }
    }
}
