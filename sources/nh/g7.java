package nh;

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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.x10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g7 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, vd.b {
    public TLRPC.User A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public String E0;
    public int F0;
    public final a7 G0;
    public boolean H0;
    public final ArrayList I0;
    public final RectF J0;
    public final ArrayList K0;
    public final vd.a T;
    public final int U;
    public boolean V;
    public final g7 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final MessagesController.SavedMusicList a0;
    public final Utilities.Callback b0;
    public MessageObject c0;
    public boolean d0;
    public boolean e0;
    public final FrameLayout f0;
    public final mi g0;
    public final lg.e h0;
    public final qg.d i0;
    public final qg.d j0;
    public final lg.a k0;
    public final ih.o2 l0;
    public k51 m0;
    public MessageObject n0;
    public String o0;
    public int p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public String t0;
    public int u0;
    public final a7 v0;
    public String w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Type inference failed for: r2v2, types: [nh.a7] */
    /* JADX WARN: Type inference failed for: r2v4, types: [nh.a7] */
    public g7(Context context, boolean z10, g7 g7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, 2, c6Var);
        jr jrVar = jr.h;
        this.T = new vd.a(0, this, jrVar, 380L, false);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.u0 = -1;
        final int i10 = 0;
        this.v0 = new Runnable(this) { // from class: nh.a7
            public final /* synthetic */ g7 b;

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
                        g7.S(this.b);
                        break;
                }
            }
        };
        this.D0 = -1;
        this.F0 = -2000000000;
        final int i11 = 1;
        this.G0 = new Runnable(this) { // from class: nh.a7
            public final /* synthetic */ g7 b;

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
                        g7.S(this.b);
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
        this.W = g7Var;
        this.b0 = callback;
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.h0 = new lg.e(false);
            qg.d dVar = new qg.d(null);
            this.j0 = dVar;
            dVar.i(new b7(this));
            qg.d dVar2 = new qg.d(null);
            this.i0 = dVar2;
            dVar2.i(new c7(this));
            lg.a aVar = new lg.a(dVar);
            this.k0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.h0 = null;
            this.i0 = null;
            this.j0 = null;
            this.k0 = new lg.a(cVar);
        }
        this.l0 = new ih.o2(this, 1);
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        mi miVar = new mi(context, i12, c6Var);
        this.g0 = miVar;
        miVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f0 = frameLayout;
        x10 x10Var = new x10(context, c6Var);
        x10Var.r.setOnFocusChangeListener(new d7(this));
        x10Var.w = true;
        x10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        x10Var.e();
        x10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        x10Var.r.addTextChangedListener(new e7(this));
        x10Var.r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(miVar, i7.f6.g());
        frameLayout.addView(x10Var, i7.f6.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        x10Var.setupBlurredBackground(this.k0.c(x10Var, pg.a.m(c6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, i7.f6.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i12));
        jl0 jl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i13, 0, i13, 0);
        this.d.p1();
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(jrVar);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        if (z10) {
            this.a0 = null;
            if (this.V && !this.H0) {
                this.H0 = true;
                final int i14 = 2;
                Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: nh.a7
                    public final /* synthetic */ g7 b;

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
                                g7.S(this.b);
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
        this.d.setOnScrollListener(new f7(this));
        this.d.setOnItemClickListener(new lh.d0(this, callback, c6Var, 1));
    }

    public static /* synthetic */ void P(g7 g7Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = g7Var.Z;
        boolean z10 = false;
        g7Var.y0 = false;
        g7Var.z0 = false;
        if (messages_botresults == null) {
            g7Var.m0.N(true);
            return;
        }
        MessagesController.getInstance(g7Var.currentAccount).putUsers(messages_botresults.users, false);
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
                    int i11 = g7Var.F0;
                    g7Var.F0 = i11 - 1;
                    tL_message.id = i11;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(g7Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(g7Var.currentAccount, tL_message, false, true));
                }
            }
        }
        g7Var.w0 = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(g7Var.w0)) {
            z10 = true;
        }
        g7Var.x0 = z10;
        g7Var.m0.N(true);
    }

    public static void Q(g7 g7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        if (!(view instanceof org.telegram.ui.Cells.f7)) {
            w41 G = g7Var.m0.G(i10 - 1);
            if (G != null && G.d == 1) {
                new g7(g7Var.getContext(), true, g7Var, callback, c6Var).show();
                return;
            }
            if (G != null && G.d == 2) {
                g7Var.a0.load();
                return;
            }
            if (G != null && G.d == 3) {
                g7Var.b0();
                return;
            } else {
                if (G == null || G.d != 4) {
                    return;
                }
                g7Var.a0();
                return;
            }
        }
        MessageObject message = ((org.telegram.ui.Cells.f7) view).getMessage();
        if (message == null) {
            return;
        }
        DownloadController.getInstance(g7Var.currentAccount).removeLoadingFileObserver(g7Var);
        if (g7Var.c0 != null) {
            FileLoader.getInstance(g7Var.currentAccount).cancelLoadFile(g7Var.c0.getDocument());
            g7Var.c0 = null;
        }
        if (message.attachPathExists || message.mediaExists) {
            g7Var.b0.run(message);
            g7 g7Var2 = g7Var.W;
            if (g7Var2 != null) {
                g7Var2.dismiss();
            }
            g7Var.dismiss();
            return;
        }
        String fileName = message.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        g7Var.c0 = message;
        DownloadController.getInstance(g7Var.currentAccount).addLoadingFileObserver(fileName, message, g7Var);
        FileLoader.getInstance(g7Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
    }

    public static /* synthetic */ void R(g7 g7Var, TLObject tLObject) {
        ArrayList arrayList = g7Var.Y;
        boolean z10 = false;
        g7Var.s0 = false;
        g7Var.r0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(g7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(g7Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(g7Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            g7Var.q0 = z10;
            g7Var.p0 = messages_messages.next_rate;
        } else {
            g7Var.q0 = false;
            g7Var.p0 = 0;
        }
        g7Var.m0.N(true);
    }

    public static /* synthetic */ void S(g7 g7Var) {
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
                    long clientUserId = UserConfig.getInstance(g7Var.currentAccount).getClientUserId();
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
                    MessageObject messageObject = new MessageObject(g7Var.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i10--;
                } finally {
                }
            }
            query.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new b6(6, g7Var, arrayList));
    }

    public static /* synthetic */ void T(g7 g7Var, Long l10) {
        g7Var.B0 = false;
        TLRPC.User user = l10 == null ? null : MessagesController.getInstance(g7Var.currentAccount).getUser(l10);
        g7Var.A0 = user;
        g7Var.C0 = user == null;
        if (user != null) {
            g7Var.a0();
        }
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.x3.w(" ", str, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        return translitSafe.startsWith(str2) || org.telegram.messenger.x3.w(" ", str2, translitSafe);
    }

    @Override // org.telegram.ui.Components.xa
    public final void H(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.h0 != null) {
            X();
            qg.d dVar = this.i0;
            if (dVar != null) {
                dVar.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.j();
            }
            qg.d dVar2 = this.j0;
            if (dVar2 != null) {
                dVar2.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.j();
            }
        }
        d0();
        super.H(canvas, view);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            mi miVar = this.g0;
            miVar.setAlpha(f9);
            miVar.setVisibility(f9 > 0.0f ? 0 : 4);
        }
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
                    arrayList.add(w41.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                }
                this.m0.U();
                arrayList.add(w41.t(str));
                int size2 = arrayList3.size();
                while (true) {
                    int i14 = 3;
                    if (i12 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    bg.b0 b0Var = new bg.b0(this, i14);
                    int i15 = org.telegram.ui.Cells.e7.a;
                    w41 J = w41.J(org.telegram.ui.Cells.e7.class);
                    J.G = (MessageObject) obj2;
                    J.H = b0Var;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(w41.n(4));
                    arrayList.add(w41.n(4));
                    arrayList.add(w41.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    w41 c3 = w41.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c3.q = true;
                    arrayList.add(c3);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.m0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        lg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.h0) == null) {
            return;
        }
        this.J0.set(0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        ArrayList arrayList = this.I0;
        ArrayList arrayList2 = this.K0;
        eVar.g(jf.l0.a(arrayList, 1, arrayList2), arrayList2);
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
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new kg.i(this, 6));
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
            this.D0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new z6(this, 1));
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
                MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.p0;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.u0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new ef.a(this, 15));
            this.m0.N(true);
        }
    }

    public final void d0() {
        float f9 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            jl0 jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f9) {
                f9 = childAt.getY();
            }
            i10++;
        }
        this.f0.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f9));
        this.T.a(f9 <= ((float) (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)), true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
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
        g7 g7Var = this.W;
        if (g7Var != null) {
            g7Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, false, new z6(this, 0), this.resourcesProvider);
        this.m0 = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
