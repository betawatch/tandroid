package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class j10 extends s4.s0 {
    public final /* synthetic */ u10 a;

    public j10(u10 u10Var) {
        this.a = u10Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u10 u10Var = this.a;
        ai.n4 n4Var = u10Var.m0;
        s4.c0 c0Var = u10Var.j0;
        le.c cVar = u10Var.a;
        d10 d10Var = u10Var.n0;
        if (recyclerView.getAdapter() == null || u10Var.d == null) {
            return;
        }
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!u10Var.M && abs > 0 && N0 >= h - 10 && !u10Var.N) {
            AndroidUtilities.runOnUIThread(new d10(this, 1));
        }
        if (u10Var.d != u10Var.U) {
            View pinnedHeader = u10Var.b.getPinnedHeader();
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
                        AndroidUtilities.cancelRunOnUIThread(d10Var);
                        AndroidUtilities.runOnUIThread(d10Var, 1650L);
                        cVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(d10Var);
            cVar.a(false, true);
            return;
        }
        if (i11 != 0 && !u10Var.f.isEmpty() && TextUtils.isEmpty(u10Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(d10Var);
            AndroidUtilities.runOnUIThread(d10Var, 1650L);
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
