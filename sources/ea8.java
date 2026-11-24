// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ea8 extends tca {
    public final /* synthetic */ FrameLayout U2;
    public final /* synthetic */ boolean V2;
    public final /* synthetic */ PhotoViewer W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea8(PhotoViewer photoViewer, Context context, yv1 yv1Var, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z) {
        super(context, yv1Var, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.W2 = photoViewer;
        this.U2 = frameLayout;
        this.V2 = z;
    }

    @Override // tca, my0
    public final void H() {
        super.H();
        if (this.V2) {
            gm.d3(new q78(this, (byte) 4), 50L);
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.W2;
        photoViewer.e0.softInputMode = nm7.u4;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.h0, photoViewer.e0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gm.d3(new v36((Object) this, (Object) this.U2, (Object) vh6Var, i, (byte) 19), 250L);
        }
    }
}
