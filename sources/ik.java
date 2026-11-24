// default package

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
import org.telegram.messenger.a;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ik {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static he A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747037, null));
        he heVar = alertDialog$Builder.a;
        heVar.U = S2;
        int i = cmb.K5;
        alertDialog$Builder.l(R.raw.permission_request_location, 72, cmb.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(jb6.M0(2131747033, null), new mi(activity, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
        return heVar;
    }

    public static he B(Activity activity, boolean z, TLRPC.User user, we7 we7Var, ylb ylbVar) {
        int[] iArr = new int[1];
        String[] strArr = {jb6.M0(2131745351, null), jb6.M0(2131745350, null), jb6.M0(2131745349, null), jb6.M0(2131745348, null)};
        LinearLayout l = td4.l(activity, 1);
        l.setPadding(0, 0, 0, gm.L(4.0f));
        TextView textView = new TextView(activity);
        if (z) {
            textView.setText(jb6.M0(2131748601, null));
        } else if (user != null) {
            textView.setText(jb6.a0(null, null, 2131748598, m9c.k(user, true)));
        } else {
            textView.setText(jb6.M0(2131748599, null));
        }
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTextSize(1, 16.0f);
        byte b = 5;
        textView.setGravity((jb6.a0 ? 5 : 3) | 48);
        l.addView(textView, qoe.t(-2, -2, (jb6.a0 ? 5 : 3) | 48, 24, z ? 4 : 0, 24, 8));
        int i = 0;
        while (i < 4) {
            x09 x09Var = new x09(activity, ylbVar);
            x09Var.d = (byte) 42;
            x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            x09Var.setTag(Integer.valueOf(i));
            a(x09Var, cmb.f7, cmb.D5, ylbVar);
            x09Var.b(strArr[i], iArr[0] == i);
            l.addView(x09Var);
            x09Var.setOnClickListener(new bg(iArr, l));
            i++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        he heVar = alertDialog$Builder.a;
        if (z) {
            heVar.S = jb6.M0(2131748600, null);
        } else {
            int i2 = cmb.K5;
            int f = ylbVar != null ? ylbVar.f(i2) : cmb.w0(null, i2, false);
            heVar.c0 = new xca(activity, 0);
            heVar.d0 = f;
            heVar.e0 = -1;
            if (ylbVar == null) {
                alertDialog$Builder.m(i2, null);
            }
        }
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131745193, null), new o(iArr, we7Var, b));
        alertDialog$Builder.h(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static my0 C(final long j, final long j2, final ylb ylbVar, final d dVar) {
        if (dVar.getParentActivity() == null) {
            return null;
        }
        my0 i = wi8.i(dVar.getParentActivity(), false, 1, ylbVar);
        i.P = jb6.M0(2131747657, null);
        i.Q = true;
        CharSequence[] charSequenceArr = {jb6.a0("MuteFor", null, 2131748069, jb6.G(1, "Hours", new Object[0])), jb6.a0("MuteFor", null, 2131748069, jb6.G(8, "Hours", new Object[0])), jb6.a0("MuteFor", null, 2131748069, jb6.G(2, "Days", new Object[0])), jb6.M0(2131748070, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: gi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3;
                if (i2 == 0) {
                    i3 = 0;
                } else {
                    int i4 = 1;
                    if (i2 != 1) {
                        i4 = 2;
                        if (i2 != 2) {
                            i4 = 3;
                        }
                    }
                    i3 = i4;
                }
                lo7.n(z8c.t0).T(j, i3, j2);
                d dVar2 = dVar;
                if (c41.a(dVar2)) {
                    c41.z(dVar2, i3, 0, ylbVar).j();
                }
            }
        };
        i.M = charSequenceArr;
        i.L = onClickListener;
        return i;
    }

    public static void D(Context context, ylb ylbVar, gk gkVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        byte b = 0;
        int i = cmb.i5;
        if (ylbVar != null) {
            w0 = ylbVar.f(i);
            w02 = ylbVar.f(cmb.g5);
            ylbVar.f(cmb.zj);
            ylbVar.f(cmb.Dj);
            ylbVar.f(cmb.D8);
            ylbVar.f(cmb.F8);
            ylbVar.f(cmb.h6);
            w03 = ylbVar.f(cmb.Ii);
            w04 = ylbVar.f(cmb.Ei);
            w05 = ylbVar.f(cmb.Gi);
        } else {
            w0 = cmb.w0(null, i, false);
            w02 = cmb.w0(null, cmb.g5, false);
            cmb.w0(null, cmb.zj, false);
            cmb.w0(null, cmb.Dj, false);
            cmb.w0(null, cmb.D8, false);
            cmb.w0(null, cmb.F8, false);
            cmb.w0(null, cmb.h6, false);
            w03 = cmb.w0(null, cmb.Ii, false);
            w04 = cmb.w0(null, cmb.Ei, false);
            w05 = cmb.w0(null, cmb.Gi, false);
        }
        int i2 = w04;
        int i3 = w05;
        k6d k6dVar = new k6d(context, ylbVar);
        Object obj = k6dVar.b;
        ((my0) obj).w0 = false;
        int[] iArr = {30, 60, nm7.E1, nm7.J2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        vj vjVar = new vj(context, ylbVar, iArr);
        vjVar.setMinValue(0);
        vjVar.setMaxValue(20);
        vjVar.setTextColor(w0);
        vjVar.setValue(0);
        vjVar.setFormatter(new df(iArr, b));
        qj qjVar = new qj(context, vjVar, (byte) 1);
        qjVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        qjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131748067, null));
        textView.setTextColor(w0);
        ts2.s(textView, 1, 20.0f);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        qjVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        wb wbVar = new wb(context, (byte) 6);
        linearLayout.addView(vjVar, qoe.l(1.0f, 0, nm7.s4));
        vjVar.setOnValueChangedListener(new c((byte) 17));
        wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        wbVar.setGravity(17);
        wbVar.setTextColor(w03);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gm.o());
        int L = gm.L(8.0f);
        wbVar.setBackgroundDrawable(cmb.i0(L, L, L, L, i2, i3, i3));
        wbVar.setText(jb6.M0(2131753831, null));
        qjVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
        wbVar.setOnClickListener(new ef((Object) iArr, (Object) vjVar, (Object) gkVar, (Object) k6dVar, (byte) 0));
        my0 my0Var = (my0) obj;
        my0Var.O = qjVar;
        my0Var.show();
        my0Var.s0(w02);
        my0Var.K(w02);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        HashMap hashMap = new HashMap();
        int i = cmb.K5;
        hashMap.put("info1", Integer.valueOf(cmb.w0(null, i, false)));
        hashMap.put("info2", Integer.valueOf(cmb.w0(null, i, false)));
        alertDialog$Builder.l(R.raw.not_available, 52, cmb.w0(null, i, false), hashMap);
        alertDialog$Builder.m(i, null);
        heVar.X = true;
        alertDialog$Builder.j(jb6.M0(2131751978, null), null);
        heVar.U = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static he F(Activity activity, long j, final long j2, int i, final Runnable runnable, ylb ylbVar) {
        int i2;
        int i3;
        char c;
        CharSequence[] charSequenceArr;
        final long j3 = j;
        final int i4 = i;
        final SharedPreferences sharedPreferences = oc7.r1(z8c.t0).W3;
        final int[] iArr = new int[1];
        if (j3 != 0) {
            i3 = 0;
            int i5 = sharedPreferences.getInt("priority_" + j3, 3);
            iArr[0] = i5;
            if (i5 == 3) {
                iArr[0] = 0;
            } else if (i5 == 4) {
                iArr[0] = 1;
            } else if (i5 == 5) {
                iArr[0] = 2;
            } else if (i5 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            charSequenceArr = new String[]{jb6.M0(2131747613, null), jb6.M0(2131747615, null), jb6.M0(2131747614, null), jb6.M0(2131747616, null), jb6.M0(2131747612, null)};
            i2 = 1;
        } else {
            i2 = 1;
            i3 = 0;
            if (i4 == 1) {
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i4 == 0) {
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i4 == 2) {
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            } else if (i4 == 3) {
                iArr[0] = sharedPreferences.getInt("priority_stories", 1);
            } else if (i4 == 4 || i4 == 5) {
                iArr[0] = sharedPreferences.getInt("priority_react", 1);
            }
            int i6 = iArr[0];
            if (i6 == 4) {
                iArr[0] = 0;
            } else if (i6 == 5) {
                iArr[0] = 1;
            } else {
                c = 2;
                if (i6 == 0) {
                    iArr[0] = 2;
                } else {
                    iArr[0] = 3;
                }
                CharSequence[] charSequenceArr2 = new String[4];
                charSequenceArr2[0] = jb6.M0(2131747615, null);
                charSequenceArr2[1] = jb6.M0(2131747614, null);
                charSequenceArr2[c] = jb6.M0(2131747616, null);
                charSequenceArr2[3] = jb6.M0(2131747612, null);
                charSequenceArr = charSequenceArr2;
            }
            c = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = jb6.M0(2131747615, null);
            charSequenceArr22[1] = jb6.M0(2131747614, null);
            charSequenceArr22[c] = jb6.M0(2131747616, null);
            charSequenceArr22[3] = jb6.M0(2131747612, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout l = td4.l(activity, i2);
        int i7 = i3;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i7, ylbVar, activity);
        int i8 = i7;
        while (i8 < charSequenceArr.length) {
            x09 x09Var = new x09(activity, ylbVar);
            x09Var.setPadding(gm.L(4.0f), i7, gm.L(4.0f), i7);
            x09Var.setTag(Integer.valueOf(i8));
            a(x09Var, cmb.f7, cmb.D5, ylbVar);
            x09Var.b(charSequenceArr[i8], iArr[i7] == i8 ? 1 : i7);
            l.addView(x09Var);
            x09Var.setOnClickListener(new View.OnClickListener() { // from class: ei
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i9 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
                    long j4 = j3;
                    if (j4 != 0) {
                        int i10 = iArr2[0];
                        if (i10 == 0) {
                            i9 = 3;
                        } else if (i10 == 1) {
                            i9 = 4;
                        } else if (i10 == 2) {
                            i9 = 5;
                        } else if (i10 != 3) {
                            i9 = 1;
                        }
                        edit.putInt("priority_" + j4, i9);
                        lo7.n(z8c.t0).f(j4, j2);
                    } else {
                        int i11 = iArr2[0];
                        int i12 = i11 == 0 ? 4 : i11 == 1 ? 5 : i11 == 2 ? 0 : 1;
                        int i13 = i4;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        if (i13 == 1) {
                            edit.putInt("priority_messages", i12);
                            iArr2[0] = sharedPreferences2.getInt("priority_messages", 1);
                        } else if (i13 == 0) {
                            edit.putInt("priority_group", i12);
                            iArr2[0] = sharedPreferences2.getInt("priority_group", 1);
                        } else if (i13 == 2) {
                            edit.putInt("priority_channel", i12);
                            iArr2[0] = sharedPreferences2.getInt("priority_channel", 1);
                        } else if (i13 == 3) {
                            edit.putInt("priority_stories", i12);
                            iArr2[0] = sharedPreferences2.getInt("priority_stories", 1);
                        } else if (i13 == 4 || i13 == 5) {
                            edit.putInt("priority_react", i12);
                            iArr2[0] = sharedPreferences2.getInt("priority_react", 1);
                        }
                        lo7.n(z8c.t0).g(i13);
                    }
                    edit.commit();
                    alertDialog$Builder.a.M0.run();
                    runnable.run();
                }
            });
            i8++;
            j3 = j;
            i4 = i;
            i7 = i7;
        }
        String M0 = jb6.M0(2131747639, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static void G(int i, long j, r63 r63Var, Context context, TLRPC.Photo photo) {
        if (context != null) {
            yh yhVar = new yh(i, j, r63Var, context, photo);
            my0 my0Var = new my0(1, (ylb) r63Var, context, true);
            my0Var.J();
            my0Var.P = jb6.M0(2131745945, null);
            my0Var.Q = true;
            CharSequence[] charSequenceArr = {jb6.M0(2131745954, null), jb6.M0(2131745960, null), jb6.M0(2131745953, null), jb6.M0(2131745962, null), jb6.M0(2131745959, null), jb6.M0(2131745957, null), jb6.M0(2131745956, null), jb6.M0(2131745958, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            zh zhVar = new zh(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, context, r63Var, yhVar, (byte) 0);
            my0Var.M = charSequenceArr;
            my0Var.N = iArr;
            my0Var.L = zhVar;
            my0Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, zi] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View] */
    public static k6d H(final Context context, final long j, long j2, int i, boolean z, final gk gkVar, Runnable runnable, fk fkVar, ylb ylbVar) {
        ?? r22;
        Context context2;
        ViewGroup viewGroup;
        Object obj;
        long j3;
        FrameLayout frameLayout;
        char c;
        ?? r8;
        ViewGroup viewGroup2;
        boolean[] zArr;
        r7 r7Var;
        Calendar calendar;
        int[] iArr;
        String[] strArr;
        l97 l97Var;
        int[] iArr2;
        String[] strArr2;
        p09 p09Var;
        final cj cjVar;
        int i2;
        s09 s09Var;
        int i3;
        l97 l97Var2;
        ?? r4;
        int i4;
        final my0 my0Var;
        TLRPC.User W1;
        TLRPC.UserStatus userStatus;
        boolean z2;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i};
        long e = z8c.h(z8c.t0).e();
        final k6d k6dVar = new k6d(context, ylbVar);
        Object obj2 = k6dVar.b;
        ((my0) obj2).w0 = false;
        final lp7 lp7Var = new lp7(context, ylbVar);
        int i5 = fkVar.a;
        int i6 = fkVar.c;
        int i7 = fkVar.b;
        lp7Var.setTextColor(i5);
        lp7Var.setTextOffset(gm.L(10.0f));
        lp7Var.setItemCount(5);
        final cj cjVar2 = new cj(context, ylbVar);
        cjVar2.setWrapSelectorWheel(true);
        cjVar2.setAllItemsCount(24);
        cjVar2.setItemCount(5);
        cjVar2.setTextColor(i5);
        cjVar2.setTextOffset(-gm.L(10.0f));
        final dj djVar = new dj(context, ylbVar);
        djVar.setWrapSelectorWheel(true);
        djVar.setAllItemsCount(60);
        djVar.setItemCount(5);
        djVar.setTextColor(i5);
        djVar.setTextOffset(-gm.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        ?? ziVar = new zi(context, lp7Var, cjVar2, djVar, (byte) 1);
        ziVar.setClipToPadding(false);
        ziVar.setClipChildren(false);
        ziVar.setOrientation(1);
        frameLayout2.addView(ziVar, qoe.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ziVar.addView(frameLayout4, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (j == e) {
            r22 = 0;
            textView.setText(jb6.M0(2131745248, null));
        } else {
            r22 = 0;
            textView.setText(jb6.M0(2131745593, null));
        }
        textView.setTextColor(i5);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        frameLayout4.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 13));
        boolean[] zArr2 = new boolean[1];
        zArr2[r22] = true;
        if (!pg3.D(j) || j == e || (W1 = oc7.r1(z8c.t0).W1(Long.valueOf(j))) == null || W1.bot || (userStatus = W1.status) == null || userStatus.expires <= 0) {
            context2 = context;
            viewGroup = frameLayout2;
            obj = obj2;
            j3 = e;
            frameLayout = frameLayout3;
            c = 2;
            r8 = ziVar;
            viewGroup2 = frameLayout4;
            zArr = zArr2;
            r7Var = null;
        } else {
            String k = m9c.k(W1, true);
            if (k.length() > 10) {
                z2 = r22;
                k = k.substring(z2 ? 1 : 0, 10).concat("…");
            } else {
                z2 = r22;
            }
            String str = k;
            viewGroup = frameLayout2;
            obj = obj2;
            frameLayout = frameLayout3;
            r8 = ziVar;
            c = 2;
            zArr = zArr2;
            j3 = e;
            viewGroup2 = frameLayout4;
            r7Var = new r7(context, null, 0, fkVar.a, false, ylbVar);
            context2 = context;
            r7Var.setLongClickEnabled(z2);
            r7Var.setSubMenuOpenSide(2);
            r7Var.setIcon(R.drawable.ic_ab_other);
            r7Var.setBackground(cmb.f0(i6, 1, -1));
            viewGroup2.addView(r7Var, qoe.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            r7Var.g(1, jb6.a0(null, null, 2131745584, str));
            r7Var.setContentDescription(jb6.M0(2131754838, null));
        }
        byte b = 12;
        if (r7Var != null) {
            r7Var.setOnClickListener(new t(r7Var, fkVar, b));
            r7Var.setDelegate(new jf((Object) gkVar, (Object) zArr, (Object) k6dVar, (byte) 0));
        }
        s09 s09Var2 = new s09(context2);
        p09 p09Var2 = new p09(R.raw.notify_toggle, gm.L(24.0f), gm.L(24.0f), true, null);
        p09Var2.E(true);
        p09Var2.h = true;
        p09Var2.start();
        p09Var2.H(40);
        p09Var2.K(40);
        s09Var2.setScaleType(ImageView.ScaleType.CENTER);
        s09Var2.setAnimation(p09Var2);
        s09Var2.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
        s09Var2.setBackground(cmb.f0(i6, 1, -1));
        viewGroup2.addView(s09Var2, qoe.d(40, 40.0f, 53, 0.0f, 8.0f, (r7Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r8.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        char c2 = c;
        final wb wbVar = new wb(context2, (byte) 1);
        linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
        lp7Var.setMinValue(0);
        lp7Var.setMaxValue(365);
        lp7Var.setWrapSelectorWheel(false);
        lp7Var.setFormatter(new c((byte) 18));
        Object obj3 = obj;
        final boolean[] zArr3 = zArr;
        final long j4 = j3;
        jp7 jp7Var = new jp7() { // from class: xf
            @Override // jp7
            public final void g(lp7 lp7Var2, int i8) {
                ik.g(wb.this, null, 0L, 0L, j4 == j ? 1 : 0, lp7Var, cjVar2, djVar);
            }
        };
        lp7Var.setOnValueChangedListener(jp7Var);
        cjVar2.setMinValue(0);
        cjVar2.setMaxValue(23);
        final r7 r7Var2 = r7Var;
        linearLayout.addView(cjVar2, qoe.l(0.2f, 0, nm7.s4));
        cjVar2.setFormatter(new c((byte) 19));
        cjVar2.setOnValueChangedListener(jp7Var);
        djVar.setMinValue(0);
        djVar.setMaxValue(59);
        djVar.setValue(0);
        djVar.setFormatter(new c((byte) 23));
        linearLayout.addView(djVar, qoe.l(0.3f, 0, nm7.s4));
        djVar.setOnValueChangedListener(jp7Var);
        if (j2 <= 0 || j2 == 2147483646) {
            calendar = calendar2;
        } else {
            long j5 = 1000 * j2;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j5 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j5);
            if (timeInMillis >= 0) {
                djVar.setValue(calendar.get(12));
                cjVar2.setValue(calendar.get(11));
                lp7Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(wbVar, null, 0L, 0L, j4 == j ? 1 : 0, lp7Var, cjVar2, djVar);
        if (ConnectionsManager.getInstance(z8c.t0).isTestBackend()) {
            iArr = new int[10];
            iArr[0] = 0;
            iArr[1] = 60;
            iArr[c2] = 300;
            iArr[3] = 86400;
            iArr[4] = 604800;
            iArr[5] = 1209600;
            iArr[6] = 2592000;
            iArr[7] = 7862400;
            iArr[8] = 15724800;
            iArr[9] = 31536000;
            strArr = new String[10];
            strArr[0] = jb6.M0(2131748257, null);
            strArr[1] = "Every minute";
            strArr[c2] = "Every 5 minutes";
            strArr[3] = jb6.M0(2131748259, null);
            strArr[4] = jb6.M0(2131748256, null);
            strArr[5] = jb6.M0(2131748260, null);
            strArr[6] = jb6.M0(2131748258, null);
            strArr[7] = jb6.M0(2131748262, null);
            strArr[8] = jb6.M0(2131748261, null);
            strArr[9] = jb6.M0(2131748255, null);
            l97Var = null;
        } else {
            iArr = new int[8];
            iArr[0] = 0;
            iArr[1] = 86400;
            iArr[c2] = 604800;
            iArr[3] = 1209600;
            iArr[4] = 2592000;
            iArr[5] = 7862400;
            iArr[6] = 15724800;
            iArr[7] = 31536000;
            strArr = new String[8];
            l97Var = null;
            strArr[0] = jb6.M0(2131748257, null);
            strArr[1] = jb6.M0(2131748259, null);
            strArr[c2] = jb6.M0(2131748256, null);
            strArr[3] = jb6.M0(2131748260, null);
            strArr[4] = jb6.M0(2131748258, null);
            strArr[5] = jb6.M0(2131748262, null);
            strArr[6] = jb6.M0(2131748261, null);
            strArr[7] = jb6.M0(2131748255, null);
        }
        String[] strArr3 = strArr;
        if (z) {
            iArr2 = iArr;
            strArr2 = strArr3;
            p09Var = p09Var2;
            cjVar = cjVar2;
            i2 = i7;
            s09Var = s09Var2;
            i3 = 0;
            l97Var2 = l97Var;
            r4 = l97Var2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            i2 = i7;
            int v = cmb.v(i2, cmb.p1(0.075f, i5));
            int[] iArr4 = iArr;
            int p1 = cmb.p1(0.1f, i5);
            ?? textView2 = new TextView(context2);
            strArr2 = strArr3;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i5);
            textView2.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
            int L = gm.L(14.0f);
            int v2 = cmb.v(v, p1);
            textView2.setBackground(cmb.i0(L, L, L, L, v, v2, v2));
            textView2.setGravity(17);
            cjVar = cjVar2;
            i3 = 0;
            p09Var = p09Var2;
            s09Var = s09Var2;
            l97Var2 = new l97(iArr4, iArr3, strArr2, textView2, (byte) 7);
            iArr2 = iArr4;
            l97Var2.run();
            frameLayout5.addView(textView2, qoe.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r8.addView(frameLayout5, qoe.o(-1, -2));
            l97Var = textView2;
            r4 = frameLayout5;
        }
        wbVar.setPadding(gm.L(34.0f), i3, gm.L(34.0f), i3);
        wbVar.setGravity(17);
        wbVar.setTextColor(fkVar.g);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gm.o());
        int i8 = fkVar.h;
        float[] fArr = new float[1];
        fArr[i3] = 24.0f;
        wbVar.setBackground(ulb.e(i8, fArr));
        r8.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        int i9 = i2;
        wbVar.setOnClickListener(new View.OnClickListener() { // from class: sg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr4[0] = false;
                int i10 = j4 == j ? 1 : 0;
                lp7 lp7Var2 = lp7Var;
                cj cjVar3 = cjVar;
                dj djVar2 = djVar;
                boolean g = ik.g(null, null, 0L, 0L, i10, lp7Var2, cjVar3, djVar2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, lp7Var2.getValue());
                calendar4.set(11, cjVar3.getValue());
                calendar4.set(12, djVar2.getValue());
                if (g) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                gkVar.y((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                ((my0) k6dVar.b).y0.run();
            }
        });
        my0 my0Var2 = (my0) obj3;
        my0Var2.O = viewGroup;
        my0Var2.show();
        my0Var2.setOnDismissListener(new vg(runnable, zArr4));
        my0Var2.s0(i9);
        my0Var2.K(i9);
        if (l97Var != null) {
            i4 = 1;
            my0Var = my0Var2;
            l97Var.setOnClickListener(new li(frameLayout, ylbVar, my0Var2, (FrameLayout) r4, iArr2, strArr2, iArr3, l97Var2));
        } else {
            i4 = 1;
            my0Var = my0Var2;
        }
        final hg5[] hg5VarArr = new hg5[i4];
        final p09 p09Var3 = p09Var;
        s09Var.setOnClickListener(new View.OnClickListener() { // from class: xe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String M0;
                boolean[] zArr5 = zArr3;
                byte b2 = 0;
                boolean z3 = zArr5[0];
                zArr5[0] = !z3;
                p09 p09Var4 = p09Var3;
                int i10 = p09Var4.b0;
                if (z3) {
                    if (i10 < 40) {
                        p09Var4.H(40);
                    }
                    p09Var4.K(80);
                    p09Var4.start();
                } else {
                    if (i10 >= 40) {
                        p09Var4.H(0);
                    }
                    p09Var4.K(40);
                    p09Var4.start();
                }
                hg5[] hg5VarArr2 = hg5VarArr;
                hg5 hg5Var = hg5VarArr2[0];
                if (hg5Var != null) {
                    hg5Var.f(true);
                    hg5VarArr2[0] = null;
                }
                oc7 r1 = oc7.r1(z8c.t0);
                long j6 = j;
                TLRPC.User W12 = r1.W1(Long.valueOf(j6));
                TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-j6));
                hg5 hg5Var2 = new hg5(context, 3);
                hg5VarArr2[0] = hg5Var2;
                hg5Var2.r();
                hg5Var2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                hg5Var2.q(20.0f);
                hg5Var2.s(gm.L(12.0f), gm.L(4.0f), cmb.p1(0.25f, -16777216));
                if (sd2.V(L0)) {
                    M0 = jb6.M0(zArr5[0] ? 2131745588 : 2131745592, null);
                } else if (L0 != null || W12 == null) {
                    M0 = jb6.M0(zArr5[0] ? 2131745586 : 2131745590, null);
                } else if (j6 == j4) {
                    M0 = jb6.M0(zArr5[0] ? 2131745585 : 2131745589, null);
                } else {
                    M0 = jb6.a0(null, null, zArr5[0] ? 2131745587 : 2131745591, m9c.l(W12));
                }
                hg5Var2.t(M0);
                hg5Var2.d = 5000L;
                hg5Var2.n(1.0f, -((r7Var2 != null ? 42 : -8) + 20));
                hg5Var2.r0 = new hi(hg5Var2, b2);
                my0 my0Var3 = my0Var;
                my0Var3.b.setClipToPadding(false);
                my0Var3.b.setClipChildren(false);
                my0Var3.b.addView(hg5Var2, qoe.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                hg5Var2.v();
            }
        });
        return k6dVar;
    }

    public static void I(Context context, long j, gk gkVar) {
        H(context, j, -1L, 0, false, gkVar, null, new fk(null), null);
    }

    public static void J(Context context, long j, gk gkVar, ylb ylbVar) {
        H(context, j, -1L, 0, false, gkVar, null, new fk(ylbVar), ylbVar);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, ylb ylbVar) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        if (str == null) {
            str = jb6.M0(R.string.AppName, null);
        }
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        if (str3 == null) {
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(str3, new cf(runnable, (byte) 4));
        return alertDialog$Builder;
    }

    public static he M(Context context, ylb ylbVar, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = charSequence;
        alertDialog$Builder.j(str2, new cf(runnable, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static m8 N(d dVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f, float f2) {
        if (view == null) {
            return null;
        }
        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        m8Var.e = true;
        m8Var.c = (short) 220;
        m8Var.setOutsideTouchable(true);
        m8Var.setClippingEnabled(true);
        m8Var.setAnimationStyle(R.style.PopupContextAnimation);
        m8Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
        m8Var.setInputMethodMode(2);
        m8Var.getContentView().setFocusableInTouchMode(true);
        float f3 = 0.0f;
        View view2 = view;
        float f4 = 0.0f;
        while (view2 != view.getRootView()) {
            f3 += view2.getX();
            f4 += view2.getY();
            view2 = (View) view2.getParent();
            if (view2 == null) {
                break;
            }
        }
        m8Var.showAtLocation(view.getRootView(), 0, (int) ((f3 + f) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f4 + f2) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        m8Var.b();
        return m8Var;
    }

    public static void O(Context context, d dVar, String str, String str2, String str3, String str4, int i, String str5, ylb ylbVar, af7 af7Var) {
        Activity W = gm.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        he[] heVarArr = new he[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        hk hkVar = new hk(context);
        hkVar.setTextSize(1, 16.0f);
        int i2 = cmb.i5;
        anb.X(hkVar, i2, ylbVar);
        anb.D(hkVar, cmb.Ni, ylbVar);
        hkVar.setHint(str3);
        hkVar.setFocusable(true);
        hkVar.setInputType(147457);
        hkVar.setImeOptions(6);
        hkVar.setMaxLines(10);
        hkVar.setPadding(gm.L(16.0f), gm.L(11.0f), gm.L(16.0f), gm.L(11.0f));
        hkVar.setCursorWidth(1.5f);
        hkVar.A(cmb.p6, ylbVar);
        if (str4 != null) {
            hkVar.setText(str4);
        }
        hkVar.setOnEditorActionListener(new xg(hkVar, i, af7Var, heVarArr, currentFocus, (byte) 0));
        hkVar.addTextChangedListener(new fj(i, hkVar));
        ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i2, ylbVar)));
        wmb K = anb.K(0.06f, i2);
        hkVar.setBackground(b0);
        anb.j(hkVar, b0, K, null, ylbVar);
        LinearLayout i3 = hg9.i(context, 1);
        i3.addView(hkVar, qoe.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(i3);
        heVar.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
        byte b = 0;
        alertDialog$Builder.j(str5, new yg(hkVar, i, af7Var, b));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new zg(b));
        heVarArr[0] = heVar;
        if (dVar != null) {
            gm.U2(W, dVar.getClassGuid());
        }
        he heVar2 = heVarArr[0];
        heVar2.k0 = false;
        heVar2.setOnDismissListener(new ah(hkVar, dVar, W, b));
        heVarArr[0].setOnShowListener(new bf(hkVar, (byte) 1));
        heVarArr[0].show();
        hkVar.setSelection(hkVar.getText().length());
    }

    public static void P(Context context, d dVar, ylb ylbVar, af7 af7Var) {
        O(context, dVar, jb6.M0(2131744488, null), jb6.M0(2131744495, null), jb6.M0(2131744469, null), null, 12, jb6.M0(2131751690, null), ylbVar, af7Var);
    }

    public static k6d Q(Context context, long j, final gk gkVar, ylb ylbVar, int i) {
        int i2;
        int i3;
        int w0 = cmb.w0(null, cmb.i5, false);
        int w02 = cmb.w0(null, cmb.g5, false);
        cmb.w0(null, cmb.zj, false);
        cmb.w0(null, cmb.Dj, false);
        cmb.w0(null, cmb.D8, false);
        cmb.w0(null, cmb.F8, false);
        int i4 = cmb.h6;
        cmb.w0(null, i4, false);
        int w03 = cmb.w0(null, cmb.Ii, false);
        int w04 = cmb.w0(null, cmb.Ei, false);
        cmb.w0(null, cmb.Gi, false);
        if (context == null) {
            return null;
        }
        final k6d k6dVar = new k6d(context, ylbVar);
        Object obj = k6dVar.b;
        ((my0) obj).w0 = false;
        final lp7 lp7Var = new lp7(context, ylbVar);
        lp7Var.setTextColor(w0);
        lp7Var.setTextOffset(gm.L(10.0f));
        lp7Var.setItemCount(5);
        final ak akVar = new ak(context, ylbVar);
        akVar.setWrapSelectorWheel(true);
        akVar.setAllItemsCount(24);
        akVar.setItemCount(5);
        akVar.setTextColor(w0);
        akVar.setTextOffset(-gm.L(10.0f));
        final bk bkVar = new bk(context, ylbVar);
        bkVar.setWrapSelectorWheel(true);
        bkVar.setAllItemsCount(60);
        bkVar.setItemCount(5);
        bkVar.setTextColor(w0);
        bkVar.setTextOffset(-gm.L(34.0f));
        zi ziVar = new zi(context, lp7Var, akVar, bkVar, (byte) 7);
        ziVar.setOrientation(1);
        LinearLayout i5 = hg9.i(context, 1);
        ziVar.addView(i5, qoe.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(i == 1 ? 2131744059 : 2131746828, null));
        textView.setTextColor(w0);
        ts2.s(textView, 1, 20.0f);
        i5.addView(textView, qoe.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new p8((byte) 3));
        TextView textView2 = new TextView(context);
        anb.X(textView2, cmb.y6, ylbVar);
        ts2.q(14.0f, 1, 2131746827, textView2, null);
        i5.addView(textView2, qoe.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new p8((byte) 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i6 = calendar.get(1);
        gt2 gt2Var = oc7.r1(z8c.t0).l4.i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long g = gt2Var.g(timeUnit) << 1;
        final long g2 = oc7.r1(z8c.t0).l4.j.g(timeUnit) - 86400;
        final wb wbVar = new wb(context, (byte) 8);
        linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
        lp7Var.setMinValue(0);
        lp7Var.setMaxValue(365);
        lp7Var.setWrapSelectorWheel(false);
        lp7Var.setFormatter(new pg(i6, (byte) 0));
        final int i7 = i == 1 ? 5 : 3;
        jp7 jp7Var = new jp7() { // from class: qg
            @Override // jp7
            public final void g(lp7 lp7Var2, int i8) {
                ik.g(wb.this, null, g, g2, i7, lp7Var, akVar, bkVar);
            }
        };
        lp7Var.setOnValueChangedListener(jp7Var);
        akVar.setMinValue(0);
        akVar.setMaxValue(23);
        linearLayout.addView(akVar, qoe.l(0.2f, 0, nm7.s4));
        akVar.setFormatter(new c((byte) 25));
        akVar.setOnValueChangedListener(jp7Var);
        bkVar.setMinValue(0);
        bkVar.setMaxValue(59);
        bkVar.setValue(0);
        bkVar.setFormatter(new c((byte) 26));
        linearLayout.addView(bkVar, qoe.l(0.3f, 0, nm7.s4));
        bkVar.setOnValueChangedListener(jp7Var);
        if (j <= 0 || j == 2147483646) {
            i2 = w02;
            i3 = i4;
        } else {
            long j2 = 1000 * j;
            i2 = w02;
            i3 = i4;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                bkVar.setValue(calendar.get(12));
                akVar.setValue(calendar.get(11));
                lp7Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(wbVar, null, g, g2, i7, lp7Var, akVar, bkVar);
        wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        wbVar.setGravity(17);
        wbVar.setTextColor(w03);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gm.o());
        wbVar.setBackground(ulb.e(w04, 8.0f));
        ziVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 4));
        final int i8 = i7;
        wbVar.setOnClickListener(new View.OnClickListener() { // from class: rg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j3 = g;
                long j4 = g2;
                byte b = i8;
                lp7 lp7Var2 = lp7Var;
                ak akVar2 = akVar;
                bk bkVar2 = bkVar;
                boolean g3 = ik.g(null, null, j3, j4, b, lp7Var2, akVar2, bkVar2);
                long epochMilli = LocalDate.now().plusDays(lp7Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, akVar2.getValue());
                calendar2.set(12, bkVar2.getValue());
                if (g3) {
                    calendar2.set(13, 0);
                }
                gkVar.y((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((my0) k6dVar.b).y0.run();
            }
        });
        rve.b(wbVar, 0.02f, 1.2f);
        wb wbVar2 = new wb(context, (byte) 9);
        wbVar2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        wbVar2.setGravity(17);
        wbVar2.setText(jb6.M0(i == 1 ? 2131748228 : 2131746825, null));
        wbVar2.setTextColor(w04);
        wbVar2.setTextSize(1, 14.0f);
        int L = gm.L(8.0f);
        int i9 = cmb.c6;
        int w05 = cmb.w0(null, i9, false);
        int w06 = cmb.w0(null, i3, false);
        fg0 i0 = cmb.i0(L, L, L, L, w05, w06, w06);
        wmb M = anb.M(i9);
        wmb M2 = anb.M(i3);
        wbVar2.setBackground(i0);
        anb.j(wbVar2, i0, M, M2, null);
        ziVar.addView(wbVar2, qoe.t(-1, 48, 83, 16, 0, 16, 16));
        wbVar2.setOnClickListener(new b0(zArr, gkVar, k6dVar, (byte) 2));
        rve.b(wbVar2, 0.02f, 1.2f);
        my0 my0Var = (my0) obj;
        my0Var.O = ziVar;
        my0Var.show();
        my0Var.setOnDismissListener(new g5(zArr));
        my0Var.s0(i2);
        my0Var.K(i2);
        return k6dVar;
    }

    public static he R(d dVar, ylb ylbVar) {
        if (dVar == null || dVar.getParentActivity() == null) {
            return null;
        }
        l66 l66Var = new l66(dVar.getParentActivity(), dVar.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(jb6.M0(2131753950, null).replace("\n", "<br>")));
        byte b = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new uj(uRLSpan.getURL(), dVar), spanStart, spanEnd, 0);
        }
        l66Var.setText(spannableString);
        l66Var.setTextSize(1, 16.0f);
        anb.G(l66Var, cmb.j5, ylbVar);
        anb.C(l66Var, cmb.k5, ylbVar);
        l66Var.setPadding(gm.L(23.0f), 0, gm.L(23.0f), 0);
        l66Var.setMovementMethod(new cm(b));
        anb.X(l66Var, cmb.i5, ylbVar);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, dVar.getParentActivity());
        alertDialog$Builder.n(l66Var);
        String M0 = jb6.M0(2131753951, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131753949, null), new h6(dVar, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, ylb ylbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        alertDialog$Builder.a.S = jb6.M0(2131748344, null);
        lp7 lp7Var = new lp7(context, null);
        lp7Var.setMinValue(0);
        lp7Var.setMaxValue(20);
        int i = encryptedChat.ttl;
        if (i > 0 && i < 16) {
            lp7Var.setValue(i);
        } else if (i == 30) {
            lp7Var.setValue(16);
        } else if (i == 60) {
            lp7Var.setValue(17);
        } else if (i == 3600) {
            lp7Var.setValue(18);
        } else if (i == 86400) {
            lp7Var.setValue(19);
        } else if (i == 604800) {
            lp7Var.setValue(20);
        } else if (i == 0) {
            lp7Var.setValue(0);
        }
        lp7Var.setFormatter(new zg((byte) 10));
        alertDialog$Builder.n(lp7Var);
        alertDialog$Builder.g(jb6.M0(2131751291, null), new o(encryptedChat, lp7Var, (byte) 8));
        return alertDialog$Builder;
    }

    public static void T(d dVar, int i, bmb bmbVar, amb ambVar) {
        int i2;
        byte b;
        String str;
        if (dVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = dVar.getParentActivity();
        hk hkVar = new hk(parentActivity);
        String str2 = null;
        hkVar.setBackground(null);
        anb.F(hkVar, cmb.t5, cmb.u5, cmb.p7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = jb6.M0(2131748015, null);
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131751690, null), new dq9((byte) 14));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            textView.setText(gm.S2(jb6.M0(2131751051, null)));
        } else {
            textView.setText(jb6.M0(2131751052, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(gm.L(23.0f), gm.L(12.0f), gm.L(23.0f), gm.L(6.0f));
        int i3 = cmb.i5;
        anb.X(textView, i3, null);
        linearLayout.addView(textView, qoe.o(-1, -2));
        hkVar.setTextSize(1, 16.0f);
        anb.X(hkVar, i3, null);
        hkVar.setMaxLines(1);
        hkVar.setLines(1);
        hkVar.setInputType(16385);
        hkVar.setGravity(51);
        hkVar.setSingleLine(true);
        hkVar.setImeOptions(6);
        hkVar.A(cmb.F6, null);
        hkVar.setCursorSize(gm.L(20.0f));
        hkVar.setCursorWidth(1.5f);
        hkVar.setPadding(0, gm.L(4.0f), 0, 0);
        linearLayout.addView(hkVar, qoe.t(-1, 36, 51, 24, 6, 24, 0));
        hkVar.setOnEditorActionListener(new nh((byte) 0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        b10.q(9306112, hashMap, "Berry", 14598550, "Brandy");
        b10.q(8391495, hashMap, "Cherry", 16744272, "Coral");
        b10.q(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        b10.q(14725375, hashMap, "Mauve", 16761035, "Pink");
        b10.q(16711680, hashMap, "Red", 16711807, "Rose");
        b10.q(8406555, hashMap, "Russet", 16720896, "Scarlet");
        b10.q(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        b10.q(16760576, hashMap, "Amber", 15438707, "Apricot");
        b10.q(16508850, hashMap, "Banana", 10601738, "Citrus");
        b10.q(11560192, hashMap, "Ginger", 16766720, "Gold");
        b10.q(16640272, hashMap, "Lemon", 16753920, "Orange");
        b10.q(16770484, hashMap, "Peach", 16739155, "Persimmon");
        b10.q(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        b10.q(16763004, hashMap, "Topaz", 16776960, "Yellow");
        b10.q(3688720, hashMap, "Clover", 8628829, "Cucumber");
        b10.q(5294200, hashMap, "Emerald", 11907932, "Olive");
        b10.q(65280, hashMap, "Green", 43115, "Jade");
        b10.q(2730887, hashMap, "Jungle", 12582656, "Lime");
        b10.q(776785, hashMap, "Malachite", 10026904, "Mint");
        b10.q(11394989, hashMap, "Moss", 3234721, "Azure");
        b10.q(nm7.d4, hashMap, "Blue", 18347, "Cobalt");
        b10.q(5204422, hashMap, "Indigo", 96647, "Lagoon");
        b10.q(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        b10.q(128, hashMap, "Navy", 3101086, "Sapphire");
        b10.q(7788522, hashMap, "Sky", 32896, "Teal");
        b10.q(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        b10.q(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        b10.q(13148872, hashMap, "Lilac", 11894492, "Lavender");
        b10.q(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        b10.q(6684825, hashMap, "Purple", 14204888, "Thistle");
        b10.q(14315734, hashMap, "Orchid", 2361920, "Violet");
        b10.q(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        b10.q(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        b10.q(7365973, hashMap, "Coffee", 7956873, "Rum");
        b10.q(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        b10.q(12759680, hashMap, "Sand", 8924439, "Sienna");
        b10.q(7864585, hashMap, "Maple", 15787660, "Khaki");
        b10.q(12088115, hashMap, "Copper", 12144200, "Chestnut");
        b10.q(15653316, hashMap, "Almond", 16776656, "Cream");
        b10.q(12186367, hashMap, "Diamond", 11109127, "Honey");
        b10.q(16777200, hashMap, "Ivory", 15392968, "Pearl");
        b10.q(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        b10.q(16777215, hashMap, "White", 8421504, "Gray");
        b10.q(0, hashMap, "Black", 15266260, "Chrome");
        b10.q(3556687, hashMap, "Charcoal", 789277, "Ebony");
        b10.q(12632256, hashMap, "Silver", 16119285, "Smoke");
        b10.q(2499381, hashMap, "Steel", 5220413, "Apple");
        b10.q(8434628, hashMap, "Glacier", 16693933, "Melon");
        b10.q(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        amb i4 = ambVar == null ? cmb.B0().i(false) : ambVar;
        if (i4 == null || (i2 = i4.c) == 0) {
            i2 = gm.q(cmb.r0())[0];
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        Iterator it = hashMap.entrySet().iterator();
        int i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (true) {
            b = 2;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i6 = (red + red2) / 2;
            int i7 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i8 = ((green2 << 2) * green2) + ((((i6 + 512) * i7) * i7) >> 8) + ((((767 - i6) * blue2) * blue2) >> 8);
            if (i8 < i5) {
                str2 = (String) entry.getValue();
                i5 = i8;
            }
        }
        SecureRandom secureRandom = Utilities.b;
        if (secureRandom.nextInt() % 2 == 0) {
            str = kt6.p((String) asList.get(secureRandom.nextInt(asList.size())), " ", str2, new StringBuilder());
        } else {
            str = str2 + " " + ((String) asList2.get(secureRandom.nextInt(asList2.size())));
        }
        hkVar.setText(str);
        hkVar.setSelection(hkVar.length());
        bf bfVar = new bf(hkVar, b);
        he heVar = alertDialog$Builder.a;
        heVar.setOnShowListener(bfVar);
        dVar.showDialog(heVar);
        hkVar.requestFocus();
        heVar.c(-1).setOnClickListener(new oh(dVar, hkVar, ambVar, bmbVar, heVar, (byte) 0));
    }

    public static void U(Activity activity, String str, int i, int i2, int i3, qac qacVar) {
        if (activity == null) {
            return;
        }
        final byte b = 0;
        int w0 = cmb.w0(null, cmb.i5, false);
        int w02 = cmb.w0(null, cmb.g5, false);
        cmb.w0(null, cmb.zj, false);
        cmb.w0(null, cmb.Dj, false);
        cmb.w0(null, cmb.D8, false);
        cmb.w0(null, cmb.F8, false);
        cmb.w0(null, cmb.h6, false);
        cmb.w0(null, cmb.Ii, false);
        cmb.w0(null, cmb.Ei, false);
        cmb.w0(null, cmb.Gi, false);
        final byte b2 = 1;
        my0 i4 = wi8.i(activity, false, 1, null);
        i4.w0 = false;
        yi yiVar = new yi(activity, null);
        zi ziVar = new zi(activity, yiVar);
        ziVar.setOrientation(0);
        ziVar.setWeightSum(1.0f);
        yiVar.setAllItemsCount(24);
        yiVar.setItemCount(5);
        yiVar.setTextColor(w0);
        yiVar.setGravity(5);
        yiVar.setTextOffset(-gm.L(12.0f));
        aj ajVar = new aj(activity, null);
        ajVar.setWrapSelectorWheel(true);
        ajVar.setAllItemsCount(60);
        ajVar.setItemCount(5);
        ajVar.setTextColor(w0);
        ajVar.setGravity(3);
        ajVar.setTextOffset(gm.L(12.0f));
        final kh khVar = new kh(i2, i3, yiVar, ajVar, i, ziVar);
        ziVar.addView(yiVar, qoe.l(0.5f, 0, nm7.s4));
        yiVar.setFormatter(new zg((byte) 8));
        yiVar.setOnValueChangedListener(new jp7() { // from class: lh
            @Override // jp7
            public final void g(lp7 lp7Var, int i5) {
                byte b3 = b;
                kh khVar2 = khVar;
                switch (b3) {
                    case 0:
                        khVar2.a(Boolean.TRUE);
                        break;
                    default:
                        khVar2.a(Boolean.TRUE);
                        break;
                }
            }
        });
        ziVar.addView(ajVar, qoe.l(0.5f, 0, nm7.s4));
        ajVar.setFormatter(new zg((byte) 9));
        ajVar.setOnValueChangedListener(new jp7() { // from class: lh
            @Override // jp7
            public final void g(lp7 lp7Var, int i5) {
                byte b3 = b2;
                kh khVar2 = khVar;
                switch (b3) {
                    case 0:
                        khVar2.a(Boolean.TRUE);
                        break;
                    default:
                        khVar2.a(Boolean.TRUE);
                        break;
                }
            }
        });
        khVar.a(Boolean.FALSE);
        bj bjVar = new bj(activity, yiVar, ajVar);
        bjVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 8));
        bjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        bjVar.addView(ziVar, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        b61 b61Var = new b61(null, activity, true);
        b61Var.setRoundRadius(24);
        b61Var.i(jb6.M0(2131745406, null), false, true);
        b61Var.setOnClickListener(new f5(r1, b2));
        bjVar.addView(b61Var, qoe.t(-1, 48, 0, 16, 12, 16, 12));
        i4.O = bjVar;
        i4.show();
        i4.setOnDismissListener(new ah(qacVar, yiVar, ajVar, b2));
        i4.s0(w02);
        i4.K(w02);
        my0[] my0VarArr = {i4};
    }

    public static he V(Activity activity, final long j, final long j2, String str, final Runnable runnable, ylb ylbVar) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = oc7.r1(z8c.t0).W3;
        boolean z = true;
        final int[] iArr = new int[1];
        if (j != 0) {
            int i = sharedPreferences.getInt(str2, 0);
            iArr[0] = i;
            if (i == 3) {
                iArr[0] = 2;
            } else if (i == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{jb6.M0(2131743300, null), jb6.M0(2131745100, null), jb6.M0(2131748480, null), jb6.M0(2131743299, null)};
        } else {
            int i2 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i2;
            if (i2 == 0) {
                iArr[0] = 1;
            } else if (i2 == 1) {
                iArr[0] = 2;
            } else if (i2 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{jb6.M0(2131743299, null), jb6.M0(2131743300, null), jb6.M0(2131745100, null), jb6.M0(2131748480, null), jb6.M0(2131747554, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout l = td4.l(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        int i3 = 0;
        while (i3 < strArr2.length) {
            x09 x09Var = new x09(activity, ylbVar);
            x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            x09Var.setTag(Integer.valueOf(i3));
            a(x09Var, cmb.f7, cmb.D5, ylbVar);
            x09Var.b(strArr2[i3], iArr[0] == i3 ? z : false);
            l.addView(x09Var);
            x09Var.setOnClickListener(new View.OnClickListener() { // from class: bi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
                    long j3 = j;
                    String str3 = str2;
                    if (j3 != 0) {
                        int i4 = iArr2[0];
                        if (i4 == 0) {
                            edit.putInt(str3, 0);
                        } else if (i4 == 1) {
                            edit.putInt(str3, 1);
                        } else if (i4 == 2) {
                            edit.putInt(str3, 3);
                        } else if (i4 == 3) {
                            edit.putInt(str3, 2);
                        }
                        lo7.n(z8c.t0).f(j3, j2);
                    } else {
                        int i5 = iArr2[0];
                        if (i5 == 0) {
                            edit.putInt(str3, 2);
                        } else if (i5 == 1) {
                            edit.putInt(str3, 0);
                        } else if (i5 == 2) {
                            edit.putInt(str3, 1);
                        } else if (i5 == 3) {
                            edit.putInt(str3, 3);
                        } else if (i5 == 4) {
                            edit.putInt(str3, 4);
                        }
                        if (str3.equals("vibrate_channel")) {
                            lo7.n(z8c.t0).g(2);
                        } else if (str3.equals("vibrate_group")) {
                            lo7.n(z8c.t0).g(0);
                        } else {
                            boolean equals = str3.equals("vibrate_react");
                            int i6 = z8c.t0;
                            if (equals) {
                                lo7.n(i6).g(4);
                            } else {
                                lo7.n(i6).g(1);
                            }
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.a.M0.run();
                    runnable.run();
                }
            });
            i3++;
            str2 = str;
            z = true;
        }
        String M0 = jb6.M0(2131743301, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static he W(Context context, ylb ylbVar, String[] strArr, int i, String str, String str2, gu2 gu2Var) {
        ylb ylbVar2;
        boolean z;
        byte b = 1;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    ylbVar2 = ylbVar;
                    z = true;
                    break;
                }
            }
        }
        ylbVar2 = ylbVar;
        z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, context);
        int i2 = cmb.K5;
        alertDialog$Builder.l(i, 72, cmb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        if (z) {
            str = str2;
        }
        SpannableStringBuilder S2 = gm.S2(str);
        he heVar = alertDialog$Builder.a;
        heVar.U = S2;
        alertDialog$Builder.j(jb6.M0(z ? 2131747033 : 2131752862, null), new wg(z, (Object) context, (Object) atomicBoolean, (Object) gu2Var, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131752857, null), new o(atomicBoolean, gu2Var, (byte) 6));
        heVar.setOnDismissListener(new dg(atomicBoolean, gu2Var, b));
        return heVar;
    }

    public static void X(int i, long j, int i2, qac qacVar) {
        Y(i, j, i2, qacVar, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Y(final int i, final long j, int i2, qac qacVar, long j2) {
        ylb r63Var;
        ylb ylbVar;
        TLRPC.Chat chat;
        char c;
        Activity activity;
        long L1 = oc7.r1(i).L1(j);
        if (L1 <= 0 && j > 0) {
            L1 = pg3.j(oc7.r1(i).L2(j));
        }
        long j3 = i2 * L1;
        jva.v(i, false).P.put(Long.valueOf(j), Integer.valueOf(i2));
        if (j3 <= 0 || j2 == j3) {
            qacVar.a(Long.valueOf(j3));
            return false;
        }
        final long j4 = L1;
        final qf qfVar = new qf(i, j3, j, qacVar, j4, (byte) 1);
        if (j4 <= oc7.r1(i).X3.getLong(wi8.n(j, "ask_paid_message_", "_price"), 0L)) {
            qfVar.run();
            return true;
        }
        Activity u0 = gm.u0();
        d S = LaunchActivity.S();
        if (!PhotoViewer.r0().V0()) {
            if (S == null) {
                ylbVar = null;
                String r = pg3.r(i, j);
                if (sd2.o0(i, j)) {
                }
                c = 0;
                activity = u0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = (int) j4;
                Object[] objArr = new Object[1];
                objArr[c] = r;
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessage1", i3, ',', objArr)));
                spannableStringBuilder.append((CharSequence) " ");
                if (i2 != 1) {
                }
                f0(activity, jb6.M0(2131748311, null), spannableStringBuilder, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new qac() { // from class: zf
                    @Override // qac
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i4 = i;
                            SharedPreferences.Editor edit = oc7.r1(i4).X3.edit();
                            long j5 = j;
                            edit.putLong(wi8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                            jva.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                        }
                        gm.c3(qfVar);
                    }
                }, ylbVar, true);
                return true;
            }
            if (!S.hasShownSheet()) {
                r63Var = S.getResourceProvider();
                ylbVar = r63Var;
                String r2 = pg3.r(i, j);
                if (sd2.o0(i, j)) {
                    r2 = no4.i(i, j);
                } else if (S instanceof yv1) {
                    yv1 yv1Var = (yv1) S;
                    if (yv1Var.v4 && yv1Var.a() == j && (chat = yv1Var.u4) != null) {
                        c = 0;
                        activity = u0;
                        r2 = pg3.r(i, -chat.id);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i32 = (int) j4;
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = r2;
                        spannableStringBuilder2.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessage1", i32, ',', objArr2)));
                        spannableStringBuilder2.append((CharSequence) " ");
                        if (i2 != 1) {
                            spannableStringBuilder2.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessage2One", i32)));
                        } else {
                            spannableStringBuilder2.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessage2Many1", (int) j3)));
                            spannableStringBuilder2.append((CharSequence) " ");
                            spannableStringBuilder2.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessage2Many2", i2)));
                        }
                        f0(activity, jb6.M0(2131748311, null), spannableStringBuilder2, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new qac() { // from class: zf
                            @Override // qac
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i4 = i;
                                    SharedPreferences.Editor edit = oc7.r1(i4).X3.edit();
                                    long j5 = j;
                                    edit.putLong(wi8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                                    jva.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                                }
                                gm.c3(qfVar);
                            }
                        }, ylbVar, true);
                        return true;
                    }
                }
                c = 0;
                activity = u0;
                SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
                int i322 = (int) j4;
                Object[] objArr22 = new Object[1];
                objArr22[c] = r2;
                spannableStringBuilder22.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessage1", i322, ',', objArr22)));
                spannableStringBuilder22.append((CharSequence) " ");
                if (i2 != 1) {
                }
                f0(activity, jb6.M0(2131748311, null), spannableStringBuilder22, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new qac() { // from class: zf
                    @Override // qac
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i4 = i;
                            SharedPreferences.Editor edit = oc7.r1(i4).X3.edit();
                            long j5 = j;
                            edit.putLong(wi8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                            jva.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                        }
                        gm.c3(qfVar);
                    }
                }, ylbVar, true);
                return true;
            }
        }
        r63Var = new r63();
        ylbVar = r63Var;
        String r22 = pg3.r(i, j);
        if (sd2.o0(i, j)) {
        }
        c = 0;
        activity = u0;
        SpannableStringBuilder spannableStringBuilder222 = new SpannableStringBuilder();
        int i3222 = (int) j4;
        Object[] objArr222 = new Object[1];
        objArr222[c] = r22;
        spannableStringBuilder222.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessage1", i3222, ',', objArr222)));
        spannableStringBuilder222.append((CharSequence) " ");
        if (i2 != 1) {
        }
        f0(activity, jb6.M0(2131748311, null), spannableStringBuilder222, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new qac() { // from class: zf
            @Override // qac
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i4 = i;
                    SharedPreferences.Editor edit = oc7.r1(i4).X3.edit();
                    long j5 = j;
                    edit.putLong(wi8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                    jva.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                }
                gm.c3(qfVar);
            }
        }, ylbVar, true);
        return true;
    }

    public static boolean Z(int i, ArrayList arrayList, int i2, qac qacVar) {
        ylb r63Var;
        ylb ylbVar;
        if (arrayList.isEmpty()) {
            qacVar.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        long j2 = 0;
        boolean z = true;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Long l = (Long) obj;
            int i5 = i3;
            long longValue = l.longValue();
            long L1 = oc7.r1(i).L1(longValue);
            if (L1 <= j && longValue > j) {
                L1 = pg3.j(oc7.r1(i).L2(longValue));
            }
            hashMap.put(l, Long.valueOf(L1));
            j2 += L1;
            long j3 = j;
            jva.v(i, false).P.put(l, Integer.valueOf(i2));
            if (L1 > j3) {
                i5++;
            }
            if (L1 > j3 && z && oc7.r1(i).X3.getLong(wi8.n(longValue, "ask_paid_message_", "_price"), j3) < L1) {
                z = false;
            }
            i3 = i5;
            j = 0;
        }
        int i6 = i3;
        long max = j2 * Math.max(1, i2);
        if (z || max <= 0) {
            qacVar.a(hashMap);
            return false;
        }
        Activity u0 = gm.u0();
        d S = LaunchActivity.S();
        if (!PhotoViewer.r0().V0()) {
            if (S == null) {
                ylbVar = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', jb6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
                f0(u0, jb6.M0(2131748311, null), spannableStringBuilder, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fi(i, max, ylbVar, qacVar, u0, arrayList, hashMap), ylbVar, true);
                return true;
            }
            if (!S.hasShownSheet()) {
                r63Var = S.getResourceProvider();
                ylbVar = r63Var;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', jb6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
                f0(u0, jb6.M0(2131748311, null), spannableStringBuilder2, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fi(i, max, ylbVar, qacVar, u0, arrayList, hashMap), ylbVar, true);
                return true;
            }
        }
        r63Var = new r63();
        ylbVar = r63Var;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
        spannableStringBuilder22.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
        spannableStringBuilder22.append((CharSequence) " ");
        spannableStringBuilder22.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', jb6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
        f0(u0, jb6.M0(2131748311, null), spannableStringBuilder22, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fi(i, max, ylbVar, qacVar, u0, arrayList, hashMap), ylbVar, true);
        return true;
    }

    public static void a(x09 x09Var, int i, int i2, ylb ylbVar) {
        for (int i3 = 0; i3 < x09Var.getChildCount(); i3++) {
            View childAt = x09Var.getChildAt(i3);
            if (childAt instanceof RadioButton) {
                anb.O((RadioButton) childAt, i, i2, ylbVar);
                return;
            }
        }
        x09Var.a(cmb.v0(i, ylbVar), cmb.v0(i2, ylbVar));
    }

    public static boolean a0(int i, long j) {
        long L1 = oc7.r1(i).L1(j);
        if (L1 <= 0 && j > 0) {
            L1 = pg3.j(oc7.r1(i).L2(j));
        }
        return L1 > 0 && L1 > oc7.r1(i).X3.getLong(wi8.n(j, "ask_paid_message_", "_price"), 0L);
    }

    public static void b(lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i = 1;
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i5 = calendar.get(1);
        int i6 = calendar.get(2);
        int i7 = calendar.get(5);
        lp7Var3.setMaxValue(i5);
        lp7Var3.setMinValue(i2);
        int value = lp7Var3.getValue();
        lp7Var2.setMaxValue(value == i5 ? i6 : 11);
        lp7Var2.setMinValue(value == i2 ? i3 : 0);
        int value2 = lp7Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i5 && value2 == i6) {
            actualMaximum = Math.min(i7, actualMaximum);
        }
        lp7Var.setMaxValue(actualMaximum);
        if (value == i2 && value2 == i3) {
            i = i4;
        }
        lp7Var.setMinValue(i);
    }

    public static void b0(hk hkVar, he heVar, d dVar) {
        if (dVar.getParentActivity() != null) {
            gm.t1(hkVar);
            String obj = hkVar.getText().toString();
            int i = cmb.a;
            bmb bmbVar = new bmb();
            bmbVar.b = new File(a.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
            bmbVar.a = obj;
            cmb.g0 = cmb.Z0(cmb.I.j0);
            bmbVar.F = z8c.t0;
            cmb.v1(bmbVar, true, true, false);
            nm7.e().k(nm7.s4, new Object[0]);
            new ThemeEditorView().d(dVar.getParentActivity(), bmbVar);
            heVar.dismiss();
            SharedPreferences d1 = oc7.d1();
            if (d1.getBoolean("themehint", false)) {
                return;
            }
            d1.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(dVar.getParentActivity(), jb6.M0(2131751647, null), 1).show();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public static long c(b61 b61Var, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, lp7 lp7Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((lp7Var2.getValue() - 120) / 12) + i2;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (lp7Var2.getValue() - 120) % 12);
        lp7Var.setMinValue(1);
        lp7Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = lp7Var.getValue();
        int value3 = lp7Var3.getValue();
        int value4 = lp7Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (b61Var != null) {
            if (value2 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            b61Var.setText(jb6.D0().w0(i + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static he c0(final int i, TLRPC.TL_error tL_error, d dVar, TLObject tLObject, Object... objArr) {
        String str;
        char c;
        String str2;
        final long j;
        long m;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long l = jva.l(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    m = pg3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    m = pg3.m(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    m = pg3.m(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    m = pg3.m(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    m = pg3.m(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                } else {
                    j = 0;
                    if (l > 0) {
                        jva.v(i, false).n(new Runnable() { // from class: ch
                            @Override // java.lang.Runnable
                            public final void run() {
                                ylb r63Var;
                                Activity u0 = gm.u0();
                                d S = LaunchActivity.S();
                                if (!PhotoViewer.r0().V0()) {
                                    if (S == null) {
                                        r63Var = null;
                                    } else if (!S.hasShownSheet()) {
                                        r63Var = S.getResourceProvider();
                                    }
                                    ylb ylbVar = r63Var;
                                    int i2 = i;
                                    long j2 = j;
                                    new dxa(u0, ylbVar, l, 13, pg3.r(i2, j2), new jd((byte) 10), j2).show();
                                }
                                r63Var = new r63();
                                ylb ylbVar2 = r63Var;
                                int i22 = i;
                                long j22 = j;
                                new dxa(u0, ylbVar2, l, 13, pg3.r(i22, j22), new jd((byte) 10), j22).show();
                            }
                        }, true, true);
                        return null;
                    }
                }
                j = m;
                if (l > 0) {
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    r0(dVar, jb6.M0(2131749123, null), jb6.M0(2131749124, null), null);
                    return null;
                }
                boolean z = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long m2 = pg3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (m2 >= 0) {
                        str2 = m9c.k(oc7.r1(i).W1(Long.valueOf(m2)), true);
                    } else {
                        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-m2));
                        str2 = L0 != null ? L0.title : "";
                    }
                    r0(dVar == null ? LaunchActivity.Q() : dVar, jb6.M0(2131748296, null), jb6.a0(null, null, 2131748297, str2), null);
                    oc7.r1(i).j2(0, m2);
                    return null;
                }
                boolean z2 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z2 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z2 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    d Q = dVar == null ? LaunchActivity.Q() : dVar;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749009, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749001, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749015, null), null);
                            return null;
                        }
                        r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749016, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749012, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749014, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749011, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749013, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        r0(Q, jb6.M0(2131749010, null), jb6.M0(2131749008, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        j0(tL_error.text, Q);
                        return null;
                    }
                    r0(Q, jb6.M0(2131749010, null), jb6.M0(2131751042, null) + "\n" + tL_error.text, null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        d Q2 = dVar == null ? LaunchActivity.Q() : dVar;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            r0(Q2, null, jb6.M0(2131748936, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            r0(Q2, null, jb6.M0(2131750619, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            u0(Q2.getParentActivity(), jb6.M0(2131743507, null), true);
                            return null;
                        }
                        r0(Q2, null, jb6.M0(2131751042, null) + "\n" + tL_error.text, null);
                        return null;
                    }
                    boolean z3 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i2 = nm7.M0;
                    if (z3 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        String str3 = tL_error.text;
                        if (dVar != null) {
                            if (!str3.equals("CHANNELS_TOO_MUCH")) {
                                e0(tL_error, dVar, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                                return null;
                            }
                            if (dVar.getParentActivity() != null) {
                                dVar.showDialog(new i46(5, i, null, dVar.getParentActivity(), dVar));
                                return null;
                            }
                            if (z3 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                dVar.presentFragment(new avb(0));
                                return null;
                            }
                            dVar.presentFragment(new avb(1));
                            return null;
                        }
                        if (str3.equals("PEER_FLOOD")) {
                            nm7.f(i).k(i2, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            d Q3 = dVar == null ? LaunchActivity.Q() : dVar;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new i46(5, i, null, Q3.getParentActivity(), Q3));
                                    return null;
                                }
                                Q3.presentFragment(new avb(2));
                                return null;
                            }
                            d dVar2 = Q3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, dVar2);
                                return null;
                            }
                            e0(tL_error, dVar2, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            d Q4 = dVar == null ? LaunchActivity.Q() : dVar;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q4.getParentActivity() != null) {
                                    Q4.showDialog(new i46(5, i, null, Q4.getParentActivity(), Q4));
                                    return null;
                                }
                                Q4.presentFragment(new avb(2));
                                return null;
                            }
                            d dVar3 = Q4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, dVar3);
                                return null;
                            }
                            e0(tL_error, dVar3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (dVar != null) {
                                    r0(dVar, null, jb6.M0(2131751208, null), null);
                                    return null;
                                }
                                t0(jb6.M0(2131751208, null), null);
                                return null;
                            }
                        } else {
                            if (z || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long m3 = z ? pg3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? pg3.m(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? pg3.m(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? pg3.m(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? pg3.m(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? pg3.m(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? pg3.m(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str4 = tL_error.text;
                                if (str4 == null || !str4.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str5 = tL_error.text;
                                    str5.getClass();
                                    switch (str5) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            nm7.f(i).k(i2, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            nm7.f(i).k(i2, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            t0(jb6.M0(2131748286, null), dVar);
                                            break;
                                    }
                                    return null;
                                }
                                String str6 = tL_error.text;
                                TLRPC.Chat L02 = m3 < 0 ? oc7.r1(i).L0(Long.valueOf(-m3)) : null;
                                String str7 = tL_error.text;
                                str7.getClass();
                                switch (str7.hashCode()) {
                                    case -1813346101:
                                        if (str7.equals("CHAT_SEND_VOICES_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case -1755013292:
                                        if (str7.equals("CHAT_SEND_PLAIN_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case -1463451737:
                                        if (str7.equals("CHAT_SEND_AUDIOS_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case -446466679:
                                        if (str7.equals("CHAT_SEND_POLL_FORBIDDEN")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                    case 469767429:
                                        if (str7.equals("CHAT_SEND_DOCS_FORBIDDEN")) {
                                            c = 4;
                                            break;
                                        }
                                        break;
                                    case 788688112:
                                        if (str7.equals("CHAT_SEND_ROUNDVIDEOS_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case 963091938:
                                        if (str7.equals("CHAT_SEND_VIDEOS_FORBIDDEN")) {
                                            c = 6;
                                            break;
                                        }
                                        break;
                                    case 1100757753:
                                        if (str7.equals("CHAT_SEND_GIFS_FORBIDDEN")) {
                                            c = 7;
                                            break;
                                        }
                                        break;
                                    case 1146489803:
                                        if (str7.equals("CHAT_SEND_PHOTOS_FORBIDDEN")) {
                                            break;
                                        }
                                        break;
                                    case 1701620704:
                                        if (str7.equals("CHAT_SEND_STICKERS_FORBIDDEN")) {
                                            c = '\t';
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
                                    Method dump skipped, instructions count: 2628
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: ik.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.d, org.telegram.tgnet.TLObject, java.lang.Object[]):he");
                            }

                            public static void d(lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i = 1;
                                int i2 = calendar.get(1);
                                int i3 = calendar.get(2);
                                int i4 = calendar.get(5);
                                lp7Var3.setMinValue(i2);
                                int value = lp7Var3.getValue();
                                lp7Var2.setMinValue(value == i2 ? i3 : 0);
                                int value2 = lp7Var2.getValue();
                                if (value == i2 && value2 == i3) {
                                    i = i4;
                                }
                                lp7Var.setMinValue(i);
                            }

                            public static void d0(Context context, ylb ylbVar, String str, TLRPC.WebPage webPage, final qac qacVar, z62 z62Var) {
                                Activity W = gm.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final he[] heVarArr = new he[1];
                                byte b = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                                String M0 = jb6.M0(2131746886, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131746887, null);
                                final mj mjVar = new mj(context);
                                mjVar.setTextSize(1, 16.0f);
                                int i = cmb.i5;
                                anb.X(mjVar, i, ylbVar);
                                anb.D(mjVar, cmb.Ni, ylbVar);
                                mjVar.setHint(jb6.M0(2131746885, null));
                                mjVar.setInputType(17);
                                mjVar.setImeOptions(6);
                                mjVar.setMaxLines(10);
                                mjVar.setSingleLine(false);
                                mjVar.setPadding(gm.L(16.0f), gm.L(13.0f), gm.L(16.0f), gm.L(13.0f));
                                mjVar.setCursorWidth(1.5f);
                                mjVar.A(cmb.p6, ylbVar);
                                if (str != null) {
                                    mjVar.setText(str);
                                    mjVar.setSelection(str.length());
                                }
                                mjVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ih
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                                        if (i2 != 6) {
                                            return false;
                                        }
                                        mj mjVar2 = mj.this;
                                        String trim = mjVar2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : ik.a.matcher(trim.trim()).matches())) {
                                            gm.z3(mjVar2);
                                            return true;
                                        }
                                        qacVar.a(trim);
                                        he heVar2 = heVarArr[0];
                                        if (heVar2 != null) {
                                            heVar2.dismiss();
                                        }
                                        View view = currentFocus;
                                        if (view != null) {
                                            view.requestFocus();
                                        }
                                        return true;
                                    }
                                });
                                ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i, ylbVar)));
                                wmb K = anb.K(0.06f, i);
                                mjVar.setBackground(b0);
                                anb.j(mjVar, b0, K, null, ylbVar);
                                LinearLayout i2 = hg9.i(context, 1);
                                i2.addView(mjVar, qoe.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i3 = kvc.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    kvc kvcVar = new kvc(context, ylbVar);
                                    kvcVar.setWebPage(webPage);
                                    i2.addView(kvcVar, qoe.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.b();
                                alertDialog$Builder.n(i2);
                                heVar.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
                                byte b2 = 7;
                                alertDialog$Builder.j(jb6.M0(2131751291, null), new o(mjVar, qacVar, b2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), new zg(b2));
                                if (z62Var != null) {
                                    alertDialog$Builder.h(jb6.M0(2131751535, null), new l0(z62Var, (byte) 16));
                                }
                                heVarArr[0] = heVar;
                                heVar.k0 = false;
                                heVar.setOnDismissListener(new n1(mjVar, (byte) 4));
                                heVarArr[0].setOnShowListener(new jh(mjVar, b));
                                heVarArr[0].show();
                                TextView textView = (TextView) heVarArr[0].c(-3);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                }
                            }

                            public static void e(TextView textView, lp7 lp7Var, kj kjVar, lj ljVar) {
                                int value = lp7Var.getValue();
                                int value2 = kjVar.getValue();
                                int value3 = ljVar.getValue();
                                Calendar calendar = Calendar.getInstance();
                                long currentTimeMillis = System.currentTimeMillis();
                                calendar.setTimeInMillis(currentTimeMillis);
                                calendar.add(6, value);
                                calendar.set(11, value2);
                                calendar.set(12, value3);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
                                int i = timeInMillis / 86400;
                                int i2 = (timeInMillis % 86400) / 3600;
                                int i3 = (timeInMillis % 3600) / 60;
                                textView.setText(jb6.a0(null, null, 2131746907, jb6.a0(null, null, 2131746906, i > 0 ? jb6.G(i, "Days", new Object[0]) : "", i2 > 0 ? jb6.G(i2, "Hours", new Object[0]) : "", i3 > 0 ? jb6.G(i3, "Minutes", new Object[0]) : "").trim()));
                            }

                            public static void e0(TLRPC.TL_error tL_error, d dVar, boolean z, boolean z2, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                he heVar;
                                byte b;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                                String M0 = jb6.M0(R.string.AppName, null);
                                heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                String str = tL_error.text;
                                str.getClass();
                                b = 3;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        heVar.U = jb6.M0(2131748515, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        heVar.U = jb6.M0(2131746325, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        heVar.U = jb6.M0(2131751685, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z) {
                                            heVar.U = jb6.M0(2131749146, null);
                                            break;
                                        } else {
                                            heVar.U = jb6.M0(2131752208, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        heVar.U = jb6.M0(2131743415, null);
                                        break;
                                    case "PEER_FLOOD":
                                        heVar.U = jb6.M0(2131747860, null);
                                        alertDialog$Builder.g(jb6.M0(2131748088, null), new h6(dVar, b));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z) {
                                            heVar.U = jb6.M0(2131749144, null);
                                            break;
                                        } else {
                                            heVar.U = jb6.M0(2131752206, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            heVar.U = jb6.M0(2131754474, null);
                                            break;
                                        } else {
                                            heVar.U = jb6.M0(2131754361, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        heVar.U = jb6.M0(2131742505, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        heVar.U = jb6.M0(2131754462, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z) {
                                            heVar.U = jb6.M0(2131749147, null);
                                            break;
                                        } else {
                                            heVar.U = jb6.M0(2131752209, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z) {
                                            heVar.U = jb6.M0(2131749145, null);
                                            break;
                                        } else {
                                            heVar.U = jb6.M0(2131752207, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        heVar.S = jb6.M0(2131752220, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            heVar.U = jb6.M0(2131752221, null);
                                            break;
                                        } else {
                                            heVar.U = jb6.M0(2131752222, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        heVar.S = jb6.M0(2131752220, null);
                                        heVar.U = jb6.M0(2131743444, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z) {
                                            heVar.U = jb6.M0(2131749143, null);
                                            break;
                                        } else {
                                            heVar.U = jb6.M0(2131752205, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        heVar.U = jb6.M0(2131754473, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z2) {
                                            if (!z) {
                                                heVar.U = jb6.M0(2131748866, null);
                                                break;
                                            } else {
                                                heVar.U = jb6.M0(2131748869, null);
                                                break;
                                            }
                                        } else {
                                            heVar.U = jb6.M0(2131748868, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        heVar.S = jb6.M0(2131742990, null);
                                        heVar.U = jb6.M0(2131743060, null);
                                        break;
                                    default:
                                        heVar.U = jb6.M0(2131751042, null) + "\n" + tL_error.text;
                                        break;
                                }
                                b10.t(null, 2131747564, alertDialog$Builder, null);
                            }

                            public static void f(int i, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
                                TLRPC.User user;
                                if (tL_messages_invitedUsers == null || tL_messages_invitedUsers.missing_invitees.isEmpty() || chat == null) {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
                                int size = arrayList4.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i2);
                                    i2++;
                                    TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
                                    if (tL_messages_invitedUsers.updates != null) {
                                        for (int i3 = 0; i3 < tL_messages_invitedUsers.updates.users.size(); i3++) {
                                            user = tL_messages_invitedUsers.updates.users.get(i3);
                                            if (user.id == tL_missingInvitee2.user_id) {
                                                break;
                                            }
                                        }
                                    }
                                    user = null;
                                    if (user == null) {
                                        user = oc7.r1(i).W1(Long.valueOf(tL_missingInvitee2.user_id));
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
                                gm.d3(new i77(i, (Object) chat, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, (byte) 1), 200L);
                            }

                            public static he f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, qac qacVar, ylb ylbVar, boolean z) {
                                if (activity == null) {
                                    qacVar.a(Boolean.FALSE);
                                    return null;
                                }
                                byte b = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
                                byte b2 = 1;
                                oh2[] oh2VarArr = new oh2[1];
                                boolean[] zArr = {false};
                                wb wbVar = new wb(activity, (byte) 10);
                                nm7.i(wbVar);
                                anb.X(wbVar, cmb.i5, ylbVar);
                                wbVar.setTextSize(1, 16.0f);
                                byte b3 = 3;
                                wbVar.setGravity((jb6.a0 ? 5 : 3) | 48);
                                wbVar.setText(charSequence);
                                ri riVar = new ri(activity, oh2VarArr, b2);
                                he heVar = alertDialog$Builder.a;
                                heVar.H = (byte) 6;
                                alertDialog$Builder.n(riVar);
                                TextView textView = new TextView(activity);
                                td4.x(textView, cmb.D8, ylbVar, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                riVar.addView(textView, qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                riVar.addView(wbVar, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    oh2 oh2Var = new oh2(1, ylbVar, activity);
                                    oh2VarArr[0] = oh2Var;
                                    int i = cmb.h6;
                                    fg0 f0 = cmb.f0(cmb.v0(i, ylbVar), 7, gm.L(12.0f));
                                    wmb M = anb.M(i);
                                    oh2Var.setBackground(f0);
                                    anb.j(oh2Var, f0, null, M, ylbVar);
                                    oh2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (jb6.a0 ? 5 : 3) | 16;
                                    oh2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    oh2VarArr[0].e(charSequence2, "", false, false, false);
                                    oh2VarArr[0].setPadding(jb6.a0 ? gm.L(4.0f) : 0, gm.L(12.0f), jb6.a0 ? 0 : gm.L(4.0f), gm.L(12.0f));
                                    riVar.addView(oh2VarArr[0], qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    oh2VarArr[0].setOnClickListener(new gf(zArr, b3));
                                }
                                alertDialog$Builder.j(str2, new ai(b, qacVar, zArr));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                if (z) {
                                    heVar.Y0 = true;
                                }
                                heVar.show();
                                return heVar;
                            }

                            public static boolean g(TextView textView, TextView textView2, long j, long j2, int i, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
                                long j3;
                                int i2;
                                long j4;
                                int i3;
                                int i4;
                                int i5;
                                boolean z;
                                boolean z2;
                                String G;
                                int value = lp7Var.getValue();
                                int value2 = lp7Var2.getValue();
                                int value3 = lp7Var3.getValue();
                                Calendar calendar = Calendar.getInstance();
                                long currentTimeMillis = System.currentTimeMillis();
                                calendar.setTimeInMillis(currentTimeMillis);
                                int i6 = calendar.get(1);
                                calendar.get(6);
                                if (j2 > 0) {
                                    i2 = i6;
                                    calendar.setTimeInMillis((j2 * 1000) + currentTimeMillis);
                                    calendar.set(11, 23);
                                    calendar.set(12, 59);
                                    calendar.set(13, 59);
                                    calendar.set(14, 0);
                                    j3 = currentTimeMillis;
                                    i3 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
                                    j4 = calendar.getTimeInMillis();
                                    i4 = 23;
                                    i5 = 59;
                                } else {
                                    j3 = currentTimeMillis;
                                    i2 = i6;
                                    j4 = j2;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                }
                                int i7 = i5;
                                long millis = j > 0 ? TimeUnit.SECONDS.toMillis(j) : 60000L;
                                long j5 = j3 + millis;
                                calendar.setTimeInMillis(j5);
                                int i8 = calendar.get(11);
                                int i9 = calendar.get(12);
                                long j6 = j4;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                calendar.add(6, value);
                                calendar.set(11, value2);
                                calendar.set(12, value3);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                long timeInMillis = calendar.getTimeInMillis();
                                lp7Var.setMinValue(0);
                                if (j6 > 0) {
                                    lp7Var.setMaxValue(i3);
                                }
                                int value4 = lp7Var.getValue();
                                lp7Var2.setMinValue(value4 == 0 ? i8 : 0);
                                if (j6 > 0) {
                                    lp7Var2.setMaxValue(value4 == i3 ? i4 : 23);
                                }
                                int value5 = lp7Var2.getValue();
                                lp7Var3.setMinValue((value4 == 0 && value5 == i8) ? i9 : 0);
                                if (j6 > 0) {
                                    lp7Var3.setMaxValue((value4 == i3 && value5 == i4) ? i7 : 59);
                                }
                                int value6 = lp7Var3.getValue();
                                if (timeInMillis <= j5) {
                                    calendar.setTimeInMillis(j5);
                                } else if (j6 > 0 && timeInMillis > j6) {
                                    calendar.setTimeInMillis(j6);
                                }
                                int i10 = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                calendar.add(6, value4);
                                calendar.set(11, value5);
                                calendar.set(12, value6);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                long timeInMillis2 = calendar.getTimeInMillis();
                                if (textView != null) {
                                    textView.setText(jb6.D0().w0((i * 3) + (value4 == 0 ? 0 : i2 == i10 ? 1 : 2)).format(timeInMillis2));
                                }
                                if (textView2 != null) {
                                    int i11 = (int) ((timeInMillis2 - j3) / 1000);
                                    if (i11 > 86400) {
                                        z2 = false;
                                        G = jb6.G(Math.round(i11 / 86400.0f), "DaysSchedule", new Object[0]);
                                    } else {
                                        z2 = false;
                                        z2 = false;
                                        z2 = false;
                                        G = i11 >= 3600 ? jb6.G(Math.round(i11 / 3600.0f), "HoursSchedule", new Object[0]) : i11 >= 60 ? jb6.G(Math.round(i11 / 60.0f), "MinutesSchedule", new Object[0]) : jb6.G(i11, "SecondsSchedule", new Object[0]);
                                    }
                                    if (textView2.getTag() != null) {
                                        z = true;
                                        Object[] objArr = new Object[1];
                                        objArr[z2 ? 1 : 0] = G;
                                        textView2.setText(jb6.a0("VoipChannelScheduleInfo", null, 2131743147, objArr));
                                    } else {
                                        z = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z2 ? 1 : 0] = G;
                                        textView2.setText(jb6.a0("VoipGroupScheduleInfo", null, 2131743026, objArr2));
                                    }
                                } else {
                                    z = true;
                                    z2 = false;
                                }
                                return timeInMillis - j3 > millis ? z : z2;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:36:0x01c2  */
                            /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
                            /* JADX WARN: Type inference failed for: r0v36, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
                            /* JADX WARN: Type inference failed for: r13v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
                            /* JADX WARN: Type inference failed for: r14v12 */
                            /* JADX WARN: Type inference failed for: r14v6, types: [ee, java.lang.String, ylb] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [oh2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [oh2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.d] */
                            /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [oh2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void g0(d dVar, long j, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z, TLRPC.ChatFull chatFull, final we7 we7Var, ylb ylbVar) {
                                long j2;
                                boolean z2;
                                String str;
                                String M0;
                                ?? r9;
                                ?? r14;
                                TextView textView;
                                String str2;
                                if (dVar.getParentActivity() == null) {
                                    return;
                                }
                                final j5 accountInstance = dVar.getAccountInstance();
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, dVar.getParentActivity());
                                SharedPreferences sharedPreferences = oc7.r1(dVar.getCurrentAccount()).W3;
                                int i = 1;
                                if (encryptedChat == null) {
                                    j2 = j;
                                    if (!kt6.w("dialog_bar_report", j2, sharedPreferences, false)) {
                                        z2 = false;
                                        he heVar = alertDialog$Builder.a;
                                        if (user == null) {
                                            heVar.S = jb6.a0("BlockUserTitle", null, 2131753650, m9c.k(user, true));
                                            heVar.U = gm.S2(jb6.a0("BlockUserAlert", null, 2131753656, m9c.k(user, true)));
                                            String M02 = jb6.M0(2131753658, null);
                                            int i2 = 2;
                                            r9 = new oh2[2];
                                            int i3 = 0;
                                            ?? linearLayout = new LinearLayout(dVar.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i4 = 0;
                                            while (i4 < i2) {
                                                if (i4 != 0 || z2) {
                                                    oh2 oh2Var = new oh2(i, ylbVar, dVar.getParentActivity());
                                                    r9[i4] = oh2Var;
                                                    oh2Var.setBackgroundDrawable(cmb.L0(i3));
                                                    r9[i4].setTag(Integer.valueOf(i4));
                                                    if (i4 == 0) {
                                                        r9[i4].e(jb6.M0(2131751439, null), "", true, false, false);
                                                        str2 = M02;
                                                    } else {
                                                        str2 = M02;
                                                        r9[i4].e(jb6.a0("DeleteThisChat", null, 2131751419, new Object[i3]), "", true, false, false);
                                                    }
                                                    r9[i4].setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                                                    linearLayout.addView(r9[i4], qoe.o(-1, -2));
                                                    r9[i4].setOnClickListener(new ye(r9, (byte) 1));
                                                } else {
                                                    str2 = M02;
                                                }
                                                i4++;
                                                M02 = str2;
                                                i = 1;
                                                i2 = 2;
                                                i3 = 0;
                                            }
                                            alertDialog$Builder.n(linearLayout);
                                            M0 = M02;
                                            r14 = 0;
                                        } else {
                                            if (chat == null || !z) {
                                                str = null;
                                                str = null;
                                                heVar.S = jb6.M0(2131745933, null);
                                                if (!sd2.T(chat) || chat.megagroup) {
                                                    heVar.U = jb6.M0(2131745937, null);
                                                } else {
                                                    heVar.U = jb6.M0(2131745938, null);
                                                }
                                            } else {
                                                heVar.S = jb6.M0(2131745922, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        heVar.U = gm.S2(jb6.a0("ReportUnrelatedGroupText", null, 2131745921, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                heVar.U = jb6.M0(2131745920, null);
                                            }
                                            M0 = jb6.M0(2131745963, str);
                                            r9 = str;
                                            r14 = str;
                                        }
                                        final oh2[] oh2VarArr = r9;
                                        final long j3 = j2;
                                        alertDialog$Builder.j(M0, new ee() { // from class: yf
                                            @Override // ee
                                            public final void r(he heVar2, int i5) {
                                                oh2 oh2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                j5 j5Var = accountInstance;
                                                if (user2 != null) {
                                                    oc7.r1(j5Var.a).t(user2.id);
                                                }
                                                oh2[] oh2VarArr2 = oh2VarArr;
                                                long j4 = j3;
                                                TLRPC.Chat chat2 = chat;
                                                if (oh2VarArr2 == null || ((oh2Var2 = oh2VarArr2[0]) != null && oh2Var2.b())) {
                                                    oc7.r1(j5Var.a).t4(j4, user2, chat2, encryptedChat, chat2 != null && z);
                                                }
                                                we7 we7Var2 = we7Var;
                                                if (oh2VarArr2 != null && !oh2VarArr2[1].b()) {
                                                    we7Var2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    oc7.r1(j5Var.a).T(0, j4, false);
                                                } else if (sd2.r0(chat2)) {
                                                    oc7.r1(j5Var.a).T(0, j4, false);
                                                } else {
                                                    int i6 = j5Var.a;
                                                    oc7.r1(i6).b0(-j4, oc7.r1(i6).W1(Long.valueOf(z8c.h(i6).e())));
                                                }
                                                we7Var2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.g(jb6.M0(2131752542, r14), r14);
                                        dVar.showDialog(heVar);
                                        textView = (TextView) heVar.c(-1);
                                        if (textView == null) {
                                            anb.X(textView, cmb.p7, r14);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    j2 = j;
                                }
                                z2 = true;
                                he heVar2 = alertDialog$Builder.a;
                                if (user == null) {
                                }
                                final oh2[] oh2VarArr2 = r9;
                                final long j32 = j2;
                                alertDialog$Builder.j(M0, new ee() { // from class: yf
                                    @Override // ee
                                    public final void r(he heVar22, int i5) {
                                        oh2 oh2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        j5 j5Var = accountInstance;
                                        if (user2 != null) {
                                            oc7.r1(j5Var.a).t(user2.id);
                                        }
                                        oh2[] oh2VarArr22 = oh2VarArr2;
                                        long j4 = j32;
                                        TLRPC.Chat chat2 = chat;
                                        if (oh2VarArr22 == null || ((oh2Var2 = oh2VarArr22[0]) != null && oh2Var2.b())) {
                                            oc7.r1(j5Var.a).t4(j4, user2, chat2, encryptedChat, chat2 != null && z);
                                        }
                                        we7 we7Var2 = we7Var;
                                        if (oh2VarArr22 != null && !oh2VarArr22[1].b()) {
                                            we7Var2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            oc7.r1(j5Var.a).T(0, j4, false);
                                        } else if (sd2.r0(chat2)) {
                                            oc7.r1(j5Var.a).T(0, j4, false);
                                        } else {
                                            int i6 = j5Var.a;
                                            oc7.r1(i6).b0(-j4, oc7.r1(i6).W1(Long.valueOf(z8c.h(i6).e())));
                                        }
                                        we7Var2.a(1);
                                    }
                                });
                                alertDialog$Builder.g(jb6.M0(2131752542, r14), r14);
                                dVar.showDialog(heVar2);
                                textView = (TextView) heVar2.c(-1);
                                if (textView == null) {
                                }
                            }

                            public static boolean h(Context context, int i, long j, boolean z) {
                                TLRPC.Chat L0;
                                if (!pg3.y(j) || (L0 = oc7.r1(i).L0(Long.valueOf(-j))) == null || !L0.slowmode_enabled || sd2.N(L0)) {
                                    return false;
                                }
                                if (!z) {
                                    TLRPC.ChatFull M0 = oc7.r1(i).M0(L0.id);
                                    if (M0 == null) {
                                        M0 = cf7.Y(i).C0(L0.id, sd2.T(L0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (M0 != null && M0.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    return false;
                                }
                                K(context, L0.title, jb6.M0(2131745036, null)).o();
                                return true;
                            }

                            public static void h0(yv1 yv1Var, k47 k47Var, long j, ylb ylbVar, ho1 ho1Var) {
                                if (yv1Var.getParentActivity() == null || k47Var == null) {
                                    return;
                                }
                                j5 accountInstance = yv1Var.getAccountInstance();
                                TLRPC.User W1 = j > 0 ? oc7.r1(accountInstance.a).W1(Long.valueOf(j)) : null;
                                TLRPC.Chat L0 = j < 0 ? oc7.r1(accountInstance.a).L0(Long.valueOf(-j)) : null;
                                if (W1 == null && L0 == null) {
                                    return;
                                }
                                byte b = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, yv1Var.getParentActivity());
                                he heVar = alertDialog$Builder.a;
                                heVar.Q0 = false;
                                heVar.O = new n1(ho1Var, (byte) 2);
                                heVar.S = jb6.M0(2131753657, null);
                                if (W1 != null) {
                                    heVar.U = gm.S2(jb6.a0("BlockUserReplyAlert", null, 2131753651, m9c.k(W1, true)));
                                } else {
                                    heVar.U = gm.S2(jb6.a0("BlockUserReplyAlert", null, 2131753651, L0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(yv1Var.getParentActivity());
                                linearLayout.setOrientation(1);
                                oh2[] oh2VarArr = {new oh2(1, ylbVar, yv1Var.getParentActivity())};
                                oh2VarArr[0].setBackgroundDrawable(cmb.L0(false));
                                oh2VarArr[0].setTag(0);
                                oh2VarArr[0].e(jb6.M0(2131751439, null), "", true, false, false);
                                oh2VarArr[0].setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                                linearLayout.addView(oh2VarArr[0], qoe.o(-1, -2));
                                oh2VarArr[0].setOnClickListener(new ye(oh2VarArr, b));
                                alertDialog$Builder.n(linearLayout);
                                alertDialog$Builder.j(jb6.M0(2131753660, null), new ze(W1, accountInstance, yv1Var, L0, k47Var, oh2VarArr, ylbVar));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                yv1Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                }
                            }

                            public static he i(Activity activity, ek ekVar) {
                                if (z8c.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                he heVar = alertDialog$Builder.a;
                                td tdVar = heVar.M0;
                                he[] heVarArr = new he[1];
                                LinearLayout l = td4.l(activity, 1);
                                for (int i = 0; i < 4; i++) {
                                    if (z8c.h(i).f() != null) {
                                        k5 k5Var = new k5(activity, false);
                                        k5Var.f = i;
                                        TLRPC.User f = z8c.h(i).f();
                                        pc0 pc0Var = k5Var.e;
                                        pc0Var.q(f);
                                        k5Var.a.l(bw2.m(0, f.first_name, f.last_name), false);
                                        bf0 bf0Var = k5Var.c;
                                        bf0Var.getImageReceiver().d = i;
                                        bf0Var.f(f, pc0Var);
                                        k5Var.d.setVisibility(4);
                                        k5Var.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                                        k5Var.setBackgroundDrawable(cmb.L0(false));
                                        l.addView(k5Var, qoe.o(-1, 50));
                                        k5Var.setOnClickListener(new b0(heVarArr, tdVar, ekVar, (byte) 3));
                                    }
                                }
                                heVar.S = jb6.M0(2131745405, null);
                                alertDialog$Builder.n(l);
                                alertDialog$Builder.j(jb6.M0(2131752542, null), null);
                                heVarArr[0] = heVar;
                                return heVar;
                            }

                            public static void i0(Context context, int i, long j) {
                                my0 h = hg9.h(1, null, context, false);
                                LinearLayout i2 = hg9.i(context, 1);
                                i2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(8.0f));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                i2.addView(frameLayout, qoe.t(-1, 92, 17, 0, 0, 0, 0));
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                imageView.setImageResource(R.drawable.story_link);
                                imageView.setScaleX(2.0f);
                                imageView.setScaleY(2.0f);
                                frameLayout2.addView(imageView, qoe.e(-1, -1, 17));
                                int L = gm.L(80.0f);
                                int i3 = cmb.Ei;
                                ShapeDrawable K = cmb.K(L, cmb.w0(null, i3, false));
                                wmb M = anb.M(i3);
                                frameLayout2.setBackground(K);
                                anb.j(frameLayout2, K, M, null, null);
                                frameLayout.addView(frameLayout2, qoe.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i4 = cmb.F6;
                                td4.x(textView, i4, null, 1, 20.0f);
                                textView.setText(jb6.M0(2131752577, null));
                                textView.setGravity(17);
                                TextView m = wi8.m(i2, textView, qoe.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                anb.X(m, i4, null);
                                m.setTextSize(1, 14.0f);
                                hg9.q(null, null, 2131752578, new Object[]{pg3.k(i, j)}, m);
                                m.setGravity(17);
                                i2.addView(m, qoe.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                b61 b61Var = new b61(null, context, true);
                                b61Var.i(jb6.M0(2131752579, null), false, true);
                                i2.addView(b61Var, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                h.O = i2;
                                b61Var.setOnClickListener(new ii(i, b61Var, h, j));
                                h.J();
                                h.show();
                            }

                            public static he j(Context context, ylb ylbVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                                String M0 = jb6.M0(2131754208, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.U = M0;
                                int i = cmb.K5;
                                alertDialog$Builder.l(R.raw.permission_request_apk, 72, cmb.w0(null, i, false), null);
                                alertDialog$Builder.m(i, null);
                                alertDialog$Builder.j(jb6.M0(2131747033, null), new oe(context, (byte) 0));
                                alertDialog$Builder.g(jb6.M0(2131751709, null), null);
                                return heVar;
                            }

                            public static void j0(String str, d dVar) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                                String M0 = jb6.M0(R.string.AppName, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.a0("FloodWaitTime", null, 2131750618, G);
                                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                dVar.showDialog(heVar, true, null);
                            }

                            public static void k(Context context, ylb ylbVar, gk gkVar) {
                                int w0;
                                int w02;
                                int w03;
                                int w04;
                                int w05;
                                if (context == null) {
                                    return;
                                }
                                int i = cmb.i5;
                                if (ylbVar != null) {
                                    w0 = ylbVar.f(i);
                                    w02 = ylbVar.f(cmb.g5);
                                    ylbVar.f(cmb.zj);
                                    ylbVar.f(cmb.Dj);
                                    ylbVar.f(cmb.D8);
                                    ylbVar.f(cmb.F8);
                                    ylbVar.f(cmb.h6);
                                    w03 = ylbVar.f(cmb.Ii);
                                    w04 = ylbVar.f(cmb.Ei);
                                    w05 = ylbVar.f(cmb.Gi);
                                } else {
                                    w0 = cmb.w0(null, i, false);
                                    w02 = cmb.w0(null, cmb.g5, false);
                                    cmb.w0(null, cmb.zj, false);
                                    cmb.w0(null, cmb.Dj, false);
                                    cmb.w0(null, cmb.D8, false);
                                    cmb.w0(null, cmb.F8, false);
                                    cmb.w0(null, cmb.h6, false);
                                    w03 = cmb.w0(null, cmb.Ii, false);
                                    w04 = cmb.w0(null, cmb.Ei, false);
                                    w05 = cmb.w0(null, cmb.Gi, false);
                                }
                                int i2 = w04;
                                int i3 = w05;
                                int i4 = w02;
                                int i5 = w03;
                                k6d k6dVar = new k6d(context, ylbVar);
                                Object obj = k6dVar.b;
                                ((my0) obj).w0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                pj pjVar = new pj(context, ylbVar, iArr);
                                pjVar.setMinValue(0);
                                pjVar.setMaxValue(16);
                                pjVar.setTextColor(w0);
                                pjVar.setValue(0);
                                pjVar.setFormatter(new df(iArr, (byte) 1));
                                qj qjVar = new qj(context, pjVar, (byte) 0);
                                boolean z = true;
                                qjVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                qjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(jb6.M0(2131753842, null));
                                textView.setTextColor(w0);
                                ts2.s(textView, 1, 20.0f);
                                frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new p8((byte) 10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                qjVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                rj rjVar = new rj(context, z, z, false, (byte) 0);
                                linearLayout.addView(pjVar, qoe.l(1.0f, 0, nm7.s4));
                                rjVar.setPadding(0, 0, 0, 0);
                                rjVar.setGravity(17);
                                rjVar.setTextColor(i5);
                                rjVar.setTextSize(gm.L(14.0f));
                                rjVar.setTypeface(gm.o());
                                int L = gm.L(8.0f);
                                rjVar.setBackgroundDrawable(cmb.i0(L, L, L, L, i2, i3, i3));
                                qjVar.addView(rjVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                                rjVar.setText(jb6.M0(2131751371, null));
                                pjVar.setOnValueChangedListener(new l0(rjVar, (byte) 19));
                                rjVar.setOnClickListener(new ef((Object) iArr, (Object) pjVar, (Object) gkVar, (Object) k6dVar, (byte) 2));
                                my0 my0Var = (my0) obj;
                                my0Var.O = qjVar;
                                my0Var.show();
                                my0Var.s0(i4);
                                my0Var.K(i4);
                            }

                            public static void k0(Context context, ylb ylbVar, int i, TL_stars.StarGift starGift, long j, Runnable runnable) {
                                TLObject a2 = oc7.r1(i).a2(j);
                                LinearLayout i2 = hg9.i(context, 1);
                                i2.addView(new vra(context, starGift, a2), qoe.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                anb.X(textView, cmb.i5, ylbVar);
                                textView.setTextSize(1, 16.0f);
                                hg9.q(null, null, 2131749368, new Object[]{pg3.G(null, null, a2)}, textView);
                                i2.addView(textView, qoe.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                                alertDialog$Builder.n(i2);
                                alertDialog$Builder.j(jb6.M0(2131749369, null), new cf(runnable, (byte) 2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.o();
                            }

                            public static k6d l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, qac qacVar, Runnable runnable, boolean z, boolean z2, ylb ylbVar) {
                                if (context == null) {
                                    return null;
                                }
                                k6d k6dVar = new k6d(context, ylbVar);
                                Object obj = k6dVar.b;
                                byte b = 0;
                                ((my0) obj).w0 = false;
                                lp7 lp7Var = new lp7(context, ylbVar);
                                lp7Var.setTextOffset(gm.L(10.0f));
                                lp7Var.setItemCount(5);
                                lp7 lp7Var2 = new lp7(context, ylbVar);
                                lp7Var2.setItemCount(5);
                                lp7Var2.setTextOffset(-gm.L(10.0f));
                                lp7 lp7Var3 = new lp7(context, ylbVar);
                                lp7Var3.setItemCount(5);
                                lp7Var3.setTextOffset(-gm.L(24.0f));
                                hj hjVar = new hj(context, lp7Var, lp7Var2, lp7Var3);
                                hjVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                hjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
                                frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new p8((byte) 9));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                hjVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i2 = calendar.get(5);
                                int i3 = calendar.get(2);
                                int i4 = calendar.get(1);
                                int i5 = i4 + 1;
                                uh uhVar = new uh(lp7Var3, i5, lp7Var, lp7Var2, i4, i3, i2);
                                System.currentTimeMillis();
                                ij ijVar = new ij(context);
                                linearLayout.addView(lp7Var, qoe.l(0.25f, 0, nm7.s4));
                                lp7Var.setMinValue(1);
                                lp7Var.setMaxValue(31);
                                lp7Var.setWrapSelectorWheel(false);
                                lp7Var.setFormatter(new zg((byte) 11));
                                l0 l0Var = new l0(uhVar, (byte) 18);
                                lp7Var.setOnScrollListener(l0Var);
                                lp7Var2.setMinValue(0);
                                lp7Var2.setMaxValue(11);
                                lp7Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(lp7Var2, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var2.setFormatter(new zg((byte) 12));
                                lp7Var2.setOnScrollListener(l0Var);
                                lp7Var3.setMinValue(i);
                                lp7Var3.setMaxValue(i5);
                                lp7Var3.setWrapSelectorWheel(false);
                                lp7Var3.setFormatter(new pg(i5, (byte) 1));
                                linearLayout.addView(lp7Var3, qoe.l(0.25f, 0, nm7.s4));
                                lp7Var3.setOnScrollListener(l0Var);
                                if (tL_birthday != null) {
                                    lp7Var.setValue(tL_birthday.day);
                                    lp7Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        lp7Var3.setValue(tL_birthday.year);
                                    } else {
                                        lp7Var3.setValue(i5);
                                    }
                                } else {
                                    lp7Var.setValue(calendar.get(5));
                                    lp7Var2.setValue(calendar.get(2));
                                    lp7Var3.setValue(i5);
                                }
                                uhVar.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    l66 l66Var = new l66(context, null);
                                    l66Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                                    l66Var.setTextSize(1, 13.0f);
                                    anb.X(l66Var, cmb.p5, ylbVar);
                                    anb.G(l66Var, cmb.Wc, ylbVar);
                                    l66Var.setGravity(17);
                                    frameLayout2.addView(l66Var, qoe.e(-2, -2, 17));
                                    hjVar.addView(frameLayout2, qoe.o(-1, -2));
                                    int i6 = z8c.t0;
                                    eh ehVar = new eh(i6, (Object) l66Var, (byte) 1);
                                    ehVar.run();
                                    nm7.f(i6).h(frameLayout2, nm7.k0, new mf2(ehVar, (byte) 3));
                                    bw2.r(i6).D(false);
                                }
                                if (z) {
                                    b61 b61Var = new b61(ylbVar, context, false);
                                    b61Var.i(jb6.M0(2131751607, null), false, true);
                                    b61Var.setOnClickListener(new wh(lp7Var3, i5, uhVar, b));
                                    hjVar.addView(b61Var, qoe.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                ijVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                ijVar.setGravity(17);
                                anb.X(ijVar, cmb.Ii, ylbVar);
                                ijVar.setTextSize(1, 14.0f);
                                ijVar.setTypeface(gm.o());
                                ijVar.setText(str2);
                                int L = gm.L(24.0f);
                                int i7 = cmb.Ei;
                                int v0 = cmb.v0(i7, ylbVar);
                                int i8 = cmb.Gi;
                                int v02 = cmb.v0(i8, ylbVar);
                                fg0 i0 = cmb.i0(L, L, L, L, v0, v02, v02);
                                wmb M = anb.M(i7);
                                wmb M2 = anb.M(i8);
                                ijVar.setBackground(i0);
                                anb.j(ijVar, i0, M, M2, ylbVar);
                                rve.b(ijVar, 0.02f, 1.2f);
                                byte b2 = 15;
                                hjVar.addView(ijVar, qoe.t(-1, 48, 83, 16, z ? 0 : 15, 16, z2 ? 0 : 16));
                                ijVar.setOnClickListener(new xh(lp7Var, lp7Var2, lp7Var3, i5, k6dVar, qacVar));
                                if (z2) {
                                    b61 b61Var2 = new b61(ylbVar, context, false);
                                    b61Var2.i(jb6.M0(2131753680, null), false, true);
                                    b61Var2.f();
                                    b61Var2.setOnClickListener(new t(k6dVar, qacVar, b2));
                                    hjVar.addView(b61Var2, qoe.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((my0) obj).O = hjVar;
                                return k6dVar;
                            }

                            public static void l0(Context context, ylb ylbVar, String str, boolean z, final jac jacVar) {
                                if (gm.C1(context)) {
                                    final byte b = 1;
                                    final he[] heVarArr = new he[1];
                                    final byte b2 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                                    String M0 = jb6.M0(2131747512, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i = cmb.i5;
                                    anb.X(textView, i, ylbVar);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(gm.L(14.0f), gm.L(12.0f), gm.L(14.0f), gm.L(12.0f));
                                    ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i, ylbVar)));
                                    wmb K = anb.K(0.06f, i);
                                    textView.setBackground(b0);
                                    anb.j(textView, b0, K, null, ylbVar);
                                    final oh2 oh2Var = new oh2(1, ylbVar, context);
                                    oh2Var.setMultiline(true);
                                    oh2Var.getTextView().getLayoutParams().width = -1;
                                    oh2Var.getTextView().setSingleLine(false);
                                    oh2Var.getTextView().setMaxLines(3);
                                    oh2Var.getTextView().setTextSize(1, 16.0f);
                                    oh2Var.e(jb6.M0(z ? 2131752830 : 2131752829, null), "", false, false, false);
                                    oh2Var.setOnClickListener(new kf(oh2Var, b2));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, qoe.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(oh2Var, qoe.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.n(linearLayout);
                                    heVar.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
                                    alertDialog$Builder.j(jb6.M0(2131747550, null), new ee() { // from class: lf
                                        @Override // ee
                                        public final void r(he heVar2, int i2) {
                                            byte b3 = b2;
                                            he[] heVarArr2 = heVarArr;
                                            oh2 oh2Var2 = oh2Var;
                                            jac jacVar2 = jacVar;
                                            switch (b3) {
                                                case 0:
                                                    jacVar2.a(Boolean.TRUE, Boolean.valueOf(oh2Var2.b()));
                                                    he heVar3 = heVarArr2[0];
                                                    if (heVar3 != null) {
                                                        heVar3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    jacVar2.a(Boolean.FALSE, Boolean.valueOf(oh2Var2.b()));
                                                    he heVar4 = heVarArr2[0];
                                                    if (heVar4 != null) {
                                                        heVar4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), new ee() { // from class: lf
                                        @Override // ee
                                        public final void r(he heVar2, int i2) {
                                            byte b3 = b;
                                            he[] heVarArr2 = heVarArr;
                                            oh2 oh2Var2 = oh2Var;
                                            jac jacVar2 = jacVar;
                                            switch (b3) {
                                                case 0:
                                                    jacVar2.a(Boolean.TRUE, Boolean.valueOf(oh2Var2.b()));
                                                    he heVar3 = heVarArr2[0];
                                                    if (heVar3 != null) {
                                                        heVar3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    jacVar2.a(Boolean.FALSE, Boolean.valueOf(oh2Var2.b()));
                                                    he heVar4 = heVarArr2[0];
                                                    if (heVar4 != null) {
                                                        heVar4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    heVarArr[0] = alertDialog$Builder.o();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
                            /* JADX WARN: Removed duplicated region for block: B:26:0x015a  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x0160  */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x0182  */
                            /* JADX WARN: Removed duplicated region for block: B:38:0x0188  */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x01a1  */
                            /* JADX WARN: Removed duplicated region for block: B:44:0x01cd  */
                            /* JADX WARN: Removed duplicated region for block: B:47:0x020c  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x0219  */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x0256  */
                            /* JADX WARN: Removed duplicated region for block: B:57:0x0265  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x021f  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x0211  */
                            /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
                            /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
                            /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
                            /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
                            /* JADX WARN: Type inference failed for: r8v7 */
                            /* JADX WARN: Type inference failed for: r8v8, types: [ee, java.lang.String, ylb] */
                            /* JADX WARN: Type inference failed for: r8v9 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void m(d dVar, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                oh2[] oh2VarArr;
                                oh2 oh2Var;
                                ?? r8;
                                if (dVar == null) {
                                    return;
                                }
                                Context context = dVar.getContext();
                                oh2[] oh2VarArr2 = new oh2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                ck ckVar = new ck(context, null);
                                nm7.i(ckVar);
                                anb.X(ckVar, cmb.i5, null);
                                anb.G(ckVar, cmb.Wc, null);
                                ckVar.setTextSize(1, 16.0f);
                                ckVar.setGravity((jb6.a0 ? 5 : 3) | 48);
                                dk dkVar = new dk(context, oh2VarArr2);
                                he heVar = alertDialog$Builder.a;
                                heVar.H = (byte) 6;
                                alertDialog$Builder.n(dkVar);
                                pc0 pc0Var = new pc0((ylb) null);
                                pc0Var.s(gm.L(18.0f));
                                bf0 bf0Var = new bf0(context);
                                bf0Var.setRoundRadius(gm.L(20.0f));
                                dkVar.addView(bf0Var, qoe.d(40, 40.0f, (jb6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                lka lkaVar = new lka(context);
                                anb.W(lkaVar, cmb.D8, null);
                                lkaVar.setTextSize(20);
                                lkaVar.setTypeface(gm.o());
                                lkaVar.setGravity((jb6.a0 ? 5 : 3) | 16);
                                lkaVar.setEllipsizeByGradient(true);
                                lkaVar.l(user.first_name, false);
                                if (user.scam) {
                                    lkaVar.i(cmb.f1);
                                } else if (user.fake) {
                                    lkaVar.i(cmb.g1);
                                } else if (user.verified) {
                                    Drawable d = b10.d(context, R.drawable.verified_area);
                                    int i = cmb.y9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    anb.x(lkaVar, d, i, null, mode);
                                    Drawable d2 = b10.d(context, R.drawable.verified_check);
                                    oh2VarArr = oh2VarArr2;
                                    anb.x(lkaVar, d2, cmb.z9, null, mode);
                                    lkaVar.i(new sn2(d, d2));
                                    TextView textView = new TextView(context);
                                    anb.X(textView, cmb.l5, null);
                                    byte b = 1;
                                    wi8.w(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!jb6.a0 ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new mf(user, dVar, alertDialog$Builder, b));
                                    SpannableString valueOf = SpannableString.valueOf(jb6.M0(2131748092, null).concat("  "));
                                    pn2 pn2Var = new pn2(R.drawable.attach_arrow_right, 0);
                                    pn2Var.n = 1;
                                    pn2Var.c(gm.L(10.0f));
                                    valueOf.setSpan(pn2Var, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z = jb6.a0;
                                    dkVar.addView(lkaVar, qoe.d(-1, -2.0f, (!z ? 5 : 3) | 48, !z ? 21 : 76, 0.0f, !z ? 76 : 21, 0.0f));
                                    boolean z2 = jb6.a0;
                                    dkVar.addView(textView, qoe.d(-1, -2.0f, (!z2 ? 5 : 3) | 48, !z2 ? 21 : 76, 24.0f, z2 ? 76 : 21, 0.0f));
                                    dkVar.addView(ckVar, qoe.d(-2, -2.0f, (!jb6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    oh2Var = new oh2(1, dVar.getResourceProvider(), context);
                                    oh2VarArr[0] = oh2Var;
                                    if (!oh2Var.I) {
                                        sf1 sf1Var = oh2Var.c;
                                        sf1Var.setLines(3);
                                        sf1Var.setMaxLines(3);
                                        sf1Var.setSingleLine(false);
                                    }
                                    oh2VarArr[0].setBackgroundDrawable(cmb.L0(false));
                                    oh2VarArr[0].e(gm.S2(jb6.a0(null, null, 2131747513, m9c.r(user))), "", true, false, false);
                                    oh2VarArr[0].setPadding(!jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, !jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                                    oh2VarArr[0].c(true, false);
                                    dkVar.addView(oh2VarArr[0], qoe.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    oh2VarArr[0].setOnClickListener(new j1(atomicBoolean, (byte) 9));
                                    if (m9c.B(user)) {
                                        r8 = 0;
                                        pc0Var.p = 1.0f;
                                        dVar.getCurrentAccount();
                                        pc0Var.q(user);
                                        bf0Var.f(user, pc0Var);
                                    } else {
                                        pc0Var.p = 0.8f;
                                        pc0Var.f(12);
                                        r8 = 0;
                                        bf0Var.m(null, null, pc0Var, user);
                                    }
                                    alertDialog$Builder.j(jb6.M0(2131744604, r8), new cf(runnable, (byte) 3));
                                    alertDialog$Builder.g(jb6.M0(2131752542, r8), r8);
                                    dVar.showDialog(heVar);
                                    ckVar.setText(gm.N2(jb6.M0(2131752849, r8), -1, 0, new of(heVar, context, (byte) 1), r8));
                                }
                                oh2VarArr = oh2VarArr2;
                                TextView textView2 = new TextView(context);
                                anb.X(textView2, cmb.l5, null);
                                byte b2 = 1;
                                wi8.w(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!jb6.a0 ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new mf(user, dVar, alertDialog$Builder, b2));
                                SpannableString valueOf2 = SpannableString.valueOf(jb6.M0(2131748092, null).concat("  "));
                                pn2 pn2Var2 = new pn2(R.drawable.attach_arrow_right, 0);
                                pn2Var2.n = 1;
                                pn2Var2.c(gm.L(10.0f));
                                valueOf2.setSpan(pn2Var2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z3 = jb6.a0;
                                dkVar.addView(lkaVar, qoe.d(-1, -2.0f, (!z3 ? 5 : 3) | 48, !z3 ? 21 : 76, 0.0f, !z3 ? 76 : 21, 0.0f));
                                boolean z22 = jb6.a0;
                                dkVar.addView(textView2, qoe.d(-1, -2.0f, (!z22 ? 5 : 3) | 48, !z22 ? 21 : 76, 24.0f, z22 ? 76 : 21, 0.0f));
                                dkVar.addView(ckVar, qoe.d(-2, -2.0f, (!jb6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                oh2Var = new oh2(1, dVar.getResourceProvider(), context);
                                oh2VarArr[0] = oh2Var;
                                if (!oh2Var.I) {
                                }
                                oh2VarArr[0].setBackgroundDrawable(cmb.L0(false));
                                oh2VarArr[0].e(gm.S2(jb6.a0(null, null, 2131747513, m9c.r(user))), "", true, false, false);
                                oh2VarArr[0].setPadding(!jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, !jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                                oh2VarArr[0].c(true, false);
                                dkVar.addView(oh2VarArr[0], qoe.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                oh2VarArr[0].setOnClickListener(new j1(atomicBoolean, (byte) 9));
                                if (m9c.B(user)) {
                                }
                                alertDialog$Builder.j(jb6.M0(2131744604, r8), new cf(runnable, (byte) 3));
                                alertDialog$Builder.g(jb6.M0(2131752542, r8), r8);
                                dVar.showDialog(heVar);
                                ckVar.setText(gm.N2(jb6.M0(2131752849, r8), -1, 0, new of(heVar, context, (byte) 1), r8));
                            }

                            public static void m0(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, k11 k11Var, TLRPC.WebPage webPage, ylb ylbVar) {
                                if (gm.C1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (l11.h(str) || !z3 || "mailto".equalsIgnoreCase(scheme)) {
                                        l11.t(context, Uri.parse(str), j == 0, z2, z4 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), k11Var, null, false, true, false, false);
                                        return;
                                    }
                                    String d = l11.d(str, z);
                                    qf2 qf2Var = new qf2(context, str, j, z2, k11Var);
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                                    String M0 = jb6.M0(2131747512, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(d);
                                    textView.setTextSize(1, 14.0f);
                                    int i = cmb.i5;
                                    anb.X(textView, i, ylbVar);
                                    byte b = 17;
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(gm.L(14.0f), gm.L(12.0f), gm.L(14.0f), gm.L(12.0f));
                                    ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i, ylbVar)));
                                    wmb K = anb.K(0.06f, i);
                                    textView.setBackground(b0);
                                    anb.j(textView, b0, K, null, ylbVar);
                                    LinearLayout i2 = hg9.i(context, 1);
                                    i2.addView(textView, qoe.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i3 = kvc.f;
                                    if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                        kvc kvcVar = new kvc(context, ylbVar);
                                        kvcVar.setWebPage(webPage);
                                        i2.addView(kvcVar, qoe.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder.n(i2);
                                    heVar.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
                                    alertDialog$Builder.j(jb6.M0(2131747550, null), new l0(qf2Var, b));
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder.o();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [ee, java.lang.String, ylb] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(d dVar, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r5;
                                Context context = dVar.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                yj yjVar = new yj(context, null);
                                nm7.i(yjVar);
                                anb.X(yjVar, cmb.i5, null);
                                anb.G(yjVar, cmb.Wc, null);
                                yjVar.setTextSize(1, 16.0f);
                                yjVar.setGravity((jb6.a0 ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                he heVar = alertDialog$Builder.a;
                                heVar.H = (byte) 6;
                                alertDialog$Builder.n(frameLayout);
                                pc0 pc0Var = new pc0((ylb) null);
                                pc0Var.s(gm.L(18.0f));
                                bf0 bf0Var = new bf0(context);
                                bf0Var.setRoundRadius(gm.L(20.0f));
                                frameLayout.addView(bf0Var, qoe.d(40, 40.0f, (jb6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                lka lkaVar = new lka(context);
                                anb.W(lkaVar, cmb.D8, null);
                                lkaVar.setTextSize(20);
                                lkaVar.setTypeface(gm.o());
                                lkaVar.setGravity((jb6.a0 ? 5 : 3) | 16);
                                lkaVar.setEllipsizeByGradient(true);
                                lkaVar.l(user.first_name, false);
                                if (user.scam) {
                                    lkaVar.i(cmb.f1);
                                } else if (user.fake) {
                                    lkaVar.i(cmb.g1);
                                } else if (user.verified) {
                                    Drawable d = b10.d(context, R.drawable.verified_area);
                                    int i = cmb.y9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    anb.x(lkaVar, d, i, null, mode);
                                    Drawable d2 = b10.d(context, R.drawable.verified_check);
                                    anb.x(lkaVar, d2, cmb.z9, null, mode);
                                    lkaVar.i(new sn2(d, d2));
                                }
                                TextView textView = new TextView(context);
                                anb.X(textView, cmb.l5, null);
                                wi8.w(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new mf(user, dVar, alertDialog$Builder, (byte) 0));
                                SpannableString valueOf = SpannableString.valueOf(jb6.M0(2131748092, null).concat("  "));
                                pn2 pn2Var = new pn2(R.drawable.attach_arrow_right, 0);
                                pn2Var.n = 1;
                                pn2Var.c(gm.L(10.0f));
                                valueOf.setSpan(pn2Var, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z = jb6.a0;
                                frameLayout.addView(lkaVar, qoe.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 76, 0.0f, z ? 76 : 21, 0.0f));
                                boolean z2 = jb6.a0;
                                frameLayout.addView(textView, qoe.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 24.0f, z2 ? 76 : 21, 0.0f));
                                frameLayout.addView(yjVar, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (m9c.B(user)) {
                                    pc0Var.p = 0.8f;
                                    pc0Var.f(12);
                                    r5 = 0;
                                    bf0Var.m(null, null, pc0Var, user);
                                } else {
                                    r5 = 0;
                                    pc0Var.p = 1.0f;
                                    dVar.getCurrentAccount();
                                    pc0Var.q(user);
                                    bf0Var.f(user, pc0Var);
                                }
                                alertDialog$Builder.j(jb6.M0(2131744604, r5), new cf(runnable, (byte) 1));
                                alertDialog$Builder.g(jb6.M0(2131752542, r5), r5);
                                byte b = 0;
                                dVar.showDialog(heVar, false, new nf(runnable2, b));
                                yjVar.setText(gm.N2(jb6.M0(2131752849, r5), -1, 0, new of(heVar, context, b), r5));
                            }

                            public static void n0(d dVar, String str, boolean z, boolean z2) {
                                o0(dVar, str, z, true, z2, false, null, null, null);
                            }

                            public static k6d o(Activity activity, we7 we7Var, ylb ylbVar) {
                                if (activity == null) {
                                    return null;
                                }
                                k6d k6dVar = new k6d(activity, ylbVar);
                                Object obj = k6dVar.b;
                                ((my0) obj).w0 = false;
                                lp7 lp7Var = new lp7(activity, ylbVar);
                                lp7Var.setTextOffset(gm.L(10.0f));
                                lp7Var.setItemCount(5);
                                lp7 lp7Var2 = new lp7(activity, ylbVar);
                                lp7Var2.setItemCount(5);
                                lp7Var2.setTextOffset(-gm.L(10.0f));
                                lp7 lp7Var3 = new lp7(activity, ylbVar);
                                lp7Var3.setItemCount(5);
                                lp7Var3.setTextOffset(-gm.L(24.0f));
                                zi ziVar = new zi(activity, lp7Var, lp7Var2, lp7Var3, (byte) 6);
                                ziVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                ziVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(jb6.M0(2131752069, null));
                                td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
                                frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new p8((byte) 11));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                wb wbVar = new wb(activity, (byte) 7);
                                linearLayout.addView(lp7Var, qoe.l(0.25f, 0, nm7.s4));
                                lp7Var.setMinValue(1);
                                lp7Var.setMaxValue(31);
                                lp7Var.setWrapSelectorWheel(false);
                                lp7Var.setFormatter(new zg((byte) 13));
                                ng ngVar = new ng(lp7Var, lp7Var2, lp7Var3, (byte) 2);
                                lp7Var.setOnValueChangedListener(ngVar);
                                lp7Var2.setMinValue(0);
                                lp7Var2.setMaxValue(11);
                                lp7Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(lp7Var2, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var2.setFormatter(new zg((byte) 14));
                                lp7Var2.setOnValueChangedListener(ngVar);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i2 = calendar.get(1);
                                lp7Var3.setMinValue(i);
                                lp7Var3.setMaxValue(i2);
                                lp7Var3.setWrapSelectorWheel(false);
                                lp7Var3.setFormatter(new zg((byte) 15));
                                linearLayout.addView(lp7Var3, qoe.l(0.25f, 0, nm7.s4));
                                lp7Var3.setOnValueChangedListener(ngVar);
                                lp7Var.setValue(31);
                                lp7Var2.setValue(12);
                                lp7Var3.setValue(i2);
                                b(lp7Var, lp7Var2, lp7Var3);
                                wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                wbVar.setGravity(17);
                                anb.X(wbVar, cmb.Ii, ylbVar);
                                wbVar.setTextSize(1, 14.0f);
                                wbVar.setTypeface(gm.o());
                                wbVar.setText(jb6.M0(2131748822, null));
                                int L = gm.L(8.0f);
                                int i3 = cmb.Ei;
                                int v0 = cmb.v0(i3, ylbVar);
                                int i4 = cmb.Gi;
                                int v02 = cmb.v0(i4, ylbVar);
                                fg0 i0 = cmb.i0(L, L, L, L, v0, v02, v02);
                                wmb M = anb.M(i3);
                                wmb M2 = anb.M(i4);
                                wbVar.setBackground(i0);
                                anb.j(wbVar, i0, M, M2, ylbVar);
                                ziVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                                wbVar.setOnClickListener(new gg(lp7Var, lp7Var2, lp7Var3, calendar, we7Var, k6dVar, (byte) 2));
                                ((my0) obj).O = ziVar;
                                return k6dVar;
                            }

                            public static void o0(d dVar, String str, boolean z, boolean z2, boolean z3, boolean z4, k11 k11Var, TLRPC.WebPage webPage, ylb ylbVar) {
                                if (dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                m0(dVar.getParentActivity(), str, z, z2, z3, z4, dVar instanceof yv1 ? ((yv1) dVar).x8 : 0L, k11Var, webPage, ylbVar);
                            }

                            public static void p(d dVar, TLRPC.User user, boolean z) {
                                String M0;
                                String a0;
                                if (dVar.getParentActivity() == null || user == null || m9c.z(user) || z8c.h(dVar.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                dVar.getCurrentAccount();
                                Activity parentActivity = dVar.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                byte b = 0;
                                if (z) {
                                    M0 = jb6.M0(2131743296, null);
                                    a0 = jb6.a0("VideoCallAlert", null, 2131743297, m9c.r(user));
                                } else {
                                    M0 = jb6.M0(2131752584, null);
                                    a0 = jb6.a0("CallAlert", null, 2131752585, m9c.r(user));
                                }
                                ui uiVar = new ui(parentActivity);
                                nm7.i(uiVar);
                                anb.X(uiVar, cmb.i5, null);
                                uiVar.setTextSize(1, 16.0f);
                                uiVar.setGravity((jb6.a0 ? 5 : 3) | 48);
                                uiVar.setText(gm.S2(a0));
                                pc0 pc0Var = new pc0((ylb) null);
                                pc0Var.s(gm.L(12.0f));
                                pc0Var.p = 1.0f;
                                dVar.getCurrentAccount();
                                pc0Var.q(user);
                                bf0 bf0Var = new bf0(parentActivity);
                                bf0Var.setRoundRadius(gm.L(20.0f));
                                bf0Var.f(user, pc0Var);
                                frameLayout.addView(bf0Var, qoe.d(40, 40.0f, (jb6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                td4.x(textView, cmb.D8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(M0);
                                boolean z2 = jb6.a0;
                                frameLayout.addView(textView, qoe.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
                                frameLayout.addView(uiVar, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.j(jb6.M0(2131752587, null), new ci(dVar, user, z, b));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                dVar.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(Activity activity, int i, Runnable runnable, boolean z, ylb ylbVar) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i2 = oc7.r1(i).g3;
                                if ((i2 & 1) != 0) {
                                    b10.r(null, 2131748443, arrayList, 0, arrayList2);
                                }
                                if ((i2 & 2) != 0) {
                                    b10.r(null, 2131748445, arrayList, 1, arrayList2);
                                }
                                byte b = 4;
                                if ((i2 & 4) != 0) {
                                    b10.r(null, 2131748441, arrayList, 3, arrayList2);
                                }
                                arrayList.add(jb6.M0(2131748444, null));
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
                                alertDialog$Builder.a.S = jb6.M0(2131748442, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.n(linearLayout);
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    x09 x09Var = new x09(activity, ylbVar);
                                    x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                                    x09Var.setTag(Integer.valueOf(i3));
                                    a(x09Var, cmb.f7, cmb.D5, null);
                                    x09Var.b((CharSequence) arrayList.get(i3), gda.l0 == ((Integer) arrayList2.get(i3)).intValue());
                                    int i4 = cmb.h6;
                                    fg0 f0 = cmb.f0(cmb.w0(null, i4, false), 2, -1);
                                    wmb M = anb.M(i4);
                                    x09Var.setBackground(f0);
                                    anb.j(x09Var, f0, null, M, null);
                                    linearLayout.addView(x09Var);
                                    x09Var.setOnClickListener(new b0(arrayList2, runnable, alertDialog$Builder, b));
                                }
                                if (!z) {
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                }
                                he o = alertDialog$Builder.o();
                                if (z) {
                                    o.setCanceledOnTouchOutside(false);
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x0180, code lost:
                            
                                if (sd2.p0(r35) == false) goto L60;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x0198, code lost:
                            
                                r8 = new oh2(1, r38, r6);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(cmb.L0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01a8, code lost:
                            
                                if (r35 == null) goto L63;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01aa, code lost:
                            
                                r11[0].e(jb6.M0(2131751461, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01dd, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e3, code lost:
                            
                                if (jb6.a0 == false) goto L67;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e5, code lost:
                            
                                r4 = gm.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01f0, code lost:
                            
                                if (jb6.a0 == false) goto L72;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01f2, code lost:
                            
                                r5 = gm.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01fd, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], qoe.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new gf(r1, 2));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01f8, code lost:
                            
                                r5 = gm.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01ea, code lost:
                            
                                r4 = gm.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01bf, code lost:
                            
                                r11[0].e(jb6.a0("DeleteMessagesOptionAlso", null, 2131751462, m9c.k(r34, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
                            
                                if (sd2.p0(r35) == false) goto L60;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(d dVar, int i, TLRPC.User user, TLRPC.Chat chat, boolean z, ue7 ue7Var, ylb ylbVar) {
                                boolean z2;
                                if (dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = dVar.getCurrentAccount();
                                Activity parentActivity = dVar.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, parentActivity);
                                long e = z8c.h(currentAccount).e();
                                oh2[] oh2VarArr = new oh2[1];
                                si siVar = new si(parentActivity);
                                nm7.i(siVar);
                                anb.X(siVar, cmb.i5, null);
                                siVar.setTextSize(1, 16.0f);
                                siVar.setGravity((jb6.a0 ? 5 : 3) | 48);
                                ti tiVar = new ti(parentActivity, oh2VarArr);
                                alertDialog$Builder.n(tiVar);
                                TextView textView = new TextView(parentActivity);
                                td4.x(textView, cmb.D8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                tiVar.addView(textView, qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                tiVar.addView(siVar, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i == -1) {
                                    textView.setText(jb6.a0("ClearHistory", null, 2131752026, new Object[0]));
                                    if (user != null) {
                                        siVar.setText(gm.S2(jb6.a0("AreYouSureClearHistoryWithUser", null, 2131754072, m9c.r(user))));
                                    } else if (z) {
                                        if (sd2.V(chat)) {
                                            siVar.setText(gm.S2(jb6.a0("AreYouSureClearHistoryWithChannel", null, 2131754075, chat.title)));
                                            z2 = false;
                                        } else {
                                            siVar.setText(gm.S2(jb6.a0("AreYouSureClearHistoryWithChat", null, 2131754074, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        siVar.setText(jb6.M0(2131754077, null));
                                    } else {
                                        siVar.setText(jb6.M0(2131754079, null));
                                    }
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    textView.setText(jb6.G(i, "DeleteDays", new Object[0]));
                                    siVar.setText(jb6.M0(2131751472, null));
                                }
                                boolean[] zArr = new boolean[1];
                                zArr[z2 ? 1 : 0] = z2;
                                if (chat != null && z && sd2.t0(chat)) {
                                    zArr[z2 ? 1 : 0] = true;
                                }
                                if (user != null) {
                                    long j = user.id;
                                    if (j != e) {
                                        if (j != 489000) {
                                        }
                                    }
                                }
                                if (chat != null) {
                                    if (z) {
                                        if (!sd2.t0(chat)) {
                                            if (!sd2.V(chat)) {
                                            }
                                        }
                                    }
                                }
                                CharSequence M0 = jb6.M0(2131751535, null);
                                if (chat != null && z && sd2.t0(chat) && !sd2.V(chat)) {
                                    M0 = jb6.M0(2131752028, null);
                                }
                                alertDialog$Builder.j(M0, new o(ue7Var, zArr, (byte) 10));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                he heVar = alertDialog$Builder.a;
                                dVar.showDialog(heVar);
                                TextView textView2 = (TextView) heVar.c(-1);
                                if (textView2 != null) {
                                    anb.X(textView2, cmb.p7, null);
                                }
                            }

                            public static void q0(int i, ylb ylbVar, d dVar) {
                                if (i == 0 || dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, dVar.getParentActivity());
                                String M0 = jb6.M0(2131743603, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                if (i == 1) {
                                    heVar.U = jb6.M0(2131751024, null);
                                } else if (i == 2) {
                                    heVar.U = jb6.M0(2131751036, null);
                                } else if (i == 3) {
                                    heVar.U = jb6.M0(2131751030, null);
                                } else if (i == 4) {
                                    heVar.U = jb6.M0(2131751023, null);
                                } else if (i == 5) {
                                    heVar.U = jb6.M0(2131751035, null);
                                } else if (i == 6) {
                                    heVar.U = jb6.M0(2131751029, null);
                                } else if (i == 7) {
                                    heVar.U = jb6.M0(2131751027, null);
                                } else if (i == 8) {
                                    heVar.U = jb6.M0(2131751028, null);
                                } else if (i == 9) {
                                    heVar.U = jb6.M0(2131751019, null);
                                } else if (i == 10) {
                                    heVar.U = jb6.M0(2131751031, null);
                                } else if (i == 11) {
                                    heVar.U = jb6.M0(2131751020, null);
                                } else if (i == 12) {
                                    heVar.U = jb6.M0(2131751032, null);
                                } else if (i == 13) {
                                    heVar.U = jb6.M0(2131751017, null);
                                } else if (i == 14) {
                                    heVar.U = jb6.M0(2131751018, null);
                                } else if (i == 15) {
                                    heVar.U = jb6.M0(2131751025, null);
                                } else if (i == 16) {
                                    heVar.U = jb6.M0(2131751026, null);
                                } else if (i == 17) {
                                    heVar.U = jb6.M0(2131751037, null);
                                } else if (i == 18) {
                                    heVar.U = jb6.M0(2131751038, null);
                                } else if (i == 19) {
                                    heVar.U = jb6.M0(2131751033, null);
                                } else if (i == 20) {
                                    heVar.U = jb6.M0(2131751034, null);
                                } else if (i == 21) {
                                    heVar.U = jb6.M0(2131751021, null);
                                } else if (i == 22) {
                                    heVar.U = jb6.M0(2131751022, null);
                                }
                                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                dVar.showDialog(heVar, true, null);
                            }

                            public static void r(d dVar, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, ue7 ue7Var) {
                                s(dVar, z, false, chat, user, z2, z3, z4, z5, ue7Var, dVar != null ? dVar.getResourceProvider() : null);
                            }

                            public static he r0(d dVar, String str, String str2, ylb ylbVar) {
                                if (dVar == null) {
                                    dVar = LaunchActivity.S();
                                }
                                if (str2 == null || dVar == null || dVar.getParentActivity() == null) {
                                    return null;
                                }
                                he heVar = L(dVar.getParentActivity(), str, str2, null, null, ylbVar).a;
                                dVar.showDialog(heVar);
                                return heVar;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:101:0x069e  */
                            /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:104:0x0609  */
                            /* JADX WARN: Removed duplicated region for block: B:133:0x0486  */
                            /* JADX WARN: Removed duplicated region for block: B:184:0x042a  */
                            /* JADX WARN: Removed duplicated region for block: B:205:0x030e  */
                            /* JADX WARN: Removed duplicated region for block: B:213:0x038f  */
                            /* JADX WARN: Removed duplicated region for block: B:216:0x03a0  */
                            /* JADX WARN: Removed duplicated region for block: B:220:0x03e2  */
                            /* JADX WARN: Removed duplicated region for block: B:222:0x03a9  */
                            /* JADX WARN: Removed duplicated region for block: B:223:0x0394  */
                            /* JADX WARN: Removed duplicated region for block: B:225:0x0345  */
                            /* JADX WARN: Removed duplicated region for block: B:236:0x03ef  */
                            /* JADX WARN: Removed duplicated region for block: B:90:0x03f4  */
                            /* JADX WARN: Removed duplicated region for block: B:94:0x0441  */
                            /* JADX WARN: Removed duplicated region for block: B:98:0x0601  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void s(final d dVar, final boolean z, final boolean z2, final TLRPC.Chat chat, final TLRPC.User user, final boolean z3, final boolean z4, boolean z5, final boolean z6, final ue7 ue7Var, final ylb ylbVar) {
                                long j;
                                boolean z7;
                                pc0 pc0Var;
                                TLRPC.Chat chat2;
                                oh2[] oh2VarArr;
                                oi oiVar;
                                ArrayList arrayList;
                                he heVar;
                                pc0 pc0Var2;
                                float f;
                                float f2;
                                boolean z8;
                                pc0 pc0Var3;
                                boolean z9;
                                boolean z10;
                                String str;
                                CharSequence M0;
                                TextView textView;
                                if (dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                if (chat == null && user == null) {
                                    return;
                                }
                                final int currentAccount = dVar.getCurrentAccount();
                                final Activity parentActivity = dVar.getParentActivity();
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, parentActivity);
                                long e = z8c.h(currentAccount).e();
                                oh2[] oh2VarArr2 = new oh2[1];
                                oi oiVar2 = new oi(parentActivity);
                                nm7.i(oiVar2);
                                anb.X(oiVar2, cmb.i5, null);
                                oiVar2.setTextSize(1, 16.0f);
                                oiVar2.setGravity((jb6.a0 ? 5 : 3) | 48);
                                if (!z6 && sd2.T(chat) && sd2.t0(chat)) {
                                    j = e;
                                    z7 = true;
                                } else {
                                    j = e;
                                    z7 = false;
                                }
                                pi piVar = new pi(parentActivity, oh2VarArr2);
                                he heVar2 = alertDialog$Builder.a;
                                heVar2.H = (byte) 6;
                                alertDialog$Builder.n(piVar);
                                pc0 pc0Var4 = new pc0((ylb) null);
                                pc0Var4.s(gm.L(18.0f));
                                bf0 bf0Var = new bf0(parentActivity);
                                bf0Var.setRoundRadius(gm.L(15.0f));
                                piVar.addView(bf0Var, qoe.d(30, 30.0f, (jb6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                io ioVar = new io(parentActivity, false, false, false);
                                anb.U(ioVar, cmb.D8, null);
                                ioVar.setTextSize(gm.L(20.0f));
                                ioVar.setTypeface(gm.o());
                                ioVar.setGravity((jb6.a0 ? 5 : 3) | 16);
                                ioVar.setEllipsizeByGradient(true);
                                final boolean z11 = z7;
                                if (z) {
                                    if (z7) {
                                        ioVar.setText(jb6.M0(2131752025, null));
                                    } else {
                                        ioVar.setText(jb6.M0(2131752026, null));
                                    }
                                } else if (chat == null) {
                                    ioVar.setText(jb6.M0(2131751490, null));
                                } else if (sd2.Y(chat)) {
                                    ioVar.setText(jb6.M0(2131751871, null));
                                } else if (!sd2.T(chat)) {
                                    ioVar.setText(jb6.M0(2131748748, null));
                                } else if (chat.monoforum) {
                                    ioVar.setText(jb6.M0(2131748752, null));
                                } else if (chat.megagroup) {
                                    ioVar.setText(jb6.M0(2131748748, null));
                                } else {
                                    ioVar.setText(jb6.M0(2131748761, null));
                                }
                                boolean z12 = jb6.a0;
                                piVar.addView(ioVar, qoe.d(-1, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 22 : 65, 7.66f, z12 ? 65 : 22, 0.0f));
                                piVar.addView(oiVar2, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (sd2.p0(chat)) {
                                    pc0Var = pc0Var4;
                                    chat2 = dVar.getMessagesController().t1(chat.id);
                                } else {
                                    pc0Var = pc0Var4;
                                    chat2 = null;
                                }
                                boolean z13 = !z3 && user != null && (user != null && !user.bot && (user.id > j ? 1 : (user.id == j ? 0 : -1)) != 0 && oc7.r1(currentAccount).V2) && (user != null ? oc7.r1(currentAccount).U2 : oc7.r1(currentAccount).T2) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    oh2VarArr = oh2VarArr2;
                                    oiVar = oiVar2;
                                    arrayList = (ArrayList) oc7.r1(currentAccount).S.f(user.id);
                                } else {
                                    oh2VarArr = oh2VarArr2;
                                    oiVar = oiVar2;
                                    arrayList = null;
                                }
                                boolean z14 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((k47) arrayList.get(0)).k == null || (!(((k47) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((k47) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f = 10.0f;
                                    if (user.bot) {
                                        pc0Var2 = pc0Var;
                                        f2 = 8.0f;
                                        if (user.id != 489000) {
                                            oh2 oh2Var = new oh2(1, ylbVar, parentActivity);
                                            oh2VarArr[0] = oh2Var;
                                            oh2Var.setBackground(cmb.L0(false));
                                            oh2VarArr[0].e(jb6.M0(2131753659, null), "", false, false, false);
                                            heVar = heVar2;
                                            oh2VarArr[0].setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), gm.L(10.0f), jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), gm.L(10.0f));
                                            oh2 oh2Var2 = oh2VarArr[0];
                                            zArr[0] = true;
                                            oh2Var2.c(true, false);
                                            oh2VarArr[0].setMultiline(true);
                                            piVar.addView(oh2VarArr[0], qoe.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            oh2VarArr[0].setOnClickListener(new gf(zArr, (byte) 1));
                                            pc0Var3 = pc0Var2;
                                            z9 = false;
                                            if (user == null) {
                                                pc0 pc0Var5 = pc0Var3;
                                                if (m9c.B(user)) {
                                                    pc0Var5.p = 0.6f;
                                                    pc0Var5.f(12);
                                                    bf0Var.m(null, null, pc0Var5, user);
                                                } else if (user.id == j) {
                                                    pc0Var5.p = 0.6f;
                                                    pc0Var5.f(1);
                                                    bf0Var.m(null, null, pc0Var5, user);
                                                } else {
                                                    pc0Var5.p = 1.0f;
                                                    dVar.getCurrentAccount();
                                                    pc0Var5.q(user);
                                                    bf0Var.f(user, pc0Var5);
                                                }
                                            } else {
                                                pc0 pc0Var6 = pc0Var3;
                                                dVar.getCurrentAccount();
                                                pc0Var6.p(chat2 != null ? chat2 : chat);
                                                bf0Var.f(chat2 != null ? chat2 : chat, pc0Var6);
                                            }
                                            if (z2) {
                                                oi oiVar3 = oiVar;
                                                if (!z) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z3) {
                                                            oiVar3.setText(gm.S2(jb6.a0(null, null, 2131754052, m9c.r(user))));
                                                        } else if (user.id == j) {
                                                            oiVar3.setText(gm.S2(jb6.M0(2131754055, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            oiVar3.setText(gm.S2(jb6.a0(null, null, 2131754051, m9c.r(user))));
                                                        } else {
                                                            str = null;
                                                            oiVar3.setText(gm.S2(jb6.a0(null, null, 2131754053, m9c.r(user))));
                                                        }
                                                    } else if (sd2.T(chat)) {
                                                        String a0 = chat2 != null ? jb6.a0(null, null, 2131748103, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            oiVar3.setText(gm.S2(jb6.a0(null, null, 2131748400, a0)));
                                                        } else {
                                                            oiVar3.setText(gm.S2(jb6.a0(null, null, 2131752333, a0)));
                                                        }
                                                    } else {
                                                        oiVar3.setText(gm.S2(jb6.a0(null, null, 2131754069, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a02 = chat2 != null ? jb6.a0(null, null, 2131748103, chat2.title) : chat.title;
                                                    if (!sd2.T(chat) || (chat.megagroup && !sd2.t0(chat))) {
                                                        str = null;
                                                        oiVar3.setText(gm.S2(jb6.a0(null, null, 2131754074, a02)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        oiVar3.setText(jb6.M0(2131754077, null));
                                                    } else {
                                                        str = null;
                                                        oiVar3.setText(jb6.M0(2131754079, null));
                                                    }
                                                } else if (z3) {
                                                    str = null;
                                                    oiVar3.setText(gm.S2(jb6.a0(null, null, 2131754073, m9c.r(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j) {
                                                        oiVar3.setText(gm.S2(jb6.M0(2131754076, null)));
                                                    } else {
                                                        oiVar3.setText(gm.S2(jb6.a0(null, null, 2131754072, m9c.r(user))));
                                                    }
                                                }
                                            } else if (m9c.D(user)) {
                                                str = null;
                                                oiVar.setText(gm.S2(jb6.M0(2131751518, null)));
                                            } else {
                                                oi oiVar4 = oiVar;
                                                str = null;
                                                if (chat == null || !sd2.V(chat)) {
                                                    oiVar4.setText(gm.S2(jb6.M0(2131751522, null)));
                                                    str = null;
                                                } else {
                                                    oiVar4.setText(gm.S2(jb6.M0(2131751521, null)));
                                                }
                                            }
                                            if (!z2) {
                                                M0 = jb6.M0(2131751527, str);
                                            } else if (z) {
                                                M0 = z11 ? jb6.M0(2131752025, str) : jb6.M0(2131752027, str);
                                            } else if (z9 && zArr[0]) {
                                                M0 = jb6.M0(sd2.V(chat) ? 2131752368 : 2131751467, str);
                                            } else {
                                                M0 = sd2.T(chat) ? chat.monoforum ? jb6.M0(2131748752, str) : chat.megagroup ? jb6.M0(2131748747, str) : jb6.M0(2131748759, str) : jb6.M0(2131751490, str);
                                            }
                                            he heVar3 = heVar;
                                            alertDialog$Builder.j(M0, new ee() { // from class: sh
                                                @Override // ee
                                                public final void r(he heVar4, int i) {
                                                    boolean z15 = z11;
                                                    final boolean z16 = z2;
                                                    final boolean[] zArr2 = zArr;
                                                    final ue7 ue7Var2 = ue7Var;
                                                    boolean z17 = true;
                                                    if (!z15 && !z16 && !z3) {
                                                        final TLRPC.User user2 = user;
                                                        boolean D = m9c.D(user2);
                                                        final d dVar2 = dVar;
                                                        final boolean z18 = z;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z19 = z4;
                                                        final boolean z20 = z6;
                                                        final ylb ylbVar2 = ylbVar;
                                                        if (D) {
                                                            ik.s(dVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, ue7Var2, ylbVar2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            cf7 Y = cf7.Y(dVar2.getCurrentAccount());
                                                            Y.a.c(new fe7(Y, user2.id, new we7() { // from class: tf
                                                                @Override // we7
                                                                public final void a(int i2) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    ue7 ue7Var3 = ue7Var2;
                                                                    if (i2 < 50) {
                                                                        ue7Var3.z(zArr3[0]);
                                                                    } else {
                                                                        ik.s(d.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, ue7Var3, ylbVar2);
                                                                    }
                                                                }
                                                            }, (byte) 0));
                                                            return;
                                                        }
                                                        if (sd2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final k11 g = alertDialog$Builder.a.g(-1, true, true);
                                                            g.d();
                                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                            tL_channels_getFutureCreatorAfterLeave.channel = oc7.h1(chat3);
                                                            final int i2 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                            kc kcVar = new kc((byte) 0);
                                                            final Activity activity = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, kcVar, new jac() { // from class: uf
                                                                @Override // jac
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    k11.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    ue7 ue7Var3 = ue7Var2;
                                                                    if (user4 == null) {
                                                                        ue7Var3.z(z16 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Activity activity2 = activity;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    jg jgVar = new jg(activity2, chat4, user4, i2, ue7Var3, ylbVar2, (byte) 0);
                                                                    kg kgVar = new kg(ue7Var3, (byte) 0);
                                                                    d dVar3 = dVar2;
                                                                    if (dVar3 == null || dVar3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context = dVar3.getContext();
                                                                    TLRPC.User f3 = z8c.h(dVar3.getCurrentAccount()).f();
                                                                    boolean V = sd2.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    bf0 bf0Var2 = new bf0(context);
                                                                    pc0 pc0Var7 = new pc0((ylb) null);
                                                                    pc0Var7.q(f3);
                                                                    bf0Var2.setRoundRadius(gm.L(30.0f));
                                                                    bf0Var2.f(f3, pc0Var7);
                                                                    frameLayout.addView(bf0Var2, qoe.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    anb.s(imageView, cmb.c7, dVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, qoe.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    qi qiVar = new qi(context);
                                                                    pc0 pc0Var8 = new pc0((ylb) null);
                                                                    pc0Var8.q(user4);
                                                                    qiVar.setRoundRadius(gm.L(30.0f));
                                                                    qiVar.f(user4, pc0Var8);
                                                                    frameLayout.addView(qiVar, qoe.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    bf0 bf0Var3 = new bf0(context);
                                                                    pc0 pc0Var9 = new pc0((ylb) null);
                                                                    pc0Var9.p(chat4);
                                                                    bf0Var3.setRoundRadius(gm.L(12.0f));
                                                                    bf0Var3.f(chat4, pc0Var9);
                                                                    frameLayout.addView(bf0Var3, qoe.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                    he heVar5 = alertDialog$Builder2.a;
                                                                    heVar5.P0 = -1.0f;
                                                                    heVar5.W = frameLayout;
                                                                    heVar5.S = jb6.M0(V ? 2131748757 : 2131748749, null);
                                                                    heVar5.U = gm.S2(jb6.a0(null, null, V ? 2131748758 : 2131748750, m9c.r(user4), chat4.title));
                                                                    alertDialog$Builder2.g(jb6.M0(2131754175, null), new l0(jgVar, (byte) 13));
                                                                    alertDialog$Builder2.h(jb6.M0(2131752542, null), null);
                                                                    alertDialog$Builder2.j(jb6.M0(V ? 2131748761 : 2131748747, null), new l0(kgVar, (byte) 14));
                                                                    heVar5.show();
                                                                    View c = heVar5.c(-1);
                                                                    if (c instanceof TextView) {
                                                                        anb.X((TextView) c, cmb.p7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        ue7Var2 = ue7Var2;
                                                    }
                                                    if (!z16 && !zArr2[0]) {
                                                        z17 = false;
                                                    }
                                                    ue7Var2.z(z17);
                                                }
                                            });
                                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                            dVar.showDialog(heVar3);
                                            textView = (TextView) heVar3.c(-1);
                                            if (textView == null) {
                                                anb.X(textView, cmb.p7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        heVar = heVar2;
                                        if (!z2 || (((!z3 || z) && !z13) || m9c.z(user) || z14)) {
                                            z8 = (z4 || z || chat == null || !chat.creator) ? false : true;
                                            if (!z8) {
                                                pc0Var3 = pc0Var2;
                                                z9 = z8;
                                                if (user == null) {
                                                }
                                                if (z2) {
                                                }
                                                if (!z2) {
                                                }
                                                he heVar32 = heVar;
                                                alertDialog$Builder.j(M0, new ee() { // from class: sh
                                                    @Override // ee
                                                    public final void r(he heVar4, int i) {
                                                        boolean z15 = z11;
                                                        final boolean z16 = z2;
                                                        final boolean[] zArr2 = zArr;
                                                        final ue7 ue7Var2 = ue7Var;
                                                        boolean z17 = true;
                                                        if (!z15 && !z16 && !z3) {
                                                            final TLRPC.User user2 = user;
                                                            boolean D = m9c.D(user2);
                                                            final d dVar2 = dVar;
                                                            final boolean z18 = z;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z19 = z4;
                                                            final boolean z20 = z6;
                                                            final ylb ylbVar2 = ylbVar;
                                                            if (D) {
                                                                ik.s(dVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, ue7Var2, ylbVar2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                cf7 Y = cf7.Y(dVar2.getCurrentAccount());
                                                                Y.a.c(new fe7(Y, user2.id, new we7() { // from class: tf
                                                                    @Override // we7
                                                                    public final void a(int i2) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        ue7 ue7Var3 = ue7Var2;
                                                                        if (i2 < 50) {
                                                                            ue7Var3.z(zArr3[0]);
                                                                        } else {
                                                                            ik.s(d.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, ue7Var3, ylbVar2);
                                                                        }
                                                                    }
                                                                }, (byte) 0));
                                                                return;
                                                            }
                                                            if (sd2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final k11 g = alertDialog$Builder.a.g(-1, true, true);
                                                                g.d();
                                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                                tL_channels_getFutureCreatorAfterLeave.channel = oc7.h1(chat3);
                                                                final int i2 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                                kc kcVar = new kc((byte) 0);
                                                                final Activity activity = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, kcVar, new jac() { // from class: uf
                                                                    @Override // jac
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        k11.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        ue7 ue7Var3 = ue7Var2;
                                                                        if (user4 == null) {
                                                                            ue7Var3.z(z16 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Activity activity2 = activity;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        jg jgVar = new jg(activity2, chat4, user4, i2, ue7Var3, ylbVar2, (byte) 0);
                                                                        kg kgVar = new kg(ue7Var3, (byte) 0);
                                                                        d dVar3 = dVar2;
                                                                        if (dVar3 == null || dVar3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context = dVar3.getContext();
                                                                        TLRPC.User f3 = z8c.h(dVar3.getCurrentAccount()).f();
                                                                        boolean V = sd2.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        bf0 bf0Var2 = new bf0(context);
                                                                        pc0 pc0Var7 = new pc0((ylb) null);
                                                                        pc0Var7.q(f3);
                                                                        bf0Var2.setRoundRadius(gm.L(30.0f));
                                                                        bf0Var2.f(f3, pc0Var7);
                                                                        frameLayout.addView(bf0Var2, qoe.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        anb.s(imageView, cmb.c7, dVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, qoe.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        qi qiVar = new qi(context);
                                                                        pc0 pc0Var8 = new pc0((ylb) null);
                                                                        pc0Var8.q(user4);
                                                                        qiVar.setRoundRadius(gm.L(30.0f));
                                                                        qiVar.f(user4, pc0Var8);
                                                                        frameLayout.addView(qiVar, qoe.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        bf0 bf0Var3 = new bf0(context);
                                                                        pc0 pc0Var9 = new pc0((ylb) null);
                                                                        pc0Var9.p(chat4);
                                                                        bf0Var3.setRoundRadius(gm.L(12.0f));
                                                                        bf0Var3.f(chat4, pc0Var9);
                                                                        frameLayout.addView(bf0Var3, qoe.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                        he heVar5 = alertDialog$Builder2.a;
                                                                        heVar5.P0 = -1.0f;
                                                                        heVar5.W = frameLayout;
                                                                        heVar5.S = jb6.M0(V ? 2131748757 : 2131748749, null);
                                                                        heVar5.U = gm.S2(jb6.a0(null, null, V ? 2131748758 : 2131748750, m9c.r(user4), chat4.title));
                                                                        alertDialog$Builder2.g(jb6.M0(2131754175, null), new l0(jgVar, (byte) 13));
                                                                        alertDialog$Builder2.h(jb6.M0(2131752542, null), null);
                                                                        alertDialog$Builder2.j(jb6.M0(V ? 2131748761 : 2131748747, null), new l0(kgVar, (byte) 14));
                                                                        heVar5.show();
                                                                        View c = heVar5.c(-1);
                                                                        if (c instanceof TextView) {
                                                                            anb.X((TextView) c, cmb.p7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            ue7Var2 = ue7Var2;
                                                        }
                                                        if (!z16 && !zArr2[0]) {
                                                            z17 = false;
                                                        }
                                                        ue7Var2.z(z17);
                                                    }
                                                });
                                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                                dVar.showDialog(heVar32);
                                                textView = (TextView) heVar32.c(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z8 = false;
                                        }
                                        oh2 oh2Var3 = new oh2(1, ylbVar, parentActivity);
                                        oh2VarArr[0] = oh2Var3;
                                        oh2Var3.setBackground(cmb.L0(false));
                                        if (!z8) {
                                            if (!sd2.T(chat) || chat.megagroup) {
                                                oh2VarArr[0].e(jb6.M0(2131751473, null), "", false, false, false);
                                            } else {
                                                oh2VarArr[0].e(jb6.M0(2131751494, null), "", false, false, false);
                                            }
                                            z10 = true;
                                        } else if (z) {
                                            z10 = true;
                                            oh2VarArr[0].e(jb6.a0(null, null, 2131752017, m9c.k(user, true)), "", false, false, false);
                                        } else {
                                            z10 = true;
                                            oh2VarArr[0].e(jb6.a0(null, null, 2131751462, m9c.k(user, true)), "", false, false, false);
                                        }
                                        oh2VarArr[0].setMultiline(z10);
                                        pc0Var3 = pc0Var2;
                                        oh2VarArr[0].setPadding(!jb6.a0 ? gm.L(16.0f) : gm.L(f2), gm.L(f), !jb6.a0 ? gm.L(f2) : gm.L(16.0f), gm.L(f));
                                        piVar.addView(oh2VarArr[0], qoe.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        rh rhVar = new rh(z8, chat, alertDialog$Builder, zArr);
                                        oh2VarArr[0].setOnClickListener(new t(zArr, rhVar, (byte) 13));
                                        if (z5) {
                                            oh2 oh2Var4 = oh2VarArr[0];
                                            zArr[0] = true;
                                            oh2Var4.c(true, false);
                                            rhVar.run();
                                        }
                                        z9 = z8;
                                        if (user == null) {
                                        }
                                        if (z2) {
                                        }
                                        if (!z2) {
                                        }
                                        he heVar322 = heVar;
                                        alertDialog$Builder.j(M0, new ee() { // from class: sh
                                            @Override // ee
                                            public final void r(he heVar4, int i) {
                                                boolean z15 = z11;
                                                final boolean z16 = z2;
                                                final boolean[] zArr2 = zArr;
                                                final ue7 ue7Var2 = ue7Var;
                                                boolean z17 = true;
                                                if (!z15 && !z16 && !z3) {
                                                    final TLRPC.User user2 = user;
                                                    boolean D = m9c.D(user2);
                                                    final d dVar2 = dVar;
                                                    final boolean z18 = z;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z19 = z4;
                                                    final boolean z20 = z6;
                                                    final ylb ylbVar2 = ylbVar;
                                                    if (D) {
                                                        ik.s(dVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, ue7Var2, ylbVar2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        cf7 Y = cf7.Y(dVar2.getCurrentAccount());
                                                        Y.a.c(new fe7(Y, user2.id, new we7() { // from class: tf
                                                            @Override // we7
                                                            public final void a(int i2) {
                                                                boolean[] zArr3 = zArr2;
                                                                ue7 ue7Var3 = ue7Var2;
                                                                if (i2 < 50) {
                                                                    ue7Var3.z(zArr3[0]);
                                                                } else {
                                                                    ik.s(d.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, ue7Var3, ylbVar2);
                                                                }
                                                            }
                                                        }, (byte) 0));
                                                        return;
                                                    }
                                                    if (sd2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final k11 g = alertDialog$Builder.a.g(-1, true, true);
                                                        g.d();
                                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                        tL_channels_getFutureCreatorAfterLeave.channel = oc7.h1(chat3);
                                                        final int i2 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                        kc kcVar = new kc((byte) 0);
                                                        final Activity activity = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, kcVar, new jac() { // from class: uf
                                                            @Override // jac
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                k11.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                ue7 ue7Var3 = ue7Var2;
                                                                if (user4 == null) {
                                                                    ue7Var3.z(z16 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Activity activity2 = activity;
                                                                TLRPC.Chat chat4 = chat3;
                                                                jg jgVar = new jg(activity2, chat4, user4, i2, ue7Var3, ylbVar2, (byte) 0);
                                                                kg kgVar = new kg(ue7Var3, (byte) 0);
                                                                d dVar3 = dVar2;
                                                                if (dVar3 == null || dVar3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context = dVar3.getContext();
                                                                TLRPC.User f3 = z8c.h(dVar3.getCurrentAccount()).f();
                                                                boolean V = sd2.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                bf0 bf0Var2 = new bf0(context);
                                                                pc0 pc0Var7 = new pc0((ylb) null);
                                                                pc0Var7.q(f3);
                                                                bf0Var2.setRoundRadius(gm.L(30.0f));
                                                                bf0Var2.f(f3, pc0Var7);
                                                                frameLayout.addView(bf0Var2, qoe.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                anb.s(imageView, cmb.c7, dVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, qoe.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                qi qiVar = new qi(context);
                                                                pc0 pc0Var8 = new pc0((ylb) null);
                                                                pc0Var8.q(user4);
                                                                qiVar.setRoundRadius(gm.L(30.0f));
                                                                qiVar.f(user4, pc0Var8);
                                                                frameLayout.addView(qiVar, qoe.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                bf0 bf0Var3 = new bf0(context);
                                                                pc0 pc0Var9 = new pc0((ylb) null);
                                                                pc0Var9.p(chat4);
                                                                bf0Var3.setRoundRadius(gm.L(12.0f));
                                                                bf0Var3.f(chat4, pc0Var9);
                                                                frameLayout.addView(bf0Var3, qoe.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                he heVar5 = alertDialog$Builder2.a;
                                                                heVar5.P0 = -1.0f;
                                                                heVar5.W = frameLayout;
                                                                heVar5.S = jb6.M0(V ? 2131748757 : 2131748749, null);
                                                                heVar5.U = gm.S2(jb6.a0(null, null, V ? 2131748758 : 2131748750, m9c.r(user4), chat4.title));
                                                                alertDialog$Builder2.g(jb6.M0(2131754175, null), new l0(jgVar, (byte) 13));
                                                                alertDialog$Builder2.h(jb6.M0(2131752542, null), null);
                                                                alertDialog$Builder2.j(jb6.M0(V ? 2131748761 : 2131748747, null), new l0(kgVar, (byte) 14));
                                                                heVar5.show();
                                                                View c = heVar5.c(-1);
                                                                if (c instanceof TextView) {
                                                                    anb.X((TextView) c, cmb.p7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    ue7Var2 = ue7Var2;
                                                }
                                                if (!z16 && !zArr2[0]) {
                                                    z17 = false;
                                                }
                                                ue7Var2.z(z17);
                                            }
                                        });
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                        dVar.showDialog(heVar322);
                                        textView = (TextView) heVar322.c(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        heVar = heVar2;
                                        pc0Var2 = pc0Var;
                                    }
                                } else {
                                    heVar = heVar2;
                                    pc0Var2 = pc0Var;
                                    f = 10.0f;
                                }
                                f2 = 8.0f;
                                if (z2) {
                                }
                                if (z4) {
                                }
                                if (!z8) {
                                }
                                oh2 oh2Var32 = new oh2(1, ylbVar, parentActivity);
                                oh2VarArr[0] = oh2Var32;
                                oh2Var32.setBackground(cmb.L0(false));
                                if (!z8) {
                                }
                                oh2VarArr[0].setMultiline(z10);
                                pc0Var3 = pc0Var2;
                                oh2VarArr[0].setPadding(!jb6.a0 ? gm.L(16.0f) : gm.L(f2), gm.L(f), !jb6.a0 ? gm.L(f2) : gm.L(16.0f), gm.L(f));
                                piVar.addView(oh2VarArr[0], qoe.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                rh rhVar2 = new rh(z8, chat, alertDialog$Builder, zArr);
                                oh2VarArr[0].setOnClickListener(new t(zArr, rhVar2, (byte) 13));
                                if (z5) {
                                }
                                z9 = z8;
                                if (user == null) {
                                }
                                if (z2) {
                                }
                                if (!z2) {
                                }
                                he heVar3222 = heVar;
                                alertDialog$Builder.j(M0, new ee() { // from class: sh
                                    @Override // ee
                                    public final void r(he heVar4, int i) {
                                        boolean z15 = z11;
                                        final boolean z16 = z2;
                                        final boolean[] zArr2 = zArr;
                                        final ue7 ue7Var2 = ue7Var;
                                        boolean z17 = true;
                                        if (!z15 && !z16 && !z3) {
                                            final TLRPC.User user2 = user;
                                            boolean D = m9c.D(user2);
                                            final d dVar2 = dVar;
                                            final boolean z18 = z;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z19 = z4;
                                            final boolean z20 = z6;
                                            final ylb ylbVar2 = ylbVar;
                                            if (D) {
                                                ik.s(dVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, ue7Var2, ylbVar2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                cf7 Y = cf7.Y(dVar2.getCurrentAccount());
                                                Y.a.c(new fe7(Y, user2.id, new we7() { // from class: tf
                                                    @Override // we7
                                                    public final void a(int i2) {
                                                        boolean[] zArr3 = zArr2;
                                                        ue7 ue7Var3 = ue7Var2;
                                                        if (i2 < 50) {
                                                            ue7Var3.z(zArr3[0]);
                                                        } else {
                                                            ik.s(d.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, ue7Var3, ylbVar2);
                                                        }
                                                    }
                                                }, (byte) 0));
                                                return;
                                            }
                                            if (sd2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final k11 g = alertDialog$Builder.a.g(-1, true, true);
                                                g.d();
                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                tL_channels_getFutureCreatorAfterLeave.channel = oc7.h1(chat3);
                                                final int i2 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                kc kcVar = new kc((byte) 0);
                                                final Activity activity = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, kcVar, new jac() { // from class: uf
                                                    @Override // jac
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        k11.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        ue7 ue7Var3 = ue7Var2;
                                                        if (user4 == null) {
                                                            ue7Var3.z(z16 || zArr2[0]);
                                                            return;
                                                        }
                                                        Activity activity2 = activity;
                                                        TLRPC.Chat chat4 = chat3;
                                                        jg jgVar = new jg(activity2, chat4, user4, i2, ue7Var3, ylbVar2, (byte) 0);
                                                        kg kgVar = new kg(ue7Var3, (byte) 0);
                                                        d dVar3 = dVar2;
                                                        if (dVar3 == null || dVar3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context = dVar3.getContext();
                                                        TLRPC.User f3 = z8c.h(dVar3.getCurrentAccount()).f();
                                                        boolean V = sd2.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        bf0 bf0Var2 = new bf0(context);
                                                        pc0 pc0Var7 = new pc0((ylb) null);
                                                        pc0Var7.q(f3);
                                                        bf0Var2.setRoundRadius(gm.L(30.0f));
                                                        bf0Var2.f(f3, pc0Var7);
                                                        frameLayout.addView(bf0Var2, qoe.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        anb.s(imageView, cmb.c7, dVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, qoe.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        qi qiVar = new qi(context);
                                                        pc0 pc0Var8 = new pc0((ylb) null);
                                                        pc0Var8.q(user4);
                                                        qiVar.setRoundRadius(gm.L(30.0f));
                                                        qiVar.f(user4, pc0Var8);
                                                        frameLayout.addView(qiVar, qoe.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        bf0 bf0Var3 = new bf0(context);
                                                        pc0 pc0Var9 = new pc0((ylb) null);
                                                        pc0Var9.p(chat4);
                                                        bf0Var3.setRoundRadius(gm.L(12.0f));
                                                        bf0Var3.f(chat4, pc0Var9);
                                                        frameLayout.addView(bf0Var3, qoe.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                        he heVar5 = alertDialog$Builder2.a;
                                                        heVar5.P0 = -1.0f;
                                                        heVar5.W = frameLayout;
                                                        heVar5.S = jb6.M0(V ? 2131748757 : 2131748749, null);
                                                        heVar5.U = gm.S2(jb6.a0(null, null, V ? 2131748758 : 2131748750, m9c.r(user4), chat4.title));
                                                        alertDialog$Builder2.g(jb6.M0(2131754175, null), new l0(jgVar, (byte) 13));
                                                        alertDialog$Builder2.h(jb6.M0(2131752542, null), null);
                                                        alertDialog$Builder2.j(jb6.M0(V ? 2131748761 : 2131748747, null), new l0(kgVar, (byte) 14));
                                                        heVar5.show();
                                                        View c = heVar5.c(-1);
                                                        if (c instanceof TextView) {
                                                            anb.X((TextView) c, cmb.p7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            ue7Var2 = ue7Var2;
                                        }
                                        if (!z16 && !zArr2[0]) {
                                            z17 = false;
                                        }
                                        ue7Var2.z(z17);
                                    }
                                });
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                dVar.showDialog(heVar3222);
                                textView = (TextView) heVar3222.c(-1);
                                if (textView == null) {
                                }
                            }

                            public static he s0(d dVar, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
                                TextView textView;
                                he M = M(dVar.getContext(), dVar.getResourceProvider(), str, charSequence, str2, runnable);
                                dVar.showDialog(M);
                                if (z && (textView = (TextView) M.c(-1)) != null) {
                                    anb.X(textView, cmb.p7, null);
                                }
                                return M;
                            }

                            public static he t(Activity activity, final long j, final long j2, final int i, final Runnable runnable, ylb ylbVar) {
                                int i2;
                                byte b;
                                SharedPreferences sharedPreferences = oc7.r1(z8c.t0).W3;
                                final String p = lo7.p(j, j2, false);
                                if (j != 0) {
                                    StringBuilder sb = new StringBuilder("color_");
                                    sb.append(p);
                                    i2 = sharedPreferences.contains(sb.toString()) ? kt6.g("color_", p, sharedPreferences, -16776961) : pg3.y(j) ? sharedPreferences.getInt("GroupLed", -16776961) : sharedPreferences.getInt("MessagesLed", -16776961);
                                } else {
                                    i2 = i == 1 ? sharedPreferences.getInt("MessagesLed", -16776961) : i == 0 ? sharedPreferences.getInt("GroupLed", -16776961) : i == 3 ? sharedPreferences.getInt("StoriesLed", -16776961) : (i == 5 || i == 4) ? sharedPreferences.getInt("ReactionsLed", -16776961) : sharedPreferences.getInt("ChannelLed", -16776961);
                                }
                                LinearLayout l = td4.l(activity, 1);
                                String[] strArr = {jb6.M0(2131751949, null), jb6.M0(2131751954, null), jb6.M0(2131751943, null), jb6.M0(2131751955, null), jb6.M0(2131751956, null), jb6.M0(2131751957, null), jb6.M0(2131751945, null), jb6.M0(2131751950, null), jb6.M0(2131751944, null)};
                                final int[] iArr = {i2};
                                int i3 = 0;
                                while (true) {
                                    b = 9;
                                    if (i3 >= 9) {
                                        break;
                                    }
                                    x09 x09Var = new x09(activity, ylbVar);
                                    x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                                    x09Var.setTag(Integer.valueOf(i3));
                                    int i4 = djb.e[i3];
                                    x09Var.a(i4, i4);
                                    x09Var.b(strArr[i3], i2 == djb.f[i3]);
                                    l.addView(x09Var);
                                    x09Var.setOnClickListener(new bg(l, iArr));
                                    i3++;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
                                String M0 = jb6.M0(2131748746, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                alertDialog$Builder.n(l);
                                alertDialog$Builder.j(jb6.M0(2131745284, null), new ee() { // from class: th
                                    @Override // ee
                                    public final void r(he heVar2, int i5) {
                                        SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
                                        long j3 = j;
                                        int[] iArr2 = iArr;
                                        if (j3 != 0) {
                                            edit.putInt(b10.h("color_", p), iArr2[0]);
                                            lo7.n(z8c.t0).f(j3, j2);
                                        } else {
                                            int i6 = i;
                                            if (i6 == 1) {
                                                edit.putInt("MessagesLed", iArr2[0]);
                                            } else if (i6 == 0) {
                                                edit.putInt("GroupLed", iArr2[0]);
                                            } else if (i6 == 3) {
                                                edit.putInt("StoriesLed", iArr2[0]);
                                            } else if (i6 == 5 || i6 == 4) {
                                                edit.putInt("ReactionLed", iArr2[0]);
                                            } else {
                                                edit.putInt("ChannelLed", iArr2[0]);
                                            }
                                            lo7.n(z8c.t0).g(i6);
                                        }
                                        edit.commit();
                                        runnable.run();
                                    }
                                });
                                alertDialog$Builder.h(jb6.M0(2131748745, null), new hg(j, i, (Object) runnable, (byte) 1));
                                if (j != 0) {
                                    alertDialog$Builder.g(jb6.M0(2131751537, null), new o(p, runnable, b));
                                }
                                return heVar;
                            }

                            public static void t0(String str, d dVar) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((dVar == null || dVar.getParentActivity() == null) ? a.b : dVar.getParentActivity(), str, 1).show();
                            }

                            public static void u(d dVar, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                                String M0 = jb6.M0(2131751725, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.a0("ContactNotRegistered", null, 2131751726, bw2.m(0, str, str2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131748931, null), new dh((byte) 0, str3, dVar));
                                dVar.showDialog(heVar);
                            }

                            public static he u0(Context context, String str, boolean z) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String M0 = jb6.M0(R.string.AppName, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = str;
                                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                if (z) {
                                    alertDialog$Builder.g(jb6.M0(2131743508, null), new oe(context, (byte) 1));
                                }
                                return alertDialog$Builder.o();
                            }

                            public static AlertDialog$Builder v(Activity activity, final we7 we7Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i = cmb.K5;
                                final byte b = 0;
                                alertDialog$Builder.l(R.raw.permission_request_contacts, 72, cmb.w0(null, i, false), null);
                                alertDialog$Builder.m(i, null);
                                alertDialog$Builder.a.U = gm.S2(jb6.M0(2131751711, null));
                                alertDialog$Builder.j(jb6.M0(2131751710, null), new ee() { // from class: vh
                                    @Override // ee
                                    public final void r(he heVar, int i2) {
                                        byte b2 = b;
                                        we7 we7Var2 = we7Var;
                                        switch (b2) {
                                            case 0:
                                                we7Var2.a(1);
                                                break;
                                            default:
                                                we7Var2.a(0);
                                                break;
                                        }
                                    }
                                });
                                final byte b2 = 1;
                                alertDialog$Builder.g(jb6.M0(2131751709, null), new ee() { // from class: vh
                                    @Override // ee
                                    public final void r(he heVar, int i2) {
                                        byte b22 = b2;
                                        we7 we7Var2 = we7Var;
                                        switch (b22) {
                                            case 0:
                                                we7Var2.a(1);
                                                break;
                                            default:
                                                we7Var2.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, lp7Var2.getValue());
                                calendar.set(1, lp7Var3.getValue());
                                lp7Var.setMinValue(1);
                                lp7Var.setMaxValue(calendar.getActualMaximum(5));
                            }

                            public static AlertDialog$Builder w(Context context, int i, int i2, int i3, int i4, int i5, int i6, String str, final boolean z, yg ygVar) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final lp7 lp7Var = new lp7(context, null);
                                final lp7 lp7Var2 = new lp7(context, null);
                                final lp7 lp7Var3 = new lp7(context, null);
                                linearLayout.addView(lp7Var2, qoe.l(0.3f, 0, -2));
                                final byte b = 0;
                                lp7Var2.setOnScrollListener(new ip7() { // from class: mg
                                    @Override // ip7
                                    public final void b(int i7) {
                                        byte b2 = b;
                                        lp7 lp7Var4 = lp7Var3;
                                        lp7 lp7Var5 = lp7Var;
                                        lp7 lp7Var6 = lp7Var2;
                                        boolean z2 = z;
                                        switch (b2) {
                                            case 0:
                                                if (z2 && i7 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i7 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i7 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                lp7Var.setMinValue(0);
                                lp7Var.setMaxValue(11);
                                linearLayout.addView(lp7Var, qoe.l(0.3f, 0, -2));
                                lp7Var.setFormatter(new c((byte) 24));
                                lp7Var.setOnValueChangedListener(new ng(lp7Var2, lp7Var, lp7Var3, (byte) 0));
                                final byte b2 = 1;
                                lp7Var.setOnScrollListener(new ip7() { // from class: mg
                                    @Override // ip7
                                    public final void b(int i7) {
                                        byte b22 = b2;
                                        lp7 lp7Var4 = lp7Var3;
                                        lp7 lp7Var5 = lp7Var;
                                        lp7 lp7Var6 = lp7Var2;
                                        boolean z2 = z;
                                        switch (b22) {
                                            case 0:
                                                if (z2 && i7 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i7 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i7 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i7 = calendar.get(1);
                                lp7Var3.setMinValue(i + i7);
                                lp7Var3.setMaxValue(i2 + i7);
                                lp7Var3.setValue(i7 + i3);
                                linearLayout.addView(lp7Var3, qoe.l(0.4f, 0, -2));
                                lp7Var3.setOnValueChangedListener(new ng(lp7Var2, lp7Var, lp7Var3, (byte) 1));
                                final byte b3 = 2;
                                lp7Var3.setOnScrollListener(new ip7() { // from class: mg
                                    @Override // ip7
                                    public final void b(int i72) {
                                        byte b22 = b3;
                                        lp7 lp7Var4 = lp7Var3;
                                        lp7 lp7Var5 = lp7Var;
                                        lp7 lp7Var6 = lp7Var2;
                                        boolean z2 = z;
                                        switch (b22) {
                                            case 0:
                                                if (z2 && i72 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i72 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i72 == 0) {
                                                    ik.d(lp7Var6, lp7Var5, lp7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                v0(lp7Var2, lp7Var, lp7Var3);
                                if (z) {
                                    d(lp7Var2, lp7Var, lp7Var3);
                                }
                                if (i4 != -1) {
                                    lp7Var2.setValue(i4);
                                    lp7Var.setValue(i5);
                                    lp7Var3.setValue(i6);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.S = str;
                                alertDialog$Builder.n(linearLayout);
                                alertDialog$Builder.j(jb6.M0(2131745284, null), new og(z, lp7Var2, lp7Var, lp7Var3, ygVar));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                return alertDialog$Builder;
                            }

                            public static void x(Context context, String str, String str2, long j, gk gkVar) {
                                Object obj;
                                wb wbVar;
                                if (context == null) {
                                    return;
                                }
                                int w0 = cmb.w0(null, cmb.i5, false);
                                int w02 = cmb.w0(null, cmb.g5, false);
                                cmb.w0(null, cmb.zj, false);
                                cmb.w0(null, cmb.Dj, false);
                                cmb.w0(null, cmb.D8, false);
                                cmb.w0(null, cmb.F8, false);
                                cmb.w0(null, cmb.h6, false);
                                int w03 = cmb.w0(null, cmb.Ii, false);
                                int w04 = cmb.w0(null, cmb.Ei, false);
                                int w05 = cmb.w0(null, cmb.Gi, false);
                                k6d k6dVar = new k6d(context, (ylb) null);
                                Object obj2 = k6dVar.b;
                                ((my0) obj2).w0 = false;
                                lp7 lp7Var = new lp7(context, null);
                                lp7Var.setTextColor(w0);
                                lp7Var.setTextOffset(gm.L(10.0f));
                                lp7Var.setItemCount(5);
                                ej ejVar = new ej(context, null);
                                ejVar.setItemCount(5);
                                ejVar.setTextColor(w0);
                                ejVar.setTextOffset(-gm.L(10.0f));
                                gj gjVar = new gj(context, null);
                                gjVar.setItemCount(5);
                                gjVar.setTextColor(w0);
                                gjVar.setTextOffset(-gm.L(34.0f));
                                zi ziVar = new zi(context, lp7Var, ejVar, gjVar, (byte) 2);
                                ziVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                ziVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                textView.setTextColor(w0);
                                textView.setTextSize(1, 20.0f);
                                textView.setTypeface(gm.o());
                                frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new p8((byte) 5));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                wb wbVar2 = new wb(context, (byte) 2);
                                linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var.setMinValue(0);
                                lp7Var.setMaxValue(365);
                                lp7Var.setWrapSelectorWheel(false);
                                lp7Var.setFormatter(new c((byte) 27));
                                jf jfVar = new jf((Object) lp7Var, (Object) ejVar, (Object) gjVar, (byte) 2);
                                lp7Var.setOnValueChangedListener(jfVar);
                                ejVar.setMinValue(0);
                                ejVar.setMaxValue(23);
                                linearLayout.addView(ejVar, qoe.l(0.2f, 0, nm7.s4));
                                ejVar.setFormatter(new c((byte) 28));
                                ejVar.setOnValueChangedListener(jfVar);
                                gjVar.setMinValue(0);
                                gjVar.setMaxValue(59);
                                gjVar.setValue(0);
                                gjVar.setFormatter(new c((byte) 29));
                                linearLayout.addView(gjVar, qoe.l(0.3f, 0, nm7.s4));
                                gjVar.setOnValueChangedListener(jfVar);
                                if (j <= 0 || j == 2147483646) {
                                    obj = obj2;
                                    wbVar = wbVar2;
                                } else {
                                    long j2 = 1000 * j;
                                    obj = obj2;
                                    calendar.setTimeInMillis(System.currentTimeMillis());
                                    calendar.set(12, 0);
                                    calendar.set(13, 0);
                                    calendar.set(14, 0);
                                    calendar.set(11, 0);
                                    wbVar = wbVar2;
                                    int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
                                    calendar.setTimeInMillis(j2);
                                    if (timeInMillis >= 0) {
                                        gjVar.setValue(calendar.get(12));
                                        ejVar.setValue(calendar.get(11));
                                        lp7Var.setValue(timeInMillis);
                                    }
                                }
                                g(null, null, 0L, 0L, 0, lp7Var, ejVar, gjVar);
                                wb wbVar3 = wbVar;
                                wbVar3.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                wbVar3.setGravity(17);
                                wbVar3.setTextColor(w03);
                                wbVar3.setTextSize(1, 14.0f);
                                wbVar3.setTypeface(gm.o());
                                int L = gm.L(8.0f);
                                wbVar3.setBackgroundDrawable(cmb.i0(L, L, L, L, w04, w05, w05));
                                wbVar3.setText(str2);
                                ziVar.addView(wbVar3, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                                wbVar3.setOnClickListener(new gg(lp7Var, ejVar, gjVar, calendar, gkVar, k6dVar, (byte) 1));
                                my0 my0Var = (my0) obj;
                                my0Var.O = ziVar;
                                my0Var.show();
                                my0Var.s0(w02);
                                my0Var.K(w02);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:412:0x0210, code lost:
                            
                                if (java.lang.Math.abs(r9 - r4.k.date) > 86400) goto L95;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[ADDED_TO_REGION] */
                            /* JADX WARN: Type inference failed for: r12v11 */
                            /* JADX WARN: Type inference failed for: r12v12, types: [ee, java.lang.String, ylb] */
                            /* JADX WARN: Type inference failed for: r12v14 */
                            /* JADX WARN: Type inference failed for: r12v24 */
                            /* JADX WARN: Type inference failed for: r12v25 */
                            /* JADX WARN: Type inference failed for: r9v28 */
                            /* JADX WARN: Type inference failed for: r9v31 */
                            /* JADX WARN: Type inference failed for: r9v44 */
                            /* JADX WARN: Type inference failed for: r9v45 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void y(final d dVar, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final k47 k47Var, final SparseArray[] sparseArrayArr, final f47 f47Var, final int i, final int i2, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, final ho1 ho1Var, final ylb ylbVar) {
                                Activity parentActivity;
                                final ho1 ho1Var2;
                                final int i3;
                                boolean z;
                                boolean z2;
                                boolean z3;
                                int i4;
                                int i5;
                                boolean z4;
                                int i6;
                                he heVar;
                                boolean z5;
                                int i7;
                                boolean z6;
                                boolean z7;
                                boolean z8;
                                oh2 oh2Var;
                                String str;
                                int i8;
                                TLRPC.MessageAction messageAction;
                                he heVar2;
                                int i9;
                                String str2;
                                String str3;
                                boolean z9;
                                ?? r12;
                                AlertDialog$Builder alertDialog$Builder;
                                int i10;
                                int i11;
                                boolean z10;
                                TLRPC.MessageAction messageAction2;
                                ArrayList arrayList;
                                int i12;
                                final int i13;
                                final int i14;
                                int i15;
                                int i16;
                                TLRPC.Message message;
                                k47 k47Var2 = k47Var;
                                boolean z11 = i2 == 1;
                                boolean z12 = i2 == 3;
                                if (dVar != null) {
                                    if ((user == null && chat == null && encryptedChat == null) || (parentActivity = dVar.getParentActivity()) == null) {
                                        return;
                                    }
                                    int currentAccount = dVar.getCurrentAccount();
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ylbVar, parentActivity);
                                    float f = ho1Var != null ? 0.5f : 0.6f;
                                    he heVar3 = alertDialog$Builder2.a;
                                    heVar3.R0 = f;
                                    int size = f47Var != null ? f47Var.d.size() : k47Var2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                    long E = encryptedChat != null ? pg3.E(encryptedChat.id) : user != null ? user.id : -chat.id;
                                    if (z11) {
                                        if (k47Var2 == null || (message = k47Var2.k) == null) {
                                            i12 = currentAccount;
                                        } else {
                                            i12 = currentAccount;
                                            i16 = message.schedule_repeat_period;
                                            if (i16 > 0) {
                                                i15 = message.date;
                                                i14 = i16;
                                                i13 = i15;
                                                if (i13 <= 0 && i14 > 0) {
                                                    String a0 = jb6.a0(null, null, 2131748274, Integer.valueOf(i14));
                                                    if (i14 == 31536000) {
                                                        a0 = jb6.M0(2131748270, null);
                                                    } else if (i14 >= 2592000) {
                                                        a0 = jb6.G(i14 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                                    } else if (i14 >= 604800) {
                                                        a0 = jb6.G(i14 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                                    } else if (i14 >= 86400) {
                                                        a0 = jb6.G(i14 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                                    }
                                                    String str4 = a0;
                                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ylbVar, parentActivity);
                                                    String M0 = jb6.M0(2131748268, null);
                                                    he heVar4 = alertDialog$Builder3.a;
                                                    heVar4.S = M0;
                                                    heVar4.U = jb6.M0(2131748269, null);
                                                    final int i17 = i12;
                                                    alertDialog$Builder3.g(str4, new ee() { // from class: ni
                                                        @Override // ee
                                                        public final void r(he heVar5, int i18) {
                                                            f47 f47Var2 = f47.this;
                                                            int i19 = i17;
                                                            d dVar2 = dVar;
                                                            int i20 = i13;
                                                            int i21 = i14;
                                                            if (f47Var2 != null) {
                                                                ArrayList arrayList2 = f47Var2.d;
                                                                if (!arrayList2.isEmpty()) {
                                                                    a6a.B(i19).t((k47) arrayList2.get(0), dVar2, i20 + i21, i21);
                                                                    return;
                                                                }
                                                            }
                                                            a6a.B(i19).t(k47Var, dVar2, i20 + i21, i21);
                                                        }
                                                    });
                                                    final long j2 = E;
                                                    final boolean z13 = z12;
                                                    alertDialog$Builder3.h(jb6.M0(2131748281, null), new ee() { // from class: re
                                                        @Override // ee
                                                        public final void r(he heVar5, int i18) {
                                                            SparseArray[] sparseArrayArr2;
                                                            ArrayList arrayList2;
                                                            int i19;
                                                            long j3;
                                                            ArrayList arrayList3;
                                                            TLRPC.Peer peer;
                                                            int i20;
                                                            long j4;
                                                            ArrayList arrayList4;
                                                            boolean z14 = z13;
                                                            int i21 = i17;
                                                            long e = z14 ? z8c.h(i21).e() : j2;
                                                            k47 k47Var3 = k47Var;
                                                            TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                            long j5 = j;
                                                            int i22 = i;
                                                            int i23 = i2;
                                                            ArrayList arrayList5 = null;
                                                            if (k47Var3 != null) {
                                                                ArrayList arrayList6 = new ArrayList();
                                                                f47 f47Var2 = f47Var;
                                                                if (f47Var2 != null) {
                                                                    ArrayList arrayList7 = f47Var2.d;
                                                                    int i24 = 0;
                                                                    while (i24 < arrayList7.size()) {
                                                                        k47 k47Var4 = (k47) arrayList7.get(i24);
                                                                        arrayList6.add(Integer.valueOf(k47Var4.e1()));
                                                                        if (encryptedChat2 != null) {
                                                                            arrayList4 = arrayList6;
                                                                            if (k47Var4.k.random_id == 0 || k47Var4.D == 10) {
                                                                                i20 = i21;
                                                                                j4 = e;
                                                                            } else {
                                                                                if (arrayList5 == null) {
                                                                                    arrayList5 = new ArrayList();
                                                                                }
                                                                                ArrayList arrayList8 = arrayList5;
                                                                                i20 = i21;
                                                                                j4 = e;
                                                                                arrayList8.add(Long.valueOf(k47Var4.k.random_id));
                                                                                arrayList5 = arrayList8;
                                                                            }
                                                                        } else {
                                                                            i20 = i21;
                                                                            j4 = e;
                                                                            arrayList4 = arrayList6;
                                                                        }
                                                                        i24++;
                                                                        arrayList6 = arrayList4;
                                                                        i21 = i20;
                                                                        e = j4;
                                                                    }
                                                                    i19 = i21;
                                                                    j3 = e;
                                                                } else {
                                                                    i19 = i21;
                                                                    j3 = e;
                                                                    arrayList6.add(Integer.valueOf(k47Var3.e1()));
                                                                    if (encryptedChat2 != null && k47Var3.k.random_id != 0 && k47Var3.D != 10) {
                                                                        ArrayList arrayList9 = new ArrayList();
                                                                        arrayList9.add(Long.valueOf(k47Var3.k.random_id));
                                                                        arrayList3 = arrayList9;
                                                                        oc7.r1(i19).V(arrayList6, arrayList3, encryptedChat2, (j5 == 0 && (peer = k47Var3.k.peer_id) != null && peer.chat_id == (-j5)) ? j5 : j3, i22, true, i23);
                                                                    }
                                                                }
                                                                arrayList3 = arrayList5;
                                                                oc7.r1(i19).V(arrayList6, arrayList3, encryptedChat2, (j5 == 0 && (peer = k47Var3.k.peer_id) != null && peer.chat_id == (-j5)) ? j5 : j3, i22, true, i23);
                                                            } else {
                                                                long j6 = e;
                                                                int i25 = 1;
                                                                while (i25 >= 0) {
                                                                    ArrayList arrayList10 = new ArrayList();
                                                                    int i26 = 0;
                                                                    while (true) {
                                                                        sparseArrayArr2 = sparseArrayArr;
                                                                        if (i26 >= sparseArrayArr2[i25].size()) {
                                                                            break;
                                                                        }
                                                                        arrayList10.add(Integer.valueOf(sparseArrayArr2[i25].keyAt(i26)));
                                                                        i26++;
                                                                    }
                                                                    if (encryptedChat2 != null) {
                                                                        ArrayList arrayList11 = new ArrayList();
                                                                        for (int i27 = 0; i27 < sparseArrayArr2[i25].size(); i27++) {
                                                                            k47 k47Var5 = (k47) sparseArrayArr2[i25].valueAt(i27);
                                                                            long j7 = k47Var5.k.random_id;
                                                                            if (j7 != 0 && k47Var5.D != 10) {
                                                                                arrayList11.add(Long.valueOf(j7));
                                                                            }
                                                                        }
                                                                        arrayList2 = arrayList11;
                                                                    } else {
                                                                        arrayList2 = null;
                                                                    }
                                                                    oc7.r1(i21).V(arrayList10, arrayList2, encryptedChat2, (i25 != 1 || j5 == 0) ? j6 : j5, i22, true, i23);
                                                                    sparseArrayArr2[i25].clear();
                                                                    i25--;
                                                                }
                                                            }
                                                            runnable.run();
                                                        }
                                                    });
                                                    alertDialog$Builder3.j(jb6.M0(2131752542, null), null);
                                                    alertDialog$Builder3.c(-2);
                                                    alertDialog$Builder3.c(-3);
                                                    final byte b = 1;
                                                    heVar4.O = new DialogInterface.OnDismissListener() { // from class: qe
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b2 = b;
                                                            ho1 ho1Var3 = ho1Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (ho1Var3 != null) {
                                                                        ho1Var3.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    if (ho1Var3 != null) {
                                                                        ho1Var3.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    ho1Var3.run();
                                                                    break;
                                                            }
                                                        }
                                                    };
                                                    alertDialog$Builder3.o();
                                                    return;
                                                }
                                                k47Var2 = k47Var;
                                                ho1Var2 = ho1Var;
                                                i3 = i12;
                                            }
                                        }
                                        if (f47Var != null) {
                                            ArrayList arrayList2 = f47Var.d;
                                            if (!arrayList2.isEmpty() && arrayList2.get(0) != null && ((k47) arrayList2.get(0)).k != null && ((k47) arrayList2.get(0)).k.schedule_repeat_period > 0) {
                                                i15 = ((k47) arrayList2.get(0)).k.date;
                                                i16 = ((k47) arrayList2.get(0)).k.schedule_repeat_period;
                                                i14 = i16;
                                                i13 = i15;
                                                if (i13 <= 0) {
                                                }
                                                k47Var2 = k47Var;
                                                ho1Var2 = ho1Var;
                                                i3 = i12;
                                            }
                                        }
                                        i13 = 0;
                                        i14 = 0;
                                        if (i13 <= 0) {
                                        }
                                        k47Var2 = k47Var;
                                        ho1Var2 = ho1Var;
                                        i3 = i12;
                                    } else {
                                        ho1Var2 = ho1Var;
                                        i3 = currentAccount;
                                    }
                                    final long j3 = E;
                                    boolean z14 = z12;
                                    int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                                    oc7.r1(i3).l4.h.g(TimeUnit.SECONDS);
                                    if (k47Var2 != null) {
                                        z3 = !k47Var2.T2() || Math.abs(currentTime - k47Var2.k.date) > 86400;
                                        if (k47Var2.P3()) {
                                            TLRPC.Message message2 = k47Var2.k;
                                            boolean z15 = message2.paid_suggested_post_stars;
                                            z2 = message2.paid_suggested_post_ton;
                                            z = z15;
                                        } else {
                                            z = false;
                                            z2 = false;
                                        }
                                    } else {
                                        int i18 = 0;
                                        z = false;
                                        z2 = false;
                                        boolean z16 = false;
                                        while (i18 < 2) {
                                            int i19 = 0;
                                            while (true) {
                                                i4 = i18;
                                                if (i19 < sparseArrayArr[i18].size()) {
                                                    k47 k47Var3 = (k47) sparseArrayArr[i4].valueAt(i19);
                                                    if (k47Var3.T2()) {
                                                        i5 = i19;
                                                    } else {
                                                        i5 = i19;
                                                    }
                                                    z16 = true;
                                                    if (k47Var3.P3()) {
                                                        TLRPC.Message message3 = k47Var3.k;
                                                        z |= message3.paid_suggested_post_stars;
                                                        z2 |= message3.paid_suggested_post_ton;
                                                    }
                                                    i19 = i5 + 1;
                                                    i18 = i4;
                                                }
                                            }
                                            i18 = i4 + 1;
                                        }
                                        z3 = z16;
                                    }
                                    if (f47Var != null) {
                                        ArrayList arrayList3 = f47Var.d;
                                        z4 = z3;
                                        int i20 = 0;
                                        while (i20 < arrayList3.size()) {
                                            k47 k47Var4 = (k47) arrayList3.get(i20);
                                            if (k47Var4.P3()) {
                                                TLRPC.Message message4 = k47Var4.k;
                                                arrayList = arrayList3;
                                                z |= message4.paid_suggested_post_stars;
                                                z2 |= message4.paid_suggested_post_ton;
                                            } else {
                                                arrayList = arrayList3;
                                            }
                                            i20++;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        z4 = z3;
                                    }
                                    boolean z17 = z2;
                                    boolean z18 = z;
                                    final boolean[] zArr = new boolean[1];
                                    boolean z19 = user != null && oc7.r1(i3).V2;
                                    int i21 = user != null ? oc7.r1(i3).U2 : oc7.r1(i3).T2;
                                    boolean z20 = encryptedChat == null && user != null && z19 && i21 == Integer.MAX_VALUE;
                                    boolean z21 = z19;
                                    if (chat == null || !chat.megagroup || z11 || z14) {
                                        i6 = i3;
                                        heVar = heVar3;
                                        if (z11 || z14 || sd2.T(chat) || encryptedChat != null) {
                                            z5 = z14;
                                            i7 = 0;
                                            z6 = false;
                                            z7 = false;
                                        } else {
                                            int i22 = currentTime;
                                            boolean z22 = z14;
                                            if ((user == null || user.id == z8c.h(i6).e() || (user.bot && !user.support)) && chat == null) {
                                                z5 = z22;
                                                z8 = false;
                                                i7 = 0;
                                            } else if (k47Var2 != null) {
                                                i7 = (k47Var2.m4() || !((messageAction = k47Var2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(k47Var2.N3() || z21 || sd2.N(chat)) || i22 - k47Var2.k.date > i21)) ? 0 : 1;
                                                z8 = !k47Var2.N3();
                                                z5 = z22;
                                            } else {
                                                boolean z23 = false;
                                                int i23 = 1;
                                                int i24 = 0;
                                                while (true) {
                                                    z5 = z22;
                                                    if (i23 < 0) {
                                                        break;
                                                    }
                                                    int i25 = 0;
                                                    while (i25 < sparseArrayArr[i23].size()) {
                                                        k47 k47Var5 = (k47) sparseArrayArr[i23].valueAt(i25);
                                                        int i26 = i25;
                                                        TLRPC.MessageAction messageAction3 = k47Var5.k.action;
                                                        int i27 = i22;
                                                        if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((k47Var5.N3() || z21 || (chat != null && sd2.w(2, chat))) && i27 - k47Var5.k.date <= i21)) {
                                                            i24++;
                                                            if (!z23 && !k47Var5.N3()) {
                                                                z23 = true;
                                                            }
                                                        }
                                                        i25 = i26 + 1;
                                                        i22 = i27;
                                                    }
                                                    i23--;
                                                    z22 = z5;
                                                }
                                                z8 = z23;
                                                i7 = i24;
                                            }
                                            if (i7 <= 0 || !z4 || (user != null && m9c.z(user))) {
                                                z7 = z8;
                                                z6 = false;
                                            } else {
                                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                                oh2 oh2Var2 = new oh2(1, ylbVar, parentActivity);
                                                oh2Var2.setBackgroundDrawable(cmb.L0(false));
                                                if (z20) {
                                                    oh2Var = oh2Var2;
                                                    oh2Var.e(jb6.a0("DeleteMessagesOptionAlso", null, 2131751462, m9c.k(user, true)), "", false, false, false);
                                                } else {
                                                    oh2Var = oh2Var2;
                                                    if (chat == null) {
                                                        str = null;
                                                        i8 = 2131751463;
                                                    } else if (z8 || i7 == size) {
                                                        oh2Var.e(jb6.M0(2131751477, null), "", false, false, false);
                                                    } else {
                                                        i8 = 2131751463;
                                                        str = null;
                                                    }
                                                    oh2Var.e(jb6.M0(i8, str), "", false, false, false);
                                                }
                                                oh2 oh2Var3 = oh2Var;
                                                oh2Var3.setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                                                frameLayout.addView(oh2Var3, qoe.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                oh2Var3.setOnClickListener(new gf(zArr, (byte) 5));
                                                alertDialog$Builder2.n(frameLayout);
                                                heVar.H = (byte) 9;
                                                z7 = z8;
                                                z6 = true;
                                            }
                                        }
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        if (k47Var2 != null) {
                                            TLRPC.MessageAction messageAction4 = k47Var2.k.action;
                                            if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                                                if (f47Var != null) {
                                                    arrayList4.addAll(f47Var.d);
                                                } else {
                                                    arrayList4.add(k47Var2);
                                                }
                                            }
                                            i10 = (!k47Var2.m4() && k47.B0(k47Var2.k) == j && ((messageAction2 = k47Var2.k.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && k47Var2.N3() && currentTime - k47Var2.k.date <= i21) ? 1 : 0;
                                        } else {
                                            int i28 = 1;
                                            int i29 = 0;
                                            while (i28 >= 0) {
                                                int i30 = 0;
                                                while (i30 < sparseArrayArr[i28].size()) {
                                                    k47 k47Var6 = (k47) sparseArrayArr[i28].valueAt(i30);
                                                    int i31 = i30;
                                                    if (i28 == 1 && k47Var6.N3()) {
                                                        TLRPC.Message message5 = k47Var6.k;
                                                        i11 = i28;
                                                        if (message5.action == null && currentTime - message5.date <= i21) {
                                                            i29++;
                                                        }
                                                    } else {
                                                        i11 = i28;
                                                    }
                                                    arrayList4.add(k47Var6);
                                                    i30 = i31 + 1;
                                                    i28 = i11;
                                                }
                                                i28--;
                                            }
                                            i10 = i29;
                                        }
                                        byte b2 = 0;
                                        ArrayList arrayList5 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new se(b2)).mapToLong(new te(b2)).distinct().mapToObj(new LongFunction() { // from class: ue
                                            @Override // java.util.function.LongFunction
                                            public final Object apply(long j4) {
                                                int i32 = i3;
                                                return j4 > 0 ? oc7.r1(i32).W1(Long.valueOf(j4)) : oc7.r1(i32).L0(Long.valueOf(-j4));
                                            }
                                        }).filter(new se((byte) 1)).filter(new ve((byte) 0, z8c.h(i3).e())).collect(Collectors.toCollection(new tn1((byte) 0)));
                                        if (!arrayList5.isEmpty()) {
                                            if (channelParticipantArr != null) {
                                                ef3 ef3Var = new ef3(dVar, chat, arrayList4, arrayList5, channelParticipantArr, j, i, i2, false, runnable);
                                                if (ho1Var2 != null) {
                                                    final byte b3 = 2;
                                                    ef3Var.I0 = new DialogInterface.OnDismissListener() { // from class: qe
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b22 = b3;
                                                            ho1 ho1Var3 = ho1Var2;
                                                            switch (b22) {
                                                                case 0:
                                                                    if (ho1Var3 != null) {
                                                                        ho1Var3.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    if (ho1Var3 != null) {
                                                                        ho1Var3.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    ho1Var3.run();
                                                                    break;
                                                            }
                                                        }
                                                    };
                                                }
                                                ef3Var.show();
                                                return;
                                            }
                                            final he[] heVarArr = {new he(3, null, parentActivity)};
                                            final int size2 = arrayList5.size();
                                            TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                                            int[] iArr = new int[size2];
                                            int[] iArr2 = new int[1];
                                            int i32 = 0;
                                            while (i32 < size2) {
                                                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                                                tL_channels_getParticipant.channel = oc7.h1(chat);
                                                tL_channels_getParticipant.participant = oc7.j1((TLObject) arrayList5.get(i32));
                                                final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                                ArrayList arrayList6 = arrayList5;
                                                final ho1 ho1Var3 = ho1Var2;
                                                final int[] iArr3 = iArr;
                                                final int[] iArr4 = iArr2;
                                                final int i33 = i32;
                                                iArr3[i33] = ConnectionsManager.getInstance(i3).sendRequest(tL_channels_getParticipant, new RequestDelegate() { // from class: we
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                        final int[] iArr5 = iArr4;
                                                        final int[] iArr6 = iArr3;
                                                        final int i34 = i33;
                                                        final TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                                        final int i35 = size2;
                                                        final he[] heVarArr2 = heVarArr;
                                                        final d dVar2 = dVar;
                                                        final TLRPC.User user2 = user;
                                                        final TLRPC.Chat chat2 = chat;
                                                        final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                        final TLRPC.ChatFull chatFull2 = chatFull;
                                                        final long j4 = j;
                                                        final k47 k47Var7 = k47Var;
                                                        final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                                        final f47 f47Var2 = f47Var;
                                                        final int i36 = i;
                                                        final int i37 = i2;
                                                        final Runnable runnable2 = runnable;
                                                        final ho1 ho1Var4 = ho1Var3;
                                                        final ylb ylbVar2 = ylbVar;
                                                        gm.c3(new Runnable() { // from class: fg
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                he[] heVarArr3 = heVarArr2;
                                                                int[] iArr7 = iArr5;
                                                                iArr7[0] = iArr7[0] + 1;
                                                                int[] iArr8 = iArr6;
                                                                int i38 = i34;
                                                                iArr8[i38] = 0;
                                                                TLObject tLObject2 = tLObject;
                                                                TLRPC.ChannelParticipant[] channelParticipantArr5 = channelParticipantArr4;
                                                                if (tLObject2 != null) {
                                                                    channelParticipantArr5[i38] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                                }
                                                                if (iArr7[0] == i35) {
                                                                    try {
                                                                        heVarArr3[0].dismiss();
                                                                    } catch (Throwable unused) {
                                                                    }
                                                                    heVarArr3[0] = null;
                                                                    ik.y(dVar2, user2, chat2, encryptedChat2, chatFull2, j4, k47Var7, sparseArrayArr2, f47Var2, i36, i37, channelParticipantArr5, runnable2, ho1Var4, ylbVar2);
                                                                }
                                                            }
                                                        });
                                                    }
                                                });
                                                i32 = i33 + 1;
                                                ho1Var2 = ho1Var;
                                                size2 = size2;
                                                iArr = iArr3;
                                                channelParticipantArr2 = channelParticipantArr3;
                                                iArr2 = iArr4;
                                                arrayList5 = arrayList6;
                                                i3 = i3;
                                            }
                                            gm.d3(new i77((Object) heVarArr, (Object) iArr, i3, (Object) ho1Var, (Object) dVar, (byte) 3), 1000L);
                                            return;
                                        }
                                        i6 = i3;
                                        if (i10 <= 0 || !z4) {
                                            heVar = heVar3;
                                            z10 = false;
                                        } else {
                                            FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                            oh2 oh2Var4 = new oh2(1, ylbVar, parentActivity);
                                            oh2Var4.setBackgroundDrawable(cmb.L0(false));
                                            oh2Var4.e(jb6.M0(2131751463, null), "", false, false, false);
                                            oh2Var4.setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                                            frameLayout2.addView(oh2Var4, qoe.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                            oh2Var4.setOnClickListener(new gf(zArr, (byte) 4));
                                            alertDialog$Builder2.n(frameLayout2);
                                            heVar = heVar3;
                                            heVar.H = (byte) 9;
                                            z10 = true;
                                        }
                                        z6 = z10;
                                        z5 = z14;
                                        z7 = false;
                                        i7 = i10;
                                    }
                                    final boolean z24 = z5;
                                    he heVar5 = heVar;
                                    int i34 = i7;
                                    final int i35 = i6;
                                    int i36 = size;
                                    ee eeVar = new ee() { // from class: pe
                                        /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                        /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                        /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                        /* JADX WARN: Type inference failed for: r3v13 */
                                        /* JADX WARN: Type inference failed for: r3v14, types: [boolean, byte, int] */
                                        /* JADX WARN: Type inference failed for: r3v15 */
                                        @Override // ee
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void r(he heVar6, int i37) {
                                            SparseArray[] sparseArrayArr2;
                                            ArrayList arrayList7;
                                            int i38;
                                            long j4;
                                            char c;
                                            ArrayList arrayList8;
                                            ?? r3;
                                            ArrayList arrayList9;
                                            long j5;
                                            int i39;
                                            int size3;
                                            int i40;
                                            long j6;
                                            TLRPC.Peer peer;
                                            long j7;
                                            boolean z25 = z24;
                                            int i41 = i35;
                                            long e = z25 ? z8c.h(i41).e() : j3;
                                            k47 k47Var7 = k47Var;
                                            TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                            long j8 = j;
                                            int i42 = i;
                                            boolean[] zArr2 = zArr;
                                            int i43 = i2;
                                            ArrayList arrayList10 = null;
                                            if (k47Var7 != null) {
                                                ArrayList arrayList11 = new ArrayList();
                                                ArrayList arrayList12 = new ArrayList();
                                                f47 f47Var2 = f47Var;
                                                if (f47Var2 != null) {
                                                    ArrayList arrayList13 = f47Var2.d;
                                                    c = 0;
                                                    int i44 = 0;
                                                    while (i44 < arrayList13.size()) {
                                                        k47 k47Var8 = (k47) arrayList13.get(i44);
                                                        int i45 = i41;
                                                        if (k47.c3(k47Var8.k)) {
                                                            arrayList11.add(k47Var8);
                                                        } else {
                                                            arrayList12.add(Integer.valueOf(k47Var8.e1()));
                                                            if (encryptedChat2 != null) {
                                                                j7 = e;
                                                                if (k47Var8.k.random_id != 0 && k47Var8.D != 10) {
                                                                    if (arrayList10 == null) {
                                                                        arrayList10 = new ArrayList();
                                                                    }
                                                                    ArrayList arrayList14 = arrayList10;
                                                                    arrayList14.add(Long.valueOf(k47Var8.k.random_id));
                                                                    arrayList10 = arrayList14;
                                                                }
                                                                i44++;
                                                                e = j7;
                                                                i41 = i45;
                                                            }
                                                        }
                                                        j7 = e;
                                                        i44++;
                                                        e = j7;
                                                        i41 = i45;
                                                    }
                                                    i38 = i41;
                                                    j4 = e;
                                                } else {
                                                    i38 = i41;
                                                    j4 = e;
                                                    c = 0;
                                                    if (k47.c3(k47Var7.k)) {
                                                        arrayList11.add(k47Var7);
                                                    } else {
                                                        arrayList12.add(Integer.valueOf(k47Var7.e1()));
                                                        if (encryptedChat2 != null && k47Var7.k.random_id != 0 && k47Var7.D != 10) {
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(Long.valueOf(k47Var7.k.random_id));
                                                            arrayList8 = arrayList15;
                                                            long j9 = (j8 == 0 && (peer = k47Var7.k.peer_id) != null && peer.chat_id == (-j8)) ? j8 : j4;
                                                            if (arrayList12.isEmpty()) {
                                                                r3 = c;
                                                                arrayList9 = arrayList11;
                                                                j5 = j9;
                                                                i39 = 1;
                                                                oc7.r1(i38).V(arrayList12, arrayList8, encryptedChat2, j5, i42, zArr2[c], i43);
                                                            } else {
                                                                r3 = c;
                                                                arrayList9 = arrayList11;
                                                                j5 = j9;
                                                                i39 = 1;
                                                            }
                                                            size3 = arrayList9.size();
                                                            i40 = r3;
                                                            while (i40 < size3) {
                                                                Object obj = arrayList9.get(i40);
                                                                i40++;
                                                                k47 k47Var9 = (k47) obj;
                                                                oc7 r1 = oc7.r1(i38);
                                                                ArrayList arrayList16 = new ArrayList();
                                                                arrayList16.add(Integer.valueOf(k47Var9.e1()));
                                                                if (j5 == 0 || !pg3.y(j5)) {
                                                                    j6 = 0;
                                                                } else {
                                                                    TLRPC.Chat L0 = r1.L0(Long.valueOf(-j5));
                                                                    j6 = sd2.T(L0) ? L0.id : 0L;
                                                                }
                                                                r1.p3(arrayList16, j5);
                                                                cf7 messagesStorage = r1.getMessagesStorage();
                                                                int P0 = k47Var9.P0();
                                                                messagesStorage.getClass();
                                                                vh6 vh6Var = new vh6(i39);
                                                                ArrayList arrayList17 = new ArrayList(i39);
                                                                arrayList17.add(Integer.valueOf(P0));
                                                                vh6Var.k(arrayList17, j5);
                                                                messagesStorage.H(new np6((Object) messagesStorage, (Object) vh6Var, (boolean) r3, (byte) 3));
                                                                r1.getMessagesStorage().M0(j5, arrayList16, true, true, k47.c5(k47Var9.k) ? 9 : r3, i42);
                                                                r1.getMessagesStorage().O1(j5, j6, arrayList16, null);
                                                                nm7 notificationCenter = r1.getNotificationCenter();
                                                                Long valueOf = Long.valueOf(j6);
                                                                Integer valueOf2 = Integer.valueOf((int) r3);
                                                                Object[] objArr = new Object[6];
                                                                objArr[r3] = arrayList16;
                                                                objArr[i39] = valueOf;
                                                                Boolean bool = Boolean.FALSE;
                                                                objArr[2] = bool;
                                                                objArr[3] = bool;
                                                                objArr[4] = bool;
                                                                objArr[5] = valueOf2;
                                                                notificationCenter.k(nm7.v, objArr);
                                                                if (!k47.c5(k47Var9.k) || k47Var9.a5()) {
                                                                    TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                    tL_deleteMessage.peer = r1.i1(k47.B0(k47Var9.k));
                                                                    TLRPC.Message message6 = k47Var9.k;
                                                                    tL_deleteMessage.receiver_id = r1.n1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                    tL_deleteMessage.id = k47Var9.P0();
                                                                    r1.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new nq0(r3));
                                                                } else {
                                                                    TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                    tL_deleteWelcomeMessage.peer = r1.i1(k47.B0(k47Var9.k));
                                                                    tL_deleteWelcomeMessage.id = k47Var9.P0();
                                                                    r1.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new nq0(r3));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                arrayList8 = arrayList10;
                                                if (j8 == 0) {
                                                }
                                                if (arrayList12.isEmpty()) {
                                                }
                                                size3 = arrayList9.size();
                                                i40 = r3;
                                                while (i40 < size3) {
                                                }
                                            } else {
                                                long j10 = e;
                                                int i46 = 0;
                                                int i47 = 1;
                                                while (i47 >= 0) {
                                                    ArrayList arrayList18 = new ArrayList();
                                                    int i48 = i46;
                                                    while (true) {
                                                        sparseArrayArr2 = sparseArrayArr;
                                                        if (i48 >= sparseArrayArr2[i47].size()) {
                                                            break;
                                                        }
                                                        arrayList18.add(Integer.valueOf(sparseArrayArr2[i47].keyAt(i48)));
                                                        i48++;
                                                    }
                                                    if (encryptedChat2 != null) {
                                                        arrayList7 = new ArrayList();
                                                        int i49 = i46;
                                                        while (i49 < sparseArrayArr2[i47].size()) {
                                                            k47 k47Var10 = (k47) sparseArrayArr2[i47].valueAt(i49);
                                                            int i50 = i46;
                                                            long j11 = k47Var10.k.random_id;
                                                            if (j11 != 0 && k47Var10.D != 10) {
                                                                arrayList7.add(Long.valueOf(j11));
                                                            }
                                                            i49++;
                                                            i46 = i50;
                                                        }
                                                    } else {
                                                        arrayList7 = null;
                                                    }
                                                    int i51 = i46;
                                                    oc7.r1(i41).V(arrayList18, arrayList7, encryptedChat2, (i47 != 1 || j8 == 0) ? j10 : j8, i42, zArr2[i51], i43);
                                                    sparseArrayArr2[i47].clear();
                                                    i47--;
                                                    i46 = i51;
                                                }
                                            }
                                            runnable.run();
                                        }
                                    };
                                    if (z24) {
                                        i9 = 1;
                                        i9 = 1;
                                        if (i36 == 1) {
                                            str2 = null;
                                            heVar2 = heVar5;
                                            heVar2.S = jb6.M0(2131743523, null);
                                        } else {
                                            heVar2 = heVar5;
                                            str2 = null;
                                            heVar2.S = jb6.a0(null, null, 2131743524, jb6.G(i36, "messages", new Object[0]));
                                        }
                                    } else {
                                        heVar2 = heVar5;
                                        i9 = 1;
                                        i9 = 1;
                                        str2 = null;
                                        if (i36 == 1) {
                                            heVar2.S = jb6.M0(2131751433, null);
                                        } else {
                                            heVar2.S = jb6.a0(null, null, 2131751456, jb6.G(i36, "messages", new Object[0]));
                                        }
                                    }
                                    if (!z24) {
                                        if (chat == null || !z7) {
                                            if (!z6 || z20 || i34 == i36) {
                                                if (chat == null || !chat.megagroup || z11) {
                                                    if (i36 == i9) {
                                                        heVar2.U = jb6.M0(2131754058, null);
                                                    } else {
                                                        heVar2.U = jb6.M0(2131754066, null);
                                                    }
                                                } else if (i36 == i9) {
                                                    heVar2.U = jb6.M0((k47Var == null || !k47.c3(k47Var.k)) ? 2131754057 : 2131754058, null);
                                                } else {
                                                    heVar2.U = jb6.M0(2131754065, null);
                                                }
                                            } else if (chat != null) {
                                                Object[] objArr = new Object[i9];
                                                objArr[0] = jb6.G(i34, "messages", new Object[0]);
                                                heVar2.U = jb6.a0("DeleteMessagesTextGroup", null, 2131751458, objArr);
                                            } else {
                                                String G = jb6.G(i34, "messages", new Object[0]);
                                                String k = m9c.k(user, i9);
                                                Object[] objArr2 = new Object[2];
                                                objArr2[0] = G;
                                                objArr2[i9] = k;
                                                heVar2.U = gm.S2(jb6.a0("DeleteMessagesText", null, 2131751459, objArr2));
                                            }
                                        } else if (z6 && i34 != i36) {
                                            Object[] objArr3 = new Object[i9];
                                            objArr3[0] = jb6.G(i34, "messages", new Object[0]);
                                            heVar2.U = jb6.a0(null, null, 2131751457, objArr3);
                                        } else if (i36 == i9) {
                                            heVar2.U = jb6.M0(2131754058, null);
                                        } else {
                                            heVar2.U = jb6.M0(2131754066, null);
                                        }
                                    } else if (i36 == i9) {
                                        heVar2.U = jb6.M0(2131754028, str2);
                                    } else {
                                        heVar2.U = jb6.M0(2131754029, str2);
                                    }
                                    if (k47Var != null) {
                                        z9 = (!k47Var.u3() || k47.l3(k47Var.k)) ? false : i9;
                                        if (z9) {
                                            long j4 = ((TLRPC.TL_messageMediaGiveaway) k47Var.k.media).until_date * 1000;
                                            String format = jb6.D0().t0().format(new Date(j4));
                                            z9 = System.currentTimeMillis() < j4 ? i9 : false;
                                            str3 = format;
                                        } else {
                                            str3 = null;
                                        }
                                    } else if (i36 == i9) {
                                        boolean z25 = false;
                                        str3 = null;
                                        for (int i37 = i9; i37 >= 0; i37--) {
                                            for (int i38 = 0; i38 < sparseArrayArr[i37].size(); i38++) {
                                                k47 k47Var7 = (k47) sparseArrayArr[i37].valueAt(i38);
                                                boolean z26 = (!k47Var7.u3() || k47.l3(k47Var7.k)) ? false : i9;
                                                if (z26) {
                                                    long j5 = ((TLRPC.TL_messageMediaGiveaway) k47Var7.k.media).until_date * 1000;
                                                    String format2 = jb6.D0().t0().format(new Date(j5));
                                                    z25 = System.currentTimeMillis() < j5 ? i9 : false;
                                                    str3 = format2;
                                                } else {
                                                    z25 = z26;
                                                }
                                            }
                                        }
                                        z9 = z25;
                                    } else {
                                        str3 = null;
                                        z9 = false;
                                    }
                                    TimeUnit timeUnit = TimeUnit.HOURS;
                                    if (z18) {
                                        int g = (int) oc7.r1(i35).l4.h.g(timeUnit);
                                        r12 = 0;
                                        heVar2.S = jb6.M0(2131744022, null);
                                        Object[] objArr4 = new Object[i9];
                                        objArr4[0] = Integer.valueOf(g);
                                        heVar2.U = gm.S2(jb6.a0(null, null, 2131744020, objArr4));
                                        AlertDialog$Builder alertDialog$Builder4 = alertDialog$Builder2;
                                        alertDialog$Builder4.j(jb6.M0(2131744021, null), eeVar);
                                        alertDialog$Builder = alertDialog$Builder4;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder2;
                                        r12 = 0;
                                        r12 = 0;
                                        r12 = 0;
                                        if (z17) {
                                            int g2 = (int) oc7.r1(i35).l4.h.g(timeUnit);
                                            heVar2.S = jb6.M0(2131744019, null);
                                            Object[] objArr5 = new Object[i9];
                                            objArr5[0] = Integer.valueOf(g2);
                                            heVar2.U = gm.S2(jb6.a0(null, null, 2131744018, objArr5));
                                            alertDialog$Builder5.j(jb6.M0(2131744021, null), eeVar);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        } else if (!z9 || z24) {
                                            alertDialog$Builder5.j(jb6.M0(z24 ? 2131746054 : 2131751535, null), eeVar);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        } else {
                                            heVar2.S = jb6.M0(2131753444, null);
                                            Object[] objArr6 = new Object[i9];
                                            objArr6[0] = str3;
                                            heVar2.U = gm.S2(jb6.a0(null, null, 2131753445, objArr6));
                                            alertDialog$Builder5.h(jb6.M0(2131751535, null), eeVar);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        }
                                    }
                                    alertDialog$Builder.g(jb6.M0(2131752542, r12), r12);
                                    final byte b4 = 0;
                                    heVar2.O = new DialogInterface.OnDismissListener() { // from class: qe
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            byte b22 = b4;
                                            ho1 ho1Var32 = ho1Var;
                                            switch (b22) {
                                                case 0:
                                                    if (ho1Var32 != null) {
                                                        ho1Var32.run();
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    if (ho1Var32 != null) {
                                                        ho1Var32.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    ho1Var32.run();
                                                    break;
                                            }
                                        }
                                    };
                                    dVar.showDialog(heVar2);
                                    TextView textView = (TextView) heVar2.c(-1);
                                    if (textView != null) {
                                        anb.X(textView, cmb.p7, r12);
                                    }
                                    TextView textView2 = (TextView) heVar2.c(-3);
                                    if (textView2 != null) {
                                        heVar2.u0.setPadding(gm.L(12.0f), gm.L(0.0f), gm.L(8.0f), gm.L(12.0f));
                                        ((ViewGroup.MarginLayoutParams) heVar2.u0.getLayoutParams()).topMargin = gm.L(-8.0f);
                                        anb.X(textView2, cmb.p7, null);
                                    }
                                }
                            }

                            public static he z(LaunchActivity launchActivity) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                                String M0 = jb6.M0(2131748474, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131748475, null);
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131748477, null), new hf(launchActivity, (byte) 1));
                                return heVar;
                            }
                        }
