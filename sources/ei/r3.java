package ei;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.on;
import org.telegram.messenger.v00;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.x00;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f21;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ r3(b4 b4Var, int i3) {
        this.a = i3;
        this.b = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b.x;
                j4.c0(j4Var, j4Var.l1);
                b4 b4Var = j4Var.d1;
                if (b4Var != null) {
                    b4Var.a();
                    break;
                }
                break;
            case 1:
                j4 j4Var2 = this.b.x;
                j4.b0(j4Var2);
                b4 b4Var2 = j4Var2.d1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    break;
                }
                break;
            case 2:
                j4 j4Var3 = this.b.x;
                org.telegram.messenger.g0.g(j4Var3.y1.e());
                j4.h0(j4Var3);
                b4 b4Var3 = j4Var3.d1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    break;
                }
                break;
            case 3:
                j4 j4Var4 = this.b.x;
                j4Var4.W0(false);
                b4 b4Var4 = j4Var4.d1;
                if (b4Var4 != null) {
                    b4Var4.a();
                    break;
                }
                break;
            case 4:
                j4 j4Var5 = this.b.x;
                h4 h4Var = j4Var5.y1;
                h4Var.a.translated = false;
                m7 m7Var = hp.s1(j4Var5.m2).P1().k;
                TL_stories.StoryItem storyItem = h4Var.a;
                m7Var.k(storyItem.dialogId, storyItem);
                j4Var5.n0();
                j4Var5.d1(false);
                b4 b4Var5 = j4Var5.d1;
                if (b4Var5 != null) {
                    b4Var5.a();
                    break;
                }
                break;
            case 5:
                b4 b4Var6 = this.b;
                j4 j4Var6 = b4Var6.x;
                h4 h4Var2 = j4Var6.y1;
                h4Var2.a.translated = true;
                j4Var6.n0();
                c4 c4Var = j4Var6.A1;
                if (c4Var != null) {
                    r9 r9Var = ((i9) c4Var).d;
                    r9Var.a1 = true;
                    r9Var.d0();
                }
                m7 m7Var2 = hp.s1(j4Var6.m2).P1().k;
                TL_stories.StoryItem storyItem2 = h4Var2.a;
                m7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                v3 v3Var = new v3(b4Var6, 1);
                x00 x00Var = hp.s1(j4Var6.m2).s7;
                TL_stories.StoryItem storyItem3 = h4Var2.a;
                ci.e3 e3Var = new ci.e3(v3Var, currentTimeMillis, 4);
                HashSet hashSet = x00Var.K;
                if (storyItem3 != null) {
                    v00 v00Var = new v00();
                    String M0 = f21.M0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, M0)) {
                        e3Var.run();
                    } else if (hashSet.contains(v00Var)) {
                        e3Var.run();
                    } else {
                        hashSet.add(v00Var);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = x00.D(M0);
                        x00Var.getConnectionsManager().sendRequest(tL_messages_translateText, new on(x00Var, storyItem3, M0, v00Var, e3Var, tL_textWithEntities, 1));
                    }
                }
                j4Var6.d1(false);
                j4Var6.R2 = true;
                j4Var6.u0.E(true);
                b4 b4Var7 = j4Var6.d1;
                if (b4Var7 != null) {
                    b4Var7.a();
                    break;
                }
                break;
            case 6:
                j4 j4Var7 = this.b.x;
                y6 y6Var = j4Var7.y1.b;
                if (y6Var != null) {
                    y6Var.a();
                    j4Var7.h1();
                }
                b4 b4Var8 = j4Var7.d1;
                if (b4Var8 != null) {
                    b4Var8.a();
                    break;
                }
                break;
            case 7:
                j4 j4Var8 = this.b.x;
                j4.b0(j4Var8);
                b4 b4Var9 = j4Var8.d1;
                if (b4Var9 != null) {
                    b4Var9.a();
                    break;
                }
                break;
            case 8:
                j4 j4Var9 = this.b.x;
                org.telegram.messenger.g0.g(j4Var9.y1.e());
                j4.h0(j4Var9);
                b4 b4Var10 = j4Var9.d1;
                if (b4Var10 != null) {
                    b4Var10.a();
                    break;
                }
                break;
            case 9:
                j4 j4Var10 = this.b.x;
                j4Var10.W0(false);
                b4 b4Var11 = j4Var10.d1;
                if (b4Var11 != null) {
                    b4Var11.a();
                    break;
                }
                break;
            case 10:
                g1 g1Var = g1.X;
                if (g1Var != null && g1Var.n) {
                    long j10 = g1Var.K;
                    boolean z10 = !g1Var.J;
                    g1Var.J = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                b4 b4Var12 = this.b.x.d1;
                if (b4Var12 != null) {
                    b4Var12.a();
                    break;
                }
                break;
            case 11:
                this.b.x.n3.b();
                break;
            case 12:
                this.b.x.o3.b();
                break;
            case 13:
                j4 j4Var11 = this.b.x;
                j4.d0(j4Var11);
                b4 b4Var13 = j4Var11.d1;
                if (b4Var13 != null) {
                    b4Var13.a();
                    break;
                }
                break;
            case 14:
                j4 j4Var12 = this.b.x;
                li.b0(j4Var12.m2).N1(j4Var12.l1);
                j4Var12.C1.l0(j4Var12.l1, true, false);
                b4 b4Var14 = j4Var12.d1;
                if (b4Var14 != null) {
                    b4Var14.a();
                    break;
                }
                break;
            default:
                j4 j4Var13 = this.b.x;
                j4.c0(j4Var13, j4Var13.l1);
                b4 b4Var15 = j4Var13.d1;
                if (b4Var15 != null) {
                    b4Var15.a();
                    break;
                }
                break;
        }
    }
}
