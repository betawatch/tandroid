package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ j5(w5 w5Var, int i10) {
        this.a = i10;
        this.b = w5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b.l;
                f6.e0(f6Var, f6Var.B1);
                w5 w5Var = f6Var.t1;
                if (w5Var != null) {
                    w5Var.a();
                    break;
                }
                break;
            case 1:
                f6 f6Var2 = this.b.l;
                f6.d0(f6Var2);
                w5 w5Var2 = f6Var2.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    break;
                }
                break;
            case 2:
                f6 f6Var3 = this.b.l;
                AndroidUtilities.addToClipboard(f6Var3.O1.e());
                f6.j0(f6Var3);
                w5 w5Var3 = f6Var3.t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    break;
                }
                break;
            case 3:
                f6 f6Var4 = this.b.l;
                f6Var4.Y0(false);
                w5 w5Var4 = f6Var4.t1;
                if (w5Var4 != null) {
                    w5Var4.a();
                    break;
                }
                break;
            case 4:
                f6 f6Var5 = this.b.l;
                d6 d6Var = f6Var5.O1;
                d6Var.a.translated = false;
                y9 y9Var = MessagesController.getInstance(f6Var5.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem = d6Var.a;
                y9Var.k(storyItem.dialogId, storyItem);
                f6Var5.p0();
                f6Var5.f1(false);
                w5 w5Var5 = f6Var5.t1;
                if (w5Var5 != null) {
                    w5Var5.a();
                    break;
                }
                break;
            case 5:
                w5 w5Var6 = this.b;
                f6 f6Var6 = w5Var6.l;
                d6 d6Var2 = f6Var6.O1;
                d6Var2.a.translated = true;
                f6Var6.p0();
                y5 y5Var = f6Var6.Q1;
                if (y5Var != null) {
                    jc jcVar = ((ac) y5Var).d;
                    jcVar.Z0 = true;
                    jcVar.P();
                }
                y9 y9Var2 = MessagesController.getInstance(f6Var6.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = d6Var2.a;
                y9Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(f6Var6.C2).getTranslateController().translateStory(d6Var2.a, new j(new n5(w5Var6, 1), System.currentTimeMillis(), 2));
                f6Var6.f1(false);
                f6Var6.h3 = true;
                f6Var6.K0.D(true);
                w5 w5Var7 = f6Var6.t1;
                if (w5Var7 != null) {
                    w5Var7.a();
                    break;
                }
                break;
            case 6:
                f6 f6Var7 = this.b.l;
                k9 k9Var = f6Var7.O1.b;
                if (k9Var != null) {
                    k9Var.a();
                    f6Var7.j1();
                }
                w5 w5Var8 = f6Var7.t1;
                if (w5Var8 != null) {
                    w5Var8.a();
                    break;
                }
                break;
            case 7:
                f6 f6Var8 = this.b.l;
                f6.d0(f6Var8);
                w5 w5Var9 = f6Var8.t1;
                if (w5Var9 != null) {
                    w5Var9.a();
                    break;
                }
                break;
            case 8:
                f6 f6Var9 = this.b.l;
                AndroidUtilities.addToClipboard(f6Var9.O1.e());
                f6.j0(f6Var9);
                w5 w5Var10 = f6Var9.t1;
                if (w5Var10 != null) {
                    w5Var10.a();
                    break;
                }
                break;
            case 9:
                f6 f6Var10 = this.b.l;
                f6Var10.Y0(false);
                w5 w5Var11 = f6Var10.t1;
                if (w5Var11 != null) {
                    w5Var11.a();
                    break;
                }
                break;
            case 10:
                d2 d2Var = d2.W;
                if (d2Var != null && d2Var.n) {
                    long j3 = d2Var.J;
                    boolean z10 = !d2Var.I;
                    d2Var.I = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                w5 w5Var12 = this.b.l.t1;
                if (w5Var12 != null) {
                    w5Var12.a();
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
                f6 f6Var11 = this.b.l;
                f6.f0(f6Var11);
                w5 w5Var13 = f6Var11.t1;
                if (w5Var13 != null) {
                    w5Var13.a();
                    break;
                }
                break;
            case 14:
                f6 f6Var12 = this.b.l;
                MediaDataController.getInstance(f6Var12.C2).removePeer(f6Var12.B1);
                f6Var12.S1.i0(f6Var12.B1, true, false);
                w5 w5Var14 = f6Var12.t1;
                if (w5Var14 != null) {
                    w5Var14.a();
                    break;
                }
                break;
            default:
                f6 f6Var13 = this.b.l;
                f6.e0(f6Var13, f6Var13.B1);
                w5 w5Var15 = f6Var13.t1;
                if (w5Var15 != null) {
                    w5Var15.a();
                    break;
                }
                break;
        }
    }
}
