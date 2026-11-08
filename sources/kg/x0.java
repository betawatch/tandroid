package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Wallet.m9;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x0 extends EditTextBoldCursor {
    public final /* synthetic */ int G1 = 1;
    public final z4 H1;
    public int I1;
    public final i6 J1;
    public final /* synthetic */ Object K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(a1 a1Var, Activity activity) {
        super(activity);
        this.K1 = a1Var;
        this.H1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.J1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.setCallback(this);
        i6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.G1) {
            case 0:
                super.dispatchDraw(canvas);
                int a10 = this.H1.a(k6.w0(this.I1 < 0 ? k6.p7 : k6.P5, ((a1) this.K1).getResourceProvider()), false);
                i6 i6Var = this.J1;
                i6Var.u(a10);
                i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                i6Var.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                int a11 = this.H1.a(k6.w0(this.I1 < 0 ? k6.p7 : k6.P5, (f6) this.K1), false);
                i6 i6Var2 = this.J1;
                i6Var2.u(a11);
                i6Var2.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                i6Var2.draw(canvas);
                break;
            case 2:
                super.dispatchDraw(canvas);
                int a12 = this.H1.a(k6.w0(this.I1 <= 0 ? k6.p7 : k6.P5, ((ik) this.K1).a), false);
                i6 i6Var3 = this.J1;
                i6Var3.u(a12);
                int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                i6Var3.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
                i6Var3.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                int a13 = this.H1.a(k6.w0(this.I1 <= 0 ? k6.p7 : k6.P5, ((m9) this.K1).getResourceProvider()), false);
                i6 i6Var4 = this.J1;
                i6Var4.u(a13);
                int L2 = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                i6Var4.setBounds(L2 - org.telegram.messenger.g0.L(48.0f), height2 - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L2, height2);
                i6Var4.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.G1) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.dt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.G1) {
            case 0:
                super.onTextChanged(charSequence, i7, i10, i11);
                i6 i6Var = this.J1;
                if (i6Var != null) {
                    this.I1 = 96 - charSequence.length();
                    i6Var.a();
                    String str = "";
                    if (this.I1 <= 12) {
                        str = "" + this.I1;
                    }
                    i6Var.t(str, true, true);
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i7, i10, i11);
                i6 i6Var2 = this.J1;
                if (i6Var2 != null) {
                    this.I1 = 32 - charSequence.length();
                    i6Var2.a();
                    String str2 = "";
                    if (this.I1 <= 4) {
                        str2 = "" + this.I1;
                    }
                    i6Var2.t(str2, true, true);
                    break;
                }
                break;
            case 2:
                super.onTextChanged(charSequence, i7, i10, i11);
                i6 i6Var3 = this.J1;
                if (i6Var3 != null) {
                    this.I1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    i6Var3.a();
                    int i12 = this.I1;
                    i6Var3.t(i12 <= 100 ? Integer.toString(i12) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i7, i10, i11);
                i6 i6Var4 = this.J1;
                if (i6Var4 != null) {
                    this.I1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    i6Var4.a();
                    int i13 = this.I1;
                    i6Var4.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
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
    public x0(Context context, f6 f6Var) {
        super(context);
        this.K1 = f6Var;
        this.H1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.J1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.setCallback(this);
        i6Var.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ik ikVar, Context context) {
        super(context);
        this.K1 = ikVar;
        this.I1 = 960;
        this.H1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.J1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.b = 5;
        i6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(m9 m9Var, Activity activity) {
        super(activity);
        this.K1 = m9Var;
        this.I1 = 960;
        this.H1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.J1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.b = 5;
        i6Var.setCallback(this);
    }
}
