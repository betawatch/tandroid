// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class m68 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final fp g = new fp((byte) 1);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final Paint l = new Paint();
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public final Drawable s;
    public final b29 t;
    public final b29 u;

    public m68(Context context) {
        this.m = context.getDrawable(R.drawable.media_share);
        this.o = context.getDrawable(R.drawable.media_like);
        this.n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.q = context.getDrawable(R.drawable.media_more);
        this.r = context.getDrawable(R.drawable.menu_stream_pip);
        this.s = context.getDrawable(R.drawable.msg_delete);
        this.u = new b29(R.raw.media_mute_unmute, hl.L(28.0f), hl.L(28.0f), true, null);
        b29 b29Var = new b29(R.raw.media_mute_unmute, hl.L(28.0f), hl.L(28.0f), true, null);
        this.t = b29Var;
        b29Var.I(20, false, true);
        b29Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int o = vm2.o(-16777216, jn7.m1);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(o);
        this.f = new ColorDrawable(vm2.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z, boolean z2) {
        b29 b29Var = this.u;
        if (!z2) {
            b29Var.I(z ? 20 : 0, false, false);
            b29Var.K(z ? 20 : 0);
            return;
        }
        if (z) {
            if (b29Var.b0 > 20) {
                b29Var.I(0, false, false);
            }
            b29Var.K(20);
            b29Var.start();
            return;
        }
        int i = b29Var.b0;
        if (i == 0 || i >= 43) {
            return;
        }
        b29Var.K(43);
        b29Var.start();
    }
}
