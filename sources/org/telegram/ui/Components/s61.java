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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s61 extends Drawable implements r5, s6, NotificationCenter.NotificationCenterDelegate {
    public final p20 a;
    public final int b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final l5 h;
    public final r61 n;
    public final ImageReceiver r;
    public final int s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup w;

    public s61(TLRPC.VideoSize videoSize, boolean z4, int i10) {
        p20 p20Var = new p20();
        this.a = p20Var;
        this.f = new HashSet();
        this.r = new ImageReceiver();
        this.s = UserConfig.selectedAccount;
        this.b = i10;
        this.d = z4;
        p20Var.d(i0.a.k(videoSize.background_colors.get(0).intValue(), 255), videoSize.background_colors.size() > 1 ? i0.a.k(videoSize.background_colors.get(1).intValue(), 255) : 0, videoSize.background_colors.size() > 2 ? i0.a.k(videoSize.background_colors.get(2).intValue(), 255) : 0, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            l5 l5Var = new l5((i10 == 1 && z4) ? 7 : i10 == 2 ? 15 : 8, UserConfig.selectedAccount, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = l5Var;
            l5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            r61 r61Var = new r61(this);
            this.n = r61Var;
            r61Var.setInvalidateAll(true);
            if (i10 == 1) {
                r61Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            l5 l5Var = this.h;
            if (l5Var != null) {
                l5Var.p(this);
            }
            r61 r61Var = this.n;
            if (r61Var != null) {
                r61Var.onDetachedFromWindow();
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

    @Override // org.telegram.ui.Components.s6
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.c = imageReceiver.getRoundRadius()[0];
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            l5 l5Var = this.h;
            if (l5Var != null) {
                l5Var.b(this);
            }
            r61 r61Var = this.n;
            if (r61Var != null) {
                r61Var.onAttachedToWindow();
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
                    boolean z4 = this.d;
                    int i11 = this.b;
                    if (z4 && i11 == 1) {
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
        float f10 = getBounds().left;
        float f11 = getBounds().top;
        float f12 = getBounds().right;
        float f13 = getBounds().bottom;
        p20 p20Var = this.a;
        p20Var.b(f10, f11, f12, f13);
        Paint paint = p20Var.c;
        if (this.e != null) {
            this.c = r1.getRoundRadius()[0];
        }
        float f14 = this.c;
        if (f14 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(p20Var.h, f14, f14, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        l5 l5Var = this.h;
        if (l5Var != null) {
            nh.y2 y2Var = l5Var.k;
            if (y2Var != null) {
                y2Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            l5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            l5Var.draw(canvas);
        }
        r61 r61Var = this.n;
        if (r61Var != null) {
            float f15 = width * 2;
            r61Var.setRoundRadius((int) (0.13f * f15));
            r61Var.setImageCoords(centerX - width, centerY - width, f15, f15);
            r61Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && s61.class == obj.getClass()) {
            s61 s61Var = (s61) obj;
            l5 l5Var = s61Var.h;
            if (this.b == s61Var.b) {
                p20 p20Var = this.a;
                int i10 = p20Var.d;
                p20 p20Var2 = s61Var.a;
                if (i10 == p20Var2.d && p20Var.e == p20Var2.e && p20Var.f == p20Var2.f && p20Var.g == p20Var2.g) {
                    l5 l5Var2 = this.h;
                    if (l5Var2 != null && l5Var != null) {
                        return l5Var2.i() == l5Var.i();
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = s61Var.w) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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

    @Override // org.telegram.ui.Components.r5
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.c.setAlpha(i10);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.setAlpha(i10);
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final /* synthetic */ void a(jj0 jj0Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
