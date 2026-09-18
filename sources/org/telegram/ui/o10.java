package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o10 extends s4.s0 {
    public final /* synthetic */ z10 a;

    public o10(z10 z10Var) {
        this.a = z10Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        z10 z10Var = this.a;
        ai.n4 n4Var = z10Var.m0;
        s4.c0 c0Var = z10Var.j0;
        le.b bVar = z10Var.a;
        i10 i10Var = z10Var.n0;
        if (recyclerView.getAdapter() == null || z10Var.d == null) {
            return;
        }
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!z10Var.M && abs > 0 && N0 >= h - 10 && !z10Var.N) {
            AndroidUtilities.runOnUIThread(new i10(this, 1));
        }
        if (z10Var.d != z10Var.U) {
            View pinnedHeader = z10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) n4Var.d, charSequence)) {
                        n4Var.d = charSequence;
                        ((org.telegram.ui.Components.m6) n4Var.b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(i10Var);
                        AndroidUtilities.runOnUIThread(i10Var, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(i10Var);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !z10Var.f.isEmpty() && TextUtils.isEmpty(z10Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(i10Var);
            AndroidUtilities.runOnUIThread(i10Var, 1650L);
            bVar.a(true, true);
        }
        s4.c1 L = recyclerView.L(L0);
        if (L == null || L.f != 0) {
            return;
        }
        View view = L.a;
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
                ((org.telegram.ui.Components.m6) n4Var.b).q(formatDateChat, true, true);
            }
        }
    }
}
