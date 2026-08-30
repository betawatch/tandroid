package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ef implements il0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        if (view instanceof rh.y) {
            String command = ((rh.y) view).getCommand();
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
                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new kh.a1(27, this, command));
            }
        }
    }
}
