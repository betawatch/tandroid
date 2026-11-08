package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v80(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        int indexOf;
        int K;
        int i7;
        boolean z11 = false;
        int i10 = 6;
        boolean z12 = false;
        boolean z13 = true;
        switch (this.a) {
            case 0:
                yh.b bVar = (yh.b) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                bVar.A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new bt(editTextBoldCursor, i10));
                break;
            case 1:
                ob.c cVar = (ob.c) this.b;
                Runnable runnable = (Runnable) this.c;
                cVar.getClass();
                runnable.run();
                cVar.a.remove(runnable);
                break;
            case 2:
                ze0 ze0Var = (ze0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ze0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    ze0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ze0Var.a(false);
                        break;
                    } else {
                        ze0Var.d();
                        ze0Var.c.f3.O(true);
                        break;
                    }
                }
                break;
            case 3:
                ef0 ef0Var = (ef0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = ef0Var.a;
                int i11 = ef0Var.s;
                int size = arrayList.size();
                ef0Var.s = size;
                if (i11 != size && ef0Var.P != null) {
                    ef0Var.g();
                }
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    bf0 bf0Var = (bf0) arrayList2.get(i12);
                    if (bf0Var.o && !bf0Var.p) {
                        arrayList.add(bf0Var);
                    } else if (ef0.i(bf0Var.a, arrayList) == null) {
                        ef0 ef0Var2 = bf0Var.y;
                        float f10 = ef0Var2.K;
                        RectF rectF = bf0Var.c;
                        RectF rectF2 = bf0Var.f;
                        a80 a80Var = bf0Var.r;
                        if (a80Var != null) {
                            a80Var.a();
                            bf0Var.t = z12;
                            bf0Var.s = z12;
                        }
                        bf0Var.o = z13;
                        boolean z14 = rectF.left - 1.0f <= f10 ? z13 : z12;
                        boolean z15 = rectF.right + 1.0f >= ((float) ef0Var2.getMeasuredWidth()) - f10;
                        if (z14 && z15) {
                            z14 = false;
                            z15 = false;
                        }
                        bf0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z14) {
                            rectF2.right = rectF2.left;
                        } else if (z15) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = bf0Var.a;
                            if (i13 == 3 || i13 == 2) {
                                z9 = true;
                                if (ef0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    z10 = false;
                                    bf0Var.e.e(z9, 0.0f);
                                    arrayList.add(bf0Var);
                                    i12++;
                                    z11 = z10;
                                    z12 = false;
                                    z13 = true;
                                }
                            } else {
                                z9 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z10 = false;
                            bf0Var.e.e(z9, 0.0f);
                            arrayList.add(bf0Var);
                            i12++;
                            z11 = z10;
                            z12 = false;
                            z13 = true;
                        }
                        z9 = true;
                        z10 = false;
                        bf0Var.e.e(z9, 0.0f);
                        arrayList.add(bf0Var);
                        i12++;
                        z11 = z10;
                        z12 = false;
                        z13 = true;
                    }
                    z10 = z11;
                    i12++;
                    z11 = z10;
                    z12 = false;
                    z13 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ef0Var.invalidate();
                break;
            case 4:
                ef0 ef0Var3 = (ef0) this.b;
                bf0 bf0Var2 = (bf0) this.c;
                df0 df0Var = ef0Var3.y;
                int i14 = bf0Var2.a;
                RectF rectF3 = bf0Var2.d;
                ProfileActivity.m0(((org.telegram.ui.tt0) df0Var).b, i14, rectF3.left, rectF3.top);
                break;
            case 5:
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
            case 6:
                hh0 hh0Var = (hh0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = hh0Var.r;
                hh0Var.n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    gh0 gh0Var = (gh0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            TLObject tLObject2 = ((gh0) arrayList4.get(i16)).a;
                            long j3 = tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L;
                            TLObject tLObject3 = gh0Var.a;
                            if (j3 != (tLObject3 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject3).id : tLObject3 instanceof TLRPC.User ? ((TLRPC.User) tLObject3).id : 0L)) {
                                i16++;
                            } else if (gh0Var.c > 0) {
                                ((gh0) arrayList4.get(i16)).c = gh0Var.c;
                            }
                        } else {
                            arrayList4.add(gh0Var);
                        }
                    }
                }
                q0.a aVar = hh0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                hh0Var.a();
                break;
            case 7:
                yl0 yl0Var = (yl0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = yl0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = yl0Var.K()) < yl0Var.b()) {
                    arrayList5.remove(indexOf);
                    yl0Var.s(K + 1 + indexOf);
                    int size4 = yl0Var.j0.e.size();
                    int size5 = arrayList5.size();
                    if (yl0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        yl0Var.s(K);
                        break;
                    }
                }
                break;
            case 8:
                yl0 yl0Var2 = (yl0) this.b;
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.c;
                yl0Var2.S();
                hc.a0(wwVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                break;
            case 9:
                ((km0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 10:
                ne neVar = (ne) this.b;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.c;
                if (anVar != null) {
                    anVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    neVar.dismiss();
                    break;
                }
                break;
            case 11:
                ((WindowManager) this.c).removeView(((ne) this.b).B);
                break;
            case 12:
                mo0 mo0Var = (mo0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 != null) {
                    mo0Var.c2 = (TLRPC.TL_exportedMessageLink) tLObject4;
                    mo0Var.a1();
                    if (mo0Var.e2) {
                        mo0Var.M0();
                    }
                }
                mo0Var.d2 = false;
                break;
            case 13:
                xs0 xs0Var = (xs0) this.b;
                di.r6 r6Var = (di.r6) this.c;
                yp0 yp0Var = xs0Var.b0;
                if (yp0Var != null) {
                    int i17 = r6Var.a;
                    yp0Var.b.d(i17, yp0Var.d.i(i17));
                    break;
                }
                break;
            case 14:
                sr0 sr0Var = (sr0) this.b;
                di.a4 a4Var = (di.a4) this.c;
                sr0Var.F = null;
                sr0Var.G = null;
                a4Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new e60(a4Var, 20)).start();
                break;
            case 15:
                bi.v9 v9Var = (bi.v9) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                v9Var.e = !v9Var.e;
                runnableArr[0].run();
                v9Var.j(true);
                break;
            case 16:
                hc.a0(((jr0) this.b).f.x1).Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131742839, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 17:
                ur0 ur0Var = (ur0) this.b;
                String str = (String) this.c;
                if (!ur0Var.w.v1[ur0Var.r].a.isEmpty() && ((i7 = ur0Var.r) == 1 || i7 == 4)) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, ur0Var.w.v1[i7].a);
                    int f12 = ijVar.f1();
                    long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                    xs0 xs0Var2 = ur0Var.w;
                    ur0Var.F(f12, B0, xs0Var2.l1 == xs0Var2.x1.getUserConfig().e() ? ijVar.Q1() : 0L, str);
                } else if (ur0Var.r == 3) {
                    xs0 xs0Var3 = ur0Var.w;
                    ur0Var.F(0, xs0Var3.l1, xs0Var3.F, str);
                }
                int i18 = ur0Var.r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList6 = new ArrayList(ur0Var.w.v1[ur0Var.r].a);
                    ur0Var.s++;
                    Utilities.g.c(new ng(ur0Var, str, arrayList6, 24));
                    break;
                }
                break;
            case 18:
                ur0 ur0Var2 = (ur0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                xs0 xs0Var4 = ur0Var2.w;
                boolean z16 = xs0Var4.X0;
                sr0[] sr0VarArr = xs0Var4.m0;
                if (z16) {
                    ur0Var2.s--;
                    int b10 = ur0Var2.b();
                    ur0Var2.d = arrayList7;
                    int b11 = ur0Var2.b();
                    if (ur0Var2.s == 0 || b11 != 0) {
                        xs0Var4.z1(false);
                    }
                    for (int i19 = 0; i19 < sr0VarArr.length; i19++) {
                        sr0 sr0Var2 = sr0VarArr[i19];
                        if (sr0Var2.E == ur0Var2.r) {
                            if (ur0Var2.s == 0 && b11 == 0) {
                                sr0Var2.w.d.setText(org.telegram.messenger.id.M0(2131748168, "NoResult"));
                                sr0VarArr[i19].w.f.setVisibility(8);
                                sr0VarArr[i19].w.e(false, true);
                            } else if (b10 == 0) {
                                xs0Var4.D(sr0Var2.h, 0, null);
                            }
                        }
                    }
                    ur0Var2.f();
                    break;
                }
                break;
            case 19:
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0);
                Boolean bool = Boolean.FALSE;
                f11.m(org.telegram.messenger.qs.s3, bool, tLObject5, document, null, bool);
                break;
            case 20:
                org.telegram.messenger.qp.s1(((kw0) this.b).a.a).h5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 21:
                s01 s01Var = (s01) this.b;
                String str2 = (String) this.c;
                s01Var.O = null;
                org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(s01Var.a).q7;
                long j10 = -s01Var.b;
                fx fxVar = new fx(i10, s01Var, str2);
                k00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = k00Var.getMessagesController().j1(-j10);
                tL_messages_getForumTopics.q = str2;
                tL_messages_getForumTopics.limit = 50;
                s01Var.N = k00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.oj(k00Var, j10, fxVar, 10));
                break;
            case 22:
                m11 m11Var = (m11) this.b;
                org.telegram.messenger.qp.s1(m11Var.e).q7.d((ArrayList) this.c, -m11Var.f);
                int i20 = m11.l0;
                break;
            case 23:
                m11 m11Var2 = (m11) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                m11Var2.getClass();
                org.telegram.messenger.qp.s1(m11Var2.e).V2(0, updates.chats.get(0).id, true);
                break;
            case 24:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.d0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 25:
                k21 k21Var = (k21) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.messenger.au auVar = k21Var.p1;
                k21Var.i1 = null;
                if (tLObject6 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject6;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        k21Var.L1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (auVar != null) {
                            auVar.set(richMessage);
                            k21Var.E1.D(auVar);
                            break;
                        }
                    }
                }
                if (k21Var.L1) {
                    k21Var.dismiss();
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.P4, 1, org.telegram.messenger.id.M0(2131743949, null));
                    break;
                } else {
                    org.telegram.messenger.k5.p(null, 2131743949, new hc((FrameLayout) k21Var.b, k21Var.I0), null);
                    g21 g21Var = k21Var.t1.e;
                    String str3 = k21Var.s1;
                    k21Var.r1 = str3;
                    g21Var.setText(k21.O0(str3, null, null));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.b;
                ((org.telegram.ui.ActionBar.g1) this.c).d(true);
                a31.a(bkVar.getContext(), bkVar.d);
                break;
            case 27:
                ((org.telegram.messenger.f10) this.c).J(((org.telegram.ui.bk) this.b).b, false, false);
                break;
            case 28:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                if (tLObject7 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.hl0((TLRPC.PaymentReceipt) tLObject7));
                    break;
                } else {
                    int i21 = UndoView.i0;
                    undoView.getClass();
                    break;
                }
            default:
                ((x31) this.b).D.onClick((org.telegram.ui.Cells.q8) this.c);
                break;
        }
    }

    public /* synthetic */ v80(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }
}
