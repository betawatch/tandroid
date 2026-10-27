package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bu extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ DataSettingsActivity d;

    public bu(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = e1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.e && b10 != dataSettingsActivity.f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.s) {
            i10 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i10 && b10 != dataSettingsActivity.v) {
                i11 = dataSettingsActivity.proxyRow;
                if (b10 != i11) {
                    i12 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i12 && b10 != dataSettingsActivity.E && b10 != dataSettingsActivity.y && b10 != dataSettingsActivity.F && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.K && b10 != dataSettingsActivity.J && b10 != dataSettingsActivity.n) {
                        i13 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (b10 != i13) {
                            i14 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (b10 != i14) {
                                i15 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (b10 != i15) {
                                    i16 = dataSettingsActivity.resetDownloadRow;
                                    if (b10 != i16) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.T;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 == dataSettingsActivity.r || i10 == dataSettingsActivity.w || i10 == dataSettingsActivity.N || i10 == dataSettingsActivity.P || i10 == dataSettingsActivity.L || i10 == dataSettingsActivity.Q || i10 == dataSettingsActivity.S) {
            return 0;
        }
        if (i10 == dataSettingsActivity.d || i10 == dataSettingsActivity.x || i10 == dataSettingsActivity.M || i10 == 0 || i10 == dataSettingsActivity.O || i10 == dataSettingsActivity.I || i10 == dataSettingsActivity.R) {
            return 2;
        }
        if (i10 == dataSettingsActivity.E || i10 == dataSettingsActivity.y || i10 == dataSettingsActivity.F || i10 == dataSettingsActivity.G || i10 == dataSettingsActivity.J || i10 == dataSettingsActivity.K) {
            return 3;
        }
        if (i10 == dataSettingsActivity.H) {
            return 4;
        }
        if (i10 == dataSettingsActivity.e || i10 == dataSettingsActivity.h || i10 == dataSettingsActivity.f) {
            return 5;
        }
        i11 = dataSettingsActivity.saveToGalleryGroupsRow;
        if (i10 == i11) {
            return 5;
        }
        i12 = dataSettingsActivity.saveToGalleryPeerRow;
        if (i10 == i12) {
            return 5;
        }
        i13 = dataSettingsActivity.saveToGalleryChannelsRow;
        if (i10 == i13) {
            return 5;
        }
        return (i10 == dataSettingsActivity.s || i10 == dataSettingsActivity.v || i10 == dataSettingsActivity.n) ? 6 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b5  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int i20;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z11;
        CharSequence string;
        int i21;
        int i22;
        DownloadController.Preset currentWiFiPreset;
        CharSequence charSequence3;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z12;
        CharSequence charSequence4;
        boolean z13;
        boolean z14;
        int i27;
        int i28;
        int i29 = e1Var.f;
        View view = e1Var.a;
        String str = null;
        r4 = null;
        r4 = null;
        DownloadController.Preset preset = null;
        int i30 = 0;
        DataSettingsActivity dataSettingsActivity = this.d;
        switch (i29) {
            case 1:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                gaVar.setCanDisable(false);
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.G6, null);
                i11 = dataSettingsActivity.useLessDataForCallsRow;
                if (i10 != i11) {
                    i12 = dataSettingsActivity.proxyRow;
                    if (i10 != i12) {
                        i13 = dataSettingsActivity.resetDownloadRow;
                        if (i10 != i13) {
                            i14 = dataSettingsActivity.clearDraftsRow;
                            if (i10 == i14) {
                                gaVar.setIcon(0);
                                gaVar.b(LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), false);
                                break;
                            }
                        } else {
                            gaVar.setIcon(0);
                            gaVar.setCanDisable(true);
                            org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
                            gaVar.b(LocaleController.getString(R.string.ResetAutomaticMediaDownload), false);
                            break;
                        }
                    } else {
                        gaVar.setIcon(0);
                        gaVar.b(LocaleController.getString(R.string.ProxySettings), false);
                        break;
                    }
                } else {
                    gaVar.setIcon(0);
                    int i31 = MessagesController.getGlobalMainSettings().getInt("VoipDataSaving", org.telegram.ui.Components.voip.g2.c());
                    if (i31 == 0) {
                        str = LocaleController.getString(R.string.UseLessDataNever);
                    } else if (i31 == 1) {
                        str = LocaleController.getString(R.string.UseLessDataOnMobile);
                    } else if (i31 == 2) {
                        str = LocaleController.getString(R.string.UseLessDataAlways);
                    } else if (i31 == 3) {
                        str = LocaleController.getString(R.string.UseLessDataOnRoaming);
                    }
                    gaVar.c(LocaleController.getString(R.string.VoipUseLessData), str, dataSettingsActivity.U, true);
                    dataSettingsActivity.U = false;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 != dataSettingsActivity.d) {
                    if (i10 != 0) {
                        if (i10 != dataSettingsActivity.M) {
                            if (i10 != dataSettingsActivity.O) {
                                if (i10 != dataSettingsActivity.x) {
                                    if (i10 != dataSettingsActivity.I) {
                                        if (i10 == dataSettingsActivity.R) {
                                            q4Var.setText(LocaleController.getString(R.string.SaveToGallerySettings));
                                            break;
                                        }
                                    } else {
                                        q4Var.setText(LocaleController.getString(R.string.AutoplayMedia));
                                        break;
                                    }
                                } else {
                                    q4Var.setText(LocaleController.getString(R.string.Streaming));
                                    break;
                                }
                            } else {
                                q4Var.setText(LocaleController.getString(R.string.Proxy));
                                break;
                            }
                        } else {
                            q4Var.setText(LocaleController.getString(R.string.Calls));
                            break;
                        }
                    } else {
                        q4Var.setText(LocaleController.getString(R.string.DataUsage));
                        break;
                    }
                } else {
                    q4Var.setText(LocaleController.getString(R.string.AutomaticMediaDownload));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 != dataSettingsActivity.y) {
                    if (i10 != dataSettingsActivity.E) {
                        if (i10 != dataSettingsActivity.G) {
                            if (i10 != dataSettingsActivity.F) {
                                if (i10 != dataSettingsActivity.J) {
                                    if (i10 == dataSettingsActivity.K) {
                                        a9Var.f(LocaleController.getString(R.string.AutoplayVideo), SharedConfig.isAutoplayVideo(), false);
                                        break;
                                    }
                                } else {
                                    a9Var.f(LocaleController.getString(R.string.AutoplayGIF), SharedConfig.isAutoplayGifs(), true);
                                    break;
                                }
                            } else {
                                a9Var.f("(beta only) Stream All Videos", SharedConfig.streamAllVideo, false);
                                break;
                            }
                        } else {
                            a9Var.f("(beta only) Show MKV as Video", SharedConfig.streamMkv, true);
                            break;
                        }
                    }
                } else {
                    a9Var.f(LocaleController.getString(R.string.EnableStreaming), SharedConfig.streamMedia, dataSettingsActivity.F != -1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (i10 == dataSettingsActivity.H) {
                    i9Var.setText(LocaleController.getString(R.string.EnableAllStreamingInfo));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                i15 = dataSettingsActivity.saveToGalleryPeerRow;
                if (i10 != i15) {
                    i16 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i10 != i16) {
                        i17 = dataSettingsActivity.saveToGalleryChannelsRow;
                        if (i10 == i17) {
                            CharSequence string2 = LocaleController.getString(R.string.SaveToGalleryChannels);
                            SaveToGallerySettingsHelper.SharedSettings sharedSettings = SaveToGallerySettingsHelper.channels;
                            i25 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                            CharSequence createDescription = sharedSettings.createDescription(i25);
                            z10 = SaveToGallerySettingsHelper.channels.enabled();
                            charSequence2 = string2;
                            z11 = false;
                            charSequence = createDescription;
                        } else {
                            if (i10 == dataSettingsActivity.e) {
                                string = LocaleController.getString(R.string.WhenUsingMobileData);
                                i23 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i23).mobilePreset.enabled;
                                i24 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                                currentWiFiPreset = DownloadController.getInstance(i24).getCurrentMobilePreset();
                            } else if (i10 == dataSettingsActivity.h) {
                                string = LocaleController.getString(R.string.WhenConnectedOnWiFi);
                                i21 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i21).wifiPreset.enabled;
                                i22 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                                currentWiFiPreset = DownloadController.getInstance(i22).getCurrentWiFiPreset();
                            } else {
                                CharSequence string3 = LocaleController.getString(R.string.WhenRoaming);
                                i18 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i18).roamingPreset.enabled;
                                i19 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                                DownloadController.Preset currentRoamingPreset = DownloadController.getInstance(i19).getCurrentRoamingPreset();
                                i20 = dataSettingsActivity.resetDownloadRow;
                                preset = currentRoamingPreset;
                                charSequence = null;
                                charSequence2 = string3;
                                z11 = i20 >= 0;
                            }
                            preset = currentWiFiPreset;
                            charSequence3 = null;
                        }
                        if (preset == null) {
                            StringBuilder sb2 = new StringBuilder();
                            int i32 = 0;
                            boolean z15 = false;
                            int i33 = 0;
                            boolean z16 = false;
                            boolean z17 = false;
                            while (true) {
                                int[] iArr = preset.mask;
                                boolean z18 = z15;
                                if (i32 < iArr.length) {
                                    if (!z15) {
                                        z18 = z15;
                                        if ((iArr[i32] & 1) != 0) {
                                            i33++;
                                            z18 = true;
                                        }
                                    }
                                    if (!z16 && (iArr[i32] & 4) != 0) {
                                        i33++;
                                        z16 = true;
                                    }
                                    if (!z17 && (iArr[i32] & 8) != 0) {
                                        i33++;
                                        z17 = true;
                                    }
                                    i32++;
                                    z15 = z18;
                                    z16 = z16;
                                    z17 = z17;
                                } else {
                                    if (!preset.enabled || i33 == 0) {
                                        z13 = z10;
                                        z14 = z15 ? 1 : 0;
                                        sb2.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                    } else {
                                        if (z15) {
                                            sb2.append(LocaleController.getString(R.string.AutoDownloadPhotosOn));
                                        }
                                        if (z16) {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(LocaleController.getString(R.string.AutoDownloadVideosOn));
                                            long[] jArr = preset.sizes;
                                            int typeToIndex = DownloadController.typeToIndex(4);
                                            z13 = z10;
                                            z14 = z15 ? 1 : 0;
                                            sb2.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(jArr[typeToIndex], true, false)));
                                        } else {
                                            z13 = z10;
                                            z14 = z15 ? 1 : 0;
                                        }
                                        if (z17) {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(LocaleController.getString(R.string.AutoDownloadFilesOn));
                                            sb2.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(preset.sizes[DownloadController.typeToIndex(8)], true, false)));
                                        }
                                    }
                                    if ((z14 || z16 || z17) && z13) {
                                        i30 = 1;
                                    }
                                    z12 = i30;
                                    charSequence4 = sb2;
                                }
                            }
                        } else {
                            z12 = z10;
                            charSequence4 = charSequence;
                        }
                        CharSequence charSequence5 = charSequence4;
                        n5Var.setAnimationsEnabled(true);
                        n5Var.b(charSequence2, charSequence5, 0, z12, 0, true, z11, false);
                        break;
                    } else {
                        string = LocaleController.getString(R.string.SaveToGalleryGroups);
                        SaveToGallerySettingsHelper.SharedSettings sharedSettings2 = SaveToGallerySettingsHelper.groups;
                        i26 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                        CharSequence createDescription2 = sharedSettings2.createDescription(i26);
                        z10 = SaveToGallerySettingsHelper.groups.enabled();
                        charSequence3 = createDescription2;
                    }
                } else {
                    string = LocaleController.getString(R.string.SaveToGalleryPrivate);
                    SaveToGallerySettingsHelper.SharedSettings sharedSettings3 = SaveToGallerySettingsHelper.user;
                    i27 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                    CharSequence createDescription3 = sharedSettings3.createDescription(i27);
                    z10 = SaveToGallerySettingsHelper.user.enabled();
                    charSequence3 = createDescription3;
                }
                charSequence2 = string;
                z11 = true;
                charSequence = charSequence3;
                if (preset == null) {
                }
                CharSequence charSequence52 = charSequence4;
                n5Var.setAnimationsEnabled(true);
                n5Var.b(charSequence2, charSequence52, 0, z12, 0, true, z11, false);
                break;
            case 6:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                if (i10 == dataSettingsActivity.s) {
                    if (dataSettingsActivity.W) {
                        v8Var.r(LocaleController.getString(R.string.StorageUsage), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        v8Var.h(45, true, dataSettingsActivity.V);
                    } else {
                        String string4 = LocaleController.getString(R.string.StorageUsage);
                        long j10 = dataSettingsActivity.X;
                        v8Var.r(string4, j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        v8Var.h(45, false, dataSettingsActivity.V);
                    }
                    dataSettingsActivity.V = false;
                } else if (i10 == dataSettingsActivity.v) {
                    i28 = ((org.telegram.ui.ActionBar.r2) dataSettingsActivity).currentAccount;
                    StatsController statsController = StatsController.getInstance(i28);
                    v8Var.r(LocaleController.getString(R.string.NetworkUsage), AndroidUtilities.formatFileSize(statsController.getSentBytesCount(2, 6) + statsController.getSentBytesCount(1, 6) + statsController.getSentBytesCount(0, 6) + statsController.getReceivedBytesCount(2, 6) + statsController.getReceivedBytesCount(1, 6) + statsController.getReceivedBytesCount(0, 6)), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                } else if (i10 == dataSettingsActivity.n) {
                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                    if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                        int size = dataSettingsActivity.c.size();
                        while (true) {
                            if (i30 < size) {
                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i30)).getAbsolutePath();
                                if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                                    absolutePath = absolutePath2;
                                } else {
                                    i30++;
                                }
                            }
                        }
                    }
                    v8Var.r(LocaleController.getString(R.string.StoragePath), LocaleController.getString((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? R.string.InternalStorage : R.string.SdCard), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                }
                v8Var.setOffsetFromImage(64);
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View v8Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new org.telegram.ui.Cells.v8(context) : new org.telegram.ui.Cells.n5(context) : new org.telegram.ui.Cells.i9(context) : new org.telegram.ui.Cells.a9(context) : new org.telegram.ui.Cells.q4(context, 22) : new org.telegram.ui.Cells.ga(context) : new org.telegram.ui.Cells.f7(context, (d3) null);
        return ic.a.n(v8Var, v8Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        if (e1Var.f == 3) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) e1Var.a;
            int b10 = e1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.E) {
                a9Var.setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (b10 == dataSettingsActivity.y) {
                a9Var.setChecked(SharedConfig.streamMedia);
                return;
            }
            if (b10 == dataSettingsActivity.F) {
                a9Var.setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (b10 == dataSettingsActivity.G) {
                a9Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.J) {
                a9Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.K) {
                a9Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
