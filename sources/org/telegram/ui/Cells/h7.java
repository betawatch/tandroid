package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h7 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new h7());
    }

    public static j51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        j51 J = j51.J(h7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        i7 i7Var = (i7) view;
        Object obj = j51Var.G;
        if (obj instanceof MessageObject) {
            i7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            i7Var.setTag(audioEntry);
            i7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = j51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            i7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        i7Var.e(j51Var.e, false);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return j51Var.d == j51Var2.d && j51Var.G == j51Var2.G;
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        i7 i7Var = new i7(context, 0, f6Var);
        i7Var.setCheckForButtonPress(true);
        return i7Var;
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        return j51Var.d == j51Var2.d && j51Var.G == j51Var2.G;
    }
}
