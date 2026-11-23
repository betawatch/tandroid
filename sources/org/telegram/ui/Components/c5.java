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
import org.telegram.ui.p81;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class c5 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static org.telegram.ui.ActionBar.t1 A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131747110, null));
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.U = W2;
        int i7 = org.telegram.ui.ActionBar.m6.L5;
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.m6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747106, null), new u0(activity, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751760, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.t1 B(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.or orVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.hd.N0(2131745421, null), org.telegram.messenger.hd.N0(2131745420, null), org.telegram.messenger.hd.N0(2131745419, null), org.telegram.messenger.hd.N0(2131745418, null)};
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.hd.N0(2131748651, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748648, org.telegram.messenger.p10.k(user, true)));
        } else {
            textView.setText(org.telegram.messenger.hd.N0(2131748649, null));
        }
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        f10.addView(textView, c8.ma.t(-2, -2, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i7 = 0;
        while (i7 < 4) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, h6Var);
            k6Var.d = 42;
            k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i7));
            a(k6Var, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.E5, h6Var);
            k6Var.b(strArr[i7], iArr[0] == i7);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new v1(iArr, f10));
            i7++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (z10) {
            t1Var.S = org.telegram.messenger.hd.N0(2131748650, null);
        } else {
            int i10 = org.telegram.ui.ActionBar.m6.L5;
            int i11 = h6Var != null ? h6Var.i(i10) : org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            t1Var.c0 = new bp0(activity, 0);
            t1Var.d0 = i11;
            t1Var.e0 = -1;
            if (h6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.m6.L5, null);
            }
        }
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745263, null), new oi.f0(29, iArr, orVar));
        alertDialog$Builder.i(org.telegram.messenger.hd.N0(2131752577, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.w2 C(final long j3, final long j10, final org.telegram.ui.ActionBar.g2 g2Var, final org.telegram.ui.ActionBar.h6 h6Var) {
        if (g2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.w2 j11 = org.telegram.messenger.o10.j(g2Var.getParentActivity(), false, 1, h6Var);
        j11.P = org.telegram.messenger.hd.N0(2131747730, null);
        j11.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.a0("MuteFor", null, 2131748119, org.telegram.messenger.hd.G(1, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748119, org.telegram.messenger.hd.G(8, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748119, org.telegram.messenger.hd.G(2, "Days", new Object[0])), org.telegram.messenger.hd.N0(2131748120, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.h3
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
                org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).T(j3, i10, j10);
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                if (lc.a(g2Var2)) {
                    lc.z(g2Var2, i10, 0, h6Var).j();
                }
            }
        };
        j11.M = charSequenceArr;
        j11.L = onClickListener;
        return j11;
    }

    public static void D(Context context, org.telegram.ui.ActionBar.h6 h6Var, a5 a5Var) {
        if (context == null) {
            return;
        }
        int i7 = 0;
        int i10 = org.telegram.ui.ActionBar.m6.j5;
        int i11 = h6Var != null ? h6Var.i(i10) : org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int i12 = org.telegram.ui.ActionBar.m6.h5;
        int i13 = h6Var != null ? h6Var.i(i12) : org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        int i14 = org.telegram.ui.ActionBar.m6.Aj;
        if (h6Var != null) {
            h6Var.i(i14);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.m6.Ej;
        if (h6Var != null) {
            h6Var.i(i15);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.m6.E8;
        if (h6Var != null) {
            h6Var.i(i16);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.m6.G8;
        if (h6Var != null) {
            h6Var.i(i17);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.m6.i6;
        if (h6Var != null) {
            h6Var.i(i18);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.m6.Ji;
        int i20 = h6Var != null ? h6Var.i(i19) : org.telegram.ui.ActionBar.m6.x0(null, i19, false);
        int i21 = org.telegram.ui.ActionBar.m6.Fi;
        int i22 = h6Var != null ? h6Var.i(i21) : org.telegram.ui.ActionBar.m6.x0(null, i21, false);
        int i23 = org.telegram.ui.ActionBar.m6.Hi;
        int i24 = h6Var != null ? h6Var.i(i23) : org.telegram.ui.ActionBar.m6.x0(null, i23, false);
        hi.w4 w4Var = new hi.w4(context, h6Var);
        ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
        int[] iArr = {30, 60, 120, org.telegram.messenger.ls.K2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        q4 q4Var = new q4(context, h6Var, iArr);
        q4Var.setMinValue(0);
        q4Var.setMaxValue(20);
        q4Var.setTextColor(i11);
        q4Var.setValue(0);
        q4Var.setFormatter(new f1(iArr, i7));
        m4 m4Var = new m4(context, q4Var, 1);
        m4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        m4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.N0(2131748117, null));
        textView.setTextColor(i11);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        m4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.xb xbVar = new di.xb(context, 19);
        linearLayout.addView(q4Var, c8.ma.l(1.0f, 0, org.telegram.messenger.ls.t4));
        q4Var.setOnValueChangedListener(new org.telegram.ui.cr(11));
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(i20);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, i22, i24, i24));
        xbVar.setText(org.telegram.messenger.hd.N0(2131753863, null));
        m4Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new bi.p6(iArr, q4Var, a5Var, w4Var, 7));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var.b;
        w2Var.O = m4Var;
        w2Var.show();
        w2Var.v0(i13);
        w2Var.P(i13);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        HashMap hashMap = new HashMap();
        int i7 = org.telegram.ui.ActionBar.m6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.m6.v0(i7)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.m6.v0(i7)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.m6.v0(i7), hashMap);
        alertDialog$Builder.n(i7, null);
        t1Var.X = true;
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752029, null), null);
        t1Var.U = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.t1 F(Activity activity, long j3, final long j10, int i7, final Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        int i11;
        char c10;
        CharSequence[] charSequenceArr;
        final long j11 = j3;
        final int i12 = i7;
        final SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).g7;
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
            charSequenceArr = new String[]{org.telegram.messenger.hd.N0(2131747686, null), org.telegram.messenger.hd.N0(2131747688, null), org.telegram.messenger.hd.N0(2131747687, null), org.telegram.messenger.hd.N0(2131747689, null), org.telegram.messenger.hd.N0(2131747685, null)};
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
                charSequenceArr2[0] = org.telegram.messenger.hd.N0(2131747688, null);
                charSequenceArr2[1] = org.telegram.messenger.hd.N0(2131747687, null);
                charSequenceArr2[c10] = org.telegram.messenger.hd.N0(2131747689, null);
                charSequenceArr2[3] = org.telegram.messenger.hd.N0(2131747685, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.hd.N0(2131747688, null);
            charSequenceArr22[1] = org.telegram.messenger.hd.N0(2131747687, null);
            charSequenceArr22[c10] = org.telegram.messenger.hd.N0(2131747689, null);
            charSequenceArr22[3] = org.telegram.messenger.hd.N0(2131747685, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, i10);
        int i15 = i11;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, activity, h6Var);
        int i16 = i15;
        while (i16 < charSequenceArr.length) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, h6Var);
            k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), i15, org.telegram.messenger.g0.L(4.0f), i15);
            k6Var.setTag(Integer.valueOf(i16));
            a(k6Var, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.E5, h6Var);
            k6Var.b(charSequenceArr[i16], iArr[i15] == i16 ? 1 : i15);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i17 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).g7.edit();
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
                        org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).l(j12, j10);
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
                        org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).m(i21);
                    }
                    edit.commit();
                    alertDialog$Builder.a.M0.run();
                    runnable.run();
                }
            });
            i16++;
            j11 = j3;
            i12 = i7;
            i15 = i15;
        }
        String N0 = org.telegram.messenger.hd.N0(2131747712, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752577, null), null);
        return t1Var;
    }

    public static void G(int i7, Activity activity, long j3, TLRPC.Photo photo, fi.b bVar) {
        if (activity != null) {
            bi.z zVar = new bi.z(i7, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) activity, (org.telegram.ui.ActionBar.h6) bVar, true);
            w2Var.O();
            w2Var.P = org.telegram.messenger.hd.N0(2131746016, null);
            w2Var.Q = true;
            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.N0(2131746025, null), org.telegram.messenger.hd.N0(2131746031, null), org.telegram.messenger.hd.N0(2131746024, null), org.telegram.messenger.hd.N0(2131746033, null), org.telegram.messenger.hd.N0(2131746030, null), org.telegram.messenger.hd.N0(2131746028, null), org.telegram.messenger.hd.N0(2131746027, null), org.telegram.messenger.hd.N0(2131746029, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            a3 a3Var = new a3(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, zVar, 0);
            w2Var.M = charSequenceArr;
            w2Var.N = iArr;
            w2Var.L = a3Var;
            w2Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.View] */
    public static hi.w4 H(final Context context, final long j3, long j10, int i7, boolean z10, final a5 a5Var, Runnable runnable, z4 z4Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        tb0 tb0Var;
        long j11;
        boolean[] zArr;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.q0 q0Var;
        char c10;
        int i11;
        int i12;
        int[] iArr;
        org.telegram.messenger.camera.i iVar;
        String[] strArr;
        Calendar calendar;
        String[] strArr2;
        final z3 z3Var;
        rh0 rh0Var;
        int i13;
        float f10;
        int i14;
        org.telegram.messenger.camera.i iVar2;
        ?? r42;
        int i15;
        rh0 rh0Var2;
        org.telegram.ui.ActionBar.w2 w2Var;
        TLRPC.User c22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr2 = {i7};
        long e10 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).e();
        final hi.w4 w4Var = new hi.w4(context, h6Var);
        ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
        tb0 tb0Var2 = new tb0(context, h6Var);
        int i16 = z4Var.a;
        int i17 = z4Var.c;
        int i18 = z4Var.b;
        tb0Var2.setTextColor(i16);
        tb0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        tb0Var2.setItemCount(5);
        final z3 z3Var2 = new z3(context, h6Var);
        z3Var2.setWrapSelectorWheel(true);
        z3Var2.setAllItemsCount(24);
        z3Var2.setItemCount(5);
        z3Var2.setTextColor(i16);
        z3Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final a4 a4Var = new a4(context, h6Var);
        a4Var.setWrapSelectorWheel(true);
        a4Var.setAllItemsCount(60);
        a4Var.setItemCount(5);
        a4Var.setTextColor(i16);
        a4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        w3 w3Var = new w3(context, tb0Var2, z3Var2, a4Var, 1);
        w3Var.setClipToPadding(false);
        w3Var.setClipChildren(false);
        w3Var.setOrientation(1);
        frameLayout2.addView(w3Var, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        w3Var.addView(frameLayout4, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i10 = 0;
        } else if (j3 == e10) {
            i10 = 0;
            textView.setText(org.telegram.messenger.hd.N0(2131745318, null));
        } else {
            i10 = 0;
            textView.setText(org.telegram.messenger.hd.N0(2131745663, null));
        }
        textView.setTextColor(i16);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout4.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        boolean[] zArr2 = new boolean[1];
        zArr2[i10] = true;
        if (!org.telegram.messenger.n5.E(j3) || j3 == e10 || (c22 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).c2(Long.valueOf(j3))) == null || c22.bot || (userStatus = c22.status) == null || userStatus.expires <= 0) {
            r82 = w3Var;
            context2 = context;
            viewGroup = frameLayout2;
            frameLayout = frameLayout3;
            tb0Var = tb0Var2;
            j11 = e10;
            zArr = zArr2;
            viewGroup2 = frameLayout4;
            q0Var = null;
        } else {
            String k10 = org.telegram.messenger.p10.k(c22, true);
            if (k10.length() > 10) {
                k10 = k10.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout3;
            r82 = w3Var;
            tb0Var = tb0Var2;
            j11 = e10;
            viewGroup2 = frameLayout4;
            zArr = zArr2;
            viewGroup = frameLayout2;
            q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, z4Var.a, false, h6Var);
            context2 = context;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(R.drawable.ic_ab_other);
            q0Var.setBackground(org.telegram.ui.ActionBar.m6.h0(i17, 1, -1));
            viewGroup2.addView(q0Var, c8.ma.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            q0Var.g(1, org.telegram.messenger.hd.a0(null, null, 2131745654, k10));
            q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        }
        if (q0Var != null) {
            q0Var.setOnClickListener(new oi.i1(22, q0Var, z4Var));
            q0Var.setDelegate(new a3.h(a5Var, zArr, w4Var, 19));
        }
        rh0 rh0Var3 = new rh0(context2);
        final oh0 oh0Var = new oh0(R.raw.notify_toggle, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        oh0Var.J(true);
        oh0Var.h = true;
        oh0Var.start();
        oh0Var.M(40);
        oh0Var.P(40);
        rh0Var3.setScaleType(ImageView.ScaleType.CENTER);
        rh0Var3.setAnimation(oh0Var);
        rh0Var3.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        rh0Var3.setBackground(org.telegram.ui.ActionBar.m6.h0(i17, 1, -1));
        viewGroup2.addView(rh0Var3, c8.ma.d(40, 40.0f, 53, 0.0f, 8.0f, (q0Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.q0 q0Var2 = q0Var;
        final di.xb xbVar = new di.xb(context2, 14);
        linearLayout.addView(tb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
        tb0Var.setMinValue(0);
        tb0Var.setMaxValue(365);
        tb0Var.setWrapSelectorWheel(false);
        tb0Var.setFormatter(new org.telegram.ui.cr(12));
        final tb0 tb0Var3 = tb0Var;
        ViewGroup viewGroup3 = viewGroup;
        final boolean[] zArr3 = zArr;
        final long j12 = j11;
        rb0 rb0Var = new rb0() { // from class: org.telegram.ui.Components.u1
            @Override // org.telegram.ui.Components.rb0
            public final void n(tb0 tb0Var4, int i19) {
                c5.g(di.xb.this, null, 0L, 0L, j12 == j3 ? 1 : 0, tb0Var3, z3Var2, a4Var);
            }
        };
        tb0Var3.setOnValueChangedListener(rb0Var);
        z3Var2.setMinValue(0);
        z3Var2.setMaxValue(23);
        linearLayout.addView(z3Var2, c8.ma.l(0.2f, 0, org.telegram.messenger.ls.t4));
        z3Var2.setFormatter(new org.telegram.ui.cr(15));
        z3Var2.setOnValueChangedListener(rb0Var);
        a4Var.setMinValue(0);
        a4Var.setMaxValue(59);
        a4Var.setValue(0);
        a4Var.setFormatter(new org.telegram.ui.cr(17));
        linearLayout.addView(a4Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ls.t4));
        a4Var.setOnValueChangedListener(rb0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j13 = 1000 * j10;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                a4Var.setValue(calendar2.get(12));
                z3Var2.setValue(calendar2.get(11));
                tb0Var3.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(xbVar, null, 0L, 0L, j12 == j3 ? 1 : 0, tb0Var3, z3Var2, a4Var);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.k10.t0).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i11 = 10;
            iArr = new int[]{0, 60, org.telegram.messenger.ls.X4, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            i12 = 8;
        } else {
            c10 = '\t';
            i11 = 10;
            i12 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        int i19 = i12;
        if (isTestBackend) {
            strArr = new String[i11];
            iVar = null;
            strArr[0] = org.telegram.messenger.hd.N0(2131748307, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.hd.N0(2131748309, null);
            strArr[4] = org.telegram.messenger.hd.N0(2131748306, null);
            strArr[5] = org.telegram.messenger.hd.N0(2131748310, null);
            strArr[6] = org.telegram.messenger.hd.N0(2131748308, null);
            strArr[7] = org.telegram.messenger.hd.N0(2131748312, null);
            strArr[i19] = org.telegram.messenger.hd.N0(2131748311, null);
            strArr[c10] = org.telegram.messenger.hd.N0(2131748305, null);
        } else {
            iVar = null;
            strArr = new String[i19];
            strArr[0] = org.telegram.messenger.hd.N0(2131748307, null);
            strArr[1] = org.telegram.messenger.hd.N0(2131748309, null);
            strArr[2] = org.telegram.messenger.hd.N0(2131748306, null);
            strArr[3] = org.telegram.messenger.hd.N0(2131748310, null);
            strArr[4] = org.telegram.messenger.hd.N0(2131748308, null);
            strArr[5] = org.telegram.messenger.hd.N0(2131748312, null);
            strArr[6] = org.telegram.messenger.hd.N0(2131748311, null);
            strArr[7] = org.telegram.messenger.hd.N0(2131748305, null);
        }
        if (z10) {
            calendar = calendar2;
            strArr2 = strArr;
            z3Var = z3Var2;
            rh0Var = rh0Var3;
            i13 = i18;
            f10 = 14.0f;
            i14 = 0;
            iVar2 = iVar;
            r42 = iVar2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            f10 = 14.0f;
            int[] iArr3 = iArr;
            int w10 = org.telegram.ui.ActionBar.m6.w(i18, org.telegram.ui.ActionBar.m6.r1(0.075f, i16));
            calendar = calendar2;
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, i16);
            String[] strArr3 = strArr;
            ?? textView2 = new TextView(context2);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i16);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.m6.w(w10, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w10, w11, w11));
            textView2.setGravity(17);
            strArr2 = strArr3;
            z3Var = z3Var2;
            i14 = 0;
            rh0Var = rh0Var3;
            i13 = i18;
            iVar2 = new org.telegram.messenger.camera.i(iArr3, iArr2, strArr2, textView2, 21);
            iArr = iArr3;
            iVar2.run();
            frameLayout5.addView(textView2, c8.ma.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout5, c8.ma.o(-1, -2));
            iVar = textView2;
            r42 = frameLayout5;
        }
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), i14, org.telegram.messenger.g0.L(34.0f), i14);
        xbVar.setGravity(17);
        xbVar.setTextColor(z4Var.g);
        xbVar.setTextSize(1, f10);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int i20 = z4Var.h;
        float[] fArr = new float[1];
        fArr[i14] = 24.0f;
        xbVar.setBackground(org.telegram.ui.ActionBar.a6.e(i20, fArr));
        r82.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        rh0 rh0Var4 = rh0Var;
        int i21 = i13;
        final Calendar calendar3 = calendar;
        xbVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr4[0] = false;
                int i22 = j12 == j3 ? 1 : 0;
                tb0 tb0Var4 = tb0Var3;
                z3 z3Var3 = z3Var;
                a4 a4Var2 = a4Var;
                boolean g10 = c5.g(null, null, 0L, 0L, i22, tb0Var4, z3Var3, a4Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, tb0Var4.getValue());
                calendar4.set(11, z3Var3.getValue());
                calendar4.set(12, a4Var2.getValue());
                if (g10) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                a5Var.O((int) (calendar4.getTimeInMillis() / 1000), iArr2[0], zArr3[0]);
                ((org.telegram.ui.ActionBar.w2) w4Var.b).y0.run();
            }
        });
        org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) w4Var.b;
        w2Var2.O = viewGroup3;
        w2Var2.show();
        w2Var2.setOnDismissListener(new i2(runnable, zArr4));
        w2Var2.v0(i21);
        w2Var2.P(i21);
        if (iVar != null) {
            String[] strArr4 = strArr2;
            w2Var = w2Var2;
            i15 = 1;
            rh0Var2 = rh0Var4;
            iVar.setOnClickListener(new j3(frameLayout, h6Var, w2Var, (FrameLayout) r42, iArr, strArr4, iArr2, iVar2));
        } else {
            i15 = 1;
            rh0Var2 = rh0Var4;
            w2Var = w2Var2;
        }
        final hi.l3[] l3VarArr = new hi.l3[i15];
        final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var;
        rh0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String N0;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                oh0 oh0Var2 = oh0Var;
                if (z11) {
                    if (oh0Var2.b0 < 40) {
                        oh0Var2.M(40);
                    }
                    oh0Var2.P(80);
                    oh0Var2.start();
                } else {
                    if (oh0Var2.b0 >= 40) {
                        oh0Var2.M(0);
                    }
                    oh0Var2.P(40);
                    oh0Var2.start();
                }
                hi.l3[] l3VarArr2 = l3VarArr;
                hi.l3 l3Var = l3VarArr2[0];
                if (l3Var != null) {
                    l3Var.f(true);
                    l3VarArr2[0] = null;
                }
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0);
                long j14 = j3;
                TLRPC.User c23 = u12.c2(Long.valueOf(j14));
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(-j14));
                hi.l3 l3Var2 = new hi.l3(context, 3);
                l3VarArr2[0] = l3Var2;
                l3Var2.t();
                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                l3Var2.s(20.0f);
                l3Var2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.r1(0.25f, -16777216));
                if (org.telegram.messenger.v3.V(O0)) {
                    N0 = org.telegram.messenger.hd.N0(zArr5[0] ? 2131745658 : 2131745662, null);
                } else if (O0 != null || c23 == null) {
                    N0 = org.telegram.messenger.hd.N0(zArr5[0] ? 2131745656 : 2131745660, null);
                } else if (j14 == j12) {
                    N0 = org.telegram.messenger.hd.N0(zArr5[0] ? 2131745655 : 2131745659, null);
                } else {
                    N0 = org.telegram.messenger.hd.a0(null, null, zArr5[0] ? 2131745657 : 2131745661, org.telegram.messenger.p10.l(c23));
                }
                l3Var2.v(N0);
                l3Var2.d = 5000L;
                l3Var2.o(1.0f, -((q0Var2 != null ? 42 : -8) + 20));
                l3Var2.r0 = new i3(l3Var2, 0);
                org.telegram.ui.ActionBar.w2 w2Var4 = w2Var3;
                w2Var4.b.setClipToPadding(false);
                w2Var4.b.setClipChildren(false);
                w2Var4.b.addView(l3Var2, c8.ma.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                l3Var2.x();
            }
        });
        return w4Var;
    }

    public static void I(Context context, long j3, a5 a5Var) {
        H(context, j3, -1L, 0, false, a5Var, null, new z4(null), null);
    }

    public static void J(Context context, long j3, a5 a5Var, org.telegram.ui.ActionBar.h6 h6Var) {
        H(context, j3, -1L, 0, false, a5Var, null, new z4(h6Var), h6Var);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        if (str == null) {
            str = org.telegram.messenger.hd.N0(R.string.AppName, null);
        }
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        t1Var.U = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        alertDialog$Builder.k(str3, new e1(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.t1 M(Context context, org.telegram.ui.ActionBar.h6 h6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        t1Var.U = charSequence;
        alertDialog$Builder.k(str2, new e1(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.g1 N(org.telegram.ui.ActionBar.g2 g2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (g2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        g1Var.e = true;
        g1Var.c = org.telegram.messenger.ls.x3;
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

    public static void O(Context context, org.telegram.ui.ActionBar.g2 g2Var, String str, String str2, String str3, String str4, int i7, String str5, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.sr srVar) {
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = str == null ? org.telegram.messenger.hd.N0(R.string.AppName, null) : str;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = str2;
        b5 b5Var = new b5(context);
        b5Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(b5Var, i10, h6Var);
        org.telegram.ui.ActionBar.t6.D(b5Var, org.telegram.ui.ActionBar.m6.Oi, h6Var);
        b5Var.setHint(str3);
        b5Var.setFocusable(true);
        b5Var.setInputType(147457);
        b5Var.setImeOptions(6);
        b5Var.setMaxLines(10);
        b5Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        b5Var.setCursorWidth(1.5f);
        b5Var.A(org.telegram.ui.ActionBar.m6.q6, h6Var);
        if (str4 != null) {
            b5Var.setText(str4);
        }
        b5Var.setOnEditorActionListener(new kg.q(b5Var, i7, srVar, t1VarArr, currentFocus, 1));
        b5Var.addTextChangedListener(new org.telegram.ui.Cells.k3(i7, b5Var));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.06f, i10);
        b5Var.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(b5Var, d02, K, null, h6Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.addView(b5Var, c8.ma.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(g10);
        t1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
        alertDialog$Builder.k(str5, new ai.u1(b5Var, i7, srVar, 8));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new org.telegram.ui.cr(24));
        t1VarArr[0] = t1Var;
        if (g2Var != null) {
            org.telegram.messenger.g0.Y2(W, g2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.k0 = false;
        t1Var2.setOnDismissListener(new bi.k(b5Var, g2Var, W, 4));
        t1VarArr[0].setOnShowListener(new d1(1, b5Var));
        t1VarArr[0].show();
        b5Var.setSelection(b5Var.getText().length());
    }

    public static void P(Context context, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.sr srVar) {
        O(context, g2Var, org.telegram.messenger.hd.N0(2131744556, null), org.telegram.messenger.hd.N0(2131744563, null), org.telegram.messenger.hd.N0(2131744537, null), null, 12, org.telegram.messenger.hd.N0(2131751741, null), h6Var, srVar);
    }

    public static hi.w4 Q(Context context, long j3, final a5 a5Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        int i10;
        int i11;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Aj, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ej, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E8, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G8, false);
        int i12 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
        if (context == null) {
            return null;
        }
        final hi.w4 w4Var = new hi.w4(context, h6Var);
        ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
        final tb0 tb0Var = new tb0(context, h6Var);
        tb0Var.setTextColor(x02);
        tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        tb0Var.setItemCount(5);
        final u4 u4Var = new u4(context, h6Var);
        u4Var.setWrapSelectorWheel(true);
        u4Var.setAllItemsCount(24);
        u4Var.setItemCount(5);
        u4Var.setTextColor(x02);
        u4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final v4 v4Var = new v4(context, h6Var);
        v4Var.setWrapSelectorWheel(true);
        v4Var.setAllItemsCount(60);
        v4Var.setItemCount(5);
        v4Var.setTextColor(x02);
        v4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        w3 w3Var = new w3(context, tb0Var, u4Var, v4Var, 7);
        w3Var.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        w3Var.addView(g10, c8.ma.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.N0(i7 == 1 ? 2131744131 : 2131746901, null));
        textView.setTextColor(x02);
        i5.c.x(textView, 1, 20.0f);
        g10.addView(textView, c8.ma.t(-2, -2, 51, 0, 12, 0, 0));
        int i13 = 10;
        textView.setOnTouchListener(new gi.a(i13));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.z6, h6Var);
        i5.c.r(14.0f, 1, 2131746900, textView2, null);
        g10.addView(textView2, c8.ma.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new gi.a(i13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i14 = calendar.get(1);
        hi.w4 w4Var2 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).A7.j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long n22 = w4Var2.n2(timeUnit) * 2;
        final long n23 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).A7.k.n2(timeUnit) - 86400;
        di.xb xbVar = new di.xb(context, 21);
        linearLayout.addView(tb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
        tb0Var.setMinValue(0);
        tb0Var.setMaxValue(365);
        tb0Var.setWrapSelectorWheel(false);
        tb0Var.setFormatter(new l2.t(i14, 4));
        int i15 = i7 == 1 ? 5 : 3;
        ii.j jVar = new ii.j(xbVar, n22, n23, i15, tb0Var, u4Var, v4Var);
        tb0Var.setOnValueChangedListener(jVar);
        u4Var.setMinValue(0);
        u4Var.setMaxValue(23);
        linearLayout.addView(u4Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ls.t4));
        u4Var.setFormatter(new org.telegram.ui.cr(19));
        u4Var.setOnValueChangedListener(jVar);
        v4Var.setMinValue(0);
        v4Var.setMaxValue(59);
        v4Var.setValue(0);
        v4Var.setFormatter(new org.telegram.ui.cr(20));
        linearLayout.addView(v4Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ls.t4));
        v4Var.setOnValueChangedListener(jVar);
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
                v4Var.setValue(calendar.get(12));
                u4Var.setValue(calendar.get(11));
                tb0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(xbVar, null, n22, n23, i15, tb0Var, u4Var, v4Var);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(x04);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setBackground(org.telegram.ui.ActionBar.a6.e(x05, 8.0f));
        w3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i15;
        xbVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j11 = n22;
                long j12 = n23;
                int i17 = i16;
                tb0 tb0Var2 = tb0Var;
                u4 u4Var2 = u4Var;
                v4 v4Var2 = v4Var;
                boolean g11 = c5.g(null, null, j11, j12, i17, tb0Var2, u4Var2, v4Var2);
                long epochMilli = LocalDate.now().plusDays(tb0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, u4Var2.getValue());
                calendar2.set(12, v4Var2.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                }
                a5Var.O((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) w4Var.b).y0.run();
            }
        });
        c8.ra.b(xbVar, 0.02f, 1.2f);
        di.xb xbVar2 = new di.xb(context, 22);
        xbVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar2.setGravity(17);
        xbVar2.setText(org.telegram.messenger.hd.N0(i7 == 1 ? 2131748278 : 2131746898, null));
        xbVar2.setTextColor(x05);
        xbVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i17 = org.telegram.ui.ActionBar.m6.d6;
        int x06 = org.telegram.ui.ActionBar.m6.x0(null, i17, false);
        int x07 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i17);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        xbVar2.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(xbVar2, k02, M, M2, null);
        w3Var.addView(xbVar2, c8.ma.t(-1, 48, 83, 16, 0, 16, 16));
        xbVar2.setOnClickListener(new ah.h(zArr, a5Var, w4Var, 21));
        c8.ra.b(xbVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var.b;
        w2Var.O = w3Var;
        w2Var.show();
        w2Var.setOnDismissListener(new hi.f1(zArr));
        w2Var.v0(i10);
        w2Var.P(i10);
        return w4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.t1 R(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        if (g2Var == null || g2Var.getParentActivity() == null) {
            return null;
        }
        m80 m80Var = new m80(g2Var.getParentActivity(), g2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.hd.N0(2131753982, null).replace("\n", "<br>")));
        boolean z10 = false;
        Object[] objArr = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new p4(uRLSpan.getURL(), g2Var), spanStart, spanEnd, 0);
        }
        m80Var.setText(spannableString);
        m80Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.k5, h6Var);
        org.telegram.ui.ActionBar.t6.C(m80Var, org.telegram.ui.ActionBar.m6.l5, h6Var);
        m80Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        m80Var.setMovementMethod(new org.telegram.messenger.c0(z10));
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.j5, h6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), h6Var);
        alertDialog$Builder.o(m80Var);
        String N0 = org.telegram.messenger.hd.N0(2131753983, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131753981, null), new e3(objArr == true ? 1 : 0, g2Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        return t1Var;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.h6 h6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(2131748394, null);
        tb0 tb0Var = new tb0(context, null);
        tb0Var.setMinValue(0);
        tb0Var.setMaxValue(20);
        int i7 = encryptedChat.ttl;
        if (i7 > 0 && i7 < 16) {
            tb0Var.setValue(i7);
        } else if (i7 == 30) {
            tb0Var.setValue(16);
        } else if (i7 == 60) {
            tb0Var.setValue(17);
        } else if (i7 == 3600) {
            tb0Var.setValue(18);
        } else if (i7 == 86400) {
            tb0Var.setValue(19);
        } else if (i7 == 604800) {
            tb0Var.setValue(20);
        } else if (i7 == 0) {
            tb0Var.setValue(0);
        }
        tb0Var.setFormatter(new l2(4));
        alertDialog$Builder.o(tb0Var);
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751342, null), new h2(3, encryptedChat, tb0Var));
        return alertDialog$Builder;
    }

    public static void T(org.telegram.ui.ActionBar.g2 g2Var, int i7, org.telegram.ui.ActionBar.l6 l6Var, org.telegram.ui.ActionBar.j6 j6Var) {
        int i10;
        int i11;
        String sb2;
        if (g2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = g2Var.getParentActivity();
        b5 b5Var = new b5(parentActivity);
        String str = null;
        b5Var.setBackground(null);
        org.telegram.ui.ActionBar.t6.F(b5Var, org.telegram.ui.ActionBar.m6.u5, org.telegram.ui.ActionBar.m6.v5, org.telegram.ui.ActionBar.m6.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(2131748065, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751741, null), new l2(5));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i7 != 0) {
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131751102, null)));
        } else {
            textView.setText(org.telegram.messenger.hd.N0(2131751103, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i12 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i12, null);
        linearLayout.addView(textView, c8.ma.o(-1, -2));
        b5Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(b5Var, i12, null);
        b5Var.setMaxLines(1);
        b5Var.setLines(1);
        b5Var.setInputType(16385);
        b5Var.setGravity(51);
        b5Var.setSingleLine(true);
        b5Var.setImeOptions(6);
        b5Var.A(org.telegram.ui.ActionBar.m6.G6, null);
        b5Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        b5Var.setCursorWidth(1.5f);
        b5Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(b5Var, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
        b5Var.setOnEditorActionListener(new t2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        i5.c.u(9306112, hashMap, "Berry", 14598550, "Brandy");
        i5.c.u(8391495, hashMap, "Cherry", 16744272, "Coral");
        i5.c.u(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        i5.c.u(14725375, hashMap, "Mauve", 16761035, "Pink");
        i5.c.u(16711680, hashMap, "Red", 16711807, "Rose");
        i5.c.u(8406555, hashMap, "Russet", 16720896, "Scarlet");
        i5.c.u(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        i5.c.u(16760576, hashMap, "Amber", 15438707, "Apricot");
        i5.c.u(16508850, hashMap, "Banana", 10601738, "Citrus");
        i5.c.u(11560192, hashMap, "Ginger", 16766720, "Gold");
        i5.c.u(16640272, hashMap, "Lemon", 16753920, "Orange");
        i5.c.u(16770484, hashMap, "Peach", 16739155, "Persimmon");
        i5.c.u(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        i5.c.u(16763004, hashMap, "Topaz", 16776960, "Yellow");
        i5.c.u(3688720, hashMap, "Clover", 8628829, "Cucumber");
        i5.c.u(5294200, hashMap, "Emerald", 11907932, "Olive");
        i5.c.u(65280, hashMap, "Green", 43115, "Jade");
        i5.c.u(2730887, hashMap, "Jungle", 12582656, "Lime");
        i5.c.u(776785, hashMap, "Malachite", 10026904, "Mint");
        i5.c.u(11394989, hashMap, "Moss", 3234721, "Azure");
        i5.c.u(org.telegram.messenger.ls.e4, hashMap, "Blue", 18347, "Cobalt");
        i5.c.u(5204422, hashMap, "Indigo", 96647, "Lagoon");
        i5.c.u(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        i5.c.u(128, hashMap, "Navy", 3101086, "Sapphire");
        i5.c.u(7788522, hashMap, "Sky", 32896, "Teal");
        i5.c.u(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        i5.c.u(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        i5.c.u(13148872, hashMap, "Lilac", 11894492, "Lavender");
        i5.c.u(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        i5.c.u(6684825, hashMap, "Purple", 14204888, "Thistle");
        i5.c.u(14315734, hashMap, "Orchid", 2361920, "Violet");
        i5.c.u(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        i5.c.u(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        i5.c.u(7365973, hashMap, "Coffee", 7956873, "Rum");
        i5.c.u(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        i5.c.u(12759680, hashMap, "Sand", 8924439, "Sienna");
        i5.c.u(7864585, hashMap, "Maple", 15787660, "Khaki");
        i5.c.u(12088115, hashMap, "Copper", 12144200, "Chestnut");
        i5.c.u(15653316, hashMap, "Almond", 16776656, "Cream");
        i5.c.u(12186367, hashMap, "Diamond", 11109127, "Honey");
        i5.c.u(16777200, hashMap, "Ivory", 15392968, "Pearl");
        i5.c.u(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        i5.c.u(16777215, hashMap, "White", 8421504, "Gray");
        i5.c.u(0, hashMap, "Black", 15266260, "Chrome");
        i5.c.u(3556687, hashMap, "Charcoal", 789277, "Ebony");
        i5.c.u(12632256, hashMap, "Silver", 16119285, "Smoke");
        i5.c.u(2499381, hashMap, "Steel", 5220413, "Apple");
        i5.c.u(8434628, hashMap, "Glacier", 16693933, "Melon");
        i5.c.u(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.j6 k10 = j6Var == null ? org.telegram.ui.ActionBar.m6.D0().k(false) : j6Var;
        if (k10 == null || (i10 = k10.c) == 0) {
            i10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.m6.s0())[0];
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
            sb2 = p5.c.m((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder n10 = p5.c.n(str, " ");
            n10.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = n10.toString();
        }
        b5Var.setText(sb2);
        b5Var.setSelection(b5Var.length());
        d1 d1Var = new d1(i11, b5Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.setOnShowListener(d1Var);
        g2Var.showDialog(t1Var);
        b5Var.requestFocus();
        t1Var.d(-1).setOnClickListener(new fi.d0(g2Var, b5Var, j6Var, l6Var, t1Var, 9));
    }

    public static void U(Activity activity, String str, int i7, int i10, int i11, org.telegram.messenger.y10 y10Var) {
        if (activity == null) {
            return;
        }
        final int i12 = 0;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Aj, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ej, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E8, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G8, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
        final int i13 = 1;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.o10.j(activity, false, 1, null);
        j3.w0 = false;
        v3 v3Var = new v3(activity, null);
        w3 w3Var = new w3(activity, v3Var);
        w3Var.setOrientation(0);
        w3Var.setWeightSum(1.0f);
        v3Var.setAllItemsCount(24);
        v3Var.setItemCount(5);
        v3Var.setTextColor(x02);
        v3Var.setGravity(5);
        v3Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        x3 x3Var = new x3(activity, null);
        x3Var.setWrapSelectorWheel(true);
        x3Var.setAllItemsCount(60);
        x3Var.setItemCount(5);
        x3Var.setTextColor(x02);
        x3Var.setGravity(3);
        x3Var.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final di.y3 y3Var = new di.y3(i10, i11, v3Var, x3Var, i7, w3Var);
        w3Var.addView(v3Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
        v3Var.setFormatter(new l2(2));
        v3Var.setOnValueChangedListener(new rb0() { // from class: org.telegram.ui.Components.q2
            @Override // org.telegram.ui.Components.rb0
            public final void n(tb0 tb0Var, int i14) {
                switch (i12) {
                    case 0:
                        y3Var.a(Boolean.TRUE);
                        break;
                    default:
                        y3Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        w3Var.addView(x3Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
        x3Var.setFormatter(new l2(3));
        x3Var.setOnValueChangedListener(new rb0() { // from class: org.telegram.ui.Components.q2
            @Override // org.telegram.ui.Components.rb0
            public final void n(tb0 tb0Var, int i14) {
                switch (i13) {
                    case 0:
                        y3Var.a(Boolean.TRUE);
                        break;
                    default:
                        y3Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        y3Var.a(Boolean.FALSE);
        y3 y3Var2 = new y3(activity, v3Var, x3Var);
        y3Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        y3Var2.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        y3Var2.addView(w3Var, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.e eVar = new hi.e(activity, null, true);
        eVar.setRoundRadius(24);
        eVar.i(org.telegram.messenger.hd.N0(2131745476, null), false, true);
        eVar.setOnClickListener(new r2(r1, i12));
        y3Var2.addView(eVar, c8.ma.t(-1, 48, 0, 16, 12, 16, 12));
        j3.O = y3Var2;
        j3.show();
        j3.setOnDismissListener(new bi.k(y10Var, v3Var, x3Var, 5));
        j3.v0(x03);
        j3.P(x03);
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
    }

    public static org.telegram.ui.ActionBar.t1 V(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).g7;
        boolean z10 = true;
        final int[] iArr = new int[1];
        if (j3 != 0) {
            int i7 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i7;
            if (i7 == 3) {
                iArr[0] = 2;
            } else if (i7 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{org.telegram.messenger.hd.N0(2131743368, null), org.telegram.messenger.hd.N0(2131745170, null), org.telegram.messenger.hd.N0(2131748530, null), org.telegram.messenger.hd.N0(2131743367, null)};
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
            strArr = new String[]{org.telegram.messenger.hd.N0(2131743367, null), org.telegram.messenger.hd.N0(2131743368, null), org.telegram.messenger.hd.N0(2131745170, null), org.telegram.messenger.hd.N0(2131748530, null), org.telegram.messenger.hd.N0(2131747627, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, h6Var);
            k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i11));
            a(k6Var, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.E5, h6Var);
            k6Var.b(strArr2[i11], iArr[0] == i11 ? z10 : false);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).g7.edit();
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
                        org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).l(j11, j10);
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
                            org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).m(2);
                        } else if (str3.equals("vibrate_group")) {
                            org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).m(0);
                        } else if (str3.equals("vibrate_react")) {
                            org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).m(4);
                        } else {
                            org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.a.M0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
            z10 = true;
        }
        String N0 = org.telegram.messenger.hd.N0(2131743369, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752577, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.t1 W(Context context, org.telegram.ui.ActionBar.h6 h6Var, String[] strArr, int i7, String str, String str2, q0.a aVar) {
        boolean z10;
        int i10 = 0;
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.m6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.U = W2;
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(z10 ? 2131747106 : 2131752897, null), new a3.g(z10, context, atomicBoolean, aVar, 6));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752892, null), new h2(i10, atomicBoolean, aVar));
        t1Var.setOnDismissListener(new di.u1(7, atomicBoolean, aVar));
        return t1Var;
    }

    public static void X(int i7, int i10, long j3, org.telegram.messenger.y10 y10Var) {
        Y(i7, j3, i10, y10Var, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Y(final int i7, final long j3, int i10, org.telegram.messenger.y10 y10Var, long j10) {
        org.telegram.ui.ActionBar.h6 bVar;
        org.telegram.ui.ActionBar.h6 h6Var;
        TLRPC.Chat chat;
        char c10;
        Activity activity;
        long P1 = org.telegram.messenger.np.u1(i7).P1(j3);
        if (P1 <= 0 && j3 > 0) {
            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(i7).P2(j3));
        }
        long j11 = i10 * P1;
        di.y8.y(i7, false).P.put(Long.valueOf(j3), Integer.valueOf(i10));
        if (j11 <= 0 || j10 == j11) {
            y10Var.a(Long.valueOf(j11));
            return false;
        }
        final long j12 = P1;
        final n1 n1Var = new n1(i7, j11, j3, y10Var, j12, 1);
        if (j12 <= org.telegram.messenger.np.u1(i7).h7.getLong(p5.c.j(j3, "ask_paid_message_", "_price"), 0L)) {
            n1Var.run();
            return true;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) {
            bVar = new fi.b();
        } else {
            if (T == null) {
                h6Var = null;
                String s5 = org.telegram.messenger.n5.s(i7, j3);
                if (!org.telegram.messenger.v3.o0(i7, j3)) {
                    s5 = qg.c.i(i7, j3);
                } else if (T instanceof org.telegram.ui.bn) {
                    org.telegram.ui.bn bnVar = (org.telegram.ui.bn) T;
                    if (bnVar.v4 && bnVar.a() == j3 && (chat = bnVar.u4) != null) {
                        c10 = 0;
                        activity = u02;
                        s5 = org.telegram.messenger.n5.s(i7, -chat.id);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i11 = (int) j12;
                        Object[] objArr = new Object[1];
                        objArr[c10] = s5;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessage1", i11, ',', objArr)));
                        spannableStringBuilder.append((CharSequence) " ");
                        if (i10 == 1) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessage2One", i11)));
                        } else {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessage2Many1", (int) j11)));
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessage2Many2", i10)));
                        }
                        f0(activity, org.telegram.messenger.hd.N0(2131748361, null), spannableStringBuilder, org.telegram.messenger.hd.N0(2131748374, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.t1
                            @Override // org.telegram.messenger.y10
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i12 = i7;
                                    SharedPreferences.Editor edit = org.telegram.messenger.np.u1(i12).h7.edit();
                                    long j13 = j3;
                                    edit.putLong(p5.c.j(j13, "ask_paid_message_", "_price"), j12).apply();
                                    di.y8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                                }
                                org.telegram.messenger.g0.g3(n1Var);
                            }
                        }, h6Var, true);
                        return true;
                    }
                }
                c10 = 0;
                activity = u02;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i112 = (int) j12;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = s5;
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessage1", i112, ',', objArr2)));
                spannableStringBuilder2.append((CharSequence) " ");
                if (i10 == 1) {
                }
                f0(activity, org.telegram.messenger.hd.N0(2131748361, null), spannableStringBuilder2, org.telegram.messenger.hd.N0(2131748374, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.t1
                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i12 = i7;
                            SharedPreferences.Editor edit = org.telegram.messenger.np.u1(i12).h7.edit();
                            long j13 = j3;
                            edit.putLong(p5.c.j(j13, "ask_paid_message_", "_price"), j12).apply();
                            di.y8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                        }
                        org.telegram.messenger.g0.g3(n1Var);
                    }
                }, h6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        h6Var = bVar;
        String s52 = org.telegram.messenger.n5.s(i7, j3);
        if (!org.telegram.messenger.v3.o0(i7, j3)) {
        }
        c10 = 0;
        activity = u02;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
        int i1122 = (int) j12;
        Object[] objArr22 = new Object[1];
        objArr22[c10] = s52;
        spannableStringBuilder22.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessage1", i1122, ',', objArr22)));
        spannableStringBuilder22.append((CharSequence) " ");
        if (i10 == 1) {
        }
        f0(activity, org.telegram.messenger.hd.N0(2131748361, null), spannableStringBuilder22, org.telegram.messenger.hd.N0(2131748374, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.t1
            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i12 = i7;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.u1(i12).h7.edit();
                    long j13 = j3;
                    edit.putLong(p5.c.j(j13, "ask_paid_message_", "_price"), j12).apply();
                    di.y8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                }
                org.telegram.messenger.g0.g3(n1Var);
            }
        }, h6Var, true);
        return true;
    }

    public static boolean Z(int i7, ArrayList arrayList, int i10, org.telegram.messenger.y10 y10Var) {
        org.telegram.ui.ActionBar.h6 bVar;
        org.telegram.ui.ActionBar.h6 h6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            y10Var.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        long j3 = 0;
        boolean z11 = true;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Long l10 = (Long) obj;
            long j10 = j3;
            long longValue = l10.longValue();
            long P1 = org.telegram.messenger.np.u1(i7).P1(longValue);
            if (P1 <= 0 && longValue > 0) {
                P1 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(i7).P2(longValue));
            }
            hashMap.put(l10, Long.valueOf(P1));
            long j11 = j10 + P1;
            boolean z12 = z10;
            di.y8.y(i7, z10).P.put(l10, Integer.valueOf(i10));
            if (P1 > 0) {
                i11++;
            }
            if (P1 > 0 && z11 && org.telegram.messenger.np.u1(i7).h7.getLong(p5.c.j(longValue, "ask_paid_message_", "_price"), 0L) < P1) {
                z11 = z12;
            }
            j3 = j11;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i10) * j3;
        if (z11 || max <= 0) {
            y10Var.a(hashMap);
            return z13;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) {
            bVar = new fi.b();
        } else {
            if (T == null) {
                h6Var = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                spannableStringBuilder.append((CharSequence) " ");
                Object[] objArr = new Object[1];
                objArr[z13 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                f0(u02, org.telegram.messenger.hd.N0(2131748361, null), spannableStringBuilder, org.telegram.messenger.hd.N0(2131748374, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.wp(i7, max, u02, arrayList, hashMap, y10Var, h6Var), h6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        h6Var = bVar;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
        spannableStringBuilder2.append((CharSequence) " ");
        Object[] objArr2 = new Object[1];
        objArr2[z13 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
        f0(u02, org.telegram.messenger.hd.N0(2131748361, null), spannableStringBuilder2, org.telegram.messenger.hd.N0(2131748374, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.wp(i7, max, u02, arrayList, hashMap, y10Var, h6Var), h6Var, true);
        return true;
    }

    public static void a(org.telegram.ui.Cells.k6 k6Var, int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        for (int i11 = 0; i11 < k6Var.getChildCount(); i11++) {
            View childAt = k6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.t6.O((RadioButton) childAt, i7, i10, h6Var);
                return;
            }
        }
        k6Var.a(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
    }

    public static boolean a0(int i7, long j3) {
        long P1 = org.telegram.messenger.np.u1(i7).P1(j3);
        if (P1 <= 0 && j3 > 0) {
            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(i7).P2(j3));
        }
        return P1 > 0 && P1 > org.telegram.messenger.np.u1(i7).h7.getLong(p5.c.j(j3, "ask_paid_message_", "_price"), 0L);
    }

    public static void b(tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3) {
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
        tb0Var3.setMaxValue(i13);
        tb0Var3.setMinValue(i10);
        int value = tb0Var3.getValue();
        tb0Var2.setMaxValue(value == i13 ? i14 : 11);
        tb0Var2.setMinValue(value == i10 ? i11 : 0);
        int value2 = tb0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i13 && value2 == i14) {
            actualMaximum = Math.min(i15, actualMaximum);
        }
        tb0Var.setMaxValue(actualMaximum);
        if (value == i10 && value2 == i11) {
            i7 = i12;
        }
        tb0Var.setMinValue(i7);
    }

    public static void b0(b5 b5Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.g0.v1(b5Var);
        String obj = b5Var.getText().toString();
        int i7 = org.telegram.ui.ActionBar.m6.a;
        org.telegram.ui.ActionBar.l6 l6Var = new org.telegram.ui.ActionBar.l6();
        l6Var.b = new File(org.telegram.messenger.t0.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
        l6Var.a = obj;
        org.telegram.ui.ActionBar.m6.h0 = org.telegram.ui.ActionBar.m6.b1(org.telegram.ui.ActionBar.m6.I.j0);
        l6Var.F = org.telegram.messenger.k10.t0;
        org.telegram.ui.ActionBar.m6.x1(l6Var, true, true, false);
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.r4, new Object[0]);
        new ThemeEditorView().d(g2Var.getParentActivity(), l6Var);
        t1Var.dismiss();
        SharedPreferences g12 = org.telegram.messenger.np.g1();
        if (g12.getBoolean("themehint", false)) {
            return;
        }
        g12.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(g2Var.getParentActivity(), org.telegram.messenger.hd.N0(2131751698, null), 1).show();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static long c(hi.e eVar, tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3, tb0 tb0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i7 = 1;
        int i10 = calendar.get(1);
        int value = ((tb0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (tb0Var2.getValue() - 120) % 12);
        tb0Var.setMinValue(1);
        tb0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = tb0Var.getValue();
        int value3 = tb0Var3.getValue();
        int value4 = tb0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (eVar != null) {
            if (value2 == 0) {
                i7 = 0;
            } else if (i10 != value) {
                i7 = 2;
            }
            eVar.setText(org.telegram.messenger.hd.E0().x0(i7 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.t1 c0(final int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, Object... objArr) {
        String str;
        char c10;
        String str2;
        final long j3;
        long n10;
        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o4 = di.y8.o(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    n10 = org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    n10 = org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    n10 = org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    n10 = org.telegram.messenger.n5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    n10 = org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                } else {
                    j3 = 0;
                    if (o4 > 0) {
                        di.y8.y(i7, false).q(new Runnable() { // from class: org.telegram.ui.Components.k2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity u02 = org.telegram.messenger.g0.u0();
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.h6 bVar = (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) ? new fi.b() : T != null ? T.getResourceProvider() : null;
                                int i10 = i7;
                                long j10 = j3;
                                new di.fb(u02, bVar, o4, 13, org.telegram.messenger.n5.s(i10, j10), new org.telegram.messenger.j2(24), j10).show();
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
                    r0(g2Var2, org.telegram.messenger.hd.N0(2131749173, null), org.telegram.messenger.hd.N0(2131749174, null), null);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z10 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long n11 = org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (n11 >= 0) {
                        str2 = org.telegram.messenger.p10.k(org.telegram.messenger.np.u1(i7).c2(Long.valueOf(n11)), true);
                    } else {
                        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-n11));
                        str2 = O0 != null ? O0.title : "";
                    }
                    if (g2Var2 == null) {
                        g2Var2 = LaunchActivity.Q();
                    }
                    r0(g2Var2, org.telegram.messenger.hd.N0(2131748346, null), org.telegram.messenger.hd.a0(null, null, 2131748347, str2), null);
                    org.telegram.messenger.np.u1(i7).p2(0, n11);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.g2 Q = g2Var2 == null ? LaunchActivity.Q() : g2Var2;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749059, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749051, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749065, null), null);
                            return null;
                        }
                        r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749066, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749062, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749064, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749061, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749063, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        r0(Q, org.telegram.messenger.hd.N0(2131749060, null), org.telegram.messenger.hd.N0(2131749058, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        j0(tL_error.text, Q);
                        return null;
                    }
                    String N0 = org.telegram.messenger.hd.N0(2131749060, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                    sb2.append(tL_error.text);
                    r0(Q, N0, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.g2 Q2 = g2Var2 == null ? LaunchActivity.Q() : g2Var2;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            r0(Q2, null, org.telegram.messenger.hd.N0(2131748986, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            r0(Q2, null, org.telegram.messenger.hd.N0(2131750670, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            u0(Q2.getParentActivity(), org.telegram.messenger.hd.N0(2131743575, null), true);
                            return null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.ui.Cells.c0.u(null, 2131751093, sb3, "\n");
                        sb3.append(tL_error.text);
                        r0(Q2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i10 = org.telegram.messenger.ls.M0;
                    if (z12 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (g2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (g2Var2.getParentActivity() != null) {
                                g2Var2.showDialog(new ug.k0(5, i7, g2Var2.getParentActivity(), g2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                g2Var2.presentFragment(new p81(0));
                                return null;
                            }
                            g2Var2.presentFragment(new p81(1));
                            return null;
                        }
                        if (g2Var2 != null) {
                            e0(tL_error, g2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            org.telegram.messenger.ls.f(i7).k(i10, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.g2 Q3 = g2Var2 == null ? LaunchActivity.Q() : g2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new ug.k0(5, i7, Q3.getParentActivity(), Q3, null));
                                    return null;
                                }
                                Q3.presentFragment(new p81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.g2 g2Var3 = Q3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, g2Var3);
                                return null;
                            }
                            e0(tL_error, g2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.g2 Q4 = g2Var2 == null ? LaunchActivity.Q() : g2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q4.getParentActivity() != null) {
                                    Q4.showDialog(new ug.k0(5, i7, Q4.getParentActivity(), Q4, null));
                                    return null;
                                }
                                Q4.presentFragment(new p81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.g2 g2Var4 = Q4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, g2Var4);
                                return null;
                            }
                            e0(tL_error, g2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (g2Var2 != null) {
                                    r0(g2Var2, null, org.telegram.messenger.hd.N0(2131751259, null), null);
                                    return null;
                                }
                                t0(org.telegram.messenger.hd.N0(2131751259, null), null);
                                return null;
                            }
                        } else {
                            if (z10 || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long n12 = z10 ? org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? org.telegram.messenger.n5.n(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? org.telegram.messenger.n5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str3 = tL_error.text;
                                if (str3 == null || !str3.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str4 = tL_error.text;
                                    str4.getClass();
                                    switch (str4) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            org.telegram.messenger.ls.f(i7).k(i10, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            org.telegram.messenger.ls.f(i7).k(i10, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            t0(org.telegram.messenger.hd.N0(2131748336, null), g2Var2);
                                            break;
                                    }
                                    return null;
                                }
                                String str5 = tL_error.text;
                                TLRPC.Chat O02 = n12 < 0 ? org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-n12)) : null;
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
                                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
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
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
                                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
                                    */
                                /*
                                    Method dump skipped, instructions count: 2638
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c5.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.g2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.t1");
                            }

                            public static void d(tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i7 = 1;
                                int i10 = calendar.get(1);
                                int i11 = calendar.get(2);
                                int i12 = calendar.get(5);
                                tb0Var3.setMinValue(i10);
                                int value = tb0Var3.getValue();
                                tb0Var2.setMinValue(value == i10 ? i11 : 0);
                                int value2 = tb0Var2.getValue();
                                if (value == i10 && value2 == i11) {
                                    i7 = i12;
                                }
                                tb0Var.setMinValue(i7);
                            }

                            public static void d0(Context context, org.telegram.ui.ActionBar.h6 h6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.y10 y10Var, um umVar) {
                                Activity W = org.telegram.messenger.g0.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                                String N0 = org.telegram.messenger.hd.N0(2131746959, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.hd.N0(2131746960, null);
                                final i4 i4Var = new i4(context);
                                i4Var.setTextSize(1, 16.0f);
                                int i10 = org.telegram.ui.ActionBar.m6.j5;
                                org.telegram.ui.ActionBar.t6.U(i4Var, i10, h6Var);
                                org.telegram.ui.ActionBar.t6.D(i4Var, org.telegram.ui.ActionBar.m6.Oi, h6Var);
                                i4Var.setHint(org.telegram.messenger.hd.N0(2131746958, null));
                                i4Var.setInputType(17);
                                i4Var.setImeOptions(6);
                                i4Var.setMaxLines(10);
                                i4Var.setSingleLine(false);
                                i4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                                i4Var.setCursorWidth(1.5f);
                                i4Var.A(org.telegram.ui.ActionBar.m6.q6, h6Var);
                                if (str != null) {
                                    i4Var.setText(str);
                                    i4Var.setSelection(str.length());
                                }
                                i4Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.o2
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                                        if (i11 != 6) {
                                            return false;
                                        }
                                        i4 i4Var2 = i4.this;
                                        String trim = i4Var2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : c5.a.matcher(trim.trim()).matches())) {
                                            org.telegram.messenger.g0.D3(i4Var2);
                                            return true;
                                        }
                                        y10Var.a(trim);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
                                        if (t1Var2 != null) {
                                            t1Var2.dismiss();
                                        }
                                        View view = currentFocus;
                                        if (view != null) {
                                            view.requestFocus();
                                        }
                                        return true;
                                    }
                                });
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
                                org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.06f, i10);
                                i4Var.setBackground(d02);
                                org.telegram.ui.ActionBar.t6.j(i4Var, d02, K, null, h6Var);
                                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                g10.addView(i4Var, c8.ma.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i11 = p71.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    p71 p71Var = new p71(context, h6Var);
                                    p71Var.setWebPage(webPage);
                                    g10.addView(p71Var, c8.ma.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.c();
                                alertDialog$Builder.o(g10);
                                t1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                int i12 = 2;
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751342, null), new h2(i12, i4Var, y10Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new l2(1));
                                if (umVar != null) {
                                    alertDialog$Builder.i(org.telegram.messenger.hd.N0(2131751586, null), new e1(4, umVar));
                                }
                                t1VarArr[0] = t1Var;
                                t1Var.k0 = false;
                                t1Var.setOnDismissListener(new z0(i4Var, i12));
                                t1VarArr[0].setOnShowListener(new p2(i4Var, i7));
                                t1VarArr[0].show();
                                TextView textView = (TextView) t1VarArr[0].d(-3);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                }
                            }

                            public static void e(TextView textView, tb0 tb0Var, g4 g4Var, h4 h4Var) {
                                int value = tb0Var.getValue();
                                int value2 = g4Var.getValue();
                                int value3 = h4Var.getValue();
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
                                textView.setText(org.telegram.messenger.hd.a0(null, null, 2131746980, org.telegram.messenger.hd.a0(null, null, 2131746979, i7 > 0 ? org.telegram.messenger.hd.G(i7, "Days", new Object[0]) : "", i10 > 0 ? org.telegram.messenger.hd.G(i10, "Hours", new Object[0]) : "", i11 > 0 ? org.telegram.messenger.hd.G(i11, "Minutes", new Object[0]) : "").trim()));
                            }

                            public static void e0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                org.telegram.ui.ActionBar.t1 t1Var;
                                int i7;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || g2Var == null || g2Var.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
                                String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                                t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                String str = tL_error.text;
                                str.getClass();
                                i7 = 1;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        t1Var.U = org.telegram.messenger.hd.N0(2131748565, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        t1Var.U = org.telegram.messenger.hd.N0(2131746396, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        t1Var.U = org.telegram.messenger.hd.N0(2131751736, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131749196, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131752259, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        t1Var.U = org.telegram.messenger.hd.N0(2131743483, null);
                                        break;
                                    case "PEER_FLOOD":
                                        t1Var.U = org.telegram.messenger.hd.N0(2131747933, null);
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131748138, null), new e3(i7, g2Var));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131749194, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131752257, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131754474, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131754361, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        t1Var.U = org.telegram.messenger.hd.N0(2131742576, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        t1Var.U = org.telegram.messenger.hd.N0(2131754462, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131749197, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131752260, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131749195, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131752258, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        t1Var.S = org.telegram.messenger.hd.N0(2131752270, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131752271, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131752272, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        t1Var.S = org.telegram.messenger.hd.N0(2131752270, null);
                                        t1Var.U = org.telegram.messenger.hd.N0(2131743512, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131749193, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131752256, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        t1Var.U = org.telegram.messenger.hd.N0(2131754473, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z11) {
                                            if (!z10) {
                                                t1Var.U = org.telegram.messenger.hd.N0(2131748916, null);
                                                break;
                                            } else {
                                                t1Var.U = org.telegram.messenger.hd.N0(2131748919, null);
                                                break;
                                            }
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.N0(2131748918, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        t1Var.S = org.telegram.messenger.hd.N0(2131743061, null);
                                        t1Var.U = org.telegram.messenger.hd.N0(2131743131, null);
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                                        sb2.append(tL_error.text);
                                        t1Var.U = sb2.toString();
                                        break;
                                }
                                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
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
                                        user = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(tL_missingInvitee2.user_id));
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
                                org.telegram.messenger.g0.h3(new ai.i1(i7, chat, arrayList, arrayList2, arrayList3, 15), 200L);
                            }

                            public static org.telegram.ui.ActionBar.t1 f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
                                if (activity == null) {
                                    y10Var.a(Boolean.FALSE);
                                    return null;
                                }
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
                                int i10 = 1;
                                org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
                                boolean[] zArr = {false};
                                di.xb xbVar = new di.xb(activity, 23);
                                org.telegram.messenger.ls.i(xbVar);
                                org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.j5, h6Var);
                                xbVar.setTextSize(1, 16.0f);
                                int i11 = 3;
                                xbVar.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                xbVar.setText(charSequence);
                                p3 p3Var = new p3(activity, d2VarArr, i10);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.H = 6;
                                alertDialog$Builder.o(p3Var);
                                TextView textView = new TextView(activity);
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.E8, h6Var, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                p3Var.addView(textView, c8.ma.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                p3Var.addView(xbVar, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, activity, h6Var);
                                    d2VarArr[0] = d2Var;
                                    int i12 = org.telegram.ui.ActionBar.m6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 7, org.telegram.messenger.g0.L(12.0f));
                                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
                                    d2Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.t6.j(d2Var, h02, null, M, h6Var);
                                    d2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (org.telegram.messenger.hd.a0 ? 5 : 3) | 16;
                                    d2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    d2VarArr[0].e(charSequence2, "", false, false, false);
                                    d2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                                    p3Var.addView(d2VarArr[0], c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    d2VarArr[0].setOnClickListener(new g1(i11, zArr));
                                }
                                alertDialog$Builder.k(str2, new b3(i7, y10Var, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                if (z10) {
                                    t1Var.Y0 = true;
                                }
                                t1Var.show();
                                return t1Var;
                            }

                            public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i7, tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3) {
                                long j11;
                                int i10;
                                long j12;
                                int i11;
                                int i12;
                                int i13;
                                boolean z10;
                                boolean z11;
                                String G;
                                int value = tb0Var.getValue();
                                int value2 = tb0Var2.getValue();
                                int value3 = tb0Var3.getValue();
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
                                tb0Var.setMinValue(0);
                                if (j14 > 0) {
                                    tb0Var.setMaxValue(i11);
                                }
                                int value4 = tb0Var.getValue();
                                tb0Var2.setMinValue(value4 == 0 ? i16 : 0);
                                if (j14 > 0) {
                                    tb0Var2.setMaxValue(value4 == i11 ? i12 : 23);
                                }
                                int value5 = tb0Var2.getValue();
                                tb0Var3.setMinValue((value4 == 0 && value5 == i16) ? i17 : 0);
                                if (j14 > 0) {
                                    tb0Var3.setMaxValue((value4 == i11 && value5 == i12) ? i15 : 59);
                                }
                                int value6 = tb0Var3.getValue();
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
                                        z11 = false;
                                        G = org.telegram.messenger.hd.G(Math.round(i19 / 86400.0f), "DaysSchedule", new Object[0]);
                                    } else {
                                        z11 = false;
                                        z11 = false;
                                        z11 = false;
                                        G = i19 >= 3600 ? org.telegram.messenger.hd.G(Math.round(i19 / 3600.0f), "HoursSchedule", new Object[0]) : i19 >= 60 ? org.telegram.messenger.hd.G(Math.round(i19 / 60.0f), "MinutesSchedule", new Object[0]) : org.telegram.messenger.hd.G(i19, "SecondsSchedule", new Object[0]);
                                    }
                                    if (textView2.getTag() != null) {
                                        z10 = true;
                                        Object[] objArr = new Object[1];
                                        objArr[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.hd.a0("VoipChannelScheduleInfo", null, 2131743218, objArr));
                                    } else {
                                        z10 = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.hd.a0("VoipGroupScheduleInfo", null, 2131743097, objArr2));
                                    }
                                } else {
                                    z10 = true;
                                    z11 = false;
                                }
                                return timeInMillis - j11 > millis ? z10 : z11;
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
                            /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String, org.telegram.ui.ActionBar.h6, org.telegram.ui.ActionBar.q1] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [org.telegram.ui.Cells.d2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [org.telegram.ui.Cells.d2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.g2] */
                            /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [org.telegram.ui.Cells.d2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void g0(org.telegram.ui.ActionBar.g2 g2Var, long j3, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final org.telegram.messenger.or orVar, org.telegram.ui.ActionBar.h6 h6Var) {
                                long j10;
                                boolean z11;
                                String str;
                                String N0;
                                ?? r92;
                                ?? r14;
                                TextView textView;
                                String str2;
                                if (g2Var.getParentActivity() == null) {
                                    return;
                                }
                                final org.telegram.messenger.c accountInstance = g2Var.getAccountInstance();
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), h6Var);
                                SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).g7;
                                int i7 = 1;
                                if (encryptedChat == null) {
                                    j10 = j3;
                                    if (!org.telegram.messenger.f3.w("dialog_bar_report", j10, sharedPreferences, false)) {
                                        z11 = false;
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                        if (user == null) {
                                            t1Var.S = org.telegram.messenger.hd.a0("BlockUserTitle", null, 2131753682, org.telegram.messenger.p10.k(user, true));
                                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("BlockUserAlert", null, 2131753688, org.telegram.messenger.p10.k(user, true)));
                                            String N02 = org.telegram.messenger.hd.N0(2131753690, null);
                                            int i10 = 2;
                                            r92 = new org.telegram.ui.Cells.d2[2];
                                            int i11 = 0;
                                            ?? linearLayout = new LinearLayout(g2Var.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i12 = 0;
                                            while (i12 < i10) {
                                                if (i12 != 0 || z11) {
                                                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(i7, g2Var.getParentActivity(), h6Var);
                                                    r92[i12] = d2Var;
                                                    d2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(i11));
                                                    r92[i12].setTag(Integer.valueOf(i12));
                                                    if (i12 == 0) {
                                                        r92[i12].e(org.telegram.messenger.hd.N0(2131751490, null), "", true, false, false);
                                                        str2 = N02;
                                                    } else {
                                                        str2 = N02;
                                                        r92[i12].e(org.telegram.messenger.hd.a0("DeleteThisChat", null, 2131751470, new Object[i11]), "", true, false, false);
                                                    }
                                                    r92[i12].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    linearLayout.addView(r92[i12], c8.ma.o(-1, -2));
                                                    r92[i12].setOnClickListener(new a1(r92, 1));
                                                } else {
                                                    str2 = N02;
                                                }
                                                i12++;
                                                N02 = str2;
                                                i7 = 1;
                                                i10 = 2;
                                                i11 = 0;
                                            }
                                            alertDialog$Builder.o(linearLayout);
                                            N0 = N02;
                                            r14 = 0;
                                        } else {
                                            if (chat == null || !z10) {
                                                str = null;
                                                str = null;
                                                t1Var.S = org.telegram.messenger.hd.N0(2131746004, null);
                                                if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                                                    t1Var.U = org.telegram.messenger.hd.N0(2131746008, null);
                                                } else {
                                                    t1Var.U = org.telegram.messenger.hd.N0(2131746009, null);
                                                }
                                            } else {
                                                t1Var.S = org.telegram.messenger.hd.N0(2131745993, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("ReportUnrelatedGroupText", null, 2131745992, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                t1Var.U = org.telegram.messenger.hd.N0(2131745991, null);
                                            }
                                            N0 = org.telegram.messenger.hd.N0(2131746034, str);
                                            r92 = str;
                                            r14 = str;
                                        }
                                        final org.telegram.ui.Cells.d2[] d2VarArr = r92;
                                        final long j11 = j10;
                                        alertDialog$Builder.k(N0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.s1
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                                                org.telegram.ui.Cells.d2 d2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                org.telegram.messenger.c cVar = accountInstance;
                                                if (user2 != null) {
                                                    org.telegram.messenger.np.u1(cVar.a).w(user2.id);
                                                }
                                                org.telegram.ui.Cells.d2[] d2VarArr2 = d2VarArr;
                                                long j12 = j11;
                                                TLRPC.Chat chat2 = chat;
                                                if (d2VarArr2 == null || ((d2Var2 = d2VarArr2[0]) != null && d2Var2.b())) {
                                                    org.telegram.messenger.np.u1(cVar.a).w4(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                                                }
                                                org.telegram.messenger.or orVar2 = orVar;
                                                if (d2VarArr2 != null && !d2VarArr2[1].b()) {
                                                    orVar2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    org.telegram.messenger.np.u1(cVar.a).X(0, j12, false);
                                                } else if (org.telegram.messenger.v3.r0(chat2)) {
                                                    org.telegram.messenger.np.u1(cVar.a).X(0, j12, false);
                                                } else {
                                                    int i14 = cVar.a;
                                                    org.telegram.messenger.np.u1(i14).f0(-j12, org.telegram.messenger.np.u1(i14).c2(Long.valueOf(org.telegram.messenger.k10.i(i14).e())));
                                                }
                                                orVar2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, r14), r14);
                                        g2Var.showDialog(t1Var);
                                        textView = (TextView) t1Var.d(-1);
                                        if (textView == null) {
                                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, r14);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    j10 = j3;
                                }
                                z11 = true;
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                                if (user == null) {
                                }
                                final org.telegram.ui.Cells.d2[] d2VarArr2 = r92;
                                final long j112 = j10;
                                alertDialog$Builder.k(N0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.s1
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i13) {
                                        org.telegram.ui.Cells.d2 d2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        org.telegram.messenger.c cVar = accountInstance;
                                        if (user2 != null) {
                                            org.telegram.messenger.np.u1(cVar.a).w(user2.id);
                                        }
                                        org.telegram.ui.Cells.d2[] d2VarArr22 = d2VarArr2;
                                        long j12 = j112;
                                        TLRPC.Chat chat2 = chat;
                                        if (d2VarArr22 == null || ((d2Var2 = d2VarArr22[0]) != null && d2Var2.b())) {
                                            org.telegram.messenger.np.u1(cVar.a).w4(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                                        }
                                        org.telegram.messenger.or orVar2 = orVar;
                                        if (d2VarArr22 != null && !d2VarArr22[1].b()) {
                                            orVar2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            org.telegram.messenger.np.u1(cVar.a).X(0, j12, false);
                                        } else if (org.telegram.messenger.v3.r0(chat2)) {
                                            org.telegram.messenger.np.u1(cVar.a).X(0, j12, false);
                                        } else {
                                            int i14 = cVar.a;
                                            org.telegram.messenger.np.u1(i14).f0(-j12, org.telegram.messenger.np.u1(i14).c2(Long.valueOf(org.telegram.messenger.k10.i(i14).e())));
                                        }
                                        orVar2.a(1);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, r14), r14);
                                g2Var.showDialog(t1Var2);
                                textView = (TextView) t1Var2.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static boolean h(Context context, int i7, long j3, boolean z10) {
                                TLRPC.Chat O0;
                                if (!org.telegram.messenger.n5.z(j3) || (O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-j3))) == null || !O0.slowmode_enabled || org.telegram.messenger.v3.N(O0)) {
                                    return false;
                                }
                                if (!z10) {
                                    TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i7).P0(O0.id);
                                    if (P0 == null) {
                                        P0 = org.telegram.messenger.ur.a0(i7).F0(O0.id, org.telegram.messenger.v3.T(O0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (P0 != null && P0.slowmode_next_send_date >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    return false;
                                }
                                K(context, O0.title, org.telegram.messenger.hd.N0(2131745106, null)).p();
                                return true;
                            }

                            public static void h0(org.telegram.ui.bn bnVar, org.telegram.messenger.gj gjVar, long j3, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.vf vfVar) {
                                if (bnVar.getParentActivity() == null || gjVar == null) {
                                    return;
                                }
                                org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                                TLRPC.User c22 = j3 > 0 ? org.telegram.messenger.np.u1(accountInstance.a).c2(Long.valueOf(j3)) : null;
                                TLRPC.Chat O0 = j3 < 0 ? org.telegram.messenger.np.u1(accountInstance.a).O0(Long.valueOf(-j3)) : null;
                                if (c22 == null && O0 == null) {
                                    return;
                                }
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), h6Var);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.Q0 = false;
                                t1Var.O = new z0(vfVar, i7);
                                t1Var.S = org.telegram.messenger.hd.N0(2131753689, null);
                                if (c22 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753683, org.telegram.messenger.p10.k(c22, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753683, O0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(bnVar.getParentActivity());
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.d2[] d2VarArr = {new org.telegram.ui.Cells.d2(1, bnVar.getParentActivity(), h6Var)};
                                d2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                                d2VarArr[0].setTag(0);
                                d2VarArr[0].e(org.telegram.messenger.hd.N0(2131751490, null), "", true, false, false);
                                d2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                linearLayout.addView(d2VarArr[0], c8.ma.o(-1, -2));
                                d2VarArr[0].setOnClickListener(new a1(d2VarArr, i7));
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131753692, null), new c1(c22, accountInstance, bnVar, O0, gjVar, d2VarArr, h6Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                bnVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                }
                            }

                            public static org.telegram.ui.ActionBar.t1 i(Activity activity, y4 y4Var) {
                                if (org.telegram.messenger.k10.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                di.u3 u3Var = t1Var.M0;
                                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                                LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
                                for (int i7 = 0; i7 < 4; i7++) {
                                    if (org.telegram.messenger.k10.i(i7).f() != null) {
                                        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                                        kVar.f = i7;
                                        TLRPC.User f11 = org.telegram.messenger.k10.i(i7).f();
                                        b9 b9Var = kVar.e;
                                        b9Var.r(f11);
                                        kVar.a.l(org.telegram.messenger.i5.m(0, f11.first_name, f11.last_name), false);
                                        q9 q9Var = kVar.c;
                                        q9Var.getImageReceiver().d = i7;
                                        q9Var.f(f11, b9Var);
                                        kVar.d.setVisibility(4);
                                        kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                                        kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                                        f10.addView(kVar, c8.ma.o(-1, 50));
                                        kVar.setOnClickListener(new ah.h((Object) t1VarArr, (Runnable) u3Var, (Object) y4Var, 22));
                                    }
                                }
                                t1Var.S = org.telegram.messenger.hd.N0(2131745475, null);
                                alertDialog$Builder.o(f10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752577, null), null);
                                t1VarArr[0] = t1Var;
                                return t1Var;
                            }

                            public static void i0(Context context, int i7, long j3) {
                                org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, null, false);
                                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                g10.addView(frameLayout, c8.ma.t(-1, 92, 17, 0, 0, 0, 0));
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                imageView.setImageResource(R.drawable.story_link);
                                imageView.setScaleX(2.0f);
                                imageView.setScaleY(2.0f);
                                frameLayout2.addView(imageView, c8.ma.e(-1, -1, 17));
                                int L = org.telegram.messenger.g0.L(80.0f);
                                int i10 = org.telegram.ui.ActionBar.m6.Fi;
                                ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.v0(i10));
                                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
                                frameLayout2.setBackground(L2);
                                org.telegram.ui.ActionBar.t6.j(frameLayout2, L2, M, null, null);
                                frameLayout.addView(frameLayout2, c8.ma.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i11 = org.telegram.ui.ActionBar.m6.G6;
                                org.telegram.messenger.f3.l(textView, i11, null, 1, 20.0f);
                                textView.setText(org.telegram.messenger.hd.N0(2131752612, null));
                                textView.setGravity(17);
                                TextView f10 = org.telegram.messenger.o10.f(g10, textView, c8.ma.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                org.telegram.ui.ActionBar.t6.U(f10, i11, null);
                                f10.setTextSize(1, 14.0f);
                                org.telegram.messenger.f3.q(null, null, 2131752613, new Object[]{org.telegram.messenger.n5.l(i7, j3)}, f10);
                                f10.setGravity(17);
                                g10.addView(f10, c8.ma.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                hi.e eVar = new hi.e(context, null, true);
                                eVar.i(org.telegram.messenger.hd.N0(2131752614, null), false, true);
                                g10.addView(eVar, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                j10.O = g10;
                                eVar.setOnClickListener(new org.telegram.ui.gd(i7, eVar, j10, j3));
                                j10.O();
                                j10.show();
                            }

                            public static org.telegram.ui.ActionBar.t1 j(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                                String N0 = org.telegram.messenger.hd.N0(2131754240, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.U = N0;
                                int i7 = org.telegram.ui.ActionBar.m6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.m6.x0(null, i7, false), null);
                                alertDialog$Builder.n(i7, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747106, null), new u0(context, 0));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751760, null), null);
                                return t1Var;
                            }

                            public static void j0(String str, org.telegram.ui.ActionBar.g2 g2Var) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || g2Var == null || g2Var.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
                                String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750669, G);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                g2Var.showDialog(t1Var, true, null);
                            }

                            public static void k(Context context, org.telegram.ui.ActionBar.h6 h6Var, a5 a5Var) {
                                if (context == null) {
                                    return;
                                }
                                boolean z10 = false;
                                int i7 = org.telegram.ui.ActionBar.m6.j5;
                                int i10 = h6Var != null ? h6Var.i(i7) : org.telegram.ui.ActionBar.m6.x0(null, i7, false);
                                int i11 = org.telegram.ui.ActionBar.m6.h5;
                                int i12 = h6Var != null ? h6Var.i(i11) : org.telegram.ui.ActionBar.m6.x0(null, i11, false);
                                int i13 = org.telegram.ui.ActionBar.m6.Aj;
                                if (h6Var != null) {
                                    h6Var.i(i13);
                                } else {
                                    org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                                }
                                int i14 = org.telegram.ui.ActionBar.m6.Ej;
                                if (h6Var != null) {
                                    h6Var.i(i14);
                                } else {
                                    org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                                }
                                int i15 = org.telegram.ui.ActionBar.m6.E8;
                                if (h6Var != null) {
                                    h6Var.i(i15);
                                } else {
                                    org.telegram.ui.ActionBar.m6.x0(null, i15, false);
                                }
                                int i16 = org.telegram.ui.ActionBar.m6.G8;
                                if (h6Var != null) {
                                    h6Var.i(i16);
                                } else {
                                    org.telegram.ui.ActionBar.m6.x0(null, i16, false);
                                }
                                int i17 = org.telegram.ui.ActionBar.m6.i6;
                                if (h6Var != null) {
                                    h6Var.i(i17);
                                } else {
                                    org.telegram.ui.ActionBar.m6.x0(null, i17, false);
                                }
                                int i18 = org.telegram.ui.ActionBar.m6.Ji;
                                int i19 = h6Var != null ? h6Var.i(i18) : org.telegram.ui.ActionBar.m6.x0(null, i18, false);
                                int i20 = org.telegram.ui.ActionBar.m6.Fi;
                                int i21 = h6Var != null ? h6Var.i(i20) : org.telegram.ui.ActionBar.m6.x0(null, i20, false);
                                int i22 = org.telegram.ui.ActionBar.m6.Hi;
                                int i23 = h6Var != null ? h6Var.i(i22) : org.telegram.ui.ActionBar.m6.x0(null, i22, false);
                                hi.w4 w4Var = new hi.w4(context, h6Var);
                                ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                l4 l4Var = new l4(context, h6Var, iArr);
                                l4Var.setMinValue(0);
                                l4Var.setMaxValue(16);
                                l4Var.setTextColor(i10);
                                l4Var.setValue(0);
                                l4Var.setFormatter(new f1(iArr, 1));
                                m4 m4Var = new m4(context, l4Var, 0);
                                boolean z11 = true;
                                m4Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                m4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(org.telegram.messenger.hd.N0(2131753874, null));
                                textView.setTextColor(i10);
                                i5.c.x(textView, 1, 20.0f);
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                m4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, z11, z11, z10, 1);
                                linearLayout.addView(l4Var, c8.ma.l(1.0f, 0, org.telegram.messenger.ls.t4));
                                x3Var.setPadding(0, 0, 0, 0);
                                x3Var.setGravity(17);
                                x3Var.setTextColor(i19);
                                x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                                x3Var.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                x3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, i21, i23, i23));
                                m4Var.addView(x3Var, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                                x3Var.setText(org.telegram.messenger.hd.N0(2131751422, null));
                                l4Var.setOnValueChangedListener(new c0(x3Var, 9));
                                x3Var.setOnClickListener(new bi.p6(iArr, l4Var, a5Var, w4Var, 9));
                                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var.b;
                                w2Var.O = m4Var;
                                w2Var.show();
                                w2Var.v0(i12);
                                w2Var.P(i12);
                            }

                            public static void k0(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, TL_stars.StarGift starGift, long j3, Runnable runnable) {
                                TLObject g22 = org.telegram.messenger.np.u1(i7).g2(j3);
                                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                g10.addView(new di.c5(context, starGift, g22), c8.ma.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
                                textView.setTextSize(1, 16.0f);
                                org.telegram.messenger.f3.q(null, null, 2131749418, new Object[]{org.telegram.messenger.n5.H(null, null, g22)}, textView);
                                g10.addView(textView, c8.ma.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                                alertDialog$Builder.o(g10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131749419, null), new e1(2, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                alertDialog$Builder.p();
                            }

                            public static hi.w4 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.y10 y10Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.h6 h6Var) {
                                if (context == null) {
                                    return null;
                                }
                                hi.w4 w4Var = new hi.w4(context, h6Var);
                                int i7 = 0;
                                ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
                                tb0 tb0Var = new tb0(context, h6Var);
                                tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                tb0Var.setItemCount(5);
                                tb0 tb0Var2 = new tb0(context, h6Var);
                                tb0Var2.setItemCount(5);
                                tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                tb0 tb0Var3 = new tb0(context, h6Var);
                                tb0Var3.setItemCount(5);
                                tb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                d4 d4Var = new d4(context, tb0Var, tb0Var2, tb0Var3);
                                d4Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                d4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.j5, h6Var, 1, 20.0f);
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                d4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i10 = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i11 = calendar.get(5);
                                int i12 = calendar.get(2);
                                int i13 = calendar.get(1);
                                int i14 = i13 + 1;
                                x2 x2Var = new x2(tb0Var3, i14, tb0Var, tb0Var2, i13, i12, i11);
                                System.currentTimeMillis();
                                e4 e4Var = new e4(context);
                                linearLayout.addView(tb0Var, c8.ma.l(0.25f, 0, org.telegram.messenger.ls.t4));
                                tb0Var.setMinValue(1);
                                tb0Var.setMaxValue(31);
                                tb0Var.setWrapSelectorWheel(false);
                                tb0Var.setFormatter(new l2(6));
                                c0 c0Var = new c0(x2Var, 8);
                                tb0Var.setOnScrollListener(c0Var);
                                tb0Var2.setMinValue(0);
                                tb0Var2.setMaxValue(11);
                                tb0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(tb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
                                tb0Var2.setFormatter(new l2(7));
                                tb0Var2.setOnScrollListener(c0Var);
                                tb0Var3.setMinValue(i10);
                                tb0Var3.setMaxValue(i14);
                                tb0Var3.setWrapSelectorWheel(false);
                                tb0Var3.setFormatter(new l2.t(i14, 5));
                                linearLayout.addView(tb0Var3, c8.ma.l(0.25f, 0, org.telegram.messenger.ls.t4));
                                tb0Var3.setOnScrollListener(c0Var);
                                if (tL_birthday != null) {
                                    tb0Var.setValue(tL_birthday.day);
                                    tb0Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        tb0Var3.setValue(tL_birthday.year);
                                    } else {
                                        tb0Var3.setValue(i14);
                                    }
                                } else {
                                    tb0Var.setValue(calendar.get(5));
                                    tb0Var2.setValue(calendar.get(2));
                                    tb0Var3.setValue(i14);
                                }
                                x2Var.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    m80 m80Var = new m80(context, null);
                                    m80Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    m80Var.setTextSize(1, 13.0f);
                                    org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.q5, h6Var);
                                    org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
                                    m80Var.setGravity(17);
                                    frameLayout2.addView(m80Var, c8.ma.e(-2, -2, 17));
                                    d4Var.addView(frameLayout2, c8.ma.o(-1, -2));
                                    int i15 = org.telegram.messenger.k10.t0;
                                    org.telegram.ui.ii iiVar = new org.telegram.ui.ii(i15, m80Var, 4);
                                    iiVar.run();
                                    org.telegram.messenger.ls.f(i15).h(frameLayout2, org.telegram.messenger.ls.k0, new z2(iiVar, i7));
                                    org.telegram.messenger.i5.r(i15).D(false);
                                }
                                if (z10) {
                                    hi.e eVar = new hi.e(context, h6Var, false);
                                    eVar.i(org.telegram.messenger.hd.N0(2131751658, null), false, true);
                                    eVar.setOnClickListener(new bi.h5(tb0Var3, i14, x2Var, 9));
                                    d4Var.addView(eVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                e4Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                e4Var.setGravity(17);
                                org.telegram.ui.ActionBar.t6.U(e4Var, org.telegram.ui.ActionBar.m6.Ji, h6Var);
                                e4Var.setTextSize(1, 14.0f);
                                e4Var.setTypeface(org.telegram.messenger.g0.o());
                                e4Var.setText(str2);
                                int L = org.telegram.messenger.g0.L(24.0f);
                                int i16 = org.telegram.ui.ActionBar.m6.Fi;
                                int w02 = org.telegram.ui.ActionBar.m6.w0(i16, h6Var);
                                int i17 = org.telegram.ui.ActionBar.m6.Hi;
                                int w03 = org.telegram.ui.ActionBar.m6.w0(i17, h6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
                                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i17);
                                e4Var.setBackground(k02);
                                org.telegram.ui.ActionBar.t6.j(e4Var, k02, M, M2, h6Var);
                                c8.ra.b(e4Var, 0.02f, 1.2f);
                                d4Var.addView(e4Var, c8.ma.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
                                e4Var.setOnClickListener(new di.z9(tb0Var, tb0Var2, tb0Var3, i14, w4Var, y10Var));
                                if (z11) {
                                    hi.e eVar2 = new hi.e(context, h6Var, false);
                                    eVar2.i(org.telegram.messenger.hd.N0(2131753712, null), false, true);
                                    eVar2.f();
                                    eVar2.setOnClickListener(new oi.i1(25, w4Var, y10Var));
                                    d4Var.addView(eVar2, c8.ma.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((org.telegram.ui.ActionBar.w2) w4Var.b).O = d4Var;
                                return w4Var;
                            }

                            public static void l0(Context context, org.telegram.ui.ActionBar.h6 h6Var, String str, boolean z10, final org.telegram.messenger.r10 r10Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    final int i7 = 1;
                                    final org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                                    final int i10 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                                    String N0 = org.telegram.messenger.hd.N0(2131747585, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = N0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i11 = org.telegram.ui.ActionBar.m6.j5;
                                    org.telegram.ui.ActionBar.t6.U(textView, i11, h6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)));
                                    org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.06f, i11);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.t6.j(textView, d02, K, null, h6Var);
                                    final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, h6Var);
                                    d2Var.setMultiline(true);
                                    d2Var.getTextView().getLayoutParams().width = -1;
                                    d2Var.getTextView().setSingleLine(false);
                                    d2Var.getTextView().setMaxLines(3);
                                    d2Var.getTextView().setTextSize(1, 16.0f);
                                    d2Var.e(org.telegram.messenger.hd.N0(z10 ? 2131752865 : 2131752864, null), "", false, false, false);
                                    d2Var.setOnClickListener(new j1(d2Var, i10));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, c8.ma.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(d2Var, c8.ma.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.o(linearLayout);
                                    t1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747623, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.k1
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                                            switch (i10) {
                                                case 0:
                                                    r10Var.a(Boolean.TRUE, Boolean.valueOf(d2Var.b()));
                                                    org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
                                                    if (t1Var3 != null) {
                                                        t1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    r10Var.a(Boolean.FALSE, Boolean.valueOf(d2Var.b()));
                                                    org.telegram.ui.ActionBar.t1 t1Var4 = t1VarArr[0];
                                                    if (t1Var4 != null) {
                                                        t1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.k1
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                                            switch (i7) {
                                                case 0:
                                                    r10Var.a(Boolean.TRUE, Boolean.valueOf(d2Var.b()));
                                                    org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
                                                    if (t1Var3 != null) {
                                                        t1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    r10Var.a(Boolean.FALSE, Boolean.valueOf(d2Var.b()));
                                                    org.telegram.ui.ActionBar.t1 t1Var4 = t1VarArr[0];
                                                    if (t1Var4 != null) {
                                                        t1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    t1VarArr[0] = alertDialog$Builder.p();
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
                            /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.String, org.telegram.ui.ActionBar.q1] */
                            /* JADX WARN: Type inference failed for: r5v23 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void m(org.telegram.ui.ActionBar.g2 g2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                org.telegram.ui.Cells.d2[] d2VarArr;
                                org.telegram.ui.Cells.d2 d2Var;
                                ?? r52;
                                if (g2Var == null) {
                                    return;
                                }
                                Context context = g2Var.getContext();
                                org.telegram.ui.Cells.d2[] d2VarArr2 = new org.telegram.ui.Cells.d2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                w4 w4Var = new w4(context, null);
                                org.telegram.messenger.ls.i(w4Var);
                                org.telegram.ui.ActionBar.t6.U(w4Var, org.telegram.ui.ActionBar.m6.j5, null);
                                org.telegram.ui.ActionBar.t6.G(w4Var, org.telegram.ui.ActionBar.m6.Xc, null);
                                w4Var.setTextSize(1, 16.0f);
                                w4Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                x4 x4Var = new x4(context, d2VarArr2);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.H = 6;
                                alertDialog$Builder.o(x4Var);
                                b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
                                b9Var.u(org.telegram.messenger.g0.L(18.0f));
                                q9 q9Var = new q9(context);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                x4Var.addView(q9Var, c8.ma.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                                org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
                                m5Var.setTextSize(20);
                                m5Var.setTypeface(org.telegram.messenger.g0.o());
                                m5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                m5Var.setEllipsizeByGradient(true);
                                m5Var.l(user.first_name, false);
                                if (user.scam) {
                                    m5Var.i(org.telegram.ui.ActionBar.m6.g1);
                                } else if (user.fake) {
                                    m5Var.i(org.telegram.ui.ActionBar.m6.h1);
                                } else if (user.verified) {
                                    Drawable g10 = i5.c.g(context, R.drawable.verified_area);
                                    int i7 = org.telegram.ui.ActionBar.m6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.t6.x(m5Var, g10, i7, null, mode);
                                    Drawable g11 = i5.c.g(context, R.drawable.verified_check);
                                    d2VarArr = d2VarArr2;
                                    org.telegram.ui.ActionBar.t6.x(m5Var, g11, org.telegram.ui.ActionBar.m6.A9, null, mode);
                                    m5Var.i(new oq(g10, g11));
                                    TextView textView = new TextView(context);
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.m5, null);
                                    int i10 = 1;
                                    org.telegram.messenger.o10.q(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new l1(user, g2Var, alertDialog$Builder, i10));
                                    SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.hd.N0(2131748142, null) + "  ");
                                    nq nqVar = new nq(R.drawable.attach_arrow_right, 0);
                                    nqVar.n = 1;
                                    nqVar.c(org.telegram.messenger.g0.L(10.0f));
                                    valueOf.setSpan(nqVar, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z10 = org.telegram.messenger.hd.a0;
                                    x4Var.addView(m5Var, c8.ma.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f));
                                    boolean z11 = org.telegram.messenger.hd.a0;
                                    x4Var.addView(textView, c8.ma.d(-1, -2.0f, (!z11 ? 5 : 3) | 48, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                    x4Var.addView(w4Var, c8.ma.d(-2, -2.0f, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    d2Var = new org.telegram.ui.Cells.d2(1, context, g2Var.getResourceProvider());
                                    d2VarArr[0] = d2Var;
                                    if (!d2Var.I) {
                                        org.telegram.ui.Cells.c2 c2Var = d2Var.c;
                                        c2Var.setLines(3);
                                        c2Var.setMaxLines(3);
                                        c2Var.setSingleLine(false);
                                    }
                                    d2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                                    d2VarArr[0].e(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131747586, org.telegram.messenger.p10.q(user))), "", true, false, false);
                                    d2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                    d2VarArr[0].c(true, false);
                                    x4Var.addView(d2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    d2VarArr[0].setOnClickListener(new o0(atomicBoolean, 1));
                                    if (org.telegram.messenger.p10.A(user)) {
                                        r52 = 0;
                                        b9Var.p = 1.0f;
                                        g2Var.getCurrentAccount();
                                        b9Var.r(user);
                                        q9Var.f(user, b9Var);
                                    } else {
                                        b9Var.p = 0.8f;
                                        b9Var.g(12);
                                        r52 = 0;
                                        q9Var.j(null, null, b9Var, user);
                                    }
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744672, r52), new e1(3, runnable));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, r52), r52);
                                    g2Var.showDialog(t1Var);
                                    w4Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752884, r52), new m1(1, context, t1Var)));
                                }
                                d2VarArr = d2VarArr2;
                                TextView textView2 = new TextView(context);
                                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.m5, null);
                                int i102 = 1;
                                org.telegram.messenger.o10.q(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new l1(user, g2Var, alertDialog$Builder, i102));
                                SpannableString valueOf2 = SpannableString.valueOf(org.telegram.messenger.hd.N0(2131748142, null) + "  ");
                                nq nqVar2 = new nq(R.drawable.attach_arrow_right, 0);
                                nqVar2.n = 1;
                                nqVar2.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf2.setSpan(nqVar2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z102 = org.telegram.messenger.hd.a0;
                                x4Var.addView(m5Var, c8.ma.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f));
                                boolean z112 = org.telegram.messenger.hd.a0;
                                x4Var.addView(textView2, c8.ma.d(-1, -2.0f, (!z112 ? 5 : 3) | 48, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f));
                                x4Var.addView(w4Var, c8.ma.d(-2, -2.0f, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                d2Var = new org.telegram.ui.Cells.d2(1, context, g2Var.getResourceProvider());
                                d2VarArr[0] = d2Var;
                                if (!d2Var.I) {
                                }
                                d2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                                d2VarArr[0].e(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131747586, org.telegram.messenger.p10.q(user))), "", true, false, false);
                                d2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                d2VarArr[0].c(true, false);
                                x4Var.addView(d2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                d2VarArr[0].setOnClickListener(new o0(atomicBoolean, 1));
                                if (org.telegram.messenger.p10.A(user)) {
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744672, r52), new e1(3, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, r52), r52);
                                g2Var.showDialog(t1Var);
                                w4Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752884, r52), new m1(1, context, t1Var)));
                            }

                            public static void m0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.h6 h6Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (vf.c.g(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                                        vf.c.s(context, Uri.parse(str), j3 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), bVar, null, false, true, false, false);
                                        return;
                                    }
                                    String d = vf.c.d(str, z10);
                                    s2 s2Var = new s2(context, str, j3, z11, bVar);
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                                    String N0 = org.telegram.messenger.hd.N0(2131747585, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = N0;
                                    TextView textView = new TextView(context);
                                    textView.setText(d);
                                    textView.setTextSize(1, 14.0f);
                                    int i7 = org.telegram.ui.ActionBar.m6.j5;
                                    org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
                                    org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.06f, i7);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.t6.j(textView, d02, K, null, h6Var);
                                    LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                    g10.addView(textView, c8.ma.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i10 = p71.f;
                                    if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                        p71 p71Var = new p71(context, h6Var);
                                        p71Var.setWebPage(webPage);
                                        g10.addView(p71Var, c8.ma.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder.o(g10);
                                    t1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747623, null), new c0(s2Var, 7));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    alertDialog$Builder.p();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.String, org.telegram.ui.ActionBar.q1] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r52;
                                Context context = g2Var.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                s4 s4Var = new s4(context, null);
                                org.telegram.messenger.ls.i(s4Var);
                                org.telegram.ui.ActionBar.t6.U(s4Var, org.telegram.ui.ActionBar.m6.j5, null);
                                org.telegram.ui.ActionBar.t6.G(s4Var, org.telegram.ui.ActionBar.m6.Xc, null);
                                s4Var.setTextSize(1, 16.0f);
                                s4Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.H = 6;
                                alertDialog$Builder.o(frameLayout);
                                b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
                                b9Var.u(org.telegram.messenger.g0.L(18.0f));
                                q9 q9Var = new q9(context);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                                org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
                                m5Var.setTextSize(20);
                                m5Var.setTypeface(org.telegram.messenger.g0.o());
                                m5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                m5Var.setEllipsizeByGradient(true);
                                m5Var.l(user.first_name, false);
                                if (user.scam) {
                                    m5Var.i(org.telegram.ui.ActionBar.m6.g1);
                                } else if (user.fake) {
                                    m5Var.i(org.telegram.ui.ActionBar.m6.h1);
                                } else if (user.verified) {
                                    Drawable g10 = i5.c.g(context, R.drawable.verified_area);
                                    int i7 = org.telegram.ui.ActionBar.m6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.t6.x(m5Var, g10, i7, null, mode);
                                    Drawable g11 = i5.c.g(context, R.drawable.verified_check);
                                    org.telegram.ui.ActionBar.t6.x(m5Var, g11, org.telegram.ui.ActionBar.m6.A9, null, mode);
                                    m5Var.i(new oq(g10, g11));
                                }
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.m5, null);
                                org.telegram.messenger.o10.q(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new l1(user, g2Var, alertDialog$Builder, 0));
                                SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.hd.N0(2131748142, null) + "  ");
                                nq nqVar = new nq(R.drawable.attach_arrow_right, 0);
                                nqVar.n = 1;
                                nqVar.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf.setSpan(nqVar, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z10 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(m5Var, c8.ma.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
                                boolean z11 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(s4Var, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.p10.A(user)) {
                                    b9Var.p = 0.8f;
                                    b9Var.g(12);
                                    r52 = 0;
                                    q9Var.j(null, null, b9Var, user);
                                } else {
                                    r52 = 0;
                                    b9Var.p = 1.0f;
                                    g2Var.getCurrentAccount();
                                    b9Var.r(user);
                                    q9Var.f(user, b9Var);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744672, r52), new e1(1, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, r52), r52);
                                g2Var.showDialog(t1Var, false, new w0(1, runnable2));
                                s4Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752884, r52), new m1(0, context, t1Var)));
                            }

                            public static void n0(org.telegram.ui.ActionBar.g2 g2Var, String str, boolean z10, boolean z11) {
                                o0(g2Var, str, z10, true, z11, false, null, null, null);
                            }

                            public static hi.w4 o(Activity activity, org.telegram.messenger.or orVar, org.telegram.ui.ActionBar.h6 h6Var) {
                                if (activity == null) {
                                    return null;
                                }
                                hi.w4 w4Var = new hi.w4(activity, h6Var);
                                ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
                                tb0 tb0Var = new tb0(activity, h6Var);
                                tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                tb0Var.setItemCount(5);
                                tb0 tb0Var2 = new tb0(activity, h6Var);
                                tb0Var2.setItemCount(5);
                                tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                tb0 tb0Var3 = new tb0(activity, h6Var);
                                tb0Var3.setItemCount(5);
                                tb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                w3 w3Var = new w3(activity, tb0Var, tb0Var2, tb0Var3, 6);
                                w3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                w3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(org.telegram.messenger.hd.N0(2131752120, null));
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.j5, h6Var, 1, 20.0f);
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                w3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                di.xb xbVar = new di.xb(activity, 20);
                                linearLayout.addView(tb0Var, c8.ma.l(0.25f, 0, org.telegram.messenger.ls.t4));
                                tb0Var.setMinValue(1);
                                tb0Var.setMaxValue(31);
                                tb0Var.setWrapSelectorWheel(false);
                                tb0Var.setFormatter(new l2(8));
                                c2 c2Var = new c2(tb0Var, tb0Var2, tb0Var3, 2);
                                tb0Var.setOnValueChangedListener(c2Var);
                                tb0Var2.setMinValue(0);
                                tb0Var2.setMaxValue(11);
                                tb0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(tb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
                                tb0Var2.setFormatter(new l2(9));
                                tb0Var2.setOnValueChangedListener(c2Var);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i7 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i10 = calendar.get(1);
                                tb0Var3.setMinValue(i7);
                                tb0Var3.setMaxValue(i10);
                                tb0Var3.setWrapSelectorWheel(false);
                                tb0Var3.setFormatter(new l2(10));
                                linearLayout.addView(tb0Var3, c8.ma.l(0.25f, 0, org.telegram.messenger.ls.t4));
                                tb0Var3.setOnValueChangedListener(c2Var);
                                tb0Var.setValue(31);
                                tb0Var2.setValue(12);
                                tb0Var3.setValue(i10);
                                b(tb0Var, tb0Var2, tb0Var3);
                                xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                xbVar.setGravity(17);
                                org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.Ji, h6Var);
                                xbVar.setTextSize(1, 14.0f);
                                xbVar.setTypeface(org.telegram.messenger.g0.o());
                                xbVar.setText(org.telegram.messenger.hd.N0(2131748872, null));
                                int L = org.telegram.messenger.g0.L(8.0f);
                                int i11 = org.telegram.ui.ActionBar.m6.Fi;
                                int w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
                                int i12 = org.telegram.ui.ActionBar.m6.Hi;
                                int w03 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
                                xbVar.setBackground(k02);
                                org.telegram.ui.ActionBar.t6.j(xbVar, k02, M, M2, h6Var);
                                w3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                                xbVar.setOnClickListener(new w1(tb0Var, tb0Var2, tb0Var3, calendar, orVar, w4Var, 2));
                                ((org.telegram.ui.ActionBar.w2) w4Var.b).O = w3Var;
                                return w4Var;
                            }

                            public static void o0(org.telegram.ui.ActionBar.g2 g2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.h6 h6Var) {
                                if (g2Var == null || g2Var.getParentActivity() == null) {
                                    return;
                                }
                                m0(g2Var.getParentActivity(), str, z10, z11, z12, z13, g2Var instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) g2Var).x8 : 0L, bVar, webPage, h6Var);
                            }

                            public static void p(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, boolean z10) {
                                String N0;
                                String a02;
                                if (g2Var.getParentActivity() == null || user == null || org.telegram.messenger.p10.y(user) || org.telegram.messenger.k10.i(g2Var.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                g2Var.getCurrentAccount();
                                Activity parentActivity = g2Var.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                if (z10) {
                                    N0 = org.telegram.messenger.hd.N0(2131743364, null);
                                    a02 = org.telegram.messenger.hd.a0("VideoCallAlert", null, 2131743365, org.telegram.messenger.p10.q(user));
                                } else {
                                    N0 = org.telegram.messenger.hd.N0(2131752619, null);
                                    a02 = org.telegram.messenger.hd.a0("CallAlert", null, 2131752620, org.telegram.messenger.p10.q(user));
                                }
                                s3 s3Var = new s3(parentActivity);
                                org.telegram.messenger.ls.i(s3Var);
                                org.telegram.ui.ActionBar.t6.U(s3Var, org.telegram.ui.ActionBar.m6.j5, null);
                                s3Var.setTextSize(1, 16.0f);
                                s3Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                s3Var.setText(org.telegram.messenger.g0.W2(a02));
                                b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
                                b9Var.u(org.telegram.messenger.g0.L(12.0f));
                                b9Var.p = 1.0f;
                                g2Var.getCurrentAccount();
                                b9Var.r(user);
                                q9 q9Var = new q9(parentActivity);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                q9Var.f(user, b9Var);
                                frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(N0);
                                boolean z11 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(s3Var, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.o(frameLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752622, null), new ab.j(g2Var, user, z10, 6));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                g2Var.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(Activity activity, int i7, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i10 = org.telegram.messenger.np.u1(i7).q3;
                                if ((i10 & 1) != 0) {
                                    org.telegram.ui.Cells.c0.v(null, 2131748493, arrayList, 0, arrayList2);
                                }
                                if ((i10 & 2) != 0) {
                                    org.telegram.ui.Cells.c0.v(null, 2131748495, arrayList, 1, arrayList2);
                                }
                                if ((i10 & 4) != 0) {
                                    org.telegram.ui.Cells.c0.v(null, 2131748491, arrayList, 3, arrayList2);
                                }
                                arrayList.add(org.telegram.messenger.hd.N0(2131748494, null));
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
                                alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(2131748492, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.o(linearLayout);
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, h6Var);
                                    k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    k6Var.setTag(Integer.valueOf(i11));
                                    a(k6Var, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.E5, null);
                                    k6Var.b((CharSequence) arrayList.get(i11), org.telegram.messenger.cz.o0 == ((Integer) arrayList2.get(i11)).intValue());
                                    int i12 = org.telegram.ui.ActionBar.m6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 2, -1);
                                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
                                    k6Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.t6.j(k6Var, h02, null, M, null);
                                    linearLayout.addView(k6Var);
                                    k6Var.setOnClickListener(new ah.h((Object) arrayList2, runnable, (Object) alertDialog$Builder, 23));
                                }
                                if (!z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                }
                                org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
                                if (z10) {
                                    p10.setCanceledOnTouchOutside(false);
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x017d, code lost:
                            
                                if (org.telegram.messenger.v3.p0(r34) == false) goto L61;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x0195, code lost:
                            
                                r8 = new org.telegram.ui.Cells.d2(1, r6, r37);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01a5, code lost:
                            
                                if (r34 == null) goto L64;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01a7, code lost:
                            
                                r11[0].e(org.telegram.messenger.hd.N0(2131751512, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01da, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e0, code lost:
                            
                                if (org.telegram.messenger.hd.a0 == false) goto L68;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e2, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01ed, code lost:
                            
                                if (org.telegram.messenger.hd.a0 == false) goto L73;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01ef, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01fa, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new org.telegram.ui.Components.g1(2, r1));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01e7, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01bc, code lost:
                            
                                r11[0].e(org.telegram.messenger.hd.a0("DeleteMessagesOptionAlso", null, 2131751513, org.telegram.messenger.p10.k(r33, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
                            
                                if (org.telegram.messenger.v3.p0(r34) == false) goto L61;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.User user, TLRPC.Chat chat, boolean z10, org.telegram.messenger.mr mrVar, org.telegram.ui.ActionBar.h6 h6Var) {
                                boolean z11;
                                if (g2Var == null || g2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = g2Var.getCurrentAccount();
                                Activity parentActivity = g2Var.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, h6Var);
                                long e10 = org.telegram.messenger.k10.i(currentAccount).e();
                                org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
                                q3 q3Var = new q3(parentActivity);
                                org.telegram.messenger.ls.i(q3Var);
                                org.telegram.ui.ActionBar.t6.U(q3Var, org.telegram.ui.ActionBar.m6.j5, null);
                                q3Var.setTextSize(1, 16.0f);
                                q3Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                r3 r3Var = new r3(parentActivity, d2VarArr);
                                alertDialog$Builder.o(r3Var);
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                r3Var.addView(textView, c8.ma.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                r3Var.addView(q3Var, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i7 == -1) {
                                    textView.setText(org.telegram.messenger.hd.a0("ClearHistory", null, 2131752077, new Object[0]));
                                    if (user != null) {
                                        q3Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithUser", null, 2131754104, org.telegram.messenger.p10.q(user))));
                                    } else if (z10) {
                                        if (org.telegram.messenger.v3.V(chat)) {
                                            q3Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithChannel", null, 2131754107, chat.title)));
                                            z11 = false;
                                        } else {
                                            q3Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithChat", null, 2131754106, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        q3Var.setText(org.telegram.messenger.hd.N0(2131754109, null));
                                    } else {
                                        q3Var.setText(org.telegram.messenger.hd.N0(2131754111, null));
                                    }
                                    z11 = false;
                                } else {
                                    z11 = false;
                                    textView.setText(org.telegram.messenger.hd.G(i7, "DeleteDays", new Object[0]));
                                    q3Var.setText(org.telegram.messenger.hd.N0(2131751523, null));
                                }
                                boolean[] zArr = new boolean[1];
                                zArr[z11 ? 1 : 0] = z11;
                                if (chat != null && z10 && org.telegram.messenger.v3.t0(chat)) {
                                    zArr[z11 ? 1 : 0] = true;
                                }
                                if (user != null) {
                                    long j3 = user.id;
                                    if (j3 != e10) {
                                        if (j3 != 489000) {
                                        }
                                    }
                                }
                                if (chat != null) {
                                    if (z10) {
                                        if (!org.telegram.messenger.v3.t0(chat)) {
                                            if (!org.telegram.messenger.v3.V(chat)) {
                                            }
                                        }
                                    }
                                }
                                CharSequence N0 = org.telegram.messenger.hd.N0(2131751586, null);
                                if (chat != null && z10 && org.telegram.messenger.v3.t0(chat) && !org.telegram.messenger.v3.V(chat)) {
                                    N0 = org.telegram.messenger.hd.N0(2131752079, null);
                                }
                                alertDialog$Builder.k(N0, new h2(5, mrVar, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                g2Var.showDialog(t1Var);
                                TextView textView2 = (TextView) t1Var.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q7, null);
                                }
                            }

                            public static void q0(int i7, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
                                if (i7 == 0 || g2Var == null || g2Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), h6Var);
                                String N0 = org.telegram.messenger.hd.N0(2131743671, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                if (i7 == 1) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751075, null);
                                } else if (i7 == 2) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751087, null);
                                } else if (i7 == 3) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751081, null);
                                } else if (i7 == 4) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751074, null);
                                } else if (i7 == 5) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751086, null);
                                } else if (i7 == 6) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751080, null);
                                } else if (i7 == 7) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751078, null);
                                } else if (i7 == 8) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751079, null);
                                } else if (i7 == 9) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751070, null);
                                } else if (i7 == 10) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751082, null);
                                } else if (i7 == 11) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751071, null);
                                } else if (i7 == 12) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751083, null);
                                } else if (i7 == 13) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751068, null);
                                } else if (i7 == 14) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751069, null);
                                } else if (i7 == 15) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751076, null);
                                } else if (i7 == 16) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751077, null);
                                } else if (i7 == 17) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751088, null);
                                } else if (i7 == 18) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751089, null);
                                } else if (i7 == 19) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751084, null);
                                } else if (i7 == 20) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751085, null);
                                } else if (i7 == 21) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751072, null);
                                } else if (i7 == 22) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751073, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                g2Var.showDialog(t1Var, true, null);
                            }

                            public static void r(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.mr mrVar) {
                                s(g2Var, z10, false, chat, user, z11, z12, z13, z14, mrVar, g2Var != null ? g2Var.getResourceProvider() : null);
                            }

                            public static org.telegram.ui.ActionBar.t1 r0(org.telegram.ui.ActionBar.g2 g2Var, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
                                if (g2Var == null) {
                                    g2Var = LaunchActivity.T();
                                }
                                if (str2 == null || g2Var == null || g2Var.getParentActivity() == null) {
                                    return null;
                                }
                                org.telegram.ui.ActionBar.t1 t1Var = L(g2Var.getParentActivity(), str, str2, null, null, h6Var).a;
                                g2Var.showDialog(t1Var);
                                return t1Var;
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
                            public static void s(final org.telegram.ui.ActionBar.g2 g2Var, final boolean z10, final boolean z11, final TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final org.telegram.messenger.mr mrVar, final org.telegram.ui.ActionBar.h6 h6Var) {
                                long j3;
                                boolean z16;
                                boolean z17;
                                b9 b9Var;
                                TLRPC.Chat chat2;
                                org.telegram.ui.Cells.d2[] d2VarArr;
                                m3 m3Var;
                                ArrayList arrayList;
                                org.telegram.ui.ActionBar.t1 t1Var;
                                b9 b9Var2;
                                float f10;
                                float f11;
                                boolean z18;
                                b9 b9Var3;
                                boolean z19;
                                boolean z20;
                                String str;
                                CharSequence N0;
                                TextView textView;
                                if (g2Var == null || g2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (chat == null && user == null) {
                                    return;
                                }
                                final int currentAccount = g2Var.getCurrentAccount();
                                final Activity parentActivity = g2Var.getParentActivity();
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, h6Var);
                                long e10 = org.telegram.messenger.k10.i(currentAccount).e();
                                org.telegram.ui.Cells.d2[] d2VarArr2 = new org.telegram.ui.Cells.d2[1];
                                m3 m3Var2 = new m3(parentActivity);
                                org.telegram.messenger.ls.i(m3Var2);
                                org.telegram.ui.ActionBar.t6.U(m3Var2, org.telegram.ui.ActionBar.m6.j5, null);
                                m3Var2.setTextSize(1, 16.0f);
                                m3Var2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                if (!z15 && org.telegram.messenger.v3.T(chat) && org.telegram.messenger.v3.t0(chat)) {
                                    j3 = e10;
                                    z16 = true;
                                } else {
                                    j3 = e10;
                                    z16 = false;
                                }
                                n3 n3Var = new n3(parentActivity, d2VarArr2);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                                t1Var2.H = 6;
                                alertDialog$Builder.o(n3Var);
                                b9 b9Var4 = new b9((org.telegram.ui.ActionBar.h6) null);
                                b9Var4.u(org.telegram.messenger.g0.L(18.0f));
                                q9 q9Var = new q9(parentActivity);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                                n3Var.addView(q9Var, c8.ma.d(30, 30.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                o6 o6Var = new o6(parentActivity, false, false, false);
                                org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.E8, null);
                                o6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
                                o6Var.setTypeface(org.telegram.messenger.g0.o());
                                o6Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                o6Var.setEllipsizeByGradient(true);
                                if (!z10) {
                                    z17 = z16;
                                    if (chat == null) {
                                        o6Var.setText(org.telegram.messenger.hd.N0(2131751541, null));
                                    } else if (org.telegram.messenger.v3.Y(chat)) {
                                        o6Var.setText(org.telegram.messenger.hd.N0(2131751922, null));
                                    } else if (!org.telegram.messenger.v3.T(chat)) {
                                        o6Var.setText(org.telegram.messenger.hd.N0(2131748798, null));
                                    } else if (chat.monoforum) {
                                        o6Var.setText(org.telegram.messenger.hd.N0(2131748802, null));
                                    } else if (chat.megagroup) {
                                        o6Var.setText(org.telegram.messenger.hd.N0(2131748798, null));
                                    } else {
                                        o6Var.setText(org.telegram.messenger.hd.N0(2131748811, null));
                                    }
                                } else if (z16) {
                                    z17 = z16;
                                    o6Var.setText(org.telegram.messenger.hd.N0(2131752076, null));
                                } else {
                                    z17 = z16;
                                    o6Var.setText(org.telegram.messenger.hd.N0(2131752077, null));
                                }
                                boolean z21 = org.telegram.messenger.hd.a0;
                                n3Var.addView(o6Var, c8.ma.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
                                n3Var.addView(m3Var2, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.v3.p0(chat)) {
                                    b9Var = b9Var4;
                                    chat2 = g2Var.getMessagesController().x1(chat.id);
                                } else {
                                    b9Var = b9Var4;
                                    chat2 = null;
                                }
                                boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j3 ? 1 : (user.id == j3 ? 0 : -1)) != 0 && org.telegram.messenger.np.u1(currentAccount).f3) && (user != null ? org.telegram.messenger.np.u1(currentAccount).e3 : org.telegram.messenger.np.u1(currentAccount).d3) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    d2VarArr = d2VarArr2;
                                    m3Var = m3Var2;
                                    arrayList = (ArrayList) org.telegram.messenger.np.u1(currentAccount).S.f(user.id);
                                } else {
                                    d2VarArr = d2VarArr2;
                                    m3Var = m3Var2;
                                    arrayList = null;
                                }
                                boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((org.telegram.messenger.gj) arrayList.get(0)).k == null || (!(((org.telegram.messenger.gj) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((org.telegram.messenger.gj) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f10 = 10.0f;
                                    if (user.bot) {
                                        b9Var2 = b9Var;
                                        f11 = 8.0f;
                                        if (user.id != 489000) {
                                            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, parentActivity, h6Var);
                                            d2VarArr[0] = d2Var;
                                            d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                                            d2VarArr[0].e(org.telegram.messenger.hd.N0(2131753691, null), "", false, false, false);
                                            t1Var = t1Var2;
                                            d2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                                            org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[0];
                                            zArr[0] = true;
                                            d2Var2.c(true, false);
                                            d2VarArr[0].setMultiline(true);
                                            n3Var.addView(d2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            d2VarArr[0].setOnClickListener(new g1(1, zArr));
                                            b9Var3 = b9Var2;
                                            z19 = false;
                                            if (user != null) {
                                                b9 b9Var5 = b9Var3;
                                                g2Var.getCurrentAccount();
                                                b9Var5.q(chat2 != null ? chat2 : chat);
                                                q9Var.f(chat2 != null ? chat2 : chat, b9Var5);
                                            } else if (org.telegram.messenger.p10.A(user)) {
                                                b9 b9Var6 = b9Var3;
                                                b9Var6.p = 0.6f;
                                                b9Var6.g(12);
                                                q9Var.j(null, null, b9Var6, user);
                                            } else {
                                                b9 b9Var7 = b9Var3;
                                                if (user.id == j3) {
                                                    b9Var7.p = 0.6f;
                                                    b9Var7.g(1);
                                                    q9Var.j(null, null, b9Var7, user);
                                                } else {
                                                    b9Var7.p = 1.0f;
                                                    g2Var.getCurrentAccount();
                                                    b9Var7.r(user);
                                                    q9Var.f(user, b9Var7);
                                                }
                                            }
                                            if (z11) {
                                                m3 m3Var3 = m3Var;
                                                if (!z10) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z12) {
                                                            m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754084, org.telegram.messenger.p10.q(user))));
                                                        } else if (user.id == j3) {
                                                            m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131754087, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754083, org.telegram.messenger.p10.q(user))));
                                                        } else {
                                                            str = null;
                                                            m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754085, org.telegram.messenger.p10.q(user))));
                                                        }
                                                    } else if (org.telegram.messenger.v3.T(chat)) {
                                                        String a02 = chat2 != null ? org.telegram.messenger.hd.a0(null, null, 2131748153, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131748450, a02)));
                                                        } else {
                                                            m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131752377, a02)));
                                                        }
                                                    } else {
                                                        m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754101, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a03 = chat2 != null ? org.telegram.messenger.hd.a0(null, null, 2131748153, chat2.title) : chat.title;
                                                    if (!org.telegram.messenger.v3.T(chat) || (chat.megagroup && !org.telegram.messenger.v3.t0(chat))) {
                                                        str = null;
                                                        m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754106, a03)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        m3Var3.setText(org.telegram.messenger.hd.N0(2131754109, null));
                                                    } else {
                                                        str = null;
                                                        m3Var3.setText(org.telegram.messenger.hd.N0(2131754111, null));
                                                    }
                                                } else if (z12) {
                                                    str = null;
                                                    m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754105, org.telegram.messenger.p10.q(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j3) {
                                                        m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131754108, null)));
                                                    } else {
                                                        m3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754104, org.telegram.messenger.p10.q(user))));
                                                    }
                                                }
                                            } else if (org.telegram.messenger.p10.C(user)) {
                                                str = null;
                                                m3Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131751569, null)));
                                            } else {
                                                m3 m3Var4 = m3Var;
                                                str = null;
                                                if (chat == null || !org.telegram.messenger.v3.V(chat)) {
                                                    m3Var4.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131751573, null)));
                                                    str = null;
                                                } else {
                                                    m3Var4.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131751572, null)));
                                                }
                                            }
                                            if (!z11) {
                                                N0 = org.telegram.messenger.hd.N0(2131751578, str);
                                            } else if (z10) {
                                                N0 = z17 ? org.telegram.messenger.hd.N0(2131752076, str) : org.telegram.messenger.hd.N0(2131752078, str);
                                            } else if (z19 && zArr[0]) {
                                                N0 = org.telegram.messenger.hd.N0(org.telegram.messenger.v3.V(chat) ? 2131752410 : 2131751518, str);
                                            } else {
                                                N0 = org.telegram.messenger.v3.T(chat) ? chat.monoforum ? org.telegram.messenger.hd.N0(2131748802, str) : chat.megagroup ? org.telegram.messenger.hd.N0(2131748797, str) : org.telegram.messenger.hd.N0(2131748809, str) : org.telegram.messenger.hd.N0(2131751541, str);
                                            }
                                            final boolean z24 = z17;
                                            org.telegram.ui.ActionBar.t1 t1Var3 = t1Var;
                                            alertDialog$Builder.k(N0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.v2
                                                @Override // org.telegram.ui.ActionBar.q1
                                                public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i7) {
                                                    boolean z25 = z24;
                                                    final boolean z26 = z11;
                                                    final boolean[] zArr2 = zArr;
                                                    final org.telegram.messenger.mr mrVar2 = mrVar;
                                                    boolean z27 = true;
                                                    if (!z25 && !z26 && !z12) {
                                                        final TLRPC.User user2 = user;
                                                        boolean C = org.telegram.messenger.p10.C(user2);
                                                        final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                                                        final boolean z28 = z10;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z29 = z13;
                                                        final boolean z30 = z15;
                                                        final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                                        if (C) {
                                                            c5.s(g2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, mrVar2, h6Var2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            org.telegram.messenger.ur a04 = org.telegram.messenger.ur.a0(g2Var2.getCurrentAccount());
                                                            a04.a.c(new org.telegram.messenger.ar(a04, user2.id, new org.telegram.messenger.or() { // from class: org.telegram.ui.Components.p1
                                                                @Override // org.telegram.messenger.or
                                                                public final void a(int i10) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    org.telegram.messenger.mr mrVar3 = mrVar2;
                                                                    if (i10 >= 50) {
                                                                        c5.s(org.telegram.ui.ActionBar.g2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, mrVar3, h6Var2);
                                                                    } else if (mrVar3 != null) {
                                                                        mrVar3.d(zArr3[0]);
                                                                    }
                                                                }
                                                            }, 0));
                                                            return;
                                                        }
                                                        if (org.telegram.messenger.v3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                            h.d();
                                                            TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                            tL_messages_getFutureChatCreatorAfterLeave.peer = org.telegram.messenger.np.n1(chat3);
                                                            final int i10 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                            d3.b bVar = new d3.b(1);
                                                            final Context context = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, bVar, new org.telegram.messenger.r10() { // from class: org.telegram.ui.Components.q1
                                                                @Override // org.telegram.messenger.r10
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    vf.b.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    org.telegram.messenger.mr mrVar3 = mrVar2;
                                                                    if (user4 == null) {
                                                                        mrVar3.d(z26 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Context context2 = context;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    bg.m0 m0Var = new bg.m0(context2, chat4, user4, i10, mrVar3, h6Var2, 7);
                                                                    a2 a2Var = new a2(mrVar3, 0);
                                                                    org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                                                                    if (g2Var3 == null || g2Var3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context3 = g2Var3.getContext();
                                                                    TLRPC.User f12 = org.telegram.messenger.k10.i(g2Var3.getCurrentAccount()).f();
                                                                    boolean V = org.telegram.messenger.v3.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context3);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    q9 q9Var2 = new q9(context3);
                                                                    b9 b9Var8 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                    b9Var8.r(f12);
                                                                    q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    q9Var2.f(f12, b9Var8);
                                                                    frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context3);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.d7, g2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    o3 o3Var = new o3(context3);
                                                                    b9 b9Var9 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                    b9Var9.r(user4);
                                                                    o3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    o3Var.f(user4, b9Var9);
                                                                    frameLayout.addView(o3Var, c8.ma.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    q9 q9Var3 = new q9(context3);
                                                                    b9 b9Var10 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                    b9Var10.q(chat4);
                                                                    q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                    q9Var3.f(chat4, b9Var10);
                                                                    frameLayout.addView(q9Var3, c8.ma.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                    org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder2.a;
                                                                    t1Var5.P0 = -1.0f;
                                                                    t1Var5.W = frameLayout;
                                                                    t1Var5.S = org.telegram.messenger.hd.N0(V ? 2131748807 : 2131748799, null);
                                                                    t1Var5.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, V ? 2131748808 : 2131748800, org.telegram.messenger.p10.q(user4), chat4.title));
                                                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131754207, null), new c0(m0Var, 4));
                                                                    alertDialog$Builder2.i(org.telegram.messenger.hd.N0(2131752577, null), null);
                                                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(V ? 2131748811 : 2131748797, null), new c0(a2Var, 5));
                                                                    t1Var5.show();
                                                                    View d = t1Var5.d(-1);
                                                                    if (d instanceof TextView) {
                                                                        org.telegram.ui.ActionBar.t6.U((TextView) d, org.telegram.ui.ActionBar.m6.q7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        mrVar2 = mrVar2;
                                                    }
                                                    if (!z26 && !zArr2[0]) {
                                                        z27 = false;
                                                    }
                                                    mrVar2.d(z27);
                                                }
                                            });
                                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                            g2Var.showDialog(t1Var3);
                                            textView = (TextView) t1Var3.d(-1);
                                            if (textView == null) {
                                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        t1Var = t1Var2;
                                        if (!z11 || (((!z12 || z10) && !z22) || org.telegram.messenger.p10.y(user) || z23)) {
                                            z18 = (z13 || z10 || chat == null || !chat.creator) ? false : true;
                                            if (!z18) {
                                                b9Var3 = b9Var2;
                                                z19 = z18;
                                                if (user != null) {
                                                }
                                                if (z11) {
                                                }
                                                if (!z11) {
                                                }
                                                final boolean z242 = z17;
                                                org.telegram.ui.ActionBar.t1 t1Var32 = t1Var;
                                                alertDialog$Builder.k(N0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.v2
                                                    @Override // org.telegram.ui.ActionBar.q1
                                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i7) {
                                                        boolean z25 = z242;
                                                        final boolean z26 = z11;
                                                        final boolean[] zArr2 = zArr;
                                                        final org.telegram.messenger.mr mrVar2 = mrVar;
                                                        boolean z27 = true;
                                                        if (!z25 && !z26 && !z12) {
                                                            final TLRPC.User user2 = user;
                                                            boolean C = org.telegram.messenger.p10.C(user2);
                                                            final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                                                            final boolean z28 = z10;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z29 = z13;
                                                            final boolean z30 = z15;
                                                            final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                                            if (C) {
                                                                c5.s(g2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, mrVar2, h6Var2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                org.telegram.messenger.ur a04 = org.telegram.messenger.ur.a0(g2Var2.getCurrentAccount());
                                                                a04.a.c(new org.telegram.messenger.ar(a04, user2.id, new org.telegram.messenger.or() { // from class: org.telegram.ui.Components.p1
                                                                    @Override // org.telegram.messenger.or
                                                                    public final void a(int i10) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        org.telegram.messenger.mr mrVar3 = mrVar2;
                                                                        if (i10 >= 50) {
                                                                            c5.s(org.telegram.ui.ActionBar.g2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, mrVar3, h6Var2);
                                                                        } else if (mrVar3 != null) {
                                                                            mrVar3.d(zArr3[0]);
                                                                        }
                                                                    }
                                                                }, 0));
                                                                return;
                                                            }
                                                            if (org.telegram.messenger.v3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                                h.d();
                                                                TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                                tL_messages_getFutureChatCreatorAfterLeave.peer = org.telegram.messenger.np.n1(chat3);
                                                                final int i10 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                                d3.b bVar = new d3.b(1);
                                                                final Context context = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, bVar, new org.telegram.messenger.r10() { // from class: org.telegram.ui.Components.q1
                                                                    @Override // org.telegram.messenger.r10
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        vf.b.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        org.telegram.messenger.mr mrVar3 = mrVar2;
                                                                        if (user4 == null) {
                                                                            mrVar3.d(z26 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Context context2 = context;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        bg.m0 m0Var = new bg.m0(context2, chat4, user4, i10, mrVar3, h6Var2, 7);
                                                                        a2 a2Var = new a2(mrVar3, 0);
                                                                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                                                                        if (g2Var3 == null || g2Var3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context3 = g2Var3.getContext();
                                                                        TLRPC.User f12 = org.telegram.messenger.k10.i(g2Var3.getCurrentAccount()).f();
                                                                        boolean V = org.telegram.messenger.v3.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        q9 q9Var2 = new q9(context3);
                                                                        b9 b9Var8 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                        b9Var8.r(f12);
                                                                        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        q9Var2.f(f12, b9Var8);
                                                                        frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context3);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.d7, g2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        o3 o3Var = new o3(context3);
                                                                        b9 b9Var9 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                        b9Var9.r(user4);
                                                                        o3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        o3Var.f(user4, b9Var9);
                                                                        frameLayout.addView(o3Var, c8.ma.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        q9 q9Var3 = new q9(context3);
                                                                        b9 b9Var10 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                        b9Var10.q(chat4);
                                                                        q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                        q9Var3.f(chat4, b9Var10);
                                                                        frameLayout.addView(q9Var3, c8.ma.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                        org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder2.a;
                                                                        t1Var5.P0 = -1.0f;
                                                                        t1Var5.W = frameLayout;
                                                                        t1Var5.S = org.telegram.messenger.hd.N0(V ? 2131748807 : 2131748799, null);
                                                                        t1Var5.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, V ? 2131748808 : 2131748800, org.telegram.messenger.p10.q(user4), chat4.title));
                                                                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131754207, null), new c0(m0Var, 4));
                                                                        alertDialog$Builder2.i(org.telegram.messenger.hd.N0(2131752577, null), null);
                                                                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(V ? 2131748811 : 2131748797, null), new c0(a2Var, 5));
                                                                        t1Var5.show();
                                                                        View d = t1Var5.d(-1);
                                                                        if (d instanceof TextView) {
                                                                            org.telegram.ui.ActionBar.t6.U((TextView) d, org.telegram.ui.ActionBar.m6.q7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            mrVar2 = mrVar2;
                                                        }
                                                        if (!z26 && !zArr2[0]) {
                                                            z27 = false;
                                                        }
                                                        mrVar2.d(z27);
                                                    }
                                                });
                                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                                g2Var.showDialog(t1Var32);
                                                textView = (TextView) t1Var32.d(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z18 = false;
                                        }
                                        org.telegram.ui.Cells.d2 d2Var3 = new org.telegram.ui.Cells.d2(1, parentActivity, h6Var);
                                        d2VarArr[0] = d2Var3;
                                        d2Var3.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                                        if (!z18) {
                                            if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                                                d2VarArr[0].e(org.telegram.messenger.hd.N0(2131751524, null), "", false, false, false);
                                            } else {
                                                d2VarArr[0].e(org.telegram.messenger.hd.N0(2131751545, null), "", false, false, false);
                                            }
                                            z20 = true;
                                        } else if (z10) {
                                            z20 = true;
                                            d2VarArr[0].e(org.telegram.messenger.hd.a0(null, null, 2131752068, org.telegram.messenger.p10.k(user, true)), "", false, false, false);
                                        } else {
                                            z20 = true;
                                            d2VarArr[0].e(org.telegram.messenger.hd.a0(null, null, 2131751513, org.telegram.messenger.p10.k(user, true)), "", false, false, false);
                                        }
                                        d2VarArr[0].setMultiline(z20);
                                        b9Var3 = b9Var2;
                                        d2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                        n3Var.addView(d2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        org.telegram.ui.yn ynVar = new org.telegram.ui.yn(z18, chat, alertDialog$Builder, zArr);
                                        d2VarArr[0].setOnClickListener(new oi.i1(23, zArr, ynVar));
                                        if (z14) {
                                            org.telegram.ui.Cells.d2 d2Var4 = d2VarArr[0];
                                            zArr[0] = true;
                                            d2Var4.c(true, false);
                                            ynVar.run();
                                        }
                                        z19 = z18;
                                        if (user != null) {
                                        }
                                        if (z11) {
                                        }
                                        if (!z11) {
                                        }
                                        final boolean z2422 = z17;
                                        org.telegram.ui.ActionBar.t1 t1Var322 = t1Var;
                                        alertDialog$Builder.k(N0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.v2
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i7) {
                                                boolean z25 = z2422;
                                                final boolean z26 = z11;
                                                final boolean[] zArr2 = zArr;
                                                final org.telegram.messenger.mr mrVar2 = mrVar;
                                                boolean z27 = true;
                                                if (!z25 && !z26 && !z12) {
                                                    final TLRPC.User user2 = user;
                                                    boolean C = org.telegram.messenger.p10.C(user2);
                                                    final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                                                    final boolean z28 = z10;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z29 = z13;
                                                    final boolean z30 = z15;
                                                    final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                                    if (C) {
                                                        c5.s(g2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, mrVar2, h6Var2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        org.telegram.messenger.ur a04 = org.telegram.messenger.ur.a0(g2Var2.getCurrentAccount());
                                                        a04.a.c(new org.telegram.messenger.ar(a04, user2.id, new org.telegram.messenger.or() { // from class: org.telegram.ui.Components.p1
                                                            @Override // org.telegram.messenger.or
                                                            public final void a(int i10) {
                                                                boolean[] zArr3 = zArr2;
                                                                org.telegram.messenger.mr mrVar3 = mrVar2;
                                                                if (i10 >= 50) {
                                                                    c5.s(org.telegram.ui.ActionBar.g2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, mrVar3, h6Var2);
                                                                } else if (mrVar3 != null) {
                                                                    mrVar3.d(zArr3[0]);
                                                                }
                                                            }
                                                        }, 0));
                                                        return;
                                                    }
                                                    if (org.telegram.messenger.v3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                        h.d();
                                                        TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                        tL_messages_getFutureChatCreatorAfterLeave.peer = org.telegram.messenger.np.n1(chat3);
                                                        final int i10 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                        d3.b bVar = new d3.b(1);
                                                        final Context context = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, bVar, new org.telegram.messenger.r10() { // from class: org.telegram.ui.Components.q1
                                                            @Override // org.telegram.messenger.r10
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                vf.b.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                org.telegram.messenger.mr mrVar3 = mrVar2;
                                                                if (user4 == null) {
                                                                    mrVar3.d(z26 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Context context2 = context;
                                                                TLRPC.Chat chat4 = chat3;
                                                                bg.m0 m0Var = new bg.m0(context2, chat4, user4, i10, mrVar3, h6Var2, 7);
                                                                a2 a2Var = new a2(mrVar3, 0);
                                                                org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                                                                if (g2Var3 == null || g2Var3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context3 = g2Var3.getContext();
                                                                TLRPC.User f12 = org.telegram.messenger.k10.i(g2Var3.getCurrentAccount()).f();
                                                                boolean V = org.telegram.messenger.v3.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                q9 q9Var2 = new q9(context3);
                                                                b9 b9Var8 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                b9Var8.r(f12);
                                                                q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                q9Var2.f(f12, b9Var8);
                                                                frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context3);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.d7, g2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                o3 o3Var = new o3(context3);
                                                                b9 b9Var9 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                b9Var9.r(user4);
                                                                o3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                o3Var.f(user4, b9Var9);
                                                                frameLayout.addView(o3Var, c8.ma.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                q9 q9Var3 = new q9(context3);
                                                                b9 b9Var10 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                                b9Var10.q(chat4);
                                                                q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                q9Var3.f(chat4, b9Var10);
                                                                frameLayout.addView(q9Var3, c8.ma.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder2.a;
                                                                t1Var5.P0 = -1.0f;
                                                                t1Var5.W = frameLayout;
                                                                t1Var5.S = org.telegram.messenger.hd.N0(V ? 2131748807 : 2131748799, null);
                                                                t1Var5.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, V ? 2131748808 : 2131748800, org.telegram.messenger.p10.q(user4), chat4.title));
                                                                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131754207, null), new c0(m0Var, 4));
                                                                alertDialog$Builder2.i(org.telegram.messenger.hd.N0(2131752577, null), null);
                                                                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(V ? 2131748811 : 2131748797, null), new c0(a2Var, 5));
                                                                t1Var5.show();
                                                                View d = t1Var5.d(-1);
                                                                if (d instanceof TextView) {
                                                                    org.telegram.ui.ActionBar.t6.U((TextView) d, org.telegram.ui.ActionBar.m6.q7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    mrVar2 = mrVar2;
                                                }
                                                if (!z26 && !zArr2[0]) {
                                                    z27 = false;
                                                }
                                                mrVar2.d(z27);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        g2Var.showDialog(t1Var322);
                                        textView = (TextView) t1Var322.d(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        t1Var = t1Var2;
                                        b9Var2 = b9Var;
                                    }
                                } else {
                                    t1Var = t1Var2;
                                    b9Var2 = b9Var;
                                    f10 = 10.0f;
                                }
                                f11 = 8.0f;
                                if (z11) {
                                }
                                if (z13) {
                                }
                                if (!z18) {
                                }
                                org.telegram.ui.Cells.d2 d2Var32 = new org.telegram.ui.Cells.d2(1, parentActivity, h6Var);
                                d2VarArr[0] = d2Var32;
                                d2Var32.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                                if (!z18) {
                                }
                                d2VarArr[0].setMultiline(z20);
                                b9Var3 = b9Var2;
                                d2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                n3Var.addView(d2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                org.telegram.ui.yn ynVar2 = new org.telegram.ui.yn(z18, chat, alertDialog$Builder, zArr);
                                d2VarArr[0].setOnClickListener(new oi.i1(23, zArr, ynVar2));
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
                                org.telegram.ui.ActionBar.t1 t1Var3222 = t1Var;
                                alertDialog$Builder.k(N0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.v2
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i7) {
                                        boolean z25 = z24222;
                                        final boolean z26 = z11;
                                        final boolean[] zArr2 = zArr;
                                        final org.telegram.messenger.mr mrVar2 = mrVar;
                                        boolean z27 = true;
                                        if (!z25 && !z26 && !z12) {
                                            final TLRPC.User user2 = user;
                                            boolean C = org.telegram.messenger.p10.C(user2);
                                            final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                                            final boolean z28 = z10;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z29 = z13;
                                            final boolean z30 = z15;
                                            final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                            if (C) {
                                                c5.s(g2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, mrVar2, h6Var2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                org.telegram.messenger.ur a04 = org.telegram.messenger.ur.a0(g2Var2.getCurrentAccount());
                                                a04.a.c(new org.telegram.messenger.ar(a04, user2.id, new org.telegram.messenger.or() { // from class: org.telegram.ui.Components.p1
                                                    @Override // org.telegram.messenger.or
                                                    public final void a(int i10) {
                                                        boolean[] zArr3 = zArr2;
                                                        org.telegram.messenger.mr mrVar3 = mrVar2;
                                                        if (i10 >= 50) {
                                                            c5.s(org.telegram.ui.ActionBar.g2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, mrVar3, h6Var2);
                                                        } else if (mrVar3 != null) {
                                                            mrVar3.d(zArr3[0]);
                                                        }
                                                    }
                                                }, 0));
                                                return;
                                            }
                                            if (org.telegram.messenger.v3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                h.d();
                                                TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                tL_messages_getFutureChatCreatorAfterLeave.peer = org.telegram.messenger.np.n1(chat3);
                                                final int i10 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                d3.b bVar = new d3.b(1);
                                                final Context context = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, bVar, new org.telegram.messenger.r10() { // from class: org.telegram.ui.Components.q1
                                                    @Override // org.telegram.messenger.r10
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        vf.b.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        org.telegram.messenger.mr mrVar3 = mrVar2;
                                                        if (user4 == null) {
                                                            mrVar3.d(z26 || zArr2[0]);
                                                            return;
                                                        }
                                                        Context context2 = context;
                                                        TLRPC.Chat chat4 = chat3;
                                                        bg.m0 m0Var = new bg.m0(context2, chat4, user4, i10, mrVar3, h6Var2, 7);
                                                        a2 a2Var = new a2(mrVar3, 0);
                                                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                                                        if (g2Var3 == null || g2Var3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context3 = g2Var3.getContext();
                                                        TLRPC.User f12 = org.telegram.messenger.k10.i(g2Var3.getCurrentAccount()).f();
                                                        boolean V = org.telegram.messenger.v3.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        q9 q9Var2 = new q9(context3);
                                                        b9 b9Var8 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                        b9Var8.r(f12);
                                                        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        q9Var2.f(f12, b9Var8);
                                                        frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context3);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.d7, g2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        o3 o3Var = new o3(context3);
                                                        b9 b9Var9 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                        b9Var9.r(user4);
                                                        o3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        o3Var.f(user4, b9Var9);
                                                        frameLayout.addView(o3Var, c8.ma.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        q9 q9Var3 = new q9(context3);
                                                        b9 b9Var10 = new b9((org.telegram.ui.ActionBar.h6) null);
                                                        b9Var10.q(chat4);
                                                        q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                        q9Var3.f(chat4, b9Var10);
                                                        frameLayout.addView(q9Var3, c8.ma.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                        org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder2.a;
                                                        t1Var5.P0 = -1.0f;
                                                        t1Var5.W = frameLayout;
                                                        t1Var5.S = org.telegram.messenger.hd.N0(V ? 2131748807 : 2131748799, null);
                                                        t1Var5.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, V ? 2131748808 : 2131748800, org.telegram.messenger.p10.q(user4), chat4.title));
                                                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131754207, null), new c0(m0Var, 4));
                                                        alertDialog$Builder2.i(org.telegram.messenger.hd.N0(2131752577, null), null);
                                                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(V ? 2131748811 : 2131748797, null), new c0(a2Var, 5));
                                                        t1Var5.show();
                                                        View d = t1Var5.d(-1);
                                                        if (d instanceof TextView) {
                                                            org.telegram.ui.ActionBar.t6.U((TextView) d, org.telegram.ui.ActionBar.m6.q7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            mrVar2 = mrVar2;
                                        }
                                        if (!z26 && !zArr2[0]) {
                                            z27 = false;
                                        }
                                        mrVar2.d(z27);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                g2Var.showDialog(t1Var3222);
                                textView = (TextView) t1Var3222.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.t1 s0(org.telegram.ui.ActionBar.g2 g2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
                                TextView textView;
                                org.telegram.ui.ActionBar.t1 M = M(g2Var.getContext(), g2Var.getResourceProvider(), str, charSequence, str2, runnable);
                                g2Var.showDialog(M);
                                if (z10 && (textView = (TextView) M.d(-1)) != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                }
                                return M;
                            }

                            public static org.telegram.ui.ActionBar.t1 t(Activity activity, final long j3, final long j10, final int i7, final Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var) {
                                int i10;
                                SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).g7;
                                final String v = org.telegram.messenger.ys.v(j3, j10, false);
                                if (j3 != 0) {
                                    StringBuilder sb2 = new StringBuilder("color_");
                                    sb2.append(v);
                                    i10 = sharedPreferences.contains(sb2.toString()) ? org.telegram.messenger.f3.c("color_", v, sharedPreferences, -16776961) : org.telegram.messenger.n5.z(j3) ? sharedPreferences.getInt("GroupLed", -16776961) : sharedPreferences.getInt("MessagesLed", -16776961);
                                } else {
                                    i10 = i7 == 1 ? sharedPreferences.getInt("MessagesLed", -16776961) : i7 == 0 ? sharedPreferences.getInt("GroupLed", -16776961) : i7 == 3 ? sharedPreferences.getInt("StoriesLed", -16776961) : (i7 == 5 || i7 == 4) ? sharedPreferences.getInt("ReactionsLed", -16776961) : sharedPreferences.getInt("ChannelLed", -16776961);
                                }
                                LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
                                String[] strArr = {org.telegram.messenger.hd.N0(2131752000, null), org.telegram.messenger.hd.N0(2131752005, null), org.telegram.messenger.hd.N0(2131751994, null), org.telegram.messenger.hd.N0(2131752006, null), org.telegram.messenger.hd.N0(2131752007, null), org.telegram.messenger.hd.N0(2131752008, null), org.telegram.messenger.hd.N0(2131751996, null), org.telegram.messenger.hd.N0(2131752001, null), org.telegram.messenger.hd.N0(2131751995, null)};
                                final int[] iArr = {i10};
                                for (int i11 = 0; i11 < 9; i11++) {
                                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, h6Var);
                                    k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    k6Var.setTag(Integer.valueOf(i11));
                                    int i12 = org.telegram.ui.Cells.u8.e[i11];
                                    k6Var.a(i12, i12);
                                    k6Var.b(strArr[i11], i10 == org.telegram.ui.Cells.u8.f[i11]);
                                    f10.addView(k6Var);
                                    k6Var.setOnClickListener(new v1(f10, iArr));
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
                                String N0 = org.telegram.messenger.hd.N0(2131748796, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                alertDialog$Builder.o(f10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745354, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.w2
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                                        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).g7.edit();
                                        long j11 = j3;
                                        int[] iArr2 = iArr;
                                        if (j11 != 0) {
                                            edit.putInt(p5.c.k("color_", v), iArr2[0]);
                                            org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).l(j11, j10);
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
                                            org.telegram.messenger.ys.t(org.telegram.messenger.k10.t0).m(i14);
                                        }
                                        edit.commit();
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                        }
                                    }
                                });
                                alertDialog$Builder.i(org.telegram.messenger.hd.N0(2131748795, null), new c4.n(j3, i7, runnable, 4));
                                if (j3 != 0) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751588, null), new h2(4, v, runnable));
                                }
                                return t1Var;
                            }

                            public static void t0(String str, org.telegram.ui.ActionBar.g2 g2Var) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((g2Var == null || g2Var.getParentActivity() == null) ? org.telegram.messenger.t0.b : g2Var.getParentActivity(), str, 1).show();
                            }

                            public static void u(org.telegram.ui.ActionBar.g2 g2Var, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
                                String N0 = org.telegram.messenger.hd.N0(2131751776, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.hd.a0("ContactNotRegistered", null, 2131751777, org.telegram.messenger.i5.m(0, str, str2));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131748981, null), new h2(1, str3, g2Var));
                                g2Var.showDialog(t1Var);
                            }

                            public static org.telegram.ui.ActionBar.t1 u0(Context context, String str, boolean z10) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = str;
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                if (z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131743576, null), new u0(context, 1));
                                }
                                return alertDialog$Builder.p();
                            }

                            public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.or orVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i7 = org.telegram.ui.ActionBar.m6.L5;
                                final int i10 = 0;
                                alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.m6.x0(null, i7, false), null);
                                alertDialog$Builder.n(i7, null);
                                alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131751762, null));
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751761, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.y2
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i11) {
                                        switch (i10) {
                                            case 0:
                                                orVar.a(1);
                                                break;
                                            default:
                                                orVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                final int i11 = 1;
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751760, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.y2
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i112) {
                                        switch (i11) {
                                            case 0:
                                                orVar.a(1);
                                                break;
                                            default:
                                                orVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, tb0Var2.getValue());
                                calendar.set(1, tb0Var3.getValue());
                                tb0Var.setMinValue(1);
                                tb0Var.setMaxValue(calendar.getActualMaximum(5));
                            }

                            public static AlertDialog$Builder w(Context context, int i7, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, ai.u1 u1Var) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final tb0 tb0Var = new tb0(context, null);
                                final tb0 tb0Var2 = new tb0(context, null);
                                final tb0 tb0Var3 = new tb0(context, null);
                                linearLayout.addView(tb0Var2, c8.ma.l(0.3f, 0, -2));
                                final int i15 = 0;
                                tb0Var2.setOnScrollListener(new qb0() { // from class: org.telegram.ui.Components.b2
                                    @Override // org.telegram.ui.Components.qb0
                                    public final void i(int i16) {
                                        switch (i15) {
                                            case 0:
                                                if (z10 && i16 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i16 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i16 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                tb0Var.setMinValue(0);
                                tb0Var.setMaxValue(11);
                                linearLayout.addView(tb0Var, c8.ma.l(0.3f, 0, -2));
                                tb0Var.setFormatter(new org.telegram.ui.cr(18));
                                tb0Var.setOnValueChangedListener(new c2(tb0Var2, tb0Var, tb0Var3, 0));
                                final int i16 = 1;
                                tb0Var.setOnScrollListener(new qb0() { // from class: org.telegram.ui.Components.b2
                                    @Override // org.telegram.ui.Components.qb0
                                    public final void i(int i162) {
                                        switch (i16) {
                                            case 0:
                                                if (z10 && i162 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i162 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i162 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i17 = calendar.get(1);
                                tb0Var3.setMinValue(i7 + i17);
                                tb0Var3.setMaxValue(i10 + i17);
                                tb0Var3.setValue(i17 + i11);
                                linearLayout.addView(tb0Var3, c8.ma.l(0.4f, 0, -2));
                                tb0Var3.setOnValueChangedListener(new c2(tb0Var2, tb0Var, tb0Var3, 1));
                                final int i18 = 2;
                                tb0Var3.setOnScrollListener(new qb0() { // from class: org.telegram.ui.Components.b2
                                    @Override // org.telegram.ui.Components.qb0
                                    public final void i(int i162) {
                                        switch (i18) {
                                            case 0:
                                                if (z10 && i162 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i162 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i162 == 0) {
                                                    c5.d(tb0Var2, tb0Var, tb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                v0(tb0Var2, tb0Var, tb0Var3);
                                if (z10) {
                                    d(tb0Var2, tb0Var, tb0Var3);
                                }
                                if (i12 != -1) {
                                    tb0Var2.setValue(i12);
                                    tb0Var.setValue(i13);
                                    tb0Var3.setValue(i14);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.S = str;
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745354, null), new org.telegram.ui.zl(z10, tb0Var2, tb0Var, tb0Var3, u1Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                return alertDialog$Builder;
                            }

                            public static void x(Context context, String str, String str2, long j3, a5 a5Var) {
                                if (context == null) {
                                    return;
                                }
                                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false);
                                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
                                org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Aj, false);
                                org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ej, false);
                                org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E8, false);
                                org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G8, false);
                                org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false);
                                int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false);
                                int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
                                int x06 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
                                hi.w4 w4Var = new hi.w4(context, (org.telegram.ui.ActionBar.h6) null);
                                ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
                                tb0 tb0Var = new tb0(context, null);
                                tb0Var.setTextColor(x02);
                                tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                tb0Var.setItemCount(5);
                                b4 b4Var = new b4(context, null);
                                b4Var.setItemCount(5);
                                b4Var.setTextColor(x02);
                                b4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                c4 c4Var = new c4(context, null);
                                c4Var.setItemCount(5);
                                c4Var.setTextColor(x02);
                                c4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                                tb0 tb0Var2 = tb0Var;
                                w3 w3Var = new w3(context, tb0Var2, b4Var, c4Var, 2);
                                w3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                w3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                textView.setTextColor(x02);
                                textView.setTextSize(1, 20.0f);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                w3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                di.xb xbVar = new di.xb(context, 15);
                                linearLayout.addView(tb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
                                tb0Var2.setMinValue(0);
                                tb0Var2.setMaxValue(365);
                                tb0Var2.setWrapSelectorWheel(false);
                                int i7 = 21;
                                tb0Var2.setFormatter(new org.telegram.ui.cr(i7));
                                a3.h hVar = new a3.h(tb0Var2, b4Var, c4Var, i7);
                                tb0Var2.setOnValueChangedListener(hVar);
                                b4Var.setMinValue(0);
                                b4Var.setMaxValue(23);
                                linearLayout.addView(b4Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ls.t4));
                                b4Var.setFormatter(new org.telegram.ui.cr(22));
                                b4Var.setOnValueChangedListener(hVar);
                                c4Var.setMinValue(0);
                                c4Var.setMaxValue(59);
                                c4Var.setValue(0);
                                c4Var.setFormatter(new org.telegram.ui.cr(23));
                                linearLayout.addView(c4Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ls.t4));
                                c4Var.setOnValueChangedListener(hVar);
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
                                        c4Var.setValue(calendar.get(12));
                                        b4Var.setValue(calendar.get(11));
                                        tb0Var2 = tb0Var2;
                                        tb0Var2.setValue(timeInMillis);
                                    } else {
                                        tb0Var2 = tb0Var2;
                                    }
                                }
                                g(null, null, 0L, 0L, 0, tb0Var2, b4Var, c4Var);
                                xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                xbVar.setGravity(17);
                                xbVar.setTextColor(x04);
                                xbVar.setTextSize(1, 14.0f);
                                xbVar.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x05, x06, x06));
                                xbVar.setText(str2);
                                w3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                                xbVar.setOnClickListener(new w1(tb0Var2, b4Var, c4Var, calendar, a5Var, w4Var, 1));
                                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var.b;
                                w2Var.O = w3Var;
                                w2Var.show();
                                w2Var.v0(x03);
                                w2Var.P(x03);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:415:0x020d, code lost:
                            
                                if (java.lang.Math.abs(r11 - r0.k.date) > 86400) goto L95;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:154:0x06d0  */
                            /* JADX WARN: Removed duplicated region for block: B:158:0x0720  */
                            /* JADX WARN: Removed duplicated region for block: B:161:0x07f9  */
                            /* JADX WARN: Removed duplicated region for block: B:172:0x089c  */
                            /* JADX WARN: Removed duplicated region for block: B:176:0x096d  */
                            /* JADX WARN: Removed duplicated region for block: B:179:0x097b  */
                            /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:182:0x08da  */
                            /* JADX WARN: Removed duplicated region for block: B:195:0x0839  */
                            /* JADX WARN: Removed duplicated region for block: B:223:0x0738  */
                            /* JADX WARN: Removed duplicated region for block: B:258:0x06f9  */
                            /* JADX WARN: Type inference failed for: r8v38 */
                            /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.String, org.telegram.ui.ActionBar.h6, org.telegram.ui.ActionBar.q1] */
                            /* JADX WARN: Type inference failed for: r8v41 */
                            /* JADX WARN: Type inference failed for: r8v65 */
                            /* JADX WARN: Type inference failed for: r8v66 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void y(final org.telegram.ui.ActionBar.g2 g2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j3, final org.telegram.messenger.gj gjVar, final SparseArray[] sparseArrayArr, final org.telegram.messenger.bj bjVar, final int i7, final int i10, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.h6 h6Var) {
                                Activity parentActivity;
                                boolean z10;
                                long j10;
                                boolean z11;
                                boolean z12;
                                boolean z13;
                                int i11;
                                int i12;
                                boolean z14;
                                boolean z15;
                                boolean z16;
                                boolean z17;
                                int i13;
                                org.telegram.ui.ActionBar.t1 t1Var;
                                int i14;
                                boolean z18;
                                boolean z19;
                                boolean z20;
                                org.telegram.ui.Cells.d2 d2Var;
                                String str;
                                int i15;
                                int i16;
                                TLRPC.MessageAction messageAction;
                                final boolean z21;
                                int i17;
                                org.telegram.ui.ActionBar.t1 t1Var2;
                                String str2;
                                boolean z22;
                                String str3;
                                ?? r82;
                                AlertDialog$Builder alertDialog$Builder;
                                TextView textView;
                                TextView textView2;
                                int i18;
                                int i19;
                                boolean z23;
                                TLRPC.MessageAction messageAction2;
                                int i20;
                                int i21;
                                final int i22;
                                TLRPC.Message message;
                                int i23;
                                org.telegram.messenger.gj gjVar2 = gjVar;
                                boolean z24 = i10 == 1;
                                boolean z25 = i10 == 3;
                                if (g2Var == null) {
                                    return;
                                }
                                if ((user == null && chat == null && encryptedChat == null) || (parentActivity = g2Var.getParentActivity()) == null) {
                                    return;
                                }
                                final int currentAccount = g2Var.getCurrentAccount();
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, h6Var);
                                float f10 = runnable2 != null ? 0.5f : 0.6f;
                                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
                                t1Var3.R0 = f10;
                                int size = bjVar != null ? bjVar.d.size() : gjVar2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                if (encryptedChat != null) {
                                    z10 = z25;
                                    j10 = org.telegram.messenger.n5.F(encryptedChat.id);
                                } else {
                                    z10 = z25;
                                    j10 = user != null ? user.id : -chat.id;
                                }
                                if (z24) {
                                    if (gjVar2 == null || (message = gjVar2.k) == null || (i23 = message.schedule_repeat_period) <= 0) {
                                        if (bjVar != null) {
                                            ArrayList arrayList = bjVar.d;
                                            if (!arrayList.isEmpty() && arrayList.get(0) != null && ((org.telegram.messenger.gj) arrayList.get(0)).k != null && ((org.telegram.messenger.gj) arrayList.get(0)).k.schedule_repeat_period > 0) {
                                                int i24 = ((org.telegram.messenger.gj) arrayList.get(0)).k.date;
                                                i22 = ((org.telegram.messenger.gj) arrayList.get(0)).k.schedule_repeat_period;
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
                                        String a02 = org.telegram.messenger.hd.a0(null, null, 2131748324, Integer.valueOf(i22));
                                        if (i22 == 31536000) {
                                            a02 = org.telegram.messenger.hd.N0(2131748320, null);
                                        } else if (i22 >= 2592000) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                        } else if (i22 >= 604800) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                        } else if (i22 >= 86400) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                        }
                                        String str4 = a02;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, parentActivity, h6Var);
                                        String N0 = org.telegram.messenger.hd.N0(2131748318, null);
                                        org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder3.a;
                                        t1Var4.S = N0;
                                        t1Var4.U = org.telegram.messenger.hd.N0(2131748319, null);
                                        final int i25 = i21;
                                        alertDialog$Builder3.h(str4, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.k3
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var5, int i26) {
                                                org.telegram.messenger.bj bjVar2 = org.telegram.messenger.bj.this;
                                                int i27 = currentAccount;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                                                int i28 = i25;
                                                int i29 = i22;
                                                if (bjVar2 != null) {
                                                    ArrayList arrayList2 = bjVar2.d;
                                                    if (!arrayList2.isEmpty()) {
                                                        org.telegram.messenger.az.C(i27).u((org.telegram.messenger.gj) arrayList2.get(0), g2Var2, i28 + i29, i29);
                                                        return;
                                                    }
                                                }
                                                org.telegram.messenger.az.C(i27).u(gjVar, g2Var2, i28 + i29, i29);
                                            }
                                        });
                                        final long j11 = j10;
                                        final boolean z26 = z10;
                                        alertDialog$Builder3.i(org.telegram.messenger.hd.N0(2131748331, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.v0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var5, int i26) {
                                                SparseArray[] sparseArrayArr2;
                                                ArrayList arrayList2;
                                                int i27;
                                                long j12;
                                                ArrayList arrayList3;
                                                TLRPC.Peer peer;
                                                int i28;
                                                long j13;
                                                ArrayList arrayList4;
                                                boolean z27 = z26;
                                                int i29 = currentAccount;
                                                long e10 = z27 ? org.telegram.messenger.k10.i(i29).e() : j11;
                                                org.telegram.messenger.gj gjVar3 = gjVar;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j14 = j3;
                                                int i30 = i7;
                                                int i31 = i10;
                                                ArrayList arrayList5 = null;
                                                if (gjVar3 != null) {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    org.telegram.messenger.bj bjVar2 = bjVar;
                                                    if (bjVar2 != null) {
                                                        ArrayList arrayList7 = bjVar2.d;
                                                        int i32 = 0;
                                                        while (i32 < arrayList7.size()) {
                                                            org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) arrayList7.get(i32);
                                                            arrayList6.add(Integer.valueOf(gjVar4.e1()));
                                                            if (encryptedChat2 != null) {
                                                                arrayList4 = arrayList6;
                                                                if (gjVar4.k.random_id == 0 || gjVar4.D == 10) {
                                                                    i28 = i29;
                                                                    j13 = e10;
                                                                } else {
                                                                    if (arrayList5 == null) {
                                                                        arrayList5 = new ArrayList();
                                                                    }
                                                                    ArrayList arrayList8 = arrayList5;
                                                                    i28 = i29;
                                                                    j13 = e10;
                                                                    arrayList8.add(Long.valueOf(gjVar4.k.random_id));
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
                                                        arrayList6.add(Integer.valueOf(gjVar3.e1()));
                                                        if (encryptedChat2 != null && gjVar3.k.random_id != 0 && gjVar3.D != 10) {
                                                            ArrayList arrayList9 = new ArrayList();
                                                            arrayList9.add(Long.valueOf(gjVar3.k.random_id));
                                                            arrayList3 = arrayList9;
                                                            org.telegram.messenger.np.u1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j14 == 0 && (peer = gjVar3.k.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i30, true, i31);
                                                        }
                                                    }
                                                    arrayList3 = arrayList5;
                                                    org.telegram.messenger.np.u1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j14 == 0 && (peer = gjVar3.k.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i30, true, i31);
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
                                                                org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) sparseArrayArr2[i33].valueAt(i35);
                                                                long j16 = gjVar5.k.random_id;
                                                                if (j16 != 0 && gjVar5.D != 10) {
                                                                    arrayList11.add(Long.valueOf(j16));
                                                                }
                                                            }
                                                            arrayList2 = arrayList11;
                                                        } else {
                                                            arrayList2 = null;
                                                        }
                                                        org.telegram.messenger.np.u1(i29).Z(arrayList10, arrayList2, encryptedChat2, (i33 != 1 || j14 == 0) ? j15 : j14, i30, true, i31);
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
                                        alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        alertDialog$Builder3.d(-2);
                                        alertDialog$Builder3.d(-3);
                                        t1Var4.O = new w0(0, runnable2);
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                    gjVar2 = gjVar;
                                }
                                Runnable runnable3 = runnable2;
                                final int i26 = currentAccount;
                                int currentTime = ConnectionsManager.getInstance(i26).getCurrentTime();
                                org.telegram.messenger.np.u1(i26).A7.i.n2(TimeUnit.SECONDS);
                                if (gjVar2 != null) {
                                    z12 = !gjVar2.T2() || Math.abs(currentTime - gjVar2.k.date) > 86400;
                                    if (gjVar2.Q3()) {
                                        TLRPC.Message message2 = gjVar2.k;
                                        z13 = message2.paid_suggested_post_stars;
                                        z11 = message2.paid_suggested_post_ton;
                                    } else {
                                        z13 = false;
                                        z11 = false;
                                    }
                                } else {
                                    int i27 = 0;
                                    z11 = false;
                                    boolean z27 = false;
                                    boolean z28 = false;
                                    while (i27 < 2) {
                                        int i28 = 0;
                                        while (true) {
                                            i11 = i27;
                                            if (i28 < sparseArrayArr[i27].size()) {
                                                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) sparseArrayArr[i11].valueAt(i28);
                                                if (gjVar3.T2()) {
                                                    i12 = i28;
                                                } else {
                                                    i12 = i28;
                                                }
                                                z27 = true;
                                                if (gjVar3.Q3()) {
                                                    TLRPC.Message message3 = gjVar3.k;
                                                    z28 |= message3.paid_suggested_post_stars;
                                                    z11 |= message3.paid_suggested_post_ton;
                                                }
                                                i28 = i12 + 1;
                                                i27 = i11;
                                            }
                                        }
                                        i27 = i11 + 1;
                                    }
                                    z12 = z27;
                                    z13 = z28;
                                }
                                if (bjVar != null) {
                                    ArrayList arrayList2 = bjVar.d;
                                    z15 = z13;
                                    z14 = z12;
                                    int i29 = 0;
                                    while (i29 < arrayList2.size()) {
                                        org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) arrayList2.get(i29);
                                        if (gjVar4.Q3()) {
                                            TLRPC.Message message4 = gjVar4.k;
                                            i20 = i29;
                                            z15 |= message4.paid_suggested_post_stars;
                                            z11 = message4.paid_suggested_post_ton | z11;
                                        } else {
                                            i20 = i29;
                                        }
                                        i29 = i20 + 1;
                                    }
                                } else {
                                    z14 = z12;
                                    z15 = z13;
                                }
                                final boolean[] zArr = new boolean[1];
                                boolean z29 = user != null && org.telegram.messenger.np.u1(i26).f3;
                                int i30 = user != null ? org.telegram.messenger.np.u1(i26).e3 : org.telegram.messenger.np.u1(i26).d3;
                                if (encryptedChat == null && user != null && z29) {
                                    z16 = z29;
                                    if (i30 == Integer.MAX_VALUE) {
                                        z17 = true;
                                        if (chat != null || !chat.megagroup || z24 || z10) {
                                            i13 = i26;
                                            if (!z24 || z10 || org.telegram.messenger.v3.T(chat) || encryptedChat != null) {
                                                t1Var = t1Var3;
                                                i14 = 0;
                                                z18 = false;
                                            } else {
                                                if ((user == null || user.id == org.telegram.messenger.k10.i(i13).e() || (user.bot && !user.support)) && chat == null) {
                                                    i14 = 0;
                                                    z20 = false;
                                                } else if (gjVar2 != null) {
                                                    i14 = (gjVar2.n4() || !((messageAction = gjVar2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(gjVar2.N3() || z16 || org.telegram.messenger.v3.N(chat)) || currentTime - gjVar2.k.date > i30)) ? 0 : 1;
                                                    z20 = !gjVar2.N3();
                                                } else {
                                                    int i31 = 1;
                                                    z20 = false;
                                                    int i32 = 0;
                                                    while (i31 >= 0) {
                                                        int i33 = 0;
                                                        while (true) {
                                                            i16 = i31;
                                                            if (i33 < sparseArrayArr[i31].size()) {
                                                                org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) sparseArrayArr[i16].valueAt(i33);
                                                                int i34 = i33;
                                                                TLRPC.MessageAction messageAction3 = gjVar5.k.action;
                                                                boolean z30 = z20;
                                                                if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((gjVar5.N3() || z16 || (chat != null && org.telegram.messenger.v3.w(2, chat))) && currentTime - gjVar5.k.date <= i30)) {
                                                                    i32++;
                                                                    if (!z30 && !gjVar5.N3()) {
                                                                        z20 = true;
                                                                        i33 = i34 + 1;
                                                                        i31 = i16;
                                                                    }
                                                                }
                                                                z20 = z30;
                                                                i33 = i34 + 1;
                                                                i31 = i16;
                                                            }
                                                        }
                                                        i31 = i16 - 1;
                                                    }
                                                    i14 = i32;
                                                }
                                                if (i14 <= 0 || !z14 || (user != null && org.telegram.messenger.p10.y(user))) {
                                                    t1Var = t1Var3;
                                                    z18 = z20;
                                                } else {
                                                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                                                    org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(1, parentActivity, h6Var);
                                                    d2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                                                    if (z17) {
                                                        d2Var = d2Var2;
                                                        d2Var.e(org.telegram.messenger.hd.a0("DeleteMessagesOptionAlso", null, 2131751513, org.telegram.messenger.p10.k(user, true)), "", false, false, false);
                                                    } else {
                                                        d2Var = d2Var2;
                                                        if (chat == null) {
                                                            str = null;
                                                            i15 = 2131751514;
                                                        } else if (z20 || i14 == size) {
                                                            d2Var.e(org.telegram.messenger.hd.N0(2131751528, null), "", false, false, false);
                                                        } else {
                                                            i15 = 2131751514;
                                                            str = null;
                                                        }
                                                        d2Var.e(org.telegram.messenger.hd.N0(i15, str), "", false, false, false);
                                                    }
                                                    org.telegram.ui.Cells.d2 d2Var3 = d2Var;
                                                    d2Var3.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    frameLayout.addView(d2Var3, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                    d2Var3.setOnClickListener(new g1(5, zArr));
                                                    alertDialog$Builder2.o(frameLayout);
                                                    t1Var3.H = 9;
                                                    t1Var = t1Var3;
                                                    z18 = z20;
                                                    z19 = true;
                                                }
                                            }
                                            z19 = false;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            if (gjVar2 != null) {
                                                TLRPC.MessageAction messageAction4 = gjVar2.k.action;
                                                if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                                                    if (bjVar != null) {
                                                        arrayList3.addAll(bjVar.d);
                                                    } else {
                                                        arrayList3.add(gjVar2);
                                                    }
                                                }
                                                i18 = (!gjVar2.n4() && org.telegram.messenger.gj.B0(gjVar2.k) == j3 && ((messageAction2 = gjVar2.k.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && gjVar2.N3() && currentTime - gjVar2.k.date <= i30) ? 1 : 0;
                                            } else {
                                                int i35 = 1;
                                                int i36 = 0;
                                                while (i35 >= 0) {
                                                    int i37 = i36;
                                                    int i38 = 0;
                                                    while (i38 < sparseArrayArr[i35].size()) {
                                                        org.telegram.messenger.gj gjVar6 = (org.telegram.messenger.gj) sparseArrayArr[i35].valueAt(i38);
                                                        int i39 = i38;
                                                        if (i35 == 1 && gjVar6.N3()) {
                                                            TLRPC.Message message5 = gjVar6.k;
                                                            i19 = i35;
                                                            if (message5.action == null && currentTime - message5.date <= i30) {
                                                                i37++;
                                                            }
                                                        } else {
                                                            i19 = i35;
                                                        }
                                                        arrayList3.add(gjVar6);
                                                        i38 = i39 + 1;
                                                        i35 = i19;
                                                    }
                                                    i35--;
                                                    i36 = i37;
                                                }
                                                i18 = i36;
                                            }
                                            int i40 = i18;
                                            ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new aa.m(6)).mapToLong(new org.telegram.messenger.pk(3)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.x0
                                                @Override // java.util.function.LongFunction
                                                public final Object apply(long j12) {
                                                    int i41 = i26;
                                                    return j12 > 0 ? org.telegram.messenger.np.u1(i41).c2(Long.valueOf(j12)) : org.telegram.messenger.np.u1(i41).O0(Long.valueOf(-j12));
                                                }
                                            }).filter(new aa.m(7)).filter(new org.telegram.ui.p8(org.telegram.messenger.k10.i(i26).e(), 2)).collect(Collectors.toCollection(new org.telegram.messenger.kk(1)));
                                            if (!arrayList4.isEmpty()) {
                                                if (channelParticipantArr != null) {
                                                    as asVar = new as(g2Var, chat, arrayList3, arrayList4, channelParticipantArr, j3, i7, i10, false, runnable);
                                                    if (runnable3 != null) {
                                                        asVar.I0 = new w0(2, runnable3);
                                                    }
                                                    asVar.show();
                                                    return;
                                                }
                                                final org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, parentActivity, null)};
                                                final int size2 = arrayList4.size();
                                                final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                                                final int[] iArr = new int[size2];
                                                int[] iArr2 = new int[1];
                                                final int i41 = 0;
                                                while (i41 < size2) {
                                                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                                                    tL_channels_getParticipant.channel = org.telegram.messenger.np.k1(chat);
                                                    tL_channels_getParticipant.participant = org.telegram.messenger.np.m1((TLObject) arrayList4.get(i41));
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i26);
                                                    ArrayList arrayList5 = arrayList4;
                                                    final int[] iArr3 = iArr2;
                                                    final Runnable runnable4 = runnable3;
                                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.y0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            final int[] iArr4 = iArr3;
                                                            final int[] iArr5 = iArr;
                                                            final int i42 = i41;
                                                            final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                                            final int i43 = size2;
                                                            final org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                                                            final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                                                            final TLRPC.User user2 = user;
                                                            final TLRPC.Chat chat2 = chat;
                                                            final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                            final TLRPC.ChatFull chatFull2 = chatFull;
                                                            final long j12 = j3;
                                                            final org.telegram.messenger.gj gjVar7 = gjVar;
                                                            final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                                            final org.telegram.messenger.bj bjVar2 = bjVar;
                                                            final int i44 = i7;
                                                            final int i45 = i10;
                                                            final Runnable runnable5 = runnable;
                                                            final Runnable runnable6 = runnable4;
                                                            final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.z1
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    org.telegram.ui.ActionBar.t1[] t1VarArr3 = t1VarArr2;
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
                                                                            t1VarArr3[0].dismiss();
                                                                        } catch (Throwable unused) {
                                                                        }
                                                                        t1VarArr3[0] = null;
                                                                        c5.y(g2Var2, user2, chat2, encryptedChat2, chatFull2, j12, gjVar7, sparseArrayArr2, bjVar2, i44, i45, channelParticipantArr4, runnable5, runnable6, h6Var2);
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
                                                org.telegram.messenger.g0.h3(new ai.i1(t1VarArr, iArr, i26, runnable2, g2Var), 1000L);
                                                return;
                                            }
                                            i13 = i26;
                                            if (i40 <= 0 || !z14) {
                                                z23 = false;
                                            } else {
                                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                                org.telegram.ui.Cells.d2 d2Var4 = new org.telegram.ui.Cells.d2(1, parentActivity, h6Var);
                                                d2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                                                d2Var4.e(org.telegram.messenger.hd.N0(2131751514, null), "", false, false, false);
                                                d2Var4.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                frameLayout2.addView(d2Var4, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                d2Var4.setOnClickListener(new g1(4, zArr));
                                                alertDialog$Builder2.o(frameLayout2);
                                                t1Var3.H = 9;
                                                z23 = true;
                                            }
                                            t1Var = t1Var3;
                                            z19 = z23;
                                            i14 = i40;
                                            z18 = false;
                                        }
                                        org.telegram.ui.ActionBar.t1 t1Var5 = t1Var;
                                        int i43 = i14;
                                        final long j12 = j10;
                                        int i44 = size;
                                        boolean z31 = z11;
                                        final int i45 = i13;
                                        z21 = z10;
                                        org.telegram.ui.ActionBar.q1 q1Var = new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.l3
                                            /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                            /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                            /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                            /* JADX WARN: Type inference failed for: r3v13 */
                                            /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
                                            /* JADX WARN: Type inference failed for: r3v15 */
                                            @Override // org.telegram.ui.ActionBar.q1
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var6, int i46) {
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
                                                boolean z32 = z21;
                                                int i50 = i45;
                                                long e10 = z32 ? org.telegram.messenger.k10.i(i50).e() : j12;
                                                org.telegram.messenger.gj gjVar7 = gjVar;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j17 = j3;
                                                int i51 = i7;
                                                boolean[] zArr2 = zArr;
                                                int i52 = i10;
                                                ArrayList arrayList9 = null;
                                                if (gjVar7 != null) {
                                                    ArrayList arrayList10 = new ArrayList();
                                                    ArrayList arrayList11 = new ArrayList();
                                                    org.telegram.messenger.bj bjVar2 = bjVar;
                                                    if (bjVar2 != null) {
                                                        ArrayList arrayList12 = bjVar2.d;
                                                        c10 = 0;
                                                        int i53 = 0;
                                                        while (i53 < arrayList12.size()) {
                                                            org.telegram.messenger.gj gjVar8 = (org.telegram.messenger.gj) arrayList12.get(i53);
                                                            int i54 = i50;
                                                            if (org.telegram.messenger.gj.c3(gjVar8.k)) {
                                                                arrayList10.add(gjVar8);
                                                            } else {
                                                                arrayList11.add(Integer.valueOf(gjVar8.e1()));
                                                                if (encryptedChat2 != null) {
                                                                    j16 = e10;
                                                                    if (gjVar8.k.random_id != 0 && gjVar8.D != 10) {
                                                                        if (arrayList9 == null) {
                                                                            arrayList9 = new ArrayList();
                                                                        }
                                                                        ArrayList arrayList13 = arrayList9;
                                                                        arrayList13.add(Long.valueOf(gjVar8.k.random_id));
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
                                                        if (org.telegram.messenger.gj.c3(gjVar7.k)) {
                                                            arrayList10.add(gjVar7);
                                                        } else {
                                                            arrayList11.add(Integer.valueOf(gjVar7.e1()));
                                                            if (encryptedChat2 != null && gjVar7.k.random_id != 0 && gjVar7.D != 10) {
                                                                ArrayList arrayList14 = new ArrayList();
                                                                arrayList14.add(Long.valueOf(gjVar7.k.random_id));
                                                                arrayList7 = arrayList14;
                                                                long j18 = (j17 == 0 && (peer = gjVar7.k.peer_id) != null && peer.chat_id == (-j17)) ? j17 : j13;
                                                                if (arrayList11.isEmpty()) {
                                                                    r32 = c10;
                                                                    arrayList8 = arrayList10;
                                                                    j14 = j18;
                                                                    i48 = 1;
                                                                    org.telegram.messenger.np.u1(i47).Z(arrayList11, arrayList7, encryptedChat2, j14, i51, zArr2[c10], i52);
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
                                                                    org.telegram.messenger.gj gjVar9 = (org.telegram.messenger.gj) obj;
                                                                    org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i47);
                                                                    ArrayList arrayList15 = new ArrayList();
                                                                    arrayList15.add(Integer.valueOf(gjVar9.e1()));
                                                                    if (j14 == 0 || !org.telegram.messenger.n5.z(j14)) {
                                                                        j15 = 0;
                                                                    } else {
                                                                        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j14));
                                                                        j15 = org.telegram.messenger.v3.T(O0) ? O0.id : 0L;
                                                                    }
                                                                    u12.s3(arrayList15, j14);
                                                                    org.telegram.messenger.ur messagesStorage = u12.getMessagesStorage();
                                                                    int P0 = gjVar9.P0();
                                                                    messagesStorage.getClass();
                                                                    a0.h hVar = new a0.h(i48);
                                                                    ArrayList arrayList16 = new ArrayList(i48);
                                                                    arrayList16.add(Integer.valueOf(P0));
                                                                    hVar.k(arrayList16, j14);
                                                                    messagesStorage.I(new org.telegram.messenger.yf(messagesStorage, hVar, (boolean) r32, 3));
                                                                    u12.getMessagesStorage().P0(j14, arrayList15, true, true, org.telegram.messenger.gj.d5(gjVar9.k) ? 9 : r32, i51);
                                                                    u12.getMessagesStorage().R1(j14, j15, arrayList15, null);
                                                                    org.telegram.messenger.ls notificationCenter = u12.getNotificationCenter();
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
                                                                    notificationCenter.k(org.telegram.messenger.ls.w, objArr);
                                                                    if (!org.telegram.messenger.gj.d5(gjVar9.k) || gjVar9.b5()) {
                                                                        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                        tL_deleteMessage.peer = u12.l1(org.telegram.messenger.gj.B0(gjVar9.k));
                                                                        TLRPC.Message message6 = gjVar9.k;
                                                                        tL_deleteMessage.receiver_id = u12.q1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                        tL_deleteMessage.id = gjVar9.P0();
                                                                        u12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
                                                                    } else {
                                                                        TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                        tL_deleteWelcomeMessage.peer = u12.l1(org.telegram.messenger.gj.B0(gjVar9.k));
                                                                        tL_deleteWelcomeMessage.id = gjVar9.P0();
                                                                        u12.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new jh.b(3));
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
                                                                org.telegram.messenger.gj gjVar10 = (org.telegram.messenger.gj) sparseArrayArr2[i56].valueAt(i58);
                                                                int i59 = i55;
                                                                long j20 = gjVar10.k.random_id;
                                                                if (j20 != 0 && gjVar10.D != 10) {
                                                                    arrayList6.add(Long.valueOf(j20));
                                                                }
                                                                i58++;
                                                                i55 = i59;
                                                            }
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                        int i60 = i55;
                                                        org.telegram.messenger.np.u1(i50).Z(arrayList17, arrayList6, encryptedChat2, (i56 != 1 || j17 == 0) ? j19 : j17, i51, zArr2[i60], i52);
                                                        sparseArrayArr2[i56].clear();
                                                        i56--;
                                                        i55 = i60;
                                                    }
                                                }
                                                runnable.run();
                                            }
                                        };
                                        if (z21) {
                                            i17 = i44;
                                            t1Var2 = t1Var5;
                                            str2 = null;
                                            if (i17 == 1) {
                                                t1Var2.S = org.telegram.messenger.hd.N0(2131751484, null);
                                            } else {
                                                t1Var2.S = org.telegram.messenger.hd.a0(null, null, 2131751507, org.telegram.messenger.hd.G(i17, "messages", new Object[0]));
                                            }
                                        } else {
                                            i17 = i44;
                                            if (i17 == 1) {
                                                str2 = null;
                                                t1Var2 = t1Var5;
                                                t1Var2.S = org.telegram.messenger.hd.N0(2131743591, null);
                                            } else {
                                                t1Var2 = t1Var5;
                                                str2 = null;
                                                t1Var2.S = org.telegram.messenger.hd.a0(null, null, 2131743592, org.telegram.messenger.hd.G(i17, "messages", new Object[0]));
                                            }
                                        }
                                        if (z21) {
                                            if (chat == null || !z18) {
                                                if (!z19 || z17 || i43 == i17) {
                                                    if (chat == null || !chat.megagroup || z24) {
                                                        if (i17 == 1) {
                                                            t1Var2.U = org.telegram.messenger.hd.N0(2131754090, null);
                                                        } else {
                                                            t1Var2.U = org.telegram.messenger.hd.N0(2131754098, null);
                                                        }
                                                    } else if (i17 == 1) {
                                                        t1Var2.U = org.telegram.messenger.hd.N0((gjVar == null || !org.telegram.messenger.gj.c3(gjVar.k)) ? 2131754089 : 2131754090, null);
                                                    } else {
                                                        t1Var2.U = org.telegram.messenger.hd.N0(2131754097, null);
                                                    }
                                                } else if (chat != null) {
                                                    t1Var2.U = org.telegram.messenger.hd.a0("DeleteMessagesTextGroup", null, 2131751509, org.telegram.messenger.hd.G(i43, "messages", new Object[0]));
                                                } else {
                                                    t1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("DeleteMessagesText", null, 2131751510, org.telegram.messenger.hd.G(i43, "messages", new Object[0]), org.telegram.messenger.p10.k(user, true)));
                                                }
                                            } else if (z19 && i43 != i17) {
                                                t1Var2.U = org.telegram.messenger.hd.a0(null, null, 2131751508, org.telegram.messenger.hd.G(i43, "messages", new Object[0]));
                                            } else if (i17 == 1) {
                                                t1Var2.U = org.telegram.messenger.hd.N0(2131754090, null);
                                            } else {
                                                t1Var2.U = org.telegram.messenger.hd.N0(2131754098, null);
                                            }
                                        } else if (i17 == 1) {
                                            t1Var2.U = org.telegram.messenger.hd.N0(2131754060, str2);
                                        } else {
                                            t1Var2.U = org.telegram.messenger.hd.N0(2131754061, str2);
                                        }
                                        if (gjVar == null) {
                                            z22 = gjVar.u3() && !org.telegram.messenger.gj.l3(gjVar.k);
                                            if (z22) {
                                                long j13 = ((TLRPC.TL_messageMediaGiveaway) gjVar.k.media).until_date * 1000;
                                                str3 = org.telegram.messenger.hd.E0().u0().format(new Date(j13));
                                                z22 = System.currentTimeMillis() < j13;
                                            }
                                            str3 = null;
                                        } else if (i17 == 1) {
                                            boolean z32 = false;
                                            str3 = null;
                                            for (int i46 = 1; i46 >= 0; i46--) {
                                                for (int i47 = 0; i47 < sparseArrayArr[i46].size(); i47++) {
                                                    org.telegram.messenger.gj gjVar7 = (org.telegram.messenger.gj) sparseArrayArr[i46].valueAt(i47);
                                                    boolean z33 = gjVar7.u3() && !org.telegram.messenger.gj.l3(gjVar7.k);
                                                    if (z33) {
                                                        long j14 = ((TLRPC.TL_messageMediaGiveaway) gjVar7.k.media).until_date * 1000;
                                                        str3 = org.telegram.messenger.hd.E0().u0().format(new Date(j14));
                                                        z32 = System.currentTimeMillis() < j14;
                                                    } else {
                                                        z32 = z33;
                                                    }
                                                }
                                            }
                                            z22 = z32;
                                        } else {
                                            z22 = false;
                                            str3 = null;
                                        }
                                        if (z15) {
                                            AlertDialog$Builder alertDialog$Builder4 = alertDialog$Builder2;
                                            r82 = 0;
                                            r82 = 0;
                                            r82 = 0;
                                            if (z31) {
                                                int n22 = (int) org.telegram.messenger.np.u1(i45).A7.i.n2(TimeUnit.HOURS);
                                                t1Var2.S = org.telegram.messenger.hd.N0(2131744091, null);
                                                t1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744090, Integer.valueOf(n22)));
                                                alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131744093, null), q1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else if (!z22 || z21) {
                                                alertDialog$Builder4.k(org.telegram.messenger.hd.N0(z21 ? 2131746125 : 2131751586, null), q1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else {
                                                t1Var2.S = org.telegram.messenger.hd.N0(2131753476, null);
                                                t1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131753477, str3));
                                                alertDialog$Builder4.i(org.telegram.messenger.hd.N0(2131751586, null), q1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            }
                                        } else {
                                            int n23 = (int) org.telegram.messenger.np.u1(i45).A7.i.n2(TimeUnit.HOURS);
                                            r82 = 0;
                                            t1Var2.S = org.telegram.messenger.hd.N0(2131744094, null);
                                            t1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744092, Integer.valueOf(n23)));
                                            AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder2;
                                            alertDialog$Builder5.k(org.telegram.messenger.hd.N0(2131744093, null), q1Var);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        }
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, r82), r82);
                                        t1Var2.O = new w0(3, runnable2);
                                        g2Var.showDialog(t1Var2);
                                        textView = (TextView) t1Var2.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, r82);
                                        }
                                        textView2 = (TextView) t1Var2.d(-3);
                                        if (textView2 == null) {
                                            t1Var2.u0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f));
                                            ((ViewGroup.MarginLayoutParams) t1Var2.u0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-8.0f);
                                            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q7, null);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    z16 = z29;
                                }
                                z17 = false;
                                if (chat != null) {
                                }
                                i13 = i26;
                                if (z24) {
                                }
                                t1Var = t1Var3;
                                i14 = 0;
                                z18 = false;
                                z19 = false;
                                org.telegram.ui.ActionBar.t1 t1Var52 = t1Var;
                                int i432 = i14;
                                final long j122 = j10;
                                int i442 = size;
                                boolean z312 = z11;
                                final int i452 = i13;
                                z21 = z10;
                                org.telegram.ui.ActionBar.q1 q1Var2 = new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.l3
                                    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                    /* JADX WARN: Type inference failed for: r3v13 */
                                    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r3v15 */
                                    @Override // org.telegram.ui.ActionBar.q1
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var6, int i462) {
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
                                        boolean z322 = z21;
                                        int i50 = i452;
                                        long e10 = z322 ? org.telegram.messenger.k10.i(i50).e() : j122;
                                        org.telegram.messenger.gj gjVar72 = gjVar;
                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                        long j17 = j3;
                                        int i51 = i7;
                                        boolean[] zArr2 = zArr;
                                        int i52 = i10;
                                        ArrayList arrayList9 = null;
                                        if (gjVar72 != null) {
                                            ArrayList arrayList10 = new ArrayList();
                                            ArrayList arrayList11 = new ArrayList();
                                            org.telegram.messenger.bj bjVar2 = bjVar;
                                            if (bjVar2 != null) {
                                                ArrayList arrayList12 = bjVar2.d;
                                                c10 = 0;
                                                int i53 = 0;
                                                while (i53 < arrayList12.size()) {
                                                    org.telegram.messenger.gj gjVar8 = (org.telegram.messenger.gj) arrayList12.get(i53);
                                                    int i54 = i50;
                                                    if (org.telegram.messenger.gj.c3(gjVar8.k)) {
                                                        arrayList10.add(gjVar8);
                                                    } else {
                                                        arrayList11.add(Integer.valueOf(gjVar8.e1()));
                                                        if (encryptedChat2 != null) {
                                                            j16 = e10;
                                                            if (gjVar8.k.random_id != 0 && gjVar8.D != 10) {
                                                                if (arrayList9 == null) {
                                                                    arrayList9 = new ArrayList();
                                                                }
                                                                ArrayList arrayList13 = arrayList9;
                                                                arrayList13.add(Long.valueOf(gjVar8.k.random_id));
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
                                                if (org.telegram.messenger.gj.c3(gjVar72.k)) {
                                                    arrayList10.add(gjVar72);
                                                } else {
                                                    arrayList11.add(Integer.valueOf(gjVar72.e1()));
                                                    if (encryptedChat2 != null && gjVar72.k.random_id != 0 && gjVar72.D != 10) {
                                                        ArrayList arrayList14 = new ArrayList();
                                                        arrayList14.add(Long.valueOf(gjVar72.k.random_id));
                                                        arrayList7 = arrayList14;
                                                        long j18 = (j17 == 0 && (peer = gjVar72.k.peer_id) != null && peer.chat_id == (-j17)) ? j17 : j132;
                                                        if (arrayList11.isEmpty()) {
                                                            r32 = c10;
                                                            arrayList8 = arrayList10;
                                                            j142 = j18;
                                                            i48 = 1;
                                                            org.telegram.messenger.np.u1(i472).Z(arrayList11, arrayList7, encryptedChat2, j142, i51, zArr2[c10], i52);
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
                                                            org.telegram.messenger.gj gjVar9 = (org.telegram.messenger.gj) obj;
                                                            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i472);
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(Integer.valueOf(gjVar9.e1()));
                                                            if (j142 == 0 || !org.telegram.messenger.n5.z(j142)) {
                                                                j15 = 0;
                                                            } else {
                                                                TLRPC.Chat O0 = u12.O0(Long.valueOf(-j142));
                                                                j15 = org.telegram.messenger.v3.T(O0) ? O0.id : 0L;
                                                            }
                                                            u12.s3(arrayList15, j142);
                                                            org.telegram.messenger.ur messagesStorage = u12.getMessagesStorage();
                                                            int P0 = gjVar9.P0();
                                                            messagesStorage.getClass();
                                                            a0.h hVar = new a0.h(i48);
                                                            ArrayList arrayList16 = new ArrayList(i48);
                                                            arrayList16.add(Integer.valueOf(P0));
                                                            hVar.k(arrayList16, j142);
                                                            messagesStorage.I(new org.telegram.messenger.yf(messagesStorage, hVar, (boolean) r32, 3));
                                                            u12.getMessagesStorage().P0(j142, arrayList15, true, true, org.telegram.messenger.gj.d5(gjVar9.k) ? 9 : r32, i51);
                                                            u12.getMessagesStorage().R1(j142, j15, arrayList15, null);
                                                            org.telegram.messenger.ls notificationCenter = u12.getNotificationCenter();
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
                                                            notificationCenter.k(org.telegram.messenger.ls.w, objArr);
                                                            if (!org.telegram.messenger.gj.d5(gjVar9.k) || gjVar9.b5()) {
                                                                TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                tL_deleteMessage.peer = u12.l1(org.telegram.messenger.gj.B0(gjVar9.k));
                                                                TLRPC.Message message6 = gjVar9.k;
                                                                tL_deleteMessage.receiver_id = u12.q1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                tL_deleteMessage.id = gjVar9.P0();
                                                                u12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
                                                            } else {
                                                                TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                tL_deleteWelcomeMessage.peer = u12.l1(org.telegram.messenger.gj.B0(gjVar9.k));
                                                                tL_deleteWelcomeMessage.id = gjVar9.P0();
                                                                u12.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new jh.b(3));
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
                                                        org.telegram.messenger.gj gjVar10 = (org.telegram.messenger.gj) sparseArrayArr2[i56].valueAt(i58);
                                                        int i59 = i55;
                                                        long j20 = gjVar10.k.random_id;
                                                        if (j20 != 0 && gjVar10.D != 10) {
                                                            arrayList6.add(Long.valueOf(j20));
                                                        }
                                                        i58++;
                                                        i55 = i59;
                                                    }
                                                } else {
                                                    arrayList6 = null;
                                                }
                                                int i60 = i55;
                                                org.telegram.messenger.np.u1(i50).Z(arrayList17, arrayList6, encryptedChat2, (i56 != 1 || j17 == 0) ? j19 : j17, i51, zArr2[i60], i52);
                                                sparseArrayArr2[i56].clear();
                                                i56--;
                                                i55 = i60;
                                            }
                                        }
                                        runnable.run();
                                    }
                                };
                                if (z21) {
                                }
                                if (z21) {
                                }
                                if (gjVar == null) {
                                }
                                if (z15) {
                                }
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, r82), r82);
                                t1Var2.O = new w0(3, runnable2);
                                g2Var.showDialog(t1Var2);
                                textView = (TextView) t1Var2.d(-1);
                                if (textView != null) {
                                }
                                textView2 = (TextView) t1Var2.d(-3);
                                if (textView2 == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.t1 z(LaunchActivity launchActivity) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                                String N0 = org.telegram.messenger.hd.N0(2131748524, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.hd.N0(2131748525, null);
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131748527, null), new h1(launchActivity, 1));
                                return t1Var;
                            }
                        }
