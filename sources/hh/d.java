package hh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.z8;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final j a;
    public final t1 b;
    public final ImageReceiver c;
    public final long d;
    public b e;
    public b f;
    public Paint g;
    public final StaticLayout h;
    public float i;
    public float j;
    public ValueAnimator k;
    public float l;
    public boolean m;
    public ValueAnimator n;
    public float o;
    public boolean p;

    public d(j jVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        z8 z8Var = new z8((f6) null);
        int i10 = UserConfig.selectedAccount;
        this.l = 1.0f;
        this.m = true;
        this.o = 0.0f;
        this.p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(jVar.a);
        this.c = imageReceiver2;
        this.a = jVar;
        t1 t1Var = jVar.y;
        this.b = t1Var;
        this.d = j10;
        z8Var.p = 1.0f;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            z8Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                z8Var.g(1);
                z8Var.p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, z8Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(i.a / 2.0f));
                imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(r2), AndroidUtilities.dp(r2));
                Paint M2 = t1Var.M2("paintChatActionText");
                if (str2 != null || M2 == null) {
                }
                int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(48);
                TextPaint textPaint = new TextPaint(M2);
                this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, dp, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(r5, 0, r5.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                return;
            }
            imageReceiver = imageReceiver2;
            str = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
            imageReceiver.setForUserOrChat(user, z8Var);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            str = chat != null ? chat.title : "";
            z8Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, z8Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(i.a / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(r2), AndroidUtilities.dp(r2));
        Paint M22 = t1Var.M2("paintChatActionText");
        if (str2 != null) {
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        float f14 = f11 / 2.0f;
        float f15 = f10 - f14;
        float f16 = f10 + f14;
        float f17 = f13 - f12;
        if (f11 <= f17) {
            return f15 < f12 ? f12 + f14 : f16 > f13 ? f13 - f14 : f10;
        }
        float f18 = (f12 + f13) / 2.0f;
        float f19 = f11 - f17;
        float max = Math.max(0.0f, f12 - f15);
        float max2 = Math.max(0.0f, f16 - f13);
        float f20 = max + max2;
        return f20 < 0.1f ? f18 : v2.c(f19, 2.0f, (max - max2) / f20, f18);
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f10 - f12, f11 - f12);
        int i10 = i.a;
        float f14 = 21;
        canvas.scale(f12 / AndroidUtilities.dp(f14), f12 / AndroidUtilities.dp(f14));
        float f15 = ((this.l * 0.25f) + 0.75f) * f13;
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setAlpha(f15);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.n) {
            this.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.k) {
            this.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.a.invalidateSelf();
    }
}
