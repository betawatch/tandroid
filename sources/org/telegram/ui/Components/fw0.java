package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fw0 extends g9 implements org.telegram.messenger.vs {
    public final int G;
    public int H;
    public String I;

    public fw0(Context context, int i10) {
        super(context);
        this.I = "tg_placeholders_android";
        this.G = i10;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.y0) {
            if (this.I.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.at.f(this.G).c(this, org.telegram.messenger.at.y0);
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.G).n(this, org.telegram.messenger.at.y0);
    }

    public void setStickerNum(int i10) {
        if (this.H != i10) {
            this.H = i10;
            v();
        }
    }

    public void setStickerPackName(String str) {
        this.I = str;
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
        org.telegram.messenger.d00 d;
        int i10 = this.G;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.vi.b0(i10).p0(this.I);
        if (p02 == null) {
            p02 = org.telegram.messenger.vi.b0(i10).n0(this.I);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i11 = this.H;
            if (size > i11) {
                document = tL_messages_stickerSet.documents.get(i11);
                d = document != null ? org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.c7, 0.2f, false) : null;
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                if (document == null) {
                    k(org.telegram.messenger.jc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.f();
                    org.telegram.messenger.vi.b0(i10).c1(this.I, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        d = document != null ? org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.c7, 0.2f, false) : null;
        if (d != null) {
        }
        if (document == null) {
        }
    }
}
