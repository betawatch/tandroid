// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fb0 extends tx9 {
    public boolean f2;
    public final /* synthetic */ mb0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(mb0 mb0Var, mb0 mb0Var2, Activity activity, int i) {
        super(mb0Var2, activity, false, null, 4, true, null, 16, i);
        this.g2 = mb0Var;
        this.f2 = true;
    }

    @Override // tx9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z;
        int i2;
        boolean z2 = this.S;
        mb0 mb0Var = this.g2;
        if (z2) {
            i2 = ((d) mb0Var).currentAccount;
            tL_emojiList = hq6.d0(i2).M1;
        } else {
            i = ((d) mb0Var).currentAccount;
            tL_emojiList = hq6.d0(i).N1;
        }
        if (tL_emojiList != null) {
            z = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l != null ? l.longValue() : 0L));
        } else {
            z = false;
        }
        mb0Var.l0(z, l != null ? l.longValue() : 0L, document);
    }

    @Override // tx9, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.r(null);
        }
    }
}
