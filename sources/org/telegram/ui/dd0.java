package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd0 implements OnSuccessListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ng0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ dd0(ng0 ng0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z4) {
        this.b = ng0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z4;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ng0.X(this.b, this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                break;
            default:
                ng0.V(this.b, this.c, this.d, this.e, this.f, (a8.d) obj);
                break;
        }
    }

    public /* synthetic */ dd0(ng0 ng0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z4) {
        this.b = ng0Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z4;
    }
}
