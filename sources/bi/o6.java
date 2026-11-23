package bi;

import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.fb;
import di.gb;
import di.pb;
import fi.m9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.oo;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.x21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bn;
import org.telegram.ui.f40;
import org.telegram.ui.gi0;
import org.telegram.ui.js0;
import org.telegram.ui.mm;
import org.telegram.ui.nl0;
import org.telegram.ui.p51;
import org.telegram.ui.s90;
import org.telegram.ui.tl0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o6(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void b(Object obj, Object obj2) {
        ((vf.b) this.b).b();
        ((nl0) this.c).a((Boolean) obj);
    }

    private final void c(Object obj, Object obj2) {
        TLRPC.EmojiStatus emojiStatus;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
        js0 js0Var = (js0) this.c;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l10.longValue();
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
            }
            emojiStatus = tL_emojiStatus;
        }
        premiumPreviewFragment.getMessagesController().t5(emojiStatus, null);
        js0Var.b(l10 == null ? 0L : l10.longValue(), true);
    }

    private final void d(Object obj, Object obj2) {
        JSONArray jSONArray;
        String str = (String) this.b;
        y10 y10Var = (y10) this.c;
        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
        byte[] bArr = null;
        if (apiresponse != null) {
            try {
                JSONObject jSONObject = new JSONObject(apiresponse.response.data);
                if (jSONObject.has("stack")) {
                    jSONArray = jSONObject.getJSONArray("stack");
                    if (jSONObject.has("exit_code") && jSONObject.getInt("exit_code") != 0) {
                        throw new Exception("received exit code: " + jSONObject.getInt("exit_code"));
                    }
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                    if (jSONObject2.has("exit_code") && jSONObject2.getInt("exit_code") != 0) {
                        throw new Exception("received exit code: " + jSONObject2.getInt("exit_code"));
                    }
                    jSONArray = jSONObject2.getJSONArray("stack");
                }
                String string = jSONArray.get(0) instanceof JSONArray ? jSONArray.getJSONArray(0).getString(1) : jSONArray.get(0) instanceof JSONObject ? jSONArray.getJSONObject(0).getString("value") : "";
                if (string.startsWith("0x")) {
                    bArr = Utilities.v(string.substring(2));
                }
            } catch (Exception e10) {
                org.telegram.ui.Wallet.u0.o("failed to get public key of " + str, e10);
            }
        }
        y10Var.a(bArr);
    }

    private final void e(Object obj, Object obj2) {
        org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.b;
        org.telegram.ui.Wallet.v8 v8Var = (org.telegram.ui.Wallet.v8) this.c;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj;
        String str = (String) obj2;
        if (r0Var == null) {
            org.telegram.ui.Wallet.u0.n("enable backup: didnt get secret phrase: ".concat(str == null ? "NULL_ERROR" : str));
            if (str == null) {
                str = "NULL_ERROR";
            }
            v8Var.a(str);
            return;
        }
        org.telegram.ui.Wallet.r0 b10 = r0Var.b();
        p51 p51Var = new p51(3, b10, v8Var);
        org.telegram.ui.Wallet.u0.P("enable backup: got secret phrase");
        try {
            ConnectionsManager.getInstance(u0Var.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new d3.b(1), new org.telegram.ui.Wallet.s(u0Var, p51Var, b10, WalletEngine2.secretPhraseToPublicKey(b10), 2));
        } catch (Exception e10) {
            org.telegram.ui.Wallet.u0.o("failed to get public key from secret phrase", e10);
            p51Var.a(e10.getMessage() != null ? e10.getMessage() : "NULL_ERROR");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0b8f  */
    @Override // org.telegram.messenger.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        long j3;
        long j10;
        int i7;
        di.z4 z4Var;
        di.z4 z4Var2;
        di.z4 z4Var3;
        boolean z10;
        long j11;
        long j12;
        lc b02;
        int i10;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        boolean z11;
        long j13;
        InputMethodManager inputMethodManager;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.User c22;
        TLRPC.User c23;
        TLRPC.Chat O0;
        int i11;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        int i12 = this.a;
        int i13 = 6;
        int i14 = 2;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                r6 r6Var = (r6) obj4;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((di.p8) obj3).l;
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                    if (savedStarGift.pinned_to_top) {
                        int i16 = tl0.b;
                        o41 K = o41.K(tl0.class);
                        K.H = savedStarGift;
                        K.L(r6Var.m1 == savedStarGift.gift.id);
                        K.v = 1;
                        arrayList.add(K);
                    }
                }
                break;
            case 1:
                di.p2 p2Var = (di.p2) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                org.telegram.messenger.g0.r((di.f2) obj4);
                if (wallettransaction != null) {
                    long j14 = wallettransaction.fee;
                    j3 = 0;
                    if (j14 > 0) {
                        j10 = j14;
                        p2Var.a(Long.valueOf(j10));
                        break;
                    }
                } else {
                    j3 = 0;
                }
                j10 = j3;
                p2Var.a(Long.valueOf(j10));
            case 2:
                TextView textView = (TextView) obj4;
                long[] jArr = (long[]) obj3;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    long j15 = wallettransaction2.fee;
                    if (j15 > 0) {
                        jArr[0] = j15;
                        textView.setText(hd.V(null, null, 2131742825, org.telegram.ui.Wallet.u0.x(j15, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 3:
                di.b5 b5Var = (di.b5) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                di.z4[] z4VarArr = b5Var.n;
                hi.l3 l3Var = b5Var.U;
                if (l3Var != null) {
                    l3Var.f(true);
                    b5Var.U = null;
                }
                b5Var.j0 = true;
                b5Var.k0 = starGift == null;
                b5Var.l0 = runnable;
                di.u4 u4Var = new di.u4(b5Var.h);
                ArrayList arrayList4 = new ArrayList();
                for (int i17 = 0; i17 < z4VarArr.length; i17++) {
                    di.z4 z4Var4 = z4VarArr[i17];
                    if (z4Var4 != null) {
                        TL_stars.StarGift starGift2 = z4Var4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList4.add(Integer.valueOf(i17));
                        }
                    }
                }
                int i18 = 4;
                int i19 = 40;
                if (arrayList4.size() == 1) {
                    u4Var.e(z4VarArr[((Integer) arrayList4.get(0)).intValue()], 5, 0.0f);
                    u4Var.d(false);
                    u4Var.c(26.0f, -26.0f);
                    u4Var.a(90);
                    u4Var.d(true);
                    u4Var.a(20);
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    di.z4 z4Var5 = z4VarArr[0];
                    if (z4Var5 != null) {
                        TL_stars.StarGift starGift3 = z4Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            u4Var.e(z4Var5, iArr[0], 0.0f);
                            u4Var.c(25.0f, -22.0f);
                            i7 = 1;
                            z4Var = z4VarArr[1];
                            if (z4Var != null) {
                                TL_stars.StarGift starGift4 = z4Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i7 > 0) {
                                        u4Var.a(42);
                                    }
                                    u4Var.e(z4VarArr[1], iArr[i7], 0.0f);
                                    u4Var.c(25.0f, 31.0f);
                                    i7++;
                                }
                            }
                            z4Var2 = z4VarArr[2];
                            if (z4Var2 != null) {
                                TL_stars.StarGift starGift5 = z4Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i7 > 0) {
                                        u4Var.a(42);
                                    }
                                    u4Var.e(z4VarArr[2], iArr[i7], 180.0f);
                                    u4Var.c(-36.0f, -36.0f);
                                    i7++;
                                }
                            }
                            z4Var3 = z4VarArr[3];
                            if (z4Var3 != null) {
                                TL_stars.StarGift starGift6 = z4Var3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i7 > 0) {
                                        u4Var.a(42);
                                    }
                                    u4Var.e(z4VarArr[3], iArr[i7], 0.0f);
                                    u4Var.c(-31.0f, 31.0f);
                                    i7++;
                                }
                            }
                            u4Var.d(false);
                            u4Var.a(40);
                            u4Var.d(true);
                            u4Var.a(40);
                            i18 = iArr[i7];
                            i19 = 80;
                        }
                    }
                    i7 = 0;
                    z4Var = z4VarArr[1];
                    if (z4Var != null) {
                    }
                    z4Var2 = z4VarArr[2];
                    if (z4Var2 != null) {
                    }
                    z4Var3 = z4VarArr[3];
                    if (z4Var3 != null) {
                    }
                    u4Var.d(false);
                    u4Var.a(40);
                    u4Var.d(true);
                    u4Var.a(40);
                    i18 = iArr[i7];
                    i19 = 80;
                }
                int i20 = i19;
                di.t4 t4Var = new di.t4(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new ai.j1(b5Var, i18, starGift, 5));
                ArrayList arrayList5 = u4Var.b;
                arrayList5.add(t4Var);
                arrayList5.add(new di.t4(4, 0.0f, 0.0f, i20, i18, -90, null, null));
                u4Var.d = new ai.r(b5Var, starGift, arrayList3, runnable, 14);
                u4Var.e = false;
                u4Var.c = 0;
                u4Var.l = false;
                int size2 = arrayList5.size();
                int i21 = 0;
                while (true) {
                    di.v4 v4Var = u4Var.a;
                    if (i21 >= size2) {
                        v4Var.I = u4Var;
                        u4Var.b();
                        break;
                    } else {
                        Object obj6 = arrayList5.get(i21);
                        i21++;
                        di.t4 t4Var2 = (di.t4) obj6;
                        int i22 = t4Var2.e;
                        if (i22 >= 0 && i22 < 6) {
                            float f10 = t4Var2.f;
                            if (f10 != 0.0f) {
                                v4Var.E[i22] = f10;
                            }
                        }
                    }
                }
                break;
            case 4:
                pb.D0((pb) obj4, (o41) obj3, (Boolean) obj, (String) obj2);
                break;
            case 5:
                fb fbVar = (fb) obj4;
                o41 o41Var = (o41) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                if (fbVar.getContext() != null) {
                    if (bool.booleanValue()) {
                        new lc((FrameLayout) fbVar.b, fbVar.J0).I(R.raw.stars_topup, hd.N0(2131744916, null), org.telegram.messenger.g0.W2(hd.G((int) o41Var.C, "StarsAcquiredInfo", new Object[0]))).j();
                        fbVar.W1.c(true);
                        di.y8.y(fbVar.a, false).R(true);
                        break;
                    } else if (str != null) {
                        new lc((FrameLayout) fbVar.b, fbVar.J0).Q(R.raw.error, 36, hd.a0(null, null, 2131743633, str)).j();
                        break;
                    }
                }
                break;
            case 6:
                gb gbVar = (gb) obj4;
                o41 o41Var2 = (o41) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                if (gbVar.getContext() != null) {
                    gbVar.dismiss();
                    di.y8.y(gbVar.a, false).R(true);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        if (bool2.booleanValue()) {
                            lc.b0(T).I(R.raw.stars_topup, hd.N0(2131744916, null), org.telegram.messenger.g0.W2(hd.G((int) o41Var2.C, "StarsAcquiredInfo", new Object[0]))).j();
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null) {
                                launchActivity.w0.c(true);
                                break;
                            }
                        } else if (str2 != null) {
                            lc.b0(T).Q(R.raw.error, 36, hd.a0(null, null, 2131743633, str2)).j();
                            break;
                        }
                    }
                }
                break;
            case 7:
                fi.a2 a2Var = (fi.a2) obj4;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) obj3;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                fi.a0 a0Var = a2Var.W;
                int i23 = a2Var.O;
                a2Var.V = false;
                TLRPC.InputGroupCall inputGroupCall = a2Var.P;
                if (inputGroupCall != null && inputGroupCall.id == getgroupcallstars.call.id) {
                    if (groupcallstars != null) {
                        np.u1(i23).f4(groupcallstars.users, false);
                        np.u1(i23).Z3(groupcallstars.chats, false);
                        int i24 = 0;
                        while (true) {
                            if (i24 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i24).my) {
                                    z10 = groupcallstars.top_donors.get(i24).stars > 0;
                                } else {
                                    i24++;
                                }
                            }
                        }
                        long j16 = groupcallstars.total_stars;
                        boolean z12 = (j16 == a2Var.R && a2Var.T == z10) ? false : true;
                        a2Var.R = j16;
                        a2Var.U = groupcallstars.top_donors;
                        a2Var.T = z10;
                        if (z12) {
                            a2Var.j();
                        }
                        a2Var.t();
                    }
                    if (a2Var.isAttachedToWindow()) {
                        org.telegram.messenger.g0.r(a0Var);
                        org.telegram.messenger.g0.h3(a0Var, 5000L);
                        break;
                    }
                }
                break;
            case 8:
                ArrayList arrayList6 = (ArrayList) obj3;
                Vector vector = (Vector) obj;
                int i25 = ((m9) obj4).a.a;
                if (vector != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for (int i26 = 0; i26 < vector.objects.size(); i26++) {
                        if (((Long) arrayList6.get(i26)).longValue() > 0) {
                            TLRPC.User c24 = np.u1(i25).c2((Long) arrayList6.get(i26));
                            if (c24 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i26);
                                c24.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    c24.flags2 |= 32;
                                } else {
                                    c24.flags2 &= -33;
                                }
                                arrayList7.add(c24);
                            }
                        } else {
                            TLRPC.Chat O02 = np.u1(i25).O0((Long) arrayList6.get(i26));
                            if (O02 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i26);
                                O02.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    O02.flags2 |= 16;
                                } else {
                                    O02.flags2 &= -17;
                                }
                                arrayList8.add(O02);
                            }
                        }
                    }
                    ur.a0(i25).m1(arrayList7, arrayList8, true, true);
                    ls.f(i25).k(2, 0);
                    break;
                }
                break;
            case 9:
                hi.k5 k5Var = (hi.k5) obj4;
                tg.j jVar = (tg.j) obj3;
                k5Var.getClass();
                ((tg.o0) jVar).r(k5Var.p1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                k5Var.b0(jVar);
                break;
            case 10:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((hi.e) obj4).setLoading(false);
                if (g2Var.getContext() != null && g2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        lc.e0(tL_error);
                        break;
                    } else {
                        if (tL_starsRevenueStatus == null || tL_starsRevenueStatus.withdrawal_enabled) {
                            if (tL_starsRevenueStatus == null || (starsAmount = tL_starsRevenueStatus.available_balance) == null) {
                                j11 = 0;
                                j12 = 0;
                            } else {
                                j11 = 0;
                                j12 = Math.max(0L, starsAmount.amount);
                            }
                            if (j12 > j11) {
                                ii.n.g(g2Var, j12, null);
                                break;
                            } else {
                                b02 = lc.b0(g2Var);
                                i10 = 2131749326;
                            }
                        } else {
                            b02 = lc.b0(g2Var);
                            i10 = 2131749328;
                        }
                        org.telegram.messenger.f3.n(null, i10, b02, R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 11:
                ((t10) obj4).a((Boolean) obj, (androidx.biometric.u) obj2, (androidx.biometric.v) obj3);
                break;
            case 12:
                org.telegram.ui.x xVar = (org.telegram.ui.x) obj4;
                org.telegram.ui.w wVar = (org.telegram.ui.w) obj3;
                Boolean bool3 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool3.booleanValue()) {
                        xVar.a(Boolean.TRUE);
                    }
                    wVar.run();
                    break;
                }
                break;
            case 13:
                bn.e1((bn) obj4, (gj) obj3, (Long) obj, (Runnable) obj2);
                break;
            case 14:
                bn bnVar = (bn) obj4;
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                bnVar.X5 = 0;
                if (webpagepreview != null) {
                    bnVar.getMessagesController().f4(webpagepreview.users, false);
                    bnVar.getMessagesController().Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            m6Var.a(Boolean.FALSE, null);
                            break;
                        } else {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            if (webPage == null || !"telegram_story".equals(webPage.type)) {
                                m6Var.a(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                                break;
                            } else {
                                if (tL_messageMediaWebPage.webpage.attributes != null) {
                                    for (int i27 = 0; i27 < tL_messageMediaWebPage.webpage.attributes.size(); i27++) {
                                        if (tL_messageMediaWebPage.webpage.attributes.get(i27) instanceof TLRPC.TL_webPageAttributeStory) {
                                            tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i27);
                                            if (tL_webPageAttributeStory != null) {
                                                m6Var.a(Boolean.FALSE, null);
                                                break;
                                            } else if (tL_webPageAttributeStory.storyItem != null) {
                                                m6Var.a(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                                break;
                                            } else {
                                                bnVar.getMessagesStorage().a.c(new org.telegram.messenger.camera.i(bnVar, tL_messageMediaWebPage, tL_webPageAttributeStory, m6Var, 14));
                                                break;
                                            }
                                        }
                                    }
                                }
                                tL_webPageAttributeStory = null;
                                if (tL_webPageAttributeStory != null) {
                                }
                            }
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage != null) {
                }
                break;
            case 15:
                mm mmVar = (mm) obj4;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj3;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                bn bnVar2 = mmVar.a;
                if (tL_channels_channelParticipant != null) {
                    bnVar2.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                    bnVar2.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        mmVar.e(r1Var, channelParticipant);
                        break;
                    }
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                String str3 = (String) obj3;
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.p6 = -1;
                if (chatActivityEnterView.q6) {
                    gf gfVar = chatActivityEnterView.F0;
                    Editable text = gfVar != null ? gfVar.getText() : null;
                    if (text == null || !str3.equals(text.toString())) {
                        chatActivityEnterView.o(false);
                        break;
                    } else if (charSequence == null) {
                        chatActivityEnterView.o(true);
                        break;
                    } else {
                        gf gfVar2 = chatActivityEnterView.F0;
                        Editable text2 = gfVar2.getText();
                        chatActivityEnterView.z0();
                        Layout layout = gfVar2.getLayout();
                        if (layout != null && layout.getWidth() > 0) {
                            boolean z13 = i0.a.h(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.d6)) < 0.5d;
                            float width = layout.getWidth();
                            StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), gfVar2.getPaint(), layout.getWidth()).build();
                            int scrollY = gfVar2.getScrollY();
                            int max = Math.max(1, (gfVar2.getHeight() - gfVar2.getTotalPaddingTop()) - gfVar2.getTotalPaddingBottom());
                            float max2 = Math.max(scrollY + max, Math.min(build.getHeight(), (max * 2) + scrollY));
                            ai.o1 o1Var = chatActivityEnterView.o6;
                            float f11 = o1Var.E;
                            z11 = o1Var.b(((scrollY * 0.9f) - f11) - org.telegram.messenger.g0.L(4.0f), p5.c.e(max2, 0.9f, width, f11) + org.telegram.messenger.g0.L(4.0f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Pe) | (-16777216), z13);
                            if (z11) {
                                j13 = Math.max(600L, Math.min(900L, (Math.max(layout.getLineCount(), build.getLineCount()) * 60) + 540));
                                chatActivityEnterView.G1 = SystemClock.uptimeMillis() + j13;
                                chatActivityEnterView.H1 = ai.o1.J;
                                BaseInputConnection.removeComposingSpans(text2);
                                text2.replace(0, text2.length(), charSequence);
                                gfVar2.setSelection(text2.length());
                                inputMethodManager = (InputMethodManager) chatActivityEnterView.getContext().getSystemService("input_method");
                                if (inputMethodManager != null) {
                                    inputMethodManager.restartInput(gfVar2);
                                }
                                if (z11) {
                                    if (!chatActivityEnterView.F1) {
                                        chatActivityEnterView.x6 = true;
                                        chatActivityEnterView.F1 = true;
                                    }
                                    chatActivityEnterView.o6.a(j13);
                                    jh.f D0 = chatActivityEnterView.D0();
                                    if (D0 != null) {
                                        if (chatActivityEnterView.v6 == null) {
                                            chatActivityEnterView.v6 = new ai.u0();
                                        }
                                        if (D0.h == null) {
                                            D0.h = new org.telegram.ui.Components.h2(i13, chatActivityEnterView, D0);
                                        }
                                    }
                                    jh.f D02 = chatActivityEnterView.D0();
                                    if (D02 != null) {
                                        D02.invalidate();
                                    }
                                    ai.o1 o1Var2 = chatActivityEnterView.o6;
                                    long j17 = o1Var2.e;
                                    chatActivityEnterView.G1 = j17 == 0 ? 0L : j17 + o1Var2.a;
                                    o1Var2.H = new dd(chatActivityEnterView, 14);
                                    gfVar2.invalidate();
                                    org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 15), 120 + j13);
                                }
                                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 10), Math.max(0L, j13 - 260));
                                te teVar = new te(chatActivityEnterView, 1);
                                chatActivityEnterView.s6 = teVar;
                                org.telegram.messenger.g0.h3(teVar, j13 + 140);
                                break;
                            }
                        } else {
                            z11 = false;
                        }
                        j13 = 0;
                        BaseInputConnection.removeComposingSpans(text2);
                        text2.replace(0, text2.length(), charSequence);
                        gfVar2.setSelection(text2.length());
                        inputMethodManager = (InputMethodManager) chatActivityEnterView.getContext().getSystemService("input_method");
                        if (inputMethodManager != null) {
                        }
                        if (z11) {
                        }
                        org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 10), Math.max(0L, j13 - 260));
                        te teVar2 = new te(chatActivityEnterView, 1);
                        chatActivityEnterView.s6 = teVar2;
                        org.telegram.messenger.g0.h3(teVar2, j13 + 140);
                    }
                }
                break;
            case 17:
                ui uiVar = (ui) obj4;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj3;
                Long l10 = (Long) obj;
                ((Runnable) obj2).run();
                uiVar.e2.setStarsPrice(l10.longValue());
                if (l10.longValue() > 0) {
                    y0Var.setText(hd.N0(2131747534, null));
                    y0Var.setSubtext(hd.G((int) l10.longValue(), "Stars", new Object[0]));
                    uiVar.c2.t(l10.longValue());
                    break;
                } else {
                    y0Var.setText(hd.N0(2131747536, null));
                    y0Var.setSubtext(null);
                    uiVar.c2.t(0L);
                    break;
                }
            case 18:
                tn tnVar = (tn) obj4;
                tnVar.getClass();
                tnVar.a0((th.e) ((sh.c) obj3), true);
                break;
            case 19:
                ks ksVar = (ks) obj4;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = ksVar.V;
                ArrayList arrayList10 = ksVar.U;
                int i28 = ksVar.Q;
                if (TextUtils.equals(((TLRPC.TL_contacts_search) obj3).q, ksVar.h0) && !TextUtils.isEmpty(ksVar.h0)) {
                    ksVar.d0 = false;
                    if (tL_contacts_found2 != null) {
                        ur.a0(i28).m1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        np.u1(i28).f4(tL_contacts_found2.users, false);
                        np.u1(i28).Z3(tL_contacts_found2.chats, false);
                        tL_contacts_found = tL_contacts_found2;
                    } else {
                        tL_contacts_found = null;
                    }
                    HashSet hashSet = new HashSet();
                    arrayList10.clear();
                    if (tL_contacts_found != null) {
                        ArrayList<TLRPC.Peer> arrayList11 = tL_contacts_found.my_results;
                        int size3 = arrayList11.size();
                        int i29 = 0;
                        while (i29 < size3) {
                            TLRPC.Peer peer = arrayList11.get(i29);
                            i29++;
                            TLRPC.Peer peer2 = peer;
                            if ((peer2 instanceof TLRPC.TL_peerUser) && (c23 = np.u1(i28).c2(Long.valueOf(peer2.user_id))) != null && c23.bot && !hashSet.contains(Long.valueOf(c23.id))) {
                                hashSet.add(Long.valueOf(c23.id));
                                arrayList10.add(c23);
                            }
                        }
                    }
                    arrayList9.clear();
                    if (tL_contacts_found != null) {
                        ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found.results;
                        int size4 = arrayList12.size();
                        int i30 = 0;
                        while (i30 < size4) {
                            TLRPC.Peer peer3 = arrayList12.get(i30);
                            i30++;
                            TLRPC.Peer peer4 = peer3;
                            if ((peer4 instanceof TLRPC.TL_peerUser) && (c22 = np.u1(i28).c2(Long.valueOf(peer4.user_id))) != null && c22.bot && !hashSet.contains(Long.valueOf(c22.id))) {
                                hashSet.add(Long.valueOf(c22.id));
                                arrayList9.add(c22);
                            }
                        }
                    }
                    ek0 ek0Var = ksVar.d;
                    if (ek0Var != null) {
                        ek0Var.v0(0);
                    }
                    ksVar.O(true);
                    break;
                }
                break;
            case 20:
                ms msVar = (ms) obj4;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList13 = msVar.V;
                ArrayList arrayList14 = msVar.U;
                ArrayList arrayList15 = msVar.T;
                int i31 = msVar.Q;
                if (TextUtils.equals(((TLRPC.TL_contacts_search) obj3).q, msVar.e0) && !TextUtils.isEmpty(msVar.e0)) {
                    msVar.a0 = false;
                    if (tL_contacts_found3 != null) {
                        ur.a0(i31).m1(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                        np.u1(i31).f4(tL_contacts_found3.users, false);
                        np.u1(i31).Z3(tL_contacts_found3.chats, false);
                    } else {
                        tL_contacts_found3 = null;
                    }
                    HashSet hashSet2 = new HashSet();
                    arrayList15.clear();
                    if (tL_contacts_found3 != null) {
                        ArrayList<TLRPC.Peer> arrayList16 = tL_contacts_found3.my_results;
                        int size5 = arrayList16.size();
                        int i32 = 0;
                        while (i32 < size5) {
                            TLRPC.Peer peer5 = arrayList16.get(i32);
                            i32++;
                            TLRPC.Peer peer6 = peer5;
                            if (peer6 instanceof TLRPC.TL_peerChannel) {
                                TLRPC.Chat O03 = np.u1(i31).O0(Long.valueOf(peer6.channel_id));
                                if (O03 != null && org.telegram.messenger.v3.V(O03) && !hashSet2.contains(Long.valueOf(O03.id))) {
                                    hashSet2.add(Long.valueOf(O03.id));
                                    arrayList15.add(O03);
                                }
                            }
                        }
                    }
                    arrayList14.clear();
                    String lowerCase = msVar.e0.toLowerCase();
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    HashMap hashMap = np.u1(i31).e8;
                    oo ooVar = hashMap == null ? null : (oo) hashMap.get(0L);
                    if (ooVar != null) {
                        ArrayList arrayList17 = ooVar.b;
                        if (!arrayList17.isEmpty()) {
                            int size6 = arrayList17.size();
                            int i33 = 0;
                            while (i33 < size6) {
                                Object obj7 = arrayList17.get(i33);
                                i33++;
                                TLObject tLObject = (TLObject) obj7;
                                if (tLObject instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                    if (org.telegram.messenger.v3.V(chat)) {
                                        i11 = i33;
                                        TLRPC.Chat O04 = np.u1(i31).O0(Long.valueOf(chat.id));
                                        if (org.telegram.messenger.v3.r0(chat) && (O04 == null || org.telegram.messenger.v3.r0(O04))) {
                                            String lowerCase2 = chat.title.toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            if ((lowerCase2.startsWith(lowerCase) || i5.c.B(" ", lowerCase, lowerCase2) || M32.startsWith(M3) || M32.contains(" ".concat(M3))) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                                hashSet2.add(Long.valueOf(chat.id));
                                                arrayList14.add(chat);
                                            }
                                        }
                                    }
                                } else {
                                    i11 = i33;
                                }
                                i33 = i11;
                            }
                        }
                    }
                    arrayList13.clear();
                    if (tL_contacts_found3 != null) {
                        ArrayList<TLRPC.Peer> arrayList18 = tL_contacts_found3.results;
                        int size7 = arrayList18.size();
                        int i34 = 0;
                        while (i34 < size7) {
                            TLRPC.Peer peer7 = arrayList18.get(i34);
                            i34++;
                            TLRPC.Peer peer8 = peer7;
                            if ((peer8 instanceof TLRPC.TL_peerChannel) && (O0 = np.u1(i31).O0(Long.valueOf(peer8.channel_id))) != null && org.telegram.messenger.v3.V(O0) && !hashSet2.contains(Long.valueOf(O0.id))) {
                                hashSet2.add(Long.valueOf(O0.id));
                                arrayList13.add(O0);
                            }
                        }
                    }
                    msVar.O(true);
                    break;
                }
                break;
            case 21:
                b31 b31Var = (b31) obj4;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m21 m21Var = b31Var.z1;
                a31 a31Var = b31Var.I1;
                b31Var.m1 = null;
                if (tL_error2 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                    if (tL_textWithEntities2 != null) {
                        b31Var.P1 = false;
                        TLRPC.TL_textWithEntities R0 = b31.R0(tL_textWithEntities, tL_textWithEntities2);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(R0.text);
                        gj.b(valueOf, R0.entities, false, true, false, false, 0);
                        b31Var.A1.setText(b31Var.S0(valueOf));
                        a31Var.D(m21Var);
                        break;
                    } else if (b31Var.P1) {
                        b31Var.dismiss();
                        ls.e().k(ls.S4, 1, hd.N0(2131743701, null));
                        break;
                    } else {
                        org.telegram.messenger.f3.o(null, 2131743701, new lc((FrameLayout) b31Var.b, b31Var.J0), null);
                        x21 x21Var = b31Var.x1.e;
                        String str4 = b31Var.w1;
                        b31Var.v1 = str4;
                        x21Var.setText(b31.P0(str4, null, null));
                        a31Var.D(m21Var);
                        break;
                    }
                } else {
                    b31Var.Z0();
                    break;
                }
                break;
            case 22:
                f40 f40Var = (f40) obj4;
                org.telegram.messenger.t3 t3Var = (org.telegram.messenger.t3) obj3;
                Boolean bool4 = (Boolean) obj;
                HashSet hashSet3 = (HashSet) obj2;
                org.telegram.messenger.t3 t3Var2 = f40Var.V2;
                if (t3Var2 != null && (groupCall = t3Var2.b) != null) {
                    String str5 = groupCall.invite_link;
                    int size8 = hashSet3.size();
                    AtomicInteger atomicInteger = new AtomicInteger(0);
                    HashSet hashSet4 = new HashSet();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        Long l11 = (Long) it.next();
                        long longValue = l11.longValue();
                        f40Var.V2.a(longValue);
                        TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        inviteconferencecallparticipant.call = tL_inputGroupCall;
                        TLRPC.GroupCall groupCall2 = f40Var.V2.b;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        np u12 = np.u1(f40Var.a);
                        inviteconferencecallparticipant.user_id = u12.s1(u12.c2(l11));
                        inviteconferencecallparticipant.video = bool4.booleanValue();
                        String str6 = str5;
                        ConnectionsManager.getInstance(f40Var.a).sendRequest(inviteconferencecallparticipant, new ii.f(f40Var, longValue, hashSet4, atomicInteger, size8, t3Var, str6));
                        str5 = str6;
                    }
                    f40Var.R0(true);
                    if (bool4.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                        sharedInstance.createCaptureDevice(false);
                        if (!sharedInstance.isFrontFaceCamera()) {
                            sharedInstance.switchCamera();
                        }
                        sharedInstance.requestVideoCall(false);
                        sharedInstance.setVideoState(false, 2);
                        sharedInstance.setMicMute(false, false, true);
                        sharedInstance.switchToSpeaker();
                        f40Var.W1(true, true);
                        break;
                    }
                }
                break;
            case 23:
                s90 s90Var = (s90) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                s90Var.c();
                if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        s90.d().I(R.raw.error, hd.N0(2131753125, null), hd.N0(2131753126, null)).j();
                        break;
                    } else {
                        s90.d().g0(tL_error3, false);
                        break;
                    }
                } else {
                    gi0.b(s90Var.d, s90Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    break;
                }
            case 24:
                ((boolean[]) obj4)[0] = true;
                ((org.telegram.ui.ActionBar.w2) obj3).dismiss();
                break;
            case 25:
                b(obj, obj2);
                break;
            case 26:
                c(obj, obj2);
                break;
            case 27:
                d(obj, obj2);
                break;
            case 28:
                e(obj, obj2);
                break;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj4;
                org.telegram.ui.Wallet.y8 y8Var = (org.telegram.ui.Wallet.y8) obj3;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj;
                String str7 = (String) obj2;
                if (r0Var == null) {
                    org.telegram.ui.Wallet.u0.n("prepare disable backup, cant get secret phrase: ".concat(str7 == null ? "NULL_ERROR" : str7));
                    if (str7 == null) {
                        str7 = "NULL_ERROR";
                    }
                    y8Var.a(null, str7);
                    break;
                } else {
                    TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = u0Var.f;
                    if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                        TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                    }
                    org.telegram.ui.Wallet.u0.P("prepare disable backup: preparing transfer");
                    u0Var.b.prepareRotateKey(r0Var, null, new fi.w1(i14, u0Var, y8Var));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o6(org.telegram.ui.Wallet.u0 u0Var, String str, y10 y10Var) {
        this.a = 27;
        this.b = str;
        this.c = y10Var;
    }
}
