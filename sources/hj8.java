// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hj8 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        b2a b2aVar = (b2a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        a2a a2aVar = b2aVar.b2;
        a2a a2aVar2 = b2aVar.a2;
        TLRPC.User user = b2aVar.T1;
        a2a a2aVar3 = b2aVar.Z1;
        if (a2aVar3 != null) {
            ArrayList arrayList2 = a2aVar3.d;
            if (a2aVar2 != null) {
                ArrayList arrayList3 = a2aVar2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(yac.h(b2aVar.a).e()));
                arrayList.add(b8c.E(3, hl.L(64.0f)));
                int i = 29;
                if (a2aVar != null && !TextUtils.isEmpty(a2aVar.c.q)) {
                    ArrayList arrayList4 = a2aVar.d;
                    int size = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList4.get(i2);
                        i2++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(wf3.d(tLObject)))) {
                            hashSet.add(Long.valueOf(wf3.d(tLObject)));
                            b8c w = b8c.w(tLObject);
                            w.L(wf3.d(tLObject) == wf3.d(b2aVar.V1));
                            arrayList.add(w);
                        }
                    }
                    if (a2aVar.f) {
                        arrayList.add(b8c.p(29));
                        arrayList.add(b8c.p(29));
                        arrayList.add(b8c.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(b8c.k(b2aVar.Y1));
                        return;
                    }
                    return;
                }
                if (user != null) {
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        Object obj4 = arrayList2.get(i3);
                        i3++;
                        if (wf3.d((TLObject) obj4) == wf3.d(user)) {
                            if (!hashSet.contains(Long.valueOf(wf3.d(user)))) {
                                arrayList.add(b8c.r(ob6.M0(xc2.V(b2aVar.S1) ? 2131752491 : 2131749253, null)));
                                hashSet.add(Long.valueOf(wf3.d(user)));
                                b8c w2 = b8c.w(user);
                                w2.L(wf3.d(user) == wf3.d(b2aVar.V1));
                                arrayList.add(w2);
                                z = false;
                            }
                        }
                    }
                }
                z = true;
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj5 = arrayList2.get(i4);
                    i4++;
                    TLObject tLObject2 = (TLObject) obj5;
                    int i5 = i;
                    if (!hashSet.contains(Long.valueOf(wf3.d(tLObject2)))) {
                        if (z) {
                            arrayList.add(b8c.r(ob6.M0(xc2.V(b2aVar.S1) ? 2131752491 : 2131749253, null)));
                            z = false;
                        }
                        hashSet.add(Long.valueOf(wf3.d(tLObject2)));
                        b8c w3 = b8c.w(tLObject2);
                        w3.L(wf3.d(tLObject2) == wf3.d(b2aVar.V1));
                        arrayList.add(w3);
                    }
                    i = i5;
                }
                int i6 = i;
                if (a2aVar3.f) {
                    arrayList.add(b8c.p(i6));
                    arrayList.add(b8c.p(i6));
                    arrayList.add(b8c.p(i6));
                }
                if (user == null || hashSet.contains(Long.valueOf(wf3.d(user)))) {
                    z2 = true;
                } else {
                    arrayList.add(b8c.r(ob6.M0(xc2.V(b2aVar.S1) ? 2131752254 : 2131749182, null)));
                    hashSet.add(Long.valueOf(wf3.d(user)));
                    b8c w4 = b8c.w(user);
                    w4.L(wf3.d(user) == wf3.d(b2aVar.V1));
                    arrayList.add(w4);
                    z2 = false;
                }
                int size4 = arrayList3.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj6 = arrayList3.get(i7);
                    i7++;
                    TLObject tLObject3 = (TLObject) obj6;
                    if (!hashSet.contains(Long.valueOf(wf3.d(tLObject3)))) {
                        if (z2) {
                            arrayList.add(b8c.r(ob6.M0(xc2.V(b2aVar.S1) ? 2131752254 : 2131749182, null)));
                            z2 = false;
                        }
                        hashSet.add(Long.valueOf(wf3.d(tLObject3)));
                        b8c w5 = b8c.w(tLObject3);
                        w5.L(wf3.d(tLObject3) == wf3.d(b2aVar.V1));
                        arrayList.add(w5);
                    }
                }
                if (arrayList3.isEmpty() || !a2aVar2.f) {
                    return;
                }
                arrayList.add(b8c.p(i6));
                arrayList.add(b8c.p(i6));
                arrayList.add(b8c.p(i6));
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        a2a a2aVar = (a2a) this.b;
        ArrayList arrayList = a2aVar.e;
        TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        int i = a2aVar.a;
        ArrayList arrayList2 = a2aVar.d;
        int i2 = 0;
        if (tL_error != null) {
            if (a2aVar.r) {
                arrayList2.clear();
                a2aVar.r = false;
            }
            a2aVar.h = true;
            a2aVar.f = false;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                ((Runnable) obj3).run();
            }
            return;
        }
        uc7.s1(i).j4(channels_channelparticipants.users, false);
        uc7.s1(i).c4(channels_channelparticipants.chats, false);
        if (a2aVar.r) {
            arrayList2.clear();
            a2aVar.r = false;
        }
        ArrayList<TLRPC.ChannelParticipant> arrayList3 = channels_channelparticipants.participants;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            TLRPC.ChannelParticipant channelParticipant = arrayList3.get(i3);
            i3++;
            TLObject b2 = uc7.s1(i).b2(wf3.n(channelParticipant.peer));
            if (b2 != null) {
                arrayList2.add(b2);
            }
        }
        if (channels_channelparticipants.participants.size() < 30) {
            a2aVar.h = true;
        }
        a2aVar.f = false;
        int size3 = arrayList.size();
        while (i2 < size3) {
            Object obj4 = arrayList.get(i2);
            i2++;
            ((Runnable) obj4).run();
        }
    }

    private final void d(Object obj, Object obj2) {
        h2a h2aVar = (h2a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        axa axaVar = h2aVar.T1;
        if (axaVar == null) {
            return;
        }
        ArrayList arrayList2 = axaVar.l;
        arrayList.add(b8c.D(hl.L(16.0f)));
        if (axaVar.i && arrayList2.isEmpty()) {
            b8c q = b8c.q(1, 34);
            q.v = 1;
            arrayList.add(q);
            b8c q2 = b8c.q(2, 34);
            q2.v = 1;
            arrayList.add(q2);
            b8c q3 = b8c.q(3, 34);
            q3.v = 1;
            arrayList.add(q3);
            b8c q4 = b8c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            b8c q5 = b8c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            b8c q6 = b8c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
            b8c q7 = b8c.q(7, 34);
            q7.v = 1;
            arrayList.add(q7);
            b8c q8 = b8c.q(8, 34);
            q8.v = 1;
            arrayList.add(q8);
            b8c q9 = b8c.q(9, 34);
            q9.v = 1;
            arrayList.add(q9);
        } else {
            int size = arrayList2.size();
            int i = 0;
            int i2 = 3;
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (!savedStarGift.collection_id.contains(Integer.valueOf(h2aVar.S1))) {
                    int i4 = rx4.b;
                    b8c K = b8c.K(rx4.class);
                    K.v = 1;
                    K.A = 0;
                    K.H = savedStarGift;
                    K.r = true;
                    K.f = true;
                    K.s = false;
                    HashSet hashSet = h2aVar.U1;
                    int i5 = savedStarGift.msg_id;
                    K.L(hashSet.contains(Long.valueOf(i5 == 0 ? savedStarGift.saved_id : i5)));
                    K.v = 1;
                    arrayList.add(K);
                    i2--;
                    if (i2 == 0) {
                        i2 = 3;
                    }
                }
            }
            if (axaVar.i || !axaVar.j) {
                while (true) {
                    if (i >= (i2 <= 0 ? 3 : i2)) {
                        break;
                    }
                    i++;
                    b8c q10 = b8c.q(i, 34);
                    q10.v = 1;
                    arrayList.add(q10);
                }
            }
        }
        arrayList.add(b8c.D(hl.L(68.0f)));
    }

    private final void e(Object obj, Object obj2) {
        TL_stories.StoryItem storyItem;
        k2a k2aVar = (k2a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i = k2aVar.W1;
        u5b u5bVar = k2aVar.U1;
        if (u5bVar == null) {
            return;
        }
        arrayList.add(b8c.D(hl.L(16.0f)));
        ArrayList arrayList2 = u5bVar.i;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i4 < size) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            r47 r47Var = (r47) obj3;
            int i5 = s7b.c;
            b8c K = b8c.K(s7b.class);
            K.v = 1;
            K.A = 0;
            K.H = r47Var;
            K.C = (r47Var == null || (storyItem = r47Var.l) == null) ? -1L : storyItem.id;
            K.f = true;
            K.w = i;
            K.L(k2aVar.V1.containsKey(Integer.valueOf(r47Var.e1())));
            K.v = 1;
            arrayList.add(K);
            i3--;
            if (i3 == 0) {
                i3 = i;
            }
        }
        if (u5bVar.k() || !u5bVar.r) {
            while (true) {
                if (i2 >= (i3 <= 0 ? i : i3)) {
                    break;
                }
                i2++;
                b8c q = b8c.q(i2, 34);
                q.v = 1;
                arrayList.add(q);
            }
        }
        arrayList.add(b8c.D(hl.L(68.0f)));
    }

    private final void f(Object obj, Object obj2) {
        gra graVar = (gra) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = graVar.Y1;
        boolean z = graVar.p2;
        ge0 ge0Var = graVar.b2;
        ArrayList arrayList3 = graVar.W1;
        ArrayList arrayList4 = graVar.V1;
        ge0 ge0Var2 = graVar.a2;
        ge0 ge0Var3 = graVar.Z1;
        ArrayList arrayList5 = graVar.X1;
        if (arrayList5 == null || arrayList4 == null || arrayList3 == null) {
            return;
        }
        arrayList.add(b8c.D(hl.L(315.0f)));
        int i = 0;
        ge0Var3.a = 0;
        ge0Var3.b();
        ge0Var2.a = 0;
        ge0Var2.b();
        ge0Var.a = 0;
        ge0Var.b();
        int i2 = graVar.e2.s;
        if (i2 == 0) {
            arrayList.add(b8c.g(hl.S2(ob6.H(',', z ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList5.size()))));
            int size = arrayList5.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList5.get(i3);
                i3++;
                arrayList.add(dra.i(i2, new cra((TL_stars.starGiftAttributeBackdrop) ge0Var3.b(), (TL_stars.starGiftAttributePattern) ge0Var2.b(), (TL_stars.starGiftAttributeModel) obj3)));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(b8c.g(hl.S2(ob6.H(',', z ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList5.size()))));
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj4 = arrayList2.get(i);
                i++;
                arrayList.add(dra.i(i2, new cra((TL_stars.starGiftAttributeBackdrop) ge0Var3.b(), (TL_stars.starGiftAttributePattern) ge0Var2.b(), (TL_stars.starGiftAttributeModel) obj4)));
            }
            return;
        }
        if (i2 == 1) {
            arrayList.add(b8c.g(hl.S2(ob6.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
            int size3 = arrayList4.size();
            while (i < size3) {
                Object obj5 = arrayList4.get(i);
                i++;
                arrayList.add(dra.i(i2, new cra((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) ge0Var2.b(), (TL_stars.starGiftAttributeModel) ge0Var.b())));
            }
            return;
        }
        if (i2 == 2) {
            arrayList.add(b8c.g(hl.S2(ob6.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
            int size4 = arrayList3.size();
            while (i < size4) {
                Object obj6 = arrayList3.get(i);
                i++;
                arrayList.add(dra.i(i2, new cra((TL_stars.starGiftAttributeBackdrop) ge0Var3.b(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) ge0Var.b())));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        zya zyaVar = (zya) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(b8c.k(zyaVar.S1));
        arrayList.add(b8c.u(ob6.M0(2131743867, null)));
        ArrayList r = jxa.v(zyaVar.a, false).r();
        if (r == null || r.isEmpty()) {
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
        } else {
            int i = 0;
            int i2 = 1;
            for (int i3 = 0; i3 < r.size(); i3++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) r.get(i3);
                if (zyaVar.X1 || !tL_starsGiftOption.extended) {
                    int i4 = i2 + 1;
                    int i5 = aza.b;
                    b8c K = b8c.K(aza.class);
                    K.d = i3;
                    K.A = i2;
                    long j = tL_starsGiftOption.stars;
                    K.C = j;
                    K.m = ob6.H(' ', "StarsCount", (int) j);
                    K.n = tL_starsGiftOption.loadingStorePrice ? null : di0.h().e(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    K.H = tL_starsGiftOption;
                    arrayList.add(K);
                    i2 = i4;
                } else {
                    i++;
                }
            }
            boolean z = zyaVar.X1;
            if (!z && i > 0) {
                String M0 = ob6.M0(z ? 2131747572 : 2131747563, null);
                boolean z2 = !zyaVar.X1;
                int i6 = wya.b;
                b8c K2 = b8c.K(wya.class);
                K2.d = -1;
                K2.m = M0;
                K2.f = z2;
                K2.r = true;
                arrayList.add(K2);
            }
        }
        arrayList.add(b8c.k(zyaVar.T1));
    }

    private final void h(Object obj, Object obj2) {
        dza dzaVar = (dza) this.b;
        ArrayList arrayList = (ArrayList) obj;
        long j = dzaVar.S1;
        dr0 dr0Var = dzaVar.T1;
        arrayList.add(b8c.m(dr0Var));
        boolean z = dzaVar.Y1;
        if (z) {
            bp1.o(2131743867, null, arrayList);
        }
        ArrayList w = jxa.v(dzaVar.a, false).w();
        if (z) {
            if (w == null || w.isEmpty()) {
                arrayList.add(b8c.p(31));
                arrayList.add(b8c.p(31));
                arrayList.add(b8c.p(31));
            } else {
                int i = 0;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 1;
                for (int i4 = 0; i4 < w.size(); i4++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                    if (tL_starsTopupOption.stars >= j) {
                        if (tL_starsTopupOption.extended && !dzaVar.a2 && z2) {
                            i2++;
                        } else {
                            arrayList.add(aza.i(i4, i3, tL_starsTopupOption));
                            i++;
                            z2 = true;
                            i3++;
                        }
                    }
                }
                if (i < 3) {
                    arrayList.clear();
                    arrayList.add(b8c.k(dr0Var));
                    arrayList.add(b8c.u(ob6.M0(2131743867, null)));
                    int i5 = 0;
                    for (int i6 = 0; i6 < w.size(); i6++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) w.get(i6);
                        if (tL_starsTopupOption2.stars >= j) {
                            arrayList.add(aza.i(i6, i3, tL_starsTopupOption2));
                            i5++;
                            i3++;
                        }
                    }
                    if (i5 == 0) {
                        int i7 = 0;
                        while (i7 < w.size()) {
                            arrayList.add(aza.i(i7, i3, (TL_stars.TL_starsTopupOption) w.get(i7)));
                            i7++;
                            i3++;
                        }
                        boolean z3 = dzaVar.a2;
                        if (!z3 && i2 > 0) {
                            String M0 = ob6.M0(z3 ? 2131747572 : 2131747563, null);
                            boolean z4 = !dzaVar.a2;
                            int i8 = wya.b;
                            b8c K = b8c.K(wya.class);
                            K.d = -1;
                            K.m = M0;
                            K.f = z4;
                            K.r = true;
                            arrayList.add(K);
                        }
                    } else {
                        dzaVar.a2 = true;
                    }
                } else if (i > 0) {
                    boolean z5 = dzaVar.a2;
                    if (!z5 && i2 > 0) {
                        String M02 = ob6.M0(z5 ? 2131747572 : 2131747563, null);
                        boolean z6 = !dzaVar.a2;
                        int i9 = wya.b;
                        b8c K2 = b8c.K(wya.class);
                        K2.d = -1;
                        K2.m = M02;
                        K2.f = z6;
                        K2.r = true;
                        arrayList.add(K2);
                    }
                } else {
                    int i10 = 0;
                    while (i10 < w.size()) {
                        arrayList.add(aza.i(i10, i3, (TL_stars.TL_starsTopupOption) w.get(i10)));
                        i10++;
                        i3++;
                    }
                }
            }
        }
        arrayList.add(b8c.k(dzaVar.U1));
    }

    private final void i(Object obj, Object obj2) {
        eza ezaVar = (eza) this.b;
        ArrayList arrayList = (ArrayList) obj;
        bp1.o(2131743867, null, arrayList);
        ArrayList w = jxa.v(ezaVar.a, false).w();
        if (w == null || w.isEmpty()) {
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
        } else {
            int i = 0;
            int i2 = 1;
            for (int i3 = 0; i3 < w.size(); i3++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i3);
                if (!tL_starsTopupOption.extended || ezaVar.U1) {
                    arrayList.add(aza.i(i3, i2, tL_starsTopupOption));
                    i2++;
                } else {
                    i++;
                }
            }
            boolean z = ezaVar.U1;
            if (!z && i > 0) {
                String M0 = ob6.M0(z ? 2131747572 : 2131747563, null);
                boolean z2 = !ezaVar.U1;
                int i4 = wya.b;
                b8c K = b8c.K(wya.class);
                K.d = -1;
                K.m = M0;
                K.f = z2;
                K.r = true;
                arrayList.add(K);
            }
        }
        arrayList.add(b8c.k(ezaVar.S1));
    }

    private final void j(Object obj, Object obj2) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        kza kzaVar = (kza) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        boolean z = kzaVar.e;
        int i3 = kzaVar.d;
        long j = kzaVar.f;
        int i4 = kzaVar.c;
        if (j != 0) {
            kt0 g = kt0.g(i4);
            ArrayList arrayList3 = g.k(j).a[i3];
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                int i6 = hza.b;
                b8c K = b8c.K(hza.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.r = true;
                arrayList2.add(K);
            }
            if (g.k(j).e[i3]) {
                return;
            }
            arrayList2.add(b8c.q(arrayList2.size(), 7));
            arrayList2.add(b8c.q(arrayList2.size(), 7));
            arrayList2.add(b8c.q(arrayList2.size(), 7));
            return;
        }
        jxa v = jxa.v(i4, z);
        ArrayList[] arrayListArr = v.q;
        if (z && z15.c(i4)) {
            if (kzaVar.n == null) {
                kzaVar.n = new k2c();
            }
            kzaVar.r = c.C(i4).x();
            ArrayList arrayList4 = arrayListArr[i3];
            k2c k2cVar = kzaVar.n;
            y15 y15Var = z15.b[i4];
            String x = c.C(i4).x();
            HashSet hashSet = k2cVar.a;
            HashSet hashSet2 = k2cVar.a;
            HashMap hashMap = k2cVar.b;
            hashSet.clear();
            hashMap.clear();
            if (x != null && !x.isEmpty()) {
                hashSet2.add(x);
            }
            hashMap.clear();
            k2cVar.b(4, new ArrayList(hashSet2));
            if (y15Var != null && y15Var.g == null && System.currentTimeMillis() - y15Var.e <= 600000 && i3 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.id = "earnings:" + y15Var.b;
                wallettransaction.pending = true;
                wallettransaction.amount = y15Var.c;
                wallettransaction.date = y15Var.d;
                wallettransaction.peer = new h2c(x);
                arrayList2.add(j2c.i(wallettransaction, k2cVar));
            }
            HashSet e = z15.e(i4);
            int size2 = arrayList4.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj4 = arrayList4.get(i7);
                i7++;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) obj4;
                String str2 = starsTransaction.id;
                if (str2 == null || ((!e.contains(str2) && (y15Var == null || !starsTransaction.id.equals(y15Var.g))) || starsTransaction.amount == null)) {
                    arrayList = arrayList4;
                    i2 = i3;
                    int i8 = hza.b;
                    b8c K2 = b8c.K(hza.class);
                    K2.H = starsTransaction;
                    K2.r = false;
                    arrayList2.add(K2);
                } else {
                    TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                    StringBuilder sb = new StringBuilder("earnings:");
                    if (y15Var != null) {
                        arrayList = arrayList4;
                        if (starsTransaction.id.equals(y15Var.g)) {
                            str = y15Var.b;
                            sb.append(str);
                            wallettransaction2.id = sb.toString();
                            wallettransaction2.pending = (starsTransaction.pending || starsTransaction.failed) ? false : true;
                            wallettransaction2.failed = starsTransaction.failed;
                            i2 = i3;
                            wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                            wallettransaction2.date = starsTransaction.date;
                            wallettransaction2.peer = new h2c(x);
                            arrayList2.add(j2c.i(wallettransaction2, k2cVar));
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    str = starsTransaction.id;
                    sb.append(str);
                    wallettransaction2.id = sb.toString();
                    wallettransaction2.pending = (starsTransaction.pending || starsTransaction.failed) ? false : true;
                    wallettransaction2.failed = starsTransaction.failed;
                    i2 = i3;
                    wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                    wallettransaction2.date = starsTransaction.date;
                    wallettransaction2.peer = new h2c(x);
                    arrayList2.add(j2c.i(wallettransaction2, k2cVar));
                }
                i3 = i2;
                arrayList4 = arrayList;
            }
            i = i3;
        } else {
            i = i3;
            ArrayList arrayList5 = arrayListArr[i];
            int size3 = arrayList5.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj5 = arrayList5.get(i9);
                i9++;
                int i10 = hza.b;
                b8c K3 = b8c.K(hza.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.r = false;
                arrayList2.add(K3);
            }
        }
        if (v.u[i]) {
            return;
        }
        arrayList2.add(b8c.q(arrayList2.size(), 7));
        arrayList2.add(b8c.q(arrayList2.size(), 7));
        arrayList2.add(b8c.q(arrayList2.size(), 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a7  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        int i;
        Object[] objArr;
        int i2;
        ch9 ch9Var;
        byte b = this.a;
        byte b2 = 7;
        int i3 = -1;
        byte b3 = 3;
        char c = 1;
        char c2 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ij8 ij8Var = (ij8) obj3;
                ArrayList arrayList = (ArrayList) obj;
                String M0 = ob6.M0(2131754269, null);
                b8c b8cVar = new b8c(2);
                b8cVar.m = M0;
                b8cVar.k = R.raw.bubble;
                arrayList.add(b8cVar);
                b8c i4 = b8c.i(1, ob6.M0(2131754270, null));
                i4.L(ij8Var.n);
                arrayList.add(i4);
                arrayList.add(b8c.B(2, null));
                if (ij8Var.n) {
                    bp1.o(2131746604, null, arrayList);
                    int[] a = bna.a(new int[]{0, 10, 50, 100, jn7.d3, jn7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) ij8Var.getMessagesController().k4.P1.f());
                    ku7 ku7Var = new ku7((byte) 23);
                    ana anaVar = new ana();
                    anaVar.c = a;
                    anaVar.d = (byte) 20;
                    anaVar.e = ku7Var;
                    ij8Var.b.d((int) Utilities.k(ij8Var.r, 10000L, 0L), anaVar, new ii7(ij8Var, (byte) 17));
                    arrayList.add(b8c.j(3, ij8Var.b));
                    arrayList.add(b8c.B(4, ij8Var.r > 0 ? ij8Var.Z() : null));
                    TLRPC.Chat M02 = ij8Var.getMessagesController().M0(Long.valueOf(ij8Var.a));
                    if (M02 != null && !TextUtils.isEmpty(xc2.K(M02, false))) {
                        ij8Var.c.setLink(ij8Var.getMessagesController().N2 + "/" + xc2.K(M02, false) + "?direct");
                        arrayList.add(b8c.u(ob6.M0(2131752359, null)));
                        arrayList.add(b8c.j(5, ij8Var.c));
                        break;
                    }
                }
                break;
            case 1:
                mj8 mj8Var = (mj8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = mj8Var.e;
                ArrayList arrayList4 = mj8Var.n;
                if (mj8Var.d == null) {
                    arrayList2.add(b8c.q(-1, 7));
                    arrayList2.add(b8c.q(-2, 7));
                    arrayList2.add(b8c.q(-3, 7));
                    mj8Var.R = false;
                    break;
                } else {
                    boolean isEmpty = TextUtils.isEmpty(mj8Var.x);
                    if (isEmpty) {
                        if (!arrayList3.isEmpty()) {
                            arrayList2.add(b8c.r(ob6.M0(2131745450, null)));
                        }
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj4 = arrayList3.get(i5);
                            i5++;
                            b8c b8cVar2 = new b8c(33);
                            b8cVar2.H = (r47) obj4;
                            arrayList2.add(b8cVar2);
                        }
                    } else {
                        if (!arrayList4.isEmpty()) {
                            arrayList2.add(b8c.r(ob6.M0(2131745451, null)));
                        }
                        int size2 = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj5 = arrayList4.get(i6);
                            i6++;
                            b8c b8cVar3 = new b8c(33);
                            b8cVar3.H = (r47) obj5;
                            arrayList2.add(b8cVar3);
                        }
                    }
                    if (mj8Var.w || ((mj8Var.N && !mj8Var.O) || (!isEmpty && !arrayList4.isEmpty() && !mj8Var.s))) {
                        arrayList2.add(b8c.q(mj8Var.M * 3, 7));
                        arrayList2.add(b8c.q((mj8Var.M * 3) + 1, 7));
                        arrayList2.add(b8c.q((mj8Var.M * 3) + 2, 7));
                    }
                    mj8Var.R = arrayList2.isEmpty();
                    break;
                }
            case 2:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                RectF rectF = ProfileActivity.Z6;
                nz4 nz4Var = profileActivity.Q6;
                nz4Var.a((Bitmap) obj2);
                uk0.c(nz4Var, profileActivity.fragmentView);
                profileActivity.R6.d();
                break;
            case 4:
                au8 au8Var = (au8) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                vnb vnbVar = au8Var.c;
                cga cgaVar = au8Var.a;
                axa axaVar = au8Var.e;
                if (axaVar != null) {
                    if ((!axaVar.e || axaVar.g != 783) && axaVar.l.size() <= 0) {
                        axa axaVar2 = au8Var.e;
                        if (axaVar2.j && !axaVar2.i) {
                        }
                    }
                    axa axaVar3 = au8Var.e;
                    int max = Math.max(1, (axaVar3 == null || (i = axaVar3.n) == 0) ? 3 : Math.min(3, i));
                    axa axaVar4 = au8Var.e;
                    if (axaVar4 != null) {
                        ArrayList arrayList6 = axaVar4.l;
                        int size3 = arrayList6.size();
                        int i7 = 3;
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj6 = arrayList6.get(i8);
                            i8++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                            boolean z = au8Var.d;
                            int i9 = rx4.b;
                            b8c K = b8c.K(rx4.class);
                            K.v = 1;
                            K.A = 0;
                            K.H = savedStarGift;
                            K.r = true;
                            K.f = false;
                            K.s = z;
                            K.h = au8Var.h && (au8Var.e != cgaVar.d || savedStarGift.pinned_to_top);
                            arrayList5.add(K);
                            i7--;
                            if (i7 == 0) {
                                i7 = 3;
                            }
                        }
                        axa axaVar5 = au8Var.e;
                        if (axaVar5.i || !axaVar5.j) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < (i7 <= 0 ? 3 : i7)) {
                                    i10++;
                                    b8c q = b8c.q(i10, 34);
                                    q.v = 1;
                                    arrayList5.add(q);
                                }
                            }
                        }
                    }
                    if (cgaVar.d == au8Var.e) {
                        arrayList5.add(b8c.D(hl.L(20.0f)));
                        if (cgaVar.c == yac.h(au8Var.b).e()) {
                            int i11 = aob.z6;
                            int v0 = aob.v0(i11, vnbVar);
                            String M03 = ob6.M0(2131746398, null);
                            int L = hl.L(24.0f);
                            int i12 = bu8.b;
                            b8c K2 = b8c.K(bu8.class);
                            K2.m = M03;
                            K2.A = 17;
                            K2.C = v0;
                            K2.B = 14.0f;
                            K2.i = L;
                            K2.k = 0;
                            K2.r = false;
                            K2.H = vnbVar;
                            K2.I = Integer.valueOf(i11);
                            arrayList5.add(K2);
                        }
                        arrayList5.add(b8c.D(hl.L(82.0f)));
                    } else if (!arrayList5.isEmpty()) {
                        arrayList5.add(b8c.D(hl.L(82.0f)));
                    }
                    if (!arrayList5.isEmpty()) {
                        arrayList5.add(0, b8c.D(hl.L(au8Var.I ? 42.0f : 12.0f)));
                    }
                    if (au8Var.f.getSpanCount() != max) {
                        hl.c3(new lt8(au8Var, max, c == true ? 1 : 0));
                    }
                    cgaVar.p();
                    cgaVar.post(new ft8(cgaVar, (byte) 3));
                    break;
                }
                break;
            case 5:
                sv8 sv8Var = (sv8) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!sv8Var.T && !sv8Var.S) {
                    sv8Var.H = bitmap;
                    sv8Var.n.invalidate();
                    sv8Var.d();
                    sv8Var.F.a(bitmap2);
                    sv8Var.h.post(new ov8(sv8Var, c2 == true ? 1 : 0));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
                break;
            case 6:
                qy8 qy8Var = (qy8) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList7 = qy8Var.e;
                qy8Var.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    qy8Var.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        qy8Var.b.serializeToStream(serializedData);
                        uc7.s1(qy8Var.a).X3.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                qy8Var.d = shareThemeBackdrops != null;
                ArrayList arrayList8 = new ArrayList(arrayList7);
                arrayList7.clear();
                int size4 = arrayList8.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj7 = arrayList8.get(i13);
                    i13++;
                    ((Runnable) obj7).run();
                }
                break;
            case 7:
                mb9 mb9Var = (mb9) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                q9c q9cVar = mb9Var.f;
                nb9 nb9Var = mb9Var.w;
                ArrayList arrayList10 = nb9Var.r1;
                jo0 jo0Var = mb9Var.h;
                if (jo0Var.getMeasuredHeight() <= 0) {
                    jo0Var.measure(View.MeasureSpec.makeMeasureSpec(hl.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(120.0f), TLObject.FLAG_31));
                }
                b8c D = b8c.D(jo0Var.getMeasuredHeight());
                D.d = -1;
                D.t = true;
                arrayList9.add(D);
                int measuredHeight = (int) ((jo0Var.getMeasuredHeight() / hl.p) + 0.0f);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = mb9Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || mb9Var.c != null || mb9Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || mb9Var.c != null) {
                        Context context = mb9Var.getContext();
                        int i14 = aob.L6;
                        int i15 = nb9.v1;
                        mf5 mf5Var = new mf5(context, i14, 21, 0, 0, false, false, nb9Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = mb9Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            mf5Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = mb9Var.c;
                            if (tL_reportResultChooseOption != null) {
                                mf5Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        yob.h(aob.h5, nb9Var.J0, mf5Var);
                        b8c k = b8c.k(mf5Var);
                        k.d = -2;
                        arrayList9.add(k);
                        measuredHeight += 40;
                    }
                    if (mb9Var.b != null) {
                        for (int i16 = 0; i16 < mb9Var.b.options.size(); i16++) {
                            b8c b8cVar4 = new b8c(30);
                            b8cVar4.m = mb9Var.b.options.get(i16).text;
                            b8cVar4.k = R.drawable.msg_arrowright;
                            b8cVar4.d = i16;
                            arrayList9.add(b8cVar4);
                            measuredHeight += 50;
                        }
                    } else if (mb9Var.c != null) {
                        for (int i17 = 0; i17 < mb9Var.c.options.size(); i17++) {
                            b8c b8cVar5 = new b8c(30);
                            b8cVar5.m = mb9Var.c.options.get(i17).text;
                            b8cVar5.k = R.drawable.msg_arrowright;
                            b8cVar5.d = i17;
                            arrayList9.add(b8cVar5);
                            measuredHeight += 50;
                        }
                    } else if (mb9Var.d != null) {
                        if (mb9Var.n == null) {
                            Context context2 = mb9Var.getContext();
                            int i18 = nb9.v1;
                            lb9 lb9Var = new lb9(mb9Var, context2, nb9Var.J0);
                            mb9Var.n = lb9Var;
                            lb9Var.setShowLimitWhenNear(100);
                        }
                        mb9Var.n.d.setHint(ob6.M0(mb9Var.d.optional ? 2131745963 : 2131745969, null));
                        b8c k2 = b8c.k(mb9Var.n);
                        k2.d = -3;
                        arrayList9.add(k2);
                        long j = nb9Var.t1;
                        if (arrayList10 != null && !arrayList10.isEmpty()) {
                            arrayList9.add(b8c.C(ob6.M0(arrayList10.size() > 1 ? 2131745965 : 2131745968, null)));
                        } else if (wf3.D(j)) {
                            arrayList9.add(b8c.C(ob6.M0(2131745964, null)));
                        } else if (xc2.V(uc7.s1(nb9Var.a).M0(Long.valueOf(-j)))) {
                            arrayList9.add(b8c.C(ob6.M0(2131745967, null)));
                        } else {
                            arrayList9.add(b8c.C(ob6.M0(2131745966, null)));
                        }
                        if (mb9Var.r == null) {
                            c51 c51Var = new c51(nb9Var.J0, mb9Var.getContext(), true);
                            mb9Var.s = c51Var;
                            c51Var.i(ob6.M0(2131745962, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(mb9Var.getContext());
                            mb9Var.r = frameLayout;
                            yob.h(aob.h5, nb9Var.J0, frameLayout);
                            mb9Var.r.addView(mb9Var.s, tre.d(-1, 48.0f, jn7.D1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(mb9Var.getContext());
                            yob.h(aob.d7, nb9Var.J0, view);
                            mb9Var.r.addView(view, tre.a(-1.0f, 1.0f / hl.p, 48));
                        }
                        mb9Var.s.setEnabled(mb9Var.d.optional || !TextUtils.isEmpty(mb9Var.n.getText()));
                        mb9Var.s.setOnClickListener(new jn8(mb9Var, b2));
                        b8c k3 = b8c.k(mb9Var.r);
                        k3.d = -4;
                        arrayList9.add(k3);
                        measuredHeight += jn7.w1;
                    }
                    ((b8c) c00.g(1, arrayList9)).j = true;
                    if (nb9Var.o1 && mb9Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(mb9Var.getContext());
                        Drawable mutate = mb9Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        yob.x(frameLayout2, mutate, aob.b7, nb9Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        yob.x(frameLayout2, colorDrawable, aob.a7, nb9Var.J0, PorterDuff.Mode.SRC_IN);
                        zm2 zm2Var = new zm2(colorDrawable, mutate, 0, 0);
                        zm2Var.x = true;
                        frameLayout2.setBackground(zm2Var);
                        p66 p66Var = new p66(mb9Var.getContext(), null);
                        p66Var.setTextSize(1, 14.0f);
                        p66Var.setText(hl.H2(ob6.M0(2131745960, null), nb9Var.J0, null));
                        yob.X(p66Var, aob.A6, nb9Var.J0);
                        p66Var.setGravity(17);
                        frameLayout2.addView(p66Var, tre.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        b8c k4 = b8c.k(frameLayout2);
                        k4.d = -3;
                        arrayList9.add(k4);
                        measuredHeight += 46;
                    }
                }
                if (q9cVar != null) {
                    int i19 = nb9.v1;
                    if (nb9Var.b.getMeasuredHeight() - hl.m < hl.L(measuredHeight)) {
                        q9cVar.f3.j1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList9);
                        q9cVar.f3.j1(true);
                        break;
                    }
                }
                break;
            case 8:
                nd9 nd9Var = (nd9) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                ed9 ed9Var = nd9Var.e;
                ArrayList arrayList12 = ed9Var.e;
                int size5 = arrayList12.size();
                int i20 = 0;
                while (i20 < size5) {
                    Object obj8 = arrayList12.get(i20);
                    i20++;
                    arrayList11.add(rx4.i(0, (TL_stars.TL_starGiftUnique) obj8, false, false, false, true, false));
                }
                if (ed9Var.z || !ed9Var.A) {
                    b8c q2 = b8c.q(-1, 34);
                    q2.v = 1;
                    arrayList11.add(q2);
                    b8c q3 = b8c.q(-2, 34);
                    q3.v = 1;
                    arrayList11.add(q3);
                    b8c q4 = b8c.q(-3, 34);
                    q4.v = 1;
                    arrayList11.add(q4);
                    if (ed9Var.e.isEmpty()) {
                        b8c q5 = b8c.q(-4, 34);
                        q5.v = 1;
                        arrayList11.add(q5);
                        b8c q6 = b8c.q(-5, 34);
                        q6.v = 1;
                        arrayList11.add(q6);
                        b8c q7 = b8c.q(-6, 34);
                        q7.v = 1;
                        arrayList11.add(q7);
                        b8c q8 = b8c.q(-7, 34);
                        q8.v = 1;
                        arrayList11.add(q8);
                        b8c q9 = b8c.q(-8, 34);
                        q9.v = 1;
                        arrayList11.add(q9);
                        b8c q10 = b8c.q(-9, 34);
                        q10.v = 1;
                        arrayList11.add(q10);
                        b8c q11 = b8c.q(-10, 34);
                        q11.v = 1;
                        arrayList11.add(q11);
                        b8c q12 = b8c.q(-11, 34);
                        q12.v = 1;
                        arrayList11.add(q12);
                        b8c q13 = b8c.q(-12, 34);
                        q13.v = 1;
                        arrayList11.add(q13);
                        b8c q14 = b8c.q(-13, 34);
                        q14.v = 1;
                        arrayList11.add(q14);
                        b8c q15 = b8c.q(-14, 34);
                        q15.v = 1;
                        arrayList11.add(q15);
                        b8c q16 = b8c.q(-15, 34);
                        q16.v = 1;
                        arrayList11.add(q16);
                    }
                }
                nd9Var.s0(arrayList11.isEmpty() && !ed9Var.z);
                break;
            case 9:
                md9 md9Var = (md9) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ld9 ld9Var = md9Var.T1;
                if (ld9Var != null) {
                    axa axaVar6 = ld9Var.b;
                    ed9 ed9Var2 = ld9Var.c;
                    if (axaVar6 != null && ed9Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(md9Var.a).getCurrentTime();
                        arrayList13.add(b8c.t(-1, ob6.M0(2131749716, null)));
                        ArrayList arrayList14 = axaVar6.l;
                        int size6 = arrayList14.size();
                        int i21 = 0;
                        int i22 = 0;
                        boolean z2 = true;
                        while (i22 < size6) {
                            Object obj9 = arrayList14.get(i22);
                            i22++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj9;
                            boolean z3 = z2;
                            if (md9Var.b2.contains(Long.valueOf(savedStarGift2.gift.id)) || it7.n(savedStarGift2.gift)) {
                                z2 = z3;
                            } else {
                                boolean z4 = savedStarGift2.can_craft_at <= currentTime;
                                b8c i23 = rx4.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i23.g = z4;
                                arrayList13.add(i23);
                                i21++;
                                z2 = false;
                            }
                        }
                        boolean z5 = z2;
                        if (axaVar6.i || !axaVar6.j) {
                            int i24 = i21 % 3;
                            int i25 = 6 - i24;
                            for (int i26 = 0; i26 < i25; i26++) {
                                b8c q17 = b8c.q((i26 - i24) + 1, 35);
                                q17.v = 1;
                                arrayList13.add(q17);
                            }
                        } else if (z5) {
                            arrayList13.add(b8c.g(ob6.M0(2131749715, null)));
                        }
                        if (ed9Var2.f > 0 || md9Var.e2) {
                            md9Var.e2 = true;
                            String M04 = ob6.M0(2131749718, null);
                            b8c b8cVar6 = new b8c(42);
                            b8cVar6.d = -2;
                            b8cVar6.p = M04;
                            arrayList13.add(b8cVar6);
                            HorizontalScrollView horizontalScrollView = md9Var.U1;
                            if (horizontalScrollView != null) {
                                arrayList13.add(b8c.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList15 = ed9Var2.e;
                            int size7 = arrayList15.size();
                            int i27 = 0;
                            while (i27 < size7) {
                                Object obj10 = arrayList15.get(i27);
                                i27++;
                                arrayList13.add(rx4.i(0, (TL_stars.TL_starGiftUnique) obj10, false, true, false, true, true));
                            }
                            if (ed9Var2.z || !ed9Var2.A) {
                                b8c q18 = b8c.q(10, 35);
                                q18.v = 1;
                                arrayList13.add(q18);
                                b8c q19 = b8c.q(11, 35);
                                q19.v = 1;
                                arrayList13.add(q19);
                                b8c q20 = b8c.q(12, 35);
                                q20.v = 1;
                                arrayList13.add(q20);
                                b8c q21 = b8c.q(13, 35);
                                q21.v = 1;
                                arrayList13.add(q21);
                                b8c q22 = b8c.q(14, 35);
                                q22.v = 1;
                                arrayList13.add(q22);
                                b8c q23 = b8c.q(15, 35);
                                q23.v = 1;
                                arrayList13.add(q23);
                                break;
                            }
                        }
                    }
                }
                break;
            case 10:
                ((ArrayList) obj).add(b8c.k(((qe9) obj3).S1));
                break;
            case 11:
                ue9 ue9Var = (ue9) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                arrayList16.add(b8c.j(1, ue9Var.V1));
                arrayList16.add(b8c.j(3, ue9Var.Y1));
                if (ue9Var.d2 != null) {
                    arrayList16.add(b8c.j(2, ue9Var.W1));
                    break;
                }
                break;
            case 12:
                pi9.L3((pi9[]) obj3, (ArrayList) obj, (l9c) obj2);
                break;
            case 13:
                pi9 pi9Var = (pi9) obj3;
                ((Integer) obj).getClass();
                ArrayList arrayList17 = (ArrayList) obj2;
                ArrayList arrayList18 = pi9Var.t3;
                ArrayList arrayList19 = new ArrayList(arrayList17.size());
                int size8 = arrayList17.size();
                int i28 = 0;
                while (i28 < size8) {
                    Object obj11 = arrayList17.get(i28);
                    i28++;
                    Object obj12 = ((b8c) obj11).H;
                    if (obj12 instanceof mk0) {
                        arrayList19.add((mk0) obj12);
                    }
                }
                if (arrayList19.size() >= 2) {
                    ArrayList arrayList20 = new ArrayList();
                    int size9 = arrayList19.size();
                    int i29 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i30 = 0;
                    int i31 = 0;
                    while (i31 < size9) {
                        Object obj13 = arrayList19.get(i31);
                        i31++;
                        mk0 mk0Var = (mk0) obj13;
                        int indexOf = arrayList18.indexOf(mk0Var);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i32 = indexOf + 1;
                            if (pi9.u3(mk0Var) && !((TL_iv.pageBlockDetails) mk0Var.b).open) {
                                int N3 = pi9Var.N3(indexOf);
                                i32 = N3 >= arrayList18.size() ? arrayList18.size() : N3 + 1;
                            }
                            arrayList20.add(new ArrayList(arrayList18.subList(indexOf, i32)));
                            i29 = Math.min(i29, indexOf);
                            i3 = Math.max(i3, i32);
                            i30 += i32 - indexOf;
                        }
                    }
                    if (i30 == i3 - i29) {
                        ArrayList arrayList21 = new ArrayList(i30);
                        int size10 = arrayList20.size();
                        int i33 = 0;
                        while (i33 < size10) {
                            Object obj14 = arrayList20.get(i33);
                            i33++;
                            arrayList21.addAll((ArrayList) obj14);
                        }
                        for (int i34 = 0; i34 < arrayList21.size(); i34++) {
                            if (arrayList18.get(i29 + i34) != arrayList21.get(i34)) {
                                ch9 ch9Var2 = pi9Var.R3;
                                if (ch9Var2 != null) {
                                    ch9Var2.d();
                                }
                                for (int i35 = 0; i35 < arrayList21.size(); i35++) {
                                    arrayList18.set(i29 + i35, (mk0) arrayList21.get(i35));
                                }
                                mk0 mk0Var2 = pi9Var.a4;
                                ArrayList arrayList22 = pi9.A4;
                                if (mk0Var2 != null) {
                                    ArrayList arrayList23 = mk0Var2.k;
                                    int indexOf2 = arrayList18.indexOf(mk0Var2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList24 = indexOf2 > 0 ? ((mk0) arrayList18.get(indexOf2 - 1)).k : arrayList22;
                                        int i36 = indexOf2 + 1;
                                        if (i36 < arrayList18.size()) {
                                            arrayList22 = ((mk0) arrayList18.get(i36)).k;
                                        }
                                        if (arrayList24.size() < arrayList22.size()) {
                                            arrayList24 = arrayList22;
                                        }
                                        if (!arrayList23.equals(arrayList24)) {
                                            arrayList23.clear();
                                            arrayList23.addAll(arrayList24);
                                            objArr = true;
                                            boolean u2 = pi9Var.u2();
                                            i2 = 0;
                                            while (i2 < arrayList18.size()) {
                                                mk0 mk0Var3 = (mk0) arrayList18.get(i2);
                                                if (!mk0Var3.i && !pi9.u3(mk0Var3)) {
                                                    mk0 mk0Var4 = i2 > 0 ? (mk0) arrayList18.get(i2 - 1) : null;
                                                    int max2 = mk0Var4 != null ? Math.max(0, mk0Var4.c) : 0;
                                                    if (pi9.B3(mk0Var3.b)) {
                                                        mk0Var3.c = max2;
                                                        if (max2 > 0) {
                                                            mk0Var3.d = mk0Var4.d > 0 ? 1 : 0;
                                                            mk0Var3.e = false;
                                                            mk0Var3.f = false;
                                                        }
                                                    } else {
                                                        int i37 = mk0Var3.c;
                                                        max2++;
                                                        if (i37 > max2) {
                                                            mk0Var3.c = max2;
                                                        } else {
                                                            max2 = i37;
                                                        }
                                                    }
                                                    if (max2 <= 0) {
                                                        mk0Var3.c = 0;
                                                        mk0Var3.d = 0;
                                                        mk0Var3.e = false;
                                                        mk0Var3.f = false;
                                                    }
                                                }
                                                i2++;
                                            }
                                            pi9Var.u4();
                                            pi9Var.W1();
                                            if (!objArr == true || u2) {
                                                pi9Var.g3.O(true);
                                                pi9Var.A4();
                                            } else {
                                                pi9Var.A4();
                                            }
                                            ch9Var = pi9Var.R3;
                                            if (ch9Var == null) {
                                                ch9Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                objArr = false;
                                boolean u22 = pi9Var.u2();
                                i2 = 0;
                                while (i2 < arrayList18.size()) {
                                }
                                pi9Var.u4();
                                pi9Var.W1();
                                if (objArr == true) {
                                }
                                pi9Var.g3.O(true);
                                pi9Var.A4();
                                ch9Var = pi9Var.R3;
                                if (ch9Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 14:
                mu9 mu9Var = (mu9) obj3;
                mu9Var.c = (Bitmap) obj;
                Paint paint = new Paint(1);
                mu9Var.e = paint;
                Bitmap bitmap3 = mu9Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                mu9Var.d = bitmapShader;
                paint.setShader(bitmapShader);
                mu9Var.f = new Matrix();
                nz4 nz4Var2 = mu9Var.h;
                nz4Var2.a((Bitmap) obj2);
                uk0.c(nz4Var2, mu9Var.s);
                ViewGroup viewGroup = mu9Var.E;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            case 15:
                ((ArrayList) obj).add(b8c.k(((xd5) obj3).T1));
                break;
            case 16:
                b(obj, obj2);
                break;
            case 17:
                c(obj, obj2);
                break;
            case 18:
                d(obj, obj2);
                break;
            case 19:
                e(obj, obj2);
                break;
            case 20:
                r7a r7aVar = (r7a) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                if (updates != null) {
                    r7aVar.getMessagesController().Y3(updates, false);
                    break;
                }
                break;
            case 21:
                ((tba) obj3).a0((ArrayList) obj);
                break;
            case 22:
                sqa sqaVar = (sqa) obj3;
                ArrayList arrayList25 = (ArrayList) obj;
                LinearLayout linearLayout = sqaVar.T1;
                if (linearLayout != null) {
                    arrayList25.add(b8c.k(linearLayout));
                }
                LinearLayout linearLayout2 = sqaVar.U1;
                if (linearLayout2 != null) {
                    arrayList25.add(b8c.k(linearLayout2));
                    break;
                }
                break;
            case 23:
                f(obj, obj2);
                break;
            case 24:
                ((nza) obj3).F0((ArrayList) obj, (l9c) obj2);
                break;
            case 25:
                g(obj, obj2);
                break;
            case 26:
                h(obj, obj2);
                break;
            case 27:
                i(obj, obj2);
                break;
            case 28:
                j(obj, obj2);
                break;
            default:
                s4b s4bVar = (s4b) obj3;
                CharSequence charSequence = (CharSequence) obj;
                s4bVar.q1.setText(charSequence);
                TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
                tL_stickers_renameStickerSet.stickerset = ls6.b0(s4bVar.M1.set);
                tL_stickers_renameStickerSet.title = charSequence.toString();
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_stickers_renameStickerSet, new ug1((pcc) obj2, b3));
                break;
        }
    }
}
