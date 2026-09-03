package mh;

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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class cb {
    public int a;
    public final RectF b;
    public final org.telegram.ui.Components.z5 c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final org.telegram.ui.Components.z8 l;
    public final org.telegram.ui.Components.z8 m;
    public k01 n;
    public k01 o;
    public boolean p;
    public final rc q;
    public int r;
    public Drawable s;
    public Drawable t;
    public k01 u;
    public int v;
    public final /* synthetic */ db w;

    public cb(db dbVar, boolean z4, long j10) {
        String str;
        eb ebVar = dbVar.r;
        this.w = dbVar;
        this.b = new RectF();
        pr prVar = pr.h;
        this.c = new org.telegram.ui.Components.z5(dbVar, 0L, 600L, prVar);
        this.d = new org.telegram.ui.Components.z5(dbVar, 0L, 200L, prVar);
        this.e = new org.telegram.ui.Components.z5(dbVar, 0L, 350L, prVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(dbVar);
        this.k = imageReceiver;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.l = z8Var;
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.m = z8Var2;
        this.q = new rc(dbVar);
        this.i = z4;
        this.j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(ebVar.c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            imageReceiver.setForUserOrChat(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(ebVar.c).getChat(Long.valueOf(-j10));
            str = chat == null ? "" : chat.title;
            z8Var.q(chat);
            imageReceiver.setForUserOrChat(chat, z8Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        z8Var2.g(21);
        z8Var2.h(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.c8, ebVar.b));
        this.n = new k01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z4 = false;
        float d = this.c.d(this.a, false);
        int i10 = this.a;
        db dbVar = this.w;
        if (i10 >= 0 && i10 < dbVar.b.size()) {
            z4 = true;
        }
        float e6 = this.d.e(z4);
        canvas.save();
        float width = (dbVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, dbVar.f);
        float dp = ((dbVar.f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f13 = width / 2.0f;
        this.b.set(dp - f13, dp2 - AndroidUtilities.dp(50.0f), f13 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f14 = (0.3f * e6) + 0.7f;
        canvas.scale(f14, f14, dp, dp2);
        float a2 = this.q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e6 > 0.0f) {
            float e10 = this.e.e(this.p);
            if (e10 < 1.0f) {
                f10 = 255.0f;
                float dp3 = AndroidUtilities.dp(56.0f);
                f11 = 40.0f;
                float dp4 = AndroidUtilities.dp(56.0f);
                f12 = 2.0f;
                ImageReceiver imageReceiver = this.k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), dp3, dp4);
                imageReceiver.setAlpha(e6);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
            }
            if (e10 > 0.0f) {
                int i11 = (int) dp;
                int dp5 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp6 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp7 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp8 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                org.telegram.ui.Components.z8 z8Var = this.m;
                z8Var.setBounds(dp5, dp6, dp7, dp8);
                z8Var.y = (int) (e6 * f10 * e10);
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
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, dbVar.d);
        int i13 = (int) (e6 * f10);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f != null) {
            Matrix matrix = this.g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, paint);
        k01 k01Var = this.o;
        k01Var.c(dp - (k01Var.c / f12), AndroidUtilities.dp(23.0f) + dp2, e6, -1, canvas);
        k01 k01Var2 = this.n;
        k01Var2.p = width - AndroidUtilities.dp(4.0f);
        k01Var2.c(dp - (this.n.l() / f12), AndroidUtilities.dp(42.0f) + dp2, e6, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, dbVar.r.b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.t.setAlpha(i13);
            this.s.setAlpha(i13);
            this.t.draw(canvas);
            this.s.draw(canvas);
            k01 k01Var3 = this.u;
            k01Var3.c(dp - (k01Var3.c / f12), dp2 - AndroidUtilities.dp(27.0f), e6, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        String str;
        String str2;
        db dbVar = this.w;
        eb ebVar = dbVar.r;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == UserConfig.getInstance(ebVar.c).getClientUserId() ? 0L : this.j) != j10) {
                this.p = j10 == UserObject.ANONYMOUS;
                if (j10 == 0 || j10 == UserObject.ANONYMOUS) {
                    j10 = UserConfig.getInstance(ebVar.c).getClientUserId();
                }
                this.j = j10;
                if (this.p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    org.telegram.ui.Components.z8 z8Var = this.l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(ebVar.c).getUser(Long.valueOf(this.j));
                        str = UserObject.getForcedFirstName(user);
                        z8Var.r(user);
                        imageReceiver.setForUserOrChat(user, z8Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(ebVar.c).getChat(Long.valueOf(-this.j));
                        str = chat == null ? "" : chat.title;
                        z8Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, z8Var);
                    }
                    str2 = str;
                }
                this.n = new k01(str2, 12.0f, null);
                dbVar.invalidate();
            }
        }
    }
}
