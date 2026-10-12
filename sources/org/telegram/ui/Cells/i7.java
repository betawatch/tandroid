package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i7 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new i7());
    }

    public static l61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        l61 J = l61.J(i7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        j7 j7Var = (j7) view;
        Object obj = l61Var.G;
        if (obj instanceof MessageObject) {
            j7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            j7Var.setTag(audioEntry);
            j7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = l61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            j7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        j7Var.e(l61Var.e, false);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        return l61Var.d == l61Var2.d && l61Var.G == l61Var2.G;
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        j7 j7Var = new j7(context, 0, c6Var);
        j7Var.setCheckForButtonPress(true);
        return j7Var;
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        return l61Var.d == l61Var2.d && l61Var.G == l61Var2.G;
    }
}
