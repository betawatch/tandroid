package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hf implements zk0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        if (view instanceof ph.x) {
            String command = ((ph.x) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                c5.M(chatActivityEnterView.J2, chatActivityEnterView.L2, new j1(10, this, command), chatActivityEnterView.R3);
                return;
            }
            org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
            if (tnVar == null || !tnVar.e7(view)) {
                c5.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new org.telegram.ui.tm(5, this, command));
            }
        }
    }
}
