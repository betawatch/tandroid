package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g90(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        di.x0 x0Var;
        boolean z10;
        boolean z11;
        int indexOf;
        int L;
        int i10;
        boolean z12 = false;
        int i11 = 4;
        boolean z13 = false;
        boolean z14 = true;
        switch (this.a) {
            case 0:
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.b;
                org.telegram.ui.np npVar = (org.telegram.ui.np) this.c;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", chatFull.guard_bot_id);
                npVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 1:
                y90 y90Var = (y90) this.b;
                if (y90Var.O0 == ((ea0) this.c)) {
                    y90Var.performLongClick();
                    y90Var.O0 = null;
                    y90Var.M0.d(true);
                    break;
                }
                break;
            case 2:
                ((aa0) this.b).l((ha0) this.c, false);
                break;
            case 3:
                cb0 cb0Var = (cb0) this.b;
                if (!((boolean[]) this.c)[0] && (x0Var = cb0Var.U) != null) {
                    x0Var.run();
                }
                cb0Var.U = null;
                break;
            case 4:
                eb0 eb0Var = (eb0) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                eb0Var.setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i11, editTextBoldCursor));
                break;
            case 5:
                qb.c cVar = (qb.c) this.b;
                Runnable runnable = (Runnable) this.c;
                cVar.getClass();
                runnable.run();
                cVar.a.remove(runnable);
                break;
            case 6:
                zh0 zh0Var = (zh0) this.b;
                TLObject tLObject = (TLObject) this.c;
                zh0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    zh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        zh0Var.a(false);
                        break;
                    } else {
                        zh0Var.d();
                        zh0Var.c.W2.N(true);
                        break;
                    }
                }
                break;
            case 7:
                ei0 ei0Var = (ei0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = ei0Var.a;
                int i12 = ei0Var.x;
                int size = arrayList.size();
                ei0Var.x = size;
                if (i12 != size && ei0Var.S != null) {
                    ei0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    bi0 bi0Var = (bi0) arrayList2.get(i13);
                    if (bi0Var.o && !bi0Var.p) {
                        arrayList.add(bi0Var);
                    } else if (ei0.j(bi0Var.a, arrayList) == null) {
                        ei0 ei0Var2 = bi0Var.y;
                        float f7 = ei0Var2.N;
                        RectF rectF = bi0Var.c;
                        RectF rectF2 = bi0Var.f;
                        ha0 ha0Var = bi0Var.r;
                        if (ha0Var != null) {
                            ha0Var.a();
                            bi0Var.t = z13;
                            bi0Var.s = z13;
                        }
                        bi0Var.o = z14;
                        boolean z15 = rectF.left - 1.0f <= f7 ? z14 : z13;
                        boolean z16 = rectF.right + 1.0f >= ((float) ei0Var2.getMeasuredWidth()) - f7;
                        if (z15 && z16) {
                            z15 = false;
                            z16 = false;
                        }
                        bi0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z15) {
                            rectF2.right = rectF2.left;
                        } else if (z16) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = bi0Var.a;
                            if (i14 == 3 || i14 == 2) {
                                z10 = true;
                                if (ei0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z11 = false;
                                    bi0Var.e.d(0.0f, z10);
                                    arrayList.add(bi0Var);
                                    i13++;
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
                            bi0Var.e.d(0.0f, z10);
                            arrayList.add(bi0Var);
                            i13++;
                            z12 = z11;
                            z13 = false;
                            z14 = true;
                        }
                        z10 = true;
                        z11 = false;
                        bi0Var.e.d(0.0f, z10);
                        arrayList.add(bi0Var);
                        i13++;
                        z12 = z11;
                        z13 = false;
                        z14 = true;
                    }
                    z11 = z12;
                    i13++;
                    z12 = z11;
                    z13 = false;
                    z14 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ei0Var.invalidate();
                break;
            case 8:
                ei0 ei0Var3 = (ei0) this.b;
                bi0 bi0Var2 = (bi0) this.c;
                di0 di0Var = ei0Var3.F;
                int i15 = bi0Var2.a;
                RectF rectF3 = bi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.py0) di0Var).b, i15, rectF3.left, rectF3.top);
                break;
            case 9:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.b;
                Object obj = (ViewParent) this.c;
                u1Var.invalidate();
                if (obj instanceof View) {
                    ((View) obj).invalidate();
                    break;
                }
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
                gk0 gk0Var = (gk0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = gk0Var.r;
                gk0Var.n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj2 = arrayList3.get(i16);
                    i16++;
                    fk0 fk0Var = (fk0) obj2;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList4.size()) {
                            arrayList4.add(fk0Var);
                        } else if (MessageObject.getObjectPeerId(((fk0) arrayList4.get(i17)).a) != MessageObject.getObjectPeerId(fk0Var.a)) {
                            i17++;
                        } else if (fk0Var.c > 0) {
                            ((fk0) arrayList4.get(i17)).c = fk0Var.c;
                        }
                    }
                }
                q0.a aVar = gk0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                gk0Var.a();
                break;
            case 12:
                so0 so0Var = (so0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = so0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (L = so0Var.L()) < so0Var.h()) {
                    arrayList5.remove(indexOf);
                    so0Var.u(L + 1 + indexOf);
                    int size4 = so0Var.j0.e.size();
                    int size5 = arrayList5.size();
                    if (so0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        so0Var.u(L);
                        break;
                    }
                }
                break;
            case 13:
                so0 so0Var2 = (so0) this.b;
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.c;
                so0Var2.T();
                zc.a0(yyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 14:
                ((dp0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 15:
                gf gfVar = (gf) this.b;
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.c;
                if (foVar != null) {
                    foVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    gfVar.dismiss();
                    break;
                }
                break;
            case 16:
                ((WindowManager) this.c).removeView(((gf) this.b).B);
                break;
            case 17:
                ir0 ir0Var = (ir0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    ir0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    ir0Var.a1();
                    if (ir0Var.m0) {
                        ir0Var.N0();
                    }
                }
                ir0Var.l0 = false;
                break;
            case 18:
                qu0 qu0Var = (qu0) this.b;
                pr0 pr0Var = (pr0) this.c;
                qu0Var.G = null;
                qu0Var.H = null;
                pr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new k90(pr0Var, 17)).start();
                break;
            case 19:
                xv0 xv0Var = (xv0) this.b;
                bi.p8 p8Var = (bi.p8) this.c;
                ss0 ss0Var = xv0Var.W;
                if (ss0Var != null) {
                    int i18 = p8Var.a;
                    ss0Var.n.d(i18, ss0Var.s.i(i18));
                    break;
                }
                break;
            case 20:
                zc.a0(((gu0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 21:
                tu0 tu0Var = (tu0) this.b;
                String str = (String) this.c;
                if (!tu0Var.v.t1[tu0Var.r].a.isEmpty() && ((i10 = tu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.d.h(1, tu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    xv0 xv0Var2 = tu0Var.v;
                    tu0Var.F(id2, str, dialogId, xv0Var2.j1 == xv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (tu0Var.r == 3) {
                    xv0 xv0Var3 = tu0Var.v;
                    tu0Var.F(0, str, xv0Var3.j1, xv0Var3.F);
                }
                int i19 = tu0Var.r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(tu0Var.v.t1[tu0Var.r].a);
                    tu0Var.s++;
                    Utilities.searchQueue.postRunnable(new ze0(tu0Var, str, arrayList6, 11));
                    break;
                }
                break;
            case 22:
                tu0 tu0Var2 = (tu0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                xv0 xv0Var4 = tu0Var2.v;
                boolean z17 = xv0Var4.V0;
                qu0[] qu0VarArr = xv0Var4.k0;
                if (z17) {
                    tu0Var2.s--;
                    int h = tu0Var2.h();
                    tu0Var2.d = arrayList7;
                    int h10 = tu0Var2.h();
                    if (tu0Var2.s == 0 || h10 != 0) {
                        xv0Var4.n1(false);
                    }
                    for (int i20 = 0; i20 < qu0VarArr.length; i20++) {
                        qu0 qu0Var2 = qu0VarArr[i20];
                        if (qu0Var2.F == tu0Var2.r) {
                            if (tu0Var2.s == 0 && h10 == 0) {
                                qu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qu0VarArr[i20].w.f.setVisibility(8);
                                qu0VarArr[i20].w.e(false, true);
                            } else if (h == 0) {
                                xv0Var4.z(qu0Var2.h, 0, null);
                            }
                        }
                    }
                    tu0Var2.l();
                    break;
                }
                break;
            case 23:
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, tLObject3, document, null, bool);
                break;
            case 24:
                MessagesController.getInstance(((gz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 25:
                y31 y31Var = (y31) this.b;
                MessagesController.getInstance(y31Var.b).getTopicsController().deleteTopics(-y31Var.c, (ArrayList) this.c);
                int i22 = y31.f0;
                break;
            case 26:
                y31 y31Var2 = (y31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                y31Var2.getClass();
                MessagesController.getInstance(y31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 27:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.d0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 28:
                x41.q((x41) this.b, (TLObject) this.c);
                break;
            default:
                org.telegram.ui.el elVar = (org.telegram.ui.el) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                p51.a(elVar.getContext(), elVar.d);
                break;
        }
    }

    public /* synthetic */ g90(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
