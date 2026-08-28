package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        ChatActivityEnterView chatActivityEnterView = igVar.R;
        if (chatActivityEnterView.n4 && chatActivityEnterView.I1 != null && chatActivityEnterView.N3.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.L || chatActivityEnterView.I1 == null || chatActivityEnterView.i4 <= 0.1f || !igVar.F.contains(f10, f11)) ? -1 : 4;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.R;
        if (chatActivityEnterView.n4) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.L || chatActivityEnterView.I1 == null || chatActivityEnterView.i4 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // j1.b
    public final boolean k(int i9, int i10) {
        return true;
    }

    @Override // j1.b
    public final void l(int i9, s0.d dVar) {
        ig igVar = this.o;
        ChatActivityEnterView chatActivityEnterView = igVar.R;
        if (i9 == 2) {
            Rect rect = chatActivityEnterView.P3;
            RectF rectF = chatActivityEnterView.N3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.P3);
            dVar.o(LocaleController.getString(chatActivityEnterView.k4 > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
            return;
        }
        if (i9 == 4) {
            Rect rect2 = chatActivityEnterView.P3;
            RectF rectF2 = igVar.F;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.P3);
            dVar.o(LocaleController.getString(chatActivityEnterView.K ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
        }
    }
}
