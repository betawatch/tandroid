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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class aq7 extends e implements k32, fn7 {
    public int E;
    public int F;
    public int G;
    public yp7 H;
    public boolean I;
    public final SparseArray J;
    public f82 K;
    public long L;
    public int M;
    public yp7 N;
    public n12 O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public d79 d;
    public ox0 e;
    public final vnb f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public aq7(Bundle bundle, vnb vnbVar) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f = vnbVar;
    }

    public static void e0(View view, int i, int i2) {
        if (view instanceof f23) {
            f23 f23Var = (f23) view;
            for (int i3 = 0; i3 < f23Var.getChildCount(); i3++) {
                View childAt = f23Var.getChildAt(i3);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof zm2) {
                        zm2 zm2Var = (zm2) imageView.getDrawable();
                        Drawable drawable = zm2Var.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = zm2Var.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String f0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : ob6.a0("SoundNameEmpty", null, 2131745006, ob6.u(document.date, true));
    }

    public final void b0(yp7 yp7Var) {
        int i = yp7Var.c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i) != null) {
            sparseArray.remove(yp7Var.c);
        } else if (!yp7Var.a) {
            return;
        } else {
            sparseArray.put(yp7Var.c, yp7Var);
        }
        g0();
        ox0 ox0Var = this.e;
        ox0Var.l(0, ((aq7) ox0Var.d).h);
    }

    public final void c0() {
        this.J.clear();
        ox0 ox0Var = this.e;
        ox0Var.l(0, ((aq7) ox0Var.d).h);
        g0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new xp7(this, context));
        byte b = 5;
        if (this.L == 0) {
            int i = this.M;
            if (i == 1) {
                this.simpleActionBar.setTitle(ob6.M0(2131747595, null));
            } else if (i == 0) {
                this.simpleActionBar.setTitle(ob6.M0(2131747596, null));
            } else if (i == 2) {
                this.simpleActionBar.setTitle(ob6.M0(2131747597, null));
            } else if (i == 3) {
                this.simpleActionBar.setTitle(ob6.M0(2131747593, null));
            } else if (i == 5 || i == 4) {
                this.simpleActionBar.setTitle(ob6.M0(2131747594, null));
            }
        } else {
            this.K = new f82(context, null, false, this.f);
            if (this.L >= 0) {
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.L));
                if (X1 != null) {
                    this.K.setUserAvatar(X1);
                    this.simpleActionBar.setTitle(lv2.m(0, X1.first_name, X1.last_name));
                }
            } else if (this.Q != 0) {
                TLRPC.TL_forumTopic f = getMessagesController().h4.f(-this.L, this.Q);
                ro4.q(this.K.getAvatarImageView(), f, false, true, this.f);
                this.simpleActionBar.setTitle(f.title);
            } else {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L));
                this.K.setChatAvatar(M0);
                this.simpleActionBar.setTitle(M0.title);
            }
            this.simpleActionBar.setSubtitle(ob6.M0(2131747598, null));
            hl.B2(this.K.e);
            this.simpleActionBar.addView(this.K.e, tre.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        rla r = this.simpleActionBar.r();
        r.c(2, R.drawable.msg_forward, hl.L(54.0f), ob6.M0(2131745187, null));
        r.c(1, R.drawable.msg_delete, hl.L(54.0f), ob6.M0(2131751563, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.d = d79Var;
        d79Var.s1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, tre.c(-1.0f, -1));
        ox0 ox0Var = new ox0(this, b);
        this.e = ox0Var;
        ox0Var.C(true);
        this.d.setAdapter(this.e);
        ((zb3) this.d.getItemAnimator()).m = false;
        ((zb3) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new x46());
        this.d.setOnItemClickListener(new l0(this, context, (byte) 17));
        this.d.setOnItemLongClickListener(new bm6(this, (byte) 21));
        getMediaDataController().A0.g(false);
        this.a.clear();
        this.b.clear();
        for (int i2 = 0; i2 < getMediaDataController().A0.e.size(); i2++) {
            vm9 vm9Var = (vm9) getMediaDataController().A0.e.get(i2);
            yp7 yp7Var = new yp7();
            int i3 = this.G;
            this.G = i3 + 1;
            yp7Var.c = i3;
            yp7Var.a = true;
            yp7Var.d = vm9Var.c;
            TLRPC.Document document3 = vm9Var.a;
            String str = document3.file_name_fixed;
            yp7Var.f = str;
            yp7Var.e = document3;
            yp7Var.f = f0(document3, str);
            yp7Var.g = vm9Var.b;
            yp7 yp7Var2 = this.N;
            if (yp7Var2 != null && (document = yp7Var2.e) != null && (document2 = vm9Var.a) != null && document.id == document2.id) {
                this.N = null;
                this.H = yp7Var;
            }
            this.a.add(yp7Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(a.b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        yp7 yp7Var3 = new yp7();
        int i4 = this.G;
        this.G = i4 + 1;
        yp7Var3.c = i4;
        yp7Var3.f = ob6.M0(2131747882, null);
        this.b.add(yp7Var3);
        yp7 yp7Var4 = new yp7();
        int i5 = this.G;
        this.G = i5 + 1;
        yp7Var4.c = i5;
        yp7Var4.f = ob6.M0(2131751564, null);
        yp7Var4.b = true;
        this.b.add(yp7Var4);
        yp7 yp7Var5 = this.N;
        if (yp7Var5 != null && yp7Var5.e == null && yp7Var5.g.equals("NoSound")) {
            this.N = null;
            this.H = yp7Var3;
        }
        yp7 yp7Var6 = this.N;
        if (yp7Var6 != null && yp7Var6.e == null && yp7Var6.g.equals("Default")) {
            this.N = null;
            this.H = yp7Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            yp7 yp7Var7 = new yp7();
            int i6 = this.G;
            this.G = i6 + 1;
            yp7Var7.c = i6;
            yp7Var7.f = string;
            yp7Var7.g = str2;
            yp7 yp7Var8 = this.N;
            if (yp7Var8 != null && yp7Var8.e == null && yp7Var8.g.equals(str2)) {
                this.N = null;
                this.H = yp7Var7;
            }
            this.b.add(yp7Var7);
        }
        if (getMediaDataController().A0.f && this.H == null) {
            this.H = yp7Var4;
            this.I = true;
        }
        h0();
        h0();
        return this.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r11.exists() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(Context context, View view, int i) {
        aq7 aq7Var;
        Context context2;
        File file;
        if (i == this.s) {
            aq7Var = this;
            context2 = context;
            n12 n12Var = new n12(context2, aq7Var, false, false, true, this.f);
            aq7Var.O = n12Var;
            n12Var.H1 = true;
            n12Var.u3.setVisibility(8);
            n12Var.g3.setText(ob6.M0(2131752086, null));
            aq7Var.O.a1();
            aq7Var.O.show();
        } else {
            aq7Var = this;
            context2 = context;
        }
        if (view instanceof zp7) {
            zp7 zp7Var = (zp7) view;
            if (aq7Var.simpleActionBar.z() || zp7Var.e == null) {
                aq7Var.b0(zp7Var.e);
                return;
            }
            Ringtone ringtone = aq7Var.P;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                yp7 yp7Var = zp7Var.e;
                if (yp7Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    aq7Var.P = ringtone2;
                    ringtone2.play();
                } else {
                    String str = yp7Var.g;
                    if (str != null && !yp7Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(zp7Var.e.g));
                        ringtone3.setStreamType(4);
                        aq7Var.P = ringtone3;
                        ringtone3.play();
                    } else if (yp7Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(zp7Var.e.g);
                        }
                        file = null;
                        if (file == null) {
                            xb4 fileLoader = aq7Var.getFileLoader();
                            TLRPC.Document document = zp7Var.e.e;
                            fileLoader.getClass();
                            file = xb4.I(document);
                        }
                        if (file == null || !file.exists()) {
                            xb4 fileLoader2 = aq7Var.getFileLoader();
                            TLRPC.Document document2 = zp7Var.e.e;
                            fileLoader2.X(document2, document2, 3, 0);
                        } else {
                            Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                            ringtone4.setStreamType(4);
                            aq7Var.P = ringtone4;
                            ringtone4.play();
                        }
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            aq7Var.N = null;
            aq7Var.H = zp7Var.e;
            aq7Var.I = true;
            ox0 ox0Var = aq7Var.e;
            ox0Var.l(0, ((aq7) ox0Var.d).h);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        String name;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i == jn7.h5) {
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                arrayList = this.a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((yp7) arrayList.get(i3)).d), (yp7) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            for (int i4 = 0; i4 < getMediaDataController().A0.e.size(); i4++) {
                vm9 vm9Var = (vm9) getMediaDataController().A0.e.get(i4);
                yp7 yp7Var = new yp7();
                yp7 yp7Var2 = (yp7) hashMap.get(Integer.valueOf(vm9Var.c));
                if (yp7Var2 != null) {
                    if (yp7Var2 == this.H) {
                        this.H = yp7Var;
                    }
                    yp7Var.c = yp7Var2.c;
                } else {
                    int i5 = this.G;
                    this.G = i5 + 1;
                    yp7Var.c = i5;
                }
                yp7Var.a = true;
                yp7Var.d = vm9Var.c;
                TLRPC.Document document3 = vm9Var.a;
                if (document3 != null) {
                    name = document3.file_name_fixed;
                    yp7Var.f = name;
                } else {
                    name = new File(vm9Var.b).getName();
                    yp7Var.f = name;
                }
                TLRPC.Document document4 = vm9Var.a;
                yp7Var.e = document4;
                yp7Var.f = f0(document4, name);
                yp7Var.g = vm9Var.b;
                yp7 yp7Var3 = this.N;
                if (yp7Var3 != null && (document = yp7Var3.e) != null && (document2 = vm9Var.a) != null && document.id == document2.id) {
                    this.N = null;
                    this.H = yp7Var;
                }
                arrayList.add(yp7Var);
            }
            h0();
            this.e.f();
            if (getMediaDataController().A0.f && this.H == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (yp7) arrayList2.get(0);
                }
            }
        }
    }

    public final void g0() {
        SparseArray sparseArray = this.J;
        int size = sparseArray.size();
        jla jlaVar = this.simpleActionBar;
        if (size <= 0) {
            jlaVar.y();
        } else {
            jlaVar.H(sparseArray.size(), this.simpleActionBar.z());
            this.simpleActionBar.L();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        return this.f;
    }

    public final void h0() {
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // k32
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            getMediaDataController().n2((String) arrayList.get(i2));
        }
        getNotificationCenter().k(jn7.h5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i != 21 || intent == null || this.O == null) {
            return;
        }
        Uri data = intent.getData();
        int i3 = jn7.h5;
        boolean z = true;
        boolean z2 = false;
        if (data != null) {
            String S0 = hl.S0(intent.getData());
            if (S0 != null) {
                if (S0.startsWith("content://")) {
                    S0 = MediaController.q(-1L, intent.getData(), "mp3");
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
                    uri2 = MediaController.q(-1L, uri, "mp3");
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

    @Override // org.telegram.ui.ActionBar.e
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
            String p = ip7.p(j, this.Q, false);
            str2 = c00.i("sound_document_id_", p);
            str = c00.i("sound_path_", p);
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
                    xi4.l("Unsupported type");
                    return false;
                }
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j2 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        yp7 yp7Var = new yp7();
        this.N = yp7Var;
        if (j2 != 0) {
            yp7Var.e = new TLRPC.TL_document();
            this.N.e.id = j2;
        } else {
            yp7Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
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
            str = "sound_" + ip7.p(this.L, this.Q, false);
            str2 = "sound_path_" + ip7.p(this.L, this.Q, false);
            str3 = "sound_document_id_" + ip7.p(this.L, this.Q, false);
            edit.putBoolean("sound_enabled_" + ip7.p(this.L, this.Q, false), true);
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
                xi4.l("Unsupported type");
                return;
            } else {
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            }
        }
        yp7 yp7Var = this.H;
        if (yp7Var.a && (document = yp7Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.H.f);
            edit.putString(str2, "NoSound");
        } else if (yp7Var.g != null) {
            edit.putString(str, yp7Var.f);
            edit.putString(str2, this.H.g);
            edit.remove(str3);
        } else if (yp7Var.b) {
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
            getNotificationCenter().k(jn7.f0, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, jn7.h5);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        getNotificationCenter().b(this, jn7.h5);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        vnb vnbVar = this.f;
        try {
            int v0 = aob.v0(aob.N6, vnbVar);
            int v02 = aob.v0(aob.k7, vnbVar);
            if (this.d != null) {
                if (v0 == this.R && v02 == this.S) {
                    return;
                }
                this.R = v0;
                this.S = v02;
                for (int i = 0; i < this.d.getChildCount(); i++) {
                    e0(this.d.getChildAt(i), v0, v02);
                }
                for (int i2 = 0; i2 < this.d.getCachedChildCount(); i2++) {
                    e0(this.d.Q(i2), v0, v02);
                }
                for (int i3 = 0; i3 < this.d.getHiddenChildCount(); i3++) {
                    e0(this.d.X(i3), v0, v02);
                }
                for (int i4 = 0; i4 < this.d.getAttachedScrapChildCount(); i4++) {
                    e0(this.d.P(i4), v0, v02);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // k32
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // k32
    public final void S() {
    }

    @Override // k32
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
