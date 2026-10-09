package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l10 extends s4.t0 {
    public final /* synthetic */ w10 a;

    public l10(w10 w10Var) {
        this.a = w10Var;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        w10 w10Var = this.a;
        ai.o4 o4Var = w10Var.m0;
        s4.d0 d0Var = w10Var.j0;
        me.b bVar = w10Var.a;
        uz uzVar = w10Var.n0;
        if (recyclerView.getAdapter() == null || w10Var.d == null) {
            return;
        }
        int L0 = d0Var.L0();
        int N0 = d0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!w10Var.M && abs > 0 && N0 >= h - 10 && !w10Var.N) {
            AndroidUtilities.runOnUIThread(new uz(this, 2));
        }
        if (w10Var.d != w10Var.U) {
            View pinnedHeader = w10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) o4Var.d, charSequence)) {
                        o4Var.d = charSequence;
                        ((org.telegram.ui.Components.q6) o4Var.b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(uzVar);
                        AndroidUtilities.runOnUIThread(uzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(uzVar);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !w10Var.f.isEmpty() && TextUtils.isEmpty(w10Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(uzVar);
            AndroidUtilities.runOnUIThread(uzVar, 1650L);
            bVar.a(true, true);
        }
        s4.d1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            MessageObject messageObject = u7Var.e <= 0 ? null : u7Var.b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                o4Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) o4Var.d, formatDateChat)) {
                    return;
                }
                o4Var.d = formatDateChat;
                ((org.telegram.ui.Components.q6) o4Var.b).t(formatDateChat, true, true);
            }
        }
    }
}
