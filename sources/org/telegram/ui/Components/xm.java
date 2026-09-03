package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xm implements org.telegram.ui.pt {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;

    public xm(pn pnVar, int i10) {
        this.b = pnVar;
        this.a = i10;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ String G(boolean z4) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final p70 d(ah.e eVar) {
        p70 F = p70.F(eVar, null, new View(this.b.getContext()));
        F.s = 0;
        F.t = false;
        int i10 = R.drawable.msg_replace;
        String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
        final int i11 = 0;
        final int i12 = this.a;
        F.c(i10, string, new Runnable(this) { // from class: org.telegram.ui.Components.wm
            public final /* synthetic */ xm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.b.b0(i12);
                        break;
                    default:
                        this.b.b.e0(i12, null);
                        break;
                }
            }
        }, false);
        final int i13 = 1;
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: org.telegram.ui.Components.wm
            public final /* synthetic */ xm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.b.b0(i12);
                        break;
                    default:
                        this.b.b.e0(i12, null);
                        break;
                }
            }
        }, true);
        return F;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean f(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
