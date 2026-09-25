package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;

    public /* synthetic */ ck0(qk0 qk0Var, int i10) {
        this.a = i10;
        this.b = qk0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                qk0 qk0Var = this.b;
                ArrayList arrayList = qk0Var.d;
                qk0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ok0)) {
                    ((ok0) view).f(((hk0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof ok0) {
                    ok0 ok0Var = (ok0) view;
                    nk0 nk0Var = ok0Var.b;
                    ok0Var.N = false;
                    nk0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        ok0Var.d();
                        break;
                    } else {
                        nk0Var.setScaleX(ok0Var.I * (ok0Var.w ? 0.76f : 1.0f));
                        nk0Var.setScaleY(ok0Var.I * (ok0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
