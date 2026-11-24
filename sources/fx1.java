// default package

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fx1 implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public fx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        if (r7.getAction() != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if (r4.P2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d9, code lost:
    
        r4.u1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        return true;
     */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (keyEvent != null) {
            chatActivityEnterView.E0 = keyEvent.isShiftPressed();
            chatActivityEnterView.D0 = keyEvent.isCtrlPressed();
        }
        if (i == 4 && !chatActivityEnterView.p3 && chatActivityEnterView.Q0() && keyEvent.getAction() == 1) {
            if (xv2.g0 != null && xv2.e().E) {
                xv2.e().c();
                return true;
            }
            if (chatActivityEnterView.V2 != 1 || chatActivityEnterView.c3 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.V2 == 1 && chatActivityEnterView.c3 != null) {
                        na7.q1(chatActivityEnterView.R).X3.edit().putInt("hidekeyboard_" + chatActivityEnterView.G3, chatActivityEnterView.c3.e1()).commit();
                    }
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.O1(0, true);
                        wx1 wx1Var = chatActivityEnterView.V0;
                        if (wx1Var != null) {
                            wx1Var.s(true);
                        }
                        chatActivityEnterView.F0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.p4) {
                        chatActivityEnterView.P1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.r4 == null) {
                        if (chatActivityEnterView.c3 != null && chatActivityEnterView.V2 != 1 && TextUtils.isEmpty(chatActivityEnterView.F0.getTextToUse())) {
                            chatActivityEnterView.W1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.W1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.r3) {
            }
        }
        return false;
    }
}
