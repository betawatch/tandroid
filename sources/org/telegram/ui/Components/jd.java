package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i3) {
            case 0:
                chatActivityEnterView.P0((TL_iv.RichMessage) obj);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                break;
            default:
                int i10 = ChatActivityEnterView.t5;
                chatActivityEnterView.b0((Canvas) obj, false);
                break;
        }
    }
}
