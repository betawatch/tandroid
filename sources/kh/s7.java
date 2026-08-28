package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s7 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, td.b {
    public TLRPC.User A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public String E0;
    public int F0;
    public final m7 G0;
    public boolean H0;
    public final ArrayList I0;
    public final RectF J0;
    public final ArrayList K0;
    public final td.a T;
    public final int U;
    public boolean V;
    public final s7 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final MessagesController.SavedMusicList a0;
    public final Utilities.Callback b0;
    public MessageObject c0;
    public boolean d0;
    public boolean e0;
    public final FrameLayout f0;
    public final ji g0;
    public final ig.e h0;
    public final ng.d i0;
    public final ng.d j0;
    public final ig.a k0;
    public final fh.x2 l0;
    public z41 m0;
    public MessageObject n0;
    public String o0;
    public int p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public String t0;
    public int u0;
    public final m7 v0;
    public String w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Type inference failed for: r2v2, types: [kh.m7] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kh.m7] */
    public s7(Context context, boolean z10, s7 s7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, true, false, false, 2, b6Var);
        gr grVar = gr.h;
        this.T = new td.a(0, this, grVar, 380L, false);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.u0 = -1;
        final int i9 = 0;
        this.v0 = new Runnable(this) { // from class: kh.m7
            public final /* synthetic */ s7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.b.a0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    default:
                        s7.R(this.b);
                        break;
                }
            }
        };
        this.D0 = -1;
        this.F0 = -2000000000;
        final int i10 = 1;
        this.G0 = new Runnable(this) { // from class: kh.m7
            public final /* synthetic */ s7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.a0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    default:
                        s7.R(this.b);
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.I0 = arrayList;
        RectF rectF = new RectF();
        this.J0 = rectF;
        arrayList.add(rectF);
        this.K0 = new ArrayList();
        this.v = 0.35f;
        fixNavigationBar();
        J();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.V = z10;
        this.U = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.W = s7Var;
        this.b0 = callback;
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.h0 = new ig.e(false);
            ng.d dVar = new ng.d(null);
            this.j0 = dVar;
            dVar.i(new n7(this));
            ng.d dVar2 = new ng.d(null);
            this.i0 = dVar2;
            dVar2.i(new o7(this));
            ig.a aVar = new ig.a(dVar);
            this.k0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.h0 = null;
            this.i0 = null;
            this.j0 = null;
            this.k0 = new ig.a(cVar);
        }
        this.l0 = new fh.x2(this, 1);
        int i11 = org.telegram.ui.ActionBar.f6.a7;
        ji jiVar = new ji(context, i11, b6Var);
        this.g0 = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f0 = frameLayout;
        m10 m10Var = new m10(context, b6Var);
        m10Var.r.setOnFocusChangeListener(new p7(this));
        m10Var.w = true;
        m10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        m10Var.d();
        m10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        m10Var.r.addTextChangedListener(new q7(this));
        m10Var.r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(jiVar, g7.e6.g());
        frameLayout.addView(m10Var, g7.e6.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        m10Var.setupBlurredBackground(this.k0.c(m10Var, mg.c.m(b6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, g7.e6.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i11));
        wk0 wk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i12, 0, i12, 0);
        this.d.p1();
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(grVar);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        if (z10) {
            this.a0 = null;
            if (this.V && !this.H0) {
                this.H0 = true;
                final int i13 = 2;
                Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: kh.m7
                    public final /* synthetic */ s7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                this.b.a0();
                                break;
                            case 1:
                                this.b.Z();
                                break;
                            default:
                                s7.R(this.b);
                                break;
                        }
                    }
                });
            }
        } else {
            int i14 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i14, UserConfig.getInstance(i14).getClientUserId());
            this.a0 = savedMusicList;
            savedMusicList.load();
            a0();
            Z();
        }
        this.d.setOnScrollListener(new r7(this));
        this.d.setOnItemClickListener(new ih.f0(this, callback, b6Var, 1));
    }

    public static /* synthetic */ void O(s7 s7Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = s7Var.Z;
        boolean z10 = false;
        s7Var.y0 = false;
        s7Var.z0 = false;
        if (messages_botresults == null) {
            s7Var.m0.N(true);
            return;
        }
        MessagesController.getInstance(s7Var.currentAccount).putUsers(messages_botresults.users, false);
        ArrayList<TLRPC.BotInlineResult> arrayList2 = messages_botresults.results;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.BotInlineResult botInlineResult = arrayList2.get(i9);
            i9++;
            TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
            if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                if (tL_botInlineMediaResult.document != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    int i10 = s7Var.F0;
                    s7Var.F0 = i10 - 1;
                    tL_message.id = i10;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(s7Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(s7Var.currentAccount, tL_message, false, true));
                }
            }
        }
        s7Var.w0 = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(s7Var.w0)) {
            z10 = true;
        }
        s7Var.x0 = z10;
        s7Var.m0.N(true);
    }

    public static void P(s7 s7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b6 b6Var, View view, int i9) {
        if (!(view instanceof org.telegram.ui.Cells.h7)) {
            l41 G = s7Var.m0.G(i9 - 1);
            if (G != null && G.d == 1) {
                new s7(s7Var.getContext(), true, s7Var, callback, b6Var).show();
                return;
            }
            if (G != null && G.d == 2) {
                s7Var.a0.load();
                return;
            }
            if (G != null && G.d == 3) {
                s7Var.a0();
                return;
            } else {
                if (G == null || G.d != 4) {
                    return;
                }
                s7Var.Z();
                return;
            }
        }
        MessageObject message = ((org.telegram.ui.Cells.h7) view).getMessage();
        if (message == null) {
            return;
        }
        DownloadController.getInstance(s7Var.currentAccount).removeLoadingFileObserver(s7Var);
        if (s7Var.c0 != null) {
            FileLoader.getInstance(s7Var.currentAccount).cancelLoadFile(s7Var.c0.getDocument());
            s7Var.c0 = null;
        }
        if (message.attachPathExists || message.mediaExists) {
            s7Var.b0.run(message);
            s7 s7Var2 = s7Var.W;
            if (s7Var2 != null) {
                s7Var2.dismiss();
            }
            s7Var.dismiss();
            return;
        }
        String fileName = message.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        s7Var.c0 = message;
        DownloadController.getInstance(s7Var.currentAccount).addLoadingFileObserver(fileName, message, s7Var);
        FileLoader.getInstance(s7Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
    }

    public static /* synthetic */ void Q(s7 s7Var, TLObject tLObject) {
        ArrayList arrayList = s7Var.Y;
        boolean z10 = false;
        s7Var.s0 = false;
        s7Var.r0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(s7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(s7Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                TLRPC.Message message = arrayList2.get(i9);
                i9++;
                arrayList.add(new MessageObject(s7Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            s7Var.q0 = z10;
            s7Var.p0 = messages_messages.next_rate;
        } else {
            s7Var.q0 = false;
            s7Var.p0 = 0;
        }
        s7Var.m0.N(true);
    }

    public static /* synthetic */ void R(s7 s7Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i9 = -2000000000;
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
                    tL_message.id = i9;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(s7Var.currentAccount).getClientUserId();
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
                    MessageObject messageObject = new MessageObject(s7Var.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i9--;
                } finally {
                }
            }
            query.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new ih.j7(23, s7Var, arrayList));
    }

    public static /* synthetic */ void S(s7 s7Var, Long l10) {
        s7Var.B0 = false;
        TLRPC.User user = l10 == null ? null : MessagesController.getInstance(s7Var.currentAccount).getUser(l10);
        s7Var.A0 = user;
        s7Var.C0 = user == null;
        if (user != null) {
            s7Var.Z();
        }
    }

    public static boolean b0(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.l0.w(" ", str, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        return translitSafe.startsWith(str2) || org.telegram.messenger.l0.w(" ", str2, translitSafe);
    }

    @Override // org.telegram.ui.Components.sa
    public final void H(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.h0 != null) {
            W();
            ng.d dVar = this.i0;
            if (dVar != null) {
                dVar.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.j();
            }
            ng.d dVar2 = this.j0;
            if (dVar2 != null) {
                dVar2.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.j();
            }
        }
        c0();
        super.H(canvas, view);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            ji jiVar = this.g0;
            jiVar.setAlpha(f10);
            jiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final int V(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i9) {
        int i10;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.o0;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.o0);
                    arrayList3.add(messageObject);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.Y) {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                } else {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (b0(lowerCase, translitSafe, musicTitle) || b0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.o0);
                        arrayList3.add(messageObject);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i10 = 0;
                } else {
                    arrayList.add(l41.B(null));
                    i10 = AndroidUtilities.dp(12.0f);
                }
                this.m0.U();
                arrayList.add(l41.t(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    dg.o oVar = new dg.o(this, 2);
                    int i13 = org.telegram.ui.Cells.g7.a;
                    l41 J = l41.J(org.telegram.ui.Cells.g7.class);
                    J.G = (MessageObject) obj2;
                    J.H = oVar;
                    arrayList.add(J);
                    i10 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(l41.n(4));
                    arrayList.add(l41.n(4));
                    arrayList.add(l41.n(4));
                    i10 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    l41 c10 = l41.c(i9, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.q = true;
                    arrayList.add(c10);
                    i10 += AndroidUtilities.dp(50.0f);
                }
                this.m0.T();
                return i10;
            }
        }
        return 0;
    }

    public final void W() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.h0) == null) {
            return;
        }
        this.J0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        ArrayList arrayList = this.I0;
        ArrayList arrayList2 = this.K0;
        eVar.g(ff.m0.a(arrayList, 1, arrayList2), arrayList2);
        eVar.e(this.l0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void X() {
        if (this.D0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.D0, true);
        }
        this.D0 = -1;
        this.w0 = "";
        this.x0 = false;
        this.Z.clear();
        this.y0 = false;
        this.z0 = false;
    }

    public final void Y() {
        if (this.u0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0, true);
        }
        this.u0 = -1;
        this.p0 = 0;
        this.Y.clear();
        this.r0 = false;
        this.s0 = false;
    }

    public final void Z() {
        String str;
        String str2 = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.E0;
        String str4 = this.o0;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            X();
        }
        if (this.y0 || TextUtils.isEmpty(this.o0) || this.o0.length() < 3) {
            return;
        }
        ArrayList arrayList = this.Z;
        if (arrayList.isEmpty() || this.x0) {
            if (this.A0 == null) {
                this.A0 = MessagesController.getInstance(this.currentAccount).getUser(str2);
            }
            if (this.A0 == null) {
                if (this.B0 || this.C0) {
                    return;
                }
                this.B0 = true;
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new hg.i(this, 6));
                return;
            }
            this.y0 = true;
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.A0);
            tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
            if (arrayList.isEmpty() || (str = this.w0) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.o0;
            String str6 = str5 != null ? str5 : "";
            this.E0 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.D0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new l7(this, 1));
            this.m0.N(true);
        }
    }

    public final void a0() {
        if (this.V) {
            return;
        }
        String str = this.t0;
        String str2 = this.o0;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            Y();
        }
        if (this.r0) {
            return;
        }
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty() || this.q0) {
            this.r0 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.o0;
            String str4 = str3 != null ? str3 : "";
            this.t0 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.p0;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.u0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new bf.a(this, 15));
            this.m0.N(true);
        }
    }

    public final void c0() {
        float f10 = AndroidUtilities.displaySize.y;
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.d;
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i9++;
        }
        this.f0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10));
        this.T.a(f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)), true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.musicListLoaded) {
            this.m0.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        if (this.n0 != null && MediaController.getInstance().isPlayingMessage(this.n0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.n0 = null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.U;
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
        MessageObject messageObject = this.c0;
        if (messageObject == null || !TextUtils.equals(messageObject.getFileName(), str)) {
            return;
        }
        this.b0.run(this.c0);
        s7 s7Var = this.W;
        if (s7Var != null) {
            s7Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, false, new l7(this, 0), this.resourcesProvider);
        this.m0 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
