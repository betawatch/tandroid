package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e7 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new e7());
    }

    public static w41 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        w41 J = w41.J(e7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        f7 f7Var = (f7) view;
        Object obj = w41Var.G;
        if (obj instanceof MessageObject) {
            f7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            f7Var.setTag(audioEntry);
            f7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = w41Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            f7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        f7Var.e(w41Var.e, false);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return w41Var.d == w41Var2.d && w41Var.G == w41Var2.G;
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        f7 f7Var = new f7(context, 0, c6Var);
        f7Var.setCheckForButtonPress(true);
        return f7Var;
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        return w41Var.d == w41Var2.d && w41Var.G == w41Var2.G;
    }
}
