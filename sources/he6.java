// default package

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class he6 implements OnSuccessListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ mh6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ he6(mh6 mh6Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z) {
        this.b = mh6Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                this.b.t1(this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                break;
            default:
                this.b.u1(this.c, this.d, this.e, this.f, (cr9) obj);
                break;
        }
    }

    public /* synthetic */ he6(mh6 mh6Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z) {
        this.b = mh6Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z;
    }
}
