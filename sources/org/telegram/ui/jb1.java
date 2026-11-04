package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ jb1(zb1 zb1Var, VoIPService voIPService, int i3) {
        this.a = i3;
        this.b = zb1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zb1 zb1Var = this.b;
                org.telegram.messenger.g0.h3(new kb1(zb1Var, 8));
                int i3 = zb1Var.M;
                if (i3 > 0) {
                    this.c.sendCallRating(i3);
                    break;
                }
                break;
            default:
                zb1 zb1Var2 = this.b;
                org.telegram.messenger.g0.h3(new kb1(zb1Var2, 10));
                int i10 = zb1Var2.M;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
        }
    }
}
