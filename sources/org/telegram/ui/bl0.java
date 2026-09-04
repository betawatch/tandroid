package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bl0 extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.fk, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public zk0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.co K;
    public long L;
    public int M;
    public zk0 N;
    public org.telegram.ui.Components.vi O;
    public Ringtone P;
    public long Q;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public NumberTextView d;
    public org.telegram.ui.Components.ll0 e;
    public yk0 f;
    public final org.telegram.ui.ActionBar.f6 h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public bl0(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.h = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x0051, B:17:0x0058, B:21:0x0073, B:23:0x0077, B:25:0x007b, B:26:0x0094, B:28:0x0098, B:30:0x009e, B:34:0x00b1, B:36:0x00bf, B:38:0x00c5, B:39:0x00de), top: B:14:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(bl0 bl0Var, Context context, View view, int i10) {
        bl0 bl0Var2;
        Context context2;
        File file;
        if (i10 == bl0Var.v) {
            bl0Var2 = bl0Var;
            context2 = context;
            org.telegram.ui.Components.vi viVar = new org.telegram.ui.Components.vi(context2, bl0Var2, false, false, true, bl0Var.h);
            bl0Var2.O = viVar;
            viVar.N = true;
            viVar.x1.setVisibility(8);
            viVar.j1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            bl0Var2.O.r1();
            bl0Var2.O.show();
        } else {
            bl0Var2 = bl0Var;
            context2 = context;
        }
        if (view instanceof al0) {
            al0 al0Var = (al0) view;
            if (bl0Var2.actionBar.s() || al0Var.e == null) {
                bl0Var2.Z(al0Var.e);
                return;
            }
            Ringtone ringtone = bl0Var2.P;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                zk0 zk0Var = al0Var.e;
                if (zk0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    bl0Var2.P = ringtone2;
                    ringtone2.play();
                } else {
                    String str = zk0Var.g;
                    if (str != null && !zk0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(al0Var.e.g));
                        ringtone3.setStreamType(4);
                        bl0Var2.P = ringtone3;
                        ringtone3.play();
                    } else if (zk0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(al0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    file = bl0Var2.getFileLoader().getPathToAttach(al0Var.e.e);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    bl0Var2.P = ringtone4;
                                    ringtone4.play();
                                } else {
                                    FileLoader fileLoader = bl0Var2.getFileLoader();
                                    TLRPC.Document document = al0Var.e.e;
                                    fileLoader.loadFile(document, document, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        FileLoader fileLoader2 = bl0Var2.getFileLoader();
                        TLRPC.Document document2 = al0Var.e.e;
                        fileLoader2.loadFile(document2, document2, 3, 0);
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            bl0Var2.N = null;
            bl0Var2.H = al0Var.e;
            bl0Var2.I = true;
            yk0 yk0Var = bl0Var2.f;
            yk0Var.q(0, yk0Var.c.n);
        }
    }

    public static void W(bl0 bl0Var) {
        bl0Var.J.clear();
        yk0 yk0Var = bl0Var.f;
        yk0Var.q(0, yk0Var.c.n);
        bl0Var.b0();
    }

    public static String a0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
    }

    public final void Z(zk0 zk0Var) {
        int i10 = zk0Var.c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(zk0Var.c);
        } else if (!zk0Var.a) {
            return;
        } else {
            sparseArray.put(zk0Var.c, zk0Var);
        }
        b0();
        yk0 yk0Var = this.f;
        yk0Var.q(0, yk0Var.c.n);
    }

    public final void b0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() <= 0) {
            this.actionBar.r();
        } else {
            this.d.a(sparseArray.size(), this.actionBar.s());
            this.actionBar.O(null, null);
        }
    }

    public final void c0() {
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.n = 1;
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            int i10 = this.n;
            this.r = i10;
            int size = arrayList.size() + i10;
            this.n = size;
            this.s = size;
        }
        int i11 = this.n;
        this.v = i11;
        this.n = i11 + 2;
        this.w = i11 + 1;
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.n;
            int i13 = i12 + 1;
            this.n = i13;
            this.y = i12;
            this.E = i13;
            int size2 = arrayList2.size() + i13;
            this.n = size2;
            this.F = size2;
        }
        int i14 = this.n;
        this.n = i14 + 1;
        this.x = i14;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, this.h), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.h), false);
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new xk0(this, context));
        if (this.L == 0) {
            int i10 = this.M;
            if (i10 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundPrivate));
            } else if (i10 == 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundGroup));
            } else if (i10 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundChannels));
            } else if (i10 == 3) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundStories));
            } else if (i10 == 5 || i10 == 4) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundReactions));
            }
        } else {
            org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, null, false, this.h);
            this.K = coVar;
            coVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            this.actionBar.addView(this.K, 0, w7.x5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
            if (this.L >= 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.L));
                if (user != null) {
                    this.K.setUserAvatar(user);
                    this.K.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (this.Q != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.L, this.Q);
                og.d.p(this.K.getAvatarImageView(), findTopic, false, true, this.h);
                this.K.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.L));
                this.K.setChatAvatar(chat);
                this.K.setTitle(chat.title);
            }
            this.K.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y8, this.h));
        j3.addView(this.d, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new ci.d(2));
        j3.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j3.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, this.h));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.e = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.x5.c(-1.0f, -1));
        yk0 yk0Var = new yk0(this);
        this.f = yk0Var;
        yk0Var.C(true);
        this.e.setAdapter(this.f);
        ((s4.j) this.e.getItemAnimator()).m = false;
        ((s4.j) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new s4.c0());
        this.e.setOnItemClickListener(new bi.x5(20, this, context));
        this.e.setOnItemLongClickListener(new iu(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.a.clear();
        this.b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            uf.b bVar = (uf.b) getMediaDataController().ringtoneDataStore.e.get(i11);
            zk0 zk0Var = new zk0();
            int i12 = this.G;
            this.G = i12 + 1;
            zk0Var.c = i12;
            zk0Var.a = true;
            zk0Var.d = bVar.c;
            TLRPC.Document document3 = bVar.a;
            String str = document3.file_name_fixed;
            zk0Var.f = str;
            zk0Var.e = document3;
            zk0Var.f = a0(document3, str);
            zk0Var.g = bVar.b;
            zk0 zk0Var2 = this.N;
            if (zk0Var2 != null && (document = zk0Var2.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                this.N = null;
                this.H = zk0Var;
            }
            this.a.add(zk0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        zk0 zk0Var3 = new zk0();
        int i13 = this.G;
        this.G = i13 + 1;
        zk0Var3.c = i13;
        zk0Var3.f = LocaleController.getString(R.string.NoSound);
        this.b.add(zk0Var3);
        zk0 zk0Var4 = new zk0();
        int i14 = this.G;
        this.G = i14 + 1;
        zk0Var4.c = i14;
        zk0Var4.f = LocaleController.getString(R.string.DefaultRingtone);
        zk0Var4.b = true;
        this.b.add(zk0Var4);
        zk0 zk0Var5 = this.N;
        if (zk0Var5 != null && zk0Var5.e == null && zk0Var5.g.equals("NoSound")) {
            this.N = null;
            this.H = zk0Var3;
        }
        zk0 zk0Var6 = this.N;
        if (zk0Var6 != null && zk0Var6.e == null && zk0Var6.g.equals("Default")) {
            this.N = null;
            this.H = zk0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            zk0 zk0Var7 = new zk0();
            int i15 = this.G;
            this.G = i15 + 1;
            zk0Var7.c = i15;
            zk0Var7.f = string;
            zk0Var7.g = str2;
            zk0 zk0Var8 = this.N;
            if (zk0Var8 != null && zk0Var8.e == null && zk0Var8.g.equals(str2)) {
                this.N = null;
                this.H = zk0Var7;
            }
            this.b.add(zk0Var7);
        }
        if (getMediaDataController().ringtoneDataStore.f && this.H == null) {
            this.H = zk0Var4;
            this.I = true;
        }
        c0();
        c0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i10 == NotificationCenter.onUserRingtonesUpdated) {
            HashMap hashMap = new HashMap();
            int i12 = 0;
            while (true) {
                arrayList = this.a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((zk0) arrayList.get(i12)).d), (zk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                uf.b bVar = (uf.b) getMediaDataController().ringtoneDataStore.e.get(i13);
                zk0 zk0Var = new zk0();
                zk0 zk0Var2 = (zk0) hashMap.get(Integer.valueOf(bVar.c));
                if (zk0Var2 != null) {
                    if (zk0Var2 == this.H) {
                        this.H = zk0Var;
                    }
                    zk0Var.c = zk0Var2.c;
                } else {
                    int i14 = this.G;
                    this.G = i14 + 1;
                    zk0Var.c = i14;
                }
                zk0Var.a = true;
                zk0Var.d = bVar.c;
                TLRPC.Document document3 = bVar.a;
                if (document3 != null) {
                    zk0Var.f = document3.file_name_fixed;
                } else {
                    zk0Var.f = new File(bVar.b).getName();
                }
                TLRPC.Document document4 = bVar.a;
                zk0Var.e = document4;
                zk0Var.f = a0(document4, zk0Var.f);
                zk0Var.g = bVar.b;
                zk0 zk0Var3 = this.N;
                if (zk0Var3 != null && (document = zk0Var3.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                    this.N = null;
                    this.H = zk0Var;
                }
                arrayList.add(zk0Var);
            }
            c0();
            this.f.l();
            if (getMediaDataController().ringtoneDataStore.f && this.H == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (zk0) arrayList2.get(0);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.fk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 != 21 || intent == null || this.O == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = false;
        if (intent.getData() != null) {
            String path = AndroidUtilities.getPath(intent.getData());
            if (path != null) {
                if (path.startsWith("content://")) {
                    path = MediaController.copyFileToCache(intent.getData(), "mp3");
                }
                if (this.O.p0.M(new File(path))) {
                    getMediaDataController().uploadRingtone(path);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z11 = z10;
                }
            }
            z10 = false;
            z11 = z10;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z12 = false;
            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                Uri uri = clipData.getItemAt(i12).getUri();
                String uri2 = uri.toString();
                if (uri2.startsWith("content://")) {
                    uri2 = MediaController.copyFileToCache(uri, "mp3");
                }
                if (this.O.p0.M(new File(uri2))) {
                    getMediaDataController().uploadRingtone(uri2);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z12 = true;
                }
            }
            z11 = z12;
        }
        if (z11) {
            this.O.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j3 = this.L;
        if (j3 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, this.Q);
            str2 = org.telegram.ui.Cells.p6.i("sound_document_id_", sharedPrefKey);
            str = org.telegram.ui.Cells.p6.i("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.M;
            if (i10 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j10 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        zk0 zk0Var = new zk0();
        this.N = zk0Var;
        if (j10 != 0) {
            zk0Var.e = new TLRPC.TL_document();
            this.N.e.id = j10;
        } else {
            zk0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.H == null || !this.I) {
            return;
        }
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        if (this.L != 0) {
            str = org.telegram.messenger.w1.i(this.L, this.Q, new StringBuilder("sound_"));
            str2 = org.telegram.messenger.w1.i(this.L, this.Q, new StringBuilder("sound_path_"));
            str3 = org.telegram.messenger.w1.i(this.L, this.Q, new StringBuilder("sound_document_id_"));
            edit.putBoolean(org.telegram.messenger.w1.i(this.L, this.Q, new StringBuilder("sound_enabled_")), true);
        } else {
            int i10 = this.M;
            if (i10 == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundPath";
                str3 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSound";
                str2 = "GroupSoundPath";
                str3 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSound";
                str2 = "ChannelSoundPath";
                str3 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSound";
                str2 = "StoriesSoundPath";
                str3 = "StoriesSoundDocId";
            } else {
                if (i10 != 5 && i10 != 4) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            }
        }
        zk0 zk0Var = this.H;
        if (zk0Var.a && (document = zk0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.H.f);
            edit.putString(str2, "NoSound");
        } else if (zk0Var.g != null) {
            edit.putString(str, zk0Var.f);
            edit.putString(str2, this.H.g);
            edit.remove(str3);
        } else if (zk0Var.b) {
            edit.putString(str, "Default");
            edit.putString(str2, "Default");
            edit.remove(str3);
        } else {
            edit.putString(str, "NoSound");
            edit.putString(str2, "NoSound");
            edit.remove(str3);
        }
        edit.apply();
        if (this.L != 0) {
            getNotificationsController().updateServerNotificationsSettings(this.L, this.Q);
        } else {
            getNotificationsController().updateServerNotificationsSettings(this.M);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.e.setClipToPadding(false);
        this.e.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().addObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override // org.telegram.ui.Components.fk
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.fk
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.fk
    public final /* synthetic */ void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
