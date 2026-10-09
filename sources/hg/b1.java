package hg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Wallet.j8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b1 extends EditTextBoldCursor {
    public final /* synthetic */ int b = 0;
    public int c;
    public final j5 d;
    public final q6 e;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 e1Var, Activity activity) {
        super(activity);
        this.f = e1Var;
        this.d = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.e = q6Var;
        q6Var.n(0.2f, 160L, hs.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.setCallback(this);
        q6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.b) {
            case 0:
                super.dispatchDraw(canvas);
                int a2 = this.d.a(i6.w0(this.c < 0 ? i6.p7 : i6.P5, ((e1) this.f).getResourceProvider()), false);
                q6 q6Var = this.e;
                q6Var.u(a2);
                q6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                q6Var.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                int a10 = this.d.a(i6.w0(this.c <= 0 ? i6.p7 : i6.P5, ((gl) this.f).a), false);
                q6 q6Var2 = this.e;
                q6Var2.u(a10);
                int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                q6Var2.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
                q6Var2.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                int a11 = this.d.a(i6.w0(this.c <= 0 ? i6.p7 : i6.P5, ((j8) this.f).getResourceProvider()), false);
                q6 q6Var3 = this.e;
                q6Var3.u(a11);
                int dp2 = AndroidUtilities.dp(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                q6Var3.setBounds(dp2 - AndroidUtilities.dp(48.0f), height2 - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp2, height2);
                q6Var3.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.tu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.b) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                q6 q6Var = this.e;
                if (q6Var != null) {
                    this.c = 96 - charSequence.length();
                    q6Var.a();
                    String str = "";
                    if (this.c <= 12) {
                        str = "" + this.c;
                    }
                    q6Var.t(str, true, true);
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                q6 q6Var2 = this.e;
                if (q6Var2 != null) {
                    this.c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    q6Var2.a();
                    int i13 = this.c;
                    q6Var2.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i10, i11, i12);
                q6 q6Var3 = this.e;
                if (q6Var3 != null) {
                    this.c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    q6Var3.a();
                    int i14 = this.c;
                    q6Var3.t(i14 <= 100 ? Integer.toString(i14) : "", isAttachedToWindow(), true);
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
    public b1(gl glVar, Context context) {
        super(context);
        this.f = glVar;
        this.c = 960;
        this.d = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.e = q6Var;
        q6Var.n(0.2f, 160L, hs.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.b = 5;
        q6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j8 j8Var, Activity activity) {
        super(activity);
        this.f = j8Var;
        this.c = 960;
        this.d = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.e = q6Var;
        q6Var.n(0.2f, 160L, hs.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.b = 5;
        q6Var.setCallback(this);
    }
}
