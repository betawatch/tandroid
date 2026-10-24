package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i7 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new i7());
    }

    public static m61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        m61 J = m61.J(i7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        j7 j7Var = (j7) view;
        Object obj = m61Var.G;
        if (obj instanceof MessageObject) {
            j7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            j7Var.setTag(audioEntry);
            j7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = m61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            j7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        j7Var.e(m61Var.e, false);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        return m61Var.d == m61Var2.d && m61Var.G == m61Var2.G;
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        j7 j7Var = new j7(context, 0, g6Var);
        j7Var.setCheckForButtonPress(true);
        return j7Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        return m61Var.d == m61Var2.d && m61Var.G == m61Var2.G;
    }
}
