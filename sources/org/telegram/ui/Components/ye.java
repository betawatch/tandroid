package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ye implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public ye(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        if (r8.getAction() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
    
        if (r6.H2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        r6.j1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
    
        return true;
     */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (keyEvent != null) {
            chatActivityEnterView.E0 = keyEvent.isShiftPressed();
            chatActivityEnterView.D0 = keyEvent.isCtrlPressed();
        }
        if (i7 == 4 && !chatActivityEnterView.h3 && chatActivityEnterView.G0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.ns.g0 != null && org.telegram.ui.ns.p().E) {
                org.telegram.ui.ns.p().n();
                return true;
            }
            if (chatActivityEnterView.N2 != 1 || chatActivityEnterView.U2 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.N2 == 1 && chatActivityEnterView.U2 != null) {
                        org.telegram.messenger.np.s1(chatActivityEnterView.R).f7.edit().putInt("hidekeyboard_" + chatActivityEnterView.y3, chatActivityEnterView.U2.e1()).commit();
                    }
                    if (chatActivityEnterView.z2 != 0) {
                        chatActivityEnterView.D1(0, true);
                        sf sfVar = chatActivityEnterView.V0;
                        if (sfVar != null) {
                            sfVar.t(true);
                        }
                        chatActivityEnterView.F0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.h4) {
                        chatActivityEnterView.E1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.j4 == null) {
                        if (chatActivityEnterView.U2 != null && chatActivityEnterView.N2 != 1 && TextUtils.isEmpty(chatActivityEnterView.F0.getTextToUse())) {
                            chatActivityEnterView.L1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.L1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i7 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.j3) {
            }
        }
        return false;
    }
}
