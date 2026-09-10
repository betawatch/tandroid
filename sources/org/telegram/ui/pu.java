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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pu extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ DataSettingsActivity d;

    public pu(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = c1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.e && b10 != dataSettingsActivity.f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.s) {
            i10 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i10 && b10 != dataSettingsActivity.v) {
                i11 = dataSettingsActivity.proxyRow;
                if (b10 != i11) {
                    i12 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i12 && b10 != dataSettingsActivity.E && b10 != dataSettingsActivity.y && b10 != dataSettingsActivity.F && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.N && b10 != dataSettingsActivity.K && b10 != dataSettingsActivity.J && b10 != dataSettingsActivity.n) {
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
        return this.d.U;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 == dataSettingsActivity.r || i10 == dataSettingsActivity.w || i10 == dataSettingsActivity.O || i10 == dataSettingsActivity.Q || i10 == dataSettingsActivity.L || i10 == dataSettingsActivity.R || i10 == dataSettingsActivity.T) {
            return 0;
        }
        if (i10 == dataSettingsActivity.d || i10 == dataSettingsActivity.x || i10 == dataSettingsActivity.M || i10 == 0 || i10 == dataSettingsActivity.P || i10 == dataSettingsActivity.I || i10 == dataSettingsActivity.S) {
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
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b5  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
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
        int i27;
        int i28;
        int i29;
        int i30 = c1Var.f;
        View view = c1Var.a;
        String str = null;
        r5 = null;
        r5 = null;
        DownloadController.Preset preset = null;
        int i31 = 0;
        DataSettingsActivity dataSettingsActivity = this.d;
        switch (i30) {
            case 1:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                gaVar.setCanDisable(false);
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                i11 = dataSettingsActivity.useLessDataForCallsRow;
                if (i10 != i11) {
                    i12 = dataSettingsActivity.proxyRow;
                    if (i10 != i12) {
                        i13 = dataSettingsActivity.resetDownloadRow;
                        if (i10 != i13) {
                            if (i10 != dataSettingsActivity.N) {
                                i14 = dataSettingsActivity.clearDraftsRow;
                                if (i10 == i14) {
                                    gaVar.setIcon(0);
                                    gaVar.b(LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), false);
                                    break;
                                }
                            } else {
                                gaVar.setIcon(0);
                                gaVar.b(LocaleController.getString(R.string.VoipQuickReplies), false);
                                break;
                            }
                        } else {
                            gaVar.setIcon(0);
                            gaVar.setCanDisable(true);
                            gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
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
                    int i32 = MessagesController.getGlobalMainSettings().getInt("VoipDataSaving", org.telegram.ui.Components.voip.e2.c());
                    if (i32 == 0) {
                        str = LocaleController.getString(R.string.UseLessDataNever);
                    } else if (i32 == 1) {
                        str = LocaleController.getString(R.string.UseLessDataOnMobile);
                    } else if (i32 == 2) {
                        str = LocaleController.getString(R.string.UseLessDataAlways);
                    } else if (i32 == 3) {
                        str = LocaleController.getString(R.string.UseLessDataOnRoaming);
                    }
                    gaVar.c(LocaleController.getString(R.string.VoipUseLessData), str, dataSettingsActivity.V, true);
                    dataSettingsActivity.V = false;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != dataSettingsActivity.d) {
                    if (i10 != 0) {
                        if (i10 != dataSettingsActivity.M) {
                            if (i10 != dataSettingsActivity.P) {
                                if (i10 != dataSettingsActivity.x) {
                                    if (i10 != dataSettingsActivity.I) {
                                        if (i10 == dataSettingsActivity.S) {
                                            m4Var.setText(LocaleController.getString(R.string.SaveToGallerySettings));
                                            break;
                                        }
                                    } else {
                                        m4Var.setText(LocaleController.getString(R.string.AutoplayMedia));
                                        break;
                                    }
                                } else {
                                    m4Var.setText(LocaleController.getString(R.string.Streaming));
                                    break;
                                }
                            } else {
                                m4Var.setText(LocaleController.getString(R.string.Proxy));
                                break;
                            }
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.Calls));
                            break;
                        }
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.DataUsage));
                        break;
                    }
                } else {
                    m4Var.setText(LocaleController.getString(R.string.AutomaticMediaDownload));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 != dataSettingsActivity.y) {
                    if (i10 != dataSettingsActivity.E) {
                        if (i10 != dataSettingsActivity.G) {
                            if (i10 != dataSettingsActivity.F) {
                                if (i10 != dataSettingsActivity.J) {
                                    if (i10 == dataSettingsActivity.K) {
                                        x8Var.f(LocaleController.getString(R.string.AutoplayVideo), SharedConfig.isAutoplayVideo(), false);
                                        break;
                                    }
                                } else {
                                    x8Var.f(LocaleController.getString(R.string.AutoplayGIF), SharedConfig.isAutoplayGifs(), true);
                                    break;
                                }
                            } else {
                                x8Var.f("(beta only) Stream All Videos", SharedConfig.streamAllVideo, false);
                                break;
                            }
                        } else {
                            x8Var.f("(beta only) Show MKV as Video", SharedConfig.streamMkv, true);
                            break;
                        }
                    }
                } else {
                    x8Var.f(LocaleController.getString(R.string.EnableStreaming), SharedConfig.streamMedia, dataSettingsActivity.F != -1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 == dataSettingsActivity.H) {
                    f9Var.setText(LocaleController.getString(R.string.EnableAllStreamingInfo));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                i15 = dataSettingsActivity.saveToGalleryPeerRow;
                if (i10 != i15) {
                    i16 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i10 != i16) {
                        i17 = dataSettingsActivity.saveToGalleryChannelsRow;
                        if (i10 == i17) {
                            CharSequence string2 = LocaleController.getString(R.string.SaveToGalleryChannels);
                            SaveToGallerySettingsHelper.SharedSettings sharedSettings = SaveToGallerySettingsHelper.channels;
                            i25 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                            CharSequence createDescription = sharedSettings.createDescription(i25);
                            z10 = SaveToGallerySettingsHelper.channels.enabled();
                            charSequence2 = string2;
                            z11 = false;
                            charSequence = createDescription;
                        } else {
                            if (i10 == dataSettingsActivity.e) {
                                string = LocaleController.getString(R.string.WhenUsingMobileData);
                                i23 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i23).mobilePreset.enabled;
                                i24 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                                currentWiFiPreset = DownloadController.getInstance(i24).getCurrentMobilePreset();
                            } else if (i10 == dataSettingsActivity.h) {
                                string = LocaleController.getString(R.string.WhenConnectedOnWiFi);
                                i21 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i21).wifiPreset.enabled;
                                i22 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                                currentWiFiPreset = DownloadController.getInstance(i22).getCurrentWiFiPreset();
                            } else {
                                CharSequence string3 = LocaleController.getString(R.string.WhenRoaming);
                                i18 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i18).roamingPreset.enabled;
                                i19 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
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
                            int i33 = 0;
                            boolean z13 = false;
                            int i34 = 0;
                            boolean z14 = false;
                            boolean z15 = false;
                            while (true) {
                                int[] iArr = preset.mask;
                                if (i33 < iArr.length) {
                                    if (!z13 && (iArr[i33] & 1) != 0) {
                                        i34++;
                                        z13 = true;
                                    }
                                    if (!z14 && (iArr[i33] & 4) != 0) {
                                        i34++;
                                        z14 = true;
                                    }
                                    if (!z15 && (iArr[i33] & 8) != 0) {
                                        i34++;
                                        z15 = true;
                                    }
                                    i33++;
                                } else {
                                    if (!preset.enabled || i34 == 0) {
                                        sb2.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                    } else {
                                        if (z13) {
                                            sb2.append(LocaleController.getString(R.string.AutoDownloadPhotosOn));
                                        }
                                        if (z14) {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(LocaleController.getString(R.string.AutoDownloadVideosOn));
                                            i27 = 8;
                                            sb2.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(preset.sizes[DownloadController.typeToIndex(4)], true, false)));
                                        } else {
                                            i27 = 8;
                                        }
                                        if (z15) {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(LocaleController.getString(R.string.AutoDownloadFilesOn));
                                            sb2.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(preset.sizes[DownloadController.typeToIndex(i27)], true, false)));
                                        }
                                    }
                                    if ((z13 || z14 || z15) && z10) {
                                        i31 = 1;
                                    }
                                    z12 = i31;
                                    charSequence4 = sb2;
                                }
                            }
                        } else {
                            z12 = z10;
                            charSequence4 = charSequence;
                        }
                        CharSequence charSequence5 = charSequence4;
                        j5Var.setAnimationsEnabled(true);
                        j5Var.b(charSequence2, charSequence5, 0, z12, 0, true, z11, false);
                        break;
                    } else {
                        string = LocaleController.getString(R.string.SaveToGalleryGroups);
                        SaveToGallerySettingsHelper.SharedSettings sharedSettings2 = SaveToGallerySettingsHelper.groups;
                        i26 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                        CharSequence createDescription2 = sharedSettings2.createDescription(i26);
                        z10 = SaveToGallerySettingsHelper.groups.enabled();
                        charSequence3 = createDescription2;
                    }
                } else {
                    string = LocaleController.getString(R.string.SaveToGalleryPrivate);
                    SaveToGallerySettingsHelper.SharedSettings sharedSettings3 = SaveToGallerySettingsHelper.user;
                    i28 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                    CharSequence createDescription3 = sharedSettings3.createDescription(i28);
                    z10 = SaveToGallerySettingsHelper.user.enabled();
                    charSequence3 = createDescription3;
                }
                charSequence2 = string;
                z11 = true;
                charSequence = charSequence3;
                if (preset == null) {
                }
                CharSequence charSequence52 = charSequence4;
                j5Var.setAnimationsEnabled(true);
                j5Var.b(charSequence2, charSequence52, 0, z12, 0, true, z11, false);
                break;
            case 6:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (i10 != dataSettingsActivity.s) {
                    if (i10 != dataSettingsActivity.v) {
                        if (i10 == dataSettingsActivity.n) {
                            String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                                int size = dataSettingsActivity.c.size();
                                while (true) {
                                    if (i31 < size) {
                                        String absolutePath2 = ((File) dataSettingsActivity.c.get(i31)).getAbsolutePath();
                                        if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                                            absolutePath = absolutePath2;
                                        } else {
                                            i31++;
                                        }
                                    }
                                }
                            }
                            s8Var.p(LocaleController.getString(R.string.StoragePath), LocaleController.getString((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? R.string.InternalStorage : R.string.SdCard), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                            break;
                        }
                    } else {
                        i29 = ((org.telegram.ui.ActionBar.p2) dataSettingsActivity).currentAccount;
                        StatsController statsController = StatsController.getInstance(i29);
                        s8Var.p(LocaleController.getString(R.string.NetworkUsage), AndroidUtilities.formatFileSize(statsController.getSentBytesCount(2, 6) + statsController.getSentBytesCount(1, 6) + statsController.getSentBytesCount(0, 6) + statsController.getReceivedBytesCount(2, 6) + statsController.getReceivedBytesCount(1, 6) + statsController.getReceivedBytesCount(0, 6)), true, R.drawable.msg_filled_datausage, -11154873, -14175180, dataSettingsActivity.n != -1);
                        break;
                    }
                } else {
                    if (dataSettingsActivity.X) {
                        s8Var.p(LocaleController.getString(R.string.StorageUsage), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                        s8Var.f(45, true, dataSettingsActivity.W);
                    } else {
                        String string4 = LocaleController.getString(R.string.StorageUsage);
                        long j3 = dataSettingsActivity.Y;
                        s8Var.p(string4, j3 <= 0 ? "" : AndroidUtilities.formatFileSize(j3), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                        s8Var.f(45, false, dataSettingsActivity.W);
                    }
                    dataSettingsActivity.W = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View s8Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new org.telegram.ui.Cells.s8(context) : new org.telegram.ui.Cells.j5(context) : new org.telegram.ui.Cells.f9(context) : new org.telegram.ui.Cells.x8(context) : new org.telegram.ui.Cells.m4(context, 22) : new org.telegram.ui.Cells.ga(context) : new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        return com.google.android.gms.internal.vision.e2.j(s8Var, s8Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 3) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) c1Var.a;
            int b10 = c1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.E) {
                x8Var.setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (b10 == dataSettingsActivity.y) {
                x8Var.setChecked(SharedConfig.streamMedia);
                return;
            }
            if (b10 == dataSettingsActivity.F) {
                x8Var.setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (b10 == dataSettingsActivity.G) {
                x8Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.J) {
                x8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.K) {
                x8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
