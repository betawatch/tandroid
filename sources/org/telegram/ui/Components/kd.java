package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ kd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                chatActivityEnterView.h1((TL_iv.RichMessage) obj);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                break;
            default:
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.k0((Canvas) obj, false);
                break;
        }
    }
}
