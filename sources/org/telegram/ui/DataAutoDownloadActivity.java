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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.o2 {
    public final DownloadController.Preset A;
    public final DownloadController.Preset B;
    public final DownloadController.Preset C;
    public final DownloadController.Preset D;
    public boolean E;
    public final String F;
    public final String G;
    public xt a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.wk0 b;
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

    public DataAutoDownloadActivity(int i9) {
        super(null);
        this.c = new ArrayList();
        this.d = 1;
        this.f = i9;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.y = preset;
        DownloadController.Preset preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.A = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.B = preset3;
        if (i9 == 0) {
            this.e = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.C = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.D = preset2;
            this.F = "mobilePreset";
            this.G = "currentMobilePreset";
            return;
        }
        if (i9 == 1) {
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

    public static void T(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8 q8Var, org.telegram.ui.Cells.q8[] q8VarArr, int i9, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            q8Var.setChecked(!q8Var.b.h);
            int i10 = 0;
            while (true) {
                if (i10 >= q8VarArr.length) {
                    z10 = false;
                    break;
                } else if (q8VarArr[i10].b.h) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i9 != dataAutoDownloadActivity.videosRow || d5VarArr[0].isEnabled() == z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            d5VarArr[0].a(arrayList, z10);
            if (d5VarArr[0].getSize() > 2097152) {
                t8VarArr[0].e(arrayList, z10);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new org.telegram.ui.Components.y11(animatorSetArr, 19));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8[] q8VarArr, int i9, org.telegram.ui.Cells.d5[] d5VarArr, int i10, org.telegram.ui.Cells.t8[] t8VarArr, int i11, String str, String str2, org.telegram.ui.ActionBar.a3 a3Var, View view) {
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i12 = dataAutoDownloadActivity.e;
        if (i12 != 3) {
            if (i12 == 0) {
                preset.set(dataAutoDownloadActivity.y);
            } else if (i12 == 1) {
                preset.set(dataAutoDownloadActivity.A);
            } else if (i12 == 2) {
                preset.set(dataAutoDownloadActivity.B);
            }
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (q8VarArr[i13].b.h) {
                int[] iArr = preset.mask;
                iArr[i13] = iArr[i13] | i9;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i13] = iArr2[i13] & (~i9);
            }
        }
        org.telegram.ui.Cells.d5 d5Var = d5VarArr[0];
        if (d5Var != null) {
            d5Var.getSize();
            preset.sizes[i10] = (int) d5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.t8 t8Var = t8VarArr[0];
        if (t8Var != null) {
            Switch r92 = t8Var.e;
            if (i11 == dataAutoDownloadActivity.videosRow) {
                preset.preloadVideo = r92.h;
            } else {
                preset.preloadMusic = r92.h;
            }
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
        edit.putString(str, preset.toString());
        dataAutoDownloadActivity.e = 3;
        edit.putInt(str2, 3);
        int i14 = dataAutoDownloadActivity.f;
        if (i14 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i14 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        edit.commit();
        a3Var.a.dismissRunnable.run();
        f2.q1 G = dataAutoDownloadActivity.b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.a.v(G, i11);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.E = true;
        dataAutoDownloadActivity.k0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    public static void V(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i9, float f10) {
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z10;
        final org.telegram.ui.Cells.t8[] t8VarArr;
        ?? r12;
        ArrayList arrayList;
        int i10 = i9;
        DownloadController.Preset preset = dataAutoDownloadActivity.B;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.A;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.y;
        int i11 = dataAutoDownloadActivity.f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.C;
        boolean z11 = false;
        if (i10 == dataAutoDownloadActivity.autoDownloadRow) {
            int i12 = dataAutoDownloadActivity.e;
            if (i12 != 3) {
                if (i12 == 0) {
                    preset4.set(preset3);
                } else if (i12 == 1) {
                    preset4.set(preset2);
                } else if (i12 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z12 = t8Var.e.h;
            if (z12 || !preset4.enabled) {
                preset4.enabled = !preset4.enabled;
            } else {
                System.arraycopy(dataAutoDownloadActivity.D.mask, 0, preset4.mask, 0, 4);
            }
            view.setTag(Integer.valueOf(preset4.enabled ? org.telegram.ui.ActionBar.f6.f6 : org.telegram.ui.ActionBar.f6.e6));
            boolean z13 = !z12;
            t8Var.b(org.telegram.ui.ActionBar.f6.w0(null, preset4.enabled ? org.telegram.ui.ActionBar.f6.f6 : org.telegram.ui.ActionBar.f6.e6, false), z13);
            dataAutoDownloadActivity.m0();
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
            if (i11 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
            } else if (i11 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
            }
            edit.commit();
            t8Var.setChecked(z13);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.E = true;
            return;
        }
        if ((i10 == dataAutoDownloadActivity.photosRow || i10 == dataAutoDownloadActivity.videosRow || i10 == dataAutoDownloadActivity.filesRow || i10 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            int i13 = i10 == dataAutoDownloadActivity.photosRow ? 1 : i10 == dataAutoDownloadActivity.videosRow ? 4 : i10 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            final int typeToIndex = DownloadController.typeToIndex(i13);
            if (i11 == 0) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i11 == 1) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z14 = j5Var.e.h;
            if (i10 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset5 = currentRoamingPreset;
                int i14 = i13;
                String str4 = str;
                String str5 = str2;
                int i15 = dataAutoDownloadActivity.e;
                if (i15 != 3) {
                    if (i15 == 0) {
                        preset4.set(preset3);
                    } else if (i15 == 1) {
                        preset4.set(preset2);
                    } else if (i15 == 2) {
                        preset4.set(preset);
                    }
                }
                if (i10 != dataAutoDownloadActivity.storiesRow) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= preset4.mask.length) {
                            z10 = false;
                            break;
                        } else {
                            if ((preset5.mask[i16] & i14) != 0) {
                                z10 = true;
                                break;
                            }
                            i16++;
                        }
                    }
                    int i17 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i17 >= iArr.length) {
                            break;
                        }
                        if (z14) {
                            iArr[i17] = iArr[i17] & (~i14);
                        } else if (!z10) {
                            iArr[i17] = iArr[i17] | i14;
                        }
                        i17++;
                    }
                } else {
                    preset4.preloadStories = !z14;
                }
                SharedPreferences.Editor edit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                edit2.putString(str4, preset4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i11 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
                } else if (i11 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                j5Var.setChecked(!z14);
                org.telegram.ui.Components.wk0 wk0Var = dataAutoDownloadActivity.b;
                View F = wk0Var.F(view);
                f2.q1 T = F == null ? null : wk0Var.T(F);
                if (T != null) {
                    dataAutoDownloadActivity.a.v(T, i10);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.E = true;
                dataAutoDownloadActivity.k0();
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
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.f6.n5, 21, 15, false, null);
            if (i10 == dataAutoDownloadActivity.photosRow) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
            } else if (i10 == dataAutoDownloadActivity.videosRow) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
            } else {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
            }
            linearLayout.addView(m4Var, g7.e6.c(-2.0f, -1));
            org.telegram.ui.Cells.d5[] d5VarArr = new org.telegram.ui.Cells.d5[1];
            org.telegram.ui.Cells.t8[] t8VarArr2 = new org.telegram.ui.Cells.t8[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i18 = 4;
            org.telegram.ui.Cells.q8[] q8VarArr = new org.telegram.ui.Cells.q8[4];
            int i19 = 0;
            while (i19 < i18) {
                Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(parentActivity);
                boolean z15 = LocaleController.isRTL;
                TextView textView = new TextView(parentActivity);
                q8Var.a = textView;
                AnimatorSet[] animatorSetArr2 = animatorSetArr;
                org.telegram.ui.Cells.d5[] d5VarArr2 = d5VarArr;
                org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, z11), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                q8Var.addView(textView, g7.e6.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 66.0f : 21.0f, 0.0f, z15 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                q8Var.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                q8Var.addView(checkBoxSquare, g7.e6.d(18, 18.0f, (z15 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                q8VarArr[i19] = q8Var;
                if (i19 == 0) {
                    q8Var.a(LocaleController.getString(R.string.AutodownloadContacts), (currentRoamingPreset.mask[0] & i13) != 0, true);
                } else if (i19 == 1) {
                    q8Var.a(LocaleController.getString(R.string.AutodownloadPrivateChats), (currentRoamingPreset.mask[1] & i13) != 0, true);
                } else if (i19 == 2) {
                    q8Var.a(LocaleController.getString(R.string.AutodownloadGroupChats), (currentRoamingPreset.mask[2] & i13) != 0, true);
                } else {
                    q8Var.a(LocaleController.getString(R.string.AutodownloadChannels), (currentRoamingPreset.mask[3] & i13) != 0, i10 != dataAutoDownloadActivity.photosRow);
                }
                q8VarArr[i19].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                org.telegram.ui.Cells.q8 q8Var2 = q8VarArr[i19];
                int i20 = i10;
                org.telegram.ui.Cells.q8[] q8VarArr2 = q8VarArr;
                gh.x8 x8Var = new gh.x8(dataAutoDownloadActivity, q8Var, q8VarArr2, i20, d5VarArr2, t8VarArr2, animatorSetArr2);
                i10 = i20;
                q8Var2.setOnClickListener(x8Var);
                linearLayout.addView(q8VarArr2[i19], g7.e6.c(50.0f, -1));
                i19++;
                q8VarArr = q8VarArr2;
                currentRoamingPreset = currentRoamingPreset;
                animatorSetArr = animatorSetArr2;
                d5VarArr = d5VarArr2;
                i18 = 4;
                z11 = false;
            }
            AnimatorSet[] animatorSetArr3 = animatorSetArr;
            final org.telegram.ui.Cells.d5[] d5VarArr3 = d5VarArr;
            DownloadController.Preset preset6 = currentRoamingPreset;
            final org.telegram.ui.Cells.q8[] q8VarArr3 = q8VarArr;
            if (i10 != dataAutoDownloadActivity.photosRow) {
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(dataAutoDownloadActivity.getParentActivity());
                vt vtVar = new vt(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i10, b9Var, t8VarArr2, animatorSetArr3);
                org.telegram.ui.Cells.t8[] t8VarArr3 = t8VarArr2;
                d5VarArr3[0] = vtVar;
                vtVar.setSize(preset6.sizes[typeToIndex]);
                linearLayout.addView(d5VarArr3[0], g7.e6.n(-1, 50));
                View t8Var2 = new org.telegram.ui.Cells.t8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                t8VarArr3[0] = t8Var2;
                linearLayout.addView(t8Var2, g7.e6.n(-1, 48));
                t8VarArr3[0].setOnClickListener(new a(t8VarArr3, 16));
                b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
                linearLayout.addView(b9Var, g7.e6.n(-1, -2));
                if (i10 == dataAutoDownloadActivity.videosRow) {
                    d5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                    t8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                    b9Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                    t8VarArr = t8VarArr3;
                } else {
                    d5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                    t8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                    b9Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                    t8VarArr = t8VarArr3;
                }
            } else {
                d5VarArr3[0] = null;
                t8VarArr2[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                view2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d7, false));
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                t8VarArr = t8VarArr2;
            }
            if (i10 == dataAutoDownloadActivity.videosRow) {
                int i21 = 0;
                while (true) {
                    if (i21 >= 4) {
                        r12 = 0;
                        arrayList = null;
                        d5VarArr3[0].a(null, false);
                        t8VarArr[0].e(null, false);
                        break;
                    }
                    if (q8VarArr3[i21].b.h) {
                        arrayList = null;
                        r12 = 0;
                        break;
                    }
                    i21++;
                }
                if (preset6.sizes[typeToIndex] <= 2097152) {
                    t8VarArr[r12].e(arrayList, r12);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            linearLayout.addView(frameLayout, g7.e6.n(-1, 52));
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i22 = org.telegram.ui.ActionBar.f6.n5;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i22, false));
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView2, g7.e6.e(-2, 36, 51));
            textView2.setOnClickListener(new a(a3Var, 17));
            TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i22, false));
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView3, g7.e6.e(-2, 36, 53));
            final String str6 = str;
            final String str7 = str2;
            final int i23 = i10;
            final int i24 = i13;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ut
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.U(DataAutoDownloadActivity.this, q8VarArr3, i24, d5VarArr3, typeToIndex, t8VarArr, i23, str6, str7, a3Var, view);
                }
            });
            dataAutoDownloadActivity.showDialog(f3Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i9 = this.f;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i9 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i9 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 12));
        this.a = new xt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setVerticalScrollBarEnabled(false);
        ((f2.n) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new f2.m0(1, false));
        frameLayout2.addView(this.b, g7.e6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new b1(this, 29));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Components.bv0.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262160, new Class[]{org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.f6.f6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262160, new Class[]{org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.f6.e6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.g6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        int i9 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, org.telegram.ui.ActionBar.f6.y6));
        return arrayList;
    }

    public final void k0() {
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
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(5));
        int i9 = this.e;
        if (i9 == 0 || (i9 == 3 && preset4.equals(preset))) {
            this.d = arrayList.indexOf(preset);
        } else {
            int i10 = this.e;
            if (i10 == 1 || (i10 == 3 && preset4.equals(preset2))) {
                this.d = arrayList.indexOf(preset2);
            } else {
                int i11 = this.e;
                if (i11 == 2 || (i11 == 3 && preset4.equals(preset3))) {
                    this.d = arrayList.indexOf(preset3);
                } else {
                    this.d = arrayList.indexOf(preset4);
                }
            }
        }
        org.telegram.ui.Components.wk0 wk0Var = this.b;
        if (wk0Var != null) {
            f2.q1 K = wk0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Components.bv0) {
                    l0((org.telegram.ui.Components.bv0) view);
                    return;
                }
            }
            this.a.m(this.usageProgressRow);
        }
    }

    public final void l0(org.telegram.ui.Components.bv0 bv0Var) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i9);
            if (preset == this.y) {
                strArr[i9] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.A) {
                strArr[i9] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.B) {
                strArr[i9] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i9] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        bv0Var.b(this.d, null, strArr);
    }

    public final void m0() {
        this.autoDownloadRow = 0;
        int i9 = 1 + 1;
        this.x = i9;
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
        this.r = i9;
        this.usageProgressRow = i9 + 1;
        this.s = i9 + 2;
        this.v = i9 + 3;
        this.photosRow = i9 + 4;
        this.videosRow = i9 + 5;
        this.filesRow = i9 + 6;
        this.storiesRow = i9 + 7;
        this.x = i9 + 9;
        this.w = i9 + 8;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        k0();
        m0();
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
        xt xtVar = this.a;
        if (xtVar != null) {
            xtVar.l();
        }
    }
}
