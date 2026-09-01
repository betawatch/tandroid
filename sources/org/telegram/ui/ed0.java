package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements OnSuccessListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ og0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ed0(og0 og0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z4) {
        this.b = og0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z4;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                og0.X(this.b, this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                break;
            default:
                og0.V(this.b, this.c, this.d, this.e, this.f, (a8.d) obj);
                break;
        }
    }

    public /* synthetic */ ed0(og0 og0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z4) {
        this.b = og0Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z4;
    }
}
