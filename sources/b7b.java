// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b7b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b7b(mzb mzbVar, ArrayList arrayList, jd jdVar) {
        this.a = (byte) 22;
        this.b = mzbVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g48 g48Var;
        c40 c40Var;
        b59 b59Var;
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                a8b a8bVar = (a8b) obj2;
                HashMap f0 = ((cf7) obj).f0();
                if (!f0.isEmpty()) {
                    gm.c3(new b7b(a8bVar, f0, b2));
                    break;
                }
                break;
            case 1:
                a8b a8bVar2 = (a8b) obj2;
                HashMap hashMap = (HashMap) obj;
                HashMap hashMap2 = a8bVar2.J1;
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    a8bVar2.J1 = hashMap2;
                }
                hashMap2.putAll(hashMap);
                break;
            case 2:
                b61 b61Var = (b61) obj2;
                Runnable runnable = (Runnable) obj;
                if (b61Var != null) {
                    b61Var.setLoading(false);
                }
                runnable.run();
                break;
            case 3:
                ((b7b) obj).run();
                ((v9b) obj2).o0();
                break;
            case 4:
                v9b v9bVar = (v9b) obj2;
                v9bVar.c(false);
                gm.r(v9bVar.h2);
                v9bVar.h2 = null;
                v9bVar.T1 = false;
                ((Runnable) obj).run();
                break;
            case 5:
                nab nabVar = (nab) obj;
                oab oabVar = ((fab) obj2).d;
                a58 currentPeerView = oabVar.o0.getCurrentPeerView();
                if (currentPeerView != null && (g48Var = currentPeerView.S0) != null && (c40Var = oabVar.G0) != null && ((nab) c40Var.c) == nabVar) {
                    g48Var.invalidate();
                    break;
                }
                break;
            case 6:
                oc7.r1(((adb) obj2).a.a).p5((TLRPC.EmojiStatus) obj, null);
                break;
            case 7:
                ((sk3) obj2).a((TLRPC.Chat) obj);
                break;
            case 8:
                bmb bmbVar = (bmb) obj2;
                bmbVar.b((File) obj, bmbVar.i0);
                gm.c3(new fl4(bmbVar, b2));
                break;
            case 9:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().M4(true);
                if (view instanceof bjb) {
                    ((bjb) view).setChecked(themeActivity.getMessagesController().a5());
                    break;
                }
                break;
            case 10:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                cmb.w = str;
                if (str == null) {
                    cmb.w = String.format("(%.06f, %.06f)", Double.valueOf(cmb.x), Double.valueOf(cmb.y));
                }
                cmb.u1();
                r59 r59Var = themeActivity2.b;
                if (r59Var != null && (b59Var = (b59) r59Var.K(themeActivity2.Z)) != null) {
                    View view2 = b59Var.a;
                    if (view2 instanceof vkb) {
                        ((vkb) view2).c(jb6.M0(2131753746, "AutoNightUpdateLocation"), cmb.w, false, false);
                        break;
                    }
                }
                break;
            case 11:
                rob robVar = (rob) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (robVar.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    robVar.C0.c(robVar.M0[0]);
                    break;
                }
                break;
            case 12:
                ((zob) obj2).b0((TLRPC.TL_theme) obj);
                break;
            case 13:
                ((zob) obj2).a0((String) obj);
                break;
            case 14:
                ((f) obj2).z1((bmb) obj);
                break;
            case 15:
                jqb jqbVar = (jqb) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (jqbVar.k && !jqbVar.i) {
                    jqbVar.d.add(new iqb(jqbVar, bitmap));
                    jqbVar.k = false;
                    jqbVar.n.invalidate();
                    break;
                }
                break;
            case 16:
                gm.g((String) obj);
                ((krb) obj2).b(true);
                break;
            case 17:
                gm.g(k47.h0(((TLRPC.TodoItem) obj).title, false));
                ((krb) obj2).b(true);
                break;
            case 18:
                qwb qwbVar = (qwb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = new HashSet();
                for (int i = 0; i < arrayList.size(); i++) {
                    bf7 bf7Var = (bf7) arrayList.get(i);
                    long j = -bf7Var.a;
                    vh6 vh6Var = (vh6) qwbVar.b.f(j);
                    if (vh6Var != null) {
                        vh6Var.l(bf7Var.b);
                    }
                    ArrayList arrayList2 = (ArrayList) qwbVar.a.f(j);
                    if (arrayList2 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList2.size()) {
                                break;
                            }
                            if ((qwbVar.getMessagesController().y2(bf7Var.a) ? pg3.n(((TLRPC.TL_forumTopic) arrayList2.get(i2)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i2)).id) == bf7Var.b) {
                                arrayList2.remove(i2);
                                qwbVar.getNotificationCenter().k(nm7.y1, Long.valueOf(-j), Long.valueOf(bf7Var.b));
                                hashSet.add(Long.valueOf(j));
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    qwbVar.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 19:
                Bundle bundle = new Bundle();
                sxb sxbVar = ((ywb) obj2).b;
                bundle.putLong("dialog_id", -sxbVar.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                sxbVar.presentFragment(new st8(bundle, null));
                break;
            case 20:
                nxb nxbVar = (nxb) obj2;
                String str2 = (String) obj;
                ArrayList arrayList3 = nxbVar.f0;
                sxb sxbVar2 = nxbVar.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList4 = new ArrayList();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList5 = sxbVar2.b;
                    if (i3 >= arrayList5.size()) {
                        arrayList3.clear();
                        arrayList3.addAll(arrayList4);
                        nxbVar.N();
                        if (!arrayList3.isEmpty()) {
                            nxbVar.o0 = false;
                            nxbVar.r0.b(0);
                        }
                        nxbVar.L(str2);
                        break;
                    } else {
                        if (((jxb) arrayList5.get(i3)).c != null && ((jxb) arrayList5.get(i3)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList4.add(((jxb) arrayList5.get(i3)).c);
                            ((jxb) arrayList5.get(i3)).c.searchQuery = lowerCase;
                        }
                        i3++;
                    }
                }
                break;
            case 21:
                zxb zxbVar = ((vxb) obj2).b.a;
                zxbVar.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                zxbVar.a0();
                break;
            case 22:
                mzb mzbVar = (mzb) obj2;
                oc7.r1(mzbVar.e).g4.d((ArrayList) obj, -mzbVar.f);
                break;
            case 23:
                oc7.r1(((mzb) obj2).e).a3(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                break;
            case 24:
                mc2 mc2Var = (mc2) obj2;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) obj;
                if (mc2Var != null) {
                    mc2Var.Y(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 25:
                nm7 nm7Var = (nm7) obj2;
                s0c s0cVar = (s0c) obj;
                nm7Var.n(s0cVar, nm7.Y1);
                nm7Var.n(s0cVar, nm7.Z1);
                break;
            case 26:
                s1c s1cVar = (s1c) obj2;
                TLObject tLObject = (TLObject) obj;
                mi9 mi9Var = s1cVar.s1;
                s1cVar.l1 = null;
                if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        s1cVar.O1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (mi9Var != null) {
                            mi9Var.set(richMessage);
                            s1cVar.H1.D(mi9Var);
                            break;
                        }
                    }
                }
                if (s1cVar.O1) {
                    s1cVar.dismiss();
                    nm7.e().k(nm7.T4, 1, jb6.M0(2131743633, null));
                    break;
                } else {
                    mlb.y(null, 2131743633, new c41((FrameLayout) s1cVar.b, s1cVar.J0), null);
                    n1c n1cVar = s1cVar.w1.e;
                    String str3 = s1cVar.v1;
                    s1cVar.u1 = str3;
                    n1cVar.setText(s1c.J0(str3, null, null));
                    break;
                }
                break;
            case 27:
                zs1 zs1Var = (zs1) obj2;
                ((m8) obj).d(true);
                g2c.a(zs1Var.getContext(), zs1Var.d);
                break;
            case 28:
                ((b3c) obj).J(((zs1) obj2).b, false, false);
                break;
            default:
                ((TwoStepVerificationActivity) obj2).r0((byte[]) obj);
                break;
        }
    }

    public /* synthetic */ b7b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
