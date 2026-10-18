package org.telegram.ui;

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public interface fu0 {
    boolean a(int i10);

    File b(int i10);

    String c(int i10);

    TLObject d(int i10);

    boolean e(int i10);

    TLRPC.PhotoSize f(TLObject tLObject, int[] iArr);

    Object g();

    TL_iv.PageBlock get(int i10);

    List getAll();

    void h(TL_iv.PageBlock pageBlock);

    CharSequence i(int i10);

    int j();
}
