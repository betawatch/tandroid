package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gf implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public gf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        if (r8.getAction() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if (r6.V1 != null) goto L71;
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
            chatActivityEnterView.A0 = keyEvent.isShiftPressed();
            chatActivityEnterView.z0 = keyEvent.isCtrlPressed();
        }
        if (i10 == 4 && !chatActivityEnterView.v2 && chatActivityEnterView.t0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.qt.g0 != null && org.telegram.ui.qt.q().E) {
                org.telegram.ui.qt.q().o();
                return true;
            }
            if (chatActivityEnterView.b2 != 1 || chatActivityEnterView.i2 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.b2 == 1 && chatActivityEnterView.i2 != null) {
                        MessagesController.getMainSettings(chatActivityEnterView.N).edit().putInt("hidekeyboard_" + chatActivityEnterView.M2, chatActivityEnterView.i2.getId()).commit();
                    }
                    if (chatActivityEnterView.N1 != 0) {
                        chatActivityEnterView.m1(0, true);
                        uf ufVar = chatActivityEnterView.R0;
                        if (ufVar != null) {
                            ufVar.t(true);
                        }
                        chatActivityEnterView.B0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.v3) {
                        chatActivityEnterView.n1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.x3 == null) {
                        if (chatActivityEnterView.i2 != null && chatActivityEnterView.b2 != 1 && TextUtils.isEmpty(chatActivityEnterView.B0.getTextToUse())) {
                            chatActivityEnterView.t1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.t1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i10 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.x2) {
            }
        }
        return false;
    }
}
