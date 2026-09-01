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
import eg.l3;
import eg.m3;
import eg.o3;
import j3.n1;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import k7.c6;
import lh.n3;
import lh.w3;
import lh.x1;
import mh.f2;
import mh.f4;
import mh.g5;
import mh.m2;
import mh.s1;
import o4.r;
import oh.c4;
import oh.d6;
import oh.e4;
import oh.h6;
import oh.h9;
import oh.i9;
import oh.l6;
import oh.m6;
import oh.r3;
import oh.t6;
import oh.u3;
import oh.y3;
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
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.u90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e3;
import org.telegram.ui.j8;
import org.telegram.ui.pa;
import org.telegram.ui.r6;
import org.telegram.ui.uq0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.ca;
import qh.s6;
import qh.t0;
import qh.x9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    /* JADX WARN: Code restructure failed: missing block: B:120:0x03b3, code lost:
    
        if (r6 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03b5, code lost:
    
        r6.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03cb, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new oh.i6(r4, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03d4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03c8, code lost:
    
        if (r6 != null) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v86, types: [org.telegram.messenger.FileLoader] */
    /* JADX WARN: Type inference failed for: r2v124, types: [org.telegram.ui.ActionBar.p2] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, o4.z] */
    /* JADX WARN: Type inference failed for: r5v26, types: [android.view.View, org.telegram.ui.Components.p9] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        s6 s6Var;
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
                    z2.f a2 = aVar.c.a(str2);
                    if (a2 == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        gVar.e(new IllegalArgumentException(str3));
                    } else {
                        ((f3.h) aVar.e).f(new a(aVar, iVar, ((w2.b) a2).a(hVar), 3));
                        gVar.e(null);
                    }
                    return;
                } catch (Exception e6) {
                    logger.warning("Error scheduling event " + e6.getMessage());
                    gVar.e(e6);
                    return;
                }
            case 2:
                o3 o3Var = (o3) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                uq0 uq0Var = (uq0) this.d;
                l3 l3Var = (l3) this.e;
                o3Var.D = true;
                o3Var.E = (l3[]) arrayList2.toArray(new l3[0]);
                uq0Var.run(l3Var);
                return;
            case 3:
                o3 o3Var2 = (o3) this.b;
                TLObject tLObject = (TLObject) this.c;
                m3 m3Var = (m3) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    o3Var2.h();
                    o3Var2.n(tL_error);
                    return;
                }
                o3Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                m3Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, m3Var.c);
                m3Var.f = tL_messageMediaDocument;
                o3Var2.a();
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
                final n3 n3Var = (n3) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                x1 x1Var = (x1) this.d;
                final View view = (View) this.e;
                pr0 pr0Var = n3Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    x1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = n3Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(n3Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z11 = savedStarGift.pinned_to_top;
                final boolean z12 = !z11;
                if (n3Var.e.m(savedStarGift, z12, false)) {
                    new w3(n3Var.getContext(), pr0Var.c, savedStarGift, n3Var.c, new Utilities.Callback0Return() { // from class: lh.e3
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((x1) view).c(z12, true);
                            n3 n3Var2 = n3.this;
                            n3Var2.f.u0(0);
                            return qc.a0(n3Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z11) {
                    l.d.v(R.string.Gift2Unpinned, qc.a0(pr0Var.a), R.raw.ic_unpin, 36);
                } else {
                    qc.a0(pr0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                }
                ((x1) view).c(z12, true);
                n3Var.f.u0(0);
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
                g5Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject3, new s1(g5Var, 5));
                Utilities.stageQueue.postRunnable(new m2(2, g5Var, tLObject3));
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
                lj0 lj0Var = f4Var.i0;
                if (lj0Var != null) {
                    lj0Var.d();
                    AndroidUtilities.runOnUIThread(new ag.f(11), 750L);
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
                    FrameLayout.LayoutParams e10 = c6.e(42, 42, 17);
                    x1Var2.B = e10;
                    r52.setLayoutParams(e10);
                    int i14 = i13 + 1;
                    boolean z13 = i14 >= arrayList3.size();
                    LinearLayout linearLayout = f4Var.K;
                    f4Var.L[i13] = x1Var2;
                    linearLayout.addView(x1Var2, c6.p(74, 74, 0.0f, 51, 0, 0, z13 ? 0 : 6, 0));
                    i13 = i14;
                }
                return;
            case 12:
                this.c.i(((e0) this.b).b, (o4.v) this.d, (r) this.e);
                return;
            case 13:
                y3 y3Var = (y3) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                oh.f4 f4Var2 = y3Var.l;
                if (tLObject4 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject4;
                    MessagesController.getInstance(f4Var2.z2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(f4Var2.z2).putChats(tL_stories_stories.chats, false);
                    for (int i15 = 0; i15 < tL_stories_stories.stories.size(); i15++) {
                        if (tL_stories_stories.stories.get(i15).id == storyItem2.id) {
                            callback3.run(tL_stories_stories.stories.get(i15).media.document);
                            return;
                        }
                    }
                }
                callback3.run(null);
                return;
            case 14:
                y3 y3Var2 = (y3) this.b;
                Activity activity = (Activity) this.c;
                i9 i9Var = (i9) this.d;
                c4 c4Var = (c4) this.e;
                ca E = ca.E(activity, y3Var2.l.z2);
                e4 e4Var = y3Var2.l.J2;
                if (e4Var != null && (h9Var = e4Var.b) != null) {
                    j10 = h9Var.currentPosition;
                }
                t0 t0Var = MessagesController.getInstance(y3Var2.l.z2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = y3Var2.l.L1.a;
                long j11 = storyItem3.dialogId;
                ArrayList arrayList4 = t0Var.b;
                int size = arrayList4.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    s6 s6Var2 = (s6) obj;
                    if (s6Var2.g && storyItem3.id == s6Var2.f && j11 == s6Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                        if ((document == null || document.id == s6Var2.H) && ((photo = messageMedia.photo) == null || photo.id == s6Var2.I)) {
                            s6Var2.h = true;
                            s6Var = s6Var2;
                            if (s6Var != null || s6Var.u || (file = s6Var.L) == null || !file.exists()) {
                                s6Var = s6.n(y3Var2.l.L1.h(), y3Var2.l.L1.a);
                                s6Var.e = y3Var2.l.y1;
                            }
                            s6 g10 = s6Var.g();
                            if (y3Var2.l.I0()) {
                                oh.f4 f4Var3 = y3Var2.l;
                                g10.J0 = f4Var3.y1;
                                g10.L0 = MessagesController.toInputMedia(f4Var3.L1.a.media);
                                l6 l6Var = i9Var.L0;
                                if (l6Var instanceof d6) {
                                    g10.K0 = ((d6) l6Var).E;
                                }
                            }
                            E.S(x9.d(i9Var), g10, j10);
                            E.N = new r3(y3Var2, 3);
                            E.O = new u3(y3Var2, c4Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList4 = arrayList;
                }
                s6Var = null;
                if (s6Var != null) {
                }
                s6Var = s6.n(y3Var2.l.L1.h(), y3Var2.l.L1.a);
                s6Var.e = y3Var2.l.y1;
                s6 g102 = s6Var.g();
                if (y3Var2.l.I0()) {
                }
                E.S(x9.d(i9Var), g102, j10);
                E.N = new r3(y3Var2, 3);
                E.O = new u3(y3Var2, c4Var, 1);
                return;
            case 15:
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
            case 16:
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
                yh.v("}", sb);
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
            case 17:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
                return;
            case 18:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
                return;
            case 19:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (q70) this.e);
                return;
            case 20:
                ((Utilities.Callback) this.b).run(org.telegram.ui.ActionBar.k6.Q0((File) this.c, (String) this.d, (String[]) this.e));
                return;
            case 21:
                TLObject tLObject6 = (TLObject) this.b;
                i6 i6Var = (i6) this.c;
                j6 j6Var = (j6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                org.telegram.ui.ActionBar.k6.A--;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject6;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (i6Var == null || themeSettings == null) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && document2.id != tL_theme.document.id) {
                            if (i6Var != null) {
                                i6Var.r = tL_theme2;
                            } else {
                                j6Var.C = tL_theme2;
                                j6Var.D = false;
                                j6Var.d0 = null;
                                j6Var.e0 = null;
                                NotificationCenter.getInstance(j6Var.B).addObserver(j6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(j6Var.B).addObserver(j6Var, NotificationCenter.fileLoadFailed);
                                ?? fileLoader = FileLoader.getInstance(j6Var.B);
                                TLRPC.TL_theme tL_theme3 = j6Var.C;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (j6.a(i6Var, themeSettings)) {
                            z4 = false;
                        } else {
                            File d = i6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            j6.i(i6Var, themeSettings);
                            j6 j6Var2 = org.telegram.ui.ActionBar.k6.I;
                            if (j6Var2 == j6Var && j6Var2.V == i6Var.a) {
                                org.telegram.ui.ActionBar.k6.n1(false, false);
                                org.telegram.ui.ActionBar.k6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i21 = NotificationCenter.needSetDayNightTheme;
                                j6 j6Var3 = org.telegram.ui.ActionBar.k6.I;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i21, j6Var3, Boolean.valueOf(org.telegram.ui.ActionBar.k6.J == j6Var3), null, -1);
                            }
                            f6.a(true);
                            z4 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        i6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z4;
                    }
                    if (org.telegram.ui.ActionBar.k6.A != 0) {
                        org.telegram.ui.ActionBar.k6.B = (int) (System.currentTimeMillis() / 1000);
                        org.telegram.ui.ActionBar.k6.s1(z10, false);
                        return;
                    }
                    return;
                }
                z10 = false;
                if (org.telegram.ui.ActionBar.k6.A != 0) {
                }
                break;
            case 22:
                org.telegram.ui.s6 s6Var3 = (org.telegram.ui.s6) this.b;
                org.telegram.ui.t6 t6Var = (org.telegram.ui.t6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                s6Var3.getClass();
                t6Var.a(fArr[0]);
                if (zArr[0]) {
                    s6Var3.d.w0(true);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.s6 s6Var4 = (org.telegram.ui.s6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                r6 r6Var = (r6) this.e;
                if (zArr2[0]) {
                    return;
                }
                jArr[0] = System.currentTimeMillis();
                s6Var4.d.showDialog(r6Var);
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
                f5 f5Var = (f5) this.e;
                if (r22 instanceof NotificationCenter.NotificationCenterDelegate) {
                    xnVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r22, NotificationCenter.closeChats);
                }
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) f5Var).c(f5Var.getFragmentStack().size() - 1, new xn(bundle));
                r22.finishFragment();
                return;
            case 27:
                xn xnVar2 = (xn) this.b;
                af.f fVar2 = (af.f) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                f2 f2Var = (f2) this.e;
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
                f2Var.run(user);
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
                or orVar = (or) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e3(orVar, i10));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(pr.f);
                ofFloat.start();
                return;
            default:
                xn xnVar3 = (xn) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                d2 d2Var2 = (d2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = u90.f(messageObject2);
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
