// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c88 extends taa {
    public final /* synthetic */ FrameLayout U2;
    public final /* synthetic */ boolean V2;
    public final /* synthetic */ PhotoViewer W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c88(PhotoViewer photoViewer, Context context, mu1 mu1Var, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z) {
        super(context, mu1Var, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.W2 = photoViewer;
        this.U2 = frameLayout;
        this.V2 = z;
    }

    @Override // taa, fx0
    public final void I() {
        super.I();
        if (this.V2) {
            gl.e3(new oq7(this, (byte) 27), 50L);
        }
        Drawable[] drawableArr = PhotoViewer.f9;
        PhotoViewer photoViewer = this.W2;
        photoViewer.e0.softInputMode = kk7.u4;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.h0, photoViewer.e0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gl.e3(new q76((Object) this, (Object) this.U2, (Object) vf6Var, i, (byte) 18), 250L);
        }
    }
}
