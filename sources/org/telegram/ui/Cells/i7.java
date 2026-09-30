package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class i7 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new i7());
    }

    public static x51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        x51 J = x51.J(i7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        j7 j7Var = (j7) view;
        Object obj = x51Var.G;
        if (obj instanceof MessageObject) {
            j7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            j7Var.setTag(audioEntry);
            j7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = x51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            j7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        j7Var.e(x51Var.e, false);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        return x51Var.d == x51Var2.d && x51Var.G == x51Var2.G;
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        j7 j7Var = new j7(context, 0, d6Var);
        j7Var.setCheckForButtonPress(true);
        return j7Var;
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        return x51Var.d == x51Var2.d && x51Var.G == x51Var2.G;
    }
}
