package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h7 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new h7());
    }

    public static i51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        i51 J = i51.J(h7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        i7 i7Var = (i7) view;
        Object obj = i51Var.G;
        if (obj instanceof MessageObject) {
            i7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            i7Var.setTag(audioEntry);
            i7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = i51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            i7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        i7Var.e(i51Var.e, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d && i51Var.G == i51Var2.G;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        i7 i7Var = new i7(context, 0, e6Var);
        i7Var.setCheckForButtonPress(true);
        return i7Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d && i51Var.G == i51Var2.G;
    }
}
