package fh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p6 extends org.telegram.ui.Cells.g3 {
    public final /* synthetic */ u6 A;
    public final /* synthetic */ kg.f x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(u6 u6Var, Context context, xu0 xu0Var, String str, int i9, org.telegram.ui.ActionBar.b6 b6Var, kg.f fVar, int i10) {
        super(context, xu0Var, str, true, i9, b6Var);
        this.A = u6Var;
        this.x = fVar;
        this.y = i10;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        u6 u6Var = this.A;
        MessageObject messageObject = u6Var.i0;
        TLRPC.MessageAction messageAction = u6Var.h0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            ((TLRPC.TL_messageActionStarGift) messageAction).message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
            tL_messageActionGiftCode.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftCode.message = tL_textWithEntities;
        } else {
            if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
                return;
            }
            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = (TLRPC.TL_messageActionGiftPremium) messageAction;
            tL_messageActionGiftPremium.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftPremium.message = tL_textWithEntities;
        }
        CharSequence[] charSequenceArr = {u6Var.o0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.y).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        u6Var.g0.T(messageObject, true);
        u6Var.p0.N(true);
        u6Var.Y(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        kg.f fVar = this.x;
        fVar.setBounds(dp, 0, measuredWidth, measuredHeight);
        fVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.g3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
        super.onMeasure(i9, i10);
    }
}
