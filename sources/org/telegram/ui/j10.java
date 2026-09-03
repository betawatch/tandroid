package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j10 extends f2.z0 {
    public final /* synthetic */ u10 a;

    public j10(u10 u10Var) {
        this.a = u10Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.H.getCurrentFocus());
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u10 u10Var = this.a;
        nh.a3 a3Var = u10Var.j0;
        f2.i0 i0Var = u10Var.g0;
        xd.a aVar = u10Var.a;
        d10 d10Var = u10Var.k0;
        if (recyclerView.getAdapter() == null || u10Var.d == null) {
            return;
        }
        int L0 = i0Var.L0();
        int N0 = i0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!u10Var.J && abs > 0 && N0 >= h - 10 && !u10Var.K) {
            AndroidUtilities.runOnUIThread(new d10(this, 1));
        }
        if (u10Var.d != u10Var.R) {
            View pinnedHeader = u10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.t3) {
                org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) pinnedHeader;
                CharSequence text = t3Var.getText();
                if (!TextUtils.isEmpty(text) && t3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) a3Var.d, charSequence)) {
                        a3Var.d = charSequence;
                        ((org.telegram.ui.Components.j6) a3Var.b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(d10Var);
                        AndroidUtilities.runOnUIThread(d10Var, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(d10Var);
            aVar.a(false, true);
            return;
        }
        if (i11 != 0 && !u10Var.f.isEmpty() && TextUtils.isEmpty(u10Var.N)) {
            AndroidUtilities.cancelRunOnUIThread(d10Var);
            AndroidUtilities.runOnUIThread(d10Var, 1650L);
            aVar.a(true, true);
        }
        f2.l1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            MessageObject messageObject = r7Var.e <= 0 ? null : r7Var.b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                a3Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) a3Var.d, formatDateChat)) {
                    return;
                }
                a3Var.d = formatDateChat;
                ((org.telegram.ui.Components.j6) a3Var.b).q(formatDateChat, true, true);
            }
        }
    }
}
