package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.qp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class f {
    public static final f[] f = new f[4];
    public final int a;
    public TLRPC.TL_shareThemeBackdrops b;
    public boolean c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public f(int i7) {
        this.a = i7;
        String string = qp.s1(i7).e7.getString("qrBackdrops", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                this.b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
            }
            serializedData.cleanup();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
