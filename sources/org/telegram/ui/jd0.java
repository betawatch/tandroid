package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements OnSuccessListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ug0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ jd0(ug0 ug0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.b = ug0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z10;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ug0.W(this.b, this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                break;
            default:
                ug0.T(this.b, this.c, this.d, this.e, this.f, (m8.d) obj);
                break;
        }
    }

    public /* synthetic */ jd0(ug0 ug0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.b = ug0Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z10;
    }
}
