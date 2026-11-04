package lg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.m9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y0 extends EditTextBoldCursor {
    public final /* synthetic */ int H1 = 1;
    public final x4 I1;
    public int J1;
    public final g6 K1;
    public final /* synthetic */ Object L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(b1 b1Var, Activity activity) {
        super(activity);
        this.L1 = b1Var;
        this.I1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.K1 = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.H1) {
            case 0:
                super.dispatchDraw(canvas);
                int a10 = this.I1.a(k6.w0(this.J1 < 0 ? k6.p7 : k6.P5, ((b1) this.L1).getResourceProvider()), false);
                g6 g6Var = this.K1;
                g6Var.u(a10);
                g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                g6Var.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                int a11 = this.I1.a(k6.w0(this.J1 < 0 ? k6.p7 : k6.P5, (e6) this.L1), false);
                g6 g6Var2 = this.K1;
                g6Var2.u(a11);
                g6Var2.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                g6Var2.draw(canvas);
                break;
            case 2:
                super.dispatchDraw(canvas);
                int a12 = this.I1.a(k6.w0(this.J1 <= 0 ? k6.p7 : k6.P5, ((hk) this.L1).a), false);
                g6 g6Var3 = this.K1;
                g6Var3.u(a12);
                int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                g6Var3.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
                g6Var3.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                int a13 = this.I1.a(k6.w0(this.J1 <= 0 ? k6.p7 : k6.P5, ((m9) this.L1).getResourceProvider()), false);
                g6 g6Var4 = this.K1;
                g6Var4.u(a13);
                int L2 = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                g6Var4.setBounds(L2 - org.telegram.messenger.g0.L(48.0f), height2 - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L2, height2);
                g6Var4.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.H1) {
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.H1) {
            case 0:
                super.onTextChanged(charSequence, i3, i10, i11);
                g6 g6Var = this.K1;
                if (g6Var != null) {
                    this.J1 = 96 - charSequence.length();
                    g6Var.a();
                    String str = "";
                    if (this.J1 <= 12) {
                        str = "" + this.J1;
                    }
                    g6Var.t(str, true, true);
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i3, i10, i11);
                g6 g6Var2 = this.K1;
                if (g6Var2 != null) {
                    this.J1 = 32 - charSequence.length();
                    g6Var2.a();
                    String str2 = "";
                    if (this.J1 <= 4) {
                        str2 = "" + this.J1;
                    }
                    g6Var2.t(str2, true, true);
                    break;
                }
                break;
            case 2:
                super.onTextChanged(charSequence, i3, i10, i11);
                g6 g6Var3 = this.K1;
                if (g6Var3 != null) {
                    this.J1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    g6Var3.a();
                    int i12 = this.J1;
                    g6Var3.t(i12 <= 100 ? Integer.toString(i12) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i3, i10, i11);
                g6 g6Var4 = this.K1;
                if (g6Var4 != null) {
                    this.J1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    g6Var4.a();
                    int i13 = this.J1;
                    g6Var4.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.H1) {
            case 0:
                if (drawable == this.K1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 1:
                if (drawable == this.K1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 2:
                if (drawable == this.K1 || super.verifyDrawable(drawable)) {
                }
                break;
            default:
                if (drawable == this.K1 || super.verifyDrawable(drawable)) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, e6 e6Var) {
        super(context);
        this.L1 = e6Var;
        this.I1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.K1 = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(hk hkVar, Context context) {
        super(context);
        this.L1 = hkVar;
        this.J1 = 960;
        this.I1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.K1 = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.b = 5;
        g6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(m9 m9Var, Activity activity) {
        super(activity);
        this.L1 = m9Var;
        this.J1 = 960;
        this.I1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.K1 = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.b = 5;
        g6Var.setCallback(this);
    }
}
