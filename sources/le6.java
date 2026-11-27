// default package

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class le6 implements OnSuccessListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qh6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ le6(qh6 qh6Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z) {
        this.b = qh6Var;
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
                this.b.u1(this.c, this.d, this.e, this.f, (ts9) obj);
                break;
        }
    }

    public /* synthetic */ le6(qh6 qh6Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z) {
        this.b = qh6Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z;
    }
}
