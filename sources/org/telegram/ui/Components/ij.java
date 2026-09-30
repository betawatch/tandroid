package org.telegram.ui.Components;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ij extends oi implements NotificationCenter.NotificationCenterDelegate, le.e {
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final HashSet I;
    public final MessagesController.SavedMusicList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public fj N;
    public MessageObject O;
    public final int P;
    public final int Q;
    public final int R;
    public final xi S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final xi a0;
    public int b0;
    public boolean c0;
    public int d0;
    public String e0;
    public final xi f0;
    public boolean g0;
    public TLRPC.User h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public int l0;
    public boolean m0;
    public final le.c n;
    public final FrameLayout r;
    public final si s;
    public final ej v;
    public final vi w;
    public final ms x;
    public String y;

    /* JADX WARN: Type inference failed for: r0v10, types: [org.telegram.ui.Components.xi] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.ui.Components.xi] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.ui.Components.xi] */
    public ij(Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        ViewGroup viewGroup;
        this.n = new le.c(0, this, sr.h, 380L, false);
        this.E = -1;
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.P = 1;
        this.Q = 2;
        this.R = 3;
        final int i10 = 0;
        this.S = new Runnable(this) { // from class: org.telegram.ui.Components.xi
            public final /* synthetic */ ij b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ej ejVar = this.b.v;
                        int i11 = -1;
                        boolean canScrollVertically = ejVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < ejVar.getChildCount()) {
                                View childAt = ejVar.getChildAt(i13);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i12 = top;
                                    i11 = R;
                                } else {
                                    i13++;
                                    i12 = top;
                                    i11 = R;
                                }
                            }
                        }
                        ejVar.Y2.N(true);
                        if (!canScrollVertically) {
                            ejVar.X2.h1(0, 0);
                            return;
                        } else {
                            if (i11 >= 0) {
                                ejVar.X2.h1(i11, i12 - ejVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.N();
                        return;
                    case 2:
                        this.b.O();
                        return;
                    default:
                        ij ijVar = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i14 = -2000000000;
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
                                    tL_message.id = i14;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(ijVar.b.J1).getClientUserId();
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
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    audioEntry.messageObject = new MessageObject(ijVar.b.J1, tL_message, false, true);
                                    jf.a a2 = jf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f7 = dp;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new uc(10, ijVar, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        final int i11 = 1;
        this.a0 = new Runnable(this) { // from class: org.telegram.ui.Components.xi
            public final /* synthetic */ ij b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ej ejVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = ejVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < ejVar.getChildCount()) {
                                View childAt = ejVar.getChildAt(i13);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i12 = top;
                                    i112 = R;
                                } else {
                                    i13++;
                                    i12 = top;
                                    i112 = R;
                                }
                            }
                        }
                        ejVar.Y2.N(true);
                        if (!canScrollVertically) {
                            ejVar.X2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                ejVar.X2.h1(i112, i12 - ejVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.N();
                        return;
                    case 2:
                        this.b.O();
                        return;
                    default:
                        ij ijVar = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i14 = -2000000000;
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
                                    tL_message.id = i14;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(ijVar.b.J1).getClientUserId();
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
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    audioEntry.messageObject = new MessageObject(ijVar.b.J1, tL_message, false, true);
                                    jf.a a2 = jf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f7 = dp;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new uc(10, ijVar, arrayList));
                        return;
                }
            }
        };
        this.d0 = -1;
        final int i12 = 2;
        this.f0 = new Runnable(this) { // from class: org.telegram.ui.Components.xi
            public final /* synthetic */ ij b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        ej ejVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = ejVar.canScrollVertically(-1);
                        int i122 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < ejVar.getChildCount()) {
                                View childAt = ejVar.getChildAt(i13);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i122 = top;
                                    i112 = R;
                                } else {
                                    i13++;
                                    i122 = top;
                                    i112 = R;
                                }
                            }
                        }
                        ejVar.Y2.N(true);
                        if (!canScrollVertically) {
                            ejVar.X2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                ejVar.X2.h1(i112, i122 - ejVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.N();
                        return;
                    case 2:
                        this.b.O();
                        return;
                    default:
                        ij ijVar = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i14 = -2000000000;
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
                                    tL_message.id = i14;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(ijVar.b.J1).getClientUserId();
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
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    audioEntry.messageObject = new MessageObject(ijVar.b.J1, tL_message, false, true);
                                    jf.a a2 = jf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f7 = dp;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new uc(10, ijVar, arrayList));
                        return;
                }
            }
        };
        this.l0 = -1000000000;
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.musicListLoaded);
        this.G = true;
        final int i13 = 3;
        Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: org.telegram.ui.Components.xi
            public final /* synthetic */ ij b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        ej ejVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = ejVar.canScrollVertically(-1);
                        int i122 = -1;
                        int i132 = 0;
                        while (true) {
                            if (i132 < ejVar.getChildCount()) {
                                View childAt = ejVar.getChildAt(i132);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i122 = top;
                                    i112 = R;
                                } else {
                                    i132++;
                                    i122 = top;
                                    i112 = R;
                                }
                            }
                        }
                        ejVar.Y2.N(true);
                        if (!canScrollVertically) {
                            ejVar.X2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                ejVar.X2.h1(i112, i122 - ejVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.N();
                        return;
                    case 2:
                        this.b.O();
                        return;
                    default:
                        ij ijVar = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i14 = -2000000000;
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
                                    tL_message.id = i14;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(ijVar.b.J1).getClientUserId();
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
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    audioEntry.messageObject = new MessageObject(ijVar.b.J1, tL_message, false, true);
                                    jf.a a2 = jf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f7 = dp;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new uc(10, ijVar, arrayList));
                        return;
                }
            }
        });
        vi viVar = new vi(context, org.telegram.ui.ActionBar.h6.d6, d6Var);
        this.w = viVar;
        viVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        si siVar = new si(context, d6Var, this.b);
        this.s = siVar;
        siVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        siVar.r.addTextChangedListener(new cj(this));
        siVar.r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(viVar, w7.y5.g());
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(siVar, d);
        ms msVar = new ms(context);
        this.x = msVar;
        msVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        msVar.setOnAnimatedHeightChangedListener(new uc(11, this, wiVar));
        if (wiVar.f0 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            msVar.addView(frameLayout2);
            msVar.i(frameLayout2, true, false);
            FragmentContextView djVar = new dj(this, context, wiVar.f0, frameLayout, d6Var, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(djVar);
            msVar.setCallFragmentContextView(djVar);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d10 = w7.y5.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.f0.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        viewGroup.addView(msVar, d10);
        ej ejVar = new ej(this, context, wiVar.J1, new d(this, 5), new aj(this), new aj(this), d6Var);
        this.v = ejVar;
        ejVar.Y2.r = false;
        ejVar.p1();
        this.c = ejVar;
        this.d = ejVar;
        this.h = true;
        this.f = true;
        ejVar.setClipToPadding(false);
        ejVar.setHorizontalScrollBarEnabled(false);
        ejVar.setVerticalScrollBarEnabled(false);
        addView(ejVar, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ejVar.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, this.a));
        ejVar.setOnScrollListener(new ai.r(this, 16));
        addView(viewGroup, w7.y5.e(-1, 200, 51));
        ejVar.Y2.N(false);
        L();
        int i14 = this.b.J1;
        this.J = new MessagesController.SavedMusicList(i14, UserConfig.getInstance(i14).getClientUserId());
    }

    public static boolean K(ij ijVar, MessageObject messageObject) {
        ijVar.O = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.f0.k(messageObject), messageObject, 0L);
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            vi viVar = this.w;
            viVar.setAlpha(f7);
            viVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.oi
    public final void E(oi oiVar) {
        N();
        this.J.load();
        ej ejVar = this.v;
        ejVar.X2.h1(0, 0);
        ejVar.Y2.N(false);
    }

    @Override // org.telegram.ui.Components.oi
    public final void G() {
        this.v.x0(0);
    }

    @Override // org.telegram.ui.Components.oi
    public final boolean I(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        HashSet hashSet = this.I;
        if (hashSet.size() == 0 || this.N == null || this.F) {
            return false;
        }
        this.F = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        wi wiVar = this.b;
        return e5.b0(wiVar.J1, wiVar.n1(), wiVar.j1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.bj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ij ijVar = ij.this;
                fj fjVar = ijVar.N;
                wi wiVar2 = ijVar.b;
                fjVar.h(arrayList, wiVar2.m1().getText(), z10, i10, i11, j3, z11, ((Long) obj).longValue());
                wiVar2.dismiss(true);
            }
        }, 0L);
    }

    public final void L() {
        int i10;
        wi wiVar = this.b;
        if (wiVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            wiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.T / 3.5f);
                    wiVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.T / 5) * 2;
            wiVar.setAllowNestedScroll(true);
        }
        this.v.setPadding(0, (int) (this.x.c(0.0f) + AndroidUtilities.dp(56.0f) + i10 + AndroidUtilities.statusBarHeight), 0, this.e);
    }

    public final void M(x51 x51Var, View view) {
        if (x51Var != null && x51Var.d == this.R) {
            this.J.load();
            return;
        }
        if (x51Var != null && x51Var.d == this.P) {
            N();
            return;
        }
        if (x51Var != null && x51Var.d == this.Q) {
            O();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) j7Var.getTag();
            wi wiVar = this.b;
            wiVar.getClass();
            int i10 = 1;
            if (wiVar.H) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.N.h(arrayList, wiVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    x51Var.e = false;
                    j7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i11 = this.E;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.R = string;
                            a2Var.T = formatString;
                            org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    x51Var.e = true;
                    hashSet.add(audioEntry);
                    j7Var.e(true, true);
                }
            }
            wiVar.V1(i10);
        }
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.a0);
        String str = this.y;
        if (str != null && str.length() > 0 && this.y.length() < 3) {
            if (this.W) {
                this.W = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.V, this.y);
        ArrayList arrayList = this.L;
        if (!equals) {
            arrayList.clear();
            this.b0 = 0;
            this.c0 = false;
        }
        if (!arrayList.isEmpty() && !this.c0) {
            if (this.W) {
                this.W = false;
                P();
                return;
            }
            return;
        }
        int i10 = this.b.J1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.U;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.U = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.y;
        this.V = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) hg.c.g(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.b0;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.a(), new zi(this, messagesController, i10, 1));
        P();
    }

    public final void O() {
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f0);
        if (TextUtils.isEmpty(this.y) || this.y.length() < 3) {
            if (this.m0) {
                this.m0 = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.e0, this.y);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.g0 = false;
        }
        int i10 = this.b.J1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.d0;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.d0 = -1;
        }
        String str2 = messagesController.config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.h0 == null) {
            this.h0 = messagesController.getUser(str2);
        }
        if (this.h0 == null) {
            if (this.i0 || this.j0) {
                return;
            }
            this.i0 = true;
            messagesController.getUserNameResolver().resolve(str2, new org.telegram.ui.oc(19, this, messagesController));
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.h0);
        tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
        if (arrayList.isEmpty() || (str = this.k0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.y;
        String str4 = str3 != null ? str3 : "";
        this.e0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new zi(this, messagesController, i10, 0));
        P();
    }

    public final void P() {
        xi xiVar = this.S;
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        AndroidUtilities.runOnUIThread(xiVar);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        ej ejVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.J && ejVar != null) {
                ejVar.Y2.N(true);
                return;
            }
            return;
        }
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            int childCount = ejVar.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = ejVar.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage() != null) {
                        j7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
            int childCount2 = ejVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = ejVar.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) childAt2;
                    if (j7Var2.getMessage() != null) {
                        j7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.oi
    public int getCurrentItemTop() {
        ej ejVar = this.v;
        if (ejVar.getChildCount() > 0) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            boolean z10 = false;
            for (int i11 = 0; i11 < ejVar.getChildCount(); i11++) {
                View childAt = ejVar.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int dp = (((i10 - AndroidUtilities.dp(56.0f)) - ((int) this.x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                int i12 = (dp <= 0 || !z10) ? 0 : dp;
                le.c cVar = this.n;
                if (dp < 0 || !z10) {
                    cVar.a(true, true);
                    dp = i12;
                } else {
                    cVar.a(false, true);
                }
                this.r.setTranslationY(dp);
                return AndroidUtilities.dp(12.0f) + dp;
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // org.telegram.ui.Components.oi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.oi
    public int getListTopPadding() {
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.x.c(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.oi
    public int getSelectedItemsCount() {
        return this.I.size();
    }

    @Override // org.telegram.ui.Components.oi
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ej ejVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ejVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ejVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ejVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ejVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ejVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ejVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f3, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ejVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.g3, null, null, org.telegram.ui.ActionBar.h6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.oi
    public final void m() {
        r();
        wi wiVar = this.b;
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override // org.telegram.ui.Components.oi
    public final boolean n() {
        if (this.O == null || !MediaController.getInstance().isPlayingMessage(this.O)) {
            return false;
        }
        MediaController.getInstance().cleanupPlayer(true, true);
        return false;
    }

    @Override // org.telegram.ui.Components.oi
    public final void q() {
        this.I.clear();
    }

    @Override // org.telegram.ui.Components.oi
    public final void r() {
        if (this.O != null && MediaController.getInstance().isPlayingMessage(this.O)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.O = null;
    }

    public void setDelegate(fj fjVar) {
        this.N = fjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.E = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        si siVar = this.s;
        if (siVar != null) {
            siVar.setupBlurredBackground(cVar.c(siVar, eh.b.n(d6Var), false));
        }
        ms msVar = this.x;
        if (msVar != null) {
            ch.d c10 = cVar.c(msVar, eh.b.n(d6Var), false);
            c10.q(AndroidUtilities.dp(24.0f));
            c10.p(AndroidUtilities.dp(7.0f));
            msVar.setBlurredBackground(c10);
        }
    }

    @Override // org.telegram.ui.Components.oi
    public final void y(int i10, int i11) {
        this.T = i11;
        L();
    }

    @Override // org.telegram.ui.Components.oi
    public final void k(float f7) {
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
