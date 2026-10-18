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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class y extends z51 {
    public boolean d2;
    public final /* synthetic */ a0 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, a0 a0Var2, Activity activity, d6 d6Var, int i10) {
        super(a0Var2, activity, false, null, 6, false, d6Var, 16, i10);
        this.e2 = a0Var;
        this.d2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.z51, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d2) {
            this.d2 = false;
            this.e2.b.s(null);
        }
    }

    @Override // org.telegram.ui.z51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.e2;
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
