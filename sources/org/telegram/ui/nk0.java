package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nk0 extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.ek, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public lk0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.oo K;
    public long L;
    public int M;
    public lk0 N;
    public org.telegram.ui.Components.ti O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public NumberTextView d;
    public org.telegram.ui.Components.mm0 e;
    public kk0 f;
    public final org.telegram.ui.ActionBar.g6 h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public nk0(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.h = g6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x0051, B:17:0x0058, B:21:0x0073, B:23:0x0077, B:25:0x007b, B:26:0x0094, B:28:0x0098, B:30:0x009e, B:34:0x00b1, B:36:0x00bf, B:38:0x00c5, B:39:0x00de), top: B:14:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(nk0 nk0Var, Context context, View view, int i10) {
        nk0 nk0Var2;
        Context context2;
        File file;
        if (i10 == nk0Var.v) {
            nk0Var2 = nk0Var;
            context2 = context;
            org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(context2, nk0Var2, false, false, true, nk0Var.h);
            nk0Var2.O = tiVar;
            tiVar.N = true;
            tiVar.A1.setVisibility(8);
            tiVar.m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            nk0Var2.O.w1();
            nk0Var2.O.show();
        } else {
            nk0Var2 = nk0Var;
            context2 = context;
        }
        if (view instanceof mk0) {
            mk0 mk0Var = (mk0) view;
            if (nk0Var2.actionBar.s() || mk0Var.e == null) {
                nk0Var2.Z(mk0Var.e);
                return;
            }
            Ringtone ringtone = nk0Var2.P;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                lk0 lk0Var = mk0Var.e;
                if (lk0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    nk0Var2.P = ringtone2;
                    ringtone2.play();
                } else {
                    String str = lk0Var.g;
                    if (str != null && !lk0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(mk0Var.e.g));
                        ringtone3.setStreamType(4);
                        nk0Var2.P = ringtone3;
                        ringtone3.play();
                    } else if (lk0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(mk0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    file = nk0Var2.getFileLoader().getPathToAttach(mk0Var.e.e);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    nk0Var2.P = ringtone4;
                                    ringtone4.play();
                                } else {
                                    FileLoader fileLoader = nk0Var2.getFileLoader();
                                    TLRPC.Document document = mk0Var.e.e;
                                    fileLoader.loadFile(document, document, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        FileLoader fileLoader2 = nk0Var2.getFileLoader();
                        TLRPC.Document document2 = mk0Var.e.e;
                        fileLoader2.loadFile(document2, document2, 3, 0);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            nk0Var2.N = null;
            nk0Var2.H = mk0Var.e;
            nk0Var2.I = true;
            kk0 kk0Var = nk0Var2.f;
            kk0Var.q(0, kk0Var.c.n);
        }
    }

    public static void W(nk0 nk0Var) {
        nk0Var.J.clear();
        kk0 kk0Var = nk0Var.f;
        kk0Var.q(0, kk0Var.c.n);
        nk0Var.c0();
    }

    public static void a0(View view, int i10, int i11) {
        if (view instanceof org.telegram.ui.Cells.f2) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            for (int i12 = 0; i12 < f2Var.getChildCount(); i12++) {
                View childAt = f2Var.getChildAt(i12);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.yq) {
                        org.telegram.ui.Components.yq yqVar = (org.telegram.ui.Components.yq) imageView.getDrawable();
                        Drawable drawable = yqVar.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = yqVar.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String b0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
    }

    public final void Z(lk0 lk0Var) {
        int i10 = lk0Var.c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(lk0Var.c);
        } else if (!lk0Var.a) {
            return;
        } else {
            sparseArray.put(lk0Var.c, lk0Var);
        }
        c0();
        kk0 kk0Var = this.f;
        kk0Var.q(0, kk0Var.c.n);
    }

    public final void c0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() <= 0) {
            this.actionBar.r();
        } else {
            this.d.a(sparseArray.size(), this.actionBar.s());
            this.actionBar.N(null, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f8, this.h);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.v8, this.h);
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new jk0(this, context));
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
            org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, this.h);
            this.K = ooVar;
            ooVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            this.actionBar.addView(this.K, 0, w7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
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
        org.telegram.ui.ActionBar.y i11 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i11.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y8, this.h));
        i11.addView(this.d, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new di.d(2));
        i11.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        i11.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, this.h);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.e = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.z5.c(-1.0f, -1));
        kk0 kk0Var = new kk0(this);
        this.f = kk0Var;
        kk0Var.C(true);
        this.e.setAdapter(this.f);
        ((s4.k) this.e.getItemAnimator()).m = false;
        ((s4.k) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new s4.b0());
        this.e.setOnItemClickListener(new ci.x4(20, this, context));
        this.e.setOnItemLongClickListener(new xt(this, 26));
        getMediaDataController().ringtoneDataStore.g(false);
        this.a.clear();
        this.b.clear();
        for (int i12 = 0; i12 < getMediaDataController().ringtoneDataStore.e.size(); i12++) {
            wf.b bVar = (wf.b) getMediaDataController().ringtoneDataStore.e.get(i12);
            lk0 lk0Var = new lk0();
            int i13 = this.G;
            this.G = i13 + 1;
            lk0Var.c = i13;
            lk0Var.a = true;
            lk0Var.d = bVar.c;
            TLRPC.Document document3 = bVar.a;
            String str = document3.file_name_fixed;
            lk0Var.f = str;
            lk0Var.e = document3;
            lk0Var.f = b0(document3, str);
            lk0Var.g = bVar.b;
            lk0 lk0Var2 = this.N;
            if (lk0Var2 != null && (document = lk0Var2.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                this.N = null;
                this.H = lk0Var;
            }
            this.a.add(lk0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        lk0 lk0Var3 = new lk0();
        int i14 = this.G;
        this.G = i14 + 1;
        lk0Var3.c = i14;
        lk0Var3.f = LocaleController.getString(R.string.NoSound);
        this.b.add(lk0Var3);
        lk0 lk0Var4 = new lk0();
        int i15 = this.G;
        this.G = i15 + 1;
        lk0Var4.c = i15;
        lk0Var4.f = LocaleController.getString(R.string.DefaultRingtone);
        lk0Var4.b = true;
        this.b.add(lk0Var4);
        lk0 lk0Var5 = this.N;
        if (lk0Var5 != null && lk0Var5.e == null && lk0Var5.g.equals("NoSound")) {
            this.N = null;
            this.H = lk0Var3;
        }
        lk0 lk0Var6 = this.N;
        if (lk0Var6 != null && lk0Var6.e == null && lk0Var6.g.equals("Default")) {
            this.N = null;
            this.H = lk0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            lk0 lk0Var7 = new lk0();
            int i16 = this.G;
            this.G = i16 + 1;
            lk0Var7.c = i16;
            lk0Var7.f = string;
            lk0Var7.g = str2;
            lk0 lk0Var8 = this.N;
            if (lk0Var8 != null && lk0Var8.e == null && lk0Var8.g.equals(str2)) {
                this.N = null;
                this.H = lk0Var7;
            }
            this.b.add(lk0Var7);
        }
        if (getMediaDataController().ringtoneDataStore.f && this.H == null) {
            this.H = lk0Var4;
            this.I = true;
        }
        d0();
        d0();
        return this.fragmentView;
    }

    public final void d0() {
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
                hashMap.put(Integer.valueOf(((lk0) arrayList.get(i12)).d), (lk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                wf.b bVar = (wf.b) getMediaDataController().ringtoneDataStore.e.get(i13);
                lk0 lk0Var = new lk0();
                lk0 lk0Var2 = (lk0) hashMap.get(Integer.valueOf(bVar.c));
                if (lk0Var2 != null) {
                    if (lk0Var2 == this.H) {
                        this.H = lk0Var;
                    }
                    lk0Var.c = lk0Var2.c;
                } else {
                    int i14 = this.G;
                    this.G = i14 + 1;
                    lk0Var.c = i14;
                }
                lk0Var.a = true;
                lk0Var.d = bVar.c;
                TLRPC.Document document3 = bVar.a;
                if (document3 != null) {
                    lk0Var.f = document3.file_name_fixed;
                } else {
                    lk0Var.f = new File(bVar.b).getName();
                }
                TLRPC.Document document4 = bVar.a;
                lk0Var.e = document4;
                lk0Var.f = b0(document4, lk0Var.f);
                lk0Var.g = bVar.b;
                lk0 lk0Var3 = this.N;
                if (lk0Var3 != null && (document = lk0Var3.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                    this.N = null;
                    this.H = lk0Var;
                }
                arrayList.add(lk0Var);
            }
            d0();
            this.f.l();
            if (getMediaDataController().ringtoneDataStore.f && this.H == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (lk0) arrayList2.get(0);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.o2
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
                if (this.O.p0.P(new File(path))) {
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
                if (this.O.p0.P(new File(uri2))) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j10 = this.L;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.Q);
            str2 = si.o0.h("sound_document_id_", sharedPrefKey);
            str = si.o0.h("sound_path_", sharedPrefKey);
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
        long j11 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        lk0 lk0Var = new lk0();
        this.N = lk0Var;
        if (j11 != 0) {
            lk0Var.e = new TLRPC.TL_document();
            this.N.e.id = j11;
        } else {
            lk0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            str = org.telegram.messenger.v0.i(this.L, this.Q, new StringBuilder("sound_"));
            str2 = org.telegram.messenger.v0.i(this.L, this.Q, new StringBuilder("sound_path_"));
            str3 = org.telegram.messenger.v0.i(this.L, this.Q, new StringBuilder("sound_document_id_"));
            edit.putBoolean(org.telegram.messenger.v0.i(this.L, this.Q, new StringBuilder("sound_enabled_")), true);
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
        lk0 lk0Var = this.H;
        if (lk0Var.a && (document = lk0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.H.f);
            edit.putString(str2, "NoSound");
        } else if (lk0Var.g != null) {
            edit.putString(str, lk0Var.f);
            edit.putString(str2, this.H.g);
            edit.remove(str3);
        } else if (lk0Var.b) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.e.setClipToPadding(false);
        this.e.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().addObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            NumberTextView numberTextView = this.d;
            org.telegram.ui.ActionBar.g6 g6Var = this.h;
            if (numberTextView != null) {
                numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y8, g6Var));
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, g6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k7, g6Var);
            if (this.e != null) {
                if (w02 == this.R && w03 == this.S) {
                    return;
                }
                this.R = w02;
                this.S = w03;
                for (int i10 = 0; i10 < this.e.getChildCount(); i10++) {
                    a0(this.e.getChildAt(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.e.getCachedChildCount(); i11++) {
                    a0(this.e.P(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.e.getHiddenChildCount(); i12++) {
                    a0(this.e.V(i12), w02, w03);
                }
                for (int i13 = 0; i13 < this.e.getAttachedScrapChildCount(); i13++) {
                    a0(this.e.O(i13), w02, w03);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ek
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ek
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.ek
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
