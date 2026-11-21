package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.zk;
import org.telegram.ui.Wallet.da;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z0 extends EditTextBoldCursor {
    public final /* synthetic */ int M1 = 1;
    public final g5 N1;
    public int O1;
    public final n6 P1;
    public final /* synthetic */ Object Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c1 c1Var, Activity activity) {
        super(activity);
        this.Q1 = c1Var;
        this.N1 = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.P1 = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.setCallback(this);
        n6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.M1) {
            case 0:
                super.dispatchDraw(canvas);
                int a10 = this.N1.a(m6.w0(this.O1 < 0 ? m6.p7 : m6.P5, ((c1) this.Q1).getResourceProvider()), false);
                n6 n6Var = this.P1;
                n6Var.u(a10);
                n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                n6Var.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                int a11 = this.N1.a(m6.w0(this.O1 < 0 ? m6.p7 : m6.P5, (h6) this.Q1), false);
                n6 n6Var2 = this.P1;
                n6Var2.u(a11);
                n6Var2.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                n6Var2.draw(canvas);
                break;
            case 2:
                super.dispatchDraw(canvas);
                int a12 = this.N1.a(m6.w0(this.O1 <= 0 ? m6.p7 : m6.P5, ((zk) this.Q1).a), false);
                n6 n6Var3 = this.P1;
                n6Var3.u(a12);
                int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                n6Var3.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
                n6Var3.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                int a13 = this.N1.a(m6.w0(this.O1 <= 0 ? m6.p7 : m6.P5, ((da) this.Q1).getResourceProvider()), false);
                n6 n6Var4 = this.P1;
                n6Var4.u(a13);
                int L2 = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                n6Var4.setBounds(L2 - org.telegram.messenger.g0.L(48.0f), height2 - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L2, height2);
                n6Var4.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.M1) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.M1) {
            case 0:
                super.onTextChanged(charSequence, i7, i10, i11);
                n6 n6Var = this.P1;
                if (n6Var != null) {
                    this.O1 = 96 - charSequence.length();
                    n6Var.a();
                    String str = "";
                    if (this.O1 <= 12) {
                        str = "" + this.O1;
                    }
                    n6Var.t(str, true, true);
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i7, i10, i11);
                n6 n6Var2 = this.P1;
                if (n6Var2 != null) {
                    this.O1 = 32 - charSequence.length();
                    n6Var2.a();
                    String str2 = "";
                    if (this.O1 <= 4) {
                        str2 = "" + this.O1;
                    }
                    n6Var2.t(str2, true, true);
                    break;
                }
                break;
            case 2:
                super.onTextChanged(charSequence, i7, i10, i11);
                n6 n6Var3 = this.P1;
                if (n6Var3 != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    n6Var3.a();
                    int i12 = this.O1;
                    n6Var3.t(i12 <= 100 ? Integer.toString(i12) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i7, i10, i11);
                n6 n6Var4 = this.P1;
                if (n6Var4 != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    n6Var4.a();
                    int i13 = this.O1;
                    n6Var4.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.M1) {
            case 0:
                if (drawable == this.P1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 1:
                if (drawable == this.P1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 2:
                if (drawable == this.P1 || super.verifyDrawable(drawable)) {
                }
                break;
            default:
                if (drawable == this.P1 || super.verifyDrawable(drawable)) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, h6 h6Var) {
        super(context);
        this.Q1 = h6Var;
        this.N1 = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.P1 = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.setCallback(this);
        n6Var.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(zk zkVar, Context context) {
        super(context);
        this.Q1 = zkVar;
        this.O1 = 960;
        this.N1 = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.P1 = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.b = 5;
        n6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(da daVar, Activity activity) {
        super(activity);
        this.Q1 = daVar;
        this.O1 = 960;
        this.N1 = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.P1 = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.b = 5;
        n6Var.setCallback(this);
    }
}
