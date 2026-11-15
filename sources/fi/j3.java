package fi;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a10;
import org.telegram.messenger.c10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.vn;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p21;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ j3(t3 t3Var, int i7) {
        this.a = i7;
        this.b = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b.x;
                b4.c0(b4Var, b4Var.l1);
                t3 t3Var = b4Var.d1;
                if (t3Var != null) {
                    t3Var.a();
                    break;
                }
                break;
            case 1:
                b4 b4Var2 = this.b.x;
                b4.b0(b4Var2);
                t3 t3Var2 = b4Var2.d1;
                if (t3Var2 != null) {
                    t3Var2.a();
                    break;
                }
                break;
            case 2:
                b4 b4Var3 = this.b.x;
                org.telegram.messenger.g0.g(b4Var3.y1.e());
                b4.h0(b4Var3);
                t3 t3Var3 = b4Var3.d1;
                if (t3Var3 != null) {
                    t3Var3.a();
                    break;
                }
                break;
            case 3:
                b4 b4Var4 = this.b.x;
                b4Var4.W0(false);
                t3 t3Var4 = b4Var4.d1;
                if (t3Var4 != null) {
                    t3Var4.a();
                    break;
                }
                break;
            case 4:
                b4 b4Var5 = this.b.x;
                z3 z3Var = b4Var5.y1;
                z3Var.a.translated = false;
                f7 f7Var = np.s1(b4Var5.m2).P1().k;
                TL_stories.StoryItem storyItem = z3Var.a;
                f7Var.k(storyItem.dialogId, storyItem);
                b4Var5.n0();
                b4Var5.d1(false);
                t3 t3Var5 = b4Var5.d1;
                if (t3Var5 != null) {
                    t3Var5.a();
                    break;
                }
                break;
            case 5:
                t3 t3Var6 = this.b;
                b4 b4Var6 = t3Var6.x;
                z3 z3Var2 = b4Var6.y1;
                z3Var2.a.translated = true;
                b4Var6.n0();
                u3 u3Var = b4Var6.A1;
                if (u3Var != null) {
                    i9 i9Var = ((z8) u3Var).d;
                    i9Var.Z0 = true;
                    i9Var.V();
                }
                f7 f7Var2 = np.s1(b4Var6.m2).P1().k;
                TL_stories.StoryItem storyItem2 = z3Var2.a;
                f7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                n3 n3Var = new n3(t3Var6, 1);
                c10 c10Var = np.s1(b4Var6.m2).t7;
                TL_stories.StoryItem storyItem3 = z3Var2.a;
                di.x2 x2Var = new di.x2(n3Var, currentTimeMillis, 4);
                HashSet hashSet = c10Var.K;
                if (storyItem3 != null) {
                    a10 a10Var = new a10();
                    String M0 = p21.M0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, M0)) {
                        x2Var.run();
                    } else if (hashSet.contains(a10Var)) {
                        x2Var.run();
                    } else {
                        hashSet.add(a10Var);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = c10.D(M0);
                        c10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new vn(c10Var, storyItem3, M0, a10Var, x2Var, tL_textWithEntities, 1));
                    }
                }
                b4Var6.d1(false);
                b4Var6.R2 = true;
                b4Var6.u0.E(true);
                t3 t3Var7 = b4Var6.d1;
                if (t3Var7 != null) {
                    t3Var7.a();
                    break;
                }
                break;
            case 6:
                b4 b4Var7 = this.b.x;
                r6 r6Var = b4Var7.y1.b;
                if (r6Var != null) {
                    r6Var.a();
                    b4Var7.h1();
                }
                t3 t3Var8 = b4Var7.d1;
                if (t3Var8 != null) {
                    t3Var8.a();
                    break;
                }
                break;
            case 7:
                b4 b4Var8 = this.b.x;
                b4.b0(b4Var8);
                t3 t3Var9 = b4Var8.d1;
                if (t3Var9 != null) {
                    t3Var9.a();
                    break;
                }
                break;
            case 8:
                b4 b4Var9 = this.b.x;
                org.telegram.messenger.g0.g(b4Var9.y1.e());
                b4.h0(b4Var9);
                t3 t3Var10 = b4Var9.d1;
                if (t3Var10 != null) {
                    t3Var10.a();
                    break;
                }
                break;
            case 9:
                b4 b4Var10 = this.b.x;
                b4Var10.W0(false);
                t3 t3Var11 = b4Var10.d1;
                if (t3Var11 != null) {
                    t3Var11.a();
                    break;
                }
                break;
            case 10:
                e1 e1Var = e1.X;
                if (e1Var != null && e1Var.n) {
                    long j3 = e1Var.K;
                    boolean z10 = !e1Var.J;
                    e1Var.J = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                t3 t3Var12 = this.b.x.d1;
                if (t3Var12 != null) {
                    t3Var12.a();
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
                b4 b4Var11 = this.b.x;
                b4.d0(b4Var11);
                t3 t3Var13 = b4Var11.d1;
                if (t3Var13 != null) {
                    t3Var13.a();
                    break;
                }
                break;
            case 14:
                b4 b4Var12 = this.b.x;
                si.b0(b4Var12.m2).N1(b4Var12.l1);
                b4Var12.C1.l0(b4Var12.l1, true, false);
                t3 t3Var14 = b4Var12.d1;
                if (t3Var14 != null) {
                    t3Var14.a();
                    break;
                }
                break;
            default:
                b4 b4Var13 = this.b.x;
                b4.c0(b4Var13, b4Var13.l1);
                t3 t3Var15 = b4Var13.d1;
                if (t3Var15 != null) {
                    t3Var15.a();
                    break;
                }
                break;
        }
    }
}
