package mg;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import nh.y2;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h0 {
    public final ImageReceiver a;
    public l5 b;
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
        l5 l5Var = this.b;
        Rect rect = this.c;
        if (l5Var != null) {
            y2 y2Var = l5Var.k;
            if (y2Var != null) {
                y2Var.setRoundRadius((int) (rect.width() * 0.1f));
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

    public final void b(boolean z4) {
        this.g = z4;
        ImageReceiver imageReceiver = this.a;
        if (z4) {
            imageReceiver.onAttachedToWindow();
            l5 l5Var = this.b;
            if (l5Var != null) {
                l5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        l5 l5Var2 = this.b;
        if (l5Var2 != null) {
            l5Var2.o(this.f);
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
        l5 l5Var = this.b;
        if (l5Var != null) {
            l5Var.o(this.f);
            this.b = null;
        }
        this.e = q0Var;
        boolean z4 = this.i;
        String str = z4 ? "60_60_firstframe" : "60_60";
        if (q0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(q0Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.m6, 0.2f), 0L, "tgs", q0Var, 0);
                return;
            }
            return;
        }
        l5 l5Var2 = new l5(z4 ? 13 : 1, UserConfig.selectedAccount, q0Var.g);
        this.b = l5Var2;
        if (this.g) {
            l5Var2.a(this.f);
        }
        l5 l5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        l5Var3.setColorFilter(porterDuffColorFilter);
    }
}
