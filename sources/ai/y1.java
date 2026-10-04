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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.dy;
import org.telegram.ui.uy;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        u61 u61Var;
        boolean z10;
        u61 u61Var2;
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
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance, 3));
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
                ((ci.w3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 10:
                ci.t4 t4Var = (ci.t4) this.b;
                View view2 = (View) obj;
                ci.o4 o4Var = t4Var.b;
                if (view2 instanceof ci.s4) {
                    o4Var.getClass();
                    int R = RecyclerView.R(view2);
                    g61 G = o4Var.f3.G(R);
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
                    ci.bb bbVar = o4Var2.m3;
                    bbVar.b.getClass();
                    ((ci.s4) view3).setPosition(bbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 12:
                ci.mb mbVar = (ci.mb) ((ci.q6) this.b);
                ci.kc kcVar = mbVar.A2;
                kcVar.X0.q((MessageObject) obj);
                ci.k8 k8Var = kcVar.K1;
                if (k8Var != null && kcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(k8Var.y);
                    boolean z11 = !isEmpty;
                    ((sg0) kcVar.j1.c).a(!kcVar.X0.k(), false);
                    kcVar.j1.setVisibility(0);
                    kcVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new bi.f(i12, mbVar, z11)).start();
                }
                if (kcVar.A0.j()) {
                    ArrayList arrayList3 = kcVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i14 < size) {
                            Object obj2 = arrayList3.get(i14);
                            i14++;
                            ci.k8 k8Var2 = ((ci.d0) obj2).n;
                            if (k8Var2 != null && k8Var2.K) {
                                i10 = TextUtils.isEmpty(kcVar.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                kcVar.l0(i10, true, true);
                break;
            case 13:
                ci.j8 j8Var = (ci.j8) obj;
                t71 t71Var = ((ci.b7) this.b).n;
                if (t71Var != null) {
                    t71Var.setHDRInfo(j8Var);
                    break;
                }
                break;
            case 14:
                ci.c8.N((ci.c8) this.b, (Long) obj);
                break;
            case 15:
                ci.t8 t8Var = (ci.t8) this.b;
                qg.n0 n0Var = (qg.n0) obj;
                if (n0Var == null) {
                    t8Var.S();
                    break;
                } else {
                    t8Var.o0 = n0Var.e;
                    t8Var.n0 = n0Var.f;
                    break;
                }
            case 16:
                ((ci.t9) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 17:
                ((ci.fb) this.b).g((Utilities.Callback) obj);
                break;
            case 18:
                ei.v vVar = (ei.v) this.b;
                ArrayList arrayList4 = vVar.b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                c71 c71Var = vVar.a;
                if (c71Var != null && (u61Var = c71Var.f3) != null) {
                    u61Var.N(true);
                    break;
                }
                break;
            case 19:
                fi.f fVar = (fi.f) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                boolean z12 = arrayList6 == null || arrayList6.isEmpty();
                fVar.h = arrayList5;
                c71 c71Var2 = fVar.e;
                if (c71Var2 != null) {
                    c71Var2.f3.N(z12);
                    break;
                }
                break;
            case 20:
                ((gg.m) this.b).L((TLRPC.User) obj);
                break;
            case 21:
                TLRPC.User user = (TLRPC.User) obj;
                jo0 jo0Var = (jo0) ((gg.i0) this.b);
                dy dyVar = jo0Var.K0;
                if (user != null) {
                    uy uyVar = dyVar.K0;
                    if (uyVar != null) {
                        uyVar.T3();
                    }
                    MessagesController.getInstance(dyVar.I0).openApp(user, 0);
                    jo0Var.R(user.id, user);
                    break;
                }
                break;
            case 22:
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
            case 23:
                AndroidUtilities.forEachViews((RecyclerView) ((hg.i0) this.b).s, (Utilities.Callback<View>) new i(i11));
                break;
            case 24:
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
                c71 c71Var3 = u0Var.c;
                if (c71Var3 == null || (u61Var2 = c71Var3.f3) == null) {
                    z10 = true;
                } else {
                    z10 = true;
                    u61Var2.N(true);
                }
                u0Var.X(z10);
                u0Var.T = z10;
                break;
            case 25:
                hg.w0 w0Var = (hg.w0) this.b;
                w0Var.w = w0Var.e[((Integer) obj).intValue()];
                w0Var.T(true);
                break;
            case 26:
                hg.y1 y1Var = (hg.y1) this.b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                yn ynVar = new yn(bundle);
                ynVar.A9 = true;
                y1Var.presentFragment(ynVar);
                break;
            case 27:
                AndroidUtilities.hideKeyboard((hg.r1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 28:
                ii.o3 o3Var = (ii.o3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i15 = o3Var.b;
                int i16 = o3Var.a;
                ii.x3 x3Var = o3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList7 = x3Var.s3;
                    ArrayList arrayList8 = x3Var.s3;
                    if (i16 < arrayList7.size() && i15 < arrayList8.size()) {
                        ii.i2 i2Var = x3Var.Q3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ii.k3 k3Var = x3Var.u3;
                        if (k3Var != null) {
                            k3Var.f(false);
                        }
                        ii.a aVar = (ii.a) arrayList8.get(i16);
                        ii.a aVar2 = (ii.a) arrayList8.get(i15);
                        String O4 = ii.x3.C3(aVar.b) ? x3Var.O4(aVar) : "";
                        CharSequence O42 = ii.x3.C3(aVar2.b) ? x3Var.O4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O4.subSequence(0, Math.max(0, Math.min(o3Var.c, O4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(O42.subSequence(Math.max(0, Math.min(o3Var.d, O42.length())), O42.length()));
                        ArrayList arrayList9 = new ArrayList();
                        ii.x3.Y2(arrayList9, richMessage.blocks, null);
                        if (arrayList9.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.f6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList9.add(new ii.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar3 = (ii.a) arrayList9.get(0);
                                if (ii.x3.C3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.f6.A(aVar3.b));
                                    ii.f6.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.f6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList9.add(0, new ii.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar4 = (ii.a) hg.k0.g(1, arrayList9);
                                if (ii.x3.C3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.f6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.f6.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.f6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList9.add(new ii.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = x3Var.r3;
                        if (richMessage2 == null) {
                            x3Var.r3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList10 = richMessage.photos;
                            if (arrayList10 != null) {
                                richMessage2.photos.addAll(arrayList10);
                            }
                            ArrayList<TLRPC.Document> arrayList11 = richMessage.documents;
                            if (arrayList11 != null) {
                                x3Var.r3.documents.addAll(arrayList11);
                            }
                        }
                        for (int i17 = 0; i17 < arrayList9.size(); i17++) {
                            x3Var.x4((ii.a) arrayList9.get(i17));
                        }
                        while (i15 >= i16) {
                            arrayList8.remove(i15);
                            i15--;
                        }
                        arrayList8.addAll(i16, arrayList9);
                        x3Var.u4();
                        x3Var.f3.N(false);
                        ii.i2 i2Var2 = x3Var.Q3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.o3.onContentChanged();
                        x3Var.post(new gg.x1(16, o3Var, arrayList9.isEmpty() ? null : (ii.a) hg.k0.g(1, arrayList9)));
                        break;
                    }
                }
                break;
            default:
                ((ii.m) this.b).a.r.W1((TL_iv.RichMessage) obj);
                break;
        }
    }
}
