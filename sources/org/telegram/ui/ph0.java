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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ph0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.ui.Components.lj, org.telegram.messenger.cs {
    public int E;
    public int F;
    public int G;
    public nh0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.jn K;
    public long L;
    public int M;
    public nh0 N;
    public org.telegram.ui.Components.bi O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public org.telegram.ui.Components.tj0 d;
    public ci.r4 e;
    public final org.telegram.ui.ActionBar.e6 f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public ph0(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f = e6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:15:0x0052, B:17:0x0059, B:21:0x0074, B:23:0x0078, B:25:0x007c, B:26:0x0095, B:28:0x0099, B:30:0x009f, B:34:0x00b2, B:36:0x00c3, B:38:0x00c9, B:39:0x00e2), top: B:14:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(ph0 ph0Var, Context context, View view, int i3) {
        ph0 ph0Var2;
        Context context2;
        File file;
        if (i3 == ph0Var.s) {
            ph0Var2 = ph0Var;
            context2 = context;
            org.telegram.ui.Components.bi biVar = new org.telegram.ui.Components.bi(context2, ph0Var2, false, false, true, ph0Var.f);
            ph0Var2.O = biVar;
            biVar.F1 = true;
            biVar.s3.setVisibility(8);
            biVar.e3.setText(org.telegram.messenger.bd.M0(2131752121, null));
            ph0Var2.O.e1();
            ph0Var2.O.show();
        } else {
            ph0Var2 = ph0Var;
            context2 = context;
        }
        if (view instanceof oh0) {
            oh0 oh0Var = (oh0) view;
            if (ph0Var2.simpleActionBar.s() || oh0Var.e == null) {
                ph0Var2.e0(oh0Var.e);
                return;
            }
            Ringtone ringtone = ph0Var2.P;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                nh0 nh0Var = oh0Var.e;
                if (nh0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    ph0Var2.P = ringtone2;
                    ringtone2.play();
                } else {
                    String str = nh0Var.g;
                    if (str != null && !nh0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(oh0Var.e.g));
                        ringtone3.setStreamType(4);
                        ph0Var2.P = ringtone3;
                        ringtone3.play();
                    } else if (nh0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(oh0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    org.telegram.messenger.w7 fileLoader = ph0Var2.getFileLoader();
                                    TLRPC.Document document = oh0Var.e.e;
                                    fileLoader.getClass();
                                    file = org.telegram.messenger.w7.I(document);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    ph0Var2.P = ringtone4;
                                    ringtone4.play();
                                } else {
                                    org.telegram.messenger.w7 fileLoader2 = ph0Var2.getFileLoader();
                                    TLRPC.Document document2 = oh0Var.e.e;
                                    fileLoader2.X(document2, document2, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        org.telegram.messenger.w7 fileLoader22 = ph0Var2.getFileLoader();
                        TLRPC.Document document22 = oh0Var.e.e;
                        fileLoader22.X(document22, document22, 3, 0);
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            ph0Var2.N = null;
            ph0Var2.H = oh0Var.e;
            ph0Var2.I = true;
            ci.r4 r4Var = ph0Var2.e;
            r4Var.k(0, ((ph0) r4Var.d).h);
        }
    }

    public static void b0(ph0 ph0Var) {
        ph0Var.J.clear();
        ci.r4 r4Var = ph0Var.e;
        r4Var.k(0, ((ph0) r4Var.d).h);
        ph0Var.h0();
    }

    public static void f0(View view, int i3, int i10) {
        if (view instanceof org.telegram.ui.Cells.i2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            for (int i11 = 0; i11 < i2Var.getChildCount(); i11++) {
                View childAt = i2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.xp) {
                        org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) imageView.getDrawable();
                        Drawable drawable = xpVar.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = xpVar.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String g0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : org.telegram.messenger.bd.a0("SoundNameEmpty", null, 2131745288, org.telegram.messenger.bd.u(document.date, true));
    }

    @Override // org.telegram.ui.Components.lj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new mh0(this, context));
        if (this.L == 0) {
            int i3 = this.M;
            if (i3 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747876, null));
            } else if (i3 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747877, null));
            } else if (i3 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747878, null));
            } else if (i3 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747874, null));
            } else if (i3 == 5 || i3 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747875, null));
            }
        } else {
            this.K = new org.telegram.ui.Components.jn(context, null, false, this.f);
            if (this.L >= 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.L));
                if (a22 != null) {
                    this.K.setUserAvatar(a22);
                    this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (this.Q != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().q7.f(-this.L, this.Q);
                rg.c.p(this.K.getAvatarImageView(), f10, false, true, this.f);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L));
                this.K.setChatAvatar(M0);
                this.simpleActionBar.setTitle(M0.title);
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.bd.M0(2131747879, null));
            org.telegram.messenger.g0.E2(this.K.e);
            this.simpleActionBar.addView(this.K.e, b8.mf.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.d(2, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131745469, null));
        l10.d(1, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.d = tj0Var;
        tj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        ci.r4 r4Var = new ci.r4(this, 7);
        this.e = r4Var;
        r4Var.C(true);
        this.d.setAdapter(this.e);
        ((u4.k) this.d.getItemAnimator()).m = false;
        ((u4.k) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new u4.b0());
        this.d.setOnItemClickListener(new ei.q4(20, this, context));
        this.d.setOnItemLongClickListener(new ur(this, 28));
        getMediaDataController().A0.g(false);
        this.a.clear();
        this.b.clear();
        for (int i10 = 0; i10 < getMediaDataController().A0.e.size(); i10++) {
            zf.b bVar = (zf.b) getMediaDataController().A0.e.get(i10);
            nh0 nh0Var = new nh0();
            int i11 = this.G;
            this.G = i11 + 1;
            nh0Var.c = i11;
            nh0Var.a = true;
            nh0Var.d = bVar.c;
            TLRPC.Document document3 = bVar.a;
            String str = document3.file_name_fixed;
            nh0Var.f = str;
            nh0Var.e = document3;
            nh0Var.f = g0(document3, str);
            nh0Var.g = bVar.b;
            nh0 nh0Var2 = this.N;
            if (nh0Var2 != null && (document = nh0Var2.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                this.N = null;
                this.H = nh0Var;
            }
            this.a.add(nh0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        nh0 nh0Var3 = new nh0();
        int i12 = this.G;
        this.G = i12 + 1;
        nh0Var3.c = i12;
        nh0Var3.f = org.telegram.messenger.bd.M0(2131748159, null);
        this.b.add(nh0Var3);
        nh0 nh0Var4 = new nh0();
        int i13 = this.G;
        this.G = i13 + 1;
        nh0Var4.c = i13;
        nh0Var4.f = org.telegram.messenger.bd.M0(2131751600, null);
        nh0Var4.b = true;
        this.b.add(nh0Var4);
        nh0 nh0Var5 = this.N;
        if (nh0Var5 != null && nh0Var5.e == null && nh0Var5.g.equals("NoSound")) {
            this.N = null;
            this.H = nh0Var3;
        }
        nh0 nh0Var6 = this.N;
        if (nh0Var6 != null && nh0Var6.e == null && nh0Var6.g.equals("Default")) {
            this.N = null;
            this.H = nh0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            nh0 nh0Var7 = new nh0();
            int i14 = this.G;
            this.G = i14 + 1;
            nh0Var7.c = i14;
            nh0Var7.f = string;
            nh0Var7.g = str2;
            nh0 nh0Var8 = this.N;
            if (nh0Var8 != null && nh0Var8.e == null && nh0Var8.g.equals(str2)) {
                this.N = null;
                this.H = nh0Var7;
            }
            this.b.add(nh0Var7);
        }
        if (getMediaDataController().A0.f && this.H == null) {
            this.H = nh0Var4;
            this.I = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i3 == org.telegram.messenger.hs.e5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((nh0) arrayList.get(i11)).d), (nh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().A0.e.size(); i12++) {
                zf.b bVar = (zf.b) getMediaDataController().A0.e.get(i12);
                nh0 nh0Var = new nh0();
                nh0 nh0Var2 = (nh0) hashMap.get(Integer.valueOf(bVar.c));
                if (nh0Var2 != null) {
                    if (nh0Var2 == this.H) {
                        this.H = nh0Var;
                    }
                    nh0Var.c = nh0Var2.c;
                } else {
                    int i13 = this.G;
                    this.G = i13 + 1;
                    nh0Var.c = i13;
                }
                nh0Var.a = true;
                nh0Var.d = bVar.c;
                TLRPC.Document document3 = bVar.a;
                if (document3 != null) {
                    nh0Var.f = document3.file_name_fixed;
                } else {
                    nh0Var.f = new File(bVar.b).getName();
                }
                TLRPC.Document document4 = bVar.a;
                nh0Var.e = document4;
                nh0Var.f = g0(document4, nh0Var.f);
                nh0Var.g = bVar.b;
                nh0 nh0Var3 = this.N;
                if (nh0Var3 != null && (document = nh0Var3.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                    this.N = null;
                    this.H = nh0Var;
                }
                arrayList.add(nh0Var);
            }
            i0();
            this.e.f();
            if (getMediaDataController().A0.f && this.H == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (nh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(nh0 nh0Var) {
        int i3 = nh0Var.c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i3) != null) {
            sparseArray.remove(nh0Var.c);
        } else if (!nh0Var.a) {
            return;
        } else {
            sparseArray.put(nh0Var.c, nh0Var);
        }
        h0();
        ci.r4 r4Var = this.e;
        r4Var.k(0, ((ph0) r4Var.d).h);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() <= 0) {
            this.simpleActionBar.r();
        } else {
            this.simpleActionBar.x(sparseArray.size(), this.simpleActionBar.s());
            this.simpleActionBar.B();
        }
    }

    public final void i0() {
        this.n = -1;
        this.r = -1;
        this.s = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.h = 1;
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            int i3 = this.h;
            this.n = i3;
            int size = arrayList.size() + i3;
            this.h = size;
            this.r = size;
        }
        int i10 = this.h;
        this.s = i10;
        this.h = i10 + 2;
        this.w = i10 + 1;
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.h = i12;
            this.y = i11;
            this.E = i12;
            int size2 = arrayList2.size() + i12;
            this.h = size2;
            this.F = size2;
        }
        int i13 = this.h;
        this.h = i13 + 1;
        this.x = i13;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().l2((String) arrayList.get(i10));
        }
        getNotificationCenter().k(org.telegram.messenger.hs.e5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        if (i3 != 21 || intent == null || this.O == null) {
            return;
        }
        Uri data = intent.getData();
        int i11 = org.telegram.messenger.hs.e5;
        boolean z10 = true;
        boolean z11 = false;
        if (data != null) {
            String T0 = org.telegram.messenger.g0.T0(intent.getData());
            if (T0 != null) {
                if (T0.startsWith("content://")) {
                    T0 = MediaController.t(-1L, intent.getData(), "mp3");
                }
                if (this.O.h2.Q(new File(T0))) {
                    getMediaDataController().l2(T0);
                    getNotificationCenter().k(i11, new Object[0]);
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
                    uri2 = MediaController.t(-1L, uri, "mp3");
                }
                if (this.O.h2.Q(new File(uri2))) {
                    getMediaDataController().l2(uri2);
                    getNotificationCenter().k(i11, new Object[0]);
                    z12 = true;
                }
            }
            z11 = z12;
        }
        if (z11) {
            this.O.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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
            String v = org.telegram.messenger.us.v(j10, this.Q, false);
            str2 = t4.c.f("sound_document_id_", v);
            str = t4.c.f("sound_path_", v);
        } else {
            int i3 = this.M;
            if (i3 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i3 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i3 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i3 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else {
                if (i3 != 4 && i3 != 5) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j11 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        nh0 nh0Var = new nh0();
        this.N = nh0Var;
        if (j11 != 0) {
            nh0Var.e = new TLRPC.TL_document();
            this.N.e.id = j11;
        } else {
            nh0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
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
            str = "sound_" + org.telegram.messenger.us.v(this.L, this.Q, false);
            str2 = "sound_path_" + org.telegram.messenger.us.v(this.L, this.Q, false);
            str3 = "sound_document_id_" + org.telegram.messenger.us.v(this.L, this.Q, false);
            edit.putBoolean("sound_enabled_" + org.telegram.messenger.us.v(this.L, this.Q, false), true);
        } else {
            int i3 = this.M;
            if (i3 == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundPath";
                str3 = "GlobalSoundDocId";
            } else if (i3 == 0) {
                str = "GroupSound";
                str2 = "GroupSoundPath";
                str3 = "GroupSoundDocId";
            } else if (i3 == 2) {
                str = "ChannelSound";
                str2 = "ChannelSoundPath";
                str3 = "ChannelSoundDocId";
            } else if (i3 == 3) {
                str = "StoriesSound";
                str2 = "StoriesSoundPath";
                str3 = "StoriesSoundDocId";
            } else {
                if (i3 != 5 && i3 != 4) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            }
        }
        nh0 nh0Var = this.H;
        if (nh0Var.a && (document = nh0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.H.f);
            edit.putString(str2, "NoSound");
        } else if (nh0Var.g != null) {
            edit.putString(str, nh0Var.f);
            edit.putString(str2, this.H.g);
            edit.remove(str3);
        } else if (nh0Var.b) {
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
            getNotificationsController().c0(this.L, this.Q, true);
        } else {
            getNotificationsController().b0(this.M);
            getNotificationCenter().k(org.telegram.messenger.hs.f0, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.hs.e5);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.hs.e5);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, e6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k7, e6Var);
            if (this.d != null) {
                if (w02 == this.R && w03 == this.S) {
                    return;
                }
                this.R = w02;
                this.S = w03;
                for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
                    f0(this.d.getChildAt(i3), w02, w03);
                }
                for (int i10 = 0; i10 < this.d.getCachedChildCount(); i10++) {
                    f0(this.d.P(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getHiddenChildCount(); i11++) {
                    f0(this.d.V(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getAttachedScrapChildCount(); i12++) {
                    f0(this.d.O(i12), w02, w03);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i3, long j10) {
    }
}
