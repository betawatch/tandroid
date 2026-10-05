package ci;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class c8 extends org.telegram.ui.Components.cb implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, le.d {
    public boolean A0;
    public boolean B0;
    public TLRPC.User C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public String G0;
    public int H0;
    public final v7 I0;
    public boolean J0;
    public final le.b X;
    public final int Y;
    public boolean Z;
    public final c8 a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final MessagesController.SavedMusicList e0;
    public final Utilities.Callback f0;
    public MessageObject g0;
    public boolean h0;
    public boolean i0;
    public final FrameLayout j0;
    public final wi k0;
    public final ah.i l0;
    public final ah.c m0;
    public final x7 n0;
    public w61 o0;
    public MessageObject p0;
    public String q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public String v0;
    public int w0;
    public final v7 x0;
    public String y0;
    public boolean z0;

    /* JADX WARN: Type inference failed for: r1v1, types: [ci.v7] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ci.v7] */
    public c8(Context context, boolean z10, c8 c8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        super(2, context, d6Var, true);
        tr trVar = tr.h;
        this.X = new le.b(0, this, trVar, 380L, false);
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.w0 = -1;
        final int i10 = 1;
        this.x0 = new Runnable(this) { // from class: ci.v7
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        c8.Q(this.b);
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    default:
                        this.b.Z();
                        break;
                }
            }
        };
        this.F0 = -1;
        this.H0 = -2000000000;
        final int i11 = 2;
        this.I0 = new Runnable(this) { // from class: ci.v7
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        c8.Q(this.b);
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    default:
                        this.b.Z();
                        break;
                }
            }
        };
        this.v = 0.35f;
        fixNavigationBar();
        I();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.Z = z10;
        this.Y = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.a0 = c8Var;
        this.f0 = callback;
        fh.c d = this.glassEngine.d(new w7(this));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.l0 = null;
            this.m0 = new ah.c(d);
        } else {
            ah.i iVar = new ah.i();
            this.l0 = iVar;
            this.glassEngine.a(iVar);
            fh.d dVar = new fh.d(d);
            dVar.f = d;
            dVar.d = iVar;
            dVar.e = -2;
            ah.c cVar = new ah.c(dVar);
            this.m0 = cVar;
            cVar.i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            cVar.b = dp;
            cVar.c = dp;
            cVar.h = this.glassEngine;
        }
        this.n0 = new x7(this, 0);
        int i12 = org.telegram.ui.ActionBar.i6.a7;
        wi wiVar = new wi(context, i12, d6Var);
        this.k0 = wiVar;
        wiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j0 = frameLayout;
        f20 f20Var = new f20(context, d6Var);
        f20Var.r.setOnFocusChangeListener(new z7(this));
        f20Var.w = true;
        f20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        f20Var.e();
        f20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        f20Var.r.addTextChangedListener(new a8(this));
        f20Var.r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(wiVar, w7.z5.g());
        frameLayout.addView(f20Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        f20Var.setupBlurredBackground(this.m0.c(f20Var, eh.b.o(d6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, w7.z5.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i12));
        zl0 zl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i13, 0, i13, 0);
        this.d.r1();
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(trVar);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        if (z10) {
            this.e0 = null;
            if (this.Z && !this.J0) {
                this.J0 = true;
                final int i14 = 0;
                Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: ci.v7
                    public final /* synthetic */ c8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                c8.Q(this.b);
                                break;
                            case 1:
                                this.b.b0();
                                break;
                            default:
                                this.b.Z();
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
            Z();
        }
        this.d.setOnScrollListener(new b8(this));
        this.d.setOnItemClickListener(new ai.u0(this, callback, d6Var, 1));
        this.glassEngine.b(this.d);
        this.glassEngine.i(this.containerView);
        li.p pVar = this.glassEngine;
        pVar.a = new w7(this);
        pVar.d = new ni.b(AndroidUtilities.dp(48.0f));
    }

    public static /* synthetic */ void N(c8 c8Var, Long l4) {
        c8Var.D0 = false;
        TLRPC.User user = l4 == null ? null : MessagesController.getInstance(c8Var.currentAccount).getUser(l4);
        c8Var.C0 = user;
        c8Var.E0 = user == null;
        if (user != null) {
            c8Var.Z();
        }
    }

    public static void O(c8 c8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var, View view, int i10) {
        if (!(view instanceof org.telegram.ui.Cells.j7)) {
            h61 G = c8Var.o0.G(i10 - 1);
            if (G != null && G.d == 1) {
                new c8(c8Var.getContext(), true, c8Var, callback, d6Var).show();
                return;
            }
            if (G != null && G.d == 2) {
                c8Var.e0.load();
                return;
            }
            if (G != null && G.d == 3) {
                c8Var.b0();
                return;
            } else {
                if (G == null || G.d != 4) {
                    return;
                }
                c8Var.Z();
                return;
            }
        }
        MessageObject message = ((org.telegram.ui.Cells.j7) view).getMessage();
        if (message == null) {
            return;
        }
        DownloadController.getInstance(c8Var.currentAccount).removeLoadingFileObserver(c8Var);
        if (c8Var.g0 != null) {
            FileLoader.getInstance(c8Var.currentAccount).cancelLoadFile(c8Var.g0.getDocument());
            c8Var.g0 = null;
        }
        if (message.attachPathExists || message.mediaExists) {
            c8Var.f0.run(message);
            c8 c8Var2 = c8Var.a0;
            if (c8Var2 != null) {
                c8Var2.dismiss();
            }
            c8Var.dismiss();
            return;
        }
        String fileName = message.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        c8Var.g0 = message;
        DownloadController.getInstance(c8Var.currentAccount).addLoadingFileObserver(fileName, message, c8Var);
        FileLoader.getInstance(c8Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
    }

    public static /* synthetic */ void P(c8 c8Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = c8Var.d0;
        boolean z10 = false;
        c8Var.A0 = false;
        c8Var.B0 = false;
        if (messages_botresults == null) {
            c8Var.o0.N(true);
            return;
        }
        MessagesController.getInstance(c8Var.currentAccount).putUsers(messages_botresults.users, false);
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
                    int i11 = c8Var.H0;
                    c8Var.H0 = i11 - 1;
                    tL_message.id = i11;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(c8Var.currentAccount, tL_message, false, true));
                }
            }
        }
        c8Var.y0 = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(c8Var.y0)) {
            z10 = true;
        }
        c8Var.z0 = z10;
        c8Var.o0.N(true);
    }

    public static /* synthetic */ void Q(c8 c8Var) {
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
                    long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
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
                    MessageObject messageObject = new MessageObject(c8Var.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i10--;
                } finally {
                }
            }
            query.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new ai.ba(26, c8Var, arrayList));
    }

    public static /* synthetic */ void R(c8 c8Var, TLObject tLObject) {
        ArrayList arrayList = c8Var.c0;
        boolean z10 = false;
        c8Var.u0 = false;
        c8Var.t0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(c8Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(c8Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(c8Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            c8Var.s0 = z10;
            c8Var.r0 = messages_messages.next_rate;
        } else {
            c8Var.s0 = false;
            c8Var.r0 = 0;
        }
        c8Var.o0.N(true);
    }

    public static void S(c8 c8Var, int i10) {
        ah.i iVar = c8Var.l0;
        if (Build.VERSION.SDK_INT < 31 || iVar == null) {
            return;
        }
        if (w7.e0.a(i10, 4)) {
            iVar.h(c8Var.glassEngine.e());
        }
        iVar.e(c8Var.n0, c8Var.containerView.getWidth(), c8Var.containerView.getHeight());
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || bi.u(" ", str, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        return translitSafe.startsWith(str2) || bi.u(" ", str2, translitSafe);
    }

    @Override // org.telegram.ui.Components.cb
    public final void G(Canvas canvas, View view) {
        d0();
        super.G(canvas, view);
    }

    public final int W(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.q0;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.q0);
                    arrayList3.add(messageObject);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.c0) {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                } else {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.q0);
                        arrayList3.add(messageObject);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(h61.C(null));
                    i11 = AndroidUtilities.dp(12.0f);
                }
                this.o0.U();
                arrayList.add(h61.u(str));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList3.get(i14);
                    i14++;
                    y7 y7Var = new y7(this, i12);
                    int i15 = org.telegram.ui.Cells.i7.a;
                    h61 K = h61.K(org.telegram.ui.Cells.i7.class);
                    K.G = (MessageObject) obj2;
                    K.H = y7Var;
                    arrayList.add(K);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(h61.p(4));
                    arrayList.add(h61.p(4));
                    arrayList.add(h61.p(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    h61 c10 = h61.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.o0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        if (this.F0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.F0, true);
        }
        this.F0 = -1;
        this.y0 = "";
        this.z0 = false;
        this.d0.clear();
        this.A0 = false;
        this.B0 = false;
    }

    public final void Y() {
        if (this.w0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.w0, true);
        }
        this.w0 = -1;
        this.r0 = 0;
        this.c0.clear();
        this.t0 = false;
        this.u0 = false;
    }

    public final void Z() {
        String str;
        String str2 = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.G0;
        String str4 = this.q0;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            X();
        }
        if (this.A0 || TextUtils.isEmpty(this.q0) || this.q0.length() < 3) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty() || this.z0) {
            if (this.C0 == null) {
                this.C0 = MessagesController.getInstance(this.currentAccount).getUser(str2);
            }
            if (this.C0 == null) {
                if (this.D0 || this.E0) {
                    return;
                }
                this.D0 = true;
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new ai.y1(this, 14));
                return;
            }
            this.A0 = true;
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.C0);
            tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
            if (arrayList.isEmpty() || (str = this.y0) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.q0;
            String str6 = str5 != null ? str5 : "";
            this.G0 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.F0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new u7(this, 1));
            this.o0.N(true);
        }
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            wi wiVar = this.k0;
            wiVar.setAlpha(f7);
            wiVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    public final void b0() {
        if (this.Z) {
            return;
        }
        String str = this.v0;
        String str2 = this.q0;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            Y();
        }
        if (this.t0) {
            return;
        }
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty() || this.s0) {
            this.t0 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.q0;
            String str4 = str3 != null ? str3 : "";
            this.v0 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.r0;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.w0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new ai.n8(this, 4));
            this.o0.N(true);
        }
    }

    public final void d0() {
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            zl0 zl0Var = this.d;
            if (i10 >= zl0Var.getChildCount()) {
                break;
            }
            View childAt = zl0Var.getChildAt(i10);
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
            this.o0.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        if (this.p0 != null && MediaController.getInstance().isPlayingMessage(this.p0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.p0 = null;
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
        c8 c8Var = this.a0;
        if (c8Var != null) {
            c8Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(zl0Var, getContext(), this.currentAccount, 0, false, new u7(this, 0), this.resourcesProvider);
        this.o0 = w61Var;
        w61Var.r = false;
        return w61Var;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
