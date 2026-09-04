package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;

    public /* synthetic */ t4(f5 f5Var, int i10) {
        this.a = i10;
        this.b = f5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b.l;
                o5.e0(o5Var, o5Var.B1);
                f5 f5Var = o5Var.t1;
                if (f5Var != null) {
                    f5Var.a();
                    break;
                }
                break;
            case 1:
                o5 o5Var2 = this.b.l;
                o5.d0(o5Var2);
                f5 f5Var2 = o5Var2.t1;
                if (f5Var2 != null) {
                    f5Var2.a();
                    break;
                }
                break;
            case 2:
                o5 o5Var3 = this.b.l;
                AndroidUtilities.addToClipboard(o5Var3.O1.e());
                o5.j0(o5Var3);
                f5 f5Var3 = o5Var3.t1;
                if (f5Var3 != null) {
                    f5Var3.a();
                    break;
                }
                break;
            case 3:
                o5 o5Var4 = this.b.l;
                o5Var4.Y0(false);
                f5 f5Var4 = o5Var4.t1;
                if (f5Var4 != null) {
                    f5Var4.a();
                    break;
                }
                break;
            case 4:
                o5 o5Var5 = this.b.l;
                m5 m5Var = o5Var5.O1;
                m5Var.a.translated = false;
                h9 h9Var = MessagesController.getInstance(o5Var5.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem = m5Var.a;
                h9Var.k(storyItem.dialogId, storyItem);
                o5Var5.p0();
                o5Var5.f1(false);
                f5 f5Var5 = o5Var5.t1;
                if (f5Var5 != null) {
                    f5Var5.a();
                    break;
                }
                break;
            case 5:
                f5 f5Var6 = this.b;
                o5 o5Var6 = f5Var6.l;
                m5 m5Var2 = o5Var6.O1;
                m5Var2.a.translated = true;
                o5Var6.p0();
                h5 h5Var = o5Var6.Q1;
                if (h5Var != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Z0 = true;
                    pbVar.P();
                }
                h9 h9Var2 = MessagesController.getInstance(o5Var6.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = m5Var2.a;
                h9Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(o5Var6.C2).getTranslateController().translateStory(m5Var2.a, new g(new x4(f5Var6, 1), System.currentTimeMillis(), 2));
                o5Var6.f1(false);
                o5Var6.h3 = true;
                o5Var6.K0.D(true);
                f5 f5Var7 = o5Var6.t1;
                if (f5Var7 != null) {
                    f5Var7.a();
                    break;
                }
                break;
            case 6:
                o5 o5Var7 = this.b.l;
                t8 t8Var = o5Var7.O1.b;
                if (t8Var != null) {
                    t8Var.a();
                    o5Var7.j1();
                }
                f5 f5Var8 = o5Var7.t1;
                if (f5Var8 != null) {
                    f5Var8.a();
                    break;
                }
                break;
            case 7:
                o5 o5Var8 = this.b.l;
                o5.d0(o5Var8);
                f5 f5Var9 = o5Var8.t1;
                if (f5Var9 != null) {
                    f5Var9.a();
                    break;
                }
                break;
            case 8:
                o5 o5Var9 = this.b.l;
                AndroidUtilities.addToClipboard(o5Var9.O1.e());
                o5.j0(o5Var9);
                f5 f5Var10 = o5Var9.t1;
                if (f5Var10 != null) {
                    f5Var10.a();
                    break;
                }
                break;
            case 9:
                o5 o5Var10 = this.b.l;
                o5Var10.Y0(false);
                f5 f5Var11 = o5Var10.t1;
                if (f5Var11 != null) {
                    f5Var11.a();
                    break;
                }
                break;
            case 10:
                t1 t1Var = t1.W;
                if (t1Var != null && t1Var.n) {
                    long j3 = t1Var.J;
                    boolean z10 = !t1Var.I;
                    t1Var.I = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                f5 f5Var12 = this.b.l.t1;
                if (f5Var12 != null) {
                    f5Var12.a();
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
                o5 o5Var11 = this.b.l;
                o5.f0(o5Var11);
                f5 f5Var13 = o5Var11.t1;
                if (f5Var13 != null) {
                    f5Var13.a();
                    break;
                }
                break;
            case 14:
                o5 o5Var12 = this.b.l;
                MediaDataController.getInstance(o5Var12.C2).removePeer(o5Var12.B1);
                o5Var12.S1.i0(o5Var12.B1, true, false);
                f5 f5Var14 = o5Var12.t1;
                if (f5Var14 != null) {
                    f5Var14.a();
                    break;
                }
                break;
            default:
                o5 o5Var13 = this.b.l;
                o5.e0(o5Var13, o5Var13.B1);
                f5 f5Var15 = o5Var13.t1;
                if (f5Var15 != null) {
                    f5Var15.a();
                    break;
                }
                break;
        }
    }
}
