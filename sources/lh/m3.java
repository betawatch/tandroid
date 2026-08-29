package lh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ m3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b.l;
                d4.e0(d4Var, d4Var.x1);
                w3 w3Var = d4Var.p1;
                if (w3Var != null) {
                    w3Var.a();
                    break;
                }
                break;
            case 1:
                d4 d4Var2 = this.b.l;
                d4.d0(d4Var2);
                w3 w3Var2 = d4Var2.p1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 2:
                d4 d4Var3 = this.b.l;
                AndroidUtilities.addToClipboard(d4Var3.K1.e());
                d4.j0(d4Var3);
                w3 w3Var3 = d4Var3.p1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    break;
                }
                break;
            case 3:
                d4 d4Var4 = this.b.l;
                d4Var4.Y0(false);
                w3 w3Var4 = d4Var4.p1;
                if (w3Var4 != null) {
                    w3Var4.a();
                    break;
                }
                break;
            case 4:
                d4 d4Var5 = this.b.l;
                b4 b4Var = d4Var5.K1;
                b4Var.a.translated = false;
                f7 f7Var = MessagesController.getInstance(d4Var5.y2).getStoriesController().k;
                TL_stories.StoryItem storyItem = b4Var.a;
                f7Var.k(storyItem.dialogId, storyItem);
                d4Var5.p0();
                d4Var5.f1(false);
                w3 w3Var5 = d4Var5.p1;
                if (w3Var5 != null) {
                    w3Var5.a();
                    break;
                }
                break;
            case 5:
                w3 w3Var6 = this.b;
                d4 d4Var6 = w3Var6.l;
                b4 b4Var2 = d4Var6.K1;
                b4Var2.a.translated = true;
                d4Var6.p0();
                x3 x3Var = d4Var6.M1;
                if (x3Var != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.V0 = true;
                    i9Var.P();
                }
                f7 f7Var2 = MessagesController.getInstance(d4Var6.y2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = b4Var2.a;
                f7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(d4Var6.y2).getTranslateController().translateStory(b4Var2.a, new eg.z1(new p3(w3Var6, 1), System.currentTimeMillis(), 6));
                d4Var6.f1(false);
                d4Var6.d3 = true;
                d4Var6.G0.D(true);
                w3 w3Var7 = d4Var6.p1;
                if (w3Var7 != null) {
                    w3Var7.a();
                    break;
                }
                break;
            case 6:
                d4 d4Var7 = this.b.l;
                r6 r6Var = d4Var7.K1.b;
                if (r6Var != null) {
                    r6Var.a();
                    d4Var7.j1();
                }
                w3 w3Var8 = d4Var7.p1;
                if (w3Var8 != null) {
                    w3Var8.a();
                    break;
                }
                break;
            case 7:
                d4 d4Var8 = this.b.l;
                d4.d0(d4Var8);
                w3 w3Var9 = d4Var8.p1;
                if (w3Var9 != null) {
                    w3Var9.a();
                    break;
                }
                break;
            case 8:
                d4 d4Var9 = this.b.l;
                AndroidUtilities.addToClipboard(d4Var9.K1.e());
                d4.j0(d4Var9);
                w3 w3Var10 = d4Var9.p1;
                if (w3Var10 != null) {
                    w3Var10.a();
                    break;
                }
                break;
            case 9:
                d4 d4Var10 = this.b.l;
                d4Var10.Y0(false);
                w3 w3Var11 = d4Var10.p1;
                if (w3Var11 != null) {
                    w3Var11.a();
                    break;
                }
                break;
            case 10:
                d1 d1Var = d1.S;
                if (d1Var != null && d1Var.n) {
                    long j10 = d1Var.F;
                    boolean z10 = !d1Var.E;
                    d1Var.E = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                w3 w3Var12 = this.b.l.p1;
                if (w3Var12 != null) {
                    w3Var12.a();
                    break;
                }
                break;
            case 11:
                this.b.l.z3.b();
                break;
            case 12:
                this.b.l.A3.b();
                break;
            case 13:
                d4 d4Var11 = this.b.l;
                d4.f0(d4Var11);
                w3 w3Var13 = d4Var11.p1;
                if (w3Var13 != null) {
                    w3Var13.a();
                    break;
                }
                break;
            case 14:
                d4 d4Var12 = this.b.l;
                MediaDataController.getInstance(d4Var12.y2).removePeer(d4Var12.x1);
                d4Var12.O1.i0(d4Var12.x1, true, false);
                w3 w3Var14 = d4Var12.p1;
                if (w3Var14 != null) {
                    w3Var14.a();
                    break;
                }
                break;
            default:
                d4 d4Var13 = this.b.l;
                d4.e0(d4Var13, d4Var13.x1);
                w3 w3Var15 = d4Var13.p1;
                if (w3Var15 != null) {
                    w3Var15.a();
                    break;
                }
                break;
        }
    }
}
