package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oy(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s60 s60Var;
        org.telegram.ui.hb hbVar;
        int i10;
        ci.y0 y0Var;
        int indexOf;
        int L;
        switch (this.a) {
            case 0:
                ((qy) this.b).F((String) this.c, "", true, false, false);
                break;
            case 1:
                qy qyVar = (qy) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                lz lzVar = qyVar.L;
                MessagesController.getInstance(lzVar.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i11 = lzVar.c1;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str = qyVar.w;
                qyVar.w = null;
                qyVar.F(str, "", false, false, false);
                break;
            case 2:
                wz wzVar = (wz) this.b;
                ci.k8 k8Var = (ci.k8) this.c;
                wzVar.c();
                wzVar.h(k8Var);
                a00 a00Var = wzVar.J;
                a00Var.h1 = k8Var;
                a00Var.j();
                break;
            case 3:
                ((wz) this.b).J.f1 = (zz) this.c;
                break;
            case 4:
                d10 d10Var = (d10) this.b;
                Pair pair = (Pair) this.c;
                d10Var.z0 = -1;
                ((Runnable) pair.first).run();
                break;
            case 5:
                ((org.telegram.ui.oc) this.b).run((org.telegram.ui.ActionBar.n2) this.c);
                break;
            case 6:
                v40 v40Var = (v40) this.b;
                Uri uri = (Uri) this.c;
                v40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) v40Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.gq0 gq0Var = new org.telegram.ui.gq0(bundle);
                        gq0Var.e = false;
                        gq0Var.f = false;
                        gq0Var.c = v40Var;
                        launchActivity.p0(gq0Var);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    v40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 7:
                w50 w50Var = (w50) this.b;
                r50 r50Var = (r50) this.c;
                x50 x50Var = w50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                x50Var.N = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, x50Var.L);
                VideoEditedInfo videoEditedInfo2 = x50Var.N;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = x50Var.H;
                videoEditedInfo2.encryptedFile = x50Var.I;
                videoEditedInfo2.key = x50Var.J;
                videoEditedInfo2.iv = x50Var.K;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = w50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = x50Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = x50Var.Z0;
                videoEditedInfo3.estimatedDuration = x50Var.f0;
                x50Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (r50Var != null) {
                    photoEntry.ttl = r50Var.c;
                    photoEntry.effectId = r50Var.d;
                }
                x50Var.c.q(photoEntry, x50Var.N, r50Var == null || r50Var.a, r50Var != null ? r50Var.b : 0, 0, false, r50Var != null ? r50Var.e : 0L);
                break;
            case 8:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                w50 w50Var2 = (w50) l7Var.b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && w50Var2.A0.size() > 1) {
                    ArrayList arrayList = w50Var2.A0;
                    arrayList.add((Bitmap) hg.c.h(1, arrayList));
                    break;
                } else {
                    w50Var2.A0.add(bitmap);
                    break;
                }
            case 9:
                s60 s60Var2 = (s60) this.b;
                TLObject tLObject = (TLObject) this.c;
                s60Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        s60Var2.c.put(Long.valueOf(s60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        s60Var2.T.l();
                        break;
                    }
                }
                break;
            case 10:
                m60 m60Var = (m60) this.b;
                if (((TLRPC.TL_error) this.c) == null && (hbVar = (s60Var = m60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = s60Var.b;
                    org.telegram.ui.ub ubVar = hbVar.a;
                    ArrayList arrayList2 = ubVar.o0;
                    int size = arrayList2.size();
                    int i12 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    i10 = ((org.telegram.ui.ActionBar.n2) ubVar).currentAccount;
                    if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList2.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 11:
                c70 c70Var = (c70) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                c70Var.setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                break;
            case 12:
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.b;
                org.telegram.ui.gp gpVar = (org.telegram.ui.gp) this.c;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", chatFull.guard_bot_id);
                gpVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 13:
                y80 y80Var = (y80) this.b;
                if (y80Var.O0 == ((e90) this.c)) {
                    y80Var.performLongClick();
                    y80Var.O0 = null;
                    y80Var.M0.d(true);
                    break;
                }
                break;
            case 14:
                ((a90) this.b).l((h90) this.c, false);
                break;
            case 15:
                ca0 ca0Var = (ca0) this.b;
                if (!((boolean[]) this.c)[0] && (y0Var = ca0Var.U) != null) {
                    y0Var.run();
                }
                ca0Var.U = null;
                break;
            case 16:
                ea0 ea0Var = (ea0) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                ea0Var.setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                break;
            case 17:
                pb.c cVar = (pb.c) this.b;
                Runnable runnable = (Runnable) this.c;
                cVar.getClass();
                runnable.run();
                cVar.a.remove(runnable);
                break;
            case 18:
                zg0 zg0Var = (zg0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                zg0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    zg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        zg0Var.a(false);
                        break;
                    } else {
                        zg0Var.d();
                        zg0Var.c.Y2.N(true);
                        break;
                    }
                }
                break;
            case 19:
                eh0 eh0Var = (eh0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = eh0Var.a;
                int i13 = eh0Var.x;
                int size3 = arrayList3.size();
                eh0Var.x = size3;
                if (i13 != size3 && eh0Var.S != null) {
                    eh0Var.g();
                }
                int size4 = arrayList4.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    bh0 bh0Var = (bh0) arrayList4.get(i14);
                    if (bh0Var.o && !bh0Var.p) {
                        arrayList3.add(bh0Var);
                    } else if (eh0.j(bh0Var.a, arrayList3) == null) {
                        eh0 eh0Var2 = bh0Var.y;
                        float f7 = eh0Var2.N;
                        RectF rectF = bh0Var.c;
                        RectF rectF2 = bh0Var.f;
                        h90 h90Var = bh0Var.r;
                        if (h90Var != null) {
                            h90Var.a();
                            bh0Var.t = false;
                            bh0Var.s = false;
                        }
                        bh0Var.o = true;
                        boolean z10 = rectF.left - 1.0f <= f7;
                        boolean z11 = rectF.right + 1.0f >= ((float) eh0Var2.getMeasuredWidth()) - f7;
                        if (z10 && z11) {
                            z11 = false;
                            z10 = false;
                        }
                        bh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = bh0Var.a;
                            if ((i15 == 3 || i15 == 2) && eh0Var2.H == 1) {
                                rectF2.left = rectF2.right;
                            } else {
                                float centerX = rectF2.centerX();
                                rectF2.right = centerX;
                                rectF2.left = centerX;
                            }
                        }
                        bh0Var.e.d(0.0f, true);
                        arrayList3.add(bh0Var);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                eh0Var.invalidate();
                break;
            case 20:
                eh0 eh0Var3 = (eh0) this.b;
                bh0 bh0Var2 = (bh0) this.c;
                dh0 dh0Var = eh0Var3.F;
                int i16 = bh0Var2.a;
                RectF rectF3 = bh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.dy0) dh0Var).b, i16, rectF3.left, rectF3.top);
                break;
            case 21:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.b;
                Object obj = (ViewParent) this.c;
                t1Var.invalidate();
                if (obj instanceof View) {
                    ((View) obj).invalidate();
                    break;
                }
                break;
            case 22:
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
            case 23:
                gj0 gj0Var = (gj0) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = gj0Var.r;
                gj0Var.n.addAll(arrayList5);
                int size5 = arrayList5.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj2 = arrayList5.get(i17);
                    i17++;
                    fj0 fj0Var = (fj0) obj2;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList6.size()) {
                            arrayList6.add(fj0Var);
                        } else if (MessageObject.getObjectPeerId(((fj0) arrayList6.get(i18)).a) != MessageObject.getObjectPeerId(fj0Var.a)) {
                            i18++;
                        } else if (fj0Var.c > 0) {
                            ((fj0) arrayList6.get(i18)).c = fj0Var.c;
                        }
                    }
                }
                q0.a aVar = gj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList5);
                }
                gj0Var.a();
                break;
            case 24:
                rn0 rn0Var = (rn0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList7 = rn0Var.K;
                if (!arrayList7.isEmpty() && (indexOf = arrayList7.indexOf(tL_sponsoredPeer)) >= 0 && (L = rn0Var.L()) < rn0Var.h()) {
                    arrayList7.remove(indexOf);
                    rn0Var.u(L + 1 + indexOf);
                    int size6 = rn0Var.j0.e.size();
                    int size7 = arrayList7.size();
                    if (rn0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        rn0Var.u(L);
                        break;
                    }
                }
                break;
            case 25:
                rn0 rn0Var2 = (rn0) this.b;
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.c;
                rn0Var2.T();
                xc.a0(ryVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 26:
                ((co0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 27:
                ef efVar = (ef) this.b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.c;
                if (xnVar != null) {
                    xnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    break;
                }
                break;
            case 28:
                ((WindowManager) this.c).removeView(((ef) this.b).B);
                break;
            default:
                hq0 hq0Var = (hq0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    hq0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    hq0Var.Z0();
                    if (hq0Var.m0) {
                        hq0Var.M0();
                    }
                }
                hq0Var.l0 = false;
                break;
        }
    }

    public /* synthetic */ oy(hq0 hq0Var, TLObject tLObject, Context context) {
        this.a = 29;
        this.b = hq0Var;
        this.c = tLObject;
    }
}
