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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t90(int i10, Object obj, Object obj2) {
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
                u90 u90Var = (u90) this.b;
                if (u90Var.O0 == ((aa0) this.c)) {
                    u90Var.performLongClick();
                    u90Var.O0 = null;
                    u90Var.M0.d(true);
                    break;
                }
                break;
            case 1:
                ((w90) this.b).l((da0) this.c, false);
                break;
            case 2:
                ta0 ta0Var = (ta0) this.b;
                if (!((boolean[]) this.c)[0] && (u7Var = ta0Var.Q) != null) {
                    u7Var.run();
                }
                ta0Var.Q = null;
                break;
            case 3:
                va0 va0Var = (va0) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                va0Var.setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new o70(editTextBoldCursor, i11));
                break;
            case 4:
                i2.c cVar = (i2.c) this.b;
                Runnable runnable = (Runnable) this.c;
                cVar.getClass();
                runnable.run();
                cVar.a.remove(runnable);
                break;
            case 5:
                wh0 wh0Var = (wh0) this.b;
                TLObject tLObject = (TLObject) this.c;
                wh0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    wh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        wh0Var.a(false);
                        break;
                    } else {
                        wh0Var.d();
                        wh0Var.c.g3.O(true);
                        break;
                    }
                }
                break;
            case 6:
                bi0 bi0Var = (bi0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = bi0Var.a;
                int i12 = bi0Var.x;
                int size = arrayList.size();
                bi0Var.x = size;
                if (i12 != size && bi0Var.S != null) {
                    bi0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    yh0 yh0Var = (yh0) arrayList2.get(i13);
                    if (yh0Var.o && !yh0Var.p) {
                        arrayList.add(yh0Var);
                    } else if (bi0.j(yh0Var.a, arrayList) == null) {
                        bi0 bi0Var2 = yh0Var.y;
                        float f7 = bi0Var2.N;
                        RectF rectF = yh0Var.c;
                        RectF rectF2 = yh0Var.f;
                        da0 da0Var = yh0Var.r;
                        if (da0Var != null) {
                            da0Var.a();
                            yh0Var.t = z13;
                            yh0Var.s = z13;
                        }
                        yh0Var.o = z14;
                        boolean z15 = rectF.left - 1.0f <= f7 ? z14 : z13;
                        boolean z16 = rectF.right + 1.0f >= ((float) bi0Var2.getMeasuredWidth()) - f7;
                        if (z15 && z16) {
                            z15 = false;
                            z16 = false;
                        }
                        yh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z15) {
                            rectF2.right = rectF2.left;
                        } else if (z16) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = yh0Var.a;
                            if (i14 == 3 || i14 == 2) {
                                z10 = true;
                                if (bi0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z11 = false;
                                    yh0Var.e.d(0.0f, z10);
                                    arrayList.add(yh0Var);
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
                            yh0Var.e.d(0.0f, z10);
                            arrayList.add(yh0Var);
                            i13++;
                            z12 = z11;
                            z13 = false;
                            z14 = true;
                        }
                        z10 = true;
                        z11 = false;
                        yh0Var.e.d(0.0f, z10);
                        arrayList.add(yh0Var);
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
                bi0Var.invalidate();
                break;
            case 7:
                bi0 bi0Var3 = (bi0) this.b;
                yh0 yh0Var2 = (yh0) this.c;
                ai0 ai0Var = bi0Var3.F;
                int i15 = yh0Var2.a;
                RectF rectF3 = yh0Var2.d;
                ProfileActivity.e0(((org.telegram.ui.wx0) ai0Var).b, i15, rectF3.left, rectF3.top);
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
                fk0 fk0Var = (fk0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = fk0Var.r;
                fk0Var.n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    ek0 ek0Var = (ek0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList4.size()) {
                            arrayList4.add(ek0Var);
                        } else if (MessageObject.getObjectPeerId(((ek0) arrayList4.get(i17)).a) != MessageObject.getObjectPeerId(ek0Var.a)) {
                            i17++;
                        } else if (ek0Var.c > 0) {
                            ((ek0) arrayList4.get(i17)).c = ek0Var.c;
                        }
                    }
                }
                q0.a aVar = fk0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                fk0Var.a();
                break;
            case 10:
                wo0 wo0Var = (wo0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = wo0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = wo0Var.K()) < wo0Var.h()) {
                    arrayList5.remove(indexOf);
                    wo0Var.u(K + 1 + indexOf);
                    int size4 = wo0Var.j0.e.size();
                    int size5 = arrayList5.size();
                    if (wo0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        wo0Var.u(K);
                        break;
                    }
                }
                break;
            case 11:
                wo0 wo0Var2 = (wo0) this.b;
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.c;
                wo0Var2.S();
                wc.b0(cyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 12:
                ((jp0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 13:
                ef efVar = (ef) this.b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.c;
                if (unVar != null) {
                    unVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    break;
                }
                break;
            case 14:
                ((WindowManager) this.c).removeView(((ef) this.b).B);
                break;
            case 15:
                mr0 mr0Var = (mr0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    mr0Var.l0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    mr0Var.c1();
                    if (mr0Var.n0) {
                        mr0Var.O0();
                    }
                }
                mr0Var.m0 = false;
                break;
            case 16:
                tu0 tu0Var = (tu0) this.b;
                sr0 sr0Var = (sr0) this.c;
                tu0Var.F = null;
                tu0Var.G = null;
                sr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new i10(sr0Var, 21)).start();
                break;
            case 17:
                bi.t9 t9Var = (bi.t9) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                t9Var.e = !t9Var.e;
                runnableArr[0].run();
                t9Var.j(true);
                break;
            case 18:
                aw0 aw0Var = (aw0) this.b;
                di.a7 a7Var = (di.a7) this.c;
                zs0 zs0Var = aw0Var.b0;
                if (zs0Var != null) {
                    int i18 = a7Var.a;
                    zs0Var.b.d(i18, zs0Var.d.i(i18));
                    break;
                }
                break;
            case 19:
                wc.b0(((ju0) this.b).f.x1).R(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 20:
                wu0 wu0Var = (wu0) this.b;
                String str = (String) this.c;
                if (!wu0Var.v.v1[wu0Var.r].a.isEmpty() && ((i10 = wu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) ic.a.g(1, wu0Var.v.v1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    aw0 aw0Var2 = wu0Var.v;
                    wu0Var.F(id2, str, dialogId, aw0Var2.l1 == aw0Var2.x1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (wu0Var.r == 3) {
                    aw0 aw0Var3 = wu0Var.v;
                    wu0Var.F(0, str, aw0Var3.l1, aw0Var3.F);
                }
                int i19 = wu0Var.r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(wu0Var.v.v1[wu0Var.r].a);
                    wu0Var.s++;
                    Utilities.searchQueue.postRunnable(new kg(wu0Var, str, arrayList6, 26));
                    break;
                }
                break;
            case 21:
                wu0 wu0Var2 = (wu0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                aw0 aw0Var4 = wu0Var2.v;
                boolean z17 = aw0Var4.X0;
                tu0[] tu0VarArr = aw0Var4.m0;
                if (z17) {
                    wu0Var2.s--;
                    int h = wu0Var2.h();
                    wu0Var2.d = arrayList7;
                    int h10 = wu0Var2.h();
                    if (wu0Var2.s == 0 || h10 != 0) {
                        aw0Var4.v1(false);
                    }
                    for (int i20 = 0; i20 < tu0VarArr.length; i20++) {
                        tu0 tu0Var2 = tu0VarArr[i20];
                        if (tu0Var2.E == wu0Var2.r) {
                            if (wu0Var2.s == 0 && h10 == 0) {
                                tu0Var2.v.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                tu0VarArr[i20].v.f.setVisibility(8);
                                tu0VarArr[i20].v.e(false, true);
                            } else if (h == 0) {
                                aw0Var4.C(tu0Var2.h, 0, null);
                            }
                        }
                    }
                    wu0Var2.l();
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
                MessagesController.getInstance(((oz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 24:
                e41 e41Var = (e41) this.b;
                MessagesController.getInstance(e41Var.b).getTopicsController().deleteTopics(-e41Var.c, (ArrayList) this.c);
                int i22 = e41.i0;
                break;
            case 25:
                e41 e41Var2 = (e41) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                e41Var2.getClass();
                MessagesController.getInstance(e41Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
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
                f51.o((f51) this.b, (TLObject) this.c);
                break;
            case 28:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                x51.a(tkVar.getContext(), tkVar.d);
                break;
            default:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.tk) this.b).b, false);
                break;
        }
    }

    public /* synthetic */ t90(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
