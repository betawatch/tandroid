package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ju extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ DataAutoDownloadActivity d;

    public ju(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = c1Var.b();
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i10 = dataAutoDownloadActivity.photosRow;
        if (b10 == i10) {
            return true;
        }
        i11 = dataAutoDownloadActivity.videosRow;
        if (b10 == i11) {
            return true;
        }
        i12 = dataAutoDownloadActivity.filesRow;
        if (b10 == i12) {
            return true;
        }
        i13 = dataAutoDownloadActivity.storiesRow;
        return b10 == i13;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.x;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i11 = dataAutoDownloadActivity.autoDownloadRow;
        if (i10 == i11) {
            return 0;
        }
        if (i10 == dataAutoDownloadActivity.s) {
            return 1;
        }
        if (i10 == dataAutoDownloadActivity.r || i10 == dataAutoDownloadActivity.v) {
            return 2;
        }
        i12 = dataAutoDownloadActivity.usageProgressRow;
        if (i10 == i12) {
            return 3;
        }
        i13 = dataAutoDownloadActivity.photosRow;
        if (i10 == i13) {
            return 4;
        }
        i14 = dataAutoDownloadActivity.videosRow;
        if (i10 == i14) {
            return 4;
        }
        i15 = dataAutoDownloadActivity.filesRow;
        if (i10 == i15) {
            return 4;
        }
        i16 = dataAutoDownloadActivity.storiesRow;
        return i10 == i16 ? 4 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String string;
        int i15;
        DownloadController.Preset currentRoamingPreset;
        int i16;
        int i17;
        int i18;
        StringBuilder sb2;
        StringBuilder sb3;
        int i19;
        int i20;
        int i21;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        int i22 = dataAutoDownloadActivity.f;
        DownloadController.Preset preset = dataAutoDownloadActivity.G;
        int i23 = c1Var.f;
        View view = c1Var.a;
        int i24 = 0;
        if (i23 == 0) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            i11 = dataAutoDownloadActivity.autoDownloadRow;
            if (i10 == i11) {
                x8Var.setDrawCheckRipple(true);
                x8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
                x8Var.setTag(Integer.valueOf(preset.enabled ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6));
                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, preset.enabled ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, false));
                return;
            }
            return;
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == dataAutoDownloadActivity.r) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else {
                if (i10 == dataAutoDownloadActivity.v) {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                    return;
                }
                return;
            }
        }
        if (i23 == 3) {
            dataAutoDownloadActivity.m0((org.telegram.ui.Components.ew0) view);
            return;
        }
        int i25 = -1;
        if (i23 != 4) {
            if (i23 != 5) {
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == dataAutoDownloadActivity.w) {
                f9Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                f9Var.setFixedSize(0);
                f9Var.setImportantForAccessibility(1);
                return;
            } else {
                if (i10 == dataAutoDownloadActivity.n) {
                    if (dataAutoDownloadActivity.r != -1) {
                        f9Var.setText(null);
                        f9Var.setFixedSize(12);
                        f9Var.setImportantForAccessibility(4);
                        return;
                    }
                    if (i22 == 0) {
                        f9Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                    } else if (i22 == 1) {
                        f9Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                    } else if (i22 == 2) {
                        f9Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                    }
                    f9Var.setImportantForAccessibility(1);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        j5Var.setDrawLine(true);
        i12 = dataAutoDownloadActivity.photosRow;
        if (i10 == i12) {
            string = LocaleController.getString(R.string.AutoDownloadPhotos);
            i25 = 1;
        } else {
            i13 = dataAutoDownloadActivity.videosRow;
            if (i10 == i13) {
                string = LocaleController.getString(R.string.AutoDownloadVideos);
                i25 = 4;
            } else {
                i14 = dataAutoDownloadActivity.storiesRow;
                if (i10 == i14) {
                    string = LocaleController.getString(R.string.AutoDownloadStories);
                    j5Var.setDrawLine(false);
                } else {
                    string = LocaleController.getString(R.string.AutoDownloadFiles);
                    i25 = 8;
                }
            }
        }
        if (i22 == 0) {
            i21 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i21).getCurrentMobilePreset();
        } else if (i22 == 1) {
            i16 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i16).getCurrentWiFiPreset();
        } else {
            i15 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i15).getCurrentRoamingPreset();
        }
        long j3 = currentRoamingPreset.sizes[DownloadController.typeToIndex(i25)];
        StringBuilder sb4 = new StringBuilder();
        i17 = dataAutoDownloadActivity.storiesRow;
        if (i10 != i17) {
            int i26 = 0;
            while (true) {
                int[] iArr = currentRoamingPreset.mask;
                if (i26 >= iArr.length) {
                    break;
                }
                if ((iArr[i26] & i25) != 0) {
                    if (sb4.length() != 0) {
                        sb4.append(", ");
                    }
                    if (i26 == 0) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadContacts));
                    } else if (i26 == 1) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadPm));
                    } else if (i26 == 2) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadGroups));
                    } else if (i26 == 3) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadChannels));
                    }
                    i24++;
                }
                i26++;
            }
            if (i24 == 4) {
                sb4.setLength(0);
                i19 = dataAutoDownloadActivity.photosRow;
                if (i10 == i19) {
                    sb4.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                } else {
                    sb4.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j3)));
                }
            } else if (i24 == 0) {
                sb4.append(LocaleController.getString(R.string.AutoDownloadOff));
            } else {
                i18 = dataAutoDownloadActivity.photosRow;
                sb2 = i10 == i18 ? new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb4.toString())) : new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j3), sb4.toString()));
                sb3 = sb2;
            }
            sb3 = sb4;
        } else if (currentRoamingPreset.preloadStories) {
            sb3 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb4.toString()));
            i24 = 1;
        } else {
            sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb4.toString()));
            sb3 = sb2;
        }
        if (dataAutoDownloadActivity.h) {
            j5Var.setChecked(i24 != 0);
        }
        boolean z10 = i24 != 0;
        i20 = dataAutoDownloadActivity.storiesRow;
        j5Var.b(string, sb3, 0, z10, 0, true, i10 != i20, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.d(org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
            x8Var.setTypeface(AndroidUtilities.bold());
            x8Var.setHeight(56);
            view = x8Var;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 3) {
            view = i10 != 4 ? new org.telegram.ui.Cells.f9(context) : new org.telegram.ui.Cells.j5(context);
        } else {
            org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, null);
            ew0Var.setCallback(new iu(this, 0));
            view = ew0Var;
        }
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
