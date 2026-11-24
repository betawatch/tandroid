// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e6a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e6a(jva jvaVar, boolean[] zArr, jac jacVar) {
        this.a = (byte) 28;
        this.b = zArr;
        this.c = jacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        TLRPC.Chat L0;
        k47 messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        byte b2 = 12;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.a) {
            case 0:
                ((WindowManager) this.c).removeView(((l6a) this.b).B);
                break;
            case 1:
                daa daaVar = (daa) this.b;
                gm.g((String) this.c);
                c41.b0(daaVar).k(false).j();
                break;
            case 2:
                ((daa) this.b).g0((TLRPC.TL_attachMenuBot) this.c);
                break;
            case 3:
                tca tcaVar = (tca) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    tcaVar.f2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    tcaVar.V0();
                    if (tcaVar.h2) {
                        tcaVar.F0();
                    }
                }
                tcaVar.g2 = false;
                break;
            case 4:
                nha nhaVar = (nha) this.b;
                a4b a4bVar = (a4b) this.c;
                oea oeaVar = nhaVar.c0;
                if (oeaVar != null) {
                    int i = a4bVar.a;
                    oeaVar.b.e(i, oeaVar.d.i(i));
                    break;
                }
                break;
            case 5:
                iga igaVar = (iga) this.b;
                ct8 ct8Var = (ct8) this.c;
                igaVar.G = null;
                igaVar.H = null;
                ct8Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new c39((Object) ct8Var, (byte) 15)).start();
                break;
            case 6:
                ava avaVar = (ava) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                avaVar.e = !avaVar.e;
                runnableArr[0].run();
                avaVar.k(true);
                break;
            case 7:
                c41.b0(((zfa) this.b).f.y1).Q(R.raw.contact_check, 36, jb6.a0(null, null, 2131742499, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 8:
                kga kgaVar = (kga) this.b;
                String str = (String) this.c;
                if (!kgaVar.w.w1[kgaVar.r].a.isEmpty() && ((b = kgaVar.r) == 1 || b == 4)) {
                    k47 k47Var = (k47) b10.f(1, kgaVar.w.w1[b].a);
                    int e1 = k47Var.e1();
                    long B0 = k47.B0(k47Var.k);
                    nha nhaVar2 = kgaVar.w;
                    kgaVar.F(e1, B0, nhaVar2.m1 == nhaVar2.y1.getUserConfig().e() ? k47Var.P1() : 0L, str);
                } else if (kgaVar.r == 3) {
                    nha nhaVar3 = kgaVar.w;
                    kgaVar.F(0, nhaVar3.m1, nhaVar3.G, str);
                }
                byte b3 = kgaVar.r;
                if (b3 == 1 || b3 == 4) {
                    ArrayList arrayList2 = new ArrayList(kgaVar.w.w1[kgaVar.r].a);
                    kgaVar.s++;
                    Utilities.g.c(new hw9(kgaVar, str, arrayList2, b2));
                    break;
                }
                break;
            case 9:
                kga kgaVar2 = (kga) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                nha nhaVar4 = kgaVar2.w;
                boolean z = nhaVar4.Y0;
                iga[] igaVarArr = nhaVar4.n0;
                if (z) {
                    kgaVar2.s--;
                    int b4 = kgaVar2.b();
                    kgaVar2.d = arrayList3;
                    int b5 = kgaVar2.b();
                    if (kgaVar2.s == 0 || b5 != 0) {
                        nhaVar4.z1(false);
                    }
                    for (int i2 = 0; i2 < igaVarArr.length; i2++) {
                        iga igaVar2 = igaVarArr[i2];
                        if (igaVar2.F == kgaVar2.r) {
                            if (kgaVar2.s == 0 && b5 == 0) {
                                igaVar2.w.d.setText(jb6.M0(2131747901, "NoResult"));
                                igaVarArr[i2].w.f.setVisibility(8);
                                igaVarArr[i2].w.e(false, true);
                            } else if (b4 == 0) {
                                nhaVar4.i(igaVar2.h, 0, null);
                            }
                        }
                    }
                    kgaVar2.f();
                    break;
                }
                break;
            case 10:
                ana anaVar = (ana) this.b;
                zma zmaVar = (zma) this.c;
                View view = zmaVar.W;
                View view2 = anaVar.fragmentView;
                if ((view2 instanceof ViewGroup) && view != null) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    xv4 xv4Var = new xv4(anaVar.getParentActivity(), view, anaVar.getResourceProvider(), new yf9(anaVar, (byte) 24));
                    xv4Var.M = gm.L(220.0f);
                    xv4Var.n = gm.L(292.0f);
                    xv4Var.L = 0;
                    xv4Var.S = true;
                    int v0 = cmb.v0(cmb.F6, anaVar.getResourceProvider());
                    String g0 = DictationAsr.g0(zmaVar.f, zmaVar.a);
                    for (String str2 : zmaVar.V) {
                        xv4Var.a(new k7(anaVar.getParentActivity(), un3.N(str2), null, v0, str2.equals(g0)), 44, new e6a((Object) zmaVar, (Object) str2, (byte) 11));
                    }
                    xv4Var.setFocusableInTouchMode(true);
                    xv4Var.setOnKeyListener(new qn3(xv4Var, (byte) 3));
                    viewGroup.addView(xv4Var, new FrameLayout.LayoutParams(-1, -1));
                    xv4Var.requestFocus();
                    xv4Var.f();
                    break;
                }
                break;
            case 11:
                zma zmaVar2 = (zma) this.b;
                DictationAsr.b0(zmaVar2.a, (String) this.c);
                zmaVar2.c();
                break;
            case 12:
                d dVar = (d) this.b;
                new woa(dVar.getContext(), dVar.getCurrentAccount(), dVar.getResourceProvider(), (x0) this.c).show();
                break;
            case 13:
                wsa wsaVar = (wsa) this.b;
                Long l = (Long) this.c;
                String str3 = (l.longValue() >= 0 || (L0 = oc7.r1(wsaVar.a).L0(Long.valueOf(-l.longValue()))) == null) ? "" : L0.title;
                u31 Q = wsaVar.j().Q(R.raw.contact_check, 36, gm.S2(TextUtils.isEmpty(str3) ? jb6.M0(2131749393, null) : jb6.a0(null, null, 2131749394, str3)));
                Q.u = true;
                Q.j();
                break;
            case 14:
                wsa wsaVar2 = (wsa) this.b;
                fw4 fw4Var = (fw4) this.c;
                if (fw4Var != null) {
                    fw4Var.dismiss();
                    wsaVar2.O0 = true;
                }
                wsaVar2.dismiss();
                break;
            case 15:
                bva bvaVar = (bva) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                if (bvaVar instanceof qb9) {
                    ((qb9) bvaVar).n(tL_starGiftUnique);
                    break;
                }
                break;
            case 16:
                Runnable[] runnableArr2 = (Runnable[]) this.b;
                hs5 hs5Var = (hs5) this.c;
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                }
                hs5Var.a(0L);
                break;
            case 17:
                wsa wsaVar3 = (wsa) this.b;
                if (((jva) this.c).e) {
                    wsaVar3.f2.setLoading(false);
                    wsaVar3.l1();
                    break;
                } else {
                    u31 Q2 = wsaVar3.j().Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, "NO_BALANCE"));
                    Q2.u = true;
                    Q2.j();
                    break;
                }
            case 18:
                ((wsa) this.b).j().g0((TLRPC.TL_error) this.c, false);
                break;
            case 19:
                oc7.r1(((wsa) this.b).a).T3((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 20:
                wsa wsaVar4 = (wsa) this.b;
                c41.b0((yv1) this.c).L(R.raw.gift, jb6.M0(2131744785, null), gm.S2(jb6.a0(null, null, 2131744783, pg3.s(wsaVar4.S1))), jb6.M0(2131744784, null), new npa(wsaVar4, b2)).k(true);
                break;
            case 21:
                wsa wsaVar5 = (wsa) this.b;
                ((boolean[]) this.c)[0] = true;
                wsaVar5.f2.setLoading(false);
                wsaVar5.l1();
                break;
            case 22:
                wsa wsaVar6 = (wsa) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                b10.u(jb6.a0(null, null, 2131749395, tL_starGiftUnique2.title + " #" + tL_starGiftUnique2.num), wsaVar6.j(), R.raw.ic_delete, 36);
                break;
            case 23:
                ((wsa) this.b).t2((CharSequence) this.c);
                break;
            case 24:
                ((wsa) this.b).J1((TL_stars.TL_payments_uniqueStarGift) this.c);
                break;
            case 25:
                he heVar = (he) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                heVar.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        ts2.u(null, 2131743568, c41.b0(S), R.raw.error, 36);
                        break;
                    } else {
                        ts2.u(null, 2131743567, c41.b0(S), R.raw.fire_on, 36);
                        break;
                    }
                }
                break;
            case 26:
                kta ktaVar = (kta) this.b;
                yv1 yv1Var = (yv1) this.c;
                hg0 hg0Var = ktaVar.b;
                if (hg0Var != null) {
                    try {
                        hg0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ktaVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    hg0 hg0Var2 = ktaVar.b;
                    if (hg0Var2 instanceof rc2) {
                        messageObject = ((rc2) hg0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((hg0Var2 instanceof cm1) && (messageObject = ((cm1) hg0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    hva hvaVar = jva.v(messageObject.K1, false).B;
                    if (hvaVar != null) {
                        hvaVar.b();
                    }
                    TLRPC.ChatFull chatFull = yv1Var.r8;
                    k47 k47Var2 = messageObject;
                    eya eyaVar = new eya(ktaVar.getContext(), yv1Var.getCurrentAccount(), yv1Var.a(), yv1Var, k47Var2, arrayList4, chatFull == null || chatFull.paid_reactions_available, false, 0L, yv1Var.getResourceProvider());
                    k47Var2.e1();
                    hg0 hg0Var3 = ktaVar.b;
                    eyaVar.P1 = yv1Var;
                    eyaVar.Q1 = hg0Var3;
                    eyaVar.show();
                    break;
                }
                break;
            case 27:
                TLObject tLObject2 = (TLObject) this.b;
                eg9 eg9Var = (eg9) this.c;
                if (tLObject2 instanceof TL_stars.StarGifts) {
                    eg9Var.a((TL_stars.StarGifts) tLObject2);
                    break;
                } else {
                    eg9Var.a(null);
                    break;
                }
            case 28:
                boolean[] zArr = (boolean[]) this.b;
                jac jacVar = (jac) this.c;
                if (!zArr[0]) {
                    jacVar.a("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                ava avaVar2 = (ava) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList5 = avaVar2.l;
                int i3 = avaVar2.a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    oc7.r1(i3).d4(tL_payments_savedStarGifts.users, false);
                    oc7.r1(i3).X3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i4 = 0;
                        while (i4 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i4)).pinned_to_top) {
                            i4++;
                        }
                        arrayList5.add(i4, savedStarGift);
                        nm7.f(i3).k(nm7.I3, Long.valueOf(avaVar2.b), avaVar2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e6a(tca tcaVar, TLObject tLObject, Context context) {
        this.a = (byte) 3;
        this.b = tcaVar;
        this.c = tLObject;
    }

    public /* synthetic */ e6a(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
