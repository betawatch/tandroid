// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ms5 extends ClickableSpan {
    public final /* synthetic */ my0[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public ms5(my0[] my0VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = my0VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(ProfileActivity.S2(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
