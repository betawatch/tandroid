package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f60(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p70 p70Var;
        org.telegram.ui.mb mbVar;
        int i10;
        di.x0 x0Var;
        boolean z10;
        boolean z11;
        int indexOf;
        int L;
        int i11;
        boolean z12 = false;
        int i12 = 2;
        int i13 = 4;
        boolean z13 = false;
        boolean z14 = true;
        switch (this.a) {
            case 0:
                i60 i60Var = (i60) this.b;
                d60 d60Var = (d60) this.c;
                p60 p60Var = i60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                p60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, p60Var.Q);
                VideoEditedInfo videoEditedInfo2 = p60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = p60Var.M;
                videoEditedInfo2.encryptedFile = p60Var.N;
                videoEditedInfo2.key = p60Var.O;
                videoEditedInfo2.iv = p60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = i60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = p60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = p60Var.j1;
                videoEditedInfo3.estimatedDuration = p60Var.k0;
                p60Var.j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, i60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (d60Var != null) {
                    photoEntry.ttl = d60Var.c;
                    photoEntry.effectId = d60Var.d;
                }
                p60Var.n.s(photoEntry, p60Var.S, d60Var == null || d60Var.a, d60Var != null ? d60Var.b : 0, 0, false, d60Var != null ? d60Var.e : 0L);
                break;
            case 1:
                org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                i60 i60Var2 = (i60) t6Var.b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && i60Var2.A0.size() > 1) {
                    ArrayList arrayList = i60Var2.A0;
                    arrayList.add((Bitmap) i2.d.g(1, arrayList));
                    break;
                } else {
                    i60Var2.A0.add(bitmap);
                    break;
                }
                break;
            case 2:
                p70 p70Var2 = (p70) this.b;
                TLObject tLObject = (TLObject) this.c;
                p70Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        p70Var2.c.put(Long.valueOf(p70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        p70Var2.T.l();
                        break;
                    }
                }
                break;
            case 3:
                j70 j70Var = (j70) this.b;
                if (((TLRPC.TL_error) this.c) == null && (mbVar = (p70Var = j70Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = p70Var.b;
                    org.telegram.ui.ac acVar = mbVar.a;
                    ArrayList arrayList2 = acVar.o0;
                    int size = arrayList2.size();
                    int i14 = acVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = acVar.getAccountInstance().getUserConfig().clientUserId;
                    i10 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                    if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) acVar.n0, (HashMap<String, ArrayList<MessageObject>>) acVar.m0, acVar.f, acVar.T, true).contentType >= 0) {
                        acVar.R0();
                        int size2 = arrayList2.size() - size;
                        if (size2 > 0) {
                            acVar.C0.N = true;
                            org.telegram.ui.wb wbVar = acVar.E;
                            wbVar.s(wbVar.h, size2);
                            org.telegram.ui.ac.K0(acVar);
                        }
                        acVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 4:
                a80 a80Var = (a80) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                a80Var.setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i12, editTextBoldCursor));
                break;
            case 5:
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.b;
                org.telegram.ui.np npVar = (org.telegram.ui.np) this.c;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", chatFull.guard_bot_id);
                npVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                y90 y90Var = (y90) this.b;
                if (y90Var.O0 == ((ea0) this.c)) {
                    y90Var.performLongClick();
                    y90Var.O0 = null;
                    y90Var.M0.d(true);
                    break;
                }
                break;
            case 7:
                ((aa0) this.b).l((ha0) this.c, false);
                break;
            case 8:
                cb0 cb0Var = (cb0) this.b;
                if (!((boolean[]) this.c)[0] && (x0Var = cb0Var.U) != null) {
                    x0Var.run();
                }
                cb0Var.U = null;
                break;
            case 9:
                eb0 eb0Var = (eb0) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                eb0Var.setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i13, editTextBoldCursor2));
                break;
            case 10:
                ji.w4 w4Var = (ji.w4) this.b;
                Runnable runnable = (Runnable) this.c;
                w4Var.getClass();
                runnable.run();
                ((HashMap) w4Var.b).remove(runnable);
                break;
            case 11:
                zh0 zh0Var = (zh0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                zh0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
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
            case 12:
                ei0 ei0Var = (ei0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = ei0Var.a;
                int i15 = ei0Var.x;
                int size3 = arrayList3.size();
                ei0Var.x = size3;
                if (i15 != size3 && ei0Var.S != null) {
                    ei0Var.g();
                }
                int size4 = arrayList4.size();
                int i16 = 0;
                while (i16 < size4) {
                    bi0 bi0Var = (bi0) arrayList4.get(i16);
                    if (bi0Var.o && !bi0Var.p) {
                        arrayList3.add(bi0Var);
                    } else if (ei0.j(bi0Var.a, arrayList3) == null) {
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
                            int i17 = bi0Var.a;
                            if (i17 == 3 || i17 == 2) {
                                z10 = true;
                                if (ei0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z11 = false;
                                    bi0Var.e.d(0.0f, z10);
                                    arrayList3.add(bi0Var);
                                    i16++;
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
                            arrayList3.add(bi0Var);
                            i16++;
                            z12 = z11;
                            z13 = false;
                            z14 = true;
                        }
                        z10 = true;
                        z11 = false;
                        bi0Var.e.d(0.0f, z10);
                        arrayList3.add(bi0Var);
                        i16++;
                        z12 = z11;
                        z13 = false;
                        z14 = true;
                    }
                    z11 = z12;
                    i16++;
                    z12 = z11;
                    z13 = false;
                    z14 = true;
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                ei0Var.invalidate();
                break;
            case 13:
                ei0 ei0Var3 = (ei0) this.b;
                bi0 bi0Var2 = (bi0) this.c;
                di0 di0Var = ei0Var3.F;
                int i18 = bi0Var2.a;
                RectF rectF3 = bi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.py0) di0Var).b, i18, rectF3.left, rectF3.top);
                break;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.b;
                Object obj = (ViewParent) this.c;
                u1Var.invalidate();
                if (obj instanceof View) {
                    ((View) obj).invalidate();
                    break;
                }
                break;
            case 15:
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
            case 16:
                gk0 gk0Var = (gk0) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = gk0Var.r;
                gk0Var.n.addAll(arrayList5);
                int size5 = arrayList5.size();
                int i19 = 0;
                while (i19 < size5) {
                    Object obj2 = arrayList5.get(i19);
                    i19++;
                    fk0 fk0Var = (fk0) obj2;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= arrayList6.size()) {
                            arrayList6.add(fk0Var);
                        } else if (MessageObject.getObjectPeerId(((fk0) arrayList6.get(i20)).a) != MessageObject.getObjectPeerId(fk0Var.a)) {
                            i20++;
                        } else if (fk0Var.c > 0) {
                            ((fk0) arrayList6.get(i20)).c = fk0Var.c;
                        }
                    }
                }
                q0.a aVar = gk0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList5);
                }
                gk0Var.a();
                break;
            case 17:
                so0 so0Var = (so0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList7 = so0Var.K;
                if (!arrayList7.isEmpty() && (indexOf = arrayList7.indexOf(tL_sponsoredPeer)) >= 0 && (L = so0Var.L()) < so0Var.h()) {
                    arrayList7.remove(indexOf);
                    so0Var.u(L + 1 + indexOf);
                    int size6 = so0Var.j0.e.size();
                    int size7 = arrayList7.size();
                    if (so0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        so0Var.u(L);
                        break;
                    }
                }
                break;
            case 18:
                so0 so0Var2 = (so0) this.b;
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.c;
                so0Var2.T();
                zc.a0(yyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 19:
                ((dp0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 20:
                gf gfVar = (gf) this.b;
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.c;
                if (foVar != null) {
                    foVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    gfVar.dismiss();
                    break;
                }
                break;
            case 21:
                ((WindowManager) this.c).removeView(((gf) this.b).B);
                break;
            case 22:
                jr0 jr0Var = (jr0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    jr0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    jr0Var.a1();
                    if (jr0Var.m0) {
                        jr0Var.N0();
                    }
                }
                jr0Var.l0 = false;
                break;
            case 23:
                qu0 qu0Var = (qu0) this.b;
                qr0 qr0Var = (qr0) this.c;
                qu0Var.G = null;
                qu0Var.H = null;
                qr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new k90(qr0Var, 17)).start();
                break;
            case 24:
                xv0 xv0Var = (xv0) this.b;
                bi.p8 p8Var = (bi.p8) this.c;
                ss0 ss0Var = xv0Var.W;
                if (ss0Var != null) {
                    int i21 = p8Var.a;
                    ss0Var.n.d(i21, ss0Var.s.i(i21));
                    break;
                }
                break;
            case 25:
                zc.a0(((gu0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 26:
                tu0 tu0Var = (tu0) this.b;
                String str = (String) this.c;
                if (!tu0Var.v.t1[tu0Var.r].a.isEmpty() && ((i11 = tu0Var.r) == 1 || i11 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.d.g(1, tu0Var.v.t1[i11].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    xv0 xv0Var2 = tu0Var.v;
                    tu0Var.F(id2, str, dialogId, xv0Var2.j1 == xv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (tu0Var.r == 3) {
                    xv0 xv0Var3 = tu0Var.v;
                    tu0Var.F(0, str, xv0Var3.j1, xv0Var3.F);
                }
                int i22 = tu0Var.r;
                if (i22 == 1 || i22 == 4) {
                    ArrayList arrayList8 = new ArrayList(tu0Var.v.t1[tu0Var.r].a);
                    tu0Var.s++;
                    Utilities.searchQueue.postRunnable(new v70((lm0) tu0Var, str, arrayList8, 14));
                    break;
                }
                break;
            case 27:
                tu0 tu0Var2 = (tu0) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                xv0 xv0Var4 = tu0Var2.v;
                boolean z17 = xv0Var4.V0;
                qu0[] qu0VarArr = xv0Var4.k0;
                if (z17) {
                    tu0Var2.s--;
                    int h = tu0Var2.h();
                    tu0Var2.d = arrayList9;
                    int h10 = tu0Var2.h();
                    if (tu0Var2.s == 0 || h10 != 0) {
                        xv0Var4.m1(false);
                    }
                    for (int i23 = 0; i23 < qu0VarArr.length; i23++) {
                        qu0 qu0Var2 = qu0VarArr[i23];
                        if (qu0Var2.F == tu0Var2.r) {
                            if (tu0Var2.s == 0 && h10 == 0) {
                                qu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qu0VarArr[i23].w.f.setVisibility(8);
                                qu0VarArr[i23].w.e(false, true);
                            } else if (h == 0) {
                                xv0Var4.z(qu0Var2.h, 0, null);
                            }
                        }
                    }
                    tu0Var2.l();
                    break;
                }
                break;
            case 28:
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i24 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i24, bool, tLObject4, document, null, bool);
                break;
            default:
                MessagesController.getInstance(((fz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
        }
    }

    public /* synthetic */ f60(jr0 jr0Var, TLObject tLObject, Context context) {
        this.a = 22;
        this.b = jr0Var;
        this.c = tLObject;
    }
}
