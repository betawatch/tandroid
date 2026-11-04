package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class we implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        if (r8.getAction() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
    
        if (r6.a2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        r6.R0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
    
        return true;
     */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (keyEvent != null) {
            chatActivityEnterView.E0 = keyEvent.isShiftPressed();
            chatActivityEnterView.D0 = keyEvent.isCtrlPressed();
        }
        if (i3 == 4 && !chatActivityEnterView.A2 && chatActivityEnterView.r0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.is.g0 != null && org.telegram.ui.is.p().E) {
                org.telegram.ui.is.p().n();
                return true;
            }
            if (chatActivityEnterView.g2 != 1 || chatActivityEnterView.n2 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.g2 == 1 && chatActivityEnterView.n2 != null) {
                        org.telegram.messenger.hp.s1(chatActivityEnterView.R).e7.edit().putInt("hidekeyboard_" + chatActivityEnterView.R2, chatActivityEnterView.n2.f1()).commit();
                    }
                    if (chatActivityEnterView.S1 != 0) {
                        chatActivityEnterView.l1(0, true);
                        kf kfVar = chatActivityEnterView.V0;
                        if (kfVar != null) {
                            kfVar.t(true);
                        }
                        chatActivityEnterView.F0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.A3) {
                        chatActivityEnterView.m1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.C3 == null) {
                        if (chatActivityEnterView.n2 != null && chatActivityEnterView.g2 != 1 && TextUtils.isEmpty(chatActivityEnterView.F0.getTextToUse())) {
                            chatActivityEnterView.s1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.s1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i3 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.C2) {
            }
        }
        return false;
    }
}
