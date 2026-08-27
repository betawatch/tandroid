package lh;

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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r7 extends org.telegram.ui.Components.qa implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, ud.b {
    public TLRPC.User A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public String E0;
    public int F0;
    public final l7 G0;
    public boolean H0;
    public final ArrayList I0;
    public final RectF J0;
    public final ArrayList K0;
    public final ud.a T;
    public final int U;
    public boolean V;
    public final r7 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final MessagesController.SavedMusicList a0;
    public final Utilities.Callback b0;
    public MessageObject c0;
    public boolean d0;
    public boolean e0;
    public final FrameLayout f0;
    public final fi g0;
    public final jg.e h0;
    public final og.d i0;
    public final og.d j0;
    public final jg.a k0;
    public final gh.s2 l0;
    public b51 m0;
    public MessageObject n0;
    public String o0;
    public int p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public String t0;
    public int u0;
    public final l7 v0;
    public String w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Type inference failed for: r2v2, types: [lh.l7] */
    /* JADX WARN: Type inference failed for: r2v4, types: [lh.l7] */
    public r7(Context context, boolean z10, r7 r7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, 2, c6Var);
        er erVar = er.h;
        this.T = new ud.a(0, this, erVar, 380L, false);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.u0 = -1;
        final int i10 = 0;
        this.v0 = new Runnable(this) { // from class: lh.l7
            public final /* synthetic */ r7 b;

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
                        r7.S(this.b);
                        break;
                }
            }
        };
        this.D0 = -1;
        this.F0 = -2000000000;
        final int i11 = 1;
        this.G0 = new Runnable(this) { // from class: lh.l7
            public final /* synthetic */ r7 b;

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
                        r7.S(this.b);
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
        K();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.V = z10;
        this.U = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.W = r7Var;
        this.b0 = callback;
        og.c cVar = new og.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.h0 = new jg.e(false);
            og.d dVar = new og.d(null);
            this.j0 = dVar;
            dVar.i(new m7(this));
            og.d dVar2 = new og.d(null);
            this.i0 = dVar2;
            dVar2.i(new n7(this));
            jg.a aVar = new jg.a(dVar);
            this.k0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.h0 = null;
            this.i0 = null;
            this.j0 = null;
            this.k0 = new jg.a(cVar);
        }
        this.l0 = new gh.s2(this, 1);
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        fi fiVar = new fi(context, i12, c6Var);
        this.g0 = fiVar;
        fiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f0 = frameLayout;
        p10 p10Var = new p10(context, c6Var);
        p10Var.r.setOnFocusChangeListener(new o7(this));
        p10Var.w = true;
        p10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        p10Var.d();
        p10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        p10Var.r.addTextChangedListener(new p7(this));
        p10Var.r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(fiVar, h7.z5.g());
        frameLayout.addView(p10Var, h7.z5.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        p10Var.setupBlurredBackground(this.k0.c(p10Var, ng.c.m(c6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, h7.z5.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i12));
        zk0 zk0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i13, 0, i13, 0);
        this.d.p1();
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(erVar);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        if (z10) {
            this.a0 = null;
            if (this.V && !this.H0) {
                this.H0 = true;
                final int i14 = 2;
                Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: lh.l7
                    public final /* synthetic */ r7 b;

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
                                r7.S(this.b);
                                break;
                        }
                    }
                });
            }
        } else {
            int i15 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i15, UserConfig.getInstance(i15).getClientUserId());
            this.a0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        }
        this.d.setOnScrollListener(new q7(this));
        this.d.setOnItemClickListener(new jh.d0(this, callback, c6Var, 1));
    }

    public static /* synthetic */ void P(r7 r7Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = r7Var.Z;
        boolean z10 = false;
        r7Var.y0 = false;
        r7Var.z0 = false;
        if (messages_botresults == null) {
            r7Var.m0.N(true);
            return;
        }
        MessagesController.getInstance(r7Var.currentAccount).putUsers(messages_botresults.users, false);
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
                    int i11 = r7Var.F0;
                    r7Var.F0 = i11 - 1;
                    tL_message.id = i11;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(r7Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(r7Var.currentAccount, tL_message, false, true));
                }
            }
        }
        r7Var.w0 = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(r7Var.w0)) {
            z10 = true;
        }
        r7Var.x0 = z10;
        r7Var.m0.N(true);
    }

    public static void Q(r7 r7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        if (!(view instanceof org.telegram.ui.Cells.e7)) {
            n41 G = r7Var.m0.G(i10 - 1);
            if (G != null && G.d == 1) {
                new r7(r7Var.getContext(), true, r7Var, callback, c6Var).show();
                return;
            }
            if (G != null && G.d == 2) {
                r7Var.a0.load();
                return;
            }
            if (G != null && G.d == 3) {
                r7Var.b0();
                return;
            } else {
                if (G == null || G.d != 4) {
                    return;
                }
                r7Var.a0();
                return;
            }
        }
        MessageObject message = ((org.telegram.ui.Cells.e7) view).getMessage();
        if (message == null) {
            return;
        }
        DownloadController.getInstance(r7Var.currentAccount).removeLoadingFileObserver(r7Var);
        if (r7Var.c0 != null) {
            FileLoader.getInstance(r7Var.currentAccount).cancelLoadFile(r7Var.c0.getDocument());
            r7Var.c0 = null;
        }
        if (message.attachPathExists || message.mediaExists) {
            r7Var.b0.run(message);
            r7 r7Var2 = r7Var.W;
            if (r7Var2 != null) {
                r7Var2.dismiss();
            }
            r7Var.dismiss();
            return;
        }
        String fileName = message.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        r7Var.c0 = message;
        DownloadController.getInstance(r7Var.currentAccount).addLoadingFileObserver(fileName, message, r7Var);
        FileLoader.getInstance(r7Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
    }

    public static /* synthetic */ void R(r7 r7Var, TLObject tLObject) {
        ArrayList arrayList = r7Var.Y;
        boolean z10 = false;
        r7Var.s0 = false;
        r7Var.r0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(r7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(r7Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(r7Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            r7Var.q0 = z10;
            r7Var.p0 = messages_messages.next_rate;
        } else {
            r7Var.q0 = false;
            r7Var.p0 = 0;
        }
        r7Var.m0.N(true);
    }

    public static /* synthetic */ void S(r7 r7Var) {
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
                    long clientUserId = UserConfig.getInstance(r7Var.currentAccount).getClientUserId();
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
                    MessageObject messageObject = new MessageObject(r7Var.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i10--;
                } finally {
                }
            }
            query.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AndroidUtilities.runOnUIThread(new jh.p6(29, r7Var, arrayList));
    }

    public static /* synthetic */ void T(r7 r7Var, Long l10) {
        r7Var.B0 = false;
        TLRPC.User user = l10 == null ? null : MessagesController.getInstance(r7Var.currentAccount).getUser(l10);
        r7Var.A0 = user;
        r7Var.C0 = user == null;
        if (user != null) {
            r7Var.a0();
        }
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.y1.x(" ", str, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        return translitSafe.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, translitSafe);
    }

    @Override // org.telegram.ui.Components.qa
    public final void I(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.h0 != null) {
            X();
            og.d dVar = this.i0;
            if (dVar != null) {
                dVar.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.j();
            }
            og.d dVar2 = this.j0;
            if (dVar2 != null) {
                dVar2.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.j();
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
            String str2 = this.o0;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
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
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.o0);
                        arrayList3.add(messageObject);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(n41.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                }
                this.m0.U();
                arrayList.add(n41.t(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    eg.o oVar = new eg.o(this, 2);
                    int i14 = org.telegram.ui.Cells.d7.a;
                    n41 J = n41.J(org.telegram.ui.Cells.d7.class);
                    J.G = (MessageObject) obj2;
                    J.H = oVar;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(n41.n(4));
                    arrayList.add(n41.n(4));
                    arrayList.add(n41.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    n41 c10 = n41.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.m0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.h0) == null) {
            return;
        }
        this.J0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        ArrayList arrayList = this.I0;
        ArrayList arrayList2 = this.K0;
        eVar.g(gf.m0.a(arrayList, 1, arrayList2), arrayList2);
        eVar.e(this.l0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Y() {
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

    public final void Z() {
        if (this.u0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0, true);
        }
        this.u0 = -1;
        this.p0 = 0;
        this.Y.clear();
        this.r0 = false;
        this.s0 = false;
    }

    public final void a0() {
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
            Y();
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
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new ig.i(this, 6));
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
            this.D0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new j7(this, 1));
            this.m0.N(true);
        }
    }

    public final void b0() {
        if (this.V) {
            return;
        }
        String str = this.t0;
        String str2 = this.o0;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            Z();
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
                MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.p0;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.u0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new cf.a(this, 15));
            this.m0.N(true);
        }
    }

    public final void d0() {
        float f10 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            zk0 zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i10++;
        }
        this.f0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10));
        this.T.a(f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)), true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.m0.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
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

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            fi fiVar = this.g0;
            fiVar.setAlpha(f10);
            fiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
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
        r7 r7Var = this.W;
        if (r7Var != null) {
            r7Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, false, new j7(this, 0), this.resourcesProvider);
        this.m0 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
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
