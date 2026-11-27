// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class o52 extends y46 {
    public final /* synthetic */ ar0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o52(ar0 ar0Var, Context context) {
        super(context);
        this.r = ar0Var;
    }

    @Override // y46
    public final int k(int i, View view) {
        int topScrollOffset;
        int k = super.k(i, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.F.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k - (paddingTop - topScrollOffset);
    }

    @Override // y46
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
