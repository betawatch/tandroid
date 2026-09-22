package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 b;

    public /* synthetic */ c3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.b.dismiss();
                    break;
                }
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
