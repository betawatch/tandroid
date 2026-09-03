package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i10 extends f2.a1 {
    public final /* synthetic */ t10 a;

    public i10(t10 t10Var) {
        this.a = t10Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.H.getCurrentFocus());
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t10 t10Var = this.a;
        oh.b3 b3Var = t10Var.j0;
        f2.j0 j0Var = t10Var.g0;
        xd.a aVar = t10Var.a;
        c10 c10Var = t10Var.k0;
        if (recyclerView.getAdapter() == null || t10Var.d == null) {
            return;
        }
        int L0 = j0Var.L0();
        int N0 = j0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!t10Var.J && abs > 0 && N0 >= h - 10 && !t10Var.K) {
            AndroidUtilities.runOnUIThread(new c10(this, 1));
        }
        if (t10Var.d != t10Var.R) {
            View pinnedHeader = t10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) b3Var.d, charSequence)) {
                        b3Var.d = charSequence;
                        ((org.telegram.ui.Components.j6) b3Var.b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(c10Var);
                        AndroidUtilities.runOnUIThread(c10Var, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(c10Var);
            aVar.a(false, true);
            return;
        }
        if (i11 != 0 && !t10Var.f.isEmpty() && TextUtils.isEmpty(t10Var.N)) {
            AndroidUtilities.cancelRunOnUIThread(c10Var);
            AndroidUtilities.runOnUIThread(c10Var, 1650L);
            aVar.a(true, true);
        }
        f2.m1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            MessageObject messageObject = s7Var.e <= 0 ? null : s7Var.b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                b3Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) b3Var.d, formatDateChat)) {
                    return;
                }
                b3Var.d = formatDateChat;
                ((org.telegram.ui.Components.j6) b3Var.b).q(formatDateChat, true, true);
            }
        }
    }
}
