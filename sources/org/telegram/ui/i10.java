package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class i10 extends s4.s0 {
    public final /* synthetic */ t10 a;

    public i10(t10 t10Var) {
        this.a = t10Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t10 t10Var = this.a;
        ai.n4 n4Var = t10Var.m0;
        s4.c0 c0Var = t10Var.j0;
        le.c cVar = t10Var.a;
        c10 c10Var = t10Var.n0;
        if (recyclerView.getAdapter() == null || t10Var.d == null) {
            return;
        }
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!t10Var.M && abs > 0 && N0 >= h - 10 && !t10Var.N) {
            AndroidUtilities.runOnUIThread(new c10(this, 1));
        }
        if (t10Var.d != t10Var.U) {
            View pinnedHeader = t10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) n4Var.d, charSequence)) {
                        n4Var.d = charSequence;
                        ((org.telegram.ui.Components.o6) n4Var.b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(c10Var);
                        AndroidUtilities.runOnUIThread(c10Var, 1650L);
                        cVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(c10Var);
            cVar.a(false, true);
            return;
        }
        if (i11 != 0 && !t10Var.f.isEmpty() && TextUtils.isEmpty(t10Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(c10Var);
            AndroidUtilities.runOnUIThread(c10Var, 1650L);
            cVar.a(true, true);
        }
        s4.c1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            MessageObject messageObject = u7Var.e <= 0 ? null : u7Var.b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                n4Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) n4Var.d, formatDateChat)) {
                    return;
                }
                n4Var.d = formatDateChat;
                ((org.telegram.ui.Components.o6) n4Var.b).q(formatDateChat, true, true);
            }
        }
    }
}
