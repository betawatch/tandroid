package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zf extends k1.b {
    public final /* synthetic */ ag o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(ag agVar, ag agVar2) {
        super(agVar2);
        this.o = agVar;
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        ag agVar = this.o;
        ChatActivityEnterView chatActivityEnterView = agVar.b0;
        if (chatActivityEnterView.s4 && chatActivityEnterView.N1 != null && chatActivityEnterView.S3.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.P || chatActivityEnterView.N1 == null || chatActivityEnterView.n4 <= 0.1f || !agVar.J.contains(f10, f11)) ? -1 : 4;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.b0;
        if (chatActivityEnterView.s4) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.P || chatActivityEnterView.N1 == null || chatActivityEnterView.n4 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override // k1.b
    public final void l(int i7, s0.d dVar) {
        ag agVar = this.o;
        ChatActivityEnterView chatActivityEnterView = agVar.b0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.U3);
            dVar.o(org.telegram.messenger.hd.M0(chatActivityEnterView.p4 > 0.5f ? 2131754927 : 2131754930, null));
            return;
        }
        if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF2 = agVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.U3);
            dVar.o(org.telegram.messenger.hd.M0(chatActivityEnterView.O ? 2131754934 : 2131754935, null));
        }
    }
}
