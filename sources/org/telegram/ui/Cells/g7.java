package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class g7 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new g7());
    }

    public static g61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        g61 J = g61.J(g7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        h7 h7Var = (h7) view;
        Object obj = g61Var.G;
        if (obj instanceof MessageObject) {
            h7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            h7Var.setTag(audioEntry);
            h7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = g61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            h7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        h7Var.e(g61Var.e, false);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d && g61Var.G == g61Var2.G;
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        h7 h7Var = new h7(context, 0, d6Var);
        h7Var.setCheckForButtonPress(true);
        return h7Var;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d && g61Var.G == g61Var2.G;
    }
}
