package fi;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.tn;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.y00;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b31;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ h3(r3 r3Var, int i7) {
        this.a = i7;
        this.b = r3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z3 z3Var = this.b.x;
                z3.c0(z3Var, z3Var.l1);
                r3 r3Var = z3Var.d1;
                if (r3Var != null) {
                    r3Var.a();
                    break;
                }
                break;
            case 1:
                z3 z3Var2 = this.b.x;
                z3.b0(z3Var2);
                r3 r3Var2 = z3Var2.d1;
                if (r3Var2 != null) {
                    r3Var2.a();
                    break;
                }
                break;
            case 2:
                z3 z3Var3 = this.b.x;
                org.telegram.messenger.g0.g(z3Var3.y1.e());
                z3.h0(z3Var3);
                r3 r3Var3 = z3Var3.d1;
                if (r3Var3 != null) {
                    r3Var3.a();
                    break;
                }
                break;
            case 3:
                z3 z3Var4 = this.b.x;
                z3Var4.W0(false);
                r3 r3Var4 = z3Var4.d1;
                if (r3Var4 != null) {
                    r3Var4.a();
                    break;
                }
                break;
            case 4:
                z3 z3Var5 = this.b.x;
                x3 x3Var = z3Var5.y1;
                x3Var.a.translated = false;
                c7 c7Var = np.u1(z3Var5.m2).R1().k;
                TL_stories.StoryItem storyItem = x3Var.a;
                c7Var.k(storyItem.dialogId, storyItem);
                z3Var5.n0();
                z3Var5.d1(false);
                r3 r3Var5 = z3Var5.d1;
                if (r3Var5 != null) {
                    r3Var5.a();
                    break;
                }
                break;
            case 5:
                r3 r3Var6 = this.b;
                z3 z3Var6 = r3Var6.x;
                x3 x3Var2 = z3Var6.y1;
                x3Var2.a.translated = true;
                z3Var6.n0();
                s3 s3Var = z3Var6.A1;
                if (s3Var != null) {
                    f9 f9Var = ((w8) s3Var).d;
                    f9Var.Z0 = true;
                    f9Var.V();
                }
                c7 c7Var2 = np.u1(z3Var6.m2).R1().k;
                TL_stories.StoryItem storyItem2 = x3Var2.a;
                c7Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                l3 l3Var = new l3(r3Var6, 1);
                a10 a10Var = np.u1(z3Var6.m2).v7;
                TL_stories.StoryItem storyItem3 = x3Var2.a;
                bi.c4 c4Var = new bi.c4(l3Var, currentTimeMillis, 5);
                HashSet hashSet = a10Var.K;
                if (storyItem3 != null) {
                    y00 y00Var = new y00();
                    String N0 = b31.N0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, N0)) {
                        c4Var.run();
                    } else if (hashSet.contains(y00Var)) {
                        c4Var.run();
                    } else {
                        hashSet.add(y00Var);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = a10.D(N0);
                        a10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new tn(a10Var, storyItem3, N0, y00Var, c4Var, tL_textWithEntities, 1));
                    }
                }
                z3Var6.d1(false);
                z3Var6.R2 = true;
                z3Var6.u0.E(true);
                r3 r3Var7 = z3Var6.d1;
                if (r3Var7 != null) {
                    r3Var7.a();
                    break;
                }
                break;
            case 6:
                z3 z3Var7 = this.b.x;
                o6 o6Var = z3Var7.y1.b;
                if (o6Var != null) {
                    o6Var.a();
                    z3Var7.h1();
                }
                r3 r3Var8 = z3Var7.d1;
                if (r3Var8 != null) {
                    r3Var8.a();
                    break;
                }
                break;
            case 7:
                z3 z3Var8 = this.b.x;
                z3.b0(z3Var8);
                r3 r3Var9 = z3Var8.d1;
                if (r3Var9 != null) {
                    r3Var9.a();
                    break;
                }
                break;
            case 8:
                z3 z3Var9 = this.b.x;
                org.telegram.messenger.g0.g(z3Var9.y1.e());
                z3.h0(z3Var9);
                r3 r3Var10 = z3Var9.d1;
                if (r3Var10 != null) {
                    r3Var10.a();
                    break;
                }
                break;
            case 9:
                z3 z3Var10 = this.b.x;
                z3Var10.W0(false);
                r3 r3Var11 = z3Var10.d1;
                if (r3Var11 != null) {
                    r3Var11.a();
                    break;
                }
                break;
            case 10:
                c1 c1Var = c1.X;
                if (c1Var != null && c1Var.n) {
                    long j3 = c1Var.K;
                    boolean z10 = !c1Var.J;
                    c1Var.J = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                r3 r3Var12 = this.b.x.d1;
                if (r3Var12 != null) {
                    r3Var12.a();
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
                z3 z3Var11 = this.b.x;
                z3.d0(z3Var11);
                r3 r3Var13 = z3Var11.d1;
                if (r3Var13 != null) {
                    r3Var13.a();
                    break;
                }
                break;
            case 14:
                z3 z3Var12 = this.b.x;
                si.d0(z3Var12.m2).S1(z3Var12.l1);
                z3Var12.C1.l0(z3Var12.l1, true, false);
                r3 r3Var14 = z3Var12.d1;
                if (r3Var14 != null) {
                    r3Var14.a();
                    break;
                }
                break;
            default:
                z3 z3Var13 = this.b.x;
                z3.c0(z3Var13, z3Var13.l1);
                r3 r3Var15 = z3Var13.d1;
                if (r3Var15 != null) {
                    r3Var15.a();
                    break;
                }
                break;
        }
    }
}
