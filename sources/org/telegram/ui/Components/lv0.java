package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lv0 extends q9 implements org.telegram.messenger.fs {
    public final int H;
    public int I;
    public String J;

    public lv0(Context context, int i7) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i7;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.y0) {
            if (this.J.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.ks.f(this.H).c(this, org.telegram.messenger.ks.y0);
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.H).n(this, org.telegram.messenger.ks.y0);
    }

    public void setStickerNum(int i7) {
        if (this.I != i7) {
            this.I = i7;
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
        org.telegram.messenger.lz d;
        int i7 = this.H;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i7).r0(this.J);
        if (r02 == null) {
            r02 = org.telegram.messenger.ri.d0(i7).p0(this.J);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i10 = this.I;
            if (size > i10) {
                document = tL_messages_stickerSet.documents.get(i10);
                d = document != null ? org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.c7, 0.2f, false) : null;
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                if (document == null) {
                    k(org.telegram.messenger.fc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.f();
                    org.telegram.messenger.ri.d0(i7).f1(this.J, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        d = document != null ? org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.c7, 0.2f, false) : null;
        if (d != null) {
        }
        if (document == null) {
        }
    }
}
