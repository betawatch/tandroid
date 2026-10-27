package jg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Wallet.i9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a1 extends EditTextBoldCursor {
    public final /* synthetic */ int b = 0;
    public int c;
    public final j5 d;
    public final r6 e;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(d1 d1Var, Activity activity) {
        super(activity);
        this.f = d1Var;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.b) {
            case 0:
                super.dispatchDraw(canvas);
                int a2 = this.d.a(y6.w0(this.c < 0 ? y6.p7 : y6.P5, ((d1) this.f).getResourceProvider()), false);
                r6 r6Var = this.e;
                r6Var.u(a2);
                r6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                r6Var.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                int a10 = this.d.a(y6.w0(this.c <= 0 ? y6.p7 : y6.P5, ((al) this.f).a), false);
                r6 r6Var2 = this.e;
                r6Var2.u(a10);
                int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                r6Var2.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
                r6Var2.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                int a11 = this.d.a(y6.w0(this.c <= 0 ? y6.p7 : y6.P5, ((i9) this.f).getResourceProvider()), false);
                r6 r6Var3 = this.e;
                r6Var3.u(a11);
                int dp2 = AndroidUtilities.dp(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                r6Var3.setBounds(dp2 - AndroidUtilities.dp(48.0f), height2 - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp2, height2);
                r6Var3.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.b) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                r6 r6Var = this.e;
                if (r6Var != null) {
                    this.c = 96 - charSequence.length();
                    r6Var.a();
                    String str = "";
                    if (this.c <= 12) {
                        str = "" + this.c;
                    }
                    r6Var.t(str, true, true);
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                r6 r6Var2 = this.e;
                if (r6Var2 != null) {
                    this.c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    r6Var2.a();
                    int i13 = this.c;
                    r6Var2.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i10, i11, i12);
                r6 r6Var3 = this.e;
                if (r6Var3 != null) {
                    this.c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    r6Var3.a();
                    int i14 = this.c;
                    r6Var3.t(i14 <= 100 ? Integer.toString(i14) : "", isAttachedToWindow(), true);
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
    public a1(al alVar, Context context) {
        super(context);
        this.f = alVar;
        this.c = 960;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.b = 5;
        r6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(i9 i9Var, Activity activity) {
        super(activity);
        this.f = i9Var;
        this.c = 960;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.b = 5;
        r6Var.setCallback(this);
    }
}
