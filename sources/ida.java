// default package

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ida implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ida(jxa jxaVar, boolean[] zArr, icc iccVar) {
        this.a = (byte) 23;
        this.b = zArr;
        this.c = iccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        boolean z;
        String a0;
        TLRPC.Chat M0;
        r47 messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        Uri build;
        byte b2 = 8;
        byte b3 = 3;
        byte b4 = 2;
        int i = 4;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                kea keaVar = (kea) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    keaVar.f2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    keaVar.W0();
                    if (keaVar.h2) {
                        keaVar.G0();
                    }
                }
                keaVar.g2 = false;
                break;
            case 1:
                zha zhaVar = (zha) this.b;
                ir8 ir8Var = (ir8) this.c;
                zhaVar.G = null;
                zhaVar.H = null;
                ir8Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new po9((Object) ir8Var, (byte) 12)).start();
                break;
            case 2:
                axa axaVar = (axa) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                axaVar.e = !axaVar.e;
                runnableArr[0].run();
                axaVar.k(true);
                break;
            case 3:
                eja ejaVar = (eja) this.b;
                v5b v5bVar = (v5b) this.c;
                fga fgaVar = ejaVar.c0;
                if (fgaVar != null) {
                    int i3 = v5bVar.a;
                    fgaVar.b.e(i3, fgaVar.d.i(i3));
                    break;
                }
                break;
            case 4:
                d31.b0(((qha) this.b).f.y1).Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131742467, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 5:
                bia biaVar = (bia) this.b;
                String str = (String) this.c;
                if (!biaVar.w.w1[biaVar.r].a.isEmpty() && ((b = biaVar.r) == 1 || b == 4)) {
                    r47 r47Var = (r47) c00.g(1, biaVar.w.w1[b].a);
                    int e1 = r47Var.e1();
                    long B0 = r47.B0(r47Var.k);
                    eja ejaVar2 = biaVar.w;
                    biaVar.F(e1, B0, ejaVar2.m1 == ejaVar2.y1.getUserConfig().e() ? r47Var.P1() : 0L, str);
                    biaVar = biaVar;
                } else if (biaVar.r == 3) {
                    eja ejaVar3 = biaVar.w;
                    biaVar.F(0, ejaVar3.m1, ejaVar3.G, str);
                }
                byte b5 = biaVar.r;
                if (b5 == 1 || b5 == 4) {
                    ArrayList arrayList2 = new ArrayList(biaVar.w.w1[biaVar.r].a);
                    biaVar.s++;
                    Utilities.g.c(new jr9((Object) biaVar, (Object) str, (Object) arrayList2, (byte) 18));
                    break;
                }
                break;
            case 6:
                bia biaVar2 = (bia) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                eja ejaVar4 = biaVar2.w;
                boolean z2 = ejaVar4.Y0;
                zha[] zhaVarArr = ejaVar4.n0;
                if (z2) {
                    biaVar2.s--;
                    int b6 = biaVar2.b();
                    biaVar2.d = arrayList3;
                    int b7 = biaVar2.b();
                    if (biaVar2.s == 0 || b7 != 0) {
                        ejaVar4.z1(false);
                    }
                    for (int i4 = 0; i4 < zhaVarArr.length; i4++) {
                        zha zhaVar2 = zhaVarArr[i4];
                        if (zhaVar2.F == biaVar2.r) {
                            if (biaVar2.s == 0 && b7 == 0) {
                                zhaVar2.w.d.setText(ob6.M0(2131747898, "NoResult"));
                                zhaVarArr[i4].w.f.setVisibility(8);
                                zhaVarArr[i4].w.e(false, true);
                            } else if (b6 == 0) {
                                ejaVar4.i(zhaVar2.h, 0, null);
                            }
                        }
                    }
                    biaVar2.f();
                    break;
                }
                break;
            case 7:
                woa woaVar = (woa) this.b;
                voa voaVar = (voa) this.c;
                View view = voaVar.h0;
                View view2 = woaVar.fragmentView;
                if ((view2 instanceof ViewGroup) && view != null) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    zv4 zv4Var = new zv4(woaVar.getParentActivity(), view, woaVar.getResourceProvider(), new hja(woaVar, b3));
                    zv4Var.M = hl.L(220.0f);
                    zv4Var.n = hl.L(292.0f);
                    zv4Var.L = 0;
                    zv4Var.b0 = true;
                    int v0 = aob.v0(aob.G6, woaVar.getResourceProvider());
                    String i0 = DictationAsr.i0(voaVar.h, voaVar.a);
                    for (String str2 : voaVar.g0) {
                        zv4Var.a(new l7(woaVar.getParentActivity(), bn3.R(str2), null, v0, str2.equals(i0)), 44, new ida(voaVar, str2, b2));
                    }
                    zv4Var.setFocusableInTouchMode(true);
                    zv4Var.setOnKeyListener(new by1(zv4Var, (byte) 4));
                    viewGroup.addView(zv4Var, new FrameLayout.LayoutParams(-1, -1));
                    zv4Var.requestFocus();
                    zv4Var.g();
                    break;
                }
                break;
            case 8:
                voa voaVar2 = (voa) this.b;
                DictationAsr.d0(voaVar2.a, (String) this.c);
                voaVar2.e();
                break;
            case 9:
                e eVar = (e) this.b;
                new sqa(eVar.getContext(), eVar.getCurrentAccount(), eVar.getResourceProvider(), (y0) this.c).show();
                break;
            case 10:
                Runnable[] runnableArr2 = (Runnable[]) this.b;
                ks5 ks5Var = (ks5) this.c;
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                }
                ks5Var.a(0L);
                break;
            case 11:
                wua wuaVar = (wua) this.b;
                Long l = (Long) this.c;
                String str3 = (l.longValue() >= 0 || (M0 = uc7.s1(wuaVar.a).M0(Long.valueOf(-l.longValue()))) == null) ? "" : M0.title;
                d31 j = wuaVar.j();
                if (TextUtils.isEmpty(str3)) {
                    a0 = ob6.M0(2131749405, null);
                    z = true;
                } else {
                    z = true;
                    a0 = ob6.a0(null, null, 2131749406, str3);
                }
                v21 Q = j.Q(R.raw.contact_check, 36, hl.S2(a0));
                Q.u = z;
                Q.j();
                break;
            case 12:
                wua wuaVar2 = (wua) this.b;
                if (((jxa) this.c).e) {
                    wuaVar2.f2.setLoading(false);
                    wuaVar2.m1();
                    break;
                } else {
                    v21 Q2 = wuaVar2.j().Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, "NO_BALANCE"));
                    Q2.u = true;
                    Q2.j();
                    break;
                }
            case 13:
                ((wua) this.b).j().g0((TLRPC.TL_error) this.c, false);
                break;
            case 14:
                uc7.s1(((wua) this.b).a).Y3((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 15:
                wua wuaVar3 = (wua) this.b;
                d31.b0((zu1) this.c).L(R.raw.gift, ob6.M0(2131744753, null), hl.S2(ob6.a0(null, null, 2131744751, wf3.s(wuaVar3.S1))), ob6.M0(2131744752, null), new jra(wuaVar3, (byte) 10)).k(true);
                break;
            case 16:
                wua wuaVar4 = (wua) this.b;
                ((boolean[]) this.c)[0] = true;
                wuaVar4.f2.setLoading(false);
                wuaVar4.m1();
                break;
            case 17:
                wua wuaVar5 = (wua) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                c00.v(ob6.a0(null, null, 2131749407, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), wuaVar5.j(), R.raw.ic_delete, 36);
                break;
            case 18:
                ((wua) this.b).u2((CharSequence) this.c);
                break;
            case 19:
                ((wua) this.b).K1((TL_stars.TL_payments_uniqueStarGift) this.c);
                break;
            case 20:
                id idVar = (id) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                idVar.dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        bs2.v(null, 2131743536, d31.b0(S), R.raw.error, 36);
                        break;
                    } else {
                        bs2.v(null, 2131743535, d31.b0(S), R.raw.fire_on, 36);
                        break;
                    }
                }
                break;
            case 21:
                lva lvaVar = (lva) this.b;
                zu1 zu1Var = (zu1) this.c;
                jf0 jf0Var = lvaVar.b;
                if (jf0Var != null) {
                    try {
                        jf0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    lvaVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    jf0 jf0Var2 = lvaVar.b;
                    if (jf0Var2 instanceof wb2) {
                        messageObject = ((wb2) jf0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((jf0Var2 instanceof dl1) && (messageObject = ((dl1) jf0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    hxa hxaVar = jxa.v(messageObject.K1, false).B;
                    if (hxaVar != null) {
                        hxaVar.b();
                    }
                    TLRPC.ChatFull chatFull = zu1Var.r8;
                    r47 r47Var2 = messageObject;
                    e0b e0bVar = new e0b(lvaVar.getContext(), zu1Var.getCurrentAccount(), zu1Var.a(), zu1Var, r47Var2, arrayList4, chatFull == null || chatFull.paid_reactions_available, false, 0L, zu1Var.getResourceProvider());
                    r47Var2.e1();
                    jf0 jf0Var3 = lvaVar.b;
                    e0bVar.P1 = zu1Var;
                    e0bVar.Q1 = jf0Var3;
                    e0bVar.show();
                    break;
                }
                break;
            case 22:
                TLObject tLObject2 = (TLObject) this.c;
                sh9 sh9Var = (sh9) this.b;
                if (tLObject2 instanceof TL_stars.StarGifts) {
                    sh9Var.a((TL_stars.StarGifts) tLObject2);
                    break;
                } else {
                    sh9Var.a(null);
                    break;
                }
            case 23:
                boolean[] zArr = (boolean[]) this.b;
                icc iccVar = (icc) this.c;
                if (!zArr[0]) {
                    iccVar.a("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            case 24:
                axa axaVar2 = (axa) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList5 = axaVar2.l;
                int i5 = axaVar2.a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    uc7.s1(i5).j4(tL_payments_savedStarGifts.users, false);
                    uc7.s1(i5).c4(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i6 = 0;
                        while (i6 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i6)).pinned_to_top) {
                            i6++;
                        }
                        arrayList5.add(i6, savedStarGift);
                        jn7.f(i5).k(jn7.I3, Long.valueOf(axaVar2.b), axaVar2);
                        break;
                    }
                }
                break;
            case 25:
                new d31(((nx0[]) this.b)[0].F, (vnb) this.c).Q(R.raw.copy, 36, ob6.M0(2131744604, null)).k(false);
                break;
            case 26:
                e0b e0bVar2 = (e0b) this.b;
                hxa hxaVar2 = (hxa) this.c;
                e0bVar2.N1 = true;
                e0bVar2.F0(new fxa(hxaVar2, b4));
                hl.d3(new oza(e0bVar2, (byte) 1), 240L);
                break;
            case 27:
                k09 k09Var = (k09) this.b;
                j2b j2bVar = (j2b) this.c;
                v34 v34Var = (v34) ((ny8) k09Var.b).f;
                v34Var.getClass();
                ug5 ug5Var = (ug5) v34Var.b;
                yve.p(ug5Var.k);
                po5 po5Var = j2bVar.e;
                HashSet hashSet = ug5Var.h;
                no5 listIterator = po5Var.listIterator(0);
                while (listIterator.hasNext()) {
                    h2b h2bVar = (h2b) listIterator.next();
                    String str4 = h2bVar.a;
                    i2b i2bVar = h2bVar.c;
                    String str5 = h2bVar.b;
                    if (hashSet.contains(str4) && !hashSet.contains(str5)) {
                        mo5 mo5Var = new mo5(i);
                        mo5 mo5Var2 = new mo5(i);
                        po5 po5Var2 = ug5Var.d;
                        to5 to5Var = i2bVar.c;
                        int size = po5Var2.size();
                        int i7 = i2;
                        while (i7 < size) {
                            Object obj = po5Var2.get(i7);
                            i7++;
                            int i8 = i2;
                            qh5 qh5Var = (qh5) obj;
                            Uri uri = (Uri) qh5Var.b.get(str4);
                            String str6 = qh5Var.a.b;
                            uri.getClass();
                            if (to5Var.containsKey(str6)) {
                                build = (Uri) to5Var.get(str6);
                                build.getClass();
                            } else {
                                build = ug5.b(uri, i2bVar).build();
                            }
                            if (build != null) {
                                mo5Var.c(build);
                                mo5Var2.c(uri);
                            }
                            i2 = i8;
                        }
                        int i9 = i2;
                        ug5.d(h2bVar, ug5Var.e, mo5Var, mo5Var2);
                        ug5.d(h2bVar, ug5Var.f, mo5Var, mo5Var2);
                        ug5.d(h2bVar, ug5Var.g, mo5Var, mo5Var2);
                        hashSet.add(str5);
                        zm9 zm9Var = ug5Var.b;
                        j99 f = mo5Var.f();
                        j99 f2 = mo5Var2.f();
                        HashMap hashMap = ((mb3) zm9Var.b).d;
                        yve.p(f.d == f2.d ? 1 : i9);
                        for (int i10 = i9; i10 < f.d; i10++) {
                            lb3 lb3Var = (lb3) hashMap.get(f2.get(i10));
                            lb3Var.getClass();
                            Uri uri2 = (Uri) f.get(i10);
                            lb3Var.a.b.put(str5, uri2);
                            HashMap hashMap2 = lb3Var.b;
                            kb3 kb3Var = (kb3) hashMap2.get(uri2);
                            if (kb3Var == null) {
                                hashMap2.put(uri2, new kb3(lb3Var.d, uri2, str5));
                            } else {
                                kb3Var.b.add(str5);
                            }
                            hashMap.put(uri2, lb3Var);
                        }
                        i2 = i9;
                        i = 4;
                    }
                }
                ug5Var.m = j2bVar.d;
                ug5Var.e(-9223372036854775807L);
                break;
            case 28:
                k3b k3bVar = (k3b) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                k3bVar.H = false;
                h3b[] h3bVarArr = (h3b[]) arrayList6.toArray(new h3b[0]);
                k3bVar.I = h3bVarArr;
                if (h3bVarArr.length > 0) {
                    k3bVar.c0.setScaleX(0.3f);
                    k3bVar.c0.setScaleY(0.3f);
                    k3bVar.c0.setAlpha(0.0f);
                    k3bVar.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(k43.f).start();
                    break;
                }
                break;
            default:
                p3b p3bVar = (p3b) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                if (p3bVar.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p3bVar.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        p3bVar.d(p3bVar.r, p3bVar.f, p3bVar.s);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ida(kea keaVar, TLObject tLObject, Context context) {
        this.a = (byte) 0;
        this.b = keaVar;
        this.c = tLObject;
    }

    public /* synthetic */ ida(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ida(TLObject tLObject, sh9 sh9Var) {
        this.a = (byte) 22;
        this.c = tLObject;
        this.b = sh9Var;
    }
}
