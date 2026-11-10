package ch;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import bi.a4;
import c8.j9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.t11;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m extends t11 {
    public boolean e2;
    public final /* synthetic */ o f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, o oVar2, Activity activity, h6 h6Var, int i7) {
        super(oVar2, activity, false, null, 6, false, h6Var, 16, i7);
        this.f2 = oVar;
        this.e2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.t11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.e2) {
            this.e2 = false;
            this.f2.b.s(null);
        }
    }

    @Override // org.telegram.ui.t11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        o oVar = this.f2;
        int i7 = oVar.N;
        ArrayList arrayList = oVar.I;
        LinkedHashMap linkedHashMap = oVar.H;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            q5 q5Var = (q5) linkedHashMap.remove(l10);
            q5Var.setRemoved(new a4(17, this, q5Var));
            oVar.c0(q5Var);
            oVar.b.x(l10, true);
            oVar.e0(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i7) {
            gc.a0(oVar).t(id.G(i7, "ReactionMaxCountError", new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            q5 e10 = q0.e(document, l10, oVar.h.getFontMetricsInt());
            e10.cacheType = h5.f();
            e10.setAdded();
            arrayList.add(j9.b(editTextSelectionEnd, 0, arrayList.size()), l10);
            linkedHashMap.put(l10, e10);
            spannableString.setSpan(e10, 0, spannableString.length(), 33);
            oVar.h.getText().insert(editTextSelectionEnd, spannableString);
            oVar.h.setSelection(editTextSelectionEnd + spannableString.length());
            oVar.b.x(l10, true);
            oVar.e0(true);
            oVar.c0(e10);
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
