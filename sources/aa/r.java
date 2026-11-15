package aa;

import a8.t6;
import a8.u6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.car.app.IOnDoneCallback;
import bi.c4;
import bi.i2;
import bi.o3;
import bi.o5;
import c8.ja;
import ch.p0;
import ch.s0;
import ci.i0;
import ci.n0;
import ci.w0;
import ci.x0;
import ci.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import d3.h0;
import di.c6;
import di.j2;
import di.k0;
import di.u8;
import fi.b3;
import fi.b4;
import fi.c3;
import fi.d3;
import fi.h2;
import fi.t3;
import fi.x6;
import fi.z3;
import h2.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.t0;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import wg.c1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    /* JADX WARN: Removed duplicated region for block: B:246:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8  */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v30 */
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
        n0 n0Var;
        int i10;
        int i11;
        TLRPC.Message message;
        boolean z12;
        boolean z13;
        boolean z14;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean[] zArr;
        boolean z15;
        ?? r11;
        TLRPC.TL_availableReaction tL_availableReaction2;
        g5 g5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        int i12 = 3;
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
                ai.n0 n0Var2 = (ai.n0) this.b;
                String str5 = (String) this.c;
                ai.h hVar2 = (ai.h) this.d;
                if (n0Var2.r != 4) {
                    return;
                }
                n0Var2.r = 3;
                n0Var2.p(str5);
                n0Var2.w.d(hVar2.a, false);
                n0Var2.w.setRevert(true);
                return;
            case 3:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.d;
                String str6 = (String) this.c;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e11) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str6), e11);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 4:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str7 = (String) this.c;
                try {
                    androidx.car.app.utils.g.d(str7.concat(" onSuccess"), new a3.h((Object) iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str7, i12));
                    return;
                } catch (RuntimeException e12) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str7, e12);
                    throw new RuntimeException(e12);
                } catch (w.f e13) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str7, e13);
                    return;
                }
            case 5:
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
            case 6:
                wp0 wp0Var = (wp0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                e2 e2Var = (e2) this.d;
                wp0Var.I = -1;
                if (tL_error != null) {
                    cc.a0(e2Var).f0(tL_error, false);
                    return;
                }
                return;
            case 7:
                c4 c4Var = (c4) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                m60 m60Var = (m60) this.d;
                wp0 wp0Var2 = c4Var.a;
                wp0Var2.e.k(c4Var.e.d, savedStarGift);
                m60Var.u();
                wp0Var2.o();
                TL_stars.TL_starGiftCollection c10 = wp0Var2.e.c(c4Var.e.d);
                if (c10 != null) {
                    cc.a0(wp0Var2.a).R(savedStarGift.gift.getDocument(), g0.X2(hd.a0(null, null, 2131750037, c6.A1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 8:
                c4 c4Var2 = (c4) this.b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                i2 i2Var = (i2) this.d;
                if (c4Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    i2Var.d(false, true);
                    c4Var2.e.o(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                i2Var.i(savedStarGift2, z10, c4Var2.d);
                c4Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = c4Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(c4Var2.b).sendRequest(savestargift, null);
                return;
            case 9:
                o5 o5Var = (o5) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.d;
                HashMap hashMap = o5Var.m;
                HashMap hashMap2 = o5Var.o;
                HashMap hashMap3 = o5Var.n;
                ArrayList arrayList = o5Var.h;
                ArrayList arrayList2 = o5Var.g;
                ArrayList arrayList3 = o5Var.f;
                int i13 = o5Var.a;
                ArrayList arrayList4 = o5Var.d;
                o5Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    np.s1(i13).Y3(resalestargifts.users, false);
                    np.s1(i13).S3(resalestargifts.chats, false);
                    o5Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i14);
                        i14++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    o5Var.u = arrayList4.size() >= o5Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    o5Var.q = resalestargifts.next_offset;
                    o5Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(u8.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(u8.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(u8.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        o5Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i15);
                            i15++;
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
                    z10 z10Var = o5Var.c;
                    if (z10Var != null) {
                        z10Var.a(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                i0 i0Var = (i0) this.b;
                ci.d dVar = (ci.d) this.c;
                List list = (List) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = dVar.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList8 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList8 == null || arrayList8 == list || (z0Var = i0Var.d) == null || i0Var.isFinished) {
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
                                if (ci.a.a(arrayList8)) {
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
                                            int i16 = 0;
                                            while (true) {
                                                String[] strArr4 = ci.a.a;
                                                if (i16 >= strArr4.length) {
                                                    i16 = z0.H9;
                                                } else if (!str.equals(strArr4[i16])) {
                                                    i16++;
                                                }
                                            }
                                            z0Var.n = z0.t(i16);
                                            cb.c cVar = z0Var.c;
                                            if (cVar != null) {
                                                ((i0) cVar.b).b0();
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
                                n0Var = i0Var.e;
                                if (n0Var == null || n0Var.F) {
                                    return;
                                }
                                if (n0Var.E) {
                                    n0Var.j();
                                    return;
                                }
                                if (n0Var.y) {
                                    return;
                                }
                                TLRPC.ShareTheme shareTheme = n0Var.I;
                                if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) || (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) == 0) {
                                    return;
                                }
                                n0Var.a(shareTheme);
                                return;
                            }
                        }
                        str2 = null;
                        if (ci.a.a(arrayList8)) {
                        }
                        n0Var = i0Var.e;
                        if (n0Var == null) {
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
                if (ci.a.a(arrayList8)) {
                }
                n0Var = i0Var.e;
                if (n0Var == null) {
                }
                break;
            case 11:
                z0 z0Var2 = (z0) this.b;
                w0 w0Var = (w0) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (w0Var.G || bitmap == null) {
                    return;
                }
                w0Var.D = bitmap;
                z0Var2.invalidate();
                return;
            case 12:
                wf.b bVar = (wf.b) this.b;
                e2.u uVar = (e2.u) this.c;
                l2.e eVar = (l2.e) this.d;
                h0 h0Var = (h0) bVar.c;
                String str8 = l0.a;
                l2.f0 f0Var = ((l2.z) h0Var).a;
                f0Var.S = uVar;
                m2.e eVar2 = f0Var.s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1017, new m2.c(U, uVar, eVar, 2));
                return;
            case 13:
                di.t tVar2 = (di.t) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Context context2 = (Context) this.d;
                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    vf.c.t(context2, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject2).url);
                }
                g0.i3(new di.c(tVar2, 6), 1000L);
                return;
            case 14:
                c6 c6Var = (c6) this.b;
                Long l10 = (Long) this.c;
                c6Var.Z1(l10.longValue(), new j2(c6Var, l10, (c1[]) this.d, 0));
                return;
            case 15:
                c6 c6Var2 = (c6) this.b;
                vf.b bVar2 = (vf.b) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                bVar2.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                c6Var2.b2.setResellPrice(cg.a.i(0L, cg.b.a));
                o3 o3Var = c6Var2.g3;
                if (o3Var != null) {
                    o3Var.run();
                }
                c6Var2.k().Q(R.raw.contact_check, 36, hd.a0(null, null, 2131750029, c6Var2.z1())).j();
                return;
            case 16:
                c6 c6Var3 = (c6) this.b;
                vf.b bVar3 = (vf.b) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                bVar3.c(false);
                c6Var3.k().f0(tL_error2, false);
                return;
            case 17:
                c6 c6Var4 = (c6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                gj gjVar = (gj) this.d;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                np.s1(c6Var4.a).Y3(messages_messages.users, false);
                np.s1(c6Var4.a).S3(messages_messages.chats, false);
                c6Var4.I2 = true;
                c6Var4.H2 = false;
                if (c6Var4.i3 != null && (message = gjVar.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = !r2.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = !r2.booleanValue();
                    }
                }
                c6Var4.j2(gjVar, null);
                return;
            case 18:
                Runnable runnable = (Runnable) this.b;
                vf.b bVar4 = (vf.b) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable.run();
                bVar4.c(false);
                c6.d2(twoStepVerificationActivity);
                return;
            case 19:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                e2 T = LaunchActivity.T();
                cc a02 = T != null ? cc.a0(T) : cc.X();
                xb q10 = runnable2 == null ? document3 != null ? a02.q(document3, charSequence) : a02.Q(R.raw.contact_check, 36, charSequence) : document3 != null ? a02.r(document3, charSequence, hd.M0(2131749888, null), runnable2) : a02.K(R.raw.contact_check, charSequence, hd.M0(2131749888, null), runnable2);
                q10.t = true;
                q10.j();
                return;
            case 20:
                c6.h1((c6) this.b, (t1) this.c, (gj) this.d);
                return;
            case 21:
                final c6 c6Var5 = (c6) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.d;
                final String str9 = (String) this.c;
                final long j3 = tL_starGiftUnique2.gift_id;
                final String str10 = tL_starGiftUnique2.title;
                final String z16 = c6Var5.z1();
                final TLRPC.Document document4 = tL_starGiftUnique2.getDocument();
                String str11 = tL_starGiftUnique2.slug;
                final t1 t1Var = new t1(3, t0.b, null);
                t1Var.r(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str11;
                ConnectionsManager.getInstance(c6Var5.a).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: di.a2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject4, final TLRPC.TL_error tL_error3) {
                        final c6 c6Var6 = c6.this;
                        final org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                        final TLRPC.Document document5 = document4;
                        final String str12 = str9;
                        final String str13 = str10;
                        final String str14 = z16;
                        final long j10 = j3;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: di.r2
                            /* JADX WARN: Removed duplicated region for block: B:14:0x021d  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x0273  */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x02d7  */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x0378  */
                            /* JADX WARN: Removed duplicated region for block: B:27:0x0369  */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x0265  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                vx0 vx0Var;
                                TLRPC.Document document6;
                                String str15;
                                vx0 vx0Var2;
                                bi.h0 h0Var2;
                                String str16;
                                CharSequence charSequence2;
                                CharSequence charSequence3;
                                c6 c6Var7;
                                float f10;
                                float f11;
                                boolean z17;
                                t1Var2.dismiss();
                                TLObject tLObject5 = tLObject4;
                                boolean z18 = tLObject5 instanceof TL_stars.UniqueStarGiftValueInfo;
                                c6 c6Var8 = c6.this;
                                if (!z18) {
                                    TLRPC.TL_error tL_error4 = tL_error3;
                                    if (tL_error4 != null) {
                                        c6Var8.k().f0(tL_error4, false);
                                        return;
                                    }
                                    return;
                                }
                                TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject5;
                                org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, c6Var8.getContext(), c6Var8.J0, false);
                                LinearLayout linearLayout = new LinearLayout(c6Var8.getContext());
                                linearLayout.setOrientation(1);
                                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                linearLayout.setClipChildren(false);
                                linearLayout.setClipToPadding(false);
                                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(c6Var8.getContext());
                                ImageReceiver imageReceiver = i9Var.getImageReceiver();
                                TLRPC.Document document7 = document5;
                                lb.c1(imageReceiver, document7, ns.q2);
                                linearLayout.addView(i9Var, c8.ja.t(ns.q2, ns.q2, 1, 0, 0, 0, 0));
                                TextView textView = new TextView(c6Var8.getContext());
                                textView.setTextSize(1, 20.0f);
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, c6Var8.J0);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                                int L = org.telegram.messenger.g0.L(21.0f);
                                int i17 = org.telegram.ui.ActionBar.j6.Fi;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i17, c6Var8.J0));
                                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
                                org.telegram.ui.ActionBar.e6 e6Var = c6Var8.J0;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.q6.j(textView, d02, M, null, e6Var);
                                textView.setGravity(17);
                                linearLayout.addView(textView, c8.ja.t(-2, 42, 1, 0, 12, 0, 15));
                                textView.setText(str12);
                                TextView textView2 = new TextView(c6Var8.getContext());
                                textView2.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.j5, c6Var8.J0);
                                textView2.setGravity(17);
                                linearLayout.addView(textView2, c8.ja.t(-2, -2, 1, 16, 0, 16, 19));
                                boolean z19 = uniqueStarGiftValueInfo.value_is_average;
                                String str17 = str13;
                                if (z19) {
                                    org.telegram.messenger.k5.q(null, null, 2131749589, new Object[]{str17}, textView2);
                                } else {
                                    boolean z20 = uniqueStarGiftValueInfo.last_sale_on_fragment;
                                    String str18 = str14;
                                    if (z20) {
                                        org.telegram.messenger.k5.q(null, null, 2131749584, new Object[]{str18}, textView2);
                                    } else {
                                        org.telegram.messenger.k5.q(null, null, 2131749581, new Object[]{str18}, textView2);
                                    }
                                }
                                FrameLayout frameLayout = new FrameLayout(c6Var8.getContext());
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                bi.h0 h0Var3 = new bi.h0(c6Var8, new hi.l3[1], frameLayout, 3);
                                vx0 vx0Var3 = new vx0(c6Var8.getContext(), c6Var8.J0);
                                frameLayout.addView(vx0Var3, c8.ja.e(-1, -1, ns.E1));
                                vx0Var3.c(hd.M0(2131749585, null), hd.f0(uniqueStarGiftValueInfo.initial_sale_date), null, null);
                                String M0 = hd.M0(2131749586, null);
                                StringBuilder sb2 = new StringBuilder("⭐️");
                                sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
                                sb2.append(" (~");
                                vx0Var3.c(M0, lb.a1(false, a8.p0.s(sb2, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                                    vx0Var3.c(hd.M0(2131749582, null), hd.f0(uniqueStarGiftValueInfo.last_sale_date), null, null);
                                    int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
                                    if (round <= 0) {
                                        vx0Var = vx0Var3;
                                        vx0Var.c(hd.M0(2131749583, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                            document6 = document7;
                                            str15 = null;
                                            vx0Var2 = vx0Var;
                                            h0Var2 = h0Var3;
                                        } else {
                                            document6 = document7;
                                            str15 = null;
                                            h0Var2 = h0Var3;
                                            u2 u2Var = new u2(h0Var2, new org.telegram.ui.Components.ec[]{(org.telegram.ui.Components.ec) ((sx0) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str17, 0);
                                            vx0 vx0Var4 = vx0Var;
                                            TableRow e14 = vx0Var4.e(hd.M0(2131749580, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", u2Var, null);
                                            vx0Var2 = vx0Var4;
                                            e14.setOnClickListener(new ah.d(u2Var, 14));
                                        }
                                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                            u2 u2Var2 = new u2(h0Var2, new org.telegram.ui.Components.ec[]{(org.telegram.ui.Components.ec) ((sx0) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str17, 1);
                                            TableRow e15 = vx0Var2.e(hd.M0(2131749588, str15), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", u2Var2, null);
                                            e15.setOnClickListener(new ah.d(u2Var2, 15));
                                        }
                                        linearLayout.addView(frameLayout, c8.ja.t(-1, -2, 7, 0, 0, 0, 12));
                                        if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                            f10 = 1.0f;
                                            f11 = 2.0f;
                                            hi.d dVar2 = new hi.d(c6Var8.getContext(), c6Var8.J0, false);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            spannableStringBuilder.append((CharSequence) hd.E(uniqueStarGiftValueInfo.listed_count, ' '));
                                            spannableStringBuilder.append((CharSequence) " ");
                                            spannableStringBuilder.append((CharSequence) "e");
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(document6, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                            spannableStringBuilder.append((CharSequence) " ");
                                            spannableStringBuilder.append((CharSequence) hd.M0(2131749577, null));
                                            dVar2.i(org.telegram.messenger.g0.I2(spannableStringBuilder, false, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f)), false, true);
                                            z17 = true;
                                            charSequence2 = "e";
                                            str16 = null;
                                            charSequence3 = " ";
                                            c6Var7 = c6Var8;
                                            dVar2.setOnClickListener(new v2(c6Var7, str17, j10, 0));
                                            linearLayout.addView(dVar2, c8.ja.t(-1, 42, 7, 0, 0, 0, 2));
                                        } else {
                                            str16 = str15;
                                            charSequence2 = "e";
                                            charSequence3 = " ";
                                            c6Var7 = c6Var8;
                                            f10 = 1.0f;
                                            f11 = 2.0f;
                                            z17 = true;
                                        }
                                        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                            hi.d dVar3 = new hi.d(c6Var7.getContext(), c6Var7.J0, false);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            spannableStringBuilder2.append((CharSequence) hd.E(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                                            spannableStringBuilder2.append(charSequence2);
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(document6, 1.5f, dVar3.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder2.append(charSequence3);
                                            spannableStringBuilder2.append((CharSequence) hd.M0(2131749578, str16));
                                            dVar3.i(org.telegram.messenger.g0.I2(spannableStringBuilder2, false, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10)), false, z17);
                                            dVar3.setOnClickListener(new ai.v2(13, c6Var7, uniqueStarGiftValueInfo));
                                            linearLayout.addView(dVar3, c8.ja.t(-1, 42, 7, 0, 0, 0, 0));
                                        }
                                        k10.O = linearLayout;
                                        k10.show();
                                    }
                                    vx0Var3.e(hd.M0(2131749583, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + hd.E(round, ' ') + "%", null, null);
                                }
                                vx0Var = vx0Var3;
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                }
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                }
                                linearLayout.addView(frameLayout, c8.ja.t(-1, -2, 7, 0, 0, 0, 12));
                                if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                }
                                if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                }
                                k10.O = linearLayout;
                                k10.show();
                            }
                        });
                    }
                });
                return;
            case 22:
                TLObject tLObject4 = (TLObject) this.b;
                k0 k0Var = (k0) this.d;
                String str12 = (String) this.c;
                if (tLObject4 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift3 = ((TL_stars.TL_payments_uniqueStarGift) tLObject4).gift;
                    if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) starGift3;
                        Long valueOf = Long.valueOf(tL_starGiftUnique3.gift_id);
                        String str13 = tL_starGiftUnique3.title;
                        if (str13 != null) {
                            str12 = str13;
                        }
                        k0Var.a(valueOf, str12);
                        return;
                    }
                }
                k0Var.a(0L, str12);
                return;
            case 23:
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                z10 z10Var2 = (z10) this.d;
                if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    z10Var2.a((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    return;
                } else {
                    u8.e(tL_error3 != null ? tL_error3.text : "NO_PAYMENT_FORM");
                    z10Var2.a(null);
                    return;
                }
            case 24:
                u8 u8Var = (u8) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList9 = u8Var.v;
                boolean[] zArr2 = u8Var.r;
                ArrayList[] arrayListArr = u8Var.q;
                int i17 = u8Var.a;
                boolean z17 = !u8Var.e;
                u8Var.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    int i18 = 0;
                    np.s1(i17).Y3(starsStatus.users, false);
                    np.s1(i17).S3(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        char c11 = 0;
                        while (i18 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i18);
                            i18++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[c11].add(starsTransaction2);
                            ArrayList[] arrayListArr2 = arrayListArr;
                            arrayListArr2[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                            arrayListArr = arrayListArr2;
                            c11 = 0;
                        }
                        ArrayList[] arrayListArr3 = arrayListArr;
                        for (int i19 = 0; i19 < 3; i19++) {
                            zArr2[i19] = !arrayListArr3[i19].isEmpty() || zArr2[i19];
                            boolean[] zArr3 = u8Var.u;
                            boolean z18 = (starsStatus.flags & 1) == 0;
                            zArr3[i19] = z18;
                            if (z18) {
                                u8Var.t[i19] = false;
                            }
                            u8Var.s[i19] = zArr3[i19] ? null : starsStatus.next_offset;
                        }
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        u8Var.x = false;
                        u8Var.w = starsStatus.subscriptions_next_offset;
                        u8Var.y = (starsStatus.flags & 4) == 0;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long j10 = u8Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z17 = true;
                    }
                    u8Var.f = starsAmount;
                    u8Var.g = 0L;
                    z13 = z14;
                } else {
                    z12 = false;
                    z13 = false;
                }
                u8Var.d = false;
                u8Var.e = true;
                if (z17) {
                    ns.f(i17).k(ns.y3, new Object[0]);
                }
                if (z13) {
                    ns.f(i17).k(ns.z3, new Object[0]);
                }
                if (z12) {
                    ns.f(i17).k(ns.A3, new Object[0]);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 25:
                u8 u8Var2 = (u8) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable4 = (Runnable) this.d;
                u8Var2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    u8Var2.Q.remove(num);
                    u8Var2.R.remove(num);
                }
                runnable4.run();
                return;
            case 26:
                boolean[] zArr4 = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                u2[] u2VarArr = (u2[]) this.d;
                zArr4[0] = false;
                g0.v1(editTextBoldCursor);
                u2VarArr[0].dismiss();
                return;
            case 27:
                d3 d3Var = (d3) this.b;
                p0 p0Var = (p0) this.c;
                View view = (View) this.d;
                b4 b4Var = d3Var.a;
                b4Var.e3 = true;
                z3 z3Var = b4Var.y1;
                ImageReceiver imageReceiver = b4Var.V2;
                boolean[] zArr5 = {false};
                x6 x6Var = b4Var.o0;
                x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new h2(1, x6Var)).setDuration(150L).start();
                int L = g0.L(8.0f);
                x6 x6Var2 = new x6(b4Var.getContext(), b4Var.h1);
                b4Var.o0 = x6Var2;
                x6Var2.setPadding(L, L, L, L);
                b4Var.n0.addView(b4Var.o0, ja.e(40, 40, 3));
                g5 g5Var2 = b4Var.Y2;
                if (g5Var2 != null) {
                    g5Var2.n(b4Var);
                    b4Var.Y2 = null;
                }
                ch.d dVar2 = b4Var.W2;
                if (dVar2 != null) {
                    dVar2.d(b4Var);
                    b4Var.W2 = null;
                }
                b4Var.Z2 = false;
                if (p0Var.g != 0) {
                    b4Var.Z2 = true;
                    g5 g5Var3 = new g5(2, b4Var.m2, p0Var.g);
                    b4Var.Y2 = g5Var3;
                    g5Var3.a(b4Var);
                } else if (p0Var.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(b4Var.m2).r.get(p0Var.f)) != null) {
                    b4Var.X2.u0(null, null, gc.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    TLRPC.Document document5 = tL_availableReaction.around_animation;
                    String a11 = ch.l0.a();
                    gc b10 = gc.b(document5);
                    zArr = zArr5;
                    imageReceiver.q0(b10, a11, null, null, null, 0);
                    if (imageReceiver.B() != null) {
                        imageReceiver.B().N(0, false, true);
                    }
                    b4Var.o0.setReaction(p0Var);
                    if (b4Var.n1) {
                        TL_stories.StoryItem storyItem2 = z3Var.a;
                        if (storyItem2.sent_reaction == null) {
                            if (storyItem2.views == null) {
                                storyItem2.views = new TL_stories.TL_storyViews();
                            }
                            TL_stories.StoryItem storyItem3 = z3Var.a;
                            TL_stories.StoryViews storyViews = storyItem3.views;
                            z15 = true;
                            storyViews.reactions_count++;
                            s0.b(null, storyItem3.sent_reaction, storyViews);
                            b4Var.i1(true);
                            if (p0Var.g != 0 && (g5Var = b4Var.o0.f) != null) {
                                ch.d a12 = ch.d.a(g5Var, false, z15);
                                b4Var.W2 = a12;
                                a12.f(b4Var);
                            }
                            b4Var.C1.j0(b4Var.l1, z3Var.a, p0Var);
                            int[] iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            int[] iArr2 = new int[2];
                            b4Var.getLocationInWindow(iArr2);
                            b4Var.g3 = iArr[0] - iArr2[0];
                            b4Var.h3 = iArr[1] - iArr2[1];
                            b4Var.i3 = view.getMeasuredHeight();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            b4Var.f3 = 0.0f;
                            b4Var.invalidate();
                            x6 x6Var3 = b4Var.o0;
                            x6Var3.setAllowDrawReaction(false);
                            ImageReceiver imageReceiver2 = x6Var3.e;
                            if (p0Var.g == 0 || (tL_availableReaction2 = (TLRPC.TL_availableReaction) si.b0(m10.t0).r.get(p0Var.f)) == null) {
                                r11 = 0;
                            } else {
                                imageReceiver2.q0(gc.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                                r11 = 0;
                                imageReceiver2.W(0);
                            }
                            ofFloat.addUpdateListener(new b3(d3Var, ofFloat, zArr, r11));
                            ofFloat.addListener(new c3(d3Var, zArr, x6Var3, r11));
                            ofFloat.setDuration(220L);
                            ofFloat.start();
                            b4Var.Z0(r11);
                            return;
                        }
                    }
                    z15 = true;
                    if (p0Var.g != 0) {
                        ch.d a122 = ch.d.a(g5Var, false, z15);
                        b4Var.W2 = a122;
                        a122.f(b4Var);
                    }
                    b4Var.C1.j0(b4Var.l1, z3Var.a, p0Var);
                    int[] iArr3 = new int[2];
                    view.getLocationInWindow(iArr3);
                    int[] iArr22 = new int[2];
                    b4Var.getLocationInWindow(iArr22);
                    b4Var.g3 = iArr3[0] - iArr22[0];
                    b4Var.h3 = iArr3[1] - iArr22[1];
                    b4Var.i3 = view.getMeasuredHeight();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    b4Var.f3 = 0.0f;
                    b4Var.invalidate();
                    x6 x6Var32 = b4Var.o0;
                    x6Var32.setAllowDrawReaction(false);
                    ImageReceiver imageReceiver22 = x6Var32.e;
                    if (p0Var.g == 0) {
                    }
                    r11 = 0;
                    ofFloat2.addUpdateListener(new b3(d3Var, ofFloat2, zArr, r11));
                    ofFloat2.addListener(new c3(d3Var, zArr, x6Var32, r11));
                    ofFloat2.setDuration(220L);
                    ofFloat2.start();
                    b4Var.Z0(r11);
                    return;
                }
                zArr = zArr5;
                b4Var.o0.setReaction(p0Var);
                if (b4Var.n1) {
                }
                z15 = true;
                if (p0Var.g != 0) {
                }
                b4Var.C1.j0(b4Var.l1, z3Var.a, p0Var);
                int[] iArr32 = new int[2];
                view.getLocationInWindow(iArr32);
                int[] iArr222 = new int[2];
                b4Var.getLocationInWindow(iArr222);
                b4Var.g3 = iArr32[0] - iArr222[0];
                b4Var.h3 = iArr32[1] - iArr222[1];
                b4Var.i3 = view.getMeasuredHeight();
                ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
                b4Var.f3 = 0.0f;
                b4Var.invalidate();
                x6 x6Var322 = b4Var.o0;
                x6Var322.setAllowDrawReaction(false);
                ImageReceiver imageReceiver222 = x6Var322.e;
                if (p0Var.g == 0) {
                }
                r11 = 0;
                ofFloat22.addUpdateListener(new b3(d3Var, ofFloat22, zArr, r11));
                ofFloat22.addListener(new c3(d3Var, zArr, x6Var322, r11));
                ofFloat22.setDuration(220L);
                ofFloat22.start();
                b4Var.Z0(r11);
                return;
            case 28:
                t3 t3Var = (t3) this.b;
                e6 e6Var = (e6) this.c;
                TL_stories.StoryItem storyItem4 = (TL_stories.StoryItem) this.d;
                b4 b4Var2 = t3Var.x;
                t4.P(b4Var2.getContext(), null, e6Var, new a3.h(t3Var, storyItem4, e6Var, 7));
                t3 t3Var2 = b4Var2.d1;
                if (t3Var2 != null) {
                    t3Var2.a();
                    return;
                }
                return;
            default:
                fi.c6 c6Var6 = (fi.c6) this.b;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.c;
                z10 z10Var3 = (z10) this.d;
                for (int i20 = 0; i20 < c6Var6.i.size(); i20++) {
                    gj gjVar2 = (gj) c6Var6.i.get(i20);
                    if (gjVar2 != null && (storyItem = gjVar2.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        z10Var3.a(document2);
                        return;
                    }
                }
                z10Var3.a(null);
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
