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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a5b(kxb kxbVar, ArrayList arrayList, jc jcVar) {
        this.a = (byte) 20;
        this.b = kxbVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d28 d28Var;
        c30 c30Var;
        y29 y29Var;
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                u41 u41Var = (u41) obj2;
                Runnable runnable = (Runnable) obj;
                if (u41Var != null) {
                    u41Var.setLoading(false);
                }
                runnable.run();
                break;
            case 1:
                ((a5b) obj).run();
                ((t7b) obj2).o0();
                break;
            case 2:
                t7b t7bVar = (t7b) obj2;
                t7bVar.c(false);
                gl.r(t7bVar.h2);
                t7bVar.h2 = null;
                t7bVar.T1 = false;
                ((Runnable) obj).run();
                break;
            case 3:
                l8b l8bVar = (l8b) obj;
                m8b m8bVar = ((d8b) obj2).d;
                y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
                if (currentPeerView != null && (d28Var = currentPeerView.S0) != null && (c30Var = m8bVar.G0) != null && ((l8b) c30Var.c) == l8bVar) {
                    d28Var.invalidate();
                    break;
                }
                break;
            case 4:
                na7.q1(((yab) obj2).a.a).n5((TLRPC.EmojiStatus) obj, null);
                break;
            case 5:
                ((hj3) obj2).a((TLRPC.Chat) obj);
                break;
            case 6:
                akb akbVar = (akb) obj2;
                akbVar.b((File) obj, akbVar.i0);
                gl.c3(new bj4(akbVar, b2));
                break;
            case 7:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().K4(true);
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(themeActivity.getMessagesController().Y4());
                    break;
                }
                break;
            case 8:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                bkb.w = str;
                if (str == null) {
                    bkb.w = String.format("(%.06f, %.06f)", Double.valueOf(bkb.x), Double.valueOf(bkb.y));
                }
                bkb.u1();
                o39 o39Var = themeActivity2.b;
                if (o39Var != null && (y29Var = (y29) o39Var.K(themeActivity2.Z)) != null) {
                    View view2 = y29Var.a;
                    if (view2 instanceof uib) {
                        ((uib) view2).c(k96.M0(2131753778, "AutoNightUpdateLocation"), bkb.w, false, false);
                        break;
                    }
                }
                break;
            case 9:
                qmb qmbVar = (qmb) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (qmbVar.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    qmbVar.C0.c(qmbVar.M0[0]);
                    break;
                }
                break;
            case 10:
                ((ymb) obj2).a0((TLRPC.TL_theme) obj);
                break;
            case 11:
                ((ymb) obj2).Z((String) obj);
                break;
            case 12:
                ((f) obj2).z1((akb) obj);
                break;
            case 13:
                iob iobVar = (iob) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (iobVar.k && !iobVar.i) {
                    iobVar.d.add(new hob(iobVar, bitmap));
                    iobVar.k = false;
                    iobVar.n.invalidate();
                    break;
                }
                break;
            case 14:
                gl.g((String) obj);
                ((jpb) obj2).b(true);
                break;
            case 15:
                gl.g(k27.h0(((TLRPC.TodoItem) obj).title, false));
                ((jpb) obj2).b(true);
                break;
            case 16:
                pub pubVar = (pub) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = new HashSet();
                for (int i = 0; i < arrayList.size(); i++) {
                    zc7 zc7Var = (zc7) arrayList.get(i);
                    long j = -zc7Var.a;
                    vf6 vf6Var = (vf6) pubVar.b.f(j);
                    if (vf6Var != null) {
                        vf6Var.l(zc7Var.b);
                    }
                    ArrayList arrayList2 = (ArrayList) pubVar.a.f(j);
                    if (arrayList2 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList2.size()) {
                                break;
                            }
                            if ((pubVar.getMessagesController().x2(zc7Var.a) ? cf3.n(((TLRPC.TL_forumTopic) arrayList2.get(i2)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i2)).id) == zc7Var.b) {
                                arrayList2.remove(i2);
                                pubVar.getNotificationCenter().k(kk7.x1, Long.valueOf(-j), Long.valueOf(zc7Var.b));
                                hashSet.add(Long.valueOf(j));
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    pubVar.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 17:
                Bundle bundle = new Bundle();
                qvb qvbVar = ((xub) obj2).b;
                bundle.putLong("dialog_id", -qvbVar.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                qvbVar.presentFragment(new pr8(bundle, null));
                break;
            case 18:
                mvb mvbVar = (mvb) obj2;
                String str2 = (String) obj;
                ArrayList arrayList3 = mvbVar.f0;
                qvb qvbVar2 = mvbVar.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList4 = new ArrayList();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList5 = qvbVar2.b;
                    if (i3 >= arrayList5.size()) {
                        arrayList3.clear();
                        arrayList3.addAll(arrayList4);
                        mvbVar.N();
                        if (!arrayList3.isEmpty()) {
                            mvbVar.o0 = false;
                            mvbVar.r0.b(0);
                        }
                        mvbVar.L(str2);
                        break;
                    } else {
                        if (((ivb) arrayList5.get(i3)).c != null && ((ivb) arrayList5.get(i3)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList4.add(((ivb) arrayList5.get(i3)).c);
                            ((ivb) arrayList5.get(i3)).c.searchQuery = lowerCase;
                        }
                        i3++;
                    }
                }
                break;
            case 19:
                wvb wvbVar = ((svb) obj2).b.a;
                wvbVar.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                wvbVar.Z();
                break;
            case 20:
                kxb kxbVar = (kxb) obj2;
                na7.q1(kxbVar.e).g4.d((ArrayList) obj, -kxbVar.f);
                break;
            case 21:
                na7.q1(((kxb) obj2).e).Y2(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                break;
            case 22:
                bb2 bb2Var = (bb2) obj2;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) obj;
                if (bb2Var != null) {
                    bb2Var.d0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 23:
                kk7 kk7Var = (kk7) obj2;
                ryb rybVar = (ryb) obj;
                kk7Var.n(rybVar, kk7.X1);
                kk7Var.n(rybVar, kk7.Y1);
                break;
            case 24:
                rzb rzbVar = (rzb) obj2;
                TLObject tLObject = (TLObject) obj;
                ig9 ig9Var = rzbVar.s1;
                rzbVar.l1 = null;
                if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        rzbVar.O1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (ig9Var != null) {
                            ig9Var.set(richMessage);
                            rzbVar.H1.D(ig9Var);
                            break;
                        }
                    }
                }
                if (rzbVar.O1) {
                    rzbVar.dismiss();
                    kk7.e().k(kk7.R4, 1, k96.M0(2131743707, null));
                    break;
                } else {
                    yjb.x(null, 2131743707, new u21((FrameLayout) rzbVar.b, rzbVar.J0), null);
                    mzb mzbVar = rzbVar.w1.e;
                    String str3 = rzbVar.v1;
                    rzbVar.u1 = str3;
                    mzbVar.setText(rzb.J0(str3, null, null));
                    break;
                }
                break;
            case 25:
                mr1 mr1Var = (mr1) obj2;
                ((m8) obj).d(true);
                g0c.a(mr1Var.getContext(), mr1Var.d);
                break;
            case 26:
                ((b1c) obj).J(((mr1) obj2).b, false, false);
                break;
            case 27:
                ((TwoStepVerificationActivity) obj2).q0((byte[]) obj);
                break;
            case 28:
                ((TwoStepVerificationActivity) obj2).i0((TL_account.updatePasswordSettings) obj);
                break;
            default:
                ((TwoStepVerificationActivity) obj2).p0((TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ a5b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
