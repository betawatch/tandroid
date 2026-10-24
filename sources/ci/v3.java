package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ v3(g4 g4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                p4 p4Var = this.b.l;
                p4.d0(p4Var, p4Var.B1);
                g4 g4Var = p4Var.t1;
                if (g4Var != null) {
                    g4Var.a();
                    break;
                }
                break;
            case 1:
                p4 p4Var2 = this.b.l;
                p4.c0(p4Var2);
                g4 g4Var2 = p4Var2.t1;
                if (g4Var2 != null) {
                    g4Var2.a();
                    break;
                }
                break;
            case 2:
                p4 p4Var3 = this.b.l;
                AndroidUtilities.addToClipboard(p4Var3.O1.e());
                p4.i0(p4Var3);
                g4 g4Var3 = p4Var3.t1;
                if (g4Var3 != null) {
                    g4Var3.a();
                    break;
                }
                break;
            case 3:
                p4 p4Var4 = this.b.l;
                p4Var4.X0(false);
                g4 g4Var4 = p4Var4.t1;
                if (g4Var4 != null) {
                    g4Var4.a();
                    break;
                }
                break;
            case 4:
                p4 p4Var5 = this.b.l;
                n4 n4Var = p4Var5.O1;
                n4Var.a.translated = false;
                v7 v7Var = MessagesController.getInstance(p4Var5.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem = n4Var.a;
                v7Var.k(storyItem.dialogId, storyItem);
                p4Var5.o0();
                p4Var5.e1(false);
                g4 g4Var5 = p4Var5.t1;
                if (g4Var5 != null) {
                    g4Var5.a();
                    break;
                }
                break;
            case 5:
                g4 g4Var6 = this.b;
                p4 p4Var6 = g4Var6.l;
                n4 n4Var2 = p4Var6.O1;
                n4Var2.a.translated = true;
                p4Var6.o0();
                i4 i4Var = p4Var6.Q1;
                if (i4Var != null) {
                    z9 z9Var = ((q9) i4Var).d;
                    z9Var.Z0 = true;
                    z9Var.P();
                }
                v7 v7Var2 = MessagesController.getInstance(p4Var6.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = n4Var2.a;
                v7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(p4Var6.C2).getTranslateController().translateStory(n4Var2.a, new ai.v3(new z3(g4Var6, 1), System.currentTimeMillis(), 4));
                p4Var6.e1(false);
                p4Var6.h3 = true;
                p4Var6.K0.E(true);
                g4 g4Var7 = p4Var6.t1;
                if (g4Var7 != null) {
                    g4Var7.a();
                    break;
                }
                break;
            case 6:
                p4 p4Var7 = this.b.l;
                g7 g7Var = p4Var7.O1.b;
                if (g7Var != null) {
                    g7Var.a();
                    p4Var7.i1();
                }
                g4 g4Var8 = p4Var7.t1;
                if (g4Var8 != null) {
                    g4Var8.a();
                    break;
                }
                break;
            case 7:
                p4 p4Var8 = this.b.l;
                p4.c0(p4Var8);
                g4 g4Var9 = p4Var8.t1;
                if (g4Var9 != null) {
                    g4Var9.a();
                    break;
                }
                break;
            case 8:
                p4 p4Var9 = this.b.l;
                AndroidUtilities.addToClipboard(p4Var9.O1.e());
                p4.i0(p4Var9);
                g4 g4Var10 = p4Var9.t1;
                if (g4Var10 != null) {
                    g4Var10.a();
                    break;
                }
                break;
            case 9:
                p4 p4Var10 = this.b.l;
                p4Var10.X0(false);
                g4 g4Var11 = p4Var10.t1;
                if (g4Var11 != null) {
                    g4Var11.a();
                    break;
                }
                break;
            case 10:
                h1 h1Var = h1.W;
                if (h1Var != null && h1Var.n) {
                    long j10 = h1Var.J;
                    boolean z10 = !h1Var.I;
                    h1Var.I = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                g4 g4Var12 = this.b.l.t1;
                if (g4Var12 != null) {
                    g4Var12.a();
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
                p4 p4Var11 = this.b.l;
                p4.e0(p4Var11);
                g4 g4Var13 = p4Var11.t1;
                if (g4Var13 != null) {
                    g4Var13.a();
                    break;
                }
                break;
            case 14:
                p4 p4Var12 = this.b.l;
                MediaDataController.getInstance(p4Var12.C2).removePeer(p4Var12.B1);
                p4Var12.S1.i0(p4Var12.B1, true, false);
                g4 g4Var14 = p4Var12.t1;
                if (g4Var14 != null) {
                    g4Var14.a();
                    break;
                }
                break;
            default:
                p4 p4Var13 = this.b.l;
                p4.d0(p4Var13, p4Var13.B1);
                g4 g4Var15 = p4Var13.t1;
                if (g4Var15 != null) {
                    g4Var15.a();
                    break;
                }
                break;
        }
    }
}
