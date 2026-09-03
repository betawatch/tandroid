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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z80(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lh.r5 r5Var;
        boolean z4;
        int indexOf;
        int L;
        int i10;
        int i11 = 5;
        boolean z10 = false;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                a90 a90Var = (a90) this.b;
                if (a90Var.L0 == ((g90) this.c)) {
                    a90Var.performLongClick();
                    a90Var.L0 = null;
                    a90Var.J0.d(true);
                    break;
                }
                break;
            case 1:
                ((c90) this.b).l((j90) this.c, false);
                break;
            case 2:
                ea0 ea0Var = (ea0) this.b;
                if (!((boolean[]) this.c)[0] && (r5Var = ea0Var.R) != null) {
                    r5Var.run();
                }
                ea0Var.R = null;
                break;
            case 3:
                ga0 ga0Var = (ga0) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                ga0Var.setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i11, editTextBoldCursor));
                break;
            case 4:
                androidx.biometric.e0 e0Var = (androidx.biometric.e0) this.b;
                Runnable runnable = (Runnable) this.c;
                e0Var.getClass();
                runnable.run();
                ((HashMap) e0Var.b).remove(runnable);
                break;
            case 5:
                fh0 fh0Var = (fh0) this.b;
                TLObject tLObject = (TLObject) this.c;
                fh0Var.J = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    fh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        fh0Var.a(false);
                        break;
                    } else {
                        fh0Var.d();
                        fh0Var.c.V2.N(true);
                        break;
                    }
                }
                break;
            case 6:
                kh0 kh0Var = (kh0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = kh0Var.a;
                int i12 = kh0Var.x;
                int size = arrayList.size();
                kh0Var.x = size;
                if (i12 != size && kh0Var.P != null) {
                    kh0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    hh0 hh0Var = (hh0) arrayList2.get(i13);
                    if (hh0Var.o && !hh0Var.p) {
                        arrayList.add(hh0Var);
                    } else if (kh0.j(hh0Var.a, arrayList) == null) {
                        kh0 kh0Var2 = hh0Var.y;
                        float f10 = kh0Var2.K;
                        RectF rectF = hh0Var.c;
                        RectF rectF2 = hh0Var.f;
                        j90 j90Var = hh0Var.r;
                        if (j90Var != null) {
                            j90Var.a();
                            hh0Var.t = z10;
                            hh0Var.s = z10;
                        }
                        hh0Var.o = z11;
                        boolean z12 = rectF.left - 1.0f <= f10;
                        boolean z13 = rectF.right + 1.0f >= ((float) kh0Var2.getMeasuredWidth()) - f10;
                        if (z12 && z13) {
                            z12 = false;
                            z13 = false;
                        }
                        hh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = hh0Var.a;
                            if (i14 == 3 || i14 == 2) {
                                z4 = true;
                                if (kh0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    hh0Var.e.d(0.0f, z4);
                                    arrayList.add(hh0Var);
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
                            hh0Var.e.d(0.0f, z4);
                            arrayList.add(hh0Var);
                            i13++;
                            z10 = false;
                            z11 = true;
                        }
                        z4 = true;
                        hh0Var.e.d(0.0f, z4);
                        arrayList.add(hh0Var);
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
                kh0Var.invalidate();
                break;
            case 7:
                kh0 kh0Var3 = (kh0) this.b;
                hh0 hh0Var2 = (hh0) this.c;
                jh0 jh0Var = kh0Var3.C;
                int i15 = hh0Var2.a;
                RectF rectF3 = hh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.wx0) jh0Var).b, i15, rectF3.left, rectF3.top);
                break;
            case 8:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.b;
                Object obj = (ViewParent) this.c;
                s1Var.invalidate();
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
                oj0 oj0Var = (oj0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = oj0Var.r;
                oj0Var.n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj2 = arrayList3.get(i16);
                    i16++;
                    nj0 nj0Var = (nj0) obj2;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList4.size()) {
                            arrayList4.add(nj0Var);
                        } else if (MessageObject.getObjectPeerId(((nj0) arrayList4.get(i17)).a) != MessageObject.getObjectPeerId(nj0Var.a)) {
                            i17++;
                        } else if (nj0Var.c > 0) {
                            ((nj0) arrayList4.get(i17)).c = nj0Var.c;
                        }
                    }
                }
                q0.a aVar = oj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                oj0Var.a();
                break;
            case 11:
                vn0 vn0Var = (vn0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = vn0Var.H;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (L = vn0Var.L()) < vn0Var.h()) {
                    arrayList5.remove(indexOf);
                    vn0Var.u(L + 1 + indexOf);
                    int size4 = vn0Var.g0.e.size();
                    int size5 = arrayList5.size();
                    if (vn0Var.D0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        vn0Var.u(L);
                        break;
                    }
                }
                break;
            case 12:
                vn0 vn0Var2 = (vn0) this.b;
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.c;
                vn0Var2.T();
                qc.a0(qyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 13:
                ((go0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 14:
                ve veVar = (ve) this.b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    veVar.dismiss();
                    break;
                }
                break;
            case 15:
                ((WindowManager) this.c).removeView(((ve) this.b).B);
                break;
            case 16:
                lq0 lq0Var = (lq0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    lq0Var.h0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    lq0Var.Z0();
                    if (lq0Var.j0) {
                        lq0Var.M0();
                    }
                }
                lq0Var.i0 = false;
                break;
            case 17:
                qt0 qt0Var = (qt0) this.b;
                sq0 sq0Var = (sq0) this.c;
                qt0Var.D = null;
                qt0Var.E = null;
                sq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new od0(sq0Var, 12)).start();
                break;
            case 18:
                yu0 yu0Var = (yu0) this.b;
                nh.m6 m6Var = (nh.m6) this.c;
                sr0 sr0Var = yu0Var.T;
                if (sr0Var != null) {
                    int i18 = m6Var.a;
                    sr0Var.n.d(i18, sr0Var.s.i(i18));
                    break;
                }
                break;
            case 19:
                qc.a0(((gt0) this.b).f.s1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 20:
                tt0 tt0Var = (tt0) this.b;
                String str = (String) this.c;
                if (!tt0Var.v.q1[tt0Var.r].a.isEmpty() && ((i10 = tt0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) kf.k0.i(1, tt0Var.v.q1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    yu0 yu0Var2 = tt0Var.v;
                    tt0Var.F(id2, str, dialogId, yu0Var2.g1 == yu0Var2.s1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (tt0Var.r == 3) {
                    yu0 yu0Var3 = tt0Var.v;
                    tt0Var.F(0, str, yu0Var3.g1, yu0Var3.C);
                }
                int i19 = tt0Var.r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(tt0Var.v.q1[tt0Var.r].a);
                    tt0Var.s++;
                    Utilities.searchQueue.postRunnable(new gp(tt0Var, str, arrayList6, 22));
                    break;
                }
                break;
            case 21:
                tt0 tt0Var2 = (tt0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                yu0 yu0Var4 = tt0Var2.v;
                boolean z14 = yu0Var4.S0;
                qt0[] qt0VarArr = yu0Var4.h0;
                if (z14) {
                    tt0Var2.s--;
                    int h = tt0Var2.h();
                    tt0Var2.d = arrayList7;
                    int h9 = tt0Var2.h();
                    if (tt0Var2.s == 0 || h9 != 0) {
                        yu0Var4.m1(false);
                    }
                    for (int i20 = 0; i20 < qt0VarArr.length; i20++) {
                        qt0 qt0Var2 = qt0VarArr[i20];
                        if (qt0Var2.C == tt0Var2.r) {
                            if (tt0Var2.s == 0 && h9 == 0) {
                                qt0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qt0VarArr[i20].w.f.setVisibility(8);
                                qt0VarArr[i20].w.e(false, true);
                            } else if (h == 0) {
                                yu0Var4.z(qt0Var2.h, 0, null);
                            }
                        }
                    }
                    tt0Var2.l();
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
                MessagesController.getInstance(((ly0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 24:
                w21 w21Var = (w21) this.b;
                MessagesController.getInstance(w21Var.b).getTopicsController().deleteTopics(-w21Var.c, (ArrayList) this.c);
                int i22 = w21.c0;
                break;
            case 25:
                w21 w21Var2 = (w21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                w21Var2.getClass();
                MessagesController.getInstance(w21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 26:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (j1Var != null) {
                    j1Var.f0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 27:
                v31.o((v31) this.b, (TLObject) this.c);
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
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.b;
                ((org.telegram.ui.ActionBar.p1) this.c).d(true);
                m41.a(ykVar.getContext(), ykVar.d);
                break;
        }
    }

    public /* synthetic */ z80(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
