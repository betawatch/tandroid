// default package

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b4b implements ncc, occ {
    public final /* synthetic */ StickersActivity a;

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        StickersActivity stickersActivity = this.a;
        boolean z = false;
        if (stickersActivity.x.isEmpty() && (b8cVar.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.q0((q3b) view);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.k0((b8c) obj, (View) obj2);
    }
}
