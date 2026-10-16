package org.telegram.ui;

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public interface dv0 {
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
