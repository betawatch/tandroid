package lh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z5 extends org.telegram.ui.Cells.f3 {
    public final /* synthetic */ e6 B;
    public final /* synthetic */ qg.d x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(e6 e6Var, Context context, pv0 pv0Var, String str, int i10, g6 g6Var, qg.d dVar, int i11) {
        super(context, pv0Var, str, true, i10, g6Var);
        this.B = e6Var;
        this.x = dVar;
        this.y = i11;
    }

    @Override // org.telegram.ui.Cells.f3
    public final void b() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        e6 e6Var = this.B;
        MessageObject messageObject = e6Var.j0;
        TLRPC.MessageAction messageAction = e6Var.i0;
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
        CharSequence[] charSequenceArr = {e6Var.p0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.y).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        e6Var.h0.U(messageObject, true);
        e6Var.q0.N(true);
        e6Var.Z(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        qg.d dVar = this.x;
        dVar.setBounds(dp, 0, measuredWidth, measuredHeight);
        dVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.f3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
