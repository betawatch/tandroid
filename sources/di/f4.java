package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f4 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final a8.b8 g = new a8.b8(5);
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
    public final zg0 t;
    public final zg0 u;

    public f4(Context context) {
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
        this.u = new zg0(R.raw.media_mute_unmute, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        zg0 zg0Var = new zg0(R.raw.media_mute_unmute, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.t = zg0Var;
        zg0Var.N(20, false, true);
        zg0Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, qs.n1);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(o4);
        this.f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z9, boolean z10) {
        zg0 zg0Var = this.u;
        if (!z10) {
            zg0Var.N(z9 ? 20 : 0, false, false);
            zg0Var.P(z9 ? 20 : 0);
            return;
        }
        if (z9) {
            if (zg0Var.a0 > 20) {
                zg0Var.N(0, false, false);
            }
            zg0Var.P(20);
            zg0Var.start();
            return;
        }
        int i7 = zg0Var.a0;
        if (i7 == 0 || i7 >= 43) {
            return;
        }
        zg0Var.P(43);
        zg0Var.start();
    }
}
