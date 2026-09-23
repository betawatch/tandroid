package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ i5(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e6 e6Var = this.b.l;
                e6.e0(e6Var, e6Var.B1);
                v5 v5Var = e6Var.t1;
                if (v5Var != null) {
                    v5Var.a();
                    break;
                }
                break;
            case 1:
                e6 e6Var2 = this.b.l;
                e6.d0(e6Var2);
                v5 v5Var2 = e6Var2.t1;
                if (v5Var2 != null) {
                    v5Var2.a();
                    break;
                }
                break;
            case 2:
                e6 e6Var3 = this.b.l;
                AndroidUtilities.addToClipboard(e6Var3.O1.e());
                e6.j0(e6Var3);
                v5 v5Var3 = e6Var3.t1;
                if (v5Var3 != null) {
                    v5Var3.a();
                    break;
                }
                break;
            case 3:
                e6 e6Var4 = this.b.l;
                e6Var4.Y0(false);
                v5 v5Var4 = e6Var4.t1;
                if (v5Var4 != null) {
                    v5Var4.a();
                    break;
                }
                break;
            case 4:
                e6 e6Var5 = this.b.l;
                c6 c6Var = e6Var5.O1;
                c6Var.a.translated = false;
                y9 y9Var = MessagesController.getInstance(e6Var5.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem = c6Var.a;
                y9Var.k(storyItem.dialogId, storyItem);
                e6Var5.p0();
                e6Var5.f1(false);
                v5 v5Var5 = e6Var5.t1;
                if (v5Var5 != null) {
                    v5Var5.a();
                    break;
                }
                break;
            case 5:
                v5 v5Var6 = this.b;
                e6 e6Var6 = v5Var6.l;
                c6 c6Var2 = e6Var6.O1;
                c6Var2.a.translated = true;
                e6Var6.p0();
                x5 x5Var = e6Var6.Q1;
                if (x5Var != null) {
                    jc jcVar = ((ac) x5Var).d;
                    jcVar.Z0 = true;
                    jcVar.P();
                }
                y9 y9Var2 = MessagesController.getInstance(e6Var6.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = c6Var2.a;
                y9Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(e6Var6.C2).getTranslateController().translateStory(c6Var2.a, new j(new m5(v5Var6, 1), System.currentTimeMillis(), 2));
                e6Var6.f1(false);
                e6Var6.h3 = true;
                e6Var6.K0.D(true);
                v5 v5Var7 = e6Var6.t1;
                if (v5Var7 != null) {
                    v5Var7.a();
                    break;
                }
                break;
            case 6:
                e6 e6Var7 = this.b.l;
                k9 k9Var = e6Var7.O1.b;
                if (k9Var != null) {
                    k9Var.a();
                    e6Var7.j1();
                }
                v5 v5Var8 = e6Var7.t1;
                if (v5Var8 != null) {
                    v5Var8.a();
                    break;
                }
                break;
            case 7:
                e6 e6Var8 = this.b.l;
                e6.d0(e6Var8);
                v5 v5Var9 = e6Var8.t1;
                if (v5Var9 != null) {
                    v5Var9.a();
                    break;
                }
                break;
            case 8:
                e6 e6Var9 = this.b.l;
                AndroidUtilities.addToClipboard(e6Var9.O1.e());
                e6.j0(e6Var9);
                v5 v5Var10 = e6Var9.t1;
                if (v5Var10 != null) {
                    v5Var10.a();
                    break;
                }
                break;
            case 9:
                e6 e6Var10 = this.b.l;
                e6Var10.Y0(false);
                v5 v5Var11 = e6Var10.t1;
                if (v5Var11 != null) {
                    v5Var11.a();
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
                v5 v5Var12 = this.b.l.t1;
                if (v5Var12 != null) {
                    v5Var12.a();
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
                e6 e6Var11 = this.b.l;
                e6.f0(e6Var11);
                v5 v5Var13 = e6Var11.t1;
                if (v5Var13 != null) {
                    v5Var13.a();
                    break;
                }
                break;
            case 14:
                e6 e6Var12 = this.b.l;
                MediaDataController.getInstance(e6Var12.C2).removePeer(e6Var12.B1);
                e6Var12.S1.i0(e6Var12.B1, true, false);
                v5 v5Var14 = e6Var12.t1;
                if (v5Var14 != null) {
                    v5Var14.a();
                    break;
                }
                break;
            default:
                e6 e6Var13 = this.b.l;
                e6.e0(e6Var13, e6Var13.B1);
                v5 v5Var15 = e6Var13.t1;
                if (v5Var15 != null) {
                    v5Var15.a();
                    break;
                }
                break;
        }
    }
}
