package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g7 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new g7());
    }

    public static h51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        h51 J = h51.J(g7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        h7 h7Var = (h7) view;
        Object obj = h51Var.G;
        if (obj instanceof MessageObject) {
            h7Var.f((MessageObject) obj, z4);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            h7Var.setTag(audioEntry);
            h7Var.f(audioEntry.messageObject, z4);
        }
        Object obj2 = h51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            h7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        h7Var.e(h51Var.e, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d && h51Var.G == h51Var2.G;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        h7 h7Var = new h7(context, 0, g6Var);
        h7Var.setCheckForButtonPress(true);
        return h7Var;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d && h51Var.G == h51Var2.G;
    }
}
