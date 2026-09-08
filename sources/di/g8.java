package di;

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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class g8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, le.d {
    public String A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TLRPC.User E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public String I0;
    public int J0;
    public final y7 K0;
    public boolean L0;
    public final ArrayList M0;
    public final RectF N0;
    public final ArrayList O0;
    public final le.b X;
    public final int Y;
    public boolean Z;
    public final g8 a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final MessagesController.SavedMusicList e0;
    public final Utilities.Callback f0;
    public MessageObject g0;
    public boolean h0;
    public boolean i0;
    public final FrameLayout j0;
    public final ui k0;
    public final bh.f l0;
    public final gh.d m0;
    public final gh.d n0;
    public final bh.b o0;
    public final z7 p0;
    public v51 q0;
    public MessageObject r0;
    public String s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public String x0;
    public int y0;
    public final y7 z0;

    /* JADX WARN: Type inference failed for: r1v1, types: [di.y7] */
    /* JADX WARN: Type inference failed for: r1v3, types: [di.y7] */
    public g8(Context context, boolean z10, g8 g8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        super(2, context, f6Var, true);
        pr prVar = pr.h;
        this.X = new le.b(0, this, prVar, 380L, false);
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.y0 = -1;
        final int i10 = 0;
        this.z0 = new Runnable(this) { // from class: di.y7
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.b0();
                        break;
                    case 1:
                        this.b.a0();
                        break;
                    default:
                        g8.T(this.b);
                        break;
                }
            }
        };
        this.H0 = -1;
        this.J0 = -2000000000;
        final int i11 = 1;
        this.K0 = new Runnable(this) { // from class: di.y7
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.b0();
                        break;
                    case 1:
                        this.b.a0();
                        break;
                    default:
                        g8.T(this.b);
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.M0 = arrayList;
        RectF rectF = new RectF();
        this.N0 = rectF;
        arrayList.add(rectF);
        this.O0 = new ArrayList();
        this.v = 0.35f;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.Z = z10;
        this.Y = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.a0 = g8Var;
        this.f0 = callback;
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.l0 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.n0 = dVar;
            dVar.j(new b8(this));
            gh.d dVar2 = new gh.d(null);
            this.m0 = dVar2;
            dVar2.j(new c8(this));
            bh.b bVar = new bh.b(dVar);
            this.o0 = bVar;
            bVar.f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.l0 = null;
            this.m0 = null;
            this.n0 = null;
            this.o0 = new bh.b(cVar);
        }
        this.p0 = new z7(this, 0);
        int i12 = org.telegram.ui.ActionBar.j6.a7;
        ui uiVar = new ui(context, i12, f6Var);
        this.k0 = uiVar;
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j0 = frameLayout;
        b20 b20Var = new b20(context, f6Var);
        b20Var.r.setOnFocusChangeListener(new d8(this));
        b20Var.w = true;
        b20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        b20Var.d();
        b20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        b20Var.r.addTextChangedListener(new e8(this));
        b20Var.r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(uiVar, w7.x5.g());
        frameLayout.addView(b20Var, w7.x5.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        b20Var.setupBlurredBackground(this.o0.c(b20Var, fh.b.n(f6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, w7.x5.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i12));
        ll0 ll0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i13, 0, i13, 0);
        this.d.o1();
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(prVar);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        if (z10) {
            this.e0 = null;
            if (this.Z && !this.L0) {
                this.L0 = true;
                final int i14 = 2;
                Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: di.y7
                    public final /* synthetic */ g8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.b.b0();
                                break;
                            case 1:
                                this.b.a0();
                                break;
                            default:
                                g8.T(this.b);
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
        this.d.setOnScrollListener(new f8(this));
        this.d.setOnItemClickListener(new bi.n0(this, callback, f6Var, 1));
    }

    public static /* synthetic */ void P(g8 g8Var, Long l4) {
        g8Var.F0 = false;
        TLRPC.User user = l4 == null ? null : MessagesController.getInstance(g8Var.currentAccount).getUser(l4);
        g8Var.E0 = user;
        g8Var.G0 = user == null;
        if (user != null) {
            g8Var.a0();
        }
    }

    public static /* synthetic */ void Q(g8 g8Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = g8Var.d0;
        boolean z10 = false;
        g8Var.C0 = false;
        g8Var.D0 = false;
        if (messages_botresults == null) {
            g8Var.q0.N(true);
            return;
        }
        MessagesController.getInstance(g8Var.currentAccount).putUsers(messages_botresults.users, false);
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
                    int i11 = g8Var.J0;
                    g8Var.J0 = i11 - 1;
                    tL_message.id = i11;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(g8Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(g8Var.currentAccount, tL_message, false, true));
                }
            }
        }
        g8Var.A0 = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(g8Var.A0)) {
            z10 = true;
        }
        g8Var.B0 = z10;
        g8Var.q0.N(true);
    }

    public static void R(g8 g8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, View view, int i10) {
        if (!(view instanceof org.telegram.ui.Cells.i7)) {
            h51 G = g8Var.q0.G(i10 - 1);
            if (G != null && G.d == 1) {
                new g8(g8Var.getContext(), true, g8Var, callback, f6Var).show();
                return;
            }
            if (G != null && G.d == 2) {
                g8Var.e0.load();
                return;
            }
            if (G != null && G.d == 3) {
                g8Var.b0();
                return;
            } else {
                if (G == null || G.d != 4) {
                    return;
                }
                g8Var.a0();
                return;
            }
        }
        MessageObject message = ((org.telegram.ui.Cells.i7) view).getMessage();
        if (message == null) {
            return;
        }
        DownloadController.getInstance(g8Var.currentAccount).removeLoadingFileObserver(g8Var);
        if (g8Var.g0 != null) {
            FileLoader.getInstance(g8Var.currentAccount).cancelLoadFile(g8Var.g0.getDocument());
            g8Var.g0 = null;
        }
        if (message.attachPathExists || message.mediaExists) {
            g8Var.f0.run(message);
            g8 g8Var2 = g8Var.a0;
            if (g8Var2 != null) {
                g8Var2.dismiss();
            }
            g8Var.dismiss();
            return;
        }
        String fileName = message.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        g8Var.g0 = message;
        DownloadController.getInstance(g8Var.currentAccount).addLoadingFileObserver(fileName, message, g8Var);
        FileLoader.getInstance(g8Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
    }

    public static /* synthetic */ void S(g8 g8Var, TLObject tLObject) {
        ArrayList arrayList = g8Var.c0;
        boolean z10 = false;
        g8Var.w0 = false;
        g8Var.v0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(g8Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(g8Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(g8Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            g8Var.u0 = z10;
            g8Var.t0 = messages_messages.next_rate;
        } else {
            g8Var.u0 = false;
            g8Var.t0 = 0;
        }
        g8Var.q0.N(true);
    }

    public static /* synthetic */ void T(g8 g8Var) {
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
                    long clientUserId = UserConfig.getInstance(g8Var.currentAccount).getClientUserId();
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
                    MessageObject messageObject = new MessageObject(g8Var.currentAccount, tL_message, false, true);
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
        AndroidUtilities.runOnUIThread(new b7(4, g8Var, arrayList));
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.w1.w(" ", str, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        return translitSafe.startsWith(str2) || org.telegram.messenger.w1.w(" ", str2, translitSafe);
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            ui uiVar = this.k0;
            uiVar.setAlpha(f7);
            uiVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final void I(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.l0 != null) {
            X();
            gh.d dVar = this.m0;
            if (dVar != null) {
                dVar.i(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.l();
            }
            gh.d dVar2 = this.n0;
            if (dVar2 != null) {
                dVar2.i(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.l();
            }
        }
        d0();
        super.I(canvas, view);
    }

    public final int W(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.s0;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.s0);
                    arrayList3.add(messageObject);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.c0) {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                } else {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.s0);
                        arrayList3.add(messageObject);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(h51.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                }
                this.q0.U();
                arrayList.add(h51.t(str));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList3.get(i14);
                    i14++;
                    a8 a8Var = new a8(this, i12);
                    int i15 = org.telegram.ui.Cells.h7.a;
                    h51 J = h51.J(org.telegram.ui.Cells.h7.class);
                    J.G = (MessageObject) obj2;
                    J.H = a8Var;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(h51.n(4));
                    arrayList.add(h51.n(4));
                    arrayList.add(h51.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    h51 c10 = h51.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.q0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.l0) == null) {
            return;
        }
        this.N0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        ArrayList arrayList = this.M0;
        ArrayList arrayList2 = this.O0;
        fVar.g(yf.f0.a(1, arrayList, arrayList2), arrayList2);
        fVar.e(this.p0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Y() {
        if (this.H0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.H0, true);
        }
        this.H0 = -1;
        this.A0 = "";
        this.B0 = false;
        this.d0.clear();
        this.C0 = false;
        this.D0 = false;
    }

    public final void Z() {
        if (this.y0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y0, true);
        }
        this.y0 = -1;
        this.t0 = 0;
        this.c0.clear();
        this.v0 = false;
        this.w0 = false;
    }

    public final void a0() {
        String str;
        String str2 = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.I0;
        String str4 = this.s0;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            Y();
        }
        if (this.C0 || TextUtils.isEmpty(this.s0) || this.s0.length() < 3) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty() || this.B0) {
            if (this.E0 == null) {
                this.E0 = MessagesController.getInstance(this.currentAccount).getUser(str2);
            }
            if (this.E0 == null) {
                if (this.F0 || this.G0) {
                    return;
                }
                this.F0 = true;
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new ah.m(this, 6));
                return;
            }
            this.C0 = true;
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.E0);
            tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
            if (arrayList.isEmpty() || (str = this.A0) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.s0;
            String str6 = str5 != null ? str5 : "";
            this.I0 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.H0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new x7(this, 1));
            this.q0.N(true);
        }
    }

    public final void b0() {
        if (this.Z) {
            return;
        }
        String str = this.x0;
        String str2 = this.s0;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            Z();
        }
        if (this.v0) {
            return;
        }
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty() || this.u0) {
            this.v0 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.s0;
            String str4 = str3 != null ? str3 : "";
            this.x0 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                MessageObject messageObject = (MessageObject) i2.g.h(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.t0;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.y0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new bi.v7(this, 4));
            this.q0.N(true);
        }
    }

    public final void d0() {
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            ll0 ll0Var = this.d;
            if (i10 >= ll0Var.getChildCount()) {
                break;
            }
            View childAt = ll0Var.getChildAt(i10);
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
            this.q0.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        if (this.r0 != null && MediaController.getInstance().isPlayingMessage(this.r0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.r0 = null;
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
        g8 g8Var = this.a0;
        if (g8Var != null) {
            g8Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, false, new x7(this, 0), this.resourcesProvider);
        this.q0 = v51Var;
        v51Var.r = false;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
