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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kk0 extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.sj, NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public ik0 D;
    public boolean E;
    public final SparseArray F;
    public org.telegram.ui.Components.rn G;
    public long H;
    public int I;
    public ik0 J;
    public org.telegram.ui.Components.gi K;
    public Ringtone L;
    public long M;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public NumberTextView d;
    public org.telegram.ui.Components.zk0 e;
    public hk0 f;
    public final org.telegram.ui.ActionBar.c6 h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public kk0(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.C = 100;
        this.F = new SparseArray();
        this.I = -1;
        this.M = 0L;
        this.h = c6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x0051, B:17:0x0058, B:21:0x0073, B:23:0x0077, B:25:0x007b, B:26:0x0094, B:28:0x0098, B:30:0x009e, B:34:0x00b1, B:36:0x00bf, B:38:0x00c5, B:39:0x00de), top: B:14:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(kk0 kk0Var, Context context, View view, int i10) {
        kk0 kk0Var2;
        Context context2;
        File file;
        if (i10 == kk0Var.v) {
            kk0Var2 = kk0Var;
            context2 = context;
            org.telegram.ui.Components.gi giVar = new org.telegram.ui.Components.gi(context2, kk0Var2, false, false, true, kk0Var.h);
            kk0Var2.K = giVar;
            giVar.J = true;
            giVar.t1.setVisibility(8);
            giVar.f1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            kk0Var2.K.r1();
            kk0Var2.K.show();
        } else {
            kk0Var2 = kk0Var;
            context2 = context;
        }
        if (view instanceof jk0) {
            jk0 jk0Var = (jk0) view;
            if (kk0Var2.actionBar.t() || jk0Var.e == null) {
                kk0Var2.Z(jk0Var.e);
                return;
            }
            Ringtone ringtone = kk0Var2.L;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                ik0 ik0Var = jk0Var.e;
                if (ik0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    kk0Var2.L = ringtone2;
                    ringtone2.play();
                } else {
                    String str = ik0Var.g;
                    if (str != null && !ik0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(jk0Var.e.g));
                        ringtone3.setStreamType(4);
                        kk0Var2.L = ringtone3;
                        ringtone3.play();
                    } else if (ik0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(jk0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    file = kk0Var2.getFileLoader().getPathToAttach(jk0Var.e.e);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    kk0Var2.L = ringtone4;
                                    ringtone4.play();
                                } else {
                                    FileLoader fileLoader = kk0Var2.getFileLoader();
                                    TLRPC.Document document = jk0Var.e.e;
                                    fileLoader.loadFile(document, document, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        FileLoader fileLoader2 = kk0Var2.getFileLoader();
                        TLRPC.Document document2 = jk0Var.e.e;
                        fileLoader2.loadFile(document2, document2, 3, 0);
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            kk0Var2.J = null;
            kk0Var2.D = jk0Var.e;
            kk0Var2.E = true;
            hk0 hk0Var = kk0Var2.f;
            hk0Var.q(0, hk0Var.c.n);
        }
    }

    public static void W(kk0 kk0Var) {
        kk0Var.F.clear();
        hk0 hk0Var = kk0Var.f;
        hk0Var.q(0, hk0Var.c.n);
        kk0Var.b0();
    }

    public static String a0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
    }

    public final void Z(ik0 ik0Var) {
        int i10 = ik0Var.c;
        SparseArray sparseArray = this.F;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(ik0Var.c);
        } else if (!ik0Var.a) {
            return;
        } else {
            sparseArray.put(ik0Var.c, ik0Var);
        }
        b0();
        hk0 hk0Var = this.f;
        hk0Var.q(0, hk0Var.c.n);
    }

    public final void b0() {
        SparseArray sparseArray = this.F;
        if (sparseArray.size() <= 0) {
            this.actionBar.s();
        } else {
            this.d.a(sparseArray.size(), this.actionBar.t());
            this.actionBar.O(null, null);
        }
    }

    public final void c0() {
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.y = -1;
        this.A = -1;
        this.B = -1;
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
            this.A = i13;
            int size2 = arrayList2.size() + i13;
            this.n = size2;
            this.B = size2;
        }
        int i14 = this.n;
        this.n = i14 + 1;
        this.x = i14;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f8, this.h), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, this.h), false);
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new gk0(this, context));
        if (this.H == 0) {
            int i10 = this.I;
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
            org.telegram.ui.Components.rn rnVar = new org.telegram.ui.Components.rn(context, null, false, this.h);
            this.G = rnVar;
            rnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            this.actionBar.addView(this.G, 0, h7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
            if (this.H >= 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
                if (user != null) {
                    this.G.setUserAvatar(user);
                    this.G.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (this.M != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.H, this.M);
                wf.c.p(this.G.getAvatarImageView(), findTopic, false, true, this.h);
                this.G.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.H));
                this.G.setChatAvatar(chat);
                this.G.setTitle(chat.title);
            }
            this.G.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y8, this.h));
        j10.addView(this.d, h7.z5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new kh.e(2));
        j10.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j10.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, this.h));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.e = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, h7.z5.c(-1.0f, -1));
        hk0 hk0Var = new hk0(this);
        this.f = hk0Var;
        hk0Var.C(true);
        this.e.setAdapter(this.f);
        ((f2.l) this.e.getItemAnimator()).m = false;
        ((f2.l) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new f2.k0());
        this.e.setOnItemClickListener(new cg.x0(22, this, context));
        this.e.setOnItemLongClickListener(new zt(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.a.clear();
        this.b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            cf.c cVar = (cf.c) getMediaDataController().ringtoneDataStore.e.get(i11);
            ik0 ik0Var = new ik0();
            int i12 = this.C;
            this.C = i12 + 1;
            ik0Var.c = i12;
            ik0Var.a = true;
            ik0Var.d = cVar.c;
            TLRPC.Document document3 = cVar.a;
            String str = document3.file_name_fixed;
            ik0Var.f = str;
            ik0Var.e = document3;
            ik0Var.f = a0(document3, str);
            ik0Var.g = cVar.b;
            ik0 ik0Var2 = this.J;
            if (ik0Var2 != null && (document = ik0Var2.e) != null && (document2 = cVar.a) != null && document.id == document2.id) {
                this.J = null;
                this.D = ik0Var;
            }
            this.a.add(ik0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ik0 ik0Var3 = new ik0();
        int i13 = this.C;
        this.C = i13 + 1;
        ik0Var3.c = i13;
        ik0Var3.f = LocaleController.getString(R.string.NoSound);
        this.b.add(ik0Var3);
        ik0 ik0Var4 = new ik0();
        int i14 = this.C;
        this.C = i14 + 1;
        ik0Var4.c = i14;
        ik0Var4.f = LocaleController.getString(R.string.DefaultRingtone);
        ik0Var4.b = true;
        this.b.add(ik0Var4);
        ik0 ik0Var5 = this.J;
        if (ik0Var5 != null && ik0Var5.e == null && ik0Var5.g.equals("NoSound")) {
            this.J = null;
            this.D = ik0Var3;
        }
        ik0 ik0Var6 = this.J;
        if (ik0Var6 != null && ik0Var6.e == null && ik0Var6.g.equals("Default")) {
            this.J = null;
            this.D = ik0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ik0 ik0Var7 = new ik0();
            int i15 = this.C;
            this.C = i15 + 1;
            ik0Var7.c = i15;
            ik0Var7.f = string;
            ik0Var7.g = str2;
            ik0 ik0Var8 = this.J;
            if (ik0Var8 != null && ik0Var8.e == null && ik0Var8.g.equals(str2)) {
                this.J = null;
                this.D = ik0Var7;
            }
            this.b.add(ik0Var7);
        }
        if (getMediaDataController().ringtoneDataStore.f && this.D == null) {
            this.D = ik0Var4;
            this.E = true;
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
                hashMap.put(Integer.valueOf(((ik0) arrayList.get(i12)).d), (ik0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                cf.c cVar = (cf.c) getMediaDataController().ringtoneDataStore.e.get(i13);
                ik0 ik0Var = new ik0();
                ik0 ik0Var2 = (ik0) hashMap.get(Integer.valueOf(cVar.c));
                if (ik0Var2 != null) {
                    if (ik0Var2 == this.D) {
                        this.D = ik0Var;
                    }
                    ik0Var.c = ik0Var2.c;
                } else {
                    int i14 = this.C;
                    this.C = i14 + 1;
                    ik0Var.c = i14;
                }
                ik0Var.a = true;
                ik0Var.d = cVar.c;
                TLRPC.Document document3 = cVar.a;
                if (document3 != null) {
                    ik0Var.f = document3.file_name_fixed;
                } else {
                    ik0Var.f = new File(cVar.b).getName();
                }
                TLRPC.Document document4 = cVar.a;
                ik0Var.e = document4;
                ik0Var.f = a0(document4, ik0Var.f);
                ik0Var.g = cVar.b;
                ik0 ik0Var3 = this.J;
                if (ik0Var3 != null && (document = ik0Var3.e) != null && (document2 = cVar.a) != null && document.id == document2.id) {
                    this.J = null;
                    this.D = ik0Var;
                }
                arrayList.add(ik0Var);
            }
            c0();
            this.f.l();
            if (getMediaDataController().ringtoneDataStore.f && this.D == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.J = null;
                    this.D = (ik0) arrayList2.get(0);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.sj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 != 21 || intent == null || this.K == null) {
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
                if (this.K.l0.M(new File(path))) {
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
                if (this.K.l0.M(new File(uri2))) {
                    getMediaDataController().uploadRingtone(uri2);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z12 = true;
                }
            }
            z11 = z12;
        }
        if (z11) {
            this.K.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.H = getArguments().getLong("dialog_id", 0L);
            this.M = getArguments().getLong("topic_id", 0L);
            this.I = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j10 = this.H;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.M);
            str2 = s3.c.e("sound_document_id_", sharedPrefKey);
            str = s3.c.e("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.I;
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
        long j11 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ik0 ik0Var = new ik0();
        this.J = ik0Var;
        if (j11 != 0) {
            ik0Var.e = new TLRPC.TL_document();
            this.J.e.id = j11;
        } else {
            ik0Var.g = string;
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
        if (this.D == null || !this.E) {
            return;
        }
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        if (this.H != 0) {
            str = org.telegram.messenger.y1.j(this.H, this.M, new StringBuilder("sound_"));
            str2 = org.telegram.messenger.y1.j(this.H, this.M, new StringBuilder("sound_path_"));
            str3 = org.telegram.messenger.y1.j(this.H, this.M, new StringBuilder("sound_document_id_"));
            edit.putBoolean(org.telegram.messenger.y1.j(this.H, this.M, new StringBuilder("sound_enabled_")), true);
        } else {
            int i10 = this.I;
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
        ik0 ik0Var = this.D;
        if (ik0Var.a && (document = ik0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.D.f);
            edit.putString(str2, "NoSound");
        } else if (ik0Var.g != null) {
            edit.putString(str, ik0Var.f);
            edit.putString(str2, this.D.g);
            edit.remove(str3);
        } else if (ik0Var.b) {
            edit.putString(str, "Default");
            edit.putString(str2, "Default");
            edit.remove(str3);
        } else {
            edit.putString(str, "NoSound");
            edit.putString(str2, "NoSound");
            edit.remove(str3);
        }
        edit.apply();
        if (this.H != 0) {
            getNotificationsController().updateServerNotificationsSettings(this.H, this.M);
        } else {
            getNotificationsController().updateServerNotificationsSettings(this.I);
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

    @Override // org.telegram.ui.Components.sj
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.sj
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.sj
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
