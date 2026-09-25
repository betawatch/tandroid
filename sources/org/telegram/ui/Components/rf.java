package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rf implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        if (r8.getAction() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if (r6.Z1 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d9, code lost:
    
        r6.S0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        return true;
     */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (keyEvent != null) {
            chatActivityEnterView.D0 = keyEvent.isShiftPressed();
            chatActivityEnterView.C0 = keyEvent.isCtrlPressed();
        }
        if (i10 == 4 && !chatActivityEnterView.z2 && chatActivityEnterView.t0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.nt.g0 != null && org.telegram.ui.nt.q().E) {
                org.telegram.ui.nt.q().o();
                return true;
            }
            if (chatActivityEnterView.f2 != 1 || chatActivityEnterView.m2 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.f2 == 1 && chatActivityEnterView.m2 != null) {
                        MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("hidekeyboard_" + chatActivityEnterView.Q2, chatActivityEnterView.m2.getId()).commit();
                    }
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.m1(0, true);
                        eg egVar = chatActivityEnterView.U0;
                        if (egVar != null) {
                            egVar.t(true);
                        }
                        chatActivityEnterView.E0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.z3) {
                        chatActivityEnterView.n1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.B3 == null) {
                        if (chatActivityEnterView.m2 != null && chatActivityEnterView.f2 != 1 && TextUtils.isEmpty(chatActivityEnterView.E0.getTextToUse())) {
                            chatActivityEnterView.t1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.t1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i10 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.B2) {
            }
        }
        return false;
    }
}
