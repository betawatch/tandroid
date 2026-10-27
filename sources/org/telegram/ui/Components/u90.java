package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u90(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bi.u7 u7Var;
        boolean z10;
        boolean z11;
        int indexOf;
        int K;
        int i10;
        boolean z12 = false;
        int i11 = 3;
        boolean z13 = false;
        boolean z14 = true;
        switch (this.a) {
            case 0:
                v90 v90Var = (v90) this.b;
                if (v90Var.O0 == ((ba0) this.c)) {
                    v90Var.performLongClick();
                    v90Var.O0 = null;
                    v90Var.M0.d(true);
                    break;
                }
                break;
            case 1:
                ((x90) this.b).l((ea0) this.c, false);
                break;
            case 2:
                ua0 ua0Var = (ua0) this.b;
                if (!((boolean[]) this.c)[0] && (u7Var = ua0Var.Q) != null) {
                    u7Var.run();
                }
                ua0Var.Q = null;
                break;
            case 3:
                wa0 wa0Var = (wa0) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                wa0Var.setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new p70(editTextBoldCursor, i11));
                break;
            case 4:
                i2.c cVar = (i2.c) this.b;
                Runnable runnable = (Runnable) this.c;
                cVar.getClass();
                runnable.run();
                cVar.a.remove(runnable);
                break;
            case 5:
                xh0 xh0Var = (xh0) this.b;
                TLObject tLObject = (TLObject) this.c;
                xh0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    xh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        xh0Var.a(false);
                        break;
                    } else {
                        xh0Var.d();
                        xh0Var.c.g3.O(true);
                        break;
                    }
                }
                break;
            case 6:
                ci0 ci0Var = (ci0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = ci0Var.a;
                int i12 = ci0Var.x;
                int size = arrayList.size();
                ci0Var.x = size;
                if (i12 != size && ci0Var.S != null) {
                    ci0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    zh0 zh0Var = (zh0) arrayList2.get(i13);
                    if (zh0Var.o && !zh0Var.p) {
                        arrayList.add(zh0Var);
                    } else if (ci0.j(zh0Var.a, arrayList) == null) {
                        ci0 ci0Var2 = zh0Var.y;
                        float f7 = ci0Var2.N;
                        RectF rectF = zh0Var.c;
                        RectF rectF2 = zh0Var.f;
                        ea0 ea0Var = zh0Var.r;
                        if (ea0Var != null) {
                            ea0Var.a();
                            zh0Var.t = z13;
                            zh0Var.s = z13;
                        }
                        zh0Var.o = z14;
                        boolean z15 = rectF.left - 1.0f <= f7 ? z14 : z13;
                        boolean z16 = rectF.right + 1.0f >= ((float) ci0Var2.getMeasuredWidth()) - f7;
                        if (z15 && z16) {
                            z15 = false;
                            z16 = false;
                        }
                        zh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z15) {
                            rectF2.right = rectF2.left;
                        } else if (z16) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = zh0Var.a;
                            if (i14 == 3 || i14 == 2) {
                                z10 = true;
                                if (ci0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z11 = false;
                                    zh0Var.e.d(0.0f, z10);
                                    arrayList.add(zh0Var);
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
                            zh0Var.e.d(0.0f, z10);
                            arrayList.add(zh0Var);
                            i13++;
                            z12 = z11;
                            z13 = false;
                            z14 = true;
                        }
                        z10 = true;
                        z11 = false;
                        zh0Var.e.d(0.0f, z10);
                        arrayList.add(zh0Var);
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
                ci0Var.invalidate();
                break;
            case 7:
                ci0 ci0Var3 = (ci0) this.b;
                zh0 zh0Var2 = (zh0) this.c;
                bi0 bi0Var = ci0Var3.F;
                int i15 = zh0Var2.a;
                RectF rectF3 = zh0Var2.d;
                ProfileActivity.e0(((org.telegram.ui.yx0) bi0Var).b, i15, rectF3.left, rectF3.top);
                break;
            case 8:
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
            case 9:
                gk0 gk0Var = (gk0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = gk0Var.r;
                gk0Var.n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    fk0 fk0Var = (fk0) obj;
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
            case 10:
                xo0 xo0Var = (xo0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = xo0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = xo0Var.K()) < xo0Var.h()) {
                    arrayList5.remove(indexOf);
                    xo0Var.u(K + 1 + indexOf);
                    int size4 = xo0Var.j0.e.size();
                    int size5 = arrayList5.size();
                    if (xo0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        xo0Var.u(K);
                        break;
                    }
                }
                break;
            case 11:
                xo0 xo0Var2 = (xo0) this.b;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.c;
                xo0Var2.S();
                wc.b0(eyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 12:
                ((kp0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 13:
                ef efVar = (ef) this.b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.c;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    break;
                }
                break;
            case 14:
                ((WindowManager) this.c).removeView(((ef) this.b).B);
                break;
            case 15:
                nr0 nr0Var = (nr0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    nr0Var.l0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    nr0Var.c1();
                    if (nr0Var.n0) {
                        nr0Var.O0();
                    }
                }
                nr0Var.m0 = false;
                break;
            case 16:
                uu0 uu0Var = (uu0) this.b;
                tr0 tr0Var = (tr0) this.c;
                uu0Var.F = null;
                uu0Var.G = null;
                tr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new i10(tr0Var, 21)).start();
                break;
            case 17:
                bi.t9 t9Var = (bi.t9) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                t9Var.e = !t9Var.e;
                runnableArr[0].run();
                t9Var.j(true);
                break;
            case 18:
                bw0 bw0Var = (bw0) this.b;
                di.a7 a7Var = (di.a7) this.c;
                at0 at0Var = bw0Var.b0;
                if (at0Var != null) {
                    int i18 = a7Var.a;
                    at0Var.b.d(i18, at0Var.d.i(i18));
                    break;
                }
                break;
            case 19:
                wc.b0(((ku0) this.b).f.x1).R(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 20:
                xu0 xu0Var = (xu0) this.b;
                String str = (String) this.c;
                if (!xu0Var.v.v1[xu0Var.r].a.isEmpty() && ((i10 = xu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) ic.a.g(1, xu0Var.v.v1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    bw0 bw0Var2 = xu0Var.v;
                    xu0Var.F(id2, str, dialogId, bw0Var2.l1 == bw0Var2.x1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (xu0Var.r == 3) {
                    bw0 bw0Var3 = xu0Var.v;
                    xu0Var.F(0, str, bw0Var3.l1, bw0Var3.F);
                }
                int i19 = xu0Var.r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(xu0Var.v.v1[xu0Var.r].a);
                    xu0Var.s++;
                    Utilities.searchQueue.postRunnable(new kg(xu0Var, str, arrayList6, 26));
                    break;
                }
                break;
            case 21:
                xu0 xu0Var2 = (xu0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                bw0 bw0Var4 = xu0Var2.v;
                boolean z17 = bw0Var4.X0;
                uu0[] uu0VarArr = bw0Var4.m0;
                if (z17) {
                    xu0Var2.s--;
                    int h = xu0Var2.h();
                    xu0Var2.d = arrayList7;
                    int h10 = xu0Var2.h();
                    if (xu0Var2.s == 0 || h10 != 0) {
                        bw0Var4.v1(false);
                    }
                    for (int i20 = 0; i20 < uu0VarArr.length; i20++) {
                        uu0 uu0Var2 = uu0VarArr[i20];
                        if (uu0Var2.E == xu0Var2.r) {
                            if (xu0Var2.s == 0 && h10 == 0) {
                                uu0Var2.v.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                uu0VarArr[i20].v.f.setVisibility(8);
                                uu0VarArr[i20].v.e(false, true);
                            } else if (h == 0) {
                                bw0Var4.C(uu0Var2.h, 0, null);
                            }
                        }
                    }
                    xu0Var2.l();
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
                MessagesController.getInstance(((pz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 24:
                f41 f41Var = (f41) this.b;
                MessagesController.getInstance(f41Var.b).getTopicsController().deleteTopics(-f41Var.c, (ArrayList) this.c);
                int i22 = f41.i0;
                break;
            case 25:
                f41 f41Var2 = (f41) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                f41Var2.getClass();
                MessagesController.getInstance(f41Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 26:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (j1Var != null) {
                    j1Var.Z(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 27:
                g51.o((g51) this.b, (TLObject) this.c);
                break;
            case 28:
                org.telegram.ui.vk vkVar = (org.telegram.ui.vk) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                y51.a(vkVar.getContext(), vkVar.d);
                break;
            default:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.vk) this.b).b, false);
                break;
        }
    }

    public /* synthetic */ u90(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
