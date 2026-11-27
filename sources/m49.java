// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m49 extends FrameLayout {
    public final ul a;
    public final /* synthetic */ n49 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m49(n49 n49Var, Context context) {
        super(context);
        this.b = n49Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.G6, n49Var.getResourceProvider());
        textView.setText(ob6.M0(2131751315, null));
        addView(textView, tre.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new ul(hl.L(24.0f), this);
    }

    public final void a(boolean z) {
        int i;
        int i2;
        n49 n49Var = this.b;
        i = ((e) n49Var).currentAccount;
        String S = ls6.d0(i).S();
        ul ulVar = this.a;
        if (S != null && S.startsWith("animated_")) {
            try {
                ulVar.j(Long.parseLong(S.substring(9)), z);
                return;
            } catch (Exception unused) {
            }
        }
        i2 = ((e) n49Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i2).r.get(S);
        if (tL_availableReaction != null) {
            ulVar.i(tL_availableReaction.static_icon, z);
        }
    }

    public final void b() {
        int width = getWidth();
        ul ulVar = this.a;
        ulVar.setBounds((width - ulVar.s) - hl.L(21.0f), (getHeight() - ulVar.s) / 2, getWidth() - hl.L(21.0f), (getHeight() + ulVar.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.a.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }
}
