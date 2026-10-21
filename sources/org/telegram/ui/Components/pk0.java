package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;

    public /* synthetic */ pk0(dl0 dl0Var, int i10) {
        this.a = i10;
        this.b = dl0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                dl0 dl0Var = this.b;
                ArrayList arrayList = dl0Var.d;
                dl0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof bl0)) {
                    ((bl0) view).f(((uk0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof bl0) {
                    bl0 bl0Var = (bl0) view;
                    al0 al0Var = bl0Var.b;
                    bl0Var.N = false;
                    al0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        bl0Var.d();
                        break;
                    } else {
                        al0Var.setScaleX(bl0Var.I * (bl0Var.w ? 0.76f : 1.0f));
                        al0Var.setScaleY(bl0Var.I * (bl0Var.w ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
