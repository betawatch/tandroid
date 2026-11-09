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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w80(int i7, Object obj, Object obj2) {
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
                af0 af0Var = (af0) this.b;
                TLObject tLObject = (TLObject) this.c;
                af0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    af0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        af0Var.a(false);
                        break;
                    } else {
                        af0Var.d();
                        af0Var.c.f3.O(true);
                        break;
                    }
                }
                break;
            case 3:
                ff0 ff0Var = (ff0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = ff0Var.a;
                int i11 = ff0Var.s;
                int size = arrayList.size();
                ff0Var.s = size;
                if (i11 != size && ff0Var.P != null) {
                    ff0Var.g();
                }
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    cf0 cf0Var = (cf0) arrayList2.get(i12);
                    if (cf0Var.o && !cf0Var.p) {
                        arrayList.add(cf0Var);
                    } else if (ff0.i(cf0Var.a, arrayList) == null) {
                        ff0 ff0Var2 = cf0Var.y;
                        float f10 = ff0Var2.K;
                        RectF rectF = cf0Var.c;
                        RectF rectF2 = cf0Var.f;
                        b80 b80Var = cf0Var.r;
                        if (b80Var != null) {
                            b80Var.a();
                            cf0Var.t = z12;
                            cf0Var.s = z12;
                        }
                        cf0Var.o = z13;
                        boolean z14 = rectF.left - 1.0f <= f10 ? z13 : z12;
                        boolean z15 = rectF.right + 1.0f >= ((float) ff0Var2.getMeasuredWidth()) - f10;
                        if (z14 && z15) {
                            z14 = false;
                            z15 = false;
                        }
                        cf0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z14) {
                            rectF2.right = rectF2.left;
                        } else if (z15) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = cf0Var.a;
                            if (i13 == 3 || i13 == 2) {
                                z9 = true;
                                if (ff0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    z10 = false;
                                    cf0Var.e.e(z9, 0.0f);
                                    arrayList.add(cf0Var);
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
                            cf0Var.e.e(z9, 0.0f);
                            arrayList.add(cf0Var);
                            i12++;
                            z11 = z10;
                            z12 = false;
                            z13 = true;
                        }
                        z9 = true;
                        z10 = false;
                        cf0Var.e.e(z9, 0.0f);
                        arrayList.add(cf0Var);
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
                ff0Var.invalidate();
                break;
            case 4:
                ff0 ff0Var3 = (ff0) this.b;
                cf0 cf0Var2 = (cf0) this.c;
                ef0 ef0Var = ff0Var3.y;
                int i14 = cf0Var2.a;
                RectF rectF3 = cf0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.vt0) ef0Var).b, i14, rectF3.left, rectF3.top);
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
                ih0 ih0Var = (ih0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = ih0Var.r;
                ih0Var.n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    hh0 hh0Var = (hh0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            TLObject tLObject2 = ((hh0) arrayList4.get(i16)).a;
                            long j3 = tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L;
                            TLObject tLObject3 = hh0Var.a;
                            if (j3 != (tLObject3 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject3).id : tLObject3 instanceof TLRPC.User ? ((TLRPC.User) tLObject3).id : 0L)) {
                                i16++;
                            } else if (hh0Var.c > 0) {
                                ((hh0) arrayList4.get(i16)).c = hh0Var.c;
                            }
                        } else {
                            arrayList4.add(hh0Var);
                        }
                    }
                }
                q0.a aVar = ih0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                ih0Var.a();
                break;
            case 7:
                zl0 zl0Var = (zl0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = zl0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = zl0Var.K()) < zl0Var.b()) {
                    arrayList5.remove(indexOf);
                    zl0Var.s(K + 1 + indexOf);
                    int size4 = zl0Var.j0.e.size();
                    int size5 = arrayList5.size();
                    if (zl0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        zl0Var.s(K);
                        break;
                    }
                }
                break;
            case 8:
                zl0 zl0Var2 = (zl0) this.b;
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.c;
                zl0Var2.S();
                hc.a0(ywVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                break;
            case 9:
                ((lm0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 10:
                ne neVar = (ne) this.b;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.c;
                if (cnVar != null) {
                    cnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    neVar.dismiss();
                    break;
                }
                break;
            case 11:
                ((WindowManager) this.c).removeView(((ne) this.b).B);
                break;
            case 12:
                no0 no0Var = (no0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 != null) {
                    no0Var.c2 = (TLRPC.TL_exportedMessageLink) tLObject4;
                    no0Var.a1();
                    if (no0Var.e2) {
                        no0Var.M0();
                    }
                }
                no0Var.d2 = false;
                break;
            case 13:
                zs0 zs0Var = (zs0) this.b;
                di.s6 s6Var = (di.s6) this.c;
                zp0 zp0Var = zs0Var.b0;
                if (zp0Var != null) {
                    int i17 = s6Var.a;
                    zp0Var.b.d(i17, zp0Var.d.i(i17));
                    break;
                }
                break;
            case 14:
                ur0 ur0Var = (ur0) this.b;
                di.b4 b4Var = (di.b4) this.c;
                ur0Var.F = null;
                ur0Var.G = null;
                b4Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new f60(b4Var, 20)).start();
                break;
            case 15:
                bi.v9 v9Var = (bi.v9) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                v9Var.e = !v9Var.e;
                runnableArr[0].run();
                v9Var.j(true);
                break;
            case 16:
                hc.a0(((lr0) this.b).f.x1).Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131742836, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 17:
                wr0 wr0Var = (wr0) this.b;
                String str = (String) this.c;
                if (!wr0Var.w.v1[wr0Var.r].a.isEmpty() && ((i7 = wr0Var.r) == 1 || i7 == 4)) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, wr0Var.w.v1[i7].a);
                    int e12 = ijVar.e1();
                    long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                    zs0 zs0Var2 = wr0Var.w;
                    wr0Var.F(e12, B0, zs0Var2.l1 == zs0Var2.x1.getUserConfig().e() ? ijVar.P1() : 0L, str);
                } else if (wr0Var.r == 3) {
                    zs0 zs0Var3 = wr0Var.w;
                    wr0Var.F(0, zs0Var3.l1, zs0Var3.F, str);
                }
                int i18 = wr0Var.r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList6 = new ArrayList(wr0Var.w.v1[wr0Var.r].a);
                    wr0Var.s++;
                    Utilities.g.c(new ng(wr0Var, str, arrayList6, 24));
                    break;
                }
                break;
            case 18:
                wr0 wr0Var2 = (wr0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                zs0 zs0Var4 = wr0Var2.w;
                boolean z16 = zs0Var4.X0;
                ur0[] ur0VarArr = zs0Var4.m0;
                if (z16) {
                    wr0Var2.s--;
                    int b10 = wr0Var2.b();
                    wr0Var2.d = arrayList7;
                    int b11 = wr0Var2.b();
                    if (wr0Var2.s == 0 || b11 != 0) {
                        zs0Var4.B1(false);
                    }
                    for (int i19 = 0; i19 < ur0VarArr.length; i19++) {
                        ur0 ur0Var2 = ur0VarArr[i19];
                        if (ur0Var2.E == wr0Var2.r) {
                            if (wr0Var2.s == 0 && b11 == 0) {
                                ur0Var2.w.d.setText(org.telegram.messenger.id.M0(2131748167, "NoResult"));
                                ur0VarArr[i19].w.f.setVisibility(8);
                                ur0VarArr[i19].w.e(false, true);
                            } else if (b10 == 0) {
                                zs0Var4.D(ur0Var2.h, 0, null);
                            }
                        }
                    }
                    wr0Var2.f();
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
                org.telegram.messenger.qp.s1(((lw0) this.b).a.a).h5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 21:
                t01 t01Var = (t01) this.b;
                String str2 = (String) this.c;
                t01Var.O = null;
                org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(t01Var.a).q7;
                long j10 = -t01Var.b;
                fx fxVar = new fx(i10, t01Var, str2);
                k00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = k00Var.getMessagesController().j1(-j10);
                tL_messages_getForumTopics.q = str2;
                tL_messages_getForumTopics.limit = 50;
                t01Var.N = k00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.oj(k00Var, j10, fxVar, 10));
                break;
            case 22:
                n11 n11Var = (n11) this.b;
                org.telegram.messenger.qp.s1(n11Var.e).q7.d((ArrayList) this.c, -n11Var.f);
                int i20 = n11.l0;
                break;
            case 23:
                n11 n11Var2 = (n11) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                n11Var2.getClass();
                org.telegram.messenger.qp.s1(n11Var2.e).V2(0, updates.chats.get(0).id, true);
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
                l21 l21Var = (l21) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.messenger.au auVar = l21Var.p1;
                l21Var.i1 = null;
                if (tLObject6 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject6;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        l21Var.L1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (auVar != null) {
                            auVar.set(richMessage);
                            l21Var.E1.D(auVar);
                            break;
                        }
                    }
                }
                if (l21Var.L1) {
                    l21Var.dismiss();
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.P4, 1, org.telegram.messenger.id.M0(2131743946, null));
                    break;
                } else {
                    org.telegram.messenger.k5.p(null, 2131743946, new hc((FrameLayout) l21Var.b, l21Var.I0), null);
                    h21 h21Var = l21Var.t1.e;
                    String str3 = l21Var.s1;
                    l21Var.r1 = str3;
                    h21Var.setText(l21.O0(str3, null, null));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) this.b;
                ((org.telegram.ui.ActionBar.g1) this.c).d(true);
                b31.a(dkVar.getContext(), dkVar.d);
                break;
            case 27:
                ((org.telegram.messenger.f10) this.c).J(((org.telegram.ui.dk) this.b).b, false, false);
                break;
            case 28:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                if (tLObject7 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.jl0((TLRPC.PaymentReceipt) tLObject7));
                    break;
                } else {
                    int i21 = UndoView.i0;
                    undoView.getClass();
                    break;
                }
            default:
                ((y31) this.b).D.onClick((org.telegram.ui.Cells.q8) this.c);
                break;
        }
    }

    public /* synthetic */ w80(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }
}
