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
import fh.m1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import of.v1;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.ka;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.we;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb;
import org.telegram.ui.lb;
import org.telegram.ui.pb;
import org.telegram.ui.qn;
import org.telegram.ui.rc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0379  */
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
        int i9;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 15;
        int i14 = 8;
        Bitmap bitmap = null;
        int i15 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                ((VideoAds) obj3).lambda$show$3((gc) obj2, (TLRPC.TL_sponsoredMessage) obj);
                return;
            case 1:
                ((VideoAds) obj3).lambda$show$5((gc) obj2, (boolean[]) obj);
                return;
            case 2:
                ((VideoPlayerHolderBase) obj3).lambda$release$3((TLRPC.Document) obj2, (Runnable) obj);
                return;
            case 3:
                ((Utilities.Callback2) obj3).run((TLObject) obj2, (TLRPC.TL_error) obj);
                return;
            case 4:
                ((Utilities.Callback2) obj3).run((TLRPC.Updates) obj2, (TLRPC.TL_error) obj);
                return;
            case 5:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                o2 o2Var = (o2) obj2;
                o2 o2Var2 = (o2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.F;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.F);
                }
                if (actionBarLayout.h || actionBarLayout.T) {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    z10 = false;
                    actionBarLayout.h = false;
                    actionBarLayout.F = null;
                    actionBarLayout.T = false;
                } else {
                    actionBarLayout.v.setTranslationX(0.0f);
                    z10 = false;
                }
                actionBarLayout.m(o2Var);
                o2Var.setRemovingFromStack(z10);
                o2Var.onTransitionAnimationEnd(z10, true);
                o2Var2.onTransitionAnimationEnd(true, true);
                o2Var2.onBecomeFullyVisible();
                return;
            case 6:
                ((o2) obj2).presentFragment((qn) obj);
                ((m3) obj3).c = false;
                return;
            case 7:
                m3 m3Var = (m3) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                l3 l3Var = (l3) obj;
                m3Var.getClass();
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    if (((j3) arrayList2.get(i16)).a == l3Var) {
                        arrayList2.remove(i16);
                        i16--;
                    }
                    i16++;
                }
                m3Var.invalidate();
                return;
            case 8:
                e6 e6Var = (e6) obj3;
                TLObject tLObject = (TLObject) obj2;
                e6 e6Var2 = (e6) obj;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    e6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                e6Var.c0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                NotificationCenter.getInstance(e6Var.A).addObserver(e6Var, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(e6Var.A).addObserver(e6Var, NotificationCenter.fileLoadFailed);
                FileLoader.getInstance(e6Var2.A).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 9:
                w0 w0Var = (w0) obj3;
                w0Var.T0.v1(w0Var, (TLRPC.TL_premiumGiftOption) obj2, (String) obj);
                return;
            case 10:
                e6 e6Var3 = (e6) obj2;
                e6Var3.f = !e6Var3.d((File) obj, e6Var3.c);
                AndroidUtilities.runOnUIThread(new ka(i14, (ma) obj3, e6Var3));
                return;
            case 11:
                e0 e0Var = (e0) obj3;
                y4.M((Context) obj2, e0Var.h0, new n2.p(e0Var, 7), (b6) obj);
                return;
            case 12:
                c8.o((c8) obj3, (c2) obj2, (TLObject) obj);
                return;
            case 13:
                we weVar = (we) obj3;
                weVar.getClass();
                ((mu0) obj2).getViewTreeObserver().removeOnDrawListener(weVar);
                ((do0) obj).a.setHideAvatar(true);
                return;
            case 14:
                dg dgVar = (dg) obj3;
                File file = (File) obj;
                try {
                    InputStream openInputStream = dgVar.getContext().getContentResolver().openInputStream((Uri) obj2);
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
                            AndroidUtilities.runOnUIThread(new e(dgVar, arrayList3, file, i13));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            case 15:
                ((dg) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 16:
                ki.n((ki) obj3, (AnimationNotificationsLocker) obj2, (z2) obj);
                return;
            case 17:
                final ki kiVar = (ki) obj3;
                final wg wgVar = (wg) obj;
                final boolean z11 = kiVar.v0.getCurrentItemTop() <= ((ci) obj2).getButtonsHideOffset();
                float alpha = kiVar.T0.getAlpha();
                float f10 = z11 ? 1.0f : 0.0f;
                o1.j jVar = new o1.j(new gb.a(0.0f));
                jVar.b(new dh(kiVar, alpha, f10, z11));
                jVar.a(new o1.f() { // from class: org.telegram.ui.Components.eh
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f11, float f12) {
                        ki.t(ki.this, z11, wgVar);
                    }
                });
                o1.k kVar = new o1.k(500.0f);
                jVar.u = kVar;
                kVar.a(1.0f);
                jVar.u.b(1000.0f);
                jVar.f();
                kiVar.p1 = jVar;
                return;
            case 18:
                TLObject tLObject2 = (TLObject) obj2;
                e6 e6Var4 = (e6) obj;
                HashMap hashMap = ((ap) obj3).s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    e6Var4.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, e6Var4);
                FileLoader.getInstance(e6Var4.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 19:
                gs gsVar = (gs) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                fs fsVar = (fs) obj;
                ArrayList arrayList4 = new ArrayList();
                ArrayList<Long> arrayList5 = new ArrayList<>();
                long j10 = 0;
                try {
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList5.add(Long.valueOf(queryFinalized.longValue(i15)));
                            j10 = Math.max(j10, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                            i15 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor = queryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new m1(gsVar, arrayList4, j10, str, fsVar, 12));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
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
                        int i17 = 0;
                        while (i17 < size) {
                            Long l10 = arrayList5.get(i17);
                            i17++;
                            long longValue = l10.longValue();
                            int size2 = users.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size2) {
                                    TLRPC.User user2 = users.get(i18);
                                    i18++;
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
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    e = e11;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new m1(gsVar, arrayList4, j10, str, fsVar, 12));
                return;
            case 20:
                hz hzVar = (hz) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                lz lzVar = hzVar.F;
                int[] iArr = lzVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!lzVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, lzVar.g(!hzVar.P ? 1 : 0), 0);
                GLES20.glClear(0);
                int i19 = hzVar.Q;
                if (i19 != 0 && (i9 = hzVar.R) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i19 * i9 * 4);
                    GLES20.glReadPixels(0, 0, hzVar.Q, hzVar.R, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(hzVar.Q, hzVar.R, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 21:
                n00 n00Var = (n00) obj3;
                n00Var.v0 = -1;
                gc M = oc.a0((o2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, n00Var.Y), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                n00Var.w0 = true;
                n00Var.dismiss();
                n00Var.n.getMessagesController().invalidateChatlistFolderUpdate(n00Var.U);
                return;
            case 22:
                n00 n00Var2 = (n00) obj3;
                n00Var2.v0 = n00Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new rc(i13, n00Var2, (Pair) obj));
                return;
            case 23:
                a60 a60Var = (a60) obj3;
                a60Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((o2) obj).presentFragment(new ProfileActivity(bundle, null));
                a60Var.h0 = true;
                return;
            case 24:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                a60 a60Var2 = ((u50) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = a60Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (a60Var2.f0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = a60Var2.d;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i11 = ((f3) a60Var2).currentAccount;
                        MessagesStorage.getInstance(i11).saveChatLinksCount(a60Var2.c0, chatFull2.invitesCount);
                    }
                    bb bbVar = a60Var2.f0;
                    if (bbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = a60Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        pb pbVar = bbVar.a;
                        ArrayList arrayList6 = pbVar.o0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = pbVar.getAccountInstance().getUserConfig().clientUserId;
                        i10 = ((o2) pbVar).currentAccount;
                        if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) pbVar.n0, (HashMap<String, ArrayList<MessageObject>>) pbVar.m0, pbVar.s, pbVar.T, true).contentType < 0) {
                            return;
                        }
                        pbVar.R0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            pbVar.C0.N = true;
                            lb lbVar = pbVar.E;
                            lbVar.s(lbVar.h, size4);
                            pb.K0(pbVar);
                        }
                        pbVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                k60.N((k60) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 26:
                g60 g60Var = (g60) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                g60Var.h = null;
                g60Var.c = arrayList7;
                g60Var.d = (ArrayList) obj;
                v1 v1Var = g60Var.e;
                v1Var.f(arrayList7, null);
                k60 k60Var = g60Var.n;
                k60Var.I(g60Var.f - 1);
                g60Var.l();
                if (v1Var.e() || g60Var.h() > 2) {
                    return;
                }
                k60Var.s.e(false, true);
                return;
            case 27:
                l80 l80Var = (l80) obj3;
                m80 m80Var = (m80) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                k80 k80Var = l80Var.h;
                if (k80Var == null || l80Var.e != m80Var) {
                    return;
                }
                k80Var.a(clickableSpan);
                l80Var.e = null;
                l80Var.b.d(true);
                return;
            case 28:
                gb0 gb0Var = (gb0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                b6 b6Var = gb0Var.c;
                TextView textView = gb0Var.f;
                TextView textView2 = gb0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        gb0Var.A = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new oc(cb.a(gb0Var.getContext()), b6Var).d0(tL_error2, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject4).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = gb0Var.d.animate().alpha(1.0f);
                gr grVar = gr.h;
                ll.r(alpha2, grVar, 320L);
                gb0Var.h.animate().alpha(0.0f).setInterpolator(grVar).setDuration(320L).start();
                if (gb0Var.A) {
                    gb0Var.setBackground(f6.Y(f6.v0(f6.i6, b6Var), 6, 0));
                    gb0Var.setOnClickListener(new h70(gb0Var, 3));
                    return;
                } else {
                    gb0Var.setBackground(null);
                    gb0Var.setOnClickListener(null);
                    return;
                }
            default:
                hd0.o((hd0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
        }
    }

    public /* synthetic */ e(hd0 hd0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 29;
        this.b = hd0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
