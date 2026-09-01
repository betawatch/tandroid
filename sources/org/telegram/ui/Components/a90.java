package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a90(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mh.r5 r5Var;
        boolean z4;
        int indexOf;
        int L;
        int i10;
        int i11 = 5;
        boolean z10 = false;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                b90 b90Var = (b90) this.b;
                if (b90Var.L0 == ((h90) this.c)) {
                    b90Var.performLongClick();
                    b90Var.L0 = null;
                    b90Var.J0.d(true);
                    break;
                }
                break;
            case 1:
                ((d90) this.b).l((k90) this.c, false);
                break;
            case 2:
                fa0 fa0Var = (fa0) this.b;
                if (!((boolean[]) this.c)[0] && (r5Var = fa0Var.R) != null) {
                    r5Var.run();
                }
                fa0Var.R = null;
                break;
            case 3:
                ha0 ha0Var = (ha0) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                ha0Var.setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i11, editTextBoldCursor));
                break;
            case 4:
                oh.h4 h4Var = (oh.h4) this.b;
                Runnable runnable = (Runnable) this.c;
                h4Var.getClass();
                runnable.run();
                ((HashMap) h4Var.b).remove(runnable);
                break;
            case 5:
                gh0 gh0Var = (gh0) this.b;
                TLObject tLObject = (TLObject) this.c;
                gh0Var.J = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    gh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        gh0Var.a(false);
                        break;
                    } else {
                        gh0Var.d();
                        gh0Var.c.V2.N(true);
                        break;
                    }
                }
                break;
            case 6:
                lh0 lh0Var = (lh0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = lh0Var.a;
                int i12 = lh0Var.x;
                int size = arrayList.size();
                lh0Var.x = size;
                if (i12 != size && lh0Var.P != null) {
                    lh0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    ih0 ih0Var = (ih0) arrayList2.get(i13);
                    if (ih0Var.o && !ih0Var.p) {
                        arrayList.add(ih0Var);
                    } else if (lh0.j(ih0Var.a, arrayList) == null) {
                        lh0 lh0Var2 = ih0Var.y;
                        float f10 = lh0Var2.K;
                        RectF rectF = ih0Var.c;
                        RectF rectF2 = ih0Var.f;
                        k90 k90Var = ih0Var.r;
                        if (k90Var != null) {
                            k90Var.a();
                            ih0Var.t = z10;
                            ih0Var.s = z10;
                        }
                        ih0Var.o = z11;
                        boolean z12 = rectF.left - 1.0f <= f10;
                        boolean z13 = rectF.right + 1.0f >= ((float) lh0Var2.getMeasuredWidth()) - f10;
                        if (z12 && z13) {
                            z12 = false;
                            z13 = false;
                        }
                        ih0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = ih0Var.a;
                            if (i14 == 3 || i14 == 2) {
                                z4 = true;
                                if (lh0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    ih0Var.e.d(0.0f, z4);
                                    arrayList.add(ih0Var);
                                    i13++;
                                    z10 = false;
                                    z11 = true;
                                }
                            } else {
                                z4 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            ih0Var.e.d(0.0f, z4);
                            arrayList.add(ih0Var);
                            i13++;
                            z10 = false;
                            z11 = true;
                        }
                        z4 = true;
                        ih0Var.e.d(0.0f, z4);
                        arrayList.add(ih0Var);
                        i13++;
                        z10 = false;
                        z11 = true;
                    }
                    i13++;
                    z10 = false;
                    z11 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                lh0Var.invalidate();
                break;
            case 7:
                lh0 lh0Var3 = (lh0) this.b;
                ih0 ih0Var2 = (ih0) this.c;
                kh0 kh0Var = lh0Var3.C;
                int i15 = ih0Var2.a;
                RectF rectF3 = ih0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.rx0) kh0Var).b, i15, rectF3.left, rectF3.top);
                break;
            case 8:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.b;
                Object obj = (ViewParent) this.c;
                t1Var.invalidate();
                if (obj instanceof View) {
                    ((View) obj).invalidate();
                    break;
                }
                break;
            case 9:
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
            case 10:
                qj0 qj0Var = (qj0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = qj0Var.r;
                qj0Var.n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj2 = arrayList3.get(i16);
                    i16++;
                    pj0 pj0Var = (pj0) obj2;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList4.size()) {
                            arrayList4.add(pj0Var);
                        } else if (MessageObject.getObjectPeerId(((pj0) arrayList4.get(i17)).a) != MessageObject.getObjectPeerId(pj0Var.a)) {
                            i17++;
                        } else if (pj0Var.c > 0) {
                            ((pj0) arrayList4.get(i17)).c = pj0Var.c;
                        }
                    }
                }
                q0.a aVar = qj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                qj0Var.a();
                break;
            case 11:
                xn0 xn0Var = (xn0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = xn0Var.H;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (L = xn0Var.L()) < xn0Var.h()) {
                    arrayList5.remove(indexOf);
                    xn0Var.u(L + 1 + indexOf);
                    int size4 = xn0Var.g0.e.size();
                    int size5 = arrayList5.size();
                    if (xn0Var.D0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        xn0Var.u(L);
                        break;
                    }
                }
                break;
            case 12:
                xn0 xn0Var2 = (xn0) this.b;
                org.telegram.ui.py pyVar = (org.telegram.ui.py) this.c;
                xn0Var2.T();
                qc.a0(pyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 13:
                ((io0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 14:
                ve veVar = (ve) this.b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.c;
                if (xnVar != null) {
                    xnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    veVar.dismiss();
                    break;
                }
                break;
            case 15:
                ((WindowManager) this.c).removeView(((ve) this.b).B);
                break;
            case 16:
                mq0 mq0Var = (mq0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    mq0Var.h0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    mq0Var.Z0();
                    if (mq0Var.j0) {
                        mq0Var.M0();
                    }
                }
                mq0Var.i0 = false;
                break;
            case 17:
                rt0 rt0Var = (rt0) this.b;
                tq0 tq0Var = (tq0) this.c;
                rt0Var.D = null;
                rt0Var.E = null;
                tq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new pd0(tq0Var, 12)).start();
                break;
            case 18:
                zu0 zu0Var = (zu0) this.b;
                oh.m6 m6Var = (oh.m6) this.c;
                tr0 tr0Var = zu0Var.T;
                if (tr0Var != null) {
                    int i18 = m6Var.a;
                    tr0Var.n.d(i18, tr0Var.s.i(i18));
                    break;
                }
                break;
            case 19:
                qc.a0(((ht0) this.b).f.s1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 20:
                ut0 ut0Var = (ut0) this.b;
                String str = (String) this.c;
                if (!ut0Var.v.q1[ut0Var.r].a.isEmpty() && ((i10 = ut0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) l.d.i(1, ut0Var.v.q1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    zu0 zu0Var2 = ut0Var.v;
                    ut0Var.F(id2, str, dialogId, zu0Var2.g1 == zu0Var2.s1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (ut0Var.r == 3) {
                    zu0 zu0Var3 = ut0Var.v;
                    ut0Var.F(0, str, zu0Var3.g1, zu0Var3.C);
                }
                int i19 = ut0Var.r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(ut0Var.v.q1[ut0Var.r].a);
                    ut0Var.s++;
                    Utilities.searchQueue.postRunnable(new jp(ut0Var, str, arrayList6, 22));
                    break;
                }
                break;
            case 21:
                ut0 ut0Var2 = (ut0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                zu0 zu0Var4 = ut0Var2.v;
                boolean z14 = zu0Var4.S0;
                rt0[] rt0VarArr = zu0Var4.h0;
                if (z14) {
                    ut0Var2.s--;
                    int h = ut0Var2.h();
                    ut0Var2.d = arrayList7;
                    int h9 = ut0Var2.h();
                    if (ut0Var2.s == 0 || h9 != 0) {
                        zu0Var4.m1(false);
                    }
                    for (int i20 = 0; i20 < rt0VarArr.length; i20++) {
                        rt0 rt0Var2 = rt0VarArr[i20];
                        if (rt0Var2.C == ut0Var2.r) {
                            if (ut0Var2.s == 0 && h9 == 0) {
                                rt0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                rt0VarArr[i20].w.f.setVisibility(8);
                                rt0VarArr[i20].w.e(false, true);
                            } else if (h == 0) {
                                zu0Var4.z(rt0Var2.h, 0, null);
                            }
                        }
                    }
                    ut0Var2.l();
                    break;
                }
                break;
            case 22:
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, tLObject3, document, null, bool);
                break;
            case 23:
                MessagesController.getInstance(((my0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 24:
                x21 x21Var = (x21) this.b;
                MessagesController.getInstance(x21Var.b).getTopicsController().deleteTopics(-x21Var.c, (ArrayList) this.c);
                int i22 = x21.c0;
                break;
            case 25:
                x21 x21Var2 = (x21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                x21Var2.getClass();
                MessagesController.getInstance(x21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 26:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (k1Var != null) {
                    k1Var.f0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 27:
                w31.o((w31) this.b, (TLObject) this.c);
                break;
            case 28:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                String str2 = (String) this.c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    break;
                }
                break;
            default:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.p1) this.c).d(true);
                n41.a(wkVar.getContext(), wkVar.d);
                break;
        }
    }

    public /* synthetic */ a90(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
