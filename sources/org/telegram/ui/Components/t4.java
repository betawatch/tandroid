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
import java.util.Iterator;
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
import org.telegram.ui.d81;
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class t4 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, ib1 ib1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String y22 = org.telegram.messenger.g0.y2(null, R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new cg.p0(12));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(org.telegram.messenger.kz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(161.36752f), y22)));
        frameLayout.addView(view, b8.mf.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.W = frameLayout;
        s1Var.S = org.telegram.messenger.bd.M0(2131747323, null);
        s1Var.U = org.telegram.messenger.bd.M0(2131747326, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751161, null), new ei.f(8, activity, z10));
        s1Var.m0 = true;
        s1Var.W0 = false;
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), ib1Var);
        s1Var.R0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.s1 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String M0 = org.telegram.messenger.bd.M0(2131748725, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131748726, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131748728, null), new x0(launchActivity, 1));
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.s1 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747312, null));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = X2;
        int i3 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
        alertDialog$Builder.n(i3, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new i0(activity, 3));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.s1 D(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.kr krVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.bd.M0(2131745627, null), org.telegram.messenger.bd.M0(2131745626, null), org.telegram.messenger.bd.M0(2131745625, null), org.telegram.messenger.bd.M0(2131745624, null)};
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.bd.M0(2131748852, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.bd.a0(null, null, 2131748849, org.telegram.messenger.l10.j(user, true)));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131748850, null));
        }
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        e10.addView(textView, b8.mf.t(-2, -2, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i3 = 0;
        while (i3 < 4) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.d = 42;
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i3));
            a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, e6Var);
            i6Var.b(strArr[i3], iArr[0] == i3);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new l1(iArr, e10));
            i3++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        if (z10) {
            s1Var.S = org.telegram.messenger.bd.M0(2131748851, null);
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.L5;
            int f10 = e6Var != null ? e6Var.f(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            s1Var.c0 = new po0(activity, 0);
            s1Var.d0 = f10;
            s1Var.e0 = -1;
            if (e6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.k6.L5, null);
            }
        }
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745469, null), new org.telegram.ui.jo(7, iArr, krVar));
        alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.t2 E(final long j10, final long j11, final org.telegram.ui.ActionBar.d2 d2Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        if (d2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(d2Var.getParentActivity(), false, 1, e6Var);
        h.P = org.telegram.messenger.bd.M0(2131747932, null);
        h.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.bd.a0("MuteFor", null, 2131748320, org.telegram.messenger.bd.G(1, "Hours", new Object[0])), org.telegram.messenger.bd.a0("MuteFor", null, 2131748320, org.telegram.messenger.bd.G(8, "Hours", new Object[0])), org.telegram.messenger.bd.a0("MuteFor", null, 2131748320, org.telegram.messenger.bd.G(2, "Days", new Object[0])), org.telegram.messenger.bd.M0(2131748321, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.y2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i10;
                if (i3 == 0) {
                    i10 = 0;
                } else {
                    int i11 = 1;
                    if (i3 != 1) {
                        i11 = 2;
                        if (i3 != 2) {
                            i11 = 3;
                        }
                    }
                    i10 = i11;
                }
                org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).T(j10, i10, j11);
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                if (fc.a(d2Var2)) {
                    fc.z(d2Var2, i10, 0, e6Var).j();
                }
            }
        };
        h.M = charSequenceArr;
        h.L = onClickListener;
        return h;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.e6 e6Var, r4 r4Var) {
        if (context == null) {
            return;
        }
        int i3 = 0;
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        int f10 = e6Var != null ? e6Var.f(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        int f11 = e6Var != null ? e6Var.f(i11) : org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.xj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.Bj;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.i6;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        int f12 = e6Var != null ? e6Var.f(i17) : org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.k6.Ci;
        int f13 = e6Var != null ? e6Var.f(i18) : org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.k6.Ei;
        int f14 = e6Var != null ? e6Var.f(i19) : org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
        int[] iArr = {30, 60, 120, org.telegram.messenger.hs.K2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, e6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(20);
        h4Var.setTextColor(f10);
        h4Var.setValue(0);
        h4Var.setFormatter(new v0(iArr, i3));
        d4 d4Var = new d4(context, h4Var, 1);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131748318, null));
        textView.setTextColor(f10);
        k2.p1.t(textView, 1, 20.0f);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ci.ec ecVar = new ci.ec(context, 19);
        linearLayout.addView(h4Var, b8.mf.l(1.0f, 0, org.telegram.messenger.hs.t4));
        h4Var.setOnValueChangedListener(new c(3));
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar.setGravity(17);
        ecVar.setTextColor(f12);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        ecVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, f13, f14, f14));
        ecVar.setText(org.telegram.messenger.bd.M0(2131753866, null));
        d4Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        ecVar.setOnClickListener(new ai.r4(iArr, h4Var, r4Var, dVar, 7));
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
        t2Var.O = d4Var;
        t2Var.show();
        t2Var.v0(f11);
        t2Var.O(f11);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = str;
        HashMap hashMap = new HashMap();
        int i3 = org.telegram.ui.ActionBar.k6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(i3)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(i3)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.k6.v0(i3), hashMap);
        alertDialog$Builder.n(i3, null);
        s1Var.X = true;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752041, null), null);
        s1Var.U = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.s1 H(Activity activity, long j10, final long j11, int i3, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        char c2;
        CharSequence[] charSequenceArr;
        final long j12 = j10;
        final int i12 = i3;
        final SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).d7;
        final int[] iArr = new int[1];
        if (j12 != 0) {
            i11 = 0;
            int i13 = sharedPreferences.getInt("priority_" + j12, 3);
            iArr[0] = i13;
            if (i13 == 3) {
                iArr[0] = 0;
            } else if (i13 == 4) {
                iArr[0] = 1;
            } else if (i13 == 5) {
                iArr[0] = 2;
            } else if (i13 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            charSequenceArr = new String[]{org.telegram.messenger.bd.M0(2131747888, null), org.telegram.messenger.bd.M0(2131747890, null), org.telegram.messenger.bd.M0(2131747889, null), org.telegram.messenger.bd.M0(2131747891, null), org.telegram.messenger.bd.M0(2131747887, null)};
            i10 = 1;
        } else {
            i10 = 1;
            i11 = 0;
            if (i12 == 1) {
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i12 == 0) {
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i12 == 2) {
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            } else if (i12 == 3) {
                iArr[0] = sharedPreferences.getInt("priority_stories", 1);
            } else if (i12 == 4 || i12 == 5) {
                iArr[0] = sharedPreferences.getInt("priority_react", 1);
            }
            int i14 = iArr[0];
            if (i14 == 4) {
                iArr[0] = 0;
            } else if (i14 == 5) {
                iArr[0] = 1;
            } else {
                if (i14 == 0) {
                    c2 = 2;
                    iArr[0] = 2;
                } else {
                    c2 = 2;
                    iArr[0] = 3;
                }
                CharSequence[] charSequenceArr2 = new String[4];
                charSequenceArr2[0] = org.telegram.messenger.bd.M0(2131747890, null);
                charSequenceArr2[1] = org.telegram.messenger.bd.M0(2131747889, null);
                charSequenceArr2[c2] = org.telegram.messenger.bd.M0(2131747891, null);
                charSequenceArr2[3] = org.telegram.messenger.bd.M0(2131747887, null);
                charSequenceArr = charSequenceArr2;
            }
            c2 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.bd.M0(2131747890, null);
            charSequenceArr22[1] = org.telegram.messenger.bd.M0(2131747889, null);
            charSequenceArr22[c2] = org.telegram.messenger.bd.M0(2131747891, null);
            charSequenceArr22[3] = org.telegram.messenger.bd.M0(2131747887, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, i10);
        int i15 = i11;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, activity, e6Var);
        int i16 = i15;
        while (i16 < charSequenceArr.length) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), i15, org.telegram.messenger.g0.L(4.0f), i15);
            i6Var.setTag(Integer.valueOf(i16));
            a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, e6Var);
            i6Var.b(charSequenceArr[i16], iArr[i15] == i16 ? 1 : i15);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i17 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).d7.edit();
                    long j13 = j12;
                    if (j13 != 0) {
                        int i18 = iArr2[0];
                        if (i18 == 0) {
                            i17 = 3;
                        } else if (i18 == 1) {
                            i17 = 4;
                        } else if (i18 == 2) {
                            i17 = 5;
                        } else if (i18 != 3) {
                            i17 = 1;
                        }
                        edit.putInt("priority_" + j13, i17);
                        org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).l(j13, j11);
                    } else {
                        int i19 = iArr2[0];
                        int i20 = i19 == 0 ? 4 : i19 == 1 ? 5 : i19 == 2 ? 0 : 1;
                        int i21 = i12;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        if (i21 == 1) {
                            edit.putInt("priority_messages", i20);
                            iArr2[0] = sharedPreferences2.getInt("priority_messages", 1);
                        } else if (i21 == 0) {
                            edit.putInt("priority_group", i20);
                            iArr2[0] = sharedPreferences2.getInt("priority_group", 1);
                        } else if (i21 == 2) {
                            edit.putInt("priority_channel", i20);
                            iArr2[0] = sharedPreferences2.getInt("priority_channel", 1);
                        } else if (i21 == 3) {
                            edit.putInt("priority_stories", i20);
                            iArr2[0] = sharedPreferences2.getInt("priority_stories", 1);
                        } else if (i21 == 4 || i21 == 5) {
                            edit.putInt("priority_react", i20);
                            iArr2[0] = sharedPreferences2.getInt("priority_react", 1);
                        }
                        org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).m(i21);
                    }
                    edit.commit();
                    alertDialog$Builder.a.O0.run();
                    runnable.run();
                }
            });
            i16++;
            j12 = j10;
            i12 = i3;
            i15 = i15;
        }
        String M0 = org.telegram.messenger.bd.M0(2131747914, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static void I(int i3, Activity activity, long j10, TLRPC.Photo photo, ei.b bVar) {
        if (activity != null) {
            ai.f0 f0Var = new ai.f0(i3, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) activity, (org.telegram.ui.ActionBar.e6) bVar, true);
            t2Var.N();
            t2Var.P = org.telegram.messenger.bd.M0(2131746222, null);
            t2Var.Q = true;
            CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131746231, null), org.telegram.messenger.bd.M0(2131746237, null), org.telegram.messenger.bd.M0(2131746230, null), org.telegram.messenger.bd.M0(2131746239, null), org.telegram.messenger.bd.M0(2131746236, null), org.telegram.messenger.bd.M0(2131746234, null), org.telegram.messenger.bd.M0(2131746233, null), org.telegram.messenger.bd.M0(2131746235, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            r2 r2Var = new r2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, f0Var, 0);
            t2Var.M = charSequenceArr;
            t2Var.N = iArr;
            t2Var.L = r2Var;
            t2Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v38, types: [android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View] */
    public static hi.d J(final Context context, final long j10, long j11, int i3, boolean z10, final r4 r4Var, Runnable runnable, q4 q4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        cb0 cb0Var;
        long j12;
        boolean[] zArr;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.q0 q0Var;
        Calendar calendar;
        int i11;
        int[] iArr;
        int i12;
        o4.b1 b1Var;
        String[] strArr;
        int[] iArr2;
        String[] strArr2;
        final q3 q3Var;
        fh0 fh0Var;
        int i13;
        boolean[] zArr2;
        int i14;
        o4.b1 b1Var2;
        ?? r42;
        org.telegram.ui.ActionBar.t2 t2Var;
        int i15;
        TLRPC.User a22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i3};
        long e10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).e();
        final hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
        cb0 cb0Var2 = new cb0(context, e6Var);
        int i16 = q4Var.a;
        int i17 = q4Var.c;
        int i18 = q4Var.b;
        cb0Var2.setTextColor(i16);
        cb0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var2.setItemCount(5);
        final q3 q3Var2 = new q3(context, e6Var);
        q3Var2.setWrapSelectorWheel(true);
        q3Var2.setAllItemsCount(24);
        q3Var2.setItemCount(5);
        q3Var2.setTextColor(i16);
        q3Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final r3 r3Var = new r3(context, e6Var);
        r3Var.setWrapSelectorWheel(true);
        r3Var.setAllItemsCount(60);
        r3Var.setItemCount(5);
        r3Var.setTextColor(i16);
        r3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        n3 n3Var = new n3(context, cb0Var2, q3Var2, r3Var, 1);
        n3Var.setClipToPadding(false);
        n3Var.setClipChildren(false);
        n3Var.setOrientation(1);
        frameLayout2.addView(n3Var, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        n3Var.addView(frameLayout4, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i10 = 0;
        } else if (j10 == e10) {
            i10 = 0;
            textView.setText(org.telegram.messenger.bd.M0(2131745524, null));
        } else {
            i10 = 0;
            textView.setText(org.telegram.messenger.bd.M0(2131745869, null));
        }
        textView.setTextColor(i16);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout4.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        boolean[] zArr3 = new boolean[1];
        zArr3[i10] = true;
        if (!org.telegram.messenger.m5.E(j10) || j10 == e10 || (a22 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).a2(Long.valueOf(j10))) == null || a22.bot || (userStatus = a22.status) == null || userStatus.expires <= 0) {
            r82 = n3Var;
            context2 = context;
            viewGroup = frameLayout2;
            frameLayout = frameLayout3;
            cb0Var = cb0Var2;
            j12 = e10;
            zArr = zArr3;
            viewGroup2 = frameLayout4;
            q0Var = null;
        } else {
            String j13 = org.telegram.messenger.l10.j(a22, true);
            if (j13.length() > 10) {
                j13 = j13.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout3;
            r82 = n3Var;
            cb0Var = cb0Var2;
            j12 = e10;
            viewGroup2 = frameLayout4;
            zArr = zArr3;
            viewGroup = frameLayout2;
            q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, q4Var.a, false, e6Var);
            context2 = context;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(R.drawable.ic_ab_other);
            q0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(i17, 1, -1));
            viewGroup2.addView(q0Var, b8.mf.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            q0Var.f(1, org.telegram.messenger.bd.a0(null, null, 2131745860, j13));
            q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        }
        if (q0Var != null) {
            q0Var.setOnClickListener(new org.telegram.messenger.video.g(26, q0Var, q4Var));
            q0Var.setDelegate(new aa.a(r4Var, zArr, dVar, 18));
        }
        fh0 fh0Var2 = new fh0(context2);
        final ch0 ch0Var = new ch0(R.raw.notify_toggle, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        ch0Var.J(true);
        ch0Var.h = true;
        ch0Var.start();
        ch0Var.M(40);
        ch0Var.P(40);
        fh0Var2.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var2.setAnimation(ch0Var);
        fh0Var2.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        fh0Var2.setBackground(org.telegram.ui.ActionBar.k6.h0(i17, 1, -1));
        viewGroup2.addView(fh0Var2, b8.mf.d(40, 40.0f, 53, 0.0f, 8.0f, (q0Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.q0 q0Var2 = q0Var;
        final ci.ec ecVar = new ci.ec(context2, 14);
        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(365);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new c(4));
        final cb0 cb0Var3 = cb0Var;
        ViewGroup viewGroup3 = viewGroup;
        final boolean[] zArr4 = zArr;
        final long j14 = j12;
        ab0 ab0Var = new ab0() { // from class: org.telegram.ui.Components.i1
            @Override // org.telegram.ui.Components.ab0
            public final void l(cb0 cb0Var4, int i19) {
                t4.g(ci.ec.this, null, 0L, 0L, j14 == j10 ? 1 : 0, cb0Var3, q3Var2, r3Var);
            }
        };
        cb0Var3.setOnValueChangedListener(ab0Var);
        q3Var2.setMinValue(0);
        q3Var2.setMaxValue(23);
        linearLayout.addView(q3Var2, b8.mf.l(0.2f, 0, org.telegram.messenger.hs.t4));
        q3Var2.setFormatter(new c(6));
        q3Var2.setOnValueChangedListener(ab0Var);
        r3Var.setMinValue(0);
        r3Var.setMaxValue(59);
        r3Var.setValue(0);
        r3Var.setFormatter(new c(9));
        linearLayout.addView(r3Var, b8.mf.l(0.3f, 0, org.telegram.messenger.hs.t4));
        r3Var.setOnValueChangedListener(ab0Var);
        if (j11 <= 0 || j11 == 2147483646) {
            calendar = calendar2;
        } else {
            long j15 = 1000 * j11;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j15 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j15);
            if (timeInMillis >= 0) {
                r3Var.setValue(calendar.get(12));
                q3Var2.setValue(calendar.get(11));
                cb0Var3.setValue(timeInMillis);
            }
        }
        boolean[] zArr5 = {true};
        g(ecVar, null, 0L, 0L, j14 == j10 ? 1 : 0, cb0Var3, q3Var2, r3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).isTestBackend();
        if (isTestBackend) {
            i11 = 10;
            i12 = 8;
            iArr = new int[]{0, 60, org.telegram.messenger.hs.X4, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            i11 = 10;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            i12 = 8;
        }
        if (isTestBackend) {
            strArr = new String[i11];
            b1Var = null;
            strArr[0] = org.telegram.messenger.bd.M0(2131748508, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.bd.M0(2131748510, null);
            strArr[4] = org.telegram.messenger.bd.M0(2131748507, null);
            strArr[5] = org.telegram.messenger.bd.M0(2131748511, null);
            strArr[6] = org.telegram.messenger.bd.M0(2131748509, null);
            strArr[7] = org.telegram.messenger.bd.M0(2131748513, null);
            strArr[i12] = org.telegram.messenger.bd.M0(2131748512, null);
            strArr[9] = org.telegram.messenger.bd.M0(2131748506, null);
        } else {
            b1Var = null;
            strArr = new String[i12];
            strArr[0] = org.telegram.messenger.bd.M0(2131748508, null);
            strArr[1] = org.telegram.messenger.bd.M0(2131748510, null);
            strArr[2] = org.telegram.messenger.bd.M0(2131748507, null);
            strArr[3] = org.telegram.messenger.bd.M0(2131748511, null);
            strArr[4] = org.telegram.messenger.bd.M0(2131748509, null);
            strArr[5] = org.telegram.messenger.bd.M0(2131748513, null);
            strArr[6] = org.telegram.messenger.bd.M0(2131748512, null);
            strArr[7] = org.telegram.messenger.bd.M0(2131748506, null);
        }
        int[] iArr4 = iArr;
        if (z10) {
            iArr2 = iArr4;
            strArr2 = strArr;
            q3Var = q3Var2;
            fh0Var = fh0Var2;
            i13 = i18;
            zArr2 = zArr5;
            i14 = 0;
            b1Var2 = b1Var;
            r42 = b1Var2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            int w10 = org.telegram.ui.ActionBar.k6.w(i18, org.telegram.ui.ActionBar.k6.r1(0.075f, i16));
            String[] strArr3 = strArr;
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i16);
            ?? textView2 = new TextView(context2);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i16);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.k6.w(w10, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w10, w11, w11));
            textView2.setGravity(17);
            q3Var = q3Var2;
            fh0Var = fh0Var2;
            i13 = i18;
            zArr2 = zArr5;
            i14 = 0;
            strArr2 = strArr3;
            b1Var2 = new o4.b1(iArr4, iArr3, strArr2, textView2, 22);
            iArr2 = iArr4;
            b1Var2.run();
            frameLayout5.addView(textView2, b8.mf.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout5, b8.mf.o(-1, -2));
            b1Var = textView2;
            r42 = frameLayout5;
        }
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), i14, org.telegram.messenger.g0.L(34.0f), i14);
        ecVar.setGravity(17);
        ecVar.setTextColor(q4Var.g);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        int i19 = q4Var.h;
        float[] fArr = new float[1];
        fArr[i14] = 24.0f;
        ecVar.setBackground(org.telegram.ui.ActionBar.y5.e(i19, fArr));
        r82.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        final boolean[] zArr6 = zArr2;
        ecVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr6[0] = false;
                int i20 = j14 == j10 ? 1 : 0;
                cb0 cb0Var4 = cb0Var3;
                q3 q3Var3 = q3Var;
                r3 r3Var2 = r3Var;
                boolean g7 = t4.g(null, null, 0L, 0L, i20, cb0Var4, q3Var3, r3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, cb0Var4.getValue());
                calendar4.set(11, q3Var3.getValue());
                calendar4.set(12, r3Var2.getValue());
                if (g7) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                r4Var.L((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], zArr4[0]);
                ((org.telegram.ui.ActionBar.t2) dVar.b).y0.run();
            }
        });
        org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) dVar.b;
        t2Var2.O = viewGroup3;
        t2Var2.show();
        t2Var2.setOnDismissListener(new y1(runnable, zArr6));
        t2Var2.v0(i13);
        t2Var2.O(i13);
        if (b1Var != null) {
            String[] strArr4 = strArr2;
            i15 = 1;
            t2Var = t2Var2;
            b1Var.setOnClickListener(new b3(frameLayout, e6Var, t2Var, (FrameLayout) r42, iArr2, strArr4, iArr3, b1Var2));
        } else {
            t2Var = t2Var2;
            i15 = 1;
        }
        final gi.l3[] l3VarArr = new gi.l3[i15];
        final org.telegram.ui.ActionBar.t2 t2Var3 = t2Var;
        fh0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String M0;
                boolean[] zArr7 = zArr4;
                boolean z11 = zArr7[0];
                zArr7[0] = !z11;
                ch0 ch0Var2 = ch0Var;
                if (z11) {
                    if (ch0Var2.b0 < 40) {
                        ch0Var2.M(40);
                    }
                    ch0Var2.P(80);
                    ch0Var2.start();
                } else {
                    if (ch0Var2.b0 >= 40) {
                        ch0Var2.M(0);
                    }
                    ch0Var2.P(40);
                    ch0Var2.start();
                }
                gi.l3[] l3VarArr2 = l3VarArr;
                gi.l3 l3Var = l3VarArr2[0];
                if (l3Var != null) {
                    l3Var.f(true);
                    l3VarArr2[0] = null;
                }
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0);
                long j16 = j10;
                TLRPC.User a23 = s12.a2(Long.valueOf(j16));
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(-j16));
                gi.l3 l3Var2 = new gi.l3(context, 3);
                l3VarArr2[0] = l3Var2;
                l3Var2.t();
                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                l3Var2.s(20.0f);
                float L2 = org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(4.0f);
                int r13 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                l3Var2.j0 = L2;
                l3Var2.k0 = L3;
                l3Var2.l0 = r13;
                l3Var2.G.setShadowLayer(L2, 0.0f, L3, r13);
                if (org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.bd.M0(zArr7[0] ? 2131745864 : 2131745868, null);
                } else if (M02 != null || a23 == null) {
                    M0 = org.telegram.messenger.bd.M0(zArr7[0] ? 2131745862 : 2131745866, null);
                } else if (j16 == j14) {
                    M0 = org.telegram.messenger.bd.M0(zArr7[0] ? 2131745861 : 2131745865, null);
                } else {
                    M0 = org.telegram.messenger.bd.a0(null, null, zArr7[0] ? 2131745863 : 2131745867, org.telegram.messenger.l10.k(a23));
                }
                l3Var2.u(M0);
                l3Var2.d = 5000L;
                l3Var2.o(1.0f, -((q0Var2 != null ? 42 : -8) + 20));
                l3Var2.r0 = new z2(l3Var2, 0);
                org.telegram.ui.ActionBar.t2 t2Var4 = t2Var3;
                t2Var4.b.setClipToPadding(false);
                t2Var4.b.setClipChildren(false);
                t2Var4.b.addView(l3Var2, b8.mf.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                l3Var2.w();
            }
        });
        return dVar;
    }

    public static void K(Context context, long j10, r4 r4Var) {
        J(context, j10, -1L, 0, false, r4Var, null, new q4(null), null);
    }

    public static void L(Context context, long j10, r4 r4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        J(context, j10, -1L, 0, false, r4Var, null, new q4(e6Var), e6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        if (str == null) {
            str = org.telegram.messenger.bd.M0(R.string.AppName, null);
        }
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = str;
        s1Var.U = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(str3, new u0(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.s1 O(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = str;
        s1Var.U = charSequence;
        alertDialog$Builder.k(str2, new u0(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.f1 P(org.telegram.ui.ActionBar.d2 d2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (d2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        f1Var.e = true;
        f1Var.c = org.telegram.messenger.hs.x3;
        f1Var.setOutsideTouchable(true);
        f1Var.setClippingEnabled(true);
        f1Var.setAnimationStyle(R.style.PopupContextAnimation);
        f1Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        f1Var.setInputMethodMode(2);
        f1Var.getContentView().setFocusableInTouchMode(true);
        float f12 = 0.0f;
        View view2 = view;
        float f13 = 0.0f;
        while (view2 != view.getRootView()) {
            f12 += view2.getX();
            f13 += view2.getY();
            view2 = (View) view2.getParent();
            if (view2 == null) {
                break;
            }
        }
        f1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        f1Var.b();
        return f1Var;
    }

    public static void Q(Context context, org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, String str3, String str4, int i3, String str5, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.or orVar) {
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = str == null ? org.telegram.messenger.bd.M0(R.string.AppName, null) : str;
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = str2;
        s4 s4Var = new s4(context);
        s4Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(s4Var, i10, e6Var);
        org.telegram.ui.ActionBar.r6.E(s4Var, org.telegram.ui.ActionBar.k6.Li, e6Var);
        s4Var.setHint(str3);
        s4Var.setFocusable(true);
        s4Var.setInputType(147457);
        s4Var.setImeOptions(6);
        s4Var.setMaxLines(10);
        s4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        s4Var.setCursorWidth(1.5f);
        s4Var.z(org.telegram.ui.ActionBar.k6.q6, e6Var);
        if (str4 != null) {
            s4Var.setText(str4);
        }
        s4Var.setOnEditorActionListener(new lg.q(s4Var, i3, orVar, s1VarArr, currentFocus, 1));
        s4Var.addTextChangedListener(new org.telegram.ui.Cells.j3(i3, s4Var));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i10);
        s4Var.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(s4Var, d02, L, null, e6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView(s4Var, b8.mf.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        s1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
        alertDialog$Builder.k(str5, new k2.y(s4Var, i3, orVar, 8));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new c(16));
        s1VarArr[0] = s1Var;
        if (d2Var != null) {
            org.telegram.messenger.g0.Z2(W, d2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
        s1Var2.k0 = false;
        s1Var2.setOnDismissListener(new ai.o(s4Var, d2Var, W, 4));
        s1VarArr[0].setOnShowListener(new t0(1, s4Var));
        s1VarArr[0].show();
        s4Var.setSelection(s4Var.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.or orVar) {
        Q(context, d2Var, org.telegram.messenger.bd.M0(2131744809, null), org.telegram.messenger.bd.M0(2131744816, null), org.telegram.messenger.bd.M0(2131744790, null), null, 12, org.telegram.messenger.bd.M0(2131751753, null), e6Var, orVar);
    }

    public static hi.d S(Context context, long j10, final r4 r4Var, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        int i10;
        int i11;
        int i12;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        int i13 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        if (context == null) {
            return null;
        }
        final hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
        final cb0 cb0Var = new cb0(context, e6Var);
        cb0Var.setTextColor(x02);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        final l4 l4Var = new l4(context, e6Var);
        l4Var.setWrapSelectorWheel(true);
        l4Var.setAllItemsCount(24);
        l4Var.setItemCount(5);
        l4Var.setTextColor(x02);
        l4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final m4 m4Var = new m4(context, e6Var);
        m4Var.setWrapSelectorWheel(true);
        m4Var.setAllItemsCount(60);
        m4Var.setItemCount(5);
        m4Var.setTextColor(x02);
        m4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        n3 n3Var = new n3(context, cb0Var, l4Var, m4Var, 7);
        n3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        n3Var.addView(f10, b8.mf.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(i3 == 1 ? 2131744384 : 2131747103, null));
        textView.setTextColor(x02);
        k2.p1.t(textView, 1, 20.0f);
        f10.addView(textView, b8.mf.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new fi.a(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, e6Var);
        k2.p1.u(textView2, 1, 14.0f, null, 2131747102);
        f10.addView(textView2, b8.mf.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i14 = calendar.get(1);
        hi.d dVar2 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).x7.j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long g22 = dVar2.g2(timeUnit) * 2;
        final long g23 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).x7.k.g2(timeUnit) - 86400;
        final ci.ec ecVar = new ci.ec(context, 21);
        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(365);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new k2.v(i14, 8));
        final int i15 = i3 == 1 ? 5 : 3;
        ab0 ab0Var = new ab0() { // from class: org.telegram.ui.Components.t1
            @Override // org.telegram.ui.Components.ab0
            public final void l(cb0 cb0Var2, int i16) {
                t4.g(ci.ec.this, null, g22, g23, i15, cb0Var, l4Var, m4Var);
            }
        };
        cb0Var.setOnValueChangedListener(ab0Var);
        l4Var.setMinValue(0);
        l4Var.setMaxValue(23);
        linearLayout.addView(l4Var, b8.mf.l(0.2f, 0, org.telegram.messenger.hs.t4));
        l4Var.setFormatter(new c(11));
        l4Var.setOnValueChangedListener(ab0Var);
        m4Var.setMinValue(0);
        m4Var.setMaxValue(59);
        m4Var.setValue(0);
        m4Var.setFormatter(new c(12));
        linearLayout.addView(m4Var, b8.mf.l(0.3f, 0, org.telegram.messenger.hs.t4));
        m4Var.setOnValueChangedListener(ab0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            i10 = x03;
            i11 = i13;
            i12 = x04;
        } else {
            long j11 = 1000 * j10;
            i10 = x03;
            i11 = i13;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i12 = x04;
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                m4Var.setValue(calendar.get(12));
                l4Var.setValue(calendar.get(11));
                cb0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(ecVar, null, g22, g23, i15, cb0Var, l4Var, m4Var);
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar.setGravity(17);
        ecVar.setTextColor(i12);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        ecVar.setBackground(org.telegram.ui.ActionBar.y5.e(x05, 8.0f));
        n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i15;
        ecVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j12 = g22;
                long j13 = g23;
                int i17 = i16;
                cb0 cb0Var2 = cb0Var;
                l4 l4Var2 = l4Var;
                m4 m4Var2 = m4Var;
                boolean g7 = t4.g(null, null, j12, j13, i17, cb0Var2, l4Var2, m4Var2);
                long epochMilli = LocalDate.now().plusDays(cb0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, l4Var2.getValue());
                calendar2.set(12, m4Var2.getValue());
                if (g7) {
                    calendar2.set(13, 0);
                }
                r4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.t2) dVar.b).y0.run();
            }
        });
        b8.pf.b(ecVar, 0.02f, 1.2f);
        ci.ec ecVar2 = new ci.ec(context, 22);
        ecVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar2.setGravity(17);
        ecVar2.setText(org.telegram.messenger.bd.M0(i3 == 1 ? 2131748479 : 2131747100, null));
        ecVar2.setTextColor(x05);
        ecVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i17 = org.telegram.ui.ActionBar.k6.d6;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        ecVar2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(ecVar2, k02, N, N2, null);
        n3Var.addView(ecVar2, b8.mf.t(-1, 48, 83, 16, 0, 16, 16));
        ecVar2.setOnClickListener(new ai.h(zArr, r4Var, dVar, 21));
        b8.pf.b(ecVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
        t2Var.O = n3Var;
        t2Var.show();
        t2Var.setOnDismissListener(new gi.d1(zArr));
        t2Var.v0(i10);
        t2Var.O(i10);
        return dVar;
    }

    public static org.telegram.ui.ActionBar.s1 T(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return null;
        }
        s70 s70Var = new s70(d2Var.getParentActivity(), d2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.bd.M0(2131753985, null).replace("\n", "<br>")));
        int i3 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new g4(uRLSpan.getURL(), d2Var), spanStart, spanEnd, 0);
        }
        s70Var.setText(spannableString);
        s70Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.k5, e6Var);
        org.telegram.ui.ActionBar.r6.D(s70Var, org.telegram.ui.ActionBar.k6.l5, e6Var);
        s70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        s70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.j5, e6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var);
        alertDialog$Builder.o(s70Var);
        String M0 = org.telegram.messenger.bd.M0(2131753986, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753984, null), new v2(i3, d2Var));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131748595, null);
        cb0 cb0Var = new cb0(context, null);
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(20);
        int i3 = encryptedChat.ttl;
        if (i3 > 0 && i3 < 16) {
            cb0Var.setValue(i3);
        } else if (i3 == 30) {
            cb0Var.setValue(16);
        } else if (i3 == 60) {
            cb0Var.setValue(17);
        } else if (i3 == 3600) {
            cb0Var.setValue(18);
        } else if (i3 == 86400) {
            cb0Var.setValue(19);
        } else if (i3 == 604800) {
            cb0Var.setValue(20);
        } else if (i3 == 0) {
            cb0Var.setValue(0);
        }
        cb0Var.setFormatter(new c(26));
        alertDialog$Builder.o(cb0Var);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751355, null), new org.telegram.ui.jo(11, encryptedChat, cb0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.d2 d2Var, int i3, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        int i11;
        String sb2;
        if (d2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        s4 s4Var = new s4(parentActivity);
        String str = null;
        s4Var.setBackground(null);
        org.telegram.ui.ActionBar.r6.G(s4Var, org.telegram.ui.ActionBar.k6.u5, org.telegram.ui.ActionBar.k6.v5, org.telegram.ui.ActionBar.k6.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131748266, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751753, null), new c(27));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i3 != 0) {
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751115, null)));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131751116, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        linearLayout.addView(textView, b8.mf.o(-1, -2));
        s4Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(s4Var, i12, null);
        s4Var.setMaxLines(1);
        s4Var.setLines(1);
        s4Var.setInputType(16385);
        s4Var.setGravity(51);
        s4Var.setSingleLine(true);
        s4Var.setImeOptions(6);
        s4Var.z(org.telegram.ui.ActionBar.k6.G6, null);
        s4Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        s4Var.setCursorWidth(1.5f);
        s4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(s4Var, b8.mf.t(-1, 36, 51, 24, 6, 24, 0));
        s4Var.setOnEditorActionListener(new i2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        com.google.android.recaptcha.internal.a.w(9306112, hashMap, "Berry", 14598550, "Brandy");
        com.google.android.recaptcha.internal.a.w(8391495, hashMap, "Cherry", 16744272, "Coral");
        com.google.android.recaptcha.internal.a.w(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        com.google.android.recaptcha.internal.a.w(14725375, hashMap, "Mauve", 16761035, "Pink");
        com.google.android.recaptcha.internal.a.w(16711680, hashMap, "Red", 16711807, "Rose");
        com.google.android.recaptcha.internal.a.w(8406555, hashMap, "Russet", 16720896, "Scarlet");
        com.google.android.recaptcha.internal.a.w(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        com.google.android.recaptcha.internal.a.w(16760576, hashMap, "Amber", 15438707, "Apricot");
        com.google.android.recaptcha.internal.a.w(16508850, hashMap, "Banana", 10601738, "Citrus");
        com.google.android.recaptcha.internal.a.w(11560192, hashMap, "Ginger", 16766720, "Gold");
        com.google.android.recaptcha.internal.a.w(16640272, hashMap, "Lemon", 16753920, "Orange");
        com.google.android.recaptcha.internal.a.w(16770484, hashMap, "Peach", 16739155, "Persimmon");
        com.google.android.recaptcha.internal.a.w(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        com.google.android.recaptcha.internal.a.w(16763004, hashMap, "Topaz", 16776960, "Yellow");
        com.google.android.recaptcha.internal.a.w(3688720, hashMap, "Clover", 8628829, "Cucumber");
        com.google.android.recaptcha.internal.a.w(5294200, hashMap, "Emerald", 11907932, "Olive");
        com.google.android.recaptcha.internal.a.w(65280, hashMap, "Green", 43115, "Jade");
        com.google.android.recaptcha.internal.a.w(2730887, hashMap, "Jungle", 12582656, "Lime");
        com.google.android.recaptcha.internal.a.w(776785, hashMap, "Malachite", 10026904, "Mint");
        com.google.android.recaptcha.internal.a.w(11394989, hashMap, "Moss", 3234721, "Azure");
        com.google.android.recaptcha.internal.a.w(org.telegram.messenger.hs.e4, hashMap, "Blue", 18347, "Cobalt");
        com.google.android.recaptcha.internal.a.w(5204422, hashMap, "Indigo", 96647, "Lagoon");
        com.google.android.recaptcha.internal.a.w(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        com.google.android.recaptcha.internal.a.w(128, hashMap, "Navy", 3101086, "Sapphire");
        com.google.android.recaptcha.internal.a.w(7788522, hashMap, "Sky", 32896, "Teal");
        com.google.android.recaptcha.internal.a.w(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        com.google.android.recaptcha.internal.a.w(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        com.google.android.recaptcha.internal.a.w(13148872, hashMap, "Lilac", 11894492, "Lavender");
        com.google.android.recaptcha.internal.a.w(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        com.google.android.recaptcha.internal.a.w(6684825, hashMap, "Purple", 14204888, "Thistle");
        com.google.android.recaptcha.internal.a.w(14315734, hashMap, "Orchid", 2361920, "Violet");
        com.google.android.recaptcha.internal.a.w(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        com.google.android.recaptcha.internal.a.w(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        com.google.android.recaptcha.internal.a.w(7365973, hashMap, "Coffee", 7956873, "Rum");
        com.google.android.recaptcha.internal.a.w(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        com.google.android.recaptcha.internal.a.w(12759680, hashMap, "Sand", 8924439, "Sienna");
        com.google.android.recaptcha.internal.a.w(7864585, hashMap, "Maple", 15787660, "Khaki");
        com.google.android.recaptcha.internal.a.w(12088115, hashMap, "Copper", 12144200, "Chestnut");
        com.google.android.recaptcha.internal.a.w(15653316, hashMap, "Almond", 16776656, "Cream");
        com.google.android.recaptcha.internal.a.w(12186367, hashMap, "Diamond", 11109127, "Honey");
        com.google.android.recaptcha.internal.a.w(16777200, hashMap, "Ivory", 15392968, "Pearl");
        com.google.android.recaptcha.internal.a.w(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        com.google.android.recaptcha.internal.a.w(16777215, hashMap, "White", 8421504, "Gray");
        com.google.android.recaptcha.internal.a.w(0, hashMap, "Black", 15266260, "Chrome");
        com.google.android.recaptcha.internal.a.w(3556687, hashMap, "Charcoal", 789277, "Ebony");
        com.google.android.recaptcha.internal.a.w(12632256, hashMap, "Silver", 16119285, "Smoke");
        com.google.android.recaptcha.internal.a.w(2499381, hashMap, "Steel", 5220413, "Apple");
        com.google.android.recaptcha.internal.a.w(8434628, hashMap, "Glacier", 16693933, "Melon");
        com.google.android.recaptcha.internal.a.w(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.g6 k10 = g6Var == null ? org.telegram.ui.ActionBar.k6.D0().k(false) : g6Var;
        if (k10 == null || (i10 = k10.c) == 0) {
            i10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.k6.s0())[0];
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        Iterator it = hashMap.entrySet().iterator();
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (true) {
            i11 = 2;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
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
            sb2 = org.telegram.ui.Cells.f1.r((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder h = t4.c.h(str, " ");
            h.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = h.toString();
        }
        s4Var.setText(sb2);
        s4Var.setSelection(s4Var.length());
        t0 t0Var = new t0(i11, s4Var);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.setOnShowListener(t0Var);
        d2Var.showDialog(s1Var);
        s4Var.requestFocus();
        s1Var.d(-1).setOnClickListener(new ei.f0(d2Var, s4Var, g6Var, j6Var, s1Var, 9));
    }

    public static void W(Activity activity, String str, int i3, int i10, int i11, org.telegram.messenger.u10 u10Var) {
        if (activity == null) {
            return;
        }
        final int i12 = 0;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        final int i13 = 1;
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(activity, false, 1, null);
        h.w0 = false;
        m3 m3Var = new m3(activity, null);
        n3 n3Var = new n3(activity, m3Var);
        n3Var.setOrientation(0);
        n3Var.setWeightSum(1.0f);
        m3Var.setAllItemsCount(24);
        m3Var.setItemCount(5);
        m3Var.setTextColor(x02);
        m3Var.setGravity(5);
        m3Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        o3 o3Var = new o3(activity, null);
        o3Var.setWrapSelectorWheel(true);
        o3Var.setAllItemsCount(60);
        o3Var.setItemCount(5);
        o3Var.setTextColor(x02);
        o3Var.setGravity(3);
        o3Var.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final ci.e4 e4Var = new ci.e4(i10, i11, m3Var, o3Var, i3, n3Var);
        n3Var.addView(m3Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
        m3Var.setFormatter(new c(24));
        m3Var.setOnValueChangedListener(new ab0() { // from class: org.telegram.ui.Components.f2
            @Override // org.telegram.ui.Components.ab0
            public final void l(cb0 cb0Var, int i14) {
                switch (i12) {
                    case 0:
                        e4Var.a(Boolean.TRUE);
                        break;
                    default:
                        e4Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        n3Var.addView(o3Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
        o3Var.setFormatter(new c(25));
        o3Var.setOnValueChangedListener(new ab0() { // from class: org.telegram.ui.Components.f2
            @Override // org.telegram.ui.Components.ab0
            public final void l(cb0 cb0Var, int i14) {
                switch (i13) {
                    case 0:
                        e4Var.a(Boolean.TRUE);
                        break;
                    default:
                        e4Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        e4Var.a(Boolean.FALSE);
        p3 p3Var = new p3(activity, m3Var, o3Var);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        p3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        p3Var.addView(n3Var, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        gi.d dVar = new gi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.bd.M0(2131745682, null), false, true);
        dVar.setOnClickListener(new g2(r1, i12));
        p3Var.addView(dVar, b8.mf.t(-1, 48, 0, 16, 12, 16, 12));
        h.O = p3Var;
        h.show();
        h.setOnDismissListener(new ai.o(u10Var, m3Var, o3Var, 5));
        h.v0(x03);
        h.O(x03);
        org.telegram.ui.ActionBar.t2[] t2VarArr = {h};
    }

    public static org.telegram.ui.ActionBar.s1 X(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).d7;
        boolean z10 = true;
        final int[] iArr = new int[1];
        if (j10 != 0) {
            int i3 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i3;
            if (i3 == 3) {
                iArr[0] = 2;
            } else if (i3 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{org.telegram.messenger.bd.M0(2131743623, null), org.telegram.messenger.bd.M0(2131745376, null), org.telegram.messenger.bd.M0(2131748731, null), org.telegram.messenger.bd.M0(2131743622, null)};
        } else {
            int i10 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = 1;
            } else if (i10 == 1) {
                iArr[0] = 2;
            } else if (i10 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{org.telegram.messenger.bd.M0(2131743622, null), org.telegram.messenger.bd.M0(2131743623, null), org.telegram.messenger.bd.M0(2131745376, null), org.telegram.messenger.bd.M0(2131748731, null), org.telegram.messenger.bd.M0(2131747829, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i11));
            a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, e6Var);
            i6Var.b(strArr2[i11], iArr[0] == i11 ? z10 : false);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.t2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).d7.edit();
                    long j12 = j10;
                    String str3 = str2;
                    if (j12 != 0) {
                        int i12 = iArr2[0];
                        if (i12 == 0) {
                            edit.putInt(str3, 0);
                        } else if (i12 == 1) {
                            edit.putInt(str3, 1);
                        } else if (i12 == 2) {
                            edit.putInt(str3, 3);
                        } else if (i12 == 3) {
                            edit.putInt(str3, 2);
                        }
                        org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).l(j12, j11);
                    } else {
                        int i13 = iArr2[0];
                        if (i13 == 0) {
                            edit.putInt(str3, 2);
                        } else if (i13 == 1) {
                            edit.putInt(str3, 0);
                        } else if (i13 == 2) {
                            edit.putInt(str3, 1);
                        } else if (i13 == 3) {
                            edit.putInt(str3, 3);
                        } else if (i13 == 4) {
                            edit.putInt(str3, 4);
                        }
                        if (str3.equals("vibrate_channel")) {
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).m(2);
                        } else if (str3.equals("vibrate_group")) {
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).m(0);
                        } else if (str3.equals("vibrate_react")) {
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).m(4);
                        } else {
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.a.O0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
            z10 = true;
        }
        String M0 = org.telegram.messenger.bd.M0(2131743624, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.s1 Y(Context context, org.telegram.ui.ActionBar.e6 e6Var, String[] strArr, int i3, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i3, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = X2;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(z10 ? 2131747308 : 2131752909, null), new ga.b(z10, context, atomicBoolean, aVar, 4));
        int i11 = 8;
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752904, null), new org.telegram.ui.jo(i11, atomicBoolean, aVar));
        s1Var.setOnDismissListener(new ci.h3(i11, atomicBoolean, aVar));
        return s1Var;
    }

    public static void Z(int i3, int i10, long j10, org.telegram.messenger.u10 u10Var) {
        a0(i3, j10, i10, u10Var, 0L);
    }

    public static void a(org.telegram.ui.Cells.i6 i6Var, int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        for (int i11 = 0; i11 < i6Var.getChildCount(); i11++) {
            View childAt = i6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.r6.P((RadioButton) childAt, i3, i10, e6Var);
                return;
            }
        }
        i6Var.a(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a0(final int i3, final long j10, int i10, org.telegram.messenger.u10 u10Var, long j11) {
        org.telegram.ui.ActionBar.e6 bVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.Chat chat;
        char c2;
        Activity activity;
        long N1 = org.telegram.messenger.hp.s1(i3).N1(j10);
        if (N1 <= 0 && j10 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(i3).J2(j10));
        }
        long j12 = i10 * N1;
        ci.e9.y(i3, false).P.put(Long.valueOf(j10), Integer.valueOf(i10));
        if (j12 <= 0 || j11 == j12) {
            u10Var.a(Long.valueOf(j12));
            return false;
        }
        final long j13 = N1;
        final d1 d1Var = new d1(i3, j12, j10, u10Var, j13, 1);
        if (j13 <= org.telegram.messenger.hp.s1(i3).e7.getLong(t4.c.e(j10, "ask_paid_message_", "_price"), 0L)) {
            d1Var.run();
            return true;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (PhotoViewer.v1().U1() || (T != null && T.hasShownSheet())) {
            bVar = new ei.b();
        } else {
            if (T == null) {
                e6Var = null;
                String s6 = org.telegram.messenger.m5.s(i3, j10);
                if (!org.telegram.messenger.t3.o0(i3, j10)) {
                    s6 = rg.c.h(i3, j10);
                } else if (T instanceof org.telegram.ui.wm) {
                    org.telegram.ui.wm wmVar = (org.telegram.ui.wm) T;
                    if (wmVar.v4 && wmVar.a() == j10 && (chat = wmVar.u4) != null) {
                        c2 = 0;
                        activity = u02;
                        s6 = org.telegram.messenger.m5.s(i3, -chat.id);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i11 = (int) j13;
                        Object[] objArr = new Object[1];
                        objArr[c2] = s6;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.K("MessageLockedStarsConfirmMessage1", i11, ',', objArr)));
                        spannableStringBuilder.append((CharSequence) " ");
                        if (i10 == 1) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessage2One", i11)));
                        } else {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessage2Many1", (int) j12)));
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessage2Many2", i10)));
                        }
                        h0(activity, org.telegram.messenger.bd.M0(2131748562, null), spannableStringBuilder, org.telegram.messenger.bd.M0(2131748575, null), org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.k1
                            @Override // org.telegram.messenger.u10
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i12 = i3;
                                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i12).e7.edit();
                                    long j14 = j10;
                                    edit.putLong(t4.c.e(j14, "ask_paid_message_", "_price"), j13).apply();
                                    ci.e9.y(i12, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                                }
                                org.telegram.messenger.g0.h3(d1Var);
                            }
                        }, e6Var, true);
                        return true;
                    }
                }
                c2 = 0;
                activity = u02;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i112 = (int) j13;
                Object[] objArr2 = new Object[1];
                objArr2[c2] = s6;
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.K("MessageLockedStarsConfirmMessage1", i112, ',', objArr2)));
                spannableStringBuilder2.append((CharSequence) " ");
                if (i10 == 1) {
                }
                h0(activity, org.telegram.messenger.bd.M0(2131748562, null), spannableStringBuilder2, org.telegram.messenger.bd.M0(2131748575, null), org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.k1
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i12 = i3;
                            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i12).e7.edit();
                            long j14 = j10;
                            edit.putLong(t4.c.e(j14, "ask_paid_message_", "_price"), j13).apply();
                            ci.e9.y(i12, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                        }
                        org.telegram.messenger.g0.h3(d1Var);
                    }
                }, e6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        e6Var = bVar;
        String s62 = org.telegram.messenger.m5.s(i3, j10);
        if (!org.telegram.messenger.t3.o0(i3, j10)) {
        }
        c2 = 0;
        activity = u02;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
        int i1122 = (int) j13;
        Object[] objArr22 = new Object[1];
        objArr22[c2] = s62;
        spannableStringBuilder22.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.K("MessageLockedStarsConfirmMessage1", i1122, ',', objArr22)));
        spannableStringBuilder22.append((CharSequence) " ");
        if (i10 == 1) {
        }
        h0(activity, org.telegram.messenger.bd.M0(2131748562, null), spannableStringBuilder22, org.telegram.messenger.bd.M0(2131748575, null), org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.k1
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i12 = i3;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i12).e7.edit();
                    long j14 = j10;
                    edit.putLong(t4.c.e(j14, "ask_paid_message_", "_price"), j13).apply();
                    ci.e9.y(i12, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                }
                org.telegram.messenger.g0.h3(d1Var);
            }
        }, e6Var, true);
        return true;
    }

    public static void b(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i3 = 1;
        int i10 = calendar.get(1);
        int i11 = calendar.get(2);
        int i12 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i13 = calendar.get(1);
        int i14 = calendar.get(2);
        int i15 = calendar.get(5);
        cb0Var3.setMaxValue(i13);
        cb0Var3.setMinValue(i10);
        int value = cb0Var3.getValue();
        cb0Var2.setMaxValue(value == i13 ? i14 : 11);
        cb0Var2.setMinValue(value == i10 ? i11 : 0);
        int value2 = cb0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i13 && value2 == i14) {
            actualMaximum = Math.min(i15, actualMaximum);
        }
        cb0Var.setMaxValue(actualMaximum);
        if (value == i10 && value2 == i11) {
            i3 = i12;
        }
        cb0Var.setMinValue(i3);
    }

    public static boolean b0(int i3, ArrayList arrayList, int i10, org.telegram.messenger.u10 u10Var) {
        org.telegram.ui.ActionBar.e6 bVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            u10Var.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        boolean z11 = true;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Long l10 = (Long) obj;
            long j11 = j10;
            long longValue = l10.longValue();
            long N1 = org.telegram.messenger.hp.s1(i3).N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(i3).J2(longValue));
            }
            hashMap.put(l10, Long.valueOf(N1));
            long j12 = j11 + N1;
            boolean z12 = z10;
            ci.e9.y(i3, z10).P.put(l10, Integer.valueOf(i10));
            if (N1 > 0) {
                i11++;
            }
            if (N1 > 0 && z11 && org.telegram.messenger.hp.s1(i3).e7.getLong(t4.c.e(longValue, "ask_paid_message_", "_price"), 0L) < N1) {
                z11 = z12;
            }
            j10 = j12;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i10) * j10;
        if (z11 || max <= 0) {
            u10Var.a(hashMap);
            return z13;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (PhotoViewer.v1().U1() || (T != null && T.hasShownSheet())) {
            bVar = new ei.b();
        } else {
            if (T == null) {
                e6Var = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                spannableStringBuilder.append((CharSequence) " ");
                Object[] objArr = new Object[1];
                objArr[z13 ? 1 : 0] = org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                h0(u02, org.telegram.messenger.bd.M0(2131748562, null), spannableStringBuilder, org.telegram.messenger.bd.M0(2131748575, null), org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.rp(i3, max, u02, arrayList, hashMap, u10Var, e6Var), e6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        e6Var = bVar;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
        spannableStringBuilder2.append((CharSequence) " ");
        Object[] objArr2 = new Object[1];
        objArr2[z13 ? 1 : 0] = org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
        h0(u02, org.telegram.messenger.bd.M0(2131748562, null), spannableStringBuilder2, org.telegram.messenger.bd.M0(2131748575, null), org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.rp(i3, max, u02, arrayList, hashMap, u10Var, e6Var), e6Var, true);
        return true;
    }

    public static long c(gi.d dVar, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, cb0 cb0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i3 = 1;
        int i10 = calendar.get(1);
        int value = ((cb0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (cb0Var2.getValue() - 120) % 12);
        cb0Var.setMinValue(1);
        cb0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = cb0Var.getValue();
        int value3 = cb0Var3.getValue();
        int value4 = cb0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i3 = 0;
            } else if (i10 != value) {
                i3 = 2;
            }
            dVar.setText(org.telegram.messenger.bd.E0().x0(i3 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static boolean c0(int i3, long j10) {
        long N1 = org.telegram.messenger.hp.s1(i3).N1(j10);
        if (N1 <= 0 && j10 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(i3).J2(j10));
        }
        return N1 > 0 && N1 > org.telegram.messenger.hp.s1(i3).e7.getLong(t4.c.e(j10, "ask_paid_message_", "_price"), 0L);
    }

    public static void d(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i3 = 1;
        int i10 = calendar.get(1);
        int i11 = calendar.get(2);
        int i12 = calendar.get(5);
        cb0Var3.setMinValue(i10);
        int value = cb0Var3.getValue();
        cb0Var2.setMinValue(value == i10 ? i11 : 0);
        int value2 = cb0Var2.getValue();
        if (value == i10 && value2 == i11) {
            i3 = i12;
        }
        cb0Var.setMinValue(i3);
    }

    public static void d0(s4 s4Var, org.telegram.ui.ActionBar.s1 s1Var, org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.g0.v1(s4Var);
        String obj = s4Var.getText().toString();
        int i3 = org.telegram.ui.ActionBar.k6.a;
        org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6();
        j6Var.b = new File(org.telegram.messenger.t0.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
        j6Var.a = obj;
        org.telegram.ui.ActionBar.k6.h0 = org.telegram.ui.ActionBar.k6.b1(org.telegram.ui.ActionBar.k6.I.j0);
        j6Var.F = org.telegram.messenger.h10.t0;
        org.telegram.ui.ActionBar.k6.x1(j6Var, true, true, false);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.o4, new Object[0]);
        new ThemeEditorView().d(d2Var.getParentActivity(), j6Var);
        s1Var.dismiss();
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        if (e12.getBoolean("themehint", false)) {
            return;
        }
        e12.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(d2Var.getParentActivity(), org.telegram.messenger.bd.M0(2131751711, null), 1).show();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void e(TextView textView, cb0 cb0Var, x3 x3Var, y3 y3Var) {
        int value = cb0Var.getValue();
        int value2 = x3Var.getValue();
        int value3 = y3Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i3 = timeInMillis / 86400;
        int i10 = (timeInMillis % 86400) / 3600;
        int i11 = (timeInMillis % 3600) / 60;
        textView.setText(org.telegram.messenger.bd.a0(null, null, 2131747182, org.telegram.messenger.bd.a0(null, null, 2131747181, i3 > 0 ? org.telegram.messenger.bd.G(i3, "Days", new Object[0]) : "", i10 > 0 ? org.telegram.messenger.bd.G(i10, "Hours", new Object[0]) : "", i11 > 0 ? org.telegram.messenger.bd.G(i11, "Minutes", new Object[0]) : "").trim()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.s1 e0(final int i3, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, Object... objArr) {
        String str;
        char c2;
        String str2;
        final long j10;
        long n4;
        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o10 = ci.e9.o(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    n4 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    n4 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    n4 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    n4 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    n4 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                } else {
                    j10 = 0;
                    if (o10 > 0) {
                        ci.e9.y(i3, false).q(new Runnable() { // from class: org.telegram.ui.Components.a2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity u02 = org.telegram.messenger.g0.u0();
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.e6 bVar = (PhotoViewer.v1().U1() || (T != null && T.hasShownSheet())) ? new ei.b() : T != null ? T.getResourceProvider() : null;
                                int i10 = i3;
                                long j11 = j10;
                                new ci.mb(u02, bVar, o10, 13, org.telegram.messenger.m5.s(i10, j11), new org.telegram.messenger.hc(20), j11).show();
                            }
                        }, true, true);
                        return null;
                    }
                }
                j10 = n4;
                if (o10 > 0) {
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    t0(d2Var2, org.telegram.messenger.bd.M0(2131749374, null), org.telegram.messenger.bd.M0(2131749375, null), null);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z10 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long n10 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (n10 >= 0) {
                        str2 = org.telegram.messenger.l10.j(org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(n10)), true);
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-n10));
                        str2 = M0 != null ? M0.title : "";
                    }
                    if (d2Var2 == null) {
                        d2Var2 = LaunchActivity.Q();
                    }
                    t0(d2Var2, org.telegram.messenger.bd.M0(2131748547, null), org.telegram.messenger.bd.a0(null, null, 2131748548, str2), null);
                    org.telegram.messenger.hp.s1(i3).n2(0, n10);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.d2 Q = d2Var2 == null ? LaunchActivity.Q() : d2Var2;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749260, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749252, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749266, null), null);
                            return null;
                        }
                        t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749267, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749263, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749265, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749262, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749264, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        t0(Q, org.telegram.messenger.bd.M0(2131749261, null), org.telegram.messenger.bd.M0(2131749259, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        l0(tL_error.text, Q);
                        return null;
                    }
                    String M02 = org.telegram.messenger.bd.M0(2131749261, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error.text);
                    t0(Q, M02, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.d2 Q2 = d2Var2 == null ? LaunchActivity.Q() : d2Var2;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            t0(Q2, null, org.telegram.messenger.bd.M0(2131749187, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            t0(Q2, null, org.telegram.messenger.bd.M0(2131750688, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            w0(Q2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                            return null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                        sb3.append(tL_error.text);
                        t0(Q2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i10 = org.telegram.messenger.hs.M0;
                    if (z12 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (d2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (d2Var2.getParentActivity() != null) {
                                d2Var2.showDialog(new vg.i0(5, i3, d2Var2.getParentActivity(), d2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                d2Var2.presentFragment(new d81(0));
                                return null;
                            }
                            d2Var2.presentFragment(new d81(1));
                            return null;
                        }
                        if (d2Var2 != null) {
                            g0(tL_error, d2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            org.telegram.messenger.hs.f(i3).k(i10, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.d2 Q3 = d2Var2 == null ? LaunchActivity.Q() : d2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new vg.i0(5, i3, Q3.getParentActivity(), Q3, null));
                                    return null;
                                }
                                Q3.presentFragment(new d81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.d2 d2Var3 = Q3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                l0(tL_error.text, d2Var3);
                                return null;
                            }
                            g0(tL_error, d2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.d2 Q4 = d2Var2 == null ? LaunchActivity.Q() : d2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q4.getParentActivity() != null) {
                                    Q4.showDialog(new vg.i0(5, i3, Q4.getParentActivity(), Q4, null));
                                    return null;
                                }
                                Q4.presentFragment(new d81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.d2 d2Var4 = Q4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                l0(tL_error.text, d2Var4);
                                return null;
                            }
                            g0(tL_error, d2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (d2Var2 != null) {
                                    t0(d2Var2, null, org.telegram.messenger.bd.M0(2131751272, null), null);
                                    return null;
                                }
                                v0(org.telegram.messenger.bd.M0(2131751272, null), null);
                                return null;
                            }
                        } else {
                            if (z10 || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long n11 = z10 ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? org.telegram.messenger.m5.n(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str3 = tL_error.text;
                                if (str3 == null || !str3.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str4 = tL_error.text;
                                    str4.getClass();
                                    switch (str4) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            org.telegram.messenger.hs.f(i3).k(i10, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            org.telegram.messenger.hs.f(i3).k(i10, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            v0(org.telegram.messenger.bd.M0(2131748537, null), d2Var2);
                                            break;
                                    }
                                    return null;
                                }
                                String str5 = tL_error.text;
                                TLRPC.Chat M03 = n11 < 0 ? org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-n11)) : null;
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
                                            c2 = 3;
                                            break;
                                        }
                                        break;
                                    case 469767429:
                                        if (str6.equals("CHAT_SEND_DOCS_FORBIDDEN")) {
                                            c2 = 4;
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
                                            c2 = 6;
                                            break;
                                        }
                                        break;
                                    case 1100757753:
                                        if (str6.equals("CHAT_SEND_GIFS_FORBIDDEN")) {
                                            c2 = 7;
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
                                            c2 = '\t';
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
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.e0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.d2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.s1");
                            }

                            public static void f(int i3, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
                                TLRPC.User user;
                                if (tL_messages_invitedUsers == null || tL_messages_invitedUsers.missing_invitees.isEmpty() || chat == null) {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
                                int size = arrayList4.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i10);
                                    i10++;
                                    TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
                                    if (tL_messages_invitedUsers.updates != null) {
                                        for (int i11 = 0; i11 < tL_messages_invitedUsers.updates.users.size(); i11++) {
                                            user = tL_messages_invitedUsers.updates.users.get(i11);
                                            if (user.id == tL_missingInvitee2.user_id) {
                                                break;
                                            }
                                        }
                                    }
                                    user = null;
                                    if (user == null) {
                                        user = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(tL_missingInvitee2.user_id));
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
                                org.telegram.messenger.g0.i3(new ai.p1(i3, chat, arrayList, arrayList2, arrayList3), 200L);
                            }

                            public static void f0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.u10 u10Var, cm cmVar) {
                                Activity W = org.telegram.messenger.g0.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                                int i3 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                String M0 = org.telegram.messenger.bd.M0(2131747161, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = org.telegram.messenger.bd.M0(2131747162, null);
                                final z3 z3Var = new z3(context);
                                z3Var.setTextSize(1, 16.0f);
                                int i10 = org.telegram.ui.ActionBar.k6.j5;
                                org.telegram.ui.ActionBar.r6.V(z3Var, i10, e6Var);
                                org.telegram.ui.ActionBar.r6.E(z3Var, org.telegram.ui.ActionBar.k6.Li, e6Var);
                                z3Var.setHint(org.telegram.messenger.bd.M0(2131747160, null));
                                z3Var.setInputType(17);
                                z3Var.setImeOptions(6);
                                z3Var.setMaxLines(10);
                                z3Var.setSingleLine(false);
                                z3Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                                z3Var.setCursorWidth(1.5f);
                                z3Var.z(org.telegram.ui.ActionBar.k6.q6, e6Var);
                                if (str != null) {
                                    z3Var.setText(str);
                                    z3Var.setSelection(str.length());
                                }
                                z3Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.d2
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                                        if (i11 != 6) {
                                            return false;
                                        }
                                        z3 z3Var2 = z3.this;
                                        String trim = z3Var2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : t4.a.matcher(trim.trim()).matches())) {
                                            org.telegram.messenger.g0.F3(z3Var2);
                                            return true;
                                        }
                                        u10Var.a(trim);
                                        org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
                                        if (s1Var2 != null) {
                                            s1Var2.dismiss();
                                        }
                                        View view = currentFocus;
                                        if (view != null) {
                                            view.requestFocus();
                                        }
                                        return true;
                                    }
                                });
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
                                org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i10);
                                z3Var.setBackground(d02);
                                org.telegram.ui.ActionBar.r6.k(z3Var, d02, L, null, e6Var);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.addView(z3Var, b8.mf.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i11 = t61.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    t61 t61Var = new t61(context, e6Var);
                                    t61Var.setWebPage(webPage);
                                    f10.addView(t61Var, b8.mf.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.c();
                                alertDialog$Builder.o(f10);
                                s1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751355, null), new org.telegram.ui.jo(10, z3Var, u10Var));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new c(23));
                                if (cmVar != null) {
                                    alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131751599, null), new u0(4, cmVar));
                                }
                                s1VarArr[0] = s1Var;
                                s1Var.k0 = false;
                                s1Var.setOnDismissListener(new p0(z3Var, 2));
                                s1VarArr[0].setOnShowListener(new e2(z3Var, i3));
                                s1VarArr[0].show();
                                TextView textView = (TextView) s1VarArr[0].d(-3);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                            }

                            public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i3, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
                                long j12;
                                int i10;
                                long j13;
                                int i11;
                                int i12;
                                int i13;
                                boolean z10;
                                boolean z11;
                                String G;
                                int value = cb0Var.getValue();
                                int value2 = cb0Var2.getValue();
                                int value3 = cb0Var3.getValue();
                                Calendar calendar = Calendar.getInstance();
                                long currentTimeMillis = System.currentTimeMillis();
                                calendar.setTimeInMillis(currentTimeMillis);
                                int i14 = calendar.get(1);
                                calendar.get(6);
                                if (j11 > 0) {
                                    i10 = i14;
                                    calendar.setTimeInMillis((j11 * 1000) + currentTimeMillis);
                                    calendar.set(11, 23);
                                    calendar.set(12, 59);
                                    calendar.set(13, 59);
                                    calendar.set(14, 0);
                                    j12 = currentTimeMillis;
                                    i11 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
                                    j13 = calendar.getTimeInMillis();
                                    i12 = 23;
                                    i13 = 59;
                                } else {
                                    j12 = currentTimeMillis;
                                    i10 = i14;
                                    j13 = j11;
                                    i11 = 0;
                                    i12 = 0;
                                    i13 = 0;
                                }
                                int i15 = i13;
                                long millis = j10 > 0 ? TimeUnit.SECONDS.toMillis(j10) : 60000L;
                                long j14 = j12 + millis;
                                calendar.setTimeInMillis(j14);
                                int i16 = calendar.get(11);
                                int i17 = calendar.get(12);
                                long j15 = j13;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                calendar.add(6, value);
                                calendar.set(11, value2);
                                calendar.set(12, value3);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                long timeInMillis = calendar.getTimeInMillis();
                                cb0Var.setMinValue(0);
                                if (j15 > 0) {
                                    cb0Var.setMaxValue(i11);
                                }
                                int value4 = cb0Var.getValue();
                                cb0Var2.setMinValue(value4 == 0 ? i16 : 0);
                                if (j15 > 0) {
                                    cb0Var2.setMaxValue(value4 == i11 ? i12 : 23);
                                }
                                int value5 = cb0Var2.getValue();
                                cb0Var3.setMinValue((value4 == 0 && value5 == i16) ? i17 : 0);
                                if (j15 > 0) {
                                    cb0Var3.setMaxValue((value4 == i11 && value5 == i12) ? i15 : 59);
                                }
                                int value6 = cb0Var3.getValue();
                                if (timeInMillis <= j14) {
                                    calendar.setTimeInMillis(j14);
                                } else if (j15 > 0 && timeInMillis > j15) {
                                    calendar.setTimeInMillis(j15);
                                }
                                int i18 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                calendar.add(6, value4);
                                calendar.set(11, value5);
                                calendar.set(12, value6);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                long timeInMillis2 = calendar.getTimeInMillis();
                                if (textView != null) {
                                    textView.setText(org.telegram.messenger.bd.E0().x0((i3 * 3) + (value4 == 0 ? 0 : i10 == i18 ? 1 : 2)).format(timeInMillis2));
                                }
                                if (textView2 != null) {
                                    int i19 = (int) ((timeInMillis2 - j12) / 1000);
                                    if (i19 > 86400) {
                                        z11 = false;
                                        G = org.telegram.messenger.bd.G(Math.round(i19 / 86400.0f), "DaysSchedule", new Object[0]);
                                    } else {
                                        z11 = false;
                                        z11 = false;
                                        z11 = false;
                                        G = i19 >= 3600 ? org.telegram.messenger.bd.G(Math.round(i19 / 3600.0f), "HoursSchedule", new Object[0]) : i19 >= 60 ? org.telegram.messenger.bd.G(Math.round(i19 / 60.0f), "MinutesSchedule", new Object[0]) : org.telegram.messenger.bd.G(i19, "SecondsSchedule", new Object[0]);
                                    }
                                    if (textView2.getTag() != null) {
                                        z10 = true;
                                        Object[] objArr = new Object[1];
                                        objArr[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.bd.a0("VoipChannelScheduleInfo", null, 2131743473, objArr));
                                    } else {
                                        z10 = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.bd.a0("VoipGroupScheduleInfo", null, 2131743352, objArr2));
                                    }
                                } else {
                                    z10 = true;
                                    z11 = false;
                                }
                                return timeInMillis - j12 > millis ? z10 : z11;
                            }

                            public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                org.telegram.ui.ActionBar.s1 s1Var;
                                int i3;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || d2Var == null || d2Var.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
                                String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                                s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                String str = tL_error.text;
                                str.getClass();
                                i3 = 1;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        s1Var.U = org.telegram.messenger.bd.M0(2131748766, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        s1Var.U = org.telegram.messenger.bd.M0(2131746600, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        s1Var.U = org.telegram.messenger.bd.M0(2131751748, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z10) {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131749397, null);
                                            break;
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131752271, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        s1Var.U = org.telegram.messenger.bd.M0(2131743738, null);
                                        break;
                                    case "PEER_FLOOD":
                                        s1Var.U = org.telegram.messenger.bd.M0(2131748134, null);
                                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131748339, null), new v2(i3, d2Var));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z10) {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131749395, null);
                                            break;
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131752269, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131754477, null);
                                            break;
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131754364, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        s1Var.U = org.telegram.messenger.bd.M0(2131742852, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        s1Var.U = org.telegram.messenger.bd.M0(2131754465, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z10) {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131749398, null);
                                            break;
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131752272, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z10) {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131749396, null);
                                            break;
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131752270, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        s1Var.S = org.telegram.messenger.bd.M0(2131752282, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131752283, null);
                                            break;
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131752284, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        s1Var.S = org.telegram.messenger.bd.M0(2131752282, null);
                                        s1Var.U = org.telegram.messenger.bd.M0(2131743767, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z10) {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131749394, null);
                                            break;
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131752268, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        s1Var.U = org.telegram.messenger.bd.M0(2131754476, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z11) {
                                            if (!z10) {
                                                s1Var.U = org.telegram.messenger.bd.M0(2131749117, null);
                                                break;
                                            } else {
                                                s1Var.U = org.telegram.messenger.bd.M0(2131749120, null);
                                                break;
                                            }
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131749119, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        s1Var.S = org.telegram.messenger.bd.M0(2131743316, null);
                                        s1Var.U = org.telegram.messenger.bd.M0(2131743386, null);
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                                        sb2.append(tL_error.text);
                                        s1Var.U = sb2.toString();
                                        break;
                                }
                                k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                            }

                            public static boolean h(Context context, int i3, long j10, boolean z10) {
                                TLRPC.Chat M0;
                                if (!org.telegram.messenger.m5.z(j10) || (M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10))) == null || !M0.slowmode_enabled || org.telegram.messenger.t3.N(M0)) {
                                    return false;
                                }
                                if (!z10) {
                                    TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i3).N0(M0.id);
                                    if (N0 == null) {
                                        N0 = org.telegram.messenger.qr.a0(i3).F0(M0.id, org.telegram.messenger.t3.T(M0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (N0 != null && N0.slowmode_next_send_date >= ConnectionsManager.getInstance(i3).getCurrentTime()) {
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    return false;
                                }
                                M(context, M0.title, org.telegram.messenger.bd.M0(2131745312, null)).p();
                                return true;
                            }

                            public static org.telegram.ui.ActionBar.s1 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
                                if (activity == null) {
                                    u10Var.a(Boolean.FALSE);
                                    return null;
                                }
                                int i3 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
                                int i10 = 1;
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                boolean[] zArr = {false};
                                ci.ec ecVar = new ci.ec(activity, 23);
                                org.telegram.messenger.hs.i(ecVar);
                                org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.j5, e6Var);
                                ecVar.setTextSize(1, 16.0f);
                                ecVar.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
                                ecVar.setText(charSequence);
                                g3 g3Var = new g3(activity, c2VarArr, i10);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.H = 6;
                                alertDialog$Builder.o(g3Var);
                                TextView textView = new TextView(activity);
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.E8, e6Var, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                g3Var.addView(textView, b8.mf.d(-1, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                g3Var.addView(ecVar, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, e6Var);
                                    c2VarArr[0] = c2Var;
                                    int i11 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 7, org.telegram.messenger.g0.L(12.0f));
                                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                                    c2Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, e6Var);
                                    c2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (org.telegram.messenger.bd.a0 ? 5 : 3) | 16;
                                    c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    c2VarArr[0].e(charSequence2, "", false, false, false);
                                    c2VarArr[0].setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                                    g3Var.addView(c2VarArr[0], b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new w0(3, zArr));
                                }
                                alertDialog$Builder.k(str2, new s2(i3, u10Var, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                if (z10) {
                                    s1Var.a1 = true;
                                }
                                s1Var.show();
                                return s1Var;
                            }

                            public static org.telegram.ui.ActionBar.s1 i(Activity activity, p4 p4Var) {
                                if (org.telegram.messenger.h10.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                ci.b4 b4Var = s1Var.O0;
                                org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                                LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
                                for (int i3 = 0; i3 < 4; i3++) {
                                    if (org.telegram.messenger.h10.i(i3).f() != null) {
                                        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                                        kVar.f = i3;
                                        TLRPC.User f10 = org.telegram.messenger.h10.i(i3).f();
                                        u8 u8Var = kVar.e;
                                        u8Var.r(f10);
                                        kVar.a.l(org.telegram.messenger.g5.m(0, f10.first_name, f10.last_name), false);
                                        k9 k9Var = kVar.c;
                                        k9Var.getImageReceiver().d = i3;
                                        k9Var.e(f10, u8Var);
                                        kVar.d.setVisibility(4);
                                        kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                                        kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                        e10.addView(kVar, b8.mf.o(-1, 50));
                                        kVar.setOnClickListener(new ai.h(s1VarArr, b4Var, p4Var, 22));
                                    }
                                }
                                s1Var.S = org.telegram.messenger.bd.M0(2131745681, null);
                                alertDialog$Builder.o(e10);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752589, null), null);
                                s1VarArr[0] = s1Var;
                                return s1Var;
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
                            /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String, org.telegram.ui.ActionBar.e6, org.telegram.ui.ActionBar.p1] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.d2] */
                            /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [org.telegram.ui.Cells.c2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void i0(org.telegram.ui.ActionBar.d2 d2Var, long j10, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final org.telegram.messenger.kr krVar, org.telegram.ui.ActionBar.e6 e6Var) {
                                long j11;
                                boolean z11;
                                String str;
                                String M0;
                                ?? r9;
                                ?? r14;
                                TextView textView;
                                String str2;
                                if (d2Var.getParentActivity() == null) {
                                    return;
                                }
                                final org.telegram.messenger.c accountInstance = d2Var.getAccountInstance();
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var);
                                SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).d7;
                                int i3 = 1;
                                if (encryptedChat == null) {
                                    j11 = j10;
                                    if (!org.telegram.messenger.k5.w("dialog_bar_report", j11, sharedPreferences, false)) {
                                        z11 = false;
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                        if (user == null) {
                                            s1Var.S = org.telegram.messenger.bd.a0("BlockUserTitle", null, 2131753685, org.telegram.messenger.l10.j(user, true));
                                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("BlockUserAlert", null, 2131753691, org.telegram.messenger.l10.j(user, true)));
                                            String M02 = org.telegram.messenger.bd.M0(2131753693, null);
                                            int i10 = 2;
                                            r9 = new org.telegram.ui.Cells.c2[2];
                                            int i11 = 0;
                                            ?? linearLayout = new LinearLayout(d2Var.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i12 = 0;
                                            while (i12 < i10) {
                                                if (i12 != 0 || z11) {
                                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i3, d2Var.getParentActivity(), e6Var);
                                                    r9[i12] = c2Var;
                                                    c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(i11));
                                                    r9[i12].setTag(Integer.valueOf(i12));
                                                    if (i12 == 0) {
                                                        r9[i12].e(org.telegram.messenger.bd.M0(2131751503, null), "", true, false, false);
                                                        str2 = M02;
                                                    } else {
                                                        str2 = M02;
                                                        r9[i12].e(org.telegram.messenger.bd.a0("DeleteThisChat", null, 2131751483, new Object[i11]), "", true, false, false);
                                                    }
                                                    r9[i12].setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    linearLayout.addView(r9[i12], b8.mf.o(-1, -2));
                                                    r9[i12].setOnClickListener(new q0(r9, 1));
                                                } else {
                                                    str2 = M02;
                                                }
                                                i12++;
                                                M02 = str2;
                                                i3 = 1;
                                                i10 = 2;
                                                i11 = 0;
                                            }
                                            alertDialog$Builder.o(linearLayout);
                                            M0 = M02;
                                            r14 = 0;
                                        } else {
                                            if (chat == null || !z10) {
                                                str = null;
                                                str = null;
                                                s1Var.S = org.telegram.messenger.bd.M0(2131746210, null);
                                                if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                                                    s1Var.U = org.telegram.messenger.bd.M0(2131746214, null);
                                                } else {
                                                    s1Var.U = org.telegram.messenger.bd.M0(2131746215, null);
                                                }
                                            } else {
                                                s1Var.S = org.telegram.messenger.bd.M0(2131746199, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("ReportUnrelatedGroupText", null, 2131746198, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                s1Var.U = org.telegram.messenger.bd.M0(2131746197, null);
                                            }
                                            M0 = org.telegram.messenger.bd.M0(2131746240, str);
                                            r9 = str;
                                            r14 = str;
                                        }
                                        final org.telegram.ui.Cells.c2[] c2VarArr = r9;
                                        final long j12 = j11;
                                        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.j1
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i13) {
                                                org.telegram.ui.Cells.c2 c2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                org.telegram.messenger.c cVar = accountInstance;
                                                if (user2 != null) {
                                                    org.telegram.messenger.hp.s1(cVar.a).w(user2.id);
                                                }
                                                org.telegram.ui.Cells.c2[] c2VarArr2 = c2VarArr;
                                                long j13 = j12;
                                                TLRPC.Chat chat2 = chat;
                                                if (c2VarArr2 == null || ((c2Var2 = c2VarArr2[0]) != null && c2Var2.b())) {
                                                    org.telegram.messenger.hp.s1(cVar.a).o4(j13, user2, chat2, encryptedChat, chat2 != null && z10);
                                                }
                                                org.telegram.messenger.kr krVar2 = krVar;
                                                if (c2VarArr2 != null && !c2VarArr2[1].b()) {
                                                    krVar2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    org.telegram.messenger.hp.s1(cVar.a).X(0, j13, false);
                                                } else if (org.telegram.messenger.t3.r0(chat2)) {
                                                    org.telegram.messenger.hp.s1(cVar.a).X(0, j13, false);
                                                } else {
                                                    int i14 = cVar.a;
                                                    org.telegram.messenger.hp.s1(i14).f0(-j13, org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(org.telegram.messenger.h10.i(i14).e())));
                                                }
                                                krVar2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r14), r14);
                                        d2Var.showDialog(s1Var);
                                        textView = (TextView) s1Var.d(-1);
                                        if (textView == null) {
                                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, r14);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    j11 = j10;
                                }
                                z11 = true;
                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                                if (user == null) {
                                }
                                final org.telegram.ui.Cells.c2[] c2VarArr2 = r9;
                                final long j122 = j11;
                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.j1
                                    @Override // org.telegram.ui.ActionBar.p1
                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i13) {
                                        org.telegram.ui.Cells.c2 c2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        org.telegram.messenger.c cVar = accountInstance;
                                        if (user2 != null) {
                                            org.telegram.messenger.hp.s1(cVar.a).w(user2.id);
                                        }
                                        org.telegram.ui.Cells.c2[] c2VarArr22 = c2VarArr2;
                                        long j13 = j122;
                                        TLRPC.Chat chat2 = chat;
                                        if (c2VarArr22 == null || ((c2Var2 = c2VarArr22[0]) != null && c2Var2.b())) {
                                            org.telegram.messenger.hp.s1(cVar.a).o4(j13, user2, chat2, encryptedChat, chat2 != null && z10);
                                        }
                                        org.telegram.messenger.kr krVar2 = krVar;
                                        if (c2VarArr22 != null && !c2VarArr22[1].b()) {
                                            krVar2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            org.telegram.messenger.hp.s1(cVar.a).X(0, j13, false);
                                        } else if (org.telegram.messenger.t3.r0(chat2)) {
                                            org.telegram.messenger.hp.s1(cVar.a).X(0, j13, false);
                                        } else {
                                            int i14 = cVar.a;
                                            org.telegram.messenger.hp.s1(i14).f0(-j13, org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(org.telegram.messenger.h10.i(i14).e())));
                                        }
                                        krVar2.a(1);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r14), r14);
                                d2Var.showDialog(s1Var2);
                                textView = (TextView) s1Var2.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.s1 j(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                String M0 = org.telegram.messenger.bd.M0(2131754243, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.U = M0;
                                int i3 = org.telegram.ui.ActionBar.k6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
                                alertDialog$Builder.n(i3, null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new i0(context, 0));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                                return s1Var;
                            }

                            public static void j0(org.telegram.ui.wm wmVar, org.telegram.messenger.zi ziVar, long j10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.tf tfVar) {
                                if (wmVar.getParentActivity() == null || ziVar == null) {
                                    return;
                                }
                                org.telegram.messenger.c accountInstance = wmVar.getAccountInstance();
                                TLRPC.User a22 = j10 > 0 ? org.telegram.messenger.hp.s1(accountInstance.a).a2(Long.valueOf(j10)) : null;
                                TLRPC.Chat M0 = j10 < 0 ? org.telegram.messenger.hp.s1(accountInstance.a).M0(Long.valueOf(-j10)) : null;
                                if (a22 == null && M0 == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), e6Var);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S0 = false;
                                s1Var.O = new p0(tfVar, 0);
                                s1Var.S = org.telegram.messenger.bd.M0(2131753692, null);
                                if (a22 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("BlockUserReplyAlert", null, 2131753686, org.telegram.messenger.l10.j(a22, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("BlockUserReplyAlert", null, 2131753686, M0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(wmVar.getParentActivity());
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, wmVar.getParentActivity(), e6Var)};
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                c2VarArr[0].setTag(0);
                                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131751503, null), "", true, false, false);
                                c2VarArr[0].setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                linearLayout.addView(c2VarArr[0], b8.mf.o(-1, -2));
                                c2VarArr[0].setOnClickListener(new q0(c2VarArr, 0));
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753695, null), new r0(a22, accountInstance, wmVar, M0, ziVar, c2VarArr, e6Var));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                wmVar.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                            }

                            public static void k(Context context, org.telegram.ui.ActionBar.e6 e6Var, r4 r4Var) {
                                if (context == null) {
                                    return;
                                }
                                boolean z10 = false;
                                int i3 = org.telegram.ui.ActionBar.k6.j5;
                                int f10 = e6Var != null ? e6Var.f(i3) : org.telegram.ui.ActionBar.k6.x0(null, i3, false);
                                int i10 = org.telegram.ui.ActionBar.k6.h5;
                                int f11 = e6Var != null ? e6Var.f(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                                int i11 = org.telegram.ui.ActionBar.k6.xj;
                                if (e6Var != null) {
                                    e6Var.f(i11);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i11, false);
                                }
                                int i12 = org.telegram.ui.ActionBar.k6.Bj;
                                if (e6Var != null) {
                                    e6Var.f(i12);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                                }
                                int i13 = org.telegram.ui.ActionBar.k6.E8;
                                if (e6Var != null) {
                                    e6Var.f(i13);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                                }
                                int i14 = org.telegram.ui.ActionBar.k6.G8;
                                if (e6Var != null) {
                                    e6Var.f(i14);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                                }
                                int i15 = org.telegram.ui.ActionBar.k6.i6;
                                if (e6Var != null) {
                                    e6Var.f(i15);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                                }
                                int i16 = org.telegram.ui.ActionBar.k6.Gi;
                                int f12 = e6Var != null ? e6Var.f(i16) : org.telegram.ui.ActionBar.k6.x0(null, i16, false);
                                int i17 = org.telegram.ui.ActionBar.k6.Ci;
                                int f13 = e6Var != null ? e6Var.f(i17) : org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                                int i18 = org.telegram.ui.ActionBar.k6.Ei;
                                int f14 = e6Var != null ? e6Var.f(i18) : org.telegram.ui.ActionBar.k6.x0(null, i18, false);
                                hi.d dVar = new hi.d(context, e6Var);
                                ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                c4 c4Var = new c4(context, e6Var, iArr);
                                c4Var.setMinValue(0);
                                c4Var.setMaxValue(16);
                                c4Var.setTextColor(f10);
                                c4Var.setValue(0);
                                c4Var.setFormatter(new v0(iArr, 1));
                                d4 d4Var = new d4(context, c4Var, 0);
                                boolean z11 = true;
                                d4Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                d4Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(org.telegram.messenger.bd.M0(2131753877, null));
                                textView.setTextColor(f10);
                                k2.p1.t(textView, 1, 20.0f);
                                frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new fi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                d4Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, z11, z11, z10, 1);
                                linearLayout.addView(c4Var, b8.mf.l(1.0f, 0, org.telegram.messenger.hs.t4));
                                w3Var.setPadding(0, 0, 0, 0);
                                w3Var.setGravity(17);
                                w3Var.setTextColor(f12);
                                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                                w3Var.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                w3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, f13, f14, f14));
                                d4Var.addView(w3Var, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                                w3Var.setText(org.telegram.messenger.bd.M0(2131751435, null));
                                c4Var.setOnValueChangedListener(new t(w3Var, 10));
                                w3Var.setOnClickListener(new ai.r4(iArr, c4Var, r4Var, dVar, 9));
                                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
                                t2Var.O = d4Var;
                                t2Var.show();
                                t2Var.v0(f11);
                                t2Var.O(f11);
                            }

                            public static void k0(Context context, int i3, long j10) {
                                org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                f10.addView(frameLayout, b8.mf.t(-1, 92, 17, 0, 0, 0, 0));
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                imageView.setImageResource(R.drawable.story_link);
                                imageView.setScaleX(2.0f);
                                imageView.setScaleY(2.0f);
                                frameLayout2.addView(imageView, b8.mf.e(-1, -1, 17));
                                int L = org.telegram.messenger.g0.L(80.0f);
                                int i10 = org.telegram.ui.ActionBar.k6.Ci;
                                ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.v0(i10));
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                                frameLayout2.setBackground(L2);
                                org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, null);
                                frameLayout.addView(frameLayout2, b8.mf.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i11 = org.telegram.ui.ActionBar.k6.G6;
                                org.telegram.messenger.k5.n(textView, i11, null, 1, 20.0f);
                                textView.setText(org.telegram.messenger.bd.M0(2131752624, null));
                                textView.setGravity(17);
                                TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, b8.mf.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                org.telegram.ui.ActionBar.r6.V(f11, i11, null);
                                f11.setTextSize(1, 14.0f);
                                org.telegram.messenger.k5.r(null, null, 2131752625, new Object[]{org.telegram.messenger.m5.l(i3, j10)}, f11);
                                f11.setGravity(17);
                                f10.addView(f11, b8.mf.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                gi.d dVar = new gi.d(context, null, true);
                                dVar.i(org.telegram.messenger.bd.M0(2131752626, null), false, true);
                                f10.addView(dVar, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                l10.O = f10;
                                dVar.setOnClickListener(new org.telegram.ui.gd(i3, dVar, l10, j10));
                                l10.N();
                                l10.show();
                            }

                            public static hi.d l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.u10 u10Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (context == null) {
                                    return null;
                                }
                                hi.d dVar = new hi.d(context, e6Var);
                                int i3 = 0;
                                ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
                                cb0 cb0Var = new cb0(context, e6Var);
                                cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                cb0Var.setItemCount(5);
                                cb0 cb0Var2 = new cb0(context, e6Var);
                                cb0Var2.setItemCount(5);
                                cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                cb0 cb0Var3 = new cb0(context, e6Var);
                                cb0Var3.setItemCount(5);
                                cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                u3 u3Var = new u3(context, cb0Var, cb0Var2, cb0Var3);
                                u3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                u3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, e6Var, 1, 20.0f);
                                frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new fi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                u3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i10 = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i11 = calendar.get(5);
                                int i12 = calendar.get(2);
                                int i13 = calendar.get(1);
                                int i14 = i13 + 1;
                                m2 m2Var = new m2(cb0Var3, i14, cb0Var, cb0Var2, i13, i12, i11);
                                System.currentTimeMillis();
                                v3 v3Var = new v3(context);
                                linearLayout.addView(cb0Var, b8.mf.l(0.25f, 0, org.telegram.messenger.hs.t4));
                                cb0Var.setMinValue(1);
                                cb0Var.setMaxValue(31);
                                cb0Var.setWrapSelectorWheel(false);
                                cb0Var.setFormatter(new c(28));
                                t tVar = new t(m2Var, 9);
                                cb0Var.setOnScrollListener(tVar);
                                cb0Var2.setMinValue(0);
                                cb0Var2.setMaxValue(11);
                                cb0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                                int i15 = 29;
                                cb0Var2.setFormatter(new c(i15));
                                cb0Var2.setOnScrollListener(tVar);
                                cb0Var3.setMinValue(i10);
                                cb0Var3.setMaxValue(i14);
                                cb0Var3.setWrapSelectorWheel(false);
                                cb0Var3.setFormatter(new k2.v(i14, 9));
                                linearLayout.addView(cb0Var3, b8.mf.l(0.25f, 0, org.telegram.messenger.hs.t4));
                                cb0Var3.setOnScrollListener(tVar);
                                if (tL_birthday != null) {
                                    cb0Var.setValue(tL_birthday.day);
                                    cb0Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        cb0Var3.setValue(tL_birthday.year);
                                    } else {
                                        cb0Var3.setValue(i14);
                                    }
                                } else {
                                    cb0Var.setValue(calendar.get(5));
                                    cb0Var2.setValue(calendar.get(2));
                                    cb0Var3.setValue(i14);
                                }
                                m2Var.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    s70 s70Var = new s70(context, null);
                                    s70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    s70Var.setTextSize(1, 13.0f);
                                    org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q5, e6Var);
                                    org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
                                    s70Var.setGravity(17);
                                    frameLayout2.addView(s70Var, b8.mf.e(-2, -2, 17));
                                    u3Var.addView(frameLayout2, b8.mf.o(-1, -2));
                                    int i16 = org.telegram.messenger.h10.t0;
                                    o2 o2Var = new o2(i16, s70Var, i3);
                                    o2Var.run();
                                    org.telegram.messenger.hs.f(i16).h(frameLayout2, org.telegram.messenger.hs.k0, new p2(o2Var, i3));
                                    org.telegram.messenger.g5.r(i16).D(false);
                                }
                                if (z10) {
                                    gi.d dVar2 = new gi.d(context, e6Var, false);
                                    dVar2.i(org.telegram.messenger.bd.M0(2131751671, null), false, true);
                                    dVar2.setOnClickListener(new ai.h3(cb0Var3, i14, m2Var, 9));
                                    u3Var.addView(dVar2, b8.mf.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                v3Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                v3Var.setGravity(17);
                                org.telegram.ui.ActionBar.r6.V(v3Var, org.telegram.ui.ActionBar.k6.Gi, e6Var);
                                v3Var.setTextSize(1, 14.0f);
                                v3Var.setTypeface(org.telegram.messenger.g0.o());
                                v3Var.setText(str2);
                                int L = org.telegram.messenger.g0.L(24.0f);
                                int i17 = org.telegram.ui.ActionBar.k6.Ci;
                                int w02 = org.telegram.ui.ActionBar.k6.w0(i17, e6Var);
                                int i18 = org.telegram.ui.ActionBar.k6.Ei;
                                int w03 = org.telegram.ui.ActionBar.k6.w0(i18, e6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
                                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
                                v3Var.setBackground(k02);
                                org.telegram.ui.ActionBar.r6.k(v3Var, k02, N, N2, e6Var);
                                b8.pf.b(v3Var, 0.02f, 1.2f);
                                u3Var.addView(v3Var, b8.mf.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
                                v3Var.setOnClickListener(new ci.ga(cb0Var, cb0Var2, cb0Var3, i14, dVar, u10Var));
                                if (z11) {
                                    gi.d dVar3 = new gi.d(context, e6Var, false);
                                    dVar3.i(org.telegram.messenger.bd.M0(2131753715, null), false, true);
                                    dVar3.f();
                                    dVar3.setOnClickListener(new org.telegram.messenger.video.g(i15, dVar, u10Var));
                                    u3Var.addView(dVar3, b8.mf.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((org.telegram.ui.ActionBar.t2) dVar.b).O = u3Var;
                                return dVar;
                            }

                            public static void l0(String str, org.telegram.ui.ActionBar.d2 d2Var) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || d2Var == null || d2Var.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
                                String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                d2Var.showDialog(s1Var, true, null);
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
                            /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.String, org.telegram.ui.ActionBar.p1] */
                            /* JADX WARN: Type inference failed for: r5v23 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void m(org.telegram.ui.ActionBar.d2 d2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                org.telegram.ui.Cells.c2 c2Var;
                                ?? r5;
                                if (d2Var == null) {
                                    return;
                                }
                                Context context = d2Var.getContext();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                n4 n4Var = new n4(context, null);
                                org.telegram.messenger.hs.i(n4Var);
                                org.telegram.ui.ActionBar.r6.V(n4Var, org.telegram.ui.ActionBar.k6.j5, null);
                                org.telegram.ui.ActionBar.r6.H(n4Var, org.telegram.ui.ActionBar.k6.Uc, null);
                                n4Var.setTextSize(1, 16.0f);
                                n4Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
                                o4 o4Var = new o4(context, c2VarArr2);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.H = 6;
                                alertDialog$Builder.o(o4Var);
                                u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
                                u8Var.u(org.telegram.messenger.g0.L(18.0f));
                                k9 k9Var = new k9(context);
                                k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                o4Var.addView(k9Var, b8.mf.d(40, 40.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                                org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
                                k5Var.setTextSize(20);
                                k5Var.setTypeface(org.telegram.messenger.g0.o());
                                k5Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                k5Var.setEllipsizeByGradient(true);
                                k5Var.l(user.first_name, false);
                                if (user.scam) {
                                    k5Var.i(org.telegram.ui.ActionBar.k6.g1);
                                } else if (user.fake) {
                                    k5Var.i(org.telegram.ui.ActionBar.k6.h1);
                                } else if (user.verified) {
                                    Drawable g7 = k2.p1.g(context, R.drawable.verified_area);
                                    int i3 = org.telegram.ui.ActionBar.k6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.r6.y(k5Var, g7, i3, null, mode);
                                    Drawable g10 = k2.p1.g(context, R.drawable.verified_check);
                                    c2VarArr = c2VarArr2;
                                    org.telegram.ui.ActionBar.r6.y(k5Var, g10, org.telegram.ui.ActionBar.k6.A9, null, mode);
                                    k5Var.i(new xp(g7, g10));
                                    TextView textView = new TextView(context);
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.m5, null);
                                    int i10 = 1;
                                    org.telegram.messenger.camera.q.n(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new b1(user, d2Var, alertDialog$Builder, i10));
                                    SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.bd.M0(2131748343, null) + "  ");
                                    wp wpVar = new wp(R.drawable.attach_arrow_right, 0);
                                    wpVar.n = 1;
                                    wpVar.c(org.telegram.messenger.g0.L(10.0f));
                                    valueOf.setSpan(wpVar, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z10 = org.telegram.messenger.bd.a0;
                                    o4Var.addView(k5Var, b8.mf.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f));
                                    boolean z11 = org.telegram.messenger.bd.a0;
                                    o4Var.addView(textView, b8.mf.d(-1, -2.0f, (!z11 ? 5 : 3) | 48, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                    o4Var.addView(n4Var, b8.mf.d(-2, -2.0f, (!org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    c2Var = new org.telegram.ui.Cells.c2(1, context, d2Var.getResourceProvider());
                                    c2VarArr[0] = c2Var;
                                    if (!c2Var.I) {
                                        org.telegram.ui.Cells.b2 b2Var = c2Var.c;
                                        b2Var.setLines(3);
                                        b2Var.setMaxLines(3);
                                        b2Var.setSingleLine(false);
                                    }
                                    c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                    c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131747788, org.telegram.messenger.l10.p(user))), "", true, false, false);
                                    c2VarArr[0].setPadding(!org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                    c2VarArr[0].c(true, false);
                                    o4Var.addView(c2VarArr[0], b8.mf.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new f0(atomicBoolean, 1));
                                    if (org.telegram.messenger.l10.z(user)) {
                                        r5 = 0;
                                        u8Var.p = 1.0f;
                                        d2Var.getCurrentAccount();
                                        u8Var.r(user);
                                        k9Var.e(user, u8Var);
                                    } else {
                                        u8Var.p = 0.8f;
                                        u8Var.g(12);
                                        r5 = 0;
                                        k9Var.j(null, null, u8Var, user);
                                    }
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744925, r5), new u0(3, runnable));
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r5), r5);
                                    d2Var.showDialog(s1Var);
                                    n4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752896, r5), new c1(1, context, s1Var)));
                                }
                                c2VarArr = c2VarArr2;
                                TextView textView2 = new TextView(context);
                                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.m5, null);
                                int i102 = 1;
                                org.telegram.messenger.camera.q.n(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new b1(user, d2Var, alertDialog$Builder, i102));
                                SpannableString valueOf2 = SpannableString.valueOf(org.telegram.messenger.bd.M0(2131748343, null) + "  ");
                                wp wpVar2 = new wp(R.drawable.attach_arrow_right, 0);
                                wpVar2.n = 1;
                                wpVar2.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf2.setSpan(wpVar2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z102 = org.telegram.messenger.bd.a0;
                                o4Var.addView(k5Var, b8.mf.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f));
                                boolean z112 = org.telegram.messenger.bd.a0;
                                o4Var.addView(textView2, b8.mf.d(-1, -2.0f, (!z112 ? 5 : 3) | 48, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f));
                                o4Var.addView(n4Var, b8.mf.d(-2, -2.0f, (!org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                c2Var = new org.telegram.ui.Cells.c2(1, context, d2Var.getResourceProvider());
                                c2VarArr[0] = c2Var;
                                if (!c2Var.I) {
                                }
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131747788, org.telegram.messenger.l10.p(user))), "", true, false, false);
                                c2VarArr[0].setPadding(!org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                c2VarArr[0].c(true, false);
                                o4Var.addView(c2VarArr[0], b8.mf.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                c2VarArr[0].setOnClickListener(new f0(atomicBoolean, 1));
                                if (org.telegram.messenger.l10.z(user)) {
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744925, r5), new u0(3, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r5), r5);
                                d2Var.showDialog(s1Var);
                                n4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752896, r5), new c1(1, context, s1Var)));
                            }

                            public static void m0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, TL_stars.StarGift starGift, long j10, Runnable runnable) {
                                TLObject e22 = org.telegram.messenger.hp.s1(i3).e2(j10);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.addView(new ci.i5(context, starGift, e22), b8.mf.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
                                textView.setTextSize(1, 16.0f);
                                org.telegram.messenger.k5.r(null, null, 2131749602, new Object[]{org.telegram.messenger.m5.H(null, null, e22)}, textView);
                                f10.addView(textView, b8.mf.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                alertDialog$Builder.o(f10);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749603, null), new u0(2, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder.p();
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.String, org.telegram.ui.ActionBar.p1] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r5;
                                Context context = d2Var.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                j4 j4Var = new j4(context, null);
                                org.telegram.messenger.hs.i(j4Var);
                                org.telegram.ui.ActionBar.r6.V(j4Var, org.telegram.ui.ActionBar.k6.j5, null);
                                org.telegram.ui.ActionBar.r6.H(j4Var, org.telegram.ui.ActionBar.k6.Uc, null);
                                j4Var.setTextSize(1, 16.0f);
                                j4Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.H = 6;
                                alertDialog$Builder.o(frameLayout);
                                u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
                                u8Var.u(org.telegram.messenger.g0.L(18.0f));
                                k9 k9Var = new k9(context);
                                k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                                org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
                                k5Var.setTextSize(20);
                                k5Var.setTypeface(org.telegram.messenger.g0.o());
                                k5Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                k5Var.setEllipsizeByGradient(true);
                                k5Var.l(user.first_name, false);
                                if (user.scam) {
                                    k5Var.i(org.telegram.ui.ActionBar.k6.g1);
                                } else if (user.fake) {
                                    k5Var.i(org.telegram.ui.ActionBar.k6.h1);
                                } else if (user.verified) {
                                    Drawable g7 = k2.p1.g(context, R.drawable.verified_area);
                                    int i3 = org.telegram.ui.ActionBar.k6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.r6.y(k5Var, g7, i3, null, mode);
                                    Drawable g10 = k2.p1.g(context, R.drawable.verified_check);
                                    org.telegram.ui.ActionBar.r6.y(k5Var, g10, org.telegram.ui.ActionBar.k6.A9, null, mode);
                                    k5Var.i(new xp(g7, g10));
                                }
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.m5, null);
                                org.telegram.messenger.camera.q.n(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new b1(user, d2Var, alertDialog$Builder, 0));
                                SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.bd.M0(2131748343, null) + "  ");
                                wp wpVar = new wp(R.drawable.attach_arrow_right, 0);
                                wpVar.n = 1;
                                wpVar.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf.setSpan(wpVar, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z10 = org.telegram.messenger.bd.a0;
                                frameLayout.addView(k5Var, b8.mf.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
                                boolean z11 = org.telegram.messenger.bd.a0;
                                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(j4Var, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.l10.z(user)) {
                                    u8Var.p = 0.8f;
                                    u8Var.g(12);
                                    r5 = 0;
                                    k9Var.j(null, null, u8Var, user);
                                } else {
                                    r5 = 0;
                                    u8Var.p = 1.0f;
                                    d2Var.getCurrentAccount();
                                    u8Var.r(user);
                                    k9Var.e(user, u8Var);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744925, r5), new u0(1, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r5), r5);
                                d2Var.showDialog(s1Var, false, new k0(2, runnable2));
                                j4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752896, r5), new c1(0, context, s1Var)));
                            }

                            public static void n0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, boolean z10, final org.telegram.messenger.n10 n10Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    final int i3 = 1;
                                    final org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                                    final int i10 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                    String M0 = org.telegram.messenger.bd.M0(2131747787, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i11 = org.telegram.ui.ActionBar.k6.j5;
                                    org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)));
                                    org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i11);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, e6Var);
                                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, e6Var);
                                    c2Var.setMultiline(true);
                                    c2Var.getTextView().getLayoutParams().width = -1;
                                    c2Var.getTextView().setSingleLine(false);
                                    c2Var.getTextView().setMaxLines(3);
                                    c2Var.getTextView().setTextSize(1, 16.0f);
                                    c2Var.e(org.telegram.messenger.bd.M0(z10 ? 2131752877 : 2131752876, null), "", false, false, false);
                                    c2Var.setOnClickListener(new z0(c2Var, 0));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, b8.mf.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(c2Var, b8.mf.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.o(linearLayout);
                                    s1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747825, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.a1
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
                                            switch (i10) {
                                                case 0:
                                                    n10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.s1 s1Var3 = s1VarArr[0];
                                                    if (s1Var3 != null) {
                                                        s1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    n10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.s1 s1Var4 = s1VarArr[0];
                                                    if (s1Var4 != null) {
                                                        s1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.a1
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
                                            switch (i3) {
                                                case 0:
                                                    n10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.s1 s1Var3 = s1VarArr[0];
                                                    if (s1Var3 != null) {
                                                        s1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    n10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.s1 s1Var4 = s1VarArr[0];
                                                    if (s1Var4 != null) {
                                                        s1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    s1VarArr[0] = alertDialog$Builder.p();
                                }
                            }

                            public static hi.d o(Activity activity, org.telegram.messenger.kr krVar, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (activity == null) {
                                    return null;
                                }
                                hi.d dVar = new hi.d(activity, e6Var);
                                ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
                                cb0 cb0Var = new cb0(activity, e6Var);
                                cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                cb0Var.setItemCount(5);
                                cb0 cb0Var2 = new cb0(activity, e6Var);
                                cb0Var2.setItemCount(5);
                                cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                cb0 cb0Var3 = new cb0(activity, e6Var);
                                cb0Var3.setItemCount(5);
                                cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                n3 n3Var = new n3(activity, cb0Var, cb0Var2, cb0Var3, 6);
                                n3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                n3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(org.telegram.messenger.bd.M0(2131752132, null));
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, e6Var, 1, 20.0f);
                                frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new fi.a(10));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                ci.ec ecVar = new ci.ec(activity, 20);
                                linearLayout.addView(cb0Var, b8.mf.l(0.25f, 0, org.telegram.messenger.hs.t4));
                                cb0Var.setMinValue(1);
                                cb0Var.setMaxValue(31);
                                cb0Var.setWrapSelectorWheel(false);
                                cb0Var.setFormatter(new a3(0));
                                s1 s1Var = new s1(cb0Var, cb0Var2, cb0Var3, 2);
                                cb0Var.setOnValueChangedListener(s1Var);
                                cb0Var2.setMinValue(0);
                                cb0Var2.setMaxValue(11);
                                cb0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                                cb0Var2.setFormatter(new a3(1));
                                cb0Var2.setOnValueChangedListener(s1Var);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i3 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i10 = calendar.get(1);
                                cb0Var3.setMinValue(i3);
                                cb0Var3.setMaxValue(i10);
                                cb0Var3.setWrapSelectorWheel(false);
                                cb0Var3.setFormatter(new a3(2));
                                linearLayout.addView(cb0Var3, b8.mf.l(0.25f, 0, org.telegram.messenger.hs.t4));
                                cb0Var3.setOnValueChangedListener(s1Var);
                                cb0Var.setValue(31);
                                cb0Var2.setValue(12);
                                cb0Var3.setValue(i10);
                                b(cb0Var, cb0Var2, cb0Var3);
                                ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                ecVar.setGravity(17);
                                org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.Gi, e6Var);
                                ecVar.setTextSize(1, 14.0f);
                                ecVar.setTypeface(org.telegram.messenger.g0.o());
                                ecVar.setText(org.telegram.messenger.bd.M0(2131749073, null));
                                int L = org.telegram.messenger.g0.L(8.0f);
                                int i11 = org.telegram.ui.ActionBar.k6.Ci;
                                int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
                                int i12 = org.telegram.ui.ActionBar.k6.Ei;
                                int w03 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
                                ecVar.setBackground(k02);
                                org.telegram.ui.ActionBar.r6.k(ecVar, k02, N, N2, e6Var);
                                n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                                ecVar.setOnClickListener(new m1(cb0Var, cb0Var2, cb0Var3, calendar, krVar, dVar, 2));
                                ((org.telegram.ui.ActionBar.t2) dVar.b).O = n3Var;
                                return dVar;
                            }

                            public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, sf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (sf.c.g(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                                        sf.c.s(context, Uri.parse(str), j10 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), bVar, null, false, true, false, false);
                                        return;
                                    }
                                    String d = sf.c.d(str, z10);
                                    h2 h2Var = new h2(context, str, j10, z11, bVar);
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                    String M0 = org.telegram.messenger.bd.M0(2131747787, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(d);
                                    textView.setTextSize(1, 14.0f);
                                    int i3 = org.telegram.ui.ActionBar.k6.j5;
                                    org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
                                    org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i3);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, e6Var);
                                    LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                    f10.addView(textView, b8.mf.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i10 = t61.f;
                                    if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                        t61 t61Var = new t61(context, e6Var);
                                        t61Var.setWebPage(webPage);
                                        f10.addView(t61Var, b8.mf.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder.o(f10);
                                    s1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747825, null), new t(h2Var, 8));
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    alertDialog$Builder.p();
                                }
                            }

                            public static void p(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, boolean z10) {
                                String M0;
                                String a02;
                                if (d2Var.getParentActivity() == null || user == null || org.telegram.messenger.l10.x(user) || org.telegram.messenger.h10.i(d2Var.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                d2Var.getCurrentAccount();
                                Activity parentActivity = d2Var.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                if (z10) {
                                    M0 = org.telegram.messenger.bd.M0(2131743619, null);
                                    a02 = org.telegram.messenger.bd.a0("VideoCallAlert", null, 2131743620, org.telegram.messenger.l10.p(user));
                                } else {
                                    M0 = org.telegram.messenger.bd.M0(2131752631, null);
                                    a02 = org.telegram.messenger.bd.a0("CallAlert", null, 2131752632, org.telegram.messenger.l10.p(user));
                                }
                                j3 j3Var = new j3(parentActivity);
                                org.telegram.messenger.hs.i(j3Var);
                                org.telegram.ui.ActionBar.r6.V(j3Var, org.telegram.ui.ActionBar.k6.j5, null);
                                j3Var.setTextSize(1, 16.0f);
                                int i3 = 5;
                                j3Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
                                j3Var.setText(org.telegram.messenger.g0.X2(a02));
                                u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
                                u8Var.u(org.telegram.messenger.g0.L(12.0f));
                                u8Var.p = 1.0f;
                                d2Var.getCurrentAccount();
                                u8Var.r(user);
                                k9 k9Var = new k9(parentActivity);
                                k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                k9Var.e(user, u8Var);
                                frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(M0);
                                boolean z11 = org.telegram.messenger.bd.a0;
                                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(j3Var, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.o(frameLayout);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752634, null), new ci.l3(d2Var, user, z10, i3));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                d2Var.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(org.telegram.ui.ActionBar.d2 d2Var, String str, boolean z10, boolean z11) {
                                q0(d2Var, str, z10, true, z11, false, null, null, null);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x0182, code lost:
                            
                                if (org.telegram.messenger.t3.p0(r35) == false) goto L61;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x019a, code lost:
                            
                                r8 = new org.telegram.ui.Cells.c2(1, r6, r38);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
                            
                                if (r35 == null) goto L64;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01ac, code lost:
                            
                                r11[0].e(org.telegram.messenger.bd.M0(2131751525, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01df, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e5, code lost:
                            
                                if (org.telegram.messenger.bd.a0 == false) goto L68;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e7, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01f2, code lost:
                            
                                if (org.telegram.messenger.bd.a0 == false) goto L73;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01f4, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01ff, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], b8.mf.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new org.telegram.ui.Components.w0(2, r1));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01fa, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01ec, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01c1, code lost:
                            
                                r11[0].e(org.telegram.messenger.bd.a0("DeleteMessagesOptionAlso", null, 2131751526, org.telegram.messenger.l10.j(r34, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
                            
                                if (org.telegram.messenger.t3.p0(r35) == false) goto L61;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.User user, TLRPC.Chat chat, boolean z10, org.telegram.messenger.ir irVar, org.telegram.ui.ActionBar.e6 e6Var) {
                                boolean z11;
                                if (d2Var == null || d2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = d2Var.getCurrentAccount();
                                Activity parentActivity = d2Var.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, e6Var);
                                long e10 = org.telegram.messenger.h10.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                h3 h3Var = new h3(parentActivity);
                                org.telegram.messenger.hs.i(h3Var);
                                org.telegram.ui.ActionBar.r6.V(h3Var, org.telegram.ui.ActionBar.k6.j5, null);
                                h3Var.setTextSize(1, 16.0f);
                                h3Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
                                i3 i3Var = new i3(parentActivity, c2VarArr);
                                alertDialog$Builder.o(i3Var);
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                i3Var.addView(textView, b8.mf.d(-1, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                i3Var.addView(h3Var, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i3 == -1) {
                                    textView.setText(org.telegram.messenger.bd.a0("ClearHistory", null, 2131752089, new Object[0]));
                                    if (user != null) {
                                        h3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AreYouSureClearHistoryWithUser", null, 2131754107, org.telegram.messenger.l10.p(user))));
                                    } else if (z10) {
                                        if (org.telegram.messenger.t3.V(chat)) {
                                            h3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AreYouSureClearHistoryWithChannel", null, 2131754110, chat.title)));
                                            z11 = false;
                                        } else {
                                            h3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AreYouSureClearHistoryWithChat", null, 2131754109, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        h3Var.setText(org.telegram.messenger.bd.M0(2131754112, null));
                                    } else {
                                        h3Var.setText(org.telegram.messenger.bd.M0(2131754114, null));
                                    }
                                    z11 = false;
                                } else {
                                    z11 = false;
                                    textView.setText(org.telegram.messenger.bd.G(i3, "DeleteDays", new Object[0]));
                                    h3Var.setText(org.telegram.messenger.bd.M0(2131751536, null));
                                }
                                boolean[] zArr = new boolean[1];
                                zArr[z11 ? 1 : 0] = z11;
                                if (chat != null && z10 && org.telegram.messenger.t3.t0(chat)) {
                                    zArr[z11 ? 1 : 0] = true;
                                }
                                if (user != null) {
                                    long j10 = user.id;
                                    if (j10 != e10) {
                                        if (j10 != 489000) {
                                        }
                                    }
                                }
                                if (chat != null) {
                                    if (z10) {
                                        if (!org.telegram.messenger.t3.t0(chat)) {
                                            if (!org.telegram.messenger.t3.V(chat)) {
                                            }
                                        }
                                    }
                                }
                                CharSequence M0 = org.telegram.messenger.bd.M0(2131751599, null);
                                if (chat != null && z10 && org.telegram.messenger.t3.t0(chat) && !org.telegram.messenger.t3.V(chat)) {
                                    M0 = org.telegram.messenger.bd.M0(2131752091, null);
                                }
                                alertDialog$Builder.k(M0, new org.telegram.ui.jo(13, irVar, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                d2Var.showDialog(s1Var);
                                TextView textView2 = (TextView) s1Var.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                            }

                            public static void q0(org.telegram.ui.ActionBar.d2 d2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, sf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (d2Var == null || d2Var.getParentActivity() == null) {
                                    return;
                                }
                                o0(d2Var.getParentActivity(), str, z10, z11, z12, z13, d2Var instanceof org.telegram.ui.wm ? ((org.telegram.ui.wm) d2Var).w8 : 0L, bVar, webPage, e6Var);
                            }

                            public static void r(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.ir irVar) {
                                s(d2Var, z10, false, chat, user, z11, z12, z13, z14, irVar, d2Var != null ? d2Var.getResourceProvider() : null);
                            }

                            public static void r0(Activity activity, int i3, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i10 = org.telegram.messenger.hp.s1(i3).o3;
                                if ((i10 & 1) != 0) {
                                    org.telegram.ui.Cells.f1.x(null, 2131748694, arrayList, 0, arrayList2);
                                }
                                if ((i10 & 2) != 0) {
                                    org.telegram.ui.Cells.f1.x(null, 2131748696, arrayList, 1, arrayList2);
                                }
                                if ((i10 & 4) != 0) {
                                    org.telegram.ui.Cells.f1.x(null, 2131748692, arrayList, 3, arrayList2);
                                }
                                arrayList.add(org.telegram.messenger.bd.M0(2131748695, null));
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
                                alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131748693, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.o(linearLayout);
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
                                    i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    i6Var.setTag(Integer.valueOf(i11));
                                    a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, null);
                                    i6Var.b((CharSequence) arrayList.get(i11), org.telegram.messenger.az.o0 == ((Integer) arrayList2.get(i11)).intValue());
                                    int i12 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 2, -1);
                                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                                    i6Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.r6.k(i6Var, h02, null, N, null);
                                    linearLayout.addView(i6Var);
                                    i6Var.setOnClickListener(new ai.h(arrayList2, runnable, alertDialog$Builder, 23));
                                }
                                if (!z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                }
                                org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder.p();
                                if (z10) {
                                    p10.setCanceledOnTouchOutside(false);
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
                            public static void s(final org.telegram.ui.ActionBar.d2 d2Var, final boolean z10, final boolean z11, final TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final org.telegram.messenger.ir irVar, final org.telegram.ui.ActionBar.e6 e6Var) {
                                long j10;
                                boolean z16;
                                boolean z17;
                                u8 u8Var;
                                TLRPC.Chat chat2;
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                d3 d3Var;
                                ArrayList arrayList;
                                org.telegram.ui.ActionBar.s1 s1Var;
                                u8 u8Var2;
                                float f10;
                                float f11;
                                boolean z18;
                                u8 u8Var3;
                                boolean z19;
                                boolean z20;
                                String str;
                                CharSequence M0;
                                TextView textView;
                                if (d2Var == null || d2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (chat == null && user == null) {
                                    return;
                                }
                                final int currentAccount = d2Var.getCurrentAccount();
                                final Activity parentActivity = d2Var.getParentActivity();
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, e6Var);
                                long e10 = org.telegram.messenger.h10.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                d3 d3Var2 = new d3(parentActivity);
                                org.telegram.messenger.hs.i(d3Var2);
                                org.telegram.ui.ActionBar.r6.V(d3Var2, org.telegram.ui.ActionBar.k6.j5, null);
                                d3Var2.setTextSize(1, 16.0f);
                                d3Var2.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
                                if (!z15 && org.telegram.messenger.t3.T(chat) && org.telegram.messenger.t3.t0(chat)) {
                                    j10 = e10;
                                    z16 = true;
                                } else {
                                    j10 = e10;
                                    z16 = false;
                                }
                                e3 e3Var = new e3(parentActivity, c2VarArr2);
                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                                s1Var2.H = 6;
                                alertDialog$Builder.o(e3Var);
                                u8 u8Var4 = new u8((org.telegram.ui.ActionBar.e6) null);
                                u8Var4.u(org.telegram.messenger.g0.L(18.0f));
                                k9 k9Var = new k9(parentActivity);
                                k9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                                e3Var.addView(k9Var, b8.mf.d(30, 30.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                h6 h6Var = new h6(parentActivity, false, false, false);
                                org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.E8, null);
                                h6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
                                h6Var.setTypeface(org.telegram.messenger.g0.o());
                                h6Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                                h6Var.setEllipsizeByGradient(true);
                                if (!z10) {
                                    z17 = z16;
                                    if (chat == null) {
                                        h6Var.setText(org.telegram.messenger.bd.M0(2131751554, null));
                                    } else if (org.telegram.messenger.t3.Y(chat)) {
                                        h6Var.setText(org.telegram.messenger.bd.M0(2131751934, null));
                                    } else if (!org.telegram.messenger.t3.T(chat)) {
                                        h6Var.setText(org.telegram.messenger.bd.M0(2131748999, null));
                                    } else if (chat.monoforum) {
                                        h6Var.setText(org.telegram.messenger.bd.M0(2131749003, null));
                                    } else if (chat.megagroup) {
                                        h6Var.setText(org.telegram.messenger.bd.M0(2131748999, null));
                                    } else {
                                        h6Var.setText(org.telegram.messenger.bd.M0(2131749012, null));
                                    }
                                } else if (z16) {
                                    z17 = z16;
                                    h6Var.setText(org.telegram.messenger.bd.M0(2131752088, null));
                                } else {
                                    z17 = z16;
                                    h6Var.setText(org.telegram.messenger.bd.M0(2131752089, null));
                                }
                                boolean z21 = org.telegram.messenger.bd.a0;
                                e3Var.addView(h6Var, b8.mf.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
                                e3Var.addView(d3Var2, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.t3.p0(chat)) {
                                    u8Var = u8Var4;
                                    chat2 = d2Var.getMessagesController().v1(chat.id);
                                } else {
                                    u8Var = u8Var4;
                                    chat2 = null;
                                }
                                boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j10 ? 1 : (user.id == j10 ? 0 : -1)) != 0 && org.telegram.messenger.hp.s1(currentAccount).d3) && (user != null ? org.telegram.messenger.hp.s1(currentAccount).c3 : org.telegram.messenger.hp.s1(currentAccount).b3) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    c2VarArr = c2VarArr2;
                                    d3Var = d3Var2;
                                    arrayList = (ArrayList) org.telegram.messenger.hp.s1(currentAccount).S.f(user.id);
                                } else {
                                    c2VarArr = c2VarArr2;
                                    d3Var = d3Var2;
                                    arrayList = null;
                                }
                                boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((org.telegram.messenger.zi) arrayList.get(0)).k == null || (!(((org.telegram.messenger.zi) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((org.telegram.messenger.zi) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f10 = 10.0f;
                                    if (user.bot) {
                                        u8Var2 = u8Var;
                                        f11 = 8.0f;
                                        if (user.id != 489000) {
                                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                            c2VarArr[0] = c2Var;
                                            c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                                            c2VarArr[0].e(org.telegram.messenger.bd.M0(2131753694, null), "", false, false, false);
                                            s1Var = s1Var2;
                                            c2VarArr[0].setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                                            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var2.c(true, false);
                                            c2VarArr[0].setMultiline(true);
                                            e3Var.addView(c2VarArr[0], b8.mf.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            c2VarArr[0].setOnClickListener(new w0(1, zArr));
                                            u8Var3 = u8Var2;
                                            z19 = false;
                                            if (user != null) {
                                                u8 u8Var5 = u8Var3;
                                                d2Var.getCurrentAccount();
                                                u8Var5.q(chat2 != null ? chat2 : chat);
                                                k9Var.e(chat2 != null ? chat2 : chat, u8Var5);
                                            } else if (org.telegram.messenger.l10.z(user)) {
                                                u8 u8Var6 = u8Var3;
                                                u8Var6.p = 0.6f;
                                                u8Var6.g(12);
                                                k9Var.j(null, null, u8Var6, user);
                                            } else {
                                                u8 u8Var7 = u8Var3;
                                                if (user.id == j10) {
                                                    u8Var7.p = 0.6f;
                                                    u8Var7.g(1);
                                                    k9Var.j(null, null, u8Var7, user);
                                                } else {
                                                    u8Var7.p = 1.0f;
                                                    d2Var.getCurrentAccount();
                                                    u8Var7.r(user);
                                                    k9Var.e(user, u8Var7);
                                                }
                                            }
                                            if (z11) {
                                                d3 d3Var3 = d3Var;
                                                if (!z10) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z12) {
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754087, org.telegram.messenger.l10.p(user))));
                                                        } else if (user.id == j10) {
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131754090, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754086, org.telegram.messenger.l10.p(user))));
                                                        } else {
                                                            str = null;
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754088, org.telegram.messenger.l10.p(user))));
                                                        }
                                                    } else if (org.telegram.messenger.t3.T(chat)) {
                                                        String a02 = chat2 != null ? org.telegram.messenger.bd.a0(null, null, 2131748354, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131748651, a02)));
                                                        } else {
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131752389, a02)));
                                                        }
                                                    } else {
                                                        d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754104, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a03 = chat2 != null ? org.telegram.messenger.bd.a0(null, null, 2131748354, chat2.title) : chat.title;
                                                    if (!org.telegram.messenger.t3.T(chat) || (chat.megagroup && !org.telegram.messenger.t3.t0(chat))) {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754109, a03)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.bd.M0(2131754112, null));
                                                    } else {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.bd.M0(2131754114, null));
                                                    }
                                                } else if (z12) {
                                                    str = null;
                                                    d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754108, org.telegram.messenger.l10.p(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j10) {
                                                        d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131754111, null)));
                                                    } else {
                                                        d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754107, org.telegram.messenger.l10.p(user))));
                                                    }
                                                }
                                            } else if (org.telegram.messenger.l10.B(user)) {
                                                str = null;
                                                d3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751582, null)));
                                            } else {
                                                d3 d3Var4 = d3Var;
                                                str = null;
                                                if (chat == null || !org.telegram.messenger.t3.V(chat)) {
                                                    d3Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751586, null)));
                                                    str = null;
                                                } else {
                                                    d3Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751585, null)));
                                                }
                                            }
                                            if (!z11) {
                                                M0 = org.telegram.messenger.bd.M0(2131751591, str);
                                            } else if (z10) {
                                                M0 = z17 ? org.telegram.messenger.bd.M0(2131752088, str) : org.telegram.messenger.bd.M0(2131752090, str);
                                            } else if (z19 && zArr[0]) {
                                                M0 = org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131752422 : 2131751531, str);
                                            } else {
                                                M0 = org.telegram.messenger.t3.T(chat) ? chat.monoforum ? org.telegram.messenger.bd.M0(2131749003, str) : chat.megagroup ? org.telegram.messenger.bd.M0(2131748998, str) : org.telegram.messenger.bd.M0(2131749010, str) : org.telegram.messenger.bd.M0(2131751554, str);
                                            }
                                            final boolean z24 = z17;
                                            org.telegram.ui.ActionBar.s1 s1Var3 = s1Var;
                                            alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.k2
                                                @Override // org.telegram.ui.ActionBar.p1
                                                public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i3) {
                                                    boolean z25 = z24;
                                                    final boolean z26 = z11;
                                                    final boolean[] zArr2 = zArr;
                                                    final org.telegram.messenger.ir irVar2 = irVar;
                                                    boolean z27 = true;
                                                    if (!z25 && !z26 && !z12) {
                                                        final TLRPC.User user2 = user;
                                                        boolean B = org.telegram.messenger.l10.B(user2);
                                                        final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                                        final boolean z28 = z10;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z29 = z13;
                                                        final boolean z30 = z15;
                                                        final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                        if (B) {
                                                            t4.s(d2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, irVar2, e6Var2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            org.telegram.messenger.qr a04 = org.telegram.messenger.qr.a0(d2Var2.getCurrentAccount());
                                                            a04.a.c(new org.telegram.messenger.wq(a04, user2.id, new org.telegram.messenger.kr() { // from class: org.telegram.ui.Components.f1
                                                                @Override // org.telegram.messenger.kr
                                                                public final void a(int i10) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    org.telegram.messenger.ir irVar3 = irVar2;
                                                                    if (i10 >= 50) {
                                                                        t4.s(org.telegram.ui.ActionBar.d2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, irVar3, e6Var2);
                                                                    } else if (irVar3 != null) {
                                                                        irVar3.o(zArr3[0]);
                                                                    }
                                                                }
                                                            }, 0));
                                                            return;
                                                        }
                                                        if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final sf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                            h.d();
                                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                            tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.hp.i1(chat3);
                                                            final int i10 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                            c3.b bVar = new c3.b(1);
                                                            final Context context = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.n10() { // from class: org.telegram.ui.Components.g1
                                                                @Override // org.telegram.messenger.n10
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    sf.b.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    org.telegram.messenger.ir irVar3 = irVar2;
                                                                    if (user4 == null) {
                                                                        irVar3.o(z26 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Context context2 = context;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    cg.k0 k0Var = new cg.k0(context2, chat4, user4, i10, irVar3, e6Var2, 8);
                                                                    q1 q1Var = new q1(irVar3, 0);
                                                                    org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                                                                    if (d2Var3 == null || d2Var3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context3 = d2Var3.getContext();
                                                                    TLRPC.User f12 = org.telegram.messenger.h10.i(d2Var3.getCurrentAccount()).f();
                                                                    boolean V = org.telegram.messenger.t3.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context3);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    k9 k9Var2 = new k9(context3);
                                                                    u8 u8Var8 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                    u8Var8.r(f12);
                                                                    k9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    k9Var2.e(f12, u8Var8);
                                                                    frameLayout.addView(k9Var2, b8.mf.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context3);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, d2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, b8.mf.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    f3 f3Var = new f3(context3);
                                                                    u8 u8Var9 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                    u8Var9.r(user4);
                                                                    f3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    f3Var.e(user4, u8Var9);
                                                                    frameLayout.addView(f3Var, b8.mf.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    k9 k9Var3 = new k9(context3);
                                                                    u8 u8Var10 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                    u8Var10.q(chat4);
                                                                    k9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                    k9Var3.e(chat4, u8Var10);
                                                                    frameLayout.addView(k9Var3, b8.mf.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                    org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder2.a;
                                                                    s1Var5.R0 = -1.0f;
                                                                    s1Var5.W = frameLayout;
                                                                    s1Var5.S = org.telegram.messenger.bd.M0(V ? 2131749008 : 2131749000, null);
                                                                    s1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, V ? 2131749009 : 2131749001, org.telegram.messenger.l10.p(user4), chat4.title));
                                                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131754210, null), new t(k0Var, 4));
                                                                    alertDialog$Builder2.i(org.telegram.messenger.bd.M0(2131752589, null), null);
                                                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(V ? 2131749012 : 2131748998, null), new t(q1Var, 5));
                                                                    s1Var5.show();
                                                                    View d = s1Var5.d(-1);
                                                                    if (d instanceof TextView) {
                                                                        org.telegram.ui.ActionBar.r6.V((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        irVar2 = irVar2;
                                                    }
                                                    if (!z26 && !zArr2[0]) {
                                                        z27 = false;
                                                    }
                                                    irVar2.o(z27);
                                                }
                                            });
                                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                            d2Var.showDialog(s1Var3);
                                            textView = (TextView) s1Var3.d(-1);
                                            if (textView == null) {
                                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        s1Var = s1Var2;
                                        if (!z11 || (((!z12 || z10) && !z22) || org.telegram.messenger.l10.x(user) || z23)) {
                                            z18 = (z13 || z10 || chat == null || !chat.creator) ? false : true;
                                            if (!z18) {
                                                u8Var3 = u8Var2;
                                                z19 = z18;
                                                if (user != null) {
                                                }
                                                if (z11) {
                                                }
                                                if (!z11) {
                                                }
                                                final boolean z242 = z17;
                                                org.telegram.ui.ActionBar.s1 s1Var32 = s1Var;
                                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.k2
                                                    @Override // org.telegram.ui.ActionBar.p1
                                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i3) {
                                                        boolean z25 = z242;
                                                        final boolean z26 = z11;
                                                        final boolean[] zArr2 = zArr;
                                                        final org.telegram.messenger.ir irVar2 = irVar;
                                                        boolean z27 = true;
                                                        if (!z25 && !z26 && !z12) {
                                                            final TLRPC.User user2 = user;
                                                            boolean B = org.telegram.messenger.l10.B(user2);
                                                            final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                                            final boolean z28 = z10;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z29 = z13;
                                                            final boolean z30 = z15;
                                                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                            if (B) {
                                                                t4.s(d2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, irVar2, e6Var2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                org.telegram.messenger.qr a04 = org.telegram.messenger.qr.a0(d2Var2.getCurrentAccount());
                                                                a04.a.c(new org.telegram.messenger.wq(a04, user2.id, new org.telegram.messenger.kr() { // from class: org.telegram.ui.Components.f1
                                                                    @Override // org.telegram.messenger.kr
                                                                    public final void a(int i10) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        org.telegram.messenger.ir irVar3 = irVar2;
                                                                        if (i10 >= 50) {
                                                                            t4.s(org.telegram.ui.ActionBar.d2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, irVar3, e6Var2);
                                                                        } else if (irVar3 != null) {
                                                                            irVar3.o(zArr3[0]);
                                                                        }
                                                                    }
                                                                }, 0));
                                                                return;
                                                            }
                                                            if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final sf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                                h.d();
                                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                                tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.hp.i1(chat3);
                                                                final int i10 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                                c3.b bVar = new c3.b(1);
                                                                final Context context = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.n10() { // from class: org.telegram.ui.Components.g1
                                                                    @Override // org.telegram.messenger.n10
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        sf.b.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        org.telegram.messenger.ir irVar3 = irVar2;
                                                                        if (user4 == null) {
                                                                            irVar3.o(z26 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Context context2 = context;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        cg.k0 k0Var = new cg.k0(context2, chat4, user4, i10, irVar3, e6Var2, 8);
                                                                        q1 q1Var = new q1(irVar3, 0);
                                                                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                                                                        if (d2Var3 == null || d2Var3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context3 = d2Var3.getContext();
                                                                        TLRPC.User f12 = org.telegram.messenger.h10.i(d2Var3.getCurrentAccount()).f();
                                                                        boolean V = org.telegram.messenger.t3.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        k9 k9Var2 = new k9(context3);
                                                                        u8 u8Var8 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                        u8Var8.r(f12);
                                                                        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        k9Var2.e(f12, u8Var8);
                                                                        frameLayout.addView(k9Var2, b8.mf.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context3);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, d2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, b8.mf.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        f3 f3Var = new f3(context3);
                                                                        u8 u8Var9 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                        u8Var9.r(user4);
                                                                        f3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        f3Var.e(user4, u8Var9);
                                                                        frameLayout.addView(f3Var, b8.mf.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        k9 k9Var3 = new k9(context3);
                                                                        u8 u8Var10 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                        u8Var10.q(chat4);
                                                                        k9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                        k9Var3.e(chat4, u8Var10);
                                                                        frameLayout.addView(k9Var3, b8.mf.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                        org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder2.a;
                                                                        s1Var5.R0 = -1.0f;
                                                                        s1Var5.W = frameLayout;
                                                                        s1Var5.S = org.telegram.messenger.bd.M0(V ? 2131749008 : 2131749000, null);
                                                                        s1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, V ? 2131749009 : 2131749001, org.telegram.messenger.l10.p(user4), chat4.title));
                                                                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131754210, null), new t(k0Var, 4));
                                                                        alertDialog$Builder2.i(org.telegram.messenger.bd.M0(2131752589, null), null);
                                                                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(V ? 2131749012 : 2131748998, null), new t(q1Var, 5));
                                                                        s1Var5.show();
                                                                        View d = s1Var5.d(-1);
                                                                        if (d instanceof TextView) {
                                                                            org.telegram.ui.ActionBar.r6.V((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            irVar2 = irVar2;
                                                        }
                                                        if (!z26 && !zArr2[0]) {
                                                            z27 = false;
                                                        }
                                                        irVar2.o(z27);
                                                    }
                                                });
                                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                                d2Var.showDialog(s1Var32);
                                                textView = (TextView) s1Var32.d(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z18 = false;
                                        }
                                        org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                        c2VarArr[0] = c2Var3;
                                        c2Var3.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                                        if (!z18) {
                                            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                                                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131751537, null), "", false, false, false);
                                            } else {
                                                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131751558, null), "", false, false, false);
                                            }
                                            z20 = true;
                                        } else if (z10) {
                                            z20 = true;
                                            c2VarArr[0].e(org.telegram.messenger.bd.a0(null, null, 2131752080, org.telegram.messenger.l10.j(user, true)), "", false, false, false);
                                        } else {
                                            z20 = true;
                                            c2VarArr[0].e(org.telegram.messenger.bd.a0(null, null, 2131751526, org.telegram.messenger.l10.j(user, true)), "", false, false, false);
                                        }
                                        c2VarArr[0].setMultiline(z20);
                                        u8Var3 = u8Var2;
                                        c2VarArr[0].setPadding(!org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                        e3Var.addView(c2VarArr[0], b8.mf.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        org.telegram.ui.rn rnVar = new org.telegram.ui.rn(z18, chat, alertDialog$Builder, zArr);
                                        c2VarArr[0].setOnClickListener(new org.telegram.messenger.video.g(27, zArr, rnVar));
                                        if (z14) {
                                            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var4.c(true, false);
                                            rnVar.run();
                                        }
                                        z19 = z18;
                                        if (user != null) {
                                        }
                                        if (z11) {
                                        }
                                        if (!z11) {
                                        }
                                        final boolean z2422 = z17;
                                        org.telegram.ui.ActionBar.s1 s1Var322 = s1Var;
                                        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.k2
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i3) {
                                                boolean z25 = z2422;
                                                final boolean z26 = z11;
                                                final boolean[] zArr2 = zArr;
                                                final org.telegram.messenger.ir irVar2 = irVar;
                                                boolean z27 = true;
                                                if (!z25 && !z26 && !z12) {
                                                    final TLRPC.User user2 = user;
                                                    boolean B = org.telegram.messenger.l10.B(user2);
                                                    final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                                    final boolean z28 = z10;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z29 = z13;
                                                    final boolean z30 = z15;
                                                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                    if (B) {
                                                        t4.s(d2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, irVar2, e6Var2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        org.telegram.messenger.qr a04 = org.telegram.messenger.qr.a0(d2Var2.getCurrentAccount());
                                                        a04.a.c(new org.telegram.messenger.wq(a04, user2.id, new org.telegram.messenger.kr() { // from class: org.telegram.ui.Components.f1
                                                            @Override // org.telegram.messenger.kr
                                                            public final void a(int i10) {
                                                                boolean[] zArr3 = zArr2;
                                                                org.telegram.messenger.ir irVar3 = irVar2;
                                                                if (i10 >= 50) {
                                                                    t4.s(org.telegram.ui.ActionBar.d2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, irVar3, e6Var2);
                                                                } else if (irVar3 != null) {
                                                                    irVar3.o(zArr3[0]);
                                                                }
                                                            }
                                                        }, 0));
                                                        return;
                                                    }
                                                    if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final sf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                        h.d();
                                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                        tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.hp.i1(chat3);
                                                        final int i10 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                        c3.b bVar = new c3.b(1);
                                                        final Context context = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.n10() { // from class: org.telegram.ui.Components.g1
                                                            @Override // org.telegram.messenger.n10
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                sf.b.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                org.telegram.messenger.ir irVar3 = irVar2;
                                                                if (user4 == null) {
                                                                    irVar3.o(z26 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Context context2 = context;
                                                                TLRPC.Chat chat4 = chat3;
                                                                cg.k0 k0Var = new cg.k0(context2, chat4, user4, i10, irVar3, e6Var2, 8);
                                                                q1 q1Var = new q1(irVar3, 0);
                                                                org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                                                                if (d2Var3 == null || d2Var3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context3 = d2Var3.getContext();
                                                                TLRPC.User f12 = org.telegram.messenger.h10.i(d2Var3.getCurrentAccount()).f();
                                                                boolean V = org.telegram.messenger.t3.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                k9 k9Var2 = new k9(context3);
                                                                u8 u8Var8 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                u8Var8.r(f12);
                                                                k9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                k9Var2.e(f12, u8Var8);
                                                                frameLayout.addView(k9Var2, b8.mf.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context3);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, d2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, b8.mf.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                f3 f3Var = new f3(context3);
                                                                u8 u8Var9 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                u8Var9.r(user4);
                                                                f3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                f3Var.e(user4, u8Var9);
                                                                frameLayout.addView(f3Var, b8.mf.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                k9 k9Var3 = new k9(context3);
                                                                u8 u8Var10 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                                u8Var10.q(chat4);
                                                                k9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                k9Var3.e(chat4, u8Var10);
                                                                frameLayout.addView(k9Var3, b8.mf.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder2.a;
                                                                s1Var5.R0 = -1.0f;
                                                                s1Var5.W = frameLayout;
                                                                s1Var5.S = org.telegram.messenger.bd.M0(V ? 2131749008 : 2131749000, null);
                                                                s1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, V ? 2131749009 : 2131749001, org.telegram.messenger.l10.p(user4), chat4.title));
                                                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131754210, null), new t(k0Var, 4));
                                                                alertDialog$Builder2.i(org.telegram.messenger.bd.M0(2131752589, null), null);
                                                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(V ? 2131749012 : 2131748998, null), new t(q1Var, 5));
                                                                s1Var5.show();
                                                                View d = s1Var5.d(-1);
                                                                if (d instanceof TextView) {
                                                                    org.telegram.ui.ActionBar.r6.V((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    irVar2 = irVar2;
                                                }
                                                if (!z26 && !zArr2[0]) {
                                                    z27 = false;
                                                }
                                                irVar2.o(z27);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                        d2Var.showDialog(s1Var322);
                                        textView = (TextView) s1Var322.d(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        s1Var = s1Var2;
                                        u8Var2 = u8Var;
                                    }
                                } else {
                                    s1Var = s1Var2;
                                    u8Var2 = u8Var;
                                    f10 = 10.0f;
                                }
                                f11 = 8.0f;
                                if (z11) {
                                }
                                if (z13) {
                                }
                                if (!z18) {
                                }
                                org.telegram.ui.Cells.c2 c2Var32 = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                c2VarArr[0] = c2Var32;
                                c2Var32.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                                if (!z18) {
                                }
                                c2VarArr[0].setMultiline(z20);
                                u8Var3 = u8Var2;
                                c2VarArr[0].setPadding(!org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                e3Var.addView(c2VarArr[0], b8.mf.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                org.telegram.ui.rn rnVar2 = new org.telegram.ui.rn(z18, chat, alertDialog$Builder, zArr);
                                c2VarArr[0].setOnClickListener(new org.telegram.messenger.video.g(27, zArr, rnVar2));
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
                                org.telegram.ui.ActionBar.s1 s1Var3222 = s1Var;
                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.k2
                                    @Override // org.telegram.ui.ActionBar.p1
                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i3) {
                                        boolean z25 = z24222;
                                        final boolean z26 = z11;
                                        final boolean[] zArr2 = zArr;
                                        final org.telegram.messenger.ir irVar2 = irVar;
                                        boolean z27 = true;
                                        if (!z25 && !z26 && !z12) {
                                            final TLRPC.User user2 = user;
                                            boolean B = org.telegram.messenger.l10.B(user2);
                                            final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                            final boolean z28 = z10;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z29 = z13;
                                            final boolean z30 = z15;
                                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                            if (B) {
                                                t4.s(d2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, irVar2, e6Var2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                org.telegram.messenger.qr a04 = org.telegram.messenger.qr.a0(d2Var2.getCurrentAccount());
                                                a04.a.c(new org.telegram.messenger.wq(a04, user2.id, new org.telegram.messenger.kr() { // from class: org.telegram.ui.Components.f1
                                                    @Override // org.telegram.messenger.kr
                                                    public final void a(int i10) {
                                                        boolean[] zArr3 = zArr2;
                                                        org.telegram.messenger.ir irVar3 = irVar2;
                                                        if (i10 >= 50) {
                                                            t4.s(org.telegram.ui.ActionBar.d2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, irVar3, e6Var2);
                                                        } else if (irVar3 != null) {
                                                            irVar3.o(zArr3[0]);
                                                        }
                                                    }
                                                }, 0));
                                                return;
                                            }
                                            if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final sf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                h.d();
                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.hp.i1(chat3);
                                                final int i10 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                c3.b bVar = new c3.b(1);
                                                final Context context = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.n10() { // from class: org.telegram.ui.Components.g1
                                                    @Override // org.telegram.messenger.n10
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        sf.b.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        org.telegram.messenger.ir irVar3 = irVar2;
                                                        if (user4 == null) {
                                                            irVar3.o(z26 || zArr2[0]);
                                                            return;
                                                        }
                                                        Context context2 = context;
                                                        TLRPC.Chat chat4 = chat3;
                                                        cg.k0 k0Var = new cg.k0(context2, chat4, user4, i10, irVar3, e6Var2, 8);
                                                        q1 q1Var = new q1(irVar3, 0);
                                                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                                                        if (d2Var3 == null || d2Var3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context3 = d2Var3.getContext();
                                                        TLRPC.User f12 = org.telegram.messenger.h10.i(d2Var3.getCurrentAccount()).f();
                                                        boolean V = org.telegram.messenger.t3.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        k9 k9Var2 = new k9(context3);
                                                        u8 u8Var8 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                        u8Var8.r(f12);
                                                        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        k9Var2.e(f12, u8Var8);
                                                        frameLayout.addView(k9Var2, b8.mf.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context3);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, d2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, b8.mf.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        f3 f3Var = new f3(context3);
                                                        u8 u8Var9 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                        u8Var9.r(user4);
                                                        f3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        f3Var.e(user4, u8Var9);
                                                        frameLayout.addView(f3Var, b8.mf.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        k9 k9Var3 = new k9(context3);
                                                        u8 u8Var10 = new u8((org.telegram.ui.ActionBar.e6) null);
                                                        u8Var10.q(chat4);
                                                        k9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                        k9Var3.e(chat4, u8Var10);
                                                        frameLayout.addView(k9Var3, b8.mf.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                        org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder2.a;
                                                        s1Var5.R0 = -1.0f;
                                                        s1Var5.W = frameLayout;
                                                        s1Var5.S = org.telegram.messenger.bd.M0(V ? 2131749008 : 2131749000, null);
                                                        s1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, V ? 2131749009 : 2131749001, org.telegram.messenger.l10.p(user4), chat4.title));
                                                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131754210, null), new t(k0Var, 4));
                                                        alertDialog$Builder2.i(org.telegram.messenger.bd.M0(2131752589, null), null);
                                                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(V ? 2131749012 : 2131748998, null), new t(q1Var, 5));
                                                        s1Var5.show();
                                                        View d = s1Var5.d(-1);
                                                        if (d instanceof TextView) {
                                                            org.telegram.ui.ActionBar.r6.V((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            irVar2 = irVar2;
                                        }
                                        if (!z26 && !zArr2[0]) {
                                            z27 = false;
                                        }
                                        irVar2.o(z27);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                d2Var.showDialog(s1Var3222);
                                textView = (TextView) s1Var3222.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static void s0(int i3, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (i3 == 0 || d2Var == null || d2Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var);
                                String M0 = org.telegram.messenger.bd.M0(2131743926, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                if (i3 == 1) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751088, null);
                                } else if (i3 == 2) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751100, null);
                                } else if (i3 == 3) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751094, null);
                                } else if (i3 == 4) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751087, null);
                                } else if (i3 == 5) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751099, null);
                                } else if (i3 == 6) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751093, null);
                                } else if (i3 == 7) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751091, null);
                                } else if (i3 == 8) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751092, null);
                                } else if (i3 == 9) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751083, null);
                                } else if (i3 == 10) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751095, null);
                                } else if (i3 == 11) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751084, null);
                                } else if (i3 == 12) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751096, null);
                                } else if (i3 == 13) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751081, null);
                                } else if (i3 == 14) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751082, null);
                                } else if (i3 == 15) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751089, null);
                                } else if (i3 == 16) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751090, null);
                                } else if (i3 == 17) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751101, null);
                                } else if (i3 == 18) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751102, null);
                                } else if (i3 == 19) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751097, null);
                                } else if (i3 == 20) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751098, null);
                                } else if (i3 == 21) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751085, null);
                                } else if (i3 == 22) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751086, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                d2Var.showDialog(s1Var, true, null);
                            }

                            public static org.telegram.ui.ActionBar.s1 t(Activity activity, final long j10, final long j11, final int i3, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
                                int i10;
                                SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).d7;
                                final String v = org.telegram.messenger.us.v(j10, j11, false);
                                if (j10 != 0) {
                                    StringBuilder sb2 = new StringBuilder("color_");
                                    sb2.append(v);
                                    i10 = sharedPreferences.contains(sb2.toString()) ? org.telegram.messenger.k5.c("color_", v, sharedPreferences, -16776961) : org.telegram.messenger.m5.z(j10) ? sharedPreferences.getInt("GroupLed", -16776961) : sharedPreferences.getInt("MessagesLed", -16776961);
                                } else {
                                    i10 = i3 == 1 ? sharedPreferences.getInt("MessagesLed", -16776961) : i3 == 0 ? sharedPreferences.getInt("GroupLed", -16776961) : i3 == 3 ? sharedPreferences.getInt("StoriesLed", -16776961) : (i3 == 5 || i3 == 4) ? sharedPreferences.getInt("ReactionsLed", -16776961) : sharedPreferences.getInt("ChannelLed", -16776961);
                                }
                                LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
                                String[] strArr = {org.telegram.messenger.bd.M0(2131752012, null), org.telegram.messenger.bd.M0(2131752017, null), org.telegram.messenger.bd.M0(2131752006, null), org.telegram.messenger.bd.M0(2131752018, null), org.telegram.messenger.bd.M0(2131752019, null), org.telegram.messenger.bd.M0(2131752020, null), org.telegram.messenger.bd.M0(2131752008, null), org.telegram.messenger.bd.M0(2131752013, null), org.telegram.messenger.bd.M0(2131752007, null)};
                                final int[] iArr = {i10};
                                for (int i11 = 0; i11 < 9; i11++) {
                                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
                                    i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    i6Var.setTag(Integer.valueOf(i11));
                                    int i12 = org.telegram.ui.Cells.s8.e[i11];
                                    i6Var.a(i12, i12);
                                    i6Var.b(strArr[i11], i10 == org.telegram.ui.Cells.s8.f[i11]);
                                    e10.addView(i6Var);
                                    i6Var.setOnClickListener(new l1(e10, iArr));
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
                                String M0 = org.telegram.messenger.bd.M0(2131748997, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                alertDialog$Builder.o(e10);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745560, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.l2
                                    @Override // org.telegram.ui.ActionBar.p1
                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i13) {
                                        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).d7.edit();
                                        long j12 = j10;
                                        int[] iArr2 = iArr;
                                        if (j12 != 0) {
                                            edit.putInt(t4.c.f("color_", v), iArr2[0]);
                                            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).l(j12, j11);
                                        } else {
                                            int i14 = i3;
                                            if (i14 == 1) {
                                                edit.putInt("MessagesLed", iArr2[0]);
                                            } else if (i14 == 0) {
                                                edit.putInt("GroupLed", iArr2[0]);
                                            } else if (i14 == 3) {
                                                edit.putInt("StoriesLed", iArr2[0]);
                                            } else if (i14 == 5 || i14 == 4) {
                                                edit.putInt("ReactionLed", iArr2[0]);
                                            } else {
                                                edit.putInt("ChannelLed", iArr2[0]);
                                            }
                                            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).m(i14);
                                        }
                                        edit.commit();
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                        }
                                    }
                                });
                                alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131748996, null), new b4.o(j10, i3, runnable, 6));
                                if (j10 != 0) {
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751601, null), new org.telegram.ui.jo(12, v, runnable));
                                }
                                return s1Var;
                            }

                            public static org.telegram.ui.ActionBar.s1 t0(org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (d2Var == null) {
                                    d2Var = LaunchActivity.T();
                                }
                                if (str2 == null || d2Var == null || d2Var.getParentActivity() == null) {
                                    return null;
                                }
                                org.telegram.ui.ActionBar.s1 s1Var = N(d2Var.getParentActivity(), str, str2, null, null, e6Var).a;
                                d2Var.showDialog(s1Var);
                                return s1Var;
                            }

                            public static void u(org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
                                String M0 = org.telegram.messenger.bd.M0(2131751788, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = org.telegram.messenger.bd.a0("ContactNotRegistered", null, 2131751789, org.telegram.messenger.g5.m(0, str, str2));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749182, null), new org.telegram.ui.jo(9, str3, d2Var));
                                d2Var.showDialog(s1Var);
                            }

                            public static org.telegram.ui.ActionBar.s1 u0(org.telegram.ui.ActionBar.d2 d2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
                                TextView textView;
                                org.telegram.ui.ActionBar.s1 O = O(d2Var.getContext(), d2Var.getResourceProvider(), str, charSequence, str2, runnable);
                                d2Var.showDialog(O);
                                if (z10 && (textView = (TextView) O.d(-1)) != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                                return O;
                            }

                            public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.kr krVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i3 = org.telegram.ui.ActionBar.k6.L5;
                                final int i10 = 0;
                                alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
                                alertDialog$Builder.n(i3, null);
                                alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751774, null));
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751773, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.n2
                                    @Override // org.telegram.ui.ActionBar.p1
                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i11) {
                                        switch (i10) {
                                            case 0:
                                                krVar.a(1);
                                                break;
                                            default:
                                                krVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                final int i11 = 1;
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.n2
                                    @Override // org.telegram.ui.ActionBar.p1
                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i112) {
                                        switch (i11) {
                                            case 0:
                                                krVar.a(1);
                                                break;
                                            default:
                                                krVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(String str, org.telegram.ui.ActionBar.d2 d2Var) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((d2Var == null || d2Var.getParentActivity() == null) ? org.telegram.messenger.t0.b : d2Var.getParentActivity(), str, 1).show();
                            }

                            public static AlertDialog$Builder w(Context context, int i3, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, k2.y yVar) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final cb0 cb0Var = new cb0(context, null);
                                final cb0 cb0Var2 = new cb0(context, null);
                                final cb0 cb0Var3 = new cb0(context, null);
                                linearLayout.addView(cb0Var2, b8.mf.l(0.3f, 0, -2));
                                final int i15 = 0;
                                cb0Var2.setOnScrollListener(new za0() { // from class: org.telegram.ui.Components.r1
                                    @Override // org.telegram.ui.Components.za0
                                    public final void d(int i16) {
                                        switch (i15) {
                                            case 0:
                                                if (z10 && i16 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i16 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i16 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                cb0Var.setMinValue(0);
                                cb0Var.setMaxValue(11);
                                linearLayout.addView(cb0Var, b8.mf.l(0.3f, 0, -2));
                                cb0Var.setFormatter(new c(10));
                                cb0Var.setOnValueChangedListener(new s1(cb0Var2, cb0Var, cb0Var3, 0));
                                final int i16 = 1;
                                cb0Var.setOnScrollListener(new za0() { // from class: org.telegram.ui.Components.r1
                                    @Override // org.telegram.ui.Components.za0
                                    public final void d(int i162) {
                                        switch (i16) {
                                            case 0:
                                                if (z10 && i162 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i162 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i162 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i17 = calendar.get(1);
                                cb0Var3.setMinValue(i3 + i17);
                                cb0Var3.setMaxValue(i10 + i17);
                                cb0Var3.setValue(i17 + i11);
                                linearLayout.addView(cb0Var3, b8.mf.l(0.4f, 0, -2));
                                cb0Var3.setOnValueChangedListener(new s1(cb0Var2, cb0Var, cb0Var3, 1));
                                final int i18 = 2;
                                cb0Var3.setOnScrollListener(new za0() { // from class: org.telegram.ui.Components.r1
                                    @Override // org.telegram.ui.Components.za0
                                    public final void d(int i162) {
                                        switch (i18) {
                                            case 0:
                                                if (z10 && i162 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i162 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i162 == 0) {
                                                    t4.d(cb0Var2, cb0Var, cb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                x0(cb0Var2, cb0Var, cb0Var3);
                                if (z10) {
                                    d(cb0Var2, cb0Var, cb0Var3);
                                }
                                if (i12 != -1) {
                                    cb0Var2.setValue(i12);
                                    cb0Var.setValue(i13);
                                    cb0Var3.setValue(i14);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.S = str;
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745560, null), new org.telegram.ui.ul(z10, cb0Var2, cb0Var, cb0Var3, yVar));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                return alertDialog$Builder;
                            }

                            public static org.telegram.ui.ActionBar.s1 w0(Context context, String str, boolean z10) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = str;
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                if (z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131743831, null), new i0(context, 2));
                                }
                                return alertDialog$Builder.p();
                            }

                            public static void x(Context context, String str, String str2, long j10, r4 r4Var) {
                                if (context == null) {
                                    return;
                                }
                                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
                                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
                                org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
                                org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
                                org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                                org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                                org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
                                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
                                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                                int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                                hi.d dVar = new hi.d(context, (org.telegram.ui.ActionBar.e6) null);
                                ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
                                cb0 cb0Var = new cb0(context, null);
                                cb0Var.setTextColor(x02);
                                cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                cb0Var.setItemCount(5);
                                s3 s3Var = new s3(context, null);
                                s3Var.setItemCount(5);
                                s3Var.setTextColor(x02);
                                s3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                t3 t3Var = new t3(context, null);
                                t3Var.setItemCount(5);
                                t3Var.setTextColor(x02);
                                t3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                                cb0 cb0Var2 = cb0Var;
                                n3 n3Var = new n3(context, cb0Var2, s3Var, t3Var, 2);
                                n3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                n3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                textView.setTextColor(x02);
                                textView.setTextSize(1, 20.0f);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new fi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                ci.ec ecVar = new ci.ec(context, 15);
                                linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                                cb0Var2.setMinValue(0);
                                cb0Var2.setMaxValue(365);
                                cb0Var2.setWrapSelectorWheel(false);
                                cb0Var2.setFormatter(new c(13));
                                aa.a aVar = new aa.a(cb0Var2, s3Var, t3Var, 20);
                                cb0Var2.setOnValueChangedListener(aVar);
                                s3Var.setMinValue(0);
                                s3Var.setMaxValue(23);
                                linearLayout.addView(s3Var, b8.mf.l(0.2f, 0, org.telegram.messenger.hs.t4));
                                s3Var.setFormatter(new c(14));
                                s3Var.setOnValueChangedListener(aVar);
                                t3Var.setMinValue(0);
                                t3Var.setMaxValue(59);
                                t3Var.setValue(0);
                                t3Var.setFormatter(new c(15));
                                linearLayout.addView(t3Var, b8.mf.l(0.3f, 0, org.telegram.messenger.hs.t4));
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
                                        cb0Var2 = cb0Var2;
                                        cb0Var2.setValue(timeInMillis);
                                    } else {
                                        cb0Var2 = cb0Var2;
                                    }
                                }
                                g(null, null, 0L, 0L, 0, cb0Var2, s3Var, t3Var);
                                ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                ecVar.setGravity(17);
                                ecVar.setTextColor(x04);
                                ecVar.setTextSize(1, 14.0f);
                                ecVar.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                ecVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x05, x06, x06));
                                ecVar.setText(str2);
                                n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                                ecVar.setOnClickListener(new m1(cb0Var2, s3Var, t3Var, calendar, r4Var, dVar, 1));
                                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
                                t2Var.O = n3Var;
                                t2Var.show();
                                t2Var.v0(x03);
                                t2Var.O(x03);
                            }

                            public static void x0(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, cb0Var2.getValue());
                                calendar.set(1, cb0Var3.getValue());
                                cb0Var.setMinValue(1);
                                cb0Var.setMaxValue(calendar.getActualMaximum(5));
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
                            /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.String, org.telegram.ui.ActionBar.e6, org.telegram.ui.ActionBar.p1] */
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
                            public static void y(final org.telegram.ui.ActionBar.d2 d2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j10, final org.telegram.messenger.zi ziVar, final SparseArray[] sparseArrayArr, final org.telegram.messenger.ui uiVar, final int i3, final int i10, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.e6 e6Var) {
                                Activity parentActivity;
                                Runnable runnable3;
                                final int i11;
                                long j11;
                                boolean z10;
                                boolean z11;
                                boolean z12;
                                boolean z13;
                                int i12;
                                int i13;
                                boolean z14;
                                int i14;
                                int i15;
                                boolean z15;
                                boolean z16;
                                boolean z17;
                                org.telegram.ui.Cells.c2 c2Var;
                                String str;
                                int i16;
                                TLRPC.MessageAction messageAction;
                                AlertDialog$Builder alertDialog$Builder;
                                final boolean z18;
                                org.telegram.ui.ActionBar.s1 s1Var;
                                int i17;
                                String str2;
                                String str3;
                                boolean z19;
                                ?? r12;
                                AlertDialog$Builder alertDialog$Builder2;
                                TextView textView;
                                TextView textView2;
                                AlertDialog$Builder alertDialog$Builder3;
                                int i18;
                                int i19;
                                boolean z20;
                                TLRPC.MessageAction messageAction2;
                                ArrayList arrayList;
                                int i20;
                                final int i21;
                                final int i22;
                                int i23;
                                int i24;
                                TLRPC.Message message;
                                org.telegram.messenger.zi ziVar2 = ziVar;
                                boolean z21 = i10 == 1;
                                boolean z22 = i10 == 3;
                                if (d2Var == null) {
                                    return;
                                }
                                if ((user == null && chat == null && encryptedChat == null) || (parentActivity = d2Var.getParentActivity()) == null) {
                                    return;
                                }
                                int currentAccount = d2Var.getCurrentAccount();
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, parentActivity, e6Var);
                                float f10 = runnable2 != null ? 0.5f : 0.6f;
                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder4.a;
                                s1Var2.T0 = f10;
                                int size = uiVar != null ? uiVar.d.size() : ziVar2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                long F = encryptedChat != null ? org.telegram.messenger.m5.F(encryptedChat.id) : user != null ? user.id : -chat.id;
                                if (z21) {
                                    if (ziVar2 == null || (message = ziVar2.k) == null) {
                                        i20 = currentAccount;
                                    } else {
                                        i20 = currentAccount;
                                        i24 = message.schedule_repeat_period;
                                        if (i24 > 0) {
                                            i23 = message.date;
                                            i22 = i24;
                                            i21 = i23;
                                            if (i21 <= 0 && i22 > 0) {
                                                String a02 = org.telegram.messenger.bd.a0(null, null, 2131748525, Integer.valueOf(i22));
                                                if (i22 == 31536000) {
                                                    a02 = org.telegram.messenger.bd.M0(2131748521, null);
                                                } else if (i22 >= 2592000) {
                                                    a02 = org.telegram.messenger.bd.G(i22 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                                } else if (i22 >= 604800) {
                                                    a02 = org.telegram.messenger.bd.G(i22 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                                } else if (i22 >= 86400) {
                                                    a02 = org.telegram.messenger.bd.G(i22 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                                }
                                                String str4 = a02;
                                                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(0, parentActivity, e6Var);
                                                String M0 = org.telegram.messenger.bd.M0(2131748519, null);
                                                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder5.a;
                                                s1Var3.S = M0;
                                                s1Var3.U = org.telegram.messenger.bd.M0(2131748520, null);
                                                final int i25 = i20;
                                                alertDialog$Builder5.h(str4, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.c3
                                                    @Override // org.telegram.ui.ActionBar.p1
                                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i26) {
                                                        org.telegram.messenger.ui uiVar2 = org.telegram.messenger.ui.this;
                                                        int i27 = i25;
                                                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                                        int i28 = i21;
                                                        int i29 = i22;
                                                        if (uiVar2 != null) {
                                                            ArrayList arrayList2 = uiVar2.d;
                                                            if (!arrayList2.isEmpty()) {
                                                                org.telegram.messenger.yy.C(i27).u((org.telegram.messenger.zi) arrayList2.get(0), d2Var2, i28 + i29, i29);
                                                                return;
                                                            }
                                                        }
                                                        org.telegram.messenger.yy.C(i27).u(ziVar, d2Var2, i28 + i29, i29);
                                                    }
                                                });
                                                final long j12 = F;
                                                final boolean z23 = z22;
                                                alertDialog$Builder5.i(org.telegram.messenger.bd.M0(2131748532, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.l0
                                                    @Override // org.telegram.ui.ActionBar.p1
                                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i26) {
                                                        SparseArray[] sparseArrayArr2;
                                                        ArrayList arrayList2;
                                                        int i27;
                                                        long j13;
                                                        ArrayList arrayList3;
                                                        TLRPC.Peer peer;
                                                        int i28;
                                                        long j14;
                                                        ArrayList arrayList4;
                                                        boolean z24 = z23;
                                                        int i29 = i25;
                                                        long e10 = z24 ? org.telegram.messenger.h10.i(i29).e() : j12;
                                                        org.telegram.messenger.zi ziVar3 = ziVar;
                                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                        long j15 = j10;
                                                        int i30 = i3;
                                                        int i31 = i10;
                                                        ArrayList arrayList5 = null;
                                                        if (ziVar3 != null) {
                                                            ArrayList arrayList6 = new ArrayList();
                                                            org.telegram.messenger.ui uiVar2 = uiVar;
                                                            if (uiVar2 != null) {
                                                                ArrayList arrayList7 = uiVar2.d;
                                                                int i32 = 0;
                                                                while (i32 < arrayList7.size()) {
                                                                    org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) arrayList7.get(i32);
                                                                    arrayList6.add(Integer.valueOf(ziVar4.f1()));
                                                                    if (encryptedChat2 != null) {
                                                                        arrayList4 = arrayList6;
                                                                        if (ziVar4.k.random_id == 0 || ziVar4.D == 10) {
                                                                            i28 = i29;
                                                                            j14 = e10;
                                                                        } else {
                                                                            if (arrayList5 == null) {
                                                                                arrayList5 = new ArrayList();
                                                                            }
                                                                            ArrayList arrayList8 = arrayList5;
                                                                            i28 = i29;
                                                                            j14 = e10;
                                                                            arrayList8.add(Long.valueOf(ziVar4.k.random_id));
                                                                            arrayList5 = arrayList8;
                                                                        }
                                                                    } else {
                                                                        i28 = i29;
                                                                        j14 = e10;
                                                                        arrayList4 = arrayList6;
                                                                    }
                                                                    i32++;
                                                                    arrayList6 = arrayList4;
                                                                    i29 = i28;
                                                                    e10 = j14;
                                                                }
                                                                i27 = i29;
                                                                j13 = e10;
                                                            } else {
                                                                i27 = i29;
                                                                j13 = e10;
                                                                arrayList6.add(Integer.valueOf(ziVar3.f1()));
                                                                if (encryptedChat2 != null && ziVar3.k.random_id != 0 && ziVar3.D != 10) {
                                                                    ArrayList arrayList9 = new ArrayList();
                                                                    arrayList9.add(Long.valueOf(ziVar3.k.random_id));
                                                                    arrayList3 = arrayList9;
                                                                    org.telegram.messenger.hp.s1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j15 == 0 && (peer = ziVar3.k.peer_id) != null && peer.chat_id == (-j15)) ? j15 : j13, i30, true, i31);
                                                                }
                                                            }
                                                            arrayList3 = arrayList5;
                                                            org.telegram.messenger.hp.s1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j15 == 0 && (peer = ziVar3.k.peer_id) != null && peer.chat_id == (-j15)) ? j15 : j13, i30, true, i31);
                                                        } else {
                                                            long j16 = e10;
                                                            int i33 = 1;
                                                            while (i33 >= 0) {
                                                                ArrayList arrayList10 = new ArrayList();
                                                                int i34 = 0;
                                                                while (true) {
                                                                    sparseArrayArr2 = sparseArrayArr;
                                                                    if (i34 >= sparseArrayArr2[i33].size()) {
                                                                        break;
                                                                    }
                                                                    arrayList10.add(Integer.valueOf(sparseArrayArr2[i33].keyAt(i34)));
                                                                    i34++;
                                                                }
                                                                if (encryptedChat2 != null) {
                                                                    ArrayList arrayList11 = new ArrayList();
                                                                    for (int i35 = 0; i35 < sparseArrayArr2[i33].size(); i35++) {
                                                                        org.telegram.messenger.zi ziVar5 = (org.telegram.messenger.zi) sparseArrayArr2[i33].valueAt(i35);
                                                                        long j17 = ziVar5.k.random_id;
                                                                        if (j17 != 0 && ziVar5.D != 10) {
                                                                            arrayList11.add(Long.valueOf(j17));
                                                                        }
                                                                    }
                                                                    arrayList2 = arrayList11;
                                                                } else {
                                                                    arrayList2 = null;
                                                                }
                                                                org.telegram.messenger.hp.s1(i29).Z(arrayList10, arrayList2, encryptedChat2, (i33 != 1 || j15 == 0) ? j16 : j15, i30, true, i31);
                                                                sparseArrayArr2[i33].clear();
                                                                i33--;
                                                            }
                                                        }
                                                        Runnable runnable4 = runnable;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                        }
                                                    }
                                                });
                                                alertDialog$Builder5.k(org.telegram.messenger.bd.M0(2131752589, null), null);
                                                alertDialog$Builder5.d(-2);
                                                alertDialog$Builder5.d(-3);
                                                s1Var3.O = new k0(1, runnable2);
                                                alertDialog$Builder5.p();
                                                return;
                                            }
                                            ziVar2 = ziVar;
                                            runnable3 = runnable2;
                                            i11 = i20;
                                            j11 = F;
                                            z10 = z22;
                                        }
                                    }
                                    if (uiVar != null) {
                                        ArrayList arrayList2 = uiVar.d;
                                        if (!arrayList2.isEmpty() && arrayList2.get(0) != null && ((org.telegram.messenger.zi) arrayList2.get(0)).k != null && ((org.telegram.messenger.zi) arrayList2.get(0)).k.schedule_repeat_period > 0) {
                                            i23 = ((org.telegram.messenger.zi) arrayList2.get(0)).k.date;
                                            i24 = ((org.telegram.messenger.zi) arrayList2.get(0)).k.schedule_repeat_period;
                                            i22 = i24;
                                            i21 = i23;
                                            if (i21 <= 0) {
                                            }
                                            ziVar2 = ziVar;
                                            runnable3 = runnable2;
                                            i11 = i20;
                                            j11 = F;
                                            z10 = z22;
                                        }
                                    }
                                    i21 = 0;
                                    i22 = 0;
                                    if (i21 <= 0) {
                                    }
                                    ziVar2 = ziVar;
                                    runnable3 = runnable2;
                                    i11 = i20;
                                    j11 = F;
                                    z10 = z22;
                                } else {
                                    runnable3 = runnable2;
                                    i11 = currentAccount;
                                    j11 = F;
                                    z10 = z22;
                                }
                                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                                org.telegram.messenger.hp.s1(i11).x7.i.g2(TimeUnit.SECONDS);
                                if (ziVar2 != null) {
                                    z13 = !ziVar2.U2() || Math.abs(currentTime - ziVar2.k.date) > 86400;
                                    if (ziVar2.R3()) {
                                        TLRPC.Message message2 = ziVar2.k;
                                        boolean z24 = message2.paid_suggested_post_stars;
                                        z12 = message2.paid_suggested_post_ton;
                                        z11 = z24;
                                    } else {
                                        z11 = false;
                                        z12 = false;
                                    }
                                } else {
                                    int i26 = 0;
                                    z11 = false;
                                    z12 = false;
                                    boolean z25 = false;
                                    while (i26 < 2) {
                                        int i27 = 0;
                                        while (true) {
                                            i12 = i26;
                                            if (i27 < sparseArrayArr[i26].size()) {
                                                org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) sparseArrayArr[i12].valueAt(i27);
                                                if (ziVar3.U2()) {
                                                    i13 = i27;
                                                } else {
                                                    i13 = i27;
                                                }
                                                z25 = true;
                                                if (ziVar3.R3()) {
                                                    TLRPC.Message message3 = ziVar3.k;
                                                    z11 |= message3.paid_suggested_post_stars;
                                                    z12 |= message3.paid_suggested_post_ton;
                                                }
                                                i27 = i13 + 1;
                                                i26 = i12;
                                            }
                                        }
                                        i26 = i12 + 1;
                                    }
                                    z13 = z25;
                                }
                                if (uiVar != null) {
                                    ArrayList arrayList3 = uiVar.d;
                                    z14 = z13;
                                    int i28 = 0;
                                    while (i28 < arrayList3.size()) {
                                        org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) arrayList3.get(i28);
                                        if (ziVar4.R3()) {
                                            TLRPC.Message message4 = ziVar4.k;
                                            arrayList = arrayList3;
                                            z11 = message4.paid_suggested_post_stars | z11;
                                            z12 = message4.paid_suggested_post_ton | z12;
                                        } else {
                                            arrayList = arrayList3;
                                        }
                                        i28++;
                                        arrayList3 = arrayList;
                                    }
                                } else {
                                    z14 = z13;
                                }
                                boolean z26 = z12;
                                boolean z27 = z11;
                                final boolean[] zArr = new boolean[1];
                                boolean z28 = user != null && org.telegram.messenger.hp.s1(i11).d3;
                                int i29 = user != null ? org.telegram.messenger.hp.s1(i11).c3 : org.telegram.messenger.hp.s1(i11).b3;
                                boolean z29 = encryptedChat == null && user != null && z28 && i29 == Integer.MAX_VALUE;
                                if (chat == null || !chat.megagroup || z21 || z10) {
                                    AlertDialog$Builder alertDialog$Builder6 = alertDialog$Builder4;
                                    i14 = i11;
                                    if (!z21 && !z10 && !org.telegram.messenger.t3.T(chat) && encryptedChat == null) {
                                        if ((user == null || user.id == org.telegram.messenger.h10.i(i14).e() || (user.bot && !user.support)) && chat == null) {
                                            i15 = 0;
                                            z16 = false;
                                        } else if (ziVar2 != null) {
                                            i15 = (ziVar2.o4() || !((messageAction = ziVar2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(ziVar2.O3() || z28 || org.telegram.messenger.t3.N(chat)) || currentTime - ziVar2.k.date > i29)) ? 0 : 1;
                                            z16 = !ziVar2.O3();
                                        } else {
                                            int i30 = 1;
                                            boolean z30 = false;
                                            int i31 = 0;
                                            while (i30 >= 0) {
                                                boolean z31 = z28;
                                                int i32 = 0;
                                                while (i32 < sparseArrayArr[i30].size()) {
                                                    org.telegram.messenger.zi ziVar5 = (org.telegram.messenger.zi) sparseArrayArr[i30].valueAt(i32);
                                                    int i33 = i32;
                                                    TLRPC.MessageAction messageAction3 = ziVar5.k.action;
                                                    int i34 = i30;
                                                    if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((ziVar5.O3() || z31 || (chat != null && org.telegram.messenger.t3.w(2, chat))) && currentTime - ziVar5.k.date <= i29)) {
                                                        i31++;
                                                        if (!z30 && !ziVar5.O3()) {
                                                            z30 = true;
                                                        }
                                                    }
                                                    i32 = i33 + 1;
                                                    i30 = i34;
                                                }
                                                i30--;
                                                z28 = z31;
                                            }
                                            z16 = z30;
                                            i15 = i31;
                                        }
                                        if (i15 <= 0 || !z14 || (user != null && org.telegram.messenger.l10.x(user))) {
                                            z17 = z16;
                                            z15 = false;
                                            alertDialog$Builder = alertDialog$Builder6;
                                        } else {
                                            FrameLayout frameLayout = new FrameLayout(parentActivity);
                                            org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                            c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                            if (z29) {
                                                c2Var = c2Var2;
                                                c2Var.e(org.telegram.messenger.bd.a0("DeleteMessagesOptionAlso", null, 2131751526, org.telegram.messenger.l10.j(user, true)), "", false, false, false);
                                            } else {
                                                c2Var = c2Var2;
                                                if (chat == null) {
                                                    str = null;
                                                    i16 = 2131751527;
                                                } else if (z16 || i15 == size) {
                                                    c2Var.e(org.telegram.messenger.bd.M0(2131751541, null), "", false, false, false);
                                                } else {
                                                    i16 = 2131751527;
                                                    str = null;
                                                }
                                                c2Var.e(org.telegram.messenger.bd.M0(i16, str), "", false, false, false);
                                            }
                                            org.telegram.ui.Cells.c2 c2Var3 = c2Var;
                                            c2Var3.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                            frameLayout.addView(c2Var3, b8.mf.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                            c2Var3.setOnClickListener(new w0(5, zArr));
                                            alertDialog$Builder6.o(frameLayout);
                                            s1Var2.H = 9;
                                            z17 = z16;
                                            z15 = true;
                                            alertDialog$Builder = alertDialog$Builder6;
                                        }
                                        int i35 = i15;
                                        AlertDialog$Builder alertDialog$Builder7 = alertDialog$Builder;
                                        z18 = z10;
                                        final int i36 = i14;
                                        final long j13 = j11;
                                        int i37 = size;
                                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.j0
                                            /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                            /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                            /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                            /* JADX WARN: Type inference failed for: r3v13 */
                                            /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
                                            /* JADX WARN: Type inference failed for: r3v15 */
                                            @Override // org.telegram.ui.ActionBar.p1
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i38) {
                                                SparseArray[] sparseArrayArr2;
                                                ArrayList arrayList4;
                                                int i39;
                                                long j14;
                                                char c2;
                                                ArrayList arrayList5;
                                                ?? r32;
                                                ArrayList arrayList6;
                                                long j15;
                                                int i40;
                                                int size2;
                                                int i41;
                                                long j16;
                                                TLRPC.Peer peer;
                                                long j17;
                                                boolean z32 = z18;
                                                int i42 = i36;
                                                long e10 = z32 ? org.telegram.messenger.h10.i(i42).e() : j13;
                                                org.telegram.messenger.zi ziVar6 = ziVar;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j18 = j10;
                                                int i43 = i3;
                                                boolean[] zArr2 = zArr;
                                                int i44 = i10;
                                                ArrayList arrayList7 = null;
                                                if (ziVar6 != null) {
                                                    ArrayList arrayList8 = new ArrayList();
                                                    ArrayList arrayList9 = new ArrayList();
                                                    org.telegram.messenger.ui uiVar2 = uiVar;
                                                    if (uiVar2 != null) {
                                                        ArrayList arrayList10 = uiVar2.d;
                                                        c2 = 0;
                                                        int i45 = 0;
                                                        while (i45 < arrayList10.size()) {
                                                            org.telegram.messenger.zi ziVar7 = (org.telegram.messenger.zi) arrayList10.get(i45);
                                                            int i46 = i42;
                                                            if (org.telegram.messenger.zi.d3(ziVar7.k)) {
                                                                arrayList8.add(ziVar7);
                                                            } else {
                                                                arrayList9.add(Integer.valueOf(ziVar7.f1()));
                                                                if (encryptedChat2 != null) {
                                                                    j17 = e10;
                                                                    if (ziVar7.k.random_id != 0 && ziVar7.D != 10) {
                                                                        if (arrayList7 == null) {
                                                                            arrayList7 = new ArrayList();
                                                                        }
                                                                        ArrayList arrayList11 = arrayList7;
                                                                        arrayList11.add(Long.valueOf(ziVar7.k.random_id));
                                                                        arrayList7 = arrayList11;
                                                                    }
                                                                    i45++;
                                                                    e10 = j17;
                                                                    i42 = i46;
                                                                }
                                                            }
                                                            j17 = e10;
                                                            i45++;
                                                            e10 = j17;
                                                            i42 = i46;
                                                        }
                                                        i39 = i42;
                                                        j14 = e10;
                                                    } else {
                                                        i39 = i42;
                                                        j14 = e10;
                                                        c2 = 0;
                                                        if (org.telegram.messenger.zi.d3(ziVar6.k)) {
                                                            arrayList8.add(ziVar6);
                                                        } else {
                                                            arrayList9.add(Integer.valueOf(ziVar6.f1()));
                                                            if (encryptedChat2 != null && ziVar6.k.random_id != 0 && ziVar6.D != 10) {
                                                                ArrayList arrayList12 = new ArrayList();
                                                                arrayList12.add(Long.valueOf(ziVar6.k.random_id));
                                                                arrayList5 = arrayList12;
                                                                long j19 = (j18 == 0 && (peer = ziVar6.k.peer_id) != null && peer.chat_id == (-j18)) ? j18 : j14;
                                                                if (arrayList9.isEmpty()) {
                                                                    r32 = c2;
                                                                    arrayList6 = arrayList8;
                                                                    j15 = j19;
                                                                    i40 = 1;
                                                                    org.telegram.messenger.hp.s1(i39).Z(arrayList9, arrayList5, encryptedChat2, j15, i43, zArr2[c2], i44);
                                                                } else {
                                                                    r32 = c2;
                                                                    arrayList6 = arrayList8;
                                                                    j15 = j19;
                                                                    i40 = 1;
                                                                }
                                                                size2 = arrayList6.size();
                                                                i41 = r32;
                                                                while (i41 < size2) {
                                                                    Object obj = arrayList6.get(i41);
                                                                    i41++;
                                                                    org.telegram.messenger.zi ziVar8 = (org.telegram.messenger.zi) obj;
                                                                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i39);
                                                                    ArrayList arrayList13 = new ArrayList();
                                                                    arrayList13.add(Integer.valueOf(ziVar8.f1()));
                                                                    if (j15 == 0 || !org.telegram.messenger.m5.z(j15)) {
                                                                        j16 = 0;
                                                                    } else {
                                                                        TLRPC.Chat M02 = s12.M0(Long.valueOf(-j15));
                                                                        j16 = org.telegram.messenger.t3.T(M02) ? M02.id : 0L;
                                                                    }
                                                                    s12.l3(arrayList13, j15);
                                                                    org.telegram.messenger.qr messagesStorage = s12.getMessagesStorage();
                                                                    int P0 = ziVar8.P0();
                                                                    messagesStorage.getClass();
                                                                    a0.h hVar = new a0.h(i40);
                                                                    ArrayList arrayList14 = new ArrayList(i40);
                                                                    arrayList14.add(Integer.valueOf(P0));
                                                                    hVar.k(arrayList14, j15);
                                                                    messagesStorage.I(new org.telegram.messenger.qf(messagesStorage, hVar, (boolean) r32, 3));
                                                                    s12.getMessagesStorage().P0(j15, arrayList13, true, true, org.telegram.messenger.zi.e5(ziVar8.k) ? 9 : r32, i43);
                                                                    s12.getMessagesStorage().R1(j15, j16, arrayList13, null);
                                                                    org.telegram.messenger.hs notificationCenter = s12.getNotificationCenter();
                                                                    Long valueOf = Long.valueOf(j16);
                                                                    Integer valueOf2 = Integer.valueOf((int) r32);
                                                                    Object[] objArr = new Object[6];
                                                                    objArr[r32] = arrayList13;
                                                                    objArr[i40] = valueOf;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    objArr[2] = bool;
                                                                    objArr[3] = bool;
                                                                    objArr[4] = bool;
                                                                    objArr[5] = valueOf2;
                                                                    notificationCenter.k(org.telegram.messenger.hs.w, objArr);
                                                                    if (!org.telegram.messenger.zi.e5(ziVar8.k) || ziVar8.c5()) {
                                                                        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                        tL_deleteMessage.peer = s12.j1(org.telegram.messenger.zi.B0(ziVar8.k));
                                                                        TLRPC.Message message5 = ziVar8.k;
                                                                        tL_deleteMessage.receiver_id = s12.o1(message5 != null ? message5.ephemeralReceiverBotId : 0L);
                                                                        tL_deleteMessage.id = ziVar8.P0();
                                                                        s12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new kh.b(3));
                                                                    } else {
                                                                        TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                        tL_deleteWelcomeMessage.peer = s12.j1(org.telegram.messenger.zi.B0(ziVar8.k));
                                                                        tL_deleteWelcomeMessage.id = ziVar8.P0();
                                                                        s12.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new kh.b(3));
                                                                    }
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
                                                    i41 = r32;
                                                    while (i41 < size2) {
                                                    }
                                                } else {
                                                    long j20 = e10;
                                                    int i47 = 0;
                                                    int i48 = 1;
                                                    while (i48 >= 0) {
                                                        ArrayList arrayList15 = new ArrayList();
                                                        int i49 = i47;
                                                        while (true) {
                                                            sparseArrayArr2 = sparseArrayArr;
                                                            if (i49 >= sparseArrayArr2[i48].size()) {
                                                                break;
                                                            }
                                                            arrayList15.add(Integer.valueOf(sparseArrayArr2[i48].keyAt(i49)));
                                                            i49++;
                                                        }
                                                        if (encryptedChat2 != null) {
                                                            arrayList4 = new ArrayList();
                                                            int i50 = i47;
                                                            while (i50 < sparseArrayArr2[i48].size()) {
                                                                org.telegram.messenger.zi ziVar9 = (org.telegram.messenger.zi) sparseArrayArr2[i48].valueAt(i50);
                                                                int i51 = i47;
                                                                long j21 = ziVar9.k.random_id;
                                                                if (j21 != 0 && ziVar9.D != 10) {
                                                                    arrayList4.add(Long.valueOf(j21));
                                                                }
                                                                i50++;
                                                                i47 = i51;
                                                            }
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                        int i52 = i47;
                                                        org.telegram.messenger.hp.s1(i42).Z(arrayList15, arrayList4, encryptedChat2, (i48 != 1 || j18 == 0) ? j20 : j18, i43, zArr2[i52], i44);
                                                        sparseArrayArr2[i48].clear();
                                                        i48--;
                                                        i47 = i52;
                                                    }
                                                }
                                                runnable.run();
                                            }
                                        };
                                        if (z18) {
                                            s1Var = s1Var2;
                                            i17 = 1;
                                            i17 = 1;
                                            str2 = null;
                                            if (i37 == 1) {
                                                s1Var.S = org.telegram.messenger.bd.M0(2131751497, null);
                                            } else {
                                                s1Var.S = org.telegram.messenger.bd.a0(null, null, 2131751520, org.telegram.messenger.bd.G(i37, "messages", new Object[0]));
                                            }
                                        } else {
                                            i17 = 1;
                                            i17 = 1;
                                            if (i37 == 1) {
                                                str2 = null;
                                                s1Var = s1Var2;
                                                s1Var.S = org.telegram.messenger.bd.M0(2131743846, null);
                                            } else {
                                                s1Var = s1Var2;
                                                str2 = null;
                                                s1Var.S = org.telegram.messenger.bd.a0(null, null, 2131743847, org.telegram.messenger.bd.G(i37, "messages", new Object[0]));
                                            }
                                        }
                                        if (z18) {
                                            if (chat == null || !z17) {
                                                if (!z15 || z29 || i35 == i37) {
                                                    if (chat == null || !chat.megagroup || z21) {
                                                        if (i37 == i17) {
                                                            s1Var.U = org.telegram.messenger.bd.M0(2131754093, null);
                                                        } else {
                                                            s1Var.U = org.telegram.messenger.bd.M0(2131754101, null);
                                                        }
                                                    } else if (i37 == i17) {
                                                        s1Var.U = org.telegram.messenger.bd.M0((ziVar == null || !org.telegram.messenger.zi.d3(ziVar.k)) ? 2131754092 : 2131754093, null);
                                                    } else {
                                                        s1Var.U = org.telegram.messenger.bd.M0(2131754100, null);
                                                    }
                                                } else if (chat != null) {
                                                    Object[] objArr = new Object[i17];
                                                    objArr[0] = org.telegram.messenger.bd.G(i35, "messages", new Object[0]);
                                                    s1Var.U = org.telegram.messenger.bd.a0("DeleteMessagesTextGroup", null, 2131751522, objArr);
                                                } else {
                                                    String G = org.telegram.messenger.bd.G(i35, "messages", new Object[0]);
                                                    String j14 = org.telegram.messenger.l10.j(user, i17);
                                                    Object[] objArr2 = new Object[2];
                                                    objArr2[0] = G;
                                                    objArr2[i17] = j14;
                                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("DeleteMessagesText", null, 2131751523, objArr2));
                                                }
                                            } else if (z15 && i35 != i37) {
                                                Object[] objArr3 = new Object[i17];
                                                objArr3[0] = org.telegram.messenger.bd.G(i35, "messages", new Object[0]);
                                                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751521, objArr3);
                                            } else if (i37 == i17) {
                                                s1Var.U = org.telegram.messenger.bd.M0(2131754093, null);
                                            } else {
                                                s1Var.U = org.telegram.messenger.bd.M0(2131754101, null);
                                            }
                                        } else if (i37 == i17) {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131754063, str2);
                                        } else {
                                            s1Var.U = org.telegram.messenger.bd.M0(2131754064, str2);
                                        }
                                        if (ziVar == null) {
                                            z19 = (!ziVar.v3() || org.telegram.messenger.zi.m3(ziVar.k)) ? false : i17;
                                            if (z19) {
                                                long j15 = ((TLRPC.TL_messageMediaGiveaway) ziVar.k.media).until_date * 1000;
                                                str3 = org.telegram.messenger.bd.E0().u0().format(new Date(j15));
                                                if (System.currentTimeMillis() < j15) {
                                                    z19 = i17;
                                                }
                                                z19 = false;
                                            } else {
                                                str3 = null;
                                            }
                                        } else if (i37 == i17) {
                                            boolean z32 = false;
                                            String str5 = null;
                                            for (int i38 = i17; i38 >= 0; i38--) {
                                                for (int i39 = 0; i39 < sparseArrayArr[i38].size(); i39++) {
                                                    org.telegram.messenger.zi ziVar6 = (org.telegram.messenger.zi) sparseArrayArr[i38].valueAt(i39);
                                                    boolean z33 = (!ziVar6.v3() || org.telegram.messenger.zi.m3(ziVar6.k)) ? false : i17;
                                                    if (z33) {
                                                        long j16 = ((TLRPC.TL_messageMediaGiveaway) ziVar6.k.media).until_date * 1000;
                                                        str5 = org.telegram.messenger.bd.E0().u0().format(new Date(j16));
                                                        z32 = System.currentTimeMillis() < j16 ? i17 : false;
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
                                                int g22 = (int) org.telegram.messenger.hp.s1(i36).x7.i.g2(TimeUnit.HOURS);
                                                s1Var.S = org.telegram.messenger.bd.M0(2131744344, null);
                                                Object[] objArr4 = new Object[i17];
                                                objArr4[0] = Integer.valueOf(g22);
                                                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744343, objArr4));
                                                alertDialog$Builder8.k(org.telegram.messenger.bd.M0(2131744346, null), p1Var);
                                                alertDialog$Builder2 = alertDialog$Builder8;
                                            } else if (!z19 || z18) {
                                                alertDialog$Builder8.k(org.telegram.messenger.bd.M0(z18 ? 2131746329 : 2131751599, null), p1Var);
                                                alertDialog$Builder2 = alertDialog$Builder8;
                                            } else {
                                                s1Var.S = org.telegram.messenger.bd.M0(2131753479, null);
                                                Object[] objArr5 = new Object[i17];
                                                objArr5[0] = str3;
                                                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131753480, objArr5));
                                                alertDialog$Builder8.i(org.telegram.messenger.bd.M0(2131751599, null), p1Var);
                                                alertDialog$Builder2 = alertDialog$Builder8;
                                            }
                                        } else {
                                            int g23 = (int) org.telegram.messenger.hp.s1(i36).x7.i.g2(TimeUnit.HOURS);
                                            r12 = 0;
                                            s1Var.S = org.telegram.messenger.bd.M0(2131744347, null);
                                            Object[] objArr6 = new Object[i17];
                                            objArr6[0] = Integer.valueOf(g23);
                                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744345, objArr6));
                                            AlertDialog$Builder alertDialog$Builder9 = alertDialog$Builder7;
                                            alertDialog$Builder9.k(org.telegram.messenger.bd.M0(2131744346, null), p1Var);
                                            alertDialog$Builder2 = alertDialog$Builder9;
                                        }
                                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, r12), r12);
                                        s1Var.O = new k0(0, runnable2);
                                        d2Var.showDialog(s1Var);
                                        textView = (TextView) s1Var.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, r12);
                                        }
                                        textView2 = (TextView) s1Var.d(-3);
                                        if (textView2 == null) {
                                            s1Var.w0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f));
                                            ((ViewGroup.MarginLayoutParams) s1Var.w0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-8.0f);
                                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                                            return;
                                        }
                                        return;
                                    }
                                    i15 = 0;
                                    z15 = false;
                                    alertDialog$Builder3 = alertDialog$Builder6;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder10 = alertDialog$Builder4;
                                    ArrayList arrayList4 = new ArrayList();
                                    if (ziVar2 != null) {
                                        TLRPC.MessageAction messageAction4 = ziVar2.k.action;
                                        if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                                            if (uiVar != null) {
                                                arrayList4.addAll(uiVar.d);
                                            } else {
                                                arrayList4.add(ziVar2);
                                            }
                                        }
                                        i18 = (!ziVar2.o4() && org.telegram.messenger.zi.B0(ziVar2.k) == j10 && ((messageAction2 = ziVar2.k.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && ziVar2.O3() && currentTime - ziVar2.k.date <= i29) ? 1 : 0;
                                    } else {
                                        int i40 = 1;
                                        int i41 = 0;
                                        while (i40 >= 0) {
                                            int i42 = 0;
                                            while (i42 < sparseArrayArr[i40].size()) {
                                                org.telegram.messenger.zi ziVar7 = (org.telegram.messenger.zi) sparseArrayArr[i40].valueAt(i42);
                                                int i43 = i42;
                                                if (i40 == 1 && ziVar7.O3()) {
                                                    TLRPC.Message message5 = ziVar7.k;
                                                    i19 = i40;
                                                    if (message5.action == null && currentTime - message5.date <= i29) {
                                                        i41++;
                                                    }
                                                } else {
                                                    i19 = i40;
                                                }
                                                arrayList4.add(ziVar7);
                                                i42 = i43 + 1;
                                                i40 = i19;
                                            }
                                            i40--;
                                        }
                                        i18 = i41;
                                    }
                                    int i44 = i18;
                                    int i45 = 3;
                                    ArrayList arrayList5 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new ai.t1(i45)).mapToLong(new org.telegram.messenger.ik(i45)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.m0
                                        @Override // java.util.function.LongFunction
                                        public final Object apply(long j17) {
                                            int i46 = i11;
                                            return j17 > 0 ? org.telegram.messenger.hp.s1(i46).a2(Long.valueOf(j17)) : org.telegram.messenger.hp.s1(i46).M0(Long.valueOf(-j17));
                                        }
                                    }).filter(new ai.t1(4)).filter(new org.telegram.ui.p8(org.telegram.messenger.h10.i(i11).e(), 2)).collect(Collectors.toCollection(new org.telegram.messenger.ek(1)));
                                    if (!arrayList5.isEmpty()) {
                                        if (channelParticipantArr != null) {
                                            lr lrVar = new lr(d2Var, chat, arrayList4, arrayList5, channelParticipantArr, j10, i3, i10, false, runnable);
                                            if (runnable3 != null) {
                                                lrVar.I0 = new k0(3, runnable3);
                                            }
                                            lrVar.show();
                                            return;
                                        }
                                        final org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, parentActivity, null)};
                                        final int size2 = arrayList5.size();
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                                        final int[] iArr = new int[size2];
                                        int[] iArr2 = new int[1];
                                        int i46 = 0;
                                        while (i46 < size2) {
                                            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                                            tL_channels_getParticipant.channel = org.telegram.messenger.hp.i1(chat);
                                            tL_channels_getParticipant.participant = org.telegram.messenger.hp.k1((TLObject) arrayList5.get(i46));
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                            ArrayList arrayList6 = arrayList5;
                                            final Runnable runnable4 = runnable3;
                                            final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                            final int[] iArr3 = iArr2;
                                            final int i47 = i46;
                                            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.n0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    final int[] iArr4 = iArr3;
                                                    final int[] iArr5 = iArr;
                                                    final int i48 = i47;
                                                    final TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                                    final int i49 = size2;
                                                    final org.telegram.ui.ActionBar.s1[] s1VarArr2 = s1VarArr;
                                                    final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                                    final TLRPC.User user2 = user;
                                                    final TLRPC.Chat chat2 = chat;
                                                    final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                    final TLRPC.ChatFull chatFull2 = chatFull;
                                                    final long j17 = j10;
                                                    final org.telegram.messenger.zi ziVar8 = ziVar;
                                                    final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                                    final org.telegram.messenger.ui uiVar2 = uiVar;
                                                    final int i50 = i3;
                                                    final int i51 = i10;
                                                    final Runnable runnable5 = runnable;
                                                    final Runnable runnable6 = runnable4;
                                                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.p1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            org.telegram.ui.ActionBar.s1[] s1VarArr3 = s1VarArr2;
                                                            int[] iArr6 = iArr4;
                                                            iArr6[0] = iArr6[0] + 1;
                                                            int[] iArr7 = iArr5;
                                                            int i52 = i48;
                                                            iArr7[i52] = 0;
                                                            TLObject tLObject2 = tLObject;
                                                            TLRPC.ChannelParticipant[] channelParticipantArr5 = channelParticipantArr4;
                                                            if (tLObject2 != null) {
                                                                channelParticipantArr5[i52] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                            }
                                                            if (iArr6[0] == i49) {
                                                                try {
                                                                    s1VarArr3[0].dismiss();
                                                                } catch (Throwable unused) {
                                                                }
                                                                s1VarArr3[0] = null;
                                                                t4.y(d2Var2, user2, chat2, encryptedChat2, chatFull2, j17, ziVar8, sparseArrayArr2, uiVar2, i50, i51, channelParticipantArr5, runnable5, runnable6, e6Var2);
                                                            }
                                                        }
                                                    });
                                                }
                                            };
                                            int[] iArr4 = iArr;
                                            iArr4[i47] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                                            i46 = i47 + 1;
                                            runnable3 = runnable2;
                                            size2 = size2;
                                            iArr = iArr4;
                                            channelParticipantArr2 = channelParticipantArr3;
                                            iArr2 = iArr3;
                                            arrayList5 = arrayList6;
                                            i11 = i11;
                                        }
                                        org.telegram.messenger.g0.i3(new ai.p1(s1VarArr, iArr, i11, runnable2, d2Var, 17), 1000L);
                                        return;
                                    }
                                    i14 = i11;
                                    if (i44 <= 0 || !z14) {
                                        z20 = false;
                                    } else {
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        org.telegram.ui.Cells.c2 c2Var4 = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                        c2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                        c2Var4.e(org.telegram.messenger.bd.M0(2131751527, null), "", false, false, false);
                                        c2Var4.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                        frameLayout2.addView(c2Var4, b8.mf.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                        c2Var4.setOnClickListener(new w0(4, zArr));
                                        alertDialog$Builder10.o(frameLayout2);
                                        s1Var2.H = 9;
                                        z20 = true;
                                    }
                                    z15 = z20;
                                    i15 = i44;
                                    alertDialog$Builder3 = alertDialog$Builder10;
                                }
                                z17 = false;
                                alertDialog$Builder = alertDialog$Builder3;
                                int i352 = i15;
                                AlertDialog$Builder alertDialog$Builder72 = alertDialog$Builder;
                                z18 = z10;
                                final int i362 = i14;
                                final long j132 = j11;
                                int i372 = size;
                                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.j0
                                    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                    /* JADX WARN: Type inference failed for: r3v13 */
                                    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r3v15 */
                                    @Override // org.telegram.ui.ActionBar.p1
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i382) {
                                        SparseArray[] sparseArrayArr2;
                                        ArrayList arrayList42;
                                        int i392;
                                        long j142;
                                        char c2;
                                        ArrayList arrayList52;
                                        ?? r32;
                                        ArrayList arrayList62;
                                        long j152;
                                        int i402;
                                        int size22;
                                        int i412;
                                        long j162;
                                        TLRPC.Peer peer;
                                        long j17;
                                        boolean z322 = z18;
                                        int i422 = i362;
                                        long e10 = z322 ? org.telegram.messenger.h10.i(i422).e() : j132;
                                        org.telegram.messenger.zi ziVar62 = ziVar;
                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                        long j18 = j10;
                                        int i432 = i3;
                                        boolean[] zArr2 = zArr;
                                        int i442 = i10;
                                        ArrayList arrayList7 = null;
                                        if (ziVar62 != null) {
                                            ArrayList arrayList8 = new ArrayList();
                                            ArrayList arrayList9 = new ArrayList();
                                            org.telegram.messenger.ui uiVar2 = uiVar;
                                            if (uiVar2 != null) {
                                                ArrayList arrayList10 = uiVar2.d;
                                                c2 = 0;
                                                int i452 = 0;
                                                while (i452 < arrayList10.size()) {
                                                    org.telegram.messenger.zi ziVar72 = (org.telegram.messenger.zi) arrayList10.get(i452);
                                                    int i462 = i422;
                                                    if (org.telegram.messenger.zi.d3(ziVar72.k)) {
                                                        arrayList8.add(ziVar72);
                                                    } else {
                                                        arrayList9.add(Integer.valueOf(ziVar72.f1()));
                                                        if (encryptedChat2 != null) {
                                                            j17 = e10;
                                                            if (ziVar72.k.random_id != 0 && ziVar72.D != 10) {
                                                                if (arrayList7 == null) {
                                                                    arrayList7 = new ArrayList();
                                                                }
                                                                ArrayList arrayList11 = arrayList7;
                                                                arrayList11.add(Long.valueOf(ziVar72.k.random_id));
                                                                arrayList7 = arrayList11;
                                                            }
                                                            i452++;
                                                            e10 = j17;
                                                            i422 = i462;
                                                        }
                                                    }
                                                    j17 = e10;
                                                    i452++;
                                                    e10 = j17;
                                                    i422 = i462;
                                                }
                                                i392 = i422;
                                                j142 = e10;
                                            } else {
                                                i392 = i422;
                                                j142 = e10;
                                                c2 = 0;
                                                if (org.telegram.messenger.zi.d3(ziVar62.k)) {
                                                    arrayList8.add(ziVar62);
                                                } else {
                                                    arrayList9.add(Integer.valueOf(ziVar62.f1()));
                                                    if (encryptedChat2 != null && ziVar62.k.random_id != 0 && ziVar62.D != 10) {
                                                        ArrayList arrayList12 = new ArrayList();
                                                        arrayList12.add(Long.valueOf(ziVar62.k.random_id));
                                                        arrayList52 = arrayList12;
                                                        long j19 = (j18 == 0 && (peer = ziVar62.k.peer_id) != null && peer.chat_id == (-j18)) ? j18 : j142;
                                                        if (arrayList9.isEmpty()) {
                                                            r32 = c2;
                                                            arrayList62 = arrayList8;
                                                            j152 = j19;
                                                            i402 = 1;
                                                            org.telegram.messenger.hp.s1(i392).Z(arrayList9, arrayList52, encryptedChat2, j152, i432, zArr2[c2], i442);
                                                        } else {
                                                            r32 = c2;
                                                            arrayList62 = arrayList8;
                                                            j152 = j19;
                                                            i402 = 1;
                                                        }
                                                        size22 = arrayList62.size();
                                                        i412 = r32;
                                                        while (i412 < size22) {
                                                            Object obj = arrayList62.get(i412);
                                                            i412++;
                                                            org.telegram.messenger.zi ziVar8 = (org.telegram.messenger.zi) obj;
                                                            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i392);
                                                            ArrayList arrayList13 = new ArrayList();
                                                            arrayList13.add(Integer.valueOf(ziVar8.f1()));
                                                            if (j152 == 0 || !org.telegram.messenger.m5.z(j152)) {
                                                                j162 = 0;
                                                            } else {
                                                                TLRPC.Chat M02 = s12.M0(Long.valueOf(-j152));
                                                                j162 = org.telegram.messenger.t3.T(M02) ? M02.id : 0L;
                                                            }
                                                            s12.l3(arrayList13, j152);
                                                            org.telegram.messenger.qr messagesStorage = s12.getMessagesStorage();
                                                            int P0 = ziVar8.P0();
                                                            messagesStorage.getClass();
                                                            a0.h hVar = new a0.h(i402);
                                                            ArrayList arrayList14 = new ArrayList(i402);
                                                            arrayList14.add(Integer.valueOf(P0));
                                                            hVar.k(arrayList14, j152);
                                                            messagesStorage.I(new org.telegram.messenger.qf(messagesStorage, hVar, (boolean) r32, 3));
                                                            s12.getMessagesStorage().P0(j152, arrayList13, true, true, org.telegram.messenger.zi.e5(ziVar8.k) ? 9 : r32, i432);
                                                            s12.getMessagesStorage().R1(j152, j162, arrayList13, null);
                                                            org.telegram.messenger.hs notificationCenter = s12.getNotificationCenter();
                                                            Long valueOf = Long.valueOf(j162);
                                                            Integer valueOf2 = Integer.valueOf((int) r32);
                                                            Object[] objArr7 = new Object[6];
                                                            objArr7[r32] = arrayList13;
                                                            objArr7[i402] = valueOf;
                                                            Boolean bool = Boolean.FALSE;
                                                            objArr7[2] = bool;
                                                            objArr7[3] = bool;
                                                            objArr7[4] = bool;
                                                            objArr7[5] = valueOf2;
                                                            notificationCenter.k(org.telegram.messenger.hs.w, objArr7);
                                                            if (!org.telegram.messenger.zi.e5(ziVar8.k) || ziVar8.c5()) {
                                                                TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                tL_deleteMessage.peer = s12.j1(org.telegram.messenger.zi.B0(ziVar8.k));
                                                                TLRPC.Message message52 = ziVar8.k;
                                                                tL_deleteMessage.receiver_id = s12.o1(message52 != null ? message52.ephemeralReceiverBotId : 0L);
                                                                tL_deleteMessage.id = ziVar8.P0();
                                                                s12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new kh.b(3));
                                                            } else {
                                                                TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                tL_deleteWelcomeMessage.peer = s12.j1(org.telegram.messenger.zi.B0(ziVar8.k));
                                                                tL_deleteWelcomeMessage.id = ziVar8.P0();
                                                                s12.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new kh.b(3));
                                                            }
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
                                            i412 = r32;
                                            while (i412 < size22) {
                                            }
                                        } else {
                                            long j20 = e10;
                                            int i472 = 0;
                                            int i48 = 1;
                                            while (i48 >= 0) {
                                                ArrayList arrayList15 = new ArrayList();
                                                int i49 = i472;
                                                while (true) {
                                                    sparseArrayArr2 = sparseArrayArr;
                                                    if (i49 >= sparseArrayArr2[i48].size()) {
                                                        break;
                                                    }
                                                    arrayList15.add(Integer.valueOf(sparseArrayArr2[i48].keyAt(i49)));
                                                    i49++;
                                                }
                                                if (encryptedChat2 != null) {
                                                    arrayList42 = new ArrayList();
                                                    int i50 = i472;
                                                    while (i50 < sparseArrayArr2[i48].size()) {
                                                        org.telegram.messenger.zi ziVar9 = (org.telegram.messenger.zi) sparseArrayArr2[i48].valueAt(i50);
                                                        int i51 = i472;
                                                        long j21 = ziVar9.k.random_id;
                                                        if (j21 != 0 && ziVar9.D != 10) {
                                                            arrayList42.add(Long.valueOf(j21));
                                                        }
                                                        i50++;
                                                        i472 = i51;
                                                    }
                                                } else {
                                                    arrayList42 = null;
                                                }
                                                int i52 = i472;
                                                org.telegram.messenger.hp.s1(i422).Z(arrayList15, arrayList42, encryptedChat2, (i48 != 1 || j18 == 0) ? j20 : j18, i432, zArr2[i52], i442);
                                                sparseArrayArr2[i48].clear();
                                                i48--;
                                                i472 = i52;
                                            }
                                        }
                                        runnable.run();
                                    }
                                };
                                if (z18) {
                                }
                                if (z18) {
                                }
                                if (ziVar == null) {
                                }
                                if (z27) {
                                }
                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, r12), r12);
                                s1Var.O = new k0(0, runnable2);
                                d2Var.showDialog(s1Var);
                                textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                }
                                textView2 = (TextView) s1Var.d(-3);
                                if (textView2 == null) {
                                }
                            }

                            public static AlertDialog$Builder z(Context context) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String y22 = org.telegram.messenger.g0.y2(null, R.raw.pip_voice_request);
                                r10 r10Var = new r10(0, context, true);
                                r10Var.setImportantForAccessibility(2);
                                ai.o2 o2Var = new ai.o2(context, r10Var);
                                o2Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
                                o2Var.setClipToOutline(true);
                                o2Var.setOutlineProvider(new cg.p0(13));
                                View view = new View(context);
                                view.setBackground(new BitmapDrawable(org.telegram.messenger.kz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(184.61539f), y22)));
                                o2Var.addView(view, b8.mf.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                                o2Var.addView(r10Var, b8.mf.c(117.0f, org.telegram.messenger.hs.C1));
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.W = o2Var;
                                s1Var.S = org.telegram.messenger.bd.M0(2131747324, null);
                                s1Var.U = org.telegram.messenger.bd.M0(2131747325, null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751161, null), new i0(context, 1));
                                s1Var.m0 = true;
                                s1Var.W0 = false;
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                s1Var.R0 = 0.5769231f;
                                return alertDialog$Builder;
                            }
                        }
