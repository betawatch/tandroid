package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ be1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ ld1(be1 be1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = be1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                be1 be1Var = this.b;
                org.telegram.messenger.i0.g3(new md1(be1Var, 8));
                int i10 = be1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                be1 be1Var2 = this.b;
                org.telegram.messenger.i0.g3(new md1(be1Var2, 10));
                int i11 = be1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
