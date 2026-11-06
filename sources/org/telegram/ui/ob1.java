package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ ob1(ec1 ec1Var, VoIPService voIPService, int i7) {
        this.a = i7;
        this.b = ec1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ec1 ec1Var = this.b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var, 8));
                int i7 = ec1Var.L;
                if (i7 > 0) {
                    this.c.sendCallRating(i7);
                    break;
                }
                break;
            default:
                ec1 ec1Var2 = this.b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var2, 10));
                int i10 = ec1Var2.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
        }
    }
}
