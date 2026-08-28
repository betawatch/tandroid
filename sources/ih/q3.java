package ih;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ q3(b4 b4Var, int i9) {
        this.a = i9;
        this.b = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b.l;
                i4.e0(i4Var, i4Var.x1);
                b4 b4Var = i4Var.p1;
                if (b4Var != null) {
                    b4Var.a();
                    break;
                }
                break;
            case 1:
                i4 i4Var2 = this.b.l;
                i4.d0(i4Var2);
                b4 b4Var2 = i4Var2.p1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    break;
                }
                break;
            case 2:
                i4 i4Var3 = this.b.l;
                AndroidUtilities.addToClipboard(i4Var3.K1.e());
                i4.j0(i4Var3);
                b4 b4Var3 = i4Var3.p1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    break;
                }
                break;
            case 3:
                i4 i4Var4 = this.b.l;
                i4Var4.Y0(false);
                b4 b4Var4 = i4Var4.p1;
                if (b4Var4 != null) {
                    b4Var4.a();
                    break;
                }
                break;
            case 4:
                i4 i4Var5 = this.b.l;
                g4 g4Var = i4Var5.K1;
                g4Var.a.translated = false;
                i7 i7Var = MessagesController.getInstance(i4Var5.y2).getStoriesController().k;
                TL_stories.StoryItem storyItem = g4Var.a;
                i7Var.k(storyItem.dialogId, storyItem);
                i4Var5.p0();
                i4Var5.f1(false);
                b4 b4Var5 = i4Var5.p1;
                if (b4Var5 != null) {
                    b4Var5.a();
                    break;
                }
                break;
            case 5:
                b4 b4Var6 = this.b;
                i4 i4Var6 = b4Var6.l;
                g4 g4Var2 = i4Var6.K1;
                g4Var2.a.translated = true;
                i4Var6.p0();
                c4 c4Var = i4Var6.M1;
                if (c4Var != null) {
                    m9 m9Var = ((d9) c4Var).d;
                    m9Var.V0 = true;
                    m9Var.P();
                }
                i7 i7Var2 = MessagesController.getInstance(i4Var6.y2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = g4Var2.a;
                i7Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(i4Var6.y2).getTranslateController().translateStory(g4Var2.a, new bg.i2(new u3(b4Var6, 1), System.currentTimeMillis(), 5));
                i4Var6.f1(false);
                i4Var6.d3 = true;
                i4Var6.G0.D(true);
                b4 b4Var7 = i4Var6.p1;
                if (b4Var7 != null) {
                    b4Var7.a();
                    break;
                }
                break;
            case 6:
                i4 i4Var7 = this.b.l;
                u6 u6Var = i4Var7.K1.b;
                if (u6Var != null) {
                    u6Var.a();
                    i4Var7.j1();
                }
                b4 b4Var8 = i4Var7.p1;
                if (b4Var8 != null) {
                    b4Var8.a();
                    break;
                }
                break;
            case 7:
                i4 i4Var8 = this.b.l;
                i4.d0(i4Var8);
                b4 b4Var9 = i4Var8.p1;
                if (b4Var9 != null) {
                    b4Var9.a();
                    break;
                }
                break;
            case 8:
                i4 i4Var9 = this.b.l;
                AndroidUtilities.addToClipboard(i4Var9.K1.e());
                i4.j0(i4Var9);
                b4 b4Var10 = i4Var9.p1;
                if (b4Var10 != null) {
                    b4Var10.a();
                    break;
                }
                break;
            case 9:
                i4 i4Var10 = this.b.l;
                i4Var10.Y0(false);
                b4 b4Var11 = i4Var10.p1;
                if (b4Var11 != null) {
                    b4Var11.a();
                    break;
                }
                break;
            case 10:
                f1 f1Var = f1.S;
                if (f1Var != null && f1Var.n) {
                    long j10 = f1Var.F;
                    boolean z10 = !f1Var.E;
                    f1Var.E = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                b4 b4Var12 = this.b.l.p1;
                if (b4Var12 != null) {
                    b4Var12.a();
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
                i4 i4Var11 = this.b.l;
                i4.f0(i4Var11);
                b4 b4Var13 = i4Var11.p1;
                if (b4Var13 != null) {
                    b4Var13.a();
                    break;
                }
                break;
            case 14:
                i4 i4Var12 = this.b.l;
                MediaDataController.getInstance(i4Var12.y2).removePeer(i4Var12.x1);
                i4Var12.O1.i0(i4Var12.x1, true, false);
                b4 b4Var14 = i4Var12.p1;
                if (b4Var14 != null) {
                    b4Var14.a();
                    break;
                }
                break;
            default:
                i4 i4Var13 = this.b.l;
                i4.e0(i4Var13, i4Var13.x1);
                b4 b4Var15 = i4Var13.p1;
                if (b4Var15 != null) {
                    b4Var15.a();
                    break;
                }
                break;
        }
    }
}
