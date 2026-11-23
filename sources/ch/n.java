package ch;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import c8.l9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.s11;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class n extends s11 {
    public boolean f2;
    public final /* synthetic */ p g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, p pVar2, Activity activity, h6 h6Var, int i7) {
        super(pVar2, activity, false, null, 6, false, h6Var, 16, i7);
        this.g2 = pVar;
        this.f2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.s11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.s(null);
        }
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        p pVar = this.g2;
        int i7 = pVar.O;
        ArrayList arrayList = pVar.J;
        LinkedHashMap linkedHashMap = pVar.I;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            y5 y5Var = (y5) linkedHashMap.remove(l10);
            y5Var.setRemoved(new c1.a(5, this, y5Var));
            pVar.c0(y5Var);
            pVar.b.x(l10, true);
            pVar.e0(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i7) {
            lc.b0(pVar).t(hd.G(i7, "ReactionMaxCountError", new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = pVar.h.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            y5 e10 = s0.e(document, l10, pVar.h.getFontMetricsInt());
            e10.cacheType = p5.f();
            e10.setAdded();
            arrayList.add(l9.b(editTextSelectionEnd, 0, arrayList.size()), l10);
            linkedHashMap.put(l10, e10);
            spannableString.setSpan(e10, 0, spannableString.length(), 33);
            pVar.h.getText().insert(editTextSelectionEnd, spannableString);
            pVar.h.setSelection(editTextSelectionEnd + spannableString.length());
            pVar.b.x(l10, true);
            pVar.e0(true);
            pVar.c0(e10);
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
