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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ny(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r60 r60Var;
        org.telegram.ui.hb hbVar;
        int i10;
        ci.y0 y0Var;
        int indexOf;
        int L;
        switch (this.a) {
            case 0:
                ((py) this.b).F((String) this.c, "", true, false, false);
                break;
            case 1:
                py pyVar = (py) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                kz kzVar = pyVar.L;
                MessagesController.getInstance(kzVar.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i11 = kzVar.c1;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str = pyVar.w;
                pyVar.w = null;
                pyVar.F(str, "", false, false, false);
                break;
            case 2:
                vz vzVar = (vz) this.b;
                ci.n8 n8Var = (ci.n8) this.c;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.h1 = n8Var;
                zzVar.j();
                break;
            case 3:
                ((vz) this.b).J.f1 = (yz) this.c;
                break;
            case 4:
                c10 c10Var = (c10) this.b;
                Pair pair = (Pair) this.c;
                c10Var.z0 = -1;
                ((Runnable) pair.first).run();
                break;
            case 5:
                ((org.telegram.ui.nf) this.b).run((org.telegram.ui.ActionBar.n2) this.c);
                break;
            case 6:
                u40 u40Var = (u40) this.b;
                Uri uri = (Uri) this.c;
                u40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u40Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0(bundle);
                        mq0Var.e = false;
                        mq0Var.f = false;
                        mq0Var.c = u40Var;
                        launchActivity.p0(mq0Var);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    u40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 7:
                v50 v50Var = (v50) this.b;
                q50 q50Var = (q50) this.c;
                w50 w50Var = v50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                w50Var.N = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, w50Var.L);
                VideoEditedInfo videoEditedInfo2 = w50Var.N;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = w50Var.H;
                videoEditedInfo2.encryptedFile = w50Var.I;
                videoEditedInfo2.key = w50Var.J;
                videoEditedInfo2.iv = w50Var.K;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = v50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = w50Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = w50Var.Z0;
                videoEditedInfo3.estimatedDuration = w50Var.f0;
                w50Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (q50Var != null) {
                    photoEntry.ttl = q50Var.c;
                    photoEntry.effectId = q50Var.d;
                }
                w50Var.c.q(photoEntry, w50Var.N, q50Var == null || q50Var.a, q50Var != null ? q50Var.b : 0, 0, false, q50Var != null ? q50Var.e : 0L);
                break;
            case 8:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                v50 v50Var2 = (v50) l7Var.b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && v50Var2.A0.size() > 1) {
                    ArrayList arrayList = v50Var2.A0;
                    arrayList.add((Bitmap) hg.c.h(1, arrayList));
                    break;
                } else {
                    v50Var2.A0.add(bitmap);
                    break;
                }
            case 9:
                r60 r60Var2 = (r60) this.b;
                TLObject tLObject = (TLObject) this.c;
                r60Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        r60Var2.c.put(Long.valueOf(r60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        r60Var2.T.l();
                        break;
                    }
                }
                break;
            case 10:
                l60 l60Var = (l60) this.b;
                if (((TLRPC.TL_error) this.c) == null && (hbVar = (r60Var = l60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = r60Var.b;
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
                b70 b70Var = (b70) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                b70Var.setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                break;
            case 12:
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.b;
                org.telegram.ui.kp kpVar = (org.telegram.ui.kp) this.c;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", chatFull.guard_bot_id);
                kpVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 13:
                x80 x80Var = (x80) this.b;
                if (x80Var.O0 == ((d90) this.c)) {
                    x80Var.performLongClick();
                    x80Var.O0 = null;
                    x80Var.M0.d(true);
                    break;
                }
                break;
            case 14:
                ((z80) this.b).l((g90) this.c, false);
                break;
            case 15:
                ba0 ba0Var = (ba0) this.b;
                if (!((boolean[]) this.c)[0] && (y0Var = ba0Var.U) != null) {
                    y0Var.run();
                }
                ba0Var.U = null;
                break;
            case 16:
                da0 da0Var = (da0) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                da0Var.setFocusable(true);
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
                yg0 yg0Var = (yg0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                yg0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    yg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        yg0Var.a(false);
                        break;
                    } else {
                        yg0Var.d();
                        yg0Var.c.Y2.N(true);
                        break;
                    }
                }
                break;
            case 19:
                dh0 dh0Var = (dh0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = dh0Var.a;
                int i13 = dh0Var.x;
                int size3 = arrayList3.size();
                dh0Var.x = size3;
                if (i13 != size3 && dh0Var.S != null) {
                    dh0Var.g();
                }
                int size4 = arrayList4.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ah0 ah0Var = (ah0) arrayList4.get(i14);
                    if (ah0Var.o && !ah0Var.p) {
                        arrayList3.add(ah0Var);
                    } else if (dh0.j(ah0Var.a, arrayList3) == null) {
                        dh0 dh0Var2 = ah0Var.y;
                        float f7 = dh0Var2.N;
                        RectF rectF = ah0Var.c;
                        RectF rectF2 = ah0Var.f;
                        g90 g90Var = ah0Var.r;
                        if (g90Var != null) {
                            g90Var.a();
                            ah0Var.t = false;
                            ah0Var.s = false;
                        }
                        ah0Var.o = true;
                        boolean z10 = rectF.left - 1.0f <= f7;
                        boolean z11 = rectF.right + 1.0f >= ((float) dh0Var2.getMeasuredWidth()) - f7;
                        if (z10 && z11) {
                            z11 = false;
                            z10 = false;
                        }
                        ah0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = ah0Var.a;
                            if ((i15 == 3 || i15 == 2) && dh0Var2.H == 1) {
                                rectF2.left = rectF2.right;
                            } else {
                                float centerX = rectF2.centerX();
                                rectF2.right = centerX;
                                rectF2.left = centerX;
                            }
                        }
                        ah0Var.e.d(0.0f, true);
                        arrayList3.add(ah0Var);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                dh0Var.invalidate();
                break;
            case 20:
                dh0 dh0Var3 = (dh0) this.b;
                ah0 ah0Var2 = (ah0) this.c;
                ch0 ch0Var = dh0Var3.F;
                int i16 = ah0Var2.a;
                RectF rectF3 = ah0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) ch0Var).b, i16, rectF3.left, rectF3.top);
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
                fj0 fj0Var = (fj0) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = fj0Var.r;
                fj0Var.n.addAll(arrayList5);
                int size5 = arrayList5.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj2 = arrayList5.get(i17);
                    i17++;
                    ej0 ej0Var = (ej0) obj2;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList6.size()) {
                            arrayList6.add(ej0Var);
                        } else if (MessageObject.getObjectPeerId(((ej0) arrayList6.get(i18)).a) != MessageObject.getObjectPeerId(ej0Var.a)) {
                            i18++;
                        } else if (ej0Var.c > 0) {
                            ((ej0) arrayList6.get(i18)).c = ej0Var.c;
                        }
                    }
                }
                q0.a aVar = fj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList5);
                }
                fj0Var.a();
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
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
                rn0Var2.T();
                vc.a0(uyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 26:
                ((co0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 27:
                cf cfVar = (cf) this.b;
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.c;
                if (boVar != null) {
                    boVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    cfVar.dismiss();
                    break;
                }
                break;
            case 28:
                ((WindowManager) this.c).removeView(((cf) this.b).B);
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

    public /* synthetic */ ny(hq0 hq0Var, TLObject tLObject, Context context) {
        this.a = 29;
        this.b = hq0Var;
        this.c = tLObject;
    }
}
