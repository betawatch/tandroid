package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ef implements hl0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        if (view instanceof rh.x) {
            String command = ((rh.x) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                z4.M(chatActivityEnterView.K2, chatActivityEnterView.M2, new o1(9, this, command), chatActivityEnterView.S3);
                return;
            }
            org.telegram.ui.zn znVar = chatActivityEnterView.L2;
            if (znVar == null || !znVar.e7(view)) {
                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new kh.a1(27, this, command));
            }
        }
    }
}
