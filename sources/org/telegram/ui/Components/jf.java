package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jf implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        if (r8.getAction() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
    
        if (r6.P2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        r6.w1();
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
        if (i7 == 4 && !chatActivityEnterView.p3 && chatActivityEnterView.T0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.ns.g0 != null && org.telegram.ui.ns.p().E) {
                org.telegram.ui.ns.p().n();
                return true;
            }
            if (chatActivityEnterView.V2 != 1 || chatActivityEnterView.c3 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.V2 == 1 && chatActivityEnterView.c3 != null) {
                        org.telegram.messenger.mp.u1(chatActivityEnterView.R).h7.edit().putInt("hidekeyboard_" + chatActivityEnterView.G3, chatActivityEnterView.c3.e1()).commit();
                    }
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.R1(0, true);
                        eg egVar = chatActivityEnterView.V0;
                        if (egVar != null) {
                            egVar.t(true);
                        }
                        chatActivityEnterView.F0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.p4) {
                        chatActivityEnterView.S1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.r4 == null) {
                        if (chatActivityEnterView.c3 != null && chatActivityEnterView.V2 != 1 && TextUtils.isEmpty(chatActivityEnterView.F0.getTextToUse())) {
                            chatActivityEnterView.Z1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.Z1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i7 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.r3) {
            }
        }
        return false;
    }
}
