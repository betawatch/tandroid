// default package

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public interface bd8 {
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
