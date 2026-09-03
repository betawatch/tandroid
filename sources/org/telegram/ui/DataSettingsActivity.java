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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public mu a;
    public mh.d1 b;
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
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.K = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i10, float f10) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        String str2;
        String str3;
        boolean z4;
        int size;
        int i11;
        String formatString;
        boolean z10;
        int i12;
        int i13 = dataSettingsActivity.saveToGalleryGroupsRow;
        int i14 = 4;
        int i15 = 2;
        if (i10 == i13 || i10 == dataSettingsActivity.saveToGalleryChannelsRow || i10 == dataSettingsActivity.saveToGalleryPeerRow) {
            if (i10 == i13) {
                i14 = 2;
            } else if (i10 != dataSettingsActivity.saveToGalleryChannelsRow) {
                i14 = 1;
            }
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(android.support.v4.media.a.h(i14, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                SaveToGallerySettingsHelper.getSettings(i14).toggle();
                AndroidUtilities.updateVisibleRows(dataSettingsActivity.b);
                return;
            }
        }
        final int i16 = 0;
        if (i10 == dataSettingsActivity.e || i10 == dataSettingsActivity.f || i10 == dataSettingsActivity.h) {
            int i17 = 2;
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i10 == dataSettingsActivity.e ? 0 : i10 == dataSettingsActivity.h ? 1 : 2));
                return;
            }
            dataSettingsActivity.a.getClass();
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z11 = j5Var.e.h;
            if (i10 == dataSettingsActivity.e) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i17 = 0;
            } else if (i10 == dataSettingsActivity.h) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                str = "wifiPreset";
                str2 = "currentWifiPreset";
                i17 = 1;
            } else {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).lowPreset;
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            if (z11 || !preset.enabled) {
                preset.enabled = !preset.enabled;
            } else {
                preset.set(preset2);
            }
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
            edit.putString(str, preset.toString());
            edit.putInt(str2, 3);
            edit.commit();
            j5Var.setChecked(!z11);
            f2.m1 G = dataSettingsActivity.b.G(view);
            if (G != null) {
                dataSettingsActivity.a.v(G, i10);
            }
            DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i17);
            dataSettingsActivity.o0(false);
            return;
        }
        if (i10 == dataSettingsActivity.resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String string = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new org.telegram.ui.ActionBar.c2(dataSettingsActivity) { // from class: org.telegram.ui.ku
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = dataSettingsActivity;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i18) {
                    switch (i16) {
                        case 0:
                            DataSettingsActivity.V(this.b);
                            break;
                        default:
                            TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                            DataSettingsActivity dataSettingsActivity2 = this.b;
                            dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new o(dataSettingsActivity2, 6));
                            break;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                return;
            }
            return;
        }
        if (i10 == dataSettingsActivity.s) {
            dataSettingsActivity.presentFragment(new b7());
            return;
        }
        float f11 = 4.0f;
        if (i10 == dataSettingsActivity.useLessDataForCallsRow) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i18 = globalMainSettings.getInt("VoipDataSaving", org.telegram.ui.Components.voip.g2.c());
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 == 2) {
                        i15 = 3;
                    } else if (i18 == 3) {
                        i15 = 1;
                    }
                }
                Activity parentActivity = dataSettingsActivity.getParentActivity();
                String[] strArr = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
                String string2 = LocaleController.getString(R.string.VoipUseLessData);
                lu luVar = new lu(dataSettingsActivity, globalMainSettings, i10);
                Pattern pattern = org.telegram.ui.Components.z4.a;
                LinearLayout h = l.d.h(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i12 = 0;
                while (i12 < 4) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(parentActivity, null);
                    k6Var.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var.setTag(Integer.valueOf(i12));
                    k6Var.a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E5, false));
                    k6Var.b(strArr[i12], i15 == i12);
                    h.addView(k6Var);
                    k6Var.setOnClickListener(new org.telegram.messenger.video.g(28, alertDialog$Builder2, luVar));
                    i12++;
                    f11 = 4.0f;
                }
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                d2Var2.O = string2;
                alertDialog$Builder2.n(h);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.setVisibleDialog(d2Var2);
                d2Var2.show();
                return;
            }
            i15 = 0;
            Activity parentActivity2 = dataSettingsActivity.getParentActivity();
            String[] strArr2 = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
            String string22 = LocaleController.getString(R.string.VoipUseLessData);
            lu luVar2 = new lu(dataSettingsActivity, globalMainSettings, i10);
            Pattern pattern2 = org.telegram.ui.Components.z4.a;
            LinearLayout h9 = l.d.h(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i12 = 0;
            while (i12 < 4) {
            }
            org.telegram.ui.ActionBar.d2 d2Var22 = alertDialog$Builder22.a;
            d2Var22.O = string22;
            alertDialog$Builder22.n(h9);
            alertDialog$Builder22.k(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.setVisibleDialog(d2Var22);
            d2Var22.show();
            return;
        }
        if (i10 == dataSettingsActivity.v) {
            dataSettingsActivity.presentFragment(new yu(null));
            return;
        }
        if (i10 != dataSettingsActivity.n) {
            if (i10 == dataSettingsActivity.proxyRow) {
                dataSettingsActivity.presentFragment(new ProxyListActivity());
                return;
            }
            if (i10 == dataSettingsActivity.y) {
                SharedConfig.toggleStreamMedia();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.streamMedia);
                return;
            }
            if (i10 == dataSettingsActivity.C) {
                SharedConfig.toggleStreamAllVideo();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (i10 == dataSettingsActivity.D) {
                SharedConfig.toggleStreamMkv();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.streamMkv);
                return;
            }
            if (i10 == dataSettingsActivity.B) {
                SharedConfig.toggleSaveStreamMedia();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (i10 == dataSettingsActivity.K) {
                w21 w21Var = new w21(null);
                w21Var.n = new org.telegram.ui.Cells.j3[4];
                dataSettingsActivity.presentFragment(w21Var);
                return;
            }
            if (i10 == dataSettingsActivity.G) {
                SharedConfig.toggleAutoplayGifs();
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.isAutoplayGifs());
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.H) {
                SharedConfig.toggleAutoplayVideo();
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.isAutoplayVideo());
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                String string3 = LocaleController.getString(R.string.AreYouSureClearDraftsTitle);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                d2Var3.O = string3;
                d2Var3.Q = LocaleController.getString(R.string.AreYouSureClearDrafts);
                final int i19 = 1;
                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(dataSettingsActivity) { // from class: org.telegram.ui.ku
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = dataSettingsActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.c2
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var23, int i182) {
                        switch (i19) {
                            case 0:
                                DataSettingsActivity.V(this.b);
                                break;
                            default:
                                TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                                DataSettingsActivity dataSettingsActivity2 = this.b;
                                dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new o(dataSettingsActivity2, 6));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(d2Var3);
                TextView textView2 = (TextView) d2Var3.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String string4 = LocaleController.getString(R.string.StoragePath);
        org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
        d2Var4.O = string4;
        LinearLayout linearLayout = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout.setOrientation(1);
        alertDialog$Builder4.n(linearLayout);
        String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size2 = dataSettingsActivity.c.size();
            for (int i20 = 0; i20 < size2; i20++) {
                String absolutePath2 = ((File) dataSettingsActivity.c.get(i20)).getAbsolutePath();
                if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                    str3 = absolutePath2;
                    break;
                }
            }
        }
        str3 = absolutePath;
        try {
        } catch (Exception unused) {
            z4 = true;
        }
        if (dataSettingsActivity.c.size() == 2) {
            if (((File) dataSettingsActivity.c.get(0)).getAbsolutePath().contains("/storage/emulated/") != ((File) dataSettingsActivity.c.get(1)).getAbsolutePath().contains("/storage/emulated/")) {
                z10 = false;
                z4 = z10;
                size = dataSettingsActivity.c.size();
                i11 = 0;
                while (i11 < size) {
                    File file = (File) dataSettingsActivity.c.get(i11);
                    int i21 = i11;
                    String absolutePath3 = file.getAbsolutePath();
                    org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
                    q4Var.setPadding(AndroidUtilities.dp(4.0f), i16, AndroidUtilities.dp(4.0f), i16);
                    q4Var.setTag(Integer.valueOf(i21));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z4 || contains) {
                        formatString = contains ? LocaleController.formatString(R.string.StoragePathFreeInternal, AndroidUtilities.formatFileSize(file.getFreeSpace())) : LocaleController.formatString(R.string.StoragePathFreeExternal, AndroidUtilities.formatFileSize(file.getFreeSpace()));
                    } else {
                        int i22 = R.string.StoragePathFreeValueExternal;
                        Object[] objArr = new Object[i15];
                        objArr[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                        objArr[1] = absolutePath3;
                        formatString = LocaleController.formatString(i22, objArr);
                    }
                    q4Var.b.setText(LocaleController.getString(contains ? R.string.InternalStorage : R.string.SdCard));
                    q4Var.c.setText(formatString);
                    RadioButton radioButton = q4Var.a;
                    radioButton.a(false, false);
                    q4Var.e = null;
                    q4Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    q4Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I5, false), 2, -1));
                    linearLayout.addView(q4Var);
                    q4Var.setOnClickListener(new fg.d1(dataSettingsActivity, absolutePath3, contains, alertDialog$Builder4, 2));
                    i11 = i21 + 1;
                    size = size;
                    i15 = 2;
                    i16 = 0;
                }
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(d2Var4);
            }
        }
        z10 = true;
        z4 = z10;
        size = dataSettingsActivity.c.size();
        i11 = 0;
        while (i11 < size) {
        }
        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
        dataSettingsActivity.showDialog(d2Var4);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 5));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new mu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        mh.d1 d1Var = new mh.d1(this, context, 24);
        this.b = d1Var;
        d1Var.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new f2.j0(1, false));
        frameLayout2.addView(this.b, k7.c6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new rs(2, this, context));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            f2.m1 T = this.b.T(this.b.getChildAt(i11));
            if (T != null && T.b() == i10) {
                this.a.v(T, i10);
                return;
            }
        }
    }

    public final void o0(boolean z4) {
        int i10;
        this.s = 1;
        this.R = 3;
        this.v = 2;
        this.n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.R;
            this.R = i11 + 1;
            this.n = i11;
        }
        int i12 = this.R;
        this.w = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.R = i12 + 5;
        this.f = i12 + 4;
        DownloadController downloadController = getDownloadController();
        boolean z10 = downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled;
        int i13 = this.resetDownloadRow;
        if (z10) {
            i10 = -1;
        } else {
            i10 = this.R;
            this.R = i10 + 1;
        }
        this.resetDownloadRow = i10;
        mu muVar = this.a;
        if (muVar != null && !z4) {
            if (i13 < 0 && i10 >= 0) {
                muVar.m(this.f);
                this.a.o(this.resetDownloadRow);
            } else if (i13 < 0 || i10 >= 0) {
                z4 = true;
            } else {
                muVar.m(this.f);
                this.a.u(i13);
            }
        }
        int i14 = this.R;
        this.r = i14;
        this.P = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.Q = i14 + 5;
        this.x = i14 + 6;
        int i15 = i14 + 8;
        this.R = i15;
        this.y = i14 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.D = i15;
            this.R = i14 + 10;
            this.C = i14 + 9;
        } else {
            this.C = -1;
            this.D = -1;
        }
        int i16 = this.R;
        this.E = i16;
        this.B = -1;
        this.J = i16 + 1;
        this.useLessDataForCallsRow = i16 + 2;
        this.L = i16 + 3;
        this.M = i16 + 4;
        this.proxyRow = i16 + 5;
        this.N = i16 + 6;
        this.clearDraftsRow = i16 + 7;
        this.R = i16 + 9;
        this.O = i16 + 8;
        mu muVar2 = this.a;
        if (muVar2 == null || !z4) {
            return;
        }
        muVar2.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        o0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        b7.h0 = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        iu iuVar = new iu(this, 1);
        AndroidUtilities.runOnUIThread(iuVar, 100L);
        b7.j0(new ju(this, iuVar, System.currentTimeMillis(), 0));
        if (this.b != null && this.a != null) {
            for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
                View childAt = this.b.getChildAt(i10);
                f2.m1 T = this.b.T(childAt);
                if (T != null) {
                    mu muVar = this.a;
                    this.b.getClass();
                    muVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}
