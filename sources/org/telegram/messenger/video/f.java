package org.telegram.messenger.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import m.f3;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.la;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Cells.p0;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.a5;
import org.telegram.ui.ib;
import org.telegram.ui.oo;
import org.telegram.ui.rb;
import org.telegram.ui.vb;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0372  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        SQLiteCursor sQLiteCursor;
        String str;
        ArrayList<Long> arrayList;
        TLRPC.User user;
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 2;
        int i15 = 8;
        Bitmap bitmap = null;
        int i16 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                ((VideoAds) obj3).lambda$show$5((tc) obj2, (boolean[]) obj);
                return;
            case 1:
                ((VideoPlayerHolderBase) obj3).lambda$release$3((TLRPC.Document) obj2, (Runnable) obj);
                return;
            case 2:
                ((Utilities.Callback2) obj3).run((TLObject) obj2, (TLRPC.TL_error) obj);
                return;
            case 3:
                ((Utilities.Callback2) obj3).run((TLRPC.Updates) obj2, (TLRPC.TL_error) obj);
                return;
            case 4:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                n2 n2Var = (n2) obj2;
                n2 n2Var2 = (n2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (actionBarLayout.h || actionBarLayout.a0) {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    z10 = false;
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.a0 = false;
                } else {
                    actionBarLayout.v.setTranslationX(0.0f);
                    z10 = false;
                }
                actionBarLayout.m(n2Var);
                n2Var.setRemovingFromStack(z10);
                n2Var.onTransitionAnimationEnd(z10, true);
                n2Var2.onTransitionAnimationEnd(true, true);
                n2Var2.onBecomeFullyVisible();
                return;
            case 5:
                ((n2) obj2).presentFragment((zn) obj);
                ((n3) obj3).c = false;
                return;
            case 6:
                n3 n3Var = (n3) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                m3 m3Var = (m3) obj;
                n3Var.getClass();
                int i17 = 0;
                while (i17 < arrayList2.size()) {
                    if (((k3) arrayList2.get(i17)).a == m3Var) {
                        arrayList2.remove(i17);
                        i17--;
                    }
                    i17++;
                }
                n3Var.invalidate();
                return;
            case 7:
                h6 h6Var = (h6) obj3;
                TLObject tLObject = (TLObject) obj2;
                h6 h6Var2 = (h6) obj;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    h6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                h6Var.g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                NotificationCenter.getInstance(h6Var.E).addObserver(h6Var, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(h6Var.E).addObserver(h6Var, NotificationCenter.fileLoadFailed);
                FileLoader.getInstance(h6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 8:
                w0 w0Var = (w0) obj3;
                a5.s0(w0Var.getContext(), w0Var.H, (TL_wallet.walletTransaction) obj2, null, null, null, (p0) obj, w0Var.g1);
                return;
            case 9:
                w0 w0Var2 = (w0) obj3;
                w0Var2.f1.P1(w0Var2, (TLRPC.TL_premiumGiftOption) obj2, (String) obj);
                return;
            case 10:
                h6 h6Var3 = (h6) obj2;
                h6Var3.f = !h6Var3.d((File) obj, h6Var3.c);
                AndroidUtilities.runOnUIThread(new la(i15, (na) obj3, h6Var3));
                return;
            case 11:
                e0 e0Var = (e0) obj3;
                g5.L((Context) obj2, e0Var.l0, new f3(e0Var, 5), (e6) obj);
                return;
            case 12:
                l8.q((l8) obj3, (b2) obj2, (TLObject) obj);
                return;
            case 13:
                jf jfVar = (jf) obj3;
                jfVar.getClass();
                ((iw0) obj2).getViewTreeObserver().removeOnDrawListener(jfVar);
                ((zp0) obj).a.setHideAvatar(true);
                return;
            case 14:
                pg pgVar = (pg) obj3;
                File file = (File) obj;
                try {
                    InputStream openInputStream = pgVar.getContext().getContentResolver().openInputStream((Uri) obj2);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, -1, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(photoEntry);
                            AndroidUtilities.runOnUIThread(new f(pgVar, arrayList3, file, 15));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 15:
                ((pg) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 16:
                final yi yiVar = (yi) obj3;
                final jh jhVar = (jh) obj;
                final boolean z11 = yiVar.C0.getCurrentItemTop() <= ((qi) obj2).getButtonsHideOffset();
                float alpha = yiVar.a1.getAlpha();
                float f7 = z11 ? 1.0f : 0.0f;
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.b(new qh(yiVar, alpha, f7, z11));
                kVar.a(new o1.f() { // from class: org.telegram.ui.Components.rh
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f10, float f11) {
                        yi.x(yi.this, z11, jhVar);
                    }
                });
                o1.l lVar = new o1.l(500.0f);
                kVar.u = lVar;
                lVar.a(1.0f);
                kVar.u.b(1000.0f);
                kVar.h();
                yiVar.w1 = kVar;
                return;
            case 17:
                yi.q((yi) obj3, (AnimationNotificationsLocker) obj2, (z2) obj);
                return;
            case 18:
                TLObject tLObject2 = (TLObject) obj2;
                h6 h6Var4 = (h6) obj;
                HashMap hashMap = ((aq) obj3).s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    h6Var4.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, h6Var4);
                FileLoader.getInstance(h6Var4.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 19:
                gt gtVar = (gt) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                ft ftVar = (ft) obj;
                ArrayList arrayList4 = new ArrayList();
                ArrayList<Long> arrayList5 = new ArrayList<>();
                long j3 = 0;
                try {
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList5.add(Long.valueOf(queryFinalized.longValue(0)));
                            j3 = Math.max(j3, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                        } catch (Exception e7) {
                            e = e7;
                            sQLiteCursor = queryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(gtVar, arrayList4, j3, str, ftVar, 4));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> users = messagesStorage.getUsers(arrayList5);
                    if (users != null) {
                        int size = arrayList5.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Long l4 = arrayList5.get(i18);
                            i18++;
                            long longValue = l4.longValue();
                            int size2 = users.size();
                            int i19 = i16;
                            while (true) {
                                if (i19 < size2) {
                                    TLRPC.User user2 = users.get(i19);
                                    i19++;
                                    user = user2;
                                    if (user != null) {
                                        arrayList = arrayList5;
                                        if (user.id == longValue) {
                                        }
                                    } else {
                                        arrayList = arrayList5;
                                    }
                                    arrayList5 = arrayList;
                                } else {
                                    arrayList = arrayList5;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList4.add(user);
                            }
                            arrayList5 = arrayList;
                            i16 = 0;
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                    str = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(gtVar, arrayList4, j3, str, ftVar, 4));
                return;
            case 20:
                l00 l00Var = (l00) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                p00 p00Var = l00Var.J;
                int[] iArr = p00Var.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!p00Var.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, p00Var.g(!l00Var.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i20 = l00Var.U;
                if (i20 != 0 && (i10 = l00Var.V) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i20 * i10 * 4);
                    GLES20.glReadPixels(0, 0, l00Var.U, l00Var.V, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(l00Var.U, l00Var.V, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 21:
                s10 s10Var = (s10) obj3;
                s10Var.z0 = -1;
                tc M = ad.a0((n2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, s10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                s10Var.A0 = true;
                s10Var.dismiss();
                s10Var.n.getMessagesController().invalidateChatlistFolderUpdate(s10Var.Y);
                return;
            case 22:
                s10 s10Var2 = (s10) obj3;
                s10Var2.z0 = s10Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new oo(i15, s10Var2, (Pair) obj));
                return;
            case 23:
                t70 t70Var = (t70) obj3;
                t70Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((n2) obj).presentFragment(new ProfileActivity(bundle, null));
                t70Var.l0 = true;
                return;
            case 24:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                t70 t70Var2 = ((n70) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = t70Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (t70Var2.j0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = t70Var2.d;
                    if (chatFull2 != null) {
                        int i21 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i21;
                        if (i21 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((org.telegram.ui.ActionBar.f3) t70Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(t70Var2.g0, chatFull2.invitesCount);
                    }
                    ib ibVar = t70Var2.j0;
                    if (ibVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = t70Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        vb vbVar = ibVar.a;
                        ArrayList arrayList6 = vbVar.o0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((n2) vbVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f, vbVar.T, true).contentType < 0) {
                            return;
                        }
                        vbVar.R0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            vbVar.C0.N = true;
                            rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size4);
                            vb.K0(vbVar);
                        }
                        vbVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                d80.P((d80) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 26:
                z70 z70Var = (z70) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                z70Var.h = null;
                z70Var.c = arrayList7;
                z70Var.d = (ArrayList) obj;
                gg.b2 b2Var = z70Var.e;
                b2Var.f(arrayList7, null);
                d80 d80Var = z70Var.n;
                d80Var.K(z70Var.f - 1);
                z70Var.l();
                if (b2Var.e() || z70Var.h() > 2) {
                    return;
                }
                d80Var.s.e(false, true);
                return;
            case 27:
                ea0 ea0Var = (ea0) obj3;
                fa0 fa0Var = (fa0) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                da0 da0Var = ea0Var.h;
                if (da0Var == null || ea0Var.e != fa0Var) {
                    return;
                }
                da0Var.a(clickableSpan);
                ea0Var.e = null;
                ea0Var.b.d(true);
                return;
            case 28:
                zc0 zc0Var = (zc0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                e6 e6Var = zc0Var.c;
                TextView textView = zc0Var.f;
                TextView textView2 = zc0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        zc0Var.E = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new ad(ob.a(zc0Var.getContext()), e6Var).f0(tL_error2, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject4).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = zc0Var.d.animate().alpha(1.0f);
                hs hsVar = hs.h;
                bi.t(alpha2, hsVar, 320L);
                zc0Var.h.animate().alpha(0.0f).setInterpolator(hsVar).setDuration(320L).start();
                if (zc0Var.E) {
                    zc0Var.setBackground(i6.Z(i6.w0(i6.i6, e6Var), 6, 0));
                    zc0Var.setOnClickListener(new b90(zc0Var, i14));
                    return;
                } else {
                    zc0Var.setBackground(null);
                    zc0Var.setOnClickListener(null);
                    return;
                }
            default:
                bf0.q((bf0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
        }
    }

    public /* synthetic */ f(bf0 bf0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 29;
        this.b = bf0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
