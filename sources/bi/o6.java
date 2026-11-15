package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o6 extends org.telegram.ui.Cells.h3 {
    public final /* synthetic */ fh.g F;
    public final /* synthetic */ int G;
    public final /* synthetic */ u6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(u6 u6Var, Context context, st0 st0Var, String str, int i7, org.telegram.ui.ActionBar.e6 e6Var, fh.g gVar, int i10) {
        super(context, st0Var, str, true, i7, e6Var);
        this.H = u6Var;
        this.F = gVar;
        this.G = i10;
    }

    @Override // org.telegram.ui.Cells.h3
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        u6 u6Var = this.H;
        gj gjVar = u6Var.i2;
        TLRPC.MessageAction messageAction = u6Var.h2;
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
        CharSequence[] charSequenceArr = {u6Var.p2.getText()};
        tL_textWithEntities.entities = si.b0(this.G).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        gjVar.L5();
        u6Var.g2.h0(gjVar, true);
        u6Var.q2.O(true);
        u6Var.g1(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        fh.g gVar = this.F;
        gVar.setBounds(L, 0, measuredWidth, measuredHeight);
        gVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.h3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        super.onMeasure(i7, i10);
    }
}
