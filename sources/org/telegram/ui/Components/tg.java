package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tg extends j1.b {
    public final /* synthetic */ ug o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(ug ugVar, ug ugVar2) {
        super(ugVar2);
        this.o = ugVar;
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        ug ugVar = this.o;
        ChatActivityEnterView chatActivityEnterView = ugVar.V;
        if (chatActivityEnterView.s4 && chatActivityEnterView.N1 != null && chatActivityEnterView.S3.contains(f7, f10)) {
            return 2;
        }
        return (!chatActivityEnterView.P || chatActivityEnterView.N1 == null || chatActivityEnterView.n4 <= 0.1f || !ugVar.J.contains(f7, f10)) ? -1 : 4;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.V;
        if (chatActivityEnterView.s4) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.P || chatActivityEnterView.N1 == null || chatActivityEnterView.n4 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override // j1.b
    public final void l(int i10, s0.d dVar) {
        ug ugVar = this.o;
        ChatActivityEnterView chatActivityEnterView = ugVar.V;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.U3);
            dVar.o(LocaleController.getString(chatActivityEnterView.p4 > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
            return;
        }
        if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF2 = ugVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.U3);
            dVar.o(LocaleController.getString(chatActivityEnterView.O ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
        }
    }
}
