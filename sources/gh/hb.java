package gh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class hb {
    public int a;
    public final RectF b;
    public final org.telegram.ui.Components.y5 c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final org.telegram.ui.Components.z8 l;
    public final org.telegram.ui.Components.z8 m;
    public nz0 n;
    public nz0 o;
    public boolean p;
    public final pc q;
    public int r;
    public Drawable s;
    public Drawable t;
    public nz0 u;
    public int v;
    public final /* synthetic */ ib w;

    public hb(ib ibVar, boolean z10, long j10) {
        String str;
        jb jbVar = ibVar.r;
        this.w = ibVar;
        this.b = new RectF();
        gr grVar = gr.h;
        this.c = new org.telegram.ui.Components.y5(ibVar, 0L, 600L, grVar);
        this.d = new org.telegram.ui.Components.y5(ibVar, 0L, 200L, grVar);
        this.e = new org.telegram.ui.Components.y5(ibVar, 0L, 350L, grVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(ibVar);
        this.k = imageReceiver;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.l = z8Var;
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.m = z8Var2;
        this.q = new pc(ibVar);
        this.i = z10;
        this.j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(jbVar.c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            imageReceiver.setForUserOrChat(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(jbVar.c).getChat(Long.valueOf(-j10));
            str = chat == null ? "" : chat.title;
            z8Var.q(chat);
            imageReceiver.setForUserOrChat(chat, z8Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        z8Var2.g(21);
        z8Var2.h(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.c8, jbVar.b));
        this.n = new nz0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float d = this.c.d(this.a, false);
        int i9 = this.a;
        ib ibVar = this.w;
        if (i9 >= 0 && i9 < ibVar.b.size()) {
            z10 = true;
        }
        float e10 = this.d.e(z10);
        canvas.save();
        float width = (ibVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, ibVar.f);
        float dp = ((ibVar.f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f13 = width / 2.0f;
        this.b.set(dp - f13, dp2 - AndroidUtilities.dp(50.0f), f13 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f14 = (0.3f * e10) + 0.7f;
        canvas.scale(f14, f14, dp, dp2);
        float a2 = this.q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e10 > 0.0f) {
            float e11 = this.e.e(this.p);
            if (e11 < 1.0f) {
                f10 = 255.0f;
                float dp3 = AndroidUtilities.dp(56.0f);
                f11 = 40.0f;
                float dp4 = AndroidUtilities.dp(56.0f);
                f12 = 2.0f;
                ImageReceiver imageReceiver = this.k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), dp3, dp4);
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
            }
            if (e11 > 0.0f) {
                int i10 = (int) dp;
                int dp5 = i10 - (AndroidUtilities.dp(56.0f) / 2);
                int i11 = (int) dp2;
                int dp6 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int dp7 = (AndroidUtilities.dp(56.0f) / 2) + i10;
                int dp8 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                org.telegram.ui.Components.z8 z8Var = this.m;
                z8Var.setBounds(dp5, dp6, dp7, dp8);
                z8Var.y = (int) (e10 * f10 * e11);
                z8Var.draw(canvas);
                z8Var.y = 255;
            }
        } else {
            f10 = 255.0f;
            f11 = 40.0f;
            f12 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.o.c / f12)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f12), (this.o.c / f12) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f12) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, ibVar.d);
        int i12 = (int) (e10 * f10);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f != null) {
            Matrix matrix = this.g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, paint);
        nz0 nz0Var = this.o;
        nz0Var.c(dp - (nz0Var.c / f12), AndroidUtilities.dp(23.0f) + dp2, e10, -1, canvas);
        nz0 nz0Var2 = this.n;
        nz0Var2.p = width - AndroidUtilities.dp(4.0f);
        nz0Var2.c(dp - (this.n.l() / f12), AndroidUtilities.dp(42.0f) + dp2, e10, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, ibVar.r.b), canvas);
        if (this.v > 0) {
            int i13 = (int) dp;
            int i14 = (int) dp2;
            this.t.setBounds(i13 - AndroidUtilities.dp(12.0f), i14 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i13, i14 - AndroidUtilities.dp(16.0f));
            this.s.setBounds(i13 - AndroidUtilities.dp(12.0f), i14 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i13, i14 - AndroidUtilities.dp(16.0f));
            this.t.setAlpha(i12);
            this.s.setAlpha(i12);
            this.t.draw(canvas);
            this.s.draw(canvas);
            nz0 nz0Var3 = this.u;
            nz0Var3.c(dp - (nz0Var3.c / f12), dp2 - AndroidUtilities.dp(27.0f), e10, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        String str;
        String str2;
        ib ibVar = this.w;
        jb jbVar = ibVar.r;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == UserConfig.getInstance(jbVar.c).getClientUserId() ? 0L : this.j) != j10) {
                this.p = j10 == UserObject.ANONYMOUS;
                if (j10 == 0 || j10 == UserObject.ANONYMOUS) {
                    j10 = UserConfig.getInstance(jbVar.c).getClientUserId();
                }
                this.j = j10;
                if (this.p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    org.telegram.ui.Components.z8 z8Var = this.l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(jbVar.c).getUser(Long.valueOf(this.j));
                        str = UserObject.getForcedFirstName(user);
                        z8Var.r(user);
                        imageReceiver.setForUserOrChat(user, z8Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(jbVar.c).getChat(Long.valueOf(-this.j));
                        str = chat == null ? "" : chat.title;
                        z8Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, z8Var);
                    }
                    str2 = str;
                }
                this.n = new nz0(str2, 12.0f, null);
                ibVar.invalidate();
            }
        }
    }
}
