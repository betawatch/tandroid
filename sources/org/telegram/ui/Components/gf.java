package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    
        if (r6.U1 != null) goto L71;
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
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (keyEvent != null) {
            chatActivityEnterView.z0 = keyEvent.isShiftPressed();
            chatActivityEnterView.y0 = keyEvent.isCtrlPressed();
        }
        if (i9 == 4 && !chatActivityEnterView.u2 && chatActivityEnterView.s0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.ht.g0 != null && org.telegram.ui.ht.q().E) {
                org.telegram.ui.ht.q().o();
                return true;
            }
            if (chatActivityEnterView.a2 != 1 || chatActivityEnterView.h2 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.a2 == 1 && chatActivityEnterView.h2 != null) {
                        MessagesController.getMainSettings(chatActivityEnterView.M).edit().putInt("hidekeyboard_" + chatActivityEnterView.L2, chatActivityEnterView.h2.getId()).commit();
                    }
                    if (chatActivityEnterView.M1 != 0) {
                        chatActivityEnterView.m1(0, true);
                        uf ufVar = chatActivityEnterView.Q0;
                        if (ufVar != null) {
                            ufVar.t(true);
                        }
                        chatActivityEnterView.A0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.u3) {
                        chatActivityEnterView.n1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.w3 == null) {
                        if (chatActivityEnterView.h2 != null && chatActivityEnterView.a2 != 1 && TextUtils.isEmpty(chatActivityEnterView.A0.getTextToUse())) {
                            chatActivityEnterView.t1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.t1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i9 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.w2) {
            }
        }
        return false;
    }
}
