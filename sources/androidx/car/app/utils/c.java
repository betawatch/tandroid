package androidx.car.app.utils;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import b4.e0;
import cg.n0;
import dg.n3;
import dg.o3;
import dg.q3;
import j3.n1;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import k7.b6;
import kh.a2;
import kh.w3;
import kh.x1;
import lh.f4;
import lh.g2;
import lh.g5;
import lh.n2;
import lh.t1;
import nh.a4;
import nh.c4;
import nh.d4;
import nh.d6;
import nh.h6;
import nh.h9;
import nh.i9;
import nh.l6;
import nh.m6;
import nh.s3;
import nh.t6;
import o4.r;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e3;
import org.telegram.ui.j8;
import org.telegram.ui.pa;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
import org.telegram.ui.sq0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import ph.da;
import ph.t0;
import ph.u6;
import ph.y9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03c7, code lost:
    
        if (r6 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03c9, code lost:
    
        r6.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03df, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new nh.i6(r4, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03e8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03dc, code lost:
    
        if (r6 != null) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v86, types: [org.telegram.messenger.FileLoader] */
    /* JADX WARN: Type inference failed for: r2v124, types: [org.telegram.ui.ActionBar.p2] */
    /* JADX WARN: Type inference failed for: r2v96, types: [java.lang.Object, o4.z] */
    /* JADX WARN: Type inference failed for: r5v26, types: [android.view.View, org.telegram.ui.Components.p9] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        u6 u6Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        h9 h9Var;
        char c3;
        p2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        boolean z4;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.TL_webPage tL_webPage;
        long j10 = 0;
        int i10 = 5;
        TLRPC.User user = null;
        int i11 = 1;
        r10 = true;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.d;
                d dVar = (d) this.e;
                if (oVar != null && ((v) oVar).c.compareTo(n.c) >= 0) {
                    j.b(iOnDoneCallback, str, dVar);
                    return;
                }
                j.f(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + dVar));
                return;
            case 1:
                d3.a aVar = (d3.a) this.b;
                y2.i iVar = (y2.i) this.c;
                String str2 = iVar.a;
                v2.g gVar = (v2.g) this.d;
                y2.h hVar = (y2.h) this.e;
                aVar.getClass();
                Logger logger = d3.a.f;
                try {
                    z2.e a2 = aVar.c.a(str2);
                    if (a2 == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        gVar.d(new IllegalArgumentException(str3));
                    } else {
                        ((f3.h) aVar.e).f(new a(aVar, iVar, ((w2.b) a2).a(hVar), 3));
                        gVar.d(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    gVar.d(e);
                    return;
                }
            case 2:
                q3 q3Var = (q3) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                sq0 sq0Var = (sq0) this.d;
                n3 n3Var = (n3) this.e;
                q3Var.D = true;
                q3Var.E = (n3[]) arrayList2.toArray(new n3[0]);
                sq0Var.run(n3Var);
                return;
            case 3:
                q3 q3Var2 = (q3) this.b;
                TLObject tLObject = (TLObject) this.c;
                o3 o3Var = (o3) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    q3Var2.h();
                    q3Var2.n(tL_error);
                    return;
                }
                q3Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                o3Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, o3Var.c);
                o3Var.f = tL_messageMediaDocument;
                q3Var2.a();
                return;
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                        callback2.run((TLRPC.payments_GiveawayInfo) tLObject2);
                        return;
                    }
                    return;
                }
            case 5:
                final kh.n3 n3Var2 = (kh.n3) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                x1 x1Var = (x1) this.d;
                final View view = (View) this.e;
                or0 or0Var = n3Var2.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    x1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = n3Var2.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(n3Var2.b).sendRequest(savestargift, null, 64);
                }
                boolean z11 = savedStarGift.pinned_to_top;
                final boolean z12 = !z11;
                if (n3Var2.e.m(savedStarGift, z12, false)) {
                    new w3(n3Var2.getContext(), or0Var.c, savedStarGift, n3Var2.c, new Utilities.Callback0Return() { // from class: kh.e3
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((x1) view).c(z12, true);
                            n3 n3Var3 = n3.this;
                            n3Var3.f.u0(0);
                            return qc.a0(n3Var3.a.a);
                        }
                    }).show();
                    return;
                }
                if (z11) {
                    a2.v(R.string.Gift2Unpinned, qc.a0(or0Var.a), R.raw.ic_unpin, 36);
                } else {
                    qc.a0(or0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                }
                ((x1) view).c(z12, true);
                n3Var2.f.u0(0);
                return;
            case 6:
                p2 p2Var = (p2) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                af.f fVar = (af.f) this.d;
                d2 d2Var = (d2) this.e;
                if (p2Var != null && tL_error3 != null) {
                    qc.a0(p2Var).d0(tL_error3, false);
                }
                if ((p2Var instanceof xn) && tL_error3 == null) {
                    ((xn) p2Var).Yb();
                }
                fVar.b();
                d2Var.dismiss();
                return;
            case 7:
                g5.Z((g5) this.b, (boolean[]) this.c, (TL_stars.StarGiftAttribute) this.d, (sc[]) this.e);
                return;
            case 8:
                g5.R0((g5) this.b, (TLObject) this.c, (b) this.d, (TLRPC.TL_error) this.e);
                return;
            case 9:
                g5.S0((g5) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 10:
                g5 g5Var = (g5) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error4 != null || !(tLObject3 instanceof TLRPC.Updates)) {
                    g5Var.getBulletinFactory().d0(tL_error4, false);
                    return;
                }
                g5Var.n0 = true;
                g5Var.i1 = null;
                g5Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject3, new t1(g5Var, 5));
                Utilities.stageQueue.postRunnable(new n2(2, g5Var, tLObject3));
                return;
            case 11:
                f4 f4Var = (f4) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                k6 k6Var = f4Var.E;
                f4Var.e0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                jj0 jj0Var = f4Var.i0;
                if (jj0Var != null) {
                    jj0Var.d();
                    AndroidUtilities.runOnUIThread(new n0(9), 750L);
                }
                f4Var.N.animate().alpha(0.0f).start();
                f4Var.P.animate().alpha(1.0f).start();
                f4Var.D.animate().alpha(1.0f).start();
                f4Var.O.animate().alpha(0.0f).start();
                f4Var.M.animate().alpha(1.0f).start();
                f4Var.J.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList3.size(), new Object[0])));
                k6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                k6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                f4Var.F.setAlpha(0.0f);
                if (f4Var.L != null) {
                    int i12 = 0;
                    while (true) {
                        x1[] x1VarArr = f4Var.L;
                        if (i12 < x1VarArr.length) {
                            AndroidUtilities.removeFromParent(x1VarArr[i12]);
                            i12++;
                        } else {
                            f4Var.L = null;
                        }
                    }
                }
                f4Var.L = new x1[arrayList3.size()];
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList3.get(i13);
                    x1 x1Var2 = new x1(f4Var.getContext(), f4Var.T, f4Var.a);
                    x1Var2.g(starGift2, false, false, false, false, true);
                    x1Var2.x.setVisibility(8);
                    x1Var2.setRibbonColor(-3065286);
                    ?? r52 = x1Var2.y;
                    FrameLayout.LayoutParams e6 = b6.e(42, 42, 17);
                    x1Var2.B = e6;
                    r52.setLayoutParams(e6);
                    int i14 = i13 + 1;
                    boolean z13 = i14 >= arrayList3.size();
                    LinearLayout linearLayout = f4Var.K;
                    f4Var.L[i13] = x1Var2;
                    linearLayout.addView(x1Var2, b6.p(74, 74, 0.0f, 51, 0, 0, z13 ? 0 : 6, 0));
                    i13 = i14;
                }
                return;
            case 12:
                nh.w3 w3Var = (nh.w3) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                d4 d4Var = w3Var.l;
                if (tLObject4 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject4;
                    MessagesController.getInstance(d4Var.z2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(d4Var.z2).putChats(tL_stories_stories.chats, false);
                    for (int i15 = 0; i15 < tL_stories_stories.stories.size(); i15++) {
                        if (tL_stories_stories.stories.get(i15).id == storyItem2.id) {
                            callback3.run(tL_stories_stories.stories.get(i15).media.document);
                            return;
                        }
                    }
                }
                callback3.run(null);
                return;
            case 13:
                nh.w3 w3Var2 = (nh.w3) this.b;
                Activity activity = (Activity) this.c;
                i9 i9Var = (i9) this.d;
                a4 a4Var = (a4) this.e;
                da E = da.E(activity, w3Var2.l.z2);
                c4 c4Var = w3Var2.l.J2;
                if (c4Var != null && (h9Var = c4Var.b) != null) {
                    j10 = h9Var.currentPosition;
                }
                t0 t0Var = MessagesController.getInstance(w3Var2.l.z2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = w3Var2.l.L1.a;
                long j11 = storyItem3.dialogId;
                ArrayList arrayList4 = t0Var.b;
                int size = arrayList4.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    u6 u6Var2 = (u6) obj;
                    if (u6Var2.g && storyItem3.id == u6Var2.f && j11 == u6Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                        if ((document == null || document.id == u6Var2.H) && ((photo = messageMedia.photo) == null || photo.id == u6Var2.I)) {
                            u6Var2.h = true;
                            u6Var = u6Var2;
                            if (u6Var != null || u6Var.u || (file = u6Var.L) == null || !file.exists()) {
                                u6Var = u6.n(w3Var2.l.L1.h(), w3Var2.l.L1.a);
                                u6Var.e = w3Var2.l.y1;
                            }
                            u6 g10 = u6Var.g();
                            if (w3Var2.l.I0()) {
                                d4 d4Var2 = w3Var2.l;
                                g10.J0 = d4Var2.y1;
                                g10.L0 = MessagesController.toInputMedia(d4Var2.L1.a.media);
                                l6 l6Var = i9Var.L0;
                                if (l6Var instanceof d6) {
                                    g10.K0 = ((d6) l6Var).E;
                                }
                            }
                            E.S(y9.d(i9Var), g10, j10);
                            E.N = new nh.q3(w3Var2, 3);
                            E.O = new s3(w3Var2, a4Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList4 = arrayList;
                }
                u6Var = null;
                if (u6Var != null) {
                }
                u6Var = u6.n(w3Var2.l.L1.h(), w3Var2.l.L1.a);
                u6Var.e = w3Var2.l.y1;
                u6 g102 = u6Var.g();
                if (w3Var2.l.I0()) {
                }
                E.S(y9.d(i9Var), g102, j10);
                E.N = new nh.q3(w3Var2, 3);
                E.O = new s3(w3Var2, a4Var, 1);
                return;
            case 14:
                h6 h6Var = (h6) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                h6Var.i = false;
                if (tLObject5 instanceof TL_stories.TL_storyAlbum) {
                    m6 a10 = m6.a((TL_stories.TL_storyAlbum) tLObject5);
                    h6Var.h.add(a10);
                    h6Var.f(true);
                    if (callback4 != null) {
                        callback4.run(a10);
                        return;
                    }
                    return;
                }
                if (tL_error5 == null || (U = LaunchActivity.U()) == null) {
                    c3 = 0;
                } else {
                    c3 = 0;
                    qc.a0(U).d0(tL_error5, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(h6Var.a);
                int i17 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c3] = Long.valueOf(h6Var.b);
                objArr[1] = h6Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i17, objArr);
                return;
            case 15:
                l6 l6Var2 = (l6) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                int i18 = l6Var2.f;
                StringBuilder sb = new StringBuilder("StoriesList ");
                int i19 = l6Var2.e;
                sb.append(i19);
                sb.append("{");
                long j12 = l6Var2.d;
                sb.append(j12);
                sb.append("} saveCache {");
                sb.append(t6.a(arrayList5));
                yh.w("}", sb);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j12 + " AND album_id = " + i18).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i20 = 0;
                        while (i20 < arrayList5.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList5.get(i20)).storyItem;
                                if (storyItem4 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(i11, j12);
                                    executeFast.bindInteger(2, storyItem4.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    executeFast.bindInteger(4, i19);
                                    executeFast.bindInteger(5, l6Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    executeFast.bindInteger(6, arrayList6.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j12);
                                    sQLitePreparedStatement.bindInteger(2, i18);
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    sQLitePreparedStatement.bindInteger(4, i20);
                                    sQLitePreparedStatement.step();
                                }
                                i20++;
                                i11 = 1;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement2 = executeFast;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        break;
                                    }
                                } catch (Throwable th3) {
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th3;
                                }
                            }
                        }
                        if (executeFast != null) {
                            executeFast.dispose();
                            break;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLitePreparedStatement2 = executeFast;
                        sQLitePreparedStatement = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                }
                break;
            case 16:
                this.c.i(((e0) this.b).b, (o4.v) this.d, (r) this.e);
                return;
            case 17:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
                return;
            case 18:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
                return;
            case 19:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (o70) this.e);
                return;
            case 20:
                ((Utilities.Callback) this.b).run(j6.Q0((File) this.c, (String) this.d, (String[]) this.e));
                return;
            case 21:
                TLObject tLObject6 = (TLObject) this.b;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) this.c;
                i6 i6Var = (i6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                j6.A--;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject6;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (h6Var2 == null || themeSettings == null) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && document2.id != tL_theme.document.id) {
                            if (h6Var2 != null) {
                                h6Var2.r = tL_theme2;
                            } else {
                                i6Var.C = tL_theme2;
                                i6Var.D = false;
                                i6Var.d0 = null;
                                i6Var.e0 = null;
                                NotificationCenter.getInstance(i6Var.B).addObserver(i6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(i6Var.B).addObserver(i6Var, NotificationCenter.fileLoadFailed);
                                ?? fileLoader = FileLoader.getInstance(i6Var.B);
                                TLRPC.TL_theme tL_theme3 = i6Var.C;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (i6.a(h6Var2, themeSettings)) {
                            z4 = false;
                        } else {
                            File d = h6Var2.d();
                            if (d != null) {
                                d.delete();
                            }
                            i6.i(h6Var2, themeSettings);
                            i6 i6Var2 = j6.I;
                            if (i6Var2 == i6Var && i6Var2.V == h6Var2.a) {
                                j6.n1(false, false);
                                j6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i21 = NotificationCenter.needSetDayNightTheme;
                                i6 i6Var3 = j6.I;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i21, i6Var3, Boolean.valueOf(j6.J == i6Var3), null, -1);
                            }
                            e6.a(true);
                            z4 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        h6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z4;
                    }
                    if (j6.A != 0) {
                        j6.B = (int) (System.currentTimeMillis() / 1000);
                        j6.s1(z10, false);
                        return;
                    }
                    return;
                }
                z10 = false;
                if (j6.A != 0) {
                }
                break;
            case 22:
                s6 s6Var = (s6) this.b;
                org.telegram.ui.t6 t6Var = (org.telegram.ui.t6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                s6Var.getClass();
                t6Var.a(fArr[0]);
                if (zArr[0]) {
                    s6Var.d.w0(true);
                    return;
                }
                return;
            case 23:
                s6 s6Var2 = (s6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                r6 r6Var = (r6) this.e;
                if (zArr2[0]) {
                    return;
                }
                jArr[0] = System.currentTimeMillis();
                s6Var2.d.showDialog(r6Var);
                return;
            case 24:
                j8.U((j8) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (Calendar) this.e);
                return;
            case 25:
                pa.U((pa) this.b, (d2) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                return;
            case 26:
                xn xnVar = (xn) this.b;
                ?? r22 = (p2) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                e5 e5Var = (e5) this.e;
                if (r22 instanceof NotificationCenter.NotificationCenterDelegate) {
                    xnVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r22, NotificationCenter.closeChats);
                }
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) e5Var).c(e5Var.getFragmentStack().size() - 1, new xn(bundle));
                r22.finishFragment();
                return;
            case 27:
                xn xnVar2 = (xn) this.b;
                af.f fVar2 = (af.f) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                g2 g2Var = (g2) this.e;
                fVar2.b();
                if (tLObject7 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject7;
                    xnVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    xnVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = xnVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    }
                }
                g2Var.run(user);
                return;
            case 28:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                mr mrVar = (mr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e3(mrVar, i10));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(nr.f);
                ofFloat.start();
                return;
            default:
                xn xnVar3 = (xn) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                d2 d2Var2 = (d2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = s90.f(messageObject2);
                } catch (Throwable th6) {
                    FileLog.e((Throwable) th6);
                    tL_webPage = null;
                    user = th6;
                }
                AndroidUtilities.runOnUIThread(new n1(xnVar3, d2Var2, zArr4, user == null && tL_webPage != null, messageObject2, tL_webPage, 8));
                return;
        }
    }
}
