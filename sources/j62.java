// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j62 extends v46 {
    public final /* synthetic */ as0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j62(as0 as0Var, Context context) {
        super(context);
        this.r = as0Var;
    }

    @Override // v46
    public final int k(int i, View view) {
        int topScrollOffset;
        int k = super.k(i, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.F.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k - (paddingTop - topScrollOffset);
    }

    @Override // v46
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
