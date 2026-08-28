package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ sd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i9) {
            case 0:
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.A0.setText(charSequence);
                chatActivityEnterView.A0.setSelection(charSequence.length(), charSequence.length());
                break;
            default:
                int i10 = ChatActivityEnterView.i5;
                chatActivityEnterView.d0((Canvas) obj, false);
                break;
        }
    }
}
