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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class b5 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static org.telegram.ui.ActionBar.u1 A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747111, null));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.U = W2;
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new t0(activity, 2));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.u1 B(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.nr nrVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.gd.M0(2131745422, null), org.telegram.messenger.gd.M0(2131745421, null), org.telegram.messenger.gd.M0(2131745420, null), org.telegram.messenger.gd.M0(2131745419, null)};
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.gd.M0(2131748652, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131748649, org.telegram.messenger.o10.k(user, true)));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(2131748650, null));
        }
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
        f10.addView(textView, c8.ma.t(-2, -2, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i7 = 0;
        while (i7 < 4) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
            j6Var.d = 42;
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i7));
            a(j6Var, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            j6Var.b(strArr[i7], iArr[0] == i7);
            f10.addView(j6Var);
            j6Var.setOnClickListener(new u1(iArr, f10));
            i7++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z10) {
            u1Var.S = org.telegram.messenger.gd.M0(2131748651, null);
        } else {
            int i10 = org.telegram.ui.ActionBar.n6.L5;
            int i11 = i6Var != null ? i6Var.i(i10) : org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            u1Var.c0 = new zo0(activity, 0);
            u1Var.d0 = i11;
            u1Var.e0 = -1;
            if (i6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.n6.L5, null);
            }
        }
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745264, null), new oi.e0(29, iArr, nrVar));
        alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.x2 C(final long j3, final long j10, final org.telegram.ui.ActionBar.h2 h2Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        if (h2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.x2 j11 = org.telegram.messenger.n10.j(h2Var.getParentActivity(), false, 1, i6Var);
        j11.P = org.telegram.messenger.gd.M0(2131747731, null);
        j11.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.a0("MuteFor", null, 2131748120, org.telegram.messenger.gd.G(1, "Hours", new Object[0])), org.telegram.messenger.gd.a0("MuteFor", null, 2131748120, org.telegram.messenger.gd.G(8, "Hours", new Object[0])), org.telegram.messenger.gd.a0("MuteFor", null, 2131748120, org.telegram.messenger.gd.G(2, "Days", new Object[0])), org.telegram.messenger.gd.M0(2131748121, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.g3
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
                org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).T(j3, i10, j10);
                org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                if (lc.a(h2Var2)) {
                    lc.z(h2Var2, i10, 0, i6Var).j();
                }
            }
        };
        j11.M = charSequenceArr;
        j11.L = onClickListener;
        return j11;
    }

    public static void D(Context context, org.telegram.ui.ActionBar.i6 i6Var, z4 z4Var) {
        if (context == null) {
            return;
        }
        int i7 = 0;
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        int i11 = i6Var != null ? i6Var.i(i10) : org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i12 = org.telegram.ui.ActionBar.n6.h5;
        int i13 = i6Var != null ? i6Var.i(i12) : org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        int i14 = org.telegram.ui.ActionBar.n6.Aj;
        if (i6Var != null) {
            i6Var.i(i14);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.n6.Ej;
        if (i6Var != null) {
            i6Var.i(i15);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.n6.E8;
        if (i6Var != null) {
            i6Var.i(i16);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.n6.G8;
        if (i6Var != null) {
            i6Var.i(i17);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.n6.i6;
        if (i6Var != null) {
            i6Var.i(i18);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.n6.Ji;
        int i20 = i6Var != null ? i6Var.i(i19) : org.telegram.ui.ActionBar.n6.x0(null, i19, false);
        int i21 = org.telegram.ui.ActionBar.n6.Fi;
        int i22 = i6Var != null ? i6Var.i(i21) : org.telegram.ui.ActionBar.n6.x0(null, i21, false);
        int i23 = org.telegram.ui.ActionBar.n6.Hi;
        int i24 = i6Var != null ? i6Var.i(i23) : org.telegram.ui.ActionBar.n6.x0(null, i23, false);
        hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
        int[] iArr = {30, 60, 120, org.telegram.messenger.ks.K2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        p4 p4Var = new p4(context, i6Var, iArr);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(20);
        p4Var.setTextColor(i11);
        p4Var.setValue(0);
        p4Var.setFormatter(new e1(iArr, i7));
        l4 l4Var = new l4(context, p4Var, 1);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.M0(2131748118, null));
        textView.setTextColor(i11);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.xb xbVar = new di.xb(context, 19);
        linearLayout.addView(p4Var, c8.ma.l(1.0f, 0, org.telegram.messenger.ks.t4));
        p4Var.setOnValueChangedListener(new org.telegram.ui.cr(11));
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(i20);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, i22, i24, i24));
        xbVar.setText(org.telegram.messenger.gd.M0(2131753864, null));
        l4Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new bi.n6(iArr, p4Var, z4Var, w4Var, 7));
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.b;
        x2Var.O = l4Var;
        x2Var.show();
        x2Var.v0(i13);
        x2Var.P(i13);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = str;
        HashMap hashMap = new HashMap();
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.n6.v0(i7)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.n6.v0(i7)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.n6.v0(i7), hashMap);
        alertDialog$Builder.n(i7, null);
        u1Var.X = true;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752030, null), null);
        u1Var.U = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.u1 F(Activity activity, long j3, final long j10, int i7, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        int i11;
        char c10;
        CharSequence[] charSequenceArr;
        final long j11 = j3;
        final int i12 = i7;
        final SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g7;
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
            charSequenceArr = new String[]{org.telegram.messenger.gd.M0(2131747687, null), org.telegram.messenger.gd.M0(2131747689, null), org.telegram.messenger.gd.M0(2131747688, null), org.telegram.messenger.gd.M0(2131747690, null), org.telegram.messenger.gd.M0(2131747686, null)};
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
                charSequenceArr2[0] = org.telegram.messenger.gd.M0(2131747689, null);
                charSequenceArr2[1] = org.telegram.messenger.gd.M0(2131747688, null);
                charSequenceArr2[c10] = org.telegram.messenger.gd.M0(2131747690, null);
                charSequenceArr2[3] = org.telegram.messenger.gd.M0(2131747686, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.gd.M0(2131747689, null);
            charSequenceArr22[1] = org.telegram.messenger.gd.M0(2131747688, null);
            charSequenceArr22[c10] = org.telegram.messenger.gd.M0(2131747690, null);
            charSequenceArr22[3] = org.telegram.messenger.gd.M0(2131747686, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, i10);
        int i15 = i11;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, activity, i6Var);
        int i16 = i15;
        while (i16 < charSequenceArr.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), i15, org.telegram.messenger.g0.L(4.0f), i15);
            j6Var.setTag(Integer.valueOf(i16));
            a(j6Var, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            j6Var.b(charSequenceArr[i16], iArr[i15] == i16 ? 1 : i15);
            f10.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i17 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g7.edit();
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).l(j12, j10);
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).m(i21);
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
        String M0 = org.telegram.messenger.gd.M0(2131747713, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static void G(int i7, Activity activity, long j3, TLRPC.Photo photo, fi.b bVar) {
        if (activity != null) {
            bi.z zVar = new bi.z(i7, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, (Context) activity, (org.telegram.ui.ActionBar.i6) bVar, true);
            x2Var.O();
            x2Var.P = org.telegram.messenger.gd.M0(2131746017, null);
            x2Var.Q = true;
            CharSequence[] charSequenceArr = {org.telegram.messenger.gd.M0(2131746026, null), org.telegram.messenger.gd.M0(2131746032, null), org.telegram.messenger.gd.M0(2131746025, null), org.telegram.messenger.gd.M0(2131746034, null), org.telegram.messenger.gd.M0(2131746031, null), org.telegram.messenger.gd.M0(2131746029, null), org.telegram.messenger.gd.M0(2131746028, null), org.telegram.messenger.gd.M0(2131746030, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            z2 z2Var = new z2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, zVar, 0);
            x2Var.M = charSequenceArr;
            x2Var.N = iArr;
            x2Var.L = z2Var;
            x2Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v24, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View] */
    public static hi.w4 H(final Context context, final long j3, long j10, int i7, boolean z10, final z4 z4Var, Runnable runnable, y4 y4Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        sb0 sb0Var;
        long j11;
        boolean[] zArr;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.r0 r0Var;
        long j12;
        Calendar calendar;
        char c10;
        int i11;
        int i12;
        int[] iArr;
        org.telegram.messenger.camera.i iVar;
        String[] strArr;
        mh0 mh0Var;
        int[] iArr2;
        int i13;
        int i14;
        float f10;
        String[] strArr2;
        ph0 ph0Var;
        org.telegram.messenger.camera.i iVar2;
        ?? r42;
        ph0 ph0Var2;
        final org.telegram.ui.ActionBar.x2 x2Var;
        int i15;
        TLRPC.User c22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i7};
        long e10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).e();
        final hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
        sb0 sb0Var2 = new sb0(context, i6Var);
        int i16 = y4Var.a;
        int i17 = y4Var.c;
        int i18 = y4Var.b;
        sb0Var2.setTextColor(i16);
        sb0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var2.setItemCount(5);
        final y3 y3Var = new y3(context, i6Var);
        y3Var.setWrapSelectorWheel(true);
        y3Var.setAllItemsCount(24);
        y3Var.setItemCount(5);
        y3Var.setTextColor(i16);
        y3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final z3 z3Var = new z3(context, i6Var);
        z3Var.setWrapSelectorWheel(true);
        z3Var.setAllItemsCount(60);
        z3Var.setItemCount(5);
        z3Var.setTextColor(i16);
        z3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        v3 v3Var = new v3(context, sb0Var2, y3Var, z3Var, 1);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setOrientation(1);
        frameLayout2.addView(v3Var, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        v3Var.addView(frameLayout4, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i10 = 0;
        } else if (j3 == e10) {
            i10 = 0;
            textView.setText(org.telegram.messenger.gd.M0(2131745319, null));
        } else {
            i10 = 0;
            textView.setText(org.telegram.messenger.gd.M0(2131745664, null));
        }
        textView.setTextColor(i16);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout4.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        boolean[] zArr2 = new boolean[1];
        zArr2[i10] = true;
        if (!org.telegram.messenger.n5.E(j3) || j3 == e10 || (c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).c2(Long.valueOf(j3))) == null || c22.bot || (userStatus = c22.status) == null || userStatus.expires <= 0) {
            r82 = v3Var;
            context2 = context;
            viewGroup = frameLayout2;
            frameLayout = frameLayout3;
            sb0Var = sb0Var2;
            j11 = e10;
            zArr = zArr2;
            viewGroup2 = frameLayout4;
            r0Var = null;
        } else {
            String k10 = org.telegram.messenger.o10.k(c22, true);
            if (k10.length() > 10) {
                k10 = k10.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout3;
            r82 = v3Var;
            sb0Var = sb0Var2;
            j11 = e10;
            viewGroup2 = frameLayout4;
            zArr = zArr2;
            viewGroup = frameLayout2;
            r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, y4Var.a, false, i6Var);
            context2 = context;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(R.drawable.ic_ab_other);
            r0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(i17, 1, -1));
            viewGroup2.addView(r0Var, c8.ma.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            r0Var.g(1, org.telegram.messenger.gd.a0(null, null, 2131745655, k10));
            r0Var.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        }
        int i19 = 23;
        if (r0Var != null) {
            r0Var.setOnClickListener(new ni.b(i19, r0Var, y4Var));
            r0Var.setDelegate(new a3.h(z4Var, zArr, w4Var, 19));
        }
        ph0 ph0Var3 = new ph0(context2);
        mh0 mh0Var2 = new mh0(R.raw.notify_toggle, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        mh0Var2.J(true);
        mh0Var2.h = true;
        mh0Var2.start();
        mh0Var2.M(40);
        mh0Var2.P(40);
        ph0Var3.setScaleType(ImageView.ScaleType.CENTER);
        ph0Var3.setAnimation(mh0Var2);
        ph0Var3.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        ph0Var3.setBackground(org.telegram.ui.ActionBar.n6.h0(i17, 1, -1));
        viewGroup2.addView(ph0Var3, c8.ma.d(40, 40.0f, 53, 0.0f, 8.0f, (r0Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final di.xb xbVar = new di.xb(context2, 14);
        final org.telegram.ui.ActionBar.r0 r0Var2 = r0Var;
        linearLayout.addView(sb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(365);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setFormatter(new org.telegram.ui.cr(12));
        ViewGroup viewGroup3 = viewGroup;
        final sb0 sb0Var3 = sb0Var;
        final boolean[] zArr3 = zArr;
        final long j13 = j11;
        qb0 qb0Var = new qb0() { // from class: org.telegram.ui.Components.t1
            @Override // org.telegram.ui.Components.qb0
            public final void n(sb0 sb0Var4, int i20) {
                b5.g(di.xb.this, null, 0L, 0L, j13 == j3 ? 1 : 0, sb0Var3, y3Var, z3Var);
            }
        };
        sb0Var3.setOnValueChangedListener(qb0Var);
        y3Var.setMinValue(0);
        y3Var.setMaxValue(23);
        linearLayout.addView(y3Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ks.t4));
        y3Var.setFormatter(new org.telegram.ui.cr(15));
        y3Var.setOnValueChangedListener(qb0Var);
        z3Var.setMinValue(0);
        z3Var.setMaxValue(59);
        z3Var.setValue(0);
        z3Var.setFormatter(new org.telegram.ui.cr(17));
        linearLayout.addView(z3Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ks.t4));
        z3Var.setOnValueChangedListener(qb0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            j12 = j13;
            calendar = calendar2;
        } else {
            long j14 = 1000 * j10;
            j12 = j13;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                z3Var.setValue(calendar.get(12));
                y3Var.setValue(calendar.get(11));
                sb0Var3.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(xbVar, null, 0L, 0L, j12 == j3 ? 1 : 0, sb0Var3, y3Var, z3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i11 = 10;
            iArr = new int[]{0, 60, org.telegram.messenger.ks.X4, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            i12 = 8;
        } else {
            c10 = '\t';
            i11 = 10;
            i12 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        int i20 = i12;
        if (isTestBackend) {
            strArr = new String[i11];
            iVar = null;
            strArr[0] = org.telegram.messenger.gd.M0(2131748308, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.gd.M0(2131748310, null);
            strArr[4] = org.telegram.messenger.gd.M0(2131748307, null);
            strArr[5] = org.telegram.messenger.gd.M0(2131748311, null);
            strArr[6] = org.telegram.messenger.gd.M0(2131748309, null);
            strArr[7] = org.telegram.messenger.gd.M0(2131748313, null);
            strArr[i20] = org.telegram.messenger.gd.M0(2131748312, null);
            strArr[c10] = org.telegram.messenger.gd.M0(2131748306, null);
        } else {
            iVar = null;
            strArr = new String[i20];
            strArr[0] = org.telegram.messenger.gd.M0(2131748308, null);
            strArr[1] = org.telegram.messenger.gd.M0(2131748310, null);
            strArr[2] = org.telegram.messenger.gd.M0(2131748307, null);
            strArr[3] = org.telegram.messenger.gd.M0(2131748311, null);
            strArr[4] = org.telegram.messenger.gd.M0(2131748309, null);
            strArr[5] = org.telegram.messenger.gd.M0(2131748313, null);
            strArr[6] = org.telegram.messenger.gd.M0(2131748312, null);
            strArr[7] = org.telegram.messenger.gd.M0(2131748306, null);
        }
        if (z10) {
            mh0Var = mh0Var2;
            iArr2 = iArr;
            i13 = 0;
            i14 = i18;
            f10 = 14.0f;
            strArr2 = strArr;
            ph0Var = ph0Var3;
            iVar2 = iVar;
            r42 = iVar2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            i14 = i18;
            f10 = 14.0f;
            int w10 = org.telegram.ui.ActionBar.n6.w(i14, org.telegram.ui.ActionBar.n6.r1(0.075f, i16));
            String[] strArr3 = strArr;
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, i16);
            ?? textView2 = new TextView(context2);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i16);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.n6.w(w10, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w10, w11, w11));
            textView2.setGravity(17);
            strArr2 = strArr3;
            int[] iArr4 = iArr;
            mh0Var = mh0Var2;
            i13 = 0;
            ph0Var = ph0Var3;
            iVar2 = new org.telegram.messenger.camera.i(iArr4, iArr3, strArr2, textView2, 21);
            iArr2 = iArr4;
            iVar2.run();
            frameLayout5.addView(textView2, c8.ma.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout5, c8.ma.o(-1, -2));
            iVar = textView2;
            r42 = frameLayout5;
        }
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), i13, org.telegram.messenger.g0.L(34.0f), i13);
        xbVar.setGravity(17);
        xbVar.setTextColor(y4Var.g);
        xbVar.setTextSize(1, f10);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int i21 = y4Var.h;
        float[] fArr = new float[1];
        fArr[i13] = 24.0f;
        xbVar.setBackground(org.telegram.ui.ActionBar.b6.e(i21, fArr));
        r82.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        int i22 = i14;
        ph0 ph0Var4 = ph0Var;
        final long j15 = j12;
        xbVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr4[0] = false;
                int i23 = j15 == j3 ? 1 : 0;
                sb0 sb0Var4 = sb0Var3;
                y3 y3Var2 = y3Var;
                z3 z3Var2 = z3Var;
                boolean g10 = b5.g(null, null, 0L, 0L, i23, sb0Var4, y3Var2, z3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, sb0Var4.getValue());
                calendar4.set(11, y3Var2.getValue());
                calendar4.set(12, z3Var2.getValue());
                if (g10) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                z4Var.O((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                ((org.telegram.ui.ActionBar.x2) w4Var.b).y0.run();
            }
        });
        org.telegram.ui.ActionBar.x2 x2Var2 = (org.telegram.ui.ActionBar.x2) w4Var.b;
        x2Var2.O = viewGroup3;
        x2Var2.show();
        x2Var2.setOnDismissListener(new h2(runnable, zArr4));
        x2Var2.v0(i22);
        x2Var2.P(i22);
        if (iVar != null) {
            ph0Var2 = ph0Var4;
            i15 = 1;
            x2Var = x2Var2;
            iVar.setOnClickListener(new i3(frameLayout, i6Var, x2Var2, (FrameLayout) r42, iArr2, strArr2, iArr3, iVar2));
        } else {
            ph0Var2 = ph0Var4;
            x2Var = x2Var2;
            i15 = 1;
        }
        final hi.m3[] m3VarArr = new hi.m3[i15];
        final mh0 mh0Var3 = mh0Var;
        ph0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String M0;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                mh0 mh0Var4 = mh0Var3;
                if (z11) {
                    if (mh0Var4.b0 < 40) {
                        mh0Var4.M(40);
                    }
                    mh0Var4.P(80);
                    mh0Var4.start();
                } else {
                    if (mh0Var4.b0 >= 40) {
                        mh0Var4.M(0);
                    }
                    mh0Var4.P(40);
                    mh0Var4.start();
                }
                hi.m3[] m3VarArr2 = m3VarArr;
                hi.m3 m3Var = m3VarArr2[0];
                if (m3Var != null) {
                    m3Var.f(true);
                    m3VarArr2[0] = null;
                }
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0);
                long j16 = j3;
                TLRPC.User c23 = u12.c2(Long.valueOf(j16));
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).O0(Long.valueOf(-j16));
                hi.m3 m3Var2 = new hi.m3(context, 3);
                m3VarArr2[0] = m3Var2;
                m3Var2.t();
                m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                m3Var2.s(20.0f);
                m3Var2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.25f, -16777216));
                if (org.telegram.messenger.v3.V(O0)) {
                    M0 = org.telegram.messenger.gd.M0(zArr5[0] ? 2131745659 : 2131745663, null);
                } else if (O0 != null || c23 == null) {
                    M0 = org.telegram.messenger.gd.M0(zArr5[0] ? 2131745657 : 2131745661, null);
                } else if (j16 == j15) {
                    M0 = org.telegram.messenger.gd.M0(zArr5[0] ? 2131745656 : 2131745660, null);
                } else {
                    M0 = org.telegram.messenger.gd.a0(null, null, zArr5[0] ? 2131745658 : 2131745662, org.telegram.messenger.o10.l(c23));
                }
                m3Var2.v(M0);
                m3Var2.d = 5000L;
                m3Var2.o(1.0f, -((r0Var2 != null ? 42 : -8) + 20));
                m3Var2.r0 = new h3(m3Var2, 0);
                org.telegram.ui.ActionBar.x2 x2Var3 = x2Var;
                x2Var3.b.setClipToPadding(false);
                x2Var3.b.setClipChildren(false);
                x2Var3.b.addView(m3Var2, c8.ma.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                m3Var2.x();
            }
        });
        return w4Var;
    }

    public static void I(Context context, long j3, z4 z4Var) {
        H(context, j3, -1L, 0, false, z4Var, null, new y4(null), null);
    }

    public static void J(Context context, long j3, z4 z4Var, org.telegram.ui.ActionBar.i6 i6Var) {
        H(context, j3, -1L, 0, false, z4Var, null, new y4(i6Var), i6Var);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        if (str == null) {
            str = org.telegram.messenger.gd.M0(R.string.AppName, null);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = str;
        u1Var.U = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(str3, new d1(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.u1 M(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = str;
        u1Var.U = charSequence;
        alertDialog$Builder.k(str2, new d1(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.h1 N(org.telegram.ui.ActionBar.h2 h2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (h2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        h1Var.e = true;
        h1Var.c = org.telegram.messenger.ks.x3;
        h1Var.setOutsideTouchable(true);
        h1Var.setClippingEnabled(true);
        h1Var.setAnimationStyle(R.style.PopupContextAnimation);
        h1Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        h1Var.setInputMethodMode(2);
        h1Var.getContentView().setFocusableInTouchMode(true);
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
        h1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        h1Var.b();
        return h1Var;
    }

    public static void O(Context context, org.telegram.ui.ActionBar.h2 h2Var, String str, String str2, String str3, String str4, int i7, String str5, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.rr rrVar) {
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = str == null ? org.telegram.messenger.gd.M0(R.string.AppName, null) : str;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = str2;
        a5 a5Var = new a5(context);
        a5Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(a5Var, i10, i6Var);
        org.telegram.ui.ActionBar.u6.D(a5Var, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        a5Var.setHint(str3);
        a5Var.setFocusable(true);
        a5Var.setInputType(147457);
        a5Var.setImeOptions(6);
        a5Var.setMaxLines(10);
        a5Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        a5Var.setCursorWidth(1.5f);
        a5Var.A(org.telegram.ui.ActionBar.n6.q6, i6Var);
        if (str4 != null) {
            a5Var.setText(str4);
        }
        a5Var.setOnEditorActionListener(new kg.q(a5Var, i7, rrVar, u1VarArr, currentFocus, 1));
        a5Var.addTextChangedListener(new org.telegram.ui.Cells.j3(i7, a5Var));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i10);
        a5Var.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(a5Var, d02, K, null, i6Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.addView(a5Var, c8.ma.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(g10);
        u1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
        alertDialog$Builder.k(str5, new ai.r1(a5Var, i7, rrVar, 8));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.ui.cr(24));
        u1VarArr[0] = u1Var;
        if (h2Var != null) {
            org.telegram.messenger.g0.Y2(W, h2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.k0 = false;
        u1Var2.setOnDismissListener(new bi.k(a5Var, h2Var, W, 4));
        u1VarArr[0].setOnShowListener(new c1(1, a5Var));
        u1VarArr[0].show();
        a5Var.setSelection(a5Var.getText().length());
    }

    public static void P(Context context, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.rr rrVar) {
        O(context, h2Var, org.telegram.messenger.gd.M0(2131744564, null), org.telegram.messenger.gd.M0(2131744571, null), org.telegram.messenger.gd.M0(2131744545, null), null, 12, org.telegram.messenger.gd.M0(2131751742, null), i6Var, rrVar);
    }

    public static hi.w4 Q(Context context, long j3, final z4 z4Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        int i10;
        int i11;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.j5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        int i12 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        if (context == null) {
            return null;
        }
        final hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
        final sb0 sb0Var = new sb0(context, i6Var);
        sb0Var.setTextColor(x02);
        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var.setItemCount(5);
        final t4 t4Var = new t4(context, i6Var);
        t4Var.setWrapSelectorWheel(true);
        t4Var.setAllItemsCount(24);
        t4Var.setItemCount(5);
        t4Var.setTextColor(x02);
        t4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final u4 u4Var = new u4(context, i6Var);
        u4Var.setWrapSelectorWheel(true);
        u4Var.setAllItemsCount(60);
        u4Var.setItemCount(5);
        u4Var.setTextColor(x02);
        u4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        v3 v3Var = new v3(context, sb0Var, t4Var, u4Var, 7);
        v3Var.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        v3Var.addView(g10, c8.ma.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.M0(i7 == 1 ? 2131744139 : 2131746902, null));
        textView.setTextColor(x02);
        i5.c.x(textView, 1, 20.0f);
        g10.addView(textView, c8.ma.t(-2, -2, 51, 0, 12, 0, 0));
        int i13 = 10;
        textView.setOnTouchListener(new gi.a(i13));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, i6Var);
        i5.c.r(14.0f, 1, 2131746901, textView2, null);
        g10.addView(textView2, c8.ma.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new gi.a(i13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i14 = calendar.get(1);
        hi.w4 w4Var2 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).A7.j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long n22 = w4Var2.n2(timeUnit) * 2;
        final long n23 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).A7.k.n2(timeUnit) - 86400;
        di.xb xbVar = new di.xb(context, 21);
        linearLayout.addView(sb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(365);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setFormatter(new l2.t(i14, 4));
        int i15 = i7 == 1 ? 5 : 3;
        ii.j jVar = new ii.j(xbVar, n22, n23, i15, sb0Var, t4Var, u4Var);
        sb0Var.setOnValueChangedListener(jVar);
        t4Var.setMinValue(0);
        t4Var.setMaxValue(23);
        linearLayout.addView(t4Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ks.t4));
        t4Var.setFormatter(new org.telegram.ui.cr(19));
        t4Var.setOnValueChangedListener(jVar);
        u4Var.setMinValue(0);
        u4Var.setMaxValue(59);
        u4Var.setValue(0);
        u4Var.setFormatter(new org.telegram.ui.cr(20));
        linearLayout.addView(u4Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ks.t4));
        u4Var.setOnValueChangedListener(jVar);
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
                u4Var.setValue(calendar.get(12));
                t4Var.setValue(calendar.get(11));
                sb0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(xbVar, null, n22, n23, i15, sb0Var, t4Var, u4Var);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(x04);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setBackground(org.telegram.ui.ActionBar.b6.e(x05, 8.0f));
        v3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i15;
        xbVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j11 = n22;
                long j12 = n23;
                int i17 = i16;
                sb0 sb0Var2 = sb0Var;
                t4 t4Var2 = t4Var;
                u4 u4Var2 = u4Var;
                boolean g11 = b5.g(null, null, j11, j12, i17, sb0Var2, t4Var2, u4Var2);
                long epochMilli = LocalDate.now().plusDays(sb0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, t4Var2.getValue());
                calendar2.set(12, u4Var2.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                }
                z4Var.O((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.x2) w4Var.b).y0.run();
            }
        });
        c8.ra.b(xbVar, 0.02f, 1.2f);
        di.xb xbVar2 = new di.xb(context, 22);
        xbVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar2.setGravity(17);
        xbVar2.setText(org.telegram.messenger.gd.M0(i7 == 1 ? 2131748279 : 2131746899, null));
        xbVar2.setTextColor(x05);
        xbVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i17 = org.telegram.ui.ActionBar.n6.d6;
        int x06 = org.telegram.ui.ActionBar.n6.x0(null, i17, false);
        int x07 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i17);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        xbVar2.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(xbVar2, k02, M, M2, null);
        v3Var.addView(xbVar2, c8.ma.t(-1, 48, 83, 16, 0, 16, 16));
        xbVar2.setOnClickListener(new ah.h(zArr, z4Var, w4Var, 21));
        c8.ra.b(xbVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.b;
        x2Var.O = v3Var;
        x2Var.show();
        x2Var.setOnDismissListener(new hi.f1(zArr));
        x2Var.v0(i10);
        x2Var.P(i10);
        return w4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.u1 R(org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        if (h2Var == null || h2Var.getParentActivity() == null) {
            return null;
        }
        k80 k80Var = new k80(h2Var.getParentActivity(), h2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.gd.M0(2131753983, null).replace("\n", "<br>")));
        boolean z10 = false;
        Object[] objArr = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new o4(uRLSpan.getURL(), h2Var), spanStart, spanEnd, 0);
        }
        k80Var.setText(spannableString);
        k80Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.k5, i6Var);
        org.telegram.ui.ActionBar.u6.C(k80Var, org.telegram.ui.ActionBar.n6.l5, i6Var);
        k80Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        k80Var.setMovementMethod(new org.telegram.messenger.c0(z10));
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.j5, i6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getParentActivity(), i6Var);
        alertDialog$Builder.o(k80Var);
        String M0 = org.telegram.messenger.gd.M0(2131753984, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131753982, null), new d3(objArr == true ? 1 : 0, h2Var));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.i6 i6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131748395, null);
        sb0 sb0Var = new sb0(context, null);
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(20);
        int i7 = encryptedChat.ttl;
        if (i7 > 0 && i7 < 16) {
            sb0Var.setValue(i7);
        } else if (i7 == 30) {
            sb0Var.setValue(16);
        } else if (i7 == 60) {
            sb0Var.setValue(17);
        } else if (i7 == 3600) {
            sb0Var.setValue(18);
        } else if (i7 == 86400) {
            sb0Var.setValue(19);
        } else if (i7 == 604800) {
            sb0Var.setValue(20);
        } else if (i7 == 0) {
            sb0Var.setValue(0);
        }
        sb0Var.setFormatter(new k2(4));
        alertDialog$Builder.o(sb0Var);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751343, null), new g2(3, encryptedChat, sb0Var));
        return alertDialog$Builder;
    }

    public static void T(org.telegram.ui.ActionBar.h2 h2Var, int i7, org.telegram.ui.ActionBar.m6 m6Var, org.telegram.ui.ActionBar.k6 k6Var) {
        int i10;
        int i11;
        String sb2;
        if (h2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = h2Var.getParentActivity();
        a5 a5Var = new a5(parentActivity);
        String str = null;
        a5Var.setBackground(null);
        org.telegram.ui.ActionBar.u6.F(a5Var, org.telegram.ui.ActionBar.n6.u5, org.telegram.ui.ActionBar.n6.v5, org.telegram.ui.ActionBar.n6.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131748066, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751742, null), new k2(5));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i7 != 0) {
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751103, null)));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(2131751104, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i12 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(textView, i12, null);
        linearLayout.addView(textView, c8.ma.o(-1, -2));
        a5Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(a5Var, i12, null);
        a5Var.setMaxLines(1);
        a5Var.setLines(1);
        a5Var.setInputType(16385);
        a5Var.setGravity(51);
        a5Var.setSingleLine(true);
        a5Var.setImeOptions(6);
        a5Var.A(org.telegram.ui.ActionBar.n6.G6, null);
        a5Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        a5Var.setCursorWidth(1.5f);
        a5Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(a5Var, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
        a5Var.setOnEditorActionListener(new s2(0));
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
        i5.c.u(org.telegram.messenger.ks.e4, hashMap, "Blue", 18347, "Cobalt");
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
        org.telegram.ui.ActionBar.k6 k10 = k6Var == null ? org.telegram.ui.ActionBar.n6.D0().k(false) : k6Var;
        if (k10 == null || (i10 = k10.c) == 0) {
            i10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.n6.s0())[0];
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
        a5Var.setText(sb2);
        a5Var.setSelection(a5Var.length());
        c1 c1Var = new c1(i11, a5Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.setOnShowListener(c1Var);
        h2Var.showDialog(u1Var);
        a5Var.requestFocus();
        u1Var.d(-1).setOnClickListener(new fi.d0(h2Var, a5Var, k6Var, m6Var, u1Var, 9));
    }

    public static void U(Activity activity, String str, int i7, int i10, int i11, org.telegram.messenger.x10 x10Var) {
        if (activity == null) {
            return;
        }
        final int i12 = 0;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.j5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i6, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        final int i13 = 1;
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(activity, false, 1, null);
        j3.w0 = false;
        u3 u3Var = new u3(activity, null);
        v3 v3Var = new v3(activity, u3Var);
        v3Var.setOrientation(0);
        v3Var.setWeightSum(1.0f);
        u3Var.setAllItemsCount(24);
        u3Var.setItemCount(5);
        u3Var.setTextColor(x02);
        u3Var.setGravity(5);
        u3Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        w3 w3Var = new w3(activity, null);
        w3Var.setWrapSelectorWheel(true);
        w3Var.setAllItemsCount(60);
        w3Var.setItemCount(5);
        w3Var.setTextColor(x02);
        w3Var.setGravity(3);
        w3Var.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final di.y3 y3Var = new di.y3(i10, i11, u3Var, w3Var, i7, v3Var);
        v3Var.addView(u3Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
        u3Var.setFormatter(new k2(2));
        u3Var.setOnValueChangedListener(new qb0() { // from class: org.telegram.ui.Components.p2
            @Override // org.telegram.ui.Components.qb0
            public final void n(sb0 sb0Var, int i14) {
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
        v3Var.addView(w3Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
        w3Var.setFormatter(new k2(3));
        w3Var.setOnValueChangedListener(new qb0() { // from class: org.telegram.ui.Components.p2
            @Override // org.telegram.ui.Components.qb0
            public final void n(sb0 sb0Var, int i14) {
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
        x3 x3Var = new x3(activity, u3Var, w3Var);
        x3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        x3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        x3Var.addView(v3Var, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.d dVar = new hi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.gd.M0(2131745477, null), false, true);
        dVar.setOnClickListener(new q2(r1, i12));
        x3Var.addView(dVar, c8.ma.t(-1, 48, 0, 16, 12, 16, 12));
        j3.O = x3Var;
        j3.show();
        j3.setOnDismissListener(new bi.k(x10Var, u3Var, w3Var, 5));
        j3.v0(x03);
        j3.P(x03);
        org.telegram.ui.ActionBar.x2[] x2VarArr = {j3};
    }

    public static org.telegram.ui.ActionBar.u1 V(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g7;
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
            strArr = new String[]{org.telegram.messenger.gd.M0(2131743376, null), org.telegram.messenger.gd.M0(2131745171, null), org.telegram.messenger.gd.M0(2131748531, null), org.telegram.messenger.gd.M0(2131743375, null)};
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
            strArr = new String[]{org.telegram.messenger.gd.M0(2131743375, null), org.telegram.messenger.gd.M0(2131743376, null), org.telegram.messenger.gd.M0(2131745171, null), org.telegram.messenger.gd.M0(2131748531, null), org.telegram.messenger.gd.M0(2131747628, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i11));
            a(j6Var, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            j6Var.b(strArr2[i11], iArr[0] == i11 ? z10 : false);
            f10.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g7.edit();
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).l(j11, j10);
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
                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).m(2);
                        } else if (str3.equals("vibrate_group")) {
                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).m(0);
                        } else if (str3.equals("vibrate_react")) {
                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).m(4);
                        } else {
                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).m(1);
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
        String M0 = org.telegram.messenger.gd.M0(2131743377, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.u1 W(Context context, org.telegram.ui.ActionBar.i6 i6Var, String[] strArr, int i7, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.n6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(str);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.U = W2;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(z10 ? 2131747107 : 2131752898, null), new a3.g(z10, context, atomicBoolean, aVar, 6));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752893, null), new g2(i10, atomicBoolean, aVar));
        u1Var.setOnDismissListener(new di.u1(7, atomicBoolean, aVar));
        return u1Var;
    }

    public static void X(int i7, int i10, long j3, org.telegram.messenger.x10 x10Var) {
        Y(i7, j3, i10, x10Var, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Y(final int i7, final long j3, int i10, org.telegram.messenger.x10 x10Var, long j10) {
        org.telegram.ui.ActionBar.i6 bVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        TLRPC.Chat chat;
        char c10;
        Activity activity;
        long P1 = org.telegram.messenger.mp.u1(i7).P1(j3);
        if (P1 <= 0 && j3 > 0) {
            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(i7).P2(j3));
        }
        long j11 = i10 * P1;
        di.x8.y(i7, false).P.put(Long.valueOf(j3), Integer.valueOf(i10));
        if (j11 <= 0 || j10 == j11) {
            x10Var.a(Long.valueOf(j11));
            return false;
        }
        final long j12 = P1;
        final m1 m1Var = new m1(i7, j11, j3, x10Var, j12, 1);
        if (j12 <= org.telegram.messenger.mp.u1(i7).h7.getLong(p5.c.j(j3, "ask_paid_message_", "_price"), 0L)) {
            m1Var.run();
            return true;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) {
            bVar = new fi.b();
        } else {
            if (T == null) {
                i6Var = null;
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
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.K("MessageLockedStarsConfirmMessage1", i11, ',', objArr)));
                        spannableStringBuilder.append((CharSequence) " ");
                        if (i10 == 1) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessage2One", i11)));
                        } else {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessage2Many1", (int) j11)));
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessage2Many2", i10)));
                        }
                        f0(activity, org.telegram.messenger.gd.M0(2131748362, null), spannableStringBuilder, org.telegram.messenger.gd.M0(2131748375, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.s1
                            @Override // org.telegram.messenger.x10
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i12 = i7;
                                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i12).h7.edit();
                                    long j13 = j3;
                                    edit.putLong(p5.c.j(j13, "ask_paid_message_", "_price"), j12).apply();
                                    di.x8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                                }
                                org.telegram.messenger.g0.g3(m1Var);
                            }
                        }, i6Var, true);
                        return true;
                    }
                }
                c10 = 0;
                activity = u02;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i112 = (int) j12;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = s5;
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.K("MessageLockedStarsConfirmMessage1", i112, ',', objArr2)));
                spannableStringBuilder2.append((CharSequence) " ");
                if (i10 == 1) {
                }
                f0(activity, org.telegram.messenger.gd.M0(2131748362, null), spannableStringBuilder2, org.telegram.messenger.gd.M0(2131748375, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.s1
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i12 = i7;
                            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i12).h7.edit();
                            long j13 = j3;
                            edit.putLong(p5.c.j(j13, "ask_paid_message_", "_price"), j12).apply();
                            di.x8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                        }
                        org.telegram.messenger.g0.g3(m1Var);
                    }
                }, i6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        i6Var = bVar;
        String s52 = org.telegram.messenger.n5.s(i7, j3);
        if (!org.telegram.messenger.v3.o0(i7, j3)) {
        }
        c10 = 0;
        activity = u02;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
        int i1122 = (int) j12;
        Object[] objArr22 = new Object[1];
        objArr22[c10] = s52;
        spannableStringBuilder22.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.K("MessageLockedStarsConfirmMessage1", i1122, ',', objArr22)));
        spannableStringBuilder22.append((CharSequence) " ");
        if (i10 == 1) {
        }
        f0(activity, org.telegram.messenger.gd.M0(2131748362, null), spannableStringBuilder22, org.telegram.messenger.gd.M0(2131748375, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.s1
            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i12 = i7;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i12).h7.edit();
                    long j13 = j3;
                    edit.putLong(p5.c.j(j13, "ask_paid_message_", "_price"), j12).apply();
                    di.x8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                }
                org.telegram.messenger.g0.g3(m1Var);
            }
        }, i6Var, true);
        return true;
    }

    public static boolean Z(int i7, ArrayList arrayList, int i10, org.telegram.messenger.x10 x10Var) {
        org.telegram.ui.ActionBar.i6 bVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            x10Var.a(new HashMap());
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
            long P1 = org.telegram.messenger.mp.u1(i7).P1(longValue);
            if (P1 <= 0 && longValue > 0) {
                P1 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(i7).P2(longValue));
            }
            hashMap.put(l10, Long.valueOf(P1));
            long j11 = j10 + P1;
            boolean z12 = z10;
            di.x8.y(i7, z10).P.put(l10, Integer.valueOf(i10));
            if (P1 > 0) {
                i11++;
            }
            if (P1 > 0 && z11 && org.telegram.messenger.mp.u1(i7).h7.getLong(p5.c.j(longValue, "ask_paid_message_", "_price"), 0L) < P1) {
                z11 = z12;
            }
            j3 = j11;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i10) * j3;
        if (z11 || max <= 0) {
            x10Var.a(hashMap);
            return z13;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) {
            bVar = new fi.b();
        } else {
            if (T == null) {
                i6Var = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                spannableStringBuilder.append((CharSequence) " ");
                Object[] objArr = new Object[1];
                objArr[z13 ? 1 : 0] = org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                f0(u02, org.telegram.messenger.gd.M0(2131748362, null), spannableStringBuilder, org.telegram.messenger.gd.M0(2131748375, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.wp(i7, max, u02, arrayList, hashMap, x10Var, i6Var), i6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        i6Var = bVar;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
        spannableStringBuilder2.append((CharSequence) " ");
        Object[] objArr2 = new Object[1];
        objArr2[z13 ? 1 : 0] = org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
        f0(u02, org.telegram.messenger.gd.M0(2131748362, null), spannableStringBuilder2, org.telegram.messenger.gd.M0(2131748375, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.wp(i7, max, u02, arrayList, hashMap, x10Var, i6Var), i6Var, true);
        return true;
    }

    public static void a(org.telegram.ui.Cells.j6 j6Var, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
            View childAt = j6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.u6.O((RadioButton) childAt, i7, i10, i6Var);
                return;
            }
        }
        j6Var.a(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
    }

    public static boolean a0(int i7, long j3) {
        long P1 = org.telegram.messenger.mp.u1(i7).P1(j3);
        if (P1 <= 0 && j3 > 0) {
            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(i7).P2(j3));
        }
        return P1 > 0 && P1 > org.telegram.messenger.mp.u1(i7).h7.getLong(p5.c.j(j3, "ask_paid_message_", "_price"), 0L);
    }

    public static void b(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
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
        sb0Var3.setMaxValue(i13);
        sb0Var3.setMinValue(i10);
        int value = sb0Var3.getValue();
        sb0Var2.setMaxValue(value == i13 ? i14 : 11);
        sb0Var2.setMinValue(value == i10 ? i11 : 0);
        int value2 = sb0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i13 && value2 == i14) {
            actualMaximum = Math.min(i15, actualMaximum);
        }
        sb0Var.setMaxValue(actualMaximum);
        if (value == i10 && value2 == i11) {
            i7 = i12;
        }
        sb0Var.setMinValue(i7);
    }

    public static void b0(a5 a5Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.h2 h2Var) {
        if (h2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.g0.v1(a5Var);
        String obj = a5Var.getText().toString();
        int i7 = org.telegram.ui.ActionBar.n6.a;
        org.telegram.ui.ActionBar.m6 m6Var = new org.telegram.ui.ActionBar.m6();
        m6Var.b = new File(org.telegram.messenger.t0.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
        m6Var.a = obj;
        org.telegram.ui.ActionBar.n6.h0 = org.telegram.ui.ActionBar.n6.b1(org.telegram.ui.ActionBar.n6.I.j0);
        m6Var.F = org.telegram.messenger.j10.t0;
        org.telegram.ui.ActionBar.n6.x1(m6Var, true, true, false);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.q4, new Object[0]);
        new ThemeEditorView().d(h2Var.getParentActivity(), m6Var);
        u1Var.dismiss();
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        if (g12.getBoolean("themehint", false)) {
            return;
        }
        g12.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(h2Var.getParentActivity(), org.telegram.messenger.gd.M0(2131751699, null), 1).show();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static long c(hi.d dVar, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, sb0 sb0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i7 = 1;
        int i10 = calendar.get(1);
        int value = ((sb0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (sb0Var2.getValue() - 120) % 12);
        sb0Var.setMinValue(1);
        sb0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = sb0Var.getValue();
        int value3 = sb0Var3.getValue();
        int value4 = sb0Var4.getValue();
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
            dVar.setText(org.telegram.messenger.gd.E0().x0(i7 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.u1 c0(final int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLObject tLObject, Object... objArr) {
        String str;
        char c10;
        String str2;
        final long j3;
        long n10;
        org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o4 = di.x8.o(tLObject);
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
                        di.x8.y(i7, false).q(new Runnable() { // from class: org.telegram.ui.Components.j2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity u02 = org.telegram.messenger.g0.u0();
                                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.i6 bVar = (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) ? new fi.b() : T != null ? T.getResourceProvider() : null;
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
                    r0(h2Var2, org.telegram.messenger.gd.M0(2131749174, null), org.telegram.messenger.gd.M0(2131749175, null), null);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z10 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long n11 = org.telegram.messenger.n5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (n11 >= 0) {
                        str2 = org.telegram.messenger.o10.k(org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(n11)), true);
                    } else {
                        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-n11));
                        str2 = O0 != null ? O0.title : "";
                    }
                    if (h2Var2 == null) {
                        h2Var2 = LaunchActivity.Q();
                    }
                    r0(h2Var2, org.telegram.messenger.gd.M0(2131748347, null), org.telegram.messenger.gd.a0(null, null, 2131748348, str2), null);
                    org.telegram.messenger.mp.u1(i7).p2(0, n11);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.h2 Q = h2Var2 == null ? LaunchActivity.Q() : h2Var2;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749060, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749052, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749066, null), null);
                            return null;
                        }
                        r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749067, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749063, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749065, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749062, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749064, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        r0(Q, org.telegram.messenger.gd.M0(2131749061, null), org.telegram.messenger.gd.M0(2131749059, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        j0(tL_error.text, Q);
                        return null;
                    }
                    String M0 = org.telegram.messenger.gd.M0(2131749061, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
                    sb2.append(tL_error.text);
                    r0(Q, M0, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.h2 Q2 = h2Var2 == null ? LaunchActivity.Q() : h2Var2;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            r0(Q2, null, org.telegram.messenger.gd.M0(2131748987, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            r0(Q2, null, org.telegram.messenger.gd.M0(2131750671, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            u0(Q2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, null), true);
                            return null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.ui.Cells.c0.u(null, 2131751094, sb3, "\n");
                        sb3.append(tL_error.text);
                        r0(Q2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i10 = org.telegram.messenger.ks.M0;
                    if (z12 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (h2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (h2Var2.getParentActivity() != null) {
                                h2Var2.showDialog(new ug.l0(5, i7, h2Var2.getParentActivity(), h2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                h2Var2.presentFragment(new p81(0));
                                return null;
                            }
                            h2Var2.presentFragment(new p81(1));
                            return null;
                        }
                        if (h2Var2 != null) {
                            e0(tL_error, h2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            org.telegram.messenger.ks.f(i7).k(i10, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.h2 Q3 = h2Var2 == null ? LaunchActivity.Q() : h2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new ug.l0(5, i7, Q3.getParentActivity(), Q3, null));
                                    return null;
                                }
                                Q3.presentFragment(new p81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.h2 h2Var3 = Q3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, h2Var3);
                                return null;
                            }
                            e0(tL_error, h2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.h2 Q4 = h2Var2 == null ? LaunchActivity.Q() : h2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q4.getParentActivity() != null) {
                                    Q4.showDialog(new ug.l0(5, i7, Q4.getParentActivity(), Q4, null));
                                    return null;
                                }
                                Q4.presentFragment(new p81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.h2 h2Var4 = Q4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, h2Var4);
                                return null;
                            }
                            e0(tL_error, h2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (h2Var2 != null) {
                                    r0(h2Var2, null, org.telegram.messenger.gd.M0(2131751260, null), null);
                                    return null;
                                }
                                t0(org.telegram.messenger.gd.M0(2131751260, null), null);
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
                                            org.telegram.messenger.ks.f(i7).k(i10, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            org.telegram.messenger.ks.f(i7).k(i10, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            t0(org.telegram.messenger.gd.M0(2131748337, null), h2Var2);
                                            break;
                                    }
                                    return null;
                                }
                                String str5 = tL_error.text;
                                TLRPC.Chat O02 = n12 < 0 ? org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-n12)) : null;
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
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.h2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.u1");
                            }

                            public static void d(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i7 = 1;
                                int i10 = calendar.get(1);
                                int i11 = calendar.get(2);
                                int i12 = calendar.get(5);
                                sb0Var3.setMinValue(i10);
                                int value = sb0Var3.getValue();
                                sb0Var2.setMinValue(value == i10 ? i11 : 0);
                                int value2 = sb0Var2.getValue();
                                if (value == i10 && value2 == i11) {
                                    i7 = i12;
                                }
                                sb0Var.setMinValue(i7);
                            }

                            public static void d0(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.x10 x10Var, sm smVar) {
                                Activity W = org.telegram.messenger.g0.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                                String M0 = org.telegram.messenger.gd.M0(2131746960, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                u1Var.U = org.telegram.messenger.gd.M0(2131746961, null);
                                final h4 h4Var = new h4(context);
                                h4Var.setTextSize(1, 16.0f);
                                int i10 = org.telegram.ui.ActionBar.n6.j5;
                                org.telegram.ui.ActionBar.u6.U(h4Var, i10, i6Var);
                                org.telegram.ui.ActionBar.u6.D(h4Var, org.telegram.ui.ActionBar.n6.Oi, i6Var);
                                h4Var.setHint(org.telegram.messenger.gd.M0(2131746959, null));
                                h4Var.setInputType(17);
                                h4Var.setImeOptions(6);
                                h4Var.setMaxLines(10);
                                h4Var.setSingleLine(false);
                                h4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                                h4Var.setCursorWidth(1.5f);
                                h4Var.A(org.telegram.ui.ActionBar.n6.q6, i6Var);
                                if (str != null) {
                                    h4Var.setText(str);
                                    h4Var.setSelection(str.length());
                                }
                                h4Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.n2
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                                        if (i11 != 6) {
                                            return false;
                                        }
                                        h4 h4Var2 = h4.this;
                                        String trim = h4Var2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : b5.a.matcher(trim.trim()).matches())) {
                                            org.telegram.messenger.g0.D3(h4Var2);
                                            return true;
                                        }
                                        x10Var.a(trim);
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
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
                                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i10);
                                h4Var.setBackground(d02);
                                org.telegram.ui.ActionBar.u6.j(h4Var, d02, K, null, i6Var);
                                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                g10.addView(h4Var, c8.ma.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i11 = m71.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    m71 m71Var = new m71(context, i6Var);
                                    m71Var.setWebPage(webPage);
                                    g10.addView(m71Var, c8.ma.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.c();
                                alertDialog$Builder.o(g10);
                                u1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                int i12 = 2;
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751343, null), new g2(i12, h4Var, x10Var));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new k2(1));
                                if (smVar != null) {
                                    alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131751587, null), new d1(4, smVar));
                                }
                                u1VarArr[0] = u1Var;
                                u1Var.k0 = false;
                                u1Var.setOnDismissListener(new y0(h4Var, i12));
                                u1VarArr[0].setOnShowListener(new o2(h4Var, i7));
                                u1VarArr[0].show();
                                TextView textView = (TextView) u1VarArr[0].d(-3);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                }
                            }

                            public static void e(TextView textView, sb0 sb0Var, f4 f4Var, g4 g4Var) {
                                int value = sb0Var.getValue();
                                int value2 = f4Var.getValue();
                                int value3 = g4Var.getValue();
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
                                textView.setText(org.telegram.messenger.gd.a0(null, null, 2131746981, org.telegram.messenger.gd.a0(null, null, 2131746980, i7 > 0 ? org.telegram.messenger.gd.G(i7, "Days", new Object[0]) : "", i10 > 0 ? org.telegram.messenger.gd.G(i10, "Hours", new Object[0]) : "", i11 > 0 ? org.telegram.messenger.gd.G(i11, "Minutes", new Object[0]) : "").trim()));
                            }

                            public static void e0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                org.telegram.ui.ActionBar.u1 u1Var;
                                int i7;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || h2Var == null || h2Var.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
                                String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
                                u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                String str = tL_error.text;
                                str.getClass();
                                i7 = 1;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        u1Var.U = org.telegram.messenger.gd.M0(2131748566, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        u1Var.U = org.telegram.messenger.gd.M0(2131746397, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        u1Var.U = org.telegram.messenger.gd.M0(2131751737, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z10) {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131749197, null);
                                            break;
                                        } else {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131752260, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        u1Var.U = org.telegram.messenger.gd.M0(2131743491, null);
                                        break;
                                    case "PEER_FLOOD":
                                        u1Var.U = org.telegram.messenger.gd.M0(2131747934, null);
                                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131748139, null), new d3(i7, h2Var));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z10) {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131749195, null);
                                            break;
                                        } else {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131752258, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131754475, null);
                                            break;
                                        } else {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131754362, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        u1Var.U = org.telegram.messenger.gd.M0(2131742584, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        u1Var.U = org.telegram.messenger.gd.M0(2131754463, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z10) {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131749198, null);
                                            break;
                                        } else {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131752261, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z10) {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131749196, null);
                                            break;
                                        } else {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131752259, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        u1Var.S = org.telegram.messenger.gd.M0(2131752271, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131752272, null);
                                            break;
                                        } else {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131752273, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        u1Var.S = org.telegram.messenger.gd.M0(2131752271, null);
                                        u1Var.U = org.telegram.messenger.gd.M0(2131743520, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z10) {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131749194, null);
                                            break;
                                        } else {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131752257, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        u1Var.U = org.telegram.messenger.gd.M0(2131754474, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z11) {
                                            if (!z10) {
                                                u1Var.U = org.telegram.messenger.gd.M0(2131748917, null);
                                                break;
                                            } else {
                                                u1Var.U = org.telegram.messenger.gd.M0(2131748920, null);
                                                break;
                                            }
                                        } else {
                                            u1Var.U = org.telegram.messenger.gd.M0(2131748919, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        u1Var.S = org.telegram.messenger.gd.M0(2131743069, null);
                                        u1Var.U = org.telegram.messenger.gd.M0(2131743139, null);
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
                                        sb2.append(tL_error.text);
                                        u1Var.U = sb2.toString();
                                        break;
                                }
                                org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
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
                                        user = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(tL_missingInvitee2.user_id));
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
                                org.telegram.messenger.g0.h3(new ai.g1(i7, chat, arrayList, arrayList2, arrayList3, 15), 200L);
                            }

                            public static org.telegram.ui.ActionBar.u1 f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
                                if (activity == null) {
                                    x10Var.a(Boolean.FALSE);
                                    return null;
                                }
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
                                int i10 = 1;
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                boolean[] zArr = {false};
                                di.xb xbVar = new di.xb(activity, 23);
                                org.telegram.messenger.ks.i(xbVar);
                                org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.j5, i6Var);
                                xbVar.setTextSize(1, 16.0f);
                                int i11 = 3;
                                xbVar.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
                                xbVar.setText(charSequence);
                                o3 o3Var = new o3(activity, c2VarArr, i10);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.H = 6;
                                alertDialog$Builder.o(o3Var);
                                TextView textView = new TextView(activity);
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.E8, i6Var, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                o3Var.addView(textView, c8.ma.d(-1, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                o3Var.addView(xbVar, c8.ma.d(-2, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, i6Var);
                                    c2VarArr[0] = c2Var;
                                    int i12 = org.telegram.ui.ActionBar.n6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 7, org.telegram.messenger.g0.L(12.0f));
                                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
                                    c2Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.u6.j(c2Var, h02, null, M, i6Var);
                                    c2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (org.telegram.messenger.gd.a0 ? 5 : 3) | 16;
                                    c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    c2VarArr[0].e(charSequence2, "", false, false, false);
                                    c2VarArr[0].setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                                    o3Var.addView(c2VarArr[0], c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new f1(i11, zArr));
                                }
                                alertDialog$Builder.k(str2, new a3(i7, x10Var, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                if (z10) {
                                    u1Var.Y0 = true;
                                }
                                u1Var.show();
                                return u1Var;
                            }

                            public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i7, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
                                long j11;
                                int i10;
                                long j12;
                                int i11;
                                int i12;
                                int i13;
                                boolean z10;
                                boolean z11;
                                String G;
                                int value = sb0Var.getValue();
                                int value2 = sb0Var2.getValue();
                                int value3 = sb0Var3.getValue();
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
                                sb0Var.setMinValue(0);
                                if (j14 > 0) {
                                    sb0Var.setMaxValue(i11);
                                }
                                int value4 = sb0Var.getValue();
                                sb0Var2.setMinValue(value4 == 0 ? i16 : 0);
                                if (j14 > 0) {
                                    sb0Var2.setMaxValue(value4 == i11 ? i12 : 23);
                                }
                                int value5 = sb0Var2.getValue();
                                sb0Var3.setMinValue((value4 == 0 && value5 == i16) ? i17 : 0);
                                if (j14 > 0) {
                                    sb0Var3.setMaxValue((value4 == i11 && value5 == i12) ? i15 : 59);
                                }
                                int value6 = sb0Var3.getValue();
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
                                    textView.setText(org.telegram.messenger.gd.E0().x0((i7 * 3) + (value4 == 0 ? 0 : i10 == i18 ? 1 : 2)).format(timeInMillis2));
                                }
                                if (textView2 != null) {
                                    int i19 = (int) ((timeInMillis2 - j11) / 1000);
                                    if (i19 > 86400) {
                                        z11 = false;
                                        G = org.telegram.messenger.gd.G(Math.round(i19 / 86400.0f), "DaysSchedule", new Object[0]);
                                    } else {
                                        z11 = false;
                                        z11 = false;
                                        z11 = false;
                                        G = i19 >= 3600 ? org.telegram.messenger.gd.G(Math.round(i19 / 3600.0f), "HoursSchedule", new Object[0]) : i19 >= 60 ? org.telegram.messenger.gd.G(Math.round(i19 / 60.0f), "MinutesSchedule", new Object[0]) : org.telegram.messenger.gd.G(i19, "SecondsSchedule", new Object[0]);
                                    }
                                    if (textView2.getTag() != null) {
                                        z10 = true;
                                        Object[] objArr = new Object[1];
                                        objArr[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.gd.a0("VoipChannelScheduleInfo", null, 2131743226, objArr));
                                    } else {
                                        z10 = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.gd.a0("VoipGroupScheduleInfo", null, 2131743105, objArr2));
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
                            /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String, org.telegram.ui.ActionBar.i6, org.telegram.ui.ActionBar.r1] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.h2] */
                            /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [org.telegram.ui.Cells.c2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void g0(org.telegram.ui.ActionBar.h2 h2Var, long j3, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final org.telegram.messenger.nr nrVar, org.telegram.ui.ActionBar.i6 i6Var) {
                                long j10;
                                boolean z11;
                                String str;
                                String M0;
                                ?? r92;
                                ?? r14;
                                TextView textView;
                                String str2;
                                if (h2Var.getParentActivity() == null) {
                                    return;
                                }
                                final org.telegram.messenger.c accountInstance = h2Var.getAccountInstance();
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getParentActivity(), i6Var);
                                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).g7;
                                int i7 = 1;
                                if (encryptedChat == null) {
                                    j10 = j3;
                                    if (!org.telegram.messenger.f3.w("dialog_bar_report", j10, sharedPreferences, false)) {
                                        z11 = false;
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        if (user == null) {
                                            u1Var.S = org.telegram.messenger.gd.a0("BlockUserTitle", null, 2131753683, org.telegram.messenger.o10.k(user, true));
                                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("BlockUserAlert", null, 2131753689, org.telegram.messenger.o10.k(user, true)));
                                            String M02 = org.telegram.messenger.gd.M0(2131753691, null);
                                            int i10 = 2;
                                            r92 = new org.telegram.ui.Cells.c2[2];
                                            int i11 = 0;
                                            ?? linearLayout = new LinearLayout(h2Var.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i12 = 0;
                                            while (i12 < i10) {
                                                if (i12 != 0 || z11) {
                                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i7, h2Var.getParentActivity(), i6Var);
                                                    r92[i12] = c2Var;
                                                    c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(i11));
                                                    r92[i12].setTag(Integer.valueOf(i12));
                                                    if (i12 == 0) {
                                                        r92[i12].e(org.telegram.messenger.gd.M0(2131751491, null), "", true, false, false);
                                                        str2 = M02;
                                                    } else {
                                                        str2 = M02;
                                                        r92[i12].e(org.telegram.messenger.gd.a0("DeleteThisChat", null, 2131751471, new Object[i11]), "", true, false, false);
                                                    }
                                                    r92[i12].setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    linearLayout.addView(r92[i12], c8.ma.o(-1, -2));
                                                    r92[i12].setOnClickListener(new z0(r92, 1));
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
                                            if (chat == null || !z10) {
                                                str = null;
                                                str = null;
                                                u1Var.S = org.telegram.messenger.gd.M0(2131746005, null);
                                                if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                                                    u1Var.U = org.telegram.messenger.gd.M0(2131746009, null);
                                                } else {
                                                    u1Var.U = org.telegram.messenger.gd.M0(2131746010, null);
                                                }
                                            } else {
                                                u1Var.S = org.telegram.messenger.gd.M0(2131745994, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ReportUnrelatedGroupText", null, 2131745993, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                u1Var.U = org.telegram.messenger.gd.M0(2131745992, null);
                                            }
                                            M0 = org.telegram.messenger.gd.M0(2131746035, str);
                                            r92 = str;
                                            r14 = str;
                                        }
                                        final org.telegram.ui.Cells.c2[] c2VarArr = r92;
                                        final long j11 = j10;
                                        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.r1
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                                                org.telegram.ui.Cells.c2 c2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                org.telegram.messenger.c cVar = accountInstance;
                                                if (user2 != null) {
                                                    org.telegram.messenger.mp.u1(cVar.a).w(user2.id);
                                                }
                                                org.telegram.ui.Cells.c2[] c2VarArr2 = c2VarArr;
                                                long j12 = j11;
                                                TLRPC.Chat chat2 = chat;
                                                if (c2VarArr2 == null || ((c2Var2 = c2VarArr2[0]) != null && c2Var2.b())) {
                                                    org.telegram.messenger.mp.u1(cVar.a).w4(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                                                }
                                                org.telegram.messenger.nr nrVar2 = nrVar;
                                                if (c2VarArr2 != null && !c2VarArr2[1].b()) {
                                                    nrVar2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    org.telegram.messenger.mp.u1(cVar.a).X(0, j12, false);
                                                } else if (org.telegram.messenger.v3.r0(chat2)) {
                                                    org.telegram.messenger.mp.u1(cVar.a).X(0, j12, false);
                                                } else {
                                                    int i14 = cVar.a;
                                                    org.telegram.messenger.mp.u1(i14).f0(-j12, org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(org.telegram.messenger.j10.i(i14).e())));
                                                }
                                                nrVar2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, r14), r14);
                                        h2Var.showDialog(u1Var);
                                        textView = (TextView) u1Var.d(-1);
                                        if (textView == null) {
                                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, r14);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    j10 = j3;
                                }
                                z11 = true;
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                                if (user == null) {
                                }
                                final org.telegram.ui.Cells.c2[] c2VarArr2 = r92;
                                final long j112 = j10;
                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.r1
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i13) {
                                        org.telegram.ui.Cells.c2 c2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        org.telegram.messenger.c cVar = accountInstance;
                                        if (user2 != null) {
                                            org.telegram.messenger.mp.u1(cVar.a).w(user2.id);
                                        }
                                        org.telegram.ui.Cells.c2[] c2VarArr22 = c2VarArr2;
                                        long j12 = j112;
                                        TLRPC.Chat chat2 = chat;
                                        if (c2VarArr22 == null || ((c2Var2 = c2VarArr22[0]) != null && c2Var2.b())) {
                                            org.telegram.messenger.mp.u1(cVar.a).w4(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                                        }
                                        org.telegram.messenger.nr nrVar2 = nrVar;
                                        if (c2VarArr22 != null && !c2VarArr22[1].b()) {
                                            nrVar2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            org.telegram.messenger.mp.u1(cVar.a).X(0, j12, false);
                                        } else if (org.telegram.messenger.v3.r0(chat2)) {
                                            org.telegram.messenger.mp.u1(cVar.a).X(0, j12, false);
                                        } else {
                                            int i14 = cVar.a;
                                            org.telegram.messenger.mp.u1(i14).f0(-j12, org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(org.telegram.messenger.j10.i(i14).e())));
                                        }
                                        nrVar2.a(1);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, r14), r14);
                                h2Var.showDialog(u1Var2);
                                textView = (TextView) u1Var2.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static boolean h(Context context, int i7, long j3, boolean z10) {
                                TLRPC.Chat O0;
                                if (!org.telegram.messenger.n5.z(j3) || (O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3))) == null || !O0.slowmode_enabled || org.telegram.messenger.v3.N(O0)) {
                                    return false;
                                }
                                if (!z10) {
                                    TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i7).P0(O0.id);
                                    if (P0 == null) {
                                        P0 = org.telegram.messenger.tr.a0(i7).F0(O0.id, org.telegram.messenger.v3.T(O0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (P0 != null && P0.slowmode_next_send_date >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    return false;
                                }
                                K(context, O0.title, org.telegram.messenger.gd.M0(2131745107, null)).p();
                                return true;
                            }

                            public static void h0(org.telegram.ui.bn bnVar, org.telegram.messenger.fj fjVar, long j3, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.vf vfVar) {
                                if (bnVar.getParentActivity() == null || fjVar == null) {
                                    return;
                                }
                                org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                                TLRPC.User c22 = j3 > 0 ? org.telegram.messenger.mp.u1(accountInstance.a).c2(Long.valueOf(j3)) : null;
                                TLRPC.Chat O0 = j3 < 0 ? org.telegram.messenger.mp.u1(accountInstance.a).O0(Long.valueOf(-j3)) : null;
                                if (c22 == null && O0 == null) {
                                    return;
                                }
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), i6Var);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.Q0 = false;
                                u1Var.O = new y0(vfVar, i7);
                                u1Var.S = org.telegram.messenger.gd.M0(2131753690, null);
                                if (c22 != null) {
                                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("BlockUserReplyAlert", null, 2131753684, org.telegram.messenger.o10.k(c22, true)));
                                } else {
                                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("BlockUserReplyAlert", null, 2131753684, O0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(bnVar.getParentActivity());
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, bnVar.getParentActivity(), i6Var)};
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                                c2VarArr[0].setTag(0);
                                c2VarArr[0].e(org.telegram.messenger.gd.M0(2131751491, null), "", true, false, false);
                                c2VarArr[0].setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                linearLayout.addView(c2VarArr[0], c8.ma.o(-1, -2));
                                c2VarArr[0].setOnClickListener(new z0(c2VarArr, i7));
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131753693, null), new b1(c22, accountInstance, bnVar, O0, fjVar, c2VarArr, i6Var));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                bnVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                }
                            }

                            public static org.telegram.ui.ActionBar.u1 i(Activity activity, x4 x4Var) {
                                if (org.telegram.messenger.j10.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                di.u3 u3Var = u1Var.M0;
                                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                                LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
                                for (int i7 = 0; i7 < 4; i7++) {
                                    if (org.telegram.messenger.j10.i(i7).f() != null) {
                                        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                                        kVar.f = i7;
                                        TLRPC.User f11 = org.telegram.messenger.j10.i(i7).f();
                                        b9 b9Var = kVar.e;
                                        b9Var.r(f11);
                                        kVar.a.l(org.telegram.messenger.i5.m(0, f11.first_name, f11.last_name), false);
                                        q9 q9Var = kVar.c;
                                        q9Var.getImageReceiver().d = i7;
                                        q9Var.f(f11, b9Var);
                                        kVar.d.setVisibility(4);
                                        kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                                        kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                                        f10.addView(kVar, c8.ma.o(-1, 50));
                                        kVar.setOnClickListener(new ah.h((Object) u1VarArr, (Runnable) u3Var, (Object) x4Var, 22));
                                    }
                                }
                                u1Var.S = org.telegram.messenger.gd.M0(2131745476, null);
                                alertDialog$Builder.o(f10);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752578, null), null);
                                u1VarArr[0] = u1Var;
                                return u1Var;
                            }

                            public static void i0(Context context, int i7, long j3) {
                                org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, null, false);
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
                                int i10 = org.telegram.ui.ActionBar.n6.Fi;
                                ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.v0(i10));
                                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
                                frameLayout2.setBackground(L2);
                                org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, null);
                                frameLayout.addView(frameLayout2, c8.ma.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i11 = org.telegram.ui.ActionBar.n6.G6;
                                org.telegram.messenger.f3.l(textView, i11, null, 1, 20.0f);
                                textView.setText(org.telegram.messenger.gd.M0(2131752613, null));
                                textView.setGravity(17);
                                TextView f10 = org.telegram.messenger.n10.f(g10, textView, c8.ma.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                org.telegram.ui.ActionBar.u6.U(f10, i11, null);
                                f10.setTextSize(1, 14.0f);
                                org.telegram.messenger.f3.q(null, null, 2131752614, new Object[]{org.telegram.messenger.n5.l(i7, j3)}, f10);
                                f10.setGravity(17);
                                g10.addView(f10, c8.ma.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                hi.d dVar = new hi.d(context, null, true);
                                dVar.i(org.telegram.messenger.gd.M0(2131752615, null), false, true);
                                g10.addView(dVar, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                j10.O = g10;
                                dVar.setOnClickListener(new org.telegram.ui.gd(i7, dVar, j10, j3));
                                j10.O();
                                j10.show();
                            }

                            public static org.telegram.ui.ActionBar.u1 j(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                                String M0 = org.telegram.messenger.gd.M0(2131754241, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.U = M0;
                                int i7 = org.telegram.ui.ActionBar.n6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
                                alertDialog$Builder.n(i7, null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new t0(context, 0));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), null);
                                return u1Var;
                            }

                            public static void j0(String str, org.telegram.ui.ActionBar.h2 h2Var) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || h2Var == null || h2Var.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
                                String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                u1Var.U = org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, G);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                                h2Var.showDialog(u1Var, true, null);
                            }

                            public static void k(Context context, org.telegram.ui.ActionBar.i6 i6Var, z4 z4Var) {
                                if (context == null) {
                                    return;
                                }
                                boolean z10 = false;
                                int i7 = org.telegram.ui.ActionBar.n6.j5;
                                int i10 = i6Var != null ? i6Var.i(i7) : org.telegram.ui.ActionBar.n6.x0(null, i7, false);
                                int i11 = org.telegram.ui.ActionBar.n6.h5;
                                int i12 = i6Var != null ? i6Var.i(i11) : org.telegram.ui.ActionBar.n6.x0(null, i11, false);
                                int i13 = org.telegram.ui.ActionBar.n6.Aj;
                                if (i6Var != null) {
                                    i6Var.i(i13);
                                } else {
                                    org.telegram.ui.ActionBar.n6.x0(null, i13, false);
                                }
                                int i14 = org.telegram.ui.ActionBar.n6.Ej;
                                if (i6Var != null) {
                                    i6Var.i(i14);
                                } else {
                                    org.telegram.ui.ActionBar.n6.x0(null, i14, false);
                                }
                                int i15 = org.telegram.ui.ActionBar.n6.E8;
                                if (i6Var != null) {
                                    i6Var.i(i15);
                                } else {
                                    org.telegram.ui.ActionBar.n6.x0(null, i15, false);
                                }
                                int i16 = org.telegram.ui.ActionBar.n6.G8;
                                if (i6Var != null) {
                                    i6Var.i(i16);
                                } else {
                                    org.telegram.ui.ActionBar.n6.x0(null, i16, false);
                                }
                                int i17 = org.telegram.ui.ActionBar.n6.i6;
                                if (i6Var != null) {
                                    i6Var.i(i17);
                                } else {
                                    org.telegram.ui.ActionBar.n6.x0(null, i17, false);
                                }
                                int i18 = org.telegram.ui.ActionBar.n6.Ji;
                                int i19 = i6Var != null ? i6Var.i(i18) : org.telegram.ui.ActionBar.n6.x0(null, i18, false);
                                int i20 = org.telegram.ui.ActionBar.n6.Fi;
                                int i21 = i6Var != null ? i6Var.i(i20) : org.telegram.ui.ActionBar.n6.x0(null, i20, false);
                                int i22 = org.telegram.ui.ActionBar.n6.Hi;
                                int i23 = i6Var != null ? i6Var.i(i22) : org.telegram.ui.ActionBar.n6.x0(null, i22, false);
                                hi.w4 w4Var = new hi.w4(context, i6Var);
                                ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                k4 k4Var = new k4(context, i6Var, iArr);
                                k4Var.setMinValue(0);
                                k4Var.setMaxValue(16);
                                k4Var.setTextColor(i10);
                                k4Var.setValue(0);
                                k4Var.setFormatter(new e1(iArr, 1));
                                l4 l4Var = new l4(context, k4Var, 0);
                                boolean z11 = true;
                                l4Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                l4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(org.telegram.messenger.gd.M0(2131753875, null));
                                textView.setTextColor(i10);
                                i5.c.x(textView, 1, 20.0f);
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                l4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, z11, z11, z10, 1);
                                linearLayout.addView(k4Var, c8.ma.l(1.0f, 0, org.telegram.messenger.ks.t4));
                                w3Var.setPadding(0, 0, 0, 0);
                                w3Var.setGravity(17);
                                w3Var.setTextColor(i19);
                                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                                w3Var.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                w3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, i21, i23, i23));
                                l4Var.addView(w3Var, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                                w3Var.setText(org.telegram.messenger.gd.M0(2131751423, null));
                                k4Var.setOnValueChangedListener(new b0(w3Var, 9));
                                w3Var.setOnClickListener(new bi.n6(iArr, k4Var, z4Var, w4Var, 9));
                                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.b;
                                x2Var.O = l4Var;
                                x2Var.show();
                                x2Var.v0(i12);
                                x2Var.P(i12);
                            }

                            public static void k0(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, TL_stars.StarGift starGift, long j3, Runnable runnable) {
                                TLObject g22 = org.telegram.messenger.mp.u1(i7).g2(j3);
                                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                g10.addView(new di.c5(context, starGift, g22), c8.ma.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
                                textView.setTextSize(1, 16.0f);
                                org.telegram.messenger.f3.q(null, null, 2131749419, new Object[]{org.telegram.messenger.n5.H(null, null, g22)}, textView);
                                g10.addView(textView, c8.ma.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                                alertDialog$Builder.o(g10);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131749420, null), new d1(2, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.p();
                            }

                            public static hi.w4 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.x10 x10Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
                                if (context == null) {
                                    return null;
                                }
                                hi.w4 w4Var = new hi.w4(context, i6Var);
                                int i7 = 0;
                                ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
                                sb0 sb0Var = new sb0(context, i6Var);
                                sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                sb0Var.setItemCount(5);
                                sb0 sb0Var2 = new sb0(context, i6Var);
                                sb0Var2.setItemCount(5);
                                sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                sb0 sb0Var3 = new sb0(context, i6Var);
                                sb0Var3.setItemCount(5);
                                sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                c4 c4Var = new c4(context, sb0Var, sb0Var2, sb0Var3);
                                c4Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                c4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.j5, i6Var, 1, 20.0f);
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                c4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i10 = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i11 = calendar.get(5);
                                int i12 = calendar.get(2);
                                int i13 = calendar.get(1);
                                int i14 = i13 + 1;
                                w2 w2Var = new w2(sb0Var3, i14, sb0Var, sb0Var2, i13, i12, i11);
                                System.currentTimeMillis();
                                d4 d4Var = new d4(context);
                                linearLayout.addView(sb0Var, c8.ma.l(0.25f, 0, org.telegram.messenger.ks.t4));
                                sb0Var.setMinValue(1);
                                sb0Var.setMaxValue(31);
                                sb0Var.setWrapSelectorWheel(false);
                                sb0Var.setFormatter(new k2(6));
                                b0 b0Var = new b0(w2Var, 8);
                                sb0Var.setOnScrollListener(b0Var);
                                sb0Var2.setMinValue(0);
                                sb0Var2.setMaxValue(11);
                                sb0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(sb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                                sb0Var2.setFormatter(new k2(7));
                                sb0Var2.setOnScrollListener(b0Var);
                                sb0Var3.setMinValue(i10);
                                sb0Var3.setMaxValue(i14);
                                sb0Var3.setWrapSelectorWheel(false);
                                sb0Var3.setFormatter(new l2.t(i14, 5));
                                linearLayout.addView(sb0Var3, c8.ma.l(0.25f, 0, org.telegram.messenger.ks.t4));
                                sb0Var3.setOnScrollListener(b0Var);
                                if (tL_birthday != null) {
                                    sb0Var.setValue(tL_birthday.day);
                                    sb0Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        sb0Var3.setValue(tL_birthday.year);
                                    } else {
                                        sb0Var3.setValue(i14);
                                    }
                                } else {
                                    sb0Var.setValue(calendar.get(5));
                                    sb0Var2.setValue(calendar.get(2));
                                    sb0Var3.setValue(i14);
                                }
                                w2Var.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    k80 k80Var = new k80(context, null);
                                    k80Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    k80Var.setTextSize(1, 13.0f);
                                    org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.q5, i6Var);
                                    org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
                                    k80Var.setGravity(17);
                                    frameLayout2.addView(k80Var, c8.ma.e(-2, -2, 17));
                                    c4Var.addView(frameLayout2, c8.ma.o(-1, -2));
                                    int i15 = org.telegram.messenger.j10.t0;
                                    org.telegram.ui.ii iiVar = new org.telegram.ui.ii(i15, k80Var, 4);
                                    iiVar.run();
                                    org.telegram.messenger.ks.f(i15).h(frameLayout2, org.telegram.messenger.ks.k0, new y2(iiVar, i7));
                                    org.telegram.messenger.i5.r(i15).D(false);
                                }
                                if (z10) {
                                    hi.d dVar = new hi.d(context, i6Var, false);
                                    dVar.i(org.telegram.messenger.gd.M0(2131751659, null), false, true);
                                    dVar.setOnClickListener(new bi.f5(sb0Var3, i14, w2Var, 9));
                                    c4Var.addView(dVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                d4Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                d4Var.setGravity(17);
                                org.telegram.ui.ActionBar.u6.U(d4Var, org.telegram.ui.ActionBar.n6.Ji, i6Var);
                                d4Var.setTextSize(1, 14.0f);
                                d4Var.setTypeface(org.telegram.messenger.g0.o());
                                d4Var.setText(str2);
                                int L = org.telegram.messenger.g0.L(24.0f);
                                int i16 = org.telegram.ui.ActionBar.n6.Fi;
                                int w02 = org.telegram.ui.ActionBar.n6.w0(i16, i6Var);
                                int i17 = org.telegram.ui.ActionBar.n6.Hi;
                                int w03 = org.telegram.ui.ActionBar.n6.w0(i17, i6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i16);
                                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i17);
                                d4Var.setBackground(k02);
                                org.telegram.ui.ActionBar.u6.j(d4Var, k02, M, M2, i6Var);
                                c8.ra.b(d4Var, 0.02f, 1.2f);
                                c4Var.addView(d4Var, c8.ma.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
                                d4Var.setOnClickListener(new di.y9(sb0Var, sb0Var2, sb0Var3, i14, w4Var, x10Var));
                                if (z11) {
                                    hi.d dVar2 = new hi.d(context, i6Var, false);
                                    dVar2.i(org.telegram.messenger.gd.M0(2131753713, null), false, true);
                                    dVar2.f();
                                    dVar2.setOnClickListener(new ni.b(26, w4Var, x10Var));
                                    c4Var.addView(dVar2, c8.ma.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((org.telegram.ui.ActionBar.x2) w4Var.b).O = c4Var;
                                return w4Var;
                            }

                            public static void l0(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, boolean z10, final org.telegram.messenger.q10 q10Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    final int i7 = 1;
                                    final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                                    final int i10 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                                    String M0 = org.telegram.messenger.gd.M0(2131747586, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i11 = org.telegram.ui.ActionBar.n6.j5;
                                    org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
                                    org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i11);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.u6.j(textView, d02, K, null, i6Var);
                                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, i6Var);
                                    c2Var.setMultiline(true);
                                    c2Var.getTextView().getLayoutParams().width = -1;
                                    c2Var.getTextView().setSingleLine(false);
                                    c2Var.getTextView().setMaxLines(3);
                                    c2Var.getTextView().setTextSize(1, 16.0f);
                                    c2Var.e(org.telegram.messenger.gd.M0(z10 ? 2131752866 : 2131752865, null), "", false, false, false);
                                    c2Var.setOnClickListener(new i1(c2Var, i10));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, c8.ma.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(c2Var, c8.ma.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.o(linearLayout);
                                    u1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747624, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.j1
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                                            switch (i10) {
                                                case 0:
                                                    q10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                                                    if (u1Var3 != null) {
                                                        u1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    q10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.u1 u1Var4 = u1VarArr[0];
                                                    if (u1Var4 != null) {
                                                        u1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.j1
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                                            switch (i7) {
                                                case 0:
                                                    q10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                                                    if (u1Var3 != null) {
                                                        u1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    q10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
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
                            public static void m(org.telegram.ui.ActionBar.h2 h2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                org.telegram.ui.Cells.c2 c2Var;
                                ?? r52;
                                if (h2Var == null) {
                                    return;
                                }
                                Context context = h2Var.getContext();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                v4 v4Var = new v4(context, null);
                                org.telegram.messenger.ks.i(v4Var);
                                org.telegram.ui.ActionBar.u6.U(v4Var, org.telegram.ui.ActionBar.n6.j5, null);
                                org.telegram.ui.ActionBar.u6.G(v4Var, org.telegram.ui.ActionBar.n6.Xc, null);
                                v4Var.setTextSize(1, 16.0f);
                                v4Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
                                w4 w4Var = new w4(context, c2VarArr2);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.H = 6;
                                alertDialog$Builder.o(w4Var);
                                b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
                                b9Var.u(org.telegram.messenger.g0.L(18.0f));
                                q9 q9Var = new q9(context);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                w4Var.addView(q9Var, c8.ma.d(40, 40.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
                                org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
                                n5Var.setTextSize(20);
                                n5Var.setTypeface(org.telegram.messenger.g0.o());
                                n5Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                n5Var.setEllipsizeByGradient(true);
                                n5Var.l(user.first_name, false);
                                if (user.scam) {
                                    n5Var.i(org.telegram.ui.ActionBar.n6.g1);
                                } else if (user.fake) {
                                    n5Var.i(org.telegram.ui.ActionBar.n6.h1);
                                } else if (user.verified) {
                                    Drawable g10 = i5.c.g(context, R.drawable.verified_area);
                                    int i7 = org.telegram.ui.ActionBar.n6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.u6.x(n5Var, g10, i7, null, mode);
                                    Drawable g11 = i5.c.g(context, R.drawable.verified_check);
                                    c2VarArr = c2VarArr2;
                                    org.telegram.ui.ActionBar.u6.x(n5Var, g11, org.telegram.ui.ActionBar.n6.A9, null, mode);
                                    n5Var.i(new mq(g10, g11));
                                    TextView textView = new TextView(context);
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.m5, null);
                                    int i10 = 1;
                                    org.telegram.messenger.n10.q(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new k1(user, h2Var, alertDialog$Builder, i10));
                                    SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.gd.M0(2131748143, null) + "  ");
                                    lq lqVar = new lq(R.drawable.attach_arrow_right, 0);
                                    lqVar.n = 1;
                                    lqVar.c(org.telegram.messenger.g0.L(10.0f));
                                    valueOf.setSpan(lqVar, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z10 = org.telegram.messenger.gd.a0;
                                    w4Var.addView(n5Var, c8.ma.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f));
                                    boolean z11 = org.telegram.messenger.gd.a0;
                                    w4Var.addView(textView, c8.ma.d(-1, -2.0f, (!z11 ? 5 : 3) | 48, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                    w4Var.addView(v4Var, c8.ma.d(-2, -2.0f, (!org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    c2Var = new org.telegram.ui.Cells.c2(1, context, h2Var.getResourceProvider());
                                    c2VarArr[0] = c2Var;
                                    if (!c2Var.I) {
                                        org.telegram.ui.Cells.b2 b2Var = c2Var.c;
                                        b2Var.setLines(3);
                                        b2Var.setMaxLines(3);
                                        b2Var.setSingleLine(false);
                                    }
                                    c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                                    c2VarArr[0].e(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131747587, org.telegram.messenger.o10.q(user))), "", true, false, false);
                                    c2VarArr[0].setPadding(!org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                    c2VarArr[0].c(true, false);
                                    w4Var.addView(c2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new n0(atomicBoolean, 1));
                                    if (org.telegram.messenger.o10.A(user)) {
                                        r52 = 0;
                                        b9Var.p = 1.0f;
                                        h2Var.getCurrentAccount();
                                        b9Var.r(user);
                                        q9Var.f(user, b9Var);
                                    } else {
                                        b9Var.p = 0.8f;
                                        b9Var.g(12);
                                        r52 = 0;
                                        q9Var.j(null, null, b9Var, user);
                                    }
                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131744680, r52), new d1(3, runnable));
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, r52), r52);
                                    h2Var.showDialog(u1Var);
                                    v4Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752885, r52), new l1(1, context, u1Var)));
                                }
                                c2VarArr = c2VarArr2;
                                TextView textView2 = new TextView(context);
                                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.m5, null);
                                int i102 = 1;
                                org.telegram.messenger.n10.q(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new k1(user, h2Var, alertDialog$Builder, i102));
                                SpannableString valueOf2 = SpannableString.valueOf(org.telegram.messenger.gd.M0(2131748143, null) + "  ");
                                lq lqVar2 = new lq(R.drawable.attach_arrow_right, 0);
                                lqVar2.n = 1;
                                lqVar2.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf2.setSpan(lqVar2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z102 = org.telegram.messenger.gd.a0;
                                w4Var.addView(n5Var, c8.ma.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f));
                                boolean z112 = org.telegram.messenger.gd.a0;
                                w4Var.addView(textView2, c8.ma.d(-1, -2.0f, (!z112 ? 5 : 3) | 48, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f));
                                w4Var.addView(v4Var, c8.ma.d(-2, -2.0f, (!org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                c2Var = new org.telegram.ui.Cells.c2(1, context, h2Var.getResourceProvider());
                                c2VarArr[0] = c2Var;
                                if (!c2Var.I) {
                                }
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                                c2VarArr[0].e(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131747587, org.telegram.messenger.o10.q(user))), "", true, false, false);
                                c2VarArr[0].setPadding(!org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                c2VarArr[0].c(true, false);
                                w4Var.addView(c2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                c2VarArr[0].setOnClickListener(new n0(atomicBoolean, 1));
                                if (org.telegram.messenger.o10.A(user)) {
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131744680, r52), new d1(3, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, r52), r52);
                                h2Var.showDialog(u1Var);
                                v4Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752885, r52), new l1(1, context, u1Var)));
                            }

                            public static void m0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.i6 i6Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (vf.c.g(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                                        vf.c.s(context, Uri.parse(str), j3 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), bVar, null, false, true, false, false);
                                        return;
                                    }
                                    String d = vf.c.d(str, z10);
                                    r2 r2Var = new r2(context, str, j3, z11, bVar);
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                                    String M0 = org.telegram.messenger.gd.M0(2131747586, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(d);
                                    textView.setTextSize(1, 14.0f);
                                    int i7 = org.telegram.ui.ActionBar.n6.j5;
                                    org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
                                    org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i7);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.u6.j(textView, d02, K, null, i6Var);
                                    LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                    g10.addView(textView, c8.ma.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i10 = m71.f;
                                    if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                        m71 m71Var = new m71(context, i6Var);
                                        m71Var.setWebPage(webPage);
                                        g10.addView(m71Var, c8.ma.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder.o(g10);
                                    u1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747624, null), new b0(r2Var, 7));
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                    alertDialog$Builder.p();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.String, org.telegram.ui.ActionBar.r1] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r52;
                                Context context = h2Var.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                r4 r4Var = new r4(context, null);
                                org.telegram.messenger.ks.i(r4Var);
                                org.telegram.ui.ActionBar.u6.U(r4Var, org.telegram.ui.ActionBar.n6.j5, null);
                                org.telegram.ui.ActionBar.u6.G(r4Var, org.telegram.ui.ActionBar.n6.Xc, null);
                                r4Var.setTextSize(1, 16.0f);
                                r4Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.H = 6;
                                alertDialog$Builder.o(frameLayout);
                                b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
                                b9Var.u(org.telegram.messenger.g0.L(18.0f));
                                q9 q9Var = new q9(context);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
                                org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
                                n5Var.setTextSize(20);
                                n5Var.setTypeface(org.telegram.messenger.g0.o());
                                n5Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                n5Var.setEllipsizeByGradient(true);
                                n5Var.l(user.first_name, false);
                                if (user.scam) {
                                    n5Var.i(org.telegram.ui.ActionBar.n6.g1);
                                } else if (user.fake) {
                                    n5Var.i(org.telegram.ui.ActionBar.n6.h1);
                                } else if (user.verified) {
                                    Drawable g10 = i5.c.g(context, R.drawable.verified_area);
                                    int i7 = org.telegram.ui.ActionBar.n6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.u6.x(n5Var, g10, i7, null, mode);
                                    Drawable g11 = i5.c.g(context, R.drawable.verified_check);
                                    org.telegram.ui.ActionBar.u6.x(n5Var, g11, org.telegram.ui.ActionBar.n6.A9, null, mode);
                                    n5Var.i(new mq(g10, g11));
                                }
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.m5, null);
                                org.telegram.messenger.n10.q(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new k1(user, h2Var, alertDialog$Builder, 0));
                                SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.gd.M0(2131748143, null) + "  ");
                                lq lqVar = new lq(R.drawable.attach_arrow_right, 0);
                                lqVar.n = 1;
                                lqVar.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf.setSpan(lqVar, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z10 = org.telegram.messenger.gd.a0;
                                frameLayout.addView(n5Var, c8.ma.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
                                boolean z11 = org.telegram.messenger.gd.a0;
                                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(r4Var, c8.ma.d(-2, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.o10.A(user)) {
                                    b9Var.p = 0.8f;
                                    b9Var.g(12);
                                    r52 = 0;
                                    q9Var.j(null, null, b9Var, user);
                                } else {
                                    r52 = 0;
                                    b9Var.p = 1.0f;
                                    h2Var.getCurrentAccount();
                                    b9Var.r(user);
                                    q9Var.f(user, b9Var);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131744680, r52), new d1(1, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, r52), r52);
                                h2Var.showDialog(u1Var, false, new v0(1, runnable2));
                                r4Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752885, r52), new l1(0, context, u1Var)));
                            }

                            public static void n0(org.telegram.ui.ActionBar.h2 h2Var, String str, boolean z10, boolean z11) {
                                o0(h2Var, str, z10, true, z11, false, null, null, null);
                            }

                            public static hi.w4 o(Activity activity, org.telegram.messenger.nr nrVar, org.telegram.ui.ActionBar.i6 i6Var) {
                                if (activity == null) {
                                    return null;
                                }
                                hi.w4 w4Var = new hi.w4(activity, i6Var);
                                ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
                                sb0 sb0Var = new sb0(activity, i6Var);
                                sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                sb0Var.setItemCount(5);
                                sb0 sb0Var2 = new sb0(activity, i6Var);
                                sb0Var2.setItemCount(5);
                                sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                sb0 sb0Var3 = new sb0(activity, i6Var);
                                sb0Var3.setItemCount(5);
                                sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                v3 v3Var = new v3(activity, sb0Var, sb0Var2, sb0Var3, 6);
                                v3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                v3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(org.telegram.messenger.gd.M0(2131752121, null));
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.j5, i6Var, 1, 20.0f);
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                v3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                di.xb xbVar = new di.xb(activity, 20);
                                linearLayout.addView(sb0Var, c8.ma.l(0.25f, 0, org.telegram.messenger.ks.t4));
                                sb0Var.setMinValue(1);
                                sb0Var.setMaxValue(31);
                                sb0Var.setWrapSelectorWheel(false);
                                sb0Var.setFormatter(new k2(8));
                                b2 b2Var = new b2(sb0Var, sb0Var2, sb0Var3, 2);
                                sb0Var.setOnValueChangedListener(b2Var);
                                sb0Var2.setMinValue(0);
                                sb0Var2.setMaxValue(11);
                                sb0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(sb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                                sb0Var2.setFormatter(new k2(9));
                                sb0Var2.setOnValueChangedListener(b2Var);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i7 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i10 = calendar.get(1);
                                sb0Var3.setMinValue(i7);
                                sb0Var3.setMaxValue(i10);
                                sb0Var3.setWrapSelectorWheel(false);
                                sb0Var3.setFormatter(new k2(10));
                                linearLayout.addView(sb0Var3, c8.ma.l(0.25f, 0, org.telegram.messenger.ks.t4));
                                sb0Var3.setOnValueChangedListener(b2Var);
                                sb0Var.setValue(31);
                                sb0Var2.setValue(12);
                                sb0Var3.setValue(i10);
                                b(sb0Var, sb0Var2, sb0Var3);
                                xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                xbVar.setGravity(17);
                                org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.Ji, i6Var);
                                xbVar.setTextSize(1, 14.0f);
                                xbVar.setTypeface(org.telegram.messenger.g0.o());
                                xbVar.setText(org.telegram.messenger.gd.M0(2131748873, null));
                                int L = org.telegram.messenger.g0.L(8.0f);
                                int i11 = org.telegram.ui.ActionBar.n6.Fi;
                                int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
                                int i12 = org.telegram.ui.ActionBar.n6.Hi;
                                int w03 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
                                xbVar.setBackground(k02);
                                org.telegram.ui.ActionBar.u6.j(xbVar, k02, M, M2, i6Var);
                                v3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                                xbVar.setOnClickListener(new v1(sb0Var, sb0Var2, sb0Var3, calendar, nrVar, w4Var, 2));
                                ((org.telegram.ui.ActionBar.x2) w4Var.b).O = v3Var;
                                return w4Var;
                            }

                            public static void o0(org.telegram.ui.ActionBar.h2 h2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.i6 i6Var) {
                                if (h2Var == null || h2Var.getParentActivity() == null) {
                                    return;
                                }
                                m0(h2Var.getParentActivity(), str, z10, z11, z12, z13, h2Var instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) h2Var).x8 : 0L, bVar, webPage, i6Var);
                            }

                            public static void p(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, boolean z10) {
                                String M0;
                                String a02;
                                if (h2Var.getParentActivity() == null || user == null || org.telegram.messenger.o10.y(user) || org.telegram.messenger.j10.i(h2Var.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                h2Var.getCurrentAccount();
                                Activity parentActivity = h2Var.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                if (z10) {
                                    M0 = org.telegram.messenger.gd.M0(2131743372, null);
                                    a02 = org.telegram.messenger.gd.a0("VideoCallAlert", null, 2131743373, org.telegram.messenger.o10.q(user));
                                } else {
                                    M0 = org.telegram.messenger.gd.M0(2131752620, null);
                                    a02 = org.telegram.messenger.gd.a0("CallAlert", null, 2131752621, org.telegram.messenger.o10.q(user));
                                }
                                r3 r3Var = new r3(parentActivity);
                                org.telegram.messenger.ks.i(r3Var);
                                org.telegram.ui.ActionBar.u6.U(r3Var, org.telegram.ui.ActionBar.n6.j5, null);
                                r3Var.setTextSize(1, 16.0f);
                                r3Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
                                r3Var.setText(org.telegram.messenger.g0.W2(a02));
                                b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
                                b9Var.u(org.telegram.messenger.g0.L(12.0f));
                                b9Var.p = 1.0f;
                                h2Var.getCurrentAccount();
                                b9Var.r(user);
                                q9 q9Var = new q9(parentActivity);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                q9Var.f(user, b9Var);
                                frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(M0);
                                boolean z11 = org.telegram.messenger.gd.a0;
                                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(r3Var, c8.ma.d(-2, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.o(frameLayout);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752623, null), new ab.j(h2Var, user, z10, 6));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                h2Var.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(Activity activity, int i7, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i10 = org.telegram.messenger.mp.u1(i7).q3;
                                if ((i10 & 1) != 0) {
                                    org.telegram.ui.Cells.c0.v(null, 2131748494, arrayList, 0, arrayList2);
                                }
                                if ((i10 & 2) != 0) {
                                    org.telegram.ui.Cells.c0.v(null, 2131748496, arrayList, 1, arrayList2);
                                }
                                if ((i10 & 4) != 0) {
                                    org.telegram.ui.Cells.c0.v(null, 2131748492, arrayList, 3, arrayList2);
                                }
                                arrayList.add(org.telegram.messenger.gd.M0(2131748495, null));
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
                                alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131748493, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.o(linearLayout);
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
                                    j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    j6Var.setTag(Integer.valueOf(i11));
                                    a(j6Var, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.E5, null);
                                    j6Var.b((CharSequence) arrayList.get(i11), org.telegram.messenger.bz.o0 == ((Integer) arrayList2.get(i11)).intValue());
                                    int i12 = org.telegram.ui.ActionBar.n6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 2, -1);
                                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
                                    j6Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.u6.j(j6Var, h02, null, M, null);
                                    linearLayout.addView(j6Var);
                                    j6Var.setOnClickListener(new ah.h((Object) arrayList2, runnable, (Object) alertDialog$Builder, 23));
                                }
                                if (!z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                }
                                org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
                                if (z10) {
                                    p10.setCanceledOnTouchOutside(false);
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x017d, code lost:
                            
                                if (org.telegram.messenger.v3.p0(r34) == false) goto L61;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x0195, code lost:
                            
                                r8 = new org.telegram.ui.Cells.c2(1, r6, r37);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01a5, code lost:
                            
                                if (r34 == null) goto L64;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01a7, code lost:
                            
                                r11[0].e(org.telegram.messenger.gd.M0(2131751513, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01da, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e0, code lost:
                            
                                if (org.telegram.messenger.gd.a0 == false) goto L68;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e2, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01ed, code lost:
                            
                                if (org.telegram.messenger.gd.a0 == false) goto L73;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01ef, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01fa, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new org.telegram.ui.Components.f1(2, r1));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01e7, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01bc, code lost:
                            
                                r11[0].e(org.telegram.messenger.gd.a0("DeleteMessagesOptionAlso", null, 2131751514, org.telegram.messenger.o10.k(r33, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
                            
                                if (org.telegram.messenger.v3.p0(r34) == false) goto L61;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.User user, TLRPC.Chat chat, boolean z10, org.telegram.messenger.lr lrVar, org.telegram.ui.ActionBar.i6 i6Var) {
                                boolean z11;
                                if (h2Var == null || h2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = h2Var.getCurrentAccount();
                                Activity parentActivity = h2Var.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, i6Var);
                                long e10 = org.telegram.messenger.j10.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                p3 p3Var = new p3(parentActivity);
                                org.telegram.messenger.ks.i(p3Var);
                                org.telegram.ui.ActionBar.u6.U(p3Var, org.telegram.ui.ActionBar.n6.j5, null);
                                p3Var.setTextSize(1, 16.0f);
                                p3Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
                                q3 q3Var = new q3(parentActivity, c2VarArr);
                                alertDialog$Builder.o(q3Var);
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                q3Var.addView(textView, c8.ma.d(-1, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                q3Var.addView(p3Var, c8.ma.d(-2, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i7 == -1) {
                                    textView.setText(org.telegram.messenger.gd.a0("ClearHistory", null, 2131752078, new Object[0]));
                                    if (user != null) {
                                        p3Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AreYouSureClearHistoryWithUser", null, 2131754105, org.telegram.messenger.o10.q(user))));
                                    } else if (z10) {
                                        if (org.telegram.messenger.v3.V(chat)) {
                                            p3Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AreYouSureClearHistoryWithChannel", null, 2131754108, chat.title)));
                                            z11 = false;
                                        } else {
                                            p3Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AreYouSureClearHistoryWithChat", null, 2131754107, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        p3Var.setText(org.telegram.messenger.gd.M0(2131754110, null));
                                    } else {
                                        p3Var.setText(org.telegram.messenger.gd.M0(2131754112, null));
                                    }
                                    z11 = false;
                                } else {
                                    z11 = false;
                                    textView.setText(org.telegram.messenger.gd.G(i7, "DeleteDays", new Object[0]));
                                    p3Var.setText(org.telegram.messenger.gd.M0(2131751524, null));
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
                                CharSequence M0 = org.telegram.messenger.gd.M0(2131751587, null);
                                if (chat != null && z10 && org.telegram.messenger.v3.t0(chat) && !org.telegram.messenger.v3.V(chat)) {
                                    M0 = org.telegram.messenger.gd.M0(2131752080, null);
                                }
                                alertDialog$Builder.k(M0, new g2(5, lrVar, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                h2Var.showDialog(u1Var);
                                TextView textView2 = (TextView) u1Var.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, null);
                                }
                            }

                            public static void q0(int i7, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
                                if (i7 == 0 || h2Var == null || h2Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getParentActivity(), i6Var);
                                String M0 = org.telegram.messenger.gd.M0(2131743679, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                if (i7 == 1) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751076, null);
                                } else if (i7 == 2) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751088, null);
                                } else if (i7 == 3) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751082, null);
                                } else if (i7 == 4) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751075, null);
                                } else if (i7 == 5) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751087, null);
                                } else if (i7 == 6) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751081, null);
                                } else if (i7 == 7) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751079, null);
                                } else if (i7 == 8) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751080, null);
                                } else if (i7 == 9) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751071, null);
                                } else if (i7 == 10) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751083, null);
                                } else if (i7 == 11) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751072, null);
                                } else if (i7 == 12) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751084, null);
                                } else if (i7 == 13) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751069, null);
                                } else if (i7 == 14) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751070, null);
                                } else if (i7 == 15) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751077, null);
                                } else if (i7 == 16) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751078, null);
                                } else if (i7 == 17) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751089, null);
                                } else if (i7 == 18) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751090, null);
                                } else if (i7 == 19) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751085, null);
                                } else if (i7 == 20) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751086, null);
                                } else if (i7 == 21) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751073, null);
                                } else if (i7 == 22) {
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751074, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                                h2Var.showDialog(u1Var, true, null);
                            }

                            public static void r(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.lr lrVar) {
                                s(h2Var, z10, false, chat, user, z11, z12, z13, z14, lrVar, h2Var != null ? h2Var.getResourceProvider() : null);
                            }

                            public static org.telegram.ui.ActionBar.u1 r0(org.telegram.ui.ActionBar.h2 h2Var, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
                                if (h2Var == null) {
                                    h2Var = LaunchActivity.T();
                                }
                                if (str2 == null || h2Var == null || h2Var.getParentActivity() == null) {
                                    return null;
                                }
                                org.telegram.ui.ActionBar.u1 u1Var = L(h2Var.getParentActivity(), str, str2, null, null, i6Var).a;
                                h2Var.showDialog(u1Var);
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
                            public static void s(final org.telegram.ui.ActionBar.h2 h2Var, final boolean z10, final boolean z11, final TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final org.telegram.messenger.lr lrVar, final org.telegram.ui.ActionBar.i6 i6Var) {
                                long j3;
                                boolean z16;
                                boolean z17;
                                b9 b9Var;
                                TLRPC.Chat chat2;
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                l3 l3Var;
                                ArrayList arrayList;
                                org.telegram.ui.ActionBar.u1 u1Var;
                                b9 b9Var2;
                                float f10;
                                float f11;
                                boolean z18;
                                b9 b9Var3;
                                boolean z19;
                                boolean z20;
                                String str;
                                CharSequence M0;
                                TextView textView;
                                if (h2Var == null || h2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (chat == null && user == null) {
                                    return;
                                }
                                final int currentAccount = h2Var.getCurrentAccount();
                                final Activity parentActivity = h2Var.getParentActivity();
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, i6Var);
                                long e10 = org.telegram.messenger.j10.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                l3 l3Var2 = new l3(parentActivity);
                                org.telegram.messenger.ks.i(l3Var2);
                                org.telegram.ui.ActionBar.u6.U(l3Var2, org.telegram.ui.ActionBar.n6.j5, null);
                                l3Var2.setTextSize(1, 16.0f);
                                l3Var2.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
                                if (!z15 && org.telegram.messenger.v3.T(chat) && org.telegram.messenger.v3.t0(chat)) {
                                    j3 = e10;
                                    z16 = true;
                                } else {
                                    j3 = e10;
                                    z16 = false;
                                }
                                m3 m3Var = new m3(parentActivity, c2VarArr2);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                                u1Var2.H = 6;
                                alertDialog$Builder.o(m3Var);
                                b9 b9Var4 = new b9((org.telegram.ui.ActionBar.i6) null);
                                b9Var4.u(org.telegram.messenger.g0.L(18.0f));
                                q9 q9Var = new q9(parentActivity);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                                m3Var.addView(q9Var, c8.ma.d(30, 30.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                n6 n6Var = new n6(parentActivity, false, false, false);
                                org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.E8, null);
                                n6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
                                n6Var.setTypeface(org.telegram.messenger.g0.o());
                                n6Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                                n6Var.setEllipsizeByGradient(true);
                                if (!z10) {
                                    z17 = z16;
                                    if (chat == null) {
                                        n6Var.setText(org.telegram.messenger.gd.M0(2131751542, null));
                                    } else if (org.telegram.messenger.v3.Y(chat)) {
                                        n6Var.setText(org.telegram.messenger.gd.M0(2131751923, null));
                                    } else if (!org.telegram.messenger.v3.T(chat)) {
                                        n6Var.setText(org.telegram.messenger.gd.M0(2131748799, null));
                                    } else if (chat.monoforum) {
                                        n6Var.setText(org.telegram.messenger.gd.M0(2131748803, null));
                                    } else if (chat.megagroup) {
                                        n6Var.setText(org.telegram.messenger.gd.M0(2131748799, null));
                                    } else {
                                        n6Var.setText(org.telegram.messenger.gd.M0(2131748812, null));
                                    }
                                } else if (z16) {
                                    z17 = z16;
                                    n6Var.setText(org.telegram.messenger.gd.M0(2131752077, null));
                                } else {
                                    z17 = z16;
                                    n6Var.setText(org.telegram.messenger.gd.M0(2131752078, null));
                                }
                                boolean z21 = org.telegram.messenger.gd.a0;
                                m3Var.addView(n6Var, c8.ma.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
                                m3Var.addView(l3Var2, c8.ma.d(-2, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.v3.p0(chat)) {
                                    b9Var = b9Var4;
                                    chat2 = h2Var.getMessagesController().x1(chat.id);
                                } else {
                                    b9Var = b9Var4;
                                    chat2 = null;
                                }
                                boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j3 ? 1 : (user.id == j3 ? 0 : -1)) != 0 && org.telegram.messenger.mp.u1(currentAccount).f3) && (user != null ? org.telegram.messenger.mp.u1(currentAccount).e3 : org.telegram.messenger.mp.u1(currentAccount).d3) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    c2VarArr = c2VarArr2;
                                    l3Var = l3Var2;
                                    arrayList = (ArrayList) org.telegram.messenger.mp.u1(currentAccount).S.f(user.id);
                                } else {
                                    c2VarArr = c2VarArr2;
                                    l3Var = l3Var2;
                                    arrayList = null;
                                }
                                boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((org.telegram.messenger.fj) arrayList.get(0)).k == null || (!(((org.telegram.messenger.fj) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((org.telegram.messenger.fj) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f10 = 10.0f;
                                    if (user.bot) {
                                        b9Var2 = b9Var;
                                        f11 = 8.0f;
                                        if (user.id != 489000) {
                                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, i6Var);
                                            c2VarArr[0] = c2Var;
                                            c2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                                            c2VarArr[0].e(org.telegram.messenger.gd.M0(2131753692, null), "", false, false, false);
                                            u1Var = u1Var2;
                                            c2VarArr[0].setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                                            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var2.c(true, false);
                                            c2VarArr[0].setMultiline(true);
                                            m3Var.addView(c2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            c2VarArr[0].setOnClickListener(new f1(1, zArr));
                                            b9Var3 = b9Var2;
                                            z19 = false;
                                            if (user != null) {
                                                b9 b9Var5 = b9Var3;
                                                h2Var.getCurrentAccount();
                                                b9Var5.q(chat2 != null ? chat2 : chat);
                                                q9Var.f(chat2 != null ? chat2 : chat, b9Var5);
                                            } else if (org.telegram.messenger.o10.A(user)) {
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
                                                    h2Var.getCurrentAccount();
                                                    b9Var7.r(user);
                                                    q9Var.f(user, b9Var7);
                                                }
                                            }
                                            if (z11) {
                                                l3 l3Var3 = l3Var;
                                                if (!z10) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z12) {
                                                            l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754085, org.telegram.messenger.o10.q(user))));
                                                        } else if (user.id == j3) {
                                                            l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131754088, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754084, org.telegram.messenger.o10.q(user))));
                                                        } else {
                                                            str = null;
                                                            l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754086, org.telegram.messenger.o10.q(user))));
                                                        }
                                                    } else if (org.telegram.messenger.v3.T(chat)) {
                                                        String a02 = chat2 != null ? org.telegram.messenger.gd.a0(null, null, 2131748154, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748451, a02)));
                                                        } else {
                                                            l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131752378, a02)));
                                                        }
                                                    } else {
                                                        l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754102, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a03 = chat2 != null ? org.telegram.messenger.gd.a0(null, null, 2131748154, chat2.title) : chat.title;
                                                    if (!org.telegram.messenger.v3.T(chat) || (chat.megagroup && !org.telegram.messenger.v3.t0(chat))) {
                                                        str = null;
                                                        l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754107, a03)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        l3Var3.setText(org.telegram.messenger.gd.M0(2131754110, null));
                                                    } else {
                                                        str = null;
                                                        l3Var3.setText(org.telegram.messenger.gd.M0(2131754112, null));
                                                    }
                                                } else if (z12) {
                                                    str = null;
                                                    l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754106, org.telegram.messenger.o10.q(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j3) {
                                                        l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131754109, null)));
                                                    } else {
                                                        l3Var3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754105, org.telegram.messenger.o10.q(user))));
                                                    }
                                                }
                                            } else if (org.telegram.messenger.o10.C(user)) {
                                                str = null;
                                                l3Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751570, null)));
                                            } else {
                                                l3 l3Var4 = l3Var;
                                                str = null;
                                                if (chat == null || !org.telegram.messenger.v3.V(chat)) {
                                                    l3Var4.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751574, null)));
                                                    str = null;
                                                } else {
                                                    l3Var4.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751573, null)));
                                                }
                                            }
                                            if (!z11) {
                                                M0 = org.telegram.messenger.gd.M0(2131751579, str);
                                            } else if (z10) {
                                                M0 = z17 ? org.telegram.messenger.gd.M0(2131752077, str) : org.telegram.messenger.gd.M0(2131752079, str);
                                            } else if (z19 && zArr[0]) {
                                                M0 = org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(chat) ? 2131752411 : 2131751519, str);
                                            } else {
                                                M0 = org.telegram.messenger.v3.T(chat) ? chat.monoforum ? org.telegram.messenger.gd.M0(2131748803, str) : chat.megagroup ? org.telegram.messenger.gd.M0(2131748798, str) : org.telegram.messenger.gd.M0(2131748810, str) : org.telegram.messenger.gd.M0(2131751542, str);
                                            }
                                            final boolean z24 = z17;
                                            org.telegram.ui.ActionBar.u1 u1Var3 = u1Var;
                                            alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.u2
                                                @Override // org.telegram.ui.ActionBar.r1
                                                public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i7) {
                                                    boolean z25 = z24;
                                                    final boolean z26 = z11;
                                                    final boolean[] zArr2 = zArr;
                                                    final org.telegram.messenger.lr lrVar2 = lrVar;
                                                    boolean z27 = true;
                                                    if (!z25 && !z26 && !z12) {
                                                        final TLRPC.User user2 = user;
                                                        boolean C = org.telegram.messenger.o10.C(user2);
                                                        final org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                                                        final boolean z28 = z10;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z29 = z13;
                                                        final boolean z30 = z15;
                                                        final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                                        if (C) {
                                                            b5.s(h2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, lrVar2, i6Var2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            org.telegram.messenger.tr a04 = org.telegram.messenger.tr.a0(h2Var2.getCurrentAccount());
                                                            a04.a.c(new org.telegram.messenger.zq(a04, user2.id, new org.telegram.messenger.nr() { // from class: org.telegram.ui.Components.o1
                                                                @Override // org.telegram.messenger.nr
                                                                public final void a(int i10) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    org.telegram.messenger.lr lrVar3 = lrVar2;
                                                                    if (i10 >= 50) {
                                                                        b5.s(org.telegram.ui.ActionBar.h2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, lrVar3, i6Var2);
                                                                    } else if (lrVar3 != null) {
                                                                        lrVar3.d(zArr3[0]);
                                                                    }
                                                                }
                                                            }, 0));
                                                            return;
                                                        }
                                                        if (org.telegram.messenger.v3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                            h.d();
                                                            TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                            tL_messages_getFutureChatCreatorAfterLeave.peer = org.telegram.messenger.mp.n1(chat3);
                                                            final int i10 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                            d3.b bVar = new d3.b(1);
                                                            final Context context = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, bVar, new org.telegram.messenger.q10() { // from class: org.telegram.ui.Components.p1
                                                                @Override // org.telegram.messenger.q10
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    vf.b.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    org.telegram.messenger.lr lrVar3 = lrVar2;
                                                                    if (user4 == null) {
                                                                        lrVar3.d(z26 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Context context2 = context;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    bg.m0 m0Var = new bg.m0(context2, chat4, user4, i10, lrVar3, i6Var2, 7);
                                                                    z1 z1Var = new z1(lrVar3, 0);
                                                                    org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
                                                                    if (h2Var3 == null || h2Var3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context3 = h2Var3.getContext();
                                                                    TLRPC.User f12 = org.telegram.messenger.j10.i(h2Var3.getCurrentAccount()).f();
                                                                    boolean V = org.telegram.messenger.v3.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context3);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    q9 q9Var2 = new q9(context3);
                                                                    b9 b9Var8 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                    b9Var8.r(f12);
                                                                    q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    q9Var2.f(f12, b9Var8);
                                                                    frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context3);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.d7, h2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    n3 n3Var = new n3(context3);
                                                                    b9 b9Var9 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                    b9Var9.r(user4);
                                                                    n3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    n3Var.f(user4, b9Var9);
                                                                    frameLayout.addView(n3Var, c8.ma.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    q9 q9Var3 = new q9(context3);
                                                                    b9 b9Var10 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                    b9Var10.q(chat4);
                                                                    q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                    q9Var3.f(chat4, b9Var10);
                                                                    frameLayout.addView(q9Var3, c8.ma.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                    org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder2.a;
                                                                    u1Var5.P0 = -1.0f;
                                                                    u1Var5.W = frameLayout;
                                                                    u1Var5.S = org.telegram.messenger.gd.M0(V ? 2131748808 : 2131748800, null);
                                                                    u1Var5.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, V ? 2131748809 : 2131748801, org.telegram.messenger.o10.q(user4), chat4.title));
                                                                    alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131754208, null), new b0(m0Var, 4));
                                                                    alertDialog$Builder2.i(org.telegram.messenger.gd.M0(2131752578, null), null);
                                                                    alertDialog$Builder2.k(org.telegram.messenger.gd.M0(V ? 2131748812 : 2131748798, null), new b0(z1Var, 5));
                                                                    u1Var5.show();
                                                                    View d = u1Var5.d(-1);
                                                                    if (d instanceof TextView) {
                                                                        org.telegram.ui.ActionBar.u6.U((TextView) d, org.telegram.ui.ActionBar.n6.q7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        lrVar2 = lrVar2;
                                                    }
                                                    if (!z26 && !zArr2[0]) {
                                                        z27 = false;
                                                    }
                                                    lrVar2.d(z27);
                                                }
                                            });
                                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                            h2Var.showDialog(u1Var3);
                                            textView = (TextView) u1Var3.d(-1);
                                            if (textView == null) {
                                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        u1Var = u1Var2;
                                        if (!z11 || (((!z12 || z10) && !z22) || org.telegram.messenger.o10.y(user) || z23)) {
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
                                                org.telegram.ui.ActionBar.u1 u1Var32 = u1Var;
                                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.u2
                                                    @Override // org.telegram.ui.ActionBar.r1
                                                    public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i7) {
                                                        boolean z25 = z242;
                                                        final boolean z26 = z11;
                                                        final boolean[] zArr2 = zArr;
                                                        final org.telegram.messenger.lr lrVar2 = lrVar;
                                                        boolean z27 = true;
                                                        if (!z25 && !z26 && !z12) {
                                                            final TLRPC.User user2 = user;
                                                            boolean C = org.telegram.messenger.o10.C(user2);
                                                            final org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                                                            final boolean z28 = z10;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z29 = z13;
                                                            final boolean z30 = z15;
                                                            final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                                            if (C) {
                                                                b5.s(h2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, lrVar2, i6Var2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                org.telegram.messenger.tr a04 = org.telegram.messenger.tr.a0(h2Var2.getCurrentAccount());
                                                                a04.a.c(new org.telegram.messenger.zq(a04, user2.id, new org.telegram.messenger.nr() { // from class: org.telegram.ui.Components.o1
                                                                    @Override // org.telegram.messenger.nr
                                                                    public final void a(int i10) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        org.telegram.messenger.lr lrVar3 = lrVar2;
                                                                        if (i10 >= 50) {
                                                                            b5.s(org.telegram.ui.ActionBar.h2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, lrVar3, i6Var2);
                                                                        } else if (lrVar3 != null) {
                                                                            lrVar3.d(zArr3[0]);
                                                                        }
                                                                    }
                                                                }, 0));
                                                                return;
                                                            }
                                                            if (org.telegram.messenger.v3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                                h.d();
                                                                TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                                tL_messages_getFutureChatCreatorAfterLeave.peer = org.telegram.messenger.mp.n1(chat3);
                                                                final int i10 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                                d3.b bVar = new d3.b(1);
                                                                final Context context = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, bVar, new org.telegram.messenger.q10() { // from class: org.telegram.ui.Components.p1
                                                                    @Override // org.telegram.messenger.q10
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        vf.b.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        org.telegram.messenger.lr lrVar3 = lrVar2;
                                                                        if (user4 == null) {
                                                                            lrVar3.d(z26 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Context context2 = context;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        bg.m0 m0Var = new bg.m0(context2, chat4, user4, i10, lrVar3, i6Var2, 7);
                                                                        z1 z1Var = new z1(lrVar3, 0);
                                                                        org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
                                                                        if (h2Var3 == null || h2Var3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context3 = h2Var3.getContext();
                                                                        TLRPC.User f12 = org.telegram.messenger.j10.i(h2Var3.getCurrentAccount()).f();
                                                                        boolean V = org.telegram.messenger.v3.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        q9 q9Var2 = new q9(context3);
                                                                        b9 b9Var8 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                        b9Var8.r(f12);
                                                                        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        q9Var2.f(f12, b9Var8);
                                                                        frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context3);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.d7, h2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        n3 n3Var = new n3(context3);
                                                                        b9 b9Var9 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                        b9Var9.r(user4);
                                                                        n3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        n3Var.f(user4, b9Var9);
                                                                        frameLayout.addView(n3Var, c8.ma.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        q9 q9Var3 = new q9(context3);
                                                                        b9 b9Var10 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                        b9Var10.q(chat4);
                                                                        q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                        q9Var3.f(chat4, b9Var10);
                                                                        frameLayout.addView(q9Var3, c8.ma.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                        org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder2.a;
                                                                        u1Var5.P0 = -1.0f;
                                                                        u1Var5.W = frameLayout;
                                                                        u1Var5.S = org.telegram.messenger.gd.M0(V ? 2131748808 : 2131748800, null);
                                                                        u1Var5.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, V ? 2131748809 : 2131748801, org.telegram.messenger.o10.q(user4), chat4.title));
                                                                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131754208, null), new b0(m0Var, 4));
                                                                        alertDialog$Builder2.i(org.telegram.messenger.gd.M0(2131752578, null), null);
                                                                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(V ? 2131748812 : 2131748798, null), new b0(z1Var, 5));
                                                                        u1Var5.show();
                                                                        View d = u1Var5.d(-1);
                                                                        if (d instanceof TextView) {
                                                                            org.telegram.ui.ActionBar.u6.U((TextView) d, org.telegram.ui.ActionBar.n6.q7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            lrVar2 = lrVar2;
                                                        }
                                                        if (!z26 && !zArr2[0]) {
                                                            z27 = false;
                                                        }
                                                        lrVar2.d(z27);
                                                    }
                                                });
                                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                                h2Var.showDialog(u1Var32);
                                                textView = (TextView) u1Var32.d(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z18 = false;
                                        }
                                        org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(1, parentActivity, i6Var);
                                        c2VarArr[0] = c2Var3;
                                        c2Var3.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                                        if (!z18) {
                                            if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                                                c2VarArr[0].e(org.telegram.messenger.gd.M0(2131751525, null), "", false, false, false);
                                            } else {
                                                c2VarArr[0].e(org.telegram.messenger.gd.M0(2131751546, null), "", false, false, false);
                                            }
                                            z20 = true;
                                        } else if (z10) {
                                            z20 = true;
                                            c2VarArr[0].e(org.telegram.messenger.gd.a0(null, null, 2131752069, org.telegram.messenger.o10.k(user, true)), "", false, false, false);
                                        } else {
                                            z20 = true;
                                            c2VarArr[0].e(org.telegram.messenger.gd.a0(null, null, 2131751514, org.telegram.messenger.o10.k(user, true)), "", false, false, false);
                                        }
                                        c2VarArr[0].setMultiline(z20);
                                        b9Var3 = b9Var2;
                                        c2VarArr[0].setPadding(!org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                        m3Var.addView(c2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        org.telegram.ui.yn ynVar = new org.telegram.ui.yn(z18, chat, alertDialog$Builder, zArr);
                                        c2VarArr[0].setOnClickListener(new ni.b(24, zArr, ynVar));
                                        if (z14) {
                                            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var4.c(true, false);
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
                                        org.telegram.ui.ActionBar.u1 u1Var322 = u1Var;
                                        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.u2
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i7) {
                                                boolean z25 = z2422;
                                                final boolean z26 = z11;
                                                final boolean[] zArr2 = zArr;
                                                final org.telegram.messenger.lr lrVar2 = lrVar;
                                                boolean z27 = true;
                                                if (!z25 && !z26 && !z12) {
                                                    final TLRPC.User user2 = user;
                                                    boolean C = org.telegram.messenger.o10.C(user2);
                                                    final org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                                                    final boolean z28 = z10;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z29 = z13;
                                                    final boolean z30 = z15;
                                                    final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                                    if (C) {
                                                        b5.s(h2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, lrVar2, i6Var2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        org.telegram.messenger.tr a04 = org.telegram.messenger.tr.a0(h2Var2.getCurrentAccount());
                                                        a04.a.c(new org.telegram.messenger.zq(a04, user2.id, new org.telegram.messenger.nr() { // from class: org.telegram.ui.Components.o1
                                                            @Override // org.telegram.messenger.nr
                                                            public final void a(int i10) {
                                                                boolean[] zArr3 = zArr2;
                                                                org.telegram.messenger.lr lrVar3 = lrVar2;
                                                                if (i10 >= 50) {
                                                                    b5.s(org.telegram.ui.ActionBar.h2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, lrVar3, i6Var2);
                                                                } else if (lrVar3 != null) {
                                                                    lrVar3.d(zArr3[0]);
                                                                }
                                                            }
                                                        }, 0));
                                                        return;
                                                    }
                                                    if (org.telegram.messenger.v3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                        h.d();
                                                        TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                        tL_messages_getFutureChatCreatorAfterLeave.peer = org.telegram.messenger.mp.n1(chat3);
                                                        final int i10 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                        d3.b bVar = new d3.b(1);
                                                        final Context context = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, bVar, new org.telegram.messenger.q10() { // from class: org.telegram.ui.Components.p1
                                                            @Override // org.telegram.messenger.q10
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                vf.b.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                org.telegram.messenger.lr lrVar3 = lrVar2;
                                                                if (user4 == null) {
                                                                    lrVar3.d(z26 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Context context2 = context;
                                                                TLRPC.Chat chat4 = chat3;
                                                                bg.m0 m0Var = new bg.m0(context2, chat4, user4, i10, lrVar3, i6Var2, 7);
                                                                z1 z1Var = new z1(lrVar3, 0);
                                                                org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
                                                                if (h2Var3 == null || h2Var3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context3 = h2Var3.getContext();
                                                                TLRPC.User f12 = org.telegram.messenger.j10.i(h2Var3.getCurrentAccount()).f();
                                                                boolean V = org.telegram.messenger.v3.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                q9 q9Var2 = new q9(context3);
                                                                b9 b9Var8 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                b9Var8.r(f12);
                                                                q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                q9Var2.f(f12, b9Var8);
                                                                frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context3);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.d7, h2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                n3 n3Var = new n3(context3);
                                                                b9 b9Var9 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                b9Var9.r(user4);
                                                                n3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                n3Var.f(user4, b9Var9);
                                                                frameLayout.addView(n3Var, c8.ma.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                q9 q9Var3 = new q9(context3);
                                                                b9 b9Var10 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                                b9Var10.q(chat4);
                                                                q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                q9Var3.f(chat4, b9Var10);
                                                                frameLayout.addView(q9Var3, c8.ma.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder2.a;
                                                                u1Var5.P0 = -1.0f;
                                                                u1Var5.W = frameLayout;
                                                                u1Var5.S = org.telegram.messenger.gd.M0(V ? 2131748808 : 2131748800, null);
                                                                u1Var5.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, V ? 2131748809 : 2131748801, org.telegram.messenger.o10.q(user4), chat4.title));
                                                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131754208, null), new b0(m0Var, 4));
                                                                alertDialog$Builder2.i(org.telegram.messenger.gd.M0(2131752578, null), null);
                                                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(V ? 2131748812 : 2131748798, null), new b0(z1Var, 5));
                                                                u1Var5.show();
                                                                View d = u1Var5.d(-1);
                                                                if (d instanceof TextView) {
                                                                    org.telegram.ui.ActionBar.u6.U((TextView) d, org.telegram.ui.ActionBar.n6.q7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    lrVar2 = lrVar2;
                                                }
                                                if (!z26 && !zArr2[0]) {
                                                    z27 = false;
                                                }
                                                lrVar2.d(z27);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                        h2Var.showDialog(u1Var322);
                                        textView = (TextView) u1Var322.d(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        u1Var = u1Var2;
                                        b9Var2 = b9Var;
                                    }
                                } else {
                                    u1Var = u1Var2;
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
                                org.telegram.ui.Cells.c2 c2Var32 = new org.telegram.ui.Cells.c2(1, parentActivity, i6Var);
                                c2VarArr[0] = c2Var32;
                                c2Var32.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                                if (!z18) {
                                }
                                c2VarArr[0].setMultiline(z20);
                                b9Var3 = b9Var2;
                                c2VarArr[0].setPadding(!org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                m3Var.addView(c2VarArr[0], c8.ma.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                org.telegram.ui.yn ynVar2 = new org.telegram.ui.yn(z18, chat, alertDialog$Builder, zArr);
                                c2VarArr[0].setOnClickListener(new ni.b(24, zArr, ynVar2));
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
                                org.telegram.ui.ActionBar.u1 u1Var3222 = u1Var;
                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.u2
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i7) {
                                        boolean z25 = z24222;
                                        final boolean z26 = z11;
                                        final boolean[] zArr2 = zArr;
                                        final org.telegram.messenger.lr lrVar2 = lrVar;
                                        boolean z27 = true;
                                        if (!z25 && !z26 && !z12) {
                                            final TLRPC.User user2 = user;
                                            boolean C = org.telegram.messenger.o10.C(user2);
                                            final org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                                            final boolean z28 = z10;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z29 = z13;
                                            final boolean z30 = z15;
                                            final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                            if (C) {
                                                b5.s(h2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, lrVar2, i6Var2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                org.telegram.messenger.tr a04 = org.telegram.messenger.tr.a0(h2Var2.getCurrentAccount());
                                                a04.a.c(new org.telegram.messenger.zq(a04, user2.id, new org.telegram.messenger.nr() { // from class: org.telegram.ui.Components.o1
                                                    @Override // org.telegram.messenger.nr
                                                    public final void a(int i10) {
                                                        boolean[] zArr3 = zArr2;
                                                        org.telegram.messenger.lr lrVar3 = lrVar2;
                                                        if (i10 >= 50) {
                                                            b5.s(org.telegram.ui.ActionBar.h2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, lrVar3, i6Var2);
                                                        } else if (lrVar3 != null) {
                                                            lrVar3.d(zArr3[0]);
                                                        }
                                                    }
                                                }, 0));
                                                return;
                                            }
                                            if (org.telegram.messenger.v3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                h.d();
                                                TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                tL_messages_getFutureChatCreatorAfterLeave.peer = org.telegram.messenger.mp.n1(chat3);
                                                final int i10 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                d3.b bVar = new d3.b(1);
                                                final Context context = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, bVar, new org.telegram.messenger.q10() { // from class: org.telegram.ui.Components.p1
                                                    @Override // org.telegram.messenger.q10
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        vf.b.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        org.telegram.messenger.lr lrVar3 = lrVar2;
                                                        if (user4 == null) {
                                                            lrVar3.d(z26 || zArr2[0]);
                                                            return;
                                                        }
                                                        Context context2 = context;
                                                        TLRPC.Chat chat4 = chat3;
                                                        bg.m0 m0Var = new bg.m0(context2, chat4, user4, i10, lrVar3, i6Var2, 7);
                                                        z1 z1Var = new z1(lrVar3, 0);
                                                        org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
                                                        if (h2Var3 == null || h2Var3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context3 = h2Var3.getContext();
                                                        TLRPC.User f12 = org.telegram.messenger.j10.i(h2Var3.getCurrentAccount()).f();
                                                        boolean V = org.telegram.messenger.v3.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        q9 q9Var2 = new q9(context3);
                                                        b9 b9Var8 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                        b9Var8.r(f12);
                                                        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        q9Var2.f(f12, b9Var8);
                                                        frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context3);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.d7, h2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        n3 n3Var = new n3(context3);
                                                        b9 b9Var9 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                        b9Var9.r(user4);
                                                        n3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        n3Var.f(user4, b9Var9);
                                                        frameLayout.addView(n3Var, c8.ma.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        q9 q9Var3 = new q9(context3);
                                                        b9 b9Var10 = new b9((org.telegram.ui.ActionBar.i6) null);
                                                        b9Var10.q(chat4);
                                                        q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                        q9Var3.f(chat4, b9Var10);
                                                        frameLayout.addView(q9Var3, c8.ma.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                        org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder2.a;
                                                        u1Var5.P0 = -1.0f;
                                                        u1Var5.W = frameLayout;
                                                        u1Var5.S = org.telegram.messenger.gd.M0(V ? 2131748808 : 2131748800, null);
                                                        u1Var5.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, V ? 2131748809 : 2131748801, org.telegram.messenger.o10.q(user4), chat4.title));
                                                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131754208, null), new b0(m0Var, 4));
                                                        alertDialog$Builder2.i(org.telegram.messenger.gd.M0(2131752578, null), null);
                                                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(V ? 2131748812 : 2131748798, null), new b0(z1Var, 5));
                                                        u1Var5.show();
                                                        View d = u1Var5.d(-1);
                                                        if (d instanceof TextView) {
                                                            org.telegram.ui.ActionBar.u6.U((TextView) d, org.telegram.ui.ActionBar.n6.q7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            lrVar2 = lrVar2;
                                        }
                                        if (!z26 && !zArr2[0]) {
                                            z27 = false;
                                        }
                                        lrVar2.d(z27);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                h2Var.showDialog(u1Var3222);
                                textView = (TextView) u1Var3222.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.u1 s0(org.telegram.ui.ActionBar.h2 h2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
                                TextView textView;
                                org.telegram.ui.ActionBar.u1 M = M(h2Var.getContext(), h2Var.getResourceProvider(), str, charSequence, str2, runnable);
                                h2Var.showDialog(M);
                                if (z10 && (textView = (TextView) M.d(-1)) != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                }
                                return M;
                            }

                            public static org.telegram.ui.ActionBar.u1 t(Activity activity, final long j3, final long j10, final int i7, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
                                int i10;
                                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g7;
                                final String v = org.telegram.messenger.xs.v(j3, j10, false);
                                if (j3 != 0) {
                                    StringBuilder sb2 = new StringBuilder("color_");
                                    sb2.append(v);
                                    i10 = sharedPreferences.contains(sb2.toString()) ? org.telegram.messenger.f3.c("color_", v, sharedPreferences, -16776961) : org.telegram.messenger.n5.z(j3) ? sharedPreferences.getInt("GroupLed", -16776961) : sharedPreferences.getInt("MessagesLed", -16776961);
                                } else {
                                    i10 = i7 == 1 ? sharedPreferences.getInt("MessagesLed", -16776961) : i7 == 0 ? sharedPreferences.getInt("GroupLed", -16776961) : i7 == 3 ? sharedPreferences.getInt("StoriesLed", -16776961) : (i7 == 5 || i7 == 4) ? sharedPreferences.getInt("ReactionsLed", -16776961) : sharedPreferences.getInt("ChannelLed", -16776961);
                                }
                                LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
                                String[] strArr = {org.telegram.messenger.gd.M0(2131752001, null), org.telegram.messenger.gd.M0(2131752006, null), org.telegram.messenger.gd.M0(2131751995, null), org.telegram.messenger.gd.M0(2131752007, null), org.telegram.messenger.gd.M0(2131752008, null), org.telegram.messenger.gd.M0(2131752009, null), org.telegram.messenger.gd.M0(2131751997, null), org.telegram.messenger.gd.M0(2131752002, null), org.telegram.messenger.gd.M0(2131751996, null)};
                                final int[] iArr = {i10};
                                for (int i11 = 0; i11 < 9; i11++) {
                                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
                                    j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    j6Var.setTag(Integer.valueOf(i11));
                                    int i12 = org.telegram.ui.Cells.t8.e[i11];
                                    j6Var.a(i12, i12);
                                    j6Var.b(strArr[i11], i10 == org.telegram.ui.Cells.t8.f[i11]);
                                    f10.addView(j6Var);
                                    j6Var.setOnClickListener(new u1(f10, iArr));
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
                                String M0 = org.telegram.messenger.gd.M0(2131748797, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                alertDialog$Builder.o(f10);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745355, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.v2
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                                        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g7.edit();
                                        long j11 = j3;
                                        int[] iArr2 = iArr;
                                        if (j11 != 0) {
                                            edit.putInt(p5.c.k("color_", v), iArr2[0]);
                                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).l(j11, j10);
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
                                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).m(i14);
                                        }
                                        edit.commit();
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                        }
                                    }
                                });
                                alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131748796, null), new c4.n(j3, i7, runnable, 4));
                                if (j3 != 0) {
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751589, null), new g2(4, v, runnable));
                                }
                                return u1Var;
                            }

                            public static void t0(String str, org.telegram.ui.ActionBar.h2 h2Var) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((h2Var == null || h2Var.getParentActivity() == null) ? org.telegram.messenger.t0.b : h2Var.getParentActivity(), str, 1).show();
                            }

                            public static void u(org.telegram.ui.ActionBar.h2 h2Var, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
                                String M0 = org.telegram.messenger.gd.M0(2131751777, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                u1Var.U = org.telegram.messenger.gd.a0("ContactNotRegistered", null, 2131751778, org.telegram.messenger.i5.m(0, str, str2));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131748982, null), new g2(1, str3, h2Var));
                                h2Var.showDialog(u1Var);
                            }

                            public static org.telegram.ui.ActionBar.u1 u0(Context context, String str, boolean z10) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                u1Var.U = str;
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                                if (z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131743584, null), new t0(context, 1));
                                }
                                return alertDialog$Builder.p();
                            }

                            public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.nr nrVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i7 = org.telegram.ui.ActionBar.n6.L5;
                                final int i10 = 0;
                                alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
                                alertDialog$Builder.n(i7, null);
                                alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751763, null));
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751762, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.x2
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i11) {
                                        switch (i10) {
                                            case 0:
                                                nrVar.a(1);
                                                break;
                                            default:
                                                nrVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                final int i11 = 1;
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.x2
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i112) {
                                        switch (i11) {
                                            case 0:
                                                nrVar.a(1);
                                                break;
                                            default:
                                                nrVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, sb0Var2.getValue());
                                calendar.set(1, sb0Var3.getValue());
                                sb0Var.setMinValue(1);
                                sb0Var.setMaxValue(calendar.getActualMaximum(5));
                            }

                            public static AlertDialog$Builder w(Context context, int i7, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, ai.r1 r1Var) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final sb0 sb0Var = new sb0(context, null);
                                final sb0 sb0Var2 = new sb0(context, null);
                                final sb0 sb0Var3 = new sb0(context, null);
                                linearLayout.addView(sb0Var2, c8.ma.l(0.3f, 0, -2));
                                final int i15 = 0;
                                sb0Var2.setOnScrollListener(new pb0() { // from class: org.telegram.ui.Components.a2
                                    @Override // org.telegram.ui.Components.pb0
                                    public final void i(int i16) {
                                        switch (i15) {
                                            case 0:
                                                if (z10 && i16 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i16 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i16 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                sb0Var.setMinValue(0);
                                sb0Var.setMaxValue(11);
                                linearLayout.addView(sb0Var, c8.ma.l(0.3f, 0, -2));
                                sb0Var.setFormatter(new org.telegram.ui.cr(18));
                                sb0Var.setOnValueChangedListener(new b2(sb0Var2, sb0Var, sb0Var3, 0));
                                final int i16 = 1;
                                sb0Var.setOnScrollListener(new pb0() { // from class: org.telegram.ui.Components.a2
                                    @Override // org.telegram.ui.Components.pb0
                                    public final void i(int i162) {
                                        switch (i16) {
                                            case 0:
                                                if (z10 && i162 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i162 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i162 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i17 = calendar.get(1);
                                sb0Var3.setMinValue(i7 + i17);
                                sb0Var3.setMaxValue(i10 + i17);
                                sb0Var3.setValue(i17 + i11);
                                linearLayout.addView(sb0Var3, c8.ma.l(0.4f, 0, -2));
                                sb0Var3.setOnValueChangedListener(new b2(sb0Var2, sb0Var, sb0Var3, 1));
                                final int i18 = 2;
                                sb0Var3.setOnScrollListener(new pb0() { // from class: org.telegram.ui.Components.a2
                                    @Override // org.telegram.ui.Components.pb0
                                    public final void i(int i162) {
                                        switch (i18) {
                                            case 0:
                                                if (z10 && i162 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i162 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i162 == 0) {
                                                    b5.d(sb0Var2, sb0Var, sb0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                v0(sb0Var2, sb0Var, sb0Var3);
                                if (z10) {
                                    d(sb0Var2, sb0Var, sb0Var3);
                                }
                                if (i12 != -1) {
                                    sb0Var2.setValue(i12);
                                    sb0Var.setValue(i13);
                                    sb0Var3.setValue(i14);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.S = str;
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745355, null), new org.telegram.ui.zl(z10, sb0Var2, sb0Var, sb0Var3, r1Var));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                return alertDialog$Builder;
                            }

                            public static void x(Context context, String str, String str2, long j3, z4 z4Var) {
                                if (context == null) {
                                    return;
                                }
                                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.j5, false);
                                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
                                org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
                                org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
                                org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
                                org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
                                org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i6, false);
                                int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
                                int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
                                int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
                                hi.w4 w4Var = new hi.w4(context, (org.telegram.ui.ActionBar.i6) null);
                                ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
                                sb0 sb0Var = new sb0(context, null);
                                sb0Var.setTextColor(x02);
                                sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                sb0Var.setItemCount(5);
                                a4 a4Var = new a4(context, null);
                                a4Var.setItemCount(5);
                                a4Var.setTextColor(x02);
                                a4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                b4 b4Var = new b4(context, null);
                                b4Var.setItemCount(5);
                                b4Var.setTextColor(x02);
                                b4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                                sb0 sb0Var2 = sb0Var;
                                v3 v3Var = new v3(context, sb0Var2, a4Var, b4Var, 2);
                                v3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                v3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
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
                                v3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                di.xb xbVar = new di.xb(context, 15);
                                linearLayout.addView(sb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                                sb0Var2.setMinValue(0);
                                sb0Var2.setMaxValue(365);
                                sb0Var2.setWrapSelectorWheel(false);
                                int i7 = 21;
                                sb0Var2.setFormatter(new org.telegram.ui.cr(i7));
                                a3.h hVar = new a3.h(sb0Var2, a4Var, b4Var, i7);
                                sb0Var2.setOnValueChangedListener(hVar);
                                a4Var.setMinValue(0);
                                a4Var.setMaxValue(23);
                                linearLayout.addView(a4Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ks.t4));
                                a4Var.setFormatter(new org.telegram.ui.cr(22));
                                a4Var.setOnValueChangedListener(hVar);
                                b4Var.setMinValue(0);
                                b4Var.setMaxValue(59);
                                b4Var.setValue(0);
                                b4Var.setFormatter(new org.telegram.ui.cr(23));
                                linearLayout.addView(b4Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ks.t4));
                                b4Var.setOnValueChangedListener(hVar);
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
                                        b4Var.setValue(calendar.get(12));
                                        a4Var.setValue(calendar.get(11));
                                        sb0Var2 = sb0Var2;
                                        sb0Var2.setValue(timeInMillis);
                                    } else {
                                        sb0Var2 = sb0Var2;
                                    }
                                }
                                g(null, null, 0L, 0L, 0, sb0Var2, a4Var, b4Var);
                                xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                xbVar.setGravity(17);
                                xbVar.setTextColor(x04);
                                xbVar.setTextSize(1, 14.0f);
                                xbVar.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x05, x06, x06));
                                xbVar.setText(str2);
                                v3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                                xbVar.setOnClickListener(new v1(sb0Var2, a4Var, b4Var, calendar, z4Var, w4Var, 1));
                                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.b;
                                x2Var.O = v3Var;
                                x2Var.show();
                                x2Var.v0(x03);
                                x2Var.P(x03);
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
                            /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.String, org.telegram.ui.ActionBar.i6, org.telegram.ui.ActionBar.r1] */
                            /* JADX WARN: Type inference failed for: r8v41 */
                            /* JADX WARN: Type inference failed for: r8v65 */
                            /* JADX WARN: Type inference failed for: r8v66 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void y(final org.telegram.ui.ActionBar.h2 h2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j3, final org.telegram.messenger.fj fjVar, final SparseArray[] sparseArrayArr, final org.telegram.messenger.aj ajVar, final int i7, final int i10, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.i6 i6Var) {
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
                                org.telegram.ui.ActionBar.u1 u1Var;
                                int i14;
                                boolean z18;
                                boolean z19;
                                boolean z20;
                                org.telegram.ui.Cells.c2 c2Var;
                                String str;
                                int i15;
                                int i16;
                                TLRPC.MessageAction messageAction;
                                final boolean z21;
                                int i17;
                                org.telegram.ui.ActionBar.u1 u1Var2;
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
                                org.telegram.messenger.fj fjVar2 = fjVar;
                                boolean z24 = i10 == 1;
                                boolean z25 = i10 == 3;
                                if (h2Var == null) {
                                    return;
                                }
                                if ((user == null && chat == null && encryptedChat == null) || (parentActivity = h2Var.getParentActivity()) == null) {
                                    return;
                                }
                                final int currentAccount = h2Var.getCurrentAccount();
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, i6Var);
                                float f10 = runnable2 != null ? 0.5f : 0.6f;
                                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                                u1Var3.R0 = f10;
                                int size = ajVar != null ? ajVar.d.size() : fjVar2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                if (encryptedChat != null) {
                                    z10 = z25;
                                    j10 = org.telegram.messenger.n5.F(encryptedChat.id);
                                } else {
                                    z10 = z25;
                                    j10 = user != null ? user.id : -chat.id;
                                }
                                if (z24) {
                                    if (fjVar2 == null || (message = fjVar2.k) == null || (i23 = message.schedule_repeat_period) <= 0) {
                                        if (ajVar != null) {
                                            ArrayList arrayList = ajVar.d;
                                            if (!arrayList.isEmpty() && arrayList.get(0) != null && ((org.telegram.messenger.fj) arrayList.get(0)).k != null && ((org.telegram.messenger.fj) arrayList.get(0)).k.schedule_repeat_period > 0) {
                                                int i24 = ((org.telegram.messenger.fj) arrayList.get(0)).k.date;
                                                i22 = ((org.telegram.messenger.fj) arrayList.get(0)).k.schedule_repeat_period;
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
                                        String a02 = org.telegram.messenger.gd.a0(null, null, 2131748325, Integer.valueOf(i22));
                                        if (i22 == 31536000) {
                                            a02 = org.telegram.messenger.gd.M0(2131748321, null);
                                        } else if (i22 >= 2592000) {
                                            a02 = org.telegram.messenger.gd.G(i22 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                        } else if (i22 >= 604800) {
                                            a02 = org.telegram.messenger.gd.G(i22 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                        } else if (i22 >= 86400) {
                                            a02 = org.telegram.messenger.gd.G(i22 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                        }
                                        String str4 = a02;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, parentActivity, i6Var);
                                        String M0 = org.telegram.messenger.gd.M0(2131748319, null);
                                        org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder3.a;
                                        u1Var4.S = M0;
                                        u1Var4.U = org.telegram.messenger.gd.M0(2131748320, null);
                                        final int i25 = i21;
                                        alertDialog$Builder3.h(str4, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.j3
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var5, int i26) {
                                                org.telegram.messenger.aj ajVar2 = org.telegram.messenger.aj.this;
                                                int i27 = currentAccount;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                                                int i28 = i25;
                                                int i29 = i22;
                                                if (ajVar2 != null) {
                                                    ArrayList arrayList2 = ajVar2.d;
                                                    if (!arrayList2.isEmpty()) {
                                                        org.telegram.messenger.zy.C(i27).u((org.telegram.messenger.fj) arrayList2.get(0), h2Var2, i28 + i29, i29);
                                                        return;
                                                    }
                                                }
                                                org.telegram.messenger.zy.C(i27).u(fjVar, h2Var2, i28 + i29, i29);
                                            }
                                        });
                                        final long j11 = j10;
                                        final boolean z26 = z10;
                                        alertDialog$Builder3.i(org.telegram.messenger.gd.M0(2131748332, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.u0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var5, int i26) {
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
                                                long e10 = z27 ? org.telegram.messenger.j10.i(i29).e() : j11;
                                                org.telegram.messenger.fj fjVar3 = fjVar;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j14 = j3;
                                                int i30 = i7;
                                                int i31 = i10;
                                                ArrayList arrayList5 = null;
                                                if (fjVar3 != null) {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    org.telegram.messenger.aj ajVar2 = ajVar;
                                                    if (ajVar2 != null) {
                                                        ArrayList arrayList7 = ajVar2.d;
                                                        int i32 = 0;
                                                        while (i32 < arrayList7.size()) {
                                                            org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) arrayList7.get(i32);
                                                            arrayList6.add(Integer.valueOf(fjVar4.e1()));
                                                            if (encryptedChat2 != null) {
                                                                arrayList4 = arrayList6;
                                                                if (fjVar4.k.random_id == 0 || fjVar4.D == 10) {
                                                                    i28 = i29;
                                                                    j13 = e10;
                                                                } else {
                                                                    if (arrayList5 == null) {
                                                                        arrayList5 = new ArrayList();
                                                                    }
                                                                    ArrayList arrayList8 = arrayList5;
                                                                    i28 = i29;
                                                                    j13 = e10;
                                                                    arrayList8.add(Long.valueOf(fjVar4.k.random_id));
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
                                                        arrayList6.add(Integer.valueOf(fjVar3.e1()));
                                                        if (encryptedChat2 != null && fjVar3.k.random_id != 0 && fjVar3.D != 10) {
                                                            ArrayList arrayList9 = new ArrayList();
                                                            arrayList9.add(Long.valueOf(fjVar3.k.random_id));
                                                            arrayList3 = arrayList9;
                                                            org.telegram.messenger.mp.u1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j14 == 0 && (peer = fjVar3.k.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i30, true, i31);
                                                        }
                                                    }
                                                    arrayList3 = arrayList5;
                                                    org.telegram.messenger.mp.u1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j14 == 0 && (peer = fjVar3.k.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i30, true, i31);
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
                                                                org.telegram.messenger.fj fjVar5 = (org.telegram.messenger.fj) sparseArrayArr2[i33].valueAt(i35);
                                                                long j16 = fjVar5.k.random_id;
                                                                if (j16 != 0 && fjVar5.D != 10) {
                                                                    arrayList11.add(Long.valueOf(j16));
                                                                }
                                                            }
                                                            arrayList2 = arrayList11;
                                                        } else {
                                                            arrayList2 = null;
                                                        }
                                                        org.telegram.messenger.mp.u1(i29).Z(arrayList10, arrayList2, encryptedChat2, (i33 != 1 || j14 == 0) ? j15 : j14, i30, true, i31);
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
                                        alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131752578, null), null);
                                        alertDialog$Builder3.d(-2);
                                        alertDialog$Builder3.d(-3);
                                        u1Var4.O = new v0(0, runnable2);
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                    fjVar2 = fjVar;
                                }
                                Runnable runnable3 = runnable2;
                                final int i26 = currentAccount;
                                int currentTime = ConnectionsManager.getInstance(i26).getCurrentTime();
                                org.telegram.messenger.mp.u1(i26).A7.i.n2(TimeUnit.SECONDS);
                                if (fjVar2 != null) {
                                    z12 = !fjVar2.T2() || Math.abs(currentTime - fjVar2.k.date) > 86400;
                                    if (fjVar2.Q3()) {
                                        TLRPC.Message message2 = fjVar2.k;
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
                                                org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) sparseArrayArr[i11].valueAt(i28);
                                                if (fjVar3.T2()) {
                                                    i12 = i28;
                                                } else {
                                                    i12 = i28;
                                                }
                                                z27 = true;
                                                if (fjVar3.Q3()) {
                                                    TLRPC.Message message3 = fjVar3.k;
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
                                if (ajVar != null) {
                                    ArrayList arrayList2 = ajVar.d;
                                    z15 = z13;
                                    z14 = z12;
                                    int i29 = 0;
                                    while (i29 < arrayList2.size()) {
                                        org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) arrayList2.get(i29);
                                        if (fjVar4.Q3()) {
                                            TLRPC.Message message4 = fjVar4.k;
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
                                boolean z29 = user != null && org.telegram.messenger.mp.u1(i26).f3;
                                int i30 = user != null ? org.telegram.messenger.mp.u1(i26).e3 : org.telegram.messenger.mp.u1(i26).d3;
                                if (encryptedChat == null && user != null && z29) {
                                    z16 = z29;
                                    if (i30 == Integer.MAX_VALUE) {
                                        z17 = true;
                                        if (chat != null || !chat.megagroup || z24 || z10) {
                                            i13 = i26;
                                            if (!z24 || z10 || org.telegram.messenger.v3.T(chat) || encryptedChat != null) {
                                                u1Var = u1Var3;
                                                i14 = 0;
                                                z18 = false;
                                            } else {
                                                if ((user == null || user.id == org.telegram.messenger.j10.i(i13).e() || (user.bot && !user.support)) && chat == null) {
                                                    i14 = 0;
                                                    z20 = false;
                                                } else if (fjVar2 != null) {
                                                    i14 = (fjVar2.n4() || !((messageAction = fjVar2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(fjVar2.N3() || z16 || org.telegram.messenger.v3.N(chat)) || currentTime - fjVar2.k.date > i30)) ? 0 : 1;
                                                    z20 = !fjVar2.N3();
                                                } else {
                                                    int i31 = 1;
                                                    z20 = false;
                                                    int i32 = 0;
                                                    while (i31 >= 0) {
                                                        int i33 = 0;
                                                        while (true) {
                                                            i16 = i31;
                                                            if (i33 < sparseArrayArr[i31].size()) {
                                                                org.telegram.messenger.fj fjVar5 = (org.telegram.messenger.fj) sparseArrayArr[i16].valueAt(i33);
                                                                int i34 = i33;
                                                                TLRPC.MessageAction messageAction3 = fjVar5.k.action;
                                                                boolean z30 = z20;
                                                                if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((fjVar5.N3() || z16 || (chat != null && org.telegram.messenger.v3.w(2, chat))) && currentTime - fjVar5.k.date <= i30)) {
                                                                    i32++;
                                                                    if (!z30 && !fjVar5.N3()) {
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
                                                if (i14 <= 0 || !z14 || (user != null && org.telegram.messenger.o10.y(user))) {
                                                    u1Var = u1Var3;
                                                    z18 = z20;
                                                } else {
                                                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                                                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(1, parentActivity, i6Var);
                                                    c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                                                    if (z17) {
                                                        c2Var = c2Var2;
                                                        c2Var.e(org.telegram.messenger.gd.a0("DeleteMessagesOptionAlso", null, 2131751514, org.telegram.messenger.o10.k(user, true)), "", false, false, false);
                                                    } else {
                                                        c2Var = c2Var2;
                                                        if (chat == null) {
                                                            str = null;
                                                            i15 = 2131751515;
                                                        } else if (z20 || i14 == size) {
                                                            c2Var.e(org.telegram.messenger.gd.M0(2131751529, null), "", false, false, false);
                                                        } else {
                                                            i15 = 2131751515;
                                                            str = null;
                                                        }
                                                        c2Var.e(org.telegram.messenger.gd.M0(i15, str), "", false, false, false);
                                                    }
                                                    org.telegram.ui.Cells.c2 c2Var3 = c2Var;
                                                    c2Var3.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    frameLayout.addView(c2Var3, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                    c2Var3.setOnClickListener(new f1(5, zArr));
                                                    alertDialog$Builder2.o(frameLayout);
                                                    u1Var3.H = 9;
                                                    u1Var = u1Var3;
                                                    z18 = z20;
                                                    z19 = true;
                                                }
                                            }
                                            z19 = false;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            if (fjVar2 != null) {
                                                TLRPC.MessageAction messageAction4 = fjVar2.k.action;
                                                if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                                                    if (ajVar != null) {
                                                        arrayList3.addAll(ajVar.d);
                                                    } else {
                                                        arrayList3.add(fjVar2);
                                                    }
                                                }
                                                i18 = (!fjVar2.n4() && org.telegram.messenger.fj.B0(fjVar2.k) == j3 && ((messageAction2 = fjVar2.k.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && fjVar2.N3() && currentTime - fjVar2.k.date <= i30) ? 1 : 0;
                                            } else {
                                                int i35 = 1;
                                                int i36 = 0;
                                                while (i35 >= 0) {
                                                    int i37 = i36;
                                                    int i38 = 0;
                                                    while (i38 < sparseArrayArr[i35].size()) {
                                                        org.telegram.messenger.fj fjVar6 = (org.telegram.messenger.fj) sparseArrayArr[i35].valueAt(i38);
                                                        int i39 = i38;
                                                        if (i35 == 1 && fjVar6.N3()) {
                                                            TLRPC.Message message5 = fjVar6.k;
                                                            i19 = i35;
                                                            if (message5.action == null && currentTime - message5.date <= i30) {
                                                                i37++;
                                                            }
                                                        } else {
                                                            i19 = i35;
                                                        }
                                                        arrayList3.add(fjVar6);
                                                        i38 = i39 + 1;
                                                        i35 = i19;
                                                    }
                                                    i35--;
                                                    i36 = i37;
                                                }
                                                i18 = i36;
                                            }
                                            int i40 = i18;
                                            ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new aa.m(6)).mapToLong(new org.telegram.messenger.ok(3)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.w0
                                                @Override // java.util.function.LongFunction
                                                public final Object apply(long j12) {
                                                    int i41 = i26;
                                                    return j12 > 0 ? org.telegram.messenger.mp.u1(i41).c2(Long.valueOf(j12)) : org.telegram.messenger.mp.u1(i41).O0(Long.valueOf(-j12));
                                                }
                                            }).filter(new aa.m(7)).filter(new org.telegram.ui.p8(org.telegram.messenger.j10.i(i26).e(), 2)).collect(Collectors.toCollection(new org.telegram.messenger.jk(1)));
                                            if (!arrayList4.isEmpty()) {
                                                if (channelParticipantArr != null) {
                                                    yr yrVar = new yr(h2Var, chat, arrayList3, arrayList4, channelParticipantArr, j3, i7, i10, false, runnable);
                                                    if (runnable3 != null) {
                                                        yrVar.I0 = new v0(2, runnable3);
                                                    }
                                                    yrVar.show();
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
                                                    tL_channels_getParticipant.channel = org.telegram.messenger.mp.k1(chat);
                                                    tL_channels_getParticipant.participant = org.telegram.messenger.mp.m1((TLObject) arrayList4.get(i41));
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i26);
                                                    ArrayList arrayList5 = arrayList4;
                                                    final int[] iArr3 = iArr2;
                                                    final Runnable runnable4 = runnable3;
                                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.x0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            final int[] iArr4 = iArr3;
                                                            final int[] iArr5 = iArr;
                                                            final int i42 = i41;
                                                            final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                                            final int i43 = size2;
                                                            final org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                                                            final org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                                                            final TLRPC.User user2 = user;
                                                            final TLRPC.Chat chat2 = chat;
                                                            final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                            final TLRPC.ChatFull chatFull2 = chatFull;
                                                            final long j12 = j3;
                                                            final org.telegram.messenger.fj fjVar7 = fjVar;
                                                            final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                                            final org.telegram.messenger.aj ajVar2 = ajVar;
                                                            final int i44 = i7;
                                                            final int i45 = i10;
                                                            final Runnable runnable5 = runnable;
                                                            final Runnable runnable6 = runnable4;
                                                            final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.y1
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
                                                                        b5.y(h2Var2, user2, chat2, encryptedChat2, chatFull2, j12, fjVar7, sparseArrayArr2, ajVar2, i44, i45, channelParticipantArr4, runnable5, runnable6, i6Var2);
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
                                                org.telegram.messenger.g0.h3(new ai.g1(u1VarArr, iArr, i26, runnable2, h2Var), 1000L);
                                                return;
                                            }
                                            i13 = i26;
                                            if (i40 <= 0 || !z14) {
                                                z23 = false;
                                            } else {
                                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                                org.telegram.ui.Cells.c2 c2Var4 = new org.telegram.ui.Cells.c2(1, parentActivity, i6Var);
                                                c2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                                                c2Var4.e(org.telegram.messenger.gd.M0(2131751515, null), "", false, false, false);
                                                c2Var4.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                frameLayout2.addView(c2Var4, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                c2Var4.setOnClickListener(new f1(4, zArr));
                                                alertDialog$Builder2.o(frameLayout2);
                                                u1Var3.H = 9;
                                                z23 = true;
                                            }
                                            u1Var = u1Var3;
                                            z19 = z23;
                                            i14 = i40;
                                            z18 = false;
                                        }
                                        org.telegram.ui.ActionBar.u1 u1Var5 = u1Var;
                                        int i43 = i14;
                                        final long j12 = j10;
                                        int i44 = size;
                                        boolean z31 = z11;
                                        final int i45 = i13;
                                        z21 = z10;
                                        org.telegram.ui.ActionBar.r1 r1Var = new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.k3
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
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var6, int i46) {
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
                                                long e10 = z32 ? org.telegram.messenger.j10.i(i50).e() : j12;
                                                org.telegram.messenger.fj fjVar7 = fjVar;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j17 = j3;
                                                int i51 = i7;
                                                boolean[] zArr2 = zArr;
                                                int i52 = i10;
                                                ArrayList arrayList9 = null;
                                                if (fjVar7 != null) {
                                                    ArrayList arrayList10 = new ArrayList();
                                                    ArrayList arrayList11 = new ArrayList();
                                                    org.telegram.messenger.aj ajVar2 = ajVar;
                                                    if (ajVar2 != null) {
                                                        ArrayList arrayList12 = ajVar2.d;
                                                        c10 = 0;
                                                        int i53 = 0;
                                                        while (i53 < arrayList12.size()) {
                                                            org.telegram.messenger.fj fjVar8 = (org.telegram.messenger.fj) arrayList12.get(i53);
                                                            int i54 = i50;
                                                            if (org.telegram.messenger.fj.c3(fjVar8.k)) {
                                                                arrayList10.add(fjVar8);
                                                            } else {
                                                                arrayList11.add(Integer.valueOf(fjVar8.e1()));
                                                                if (encryptedChat2 != null) {
                                                                    j16 = e10;
                                                                    if (fjVar8.k.random_id != 0 && fjVar8.D != 10) {
                                                                        if (arrayList9 == null) {
                                                                            arrayList9 = new ArrayList();
                                                                        }
                                                                        ArrayList arrayList13 = arrayList9;
                                                                        arrayList13.add(Long.valueOf(fjVar8.k.random_id));
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
                                                        if (org.telegram.messenger.fj.c3(fjVar7.k)) {
                                                            arrayList10.add(fjVar7);
                                                        } else {
                                                            arrayList11.add(Integer.valueOf(fjVar7.e1()));
                                                            if (encryptedChat2 != null && fjVar7.k.random_id != 0 && fjVar7.D != 10) {
                                                                ArrayList arrayList14 = new ArrayList();
                                                                arrayList14.add(Long.valueOf(fjVar7.k.random_id));
                                                                arrayList7 = arrayList14;
                                                                long j18 = (j17 == 0 && (peer = fjVar7.k.peer_id) != null && peer.chat_id == (-j17)) ? j17 : j13;
                                                                if (arrayList11.isEmpty()) {
                                                                    r32 = c10;
                                                                    arrayList8 = arrayList10;
                                                                    j14 = j18;
                                                                    i48 = 1;
                                                                    org.telegram.messenger.mp.u1(i47).Z(arrayList11, arrayList7, encryptedChat2, j14, i51, zArr2[c10], i52);
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
                                                                    org.telegram.messenger.fj fjVar9 = (org.telegram.messenger.fj) obj;
                                                                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i47);
                                                                    ArrayList arrayList15 = new ArrayList();
                                                                    arrayList15.add(Integer.valueOf(fjVar9.e1()));
                                                                    if (j14 == 0 || !org.telegram.messenger.n5.z(j14)) {
                                                                        j15 = 0;
                                                                    } else {
                                                                        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j14));
                                                                        j15 = org.telegram.messenger.v3.T(O0) ? O0.id : 0L;
                                                                    }
                                                                    u12.s3(arrayList15, j14);
                                                                    org.telegram.messenger.tr messagesStorage = u12.getMessagesStorage();
                                                                    int P0 = fjVar9.P0();
                                                                    messagesStorage.getClass();
                                                                    a0.h hVar = new a0.h(i48);
                                                                    ArrayList arrayList16 = new ArrayList(i48);
                                                                    arrayList16.add(Integer.valueOf(P0));
                                                                    hVar.k(arrayList16, j14);
                                                                    messagesStorage.I(new org.telegram.messenger.xf(messagesStorage, hVar, (boolean) r32, 3));
                                                                    u12.getMessagesStorage().P0(j14, arrayList15, true, true, org.telegram.messenger.fj.d5(fjVar9.k) ? 9 : r32, i51);
                                                                    u12.getMessagesStorage().R1(j14, j15, arrayList15, null);
                                                                    org.telegram.messenger.ks notificationCenter = u12.getNotificationCenter();
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
                                                                    notificationCenter.k(org.telegram.messenger.ks.w, objArr);
                                                                    if (!org.telegram.messenger.fj.d5(fjVar9.k) || fjVar9.b5()) {
                                                                        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                        tL_deleteMessage.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar9.k));
                                                                        TLRPC.Message message6 = fjVar9.k;
                                                                        tL_deleteMessage.receiver_id = u12.q1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                        tL_deleteMessage.id = fjVar9.P0();
                                                                        u12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
                                                                    } else {
                                                                        TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                        tL_deleteWelcomeMessage.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar9.k));
                                                                        tL_deleteWelcomeMessage.id = fjVar9.P0();
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
                                                                org.telegram.messenger.fj fjVar10 = (org.telegram.messenger.fj) sparseArrayArr2[i56].valueAt(i58);
                                                                int i59 = i55;
                                                                long j20 = fjVar10.k.random_id;
                                                                if (j20 != 0 && fjVar10.D != 10) {
                                                                    arrayList6.add(Long.valueOf(j20));
                                                                }
                                                                i58++;
                                                                i55 = i59;
                                                            }
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                        int i60 = i55;
                                                        org.telegram.messenger.mp.u1(i50).Z(arrayList17, arrayList6, encryptedChat2, (i56 != 1 || j17 == 0) ? j19 : j17, i51, zArr2[i60], i52);
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
                                            u1Var2 = u1Var5;
                                            str2 = null;
                                            if (i17 == 1) {
                                                u1Var2.S = org.telegram.messenger.gd.M0(2131751485, null);
                                            } else {
                                                u1Var2.S = org.telegram.messenger.gd.a0(null, null, 2131751508, org.telegram.messenger.gd.G(i17, "messages", new Object[0]));
                                            }
                                        } else {
                                            i17 = i44;
                                            if (i17 == 1) {
                                                str2 = null;
                                                u1Var2 = u1Var5;
                                                u1Var2.S = org.telegram.messenger.gd.M0(2131743599, null);
                                            } else {
                                                u1Var2 = u1Var5;
                                                str2 = null;
                                                u1Var2.S = org.telegram.messenger.gd.a0(null, null, 2131743600, org.telegram.messenger.gd.G(i17, "messages", new Object[0]));
                                            }
                                        }
                                        if (z21) {
                                            if (chat == null || !z18) {
                                                if (!z19 || z17 || i43 == i17) {
                                                    if (chat == null || !chat.megagroup || z24) {
                                                        if (i17 == 1) {
                                                            u1Var2.U = org.telegram.messenger.gd.M0(2131754091, null);
                                                        } else {
                                                            u1Var2.U = org.telegram.messenger.gd.M0(2131754099, null);
                                                        }
                                                    } else if (i17 == 1) {
                                                        u1Var2.U = org.telegram.messenger.gd.M0((fjVar == null || !org.telegram.messenger.fj.c3(fjVar.k)) ? 2131754090 : 2131754091, null);
                                                    } else {
                                                        u1Var2.U = org.telegram.messenger.gd.M0(2131754098, null);
                                                    }
                                                } else if (chat != null) {
                                                    u1Var2.U = org.telegram.messenger.gd.a0("DeleteMessagesTextGroup", null, 2131751510, org.telegram.messenger.gd.G(i43, "messages", new Object[0]));
                                                } else {
                                                    u1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("DeleteMessagesText", null, 2131751511, org.telegram.messenger.gd.G(i43, "messages", new Object[0]), org.telegram.messenger.o10.k(user, true)));
                                                }
                                            } else if (z19 && i43 != i17) {
                                                u1Var2.U = org.telegram.messenger.gd.a0(null, null, 2131751509, org.telegram.messenger.gd.G(i43, "messages", new Object[0]));
                                            } else if (i17 == 1) {
                                                u1Var2.U = org.telegram.messenger.gd.M0(2131754091, null);
                                            } else {
                                                u1Var2.U = org.telegram.messenger.gd.M0(2131754099, null);
                                            }
                                        } else if (i17 == 1) {
                                            u1Var2.U = org.telegram.messenger.gd.M0(2131754061, str2);
                                        } else {
                                            u1Var2.U = org.telegram.messenger.gd.M0(2131754062, str2);
                                        }
                                        if (fjVar == null) {
                                            z22 = fjVar.u3() && !org.telegram.messenger.fj.l3(fjVar.k);
                                            if (z22) {
                                                long j13 = ((TLRPC.TL_messageMediaGiveaway) fjVar.k.media).until_date * 1000;
                                                str3 = org.telegram.messenger.gd.E0().u0().format(new Date(j13));
                                                z22 = System.currentTimeMillis() < j13;
                                            }
                                            str3 = null;
                                        } else if (i17 == 1) {
                                            boolean z32 = false;
                                            str3 = null;
                                            for (int i46 = 1; i46 >= 0; i46--) {
                                                for (int i47 = 0; i47 < sparseArrayArr[i46].size(); i47++) {
                                                    org.telegram.messenger.fj fjVar7 = (org.telegram.messenger.fj) sparseArrayArr[i46].valueAt(i47);
                                                    boolean z33 = fjVar7.u3() && !org.telegram.messenger.fj.l3(fjVar7.k);
                                                    if (z33) {
                                                        long j14 = ((TLRPC.TL_messageMediaGiveaway) fjVar7.k.media).until_date * 1000;
                                                        str3 = org.telegram.messenger.gd.E0().u0().format(new Date(j14));
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
                                                int n22 = (int) org.telegram.messenger.mp.u1(i45).A7.i.n2(TimeUnit.HOURS);
                                                u1Var2.S = org.telegram.messenger.gd.M0(2131744099, null);
                                                u1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744098, Integer.valueOf(n22)));
                                                alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131744101, null), r1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else if (!z22 || z21) {
                                                alertDialog$Builder4.k(org.telegram.messenger.gd.M0(z21 ? 2131746126 : 2131751587, null), r1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else {
                                                u1Var2.S = org.telegram.messenger.gd.M0(2131753477, null);
                                                u1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131753478, str3));
                                                alertDialog$Builder4.i(org.telegram.messenger.gd.M0(2131751587, null), r1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            }
                                        } else {
                                            int n23 = (int) org.telegram.messenger.mp.u1(i45).A7.i.n2(TimeUnit.HOURS);
                                            r82 = 0;
                                            u1Var2.S = org.telegram.messenger.gd.M0(2131744102, null);
                                            u1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744100, Integer.valueOf(n23)));
                                            AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder2;
                                            alertDialog$Builder5.k(org.telegram.messenger.gd.M0(2131744101, null), r1Var);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        }
                                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, r82), r82);
                                        u1Var2.O = new v0(3, runnable2);
                                        h2Var.showDialog(u1Var2);
                                        textView = (TextView) u1Var2.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, r82);
                                        }
                                        textView2 = (TextView) u1Var2.d(-3);
                                        if (textView2 == null) {
                                            u1Var2.u0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f));
                                            ((ViewGroup.MarginLayoutParams) u1Var2.u0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-8.0f);
                                            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, null);
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
                                u1Var = u1Var3;
                                i14 = 0;
                                z18 = false;
                                z19 = false;
                                org.telegram.ui.ActionBar.u1 u1Var52 = u1Var;
                                int i432 = i14;
                                final long j122 = j10;
                                int i442 = size;
                                boolean z312 = z11;
                                final int i452 = i13;
                                z21 = z10;
                                org.telegram.ui.ActionBar.r1 r1Var2 = new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.k3
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
                                    public final void h(org.telegram.ui.ActionBar.u1 u1Var6, int i462) {
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
                                        long e10 = z322 ? org.telegram.messenger.j10.i(i50).e() : j122;
                                        org.telegram.messenger.fj fjVar72 = fjVar;
                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                        long j17 = j3;
                                        int i51 = i7;
                                        boolean[] zArr2 = zArr;
                                        int i52 = i10;
                                        ArrayList arrayList9 = null;
                                        if (fjVar72 != null) {
                                            ArrayList arrayList10 = new ArrayList();
                                            ArrayList arrayList11 = new ArrayList();
                                            org.telegram.messenger.aj ajVar2 = ajVar;
                                            if (ajVar2 != null) {
                                                ArrayList arrayList12 = ajVar2.d;
                                                c10 = 0;
                                                int i53 = 0;
                                                while (i53 < arrayList12.size()) {
                                                    org.telegram.messenger.fj fjVar8 = (org.telegram.messenger.fj) arrayList12.get(i53);
                                                    int i54 = i50;
                                                    if (org.telegram.messenger.fj.c3(fjVar8.k)) {
                                                        arrayList10.add(fjVar8);
                                                    } else {
                                                        arrayList11.add(Integer.valueOf(fjVar8.e1()));
                                                        if (encryptedChat2 != null) {
                                                            j16 = e10;
                                                            if (fjVar8.k.random_id != 0 && fjVar8.D != 10) {
                                                                if (arrayList9 == null) {
                                                                    arrayList9 = new ArrayList();
                                                                }
                                                                ArrayList arrayList13 = arrayList9;
                                                                arrayList13.add(Long.valueOf(fjVar8.k.random_id));
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
                                                if (org.telegram.messenger.fj.c3(fjVar72.k)) {
                                                    arrayList10.add(fjVar72);
                                                } else {
                                                    arrayList11.add(Integer.valueOf(fjVar72.e1()));
                                                    if (encryptedChat2 != null && fjVar72.k.random_id != 0 && fjVar72.D != 10) {
                                                        ArrayList arrayList14 = new ArrayList();
                                                        arrayList14.add(Long.valueOf(fjVar72.k.random_id));
                                                        arrayList7 = arrayList14;
                                                        long j18 = (j17 == 0 && (peer = fjVar72.k.peer_id) != null && peer.chat_id == (-j17)) ? j17 : j132;
                                                        if (arrayList11.isEmpty()) {
                                                            r32 = c10;
                                                            arrayList8 = arrayList10;
                                                            j142 = j18;
                                                            i48 = 1;
                                                            org.telegram.messenger.mp.u1(i472).Z(arrayList11, arrayList7, encryptedChat2, j142, i51, zArr2[c10], i52);
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
                                                            org.telegram.messenger.fj fjVar9 = (org.telegram.messenger.fj) obj;
                                                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i472);
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(Integer.valueOf(fjVar9.e1()));
                                                            if (j142 == 0 || !org.telegram.messenger.n5.z(j142)) {
                                                                j15 = 0;
                                                            } else {
                                                                TLRPC.Chat O0 = u12.O0(Long.valueOf(-j142));
                                                                j15 = org.telegram.messenger.v3.T(O0) ? O0.id : 0L;
                                                            }
                                                            u12.s3(arrayList15, j142);
                                                            org.telegram.messenger.tr messagesStorage = u12.getMessagesStorage();
                                                            int P0 = fjVar9.P0();
                                                            messagesStorage.getClass();
                                                            a0.h hVar = new a0.h(i48);
                                                            ArrayList arrayList16 = new ArrayList(i48);
                                                            arrayList16.add(Integer.valueOf(P0));
                                                            hVar.k(arrayList16, j142);
                                                            messagesStorage.I(new org.telegram.messenger.xf(messagesStorage, hVar, (boolean) r32, 3));
                                                            u12.getMessagesStorage().P0(j142, arrayList15, true, true, org.telegram.messenger.fj.d5(fjVar9.k) ? 9 : r32, i51);
                                                            u12.getMessagesStorage().R1(j142, j15, arrayList15, null);
                                                            org.telegram.messenger.ks notificationCenter = u12.getNotificationCenter();
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
                                                            notificationCenter.k(org.telegram.messenger.ks.w, objArr);
                                                            if (!org.telegram.messenger.fj.d5(fjVar9.k) || fjVar9.b5()) {
                                                                TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                tL_deleteMessage.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar9.k));
                                                                TLRPC.Message message6 = fjVar9.k;
                                                                tL_deleteMessage.receiver_id = u12.q1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                tL_deleteMessage.id = fjVar9.P0();
                                                                u12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
                                                            } else {
                                                                TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                tL_deleteWelcomeMessage.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar9.k));
                                                                tL_deleteWelcomeMessage.id = fjVar9.P0();
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
                                                        org.telegram.messenger.fj fjVar10 = (org.telegram.messenger.fj) sparseArrayArr2[i56].valueAt(i58);
                                                        int i59 = i55;
                                                        long j20 = fjVar10.k.random_id;
                                                        if (j20 != 0 && fjVar10.D != 10) {
                                                            arrayList6.add(Long.valueOf(j20));
                                                        }
                                                        i58++;
                                                        i55 = i59;
                                                    }
                                                } else {
                                                    arrayList6 = null;
                                                }
                                                int i60 = i55;
                                                org.telegram.messenger.mp.u1(i50).Z(arrayList17, arrayList6, encryptedChat2, (i56 != 1 || j17 == 0) ? j19 : j17, i51, zArr2[i60], i52);
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
                                if (fjVar == null) {
                                }
                                if (z15) {
                                }
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, r82), r82);
                                u1Var2.O = new v0(3, runnable2);
                                h2Var.showDialog(u1Var2);
                                textView = (TextView) u1Var2.d(-1);
                                if (textView != null) {
                                }
                                textView2 = (TextView) u1Var2.d(-3);
                                if (textView2 == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.u1 z(LaunchActivity launchActivity) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                                String M0 = org.telegram.messenger.gd.M0(2131748525, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                u1Var.U = org.telegram.messenger.gd.M0(2131748526, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131748528, null), new g1(launchActivity, 1));
                                return u1Var;
                            }
                        }
