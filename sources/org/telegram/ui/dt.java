package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public interface dt {
    boolean A();

    void B(TLRPC.Document document);

    boolean C();

    boolean D(TLRPC.Document document);

    void E(TLRPC.Document document);

    String F(boolean z10);

    void G(TLRPC.Document document);

    boolean H();

    boolean I();

    void J();

    void K();

    void L(TLRPC.InputStickerSet inputStickerSet, boolean z10);

    boolean M(TLRPC.Document document);

    void N(String str);

    void O(CharSequence charSequence, String str, org.telegram.ui.Components.oy oyVar);

    Boolean P(TLRPC.Document document);

    boolean Q();

    long a();

    boolean b();

    boolean c();

    TLRPC.TL_messageMediaPoll d();

    boolean e(TLRPC.Document document);

    boolean f();

    TLRPC.PollAnswer g();

    boolean h();

    org.telegram.ui.Components.k80 i(bh.p pVar);

    void j(SendMessagesHelper.ImportingSticker importingSticker);

    boolean k();

    boolean l(int i10);

    void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11);

    void n(String str);

    void o(TLRPC.Document document);

    boolean p();

    void q(TLRPC.Document document);

    void r();

    void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10);

    void t();

    void u(TLRPC.Document document);

    void v(TLRPC.StickerSet stickerSet, String str);

    void w(TLObject tLObject, Object obj);

    boolean x();

    void y(String str);

    MessageObject z();
}
