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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e71 extends Drawable implements v5, w6, NotificationCenter.NotificationCenterDelegate {
    public final o20 a;
    public final int b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final p5 h;
    public final d71 n;
    public final ImageReceiver r;
    public final int s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup w;

    public e71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        o20 o20Var = new o20();
        this.a = o20Var;
        this.f = new HashSet();
        this.r = new ImageReceiver();
        this.s = UserConfig.selectedAccount;
        this.b = i10;
        this.d = z10;
        o20Var.d(i0.a.k(videoSize.background_colors.get(0).intValue(), 255), videoSize.background_colors.size() > 1 ? i0.a.k(videoSize.background_colors.get(1).intValue(), 255) : 0, videoSize.background_colors.size() > 2 ? i0.a.k(videoSize.background_colors.get(2).intValue(), 255) : 0, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            p5 p5Var = new p5((i10 == 1 && z10) ? 7 : i10 == 2 ? 15 : 8, UserConfig.selectedAccount, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            d71 d71Var = new d71(this);
            this.n = d71Var;
            d71Var.setInvalidateAll(true);
            if (i10 == 1) {
                d71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override // org.telegram.ui.Components.w6
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.p(this);
            }
            d71 d71Var = this.n;
            if (d71Var != null) {
                d71Var.onDetachedFromWindow();
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

    @Override // org.telegram.ui.Components.w6
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.c = imageReceiver.getRoundRadius()[0];
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.b(this);
            }
            d71 d71Var = this.n;
            if (d71Var != null) {
                d71Var.onAttachedToWindow();
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
            for (int i10 = 0; i10 < stickerSet.documents.size(); i10++) {
                if (stickerSet.documents.get(i10).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = stickerSet.documents.get(i10);
                    boolean z10 = this.d;
                    int i11 = this.b;
                    if (z10 && i11 == 1) {
                        str3 = "50_50";
                    } else {
                        if (i11 != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.setImage(ImageLocation.getForDocument(document2), str2, ImageLocation.getForDocument(document), str, null, null, DocumentObject.getSvgThumb(document2, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", document2, 0);
                            if (i11 != 3) {
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
                    this.n.setImage(ImageLocation.getForDocument(document2), str2, ImageLocation.getForDocument(document), str, null, null, DocumentObject.getSvgThumb(document2, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", document2, 0);
                    if (i11 != 3) {
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.groupStickersDidLoad || this.v) {
            return;
        }
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f7 = getBounds().left;
        float f10 = getBounds().top;
        float f11 = getBounds().right;
        float f12 = getBounds().bottom;
        o20 o20Var = this.a;
        o20Var.b(f7, f10, f11, f12);
        Paint paint = o20Var.c;
        if (this.e != null) {
            this.c = r1.getRoundRadius()[0];
        }
        float f13 = this.c;
        if (f13 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(o20Var.h, f13, f13, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        p5 p5Var = this.h;
        if (p5Var != null) {
            ai.l4 l4Var = p5Var.k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            p5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            p5Var.draw(canvas);
        }
        d71 d71Var = this.n;
        if (d71Var != null) {
            float f14 = width * 2;
            d71Var.setRoundRadius((int) (0.13f * f14));
            d71Var.setImageCoords(centerX - width, centerY - width, f14, f14);
            d71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && e71.class == obj.getClass()) {
            e71 e71Var = (e71) obj;
            p5 p5Var = e71Var.h;
            if (this.b == e71Var.b) {
                o20 o20Var = this.a;
                int i10 = o20Var.d;
                o20 o20Var2 = e71Var.a;
                if (i10 == o20Var2.d && o20Var.e == o20Var2.e && o20Var.f == o20Var2.f && o20Var.g == o20Var2.g) {
                    p5 p5Var2 = this.h;
                    if (p5Var2 != null && p5Var != null) {
                        return p5Var2.i() == p5Var.i();
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = e71Var.w) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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

    @Override // org.telegram.ui.Components.v5
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.c.setAlpha(i10);
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.setAlpha(i10);
        }
    }

    @Override // org.telegram.ui.Components.w6
    public final /* synthetic */ void a(kj0 kj0Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
