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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class gj extends ni implements NotificationCenter.NotificationCenterDelegate, le.d {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final MessagesController.SavedMusicList K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public dj O;
    public MessageObject P;
    public final int Q;
    public final int R;
    public final int S;
    public final wi T;
    public int U;
    public int V;
    public String W;
    public boolean a0;
    public final wi b0;
    public int c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final wi g0;
    public boolean h0;
    public TLRPC.User i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public int m0;
    public final le.b n;
    public boolean n0;
    public final FrameLayout r;
    public final ri s;
    public final cj v;
    public final ui w;
    public final js x;
    public final FrameLayout y;

    /* JADX WARN: Type inference failed for: r0v10, types: [org.telegram.ui.Components.wi] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.ui.Components.wi] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.ui.Components.wi] */
    public gj(Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.n = new le.b(0, this, pr.h, 380L, false);
        this.F = -1;
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.Q = 1;
        this.R = 2;
        this.S = 3;
        final int i10 = 0;
        this.T = new Runnable(this) { // from class: org.telegram.ui.Components.wi
            public final /* synthetic */ gj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        cj cjVar = this.b.v;
                        int i11 = -1;
                        boolean canScrollVertically = cjVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < cjVar.getChildCount()) {
                                View childAt = cjVar.getChildAt(i13);
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
                        cjVar.Y2.N(true);
                        if (!canScrollVertically) {
                            cjVar.X2.h1(0, 0);
                            return;
                        } else {
                            if (i11 >= 0) {
                                cjVar.X2.h1(i11, i12 - cjVar.getPaddingTop());
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
                        gj gjVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(gjVar.b.J1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(gjVar.b.J1, tL_message, false, true);
                                    kf.a a2 = kf.a.a(file);
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
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        AndroidUtilities.runOnUIThread(new uc(10, gjVar, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        final int i11 = 1;
        this.b0 = new Runnable(this) { // from class: org.telegram.ui.Components.wi
            public final /* synthetic */ gj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        cj cjVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = cjVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < cjVar.getChildCount()) {
                                View childAt = cjVar.getChildAt(i13);
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
                        cjVar.Y2.N(true);
                        if (!canScrollVertically) {
                            cjVar.X2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                cjVar.X2.h1(i112, i12 - cjVar.getPaddingTop());
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
                        gj gjVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(gjVar.b.J1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(gjVar.b.J1, tL_message, false, true);
                                    kf.a a2 = kf.a.a(file);
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
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        AndroidUtilities.runOnUIThread(new uc(10, gjVar, arrayList));
                        return;
                }
            }
        };
        this.e0 = -1;
        final int i12 = 2;
        this.g0 = new Runnable(this) { // from class: org.telegram.ui.Components.wi
            public final /* synthetic */ gj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        cj cjVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = cjVar.canScrollVertically(-1);
                        int i122 = -1;
                        int i13 = 0;
                        while (true) {
                            if (i13 < cjVar.getChildCount()) {
                                View childAt = cjVar.getChildAt(i13);
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
                        cjVar.Y2.N(true);
                        if (!canScrollVertically) {
                            cjVar.X2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                cjVar.X2.h1(i112, i122 - cjVar.getPaddingTop());
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
                        gj gjVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(gjVar.b.J1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(gjVar.b.J1, tL_message, false, true);
                                    kf.a a2 = kf.a.a(file);
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
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        AndroidUtilities.runOnUIThread(new uc(10, gjVar, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.musicListLoaded);
        this.H = true;
        final int i13 = 3;
        Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: org.telegram.ui.Components.wi
            public final /* synthetic */ gj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        cj cjVar = this.b.v;
                        int i112 = -1;
                        boolean canScrollVertically = cjVar.canScrollVertically(-1);
                        int i122 = -1;
                        int i132 = 0;
                        while (true) {
                            if (i132 < cjVar.getChildCount()) {
                                View childAt = cjVar.getChildAt(i132);
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
                        cjVar.Y2.N(true);
                        if (!canScrollVertically) {
                            cjVar.X2.h1(0, 0);
                            return;
                        } else {
                            if (i112 >= 0) {
                                cjVar.X2.h1(i112, i122 - cjVar.getPaddingTop());
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
                        gj gjVar = this.b;
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
                                    long clientUserId = UserConfig.getInstance(gjVar.b.J1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(gjVar.b.J1, tL_message, false, true);
                                    kf.a a2 = kf.a.a(file);
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
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        AndroidUtilities.runOnUIThread(new uc(10, gjVar, arrayList));
                        return;
                }
            }
        });
        ui uiVar = new ui(context, org.telegram.ui.ActionBar.j6.d6, f6Var);
        this.w = uiVar;
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ri riVar = new ri(context, f6Var, this.b);
        this.s = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        riVar.r.addTextChangedListener(new bj(this));
        riVar.r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(uiVar, w7.x5.g());
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, d);
        js jsVar = new js(context);
        this.x = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        jsVar.setOnAnimatedHeightChangedListener(new uc(11, this, viVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        jsVar.addView(frameLayout2);
        jsVar.i(frameLayout2, true, false);
        FragmentContextView y8Var = new org.telegram.ui.y8(this, context, viVar.f0, frameLayout, f6Var, 1);
        frameLayout2.addView(y8Var);
        jsVar.setCallFragmentContextView(y8Var);
        FrameLayout.LayoutParams d10 = w7.x5.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.w1.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(jsVar, d10);
        cj cjVar = new cj(this, context, viVar.J1, new d(this, 5), new zi(this), new zi(this), f6Var);
        this.v = cjVar;
        cjVar.Y2.r = false;
        cjVar.o1();
        this.c = cjVar;
        this.d = cjVar;
        this.h = true;
        this.f = true;
        cjVar.setClipToPadding(false);
        cjVar.setHorizontalScrollBarEnabled(false);
        cjVar.setVerticalScrollBarEnabled(false);
        addView(cjVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        cjVar.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.a));
        cjVar.setOnScrollListener(new ah.e0(this, 17));
        addView(frameLayout, w7.x5.e(-1, 200, 51));
        cjVar.Y2.N(false);
        L();
        int i14 = this.b.J1;
        this.K = new MessagesController.SavedMusicList(i14, UserConfig.getInstance(i14).getClientUserId());
    }

    public static boolean K(gj gjVar, MessageObject messageObject) {
        gjVar.P = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.w1.l(messageObject), messageObject, 0L);
    }

    @Override // org.telegram.ui.Components.ni
    public final void D(ni niVar) {
        N();
        this.K.load();
        cj cjVar = this.v;
        cjVar.X2.h1(0, 0);
        cjVar.Y2.N(false);
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            ui uiVar = this.w;
            uiVar.setAlpha(f7);
            uiVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void G() {
        this.v.x0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean I(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        HashSet hashSet = this.J;
        if (hashSet.size() == 0 || this.O == null || this.G) {
            return false;
        }
        this.G = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        vi viVar = this.b;
        return e5.b0(viVar.J1, viVar.n1(), viVar.j1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.aj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                gj gjVar = gj.this;
                dj djVar = gjVar.O;
                vi viVar2 = gjVar.b;
                djVar.i(arrayList, viVar2.m1().getText(), z10, i10, i11, j3, z11, ((Long) obj).longValue());
                viVar2.dismiss(true);
            }
        }, 0L);
    }

    public final void L() {
        int i10;
        vi viVar = this.b;
        if (viVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.U / 3.5f);
                    viVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.U / 5) * 2;
            viVar.setAllowNestedScroll(true);
        }
        this.v.setPadding(0, (int) (this.x.c(0.0f) + AndroidUtilities.dp(56.0f) + i10 + AndroidUtilities.statusBarHeight), 0, this.e);
    }

    public final void M(h51 h51Var, View view) {
        if (h51Var != null && h51Var.d == this.S) {
            this.K.load();
            return;
        }
        if (h51Var != null && h51Var.d == this.Q) {
            N();
            return;
        }
        if (h51Var != null && h51Var.d == this.R) {
            O();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) i7Var.getTag();
            vi viVar = this.b;
            viVar.getClass();
            int i10 = 1;
            if (viVar.H) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.O.i(arrayList, viVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    h51Var.e = false;
                    i7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i11 = this.F;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.R = string;
                            b2Var.T = formatString;
                            i2.g.B(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    h51Var.e = true;
                    hashSet.add(audioEntry);
                    i7Var.e(true, true);
                }
            }
            viVar.V1(i10);
        }
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.b0);
        String str = this.E;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.a0) {
                this.a0 = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.c0 = 0;
            this.d0 = false;
        }
        if (!arrayList.isEmpty() && !this.d0) {
            if (this.a0) {
                this.a0 = false;
                P();
                return;
            }
            return;
        }
        int i10 = this.b.J1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.V;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.V = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.E;
        this.W = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) i2.g.h(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.c0;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.a(), new yi(this, messagesController, i10, 1));
        P();
    }

    public final void O() {
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.g0);
        if (TextUtils.isEmpty(this.E) || this.E.length() < 3) {
            if (this.n0) {
                this.n0 = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.f0, this.E);
        ArrayList arrayList = this.N;
        if (!equals) {
            arrayList.clear();
            this.h0 = false;
        }
        int i10 = this.b.J1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.e0;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.e0 = -1;
        }
        String str2 = messagesController.config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.i0 == null) {
            this.i0 = messagesController.getUser(str2);
        }
        if (this.i0 == null) {
            if (this.j0 || this.k0) {
                return;
            }
            this.j0 = true;
            messagesController.getUserNameResolver().resolve(str2, new bi.t2(8, this, messagesController));
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.i0);
        tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
        if (arrayList.isEmpty() || (str = this.l0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.E;
        String str4 = str3 != null ? str3 : "";
        this.f0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new yi(this, messagesController, i10, 0));
        P();
    }

    public final void P() {
        wi wiVar = this.T;
        AndroidUtilities.cancelRunOnUIThread(wiVar);
        AndroidUtilities.runOnUIThread(wiVar);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        cj cjVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.K && cjVar != null) {
                cjVar.Y2.N(true);
                return;
            }
            return;
        }
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            int childCount = cjVar.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = cjVar.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage() != null) {
                        i7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
            int childCount2 = cjVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = cjVar.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) childAt2;
                    if (i7Var2.getMessage() != null) {
                        i7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        cj cjVar = this.v;
        if (cjVar.getChildCount() > 0) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            boolean z10 = false;
            for (int i11 = 0; i11 < cjVar.getChildCount(); i11++) {
                View childAt = cjVar.getChildAt(i11);
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
                le.b bVar = this.n;
                if (dp < 0 || !z10) {
                    bVar.a(true, true);
                    dp = i12;
                } else {
                    bVar.a(false, true);
                }
                this.r.setTranslationY(dp);
                return AndroidUtilities.dp(12.0f) + dp;
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.x.c(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ni
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override // org.telegram.ui.Components.ni
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        cj cjVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.f3, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.g3, null, null, org.telegram.ui.ActionBar.j6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ni
    public final void m() {
        r();
        vi viVar = this.b;
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean n() {
        if (this.P == null || !MediaController.getInstance().isPlayingMessage(this.P)) {
            return false;
        }
        MediaController.getInstance().cleanupPlayer(true, true);
        return false;
    }

    @Override // org.telegram.ui.Components.ni
    public final void q() {
        this.J.clear();
    }

    @Override // org.telegram.ui.Components.ni
    public final void r() {
        if (this.P != null && MediaController.getInstance().isPlayingMessage(this.P)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.P = null;
    }

    public void setDelegate(dj djVar) {
        this.O = djVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.F = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        ri riVar = this.s;
        if (riVar != null) {
            riVar.setupBlurredBackground(bVar.c(riVar, fh.b.n(f6Var), false));
        }
        js jsVar = this.x;
        if (jsVar != null) {
            dh.d c10 = bVar.c(jsVar, fh.b.n(f6Var), false);
            c10.p(AndroidUtilities.dp(24.0f));
            c10.o(AndroidUtilities.dp(7.0f));
            jsVar.setBlurredBackground(c10);
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void y(int i10, int i11) {
        this.U = i11;
        L();
    }

    @Override // org.telegram.ui.Components.ni
    public final void k(float f7) {
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
