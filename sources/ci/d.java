package ci;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.mp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d {
    public static final d[] f = new d[4];
    public final int a;
    public TLRPC.TL_shareThemeBackdrops b;
    public boolean c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public d(int i7) {
        this.a = i7;
        String string = mp.u1(i7).h7.getString("qrBackdrops", null);
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
