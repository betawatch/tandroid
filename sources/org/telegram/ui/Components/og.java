package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class og extends k1.b {
    public final /* synthetic */ pg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(pg pgVar, pg pgVar2) {
        super(pgVar2);
        this.o = pgVar;
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        pg pgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = pgVar.Q0;
        if (chatActivityEnterView.g5 && chatActivityEnterView.B2 != null && chatActivityEnterView.G4.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.Q || chatActivityEnterView.B2 == null || chatActivityEnterView.b5 <= 0.1f || !pgVar.K.contains(f10, f11)) ? -1 : 4;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.Q0;
        if (chatActivityEnterView.g5) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.Q || chatActivityEnterView.B2 == null || chatActivityEnterView.b5 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override // k1.b
    public final void l(int i7, s0.c cVar) {
        pg pgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = pgVar.Q0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.I4;
            RectF rectF = chatActivityEnterView.G4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.I4);
            cVar.o(org.telegram.messenger.gd.M0(chatActivityEnterView.d5 > 0.5f ? 2131754927 : 2131754930, null));
            return;
        }
        if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.I4;
            RectF rectF2 = pgVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.I4);
            cVar.o(org.telegram.messenger.gd.M0(chatActivityEnterView.P ? 2131754934 : 2131754935, null));
        }
    }
}
