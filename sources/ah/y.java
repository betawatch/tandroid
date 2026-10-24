package ah;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.b61;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class y extends b61 {
    public boolean e2;
    public final /* synthetic */ a0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, a0 a0Var2, Activity activity, g6 g6Var, int i10) {
        super(a0Var2, activity, false, null, 6, false, g6Var, 16, i10);
        this.f2 = a0Var;
        this.e2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.b61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.e2) {
            this.e2 = false;
            this.f2.b.s(null);
        }
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.f2;
        int i10 = a0Var.J;
        ArrayList arrayList = a0Var.F;
        LinkedHashMap linkedHashMap = a0Var.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            a6 a6Var = (a6) linkedHashMap.remove(l4);
            a6Var.setRemoved(new a1.f(9, this, a6Var));
            a0Var.W(a6Var);
            a0Var.b.x(l4, true);
            a0Var.Y(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            xc.a0(a0Var).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = a0Var.n.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            a6 e = l1.e(document, l4, a0Var.n.getFontMetricsInt());
            e.cacheType = r5.g();
            e.setAdded();
            arrayList.add(w7.r.b(editTextSelectionEnd, 0, arrayList.size()), l4);
            linkedHashMap.put(l4, e);
            spannableString.setSpan(e, 0, spannableString.length(), 33);
            a0Var.n.getText().insert(editTextSelectionEnd, spannableString);
            a0Var.n.setSelection(editTextSelectionEnd + spannableString.length());
            a0Var.b.x(l4, true);
            a0Var.Y(true);
            a0Var.W(e);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
