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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g51 extends Drawable implements m5, p6, org.telegram.messenger.is {
    public final i10 a;
    public final int b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final g5 h;
    public final f51 n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    public g51(TLRPC.VideoSize videoSize, boolean z10, int i7) {
        i10 i10Var = new i10();
        this.a = i10Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = org.telegram.messenger.m10.t0;
        this.b = i7;
        this.d = z10;
        i10Var.d(i0.a.o(videoSize.background_colors.get(0).intValue(), org.telegram.messenger.ns.e4), videoSize.background_colors.size() > 1 ? i0.a.o(videoSize.background_colors.get(1).intValue(), org.telegram.messenger.ns.e4) : 0, videoSize.background_colors.size() > 2 ? i0.a.o(videoSize.background_colors.get(2).intValue(), org.telegram.messenger.ns.e4) : 0, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), org.telegram.messenger.ns.e4) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            g5 g5Var = new g5((i7 == 1 && z10) ? 7 : i7 == 2 ? 15 : 8, org.telegram.messenger.m10.t0, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = g5Var;
            g5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            f51 f51Var = new f51(this);
            this.n = f51Var;
            f51Var.K0 = true;
            if (i7 == 1) {
                f51Var.X(2);
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
            f51 f51Var = this.n;
            if (f51Var != null) {
                f51Var.R();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.x != null) {
            org.telegram.messenger.ns.f(this.s).n(this, org.telegram.messenger.ns.B0);
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
            f51 f51Var = this.n;
            if (f51Var != null) {
                f51Var.P();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.P();
            }
        }
        hashSet.add(imageReceiver);
        if (this.x != null) {
            org.telegram.messenger.ns.f(this.s).c(this, org.telegram.messenger.ns.B0);
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
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.s);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.x;
        TLRPC.TL_messages_stickerSet m0 = b02.m0(tL_videoSizeStickerMarkup.stickerset, false);
        if (m0 != null) {
            this.w = true;
            for (int i7 = 0; i7 < m0.documents.size(); i7++) {
                if (m0.documents.get(i7).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = m0.documents.get(i7);
                    boolean z10 = this.d;
                    int i10 = this.b;
                    if (z10 && i10 == 1) {
                        str3 = "50_50";
                    } else {
                        if (i10 != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.u0(org.telegram.messenger.gc.b(document2), str2, org.telegram.messenger.gc.b(document), str, null, null, org.telegram.messenger.t5.f(document2, org.telegram.ui.ActionBar.j6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                            if (i10 != 3) {
                                this.r.r0(org.telegram.messenger.gc.b(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.u0(org.telegram.messenger.gc.b(document2), str2, org.telegram.messenger.gc.b(document), str, null, null, org.telegram.messenger.t5.f(document2, org.telegram.ui.ActionBar.j6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                    if (i10 != 3) {
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ns.B0 || this.w) {
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
        i10 i10Var = this.a;
        i10Var.b(f10, f11, f12, f13);
        Paint paint = i10Var.c;
        if (this.e != null) {
            this.c = r1.X0[0];
        }
        float f14 = this.c;
        if (f14 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(i10Var.h, f14, f14, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        g5 g5Var = this.h;
        if (g5Var != null) {
            fi.u2 u2Var = g5Var.k;
            if (u2Var != null) {
                u2Var.J0((int) (width * 2 * 0.13f));
            }
            g5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            g5Var.draw(canvas);
        }
        f51 f51Var = this.n;
        if (f51Var != null) {
            float f15 = width * 2;
            f51Var.J0((int) (0.13f * f15));
            f51Var.y0(centerX - width, centerY - width, f15, f15);
            f51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj == null || g51.class != obj.getClass()) {
            return false;
        }
        g51 g51Var = (g51) obj;
        g5 g5Var = g51Var.h;
        if (this.b != g51Var.b) {
            return false;
        }
        i10 i10Var = this.a;
        int i7 = i10Var.d;
        i10 i10Var2 = g51Var.a;
        if (i7 != i10Var2.d || i10Var.e != i10Var2.e || i10Var.f != i10Var2.f || i10Var.g != i10Var2.g) {
            return false;
        }
        g5 g5Var2 = this.h;
        if (g5Var2 != null && g5Var != null) {
            return g5Var2.h() == g5Var.h();
        }
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
        return tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = g51Var.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id;
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
    public final void setAlpha(int i7) {
        this.a.c.setAlpha(i7);
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.setAlpha(i7);
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final /* synthetic */ void a(fh0 fh0Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
