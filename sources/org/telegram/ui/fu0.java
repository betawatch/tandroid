package org.telegram.ui;

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
