package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.m81;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class v4 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static org.telegram.ui.ActionBar.u1 A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747303, null));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = X2;
        int i7 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new k0(activity, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.u1 B(Activity activity, boolean z9, TLRPC.User user, org.telegram.messenger.sr srVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.hd.M0(2131745618, null), org.telegram.messenger.hd.M0(2131745617, null), org.telegram.messenger.hd.M0(2131745616, null), org.telegram.messenger.hd.M0(2131745615, null)};
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z9) {
            textView.setText(org.telegram.messenger.hd.M0(2131748843, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748840, org.telegram.messenger.t10.j(user, true)));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131748841, null));
        }
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        e10.addView(textView, c8.ha.t(-2, -2, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24, z9 ? 4 : 0, 24, 8));
        int i7 = 0;
        while (i7 < 4) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.d = 42;
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i7));
            a(j6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, f6Var);
            j6Var.b(strArr[i7], iArr[0] == i7);
            e10.addView(j6Var);
            j6Var.setOnClickListener(new m1(iArr, e10));
            i7++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z9) {
            u1Var.R = org.telegram.messenger.hd.M0(2131748842, null);
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.L5;
            int f10 = f6Var != null ? f6Var.f(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            u1Var.b0 = new no0(activity, 0);
            u1Var.c0 = f10;
            u1Var.d0 = -1;
            if (f6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.k6.L5, null);
            }
        }
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745460, null), new ni.c(27, iArr, srVar));
        alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.v2 C(final long j3, final long j10, final org.telegram.ui.ActionBar.f2 f2Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        if (f2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(f2Var.getParentActivity(), false, 1, f6Var);
        h.O = org.telegram.messenger.hd.M0(2131747923, null);
        h.P = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.a0("MuteFor", null, 2131748311, org.telegram.messenger.hd.G(1, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748311, org.telegram.messenger.hd.G(8, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748311, org.telegram.messenger.hd.G(2, "Days", new Object[0])), org.telegram.messenger.hd.M0(2131748312, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.a3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                int i10;
                if (i7 == 0) {
                    i10 = 0;
                } else {
                    int i11 = 1;
                    if (i7 != 1) {
                        i11 = 2;
                        if (i7 != 2) {
                            i11 = 3;
                        }
                    }
                    i10 = i11;
                }
                org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).T(j3, i10, j10);
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                if (hc.a(f2Var2)) {
                    hc.z(f2Var2, i10, 0, f6Var).j();
                }
            }
        };
        h.L = charSequenceArr;
        h.K = onClickListener;
        return h;
    }

    public static void D(Context context, org.telegram.ui.ActionBar.f6 f6Var, t4 t4Var) {
        if (context == null) {
            return;
        }
        int i7 = 0;
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        int f10 = f6Var != null ? f6Var.f(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        int f11 = f6Var != null ? f6Var.f(i11) : org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.xj;
        if (f6Var != null) {
            f6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.Bj;
        if (f6Var != null) {
            f6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        if (f6Var != null) {
            f6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        if (f6Var != null) {
            f6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.i6;
        if (f6Var != null) {
            f6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        int f12 = f6Var != null ? f6Var.f(i17) : org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.k6.Ci;
        int f13 = f6Var != null ? f6Var.f(i18) : org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.k6.Ei;
        int f14 = f6Var != null ? f6Var.f(i19) : org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        h9.f1 f1Var = new h9.f1(context, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
        int[] iArr = {30, 60, 120, org.telegram.messenger.qs.K2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        j4 j4Var = new j4(context, f6Var, iArr);
        j4Var.setMinValue(0);
        j4Var.setMaxValue(20);
        j4Var.setTextColor(f10);
        j4Var.setValue(0);
        j4Var.setFormatter(new w0(iArr, i7));
        f4 f4Var = new f4(context, j4Var, 1);
        f4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        f4Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131748309, null));
        textView.setTextColor(f10);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        f4Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        bi.md mdVar = new bi.md(context, 19);
        linearLayout.addView(j4Var, c8.ha.l(1.0f, 0, org.telegram.messenger.qs.t4));
        j4Var.setOnValueChangedListener(new org.telegram.ui.zq(6));
        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(f12);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, f13, f14, f14));
        mdVar.setText(org.telegram.messenger.hd.M0(2131753866, null));
        f4Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
        mdVar.setOnClickListener(new di.u3(iArr, j4Var, t4Var, f1Var, 6));
        org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
        v2Var.N = f4Var;
        v2Var.show();
        v2Var.v0(f11);
        v2Var.O(f11);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        HashMap hashMap = new HashMap();
        int i7 = org.telegram.ui.ActionBar.k6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(i7)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(i7)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.k6.v0(i7), hashMap);
        alertDialog$Builder.n(i7, null);
        u1Var.W = true;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
        u1Var.T = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.u1 F(Activity activity, long j3, final long j10, int i7, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        char c10;
        CharSequence[] charSequenceArr;
        final long j11 = j3;
        final int i12 = i7;
        final SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).d7;
        final int[] iArr = new int[1];
        if (j11 != 0) {
            i11 = 0;
            int i13 = sharedPreferences.getInt("priority_" + j11, 3);
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
            charSequenceArr = new String[]{org.telegram.messenger.hd.M0(2131747879, null), org.telegram.messenger.hd.M0(2131747881, null), org.telegram.messenger.hd.M0(2131747880, null), org.telegram.messenger.hd.M0(2131747882, null), org.telegram.messenger.hd.M0(2131747878, null)};
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
                    c10 = 2;
                    iArr[0] = 2;
                } else {
                    c10 = 2;
                    iArr[0] = 3;
                }
                CharSequence[] charSequenceArr2 = new String[4];
                charSequenceArr2[0] = org.telegram.messenger.hd.M0(2131747881, null);
                charSequenceArr2[1] = org.telegram.messenger.hd.M0(2131747880, null);
                charSequenceArr2[c10] = org.telegram.messenger.hd.M0(2131747882, null);
                charSequenceArr2[3] = org.telegram.messenger.hd.M0(2131747878, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.hd.M0(2131747881, null);
            charSequenceArr22[1] = org.telegram.messenger.hd.M0(2131747880, null);
            charSequenceArr22[c10] = org.telegram.messenger.hd.M0(2131747882, null);
            charSequenceArr22[3] = org.telegram.messenger.hd.M0(2131747878, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, i10);
        int i15 = i11;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, activity, f6Var);
        int i16 = i15;
        while (i16 < charSequenceArr.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), i15, org.telegram.messenger.g0.L(4.0f), i15);
            j6Var.setTag(Integer.valueOf(i16));
            a(j6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, f6Var);
            j6Var.b(charSequenceArr[i16], iArr[i15] == i16 ? 1 : i15);
            e10.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.z2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i17 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).d7.edit();
                    long j12 = j11;
                    if (j12 != 0) {
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
                        edit.putInt("priority_" + j12, i17);
                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).l(j12, j10);
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
                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).m(i21);
                    }
                    edit.commit();
                    alertDialog$Builder.a.L0.run();
                    runnable.run();
                }
            });
            i16++;
            j11 = j3;
            i12 = i7;
            i15 = i15;
        }
        String M0 = org.telegram.messenger.hd.M0(2131747905, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static void G(int i7, Activity activity, long j3, TLRPC.Photo photo, di.b bVar) {
        if (activity != null) {
            ai.v0 v0Var = new ai.v0(i7, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) activity, (org.telegram.ui.ActionBar.f6) bVar, true);
            v2Var.N();
            v2Var.O = org.telegram.messenger.hd.M0(2131746213, null);
            v2Var.P = true;
            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131746222, null), org.telegram.messenger.hd.M0(2131746228, null), org.telegram.messenger.hd.M0(2131746221, null), org.telegram.messenger.hd.M0(2131746230, null), org.telegram.messenger.hd.M0(2131746227, null), org.telegram.messenger.hd.M0(2131746225, null), org.telegram.messenger.hd.M0(2131746224, null), org.telegram.messenger.hd.M0(2131746226, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            t2 t2Var = new t2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, v0Var, 0);
            v2Var.L = charSequenceArr;
            v2Var.M = iArr;
            v2Var.K = t2Var;
            v2Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [org.telegram.ui.m6] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v23, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v24, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.telegram.ui.m6] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static h9.f1 H(final Context context, final long j3, long j10, int i7, boolean z9, final t4 t4Var, Runnable runnable, s4 s4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        hb0 hb0Var;
        long j11;
        boolean[] zArr;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.r0 r0Var;
        Calendar calendar;
        char c10;
        int i11;
        int[] iArr;
        TextView textView;
        String[] strArr;
        int[] iArr2;
        String[] strArr2;
        final s3 s3Var;
        ch0 ch0Var;
        int i12;
        boolean[] zArr2;
        int i13;
        TextView textView2;
        TextView textView3;
        org.telegram.ui.ActionBar.v2 v2Var;
        int i14;
        TLRPC.User a22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i7};
        long e10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).e();
        final h9.f1 f1Var = new h9.f1(context, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
        hb0 hb0Var2 = new hb0(context, f6Var);
        int i15 = s4Var.a;
        int i16 = s4Var.c;
        int i17 = s4Var.b;
        hb0Var2.setTextColor(i15);
        hb0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var2.setItemCount(5);
        final s3 s3Var2 = new s3(context, f6Var);
        s3Var2.setWrapSelectorWheel(true);
        s3Var2.setAllItemsCount(24);
        s3Var2.setItemCount(5);
        s3Var2.setTextColor(i15);
        s3Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final t3 t3Var = new t3(context, f6Var);
        t3Var.setWrapSelectorWheel(true);
        t3Var.setAllItemsCount(60);
        t3Var.setItemCount(5);
        t3Var.setTextColor(i15);
        t3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        p3 p3Var = new p3(context, hb0Var2, s3Var2, t3Var, 1);
        p3Var.setClipToPadding(false);
        p3Var.setClipChildren(false);
        p3Var.setOrientation(1);
        frameLayout2.addView(p3Var, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        p3Var.addView(frameLayout4, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView4 = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView4.setText((CharSequence) null);
            i10 = 0;
        } else if (j3 == e10) {
            i10 = 0;
            textView4.setText(org.telegram.messenger.hd.M0(2131745515, null));
        } else {
            i10 = 0;
            textView4.setText(org.telegram.messenger.hd.M0(2131745860, null));
        }
        textView4.setTextColor(i15);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        frameLayout4.addView(textView4, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView4.setOnTouchListener(new ei.b(10));
        boolean[] zArr3 = new boolean[1];
        zArr3[i10] = true;
        if (!org.telegram.messenger.m5.E(j3) || j3 == e10 || (a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(Long.valueOf(j3))) == null || a22.bot || (userStatus = a22.status) == null || userStatus.expires <= 0) {
            r82 = p3Var;
            context2 = context;
            viewGroup = frameLayout2;
            frameLayout = frameLayout3;
            hb0Var = hb0Var2;
            j11 = e10;
            zArr = zArr3;
            viewGroup2 = frameLayout4;
            r0Var = null;
        } else {
            String j12 = org.telegram.messenger.t10.j(a22, true);
            if (j12.length() > 10) {
                j12 = j12.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout3;
            r82 = p3Var;
            hb0Var = hb0Var2;
            j11 = e10;
            viewGroup2 = frameLayout4;
            zArr = zArr3;
            viewGroup = frameLayout2;
            r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, s4Var.a, false, f6Var);
            context2 = context;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(R.drawable.ic_ab_other);
            r0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(i16, 1, -1));
            viewGroup2.addView(r0Var, c8.ha.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            r0Var.f(1, org.telegram.messenger.hd.a0(null, null, 2131745851, j12));
            r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        }
        if (r0Var != null) {
            r0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(20, r0Var, s4Var));
            r0Var.setDelegate(new a3.h(t4Var, zArr, f1Var, 18));
        }
        ch0 ch0Var2 = new ch0(context2);
        final zg0 zg0Var = new zg0(R.raw.notify_toggle, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        zg0Var.J(true);
        zg0Var.h = true;
        zg0Var.start();
        zg0Var.M(40);
        zg0Var.P(40);
        ch0Var2.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var2.setAnimation(zg0Var);
        ch0Var2.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        ch0Var2.setBackground(org.telegram.ui.ActionBar.k6.h0(i16, 1, -1));
        viewGroup2.addView(ch0Var2, c8.ha.d(40, 40.0f, 53, 0.0f, 8.0f, (r0Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.r0 r0Var2 = r0Var;
        final bi.md mdVar = new bi.md(context2, 14);
        linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
        hb0Var.setMinValue(0);
        hb0Var.setMaxValue(365);
        hb0Var.setWrapSelectorWheel(false);
        hb0Var.setFormatter(new org.telegram.ui.zq(7));
        final hb0 hb0Var3 = hb0Var;
        ViewGroup viewGroup3 = viewGroup;
        final boolean[] zArr4 = zArr;
        final long j13 = j11;
        fb0 fb0Var = new fb0() { // from class: org.telegram.ui.Components.l1
            @Override // org.telegram.ui.Components.fb0
            public final void n(hb0 hb0Var4, int i18) {
                v4.g(bi.md.this, null, 0L, 0L, j13 == j3 ? 1 : 0, hb0Var3, s3Var2, t3Var);
            }
        };
        hb0Var3.setOnValueChangedListener(fb0Var);
        s3Var2.setMinValue(0);
        s3Var2.setMaxValue(23);
        linearLayout.addView(s3Var2, c8.ha.l(0.2f, 0, org.telegram.messenger.qs.t4));
        s3Var2.setFormatter(new org.telegram.ui.zq(10));
        s3Var2.setOnValueChangedListener(fb0Var);
        t3Var.setMinValue(0);
        t3Var.setMaxValue(59);
        t3Var.setValue(0);
        t3Var.setFormatter(new org.telegram.ui.zq(12));
        linearLayout.addView(t3Var, c8.ha.l(0.3f, 0, org.telegram.messenger.qs.t4));
        t3Var.setOnValueChangedListener(fb0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            calendar = calendar2;
        } else {
            long j14 = 1000 * j10;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                t3Var.setValue(calendar.get(12));
                s3Var2.setValue(calendar.get(11));
                hb0Var3.setValue(timeInMillis);
            }
        }
        boolean[] zArr5 = {true};
        g(mdVar, null, 0L, 0L, j13 == j3 ? 1 : 0, hb0Var3, s3Var2, t3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i11 = 8;
            iArr = new int[]{0, 60, org.telegram.messenger.qs.X4, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c10 = '\t';
            i11 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        int[] iArr4 = iArr;
        int i18 = i11;
        if (isTestBackend) {
            strArr = new String[10];
            textView = null;
            strArr[0] = org.telegram.messenger.hd.M0(2131748499, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.hd.M0(2131748501, null);
            strArr[4] = org.telegram.messenger.hd.M0(2131748498, null);
            strArr[5] = org.telegram.messenger.hd.M0(2131748502, null);
            strArr[6] = org.telegram.messenger.hd.M0(2131748500, null);
            strArr[7] = org.telegram.messenger.hd.M0(2131748504, null);
            strArr[i18] = org.telegram.messenger.hd.M0(2131748503, null);
            strArr[c10] = org.telegram.messenger.hd.M0(2131748497, null);
        } else {
            textView = null;
            strArr = new String[i18];
            strArr[0] = org.telegram.messenger.hd.M0(2131748499, null);
            strArr[1] = org.telegram.messenger.hd.M0(2131748501, null);
            strArr[2] = org.telegram.messenger.hd.M0(2131748498, null);
            strArr[3] = org.telegram.messenger.hd.M0(2131748502, null);
            strArr[4] = org.telegram.messenger.hd.M0(2131748500, null);
            strArr[5] = org.telegram.messenger.hd.M0(2131748504, null);
            strArr[6] = org.telegram.messenger.hd.M0(2131748503, null);
            strArr[7] = org.telegram.messenger.hd.M0(2131748497, null);
        }
        if (z9) {
            iArr2 = iArr4;
            strArr2 = strArr;
            s3Var = s3Var2;
            ch0Var = ch0Var2;
            i12 = i17;
            zArr2 = zArr5;
            i13 = 0;
            textView2 = textView;
            textView3 = textView2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            int w10 = org.telegram.ui.ActionBar.k6.w(i17, org.telegram.ui.ActionBar.k6.r1(0.075f, i15));
            String[] strArr3 = strArr;
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i15);
            textView = new TextView(context2);
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(i15);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.k6.w(w10, r12);
            textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w10, w11, w11));
            textView.setGravity(17);
            s3Var = s3Var2;
            ch0Var = ch0Var2;
            i12 = i17;
            zArr2 = zArr5;
            i13 = 0;
            strArr2 = strArr3;
            ?? m6Var = new org.telegram.ui.m6(iArr4, iArr3, strArr2, textView, 16);
            iArr2 = iArr4;
            m6Var.run();
            frameLayout5.addView(textView, c8.ha.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout5, c8.ha.o(-1, -2));
            textView3 = m6Var;
            textView2 = frameLayout5;
        }
        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), i13, org.telegram.messenger.g0.L(34.0f), i13);
        mdVar.setGravity(17);
        mdVar.setTextColor(s4Var.g);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        int i19 = s4Var.h;
        float[] fArr = new float[1];
        fArr[i13] = 24.0f;
        mdVar.setBackground(org.telegram.ui.ActionBar.z5.e(i19, fArr));
        r82.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        final boolean[] zArr6 = zArr2;
        mdVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr6[0] = false;
                int i20 = j13 == j3 ? 1 : 0;
                hb0 hb0Var4 = hb0Var3;
                s3 s3Var3 = s3Var;
                t3 t3Var2 = t3Var;
                boolean g10 = v4.g(null, null, 0L, 0L, i20, hb0Var4, s3Var3, t3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, hb0Var4.getValue());
                calendar4.set(11, s3Var3.getValue());
                calendar4.set(12, t3Var2.getValue());
                if (g10) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                t4Var.L((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], zArr4[0]);
                ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
            }
        });
        org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) f1Var.b;
        v2Var2.N = viewGroup3;
        v2Var2.show();
        v2Var2.setOnDismissListener(new z1(runnable, zArr6));
        v2Var2.v0(i12);
        v2Var2.O(i12);
        if (textView != null) {
            i14 = 1;
            String[] strArr4 = strArr2;
            v2Var = v2Var2;
            textView.setOnClickListener(new c3(frameLayout, f6Var, v2Var, (FrameLayout) textView2, iArr2, strArr4, iArr3, (org.telegram.ui.m6) textView3));
        } else {
            v2Var = v2Var2;
            i14 = 1;
        }
        final fi.m3[] m3VarArr = new fi.m3[i14];
        final org.telegram.ui.ActionBar.v2 v2Var3 = v2Var;
        ch0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String M0;
                boolean[] zArr7 = zArr4;
                boolean z10 = zArr7[0];
                zArr7[0] = !z10;
                zg0 zg0Var2 = zg0Var;
                if (z10) {
                    if (zg0Var2.a0 < 40) {
                        zg0Var2.M(40);
                    }
                    zg0Var2.P(80);
                    zg0Var2.start();
                } else {
                    if (zg0Var2.a0 >= 40) {
                        zg0Var2.M(0);
                    }
                    zg0Var2.P(40);
                    zg0Var2.start();
                }
                fi.m3[] m3VarArr2 = m3VarArr;
                fi.m3 m3Var = m3VarArr2[0];
                if (m3Var != null) {
                    m3Var.f(true);
                    m3VarArr2[0] = null;
                }
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0);
                long j15 = j3;
                TLRPC.User a23 = s12.a2(Long.valueOf(j15));
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(-j15));
                fi.m3 m3Var2 = new fi.m3(context, 3);
                m3VarArr2[0] = m3Var2;
                m3Var2.t();
                m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                m3Var2.s(20.0f);
                float L2 = org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(4.0f);
                int r13 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                m3Var2.i0 = L2;
                m3Var2.j0 = L3;
                m3Var2.k0 = r13;
                m3Var2.F.setShadowLayer(L2, 0.0f, L3, r13);
                if (org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.hd.M0(zArr7[0] ? 2131745855 : 2131745859, null);
                } else if (M02 != null || a23 == null) {
                    M0 = org.telegram.messenger.hd.M0(zArr7[0] ? 2131745853 : 2131745857, null);
                } else if (j15 == j13) {
                    M0 = org.telegram.messenger.hd.M0(zArr7[0] ? 2131745852 : 2131745856, null);
                } else {
                    M0 = org.telegram.messenger.hd.a0(null, null, zArr7[0] ? 2131745854 : 2131745858, org.telegram.messenger.t10.k(a23));
                }
                m3Var2.u(M0);
                m3Var2.d = 5000L;
                m3Var2.o(1.0f, -((r0Var2 != null ? 42 : -8) + 20));
                m3Var2.q0 = new b3(m3Var2, 0);
                org.telegram.ui.ActionBar.v2 v2Var4 = v2Var3;
                v2Var4.b.setClipToPadding(false);
                v2Var4.b.setClipChildren(false);
                v2Var4.b.addView(m3Var2, c8.ha.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                m3Var2.w();
            }
        });
        return f1Var;
    }

    public static void I(Context context, long j3, t4 t4Var) {
        H(context, j3, -1L, 0, false, t4Var, null, new s4(null), null);
    }

    public static void J(Context context, long j3, t4 t4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        H(context, j3, -1L, 0, false, t4Var, null, new s4(f6Var), f6Var);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        if (str == null) {
            str = org.telegram.messenger.hd.M0(R.string.AppName, null);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(str3, new v0(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.u1 M(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = charSequence;
        alertDialog$Builder.k(str2, new v0(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.g1 N(org.telegram.ui.ActionBar.f2 f2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (f2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        g1Var.e = true;
        g1Var.c = org.telegram.messenger.qs.x3;
        g1Var.setOutsideTouchable(true);
        g1Var.setClippingEnabled(true);
        g1Var.setAnimationStyle(R.style.PopupContextAnimation);
        g1Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        g1Var.setInputMethodMode(2);
        g1Var.getContentView().setFocusableInTouchMode(true);
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
        g1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        g1Var.b();
        return g1Var;
    }

    public static void O(Context context, org.telegram.ui.ActionBar.f2 f2Var, String str, String str2, String str3, String str4, int i7, String str5, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.wr wrVar) {
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = str == null ? org.telegram.messenger.hd.M0(R.string.AppName, null) : str;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = str2;
        u4 u4Var = new u4(context);
        u4Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(u4Var, i10, f6Var);
        org.telegram.ui.ActionBar.r6.E(u4Var, org.telegram.ui.ActionBar.k6.Li, f6Var);
        u4Var.setHint(str3);
        u4Var.setFocusable(true);
        u4Var.setInputType(147457);
        u4Var.setImeOptions(6);
        u4Var.setMaxLines(10);
        u4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        u4Var.setCursorWidth(1.5f);
        u4Var.z(org.telegram.ui.ActionBar.k6.q6, f6Var);
        if (str4 != null) {
            u4Var.setText(str4);
        }
        u4Var.setOnEditorActionListener(new kg.p(u4Var, i7, wrVar, u1VarArr, currentFocus, 1));
        u4Var.addTextChangedListener(new org.telegram.ui.Cells.j3(i7, u4Var));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i10);
        u4Var.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(u4Var, d02, L, null, f6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView(u4Var, c8.ha.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        u1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
        alertDialog$Builder.k(str5, new jg.a2(u4Var, i7, wrVar, 6));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.zq(19));
        u1VarArr[0] = u1Var;
        if (f2Var != null) {
            org.telegram.messenger.g0.Z2(W, f2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.j0 = false;
        u1Var2.setOnDismissListener(new hi.o0(u4Var, f2Var, W, 2));
        u1VarArr[0].setOnShowListener(new u0(1, u4Var));
        u1VarArr[0].show();
        u4Var.setSelection(u4Var.getText().length());
    }

    public static void P(Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.wr wrVar) {
        O(context, f2Var, org.telegram.messenger.hd.M0(2131744800, null), org.telegram.messenger.hd.M0(2131744807, null), org.telegram.messenger.hd.M0(2131744781, null), null, 12, org.telegram.messenger.hd.M0(2131751753, null), f6Var, wrVar);
    }

    public static h9.f1 Q(Context context, long j3, final t4 t4Var, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        int i10;
        int i11;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        if (context == null) {
            return null;
        }
        final h9.f1 f1Var = new h9.f1(context, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
        final hb0 hb0Var = new hb0(context, f6Var);
        hb0Var.setTextColor(x02);
        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var.setItemCount(5);
        final n4 n4Var = new n4(context, f6Var);
        n4Var.setWrapSelectorWheel(true);
        n4Var.setAllItemsCount(24);
        n4Var.setItemCount(5);
        n4Var.setTextColor(x02);
        n4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final o4 o4Var = new o4(context, f6Var);
        o4Var.setWrapSelectorWheel(true);
        o4Var.setAllItemsCount(60);
        o4Var.setItemCount(5);
        o4Var.setTextColor(x02);
        o4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        p3 p3Var = new p3(context, hb0Var, n4Var, o4Var, 7);
        p3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        p3Var.addView(f10, c8.ha.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(i7 == 1 ? 2131744375 : 2131747094, null));
        textView.setTextColor(x02);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        f10.addView(textView, c8.ha.t(-2, -2, 51, 0, 12, 0, 0));
        int i13 = 10;
        textView.setOnTouchListener(new ei.b(i13));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, f6Var);
        jg.g.v(textView2, 1, 14.0f, null, 2131747093);
        f10.addView(textView2, c8.ha.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new ei.b(i13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i14 = calendar.get(1);
        h9.f1 f1Var2 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).x7.j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long M1 = f1Var2.M1(timeUnit) * 2;
        final long M12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).x7.k.M1(timeUnit) - 86400;
        final bi.md mdVar = new bi.md(context, 21);
        linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
        hb0Var.setMinValue(0);
        hb0Var.setMaxValue(365);
        hb0Var.setWrapSelectorWheel(false);
        hb0Var.setFormatter(new l2.u(i14, 4));
        final int i15 = i7 == 1 ? 5 : 3;
        fb0 fb0Var = new fb0() { // from class: org.telegram.ui.Components.u1
            @Override // org.telegram.ui.Components.fb0
            public final void n(hb0 hb0Var2, int i16) {
                v4.g(bi.md.this, null, M1, M12, i15, hb0Var, n4Var, o4Var);
            }
        };
        hb0Var.setOnValueChangedListener(fb0Var);
        n4Var.setMinValue(0);
        n4Var.setMaxValue(23);
        linearLayout.addView(n4Var, c8.ha.l(0.2f, 0, org.telegram.messenger.qs.t4));
        n4Var.setFormatter(new org.telegram.ui.zq(14));
        n4Var.setOnValueChangedListener(fb0Var);
        o4Var.setMinValue(0);
        o4Var.setMaxValue(59);
        o4Var.setValue(0);
        o4Var.setFormatter(new org.telegram.ui.zq(15));
        linearLayout.addView(o4Var, c8.ha.l(0.3f, 0, org.telegram.messenger.qs.t4));
        o4Var.setOnValueChangedListener(fb0Var);
        if (j3 <= 0 || j3 == 2147483646) {
            i10 = x03;
            i11 = i12;
        } else {
            long j10 = 1000 * j3;
            i10 = x03;
            i11 = i12;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                o4Var.setValue(calendar.get(12));
                n4Var.setValue(calendar.get(11));
                hb0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(mdVar, null, M1, M12, i15, hb0Var, n4Var, o4Var);
        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(x04);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        mdVar.setBackground(org.telegram.ui.ActionBar.z5.e(x05, 8.0f));
        p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i15;
        mdVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j11 = M1;
                long j12 = M12;
                int i17 = i16;
                hb0 hb0Var2 = hb0Var;
                n4 n4Var2 = n4Var;
                o4 o4Var2 = o4Var;
                boolean g10 = v4.g(null, null, j11, j12, i17, hb0Var2, n4Var2, o4Var2);
                long epochMilli = LocalDate.now().plusDays(hb0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, n4Var2.getValue());
                calendar2.set(12, o4Var2.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                t4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
            }
        });
        c8.ka.b(mdVar, 0.02f, 1.2f);
        bi.md mdVar2 = new bi.md(context, 22);
        mdVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mdVar2.setGravity(17);
        mdVar2.setText(org.telegram.messenger.hd.M0(i7 == 1 ? 2131748470 : 2131747091, null));
        mdVar2.setTextColor(x05);
        mdVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i17 = org.telegram.ui.ActionBar.k6.d6;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        mdVar2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(mdVar2, k02, N, N2, null);
        p3Var.addView(mdVar2, c8.ha.t(-1, 48, 83, 16, 0, 16, 16));
        mdVar2.setOnClickListener(new ah.g(zArr, t4Var, f1Var, 16));
        c8.ka.b(mdVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
        v2Var.N = p3Var;
        v2Var.show();
        v2Var.setOnDismissListener(new fi.d1(zArr));
        v2Var.v0(i10);
        v2Var.O(i10);
        return f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.u1 R(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        if (f2Var == null || f2Var.getParentActivity() == null) {
            return null;
        }
        w70 w70Var = new w70(f2Var.getParentActivity(), f2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.hd.M0(2131753985, null).replace("\n", "<br>")));
        boolean z9 = false;
        Object[] objArr = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new i4(uRLSpan.getURL(), f2Var), spanStart, spanEnd, 0);
        }
        w70Var.setText(spannableString);
        w70Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.k5, f6Var);
        org.telegram.ui.ActionBar.r6.D(w70Var, org.telegram.ui.ActionBar.k6.l5, f6Var);
        w70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        w70Var.setMovementMethod(new org.telegram.messenger.c0(z9));
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.j5, f6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var);
        alertDialog$Builder.o(w70Var);
        String M0 = org.telegram.messenger.hd.M0(2131753986, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753984, null), new x2(objArr == true ? 1 : 0, f2Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131748586, null);
        hb0 hb0Var = new hb0(context, null);
        hb0Var.setMinValue(0);
        hb0Var.setMaxValue(20);
        int i7 = encryptedChat.ttl;
        if (i7 > 0 && i7 < 16) {
            hb0Var.setValue(i7);
        } else if (i7 == 30) {
            hb0Var.setValue(16);
        } else if (i7 == 60) {
            hb0Var.setValue(17);
        } else if (i7 == 3600) {
            hb0Var.setValue(18);
        } else if (i7 == 86400) {
            hb0Var.setValue(19);
        } else if (i7 == 604800) {
            hb0Var.setValue(20);
        } else if (i7 == 0) {
            hb0Var.setValue(0);
        }
        hb0Var.setFormatter(new org.telegram.ui.zq(29));
        alertDialog$Builder.o(hb0Var);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751355, null), new f2(1, encryptedChat, hb0Var));
        return alertDialog$Builder;
    }

    public static void T(org.telegram.ui.ActionBar.f2 f2Var, int i7, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        int i11;
        String sb2;
        if (f2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = f2Var.getParentActivity();
        u4 u4Var = new u4(parentActivity);
        String str = null;
        u4Var.setBackground(null);
        org.telegram.ui.ActionBar.r6.G(u4Var, org.telegram.ui.ActionBar.k6.u5, org.telegram.ui.ActionBar.k6.v5, org.telegram.ui.ActionBar.k6.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131748257, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        int i12 = 0;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751753, null), new k2(i12));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i7 != 0) {
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751115, null)));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131751116, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i13 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i13, null);
        linearLayout.addView(textView, c8.ha.o(-1, -2));
        u4Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(u4Var, i13, null);
        u4Var.setMaxLines(1);
        u4Var.setLines(1);
        u4Var.setInputType(16385);
        u4Var.setGravity(51);
        u4Var.setSingleLine(true);
        u4Var.setImeOptions(6);
        u4Var.z(org.telegram.ui.ActionBar.k6.G6, null);
        u4Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        u4Var.setCursorWidth(1.5f);
        u4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(u4Var, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
        u4Var.setOnEditorActionListener(new l2(i12));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        jg.g.t(9306112, hashMap, "Berry", 14598550, "Brandy");
        jg.g.t(8391495, hashMap, "Cherry", 16744272, "Coral");
        jg.g.t(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        jg.g.t(14725375, hashMap, "Mauve", 16761035, "Pink");
        jg.g.t(16711680, hashMap, "Red", 16711807, "Rose");
        jg.g.t(8406555, hashMap, "Russet", 16720896, "Scarlet");
        jg.g.t(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        jg.g.t(16760576, hashMap, "Amber", 15438707, "Apricot");
        jg.g.t(16508850, hashMap, "Banana", 10601738, "Citrus");
        jg.g.t(11560192, hashMap, "Ginger", 16766720, "Gold");
        jg.g.t(16640272, hashMap, "Lemon", 16753920, "Orange");
        jg.g.t(16770484, hashMap, "Peach", 16739155, "Persimmon");
        jg.g.t(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        jg.g.t(16763004, hashMap, "Topaz", 16776960, "Yellow");
        jg.g.t(3688720, hashMap, "Clover", 8628829, "Cucumber");
        jg.g.t(5294200, hashMap, "Emerald", 11907932, "Olive");
        jg.g.t(65280, hashMap, "Green", 43115, "Jade");
        jg.g.t(2730887, hashMap, "Jungle", 12582656, "Lime");
        jg.g.t(776785, hashMap, "Malachite", 10026904, "Mint");
        jg.g.t(11394989, hashMap, "Moss", 3234721, "Azure");
        jg.g.t(org.telegram.messenger.qs.e4, hashMap, "Blue", 18347, "Cobalt");
        jg.g.t(5204422, hashMap, "Indigo", 96647, "Lagoon");
        jg.g.t(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        jg.g.t(128, hashMap, "Navy", 3101086, "Sapphire");
        jg.g.t(7788522, hashMap, "Sky", 32896, "Teal");
        jg.g.t(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        jg.g.t(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        jg.g.t(13148872, hashMap, "Lilac", 11894492, "Lavender");
        jg.g.t(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        jg.g.t(6684825, hashMap, "Purple", 14204888, "Thistle");
        jg.g.t(14315734, hashMap, "Orchid", 2361920, "Violet");
        jg.g.t(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        jg.g.t(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        jg.g.t(7365973, hashMap, "Coffee", 7956873, "Rum");
        jg.g.t(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        jg.g.t(12759680, hashMap, "Sand", 8924439, "Sienna");
        jg.g.t(7864585, hashMap, "Maple", 15787660, "Khaki");
        jg.g.t(12088115, hashMap, "Copper", 12144200, "Chestnut");
        jg.g.t(15653316, hashMap, "Almond", 16776656, "Cream");
        jg.g.t(12186367, hashMap, "Diamond", 11109127, "Honey");
        jg.g.t(16777200, hashMap, "Ivory", 15392968, "Pearl");
        jg.g.t(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        jg.g.t(16777215, hashMap, "White", 8421504, "Gray");
        jg.g.t(0, hashMap, "Black", 15266260, "Chrome");
        jg.g.t(3556687, hashMap, "Charcoal", 789277, "Ebony");
        jg.g.t(12632256, hashMap, "Silver", 16119285, "Smoke");
        jg.g.t(2499381, hashMap, "Steel", 5220413, "Apple");
        jg.g.t(8434628, hashMap, "Glacier", 16693933, "Melon");
        jg.g.t(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.h6 k10 = h6Var == null ? org.telegram.ui.ActionBar.k6.D0().k(false) : h6Var;
        if (k10 == null || (i10 = k10.c) == 0) {
            i10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.k6.s0())[0];
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        Iterator it = hashMap.entrySet().iterator();
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (true) {
            i11 = 2;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i15 = (red + red2) / 2;
            int i16 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i17 = (green2 * 4 * green2) + ((((i15 + 512) * i16) * i16) >> 8) + ((((767 - i15) * blue2) * blue2) >> 8);
            if (i17 < i14) {
                str = (String) entry.getValue();
                i14 = i17;
            }
        }
        SecureRandom secureRandom = Utilities.b;
        if (secureRandom.nextInt() % 2 == 0) {
            sb2 = org.telegram.ui.Cells.f1.n((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder j3 = rf.b.j(str, " ");
            j3.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = j3.toString();
        }
        u4Var.setText(sb2);
        u4Var.setSelection(u4Var.length());
        u0 u0Var = new u0(i11, u4Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.setOnShowListener(u0Var);
        f2Var.showDialog(u1Var);
        u4Var.requestFocus();
        u1Var.d(-1).setOnClickListener(new di.d0(f2Var, u4Var, h6Var, j6Var, u1Var, 9));
    }

    public static void U(Activity activity, String str, int i7, int i10, int i11, org.telegram.messenger.c20 c20Var) {
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
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(activity, false, 1, null);
        h.v0 = false;
        o3 o3Var = new o3(activity, null);
        p3 p3Var = new p3(activity, o3Var);
        p3Var.setOrientation(0);
        p3Var.setWeightSum(1.0f);
        o3Var.setAllItemsCount(24);
        o3Var.setItemCount(5);
        o3Var.setTextColor(x02);
        o3Var.setGravity(5);
        o3Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        q3 q3Var = new q3(activity, null);
        q3Var.setWrapSelectorWheel(true);
        q3Var.setAllItemsCount(60);
        q3Var.setItemCount(5);
        q3Var.setTextColor(x02);
        q3Var.setGravity(3);
        q3Var.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final bi.u4 u4Var = new bi.u4(i10, i11, o3Var, q3Var, i7, p3Var);
        p3Var.addView(o3Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
        o3Var.setFormatter(new org.telegram.ui.zq(27));
        o3Var.setOnValueChangedListener(new fb0() { // from class: org.telegram.ui.Components.h2
            @Override // org.telegram.ui.Components.fb0
            public final void n(hb0 hb0Var, int i14) {
                switch (i12) {
                    case 0:
                        u4Var.a(Boolean.TRUE);
                        break;
                    default:
                        u4Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        p3Var.addView(q3Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
        q3Var.setFormatter(new org.telegram.ui.zq(28));
        q3Var.setOnValueChangedListener(new fb0() { // from class: org.telegram.ui.Components.h2
            @Override // org.telegram.ui.Components.fb0
            public final void n(hb0 hb0Var, int i14) {
                switch (i13) {
                    case 0:
                        u4Var.a(Boolean.TRUE);
                        break;
                    default:
                        u4Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        u4Var.a(Boolean.FALSE);
        r3 r3Var = new r3(activity, o3Var, q3Var);
        r3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        r3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        r3Var.addView(p3Var, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        fi.d dVar = new fi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.hd.M0(2131745673, null), false, true);
        dVar.setOnClickListener(new i2(r1, i12));
        r3Var.addView(dVar, c8.ha.t(-1, 48, 0, 16, 12, 16, 12));
        h.N = r3Var;
        h.show();
        h.setOnDismissListener(new hi.o0(c20Var, o3Var, q3Var, 3));
        h.v0(x03);
        h.O(x03);
        org.telegram.ui.ActionBar.v2[] v2VarArr = {h};
    }

    public static org.telegram.ui.ActionBar.u1 V(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).d7;
        boolean z9 = true;
        final int[] iArr = new int[1];
        if (j3 != 0) {
            int i7 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i7;
            if (i7 == 3) {
                iArr[0] = 2;
            } else if (i7 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131745367, null), org.telegram.messenger.hd.M0(2131748722, null), org.telegram.messenger.hd.M0(2131743613, null)};
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
            strArr = new String[]{org.telegram.messenger.hd.M0(2131743613, null), org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131745367, null), org.telegram.messenger.hd.M0(2131748722, null), org.telegram.messenger.hd.M0(2131747820, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i11));
            a(j6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, f6Var);
            j6Var.b(strArr2[i11], iArr[0] == i11 ? z9 : false);
            e10.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.v2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).d7.edit();
                    long j11 = j3;
                    String str3 = str2;
                    if (j11 != 0) {
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
                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).l(j11, j10);
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
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).m(2);
                        } else if (str3.equals("vibrate_group")) {
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).m(0);
                        } else if (str3.equals("vibrate_react")) {
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).m(4);
                        } else {
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.a.L0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
            z9 = true;
        }
        String M0 = org.telegram.messenger.hd.M0(2131743615, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.u1 W(Context context, org.telegram.ui.ActionBar.f6 f6Var, String[] strArr, int i7, String str, String str2, q0.a aVar) {
        boolean z9;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        if (z9) {
            str = str2;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = X2;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(z9 ? 2131747299 : 2131752909, null), new a3.g(z9, context, atomicBoolean, aVar, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752904, null), new ni.c(28, atomicBoolean, aVar));
        u1Var.setOnDismissListener(new bi.u3(8, atomicBoolean, aVar));
        return u1Var;
    }

    public static void X(int i7, int i10, long j3, org.telegram.messenger.c20 c20Var) {
        Y(i7, j3, i10, c20Var, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Y(final int i7, final long j3, int i10, org.telegram.messenger.c20 c20Var, long j10) {
        org.telegram.ui.ActionBar.f6 bVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.Chat chat;
        char c10;
        Activity activity;
        long N1 = org.telegram.messenger.qp.s1(i7).N1(j3);
        if (N1 <= 0 && j3 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(i7).J2(j3));
        }
        long j11 = i10 * N1;
        bi.ea.y(i7, false).P.put(Long.valueOf(j3), Integer.valueOf(i10));
        if (j11 <= 0 || j10 == j11) {
            c20Var.a(Long.valueOf(j11));
            return false;
        }
        final long j12 = N1;
        final e1 e1Var = new e1(i7, j11, j3, c20Var, j12, 1);
        if (j12 <= org.telegram.messenger.qp.s1(i7).e7.getLong(rf.b.h(j3, "ask_paid_message_", "_price"), 0L)) {
            e1Var.run();
            return true;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) {
            bVar = new di.b();
        } else {
            if (T == null) {
                f6Var = null;
                String s5 = org.telegram.messenger.m5.s(i7, j3);
                if (!org.telegram.messenger.t3.o0(i7, j3)) {
                    s5 = qg.d.h(i7, j3);
                } else if (T instanceof org.telegram.ui.an) {
                    org.telegram.ui.an anVar = (org.telegram.ui.an) T;
                    if (anVar.u4 && anVar.a() == j3 && (chat = anVar.t4) != null) {
                        c10 = 0;
                        activity = u02;
                        s5 = org.telegram.messenger.m5.s(i7, -chat.id);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i11 = (int) j12;
                        Object[] objArr = new Object[1];
                        objArr[c10] = s5;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessage1", i11, ',', objArr)));
                        spannableStringBuilder.append((CharSequence) " ");
                        if (i10 == 1) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessage2One", i11)));
                        } else {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessage2Many1", (int) j11)));
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessage2Many2", i10)));
                        }
                        f0(activity, org.telegram.messenger.hd.M0(2131748553, null), spannableStringBuilder, org.telegram.messenger.hd.M0(2131748566, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.k1
                            @Override // org.telegram.messenger.c20
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i12 = i7;
                                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i12).e7.edit();
                                    long j13 = j3;
                                    edit.putLong(rf.b.h(j13, "ask_paid_message_", "_price"), j12).apply();
                                    bi.ea.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                                }
                                org.telegram.messenger.g0.h3(e1Var);
                            }
                        }, f6Var, true);
                        return true;
                    }
                }
                c10 = 0;
                activity = u02;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i112 = (int) j12;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = s5;
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessage1", i112, ',', objArr2)));
                spannableStringBuilder2.append((CharSequence) " ");
                if (i10 == 1) {
                }
                f0(activity, org.telegram.messenger.hd.M0(2131748553, null), spannableStringBuilder2, org.telegram.messenger.hd.M0(2131748566, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.k1
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i12 = i7;
                            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i12).e7.edit();
                            long j13 = j3;
                            edit.putLong(rf.b.h(j13, "ask_paid_message_", "_price"), j12).apply();
                            bi.ea.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                        }
                        org.telegram.messenger.g0.h3(e1Var);
                    }
                }, f6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        f6Var = bVar;
        String s52 = org.telegram.messenger.m5.s(i7, j3);
        if (!org.telegram.messenger.t3.o0(i7, j3)) {
        }
        c10 = 0;
        activity = u02;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
        int i1122 = (int) j12;
        Object[] objArr22 = new Object[1];
        objArr22[c10] = s52;
        spannableStringBuilder22.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessage1", i1122, ',', objArr22)));
        spannableStringBuilder22.append((CharSequence) " ");
        if (i10 == 1) {
        }
        f0(activity, org.telegram.messenger.hd.M0(2131748553, null), spannableStringBuilder22, org.telegram.messenger.hd.M0(2131748566, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.k1
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i12 = i7;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i12).e7.edit();
                    long j13 = j3;
                    edit.putLong(rf.b.h(j13, "ask_paid_message_", "_price"), j12).apply();
                    bi.ea.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                }
                org.telegram.messenger.g0.h3(e1Var);
            }
        }, f6Var, true);
        return true;
    }

    public static boolean Z(int i7, ArrayList arrayList, int i10, org.telegram.messenger.c20 c20Var) {
        org.telegram.ui.ActionBar.f6 bVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z9 = false;
        if (arrayList.isEmpty()) {
            c20Var.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        long j3 = 0;
        boolean z10 = true;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Long l10 = (Long) obj;
            long j10 = j3;
            long longValue = l10.longValue();
            long N1 = org.telegram.messenger.qp.s1(i7).N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(i7).J2(longValue));
            }
            hashMap.put(l10, Long.valueOf(N1));
            long j11 = j10 + N1;
            boolean z11 = z9;
            bi.ea.y(i7, z9).P.put(l10, Integer.valueOf(i10));
            if (N1 > 0) {
                i11++;
            }
            if (N1 > 0 && z10 && org.telegram.messenger.qp.s1(i7).e7.getLong(rf.b.h(longValue, "ask_paid_message_", "_price"), 0L) < N1) {
                z10 = z11;
            }
            j3 = j11;
            z9 = z11;
        }
        boolean z12 = z9;
        long max = Math.max(1, i10) * j3;
        if (z10 || max <= 0) {
            c20Var.a(hashMap);
            return z12;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) {
            bVar = new di.b();
        } else {
            if (T == null) {
                f6Var = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                spannableStringBuilder.append((CharSequence) " ");
                Object[] objArr = new Object[1];
                objArr[z12 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                f0(u02, org.telegram.messenger.hd.M0(2131748553, null), spannableStringBuilder, org.telegram.messenger.hd.M0(2131748566, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.tp(i7, max, u02, arrayList, hashMap, c20Var, f6Var), f6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        f6Var = bVar;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
        spannableStringBuilder2.append((CharSequence) " ");
        Object[] objArr2 = new Object[1];
        objArr2[z12 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
        f0(u02, org.telegram.messenger.hd.M0(2131748553, null), spannableStringBuilder2, org.telegram.messenger.hd.M0(2131748566, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.tp(i7, max, u02, arrayList, hashMap, c20Var, f6Var), f6Var, true);
        return true;
    }

    public static void a(org.telegram.ui.Cells.j6 j6Var, int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
            View childAt = j6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.r6.P((RadioButton) childAt, i7, i10, f6Var);
                return;
            }
        }
        j6Var.a(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
    }

    public static boolean a0(int i7, long j3) {
        long N1 = org.telegram.messenger.qp.s1(i7).N1(j3);
        if (N1 <= 0 && j3 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(i7).J2(j3));
        }
        return N1 > 0 && N1 > org.telegram.messenger.qp.s1(i7).e7.getLong(rf.b.h(j3, "ask_paid_message_", "_price"), 0L);
    }

    public static void b(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i7 = 1;
        int i10 = calendar.get(1);
        int i11 = calendar.get(2);
        int i12 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i13 = calendar.get(1);
        int i14 = calendar.get(2);
        int i15 = calendar.get(5);
        hb0Var3.setMaxValue(i13);
        hb0Var3.setMinValue(i10);
        int value = hb0Var3.getValue();
        hb0Var2.setMaxValue(value == i13 ? i14 : 11);
        hb0Var2.setMinValue(value == i10 ? i11 : 0);
        int value2 = hb0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i13 && value2 == i14) {
            actualMaximum = Math.min(i15, actualMaximum);
        }
        hb0Var.setMaxValue(actualMaximum);
        if (value == i10 && value2 == i11) {
            i7 = i12;
        }
        hb0Var.setMinValue(i7);
    }

    public static void b0(u4 u4Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.g0.v1(u4Var);
        String obj = u4Var.getText().toString();
        int i7 = org.telegram.ui.ActionBar.k6.a;
        org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6();
        j6Var.b = new File(org.telegram.messenger.t0.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
        j6Var.a = obj;
        org.telegram.ui.ActionBar.k6.h0 = org.telegram.ui.ActionBar.k6.b1(org.telegram.ui.ActionBar.k6.I.i0);
        j6Var.E = org.telegram.messenger.p10.s0;
        org.telegram.ui.ActionBar.k6.x1(j6Var, true, true, false);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o4, new Object[0]);
        new ThemeEditorView().d(f2Var.getParentActivity(), j6Var);
        u1Var.dismiss();
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        if (e12.getBoolean("themehint", false)) {
            return;
        }
        e12.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(f2Var.getParentActivity(), org.telegram.messenger.hd.M0(2131751711, null), 1).show();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static long c(fi.d dVar, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, hb0 hb0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i7 = 1;
        int i10 = calendar.get(1);
        int value = ((hb0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (hb0Var2.getValue() - 120) % 12);
        hb0Var.setMinValue(1);
        hb0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = hb0Var.getValue();
        int value3 = hb0Var3.getValue();
        int value4 = hb0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i7 = 0;
            } else if (i10 != value) {
                i7 = 2;
            }
            dVar.setText(org.telegram.messenger.hd.E0().x0(i7 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.u1 c0(final int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLObject tLObject, Object... objArr) {
        String str;
        char c10;
        String str2;
        final long j3;
        long n10;
        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o4 = bi.ea.o(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    n10 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    n10 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    n10 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    n10 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    n10 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                } else {
                    j3 = 0;
                    if (o4 > 0) {
                        bi.ea.y(i7, false).q(new Runnable() { // from class: org.telegram.ui.Components.b2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity u02 = org.telegram.messenger.g0.u0();
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.f6 bVar = (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) ? new di.b() : T != null ? T.getResourceProvider() : null;
                                int i10 = i7;
                                long j10 = j3;
                                new bi.tc(u02, bVar, o4, 13, org.telegram.messenger.m5.s(i10, j10), new org.telegram.messenger.pd(16), j10).show();
                            }
                        }, true, true);
                        return null;
                    }
                }
                j3 = n10;
                if (o4 > 0) {
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    r0(f2Var2, org.telegram.messenger.hd.M0(2131749365, null), org.telegram.messenger.hd.M0(2131749366, null), null);
                    return null;
                }
                boolean z9 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z9 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long n11 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (n11 >= 0) {
                        str2 = org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(n11)), true);
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-n11));
                        str2 = M0 != null ? M0.title : "";
                    }
                    if (f2Var2 == null) {
                        f2Var2 = LaunchActivity.Q();
                    }
                    r0(f2Var2, org.telegram.messenger.hd.M0(2131748538, null), org.telegram.messenger.hd.a0(null, null, 2131748539, str2), null);
                    org.telegram.messenger.qp.s1(i7).n2(0, n11);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z10 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z10 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.f2 Q = f2Var2 == null ? LaunchActivity.Q() : f2Var2;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749251, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749243, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749257, null), null);
                            return null;
                        }
                        r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749258, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749254, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749256, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749253, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749255, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749252, null), org.telegram.messenger.hd.M0(2131749250, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        j0(tL_error.text, Q);
                        return null;
                    }
                    String M02 = org.telegram.messenger.hd.M0(2131749252, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error.text);
                    r0(Q, M02, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.f2 Q2 = f2Var2 == null ? LaunchActivity.Q() : f2Var2;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            r0(Q2, null, org.telegram.messenger.hd.M0(2131749178, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            r0(Q2, null, org.telegram.messenger.hd.M0(2131750688, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            u0(Q2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                            return null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                        sb3.append(tL_error.text);
                        r0(Q2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z11 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i10 = org.telegram.messenger.qs.M0;
                    if (z11 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (f2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (f2Var2.getParentActivity() != null) {
                                f2Var2.showDialog(new ug.i0(5, i7, f2Var2.getParentActivity(), f2Var2, null));
                                return null;
                            }
                            if (z11 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                f2Var2.presentFragment(new m81(0));
                                return null;
                            }
                            f2Var2.presentFragment(new m81(1));
                            return null;
                        }
                        if (f2Var2 != null) {
                            e0(tL_error, f2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            org.telegram.messenger.qs.f(i7).k(i10, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.f2 Q3 = f2Var2 == null ? LaunchActivity.Q() : f2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new ug.i0(5, i7, Q3.getParentActivity(), Q3, null));
                                    return null;
                                }
                                Q3.presentFragment(new m81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.f2 f2Var3 = Q3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, f2Var3);
                                return null;
                            }
                            e0(tL_error, f2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.f2 Q4 = f2Var2 == null ? LaunchActivity.Q() : f2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q4.getParentActivity() != null) {
                                    Q4.showDialog(new ug.i0(5, i7, Q4.getParentActivity(), Q4, null));
                                    return null;
                                }
                                Q4.presentFragment(new m81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.f2 f2Var4 = Q4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, f2Var4);
                                return null;
                            }
                            e0(tL_error, f2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (f2Var2 != null) {
                                    r0(f2Var2, null, org.telegram.messenger.hd.M0(2131751272, null), null);
                                    return null;
                                }
                                t0(org.telegram.messenger.hd.M0(2131751272, null), null);
                                return null;
                            }
                        } else {
                            if (z9 || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long n12 = z9 ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? org.telegram.messenger.m5.n(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str3 = tL_error.text;
                                if (str3 == null || !str3.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str4 = tL_error.text;
                                    str4.getClass();
                                    switch (str4) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            org.telegram.messenger.qs.f(i7).k(i10, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            org.telegram.messenger.qs.f(i7).k(i10, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            t0(org.telegram.messenger.hd.M0(2131748528, null), f2Var2);
                                            break;
                                    }
                                    return null;
                                }
                                String str5 = tL_error.text;
                                TLRPC.Chat M03 = n12 < 0 ? org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-n12)) : null;
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
                                    Method dump skipped, instructions count: 2638
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v4.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.f2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.u1");
                            }

                            public static void d(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i7 = 1;
                                int i10 = calendar.get(1);
                                int i11 = calendar.get(2);
                                int i12 = calendar.get(5);
                                hb0Var3.setMinValue(i10);
                                int value = hb0Var3.getValue();
                                hb0Var2.setMinValue(value == i10 ? i11 : 0);
                                int value2 = hb0Var2.getValue();
                                if (value == i10 && value2 == i11) {
                                    i7 = i12;
                                }
                                hb0Var.setMinValue(i7);
                            }

                            public static void d0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.c20 c20Var, dm dmVar) {
                                Activity W = org.telegram.messenger.g0.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                                String M0 = org.telegram.messenger.hd.M0(2131747152, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.hd.M0(2131747153, null);
                                final b4 b4Var = new b4(context);
                                b4Var.setTextSize(1, 16.0f);
                                int i7 = org.telegram.ui.ActionBar.k6.j5;
                                org.telegram.ui.ActionBar.r6.V(b4Var, i7, f6Var);
                                org.telegram.ui.ActionBar.r6.E(b4Var, org.telegram.ui.ActionBar.k6.Li, f6Var);
                                b4Var.setHint(org.telegram.messenger.hd.M0(2131747151, null));
                                b4Var.setInputType(17);
                                b4Var.setImeOptions(6);
                                b4Var.setMaxLines(10);
                                b4Var.setSingleLine(false);
                                b4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                                b4Var.setCursorWidth(1.5f);
                                b4Var.z(org.telegram.ui.ActionBar.k6.q6, f6Var);
                                if (str != null) {
                                    b4Var.setText(str);
                                    b4Var.setSelection(str.length());
                                }
                                b4Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.e2
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                                        if (i10 != 6) {
                                            return false;
                                        }
                                        b4 b4Var2 = b4.this;
                                        String trim = b4Var2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : v4.a.matcher(trim.trim()).matches())) {
                                            org.telegram.messenger.g0.F3(b4Var2);
                                            return true;
                                        }
                                        c20Var.a(trim);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
                                        if (u1Var2 != null) {
                                            u1Var2.dismiss();
                                        }
                                        View view = currentFocus;
                                        if (view != null) {
                                            view.requestFocus();
                                        }
                                        return true;
                                    }
                                });
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
                                org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i7);
                                b4Var.setBackground(d02);
                                org.telegram.ui.ActionBar.r6.k(b4Var, d02, L, null, f6Var);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.addView(b4Var, c8.ha.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i10 = b71.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    b71 b71Var = new b71(context, f6Var);
                                    b71Var.setWebPage(webPage);
                                    f10.addView(b71Var, c8.ha.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.c();
                                alertDialog$Builder.o(f10);
                                u1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751355, null), new f2(0, b4Var, c20Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.zq(26));
                                if (dmVar != null) {
                                    alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131751599, null), new v0(4, dmVar));
                                }
                                u1VarArr[0] = u1Var;
                                u1Var.j0 = false;
                                u1Var.setOnDismissListener(new p0(b4Var, 2));
                                u1VarArr[0].setOnShowListener(new g2(b4Var, 0));
                                u1VarArr[0].show();
                                TextView textView = (TextView) u1VarArr[0].d(-3);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                            }

                            public static void e(TextView textView, hb0 hb0Var, z3 z3Var, a4 a4Var) {
                                int value = hb0Var.getValue();
                                int value2 = z3Var.getValue();
                                int value3 = a4Var.getValue();
                                Calendar calendar = Calendar.getInstance();
                                long currentTimeMillis = System.currentTimeMillis();
                                calendar.setTimeInMillis(currentTimeMillis);
                                calendar.add(6, value);
                                calendar.set(11, value2);
                                calendar.set(12, value3);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
                                int i7 = timeInMillis / 86400;
                                int i10 = (timeInMillis % 86400) / 3600;
                                int i11 = (timeInMillis % 3600) / 60;
                                textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747173, org.telegram.messenger.hd.a0(null, null, 2131747172, i7 > 0 ? org.telegram.messenger.hd.G(i7, "Days", new Object[0]) : "", i10 > 0 ? org.telegram.messenger.hd.G(i10, "Hours", new Object[0]) : "", i11 > 0 ? org.telegram.messenger.hd.G(i11, "Minutes", new Object[0]) : "").trim()));
                            }

                            public static void e0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                org.telegram.ui.ActionBar.u1 u1Var;
                                int i7;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || f2Var == null || f2Var.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                String str = tL_error.text;
                                str.getClass();
                                i7 = 1;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        u1Var.T = org.telegram.messenger.hd.M0(2131748757, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        u1Var.T = org.telegram.messenger.hd.M0(2131746591, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        u1Var.T = org.telegram.messenger.hd.M0(2131751748, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z9) {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131749388, null);
                                            break;
                                        } else {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131752271, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        u1Var.T = org.telegram.messenger.hd.M0(2131743729, null);
                                        break;
                                    case "PEER_FLOOD":
                                        u1Var.T = org.telegram.messenger.hd.M0(2131748125, null);
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131748330, null), new x2(i7, f2Var));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z9) {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131749386, null);
                                            break;
                                        } else {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131752269, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131754477, null);
                                            break;
                                        } else {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131754364, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        u1Var.T = org.telegram.messenger.hd.M0(2131742843, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        u1Var.T = org.telegram.messenger.hd.M0(2131754465, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z9) {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131749389, null);
                                            break;
                                        } else {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131752272, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z9) {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131749387, null);
                                            break;
                                        } else {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131752270, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        u1Var.R = org.telegram.messenger.hd.M0(2131752282, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131752283, null);
                                            break;
                                        } else {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131752284, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        u1Var.R = org.telegram.messenger.hd.M0(2131752282, null);
                                        u1Var.T = org.telegram.messenger.hd.M0(2131743758, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z9) {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131749385, null);
                                            break;
                                        } else {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131752268, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        u1Var.T = org.telegram.messenger.hd.M0(2131754476, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z10) {
                                            if (!z9) {
                                                u1Var.T = org.telegram.messenger.hd.M0(2131749108, null);
                                                break;
                                            } else {
                                                u1Var.T = org.telegram.messenger.hd.M0(2131749111, null);
                                                break;
                                            }
                                        } else {
                                            u1Var.T = org.telegram.messenger.hd.M0(2131749110, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        u1Var.R = org.telegram.messenger.hd.M0(2131743307, null);
                                        u1Var.T = org.telegram.messenger.hd.M0(2131743377, null);
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                                        sb2.append(tL_error.text);
                                        u1Var.T = sb2.toString();
                                        break;
                                }
                                jg.g.C(null, 2131747830, alertDialog$Builder, null);
                            }

                            public static void f(int i7, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
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
                                        user = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(tL_missingInvitee2.user_id));
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
                                org.telegram.messenger.g0.i3(new bi.ub(i7, chat, arrayList, arrayList2, arrayList3), 200L);
                            }

                            public static org.telegram.ui.ActionBar.u1 f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
                                if (activity == null) {
                                    c20Var.a(Boolean.FALSE);
                                    return null;
                                }
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
                                int i10 = 1;
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                boolean[] zArr = {false};
                                bi.md mdVar = new bi.md(activity, 23);
                                org.telegram.messenger.qs.i(mdVar);
                                org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.j5, f6Var);
                                mdVar.setTextSize(1, 16.0f);
                                int i11 = 3;
                                mdVar.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                mdVar.setText(charSequence);
                                i3 i3Var = new i3(activity, c2VarArr, i10);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.G = 6;
                                alertDialog$Builder.o(i3Var);
                                TextView textView = new TextView(activity);
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.E8, f6Var, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                i3Var.addView(textView, c8.ha.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                i3Var.addView(mdVar, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, f6Var);
                                    c2VarArr[0] = c2Var;
                                    int i12 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 7, org.telegram.messenger.g0.L(12.0f));
                                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                                    c2Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, f6Var);
                                    c2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (org.telegram.messenger.hd.a0 ? 5 : 3) | 16;
                                    c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    c2VarArr[0].e(charSequence2, "", false, false, false);
                                    c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                                    i3Var.addView(c2VarArr[0], c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new x0(i11, zArr));
                                }
                                alertDialog$Builder.k(str2, new u2(i7, c20Var, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                if (z9) {
                                    u1Var.X0 = true;
                                }
                                u1Var.show();
                                return u1Var;
                            }

                            public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i7, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
                                long j11;
                                int i10;
                                long j12;
                                int i11;
                                int i12;
                                int i13;
                                boolean z9;
                                boolean z10;
                                String G;
                                int value = hb0Var.getValue();
                                int value2 = hb0Var2.getValue();
                                int value3 = hb0Var3.getValue();
                                Calendar calendar = Calendar.getInstance();
                                long currentTimeMillis = System.currentTimeMillis();
                                calendar.setTimeInMillis(currentTimeMillis);
                                int i14 = calendar.get(1);
                                calendar.get(6);
                                if (j10 > 0) {
                                    i10 = i14;
                                    calendar.setTimeInMillis((j10 * 1000) + currentTimeMillis);
                                    calendar.set(11, 23);
                                    calendar.set(12, 59);
                                    calendar.set(13, 59);
                                    calendar.set(14, 0);
                                    j11 = currentTimeMillis;
                                    i11 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
                                    j12 = calendar.getTimeInMillis();
                                    i12 = 23;
                                    i13 = 59;
                                } else {
                                    j11 = currentTimeMillis;
                                    i10 = i14;
                                    j12 = j10;
                                    i11 = 0;
                                    i12 = 0;
                                    i13 = 0;
                                }
                                int i15 = i13;
                                long millis = j3 > 0 ? TimeUnit.SECONDS.toMillis(j3) : 60000L;
                                long j13 = j11 + millis;
                                calendar.setTimeInMillis(j13);
                                int i16 = calendar.get(11);
                                int i17 = calendar.get(12);
                                long j14 = j12;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                calendar.add(6, value);
                                calendar.set(11, value2);
                                calendar.set(12, value3);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                long timeInMillis = calendar.getTimeInMillis();
                                hb0Var.setMinValue(0);
                                if (j14 > 0) {
                                    hb0Var.setMaxValue(i11);
                                }
                                int value4 = hb0Var.getValue();
                                hb0Var2.setMinValue(value4 == 0 ? i16 : 0);
                                if (j14 > 0) {
                                    hb0Var2.setMaxValue(value4 == i11 ? i12 : 23);
                                }
                                int value5 = hb0Var2.getValue();
                                hb0Var3.setMinValue((value4 == 0 && value5 == i16) ? i17 : 0);
                                if (j14 > 0) {
                                    hb0Var3.setMaxValue((value4 == i11 && value5 == i12) ? i15 : 59);
                                }
                                int value6 = hb0Var3.getValue();
                                if (timeInMillis <= j13) {
                                    calendar.setTimeInMillis(j13);
                                } else if (j14 > 0 && timeInMillis > j14) {
                                    calendar.setTimeInMillis(j14);
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
                                    textView.setText(org.telegram.messenger.hd.E0().x0((i7 * 3) + (value4 == 0 ? 0 : i10 == i18 ? 1 : 2)).format(timeInMillis2));
                                }
                                if (textView2 != null) {
                                    int i19 = (int) ((timeInMillis2 - j11) / 1000);
                                    if (i19 > 86400) {
                                        z10 = false;
                                        G = org.telegram.messenger.hd.G(Math.round(i19 / 86400.0f), "DaysSchedule", new Object[0]);
                                    } else {
                                        z10 = false;
                                        z10 = false;
                                        z10 = false;
                                        G = i19 >= 3600 ? org.telegram.messenger.hd.G(Math.round(i19 / 3600.0f), "HoursSchedule", new Object[0]) : i19 >= 60 ? org.telegram.messenger.hd.G(Math.round(i19 / 60.0f), "MinutesSchedule", new Object[0]) : org.telegram.messenger.hd.G(i19, "SecondsSchedule", new Object[0]);
                                    }
                                    if (textView2.getTag() != null) {
                                        z9 = true;
                                        Object[] objArr = new Object[1];
                                        objArr[z10 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.hd.a0("VoipChannelScheduleInfo", null, 2131743464, objArr));
                                    } else {
                                        z9 = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z10 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.hd.a0("VoipGroupScheduleInfo", null, 2131743343, objArr2));
                                    }
                                } else {
                                    z9 = true;
                                    z10 = false;
                                }
                                return timeInMillis - j11 > millis ? z9 : z10;
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
                            /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String, org.telegram.ui.ActionBar.f6, org.telegram.ui.ActionBar.r1] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.f2] */
                            /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [org.telegram.ui.Cells.c2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void g0(org.telegram.ui.ActionBar.f2 f2Var, long j3, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z9, TLRPC.ChatFull chatFull, final org.telegram.messenger.sr srVar, org.telegram.ui.ActionBar.f6 f6Var) {
                                long j10;
                                boolean z10;
                                String str;
                                String M0;
                                ?? r92;
                                ?? r14;
                                TextView textView;
                                String str2;
                                if (f2Var.getParentActivity() == null) {
                                    return;
                                }
                                final org.telegram.messenger.c accountInstance = f2Var.getAccountInstance();
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var);
                                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).d7;
                                int i7 = 1;
                                if (encryptedChat == null) {
                                    j10 = j3;
                                    if (!org.telegram.messenger.k5.w("dialog_bar_report", j10, sharedPreferences, false)) {
                                        z10 = false;
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        if (user == null) {
                                            u1Var.R = org.telegram.messenger.hd.a0("BlockUserTitle", null, 2131753685, org.telegram.messenger.t10.j(user, true));
                                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserAlert", null, 2131753691, org.telegram.messenger.t10.j(user, true)));
                                            String M02 = org.telegram.messenger.hd.M0(2131753693, null);
                                            int i10 = 2;
                                            r92 = new org.telegram.ui.Cells.c2[2];
                                            int i11 = 0;
                                            ?? linearLayout = new LinearLayout(f2Var.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i12 = 0;
                                            while (i12 < i10) {
                                                if (i12 != 0 || z10) {
                                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i7, f2Var.getParentActivity(), f6Var);
                                                    r92[i12] = c2Var;
                                                    c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(i11));
                                                    r92[i12].setTag(Integer.valueOf(i12));
                                                    if (i12 == 0) {
                                                        r92[i12].e(org.telegram.messenger.hd.M0(2131751503, null), "", true, false, false);
                                                        str2 = M02;
                                                    } else {
                                                        str2 = M02;
                                                        r92[i12].e(org.telegram.messenger.hd.a0("DeleteThisChat", null, 2131751483, new Object[i11]), "", true, false, false);
                                                    }
                                                    r92[i12].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    linearLayout.addView(r92[i12], c8.ha.o(-1, -2));
                                                    r92[i12].setOnClickListener(new q0(r92, 1));
                                                } else {
                                                    str2 = M02;
                                                }
                                                i12++;
                                                M02 = str2;
                                                i7 = 1;
                                                i10 = 2;
                                                i11 = 0;
                                            }
                                            alertDialog$Builder.o(linearLayout);
                                            M0 = M02;
                                            r14 = 0;
                                        } else {
                                            if (chat == null || !z9) {
                                                str = null;
                                                str = null;
                                                u1Var.R = org.telegram.messenger.hd.M0(2131746201, null);
                                                if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                                                    u1Var.T = org.telegram.messenger.hd.M0(2131746205, null);
                                                } else {
                                                    u1Var.T = org.telegram.messenger.hd.M0(2131746206, null);
                                                }
                                            } else {
                                                u1Var.R = org.telegram.messenger.hd.M0(2131746190, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ReportUnrelatedGroupText", null, 2131746189, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                u1Var.T = org.telegram.messenger.hd.M0(2131746188, null);
                                            }
                                            M0 = org.telegram.messenger.hd.M0(2131746231, str);
                                            r92 = str;
                                            r14 = str;
                                        }
                                        final org.telegram.ui.Cells.c2[] c2VarArr = r92;
                                        final long j11 = j10;
                                        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.j1
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                                                org.telegram.ui.Cells.c2 c2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                org.telegram.messenger.c cVar = accountInstance;
                                                if (user2 != null) {
                                                    org.telegram.messenger.qp.s1(cVar.a).w(user2.id);
                                                }
                                                org.telegram.ui.Cells.c2[] c2VarArr2 = c2VarArr;
                                                long j12 = j11;
                                                TLRPC.Chat chat2 = chat;
                                                if (c2VarArr2 == null || ((c2Var2 = c2VarArr2[0]) != null && c2Var2.b())) {
                                                    org.telegram.messenger.qp.s1(cVar.a).o4(j12, user2, chat2, encryptedChat, chat2 != null && z9);
                                                }
                                                org.telegram.messenger.sr srVar2 = srVar;
                                                if (c2VarArr2 != null && !c2VarArr2[1].b()) {
                                                    srVar2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    org.telegram.messenger.qp.s1(cVar.a).X(0, j12, false);
                                                } else if (org.telegram.messenger.t3.r0(chat2)) {
                                                    org.telegram.messenger.qp.s1(cVar.a).X(0, j12, false);
                                                } else {
                                                    int i14 = cVar.a;
                                                    org.telegram.messenger.qp.s1(i14).f0(-j12, org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(org.telegram.messenger.p10.i(i14).e())));
                                                }
                                                srVar2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r14), r14);
                                        f2Var.showDialog(u1Var);
                                        textView = (TextView) u1Var.d(-1);
                                        if (textView == null) {
                                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, r14);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    j10 = j3;
                                }
                                z10 = true;
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                                if (user == null) {
                                }
                                final org.telegram.ui.Cells.c2[] c2VarArr2 = r92;
                                final long j112 = j10;
                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.j1
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i13) {
                                        org.telegram.ui.Cells.c2 c2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        org.telegram.messenger.c cVar = accountInstance;
                                        if (user2 != null) {
                                            org.telegram.messenger.qp.s1(cVar.a).w(user2.id);
                                        }
                                        org.telegram.ui.Cells.c2[] c2VarArr22 = c2VarArr2;
                                        long j12 = j112;
                                        TLRPC.Chat chat2 = chat;
                                        if (c2VarArr22 == null || ((c2Var2 = c2VarArr22[0]) != null && c2Var2.b())) {
                                            org.telegram.messenger.qp.s1(cVar.a).o4(j12, user2, chat2, encryptedChat, chat2 != null && z9);
                                        }
                                        org.telegram.messenger.sr srVar2 = srVar;
                                        if (c2VarArr22 != null && !c2VarArr22[1].b()) {
                                            srVar2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            org.telegram.messenger.qp.s1(cVar.a).X(0, j12, false);
                                        } else if (org.telegram.messenger.t3.r0(chat2)) {
                                            org.telegram.messenger.qp.s1(cVar.a).X(0, j12, false);
                                        } else {
                                            int i14 = cVar.a;
                                            org.telegram.messenger.qp.s1(i14).f0(-j12, org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(org.telegram.messenger.p10.i(i14).e())));
                                        }
                                        srVar2.a(1);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r14), r14);
                                f2Var.showDialog(u1Var2);
                                textView = (TextView) u1Var2.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static boolean h(Context context, int i7, long j3, boolean z9) {
                                TLRPC.Chat M0;
                                if (!org.telegram.messenger.m5.z(j3) || (M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3))) == null || !M0.slowmode_enabled || org.telegram.messenger.t3.N(M0)) {
                                    return false;
                                }
                                if (!z9) {
                                    TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(M0.id);
                                    if (N0 == null) {
                                        N0 = org.telegram.messenger.yr.a0(i7).F0(M0.id, org.telegram.messenger.t3.T(M0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (N0 != null && N0.slowmode_next_send_date >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                                        z9 = true;
                                    }
                                }
                                if (!z9) {
                                    return false;
                                }
                                K(context, M0.title, org.telegram.messenger.hd.M0(2131745303, null)).p();
                                return true;
                            }

                            public static void h0(org.telegram.ui.an anVar, org.telegram.messenger.ij ijVar, long j3, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.xf xfVar) {
                                if (anVar.getParentActivity() == null || ijVar == null) {
                                    return;
                                }
                                org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                                TLRPC.User a22 = j3 > 0 ? org.telegram.messenger.qp.s1(accountInstance.a).a2(Long.valueOf(j3)) : null;
                                TLRPC.Chat M0 = j3 < 0 ? org.telegram.messenger.qp.s1(accountInstance.a).M0(Long.valueOf(-j3)) : null;
                                if (a22 == null && M0 == null) {
                                    return;
                                }
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), f6Var);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.P0 = false;
                                u1Var.N = new p0(xfVar, i7);
                                u1Var.R = org.telegram.messenger.hd.M0(2131753692, null);
                                if (a22 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753686, org.telegram.messenger.t10.j(a22, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753686, M0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(anVar.getParentActivity());
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, anVar.getParentActivity(), f6Var)};
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                c2VarArr[0].setTag(0);
                                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131751503, null), "", true, false, false);
                                c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                linearLayout.addView(c2VarArr[0], c8.ha.o(-1, -2));
                                c2VarArr[0].setOnClickListener(new q0(c2VarArr, i7));
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753695, null), new s0(a22, accountInstance, anVar, M0, ijVar, c2VarArr, f6Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                anVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                            }

                            public static org.telegram.ui.ActionBar.u1 i(Activity activity, r4 r4Var) {
                                if (org.telegram.messenger.p10.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                bi.r4 r4Var2 = u1Var.L0;
                                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                                LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
                                for (int i7 = 0; i7 < 4; i7++) {
                                    if (org.telegram.messenger.p10.i(i7).f() != null) {
                                        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                                        kVar.f = i7;
                                        TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
                                        w8 w8Var = kVar.e;
                                        w8Var.r(f10);
                                        kVar.a.l(org.telegram.messenger.g5.m(0, f10.first_name, f10.last_name), false);
                                        l9 l9Var = kVar.c;
                                        l9Var.getImageReceiver().d = i7;
                                        l9Var.e(f10, w8Var);
                                        kVar.d.setVisibility(4);
                                        kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                                        kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                        e10.addView(kVar, c8.ha.o(-1, 50));
                                        kVar.setOnClickListener(new ah.g((Object) u1VarArr, (Runnable) r4Var2, (Object) r4Var, 17));
                                    }
                                }
                                u1Var.R = org.telegram.messenger.hd.M0(2131745672, null);
                                alertDialog$Builder.o(e10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
                                u1VarArr[0] = u1Var;
                                return u1Var;
                            }

                            public static void i0(Context context, int i7, long j3) {
                                org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                f10.addView(frameLayout, c8.ha.t(-1, 92, 17, 0, 0, 0, 0));
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                imageView.setImageResource(R.drawable.story_link);
                                imageView.setScaleX(2.0f);
                                imageView.setScaleY(2.0f);
                                frameLayout2.addView(imageView, c8.ha.e(-1, -1, 17));
                                int L = org.telegram.messenger.g0.L(80.0f);
                                int i10 = org.telegram.ui.ActionBar.k6.Ci;
                                ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.v0(i10));
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                                frameLayout2.setBackground(L2);
                                org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, null);
                                frameLayout.addView(frameLayout2, c8.ha.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i11 = org.telegram.ui.ActionBar.k6.G6;
                                org.telegram.messenger.k5.n(textView, i11, null, 1, 20.0f);
                                textView.setText(org.telegram.messenger.hd.M0(2131752624, null));
                                textView.setGravity(17);
                                TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                org.telegram.ui.ActionBar.r6.V(f11, i11, null);
                                f11.setTextSize(1, 14.0f);
                                org.telegram.messenger.k5.r(null, null, 2131752625, new Object[]{org.telegram.messenger.m5.l(i7, j3)}, f11);
                                f11.setGravity(17);
                                f10.addView(f11, c8.ha.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                fi.d dVar = new fi.d(context, null, true);
                                dVar.i(org.telegram.messenger.hd.M0(2131752626, null), false, true);
                                f10.addView(dVar, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                l10.N = f10;
                                dVar.setOnClickListener(new org.telegram.ui.hd(i7, dVar, l10, j3));
                                l10.N();
                                l10.show();
                            }

                            public static org.telegram.ui.ActionBar.u1 j(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                                String M0 = org.telegram.messenger.hd.M0(2131754243, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.T = M0;
                                int i7 = org.telegram.ui.ActionBar.k6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.k6.x0(null, i7, false), null);
                                alertDialog$Builder.n(i7, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new k0(context, 0));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                                return u1Var;
                            }

                            public static void j0(String str, org.telegram.ui.ActionBar.f2 f2Var) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || f2Var == null || f2Var.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                f2Var.showDialog(u1Var, true, null);
                            }

                            public static void k(Context context, org.telegram.ui.ActionBar.f6 f6Var, t4 t4Var) {
                                if (context == null) {
                                    return;
                                }
                                boolean z9 = false;
                                int i7 = org.telegram.ui.ActionBar.k6.j5;
                                int f10 = f6Var != null ? f6Var.f(i7) : org.telegram.ui.ActionBar.k6.x0(null, i7, false);
                                int i10 = org.telegram.ui.ActionBar.k6.h5;
                                int f11 = f6Var != null ? f6Var.f(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                                int i11 = org.telegram.ui.ActionBar.k6.xj;
                                if (f6Var != null) {
                                    f6Var.f(i11);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i11, false);
                                }
                                int i12 = org.telegram.ui.ActionBar.k6.Bj;
                                if (f6Var != null) {
                                    f6Var.f(i12);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                                }
                                int i13 = org.telegram.ui.ActionBar.k6.E8;
                                if (f6Var != null) {
                                    f6Var.f(i13);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                                }
                                int i14 = org.telegram.ui.ActionBar.k6.G8;
                                if (f6Var != null) {
                                    f6Var.f(i14);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                                }
                                int i15 = org.telegram.ui.ActionBar.k6.i6;
                                if (f6Var != null) {
                                    f6Var.f(i15);
                                } else {
                                    org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                                }
                                int i16 = org.telegram.ui.ActionBar.k6.Gi;
                                int f12 = f6Var != null ? f6Var.f(i16) : org.telegram.ui.ActionBar.k6.x0(null, i16, false);
                                int i17 = org.telegram.ui.ActionBar.k6.Ci;
                                int f13 = f6Var != null ? f6Var.f(i17) : org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                                int i18 = org.telegram.ui.ActionBar.k6.Ei;
                                int f14 = f6Var != null ? f6Var.f(i18) : org.telegram.ui.ActionBar.k6.x0(null, i18, false);
                                h9.f1 f1Var = new h9.f1(context, f6Var);
                                ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                e4 e4Var = new e4(context, f6Var, iArr);
                                e4Var.setMinValue(0);
                                e4Var.setMaxValue(16);
                                e4Var.setTextColor(f10);
                                e4Var.setValue(0);
                                e4Var.setFormatter(new w0(iArr, 1));
                                f4 f4Var = new f4(context, e4Var, 0);
                                boolean z10 = true;
                                f4Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                f4Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(org.telegram.messenger.hd.M0(2131753877, null));
                                textView.setTextColor(f10);
                                com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
                                frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new ei.b(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                f4Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, z10, z10, z9, 1);
                                linearLayout.addView(e4Var, c8.ha.l(1.0f, 0, org.telegram.messenger.qs.t4));
                                w3Var.setPadding(0, 0, 0, 0);
                                w3Var.setGravity(17);
                                w3Var.setTextColor(f12);
                                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                                w3Var.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                w3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, f13, f14, f14));
                                f4Var.addView(w3Var, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                                w3Var.setText(org.telegram.messenger.hd.M0(2131751435, null));
                                e4Var.setOnValueChangedListener(new u(w3Var, 10));
                                w3Var.setOnClickListener(new di.u3(iArr, e4Var, t4Var, f1Var, 8));
                                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
                                v2Var.N = f4Var;
                                v2Var.show();
                                v2Var.v0(f11);
                                v2Var.O(f11);
                            }

                            public static void k0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7, TL_stars.StarGift starGift, long j3, Runnable runnable) {
                                TLObject e22 = org.telegram.messenger.qp.s1(i7).e2(j3);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.addView(new bi.e6(context, starGift, e22), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
                                textView.setTextSize(1, 16.0f);
                                org.telegram.messenger.k5.r(null, null, 2131749593, new Object[]{org.telegram.messenger.m5.H(null, null, e22)}, textView);
                                f10.addView(textView, c8.ha.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                                alertDialog$Builder.o(f10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749594, null), new v0(2, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.p();
                            }

                            public static h9.f1 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.c20 c20Var, Runnable runnable, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
                                if (context == null) {
                                    return null;
                                }
                                h9.f1 f1Var = new h9.f1(context, f6Var);
                                int i7 = 0;
                                ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
                                hb0 hb0Var = new hb0(context, f6Var);
                                hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                hb0Var.setItemCount(5);
                                hb0 hb0Var2 = new hb0(context, f6Var);
                                hb0Var2.setItemCount(5);
                                hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                hb0 hb0Var3 = new hb0(context, f6Var);
                                hb0Var3.setItemCount(5);
                                hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                w3 w3Var = new w3(context, hb0Var, hb0Var2, hb0Var3);
                                w3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                w3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, f6Var, 1, 20.0f);
                                frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new ei.b(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                w3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i10 = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i11 = calendar.get(5);
                                int i12 = calendar.get(2);
                                int i13 = calendar.get(1);
                                int i14 = i13 + 1;
                                p2 p2Var = new p2(hb0Var3, i14, hb0Var, hb0Var2, i13, i12, i11);
                                System.currentTimeMillis();
                                x3 x3Var = new x3(context);
                                linearLayout.addView(hb0Var, c8.ha.l(0.25f, 0, org.telegram.messenger.qs.t4));
                                hb0Var.setMinValue(1);
                                hb0Var.setMaxValue(31);
                                hb0Var.setWrapSelectorWheel(false);
                                hb0Var.setFormatter(new k2(1));
                                u uVar = new u(p2Var, 9);
                                hb0Var.setOnScrollListener(uVar);
                                hb0Var2.setMinValue(0);
                                hb0Var2.setMaxValue(11);
                                hb0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                                hb0Var2.setFormatter(new k2(2));
                                hb0Var2.setOnScrollListener(uVar);
                                hb0Var3.setMinValue(i10);
                                hb0Var3.setMaxValue(i14);
                                hb0Var3.setWrapSelectorWheel(false);
                                hb0Var3.setFormatter(new l2.u(i14, 5));
                                linearLayout.addView(hb0Var3, c8.ha.l(0.25f, 0, org.telegram.messenger.qs.t4));
                                hb0Var3.setOnScrollListener(uVar);
                                if (tL_birthday != null) {
                                    hb0Var.setValue(tL_birthday.day);
                                    hb0Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        hb0Var3.setValue(tL_birthday.year);
                                    } else {
                                        hb0Var3.setValue(i14);
                                    }
                                } else {
                                    hb0Var.setValue(calendar.get(5));
                                    hb0Var2.setValue(calendar.get(2));
                                    hb0Var3.setValue(i14);
                                }
                                p2Var.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    w70 w70Var = new w70(context, null);
                                    w70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    w70Var.setTextSize(1, 13.0f);
                                    org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q5, f6Var);
                                    org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
                                    w70Var.setGravity(17);
                                    frameLayout2.addView(w70Var, c8.ha.e(-2, -2, 17));
                                    w3Var.addView(frameLayout2, c8.ha.o(-1, -2));
                                    int i15 = org.telegram.messenger.p10.s0;
                                    r2 r2Var = new r2(i15, w70Var, i7);
                                    r2Var.run();
                                    org.telegram.messenger.qs.f(i15).h(frameLayout2, org.telegram.messenger.qs.k0, new s2(r2Var, i7));
                                    org.telegram.messenger.g5.r(i15).D(false);
                                }
                                if (z9) {
                                    fi.d dVar = new fi.d(context, f6Var, false);
                                    dVar.i(org.telegram.messenger.hd.M0(2131751671, null), false, true);
                                    dVar.setOnClickListener(new bi.la(hb0Var3, i14, p2Var, 7));
                                    w3Var.addView(dVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                x3Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                x3Var.setGravity(17);
                                org.telegram.ui.ActionBar.r6.V(x3Var, org.telegram.ui.ActionBar.k6.Gi, f6Var);
                                x3Var.setTextSize(1, 14.0f);
                                x3Var.setTypeface(org.telegram.messenger.g0.o());
                                x3Var.setText(str2);
                                int L = org.telegram.messenger.g0.L(24.0f);
                                int i16 = org.telegram.ui.ActionBar.k6.Ci;
                                int w02 = org.telegram.ui.ActionBar.k6.w0(i16, f6Var);
                                int i17 = org.telegram.ui.ActionBar.k6.Ei;
                                int w03 = org.telegram.ui.ActionBar.k6.w0(i17, f6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
                                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i17);
                                x3Var.setBackground(k02);
                                org.telegram.ui.ActionBar.r6.k(x3Var, k02, N, N2, f6Var);
                                c8.ka.b(x3Var, 0.02f, 1.2f);
                                w3Var.addView(x3Var, c8.ha.t(-1, 48, 83, 16, z9 ? 0 : 15, 16, z10 ? 0 : 16));
                                x3Var.setOnClickListener(new bi.jb(hb0Var, hb0Var2, hb0Var3, i14, f1Var, c20Var));
                                if (z10) {
                                    fi.d dVar2 = new fi.d(context, f6Var, false);
                                    dVar2.i(org.telegram.messenger.hd.M0(2131753715, null), false, true);
                                    dVar2.f();
                                    dVar2.setOnClickListener(new org.telegram.ui.ActionBar.l1(23, f1Var, c20Var));
                                    w3Var.addView(dVar2, c8.ha.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((org.telegram.ui.ActionBar.v2) f1Var.b).N = w3Var;
                                return f1Var;
                            }

                            public static void l0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, boolean z9, final org.telegram.messenger.v10 v10Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    final int i7 = 1;
                                    final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                                    final int i10 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                                    String M0 = org.telegram.messenger.hd.M0(2131747778, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i11 = org.telegram.ui.ActionBar.k6.j5;
                                    org.telegram.ui.ActionBar.r6.V(textView, i11, f6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, f6Var)));
                                    org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i11);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, f6Var);
                                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, f6Var);
                                    c2Var.setMultiline(true);
                                    c2Var.getTextView().getLayoutParams().width = -1;
                                    c2Var.getTextView().setSingleLine(false);
                                    c2Var.getTextView().setMaxLines(3);
                                    c2Var.getTextView().setTextSize(1, 16.0f);
                                    c2Var.e(org.telegram.messenger.hd.M0(z9 ? 2131752877 : 2131752876, null), "", false, false, false);
                                    c2Var.setOnClickListener(new a1(c2Var, i10));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, c8.ha.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(c2Var, c8.ha.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.o(linearLayout);
                                    u1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747816, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.b1
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                                            switch (i10) {
                                                case 0:
                                                    v10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                                                    if (u1Var3 != null) {
                                                        u1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    v10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.u1 u1Var4 = u1VarArr[0];
                                                    if (u1Var4 != null) {
                                                        u1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.b1
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                                            switch (i7) {
                                                case 0:
                                                    v10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                                                    if (u1Var3 != null) {
                                                        u1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    v10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.u1 u1Var4 = u1VarArr[0];
                                                    if (u1Var4 != null) {
                                                        u1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    u1VarArr[0] = alertDialog$Builder.p();
                                }
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
                            /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.String, org.telegram.ui.ActionBar.r1] */
                            /* JADX WARN: Type inference failed for: r5v23 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void m(org.telegram.ui.ActionBar.f2 f2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                org.telegram.ui.Cells.c2 c2Var;
                                ?? r52;
                                if (f2Var == null) {
                                    return;
                                }
                                Context context = f2Var.getContext();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                p4 p4Var = new p4(context, null);
                                org.telegram.messenger.qs.i(p4Var);
                                org.telegram.ui.ActionBar.r6.V(p4Var, org.telegram.ui.ActionBar.k6.j5, null);
                                org.telegram.ui.ActionBar.r6.H(p4Var, org.telegram.ui.ActionBar.k6.Uc, null);
                                p4Var.setTextSize(1, 16.0f);
                                p4Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                q4 q4Var = new q4(context, c2VarArr2);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.G = 6;
                                alertDialog$Builder.o(q4Var);
                                w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
                                w8Var.u(org.telegram.messenger.g0.L(18.0f));
                                l9 l9Var = new l9(context);
                                l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                q4Var.addView(l9Var, c8.ha.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                                org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
                                k5Var.setTextSize(20);
                                k5Var.setTypeface(org.telegram.messenger.g0.o());
                                k5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                k5Var.setEllipsizeByGradient(true);
                                k5Var.l(user.first_name, false);
                                if (user.scam) {
                                    k5Var.i(org.telegram.ui.ActionBar.k6.g1);
                                } else if (user.fake) {
                                    k5Var.i(org.telegram.ui.ActionBar.k6.h1);
                                } else if (user.verified) {
                                    Drawable h = jg.g.h(context, R.drawable.verified_area);
                                    int i7 = org.telegram.ui.ActionBar.k6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.r6.y(k5Var, h, i7, null, mode);
                                    Drawable h7 = jg.g.h(context, R.drawable.verified_check);
                                    c2VarArr = c2VarArr2;
                                    org.telegram.ui.ActionBar.r6.y(k5Var, h7, org.telegram.ui.ActionBar.k6.A9, null, mode);
                                    k5Var.i(new xp(h, h7));
                                    TextView textView = new TextView(context);
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.m5, null);
                                    int i10 = 1;
                                    org.telegram.messenger.camera.q.n(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new c1(user, f2Var, alertDialog$Builder, i10));
                                    SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.hd.M0(2131748334, null) + "  ");
                                    wp wpVar = new wp(R.drawable.attach_arrow_right, 0);
                                    wpVar.n = 1;
                                    wpVar.c(org.telegram.messenger.g0.L(10.0f));
                                    valueOf.setSpan(wpVar, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z9 = org.telegram.messenger.hd.a0;
                                    q4Var.addView(k5Var, c8.ha.d(-1, -2.0f, (!z9 ? 5 : 3) | 48, !z9 ? 21 : 76, 0.0f, !z9 ? 76 : 21, 0.0f));
                                    boolean z10 = org.telegram.messenger.hd.a0;
                                    q4Var.addView(textView, c8.ha.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 24.0f, z10 ? 76 : 21, 0.0f));
                                    q4Var.addView(p4Var, c8.ha.d(-2, -2.0f, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    c2Var = new org.telegram.ui.Cells.c2(1, context, f2Var.getResourceProvider());
                                    c2VarArr[0] = c2Var;
                                    if (!c2Var.H) {
                                        org.telegram.ui.Cells.b2 b2Var = c2Var.c;
                                        b2Var.setLines(3);
                                        b2Var.setMaxLines(3);
                                        b2Var.setSingleLine(false);
                                    }
                                    c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                    c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131747779, org.telegram.messenger.t10.p(user))), "", true, false, false);
                                    c2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                    c2VarArr[0].c(true, false);
                                    q4Var.addView(c2VarArr[0], c8.ha.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new h0(atomicBoolean, 1));
                                    if (org.telegram.messenger.t10.z(user)) {
                                        r52 = 0;
                                        w8Var.p = 1.0f;
                                        f2Var.getCurrentAccount();
                                        w8Var.r(user);
                                        l9Var.e(user, w8Var);
                                    } else {
                                        w8Var.p = 0.8f;
                                        w8Var.g(12);
                                        r52 = 0;
                                        l9Var.j(null, null, w8Var, user);
                                    }
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744916, r52), new v0(3, runnable));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r52), r52);
                                    f2Var.showDialog(u1Var);
                                    p4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752896, r52), new d1(1, context, u1Var)));
                                }
                                c2VarArr = c2VarArr2;
                                TextView textView2 = new TextView(context);
                                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.m5, null);
                                int i102 = 1;
                                org.telegram.messenger.camera.q.n(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new c1(user, f2Var, alertDialog$Builder, i102));
                                SpannableString valueOf2 = SpannableString.valueOf(org.telegram.messenger.hd.M0(2131748334, null) + "  ");
                                wp wpVar2 = new wp(R.drawable.attach_arrow_right, 0);
                                wpVar2.n = 1;
                                wpVar2.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf2.setSpan(wpVar2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z92 = org.telegram.messenger.hd.a0;
                                q4Var.addView(k5Var, c8.ha.d(-1, -2.0f, (!z92 ? 5 : 3) | 48, !z92 ? 21 : 76, 0.0f, !z92 ? 76 : 21, 0.0f));
                                boolean z102 = org.telegram.messenger.hd.a0;
                                q4Var.addView(textView2, c8.ha.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 24.0f, z102 ? 76 : 21, 0.0f));
                                q4Var.addView(p4Var, c8.ha.d(-2, -2.0f, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                c2Var = new org.telegram.ui.Cells.c2(1, context, f2Var.getResourceProvider());
                                c2VarArr[0] = c2Var;
                                if (!c2Var.H) {
                                }
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131747779, org.telegram.messenger.t10.p(user))), "", true, false, false);
                                c2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                c2VarArr[0].c(true, false);
                                q4Var.addView(c2VarArr[0], c8.ha.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                c2VarArr[0].setOnClickListener(new h0(atomicBoolean, 1));
                                if (org.telegram.messenger.t10.z(user)) {
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744916, r52), new v0(3, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r52), r52);
                                f2Var.showDialog(u1Var);
                                p4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752896, r52), new d1(1, context, u1Var)));
                            }

                            public static void m0(Context context, String str, boolean z9, boolean z10, boolean z11, boolean z12, long j3, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (vf.c.g(Uri.parse(str), false, null) || !z11 || "mailto".equalsIgnoreCase(scheme)) {
                                        vf.c.s(context, Uri.parse(str), j3 == 0, z10, z12 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), bVar, null, false, true, false, false);
                                        return;
                                    }
                                    String d = vf.c.d(str, z9);
                                    j2 j2Var = new j2(context, str, j3, z10, bVar);
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                                    String M0 = org.telegram.messenger.hd.M0(2131747778, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(d);
                                    textView.setTextSize(1, 14.0f);
                                    int i7 = org.telegram.ui.ActionBar.k6.j5;
                                    org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
                                    org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i7);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, f6Var);
                                    LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                    f10.addView(textView, c8.ha.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i10 = b71.f;
                                    if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                        b71 b71Var = new b71(context, f6Var);
                                        b71Var.setWebPage(webPage);
                                        f10.addView(b71Var, c8.ha.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder.o(f10);
                                    u1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747816, null), new u(j2Var, 8));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.p();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.String, org.telegram.ui.ActionBar.r1] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r52;
                                Context context = f2Var.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                l4 l4Var = new l4(context, null);
                                org.telegram.messenger.qs.i(l4Var);
                                org.telegram.ui.ActionBar.r6.V(l4Var, org.telegram.ui.ActionBar.k6.j5, null);
                                org.telegram.ui.ActionBar.r6.H(l4Var, org.telegram.ui.ActionBar.k6.Uc, null);
                                l4Var.setTextSize(1, 16.0f);
                                l4Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.G = 6;
                                alertDialog$Builder.o(frameLayout);
                                w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
                                w8Var.u(org.telegram.messenger.g0.L(18.0f));
                                l9 l9Var = new l9(context);
                                l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                frameLayout.addView(l9Var, c8.ha.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                                org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
                                k5Var.setTextSize(20);
                                k5Var.setTypeface(org.telegram.messenger.g0.o());
                                k5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                k5Var.setEllipsizeByGradient(true);
                                k5Var.l(user.first_name, false);
                                if (user.scam) {
                                    k5Var.i(org.telegram.ui.ActionBar.k6.g1);
                                } else if (user.fake) {
                                    k5Var.i(org.telegram.ui.ActionBar.k6.h1);
                                } else if (user.verified) {
                                    Drawable h = jg.g.h(context, R.drawable.verified_area);
                                    int i7 = org.telegram.ui.ActionBar.k6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.r6.y(k5Var, h, i7, null, mode);
                                    Drawable h7 = jg.g.h(context, R.drawable.verified_check);
                                    org.telegram.ui.ActionBar.r6.y(k5Var, h7, org.telegram.ui.ActionBar.k6.A9, null, mode);
                                    k5Var.i(new xp(h, h7));
                                }
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.m5, null);
                                org.telegram.messenger.camera.q.n(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new c1(user, f2Var, alertDialog$Builder, 0));
                                SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.hd.M0(2131748334, null) + "  ");
                                wp wpVar = new wp(R.drawable.attach_arrow_right, 0);
                                wpVar.n = 1;
                                wpVar.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf.setSpan(wpVar, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z9 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(k5Var, c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 21 : 76, 0.0f, z9 ? 76 : 21, 0.0f));
                                boolean z10 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 24.0f, z10 ? 76 : 21, 0.0f));
                                frameLayout.addView(l4Var, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.t10.z(user)) {
                                    w8Var.p = 0.8f;
                                    w8Var.g(12);
                                    r52 = 0;
                                    l9Var.j(null, null, w8Var, user);
                                } else {
                                    r52 = 0;
                                    w8Var.p = 1.0f;
                                    f2Var.getCurrentAccount();
                                    w8Var.r(user);
                                    l9Var.e(user, w8Var);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744916, r52), new v0(1, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r52), r52);
                                f2Var.showDialog(u1Var, false, new m0(1, runnable2));
                                l4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752896, r52), new d1(0, context, u1Var)));
                            }

                            public static void n0(org.telegram.ui.ActionBar.f2 f2Var, String str, boolean z9, boolean z10) {
                                o0(f2Var, str, z9, true, z10, false, null, null, null);
                            }

                            public static h9.f1 o(Activity activity, org.telegram.messenger.sr srVar, org.telegram.ui.ActionBar.f6 f6Var) {
                                if (activity == null) {
                                    return null;
                                }
                                h9.f1 f1Var = new h9.f1(activity, f6Var);
                                ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
                                hb0 hb0Var = new hb0(activity, f6Var);
                                hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                hb0Var.setItemCount(5);
                                hb0 hb0Var2 = new hb0(activity, f6Var);
                                hb0Var2.setItemCount(5);
                                hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                hb0 hb0Var3 = new hb0(activity, f6Var);
                                hb0Var3.setItemCount(5);
                                hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                p3 p3Var = new p3(activity, hb0Var, hb0Var2, hb0Var3, 6);
                                p3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                p3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(org.telegram.messenger.hd.M0(2131752132, null));
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, f6Var, 1, 20.0f);
                                frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new ei.b(10));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                bi.md mdVar = new bi.md(activity, 20);
                                linearLayout.addView(hb0Var, c8.ha.l(0.25f, 0, org.telegram.messenger.qs.t4));
                                hb0Var.setMinValue(1);
                                hb0Var.setMaxValue(31);
                                hb0Var.setWrapSelectorWheel(false);
                                hb0Var.setFormatter(new k2(3));
                                t1 t1Var = new t1(hb0Var, hb0Var2, hb0Var3, 2);
                                hb0Var.setOnValueChangedListener(t1Var);
                                hb0Var2.setMinValue(0);
                                hb0Var2.setMaxValue(11);
                                hb0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                                hb0Var2.setFormatter(new k2(4));
                                hb0Var2.setOnValueChangedListener(t1Var);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i7 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i10 = calendar.get(1);
                                hb0Var3.setMinValue(i7);
                                hb0Var3.setMaxValue(i10);
                                hb0Var3.setWrapSelectorWheel(false);
                                hb0Var3.setFormatter(new k2(5));
                                linearLayout.addView(hb0Var3, c8.ha.l(0.25f, 0, org.telegram.messenger.qs.t4));
                                hb0Var3.setOnValueChangedListener(t1Var);
                                hb0Var.setValue(31);
                                hb0Var2.setValue(12);
                                hb0Var3.setValue(i10);
                                b(hb0Var, hb0Var2, hb0Var3);
                                mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                mdVar.setGravity(17);
                                org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.Gi, f6Var);
                                mdVar.setTextSize(1, 14.0f);
                                mdVar.setTypeface(org.telegram.messenger.g0.o());
                                mdVar.setText(org.telegram.messenger.hd.M0(2131749064, null));
                                int L = org.telegram.messenger.g0.L(8.0f);
                                int i11 = org.telegram.ui.ActionBar.k6.Ci;
                                int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
                                int i12 = org.telegram.ui.ActionBar.k6.Ei;
                                int w03 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
                                mdVar.setBackground(k02);
                                org.telegram.ui.ActionBar.r6.k(mdVar, k02, N, N2, f6Var);
                                p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                                mdVar.setOnClickListener(new n1(hb0Var, hb0Var2, hb0Var3, calendar, srVar, f1Var, 2));
                                ((org.telegram.ui.ActionBar.v2) f1Var.b).N = p3Var;
                                return f1Var;
                            }

                            public static void o0(org.telegram.ui.ActionBar.f2 f2Var, String str, boolean z9, boolean z10, boolean z11, boolean z12, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
                                if (f2Var == null || f2Var.getParentActivity() == null) {
                                    return;
                                }
                                m0(f2Var.getParentActivity(), str, z9, z10, z11, z12, f2Var instanceof org.telegram.ui.an ? ((org.telegram.ui.an) f2Var).v8 : 0L, bVar, webPage, f6Var);
                            }

                            public static void p(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, boolean z9) {
                                String M0;
                                String a02;
                                if (f2Var.getParentActivity() == null || user == null || org.telegram.messenger.t10.x(user) || org.telegram.messenger.p10.i(f2Var.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                f2Var.getCurrentAccount();
                                Activity parentActivity = f2Var.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                if (z9) {
                                    M0 = org.telegram.messenger.hd.M0(2131743610, null);
                                    a02 = org.telegram.messenger.hd.a0("VideoCallAlert", null, 2131743611, org.telegram.messenger.t10.p(user));
                                } else {
                                    M0 = org.telegram.messenger.hd.M0(2131752631, null);
                                    a02 = org.telegram.messenger.hd.a0("CallAlert", null, 2131752632, org.telegram.messenger.t10.p(user));
                                }
                                l3 l3Var = new l3(parentActivity);
                                org.telegram.messenger.qs.i(l3Var);
                                org.telegram.ui.ActionBar.r6.V(l3Var, org.telegram.ui.ActionBar.k6.j5, null);
                                l3Var.setTextSize(1, 16.0f);
                                l3Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                l3Var.setText(org.telegram.messenger.g0.X2(a02));
                                w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
                                w8Var.u(org.telegram.messenger.g0.L(12.0f));
                                w8Var.p = 1.0f;
                                f2Var.getCurrentAccount();
                                w8Var.r(user);
                                l9 l9Var = new l9(parentActivity);
                                l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                l9Var.e(user, w8Var);
                                frameLayout.addView(l9Var, c8.ha.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(M0);
                                boolean z10 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
                                frameLayout.addView(l3Var, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.o(frameLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752634, null), new ab.j(f2Var, user, z9, 6));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                f2Var.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(Activity activity, int i7, Runnable runnable, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i10 = org.telegram.messenger.qp.s1(i7).n3;
                                if ((i10 & 1) != 0) {
                                    org.telegram.ui.Cells.f1.t(null, 2131748685, arrayList, 0, arrayList2);
                                }
                                if ((i10 & 2) != 0) {
                                    org.telegram.ui.Cells.f1.t(null, 2131748687, arrayList, 1, arrayList2);
                                }
                                if ((i10 & 4) != 0) {
                                    org.telegram.ui.Cells.f1.t(null, 2131748683, arrayList, 3, arrayList2);
                                }
                                arrayList.add(org.telegram.messenger.hd.M0(2131748686, null));
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
                                alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131748684, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.o(linearLayout);
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
                                    j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    j6Var.setTag(Integer.valueOf(i11));
                                    a(j6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, null);
                                    j6Var.b((CharSequence) arrayList.get(i11), org.telegram.messenger.iz.o0 == ((Integer) arrayList2.get(i11)).intValue());
                                    int i12 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 2, -1);
                                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                                    j6Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.r6.k(j6Var, h02, null, N, null);
                                    linearLayout.addView(j6Var);
                                    j6Var.setOnClickListener(new ah.g((Object) arrayList2, runnable, (Object) alertDialog$Builder, 18));
                                }
                                if (!z9) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                }
                                org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
                                if (z9) {
                                    p10.setCanceledOnTouchOutside(false);
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x017e, code lost:
                            
                                if (org.telegram.messenger.t3.p0(r34) == false) goto L62;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x0196, code lost:
                            
                                r8 = new org.telegram.ui.Cells.c2(1, r6, r37);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01a6, code lost:
                            
                                if (r34 == null) goto L65;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01a8, code lost:
                            
                                r11[0].e(org.telegram.messenger.hd.M0(2131751525, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01db, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
                            
                                if (org.telegram.messenger.hd.a0 == false) goto L69;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01ee, code lost:
                            
                                if (org.telegram.messenger.hd.a0 == false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01f0, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01fb, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], c8.ha.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new org.telegram.ui.Components.x0(2, r1));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01f6, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01e8, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01bd, code lost:
                            
                                r11[0].e(org.telegram.messenger.hd.a0("DeleteMessagesOptionAlso", null, 2131751526, org.telegram.messenger.t10.j(r33, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
                            
                                if (org.telegram.messenger.t3.p0(r34) == false) goto L62;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.User user, TLRPC.Chat chat, boolean z9, org.telegram.messenger.qr qrVar, org.telegram.ui.ActionBar.f6 f6Var) {
                                boolean z10;
                                if (f2Var == null || f2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = f2Var.getCurrentAccount();
                                Activity parentActivity = f2Var.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, f6Var);
                                long e10 = org.telegram.messenger.p10.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                j3 j3Var = new j3(parentActivity);
                                org.telegram.messenger.qs.i(j3Var);
                                org.telegram.ui.ActionBar.r6.V(j3Var, org.telegram.ui.ActionBar.k6.j5, null);
                                j3Var.setTextSize(1, 16.0f);
                                j3Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                k3 k3Var = new k3(parentActivity, c2VarArr);
                                alertDialog$Builder.o(k3Var);
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                k3Var.addView(textView, c8.ha.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                k3Var.addView(j3Var, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i7 == -1) {
                                    textView.setText(org.telegram.messenger.hd.a0("ClearHistory", null, 2131752089, new Object[0]));
                                    if (user != null) {
                                        j3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithUser", null, 2131754107, org.telegram.messenger.t10.p(user))));
                                    } else if (z9) {
                                        if (org.telegram.messenger.t3.V(chat)) {
                                            j3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithChannel", null, 2131754110, chat.title)));
                                            z10 = false;
                                        } else {
                                            j3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithChat", null, 2131754109, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        j3Var.setText(org.telegram.messenger.hd.M0(2131754112, null));
                                    } else {
                                        j3Var.setText(org.telegram.messenger.hd.M0(2131754114, null));
                                    }
                                    z10 = false;
                                } else {
                                    z10 = false;
                                    textView.setText(org.telegram.messenger.hd.G(i7, "DeleteDays", new Object[0]));
                                    j3Var.setText(org.telegram.messenger.hd.M0(2131751536, null));
                                }
                                boolean[] zArr = new boolean[1];
                                zArr[z10 ? 1 : 0] = z10;
                                if (chat != null && z9 && org.telegram.messenger.t3.t0(chat)) {
                                    zArr[z10 ? 1 : 0] = true;
                                }
                                if (user != null) {
                                    long j3 = user.id;
                                    if (j3 != e10) {
                                        if (j3 != 489000) {
                                        }
                                    }
                                }
                                if (chat != null) {
                                    if (z9) {
                                        if (!org.telegram.messenger.t3.t0(chat)) {
                                            if (!org.telegram.messenger.t3.V(chat)) {
                                            }
                                        }
                                    }
                                }
                                CharSequence M0 = org.telegram.messenger.hd.M0(2131751599, null);
                                if (chat != null && z9 && org.telegram.messenger.t3.t0(chat) && !org.telegram.messenger.t3.V(chat)) {
                                    M0 = org.telegram.messenger.hd.M0(2131752091, null);
                                }
                                alertDialog$Builder.k(M0, new f2(3, qrVar, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                f2Var.showDialog(u1Var);
                                TextView textView2 = (TextView) u1Var.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                            }

                            public static void q0(int i7, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
                                if (i7 == 0 || f2Var == null || f2Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var);
                                String M0 = org.telegram.messenger.hd.M0(2131743917, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                if (i7 == 1) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751088, null);
                                } else if (i7 == 2) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751100, null);
                                } else if (i7 == 3) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751094, null);
                                } else if (i7 == 4) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751087, null);
                                } else if (i7 == 5) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751099, null);
                                } else if (i7 == 6) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751093, null);
                                } else if (i7 == 7) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751091, null);
                                } else if (i7 == 8) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751092, null);
                                } else if (i7 == 9) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751083, null);
                                } else if (i7 == 10) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751095, null);
                                } else if (i7 == 11) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751084, null);
                                } else if (i7 == 12) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751096, null);
                                } else if (i7 == 13) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751081, null);
                                } else if (i7 == 14) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751082, null);
                                } else if (i7 == 15) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751089, null);
                                } else if (i7 == 16) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751090, null);
                                } else if (i7 == 17) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751101, null);
                                } else if (i7 == 18) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751102, null);
                                } else if (i7 == 19) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751097, null);
                                } else if (i7 == 20) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751098, null);
                                } else if (i7 == 21) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751085, null);
                                } else if (i7 == 22) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751086, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                f2Var.showDialog(u1Var, true, null);
                            }

                            public static void r(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, TLRPC.Chat chat, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13, org.telegram.messenger.qr qrVar) {
                                s(f2Var, z9, false, chat, user, z10, z11, z12, z13, qrVar, f2Var != null ? f2Var.getResourceProvider() : null);
                            }

                            public static org.telegram.ui.ActionBar.u1 r0(org.telegram.ui.ActionBar.f2 f2Var, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
                                if (f2Var == null) {
                                    f2Var = LaunchActivity.T();
                                }
                                if (str2 == null || f2Var == null || f2Var.getParentActivity() == null) {
                                    return null;
                                }
                                org.telegram.ui.ActionBar.u1 u1Var = L(f2Var.getParentActivity(), str, str2, null, null, f6Var).a;
                                f2Var.showDialog(u1Var);
                                return u1Var;
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
                            public static void s(final org.telegram.ui.ActionBar.f2 f2Var, final boolean z9, final boolean z10, final TLRPC.Chat chat, final TLRPC.User user, final boolean z11, final boolean z12, boolean z13, final boolean z14, final org.telegram.messenger.qr qrVar, final org.telegram.ui.ActionBar.f6 f6Var) {
                                long j3;
                                boolean z15;
                                boolean z16;
                                w8 w8Var;
                                TLRPC.Chat chat2;
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                f3 f3Var;
                                ArrayList arrayList;
                                org.telegram.ui.ActionBar.u1 u1Var;
                                w8 w8Var2;
                                float f10;
                                float f11;
                                boolean z17;
                                w8 w8Var3;
                                boolean z18;
                                boolean z19;
                                String str;
                                CharSequence M0;
                                TextView textView;
                                if (f2Var == null || f2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (chat == null && user == null) {
                                    return;
                                }
                                final int currentAccount = f2Var.getCurrentAccount();
                                final Activity parentActivity = f2Var.getParentActivity();
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, f6Var);
                                long e10 = org.telegram.messenger.p10.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                f3 f3Var2 = new f3(parentActivity);
                                org.telegram.messenger.qs.i(f3Var2);
                                org.telegram.ui.ActionBar.r6.V(f3Var2, org.telegram.ui.ActionBar.k6.j5, null);
                                f3Var2.setTextSize(1, 16.0f);
                                f3Var2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                if (!z14 && org.telegram.messenger.t3.T(chat) && org.telegram.messenger.t3.t0(chat)) {
                                    j3 = e10;
                                    z15 = true;
                                } else {
                                    j3 = e10;
                                    z15 = false;
                                }
                                g3 g3Var = new g3(parentActivity, c2VarArr2);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                                u1Var2.G = 6;
                                alertDialog$Builder.o(g3Var);
                                w8 w8Var4 = new w8((org.telegram.ui.ActionBar.f6) null);
                                w8Var4.u(org.telegram.messenger.g0.L(18.0f));
                                l9 l9Var = new l9(parentActivity);
                                l9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                                g3Var.addView(l9Var, c8.ha.d(30, 30.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                j6 j6Var = new j6(parentActivity, false, false, false);
                                org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.E8, null);
                                j6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
                                j6Var.setTypeface(org.telegram.messenger.g0.o());
                                j6Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                j6Var.setEllipsizeByGradient(true);
                                if (!z9) {
                                    z16 = z15;
                                    if (chat == null) {
                                        j6Var.setText(org.telegram.messenger.hd.M0(2131751554, null));
                                    } else if (org.telegram.messenger.t3.Y(chat)) {
                                        j6Var.setText(org.telegram.messenger.hd.M0(2131751934, null));
                                    } else if (!org.telegram.messenger.t3.T(chat)) {
                                        j6Var.setText(org.telegram.messenger.hd.M0(2131748990, null));
                                    } else if (chat.monoforum) {
                                        j6Var.setText(org.telegram.messenger.hd.M0(2131748994, null));
                                    } else if (chat.megagroup) {
                                        j6Var.setText(org.telegram.messenger.hd.M0(2131748990, null));
                                    } else {
                                        j6Var.setText(org.telegram.messenger.hd.M0(2131749003, null));
                                    }
                                } else if (z15) {
                                    z16 = z15;
                                    j6Var.setText(org.telegram.messenger.hd.M0(2131752088, null));
                                } else {
                                    z16 = z15;
                                    j6Var.setText(org.telegram.messenger.hd.M0(2131752089, null));
                                }
                                boolean z20 = org.telegram.messenger.hd.a0;
                                g3Var.addView(j6Var, c8.ha.d(-1, 24.0f, (z20 ? 5 : 3) | 48, z20 ? 22 : 65, 7.66f, z20 ? 65 : 22, 0.0f));
                                g3Var.addView(f3Var2, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.t3.p0(chat)) {
                                    w8Var = w8Var4;
                                    chat2 = f2Var.getMessagesController().v1(chat.id);
                                } else {
                                    w8Var = w8Var4;
                                    chat2 = null;
                                }
                                boolean z21 = !z11 && user != null && (user != null && !user.bot && (user.id > j3 ? 1 : (user.id == j3 ? 0 : -1)) != 0 && org.telegram.messenger.qp.s1(currentAccount).c3) && (user != null ? org.telegram.messenger.qp.s1(currentAccount).b3 : org.telegram.messenger.qp.s1(currentAccount).a3) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    c2VarArr = c2VarArr2;
                                    f3Var = f3Var2;
                                    arrayList = (ArrayList) org.telegram.messenger.qp.s1(currentAccount).R.f(user.id);
                                } else {
                                    c2VarArr = c2VarArr2;
                                    f3Var = f3Var2;
                                    arrayList = null;
                                }
                                boolean z22 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((org.telegram.messenger.ij) arrayList.get(0)).k == null || (!(((org.telegram.messenger.ij) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((org.telegram.messenger.ij) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f10 = 10.0f;
                                    if (user.bot) {
                                        w8Var2 = w8Var;
                                        f11 = 8.0f;
                                        if (user.id != 489000) {
                                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, f6Var);
                                            c2VarArr[0] = c2Var;
                                            c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                                            c2VarArr[0].e(org.telegram.messenger.hd.M0(2131753694, null), "", false, false, false);
                                            u1Var = u1Var2;
                                            c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                                            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var2.c(true, false);
                                            c2VarArr[0].setMultiline(true);
                                            g3Var.addView(c2VarArr[0], c8.ha.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            c2VarArr[0].setOnClickListener(new x0(1, zArr));
                                            w8Var3 = w8Var2;
                                            z18 = false;
                                            if (user != null) {
                                                w8 w8Var5 = w8Var3;
                                                f2Var.getCurrentAccount();
                                                w8Var5.q(chat2 != null ? chat2 : chat);
                                                l9Var.e(chat2 != null ? chat2 : chat, w8Var5);
                                            } else if (org.telegram.messenger.t10.z(user)) {
                                                w8 w8Var6 = w8Var3;
                                                w8Var6.p = 0.6f;
                                                w8Var6.g(12);
                                                l9Var.j(null, null, w8Var6, user);
                                            } else {
                                                w8 w8Var7 = w8Var3;
                                                if (user.id == j3) {
                                                    w8Var7.p = 0.6f;
                                                    w8Var7.g(1);
                                                    l9Var.j(null, null, w8Var7, user);
                                                } else {
                                                    w8Var7.p = 1.0f;
                                                    f2Var.getCurrentAccount();
                                                    w8Var7.r(user);
                                                    l9Var.e(user, w8Var7);
                                                }
                                            }
                                            if (z10) {
                                                f3 f3Var3 = f3Var;
                                                if (!z9) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z11) {
                                                            f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754087, org.telegram.messenger.t10.p(user))));
                                                        } else if (user.id == j3) {
                                                            f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754090, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754086, org.telegram.messenger.t10.p(user))));
                                                        } else {
                                                            str = null;
                                                            f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754088, org.telegram.messenger.t10.p(user))));
                                                        }
                                                    } else if (org.telegram.messenger.t3.T(chat)) {
                                                        String a02 = chat2 != null ? org.telegram.messenger.hd.a0(null, null, 2131748345, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748642, a02)));
                                                        } else {
                                                            f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131752389, a02)));
                                                        }
                                                    } else {
                                                        f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754104, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a03 = chat2 != null ? org.telegram.messenger.hd.a0(null, null, 2131748345, chat2.title) : chat.title;
                                                    if (!org.telegram.messenger.t3.T(chat) || (chat.megagroup && !org.telegram.messenger.t3.t0(chat))) {
                                                        str = null;
                                                        f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754109, a03)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        f3Var3.setText(org.telegram.messenger.hd.M0(2131754112, null));
                                                    } else {
                                                        str = null;
                                                        f3Var3.setText(org.telegram.messenger.hd.M0(2131754114, null));
                                                    }
                                                } else if (z11) {
                                                    str = null;
                                                    f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754108, org.telegram.messenger.t10.p(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j3) {
                                                        f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754111, null)));
                                                    } else {
                                                        f3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754107, org.telegram.messenger.t10.p(user))));
                                                    }
                                                }
                                            } else if (org.telegram.messenger.t10.B(user)) {
                                                str = null;
                                                f3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751582, null)));
                                            } else {
                                                f3 f3Var4 = f3Var;
                                                str = null;
                                                if (chat == null || !org.telegram.messenger.t3.V(chat)) {
                                                    f3Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751586, null)));
                                                    str = null;
                                                } else {
                                                    f3Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751585, null)));
                                                }
                                            }
                                            if (!z10) {
                                                M0 = org.telegram.messenger.hd.M0(2131751591, str);
                                            } else if (z9) {
                                                M0 = z16 ? org.telegram.messenger.hd.M0(2131752088, str) : org.telegram.messenger.hd.M0(2131752090, str);
                                            } else if (z18 && zArr[0]) {
                                                M0 = org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131752422 : 2131751531, str);
                                            } else {
                                                M0 = org.telegram.messenger.t3.T(chat) ? chat.monoforum ? org.telegram.messenger.hd.M0(2131748994, str) : chat.megagroup ? org.telegram.messenger.hd.M0(2131748989, str) : org.telegram.messenger.hd.M0(2131749001, str) : org.telegram.messenger.hd.M0(2131751554, str);
                                            }
                                            final boolean z23 = z16;
                                            org.telegram.ui.ActionBar.u1 u1Var3 = u1Var;
                                            alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.n2
                                                @Override // org.telegram.ui.ActionBar.r1
                                                public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i7) {
                                                    boolean z24 = z23;
                                                    final boolean z25 = z10;
                                                    final boolean[] zArr2 = zArr;
                                                    final org.telegram.messenger.qr qrVar2 = qrVar;
                                                    boolean z26 = true;
                                                    if (!z24 && !z25 && !z11) {
                                                        final TLRPC.User user2 = user;
                                                        boolean B = org.telegram.messenger.t10.B(user2);
                                                        final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                                                        final boolean z27 = z9;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z28 = z12;
                                                        final boolean z29 = z14;
                                                        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                                        if (B) {
                                                            v4.s(f2Var2, z27, true, chat3, user2, false, z28, zArr2[0], z29, qrVar2, f6Var2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            org.telegram.messenger.yr a04 = org.telegram.messenger.yr.a0(f2Var2.getCurrentAccount());
                                                            a04.a.c(new org.telegram.messenger.er(a04, user2.id, new org.telegram.messenger.sr() { // from class: org.telegram.ui.Components.g1
                                                                @Override // org.telegram.messenger.sr
                                                                public final void a(int i10) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    org.telegram.messenger.qr qrVar3 = qrVar2;
                                                                    if (i10 >= 50) {
                                                                        v4.s(org.telegram.ui.ActionBar.f2.this, z27, true, chat3, user2, false, z28, zArr3[0], z29, qrVar3, f6Var2);
                                                                    } else if (qrVar3 != null) {
                                                                        qrVar3.k(zArr3[0]);
                                                                    }
                                                                }
                                                            }, 0));
                                                            return;
                                                        }
                                                        if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                            h.d();
                                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                            tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.qp.i1(chat3);
                                                            final int i10 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                            d3.b bVar = new d3.b(1);
                                                            final Context context = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.v10() { // from class: org.telegram.ui.Components.h1
                                                                @Override // org.telegram.messenger.v10
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    vf.b.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    org.telegram.messenger.qr qrVar3 = qrVar2;
                                                                    if (user4 == null) {
                                                                        qrVar3.k(z25 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Context context2 = context;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    bg.l0 l0Var = new bg.l0(context2, chat4, user4, i10, qrVar3, f6Var2, 7);
                                                                    r1 r1Var = new r1(qrVar3, 0);
                                                                    org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                                                                    if (f2Var3 == null || f2Var3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context3 = f2Var3.getContext();
                                                                    TLRPC.User f12 = org.telegram.messenger.p10.i(f2Var3.getCurrentAccount()).f();
                                                                    boolean V = org.telegram.messenger.t3.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context3);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    l9 l9Var2 = new l9(context3);
                                                                    w8 w8Var8 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                    w8Var8.r(f12);
                                                                    l9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    l9Var2.e(f12, w8Var8);
                                                                    frameLayout.addView(l9Var2, c8.ha.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context3);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, f2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    h3 h3Var = new h3(context3);
                                                                    w8 w8Var9 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                    w8Var9.r(user4);
                                                                    h3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    h3Var.e(user4, w8Var9);
                                                                    frameLayout.addView(h3Var, c8.ha.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    l9 l9Var3 = new l9(context3);
                                                                    w8 w8Var10 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                    w8Var10.q(chat4);
                                                                    l9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                    l9Var3.e(chat4, w8Var10);
                                                                    frameLayout.addView(l9Var3, c8.ha.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                    org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder2.a;
                                                                    u1Var5.O0 = -1.0f;
                                                                    u1Var5.V = frameLayout;
                                                                    u1Var5.R = org.telegram.messenger.hd.M0(V ? 2131748999 : 2131748991, null);
                                                                    u1Var5.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, V ? 2131749000 : 2131748992, org.telegram.messenger.t10.p(user4), chat4.title));
                                                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131754210, null), new u(l0Var, 4));
                                                                    alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(V ? 2131749003 : 2131748989, null), new u(r1Var, 5));
                                                                    u1Var5.show();
                                                                    View d = u1Var5.d(-1);
                                                                    if (d instanceof TextView) {
                                                                        org.telegram.ui.ActionBar.r6.V((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        qrVar2 = qrVar2;
                                                    }
                                                    if (!z25 && !zArr2[0]) {
                                                        z26 = false;
                                                    }
                                                    qrVar2.k(z26);
                                                }
                                            });
                                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                            f2Var.showDialog(u1Var3);
                                            textView = (TextView) u1Var3.d(-1);
                                            if (textView == null) {
                                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        u1Var = u1Var2;
                                        if (!z10 || (((!z11 || z9) && !z21) || org.telegram.messenger.t10.x(user) || z22)) {
                                            z17 = (z12 || z9 || chat == null || !chat.creator) ? false : true;
                                            if (!z17) {
                                                w8Var3 = w8Var2;
                                                z18 = z17;
                                                if (user != null) {
                                                }
                                                if (z10) {
                                                }
                                                if (!z10) {
                                                }
                                                final boolean z232 = z16;
                                                org.telegram.ui.ActionBar.u1 u1Var32 = u1Var;
                                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.n2
                                                    @Override // org.telegram.ui.ActionBar.r1
                                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i7) {
                                                        boolean z24 = z232;
                                                        final boolean z25 = z10;
                                                        final boolean[] zArr2 = zArr;
                                                        final org.telegram.messenger.qr qrVar2 = qrVar;
                                                        boolean z26 = true;
                                                        if (!z24 && !z25 && !z11) {
                                                            final TLRPC.User user2 = user;
                                                            boolean B = org.telegram.messenger.t10.B(user2);
                                                            final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                                                            final boolean z27 = z9;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z28 = z12;
                                                            final boolean z29 = z14;
                                                            final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                                            if (B) {
                                                                v4.s(f2Var2, z27, true, chat3, user2, false, z28, zArr2[0], z29, qrVar2, f6Var2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                org.telegram.messenger.yr a04 = org.telegram.messenger.yr.a0(f2Var2.getCurrentAccount());
                                                                a04.a.c(new org.telegram.messenger.er(a04, user2.id, new org.telegram.messenger.sr() { // from class: org.telegram.ui.Components.g1
                                                                    @Override // org.telegram.messenger.sr
                                                                    public final void a(int i10) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        org.telegram.messenger.qr qrVar3 = qrVar2;
                                                                        if (i10 >= 50) {
                                                                            v4.s(org.telegram.ui.ActionBar.f2.this, z27, true, chat3, user2, false, z28, zArr3[0], z29, qrVar3, f6Var2);
                                                                        } else if (qrVar3 != null) {
                                                                            qrVar3.k(zArr3[0]);
                                                                        }
                                                                    }
                                                                }, 0));
                                                                return;
                                                            }
                                                            if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                                h.d();
                                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                                tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.qp.i1(chat3);
                                                                final int i10 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                                d3.b bVar = new d3.b(1);
                                                                final Context context = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.v10() { // from class: org.telegram.ui.Components.h1
                                                                    @Override // org.telegram.messenger.v10
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        vf.b.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        org.telegram.messenger.qr qrVar3 = qrVar2;
                                                                        if (user4 == null) {
                                                                            qrVar3.k(z25 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Context context2 = context;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        bg.l0 l0Var = new bg.l0(context2, chat4, user4, i10, qrVar3, f6Var2, 7);
                                                                        r1 r1Var = new r1(qrVar3, 0);
                                                                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                                                                        if (f2Var3 == null || f2Var3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context3 = f2Var3.getContext();
                                                                        TLRPC.User f12 = org.telegram.messenger.p10.i(f2Var3.getCurrentAccount()).f();
                                                                        boolean V = org.telegram.messenger.t3.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        l9 l9Var2 = new l9(context3);
                                                                        w8 w8Var8 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                        w8Var8.r(f12);
                                                                        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        l9Var2.e(f12, w8Var8);
                                                                        frameLayout.addView(l9Var2, c8.ha.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context3);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, f2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        h3 h3Var = new h3(context3);
                                                                        w8 w8Var9 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                        w8Var9.r(user4);
                                                                        h3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        h3Var.e(user4, w8Var9);
                                                                        frameLayout.addView(h3Var, c8.ha.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        l9 l9Var3 = new l9(context3);
                                                                        w8 w8Var10 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                        w8Var10.q(chat4);
                                                                        l9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                        l9Var3.e(chat4, w8Var10);
                                                                        frameLayout.addView(l9Var3, c8.ha.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                        org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder2.a;
                                                                        u1Var5.O0 = -1.0f;
                                                                        u1Var5.V = frameLayout;
                                                                        u1Var5.R = org.telegram.messenger.hd.M0(V ? 2131748999 : 2131748991, null);
                                                                        u1Var5.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, V ? 2131749000 : 2131748992, org.telegram.messenger.t10.p(user4), chat4.title));
                                                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131754210, null), new u(l0Var, 4));
                                                                        alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(V ? 2131749003 : 2131748989, null), new u(r1Var, 5));
                                                                        u1Var5.show();
                                                                        View d = u1Var5.d(-1);
                                                                        if (d instanceof TextView) {
                                                                            org.telegram.ui.ActionBar.r6.V((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            qrVar2 = qrVar2;
                                                        }
                                                        if (!z25 && !zArr2[0]) {
                                                            z26 = false;
                                                        }
                                                        qrVar2.k(z26);
                                                    }
                                                });
                                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                f2Var.showDialog(u1Var32);
                                                textView = (TextView) u1Var32.d(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z17 = false;
                                        }
                                        org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(1, parentActivity, f6Var);
                                        c2VarArr[0] = c2Var3;
                                        c2Var3.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                                        if (!z17) {
                                            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                                                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131751537, null), "", false, false, false);
                                            } else {
                                                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131751558, null), "", false, false, false);
                                            }
                                            z19 = true;
                                        } else if (z9) {
                                            z19 = true;
                                            c2VarArr[0].e(org.telegram.messenger.hd.a0(null, null, 2131752080, org.telegram.messenger.t10.j(user, true)), "", false, false, false);
                                        } else {
                                            z19 = true;
                                            c2VarArr[0].e(org.telegram.messenger.hd.a0(null, null, 2131751526, org.telegram.messenger.t10.j(user, true)), "", false, false, false);
                                        }
                                        c2VarArr[0].setMultiline(z19);
                                        w8Var3 = w8Var2;
                                        c2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                        g3Var.addView(c2VarArr[0], c8.ha.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        org.telegram.ui.vn vnVar = new org.telegram.ui.vn(z17, chat, alertDialog$Builder, zArr);
                                        c2VarArr[0].setOnClickListener(new org.telegram.ui.ActionBar.l1(21, zArr, vnVar));
                                        if (z13) {
                                            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var4.c(true, false);
                                            vnVar.run();
                                        }
                                        z18 = z17;
                                        if (user != null) {
                                        }
                                        if (z10) {
                                        }
                                        if (!z10) {
                                        }
                                        final boolean z2322 = z16;
                                        org.telegram.ui.ActionBar.u1 u1Var322 = u1Var;
                                        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.n2
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i7) {
                                                boolean z24 = z2322;
                                                final boolean z25 = z10;
                                                final boolean[] zArr2 = zArr;
                                                final org.telegram.messenger.qr qrVar2 = qrVar;
                                                boolean z26 = true;
                                                if (!z24 && !z25 && !z11) {
                                                    final TLRPC.User user2 = user;
                                                    boolean B = org.telegram.messenger.t10.B(user2);
                                                    final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                                                    final boolean z27 = z9;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z28 = z12;
                                                    final boolean z29 = z14;
                                                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                                    if (B) {
                                                        v4.s(f2Var2, z27, true, chat3, user2, false, z28, zArr2[0], z29, qrVar2, f6Var2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        org.telegram.messenger.yr a04 = org.telegram.messenger.yr.a0(f2Var2.getCurrentAccount());
                                                        a04.a.c(new org.telegram.messenger.er(a04, user2.id, new org.telegram.messenger.sr() { // from class: org.telegram.ui.Components.g1
                                                            @Override // org.telegram.messenger.sr
                                                            public final void a(int i10) {
                                                                boolean[] zArr3 = zArr2;
                                                                org.telegram.messenger.qr qrVar3 = qrVar2;
                                                                if (i10 >= 50) {
                                                                    v4.s(org.telegram.ui.ActionBar.f2.this, z27, true, chat3, user2, false, z28, zArr3[0], z29, qrVar3, f6Var2);
                                                                } else if (qrVar3 != null) {
                                                                    qrVar3.k(zArr3[0]);
                                                                }
                                                            }
                                                        }, 0));
                                                        return;
                                                    }
                                                    if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                        h.d();
                                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                        tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.qp.i1(chat3);
                                                        final int i10 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                        d3.b bVar = new d3.b(1);
                                                        final Context context = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.v10() { // from class: org.telegram.ui.Components.h1
                                                            @Override // org.telegram.messenger.v10
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                vf.b.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                org.telegram.messenger.qr qrVar3 = qrVar2;
                                                                if (user4 == null) {
                                                                    qrVar3.k(z25 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Context context2 = context;
                                                                TLRPC.Chat chat4 = chat3;
                                                                bg.l0 l0Var = new bg.l0(context2, chat4, user4, i10, qrVar3, f6Var2, 7);
                                                                r1 r1Var = new r1(qrVar3, 0);
                                                                org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                                                                if (f2Var3 == null || f2Var3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context3 = f2Var3.getContext();
                                                                TLRPC.User f12 = org.telegram.messenger.p10.i(f2Var3.getCurrentAccount()).f();
                                                                boolean V = org.telegram.messenger.t3.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                l9 l9Var2 = new l9(context3);
                                                                w8 w8Var8 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                w8Var8.r(f12);
                                                                l9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                l9Var2.e(f12, w8Var8);
                                                                frameLayout.addView(l9Var2, c8.ha.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context3);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, f2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                h3 h3Var = new h3(context3);
                                                                w8 w8Var9 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                w8Var9.r(user4);
                                                                h3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                h3Var.e(user4, w8Var9);
                                                                frameLayout.addView(h3Var, c8.ha.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                l9 l9Var3 = new l9(context3);
                                                                w8 w8Var10 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                                w8Var10.q(chat4);
                                                                l9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                l9Var3.e(chat4, w8Var10);
                                                                frameLayout.addView(l9Var3, c8.ha.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder2.a;
                                                                u1Var5.O0 = -1.0f;
                                                                u1Var5.V = frameLayout;
                                                                u1Var5.R = org.telegram.messenger.hd.M0(V ? 2131748999 : 2131748991, null);
                                                                u1Var5.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, V ? 2131749000 : 2131748992, org.telegram.messenger.t10.p(user4), chat4.title));
                                                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131754210, null), new u(l0Var, 4));
                                                                alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(V ? 2131749003 : 2131748989, null), new u(r1Var, 5));
                                                                u1Var5.show();
                                                                View d = u1Var5.d(-1);
                                                                if (d instanceof TextView) {
                                                                    org.telegram.ui.ActionBar.r6.V((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    qrVar2 = qrVar2;
                                                }
                                                if (!z25 && !zArr2[0]) {
                                                    z26 = false;
                                                }
                                                qrVar2.k(z26);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        f2Var.showDialog(u1Var322);
                                        textView = (TextView) u1Var322.d(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        u1Var = u1Var2;
                                        w8Var2 = w8Var;
                                    }
                                } else {
                                    u1Var = u1Var2;
                                    w8Var2 = w8Var;
                                    f10 = 10.0f;
                                }
                                f11 = 8.0f;
                                if (z10) {
                                }
                                if (z12) {
                                }
                                if (!z17) {
                                }
                                org.telegram.ui.Cells.c2 c2Var32 = new org.telegram.ui.Cells.c2(1, parentActivity, f6Var);
                                c2VarArr[0] = c2Var32;
                                c2Var32.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                                if (!z17) {
                                }
                                c2VarArr[0].setMultiline(z19);
                                w8Var3 = w8Var2;
                                c2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                g3Var.addView(c2VarArr[0], c8.ha.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                org.telegram.ui.vn vnVar2 = new org.telegram.ui.vn(z17, chat, alertDialog$Builder, zArr);
                                c2VarArr[0].setOnClickListener(new org.telegram.ui.ActionBar.l1(21, zArr, vnVar2));
                                if (z13) {
                                }
                                z18 = z17;
                                if (user != null) {
                                }
                                if (z10) {
                                }
                                if (!z10) {
                                }
                                final boolean z23222 = z16;
                                org.telegram.ui.ActionBar.u1 u1Var3222 = u1Var;
                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.n2
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i7) {
                                        boolean z24 = z23222;
                                        final boolean z25 = z10;
                                        final boolean[] zArr2 = zArr;
                                        final org.telegram.messenger.qr qrVar2 = qrVar;
                                        boolean z26 = true;
                                        if (!z24 && !z25 && !z11) {
                                            final TLRPC.User user2 = user;
                                            boolean B = org.telegram.messenger.t10.B(user2);
                                            final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                                            final boolean z27 = z9;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z28 = z12;
                                            final boolean z29 = z14;
                                            final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                            if (B) {
                                                v4.s(f2Var2, z27, true, chat3, user2, false, z28, zArr2[0], z29, qrVar2, f6Var2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                org.telegram.messenger.yr a04 = org.telegram.messenger.yr.a0(f2Var2.getCurrentAccount());
                                                a04.a.c(new org.telegram.messenger.er(a04, user2.id, new org.telegram.messenger.sr() { // from class: org.telegram.ui.Components.g1
                                                    @Override // org.telegram.messenger.sr
                                                    public final void a(int i10) {
                                                        boolean[] zArr3 = zArr2;
                                                        org.telegram.messenger.qr qrVar3 = qrVar2;
                                                        if (i10 >= 50) {
                                                            v4.s(org.telegram.ui.ActionBar.f2.this, z27, true, chat3, user2, false, z28, zArr3[0], z29, qrVar3, f6Var2);
                                                        } else if (qrVar3 != null) {
                                                            qrVar3.k(zArr3[0]);
                                                        }
                                                    }
                                                }, 0));
                                                return;
                                            }
                                            if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                h.d();
                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.qp.i1(chat3);
                                                final int i10 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                d3.b bVar = new d3.b(1);
                                                final Context context = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.v10() { // from class: org.telegram.ui.Components.h1
                                                    @Override // org.telegram.messenger.v10
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        vf.b.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        org.telegram.messenger.qr qrVar3 = qrVar2;
                                                        if (user4 == null) {
                                                            qrVar3.k(z25 || zArr2[0]);
                                                            return;
                                                        }
                                                        Context context2 = context;
                                                        TLRPC.Chat chat4 = chat3;
                                                        bg.l0 l0Var = new bg.l0(context2, chat4, user4, i10, qrVar3, f6Var2, 7);
                                                        r1 r1Var = new r1(qrVar3, 0);
                                                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                                                        if (f2Var3 == null || f2Var3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context3 = f2Var3.getContext();
                                                        TLRPC.User f12 = org.telegram.messenger.p10.i(f2Var3.getCurrentAccount()).f();
                                                        boolean V = org.telegram.messenger.t3.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        l9 l9Var2 = new l9(context3);
                                                        w8 w8Var8 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                        w8Var8.r(f12);
                                                        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        l9Var2.e(f12, w8Var8);
                                                        frameLayout.addView(l9Var2, c8.ha.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context3);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, f2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        h3 h3Var = new h3(context3);
                                                        w8 w8Var9 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                        w8Var9.r(user4);
                                                        h3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        h3Var.e(user4, w8Var9);
                                                        frameLayout.addView(h3Var, c8.ha.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        l9 l9Var3 = new l9(context3);
                                                        w8 w8Var10 = new w8((org.telegram.ui.ActionBar.f6) null);
                                                        w8Var10.q(chat4);
                                                        l9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                        l9Var3.e(chat4, w8Var10);
                                                        frameLayout.addView(l9Var3, c8.ha.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                        org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder2.a;
                                                        u1Var5.O0 = -1.0f;
                                                        u1Var5.V = frameLayout;
                                                        u1Var5.R = org.telegram.messenger.hd.M0(V ? 2131748999 : 2131748991, null);
                                                        u1Var5.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, V ? 2131749000 : 2131748992, org.telegram.messenger.t10.p(user4), chat4.title));
                                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131754210, null), new u(l0Var, 4));
                                                        alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(V ? 2131749003 : 2131748989, null), new u(r1Var, 5));
                                                        u1Var5.show();
                                                        View d = u1Var5.d(-1);
                                                        if (d instanceof TextView) {
                                                            org.telegram.ui.ActionBar.r6.V((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            qrVar2 = qrVar2;
                                        }
                                        if (!z25 && !zArr2[0]) {
                                            z26 = false;
                                        }
                                        qrVar2.k(z26);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                f2Var.showDialog(u1Var3222);
                                textView = (TextView) u1Var3222.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.u1 s0(org.telegram.ui.ActionBar.f2 f2Var, String str, CharSequence charSequence, String str2, boolean z9, Runnable runnable) {
                                TextView textView;
                                org.telegram.ui.ActionBar.u1 M = M(f2Var.getContext(), f2Var.getResourceProvider(), str, charSequence, str2, runnable);
                                f2Var.showDialog(M);
                                if (z9 && (textView = (TextView) M.d(-1)) != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                                return M;
                            }

                            public static org.telegram.ui.ActionBar.u1 t(Activity activity, final long j3, final long j10, final int i7, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
                                int i10;
                                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).d7;
                                final String v = org.telegram.messenger.dt.v(j3, j10, false);
                                if (j3 != 0) {
                                    StringBuilder sb2 = new StringBuilder("color_");
                                    sb2.append(v);
                                    i10 = sharedPreferences.contains(sb2.toString()) ? org.telegram.messenger.k5.c("color_", v, sharedPreferences, -16776961) : org.telegram.messenger.m5.z(j3) ? sharedPreferences.getInt("GroupLed", -16776961) : sharedPreferences.getInt("MessagesLed", -16776961);
                                } else {
                                    i10 = i7 == 1 ? sharedPreferences.getInt("MessagesLed", -16776961) : i7 == 0 ? sharedPreferences.getInt("GroupLed", -16776961) : i7 == 3 ? sharedPreferences.getInt("StoriesLed", -16776961) : (i7 == 5 || i7 == 4) ? sharedPreferences.getInt("ReactionsLed", -16776961) : sharedPreferences.getInt("ChannelLed", -16776961);
                                }
                                LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
                                String[] strArr = {org.telegram.messenger.hd.M0(2131752012, null), org.telegram.messenger.hd.M0(2131752017, null), org.telegram.messenger.hd.M0(2131752006, null), org.telegram.messenger.hd.M0(2131752018, null), org.telegram.messenger.hd.M0(2131752019, null), org.telegram.messenger.hd.M0(2131752020, null), org.telegram.messenger.hd.M0(2131752008, null), org.telegram.messenger.hd.M0(2131752013, null), org.telegram.messenger.hd.M0(2131752007, null)};
                                final int[] iArr = {i10};
                                for (int i11 = 0; i11 < 9; i11++) {
                                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
                                    j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    j6Var.setTag(Integer.valueOf(i11));
                                    int i12 = org.telegram.ui.Cells.t8.e[i11];
                                    j6Var.a(i12, i12);
                                    j6Var.b(strArr[i11], i10 == org.telegram.ui.Cells.t8.f[i11]);
                                    e10.addView(j6Var);
                                    j6Var.setOnClickListener(new m1(e10, iArr));
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
                                String M0 = org.telegram.messenger.hd.M0(2131748988, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                alertDialog$Builder.o(e10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745551, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.o2
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                                        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).d7.edit();
                                        long j11 = j3;
                                        int[] iArr2 = iArr;
                                        if (j11 != 0) {
                                            edit.putInt(rf.b.i("color_", v), iArr2[0]);
                                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).l(j11, j10);
                                        } else {
                                            int i14 = i7;
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
                                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).m(i14);
                                        }
                                        edit.commit();
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                        }
                                    }
                                });
                                alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131748987, null), new c4.n(j3, i7, runnable, 4));
                                if (j3 != 0) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751601, null), new f2(2, v, runnable));
                                }
                                return u1Var;
                            }

                            public static void t0(String str, org.telegram.ui.ActionBar.f2 f2Var) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((f2Var == null || f2Var.getParentActivity() == null) ? org.telegram.messenger.t0.b : f2Var.getParentActivity(), str, 1).show();
                            }

                            public static void u(org.telegram.ui.ActionBar.f2 f2Var, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                                String M0 = org.telegram.messenger.hd.M0(2131751788, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.hd.a0("ContactNotRegistered", null, 2131751789, org.telegram.messenger.g5.m(0, str, str2));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749173, null), new ni.c(29, str3, f2Var));
                                f2Var.showDialog(u1Var);
                            }

                            public static org.telegram.ui.ActionBar.u1 u0(Context context, String str, boolean z9) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = str;
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                if (z9) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131743822, null), new k0(context, 1));
                                }
                                return alertDialog$Builder.p();
                            }

                            public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.sr srVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i7 = org.telegram.ui.ActionBar.k6.L5;
                                final int i10 = 0;
                                alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.k6.x0(null, i7, false), null);
                                alertDialog$Builder.n(i7, null);
                                alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751774, null));
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751773, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.q2
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i11) {
                                        switch (i10) {
                                            case 0:
                                                srVar.a(1);
                                                break;
                                            default:
                                                srVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                final int i11 = 1;
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.q2
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i112) {
                                        switch (i11) {
                                            case 0:
                                                srVar.a(1);
                                                break;
                                            default:
                                                srVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, hb0Var2.getValue());
                                calendar.set(1, hb0Var3.getValue());
                                hb0Var.setMinValue(1);
                                hb0Var.setMaxValue(calendar.getActualMaximum(5));
                            }

                            public static AlertDialog$Builder w(Context context, int i7, int i10, int i11, int i12, int i13, int i14, String str, final boolean z9, jg.a2 a2Var) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final hb0 hb0Var = new hb0(context, null);
                                final hb0 hb0Var2 = new hb0(context, null);
                                final hb0 hb0Var3 = new hb0(context, null);
                                linearLayout.addView(hb0Var2, c8.ha.l(0.3f, 0, -2));
                                final int i15 = 0;
                                hb0Var2.setOnScrollListener(new eb0() { // from class: org.telegram.ui.Components.s1
                                    @Override // org.telegram.ui.Components.eb0
                                    public final void d(int i16) {
                                        switch (i15) {
                                            case 0:
                                                if (z9 && i16 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z9 && i16 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z9 && i16 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                hb0Var.setMinValue(0);
                                hb0Var.setMaxValue(11);
                                linearLayout.addView(hb0Var, c8.ha.l(0.3f, 0, -2));
                                hb0Var.setFormatter(new org.telegram.ui.zq(13));
                                hb0Var.setOnValueChangedListener(new t1(hb0Var2, hb0Var, hb0Var3, 0));
                                final int i16 = 1;
                                hb0Var.setOnScrollListener(new eb0() { // from class: org.telegram.ui.Components.s1
                                    @Override // org.telegram.ui.Components.eb0
                                    public final void d(int i162) {
                                        switch (i16) {
                                            case 0:
                                                if (z9 && i162 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z9 && i162 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z9 && i162 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i17 = calendar.get(1);
                                hb0Var3.setMinValue(i7 + i17);
                                hb0Var3.setMaxValue(i10 + i17);
                                hb0Var3.setValue(i17 + i11);
                                linearLayout.addView(hb0Var3, c8.ha.l(0.4f, 0, -2));
                                hb0Var3.setOnValueChangedListener(new t1(hb0Var2, hb0Var, hb0Var3, 1));
                                final int i18 = 2;
                                hb0Var3.setOnScrollListener(new eb0() { // from class: org.telegram.ui.Components.s1
                                    @Override // org.telegram.ui.Components.eb0
                                    public final void d(int i162) {
                                        switch (i18) {
                                            case 0:
                                                if (z9 && i162 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z9 && i162 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z9 && i162 == 0) {
                                                    v4.d(hb0Var2, hb0Var, hb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                v0(hb0Var2, hb0Var, hb0Var3);
                                if (z9) {
                                    d(hb0Var2, hb0Var, hb0Var3);
                                }
                                if (i12 != -1) {
                                    hb0Var2.setValue(i12);
                                    hb0Var.setValue(i13);
                                    hb0Var3.setValue(i14);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.R = str;
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745551, null), new org.telegram.ui.yl(z9, hb0Var2, hb0Var, hb0Var3, a2Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                return alertDialog$Builder;
                            }

                            public static void x(Context context, String str, String str2, long j3, t4 t4Var) {
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
                                h9.f1 f1Var = new h9.f1(context, (org.telegram.ui.ActionBar.f6) null);
                                ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
                                hb0 hb0Var = new hb0(context, null);
                                hb0Var.setTextColor(x02);
                                hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                hb0Var.setItemCount(5);
                                u3 u3Var = new u3(context, null);
                                u3Var.setItemCount(5);
                                u3Var.setTextColor(x02);
                                u3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                v3 v3Var = new v3(context, null);
                                v3Var.setItemCount(5);
                                v3Var.setTextColor(x02);
                                v3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                                hb0 hb0Var2 = hb0Var;
                                p3 p3Var = new p3(context, hb0Var2, u3Var, v3Var, 2);
                                p3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                p3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                textView.setTextColor(x02);
                                textView.setTextSize(1, 20.0f);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new ei.b(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                bi.md mdVar = new bi.md(context, 15);
                                linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                                hb0Var2.setMinValue(0);
                                hb0Var2.setMaxValue(365);
                                hb0Var2.setWrapSelectorWheel(false);
                                hb0Var2.setFormatter(new org.telegram.ui.zq(16));
                                a3.h hVar = new a3.h(hb0Var2, u3Var, v3Var, 20);
                                hb0Var2.setOnValueChangedListener(hVar);
                                u3Var.setMinValue(0);
                                u3Var.setMaxValue(23);
                                linearLayout.addView(u3Var, c8.ha.l(0.2f, 0, org.telegram.messenger.qs.t4));
                                u3Var.setFormatter(new org.telegram.ui.zq(17));
                                u3Var.setOnValueChangedListener(hVar);
                                v3Var.setMinValue(0);
                                v3Var.setMaxValue(59);
                                v3Var.setValue(0);
                                v3Var.setFormatter(new org.telegram.ui.zq(18));
                                linearLayout.addView(v3Var, c8.ha.l(0.3f, 0, org.telegram.messenger.qs.t4));
                                v3Var.setOnValueChangedListener(hVar);
                                if (j3 > 0 && j3 != 2147483646) {
                                    long j10 = j3 * 1000;
                                    calendar.setTimeInMillis(System.currentTimeMillis());
                                    calendar.set(12, 0);
                                    calendar.set(13, 0);
                                    calendar.set(14, 0);
                                    calendar.set(11, 0);
                                    int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                                    calendar.setTimeInMillis(j10);
                                    if (timeInMillis >= 0) {
                                        v3Var.setValue(calendar.get(12));
                                        u3Var.setValue(calendar.get(11));
                                        hb0Var2 = hb0Var2;
                                        hb0Var2.setValue(timeInMillis);
                                    } else {
                                        hb0Var2 = hb0Var2;
                                    }
                                }
                                g(null, null, 0L, 0L, 0, hb0Var2, u3Var, v3Var);
                                mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                mdVar.setGravity(17);
                                mdVar.setTextColor(x04);
                                mdVar.setTextSize(1, 14.0f);
                                mdVar.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x05, x06, x06));
                                mdVar.setText(str2);
                                p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                                mdVar.setOnClickListener(new n1(hb0Var2, u3Var, v3Var, calendar, t4Var, f1Var, 1));
                                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
                                v2Var.N = p3Var;
                                v2Var.show();
                                v2Var.v0(x03);
                                v2Var.O(x03);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:415:0x020d, code lost:
                            
                                if (java.lang.Math.abs(r11 - r0.k.date) > 86400) goto L95;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:154:0x06d4  */
                            /* JADX WARN: Removed duplicated region for block: B:158:0x0724  */
                            /* JADX WARN: Removed duplicated region for block: B:161:0x07fd  */
                            /* JADX WARN: Removed duplicated region for block: B:172:0x08a0  */
                            /* JADX WARN: Removed duplicated region for block: B:176:0x0971  */
                            /* JADX WARN: Removed duplicated region for block: B:179:0x097f  */
                            /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:182:0x08de  */
                            /* JADX WARN: Removed duplicated region for block: B:195:0x083d  */
                            /* JADX WARN: Removed duplicated region for block: B:223:0x073c  */
                            /* JADX WARN: Removed duplicated region for block: B:258:0x06fd  */
                            /* JADX WARN: Type inference failed for: r8v38 */
                            /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.String, org.telegram.ui.ActionBar.f6, org.telegram.ui.ActionBar.r1] */
                            /* JADX WARN: Type inference failed for: r8v41 */
                            /* JADX WARN: Type inference failed for: r8v65 */
                            /* JADX WARN: Type inference failed for: r8v66 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void y(final org.telegram.ui.ActionBar.f2 f2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j3, final org.telegram.messenger.ij ijVar, final SparseArray[] sparseArrayArr, final org.telegram.messenger.dj djVar, final int i7, final int i10, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.f6 f6Var) {
                                Activity parentActivity;
                                boolean z9;
                                long j10;
                                boolean z10;
                                boolean z11;
                                boolean z12;
                                int i11;
                                int i12;
                                boolean z13;
                                boolean z14;
                                boolean z15;
                                boolean z16;
                                int i13;
                                org.telegram.ui.ActionBar.u1 u1Var;
                                int i14;
                                boolean z17;
                                boolean z18;
                                boolean z19;
                                org.telegram.ui.Cells.c2 c2Var;
                                String str;
                                int i15;
                                int i16;
                                TLRPC.MessageAction messageAction;
                                final boolean z20;
                                int i17;
                                org.telegram.ui.ActionBar.u1 u1Var2;
                                String str2;
                                boolean z21;
                                String str3;
                                ?? r82;
                                AlertDialog$Builder alertDialog$Builder;
                                TextView textView;
                                TextView textView2;
                                int i18;
                                int i19;
                                boolean z22;
                                TLRPC.MessageAction messageAction2;
                                int i20;
                                int i21;
                                final int i22;
                                TLRPC.Message message;
                                int i23;
                                org.telegram.messenger.ij ijVar2 = ijVar;
                                boolean z23 = i10 == 1;
                                boolean z24 = i10 == 3;
                                if (f2Var == null) {
                                    return;
                                }
                                if ((user == null && chat == null && encryptedChat == null) || (parentActivity = f2Var.getParentActivity()) == null) {
                                    return;
                                }
                                final int currentAccount = f2Var.getCurrentAccount();
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, f6Var);
                                float f10 = runnable2 != null ? 0.5f : 0.6f;
                                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                                u1Var3.Q0 = f10;
                                int size = djVar != null ? djVar.d.size() : ijVar2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                if (encryptedChat != null) {
                                    z9 = z24;
                                    j10 = org.telegram.messenger.m5.F(encryptedChat.id);
                                } else {
                                    z9 = z24;
                                    j10 = user != null ? user.id : -chat.id;
                                }
                                if (z23) {
                                    if (ijVar2 == null || (message = ijVar2.k) == null || (i23 = message.schedule_repeat_period) <= 0) {
                                        if (djVar != null) {
                                            ArrayList arrayList = djVar.d;
                                            if (!arrayList.isEmpty() && arrayList.get(0) != null && ((org.telegram.messenger.ij) arrayList.get(0)).k != null && ((org.telegram.messenger.ij) arrayList.get(0)).k.schedule_repeat_period > 0) {
                                                int i24 = ((org.telegram.messenger.ij) arrayList.get(0)).k.date;
                                                i22 = ((org.telegram.messenger.ij) arrayList.get(0)).k.schedule_repeat_period;
                                                i21 = i24;
                                            }
                                        }
                                        i21 = 0;
                                        i22 = 0;
                                    } else {
                                        i21 = message.date;
                                        i22 = i23;
                                    }
                                    if (i21 > 0 && i22 > 0) {
                                        String a02 = org.telegram.messenger.hd.a0(null, null, 2131748516, Integer.valueOf(i22));
                                        if (i22 == 31536000) {
                                            a02 = org.telegram.messenger.hd.M0(2131748512, null);
                                        } else if (i22 >= 2592000) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                        } else if (i22 >= 604800) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                        } else if (i22 >= 86400) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                        }
                                        String str4 = a02;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, parentActivity, f6Var);
                                        String M0 = org.telegram.messenger.hd.M0(2131748510, null);
                                        org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder3.a;
                                        u1Var4.R = M0;
                                        u1Var4.T = org.telegram.messenger.hd.M0(2131748511, null);
                                        final int i25 = i21;
                                        alertDialog$Builder3.h(str4, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.d3
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var5, int i26) {
                                                org.telegram.messenger.dj djVar2 = org.telegram.messenger.dj.this;
                                                int i27 = currentAccount;
                                                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                                                int i28 = i25;
                                                int i29 = i22;
                                                if (djVar2 != null) {
                                                    ArrayList arrayList2 = djVar2.d;
                                                    if (!arrayList2.isEmpty()) {
                                                        org.telegram.messenger.gz.C(i27).u((org.telegram.messenger.ij) arrayList2.get(0), f2Var2, i28 + i29, i29);
                                                        return;
                                                    }
                                                }
                                                org.telegram.messenger.gz.C(i27).u(ijVar, f2Var2, i28 + i29, i29);
                                            }
                                        });
                                        final long j11 = j10;
                                        final boolean z25 = z9;
                                        alertDialog$Builder3.i(org.telegram.messenger.hd.M0(2131748523, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.l0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var5, int i26) {
                                                SparseArray[] sparseArrayArr2;
                                                ArrayList arrayList2;
                                                int i27;
                                                long j12;
                                                ArrayList arrayList3;
                                                TLRPC.Peer peer;
                                                int i28;
                                                long j13;
                                                ArrayList arrayList4;
                                                boolean z26 = z25;
                                                int i29 = currentAccount;
                                                long e10 = z26 ? org.telegram.messenger.p10.i(i29).e() : j11;
                                                org.telegram.messenger.ij ijVar3 = ijVar;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j14 = j3;
                                                int i30 = i7;
                                                int i31 = i10;
                                                ArrayList arrayList5 = null;
                                                if (ijVar3 != null) {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    org.telegram.messenger.dj djVar2 = djVar;
                                                    if (djVar2 != null) {
                                                        ArrayList arrayList7 = djVar2.d;
                                                        int i32 = 0;
                                                        while (i32 < arrayList7.size()) {
                                                            org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) arrayList7.get(i32);
                                                            arrayList6.add(Integer.valueOf(ijVar4.f1()));
                                                            if (encryptedChat2 != null) {
                                                                arrayList4 = arrayList6;
                                                                if (ijVar4.k.random_id == 0 || ijVar4.D == 10) {
                                                                    i28 = i29;
                                                                    j13 = e10;
                                                                } else {
                                                                    if (arrayList5 == null) {
                                                                        arrayList5 = new ArrayList();
                                                                    }
                                                                    ArrayList arrayList8 = arrayList5;
                                                                    i28 = i29;
                                                                    j13 = e10;
                                                                    arrayList8.add(Long.valueOf(ijVar4.k.random_id));
                                                                    arrayList5 = arrayList8;
                                                                }
                                                            } else {
                                                                i28 = i29;
                                                                j13 = e10;
                                                                arrayList4 = arrayList6;
                                                            }
                                                            i32++;
                                                            arrayList6 = arrayList4;
                                                            i29 = i28;
                                                            e10 = j13;
                                                        }
                                                        i27 = i29;
                                                        j12 = e10;
                                                    } else {
                                                        i27 = i29;
                                                        j12 = e10;
                                                        arrayList6.add(Integer.valueOf(ijVar3.f1()));
                                                        if (encryptedChat2 != null && ijVar3.k.random_id != 0 && ijVar3.D != 10) {
                                                            ArrayList arrayList9 = new ArrayList();
                                                            arrayList9.add(Long.valueOf(ijVar3.k.random_id));
                                                            arrayList3 = arrayList9;
                                                            org.telegram.messenger.qp.s1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j14 == 0 && (peer = ijVar3.k.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i30, true, i31);
                                                        }
                                                    }
                                                    arrayList3 = arrayList5;
                                                    org.telegram.messenger.qp.s1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j14 == 0 && (peer = ijVar3.k.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i30, true, i31);
                                                } else {
                                                    long j15 = e10;
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
                                                                org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) sparseArrayArr2[i33].valueAt(i35);
                                                                long j16 = ijVar5.k.random_id;
                                                                if (j16 != 0 && ijVar5.D != 10) {
                                                                    arrayList11.add(Long.valueOf(j16));
                                                                }
                                                            }
                                                            arrayList2 = arrayList11;
                                                        } else {
                                                            arrayList2 = null;
                                                        }
                                                        org.telegram.messenger.qp.s1(i29).Z(arrayList10, arrayList2, encryptedChat2, (i33 != 1 || j14 == 0) ? j15 : j14, i30, true, i31);
                                                        sparseArrayArr2[i33].clear();
                                                        i33--;
                                                    }
                                                }
                                                Runnable runnable3 = runnable;
                                                if (runnable3 != null) {
                                                    runnable3.run();
                                                }
                                            }
                                        });
                                        alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        alertDialog$Builder3.d(-2);
                                        alertDialog$Builder3.d(-3);
                                        u1Var4.N = new m0(0, runnable2);
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                    ijVar2 = ijVar;
                                }
                                Runnable runnable3 = runnable2;
                                final int i26 = currentAccount;
                                int currentTime = ConnectionsManager.getInstance(i26).getCurrentTime();
                                org.telegram.messenger.qp.s1(i26).x7.i.M1(TimeUnit.SECONDS);
                                if (ijVar2 != null) {
                                    z11 = !ijVar2.U2() || Math.abs(currentTime - ijVar2.k.date) > 86400;
                                    if (ijVar2.R3()) {
                                        TLRPC.Message message2 = ijVar2.k;
                                        z12 = message2.paid_suggested_post_stars;
                                        z10 = message2.paid_suggested_post_ton;
                                    } else {
                                        z12 = false;
                                        z10 = false;
                                    }
                                } else {
                                    int i27 = 0;
                                    z10 = false;
                                    boolean z26 = false;
                                    boolean z27 = false;
                                    while (i27 < 2) {
                                        int i28 = 0;
                                        while (true) {
                                            i11 = i27;
                                            if (i28 < sparseArrayArr[i27].size()) {
                                                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) sparseArrayArr[i11].valueAt(i28);
                                                if (ijVar3.U2()) {
                                                    i12 = i28;
                                                } else {
                                                    i12 = i28;
                                                }
                                                z26 = true;
                                                if (ijVar3.R3()) {
                                                    TLRPC.Message message3 = ijVar3.k;
                                                    z27 |= message3.paid_suggested_post_stars;
                                                    z10 |= message3.paid_suggested_post_ton;
                                                }
                                                i28 = i12 + 1;
                                                i27 = i11;
                                            }
                                        }
                                        i27 = i11 + 1;
                                    }
                                    z11 = z26;
                                    z12 = z27;
                                }
                                if (djVar != null) {
                                    ArrayList arrayList2 = djVar.d;
                                    z14 = z12;
                                    z13 = z11;
                                    int i29 = 0;
                                    while (i29 < arrayList2.size()) {
                                        org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) arrayList2.get(i29);
                                        if (ijVar4.R3()) {
                                            TLRPC.Message message4 = ijVar4.k;
                                            i20 = i29;
                                            z14 |= message4.paid_suggested_post_stars;
                                            z10 = message4.paid_suggested_post_ton | z10;
                                        } else {
                                            i20 = i29;
                                        }
                                        i29 = i20 + 1;
                                    }
                                } else {
                                    z13 = z11;
                                    z14 = z12;
                                }
                                final boolean[] zArr = new boolean[1];
                                boolean z28 = user != null && org.telegram.messenger.qp.s1(i26).c3;
                                int i30 = user != null ? org.telegram.messenger.qp.s1(i26).b3 : org.telegram.messenger.qp.s1(i26).a3;
                                if (encryptedChat == null && user != null && z28) {
                                    z15 = z28;
                                    if (i30 == Integer.MAX_VALUE) {
                                        z16 = true;
                                        if (chat != null || !chat.megagroup || z23 || z9) {
                                            i13 = i26;
                                            if (!z23 || z9 || org.telegram.messenger.t3.T(chat) || encryptedChat != null) {
                                                u1Var = u1Var3;
                                                i14 = 0;
                                                z17 = false;
                                            } else {
                                                if ((user == null || user.id == org.telegram.messenger.p10.i(i13).e() || (user.bot && !user.support)) && chat == null) {
                                                    i14 = 0;
                                                    z19 = false;
                                                } else if (ijVar2 != null) {
                                                    i14 = (ijVar2.o4() || !((messageAction = ijVar2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(ijVar2.O3() || z15 || org.telegram.messenger.t3.N(chat)) || currentTime - ijVar2.k.date > i30)) ? 0 : 1;
                                                    z19 = !ijVar2.O3();
                                                } else {
                                                    int i31 = 1;
                                                    z19 = false;
                                                    int i32 = 0;
                                                    while (i31 >= 0) {
                                                        int i33 = 0;
                                                        while (true) {
                                                            i16 = i31;
                                                            if (i33 < sparseArrayArr[i31].size()) {
                                                                org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) sparseArrayArr[i16].valueAt(i33);
                                                                int i34 = i33;
                                                                TLRPC.MessageAction messageAction3 = ijVar5.k.action;
                                                                boolean z29 = z19;
                                                                if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((ijVar5.O3() || z15 || (chat != null && org.telegram.messenger.t3.w(2, chat))) && currentTime - ijVar5.k.date <= i30)) {
                                                                    i32++;
                                                                    if (!z29 && !ijVar5.O3()) {
                                                                        z19 = true;
                                                                        i33 = i34 + 1;
                                                                        i31 = i16;
                                                                    }
                                                                }
                                                                z19 = z29;
                                                                i33 = i34 + 1;
                                                                i31 = i16;
                                                            }
                                                        }
                                                        i31 = i16 - 1;
                                                    }
                                                    i14 = i32;
                                                }
                                                if (i14 <= 0 || !z13 || (user != null && org.telegram.messenger.t10.x(user))) {
                                                    u1Var = u1Var3;
                                                    z17 = z19;
                                                } else {
                                                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                                                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(1, parentActivity, f6Var);
                                                    c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                                    if (z16) {
                                                        c2Var = c2Var2;
                                                        c2Var.e(org.telegram.messenger.hd.a0("DeleteMessagesOptionAlso", null, 2131751526, org.telegram.messenger.t10.j(user, true)), "", false, false, false);
                                                    } else {
                                                        c2Var = c2Var2;
                                                        if (chat == null) {
                                                            str = null;
                                                            i15 = 2131751527;
                                                        } else if (z19 || i14 == size) {
                                                            c2Var.e(org.telegram.messenger.hd.M0(2131751541, null), "", false, false, false);
                                                        } else {
                                                            i15 = 2131751527;
                                                            str = null;
                                                        }
                                                        c2Var.e(org.telegram.messenger.hd.M0(i15, str), "", false, false, false);
                                                    }
                                                    org.telegram.ui.Cells.c2 c2Var3 = c2Var;
                                                    c2Var3.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    frameLayout.addView(c2Var3, c8.ha.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                    c2Var3.setOnClickListener(new x0(5, zArr));
                                                    alertDialog$Builder2.o(frameLayout);
                                                    u1Var3.G = 9;
                                                    u1Var = u1Var3;
                                                    z17 = z19;
                                                    z18 = true;
                                                }
                                            }
                                            z18 = false;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            if (ijVar2 != null) {
                                                TLRPC.MessageAction messageAction4 = ijVar2.k.action;
                                                if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                                                    if (djVar != null) {
                                                        arrayList3.addAll(djVar.d);
                                                    } else {
                                                        arrayList3.add(ijVar2);
                                                    }
                                                }
                                                i18 = (!ijVar2.o4() && org.telegram.messenger.ij.B0(ijVar2.k) == j3 && ((messageAction2 = ijVar2.k.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && ijVar2.O3() && currentTime - ijVar2.k.date <= i30) ? 1 : 0;
                                            } else {
                                                int i35 = 1;
                                                int i36 = 0;
                                                while (i35 >= 0) {
                                                    int i37 = i36;
                                                    int i38 = 0;
                                                    while (i38 < sparseArrayArr[i35].size()) {
                                                        org.telegram.messenger.ij ijVar6 = (org.telegram.messenger.ij) sparseArrayArr[i35].valueAt(i38);
                                                        int i39 = i38;
                                                        if (i35 == 1 && ijVar6.O3()) {
                                                            TLRPC.Message message5 = ijVar6.k;
                                                            i19 = i35;
                                                            if (message5.action == null && currentTime - message5.date <= i30) {
                                                                i37++;
                                                            }
                                                        } else {
                                                            i19 = i35;
                                                        }
                                                        arrayList3.add(ijVar6);
                                                        i38 = i39 + 1;
                                                        i35 = i19;
                                                    }
                                                    i35--;
                                                    i36 = i37;
                                                }
                                                i18 = i36;
                                            }
                                            int i40 = i18;
                                            ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new aa.m(5)).mapToLong(new org.telegram.messenger.sk(3)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.n0
                                                @Override // java.util.function.LongFunction
                                                public final Object apply(long j12) {
                                                    int i41 = i26;
                                                    return j12 > 0 ? org.telegram.messenger.qp.s1(i41).a2(Long.valueOf(j12)) : org.telegram.messenger.qp.s1(i41).M0(Long.valueOf(-j12));
                                                }
                                            }).filter(new aa.m(6)).filter(new org.telegram.ui.o8(org.telegram.messenger.p10.i(i26).e(), 2)).collect(Collectors.toCollection(new org.telegram.messenger.ok(1)));
                                            if (!arrayList4.isEmpty()) {
                                                if (channelParticipantArr != null) {
                                                    lr lrVar = new lr(f2Var, chat, arrayList3, arrayList4, channelParticipantArr, j3, i7, i10, false, runnable);
                                                    if (runnable3 != null) {
                                                        lrVar.H0 = new m0(2, runnable3);
                                                    }
                                                    lrVar.show();
                                                    return;
                                                }
                                                final org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, parentActivity, null)};
                                                final int size2 = arrayList4.size();
                                                final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                                                final int[] iArr = new int[size2];
                                                int[] iArr2 = new int[1];
                                                final int i41 = 0;
                                                while (i41 < size2) {
                                                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                                                    tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(chat);
                                                    tL_channels_getParticipant.participant = org.telegram.messenger.qp.k1((TLObject) arrayList4.get(i41));
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i26);
                                                    ArrayList arrayList5 = arrayList4;
                                                    final int[] iArr3 = iArr2;
                                                    final Runnable runnable4 = runnable3;
                                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.o0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            final int[] iArr4 = iArr3;
                                                            final int[] iArr5 = iArr;
                                                            final int i42 = i41;
                                                            final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                                            final int i43 = size2;
                                                            final org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                                                            final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                                                            final TLRPC.User user2 = user;
                                                            final TLRPC.Chat chat2 = chat;
                                                            final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                            final TLRPC.ChatFull chatFull2 = chatFull;
                                                            final long j12 = j3;
                                                            final org.telegram.messenger.ij ijVar7 = ijVar;
                                                            final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                                            final org.telegram.messenger.dj djVar2 = djVar;
                                                            final int i44 = i7;
                                                            final int i45 = i10;
                                                            final Runnable runnable5 = runnable;
                                                            final Runnable runnable6 = runnable4;
                                                            final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.q1
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    org.telegram.ui.ActionBar.u1[] u1VarArr3 = u1VarArr2;
                                                                    int[] iArr6 = iArr4;
                                                                    iArr6[0] = iArr6[0] + 1;
                                                                    int[] iArr7 = iArr5;
                                                                    int i46 = i42;
                                                                    iArr7[i46] = 0;
                                                                    TLObject tLObject2 = tLObject;
                                                                    TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                                                    if (tLObject2 != null) {
                                                                        channelParticipantArr4[i46] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                                    }
                                                                    if (iArr6[0] == i43) {
                                                                        try {
                                                                            u1VarArr3[0].dismiss();
                                                                        } catch (Throwable unused) {
                                                                        }
                                                                        u1VarArr3[0] = null;
                                                                        v4.y(f2Var2, user2, chat2, encryptedChat2, chatFull2, j12, ijVar7, sparseArrayArr2, djVar2, i44, i45, channelParticipantArr4, runnable5, runnable6, f6Var2);
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    };
                                                    int i42 = i41;
                                                    iArr[i42] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                                                    runnable3 = runnable2;
                                                    size2 = size2;
                                                    iArr2 = iArr3;
                                                    i41 = i42 + 1;
                                                    i26 = i26;
                                                    arrayList4 = arrayList5;
                                                }
                                                org.telegram.messenger.g0.i3(new bi.ub(u1VarArr, iArr, i26, runnable2, f2Var, 15), 1000L);
                                                return;
                                            }
                                            i13 = i26;
                                            if (i40 <= 0 || !z13) {
                                                z22 = false;
                                            } else {
                                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                                org.telegram.ui.Cells.c2 c2Var4 = new org.telegram.ui.Cells.c2(1, parentActivity, f6Var);
                                                c2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                                                c2Var4.e(org.telegram.messenger.hd.M0(2131751527, null), "", false, false, false);
                                                c2Var4.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                frameLayout2.addView(c2Var4, c8.ha.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                c2Var4.setOnClickListener(new x0(4, zArr));
                                                alertDialog$Builder2.o(frameLayout2);
                                                u1Var3.G = 9;
                                                z22 = true;
                                            }
                                            u1Var = u1Var3;
                                            z18 = z22;
                                            i14 = i40;
                                            z17 = false;
                                        }
                                        org.telegram.ui.ActionBar.u1 u1Var5 = u1Var;
                                        int i43 = i14;
                                        final long j12 = j10;
                                        int i44 = size;
                                        boolean z30 = z10;
                                        final int i45 = i13;
                                        z20 = z9;
                                        org.telegram.ui.ActionBar.r1 r1Var = new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.e3
                                            /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                            /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                            /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                            /* JADX WARN: Type inference failed for: r3v13 */
                                            /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
                                            /* JADX WARN: Type inference failed for: r3v15 */
                                            @Override // org.telegram.ui.ActionBar.r1
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var6, int i46) {
                                                SparseArray[] sparseArrayArr2;
                                                ArrayList arrayList6;
                                                int i47;
                                                long j13;
                                                char c10;
                                                ArrayList arrayList7;
                                                ?? r32;
                                                ArrayList arrayList8;
                                                long j14;
                                                int i48;
                                                int size3;
                                                int i49;
                                                long j15;
                                                TLRPC.Peer peer;
                                                long j16;
                                                boolean z31 = z20;
                                                int i50 = i45;
                                                long e10 = z31 ? org.telegram.messenger.p10.i(i50).e() : j12;
                                                org.telegram.messenger.ij ijVar7 = ijVar;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j17 = j3;
                                                int i51 = i7;
                                                boolean[] zArr2 = zArr;
                                                int i52 = i10;
                                                ArrayList arrayList9 = null;
                                                if (ijVar7 != null) {
                                                    ArrayList arrayList10 = new ArrayList();
                                                    ArrayList arrayList11 = new ArrayList();
                                                    org.telegram.messenger.dj djVar2 = djVar;
                                                    if (djVar2 != null) {
                                                        ArrayList arrayList12 = djVar2.d;
                                                        c10 = 0;
                                                        int i53 = 0;
                                                        while (i53 < arrayList12.size()) {
                                                            org.telegram.messenger.ij ijVar8 = (org.telegram.messenger.ij) arrayList12.get(i53);
                                                            int i54 = i50;
                                                            if (org.telegram.messenger.ij.d3(ijVar8.k)) {
                                                                arrayList10.add(ijVar8);
                                                            } else {
                                                                arrayList11.add(Integer.valueOf(ijVar8.f1()));
                                                                if (encryptedChat2 != null) {
                                                                    j16 = e10;
                                                                    if (ijVar8.k.random_id != 0 && ijVar8.D != 10) {
                                                                        if (arrayList9 == null) {
                                                                            arrayList9 = new ArrayList();
                                                                        }
                                                                        ArrayList arrayList13 = arrayList9;
                                                                        arrayList13.add(Long.valueOf(ijVar8.k.random_id));
                                                                        arrayList9 = arrayList13;
                                                                    }
                                                                    i53++;
                                                                    e10 = j16;
                                                                    i50 = i54;
                                                                }
                                                            }
                                                            j16 = e10;
                                                            i53++;
                                                            e10 = j16;
                                                            i50 = i54;
                                                        }
                                                        i47 = i50;
                                                        j13 = e10;
                                                    } else {
                                                        i47 = i50;
                                                        j13 = e10;
                                                        c10 = 0;
                                                        if (org.telegram.messenger.ij.d3(ijVar7.k)) {
                                                            arrayList10.add(ijVar7);
                                                        } else {
                                                            arrayList11.add(Integer.valueOf(ijVar7.f1()));
                                                            if (encryptedChat2 != null && ijVar7.k.random_id != 0 && ijVar7.D != 10) {
                                                                ArrayList arrayList14 = new ArrayList();
                                                                arrayList14.add(Long.valueOf(ijVar7.k.random_id));
                                                                arrayList7 = arrayList14;
                                                                long j18 = (j17 == 0 && (peer = ijVar7.k.peer_id) != null && peer.chat_id == (-j17)) ? j17 : j13;
                                                                if (arrayList11.isEmpty()) {
                                                                    r32 = c10;
                                                                    arrayList8 = arrayList10;
                                                                    j14 = j18;
                                                                    i48 = 1;
                                                                    org.telegram.messenger.qp.s1(i47).Z(arrayList11, arrayList7, encryptedChat2, j14, i51, zArr2[c10], i52);
                                                                } else {
                                                                    r32 = c10;
                                                                    arrayList8 = arrayList10;
                                                                    j14 = j18;
                                                                    i48 = 1;
                                                                }
                                                                size3 = arrayList8.size();
                                                                i49 = r32;
                                                                while (i49 < size3) {
                                                                    Object obj = arrayList8.get(i49);
                                                                    i49++;
                                                                    org.telegram.messenger.ij ijVar9 = (org.telegram.messenger.ij) obj;
                                                                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i47);
                                                                    ArrayList arrayList15 = new ArrayList();
                                                                    arrayList15.add(Integer.valueOf(ijVar9.f1()));
                                                                    if (j14 == 0 || !org.telegram.messenger.m5.z(j14)) {
                                                                        j15 = 0;
                                                                    } else {
                                                                        TLRPC.Chat M02 = s12.M0(Long.valueOf(-j14));
                                                                        j15 = org.telegram.messenger.t3.T(M02) ? M02.id : 0L;
                                                                    }
                                                                    s12.l3(arrayList15, j14);
                                                                    org.telegram.messenger.yr messagesStorage = s12.getMessagesStorage();
                                                                    int P0 = ijVar9.P0();
                                                                    messagesStorage.getClass();
                                                                    a0.h hVar = new a0.h(i48);
                                                                    ArrayList arrayList16 = new ArrayList(i48);
                                                                    arrayList16.add(Integer.valueOf(P0));
                                                                    hVar.k(arrayList16, j14);
                                                                    messagesStorage.I(new org.telegram.messenger.yf(messagesStorage, hVar, (boolean) r32, 3));
                                                                    s12.getMessagesStorage().P0(j14, arrayList15, true, true, org.telegram.messenger.ij.e5(ijVar9.k) ? 9 : r32, i51);
                                                                    s12.getMessagesStorage().R1(j14, j15, arrayList15, null);
                                                                    org.telegram.messenger.qs notificationCenter = s12.getNotificationCenter();
                                                                    Long valueOf = Long.valueOf(j15);
                                                                    Integer valueOf2 = Integer.valueOf((int) r32);
                                                                    Object[] objArr = new Object[6];
                                                                    objArr[r32] = arrayList15;
                                                                    objArr[i48] = valueOf;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    objArr[2] = bool;
                                                                    objArr[3] = bool;
                                                                    objArr[4] = bool;
                                                                    objArr[5] = valueOf2;
                                                                    notificationCenter.k(org.telegram.messenger.qs.w, objArr);
                                                                    if (!org.telegram.messenger.ij.e5(ijVar9.k) || ijVar9.c5()) {
                                                                        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                        tL_deleteMessage.peer = s12.j1(org.telegram.messenger.ij.B0(ijVar9.k));
                                                                        TLRPC.Message message6 = ijVar9.k;
                                                                        tL_deleteMessage.receiver_id = s12.o1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                        tL_deleteMessage.id = ijVar9.P0();
                                                                        s12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
                                                                    } else {
                                                                        TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                        tL_deleteWelcomeMessage.peer = s12.j1(org.telegram.messenger.ij.B0(ijVar9.k));
                                                                        tL_deleteWelcomeMessage.id = ijVar9.P0();
                                                                        s12.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new jh.b(3));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    arrayList7 = arrayList9;
                                                    if (j17 == 0) {
                                                    }
                                                    if (arrayList11.isEmpty()) {
                                                    }
                                                    size3 = arrayList8.size();
                                                    i49 = r32;
                                                    while (i49 < size3) {
                                                    }
                                                } else {
                                                    long j19 = e10;
                                                    int i55 = 0;
                                                    int i56 = 1;
                                                    while (i56 >= 0) {
                                                        ArrayList arrayList17 = new ArrayList();
                                                        int i57 = i55;
                                                        while (true) {
                                                            sparseArrayArr2 = sparseArrayArr;
                                                            if (i57 >= sparseArrayArr2[i56].size()) {
                                                                break;
                                                            }
                                                            arrayList17.add(Integer.valueOf(sparseArrayArr2[i56].keyAt(i57)));
                                                            i57++;
                                                        }
                                                        if (encryptedChat2 != null) {
                                                            arrayList6 = new ArrayList();
                                                            int i58 = i55;
                                                            while (i58 < sparseArrayArr2[i56].size()) {
                                                                org.telegram.messenger.ij ijVar10 = (org.telegram.messenger.ij) sparseArrayArr2[i56].valueAt(i58);
                                                                int i59 = i55;
                                                                long j20 = ijVar10.k.random_id;
                                                                if (j20 != 0 && ijVar10.D != 10) {
                                                                    arrayList6.add(Long.valueOf(j20));
                                                                }
                                                                i58++;
                                                                i55 = i59;
                                                            }
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                        int i60 = i55;
                                                        org.telegram.messenger.qp.s1(i50).Z(arrayList17, arrayList6, encryptedChat2, (i56 != 1 || j17 == 0) ? j19 : j17, i51, zArr2[i60], i52);
                                                        sparseArrayArr2[i56].clear();
                                                        i56--;
                                                        i55 = i60;
                                                    }
                                                }
                                                runnable.run();
                                            }
                                        };
                                        if (z20) {
                                            i17 = i44;
                                            u1Var2 = u1Var5;
                                            str2 = null;
                                            if (i17 == 1) {
                                                u1Var2.R = org.telegram.messenger.hd.M0(2131751497, null);
                                            } else {
                                                u1Var2.R = org.telegram.messenger.hd.a0(null, null, 2131751520, org.telegram.messenger.hd.G(i17, "messages", new Object[0]));
                                            }
                                        } else {
                                            i17 = i44;
                                            if (i17 == 1) {
                                                str2 = null;
                                                u1Var2 = u1Var5;
                                                u1Var2.R = org.telegram.messenger.hd.M0(2131743837, null);
                                            } else {
                                                u1Var2 = u1Var5;
                                                str2 = null;
                                                u1Var2.R = org.telegram.messenger.hd.a0(null, null, 2131743838, org.telegram.messenger.hd.G(i17, "messages", new Object[0]));
                                            }
                                        }
                                        if (z20) {
                                            if (chat == null || !z17) {
                                                if (!z18 || z16 || i43 == i17) {
                                                    if (chat == null || !chat.megagroup || z23) {
                                                        if (i17 == 1) {
                                                            u1Var2.T = org.telegram.messenger.hd.M0(2131754093, null);
                                                        } else {
                                                            u1Var2.T = org.telegram.messenger.hd.M0(2131754101, null);
                                                        }
                                                    } else if (i17 == 1) {
                                                        u1Var2.T = org.telegram.messenger.hd.M0((ijVar == null || !org.telegram.messenger.ij.d3(ijVar.k)) ? 2131754092 : 2131754093, null);
                                                    } else {
                                                        u1Var2.T = org.telegram.messenger.hd.M0(2131754100, null);
                                                    }
                                                } else if (chat != null) {
                                                    u1Var2.T = org.telegram.messenger.hd.a0("DeleteMessagesTextGroup", null, 2131751522, org.telegram.messenger.hd.G(i43, "messages", new Object[0]));
                                                } else {
                                                    u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("DeleteMessagesText", null, 2131751523, org.telegram.messenger.hd.G(i43, "messages", new Object[0]), org.telegram.messenger.t10.j(user, true)));
                                                }
                                            } else if (z18 && i43 != i17) {
                                                u1Var2.T = org.telegram.messenger.hd.a0(null, null, 2131751521, org.telegram.messenger.hd.G(i43, "messages", new Object[0]));
                                            } else if (i17 == 1) {
                                                u1Var2.T = org.telegram.messenger.hd.M0(2131754093, null);
                                            } else {
                                                u1Var2.T = org.telegram.messenger.hd.M0(2131754101, null);
                                            }
                                        } else if (i17 == 1) {
                                            u1Var2.T = org.telegram.messenger.hd.M0(2131754063, str2);
                                        } else {
                                            u1Var2.T = org.telegram.messenger.hd.M0(2131754064, str2);
                                        }
                                        if (ijVar == null) {
                                            z21 = ijVar.v3() && !org.telegram.messenger.ij.m3(ijVar.k);
                                            if (z21) {
                                                long j13 = ((TLRPC.TL_messageMediaGiveaway) ijVar.k.media).until_date * 1000;
                                                str3 = org.telegram.messenger.hd.E0().u0().format(new Date(j13));
                                                z21 = System.currentTimeMillis() < j13;
                                            }
                                            str3 = null;
                                        } else if (i17 == 1) {
                                            boolean z31 = false;
                                            str3 = null;
                                            for (int i46 = 1; i46 >= 0; i46--) {
                                                for (int i47 = 0; i47 < sparseArrayArr[i46].size(); i47++) {
                                                    org.telegram.messenger.ij ijVar7 = (org.telegram.messenger.ij) sparseArrayArr[i46].valueAt(i47);
                                                    boolean z32 = ijVar7.v3() && !org.telegram.messenger.ij.m3(ijVar7.k);
                                                    if (z32) {
                                                        long j14 = ((TLRPC.TL_messageMediaGiveaway) ijVar7.k.media).until_date * 1000;
                                                        str3 = org.telegram.messenger.hd.E0().u0().format(new Date(j14));
                                                        z31 = System.currentTimeMillis() < j14;
                                                    } else {
                                                        z31 = z32;
                                                    }
                                                }
                                            }
                                            z21 = z31;
                                        } else {
                                            z21 = false;
                                            str3 = null;
                                        }
                                        if (z14) {
                                            AlertDialog$Builder alertDialog$Builder4 = alertDialog$Builder2;
                                            r82 = 0;
                                            r82 = 0;
                                            r82 = 0;
                                            if (z30) {
                                                int M1 = (int) org.telegram.messenger.qp.s1(i45).x7.i.M1(TimeUnit.HOURS);
                                                u1Var2.R = org.telegram.messenger.hd.M0(2131744335, null);
                                                u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744334, Integer.valueOf(M1)));
                                                alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131744337, null), r1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else if (!z21 || z20) {
                                                alertDialog$Builder4.k(org.telegram.messenger.hd.M0(z20 ? 2131746320 : 2131751599, null), r1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else {
                                                u1Var2.R = org.telegram.messenger.hd.M0(2131753479, null);
                                                u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131753480, str3));
                                                alertDialog$Builder4.i(org.telegram.messenger.hd.M0(2131751599, null), r1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            }
                                        } else {
                                            int M12 = (int) org.telegram.messenger.qp.s1(i45).x7.i.M1(TimeUnit.HOURS);
                                            r82 = 0;
                                            u1Var2.R = org.telegram.messenger.hd.M0(2131744338, null);
                                            u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744336, Integer.valueOf(M12)));
                                            AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder2;
                                            alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131744337, null), r1Var);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        }
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r82), r82);
                                        u1Var2.N = new m0(3, runnable2);
                                        f2Var.showDialog(u1Var2);
                                        textView = (TextView) u1Var2.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, r82);
                                        }
                                        textView2 = (TextView) u1Var2.d(-3);
                                        if (textView2 == null) {
                                            u1Var2.t0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f));
                                            ((ViewGroup.MarginLayoutParams) u1Var2.t0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-8.0f);
                                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    z15 = z28;
                                }
                                z16 = false;
                                if (chat != null) {
                                }
                                i13 = i26;
                                if (z23) {
                                }
                                u1Var = u1Var3;
                                i14 = 0;
                                z17 = false;
                                z18 = false;
                                org.telegram.ui.ActionBar.u1 u1Var52 = u1Var;
                                int i432 = i14;
                                final long j122 = j10;
                                int i442 = size;
                                boolean z302 = z10;
                                final int i452 = i13;
                                z20 = z9;
                                org.telegram.ui.ActionBar.r1 r1Var2 = new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.e3
                                    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                    /* JADX WARN: Type inference failed for: r3v13 */
                                    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r3v15 */
                                    @Override // org.telegram.ui.ActionBar.r1
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var6, int i462) {
                                        SparseArray[] sparseArrayArr2;
                                        ArrayList arrayList6;
                                        int i472;
                                        long j132;
                                        char c10;
                                        ArrayList arrayList7;
                                        ?? r32;
                                        ArrayList arrayList8;
                                        long j142;
                                        int i48;
                                        int size3;
                                        int i49;
                                        long j15;
                                        TLRPC.Peer peer;
                                        long j16;
                                        boolean z312 = z20;
                                        int i50 = i452;
                                        long e10 = z312 ? org.telegram.messenger.p10.i(i50).e() : j122;
                                        org.telegram.messenger.ij ijVar72 = ijVar;
                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                        long j17 = j3;
                                        int i51 = i7;
                                        boolean[] zArr2 = zArr;
                                        int i52 = i10;
                                        ArrayList arrayList9 = null;
                                        if (ijVar72 != null) {
                                            ArrayList arrayList10 = new ArrayList();
                                            ArrayList arrayList11 = new ArrayList();
                                            org.telegram.messenger.dj djVar2 = djVar;
                                            if (djVar2 != null) {
                                                ArrayList arrayList12 = djVar2.d;
                                                c10 = 0;
                                                int i53 = 0;
                                                while (i53 < arrayList12.size()) {
                                                    org.telegram.messenger.ij ijVar8 = (org.telegram.messenger.ij) arrayList12.get(i53);
                                                    int i54 = i50;
                                                    if (org.telegram.messenger.ij.d3(ijVar8.k)) {
                                                        arrayList10.add(ijVar8);
                                                    } else {
                                                        arrayList11.add(Integer.valueOf(ijVar8.f1()));
                                                        if (encryptedChat2 != null) {
                                                            j16 = e10;
                                                            if (ijVar8.k.random_id != 0 && ijVar8.D != 10) {
                                                                if (arrayList9 == null) {
                                                                    arrayList9 = new ArrayList();
                                                                }
                                                                ArrayList arrayList13 = arrayList9;
                                                                arrayList13.add(Long.valueOf(ijVar8.k.random_id));
                                                                arrayList9 = arrayList13;
                                                            }
                                                            i53++;
                                                            e10 = j16;
                                                            i50 = i54;
                                                        }
                                                    }
                                                    j16 = e10;
                                                    i53++;
                                                    e10 = j16;
                                                    i50 = i54;
                                                }
                                                i472 = i50;
                                                j132 = e10;
                                            } else {
                                                i472 = i50;
                                                j132 = e10;
                                                c10 = 0;
                                                if (org.telegram.messenger.ij.d3(ijVar72.k)) {
                                                    arrayList10.add(ijVar72);
                                                } else {
                                                    arrayList11.add(Integer.valueOf(ijVar72.f1()));
                                                    if (encryptedChat2 != null && ijVar72.k.random_id != 0 && ijVar72.D != 10) {
                                                        ArrayList arrayList14 = new ArrayList();
                                                        arrayList14.add(Long.valueOf(ijVar72.k.random_id));
                                                        arrayList7 = arrayList14;
                                                        long j18 = (j17 == 0 && (peer = ijVar72.k.peer_id) != null && peer.chat_id == (-j17)) ? j17 : j132;
                                                        if (arrayList11.isEmpty()) {
                                                            r32 = c10;
                                                            arrayList8 = arrayList10;
                                                            j142 = j18;
                                                            i48 = 1;
                                                            org.telegram.messenger.qp.s1(i472).Z(arrayList11, arrayList7, encryptedChat2, j142, i51, zArr2[c10], i52);
                                                        } else {
                                                            r32 = c10;
                                                            arrayList8 = arrayList10;
                                                            j142 = j18;
                                                            i48 = 1;
                                                        }
                                                        size3 = arrayList8.size();
                                                        i49 = r32;
                                                        while (i49 < size3) {
                                                            Object obj = arrayList8.get(i49);
                                                            i49++;
                                                            org.telegram.messenger.ij ijVar9 = (org.telegram.messenger.ij) obj;
                                                            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i472);
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(Integer.valueOf(ijVar9.f1()));
                                                            if (j142 == 0 || !org.telegram.messenger.m5.z(j142)) {
                                                                j15 = 0;
                                                            } else {
                                                                TLRPC.Chat M02 = s12.M0(Long.valueOf(-j142));
                                                                j15 = org.telegram.messenger.t3.T(M02) ? M02.id : 0L;
                                                            }
                                                            s12.l3(arrayList15, j142);
                                                            org.telegram.messenger.yr messagesStorage = s12.getMessagesStorage();
                                                            int P0 = ijVar9.P0();
                                                            messagesStorage.getClass();
                                                            a0.h hVar = new a0.h(i48);
                                                            ArrayList arrayList16 = new ArrayList(i48);
                                                            arrayList16.add(Integer.valueOf(P0));
                                                            hVar.k(arrayList16, j142);
                                                            messagesStorage.I(new org.telegram.messenger.yf(messagesStorage, hVar, (boolean) r32, 3));
                                                            s12.getMessagesStorage().P0(j142, arrayList15, true, true, org.telegram.messenger.ij.e5(ijVar9.k) ? 9 : r32, i51);
                                                            s12.getMessagesStorage().R1(j142, j15, arrayList15, null);
                                                            org.telegram.messenger.qs notificationCenter = s12.getNotificationCenter();
                                                            Long valueOf = Long.valueOf(j15);
                                                            Integer valueOf2 = Integer.valueOf((int) r32);
                                                            Object[] objArr = new Object[6];
                                                            objArr[r32] = arrayList15;
                                                            objArr[i48] = valueOf;
                                                            Boolean bool = Boolean.FALSE;
                                                            objArr[2] = bool;
                                                            objArr[3] = bool;
                                                            objArr[4] = bool;
                                                            objArr[5] = valueOf2;
                                                            notificationCenter.k(org.telegram.messenger.qs.w, objArr);
                                                            if (!org.telegram.messenger.ij.e5(ijVar9.k) || ijVar9.c5()) {
                                                                TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                tL_deleteMessage.peer = s12.j1(org.telegram.messenger.ij.B0(ijVar9.k));
                                                                TLRPC.Message message6 = ijVar9.k;
                                                                tL_deleteMessage.receiver_id = s12.o1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                tL_deleteMessage.id = ijVar9.P0();
                                                                s12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
                                                            } else {
                                                                TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                tL_deleteWelcomeMessage.peer = s12.j1(org.telegram.messenger.ij.B0(ijVar9.k));
                                                                tL_deleteWelcomeMessage.id = ijVar9.P0();
                                                                s12.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new jh.b(3));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList7 = arrayList9;
                                            if (j17 == 0) {
                                            }
                                            if (arrayList11.isEmpty()) {
                                            }
                                            size3 = arrayList8.size();
                                            i49 = r32;
                                            while (i49 < size3) {
                                            }
                                        } else {
                                            long j19 = e10;
                                            int i55 = 0;
                                            int i56 = 1;
                                            while (i56 >= 0) {
                                                ArrayList arrayList17 = new ArrayList();
                                                int i57 = i55;
                                                while (true) {
                                                    sparseArrayArr2 = sparseArrayArr;
                                                    if (i57 >= sparseArrayArr2[i56].size()) {
                                                        break;
                                                    }
                                                    arrayList17.add(Integer.valueOf(sparseArrayArr2[i56].keyAt(i57)));
                                                    i57++;
                                                }
                                                if (encryptedChat2 != null) {
                                                    arrayList6 = new ArrayList();
                                                    int i58 = i55;
                                                    while (i58 < sparseArrayArr2[i56].size()) {
                                                        org.telegram.messenger.ij ijVar10 = (org.telegram.messenger.ij) sparseArrayArr2[i56].valueAt(i58);
                                                        int i59 = i55;
                                                        long j20 = ijVar10.k.random_id;
                                                        if (j20 != 0 && ijVar10.D != 10) {
                                                            arrayList6.add(Long.valueOf(j20));
                                                        }
                                                        i58++;
                                                        i55 = i59;
                                                    }
                                                } else {
                                                    arrayList6 = null;
                                                }
                                                int i60 = i55;
                                                org.telegram.messenger.qp.s1(i50).Z(arrayList17, arrayList6, encryptedChat2, (i56 != 1 || j17 == 0) ? j19 : j17, i51, zArr2[i60], i52);
                                                sparseArrayArr2[i56].clear();
                                                i56--;
                                                i55 = i60;
                                            }
                                        }
                                        runnable.run();
                                    }
                                };
                                if (z20) {
                                }
                                if (z20) {
                                }
                                if (ijVar == null) {
                                }
                                if (z14) {
                                }
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r82), r82);
                                u1Var2.N = new m0(3, runnable2);
                                f2Var.showDialog(u1Var2);
                                textView = (TextView) u1Var2.d(-1);
                                if (textView != null) {
                                }
                                textView2 = (TextView) u1Var2.d(-3);
                                if (textView2 == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.u1 z(LaunchActivity launchActivity) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                                String M0 = org.telegram.messenger.hd.M0(2131748716, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.hd.M0(2131748717, null);
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748719, null), new y0(launchActivity, 1));
                                return u1Var;
                            }
                        }
