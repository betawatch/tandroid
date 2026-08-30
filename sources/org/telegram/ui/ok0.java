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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ok0 extends org.telegram.ui.ActionBar.p2 implements org.telegram.ui.Components.xj, NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public mk0 E;
    public boolean F;
    public final SparseArray G;
    public org.telegram.ui.Components.zn H;
    public long I;
    public int J;
    public mk0 K;
    public org.telegram.ui.Components.li L;
    public Ringtone M;
    public long N;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public NumberTextView d;
    public org.telegram.ui.Components.sl0 e;
    public lk0 f;
    public final org.telegram.ui.ActionBar.f6 h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public ok0(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.D = 100;
        this.G = new SparseArray();
        this.J = -1;
        this.N = 0L;
        this.h = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x0051, B:17:0x0058, B:21:0x0073, B:23:0x0077, B:25:0x007b, B:26:0x0094, B:28:0x0098, B:30:0x009e, B:34:0x00b1, B:36:0x00bf, B:38:0x00c5, B:39:0x00de), top: B:14:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(ok0 ok0Var, Context context, View view, int i10) {
        ok0 ok0Var2;
        Context context2;
        File file;
        if (i10 == ok0Var.v) {
            ok0Var2 = ok0Var;
            context2 = context;
            org.telegram.ui.Components.li liVar = new org.telegram.ui.Components.li(context2, ok0Var2, false, false, true, ok0Var.h);
            ok0Var2.L = liVar;
            liVar.K = true;
            liVar.u1.setVisibility(8);
            liVar.g1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            ok0Var2.L.r1();
            ok0Var2.L.show();
        } else {
            ok0Var2 = ok0Var;
            context2 = context;
        }
        if (view instanceof nk0) {
            nk0 nk0Var = (nk0) view;
            if (ok0Var2.actionBar.s() || nk0Var.e == null) {
                ok0Var2.Z(nk0Var.e);
                return;
            }
            Ringtone ringtone = ok0Var2.M;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                mk0 mk0Var = nk0Var.e;
                if (mk0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    ok0Var2.M = ringtone2;
                    ringtone2.play();
                } else {
                    String str = mk0Var.g;
                    if (str != null && !mk0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(nk0Var.e.g));
                        ringtone3.setStreamType(4);
                        ok0Var2.M = ringtone3;
                        ringtone3.play();
                    } else if (mk0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(nk0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    file = ok0Var2.getFileLoader().getPathToAttach(nk0Var.e.e);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    ok0Var2.M = ringtone4;
                                    ringtone4.play();
                                } else {
                                    FileLoader fileLoader = ok0Var2.getFileLoader();
                                    TLRPC.Document document = nk0Var.e.e;
                                    fileLoader.loadFile(document, document, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        FileLoader fileLoader2 = ok0Var2.getFileLoader();
                        TLRPC.Document document2 = nk0Var.e.e;
                        fileLoader2.loadFile(document2, document2, 3, 0);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            ok0Var2.K = null;
            ok0Var2.E = nk0Var.e;
            ok0Var2.F = true;
            lk0 lk0Var = ok0Var2.f;
            lk0Var.q(0, lk0Var.c.n);
        }
    }

    public static void W(ok0 ok0Var) {
        ok0Var.G.clear();
        lk0 lk0Var = ok0Var.f;
        lk0Var.q(0, lk0Var.c.n);
        ok0Var.b0();
    }

    public static String a0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
    }

    public final void Z(mk0 mk0Var) {
        int i10 = mk0Var.c;
        SparseArray sparseArray = this.G;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(mk0Var.c);
        } else if (!mk0Var.a) {
            return;
        } else {
            sparseArray.put(mk0Var.c, mk0Var);
        }
        b0();
        lk0 lk0Var = this.f;
        lk0Var.q(0, lk0Var.c.n);
    }

    public final void b0() {
        SparseArray sparseArray = this.G;
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
        this.B = -1;
        this.C = -1;
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
            this.B = i13;
            int size2 = arrayList2.size() + i13;
            this.n = size2;
            this.C = size2;
        }
        int i14 = this.n;
        this.n = i14 + 1;
        this.x = i14;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, this.h), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.h), false);
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new kk0(this, context));
        if (this.I == 0) {
            int i10 = this.J;
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
            org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, null, false, this.h);
            this.H = znVar;
            znVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            this.actionBar.addView(this.H, 0, k7.b6.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
            if (this.I >= 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.I));
                if (user != null) {
                    this.H.setUserAvatar(user);
                    this.H.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (this.N != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.I, this.N);
                ag.f.p(this.H.getAvatarImageView(), findTopic, false, true, this.h);
                this.H.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.I));
                this.H.setChatAvatar(chat);
                this.H.setTitle(chat.title);
            }
            this.H.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y8, this.h));
        j10.addView(this.d, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new oh.d(2));
        j10.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j10.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, this.h));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.e = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, k7.b6.c(-1.0f, -1));
        lk0 lk0Var = new lk0(this);
        this.f = lk0Var;
        lk0Var.C(true);
        this.e.setAdapter(this.f);
        ((f2.l) this.e.getItemAnimator()).m = false;
        ((f2.l) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new f2.i0());
        this.e.setOnItemClickListener(new gg.v0(21, this, context));
        this.e.setOnItemLongClickListener(new fu(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.a.clear();
        this.b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            gf.d dVar = (gf.d) getMediaDataController().ringtoneDataStore.e.get(i11);
            mk0 mk0Var = new mk0();
            int i12 = this.D;
            this.D = i12 + 1;
            mk0Var.c = i12;
            mk0Var.a = true;
            mk0Var.d = dVar.c;
            TLRPC.Document document3 = dVar.a;
            String str = document3.file_name_fixed;
            mk0Var.f = str;
            mk0Var.e = document3;
            mk0Var.f = a0(document3, str);
            mk0Var.g = dVar.b;
            mk0 mk0Var2 = this.K;
            if (mk0Var2 != null && (document = mk0Var2.e) != null && (document2 = dVar.a) != null && document.id == document2.id) {
                this.K = null;
                this.E = mk0Var;
            }
            this.a.add(mk0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        mk0 mk0Var3 = new mk0();
        int i13 = this.D;
        this.D = i13 + 1;
        mk0Var3.c = i13;
        mk0Var3.f = LocaleController.getString(R.string.NoSound);
        this.b.add(mk0Var3);
        mk0 mk0Var4 = new mk0();
        int i14 = this.D;
        this.D = i14 + 1;
        mk0Var4.c = i14;
        mk0Var4.f = LocaleController.getString(R.string.DefaultRingtone);
        mk0Var4.b = true;
        this.b.add(mk0Var4);
        mk0 mk0Var5 = this.K;
        if (mk0Var5 != null && mk0Var5.e == null && mk0Var5.g.equals("NoSound")) {
            this.K = null;
            this.E = mk0Var3;
        }
        mk0 mk0Var6 = this.K;
        if (mk0Var6 != null && mk0Var6.e == null && mk0Var6.g.equals("Default")) {
            this.K = null;
            this.E = mk0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            mk0 mk0Var7 = new mk0();
            int i15 = this.D;
            this.D = i15 + 1;
            mk0Var7.c = i15;
            mk0Var7.f = string;
            mk0Var7.g = str2;
            mk0 mk0Var8 = this.K;
            if (mk0Var8 != null && mk0Var8.e == null && mk0Var8.g.equals(str2)) {
                this.K = null;
                this.E = mk0Var7;
            }
            this.b.add(mk0Var7);
        }
        if (getMediaDataController().ringtoneDataStore.f && this.E == null) {
            this.E = mk0Var4;
            this.F = true;
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
                hashMap.put(Integer.valueOf(((mk0) arrayList.get(i12)).d), (mk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                gf.d dVar = (gf.d) getMediaDataController().ringtoneDataStore.e.get(i13);
                mk0 mk0Var = new mk0();
                mk0 mk0Var2 = (mk0) hashMap.get(Integer.valueOf(dVar.c));
                if (mk0Var2 != null) {
                    if (mk0Var2 == this.E) {
                        this.E = mk0Var;
                    }
                    mk0Var.c = mk0Var2.c;
                } else {
                    int i14 = this.D;
                    this.D = i14 + 1;
                    mk0Var.c = i14;
                }
                mk0Var.a = true;
                mk0Var.d = dVar.c;
                TLRPC.Document document3 = dVar.a;
                if (document3 != null) {
                    mk0Var.f = document3.file_name_fixed;
                } else {
                    mk0Var.f = new File(dVar.b).getName();
                }
                TLRPC.Document document4 = dVar.a;
                mk0Var.e = document4;
                mk0Var.f = a0(document4, mk0Var.f);
                mk0Var.g = dVar.b;
                mk0 mk0Var3 = this.K;
                if (mk0Var3 != null && (document = mk0Var3.e) != null && (document2 = dVar.a) != null && document.id == document2.id) {
                    this.K = null;
                    this.E = mk0Var;
                }
                arrayList.add(mk0Var);
            }
            c0();
            this.f.l();
            if (getMediaDataController().ringtoneDataStore.f && this.E == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.K = null;
                    this.E = (mk0) arrayList2.get(0);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.xj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 != 21 || intent == null || this.L == null) {
            return;
        }
        boolean z4 = true;
        boolean z10 = false;
        if (intent.getData() != null) {
            String path = AndroidUtilities.getPath(intent.getData());
            if (path != null) {
                if (path.startsWith("content://")) {
                    path = MediaController.copyFileToCache(intent.getData(), "mp3");
                }
                if (this.L.m0.M(new File(path))) {
                    getMediaDataController().uploadRingtone(path);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z10 = z4;
                }
            }
            z4 = false;
            z10 = z4;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z11 = false;
            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                Uri uri = clipData.getItemAt(i12).getUri();
                String uri2 = uri.toString();
                if (uri2.startsWith("content://")) {
                    uri2 = MediaController.copyFileToCache(uri, "mp3");
                }
                if (this.L.m0.M(new File(uri2))) {
                    getMediaDataController().uploadRingtone(uri2);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z11 = true;
                }
            }
            z10 = z11;
        }
        if (z10) {
            this.L.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.I = getArguments().getLong("dialog_id", 0L);
            this.N = getArguments().getLong("topic_id", 0L);
            this.J = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j10 = this.I;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.N);
            str2 = vh.v2.e("sound_document_id_", sharedPrefKey);
            str = vh.v2.e("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.J;
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
        mk0 mk0Var = new mk0();
        this.K = mk0Var;
        if (j11 != 0) {
            mk0Var.e = new TLRPC.TL_document();
            this.K.e.id = j11;
        } else {
            mk0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.E == null || !this.F) {
            return;
        }
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        if (this.I != 0) {
            str = org.telegram.messenger.y3.i(this.I, this.N, new StringBuilder("sound_"));
            str2 = org.telegram.messenger.y3.i(this.I, this.N, new StringBuilder("sound_path_"));
            str3 = org.telegram.messenger.y3.i(this.I, this.N, new StringBuilder("sound_document_id_"));
            edit.putBoolean(org.telegram.messenger.y3.i(this.I, this.N, new StringBuilder("sound_enabled_")), true);
        } else {
            int i10 = this.J;
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
        mk0 mk0Var = this.E;
        if (mk0Var.a && (document = mk0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.E.f);
            edit.putString(str2, "NoSound");
        } else if (mk0Var.g != null) {
            edit.putString(str, mk0Var.f);
            edit.putString(str2, this.E.g);
            edit.remove(str3);
        } else if (mk0Var.b) {
            edit.putString(str, "Default");
            edit.putString(str2, "Default");
            edit.remove(str3);
        } else {
            edit.putString(str, "NoSound");
            edit.putString(str2, "NoSound");
            edit.remove(str3);
        }
        edit.apply();
        if (this.I != 0) {
            getNotificationsController().updateServerNotificationsSettings(this.I, this.N);
        } else {
            getNotificationsController().updateServerNotificationsSettings(this.J);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.e.setClipToPadding(false);
        this.e.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().addObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override // org.telegram.ui.Components.xj
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.xj
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.xj
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z4, int i10) {
    }
}
