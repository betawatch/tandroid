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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.r2 {
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
    public zt a;
    public bi.r1 b;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i10, float f7) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        int i11;
        String str2;
        String str3;
        boolean z10;
        int size;
        int i12;
        int i13;
        String formatString;
        boolean z11;
        int i14;
        int i15 = dataSettingsActivity.saveToGalleryGroupsRow;
        int i16 = 2;
        int i17 = 1;
        if (i10 == i15 || i10 == dataSettingsActivity.saveToGalleryChannelsRow || i10 == dataSettingsActivity.saveToGalleryPeerRow) {
            int i18 = i10 == i15 ? 2 : i10 == dataSettingsActivity.saveToGalleryChannelsRow ? 4 : 1;
            if ((!LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(org.telegram.ui.Components.b10.g(i18, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                SaveToGallerySettingsHelper.getSettings(i18).toggle();
                AndroidUtilities.updateVisibleRows(dataSettingsActivity.b);
                return;
            }
        }
        final int i19 = 0;
        if (i10 == dataSettingsActivity.e || i10 == dataSettingsActivity.f || i10 == dataSettingsActivity.h) {
            if ((!LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                if (i10 == dataSettingsActivity.e) {
                    i16 = 0;
                } else if (i10 == dataSettingsActivity.h) {
                    i16 = 1;
                }
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i16));
                return;
            }
            dataSettingsActivity.a.getClass();
            org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
            boolean z12 = n5Var.e.h;
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
                i11 = 2;
                str2 = "roamingPreset";
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
            n5Var.setChecked(!z12);
            s4.e1 G = dataSettingsActivity.b.G(view);
            if (G != null) {
                dataSettingsActivity.a.v(G, i10);
            }
            DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i11);
            dataSettingsActivity.p0(false);
            return;
        }
        if (i10 == dataSettingsActivity.resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String string = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new org.telegram.ui.ActionBar.b2(dataSettingsActivity) { // from class: org.telegram.ui.xt
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = dataSettingsActivity;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i20) {
                    switch (i19) {
                        case 0:
                            DataSettingsActivity.W(this.b);
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
            dataSettingsActivity.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
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
            int i20 = globalMainSettings.getInt("VoipDataSaving", org.telegram.ui.Components.voip.g2.c());
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
                yt ytVar = new yt(dataSettingsActivity, globalMainSettings, i10);
                Pattern pattern = org.telegram.ui.Components.g5.a;
                LinearLayout f11 = org.telegram.messenger.t.f(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i14 = 0;
                for (int i21 = 4; i14 < i21; i21 = 4) {
                    org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(parentActivity, null);
                    p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    p6Var.setTag(Integer.valueOf(i14));
                    org.telegram.ui.Components.g5.a(p6Var, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.E5, null);
                    p6Var.b(strArr[i14], i16 == i14);
                    f11.addView(p6Var);
                    p6Var.setOnClickListener(new org.telegram.ui.ActionBar.u1(23, alertDialog$Builder2, ytVar));
                    i14++;
                }
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                e2Var2.R = string2;
                alertDialog$Builder2.o(f11);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.setVisibleDialog(e2Var2);
                e2Var2.show();
                return;
            }
            i16 = 0;
            Activity parentActivity2 = dataSettingsActivity.getParentActivity();
            String[] strArr2 = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
            String string22 = LocaleController.getString(R.string.VoipUseLessData);
            yt ytVar2 = new yt(dataSettingsActivity, globalMainSettings, i10);
            Pattern pattern2 = org.telegram.ui.Components.g5.a;
            LinearLayout f112 = org.telegram.messenger.t.f(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i14 = 0;
            while (i14 < i21) {
            }
            org.telegram.ui.ActionBar.e2 e2Var22 = alertDialog$Builder22.a;
            e2Var22.R = string22;
            alertDialog$Builder22.o(f112);
            alertDialog$Builder22.k(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.setVisibleDialog(e2Var22);
            e2Var22.show();
            return;
        }
        if (i10 == dataSettingsActivity.v) {
            dataSettingsActivity.presentFragment(new lu());
            return;
        }
        if (i10 != dataSettingsActivity.n) {
            if (i10 == dataSettingsActivity.proxyRow) {
                dataSettingsActivity.presentFragment(new ProxyListActivity());
                return;
            }
            if (i10 == dataSettingsActivity.y) {
                SharedConfig.toggleStreamMedia();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.streamMedia);
                return;
            }
            if (i10 == dataSettingsActivity.F) {
                SharedConfig.toggleStreamAllVideo();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (i10 == dataSettingsActivity.G) {
                SharedConfig.toggleStreamMkv();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.streamMkv);
                return;
            }
            if (i10 == dataSettingsActivity.E) {
                SharedConfig.toggleSaveStreamMedia();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (i10 == dataSettingsActivity.J) {
                SharedConfig.toggleAutoplayGifs();
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.isAutoplayGifs());
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.K) {
                SharedConfig.toggleAutoplayVideo();
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.isAutoplayVideo());
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                String string3 = LocaleController.getString(R.string.AreYouSureClearDraftsTitle);
                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.a;
                e2Var3.R = string3;
                e2Var3.T = LocaleController.getString(R.string.AreYouSureClearDrafts);
                final int i22 = 1;
                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(dataSettingsActivity) { // from class: org.telegram.ui.xt
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = dataSettingsActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var23, int i202) {
                        switch (i22) {
                            case 0:
                                DataSettingsActivity.W(this.b);
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
                dataSettingsActivity.showDialog(e2Var3);
                TextView textView2 = (TextView) e2Var3.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String string4 = LocaleController.getString(R.string.StoragePath);
        org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.a;
        e2Var4.R = string4;
        LinearLayout linearLayout = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout.setOrientation(1);
        alertDialog$Builder4.o(linearLayout);
        String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size2 = dataSettingsActivity.c.size();
            for (int i23 = 0; i23 < size2; i23++) {
                String absolutePath2 = ((File) dataSettingsActivity.c.get(i23)).getAbsolutePath();
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
                    int i24 = i12;
                    String absolutePath3 = file.getAbsolutePath();
                    float f12 = f10;
                    org.telegram.ui.Cells.u4 u4Var = new org.telegram.ui.Cells.u4(context);
                    u4Var.setPadding(AndroidUtilities.dp(f12), i19, AndroidUtilities.dp(f12), i19);
                    u4Var.setTag(Integer.valueOf(i24));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z10 || contains) {
                        i13 = i19;
                        if (contains) {
                            int i25 = R.string.StoragePathFreeInternal;
                            Object[] objArr = new Object[i17];
                            objArr[i13] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                            formatString = LocaleController.formatString(i25, objArr);
                        } else {
                            int i26 = R.string.StoragePathFreeExternal;
                            Object[] objArr2 = new Object[i17];
                            objArr2[i13] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                            formatString = LocaleController.formatString(i26, objArr2);
                        }
                    } else {
                        int i27 = R.string.StoragePathFreeValueExternal;
                        i13 = i19;
                        Object[] objArr3 = new Object[2];
                        objArr3[i13] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                        objArr3[i17] = absolutePath3;
                        formatString = LocaleController.formatString(i27, objArr3);
                    }
                    u4Var.b.setText(LocaleController.getString(contains ? R.string.InternalStorage : R.string.SdCard));
                    u4Var.c.setText(formatString);
                    RadioButton radioButton = u4Var.a;
                    boolean z13 = i13;
                    radioButton.a(z13, z13);
                    u4Var.e = null;
                    u4Var.d = z13;
                    radioButton.a(absolutePath3.startsWith(str3), z13);
                    u4Var.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I5, z13), 2, -1));
                    linearLayout.addView(u4Var);
                    u4Var.setOnClickListener(new di.y3(dataSettingsActivity, absolutePath3, contains, alertDialog$Builder4, 1));
                    i12 = i24 + 1;
                    f10 = f12;
                    size = size;
                    i17 = 1;
                    i19 = 0;
                }
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(e2Var4);
            }
        }
        z11 = true;
        z10 = z11;
        size = dataSettingsActivity.c.size();
        i12 = 0;
        while (i12 < size) {
        }
        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
        dataSettingsActivity.showDialog(e2Var4);
    }

    public static /* synthetic */ void W(DataSettingsActivity dataSettingsActivity) {
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
        dataSettingsActivity.p0(false);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 23));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new zt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        bi.r1 r1Var = new bi.r1(this, context, 27);
        this.b = r1Var;
        r1Var.u1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.b, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new org.telegram.ui.Components.voip.k1(5, this, context));
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.a9.class, org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.n5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        int i10 = org.telegram.ui.ActionBar.y6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void o0(int i10) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            s4.e1 T = this.b.T(this.b.getChildAt(i11));
            if (T != null && T.b() == i10) {
                this.a.v(T, i10);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        p0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        c7.i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        wt wtVar = new wt(this, 1);
        AndroidUtilities.runOnUIThread(wtVar, 100L);
        c7.i0(new bi.c2(this, wtVar, System.currentTimeMillis(), 1));
        if (this.b != null && this.a != null) {
            for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
                View childAt = this.b.getChildAt(i10);
                s4.e1 T = this.b.T(childAt);
                if (T != null) {
                    zt ztVar = this.a;
                    this.b.getClass();
                    ztVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        p0(false);
    }

    public final void p0(boolean z10) {
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
        zt ztVar = this.a;
        if (ztVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                ztVar.m(this.f);
                this.a.o(this.resetDownloadRow);
            } else if (i13 < 0 || i10 >= 0) {
                z10 = true;
            } else {
                ztVar.m(this.f);
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
        zt ztVar2 = this.a;
        if (ztVar2 == null || !z10) {
            return;
        }
        ztVar2.l();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
