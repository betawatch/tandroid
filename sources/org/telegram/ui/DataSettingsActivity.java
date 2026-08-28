package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public int I;
    public final int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public cu a;
    public gh.f1 b;
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
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.J = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void T(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i9, float f10) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        String str2;
        String str3;
        boolean z10;
        int size;
        int i10;
        String formatString;
        boolean z11;
        int i11;
        int i12 = dataSettingsActivity.saveToGalleryGroupsRow;
        int i13 = 4;
        int i14 = 2;
        if (i9 == i12 || i9 == dataSettingsActivity.saveToGalleryChannelsRow || i9 == dataSettingsActivity.saveToGalleryPeerRow) {
            if (i9 == i12) {
                i13 = 2;
            } else if (i9 != dataSettingsActivity.saveToGalleryChannelsRow) {
                i13 = 1;
            }
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(aa.d.h(i13, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                SaveToGallerySettingsHelper.getSettings(i13).toggle();
                AndroidUtilities.updateVisibleRows(dataSettingsActivity.b);
                return;
            }
        }
        final int i15 = 0;
        if (i9 == dataSettingsActivity.e || i9 == dataSettingsActivity.f || i9 == dataSettingsActivity.h) {
            int i16 = 2;
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i9 == dataSettingsActivity.e ? 0 : i9 == dataSettingsActivity.h ? 1 : 2));
                return;
            }
            dataSettingsActivity.a.getClass();
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z12 = j5Var.e.h;
            if (i9 == dataSettingsActivity.e) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i16 = 0;
            } else if (i9 == dataSettingsActivity.h) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                str = "wifiPreset";
                str2 = "currentWifiPreset";
                i16 = 1;
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
            j5Var.setChecked(!z12);
            f2.q1 G = dataSettingsActivity.b.G(view);
            if (G != null) {
                dataSettingsActivity.a.v(G, i9);
            }
            DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i16);
            dataSettingsActivity.n0(false);
            return;
        }
        if (i9 == dataSettingsActivity.resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String string = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new org.telegram.ui.ActionBar.b2(dataSettingsActivity) { // from class: org.telegram.ui.au
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = dataSettingsActivity;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i17) {
                    switch (i15) {
                        case 0:
                            DataSettingsActivity.U(this.b);
                            break;
                        default:
                            TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                            DataSettingsActivity dataSettingsActivity2 = this.b;
                            dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new m(dataSettingsActivity2, 6));
                            break;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        if (i9 == dataSettingsActivity.s) {
            dataSettingsActivity.presentFragment(new y6());
            return;
        }
        float f11 = 4.0f;
        if (i9 == dataSettingsActivity.useLessDataForCallsRow) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i17 = globalMainSettings.getInt("VoipDataSaving", org.telegram.ui.Components.voip.e2.c());
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 == 2) {
                        i14 = 3;
                    } else if (i17 == 3) {
                        i14 = 1;
                    }
                }
                Activity parentActivity = dataSettingsActivity.getParentActivity();
                String[] strArr = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
                String string2 = LocaleController.getString(R.string.VoipUseLessData);
                bu buVar = new bu(dataSettingsActivity, globalMainSettings, i9);
                Pattern pattern = org.telegram.ui.Components.y4.a;
                LinearLayout f12 = org.telegram.messenger.l0.f(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i11 = 0;
                while (i11 < 4) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(parentActivity, null);
                    k6Var.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var.setTag(Integer.valueOf(i11));
                    k6Var.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                    k6Var.b(strArr[i11], i14 == i11);
                    f12.addView(k6Var);
                    k6Var.setOnClickListener(new org.telegram.ui.Components.s2(i15, alertDialog$Builder2, buVar));
                    i11++;
                    f11 = 4.0f;
                }
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.N = string2;
                alertDialog$Builder2.n(f12);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.setVisibleDialog(c2Var2);
                c2Var2.show();
                return;
            }
            i14 = 0;
            Activity parentActivity2 = dataSettingsActivity.getParentActivity();
            String[] strArr2 = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
            String string22 = LocaleController.getString(R.string.VoipUseLessData);
            bu buVar2 = new bu(dataSettingsActivity, globalMainSettings, i9);
            Pattern pattern2 = org.telegram.ui.Components.y4.a;
            LinearLayout f122 = org.telegram.messenger.l0.f(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i11 = 0;
            while (i11 < 4) {
            }
            org.telegram.ui.ActionBar.c2 c2Var22 = alertDialog$Builder22.a;
            c2Var22.N = string22;
            alertDialog$Builder22.n(f122);
            alertDialog$Builder22.k(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.setVisibleDialog(c2Var22);
            c2Var22.show();
            return;
        }
        if (i9 == dataSettingsActivity.v) {
            dataSettingsActivity.presentFragment(new ou(null));
            return;
        }
        if (i9 != dataSettingsActivity.n) {
            if (i9 == dataSettingsActivity.proxyRow) {
                dataSettingsActivity.presentFragment(new ProxyListActivity());
                return;
            }
            if (i9 == dataSettingsActivity.y) {
                SharedConfig.toggleStreamMedia();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.streamMedia);
                return;
            }
            if (i9 == dataSettingsActivity.B) {
                SharedConfig.toggleStreamAllVideo();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (i9 == dataSettingsActivity.C) {
                SharedConfig.toggleStreamMkv();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.streamMkv);
                return;
            }
            if (i9 == dataSettingsActivity.A) {
                SharedConfig.toggleSaveStreamMedia();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (i9 == dataSettingsActivity.J) {
                b21 b21Var = new b21(null);
                b21Var.n = new org.telegram.ui.Cells.k3[4];
                dataSettingsActivity.presentFragment(b21Var);
                return;
            }
            if (i9 == dataSettingsActivity.F) {
                SharedConfig.toggleAutoplayGifs();
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.isAutoplayGifs());
                    return;
                }
                return;
            }
            if (i9 == dataSettingsActivity.G) {
                SharedConfig.toggleAutoplayVideo();
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.isAutoplayVideo());
                    return;
                }
                return;
            }
            if (i9 == dataSettingsActivity.clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                String string3 = LocaleController.getString(R.string.AreYouSureClearDraftsTitle);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                c2Var3.N = string3;
                c2Var3.P = LocaleController.getString(R.string.AreYouSureClearDrafts);
                final int i18 = 1;
                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(dataSettingsActivity) { // from class: org.telegram.ui.au
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = dataSettingsActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var23, int i172) {
                        switch (i18) {
                            case 0:
                                DataSettingsActivity.U(this.b);
                                break;
                            default:
                                TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                                DataSettingsActivity dataSettingsActivity2 = this.b;
                                dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new m(dataSettingsActivity2, 6));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(c2Var3);
                TextView textView2 = (TextView) c2Var3.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String string4 = LocaleController.getString(R.string.StoragePath);
        org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
        c2Var4.N = string4;
        LinearLayout linearLayout = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout.setOrientation(1);
        alertDialog$Builder4.n(linearLayout);
        String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size2 = dataSettingsActivity.c.size();
            for (int i19 = 0; i19 < size2; i19++) {
                String absolutePath2 = ((File) dataSettingsActivity.c.get(i19)).getAbsolutePath();
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
                i10 = 0;
                while (i10 < size) {
                    File file = (File) dataSettingsActivity.c.get(i10);
                    int i20 = i10;
                    String absolutePath3 = file.getAbsolutePath();
                    org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
                    q4Var.setPadding(AndroidUtilities.dp(4.0f), i15, AndroidUtilities.dp(4.0f), i15);
                    q4Var.setTag(Integer.valueOf(i20));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z10 || contains) {
                        formatString = contains ? LocaleController.formatString(R.string.StoragePathFreeInternal, AndroidUtilities.formatFileSize(file.getFreeSpace())) : LocaleController.formatString(R.string.StoragePathFreeExternal, AndroidUtilities.formatFileSize(file.getFreeSpace()));
                    } else {
                        int i21 = R.string.StoragePathFreeValueExternal;
                        Object[] objArr = new Object[i14];
                        objArr[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                        objArr[1] = absolutePath3;
                        formatString = LocaleController.formatString(i21, objArr);
                    }
                    q4Var.b.setText(LocaleController.getString(contains ? R.string.InternalStorage : R.string.SdCard));
                    q4Var.c.setText(formatString);
                    RadioButton radioButton = q4Var.a;
                    radioButton.a(false, false);
                    q4Var.e = null;
                    q4Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    q4Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I5, false), 2, -1));
                    linearLayout.addView(q4Var);
                    q4Var.setOnClickListener(new ih.t3(dataSettingsActivity, absolutePath3, contains, alertDialog$Builder4, 1));
                    i10 = i20 + 1;
                    size = size;
                    i14 = 2;
                    i15 = 0;
                }
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(c2Var4);
            }
        }
        z11 = true;
        z10 = z11;
        size = dataSettingsActivity.c.size();
        i10 = 0;
        while (i10 < size) {
        }
        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
        dataSettingsActivity.showDialog(c2Var4);
    }

    public static /* synthetic */ void U(DataSettingsActivity dataSettingsActivity) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
        for (int i9 = 0; i9 < 3; i9++) {
            if (i9 == 0) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
            } else if (i9 == 1) {
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
        for (int i10 = 0; i10 < 3; i10++) {
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i10);
        }
        dataSettingsActivity.a.q(dataSettingsActivity.e, 4);
        dataSettingsActivity.n0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 13));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new cu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        gh.f1 f1Var = new gh.f1(this, context, 26);
        this.b = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new f2.m0(1, false));
        frameLayout2.addView(this.b, g7.e6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new yr(3, this, context));
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.m = false;
        this.b.setItemAnimator(nVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void m0(int i9) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            f2.q1 T = this.b.T(this.b.getChildAt(i10));
            if (T != null && T.b() == i9) {
                this.a.v(T, i9);
                return;
            }
        }
    }

    public final void n0(boolean z10) {
        int i9;
        this.s = 1;
        this.Q = 3;
        this.v = 2;
        this.n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.c = rootDirs;
        if (rootDirs.size() > 1) {
            int i10 = this.Q;
            this.Q = i10 + 1;
            this.n = i10;
        }
        int i11 = this.Q;
        this.w = i11;
        this.d = i11 + 1;
        this.e = i11 + 2;
        this.h = i11 + 3;
        this.Q = i11 + 5;
        this.f = i11 + 4;
        DownloadController downloadController = getDownloadController();
        boolean z11 = downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled;
        int i12 = this.resetDownloadRow;
        if (z11) {
            i9 = -1;
        } else {
            i9 = this.Q;
            this.Q = i9 + 1;
        }
        this.resetDownloadRow = i9;
        cu cuVar = this.a;
        if (cuVar != null && !z10) {
            if (i12 < 0 && i9 >= 0) {
                cuVar.m(this.f);
                this.a.o(this.resetDownloadRow);
            } else if (i12 < 0 || i9 >= 0) {
                z10 = true;
            } else {
                cuVar.m(this.f);
                this.a.u(i12);
            }
        }
        int i13 = this.Q;
        this.r = i13;
        this.O = i13 + 1;
        this.saveToGalleryPeerRow = i13 + 2;
        this.saveToGalleryGroupsRow = i13 + 3;
        this.saveToGalleryChannelsRow = i13 + 4;
        this.P = i13 + 5;
        this.x = i13 + 6;
        int i14 = i13 + 8;
        this.Q = i14;
        this.y = i13 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.C = i14;
            this.Q = i13 + 10;
            this.B = i13 + 9;
        } else {
            this.B = -1;
            this.C = -1;
        }
        int i15 = this.Q;
        this.D = i15;
        this.A = -1;
        this.I = i15 + 1;
        this.useLessDataForCallsRow = i15 + 2;
        this.K = i15 + 3;
        this.L = i15 + 4;
        this.proxyRow = i15 + 5;
        this.M = i15 + 6;
        this.clearDraftsRow = i15 + 7;
        this.Q = i15 + 9;
        this.N = i15 + 8;
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
        n0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y6.g0 = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.b.setPadding(0, 0, 0, i12);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        yt ytVar = new yt(this, 1);
        AndroidUtilities.runOnUIThread(ytVar, 100L);
        y6.i0(new zt(this, ytVar, System.currentTimeMillis(), 0));
        if (this.b != null && this.a != null) {
            for (int i9 = 0; i9 < this.b.getChildCount(); i9++) {
                View childAt = this.b.getChildAt(i9);
                f2.q1 T = this.b.T(childAt);
                if (T != null) {
                    cu cuVar = this.a;
                    this.b.getClass();
                    cuVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        n0(false);
    }
}
