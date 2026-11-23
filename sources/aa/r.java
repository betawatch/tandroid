package aa;

import a8.t6;
import a8.u6;
import ai.p0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.car.app.IOnDoneCallback;
import bi.e2;
import bi.g3;
import bi.g4;
import bi.m6;
import bi.x4;
import bi.x7;
import bi.y5;
import ci.j0;
import ci.o0;
import ci.w0;
import ci.x0;
import ci.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import d3.h0;
import di.f6;
import di.y8;
import h2.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        z0 z0Var;
        String str;
        int i7;
        String str2;
        o0 o0Var;
        int i10;
        int i11;
        TLRPC.Message message;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        boolean z15;
        boolean z16 = false;
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                p pVar = tVar.f;
                pVar.getClass();
                try {
                    ((ab.q) pVar.d.d).B(str3, str4);
                    return;
                } catch (IllegalArgumentException e10) {
                    Context context = pVar.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e10;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 1:
                ab.h hVar = (ab.h) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    hVar.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(false);
                }
            case 2:
                ai.h hVar2 = (ai.h) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ai.f fVar = (ai.f) this.d;
                hVar2.getClass();
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                hVar2.b();
                fVar.c(null, null);
                return;
            case 3:
                p0 p0Var = (p0) this.b;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                p0Var.getClass();
                DictationAsr.Z(str5, str6);
                p0Var.A(str5);
                return;
            case 4:
                p0 p0Var2 = (p0) this.b;
                String str7 = (String) this.c;
                ai.g gVar = (ai.g) this.d;
                if (p0Var2.r != 4) {
                    return;
                }
                p0Var2.r = 3;
                p0Var2.v(str7);
                p0Var2.w.d(gVar.a(), false);
                p0Var2.w.setRevert(true);
                return;
            case 5:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.d;
                String str8 = (String) this.c;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e11) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str8), e11);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 6:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str9 = (String) this.c;
                try {
                    androidx.car.app.utils.g.d(str9.concat(" onSuccess"), new a3.h((Object) iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str9, 3));
                    return;
                } catch (RuntimeException e12) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str9, e12);
                    throw new RuntimeException(e12);
                } catch (w.f e13) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str9, e13);
                    return;
                }
            case 7:
                androidx.emoji2.text.n nVar = (androidx.emoji2.text.n) this.b;
                u6 u6Var = (u6) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.s a10 = t6.a(nVar.a);
                    if (a10 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) ((androidx.emoji2.text.k) a10.b);
                    synchronized (rVar.d) {
                        rVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a10.b).a(new androidx.emoji2.text.m(u6Var, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    u6Var.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 8:
                e2 e2Var = (e2) this.b;
                String str10 = (String) this.c;
                TLObject tLObject = (TLObject) this.d;
                if (TextUtils.equals(e2Var.l2, str10)) {
                    e2Var.m2 = -1;
                    e2Var.g2.clear();
                    e2Var.h2.clear();
                    if (tLObject instanceof TLRPC.TL_contacts_found) {
                        TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                        np u12 = np.u1(e2Var.a);
                        u12.f4(tL_contacts_found.users, false);
                        u12.Z3(tL_contacts_found.chats, false);
                        HashSet hashSet = new HashSet();
                        e2Var.f1(tL_contacts_found.my_results, hashSet);
                        e2Var.f1(tL_contacts_found.results, hashSet);
                    }
                    e2Var.j2.O(true);
                    return;
                }
                return;
            case 9:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                g4 g4Var = (g4) this.d;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                g4Var.a(0L);
                return;
            case 10:
                boolean[] zArr3 = (boolean[]) this.b;
                vf.b bVar = (vf.b) this.c;
                t1 t1Var = (t1) this.d;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                bVar.b();
                t1Var.dismiss();
                return;
            case 11:
                gq0 gq0Var = (gq0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                g2 g2Var = (g2) this.d;
                gq0Var.I = -1;
                if (tL_error != null) {
                    lc.b0(g2Var).g0(tL_error, false);
                    return;
                }
                return;
            case 12:
                m6 m6Var = (m6) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                a70 a70Var = (a70) this.d;
                gq0 gq0Var2 = m6Var.a;
                gq0Var2.e.k(m6Var.e.d, savedStarGift);
                a70Var.v();
                gq0Var2.o();
                TL_stars.TL_starGiftCollection c10 = gq0Var2.e.c(m6Var.e.d);
                if (c10 != null) {
                    lc.b0(gq0Var2.a).R(savedStarGift.gift.getDocument(), g0.W2(hd.a0(null, null, 2131750020, f6.F1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 13:
                m6 m6Var2 = (m6) this.b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                g3 g3Var = (g3) this.d;
                if (m6Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    g3Var.d(false, true);
                    m6Var2.e.q(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                g3Var.i(savedStarGift2, z10, m6Var2.d);
                m6Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = m6Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(m6Var2.b).sendRequest(savestargift, null);
                return;
            case 14:
                x7 x7Var = (x7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.d;
                HashMap hashMap = x7Var.m;
                HashMap hashMap2 = x7Var.o;
                HashMap hashMap3 = x7Var.n;
                ArrayList arrayList = x7Var.h;
                ArrayList arrayList2 = x7Var.g;
                ArrayList arrayList3 = x7Var.f;
                int i12 = x7Var.a;
                ArrayList arrayList4 = x7Var.d;
                x7Var.A = -1;
                if (tLObject2 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject2;
                    np.u1(i12).f4(resalestargifts.users, false);
                    np.u1(i12).Z3(resalestargifts.chats, false);
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        x7Var.u = 0;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i13);
                        i13++;
                        boolean z17 = z11;
                        TL_stars.StarGift starGift2 = starGift;
                        ArrayList<TL_stars.StarGift> arrayList6 = arrayList5;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            if (f6.P1(i12, tL_starGiftUnique) || ((x7Var.w || x7Var.x) && x4.m(tL_starGiftUnique))) {
                                x7Var.u++;
                            } else {
                                arrayList4.add(tL_starGiftUnique);
                            }
                        }
                        arrayList5 = arrayList6;
                        z11 = z17;
                    }
                    boolean z18 = z11;
                    x7Var.e = Math.max(arrayList4.size(), resalestargifts.count - x7Var.u);
                    x7Var.z = arrayList4.size() >= x7Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    x7Var.q = resalestargifts.next_offset;
                    x7Var.y = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(y8.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(y8.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(y8.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        x7Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty() || TextUtils.isEmpty(getresalestargifts.offset)) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList8 = resalestargifts.counters;
                        int size2 = arrayList8.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList8.get(i14);
                            i14++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    y10 y10Var = x7Var.c;
                    if (y10Var != null) {
                        y10Var.a(Boolean.valueOf(z18));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                j0 j0Var = (j0) this.b;
                ci.d dVar = (ci.d) this.c;
                List list = (List) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = dVar.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList9 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList9 == null || arrayList9 == list || (z0Var = j0Var.d) == null || j0Var.isFinished) {
                    return;
                }
                x0 x0Var = z0Var.n;
                if (x0Var != null && x0Var.a == 0 && (i11 = x0Var.f) >= 0) {
                    String[] strArr = ci.a.a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                        i7 = z0Var.N7;
                        if (i7 >= 0) {
                            String[] strArr2 = ci.a.a;
                            if (i7 < strArr2.length) {
                                str2 = strArr2[i7];
                                if (ci.a.a(arrayList9)) {
                                    if (str2 != null) {
                                        i10 = 0;
                                        while (true) {
                                            String[] strArr3 = ci.a.a;
                                            if (i10 < strArr3.length) {
                                                if (!str2.equals(strArr3[i10])) {
                                                    i10++;
                                                }
                                            }
                                        }
                                        z0Var.N7 = i10;
                                        if (str != null) {
                                            if (z0Var.r != null) {
                                                z0Var.r = null;
                                                z0Var.s = 1.0f;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                String[] strArr4 = ci.a.a;
                                                if (i15 >= strArr4.length) {
                                                    i15 = z0.H9;
                                                } else if (!str.equals(strArr4[i15])) {
                                                    i15++;
                                                }
                                            }
                                            z0Var.n = z0.t(i15);
                                            d6.i iVar = z0Var.c;
                                            if (iVar != null) {
                                                ((j0) iVar.b).b0();
                                            }
                                        }
                                        z0Var.invalidate();
                                    }
                                    i10 = z0.H9;
                                    z0Var.N7 = i10;
                                    if (str != null) {
                                    }
                                    z0Var.invalidate();
                                }
                                o0Var = j0Var.e;
                                if (o0Var == null || o0Var.F) {
                                    return;
                                }
                                if (o0Var.E) {
                                    o0Var.j();
                                    return;
                                }
                                if (o0Var.y) {
                                    return;
                                }
                                TLRPC.ShareTheme shareTheme = o0Var.I;
                                if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) || (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) == 0) {
                                    return;
                                }
                                o0Var.a(shareTheme);
                                return;
                            }
                        }
                        str2 = null;
                        if (ci.a.a(arrayList9)) {
                        }
                        o0Var = j0Var.e;
                        if (o0Var == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                str = null;
                i7 = z0Var.N7;
                if (i7 >= 0) {
                }
                str2 = null;
                if (ci.a.a(arrayList9)) {
                }
                o0Var = j0Var.e;
                if (o0Var == null) {
                }
                break;
            case 16:
                z0 z0Var2 = (z0) this.b;
                w0 w0Var = (w0) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (w0Var.G || bitmap == null) {
                    return;
                }
                w0Var.D = bitmap;
                z0Var2.invalidate();
                return;
            case 17:
                wf.b bVar2 = (wf.b) this.b;
                e2.u uVar = (e2.u) this.c;
                l2.e eVar = (l2.e) this.d;
                h0 h0Var = (h0) bVar2.c;
                String str11 = l0.a;
                l2.f0 f0Var = ((l2.z) h0Var).a;
                f0Var.S = uVar;
                m2.d dVar2 = f0Var.s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1017, new m2.c(U, uVar, eVar, 3));
                return;
            case 18:
                di.t tVar2 = (di.t) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                Context context2 = (Context) this.d;
                if (tLObject3 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    vf.c.t(context2, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject3).url);
                }
                g0.h3(new di.c(tVar2, 6), 1000L);
                return;
            case 19:
                f6 f6Var = (f6) this.b;
                Long l10 = (Long) this.c;
                f6Var.l2(l10.longValue(), new bi.j(f6Var, l10, (e2[]) this.d, 3));
                return;
            case 20:
                f6 f6Var2 = (f6) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                gj gjVar = (gj) this.d;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                np.u1(f6Var2.a).f4(messages_messages.users, false);
                np.u1(f6Var2.a).Z3(messages_messages.chats, false);
                f6Var2.I2 = true;
                f6Var2.H2 = false;
                if (f6Var2.l3 != null && (message = gjVar.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = !r2.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = !r2.booleanValue();
                    }
                }
                f6Var2.v2(gjVar, null);
                return;
            case 21:
                f6 f6Var3 = (f6) this.b;
                vf.b bVar3 = (vf.b) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.d;
                bVar3.c(false);
                tL_starGiftUnique2.flags &= -17;
                tL_starGiftUnique2.resale_ton_only = false;
                tL_starGiftUnique2.resell_amount = null;
                f6Var3.b2.setResellPrice(cg.a.j(0L, cg.b.a));
                y5 y5Var = f6Var3.j3;
                if (y5Var != null) {
                    y5Var.run();
                }
                f6Var3.k().Q(R.raw.contact_check, 36, hd.a0(null, null, 2131750012, f6Var3.E1())).j();
                return;
            case 22:
                f6 f6Var4 = (f6) this.b;
                vf.b bVar4 = (vf.b) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                bVar4.c(false);
                f6Var4.k().g0(tL_error2, false);
                return;
            case 23:
                Runnable runnable2 = (Runnable) this.b;
                vf.b bVar5 = (vf.b) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable2.run();
                bVar5.c(false);
                f6.p2(twoStepVerificationActivity);
                return;
            case 24:
                Runnable runnable3 = (Runnable) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                g2 T = LaunchActivity.T();
                lc b02 = T != null ? lc.b0(T) : lc.Y();
                gc q10 = runnable3 == null ? document != null ? b02.q(document, charSequence) : b02.Q(R.raw.contact_check, 36, charSequence) : document != null ? b02.r(document, charSequence, hd.N0(2131749871, null), runnable3) : b02.K(R.raw.contact_check, charSequence, hd.N0(2131749871, null), runnable3);
                q10.t = true;
                q10.j();
                return;
            case 25:
                f6.g1((f6) this.b, (t1) this.c, (gj) this.d);
                return;
            case 26:
                final f6 f6Var5 = (f6) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) this.d;
                final String str12 = (String) this.c;
                final long j10 = tL_starGiftUnique3.gift_id;
                final String str13 = tL_starGiftUnique3.title;
                final String E1 = f6Var5.E1();
                final TLRPC.Document document2 = tL_starGiftUnique3.getDocument();
                String str14 = tL_starGiftUnique3.slug;
                final t1 t1Var2 = new t1(3, t0.b, null);
                t1Var2.r(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str14;
                ConnectionsManager.getInstance(f6Var5.a).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: di.d2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject5, final TLRPC.TL_error tL_error3) {
                        final f6 f6Var6 = f6.this;
                        final org.telegram.ui.ActionBar.t1 t1Var3 = t1Var2;
                        final TLRPC.Document document3 = document2;
                        final String str15 = str12;
                        final String str16 = str13;
                        final String str17 = E1;
                        final long j11 = j10;
                        org.telegram.messenger.g0.g3(new Runnable() { // from class: di.o2
                            @Override // java.lang.Runnable
                            public final void run() {
                                FrameLayout frameLayout;
                                bi.h0 h0Var2;
                                ey0 ey0Var;
                                ey0 ey0Var2;
                                TLRPC.Document document4;
                                String str18;
                                bi.h0 h0Var3;
                                CharSequence charSequence2;
                                CharSequence charSequence3;
                                f6 f6Var7;
                                char c11;
                                float f10;
                                float f11;
                                t1Var3.dismiss();
                                TLObject tLObject6 = tLObject5;
                                boolean z19 = tLObject6 instanceof TL_stars.UniqueStarGiftValueInfo;
                                f6 f6Var8 = f6.this;
                                if (!z19) {
                                    TLRPC.TL_error tL_error4 = tL_error3;
                                    if (tL_error4 != null) {
                                        f6Var8.k().g0(tL_error4, false);
                                        return;
                                    }
                                    return;
                                }
                                TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject6;
                                org.telegram.ui.ActionBar.w2 j12 = org.telegram.messenger.f3.j(1, f6Var8.getContext(), f6Var8.J0, false);
                                LinearLayout linearLayout = new LinearLayout(f6Var8.getContext());
                                linearLayout.setOrientation(1);
                                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                linearLayout.setClipChildren(false);
                                linearLayout.setClipToPadding(false);
                                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(f6Var8.getContext());
                                ImageReceiver imageReceiver = q9Var.getImageReceiver();
                                TLRPC.Document document5 = document3;
                                pb.d1(imageReceiver, document5, ls.q2);
                                linearLayout.addView(q9Var, c8.ma.t(ls.q2, ls.q2, 1, 0, 0, 0, 0));
                                TextView textView = new TextView(f6Var8.getContext());
                                textView.setTextSize(1, 20.0f);
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, f6Var8.J0);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                                int L = org.telegram.messenger.g0.L(21.0f);
                                int i16 = org.telegram.ui.ActionBar.m6.Fi;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i16, f6Var8.J0));
                                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
                                org.telegram.ui.ActionBar.h6 h6Var = f6Var8.J0;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.t6.j(textView, d02, M, null, h6Var);
                                textView.setGravity(17);
                                linearLayout.addView(textView, c8.ma.t(-2, 42, 1, 0, 12, 0, 15));
                                textView.setText(str15);
                                TextView textView2 = new TextView(f6Var8.getContext());
                                textView2.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.j5, f6Var8.J0);
                                textView2.setGravity(17);
                                linearLayout.addView(textView2, c8.ma.t(-2, -2, 1, 16, 0, 16, 19));
                                boolean z20 = uniqueStarGiftValueInfo.value_is_average;
                                String str19 = str16;
                                if (z20) {
                                    org.telegram.messenger.f3.q(null, null, 2131749413, new Object[]{str19}, textView2);
                                } else {
                                    boolean z21 = uniqueStarGiftValueInfo.last_sale_on_fragment;
                                    String str20 = str17;
                                    if (z21) {
                                        org.telegram.messenger.f3.q(null, null, 2131749408, new Object[]{str20}, textView2);
                                    } else {
                                        org.telegram.messenger.f3.q(null, null, 2131749405, new Object[]{str20}, textView2);
                                    }
                                }
                                FrameLayout frameLayout2 = new FrameLayout(f6Var8.getContext());
                                frameLayout2.setClipChildren(false);
                                frameLayout2.setClipToPadding(false);
                                bi.h0 h0Var4 = new bi.h0(f6Var8, new hi.l3[1], frameLayout2, 4);
                                ey0 ey0Var3 = new ey0(f6Var8.getContext(), f6Var8.J0);
                                frameLayout2.addView(ey0Var3, c8.ma.e(-1, -1, ls.E1));
                                ey0Var3.e(hd.N0(2131749409, null), hd.f0(uniqueStarGiftValueInfo.initial_sale_date), null, null);
                                String N0 = hd.N0(2131749410, null);
                                StringBuilder sb2 = new StringBuilder("⭐️");
                                sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
                                sb2.append(" (~");
                                ey0Var3.e(N0, pb.b1(false, a8.p0.s(sb2, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                                    ey0Var3.e(hd.N0(2131749406, null), hd.f0(uniqueStarGiftValueInfo.last_sale_date), null, null);
                                    frameLayout = frameLayout2;
                                    int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
                                    if (round > 0) {
                                        ey0Var3.d(hd.N0(2131749407, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + hd.E(round, ' ') + "%", null, null);
                                        ey0Var = ey0Var3;
                                        h0Var2 = h0Var4;
                                    } else {
                                        ey0Var = ey0Var3;
                                        h0Var2 = h0Var4;
                                        ey0Var.e(hd.N0(2131749407, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                                    }
                                } else {
                                    frameLayout = frameLayout2;
                                    h0Var2 = h0Var4;
                                    ey0Var = ey0Var3;
                                }
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                    document4 = document5;
                                    str18 = null;
                                    h0Var3 = h0Var2;
                                    c3 c3Var = new c3(h0Var3, new org.telegram.ui.Components.nc[]{(org.telegram.ui.Components.nc) ((by0) r4.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str19, 0);
                                    ey0 ey0Var4 = ey0Var;
                                    TableRow d = ey0Var4.d(hd.N0(2131749404, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", c3Var, null);
                                    ey0Var2 = ey0Var4;
                                    d.setOnClickListener(new ah.d(c3Var, 15));
                                } else {
                                    ey0Var2 = ey0Var;
                                    document4 = document5;
                                    str18 = null;
                                    h0Var3 = h0Var2;
                                }
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                    c3 c3Var2 = new c3(h0Var3, new org.telegram.ui.Components.nc[]{(org.telegram.ui.Components.nc) ((by0) r4.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str19, 1);
                                    TableRow d2 = ey0Var2.d(hd.N0(2131749412, str18), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", c3Var2, null);
                                    d2.setOnClickListener(new ah.d(c3Var2, 16));
                                }
                                linearLayout.addView(frameLayout, c8.ma.t(-1, -2, 7, 0, 0, 0, 12));
                                if (uniqueStarGiftValueInfo.listed_count > 0) {
                                    f10 = 1.0f;
                                    f11 = 2.0f;
                                    hi.e eVar2 = new hi.e(f6Var8.getContext(), f6Var8.J0, false);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    spannableStringBuilder.append((CharSequence) hd.E(uniqueStarGiftValueInfo.listed_count, ' '));
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) "e");
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(document4, 1.5f, eVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) hd.N0(2131749401, null));
                                    eVar2.i(org.telegram.messenger.g0.I2(spannableStringBuilder, false, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f)), false, true);
                                    charSequence3 = " ";
                                    charSequence2 = "e";
                                    f6Var7 = f6Var8;
                                    c11 = ' ';
                                    eVar2.setOnClickListener(new d3(f6Var7, str19, j11, 0));
                                    linearLayout.addView(eVar2, c8.ma.t(-1, 42, 7, 0, 0, 0, 2));
                                } else {
                                    charSequence2 = "e";
                                    charSequence3 = " ";
                                    f6Var7 = f6Var8;
                                    c11 = ' ';
                                    f10 = 1.0f;
                                    f11 = 2.0f;
                                }
                                if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                    hi.e eVar3 = new hi.e(f6Var7.getContext(), f6Var7.J0, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) hd.E(uniqueStarGiftValueInfo.fragment_listed_count, c11));
                                    spannableStringBuilder2.append(charSequence2);
                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document4, 1.5f, eVar3.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                    spannableStringBuilder2.append(charSequence3);
                                    spannableStringBuilder2.append((CharSequence) hd.N0(2131749402, null));
                                    eVar3.i(org.telegram.messenger.g0.I2(spannableStringBuilder2, false, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10)), false, true);
                                    eVar3.setOnClickListener(new ai.y2(14, f6Var7, uniqueStarGiftValueInfo));
                                    linearLayout.addView(eVar3, c8.ma.t(-1, 42, 7, 0, 0, 0, 0));
                                }
                                j12.O = linearLayout;
                                j12.show();
                            }
                        });
                    }
                });
                return;
            case 27:
                TLObject tLObject5 = (TLObject) this.b;
                di.j0 j0Var2 = (di.j0) this.d;
                String str15 = (String) this.c;
                if (tLObject5 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift3 = ((TL_stars.TL_payments_uniqueStarGift) tLObject5).gift;
                    if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique4 = (TL_stars.TL_starGiftUnique) starGift3;
                        Long valueOf = Long.valueOf(tL_starGiftUnique4.gift_id);
                        String str16 = tL_starGiftUnique4.title;
                        if (str16 != null) {
                            str15 = str16;
                        }
                        j0Var2.a(valueOf, str15);
                        return;
                    }
                }
                j0Var2.a(0L, str15);
                return;
            case 28:
                TLObject tLObject6 = (TLObject) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                y10 y10Var2 = (y10) this.d;
                if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    y10Var2.a((TLRPC.TL_payments_paymentFormStarGift) tLObject6);
                    return;
                } else {
                    y8.e(tL_error3 != null ? tL_error3.text : "NO_PAYMENT_FORM");
                    y10Var2.a(null);
                    return;
                }
            default:
                y8 y8Var = (y8) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                Runnable runnable4 = (Runnable) this.d;
                ArrayList arrayList10 = y8Var.v;
                boolean[] zArr4 = y8Var.r;
                boolean[] zArr5 = y8Var.t;
                ArrayList[] arrayListArr = y8Var.q;
                int i16 = y8Var.a;
                boolean z19 = !y8Var.e;
                y8Var.c = System.currentTimeMillis();
                if (tLObject7 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject7;
                    np.u1(i16).f4(starsStatus.users, false);
                    np.u1(i16).Z3(starsStatus.chats, false);
                    if (!arrayListArr[0].isEmpty() || zArr5[0]) {
                        z14 = false;
                        j3 = 0;
                        z15 = false;
                    } else {
                        ArrayList<TL_stars.StarsTransaction> arrayList11 = starsStatus.history;
                        int size3 = arrayList11.size();
                        int i17 = 0;
                        j3 = 0;
                        while (i17 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList11.get(i17);
                            i17++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            boolean z20 = z16;
                            arrayListArr[z20 ? 1 : 0].add(starsTransaction2);
                            ArrayList<TL_stars.StarsTransaction> arrayList12 = arrayList11;
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                            z16 = z20 ? 1 : 0;
                            arrayList11 = arrayList12;
                        }
                        z14 = z16;
                        for (?? r72 = z14; r72 < 3; r72++) {
                            zArr4[r72] = (!arrayListArr[r72].isEmpty() || zArr4[r72]) ? true : z14;
                            boolean[] zArr6 = y8Var.u;
                            boolean z21 = (starsStatus.flags & 1) == 0 ? true : z14;
                            zArr6[r72] = z21;
                            if (z21) {
                                zArr5[r72] = z14;
                            }
                            y8Var.s[r72] = zArr6[r72] ? null : starsStatus.next_offset;
                        }
                        z15 = true;
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList10.addAll(starsStatus.subscriptions);
                        y8Var.x = z14;
                        y8Var.w = starsStatus.subscriptions_next_offset;
                        y8Var.y = (starsStatus.flags & 4) == 0;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long j11 = y8Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j11 != starsAmount.amount) {
                        z19 = true;
                    }
                    y8Var.f = starsAmount;
                    y8Var.g = j3;
                    z13 = z15;
                } else {
                    z12 = false;
                    z13 = false;
                }
                y8Var.d = false;
                y8Var.e = true;
                if (z19) {
                    ls.f(i16).k(ls.A3, new Object[0]);
                }
                if (z13) {
                    ls.f(i16).k(ls.B3, new Object[0]);
                }
                if (z12) {
                    ls.f(i16).k(ls.C3, new Object[0]);
                }
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ r(Object obj, Object obj2, String str, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }
}
