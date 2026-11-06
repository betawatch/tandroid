package di;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.d10;
import org.telegram.messenger.f10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.yn;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e21;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ o3(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b.x;
                i4.c0(i4Var, i4Var.k1);
                z3 z3Var = i4Var.c1;
                if (z3Var != null) {
                    z3Var.a();
                    break;
                }
                break;
            case 1:
                i4 i4Var2 = this.b.x;
                i4.b0(i4Var2);
                z3 z3Var2 = i4Var2.c1;
                if (z3Var2 != null) {
                    z3Var2.a();
                    break;
                }
                break;
            case 2:
                i4 i4Var3 = this.b.x;
                org.telegram.messenger.g0.g(i4Var3.x1.e());
                i4.h0(i4Var3);
                z3 z3Var3 = i4Var3.c1;
                if (z3Var3 != null) {
                    z3Var3.a();
                    break;
                }
                break;
            case 3:
                i4 i4Var4 = this.b.x;
                i4Var4.W0(false);
                z3 z3Var4 = i4Var4.c1;
                if (z3Var4 != null) {
                    z3Var4.a();
                    break;
                }
                break;
            case 4:
                i4 i4Var5 = this.b.x;
                g4 g4Var = i4Var5.x1;
                g4Var.a.translated = false;
                l7 l7Var = qp.s1(i4Var5.l2).P1().k;
                TL_stories.StoryItem storyItem = g4Var.a;
                l7Var.k(storyItem.dialogId, storyItem);
                i4Var5.n0();
                i4Var5.d1(false);
                z3 z3Var5 = i4Var5.c1;
                if (z3Var5 != null) {
                    z3Var5.a();
                    break;
                }
                break;
            case 5:
                z3 z3Var6 = this.b;
                i4 i4Var6 = z3Var6.x;
                g4 g4Var2 = i4Var6.x1;
                g4Var2.a.translated = true;
                i4Var6.n0();
                b4 b4Var = i4Var6.z1;
                if (b4Var != null) {
                    p9 p9Var = ((g9) b4Var).d;
                    p9Var.Y0 = true;
                    p9Var.V();
                }
                l7 l7Var2 = qp.s1(i4Var6.l2).P1().k;
                TL_stories.StoryItem storyItem2 = g4Var2.a;
                l7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                s3 s3Var = new s3(z3Var6, 1);
                f10 f10Var = qp.s1(i4Var6.l2).s7;
                TL_stories.StoryItem storyItem3 = g4Var2.a;
                bi.r3 r3Var = new bi.r3(s3Var, currentTimeMillis, 4);
                HashSet hashSet = f10Var.J;
                if (storyItem3 != null) {
                    d10 d10Var = new d10();
                    String M0 = e21.M0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, M0)) {
                        r3Var.run();
                    } else if (hashSet.contains(d10Var)) {
                        r3Var.run();
                    } else {
                        hashSet.add(d10Var);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = f10.D(M0);
                        f10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new yn(f10Var, storyItem3, M0, d10Var, r3Var, tL_textWithEntities, 1));
                    }
                }
                i4Var6.d1(false);
                i4Var6.Q2 = true;
                i4Var6.t0.E(true);
                z3 z3Var7 = i4Var6.c1;
                if (z3Var7 != null) {
                    z3Var7.a();
                    break;
                }
                break;
            case 6:
                i4 i4Var7 = this.b.x;
                x6 x6Var = i4Var7.x1.b;
                if (x6Var != null) {
                    x6Var.a();
                    i4Var7.h1();
                }
                z3 z3Var8 = i4Var7.c1;
                if (z3Var8 != null) {
                    z3Var8.a();
                    break;
                }
                break;
            case 7:
                i4 i4Var8 = this.b.x;
                i4.b0(i4Var8);
                z3 z3Var9 = i4Var8.c1;
                if (z3Var9 != null) {
                    z3Var9.a();
                    break;
                }
                break;
            case 8:
                i4 i4Var9 = this.b.x;
                org.telegram.messenger.g0.g(i4Var9.x1.e());
                i4.h0(i4Var9);
                z3 z3Var10 = i4Var9.c1;
                if (z3Var10 != null) {
                    z3Var10.a();
                    break;
                }
                break;
            case 9:
                i4 i4Var10 = this.b.x;
                i4Var10.W0(false);
                z3 z3Var11 = i4Var10.c1;
                if (z3Var11 != null) {
                    z3Var11.a();
                    break;
                }
                break;
            case 10:
                g1 g1Var = g1.W;
                if (g1Var != null && g1Var.n) {
                    long j3 = g1Var.J;
                    boolean z9 = !g1Var.I;
                    g1Var.I = z9;
                    NativeInstance.switchCameraCapturer(j3, z9);
                }
                z3 z3Var12 = this.b.x.c1;
                if (z3Var12 != null) {
                    z3Var12.a();
                    break;
                }
                break;
            case 11:
                this.b.x.m3.b();
                break;
            case 12:
                this.b.x.n3.b();
                break;
            case 13:
                i4 i4Var11 = this.b.x;
                i4.d0(i4Var11);
                z3 z3Var13 = i4Var11.c1;
                if (z3Var13 != null) {
                    z3Var13.a();
                    break;
                }
                break;
            case 14:
                i4 i4Var12 = this.b.x;
                ui.b0(i4Var12.l2).N1(i4Var12.k1);
                i4Var12.B1.l0(i4Var12.k1, true, false);
                z3 z3Var14 = i4Var12.c1;
                if (z3Var14 != null) {
                    z3Var14.a();
                    break;
                }
                break;
            default:
                i4 i4Var13 = this.b.x;
                i4.c0(i4Var13, i4Var13.k1);
                z3 z3Var15 = i4Var13.c1;
                if (z3Var15 != null) {
                    z3Var15.a();
                    break;
                }
                break;
        }
    }
}
