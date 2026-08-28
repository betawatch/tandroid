package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ef implements mk0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        if (view instanceof mh.a0) {
            String command = ((mh.a0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                y4.M(chatActivityEnterView.J2, chatActivityEnterView.L2, new g1(10, this, command), chatActivityEnterView.R3);
                return;
            }
            org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
            if (qnVar == null || !qnVar.e7(view)) {
                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new org.telegram.ui.df(12, this, command));
            }
        }
    }
}
