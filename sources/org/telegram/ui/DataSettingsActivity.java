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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public long X;
    public nu a;
    public ai.w0 b;
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
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i10, float f7) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        String str2;
        int i11;
        String str3;
        boolean z10;
        int size;
        int i12;
        String formatString;
        boolean z11;
        int i13;
        int i14 = dataSettingsActivity.saveToGalleryGroupsRow;
        int i15 = 2;
        int i16 = 1;
        if (i10 == i14 || i10 == dataSettingsActivity.saveToGalleryChannelsRow || i10 == dataSettingsActivity.saveToGalleryPeerRow) {
            int i17 = i10 == i14 ? 2 : i10 == dataSettingsActivity.saveToGalleryChannelsRow ? 4 : 1;
            if ((!LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(org.telegram.ui.Cells.c1.h(i17, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                SaveToGallerySettingsHelper.getSettings(i17).toggle();
                AndroidUtilities.updateVisibleRows(dataSettingsActivity.b);
                return;
            }
        }
        final int i18 = 0;
        if (i10 == dataSettingsActivity.e || i10 == dataSettingsActivity.f || i10 == dataSettingsActivity.h) {
            if ((!LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                if (i10 == dataSettingsActivity.e) {
                    i15 = 0;
                } else if (i10 == dataSettingsActivity.h) {
                    i15 = 1;
                }
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i15));
                return;
            }
            dataSettingsActivity.a.getClass();
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z12 = j5Var.e.h;
            if (i10 == dataSettingsActivity.e) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str2 = "mobilePreset";
                str = "currentMobilePreset";
                i11 = 0;
            } else if (i10 == dataSettingsActivity.h) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                str2 = "wifiPreset";
                str = "currentWifiPreset";
                i11 = 1;
            } else {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).lowPreset;
                str = "currentRoamingPreset";
                str2 = "roamingPreset";
                i11 = 2;
            }
            if (z12 || !preset.enabled) {
                preset.enabled = !preset.enabled;
            } else {
                preset.set(preset2);
            }
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
            edit.putString(str2, preset.toString());
            edit.putInt(str, 3);
            edit.commit();
            j5Var.setChecked(!z12);
            s4.c1 G = dataSettingsActivity.b.G(view);
            if (G != null) {
                dataSettingsActivity.a.v(G, i10);
            }
            DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i11);
            dataSettingsActivity.o0(false);
            return;
        }
        if (i10 == dataSettingsActivity.resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String string = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new org.telegram.ui.ActionBar.a2(dataSettingsActivity) { // from class: org.telegram.ui.lu
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = dataSettingsActivity;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i19) {
                    switch (i18) {
                        case 0:
                            DataSettingsActivity.T(this.b);
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
            dataSettingsActivity.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                return;
            }
            return;
        }
        if (i10 == dataSettingsActivity.s) {
            dataSettingsActivity.presentFragment(new a7());
            return;
        }
        if (i10 == dataSettingsActivity.useLessDataForCallsRow) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i19 = globalMainSettings.getInt("VoipDataSaving", org.telegram.ui.Components.voip.g2.c());
            if (i19 != 0) {
                if (i19 != 1) {
                    if (i19 == 2) {
                        i15 = 3;
                    } else if (i19 == 3) {
                        i15 = 1;
                    }
                }
                Activity parentActivity = dataSettingsActivity.getParentActivity();
                String[] strArr = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
                String string2 = LocaleController.getString(R.string.VoipUseLessData);
                mu muVar = new mu(dataSettingsActivity, globalMainSettings, i10);
                Pattern pattern = org.telegram.ui.Components.e5.a;
                LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i13 = 0;
                for (int i20 = 4; i13 < i20; i20 = 4) {
                    org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(parentActivity, null);
                    l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    l6Var.setTag(Integer.valueOf(i13));
                    l6Var.a(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.g7, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E5, false));
                    l6Var.b(strArr[i13], i15 == i13);
                    e7.addView(l6Var);
                    l6Var.setOnClickListener(new qf(13, alertDialog$Builder2, muVar));
                    i13++;
                }
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = string2;
                alertDialog$Builder2.n(e7);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.setVisibleDialog(b2Var2);
                b2Var2.show();
                return;
            }
            i15 = 0;
            Activity parentActivity2 = dataSettingsActivity.getParentActivity();
            String[] strArr2 = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
            String string22 = LocaleController.getString(R.string.VoipUseLessData);
            mu muVar2 = new mu(dataSettingsActivity, globalMainSettings, i10);
            Pattern pattern2 = org.telegram.ui.Components.e5.a;
            LinearLayout e72 = org.telegram.messenger.q.e(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i13 = 0;
            while (i13 < i20) {
            }
            org.telegram.ui.ActionBar.b2 b2Var22 = alertDialog$Builder22.a;
            b2Var22.R = string22;
            alertDialog$Builder22.n(e72);
            alertDialog$Builder22.k(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.setVisibleDialog(b2Var22);
            b2Var22.show();
            return;
        }
        if (i10 == dataSettingsActivity.v) {
            dataSettingsActivity.presentFragment(new zu());
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
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                b2Var3.R = string3;
                b2Var3.T = LocaleController.getString(R.string.AreYouSureClearDrafts);
                final int i21 = 1;
                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(dataSettingsActivity) { // from class: org.telegram.ui.lu
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = dataSettingsActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var23, int i192) {
                        switch (i21) {
                            case 0:
                                DataSettingsActivity.T(this.b);
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
                dataSettingsActivity.showDialog(b2Var3);
                TextView textView2 = (TextView) b2Var3.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String string4 = LocaleController.getString(R.string.StoragePath);
        org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
        b2Var4.R = string4;
        LinearLayout linearLayout = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout.setOrientation(1);
        alertDialog$Builder4.n(linearLayout);
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
                i12 = 0;
                while (i12 < size) {
                    File file = (File) dataSettingsActivity.c.get(i12);
                    int i23 = i12;
                    String absolutePath3 = file.getAbsolutePath();
                    org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
                    q4Var.setPadding(AndroidUtilities.dp(4.0f), i18, AndroidUtilities.dp(4.0f), i18);
                    q4Var.setTag(Integer.valueOf(i23));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (z10 && !contains) {
                        int i24 = R.string.StoragePathFreeValueExternal;
                        Object[] objArr = new Object[2];
                        objArr[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                        objArr[i16] = absolutePath3;
                        formatString = LocaleController.formatString(i24, objArr);
                    } else if (contains) {
                        int i25 = R.string.StoragePathFreeInternal;
                        Object[] objArr2 = new Object[i16];
                        objArr2[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                        formatString = LocaleController.formatString(i25, objArr2);
                    } else {
                        int i26 = R.string.StoragePathFreeExternal;
                        Object[] objArr3 = new Object[i16];
                        objArr3[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                        formatString = LocaleController.formatString(i26, objArr3);
                    }
                    q4Var.b.setText(LocaleController.getString(contains ? R.string.InternalStorage : R.string.SdCard));
                    q4Var.c.setText(formatString);
                    RadioButton radioButton = q4Var.a;
                    radioButton.a(false, false);
                    q4Var.e = null;
                    q4Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    q4Var.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I5, false), 2, -1));
                    linearLayout.addView(q4Var);
                    q4Var.setOnClickListener(new ai.l5(dataSettingsActivity, absolutePath3, contains, alertDialog$Builder4, 1));
                    i12 = i23 + 1;
                    size = size;
                    i16 = 1;
                    i18 = 0;
                }
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(b2Var4);
            }
        }
        z11 = true;
        z10 = z11;
        size = dataSettingsActivity.c.size();
        i12 = 0;
        while (i12 < size) {
        }
        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
        dataSettingsActivity.showDialog(b2Var4);
    }

    public static /* synthetic */ void T(DataSettingsActivity dataSettingsActivity) {
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

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 18));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new nu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ai.w0 w0Var = new ai.w0(this, context, 26);
        this.b = w0Var;
        w0Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.b, w7.z5.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new org.telegram.ui.Components.w2(26, this, context));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.i6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            s4.c1 T = this.b.T(this.b.getChildAt(i11));
            if (T != null && T.b() == i10) {
                this.a.v(T, i10);
                return;
            }
        }
    }

    public final void o0(boolean z10) {
        int i10;
        this.s = 1;
        this.T = 3;
        this.v = 2;
        this.n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.T;
            this.T = i11 + 1;
            this.n = i11;
        }
        int i12 = this.T;
        this.w = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.T = i12 + 5;
        this.f = i12 + 4;
        DownloadController downloadController = getDownloadController();
        boolean z11 = downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled;
        int i13 = this.resetDownloadRow;
        if (z11) {
            i10 = -1;
        } else {
            i10 = this.T;
            this.T = i10 + 1;
        }
        this.resetDownloadRow = i10;
        nu nuVar = this.a;
        if (nuVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                nuVar.m(this.f);
                this.a.o(this.resetDownloadRow);
            } else if (i13 < 0 || i10 >= 0) {
                z10 = true;
            } else {
                nuVar.m(this.f);
                this.a.u(i13);
            }
        }
        int i14 = this.T;
        this.r = i14;
        this.R = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.S = i14 + 5;
        this.x = i14 + 6;
        int i15 = i14 + 8;
        this.T = i15;
        this.y = i14 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.G = i15;
            this.T = i14 + 10;
            this.F = i14 + 9;
        } else {
            this.F = -1;
            this.G = -1;
        }
        int i16 = this.T;
        this.H = i16;
        this.E = -1;
        this.M = i16 + 1;
        this.useLessDataForCallsRow = i16 + 2;
        this.N = i16 + 3;
        this.O = i16 + 4;
        this.proxyRow = i16 + 5;
        this.P = i16 + 6;
        this.clearDraftsRow = i16 + 7;
        this.T = i16 + 9;
        this.Q = i16 + 8;
        nu nuVar2 = this.a;
        if (nuVar2 == null || !z10) {
            return;
        }
        nuVar2.l();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        o0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        a7.m0 = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        ju juVar = new ju(this, 1);
        AndroidUtilities.runOnUIThread(juVar, 100L);
        a7.g0(new ku(this, juVar, System.currentTimeMillis(), 0));
        if (this.b != null && this.a != null) {
            for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
                View childAt = this.b.getChildAt(i10);
                s4.c1 T = this.b.T(childAt);
                if (T != null) {
                    nu nuVar = this.a;
                    this.b.getClass();
                    nuVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}
