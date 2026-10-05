package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p91 implements org.telegram.ui.Components.ol0, le.d {
    public final /* synthetic */ ta1 a;

    public /* synthetic */ p91(ta1 ta1Var) {
        this.a = ta1Var;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.a.n0();
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        final ta1 ta1Var = this.a;
        org.telegram.ui.ActionBar.b2[] b2VarArr = ta1Var.g0;
        y91 y91Var = ta1Var.W;
        int i11 = y91Var.I;
        if (i10 < i11 || i10 > y91Var.J) {
            int i12 = y91Var.U;
            if (i10 >= i12 && i10 <= y91Var.V) {
                ((ma1) ta1Var.Q.get(i10 - i12)).c(ta1Var.a, ta1Var, b2VarArr, true);
                return true;
            }
            int i13 = y91Var.R;
            if (i10 >= i13 && i10 <= y91Var.S) {
                ((ma1) ta1Var.O.get(i10 - i13)).c(ta1Var.a, ta1Var, b2VarArr, true);
                return true;
            }
            int i14 = y91Var.X;
            if (i10 >= i14 && i10 <= y91Var.Y) {
                ((ma1) ta1Var.P.get(i10 - i14)).c(ta1Var.a, ta1Var, b2VarArr, true);
                return true;
            }
        } else {
            final MessageObject messageObject = ((qa1) ta1Var.y0.get(i10 - i11)).b;
            if (!messageObject.isStory()) {
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(ta1Var, view);
                final int i15 = 0;
                H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.o91
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                ta1 ta1Var2 = ta1Var;
                                ta1Var2.getClass();
                                ta1Var2.presentFragment(new hj0(messageObject));
                                break;
                            default:
                                ta1 ta1Var3 = ta1Var;
                                ta1Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ta1Var3.b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                ta1Var3.presentFragment(new yn(bundle), false);
                                break;
                        }
                    }
                }, false);
                final int i16 = 1;
                H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.o91
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                ta1 ta1Var2 = ta1Var;
                                ta1Var2.getClass();
                                ta1Var2.presentFragment(new hj0(messageObject));
                                break;
                            default:
                                ta1 ta1Var3 = ta1Var;
                                ta1Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ta1Var3.b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                ta1Var3.presentFragment(new yn(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(ta1Var.S.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }
}
