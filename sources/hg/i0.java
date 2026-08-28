package hg;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import ih.z2;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i0 {
    public final ImageReceiver a;
    public k5 b;
    public r0 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public i0(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        k5 k5Var = this.b;
        Rect rect = this.c;
        if (k5Var != null) {
            z2 z2Var = k5Var.k;
            if (z2Var != null) {
                z2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        float f10 = rect.left;
        float f11 = rect.top;
        float width = rect.width();
        float height = rect.height();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.g = z10;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            k5 k5Var = this.b;
            if (k5Var != null) {
                k5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        k5 k5Var2 = this.b;
        if (k5Var2 != null) {
            k5Var2.o(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i9) {
        if (this.j != i9) {
            this.j = i9;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(r0 r0Var) {
        if (Objects.equals(this.e, r0Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.clearImage();
        k5 k5Var = this.b;
        if (k5Var != null) {
            k5Var.o(this.f);
            this.b = null;
        }
        this.e = r0Var;
        boolean z10 = this.i;
        String str = z10 ? "60_60_firstframe" : "60_60";
        if (r0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(r0Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, f6.m6, 0.2f), 0L, "tgs", r0Var, 0);
                return;
            }
            return;
        }
        k5 k5Var2 = new k5(z10 ? 13 : 1, UserConfig.selectedAccount, r0Var.g);
        this.b = k5Var2;
        if (this.g) {
            k5Var2.a(this.f);
        }
        k5 k5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        k5Var3.setColorFilter(porterDuffColorFilter);
    }
}
