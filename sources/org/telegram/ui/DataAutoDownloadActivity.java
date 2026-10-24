package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.o2 {
    public final DownloadController.Preset E;
    public final DownloadController.Preset F;
    public final DownloadController.Preset G;
    public final DownloadController.Preset H;
    public boolean I;
    public final String J;
    public final String K;
    public yt a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.mm0 b;
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
        this.E = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.F = preset3;
        if (i10 == 0) {
            this.e = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.G = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.H = preset2;
            this.J = "mobilePreset";
            this.K = "currentMobilePreset";
            return;
        }
        if (i10 == 1) {
            this.e = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.G = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.H = preset3;
            this.J = "wifiPreset";
            this.K = "currentWifiPreset";
            return;
        }
        this.e = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
        this.G = DownloadController.getInstance(this.currentAccount).roamingPreset;
        this.H = preset;
        this.J = "roamingPreset";
        this.K = "currentRoamingPreset";
    }

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            s8Var.setChecked(!s8Var.b.h);
            int i11 = 0;
            while (true) {
                if (i11 >= s8VarArr.length) {
                    z10 = false;
                    break;
                } else if (s8VarArr[i11].b.h) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i10 != dataAutoDownloadActivity.videosRow || c5VarArr[0].isEnabled() == z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            c5VarArr[0].a(arrayList, z10);
            if (c5VarArr[0].getSize() > 2097152) {
                w8VarArr[0].e(arrayList, z10);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new org.telegram.ui.Components.p31(animatorSetArr, 20));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, int i11, org.telegram.ui.Cells.w8[] w8VarArr, int i12, String str, String str2, org.telegram.ui.ActionBar.b3 b3Var, View view) {
        Runnable runnable;
        DownloadController.Preset preset = dataAutoDownloadActivity.G;
        int i13 = dataAutoDownloadActivity.e;
        if (i13 != 3) {
            if (i13 == 0) {
                preset.set(dataAutoDownloadActivity.y);
            } else if (i13 == 1) {
                preset.set(dataAutoDownloadActivity.E);
            } else if (i13 == 2) {
                preset.set(dataAutoDownloadActivity.F);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (s8VarArr[i14].b.h) {
                int[] iArr = preset.mask;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.c5 c5Var = c5VarArr[0];
        if (c5Var != null) {
            c5Var.getSize();
            preset.sizes[i11] = (int) c5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.w8 w8Var = w8VarArr[0];
        if (w8Var != null) {
            Switch r92 = w8Var.e;
            if (i12 == dataAutoDownloadActivity.videosRow) {
                preset.preloadVideo = r92.h;
            } else {
                preset.preloadMusic = r92.h;
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
        runnable = b3Var.a.dismissRunnable;
        runnable.run();
        s4.b1 G = dataAutoDownloadActivity.b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.a.v(G, i12);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.I = true;
        dataAutoDownloadActivity.l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v28 */
    public static void W(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f7) {
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z10;
        int i11;
        final org.telegram.ui.Cells.w8[] w8VarArr;
        ?? r12;
        ArrayList arrayList;
        int i12 = i10;
        DownloadController.Preset preset = dataAutoDownloadActivity.F;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.E;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.y;
        int i13 = dataAutoDownloadActivity.f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.G;
        org.telegram.ui.ActionBar.g6 g6Var = null;
        if (i12 == dataAutoDownloadActivity.autoDownloadRow) {
            int i14 = dataAutoDownloadActivity.e;
            if (i14 != 3) {
                if (i14 == 0) {
                    preset4.set(preset3);
                } else if (i14 == 1) {
                    preset4.set(preset2);
                } else if (i14 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = w8Var.e.h;
            if (z11 || !preset4.enabled) {
                preset4.enabled = !preset4.enabled;
            } else {
                System.arraycopy(dataAutoDownloadActivity.H.mask, 0, preset4.mask, 0, 4);
            }
            view.setTag(Integer.valueOf(preset4.enabled ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6));
            boolean z12 = !z11;
            w8Var.b(org.telegram.ui.ActionBar.k6.x0(null, preset4.enabled ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6, false), z12);
            dataAutoDownloadActivity.n0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.a.s(dataAutoDownloadActivity.n + 1, 9);
            } else {
                dataAutoDownloadActivity.a.t(dataAutoDownloadActivity.n + 1, 9);
            }
            dataAutoDownloadActivity.a.m(dataAutoDownloadActivity.n);
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            edit.putString(dataAutoDownloadActivity.J, preset4.toString());
            String str3 = dataAutoDownloadActivity.K;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i13 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
            } else if (i13 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
            }
            edit.commit();
            w8Var.setChecked(z12);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.I = true;
            return;
        }
        if ((i12 == dataAutoDownloadActivity.photosRow || i12 == dataAutoDownloadActivity.videosRow || i12 == dataAutoDownloadActivity.filesRow || i12 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            int i15 = i12 == dataAutoDownloadActivity.photosRow ? 1 : i12 == dataAutoDownloadActivity.videosRow ? 4 : i12 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            final int typeToIndex = DownloadController.typeToIndex(i15);
            if (i13 == 0) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i13 == 1) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
            boolean z13 = i5Var.e.h;
            if (i12 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                int i16 = i15;
                String str4 = str;
                DownloadController.Preset preset5 = currentRoamingPreset;
                String str5 = str2;
                int i17 = dataAutoDownloadActivity.e;
                if (i17 != 3) {
                    if (i17 == 0) {
                        preset4.set(preset3);
                    } else if (i17 == 1) {
                        preset4.set(preset2);
                    } else if (i17 == 2) {
                        preset4.set(preset);
                    }
                }
                if (i12 != dataAutoDownloadActivity.storiesRow) {
                    int i18 = 0;
                    while (true) {
                        if (i18 >= preset4.mask.length) {
                            z10 = false;
                            break;
                        } else {
                            if ((preset5.mask[i18] & i16) != 0) {
                                z10 = true;
                                break;
                            }
                            i18++;
                        }
                    }
                    int i19 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i19 >= iArr.length) {
                            break;
                        }
                        if (z13) {
                            iArr[i19] = iArr[i19] & (~i16);
                        } else if (!z10) {
                            iArr[i19] = iArr[i19] | i16;
                        }
                        i19++;
                    }
                } else {
                    preset4.preloadStories = !z13;
                }
                SharedPreferences.Editor edit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                edit2.putString(str4, preset4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i13 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
                } else if (i13 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                i5Var.setChecked(!z13);
                org.telegram.ui.Components.mm0 mm0Var = dataAutoDownloadActivity.b;
                View F = mm0Var.F(view);
                s4.b1 T = F == null ? null : mm0Var.T(F);
                if (T != null) {
                    dataAutoDownloadActivity.a.v(T, i12);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.I = true;
                dataAutoDownloadActivity.l0();
                return;
            }
            if (dataAutoDownloadActivity.getParentActivity() == null) {
                return;
            }
            final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(dataAutoDownloadActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.h3 h3Var = b3Var.a;
            h3Var.applyTopPadding = false;
            b3Var.a();
            LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
            linearLayout.setOrientation(1);
            b3Var.b(linearLayout);
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.k6.n5, 21, 15, false, null);
            if (i12 == dataAutoDownloadActivity.photosRow) {
                l4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
            } else if (i12 == dataAutoDownloadActivity.videosRow) {
                l4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
            } else {
                l4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
            }
            linearLayout.addView(l4Var, w7.z5.c(-2.0f, -1));
            org.telegram.ui.Cells.c5[] c5VarArr = new org.telegram.ui.Cells.c5[1];
            org.telegram.ui.Cells.w8[] w8VarArr2 = new org.telegram.ui.Cells.w8[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i20 = 4;
            org.telegram.ui.Cells.s8[] s8VarArr = new org.telegram.ui.Cells.s8[4];
            int i21 = 0;
            while (true) {
                i11 = 16;
                if (i21 >= i20) {
                    break;
                }
                Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(parentActivity);
                boolean z14 = LocaleController.isRTL;
                TextView textView = new TextView(parentActivity);
                s8Var.a = textView;
                AnimatorSet[] animatorSetArr2 = animatorSetArr;
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, g6Var);
                org.telegram.messenger.sl.u(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                s8Var.addView(textView, w7.z5.d(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 66.0f : 21.0f, 0.0f, z14 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                s8Var.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                s8Var.addView(checkBoxSquare, w7.z5.d(18, 18.0f, (z14 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                s8VarArr[i21] = s8Var;
                if (i21 == 0) {
                    s8Var.a(LocaleController.getString(R.string.AutodownloadContacts), (currentRoamingPreset.mask[0] & i15) != 0, true);
                } else if (i21 == 1) {
                    s8Var.a(LocaleController.getString(R.string.AutodownloadPrivateChats), (currentRoamingPreset.mask[1] & i15) != 0, true);
                } else if (i21 == 2) {
                    s8Var.a(LocaleController.getString(R.string.AutodownloadGroupChats), (currentRoamingPreset.mask[2] & i15) != 0, true);
                } else {
                    s8Var.a(LocaleController.getString(R.string.AutodownloadChannels), (currentRoamingPreset.mask[3] & i15) != 0, i12 != dataAutoDownloadActivity.photosRow);
                }
                s8VarArr[i21].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                org.telegram.ui.Cells.s8 s8Var2 = s8VarArr[i21];
                org.telegram.ui.Cells.c5[] c5VarArr2 = c5VarArr;
                int i22 = i12;
                org.telegram.ui.Cells.s8[] s8VarArr2 = s8VarArr;
                ai.qb qbVar = new ai.qb(dataAutoDownloadActivity, s8Var, s8VarArr2, i22, c5VarArr2, w8VarArr2, animatorSetArr2);
                i12 = i22;
                s8Var2.setOnClickListener(qbVar);
                linearLayout.addView(s8VarArr2[i21], w7.z5.c(50.0f, -1));
                i21++;
                c5VarArr = c5VarArr2;
                currentRoamingPreset = currentRoamingPreset;
                s8VarArr = s8VarArr2;
                animatorSetArr = animatorSetArr2;
                i20 = 4;
                g6Var = null;
            }
            AnimatorSet[] animatorSetArr3 = animatorSetArr;
            final org.telegram.ui.Cells.s8[] s8VarArr3 = s8VarArr;
            DownloadController.Preset preset6 = currentRoamingPreset;
            final org.telegram.ui.Cells.c5[] c5VarArr3 = c5VarArr;
            if (i12 != dataAutoDownloadActivity.photosRow) {
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(dataAutoDownloadActivity.getParentActivity());
                wt wtVar = new wt(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i12, e9Var, w8VarArr2, animatorSetArr3);
                org.telegram.ui.Cells.w8[] w8VarArr3 = w8VarArr2;
                c5VarArr3[0] = wtVar;
                wtVar.setSize(preset6.sizes[typeToIndex]);
                linearLayout.addView(c5VarArr3[0], w7.z5.n(-1, 50));
                View w8Var2 = new org.telegram.ui.Cells.w8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                w8VarArr3[0] = w8Var2;
                linearLayout.addView(w8Var2, w7.z5.n(-1, 48));
                w8VarArr3[0].setOnClickListener(new a(w8VarArr3, i11));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, e9Var, null);
                linearLayout.addView(e9Var, w7.z5.n(-1, -2));
                i12 = i10;
                if (i12 == dataAutoDownloadActivity.videosRow) {
                    c5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                    w8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                    e9Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                    w8VarArr = w8VarArr3;
                } else {
                    c5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                    w8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                    e9Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                    w8VarArr = w8VarArr3;
                }
            } else {
                c5VarArr3[0] = null;
                w8VarArr2[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view2, null);
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                w8VarArr = w8VarArr2;
            }
            if (i12 == dataAutoDownloadActivity.videosRow) {
                int i23 = 0;
                while (true) {
                    if (i23 >= 4) {
                        r12 = 0;
                        arrayList = null;
                        c5VarArr3[0].a(null, false);
                        w8VarArr[0].e(null, false);
                        break;
                    }
                    if (s8VarArr3[i23].b.h) {
                        r12 = 0;
                        arrayList = null;
                        break;
                    }
                    i23++;
                }
                if (preset6.sizes[typeToIndex] <= 2097152) {
                    w8VarArr[r12].e(arrayList, r12);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            linearLayout.addView(frameLayout, w7.z5.n(-1, 52));
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i24 = org.telegram.ui.ActionBar.k6.n5;
            org.telegram.ui.ActionBar.r6.W(textView2, i24, null);
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView2, w7.z5.e(-2, 36, 51));
            textView2.setOnClickListener(new a(b3Var, 17));
            TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.W(textView3, i24, null);
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView3, w7.z5.e(-2, 36, 53));
            final String str6 = str;
            final String str7 = str2;
            final int i25 = i12;
            final int i26 = i15;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.V(DataAutoDownloadActivity.this, s8VarArr3, i26, c5VarArr3, typeToIndex, w8VarArr, i25, str6, str7, b3Var, view);
                }
            });
            dataAutoDownloadActivity.showDialog(h3Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
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
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 20));
        this.a = new yt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.b = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setVerticalScrollBarEnabled(false);
        ((s4.k) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new s4.b0(1, false));
        frameLayout2.addView(this.b, w7.z5.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new a1(this, 29));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Components.sw0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    public final void l0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        DownloadController.Preset preset = this.y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.E;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.F;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.G;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l4(27));
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
        org.telegram.ui.Components.mm0 mm0Var = this.b;
        if (mm0Var != null) {
            s4.b1 K = mm0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Components.sw0) {
                    m0((org.telegram.ui.Components.sw0) view);
                    return;
                }
            }
            this.a.m(this.usageProgressRow);
        }
    }

    public final void m0(org.telegram.ui.Components.sw0 sw0Var) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i10);
            if (preset == this.y) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.E) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.F) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        sw0Var.b(this.d, null, strArr);
    }

    public final void n0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.x = i10;
        this.n = 1;
        if (!this.G.enabled) {
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
        if (this.I) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f);
            this.I = false;
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
