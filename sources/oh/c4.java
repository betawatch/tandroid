package oh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c4 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final a9.a g = new a9.a(9);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k;
    public final Paint l;
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public final Drawable s;
    public final hj0 t;
    public final hj0 u;

    public c4(Context context) {
        new RectF();
        this.k = new RectF();
        this.l = new Paint();
        this.m = context.getDrawable(R.drawable.media_share);
        this.o = context.getDrawable(R.drawable.media_like);
        this.n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.q = context.getDrawable(R.drawable.media_more);
        this.r = context.getDrawable(R.drawable.menu_stream_pip);
        this.s = context.getDrawable(R.drawable.msg_delete);
        this.u = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        hj0 hj0Var = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.t = hj0Var;
        hj0Var.L(20, false, true);
        hj0Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(k10);
        this.f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z4, boolean z10) {
        hj0 hj0Var = this.u;
        if (!z10) {
            hj0Var.L(z4 ? 20 : 0, false, false);
            hj0Var.N(z4 ? 20 : 0);
            return;
        }
        if (z4) {
            if (hj0Var.Y > 20) {
                hj0Var.L(0, false, false);
            }
            hj0Var.N(20);
            hj0Var.start();
            return;
        }
        int i10 = hj0Var.Y;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        hj0Var.N(43);
        hj0Var.start();
    }
}
