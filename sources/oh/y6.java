package oh;

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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y6 extends View {
    public final c4 a;
    public boolean b;
    public final org.telegram.ui.Components.z5 c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.l5 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public y6(Context context, c4 c4Var) {
        super(context);
        this.c = new org.telegram.ui.Components.z5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = c4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.s = true;
        org.telegram.ui.Components.l5 l5Var = this.f;
        if (l5Var != null) {
            l5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.s = false;
        org.telegram.ui.Components.l5 l5Var = this.f;
        if (l5Var != null) {
            l5Var.o(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        if (this.n) {
            float d = this.c.d(this.b ? 1.0f : 0.0f, false);
            c4 c4Var = this.a;
            if (d < 1.0f) {
                Drawable drawable = c4Var.o;
                Drawable drawable2 = c4Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(255);
                drawable2.draw(canvas);
            }
            if (d > 0.0f) {
                Drawable drawable3 = c4Var.p;
                Drawable drawable4 = c4Var.p;
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
        org.telegram.ui.Components.l5 l5Var = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = l5Var != null ? l5Var.k : imageReceiver;
        if (this.r) {
            ImageReceiver imageReceiver3 = this.e;
            if (imageReceiver3.getBitmap() != null) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                float f10 = measuredWidth / 2.0f;
                float f11 = measuredWidth * 2;
                imageReceiver3.setImageCoords(getPaddingLeft() - f10, getPaddingTop() - f10, f11, f11);
                if (imageReceiver3.getLottieAnimation() != null && imageReceiver3.getLottieAnimation().y()) {
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

    public void setAllowDrawReaction(boolean z4) {
        if (this.h == z4) {
            return;
        }
        this.h = z4;
        invalidate();
    }

    public void setReaction(ng.q0 q0Var) {
        String str;
        String str2;
        this.n = q0Var == null || ((str2 = q0Var.f) != null && str2.equals("❤"));
        if (q0Var == null || (str = q0Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        org.telegram.ui.Components.l5 l5Var = this.f;
        if (l5Var != null) {
            l5Var.o(this);
        }
        this.f = null;
        if (q0Var != null) {
            if (q0Var.g != 0) {
                org.telegram.ui.Components.l5 l5Var2 = new org.telegram.ui.Components.l5(3, UserConfig.selectedAccount, q0Var.g);
                this.f = l5Var2;
                if (this.s) {
                    l5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
