package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.N6;
                break;
            default:
                xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null && xeVar.length() > 0) {
                    break;
                }
                break;
        }
        return chatActivityEnterView.U0(view);
    }
}
