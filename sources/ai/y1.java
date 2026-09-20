package ai;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.ey;
import org.telegram.ui.uy;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        k61 k61Var;
        boolean z10;
        k61 k61Var2;
        int i11 = 3;
        int i12 = 5;
        int i13 = 0;
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.b;
                if (((Boolean) obj).booleanValue() && !d2Var.w) {
                    d2Var.n = true;
                    d2Var.I = true;
                    d2Var.u(false);
                    d2.W = d2Var;
                    d2Var.J = NativeInstance.createVideoCapturer(d2Var.H, d2Var.I ? 1 : 0);
                    if (d2Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = d2Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                        d2Var.M.clear();
                        d2Var.E = null;
                    }
                    d2Var.c();
                    d2Var.k();
                    NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.f.id));
                    break;
                }
                break;
            case 1:
                f6 f6Var = (f6) this.b;
                f6Var.L3 = ((Long) obj).longValue();
                a4 a4Var = f6Var.b2;
                if (a4Var != null) {
                    a4Var.K(true);
                    f6Var.b2.R1();
                }
                f6Var.r0(true);
                break;
            case 2:
                jc jcVar = (jc) this.b;
                jcVar.k1 = false;
                jcVar.P();
                break;
            case 3:
                l9 l9Var = (l9) this.b;
                d9 d9Var = (d9) obj;
                HashMap hashMap = l9Var.H;
                int i14 = d9Var.e;
                int i15 = d9Var.f;
                long j3 = d9Var.d;
                if (i14 != 0 || i15 <= 0) {
                    HashMap hashMap2 = l9Var.G[i14];
                    if (hashMap2 != null) {
                        hashMap2.remove(Long.valueOf(j3));
                        break;
                    }
                } else {
                    HashMap hashMap3 = (HashMap) hashMap.get(Long.valueOf(j3));
                    if (hashMap3 != null) {
                        hashMap3.remove(Integer.valueOf(i15));
                        if (hashMap3.isEmpty()) {
                            hashMap.remove(Long.valueOf(j3));
                            break;
                        }
                    }
                }
                break;
            case 4:
                bi.z zVar = (bi.z) this.b;
                String str = (String) obj;
                ArrayList arrayList = zVar.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    zVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ba(7, zVar, str), 120L);
                break;
            case 5:
                ((ci.m) this.b).x(((Integer) obj).intValue());
                break;
            case 6:
                ci.e0 e0Var = (ci.e0) this.b;
                e0Var.j0.n.P = ((Float) obj).floatValue();
                ci.d0 d0Var = e0Var.j0;
                ci.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 7:
                ci.r0 r0Var = (ci.r0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.c);
                    break;
                }
                break;
            case 8:
                ci.y2 y2Var = (ci.y2) this.b;
                y2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ba(16, y2Var, (Runnable) obj), 80L);
                break;
            case 9:
                ((ci.x3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 10:
                ci.qb qbVar = (ci.qb) ((ci.r6) this.b);
                ci.oc ocVar = qbVar.A2;
                ocVar.X0.q((MessageObject) obj);
                ci.o8 o8Var = ocVar.K1;
                if (o8Var != null && ocVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(o8Var.y);
                    boolean z11 = !isEmpty;
                    ((pg0) ocVar.j1.c).a(!ocVar.X0.k(), false);
                    ocVar.j1.setVisibility(0);
                    ocVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new bi.f(i12, qbVar, z11)).start();
                }
                if (ocVar.A0.j()) {
                    ArrayList arrayList2 = ocVar.A0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i13 < size) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            ci.o8 o8Var2 = ((ci.d0) obj2).n;
                            if (o8Var2 != null && o8Var2.K) {
                                i10 = TextUtils.isEmpty(ocVar.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                ocVar.l0(i10, true, true);
                break;
            case 11:
                ci.n8 n8Var = (ci.n8) obj;
                i71 i71Var = ((ci.d7) this.b).n;
                if (i71Var != null) {
                    i71Var.setHDRInfo(n8Var);
                    break;
                }
                break;
            case 12:
                ci.x8 x8Var = (ci.x8) this.b;
                qg.o0 o0Var = (qg.o0) obj;
                if (o0Var == null) {
                    x8Var.U();
                    break;
                } else {
                    x8Var.o0 = o0Var.e;
                    x8Var.n0 = o0Var.f;
                    break;
                }
            case 13:
                ((ci.x9) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 14:
                ((ci.jb) this.b).g((Utilities.Callback) obj);
                break;
            case 15:
                ei.u uVar = (ei.u) this.b;
                ArrayList arrayList3 = uVar.b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                s61 s61Var = uVar.a;
                if (s61Var != null && (k61Var = s61Var.Y2) != null) {
                    k61Var.N(true);
                    break;
                }
                break;
            case 16:
                fi.f fVar = (fi.f) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = fVar.h;
                boolean z12 = arrayList5 == null || arrayList5.isEmpty();
                fVar.h = arrayList4;
                s61 s61Var2 = fVar.e;
                if (s61Var2 != null) {
                    s61Var2.Y2.N(z12);
                    break;
                }
                break;
            case 17:
                ((gg.m) this.b).L((TLRPC.User) obj);
                break;
            case 18:
                TLRPC.User user = (TLRPC.User) obj;
                eo0 eo0Var = (eo0) ((gg.i0) this.b);
                ey eyVar = eo0Var.K0;
                if (user != null) {
                    uy uyVar = eyVar.K0;
                    if (uyVar != null) {
                        uyVar.K3();
                    }
                    MessagesController.getInstance(eyVar.I0).openApp(user, 0);
                    eo0Var.R(user.id, user);
                    break;
                }
                break;
            case 19:
                hg.m mVar = (hg.m) this.b;
                boolean z13 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (mVar.G != z13) {
                    mVar.G = z13;
                    if (!z13) {
                        mVar.a.y0(0);
                        break;
                    }
                }
                break;
            case 20:
                AndroidUtilities.forEachViews((RecyclerView) ((hg.i0) this.b).s, (e2.h) new i(i11));
                break;
            case 21:
                hg.u0 u0Var = (hg.u0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                u0Var.G = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : u0Var.G.connected_bots.get(0);
                u0Var.H = tL_connectedBot;
                u0Var.M = tL_connectedBot == null ? null : u0Var.getMessagesController().getUser(Long.valueOf(u0Var.H.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = u0Var.H;
                u0Var.J = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = u0Var.H;
                u0Var.I = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                hg.a0 a0Var = u0Var.v;
                if (a0Var != null) {
                    a0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                s61 s61Var3 = u0Var.c;
                if (s61Var3 == null || (k61Var2 = s61Var3.Y2) == null) {
                    z10 = true;
                } else {
                    z10 = true;
                    k61Var2.N(true);
                }
                u0Var.Y(z10);
                u0Var.T = z10;
                break;
            case 22:
                hg.w0 w0Var = (hg.w0) this.b;
                w0Var.w = w0Var.e[((Integer) obj).intValue()];
                w0Var.V(true);
                break;
            case 23:
                hg.y1 y1Var = (hg.y1) this.b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                zn znVar = new zn(bundle);
                znVar.C9 = true;
                y1Var.presentFragment(znVar);
                break;
            case 24:
                AndroidUtilities.hideKeyboard((hg.r1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 25:
                ii.n3 n3Var = (ii.n3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i16 = n3Var.b;
                int i17 = n3Var.a;
                ii.w3 w3Var = n3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList6 = w3Var.l3;
                    ArrayList arrayList7 = w3Var.l3;
                    if (i17 < arrayList6.size() && i16 < arrayList7.size()) {
                        ii.h2 h2Var = w3Var.J3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ii.j3 j3Var = w3Var.n3;
                        if (j3Var != null) {
                            j3Var.f(false);
                        }
                        ii.a aVar = (ii.a) arrayList7.get(i17);
                        ii.a aVar2 = (ii.a) arrayList7.get(i16);
                        String N4 = ii.w3.B3(aVar.b) ? w3Var.N4(aVar) : "";
                        CharSequence N42 = ii.w3.B3(aVar2.b) ? w3Var.N4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N4.subSequence(0, Math.max(0, Math.min(n3Var.c, N4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(N42.subSequence(Math.max(0, Math.min(n3Var.d, N42.length())), N42.length()));
                        ArrayList arrayList8 = new ArrayList();
                        ii.w3.X2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.d6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new ii.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar3 = (ii.a) arrayList8.get(0);
                                if (ii.w3.B3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.d6.A(aVar3.b));
                                    ii.d6.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.d6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new ii.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar4 = (ii.a) hg.k0.g(1, arrayList8);
                                if (ii.w3.B3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.d6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.d6.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.d6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new ii.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = w3Var.k3;
                        if (richMessage2 == null) {
                            w3Var.k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                w3Var.k3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
                            w3Var.w4((ii.a) arrayList8.get(i18));
                        }
                        while (i16 >= i17) {
                            arrayList7.remove(i16);
                            i16--;
                        }
                        arrayList7.addAll(i17, arrayList8);
                        w3Var.t4();
                        w3Var.Y2.N(false);
                        ii.h2 h2Var2 = w3Var.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.h3.onContentChanged();
                        w3Var.post(new gg.x1(16, n3Var, arrayList8.isEmpty() ? null : (ii.a) hg.k0.g(1, arrayList8)));
                        break;
                    }
                }
                break;
            case 26:
                ((ii.m) this.b).a.r.V1((TL_iv.RichMessage) obj);
                break;
            case 27:
                ((ii.d2) this.b).P.V1((TL_iv.RichMessage) obj);
                break;
            case 28:
                ii.w3 w3Var2 = (ii.w3) this.b;
                String str2 = (String) obj;
                w3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    w3Var2.S1(pageblockmath);
                    break;
                }
                break;
            default:
                AndroidUtilities.hideKeyboard((bu) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
        }
    }
}
