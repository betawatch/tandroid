package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hf implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        if (r8.getAction() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
    
        if (r6.N2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        r6.r1();
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
        if (i7 == 4 && !chatActivityEnterView.n3 && chatActivityEnterView.O0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.ns.g0 != null && org.telegram.ui.ns.p().E) {
                org.telegram.ui.ns.p().n();
                return true;
            }
            if (chatActivityEnterView.T2 != 1 || chatActivityEnterView.a3 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.T2 == 1 && chatActivityEnterView.a3 != null) {
                        org.telegram.messenger.mp.u1(chatActivityEnterView.R).h7.edit().putInt("hidekeyboard_" + chatActivityEnterView.E3, chatActivityEnterView.a3.e1()).commit();
                    }
                    if (chatActivityEnterView.F2 != 0) {
                        chatActivityEnterView.L1(0, true);
                        cg cgVar = chatActivityEnterView.V0;
                        if (cgVar != null) {
                            cgVar.t(true);
                        }
                        chatActivityEnterView.F0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.n4) {
                        chatActivityEnterView.M1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.p4 == null) {
                        if (chatActivityEnterView.a3 != null && chatActivityEnterView.T2 != 1 && TextUtils.isEmpty(chatActivityEnterView.F0.getTextToUse())) {
                            chatActivityEnterView.T1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.T1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i7 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.p3) {
            }
        }
        return false;
    }
}
