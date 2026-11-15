package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dv0 extends i9 implements org.telegram.messenger.is {
    public final int H;
    public int I;
    public String J;

    public dv0(Context context, int i7) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i7;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.y0) {
            if (this.J.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.ns.f(this.H).c(this, org.telegram.messenger.ns.y0);
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.H).n(this, org.telegram.messenger.ns.y0);
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
        org.telegram.messenger.pz d;
        int i7 = this.H;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(i7).p0(this.J);
        if (p02 == null) {
            p02 = org.telegram.messenger.si.b0(i7).n0(this.J);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i10 = this.I;
            if (size > i10) {
                document = tL_messages_stickerSet.documents.get(i10);
                d = document != null ? org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.c7, 0.2f, false) : null;
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                if (document == null) {
                    k(org.telegram.messenger.gc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.f();
                    org.telegram.messenger.si.b0(i7).c1(this.J, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        d = document != null ? org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.c7, 0.2f, false) : null;
        if (d != null) {
        }
        if (document == null) {
        }
    }
}
