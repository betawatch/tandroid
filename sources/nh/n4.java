package nh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n4 extends Drawable implements r6, NotificationCenter.NotificationCenterDelegate {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final k5[] f;
    public final pz0 h;
    public final RectF n;
    public final boolean r;
    public final y5 s;
    public boolean v;
    public boolean w;
    public View x;

    public n4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.c = imageReceiver;
        this.d = new ImageReceiver();
        this.e = 1;
        this.f = new k5[2];
        this.n = new RectF();
        this.s = new y5(new m4(this, 1), 320L, er.h, 0);
        this.r = false;
        int i10 = g6.d6;
        paint.setColor(g6.w0(null, i10, false));
        paint2.setColor(g6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), g6.l1(0.18f, -16777216));
        y8 y8Var = new y8((c6) null);
        y8Var.r(user);
        imageReceiver.setForUserOrChat(user, y8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new pz0(UserObject.getUserName(user), 14.0f, null);
    }

    @Override // org.telegram.ui.Components.r6
    public final void a(ri0 ri0Var) {
        this.x = ri0Var;
        this.d.setParentView(ri0Var);
        this.c.setParentView(ri0Var);
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(ImageReceiver imageReceiver) {
        this.w = false;
        this.c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        k5[] k5VarArr = this.f;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.o(this.x);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.o(this.x);
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void c(ImageReceiver imageReceiver) {
        this.w = true;
        this.c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        k5[] k5VarArr = this.f;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.a(this.x);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.a(this.x);
        }
    }

    public final void d() {
        k5 k5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet == null || stickerSet.documents.isEmpty()) {
            this.v = true;
            return;
        }
        TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
        int i10 = 1 - this.e;
        this.e = i10;
        k5[] k5VarArr = this.f;
        k5 k5Var2 = k5VarArr[i10];
        if (k5Var2 != null) {
            k5Var2.o(this.x);
        }
        k5VarArr[this.e] = k5.m(UserConfig.selectedAccount, 9, document);
        k5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Oh, false), PorterDuff.Mode.SRC_IN));
        if (this.w && (k5Var = k5VarArr[this.e]) != null) {
            k5Var.a(this.x);
        }
        AndroidUtilities.runOnUIThread(new m4(this, 0), 2500L);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.w) {
            this.v = false;
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        k5 k5Var;
        k5 k5Var2;
        Rect bounds = getBounds();
        boolean z10 = this.r;
        float dp = AndroidUtilities.dp((z10 ? 48 : 28) + 38 + 6.66f) + this.h.c;
        float f14 = dp / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.n;
        rectF.set(bounds.centerX() - f14, bounds.centerY() - dp2, bounds.centerX() + f14, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.a);
        float f15 = rectF.left;
        float f16 = rectF.top;
        float dp3 = AndroidUtilities.dp(32.0f);
        float dp4 = AndroidUtilities.dp(32.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setImageCoords(f15, f16, dp3, dp4);
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, g6.w0(null, g6.G6, false), canvas);
        if (z10) {
            float dp5 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp5, rectF.centerY(), AndroidUtilities.dp(24.0f), this.b);
            float centerY = rectF.centerY() - AndroidUtilities.dp(16.0f);
            float dp6 = AndroidUtilities.dp(32.0f);
            float dp7 = AndroidUtilities.dp(32.0f);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp5 - AndroidUtilities.dp(16.0f), centerY, dp6, dp7);
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.s.d(this.e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        k5[] k5VarArr = this.f;
        if (d >= 1.0f || (k5Var2 = k5VarArr[0]) == null) {
            f10 = 24.0f;
            f11 = 0.4f;
            f12 = 255.0f;
            f13 = 12.0f;
        } else {
            canvas.save();
            f10 = 24.0f;
            canvas.translate(0.0f, (this.e == 0 ? -1 : 1) * AndroidUtilities.dp(9.0f) * d);
            float f17 = 1.0f - d;
            f12 = 255.0f;
            float f18 = (f17 * 0.4f) + 0.6f;
            f11 = 0.4f;
            f13 = 12.0f;
            canvas.scale(f18, f18, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            k5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            k5Var2.setAlpha((int) (f17 * 255.0f));
            k5Var2.draw(canvas);
            canvas.restore();
        }
        if (d > 0.0f && (k5Var = k5VarArr[1]) != null) {
            canvas.save();
            canvas.translate(0.0f, (1.0f - d) * AndroidUtilities.dp(9.0f) * (this.e != 1 ? 1 : -1));
            float f19 = (d * f11) + 0.6f;
            canvas.scale(f19, f19, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13));
            k5Var.setBounds(0, 0, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            k5Var.setAlpha((int) (d * f12));
            k5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public n4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new k5[2];
        this.n = new RectF();
        this.s = new y5(new m4(this, 1), 320L, er.h, 0);
        this.r = true;
        int i10 = g6.d6;
        paint.setColor(g6.w0(null, i10, false));
        paint2.setColor(g6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), g6.l1(0.18f, -16777216));
        y8 y8Var = new y8((c6) null);
        y8Var.r(user);
        imageReceiver.setForUserOrChat(user, y8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document), "120_120", DocumentObject.getSvgThumb(document.thumbs, g6.a7, 0.35f), 0L, null, null, 0);
        this.h = new pz0(UserObject.getUserName(user), 14.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
