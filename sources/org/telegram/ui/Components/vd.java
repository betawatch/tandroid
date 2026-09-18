package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.n5;
                break;
            default:
                of ofVar = chatActivityEnterView.E0;
                if (ofVar != null && ofVar.length() > 0) {
                    break;
                }
                break;
        }
        return chatActivityEnterView.G0(view);
    }
}
