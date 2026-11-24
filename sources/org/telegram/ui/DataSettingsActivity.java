package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.DataSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.d {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public long Y;
    public s30 a;
    public fv b;
    public ArrayList c;
    private int clearDraftsRow;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    private int proxyRow;
    public int r;
    private int resetDownloadRow;
    public boolean s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int w;
    public int x;
    public int y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131751614, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 10));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new s30(this, context, (byte) 3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        fv fvVar = new fv((byte) 14, context, (Object) this);
        this.b = fvVar;
        fvVar.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u46(1, false));
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new x92((Object) this, (Object) context, (byte) 15));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.b.setItemAnimator(sc3Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{vkb.class, bjb.class, jf5.class, yn7.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        int i = cmb.L6;
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.M6;
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        er3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        er3.q(this.currentAccount).s(true);
        t0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y71.i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        u73 u73Var = new u73(this, (byte) 1);
        gm.d3(u73Var, 100L);
        y71.d0(new p2c((Object) this, (Object) u73Var, System.currentTimeMillis(), (byte) 1));
        if (this.b != null && this.a != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                u69 T = this.b.T(childAt);
                if (T != null) {
                    s30 s30Var = this.a;
                    this.b.getClass();
                    s30Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        t0(false);
    }

    public final void q0() {
        dr3 dr3Var;
        dr3 dr3Var2;
        String str;
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).X3.edit();
        for (int i = 0; i < 3; i++) {
            int i2 = this.currentAccount;
            if (i == 0) {
                dr3Var = er3.q(i2).N;
                dr3Var2 = er3.q(this.currentAccount).L;
                str = "mobilePreset";
            } else if (i == 1) {
                dr3Var = er3.q(i2).O;
                dr3Var2 = er3.q(this.currentAccount).M;
                str = "wifiPreset";
            } else {
                dr3Var = er3.q(i2).P;
                dr3Var2 = er3.q(this.currentAccount).K;
                str = "roamingPreset";
            }
            dr3Var.c(dr3Var2);
            dr3Var.g = dr3Var2.b();
            er3.q(this.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            er3.q(this.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            er3.q(this.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, dr3Var.toString());
        }
        edit.commit();
        er3.q(this.currentAccount).g();
        for (int i3 = 0; i3 < 3; i3++) {
            er3.q(this.currentAccount).w(i3);
        }
        this.a.l(this.e, 4);
        t0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v3, types: [ee, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean[], hb6, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, org.telegram.ui.ActionBar.d, org.telegram.ui.DataSettingsActivity] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v21, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(Context context, View view, int i, float f) {
        dr3 dr3Var;
        dr3 dr3Var2;
        String str;
        String str2;
        String str3;
        boolean z;
        int size;
        int i2;
        LinearLayout linearLayout;
        String a0;
        ?? r11;
        boolean z2;
        int i3;
        int i4 = this.saveToGalleryGroupsRow;
        int i5 = 2;
        int i6 = 1;
        if (i == i4 || i == this.saveToGalleryChannelsRow || i == this.saveToGalleryPeerRow) {
            int i7 = i == i4 ? 2 : i == this.saveToGalleryChannelsRow ? 4 : 1;
            if ((!jb6.a0 || f > gm.L(76.0f)) && (jb6.a0 || f < view.getMeasuredWidth() - gm.L(76.0f))) {
                presentFragment(new SaveToGallerySettingsActivity(kt6.j(i7, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                pve.a(i7).b();
                gm.V3(this.b);
                return;
            }
        }
        final byte b = 0;
        if (i == this.e || i == this.f || i == this.h) {
            int i8 = 2;
            if ((!jb6.a0 || f > gm.L(76.0f)) && (jb6.a0 || f < view.getMeasuredWidth() - gm.L(76.0f))) {
                presentFragment(new DataAutoDownloadActivity(i == this.e ? 0 : i == this.h ? 1 : 2));
                return;
            }
            this.a.getClass();
            yn7 yn7Var = (yn7) view;
            boolean z3 = yn7Var.e.h;
            if (i == this.e) {
                dr3Var = er3.q(this.currentAccount).N;
                dr3Var2 = er3.q(this.currentAccount).L;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i8 = 0;
            } else {
                int i9 = this.h;
                int i10 = this.currentAccount;
                if (i == i9) {
                    dr3Var = er3.q(i10).O;
                    dr3Var2 = er3.q(this.currentAccount).M;
                    str = "wifiPreset";
                    str2 = "currentWifiPreset";
                    i8 = 1;
                } else {
                    dr3Var = er3.q(i10).P;
                    dr3Var2 = er3.q(this.currentAccount).K;
                    str = "roamingPreset";
                    str2 = "currentRoamingPreset";
                }
            }
            if (z3 || !dr3Var.g) {
                dr3Var.g = !dr3Var.g;
            } else {
                dr3Var.c(dr3Var2);
            }
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).X3.edit();
            edit.putString(str, dr3Var.toString());
            edit.putInt(str2, 3);
            edit.commit();
            yn7Var.setChecked(!z3);
            u69 G = this.b.G(view);
            if (G != null) {
                this.a.t(G, i);
            }
            er3.q(this.currentAccount).g();
            er3.q(this.currentAccount).w(i8);
            t0(false);
            return;
        }
        int i11 = 2131752542;
        Object obj = null;
        if (i == this.resetDownloadRow) {
            if (getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131745842, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131745843, null);
            alertDialog$Builder.j(jb6.M0(2131745851, null), new ee(this) { // from class: v73
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i12) {
                    byte b2 = b;
                    DataSettingsActivity dataSettingsActivity = this.b;
                    switch (b2) {
                        case 0:
                            dataSettingsActivity.q0();
                            break;
                        default:
                            dataSettingsActivity.getClass();
                            dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new tg(dataSettingsActivity, (byte) 17));
                            break;
                    }
                }
            });
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
                return;
            }
            return;
        }
        if (i == this.s) {
            presentFragment(new y71());
            return;
        }
        float f2 = 4.0f;
        if (i == this.useLessDataForCallsRow) {
            SharedPreferences d1 = oc7.d1();
            int i12 = d1.getInt("VoipDataSaving", sic.c());
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        i5 = 3;
                    } else if (i12 == 3) {
                        i5 = 1;
                    }
                }
                Activity parentActivity = getParentActivity();
                String[] strArr = {jb6.M0(2131743482, null), jb6.M0(2131743480, null), jb6.M0(2131743481, null), jb6.M0(2131743483, null)};
                String M02 = jb6.M0(2131742913, null);
                w73 w73Var = new w73(this, d1, i);
                Pattern pattern = ik.a;
                LinearLayout l = td4.l(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i3 = 0;
                for (int i13 = 4; i3 < i13; i13 = 4) {
                    x09 x09Var = new x09(parentActivity, null);
                    float f3 = f2;
                    x09Var.setPadding(gm.L(f2), 0, gm.L(f3), 0);
                    x09Var.setTag(Integer.valueOf(i3));
                    ik.a(x09Var, cmb.f7, cmb.D5, null);
                    x09Var.b(strArr[i3], i5 == i3);
                    l.addView(x09Var);
                    x09Var.setOnClickListener(new t(alertDialog$Builder2, w73Var, (byte) 14));
                    i3++;
                    f2 = f3;
                }
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M02;
                alertDialog$Builder2.n(l);
                alertDialog$Builder2.j(jb6.M0(2131752542, null), null);
                setVisibleDialog(heVar2);
                heVar2.show();
                return;
            }
            i5 = 0;
            Activity parentActivity2 = getParentActivity();
            String[] strArr2 = {jb6.M0(2131743482, null), jb6.M0(2131743480, null), jb6.M0(2131743481, null), jb6.M0(2131743483, null)};
            String M022 = jb6.M0(2131742913, null);
            w73 w73Var2 = new w73(this, d1, i);
            Pattern pattern2 = ik.a;
            LinearLayout l2 = td4.l(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i3 = 0;
            while (i3 < i13) {
            }
            he heVar22 = alertDialog$Builder22.a;
            heVar22.S = M022;
            alertDialog$Builder22.n(l2);
            alertDialog$Builder22.j(jb6.M0(2131752542, null), null);
            setVisibleDialog(heVar22);
            heVar22.show();
            return;
        }
        if (i == this.w) {
            presentFragment(new t93());
            return;
        }
        if (i != this.n) {
            if (i == this.proxyRow) {
                presentFragment(new ProxyListActivity());
                return;
            }
            if (i == this.E) {
                gda.x0 = !gda.x0;
                SharedPreferences.Editor edit2 = oc7.d1().edit();
                edit2.putBoolean("streamMedia", gda.x0);
                edit2.apply();
                ((bjb) view).setChecked(gda.x0);
                return;
            }
            if (i == this.G) {
                gda.y0 = !gda.y0;
                SharedPreferences.Editor edit3 = oc7.d1().edit();
                edit3.putBoolean("streamAllVideo", gda.y0);
                edit3.apply();
                ((bjb) view).setChecked(gda.y0);
                return;
            }
            if (i == this.H) {
                gda.z0 = !gda.z0;
                SharedPreferences.Editor edit4 = oc7.d1().edit();
                edit4.putBoolean("streamMkv", gda.z0);
                edit4.apply();
                ((bjb) view).setChecked(gda.z0);
                return;
            }
            if (i == this.F) {
                gda.A0 = !gda.A0;
                SharedPreferences.Editor edit5 = oc7.d1().edit();
                edit5.putBoolean("saveStreamMedia", gda.A0);
                edit5.apply();
                ((bjb) view).setChecked(gda.A0);
                return;
            }
            if (i == this.K) {
                boolean z4 = gda.a;
                e86.i = !e86.e(2048) ? e86.d(true) | 2048 : e86.d(true) & (-2049);
                e86.k();
                if (view instanceof bjb) {
                    ((bjb) view).setChecked(e86.e(2048));
                    return;
                }
                return;
            }
            if (i == this.L) {
                boolean z5 = gda.a;
                e86.i = !e86.e(1024) ? e86.d(true) | 1024 : e86.d(true) & (-1025);
                e86.k();
                if (view instanceof bjb) {
                    ((bjb) view).setChecked(e86.e(1024));
                    return;
                }
                return;
            }
            if (i == this.clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                String M03 = jb6.M0(2131754082, null);
                he heVar3 = alertDialog$Builder3.a;
                heVar3.S = M03;
                heVar3.U = jb6.M0(2131754083, null);
                final byte b2 = 1;
                alertDialog$Builder3.j(jb6.M0(2131751535, null), new ee(this) { // from class: v73
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = this;
                    }

                    @Override // ee
                    public final void r(he heVar23, int i122) {
                        byte b22 = b2;
                        DataSettingsActivity dataSettingsActivity = this.b;
                        switch (b22) {
                            case 0:
                                dataSettingsActivity.q0();
                                break;
                            default:
                                dataSettingsActivity.getClass();
                                dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new tg(dataSettingsActivity, (byte) 17));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
                showDialog(heVar3);
                TextView textView2 = (TextView) heVar3.c(-1);
                if (textView2 != null) {
                    anb.X(textView2, cmb.p7, null);
                    return;
                }
                return;
            }
            return;
        }
        ?? alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity());
        String M04 = jb6.M0(2131744509, null);
        he heVar4 = alertDialog$Builder4.a;
        heVar4.S = M04;
        LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
        linearLayout2.setOrientation(1);
        alertDialog$Builder4.n(linearLayout2);
        String absolutePath = ((File) this.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(gda.e0)) {
            int size2 = this.c.size();
            for (int i14 = 0; i14 < size2; i14++) {
                String absolutePath2 = ((File) this.c.get(i14)).getAbsolutePath();
                if (absolutePath2.startsWith(gda.e0)) {
                    str3 = absolutePath2;
                    break;
                }
            }
        }
        str3 = absolutePath;
        try {
        } catch (Exception unused) {
            z = true;
        }
        if (this.c.size() == 2) {
            if (((File) this.c.get(0)).getAbsolutePath().contains("/storage/emulated/") != ((File) this.c.get(1)).getAbsolutePath().contains("/storage/emulated/")) {
                z2 = false;
                z = z2;
                size = this.c.size();
                i2 = 0;
                while (i2 < size) {
                    File file = (File) this.c.get(i2);
                    int i15 = i2;
                    String absolutePath3 = file.getAbsolutePath();
                    xy5 xy5Var = new xy5(context);
                    int i16 = i6;
                    xy5Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                    xy5Var.setTag(Integer.valueOf(i15));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z || contains) {
                        ?? r112 = obj;
                        linearLayout = linearLayout2;
                        if (contains) {
                            Object[] objArr = new Object[i16];
                            objArr[0] = gm.i0(file.getFreeSpace(), false, false);
                            a0 = jb6.a0(r112, r112, 2131744507, objArr);
                            r11 = r112;
                        } else {
                            Object[] objArr2 = new Object[i16];
                            objArr2[0] = gm.i0(file.getFreeSpace(), false, false);
                            a0 = jb6.a0(r112, r112, 2131744508, objArr2);
                            r11 = r112;
                        }
                    } else {
                        linearLayout = linearLayout2;
                        Object[] objArr3 = new Object[i5];
                        objArr3[0] = gm.i0(file.getFreeSpace(), false, false);
                        objArr3[i16] = absolutePath3;
                        r11 = 0;
                        a0 = jb6.a0(null, null, 2131744506, objArr3);
                    }
                    xy5Var.b.setText(jb6.M0(contains ? 2131748945 : 2131745574, r11));
                    xy5Var.c.setText(a0);
                    RadioButton radioButton = xy5Var.a;
                    radioButton.a(false, false);
                    xy5Var.e = r11;
                    xy5Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    xy5Var.setBackground(cmb.f0(cmb.w0(r11, cmb.H5, false), 2, -1));
                    ?? r7 = linearLayout;
                    r7.addView(xy5Var);
                    xy5Var.setOnClickListener(new x73(this, absolutePath3, contains, alertDialog$Builder4, (byte) 0));
                    i2 = i15 + 1;
                    linearLayout2 = r7;
                    i5 = 2;
                    size = size;
                    obj = r11;
                    i6 = 1;
                    i11 = 2131752542;
                }
                ?? r113 = obj;
                alertDialog$Builder4.g(jb6.M0(i11, r113), r113);
                showDialog(heVar4);
            }
        }
        z2 = true;
        z = z2;
        size = this.c.size();
        i2 = 0;
        while (i2 < size) {
        }
        ?? r1132 = obj;
        alertDialog$Builder4.g(jb6.M0(i11, r1132), r1132);
        showDialog(heVar4);
    }

    public final void s0(int i) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            u69 T = this.b.T(this.b.getChildAt(i2));
            if (T != null && T.b() == i) {
                this.a.t(T, i);
                return;
            }
        }
    }

    public final void t0(boolean z) {
        int i;
        this.s = true;
        this.U = 3;
        this.w = 2;
        this.n = -1;
        ArrayList c1 = gm.c1();
        this.c = c1;
        if (c1.size() > 1) {
            int i2 = this.U;
            this.U = i2 + 1;
            this.n = i2;
        }
        int i3 = this.U;
        this.x = i3;
        this.d = i3 + 1;
        this.e = i3 + 2;
        this.h = i3 + 3;
        this.U = i3 + 5;
        this.f = i3 + 4;
        er3 downloadController = getDownloadController();
        dr3 dr3Var = downloadController.K;
        dr3 dr3Var2 = downloadController.M;
        dr3 dr3Var3 = downloadController.L;
        boolean z2 = dr3Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.g && dr3Var3.a(downloadController.n()) && dr3Var3.b() == downloadController.N.g && dr3Var2.a(downloadController.p()) && dr3Var2.b() == downloadController.O.g;
        int i4 = this.resetDownloadRow;
        if (z2) {
            i = -1;
        } else {
            i = this.U;
            this.U = i + 1;
        }
        this.resetDownloadRow = i;
        s30 s30Var = this.a;
        if (s30Var != null && !z) {
            if (i4 < 0) {
                if (i >= 0) {
                    s30Var.g(this.f);
                    this.a.i(this.resetDownloadRow);
                }
                z = true;
            } else {
                if (i < 0) {
                    s30Var.g(this.f);
                    this.a.s(i4);
                }
                z = true;
            }
        }
        int i5 = this.U;
        this.r = i5;
        this.S = i5 + 1;
        this.saveToGalleryPeerRow = i5 + 2;
        this.saveToGalleryGroupsRow = i5 + 3;
        this.saveToGalleryChannelsRow = i5 + 4;
        this.T = i5 + 5;
        this.y = i5 + 6;
        int i6 = i5 + 8;
        this.U = i6;
        this.E = i5 + 7;
        boolean z3 = e21.a;
        this.H = i6;
        this.G = i5 + 9;
        this.I = i5 + 10;
        this.F = -1;
        this.N = i5 + 11;
        this.useLessDataForCallsRow = i5 + 12;
        this.O = i5 + 13;
        this.P = i5 + 14;
        this.proxyRow = i5 + 15;
        this.Q = i5 + 16;
        this.clearDraftsRow = i5 + 17;
        this.U = i5 + 19;
        this.R = i5 + 18;
        s30 s30Var2 = this.a;
        if (s30Var2 == null || !z) {
            return;
        }
        s30Var2.f();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
