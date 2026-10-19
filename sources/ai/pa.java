package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.media.AudioManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ProfileActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pa(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0135 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:22:0x0077, B:25:0x0087, B:27:0x00a7, B:29:0x00b2, B:31:0x00c6, B:33:0x00cc, B:36:0x011d, B:38:0x0135, B:39:0x013a, B:44:0x00f0, B:46:0x00f4), top: B:21:0x0077 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ci.h1 h1Var;
        ei.ub ubVar;
        ci.z9 z9Var;
        int i10;
        boolean z10;
        int i11 = 12;
        String str = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.xc(((org.telegram.ui.ActionBar.f3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 1:
                le leVar = (le) this.b;
                fa faVar = (fa) this.c;
                leVar.S = true;
                leVar.p(new da(faVar, 2));
                AndroidUtilities.runOnUIThread(new nd(leVar, 1), 240L);
                return;
            case 2:
                ViewGroup container = (ViewGroup) this.b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 3:
                ((v0.i) this.b).onError(this.c);
                return;
            case 4:
                ((v0.i) this.b).onResult((v0.o) this.c);
                return;
            case 5:
                ((c1.e) this.b).e().onError(((kotlin.jvm.internal.p) this.c).a);
                return;
            case 6:
                ((c1.e) this.b).e().onError((w0.h) this.c);
                return;
            case 7:
                ((c1.e) this.b).e().onResult((v0.o) this.c);
                return;
            case 8:
                Context context = (Context) this.b;
                e2.i iVar = (e2.i) this.c;
                c2.i.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                iVar.e();
                return;
            case 9:
                ((ci.aa) this.b).H(ProfileActivity.m4(((ci.v0) this.c).c));
                return;
            case 10:
                ci.n2 n2Var = (ci.n2) this.b;
                AndroidUtilities.addToClipboard(((ci.q0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(n2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 11:
                ci.n2 n2Var2 = (ci.n2) this.b;
                ci.v0 v0Var = (ci.v0) this.c;
                long j10 = v0Var.c;
                ci.q4 q4Var = n2Var2.i0;
                if (j10 != UserConfig.getInstance(q4Var.C2).getClientUserId() && ((h1Var = n2Var2.h0.A0) == null || j10 != DialogObject.getPeerDialogId(h1Var.i()))) {
                    if (q4Var.O3 != null) {
                        for (int i13 = 0; i13 < q4Var.O3.peers.size(); i13++) {
                            if (j10 != DialogObject.getPeerDialogId(q4Var.O3.peers.get(i13).peer)) {
                            }
                        }
                    }
                    Context context2 = n2Var2.getContext();
                    long j11 = v0Var.c;
                    ci.c0 c0Var = new ci.c0(r7, n2Var2, v0Var);
                    ci.l0 l0Var = new ci.l0();
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context2, (org.telegram.ui.ActionBar.d6) l0Var, false);
                    f3Var.fixNavigationBar();
                    LinearLayout e = kk.e(context2, 1);
                    TextView f7 = org.telegram.messenger.g0.f(context2, 1, 20.0f);
                    f7.setTextColor(l0Var.w(org.telegram.ui.ActionBar.h6.j5));
                    f7.setTypeface(AndroidUtilities.bold());
                    f7.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    e.addView(f7, w7.z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2, l0Var);
                    l4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    e.addView(l4Var, w7.z5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, context2, l0Var, true);
                    xp checkBoxRound = a2Var.getCheckBoxRound();
                    int i14 = org.telegram.ui.ActionBar.h6.V6;
                    int i15 = org.telegram.ui.ActionBar.h6.g7;
                    int i16 = org.telegram.ui.ActionBar.h6.k7;
                    checkBoxRound.b(i14, i15, i16);
                    a2Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    a2Var.setOnClickListener(new View.OnClickListener() { // from class: ci.d0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    a2Var.c(!r3.b(), true);
                                    break;
                                case 1:
                                    a2Var.c(!r3.b(), true);
                                    break;
                                default:
                                    a2Var.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i17 = org.telegram.ui.ActionBar.h6.i6;
                    a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(l0Var.w(i17), 2, -1));
                    e.addView(a2Var, w7.z5.n(-1, -2));
                    final org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, context2, l0Var, true);
                    a2Var2.getCheckBoxRound().b(i14, i15, i16);
                    final int i18 = 1;
                    a2Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    a2Var2.setOnClickListener(new View.OnClickListener() { // from class: ci.d0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    a2Var2.c(!r3.b(), true);
                                    break;
                                case 1:
                                    a2Var2.c(!r3.b(), true);
                                    break;
                                default:
                                    a2Var2.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    a2Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(l0Var.w(i17), 2, -1));
                    e.addView(a2Var2, w7.z5.n(-1, -2));
                    final org.telegram.ui.Cells.a2 a2Var3 = new org.telegram.ui.Cells.a2(4, 21, context2, l0Var, true);
                    a2Var3.getCheckBoxRound().b(i14, i15, i16);
                    a2Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    final int i19 = 2;
                    a2Var3.setOnClickListener(new View.OnClickListener() { // from class: ci.d0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    a2Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    a2Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    a2Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    a2Var3.setBackground(org.telegram.ui.ActionBar.h6.g0(l0Var.w(i17), 2, -1));
                    e.addView(a2Var3, w7.z5.n(-1, -2));
                    org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context2, l0Var);
                    d9Var.setBackgroundColor(-16777216);
                    d9Var.setFixedSize(12);
                    e.addView(d9Var, w7.z5.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    ei.d dVar = new ei.d(context2, l0Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new ci.e0(a2Var, a2Var2, a2Var3, c0Var, f3Var, 0));
                    frameLayout.addView(dVar, w7.z5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    e.addView(frameLayout, w7.z5.n(-1, -2));
                    f3Var.setCustomView(e);
                    f3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = n2Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(v0Var.a));
                ConnectionsManager.getInstance(n2Var2.N).sendRequest(deletegroupcallmessages, null);
                n2Var2.c(v0Var.a);
                return;
            case 12:
                ci.h1 h1Var2 = (ci.h1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                h1Var2.getClass();
                int size = arrayList.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(h1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 13:
                ((ci.h1) this.b).F.remove((String) this.c);
                return;
            case 14:
                ci.q4 q4Var2 = (ci.q4) this.b;
                ei.x3 x3Var = (ei.x3) this.c;
                q4Var2.removeView(x3Var);
                if (q4Var2.d2 == x3Var) {
                    q4Var2.d2 = null;
                    return;
                }
                return;
            case 15:
                ci.q4 q4Var3 = (ci.q4) this.b;
                ei.vb D = ei.vb.D((Activity) this.c, q4Var3.C2);
                ci.p4 p4Var = q4Var3.M2;
                long j12 = (p4Var == null || (z9Var = (ci.z9) p4Var.c) == null) ? 0L : z9Var.currentPosition;
                File h = q4Var3.O1.h();
                TL_stories.StoryItem storyItem = q4Var3.O1.a;
                ei.a8 a8Var = new ei.a8();
                a8Var.n = true;
                a8Var.t = storyItem.media;
                int i21 = a8Var.a;
                a8Var.q = MessagesController.getInstance(i21).getPeer(storyItem.dialogId);
                a8Var.r = storyItem.id;
                a8Var.s = storyItem.caption;
                a8Var.L = h;
                a8Var.M = false;
                a8Var.k0 = 720;
                a8Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    a8Var.K = false;
                    if (h != null) {
                        a8Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    a8Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i22 = 0;
                        while (true) {
                            if (i22 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i22);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    a8Var.k0 = documentAttribute.w;
                                    a8Var.l0 = documentAttribute.h;
                                    a8Var.i = documentAttribute.duration;
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            a8Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i23 = 0; i23 < storyItem.media.document.thumbs.size(); i23++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i23);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    a8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i21).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        a8Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                a8Var.A();
                a8Var.e(storyItem);
                ei.ob d = ei.qb.d(q4Var3.J0);
                RectF rectF = D.H;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i24 = D.c;
                if (!D.d) {
                    if (MessagesController.getInstance(i24).isFrozen()) {
                        org.telegram.ui.b.b(i24);
                    } else {
                        D.u0 = false;
                        D.e = false;
                        D.B2 = false;
                        if (windowManager != null && (ubVar = D.n) != null && ubVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.K1 = a8Var;
                        ei.s9.a(i24, a8Var);
                        ei.a8 a8Var2 = D.K1;
                        D.O1 = (a8Var2 == null || !a8Var2.K) ? 0 : 1;
                        D.s0.g = false;
                        if (d != null) {
                            D.F = d;
                            D.J = d.a;
                            rectF.set(d.c);
                            D.G = d.b;
                            D.F.e();
                        } else {
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                        }
                        D.r.c();
                        ei.hb hbVar = D.h0;
                        int i25 = D.J;
                        hbVar.setBackgroundColor((i25 == 1 || i25 == 0) ? 0 : -14737633);
                        D.r.setTranslationX(0.0f);
                        D.r.setTranslationY(0.0f);
                        D.r.b(0.0f);
                        D.r.setScaleX(1.0f);
                        D.r.setScaleY(1.0f);
                        D.K = 0.0f;
                        AndroidUtilities.lockOrientation(D.b, 1);
                        ei.a8 a8Var3 = D.K1;
                        if (a8Var3 != null) {
                            D.c1.setText(a8Var3.C0);
                        }
                        D.K(new ei.t9(D, 7), j12);
                        D.b1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.v0 = 0L;
                        D.w0 = "";
                    }
                }
                D.Q = new ci.d2(q4Var3, i11);
                D.R = new ci.i2(r7, q4Var3, D);
                return;
            case 16:
                ci.h4 h4Var = (ci.h4) this.b;
                ci.aa aaVar = (ci.aa) this.c;
                h4Var.getClass();
                ((ci.r9) h4Var.l.Q1).h(new sg.y0(aaVar.f, 14, false));
                return;
            case 17:
                ci.e5 e5Var = (ci.e5) this.b;
                String str3 = (String) this.c;
                e5Var.h = null;
                ci.u5 u5Var = e5Var.n;
                u5Var.Q = false;
                u5Var.O.c = str3.toLowerCase();
                ci.u5.b(u5Var);
                return;
            case 18:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error == null));
                    return;
                }
                return;
            case 19:
                ci.u6 u6Var = (ci.u6) this.b;
                TLObject tLObject = (TLObject) this.c;
                ci.x6 x6Var = u6Var.q;
                int i26 = u6Var.c;
                ArrayList arrayList2 = u6Var.i;
                u6Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i26).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i26).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList3 = tL_foundStories.stories;
                    int size2 = arrayList3.size();
                    int i27 = 0;
                    while (i27 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList3.get(i27);
                        i27++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList2.size();
                        MessageObject messageObject = new MessageObject(i26, tL_foundStory2.storyItem);
                        messageObject.generateThumbs(false);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(Integer.valueOf(arrayList2.size()));
                        u6Var.F.add(arrayList4);
                        arrayList2.add(messageObject);
                    }
                    u6Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        u6Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    u6Var.H = str;
                    u6Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(x6Var);
                    AndroidUtilities.runOnUIThread(x6Var);
                    return;
                }
                return;
            case 20:
                ci.w6 w6Var = (ci.w6) this.b;
                List list = (List) this.c;
                ArrayList arrayList5 = w6Var.h;
                arrayList5.clear();
                arrayList5.addAll(list);
                w6Var.d = true;
                w6Var.e = false;
                w6Var.d();
                NotificationCenter.getInstance(w6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(w6Var.b), w6Var);
                return;
            case 21:
                ci.w6 w6Var2 = (ci.w6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList6 = w6Var2.g;
                ArrayList arrayList7 = w6Var2.h;
                if (!(tLObject2 instanceof TL_stories.TL_albums)) {
                    if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                        w6Var2.f = true;
                        w6Var2.e = false;
                        NotificationCenter.getInstance(w6Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(w6Var2.b), w6Var2);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                int size3 = arrayList9.size();
                int i28 = 0;
                while (i28 < size3) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i28);
                    i28++;
                    arrayList8.add(ci.b7.a(tL_storyAlbum));
                }
                arrayList7.clear();
                arrayList7.addAll(arrayList8);
                arrayList6.clear();
                arrayList6.addAll(arrayList8);
                w6Var2.f = true;
                w6Var2.e = false;
                w6Var2.f(true);
                return;
            case 22:
                ci.a7 a7Var = (ci.a7) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                a7Var.getClass();
                callback2.run(a7Var);
                return;
            case 23:
                MessagesController.getInstance(((ci.h7) this.b).M.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                return;
            case 24:
                ci.h7 h7Var = (ci.h7) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ei.a8 a8Var4 = h7Var.c;
                a8Var4.w = true;
                ci.i7 i7Var = h7Var.M;
                if (i7Var.n(tL_error2)) {
                    a8Var4.x = null;
                } else {
                    a8Var4.x = tL_error2;
                }
                h7Var.d = true;
                h7Var.I = true;
                h7Var.H = true;
                i7Var.w.d(a8Var4);
                return;
            case 25:
                ci.h7 h7Var2 = (ci.h7) this.b;
                h7Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new ci.f7(h7Var2, r7));
                return;
            case 26:
                ci.w7 w7Var = (ci.w7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = w7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i29 = storyItem2.id;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            w7Var.l(peerDialogId, storyItem2);
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i29, new Object[0]);
                            boolean next = queryFinalized.next();
                            queryFinalized.dispose();
                            if (!next) {
                                i10 = 1;
                                SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized2.next()) {
                                }
                                queryFinalized2.dispose();
                                Locale locale2 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                                return;
                            }
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                        return;
                    }
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i29, new Object[0]);
                    if (queryFinalized3.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                        NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            ci.x8.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                            byteBufferValue.reuse();
                        }
                        if (byteBufferValue2 != null) {
                            byteBufferValue2.reuse();
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    queryFinalized3.dispose();
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i29).stepThis().dispose();
                    if (z10) {
                        i10 = -1;
                        SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        r7 = queryFinalized222.next() ? queryFinalized222.intValue(1) : 0;
                        queryFinalized222.dispose();
                        Locale locale222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                        return;
                    }
                    i10 = 0;
                    SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                    if (queryFinalized2222.next()) {
                    }
                    queryFinalized2222.dispose();
                    Locale locale2222 = Locale.US;
                    database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 27:
                ci.w7.a((ci.w7) this.b, (ci.i6) this.c);
                return;
            case 28:
                ci.w7 w7Var2 = (ci.w7) this.b;
                ci.i6 i6Var = (ci.i6) this.c;
                MessagesStorage messagesStorage2 = w7Var2.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e7) {
                    messagesStorage2.checkSQLException(e7);
                }
                AndroidUtilities.runOnUIThread(new ci.v7(i12, i6Var, longSparseIntArray));
                return;
            default:
                ((ci.i6) this.b).run((TL_stories.TL_stories_allStories) this.c);
                return;
        }
    }
}
