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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cu extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ DataSettingsActivity d;

    public cu(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = q1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.e && b10 != dataSettingsActivity.f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.s) {
            i9 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i9 && b10 != dataSettingsActivity.v) {
                i10 = dataSettingsActivity.proxyRow;
                if (b10 != i10) {
                    i11 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i11 && b10 != dataSettingsActivity.A && b10 != dataSettingsActivity.y && b10 != dataSettingsActivity.B && b10 != dataSettingsActivity.C && b10 != dataSettingsActivity.J && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.F && b10 != dataSettingsActivity.n) {
                        i12 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (b10 != i12) {
                            i13 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (b10 != i13) {
                                i14 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (b10 != i14) {
                                    i15 = dataSettingsActivity.resetDownloadRow;
                                    if (b10 != i15) {
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

    @Override // f2.r0
    public final int h() {
        return this.d.Q;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i9 == dataSettingsActivity.r || i9 == dataSettingsActivity.w || i9 == dataSettingsActivity.K || i9 == dataSettingsActivity.M || i9 == dataSettingsActivity.H || i9 == dataSettingsActivity.N || i9 == dataSettingsActivity.P) {
            return 0;
        }
        if (i9 == dataSettingsActivity.d || i9 == dataSettingsActivity.x || i9 == dataSettingsActivity.I || i9 == 0 || i9 == dataSettingsActivity.L || i9 == dataSettingsActivity.E || i9 == dataSettingsActivity.O) {
            return 2;
        }
        if (i9 == dataSettingsActivity.A || i9 == dataSettingsActivity.y || i9 == dataSettingsActivity.B || i9 == dataSettingsActivity.C || i9 == dataSettingsActivity.F || i9 == dataSettingsActivity.G) {
            return 3;
        }
        if (i9 == dataSettingsActivity.D) {
            return 4;
        }
        if (i9 == dataSettingsActivity.e || i9 == dataSettingsActivity.h || i9 == dataSettingsActivity.f) {
            return 5;
        }
        i10 = dataSettingsActivity.saveToGalleryGroupsRow;
        if (i9 == i10) {
            return 5;
        }
        i11 = dataSettingsActivity.saveToGalleryPeerRow;
        if (i9 == i11) {
            return 5;
        }
        i12 = dataSettingsActivity.saveToGalleryChannelsRow;
        if (i9 == i12) {
            return 5;
        }
        return (i9 == dataSettingsActivity.s || i9 == dataSettingsActivity.v || i9 == dataSettingsActivity.n) ? 6 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b5  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        int i19;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z11;
        CharSequence string;
        int i20;
        int i21;
        DownloadController.Preset currentWiFiPreset;
        CharSequence charSequence3;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z12;
        CharSequence charSequence4;
        int i26;
        int i27;
        int i28;
        int i29 = q1Var.f;
        View view = q1Var.a;
        String str = null;
        r5 = null;
        r5 = null;
        DownloadController.Preset preset = null;
        int i30 = 0;
        DataSettingsActivity dataSettingsActivity = this.d;
        switch (i29) {
            case 1:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                baVar.setCanDisable(false);
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                i10 = dataSettingsActivity.useLessDataForCallsRow;
                if (i9 != i10) {
                    i11 = dataSettingsActivity.proxyRow;
                    if (i9 != i11) {
                        i12 = dataSettingsActivity.resetDownloadRow;
                        if (i9 != i12) {
                            if (i9 != dataSettingsActivity.J) {
                                i13 = dataSettingsActivity.clearDraftsRow;
                                if (i9 == i13) {
                                    baVar.setIcon(0);
                                    baVar.b(LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), false);
                                    break;
                                }
                            } else {
                                baVar.setIcon(0);
                                baVar.b(LocaleController.getString(R.string.VoipQuickReplies), false);
                                break;
                            }
                        } else {
                            baVar.setIcon(0);
                            baVar.setCanDisable(true);
                            baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                            baVar.b(LocaleController.getString(R.string.ResetAutomaticMediaDownload), false);
                            break;
                        }
                    } else {
                        baVar.setIcon(0);
                        baVar.b(LocaleController.getString(R.string.ProxySettings), false);
                        break;
                    }
                } else {
                    baVar.setIcon(0);
                    int i31 = MessagesController.getGlobalMainSettings().getInt("VoipDataSaving", org.telegram.ui.Components.voip.e2.c());
                    if (i31 == 0) {
                        str = LocaleController.getString(R.string.UseLessDataNever);
                    } else if (i31 == 1) {
                        str = LocaleController.getString(R.string.UseLessDataOnMobile);
                    } else if (i31 == 2) {
                        str = LocaleController.getString(R.string.UseLessDataAlways);
                    } else if (i31 == 3) {
                        str = LocaleController.getString(R.string.UseLessDataOnRoaming);
                    }
                    baVar.c(LocaleController.getString(R.string.VoipUseLessData), str, dataSettingsActivity.R, true);
                    dataSettingsActivity.R = false;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 != dataSettingsActivity.d) {
                    if (i9 != 0) {
                        if (i9 != dataSettingsActivity.I) {
                            if (i9 != dataSettingsActivity.L) {
                                if (i9 != dataSettingsActivity.x) {
                                    if (i9 != dataSettingsActivity.E) {
                                        if (i9 == dataSettingsActivity.O) {
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
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                if (i9 != dataSettingsActivity.y) {
                    if (i9 != dataSettingsActivity.A) {
                        if (i9 != dataSettingsActivity.C) {
                            if (i9 != dataSettingsActivity.B) {
                                if (i9 != dataSettingsActivity.F) {
                                    if (i9 == dataSettingsActivity.G) {
                                        t8Var.f(LocaleController.getString(R.string.AutoplayVideo), SharedConfig.isAutoplayVideo(), false);
                                        break;
                                    }
                                } else {
                                    t8Var.f(LocaleController.getString(R.string.AutoplayGIF), SharedConfig.isAutoplayGifs(), true);
                                    break;
                                }
                            } else {
                                t8Var.f("(beta only) Stream All Videos", SharedConfig.streamAllVideo, false);
                                break;
                            }
                        } else {
                            t8Var.f("(beta only) Show MKV as Video", SharedConfig.streamMkv, true);
                            break;
                        }
                    }
                } else {
                    t8Var.f(LocaleController.getString(R.string.EnableStreaming), SharedConfig.streamMedia, dataSettingsActivity.B != -1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 == dataSettingsActivity.D) {
                    b9Var.setText(LocaleController.getString(R.string.EnableAllStreamingInfo));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                i14 = dataSettingsActivity.saveToGalleryPeerRow;
                if (i9 != i14) {
                    i15 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i9 != i15) {
                        i16 = dataSettingsActivity.saveToGalleryChannelsRow;
                        if (i9 == i16) {
                            CharSequence string2 = LocaleController.getString(R.string.SaveToGalleryChannels);
                            SaveToGallerySettingsHelper.SharedSettings sharedSettings = SaveToGallerySettingsHelper.channels;
                            i24 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                            CharSequence createDescription = sharedSettings.createDescription(i24);
                            z10 = SaveToGallerySettingsHelper.channels.enabled();
                            charSequence2 = string2;
                            z11 = false;
                            charSequence = createDescription;
                        } else {
                            if (i9 == dataSettingsActivity.e) {
                                string = LocaleController.getString(R.string.WhenUsingMobileData);
                                i22 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i22).mobilePreset.enabled;
                                i23 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                                currentWiFiPreset = DownloadController.getInstance(i23).getCurrentMobilePreset();
                            } else if (i9 == dataSettingsActivity.h) {
                                string = LocaleController.getString(R.string.WhenConnectedOnWiFi);
                                i20 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i20).wifiPreset.enabled;
                                i21 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                                currentWiFiPreset = DownloadController.getInstance(i21).getCurrentWiFiPreset();
                            } else {
                                CharSequence string3 = LocaleController.getString(R.string.WhenRoaming);
                                i17 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                                z10 = DownloadController.getInstance(i17).roamingPreset.enabled;
                                i18 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                                DownloadController.Preset currentRoamingPreset = DownloadController.getInstance(i18).getCurrentRoamingPreset();
                                i19 = dataSettingsActivity.resetDownloadRow;
                                preset = currentRoamingPreset;
                                charSequence = null;
                                charSequence2 = string3;
                                z11 = i19 >= 0;
                            }
                            preset = currentWiFiPreset;
                            charSequence3 = null;
                        }
                        if (preset == null) {
                            StringBuilder sb2 = new StringBuilder();
                            int i32 = 0;
                            boolean z13 = false;
                            int i33 = 0;
                            boolean z14 = false;
                            boolean z15 = false;
                            while (true) {
                                int[] iArr = preset.mask;
                                if (i32 < iArr.length) {
                                    if (!z13 && (iArr[i32] & 1) != 0) {
                                        i33++;
                                        z13 = true;
                                    }
                                    if (!z14 && (iArr[i32] & 4) != 0) {
                                        i33++;
                                        z14 = true;
                                    }
                                    if (!z15 && (iArr[i32] & 8) != 0) {
                                        i33++;
                                        z15 = true;
                                    }
                                    i32++;
                                } else {
                                    if (!preset.enabled || i33 == 0) {
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
                                            i26 = 8;
                                            sb2.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(preset.sizes[DownloadController.typeToIndex(4)], true, false)));
                                        } else {
                                            i26 = 8;
                                        }
                                        if (z15) {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(LocaleController.getString(R.string.AutoDownloadFilesOn));
                                            sb2.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(preset.sizes[DownloadController.typeToIndex(i26)], true, false)));
                                        }
                                    }
                                    if ((z13 || z14 || z15) && z10) {
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
                        j5Var.setAnimationsEnabled(true);
                        j5Var.b(charSequence2, charSequence5, 0, z12, 0, true, z11, false);
                        break;
                    } else {
                        string = LocaleController.getString(R.string.SaveToGalleryGroups);
                        SaveToGallerySettingsHelper.SharedSettings sharedSettings2 = SaveToGallerySettingsHelper.groups;
                        i25 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                        CharSequence createDescription2 = sharedSettings2.createDescription(i25);
                        z10 = SaveToGallerySettingsHelper.groups.enabled();
                        charSequence3 = createDescription2;
                    }
                } else {
                    string = LocaleController.getString(R.string.SaveToGalleryPrivate);
                    SaveToGallerySettingsHelper.SharedSettings sharedSettings3 = SaveToGallerySettingsHelper.user;
                    i27 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
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
                j5Var.setAnimationsEnabled(true);
                j5Var.b(charSequence2, charSequence52, 0, z12, 0, true, z11, false);
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (i9 != dataSettingsActivity.s) {
                    if (i9 != dataSettingsActivity.v) {
                        if (i9 == dataSettingsActivity.n) {
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
                            p8Var.p(LocaleController.getString(R.string.StoragePath), LocaleController.getString((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? R.string.InternalStorage : R.string.SdCard), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                            break;
                        }
                    } else {
                        i28 = ((org.telegram.ui.ActionBar.o2) dataSettingsActivity).currentAccount;
                        StatsController statsController = StatsController.getInstance(i28);
                        p8Var.p(LocaleController.getString(R.string.NetworkUsage), AndroidUtilities.formatFileSize(statsController.getSentBytesCount(2, 6) + statsController.getSentBytesCount(1, 6) + statsController.getSentBytesCount(0, 6) + statsController.getReceivedBytesCount(2, 6) + statsController.getReceivedBytesCount(1, 6) + statsController.getReceivedBytesCount(0, 6)), true, R.drawable.msg_filled_datausage, -11154873, -14175180, dataSettingsActivity.n != -1);
                        break;
                    }
                } else {
                    if (dataSettingsActivity.T) {
                        p8Var.p(LocaleController.getString(R.string.StorageUsage), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                        p8Var.f(45, true, dataSettingsActivity.S);
                    } else {
                        String string4 = LocaleController.getString(R.string.StorageUsage);
                        long j10 = dataSettingsActivity.U;
                        p8Var.p(string4, j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                        p8Var.f(45, false, dataSettingsActivity.S);
                    }
                    dataSettingsActivity.S = false;
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        View p8Var = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? new org.telegram.ui.Cells.p8(context) : new org.telegram.ui.Cells.j5(context) : new org.telegram.ui.Cells.b9(context) : new org.telegram.ui.Cells.t8(context) : new org.telegram.ui.Cells.m4(context, 22) : new org.telegram.ui.Cells.ba(context) : new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        return j3.r0.s(p8Var, p8Var, -1, -2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        if (q1Var.f == 3) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) q1Var.a;
            int b10 = q1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.A) {
                t8Var.setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (b10 == dataSettingsActivity.y) {
                t8Var.setChecked(SharedConfig.streamMedia);
                return;
            }
            if (b10 == dataSettingsActivity.B) {
                t8Var.setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (b10 == dataSettingsActivity.C) {
                t8Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.F) {
                t8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.G) {
                t8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
