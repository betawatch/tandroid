package ig;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import hh.m5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.a61;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q extends a61 {
    public boolean Z1;
    public final /* synthetic */ s a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, s sVar2, Activity activity, c6 c6Var, int i10) {
        super(sVar2, activity, false, null, 6, false, c6Var, 16, i10);
        this.a2 = sVar;
        this.Z1 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.a61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.b.s(null);
        }
    }

    @Override // org.telegram.ui.a61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s sVar = this.a2;
        int i10 = sVar.F;
        ArrayList arrayList = sVar.B;
        LinkedHashMap linkedHashMap = sVar.A;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            t5 t5Var = (t5) linkedHashMap.remove(l10);
            t5Var.setRemoved(new m5(9, this, t5Var));
            sVar.W(t5Var);
            sVar.b.x(l10, true);
            sVar.Y(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            mc.a0(sVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            t5 e9 = s0.e(document, l10, sVar.n.getFontMetricsInt());
            e9.cacheType = k5.g();
            e9.setAdded();
            arrayList.add(h7.n.b(editTextSelectionEnd, 0, arrayList.size()), l10);
            linkedHashMap.put(l10, e9);
            spannableString.setSpan(e9, 0, spannableString.length(), 33);
            sVar.n.getText().insert(editTextSelectionEnd, spannableString);
            sVar.n.setSelection(editTextSelectionEnd + spannableString.length());
            sVar.b.x(l10, true);
            sVar.Y(true);
            sVar.W(e9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
