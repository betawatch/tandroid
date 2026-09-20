package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ bw(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                Object obj = uyVar.C0.w0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ai.v8) {
                        ai.v8 v8Var = (ai.v8) obj;
                        Bundle g10 = org.telegram.ui.Cells.c1.g(3, TeXSymbolParser.TYPE_ATTR);
                        g10.putString("hashtag", v8Var.C);
                        g10.putInt("storiesCount", v8Var.J);
                        uyVar.presentFragment(new org.telegram.ui.Components.ja0(g10, null));
                        break;
                    }
                } else {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    zn znVar = new zn(bundle);
                    uy.d4(znVar, messageObject);
                    uyVar.presentFragment(znVar);
                    break;
                }
                break;
            default:
                uy uyVar2 = this.b;
                uyVar2.b0.J0(true);
                ArrayList arrayList = uyVar2.b0.X2;
                uyVar2.j3(arrayList.isEmpty() ? gg.s0.c3[i10] : (gg.q0) arrayList.get(i10));
                break;
        }
    }
}
