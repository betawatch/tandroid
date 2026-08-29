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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yi extends fi implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public String A;
    public int B;
    public boolean C;
    public boolean D;
    public ArrayList E;
    public final HashSet F;
    public final MessagesController.SavedMusicList G;
    public final ArrayList H;
    public final ArrayList I;
    public final ArrayList J;
    public vi K;
    public MessageObject L;
    public final int M;
    public final int N;
    public final int O;
    public final oi P;
    public int Q;
    public int R;
    public String S;
    public boolean T;
    public final oi U;
    public int V;
    public boolean W;
    public int a0;
    public String b0;
    public final oi c0;
    public boolean d0;
    public TLRPC.User e0;
    public boolean f0;
    public boolean g0;
    public String h0;
    public int i0;
    public boolean j0;
    public final vd.a n;
    public final FrameLayout r;
    public final ji s;
    public final ui v;
    public final mi w;
    public final fs x;
    public final FrameLayout y;

    /* JADX WARN: Type inference failed for: r0v10, types: [org.telegram.ui.Components.oi] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.ui.Components.oi] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.ui.Components.oi] */
    public yi(Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        this.n = new vd.a(0, this, jr.h, 380L, false);
        this.B = -1;
        this.E = new ArrayList();
        this.F = new HashSet();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.M = 1;
        this.N = 2;
        this.O = 3;
        final int i10 = 0;
        this.P = new Runnable(this) { // from class: org.telegram.ui.Components.oi
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ui uiVar = this.b.v;
                        int i11 = -1;
                        boolean canScrollVertically = uiVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < uiVar.getChildCount()) {
                                View childAt = uiVar.getChildAt(i13);
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
                        uiVar.U2.N(true);
                        if (!canScrollVertically) {
                            uiVar.T2.h1(0, 0);
                            return;
                        } else {
                            if (i11 >= 0) {
                                uiVar.T2.h1(i11, i12 - uiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.M();
                        return;
                    case 2:
                        this.b.O();
                        return;
                    default:
                        yi yiVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(yiVar.b.F1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(yiVar.b.F1, tL_message, false, true);
                                    ue.a a2 = ue.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f9 = dp;
                                        float min = Math.min(f9 / bitmap.getWidth(), f9 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new z2(13, yiVar, arrayList));
                        return;
                }
            }
        };
        this.R = -1;
        final int i11 = 1;
        this.U = new Runnable(this) { // from class: org.telegram.ui.Components.oi
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ui uiVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = uiVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < uiVar.getChildCount()) {
                                View childAt = uiVar.getChildAt(i13);
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
                        uiVar.U2.N(true);
                        if (!canScrollVertically) {
                            uiVar.T2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                uiVar.T2.h1(i112, i12 - uiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.M();
                        return;
                    case 2:
                        this.b.O();
                        return;
                    default:
                        yi yiVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(yiVar.b.F1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(yiVar.b.F1, tL_message, false, true);
                                    ue.a a2 = ue.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f9 = dp;
                                        float min = Math.min(f9 / bitmap.getWidth(), f9 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new z2(13, yiVar, arrayList));
                        return;
                }
            }
        };
        this.a0 = -1;
        final int i12 = 2;
        this.c0 = new Runnable(this) { // from class: org.telegram.ui.Components.oi
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        ui uiVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = uiVar.canScrollVertically(-1);
                        int i122 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < uiVar.getChildCount()) {
                                View childAt = uiVar.getChildAt(i13);
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
                        uiVar.U2.N(true);
                        if (!canScrollVertically) {
                            uiVar.T2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                uiVar.T2.h1(i112, i122 - uiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.M();
                        return;
                    case 2:
                        this.b.O();
                        return;
                    default:
                        yi yiVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(yiVar.b.F1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(yiVar.b.F1, tL_message, false, true);
                                    ue.a a2 = ue.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f9 = dp;
                                        float min = Math.min(f9 / bitmap.getWidth(), f9 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new z2(13, yiVar, arrayList));
                        return;
                }
            }
        };
        this.i0 = -1000000000;
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.musicListLoaded);
        this.D = true;
        final int i13 = 3;
        Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: org.telegram.ui.Components.oi
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        ui uiVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = uiVar.canScrollVertically(-1);
                        int i122 = -1;
                        int i132 = 0;
                        while (true) {
                            if (i132 < uiVar.getChildCount()) {
                                View childAt = uiVar.getChildAt(i132);
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
                        uiVar.U2.N(true);
                        if (!canScrollVertically) {
                            uiVar.T2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                uiVar.T2.h1(i112, i122 - uiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.M();
                        return;
                    case 2:
                        this.b.O();
                        return;
                    default:
                        yi yiVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(yiVar.b.F1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(yiVar.b.F1, tL_message, false, true);
                                    ue.a a2 = ue.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f9 = dp;
                                        float min = Math.min(f9 / bitmap.getWidth(), f9 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new z2(13, yiVar, arrayList));
                        return;
                }
            }
        });
        mi miVar = new mi(context, org.telegram.ui.ActionBar.g6.d6, c6Var);
        this.w = miVar;
        miVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ji jiVar = new ji(context, c6Var, this.b);
        this.s = jiVar;
        jiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        jiVar.r.addTextChangedListener(new ti(this));
        jiVar.r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(miVar, i7.f6.g());
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(jiVar, d);
        fs fsVar = new fs(context);
        this.x = fsVar;
        fsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        fsVar.setOnAnimatedHeightChangedListener(new z2(14, this, niVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        fsVar.addView(frameLayout2);
        fsVar.i(frameLayout2, true, false);
        FragmentContextView v8Var = new org.telegram.ui.v8(this, context, niVar.b0, frameLayout, c6Var, 1);
        frameLayout2.addView(v8Var);
        fsVar.setCallFragmentContextView(v8Var);
        FrameLayout.LayoutParams d10 = i7.f6.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.x3.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(fsVar, d10);
        ui uiVar = new ui(this, context, niVar.F1, new d(this, 5), new ri(this), new ri(this), c6Var);
        this.v = uiVar;
        uiVar.U2.r = false;
        uiVar.p1();
        this.c = uiVar;
        this.d = uiVar;
        this.h = true;
        this.f = true;
        uiVar.setClipToPadding(false);
        uiVar.setHorizontalScrollBarEnabled(false);
        uiVar.setVerticalScrollBarEnabled(false);
        addView(uiVar, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        uiVar.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, this.a));
        uiVar.setOnScrollListener(new cg.g2(this, 19));
        addView(frameLayout, i7.f6.e(-1, 200, 51));
        uiVar.U2.N(false);
        K();
        int i14 = this.b.F1;
        this.G = new MessagesController.SavedMusicList(i14, UserConfig.getInstance(i14).getClientUserId());
    }

    public static boolean J(yi yiVar, MessageObject messageObject) {
        yiVar.L = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.x3.n(messageObject), messageObject, 0L);
    }

    @Override // org.telegram.ui.Components.fi
    public final void D(fi fiVar) {
        M();
        this.G.load();
        ui uiVar = this.v;
        uiVar.T2.h1(0, 0);
        uiVar.U2.N(false);
    }

    @Override // org.telegram.ui.Components.fi
    public final void F() {
        this.v.x0(0);
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean H(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        HashSet hashSet = this.F;
        if (hashSet.size() == 0 || this.K == null || this.C) {
            return false;
        }
        this.C = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        ni niVar = this.b;
        return c5.b0(niVar.F1, niVar.n1(), niVar.j1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.si
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                yi yiVar = yi.this;
                vi viVar = yiVar.K;
                ni niVar2 = yiVar.b;
                viVar.j(arrayList, niVar2.m1().getText(), z10, i10, i11, j10, z11, ((Long) obj).longValue());
                niVar2.dismiss(true);
            }
        }, 0L);
    }

    public final void K() {
        int i10;
        ni niVar = this.b;
        if (niVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            niVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.Q / 3.5f);
                    niVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.Q / 5) * 2;
            niVar.setAllowNestedScroll(true);
        }
        this.v.setPadding(0, (int) (this.x.c(0.0f) + AndroidUtilities.dp(56.0f) + i10 + AndroidUtilities.statusBarHeight), 0, this.e);
    }

    public final void L(w41 w41Var, View view) {
        if (w41Var != null && w41Var.d == this.O) {
            this.G.load();
            return;
        }
        if (w41Var != null && w41Var.d == this.M) {
            M();
            return;
        }
        if (w41Var != null && w41Var.d == this.N) {
            O();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) f7Var.getTag();
            ni niVar = this.b;
            niVar.getClass();
            int i10 = 1;
            if (niVar.D) {
                this.C = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.K.j(arrayList, niVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.F;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    w41Var.e = false;
                    f7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.B >= 0) {
                        int size = hashSet.size();
                        int i11 = this.B;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.N = string;
                            c2Var.P = formatString;
                            j7.l1.C(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    w41Var.e = true;
                    hashSet.add(audioEntry);
                    f7Var.e(true, true);
                }
            }
            niVar.V1(i10);
        }
    }

    public final void M() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
        String str = this.A;
        if (str != null && str.length() > 0 && this.A.length() < 3) {
            if (this.T) {
                this.T = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.S, this.A);
        ArrayList arrayList = this.I;
        if (!equals) {
            arrayList.clear();
            this.V = 0;
            this.W = false;
        }
        if (!arrayList.isEmpty() && !this.W) {
            if (this.T) {
                this.T = false;
                P();
                return;
            }
            return;
        }
        int i10 = this.b.F1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.R;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.R = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.A;
        this.S = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) j7.l1.i(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.V;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.R = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.a(), new qi(this, messagesController, i10, 1));
        P();
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            mi miVar = this.w;
            miVar.setAlpha(f9);
            miVar.setVisibility(f9 > 0.0f ? 0 : 4);
        }
    }

    public final void O() {
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.c0);
        if (TextUtils.isEmpty(this.A) || this.A.length() < 3) {
            if (this.j0) {
                this.j0 = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.b0, this.A);
        ArrayList arrayList = this.J;
        if (!equals) {
            arrayList.clear();
            this.d0 = false;
        }
        int i10 = this.b.F1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.a0;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.a0 = -1;
        }
        String str2 = messagesController.config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = messagesController.getUser(str2);
        }
        if (this.e0 == null) {
            if (this.f0 || this.g0) {
                return;
            }
            this.f0 = true;
            messagesController.getUserNameResolver().resolve(str2, new lh.y1(6, this, messagesController));
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.e0);
        tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
        if (arrayList.isEmpty() || (str = this.h0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.A;
        String str4 = str3 != null ? str3 : "";
        this.b0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.a0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new qi(this, messagesController, i10, 0));
        P();
    }

    public final void P() {
        oi oiVar = this.P;
        AndroidUtilities.cancelRunOnUIThread(oiVar);
        AndroidUtilities.runOnUIThread(oiVar);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        ui uiVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.G && uiVar != null) {
                uiVar.U2.N(true);
                return;
            }
            return;
        }
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            int childCount = uiVar.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = uiVar.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                    if (f7Var.getMessage() != null) {
                        f7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
            int childCount2 = uiVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = uiVar.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                    if (f7Var2.getMessage() != null) {
                        f7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        ui uiVar = this.v;
        if (uiVar.getChildCount() > 0) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            boolean z10 = false;
            for (int i11 = 0; i11 < uiVar.getChildCount(); i11++) {
                View childAt = uiVar.getChildAt(i11);
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
                vd.a aVar = this.n;
                if (dp < 0 || !z10) {
                    aVar.a(true, true);
                    dp = i12;
                } else {
                    aVar.a(false, true);
                }
                this.r.setTranslationY(dp);
                return AndroidUtilities.dp(12.0f) + dp;
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
    public int getListTopPadding() {
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.x.c(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.fi
    public int getSelectedItemsCount() {
        return this.F.size();
    }

    @Override // org.telegram.ui.Components.fi
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        ui uiVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f3, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.g3, null, null, org.telegram.ui.ActionBar.g6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.fi
    public final void m() {
        r();
        ni niVar = this.b;
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean n() {
        if (this.L == null || !MediaController.getInstance().isPlayingMessage(this.L)) {
            return false;
        }
        MediaController.getInstance().cleanupPlayer(true, true);
        return false;
    }

    @Override // org.telegram.ui.Components.fi
    public final void q() {
        this.F.clear();
    }

    @Override // org.telegram.ui.Components.fi
    public final void r() {
        if (this.L != null && MediaController.getInstance().isPlayingMessage(this.L)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.L = null;
    }

    public void setDelegate(vi viVar) {
        this.K = viVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.B = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(lg.a aVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        ji jiVar = this.s;
        if (jiVar != null) {
            jiVar.setupBlurredBackground(aVar.c(jiVar, pg.a.m(c6Var), false));
        }
        fs fsVar = this.x;
        if (fsVar != null) {
            ng.d c3 = aVar.c(fsVar, pg.a.m(c6Var), false);
            c3.p(AndroidUtilities.dp(24.0f));
            c3.o(AndroidUtilities.dp(7.0f));
            fsVar.setBlurredBackground(c3);
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final void y(int i10, int i11) {
        this.Q = i11;
        K();
    }

    @Override // org.telegram.ui.Components.fi
    public final void k(float f9) {
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
