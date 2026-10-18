package ah;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import ci.g3;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class y0 {
    public final ImageReceiver a;
    public r5 b;
    public i1 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public y0(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        r5 r5Var = this.b;
        Rect rect = this.c;
        if (r5Var != null) {
            g3 g3Var = r5Var.k;
            if (g3Var != null) {
                g3Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        float f7 = rect.left;
        float f10 = rect.top;
        float width = rect.width();
        float height = rect.height();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(f7, f10, width, height);
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.g = z10;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            r5 r5Var = this.b;
            if (r5Var != null) {
                r5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        r5 r5Var2 = this.b;
        if (r5Var2 != null) {
            r5Var2.o(this.f);
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

    public final void e(i1 i1Var) {
        if (Objects.equals(this.e, i1Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.clearImage();
        r5 r5Var = this.b;
        if (r5Var != null) {
            r5Var.o(this.f);
            this.b = null;
        }
        this.e = i1Var;
        boolean z10 = this.i;
        String str = z10 ? "60_60_firstframe" : "60_60";
        if (i1Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(i1Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, h6.m6, 0.2f), 0L, "tgs", i1Var, 0);
                return;
            }
            return;
        }
        r5 r5Var2 = new r5(z10 ? 13 : 1, UserConfig.selectedAccount, i1Var.g);
        this.b = r5Var2;
        if (this.g) {
            r5Var2.a(this.f);
        }
        r5 r5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        r5Var3.setColorFilter(porterDuffColorFilter);
    }
}
