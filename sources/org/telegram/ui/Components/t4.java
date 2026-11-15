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
import org.telegram.ui.l81;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class t4 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static org.telegram.ui.ActionBar.t1 A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747304, null));
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.U = X2;
        int i7 = org.telegram.ui.ActionBar.j6.L5;
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new h0(activity, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.t1 B(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.pr prVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7 = 1;
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.hd.M0(2131745617, null), org.telegram.messenger.hd.M0(2131745616, null), org.telegram.messenger.hd.M0(2131745615, null), org.telegram.messenger.hd.M0(2131745614, null)};
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.hd.M0(2131748844, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748841, org.telegram.messenger.q10.j(user, true)));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131748842, null));
        }
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        e10.addView(textView, c8.ja.t(-2, -2, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i10 = 0;
        while (i10 < 4) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.d = 42;
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i10));
            a(i6Var, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.E5, e6Var);
            i6Var.b(strArr[i10], iArr[0] == i10);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new k1(iArr, e10));
            i10++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (z10) {
            t1Var.S = org.telegram.messenger.hd.M0(2131748843, null);
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.L5;
            int f10 = e6Var != null ? e6Var.f(i11) : org.telegram.ui.ActionBar.j6.x0(null, i11, false);
            t1Var.c0 = new qo0(activity, 0);
            t1Var.d0 = f10;
            t1Var.e0 = -1;
            if (e6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.j6.L5, null);
            }
        }
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745459, null), new f1(i7, iArr, prVar));
        alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.u2 C(final long j3, final long j10, final org.telegram.ui.ActionBar.e2 e2Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        if (e2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(e2Var.getParentActivity(), false, 1, e6Var);
        i7.P = org.telegram.messenger.hd.M0(2131747924, null);
        i7.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.a0("MuteFor", null, 2131748312, org.telegram.messenger.hd.G(1, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748312, org.telegram.messenger.hd.G(8, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748312, org.telegram.messenger.hd.G(2, "Days", new Object[0])), org.telegram.messenger.hd.M0(2131748313, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.y2
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
                org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).T(j3, i11, j10);
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                if (cc.a(e2Var2)) {
                    cc.z(e2Var2, i11, 0, e6Var).j();
                }
            }
        };
        i7.M = charSequenceArr;
        i7.L = onClickListener;
        return i7;
    }

    public static void D(Context context, org.telegram.ui.ActionBar.e6 e6Var, r4 r4Var) {
        if (context == null) {
            return;
        }
        int i7 = 0;
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        int f10 = e6Var != null ? e6Var.f(i10) : org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        int f11 = e6Var != null ? e6Var.f(i11) : org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.Aj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.j6.Ej;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.E8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.G8;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.i6;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.Ji;
        int f12 = e6Var != null ? e6Var.f(i17) : org.telegram.ui.ActionBar.j6.x0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.j6.Fi;
        int f13 = e6Var != null ? e6Var.f(i18) : org.telegram.ui.ActionBar.j6.x0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.j6.Hi;
        int f14 = e6Var != null ? e6Var.f(i19) : org.telegram.ui.ActionBar.j6.x0(null, i19, false);
        org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
        int[] iArr = {30, 60, 120, org.telegram.messenger.ns.K2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, e6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(20);
        h4Var.setTextColor(f10);
        h4Var.setValue(0);
        h4Var.setFormatter(new t0(iArr, i7));
        d4 d4Var = new d4(context, h4Var, 1);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131748310, null));
        textView.setTextColor(f10);
        i5.c.v(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        int i20 = 10;
        textView.setOnTouchListener(new gi.a(i20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.ub ubVar = new di.ub(context, 19);
        linearLayout.addView(h4Var, c8.ja.l(1.0f, 0, org.telegram.messenger.ns.t4));
        h4Var.setOnValueChangedListener(new org.telegram.ui.br(i20));
        ubVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ubVar.setGravity(17);
        ubVar.setTextColor(f12);
        ubVar.setTextSize(1, 14.0f);
        ubVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        ubVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, f13, f14, f14));
        ubVar.setText(org.telegram.messenger.hd.M0(2131753866, null));
        d4Var.addView(ubVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
        ubVar.setOnClickListener(new bi.f4(iArr, h4Var, r4Var, ouVar, 7));
        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.b;
        u2Var.O = d4Var;
        u2Var.show();
        u2Var.v0(f11);
        u2Var.P(f11);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        HashMap hashMap = new HashMap();
        int i7 = org.telegram.ui.ActionBar.j6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i7)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i7)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.j6.v0(i7), hashMap);
        alertDialog$Builder.n(i7, null);
        t1Var.X = true;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
        t1Var.U = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.t1 F(Activity activity, long j3, final long j10, int i7, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        char c10;
        CharSequence[] charSequenceArr;
        final long j11 = j3;
        final int i12 = i7;
        final SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).e7;
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
            charSequenceArr = new String[]{org.telegram.messenger.hd.M0(2131747880, null), org.telegram.messenger.hd.M0(2131747882, null), org.telegram.messenger.hd.M0(2131747881, null), org.telegram.messenger.hd.M0(2131747883, null), org.telegram.messenger.hd.M0(2131747879, null)};
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
                charSequenceArr2[0] = org.telegram.messenger.hd.M0(2131747882, null);
                charSequenceArr2[1] = org.telegram.messenger.hd.M0(2131747881, null);
                charSequenceArr2[c10] = org.telegram.messenger.hd.M0(2131747883, null);
                charSequenceArr2[3] = org.telegram.messenger.hd.M0(2131747879, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.hd.M0(2131747882, null);
            charSequenceArr22[1] = org.telegram.messenger.hd.M0(2131747881, null);
            charSequenceArr22[c10] = org.telegram.messenger.hd.M0(2131747883, null);
            charSequenceArr22[3] = org.telegram.messenger.hd.M0(2131747879, null);
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
            a(i6Var, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.E5, e6Var);
            i6Var.b(charSequenceArr[i16], iArr[i15] == i16 ? 1 : i15);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i17 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).e7.edit();
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
                        org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).l(j12, j10);
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
                        org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).m(i21);
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
        String M0 = org.telegram.messenger.hd.M0(2131747906, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static void G(int i7, Activity activity, long j3, TLRPC.Photo photo, fi.b bVar) {
        if (activity != null) {
            bi.z zVar = new bi.z(i7, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, (Context) activity, (org.telegram.ui.ActionBar.e6) bVar, true);
            u2Var.O();
            u2Var.P = org.telegram.messenger.hd.M0(2131746212, null);
            u2Var.Q = true;
            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131746221, null), org.telegram.messenger.hd.M0(2131746227, null), org.telegram.messenger.hd.M0(2131746220, null), org.telegram.messenger.hd.M0(2131746229, null), org.telegram.messenger.hd.M0(2131746226, null), org.telegram.messenger.hd.M0(2131746224, null), org.telegram.messenger.hd.M0(2131746223, null), org.telegram.messenger.hd.M0(2131746225, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            r2 r2Var = new r2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, zVar, 0);
            u2Var.M = charSequenceArr;
            u2Var.N = iArr;
            u2Var.L = r2Var;
            u2Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.ActionBar.m5] */
    /* JADX WARN: Type inference failed for: r8v14 */
    public static org.telegram.messenger.ou H(final Context context, final long j3, long j10, int i7, boolean z10, final r4 r4Var, Runnable runnable, q4 q4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        ib0 ib0Var;
        char c10;
        n3 n3Var;
        long j11;
        ViewGroup viewGroup2;
        boolean[] zArr;
        org.telegram.ui.ActionBar.q0 q0Var;
        ch0 ch0Var;
        n3 n3Var2;
        char c11;
        int i12;
        int[] iArr;
        TextView textView;
        String[] strArr;
        final Calendar calendar;
        n3 n3Var3;
        int i13;
        float f10;
        TextView textView2;
        int[] iArr2;
        ?? r82;
        ?? r42;
        org.telegram.ui.ActionBar.u2 u2Var;
        ch0 ch0Var2;
        fh0 fh0Var;
        int i14;
        TLRPC.User a22;
        TLRPC.UserStatus userStatus;
        n3 n3Var4;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i7};
        long e10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).e();
        final org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
        ib0 ib0Var2 = new ib0(context, e6Var);
        int i15 = q4Var.a;
        int i16 = q4Var.c;
        int i17 = q4Var.b;
        ib0Var2.setTextColor(i15);
        ib0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var2.setItemCount(5);
        final q3 q3Var = new q3(context, e6Var);
        q3Var.setWrapSelectorWheel(true);
        q3Var.setAllItemsCount(24);
        q3Var.setItemCount(5);
        q3Var.setTextColor(i15);
        q3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final r3 r3Var = new r3(context, e6Var);
        r3Var.setWrapSelectorWheel(true);
        r3Var.setAllItemsCount(60);
        r3Var.setItemCount(5);
        r3Var.setTextColor(i15);
        r3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        n3 n3Var5 = new n3(context, ib0Var2, q3Var, r3Var, 1);
        n3Var5.setClipToPadding(false);
        n3Var5.setClipChildren(false);
        n3Var5.setOrientation(1);
        frameLayout2.addView(n3Var5, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        n3Var5.addView(frameLayout4, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView3 = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView3.setText((CharSequence) null);
            i10 = 0;
        } else if (j3 == e10) {
            i10 = 0;
            textView3.setText(org.telegram.messenger.hd.M0(2131745514, null));
        } else {
            i10 = 0;
            textView3.setText(org.telegram.messenger.hd.M0(2131745859, null));
        }
        textView3.setTextColor(i15);
        textView3.setTextSize(1, 20.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        frameLayout4.addView(textView3, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView3.setOnTouchListener(new gi.a(10));
        boolean[] zArr2 = new boolean[1];
        zArr2[i10] = true;
        if (!org.telegram.messenger.m5.E(j3) || j3 == e10 || (a22 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).a2(Long.valueOf(j3))) == null || a22.bot || (userStatus = a22.status) == null || userStatus.expires <= 0) {
            i11 = i17;
            viewGroup = frameLayout2;
            frameLayout = frameLayout3;
            ib0Var = ib0Var2;
            c10 = 2;
            n3Var = n3Var5;
            j11 = e10;
            viewGroup2 = frameLayout4;
            zArr = zArr2;
            q0Var = null;
        } else {
            String j12 = org.telegram.messenger.q10.j(a22, true);
            if (j12.length() > 10) {
                StringBuilder sb2 = new StringBuilder();
                n3Var4 = n3Var5;
                sb2.append(j12.substring(i10, 10));
                sb2.append("…");
                j12 = sb2.toString();
            } else {
                n3Var4 = n3Var5;
            }
            String str = j12;
            frameLayout = frameLayout3;
            j11 = e10;
            zArr = zArr2;
            i11 = i17;
            ib0Var = ib0Var2;
            viewGroup2 = frameLayout4;
            c10 = 2;
            viewGroup = frameLayout2;
            n3Var = n3Var4;
            q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, q4Var.a, false, e6Var);
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(R.drawable.ic_ab_other);
            q0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(i16, 1, -1));
            viewGroup2.addView(q0Var, c8.ja.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            q0Var.g(1, org.telegram.messenger.hd.a0(null, null, 2131745850, str));
            q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        }
        if (q0Var != null) {
            q0Var.setOnClickListener(new org.telegram.messenger.video.e(27, q0Var, q4Var));
            q0Var.setDelegate(new a3.h(r4Var, zArr, ouVar, 19));
        }
        fh0 fh0Var2 = new fh0(context);
        ch0 ch0Var3 = new ch0(R.raw.notify_toggle, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        ch0Var3.J(true);
        ch0Var3.h = true;
        ch0Var3.start();
        ch0Var3.M(40);
        ch0Var3.P(40);
        fh0Var2.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var2.setAnimation(ch0Var3);
        fh0Var2.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        fh0Var2.setBackground(org.telegram.ui.ActionBar.j6.h0(i16, 1, -1));
        viewGroup2.addView(fh0Var2, c8.ja.d(40, 40.0f, 53, 0.0f, 8.0f, (q0Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        char c12 = c10;
        final di.ub ubVar = new di.ub(context, 14);
        final org.telegram.ui.ActionBar.q0 q0Var2 = q0Var;
        linearLayout.addView(ib0Var, c8.ja.l(0.5f, 0, org.telegram.messenger.ns.t4));
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(365);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new org.telegram.ui.br(11));
        final boolean[] zArr3 = zArr;
        final ib0 ib0Var3 = ib0Var;
        final long j13 = j11;
        gb0 gb0Var = new gb0() { // from class: org.telegram.ui.Components.j1
            @Override // org.telegram.ui.Components.gb0
            public final void m(ib0 ib0Var4, int i18) {
                t4.g(di.ub.this, null, 0L, 0L, j13 == j3 ? 1 : 0, ib0Var3, q3Var, r3Var);
            }
        };
        ib0Var3.setOnValueChangedListener(gb0Var);
        q3Var.setMinValue(0);
        q3Var.setMaxValue(23);
        linearLayout.addView(q3Var, c8.ja.l(0.2f, 0, org.telegram.messenger.ns.t4));
        q3Var.setFormatter(new org.telegram.ui.br(14));
        q3Var.setOnValueChangedListener(gb0Var);
        r3Var.setMinValue(0);
        r3Var.setMaxValue(59);
        r3Var.setValue(0);
        r3Var.setFormatter(new org.telegram.ui.br(16));
        linearLayout.addView(r3Var, c8.ja.l(0.3f, 0, org.telegram.messenger.ns.t4));
        r3Var.setOnValueChangedListener(gb0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            ch0Var = ch0Var3;
            n3Var2 = n3Var;
        } else {
            long j14 = 1000 * j10;
            ch0Var = ch0Var3;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            n3Var2 = n3Var;
            int timeInMillis = (int) ((j14 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                r3Var.setValue(calendar2.get(12));
                q3Var.setValue(calendar2.get(11));
                ib0Var3.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(ubVar, null, 0L, 0L, j13 == j3 ? 1 : 0, ib0Var3, q3Var, r3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).isTestBackend();
        if (isTestBackend) {
            c11 = '\t';
            i12 = 10;
            iArr = new int[10];
            iArr[0] = 0;
            iArr[1] = 60;
            iArr[c12] = 300;
            iArr[3] = 86400;
            iArr[4] = 604800;
            iArr[5] = 1209600;
            iArr[6] = 2592000;
            iArr[7] = 7862400;
            iArr[8] = 15724800;
            iArr[9] = 31536000;
        } else {
            c11 = '\t';
            i12 = 10;
            int[] iArr4 = new int[8];
            iArr4[0] = 0;
            iArr4[1] = 86400;
            iArr4[c12] = 604800;
            iArr4[3] = 1209600;
            iArr4[4] = 2592000;
            iArr4[5] = 7862400;
            iArr4[6] = 15724800;
            iArr4[7] = 31536000;
            iArr = iArr4;
        }
        if (isTestBackend) {
            strArr = new String[i12];
            textView = null;
            strArr[0] = org.telegram.messenger.hd.M0(2131748500, null);
            strArr[1] = "Every minute";
            strArr[c12] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.hd.M0(2131748502, null);
            strArr[4] = org.telegram.messenger.hd.M0(2131748499, null);
            strArr[5] = org.telegram.messenger.hd.M0(2131748503, null);
            strArr[6] = org.telegram.messenger.hd.M0(2131748501, null);
            strArr[7] = org.telegram.messenger.hd.M0(2131748505, null);
            strArr[8] = org.telegram.messenger.hd.M0(2131748504, null);
            strArr[c11] = org.telegram.messenger.hd.M0(2131748498, null);
        } else {
            textView = null;
            strArr = new String[8];
            strArr[0] = org.telegram.messenger.hd.M0(2131748500, null);
            strArr[1] = org.telegram.messenger.hd.M0(2131748502, null);
            strArr[c12] = org.telegram.messenger.hd.M0(2131748499, null);
            strArr[3] = org.telegram.messenger.hd.M0(2131748503, null);
            strArr[4] = org.telegram.messenger.hd.M0(2131748501, null);
            strArr[5] = org.telegram.messenger.hd.M0(2131748505, null);
            strArr[6] = org.telegram.messenger.hd.M0(2131748504, null);
            strArr[7] = org.telegram.messenger.hd.M0(2131748498, null);
        }
        if (z10) {
            calendar = calendar2;
            n3Var3 = n3Var2;
            i13 = i11;
            f10 = 14.0f;
            textView2 = textView;
            iArr2 = iArr;
            r82 = textView2;
            r42 = textView;
        } else {
            FrameLayout frameLayout5 = new FrameLayout(context);
            i13 = i11;
            f10 = 14.0f;
            int w10 = org.telegram.ui.ActionBar.j6.w(i13, org.telegram.ui.ActionBar.j6.r1(0.075f, i15));
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, i15);
            calendar = calendar2;
            textView2 = new TextView(context);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i15);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.j6.w(w10, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w10, w11, w11));
            textView2.setGravity(17);
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(iArr, iArr3, strArr, textView2);
            m5Var.run();
            frameLayout5.addView(textView2, c8.ja.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            n3 n3Var6 = n3Var2;
            n3Var6.addView(frameLayout5, c8.ja.o(-1, -2));
            iArr2 = iArr;
            r82 = m5Var;
            r42 = frameLayout5;
            n3Var3 = n3Var6;
        }
        ubVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ubVar.setGravity(17);
        ubVar.setTextColor(q4Var.g);
        ubVar.setTextSize(1, f10);
        ubVar.setTypeface(org.telegram.messenger.g0.o());
        ubVar.setBackground(org.telegram.ui.ActionBar.y5.e(q4Var.h, 24.0f));
        n3Var3.addView(ubVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
        int i18 = i13;
        ubVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr4[0] = false;
                int i19 = j13 == j3 ? 1 : 0;
                ib0 ib0Var4 = ib0Var3;
                q3 q3Var2 = q3Var;
                r3 r3Var2 = r3Var;
                boolean g10 = t4.g(null, null, 0L, 0L, i19, ib0Var4, q3Var2, r3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar3 = calendar;
                calendar3.setTimeInMillis(currentTimeMillis);
                calendar3.add(6, ib0Var4.getValue());
                calendar3.set(11, q3Var2.getValue());
                calendar3.set(12, r3Var2.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                r4Var.L((int) (calendar3.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                ((org.telegram.ui.ActionBar.u2) ouVar.b).y0.run();
            }
        });
        org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) ouVar.b;
        u2Var2.O = viewGroup;
        u2Var2.show();
        u2Var2.setOnDismissListener(new x1(runnable, zArr4));
        u2Var2.v0(i18);
        u2Var2.P(i18);
        if (textView2 != null) {
            ch0Var2 = ch0Var;
            fh0Var = fh0Var2;
            i14 = 1;
            String[] strArr2 = strArr;
            u2Var = u2Var2;
            textView2.setOnClickListener(new a3(frameLayout, e6Var, u2Var, (FrameLayout) r42, iArr2, strArr2, iArr3, (org.telegram.ui.ActionBar.m5) r82));
        } else {
            u2Var = u2Var2;
            ch0Var2 = ch0Var;
            fh0Var = fh0Var2;
            i14 = 1;
        }
        final hi.l3[] l3VarArr = new hi.l3[i14];
        final org.telegram.ui.ActionBar.u2 u2Var3 = u2Var;
        final ch0 ch0Var4 = ch0Var2;
        fh0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String M0;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                ch0 ch0Var5 = ch0Var4;
                if (z11) {
                    if (ch0Var5.b0 < 40) {
                        ch0Var5.M(40);
                    }
                    ch0Var5.P(80);
                    ch0Var5.start();
                } else {
                    if (ch0Var5.b0 >= 40) {
                        ch0Var5.M(0);
                    }
                    ch0Var5.P(40);
                    ch0Var5.start();
                }
                hi.l3[] l3VarArr2 = l3VarArr;
                hi.l3 l3Var = l3VarArr2[0];
                if (l3Var != null) {
                    l3Var.f(true);
                    l3VarArr2[0] = null;
                }
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0);
                long j15 = j3;
                TLRPC.User a23 = s12.a2(Long.valueOf(j15));
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).M0(Long.valueOf(-j15));
                hi.l3 l3Var2 = new hi.l3(context, 3);
                l3VarArr2[0] = l3Var2;
                l3Var2.t();
                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                l3Var2.s(20.0f);
                float L2 = org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(4.0f);
                int r13 = org.telegram.ui.ActionBar.j6.r1(0.25f, -16777216);
                l3Var2.j0 = L2;
                l3Var2.k0 = L3;
                l3Var2.l0 = r13;
                l3Var2.G.setShadowLayer(L2, 0.0f, L3, r13);
                if (org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.hd.M0(zArr5[0] ? 2131745854 : 2131745858, null);
                } else if (M02 != null || a23 == null) {
                    M0 = org.telegram.messenger.hd.M0(zArr5[0] ? 2131745852 : 2131745856, null);
                } else if (j15 == j13) {
                    M0 = org.telegram.messenger.hd.M0(zArr5[0] ? 2131745851 : 2131745855, null);
                } else {
                    M0 = org.telegram.messenger.hd.a0(null, null, zArr5[0] ? 2131745853 : 2131745857, org.telegram.messenger.q10.k(a23));
                }
                l3Var2.u(M0);
                l3Var2.d = 5000L;
                l3Var2.o(1.0f, -((q0Var2 != null ? 42 : -8) + 20));
                l3Var2.r0 = new z2(l3Var2, 0);
                org.telegram.ui.ActionBar.u2 u2Var4 = u2Var3;
                u2Var4.b.setClipToPadding(false);
                u2Var4.b.setClipChildren(false);
                u2Var4.b.addView(l3Var2, c8.ja.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                l3Var2.w();
            }
        });
        return ouVar;
    }

    public static void I(Context context, long j3, r4 r4Var) {
        H(context, j3, -1L, 0, false, r4Var, null, new q4(null), null);
    }

    public static void J(Context context, long j3, r4 r4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        H(context, j3, -1L, 0, false, r4Var, null, new q4(e6Var), e6Var);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        if (str == null) {
            str = org.telegram.messenger.hd.M0(R.string.AppName, null);
        }
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        t1Var.U = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(str3, new s0(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.t1 M(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        t1Var.U = charSequence;
        alertDialog$Builder.k(str2, new s0(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.g1 N(org.telegram.ui.ActionBar.e2 e2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (e2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        g1Var.e = true;
        g1Var.c = org.telegram.messenger.ns.x3;
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

    public static void O(Context context, org.telegram.ui.ActionBar.e2 e2Var, String str, String str2, String str3, String str4, int i7, String str5, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.tr trVar) {
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = str == null ? org.telegram.messenger.hd.M0(R.string.AppName, null) : str;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = str2;
        s4 s4Var = new s4(context);
        s4Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(s4Var, i10, e6Var);
        org.telegram.ui.ActionBar.q6.D(s4Var, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        s4Var.setHint(str3);
        s4Var.setFocusable(true);
        s4Var.setInputType(147457);
        s4Var.setImeOptions(6);
        s4Var.setMaxLines(10);
        s4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        s4Var.setCursorWidth(1.5f);
        s4Var.A(org.telegram.ui.ActionBar.j6.q6, e6Var);
        if (str4 != null) {
            s4Var.setText(str4);
        }
        s4Var.setOnEditorActionListener(new kg.q(s4Var, i7, trVar, t1VarArr, currentFocus, 1));
        s4Var.addTextChangedListener(new org.telegram.ui.Cells.j3(i7, s4Var));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i10);
        s4Var.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(s4Var, d02, K, null, e6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView(s4Var, c8.ja.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        t1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
        alertDialog$Builder.k(str5, new ai.q1(s4Var, i7, trVar, 7));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.br(23));
        t1VarArr[0] = t1Var;
        if (e2Var != null) {
            org.telegram.messenger.g0.Z2(W, e2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.k0 = false;
        t1Var2.setOnDismissListener(new bi.k(s4Var, e2Var, W, 4));
        t1VarArr[0].setOnShowListener(new r0(1, s4Var));
        t1VarArr[0].show();
        s4Var.setSelection(s4Var.getText().length());
    }

    public static void P(Context context, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.tr trVar) {
        O(context, e2Var, org.telegram.messenger.hd.M0(2131744799, null), org.telegram.messenger.hd.M0(2131744806, null), org.telegram.messenger.hd.M0(2131744780, null), null, 12, org.telegram.messenger.hd.M0(2131751753, null), e6Var, trVar);
    }

    public static org.telegram.messenger.ou Q(Context context, long j3, final r4 r4Var, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        int i10;
        int i11;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Aj, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ej, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.j6.x0(null, i12, false);
        int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        if (context == null) {
            return null;
        }
        final org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
        final ib0 ib0Var = new ib0(context, e6Var);
        ib0Var.setTextColor(x02);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
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
        n3 n3Var = new n3(context, ib0Var, l4Var, m4Var, 7);
        n3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        n3Var.addView(f10, c8.ja.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(i7 == 1 ? 2131744374 : 2131747095, null));
        textView.setTextColor(x02);
        i5.c.v(textView, 1, 20.0f);
        f10.addView(textView, c8.ja.t(-2, -2, 51, 0, 12, 0, 0));
        int i13 = 10;
        textView.setOnTouchListener(new gi.a(i13));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.z6, e6Var);
        i5.c.w(textView2, 1, 14.0f, null, 2131747094);
        f10.addView(textView2, c8.ja.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new gi.a(i13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i14 = calendar.get(1);
        gc.b bVar = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).y7.j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long z02 = bVar.z0(timeUnit) * 2;
        final long z03 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).y7.k.z0(timeUnit) - 86400;
        final di.ub ubVar = new di.ub(context, 21);
        linearLayout.addView(ib0Var, c8.ja.l(0.5f, 0, org.telegram.messenger.ns.t4));
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(365);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new l2.t(i14, 4));
        final int i15 = i7 == 1 ? 5 : 3;
        gb0 gb0Var = new gb0() { // from class: org.telegram.ui.Components.s1
            @Override // org.telegram.ui.Components.gb0
            public final void m(ib0 ib0Var2, int i16) {
                t4.g(di.ub.this, null, z02, z03, i15, ib0Var, l4Var, m4Var);
            }
        };
        ib0Var.setOnValueChangedListener(gb0Var);
        l4Var.setMinValue(0);
        l4Var.setMaxValue(23);
        linearLayout.addView(l4Var, c8.ja.l(0.2f, 0, org.telegram.messenger.ns.t4));
        l4Var.setFormatter(new org.telegram.ui.br(18));
        l4Var.setOnValueChangedListener(gb0Var);
        m4Var.setMinValue(0);
        m4Var.setMaxValue(59);
        m4Var.setValue(0);
        m4Var.setFormatter(new org.telegram.ui.br(19));
        linearLayout.addView(m4Var, c8.ja.l(0.3f, 0, org.telegram.messenger.ns.t4));
        m4Var.setOnValueChangedListener(gb0Var);
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
                m4Var.setValue(calendar.get(12));
                l4Var.setValue(calendar.get(11));
                ib0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(ubVar, null, z02, z03, i15, ib0Var, l4Var, m4Var);
        ubVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ubVar.setGravity(17);
        ubVar.setTextColor(x04);
        ubVar.setTextSize(1, 14.0f);
        ubVar.setTypeface(org.telegram.messenger.g0.o());
        ubVar.setBackground(org.telegram.ui.ActionBar.y5.e(x05, 8.0f));
        n3Var.addView(ubVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i15;
        ubVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j11 = z02;
                long j12 = z03;
                int i17 = i16;
                ib0 ib0Var2 = ib0Var;
                l4 l4Var2 = l4Var;
                m4 m4Var2 = m4Var;
                boolean g10 = t4.g(null, null, j11, j12, i17, ib0Var2, l4Var2, m4Var2);
                long epochMilli = LocalDate.now().plusDays(ib0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, l4Var2.getValue());
                calendar2.set(12, m4Var2.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                r4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.u2) ouVar.b).y0.run();
            }
        });
        c8.na.b(ubVar, 0.02f, 1.2f);
        di.ub ubVar2 = new di.ub(context, 22);
        ubVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ubVar2.setGravity(17);
        ubVar2.setText(org.telegram.messenger.hd.M0(i7 == 1 ? 2131748471 : 2131747092, null));
        ubVar2.setTextColor(x05);
        ubVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i17 = org.telegram.ui.ActionBar.j6.d6;
        int x06 = org.telegram.ui.ActionBar.j6.x0(null, i17, false);
        int x07 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        ubVar2.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(ubVar2, k02, M, M2, null);
        n3Var.addView(ubVar2, c8.ja.t(-1, 48, 83, 16, 0, 16, 16));
        ubVar2.setOnClickListener(new ah.g(zArr, r4Var, ouVar, 21));
        c8.na.b(ubVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.b;
        u2Var.O = n3Var;
        u2Var.show();
        u2Var.setOnDismissListener(new hi.f1(zArr));
        u2Var.v0(i10);
        u2Var.P(i10);
        return ouVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.ActionBar.t1 R(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        if (e2Var == null || e2Var.getParentActivity() == null) {
            return null;
        }
        z70 z70Var = new z70(e2Var.getParentActivity(), e2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.hd.M0(2131753985, null).replace("\n", "<br>")));
        boolean z10 = false;
        Object[] objArr = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new g4(uRLSpan.getURL(), e2Var), spanStart, spanEnd, 0);
        }
        z70Var.setText(spannableString);
        z70Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.k5, e6Var);
        org.telegram.ui.ActionBar.q6.C(z70Var, org.telegram.ui.ActionBar.j6.l5, e6Var);
        z70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        z70Var.setMovementMethod(new org.telegram.messenger.c0(z10));
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.j5, e6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var);
        alertDialog$Builder.o(z70Var);
        String M0 = org.telegram.messenger.hd.M0(2131753986, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753984, null), new v2(objArr == true ? 1 : 0, e2Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131748587, null);
        ib0 ib0Var = new ib0(context, null);
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(20);
        int i7 = encryptedChat.ttl;
        if (i7 > 0 && i7 < 16) {
            ib0Var.setValue(i7);
        } else if (i7 == 30) {
            ib0Var.setValue(16);
        } else if (i7 == 60) {
            ib0Var.setValue(17);
        } else if (i7 == 3600) {
            ib0Var.setValue(18);
        } else if (i7 == 86400) {
            ib0Var.setValue(19);
        } else if (i7 == 604800) {
            ib0Var.setValue(20);
        } else if (i7 == 0) {
            ib0Var.setValue(0);
        }
        ib0Var.setFormatter(new e2(3));
        alertDialog$Builder.o(ib0Var);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751354, null), new f1(5, encryptedChat, ib0Var));
        return alertDialog$Builder;
    }

    public static void T(org.telegram.ui.ActionBar.e2 e2Var, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        int i11;
        String sb2;
        if (e2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = e2Var.getParentActivity();
        s4 s4Var = new s4(parentActivity);
        String str = null;
        s4Var.setBackground(null);
        org.telegram.ui.ActionBar.q6.F(s4Var, org.telegram.ui.ActionBar.j6.u5, org.telegram.ui.ActionBar.j6.v5, org.telegram.ui.ActionBar.j6.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131748258, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751753, null), new e2(4));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i7 != 0) {
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751114, null)));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131751115, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i12, null);
        linearLayout.addView(textView, c8.ja.o(-1, -2));
        s4Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(s4Var, i12, null);
        s4Var.setMaxLines(1);
        s4Var.setLines(1);
        s4Var.setInputType(16385);
        s4Var.setGravity(51);
        s4Var.setSingleLine(true);
        s4Var.setImeOptions(6);
        s4Var.A(org.telegram.ui.ActionBar.j6.G6, null);
        s4Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        s4Var.setCursorWidth(1.5f);
        s4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(s4Var, c8.ja.t(-1, 36, 51, 24, 6, 24, 0));
        s4Var.setOnEditorActionListener(new j2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        i5.c.s(9306112, hashMap, "Berry", 14598550, "Brandy");
        i5.c.s(8391495, hashMap, "Cherry", 16744272, "Coral");
        i5.c.s(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        i5.c.s(14725375, hashMap, "Mauve", 16761035, "Pink");
        i5.c.s(16711680, hashMap, "Red", 16711807, "Rose");
        i5.c.s(8406555, hashMap, "Russet", 16720896, "Scarlet");
        i5.c.s(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        i5.c.s(16760576, hashMap, "Amber", 15438707, "Apricot");
        i5.c.s(16508850, hashMap, "Banana", 10601738, "Citrus");
        i5.c.s(11560192, hashMap, "Ginger", 16766720, "Gold");
        i5.c.s(16640272, hashMap, "Lemon", 16753920, "Orange");
        i5.c.s(16770484, hashMap, "Peach", 16739155, "Persimmon");
        i5.c.s(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        i5.c.s(16763004, hashMap, "Topaz", 16776960, "Yellow");
        i5.c.s(3688720, hashMap, "Clover", 8628829, "Cucumber");
        i5.c.s(5294200, hashMap, "Emerald", 11907932, "Olive");
        i5.c.s(65280, hashMap, "Green", 43115, "Jade");
        i5.c.s(2730887, hashMap, "Jungle", 12582656, "Lime");
        i5.c.s(776785, hashMap, "Malachite", 10026904, "Mint");
        i5.c.s(11394989, hashMap, "Moss", 3234721, "Azure");
        i5.c.s(org.telegram.messenger.ns.e4, hashMap, "Blue", 18347, "Cobalt");
        i5.c.s(5204422, hashMap, "Indigo", 96647, "Lagoon");
        i5.c.s(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        i5.c.s(128, hashMap, "Navy", 3101086, "Sapphire");
        i5.c.s(7788522, hashMap, "Sky", 32896, "Teal");
        i5.c.s(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        i5.c.s(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        i5.c.s(13148872, hashMap, "Lilac", 11894492, "Lavender");
        i5.c.s(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        i5.c.s(6684825, hashMap, "Purple", 14204888, "Thistle");
        i5.c.s(14315734, hashMap, "Orchid", 2361920, "Violet");
        i5.c.s(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        i5.c.s(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        i5.c.s(7365973, hashMap, "Coffee", 7956873, "Rum");
        i5.c.s(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        i5.c.s(12759680, hashMap, "Sand", 8924439, "Sienna");
        i5.c.s(7864585, hashMap, "Maple", 15787660, "Khaki");
        i5.c.s(12088115, hashMap, "Copper", 12144200, "Chestnut");
        i5.c.s(15653316, hashMap, "Almond", 16776656, "Cream");
        i5.c.s(12186367, hashMap, "Diamond", 11109127, "Honey");
        i5.c.s(16777200, hashMap, "Ivory", 15392968, "Pearl");
        i5.c.s(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        i5.c.s(16777215, hashMap, "White", 8421504, "Gray");
        i5.c.s(0, hashMap, "Black", 15266260, "Chrome");
        i5.c.s(3556687, hashMap, "Charcoal", 789277, "Ebony");
        i5.c.s(12632256, hashMap, "Silver", 16119285, "Smoke");
        i5.c.s(2499381, hashMap, "Steel", 5220413, "Apple");
        i5.c.s(8434628, hashMap, "Glacier", 16693933, "Melon");
        i5.c.s(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.g6 k10 = g6Var == null ? org.telegram.ui.ActionBar.j6.D0().k(false) : g6Var;
        if (k10 == null || (i10 = k10.c) == 0) {
            i10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.j6.s0())[0];
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
            sb2 = org.telegram.ui.Cells.y0.m((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder m10 = r.b.m(str, " ");
            m10.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = m10.toString();
        }
        s4Var.setText(sb2);
        s4Var.setSelection(s4Var.length());
        r0 r0Var = new r0(i11, s4Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.setOnShowListener(r0Var);
        e2Var.showDialog(t1Var);
        s4Var.requestFocus();
        t1Var.d(-1).setOnClickListener(new fi.d0(e2Var, s4Var, g6Var, i6Var, t1Var, 9));
    }

    public static void U(Activity activity, String str, int i7, int i10, int i11, org.telegram.messenger.z10 z10Var) {
        if (activity == null) {
            return;
        }
        final int i12 = 0;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Aj, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ej, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i6, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        final int i13 = 1;
        org.telegram.ui.ActionBar.u2 i14 = org.telegram.messenger.i20.i(activity, false, 1, null);
        i14.w0 = false;
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
        final di.v3 v3Var = new di.v3(i10, i11, m3Var, o3Var, i7, n3Var);
        n3Var.addView(m3Var, c8.ja.l(0.5f, 0, org.telegram.messenger.ns.t4));
        m3Var.setFormatter(new e2(i13));
        m3Var.setOnValueChangedListener(new gb0() { // from class: org.telegram.ui.Components.g2
            @Override // org.telegram.ui.Components.gb0
            public final void m(ib0 ib0Var, int i15) {
                switch (i12) {
                    case 0:
                        v3Var.a(Boolean.TRUE);
                        break;
                    default:
                        v3Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        n3Var.addView(o3Var, c8.ja.l(0.5f, 0, org.telegram.messenger.ns.t4));
        o3Var.setFormatter(new e2(2));
        o3Var.setOnValueChangedListener(new gb0() { // from class: org.telegram.ui.Components.g2
            @Override // org.telegram.ui.Components.gb0
            public final void m(ib0 ib0Var, int i15) {
                switch (i13) {
                    case 0:
                        v3Var.a(Boolean.TRUE);
                        break;
                    default:
                        v3Var.a(Boolean.TRUE);
                        break;
                }
            }
        });
        v3Var.a(Boolean.FALSE);
        p3 p3Var = new p3(activity, m3Var, o3Var);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        p3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        p3Var.addView(n3Var, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.d dVar = new hi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.hd.M0(2131745672, null), false, true);
        dVar.setOnClickListener(new h2(r1, i12));
        p3Var.addView(dVar, c8.ja.t(-1, 48, 0, 16, 12, 16, 12));
        i14.O = p3Var;
        i14.show();
        i14.setOnDismissListener(new bi.k(z10Var, m3Var, o3Var, 5));
        i14.v0(x03);
        i14.P(x03);
        org.telegram.ui.ActionBar.u2[] u2VarArr = {i14};
    }

    public static org.telegram.ui.ActionBar.t1 V(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).e7;
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
            strArr = new String[]{org.telegram.messenger.hd.M0(2131743613, null), org.telegram.messenger.hd.M0(2131745366, null), org.telegram.messenger.hd.M0(2131748723, null), org.telegram.messenger.hd.M0(2131743612, null)};
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
            strArr = new String[]{org.telegram.messenger.hd.M0(2131743612, null), org.telegram.messenger.hd.M0(2131743613, null), org.telegram.messenger.hd.M0(2131745366, null), org.telegram.messenger.hd.M0(2131748723, null), org.telegram.messenger.hd.M0(2131747821, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i11));
            a(i6Var, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.E5, e6Var);
            i6Var.b(strArr2[i11], iArr[0] == i11 ? z10 : false);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.t2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).e7.edit();
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
                        org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).l(j11, j10);
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
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).m(2);
                        } else if (str3.equals("vibrate_group")) {
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).m(0);
                        } else if (str3.equals("vibrate_react")) {
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).m(4);
                        } else {
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).m(1);
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
        String M0 = org.telegram.messenger.hd.M0(2131743614, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.t1 W(Context context, org.telegram.ui.ActionBar.e6 e6Var, String[] strArr, int i7, String str, String str2, q0.a aVar) {
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
        int i10 = org.telegram.ui.ActionBar.j6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.j6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.U = X2;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(z10 ? 2131747300 : 2131752909, null), new a3.g(z10, context, atomicBoolean, aVar, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752904, null), new f1(2, atomicBoolean, aVar));
        t1Var.setOnDismissListener(new di.a3(8, atomicBoolean, aVar));
        return t1Var;
    }

    public static void X(int i7, int i10, long j3, org.telegram.messenger.z10 z10Var) {
        Y(i7, j3, i10, z10Var, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Y(final int i7, final long j3, int i10, org.telegram.messenger.z10 z10Var, long j10) {
        org.telegram.ui.ActionBar.e6 bVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.Chat chat;
        char c10;
        Activity activity;
        long N1 = org.telegram.messenger.np.s1(i7).N1(j3);
        if (N1 <= 0 && j3 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(i7).J2(j3));
        }
        long j11 = i10 * N1;
        di.v8.y(i7, false).P.put(Long.valueOf(j3), Integer.valueOf(i10));
        if (j11 <= 0 || j10 == j11) {
            z10Var.a(Long.valueOf(j11));
            return false;
        }
        final long j12 = N1;
        final b1 b1Var = new b1(i7, j11, j3, z10Var, j12, 1);
        if (j12 <= org.telegram.messenger.np.s1(i7).f7.getLong(r.b.j(j3, "ask_paid_message_", "_price"), 0L)) {
            b1Var.run();
            return true;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) {
            bVar = new fi.b();
        } else {
            if (T == null) {
                e6Var = null;
                String s5 = org.telegram.messenger.m5.s(i7, j3);
                if (!org.telegram.messenger.t3.o0(i7, j3)) {
                    s5 = qg.c.h(i7, j3);
                } else if (T instanceof org.telegram.ui.an) {
                    org.telegram.ui.an anVar = (org.telegram.ui.an) T;
                    if (anVar.v4 && anVar.a() == j3 && (chat = anVar.u4) != null) {
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
                        f0(activity, org.telegram.messenger.hd.M0(2131748554, null), spannableStringBuilder, org.telegram.messenger.hd.M0(2131748567, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.i1
                            @Override // org.telegram.messenger.z10
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i12 = i7;
                                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i12).f7.edit();
                                    long j13 = j3;
                                    edit.putLong(r.b.j(j13, "ask_paid_message_", "_price"), j12).apply();
                                    di.v8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                                }
                                org.telegram.messenger.g0.h3(b1Var);
                            }
                        }, e6Var, true);
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
                f0(activity, org.telegram.messenger.hd.M0(2131748554, null), spannableStringBuilder2, org.telegram.messenger.hd.M0(2131748567, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.i1
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i12 = i7;
                            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i12).f7.edit();
                            long j13 = j3;
                            edit.putLong(r.b.j(j13, "ask_paid_message_", "_price"), j12).apply();
                            di.v8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                        }
                        org.telegram.messenger.g0.h3(b1Var);
                    }
                }, e6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        e6Var = bVar;
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
        f0(activity, org.telegram.messenger.hd.M0(2131748554, null), spannableStringBuilder22, org.telegram.messenger.hd.M0(2131748567, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.i1
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i12 = i7;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i12).f7.edit();
                    long j13 = j3;
                    edit.putLong(r.b.j(j13, "ask_paid_message_", "_price"), j12).apply();
                    di.v8.y(i12, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                }
                org.telegram.messenger.g0.h3(b1Var);
            }
        }, e6Var, true);
        return true;
    }

    public static boolean Z(int i7, ArrayList arrayList, int i10, org.telegram.messenger.z10 z10Var) {
        org.telegram.ui.ActionBar.e6 bVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            z10Var.a(new HashMap());
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
            long N1 = org.telegram.messenger.np.s1(i7).N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(i7).J2(longValue));
            }
            hashMap.put(l10, Long.valueOf(N1));
            long j11 = j10 + N1;
            boolean z12 = z10;
            di.v8.y(i7, z10).P.put(l10, Integer.valueOf(i10));
            if (N1 > 0) {
                i11++;
            }
            if (N1 > 0 && z11 && org.telegram.messenger.np.s1(i7).f7.getLong(r.b.j(longValue, "ask_paid_message_", "_price"), 0L) < N1) {
                z11 = z12;
            }
            j3 = j11;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i10) * j3;
        if (z11 || max <= 0) {
            z10Var.a(hashMap);
            return z13;
        }
        Activity u02 = org.telegram.messenger.g0.u0();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) {
            bVar = new fi.b();
        } else {
            if (T == null) {
                e6Var = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                spannableStringBuilder.append((CharSequence) " ");
                Object[] objArr = new Object[1];
                objArr[z13 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                f0(u02, org.telegram.messenger.hd.M0(2131748554, null), spannableStringBuilder, org.telegram.messenger.hd.M0(2131748567, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.vp(i7, max, u02, arrayList, hashMap, z10Var, e6Var), e6Var, true);
                return true;
            }
            bVar = T.getResourceProvider();
        }
        e6Var = bVar;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
        spannableStringBuilder2.append((CharSequence) " ");
        Object[] objArr2 = new Object[1];
        objArr2[z13 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
        f0(u02, org.telegram.messenger.hd.M0(2131748554, null), spannableStringBuilder2, org.telegram.messenger.hd.M0(2131748567, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.vp(i7, max, u02, arrayList, hashMap, z10Var, e6Var), e6Var, true);
        return true;
    }

    public static void a(org.telegram.ui.Cells.i6 i6Var, int i7, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        for (int i11 = 0; i11 < i6Var.getChildCount(); i11++) {
            View childAt = i6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.q6.O((RadioButton) childAt, i7, i10, e6Var);
                return;
            }
        }
        i6Var.a(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
    }

    public static boolean a0(int i7, long j3) {
        long N1 = org.telegram.messenger.np.s1(i7).N1(j3);
        if (N1 <= 0 && j3 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(i7).J2(j3));
        }
        return N1 > 0 && N1 > org.telegram.messenger.np.s1(i7).f7.getLong(r.b.j(j3, "ask_paid_message_", "_price"), 0L);
    }

    public static void b(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
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
        ib0Var3.setMaxValue(i13);
        ib0Var3.setMinValue(i10);
        int value = ib0Var3.getValue();
        ib0Var2.setMaxValue(value == i13 ? i14 : 11);
        ib0Var2.setMinValue(value == i10 ? i11 : 0);
        int value2 = ib0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i13 && value2 == i14) {
            actualMaximum = Math.min(i15, actualMaximum);
        }
        ib0Var.setMaxValue(actualMaximum);
        if (value == i10 && value2 == i11) {
            i7 = i12;
        }
        ib0Var.setMinValue(i7);
    }

    public static void b0(s4 s4Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.g0.v1(s4Var);
        String obj = s4Var.getText().toString();
        int i7 = org.telegram.ui.ActionBar.j6.a;
        org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6();
        i6Var.b = new File(org.telegram.messenger.t0.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
        i6Var.a = obj;
        org.telegram.ui.ActionBar.j6.h0 = org.telegram.ui.ActionBar.j6.b1(org.telegram.ui.ActionBar.j6.I.j0);
        i6Var.F = org.telegram.messenger.m10.t0;
        org.telegram.ui.ActionBar.j6.x1(i6Var, true, true, false);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.o4, new Object[0]);
        new ThemeEditorView().d(e2Var.getParentActivity(), i6Var);
        t1Var.dismiss();
        SharedPreferences e12 = org.telegram.messenger.np.e1();
        if (e12.getBoolean("themehint", false)) {
            return;
        }
        e12.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(e2Var.getParentActivity(), org.telegram.messenger.hd.M0(2131751710, null), 1).show();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static long c(hi.d dVar, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, ib0 ib0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i7 = 1;
        int i10 = calendar.get(1);
        int value = ((ib0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (ib0Var2.getValue() - 120) % 12);
        ib0Var.setMinValue(1);
        ib0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = ib0Var.getValue();
        int value3 = ib0Var3.getValue();
        int value4 = ib0Var4.getValue();
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
    public static org.telegram.ui.ActionBar.t1 c0(final int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, Object... objArr) {
        String str;
        char c10;
        String str2;
        final long j3;
        long n10;
        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o4 = di.v8.o(tLObject);
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
                        di.v8.y(i7, false).q(new Runnable() { // from class: org.telegram.ui.Components.z1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity u02 = org.telegram.messenger.g0.u0();
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.e6 bVar = (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) ? new fi.b() : T != null ? T.getResourceProvider() : null;
                                int i10 = i7;
                                long j10 = j3;
                                new di.cb(u02, bVar, o4, 13, org.telegram.messenger.m5.s(i10, j10), new org.telegram.messenger.c6(22), j10).show();
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
                    r0(e2Var2, org.telegram.messenger.hd.M0(2131749366, null), org.telegram.messenger.hd.M0(2131749367, null), null);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z10 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long n11 = org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (n11 >= 0) {
                        str2 = org.telegram.messenger.q10.j(org.telegram.messenger.np.s1(i7).a2(Long.valueOf(n11)), true);
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-n11));
                        str2 = M0 != null ? M0.title : "";
                    }
                    if (e2Var2 == null) {
                        e2Var2 = LaunchActivity.Q();
                    }
                    r0(e2Var2, org.telegram.messenger.hd.M0(2131748539, null), org.telegram.messenger.hd.a0(null, null, 2131748540, str2), null);
                    org.telegram.messenger.np.s1(i7).n2(0, n11);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.e2 Q = e2Var2 == null ? LaunchActivity.Q() : e2Var2;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749252, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749244, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749258, null), null);
                            return null;
                        }
                        r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749259, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749255, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749257, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749254, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749256, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        r0(Q, org.telegram.messenger.hd.M0(2131749253, null), org.telegram.messenger.hd.M0(2131749251, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        j0(tL_error.text, Q);
                        return null;
                    }
                    String M02 = org.telegram.messenger.hd.M0(2131749253, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
                    sb2.append(tL_error.text);
                    r0(Q, M02, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.e2 Q2 = e2Var2 == null ? LaunchActivity.Q() : e2Var2;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            r0(Q2, null, org.telegram.messenger.hd.M0(2131749179, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            r0(Q2, null, org.telegram.messenger.hd.M0(2131750687, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            u0(Q2.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                            return null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.ui.Cells.y0.r(null, 2131751105, sb3, "\n");
                        sb3.append(tL_error.text);
                        r0(Q2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i10 = org.telegram.messenger.ns.M0;
                    if (z12 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (e2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (e2Var2.getParentActivity() != null) {
                                e2Var2.showDialog(new ug.j0(5, i7, e2Var2.getParentActivity(), e2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                e2Var2.presentFragment(new l81(0));
                                return null;
                            }
                            e2Var2.presentFragment(new l81(1));
                            return null;
                        }
                        if (e2Var2 != null) {
                            e0(tL_error, e2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            org.telegram.messenger.ns.f(i7).k(i10, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.e2 Q3 = e2Var2 == null ? LaunchActivity.Q() : e2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new ug.j0(5, i7, Q3.getParentActivity(), Q3, null));
                                    return null;
                                }
                                Q3.presentFragment(new l81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.e2 e2Var3 = Q3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, e2Var3);
                                return null;
                            }
                            e0(tL_error, e2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.e2 Q4 = e2Var2 == null ? LaunchActivity.Q() : e2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q4.getParentActivity() != null) {
                                    Q4.showDialog(new ug.j0(5, i7, Q4.getParentActivity(), Q4, null));
                                    return null;
                                }
                                Q4.presentFragment(new l81(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.e2 e2Var4 = Q4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, e2Var4);
                                return null;
                            }
                            e0(tL_error, e2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (e2Var2 != null) {
                                    r0(e2Var2, null, org.telegram.messenger.hd.M0(2131751271, null), null);
                                    return null;
                                }
                                t0(org.telegram.messenger.hd.M0(2131751271, null), null);
                                return null;
                            }
                        } else {
                            if (z10 || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long n12 = z10 ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? org.telegram.messenger.m5.n(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? org.telegram.messenger.m5.n(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str3 = tL_error.text;
                                if (str3 == null || !str3.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str4 = tL_error.text;
                                    str4.getClass();
                                    switch (str4) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            org.telegram.messenger.ns.f(i7).k(i10, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            org.telegram.messenger.ns.f(i7).k(i10, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            t0(org.telegram.messenger.hd.M0(2131748529, null), e2Var2);
                                            break;
                                    }
                                    return null;
                                }
                                String str5 = tL_error.text;
                                TLRPC.Chat M03 = n12 < 0 ? org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-n12)) : null;
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
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.e2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.t1");
                            }

                            public static void d(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i7 = 1;
                                int i10 = calendar.get(1);
                                int i11 = calendar.get(2);
                                int i12 = calendar.get(5);
                                ib0Var3.setMinValue(i10);
                                int value = ib0Var3.getValue();
                                ib0Var2.setMinValue(value == i10 ? i11 : 0);
                                int value2 = ib0Var2.getValue();
                                if (value == i10 && value2 == i11) {
                                    i7 = i12;
                                }
                                ib0Var.setMinValue(i7);
                            }

                            public static void d0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.z10 z10Var, lm lmVar) {
                                Activity W = org.telegram.messenger.g0.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                String M0 = org.telegram.messenger.hd.M0(2131747153, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = org.telegram.messenger.hd.M0(2131747154, null);
                                final z3 z3Var = new z3(context);
                                z3Var.setTextSize(1, 16.0f);
                                int i7 = org.telegram.ui.ActionBar.j6.j5;
                                org.telegram.ui.ActionBar.q6.U(z3Var, i7, e6Var);
                                org.telegram.ui.ActionBar.q6.D(z3Var, org.telegram.ui.ActionBar.j6.Oi, e6Var);
                                z3Var.setHint(org.telegram.messenger.hd.M0(2131747152, null));
                                z3Var.setInputType(17);
                                z3Var.setImeOptions(6);
                                z3Var.setMaxLines(10);
                                z3Var.setSingleLine(false);
                                z3Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                                z3Var.setCursorWidth(1.5f);
                                z3Var.A(org.telegram.ui.ActionBar.j6.q6, e6Var);
                                if (str != null) {
                                    z3Var.setText(str);
                                    z3Var.setSelection(str.length());
                                }
                                z3Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.d2
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                                        if (i10 != 6) {
                                            return false;
                                        }
                                        z3 z3Var2 = z3.this;
                                        String trim = z3Var2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : t4.a.matcher(trim.trim()).matches())) {
                                            org.telegram.messenger.g0.E3(z3Var2);
                                            return true;
                                        }
                                        z10Var.a(trim);
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
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
                                org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i7);
                                z3Var.setBackground(d02);
                                org.telegram.ui.ActionBar.q6.j(z3Var, d02, K, null, e6Var);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.addView(z3Var, c8.ja.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i10 = c71.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    c71 c71Var = new c71(context, e6Var);
                                    c71Var.setWebPage(webPage);
                                    f10.addView(c71Var, c8.ja.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.c();
                                alertDialog$Builder.o(f10);
                                t1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                int i11 = 4;
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751354, null), new f1(i11, z3Var, z10Var));
                                int i12 = 0;
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new e2(i12));
                                if (lmVar != null) {
                                    alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131751598, null), new s0(i11, lmVar));
                                }
                                t1VarArr[0] = t1Var;
                                t1Var.k0 = false;
                                t1Var.setOnDismissListener(new m0(z3Var, 2));
                                t1VarArr[0].setOnShowListener(new f2(z3Var, i12));
                                t1VarArr[0].show();
                                TextView textView = (TextView) t1VarArr[0].d(-3);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                }
                            }

                            public static void e(TextView textView, ib0 ib0Var, x3 x3Var, y3 y3Var) {
                                int value = ib0Var.getValue();
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
                                int i7 = timeInMillis / 86400;
                                int i10 = (timeInMillis % 86400) / 3600;
                                int i11 = (timeInMillis % 3600) / 60;
                                textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747174, org.telegram.messenger.hd.a0(null, null, 2131747173, i7 > 0 ? org.telegram.messenger.hd.G(i7, "Days", new Object[0]) : "", i10 > 0 ? org.telegram.messenger.hd.G(i10, "Hours", new Object[0]) : "", i11 > 0 ? org.telegram.messenger.hd.G(i11, "Minutes", new Object[0]) : "").trim()));
                            }

                            public static void e0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                org.telegram.ui.ActionBar.t1 t1Var;
                                int i7;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || e2Var == null || e2Var.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(e2Var.getParentActivity());
                                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                String str = tL_error.text;
                                str.getClass();
                                i7 = 1;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        t1Var.U = org.telegram.messenger.hd.M0(2131748758, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        t1Var.U = org.telegram.messenger.hd.M0(2131746592, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        t1Var.U = org.telegram.messenger.hd.M0(2131751748, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131749389, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131752271, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        t1Var.U = org.telegram.messenger.hd.M0(2131743728, null);
                                        break;
                                    case "PEER_FLOOD":
                                        t1Var.U = org.telegram.messenger.hd.M0(2131748126, null);
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131748331, null), new v2(i7, e2Var));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131749387, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131752269, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131754477, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131754364, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        t1Var.U = org.telegram.messenger.hd.M0(2131742842, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        t1Var.U = org.telegram.messenger.hd.M0(2131754465, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131749390, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131752272, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131749388, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131752270, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        t1Var.S = org.telegram.messenger.hd.M0(2131752282, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131752283, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131752284, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        t1Var.S = org.telegram.messenger.hd.M0(2131752282, null);
                                        t1Var.U = org.telegram.messenger.hd.M0(2131743757, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z10) {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131749386, null);
                                            break;
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131752268, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        t1Var.U = org.telegram.messenger.hd.M0(2131754476, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z11) {
                                            if (!z10) {
                                                t1Var.U = org.telegram.messenger.hd.M0(2131749109, null);
                                                break;
                                            } else {
                                                t1Var.U = org.telegram.messenger.hd.M0(2131749112, null);
                                                break;
                                            }
                                        } else {
                                            t1Var.U = org.telegram.messenger.hd.M0(2131749111, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        t1Var.S = org.telegram.messenger.hd.M0(2131743306, null);
                                        t1Var.U = org.telegram.messenger.hd.M0(2131743376, null);
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
                                        sb2.append(tL_error.text);
                                        t1Var.U = sb2.toString();
                                        break;
                                }
                                i5.c.C(null, 2131747831, alertDialog$Builder, null);
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
                                        user = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(tL_missingInvitee2.user_id));
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
                                org.telegram.messenger.g0.i3(new ai.f1(i7, chat, arrayList, arrayList2, arrayList3, 15), 200L);
                            }

                            public static org.telegram.ui.ActionBar.t1 f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
                                if (activity == null) {
                                    z10Var.a(Boolean.FALSE);
                                    return null;
                                }
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
                                int i10 = 1;
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                boolean[] zArr = {false};
                                di.ub ubVar = new di.ub(activity, 23);
                                org.telegram.messenger.ns.i(ubVar);
                                org.telegram.ui.ActionBar.q6.U(ubVar, org.telegram.ui.ActionBar.j6.j5, e6Var);
                                ubVar.setTextSize(1, 16.0f);
                                int i11 = 3;
                                ubVar.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                ubVar.setText(charSequence);
                                g3 g3Var = new g3(activity, c2VarArr, i10);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.H = 6;
                                alertDialog$Builder.o(g3Var);
                                TextView textView = new TextView(activity);
                                org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.E8, e6Var, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                g3Var.addView(textView, c8.ja.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                g3Var.addView(ubVar, c8.ja.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, e6Var);
                                    c2VarArr[0] = c2Var;
                                    int i12 = org.telegram.ui.ActionBar.j6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), 7, org.telegram.messenger.g0.L(12.0f));
                                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
                                    c2Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.q6.j(c2Var, h02, null, M, e6Var);
                                    c2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (org.telegram.messenger.hd.a0 ? 5 : 3) | 16;
                                    c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    c2VarArr[0].e(charSequence2, "", false, false, false);
                                    c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                                    g3Var.addView(c2VarArr[0], c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new u0(i11, zArr));
                                }
                                alertDialog$Builder.k(str2, new s2(i7, z10Var, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                if (z10) {
                                    t1Var.Y0 = true;
                                }
                                t1Var.show();
                                return t1Var;
                            }

                            public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i7, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
                                long j11;
                                int i10;
                                long j12;
                                int i11;
                                int i12;
                                int i13;
                                boolean z10;
                                boolean z11;
                                String G;
                                int value = ib0Var.getValue();
                                int value2 = ib0Var2.getValue();
                                int value3 = ib0Var3.getValue();
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
                                ib0Var.setMinValue(0);
                                if (j14 > 0) {
                                    ib0Var.setMaxValue(i11);
                                }
                                int value4 = ib0Var.getValue();
                                ib0Var2.setMinValue(value4 == 0 ? i16 : 0);
                                if (j14 > 0) {
                                    ib0Var2.setMaxValue(value4 == i11 ? i12 : 23);
                                }
                                int value5 = ib0Var2.getValue();
                                ib0Var3.setMinValue((value4 == 0 && value5 == i16) ? i17 : 0);
                                if (j14 > 0) {
                                    ib0Var3.setMaxValue((value4 == i11 && value5 == i12) ? i15 : 59);
                                }
                                int value6 = ib0Var3.getValue();
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
                                        textView2.setText(org.telegram.messenger.hd.a0("VoipChannelScheduleInfo", null, 2131743463, objArr));
                                    } else {
                                        z10 = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z11 ? 1 : 0] = G;
                                        textView2.setText(org.telegram.messenger.hd.a0("VoipGroupScheduleInfo", null, 2131743342, objArr2));
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
                            /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String, org.telegram.ui.ActionBar.e6, org.telegram.ui.ActionBar.q1] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [org.telegram.ui.Cells.c2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.e2] */
                            /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [org.telegram.ui.Cells.c2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void g0(org.telegram.ui.ActionBar.e2 e2Var, long j3, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final org.telegram.messenger.pr prVar, org.telegram.ui.ActionBar.e6 e6Var) {
                                long j10;
                                boolean z11;
                                String str;
                                String M0;
                                ?? r92;
                                ?? r14;
                                TextView textView;
                                String str2;
                                if (e2Var.getParentActivity() == null) {
                                    return;
                                }
                                final org.telegram.messenger.c accountInstance = e2Var.getAccountInstance();
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var);
                                SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).e7;
                                int i7 = 1;
                                if (encryptedChat == null) {
                                    j10 = j3;
                                    if (!org.telegram.messenger.k5.w("dialog_bar_report", j10, sharedPreferences, false)) {
                                        z11 = false;
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                        if (user == null) {
                                            t1Var.S = org.telegram.messenger.hd.a0("BlockUserTitle", null, 2131753685, org.telegram.messenger.q10.j(user, true));
                                            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserAlert", null, 2131753691, org.telegram.messenger.q10.j(user, true)));
                                            String M02 = org.telegram.messenger.hd.M0(2131753693, null);
                                            int i10 = 2;
                                            r92 = new org.telegram.ui.Cells.c2[2];
                                            int i11 = 0;
                                            ?? linearLayout = new LinearLayout(e2Var.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i12 = 0;
                                            while (i12 < i10) {
                                                if (i12 != 0 || z11) {
                                                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i7, e2Var.getParentActivity(), e6Var);
                                                    r92[i12] = c2Var;
                                                    c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(i11));
                                                    r92[i12].setTag(Integer.valueOf(i12));
                                                    if (i12 == 0) {
                                                        r92[i12].e(org.telegram.messenger.hd.M0(2131751502, null), "", true, false, false);
                                                        str2 = M02;
                                                    } else {
                                                        str2 = M02;
                                                        r92[i12].e(org.telegram.messenger.hd.a0("DeleteThisChat", null, 2131751482, new Object[i11]), "", true, false, false);
                                                    }
                                                    r92[i12].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    linearLayout.addView(r92[i12], c8.ja.o(-1, -2));
                                                    r92[i12].setOnClickListener(new n0(r92, 1));
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
                                                t1Var.S = org.telegram.messenger.hd.M0(2131746200, null);
                                                if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                                                    t1Var.U = org.telegram.messenger.hd.M0(2131746204, null);
                                                } else {
                                                    t1Var.U = org.telegram.messenger.hd.M0(2131746205, null);
                                                }
                                            } else {
                                                t1Var.S = org.telegram.messenger.hd.M0(2131746189, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ReportUnrelatedGroupText", null, 2131746188, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                t1Var.U = org.telegram.messenger.hd.M0(2131746187, null);
                                            }
                                            M0 = org.telegram.messenger.hd.M0(2131746230, str);
                                            r92 = str;
                                            r14 = str;
                                        }
                                        final org.telegram.ui.Cells.c2[] c2VarArr = r92;
                                        final long j11 = j10;
                                        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.h1
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                                                org.telegram.ui.Cells.c2 c2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                org.telegram.messenger.c cVar = accountInstance;
                                                if (user2 != null) {
                                                    org.telegram.messenger.np.s1(cVar.a).w(user2.id);
                                                }
                                                org.telegram.ui.Cells.c2[] c2VarArr2 = c2VarArr;
                                                long j12 = j11;
                                                TLRPC.Chat chat2 = chat;
                                                if (c2VarArr2 == null || ((c2Var2 = c2VarArr2[0]) != null && c2Var2.b())) {
                                                    org.telegram.messenger.np.s1(cVar.a).o4(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                                                }
                                                org.telegram.messenger.pr prVar2 = prVar;
                                                if (c2VarArr2 != null && !c2VarArr2[1].b()) {
                                                    prVar2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    org.telegram.messenger.np.s1(cVar.a).X(0, j12, false);
                                                } else if (org.telegram.messenger.t3.r0(chat2)) {
                                                    org.telegram.messenger.np.s1(cVar.a).X(0, j12, false);
                                                } else {
                                                    int i14 = cVar.a;
                                                    org.telegram.messenger.np.s1(i14).f0(-j12, org.telegram.messenger.np.s1(i14).a2(Long.valueOf(org.telegram.messenger.m10.i(i14).e())));
                                                }
                                                prVar2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r14), r14);
                                        e2Var.showDialog(t1Var);
                                        textView = (TextView) t1Var.d(-1);
                                        if (textView == null) {
                                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, r14);
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
                                final org.telegram.ui.Cells.c2[] c2VarArr2 = r92;
                                final long j112 = j10;
                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.h1
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i13) {
                                        org.telegram.ui.Cells.c2 c2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        org.telegram.messenger.c cVar = accountInstance;
                                        if (user2 != null) {
                                            org.telegram.messenger.np.s1(cVar.a).w(user2.id);
                                        }
                                        org.telegram.ui.Cells.c2[] c2VarArr22 = c2VarArr2;
                                        long j12 = j112;
                                        TLRPC.Chat chat2 = chat;
                                        if (c2VarArr22 == null || ((c2Var2 = c2VarArr22[0]) != null && c2Var2.b())) {
                                            org.telegram.messenger.np.s1(cVar.a).o4(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                                        }
                                        org.telegram.messenger.pr prVar2 = prVar;
                                        if (c2VarArr22 != null && !c2VarArr22[1].b()) {
                                            prVar2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            org.telegram.messenger.np.s1(cVar.a).X(0, j12, false);
                                        } else if (org.telegram.messenger.t3.r0(chat2)) {
                                            org.telegram.messenger.np.s1(cVar.a).X(0, j12, false);
                                        } else {
                                            int i14 = cVar.a;
                                            org.telegram.messenger.np.s1(i14).f0(-j12, org.telegram.messenger.np.s1(i14).a2(Long.valueOf(org.telegram.messenger.m10.i(i14).e())));
                                        }
                                        prVar2.a(1);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r14), r14);
                                e2Var.showDialog(t1Var2);
                                textView = (TextView) t1Var2.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static boolean h(Context context, int i7, long j3, boolean z10) {
                                TLRPC.Chat M0;
                                if (!org.telegram.messenger.m5.z(j3) || (M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3))) == null || !M0.slowmode_enabled || org.telegram.messenger.t3.N(M0)) {
                                    return false;
                                }
                                if (!z10) {
                                    TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i7).N0(M0.id);
                                    if (N0 == null) {
                                        N0 = org.telegram.messenger.vr.a0(i7).F0(M0.id, org.telegram.messenger.t3.T(M0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (N0 != null && N0.slowmode_next_send_date >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    return false;
                                }
                                K(context, M0.title, org.telegram.messenger.hd.M0(2131745302, null)).p();
                                return true;
                            }

                            public static void h0(org.telegram.ui.an anVar, org.telegram.messenger.gj gjVar, long j3, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.uf ufVar) {
                                if (anVar.getParentActivity() == null || gjVar == null) {
                                    return;
                                }
                                org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                                TLRPC.User a22 = j3 > 0 ? org.telegram.messenger.np.s1(accountInstance.a).a2(Long.valueOf(j3)) : null;
                                TLRPC.Chat M0 = j3 < 0 ? org.telegram.messenger.np.s1(accountInstance.a).M0(Long.valueOf(-j3)) : null;
                                if (a22 == null && M0 == null) {
                                    return;
                                }
                                int i7 = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), e6Var);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.Q0 = false;
                                t1Var.O = new m0(ufVar, i7);
                                t1Var.S = org.telegram.messenger.hd.M0(2131753692, null);
                                if (a22 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753686, org.telegram.messenger.q10.j(a22, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753686, M0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(anVar.getParentActivity());
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, anVar.getParentActivity(), e6Var)};
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                                c2VarArr[0].setTag(0);
                                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131751502, null), "", true, false, false);
                                c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                linearLayout.addView(c2VarArr[0], c8.ja.o(-1, -2));
                                c2VarArr[0].setOnClickListener(new n0(c2VarArr, i7));
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753695, null), new p0(a22, accountInstance, anVar, M0, gjVar, c2VarArr, e6Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                anVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                }
                            }

                            public static org.telegram.ui.ActionBar.t1 i(Activity activity, p4 p4Var) {
                                if (org.telegram.messenger.m10.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                di.s3 s3Var = t1Var.M0;
                                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                                LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
                                for (int i7 = 0; i7 < 4; i7++) {
                                    if (org.telegram.messenger.m10.i(i7).f() != null) {
                                        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                                        kVar.f = i7;
                                        TLRPC.User f10 = org.telegram.messenger.m10.i(i7).f();
                                        t8 t8Var = kVar.e;
                                        t8Var.r(f10);
                                        kVar.a.l(org.telegram.messenger.g5.m(0, f10.first_name, f10.last_name), false);
                                        i9 i9Var = kVar.c;
                                        i9Var.getImageReceiver().d = i7;
                                        i9Var.f(f10, t8Var);
                                        kVar.d.setVisibility(4);
                                        kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                                        kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                                        e10.addView(kVar, c8.ja.o(-1, 50));
                                        kVar.setOnClickListener(new ah.g((Object) t1VarArr, (Runnable) s3Var, (Object) p4Var, 22));
                                    }
                                }
                                t1Var.S = org.telegram.messenger.hd.M0(2131745671, null);
                                alertDialog$Builder.o(e10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
                                t1VarArr[0] = t1Var;
                                return t1Var;
                            }

                            public static void i0(Context context, int i7, long j3) {
                                org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, null, false);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                f10.addView(frameLayout, c8.ja.t(-1, 92, 17, 0, 0, 0, 0));
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                imageView.setImageResource(R.drawable.story_link);
                                imageView.setScaleX(2.0f);
                                imageView.setScaleY(2.0f);
                                frameLayout2.addView(imageView, c8.ja.e(-1, -1, 17));
                                int L = org.telegram.messenger.g0.L(80.0f);
                                int i10 = org.telegram.ui.ActionBar.j6.Fi;
                                ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.v0(i10));
                                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
                                frameLayout2.setBackground(L2);
                                org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, null);
                                frameLayout.addView(frameLayout2, c8.ja.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i11 = org.telegram.ui.ActionBar.j6.G6;
                                org.telegram.messenger.k5.m(textView, i11, null, 1, 20.0f);
                                textView.setText(org.telegram.messenger.hd.M0(2131752624, null));
                                textView.setGravity(17);
                                TextView f11 = org.telegram.messenger.i20.f(f10, textView, c8.ja.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                org.telegram.ui.ActionBar.q6.U(f11, i11, null);
                                f11.setTextSize(1, 14.0f);
                                org.telegram.messenger.k5.q(null, null, 2131752625, new Object[]{org.telegram.messenger.m5.l(i7, j3)}, f11);
                                f11.setGravity(17);
                                f10.addView(f11, c8.ja.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                hi.d dVar = new hi.d(context, null, true);
                                dVar.i(org.telegram.messenger.hd.M0(2131752626, null), false, true);
                                f10.addView(dVar, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                k10.O = f10;
                                dVar.setOnClickListener(new org.telegram.ui.gd(i7, dVar, k10, j3));
                                k10.O();
                                k10.show();
                            }

                            public static org.telegram.ui.ActionBar.t1 j(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                String M0 = org.telegram.messenger.hd.M0(2131754243, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.U = M0;
                                int i7 = org.telegram.ui.ActionBar.j6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
                                alertDialog$Builder.n(i7, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new h0(context, 0));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                                return t1Var;
                            }

                            public static void j0(String str, org.telegram.ui.ActionBar.e2 e2Var) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || e2Var == null || e2Var.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getParentActivity());
                                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                e2Var.showDialog(t1Var, true, null);
                            }

                            public static void k(Context context, org.telegram.ui.ActionBar.e6 e6Var, r4 r4Var) {
                                if (context == null) {
                                    return;
                                }
                                boolean z10 = false;
                                int i7 = org.telegram.ui.ActionBar.j6.j5;
                                int f10 = e6Var != null ? e6Var.f(i7) : org.telegram.ui.ActionBar.j6.x0(null, i7, false);
                                int i10 = org.telegram.ui.ActionBar.j6.h5;
                                int f11 = e6Var != null ? e6Var.f(i10) : org.telegram.ui.ActionBar.j6.x0(null, i10, false);
                                int i11 = org.telegram.ui.ActionBar.j6.Aj;
                                if (e6Var != null) {
                                    e6Var.f(i11);
                                } else {
                                    org.telegram.ui.ActionBar.j6.x0(null, i11, false);
                                }
                                int i12 = org.telegram.ui.ActionBar.j6.Ej;
                                if (e6Var != null) {
                                    e6Var.f(i12);
                                } else {
                                    org.telegram.ui.ActionBar.j6.x0(null, i12, false);
                                }
                                int i13 = org.telegram.ui.ActionBar.j6.E8;
                                if (e6Var != null) {
                                    e6Var.f(i13);
                                } else {
                                    org.telegram.ui.ActionBar.j6.x0(null, i13, false);
                                }
                                int i14 = org.telegram.ui.ActionBar.j6.G8;
                                if (e6Var != null) {
                                    e6Var.f(i14);
                                } else {
                                    org.telegram.ui.ActionBar.j6.x0(null, i14, false);
                                }
                                int i15 = org.telegram.ui.ActionBar.j6.i6;
                                if (e6Var != null) {
                                    e6Var.f(i15);
                                } else {
                                    org.telegram.ui.ActionBar.j6.x0(null, i15, false);
                                }
                                int i16 = org.telegram.ui.ActionBar.j6.Ji;
                                int f12 = e6Var != null ? e6Var.f(i16) : org.telegram.ui.ActionBar.j6.x0(null, i16, false);
                                int i17 = org.telegram.ui.ActionBar.j6.Fi;
                                int f13 = e6Var != null ? e6Var.f(i17) : org.telegram.ui.ActionBar.j6.x0(null, i17, false);
                                int i18 = org.telegram.ui.ActionBar.j6.Hi;
                                int f14 = e6Var != null ? e6Var.f(i18) : org.telegram.ui.ActionBar.j6.x0(null, i18, false);
                                org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
                                ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                c4 c4Var = new c4(context, e6Var, iArr);
                                c4Var.setMinValue(0);
                                c4Var.setMaxValue(16);
                                c4Var.setTextColor(f10);
                                c4Var.setValue(0);
                                c4Var.setFormatter(new t0(iArr, 1));
                                d4 d4Var = new d4(context, c4Var, 0);
                                boolean z11 = true;
                                d4Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                d4Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(org.telegram.messenger.hd.M0(2131753877, null));
                                textView.setTextColor(f10);
                                i5.c.v(textView, 1, 20.0f);
                                frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                d4Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, z11, z11, z10, 1);
                                linearLayout.addView(c4Var, c8.ja.l(1.0f, 0, org.telegram.messenger.ns.t4));
                                w3Var.setPadding(0, 0, 0, 0);
                                w3Var.setGravity(17);
                                w3Var.setTextColor(f12);
                                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                                w3Var.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                w3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, f13, f14, f14));
                                d4Var.addView(w3Var, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
                                w3Var.setText(org.telegram.messenger.hd.M0(2131751434, null));
                                c4Var.setOnValueChangedListener(new s(w3Var, 10));
                                w3Var.setOnClickListener(new bi.f4(iArr, c4Var, r4Var, ouVar, 9));
                                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.b;
                                u2Var.O = d4Var;
                                u2Var.show();
                                u2Var.v0(f11);
                                u2Var.P(f11);
                            }

                            public static void k0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, TL_stars.StarGift starGift, long j3, Runnable runnable) {
                                TLObject e22 = org.telegram.messenger.np.s1(i7).e2(j3);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                f10.addView(new di.z4(context, starGift, e22), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var);
                                textView.setTextSize(1, 16.0f);
                                org.telegram.messenger.k5.q(null, null, 2131749594, new Object[]{org.telegram.messenger.m5.H(null, null, e22)}, textView);
                                f10.addView(textView, c8.ja.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                alertDialog$Builder.o(f10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749595, null), new s0(2, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.p();
                            }

                            public static org.telegram.messenger.ou l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.z10 z10Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (context == null) {
                                    return null;
                                }
                                org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
                                int i7 = 0;
                                ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
                                ib0 ib0Var = new ib0(context, e6Var);
                                ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                ib0Var.setItemCount(5);
                                ib0 ib0Var2 = new ib0(context, e6Var);
                                ib0Var2.setItemCount(5);
                                ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                ib0 ib0Var3 = new ib0(context, e6Var);
                                ib0Var3.setItemCount(5);
                                ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                u3 u3Var = new u3(context, ib0Var, ib0Var2, ib0Var3);
                                u3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                u3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.j5, e6Var, 1, 20.0f);
                                frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                u3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i10 = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i11 = calendar.get(5);
                                int i12 = calendar.get(2);
                                int i13 = calendar.get(1);
                                int i14 = i13 + 1;
                                o2 o2Var = new o2(ib0Var3, i14, ib0Var, ib0Var2, i13, i12, i11);
                                System.currentTimeMillis();
                                v3 v3Var = new v3(context);
                                linearLayout.addView(ib0Var, c8.ja.l(0.25f, 0, org.telegram.messenger.ns.t4));
                                ib0Var.setMinValue(1);
                                ib0Var.setMaxValue(31);
                                ib0Var.setWrapSelectorWheel(false);
                                ib0Var.setFormatter(new e2(5));
                                s sVar = new s(o2Var, 9);
                                ib0Var.setOnScrollListener(sVar);
                                ib0Var2.setMinValue(0);
                                ib0Var2.setMaxValue(11);
                                ib0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(ib0Var2, c8.ja.l(0.5f, 0, org.telegram.messenger.ns.t4));
                                ib0Var2.setFormatter(new e2(6));
                                ib0Var2.setOnScrollListener(sVar);
                                ib0Var3.setMinValue(i10);
                                ib0Var3.setMaxValue(i14);
                                ib0Var3.setWrapSelectorWheel(false);
                                ib0Var3.setFormatter(new l2.t(i14, 5));
                                linearLayout.addView(ib0Var3, c8.ja.l(0.25f, 0, org.telegram.messenger.ns.t4));
                                ib0Var3.setOnScrollListener(sVar);
                                if (tL_birthday != null) {
                                    ib0Var.setValue(tL_birthday.day);
                                    ib0Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        ib0Var3.setValue(tL_birthday.year);
                                    } else {
                                        ib0Var3.setValue(i14);
                                    }
                                } else {
                                    ib0Var.setValue(calendar.get(5));
                                    ib0Var2.setValue(calendar.get(2));
                                    ib0Var3.setValue(i14);
                                }
                                o2Var.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    z70 z70Var = new z70(context, null);
                                    z70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    z70Var.setTextSize(1, 13.0f);
                                    org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q5, e6Var);
                                    org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
                                    z70Var.setGravity(17);
                                    frameLayout2.addView(z70Var, c8.ja.e(-2, -2, 17));
                                    u3Var.addView(frameLayout2, c8.ja.o(-1, -2));
                                    int i15 = org.telegram.messenger.m10.t0;
                                    a2 a2Var = new a2(i15, z70Var, 1);
                                    a2Var.run();
                                    org.telegram.messenger.ns.f(i15).h(frameLayout2, org.telegram.messenger.ns.k0, new q2(a2Var, i7));
                                    org.telegram.messenger.g5.r(i15).D(false);
                                }
                                if (z10) {
                                    hi.d dVar = new hi.d(context, e6Var, false);
                                    dVar.i(org.telegram.messenger.hd.M0(2131751670, null), false, true);
                                    dVar.setOnClickListener(new bi.x2(ib0Var3, i14, o2Var, 9));
                                    u3Var.addView(dVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                v3Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                v3Var.setGravity(17);
                                org.telegram.ui.ActionBar.q6.U(v3Var, org.telegram.ui.ActionBar.j6.Ji, e6Var);
                                v3Var.setTextSize(1, 14.0f);
                                v3Var.setTypeface(org.telegram.messenger.g0.o());
                                v3Var.setText(str2);
                                int L = org.telegram.messenger.g0.L(24.0f);
                                int i16 = org.telegram.ui.ActionBar.j6.Fi;
                                int w02 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var);
                                int i17 = org.telegram.ui.ActionBar.j6.Hi;
                                int w03 = org.telegram.ui.ActionBar.j6.w0(i17, e6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
                                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i17);
                                v3Var.setBackground(k02);
                                org.telegram.ui.ActionBar.q6.j(v3Var, k02, M, M2, e6Var);
                                c8.na.b(v3Var, 0.02f, 1.2f);
                                u3Var.addView(v3Var, c8.ja.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
                                v3Var.setOnClickListener(new di.w9(ib0Var, ib0Var2, ib0Var3, i14, ouVar, z10Var));
                                if (z11) {
                                    hi.d dVar2 = new hi.d(context, e6Var, false);
                                    dVar2.i(org.telegram.messenger.hd.M0(2131753715, null), false, true);
                                    dVar2.f();
                                    dVar2.setOnClickListener(new n2(i7, ouVar, z10Var));
                                    u3Var.addView(dVar2, c8.ja.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((org.telegram.ui.ActionBar.u2) ouVar.b).O = u3Var;
                                return ouVar;
                            }

                            public static void l0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, boolean z10, final org.telegram.messenger.s10 s10Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    final int i7 = 1;
                                    final org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                                    final int i10 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                    String M0 = org.telegram.messenger.hd.M0(2131747779, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i11 = org.telegram.ui.ActionBar.j6.j5;
                                    org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i11, e6Var)));
                                    org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i11);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.q6.j(textView, d02, K, null, e6Var);
                                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, e6Var);
                                    c2Var.setMultiline(true);
                                    c2Var.getTextView().getLayoutParams().width = -1;
                                    c2Var.getTextView().setSingleLine(false);
                                    c2Var.getTextView().setMaxLines(3);
                                    c2Var.getTextView().setTextSize(1, 16.0f);
                                    c2Var.e(org.telegram.messenger.hd.M0(z10 ? 2131752877 : 2131752876, null), "", false, false, false);
                                    c2Var.setOnClickListener(new x0(c2Var, i10));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, c8.ja.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(c2Var, c8.ja.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.o(linearLayout);
                                    t1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747817, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.y0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                                            switch (i10) {
                                                case 0:
                                                    s10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
                                                    if (t1Var3 != null) {
                                                        t1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    s10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.t1 t1Var4 = t1VarArr[0];
                                                    if (t1Var4 != null) {
                                                        t1Var4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.y0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                                            switch (i7) {
                                                case 0:
                                                    s10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                                                    org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
                                                    if (t1Var3 != null) {
                                                        t1Var3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    s10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
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
                            public static void m(org.telegram.ui.ActionBar.e2 e2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                org.telegram.ui.Cells.c2 c2Var;
                                ?? r52;
                                if (e2Var == null) {
                                    return;
                                }
                                Context context = e2Var.getContext();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                n4 n4Var = new n4(context, null);
                                org.telegram.messenger.ns.i(n4Var);
                                org.telegram.ui.ActionBar.q6.U(n4Var, org.telegram.ui.ActionBar.j6.j5, null);
                                org.telegram.ui.ActionBar.q6.G(n4Var, org.telegram.ui.ActionBar.j6.Xc, null);
                                n4Var.setTextSize(1, 16.0f);
                                n4Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                o4 o4Var = new o4(context, c2VarArr2);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.H = 6;
                                alertDialog$Builder.o(o4Var);
                                t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
                                t8Var.u(org.telegram.messenger.g0.L(18.0f));
                                i9 i9Var = new i9(context);
                                i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                o4Var.addView(i9Var, c8.ja.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                                org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.E8, null);
                                j5Var.setTextSize(20);
                                j5Var.setTypeface(org.telegram.messenger.g0.o());
                                j5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                j5Var.setEllipsizeByGradient(true);
                                j5Var.l(user.first_name, false);
                                if (user.scam) {
                                    j5Var.i(org.telegram.ui.ActionBar.j6.g1);
                                } else if (user.fake) {
                                    j5Var.i(org.telegram.ui.ActionBar.j6.h1);
                                } else if (user.verified) {
                                    Drawable g10 = i5.c.g(context, R.drawable.verified_area);
                                    int i7 = org.telegram.ui.ActionBar.j6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.q6.x(j5Var, g10, i7, null, mode);
                                    Drawable g11 = i5.c.g(context, R.drawable.verified_check);
                                    c2VarArr = c2VarArr2;
                                    org.telegram.ui.ActionBar.q6.x(j5Var, g11, org.telegram.ui.ActionBar.j6.A9, null, mode);
                                    j5Var.i(new fq(g10, g11));
                                    TextView textView = new TextView(context);
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.m5, null);
                                    int i10 = 1;
                                    org.telegram.messenger.i20.p(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new z0(user, e2Var, alertDialog$Builder, i10));
                                    SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.hd.M0(2131748335, null) + "  ");
                                    eq eqVar = new eq(R.drawable.attach_arrow_right, 0);
                                    eqVar.n = 1;
                                    eqVar.c(org.telegram.messenger.g0.L(10.0f));
                                    valueOf.setSpan(eqVar, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z10 = org.telegram.messenger.hd.a0;
                                    o4Var.addView(j5Var, c8.ja.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f));
                                    boolean z11 = org.telegram.messenger.hd.a0;
                                    o4Var.addView(textView, c8.ja.d(-1, -2.0f, (!z11 ? 5 : 3) | 48, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                    o4Var.addView(n4Var, c8.ja.d(-2, -2.0f, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    c2Var = new org.telegram.ui.Cells.c2(1, context, e2Var.getResourceProvider());
                                    c2VarArr[0] = c2Var;
                                    if (!c2Var.I) {
                                        org.telegram.ui.Cells.b2 b2Var = c2Var.c;
                                        b2Var.setLines(3);
                                        b2Var.setMaxLines(3);
                                        b2Var.setSingleLine(false);
                                    }
                                    c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                                    c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131747780, org.telegram.messenger.q10.p(user))), "", true, false, false);
                                    c2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                    c2VarArr[0].c(true, false);
                                    o4Var.addView(c2VarArr[0], c8.ja.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    c2VarArr[0].setOnClickListener(new e0(atomicBoolean, 1));
                                    if (org.telegram.messenger.q10.z(user)) {
                                        r52 = 0;
                                        t8Var.p = 1.0f;
                                        e2Var.getCurrentAccount();
                                        t8Var.r(user);
                                        i9Var.f(user, t8Var);
                                    } else {
                                        t8Var.p = 0.8f;
                                        t8Var.g(12);
                                        r52 = 0;
                                        i9Var.j(null, null, t8Var, user);
                                    }
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744915, r52), new s0(3, runnable));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r52), r52);
                                    e2Var.showDialog(t1Var);
                                    n4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752896, r52), new a1(1, context, t1Var)));
                                }
                                c2VarArr = c2VarArr2;
                                TextView textView2 = new TextView(context);
                                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.m5, null);
                                int i102 = 1;
                                org.telegram.messenger.i20.p(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new z0(user, e2Var, alertDialog$Builder, i102));
                                SpannableString valueOf2 = SpannableString.valueOf(org.telegram.messenger.hd.M0(2131748335, null) + "  ");
                                eq eqVar2 = new eq(R.drawable.attach_arrow_right, 0);
                                eqVar2.n = 1;
                                eqVar2.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf2.setSpan(eqVar2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z102 = org.telegram.messenger.hd.a0;
                                o4Var.addView(j5Var, c8.ja.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f));
                                boolean z112 = org.telegram.messenger.hd.a0;
                                o4Var.addView(textView2, c8.ja.d(-1, -2.0f, (!z112 ? 5 : 3) | 48, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f));
                                o4Var.addView(n4Var, c8.ja.d(-2, -2.0f, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                c2Var = new org.telegram.ui.Cells.c2(1, context, e2Var.getResourceProvider());
                                c2VarArr[0] = c2Var;
                                if (!c2Var.I) {
                                }
                                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                                c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131747780, org.telegram.messenger.q10.p(user))), "", true, false, false);
                                c2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                c2VarArr[0].c(true, false);
                                o4Var.addView(c2VarArr[0], c8.ja.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                c2VarArr[0].setOnClickListener(new e0(atomicBoolean, 1));
                                if (org.telegram.messenger.q10.z(user)) {
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744915, r52), new s0(3, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r52), r52);
                                e2Var.showDialog(t1Var);
                                n4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752896, r52), new a1(1, context, t1Var)));
                            }

                            public static void m0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (org.telegram.messenger.g0.E1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (vf.c.g(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                                        vf.c.s(context, Uri.parse(str), j3 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), bVar, null, false, true, false, false);
                                        return;
                                    }
                                    String d = vf.c.d(str, z10);
                                    i2 i2Var = new i2(context, str, j3, z11, bVar);
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                    String M0 = org.telegram.messenger.hd.M0(2131747779, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(d);
                                    textView.setTextSize(1, 14.0f);
                                    int i7 = org.telegram.ui.ActionBar.j6.j5;
                                    org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
                                    ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
                                    org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i7);
                                    textView.setBackground(d02);
                                    org.telegram.ui.ActionBar.q6.j(textView, d02, K, null, e6Var);
                                    LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                    f10.addView(textView, c8.ja.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i10 = c71.f;
                                    if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                        c71 c71Var = new c71(context, e6Var);
                                        c71Var.setWebPage(webPage);
                                        f10.addView(c71Var, c8.ja.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder.o(f10);
                                    t1Var.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747817, null), new s(i2Var, 8));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.p();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.String, org.telegram.ui.ActionBar.q1] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r52;
                                Context context = e2Var.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                j4 j4Var = new j4(context, null);
                                org.telegram.messenger.ns.i(j4Var);
                                org.telegram.ui.ActionBar.q6.U(j4Var, org.telegram.ui.ActionBar.j6.j5, null);
                                org.telegram.ui.ActionBar.q6.G(j4Var, org.telegram.ui.ActionBar.j6.Xc, null);
                                j4Var.setTextSize(1, 16.0f);
                                j4Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.H = 6;
                                alertDialog$Builder.o(frameLayout);
                                t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
                                t8Var.u(org.telegram.messenger.g0.L(18.0f));
                                i9 i9Var = new i9(context);
                                i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                frameLayout.addView(i9Var, c8.ja.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                                org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.E8, null);
                                j5Var.setTextSize(20);
                                j5Var.setTypeface(org.telegram.messenger.g0.o());
                                j5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                j5Var.setEllipsizeByGradient(true);
                                j5Var.l(user.first_name, false);
                                if (user.scam) {
                                    j5Var.i(org.telegram.ui.ActionBar.j6.g1);
                                } else if (user.fake) {
                                    j5Var.i(org.telegram.ui.ActionBar.j6.h1);
                                } else if (user.verified) {
                                    Drawable g10 = i5.c.g(context, R.drawable.verified_area);
                                    int i7 = org.telegram.ui.ActionBar.j6.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.q6.x(j5Var, g10, i7, null, mode);
                                    Drawable g11 = i5.c.g(context, R.drawable.verified_check);
                                    org.telegram.ui.ActionBar.q6.x(j5Var, g11, org.telegram.ui.ActionBar.j6.A9, null, mode);
                                    j5Var.i(new fq(g10, g11));
                                }
                                TextView textView = new TextView(context);
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.m5, null);
                                org.telegram.messenger.i20.p(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new z0(user, e2Var, alertDialog$Builder, 0));
                                SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.hd.M0(2131748335, null) + "  ");
                                eq eqVar = new eq(R.drawable.attach_arrow_right, 0);
                                eqVar.n = 1;
                                eqVar.c(org.telegram.messenger.g0.L(10.0f));
                                valueOf.setSpan(eqVar, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z10 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(j5Var, c8.ja.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
                                boolean z11 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(textView, c8.ja.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(j4Var, c8.ja.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.q10.z(user)) {
                                    t8Var.p = 0.8f;
                                    t8Var.g(12);
                                    r52 = 0;
                                    i9Var.j(null, null, t8Var, user);
                                } else {
                                    r52 = 0;
                                    t8Var.p = 1.0f;
                                    e2Var.getCurrentAccount();
                                    t8Var.r(user);
                                    i9Var.f(user, t8Var);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744915, r52), new s0(1, runnable));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r52), r52);
                                e2Var.showDialog(t1Var, false, new j0(1, runnable2));
                                j4Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752896, r52), new a1(0, context, t1Var)));
                            }

                            public static void n0(org.telegram.ui.ActionBar.e2 e2Var, String str, boolean z10, boolean z11) {
                                o0(e2Var, str, z10, true, z11, false, null, null, null);
                            }

                            public static org.telegram.messenger.ou o(Activity activity, org.telegram.messenger.pr prVar, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (activity == null) {
                                    return null;
                                }
                                org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(activity, e6Var);
                                ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
                                ib0 ib0Var = new ib0(activity, e6Var);
                                ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                ib0Var.setItemCount(5);
                                ib0 ib0Var2 = new ib0(activity, e6Var);
                                ib0Var2.setItemCount(5);
                                ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                ib0 ib0Var3 = new ib0(activity, e6Var);
                                ib0Var3.setItemCount(5);
                                ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
                                n3 n3Var = new n3(activity, ib0Var, ib0Var2, ib0Var3, 6);
                                n3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                n3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(org.telegram.messenger.hd.M0(2131752132, null));
                                org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.j5, e6Var, 1, 20.0f);
                                frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                di.ub ubVar = new di.ub(activity, 20);
                                linearLayout.addView(ib0Var, c8.ja.l(0.25f, 0, org.telegram.messenger.ns.t4));
                                ib0Var.setMinValue(1);
                                ib0Var.setMaxValue(31);
                                ib0Var.setWrapSelectorWheel(false);
                                ib0Var.setFormatter(new e2(7));
                                r1 r1Var = new r1(ib0Var, ib0Var2, ib0Var3, 2);
                                ib0Var.setOnValueChangedListener(r1Var);
                                ib0Var2.setMinValue(0);
                                ib0Var2.setMaxValue(11);
                                ib0Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(ib0Var2, c8.ja.l(0.5f, 0, org.telegram.messenger.ns.t4));
                                ib0Var2.setFormatter(new e2(8));
                                ib0Var2.setOnValueChangedListener(r1Var);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i7 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i10 = calendar.get(1);
                                ib0Var3.setMinValue(i7);
                                ib0Var3.setMaxValue(i10);
                                ib0Var3.setWrapSelectorWheel(false);
                                ib0Var3.setFormatter(new e2(9));
                                linearLayout.addView(ib0Var3, c8.ja.l(0.25f, 0, org.telegram.messenger.ns.t4));
                                ib0Var3.setOnValueChangedListener(r1Var);
                                ib0Var.setValue(31);
                                ib0Var2.setValue(12);
                                ib0Var3.setValue(i10);
                                b(ib0Var, ib0Var2, ib0Var3);
                                ubVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                ubVar.setGravity(17);
                                org.telegram.ui.ActionBar.q6.U(ubVar, org.telegram.ui.ActionBar.j6.Ji, e6Var);
                                ubVar.setTextSize(1, 14.0f);
                                ubVar.setTypeface(org.telegram.messenger.g0.o());
                                ubVar.setText(org.telegram.messenger.hd.M0(2131749065, null));
                                int L = org.telegram.messenger.g0.L(8.0f);
                                int i11 = org.telegram.ui.ActionBar.j6.Fi;
                                int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
                                int i12 = org.telegram.ui.ActionBar.j6.Hi;
                                int w03 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
                                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03);
                                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
                                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
                                ubVar.setBackground(k02);
                                org.telegram.ui.ActionBar.q6.j(ubVar, k02, M, M2, e6Var);
                                n3Var.addView(ubVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
                                ubVar.setOnClickListener(new l1(ib0Var, ib0Var2, ib0Var3, calendar, prVar, ouVar, 2));
                                ((org.telegram.ui.ActionBar.u2) ouVar.b).O = n3Var;
                                return ouVar;
                            }

                            public static void o0(org.telegram.ui.ActionBar.e2 e2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (e2Var == null || e2Var.getParentActivity() == null) {
                                    return;
                                }
                                m0(e2Var.getParentActivity(), str, z10, z11, z12, z13, e2Var instanceof org.telegram.ui.an ? ((org.telegram.ui.an) e2Var).w8 : 0L, bVar, webPage, e6Var);
                            }

                            public static void p(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, boolean z10) {
                                String M0;
                                String a02;
                                if (e2Var.getParentActivity() == null || user == null || org.telegram.messenger.q10.x(user) || org.telegram.messenger.m10.i(e2Var.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                e2Var.getCurrentAccount();
                                Activity parentActivity = e2Var.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                if (z10) {
                                    M0 = org.telegram.messenger.hd.M0(2131743609, null);
                                    a02 = org.telegram.messenger.hd.a0("VideoCallAlert", null, 2131743610, org.telegram.messenger.q10.p(user));
                                } else {
                                    M0 = org.telegram.messenger.hd.M0(2131752631, null);
                                    a02 = org.telegram.messenger.hd.a0("CallAlert", null, 2131752632, org.telegram.messenger.q10.p(user));
                                }
                                j3 j3Var = new j3(parentActivity);
                                org.telegram.messenger.ns.i(j3Var);
                                org.telegram.ui.ActionBar.q6.U(j3Var, org.telegram.ui.ActionBar.j6.j5, null);
                                j3Var.setTextSize(1, 16.0f);
                                j3Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                j3Var.setText(org.telegram.messenger.g0.X2(a02));
                                t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
                                t8Var.u(org.telegram.messenger.g0.L(12.0f));
                                t8Var.p = 1.0f;
                                e2Var.getCurrentAccount();
                                t8Var.r(user);
                                i9 i9Var = new i9(parentActivity);
                                i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                                i9Var.f(user, t8Var);
                                frameLayout.addView(i9Var, c8.ja.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(M0);
                                boolean z11 = org.telegram.messenger.hd.a0;
                                frameLayout.addView(textView, c8.ja.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
                                frameLayout.addView(j3Var, c8.ja.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.o(frameLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752634, null), new ab.j(e2Var, user, z10, 6));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                e2Var.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(Activity activity, int i7, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i10 = org.telegram.messenger.np.s1(i7).o3;
                                if ((i10 & 1) != 0) {
                                    org.telegram.ui.Cells.y0.s(null, 2131748686, arrayList, 0, arrayList2);
                                }
                                if ((i10 & 2) != 0) {
                                    org.telegram.ui.Cells.y0.s(null, 2131748688, arrayList, 1, arrayList2);
                                }
                                if ((i10 & 4) != 0) {
                                    org.telegram.ui.Cells.y0.s(null, 2131748684, arrayList, 3, arrayList2);
                                }
                                arrayList.add(org.telegram.messenger.hd.M0(2131748687, null));
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
                                alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131748685, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.o(linearLayout);
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
                                    i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    i6Var.setTag(Integer.valueOf(i11));
                                    a(i6Var, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.E5, null);
                                    i6Var.b((CharSequence) arrayList.get(i11), org.telegram.messenger.gz.o0 == ((Integer) arrayList2.get(i11)).intValue());
                                    int i12 = org.telegram.ui.ActionBar.j6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i12, false), 2, -1);
                                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
                                    i6Var.setBackground(h02);
                                    org.telegram.ui.ActionBar.q6.j(i6Var, h02, null, M, null);
                                    linearLayout.addView(i6Var);
                                    i6Var.setOnClickListener(new ah.g((Object) arrayList2, runnable, (Object) alertDialog$Builder, 23));
                                }
                                if (!z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                }
                                org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
                                if (z10) {
                                    p10.setCanceledOnTouchOutside(false);
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x0182, code lost:
                            
                                if (org.telegram.messenger.t3.p0(r35) == false) goto L61;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x019a, code lost:
                            
                                r8 = new org.telegram.ui.Cells.c2(1, r6, r38);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
                            
                                if (r35 == null) goto L64;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01ac, code lost:
                            
                                r11[0].e(org.telegram.messenger.hd.M0(2131751524, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01df, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e5, code lost:
                            
                                if (org.telegram.messenger.hd.a0 == false) goto L68;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e7, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01f2, code lost:
                            
                                if (org.telegram.messenger.hd.a0 == false) goto L73;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01f4, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01ff, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], c8.ja.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new org.telegram.ui.Components.u0(2, r1));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01fa, code lost:
                            
                                r5 = org.telegram.messenger.g0.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01ec, code lost:
                            
                                r4 = org.telegram.messenger.g0.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01c1, code lost:
                            
                                r11[0].e(org.telegram.messenger.hd.a0("DeleteMessagesOptionAlso", null, 2131751525, org.telegram.messenger.q10.j(r34, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
                            
                                if (org.telegram.messenger.t3.p0(r35) == false) goto L61;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.User user, TLRPC.Chat chat, boolean z10, org.telegram.messenger.nr nrVar, org.telegram.ui.ActionBar.e6 e6Var) {
                                boolean z11;
                                if (e2Var == null || e2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = e2Var.getCurrentAccount();
                                Activity parentActivity = e2Var.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, e6Var);
                                long e10 = org.telegram.messenger.m10.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                                h3 h3Var = new h3(parentActivity);
                                org.telegram.messenger.ns.i(h3Var);
                                org.telegram.ui.ActionBar.q6.U(h3Var, org.telegram.ui.ActionBar.j6.j5, null);
                                h3Var.setTextSize(1, 16.0f);
                                h3Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                i3 i3Var = new i3(parentActivity, c2VarArr);
                                alertDialog$Builder.o(i3Var);
                                TextView textView = new TextView(parentActivity);
                                org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                i3Var.addView(textView, c8.ja.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                i3Var.addView(h3Var, c8.ja.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i7 == -1) {
                                    textView.setText(org.telegram.messenger.hd.a0("ClearHistory", null, 2131752089, new Object[0]));
                                    if (user != null) {
                                        h3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithUser", null, 2131754107, org.telegram.messenger.q10.p(user))));
                                    } else if (z10) {
                                        if (org.telegram.messenger.t3.V(chat)) {
                                            h3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithChannel", null, 2131754110, chat.title)));
                                            z11 = false;
                                        } else {
                                            h3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureClearHistoryWithChat", null, 2131754109, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        h3Var.setText(org.telegram.messenger.hd.M0(2131754112, null));
                                    } else {
                                        h3Var.setText(org.telegram.messenger.hd.M0(2131754114, null));
                                    }
                                    z11 = false;
                                } else {
                                    z11 = false;
                                    textView.setText(org.telegram.messenger.hd.G(i7, "DeleteDays", new Object[0]));
                                    h3Var.setText(org.telegram.messenger.hd.M0(2131751535, null));
                                }
                                boolean[] zArr = new boolean[1];
                                zArr[z11 ? 1 : 0] = z11;
                                if (chat != null && z10 && org.telegram.messenger.t3.t0(chat)) {
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
                                        if (!org.telegram.messenger.t3.t0(chat)) {
                                            if (!org.telegram.messenger.t3.V(chat)) {
                                            }
                                        }
                                    }
                                }
                                CharSequence M0 = org.telegram.messenger.hd.M0(2131751598, null);
                                if (chat != null && z10 && org.telegram.messenger.t3.t0(chat) && !org.telegram.messenger.t3.V(chat)) {
                                    M0 = org.telegram.messenger.hd.M0(2131752091, null);
                                }
                                alertDialog$Builder.k(M0, new f1(7, nrVar, zArr));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                e2Var.showDialog(t1Var);
                                TextView textView2 = (TextView) t1Var.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.q7, null);
                                }
                            }

                            public static void q0(int i7, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (i7 == 0 || e2Var == null || e2Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var);
                                String M0 = org.telegram.messenger.hd.M0(2131743916, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                if (i7 == 1) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751087, null);
                                } else if (i7 == 2) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751099, null);
                                } else if (i7 == 3) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751093, null);
                                } else if (i7 == 4) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751086, null);
                                } else if (i7 == 5) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751098, null);
                                } else if (i7 == 6) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751092, null);
                                } else if (i7 == 7) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751090, null);
                                } else if (i7 == 8) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751091, null);
                                } else if (i7 == 9) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751082, null);
                                } else if (i7 == 10) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751094, null);
                                } else if (i7 == 11) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751083, null);
                                } else if (i7 == 12) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751095, null);
                                } else if (i7 == 13) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751080, null);
                                } else if (i7 == 14) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751081, null);
                                } else if (i7 == 15) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751088, null);
                                } else if (i7 == 16) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751089, null);
                                } else if (i7 == 17) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751100, null);
                                } else if (i7 == 18) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751101, null);
                                } else if (i7 == 19) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751096, null);
                                } else if (i7 == 20) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751097, null);
                                } else if (i7 == 21) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751084, null);
                                } else if (i7 == 22) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751085, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                e2Var.showDialog(t1Var, true, null);
                            }

                            public static void r(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.nr nrVar) {
                                s(e2Var, z10, false, chat, user, z11, z12, z13, z14, nrVar, e2Var != null ? e2Var.getResourceProvider() : null);
                            }

                            public static org.telegram.ui.ActionBar.t1 r0(org.telegram.ui.ActionBar.e2 e2Var, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
                                if (e2Var == null) {
                                    e2Var = LaunchActivity.T();
                                }
                                if (str2 == null || e2Var == null || e2Var.getParentActivity() == null) {
                                    return null;
                                }
                                org.telegram.ui.ActionBar.t1 t1Var = L(e2Var.getParentActivity(), str, str2, null, null, e6Var).a;
                                e2Var.showDialog(t1Var);
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
                            public static void s(final org.telegram.ui.ActionBar.e2 e2Var, final boolean z10, final boolean z11, final TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final org.telegram.messenger.nr nrVar, final org.telegram.ui.ActionBar.e6 e6Var) {
                                long j3;
                                boolean z16;
                                boolean z17;
                                t8 t8Var;
                                TLRPC.Chat chat2;
                                org.telegram.ui.Cells.c2[] c2VarArr;
                                d3 d3Var;
                                ArrayList arrayList;
                                org.telegram.ui.ActionBar.t1 t1Var;
                                t8 t8Var2;
                                float f10;
                                float f11;
                                boolean z18;
                                t8 t8Var3;
                                boolean z19;
                                boolean z20;
                                String str;
                                CharSequence M0;
                                TextView textView;
                                if (e2Var == null || e2Var.getParentActivity() == null) {
                                    return;
                                }
                                if (chat == null && user == null) {
                                    return;
                                }
                                final int currentAccount = e2Var.getCurrentAccount();
                                final Activity parentActivity = e2Var.getParentActivity();
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, e6Var);
                                long e10 = org.telegram.messenger.m10.i(currentAccount).e();
                                org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                                d3 d3Var2 = new d3(parentActivity);
                                org.telegram.messenger.ns.i(d3Var2);
                                org.telegram.ui.ActionBar.q6.U(d3Var2, org.telegram.ui.ActionBar.j6.j5, null);
                                d3Var2.setTextSize(1, 16.0f);
                                d3Var2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                                if (!z15 && org.telegram.messenger.t3.T(chat) && org.telegram.messenger.t3.t0(chat)) {
                                    j3 = e10;
                                    z16 = true;
                                } else {
                                    j3 = e10;
                                    z16 = false;
                                }
                                e3 e3Var = new e3(parentActivity, c2VarArr2);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                                t1Var2.H = 6;
                                alertDialog$Builder.o(e3Var);
                                t8 t8Var4 = new t8((org.telegram.ui.ActionBar.e6) null);
                                t8Var4.u(org.telegram.messenger.g0.L(18.0f));
                                i9 i9Var = new i9(parentActivity);
                                i9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                                e3Var.addView(i9Var, c8.ja.d(30, 30.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                h6 h6Var = new h6(parentActivity, false, false, false);
                                org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.E8, null);
                                h6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
                                h6Var.setTypeface(org.telegram.messenger.g0.o());
                                h6Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                                h6Var.setEllipsizeByGradient(true);
                                if (!z10) {
                                    z17 = z16;
                                    if (chat == null) {
                                        h6Var.setText(org.telegram.messenger.hd.M0(2131751553, null));
                                    } else if (org.telegram.messenger.t3.Y(chat)) {
                                        h6Var.setText(org.telegram.messenger.hd.M0(2131751934, null));
                                    } else if (!org.telegram.messenger.t3.T(chat)) {
                                        h6Var.setText(org.telegram.messenger.hd.M0(2131748991, null));
                                    } else if (chat.monoforum) {
                                        h6Var.setText(org.telegram.messenger.hd.M0(2131748995, null));
                                    } else if (chat.megagroup) {
                                        h6Var.setText(org.telegram.messenger.hd.M0(2131748991, null));
                                    } else {
                                        h6Var.setText(org.telegram.messenger.hd.M0(2131749004, null));
                                    }
                                } else if (z16) {
                                    z17 = z16;
                                    h6Var.setText(org.telegram.messenger.hd.M0(2131752088, null));
                                } else {
                                    z17 = z16;
                                    h6Var.setText(org.telegram.messenger.hd.M0(2131752089, null));
                                }
                                boolean z21 = org.telegram.messenger.hd.a0;
                                e3Var.addView(h6Var, c8.ja.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
                                e3Var.addView(d3Var2, c8.ja.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (org.telegram.messenger.t3.p0(chat)) {
                                    t8Var = t8Var4;
                                    chat2 = e2Var.getMessagesController().v1(chat.id);
                                } else {
                                    t8Var = t8Var4;
                                    chat2 = null;
                                }
                                boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j3 ? 1 : (user.id == j3 ? 0 : -1)) != 0 && org.telegram.messenger.np.s1(currentAccount).d3) && (user != null ? org.telegram.messenger.np.s1(currentAccount).c3 : org.telegram.messenger.np.s1(currentAccount).b3) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    c2VarArr = c2VarArr2;
                                    d3Var = d3Var2;
                                    arrayList = (ArrayList) org.telegram.messenger.np.s1(currentAccount).S.f(user.id);
                                } else {
                                    c2VarArr = c2VarArr2;
                                    d3Var = d3Var2;
                                    arrayList = null;
                                }
                                boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((org.telegram.messenger.gj) arrayList.get(0)).k == null || (!(((org.telegram.messenger.gj) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((org.telegram.messenger.gj) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f10 = 10.0f;
                                    if (user.bot) {
                                        t8Var2 = t8Var;
                                        f11 = 8.0f;
                                        if (user.id != 489000) {
                                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                            c2VarArr[0] = c2Var;
                                            c2Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                                            c2VarArr[0].e(org.telegram.messenger.hd.M0(2131753694, null), "", false, false, false);
                                            t1Var = t1Var2;
                                            c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                                            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var2.c(true, false);
                                            c2VarArr[0].setMultiline(true);
                                            e3Var.addView(c2VarArr[0], c8.ja.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            c2VarArr[0].setOnClickListener(new u0(1, zArr));
                                            t8Var3 = t8Var2;
                                            z19 = false;
                                            if (user != null) {
                                                t8 t8Var5 = t8Var3;
                                                e2Var.getCurrentAccount();
                                                t8Var5.q(chat2 != null ? chat2 : chat);
                                                i9Var.f(chat2 != null ? chat2 : chat, t8Var5);
                                            } else if (org.telegram.messenger.q10.z(user)) {
                                                t8 t8Var6 = t8Var3;
                                                t8Var6.p = 0.6f;
                                                t8Var6.g(12);
                                                i9Var.j(null, null, t8Var6, user);
                                            } else {
                                                t8 t8Var7 = t8Var3;
                                                if (user.id == j3) {
                                                    t8Var7.p = 0.6f;
                                                    t8Var7.g(1);
                                                    i9Var.j(null, null, t8Var7, user);
                                                } else {
                                                    t8Var7.p = 1.0f;
                                                    e2Var.getCurrentAccount();
                                                    t8Var7.r(user);
                                                    i9Var.f(user, t8Var7);
                                                }
                                            }
                                            if (z11) {
                                                d3 d3Var3 = d3Var;
                                                if (!z10) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z12) {
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754087, org.telegram.messenger.q10.p(user))));
                                                        } else if (user.id == j3) {
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754090, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754086, org.telegram.messenger.q10.p(user))));
                                                        } else {
                                                            str = null;
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754088, org.telegram.messenger.q10.p(user))));
                                                        }
                                                    } else if (org.telegram.messenger.t3.T(chat)) {
                                                        String a02 = chat2 != null ? org.telegram.messenger.hd.a0(null, null, 2131748346, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748643, a02)));
                                                        } else {
                                                            d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131752389, a02)));
                                                        }
                                                    } else {
                                                        d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754104, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a03 = chat2 != null ? org.telegram.messenger.hd.a0(null, null, 2131748346, chat2.title) : chat.title;
                                                    if (!org.telegram.messenger.t3.T(chat) || (chat.megagroup && !org.telegram.messenger.t3.t0(chat))) {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754109, a03)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.hd.M0(2131754112, null));
                                                    } else {
                                                        str = null;
                                                        d3Var3.setText(org.telegram.messenger.hd.M0(2131754114, null));
                                                    }
                                                } else if (z12) {
                                                    str = null;
                                                    d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754108, org.telegram.messenger.q10.p(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j3) {
                                                        d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754111, null)));
                                                    } else {
                                                        d3Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754107, org.telegram.messenger.q10.p(user))));
                                                    }
                                                }
                                            } else if (org.telegram.messenger.q10.B(user)) {
                                                str = null;
                                                d3Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751581, null)));
                                            } else {
                                                d3 d3Var4 = d3Var;
                                                str = null;
                                                if (chat == null || !org.telegram.messenger.t3.V(chat)) {
                                                    d3Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751585, null)));
                                                    str = null;
                                                } else {
                                                    d3Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751584, null)));
                                                }
                                            }
                                            if (!z11) {
                                                M0 = org.telegram.messenger.hd.M0(2131751590, str);
                                            } else if (z10) {
                                                M0 = z17 ? org.telegram.messenger.hd.M0(2131752088, str) : org.telegram.messenger.hd.M0(2131752090, str);
                                            } else if (z19 && zArr[0]) {
                                                M0 = org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131752422 : 2131751530, str);
                                            } else {
                                                M0 = org.telegram.messenger.t3.T(chat) ? chat.monoforum ? org.telegram.messenger.hd.M0(2131748995, str) : chat.megagroup ? org.telegram.messenger.hd.M0(2131748990, str) : org.telegram.messenger.hd.M0(2131749002, str) : org.telegram.messenger.hd.M0(2131751553, str);
                                            }
                                            final boolean z24 = z17;
                                            org.telegram.ui.ActionBar.t1 t1Var3 = t1Var;
                                            alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.l2
                                                @Override // org.telegram.ui.ActionBar.q1
                                                public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i7) {
                                                    boolean z25 = z24;
                                                    final boolean z26 = z11;
                                                    final boolean[] zArr2 = zArr;
                                                    final org.telegram.messenger.nr nrVar2 = nrVar;
                                                    boolean z27 = true;
                                                    if (!z25 && !z26 && !z12) {
                                                        final TLRPC.User user2 = user;
                                                        boolean B = org.telegram.messenger.q10.B(user2);
                                                        final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                                        final boolean z28 = z10;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z29 = z13;
                                                        final boolean z30 = z15;
                                                        final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                        if (B) {
                                                            t4.s(e2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, nrVar2, e6Var2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            org.telegram.messenger.vr a04 = org.telegram.messenger.vr.a0(e2Var2.getCurrentAccount());
                                                            a04.a.c(new org.telegram.messenger.br(a04, user2.id, new org.telegram.messenger.pr() { // from class: org.telegram.ui.Components.d1
                                                                @Override // org.telegram.messenger.pr
                                                                public final void a(int i10) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    org.telegram.messenger.nr nrVar3 = nrVar2;
                                                                    if (i10 >= 50) {
                                                                        t4.s(org.telegram.ui.ActionBar.e2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, nrVar3, e6Var2);
                                                                    } else if (nrVar3 != null) {
                                                                        nrVar3.j(zArr3[0]);
                                                                    }
                                                                }
                                                            }, 0));
                                                            return;
                                                        }
                                                        if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                            h.d();
                                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                            tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.np.i1(chat3);
                                                            final int i10 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                            d3.b bVar = new d3.b(1);
                                                            final Context context = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.s10() { // from class: org.telegram.ui.Components.e1
                                                                @Override // org.telegram.messenger.s10
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    vf.b.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    org.telegram.messenger.nr nrVar3 = nrVar2;
                                                                    if (user4 == null) {
                                                                        nrVar3.j(z26 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Context context2 = context;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    bg.l0 l0Var = new bg.l0(context2, chat4, user4, i10, nrVar3, e6Var2, 7);
                                                                    p1 p1Var = new p1(nrVar3, 0);
                                                                    org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                                                                    if (e2Var3 == null || e2Var3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context3 = e2Var3.getContext();
                                                                    TLRPC.User f12 = org.telegram.messenger.m10.i(e2Var3.getCurrentAccount()).f();
                                                                    boolean V = org.telegram.messenger.t3.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context3);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    i9 i9Var2 = new i9(context3);
                                                                    t8 t8Var8 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                    t8Var8.r(f12);
                                                                    i9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    i9Var2.f(f12, t8Var8);
                                                                    frameLayout.addView(i9Var2, c8.ja.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context3);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.d7, e2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    f3 f3Var = new f3(context3);
                                                                    t8 t8Var9 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                    t8Var9.r(user4);
                                                                    f3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                    f3Var.f(user4, t8Var9);
                                                                    frameLayout.addView(f3Var, c8.ja.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    i9 i9Var3 = new i9(context3);
                                                                    t8 t8Var10 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                    t8Var10.q(chat4);
                                                                    i9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                    i9Var3.f(chat4, t8Var10);
                                                                    frameLayout.addView(i9Var3, c8.ja.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                    org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder2.a;
                                                                    t1Var5.P0 = -1.0f;
                                                                    t1Var5.W = frameLayout;
                                                                    t1Var5.S = org.telegram.messenger.hd.M0(V ? 2131749000 : 2131748992, null);
                                                                    t1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, V ? 2131749001 : 2131748993, org.telegram.messenger.q10.p(user4), chat4.title));
                                                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131754210, null), new s(l0Var, 4));
                                                                    alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(V ? 2131749004 : 2131748990, null), new s(p1Var, 5));
                                                                    t1Var5.show();
                                                                    View d = t1Var5.d(-1);
                                                                    if (d instanceof TextView) {
                                                                        org.telegram.ui.ActionBar.q6.U((TextView) d, org.telegram.ui.ActionBar.j6.q7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        nrVar2 = nrVar2;
                                                    }
                                                    if (!z26 && !zArr2[0]) {
                                                        z27 = false;
                                                    }
                                                    nrVar2.j(z27);
                                                }
                                            });
                                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                            e2Var.showDialog(t1Var3);
                                            textView = (TextView) t1Var3.d(-1);
                                            if (textView == null) {
                                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        t1Var = t1Var2;
                                        if (!z11 || (((!z12 || z10) && !z22) || org.telegram.messenger.q10.x(user) || z23)) {
                                            z18 = (z13 || z10 || chat == null || !chat.creator) ? false : true;
                                            if (!z18) {
                                                t8Var3 = t8Var2;
                                                z19 = z18;
                                                if (user != null) {
                                                }
                                                if (z11) {
                                                }
                                                if (!z11) {
                                                }
                                                final boolean z242 = z17;
                                                org.telegram.ui.ActionBar.t1 t1Var32 = t1Var;
                                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.l2
                                                    @Override // org.telegram.ui.ActionBar.q1
                                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i7) {
                                                        boolean z25 = z242;
                                                        final boolean z26 = z11;
                                                        final boolean[] zArr2 = zArr;
                                                        final org.telegram.messenger.nr nrVar2 = nrVar;
                                                        boolean z27 = true;
                                                        if (!z25 && !z26 && !z12) {
                                                            final TLRPC.User user2 = user;
                                                            boolean B = org.telegram.messenger.q10.B(user2);
                                                            final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                                            final boolean z28 = z10;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z29 = z13;
                                                            final boolean z30 = z15;
                                                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                            if (B) {
                                                                t4.s(e2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, nrVar2, e6Var2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                org.telegram.messenger.vr a04 = org.telegram.messenger.vr.a0(e2Var2.getCurrentAccount());
                                                                a04.a.c(new org.telegram.messenger.br(a04, user2.id, new org.telegram.messenger.pr() { // from class: org.telegram.ui.Components.d1
                                                                    @Override // org.telegram.messenger.pr
                                                                    public final void a(int i10) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        org.telegram.messenger.nr nrVar3 = nrVar2;
                                                                        if (i10 >= 50) {
                                                                            t4.s(org.telegram.ui.ActionBar.e2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, nrVar3, e6Var2);
                                                                        } else if (nrVar3 != null) {
                                                                            nrVar3.j(zArr3[0]);
                                                                        }
                                                                    }
                                                                }, 0));
                                                                return;
                                                            }
                                                            if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                                h.d();
                                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                                tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.np.i1(chat3);
                                                                final int i10 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                                d3.b bVar = new d3.b(1);
                                                                final Context context = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.s10() { // from class: org.telegram.ui.Components.e1
                                                                    @Override // org.telegram.messenger.s10
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        vf.b.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        org.telegram.messenger.nr nrVar3 = nrVar2;
                                                                        if (user4 == null) {
                                                                            nrVar3.j(z26 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Context context2 = context;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        bg.l0 l0Var = new bg.l0(context2, chat4, user4, i10, nrVar3, e6Var2, 7);
                                                                        p1 p1Var = new p1(nrVar3, 0);
                                                                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                                                                        if (e2Var3 == null || e2Var3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context3 = e2Var3.getContext();
                                                                        TLRPC.User f12 = org.telegram.messenger.m10.i(e2Var3.getCurrentAccount()).f();
                                                                        boolean V = org.telegram.messenger.t3.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        i9 i9Var2 = new i9(context3);
                                                                        t8 t8Var8 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                        t8Var8.r(f12);
                                                                        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        i9Var2.f(f12, t8Var8);
                                                                        frameLayout.addView(i9Var2, c8.ja.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context3);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.d7, e2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        f3 f3Var = new f3(context3);
                                                                        t8 t8Var9 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                        t8Var9.r(user4);
                                                                        f3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                        f3Var.f(user4, t8Var9);
                                                                        frameLayout.addView(f3Var, c8.ja.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        i9 i9Var3 = new i9(context3);
                                                                        t8 t8Var10 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                        t8Var10.q(chat4);
                                                                        i9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                        i9Var3.f(chat4, t8Var10);
                                                                        frameLayout.addView(i9Var3, c8.ja.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                        org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder2.a;
                                                                        t1Var5.P0 = -1.0f;
                                                                        t1Var5.W = frameLayout;
                                                                        t1Var5.S = org.telegram.messenger.hd.M0(V ? 2131749000 : 2131748992, null);
                                                                        t1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, V ? 2131749001 : 2131748993, org.telegram.messenger.q10.p(user4), chat4.title));
                                                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131754210, null), new s(l0Var, 4));
                                                                        alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(V ? 2131749004 : 2131748990, null), new s(p1Var, 5));
                                                                        t1Var5.show();
                                                                        View d = t1Var5.d(-1);
                                                                        if (d instanceof TextView) {
                                                                            org.telegram.ui.ActionBar.q6.U((TextView) d, org.telegram.ui.ActionBar.j6.q7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            nrVar2 = nrVar2;
                                                        }
                                                        if (!z26 && !zArr2[0]) {
                                                            z27 = false;
                                                        }
                                                        nrVar2.j(z27);
                                                    }
                                                });
                                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                e2Var.showDialog(t1Var32);
                                                textView = (TextView) t1Var32.d(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z18 = false;
                                        }
                                        org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                        c2VarArr[0] = c2Var3;
                                        c2Var3.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                                        if (!z18) {
                                            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                                                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131751536, null), "", false, false, false);
                                            } else {
                                                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131751557, null), "", false, false, false);
                                            }
                                            z20 = true;
                                        } else if (z10) {
                                            z20 = true;
                                            c2VarArr[0].e(org.telegram.messenger.hd.a0(null, null, 2131752080, org.telegram.messenger.q10.j(user, true)), "", false, false, false);
                                        } else {
                                            z20 = true;
                                            c2VarArr[0].e(org.telegram.messenger.hd.a0(null, null, 2131751525, org.telegram.messenger.q10.j(user, true)), "", false, false, false);
                                        }
                                        c2VarArr[0].setMultiline(z20);
                                        t8Var3 = t8Var2;
                                        c2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                        e3Var.addView(c2VarArr[0], c8.ja.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        org.telegram.ui.wn wnVar = new org.telegram.ui.wn(z18, chat, alertDialog$Builder, zArr);
                                        c2VarArr[0].setOnClickListener(new org.telegram.messenger.video.e(28, zArr, wnVar));
                                        if (z14) {
                                            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[0];
                                            zArr[0] = true;
                                            c2Var4.c(true, false);
                                            wnVar.run();
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
                                        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.l2
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i7) {
                                                boolean z25 = z2422;
                                                final boolean z26 = z11;
                                                final boolean[] zArr2 = zArr;
                                                final org.telegram.messenger.nr nrVar2 = nrVar;
                                                boolean z27 = true;
                                                if (!z25 && !z26 && !z12) {
                                                    final TLRPC.User user2 = user;
                                                    boolean B = org.telegram.messenger.q10.B(user2);
                                                    final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                                    final boolean z28 = z10;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z29 = z13;
                                                    final boolean z30 = z15;
                                                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                    if (B) {
                                                        t4.s(e2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, nrVar2, e6Var2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        org.telegram.messenger.vr a04 = org.telegram.messenger.vr.a0(e2Var2.getCurrentAccount());
                                                        a04.a.c(new org.telegram.messenger.br(a04, user2.id, new org.telegram.messenger.pr() { // from class: org.telegram.ui.Components.d1
                                                            @Override // org.telegram.messenger.pr
                                                            public final void a(int i10) {
                                                                boolean[] zArr3 = zArr2;
                                                                org.telegram.messenger.nr nrVar3 = nrVar2;
                                                                if (i10 >= 50) {
                                                                    t4.s(org.telegram.ui.ActionBar.e2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, nrVar3, e6Var2);
                                                                } else if (nrVar3 != null) {
                                                                    nrVar3.j(zArr3[0]);
                                                                }
                                                            }
                                                        }, 0));
                                                        return;
                                                    }
                                                    if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                        h.d();
                                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                        tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.np.i1(chat3);
                                                        final int i10 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                        d3.b bVar = new d3.b(1);
                                                        final Context context = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.s10() { // from class: org.telegram.ui.Components.e1
                                                            @Override // org.telegram.messenger.s10
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                vf.b.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                org.telegram.messenger.nr nrVar3 = nrVar2;
                                                                if (user4 == null) {
                                                                    nrVar3.j(z26 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Context context2 = context;
                                                                TLRPC.Chat chat4 = chat3;
                                                                bg.l0 l0Var = new bg.l0(context2, chat4, user4, i10, nrVar3, e6Var2, 7);
                                                                p1 p1Var = new p1(nrVar3, 0);
                                                                org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                                                                if (e2Var3 == null || e2Var3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context3 = e2Var3.getContext();
                                                                TLRPC.User f12 = org.telegram.messenger.m10.i(e2Var3.getCurrentAccount()).f();
                                                                boolean V = org.telegram.messenger.t3.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                i9 i9Var2 = new i9(context3);
                                                                t8 t8Var8 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                t8Var8.r(f12);
                                                                i9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                i9Var2.f(f12, t8Var8);
                                                                frameLayout.addView(i9Var2, c8.ja.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context3);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.d7, e2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                f3 f3Var = new f3(context3);
                                                                t8 t8Var9 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                t8Var9.r(user4);
                                                                f3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                                f3Var.f(user4, t8Var9);
                                                                frameLayout.addView(f3Var, c8.ja.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                i9 i9Var3 = new i9(context3);
                                                                t8 t8Var10 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                                t8Var10.q(chat4);
                                                                i9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                                i9Var3.f(chat4, t8Var10);
                                                                frameLayout.addView(i9Var3, c8.ja.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                                org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder2.a;
                                                                t1Var5.P0 = -1.0f;
                                                                t1Var5.W = frameLayout;
                                                                t1Var5.S = org.telegram.messenger.hd.M0(V ? 2131749000 : 2131748992, null);
                                                                t1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, V ? 2131749001 : 2131748993, org.telegram.messenger.q10.p(user4), chat4.title));
                                                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131754210, null), new s(l0Var, 4));
                                                                alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(V ? 2131749004 : 2131748990, null), new s(p1Var, 5));
                                                                t1Var5.show();
                                                                View d = t1Var5.d(-1);
                                                                if (d instanceof TextView) {
                                                                    org.telegram.ui.ActionBar.q6.U((TextView) d, org.telegram.ui.ActionBar.j6.q7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    nrVar2 = nrVar2;
                                                }
                                                if (!z26 && !zArr2[0]) {
                                                    z27 = false;
                                                }
                                                nrVar2.j(z27);
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        e2Var.showDialog(t1Var322);
                                        textView = (TextView) t1Var322.d(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        t1Var = t1Var2;
                                        t8Var2 = t8Var;
                                    }
                                } else {
                                    t1Var = t1Var2;
                                    t8Var2 = t8Var;
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
                                c2Var32.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                                if (!z18) {
                                }
                                c2VarArr[0].setMultiline(z20);
                                t8Var3 = t8Var2;
                                c2VarArr[0].setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10), !org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(f11) : org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10));
                                e3Var.addView(c2VarArr[0], c8.ja.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                org.telegram.ui.wn wnVar2 = new org.telegram.ui.wn(z18, chat, alertDialog$Builder, zArr);
                                c2VarArr[0].setOnClickListener(new org.telegram.messenger.video.e(28, zArr, wnVar2));
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
                                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.l2
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i7) {
                                        boolean z25 = z24222;
                                        final boolean z26 = z11;
                                        final boolean[] zArr2 = zArr;
                                        final org.telegram.messenger.nr nrVar2 = nrVar;
                                        boolean z27 = true;
                                        if (!z25 && !z26 && !z12) {
                                            final TLRPC.User user2 = user;
                                            boolean B = org.telegram.messenger.q10.B(user2);
                                            final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                            final boolean z28 = z10;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z29 = z13;
                                            final boolean z30 = z15;
                                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                            if (B) {
                                                t4.s(e2Var2, z28, true, chat3, user2, false, z29, zArr2[0], z30, nrVar2, e6Var2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                org.telegram.messenger.vr a04 = org.telegram.messenger.vr.a0(e2Var2.getCurrentAccount());
                                                a04.a.c(new org.telegram.messenger.br(a04, user2.id, new org.telegram.messenger.pr() { // from class: org.telegram.ui.Components.d1
                                                    @Override // org.telegram.messenger.pr
                                                    public final void a(int i10) {
                                                        boolean[] zArr3 = zArr2;
                                                        org.telegram.messenger.nr nrVar3 = nrVar2;
                                                        if (i10 >= 50) {
                                                            t4.s(org.telegram.ui.ActionBar.e2.this, z28, true, chat3, user2, false, z29, zArr3[0], z30, nrVar3, e6Var2);
                                                        } else if (nrVar3 != null) {
                                                            nrVar3.j(zArr3[0]);
                                                        }
                                                    }
                                                }, 0));
                                                return;
                                            }
                                            if (org.telegram.messenger.t3.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final vf.b h = alertDialog$Builder.a.h(-1, true, true);
                                                h.d();
                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                tL_channels_getFutureCreatorAfterLeave.channel = org.telegram.messenger.np.i1(chat3);
                                                final int i10 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                                d3.b bVar = new d3.b(1);
                                                final Context context = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, bVar, new org.telegram.messenger.s10() { // from class: org.telegram.ui.Components.e1
                                                    @Override // org.telegram.messenger.s10
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        vf.b.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        org.telegram.messenger.nr nrVar3 = nrVar2;
                                                        if (user4 == null) {
                                                            nrVar3.j(z26 || zArr2[0]);
                                                            return;
                                                        }
                                                        Context context2 = context;
                                                        TLRPC.Chat chat4 = chat3;
                                                        bg.l0 l0Var = new bg.l0(context2, chat4, user4, i10, nrVar3, e6Var2, 7);
                                                        p1 p1Var = new p1(nrVar3, 0);
                                                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                                                        if (e2Var3 == null || e2Var3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context3 = e2Var3.getContext();
                                                        TLRPC.User f12 = org.telegram.messenger.m10.i(e2Var3.getCurrentAccount()).f();
                                                        boolean V = org.telegram.messenger.t3.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context3);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        i9 i9Var2 = new i9(context3);
                                                        t8 t8Var8 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                        t8Var8.r(f12);
                                                        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        i9Var2.f(f12, t8Var8);
                                                        frameLayout.addView(i9Var2, c8.ja.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context3);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.d7, e2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        f3 f3Var = new f3(context3);
                                                        t8 t8Var9 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                        t8Var9.r(user4);
                                                        f3Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                                                        f3Var.f(user4, t8Var9);
                                                        frameLayout.addView(f3Var, c8.ja.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        i9 i9Var3 = new i9(context3);
                                                        t8 t8Var10 = new t8((org.telegram.ui.ActionBar.e6) null);
                                                        t8Var10.q(chat4);
                                                        i9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                                        i9Var3.f(chat4, t8Var10);
                                                        frameLayout.addView(i9Var3, c8.ja.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                        org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder2.a;
                                                        t1Var5.P0 = -1.0f;
                                                        t1Var5.W = frameLayout;
                                                        t1Var5.S = org.telegram.messenger.hd.M0(V ? 2131749000 : 2131748992, null);
                                                        t1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, V ? 2131749001 : 2131748993, org.telegram.messenger.q10.p(user4), chat4.title));
                                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131754210, null), new s(l0Var, 4));
                                                        alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, null), null);
                                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(V ? 2131749004 : 2131748990, null), new s(p1Var, 5));
                                                        t1Var5.show();
                                                        View d = t1Var5.d(-1);
                                                        if (d instanceof TextView) {
                                                            org.telegram.ui.ActionBar.q6.U((TextView) d, org.telegram.ui.ActionBar.j6.q7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            nrVar2 = nrVar2;
                                        }
                                        if (!z26 && !zArr2[0]) {
                                            z27 = false;
                                        }
                                        nrVar2.j(z27);
                                    }
                                });
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                e2Var.showDialog(t1Var3222);
                                textView = (TextView) t1Var3222.d(-1);
                                if (textView == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.t1 s0(org.telegram.ui.ActionBar.e2 e2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
                                TextView textView;
                                org.telegram.ui.ActionBar.t1 M = M(e2Var.getContext(), e2Var.getResourceProvider(), str, charSequence, str2, runnable);
                                e2Var.showDialog(M);
                                if (z10 && (textView = (TextView) M.d(-1)) != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                }
                                return M;
                            }

                            public static org.telegram.ui.ActionBar.t1 t(Activity activity, final long j3, final long j10, final int i7, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
                                int i10;
                                SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).e7;
                                final String v = org.telegram.messenger.at.v(j3, j10, false);
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
                                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
                                    i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                                    i6Var.setTag(Integer.valueOf(i11));
                                    int i12 = org.telegram.ui.Cells.s8.e[i11];
                                    i6Var.a(i12, i12);
                                    i6Var.b(strArr[i11], i10 == org.telegram.ui.Cells.s8.f[i11]);
                                    e10.addView(i6Var);
                                    i6Var.setOnClickListener(new k1(e10, iArr));
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
                                String M0 = org.telegram.messenger.hd.M0(2131748989, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                alertDialog$Builder.o(e10);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745550, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.m2
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                                        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).e7.edit();
                                        long j11 = j3;
                                        int[] iArr2 = iArr;
                                        if (j11 != 0) {
                                            edit.putInt(r.b.k("color_", v), iArr2[0]);
                                            org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).l(j11, j10);
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
                                            org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).m(i14);
                                        }
                                        edit.commit();
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                        }
                                    }
                                });
                                alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131748988, null), new c4.n(j3, i7, runnable, 4));
                                if (j3 != 0) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751600, null), new f1(6, v, runnable));
                                }
                                return t1Var;
                            }

                            public static void t0(String str, org.telegram.ui.ActionBar.e2 e2Var) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((e2Var == null || e2Var.getParentActivity() == null) ? org.telegram.messenger.t0.b : e2Var.getParentActivity(), str, 1).show();
                            }

                            public static void u(org.telegram.ui.ActionBar.e2 e2Var, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getParentActivity());
                                String M0 = org.telegram.messenger.hd.M0(2131751788, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = org.telegram.messenger.hd.a0("ContactNotRegistered", null, 2131751789, org.telegram.messenger.g5.m(0, str, str2));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749174, null), new f1(3, str3, e2Var));
                                e2Var.showDialog(t1Var);
                            }

                            public static org.telegram.ui.ActionBar.t1 u0(Context context, String str, boolean z10) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = str;
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                if (z10) {
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131743821, null), new h0(context, 1));
                                }
                                return alertDialog$Builder.p();
                            }

                            public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.pr prVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i7 = org.telegram.ui.ActionBar.j6.L5;
                                final int i10 = 0;
                                alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
                                alertDialog$Builder.n(i7, null);
                                alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751774, null));
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751773, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.p2
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i11) {
                                        switch (i10) {
                                            case 0:
                                                prVar.a(1);
                                                break;
                                            default:
                                                prVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                final int i11 = 1;
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.p2
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i112) {
                                        switch (i11) {
                                            case 0:
                                                prVar.a(1);
                                                break;
                                            default:
                                                prVar.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, ib0Var2.getValue());
                                calendar.set(1, ib0Var3.getValue());
                                ib0Var.setMinValue(1);
                                ib0Var.setMaxValue(calendar.getActualMaximum(5));
                            }

                            public static AlertDialog$Builder w(Context context, int i7, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, ai.q1 q1Var) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final ib0 ib0Var = new ib0(context, null);
                                final ib0 ib0Var2 = new ib0(context, null);
                                final ib0 ib0Var3 = new ib0(context, null);
                                linearLayout.addView(ib0Var2, c8.ja.l(0.3f, 0, -2));
                                final int i15 = 0;
                                ib0Var2.setOnScrollListener(new fb0() { // from class: org.telegram.ui.Components.q1
                                    @Override // org.telegram.ui.Components.fb0
                                    public final void i(int i16) {
                                        switch (i15) {
                                            case 0:
                                                if (z10 && i16 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i16 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i16 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                ib0Var.setMinValue(0);
                                ib0Var.setMaxValue(11);
                                linearLayout.addView(ib0Var, c8.ja.l(0.3f, 0, -2));
                                ib0Var.setFormatter(new org.telegram.ui.br(17));
                                ib0Var.setOnValueChangedListener(new r1(ib0Var2, ib0Var, ib0Var3, 0));
                                final int i16 = 1;
                                ib0Var.setOnScrollListener(new fb0() { // from class: org.telegram.ui.Components.q1
                                    @Override // org.telegram.ui.Components.fb0
                                    public final void i(int i162) {
                                        switch (i16) {
                                            case 0:
                                                if (z10 && i162 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i162 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i162 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i17 = calendar.get(1);
                                ib0Var3.setMinValue(i7 + i17);
                                ib0Var3.setMaxValue(i10 + i17);
                                ib0Var3.setValue(i17 + i11);
                                linearLayout.addView(ib0Var3, c8.ja.l(0.4f, 0, -2));
                                ib0Var3.setOnValueChangedListener(new r1(ib0Var2, ib0Var, ib0Var3, 1));
                                final int i18 = 2;
                                ib0Var3.setOnScrollListener(new fb0() { // from class: org.telegram.ui.Components.q1
                                    @Override // org.telegram.ui.Components.fb0
                                    public final void i(int i162) {
                                        switch (i18) {
                                            case 0:
                                                if (z10 && i162 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z10 && i162 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z10 && i162 == 0) {
                                                    t4.d(ib0Var2, ib0Var, ib0Var3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                v0(ib0Var2, ib0Var, ib0Var3);
                                if (z10) {
                                    d(ib0Var2, ib0Var, ib0Var3);
                                }
                                if (i12 != -1) {
                                    ib0Var2.setValue(i12);
                                    ib0Var.setValue(i13);
                                    ib0Var3.setValue(i14);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.S = str;
                                alertDialog$Builder.o(linearLayout);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745550, null), new org.telegram.ui.yl(z10, ib0Var2, ib0Var, ib0Var3, q1Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                return alertDialog$Builder;
                            }

                            public static void x(Context context, String str, String str2, long j3, r4 r4Var) {
                                if (context == null) {
                                    return;
                                }
                                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false);
                                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
                                org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Aj, false);
                                org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ej, false);
                                org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false);
                                org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
                                org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i6, false);
                                int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                                int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
                                int x06 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
                                org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, (org.telegram.ui.ActionBar.e6) null);
                                ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
                                ib0 ib0Var = new ib0(context, null);
                                ib0Var.setTextColor(x02);
                                ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                                ib0Var.setItemCount(5);
                                s3 s3Var = new s3(context, null);
                                s3Var.setItemCount(5);
                                s3Var.setTextColor(x02);
                                s3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                                t3 t3Var = new t3(context, null);
                                t3Var.setItemCount(5);
                                t3Var.setTextColor(x02);
                                t3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                                ib0 ib0Var2 = ib0Var;
                                n3 n3Var = new n3(context, ib0Var2, s3Var, t3Var, 2);
                                n3Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                n3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                textView.setTextColor(x02);
                                textView.setTextSize(1, 20.0f);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new gi.a(10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                di.ub ubVar = new di.ub(context, 15);
                                linearLayout.addView(ib0Var2, c8.ja.l(0.5f, 0, org.telegram.messenger.ns.t4));
                                ib0Var2.setMinValue(0);
                                ib0Var2.setMaxValue(365);
                                ib0Var2.setWrapSelectorWheel(false);
                                ib0Var2.setFormatter(new org.telegram.ui.br(20));
                                a3.h hVar = new a3.h(ib0Var2, s3Var, t3Var, 21);
                                ib0Var2.setOnValueChangedListener(hVar);
                                s3Var.setMinValue(0);
                                s3Var.setMaxValue(23);
                                linearLayout.addView(s3Var, c8.ja.l(0.2f, 0, org.telegram.messenger.ns.t4));
                                s3Var.setFormatter(new org.telegram.ui.br(21));
                                s3Var.setOnValueChangedListener(hVar);
                                t3Var.setMinValue(0);
                                t3Var.setMaxValue(59);
                                t3Var.setValue(0);
                                t3Var.setFormatter(new org.telegram.ui.br(22));
                                linearLayout.addView(t3Var, c8.ja.l(0.3f, 0, org.telegram.messenger.ns.t4));
                                t3Var.setOnValueChangedListener(hVar);
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
                                        t3Var.setValue(calendar.get(12));
                                        s3Var.setValue(calendar.get(11));
                                        ib0Var2 = ib0Var2;
                                        ib0Var2.setValue(timeInMillis);
                                    } else {
                                        ib0Var2 = ib0Var2;
                                    }
                                }
                                g(null, null, 0L, 0L, 0, ib0Var2, s3Var, t3Var);
                                ubVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                                ubVar.setGravity(17);
                                ubVar.setTextColor(x04);
                                ubVar.setTextSize(1, 14.0f);
                                ubVar.setTypeface(org.telegram.messenger.g0.o());
                                int L = org.telegram.messenger.g0.L(8.0f);
                                ubVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x05, x06, x06));
                                ubVar.setText(str2);
                                n3Var.addView(ubVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
                                ubVar.setOnClickListener(new l1(ib0Var2, s3Var, t3Var, calendar, r4Var, ouVar, 1));
                                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.b;
                                u2Var.O = n3Var;
                                u2Var.show();
                                u2Var.v0(x03);
                                u2Var.P(x03);
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
                            /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.String, org.telegram.ui.ActionBar.e6, org.telegram.ui.ActionBar.q1] */
                            /* JADX WARN: Type inference failed for: r8v41 */
                            /* JADX WARN: Type inference failed for: r8v65 */
                            /* JADX WARN: Type inference failed for: r8v66 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void y(final org.telegram.ui.ActionBar.e2 e2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j3, final org.telegram.messenger.gj gjVar, final SparseArray[] sparseArrayArr, final org.telegram.messenger.bj bjVar, final int i7, final int i10, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.e6 e6Var) {
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
                                org.telegram.ui.Cells.c2 c2Var;
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
                                if (e2Var == null) {
                                    return;
                                }
                                if ((user == null && chat == null && encryptedChat == null) || (parentActivity = e2Var.getParentActivity()) == null) {
                                    return;
                                }
                                final int currentAccount = e2Var.getCurrentAccount();
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, e6Var);
                                float f10 = runnable2 != null ? 0.5f : 0.6f;
                                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
                                t1Var3.R0 = f10;
                                int size = bjVar != null ? bjVar.d.size() : gjVar2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                if (encryptedChat != null) {
                                    z10 = z25;
                                    j10 = org.telegram.messenger.m5.F(encryptedChat.id);
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
                                        String a02 = org.telegram.messenger.hd.a0(null, null, 2131748517, Integer.valueOf(i22));
                                        if (i22 == 31536000) {
                                            a02 = org.telegram.messenger.hd.M0(2131748513, null);
                                        } else if (i22 >= 2592000) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                        } else if (i22 >= 604800) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                        } else if (i22 >= 86400) {
                                            a02 = org.telegram.messenger.hd.G(i22 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                        }
                                        String str4 = a02;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, parentActivity, e6Var);
                                        String M0 = org.telegram.messenger.hd.M0(2131748511, null);
                                        org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder3.a;
                                        t1Var4.S = M0;
                                        t1Var4.U = org.telegram.messenger.hd.M0(2131748512, null);
                                        final int i25 = i21;
                                        alertDialog$Builder3.h(str4, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.b3
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var5, int i26) {
                                                org.telegram.messenger.bj bjVar2 = org.telegram.messenger.bj.this;
                                                int i27 = currentAccount;
                                                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                                int i28 = i25;
                                                int i29 = i22;
                                                if (bjVar2 != null) {
                                                    ArrayList arrayList2 = bjVar2.d;
                                                    if (!arrayList2.isEmpty()) {
                                                        org.telegram.messenger.ez.C(i27).u((org.telegram.messenger.gj) arrayList2.get(0), e2Var2, i28 + i29, i29);
                                                        return;
                                                    }
                                                }
                                                org.telegram.messenger.ez.C(i27).u(gjVar, e2Var2, i28 + i29, i29);
                                            }
                                        });
                                        final long j11 = j10;
                                        final boolean z26 = z10;
                                        alertDialog$Builder3.i(org.telegram.messenger.hd.M0(2131748524, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.i0
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
                                                long e10 = z27 ? org.telegram.messenger.m10.i(i29).e() : j11;
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
                                                            org.telegram.messenger.np.s1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j14 == 0 && (peer = gjVar3.k.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i30, true, i31);
                                                        }
                                                    }
                                                    arrayList3 = arrayList5;
                                                    org.telegram.messenger.np.s1(i27).Z(arrayList6, arrayList3, encryptedChat2, (j14 == 0 && (peer = gjVar3.k.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i30, true, i31);
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
                                                        org.telegram.messenger.np.s1(i29).Z(arrayList10, arrayList2, encryptedChat2, (i33 != 1 || j14 == 0) ? j15 : j14, i30, true, i31);
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
                                        t1Var4.O = new j0(0, runnable2);
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                    gjVar2 = gjVar;
                                }
                                Runnable runnable3 = runnable2;
                                final int i26 = currentAccount;
                                int currentTime = ConnectionsManager.getInstance(i26).getCurrentTime();
                                org.telegram.messenger.np.s1(i26).y7.i.z0(TimeUnit.SECONDS);
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
                                boolean z29 = user != null && org.telegram.messenger.np.s1(i26).d3;
                                int i30 = user != null ? org.telegram.messenger.np.s1(i26).c3 : org.telegram.messenger.np.s1(i26).b3;
                                if (encryptedChat == null && user != null && z29) {
                                    z16 = z29;
                                    if (i30 == Integer.MAX_VALUE) {
                                        z17 = true;
                                        if (chat != null || !chat.megagroup || z24 || z10) {
                                            i13 = i26;
                                            if (!z24 || z10 || org.telegram.messenger.t3.T(chat) || encryptedChat != null) {
                                                t1Var = t1Var3;
                                                i14 = 0;
                                                z18 = false;
                                            } else {
                                                if ((user == null || user.id == org.telegram.messenger.m10.i(i13).e() || (user.bot && !user.support)) && chat == null) {
                                                    i14 = 0;
                                                    z20 = false;
                                                } else if (gjVar2 != null) {
                                                    i14 = (gjVar2.n4() || !((messageAction = gjVar2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(gjVar2.N3() || z16 || org.telegram.messenger.t3.N(chat)) || currentTime - gjVar2.k.date > i30)) ? 0 : 1;
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
                                                                if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((gjVar5.N3() || z16 || (chat != null && org.telegram.messenger.t3.w(2, chat))) && currentTime - gjVar5.k.date <= i30)) {
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
                                                if (i14 <= 0 || !z14 || (user != null && org.telegram.messenger.q10.x(user))) {
                                                    t1Var = t1Var3;
                                                    z18 = z20;
                                                } else {
                                                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                                                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                                    c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                                                    if (z17) {
                                                        c2Var = c2Var2;
                                                        c2Var.e(org.telegram.messenger.hd.a0("DeleteMessagesOptionAlso", null, 2131751525, org.telegram.messenger.q10.j(user, true)), "", false, false, false);
                                                    } else {
                                                        c2Var = c2Var2;
                                                        if (chat == null) {
                                                            str = null;
                                                            i15 = 2131751526;
                                                        } else if (z20 || i14 == size) {
                                                            c2Var.e(org.telegram.messenger.hd.M0(2131751540, null), "", false, false, false);
                                                        } else {
                                                            i15 = 2131751526;
                                                            str = null;
                                                        }
                                                        c2Var.e(org.telegram.messenger.hd.M0(i15, str), "", false, false, false);
                                                    }
                                                    org.telegram.ui.Cells.c2 c2Var3 = c2Var;
                                                    c2Var3.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                    frameLayout.addView(c2Var3, c8.ja.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                    c2Var3.setOnClickListener(new u0(5, zArr));
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
                                            ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new aa.m(6)).mapToLong(new org.telegram.messenger.qk(3)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.k0
                                                @Override // java.util.function.LongFunction
                                                public final Object apply(long j12) {
                                                    int i41 = i26;
                                                    return j12 > 0 ? org.telegram.messenger.np.s1(i41).a2(Long.valueOf(j12)) : org.telegram.messenger.np.s1(i41).M0(Long.valueOf(-j12));
                                                }
                                            }).filter(new aa.m(7)).filter(new org.telegram.ui.p8(org.telegram.messenger.m10.i(i26).e(), 2)).collect(Collectors.toCollection(new org.telegram.messenger.lk(1)));
                                            if (!arrayList4.isEmpty()) {
                                                if (channelParticipantArr != null) {
                                                    rr rrVar = new rr(e2Var, chat, arrayList3, arrayList4, channelParticipantArr, j3, i7, i10, false, runnable);
                                                    if (runnable3 != null) {
                                                        rrVar.I0 = new j0(2, runnable3);
                                                    }
                                                    rrVar.show();
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
                                                    tL_channels_getParticipant.channel = org.telegram.messenger.np.i1(chat);
                                                    tL_channels_getParticipant.participant = org.telegram.messenger.np.k1((TLObject) arrayList4.get(i41));
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i26);
                                                    ArrayList arrayList5 = arrayList4;
                                                    final int[] iArr3 = iArr2;
                                                    final Runnable runnable4 = runnable3;
                                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.l0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            final int[] iArr4 = iArr3;
                                                            final int[] iArr5 = iArr;
                                                            final int i42 = i41;
                                                            final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                                            final int i43 = size2;
                                                            final org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                                                            final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
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
                                                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.o1
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
                                                                        t4.y(e2Var2, user2, chat2, encryptedChat2, chatFull2, j12, gjVar7, sparseArrayArr2, bjVar2, i44, i45, channelParticipantArr4, runnable5, runnable6, e6Var2);
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
                                                org.telegram.messenger.g0.i3(new ai.f1(t1VarArr, iArr, i26, runnable2, e2Var), 1000L);
                                                return;
                                            }
                                            i13 = i26;
                                            if (i40 <= 0 || !z14) {
                                                z23 = false;
                                            } else {
                                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                                org.telegram.ui.Cells.c2 c2Var4 = new org.telegram.ui.Cells.c2(1, parentActivity, e6Var);
                                                c2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                                                c2Var4.e(org.telegram.messenger.hd.M0(2131751526, null), "", false, false, false);
                                                c2Var4.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                                                frameLayout2.addView(c2Var4, c8.ja.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                c2Var4.setOnClickListener(new u0(4, zArr));
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
                                        org.telegram.ui.ActionBar.q1 q1Var = new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.c3
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
                                                long e10 = z32 ? org.telegram.messenger.m10.i(i50).e() : j12;
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
                                                                    org.telegram.messenger.np.s1(i47).Z(arrayList11, arrayList7, encryptedChat2, j14, i51, zArr2[c10], i52);
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
                                                                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i47);
                                                                    ArrayList arrayList15 = new ArrayList();
                                                                    arrayList15.add(Integer.valueOf(gjVar9.e1()));
                                                                    if (j14 == 0 || !org.telegram.messenger.m5.z(j14)) {
                                                                        j15 = 0;
                                                                    } else {
                                                                        TLRPC.Chat M02 = s12.M0(Long.valueOf(-j14));
                                                                        j15 = org.telegram.messenger.t3.T(M02) ? M02.id : 0L;
                                                                    }
                                                                    s12.l3(arrayList15, j14);
                                                                    org.telegram.messenger.vr messagesStorage = s12.getMessagesStorage();
                                                                    int P0 = gjVar9.P0();
                                                                    messagesStorage.getClass();
                                                                    a0.h hVar = new a0.h(i48);
                                                                    ArrayList arrayList16 = new ArrayList(i48);
                                                                    arrayList16.add(Integer.valueOf(P0));
                                                                    hVar.k(arrayList16, j14);
                                                                    messagesStorage.I(new org.telegram.messenger.xf(messagesStorage, hVar, (boolean) r32, 3));
                                                                    s12.getMessagesStorage().P0(j14, arrayList15, true, true, org.telegram.messenger.gj.d5(gjVar9.k) ? 9 : r32, i51);
                                                                    s12.getMessagesStorage().R1(j14, j15, arrayList15, null);
                                                                    org.telegram.messenger.ns notificationCenter = s12.getNotificationCenter();
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
                                                                    notificationCenter.k(org.telegram.messenger.ns.w, objArr);
                                                                    if (!org.telegram.messenger.gj.d5(gjVar9.k) || gjVar9.b5()) {
                                                                        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                        tL_deleteMessage.peer = s12.j1(org.telegram.messenger.gj.B0(gjVar9.k));
                                                                        TLRPC.Message message6 = gjVar9.k;
                                                                        tL_deleteMessage.receiver_id = s12.o1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                        tL_deleteMessage.id = gjVar9.P0();
                                                                        s12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
                                                                    } else {
                                                                        TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                        tL_deleteWelcomeMessage.peer = s12.j1(org.telegram.messenger.gj.B0(gjVar9.k));
                                                                        tL_deleteWelcomeMessage.id = gjVar9.P0();
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
                                                        org.telegram.messenger.np.s1(i50).Z(arrayList17, arrayList6, encryptedChat2, (i56 != 1 || j17 == 0) ? j19 : j17, i51, zArr2[i60], i52);
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
                                                t1Var2.S = org.telegram.messenger.hd.M0(2131751496, null);
                                            } else {
                                                t1Var2.S = org.telegram.messenger.hd.a0(null, null, 2131751519, org.telegram.messenger.hd.G(i17, "messages", new Object[0]));
                                            }
                                        } else {
                                            i17 = i44;
                                            if (i17 == 1) {
                                                str2 = null;
                                                t1Var2 = t1Var5;
                                                t1Var2.S = org.telegram.messenger.hd.M0(2131743836, null);
                                            } else {
                                                t1Var2 = t1Var5;
                                                str2 = null;
                                                t1Var2.S = org.telegram.messenger.hd.a0(null, null, 2131743837, org.telegram.messenger.hd.G(i17, "messages", new Object[0]));
                                            }
                                        }
                                        if (z21) {
                                            if (chat == null || !z18) {
                                                if (!z19 || z17 || i43 == i17) {
                                                    if (chat == null || !chat.megagroup || z24) {
                                                        if (i17 == 1) {
                                                            t1Var2.U = org.telegram.messenger.hd.M0(2131754093, null);
                                                        } else {
                                                            t1Var2.U = org.telegram.messenger.hd.M0(2131754101, null);
                                                        }
                                                    } else if (i17 == 1) {
                                                        t1Var2.U = org.telegram.messenger.hd.M0((gjVar == null || !org.telegram.messenger.gj.c3(gjVar.k)) ? 2131754092 : 2131754093, null);
                                                    } else {
                                                        t1Var2.U = org.telegram.messenger.hd.M0(2131754100, null);
                                                    }
                                                } else if (chat != null) {
                                                    t1Var2.U = org.telegram.messenger.hd.a0("DeleteMessagesTextGroup", null, 2131751521, org.telegram.messenger.hd.G(i43, "messages", new Object[0]));
                                                } else {
                                                    t1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("DeleteMessagesText", null, 2131751522, org.telegram.messenger.hd.G(i43, "messages", new Object[0]), org.telegram.messenger.q10.j(user, true)));
                                                }
                                            } else if (z19 && i43 != i17) {
                                                t1Var2.U = org.telegram.messenger.hd.a0(null, null, 2131751520, org.telegram.messenger.hd.G(i43, "messages", new Object[0]));
                                            } else if (i17 == 1) {
                                                t1Var2.U = org.telegram.messenger.hd.M0(2131754093, null);
                                            } else {
                                                t1Var2.U = org.telegram.messenger.hd.M0(2131754101, null);
                                            }
                                        } else if (i17 == 1) {
                                            t1Var2.U = org.telegram.messenger.hd.M0(2131754063, str2);
                                        } else {
                                            t1Var2.U = org.telegram.messenger.hd.M0(2131754064, str2);
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
                                                int z02 = (int) org.telegram.messenger.np.s1(i45).y7.i.z0(TimeUnit.HOURS);
                                                t1Var2.S = org.telegram.messenger.hd.M0(2131744334, null);
                                                t1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744333, Integer.valueOf(z02)));
                                                alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131744336, null), q1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else if (!z22 || z21) {
                                                alertDialog$Builder4.k(org.telegram.messenger.hd.M0(z21 ? 2131746321 : 2131751598, null), q1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else {
                                                t1Var2.S = org.telegram.messenger.hd.M0(2131753479, null);
                                                t1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131753480, str3));
                                                alertDialog$Builder4.i(org.telegram.messenger.hd.M0(2131751598, null), q1Var);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            }
                                        } else {
                                            int z03 = (int) org.telegram.messenger.np.s1(i45).y7.i.z0(TimeUnit.HOURS);
                                            r82 = 0;
                                            t1Var2.S = org.telegram.messenger.hd.M0(2131744337, null);
                                            t1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744335, Integer.valueOf(z03)));
                                            AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder2;
                                            alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131744336, null), q1Var);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        }
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r82), r82);
                                        t1Var2.O = new j0(3, runnable2);
                                        e2Var.showDialog(t1Var2);
                                        textView = (TextView) t1Var2.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, r82);
                                        }
                                        textView2 = (TextView) t1Var2.d(-3);
                                        if (textView2 == null) {
                                            t1Var2.u0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f));
                                            ((ViewGroup.MarginLayoutParams) t1Var2.u0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-8.0f);
                                            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.q7, null);
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
                                org.telegram.ui.ActionBar.q1 q1Var2 = new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.c3
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
                                        long e10 = z322 ? org.telegram.messenger.m10.i(i50).e() : j122;
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
                                                            org.telegram.messenger.np.s1(i472).Z(arrayList11, arrayList7, encryptedChat2, j142, i51, zArr2[c10], i52);
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
                                                            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i472);
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(Integer.valueOf(gjVar9.e1()));
                                                            if (j142 == 0 || !org.telegram.messenger.m5.z(j142)) {
                                                                j15 = 0;
                                                            } else {
                                                                TLRPC.Chat M02 = s12.M0(Long.valueOf(-j142));
                                                                j15 = org.telegram.messenger.t3.T(M02) ? M02.id : 0L;
                                                            }
                                                            s12.l3(arrayList15, j142);
                                                            org.telegram.messenger.vr messagesStorage = s12.getMessagesStorage();
                                                            int P0 = gjVar9.P0();
                                                            messagesStorage.getClass();
                                                            a0.h hVar = new a0.h(i48);
                                                            ArrayList arrayList16 = new ArrayList(i48);
                                                            arrayList16.add(Integer.valueOf(P0));
                                                            hVar.k(arrayList16, j142);
                                                            messagesStorage.I(new org.telegram.messenger.xf(messagesStorage, hVar, (boolean) r32, 3));
                                                            s12.getMessagesStorage().P0(j142, arrayList15, true, true, org.telegram.messenger.gj.d5(gjVar9.k) ? 9 : r32, i51);
                                                            s12.getMessagesStorage().R1(j142, j15, arrayList15, null);
                                                            org.telegram.messenger.ns notificationCenter = s12.getNotificationCenter();
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
                                                            notificationCenter.k(org.telegram.messenger.ns.w, objArr);
                                                            if (!org.telegram.messenger.gj.d5(gjVar9.k) || gjVar9.b5()) {
                                                                TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                tL_deleteMessage.peer = s12.j1(org.telegram.messenger.gj.B0(gjVar9.k));
                                                                TLRPC.Message message6 = gjVar9.k;
                                                                tL_deleteMessage.receiver_id = s12.o1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                tL_deleteMessage.id = gjVar9.P0();
                                                                s12.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new jh.b(3));
                                                            } else {
                                                                TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                tL_deleteWelcomeMessage.peer = s12.j1(org.telegram.messenger.gj.B0(gjVar9.k));
                                                                tL_deleteWelcomeMessage.id = gjVar9.P0();
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
                                                org.telegram.messenger.np.s1(i50).Z(arrayList17, arrayList6, encryptedChat2, (i56 != 1 || j17 == 0) ? j19 : j17, i51, zArr2[i60], i52);
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
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r82), r82);
                                t1Var2.O = new j0(3, runnable2);
                                e2Var.showDialog(t1Var2);
                                textView = (TextView) t1Var2.d(-1);
                                if (textView != null) {
                                }
                                textView2 = (TextView) t1Var2.d(-3);
                                if (textView2 == null) {
                                }
                            }

                            public static org.telegram.ui.ActionBar.t1 z(LaunchActivity launchActivity) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                                String M0 = org.telegram.messenger.hd.M0(2131748717, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = org.telegram.messenger.hd.M0(2131748718, null);
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748720, null), new v0(launchActivity, 1));
                                return t1Var;
                            }
                        }
