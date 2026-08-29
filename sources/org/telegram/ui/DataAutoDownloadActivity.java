package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.o2 {
    public final DownloadController.Preset A;
    public final DownloadController.Preset B;
    public final DownloadController.Preset C;
    public final DownloadController.Preset D;
    public boolean E;
    public final String F;
    public final String G;
    public yt a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.jl0 b;
    public final ArrayList c;
    public int d;
    public int e;
    public final int f;
    private int filesRow;
    public boolean h;
    public int n;
    private int photosRow;
    public int r;
    public int s;
    private int storiesRow;
    private int usageProgressRow;
    public int v;
    private int videosRow;
    public int w;
    public int x;
    public final DownloadController.Preset y;

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.c = new ArrayList();
        this.d = 1;
        this.f = i10;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.y = preset;
        DownloadController.Preset preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.A = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.B = preset3;
        if (i10 == 0) {
            this.e = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.C = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.D = preset2;
            this.F = "mobilePreset";
            this.G = "currentMobilePreset";
            return;
        }
        if (i10 == 1) {
            this.e = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.C = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.D = preset3;
            this.F = "wifiPreset";
            this.G = "currentWifiPreset";
            return;
        }
        this.e = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
        this.C = DownloadController.getInstance(this.currentAccount).roamingPreset;
        this.D = preset;
        this.F = "roamingPreset";
        this.G = "currentRoamingPreset";
    }

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i10, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            n8Var.setChecked(!n8Var.b.h);
            int i11 = 0;
            while (true) {
                if (i11 >= n8VarArr.length) {
                    z10 = false;
                    break;
                } else if (n8VarArr[i11].b.h) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i10 != dataAutoDownloadActivity.videosRow || b5VarArr[0].isEnabled() == z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            b5VarArr[0].a(arrayList, z10);
            if (b5VarArr[0].getSize() > 2097152) {
                q8VarArr[0].e(arrayList, z10);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new org.telegram.ui.Components.p11(animatorSetArr, 21));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8[] n8VarArr, int i10, org.telegram.ui.Cells.b5[] b5VarArr, int i11, org.telegram.ui.Cells.q8[] q8VarArr, int i12, String str, String str2, org.telegram.ui.ActionBar.a3 a3Var, View view) {
        Runnable runnable;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i13 = dataAutoDownloadActivity.e;
        if (i13 != 3) {
            if (i13 == 0) {
                preset.set(dataAutoDownloadActivity.y);
            } else if (i13 == 1) {
                preset.set(dataAutoDownloadActivity.A);
            } else if (i13 == 2) {
                preset.set(dataAutoDownloadActivity.B);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (n8VarArr[i14].b.h) {
                int[] iArr = preset.mask;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.b5 b5Var = b5VarArr[0];
        if (b5Var != null) {
            b5Var.getSize();
            preset.sizes[i11] = (int) b5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.q8 q8Var = q8VarArr[0];
        if (q8Var != null) {
            Switch r9 = q8Var.e;
            if (i12 == dataAutoDownloadActivity.videosRow) {
                preset.preloadVideo = r9.h;
            } else {
                preset.preloadMusic = r9.h;
            }
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
        edit.putString(str, preset.toString());
        dataAutoDownloadActivity.e = 3;
        edit.putInt(str2, 3);
        int i15 = dataAutoDownloadActivity.f;
        if (i15 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i15 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        edit.commit();
        runnable = a3Var.a.dismissRunnable;
        runnable.run();
        f2.n1 G = dataAutoDownloadActivity.b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.a.v(G, i12);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.E = true;
        dataAutoDownloadActivity.l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    public static void W(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f9) {
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z10;
        final org.telegram.ui.Cells.q8[] q8VarArr;
        ?? r12;
        ArrayList arrayList;
        int i11 = i10;
        DownloadController.Preset preset = dataAutoDownloadActivity.B;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.A;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.y;
        int i12 = dataAutoDownloadActivity.f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.C;
        boolean z11 = false;
        if (i11 == dataAutoDownloadActivity.autoDownloadRow) {
            int i13 = dataAutoDownloadActivity.e;
            if (i13 != 3) {
                if (i13 == 0) {
                    preset4.set(preset3);
                } else if (i13 == 1) {
                    preset4.set(preset2);
                } else if (i13 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z12 = q8Var.e.h;
            if (z12 || !preset4.enabled) {
                preset4.enabled = !preset4.enabled;
            } else {
                System.arraycopy(dataAutoDownloadActivity.D.mask, 0, preset4.mask, 0, 4);
            }
            view.setTag(Integer.valueOf(preset4.enabled ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6));
            boolean z13 = !z12;
            q8Var.b(org.telegram.ui.ActionBar.g6.w0(null, preset4.enabled ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6, false), z13);
            dataAutoDownloadActivity.n0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.a.s(dataAutoDownloadActivity.n + 1, 9);
            } else {
                dataAutoDownloadActivity.a.t(dataAutoDownloadActivity.n + 1, 9);
            }
            dataAutoDownloadActivity.a.m(dataAutoDownloadActivity.n);
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            edit.putString(dataAutoDownloadActivity.F, preset4.toString());
            String str3 = dataAutoDownloadActivity.G;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i12 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
            } else if (i12 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
            }
            edit.commit();
            q8Var.setChecked(z13);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.E = true;
            return;
        }
        if ((i11 == dataAutoDownloadActivity.photosRow || i11 == dataAutoDownloadActivity.videosRow || i11 == dataAutoDownloadActivity.filesRow || i11 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            int i14 = i11 == dataAutoDownloadActivity.photosRow ? 1 : i11 == dataAutoDownloadActivity.videosRow ? 4 : i11 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            final int typeToIndex = DownloadController.typeToIndex(i14);
            if (i12 == 0) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i12 == 1) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z14 = h5Var.e.h;
            if (i11 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f9 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f9 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset5 = currentRoamingPreset;
                int i15 = i14;
                String str4 = str;
                String str5 = str2;
                int i16 = dataAutoDownloadActivity.e;
                if (i16 != 3) {
                    if (i16 == 0) {
                        preset4.set(preset3);
                    } else if (i16 == 1) {
                        preset4.set(preset2);
                    } else if (i16 == 2) {
                        preset4.set(preset);
                    }
                }
                if (i11 != dataAutoDownloadActivity.storiesRow) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= preset4.mask.length) {
                            z10 = false;
                            break;
                        } else {
                            if ((preset5.mask[i17] & i15) != 0) {
                                z10 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    int i18 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i18 >= iArr.length) {
                            break;
                        }
                        if (z14) {
                            iArr[i18] = iArr[i18] & (~i15);
                        } else if (!z10) {
                            iArr[i18] = iArr[i18] | i15;
                        }
                        i18++;
                    }
                } else {
                    preset4.preloadStories = !z14;
                }
                SharedPreferences.Editor edit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                edit2.putString(str4, preset4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i12 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
                } else if (i12 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                h5Var.setChecked(!z14);
                org.telegram.ui.Components.jl0 jl0Var = dataAutoDownloadActivity.b;
                View F = jl0Var.F(view);
                f2.n1 T = F == null ? null : jl0Var.T(F);
                if (T != null) {
                    dataAutoDownloadActivity.a.v(T, i11);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.E = true;
                dataAutoDownloadActivity.l0();
                return;
            }
            if (dataAutoDownloadActivity.getParentActivity() == null) {
                return;
            }
            final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(dataAutoDownloadActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
            f3Var.applyTopPadding = false;
            a3Var.a();
            LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
            linearLayout.setOrientation(1);
            a3Var.b(linearLayout);
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.g6.n5, 21, 15, false, null);
            if (i11 == dataAutoDownloadActivity.photosRow) {
                k4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
            } else if (i11 == dataAutoDownloadActivity.videosRow) {
                k4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
            } else {
                k4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
            }
            linearLayout.addView(k4Var, i7.f6.c(-2.0f, -1));
            org.telegram.ui.Cells.b5[] b5VarArr = new org.telegram.ui.Cells.b5[1];
            org.telegram.ui.Cells.q8[] q8VarArr2 = new org.telegram.ui.Cells.q8[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i19 = 4;
            org.telegram.ui.Cells.n8[] n8VarArr = new org.telegram.ui.Cells.n8[4];
            int i20 = 0;
            while (i20 < i19) {
                Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(parentActivity);
                boolean z15 = LocaleController.isRTL;
                TextView textView = new TextView(parentActivity);
                n8Var.a = textView;
                AnimatorSet[] animatorSetArr2 = animatorSetArr;
                org.telegram.ui.Cells.b5[] b5VarArr2 = b5VarArr;
                b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, z11), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                n8Var.addView(textView, i7.f6.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 66.0f : 21.0f, 0.0f, z15 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                n8Var.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                n8Var.addView(checkBoxSquare, i7.f6.d(18, 18.0f, (z15 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                n8VarArr[i20] = n8Var;
                if (i20 == 0) {
                    n8Var.a(LocaleController.getString(R.string.AutodownloadContacts), (currentRoamingPreset.mask[0] & i14) != 0, true);
                } else if (i20 == 1) {
                    n8Var.a(LocaleController.getString(R.string.AutodownloadPrivateChats), (currentRoamingPreset.mask[1] & i14) != 0, true);
                } else if (i20 == 2) {
                    n8Var.a(LocaleController.getString(R.string.AutodownloadGroupChats), (currentRoamingPreset.mask[2] & i14) != 0, true);
                } else {
                    n8Var.a(LocaleController.getString(R.string.AutodownloadChannels), (currentRoamingPreset.mask[3] & i14) != 0, i11 != dataAutoDownloadActivity.photosRow);
                }
                n8VarArr[i20].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                org.telegram.ui.Cells.n8 n8Var2 = n8VarArr[i20];
                int i21 = i11;
                org.telegram.ui.Cells.n8[] n8VarArr2 = n8VarArr;
                jh.t8 t8Var = new jh.t8(dataAutoDownloadActivity, n8Var, n8VarArr2, i21, b5VarArr2, q8VarArr2, animatorSetArr2);
                i11 = i21;
                n8Var2.setOnClickListener(t8Var);
                linearLayout.addView(n8VarArr2[i20], i7.f6.c(50.0f, -1));
                i20++;
                n8VarArr = n8VarArr2;
                currentRoamingPreset = currentRoamingPreset;
                animatorSetArr = animatorSetArr2;
                b5VarArr = b5VarArr2;
                i19 = 4;
                z11 = false;
            }
            AnimatorSet[] animatorSetArr3 = animatorSetArr;
            final org.telegram.ui.Cells.b5[] b5VarArr3 = b5VarArr;
            DownloadController.Preset preset6 = currentRoamingPreset;
            final org.telegram.ui.Cells.n8[] n8VarArr3 = n8VarArr;
            if (i11 != dataAutoDownloadActivity.photosRow) {
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(dataAutoDownloadActivity.getParentActivity());
                wt wtVar = new wt(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i11, y8Var, q8VarArr2, animatorSetArr3);
                org.telegram.ui.Cells.q8[] q8VarArr3 = q8VarArr2;
                b5VarArr3[0] = wtVar;
                wtVar.setSize(preset6.sizes[typeToIndex]);
                linearLayout.addView(b5VarArr3[0], i7.f6.n(-1, 50));
                View q8Var2 = new org.telegram.ui.Cells.q8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                q8VarArr3[0] = q8Var2;
                linearLayout.addView(q8Var2, i7.f6.n(-1, 48));
                q8VarArr3[0].setOnClickListener(new a(q8VarArr3, 16));
                y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
                linearLayout.addView(y8Var, i7.f6.n(-1, -2));
                if (i11 == dataAutoDownloadActivity.videosRow) {
                    b5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                    q8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                    y8Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                    q8VarArr = q8VarArr3;
                } else {
                    b5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                    q8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                    y8Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                    q8VarArr = q8VarArr3;
                }
            } else {
                b5VarArr3[0] = null;
                q8VarArr2[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d7, false));
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                q8VarArr = q8VarArr2;
            }
            if (i11 == dataAutoDownloadActivity.videosRow) {
                int i22 = 0;
                while (true) {
                    if (i22 >= 4) {
                        r12 = 0;
                        arrayList = null;
                        b5VarArr3[0].a(null, false);
                        q8VarArr[0].e(null, false);
                        break;
                    }
                    if (n8VarArr3[i22].b.h) {
                        arrayList = null;
                        r12 = 0;
                        break;
                    }
                    i22++;
                }
                if (preset6.sizes[typeToIndex] <= 2097152) {
                    q8VarArr[r12].e(arrayList, r12);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            linearLayout.addView(frameLayout, i7.f6.n(-1, 52));
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i23 = org.telegram.ui.ActionBar.g6.n5;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView2, i7.f6.e(-2, 36, 51));
            textView2.setOnClickListener(new a(a3Var, 17));
            TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView3, i7.f6.e(-2, 36, 53));
            final String str6 = str;
            final String str7 = str2;
            final int i24 = i11;
            final int i25 = i14;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.V(DataAutoDownloadActivity.this, n8VarArr3, i25, b5VarArr3, typeToIndex, q8VarArr, i24, str6, str7, a3Var, view);
                }
            });
            dataAutoDownloadActivity.showDialog(f3Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 4));
        this.a = new yt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.b = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setVerticalScrollBarEnabled(false);
        ((f2.l) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new f2.j0(1, false));
        frameLayout2.addView(this.b, i7.f6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new c1(this, 29));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Components.lv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262160, new Class[]{org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262160, new Class[]{org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.g6.e6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.g6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        int i10 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.y6));
        return arrayList;
    }

    public final void l0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        DownloadController.Preset preset = this.y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.A;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.B;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.C;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.wp0(3));
        int i10 = this.e;
        if (i10 == 0 || (i10 == 3 && preset4.equals(preset))) {
            this.d = arrayList.indexOf(preset);
        } else {
            int i11 = this.e;
            if (i11 == 1 || (i11 == 3 && preset4.equals(preset2))) {
                this.d = arrayList.indexOf(preset2);
            } else {
                int i12 = this.e;
                if (i12 == 2 || (i12 == 3 && preset4.equals(preset3))) {
                    this.d = arrayList.indexOf(preset3);
                } else {
                    this.d = arrayList.indexOf(preset4);
                }
            }
        }
        org.telegram.ui.Components.jl0 jl0Var = this.b;
        if (jl0Var != null) {
            f2.n1 K = jl0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Components.lv0) {
                    m0((org.telegram.ui.Components.lv0) view);
                    return;
                }
            }
            this.a.m(this.usageProgressRow);
        }
    }

    public final void m0(org.telegram.ui.Components.lv0 lv0Var) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i10);
            if (preset == this.y) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.A) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.B) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        lv0Var.b(this.d, null, strArr);
    }

    public final void n0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.x = i10;
        this.n = 1;
        if (!this.C.enabled) {
            this.r = -1;
            this.usageProgressRow = -1;
            this.s = -1;
            this.v = -1;
            this.photosRow = -1;
            this.videosRow = -1;
            this.filesRow = -1;
            this.storiesRow = -1;
            this.w = -1;
            return;
        }
        this.r = i10;
        this.usageProgressRow = i10 + 1;
        this.s = i10 + 2;
        this.v = i10 + 3;
        this.photosRow = i10 + 4;
        this.videosRow = i10 + 5;
        this.filesRow = i10 + 6;
        this.storiesRow = i10 + 7;
        this.x = i10 + 9;
        this.w = i10 + 8;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        l0();
        n0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        if (this.E) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f);
            this.E = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        yt ytVar = this.a;
        if (ytVar != null) {
            ytVar.l();
        }
    }
}
