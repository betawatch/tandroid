package ai;

import android.animation.ValueAnimator;
import android.content.Context;
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
import b8.mf;
import ci.e9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k3(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:385:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        bi.a1 a1Var;
        String str;
        int i3;
        String str2;
        bi.o0 o0Var;
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
        org.telegram.ui.Components.g5 g5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        zi ziVar;
        int f12;
        int i12 = 4;
        int i13 = 0;
        switch (this.a) {
            case 0:
                vp0 vp0Var = (vp0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                vp0Var.I = -1;
                if (tL_error != null) {
                    fc.a0(d2Var).f0(tL_error, false);
                    return;
                }
                return;
            case 1:
                o4 o4Var = (o4) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                f60 f60Var = (f60) this.d;
                vp0 vp0Var2 = o4Var.a;
                vp0Var2.e.k(o4Var.e.d, savedStarGift);
                f60Var.u();
                vp0Var2.o();
                TL_stars.TL_starGiftCollection c2 = vp0Var2.e.c(o4Var.e.d);
                if (c2 != null) {
                    fc.a0(vp0Var2.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750045, ci.l6.A1(savedStarGift.gift), c2.title))).j();
                    return;
                }
                return;
            case 2:
                o4 o4Var2 = (o4) this.b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                q2 q2Var = (q2) this.d;
                if (o4Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    q2Var.d(false, true);
                    o4Var2.e.o(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                q2Var.i(savedStarGift2, z10, o4Var2.d);
                o4Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = o4Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(o4Var2.b).sendRequest(savestargift, null);
                return;
            case 3:
                w5 w5Var = (w5) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.d;
                HashMap hashMap = w5Var.m;
                HashMap hashMap2 = w5Var.o;
                HashMap hashMap3 = w5Var.n;
                ArrayList arrayList = w5Var.h;
                ArrayList arrayList2 = w5Var.g;
                ArrayList arrayList3 = w5Var.f;
                int i14 = w5Var.a;
                ArrayList arrayList4 = w5Var.d;
                w5Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    hp.s1(i14).Y3(resalestargifts.users, false);
                    hp.s1(i14).S3(resalestargifts.chats, false);
                    w5Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i15);
                        i15++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    w5Var.u = arrayList4.size() >= w5Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    w5Var.q = resalestargifts.next_offset;
                    w5Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(e9.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(e9.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(e9.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        w5Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i16);
                            i16++;
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
                    u10 u10Var = w5Var.c;
                    if (u10Var != null) {
                        u10Var.a(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.c;
                String str3 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e10) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str3), e10);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 5:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str4 = (String) this.c;
                try {
                    androidx.car.app.utils.g.d(str4.concat(" onSuccess"), new aa.a(iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str4, 1));
                    return;
                } catch (RuntimeException e11) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str4, e11);
                    throw new RuntimeException(e11);
                } catch (w.f e12) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str4, e12);
                    return;
                }
            case 6:
                androidx.emoji2.text.n nVar = (androidx.emoji2.text.n) this.b;
                b8.w0 w0Var = (b8.w0) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.s a10 = b8.v0.a(nVar.a);
                    if (a10 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) ((androidx.emoji2.text.k) a10.b);
                    synchronized (rVar.d) {
                        rVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a10.b).a(new androidx.emoji2.text.m(w0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    w0Var.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 7:
                bi.j0 j0Var = (bi.j0) this.b;
                bi.d dVar = (bi.d) this.c;
                List list = (List) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = dVar.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList8 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList8 == null || arrayList8 == list || (a1Var = j0Var.d) == null || j0Var.isFinished) {
                    return;
                }
                bi.y0 y0Var = a1Var.n;
                if (y0Var != null && y0Var.a == 0 && (i11 = y0Var.f) >= 0) {
                    String[] strArr = bi.a.a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                        i3 = a1Var.N7;
                        if (i3 >= 0) {
                            String[] strArr2 = bi.a.a;
                            if (i3 < strArr2.length) {
                                str2 = strArr2[i3];
                                if (bi.a.a(arrayList8)) {
                                    if (str2 != null) {
                                        i10 = 0;
                                        while (true) {
                                            String[] strArr3 = bi.a.a;
                                            if (i10 < strArr3.length) {
                                                if (!str2.equals(strArr3[i10])) {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                    i10 = bi.a1.H9;
                                    a1Var.N7 = i10;
                                    if (str != null) {
                                        if (a1Var.r != null) {
                                            a1Var.r = null;
                                            a1Var.s = 1.0f;
                                        }
                                        int i17 = 0;
                                        while (true) {
                                            String[] strArr4 = bi.a.a;
                                            if (i17 >= strArr4.length) {
                                                i17 = bi.a1.H9;
                                            } else if (!str.equals(strArr4[i17])) {
                                                i17++;
                                            }
                                        }
                                        a1Var.n = bi.a1.t(i17);
                                        c6.i iVar = a1Var.c;
                                        if (iVar != null) {
                                            ((bi.j0) iVar.b).b0();
                                        }
                                    }
                                    a1Var.invalidate();
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
                        if (bi.a.a(arrayList8)) {
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
                i3 = a1Var.N7;
                if (i3 >= 0) {
                }
                str2 = null;
                if (bi.a.a(arrayList8)) {
                }
                o0Var = j0Var.e;
                if (o0Var == null) {
                }
                break;
            case 8:
                bi.a1 a1Var2 = (bi.a1) this.b;
                bi.x0 x0Var = (bi.x0) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (x0Var.G || bitmap == null) {
                    return;
                }
                x0Var.D = bitmap;
                a1Var2.invalidate();
                return;
            case 9:
                tf.b bVar = (tf.b) this.b;
                d2.v vVar = (d2.v) this.c;
                k2.e eVar = (k2.e) this.d;
                c3.i0 i0Var = (c3.i0) bVar.b;
                String str5 = g2.n0.a;
                k2.i0 i0Var2 = ((k2.c0) i0Var).a;
                i0Var2.S = vVar;
                l2.f fVar = i0Var2.s;
                l2.a U = fVar.U();
                fVar.V(U, 1017, new l2.c(U, vVar, eVar, 19));
                return;
            case 10:
                ci.v vVar2 = (ci.v) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Context context = (Context) this.d;
                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    sf.c.t(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject2).url);
                }
                org.telegram.messenger.g0.i3(new ci.d(vVar2, 6), 1000L);
                return;
            case 11:
                ci.l6 l6Var = (ci.l6) this.b;
                Long l10 = (Long) this.c;
                l6Var.Y1(l10.longValue(), new ci.p2(l6Var, l10, (xg.e1[]) this.d, 0));
                return;
            case 12:
                ci.l6 l6Var2 = (ci.l6) this.b;
                sf.b bVar2 = (sf.b) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                bVar2.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                l6Var2.Y1.setResellPrice(dg.a.i(0L, dg.b.a));
                a4 a4Var = l6Var2.d3;
                if (a4Var != null) {
                    a4Var.run();
                }
                l6Var2.k().Q(R.raw.contact_check, 36, bd.a0(null, null, 2131750037, l6Var2.z1())).j();
                return;
            case 13:
                ci.l6 l6Var3 = (ci.l6) this.b;
                sf.b bVar3 = (sf.b) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                bVar3.c(false);
                l6Var3.k().f0(tL_error2, false);
                return;
            case 14:
                ci.l6 l6Var4 = (ci.l6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                zi ziVar2 = (zi) this.d;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                hp.s1(l6Var4.a).Y3(messages_messages.users, false);
                hp.s1(l6Var4.a).S3(messages_messages.chats, false);
                l6Var4.F2 = true;
                l6Var4.E2 = false;
                if (l6Var4.f3 != null && (message = ziVar2.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = !r2.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = !r2.booleanValue();
                    }
                }
                l6Var4.i2(ziVar2, null);
                return;
            case 15:
                Runnable runnable = (Runnable) this.b;
                sf.b bVar4 = (sf.b) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable.run();
                bVar4.c(false);
                ci.l6.c2(twoStepVerificationActivity);
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                fc a02 = T != null ? fc.a0(T) : fc.X();
                ac q10 = runnable2 == null ? document3 != null ? a02.q(document3, charSequence) : a02.Q(R.raw.contact_check, 36, charSequence) : document3 != null ? a02.r(document3, charSequence, bd.M0(2131749896, null), runnable2) : a02.K(R.raw.contact_check, charSequence, bd.M0(2131749896, null), runnable2);
                q10.t = true;
                q10.j();
                return;
            case 17:
                ci.l6.h1((ci.l6) this.b, (org.telegram.ui.ActionBar.s1) this.c, (zi) this.d);
                return;
            case 18:
                final ci.l6 l6Var5 = (ci.l6) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                final String str6 = (String) this.d;
                final long j10 = tL_starGiftUnique2.gift_id;
                final String str7 = tL_starGiftUnique2.title;
                final String z16 = l6Var5.z1();
                final TLRPC.Document document4 = tL_starGiftUnique2.getDocument();
                String str8 = tL_starGiftUnique2.slug;
                final org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, org.telegram.messenger.t0.b, null);
                s1Var.r(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str8;
                ConnectionsManager.getInstance(l6Var5.a).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: ci.g2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject4, final TLRPC.TL_error tL_error3) {
                        final l6 l6Var6 = l6.this;
                        final org.telegram.ui.ActionBar.s1 s1Var2 = s1Var;
                        final TLRPC.Document document5 = document4;
                        final String str9 = str6;
                        final String str10 = str7;
                        final String str11 = z16;
                        final long j11 = j10;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.y2
                            /* JADX WARN: Removed duplicated region for block: B:14:0x021d  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x0275  */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x02d7  */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x0379  */
                            /* JADX WARN: Removed duplicated region for block: B:27:0x036a  */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x0265  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                rx0 rx0Var;
                                TLRPC.Document document6;
                                String str12;
                                rx0 rx0Var2;
                                ai.n0 n0Var;
                                String str13;
                                CharSequence charSequence2;
                                CharSequence charSequence3;
                                l6 l6Var7;
                                float f10;
                                float f11;
                                boolean z17;
                                s1Var2.dismiss();
                                TLObject tLObject5 = tLObject4;
                                boolean z18 = tLObject5 instanceof TL_stars.UniqueStarGiftValueInfo;
                                l6 l6Var8 = l6.this;
                                if (!z18) {
                                    TLRPC.TL_error tL_error4 = tL_error3;
                                    if (tL_error4 != null) {
                                        l6Var8.k().f0(tL_error4, false);
                                        return;
                                    }
                                    return;
                                }
                                TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject5;
                                org.telegram.ui.ActionBar.t2 l11 = org.telegram.messenger.k5.l(1, l6Var8.getContext(), l6Var8.J0, false);
                                LinearLayout linearLayout = new LinearLayout(l6Var8.getContext());
                                linearLayout.setOrientation(1);
                                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                linearLayout.setClipChildren(false);
                                linearLayout.setClipToPadding(false);
                                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(l6Var8.getContext());
                                ImageReceiver imageReceiver = k9Var.getImageReceiver();
                                TLRPC.Document document7 = document5;
                                wb.c1(imageReceiver, document7, hs.q2);
                                linearLayout.addView(k9Var, mf.t(hs.q2, hs.q2, 1, 0, 0, 0, 0));
                                TextView textView = new TextView(l6Var8.getContext());
                                textView.setTextSize(1, 20.0f);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, l6Var8.J0);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                                int L = org.telegram.messenger.g0.L(21.0f);
                                int i18 = org.telegram.ui.ActionBar.k6.Ci;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i18, l6Var8.J0));
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
                                org.telegram.ui.ActionBar.e6 e6Var = l6Var8.J0;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.r6.k(textView, d02, N, null, e6Var);
                                textView.setGravity(17);
                                linearLayout.addView(textView, mf.t(-2, 42, 1, 0, 12, 0, 15));
                                textView.setText(str9);
                                TextView textView2 = new TextView(l6Var8.getContext());
                                textView2.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, l6Var8.J0);
                                textView2.setGravity(17);
                                linearLayout.addView(textView2, mf.t(-2, -2, 1, 16, 0, 16, 19));
                                boolean z19 = uniqueStarGiftValueInfo.value_is_average;
                                String str14 = str10;
                                if (z19) {
                                    org.telegram.messenger.k5.r(null, null, 2131749597, new Object[]{str14}, textView2);
                                } else {
                                    boolean z20 = uniqueStarGiftValueInfo.last_sale_on_fragment;
                                    String str15 = str11;
                                    if (z20) {
                                        org.telegram.messenger.k5.r(null, null, 2131749592, new Object[]{str15}, textView2);
                                    } else {
                                        org.telegram.messenger.k5.r(null, null, 2131749589, new Object[]{str15}, textView2);
                                    }
                                }
                                FrameLayout frameLayout = new FrameLayout(l6Var8.getContext());
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                ai.n0 n0Var2 = new ai.n0(l6Var8, new gi.l3[1], frameLayout, 3);
                                rx0 rx0Var3 = new rx0(l6Var8.getContext(), l6Var8.J0);
                                frameLayout.addView(rx0Var3, mf.e(-1, -1, hs.E1));
                                rx0Var3.c(bd.M0(2131749593, null), bd.f0(uniqueStarGiftValueInfo.initial_sale_date), null, null);
                                String M0 = bd.M0(2131749594, null);
                                StringBuilder sb2 = new StringBuilder("⭐️");
                                sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
                                sb2.append(" (~");
                                rx0Var3.c(M0, wb.a1(false, a1.g.s(sb2, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                                    rx0Var3.c(bd.M0(2131749590, null), bd.f0(uniqueStarGiftValueInfo.last_sale_date), null, null);
                                    int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
                                    if (round <= 0) {
                                        rx0Var = rx0Var3;
                                        rx0Var.c(bd.M0(2131749591, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                            document6 = document7;
                                            str12 = null;
                                            rx0Var2 = rx0Var;
                                            n0Var = n0Var2;
                                        } else {
                                            document6 = document7;
                                            str12 = null;
                                            n0Var = n0Var2;
                                            b3 b3Var = new b3(n0Var, new org.telegram.ui.Components.hc[]{(org.telegram.ui.Components.hc) ((ox0) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str14, 0);
                                            rx0 rx0Var4 = rx0Var;
                                            TableRow e13 = rx0Var4.e(bd.M0(2131749588, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", b3Var, null);
                                            rx0Var2 = rx0Var4;
                                            e13.setOnClickListener(new ai.b(b3Var, 10));
                                        }
                                        int i19 = 11;
                                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                            b3 b3Var2 = new b3(n0Var, new org.telegram.ui.Components.hc[]{(org.telegram.ui.Components.hc) ((ox0) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str14, 1);
                                            TableRow e14 = rx0Var2.e(bd.M0(2131749596, str12), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", b3Var2, null);
                                            e14.setOnClickListener(new ai.b(b3Var2, i19));
                                        }
                                        linearLayout.addView(frameLayout, mf.t(-1, -2, 7, 0, 0, 0, 12));
                                        if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                            f10 = 1.0f;
                                            f11 = 2.0f;
                                            gi.d dVar2 = new gi.d(l6Var8.getContext(), l6Var8.J0, false);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            spannableStringBuilder.append((CharSequence) bd.E(uniqueStarGiftValueInfo.listed_count, ' '));
                                            spannableStringBuilder.append((CharSequence) " ");
                                            spannableStringBuilder.append((CharSequence) "e");
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(document6, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                            spannableStringBuilder.append((CharSequence) " ");
                                            spannableStringBuilder.append((CharSequence) bd.M0(2131749585, null));
                                            dVar2.i(org.telegram.messenger.g0.I2(spannableStringBuilder, false, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f)), false, true);
                                            z17 = true;
                                            charSequence2 = "e";
                                            charSequence3 = " ";
                                            str13 = null;
                                            l6Var7 = l6Var8;
                                            dVar2.setOnClickListener(new c3(l6Var7, str14, j11, 0));
                                            linearLayout.addView(dVar2, mf.t(-1, 42, 7, 0, 0, 0, 2));
                                        } else {
                                            str13 = str12;
                                            charSequence2 = "e";
                                            charSequence3 = " ";
                                            l6Var7 = l6Var8;
                                            f10 = 1.0f;
                                            f11 = 2.0f;
                                            z17 = true;
                                        }
                                        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                            gi.d dVar3 = new gi.d(l6Var7.getContext(), l6Var7.J0, false);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            spannableStringBuilder2.append((CharSequence) bd.E(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                                            spannableStringBuilder2.append(charSequence2);
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(document6, 1.5f, dVar3.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder2.append(charSequence3);
                                            spannableStringBuilder2.append((CharSequence) bd.M0(2131749586, str13));
                                            dVar3.i(org.telegram.messenger.g0.I2(spannableStringBuilder2, false, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10)), false, z17);
                                            dVar3.setOnClickListener(new ai.d(11, l6Var7, uniqueStarGiftValueInfo));
                                            linearLayout.addView(dVar3, mf.t(-1, 42, 7, 0, 0, 0, 0));
                                        }
                                        l11.O = linearLayout;
                                        l11.show();
                                    }
                                    rx0Var3.e(bd.M0(2131749591, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + bd.E(round, ' ') + "%", null, null);
                                }
                                rx0Var = rx0Var3;
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                }
                                int i192 = 11;
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                }
                                linearLayout.addView(frameLayout, mf.t(-1, -2, 7, 0, 0, 0, 12));
                                if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                }
                                if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                }
                                l11.O = linearLayout;
                                l11.show();
                            }
                        });
                    }
                });
                return;
            case 19:
                TLObject tLObject4 = (TLObject) this.b;
                ci.o0 o0Var2 = (ci.o0) this.c;
                String str9 = (String) this.d;
                if (tLObject4 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift3 = ((TL_stars.TL_payments_uniqueStarGift) tLObject4).gift;
                    if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) starGift3;
                        Long valueOf = Long.valueOf(tL_starGiftUnique3.gift_id);
                        String str10 = tL_starGiftUnique3.title;
                        if (str10 != null) {
                            str9 = str10;
                        }
                        o0Var2.a(valueOf, str9);
                        return;
                    }
                }
                o0Var2.a(0L, str9);
                return;
            case 20:
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                u10 u10Var2 = (u10) this.d;
                if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    u10Var2.a((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    return;
                } else {
                    e9.e(tL_error3 != null ? tL_error3.text : "NO_PAYMENT_FORM");
                    u10Var2.a(null);
                    return;
                }
            case 21:
                e9 e9Var = (e9) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList9 = e9Var.v;
                boolean[] zArr2 = e9Var.r;
                ArrayList[] arrayListArr = e9Var.q;
                int i18 = e9Var.a;
                boolean z17 = !e9Var.e;
                e9Var.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    int i19 = 0;
                    hp.s1(i18).Y3(starsStatus.users, false);
                    hp.s1(i18).S3(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        char c10 = 0;
                        while (i19 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i19);
                            i19++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[c10].add(starsTransaction2);
                            ArrayList[] arrayListArr2 = arrayListArr;
                            arrayListArr2[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                            arrayListArr = arrayListArr2;
                            c10 = 0;
                        }
                        ArrayList[] arrayListArr3 = arrayListArr;
                        for (int i20 = 0; i20 < 3; i20++) {
                            zArr2[i20] = !arrayListArr3[i20].isEmpty() || zArr2[i20];
                            boolean[] zArr3 = e9Var.u;
                            boolean z18 = (starsStatus.flags & 1) == 0;
                            zArr3[i20] = z18;
                            if (z18) {
                                e9Var.t[i20] = false;
                            }
                            e9Var.s[i20] = zArr3[i20] ? null : starsStatus.next_offset;
                        }
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        e9Var.x = false;
                        e9Var.w = starsStatus.subscriptions_next_offset;
                        e9Var.y = (starsStatus.flags & 4) == 0;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long j11 = e9Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j11 != starsAmount.amount) {
                        z17 = true;
                    }
                    e9Var.f = starsAmount;
                    e9Var.g = 0L;
                    z13 = z14;
                } else {
                    z12 = false;
                    z13 = false;
                }
                e9Var.d = false;
                e9Var.e = true;
                if (z17) {
                    hs.f(i18).k(hs.y3, new Object[0]);
                }
                if (z13) {
                    hs.f(i18).k(hs.z3, new Object[0]);
                }
                if (z12) {
                    hs.f(i18).k(hs.A3, new Object[0]);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 22:
                e9 e9Var2 = (e9) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable4 = (Runnable) this.d;
                e9Var2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    e9Var2.Q.remove(num);
                    e9Var2.R.remove(num);
                }
                runnable4.run();
                return;
            case 23:
                boolean[] zArr4 = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.d;
                zArr4[0] = false;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                t2VarArr[0].dismiss();
                return;
            case 24:
                ei.l3 l3Var = (ei.l3) this.b;
                dh.n0 n0Var = (dh.n0) this.c;
                View view = (View) this.d;
                ei.j4 j4Var = l3Var.a;
                j4Var.e3 = true;
                ei.h4 h4Var = j4Var.y1;
                ImageReceiver imageReceiver = j4Var.V2;
                boolean[] zArr5 = {false};
                ei.e7 e7Var = j4Var.o0;
                e7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new ei.p2(1, e7Var)).setDuration(150L).start();
                int L = org.telegram.messenger.g0.L(8.0f);
                ei.e7 e7Var2 = new ei.e7(j4Var.getContext(), j4Var.h1);
                j4Var.o0 = e7Var2;
                e7Var2.setPadding(L, L, L, L);
                j4Var.n0.addView(j4Var.o0, mf.e(40, 40, 3));
                org.telegram.ui.Components.g5 g5Var2 = j4Var.Y2;
                if (g5Var2 != null) {
                    g5Var2.n(j4Var);
                    j4Var.Y2 = null;
                }
                dh.d dVar2 = j4Var.W2;
                if (dVar2 != null) {
                    dVar2.d(j4Var);
                    j4Var.W2 = null;
                }
                j4Var.Z2 = false;
                if (n0Var.g != 0) {
                    j4Var.Z2 = true;
                    org.telegram.ui.Components.g5 g5Var3 = new org.telegram.ui.Components.g5(2, j4Var.m2, n0Var.g);
                    j4Var.Y2 = g5Var3;
                    g5Var3.a(j4Var);
                } else if (n0Var.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(j4Var.m2).r.get(n0Var.f)) != null) {
                    j4Var.X2.u0(null, null, org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    TLRPC.Document document5 = tL_availableReaction.around_animation;
                    String a11 = dh.j0.a();
                    org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(document5);
                    zArr = zArr5;
                    imageReceiver.q0(b10, a11, null, null, null, 0);
                    if (imageReceiver.B() != null) {
                        imageReceiver.B().N(0, false, true);
                    }
                    j4Var.o0.setReaction(n0Var);
                    if (j4Var.n1) {
                        TL_stories.StoryItem storyItem3 = h4Var.a;
                        if (storyItem3.sent_reaction == null) {
                            if (storyItem3.views == null) {
                                storyItem3.views = new TL_stories.TL_storyViews();
                            }
                            TL_stories.StoryItem storyItem4 = h4Var.a;
                            TL_stories.StoryViews storyViews = storyItem4.views;
                            z15 = true;
                            storyViews.reactions_count++;
                            dh.p0.b(null, storyItem4.sent_reaction, storyViews);
                            j4Var.i1(true);
                            if (n0Var.g != 0 && (g5Var = j4Var.o0.f) != null) {
                                dh.d a12 = dh.d.a(g5Var, false, z15);
                                j4Var.W2 = a12;
                                a12.f(j4Var);
                            }
                            j4Var.C1.j0(j4Var.l1, h4Var.a, n0Var);
                            int[] iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            int[] iArr2 = new int[2];
                            j4Var.getLocationInWindow(iArr2);
                            j4Var.g3 = iArr[0] - iArr2[0];
                            j4Var.h3 = iArr[1] - iArr2[1];
                            j4Var.i3 = view.getMeasuredHeight();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            j4Var.f3 = 0.0f;
                            j4Var.invalidate();
                            ei.e7 e7Var3 = j4Var.o0;
                            e7Var3.setAllowDrawReaction(false);
                            ImageReceiver imageReceiver2 = e7Var3.e;
                            if (n0Var.g == 0 || (tL_availableReaction2 = (TLRPC.TL_availableReaction) li.b0(h10.t0).r.get(n0Var.f)) == null) {
                                r11 = 0;
                            } else {
                                imageReceiver2.q0(org.telegram.messenger.ac.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                                r11 = 0;
                                imageReceiver2.W(0);
                            }
                            ofFloat.addUpdateListener(new ei.j3(l3Var, ofFloat, zArr, r11));
                            ofFloat.addListener(new ei.k3(l3Var, zArr, e7Var3, r11));
                            ofFloat.setDuration(220L);
                            ofFloat.start();
                            j4Var.Z0(r11);
                            return;
                        }
                    }
                    z15 = true;
                    if (n0Var.g != 0) {
                        dh.d a122 = dh.d.a(g5Var, false, z15);
                        j4Var.W2 = a122;
                        a122.f(j4Var);
                    }
                    j4Var.C1.j0(j4Var.l1, h4Var.a, n0Var);
                    int[] iArr3 = new int[2];
                    view.getLocationInWindow(iArr3);
                    int[] iArr22 = new int[2];
                    j4Var.getLocationInWindow(iArr22);
                    j4Var.g3 = iArr3[0] - iArr22[0];
                    j4Var.h3 = iArr3[1] - iArr22[1];
                    j4Var.i3 = view.getMeasuredHeight();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    j4Var.f3 = 0.0f;
                    j4Var.invalidate();
                    ei.e7 e7Var32 = j4Var.o0;
                    e7Var32.setAllowDrawReaction(false);
                    ImageReceiver imageReceiver22 = e7Var32.e;
                    if (n0Var.g == 0) {
                    }
                    r11 = 0;
                    ofFloat2.addUpdateListener(new ei.j3(l3Var, ofFloat2, zArr, r11));
                    ofFloat2.addListener(new ei.k3(l3Var, zArr, e7Var32, r11));
                    ofFloat2.setDuration(220L);
                    ofFloat2.start();
                    j4Var.Z0(r11);
                    return;
                }
                zArr = zArr5;
                j4Var.o0.setReaction(n0Var);
                if (j4Var.n1) {
                }
                z15 = true;
                if (n0Var.g != 0) {
                }
                j4Var.C1.j0(j4Var.l1, h4Var.a, n0Var);
                int[] iArr32 = new int[2];
                view.getLocationInWindow(iArr32);
                int[] iArr222 = new int[2];
                j4Var.getLocationInWindow(iArr222);
                j4Var.g3 = iArr32[0] - iArr222[0];
                j4Var.h3 = iArr32[1] - iArr222[1];
                j4Var.i3 = view.getMeasuredHeight();
                ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
                j4Var.f3 = 0.0f;
                j4Var.invalidate();
                ei.e7 e7Var322 = j4Var.o0;
                e7Var322.setAllowDrawReaction(false);
                ImageReceiver imageReceiver222 = e7Var322.e;
                if (n0Var.g == 0) {
                }
                r11 = 0;
                ofFloat22.addUpdateListener(new ei.j3(l3Var, ofFloat22, zArr, r11));
                ofFloat22.addListener(new ei.k3(l3Var, zArr, e7Var322, r11));
                ofFloat22.setDuration(220L);
                ofFloat22.start();
                j4Var.Z0(r11);
                return;
            case 25:
                ei.b4 b4Var = (ei.b4) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                ei.j4 j4Var2 = b4Var.x;
                org.telegram.ui.Components.t4.R(j4Var2.getContext(), null, e6Var, new aa.a(b4Var, storyItem5, e6Var, i12));
                ei.b4 b4Var2 = j4Var2.d1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    return;
                }
                return;
            case 26:
                ei.k6 k6Var = (ei.k6) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                u10 u10Var3 = (u10) this.d;
                while (i13 < k6Var.i.size()) {
                    zi ziVar3 = (zi) k6Var.i.get(i13);
                    if (ziVar3 != null && (storyItem = ziVar3.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        u10Var3.a(document2);
                        return;
                    }
                    i13++;
                }
                u10Var3.a(null);
                return;
            case 27:
                ei.z6 z6Var = (ei.z6) this.b;
                TLObject tLObject7 = (TLObject) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                int i21 = z6Var.a;
                z6Var.R = true;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    z6Var.S = null;
                    hs.f(i21).k(hs.b3, new Object[0]);
                    return;
                } else if (!(tLObject7 instanceof TL_stories.canSendStoryCount)) {
                    z6Var.n(tL_error4);
                    return;
                } else {
                    z6Var.S = new ei.t6(1, ((TL_stories.canSendStoryCount) tLObject7).count_remains, -1L);
                    hs.f(i21).k(hs.b3, new Object[0]);
                    return;
                }
            case 28:
                ei.k6 k6Var2 = (ei.k6) this.b;
                ei.j6 j6Var = (ei.j6) this.c;
                org.telegram.messenger.d3 d3Var = (org.telegram.messenger.d3) this.d;
                ArrayList arrayList11 = k6Var2.i;
                while (i13 < arrayList11.size()) {
                    zi ziVar4 = (zi) arrayList11.get(i13);
                    if (ziVar4 != null && (storyItem2 = ziVar4.l) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = j6Var.media;
                        TLRPC.Document document6 = messageMedia3.document;
                        if (document6 != null) {
                            TLRPC.Document document7 = messageMedia2.document;
                            if (document7 == null) {
                                continue;
                            } else if (document7.id == document6.id) {
                                d3Var.a((ei.j6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            d3Var.a((ei.j6) storyItem2);
                            return;
                        }
                    }
                    i13++;
                }
                d3Var.a(null);
                return;
            default:
                ei.k6 k6Var3 = (ei.k6) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                Runnable runnable5 = (Runnable) this.d;
                ei.o6 o6Var = k6Var3.q;
                ArrayList arrayList12 = k6Var3.G;
                ArrayList arrayList13 = k6Var3.i;
                ArrayList arrayList14 = k6Var3.H;
                k6Var3.F = 0;
                k6Var3.C = false;
                k6Var3.D = true;
                k6Var3.r = true;
                ArrayList arrayList15 = new ArrayList();
                if (tLObject8 instanceof Vector) {
                    ArrayList<T> arrayList16 = ((Vector) tLObject8).objects;
                    int size4 = arrayList16.size();
                    int i22 = 0;
                    while (i22 < size4) {
                        Object obj = arrayList16.get(i22);
                        i22++;
                        arrayList15.add((TL_bots.botPreviewMedia) obj);
                    }
                } else {
                    if (!(tLObject8 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject8;
                    arrayList12.clear();
                    arrayList12.addAll(previewinfo.lang_codes);
                    arrayList15.addAll(previewinfo.media);
                }
                ArrayList arrayList17 = new ArrayList(arrayList13);
                arrayList13.clear();
                arrayList14.clear();
                int size5 = arrayList15.size();
                int i23 = 0;
                while (i23 < size5) {
                    Object obj2 = arrayList15.get(i23);
                    i23++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    Runnable runnable6 = runnable5;
                    ei.o6 o6Var2 = o6Var;
                    zi ziVar5 = new zi(k6Var3.c, new ei.j6(k6Var3, k6Var3.d, botpreviewmedia));
                    int i24 = 0;
                    while (true) {
                        if (i24 >= arrayList17.size()) {
                            ziVar = null;
                        } else if (hp.t0(((zi) arrayList17.get(i24)).l.media, botpreviewmedia.media)) {
                            ziVar = (zi) arrayList17.get(i24);
                        } else {
                            i24++;
                        }
                    }
                    TL_stories.StoryItem storyItem7 = ziVar5.l;
                    TLRPC.Message message2 = ziVar5.k;
                    if (ziVar == null) {
                        f12 = k6Var3.I;
                        k6Var3.I = f12 + 1;
                    } else {
                        f12 = ziVar.f1();
                    }
                    message2.id = f12;
                    storyItem7.id = f12;
                    ziVar5.j = k6Var3;
                    ziVar5.r0(false);
                    if (arrayList14.isEmpty()) {
                        arrayList14.add(new ArrayList());
                    }
                    ((ArrayList) arrayList14.get(0)).add(Integer.valueOf(ziVar5.f1()));
                    arrayList13.add(ziVar5);
                    runnable5 = runnable6;
                    o6Var = o6Var2;
                }
                Runnable runnable7 = runnable5;
                ei.o6 o6Var3 = o6Var;
                org.telegram.messenger.g0.r(o6Var3);
                org.telegram.messenger.g0.h3(o6Var3);
                if (runnable7 != null) {
                    org.telegram.messenger.g0.h3(runnable7);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k3(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ k3(Object obj, Object obj2, TLRPC.TL_error tL_error, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.c = tL_error;
    }
}
