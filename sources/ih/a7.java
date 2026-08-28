package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a7 extends View {
    public final f4 a;
    public boolean b;
    public final org.telegram.ui.Components.y5 c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.k5 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public a7(Context context, f4 f4Var) {
        super(context);
        this.c = new org.telegram.ui.Components.y5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = f4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.s = true;
        org.telegram.ui.Components.k5 k5Var = this.f;
        if (k5Var != null) {
            k5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.s = false;
        org.telegram.ui.Components.k5 k5Var = this.f;
        if (k5Var != null) {
            k5Var.o(this);
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
            f4 f4Var = this.a;
            if (d < 1.0f) {
                Drawable drawable = f4Var.o;
                Drawable drawable2 = f4Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(255);
                drawable2.draw(canvas);
            }
            if (d > 0.0f) {
                Drawable drawable3 = f4Var.p;
                Drawable drawable4 = f4Var.p;
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
        org.telegram.ui.Components.k5 k5Var = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = k5Var != null ? k5Var.k : imageReceiver;
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

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(hg.r0 r0Var) {
        String str;
        String str2;
        this.n = r0Var == null || ((str2 = r0Var.f) != null && str2.equals("❤"));
        if (r0Var == null || (str = r0Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        org.telegram.ui.Components.k5 k5Var = this.f;
        if (k5Var != null) {
            k5Var.o(this);
        }
        this.f = null;
        if (r0Var != null) {
            if (r0Var.g != 0) {
                org.telegram.ui.Components.k5 k5Var2 = new org.telegram.ui.Components.k5(3, UserConfig.selectedAccount, r0Var.g);
                this.f = k5Var2;
                if (this.s) {
                    k5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(r0Var.f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.f6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
