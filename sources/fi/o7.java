package fi;

import a8.pf;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class o7 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, oe.d {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public TLRPC.User D0;
    public boolean E0;
    public boolean F0;
    public int G0;
    public String H0;
    public int I0;
    public final i7 J0;
    public boolean K0;
    public final oe.b X;
    public final int Y;
    public boolean Z;
    public final o7 a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final MessagesController.SavedMusicList e0;
    public final Utilities.Callback f0;
    public MessageObject g0;
    public boolean h0;
    public boolean i0;
    public final FrameLayout j0;
    public final si k0;
    public final ch.f l0;
    public final hh.c m0;
    public final ch.b n0;
    public final k7 o0;
    public j71 p0;
    public MessageObject q0;
    public String r0;
    public int s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public String w0;
    public int x0;
    public final i7 y0;
    public String z0;

    /* JADX WARN: Type inference failed for: r1v1, types: [fi.i7] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fi.i7] */
    /* JADX WARN: Type inference failed for: r4v12, types: [fi.k7] */
    public o7(Context context, boolean z10, o7 o7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var) {
        super(2, context, u6Var, true);
        ds dsVar = ds.h;
        this.X = new oe.b(0, this, dsVar, 380L, false);
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.x0 = -1;
        final int i10 = 1;
        this.y0 = new Runnable(this) { // from class: fi.i7
            public final /* synthetic */ o7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        o7.S(this.b);
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    default:
                        this.b.a0();
                        break;
                }
            }
        };
        this.G0 = -1;
        this.I0 = -2000000000;
        final int i11 = 2;
        this.J0 = new Runnable(this) { // from class: fi.i7
            public final /* synthetic */ o7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        o7.S(this.b);
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    default:
                        this.b.a0();
                        break;
                }
            }
        };
        this.v = 0.35f;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.Z = z10;
        this.Y = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.a0 = o7Var;
        this.f0 = callback;
        hh.c d = this.glassEngine.d(new j7(this));
        this.m0 = d;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.l0 = null;
            this.n0 = new ch.b(d);
        } else {
            ch.f fVar = new ch.f();
            this.l0 = fVar;
            this.glassEngine.a(fVar);
            hh.d dVar = new hh.d(d);
            dVar.f = d;
            dVar.d = fVar;
            dVar.e = -2;
            ch.b bVar = new ch.b(dVar);
            this.n0 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            bVar.b = dp;
            bVar.c = dp;
            bVar.h = this.glassEngine;
        }
        this.o0 = new dh.a() { // from class: fi.k7
            @Override // dh.a
            public final void b(ch.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // dh.a
            public final void f(Canvas canvas, RectF rectF) {
                o7 o7Var2 = o7.this;
                mm0 mm0Var = o7Var2.d;
                ih.d.b(mm0Var, canvas, rectF, mm0Var, o7Var2.getContainerView(), 255);
            }
        };
        int i12 = org.telegram.ui.ActionBar.y6.a7;
        si siVar = new si(context, i12, u6Var);
        this.k0 = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j0 = frameLayout;
        m20 m20Var = new m20(context, u6Var);
        m20Var.r.setOnFocusChangeListener(new l7(this));
        m20Var.w = true;
        m20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        m20Var.updateColors();
        m20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        m20Var.r.addTextChangedListener(new m7(this));
        m20Var.r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(siVar, gb1.k());
        frameLayout.addView(m20Var, gb1.h(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        m20Var.setupBlurredBackground(this.n0.c(m20Var, gh.c.o(u6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, gb1.i(-1, -2, 55));
        setBackgroundColorKey(i12);
        mm0 mm0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i13, 0, i13, 0);
        this.d.u1();
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(dsVar);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        if (z10) {
            this.e0 = null;
            if (this.Z && !this.K0) {
                this.K0 = true;
                final int i14 = 0;
                Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: fi.i7
                    public final /* synthetic */ o7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                o7.S(this.b);
                                break;
                            case 1:
                                this.b.b0();
                                break;
                            default:
                                this.b.a0();
                                break;
                        }
                    }
                });
            }
        } else {
            int i15 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i15, UserConfig.getInstance(i15).getClientUserId());
            this.e0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        }
        this.d.setOnScrollListener(new n7(this));
        this.d.setOnItemClickListener(new di.g0(this, callback, u6Var, 1));
        this.glassEngine.b(this.d);
        this.glassEngine.i(this.containerView);
        oi.q qVar = this.glassEngine;
        qVar.a = new j7(this);
        qVar.d = new qi.b(AndroidUtilities.dp(48.0f));
    }

    public static /* synthetic */ void P(o7 o7Var, Long l4) {
        o7Var.E0 = false;
        TLRPC.User user = l4 == null ? null : MessagesController.getInstance(o7Var.currentAccount).getUser(l4);
        o7Var.D0 = user;
        o7Var.F0 = user == null;
        if (user != null) {
            o7Var.a0();
        }
    }

    public static void Q(o7 o7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var, View view, int i10) {
        if (!(view instanceof org.telegram.ui.Cells.n7)) {
            t61 G = o7Var.p0.G(i10 - 1);
            if (G != null && G.d == 1) {
                new o7(o7Var.getContext(), true, o7Var, callback, u6Var).show();
                return;
            }
            if (G != null && G.d == 2) {
                o7Var.e0.load();
                return;
            }
            if (G != null && G.d == 3) {
                o7Var.b0();
                return;
            } else {
                if (G == null || G.d != 4) {
                    return;
                }
                o7Var.a0();
                return;
            }
        }
        MessageObject message = ((org.telegram.ui.Cells.n7) view).getMessage();
        if (message == null) {
            return;
        }
        DownloadController.getInstance(o7Var.currentAccount).removeLoadingFileObserver(o7Var);
        if (o7Var.g0 != null) {
            FileLoader.getInstance(o7Var.currentAccount).cancelLoadFile(o7Var.g0.getDocument());
            o7Var.g0 = null;
        }
        if (message.attachPathExists || message.mediaExists) {
            o7Var.f0.run(message);
            o7 o7Var2 = o7Var.a0;
            if (o7Var2 != null) {
                o7Var2.dismiss();
            }
            o7Var.dismiss();
            return;
        }
        String fileName = message.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        o7Var.g0 = message;
        DownloadController.getInstance(o7Var.currentAccount).addLoadingFileObserver(fileName, message, o7Var);
        FileLoader.getInstance(o7Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
    }

    public static /* synthetic */ void R(o7 o7Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = o7Var.d0;
        boolean z10 = false;
        o7Var.B0 = false;
        o7Var.C0 = false;
        if (messages_botresults == null) {
            o7Var.p0.O(true);
            return;
        }
        MessagesController.getInstance(o7Var.currentAccount).putUsers(messages_botresults.users, false);
        ArrayList<TLRPC.BotInlineResult> arrayList2 = messages_botresults.results;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.BotInlineResult botInlineResult = arrayList2.get(i10);
            i10++;
            TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
            if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                if (tL_botInlineMediaResult.document != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    int i11 = o7Var.I0;
                    o7Var.I0 = i11 - 1;
                    tL_message.id = i11;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(o7Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(o7Var.currentAccount, tL_message, false, true));
                }
            }
        }
        o7Var.z0 = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(o7Var.z0)) {
            z10 = true;
        }
        o7Var.A0 = z10;
        o7Var.p0.O(true);
    }

    public static /* synthetic */ void S(o7 o7Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                try {
                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                    audioEntry.id = query.getInt(0);
                    audioEntry.author = query.getString(1);
                    audioEntry.title = query.getString(2);
                    audioEntry.path = query.getString(3);
                    audioEntry.duration = (int) (query.getLong(4) / 1000);
                    audioEntry.genre = query.getString(5);
                    File file = new File(audioEntry.path);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    tL_message.id = i10;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(o7Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    tL_message.attachPath = audioEntry.path;
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                    tL_message.flags |= 768;
                    String fileExtension = FileLoader.getFileExtension(file);
                    TLRPC.Document document = tL_message.media.document;
                    document.id = 0L;
                    document.access_hash = 0L;
                    document.file_reference = new byte[0];
                    document.date = tL_message.date;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("audio/");
                    if (fileExtension.length() <= 0) {
                        fileExtension = "mp3";
                    }
                    sb2.append(fileExtension);
                    document.mime_type = sb2.toString();
                    tL_message.media.document.size = (int) file.length();
                    tL_message.media.document.dc_id = 0;
                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                    tL_documentAttributeAudio.duration = audioEntry.duration;
                    tL_documentAttributeAudio.title = audioEntry.title;
                    tL_documentAttributeAudio.performer = audioEntry.author;
                    tL_documentAttributeAudio.flags = 3 | tL_documentAttributeAudio.flags;
                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = file.getName();
                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                    MessageObject messageObject = new MessageObject(o7Var.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i10--;
                } finally {
                }
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new e2.q0(16, o7Var, arrayList));
    }

    public static /* synthetic */ void T(o7 o7Var, TLObject tLObject) {
        ArrayList arrayList = o7Var.c0;
        boolean z10 = false;
        o7Var.v0 = false;
        o7Var.u0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(o7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(o7Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(o7Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            o7Var.t0 = z10;
            o7Var.s0 = messages_messages.next_rate;
        } else {
            o7Var.t0 = false;
            o7Var.s0 = 0;
        }
        o7Var.p0.O(true);
    }

    public static void U(o7 o7Var, int i10) {
        ch.f fVar = o7Var.l0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (pf.a(i10, 4)) {
            fVar.h(o7Var.glassEngine.e());
        }
        fVar.e(o7Var.o0, o7Var.containerView.getWidth(), o7Var.containerView.getHeight());
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || vh.u(" ", str, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        return translitSafe.startsWith(str2) || vh.u(" ", str2, translitSafe);
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            si siVar = this.k0;
            siVar.setAlpha(f7);
            siVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final void I(Canvas canvas, View view) {
        d0();
        super.I(canvas, view);
    }

    public final int X(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.r0;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.r0);
                    arrayList3.add(messageObject);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.c0) {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                } else {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.r0);
                        arrayList3.add(messageObject);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                int i14 = 1;
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(t61.C(null));
                    i11 = AndroidUtilities.dp(12.0f);
                }
                this.p0.V();
                arrayList.add(t61.u(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    bi.dc dcVar = new bi.dc(this, i14);
                    int i15 = org.telegram.ui.Cells.m7.a;
                    t61 K = t61.K(org.telegram.ui.Cells.m7.class);
                    K.G = (MessageObject) obj2;
                    K.H = dcVar;
                    arrayList.add(K);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(t61.p(4));
                    arrayList.add(t61.p(4));
                    arrayList.add(t61.p(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    t61 c10 = t61.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.p0.U();
                return i11;
            }
        }
        return 0;
    }

    public final void Y() {
        if (this.G0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.G0, true);
        }
        this.G0 = -1;
        this.z0 = "";
        this.A0 = false;
        this.d0.clear();
        this.B0 = false;
        this.C0 = false;
    }

    public final void Z() {
        if (this.x0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.x0, true);
        }
        this.x0 = -1;
        this.s0 = 0;
        this.c0.clear();
        this.u0 = false;
        this.v0 = false;
    }

    public final void a0() {
        String str;
        String str2 = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.H0;
        String str4 = this.r0;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            Y();
        }
        if (this.B0 || TextUtils.isEmpty(this.r0) || this.r0.length() < 3) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty() || this.A0) {
            if (this.D0 == null) {
                this.D0 = MessagesController.getInstance(this.currentAccount).getUser(str2);
            }
            if (this.D0 == null) {
                if (this.E0 || this.F0) {
                    return;
                }
                this.E0 = true;
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new ai.i(this, 24));
                return;
            }
            this.B0 = true;
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.D0);
            tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
            if (arrayList.isEmpty() || (str = this.z0) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.r0;
            String str6 = str5 != null ? str5 : "";
            this.H0 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.G0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new h7(this, 1));
            this.p0.O(true);
        }
    }

    public final void b0() {
        if (this.Z) {
            return;
        }
        String str = this.w0;
        String str2 = this.r0;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            Z();
        }
        if (this.u0) {
            return;
        }
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty() || this.t0) {
            this.u0 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.r0;
            String str4 = str3 != null ? str3 : "";
            this.w0 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.s0;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.x0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new bi.i0(this, 9));
            this.p0.O(true);
        }
    }

    public final void d0() {
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.d;
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        this.j0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7));
        this.X.a(f7 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)), true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.p0.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        if (this.q0 != null && MediaController.getInstance().isPlayingMessage(this.q0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.q0 = null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.Y;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        MessageObject messageObject = this.g0;
        if (messageObject == null || !TextUtils.equals(messageObject.getFileName(), str)) {
            return;
        }
        this.f0.run(this.g0);
        o7 o7Var = this.a0;
        if (o7Var != null) {
            o7Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            hh.c cVar = this.m0;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, false, new h7(this, 0), this.resourcesProvider);
        this.p0 = j71Var;
        j71Var.r = false;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
