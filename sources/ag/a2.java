package ag;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Wallet.r9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a2 extends EditTextBoldCursor {
    public final /* synthetic */ int G1 = 0;
    public final w4 H1;
    public int I1;
    public final e6 J1;
    public final /* synthetic */ Object K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(f2 f2Var, Activity activity) {
        super(activity);
        this.K1 = f2Var;
        this.H1 = new w4(this);
        e6 e6Var = new e6(false, true, true);
        this.J1 = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.setCallback(this);
        e6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.G1) {
            case 0:
                super.dispatchDraw(canvas);
                int a2 = this.H1.a(t6.w0(this.I1 < 0 ? t6.p7 : t6.P5, ((f2) this.K1).getResourceProvider()), false);
                e6 e6Var = this.J1;
                e6Var.u(a2);
                e6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                e6Var.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                int a10 = this.H1.a(t6.w0(this.I1 < 0 ? t6.p7 : t6.P5, (p6) this.K1), false);
                e6 e6Var2 = this.J1;
                e6Var2.u(a10);
                e6Var2.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                e6Var2.draw(canvas);
                break;
            case 2:
                super.dispatchDraw(canvas);
                int a11 = this.H1.a(t6.w0(this.I1 <= 0 ? t6.p7 : t6.P5, ((kk) this.K1).a), false);
                e6 e6Var3 = this.J1;
                e6Var3.u(a11);
                int L = org.telegram.messenger.i0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                e6Var3.setBounds(L - org.telegram.messenger.i0.L(48.0f), height - Math.min(org.telegram.messenger.i0.L(44.0f), getHeight()), L, height);
                e6Var3.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                int a12 = this.H1.a(t6.w0(this.I1 <= 0 ? t6.p7 : t6.P5, ((r9) this.K1).getResourceProvider()), false);
                e6 e6Var4 = this.J1;
                e6Var4.u(a12);
                int L2 = org.telegram.messenger.i0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                e6Var4.setBounds(L2 - org.telegram.messenger.i0.L(48.0f), height2 - Math.min(org.telegram.messenger.i0.L(44.0f), getHeight()), L2, height2);
                e6Var4.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G1) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.G1) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                e6 e6Var = this.J1;
                if (e6Var != null) {
                    this.I1 = 96 - charSequence.length();
                    e6Var.a();
                    String str = "";
                    if (this.I1 <= 12) {
                        str = "" + this.I1;
                    }
                    e6Var.t(str, true, true);
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                e6 e6Var2 = this.J1;
                if (e6Var2 != null) {
                    this.I1 = 32 - charSequence.length();
                    e6Var2.a();
                    String str2 = "";
                    if (this.I1 <= 4) {
                        str2 = "" + this.I1;
                    }
                    e6Var2.t(str2, true, true);
                    break;
                }
                break;
            case 2:
                super.onTextChanged(charSequence, i10, i11, i12);
                e6 e6Var3 = this.J1;
                if (e6Var3 != null) {
                    this.I1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    e6Var3.a();
                    int i13 = this.I1;
                    e6Var3.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i10, i11, i12);
                e6 e6Var4 = this.J1;
                if (e6Var4 != null) {
                    this.I1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    e6Var4.a();
                    int i14 = this.I1;
                    e6Var4.t(i14 <= 100 ? Integer.toString(i14) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.G1) {
            case 0:
                if (drawable == this.J1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 1:
                if (drawable == this.J1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 2:
                if (drawable == this.J1 || super.verifyDrawable(drawable)) {
                }
                break;
            default:
                if (drawable == this.J1 || super.verifyDrawable(drawable)) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Context context, p6 p6Var) {
        super(context);
        this.K1 = p6Var;
        this.H1 = new w4(this);
        e6 e6Var = new e6(false, true, true);
        this.J1 = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.setCallback(this);
        e6Var.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(kk kkVar, Context context) {
        super(context);
        this.K1 = kkVar;
        this.I1 = 960;
        this.H1 = new w4(this);
        e6 e6Var = new e6(false, true, true);
        this.J1 = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.b = 5;
        e6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(r9 r9Var, Activity activity) {
        super(activity);
        this.K1 = r9Var;
        this.I1 = 960;
        this.H1 = new w4(this);
        e6 e6Var = new e6(false, true, true);
        this.J1 = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.b = 5;
        e6Var.setCallback(this);
    }
}
