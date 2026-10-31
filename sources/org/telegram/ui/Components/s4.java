package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.LongFunction;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ea1;
import org.telegram.ui.kd1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class s4 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, kd1 kd1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String y22 = org.telegram.messenger.i0.y2(null, R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bi.d2(9));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(org.telegram.messenger.d00.e(org.telegram.messenger.i0.L(320.0f), org.telegram.messenger.i0.L(161.36752f), y22)));
        frameLayout.addView(view, w7.b6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.V = frameLayout;
        x1Var.R = org.telegram.messenger.cd.L0(2131747331, null);
        x1Var.T = org.telegram.messenger.cd.L0(2131747334, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751161, null), new ag.w0(8, activity, z10));
        x1Var.l0 = true;
        x1Var.V0 = false;
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), kd1Var);
        x1Var.Q0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.x1 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String L0 = org.telegram.messenger.cd.L0(2131748728, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131748729, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131748731, null), new y0(launchActivity, 1));
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.x1 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747320, null));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = W2;
        int i10 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new k0(activity, 3));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.x1 D(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.bs bsVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.cd.L0(2131745634, null), org.telegram.messenger.cd.L0(2131745633, null), org.telegram.messenger.cd.L0(2131745632, null), org.telegram.messenger.cd.L0(2131745631, null)};
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        e.setPadding(0, 0, 0, org.telegram.messenger.i0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.cd.L0(2131748854, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.cd.a0(null, null, 2131748851, org.telegram.messenger.h20.j(user, true)));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131748852, null));
        }
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        e.addView(textView, w7.b6.t(-2, -2, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i10 = 0;
        while (i10 < 4) {
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
            n6Var.d = 42;
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            n6Var.setTag(Integer.valueOf(i10));
            a(n6Var, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.E5, p6Var);
            n6Var.b(strArr[i10], iArr[0] == i10);
            e.addView(n6Var);
            n6Var.setOnClickListener(new m1(iArr, e));
            i10++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (z10) {
            x1Var.R = org.telegram.messenger.cd.L0(2131748853, null);
        } else {
            int i11 = org.telegram.ui.ActionBar.t6.L5;
            int f7 = p6Var != null ? p6Var.f(i11) : org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            x1Var.b0 = new pp0(activity, 0);
            x1Var.c0 = f7;
            x1Var.d0 = -1;
            if (p6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.t6.L5, null);
            }
        }
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745477, null), new ng.d(27, iArr, bsVar));
        alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.z2 E(final long j10, final long j11, final org.telegram.ui.ActionBar.k2 k2Var, final org.telegram.ui.ActionBar.p6 p6Var) {
        if (k2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(k2Var.getParentActivity(), false, 1, p6Var);
        h.O = org.telegram.messenger.cd.L0(2131747940, null);
        h.P = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(1, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(8, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(2, "Days", new Object[0])), org.telegram.messenger.cd.L0(2131748328, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.a3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11;
                if (i10 == 0) {
                    i11 = 0;
                } else {
                    int i12 = 1;
                    if (i10 != 1) {
                        i12 = 2;
                        if (i10 != 2) {
                            i12 = 3;
                        }
                    }
                    i11 = i12;
                }
                org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).T(j10, i11, j11);
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                if (cc.a(k2Var2)) {
                    cc.z(k2Var2, i11, 0, p6Var).j();
                }
            }
        };
        h.L = charSequenceArr;
        h.K = onClickListener;
        return h;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.p6 p6Var, q4 q4Var) {
        if (context == null) {
            return;
        }
        int i10 = 0;
        int i11 = org.telegram.ui.ActionBar.t6.j5;
        int f7 = p6Var != null ? p6Var.f(i11) : org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.t6.h5;
        int f10 = p6Var != null ? p6Var.f(i12) : org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.t6.xj;
        if (p6Var != null) {
            p6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.t6.Bj;
        if (p6Var != null) {
            p6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.t6.E8;
        if (p6Var != null) {
            p6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.t6.G8;
        if (p6Var != null) {
            p6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.t6.i6;
        if (p6Var != null) {
            p6Var.f(i17);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.t6.Gi;
        int f11 = p6Var != null ? p6Var.f(i18) : org.telegram.ui.ActionBar.t6.x0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.t6.Ci;
        int f12 = p6Var != null ? p6Var.f(i19) : org.telegram.ui.ActionBar.t6.x0(null, i19, false);
        int i20 = org.telegram.ui.ActionBar.t6.Ei;
        int f13 = p6Var != null ? p6Var.f(i20) : org.telegram.ui.ActionBar.t6.x0(null, i20, false);
        l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
        int[] iArr = {30, 60, 120, org.telegram.messenger.zs.K2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        g4 g4Var = new g4(context, p6Var, iArr);
        g4Var.setMinValue(0);
        g4Var.setMaxValue(20);
        g4Var.setTextColor(f7);
        g4Var.setValue(0);
        g4Var.setFormatter(new w0(iArr, i10));
        c4 c4Var = new c4(context, g4Var, 1);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(2131748325, null));
        textView.setTextColor(f7);
        sc.e.t(textView, 1, 20.0f);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ag.j3 j3Var = new ag.j3(context, 16);
        linearLayout.addView(g4Var, w7.b6.l(1.0f, 0, org.telegram.messenger.zs.t4));
        g4Var.setOnValueChangedListener(new org.telegram.ui.Cells.m5(20));
        j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        j3Var.setGravity(17);
        j3Var.setTextColor(f11);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(8.0f);
        j3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, f12, f13, f13));
        j3Var.setText(org.telegram.messenger.cd.L0(2131753866, null));
        c4Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        j3Var.setOnClickListener(new org.telegram.messenger.video.h(iArr, g4Var, q4Var, fVar, 2));
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.b;
        z2Var.N = c4Var;
        z2Var.show();
        z2Var.v0(f10);
        z2Var.P(f10);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.t6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.t6.v0(i10)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.t6.v0(i10)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.t6.v0(i10), hashMap);
        alertDialog$Builder.n(i10, null);
        x1Var.W = true;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752041, null), null);
        x1Var.T = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.x1 H(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        int i12;
        char c10;
        CharSequence[] charSequenceArr;
        final long j12 = j10;
        final int i13 = i10;
        final SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).e7;
        final int[] iArr = new int[1];
        if (j12 != 0) {
            i12 = 0;
            int i14 = sharedPreferences.getInt("priority_" + j12, 3);
            iArr[0] = i14;
            if (i14 == 3) {
                iArr[0] = 0;
            } else if (i14 == 4) {
                iArr[0] = 1;
            } else if (i14 == 5) {
                iArr[0] = 2;
            } else if (i14 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            charSequenceArr = new String[]{org.telegram.messenger.cd.L0(2131747896, null), org.telegram.messenger.cd.L0(2131747898, null), org.telegram.messenger.cd.L0(2131747897, null), org.telegram.messenger.cd.L0(2131747899, null), org.telegram.messenger.cd.L0(2131747895, null)};
            i11 = 1;
        } else {
            i11 = 1;
            i12 = 0;
            if (i13 == 1) {
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i13 == 0) {
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i13 == 2) {
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            } else if (i13 == 3) {
                iArr[0] = sharedPreferences.getInt("priority_stories", 1);
            } else if (i13 == 4 || i13 == 5) {
                iArr[0] = sharedPreferences.getInt("priority_react", 1);
            }
            int i15 = iArr[0];
            if (i15 == 4) {
                iArr[0] = 0;
            } else if (i15 == 5) {
                iArr[0] = 1;
            } else {
                if (i15 == 0) {
                    c10 = 2;
                    iArr[0] = 2;
                } else {
                    c10 = 2;
                    iArr[0] = 3;
                }
                CharSequence[] charSequenceArr2 = new String[4];
                charSequenceArr2[0] = org.telegram.messenger.cd.L0(2131747898, null);
                charSequenceArr2[1] = org.telegram.messenger.cd.L0(2131747897, null);
                charSequenceArr2[c10] = org.telegram.messenger.cd.L0(2131747899, null);
                charSequenceArr2[3] = org.telegram.messenger.cd.L0(2131747895, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.cd.L0(2131747898, null);
            charSequenceArr22[1] = org.telegram.messenger.cd.L0(2131747897, null);
            charSequenceArr22[c10] = org.telegram.messenger.cd.L0(2131747899, null);
            charSequenceArr22[3] = org.telegram.messenger.cd.L0(2131747895, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout e = org.telegram.messenger.m5.e(activity, i11);
        int i16 = i12;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i16, activity, p6Var);
        int i17 = i16;
        while (i17 < charSequenceArr.length) {
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), i16, org.telegram.messenger.i0.L(4.0f), i16);
            n6Var.setTag(Integer.valueOf(i17));
            a(n6Var, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.E5, p6Var);
            n6Var.b(charSequenceArr[i17], iArr[i16] == i17 ? 1 : i16);
            e.addView(n6Var);
            n6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.z2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i18 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).e7.edit();
                    long j13 = j12;
                    if (j13 != 0) {
                        int i19 = iArr2[0];
                        if (i19 == 0) {
                            i18 = 3;
                        } else if (i19 == 1) {
                            i18 = 4;
                        } else if (i19 == 2) {
                            i18 = 5;
                        } else if (i19 != 3) {
                            i18 = 1;
                        }
                        edit.putInt("priority_" + j13, i18);
                        org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).l(j13, j11);
                    } else {
                        int i20 = iArr2[0];
                        int i21 = i20 == 0 ? 4 : i20 == 1 ? 5 : i20 == 2 ? 0 : 1;
                        int i22 = i13;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        if (i22 == 1) {
                            edit.putInt("priority_messages", i21);
                            iArr2[0] = sharedPreferences2.getInt("priority_messages", 1);
                        } else if (i22 == 0) {
                            edit.putInt("priority_group", i21);
                            iArr2[0] = sharedPreferences2.getInt("priority_group", 1);
                        } else if (i22 == 2) {
                            edit.putInt("priority_channel", i21);
                            iArr2[0] = sharedPreferences2.getInt("priority_channel", 1);
                        } else if (i22 == 3) {
                            edit.putInt("priority_stories", i21);
                            iArr2[0] = sharedPreferences2.getInt("priority_stories", 1);
                        } else if (i22 == 4 || i22 == 5) {
                            edit.putInt("priority_react", i21);
                            iArr2[0] = sharedPreferences2.getInt("priority_react", 1);
                        }
                        org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).m(i22);
                    }
                    edit.commit();
                    alertDialog$Builder.a.N0.run();
                    runnable.run();
                }
            });
            i17++;
            j12 = j10;
            i13 = i10;
            i16 = i16;
        }
        String L0 = org.telegram.messenger.cd.L0(2131747922, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static void I(int i10, Activity activity, long j10, TLRPC.Photo photo, th.b bVar) {
        if (activity != null) {
            s2 s2Var = new s2(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) activity, (org.telegram.ui.ActionBar.p6) bVar, true);
            z2Var.O();
            z2Var.O = org.telegram.messenger.cd.L0(2131746229, null);
            z2Var.P = true;
            CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131746238, null), org.telegram.messenger.cd.L0(2131746244, null), org.telegram.messenger.cd.L0(2131746237, null), org.telegram.messenger.cd.L0(2131746246, null), org.telegram.messenger.cd.L0(2131746243, null), org.telegram.messenger.cd.L0(2131746241, null), org.telegram.messenger.cd.L0(2131746240, null), org.telegram.messenger.cd.L0(2131746242, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            t2 t2Var = new t2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, s2Var, 0);
            z2Var.L = charSequenceArr;
            z2Var.M = iArr;
            z2Var.K = t2Var;
            z2Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.view.View] */
    public static l2.f J(final Context context, final long j10, long j11, int i10, boolean z10, final q4 q4Var, Runnable runnable, p4 p4Var, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        n3 n3Var;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        boolean[] zArr;
        ac0 ac0Var;
        char c10;
        org.telegram.ui.ActionBar.t0 t0Var;
        char c11;
        boolean[] zArr2;
        int i12;
        int[] iArr;
        org.telegram.ui.fp fpVar;
        String[] strArr;
        float f7;
        int i13;
        final Calendar calendar;
        int[] iArr2;
        String[] strArr2;
        org.telegram.ui.fp fpVar2;
        ?? r42;
        org.telegram.ui.ActionBar.z2 z2Var;
        int i14;
        ei0 ei0Var;
        TLRPC.User Z1;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        final long e = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).e();
        final l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
        ac0 ac0Var2 = new ac0(context, p6Var);
        int i15 = p4Var.a;
        int i16 = p4Var.c;
        int i17 = p4Var.b;
        ac0Var2.setTextColor(i15);
        ac0Var2.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var2.setItemCount(5);
        final q3 q3Var = new q3(context, p6Var);
        q3Var.setWrapSelectorWheel(true);
        q3Var.setAllItemsCount(24);
        q3Var.setItemCount(5);
        q3Var.setTextColor(i15);
        q3Var.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        final r3 r3Var = new r3(context, p6Var);
        r3Var.setWrapSelectorWheel(true);
        r3Var.setAllItemsCount(60);
        r3Var.setItemCount(5);
        r3Var.setTextColor(i15);
        r3Var.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        n3 n3Var2 = new n3(context, ac0Var2, q3Var, r3Var, 1);
        n3Var2.setClipToPadding(false);
        n3Var2.setClipChildren(false);
        n3Var2.setOrientation(1);
        frameLayout2.addView(n3Var2, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        n3Var2.addView(frameLayout4, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i11 = 0;
        } else if (j10 == e) {
            i11 = 0;
            textView.setText(org.telegram.messenger.cd.L0(2131745531, null));
        } else {
            i11 = 0;
            textView.setText(org.telegram.messenger.cd.L0(2131745876, null));
        }
        textView.setTextColor(i15);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout4.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        boolean[] zArr3 = new boolean[1];
        zArr3[i11] = true;
        if (!org.telegram.messenger.o5.E(j10) || j10 == e || (Z1 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).Z1(Long.valueOf(j10))) == null || Z1.bot || (userStatus = Z1.status) == null || userStatus.expires <= 0) {
            n3Var = n3Var2;
            context2 = context;
            viewGroup = frameLayout4;
            frameLayout = frameLayout3;
            zArr = zArr3;
            ac0Var = ac0Var2;
            c10 = 2;
            t0Var = null;
        } else {
            String j12 = org.telegram.messenger.h20.j(Z1, true);
            if (j12.length() > 10) {
                j12 = j12.substring(i11, 10) + "…";
            }
            frameLayout = frameLayout3;
            zArr = zArr3;
            ac0Var = ac0Var2;
            n3Var = n3Var2;
            c10 = 2;
            t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, p4Var.a, false, p6Var);
            context2 = context;
            t0Var.setLongClickEnabled(false);
            t0Var.setSubMenuOpenSide(2);
            t0Var.setIcon(R.drawable.ic_ab_other);
            t0Var.setBackground(org.telegram.ui.ActionBar.t6.h0(i16, 1, -1));
            viewGroup = frameLayout4;
            viewGroup.addView(t0Var, w7.b6.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            t0Var.f(1, org.telegram.messenger.cd.a0(null, null, 2131745867, j12));
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        }
        int i18 = 12;
        if (t0Var != null) {
            t0Var.setOnClickListener(new org.telegram.ui.ud(i18, t0Var, p4Var));
            c11 = c10;
            zArr2 = zArr;
            t0Var.setDelegate(new androidx.car.app.utils.a(q4Var, zArr2, fVar, 10));
        } else {
            c11 = c10;
            zArr2 = zArr;
        }
        ei0 ei0Var2 = new ei0(context2);
        final bi0 bi0Var = new bi0(R.raw.notify_toggle, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        bi0Var.J(true);
        bi0Var.h = true;
        bi0Var.start();
        bi0Var.M(40);
        bi0Var.P(40);
        ei0Var2.setScaleType(ImageView.ScaleType.CENTER);
        ei0Var2.setAnimation(bi0Var);
        ei0Var2.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        ei0Var2.setBackground(org.telegram.ui.ActionBar.t6.h0(i16, 1, -1));
        viewGroup.addView(ei0Var2, w7.b6.d(40, 40.0f, 53, 0.0f, 8.0f, (t0Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ?? r82 = n3Var;
        r82.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.t0 t0Var2 = t0Var;
        final ag.j3 j3Var = new ag.j3(context2, 11);
        final ac0 ac0Var3 = ac0Var;
        linearLayout.addView(ac0Var3, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
        ac0Var3.setMinValue(0);
        ac0Var3.setMaxValue(365);
        ac0Var3.setWrapSelectorWheel(false);
        ac0Var3.setFormatter(new org.telegram.ui.Cells.m5(21));
        yb0 yb0Var = new yb0() { // from class: org.telegram.ui.Components.j1
            @Override // org.telegram.ui.Components.yb0
            public final void t(ac0 ac0Var4, int i19) {
                s4.g(ag.j3.this, null, 0L, 0L, e == j10 ? 1 : 0, ac0Var3, q3Var, r3Var);
            }
        };
        ac0Var3.setOnValueChangedListener(yb0Var);
        q3Var.setMinValue(0);
        q3Var.setMaxValue(23);
        final boolean[] zArr4 = zArr2;
        linearLayout.addView(q3Var, w7.b6.l(0.2f, 0, org.telegram.messenger.zs.t4));
        q3Var.setFormatter(new org.telegram.ui.Cells.m5(23));
        q3Var.setOnValueChangedListener(yb0Var);
        r3Var.setMinValue(0);
        r3Var.setMaxValue(59);
        r3Var.setValue(0);
        r3Var.setFormatter(new org.telegram.ui.Cells.m5(26));
        linearLayout.addView(r3Var, w7.b6.l(0.3f, 0, org.telegram.messenger.zs.t4));
        r3Var.setOnValueChangedListener(yb0Var);
        if (j11 > 0 && j11 != 2147483646) {
            long j13 = 1000 * j11;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                r3Var.setValue(calendar2.get(12));
                q3Var.setValue(calendar2.get(11));
                ac0Var3.setValue(timeInMillis);
            }
        }
        final boolean[] zArr5 = {true};
        g(j3Var, null, 0L, 0L, e == j10 ? 1 : 0, ac0Var3, q3Var, r3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).isTestBackend();
        if (isTestBackend) {
            iArr = new int[10];
            iArr[0] = 0;
            iArr[1] = 60;
            iArr[c11] = 300;
            iArr[3] = 86400;
            iArr[4] = 604800;
            iArr[5] = 1209600;
            iArr[6] = 2592000;
            iArr[7] = 7862400;
            i12 = 8;
            iArr[8] = 15724800;
            iArr[9] = 31536000;
        } else {
            i12 = 8;
            iArr = new int[8];
            iArr[0] = 0;
            iArr[1] = 86400;
            iArr[c11] = 604800;
            iArr[3] = 1209600;
            iArr[4] = 2592000;
            iArr[5] = 7862400;
            iArr[6] = 15724800;
            iArr[7] = 31536000;
        }
        int i19 = i12;
        if (isTestBackend) {
            strArr = new String[10];
            fpVar = null;
            strArr[0] = org.telegram.messenger.cd.L0(2131748515, null);
            strArr[1] = "Every minute";
            strArr[c11] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.cd.L0(2131748517, null);
            strArr[4] = org.telegram.messenger.cd.L0(2131748514, null);
            strArr[5] = org.telegram.messenger.cd.L0(2131748518, null);
            strArr[6] = org.telegram.messenger.cd.L0(2131748516, null);
            strArr[7] = org.telegram.messenger.cd.L0(2131748520, null);
            strArr[i19] = org.telegram.messenger.cd.L0(2131748519, null);
            strArr[9] = org.telegram.messenger.cd.L0(2131748513, null);
        } else {
            fpVar = null;
            strArr = new String[i19];
            strArr[0] = org.telegram.messenger.cd.L0(2131748515, null);
            strArr[1] = org.telegram.messenger.cd.L0(2131748517, null);
            strArr[c11] = org.telegram.messenger.cd.L0(2131748514, null);
            strArr[3] = org.telegram.messenger.cd.L0(2131748518, null);
            strArr[4] = org.telegram.messenger.cd.L0(2131748516, null);
            strArr[5] = org.telegram.messenger.cd.L0(2131748520, null);
            strArr[6] = org.telegram.messenger.cd.L0(2131748519, null);
            strArr[7] = org.telegram.messenger.cd.L0(2131748513, null);
        }
        if (z10) {
            f7 = 34.0f;
            i13 = 0;
            calendar = calendar2;
            iArr2 = iArr;
            strArr2 = strArr;
            fpVar2 = fpVar;
            r42 = fpVar2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            int w9 = org.telegram.ui.ActionBar.t6.w(i17, org.telegram.ui.ActionBar.t6.r1(0.075f, i15));
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, i15);
            String[] strArr3 = strArr;
            ?? textView2 = new TextView(context2);
            int[] iArr4 = iArr;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i15);
            textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
            int L = org.telegram.messenger.i0.L(14.0f);
            int w10 = org.telegram.ui.ActionBar.t6.w(w9, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w9, w10, w10));
            textView2.setGravity(17);
            i13 = 0;
            strArr2 = strArr3;
            f7 = 34.0f;
            calendar = calendar2;
            fpVar2 = new org.telegram.ui.fp(iArr4, iArr3, strArr2, (Object) textView2, 6);
            iArr2 = iArr4;
            fpVar2.run();
            frameLayout5.addView(textView2, w7.b6.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout5, w7.b6.o(-1, -2));
            fpVar = textView2;
            r42 = frameLayout5;
        }
        j3Var.setPadding(org.telegram.messenger.i0.L(f7), i13, org.telegram.messenger.i0.L(f7), i13);
        j3Var.setGravity(17);
        j3Var.setTextColor(p4Var.g);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        int i20 = p4Var.h;
        float[] fArr = new float[1];
        fArr[i13] = 24.0f;
        j3Var.setBackground(org.telegram.ui.ActionBar.j6.e(i20, fArr));
        r82.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        j3Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr5[0] = false;
                int i21 = e == j10 ? 1 : 0;
                ac0 ac0Var4 = ac0Var3;
                q3 q3Var2 = q3Var;
                r3 r3Var2 = r3Var;
                boolean g10 = s4.g(null, null, 0L, 0L, i21, ac0Var4, q3Var2, r3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar3 = calendar;
                calendar3.setTimeInMillis(currentTimeMillis);
                calendar3.add(6, ac0Var4.getValue());
                calendar3.set(11, q3Var2.getValue());
                calendar3.set(12, r3Var2.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                q4Var.K((int) (calendar3.getTimeInMillis() / 1000), iArr3[0], zArr4[0]);
                ((org.telegram.ui.ActionBar.z2) fVar.b).x0.run();
            }
        });
        org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) fVar.b;
        z2Var2.N = frameLayout2;
        z2Var2.show();
        z2Var2.setOnDismissListener(new y1(runnable, zArr5));
        z2Var2.v0(i17);
        z2Var2.P(i17);
        if (fpVar != null) {
            String[] strArr4 = strArr2;
            z2Var = z2Var2;
            i14 = 1;
            ei0Var = ei0Var2;
            fpVar.setOnClickListener(new b3(frameLayout, p6Var, z2Var, (FrameLayout) r42, iArr2, strArr4, iArr3, fpVar2));
        } else {
            z2Var = z2Var2;
            i14 = 1;
            ei0Var = ei0Var2;
        }
        final vh.p2[] p2VarArr = new vh.p2[i14];
        final org.telegram.ui.ActionBar.z2 z2Var3 = z2Var;
        ei0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String L0;
                boolean[] zArr6 = zArr4;
                boolean z11 = zArr6[0];
                zArr6[0] = !z11;
                bi0 bi0Var2 = bi0Var;
                if (z11) {
                    if (bi0Var2.a0 < 40) {
                        bi0Var2.M(40);
                    }
                    bi0Var2.P(80);
                    bi0Var2.start();
                } else {
                    if (bi0Var2.a0 >= 40) {
                        bi0Var2.M(0);
                    }
                    bi0Var2.P(40);
                    bi0Var2.start();
                }
                vh.p2[] p2VarArr2 = p2VarArr;
                vh.p2 p2Var = p2VarArr2[0];
                if (p2Var != null) {
                    p2Var.e(true);
                    p2VarArr2[0] = null;
                }
                org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0);
                long j14 = j10;
                TLRPC.User Z12 = r13.Z1(Long.valueOf(j14));
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).L0(Long.valueOf(-j14));
                vh.p2 p2Var2 = new vh.p2(context, 3);
                p2VarArr2[0] = p2Var2;
                p2Var2.r();
                p2Var2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                p2Var2.q(20.0f);
                float L2 = org.telegram.messenger.i0.L(12.0f);
                float L3 = org.telegram.messenger.i0.L(4.0f);
                int r14 = org.telegram.ui.ActionBar.t6.r1(0.25f, -16777216);
                p2Var2.i0 = L2;
                p2Var2.j0 = L3;
                p2Var2.k0 = r14;
                p2Var2.F.setShadowLayer(L2, 0.0f, L3, r14);
                if (org.telegram.messenger.w3.V(L02)) {
                    L0 = org.telegram.messenger.cd.L0(zArr6[0] ? 2131745871 : 2131745875, null);
                } else if (L02 != null || Z12 == null) {
                    L0 = org.telegram.messenger.cd.L0(zArr6[0] ? 2131745869 : 2131745873, null);
                } else if (j14 == e) {
                    L0 = org.telegram.messenger.cd.L0(zArr6[0] ? 2131745868 : 2131745872, null);
                } else {
                    L0 = org.telegram.messenger.cd.a0(null, null, zArr6[0] ? 2131745870 : 2131745874, org.telegram.messenger.h20.k(Z12));
                }
                p2Var2.s(L0);
                p2Var2.d = 5000L;
                p2Var2.l(1.0f, -((t0Var2 != null ? 42 : -8) + 20));
                p2Var2.l0 = new tf(p2Var2, 4);
                org.telegram.ui.ActionBar.z2 z2Var4 = z2Var3;
                z2Var4.b.setClipToPadding(false);
                z2Var4.b.setClipChildren(false);
                z2Var4.b.addView(p2Var2, w7.b6.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                p2Var2.u();
            }
        });
        return fVar;
    }

    public static void K(Context context, long j10, q4 q4Var) {
        J(context, j10, -1L, 0, false, q4Var, null, new p4(null), null);
    }

    public static void L(Context context, long j10, q4 q4Var, org.telegram.ui.ActionBar.p6 p6Var) {
        J(context, j10, -1L, 0, false, q4Var, null, new p4(p6Var), p6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        if (str == null) {
            str = org.telegram.messenger.cd.L0(R.string.AppName, null);
        }
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = str;
        x1Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(str3, new v0(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.x1 O(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = str;
        x1Var.T = charSequence;
        alertDialog$Builder.k(str2, new v0(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.k1 P(org.telegram.ui.ActionBar.k2 k2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (k2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        k1Var.e = true;
        k1Var.c = org.telegram.messenger.zs.x3;
        k1Var.setOutsideTouchable(true);
        k1Var.setClippingEnabled(true);
        k1Var.setAnimationStyle(R.style.PopupContextAnimation);
        k1Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
        k1Var.setInputMethodMode(2);
        k1Var.getContentView().setFocusableInTouchMode(true);
        float f11 = 0.0f;
        View view2 = view;
        float f12 = 0.0f;
        while (view2 != view.getRootView()) {
            f11 += view2.getX();
            f12 += view2.getY();
            view2 = (View) view2.getParent();
            if (view2 == null) {
                break;
            }
        }
        k1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        k1Var.b();
        return k1Var;
    }

    public static void Q(Context context, org.telegram.ui.ActionBar.k2 k2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.fs fsVar) {
        Activity W = org.telegram.messenger.i0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = str == null ? org.telegram.messenger.cd.L0(R.string.AppName, null) : str;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = str2;
        r4 r4Var = new r4(context);
        r4Var.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(r4Var, i12, p6Var);
        org.telegram.ui.ActionBar.a7.E(r4Var, org.telegram.ui.ActionBar.t6.Li, p6Var);
        r4Var.setHint(str3);
        r4Var.setFocusable(true);
        r4Var.setInputType(147457);
        r4Var.setImeOptions(6);
        r4Var.setMaxLines(10);
        r4Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(11.0f));
        r4Var.setCursorWidth(1.5f);
        r4Var.z(org.telegram.ui.ActionBar.t6.q6, p6Var);
        if (str4 != null) {
            r4Var.setText(str4);
        }
        r4Var.setOnEditorActionListener(new ag.a0(r4Var, i10, fsVar, x1VarArr, currentFocus, 1));
        r4Var.addTextChangedListener(new org.telegram.ui.Cells.l3(i10, r4Var));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i12);
        r4Var.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(r4Var, d02, L, null, p6Var);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.addView(r4Var, w7.b6.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(f7);
        x1Var.a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.q.x * 85) / 100);
        alertDialog$Builder.k(str5, new ag.b0(r4Var, i10, fsVar, 7));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new v1(3));
        x1VarArr[0] = x1Var;
        if (k2Var != null) {
            org.telegram.messenger.i0.Y2(W, k2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
        x1Var2.j0 = false;
        x1Var2.setOnDismissListener(new z1(r4Var, k2Var, W, i11));
        x1VarArr[0].setOnShowListener(new u0(1, r4Var));
        x1VarArr[0].show();
        r4Var.setSelection(r4Var.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.fs fsVar) {
        Q(context, k2Var, org.telegram.messenger.cd.L0(2131744817, null), org.telegram.messenger.cd.L0(2131744824, null), org.telegram.messenger.cd.L0(2131744798, null), null, 12, org.telegram.messenger.cd.L0(2131751753, null), p6Var, fsVar);
    }

    public static l2.f S(Context context, long j10, final q4 q4Var, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        int i11;
        int i12;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
        int i13 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        if (context == null) {
            return null;
        }
        final l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
        final ac0 ac0Var = new ac0(context, p6Var);
        ac0Var.setTextColor(x02);
        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var.setItemCount(5);
        final k4 k4Var = new k4(context, p6Var);
        k4Var.setWrapSelectorWheel(true);
        k4Var.setAllItemsCount(24);
        k4Var.setItemCount(5);
        k4Var.setTextColor(x02);
        k4Var.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        final l4 l4Var = new l4(context, p6Var);
        l4Var.setWrapSelectorWheel(true);
        l4Var.setAllItemsCount(60);
        l4Var.setItemCount(5);
        l4Var.setTextColor(x02);
        l4Var.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
        n3 n3Var = new n3(context, ac0Var, k4Var, l4Var, 7);
        n3Var.setOrientation(1);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        n3Var.addView(f7, w7.b6.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(i10 == 1 ? 2131744400 : 2131747110, null));
        textView.setTextColor(x02);
        sc.e.t(textView, 1, 20.0f);
        f7.addView(textView, w7.b6.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, p6Var);
        sc.e.u(textView2, 1, 14.0f, null, 2131747109);
        f7.addView(textView2, w7.b6.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i14 = calendar.get(1);
        org.telegram.messenger.o0 o0Var = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).y7.j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long a2 = o0Var.a(timeUnit) * 2;
        final long a10 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).y7.k.a(timeUnit) - 86400;
        final ag.j3 j3Var = new ag.j3(context, 18);
        linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
        ac0Var.setMinValue(0);
        ac0Var.setMaxValue(365);
        ac0Var.setWrapSelectorWheel(false);
        ac0Var.setFormatter(new i2.w(i14, 8));
        final int i15 = i10 == 1 ? 5 : 3;
        yb0 yb0Var = new yb0() { // from class: org.telegram.ui.Components.t1
            @Override // org.telegram.ui.Components.yb0
            public final void t(ac0 ac0Var2, int i16) {
                s4.g(ag.j3.this, null, a2, a10, i15, ac0Var, k4Var, l4Var);
            }
        };
        ac0Var.setOnValueChangedListener(yb0Var);
        k4Var.setMinValue(0);
        k4Var.setMaxValue(23);
        linearLayout.addView(k4Var, w7.b6.l(0.2f, 0, org.telegram.messenger.zs.t4));
        k4Var.setFormatter(new org.telegram.ui.Cells.m5(28));
        k4Var.setOnValueChangedListener(yb0Var);
        l4Var.setMinValue(0);
        l4Var.setMaxValue(59);
        l4Var.setValue(0);
        l4Var.setFormatter(new org.telegram.ui.Cells.m5(29));
        linearLayout.addView(l4Var, w7.b6.l(0.3f, 0, org.telegram.messenger.zs.t4));
        l4Var.setOnValueChangedListener(yb0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            i11 = x03;
            i12 = i13;
        } else {
            long j11 = 1000 * j10;
            i11 = x03;
            i12 = i13;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                l4Var.setValue(calendar.get(12));
                k4Var.setValue(calendar.get(11));
                ac0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(j3Var, null, a2, a10, i15, ac0Var, k4Var, l4Var);
        j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        j3Var.setGravity(17);
        j3Var.setTextColor(x04);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        j3Var.setBackground(org.telegram.ui.ActionBar.j6.e(x05, 8.0f));
        n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i15;
        j3Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j12 = a2;
                long j13 = a10;
                int i17 = i16;
                ac0 ac0Var2 = ac0Var;
                k4 k4Var2 = k4Var;
                l4 l4Var2 = l4Var;
                boolean g10 = s4.g(null, null, j12, j13, i17, ac0Var2, k4Var2, l4Var2);
                long epochMilli = LocalDate.now().plusDays(ac0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, k4Var2.getValue());
                calendar2.set(12, l4Var2.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                q4Var.K((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.z2) fVar.b).x0.run();
            }
        });
        w7.e6.b(j3Var, 0.02f, 1.2f);
        ag.j3 j3Var2 = new ag.j3(context, 19);
        j3Var2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        j3Var2.setGravity(17);
        j3Var2.setText(org.telegram.messenger.cd.L0(i10 == 1 ? 2131748486 : 2131747107, null));
        j3Var2.setTextColor(x05);
        j3Var2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i17 = org.telegram.ui.ActionBar.t6.d6;
        int x06 = org.telegram.ui.ActionBar.t6.x0(null, i17, false);
        int x07 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i17);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        j3Var2.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(j3Var2, k02, N, N2, null);
        n3Var.addView(j3Var2, w7.b6.t(-1, 48, 83, 16, 0, 16, 16));
        j3Var2.setOnClickListener(new ag.i(zArr, q4Var, fVar, 6));
        w7.e6.b(j3Var2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.b;
        z2Var.N = n3Var;
        z2Var.show();
        z2Var.setOnDismissListener(new jg.z(zArr));
        z2Var.v0(i11);
        z2Var.P(i11);
        return fVar;
    }

    public static org.telegram.ui.ActionBar.x1 T(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return null;
        }
        p80 p80Var = new p80(k2Var.getParentActivity(), k2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.cd.L0(2131753985, null).replace("\n", "<br>")));
        int i10 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new f4(uRLSpan.getURL(), k2Var), spanStart, spanEnd, 0);
        }
        p80Var.setText(spannableString);
        p80Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.k5, p6Var);
        org.telegram.ui.ActionBar.a7.D(p80Var, org.telegram.ui.ActionBar.t6.l5, p6Var);
        p80Var.setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
        p80Var.setMovementMethod(new org.telegram.messenger.e0(false));
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.j5, p6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var);
        alertDialog$Builder.o(p80Var);
        String L0 = org.telegram.messenger.cd.L0(2131753986, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753984, null), new x2(i10, k2Var));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.p6 p6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131748602, null);
        ac0 ac0Var = new ac0(context, null);
        ac0Var.setMinValue(0);
        ac0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            ac0Var.setValue(i10);
        } else if (i10 == 30) {
            ac0Var.setValue(16);
        } else if (i10 == 60) {
            ac0Var.setValue(17);
        } else if (i10 == 3600) {
            ac0Var.setValue(18);
        } else if (i10 == 86400) {
            ac0Var.setValue(19);
        } else if (i10 == 604800) {
            ac0Var.setValue(20);
        } else if (i10 == 0) {
            ac0Var.setValue(0);
        }
        ac0Var.setFormatter(new v1(13));
        alertDialog$Builder.o(ac0Var);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751355, null), new f2(1, encryptedChat, ac0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.k2 k2Var, int i10, org.telegram.ui.ActionBar.s6 s6Var, org.telegram.ui.ActionBar.r6 r6Var) {
        int i11;
        String sb2;
        if (k2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        r4 r4Var = new r4(parentActivity);
        String str = null;
        r4Var.setBackground(null);
        org.telegram.ui.ActionBar.a7.G(r4Var, org.telegram.ui.ActionBar.t6.u5, org.telegram.ui.ActionBar.t6.v5, org.telegram.ui.ActionBar.t6.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131748275, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751753, null), new v1(14));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751115, null)));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131751116, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(6.0f));
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        r4Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(r4Var, i12, null);
        r4Var.setMaxLines(1);
        r4Var.setLines(1);
        r4Var.setInputType(16385);
        r4Var.setGravity(51);
        r4Var.setSingleLine(true);
        r4Var.setImeOptions(6);
        r4Var.z(org.telegram.ui.ActionBar.t6.G6, null);
        r4Var.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        r4Var.setCursorWidth(1.5f);
        r4Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
        linearLayout.addView(r4Var, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
        r4Var.setOnEditorActionListener(new ig.r(2));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        c3.i0.w(9306112, hashMap, "Berry", 14598550, "Brandy");
        c3.i0.w(8391495, hashMap, "Cherry", 16744272, "Coral");
        c3.i0.w(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        c3.i0.w(14725375, hashMap, "Mauve", 16761035, "Pink");
        c3.i0.w(16711680, hashMap, "Red", 16711807, "Rose");
        c3.i0.w(8406555, hashMap, "Russet", 16720896, "Scarlet");
        c3.i0.w(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        c3.i0.w(16760576, hashMap, "Amber", 15438707, "Apricot");
        c3.i0.w(16508850, hashMap, "Banana", 10601738, "Citrus");
        c3.i0.w(11560192, hashMap, "Ginger", 16766720, "Gold");
        c3.i0.w(16640272, hashMap, "Lemon", 16753920, "Orange");
        c3.i0.w(16770484, hashMap, "Peach", 16739155, "Persimmon");
        c3.i0.w(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        c3.i0.w(16763004, hashMap, "Topaz", 16776960, "Yellow");
        c3.i0.w(3688720, hashMap, "Clover", 8628829, "Cucumber");
        c3.i0.w(5294200, hashMap, "Emerald", 11907932, "Olive");
        c3.i0.w(65280, hashMap, "Green", 43115, "Jade");
        c3.i0.w(2730887, hashMap, "Jungle", 12582656, "Lime");
        c3.i0.w(776785, hashMap, "Malachite", 10026904, "Mint");
        c3.i0.w(11394989, hashMap, "Moss", 3234721, "Azure");
        c3.i0.w(org.telegram.messenger.zs.e4, hashMap, "Blue", 18347, "Cobalt");
        c3.i0.w(5204422, hashMap, "Indigo", 96647, "Lagoon");
        c3.i0.w(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        c3.i0.w(128, hashMap, "Navy", 3101086, "Sapphire");
        c3.i0.w(7788522, hashMap, "Sky", 32896, "Teal");
        c3.i0.w(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        c3.i0.w(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        c3.i0.w(13148872, hashMap, "Lilac", 11894492, "Lavender");
        c3.i0.w(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        c3.i0.w(6684825, hashMap, "Purple", 14204888, "Thistle");
        c3.i0.w(14315734, hashMap, "Orchid", 2361920, "Violet");
        c3.i0.w(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        c3.i0.w(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        c3.i0.w(7365973, hashMap, "Coffee", 7956873, "Rum");
        c3.i0.w(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        c3.i0.w(12759680, hashMap, "Sand", 8924439, "Sienna");
        c3.i0.w(7864585, hashMap, "Maple", 15787660, "Khaki");
        c3.i0.w(12088115, hashMap, "Copper", 12144200, "Chestnut");
        c3.i0.w(15653316, hashMap, "Almond", 16776656, "Cream");
        c3.i0.w(12186367, hashMap, "Diamond", 11109127, "Honey");
        c3.i0.w(16777200, hashMap, "Ivory", 15392968, "Pearl");
        c3.i0.w(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        c3.i0.w(16777215, hashMap, "White", 8421504, "Gray");
        c3.i0.w(0, hashMap, "Black", 15266260, "Chrome");
        c3.i0.w(3556687, hashMap, "Charcoal", 789277, "Ebony");
        c3.i0.w(12632256, hashMap, "Silver", 16119285, "Smoke");
        c3.i0.w(2499381, hashMap, "Steel", 5220413, "Apple");
        c3.i0.w(8434628, hashMap, "Glacier", 16693933, "Melon");
        c3.i0.w(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.r6 k10 = r6Var == null ? org.telegram.ui.ActionBar.t6.D0().k(false) : r6Var;
        if (k10 == null || (i11 = k10.c) == 0) {
            i11 = org.telegram.messenger.i0.q(org.telegram.ui.ActionBar.t6.s0())[0];
        }
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i14 = (red + red2) / 2;
            int i15 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i16 = (green2 * 4 * green2) + ((((i14 + 512) * i15) * i15) >> 8) + ((((767 - i14) * blue2) * blue2) >> 8);
            if (i16 < i13) {
                str = (String) entry.getValue();
                i13 = i16;
            }
        }
        SecureRandom secureRandom = Utilities.b;
        if (secureRandom.nextInt() % 2 == 0) {
            sb2 = a1.g.o((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder i17 = sc.e.i(str, " ");
            i17.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = i17.toString();
        }
        r4Var.setText(sb2);
        r4Var.setSelection(r4Var.length());
        u0 u0Var = new u0(2, r4Var);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.setOnShowListener(u0Var);
        k2Var.showDialog(x1Var);
        r4Var.requestFocus();
        x1Var.d(-1).setOnClickListener(new bi.c(k2Var, r4Var, r6Var, s6Var, x1Var, 5));
    }

    public static void W(Activity activity, String str, int i10, int i11, int i12, org.telegram.messenger.q20 q20Var) {
        if (activity == null) {
            return;
        }
        final int i13 = 0;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        final int i14 = 1;
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(activity, false, 1, null);
        h.v0 = false;
        m3 m3Var = new m3(activity, null);
        n3 n3Var = new n3(activity, m3Var);
        n3Var.setOrientation(0);
        n3Var.setWeightSum(1.0f);
        m3Var.setAllItemsCount(24);
        m3Var.setItemCount(5);
        m3Var.setTextColor(x02);
        m3Var.setGravity(5);
        m3Var.setTextOffset(-org.telegram.messenger.i0.L(12.0f));
        o3 o3Var = new o3(activity, null);
        o3Var.setWrapSelectorWheel(true);
        o3Var.setAllItemsCount(60);
        o3Var.setItemCount(5);
        o3Var.setTextColor(x02);
        o3Var.setGravity(3);
        o3Var.setTextOffset(org.telegram.messenger.i0.L(12.0f));
        final h2 h2Var = new h2(i11, i12, m3Var, o3Var, i10, n3Var);
        n3Var.addView(m3Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
        m3Var.setFormatter(new v1(11));
        m3Var.setOnValueChangedListener(new yb0() { // from class: org.telegram.ui.Components.i2
            @Override // org.telegram.ui.Components.yb0
            public final void t(ac0 ac0Var, int i15) {
                switch (i13) {
                    case 0:
                        h2Var.a(Boolean.TRUE);
                        break;
                    default:
                        h2Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        n3Var.addView(o3Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
        o3Var.setFormatter(new v1(12));
        o3Var.setOnValueChangedListener(new yb0() { // from class: org.telegram.ui.Components.i2
            @Override // org.telegram.ui.Components.yb0
            public final void t(ac0 ac0Var, int i15) {
                switch (i14) {
                    case 0:
                        h2Var.a(Boolean.TRUE);
                        break;
                    default:
                        h2Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        h2Var.a(Boolean.FALSE);
        p3 p3Var = new p3(activity, m3Var, o3Var);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        p3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        p3Var.addView(n3Var, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        vh.d dVar = new vh.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.cd.L0(2131745689, null), false, true);
        dVar.setOnClickListener(new j2(r1, i13));
        p3Var.addView(dVar, w7.b6.t(-1, 48, 0, 16, 12, 16, 12));
        h.N = p3Var;
        h.show();
        h.setOnDismissListener(new z1(q20Var, m3Var, o3Var, i14));
        h.v0(x03);
        h.P(x03);
        org.telegram.ui.ActionBar.z2[] z2VarArr = {h};
    }

    public static org.telegram.ui.ActionBar.x1 X(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).e7;
        boolean z10 = true;
        final int[] iArr = new int[1];
        if (j10 != 0) {
            int i10 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i10;
            if (i10 == 3) {
                iArr[0] = 2;
            } else if (i10 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{org.telegram.messenger.cd.L0(2131743639, null), org.telegram.messenger.cd.L0(2131745384, null), org.telegram.messenger.cd.L0(2131748734, null), org.telegram.messenger.cd.L0(2131743638, null)};
        } else {
            int i11 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i11;
            if (i11 == 0) {
                iArr[0] = 1;
            } else if (i11 == 1) {
                iArr[0] = 2;
            } else if (i11 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{org.telegram.messenger.cd.L0(2131743638, null), org.telegram.messenger.cd.L0(2131743639, null), org.telegram.messenger.cd.L0(2131745384, null), org.telegram.messenger.cd.L0(2131748734, null), org.telegram.messenger.cd.L0(2131747837, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            n6Var.setTag(Integer.valueOf(i12));
            a(n6Var, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.E5, p6Var);
            n6Var.b(strArr2[i12], iArr[0] == i12 ? z10 : false);
            e.addView(n6Var);
            n6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.v2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).e7.edit();
                    long j12 = j10;
                    String str3 = str2;
                    if (j12 != 0) {
                        int i13 = iArr2[0];
                        if (i13 == 0) {
                            edit.putInt(str3, 0);
                        } else if (i13 == 1) {
                            edit.putInt(str3, 1);
                        } else if (i13 == 2) {
                            edit.putInt(str3, 3);
                        } else if (i13 == 3) {
                            edit.putInt(str3, 2);
                        }
                        org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).l(j12, j11);
                    } else {
                        int i14 = iArr2[0];
                        if (i14 == 0) {
                            edit.putInt(str3, 2);
                        } else if (i14 == 1) {
                            edit.putInt(str3, 0);
                        } else if (i14 == 2) {
                            edit.putInt(str3, 1);
                        } else if (i14 == 3) {
                            edit.putInt(str3, 3);
                        } else if (i14 == 4) {
                            edit.putInt(str3, 4);
                        }
                        if (str3.equals("vibrate_channel")) {
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).m(2);
                        } else if (str3.equals("vibrate_group")) {
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).m(0);
                        } else if (str3.equals("vibrate_react")) {
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).m(4);
                        } else {
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.a.N0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
            z10 = true;
        }
        String L0 = org.telegram.messenger.cd.L0(2131743640, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.x1 Y(Context context, org.telegram.ui.ActionBar.p6 p6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z10;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(str);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = W2;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(z10 ? 2131747316 : 2131752909, null), new bi.o4(z10, context, atomicBoolean, aVar, 3));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752904, null), new ng.d(28, atomicBoolean, aVar));
        x1Var.setOnDismissListener(new mg.g(4, atomicBoolean, aVar));
        return x1Var;
    }

    public static void Z(int i10, int i11, long j10, org.telegram.messenger.q20 q20Var) {
        a0(i10, j10, i11, q20Var, 0L);
    }

    public static void a(org.telegram.ui.Cells.n6 n6Var, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        for (int i12 = 0; i12 < n6Var.getChildCount(); i12++) {
            View childAt = n6Var.getChildAt(i12);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.a7.P((RadioButton) childAt, i10, i11, p6Var);
                return;
            }
        }
        n6Var.a(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a0(final int i10, final long j10, int i11, org.telegram.messenger.q20 q20Var, long j11) {
        org.telegram.ui.ActionBar.p6 bVar;
        org.telegram.ui.ActionBar.p6 p6Var;
        TLRPC.Chat chat;
        char c10;
        Activity activity;
        long M1 = org.telegram.messenger.vp.r1(i10).M1(j10);
        if (M1 <= 0 && j10 > 0) {
            M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(i10).H2(j10));
        }
        long j12 = i11 * M1;
        rh.e6.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 <= 0 || j11 == j12) {
            q20Var.a(Long.valueOf(j12));
            return false;
        }
        final long j13 = M1;
        final e1 e1Var = new e1(i10, j12, j10, q20Var, j13, 1);
        if (j13 <= org.telegram.messenger.vp.r1(i10).f7.getLong(org.telegram.ui.Cells.f1.n(j10, "ask_paid_message_", "_price"), 0L)) {
            e1Var.run();
            return true;
        }
        Activity u02 = org.telegram.messenger.i0.u0();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (PhotoViewer.v1().U1() || (T != null && T.hasShownSheet())) {
            bVar = new th.b();
        } else {
            if (T == null) {
                p6Var = null;
                String s10 = org.telegram.messenger.o5.s(i10, j10);
                if (!org.telegram.messenger.w3.o0(i10, j10)) {
                    s10 = gg.e.h(i10, j10);
                } else if (T instanceof org.telegram.ui.un) {
                    org.telegram.ui.un unVar = (org.telegram.ui.un) T;
                    if (unVar.u4 && unVar.a() == j10 && (chat = unVar.t4) != null) {
                        c10 = 0;
                        activity = u02;
                        s10 = org.telegram.messenger.o5.s(i10, -chat.id);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i12 = (int) j13;
                        Object[] objArr = new Object[1];
                        objArr[c10] = s10;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K("MessageLockedStarsConfirmMessage1", i12, ',', objArr)));
                        spannableStringBuilder.append((CharSequence) " ");
                        if (i11 == 1) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessage2One", i12)));
                        } else {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessage2Many1", (int) j12)));
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessage2Many2", i11)));
                        }
                        h0(activity, org.telegram.messenger.cd.L0(2131748569, null), spannableStringBuilder, org.telegram.messenger.cd.L0(2131748582, null), org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessagePay", i11), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.l1
                            @Override // org.telegram.messenger.q20
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i13 = i10;
                                    SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(i13).f7.edit();
                                    long j14 = j10;
                                    edit.putLong(org.telegram.ui.Cells.f1.n(j14, "ask_paid_message_", "_price"), j13).apply();
                                    rh.e6.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                                }
                                org.telegram.messenger.i0.g3(e1Var);
                            }
                        }, p6Var, true);
                        return true;
                    }
                }
                c10 = 0;
                activity = u02;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i122 = (int) j13;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = s10;
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K("MessageLockedStarsConfirmMessage1", i122, ',', objArr2)));
                spannableStringBuilder2.append((CharSequence) " ");
                if (i11 == 1) {
                }
                h0(activity, org.telegram.messenger.cd.L0(2131748569, null), spannableStringBuilder2, org.telegram.messenger.cd.L0(2131748582, null), org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessagePay", i11), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.l1
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i13 = i10;
                            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(i13).f7.edit();
                            long j14 = j10;
                            edit.putLong(org.telegram.ui.Cells.f1.n(j14, "ask_paid_message_", "_price"), j13).apply();
                            rh.e6.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                        }
                        org.telegram.messenger.i0.g3(e1Var);
                    }
                }, p6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        p6Var = bVar;
        String s102 = org.telegram.messenger.o5.s(i10, j10);
        if (!org.telegram.messenger.w3.o0(i10, j10)) {
        }
        c10 = 0;
        activity = u02;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
        int i1222 = (int) j13;
        Object[] objArr22 = new Object[1];
        objArr22[c10] = s102;
        spannableStringBuilder22.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K("MessageLockedStarsConfirmMessage1", i1222, ',', objArr22)));
        spannableStringBuilder22.append((CharSequence) " ");
        if (i11 == 1) {
        }
        h0(activity, org.telegram.messenger.cd.L0(2131748569, null), spannableStringBuilder22, org.telegram.messenger.cd.L0(2131748582, null), org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessagePay", i11), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.l1
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i13 = i10;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(i13).f7.edit();
                    long j14 = j10;
                    edit.putLong(org.telegram.ui.Cells.f1.n(j14, "ask_paid_message_", "_price"), j13).apply();
                    rh.e6.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                }
                org.telegram.messenger.i0.g3(e1Var);
            }
        }, p6Var, true);
        return true;
    }

    public static void b(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i14 = calendar.get(1);
        int i15 = calendar.get(2);
        int i16 = calendar.get(5);
        ac0Var3.setMaxValue(i14);
        ac0Var3.setMinValue(i11);
        int value = ac0Var3.getValue();
        ac0Var2.setMaxValue(value == i14 ? i15 : 11);
        ac0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = ac0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i14 && value2 == i15) {
            actualMaximum = Math.min(i16, actualMaximum);
        }
        ac0Var.setMaxValue(actualMaximum);
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        ac0Var.setMinValue(i10);
    }

    public static boolean b0(int i10, ArrayList arrayList, int i11, org.telegram.messenger.q20 q20Var) {
        org.telegram.ui.ActionBar.p6 bVar;
        org.telegram.ui.ActionBar.p6 p6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            q20Var.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        boolean z11 = true;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l4 = (Long) obj;
            long j11 = j10;
            long longValue = l4.longValue();
            long M1 = org.telegram.messenger.vp.r1(i10).M1(longValue);
            if (M1 <= 0 && longValue > 0) {
                M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(i10).H2(longValue));
            }
            hashMap.put(l4, Long.valueOf(M1));
            long j12 = j11 + M1;
            boolean z12 = z10;
            rh.e6.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            if (M1 > 0) {
                i12++;
            }
            if (M1 > 0 && z11 && org.telegram.messenger.vp.r1(i10).f7.getLong(org.telegram.ui.Cells.f1.n(longValue, "ask_paid_message_", "_price"), 0L) < M1) {
                z11 = z12;
            }
            j10 = j12;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i11) * j10;
        if (z11 || max <= 0) {
            q20Var.a(hashMap);
            return z13;
        }
        Activity u02 = org.telegram.messenger.i0.u0();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (PhotoViewer.v1().U1() || (T != null && T.hasShownSheet())) {
            bVar = new th.b();
        } else {
            if (T == null) {
                p6Var = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessageMulti1", i12)));
                spannableStringBuilder.append((CharSequence) " ");
                Object[] objArr = new Object[1];
                objArr[z13 ? 1 : 0] = org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                h0(u02, org.telegram.messenger.cd.L0(2131748569, null), spannableStringBuilder, org.telegram.messenger.cd.L0(2131748582, null), org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.sq(i10, max, u02, arrayList, hashMap, q20Var, p6Var), p6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        p6Var = bVar;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessageMulti1", i12)));
        spannableStringBuilder2.append((CharSequence) " ");
        Object[] objArr2 = new Object[1];
        objArr2[z13 ? 1 : 0] = org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
        h0(u02, org.telegram.messenger.cd.L0(2131748569, null), spannableStringBuilder2, org.telegram.messenger.cd.L0(2131748582, null), org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.sq(i10, max, u02, arrayList, hashMap, q20Var, p6Var), p6Var, true);
        return true;
    }

    public static long c(vh.d dVar, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, ac0 ac0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((ac0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (ac0Var2.getValue() - 120) % 12);
        ac0Var.setMinValue(1);
        ac0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = ac0Var.getValue();
        int value3 = ac0Var3.getValue();
        int value4 = ac0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i10 = 0;
            } else if (i11 != value) {
                i10 = 2;
            }
            dVar.setText(org.telegram.messenger.cd.D0().w0(i10 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static boolean c0(int i10, long j10) {
        long M1 = org.telegram.messenger.vp.r1(i10).M1(j10);
        if (M1 <= 0 && j10 > 0) {
            M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(i10).H2(j10));
        }
        return M1 > 0 && M1 > org.telegram.messenger.vp.r1(i10).f7.getLong(org.telegram.ui.Cells.f1.n(j10, "ask_paid_message_", "_price"), 0L);
    }

    public static void d(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        ac0Var3.setMinValue(i11);
        int value = ac0Var3.getValue();
        ac0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = ac0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        ac0Var.setMinValue(i10);
    }

    public static void d0(r4 r4Var, org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.i0.v1(r4Var);
        String obj = r4Var.getText().toString();
        int i10 = org.telegram.ui.ActionBar.t6.a;
        org.telegram.ui.ActionBar.s6 s6Var = new org.telegram.ui.ActionBar.s6();
        s6Var.b = new File(org.telegram.messenger.w0.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
        s6Var.a = obj;
        org.telegram.ui.ActionBar.t6.h0 = org.telegram.ui.ActionBar.t6.b1(org.telegram.ui.ActionBar.t6.I.i0);
        s6Var.E = org.telegram.messenger.d20.s0;
        org.telegram.ui.ActionBar.t6.x1(s6Var, true, true, false);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.o4, new Object[0]);
        new ThemeEditorView().d(k2Var.getParentActivity(), s6Var);
        x1Var.dismiss();
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
        if (d12.getBoolean("themehint", false)) {
            return;
        }
        d12.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(k2Var.getParentActivity(), org.telegram.messenger.cd.L0(2131751711, null), 1).show();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static void e(TextView textView, ac0 ac0Var, w3 w3Var, x3 x3Var) {
        int value = ac0Var.getValue();
        int value2 = w3Var.getValue();
        int value3 = x3Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i10 = timeInMillis / 86400;
        int i11 = (timeInMillis % 86400) / 3600;
        int i12 = (timeInMillis % 3600) / 60;
        textView.setText(org.telegram.messenger.cd.a0(null, null, 2131747189, org.telegram.messenger.cd.a0(null, null, 2131747188, i10 > 0 ? org.telegram.messenger.cd.G(i10, "Days", new Object[0]) : "", i11 > 0 ? org.telegram.messenger.cd.G(i11, "Hours", new Object[0]) : "", i12 > 0 ? org.telegram.messenger.cd.G(i12, "Minutes", new Object[0]) : "").trim()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.x1 e0(final int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLObject tLObject, Object... objArr) {
        String str;
        char c10;
        String str2;
        final long j10;
        long n10;
        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o10 = rh.e6.o(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    n10 = org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    n10 = org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    n10 = org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    n10 = org.telegram.messenger.o5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    n10 = org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                } else {
                    j10 = 0;
                    if (o10 > 0) {
                        rh.e6.y(i10, false).q(new Runnable() { // from class: org.telegram.ui.Components.b2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity u02 = org.telegram.messenger.i0.u0();
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.p6 bVar = (PhotoViewer.v1().U1() || (T != null && T.hasShownSheet())) ? new th.b() : T != null ? T.getResourceProvider() : null;
                                int i11 = i10;
                                long j11 = j10;
                                new rh.x7(u02, bVar, o10, 13, org.telegram.messenger.o5.s(i11, j11), new org.telegram.messenger.rz(7), j11).show();
                            }
                        }, true, true);
                        return null;
                    }
                }
                j10 = n10;
                if (o10 > 0) {
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    t0(k2Var2, org.telegram.messenger.cd.L0(2131749375, null), org.telegram.messenger.cd.L0(2131749376, null), null);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z10 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long n11 = org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (n11 >= 0) {
                        str2 = org.telegram.messenger.h20.j(org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(n11)), true);
                    } else {
                        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-n11));
                        str2 = L0 != null ? L0.title : "";
                    }
                    if (k2Var2 == null) {
                        k2Var2 = LaunchActivity.Q();
                    }
                    t0(k2Var2, org.telegram.messenger.cd.L0(2131748554, null), org.telegram.messenger.cd.a0(null, null, 2131748555, str2), null);
                    org.telegram.messenger.vp.r1(i10).m2(0, n11);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.k2 Q = k2Var2 == null ? LaunchActivity.Q() : k2Var2;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749261, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749253, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749267, null), null);
                            return null;
                        }
                        t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749268, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749264, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749266, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749263, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749265, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        t0(Q, org.telegram.messenger.cd.L0(2131749262, null), org.telegram.messenger.cd.L0(2131749260, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        l0(tL_error.text, Q);
                        return null;
                    }
                    String L02 = org.telegram.messenger.cd.L0(2131749262, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error.text);
                    t0(Q, L02, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.k2 Q2 = k2Var2 == null ? LaunchActivity.Q() : k2Var2;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            t0(Q2, null, org.telegram.messenger.cd.L0(2131749189, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            t0(Q2, null, org.telegram.messenger.cd.L0(2131750688, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            w0(Q2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                            return null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.messenger.z20.q(null, 2131751106, sb3, "\n");
                        sb3.append(tL_error.text);
                        t0(Q2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i11 = org.telegram.messenger.zs.M0;
                    if (z12 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (k2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (k2Var2.getParentActivity() != null) {
                                k2Var2.showDialog(new kg.q0(5, i10, k2Var2.getParentActivity(), k2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                k2Var2.presentFragment(new ea1(0));
                                return null;
                            }
                            k2Var2.presentFragment(new ea1(1));
                            return null;
                        }
                        if (k2Var2 != null) {
                            g0(tL_error, k2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            org.telegram.messenger.zs.f(i10).k(i11, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.k2 Q3 = k2Var2 == null ? LaunchActivity.Q() : k2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new kg.q0(5, i10, Q3.getParentActivity(), Q3, null));
                                    return null;
                                }
                                Q3.presentFragment(new ea1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.k2 k2Var3 = Q3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                l0(tL_error.text, k2Var3);
                                return null;
                            }
                            g0(tL_error, k2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.k2 Q4 = k2Var2 == null ? LaunchActivity.Q() : k2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q4.getParentActivity() != null) {
                                    Q4.showDialog(new kg.q0(5, i10, Q4.getParentActivity(), Q4, null));
                                    return null;
                                }
                                Q4.presentFragment(new ea1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.k2 k2Var4 = Q4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                l0(tL_error.text, k2Var4);
                                return null;
                            }
                            g0(tL_error, k2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (k2Var2 != null) {
                                    t0(k2Var2, null, org.telegram.messenger.cd.L0(2131751272, null), null);
                                    return null;
                                }
                                v0(org.telegram.messenger.cd.L0(2131751272, null), null);
                                return null;
                            }
                        } else {
                            if (z10 || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long n12 = z10 ? org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? org.telegram.messenger.o5.n(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? org.telegram.messenger.o5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? org.telegram.messenger.o5.n(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str3 = tL_error.text;
                                if (str3 == null || !str3.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str4 = tL_error.text;
                                    str4.getClass();
                                    switch (str4) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            org.telegram.messenger.zs.f(i10).k(i11, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            org.telegram.messenger.zs.f(i10).k(i11, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            v0(org.telegram.messenger.cd.L0(2131748544, null), k2Var2);
                                            break;
                                    }
                                    return null;
                                }
                                String str5 = tL_error.text;
                                TLRPC.Chat L03 = n12 < 0 ? org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-n12)) : null;
                                String str6 = tL_error.text;
                                str6.getClass();
                                switch (str6.hashCode()) {
                                    case -1813346101:
                                        if (str6.equals("CHAT_SEND_VOICES_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case -1755013292:
                                        if (str6.equals("CHAT_SEND_PLAIN_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case -1463451737:
                                        if (str6.equals("CHAT_SEND_AUDIOS_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case -446466679:
                                        if (str6.equals("CHAT_SEND_POLL_FORBIDDEN")) {
                                            c10 = 3;
                                            break;
                                        }
                                        break;
                                    case 469767429:
                                        if (str6.equals("CHAT_SEND_DOCS_FORBIDDEN")) {
                                            c10 = 4;
                                            break;
                                        }
                                        break;
                                    case 788688112:
                                        if (str6.equals("CHAT_SEND_ROUNDVIDEOS_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case 963091938:
                                        if (str6.equals("CHAT_SEND_VIDEOS_FORBIDDEN")) {
                                            c10 = 6;
                                            break;
                                        }
                                        break;
                                    case 1100757753:
                                        if (str6.equals("CHAT_SEND_GIFS_FORBIDDEN")) {
                                            c10 = 7;
                                            break;
                                        }
                                        break;
                                    case 1146489803:
                                        if (str6.equals("CHAT_SEND_PHOTOS_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case 1701620704:
                                        if (str6.equals("CHAT_SEND_STICKERS_FORBIDDEN")) {
                                            c10 = '\t';
                                            break;
                                        }
                                        break;
                                }
                                /*  JADX ERROR: Method code generation error
                                    java.lang.NullPointerException: Switch insn not found in header
                                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    */
                                /*
                                    Method dump skipped, instructions count: 2640
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s4.e0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.k2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.x1");
                            }

                            public static void f(int i10, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
                                TLRPC.User user;
                                if (tL_messages_invitedUsers == null || tL_messages_invitedUsers.missing_invitees.isEmpty() || chat == null) {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
                                int size = arrayList4.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i11);
                                    i11++;
                                    TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
                                    if (tL_messages_invitedUsers.updates != null) {
                                        for (int i12 = 0; i12 < tL_messages_invitedUsers.updates.users.size(); i12++) {
                                            user = tL_messages_invitedUsers.updates.users.get(i12);
                                            if (user.id == tL_missingInvitee2.user_id) {
                                                break;
                                            }
                                        }
                                    }
                                    user = null;
                                    if (user == null) {
                                        user = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(tL_missingInvitee2.user_id));
                                    }
                                    if (user != null) {
                                        arrayList.add(user);
                                        if (tL_missingInvitee2.premium_required_for_pm) {
                                            arrayList2.add(Long.valueOf(user.id));
                                        }
                                        if (tL_missingInvitee2.premium_would_allow_invite) {
                                            arrayList3.add(Long.valueOf(user.id));
                                        }
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                org.telegram.messenger.i0.h3(new i2.g1(i10, chat, arrayList, arrayList2, arrayList3), 200L);
                            }

                            public static void f0(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.q20 q20Var, lm lmVar) {
                                Activity W = org.telegram.messenger.i0.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                                String L0 = org.telegram.messenger.cd.L0(2131747168, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                x1Var.T = org.telegram.messenger.cd.L0(2131747169, null);
                                final y3 y3Var = new y3(context);
                                y3Var.setTextSize(1, 16.0f);
                                int i10 = org.telegram.ui.ActionBar.t6.j5;
                                org.telegram.ui.ActionBar.a7.V(y3Var, i10, p6Var);
                                org.telegram.ui.ActionBar.a7.E(y3Var, org.telegram.ui.ActionBar.t6.Li, p6Var);
                                y3Var.setHint(org.telegram.messenger.cd.L0(2131747167, null));
                                y3Var.setInputType(17);
                                y3Var.setImeOptions(6);
                                y3Var.setMaxLines(10);
                                y3Var.setSingleLine(false);
                                y3Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f));
                                y3Var.setCursorWidth(1.5f);
                                y3Var.z(org.telegram.ui.ActionBar.t6.q6, p6Var);
                                if (str != null) {
                                    y3Var.setText(str);
                                    y3Var.setSelection(str.length());
                                }
                                y3Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.e2
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                                        if (i11 != 6) {
                                            return false;
                                        }
                                        y3 y3Var2 = y3.this;
                                        String trim = y3Var2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : s4.a.matcher(trim.trim()).matches())) {
                                            org.telegram.messenger.i0.E3(y3Var2);
                                            return true;
                                        }
                                        q20Var.a(trim);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
                                        if (x1Var2 != null) {
                                            x1Var2.dismiss();
                                        }
                                        View view = currentFocus;
                                        if (view != null) {
                                            view.requestFocus();
                                        }
                                        return true;
                                    }
                                });
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
                                org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i10);
                                y3Var.setBackground(d02);
                                org.telegram.ui.ActionBar.a7.k(y3Var, d02, L, null, p6Var);
                                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                                f7.addView(y3Var, w7.b6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i11 = c81.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    c81 c81Var = new c81(context, p6Var);
                                    c81Var.setWebPage(webPage);
                                    f7.addView(c81Var, w7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.c();
                                alertDialog$Builder.o(f7);
                                x1Var.a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.q.x * 85) / 100);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751355, null), new f2(0, y3Var, q20Var));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new v1(10));
                                if (lmVar != null) {
                                    alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131751599, null), new v0(4, lmVar));
                                }
                                x1VarArr[0] = x1Var;
                                x1Var.j0 = false;
                                x1Var.setOnDismissListener(new r0(y3Var, 2));
                                x1VarArr[0].setOnShowListener(new g2(y3Var, 0));
                                x1VarArr[0].show();
                                TextView textView = (TextView) x1VarArr[0].d(-3);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                }
                            }

                            public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
                                long j12;
                                int i11;
                                long j13;
                                int i12;
                                int i13;
                                int i14;
                                boolean z10;
                                boolean z11;
                                String G;
                                int value = ac0Var.getValue();
                                int value2 = ac0Var2.getValue();
                                int value3 = ac0Var3.getValue();
                                Calendar calendar = Calendar.getInstance();
                                long currentTimeMillis = System.currentTimeMillis();
                                calendar.setTimeInMillis(currentTimeMillis);
                                int i15 = calendar.get(1);
                                calendar.get(6);
                                if (j11 > 0) {
                                    i11 = i15;
                                    calendar.setTimeInMillis((j11 * 1000) + currentTimeMillis);
                                    calendar.set(11, 23);
                                    calendar.set(12, 59);
                                    calendar.set(13, 59);
                                    calendar.set(14, 0);
                                    j12 = currentTimeMillis;
                                    i12 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
                                    j13 = calendar.getTimeInMillis();
                                    i13 = 23;
                                    i14 = 59;
                                } else {
                                    j12 = currentTimeMillis;
                                    i11 = i15;
                                    j13 = j11;
                                    i12 = 0;
                                    i13 = 0;
                                    i14 = 0;
                                }
                                int i16 = i14;
                                long millis = j10 > 0 ? TimeUnit.SECONDS.toMillis(j10) : 60000L;
                                long j14 = j12 + millis;
                                calendar.setTimeInMillis(j14);
                                int i17 = calendar.get(11);
                                int i18 = calendar.get(12);
                                long j15 = j13;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                calendar.add(6, value);
                                calendar.set(11, value2);
                                calendar.set(12, value3);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                long timeInMillis = calendar.getTimeInMillis();
                                ac0Var.setMinValue(0);
                                if (j15 > 0) {
                                    ac0Var.setMaxValue(i12);
                                }
                                int value4 = ac0Var.getValue();
                                ac0Var2.setMinValue(value4 == 0 ? i17 : 0);
                                if (j15 > 0) {
                                    ac0Var2.setMaxValue(value4 == i12 ? i13 : 23);
                                }
                                int value5 = ac0Var2.getValue();
                                ac0Var3.setMinValue((value4 == 0 && value5 == i17) ? i18 : 0);
                                if (j15 > 0) {
                                    ac0Var3.setMaxValue((value4 == i12 && value5 == i13) ? i16 : 59);
                                }
                                int value6 = ac0Var3.getValue();
                                if (timeInMillis <= j14) {
                                    calendar.setTimeInMillis(j14);
                                } else if (j15 > 0 && timeInMillis > j15) {
                                    calendar.setTimeInMillis(j15);
                                }
                                int i19 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                calendar.add(6, value4);
                                calendar.set(11, value5);
                                calendar.set(12, value6);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                long timeInMillis2 = calendar.getTimeInMillis();
                                if (textView != null) {
                                    textView.setText(org.telegram.messenger.cd.D0().w0((i10 * 3) + (value4 == 0 ? 0 : i11 == i19 ? 1 : 2)).format(timeInMillis2));
                                }
                                if (textView2 != null) {
                                    int i20 = (int) ((timeInMillis2 - j12) / 1000);
                                    if (i20 > 86400) {
                                        z11 = false;
                                        G = org.telegram.messenger.cd.G(Math.round(i20 / 86400.0f), "DaysSchedule", new Object[0]);
                                    } else {
                                        z11 = false;
                                        z11 = false;
                                        z11 = false;
                                        G = i20 >= 3600 ? org.telegram.messenger.cd.G(Math.round(i20 / 3600.0f), "HoursSchedule", new Object[0]) : i20 >= 60 ? org.telegram.messenger.cd.G(Math.round(i20 / 60.0f), "MinutesSchedule", new Object[0]) : org.telegram.messenger.cd.G(i20, "SecondsSchedule", new Object[0]);
                                    }
                                    if (textView2.getTag() != null) {
                                        z10 = true;
                                        Object[] objArr = new Object[1];
                                        objArr[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.cd.a0("VoipChannelScheduleInfo", null, 2131743489, objArr));
                                    } else {
                                        z10 = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.cd.a0("VoipGroupScheduleInfo", null, 2131743368, objArr2));
                                    }
                                } else {
                                    z10 = true;
                                    z11 = false;
                                }
                                return timeInMillis - j12 > millis ? z10 : z11;
                            }

                            public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                org.telegram.ui.ActionBar.x1 x1Var;
                                int i10;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || k2Var == null || k2Var.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
                                String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                                x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                String str = tL_error.text;
                                str.getClass();
                                i10 = 1;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        x1Var.T = org.telegram.messenger.cd.L0(2131748768, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        x1Var.T = org.telegram.messenger.cd.L0(2131746607, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        x1Var.T = org.telegram.messenger.cd.L0(2131751748, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z10) {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131749398, null);
                                            break;
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131752271, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        x1Var.T = org.telegram.messenger.cd.L0(2131743754, null);
                                        break;
                                    case "PEER_FLOOD":
                                        x1Var.T = org.telegram.messenger.cd.L0(2131748142, null);
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131748346, null), new x2(i10, k2Var));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z10) {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131749396, null);
                                            break;
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131752269, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131754477, null);
                                            break;
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131754364, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        x1Var.T = org.telegram.messenger.cd.L0(2131742867, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        x1Var.T = org.telegram.messenger.cd.L0(2131754465, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z10) {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131749399, null);
                                            break;
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131752272, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z10) {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131749397, null);
                                            break;
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131752270, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        x1Var.R = org.telegram.messenger.cd.L0(2131752282, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131752283, null);
                                            break;
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131752284, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        x1Var.R = org.telegram.messenger.cd.L0(2131752282, null);
                                        x1Var.T = org.telegram.messenger.cd.L0(2131743783, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z10) {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131749395, null);
                                            break;
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131752268, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        x1Var.T = org.telegram.messenger.cd.L0(2131754476, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z11) {
                                            if (!z10) {
                                                x1Var.T = org.telegram.messenger.cd.L0(2131749119, null);
                                                break;
                                            } else {
                                                x1Var.T = org.telegram.messenger.cd.L0(2131749122, null);
                                                break;
                                            }
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131749121, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        x1Var.R = org.telegram.messenger.cd.L0(2131743332, null);
                                        x1Var.T = org.telegram.messenger.cd.L0(2131743402, null);
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
                                        sb2.append(tL_error.text);
                                        x1Var.T = sb2.toString();
                                        break;
                                }
                                i0.a.w(null, 2131747847, alertDialog$Builder, null);
                            }

                            public static boolean h(Context context, int i10, long j10, boolean z10) {
                                TLRPC.Chat L0;
                                if (!org.telegram.messenger.o5.z(j10) || (L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10))) == null || !L0.slowmode_enabled || org.telegram.messenger.w3.N(L0)) {
                                    return false;
                                }
                                if (!z10) {
                                    TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i10).M0(L0.id);
                                    if (M0 == null) {
                                        M0 = org.telegram.messenger.hs.a0(i10).F0(L0.id, org.telegram.messenger.w3.T(L0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (M0 != null && M0.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    return false;
                                }
                                M(context, L0.title, org.telegram.messenger.cd.L0(2131745320, null)).p();
                                return true;
                            }

                            public static org.telegram.ui.ActionBar.x1 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
                                if (activity == null) {
                                    q20Var.a(Boolean.FALSE);
                                    return null;
                                }
                                int i10 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
                                int i11 = 1;
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                boolean[] zArr = {false};
                                ag.j3 j3Var = new ag.j3(activity, 20);
                                org.telegram.messenger.zs.i(j3Var);
                                org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.j5, p6Var);
                                j3Var.setTextSize(1, 16.0f);
                                j3Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                                j3Var.setText(charSequence);
                                g3 g3Var = new g3(activity, c2VarArr, i11);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.G = 6;
                                alertDialog$Builder.o(g3Var);
                                TextView textView = new TextView(activity);
                                org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.E8, p6Var, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                g3Var.addView(textView, w7.b6.d(-1, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                g3Var.addView(j3Var, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, p6Var);
                                    c2VarArr[0] = c2Var;
                                    int i12 = org.telegram.ui.ActionBar.t6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 7, org.telegram.messenger.i0.L(12.0f));
                                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                                    c2Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, p6Var);
                                    c2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (org.telegram.messenger.cd.X ? 5 : 3) | 16;
                                    c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    c2VarArr[0].e(charSequence2, "", false, false, false);
                                    c2VarArr[0].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(4.0f) : 0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f));
                                    g3Var.addView(c2VarArr[0], w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new x0(3, zArr));
                                }
                                alertDialog$Builder.k(str2, new u2(i10, q20Var, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                if (z10) {
                                    x1Var.Z0 = true;
                                }
                                x1Var.show();
                                return x1Var;
                            }

                            public static org.telegram.ui.ActionBar.x1 i(Activity activity, o4 o4Var) {
                                if (org.telegram.messenger.d20.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                org.telegram.ui.ActionBar.n1 n1Var = x1Var.N0;
                                org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                                LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
                                for (int i10 = 0; i10 < 4; i10++) {
                                    if (org.telegram.messenger.d20.i(i10).f() != null) {
                                        org.telegram.ui.Cells.j jVar = new org.telegram.ui.Cells.j(activity, false);
                                        jVar.f = i10;
                                        TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
                                        r8 r8Var = jVar.e;
                                        r8Var.r(f7);
                                        jVar.a.l(org.telegram.messenger.i5.m(0, f7.first_name, f7.last_name), false);
                                        g9 g9Var = jVar.c;
                                        g9Var.getImageReceiver().d = i10;
                                        g9Var.e(f7, r8Var);
                                        jVar.d.setVisibility(4);
                                        jVar.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
                                        jVar.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                        e.addView(jVar, w7.b6.o(-1, 50));
                                        jVar.setOnClickListener(new ag.i(x1VarArr, n1Var, o4Var, 7));
                                    }
                                }
                                x1Var.R = org.telegram.messenger.cd.L0(2131745688, null);
                                alertDialog$Builder.o(e);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752589, null), null);
                                x1VarArr[0] = x1Var;
                                return x1Var;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
                            /* JADX WARN: Removed duplicated region for block: B:36:0x01c6  */
                            /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
                            /* JADX WARN: Type inference failed for: r0v36, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
                            /* JADX WARN: Type inference failed for: r13v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
                            /* JADX WARN: Type inference failed for: r14v12 */
                            /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String, org.telegram.ui.ActionBar.p6, org.telegram.ui.ActionBar.u1] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.k2] */
                            /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [org.telegram.ui.Cells.c2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void i0(org.telegram.ui.ActionBar.k2 k2Var, long j10, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final org.telegram.messenger.bs bsVar, org.telegram.ui.ActionBar.p6 p6Var) {
                                long j11;
                                boolean z11;
                                String str;
                                String L0;
                                ?? r92;
                                ?? r14;
                                TextView textView;
                                String str2;
                                if (k2Var.getParentActivity() == null) {
                                    return;
                                }
                                final org.telegram.messenger.c accountInstance = k2Var.getAccountInstance();
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var);
                                SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).e7;
                                int i10 = 1;
                                if (encryptedChat == null) {
                                    j11 = j10;
                                    if (!org.telegram.messenger.m5.w("dialog_bar_report", j11, sharedPreferences, false)) {
                                        z11 = false;
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        if (user == null) {
                                            x1Var.R = org.telegram.messenger.cd.a0("BlockUserTitle", null, 2131753685, org.telegram.messenger.h20.j(user, true));
                                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUserAlert", null, 2131753691, org.telegram.messenger.h20.j(user, true)));
                                            String L02 = org.telegram.messenger.cd.L0(2131753693, null);
                                            int i11 = 2;
                                            r92 = new org.telegram.ui.Cells.c2[2];
                                            int i12 = 0;
                                            ?? linearLayout = new LinearLayout(k2Var.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i13 = 0;
                                            while (i13 < i11) {
                                                if (i13 != 0 || z11) {
                                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i10, k2Var.getParentActivity(), p6Var);
                                                    r92[i13] = c2Var;
                                                    c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(i12));
                                                    r92[i13].setTag(Integer.valueOf(i13));
                                                    if (i13 == 0) {
                                                        r92[i13].e(org.telegram.messenger.cd.L0(2131751503, null), "", true, false, false);
                                                        str2 = L02;
                                                    } else {
                                                        str2 = L02;
                                                        r92[i13].e(org.telegram.messenger.cd.a0("DeleteThisChat", null, 2131751483, new Object[i12]), "", true, false, false);
                                                    }
                                                    r92[i13].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                                                    linearLayout.addView(r92[i13], w7.b6.o(-1, -2));
                                                    r92[i13].setOnClickListener(new s0(r92, 1));
                                                } else {
                                                    str2 = L02;
                                                }
                                                i13++;
                                                L02 = str2;
                                                i10 = 1;
                                                i11 = 2;
                                                i12 = 0;
                                            }
                                            alertDialog$Builder.o(linearLayout);
                                            L0 = L02;
                                            r14 = 0;
                                        } else {
                                            if (chat == null || !z10) {
                                                str = null;
                                                str = null;
                                                x1Var.R = org.telegram.messenger.cd.L0(2131746217, null);
                                                if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
                                                    x1Var.T = org.telegram.messenger.cd.L0(2131746221, null);
                                                } else {
                                                    x1Var.T = org.telegram.messenger.cd.L0(2131746222, null);
                                                }
                                            } else {
                                                x1Var.R = org.telegram.messenger.cd.L0(2131746206, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("ReportUnrelatedGroupText", null, 2131746205, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                x1Var.T = org.telegram.messenger.cd.L0(2131746204, null);
                                            }
                                            L0 = org.telegram.messenger.cd.L0(2131746247, str);
                                            r92 = str;
                                            r14 = str;
                                        }
                                        final org.telegram.ui.Cells.c2[] c2VarArr = r92;
                                        final long j12 = j11;
                                        alertDialog$Builder.k(L0, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.k1
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                                                org.telegram.ui.Cells.c2 c2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                org.telegram.messenger.c cVar = accountInstance;
                                                if (user2 != null) {
                                                    org.telegram.messenger.vp.r1(cVar.a).w(user2.id);
                                                }
                                                org.telegram.ui.Cells.c2[] c2VarArr2 = c2VarArr;
                                                long j13 = j12;
                                                TLRPC.Chat chat2 = chat;
                                                if (c2VarArr2 == null || ((c2Var2 = c2VarArr2[0]) != null && c2Var2.b())) {
                                                    org.telegram.messenger.vp.r1(cVar.a).l4(j13, user2, chat2, encryptedChat, chat2 != null && z10);
                                                }
                                                org.telegram.messenger.bs bsVar2 = bsVar;
                                                if (c2VarArr2 != null && !c2VarArr2[1].b()) {
                                                    bsVar2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    org.telegram.messenger.vp.r1(cVar.a).X(0, j13, false);
                                                } else if (org.telegram.messenger.w3.r0(chat2)) {
                                                    org.telegram.messenger.vp.r1(cVar.a).X(0, j13, false);
                                                } else {
                                                    int i15 = cVar.a;
                                                    org.telegram.messenger.vp.r1(i15).f0(-j13, org.telegram.messenger.vp.r1(i15).Z1(Long.valueOf(org.telegram.messenger.d20.i(i15).e())));
                                                }
                                                bsVar2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, r14), r14);
                                        k2Var.showDialog(x1Var);
                                        textView = (TextView) x1Var.d(-1);
                                        if (textView == null) {
                                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, r14);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    j11 = j10;
                                }
                                z11 = true;
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                                if (user == null) {
                                }
                                final org.telegram.ui.Cells.c2[] c2VarArr2 = r92;
                                final long j122 = j11;
                                alertDialog$Builder.k(L0, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.k1
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i14) {
                                        org.telegram.ui.Cells.c2 c2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        org.telegram.messenger.c cVar = accountInstance;
                                        if (user2 != null) {
                                            org.telegram.messenger.vp.r1(cVar.a).w(user2.id);
                                        }
                                        org.telegram.ui.Cells.c2[] c2VarArr22 = c2VarArr2;
                                        long j13 = j122;
                                        TLRPC.Chat chat2 = chat;
                                        if (c2VarArr22 == null || ((c2Var2 = c2VarArr22[0]) != null && c2Var2.b())) {
                                            org.telegram.messenger.vp.r1(cVar.a).l4(j13, user2, chat2, encryptedChat, chat2 != null && z10);
                                        }
                                        org.telegram.messenger.bs bsVar2 = bsVar;
                                        if (c2VarArr22 != null && !c2VarArr22[1].b()) {
                                            bsVar2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            org.telegram.messenger.vp.r1(cVar.a).X(0, j13, false);
                                        } else if (org.telegram.messenger.w3.r0(chat2)) {
                                            org.telegram.messenger.vp.r1(cVar.a).X(0, j13, false);
                                        } else {
                                            int i15 = cVar.a;
                                            org.telegram.messenger.vp.r1(i15).f0(-j13, org.telegram.messenger.vp.r1(i15).Z1(Long.valueOf(org.telegram.messenger.d20.i(i15).e())));
                                        }
                                        bsVar2.a(1);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, r14), r14);
                                k2Var.showDialog(x1Var2);
                                textView = (TextView) x1Var2.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.x1 j(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                                String L0 = org.telegram.messenger.cd.L0(2131754243, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.T = L0;
                                int i10 = org.telegram.ui.ActionBar.t6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
                                alertDialog$Builder.n(i10, null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new k0(context, 0));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
                                return x1Var;
                            }

                            public static void j0(org.telegram.ui.un unVar, org.telegram.messenger.jj jjVar, long j10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.lg lgVar) {
                                if (unVar.getParentActivity() == null || jjVar == null) {
                                    return;
                                }
                                org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
                                TLRPC.User Z1 = j10 > 0 ? org.telegram.messenger.vp.r1(accountInstance.a).Z1(Long.valueOf(j10)) : null;
                                TLRPC.Chat L0 = j10 < 0 ? org.telegram.messenger.vp.r1(accountInstance.a).L0(Long.valueOf(-j10)) : null;
                                if (Z1 == null && L0 == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), p6Var);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R0 = false;
                                x1Var.N = new r0(lgVar, 0);
                                x1Var.R = org.telegram.messenger.cd.L0(2131753692, null);
                                if (Z1 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUserReplyAlert", null, 2131753686, org.telegram.messenger.h20.j(Z1, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUserReplyAlert", null, 2131753686, L0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(unVar.getParentActivity());
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, unVar.getParentActivity(), p6Var)};
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                c2VarArr[0].setTag(0);
                                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131751503, null), "", true, false, false);
                                c2VarArr[0].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                                linearLayout.addView(c2VarArr[0], w7.b6.o(-1, -2));
                                c2VarArr[0].setOnClickListener(new s0(c2VarArr, 0));
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753695, null), new mg.y(Z1, accountInstance, unVar, L0, jjVar, c2VarArr, p6Var));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                unVar.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                }
                            }

                            public static void k(Context context, org.telegram.ui.ActionBar.p6 p6Var, q4 q4Var) {
                                if (context == null) {
                                    return;
                                }
                                boolean z10 = false;
                                int i10 = org.telegram.ui.ActionBar.t6.j5;
                                int f7 = p6Var != null ? p6Var.f(i10) : org.telegram.ui.ActionBar.t6.x0(null, i10, false);
                                int i11 = org.telegram.ui.ActionBar.t6.h5;
                                int f10 = p6Var != null ? p6Var.f(i11) : org.telegram.ui.ActionBar.t6.x0(null, i11, false);
                                int i12 = org.telegram.ui.ActionBar.t6.xj;
                                if (p6Var != null) {
                                    p6Var.f(i12);
                                } else {
                                    org.telegram.ui.ActionBar.t6.x0(null, i12, false);
                                }
                                int i13 = org.telegram.ui.ActionBar.t6.Bj;
                                if (p6Var != null) {
                                    p6Var.f(i13);
                                } else {
                                    org.telegram.ui.ActionBar.t6.x0(null, i13, false);
                                }
                                int i14 = org.telegram.ui.ActionBar.t6.E8;
                                if (p6Var != null) {
                                    p6Var.f(i14);
                                } else {
                                    org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                                }
                                int i15 = org.telegram.ui.ActionBar.t6.G8;
                                if (p6Var != null) {
                                    p6Var.f(i15);
                                } else {
                                    org.telegram.ui.ActionBar.t6.x0(null, i15, false);
                                }
                                int i16 = org.telegram.ui.ActionBar.t6.i6;
                                if (p6Var != null) {
                                    p6Var.f(i16);
                                } else {
                                    org.telegram.ui.ActionBar.t6.x0(null, i16, false);
                                }
                                int i17 = org.telegram.ui.ActionBar.t6.Gi;
                                int f11 = p6Var != null ? p6Var.f(i17) : org.telegram.ui.ActionBar.t6.x0(null, i17, false);
                                int i18 = org.telegram.ui.ActionBar.t6.Ci;
                                int f12 = p6Var != null ? p6Var.f(i18) : org.telegram.ui.ActionBar.t6.x0(null, i18, false);
                                int i19 = org.telegram.ui.ActionBar.t6.Ei;
                                int f13 = p6Var != null ? p6Var.f(i19) : org.telegram.ui.ActionBar.t6.x0(null, i19, false);
                                l2.f fVar = new l2.f(context, p6Var);
                                ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                b4 b4Var = new b4(context, p6Var, iArr);
                                b4Var.setMinValue(0);
                                b4Var.setMaxValue(16);
                                b4Var.setTextColor(f7);
                                b4Var.setValue(0);
                                b4Var.setFormatter(new w0(iArr, 1));
                                c4 c4Var = new c4(context, b4Var, 0);
                                boolean z11 = true;
                                c4Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                c4Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(org.telegram.messenger.cd.L0(2131753877, null));
                                textView.setTextColor(f7);
                                sc.e.t(textView, 1, 20.0f);
                                frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                c4Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, z11, z11, z10, 1);
                                linearLayout.addView(b4Var, w7.b6.l(1.0f, 0, org.telegram.messenger.zs.t4));
                                y3Var.setPadding(0, 0, 0, 0);
                                y3Var.setGravity(17);
                                y3Var.setTextColor(f11);
                                y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
                                y3Var.setTypeface(org.telegram.messenger.i0.o());
                                int L = org.telegram.messenger.i0.L(8.0f);
                                y3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, f12, f13, f13));
                                c4Var.addView(y3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                y3Var.setText(org.telegram.messenger.cd.L0(2131751435, null));
                                b4Var.setOnValueChangedListener(new t(y3Var, 10));
                                y3Var.setOnClickListener(new org.telegram.messenger.video.h(iArr, b4Var, q4Var, fVar, 4));
                                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.b;
                                z2Var.N = c4Var;
                                z2Var.show();
                                z2Var.v0(f10);
                                z2Var.P(f10);
                            }

                            public static void k0(Context context, int i10, long j10) {
                                org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, null, false);
                                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                                f7.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                f7.addView(frameLayout, w7.b6.t(-1, 92, 17, 0, 0, 0, 0));
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                imageView.setImageResource(R.drawable.story_link);
                                imageView.setScaleX(2.0f);
                                imageView.setScaleY(2.0f);
                                frameLayout2.addView(imageView, w7.b6.e(-1, -1, 17));
                                int L = org.telegram.messenger.i0.L(80.0f);
                                int i11 = org.telegram.ui.ActionBar.t6.Ci;
                                ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.v0(i11));
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
                                frameLayout2.setBackground(L2);
                                org.telegram.ui.ActionBar.a7.k(frameLayout2, L2, N, null, null);
                                frameLayout.addView(frameLayout2, w7.b6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i12 = org.telegram.ui.ActionBar.t6.G6;
                                org.telegram.messenger.m5.m(textView, i12, null, 1, 20.0f);
                                textView.setText(org.telegram.messenger.cd.L0(2131752624, null));
                                textView.setGravity(17);
                                TextView f10 = org.telegram.messenger.z20.f(f7, textView, w7.b6.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                org.telegram.ui.ActionBar.a7.V(f10, i12, null);
                                f10.setTextSize(1, 14.0f);
                                org.telegram.messenger.m5.q(null, null, 2131752625, new Object[]{org.telegram.messenger.o5.l(i10, j10)}, f10);
                                f10.setGravity(17);
                                f7.addView(f10, w7.b6.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                vh.d dVar = new vh.d(context, null, true);
                                dVar.i(org.telegram.messenger.cd.L0(2131752626, null), false, true);
                                f7.addView(dVar, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                k10.N = f7;
                                dVar.setOnClickListener(new org.telegram.ui.qd(i10, dVar, k10, j10));
                                k10.O();
                                k10.show();
                            }

                            public static l2.f l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.q20 q20Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
                                int i10;
                                if (context == null) {
                                    return null;
                                }
                                l2.f fVar = new l2.f(context, p6Var);
                                int i11 = 0;
                                ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
                                ac0 ac0Var = new ac0(context, p6Var);
                                ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                                ac0Var.setItemCount(5);
                                ac0 ac0Var2 = new ac0(context, p6Var);
                                ac0Var2.setItemCount(5);
                                ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                                ac0 ac0Var3 = new ac0(context, p6Var);
                                ac0Var3.setItemCount(5);
                                ac0Var3.setTextOffset(-org.telegram.messenger.i0.L(24.0f));
                                u3 u3Var = new u3(context, ac0Var, ac0Var2, ac0Var3);
                                u3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                u3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.j5, p6Var, 1, 20.0f);
                                frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                u3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i12 = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i13 = calendar.get(5);
                                int i14 = calendar.get(2);
                                int i15 = calendar.get(1);
                                int i16 = i15 + 1;
                                p2 p2Var = new p2(ac0Var3, i16, ac0Var, ac0Var2, i15, i14, i13);
                                System.currentTimeMillis();
                                v3 v3Var = new v3(context);
                                linearLayout.addView(ac0Var, w7.b6.l(0.25f, 0, org.telegram.messenger.zs.t4));
                                ac0Var.setMinValue(1);
                                ac0Var.setMaxValue(31);
                                ac0Var.setWrapSelectorWheel(false);
                                ac0Var.setFormatter(new v1(15));
                                t tVar = new t(p2Var, 9);
                                ac0Var.setOnScrollListener(tVar);
                                ac0Var2.setMinValue(0);
                                ac0Var2.setMaxValue(11);
                                ac0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                                ac0Var2.setFormatter(new v1(16));
                                ac0Var2.setOnScrollListener(tVar);
                                ac0Var3.setMinValue(i12);
                                ac0Var3.setMaxValue(i16);
                                ac0Var3.setWrapSelectorWheel(false);
                                ac0Var3.setFormatter(new i2.w(i16, 9));
                                linearLayout.addView(ac0Var3, w7.b6.l(0.25f, 0, org.telegram.messenger.zs.t4));
                                ac0Var3.setOnScrollListener(tVar);
                                if (tL_birthday != null) {
                                    ac0Var.setValue(tL_birthday.day);
                                    ac0Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        ac0Var3.setValue(tL_birthday.year);
                                    } else {
                                        ac0Var3.setValue(i16);
                                    }
                                } else {
                                    ac0Var.setValue(calendar.get(5));
                                    ac0Var2.setValue(calendar.get(2));
                                    ac0Var3.setValue(i16);
                                }
                                p2Var.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    p80 p80Var = new p80(context, null);
                                    p80Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                                    p80Var.setTextSize(1, 13.0f);
                                    org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q5, p6Var);
                                    org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
                                    i10 = 17;
                                    p80Var.setGravity(17);
                                    frameLayout2.addView(p80Var, w7.b6.e(-2, -2, 17));
                                    u3Var.addView(frameLayout2, w7.b6.o(-1, -2));
                                    int i17 = org.telegram.messenger.d20.s0;
                                    ag.d3 d3Var = new ag.d3(i17, p80Var, 25);
                                    d3Var.run();
                                    org.telegram.messenger.zs.f(i17).h(frameLayout2, org.telegram.messenger.zs.k0, new r2(d3Var, i11));
                                    org.telegram.messenger.i5.r(i17).D(false);
                                } else {
                                    i10 = 17;
                                }
                                if (z10) {
                                    vh.d dVar = new vh.d(context, p6Var, false);
                                    dVar.i(org.telegram.messenger.cd.L0(2131751671, null), false, true);
                                    dVar.setOnClickListener(new jg.w1(ac0Var3, i16, p2Var, 7));
                                    u3Var.addView(dVar, w7.b6.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                v3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                                v3Var.setGravity(i10);
                                org.telegram.ui.ActionBar.a7.V(v3Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
                                v3Var.setTextSize(1, 14.0f);
                                v3Var.setTypeface(org.telegram.messenger.i0.o());
                                v3Var.setText(str2);
                                int L = org.telegram.messenger.i0.L(24.0f);
                                int i18 = org.telegram.ui.ActionBar.t6.Ci;
                                int w02 = org.telegram.ui.ActionBar.t6.w0(i18, p6Var);
                                int i19 = org.telegram.ui.ActionBar.t6.Ei;
                                int w03 = org.telegram.ui.ActionBar.t6.w0(i19, p6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i18);
                                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i19);
                                v3Var.setBackground(k02);
                                org.telegram.ui.ActionBar.a7.k(v3Var, k02, N, N2, p6Var);
                                w7.e6.b(v3Var, 0.02f, 1.2f);
                                u3Var.addView(v3Var, w7.b6.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
                                int i20 = 15;
                                v3Var.setOnClickListener(new org.telegram.ui.vf(ac0Var, ac0Var2, ac0Var3, i16, fVar, q20Var));
                                if (z11) {
                                    vh.d dVar2 = new vh.d(context, p6Var, false);
                                    dVar2.i(org.telegram.messenger.cd.L0(2131753715, null), false, true);
                                    dVar2.f();
                                    dVar2.setOnClickListener(new org.telegram.ui.ud(i20, fVar, q20Var));
                                    u3Var.addView(dVar2, w7.b6.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((org.telegram.ui.ActionBar.z2) fVar.b).N = u3Var;
                                return fVar;
                            }

                            public static void l0(String str, org.telegram.ui.ActionBar.k2 k2Var) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || k2Var == null || k2Var.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
                                String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                x1Var.T = org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                k2Var.showDialog(x1Var, true, null);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x015b  */
                            /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x016c  */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x0187  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x018e  */
                            /* JADX WARN: Removed duplicated region for block: B:38:0x0195  */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x01ae  */
                            /* JADX WARN: Removed duplicated region for block: B:44:0x01db  */
                            /* JADX WARN: Removed duplicated region for block: B:47:0x021a  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x0227  */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x0263  */
                            /* JADX WARN: Removed duplicated region for block: B:57:0x0272  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x022d  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x021f  */
                            /* JADX WARN: Removed duplicated region for block: B:60:0x01b0  */
                            /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
                            /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
                            /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.String, org.telegram.ui.ActionBar.u1] */
                            /* JADX WARN: Type inference failed for: r5v23 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void m(org.telegram.ui.ActionBar.k2 k2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                org.telegram.ui.Cells.c2 c2Var;
                                ?? r52;
                                if (k2Var == null) {
                                    return;
                                }
                                Context context = k2Var.getContext();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                m4 m4Var = new m4(context, null);
                                org.telegram.messenger.zs.i(m4Var);
                                org.telegram.ui.ActionBar.a7.V(m4Var, org.telegram.ui.ActionBar.t6.j5, null);
                                org.telegram.ui.ActionBar.a7.H(m4Var, org.telegram.ui.ActionBar.t6.Uc, null);
                                m4Var.setTextSize(1, 16.0f);
                                m4Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                                n4 n4Var = new n4(context, c2VarArr2);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.G = 6;
                                alertDialog$Builder.o(n4Var);
                                r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
                                r8Var.u(org.telegram.messenger.i0.L(18.0f));
                                g9 g9Var = new g9(context);
                                g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
                                n4Var.addView(g9Var, w7.b6.d(40, 40.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
                                org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
                                u5Var.setTextSize(20);
                                u5Var.setTypeface(org.telegram.messenger.i0.o());
                                u5Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                u5Var.setEllipsizeByGradient(true);
                                u5Var.l(user.first_name, false);
                                if (user.scam) {
                                    u5Var.i(org.telegram.ui.ActionBar.t6.g1);
                                } else if (user.fake) {
                                    u5Var.i(org.telegram.ui.ActionBar.t6.h1);
                                } else if (user.verified) {
                                    Drawable f7 = i0.a.f(context, R.drawable.verified_area);
                                    int i10 = org.telegram.ui.ActionBar.t6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.a7.y(u5Var, f7, i10, null, mode);
                                    Drawable f10 = i0.a.f(context, R.drawable.verified_check);
                                    c2VarArr = c2VarArr2;
                                    org.telegram.ui.ActionBar.a7.y(u5Var, f10, org.telegram.ui.ActionBar.t6.A9, null, mode);
                                    u5Var.i(new eq(f7, f10));
                                    TextView textView = new TextView(context);
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.m5, null);
                                    int i11 = 1;
                                    org.telegram.messenger.z20.o(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new c1(user, k2Var, alertDialog$Builder, i11));
                                    SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.cd.L0(2131748350, null) + "  ");
                                    dq dqVar = new dq(R.drawable.attach_arrow_right, 0);
                                    dqVar.n = 1;
                                    dqVar.c(org.telegram.messenger.i0.L(10.0f));
                                    valueOf.setSpan(dqVar, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z10 = org.telegram.messenger.cd.X;
                                    n4Var.addView(u5Var, w7.b6.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f));
                                    boolean z11 = org.telegram.messenger.cd.X;
                                    n4Var.addView(textView, w7.b6.d(-1, -2.0f, (!z11 ? 5 : 3) | 48, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                    n4Var.addView(m4Var, w7.b6.d(-2, -2.0f, (!org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    c2Var = new org.telegram.ui.Cells.c2(1, context, k2Var.getResourceProvider());
                                    c2VarArr[0] = c2Var;
                                    if (!c2Var.H) {
                                        org.telegram.ui.Cells.b2 b2Var = c2Var.c;
                                        b2Var.setLines(3);
                                        b2Var.setMaxLines(3);
                                        b2Var.setSingleLine(false);
                                    }
                                    c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                    c2VarArr[0].e(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131747796, org.telegram.messenger.h20.p(user))), "", true, false, false);
                                    c2VarArr[0].setPadding(!org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, !org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                                    c2VarArr[0].c(true, false);
                                    n4Var.addView(c2VarArr[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new h0(atomicBoolean, 1));
                                    if (org.telegram.messenger.h20.z(user)) {
                                        r52 = 0;
                                        r8Var.p = 1.0f;
                                        k2Var.getCurrentAccount();
                                        r8Var.r(user);
                                        g9Var.e(user, r8Var);
                                    } else {
                                        r8Var.p = 0.8f;
                                        r8Var.g(12);
                                        r52 = 0;
                                        g9Var.j(null, null, r8Var, user);
                                    }
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744933, r52), new v0(3, runnable));
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, r52), r52);
                                    k2Var.showDialog(x1Var);
                                    m4Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752896, r52), new d1(1, context, x1Var)));
                                }
                                c2VarArr = c2VarArr2;
                                TextView textView2 = new TextView(context);
                                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.m5, null);
                                int i112 = 1;
                                org.telegram.messenger.z20.o(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new c1(user, k2Var, alertDialog$Builder, i112));
                                SpannableString valueOf2 = SpannableString.valueOf(org.telegram.messenger.cd.L0(2131748350, null) + "  ");
                                dq dqVar2 = new dq(R.drawable.attach_arrow_right, 0);
                                dqVar2.n = 1;
                                dqVar2.c(org.telegram.messenger.i0.L(10.0f));
                                valueOf2.setSpan(dqVar2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z102 = org.telegram.messenger.cd.X;
                                n4Var.addView(u5Var, w7.b6.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f));
                                boolean z112 = org.telegram.messenger.cd.X;
                                n4Var.addView(textView2, w7.b6.d(-1, -2.0f, (!z112 ? 5 : 3) | 48, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f));
                                n4Var.addView(m4Var, w7.b6.d(-2, -2.0f, (!org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                c2Var = new org.telegram.ui.Cells.c2(1, context, k2Var.getResourceProvider());
                                c2VarArr[0] = c2Var;
                                if (!c2Var.H) {
                                }
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                c2VarArr[0].e(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131747796, org.telegram.messenger.h20.p(user))), "", true, false, false);
                                c2VarArr[0].setPadding(!org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, !org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                                c2VarArr[0].c(true, false);
                                n4Var.addView(c2VarArr[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                c2VarArr[0].setOnClickListener(new h0(atomicBoolean, 1));
                                if (org.telegram.messenger.h20.z(user)) {
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744933, r52), new v0(3, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, r52), r52);
                                k2Var.showDialog(x1Var);
                                m4Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752896, r52), new d1(1, context, x1Var)));
                            }

                            public static void m0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, TL_stars.StarGift starGift, long j10, Runnable runnable) {
                                TLObject d22 = org.telegram.messenger.vp.r1(i10).d2(j10);
                                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                                f7.addView(new rh.b3(context, starGift, d22), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
                                textView.setTextSize(1, 16.0f);
                                org.telegram.messenger.m5.q(null, null, 2131749603, new Object[]{org.telegram.messenger.o5.H(null, null, d22)}, textView);
                                f7.addView(textView, w7.b6.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                                alertDialog$Builder.o(f7);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749604, null), new v0(2, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.p();
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.String, org.telegram.ui.ActionBar.u1] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r52;
                                Context context = k2Var.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                i4 i4Var = new i4(context, null);
                                org.telegram.messenger.zs.i(i4Var);
                                org.telegram.ui.ActionBar.a7.V(i4Var, org.telegram.ui.ActionBar.t6.j5, null);
                                org.telegram.ui.ActionBar.a7.H(i4Var, org.telegram.ui.ActionBar.t6.Uc, null);
                                i4Var.setTextSize(1, 16.0f);
                                i4Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.G = 6;
                                alertDialog$Builder.o(frameLayout);
                                r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
                                r8Var.u(org.telegram.messenger.i0.L(18.0f));
                                g9 g9Var = new g9(context);
                                g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
                                frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
                                org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
                                u5Var.setTextSize(20);
                                u5Var.setTypeface(org.telegram.messenger.i0.o());
                                u5Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                u5Var.setEllipsizeByGradient(true);
                                u5Var.l(user.first_name, false);
                                if (user.scam) {
                                    u5Var.i(org.telegram.ui.ActionBar.t6.g1);
                                } else if (user.fake) {
                                    u5Var.i(org.telegram.ui.ActionBar.t6.h1);
                                } else if (user.verified) {
                                    Drawable f7 = i0.a.f(context, R.drawable.verified_area);
                                    int i10 = org.telegram.ui.ActionBar.t6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.a7.y(u5Var, f7, i10, null, mode);
                                    Drawable f10 = i0.a.f(context, R.drawable.verified_check);
                                    org.telegram.ui.ActionBar.a7.y(u5Var, f10, org.telegram.ui.ActionBar.t6.A9, null, mode);
                                    u5Var.i(new eq(f7, f10));
                                }
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.m5, null);
                                org.telegram.messenger.z20.o(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new c1(user, k2Var, alertDialog$Builder, 0));
                                SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.cd.L0(2131748350, null) + "  ");
                                dq dqVar = new dq(R.drawable.attach_arrow_right, 0);
                                dqVar.n = 1;
                                dqVar.c(org.telegram.messenger.i0.L(10.0f));
                                valueOf.setSpan(dqVar, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z10 = org.telegram.messenger.cd.X;
                                frameLayout.addView(u5Var, w7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
                                boolean z11 = org.telegram.messenger.cd.X;
                                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(i4Var, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.h20.z(user)) {
                                    r8Var.p = 0.8f;
                                    r8Var.g(12);
                                    r52 = 0;
                                    g9Var.j(null, null, r8Var, user);
                                } else {
                                    r52 = 0;
                                    r8Var.p = 1.0f;
                                    k2Var.getCurrentAccount();
                                    r8Var.r(user);
                                    g9Var.e(user, r8Var);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744933, r52), new v0(1, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, r52), r52);
                                k2Var.showDialog(x1Var, false, new m0(2, runnable2));
                                i4Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752896, r52), new d1(0, context, x1Var)));
                            }

                            public static void n0(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, boolean z10, final org.telegram.messenger.j20 j20Var) {
                                if (org.telegram.messenger.i0.E1(context)) {
                                    final int i10 = 1;
                                    final org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                                    final int i11 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                                    String L0 = org.telegram.messenger.cd.L0(2131747795, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i12 = org.telegram.ui.ActionBar.t6.j5;
                                    org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
                                    org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i12);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.a7.k(textView, d02, L, null, p6Var);
                                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, p6Var);
                                    c2Var.setMultiline(true);
                                    c2Var.getTextView().getLayoutParams().width = -1;
                                    c2Var.getTextView().setSingleLine(false);
                                    c2Var.getTextView().setMaxLines(3);
                                    c2Var.getTextView().setTextSize(1, 16.0f);
                                    c2Var.e(org.telegram.messenger.cd.L0(z10 ? 2131752877 : 2131752876, null), "", false, false, false);
                                    c2Var.setOnClickListener(new a1(c2Var, 0));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, w7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(c2Var, w7.b6.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.o(linearLayout);
                                    x1Var.a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747833, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.b1
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                                            switch (i11) {
                                                case 0:
                                                    j20Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.x1 x1Var3 = x1VarArr[0];
                                                    if (x1Var3 != null) {
                                                        x1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    j20Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.x1 x1Var4 = x1VarArr[0];
                                                    if (x1Var4 != null) {
                                                        x1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.b1
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                                            switch (i10) {
                                                case 0:
                                                    j20Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.x1 x1Var3 = x1VarArr[0];
                                                    if (x1Var3 != null) {
                                                        x1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    j20Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.x1 x1Var4 = x1VarArr[0];
                                                    if (x1Var4 != null) {
                                                        x1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    x1VarArr[0] = alertDialog$Builder.p();
                                }
                            }

                            public static l2.f o(Activity activity, org.telegram.messenger.bs bsVar, org.telegram.ui.ActionBar.p6 p6Var) {
                                if (activity == null) {
                                    return null;
                                }
                                l2.f fVar = new l2.f(activity, p6Var);
                                ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
                                ac0 ac0Var = new ac0(activity, p6Var);
                                ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                                ac0Var.setItemCount(5);
                                ac0 ac0Var2 = new ac0(activity, p6Var);
                                ac0Var2.setItemCount(5);
                                ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                                ac0 ac0Var3 = new ac0(activity, p6Var);
                                ac0Var3.setItemCount(5);
                                ac0Var3.setTextOffset(-org.telegram.messenger.i0.L(24.0f));
                                n3 n3Var = new n3(activity, ac0Var, ac0Var2, ac0Var3, 6);
                                n3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                n3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(org.telegram.messenger.cd.L0(2131752132, null));
                                org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.j5, p6Var, 1, 20.0f);
                                frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                ag.j3 j3Var = new ag.j3(activity, 17);
                                linearLayout.addView(ac0Var, w7.b6.l(0.25f, 0, org.telegram.messenger.zs.t4));
                                ac0Var.setMinValue(1);
                                ac0Var.setMaxValue(31);
                                ac0Var.setWrapSelectorWheel(false);
                                ac0Var.setFormatter(new v1(17));
                                s1 s1Var = new s1(ac0Var, ac0Var2, ac0Var3, 2);
                                ac0Var.setOnValueChangedListener(s1Var);
                                ac0Var2.setMinValue(0);
                                ac0Var2.setMaxValue(11);
                                ac0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                                ac0Var2.setFormatter(new v1(18));
                                ac0Var2.setOnValueChangedListener(s1Var);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i10 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i11 = calendar.get(1);
                                ac0Var3.setMinValue(i10);
                                ac0Var3.setMaxValue(i11);
                                ac0Var3.setWrapSelectorWheel(false);
                                ac0Var3.setFormatter(new v1(19));
                                linearLayout.addView(ac0Var3, w7.b6.l(0.25f, 0, org.telegram.messenger.zs.t4));
                                ac0Var3.setOnValueChangedListener(s1Var);
                                ac0Var.setValue(31);
                                ac0Var2.setValue(12);
                                ac0Var3.setValue(i11);
                                b(ac0Var, ac0Var2, ac0Var3);
                                j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                                j3Var.setGravity(17);
                                org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
                                j3Var.setTextSize(1, 14.0f);
                                j3Var.setTypeface(org.telegram.messenger.i0.o());
                                j3Var.setText(org.telegram.messenger.cd.L0(2131749075, null));
                                int L = org.telegram.messenger.i0.L(8.0f);
                                int i12 = org.telegram.ui.ActionBar.t6.Ci;
                                int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
                                int i13 = org.telegram.ui.ActionBar.t6.Ei;
                                int w03 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
                                j3Var.setBackground(k02);
                                org.telegram.ui.ActionBar.a7.k(j3Var, k02, N, N2, p6Var);
                                n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                j3Var.setOnClickListener(new mg.f(ac0Var, ac0Var2, ac0Var3, calendar, (Object) bsVar, fVar, 3));
                                ((org.telegram.ui.ActionBar.z2) fVar.b).N = n3Var;
                                return fVar;
                            }

                            public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, gf.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.p6 p6Var) {
                                String u10;
                                LinearLayout f7;
                                if (org.telegram.messenger.i0.E1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (gf.f.e(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                                        gf.f.q(context, Uri.parse(str), j10 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), eVar, null, false, true, false);
                                        return;
                                    }
                                    if (z10) {
                                        try {
                                            Uri parse = Uri.parse(str);
                                            u10 = gf.f.u(parse, null, null, gf.f.a(parse.getHost()), null);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, false);
                                        }
                                        k2 k2Var = new k2(context, str, j10, z11, eVar);
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                                        String L0 = org.telegram.messenger.cd.L0(2131747795, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.R = L0;
                                        TextView textView = new TextView(context);
                                        textView.setText(u10);
                                        textView.setTextSize(1, 14.0f);
                                        int i10 = org.telegram.ui.ActionBar.t6.j5;
                                        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
                                        textView.setGravity(17);
                                        textView.setMaxLines(5);
                                        textView.setEllipsize(TextUtils.TruncateAt.END);
                                        textView.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f));
                                        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
                                        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i10);
                                        textView.setBackground(d02);
                                        org.telegram.ui.ActionBar.a7.k(textView, d02, L, null, p6Var);
                                        f7 = org.telegram.messenger.m5.f(context, 1);
                                        f7.addView(textView, w7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                        int i11 = c81.f;
                                        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                            c81 c81Var = new c81(context, p6Var);
                                            c81Var.setWebPage(webPage);
                                            f7.addView(c81Var, w7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                        }
                                        alertDialog$Builder.o(f7);
                                        x1Var.a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.q.x * 85) / 100);
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747833, null), new t(k2Var, 8));
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        alertDialog$Builder.p();
                                    }
                                    u10 = str;
                                    k2 k2Var2 = new k2(context, str, j10, z11, eVar);
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context, p6Var);
                                    String L02 = org.telegram.messenger.cd.L0(2131747795, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.R = L02;
                                    TextView textView2 = new TextView(context);
                                    textView2.setText(u10);
                                    textView2.setTextSize(1, 14.0f);
                                    int i102 = org.telegram.ui.ActionBar.t6.j5;
                                    org.telegram.ui.ActionBar.a7.V(textView2, i102, p6Var);
                                    textView2.setGravity(17);
                                    textView2.setMaxLines(5);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f));
                                    ShapeDrawable d022 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i102, p6Var)));
                                    org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.06f, i102);
                                    textView2.setBackground(d022);
                                    org.telegram.ui.ActionBar.a7.k(textView2, d022, L2, null, p6Var);
                                    f7 = org.telegram.messenger.m5.f(context, 1);
                                    f7.addView(textView2, w7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i112 = c81.f;
                                    if (webPage != null) {
                                        c81 c81Var2 = new c81(context, p6Var);
                                        c81Var2.setWebPage(webPage);
                                        f7.addView(c81Var2, w7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder2.o(f7);
                                    x1Var2.a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.q.x * 85) / 100);
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747833, null), new t(k2Var2, 8));
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder2.p();
                                }
                            }

                            public static void p(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, boolean z10) {
                                String L0;
                                String a02;
                                if (k2Var.getParentActivity() == null || user == null || org.telegram.messenger.h20.x(user) || org.telegram.messenger.d20.i(k2Var.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                k2Var.getCurrentAccount();
                                Activity parentActivity = k2Var.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                if (z10) {
                                    L0 = org.telegram.messenger.cd.L0(2131743635, null);
                                    a02 = org.telegram.messenger.cd.a0("VideoCallAlert", null, 2131743636, org.telegram.messenger.h20.p(user));
                                } else {
                                    L0 = org.telegram.messenger.cd.L0(2131752631, null);
                                    a02 = org.telegram.messenger.cd.a0("CallAlert", null, 2131752632, org.telegram.messenger.h20.p(user));
                                }
                                j3 j3Var = new j3(parentActivity);
                                org.telegram.messenger.zs.i(j3Var);
                                org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.j5, null);
                                j3Var.setTextSize(1, 16.0f);
                                j3Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                                j3Var.setText(org.telegram.messenger.i0.W2(a02));
                                r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
                                r8Var.u(org.telegram.messenger.i0.L(12.0f));
                                r8Var.p = 1.0f;
                                k2Var.getCurrentAccount();
                                r8Var.r(user);
                                g9 g9Var = new g9(parentActivity);
                                g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
                                g9Var.e(user, r8Var);
                                frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(L0);
                                boolean z11 = org.telegram.messenger.cd.X;
                                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(j3Var, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.o(frameLayout);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752634, null), new ag.v0(k2Var, user, z10, 4));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                k2Var.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(org.telegram.ui.ActionBar.k2 k2Var, String str, boolean z10, boolean z11) {
                                q0(k2Var, str, z10, true, z11, false, null, null, null);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x017e, code lost:
                            
                                if (org.telegram.messenger.w3.p0(r34) == false) goto L62;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x0196, code lost:
                            
                                r8 = new org.telegram.ui.Cells.c2(1, r6, r37);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01a6, code lost:
                            
                                if (r34 == null) goto L65;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01a8, code lost:
                            
                                r11[0].e(org.telegram.messenger.cd.L0(2131751525, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01db, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
                            
                                if (org.telegram.messenger.cd.X == false) goto L69;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
                            
                                r4 = org.telegram.messenger.i0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01ee, code lost:
                            
                                if (org.telegram.messenger.cd.X == false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01f0, code lost:
                            
                                r5 = org.telegram.messenger.i0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01fb, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new org.telegram.ui.Components.x0(2, r1));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01f6, code lost:
                            
                                r5 = org.telegram.messenger.i0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01e8, code lost:
                            
                                r4 = org.telegram.messenger.i0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01bd, code lost:
                            
                                r11[0].e(org.telegram.messenger.cd.a0("DeleteMessagesOptionAlso", null, 2131751526, org.telegram.messenger.h20.j(r33, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
                            
                                if (org.telegram.messenger.w3.p0(r34) == false) goto L62;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.User user, TLRPC.Chat chat, boolean z10, org.telegram.messenger.zr zrVar, org.telegram.ui.ActionBar.p6 p6Var) {
                                boolean z11;
                                if (k2Var == null || k2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = k2Var.getCurrentAccount();
                                Activity parentActivity = k2Var.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, p6Var);
                                long e = org.telegram.messenger.d20.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                h3 h3Var = new h3(parentActivity);
                                org.telegram.messenger.zs.i(h3Var);
                                org.telegram.ui.ActionBar.a7.V(h3Var, org.telegram.ui.ActionBar.t6.j5, null);
                                h3Var.setTextSize(1, 16.0f);
                                h3Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                                i3 i3Var = new i3(parentActivity, c2VarArr);
                                alertDialog$Builder.o(i3Var);
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                i3Var.addView(textView, w7.b6.d(-1, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                i3Var.addView(h3Var, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i10 == -1) {
                                    textView.setText(org.telegram.messenger.cd.a0("ClearHistory", null, 2131752089, new Object[0]));
                                    if (user != null) {
                                        h3Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AreYouSureClearHistoryWithUser", null, 2131754107, org.telegram.messenger.h20.p(user))));
                                    } else if (z10) {
                                        if (org.telegram.messenger.w3.V(chat)) {
                                            h3Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AreYouSureClearHistoryWithChannel", null, 2131754110, chat.title)));
                                            z11 = false;
                                        } else {
                                            h3Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AreYouSureClearHistoryWithChat", null, 2131754109, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        h3Var.setText(org.telegram.messenger.cd.L0(2131754112, null));
                                    } else {
                                        h3Var.setText(org.telegram.messenger.cd.L0(2131754114, null));
                                    }
                                    z11 = false;
                                } else {
                                    z11 = false;
                                    textView.setText(org.telegram.messenger.cd.G(i10, "DeleteDays", new Object[0]));
                                    h3Var.setText(org.telegram.messenger.cd.L0(2131751536, null));
                                }
                                boolean[] zArr = new boolean[1];
                                zArr[z11 ? 1 : 0] = z11;
                                if (chat != null && z10 && org.telegram.messenger.w3.t0(chat)) {
                                    zArr[z11 ? 1 : 0] = true;
                                }
                                if (user != null) {
                                    long j10 = user.id;
                                    if (j10 != e) {
                                        if (j10 != 489000) {
                                        }
                                    }
                                }
                                if (chat != null) {
                                    if (z10) {
                                        if (!org.telegram.messenger.w3.t0(chat)) {
                                            if (!org.telegram.messenger.w3.V(chat)) {
                                            }
                                        }
                                    }
                                }
                                CharSequence L0 = org.telegram.messenger.cd.L0(2131751599, null);
                                if (chat != null && z10 && org.telegram.messenger.w3.t0(chat) && !org.telegram.messenger.w3.V(chat)) {
                                    L0 = org.telegram.messenger.cd.L0(2131752091, null);
                                }
                                alertDialog$Builder.k(L0, new f2(3, zrVar, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                k2Var.showDialog(x1Var);
                                TextView textView2 = (TextView) x1Var.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                                }
                            }

                            public static void q0(org.telegram.ui.ActionBar.k2 k2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, gf.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.p6 p6Var) {
                                if (k2Var == null || k2Var.getParentActivity() == null) {
                                    return;
                                }
                                o0(k2Var.getParentActivity(), str, z10, z11, z12, z13, k2Var instanceof org.telegram.ui.un ? ((org.telegram.ui.un) k2Var).v8 : 0L, eVar, webPage, p6Var);
                            }

                            public static void r(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.zr zrVar) {
                                s(k2Var, z10, false, chat, user, z11, z12, z13, z14, zrVar, k2Var != null ? k2Var.getResourceProvider() : null);
                            }

                            public static void r0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i11 = org.telegram.messenger.vp.r1(i10).n3;
                                if ((i11 & 1) != 0) {
                                    org.telegram.ui.Cells.f1.t(null, 2131748701, arrayList, 0, arrayList2);
                                }
                                if ((i11 & 2) != 0) {
                                    org.telegram.ui.Cells.f1.t(null, 2131748703, arrayList, 1, arrayList2);
                                }
                                if ((i11 & 4) != 0) {
                                    org.telegram.ui.Cells.f1.t(null, 2131748699, arrayList, 3, arrayList2);
                                }
                                arrayList.add(org.telegram.messenger.cd.L0(2131748702, null));
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
                                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131748700, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.o(linearLayout);
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
                                    n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                                    n6Var.setTag(Integer.valueOf(i12));
                                    a(n6Var, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.E5, null);
                                    n6Var.b((CharSequence) arrayList.get(i12), org.telegram.messenger.tz.o0 == ((Integer) arrayList2.get(i12)).intValue());
                                    int i13 = org.telegram.ui.ActionBar.t6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 2, -1);
                                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                                    n6Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.a7.k(n6Var, h02, null, N, null);
                                    linearLayout.addView(n6Var);
                                    n6Var.setOnClickListener(new ag.i(arrayList2, runnable, alertDialog$Builder, 8));
                                }
                                if (!z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                }
                                org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder.p();
                                if (z10) {
                                    p5.setCanceledOnTouchOutside(false);
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:101:0x06a9  */
                            /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:104:0x0614  */
                            /* JADX WARN: Removed duplicated region for block: B:133:0x048f  */
                            /* JADX WARN: Removed duplicated region for block: B:186:0x0433  */
                            /* JADX WARN: Removed duplicated region for block: B:207:0x0315  */
                            /* JADX WARN: Removed duplicated region for block: B:215:0x0396  */
                            /* JADX WARN: Removed duplicated region for block: B:218:0x03a7  */
                            /* JADX WARN: Removed duplicated region for block: B:222:0x03e9  */
                            /* JADX WARN: Removed duplicated region for block: B:224:0x03b0  */
                            /* JADX WARN: Removed duplicated region for block: B:225:0x039b  */
                            /* JADX WARN: Removed duplicated region for block: B:227:0x034c  */
                            /* JADX WARN: Removed duplicated region for block: B:238:0x03f6  */
                            /* JADX WARN: Removed duplicated region for block: B:90:0x03fb  */
                            /* JADX WARN: Removed duplicated region for block: B:94:0x044a  */
                            /* JADX WARN: Removed duplicated region for block: B:98:0x060c  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void s(final org.telegram.ui.ActionBar.k2 k2Var, final boolean z10, final boolean z11, final TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final org.telegram.messenger.zr zrVar, final org.telegram.ui.ActionBar.p6 p6Var) {
                                long j10;
                                boolean z16;
                                boolean z17;
                                r8 r8Var;
                                TLRPC.Chat chat2;
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                d3 d3Var;
                                ArrayList arrayList;
                                org.telegram.ui.ActionBar.x1 x1Var;
                                r8 r8Var2;
                                float f7;
                                float f10;
                                boolean z18;
                                r8 r8Var3;
                                boolean z19;
                                boolean z20;
                                String str;
                                CharSequence L0;
                                TextView textView;
                                if (k2Var == null || k2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (chat == null && user == null) {
                                    return;
                                }
                                final int currentAccount = k2Var.getCurrentAccount();
                                final Activity parentActivity = k2Var.getParentActivity();
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, p6Var);
                                long e = org.telegram.messenger.d20.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                d3 d3Var2 = new d3(parentActivity);
                                org.telegram.messenger.zs.i(d3Var2);
                                org.telegram.ui.ActionBar.a7.V(d3Var2, org.telegram.ui.ActionBar.t6.j5, null);
                                d3Var2.setTextSize(1, 16.0f);
                                d3Var2.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                                if (!z15 && org.telegram.messenger.w3.T(chat) && org.telegram.messenger.w3.t0(chat)) {
                                    j10 = e;
                                    z16 = true;
                                } else {
                                    j10 = e;
                                    z16 = false;
                                }
                                e3 e3Var = new e3(parentActivity, c2VarArr2);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                                x1Var2.G = 6;
                                alertDialog$Builder.o(e3Var);
                                r8 r8Var4 = new r8((org.telegram.ui.ActionBar.p6) null);
                                r8Var4.u(org.telegram.messenger.i0.L(18.0f));
                                g9 g9Var = new g9(parentActivity);
                                g9Var.setRoundRadius(org.telegram.messenger.i0.L(15.0f));
                                e3Var.addView(g9Var, w7.b6.d(30, 30.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                f6 f6Var = new f6(parentActivity, false, false, false);
                                org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.E8, null);
                                f6Var.setTextSize(org.telegram.messenger.i0.L(20.0f));
                                f6Var.setTypeface(org.telegram.messenger.i0.o());
                                f6Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                                f6Var.setEllipsizeByGradient(true);
                                if (!z10) {
                                    z17 = z16;
                                    if (chat == null) {
                                        f6Var.setText(org.telegram.messenger.cd.L0(2131751554, null));
                                    } else if (org.telegram.messenger.w3.Y(chat)) {
                                        f6Var.setText(org.telegram.messenger.cd.L0(2131751934, null));
                                    } else if (!org.telegram.messenger.w3.T(chat)) {
                                        f6Var.setText(org.telegram.messenger.cd.L0(2131749001, null));
                                    } else if (chat.monoforum) {
                                        f6Var.setText(org.telegram.messenger.cd.L0(2131749005, null));
                                    } else if (chat.megagroup) {
                                        f6Var.setText(org.telegram.messenger.cd.L0(2131749001, null));
                                    } else {
                                        f6Var.setText(org.telegram.messenger.cd.L0(2131749014, null));
                                    }
                                } else if (z16) {
                                    z17 = z16;
                                    f6Var.setText(org.telegram.messenger.cd.L0(2131752088, null));
                                } else {
                                    z17 = z16;
                                    f6Var.setText(org.telegram.messenger.cd.L0(2131752089, null));
                                }
                                boolean z21 = org.telegram.messenger.cd.X;
                                e3Var.addView(f6Var, w7.b6.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
                                e3Var.addView(d3Var2, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.w3.p0(chat)) {
                                    r8Var = r8Var4;
                                    chat2 = k2Var.getMessagesController().u1(chat.id);
                                } else {
                                    r8Var = r8Var4;
                                    chat2 = null;
                                }
                                boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j10 ? 1 : (user.id == j10 ? 0 : -1)) != 0 && org.telegram.messenger.vp.r1(currentAccount).c3) && (user != null ? org.telegram.messenger.vp.r1(currentAccount).b3 : org.telegram.messenger.vp.r1(currentAccount).a3) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    c2VarArr = c2VarArr2;
                                    d3Var = d3Var2;
                                    arrayList = (ArrayList) org.telegram.messenger.vp.r1(currentAccount).R.f(user.id);
                                } else {
                                    c2VarArr = c2VarArr2;
                                    d3Var = d3Var2;
                                    arrayList = null;
                                }
                                boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((org.telegram.messenger.jj) arrayList.get(0)).k == null || (!(((org.telegram.messenger.jj) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((org.telegram.messenger.jj) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f7 = 10.0f;
                                    if (user.bot) {
                                        r8Var2 = r8Var;
                                        f10 = 8.0f;
                                        if (user.id != 489000) {
                                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, p6Var);
                                            c2VarArr[0] = c2Var;
                                            c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                                            c2VarArr[0].e(org.telegram.messenger.cd.L0(2131753694, null), "", false, false, false);
                                            x1Var = x1Var2;
                                            c2VarArr[0].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(10.0f));
                                            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var2.c(true, false);
                                            c2VarArr[0].setMultiline(true);
                                            e3Var.addView(c2VarArr[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            c2VarArr[0].setOnClickListener(new x0(1, zArr));
                                            r8Var3 = r8Var2;
                                            z19 = false;
                                            if (user != null) {
                                                r8 r8Var5 = r8Var3;
                                                k2Var.getCurrentAccount();
                                                r8Var5.q(chat2 != null ? chat2 : chat);
                                                g9Var.e(chat2 != null ? chat2 : chat, r8Var5);
                                            } else if (org.telegram.messenger.h20.z(user)) {
                                                r8 r8Var6 = r8Var3;
                                                r8Var6.p = 0.6f;
                                                r8Var6.g(12);
                                                g9Var.j(null, null, r8Var6, user);
                                            } else {
                                                r8 r8Var7 = r8Var3;
                                                if (user.id == j10) {
                                                    r8Var7.p = 0.6f;
                                                    r8Var7.g(1);
                                                    g9Var.j(null, null, r8Var7, user);
                                                } else {
                                                    r8Var7.p = 1.0f;
                                                    k2Var.getCurrentAccount();
                                                    r8Var7.r(user);
                                                    g9Var.e(user, r8Var7);
                                                }
                                            }
                                            if (z11) {
                                                d3 d3Var3 = d3Var;
                                                if (!z10) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z12) {
                                                            d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754087, org.telegram.messenger.h20.p(user))));
                                                        } else if (user.id == j10) {
                                                            d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131754090, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754086, org.telegram.messenger.h20.p(user))));
                                                        } else {
                                                            str = null;
                                                            d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754088, org.telegram.messenger.h20.p(user))));
                                                        }
                                                    } else if (org.telegram.messenger.w3.T(chat)) {
                                                        String a02 = chat2 != null ? org.telegram.messenger.cd.a0(null, null, 2131748361, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131748658, a02)));
                                                        } else {
                                                            d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131752389, a02)));
                                                        }
                                                    } else {
                                                        d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754104, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a03 = chat2 != null ? org.telegram.messenger.cd.a0(null, null, 2131748361, chat2.title) : chat.title;
                                                    if (!org.telegram.messenger.w3.T(chat) || (chat.megagroup && !org.telegram.messenger.w3.t0(chat))) {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754109, a03)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.cd.L0(2131754112, null));
                                                    } else {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.cd.L0(2131754114, null));
                                                    }
                                                } else if (z12) {
                                                    str = null;
                                                    d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754108, org.telegram.messenger.h20.p(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j10) {
                                                        d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131754111, null)));
                                                    } else {
                                                        d3Var3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754107, org.telegram.messenger.h20.p(user))));
                                                    }
                                                }
                                            } else if (org.telegram.messenger.h20.B(user)) {
                                                str = null;
                                                d3Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751582, null)));
                                            } else {
                                                d3 d3Var4 = d3Var;
                                                str = null;
                                                if (chat == null || !org.telegram.messenger.w3.V(chat)) {
                                                    d3Var4.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751586, null)));
                                                    str = null;
                                                } else {
                                                    d3Var4.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751585, null)));
                                                }
                                            }
                                            if (!z11) {
                                                L0 = org.telegram.messenger.cd.L0(2131751591, str);
                                            } else if (z10) {
                                                L0 = z17 ? org.telegram.messenger.cd.L0(2131752088, str) : org.telegram.messenger.cd.L0(2131752090, str);
                                            } else if (z19 && zArr[0]) {
                                                L0 = org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131752422 : 2131751531, str);
                                            } else {
                                                L0 = org.telegram.messenger.w3.T(chat) ? chat.monoforum ? org.telegram.messenger.cd.L0(2131749005, str) : chat.megagroup ? org.telegram.messenger.cd.L0(2131749000, str) : org.telegram.messenger.cd.L0(2131749012, str) : org.telegram.messenger.cd.L0(2131751554, str);
                                            }
                                            final boolean z24 = z17;
                                            org.telegram.ui.ActionBar.x1 x1Var3 = x1Var;
                                            alertDialog$Builder.k(L0, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.m2
                                                @Override // org.telegram.ui.ActionBar.u1
                                                public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i10) {
                                                    boolean z25 = z24;
                                                    final boolean z26 = z11;
                                                    final boolean[] zArr2 = zArr;
                                                    final org.telegram.messenger.zr zrVar2 = zrVar;
                                                    boolean z27 = true;
                                                    if (!z25 && !z26 && !z12) {
                                                        final TLRPC.User user2 = user;
                                                        boolean B = org.telegram.messenger.h20.B(user2);
                                                        final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                                                        final boolean z28 = z10;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z29 = z13;
                                                        final boolean z30 = z15;
                                                        final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                                        if (B) {
                                                            s4.s(k2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, zrVar2, p6Var2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            org.telegram.messenger.hs a04 = org.telegram.messenger.hs.a0(k2Var2.getCurrentAccount());
                                                            a04.a.c(new org.telegram.messenger.lr(a04, user2.id, new org.telegram.messenger.bs() { // from class: org.telegram.ui.Components.g1
                                                                @Override // org.telegram.messenger.bs
                                                                public final void a(int i11) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    org.telegram.messenger.zr zrVar3 = zrVar2;
                                                                    if (i11 >= 50) {
                                                                        s4.s(org.telegram.ui.ActionBar.k2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, zrVar3, p6Var2);
                                                                    } else if (zrVar3 != null) {
                                                                        zrVar3.i(zArr3[0]);
                                                                    }
                                                                }
                                                            }, 0));
                                                            return;
                                                        }
                                                        if (org.telegram.messenger.w3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final gf.e h = alertDialog$Builder.a.h(-1, true, true);
                                                            h.d();
                                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                            tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.vp.h1(chat3);
                                                            final int i11 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                                            a3.b bVar = new a3.b(1);
                                                            final Context context = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.j20() { // from class: org.telegram.ui.Components.h1
                                                                @Override // org.telegram.messenger.j20
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    gf.e.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    org.telegram.messenger.zr zrVar3 = zrVar2;
                                                                    if (user4 == null) {
                                                                        zrVar3.i(z26 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Context context2 = context;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    m4.a1 a1Var = new m4.a1(context2, chat4, user4, i11, zrVar3, p6Var2, 6);
                                                                    q1 q1Var = new q1(zrVar3, 0);
                                                                    org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                                                                    if (k2Var3 == null || k2Var3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context3 = k2Var3.getContext();
                                                                    TLRPC.User f11 = org.telegram.messenger.d20.i(k2Var3.getCurrentAccount()).f();
                                                                    boolean V = org.telegram.messenger.w3.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context3);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    g9 g9Var2 = new g9(context3);
                                                                    r8 r8Var8 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                    r8Var8.r(f11);
                                                                    g9Var2.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                                                                    g9Var2.e(f11, r8Var8);
                                                                    frameLayout.addView(g9Var2, w7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context3);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.d7, k2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    f3 f3Var = new f3(context3);
                                                                    r8 r8Var9 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                    r8Var9.r(user4);
                                                                    f3Var.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                                                                    f3Var.e(user4, r8Var9);
                                                                    frameLayout.addView(f3Var, w7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    g9 g9Var3 = new g9(context3);
                                                                    r8 r8Var10 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                    r8Var10.q(chat4);
                                                                    g9Var3.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
                                                                    g9Var3.e(chat4, r8Var10);
                                                                    frameLayout.addView(g9Var3, w7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                    org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder2.a;
                                                                    x1Var5.Q0 = -1.0f;
                                                                    x1Var5.V = frameLayout;
                                                                    x1Var5.R = org.telegram.messenger.cd.L0(V ? 2131749010 : 2131749002, null);
                                                                    x1Var5.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, V ? 2131749011 : 2131749003, org.telegram.messenger.h20.p(user4), chat4.title));
                                                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131754210, null), new t(a1Var, 4));
                                                                    alertDialog$Builder2.i(org.telegram.messenger.cd.L0(2131752589, null), null);
                                                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(V ? 2131749014 : 2131749000, null), new t(q1Var, 5));
                                                                    x1Var5.show();
                                                                    View d = x1Var5.d(-1);
                                                                    if (d instanceof TextView) {
                                                                        org.telegram.ui.ActionBar.a7.V((TextView) d, org.telegram.ui.ActionBar.t6.q7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        zrVar2 = zrVar2;
                                                    }
                                                    if (!z26 && !zArr2[0]) {
                                                        z27 = false;
                                                    }
                                                    zrVar2.i(z27);
                                                }
                                            });
                                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                            k2Var.showDialog(x1Var3);
                                            textView = (TextView) x1Var3.d(-1);
                                            if (textView == null) {
                                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        x1Var = x1Var2;
                                        if (!z11 || (((!z12 || z10) && !z22) || org.telegram.messenger.h20.x(user) || z23)) {
                                            z18 = (z13 || z10 || chat == null || !chat.creator) ? false : true;
                                            if (!z18) {
                                                r8Var3 = r8Var2;
                                                z19 = z18;
                                                if (user != null) {
                                                }
                                                if (z11) {
                                                }
                                                if (!z11) {
                                                }
                                                final boolean z242 = z17;
                                                org.telegram.ui.ActionBar.x1 x1Var32 = x1Var;
                                                alertDialog$Builder.k(L0, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.m2
                                                    @Override // org.telegram.ui.ActionBar.u1
                                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i10) {
                                                        boolean z25 = z242;
                                                        final boolean z26 = z11;
                                                        final boolean[] zArr2 = zArr;
                                                        final org.telegram.messenger.zr zrVar2 = zrVar;
                                                        boolean z27 = true;
                                                        if (!z25 && !z26 && !z12) {
                                                            final TLRPC.User user2 = user;
                                                            boolean B = org.telegram.messenger.h20.B(user2);
                                                            final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                                                            final boolean z28 = z10;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z29 = z13;
                                                            final boolean z30 = z15;
                                                            final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                                            if (B) {
                                                                s4.s(k2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, zrVar2, p6Var2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                org.telegram.messenger.hs a04 = org.telegram.messenger.hs.a0(k2Var2.getCurrentAccount());
                                                                a04.a.c(new org.telegram.messenger.lr(a04, user2.id, new org.telegram.messenger.bs() { // from class: org.telegram.ui.Components.g1
                                                                    @Override // org.telegram.messenger.bs
                                                                    public final void a(int i11) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        org.telegram.messenger.zr zrVar3 = zrVar2;
                                                                        if (i11 >= 50) {
                                                                            s4.s(org.telegram.ui.ActionBar.k2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, zrVar3, p6Var2);
                                                                        } else if (zrVar3 != null) {
                                                                            zrVar3.i(zArr3[0]);
                                                                        }
                                                                    }
                                                                }, 0));
                                                                return;
                                                            }
                                                            if (org.telegram.messenger.w3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final gf.e h = alertDialog$Builder.a.h(-1, true, true);
                                                                h.d();
                                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                                tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.vp.h1(chat3);
                                                                final int i11 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                                                a3.b bVar = new a3.b(1);
                                                                final Context context = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.j20() { // from class: org.telegram.ui.Components.h1
                                                                    @Override // org.telegram.messenger.j20
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        gf.e.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        org.telegram.messenger.zr zrVar3 = zrVar2;
                                                                        if (user4 == null) {
                                                                            zrVar3.i(z26 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Context context2 = context;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        m4.a1 a1Var = new m4.a1(context2, chat4, user4, i11, zrVar3, p6Var2, 6);
                                                                        q1 q1Var = new q1(zrVar3, 0);
                                                                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                                                                        if (k2Var3 == null || k2Var3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context3 = k2Var3.getContext();
                                                                        TLRPC.User f11 = org.telegram.messenger.d20.i(k2Var3.getCurrentAccount()).f();
                                                                        boolean V = org.telegram.messenger.w3.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        g9 g9Var2 = new g9(context3);
                                                                        r8 r8Var8 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                        r8Var8.r(f11);
                                                                        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                                                                        g9Var2.e(f11, r8Var8);
                                                                        frameLayout.addView(g9Var2, w7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context3);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.d7, k2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        f3 f3Var = new f3(context3);
                                                                        r8 r8Var9 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                        r8Var9.r(user4);
                                                                        f3Var.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                                                                        f3Var.e(user4, r8Var9);
                                                                        frameLayout.addView(f3Var, w7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        g9 g9Var3 = new g9(context3);
                                                                        r8 r8Var10 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                        r8Var10.q(chat4);
                                                                        g9Var3.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
                                                                        g9Var3.e(chat4, r8Var10);
                                                                        frameLayout.addView(g9Var3, w7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                        org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder2.a;
                                                                        x1Var5.Q0 = -1.0f;
                                                                        x1Var5.V = frameLayout;
                                                                        x1Var5.R = org.telegram.messenger.cd.L0(V ? 2131749010 : 2131749002, null);
                                                                        x1Var5.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, V ? 2131749011 : 2131749003, org.telegram.messenger.h20.p(user4), chat4.title));
                                                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131754210, null), new t(a1Var, 4));
                                                                        alertDialog$Builder2.i(org.telegram.messenger.cd.L0(2131752589, null), null);
                                                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(V ? 2131749014 : 2131749000, null), new t(q1Var, 5));
                                                                        x1Var5.show();
                                                                        View d = x1Var5.d(-1);
                                                                        if (d instanceof TextView) {
                                                                            org.telegram.ui.ActionBar.a7.V((TextView) d, org.telegram.ui.ActionBar.t6.q7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            zrVar2 = zrVar2;
                                                        }
                                                        if (!z26 && !zArr2[0]) {
                                                            z27 = false;
                                                        }
                                                        zrVar2.i(z27);
                                                    }
                                                });
                                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                                k2Var.showDialog(x1Var32);
                                                textView = (TextView) x1Var32.d(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z18 = false;
                                        }
                                        org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(1, parentActivity, p6Var);
                                        c2VarArr[0] = c2Var3;
                                        c2Var3.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                                        if (!z18) {
                                            if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
                                                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131751537, null), "", false, false, false);
                                            } else {
                                                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131751558, null), "", false, false, false);
                                            }
                                            z20 = true;
                                        } else if (z10) {
                                            z20 = true;
                                            c2VarArr[0].e(org.telegram.messenger.cd.a0(null, null, 2131752080, org.telegram.messenger.h20.j(user, true)), "", false, false, false);
                                        } else {
                                            z20 = true;
                                            c2VarArr[0].e(org.telegram.messenger.cd.a0(null, null, 2131751526, org.telegram.messenger.h20.j(user, true)), "", false, false, false);
                                        }
                                        c2VarArr[0].setMultiline(z20);
                                        r8Var3 = r8Var2;
                                        c2VarArr[0].setPadding(!org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f7), !org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(f10) : org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(f7));
                                        e3Var.addView(c2VarArr[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        org.telegram.ui.kp kpVar = new org.telegram.ui.kp(z18, chat, alertDialog$Builder, zArr);
                                        c2VarArr[0].setOnClickListener(new org.telegram.ui.ud(13, zArr, kpVar));
                                        if (z14) {
                                            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var4.c(true, false);
                                            kpVar.run();
                                        }
                                        z19 = z18;
                                        if (user != null) {
                                        }
                                        if (z11) {
                                        }
                                        if (!z11) {
                                        }
                                        final boolean z2422 = z17;
                                        org.telegram.ui.ActionBar.x1 x1Var322 = x1Var;
                                        alertDialog$Builder.k(L0, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.m2
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i10) {
                                                boolean z25 = z2422;
                                                final boolean z26 = z11;
                                                final boolean[] zArr2 = zArr;
                                                final org.telegram.messenger.zr zrVar2 = zrVar;
                                                boolean z27 = true;
                                                if (!z25 && !z26 && !z12) {
                                                    final TLRPC.User user2 = user;
                                                    boolean B = org.telegram.messenger.h20.B(user2);
                                                    final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                                                    final boolean z28 = z10;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z29 = z13;
                                                    final boolean z30 = z15;
                                                    final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                                    if (B) {
                                                        s4.s(k2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, zrVar2, p6Var2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        org.telegram.messenger.hs a04 = org.telegram.messenger.hs.a0(k2Var2.getCurrentAccount());
                                                        a04.a.c(new org.telegram.messenger.lr(a04, user2.id, new org.telegram.messenger.bs() { // from class: org.telegram.ui.Components.g1
                                                            @Override // org.telegram.messenger.bs
                                                            public final void a(int i11) {
                                                                boolean[] zArr3 = zArr2;
                                                                org.telegram.messenger.zr zrVar3 = zrVar2;
                                                                if (i11 >= 50) {
                                                                    s4.s(org.telegram.ui.ActionBar.k2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, zrVar3, p6Var2);
                                                                } else if (zrVar3 != null) {
                                                                    zrVar3.i(zArr3[0]);
                                                                }
                                                            }
                                                        }, 0));
                                                        return;
                                                    }
                                                    if (org.telegram.messenger.w3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final gf.e h = alertDialog$Builder.a.h(-1, true, true);
                                                        h.d();
                                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                        tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.vp.h1(chat3);
                                                        final int i11 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                                        a3.b bVar = new a3.b(1);
                                                        final Context context = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.j20() { // from class: org.telegram.ui.Components.h1
                                                            @Override // org.telegram.messenger.j20
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                gf.e.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                org.telegram.messenger.zr zrVar3 = zrVar2;
                                                                if (user4 == null) {
                                                                    zrVar3.i(z26 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Context context2 = context;
                                                                TLRPC.Chat chat4 = chat3;
                                                                m4.a1 a1Var = new m4.a1(context2, chat4, user4, i11, zrVar3, p6Var2, 6);
                                                                q1 q1Var = new q1(zrVar3, 0);
                                                                org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                                                                if (k2Var3 == null || k2Var3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context3 = k2Var3.getContext();
                                                                TLRPC.User f11 = org.telegram.messenger.d20.i(k2Var3.getCurrentAccount()).f();
                                                                boolean V = org.telegram.messenger.w3.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                g9 g9Var2 = new g9(context3);
                                                                r8 r8Var8 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                r8Var8.r(f11);
                                                                g9Var2.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                                                                g9Var2.e(f11, r8Var8);
                                                                frameLayout.addView(g9Var2, w7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context3);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.d7, k2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                f3 f3Var = new f3(context3);
                                                                r8 r8Var9 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                r8Var9.r(user4);
                                                                f3Var.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                                                                f3Var.e(user4, r8Var9);
                                                                frameLayout.addView(f3Var, w7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                g9 g9Var3 = new g9(context3);
                                                                r8 r8Var10 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                                r8Var10.q(chat4);
                                                                g9Var3.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
                                                                g9Var3.e(chat4, r8Var10);
                                                                frameLayout.addView(g9Var3, w7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder2.a;
                                                                x1Var5.Q0 = -1.0f;
                                                                x1Var5.V = frameLayout;
                                                                x1Var5.R = org.telegram.messenger.cd.L0(V ? 2131749010 : 2131749002, null);
                                                                x1Var5.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, V ? 2131749011 : 2131749003, org.telegram.messenger.h20.p(user4), chat4.title));
                                                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131754210, null), new t(a1Var, 4));
                                                                alertDialog$Builder2.i(org.telegram.messenger.cd.L0(2131752589, null), null);
                                                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(V ? 2131749014 : 2131749000, null), new t(q1Var, 5));
                                                                x1Var5.show();
                                                                View d = x1Var5.d(-1);
                                                                if (d instanceof TextView) {
                                                                    org.telegram.ui.ActionBar.a7.V((TextView) d, org.telegram.ui.ActionBar.t6.q7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    zrVar2 = zrVar2;
                                                }
                                                if (!z26 && !zArr2[0]) {
                                                    z27 = false;
                                                }
                                                zrVar2.i(z27);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        k2Var.showDialog(x1Var322);
                                        textView = (TextView) x1Var322.d(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        x1Var = x1Var2;
                                        r8Var2 = r8Var;
                                    }
                                } else {
                                    x1Var = x1Var2;
                                    r8Var2 = r8Var;
                                    f7 = 10.0f;
                                }
                                f10 = 8.0f;
                                if (z11) {
                                }
                                if (z13) {
                                }
                                if (!z18) {
                                }
                                org.telegram.ui.Cells.c2 c2Var32 = new org.telegram.ui.Cells.c2(1, parentActivity, p6Var);
                                c2VarArr[0] = c2Var32;
                                c2Var32.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                                if (!z18) {
                                }
                                c2VarArr[0].setMultiline(z20);
                                r8Var3 = r8Var2;
                                c2VarArr[0].setPadding(!org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f7), !org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(f10) : org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(f7));
                                e3Var.addView(c2VarArr[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                org.telegram.ui.kp kpVar2 = new org.telegram.ui.kp(z18, chat, alertDialog$Builder, zArr);
                                c2VarArr[0].setOnClickListener(new org.telegram.ui.ud(13, zArr, kpVar2));
                                if (z14) {
                                }
                                z19 = z18;
                                if (user != null) {
                                }
                                if (z11) {
                                }
                                if (!z11) {
                                }
                                final boolean z24222 = z17;
                                org.telegram.ui.ActionBar.x1 x1Var3222 = x1Var;
                                alertDialog$Builder.k(L0, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.m2
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i10) {
                                        boolean z25 = z24222;
                                        final boolean z26 = z11;
                                        final boolean[] zArr2 = zArr;
                                        final org.telegram.messenger.zr zrVar2 = zrVar;
                                        boolean z27 = true;
                                        if (!z25 && !z26 && !z12) {
                                            final TLRPC.User user2 = user;
                                            boolean B = org.telegram.messenger.h20.B(user2);
                                            final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                                            final boolean z28 = z10;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z29 = z13;
                                            final boolean z30 = z15;
                                            final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                            if (B) {
                                                s4.s(k2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, zrVar2, p6Var2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                org.telegram.messenger.hs a04 = org.telegram.messenger.hs.a0(k2Var2.getCurrentAccount());
                                                a04.a.c(new org.telegram.messenger.lr(a04, user2.id, new org.telegram.messenger.bs() { // from class: org.telegram.ui.Components.g1
                                                    @Override // org.telegram.messenger.bs
                                                    public final void a(int i11) {
                                                        boolean[] zArr3 = zArr2;
                                                        org.telegram.messenger.zr zrVar3 = zrVar2;
                                                        if (i11 >= 50) {
                                                            s4.s(org.telegram.ui.ActionBar.k2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, zrVar3, p6Var2);
                                                        } else if (zrVar3 != null) {
                                                            zrVar3.i(zArr3[0]);
                                                        }
                                                    }
                                                }, 0));
                                                return;
                                            }
                                            if (org.telegram.messenger.w3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final gf.e h = alertDialog$Builder.a.h(-1, true, true);
                                                h.d();
                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.vp.h1(chat3);
                                                final int i11 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                                a3.b bVar = new a3.b(1);
                                                final Context context = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.j20() { // from class: org.telegram.ui.Components.h1
                                                    @Override // org.telegram.messenger.j20
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        gf.e.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        org.telegram.messenger.zr zrVar3 = zrVar2;
                                                        if (user4 == null) {
                                                            zrVar3.i(z26 || zArr2[0]);
                                                            return;
                                                        }
                                                        Context context2 = context;
                                                        TLRPC.Chat chat4 = chat3;
                                                        m4.a1 a1Var = new m4.a1(context2, chat4, user4, i11, zrVar3, p6Var2, 6);
                                                        q1 q1Var = new q1(zrVar3, 0);
                                                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                                                        if (k2Var3 == null || k2Var3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context3 = k2Var3.getContext();
                                                        TLRPC.User f11 = org.telegram.messenger.d20.i(k2Var3.getCurrentAccount()).f();
                                                        boolean V = org.telegram.messenger.w3.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        g9 g9Var2 = new g9(context3);
                                                        r8 r8Var8 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                        r8Var8.r(f11);
                                                        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                                                        g9Var2.e(f11, r8Var8);
                                                        frameLayout.addView(g9Var2, w7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context3);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.d7, k2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        f3 f3Var = new f3(context3);
                                                        r8 r8Var9 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                        r8Var9.r(user4);
                                                        f3Var.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                                                        f3Var.e(user4, r8Var9);
                                                        frameLayout.addView(f3Var, w7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        g9 g9Var3 = new g9(context3);
                                                        r8 r8Var10 = new r8((org.telegram.ui.ActionBar.p6) null);
                                                        r8Var10.q(chat4);
                                                        g9Var3.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
                                                        g9Var3.e(chat4, r8Var10);
                                                        frameLayout.addView(g9Var3, w7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                        org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder2.a;
                                                        x1Var5.Q0 = -1.0f;
                                                        x1Var5.V = frameLayout;
                                                        x1Var5.R = org.telegram.messenger.cd.L0(V ? 2131749010 : 2131749002, null);
                                                        x1Var5.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, V ? 2131749011 : 2131749003, org.telegram.messenger.h20.p(user4), chat4.title));
                                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131754210, null), new t(a1Var, 4));
                                                        alertDialog$Builder2.i(org.telegram.messenger.cd.L0(2131752589, null), null);
                                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(V ? 2131749014 : 2131749000, null), new t(q1Var, 5));
                                                        x1Var5.show();
                                                        View d = x1Var5.d(-1);
                                                        if (d instanceof TextView) {
                                                            org.telegram.ui.ActionBar.a7.V((TextView) d, org.telegram.ui.ActionBar.t6.q7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            zrVar2 = zrVar2;
                                        }
                                        if (!z26 && !zArr2[0]) {
                                            z27 = false;
                                        }
                                        zrVar2.i(z27);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                k2Var.showDialog(x1Var3222);
                                textView = (TextView) x1Var3222.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static void s0(int i10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
                                if (i10 == 0 || k2Var == null || k2Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var);
                                String L0 = org.telegram.messenger.cd.L0(2131743941, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                if (i10 == 1) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751088, null);
                                } else if (i10 == 2) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751100, null);
                                } else if (i10 == 3) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751094, null);
                                } else if (i10 == 4) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751087, null);
                                } else if (i10 == 5) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751099, null);
                                } else if (i10 == 6) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751093, null);
                                } else if (i10 == 7) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751091, null);
                                } else if (i10 == 8) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751092, null);
                                } else if (i10 == 9) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751083, null);
                                } else if (i10 == 10) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751095, null);
                                } else if (i10 == 11) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751084, null);
                                } else if (i10 == 12) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751096, null);
                                } else if (i10 == 13) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751081, null);
                                } else if (i10 == 14) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751082, null);
                                } else if (i10 == 15) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751089, null);
                                } else if (i10 == 16) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751090, null);
                                } else if (i10 == 17) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751101, null);
                                } else if (i10 == 18) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751102, null);
                                } else if (i10 == 19) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751097, null);
                                } else if (i10 == 20) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751098, null);
                                } else if (i10 == 21) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751085, null);
                                } else if (i10 == 22) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751086, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                k2Var.showDialog(x1Var, true, null);
                            }

                            public static org.telegram.ui.ActionBar.x1 t(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
                                int i11;
                                SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).e7;
                                final String v = org.telegram.messenger.ot.v(j10, j11, false);
                                if (j10 != 0) {
                                    StringBuilder sb2 = new StringBuilder("color_");
                                    sb2.append(v);
                                    i11 = sharedPreferences.contains(sb2.toString()) ? org.telegram.messenger.m5.c("color_", v, sharedPreferences, -16776961) : org.telegram.messenger.o5.z(j10) ? sharedPreferences.getInt("GroupLed", -16776961) : sharedPreferences.getInt("MessagesLed", -16776961);
                                } else {
                                    i11 = i10 == 1 ? sharedPreferences.getInt("MessagesLed", -16776961) : i10 == 0 ? sharedPreferences.getInt("GroupLed", -16776961) : i10 == 3 ? sharedPreferences.getInt("StoriesLed", -16776961) : (i10 == 5 || i10 == 4) ? sharedPreferences.getInt("ReactionsLed", -16776961) : sharedPreferences.getInt("ChannelLed", -16776961);
                                }
                                LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
                                String[] strArr = {org.telegram.messenger.cd.L0(2131752012, null), org.telegram.messenger.cd.L0(2131752017, null), org.telegram.messenger.cd.L0(2131752006, null), org.telegram.messenger.cd.L0(2131752018, null), org.telegram.messenger.cd.L0(2131752019, null), org.telegram.messenger.cd.L0(2131752020, null), org.telegram.messenger.cd.L0(2131752008, null), org.telegram.messenger.cd.L0(2131752013, null), org.telegram.messenger.cd.L0(2131752007, null)};
                                final int[] iArr = {i11};
                                for (int i12 = 0; i12 < 9; i12++) {
                                    org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
                                    n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                                    n6Var.setTag(Integer.valueOf(i12));
                                    int i13 = org.telegram.ui.Cells.v8.e[i12];
                                    n6Var.a(i13, i13);
                                    n6Var.b(strArr[i12], i11 == org.telegram.ui.Cells.v8.f[i12]);
                                    e.addView(n6Var);
                                    n6Var.setOnClickListener(new m1(e, iArr));
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
                                String L0 = org.telegram.messenger.cd.L0(2131748999, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                alertDialog$Builder.o(e);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745567, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.n2
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                                        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).e7.edit();
                                        long j12 = j10;
                                        int[] iArr2 = iArr;
                                        if (j12 != 0) {
                                            edit.putInt(sc.e.h("color_", v), iArr2[0]);
                                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).l(j12, j11);
                                        } else {
                                            int i15 = i10;
                                            if (i15 == 1) {
                                                edit.putInt("MessagesLed", iArr2[0]);
                                            } else if (i15 == 0) {
                                                edit.putInt("GroupLed", iArr2[0]);
                                            } else if (i15 == 3) {
                                                edit.putInt("StoriesLed", iArr2[0]);
                                            } else if (i15 == 5 || i15 == 4) {
                                                edit.putInt("ReactionLed", iArr2[0]);
                                            } else {
                                                edit.putInt("ChannelLed", iArr2[0]);
                                            }
                                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).m(i15);
                                        }
                                        edit.commit();
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                        }
                                    }
                                });
                                alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131748998, null), new j2.d(j10, i10, runnable, 5));
                                if (j10 != 0) {
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751601, null), new f2(2, v, runnable));
                                }
                                return x1Var;
                            }

                            public static org.telegram.ui.ActionBar.x1 t0(org.telegram.ui.ActionBar.k2 k2Var, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
                                if (k2Var == null) {
                                    k2Var = LaunchActivity.T();
                                }
                                if (str2 == null || k2Var == null || k2Var.getParentActivity() == null) {
                                    return null;
                                }
                                org.telegram.ui.ActionBar.x1 x1Var = N(k2Var.getParentActivity(), str, str2, null, null, p6Var).a;
                                k2Var.showDialog(x1Var);
                                return x1Var;
                            }

                            public static void u(org.telegram.ui.ActionBar.k2 k2Var, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
                                String L0 = org.telegram.messenger.cd.L0(2131751788, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                x1Var.T = org.telegram.messenger.cd.a0("ContactNotRegistered", null, 2131751789, org.telegram.messenger.i5.m(0, str, str2));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749184, null), new ng.d(str3, k2Var));
                                k2Var.showDialog(x1Var);
                            }

                            public static org.telegram.ui.ActionBar.x1 u0(org.telegram.ui.ActionBar.k2 k2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
                                TextView textView;
                                org.telegram.ui.ActionBar.x1 O = O(k2Var.getContext(), k2Var.getResourceProvider(), str, charSequence, str2, runnable);
                                k2Var.showDialog(O);
                                if (z10 && (textView = (TextView) O.d(-1)) != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                }
                                return O;
                            }

                            public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.bs bsVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i10 = org.telegram.ui.ActionBar.t6.L5;
                                final int i11 = 0;
                                alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
                                alertDialog$Builder.n(i10, null);
                                alertDialog$Builder.a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751774, null));
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751773, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.q2
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i12) {
                                        switch (i11) {
                                            case 0:
                                                bsVar.a(1);
                                                break;
                                            default:
                                                bsVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                final int i12 = 1;
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.q2
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i122) {
                                        switch (i12) {
                                            case 0:
                                                bsVar.a(1);
                                                break;
                                            default:
                                                bsVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(String str, org.telegram.ui.ActionBar.k2 k2Var) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((k2Var == null || k2Var.getParentActivity() == null) ? org.telegram.messenger.w0.b : k2Var.getParentActivity(), str, 1).show();
                            }

                            public static AlertDialog$Builder w(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, ag.b0 b0Var) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final ac0 ac0Var = new ac0(context, null);
                                final ac0 ac0Var2 = new ac0(context, null);
                                final ac0 ac0Var3 = new ac0(context, null);
                                linearLayout.addView(ac0Var2, w7.b6.l(0.3f, 0, -2));
                                final int i16 = 0;
                                ac0Var2.setOnScrollListener(new xb0() { // from class: org.telegram.ui.Components.r1
                                    @Override // org.telegram.ui.Components.xb0
                                    public final void i(int i17) {
                                        switch (i16) {
                                            case 0:
                                                if (z10 && i17 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i17 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i17 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                ac0Var.setMinValue(0);
                                ac0Var.setMaxValue(11);
                                linearLayout.addView(ac0Var, w7.b6.l(0.3f, 0, -2));
                                ac0Var.setFormatter(new org.telegram.ui.Cells.m5(27));
                                ac0Var.setOnValueChangedListener(new s1(ac0Var2, ac0Var, ac0Var3, 0));
                                final int i17 = 1;
                                ac0Var.setOnScrollListener(new xb0() { // from class: org.telegram.ui.Components.r1
                                    @Override // org.telegram.ui.Components.xb0
                                    public final void i(int i172) {
                                        switch (i17) {
                                            case 0:
                                                if (z10 && i172 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i172 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i172 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i18 = calendar.get(1);
                                ac0Var3.setMinValue(i10 + i18);
                                ac0Var3.setMaxValue(i11 + i18);
                                ac0Var3.setValue(i18 + i12);
                                linearLayout.addView(ac0Var3, w7.b6.l(0.4f, 0, -2));
                                ac0Var3.setOnValueChangedListener(new s1(ac0Var2, ac0Var, ac0Var3, 1));
                                final int i19 = 2;
                                ac0Var3.setOnScrollListener(new xb0() { // from class: org.telegram.ui.Components.r1
                                    @Override // org.telegram.ui.Components.xb0
                                    public final void i(int i172) {
                                        switch (i19) {
                                            case 0:
                                                if (z10 && i172 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i172 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i172 == 0) {
                                                    s4.d(ac0Var2, ac0Var, ac0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                x0(ac0Var2, ac0Var, ac0Var3);
                                if (z10) {
                                    d(ac0Var2, ac0Var, ac0Var3);
                                }
                                if (i13 != -1) {
                                    ac0Var2.setValue(i13);
                                    ac0Var.setValue(i14);
                                    ac0Var3.setValue(i15);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.R = str;
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745567, null), new org.telegram.ui.tm(z10, ac0Var2, ac0Var, ac0Var3, b0Var));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                return alertDialog$Builder;
                            }

                            public static org.telegram.ui.ActionBar.x1 w0(Context context, String str, boolean z10) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                x1Var.T = str;
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                if (z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131743847, null), new k0(context, 2));
                                }
                                return alertDialog$Builder.p();
                            }

                            public static void x(Context context, String str, String str2, long j10, q4 q4Var) {
                                if (context == null) {
                                    return;
                                }
                                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false);
                                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
                                org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xj, false);
                                org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bj, false);
                                org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false);
                                org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
                                org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false);
                                int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
                                int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
                                int x06 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
                                l2.f fVar = new l2.f(context, (org.telegram.ui.ActionBar.p6) null);
                                ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
                                ac0 ac0Var = new ac0(context, null);
                                ac0Var.setTextColor(x02);
                                ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                                ac0Var.setItemCount(5);
                                s3 s3Var = new s3(context, null);
                                s3Var.setItemCount(5);
                                s3Var.setTextColor(x02);
                                s3Var.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                                t3 t3Var = new t3(context, null);
                                t3Var.setItemCount(5);
                                t3Var.setTextColor(x02);
                                t3Var.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
                                ac0 ac0Var2 = ac0Var;
                                n3 n3Var = new n3(context, ac0Var2, s3Var, t3Var, 2);
                                n3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                n3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                textView.setTextColor(x02);
                                textView.setTextSize(1, 20.0f);
                                textView.setTypeface(org.telegram.messenger.i0.o());
                                frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                ag.j3 j3Var = new ag.j3(context, 12);
                                linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                                ac0Var2.setMinValue(0);
                                ac0Var2.setMaxValue(365);
                                ac0Var2.setWrapSelectorWheel(false);
                                ac0Var2.setFormatter(new v1(0));
                                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(ac0Var2, s3Var, t3Var, 12);
                                ac0Var2.setOnValueChangedListener(aVar);
                                s3Var.setMinValue(0);
                                s3Var.setMaxValue(23);
                                linearLayout.addView(s3Var, w7.b6.l(0.2f, 0, org.telegram.messenger.zs.t4));
                                s3Var.setFormatter(new v1(1));
                                s3Var.setOnValueChangedListener(aVar);
                                t3Var.setMinValue(0);
                                t3Var.setMaxValue(59);
                                t3Var.setValue(0);
                                t3Var.setFormatter(new v1(2));
                                linearLayout.addView(t3Var, w7.b6.l(0.3f, 0, org.telegram.messenger.zs.t4));
                                t3Var.setOnValueChangedListener(aVar);
                                if (j10 > 0 && j10 != 2147483646) {
                                    long j11 = j10 * 1000;
                                    calendar.setTimeInMillis(System.currentTimeMillis());
                                    calendar.set(12, 0);
                                    calendar.set(13, 0);
                                    calendar.set(14, 0);
                                    calendar.set(11, 0);
                                    int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                                    calendar.setTimeInMillis(j11);
                                    if (timeInMillis >= 0) {
                                        t3Var.setValue(calendar.get(12));
                                        s3Var.setValue(calendar.get(11));
                                        ac0Var2 = ac0Var2;
                                        ac0Var2.setValue(timeInMillis);
                                    } else {
                                        ac0Var2 = ac0Var2;
                                    }
                                }
                                g(null, null, 0L, 0L, 0, ac0Var2, s3Var, t3Var);
                                j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                                j3Var.setGravity(17);
                                j3Var.setTextColor(x04);
                                j3Var.setTextSize(1, 14.0f);
                                j3Var.setTypeface(org.telegram.messenger.i0.o());
                                int L = org.telegram.messenger.i0.L(8.0f);
                                j3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x05, x06, x06));
                                j3Var.setText(str2);
                                n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                j3Var.setOnClickListener(new mg.f(ac0Var2, (ac0) s3Var, (ac0) t3Var, calendar, (Object) q4Var, fVar, 2));
                                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.b;
                                z2Var.N = n3Var;
                                z2Var.show();
                                z2Var.v0(x03);
                                z2Var.P(x03);
                            }

                            public static void x0(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, ac0Var2.getValue());
                                calendar.set(1, ac0Var3.getValue());
                                ac0Var.setMinValue(1);
                                ac0Var.setMaxValue(calendar.getActualMaximum(5));
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:408:0x0219, code lost:
                            
                                if (java.lang.Math.abs(r9 - r4.k.date) > 86400) goto L97;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:145:0x06d4  */
                            /* JADX WARN: Removed duplicated region for block: B:149:0x0722  */
                            /* JADX WARN: Removed duplicated region for block: B:152:0x07fb  */
                            /* JADX WARN: Removed duplicated region for block: B:163:0x089c  */
                            /* JADX WARN: Removed duplicated region for block: B:167:0x096d  */
                            /* JADX WARN: Removed duplicated region for block: B:170:0x097b  */
                            /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:173:0x08da  */
                            /* JADX WARN: Removed duplicated region for block: B:186:0x0838  */
                            /* JADX WARN: Removed duplicated region for block: B:214:0x073a  */
                            /* JADX WARN: Removed duplicated region for block: B:249:0x06fc  */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[ADDED_TO_REGION] */
                            /* JADX WARN: Type inference failed for: r12v12 */
                            /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.String, org.telegram.ui.ActionBar.p6, org.telegram.ui.ActionBar.u1] */
                            /* JADX WARN: Type inference failed for: r12v15 */
                            /* JADX WARN: Type inference failed for: r12v25 */
                            /* JADX WARN: Type inference failed for: r12v26 */
                            /* JADX WARN: Type inference failed for: r2v13 */
                            /* JADX WARN: Type inference failed for: r2v22 */
                            /* JADX WARN: Type inference failed for: r2v60 */
                            /* JADX WARN: Type inference failed for: r2v61 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void y(final org.telegram.ui.ActionBar.k2 k2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j10, final org.telegram.messenger.jj jjVar, final SparseArray[] sparseArrayArr, final org.telegram.messenger.ej ejVar, final int i10, final int i11, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.p6 p6Var) {
                                Activity parentActivity;
                                Runnable runnable3;
                                final int i12;
                                long j11;
                                boolean z10;
                                boolean z11;
                                boolean z12;
                                boolean z13;
                                int i13;
                                int i14;
                                boolean z14;
                                int i15;
                                int i16;
                                boolean z15;
                                boolean z16;
                                boolean z17;
                                org.telegram.ui.Cells.c2 c2Var;
                                String str;
                                int i17;
                                TLRPC.MessageAction messageAction;
                                AlertDialog$Builder alertDialog$Builder;
                                final boolean z18;
                                org.telegram.ui.ActionBar.x1 x1Var;
                                int i18;
                                String str2;
                                String str3;
                                boolean z19;
                                ?? r12;
                                AlertDialog$Builder alertDialog$Builder2;
                                TextView textView;
                                TextView textView2;
                                AlertDialog$Builder alertDialog$Builder3;
                                int i19;
                                int i20;
                                boolean z20;
                                TLRPC.MessageAction messageAction2;
                                ArrayList arrayList;
                                int i21;
                                final int i22;
                                final int i23;
                                int i24;
                                int i25;
                                TLRPC.Message message;
                                org.telegram.messenger.jj jjVar2 = jjVar;
                                boolean z21 = i11 == 1;
                                boolean z22 = i11 == 3;
                                if (k2Var == null) {
                                    return;
                                }
                                if ((user == null && chat == null && encryptedChat == null) || (parentActivity = k2Var.getParentActivity()) == null) {
                                    return;
                                }
                                int currentAccount = k2Var.getCurrentAccount();
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, parentActivity, p6Var);
                                float f7 = runnable2 != null ? 0.5f : 0.6f;
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder4.a;
                                x1Var2.S0 = f7;
                                int size = ejVar != null ? ejVar.d.size() : jjVar2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                long F = encryptedChat != null ? org.telegram.messenger.o5.F(encryptedChat.id) : user != null ? user.id : -chat.id;
                                if (z21) {
                                    if (jjVar2 == null || (message = jjVar2.k) == null) {
                                        i21 = currentAccount;
                                    } else {
                                        i21 = currentAccount;
                                        i25 = message.schedule_repeat_period;
                                        if (i25 > 0) {
                                            i24 = message.date;
                                            i23 = i25;
                                            i22 = i24;
                                            if (i22 <= 0 && i23 > 0) {
                                                String a02 = org.telegram.messenger.cd.a0(null, null, 2131748532, Integer.valueOf(i23));
                                                if (i23 == 31536000) {
                                                    a02 = org.telegram.messenger.cd.L0(2131748528, null);
                                                } else if (i23 >= 2592000) {
                                                    a02 = org.telegram.messenger.cd.G(i23 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                                } else if (i23 >= 604800) {
                                                    a02 = org.telegram.messenger.cd.G(i23 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                                } else if (i23 >= 86400) {
                                                    a02 = org.telegram.messenger.cd.G(i23 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                                }
                                                String str4 = a02;
                                                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(0, parentActivity, p6Var);
                                                String L0 = org.telegram.messenger.cd.L0(2131748526, null);
                                                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder5.a;
                                                x1Var3.R = L0;
                                                x1Var3.T = org.telegram.messenger.cd.L0(2131748527, null);
                                                final int i26 = i21;
                                                alertDialog$Builder5.h(str4, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.c3
                                                    @Override // org.telegram.ui.ActionBar.u1
                                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i27) {
                                                        org.telegram.messenger.ej ejVar2 = org.telegram.messenger.ej.this;
                                                        int i28 = i26;
                                                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                                                        int i29 = i22;
                                                        int i30 = i23;
                                                        if (ejVar2 != null) {
                                                            ArrayList arrayList2 = ejVar2.d;
                                                            if (!arrayList2.isEmpty()) {
                                                                org.telegram.messenger.qz.C(i28).u((org.telegram.messenger.jj) arrayList2.get(0), k2Var2, i29 + i30, i30);
                                                                return;
                                                            }
                                                        }
                                                        org.telegram.messenger.qz.C(i28).u(jjVar, k2Var2, i29 + i30, i30);
                                                    }
                                                });
                                                final long j12 = F;
                                                final boolean z23 = z22;
                                                alertDialog$Builder5.i(org.telegram.messenger.cd.L0(2131748539, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.n0
                                                    @Override // org.telegram.ui.ActionBar.u1
                                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i27) {
                                                        SparseArray[] sparseArrayArr2;
                                                        ArrayList arrayList2;
                                                        int i28;
                                                        long j13;
                                                        ArrayList arrayList3;
                                                        TLRPC.Peer peer;
                                                        int i29;
                                                        long j14;
                                                        ArrayList arrayList4;
                                                        boolean z24 = z23;
                                                        int i30 = i26;
                                                        long e = z24 ? org.telegram.messenger.d20.i(i30).e() : j12;
                                                        org.telegram.messenger.jj jjVar3 = jjVar;
                                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                        long j15 = j10;
                                                        int i31 = i10;
                                                        int i32 = i11;
                                                        ArrayList arrayList5 = null;
                                                        if (jjVar3 != null) {
                                                            ArrayList arrayList6 = new ArrayList();
                                                            org.telegram.messenger.ej ejVar2 = ejVar;
                                                            if (ejVar2 != null) {
                                                                ArrayList arrayList7 = ejVar2.d;
                                                                int i33 = 0;
                                                                while (i33 < arrayList7.size()) {
                                                                    org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) arrayList7.get(i33);
                                                                    arrayList6.add(Integer.valueOf(jjVar4.f1()));
                                                                    if (encryptedChat2 != null) {
                                                                        arrayList4 = arrayList6;
                                                                        if (jjVar4.k.random_id == 0 || jjVar4.D == 10) {
                                                                            i29 = i30;
                                                                            j14 = e;
                                                                        } else {
                                                                            if (arrayList5 == null) {
                                                                                arrayList5 = new ArrayList();
                                                                            }
                                                                            ArrayList arrayList8 = arrayList5;
                                                                            i29 = i30;
                                                                            j14 = e;
                                                                            arrayList8.add(Long.valueOf(jjVar4.k.random_id));
                                                                            arrayList5 = arrayList8;
                                                                        }
                                                                    } else {
                                                                        i29 = i30;
                                                                        j14 = e;
                                                                        arrayList4 = arrayList6;
                                                                    }
                                                                    i33++;
                                                                    arrayList6 = arrayList4;
                                                                    i30 = i29;
                                                                    e = j14;
                                                                }
                                                                i28 = i30;
                                                                j13 = e;
                                                            } else {
                                                                i28 = i30;
                                                                j13 = e;
                                                                arrayList6.add(Integer.valueOf(jjVar3.f1()));
                                                                if (encryptedChat2 != null && jjVar3.k.random_id != 0 && jjVar3.D != 10) {
                                                                    ArrayList arrayList9 = new ArrayList();
                                                                    arrayList9.add(Long.valueOf(jjVar3.k.random_id));
                                                                    arrayList3 = arrayList9;
                                                                    org.telegram.messenger.vp.r1(i28).Z(arrayList6, arrayList3, encryptedChat2, (j15 == 0 && (peer = jjVar3.k.peer_id) != null && peer.chat_id == (-j15)) ? j15 : j13, i31, true, i32);
                                                                }
                                                            }
                                                            arrayList3 = arrayList5;
                                                            org.telegram.messenger.vp.r1(i28).Z(arrayList6, arrayList3, encryptedChat2, (j15 == 0 && (peer = jjVar3.k.peer_id) != null && peer.chat_id == (-j15)) ? j15 : j13, i31, true, i32);
                                                        } else {
                                                            long j16 = e;
                                                            int i34 = 1;
                                                            while (i34 >= 0) {
                                                                ArrayList arrayList10 = new ArrayList();
                                                                int i35 = 0;
                                                                while (true) {
                                                                    sparseArrayArr2 = sparseArrayArr;
                                                                    if (i35 >= sparseArrayArr2[i34].size()) {
                                                                        break;
                                                                    }
                                                                    arrayList10.add(Integer.valueOf(sparseArrayArr2[i34].keyAt(i35)));
                                                                    i35++;
                                                                }
                                                                if (encryptedChat2 != null) {
                                                                    ArrayList arrayList11 = new ArrayList();
                                                                    for (int i36 = 0; i36 < sparseArrayArr2[i34].size(); i36++) {
                                                                        org.telegram.messenger.jj jjVar5 = (org.telegram.messenger.jj) sparseArrayArr2[i34].valueAt(i36);
                                                                        long j17 = jjVar5.k.random_id;
                                                                        if (j17 != 0 && jjVar5.D != 10) {
                                                                            arrayList11.add(Long.valueOf(j17));
                                                                        }
                                                                    }
                                                                    arrayList2 = arrayList11;
                                                                } else {
                                                                    arrayList2 = null;
                                                                }
                                                                org.telegram.messenger.vp.r1(i30).Z(arrayList10, arrayList2, encryptedChat2, (i34 != 1 || j15 == 0) ? j16 : j15, i31, true, i32);
                                                                sparseArrayArr2[i34].clear();
                                                                i34--;
                                                            }
                                                        }
                                                        Runnable runnable4 = runnable;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                        }
                                                    }
                                                });
                                                alertDialog$Builder5.k(org.telegram.messenger.cd.L0(2131752589, null), null);
                                                alertDialog$Builder5.d(-2);
                                                alertDialog$Builder5.d(-3);
                                                x1Var3.N = new m0(1, runnable2);
                                                alertDialog$Builder5.p();
                                                return;
                                            }
                                            jjVar2 = jjVar;
                                            runnable3 = runnable2;
                                            i12 = i21;
                                            j11 = F;
                                            z10 = z22;
                                        }
                                    }
                                    if (ejVar != null) {
                                        ArrayList arrayList2 = ejVar.d;
                                        if (!arrayList2.isEmpty() && arrayList2.get(0) != null && ((org.telegram.messenger.jj) arrayList2.get(0)).k != null && ((org.telegram.messenger.jj) arrayList2.get(0)).k.schedule_repeat_period > 0) {
                                            i24 = ((org.telegram.messenger.jj) arrayList2.get(0)).k.date;
                                            i25 = ((org.telegram.messenger.jj) arrayList2.get(0)).k.schedule_repeat_period;
                                            i23 = i25;
                                            i22 = i24;
                                            if (i22 <= 0) {
                                            }
                                            jjVar2 = jjVar;
                                            runnable3 = runnable2;
                                            i12 = i21;
                                            j11 = F;
                                            z10 = z22;
                                        }
                                    }
                                    i22 = 0;
                                    i23 = 0;
                                    if (i22 <= 0) {
                                    }
                                    jjVar2 = jjVar;
                                    runnable3 = runnable2;
                                    i12 = i21;
                                    j11 = F;
                                    z10 = z22;
                                } else {
                                    runnable3 = runnable2;
                                    i12 = currentAccount;
                                    j11 = F;
                                    z10 = z22;
                                }
                                int currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
                                org.telegram.messenger.vp.r1(i12).y7.i.a(TimeUnit.SECONDS);
                                if (jjVar2 != null) {
                                    z13 = !jjVar2.T2() || Math.abs(currentTime - jjVar2.k.date) > 86400;
                                    if (jjVar2.Q3()) {
                                        TLRPC.Message message2 = jjVar2.k;
                                        boolean z24 = message2.paid_suggested_post_stars;
                                        z12 = message2.paid_suggested_post_ton;
                                        z11 = z24;
                                    } else {
                                        z11 = false;
                                        z12 = false;
                                    }
                                } else {
                                    int i27 = 0;
                                    z11 = false;
                                    z12 = false;
                                    boolean z25 = false;
                                    while (i27 < 2) {
                                        int i28 = 0;
                                        while (true) {
                                            i13 = i27;
                                            if (i28 < sparseArrayArr[i27].size()) {
                                                org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) sparseArrayArr[i13].valueAt(i28);
                                                if (jjVar3.T2()) {
                                                    i14 = i28;
                                                } else {
                                                    i14 = i28;
                                                }
                                                z25 = true;
                                                if (jjVar3.Q3()) {
                                                    TLRPC.Message message3 = jjVar3.k;
                                                    z11 |= message3.paid_suggested_post_stars;
                                                    z12 |= message3.paid_suggested_post_ton;
                                                }
                                                i28 = i14 + 1;
                                                i27 = i13;
                                            }
                                        }
                                        i27 = i13 + 1;
                                    }
                                    z13 = z25;
                                }
                                if (ejVar != null) {
                                    ArrayList arrayList3 = ejVar.d;
                                    z14 = z13;
                                    int i29 = 0;
                                    while (i29 < arrayList3.size()) {
                                        org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) arrayList3.get(i29);
                                        if (jjVar4.Q3()) {
                                            TLRPC.Message message4 = jjVar4.k;
                                            arrayList = arrayList3;
                                            z11 = message4.paid_suggested_post_stars | z11;
                                            z12 = message4.paid_suggested_post_ton | z12;
                                        } else {
                                            arrayList = arrayList3;
                                        }
                                        i29++;
                                        arrayList3 = arrayList;
                                    }
                                } else {
                                    z14 = z13;
                                }
                                boolean z26 = z12;
                                boolean z27 = z11;
                                final boolean[] zArr = new boolean[1];
                                boolean z28 = user != null && org.telegram.messenger.vp.r1(i12).c3;
                                int i30 = user != null ? org.telegram.messenger.vp.r1(i12).b3 : org.telegram.messenger.vp.r1(i12).a3;
                                boolean z29 = encryptedChat == null && user != null && z28 && i30 == Integer.MAX_VALUE;
                                if (chat == null || !chat.megagroup || z21 || z10) {
                                    AlertDialog$Builder alertDialog$Builder6 = alertDialog$Builder4;
                                    i15 = i12;
                                    if (!z21 && !z10 && !org.telegram.messenger.w3.T(chat) && encryptedChat == null) {
                                        if ((user == null || user.id == org.telegram.messenger.d20.i(i15).e() || (user.bot && !user.support)) && chat == null) {
                                            i16 = 0;
                                            z16 = false;
                                        } else if (jjVar2 != null) {
                                            i16 = (jjVar2.n4() || !((messageAction = jjVar2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(jjVar2.N3() || z28 || org.telegram.messenger.w3.N(chat)) || currentTime - jjVar2.k.date > i30)) ? 0 : 1;
                                            z16 = !jjVar2.N3();
                                        } else {
                                            int i31 = 1;
                                            boolean z30 = false;
                                            int i32 = 0;
                                            while (i31 >= 0) {
                                                boolean z31 = z28;
                                                int i33 = 0;
                                                while (i33 < sparseArrayArr[i31].size()) {
                                                    org.telegram.messenger.jj jjVar5 = (org.telegram.messenger.jj) sparseArrayArr[i31].valueAt(i33);
                                                    int i34 = i33;
                                                    TLRPC.MessageAction messageAction3 = jjVar5.k.action;
                                                    int i35 = i31;
                                                    if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((jjVar5.N3() || z31 || (chat != null && org.telegram.messenger.w3.w(2, chat))) && currentTime - jjVar5.k.date <= i30)) {
                                                        i32++;
                                                        if (!z30 && !jjVar5.N3()) {
                                                            z30 = true;
                                                        }
                                                    }
                                                    i33 = i34 + 1;
                                                    i31 = i35;
                                                }
                                                i31--;
                                                z28 = z31;
                                            }
                                            z16 = z30;
                                            i16 = i32;
                                        }
                                        if (i16 <= 0 || !z14 || (user != null && org.telegram.messenger.h20.x(user))) {
                                            z17 = z16;
                                            z15 = false;
                                            alertDialog$Builder = alertDialog$Builder6;
                                        } else {
                                            FrameLayout frameLayout = new FrameLayout(parentActivity);
                                            org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(1, parentActivity, p6Var);
                                            c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                            if (z29) {
                                                c2Var = c2Var2;
                                                c2Var.e(org.telegram.messenger.cd.a0("DeleteMessagesOptionAlso", null, 2131751526, org.telegram.messenger.h20.j(user, true)), "", false, false, false);
                                            } else {
                                                c2Var = c2Var2;
                                                if (chat == null) {
                                                    str = null;
                                                    i17 = 2131751527;
                                                } else if (z16 || i16 == size) {
                                                    c2Var.e(org.telegram.messenger.cd.L0(2131751541, null), "", false, false, false);
                                                } else {
                                                    i17 = 2131751527;
                                                    str = null;
                                                }
                                                c2Var.e(org.telegram.messenger.cd.L0(i17, str), "", false, false, false);
                                            }
                                            org.telegram.ui.Cells.c2 c2Var3 = c2Var;
                                            c2Var3.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                                            frameLayout.addView(c2Var3, w7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                            c2Var3.setOnClickListener(new x0(5, zArr));
                                            alertDialog$Builder6.o(frameLayout);
                                            x1Var2.G = 9;
                                            z17 = z16;
                                            z15 = true;
                                            alertDialog$Builder = alertDialog$Builder6;
                                        }
                                        int i36 = i16;
                                        AlertDialog$Builder alertDialog$Builder7 = alertDialog$Builder;
                                        z18 = z10;
                                        final int i37 = i15;
                                        final long j13 = j11;
                                        int i38 = size;
                                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.l0
                                            /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                            /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                            /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
                                            /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
                                            /* JADX WARN: Type inference failed for: r3v17 */
                                            /* JADX WARN: Type inference failed for: r3v28 */
                                            @Override // org.telegram.ui.ActionBar.u1
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i39) {
                                                SparseArray[] sparseArrayArr2;
                                                ArrayList arrayList4;
                                                int i40;
                                                long j14;
                                                char c10;
                                                ArrayList arrayList5;
                                                char c11;
                                                ArrayList arrayList6;
                                                long j15;
                                                int i41;
                                                int size2;
                                                int i42;
                                                long j16;
                                                TLRPC.Peer peer;
                                                long j17;
                                                boolean z32 = z18;
                                                int i43 = i37;
                                                long e = z32 ? org.telegram.messenger.d20.i(i43).e() : j13;
                                                org.telegram.messenger.jj jjVar6 = jjVar;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j18 = j10;
                                                int i44 = i10;
                                                boolean[] zArr2 = zArr;
                                                int i45 = i11;
                                                ArrayList arrayList7 = null;
                                                if (jjVar6 != null) {
                                                    ArrayList arrayList8 = new ArrayList();
                                                    ArrayList arrayList9 = new ArrayList();
                                                    org.telegram.messenger.ej ejVar2 = ejVar;
                                                    if (ejVar2 != null) {
                                                        ArrayList arrayList10 = ejVar2.d;
                                                        c10 = 0;
                                                        int i46 = 0;
                                                        while (i46 < arrayList10.size()) {
                                                            org.telegram.messenger.jj jjVar7 = (org.telegram.messenger.jj) arrayList10.get(i46);
                                                            int i47 = i43;
                                                            if (org.telegram.messenger.jj.c3(jjVar7.k)) {
                                                                arrayList8.add(jjVar7);
                                                            } else {
                                                                arrayList9.add(Integer.valueOf(jjVar7.f1()));
                                                                if (encryptedChat2 != null) {
                                                                    j17 = e;
                                                                    if (jjVar7.k.random_id != 0 && jjVar7.D != 10) {
                                                                        if (arrayList7 == null) {
                                                                            arrayList7 = new ArrayList();
                                                                        }
                                                                        ArrayList arrayList11 = arrayList7;
                                                                        arrayList11.add(Long.valueOf(jjVar7.k.random_id));
                                                                        arrayList7 = arrayList11;
                                                                    }
                                                                    i46++;
                                                                    e = j17;
                                                                    i43 = i47;
                                                                }
                                                            }
                                                            j17 = e;
                                                            i46++;
                                                            e = j17;
                                                            i43 = i47;
                                                        }
                                                        i40 = i43;
                                                        j14 = e;
                                                    } else {
                                                        i40 = i43;
                                                        j14 = e;
                                                        c10 = 0;
                                                        if (org.telegram.messenger.jj.c3(jjVar6.k)) {
                                                            arrayList8.add(jjVar6);
                                                        } else {
                                                            arrayList9.add(Integer.valueOf(jjVar6.f1()));
                                                            if (encryptedChat2 != null && jjVar6.k.random_id != 0 && jjVar6.D != 10) {
                                                                ArrayList arrayList12 = new ArrayList();
                                                                arrayList12.add(Long.valueOf(jjVar6.k.random_id));
                                                                arrayList5 = arrayList12;
                                                                long j19 = (j18 == 0 && (peer = jjVar6.k.peer_id) != null && peer.chat_id == (-j18)) ? j18 : j14;
                                                                if (arrayList9.isEmpty()) {
                                                                    c11 = c10;
                                                                    arrayList6 = arrayList8;
                                                                    j15 = j19;
                                                                    i41 = 1;
                                                                    org.telegram.messenger.vp.r1(i40).Z(arrayList9, arrayList5, encryptedChat2, j15, i44, zArr2[c10], i45);
                                                                } else {
                                                                    c11 = c10;
                                                                    arrayList6 = arrayList8;
                                                                    j15 = j19;
                                                                    i41 = 1;
                                                                }
                                                                size2 = arrayList6.size();
                                                                i42 = c11 == true ? 1 : 0;
                                                                ?? r32 = c11;
                                                                while (i42 < size2) {
                                                                    Object obj = arrayList6.get(i42);
                                                                    i42++;
                                                                    org.telegram.messenger.jj jjVar8 = (org.telegram.messenger.jj) obj;
                                                                    org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i40);
                                                                    ArrayList arrayList13 = new ArrayList();
                                                                    arrayList13.add(Integer.valueOf(jjVar8.f1()));
                                                                    if (j15 == 0 || !org.telegram.messenger.o5.z(j15)) {
                                                                        j16 = 0;
                                                                    } else {
                                                                        TLRPC.Chat L02 = r13.L0(Long.valueOf(-j15));
                                                                        j16 = org.telegram.messenger.w3.T(L02) ? L02.id : 0L;
                                                                    }
                                                                    r13.j3(arrayList13, j15);
                                                                    org.telegram.messenger.hs messagesStorage = r13.getMessagesStorage();
                                                                    int P0 = jjVar8.P0();
                                                                    messagesStorage.getClass();
                                                                    a0.h hVar = new a0.h(i41);
                                                                    ArrayList arrayList14 = new ArrayList(i41);
                                                                    arrayList14.add(Integer.valueOf(P0));
                                                                    hVar.k(arrayList14, j15);
                                                                    messagesStorage.I(new org.telegram.messenger.wf(messagesStorage, hVar, (boolean) r32, 3));
                                                                    r13.getMessagesStorage().P0(j15, arrayList13, true, true, org.telegram.messenger.jj.d5(jjVar8.k) ? 9 : r32, i44);
                                                                    r13.getMessagesStorage().R1(j15, j16, arrayList13, null);
                                                                    org.telegram.messenger.zs notificationCenter = r13.getNotificationCenter();
                                                                    Long valueOf = Long.valueOf(j16);
                                                                    Integer valueOf2 = Integer.valueOf((int) r32);
                                                                    Object[] objArr = new Object[6];
                                                                    objArr[r32] = arrayList13;
                                                                    objArr[i41] = valueOf;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    boolean z33 = r32;
                                                                    objArr[2] = bool;
                                                                    objArr[3] = bool;
                                                                    objArr[4] = bool;
                                                                    objArr[5] = valueOf2;
                                                                    notificationCenter.k(org.telegram.messenger.zs.w, objArr);
                                                                    if (!org.telegram.messenger.jj.d5(jjVar8.k) || jjVar8.b5()) {
                                                                        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                        tL_deleteMessage.peer = r13.i1(org.telegram.messenger.jj.B0(jjVar8.k));
                                                                        TLRPC.Message message5 = jjVar8.k;
                                                                        tL_deleteMessage.receiver_id = r13.n1(message5 != null ? message5.ephemeralReceiverBotId : 0L);
                                                                        tL_deleteMessage.id = jjVar8.P0();
                                                                        r13.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new org.telegram.messenger.z1(2));
                                                                    } else {
                                                                        TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                        tL_deleteWelcomeMessage.peer = r13.i1(org.telegram.messenger.jj.B0(jjVar8.k));
                                                                        tL_deleteWelcomeMessage.id = jjVar8.P0();
                                                                        r13.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new org.telegram.messenger.z1(2));
                                                                    }
                                                                    r32 = z33;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    arrayList5 = arrayList7;
                                                    if (j18 == 0) {
                                                    }
                                                    if (arrayList9.isEmpty()) {
                                                    }
                                                    size2 = arrayList6.size();
                                                    i42 = c11 == true ? 1 : 0;
                                                    ?? r322 = c11;
                                                    while (i42 < size2) {
                                                    }
                                                } else {
                                                    long j20 = e;
                                                    int i48 = 1;
                                                    while (i48 >= 0) {
                                                        ArrayList arrayList15 = new ArrayList();
                                                        int i49 = 0;
                                                        while (true) {
                                                            sparseArrayArr2 = sparseArrayArr;
                                                            if (i49 >= sparseArrayArr2[i48].size()) {
                                                                break;
                                                            }
                                                            arrayList15.add(Integer.valueOf(sparseArrayArr2[i48].keyAt(i49)));
                                                            i49++;
                                                        }
                                                        if (encryptedChat2 != null) {
                                                            ArrayList arrayList16 = new ArrayList();
                                                            int i50 = 0;
                                                            while (i50 < sparseArrayArr2[i48].size()) {
                                                                org.telegram.messenger.jj jjVar9 = (org.telegram.messenger.jj) sparseArrayArr2[i48].valueAt(i50);
                                                                int i51 = i48;
                                                                long j21 = jjVar9.k.random_id;
                                                                if (j21 != 0 && jjVar9.D != 10) {
                                                                    arrayList16.add(Long.valueOf(j21));
                                                                }
                                                                i50++;
                                                                i48 = i51;
                                                            }
                                                            arrayList4 = arrayList16;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                        int i52 = i48;
                                                        org.telegram.messenger.vp.r1(i43).Z(arrayList15, arrayList4, encryptedChat2, (i52 != 1 || j18 == 0) ? j20 : j18, i44, zArr2[0], i45);
                                                        sparseArrayArr2[i52].clear();
                                                        i48 = i52 - 1;
                                                    }
                                                }
                                                runnable.run();
                                            }
                                        };
                                        if (z18) {
                                            x1Var = x1Var2;
                                            i18 = 1;
                                            i18 = 1;
                                            str2 = null;
                                            if (i38 == 1) {
                                                x1Var.R = org.telegram.messenger.cd.L0(2131751497, null);
                                            } else {
                                                x1Var.R = org.telegram.messenger.cd.a0(null, null, 2131751520, org.telegram.messenger.cd.G(i38, "messages", new Object[0]));
                                            }
                                        } else {
                                            i18 = 1;
                                            i18 = 1;
                                            if (i38 == 1) {
                                                str2 = null;
                                                x1Var = x1Var2;
                                                x1Var.R = org.telegram.messenger.cd.L0(2131743861, null);
                                            } else {
                                                x1Var = x1Var2;
                                                str2 = null;
                                                x1Var.R = org.telegram.messenger.cd.a0(null, null, 2131743862, org.telegram.messenger.cd.G(i38, "messages", new Object[0]));
                                            }
                                        }
                                        if (z18) {
                                            if (chat == null || !z17) {
                                                if (!z15 || z29 || i36 == i38) {
                                                    if (chat == null || !chat.megagroup || z21) {
                                                        if (i38 == i18) {
                                                            x1Var.T = org.telegram.messenger.cd.L0(2131754093, null);
                                                        } else {
                                                            x1Var.T = org.telegram.messenger.cd.L0(2131754101, null);
                                                        }
                                                    } else if (i38 == i18) {
                                                        x1Var.T = org.telegram.messenger.cd.L0((jjVar == null || !org.telegram.messenger.jj.c3(jjVar.k)) ? 2131754092 : 2131754093, null);
                                                    } else {
                                                        x1Var.T = org.telegram.messenger.cd.L0(2131754100, null);
                                                    }
                                                } else if (chat != null) {
                                                    Object[] objArr = new Object[i18];
                                                    objArr[0] = org.telegram.messenger.cd.G(i36, "messages", new Object[0]);
                                                    x1Var.T = org.telegram.messenger.cd.a0("DeleteMessagesTextGroup", null, 2131751522, objArr);
                                                } else {
                                                    String G = org.telegram.messenger.cd.G(i36, "messages", new Object[0]);
                                                    String j14 = org.telegram.messenger.h20.j(user, i18);
                                                    Object[] objArr2 = new Object[2];
                                                    objArr2[0] = G;
                                                    objArr2[i18] = j14;
                                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("DeleteMessagesText", null, 2131751523, objArr2));
                                                }
                                            } else if (z15 && i36 != i38) {
                                                Object[] objArr3 = new Object[i18];
                                                objArr3[0] = org.telegram.messenger.cd.G(i36, "messages", new Object[0]);
                                                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751521, objArr3);
                                            } else if (i38 == i18) {
                                                x1Var.T = org.telegram.messenger.cd.L0(2131754093, null);
                                            } else {
                                                x1Var.T = org.telegram.messenger.cd.L0(2131754101, null);
                                            }
                                        } else if (i38 == i18) {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131754063, str2);
                                        } else {
                                            x1Var.T = org.telegram.messenger.cd.L0(2131754064, str2);
                                        }
                                        if (jjVar == null) {
                                            z19 = (!jjVar.u3() || org.telegram.messenger.jj.l3(jjVar.k)) ? false : i18;
                                            if (z19) {
                                                long j15 = ((TLRPC.TL_messageMediaGiveaway) jjVar.k.media).until_date * 1000;
                                                str3 = org.telegram.messenger.cd.D0().t0().format(new Date(j15));
                                                if (System.currentTimeMillis() < j15) {
                                                    z19 = i18;
                                                }
                                                z19 = false;
                                            } else {
                                                str3 = null;
                                            }
                                        } else if (i38 == i18) {
                                            boolean z32 = false;
                                            String str5 = null;
                                            for (int i39 = i18; i39 >= 0; i39--) {
                                                for (int i40 = 0; i40 < sparseArrayArr[i39].size(); i40++) {
                                                    org.telegram.messenger.jj jjVar6 = (org.telegram.messenger.jj) sparseArrayArr[i39].valueAt(i40);
                                                    boolean z33 = (!jjVar6.u3() || org.telegram.messenger.jj.l3(jjVar6.k)) ? false : i18;
                                                    if (z33) {
                                                        long j16 = ((TLRPC.TL_messageMediaGiveaway) jjVar6.k.media).until_date * 1000;
                                                        str5 = org.telegram.messenger.cd.D0().t0().format(new Date(j16));
                                                        z32 = System.currentTimeMillis() < j16 ? i18 : false;
                                                    } else {
                                                        z32 = z33;
                                                    }
                                                }
                                            }
                                            z19 = z32;
                                            str3 = str5;
                                        } else {
                                            str3 = null;
                                            z19 = false;
                                        }
                                        if (z27) {
                                            AlertDialog$Builder alertDialog$Builder8 = alertDialog$Builder7;
                                            r12 = 0;
                                            r12 = 0;
                                            r12 = 0;
                                            if (z26) {
                                                int a2 = (int) org.telegram.messenger.vp.r1(i37).y7.i.a(TimeUnit.HOURS);
                                                x1Var.R = org.telegram.messenger.cd.L0(2131744360, null);
                                                Object[] objArr4 = new Object[i18];
                                                objArr4[0] = Integer.valueOf(a2);
                                                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744359, objArr4));
                                                alertDialog$Builder8.k(org.telegram.messenger.cd.L0(2131744362, null), u1Var);
                                                alertDialog$Builder2 = alertDialog$Builder8;
                                            } else if (!z19 || z18) {
                                                alertDialog$Builder8.k(org.telegram.messenger.cd.L0(z18 ? 2131746336 : 2131751599, null), u1Var);
                                                alertDialog$Builder2 = alertDialog$Builder8;
                                            } else {
                                                x1Var.R = org.telegram.messenger.cd.L0(2131753479, null);
                                                Object[] objArr5 = new Object[i18];
                                                objArr5[0] = str3;
                                                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131753480, objArr5));
                                                alertDialog$Builder8.i(org.telegram.messenger.cd.L0(2131751599, null), u1Var);
                                                alertDialog$Builder2 = alertDialog$Builder8;
                                            }
                                        } else {
                                            int a10 = (int) org.telegram.messenger.vp.r1(i37).y7.i.a(TimeUnit.HOURS);
                                            r12 = 0;
                                            x1Var.R = org.telegram.messenger.cd.L0(2131744363, null);
                                            Object[] objArr6 = new Object[i18];
                                            objArr6[0] = Integer.valueOf(a10);
                                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744361, objArr6));
                                            AlertDialog$Builder alertDialog$Builder9 = alertDialog$Builder7;
                                            alertDialog$Builder9.k(org.telegram.messenger.cd.L0(2131744362, null), u1Var);
                                            alertDialog$Builder2 = alertDialog$Builder9;
                                        }
                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, r12), r12);
                                        x1Var.N = new m0(0, runnable2);
                                        k2Var.showDialog(x1Var);
                                        textView = (TextView) x1Var.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, r12);
                                        }
                                        textView2 = (TextView) x1Var.d(-3);
                                        if (textView2 == null) {
                                            x1Var.v0.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f));
                                            ((ViewGroup.MarginLayoutParams) x1Var.v0.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(-8.0f);
                                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                                            return;
                                        }
                                        return;
                                    }
                                    i16 = 0;
                                    z15 = false;
                                    alertDialog$Builder3 = alertDialog$Builder6;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder10 = alertDialog$Builder4;
                                    ArrayList arrayList4 = new ArrayList();
                                    if (jjVar2 != null) {
                                        TLRPC.MessageAction messageAction4 = jjVar2.k.action;
                                        if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                                            if (ejVar != null) {
                                                arrayList4.addAll(ejVar.d);
                                            } else {
                                                arrayList4.add(jjVar2);
                                            }
                                        }
                                        i19 = (!jjVar2.n4() && org.telegram.messenger.jj.B0(jjVar2.k) == j10 && ((messageAction2 = jjVar2.k.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && jjVar2.N3() && currentTime - jjVar2.k.date <= i30) ? 1 : 0;
                                    } else {
                                        int i41 = 1;
                                        int i42 = 0;
                                        while (i41 >= 0) {
                                            int i43 = 0;
                                            while (i43 < sparseArrayArr[i41].size()) {
                                                org.telegram.messenger.jj jjVar7 = (org.telegram.messenger.jj) sparseArrayArr[i41].valueAt(i43);
                                                int i44 = i43;
                                                if (i41 == 1 && jjVar7.N3()) {
                                                    TLRPC.Message message5 = jjVar7.k;
                                                    i20 = i41;
                                                    if (message5.action == null && currentTime - message5.date <= i30) {
                                                        i42++;
                                                    }
                                                } else {
                                                    i20 = i41;
                                                }
                                                arrayList4.add(jjVar7);
                                                i43 = i44 + 1;
                                                i41 = i20;
                                            }
                                            i41--;
                                        }
                                        i19 = i42;
                                    }
                                    int i45 = i19;
                                    int i46 = 2;
                                    ArrayList arrayList5 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new org.telegram.ui.xa(1)).mapToLong(new org.telegram.messenger.uk(3)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.o0
                                        @Override // java.util.function.LongFunction
                                        public final Object apply(long j17) {
                                            int i47 = i12;
                                            return j17 > 0 ? org.telegram.messenger.vp.r1(i47).Z1(Long.valueOf(j17)) : org.telegram.messenger.vp.r1(i47).L0(Long.valueOf(-j17));
                                        }
                                    }).filter(new org.telegram.ui.xa(i46)).filter(new org.telegram.ui.o8(org.telegram.messenger.d20.i(i12).e(), i46)).collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
                                    if (!arrayList5.isEmpty()) {
                                        if (channelParticipantArr != null) {
                                            vr vrVar = new vr(k2Var, chat, arrayList4, arrayList5, channelParticipantArr, j10, i10, i11, false, runnable);
                                            if (runnable3 != null) {
                                                vrVar.H0 = new m0(3, runnable3);
                                            }
                                            vrVar.show();
                                            return;
                                        }
                                        final org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, parentActivity, null)};
                                        final int size2 = arrayList5.size();
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                                        final int[] iArr = new int[size2];
                                        int[] iArr2 = new int[1];
                                        int i47 = 0;
                                        while (i47 < size2) {
                                            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                                            tL_channels_getParticipant.channel = org.telegram.messenger.vp.h1(chat);
                                            tL_channels_getParticipant.participant = org.telegram.messenger.vp.j1((TLObject) arrayList5.get(i47));
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                                            ArrayList arrayList6 = arrayList5;
                                            final Runnable runnable4 = runnable3;
                                            final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                            final int[] iArr3 = iArr2;
                                            final int i48 = i47;
                                            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.p0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    final int[] iArr4 = iArr3;
                                                    final int[] iArr5 = iArr;
                                                    final int i49 = i48;
                                                    final TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                                    final int i50 = size2;
                                                    final org.telegram.ui.ActionBar.x1[] x1VarArr2 = x1VarArr;
                                                    final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                                                    final TLRPC.User user2 = user;
                                                    final TLRPC.Chat chat2 = chat;
                                                    final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                    final TLRPC.ChatFull chatFull2 = chatFull;
                                                    final long j17 = j10;
                                                    final org.telegram.messenger.jj jjVar8 = jjVar;
                                                    final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                                    final org.telegram.messenger.ej ejVar2 = ejVar;
                                                    final int i51 = i10;
                                                    final int i52 = i11;
                                                    final Runnable runnable5 = runnable;
                                                    final Runnable runnable6 = runnable4;
                                                    final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.p1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            org.telegram.ui.ActionBar.x1[] x1VarArr3 = x1VarArr2;
                                                            int[] iArr6 = iArr4;
                                                            iArr6[0] = iArr6[0] + 1;
                                                            int[] iArr7 = iArr5;
                                                            int i53 = i49;
                                                            iArr7[i53] = 0;
                                                            TLObject tLObject2 = tLObject;
                                                            TLRPC.ChannelParticipant[] channelParticipantArr5 = channelParticipantArr4;
                                                            if (tLObject2 != null) {
                                                                channelParticipantArr5[i53] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                            }
                                                            if (iArr6[0] == i50) {
                                                                try {
                                                                    x1VarArr3[0].dismiss();
                                                                } catch (Throwable unused) {
                                                                }
                                                                x1VarArr3[0] = null;
                                                                s4.y(k2Var2, user2, chat2, encryptedChat2, chatFull2, j17, jjVar8, sparseArrayArr2, ejVar2, i51, i52, channelParticipantArr5, runnable5, runnable6, p6Var2);
                                                            }
                                                        }
                                                    });
                                                }
                                            };
                                            int[] iArr4 = iArr;
                                            iArr4[i48] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                                            i47 = i48 + 1;
                                            runnable3 = runnable2;
                                            size2 = size2;
                                            iArr = iArr4;
                                            channelParticipantArr2 = channelParticipantArr3;
                                            iArr2 = iArr3;
                                            arrayList5 = arrayList6;
                                            i12 = i12;
                                        }
                                        org.telegram.messenger.i0.h3(new i2.g1(x1VarArr, iArr, i12, runnable2, k2Var, 11), 1000L);
                                        return;
                                    }
                                    i15 = i12;
                                    if (i45 <= 0 || !z14) {
                                        z20 = false;
                                    } else {
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        org.telegram.ui.Cells.c2 c2Var4 = new org.telegram.ui.Cells.c2(1, parentActivity, p6Var);
                                        c2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                        c2Var4.e(org.telegram.messenger.cd.L0(2131751527, null), "", false, false, false);
                                        c2Var4.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                                        frameLayout2.addView(c2Var4, w7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                        c2Var4.setOnClickListener(new x0(4, zArr));
                                        alertDialog$Builder10.o(frameLayout2);
                                        x1Var2.G = 9;
                                        z20 = true;
                                    }
                                    z15 = z20;
                                    i16 = i45;
                                    alertDialog$Builder3 = alertDialog$Builder10;
                                }
                                z17 = false;
                                alertDialog$Builder = alertDialog$Builder3;
                                int i362 = i16;
                                AlertDialog$Builder alertDialog$Builder72 = alertDialog$Builder;
                                z18 = z10;
                                final int i372 = i15;
                                final long j132 = j11;
                                int i382 = size;
                                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.l0
                                    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                    /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
                                    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r3v17 */
                                    /* JADX WARN: Type inference failed for: r3v28 */
                                    @Override // org.telegram.ui.ActionBar.u1
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i392) {
                                        SparseArray[] sparseArrayArr2;
                                        ArrayList arrayList42;
                                        int i402;
                                        long j142;
                                        char c10;
                                        ArrayList arrayList52;
                                        char c11;
                                        ArrayList arrayList62;
                                        long j152;
                                        int i412;
                                        int size22;
                                        int i422;
                                        long j162;
                                        TLRPC.Peer peer;
                                        long j17;
                                        boolean z322 = z18;
                                        int i432 = i372;
                                        long e = z322 ? org.telegram.messenger.d20.i(i432).e() : j132;
                                        org.telegram.messenger.jj jjVar62 = jjVar;
                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                        long j18 = j10;
                                        int i442 = i10;
                                        boolean[] zArr2 = zArr;
                                        int i452 = i11;
                                        ArrayList arrayList7 = null;
                                        if (jjVar62 != null) {
                                            ArrayList arrayList8 = new ArrayList();
                                            ArrayList arrayList9 = new ArrayList();
                                            org.telegram.messenger.ej ejVar2 = ejVar;
                                            if (ejVar2 != null) {
                                                ArrayList arrayList10 = ejVar2.d;
                                                c10 = 0;
                                                int i462 = 0;
                                                while (i462 < arrayList10.size()) {
                                                    org.telegram.messenger.jj jjVar72 = (org.telegram.messenger.jj) arrayList10.get(i462);
                                                    int i472 = i432;
                                                    if (org.telegram.messenger.jj.c3(jjVar72.k)) {
                                                        arrayList8.add(jjVar72);
                                                    } else {
                                                        arrayList9.add(Integer.valueOf(jjVar72.f1()));
                                                        if (encryptedChat2 != null) {
                                                            j17 = e;
                                                            if (jjVar72.k.random_id != 0 && jjVar72.D != 10) {
                                                                if (arrayList7 == null) {
                                                                    arrayList7 = new ArrayList();
                                                                }
                                                                ArrayList arrayList11 = arrayList7;
                                                                arrayList11.add(Long.valueOf(jjVar72.k.random_id));
                                                                arrayList7 = arrayList11;
                                                            }
                                                            i462++;
                                                            e = j17;
                                                            i432 = i472;
                                                        }
                                                    }
                                                    j17 = e;
                                                    i462++;
                                                    e = j17;
                                                    i432 = i472;
                                                }
                                                i402 = i432;
                                                j142 = e;
                                            } else {
                                                i402 = i432;
                                                j142 = e;
                                                c10 = 0;
                                                if (org.telegram.messenger.jj.c3(jjVar62.k)) {
                                                    arrayList8.add(jjVar62);
                                                } else {
                                                    arrayList9.add(Integer.valueOf(jjVar62.f1()));
                                                    if (encryptedChat2 != null && jjVar62.k.random_id != 0 && jjVar62.D != 10) {
                                                        ArrayList arrayList12 = new ArrayList();
                                                        arrayList12.add(Long.valueOf(jjVar62.k.random_id));
                                                        arrayList52 = arrayList12;
                                                        long j19 = (j18 == 0 && (peer = jjVar62.k.peer_id) != null && peer.chat_id == (-j18)) ? j18 : j142;
                                                        if (arrayList9.isEmpty()) {
                                                            c11 = c10;
                                                            arrayList62 = arrayList8;
                                                            j152 = j19;
                                                            i412 = 1;
                                                            org.telegram.messenger.vp.r1(i402).Z(arrayList9, arrayList52, encryptedChat2, j152, i442, zArr2[c10], i452);
                                                        } else {
                                                            c11 = c10;
                                                            arrayList62 = arrayList8;
                                                            j152 = j19;
                                                            i412 = 1;
                                                        }
                                                        size22 = arrayList62.size();
                                                        i422 = c11 == true ? 1 : 0;
                                                        ?? r322 = c11;
                                                        while (i422 < size22) {
                                                            Object obj = arrayList62.get(i422);
                                                            i422++;
                                                            org.telegram.messenger.jj jjVar8 = (org.telegram.messenger.jj) obj;
                                                            org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i402);
                                                            ArrayList arrayList13 = new ArrayList();
                                                            arrayList13.add(Integer.valueOf(jjVar8.f1()));
                                                            if (j152 == 0 || !org.telegram.messenger.o5.z(j152)) {
                                                                j162 = 0;
                                                            } else {
                                                                TLRPC.Chat L02 = r13.L0(Long.valueOf(-j152));
                                                                j162 = org.telegram.messenger.w3.T(L02) ? L02.id : 0L;
                                                            }
                                                            r13.j3(arrayList13, j152);
                                                            org.telegram.messenger.hs messagesStorage = r13.getMessagesStorage();
                                                            int P0 = jjVar8.P0();
                                                            messagesStorage.getClass();
                                                            a0.h hVar = new a0.h(i412);
                                                            ArrayList arrayList14 = new ArrayList(i412);
                                                            arrayList14.add(Integer.valueOf(P0));
                                                            hVar.k(arrayList14, j152);
                                                            messagesStorage.I(new org.telegram.messenger.wf(messagesStorage, hVar, (boolean) r322, 3));
                                                            r13.getMessagesStorage().P0(j152, arrayList13, true, true, org.telegram.messenger.jj.d5(jjVar8.k) ? 9 : r322, i442);
                                                            r13.getMessagesStorage().R1(j152, j162, arrayList13, null);
                                                            org.telegram.messenger.zs notificationCenter = r13.getNotificationCenter();
                                                            Long valueOf = Long.valueOf(j162);
                                                            Integer valueOf2 = Integer.valueOf((int) r322);
                                                            Object[] objArr7 = new Object[6];
                                                            objArr7[r322] = arrayList13;
                                                            objArr7[i412] = valueOf;
                                                            Boolean bool = Boolean.FALSE;
                                                            boolean z332 = r322;
                                                            objArr7[2] = bool;
                                                            objArr7[3] = bool;
                                                            objArr7[4] = bool;
                                                            objArr7[5] = valueOf2;
                                                            notificationCenter.k(org.telegram.messenger.zs.w, objArr7);
                                                            if (!org.telegram.messenger.jj.d5(jjVar8.k) || jjVar8.b5()) {
                                                                TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                tL_deleteMessage.peer = r13.i1(org.telegram.messenger.jj.B0(jjVar8.k));
                                                                TLRPC.Message message52 = jjVar8.k;
                                                                tL_deleteMessage.receiver_id = r13.n1(message52 != null ? message52.ephemeralReceiverBotId : 0L);
                                                                tL_deleteMessage.id = jjVar8.P0();
                                                                r13.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new org.telegram.messenger.z1(2));
                                                            } else {
                                                                TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                tL_deleteWelcomeMessage.peer = r13.i1(org.telegram.messenger.jj.B0(jjVar8.k));
                                                                tL_deleteWelcomeMessage.id = jjVar8.P0();
                                                                r13.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new org.telegram.messenger.z1(2));
                                                            }
                                                            r322 = z332;
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList52 = arrayList7;
                                            if (j18 == 0) {
                                            }
                                            if (arrayList9.isEmpty()) {
                                            }
                                            size22 = arrayList62.size();
                                            i422 = c11 == true ? 1 : 0;
                                            ?? r3222 = c11;
                                            while (i422 < size22) {
                                            }
                                        } else {
                                            long j20 = e;
                                            int i482 = 1;
                                            while (i482 >= 0) {
                                                ArrayList arrayList15 = new ArrayList();
                                                int i49 = 0;
                                                while (true) {
                                                    sparseArrayArr2 = sparseArrayArr;
                                                    if (i49 >= sparseArrayArr2[i482].size()) {
                                                        break;
                                                    }
                                                    arrayList15.add(Integer.valueOf(sparseArrayArr2[i482].keyAt(i49)));
                                                    i49++;
                                                }
                                                if (encryptedChat2 != null) {
                                                    ArrayList arrayList16 = new ArrayList();
                                                    int i50 = 0;
                                                    while (i50 < sparseArrayArr2[i482].size()) {
                                                        org.telegram.messenger.jj jjVar9 = (org.telegram.messenger.jj) sparseArrayArr2[i482].valueAt(i50);
                                                        int i51 = i482;
                                                        long j21 = jjVar9.k.random_id;
                                                        if (j21 != 0 && jjVar9.D != 10) {
                                                            arrayList16.add(Long.valueOf(j21));
                                                        }
                                                        i50++;
                                                        i482 = i51;
                                                    }
                                                    arrayList42 = arrayList16;
                                                } else {
                                                    arrayList42 = null;
                                                }
                                                int i52 = i482;
                                                org.telegram.messenger.vp.r1(i432).Z(arrayList15, arrayList42, encryptedChat2, (i52 != 1 || j18 == 0) ? j20 : j18, i442, zArr2[0], i452);
                                                sparseArrayArr2[i52].clear();
                                                i482 = i52 - 1;
                                            }
                                        }
                                        runnable.run();
                                    }
                                };
                                if (z18) {
                                }
                                if (z18) {
                                }
                                if (jjVar == null) {
                                }
                                if (z27) {
                                }
                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, r12), r12);
                                x1Var.N = new m0(0, runnable2);
                                k2Var.showDialog(x1Var);
                                textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                }
                                textView2 = (TextView) x1Var.d(-3);
                                if (textView2 == null) {
                                }
                            }

                            public static AlertDialog$Builder z(Context context) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String y22 = org.telegram.messenger.i0.y2(null, R.raw.pip_voice_request);
                                m20 m20Var = new m20(0, context, true);
                                m20Var.setImportantForAccessibility(2);
                                jg.l0 l0Var = new jg.l0(context, m20Var);
                                l0Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
                                l0Var.setClipToOutline(true);
                                l0Var.setOutlineProvider(new bi.d2(10));
                                View view = new View(context);
                                view.setBackground(new BitmapDrawable(org.telegram.messenger.d00.e(org.telegram.messenger.i0.L(320.0f), org.telegram.messenger.i0.L(184.61539f), y22)));
                                l0Var.addView(view, w7.b6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                                l0Var.addView(m20Var, w7.b6.c(117.0f, org.telegram.messenger.zs.C1));
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.V = l0Var;
                                x1Var.R = org.telegram.messenger.cd.L0(2131747332, null);
                                x1Var.T = org.telegram.messenger.cd.L0(2131747333, null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751161, null), new k0(context, 1));
                                x1Var.l0 = true;
                                x1Var.V0 = false;
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                x1Var.Q0 = 0.5769231f;
                                return alertDialog$Builder;
                            }
                        }
