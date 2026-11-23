package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ pb1(fc1 fc1Var, VoIPService voIPService, int i7) {
        this.a = i7;
        this.b = fc1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fc1 fc1Var = this.b;
                org.telegram.messenger.g0.g3(new rb1(fc1Var, 8));
                int i7 = fc1Var.M;
                if (i7 > 0) {
                    this.c.sendCallRating(i7);
                    break;
                }
                break;
            default:
                fc1 fc1Var2 = this.b;
                org.telegram.messenger.g0.g3(new rb1(fc1Var2, 10));
                int i10 = fc1Var2.M;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
        }
    }
}
