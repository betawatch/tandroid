// default package

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class au2 extends skb {
    public final /* synthetic */ byte a0 = 0;
    public final /* synthetic */ Object b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au2(cu2 cu2Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.b0 = cu2Var;
    }

    @Override // skb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a0;
        Object obj = this.b0;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int L = hl.L(21.0f);
                cu2 cu2Var = (cu2) obj;
                int measuredHeight = (getMeasuredHeight() - cu2Var.V.getMeasuredHeight()) / 2;
                de0 de0Var = cu2Var.V;
                de0Var.layout(L, measuredHeight, de0Var.getMeasuredWidth() + L, cu2Var.V.getMeasuredHeight() + measuredHeight);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                int L2 = hl.L(21.0f);
                int measuredHeight2 = getMeasuredHeight();
                PrivacyControlActivity privacyControlActivity = ((mn8) obj).d;
                int measuredHeight3 = (measuredHeight2 - privacyControlActivity.x0.getMeasuredHeight()) / 2;
                de0 de0Var2 = privacyControlActivity.x0;
                de0Var2.layout(L2, measuredHeight3, de0Var2.getMeasuredWidth() + L2, privacyControlActivity.x0.getMeasuredHeight() + measuredHeight3);
                break;
        }
    }

    @Override // skb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a0;
        Object obj = this.b0;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                cu2 cu2Var = (cu2) obj;
                cu2Var.V.measure(View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), TLObject.FLAG_30));
                cu2Var.V.setRoundRadius(hl.L(30.0f));
                break;
            default:
                super.onMeasure(i, i2);
                PrivacyControlActivity privacyControlActivity = ((mn8) obj).d;
                privacyControlActivity.x0.measure(View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), TLObject.FLAG_30));
                privacyControlActivity.x0.setRoundRadius(hl.L(30.0f));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au2(mn8 mn8Var, Activity activity) {
        super(activity);
        this.b0 = mn8Var;
    }
}
