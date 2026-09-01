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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xi extends ei implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public String B;
    public int C;
    public boolean D;
    public boolean E;
    public ArrayList F;
    public final HashSet G;
    public final MessagesController.SavedMusicList H;
    public final ArrayList I;
    public final ArrayList J;
    public final ArrayList K;
    public ui L;
    public MessageObject M;
    public final int N;
    public final int O;
    public final int P;
    public final ni Q;
    public int R;
    public int S;
    public String T;
    public boolean U;
    public final ni V;
    public int W;
    public boolean a0;
    public int b0;
    public String c0;
    public final ni d0;
    public boolean e0;
    public TLRPC.User f0;
    public boolean g0;
    public boolean h0;
    public String i0;
    public int j0;
    public boolean k0;
    public final xd.a n;
    public final FrameLayout r;
    public final ii s;
    public final ti v;
    public final li w;
    public final ls x;
    public final FrameLayout y;

    /* JADX WARN: Type inference failed for: r0v10, types: [org.telegram.ui.Components.ni] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.ui.Components.ni] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.ui.Components.ni] */
    public xi(Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        this.n = new xd.a(0, this, pr.h, 380L, false);
        this.C = -1;
        this.F = new ArrayList();
        this.G = new HashSet();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.N = 1;
        this.O = 2;
        this.P = 3;
        final int i10 = 0;
        this.Q = new Runnable(this) { // from class: org.telegram.ui.Components.ni
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ti tiVar = this.b.v;
                        int i11 = -1;
                        boolean canScrollVertically = tiVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < tiVar.getChildCount()) {
                                View childAt = tiVar.getChildAt(i13);
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
                        tiVar.V2.N(true);
                        if (!canScrollVertically) {
                            tiVar.U2.h1(0, 0);
                            return;
                        } else {
                            if (i11 >= 0) {
                                tiVar.U2.h1(i11, i12 - tiVar.getPaddingTop());
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
                        xi xiVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(xiVar.b.G1).getClientUserId();
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
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (fileExtension.length() <= 0) {
                                        fileExtension = "mp3";
                                    }
                                    sb.append(fileExtension);
                                    document.mime_type = sb.toString();
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
                                    audioEntry.messageObject = new MessageObject(xiVar.b.G1, tL_message, false, true);
                                    we.a a2 = we.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f10 = dp;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(21, xiVar, arrayList));
                        return;
                }
            }
        };
        this.S = -1;
        final int i11 = 1;
        this.V = new Runnable(this) { // from class: org.telegram.ui.Components.ni
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ti tiVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = tiVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < tiVar.getChildCount()) {
                                View childAt = tiVar.getChildAt(i13);
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
                        tiVar.V2.N(true);
                        if (!canScrollVertically) {
                            tiVar.U2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                tiVar.U2.h1(i112, i12 - tiVar.getPaddingTop());
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
                        xi xiVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(xiVar.b.G1).getClientUserId();
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
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (fileExtension.length() <= 0) {
                                        fileExtension = "mp3";
                                    }
                                    sb.append(fileExtension);
                                    document.mime_type = sb.toString();
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
                                    audioEntry.messageObject = new MessageObject(xiVar.b.G1, tL_message, false, true);
                                    we.a a2 = we.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f10 = dp;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(21, xiVar, arrayList));
                        return;
                }
            }
        };
        this.b0 = -1;
        final int i12 = 2;
        this.d0 = new Runnable(this) { // from class: org.telegram.ui.Components.ni
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        ti tiVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = tiVar.canScrollVertically(-1);
                        int i122 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < tiVar.getChildCount()) {
                                View childAt = tiVar.getChildAt(i13);
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
                        tiVar.V2.N(true);
                        if (!canScrollVertically) {
                            tiVar.U2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                tiVar.U2.h1(i112, i122 - tiVar.getPaddingTop());
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
                        xi xiVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(xiVar.b.G1).getClientUserId();
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
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (fileExtension.length() <= 0) {
                                        fileExtension = "mp3";
                                    }
                                    sb.append(fileExtension);
                                    document.mime_type = sb.toString();
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
                                    audioEntry.messageObject = new MessageObject(xiVar.b.G1, tL_message, false, true);
                                    we.a a2 = we.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f10 = dp;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(21, xiVar, arrayList));
                        return;
                }
            }
        };
        this.j0 = -1000000000;
        NotificationCenter.getInstance(this.b.G1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.b.G1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.b.G1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.b.G1).addObserver(this, NotificationCenter.musicListLoaded);
        this.E = true;
        final int i13 = 3;
        Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: org.telegram.ui.Components.ni
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        ti tiVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = tiVar.canScrollVertically(-1);
                        int i122 = -1;
                        int i132 = 0;
                        while (true) {
                            if (i132 < tiVar.getChildCount()) {
                                View childAt = tiVar.getChildAt(i132);
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
                        tiVar.V2.N(true);
                        if (!canScrollVertically) {
                            tiVar.U2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                tiVar.U2.h1(i112, i122 - tiVar.getPaddingTop());
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
                        xi xiVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(xiVar.b.G1).getClientUserId();
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
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (fileExtension.length() <= 0) {
                                        fileExtension = "mp3";
                                    }
                                    sb.append(fileExtension);
                                    document.mime_type = sb.toString();
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
                                    audioEntry.messageObject = new MessageObject(xiVar.b.G1, tL_message, false, true);
                                    we.a a2 = we.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int dp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                        float f10 = dp;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(21, xiVar, arrayList));
                        return;
                }
            }
        });
        li liVar = new li(context, org.telegram.ui.ActionBar.k6.d6, g6Var);
        this.w = liVar;
        liVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ii iiVar = new ii(context, g6Var, this.b);
        this.s = iiVar;
        iiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        iiVar.r.addTextChangedListener(new si(this));
        iiVar.r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(liVar, k7.c6.g());
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(iiVar, d);
        ls lsVar = new ls(context);
        this.x = lsVar;
        lsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        lsVar.setOnAnimatedHeightChangedListener(new org.telegram.ui.mp(22, this, miVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        lsVar.addView(frameLayout2);
        lsVar.i(frameLayout2, true, false);
        FragmentContextView z8Var = new org.telegram.ui.z8(this, context, miVar.c0, frameLayout, g6Var, 1);
        frameLayout2.addView(z8Var);
        lsVar.setCallFragmentContextView(z8Var);
        FrameLayout.LayoutParams d10 = k7.c6.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.y3.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(lsVar, d10);
        ti tiVar = new ti(this, context, miVar.G1, new d(this, 5), new qi(this), new qi(this), g6Var);
        this.v = tiVar;
        tiVar.V2.r = false;
        tiVar.p1();
        this.c = tiVar;
        this.d = tiVar;
        this.h = true;
        this.f = true;
        tiVar.setClipToPadding(false);
        tiVar.setHorizontalScrollBarEnabled(false);
        tiVar.setVerticalScrollBarEnabled(false);
        addView(tiVar, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        tiVar.setGlowColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A5, this.a));
        tiVar.setOnScrollListener(new fg.e2(this, 17));
        addView(frameLayout, k7.c6.e(-1, 200, 51));
        tiVar.V2.N(false);
        K();
        int i14 = this.b.G1;
        this.H = new MessagesController.SavedMusicList(i14, UserConfig.getInstance(i14).getClientUserId());
    }

    public static boolean J(xi xiVar, MessageObject messageObject) {
        xiVar.M = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.y3.m(messageObject), messageObject, 0L);
    }

    @Override // org.telegram.ui.Components.ei
    public final void D(ei eiVar) {
        N();
        this.H.load();
        ti tiVar = this.v;
        tiVar.U2.h1(0, 0);
        tiVar.V2.N(false);
    }

    @Override // org.telegram.ui.Components.ei
    public final void F() {
        this.v.x0(0);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean H(final int i10, final boolean z4, final int i11, final boolean z10, final long j10) {
        HashSet hashSet = this.G;
        if (hashSet.size() == 0 || this.L == null || this.D) {
            return false;
        }
        this.D = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        mi miVar = this.b;
        return z4.b0(miVar.G1, miVar.n1(), miVar.j1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.ri
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                xi xiVar = xi.this;
                ui uiVar = xiVar.L;
                mi miVar2 = xiVar.b;
                uiVar.i(arrayList, miVar2.m1().getText(), z4, i10, i11, j10, z10, ((Long) obj).longValue());
                miVar2.dismiss(true);
            }
        }, 0L);
    }

    public final void K() {
        int i10;
        mi miVar = this.b;
        if (miVar.o1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            miVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.R / 3.5f);
                    miVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.R / 5) * 2;
            miVar.setAllowNestedScroll(true);
        }
        this.v.setPadding(0, (int) (this.x.c(0.0f) + AndroidUtilities.dp(56.0f) + i10 + AndroidUtilities.statusBarHeight), 0, this.e);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            li liVar = this.w;
            liVar.setAlpha(f10);
            liVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void M(j51 j51Var, View view) {
        if (j51Var != null && j51Var.d == this.P) {
            this.H.load();
            return;
        }
        if (j51Var != null && j51Var.d == this.N) {
            N();
            return;
        }
        if (j51Var != null && j51Var.d == this.O) {
            O();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) h7Var.getTag();
            mi miVar = this.b;
            miVar.getClass();
            int i10 = 1;
            if (miVar.E) {
                this.D = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.L.i(arrayList, miVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.G;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    j51Var.e = false;
                    h7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.C >= 0) {
                        int size = hashSet.size();
                        int i11 = this.C;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.O = string;
                            d2Var.Q = formatString;
                            l.d.C(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    j51Var.e = true;
                    hashSet.add(audioEntry);
                    h7Var.e(true, true);
                }
            }
            miVar.V1(i10);
        }
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.V);
        String str = this.B;
        if (str != null && str.length() > 0 && this.B.length() < 3) {
            if (this.U) {
                this.U = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.T, this.B);
        ArrayList arrayList = this.J;
        if (!equals) {
            arrayList.clear();
            this.W = 0;
            this.a0 = false;
        }
        if (!arrayList.isEmpty() && !this.a0) {
            if (this.U) {
                this.U = false;
                P();
                return;
            }
            return;
        }
        int i10 = this.b.G1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.S;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.S = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.B;
        this.T = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) l.d.i(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.W;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.S = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.a(), new pi(this, messagesController, i10, 1));
        P();
    }

    public final void O() {
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.d0);
        if (TextUtils.isEmpty(this.B) || this.B.length() < 3) {
            if (this.k0) {
                this.k0 = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.c0, this.B);
        ArrayList arrayList = this.K;
        if (!equals) {
            arrayList.clear();
            this.e0 = false;
        }
        int i10 = this.b.G1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.b0;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.b0 = -1;
        }
        String str2 = messagesController.config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f0 == null) {
            this.f0 = messagesController.getUser(str2);
        }
        if (this.f0 == null) {
            if (this.g0 || this.h0) {
                return;
            }
            this.g0 = true;
            messagesController.getUserNameResolver().resolve(str2, new oh.a2(6, this, messagesController));
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f0);
        tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
        if (arrayList.isEmpty() || (str = this.i0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.B;
        String str4 = str3 != null ? str3 : "";
        this.c0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.b0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new pi(this, messagesController, i10, 0));
        P();
    }

    public final void P() {
        ni niVar = this.Q;
        AndroidUtilities.cancelRunOnUIThread(niVar);
        AndroidUtilities.runOnUIThread(niVar);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        ti tiVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.H && tiVar != null) {
                tiVar.V2.N(true);
                return;
            }
            return;
        }
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            int childCount = tiVar.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = tiVar.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage() != null) {
                        h7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
            int childCount2 = tiVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = tiVar.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                    if (h7Var2.getMessage() != null) {
                        h7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        ti tiVar = this.v;
        if (tiVar.getChildCount() > 0) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            boolean z4 = false;
            for (int i11 = 0; i11 < tiVar.getChildCount(); i11++) {
                View childAt = tiVar.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z4 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int dp = (((i10 - AndroidUtilities.dp(56.0f)) - ((int) this.x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                int i12 = (dp <= 0 || !z4) ? 0 : dp;
                xd.a aVar = this.n;
                if (dp < 0 || !z4) {
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

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.x.c(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ei
    public int getSelectedItemsCount() {
        return this.G.size();
    }

    @Override // org.telegram.ui.Components.ei
    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        ti tiVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f3, null, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.g3, null, null, org.telegram.ui.ActionBar.k6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ei
    public final void m() {
        r();
        mi miVar = this.b;
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean n() {
        if (this.M == null || !MediaController.getInstance().isPlayingMessage(this.M)) {
            return false;
        }
        MediaController.getInstance().cleanupPlayer(true, true);
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public final void q() {
        this.G.clear();
    }

    @Override // org.telegram.ui.Components.ei
    public final void r() {
        if (this.M != null && MediaController.getInstance().isPlayingMessage(this.M)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.M = null;
    }

    public void setDelegate(ui uiVar) {
        this.L = uiVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.C = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(og.a aVar) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        ii iiVar = this.s;
        if (iiVar != null) {
            iiVar.setupBlurredBackground(aVar.c(iiVar, sg.b.m(g6Var), false));
        }
        ls lsVar = this.x;
        if (lsVar != null) {
            qg.b c3 = aVar.c(lsVar, sg.b.m(g6Var), false);
            c3.p(AndroidUtilities.dp(24.0f));
            c3.o(AndroidUtilities.dp(7.0f));
            lsVar.setBlurredBackground(c3);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void y(int i10, int i11) {
        this.R = i11;
        K();
    }

    @Override // org.telegram.ui.Components.ei
    public final void k(float f10) {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
