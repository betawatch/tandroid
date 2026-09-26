package ai;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.qy;
import org.telegram.ui.wn;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        String str;
        int i10;
        j61 j61Var;
        boolean z10;
        j61 j61Var2;
        int i11 = 3;
        int i12 = 5;
        int i13 = 0;
        int i14 = 0;
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
                jc jcVar = (jc) this.b;
                jcVar.k1 = false;
                jcVar.P();
                break;
            case 2:
                k7 k7Var = (k7) obj;
                s7 s7Var = ((p7) this.b).e;
                while (true) {
                    ArrayList arrayList = s7Var.G;
                    if (i13 >= arrayList.size()) {
                        break;
                    } else {
                        if (k7Var != arrayList.get(i13)) {
                            ((k7) arrayList.get(i13)).getClass();
                        }
                        i13++;
                    }
                }
            case 3:
                sa saVar = (sa) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                saVar.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    saVar.m = true;
                    saVar.l = str;
                    saVar.f = TextUtils.isEmpty(str);
                    View view = saVar.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = saVar.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 4:
                bi.z zVar = (bi.z) this.b;
                String str2 = (String) obj;
                ArrayList arrayList2 = zVar.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    zVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ba(7, zVar, str2), 120L);
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
                ci.x2 x2Var = (ci.x2) this.b;
                x2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ba(16, x2Var, (Runnable) obj), 80L);
                break;
            case 9:
                ((ci.w3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 10:
                ci.t4 t4Var = (ci.t4) this.b;
                View view2 = (View) obj;
                ci.o4 o4Var = t4Var.b;
                if (view2 instanceof ci.s4) {
                    o4Var.getClass();
                    int R = RecyclerView.R(view2);
                    v51 G = o4Var.Y2.G(R);
                    if (G != null) {
                        ci.s4 s4Var = (ci.s4) view2;
                        s4Var.setPosition(t4Var.b(R));
                        s4Var.b(t4Var.f == G.d, true);
                        boolean contains = t4Var.e.contains(Integer.valueOf(G.d));
                        if (s4Var.f != contains) {
                            s4Var.f = contains;
                            s4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 11:
                ci.o4 o4Var2 = (ci.o4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof ci.s4) {
                    ci.cb cbVar = o4Var2.f3;
                    cbVar.b.getClass();
                    ((ci.s4) view3).setPosition(cbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 12:
                ci.nb nbVar = (ci.nb) ((ci.q6) this.b);
                ci.lc lcVar = nbVar.A2;
                lcVar.X0.q((MessageObject) obj);
                ci.l8 l8Var = lcVar.K1;
                if (l8Var != null && lcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(l8Var.y);
                    boolean z11 = !isEmpty;
                    ((pg0) lcVar.j1.c).a(!lcVar.X0.k(), false);
                    lcVar.j1.setVisibility(0);
                    lcVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new bi.f(i12, nbVar, z11)).start();
                }
                if (lcVar.A0.j()) {
                    ArrayList arrayList3 = lcVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i14 < size) {
                            Object obj2 = arrayList3.get(i14);
                            i14++;
                            ci.l8 l8Var2 = ((ci.d0) obj2).n;
                            if (l8Var2 != null && l8Var2.K) {
                                i10 = TextUtils.isEmpty(lcVar.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                lcVar.l0(i10, true, true);
                break;
            case 13:
                ci.k8 k8Var = (ci.k8) obj;
                i71 i71Var = ((ci.b7) this.b).n;
                if (i71Var != null) {
                    i71Var.setHDRInfo(k8Var);
                    break;
                }
                break;
            case 14:
                ci.d8.S((ci.d8) this.b, (Long) obj);
                break;
            case 15:
                ci.u8 u8Var = (ci.u8) this.b;
                qg.o0 o0Var = (qg.o0) obj;
                if (o0Var == null) {
                    u8Var.U();
                    break;
                } else {
                    u8Var.o0 = o0Var.e;
                    u8Var.n0 = o0Var.f;
                    break;
                }
            case 16:
                ((ci.u9) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 17:
                ((ci.gb) this.b).g((Utilities.Callback) obj);
                break;
            case 18:
                ei.u uVar = (ei.u) this.b;
                ArrayList arrayList4 = uVar.b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                r61 r61Var = uVar.a;
                if (r61Var != null && (j61Var = r61Var.Y2) != null) {
                    j61Var.N(true);
                    break;
                }
                break;
            case 19:
                fi.f fVar = (fi.f) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                boolean z12 = arrayList6 == null || arrayList6.isEmpty();
                fVar.h = arrayList5;
                r61 r61Var2 = fVar.e;
                if (r61Var2 != null) {
                    r61Var2.Y2.N(z12);
                    break;
                }
                break;
            case 20:
                ((gg.m) this.b).L((TLRPC.User) obj);
                break;
            case 21:
                TLRPC.User user = (TLRPC.User) obj;
                eo0 eo0Var = (eo0) ((gg.i0) this.b);
                zx zxVar = eo0Var.K0;
                if (user != null) {
                    qy qyVar = zxVar.J0;
                    if (qyVar != null) {
                        qyVar.K3();
                    }
                    MessagesController.getInstance(zxVar.H0).openApp(user, 0);
                    eo0Var.R(user.id, user);
                    break;
                }
                break;
            case 22:
                hg.n nVar = (hg.n) this.b;
                boolean z13 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (nVar.F != z13) {
                    nVar.F = z13;
                    if (!z13) {
                        nVar.a.x0(0);
                        break;
                    }
                }
                break;
            case 23:
                AndroidUtilities.forEachViews((RecyclerView) ((hg.k0) this.b).s, (Utilities.Callback<View>) new i(i11));
                break;
            case 24:
                hg.v0 v0Var = (hg.v0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                v0Var.G = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : v0Var.G.connected_bots.get(0);
                v0Var.H = tL_connectedBot;
                v0Var.M = tL_connectedBot == null ? null : v0Var.getMessagesController().getUser(Long.valueOf(v0Var.H.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = v0Var.H;
                v0Var.J = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = v0Var.H;
                v0Var.I = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                hg.c0 c0Var2 = v0Var.v;
                if (c0Var2 != null) {
                    c0Var2.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                r61 r61Var3 = v0Var.c;
                if (r61Var3 == null || (j61Var2 = r61Var3.Y2) == null) {
                    z10 = true;
                } else {
                    z10 = true;
                    j61Var2.N(true);
                }
                v0Var.Y(z10);
                v0Var.T = z10;
                break;
            case 25:
                hg.x0 x0Var = (hg.x0) this.b;
                x0Var.w = x0Var.e[((Integer) obj).intValue()];
                x0Var.V(true);
                break;
            case 26:
                hg.z1 z1Var = (hg.z1) this.b;
                z1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                wn wnVar = new wn(bundle);
                wnVar.C9 = true;
                z1Var.presentFragment(wnVar);
                break;
            case 27:
                AndroidUtilities.hideKeyboard((hg.s1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 28:
                ii.o3 o3Var = (ii.o3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i15 = o3Var.b;
                int i16 = o3Var.a;
                ii.x3 x3Var = o3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList7 = x3Var.l3;
                    ArrayList arrayList8 = x3Var.l3;
                    if (i16 < arrayList7.size() && i15 < arrayList8.size()) {
                        ii.i2 i2Var = x3Var.J3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ii.k3 k3Var = x3Var.n3;
                        if (k3Var != null) {
                            k3Var.f(false);
                        }
                        ii.a aVar = (ii.a) arrayList8.get(i16);
                        ii.a aVar2 = (ii.a) arrayList8.get(i15);
                        String M4 = ii.x3.A3(aVar.b) ? x3Var.M4(aVar) : "";
                        CharSequence M42 = ii.x3.A3(aVar2.b) ? x3Var.M4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M4.subSequence(0, Math.max(0, Math.min(o3Var.c, M4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M42.subSequence(Math.max(0, Math.min(o3Var.d, M42.length())), M42.length()));
                        ArrayList arrayList9 = new ArrayList();
                        ii.x3.W2(arrayList9, richMessage.blocks, null);
                        if (arrayList9.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.e6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList9.add(new ii.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar3 = (ii.a) arrayList9.get(0);
                                if (ii.x3.A3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.e6.A(aVar3.b));
                                    ii.e6.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.e6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList9.add(0, new ii.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar4 = (ii.a) hg.c.g(1, arrayList9);
                                if (ii.x3.A3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.e6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.e6.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.e6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList9.add(new ii.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = x3Var.k3;
                        if (richMessage2 == null) {
                            x3Var.k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList10 = richMessage.photos;
                            if (arrayList10 != null) {
                                richMessage2.photos.addAll(arrayList10);
                            }
                            ArrayList<TLRPC.Document> arrayList11 = richMessage.documents;
                            if (arrayList11 != null) {
                                x3Var.k3.documents.addAll(arrayList11);
                            }
                        }
                        for (int i17 = 0; i17 < arrayList9.size(); i17++) {
                            x3Var.v4((ii.a) arrayList9.get(i17));
                        }
                        while (i15 >= i16) {
                            arrayList8.remove(i15);
                            i15--;
                        }
                        arrayList8.addAll(i16, arrayList9);
                        x3Var.s4();
                        x3Var.Y2.N(false);
                        ii.i2 i2Var2 = x3Var.J3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.h3.onContentChanged();
                        x3Var.post(new gg.x1(16, o3Var, arrayList9.isEmpty() ? null : (ii.a) hg.c.g(1, arrayList9)));
                        break;
                    }
                }
                break;
            default:
                ((ii.m) this.b).a.r.U1((TL_iv.RichMessage) obj);
                break;
        }
    }
}
