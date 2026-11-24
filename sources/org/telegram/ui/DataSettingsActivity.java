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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
    public s20 a;
    public fu b;
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
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131751665, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 9));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new s20(this, context, (byte) 3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        byte b = 14;
        fu fuVar = new fu(b, context, this);
        this.b = fuVar;
        fuVar.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new t26(1, false));
        frameLayout.addView(this.b, nme.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new v82(this, context, b));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.b.setItemAnimator(gb3Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, ahb.class, ld5.class, vl7.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        int i = bkb.L6;
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.M6;
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        up3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        up3.q(this.currentAccount).s(true);
        s0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        r61.i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        i63 i63Var = new i63(this, (byte) 1);
        gl.d3(i63Var, 100L);
        r61.c0(new p0c((Object) this, (Object) i63Var, System.currentTimeMillis(), (byte) 1));
        if (this.b != null && this.a != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                s49 T = this.b.T(childAt);
                if (T != null) {
                    s20 s20Var = this.a;
                    this.b.getClass();
                    s20Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        s0(false);
    }

    public final void p0() {
        tp3 tp3Var;
        tp3 tp3Var2;
        String str;
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).X3.edit();
        for (int i = 0; i < 3; i++) {
            int i2 = this.currentAccount;
            if (i == 0) {
                tp3Var = up3.q(i2).N;
                tp3Var2 = up3.q(this.currentAccount).L;
                str = "mobilePreset";
            } else if (i == 1) {
                tp3Var = up3.q(i2).O;
                tp3Var2 = up3.q(this.currentAccount).M;
                str = "wifiPreset";
            } else {
                tp3Var = up3.q(i2).P;
                tp3Var2 = up3.q(this.currentAccount).K;
                str = "roamingPreset";
            }
            tp3Var.c(tp3Var2);
            tp3Var.g = tp3Var2.b();
            up3.q(this.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            up3.q(this.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            up3.q(this.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, tp3Var.toString());
        }
        edit.commit();
        up3.q(this.currentAccount).g();
        for (int i3 = 0; i3 < 3; i3++) {
            up3.q(this.currentAccount).w(i3);
        }
        this.a.l(this.e, 4);
        s0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v3, types: [ed, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean[], i96, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, org.telegram.ui.ActionBar.d, org.telegram.ui.DataSettingsActivity] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v21, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(Context context, View view, int i, float f) {
        tp3 tp3Var;
        tp3 tp3Var2;
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
            if ((!k96.a0 || f > gl.L(76.0f)) && (k96.a0 || f < view.getMeasuredWidth() - gl.L(76.0f))) {
                presentFragment(new SaveToGallerySettingsActivity(ls6.j(i7, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                mte.a(i7).b();
                gl.V3(this.b);
                return;
            }
        }
        final byte b = 0;
        if (i == this.e || i == this.f || i == this.h) {
            int i8 = 2;
            if ((!k96.a0 || f > gl.L(76.0f)) && (k96.a0 || f < view.getMeasuredWidth() - gl.L(76.0f))) {
                presentFragment(new DataAutoDownloadActivity(i == this.e ? 0 : i == this.h ? 1 : 2));
                return;
            }
            this.a.getClass();
            vl7 vl7Var = (vl7) view;
            boolean z3 = vl7Var.e.h;
            if (i == this.e) {
                tp3Var = up3.q(this.currentAccount).N;
                tp3Var2 = up3.q(this.currentAccount).L;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i8 = 0;
            } else {
                int i9 = this.h;
                int i10 = this.currentAccount;
                if (i == i9) {
                    tp3Var = up3.q(i10).O;
                    tp3Var2 = up3.q(this.currentAccount).M;
                    str = "wifiPreset";
                    str2 = "currentWifiPreset";
                    i8 = 1;
                } else {
                    tp3Var = up3.q(i10).P;
                    tp3Var2 = up3.q(this.currentAccount).K;
                    str = "roamingPreset";
                    str2 = "currentRoamingPreset";
                }
            }
            if (z3 || !tp3Var.g) {
                tp3Var.g = !tp3Var.g;
            } else {
                tp3Var.c(tp3Var2);
            }
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).X3.edit();
            edit.putString(str, tp3Var.toString());
            edit.putInt(str2, 3);
            edit.commit();
            vl7Var.setChecked(!z3);
            s49 G = this.b.G(view);
            if (G != null) {
                this.a.t(G, i);
            }
            up3.q(this.currentAccount).g();
            up3.q(this.currentAccount).w(i8);
            s0(false);
            return;
        }
        int i11 = 2131752577;
        Object obj = null;
        if (i == this.resetDownloadRow) {
            if (getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131745916, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131745917, null);
            alertDialog$Builder.j(k96.M0(2131745925, null), new ed(this) { // from class: j63
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar2, int i12) {
                    byte b2 = b;
                    DataSettingsActivity dataSettingsActivity = this.b;
                    switch (b2) {
                        case 0:
                            dataSettingsActivity.p0();
                            break;
                        default:
                            dataSettingsActivity.getClass();
                            dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new tf(dataSettingsActivity, (byte) 17));
                            break;
                    }
                }
            });
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
                return;
            }
            return;
        }
        if (i == this.s) {
            presentFragment(new r61());
            return;
        }
        float f2 = 4.0f;
        if (i == this.useLessDataForCallsRow) {
            SharedPreferences c1 = na7.c1();
            int i12 = c1.getInt("VoipDataSaving", rgc.c());
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        i5 = 3;
                    } else if (i12 == 3) {
                        i5 = 1;
                    }
                }
                Activity parentActivity = getParentActivity();
                String[] strArr = {k96.M0(2131743556, null), k96.M0(2131743554, null), k96.M0(2131743555, null), k96.M0(2131743557, null)};
                String M02 = k96.M0(2131742987, null);
                k63 k63Var = new k63(this, c1, i);
                Pattern pattern = ij.a;
                LinearLayout m = ir2.m(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i3 = 0;
                for (int i13 = 4; i3 < i13; i13 = 4) {
                    wy8 wy8Var = new wy8(parentActivity, null);
                    float f3 = f2;
                    wy8Var.setPadding(gl.L(f2), 0, gl.L(f3), 0);
                    wy8Var.setTag(Integer.valueOf(i3));
                    ij.a(wy8Var, bkb.f7, bkb.D5, null);
                    wy8Var.b(strArr[i3], i5 == i3);
                    m.addView(wy8Var);
                    wy8Var.setOnClickListener(new t(alertDialog$Builder2, k63Var, (byte) 14));
                    i3++;
                    f2 = f3;
                }
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = M02;
                alertDialog$Builder2.n(m);
                alertDialog$Builder2.j(k96.M0(2131752577, null), null);
                setVisibleDialog(hdVar2);
                hdVar2.show();
                return;
            }
            i5 = 0;
            Activity parentActivity2 = getParentActivity();
            String[] strArr2 = {k96.M0(2131743556, null), k96.M0(2131743554, null), k96.M0(2131743555, null), k96.M0(2131743557, null)};
            String M022 = k96.M0(2131742987, null);
            k63 k63Var2 = new k63(this, c1, i);
            Pattern pattern2 = ij.a;
            LinearLayout m2 = ir2.m(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i3 = 0;
            while (i3 < i13) {
            }
            hd hdVar22 = alertDialog$Builder22.a;
            hdVar22.S = M022;
            alertDialog$Builder22.n(m2);
            alertDialog$Builder22.j(k96.M0(2131752577, null), null);
            setVisibleDialog(hdVar22);
            hdVar22.show();
            return;
        }
        if (i == this.w) {
            presentFragment(new h83());
            return;
        }
        if (i != this.n) {
            if (i == this.proxyRow) {
                presentFragment(new ProxyListActivity());
                return;
            }
            if (i == this.E) {
                gba.x0 = !gba.x0;
                SharedPreferences.Editor edit2 = na7.c1().edit();
                edit2.putBoolean("streamMedia", gba.x0);
                edit2.apply();
                ((ahb) view).setChecked(gba.x0);
                return;
            }
            if (i == this.G) {
                gba.y0 = !gba.y0;
                SharedPreferences.Editor edit3 = na7.c1().edit();
                edit3.putBoolean("streamAllVideo", gba.y0);
                edit3.apply();
                ((ahb) view).setChecked(gba.y0);
                return;
            }
            if (i == this.H) {
                gba.z0 = !gba.z0;
                SharedPreferences.Editor edit4 = na7.c1().edit();
                edit4.putBoolean("streamMkv", gba.z0);
                edit4.apply();
                ((ahb) view).setChecked(gba.z0);
                return;
            }
            if (i == this.F) {
                gba.A0 = !gba.A0;
                SharedPreferences.Editor edit5 = na7.c1().edit();
                edit5.putBoolean("saveStreamMedia", gba.A0);
                edit5.apply();
                ((ahb) view).setChecked(gba.A0);
                return;
            }
            if (i == this.K) {
                boolean z4 = gba.a;
                e66.i = !e66.e(2048) ? e66.d(true) | 2048 : e66.d(true) & (-2049);
                e66.k();
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(e66.e(2048));
                    return;
                }
                return;
            }
            if (i == this.L) {
                boolean z5 = gba.a;
                e66.i = !e66.e(1024) ? e66.d(true) | 1024 : e66.d(true) & (-1025);
                e66.k();
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(e66.e(1024));
                    return;
                }
                return;
            }
            if (i == this.clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                String M03 = k96.M0(2131754114, null);
                hd hdVar3 = alertDialog$Builder3.a;
                hdVar3.S = M03;
                hdVar3.U = k96.M0(2131754115, null);
                final byte b2 = 1;
                alertDialog$Builder3.j(k96.M0(2131751586, null), new ed(this) { // from class: j63
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = this;
                    }

                    @Override // ed
                    public final void u(hd hdVar23, int i122) {
                        byte b22 = b2;
                        DataSettingsActivity dataSettingsActivity = this.b;
                        switch (b22) {
                            case 0:
                                dataSettingsActivity.p0();
                                break;
                            default:
                                dataSettingsActivity.getClass();
                                dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new tf(dataSettingsActivity, (byte) 17));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.g(k96.M0(2131752577, null), null);
                showDialog(hdVar3);
                TextView textView2 = (TextView) hdVar3.c(-1);
                if (textView2 != null) {
                    zkb.X(textView2, bkb.p7, null);
                    return;
                }
                return;
            }
            return;
        }
        ?? alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity());
        String M04 = k96.M0(2131744583, null);
        hd hdVar4 = alertDialog$Builder4.a;
        hdVar4.S = M04;
        LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
        linearLayout2.setOrientation(1);
        alertDialog$Builder4.n(linearLayout2);
        String absolutePath = ((File) this.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(gba.e0)) {
            int size2 = this.c.size();
            for (int i14 = 0; i14 < size2; i14++) {
                String absolutePath2 = ((File) this.c.get(i14)).getAbsolutePath();
                if (absolutePath2.startsWith(gba.e0)) {
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
                    xw5 xw5Var = new xw5(context);
                    int i16 = i6;
                    xw5Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                    xw5Var.setTag(Integer.valueOf(i15));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z || contains) {
                        ?? r112 = obj;
                        linearLayout = linearLayout2;
                        if (contains) {
                            Object[] objArr = new Object[i16];
                            objArr[0] = gl.i0(file.getFreeSpace(), false, false);
                            a0 = k96.a0(r112, r112, 2131744581, objArr);
                            r11 = r112;
                        } else {
                            Object[] objArr2 = new Object[i16];
                            objArr2[0] = gl.i0(file.getFreeSpace(), false, false);
                            a0 = k96.a0(r112, r112, 2131744582, objArr2);
                            r11 = r112;
                        }
                    } else {
                        linearLayout = linearLayout2;
                        Object[] objArr3 = new Object[i5];
                        objArr3[0] = gl.i0(file.getFreeSpace(), false, false);
                        objArr3[i16] = absolutePath3;
                        r11 = 0;
                        a0 = k96.a0(null, null, 2131744580, objArr3);
                    }
                    xw5Var.b.setText(k96.M0(contains ? 2131748996 : 2131745648, r11));
                    xw5Var.c.setText(a0);
                    RadioButton radioButton = xw5Var.a;
                    radioButton.a(false, false);
                    xw5Var.e = r11;
                    xw5Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    xw5Var.setBackground(bkb.f0(bkb.w0(r11, bkb.H5, false), 2, -1));
                    ?? r7 = linearLayout;
                    r7.addView(xw5Var);
                    xw5Var.setOnClickListener(new l63(this, absolutePath3, contains, alertDialog$Builder4, (byte) 0));
                    i2 = i15 + 1;
                    linearLayout2 = r7;
                    i5 = 2;
                    size = size;
                    obj = r11;
                    i6 = 1;
                    i11 = 2131752577;
                }
                ?? r113 = obj;
                alertDialog$Builder4.g(k96.M0(i11, r113), r113);
                showDialog(hdVar4);
            }
        }
        z2 = true;
        z = z2;
        size = this.c.size();
        i2 = 0;
        while (i2 < size) {
        }
        ?? r1132 = obj;
        alertDialog$Builder4.g(k96.M0(i11, r1132), r1132);
        showDialog(hdVar4);
    }

    public final void r0(int i) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            s49 T = this.b.T(this.b.getChildAt(i2));
            if (T != null && T.b() == i) {
                this.a.t(T, i);
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
        ArrayList c1 = gl.c1();
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
        up3 downloadController = getDownloadController();
        tp3 tp3Var = downloadController.K;
        tp3 tp3Var2 = downloadController.M;
        tp3 tp3Var3 = downloadController.L;
        boolean z2 = tp3Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.g && tp3Var3.a(downloadController.n()) && tp3Var3.b() == downloadController.N.g && tp3Var2.a(downloadController.p()) && tp3Var2.b() == downloadController.O.g;
        int i4 = this.resetDownloadRow;
        if (z2) {
            i = -1;
        } else {
            i = this.U;
            this.U = i + 1;
        }
        this.resetDownloadRow = i;
        s20 s20Var = this.a;
        if (s20Var != null && !z) {
            if (i4 < 0) {
                if (i >= 0) {
                    s20Var.g(this.f);
                    this.a.i(this.resetDownloadRow);
                }
                z = true;
            } else {
                if (i < 0) {
                    s20Var.g(this.f);
                    this.a.r(i4);
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
        boolean z3 = w01.a;
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
        s20 s20Var2 = this.a;
        if (s20Var2 == null || !z) {
            return;
        }
        s20Var2.f();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
