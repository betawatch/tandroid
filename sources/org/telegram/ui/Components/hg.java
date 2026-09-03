package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hg extends j1.b {
    public final /* synthetic */ ig o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(ig igVar, ig igVar2) {
        super(igVar2);
        this.o = igVar;
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        ig igVar = this.o;
        ChatActivityEnterView chatActivityEnterView = igVar.S;
        if (chatActivityEnterView.o4 && chatActivityEnterView.J1 != null && chatActivityEnterView.O3.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.M || chatActivityEnterView.J1 == null || chatActivityEnterView.j4 <= 0.1f || !igVar.G.contains(f10, f11)) ? -1 : 4;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.S;
        if (chatActivityEnterView.o4) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.M || chatActivityEnterView.J1 == null || chatActivityEnterView.j4 <= 0.1f) {
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
        ig igVar = this.o;
        ChatActivityEnterView chatActivityEnterView = igVar.S;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.Q3;
            RectF rectF = chatActivityEnterView.O3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.Q3);
            dVar.o(LocaleController.getString(chatActivityEnterView.l4 > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
            return;
        }
        if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.Q3;
            RectF rectF2 = igVar.G;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.Q3);
            dVar.o(LocaleController.getString(chatActivityEnterView.L ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
        }
    }
}
