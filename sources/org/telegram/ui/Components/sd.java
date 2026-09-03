package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.B0.setText(charSequence);
                chatActivityEnterView.B0.setSelection(charSequence.length(), charSequence.length());
                break;
            default:
                int i11 = ChatActivityEnterView.j5;
                chatActivityEnterView.e0((Canvas) obj, false);
                break;
        }
    }
}
