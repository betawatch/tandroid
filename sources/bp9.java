// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bp9 implements ee, qq7 {
    public final /* synthetic */ pp9 a;

    public /* synthetic */ bp9(pp9 pp9Var) {
        this.a = pp9Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        iq5 g = wzcVar.a.g(647);
        pp9 pp9Var = this.a;
        pp9Var.R = g;
        pp9Var.f.requestLayout();
        return wzc.b;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        this.a.dismiss();
        nm7.e().k(nm7.v2, new Object[0]);
    }
}
