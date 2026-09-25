package ai;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class b6 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final com.google.firebase.messaging.n g = new com.google.firebase.messaging.n(5);
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
    public final ij0 t;
    public final ij0 u;

    public b6(Context context) {
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
        this.u = new ij0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        ij0 ij0Var = new ij0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.t = ij0Var;
        ij0Var.N(20, false, true);
        ij0Var.stop();
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

    public final void a(boolean z10, boolean z11) {
        ij0 ij0Var = this.u;
        if (!z11) {
            ij0Var.N(z10 ? 20 : 0, false, false);
            ij0Var.P(z10 ? 20 : 0);
            return;
        }
        if (z10) {
            if (ij0Var.a0 > 20) {
                ij0Var.N(0, false, false);
            }
            ij0Var.P(20);
            ij0Var.start();
            return;
        }
        int i10 = ij0Var.a0;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        ij0Var.P(43);
        ij0Var.start();
    }
}
