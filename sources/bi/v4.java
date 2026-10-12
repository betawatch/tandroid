package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ v4(h5 h5Var, int i10) {
        this.a = i10;
        this.b = h5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                q5 q5Var = this.b.l;
                q5.e0(q5Var, q5Var.B1);
                h5 h5Var = q5Var.t1;
                if (h5Var != null) {
                    h5Var.a();
                    break;
                }
                break;
            case 1:
                q5 q5Var2 = this.b.l;
                q5.d0(q5Var2);
                h5 h5Var2 = q5Var2.t1;
                if (h5Var2 != null) {
                    h5Var2.a();
                    break;
                }
                break;
            case 2:
                q5 q5Var3 = this.b.l;
                AndroidUtilities.addToClipboard(q5Var3.O1.e());
                q5.j0(q5Var3);
                h5 h5Var3 = q5Var3.t1;
                if (h5Var3 != null) {
                    h5Var3.a();
                    break;
                }
                break;
            case 3:
                q5 q5Var4 = this.b.l;
                q5Var4.Y0(false);
                h5 h5Var4 = q5Var4.t1;
                if (h5Var4 != null) {
                    h5Var4.a();
                    break;
                }
                break;
            case 4:
                q5 q5Var5 = this.b.l;
                o5 o5Var = q5Var5.O1;
                o5Var.a.translated = false;
                k9 k9Var = MessagesController.getInstance(q5Var5.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem = o5Var.a;
                k9Var.k(storyItem.dialogId, storyItem);
                q5Var5.p0();
                q5Var5.f1(false);
                h5 h5Var5 = q5Var5.t1;
                if (h5Var5 != null) {
                    h5Var5.a();
                    break;
                }
                break;
            case 5:
                h5 h5Var6 = this.b;
                q5 q5Var6 = h5Var6.l;
                o5 o5Var2 = q5Var6.O1;
                o5Var2.a.translated = true;
                q5Var6.p0();
                j5 j5Var = q5Var6.Q1;
                if (j5Var != null) {
                    sb sbVar = ((jb) j5Var).d;
                    sbVar.Z0 = true;
                    sbVar.P();
                }
                k9 k9Var2 = MessagesController.getInstance(q5Var6.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = o5Var2.a;
                k9Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(q5Var6.C2).getTranslateController().translateStory(o5Var2.a, new g(new z4(h5Var6, 1), System.currentTimeMillis(), 2));
                q5Var6.f1(false);
                q5Var6.h3 = true;
                q5Var6.K0.D(true);
                h5 h5Var7 = q5Var6.t1;
                if (h5Var7 != null) {
                    h5Var7.a();
                    break;
                }
                break;
            case 6:
                q5 q5Var7 = this.b.l;
                w8 w8Var = q5Var7.O1.b;
                if (w8Var != null) {
                    w8Var.a();
                    q5Var7.j1();
                }
                h5 h5Var8 = q5Var7.t1;
                if (h5Var8 != null) {
                    h5Var8.a();
                    break;
                }
                break;
            case 7:
                q5 q5Var8 = this.b.l;
                q5.d0(q5Var8);
                h5 h5Var9 = q5Var8.t1;
                if (h5Var9 != null) {
                    h5Var9.a();
                    break;
                }
                break;
            case 8:
                q5 q5Var9 = this.b.l;
                AndroidUtilities.addToClipboard(q5Var9.O1.e());
                q5.j0(q5Var9);
                h5 h5Var10 = q5Var9.t1;
                if (h5Var10 != null) {
                    h5Var10.a();
                    break;
                }
                break;
            case 9:
                q5 q5Var10 = this.b.l;
                q5Var10.Y0(false);
                h5 h5Var11 = q5Var10.t1;
                if (h5Var11 != null) {
                    h5Var11.a();
                    break;
                }
                break;
            case 10:
                t1 t1Var = t1.W;
                if (t1Var != null && t1Var.n) {
                    long j10 = t1Var.J;
                    boolean z10 = !t1Var.I;
                    t1Var.I = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                h5 h5Var12 = this.b.l.t1;
                if (h5Var12 != null) {
                    h5Var12.a();
                    break;
                }
                break;
            case 11:
                this.b.l.D3.b();
                break;
            case 12:
                this.b.l.E3.b();
                break;
            case 13:
                q5 q5Var11 = this.b.l;
                q5.f0(q5Var11);
                h5 h5Var13 = q5Var11.t1;
                if (h5Var13 != null) {
                    h5Var13.a();
                    break;
                }
                break;
            case 14:
                q5 q5Var12 = this.b.l;
                MediaDataController.getInstance(q5Var12.C2).removePeer(q5Var12.B1);
                q5Var12.S1.i0(q5Var12.B1, true, false);
                h5 h5Var14 = q5Var12.t1;
                if (h5Var14 != null) {
                    h5Var14.a();
                    break;
                }
                break;
            default:
                q5 q5Var13 = this.b.l;
                q5.e0(q5Var13, q5Var13.B1);
                h5 h5Var15 = q5Var13.t1;
                if (h5Var15 != null) {
                    h5Var15.a();
                    break;
                }
                break;
        }
    }
}
