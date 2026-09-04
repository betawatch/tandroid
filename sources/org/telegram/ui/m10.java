package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class m10 extends s4.s0 {
    public final /* synthetic */ x10 a;

    public m10(x10 x10Var) {
        this.a = x10Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        x10 x10Var = this.a;
        bi.a4 a4Var = x10Var.m0;
        s4.c0 c0Var = x10Var.j0;
        le.b bVar = x10Var.a;
        g10 g10Var = x10Var.n0;
        if (recyclerView.getAdapter() == null || x10Var.d == null) {
            return;
        }
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!x10Var.M && abs > 0 && N0 >= h - 10 && !x10Var.N) {
            AndroidUtilities.runOnUIThread(new g10(this, 1));
        }
        if (x10Var.d != x10Var.U) {
            View pinnedHeader = x10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) a4Var.d, charSequence)) {
                        a4Var.d = charSequence;
                        ((org.telegram.ui.Components.p6) a4Var.b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(g10Var);
                        AndroidUtilities.runOnUIThread(g10Var, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(g10Var);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !x10Var.f.isEmpty() && TextUtils.isEmpty(x10Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(g10Var);
            AndroidUtilities.runOnUIThread(g10Var, 1650L);
            bVar.a(true, true);
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
                a4Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) a4Var.d, formatDateChat)) {
                    return;
                }
                a4Var.d = formatDateChat;
                ((org.telegram.ui.Components.p6) a4Var.b).q(formatDateChat, true, true);
            }
        }
    }
}
