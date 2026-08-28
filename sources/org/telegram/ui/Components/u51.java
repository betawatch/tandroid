package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u51 extends Drawable implements q5, r6, NotificationCenter.NotificationCenterDelegate {
    public final z10 a;
    public final int b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final k5 h;
    public final t51 n;
    public final ImageReceiver r;
    public final int s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup w;

    public u51(TLRPC.VideoSize videoSize, boolean z10, int i9) {
        z10 z10Var = new z10();
        this.a = z10Var;
        this.f = new HashSet();
        this.r = new ImageReceiver();
        this.s = UserConfig.selectedAccount;
        this.b = i9;
        this.d = z10;
        z10Var.d(i0.a.k(videoSize.background_colors.get(0).intValue(), 255), videoSize.background_colors.size() > 1 ? i0.a.k(videoSize.background_colors.get(1).intValue(), 255) : 0, videoSize.background_colors.size() > 2 ? i0.a.k(videoSize.background_colors.get(2).intValue(), 255) : 0, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            k5 k5Var = new k5((i9 == 1 && z10) ? 7 : i9 == 2 ? 15 : 8, UserConfig.selectedAccount, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = k5Var;
            k5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            t51 t51Var = new t51(this);
            this.n = t51Var;
            t51Var.setInvalidateAll(true);
            if (i9 == 1) {
                t51Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            k5 k5Var = this.h;
            if (k5Var != null) {
                k5Var.p(this);
            }
            t51 t51Var = this.n;
            if (t51Var != null) {
                t51Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.w != null) {
            NotificationCenter.getInstance(this.s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.c = imageReceiver.getRoundRadius()[0];
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            k5 k5Var = this.h;
            if (k5Var != null) {
                k5Var.b(this);
            }
            t51 t51Var = this.n;
            if (t51Var != null) {
                t51Var.onAttachedToWindow();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.onAttachedToWindow();
            }
        }
        hashSet.add(imageReceiver);
        if (this.w != null) {
            NotificationCenter.getInstance(this.s).addObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        TLRPC.Document document;
        String str;
        String str2;
        String str3;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.s);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.w;
        TLRPC.TL_messages_stickerSet stickerSet = mediaDataController.getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
        if (stickerSet != null) {
            this.v = true;
            for (int i9 = 0; i9 < stickerSet.documents.size(); i9++) {
                if (stickerSet.documents.get(i9).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = stickerSet.documents.get(i9);
                    boolean z10 = this.d;
                    int i10 = this.b;
                    if (z10 && i10 == 1) {
                        str3 = "50_50";
                    } else {
                        if (i10 != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.setImage(ImageLocation.getForDocument(document2), str2, ImageLocation.getForDocument(document), str, null, null, DocumentObject.getSvgThumb(document2, org.telegram.ui.ActionBar.f6.m6, 0.2f), 0L, "tgs", document2, 0);
                            if (i10 != 3) {
                                this.r.setImage(ImageLocation.getForDocument(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.setImage(ImageLocation.getForDocument(document2), str2, ImageLocation.getForDocument(document), str, null, null, DocumentObject.getSvgThumb(document2, org.telegram.ui.ActionBar.f6.m6, 0.2f), 0L, "tgs", document2, 0);
                    if (i10 != 3) {
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.groupStickersDidLoad || this.v) {
            return;
        }
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = getBounds().left;
        float f11 = getBounds().top;
        float f12 = getBounds().right;
        float f13 = getBounds().bottom;
        z10 z10Var = this.a;
        z10Var.b(f10, f11, f12, f13);
        Paint paint = z10Var.c;
        if (this.e != null) {
            this.c = r1.getRoundRadius()[0];
        }
        float f14 = this.c;
        if (f14 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(z10Var.h, f14, f14, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        k5 k5Var = this.h;
        if (k5Var != null) {
            ih.z2 z2Var = k5Var.k;
            if (z2Var != null) {
                z2Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            k5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            k5Var.draw(canvas);
        }
        t51 t51Var = this.n;
        if (t51Var != null) {
            float f15 = width * 2;
            t51Var.setRoundRadius((int) (0.13f * f15));
            t51Var.setImageCoords(centerX - width, centerY - width, f15, f15);
            t51Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && u51.class == obj.getClass()) {
            u51 u51Var = (u51) obj;
            k5 k5Var = u51Var.h;
            if (this.b == u51Var.b) {
                z10 z10Var = this.a;
                int i9 = z10Var.d;
                z10 z10Var2 = u51Var.a;
                if (i9 == z10Var2.d && z10Var.e == z10Var2.e && z10Var.f == z10Var2.f && z10Var.g == z10Var2.g) {
                    k5 k5Var2 = this.h;
                    if (k5Var2 != null && k5Var != null) {
                        return k5Var2.i() == k5Var.i();
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = u51Var.w) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // org.telegram.ui.Components.q5
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.a.c.setAlpha(i9);
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.setAlpha(i9);
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final /* synthetic */ void a(pi0 pi0Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
