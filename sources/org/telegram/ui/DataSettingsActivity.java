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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.e {
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
    public t20 a;
    public gu b;
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

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131751642, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 10));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new t20(this, context, (byte) 3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        gu guVar = new gu((byte) 14, context, (Object) this);
        this.b = guVar;
        guVar.s1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new x46(1, false));
        frameLayout.addView(this.b, tre.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new q72((Object) this, (Object) context, (byte) 18));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.b.setItemAnimator(zb3Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, wkb.class, mf5.class, uo7.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        int i = aob.M6;
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.N6;
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        lq3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        lq3.q(this.currentAccount).s(true);
        s0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        z61.i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        b73 b73Var = new b73(this, (byte) 1);
        hl.d3(b73Var, 100L);
        z61.c0(new p4c((Object) this, (Object) b73Var, System.currentTimeMillis(), (byte) 1));
        if (this.b != null && this.a != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                f89 U = this.b.U(childAt);
                if (U != null) {
                    t20 t20Var = this.a;
                    this.b.getClass();
                    t20Var.t(U, RecyclerView.S(childAt));
                }
            }
        }
        s0(false);
    }

    public final void p0() {
        kq3 kq3Var;
        kq3 kq3Var2;
        String str;
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
        for (int i = 0; i < 3; i++) {
            int i2 = this.currentAccount;
            if (i == 0) {
                kq3Var = lq3.q(i2).N;
                kq3Var2 = lq3.q(this.currentAccount).L;
                str = "mobilePreset";
            } else if (i == 1) {
                kq3Var = lq3.q(i2).O;
                kq3Var2 = lq3.q(this.currentAccount).M;
                str = "wifiPreset";
            } else {
                kq3Var = lq3.q(i2).P;
                kq3Var2 = lq3.q(this.currentAccount).K;
                str = "roamingPreset";
            }
            kq3Var.c(kq3Var2);
            kq3Var.g = kq3Var2.b();
            lq3.q(this.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            lq3.q(this.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            lq3.q(this.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, kq3Var.toString());
        }
        edit.commit();
        lq3.q(this.currentAccount).g();
        for (int i3 = 0; i3 < 3; i3++) {
            lq3.q(this.currentAccount).w(i3);
        }
        this.a.l(this.e, 4);
        s0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v3, types: [fd, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean[], java.lang.String, mb6] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, org.telegram.ui.ActionBar.e, org.telegram.ui.DataSettingsActivity] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v21, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(Context context, View view, int i, float f) {
        kq3 kq3Var;
        kq3 kq3Var2;
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
            if ((!ob6.a0 || f > hl.L(76.0f)) && (ob6.a0 || f < view.getMeasuredWidth() - hl.L(76.0f))) {
                presentFragment(new SaveToGallerySettingsActivity(qu6.j(i7, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                eye.a(i7).b();
                hl.V3(this.b);
                return;
            }
        }
        final byte b = 0;
        if (i == this.e || i == this.f || i == this.h) {
            int i8 = 2;
            if ((!ob6.a0 || f > hl.L(76.0f)) && (ob6.a0 || f < view.getMeasuredWidth() - hl.L(76.0f))) {
                presentFragment(new DataAutoDownloadActivity(i == this.e ? 0 : i == this.h ? 1 : 2));
                return;
            }
            this.a.getClass();
            uo7 uo7Var = (uo7) view;
            boolean z3 = uo7Var.e.h;
            if (i == this.e) {
                kq3Var = lq3.q(this.currentAccount).N;
                kq3Var2 = lq3.q(this.currentAccount).L;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i8 = 0;
            } else {
                int i9 = this.h;
                int i10 = this.currentAccount;
                if (i == i9) {
                    kq3Var = lq3.q(i10).O;
                    kq3Var2 = lq3.q(this.currentAccount).M;
                    str = "wifiPreset";
                    str2 = "currentWifiPreset";
                    i8 = 1;
                } else {
                    kq3Var = lq3.q(i10).P;
                    kq3Var2 = lq3.q(this.currentAccount).K;
                    str = "roamingPreset";
                    str2 = "currentRoamingPreset";
                }
            }
            if (z3 || !kq3Var.g) {
                kq3Var.g = !kq3Var.g;
            } else {
                kq3Var.c(kq3Var2);
            }
            SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
            edit.putString(str, kq3Var.toString());
            edit.putInt(str2, 3);
            edit.commit();
            uo7Var.setChecked(!z3);
            f89 H = this.b.H(view);
            if (H != null) {
                this.a.t(H, i);
            }
            lq3.q(this.currentAccount).g();
            lq3.q(this.currentAccount).w(i8);
            s0(false);
            return;
        }
        int i11 = 2131752570;
        Object obj = null;
        if (i == this.resetDownloadRow) {
            if (getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131745836, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131745837, null);
            alertDialog$Builder.j(ob6.M0(2131745845, null), new fd(this) { // from class: c73
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar2, int i12) {
                    byte b2 = b;
                    DataSettingsActivity dataSettingsActivity = this.b;
                    switch (b2) {
                        case 0:
                            dataSettingsActivity.p0();
                            break;
                        default:
                            dataSettingsActivity.getClass();
                            dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new ye(dataSettingsActivity, (byte) 17));
                            break;
                    }
                }
            });
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
                return;
            }
            return;
        }
        if (i == this.s) {
            presentFragment(new z61());
            return;
        }
        float f2 = 4.0f;
        if (i == this.useLessDataForCallsRow) {
            SharedPreferences e1 = uc7.e1();
            int i12 = e1.getInt("VoipDataSaving", xkc.c());
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        i5 = 3;
                    } else if (i12 == 3) {
                        i5 = 1;
                    }
                }
                Activity parentActivity = getParentActivity();
                String[] strArr = {ob6.M0(2131743450, null), ob6.M0(2131743448, null), ob6.M0(2131743449, null), ob6.M0(2131743451, null)};
                String M02 = ob6.M0(2131742881, null);
                d73 d73Var = new d73(this, e1, i);
                Pattern pattern = jj.a;
                LinearLayout m = bs2.m(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i3 = 0;
                for (int i13 = 4; i3 < i13; i13 = 4) {
                    j29 j29Var = new j29(parentActivity, null);
                    float f3 = f2;
                    j29Var.setPadding(hl.L(f2), 0, hl.L(f3), 0);
                    j29Var.setTag(Integer.valueOf(i3));
                    jj.a(j29Var, aob.g7, aob.E5, null);
                    j29Var.b(strArr[i3], i5 == i3);
                    m.addView(j29Var);
                    j29Var.setOnClickListener(new t(alertDialog$Builder2, d73Var, (byte) 14));
                    i3++;
                    f2 = f3;
                }
                id idVar2 = alertDialog$Builder2.a;
                idVar2.S = M02;
                alertDialog$Builder2.n(m);
                alertDialog$Builder2.j(ob6.M0(2131752570, null), null);
                setVisibleDialog(idVar2);
                idVar2.show();
                return;
            }
            i5 = 0;
            Activity parentActivity2 = getParentActivity();
            String[] strArr2 = {ob6.M0(2131743450, null), ob6.M0(2131743448, null), ob6.M0(2131743449, null), ob6.M0(2131743451, null)};
            String M022 = ob6.M0(2131742881, null);
            d73 d73Var2 = new d73(this, e1, i);
            Pattern pattern2 = jj.a;
            LinearLayout m2 = bs2.m(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i3 = 0;
            while (i3 < i13) {
            }
            id idVar22 = alertDialog$Builder22.a;
            idVar22.S = M022;
            alertDialog$Builder22.n(m2);
            alertDialog$Builder22.j(ob6.M0(2131752570, null), null);
            setVisibleDialog(idVar22);
            idVar22.show();
            return;
        }
        if (i == this.w) {
            presentFragment(new a93());
            return;
        }
        if (i != this.n) {
            if (i == this.proxyRow) {
                presentFragment(new ProxyListActivity());
                return;
            }
            if (i == this.E) {
                xea.x0 = !xea.x0;
                SharedPreferences.Editor edit2 = uc7.e1().edit();
                edit2.putBoolean("streamMedia", xea.x0);
                edit2.apply();
                ((wkb) view).setChecked(xea.x0);
                return;
            }
            if (i == this.G) {
                xea.y0 = !xea.y0;
                SharedPreferences.Editor edit3 = uc7.e1().edit();
                edit3.putBoolean("streamAllVideo", xea.y0);
                edit3.apply();
                ((wkb) view).setChecked(xea.y0);
                return;
            }
            if (i == this.H) {
                xea.z0 = !xea.z0;
                SharedPreferences.Editor edit4 = uc7.e1().edit();
                edit4.putBoolean("streamMkv", xea.z0);
                edit4.apply();
                ((wkb) view).setChecked(xea.z0);
                return;
            }
            if (i == this.F) {
                xea.A0 = !xea.A0;
                SharedPreferences.Editor edit5 = uc7.e1().edit();
                edit5.putBoolean("saveStreamMedia", xea.A0);
                edit5.apply();
                ((wkb) view).setChecked(xea.A0);
                return;
            }
            if (i == this.K) {
                boolean z4 = xea.a;
                i86.i = !i86.e(2048) ? i86.d(true) | 2048 : i86.d(true) & (-2049);
                i86.k();
                if (view instanceof wkb) {
                    ((wkb) view).setChecked(i86.e(2048));
                    return;
                }
                return;
            }
            if (i == this.L) {
                boolean z5 = xea.a;
                i86.i = !i86.e(1024) ? i86.d(true) | 1024 : i86.d(true) & (-1025);
                i86.k();
                if (view instanceof wkb) {
                    ((wkb) view).setChecked(i86.e(1024));
                    return;
                }
                return;
            }
            if (i == this.clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                String M03 = ob6.M0(2131754110, null);
                id idVar3 = alertDialog$Builder3.a;
                idVar3.S = M03;
                idVar3.U = ob6.M0(2131754111, null);
                final byte b2 = 1;
                alertDialog$Builder3.j(ob6.M0(2131751563, null), new fd(this) { // from class: c73
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = this;
                    }

                    @Override // fd
                    public final void w(id idVar23, int i122) {
                        byte b22 = b2;
                        DataSettingsActivity dataSettingsActivity = this.b;
                        switch (b22) {
                            case 0:
                                dataSettingsActivity.p0();
                                break;
                            default:
                                dataSettingsActivity.getClass();
                                dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new ye(dataSettingsActivity, (byte) 17));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
                showDialog(idVar3);
                TextView textView2 = (TextView) idVar3.c(-1);
                if (textView2 != null) {
                    yob.X(textView2, aob.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        ?? alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity());
        String M04 = ob6.M0(2131744477, null);
        id idVar4 = alertDialog$Builder4.a;
        idVar4.S = M04;
        LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
        linearLayout2.setOrientation(1);
        alertDialog$Builder4.n(linearLayout2);
        String absolutePath = ((File) this.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(xea.e0)) {
            int size2 = this.c.size();
            for (int i14 = 0; i14 < size2; i14++) {
                String absolutePath2 = ((File) this.c.get(i14)).getAbsolutePath();
                if (absolutePath2.startsWith(xea.e0)) {
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
                    cz5 cz5Var = new cz5(context);
                    int i16 = i6;
                    cz5Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                    cz5Var.setTag(Integer.valueOf(i15));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z || contains) {
                        ?? r112 = obj;
                        linearLayout = linearLayout2;
                        if (contains) {
                            Object[] objArr = new Object[i16];
                            objArr[0] = hl.i0(file.getFreeSpace(), false, false);
                            a0 = ob6.a0(r112, r112, 2131744475, objArr);
                            r11 = r112;
                        } else {
                            Object[] objArr2 = new Object[i16];
                            objArr2[0] = hl.i0(file.getFreeSpace(), false, false);
                            a0 = ob6.a0(r112, r112, 2131744476, objArr2);
                            r11 = r112;
                        }
                    } else {
                        linearLayout = linearLayout2;
                        Object[] objArr3 = new Object[i5];
                        objArr3[0] = hl.i0(file.getFreeSpace(), false, false);
                        objArr3[i16] = absolutePath3;
                        r11 = 0;
                        a0 = ob6.a0(null, null, 2131744474, objArr3);
                    }
                    cz5Var.b.setText(ob6.M0(contains ? 2131748942 : 2131745568, r11));
                    cz5Var.c.setText(a0);
                    RadioButton radioButton = cz5Var.a;
                    radioButton.a(false, false);
                    cz5Var.e = r11;
                    cz5Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    cz5Var.setBackground(aob.f0(aob.w0(r11, aob.I5, false), 2, -1));
                    ?? r7 = linearLayout;
                    r7.addView(cz5Var);
                    cz5Var.setOnClickListener(new e73(this, absolutePath3, contains, alertDialog$Builder4, (byte) 0));
                    i2 = i15 + 1;
                    linearLayout2 = r7;
                    i5 = 2;
                    size = size;
                    obj = r11;
                    i6 = 1;
                    i11 = 2131752570;
                }
                ?? r113 = obj;
                alertDialog$Builder4.g(ob6.M0(i11, r113), r113);
                showDialog(idVar4);
            }
        }
        z2 = true;
        z = z2;
        size = this.c.size();
        i2 = 0;
        while (i2 < size) {
        }
        ?? r1132 = obj;
        alertDialog$Builder4.g(ob6.M0(i11, r1132), r1132);
        showDialog(idVar4);
    }

    public final void r0(int i) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            f89 U = this.b.U(this.b.getChildAt(i2));
            if (U != null && U.b() == i) {
                this.a.t(U, i);
                return;
            }
        }
    }

    public final void s0(boolean z) {
        int i;
        this.s = true;
        this.U = 3;
        this.w = 2;
        this.n = -1;
        ArrayList c1 = hl.c1();
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
        lq3 downloadController = getDownloadController();
        kq3 kq3Var = downloadController.K;
        kq3 kq3Var2 = downloadController.M;
        kq3 kq3Var3 = downloadController.L;
        boolean z2 = kq3Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.g && kq3Var3.a(downloadController.n()) && kq3Var3.b() == downloadController.N.g && kq3Var2.a(downloadController.p()) && kq3Var2.b() == downloadController.O.g;
        int i4 = this.resetDownloadRow;
        if (z2) {
            i = -1;
        } else {
            i = this.U;
            this.U = i + 1;
        }
        this.resetDownloadRow = i;
        t20 t20Var = this.a;
        if (t20Var != null && !z) {
            if (i4 < 0) {
                if (i >= 0) {
                    t20Var.g(this.f);
                    this.a.i(this.resetDownloadRow);
                }
                z = true;
            } else {
                if (i < 0) {
                    t20Var.g(this.f);
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
        boolean z3 = f11.a;
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
        t20 t20Var2 = this.a;
        if (t20Var2 == null || !z) {
            return;
        }
        t20Var2.f();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
