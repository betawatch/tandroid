package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ jd1(zd1 zd1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = zd1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zd1 zd1Var = this.b;
                org.telegram.messenger.i0.g3(new kd1(zd1Var, 8));
                int i10 = zd1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                zd1 zd1Var2 = this.b;
                org.telegram.messenger.i0.g3(new kd1(zd1Var2, 10));
                int i11 = zd1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
