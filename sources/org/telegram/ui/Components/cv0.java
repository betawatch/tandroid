package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cv0 extends k9 implements org.telegram.messenger.ls {
    public final int G;
    public int H;
    public String I;

    public cv0(Context context, int i7) {
        super(context);
        this.I = "tg_placeholders_android";
        this.G = i7;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.y0) {
            if (this.I.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.qs.f(this.G).c(this, org.telegram.messenger.qs.y0);
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.G).n(this, org.telegram.messenger.qs.y0);
    }

    public void setStickerNum(int i7) {
        if (this.H != i7) {
            this.H = i7;
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
        org.telegram.messenger.rz d;
        int i7 = this.G;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i7).p0(this.I);
        if (p02 == null) {
            p02 = org.telegram.messenger.ui.b0(i7).n0(this.I);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i10 = this.H;
            if (size > i10) {
                document = tL_messages_stickerSet.documents.get(i10);
                d = document != null ? org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.m6.c7, 0.2f, false) : null;
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                if (document == null) {
                    k(org.telegram.messenger.hc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.f();
                    org.telegram.messenger.ui.b0(i7).c1(this.I, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        d = document != null ? org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.m6.c7, 0.2f, false) : null;
        if (d != null) {
        }
        if (document == null) {
        }
    }
}
