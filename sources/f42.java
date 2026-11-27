// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f42 extends EditTextBoldCursor {
    public final /* synthetic */ byte N1 = 2;
    public final ll O1;
    public int P1;
    public final hn Q1;
    public final /* synthetic */ Object R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f42(euc eucVar, Activity activity) {
        super(activity);
        this.R1 = eucVar;
        this.P1 = 960;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.Q1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        hnVar.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.N1;
        Object obj = this.R1;
        ll llVar = this.O1;
        hn hnVar = this.Q1;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                hnVar.u(llVar.a(aob.v0(this.P1 <= 0 ? aob.p7 : aob.P5, ((h42) obj).a), false));
                int L = hl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                hnVar.setBounds(L - hl.L(48.0f), height - Math.min(hl.L(44.0f), getHeight()), L, height);
                hnVar.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                hnVar.u(llVar.a(aob.v0(this.P1 < 0 ? aob.p7 : aob.P5, ((tc6) obj).getResourceProvider()), false));
                hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                hnVar.draw(canvas);
                break;
            case 2:
                super.dispatchDraw(canvas);
                hnVar.u(llVar.a(aob.v0(this.P1 < 0 ? aob.p7 : aob.P5, (vnb) obj), false));
                hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                hnVar.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                hnVar.u(llVar.a(aob.v0(this.P1 <= 0 ? aob.p7 : aob.P5, ((euc) obj).getResourceProvider()), false));
                int L2 = hl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                hnVar.setBounds(L2 - hl.L(48.0f), height2 - Math.min(hl.L(44.0f), getHeight()), L2, height2);
                hnVar.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.N1) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(36.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.N1;
        hn hnVar = this.Q1;
        switch (b) {
            case 0:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hnVar != null) {
                    this.P1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    hnVar.a();
                    int i4 = this.P1;
                    hnVar.t(i4 <= 100 ? Integer.toString(i4) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hnVar != null) {
                    this.P1 = 96 - charSequence.length();
                    hnVar.a();
                    hnVar.t(this.P1 <= 12 ? String.valueOf(this.P1) : "", true, true);
                    break;
                }
                break;
            case 2:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hnVar != null) {
                    this.P1 = 32 - charSequence.length();
                    hnVar.a();
                    hnVar.t(this.P1 <= 4 ? String.valueOf(this.P1) : "", true, true);
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hnVar != null) {
                    this.P1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    hnVar.a();
                    int i5 = this.P1;
                    hnVar.t(i5 <= 100 ? Integer.toString(i5) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.N1) {
            case 0:
                if (drawable == this.Q1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 1:
                if (drawable == this.Q1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 2:
                if (drawable == this.Q1 || super.verifyDrawable(drawable)) {
                }
                break;
            default:
                if (drawable == this.Q1 || super.verifyDrawable(drawable)) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f42(Activity activity, vnb vnbVar) {
        super(activity);
        this.R1 = vnbVar;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.Q1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f42(h42 h42Var, Context context) {
        super(context);
        this.R1 = h42Var;
        this.P1 = 960;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.Q1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        hnVar.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f42(tc6 tc6Var, Activity activity) {
        super(activity);
        this.R1 = tc6Var;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.Q1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }
}
