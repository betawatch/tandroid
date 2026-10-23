package ig;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Wallet.j9;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class z0 extends EditTextBoldCursor {
    public final /* synthetic */ int b = 0;
    public int c;
    public final i5 d;
    public final p6 e;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c1 c1Var, Activity activity) {
        super(activity);
        this.f = c1Var;
        this.d = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.e = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.b) {
            case 0:
                super.dispatchDraw(canvas);
                int a2 = this.d.a(k6.w0(this.c < 0 ? k6.p7 : k6.P5, ((c1) this.f).getResourceProvider()), false);
                p6 p6Var = this.e;
                p6Var.u(a2);
                p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                p6Var.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                int a10 = this.d.a(k6.w0(this.c <= 0 ? k6.p7 : k6.P5, ((al) this.f).a), false);
                p6 p6Var2 = this.e;
                p6Var2.u(a10);
                int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                p6Var2.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
                p6Var2.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                int a11 = this.d.a(k6.w0(this.c <= 0 ? k6.p7 : k6.P5, ((j9) this.f).getResourceProvider()), false);
                p6 p6Var3 = this.e;
                p6Var3.u(a11);
                int dp2 = AndroidUtilities.dp(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                p6Var3.setBounds(dp2 - AndroidUtilities.dp(48.0f), height2 - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp2, height2);
                p6Var3.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.b) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                p6 p6Var = this.e;
                if (p6Var != null) {
                    this.c = 96 - charSequence.length();
                    p6Var.a();
                    String str = "";
                    if (this.c <= 12) {
                        str = "" + this.c;
                    }
                    p6Var.t(str, true, true);
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                p6 p6Var2 = this.e;
                if (p6Var2 != null) {
                    this.c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    p6Var2.a();
                    int i13 = this.c;
                    p6Var2.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i10, i11, i12);
                p6 p6Var3 = this.e;
                if (p6Var3 != null) {
                    this.c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    p6Var3.a();
                    int i14 = this.c;
                    p6Var3.t(i14 <= 100 ? Integer.toString(i14) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.b) {
            case 0:
                if (drawable == this.e || super.verifyDrawable(drawable)) {
                }
                break;
            case 1:
                if (drawable == this.e || super.verifyDrawable(drawable)) {
                }
                break;
            default:
                if (drawable == this.e || super.verifyDrawable(drawable)) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(al alVar, Context context) {
        super(context);
        this.f = alVar;
        this.c = 960;
        this.d = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.e = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.b = 5;
        p6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j9 j9Var, Activity activity) {
        super(activity);
        this.f = j9Var;
        this.c = 960;
        this.d = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.e = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.b = 5;
        p6Var.setCallback(this);
    }
}
