// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ep7 extends d implements f42, jm7 {
    public int E;
    public int F;
    public int G;
    public cp7 H;
    public boolean I;
    public final SparseArray J;
    public z82 K;
    public long L;
    public int M;
    public cp7 N;
    public i22 O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public r59 d;
    public ny0 e;
    public final ylb f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public ep7(Bundle bundle, ylb ylbVar) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f = ylbVar;
    }

    public static void f0(View view, int i, int i2) {
        if (view instanceof y23) {
            y23 y23Var = (y23) view;
            for (int i3 = 0; i3 < y23Var.getChildCount(); i3++) {
                View childAt = y23Var.getChildAt(i3);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof sn2) {
                        sn2 sn2Var = (sn2) imageView.getDrawable();
                        Drawable drawable = sn2Var.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = sn2Var.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
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
        return (!TextUtils.isEmpty(str) || document == null) ? str : jb6.a0("SoundNameEmpty", null, 2131745012, jb6.u(document.date, true));
    }

    public final void c0(cp7 cp7Var) {
        int i = cp7Var.c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i) != null) {
            sparseArray.remove(cp7Var.c);
        } else if (!cp7Var.a) {
            return;
        } else {
            sparseArray.put(cp7Var.c, cp7Var);
        }
        h0();
        ny0 ny0Var = this.e;
        ny0Var.l(0, ((ep7) ny0Var.d).h);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bp7(this, context));
        byte b = 5;
        if (this.L == 0) {
            int i = this.M;
            if (i == 1) {
                this.simpleActionBar.setTitle(jb6.M0(2131747601, null));
            } else if (i == 0) {
                this.simpleActionBar.setTitle(jb6.M0(2131747602, null));
            } else if (i == 2) {
                this.simpleActionBar.setTitle(jb6.M0(2131747603, null));
            } else if (i == 3) {
                this.simpleActionBar.setTitle(jb6.M0(2131747599, null));
            } else if (i == 5 || i == 4) {
                this.simpleActionBar.setTitle(jb6.M0(2131747600, null));
            }
        } else {
            this.K = new z82(context, null, false, this.f);
            if (this.L >= 0) {
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.L));
                if (W1 != null) {
                    this.K.setUserAvatar(W1);
                    this.simpleActionBar.setTitle(bw2.m(0, W1.first_name, W1.last_name));
                }
            } else if (this.Q != 0) {
                TLRPC.TL_forumTopic f = getMessagesController().g4.f(-this.L, this.Q);
                no4.q(this.K.getAvatarImageView(), f, false, true, this.f);
                this.simpleActionBar.setTitle(f.title);
            } else {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.L));
                this.K.setChatAvatar(L0);
                this.simpleActionBar.setTitle(L0.title);
            }
            this.simpleActionBar.setSubtitle(jb6.M0(2131747604, null));
            gm.B2(this.K.e);
            this.simpleActionBar.addView(this.K.e, qoe.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        yja q = this.simpleActionBar.q();
        q.c(2, R.drawable.msg_forward, gm.L(54.0f), jb6.M0(2131745193, null));
        q.c(1, R.drawable.msg_delete, gm.L(54.0f), jb6.M0(2131751535, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.d = r59Var;
        r59Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, qoe.c(-1.0f, -1));
        ny0 ny0Var = new ny0(this, b);
        this.e = ny0Var;
        ny0Var.C(true);
        this.d.setAdapter(this.e);
        ((sc3) this.d.getItemAnimator()).m = false;
        ((sc3) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new u46());
        this.d.setOnItemClickListener(new k0(this, context, (byte) 17));
        this.d.setOnItemLongClickListener(new cj6(this, (byte) 19));
        getMediaDataController().A0.g(false);
        this.a.clear();
        this.b.clear();
        for (int i2 = 0; i2 < getMediaDataController().A0.e.size(); i2++) {
            jl9 jl9Var = (jl9) getMediaDataController().A0.e.get(i2);
            cp7 cp7Var = new cp7();
            int i3 = this.G;
            this.G = i3 + 1;
            cp7Var.c = i3;
            cp7Var.a = true;
            cp7Var.d = jl9Var.c;
            TLRPC.Document document3 = jl9Var.a;
            String str = document3.file_name_fixed;
            cp7Var.f = str;
            cp7Var.e = document3;
            cp7Var.f = g0(document3, str);
            cp7Var.g = jl9Var.b;
            cp7 cp7Var2 = this.N;
            if (cp7Var2 != null && (document = cp7Var2.e) != null && (document2 = jl9Var.a) != null && document.id == document2.id) {
                this.N = null;
                this.H = cp7Var;
            }
            this.a.add(cp7Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(a.b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        cp7 cp7Var3 = new cp7();
        int i4 = this.G;
        this.G = i4 + 1;
        cp7Var3.c = i4;
        cp7Var3.f = jb6.M0(2131747885, null);
        this.b.add(cp7Var3);
        cp7 cp7Var4 = new cp7();
        int i5 = this.G;
        this.G = i5 + 1;
        cp7Var4.c = i5;
        cp7Var4.f = jb6.M0(2131751536, null);
        cp7Var4.b = true;
        this.b.add(cp7Var4);
        cp7 cp7Var5 = this.N;
        if (cp7Var5 != null && cp7Var5.e == null && cp7Var5.g.equals("NoSound")) {
            this.N = null;
            this.H = cp7Var3;
        }
        cp7 cp7Var6 = this.N;
        if (cp7Var6 != null && cp7Var6.e == null && cp7Var6.g.equals("Default")) {
            this.N = null;
            this.H = cp7Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            cp7 cp7Var7 = new cp7();
            int i6 = this.G;
            this.G = i6 + 1;
            cp7Var7.c = i6;
            cp7Var7.f = string;
            cp7Var7.g = str2;
            cp7 cp7Var8 = this.N;
            if (cp7Var8 != null && cp7Var8.e == null && cp7Var8.g.equals(str2)) {
                this.N = null;
                this.H = cp7Var7;
            }
            this.b.add(cp7Var7);
        }
        if (getMediaDataController().A0.f && this.H == null) {
            this.H = cp7Var4;
            this.I = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    public final void d0() {
        this.J.clear();
        ny0 ny0Var = this.e;
        ny0Var.l(0, ((ep7) ny0Var.d).h);
        h0();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        String name;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i == nm7.i5) {
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                arrayList = this.a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((cp7) arrayList.get(i3)).d), (cp7) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            for (int i4 = 0; i4 < getMediaDataController().A0.e.size(); i4++) {
                jl9 jl9Var = (jl9) getMediaDataController().A0.e.get(i4);
                cp7 cp7Var = new cp7();
                cp7 cp7Var2 = (cp7) hashMap.get(Integer.valueOf(jl9Var.c));
                if (cp7Var2 != null) {
                    if (cp7Var2 == this.H) {
                        this.H = cp7Var;
                    }
                    cp7Var.c = cp7Var2.c;
                } else {
                    int i5 = this.G;
                    this.G = i5 + 1;
                    cp7Var.c = i5;
                }
                cp7Var.a = true;
                cp7Var.d = jl9Var.c;
                TLRPC.Document document3 = jl9Var.a;
                if (document3 != null) {
                    name = document3.file_name_fixed;
                    cp7Var.f = name;
                } else {
                    name = new File(jl9Var.b).getName();
                    cp7Var.f = name;
                }
                TLRPC.Document document4 = jl9Var.a;
                cp7Var.e = document4;
                cp7Var.f = g0(document4, name);
                cp7Var.g = jl9Var.b;
                cp7 cp7Var3 = this.N;
                if (cp7Var3 != null && (document = cp7Var3.e) != null && (document2 = jl9Var.a) != null && document.id == document2.id) {
                    this.N = null;
                    this.H = cp7Var;
                }
                arrayList.add(cp7Var);
            }
            i0();
            this.e.f();
            if (getMediaDataController().A0.f && this.H == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (cp7) arrayList2.get(0);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r11.exists() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(Context context, View view, int i) {
        ep7 ep7Var;
        Context context2;
        File file;
        if (i == this.s) {
            ep7Var = this;
            context2 = context;
            i22 i22Var = new i22(context2, ep7Var, false, false, true, this.f);
            ep7Var.O = i22Var;
            i22Var.H1 = true;
            i22Var.u3.setVisibility(8);
            i22Var.g3.setText(jb6.M0(2131752058, null));
            ep7Var.O.Z0();
            ep7Var.O.show();
        } else {
            ep7Var = this;
            context2 = context;
        }
        if (view instanceof dp7) {
            dp7 dp7Var = (dp7) view;
            if (ep7Var.simpleActionBar.x() || dp7Var.e == null) {
                ep7Var.c0(dp7Var.e);
                return;
            }
            Ringtone ringtone = ep7Var.P;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                cp7 cp7Var = dp7Var.e;
                if (cp7Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    ep7Var.P = ringtone2;
                    ringtone2.play();
                } else {
                    String str = cp7Var.g;
                    if (str != null && !cp7Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(dp7Var.e.g));
                        ringtone3.setStreamType(4);
                        ep7Var.P = ringtone3;
                        ringtone3.play();
                    } else if (cp7Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(dp7Var.e.g);
                        }
                        file = null;
                        if (file == null) {
                            bc4 fileLoader = ep7Var.getFileLoader();
                            TLRPC.Document document = dp7Var.e.e;
                            fileLoader.getClass();
                            file = bc4.I(document);
                        }
                        if (file == null || !file.exists()) {
                            bc4 fileLoader2 = ep7Var.getFileLoader();
                            TLRPC.Document document2 = dp7Var.e.e;
                            fileLoader2.X(document2, document2, 3, 0);
                        } else {
                            Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                            ringtone4.setStreamType(4);
                            ep7Var.P = ringtone4;
                            ringtone4.play();
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            ep7Var.N = null;
            ep7Var.H = dp7Var.e;
            ep7Var.I = true;
            ny0 ny0Var = ep7Var.e;
            ny0Var.l(0, ((ep7) ny0Var.d).h);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        int size = sparseArray.size();
        rja rjaVar = this.simpleActionBar;
        if (size <= 0) {
            rjaVar.w();
        } else {
            rjaVar.F(sparseArray.size(), this.simpleActionBar.x());
            this.simpleActionBar.J();
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
            int i = this.h;
            this.n = i;
            int size = arrayList.size() + i;
            this.h = size;
            this.r = size;
        }
        int i2 = this.h;
        this.s = i2;
        this.h = i2 + 2;
        this.w = i2 + 1;
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            int i3 = this.h;
            int i4 = i3 + 1;
            this.h = i4;
            this.y = i3;
            this.E = i4;
            int size2 = arrayList2.size() + i4;
            this.h = size2;
            this.F = size2;
        }
        int i5 = this.h;
        this.h = i5 + 1;
        this.x = i5;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // f42
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            getMediaDataController().n2((String) arrayList.get(i2));
        }
        getNotificationCenter().k(nm7.i5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i != 21 || intent == null || this.O == null) {
            return;
        }
        Uri data = intent.getData();
        int i3 = nm7.i5;
        boolean z = true;
        boolean z2 = false;
        if (data != null) {
            String S0 = gm.S0(intent.getData());
            if (S0 != null) {
                if (S0.startsWith("content://")) {
                    S0 = MediaController.o(-1L, intent.getData(), "mp3");
                }
                if (this.O.j2.P(new File(S0))) {
                    getMediaDataController().n2(S0);
                    getNotificationCenter().k(i3, new Object[0]);
                    z2 = z;
                }
            }
            z = false;
            z2 = z;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z3 = false;
            for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                Uri uri = clipData.getItemAt(i4).getUri();
                String uri2 = uri.toString();
                if (uri2.startsWith("content://")) {
                    uri2 = MediaController.o(-1L, uri, "mp3");
                }
                if (this.O.j2.P(new File(uri2))) {
                    getMediaDataController().n2(uri2);
                    getNotificationCenter().k(i3, new Object[0]);
                    z3 = true;
                }
            }
            z2 = z3;
        }
        if (z2) {
            this.O.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j = this.L;
        if (j != 0) {
            String p = lo7.p(j, this.Q, false);
            str2 = b10.h("sound_document_id_", p);
            str = b10.h("sound_path_", p);
        } else {
            int i = this.M;
            if (i == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else {
                if (i != 4 && i != 5) {
                    zo4.k("Unsupported type");
                    return false;
                }
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j2 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        cp7 cp7Var = new cp7();
        this.N = cp7Var;
        if (j2 != 0) {
            cp7Var.e = new TLRPC.TL_document();
            this.N.e.id = j2;
        } else {
            cp7Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
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
            str = "sound_" + lo7.p(this.L, this.Q, false);
            str2 = "sound_path_" + lo7.p(this.L, this.Q, false);
            str3 = "sound_document_id_" + lo7.p(this.L, this.Q, false);
            edit.putBoolean("sound_enabled_" + lo7.p(this.L, this.Q, false), true);
        } else {
            int i = this.M;
            if (i == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundPath";
                str3 = "GlobalSoundDocId";
            } else if (i == 0) {
                str = "GroupSound";
                str2 = "GroupSoundPath";
                str3 = "GroupSoundDocId";
            } else if (i == 2) {
                str = "ChannelSound";
                str2 = "ChannelSoundPath";
                str3 = "ChannelSoundDocId";
            } else if (i == 3) {
                str = "StoriesSound";
                str2 = "StoriesSoundPath";
                str3 = "StoriesSoundDocId";
            } else if (i != 5 && i != 4) {
                zo4.k("Unsupported type");
                return;
            } else {
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            }
        }
        cp7 cp7Var = this.H;
        if (cp7Var.a && (document = cp7Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.H.f);
            edit.putString(str2, "NoSound");
        } else if (cp7Var.g != null) {
            edit.putString(str, cp7Var.f);
            edit.putString(str2, this.H.g);
            edit.remove(str3);
        } else if (cp7Var.b) {
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
            getNotificationCenter().k(nm7.f0, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, nm7.i5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        getNotificationCenter().b(this, nm7.i5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        ylb ylbVar = this.f;
        try {
            int v0 = cmb.v0(cmb.M6, ylbVar);
            int v02 = cmb.v0(cmb.j7, ylbVar);
            if (this.d != null) {
                if (v0 == this.R && v02 == this.S) {
                    return;
                }
                this.R = v0;
                this.S = v02;
                for (int i = 0; i < this.d.getChildCount(); i++) {
                    f0(this.d.getChildAt(i), v0, v02);
                }
                for (int i2 = 0; i2 < this.d.getCachedChildCount(); i2++) {
                    f0(this.d.P(i2), v0, v02);
                }
                for (int i3 = 0; i3 < this.d.getHiddenChildCount(); i3++) {
                    f0(this.d.W(i3), v0, v02);
                }
                for (int i4 = 0; i4 < this.d.getAttachedScrapChildCount(); i4++) {
                    f0(this.d.O(i4), v0, v02);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // f42
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // f42
    public final void S() {
    }

    @Override // f42
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
