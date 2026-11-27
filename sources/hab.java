// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hab(l1c l1cVar, ArrayList arrayList, kc kcVar) {
        this.a = (byte) 18;
        this.b = l1cVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u58 u58Var;
        d30 d30Var;
        n69 n69Var;
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((n3b) obj).run();
                ((sbb) obj2).o0();
                break;
            case 1:
                kcb kcbVar = (kcb) obj;
                lcb lcbVar = ((ccb) obj2).d;
                o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
                if (currentPeerView != null && (u58Var = currentPeerView.M0) != null && (d30Var = lcbVar.G0) != null && ((kcb) d30Var.c) == kcbVar) {
                    u58Var.invalidate();
                    break;
                }
                break;
            case 2:
                uc7.s1(((veb) obj2).a.a).v5((TLRPC.EmojiStatus) obj, null);
                break;
            case 3:
                ((zj3) obj2).a((TLRPC.Chat) obj);
                break;
            case 4:
                znb znbVar = (znb) obj2;
                znbVar.b((File) obj, znbVar.i0);
                hl.c3(new fl4(znbVar, b2));
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                String str = (String) obj;
                aob.w = str;
                if (str == null) {
                    aob.w = String.format("(%.06f, %.06f)", Double.valueOf(aob.x), Double.valueOf(aob.y));
                }
                aob.u1();
                d79 d79Var = themeActivity.b;
                if (d79Var != null && (n69Var = (n69) d79Var.L(themeActivity.Z)) != null) {
                    View view = n69Var.a;
                    if (view instanceof qmb) {
                        ((qmb) view).c(ob6.M0(2131753774, "AutoNightUpdateLocation"), aob.w, false, false);
                        break;
                    }
                }
                break;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                View view2 = (View) obj;
                themeActivity2.getMessagesController().S4(true);
                if (view2 instanceof wkb) {
                    ((wkb) view2).setChecked(themeActivity2.getMessagesController().g5());
                    break;
                }
                break;
            case 7:
                pqb pqbVar = (pqb) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (pqbVar.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    pqbVar.C0.c(pqbVar.M0[0]);
                    break;
                }
                break;
            case 8:
                ((xqb) obj2).a0((TLRPC.TL_theme) obj);
                break;
            case 9:
                ((xqb) obj2).Z((String) obj);
                break;
            case 10:
                ((f) obj2).A1((znb) obj);
                break;
            case 11:
                isb isbVar = (isb) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (isbVar.k && !isbVar.i) {
                    isbVar.d.add(new hsb(isbVar, bitmap));
                    isbVar.k = false;
                    isbVar.n.invalidate();
                    break;
                }
                break;
            case 12:
                hl.g((String) obj);
                ((ktb) obj2).b(true);
                break;
            case 13:
                hl.g(r47.h0(((TLRPC.TodoItem) obj).title, false));
                ((ktb) obj2).b(true);
                break;
            case 14:
                qyb qybVar = (qyb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = new HashSet();
                for (int i = 0; i < arrayList.size(); i++) {
                    jf7 jf7Var = (jf7) arrayList.get(i);
                    long j = -jf7Var.a;
                    zh6 zh6Var = (zh6) qybVar.b.f(j);
                    if (zh6Var != null) {
                        zh6Var.l(jf7Var.b);
                    }
                    ArrayList arrayList2 = (ArrayList) qybVar.a.f(j);
                    if (arrayList2 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList2.size()) {
                                break;
                            }
                            if ((qybVar.getMessagesController().B2(jf7Var.a) ? wf3.n(((TLRPC.TL_forumTopic) arrayList2.get(i2)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i2)).id) == jf7Var.b) {
                                arrayList2.remove(i2);
                                qybVar.getNotificationCenter().k(jn7.y1, Long.valueOf(-j), Long.valueOf(jf7Var.b));
                                hashSet.add(Long.valueOf(j));
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    qybVar.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 15:
                Bundle bundle = new Bundle();
                tzb tzbVar = ((yyb) obj2).b;
                bundle.putLong("dialog_id", -tzbVar.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                tzbVar.presentFragment(new zu8(bundle, null));
                break;
            case 16:
                ozb ozbVar = (ozb) obj2;
                String str2 = (String) obj;
                ArrayList arrayList3 = ozbVar.f0;
                tzb tzbVar2 = ozbVar.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList4 = new ArrayList();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList5 = tzbVar2.b;
                    if (i3 >= arrayList5.size()) {
                        arrayList3.clear();
                        arrayList3.addAll(arrayList4);
                        ozbVar.O();
                        if (!arrayList3.isEmpty()) {
                            ozbVar.o0 = false;
                            ozbVar.r0.b(0);
                        }
                        ozbVar.M(str2);
                        break;
                    } else {
                        if (((kzb) arrayList5.get(i3)).c != null && ((kzb) arrayList5.get(i3)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList4.add(((kzb) arrayList5.get(i3)).c);
                            ((kzb) arrayList5.get(i3)).c.searchQuery = lowerCase;
                        }
                        i3++;
                    }
                }
                break;
            case 17:
                zzb zzbVar = ((vzb) obj2).b.a;
                zzbVar.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                zzbVar.Z();
                break;
            case 18:
                l1c l1cVar = (l1c) obj2;
                uc7.s1(l1cVar.e).h4.d((ArrayList) obj, -l1cVar.f);
                break;
            case 19:
                uc7.s1(((l1c) obj2).e).e3(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                break;
            case 20:
                rb2 rb2Var = (rb2) obj2;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) obj;
                if (rb2Var != null) {
                    rb2Var.Y(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 21:
                jn7 jn7Var = (jn7) obj2;
                r2c r2cVar = (r2c) obj;
                jn7Var.n(r2cVar, jn7.Y1);
                jn7Var.n(r2cVar, jn7.Z1);
                break;
            case 22:
                r3c r3cVar = (r3c) obj2;
                TLObject tLObject = (TLObject) obj;
                zj9 zj9Var = r3cVar.s1;
                r3cVar.l1 = null;
                if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        r3cVar.O1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (zj9Var != null) {
                            zj9Var.set(richMessage);
                            r3cVar.H1.D(zj9Var);
                            break;
                        }
                    }
                }
                if (r3cVar.O1) {
                    r3cVar.dismiss();
                    jn7.e().k(jn7.S4, 1, ob6.M0(2131743601, null));
                    break;
                } else {
                    xnb.x(null, 2131743601, new d31((FrameLayout) r3cVar.b, r3cVar.J0), null);
                    m3c m3cVar = r3cVar.w1.e;
                    String str3 = r3cVar.v1;
                    r3cVar.u1 = str3;
                    m3cVar.setText(r3c.K0(str3, null, null));
                    break;
                }
                break;
            case 23:
                as1 as1Var = (as1) obj2;
                ((n8) obj).d(true);
                f4c.a(as1Var.getContext(), as1Var.d);
                break;
            case 24:
                ((a5c) obj).J(((as1) obj2).b, false, false);
                break;
            case 25:
                ((TwoStepVerificationActivity) obj2).q0((byte[]) obj);
                break;
            case 26:
                ((TwoStepVerificationActivity) obj2).p0((TLRPC.TL_error) obj);
                break;
            case 27:
                ((TwoStepVerificationActivity) obj2).i0((TL_account.updatePasswordSettings) obj);
                break;
            case 28:
                ((o7c) obj2).s0((String) obj);
                break;
            default:
                Runnable runnable = (Runnable) obj;
                for (ok2 ok2Var : ((o7c) obj2).x.f) {
                    ok2Var.D(0.0f);
                }
                runnable.run();
                break;
        }
    }

    public /* synthetic */ hab(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
