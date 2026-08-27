package jh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ o3(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e4 e4Var = this.b.l;
                e4.e0(e4Var, e4Var.x1);
                x3 x3Var = e4Var.p1;
                if (x3Var != null) {
                    x3Var.a();
                    break;
                }
                break;
            case 1:
                e4 e4Var2 = this.b.l;
                e4.d0(e4Var2);
                x3 x3Var2 = e4Var2.p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                    break;
                }
                break;
            case 2:
                e4 e4Var3 = this.b.l;
                AndroidUtilities.addToClipboard(e4Var3.K1.e());
                e4.j0(e4Var3);
                x3 x3Var3 = e4Var3.p1;
                if (x3Var3 != null) {
                    x3Var3.a();
                    break;
                }
                break;
            case 3:
                e4 e4Var4 = this.b.l;
                e4Var4.Y0(false);
                x3 x3Var4 = e4Var4.p1;
                if (x3Var4 != null) {
                    x3Var4.a();
                    break;
                }
                break;
            case 4:
                e4 e4Var5 = this.b.l;
                c4 c4Var = e4Var5.K1;
                c4Var.a.translated = false;
                f7 f7Var = MessagesController.getInstance(e4Var5.y2).getStoriesController().k;
                TL_stories.StoryItem storyItem = c4Var.a;
                f7Var.k(storyItem.dialogId, storyItem);
                e4Var5.p0();
                e4Var5.f1(false);
                x3 x3Var5 = e4Var5.p1;
                if (x3Var5 != null) {
                    x3Var5.a();
                    break;
                }
                break;
            case 5:
                x3 x3Var6 = this.b;
                e4 e4Var6 = x3Var6.l;
                c4 c4Var2 = e4Var6.K1;
                c4Var2.a.translated = true;
                e4Var6.p0();
                y3 y3Var = e4Var6.M1;
                if (y3Var != null) {
                    i9 i9Var = ((z8) y3Var).d;
                    i9Var.V0 = true;
                    i9Var.P();
                }
                f7 f7Var2 = MessagesController.getInstance(e4Var6.y2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = c4Var2.a;
                f7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(e4Var6.y2).getTranslateController().translateStory(c4Var2.a, new cg.b2(new r3(x3Var6, 1), System.currentTimeMillis(), 6));
                e4Var6.f1(false);
                e4Var6.d3 = true;
                e4Var6.G0.D(true);
                x3 x3Var7 = e4Var6.p1;
                if (x3Var7 != null) {
                    x3Var7.a();
                    break;
                }
                break;
            case 6:
                e4 e4Var7 = this.b.l;
                r6 r6Var = e4Var7.K1.b;
                if (r6Var != null) {
                    r6Var.a();
                    e4Var7.j1();
                }
                x3 x3Var8 = e4Var7.p1;
                if (x3Var8 != null) {
                    x3Var8.a();
                    break;
                }
                break;
            case 7:
                e4 e4Var8 = this.b.l;
                e4.d0(e4Var8);
                x3 x3Var9 = e4Var8.p1;
                if (x3Var9 != null) {
                    x3Var9.a();
                    break;
                }
                break;
            case 8:
                e4 e4Var9 = this.b.l;
                AndroidUtilities.addToClipboard(e4Var9.K1.e());
                e4.j0(e4Var9);
                x3 x3Var10 = e4Var9.p1;
                if (x3Var10 != null) {
                    x3Var10.a();
                    break;
                }
                break;
            case 9:
                e4 e4Var10 = this.b.l;
                e4Var10.Y0(false);
                x3 x3Var11 = e4Var10.p1;
                if (x3Var11 != null) {
                    x3Var11.a();
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
                x3 x3Var12 = this.b.l.p1;
                if (x3Var12 != null) {
                    x3Var12.a();
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
                e4 e4Var11 = this.b.l;
                e4.f0(e4Var11);
                x3 x3Var13 = e4Var11.p1;
                if (x3Var13 != null) {
                    x3Var13.a();
                    break;
                }
                break;
            case 14:
                e4 e4Var12 = this.b.l;
                MediaDataController.getInstance(e4Var12.y2).removePeer(e4Var12.x1);
                e4Var12.O1.i0(e4Var12.x1, true, false);
                x3 x3Var14 = e4Var12.p1;
                if (x3Var14 != null) {
                    x3Var14.a();
                    break;
                }
                break;
            default:
                e4 e4Var13 = this.b.l;
                e4.e0(e4Var13, e4Var13.x1);
                x3 x3Var15 = e4Var13.p1;
                if (x3Var15 != null) {
                    x3Var15.a();
                    break;
                }
                break;
        }
    }
}
