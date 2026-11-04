package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j50(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci.v6 v6Var;
        boolean z10;
        boolean z11;
        int indexOf;
        int K;
        int i3;
        boolean z12 = false;
        int i10 = 4;
        boolean z13 = false;
        boolean z14 = true;
        switch (this.a) {
            case 0:
                t50 t50Var = (t50) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                t50Var.A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new zs(editTextBoldCursor, i10));
                break;
            case 1:
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.b;
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.c;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", chatFull.guard_bot_id);
                boVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                o70 o70Var = (o70) this.b;
                if (o70Var.P0 == ((t70) this.c)) {
                    o70Var.performLongClick();
                    o70Var.P0 = null;
                    o70Var.N0.f(true);
                    break;
                }
                break;
            case 3:
                ((m2.p0) this.b).n((w70) this.c, false);
                break;
            case 4:
                r80 r80Var = (r80) this.b;
                if (!((boolean[]) this.c)[0] && (v6Var = r80Var.R) != null) {
                    v6Var.run();
                }
                r80Var.R = null;
                break;
            case 5:
                zh.b bVar = (zh.b) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                bVar.A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.h3(new zs(editTextBoldCursor2, 6));
                break;
            case 6:
                i9 i9Var = (i9) this.b;
                Runnable runnable = (Runnable) this.c;
                i9Var.getClass();
                runnable.run();
                ((HashMap) i9Var.b).remove(runnable);
                break;
            case 7:
                bf0 bf0Var = (bf0) this.b;
                TLObject tLObject = (TLObject) this.c;
                bf0Var.N = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    bf0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        bf0Var.a(false);
                        break;
                    } else {
                        bf0Var.d();
                        bf0Var.c.g3.O(true);
                        break;
                    }
                }
                break;
            case 8:
                gf0 gf0Var = (gf0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = gf0Var.a;
                int i11 = gf0Var.s;
                int size = arrayList.size();
                gf0Var.s = size;
                if (i11 != size && gf0Var.Q != null) {
                    gf0Var.g();
                }
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    df0 df0Var = (df0) arrayList2.get(i12);
                    if (df0Var.o && !df0Var.p) {
                        arrayList.add(df0Var);
                    } else if (gf0.i(df0Var.a, arrayList) == null) {
                        gf0 gf0Var2 = df0Var.y;
                        float f10 = gf0Var2.L;
                        RectF rectF = df0Var.c;
                        RectF rectF2 = df0Var.f;
                        w70 w70Var = df0Var.r;
                        if (w70Var != null) {
                            w70Var.a();
                            df0Var.t = z13;
                            df0Var.s = z13;
                        }
                        df0Var.o = z14;
                        boolean z15 = rectF.left - 1.0f <= f10 ? z14 : z13;
                        boolean z16 = rectF.right + 1.0f >= ((float) gf0Var2.getMeasuredWidth()) - f10;
                        if (z15 && z16) {
                            z15 = false;
                            z16 = false;
                        }
                        df0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z15) {
                            rectF2.right = rectF2.left;
                        } else if (z16) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = df0Var.a;
                            if (i13 == 3 || i13 == 2) {
                                z10 = true;
                                if (gf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    z11 = false;
                                    df0Var.e.e(z10, 0.0f);
                                    arrayList.add(df0Var);
                                    i12++;
                                    z12 = z11;
                                    z13 = false;
                                    z14 = true;
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z11 = false;
                            df0Var.e.e(z10, 0.0f);
                            arrayList.add(df0Var);
                            i12++;
                            z12 = z11;
                            z13 = false;
                            z14 = true;
                        }
                        z10 = true;
                        z11 = false;
                        df0Var.e.e(z10, 0.0f);
                        arrayList.add(df0Var);
                        i12++;
                        z12 = z11;
                        z13 = false;
                        z14 = true;
                    }
                    z11 = z12;
                    i12++;
                    z12 = z11;
                    z13 = false;
                    z14 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                gf0Var.invalidate();
                break;
            case 9:
                gf0 gf0Var3 = (gf0) this.b;
                df0 df0Var2 = (df0) this.c;
                ff0 ff0Var = gf0Var3.y;
                int i14 = df0Var2.a;
                RectF rectF3 = df0Var2.d;
                ProfileActivity.m0(((org.telegram.ui.jt0) ff0Var).b, i14, rectF3.left, rectF3.top);
                break;
            case 10:
                RLottieNative rLottieNative = (RLottieNative) this.b;
                RLottieNative rLottieNative2 = (RLottieNative) this.c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    break;
                }
                break;
            case 11:
                kh0 kh0Var = (kh0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = kh0Var.r;
                kh0Var.n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    jh0 jh0Var = (jh0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            TLObject tLObject2 = ((jh0) arrayList4.get(i16)).a;
                            long j10 = tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L;
                            TLObject tLObject3 = jh0Var.a;
                            if (j10 != (tLObject3 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject3).id : tLObject3 instanceof TLRPC.User ? ((TLRPC.User) tLObject3).id : 0L)) {
                                i16++;
                            } else if (jh0Var.c > 0) {
                                ((jh0) arrayList4.get(i16)).c = jh0Var.c;
                            }
                        } else {
                            arrayList4.add(jh0Var);
                        }
                    }
                }
                q0.a aVar = kh0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                kh0Var.a();
                break;
            case 12:
                bm0 bm0Var = (bm0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = bm0Var.L;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = bm0Var.K()) < bm0Var.b()) {
                    arrayList5.remove(indexOf);
                    bm0Var.s(K + 1 + indexOf);
                    int size4 = bm0Var.k0.e.size();
                    int size5 = arrayList5.size();
                    if (bm0Var.H0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        bm0Var.s(K);
                        break;
                    }
                }
                break;
            case 13:
                bm0 bm0Var2 = (bm0) this.b;
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.c;
                bm0Var2.S();
                fc.a0(uwVar).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                break;
            case 14:
                ((nm0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 15:
                le leVar = (le) this.b;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.c;
                if (wmVar != null) {
                    wmVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    leVar.dismiss();
                    break;
                }
                break;
            case 16:
                ((WindowManager) this.c).removeView(((le) this.b).B);
                break;
            case 17:
                oo0 oo0Var = (oo0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 != null) {
                    oo0Var.d2 = (TLRPC.TL_exportedMessageLink) tLObject4;
                    oo0Var.a1();
                    if (oo0Var.f2) {
                        oo0Var.M0();
                    }
                }
                oo0Var.e2 = false;
                break;
            case 18:
                ws0 ws0Var = (ws0) this.b;
                ei.s6 s6Var = (ei.s6) this.c;
                yp0 yp0Var = ws0Var.c0;
                if (yp0Var != null) {
                    int i17 = s6Var.a;
                    yp0Var.b.d(i17, yp0Var.d.i(i17));
                    break;
                }
                break;
            case 19:
                rr0 rr0Var = (rr0) this.b;
                ai.d2 d2Var = (ai.d2) this.c;
                rr0Var.G = null;
                rr0Var.H = null;
                d2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new a60(d2Var, 20)).start();
                break;
            case 20:
                ci.v8 v8Var = (ci.v8) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                v8Var.e = !v8Var.e;
                runnableArr[0].run();
                v8Var.j(true);
                break;
            case 21:
                fc.a0(((ir0) this.b).f.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.bd.a0(null, null, 2131742846, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 22:
                tr0 tr0Var = (tr0) this.b;
                String str = (String) this.c;
                if (!tr0Var.w.w1[tr0Var.r].a.isEmpty() && ((i3 = tr0Var.r) == 1 || i3 == 4)) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, tr0Var.w.w1[i3].a);
                    int f12 = ziVar.f1();
                    long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                    ws0 ws0Var2 = tr0Var.w;
                    tr0Var.F(f12, B0, ws0Var2.m1 == ws0Var2.y1.getUserConfig().e() ? ziVar.Q1() : 0L, str);
                } else if (tr0Var.r == 3) {
                    ws0 ws0Var3 = tr0Var.w;
                    tr0Var.F(0, ws0Var3.m1, ws0Var3.G, str);
                }
                int i18 = tr0Var.r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList6 = new ArrayList(tr0Var.w.w1[tr0Var.r].a);
                    tr0Var.s++;
                    Utilities.g.c(new e7(tr0Var, str, arrayList6, 28));
                    break;
                }
                break;
            case 23:
                tr0 tr0Var2 = (tr0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                ws0 ws0Var4 = tr0Var2.w;
                boolean z17 = ws0Var4.Y0;
                rr0[] rr0VarArr = ws0Var4.n0;
                if (z17) {
                    tr0Var2.s--;
                    int b10 = tr0Var2.b();
                    tr0Var2.d = arrayList7;
                    int b11 = tr0Var2.b();
                    if (tr0Var2.s == 0 || b11 != 0) {
                        ws0Var4.z1(false);
                    }
                    for (int i19 = 0; i19 < rr0VarArr.length; i19++) {
                        rr0 rr0Var2 = rr0VarArr[i19];
                        if (rr0Var2.F == tr0Var2.r) {
                            if (tr0Var2.s == 0 && b11 == 0) {
                                rr0Var2.w.d.setText(org.telegram.messenger.bd.M0(2131748175, "NoResult"));
                                rr0VarArr[i19].w.f.setVisibility(8);
                                rr0VarArr[i19].w.e(false, true);
                            } else if (b10 == 0) {
                                ws0Var4.D(rr0Var2.h, 0, null);
                            }
                        }
                    }
                    tr0Var2.f();
                    break;
                }
                break;
            case 24:
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                org.telegram.messenger.hs f11 = org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0);
                Boolean bool = Boolean.FALSE;
                f11.m(org.telegram.messenger.hs.s3, bool, tLObject5, document, null, bool);
                break;
            case 25:
                org.telegram.messenger.hp.s1(((jw0) this.b).a.a).h5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 26:
                n01 n01Var = (n01) this.b;
                String str2 = (String) this.c;
                n01Var.P = null;
                org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(n01Var.a).q7;
                long j11 = -n01Var.b;
                ei eiVar = new ei(10, n01Var, str2);
                c00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = c00Var.getMessagesController().j1(-j11);
                tL_messages_getForumTopics.q = str2;
                tL_messages_getForumTopics.limit = 50;
                n01Var.O = c00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.fj(c00Var, j11, eiVar, 10));
                break;
            case 27:
                g11 g11Var = (g11) this.b;
                org.telegram.messenger.hp.s1(g11Var.e).q7.d((ArrayList) this.c, -g11Var.f);
                int i20 = g11.m0;
                break;
            case 28:
                g11 g11Var2 = (g11) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                g11Var2.getClass();
                org.telegram.messenger.hp.s1(g11Var2.e).V2(0, updates.chats.get(0).id, true);
                break;
            default:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.e0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j50(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }
}
