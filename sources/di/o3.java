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
import org.telegram.ui.Components.k21;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ o3(a4 a4Var, int i7) {
        this.a = i7;
        this.b = a4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b.x;
                j4.c0(j4Var, j4Var.k1);
                a4 a4Var = j4Var.c1;
                if (a4Var != null) {
                    a4Var.a();
                    break;
                }
                break;
            case 1:
                j4 j4Var2 = this.b.x;
                j4.b0(j4Var2);
                a4 a4Var2 = j4Var2.c1;
                if (a4Var2 != null) {
                    a4Var2.a();
                    break;
                }
                break;
            case 2:
                j4 j4Var3 = this.b.x;
                org.telegram.messenger.g0.g(j4Var3.x1.e());
                j4.h0(j4Var3);
                a4 a4Var3 = j4Var3.c1;
                if (a4Var3 != null) {
                    a4Var3.a();
                    break;
                }
                break;
            case 3:
                j4 j4Var4 = this.b.x;
                j4Var4.W0(false);
                a4 a4Var4 = j4Var4.c1;
                if (a4Var4 != null) {
                    a4Var4.a();
                    break;
                }
                break;
            case 4:
                j4 j4Var5 = this.b.x;
                h4 h4Var = j4Var5.x1;
                h4Var.a.translated = false;
                m7 m7Var = qp.s1(j4Var5.l2).P1().k;
                TL_stories.StoryItem storyItem = h4Var.a;
                m7Var.k(storyItem.dialogId, storyItem);
                j4Var5.n0();
                j4Var5.d1(false);
                a4 a4Var5 = j4Var5.c1;
                if (a4Var5 != null) {
                    a4Var5.a();
                    break;
                }
                break;
            case 5:
                a4 a4Var6 = this.b;
                j4 j4Var6 = a4Var6.x;
                h4 h4Var2 = j4Var6.x1;
                h4Var2.a.translated = true;
                j4Var6.n0();
                c4 c4Var = j4Var6.z1;
                if (c4Var != null) {
                    q9 q9Var = ((h9) c4Var).d;
                    q9Var.Y0 = true;
                    q9Var.V();
                }
                m7 m7Var2 = qp.s1(j4Var6.l2).P1().k;
                TL_stories.StoryItem storyItem2 = h4Var2.a;
                m7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                s3 s3Var = new s3(a4Var6, 1);
                f10 f10Var = qp.s1(j4Var6.l2).s7;
                TL_stories.StoryItem storyItem3 = h4Var2.a;
                bi.r3 r3Var = new bi.r3(s3Var, currentTimeMillis, 4);
                HashSet hashSet = f10Var.J;
                if (storyItem3 != null) {
                    d10 d10Var = new d10();
                    String M0 = k21.M0();
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
                j4Var6.d1(false);
                j4Var6.Q2 = true;
                j4Var6.t0.E(true);
                a4 a4Var7 = j4Var6.c1;
                if (a4Var7 != null) {
                    a4Var7.a();
                    break;
                }
                break;
            case 6:
                j4 j4Var7 = this.b.x;
                y6 y6Var = j4Var7.x1.b;
                if (y6Var != null) {
                    y6Var.a();
                    j4Var7.h1();
                }
                a4 a4Var8 = j4Var7.c1;
                if (a4Var8 != null) {
                    a4Var8.a();
                    break;
                }
                break;
            case 7:
                j4 j4Var8 = this.b.x;
                j4.b0(j4Var8);
                a4 a4Var9 = j4Var8.c1;
                if (a4Var9 != null) {
                    a4Var9.a();
                    break;
                }
                break;
            case 8:
                j4 j4Var9 = this.b.x;
                org.telegram.messenger.g0.g(j4Var9.x1.e());
                j4.h0(j4Var9);
                a4 a4Var10 = j4Var9.c1;
                if (a4Var10 != null) {
                    a4Var10.a();
                    break;
                }
                break;
            case 9:
                j4 j4Var10 = this.b.x;
                j4Var10.W0(false);
                a4 a4Var11 = j4Var10.c1;
                if (a4Var11 != null) {
                    a4Var11.a();
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
                a4 a4Var12 = this.b.x.c1;
                if (a4Var12 != null) {
                    a4Var12.a();
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
                j4 j4Var11 = this.b.x;
                j4.d0(j4Var11);
                a4 a4Var13 = j4Var11.c1;
                if (a4Var13 != null) {
                    a4Var13.a();
                    break;
                }
                break;
            case 14:
                j4 j4Var12 = this.b.x;
                ui.b0(j4Var12.l2).N1(j4Var12.k1);
                j4Var12.B1.l0(j4Var12.k1, true, false);
                a4 a4Var14 = j4Var12.c1;
                if (a4Var14 != null) {
                    a4Var14.a();
                    break;
                }
                break;
            default:
                j4 j4Var13 = this.b.x;
                j4.c0(j4Var13, j4Var13.k1);
                a4 a4Var15 = j4Var13.c1;
                if (a4Var15 != null) {
                    a4Var15.a();
                    break;
                }
                break;
        }
    }
}
