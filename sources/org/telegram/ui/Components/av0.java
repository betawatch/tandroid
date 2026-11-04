package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class av0 extends k9 implements org.telegram.messenger.cs {
    public final int H;
    public int I;
    public String J;

    public av0(Context context, int i3) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i3;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.y0) {
            if (this.J.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.hs.f(this.H).c(this, org.telegram.messenger.hs.y0);
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.H).n(this, org.telegram.messenger.hs.y0);
    }

    public void setStickerNum(int i3) {
        if (this.I != i3) {
            this.I = i3;
            v();
        }
    }

    public void setStickerPackName(String str) {
        this.J = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        TLRPC.Document document;
        org.telegram.messenger.jz d;
        int i3 = this.H;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(i3).p0(this.J);
        if (p02 == null) {
            p02 = org.telegram.messenger.li.b0(i3).n0(this.J);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i10 = this.I;
            if (size > i10) {
                document = tL_messages_stickerSet.documents.get(i10);
                d = document != null ? org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.c7, 0.2f, false) : null;
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                if (document == null) {
                    k(org.telegram.messenger.ac.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.f();
                    org.telegram.messenger.li.b0(i3).c1(this.J, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        d = document != null ? org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.c7, 0.2f, false) : null;
        if (d != null) {
        }
        if (document == null) {
        }
    }
}
