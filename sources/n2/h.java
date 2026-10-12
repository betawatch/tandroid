package n2;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import ji.d4;
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
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.y2;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.la;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Cells.q0;
import org.telegram.ui.Cells.x0;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.ac;
import org.telegram.ui.fo;
import org.telegram.ui.mb;
import org.telegram.ui.to;
import org.telegram.ui.wb;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0263  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, n2.l] */
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
        int i14 = 8;
        Bitmap bitmap = null;
        int i15 = 0;
        Object obj = this.d;
        ?? r92 = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                k kVar = (k) obj2;
                r92.b(kVar.a, kVar.b, (Exception) obj);
                return;
            case 1:
                k kVar2 = (k) obj2;
                r92.c(kVar2.a, kVar2.b, (oa.d) obj);
                return;
            case 2:
                ((VideoAds) obj2).lambda$show$3((sc) r92, (TLRPC.TL_sponsoredMessage) obj);
                return;
            case 3:
                ((VideoAds) obj2).lambda$show$5((sc) r92, (boolean[]) obj);
                return;
            case 4:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r92, (Runnable) obj);
                return;
            case 5:
                ((Utilities.Callback2) obj2).run((TLObject) r92, (TLRPC.TL_error) obj);
                return;
            case 6:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r92, (TLRPC.TL_error) obj);
                return;
            case 7:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                m2 m2Var = (m2) r92;
                m2 m2Var2 = (m2) obj;
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
                actionBarLayout.m(m2Var);
                m2Var.setRemovingFromStack(z10);
                m2Var.onTransitionAnimationEnd(z10, true);
                m2Var2.onTransitionAnimationEnd(true, true);
                m2Var2.onBecomeFullyVisible();
                return;
            case 8:
                ((m2) r92).presentFragment((fo) obj);
                ((m3) obj2).c = false;
                return;
            case 9:
                m3 m3Var = (m3) obj2;
                ArrayList arrayList2 = (ArrayList) r92;
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
            case 10:
                f6 f6Var = (f6) obj2;
                TLObject tLObject = (TLObject) r92;
                f6 f6Var2 = (f6) obj;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    f6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                f6Var.g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                NotificationCenter.getInstance(f6Var.E).addObserver(f6Var, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(f6Var.E).addObserver(f6Var, NotificationCenter.fileLoadFailed);
                FileLoader.getInstance(f6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 11:
                x0 x0Var = (x0) obj2;
                z4.s0(x0Var.getContext(), x0Var.H, (TL_wallet.walletTransaction) r92, null, null, null, (q0) obj, x0Var.g1);
                return;
            case 12:
                x0 x0Var2 = (x0) obj2;
                x0Var2.f1.C1(x0Var2, (TLRPC.TL_premiumGiftOption) r92, (String) obj);
                return;
            case 13:
                f6 f6Var3 = (f6) r92;
                f6Var3.f = !f6Var3.d((File) obj, f6Var3.c);
                AndroidUtilities.runOnUIThread(new la(i14, (na) obj2, f6Var3));
                return;
            case 14:
                e0 e0Var = (e0) obj2;
                g5.L((Context) r92, e0Var.l0, new d4(e0Var, 10), (c6) obj);
                return;
            case 15:
                m8.q((m8) obj2, (a2) r92, (TLObject) obj);
                return;
            case 16:
                hf hfVar = (hf) obj2;
                hfVar.getClass();
                ((ew0) r92).getViewTreeObserver().removeOnDrawListener(hfVar);
                ((vp0) obj).a.setHideAvatar(true);
                return;
            case 17:
                og ogVar = (og) obj2;
                File file = (File) obj;
                try {
                    InputStream openInputStream = ogVar.getContext().getContentResolver().openInputStream((Uri) r92);
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
                            AndroidUtilities.runOnUIThread(new h(ogVar, arrayList3, file, 18));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 18:
                ((og) obj2).n((File) obj, (ArrayList) r92);
                return;
            case 19:
                final vi viVar = (vi) obj2;
                final hh hhVar = (hh) obj;
                final boolean z11 = viVar.C0.getCurrentItemTop() <= ((ni) r92).getButtonsHideOffset();
                float alpha = viVar.a1.getAlpha();
                float f7 = z11 ? 1.0f : 0.0f;
                o1.k kVar3 = new o1.k(new o1.j(0.0f));
                kVar3.b(new oh(viVar, alpha, f7, z11));
                kVar3.a(new o1.f() { // from class: org.telegram.ui.Components.ph
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f10, float f11) {
                        vi.x(vi.this, z11, hhVar);
                    }
                });
                o1.l lVar = new o1.l(500.0f);
                kVar3.u = lVar;
                lVar.a(1.0f);
                kVar3.u.b(1000.0f);
                kVar3.h();
                viVar.w1 = kVar3;
                return;
            case 20:
                vi.q((vi) obj2, (AnimationNotificationsLocker) r92, (y2) obj);
                return;
            case 21:
                TLObject tLObject2 = (TLObject) r92;
                f6 f6Var4 = (f6) obj;
                HashMap hashMap = ((xp) obj2).s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    f6Var4.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, f6Var4);
                FileLoader.getInstance(f6Var4.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 22:
                e9 e9Var = (e9) obj2;
                e9Var.setText((CharSequence) r92);
                e9Var.setTextColor(g6.w0(g6.B6, (c6) obj));
                return;
            case 23:
                dt dtVar = (dt) obj2;
                MessagesStorage messagesStorage = (MessagesStorage) r92;
                ct ctVar = (ct) obj;
                ArrayList arrayList4 = new ArrayList();
                ArrayList<Long> arrayList5 = new ArrayList<>();
                long j10 = 0;
                try {
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList5.add(Long.valueOf(queryFinalized.longValue(0)));
                            j10 = Math.max(j10, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(dtVar, arrayList4, j10, str, ctVar, 4));
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
                        int i17 = 0;
                        while (i17 < size) {
                            Long l4 = arrayList5.get(i17);
                            i17++;
                            long longValue = l4.longValue();
                            int size2 = users.size();
                            int i18 = i15;
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
                            i15 = 0;
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                    str = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(dtVar, arrayList4, j10, str, ctVar, 4));
                return;
            case 24:
                h00 h00Var = (h00) obj2;
                Bitmap[] bitmapArr = (Bitmap[]) r92;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                l00 l00Var = h00Var.J;
                int[] iArr = l00Var.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!l00Var.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, l00Var.g(!h00Var.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i19 = h00Var.U;
                if (i19 != 0 && (i10 = h00Var.V) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i19 * i10 * 4);
                    GLES20.glReadPixels(0, 0, h00Var.U, h00Var.V, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(h00Var.U, h00Var.V, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 25:
                o10 o10Var = (o10) obj2;
                o10Var.z0 = -1;
                sc M = zc.a0((m2) r92).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, o10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                o10Var.A0 = true;
                o10Var.dismiss();
                o10Var.n.getMessagesController().invalidateChatlistFolderUpdate(o10Var.Y);
                return;
            case 26:
                o10 o10Var2 = (o10) obj2;
                o10Var2.z0 = o10Var2.n.getConnectionsManager().sendRequest((TLObject) r92, new to(i14, o10Var2, (Pair) obj));
                return;
            case 27:
                p70 p70Var = (p70) obj2;
                p70Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) r92).id);
                ((m2) obj).presentFragment(new ProfileActivity(bundle, null));
                p70Var.l0 = true;
                return;
            case 28:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r92;
                TLObject tLObject3 = (TLObject) obj;
                p70 p70Var2 = ((j70) obj2).a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = p70Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (p70Var2.j0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = p70Var2.d;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((e3) p70Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(p70Var2.g0, chatFull2.invitesCount);
                    }
                    mb mbVar = p70Var2.j0;
                    if (mbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = p70Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        ac acVar = mbVar.a;
                        ArrayList arrayList6 = acVar.o0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = acVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((m2) acVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) acVar.n0, (HashMap<String, ArrayList<MessageObject>>) acVar.m0, acVar.f, acVar.T, true).contentType < 0) {
                            return;
                        }
                        acVar.R0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            acVar.C0.N = true;
                            wb wbVar = acVar.E;
                            wbVar.s(wbVar.h, size4);
                            ac.K0(acVar);
                        }
                        acVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            default:
                a80.P((a80) obj2, (TLRPC.TL_error) r92, (TLObject) obj);
                return;
        }
    }
}
