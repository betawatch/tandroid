package bi;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import di.pc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.zt;
import org.telegram.ui.co;
import org.telegram.ui.ey;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        v51 v51Var;
        boolean z10;
        v51 v51Var2;
        int i11 = 3;
        int i12 = 0;
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                if (((Boolean) obj).booleanValue() && !t1Var.w) {
                    t1Var.n = true;
                    t1Var.I = true;
                    t1Var.u(false);
                    t1.W = t1Var;
                    t1Var.J = NativeInstance.createVideoCapturer(t1Var.H, t1Var.I ? 1 : 0);
                    if (t1Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = t1Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                        t1Var.M.clear();
                        t1Var.E = null;
                    }
                    t1Var.c();
                    t1Var.k();
                    NotificationCenter.getInstance(t1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.f.id));
                    break;
                }
                break;
            case 1:
                o5 o5Var = (o5) this.b;
                o5Var.L3 = ((Long) obj).longValue();
                n3 n3Var = o5Var.b2;
                if (n3Var != null) {
                    n3Var.K(true);
                    o5Var.b2.R1();
                }
                o5Var.r0(true);
                break;
            case 2:
                pb pbVar = (pb) this.b;
                pbVar.k1 = false;
                pbVar.P();
                break;
            case 3:
                u8 u8Var = (u8) this.b;
                l8 l8Var = (l8) obj;
                HashMap hashMap = u8Var.H;
                int i13 = l8Var.e;
                int i14 = l8Var.f;
                long j3 = l8Var.d;
                if (i13 != 0 || i14 <= 0) {
                    HashMap hashMap2 = u8Var.G[i13];
                    if (hashMap2 != null) {
                        hashMap2.remove(Long.valueOf(j3));
                        break;
                    }
                } else {
                    HashMap hashMap3 = (HashMap) hashMap.get(Long.valueOf(j3));
                    if (hashMap3 != null) {
                        hashMap3.remove(Integer.valueOf(i14));
                        if (hashMap3.isEmpty()) {
                            hashMap.remove(Long.valueOf(j3));
                            break;
                        }
                    }
                }
                break;
            case 4:
                ci.y yVar = (ci.y) this.b;
                String str = (String) obj;
                ArrayList arrayList = yVar.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    yVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new s8(18, yVar, str), 120L);
                break;
            case 5:
                ((di.m) this.b).x(((Integer) obj).intValue());
                break;
            case 6:
                di.e0 e0Var = (di.e0) this.b;
                e0Var.j0.n.P = ((Float) obj).floatValue();
                di.d0 d0Var = e0Var.j0;
                di.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 7:
                di.r0 r0Var = (di.r0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.c);
                    break;
                }
                break;
            case 8:
                di.y2 y2Var = (di.y2) this.b;
                y2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new s8(25, y2Var, (Runnable) obj), 80L);
                break;
            case 9:
                ((di.x3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 10:
                di.rb rbVar = (di.rb) ((di.q6) this.b);
                pc pcVar = rbVar.A2;
                pcVar.X0.q((MessageObject) obj);
                di.o8 o8Var = pcVar.K1;
                if (o8Var != null && pcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(o8Var.y);
                    boolean z11 = !isEmpty;
                    ((fg0) pcVar.j1.c).a(!pcVar.X0.k(), false);
                    pcVar.j1.setVisibility(0);
                    pcVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new ah.u(6, rbVar, z11)).start();
                }
                if (pcVar.A0.j()) {
                    ArrayList arrayList2 = pcVar.A0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            di.o8 o8Var2 = ((di.d0) obj2).n;
                            if (o8Var2 != null && o8Var2.K) {
                                i10 = TextUtils.isEmpty(pcVar.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                pcVar.l0(i10, true, true);
                break;
            case 11:
                di.n8 n8Var = (di.n8) obj;
                u61 u61Var = ((di.d7) this.b).n;
                if (u61Var != null) {
                    u61Var.setHDRInfo(n8Var);
                    break;
                }
                break;
            case 12:
                di.x8 x8Var = (di.x8) this.b;
                rg.p0 p0Var = (rg.p0) obj;
                if (p0Var == null) {
                    x8Var.U();
                    break;
                } else {
                    x8Var.o0 = p0Var.e;
                    x8Var.n0 = p0Var.f;
                    break;
                }
            case 13:
                ((di.x9) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 14:
                ((di.jb) this.b).g((Utilities.Callback) obj);
                break;
            case 15:
                fi.u uVar = (fi.u) this.b;
                ArrayList arrayList3 = uVar.b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                d61 d61Var = uVar.a;
                if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                    v51Var.N(true);
                    break;
                }
                break;
            case 16:
                gi.f fVar = (gi.f) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = fVar.h;
                boolean z12 = arrayList5 == null || arrayList5.isEmpty();
                fVar.h = arrayList4;
                d61 d61Var2 = fVar.e;
                if (d61Var2 != null) {
                    d61Var2.Y2.N(z12);
                    break;
                }
                break;
            case 17:
                ((hg.m) this.b).L((TLRPC.User) obj);
                break;
            case 18:
                TLRPC.User user = (TLRPC.User) obj;
                rn0 rn0Var = (rn0) ((hg.i0) this.b);
                ey eyVar = rn0Var.K0;
                if (user != null) {
                    uy uyVar = eyVar.J0;
                    if (uyVar != null) {
                        uyVar.K3();
                    }
                    MessagesController.getInstance(eyVar.H0).openApp(user, 0);
                    rn0Var.R(user.id, user);
                    break;
                }
                break;
            case 19:
                ig.m mVar = (ig.m) this.b;
                boolean z13 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (mVar.F != z13) {
                    mVar.F = z13;
                    if (!z13) {
                        mVar.a.x0(0);
                        break;
                    }
                }
                break;
            case 20:
                AndroidUtilities.forEachViews((RecyclerView) ((ig.i0) this.b).s, (e2.h) new f(i11));
                break;
            case 21:
                ig.u0 u0Var = (ig.u0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                u0Var.G = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : u0Var.G.connected_bots.get(0);
                u0Var.H = tL_connectedBot;
                u0Var.M = tL_connectedBot == null ? null : u0Var.getMessagesController().getUser(Long.valueOf(u0Var.H.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = u0Var.H;
                u0Var.J = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = u0Var.H;
                u0Var.I = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                ig.a0 a0Var = u0Var.v;
                if (a0Var != null) {
                    a0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                d61 d61Var3 = u0Var.c;
                if (d61Var3 == null || (v51Var2 = d61Var3.Y2) == null) {
                    z10 = true;
                } else {
                    z10 = true;
                    v51Var2.N(true);
                }
                u0Var.Y(z10);
                u0Var.T = z10;
                break;
            case 22:
                ig.w0 w0Var = (ig.w0) this.b;
                w0Var.w = w0Var.e[((Integer) obj).intValue()];
                w0Var.V(true);
                break;
            case 23:
                ig.y1 y1Var = (ig.y1) this.b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                co coVar = new co(bundle);
                coVar.C9 = true;
                y1Var.presentFragment(coVar);
                break;
            case 24:
                AndroidUtilities.hideKeyboard((ig.r1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 25:
                ji.m3 m3Var = (ji.m3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i15 = m3Var.b;
                int i16 = m3Var.a;
                ji.v3 v3Var = m3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList6 = v3Var.l3;
                    ArrayList arrayList7 = v3Var.l3;
                    if (i16 < arrayList6.size() && i15 < arrayList7.size()) {
                        ji.g2 g2Var = v3Var.J3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        ji.i3 i3Var = v3Var.n3;
                        if (i3Var != null) {
                            i3Var.f(false);
                        }
                        ji.a aVar = (ji.a) arrayList7.get(i16);
                        ji.a aVar2 = (ji.a) arrayList7.get(i15);
                        String L4 = ji.v3.z3(aVar.b) ? v3Var.L4(aVar) : "";
                        CharSequence L42 = ji.v3.z3(aVar2.b) ? v3Var.L4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L4.subSequence(0, Math.max(0, Math.min(m3Var.c, L4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L42.subSequence(Math.max(0, Math.min(m3Var.d, L42.length())), L42.length()));
                        ArrayList arrayList8 = new ArrayList();
                        ji.v3.V2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ji.g6.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new ji.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ji.a aVar3 = (ji.a) arrayList8.get(0);
                                if (ji.v3.z3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ji.g6.A(aVar3.b));
                                    ji.g6.e(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ji.g6.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new ji.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ji.a aVar4 = (ji.a) i2.g.h(1, arrayList8);
                                if (ji.v3.z3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ji.g6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ji.g6.e(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ji.g6.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new ji.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = v3Var.k3;
                        if (richMessage2 == null) {
                            v3Var.k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                v3Var.k3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i17 = 0; i17 < arrayList8.size(); i17++) {
                            v3Var.u4((ji.a) arrayList8.get(i17));
                        }
                        while (i15 >= i16) {
                            arrayList7.remove(i15);
                            i15--;
                        }
                        arrayList7.addAll(i16, arrayList8);
                        v3Var.r4();
                        v3Var.Y2.N(false);
                        ji.g2 g2Var2 = v3Var.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        v3Var.h3.onContentChanged();
                        v3Var.post(new fi.j4(29, m3Var, arrayList8.isEmpty() ? null : (ji.a) i2.g.h(1, arrayList8)));
                        break;
                    }
                }
                break;
            case 26:
                ((ji.m) this.b).a.r.T1((TL_iv.RichMessage) obj);
                break;
            case 27:
                ((ji.c2) this.b).P.T1((TL_iv.RichMessage) obj);
                break;
            case 28:
                ji.v3 v3Var2 = (ji.v3) this.b;
                String str2 = (String) obj;
                v3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    v3Var2.Q1(pageblockmath);
                    break;
                }
                break;
            default:
                AndroidUtilities.hideKeyboard((zt) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
        }
    }
}
