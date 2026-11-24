// default package

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class d0b implements n8c, o8c {
    public final /* synthetic */ StickersActivity a;

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        StickersActivity stickersActivity = this.a;
        boolean z = false;
        if (stickersActivity.x.isEmpty() && (c4cVar.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.q0((rza) view);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.k0((c4c) obj, (View) obj2);
    }
}
