package bi;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.kc;
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
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.z61;
import org.telegram.ui.fo;
import org.telegram.ui.iy;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        String str;
        int i10;
        z61 z61Var;
        boolean z10;
        z61 z61Var2;
        int i11;
        int i12 = 3;
        ji.a aVar = null;
        int i13 = 0;
        int i14 = 0;
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
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.t0(nativeInstance, 3));
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
                sb sbVar = (sb) this.b;
                sbVar.k1 = false;
                sbVar.P();
                break;
            case 2:
                w6 w6Var = (w6) obj;
                e7 e7Var = ((b7) this.b).e;
                while (true) {
                    ArrayList arrayList = e7Var.G;
                    if (i13 >= arrayList.size()) {
                        break;
                    } else {
                        if (w6Var != arrayList.get(i13)) {
                            ((w6) arrayList.get(i13)).getClass();
                        }
                        i13++;
                    }
                }
            case 3:
                ca caVar = (ca) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                caVar.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    caVar.m = true;
                    caVar.l = str;
                    caVar.f = TextUtils.isEmpty(str);
                    View view = caVar.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = caVar.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 4:
                ci.y yVar = (ci.y) this.b;
                String str2 = (String) obj;
                ArrayList arrayList2 = yVar.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    yVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new u8(19, yVar, str2), 120L);
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
                di.q0 q0Var = (di.q0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = q0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(q0Var.c);
                    break;
                }
                break;
            case 8:
                di.w2 w2Var = (di.w2) this.b;
                w2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new u8(27, w2Var, (Runnable) obj), 80L);
                break;
            case 9:
                ((di.v3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 10:
                di.s4 s4Var = (di.s4) this.b;
                View view2 = (View) obj;
                di.n4 n4Var = s4Var.b;
                if (view2 instanceof di.r4) {
                    n4Var.getClass();
                    int R = RecyclerView.R(view2);
                    l61 G = n4Var.W2.G(R);
                    if (G != null) {
                        di.r4 r4Var = (di.r4) view2;
                        r4Var.setPosition(s4Var.b(R));
                        r4Var.b(s4Var.f == G.d, true);
                        boolean contains = s4Var.e.contains(Integer.valueOf(G.d));
                        if (r4Var.f != contains) {
                            r4Var.f = contains;
                            r4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 11:
                di.n4 n4Var2 = (di.n4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof di.r4) {
                    di.bb bbVar = n4Var2.d3;
                    bbVar.b.getClass();
                    ((di.r4) view3).setPosition(bbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 12:
                di.mb mbVar = (di.mb) ((di.o6) this.b);
                kc kcVar = mbVar.A2;
                kcVar.X0.q((MessageObject) obj);
                di.k8 k8Var = kcVar.K1;
                if (k8Var != null && kcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(k8Var.y);
                    boolean z11 = !isEmpty;
                    ((gh0) kcVar.j1.c).a(!kcVar.X0.k(), false);
                    kcVar.j1.setVisibility(0);
                    kcVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new ah.t(6, mbVar, z11)).start();
                }
                if (kcVar.A0.j()) {
                    ArrayList arrayList3 = kcVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i14 < size) {
                            Object obj2 = arrayList3.get(i14);
                            i14++;
                            di.k8 k8Var2 = ((di.d0) obj2).n;
                            if (k8Var2 != null && k8Var2.K) {
                                i10 = TextUtils.isEmpty(kcVar.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                kcVar.k0(i10, true, true);
                break;
            case 13:
                di.j8 j8Var = (di.j8) obj;
                x71 x71Var = ((di.a7) this.b).n;
                if (x71Var != null) {
                    x71Var.setHDRInfo(j8Var);
                    break;
                }
                break;
            case 14:
                di.c8.T((di.c8) this.b, (Long) obj);
                break;
            case 15:
                di.t8 t8Var = (di.t8) this.b;
                rg.p0 p0Var = (rg.p0) obj;
                if (p0Var == null) {
                    t8Var.V();
                    break;
                } else {
                    t8Var.o0 = p0Var.e;
                    t8Var.n0 = p0Var.f;
                    break;
                }
            case 16:
                ((di.t9) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 17:
                ((di.fb) this.b).h((Utilities.Callback) obj);
                break;
            case 18:
                fi.t tVar = (fi.t) this.b;
                ArrayList arrayList4 = tVar.b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                h71 h71Var = tVar.a;
                if (h71Var != null && (z61Var = h71Var.W2) != null) {
                    z61Var.N(true);
                    break;
                }
                break;
            case 19:
                gi.f fVar = (gi.f) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                boolean z12 = arrayList6 == null || arrayList6.isEmpty();
                fVar.h = arrayList5;
                h71 h71Var2 = fVar.e;
                if (h71Var2 != null) {
                    h71Var2.W2.N(z12);
                    break;
                }
                break;
            case 20:
                ((hg.m) this.b).L((TLRPC.User) obj);
                break;
            case 21:
                TLRPC.User user = (TLRPC.User) obj;
                so0 so0Var = (so0) ((hg.h0) this.b);
                iy iyVar = so0Var.K0;
                if (user != null) {
                    yy yyVar = iyVar.J0;
                    if (yyVar != null) {
                        yyVar.H3();
                    }
                    MessagesController.getInstance(iyVar.H0).openApp(user, 0);
                    so0Var.R(user.id, user);
                    break;
                }
                break;
            case 22:
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
            case 23:
                AndroidUtilities.forEachViews((RecyclerView) ((ig.i0) this.b).s, (Utilities.Callback<View>) new f(i12));
                break;
            case 24:
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
                h71 h71Var3 = u0Var.c;
                if (h71Var3 == null || (z61Var2 = h71Var3.W2) == null) {
                    z10 = true;
                } else {
                    z10 = true;
                    z61Var2.N(true);
                }
                u0Var.Y(z10);
                u0Var.T = z10;
                break;
            case 25:
                ig.w0 w0Var = (ig.w0) this.b;
                w0Var.w = w0Var.e[((Integer) obj).intValue()];
                w0Var.V(true);
                break;
            case 26:
                ig.y1 y1Var = (ig.y1) this.b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                fo foVar = new fo(bundle);
                foVar.C9 = true;
                y1Var.presentFragment(foVar);
                break;
            case 27:
                AndroidUtilities.hideKeyboard((ig.r1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 28:
                ji.o3 o3Var = (ji.o3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i15 = o3Var.b;
                int i16 = o3Var.a;
                ji.x3 x3Var = o3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList7 = x3Var.j3;
                    ArrayList arrayList8 = x3Var.j3;
                    if (i16 < arrayList7.size() && i15 < arrayList8.size()) {
                        ji.h2 h2Var = x3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ji.k3 k3Var = x3Var.l3;
                        if (k3Var != null) {
                            k3Var.f(false);
                        }
                        ji.a aVar2 = (ji.a) arrayList8.get(i16);
                        ji.a aVar3 = (ji.a) arrayList8.get(i15);
                        String N4 = ji.x3.B3(aVar2.b) ? x3Var.N4(aVar2) : "";
                        CharSequence N42 = ji.x3.B3(aVar3.b) ? x3Var.N4(aVar3) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N4.subSequence(0, Math.max(0, Math.min(o3Var.c, N4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(N42.subSequence(Math.max(0, Math.min(o3Var.d, N42.length())), N42.length()));
                        ArrayList arrayList9 = new ArrayList();
                        ji.x3.X2(arrayList9, richMessage.blocks, null);
                        if (arrayList9.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ji.i6.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList9.add(new ji.a(pageblockparagraph, aVar2.c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ji.a aVar4 = (ji.a) arrayList9.get(0);
                                if (ji.x3.B3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ji.i6.A(aVar4.b));
                                    ji.i6.e(aVar4.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ji.i6.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList9.add(0, new ji.a(pageblockparagraph2, aVar2.c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ji.a aVar5 = (ji.a) i2.d.g(1, arrayList9);
                                if (ji.x3.B3(aVar5.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ji.i6.A(aVar5.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ji.i6.e(aVar5.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ji.i6.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList9.add(new ji.a(pageblockparagraph3, aVar3.c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = x3Var.i3;
                        if (richMessage2 == null) {
                            x3Var.i3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList10 = richMessage.photos;
                            if (arrayList10 != null) {
                                richMessage2.photos.addAll(arrayList10);
                            }
                            ArrayList<TLRPC.Document> arrayList11 = richMessage.documents;
                            if (arrayList11 != null) {
                                x3Var.i3.documents.addAll(arrayList11);
                            }
                        }
                        for (int i17 = 0; i17 < arrayList9.size(); i17++) {
                            x3Var.w4((ji.a) arrayList9.get(i17));
                        }
                        while (i15 >= i16) {
                            arrayList8.remove(i15);
                            i15--;
                        }
                        arrayList8.addAll(i16, arrayList9);
                        x3Var.t4();
                        x3Var.W2.N(false);
                        ji.h2 h2Var2 = x3Var.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        x3Var.f3.onContentChanged();
                        if (arrayList9.isEmpty()) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            aVar = (ji.a) i2.d.g(1, arrayList9);
                        }
                        x3Var.post(new ji.v2(i11, o3Var, aVar));
                        break;
                    }
                }
                break;
            default:
                ((ji.m) this.b).a.r.V1((TL_iv.RichMessage) obj);
                break;
        }
    }
}
