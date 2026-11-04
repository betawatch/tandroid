package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x41 extends Drawable implements m5, p6, org.telegram.messenger.cs {
    public final b10 a;
    public final int b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final g5 h;
    public final w41 n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    public x41(TLRPC.VideoSize videoSize, boolean z10, int i3) {
        b10 b10Var = new b10();
        this.a = b10Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = org.telegram.messenger.h10.t0;
        this.b = i3;
        this.d = z10;
        b10Var.d(i0.a.o(videoSize.background_colors.get(0).intValue(), org.telegram.messenger.hs.e4), videoSize.background_colors.size() > 1 ? i0.a.o(videoSize.background_colors.get(1).intValue(), org.telegram.messenger.hs.e4) : 0, videoSize.background_colors.size() > 2 ? i0.a.o(videoSize.background_colors.get(2).intValue(), org.telegram.messenger.hs.e4) : 0, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), org.telegram.messenger.hs.e4) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            g5 g5Var = new g5((i3 == 1 && z10) ? 7 : i3 == 2 ? 15 : 8, org.telegram.messenger.h10.t0, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = g5Var;
            g5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            w41 w41Var = new w41(this);
            this.n = w41Var;
            w41Var.K0 = true;
            if (i3 == 1) {
                w41Var.X(2);
            }
            d();
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.o(this);
            }
            w41 w41Var = this.n;
            if (w41Var != null) {
                w41Var.R();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.x != null) {
            org.telegram.messenger.hs.f(this.s).n(this, org.telegram.messenger.hs.B0);
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.c = imageReceiver.X0[0];
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.b(this);
            }
            w41 w41Var = this.n;
            if (w41Var != null) {
                w41Var.P();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.P();
            }
        }
        hashSet.add(imageReceiver);
        if (this.x != null) {
            org.telegram.messenger.hs.f(this.s).c(this, org.telegram.messenger.hs.B0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        TLRPC.Document document;
        String str;
        String str2;
        String str3;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.s);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.x;
        TLRPC.TL_messages_stickerSet m0 = b02.m0(tL_videoSizeStickerMarkup.stickerset, false);
        if (m0 != null) {
            this.w = true;
            for (int i3 = 0; i3 < m0.documents.size(); i3++) {
                if (m0.documents.get(i3).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = m0.documents.get(i3);
                    boolean z10 = this.d;
                    int i10 = this.b;
                    if (z10 && i10 == 1) {
                        str3 = "50_50";
                    } else {
                        if (i10 != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.u0(org.telegram.messenger.ac.b(document2), str2, org.telegram.messenger.ac.b(document), str, null, null, org.telegram.messenger.t5.f(document2, org.telegram.ui.ActionBar.k6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                            if (i10 != 3) {
                                this.r.r0(org.telegram.messenger.ac.b(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.u0(org.telegram.messenger.ac.b(document2), str2, org.telegram.messenger.ac.b(document), str, null, null, org.telegram.messenger.t5.f(document2, org.telegram.ui.ActionBar.k6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                    if (i10 != 3) {
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.B0 || this.w) {
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
        b10 b10Var = this.a;
        b10Var.b(f10, f11, f12, f13);
        Paint paint = b10Var.c;
        if (this.e != null) {
            this.c = r1.X0[0];
        }
        float f14 = this.c;
        if (f14 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(b10Var.h, f14, f14, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        g5 g5Var = this.h;
        if (g5Var != null) {
            ei.c3 c3Var = g5Var.k;
            if (c3Var != null) {
                c3Var.J0((int) (width * 2 * 0.13f));
            }
            g5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            g5Var.draw(canvas);
        }
        w41 w41Var = this.n;
        if (w41Var != null) {
            float f15 = width * 2;
            w41Var.J0((int) (0.13f * f15));
            w41Var.y0(centerX - width, centerY - width, f15, f15);
            w41Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj == null || x41.class != obj.getClass()) {
            return false;
        }
        x41 x41Var = (x41) obj;
        g5 g5Var = x41Var.h;
        if (this.b != x41Var.b) {
            return false;
        }
        b10 b10Var = this.a;
        int i3 = b10Var.d;
        b10 b10Var2 = x41Var.a;
        if (i3 != b10Var2.d || b10Var.e != b10Var2.e || b10Var.f != b10Var2.f || b10Var.g != b10Var2.g) {
            return false;
        }
        g5 g5Var2 = this.h;
        if (g5Var2 != null && g5Var != null) {
            return g5Var2.h() == g5Var.h();
        }
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
        return tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = x41Var.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // org.telegram.ui.Components.m5
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.a.c.setAlpha(i3);
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.setAlpha(i3);
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final /* synthetic */ void a(fh0 fh0Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
