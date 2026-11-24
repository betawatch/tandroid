// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fc0 extends vz9 {
    public boolean f2;
    public final /* synthetic */ mc0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(mc0 mc0Var, mc0 mc0Var2, Activity activity, int i) {
        super(mc0Var2, activity, false, null, 4, true, null, 16, i);
        this.g2 = mc0Var;
        this.f2 = true;
    }

    @Override // vz9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z;
        int i2;
        boolean z2 = this.S;
        mc0 mc0Var = this.g2;
        if (z2) {
            i2 = ((d) mc0Var).currentAccount;
            tL_emojiList = hs6.d0(i2).M1;
        } else {
            i = ((d) mc0Var).currentAccount;
            tL_emojiList = hs6.d0(i).N1;
        }
        if (tL_emojiList != null) {
            z = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l != null ? l.longValue() : 0L));
        } else {
            z = false;
        }
        mc0Var.m0(z, l != null ? l.longValue() : 0L, document);
    }

    @Override // vz9, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.r(null);
        }
    }
}
