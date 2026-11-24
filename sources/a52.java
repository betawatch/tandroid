// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a52 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1 = 2;
    public final km N1;
    public int O1;
    public final ho P1;
    public final /* synthetic */ Object Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a52(rrc rrcVar, Activity activity) {
        super(activity);
        this.Q1 = rrcVar;
        this.O1 = 960;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.P1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        hoVar.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.M1;
        Object obj = this.Q1;
        km kmVar = this.N1;
        ho hoVar = this.P1;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                hoVar.u(kmVar.a(cmb.v0(this.O1 <= 0 ? cmb.o7 : cmb.O5, ((c52) obj).a), false));
                int L = gm.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                hoVar.setBounds(L - gm.L(48.0f), height - Math.min(gm.L(44.0f), getHeight()), L, height);
                hoVar.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                hoVar.u(kmVar.a(cmb.v0(this.O1 < 0 ? cmb.o7 : cmb.O5, ((oc6) obj).getResourceProvider()), false));
                hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                hoVar.draw(canvas);
                break;
            case 2:
                super.dispatchDraw(canvas);
                hoVar.u(kmVar.a(cmb.v0(this.O1 < 0 ? cmb.o7 : cmb.O5, (ylb) obj), false));
                hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                hoVar.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                hoVar.u(kmVar.a(cmb.v0(this.O1 <= 0 ? cmb.o7 : cmb.O5, ((rrc) obj).getResourceProvider()), false));
                int L2 = gm.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                hoVar.setBounds(L2 - gm.L(48.0f), height2 - Math.min(gm.L(44.0f), getHeight()), L2, height2);
                hoVar.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.M1;
        ho hoVar = this.P1;
        switch (b) {
            case 0:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hoVar != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    hoVar.a();
                    int i4 = this.O1;
                    hoVar.t(i4 <= 100 ? Integer.toString(i4) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hoVar != null) {
                    this.O1 = 96 - charSequence.length();
                    hoVar.a();
                    hoVar.t(this.O1 <= 12 ? String.valueOf(this.O1) : "", true, true);
                    break;
                }
                break;
            case 2:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hoVar != null) {
                    this.O1 = 32 - charSequence.length();
                    hoVar.a();
                    hoVar.t(this.O1 <= 4 ? String.valueOf(this.O1) : "", true, true);
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hoVar != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    hoVar.a();
                    int i5 = this.O1;
                    hoVar.t(i5 <= 100 ? Integer.toString(i5) : "", isAttachedToWindow(), true);
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
    public a52(Activity activity, ylb ylbVar) {
        super(activity);
        this.Q1 = ylbVar;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.P1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.setCallback(this);
        hoVar.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a52(c52 c52Var, Context context) {
        super(context);
        this.Q1 = c52Var;
        this.O1 = 960;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.P1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        hoVar.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a52(oc6 oc6Var, Activity activity) {
        super(activity);
        this.Q1 = oc6Var;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.P1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.setCallback(this);
        hoVar.b = 5;
    }
}
