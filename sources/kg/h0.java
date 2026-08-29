package kg;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import lh.x2;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h0 {
    public final ImageReceiver a;
    public p5 b;
    public q0 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public h0(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.b;
        Rect rect = this.c;
        if (p5Var != null) {
            x2 x2Var = p5Var.k;
            if (x2Var != null) {
                x2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        float f9 = rect.left;
        float f10 = rect.top;
        float width = rect.width();
        float height = rect.height();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(f9, f10, width, height);
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.g = z10;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            p5 p5Var = this.b;
            if (p5Var != null) {
                p5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        p5 p5Var2 = this.b;
        if (p5Var2 != null) {
            p5Var2.o(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i10) {
        if (this.j != i10) {
            this.j = i10;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(q0 q0Var) {
        if (Objects.equals(this.e, q0Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.clearImage();
        p5 p5Var = this.b;
        if (p5Var != null) {
            p5Var.o(this.f);
            this.b = null;
        }
        this.e = q0Var;
        boolean z10 = this.i;
        String str = z10 ? "60_60_firstframe" : "60_60";
        if (q0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(q0Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, g6.m6, 0.2f), 0L, "tgs", q0Var, 0);
                return;
            }
            return;
        }
        p5 p5Var2 = new p5(z10 ? 13 : 1, UserConfig.selectedAccount, q0Var.g);
        this.b = p5Var2;
        if (this.g) {
            p5Var2.a(this.f);
        }
        p5 p5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        p5Var3.setColorFilter(porterDuffColorFilter);
    }
}
