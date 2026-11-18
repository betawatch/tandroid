package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Wallet.da;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a1 extends EditTextBoldCursor {
    public final /* synthetic */ int M1 = 1;
    public final f5 N1;
    public int O1;
    public final m6 P1;
    public final /* synthetic */ Object Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(d1 d1Var, Activity activity) {
        super(activity);
        this.Q1 = d1Var;
        this.N1 = new f5(this);
        m6 m6Var = new m6(false, true, true);
        this.P1 = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.setCallback(this);
        m6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.M1) {
            case 0:
                super.dispatchDraw(canvas);
                int a10 = this.N1.a(n6.w0(this.O1 < 0 ? n6.p7 : n6.P5, ((d1) this.Q1).getResourceProvider()), false);
                m6 m6Var = this.P1;
                m6Var.u(a10);
                m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                m6Var.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                int a11 = this.N1.a(n6.w0(this.O1 < 0 ? n6.p7 : n6.P5, (i6) this.Q1), false);
                m6 m6Var2 = this.P1;
                m6Var2.u(a11);
                m6Var2.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                m6Var2.draw(canvas);
                break;
            case 2:
                super.dispatchDraw(canvas);
                int a12 = this.N1.a(n6.w0(this.O1 <= 0 ? n6.p7 : n6.P5, ((xk) this.Q1).a), false);
                m6 m6Var3 = this.P1;
                m6Var3.u(a12);
                int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                m6Var3.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
                m6Var3.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                int a13 = this.N1.a(n6.w0(this.O1 <= 0 ? n6.p7 : n6.P5, ((da) this.Q1).getResourceProvider()), false);
                m6 m6Var4 = this.P1;
                m6Var4.u(a13);
                int L2 = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                m6Var4.setBounds(L2 - org.telegram.messenger.g0.L(48.0f), height2 - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L2, height2);
                m6Var4.draw(canvas);
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

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.M1) {
            case 0:
                super.onTextChanged(charSequence, i7, i10, i11);
                m6 m6Var = this.P1;
                if (m6Var != null) {
                    this.O1 = 96 - charSequence.length();
                    m6Var.a();
                    String str = "";
                    if (this.O1 <= 12) {
                        str = "" + this.O1;
                    }
                    m6Var.t(str, true, true);
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i7, i10, i11);
                m6 m6Var2 = this.P1;
                if (m6Var2 != null) {
                    this.O1 = 32 - charSequence.length();
                    m6Var2.a();
                    String str2 = "";
                    if (this.O1 <= 4) {
                        str2 = "" + this.O1;
                    }
                    m6Var2.t(str2, true, true);
                    break;
                }
                break;
            case 2:
                super.onTextChanged(charSequence, i7, i10, i11);
                m6 m6Var3 = this.P1;
                if (m6Var3 != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    m6Var3.a();
                    int i12 = this.O1;
                    m6Var3.t(i12 <= 100 ? Integer.toString(i12) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i7, i10, i11);
                m6 m6Var4 = this.P1;
                if (m6Var4 != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    m6Var4.a();
                    int i13 = this.O1;
                    m6Var4.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
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
    public a1(Context context, i6 i6Var) {
        super(context);
        this.Q1 = i6Var;
        this.N1 = new f5(this);
        m6 m6Var = new m6(false, true, true);
        this.P1 = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.setCallback(this);
        m6Var.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(xk xkVar, Context context) {
        super(context);
        this.Q1 = xkVar;
        this.O1 = 960;
        this.N1 = new f5(this);
        m6 m6Var = new m6(false, true, true);
        this.P1 = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.b = 5;
        m6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(da daVar, Activity activity) {
        super(activity);
        this.Q1 = daVar;
        this.O1 = 960;
        this.N1 = new f5(this);
        m6 m6Var = new m6(false, true, true);
        this.P1 = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.b = 5;
        m6Var.setCallback(this);
    }
}
