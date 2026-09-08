package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    
        if (r6.Y1 != null) goto L71;
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
        if (i10 == 4 && !chatActivityEnterView.y2 && chatActivityEnterView.t0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.st.g0 != null && org.telegram.ui.st.q().E) {
                org.telegram.ui.st.q().o();
                return true;
            }
            if (chatActivityEnterView.e2 != 1 || chatActivityEnterView.l2 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.e2 == 1 && chatActivityEnterView.l2 != null) {
                        MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("hidekeyboard_" + chatActivityEnterView.P2, chatActivityEnterView.l2.getId()).commit();
                    }
                    if (chatActivityEnterView.Q1 != 0) {
                        chatActivityEnterView.m1(0, true);
                        eg egVar = chatActivityEnterView.U0;
                        if (egVar != null) {
                            egVar.t(true);
                        }
                        chatActivityEnterView.E0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.y3) {
                        chatActivityEnterView.n1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.A3 == null) {
                        if (chatActivityEnterView.l2 != null && chatActivityEnterView.e2 != 1 && TextUtils.isEmpty(chatActivityEnterView.E0.getTextToUse())) {
                            chatActivityEnterView.t1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.t1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i10 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.A2) {
            }
        }
        return false;
    }
}
