package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b50 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public b50(org.telegram.ui.ActionBar.w2[] w2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = w2VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.D4(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
