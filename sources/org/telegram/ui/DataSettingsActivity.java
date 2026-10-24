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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.o2 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;
    public final int N;
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
    public cu a;
    public ai.u1 b;
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
    public int s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int w;
    public int x;
    public int y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.N = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i10, float f7) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        String str2;
        String str3;
        boolean z10;
        int size;
        int i11;
        int i12;
        String formatString;
        boolean z11;
        int i13;
        int i14 = dataSettingsActivity.saveToGalleryGroupsRow;
        int i15 = 4;
        int i16 = 2;
        int i17 = 1;
        if (i10 == i14 || i10 == dataSettingsActivity.saveToGalleryChannelsRow || i10 == dataSettingsActivity.saveToGalleryPeerRow) {
            if (i10 == i14) {
                i15 = 2;
            } else if (i10 != dataSettingsActivity.saveToGalleryChannelsRow) {
                i15 = 1;
            }
            if ((!LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(org.telegram.ui.Cells.b1.i(i15, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                SaveToGallerySettingsHelper.getSettings(i15).toggle();
                AndroidUtilities.updateVisibleRows(dataSettingsActivity.b);
                return;
            }
        }
        final int i18 = 0;
        if (i10 == dataSettingsActivity.e || i10 == dataSettingsActivity.f || i10 == dataSettingsActivity.h) {
            int i19 = 2;
            if ((!LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i10 == dataSettingsActivity.e ? 0 : i10 == dataSettingsActivity.h ? 1 : 2));
                return;
            }
            dataSettingsActivity.a.getClass();
            org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
            boolean z12 = i5Var.e.h;
            if (i10 == dataSettingsActivity.e) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i19 = 0;
            } else if (i10 == dataSettingsActivity.h) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                str = "wifiPreset";
                str2 = "currentWifiPreset";
                i19 = 1;
            } else {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).lowPreset;
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            if (z12 || !preset.enabled) {
                preset.enabled = !preset.enabled;
            } else {
                preset.set(preset2);
            }
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
            edit.putString(str, preset.toString());
            edit.putInt(str2, 3);
            edit.commit();
            i5Var.setChecked(!z12);
            s4.b1 G = dataSettingsActivity.b.G(view);
            if (G != null) {
                dataSettingsActivity.a.v(G, i10);
            }
            DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i19);
            dataSettingsActivity.o0(false);
            return;
        }
        if (i10 == dataSettingsActivity.resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String string = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.R = string;
            c2Var.T = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new org.telegram.ui.ActionBar.z1(dataSettingsActivity) { // from class: org.telegram.ui.au
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = dataSettingsActivity;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i20) {
                    switch (i18) {
                        case 0:
                            DataSettingsActivity.V(this.b);
                            break;
                        default:
                            TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                            DataSettingsActivity dataSettingsActivity2 = this.b;
                            dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new l(dataSettingsActivity2, 6));
                            break;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i10 == dataSettingsActivity.s) {
            dataSettingsActivity.presentFragment(new c7());
            return;
        }
        float f10 = 4.0f;
        if (i10 == dataSettingsActivity.useLessDataForCallsRow) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i20 = globalMainSettings.getInt("VoipDataSaving", org.telegram.ui.Components.voip.d2.c());
            if (i20 != 0) {
                if (i20 != 1) {
                    if (i20 == 2) {
                        i16 = 3;
                    } else if (i20 == 3) {
                        i16 = 1;
                    }
                }
                Activity parentActivity = dataSettingsActivity.getParentActivity();
                String[] strArr = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
                String string2 = LocaleController.getString(R.string.VoipUseLessData);
                bu buVar = new bu(dataSettingsActivity, globalMainSettings, i10);
                Pattern pattern = org.telegram.ui.Components.f5.a;
                LinearLayout f11 = org.telegram.messenger.v0.f(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i13 = 0;
                while (i13 < 4) {
                    org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(parentActivity, null);
                    float f12 = f10;
                    l6Var.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f12), 0);
                    l6Var.setTag(Integer.valueOf(i13));
                    org.telegram.ui.Components.f5.a(l6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, null);
                    l6Var.b(strArr[i13], i16 == i13);
                    f11.addView(l6Var);
                    l6Var.setOnClickListener(new org.telegram.ui.ActionBar.s1(23, alertDialog$Builder2, buVar));
                    i13++;
                    f10 = f12;
                }
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.R = string2;
                alertDialog$Builder2.o(f11);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.setVisibleDialog(c2Var2);
                c2Var2.show();
                return;
            }
            i16 = 0;
            Activity parentActivity2 = dataSettingsActivity.getParentActivity();
            String[] strArr2 = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
            String string22 = LocaleController.getString(R.string.VoipUseLessData);
            bu buVar2 = new bu(dataSettingsActivity, globalMainSettings, i10);
            Pattern pattern2 = org.telegram.ui.Components.f5.a;
            LinearLayout f112 = org.telegram.messenger.v0.f(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i13 = 0;
            while (i13 < 4) {
            }
            org.telegram.ui.ActionBar.c2 c2Var22 = alertDialog$Builder22.a;
            c2Var22.R = string22;
            alertDialog$Builder22.o(f112);
            alertDialog$Builder22.k(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.setVisibleDialog(c2Var22);
            c2Var22.show();
            return;
        }
        if (i10 == dataSettingsActivity.v) {
            dataSettingsActivity.presentFragment(new ou(null));
            return;
        }
        if (i10 != dataSettingsActivity.n) {
            if (i10 == dataSettingsActivity.proxyRow) {
                dataSettingsActivity.presentFragment(new ProxyListActivity());
                return;
            }
            if (i10 == dataSettingsActivity.y) {
                SharedConfig.toggleStreamMedia();
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.streamMedia);
                return;
            }
            if (i10 == dataSettingsActivity.F) {
                SharedConfig.toggleStreamAllVideo();
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (i10 == dataSettingsActivity.G) {
                SharedConfig.toggleStreamMkv();
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.streamMkv);
                return;
            }
            if (i10 == dataSettingsActivity.E) {
                SharedConfig.toggleSaveStreamMedia();
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (i10 == dataSettingsActivity.N) {
                y11 y11Var = new y11(null);
                y11Var.n = new org.telegram.ui.Cells.i3[4];
                dataSettingsActivity.presentFragment(y11Var);
                return;
            }
            if (i10 == dataSettingsActivity.J) {
                SharedConfig.toggleAutoplayGifs();
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.isAutoplayGifs());
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.K) {
                SharedConfig.toggleAutoplayVideo();
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.isAutoplayVideo());
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                String string3 = LocaleController.getString(R.string.AreYouSureClearDraftsTitle);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                c2Var3.R = string3;
                c2Var3.T = LocaleController.getString(R.string.AreYouSureClearDrafts);
                final int i21 = 1;
                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(dataSettingsActivity) { // from class: org.telegram.ui.au
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = dataSettingsActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var23, int i202) {
                        switch (i21) {
                            case 0:
                                DataSettingsActivity.V(this.b);
                                break;
                            default:
                                TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                                DataSettingsActivity dataSettingsActivity2 = this.b;
                                dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new l(dataSettingsActivity2, 6));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(c2Var3);
                TextView textView2 = (TextView) c2Var3.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String string4 = LocaleController.getString(R.string.StoragePath);
        org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
        c2Var4.R = string4;
        LinearLayout linearLayout = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout.setOrientation(1);
        alertDialog$Builder4.o(linearLayout);
        String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size2 = dataSettingsActivity.c.size();
            for (int i22 = 0; i22 < size2; i22++) {
                String absolutePath2 = ((File) dataSettingsActivity.c.get(i22)).getAbsolutePath();
                if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                    str3 = absolutePath2;
                    break;
                }
            }
        }
        str3 = absolutePath;
        try {
        } catch (Exception unused) {
            z10 = true;
        }
        if (dataSettingsActivity.c.size() == 2) {
            if (((File) dataSettingsActivity.c.get(0)).getAbsolutePath().contains("/storage/emulated/") != ((File) dataSettingsActivity.c.get(1)).getAbsolutePath().contains("/storage/emulated/")) {
                z11 = false;
                z10 = z11;
                size = dataSettingsActivity.c.size();
                i11 = 0;
                while (i11 < size) {
                    File file = (File) dataSettingsActivity.c.get(i11);
                    int i23 = i11;
                    String absolutePath3 = file.getAbsolutePath();
                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
                    int i24 = i17;
                    p4Var.setPadding(AndroidUtilities.dp(4.0f), i18, AndroidUtilities.dp(4.0f), i18);
                    p4Var.setTag(Integer.valueOf(i23));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z10 || contains) {
                        i12 = i18;
                        if (contains) {
                            int i25 = R.string.StoragePathFreeInternal;
                            Object[] objArr = new Object[i24];
                            objArr[i12] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                            formatString = LocaleController.formatString(i25, objArr);
                        } else {
                            int i26 = R.string.StoragePathFreeExternal;
                            Object[] objArr2 = new Object[i24];
                            objArr2[i12] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                            formatString = LocaleController.formatString(i26, objArr2);
                        }
                    } else {
                        int i27 = R.string.StoragePathFreeValueExternal;
                        i12 = i18;
                        Object[] objArr3 = new Object[i16];
                        objArr3[i12] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                        objArr3[i24] = absolutePath3;
                        formatString = LocaleController.formatString(i27, objArr3);
                    }
                    p4Var.b.setText(LocaleController.getString(contains ? R.string.InternalStorage : R.string.SdCard));
                    p4Var.c.setText(formatString);
                    RadioButton radioButton = p4Var.a;
                    boolean z13 = i12;
                    radioButton.a(z13, z13);
                    p4Var.e = null;
                    p4Var.d = z13;
                    radioButton.a(absolutePath3.startsWith(str3), z13);
                    p4Var.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, z13), 2, -1));
                    linearLayout.addView(p4Var);
                    p4Var.setOnClickListener(new ci.y3(dataSettingsActivity, absolutePath3, contains, alertDialog$Builder4, 1));
                    i11 = i23 + 1;
                    size = size;
                    i16 = 2;
                    i17 = 1;
                    i18 = 0;
                }
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(c2Var4);
            }
        }
        z11 = true;
        z10 = z11;
        size = dataSettingsActivity.c.size();
        i11 = 0;
        while (i11 < size) {
        }
        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
        dataSettingsActivity.showDialog(c2Var4);
    }

    public static /* synthetic */ void V(DataSettingsActivity dataSettingsActivity) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
            } else if (i10 == 1) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                str = "wifiPreset";
            } else {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).lowPreset;
                str = "roamingPreset";
            }
            preset.set(preset2);
            preset.enabled = preset2.isEnabled();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentMobilePreset = 3;
            edit.putInt("currentMobilePreset", 3);
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentWifiPreset = 3;
            edit.putInt("currentWifiPreset", 3);
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentRoamingPreset = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, preset.toString());
        }
        edit.commit();
        DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
        for (int i11 = 0; i11 < 3; i11++) {
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i11);
        }
        dataSettingsActivity.a.q(dataSettingsActivity.e, 4);
        dataSettingsActivity.o0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 21));
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new cu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        ai.u1 u1Var = new ai.u1(this, context, 27);
        this.b = u1Var;
        u1Var.t1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.b0(1, false));
        frameLayout2.addView(this.b, w7.z5.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new ks(1, this, context));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.i5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            s4.b1 T = this.b.T(this.b.getChildAt(i11));
            if (T != null && T.b() == i10) {
                this.a.v(T, i10);
                return;
            }
        }
    }

    public final void o0(boolean z10) {
        int i10;
        this.s = 1;
        this.U = 3;
        this.v = 2;
        this.n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.U;
            this.U = i11 + 1;
            this.n = i11;
        }
        int i12 = this.U;
        this.w = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.U = i12 + 5;
        this.f = i12 + 4;
        DownloadController downloadController = getDownloadController();
        boolean z11 = downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled;
        int i13 = this.resetDownloadRow;
        if (z11) {
            i10 = -1;
        } else {
            i10 = this.U;
            this.U = i10 + 1;
        }
        this.resetDownloadRow = i10;
        cu cuVar = this.a;
        if (cuVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                cuVar.m(this.f);
                this.a.o(this.resetDownloadRow);
            } else if (i13 < 0 || i10 >= 0) {
                z10 = true;
            } else {
                cuVar.m(this.f);
                this.a.u(i13);
            }
        }
        int i14 = this.U;
        this.r = i14;
        this.S = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.T = i14 + 5;
        this.x = i14 + 6;
        int i15 = i14 + 8;
        this.U = i15;
        this.y = i14 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.G = i15;
            this.U = i14 + 10;
            this.F = i14 + 9;
        } else {
            this.F = -1;
            this.G = -1;
        }
        int i16 = this.U;
        this.H = i16;
        this.E = -1;
        this.M = i16 + 1;
        this.useLessDataForCallsRow = i16 + 2;
        this.O = i16 + 3;
        this.P = i16 + 4;
        this.proxyRow = i16 + 5;
        this.Q = i16 + 6;
        this.clearDraftsRow = i16 + 7;
        this.U = i16 + 9;
        this.R = i16 + 8;
        cu cuVar2 = this.a;
        if (cuVar2 == null || !z10) {
            return;
        }
        cuVar2.l();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        o0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        c7.k0 = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        zt ztVar = new zt(this, 1);
        AndroidUtilities.runOnUIThread(ztVar, 100L);
        c7.k0(new ai.f2(this, ztVar, System.currentTimeMillis(), 1));
        if (this.b != null && this.a != null) {
            for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
                View childAt = this.b.getChildAt(i10);
                s4.b1 T = this.b.T(childAt);
                if (T != null) {
                    cu cuVar = this.a;
                    this.b.getClass();
                    cuVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}
