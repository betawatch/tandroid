// default package

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public interface mb8 {
    boolean a(int i);

    File b(int i);

    String c(int i);

    TLObject d(int i);

    boolean e(int i);

    TLRPC.PhotoSize f(TLObject tLObject, int[] iArr);

    Object g();

    TL_iv.PageBlock get(int i);

    List getAll();

    void h(TL_iv.PageBlock pageBlock);

    CharSequence i(int i);

    int j();
}
