package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ef implements jl0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        if (view instanceof sh.x) {
            String command = ((sh.x) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                z4.M(chatActivityEnterView.K2, chatActivityEnterView.M2, new o1(9, this, command), chatActivityEnterView.S3);
                return;
            }
            org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
            if (xnVar == null || !xnVar.e7(view)) {
                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new lh.a1(27, this, command));
            }
        }
    }
}
