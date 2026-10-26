package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m7 extends View {
    public final n4 a;
    public boolean b;
    public final org.telegram.ui.Components.h6 c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.t5 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public m7(Context context, n4 n4Var) {
        super(context);
        this.c = new org.telegram.ui.Components.h6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = n4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.s = true;
        org.telegram.ui.Components.t5 t5Var = this.f;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.s = false;
        org.telegram.ui.Components.t5 t5Var = this.f;
        if (t5Var != null) {
            t5Var.o(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        if (this.n) {
            float d = this.c.d(this.b ? 1.0f : 0.0f, false);
            n4 n4Var = this.a;
            if (d < 1.0f) {
                Drawable drawable = n4Var.o;
                Drawable drawable2 = n4Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(255);
                drawable2.draw(canvas);
            }
            if (d > 0.0f) {
                Drawable drawable3 = n4Var.p;
                Drawable drawable4 = n4Var.p;
                drawable3.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable4.setAlpha((int) (d * 255.0f));
                drawable4.draw(canvas);
                return;
            }
            return;
        }
        if (!this.h) {
            return;
        }
        org.telegram.ui.Components.t5 t5Var = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = t5Var != null ? t5Var.k : imageReceiver;
        if (this.r) {
            ImageReceiver imageReceiver3 = this.e;
            if (imageReceiver3.getBitmap() != null) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                float f7 = measuredWidth / 2.0f;
                float f10 = measuredWidth * 2;
                imageReceiver3.setImageCoords(getPaddingLeft() - f7, getPaddingTop() - f7, f10, f10);
                if (imageReceiver3.getLottieAnimation() != null && imageReceiver3.getLottieAnimation().A()) {
                    this.r = false;
                    imageReceiver.setCrossfadeAlpha((byte) 0);
                }
                imageReceiver2 = imageReceiver3;
                if (imageReceiver2 == null) {
                    imageReceiver2.draw(canvas);
                    return;
                }
                return;
            }
        }
        if (imageReceiver2 != null) {
            imageReceiver2.setImageCoords(getPaddingLeft(), getPaddingTop(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        }
        if (imageReceiver2 == null) {
        }
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(bh.x0 x0Var) {
        String str;
        String str2;
        this.n = x0Var == null || ((str2 = x0Var.f) != null && str2.equals("❤"));
        if (x0Var == null || (str = x0Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        org.telegram.ui.Components.t5 t5Var = this.f;
        if (t5Var != null) {
            t5Var.o(this);
        }
        this.f = null;
        if (x0Var != null) {
            if (x0Var.g != 0) {
                org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5(3, UserConfig.selectedAccount, x0Var.g);
                this.f = t5Var2;
                if (this.s) {
                    t5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(x0Var.f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.y6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
