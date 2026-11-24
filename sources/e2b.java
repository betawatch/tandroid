// default package

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e2b implements oac, pac {
    public final /* synthetic */ StickersActivity a;

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        StickersActivity stickersActivity = this.a;
        boolean z = false;
        if (stickersActivity.x.isEmpty() && (c6cVar.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.r0((s1b) view);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.l0((c6c) obj, (View) obj2);
    }
}
