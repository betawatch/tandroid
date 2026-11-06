package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
    
        if (r6.Z1 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        r6.S0();
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
            chatActivityEnterView.D0 = keyEvent.isShiftPressed();
            chatActivityEnterView.C0 = keyEvent.isCtrlPressed();
        }
        if (i7 == 4 && !chatActivityEnterView.z2 && chatActivityEnterView.s0() && keyEvent.getAction() == 1) {
            if (org.telegram.ui.ks.g0 != null && org.telegram.ui.ks.p().E) {
                org.telegram.ui.ks.p().n();
                return true;
            }
            if (chatActivityEnterView.f2 != 1 || chatActivityEnterView.m2 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.f2 == 1 && chatActivityEnterView.m2 != null) {
                        org.telegram.messenger.qp.s1(chatActivityEnterView.Q).e7.edit().putInt("hidekeyboard_" + chatActivityEnterView.Q2, chatActivityEnterView.m2.f1()).commit();
                    }
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.m1(0, true);
                        mf mfVar = chatActivityEnterView.U0;
                        if (mfVar != null) {
                            mfVar.t(true);
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
        } else if (i7 == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.B2) {
            }
        }
        return false;
    }
}
