// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hb0 extends n1a {
    public boolean f2;
    public final /* synthetic */ ob0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb0(ob0 ob0Var, ob0 ob0Var2, Activity activity, int i) {
        super(ob0Var2, activity, false, null, 4, true, null, 16, i);
        this.g2 = ob0Var;
        this.f2 = true;
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z;
        int i2;
        boolean z2 = this.S;
        ob0 ob0Var = this.g2;
        if (z2) {
            i2 = ((e) ob0Var).currentAccount;
            tL_emojiList = ls6.d0(i2).M1;
        } else {
            i = ((e) ob0Var).currentAccount;
            tL_emojiList = ls6.d0(i).N1;
        }
        if (tL_emojiList != null) {
            z = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l != null ? l.longValue() : 0L));
        } else {
            z = false;
        }
        ob0Var.l0(z, l != null ? l.longValue() : 0L, document);
    }

    @Override // n1a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.r(null);
        }
    }
}
