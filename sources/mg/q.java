package mg;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import lh.n2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.x61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q extends x61 {
    public boolean a2;
    public final /* synthetic */ s b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, s sVar2, Activity activity, f6 f6Var, int i10) {
        super(sVar2, activity, false, null, 6, false, f6Var, 16, i10);
        this.b2 = sVar;
        this.a2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.x61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.a2) {
            this.a2 = false;
            this.b2.b.s(null);
        }
    }

    @Override // org.telegram.ui.x61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s sVar = this.b2;
        int i10 = sVar.G;
        ArrayList arrayList = sVar.C;
        LinkedHashMap linkedHashMap = sVar.B;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            u5 u5Var = (u5) linkedHashMap.remove(l10);
            u5Var.setRemoved(new n2(18, this, u5Var));
            sVar.W(u5Var);
            sVar.b.x(l10, true);
            sVar.Y(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            qc.a0(sVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            u5 e = s0.e(document, l10, sVar.n.getFontMetricsInt());
            e.cacheType = l5.g();
            e.setAdded();
            arrayList.add(k7.n.b(editTextSelectionEnd, 0, arrayList.size()), l10);
            linkedHashMap.put(l10, e);
            spannableString.setSpan(e, 0, spannableString.length(), 33);
            sVar.n.getText().insert(editTextSelectionEnd, spannableString);
            sVar.n.setSelection(editTextSelectionEnd + spannableString.length());
            sVar.b.x(l10, true);
            sVar.Y(true);
            sVar.W(e);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
