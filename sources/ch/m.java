package ch;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import c8.i9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.n11;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m extends n11 {
    public boolean f2;
    public final /* synthetic */ o g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, o oVar2, Activity activity, e6 e6Var, int i7) {
        super(oVar2, activity, false, null, 6, false, e6Var, 16, i7);
        this.g2 = oVar;
        this.f2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.n11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.s(null);
        }
    }

    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        o oVar = this.g2;
        int i7 = oVar.O;
        ArrayList arrayList = oVar.J;
        LinkedHashMap linkedHashMap = oVar.I;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            p5 p5Var = (p5) linkedHashMap.remove(l10);
            p5Var.setRemoved(new c1.c(4, this, p5Var));
            oVar.c0(p5Var);
            oVar.b.x(l10, true);
            oVar.e0(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i7) {
            cc.a0(oVar).t(hd.G(i7, "ReactionMaxCountError", new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            p5 e10 = s0.e(document, l10, oVar.h.getFontMetricsInt());
            e10.cacheType = g5.f();
            e10.setAdded();
            arrayList.add(i9.b(editTextSelectionEnd, 0, arrayList.size()), l10);
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
