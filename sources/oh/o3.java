package oh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ o3(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f4 f4Var = this.b.l;
                f4.e0(f4Var, f4Var.y1);
                y3 y3Var = f4Var.q1;
                if (y3Var != null) {
                    y3Var.a();
                    break;
                }
                break;
            case 1:
                f4 f4Var2 = this.b.l;
                f4.d0(f4Var2);
                y3 y3Var2 = f4Var2.q1;
                if (y3Var2 != null) {
                    y3Var2.a();
                    break;
                }
                break;
            case 2:
                f4 f4Var3 = this.b.l;
                AndroidUtilities.addToClipboard(f4Var3.L1.e());
                f4.j0(f4Var3);
                y3 y3Var3 = f4Var3.q1;
                if (y3Var3 != null) {
                    y3Var3.a();
                    break;
                }
                break;
            case 3:
                f4 f4Var4 = this.b.l;
                f4Var4.Y0(false);
                y3 y3Var4 = f4Var4.q1;
                if (y3Var4 != null) {
                    y3Var4.a();
                    break;
                }
                break;
            case 4:
                f4 f4Var5 = this.b.l;
                d4 d4Var = f4Var5.L1;
                d4Var.a.translated = false;
                g7 g7Var = MessagesController.getInstance(f4Var5.z2).getStoriesController().k;
                TL_stories.StoryItem storyItem = d4Var.a;
                g7Var.k(storyItem.dialogId, storyItem);
                f4Var5.p0();
                f4Var5.f1(false);
                y3 y3Var5 = f4Var5.q1;
                if (y3Var5 != null) {
                    y3Var5.a();
                    break;
                }
                break;
            case 5:
                y3 y3Var6 = this.b;
                f4 f4Var6 = y3Var6.l;
                d4 d4Var2 = f4Var6.L1;
                d4Var2.a.translated = true;
                f4Var6.p0();
                z3 z3Var = f4Var6.N1;
                if (z3Var != null) {
                    i9 i9Var = ((z8) z3Var).d;
                    i9Var.W0 = true;
                    i9Var.P();
                }
                g7 g7Var2 = MessagesController.getInstance(f4Var6.z2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = d4Var2.a;
                g7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(f4Var6.z2).getTranslateController().translateStory(d4Var2.a, new hg.y1(new r3(y3Var6, 1), System.currentTimeMillis(), 6));
                f4Var6.f1(false);
                f4Var6.e3 = true;
                f4Var6.H0.D(true);
                y3 y3Var7 = f4Var6.q1;
                if (y3Var7 != null) {
                    y3Var7.a();
                    break;
                }
                break;
            case 6:
                f4 f4Var7 = this.b.l;
                s6 s6Var = f4Var7.L1.b;
                if (s6Var != null) {
                    s6Var.a();
                    f4Var7.j1();
                }
                y3 y3Var8 = f4Var7.q1;
                if (y3Var8 != null) {
                    y3Var8.a();
                    break;
                }
                break;
            case 7:
                f4 f4Var8 = this.b.l;
                f4.d0(f4Var8);
                y3 y3Var9 = f4Var8.q1;
                if (y3Var9 != null) {
                    y3Var9.a();
                    break;
                }
                break;
            case 8:
                f4 f4Var9 = this.b.l;
                AndroidUtilities.addToClipboard(f4Var9.L1.e());
                f4.j0(f4Var9);
                y3 y3Var10 = f4Var9.q1;
                if (y3Var10 != null) {
                    y3Var10.a();
                    break;
                }
                break;
            case 9:
                f4 f4Var10 = this.b.l;
                f4Var10.Y0(false);
                y3 y3Var11 = f4Var10.q1;
                if (y3Var11 != null) {
                    y3Var11.a();
                    break;
                }
                break;
            case 10:
                e1 e1Var = e1.T;
                if (e1Var != null && e1Var.n) {
                    long j10 = e1Var.G;
                    boolean z4 = !e1Var.F;
                    e1Var.F = z4;
                    NativeInstance.switchCameraCapturer(j10, z4);
                }
                y3 y3Var12 = this.b.l.q1;
                if (y3Var12 != null) {
                    y3Var12.a();
                    break;
                }
                break;
            case 11:
                this.b.l.A3.b();
                break;
            case 12:
                this.b.l.B3.b();
                break;
            case 13:
                f4 f4Var11 = this.b.l;
                f4.f0(f4Var11);
                y3 y3Var13 = f4Var11.q1;
                if (y3Var13 != null) {
                    y3Var13.a();
                    break;
                }
                break;
            case 14:
                f4 f4Var12 = this.b.l;
                MediaDataController.getInstance(f4Var12.z2).removePeer(f4Var12.y1);
                f4Var12.P1.i0(f4Var12.y1, true, false);
                y3 y3Var14 = f4Var12.q1;
                if (y3Var14 != null) {
                    y3Var14.a();
                    break;
                }
                break;
            default:
                f4 f4Var13 = this.b.l;
                f4.e0(f4Var13, f4Var13.y1);
                y3 y3Var15 = f4Var13.q1;
                if (y3Var15 != null) {
                    y3Var15.a();
                    break;
                }
                break;
        }
    }
}
