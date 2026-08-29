package jh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class bb {
    public int a;
    public final RectF b;
    public final org.telegram.ui.Components.d6 c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final org.telegram.ui.Components.e9 l;
    public final org.telegram.ui.Components.e9 m;
    public zz0 n;
    public zz0 o;
    public boolean p;
    public final uc q;
    public int r;
    public Drawable s;
    public Drawable t;
    public zz0 u;
    public int v;
    public final /* synthetic */ cb w;

    public bb(cb cbVar, boolean z10, long j10) {
        String str;
        db dbVar = cbVar.r;
        this.w = cbVar;
        this.b = new RectF();
        jr jrVar = jr.h;
        this.c = new org.telegram.ui.Components.d6(cbVar, 0L, 600L, jrVar);
        this.d = new org.telegram.ui.Components.d6(cbVar, 0L, 200L, jrVar);
        this.e = new org.telegram.ui.Components.d6(cbVar, 0L, 350L, jrVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(cbVar);
        this.k = imageReceiver;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.l = e9Var;
        org.telegram.ui.Components.e9 e9Var2 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.m = e9Var2;
        this.q = new uc(cbVar);
        this.i = z10;
        this.j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(dbVar.c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            e9Var.r(user);
            imageReceiver.setForUserOrChat(user, e9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(dbVar.c).getChat(Long.valueOf(-j10));
            str = chat == null ? "" : chat.title;
            e9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, e9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        e9Var2.g(21);
        e9Var2.h(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.c8, dbVar.b));
        this.n = new zz0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.c.d(this.a, false);
        int i10 = this.a;
        cb cbVar = this.w;
        if (i10 >= 0 && i10 < cbVar.b.size()) {
            z10 = true;
        }
        float e10 = this.d.e(z10);
        canvas.save();
        float width = (cbVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, cbVar.f);
        float dp = ((cbVar.f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e10) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e10 > 0.0f) {
            float e11 = this.e.e(this.p);
            if (e11 < 1.0f) {
                f9 = 255.0f;
                float dp3 = AndroidUtilities.dp(56.0f);
                f10 = 40.0f;
                float dp4 = AndroidUtilities.dp(56.0f);
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), dp3, dp4);
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f9 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
            }
            if (e11 > 0.0f) {
                int i11 = (int) dp;
                int dp5 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp6 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp7 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp8 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                org.telegram.ui.Components.e9 e9Var = this.m;
                e9Var.setBounds(dp5, dp6, dp7, dp8);
                e9Var.y = (int) (e10 * f9 * e11);
                e9Var.draw(canvas);
                e9Var.y = 255;
            }
        } else {
            f9 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.o.c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.o.c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, cbVar.d);
        int i13 = (int) (e10 * f9);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f != null) {
            Matrix matrix = this.g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        zz0 zz0Var = this.o;
        zz0Var.c(dp - (zz0Var.c / f11), AndroidUtilities.dp(23.0f) + dp2, e10, -1, canvas);
        zz0 zz0Var2 = this.n;
        zz0Var2.p = width - AndroidUtilities.dp(4.0f);
        zz0Var2.c(dp - (this.n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e10, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, cbVar.r.b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.t.setAlpha(i13);
            this.s.setAlpha(i13);
            this.t.draw(canvas);
            this.s.draw(canvas);
            zz0 zz0Var3 = this.u;
            zz0Var3.c(dp - (zz0Var3.c / f11), dp2 - AndroidUtilities.dp(27.0f), e10, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        String str;
        String str2;
        cb cbVar = this.w;
        db dbVar = cbVar.r;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == UserConfig.getInstance(dbVar.c).getClientUserId() ? 0L : this.j) != j10) {
                this.p = j10 == UserObject.ANONYMOUS;
                if (j10 == 0 || j10 == UserObject.ANONYMOUS) {
                    j10 = UserConfig.getInstance(dbVar.c).getClientUserId();
                }
                this.j = j10;
                if (this.p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    org.telegram.ui.Components.e9 e9Var = this.l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(dbVar.c).getUser(Long.valueOf(this.j));
                        str = UserObject.getForcedFirstName(user);
                        e9Var.r(user);
                        imageReceiver.setForUserOrChat(user, e9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(dbVar.c).getChat(Long.valueOf(-this.j));
                        str = chat == null ? "" : chat.title;
                        e9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, e9Var);
                    }
                    str2 = str;
                }
                this.n = new zz0(str2, 12.0f, null);
                cbVar.invalidate();
            }
        }
    }
}
