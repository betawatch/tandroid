// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k7a implements View.OnClickListener {
    public final /* synthetic */ TLRPC.TL_authorization a;
    public final /* synthetic */ p7a b;

    public k7a(p7a p7aVar, TLRPC.TL_authorization tL_authorization) {
        this.b = p7aVar;
        this.a = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.D0(this.a.ip);
    }
}
