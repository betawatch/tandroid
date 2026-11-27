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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class jj {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static id A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747031, null));
        id idVar = alertDialog$Builder.a;
        idVar.U = S2;
        int i = aob.L5;
        alertDialog$Builder.l(R.raw.permission_request_location, 72, aob.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(ob6.M0(2131747027, null), new oe(activity, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
        return idVar;
    }

    public static id B(Activity activity, boolean z, TLRPC.User user, df7 df7Var, vnb vnbVar) {
        int[] iArr = new int[1];
        String[] strArr = {ob6.M0(2131745345, null), ob6.M0(2131745344, null), ob6.M0(2131745343, null), ob6.M0(2131745342, null)};
        LinearLayout m = bs2.m(activity, 1);
        m.setPadding(0, 0, 0, hl.L(4.0f));
        TextView textView = new TextView(activity);
        if (z) {
            textView.setText(ob6.M0(2131748598, null));
        } else if (user != null) {
            textView.setText(ob6.a0(null, null, 2131748595, lbc.k(user, true)));
        } else {
            textView.setText(ob6.M0(2131748596, null));
        }
        yob.X(textView, aob.j5, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((ob6.a0 ? 5 : 3) | 48);
        m.addView(textView, tre.t(-2, -2, (ob6.a0 ? 5 : 3) | 48, 24, z ? 4 : 0, 24, 8));
        int i = 0;
        while (i < 4) {
            j29 j29Var = new j29(activity, vnbVar);
            j29Var.d = (byte) 42;
            j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            j29Var.setTag(Integer.valueOf(i));
            a(j29Var, aob.g7, aob.E5, vnbVar);
            j29Var.b(strArr[i], iArr[0] == i);
            m.addView(j29Var);
            j29Var.setOnClickListener(new nf(iArr, m));
            i++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        id idVar = alertDialog$Builder.a;
        if (z) {
            idVar.S = ob6.M0(2131748597, null);
        } else {
            int i2 = aob.L5;
            int f = vnbVar != null ? vnbVar.f(i2) : aob.w0(null, i2, false);
            idVar.c0 = new oea(activity, 0);
            idVar.d0 = f;
            idVar.e0 = -1;
            if (vnbVar == null) {
                alertDialog$Builder.m(i2, null);
            }
        }
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131745187, null), new o(iArr, df7Var, (byte) 7));
        alertDialog$Builder.h(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static nx0 C(final long j, final long j2, final vnb vnbVar, final e eVar) {
        if (eVar.getParentActivity() == null) {
            return null;
        }
        nx0 i = ik8.i(eVar.getParentActivity(), false, 1, vnbVar);
        i.P = ob6.M0(2131747651, null);
        i.Q = true;
        CharSequence[] charSequenceArr = {ob6.a0("MuteFor", null, 2131748066, ob6.G(1, "Hours", new Object[0])), ob6.a0("MuteFor", null, 2131748066, ob6.G(8, "Hours", new Object[0])), ob6.a0("MuteFor", null, 2131748066, ob6.G(2, "Days", new Object[0])), ob6.M0(2131748067, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: tg
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
                ip7.n(yac.t0).T(j, i3, j2);
                e eVar2 = eVar;
                if (d31.a(eVar2)) {
                    d31.z(eVar2, i3, 0, vnbVar).j();
                }
            }
        };
        i.M = charSequenceArr;
        i.L = onClickListener;
        return i;
    }

    public static void D(Context context, vnb vnbVar, hj hjVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        int i = aob.j5;
        if (vnbVar != null) {
            w0 = vnbVar.f(i);
            w02 = vnbVar.f(aob.h5);
            vnbVar.f(aob.Aj);
            vnbVar.f(aob.Ej);
            vnbVar.f(aob.E8);
            vnbVar.f(aob.G8);
            vnbVar.f(aob.i6);
            w03 = vnbVar.f(aob.Ji);
            w04 = vnbVar.f(aob.Fi);
            w05 = vnbVar.f(aob.Hi);
        } else {
            w0 = aob.w0(null, i, false);
            w02 = aob.w0(null, aob.h5, false);
            aob.w0(null, aob.Aj, false);
            aob.w0(null, aob.Ej, false);
            aob.w0(null, aob.E8, false);
            aob.w0(null, aob.G8, false);
            aob.w0(null, aob.i6, false);
            w03 = aob.w0(null, aob.Ji, false);
            w04 = aob.w0(null, aob.Fi, false);
            w05 = aob.w0(null, aob.Hi, false);
        }
        int i2 = w04;
        int i3 = w05;
        z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        int[] iArr = {30, 60, jn7.E1, jn7.J2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        wi wiVar = new wi(context, vnbVar, iArr);
        wiVar.setMinValue(0);
        wiVar.setMaxValue(20);
        wiVar.setTextColor(w0);
        wiVar.setValue(0);
        byte b = 1;
        wiVar.setFormatter(new pg(iArr, b));
        ri riVar = new ri(context, wiVar, b);
        riVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        riVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131748064, null));
        textView.setTextColor(w0);
        bs2.t(textView, 1, 20.0f);
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        riVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        xb xbVar = new xb(context, (byte) 6);
        linearLayout.addView(wiVar, tre.l(1.0f, 0, jn7.s4));
        wiVar.setOnValueChangedListener(new bg((byte) 18));
        xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(w03);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(hl.o());
        int L = hl.L(8.0f);
        xbVar.setBackgroundDrawable(aob.i0(L, L, L, L, i2, i3, i3));
        xbVar.setText(ob6.M0(2131753859, null));
        riVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new cg((Object) iArr, (Object) wiVar, (Object) hjVar, (Object) z8dVar, (byte) 2));
        nx0 nx0Var = (nx0) z8dVar.b;
        nx0Var.O = riVar;
        nx0Var.show();
        nx0Var.s0(w02);
        nx0Var.K(w02);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        HashMap hashMap = new HashMap();
        int i = aob.L5;
        hashMap.put("info1", Integer.valueOf(aob.w0(null, i, false)));
        hashMap.put("info2", Integer.valueOf(aob.w0(null, i, false)));
        alertDialog$Builder.l(R.raw.not_available, 52, aob.w0(null, i, false), hashMap);
        alertDialog$Builder.m(i, null);
        idVar.X = true;
        alertDialog$Builder.j(ob6.M0(2131752006, null), null);
        idVar.U = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static id F(Activity activity, long j, final long j2, int i, final Runnable runnable, vnb vnbVar) {
        int i2;
        int i3;
        char c;
        CharSequence[] charSequenceArr;
        final long j3 = j;
        final int i4 = i;
        final SharedPreferences sharedPreferences = uc7.s1(yac.t0).W3;
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
            charSequenceArr = new String[]{ob6.M0(2131747607, null), ob6.M0(2131747609, null), ob6.M0(2131747608, null), ob6.M0(2131747610, null), ob6.M0(2131747606, null)};
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
                charSequenceArr2[0] = ob6.M0(2131747609, null);
                charSequenceArr2[1] = ob6.M0(2131747608, null);
                charSequenceArr2[c] = ob6.M0(2131747610, null);
                charSequenceArr2[3] = ob6.M0(2131747606, null);
                charSequenceArr = charSequenceArr2;
            }
            c = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = ob6.M0(2131747609, null);
            charSequenceArr22[1] = ob6.M0(2131747608, null);
            charSequenceArr22[c] = ob6.M0(2131747610, null);
            charSequenceArr22[3] = ob6.M0(2131747606, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout m = bs2.m(activity, i2);
        int i7 = i3;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i7, vnbVar, activity);
        int i8 = i7;
        while (i8 < charSequenceArr.length) {
            j29 j29Var = new j29(activity, vnbVar);
            j29Var.setPadding(hl.L(4.0f), i7, hl.L(4.0f), i7);
            j29Var.setTag(Integer.valueOf(i8));
            a(j29Var, aob.g7, aob.E5, vnbVar);
            j29Var.b(charSequenceArr[i8], iArr[i7] == i8 ? 1 : i7);
            m.addView(j29Var);
            j29Var.setOnClickListener(new View.OnClickListener() { // from class: yf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i9 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
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
                        ip7.n(yac.t0).f(j4, j2);
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
                        ip7.n(yac.t0).g(i13);
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
        String M0 = ob6.M0(2131747633, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static void G(int i, long j, x53 x53Var, Context context, TLRPC.Photo photo) {
        if (context != null) {
            ng ngVar = new ng(i, j, x53Var, context, photo);
            nx0 nx0Var = new nx0(1, (vnb) x53Var, context, true);
            nx0Var.J();
            nx0Var.P = ob6.M0(2131745939, null);
            nx0Var.Q = true;
            CharSequence[] charSequenceArr = {ob6.M0(2131745948, null), ob6.M0(2131745954, null), ob6.M0(2131745947, null), ob6.M0(2131745956, null), ob6.M0(2131745953, null), ob6.M0(2131745951, null), ob6.M0(2131745950, null), ob6.M0(2131745952, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            og ogVar = new og(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, context, x53Var, ngVar, (byte) 0);
            nx0Var.M = charSequenceArr;
            nx0Var.N = iArr;
            nx0Var.L = ogVar;
            nx0Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r2v45, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o97] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static z8d H(final Context context, final long j, long j2, int i, boolean z, final hj hjVar, Runnable runnable, gj gjVar, vnb vnbVar) {
        ?? r22;
        ai aiVar;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        boolean[] zArr;
        hq7 hq7Var;
        long j3;
        int i2;
        s7 s7Var;
        boolean[] zArr2;
        int[] iArr;
        String[] strArr;
        TextView textView;
        Calendar calendar;
        boolean[] zArr3;
        int i3;
        int i4;
        ai aiVar2;
        String[] strArr2;
        int[] iArr2;
        s7 s7Var2;
        TextView textView2;
        TextView textView3;
        ?? r8;
        nx0 nx0Var;
        final s7 s7Var3;
        int i5;
        e29 e29Var;
        TLRPC.User X1;
        TLRPC.UserStatus userStatus;
        boolean z2;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i};
        long e = yac.h(yac.t0).e();
        final z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        hq7 hq7Var2 = new hq7(context, vnbVar);
        int i6 = gjVar.a;
        int i7 = gjVar.c;
        int i8 = gjVar.b;
        hq7Var2.setTextColor(i6);
        hq7Var2.setTextOffset(hl.L(10.0f));
        hq7Var2.setItemCount(5);
        final di diVar = new di(context, vnbVar);
        diVar.setWrapSelectorWheel(true);
        diVar.setAllItemsCount(24);
        diVar.setItemCount(5);
        diVar.setTextColor(i6);
        diVar.setTextOffset(-hl.L(10.0f));
        final ei eiVar = new ei(context, vnbVar);
        eiVar.setWrapSelectorWheel(true);
        eiVar.setAllItemsCount(60);
        eiVar.setItemCount(5);
        eiVar.setTextColor(i6);
        eiVar.setTextOffset(-hl.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        ai aiVar3 = new ai(context, hq7Var2, diVar, eiVar, (byte) 1);
        aiVar3.setClipToPadding(false);
        aiVar3.setClipChildren(false);
        aiVar3.setOrientation(1);
        frameLayout2.addView(aiVar3, tre.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        aiVar3.addView(frameLayout4, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView4 = new TextView(context);
        if (j == e) {
            r22 = 0;
            textView4.setText(ob6.M0(2131745242, null));
        } else {
            r22 = 0;
            textView4.setText(ob6.M0(2131745587, null));
        }
        textView4.setTextColor(i6);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(hl.o());
        frameLayout4.addView(textView4, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView4.setOnTouchListener(new q8((byte) 12));
        boolean[] zArr4 = new boolean[1];
        zArr4[r22] = true;
        if (!wf3.D(j) || j == e || (X1 = uc7.s1(yac.t0).X1(Long.valueOf(j))) == null || X1.bot || (userStatus = X1.status) == null || userStatus.expires <= 0) {
            aiVar = aiVar3;
            context2 = context;
            viewGroup = frameLayout4;
            frameLayout = frameLayout3;
            zArr = zArr4;
            hq7Var = hq7Var2;
            j3 = e;
            i2 = -1;
            s7Var = null;
        } else {
            String k = lbc.k(X1, true);
            if (k.length() > 10) {
                z2 = r22;
                k = k.substring(z2 ? 1 : 0, 10).concat("…");
            } else {
                z2 = r22;
            }
            String str = k;
            frameLayout = frameLayout3;
            zArr = zArr4;
            aiVar = aiVar3;
            hq7Var = hq7Var2;
            j3 = e;
            i2 = -1;
            s7 s7Var4 = new s7(context, null, 0, gjVar.a, false, vnbVar);
            context2 = context;
            s7Var4.setLongClickEnabled(z2);
            s7Var4.setSubMenuOpenSide(2);
            s7Var4.setIcon(R.drawable.ic_ab_other);
            s7Var4.setBackground(aob.f0(i7, 1, -1));
            viewGroup = frameLayout4;
            viewGroup.addView(s7Var4, tre.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            s7Var4.g(1, ob6.a0(null, null, 2131745578, str));
            s7Var4.setContentDescription(ob6.M0(2131754834, null));
            s7Var = s7Var4;
        }
        byte b = 13;
        if (s7Var != null) {
            s7Var.setOnClickListener(new t(s7Var, gjVar, b));
            zArr2 = zArr;
            s7Var.setDelegate(new ie((Object) hjVar, (Object) zArr2, (Object) z8dVar, (byte) 0));
        } else {
            zArr2 = zArr;
        }
        e29 e29Var2 = new e29(context2);
        final b29 b29Var = new b29(R.raw.notify_toggle, hl.L(24.0f), hl.L(24.0f), true, null);
        b29Var.E(true);
        b29Var.h = true;
        b29Var.start();
        b29Var.H(40);
        b29Var.K(40);
        e29Var2.setScaleType(ImageView.ScaleType.CENTER);
        e29Var2.setAnimation(b29Var);
        e29Var2.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
        e29Var2.setBackground(aob.f0(i7, 1, i2));
        viewGroup.addView(e29Var2, tre.d(40, 40.0f, 53, 0.0f, 8.0f, (s7Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ai aiVar4 = aiVar;
        aiVar4.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final xb xbVar = new xb(context2, (byte) 1);
        linearLayout.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
        hq7Var.setMinValue(0);
        hq7Var.setMaxValue(365);
        hq7Var.setWrapSelectorWheel(false);
        hq7Var.setFormatter(new e((byte) 18));
        final hq7 hq7Var3 = hq7Var;
        final long j4 = j3;
        fq7 fq7Var = new fq7() { // from class: xe
            @Override // fq7
            public final void i(hq7 hq7Var4, int i9) {
                jj.g(xb.this, null, 0L, 0L, j4 == j ? 1 : 0, hq7Var3, diVar, eiVar);
            }
        };
        hq7Var3.setOnValueChangedListener(fq7Var);
        diVar.setMinValue(0);
        diVar.setMaxValue(23);
        linearLayout.addView(diVar, tre.l(0.2f, 0, jn7.s4));
        diVar.setFormatter(new e((byte) 20));
        diVar.setOnValueChangedListener(fq7Var);
        eiVar.setMinValue(0);
        eiVar.setMaxValue(59);
        eiVar.setValue(0);
        eiVar.setFormatter(new e((byte) 21));
        linearLayout.addView(eiVar, tre.l(0.3f, 0, jn7.s4));
        eiVar.setOnValueChangedListener(fq7Var);
        if (j2 > 0 && j2 != 2147483646) {
            long j5 = 1000 * j2;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j5 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j5);
            if (timeInMillis >= 0) {
                eiVar.setValue(calendar2.get(12));
                diVar.setValue(calendar2.get(11));
                hq7Var3 = hq7Var3;
                hq7Var3.setValue(timeInMillis);
            } else {
                hq7Var3 = hq7Var3;
            }
        }
        final boolean[] zArr5 = {true};
        g(xbVar, null, 0L, 0L, j4 == j ? 1 : 0, hq7Var3, diVar, eiVar);
        if (ConnectionsManager.getInstance(yac.t0).isTestBackend()) {
            iArr = new int[]{0, 60, jn7.W4, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            strArr = new String[]{ob6.M0(2131748254, null), "Every minute", "Every 5 minutes", ob6.M0(2131748256, null), ob6.M0(2131748253, null), ob6.M0(2131748257, null), ob6.M0(2131748255, null), ob6.M0(2131748259, null), ob6.M0(2131748258, null), ob6.M0(2131748252, null)};
            textView = null;
        } else {
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            textView = null;
            strArr = new String[]{ob6.M0(2131748254, null), ob6.M0(2131748256, null), ob6.M0(2131748253, null), ob6.M0(2131748257, null), ob6.M0(2131748255, null), ob6.M0(2131748259, null), ob6.M0(2131748258, null), ob6.M0(2131748252, null)};
        }
        if (z) {
            calendar = calendar2;
            zArr3 = zArr2;
            i3 = i8;
            i4 = 0;
            aiVar2 = aiVar4;
            strArr2 = strArr;
            iArr2 = iArr;
            s7Var2 = s7Var;
            textView2 = textView;
            textView3 = textView2;
            r8 = textView3;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            int v = aob.v(i8, aob.p1(0.075f, i6));
            String[] strArr3 = strArr;
            int p1 = aob.p1(0.1f, i6);
            zArr3 = zArr2;
            textView3 = new TextView(context2);
            int[] iArr4 = iArr;
            calendar = calendar2;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(i6);
            i4 = 0;
            textView3.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
            int L = hl.L(14.0f);
            int v2 = aob.v(v, p1);
            textView3.setBackground(aob.i0(L, L, L, L, v, v2, v2));
            textView3.setGravity(17);
            i3 = i8;
            strArr2 = strArr3;
            o97 o97Var = new o97(iArr4, iArr3, strArr2, textView3, (byte) 6);
            iArr2 = iArr4;
            o97Var.run();
            frameLayout5.addView(textView3, tre.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ?? r2 = aiVar4;
            r2.addView(frameLayout5, tre.o(-1, -2));
            s7Var2 = s7Var;
            r8 = o97Var;
            textView2 = frameLayout5;
            aiVar2 = r2;
        }
        xbVar.setPadding(hl.L(34.0f), i4, hl.L(34.0f), i4);
        xbVar.setGravity(17);
        xbVar.setTextColor(gjVar.g);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(hl.o());
        int i9 = gjVar.h;
        float[] fArr = new float[1];
        fArr[i4] = 24.0f;
        xbVar.setBackground(rnb.e(i9, fArr));
        aiVar2.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
        int i10 = i3;
        final Calendar calendar3 = calendar;
        final boolean[] zArr6 = zArr3;
        xbVar.setOnClickListener(new View.OnClickListener() { // from class: tf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr5[0] = false;
                int i11 = j4 == j ? 1 : 0;
                hq7 hq7Var4 = hq7Var3;
                di diVar2 = diVar;
                ei eiVar2 = eiVar;
                boolean g = jj.g(null, null, 0L, 0L, i11, hq7Var4, diVar2, eiVar2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, hq7Var4.getValue());
                calendar4.set(11, diVar2.getValue());
                calendar4.set(12, eiVar2.getValue());
                if (g) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                hjVar.y((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], zArr6[0]);
                ((nx0) z8dVar.b).y0.run();
            }
        });
        nx0 nx0Var2 = (nx0) z8dVar.b;
        nx0Var2.O = frameLayout2;
        nx0Var2.show();
        nx0Var2.setOnDismissListener(new wf(runnable, zArr5));
        nx0Var2.s0(i10);
        nx0Var2.K(i10);
        if (textView3 != null) {
            String[] strArr4 = strArr2;
            s7Var3 = s7Var2;
            i5 = 1;
            e29Var = e29Var2;
            nx0Var = nx0Var2;
            textView3.setOnClickListener(new yg(frameLayout, vnbVar, nx0Var, (FrameLayout) textView2, iArr2, strArr4, iArr3, (o97) r8));
        } else {
            nx0Var = nx0Var2;
            s7Var3 = s7Var2;
            i5 = 1;
            e29Var = e29Var2;
        }
        final kg5[] kg5VarArr = new kg5[i5];
        final nx0 nx0Var3 = nx0Var;
        final boolean[] zArr7 = zArr3;
        e29Var.setOnClickListener(new View.OnClickListener() { // from class: wd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String M0;
                boolean[] zArr8 = zArr7;
                byte b2 = 0;
                boolean z3 = zArr8[0];
                zArr8[0] = !z3;
                b29 b29Var2 = b29Var;
                int i11 = b29Var2.b0;
                if (z3) {
                    if (i11 < 40) {
                        b29Var2.H(40);
                    }
                    b29Var2.K(80);
                    b29Var2.start();
                } else {
                    if (i11 >= 40) {
                        b29Var2.H(0);
                    }
                    b29Var2.K(40);
                    b29Var2.start();
                }
                kg5[] kg5VarArr2 = kg5VarArr;
                kg5 kg5Var = kg5VarArr2[0];
                if (kg5Var != null) {
                    kg5Var.f(true);
                    kg5VarArr2[0] = null;
                }
                uc7 s1 = uc7.s1(yac.t0);
                long j6 = j;
                TLRPC.User X12 = s1.X1(Long.valueOf(j6));
                TLRPC.Chat M02 = uc7.s1(yac.t0).M0(Long.valueOf(-j6));
                kg5 kg5Var2 = new kg5(context, 3);
                kg5VarArr2[0] = kg5Var2;
                kg5Var2.r();
                kg5Var2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                kg5Var2.q(20.0f);
                kg5Var2.s(hl.L(12.0f), hl.L(4.0f), aob.p1(0.25f, -16777216));
                if (xc2.V(M02)) {
                    M0 = ob6.M0(zArr8[0] ? 2131745582 : 2131745586, null);
                } else if (M02 != null || X12 == null) {
                    M0 = ob6.M0(zArr8[0] ? 2131745580 : 2131745584, null);
                } else if (j6 == j4) {
                    M0 = ob6.M0(zArr8[0] ? 2131745579 : 2131745583, null);
                } else {
                    M0 = ob6.a0(null, null, zArr8[0] ? 2131745581 : 2131745585, lbc.l(X12));
                }
                kg5Var2.t(M0);
                kg5Var2.d = 5000L;
                kg5Var2.n(1.0f, -((s7Var3 != null ? 42 : -8) + 20));
                kg5Var2.r0 = new ug(kg5Var2, b2);
                nx0 nx0Var4 = nx0Var3;
                nx0Var4.b.setClipToPadding(false);
                nx0Var4.b.setClipChildren(false);
                nx0Var4.b.addView(kg5Var2, tre.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                kg5Var2.v();
            }
        });
        return z8dVar;
    }

    public static void I(Context context, long j, hj hjVar) {
        H(context, j, -1L, 0, false, hjVar, null, new gj(null), null);
    }

    public static void J(Context context, long j, hj hjVar, vnb vnbVar) {
        H(context, j, -1L, 0, false, hjVar, null, new gj(vnbVar), vnbVar);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, vnb vnbVar) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        if (str == null) {
            str = ob6.M0(R.string.AppName, null);
        }
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        if (str3 == null) {
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(str3, new td(runnable, (byte) 3));
        return alertDialog$Builder;
    }

    public static id M(Context context, vnb vnbVar, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = charSequence;
        alertDialog$Builder.j(str2, new td(runnable, (byte) 4));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static n8 N(e eVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f, float f2) {
        if (view == null) {
            return null;
        }
        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        n8Var.e = true;
        n8Var.c = (short) 220;
        n8Var.setOutsideTouchable(true);
        n8Var.setClippingEnabled(true);
        n8Var.setAnimationStyle(R.style.PopupContextAnimation);
        n8Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
        n8Var.setInputMethodMode(2);
        n8Var.getContentView().setFocusableInTouchMode(true);
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
        n8Var.showAtLocation(view.getRootView(), 0, (int) ((f3 + f) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f4 + f2) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        n8Var.b();
        return n8Var;
    }

    public static void O(Context context, e eVar, String str, String str2, String str3, String str4, int i, String str5, vnb vnbVar, hf7 hf7Var) {
        Activity W = hl.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        id[] idVarArr = new id[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        ij ijVar = new ij(context);
        ijVar.setTextSize(1, 16.0f);
        int i2 = aob.j5;
        yob.X(ijVar, i2, vnbVar);
        yob.D(ijVar, aob.Oi, vnbVar);
        ijVar.setHint(str3);
        ijVar.setFocusable(true);
        ijVar.setInputType(147457);
        ijVar.setImeOptions(6);
        ijVar.setMaxLines(10);
        ijVar.setPadding(hl.L(16.0f), hl.L(11.0f), hl.L(16.0f), hl.L(11.0f));
        ijVar.setCursorWidth(1.5f);
        ijVar.A(aob.q6, vnbVar);
        if (str4 != null) {
            ijVar.setText(str4);
        }
        ijVar.setOnEditorActionListener(new af(ijVar, i, hf7Var, idVarArr, currentFocus, (byte) 0));
        ijVar.addTextChangedListener(new gi(i, ijVar));
        ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i2, vnbVar)));
        uob K = yob.K(0.06f, i2);
        ijVar.setBackground(b0);
        yob.j(ijVar, b0, K, null, vnbVar);
        LinearLayout j = uh9.j(context, 1);
        j.addView(ijVar, tre.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(j);
        idVar.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
        byte b = 0;
        alertDialog$Builder.j(str5, new bf(ijVar, i, hf7Var, b));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new e((byte) 19));
        idVarArr[0] = idVar;
        if (eVar != null) {
            hl.U2(W, eVar.getClassGuid());
        }
        id idVar2 = idVarArr[0];
        idVar2.k0 = false;
        idVar2.setOnDismissListener(new cf(ijVar, eVar, W, b));
        idVarArr[0].setOnShowListener(new df(ijVar, b));
        idVarArr[0].show();
        ijVar.setSelection(ijVar.getText().length());
    }

    public static void P(Context context, e eVar, vnb vnbVar, hf7 hf7Var) {
        O(context, eVar, ob6.M0(2131744456, null), ob6.M0(2131744463, null), ob6.M0(2131744437, null), null, 12, ob6.M0(2131751718, null), vnbVar, hf7Var);
    }

    public static z8d Q(Context context, long j, final hj hjVar, vnb vnbVar, int i) {
        int i2;
        int i3;
        int w0 = aob.w0(null, aob.j5, false);
        int w02 = aob.w0(null, aob.h5, false);
        aob.w0(null, aob.Aj, false);
        aob.w0(null, aob.Ej, false);
        aob.w0(null, aob.E8, false);
        aob.w0(null, aob.G8, false);
        int i4 = aob.i6;
        aob.w0(null, i4, false);
        int w03 = aob.w0(null, aob.Ji, false);
        int w04 = aob.w0(null, aob.Fi, false);
        aob.w0(null, aob.Hi, false);
        if (context == null) {
            return null;
        }
        final z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        final hq7 hq7Var = new hq7(context, vnbVar);
        hq7Var.setTextColor(w0);
        hq7Var.setTextOffset(hl.L(10.0f));
        hq7Var.setItemCount(5);
        final bj bjVar = new bj(context, vnbVar);
        bjVar.setWrapSelectorWheel(true);
        bjVar.setAllItemsCount(24);
        bjVar.setItemCount(5);
        bjVar.setTextColor(w0);
        bjVar.setTextOffset(-hl.L(10.0f));
        final cj cjVar = new cj(context, vnbVar);
        cjVar.setWrapSelectorWheel(true);
        cjVar.setAllItemsCount(60);
        cjVar.setItemCount(5);
        cjVar.setTextColor(w0);
        cjVar.setTextOffset(-hl.L(34.0f));
        ai aiVar = new ai(context, hq7Var, bjVar, cjVar, (byte) 7);
        aiVar.setOrientation(1);
        LinearLayout j2 = uh9.j(context, 1);
        aiVar.addView(j2, tre.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(i == 1 ? 2131744027 : 2131746822, null));
        textView.setTextColor(w0);
        bs2.t(textView, 1, 20.0f);
        j2.addView(textView, tre.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new q8((byte) 2));
        TextView textView2 = new TextView(context);
        yob.X(textView2, aob.z6, vnbVar);
        bs2.r(14.0f, 1, 2131746821, textView2, null);
        j2.addView(textView2, tre.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new q8((byte) 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        aiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i5 = calendar.get(1);
        os2 os2Var = uc7.s1(yac.t0).k4.i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long g = os2Var.g(timeUnit) << 1;
        final long g2 = uc7.s1(yac.t0).k4.j.g(timeUnit) - 86400;
        final xb xbVar = new xb(context, (byte) 8);
        linearLayout.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
        hq7Var.setMinValue(0);
        hq7Var.setMaxValue(365);
        hq7Var.setWrapSelectorWheel(false);
        hq7Var.setFormatter(new yd(i5, (byte) 1));
        final int i6 = i == 1 ? 5 : 3;
        fq7 fq7Var = new fq7() { // from class: uf
            @Override // fq7
            public final void i(hq7 hq7Var2, int i7) {
                jj.g(xb.this, null, g, g2, i6, hq7Var, bjVar, cjVar);
            }
        };
        hq7Var.setOnValueChangedListener(fq7Var);
        bjVar.setMinValue(0);
        bjVar.setMaxValue(23);
        linearLayout.addView(bjVar, tre.l(0.2f, 0, jn7.s4));
        bjVar.setFormatter(new e((byte) 23));
        bjVar.setOnValueChangedListener(fq7Var);
        cjVar.setMinValue(0);
        cjVar.setMaxValue(59);
        cjVar.setValue(0);
        cjVar.setFormatter(new e((byte) 24));
        linearLayout.addView(cjVar, tre.l(0.3f, 0, jn7.s4));
        cjVar.setOnValueChangedListener(fq7Var);
        if (j <= 0 || j == 2147483646) {
            i2 = w02;
            i3 = i4;
        } else {
            long j3 = 1000 * j;
            i2 = w02;
            i3 = i4;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            if (timeInMillis >= 0) {
                cjVar.setValue(calendar.get(12));
                bjVar.setValue(calendar.get(11));
                hq7Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(xbVar, null, g, g2, i6, hq7Var, bjVar, cjVar);
        xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(w03);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(hl.o());
        xbVar.setBackground(rnb.e(w04, 8.0f));
        aiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 4));
        final int i7 = i6;
        xbVar.setOnClickListener(new View.OnClickListener() { // from class: vf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j4 = g;
                long j5 = g2;
                byte b = i7;
                hq7 hq7Var2 = hq7Var;
                bj bjVar2 = bjVar;
                cj cjVar2 = cjVar;
                boolean g3 = jj.g(null, null, j4, j5, b, hq7Var2, bjVar2, cjVar2);
                long epochMilli = LocalDate.now().plusDays(hq7Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, bjVar2.getValue());
                calendar2.set(12, cjVar2.getValue());
                if (g3) {
                    calendar2.set(13, 0);
                }
                hjVar.y((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((nx0) z8dVar.b).y0.run();
            }
        });
        iye.b(xbVar, 0.02f, 1.2f);
        xb xbVar2 = new xb(context, (byte) 9);
        xbVar2.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        xbVar2.setGravity(17);
        xbVar2.setText(ob6.M0(i == 1 ? 2131748225 : 2131746819, null));
        xbVar2.setTextColor(w04);
        xbVar2.setTextSize(1, 14.0f);
        int L = hl.L(8.0f);
        int i8 = aob.d6;
        int w05 = aob.w0(null, i8, false);
        int w06 = aob.w0(null, i3, false);
        hf0 i0 = aob.i0(L, L, L, L, w05, w06, w06);
        uob M = yob.M(i8);
        uob M2 = yob.M(i3);
        xbVar2.setBackground(i0);
        yob.j(xbVar2, i0, M, M2, null);
        aiVar.addView(xbVar2, tre.t(-1, 48, 83, 16, 0, 16, 16));
        xbVar2.setOnClickListener(new c0(zArr, hjVar, z8dVar, (byte) 3));
        iye.b(xbVar2, 0.02f, 1.2f);
        nx0 nx0Var = (nx0) z8dVar.b;
        nx0Var.O = aiVar;
        nx0Var.show();
        nx0Var.setOnDismissListener(new h5(zArr));
        nx0Var.s0(i2);
        nx0Var.K(i2);
        return z8dVar;
    }

    public static id R(e eVar, vnb vnbVar) {
        if (eVar == null || eVar.getParentActivity() == null) {
            return null;
        }
        p66 p66Var = new p66(eVar.getParentActivity(), eVar.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(ob6.M0(2131753978, null).replace("\n", "<br>")));
        byte b = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new vi(uRLSpan.getURL(), eVar), spanStart, spanEnd, 0);
        }
        p66Var.setText(spannableString);
        p66Var.setTextSize(1, 16.0f);
        yob.G(p66Var, aob.k5, vnbVar);
        yob.C(p66Var, aob.l5, vnbVar);
        p66Var.setPadding(hl.L(23.0f), 0, hl.L(23.0f), 0);
        p66Var.setMovementMethod(new dl(b));
        yob.X(p66Var, aob.j5, vnbVar);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, eVar.getParentActivity());
        alertDialog$Builder.n(p66Var);
        String M0 = ob6.M0(2131753979, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131753977, null), new i6(eVar, (byte) 3));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, vnb vnbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        alertDialog$Builder.a.S = ob6.M0(2131748341, null);
        hq7 hq7Var = new hq7(context, null);
        hq7Var.setMinValue(0);
        hq7Var.setMaxValue(20);
        int i = encryptedChat.ttl;
        if (i > 0 && i < 16) {
            hq7Var.setValue(i);
        } else if (i == 30) {
            hq7Var.setValue(16);
        } else if (i == 60) {
            hq7Var.setValue(17);
        } else if (i == 3600) {
            hq7Var.setValue(18);
        } else if (i == 86400) {
            hq7Var.setValue(19);
        } else if (i == 604800) {
            hq7Var.setValue(20);
        } else if (i == 0) {
            hq7Var.setValue(0);
        }
        hq7Var.setFormatter(new bg((byte) 8));
        alertDialog$Builder.n(hq7Var);
        alertDialog$Builder.g(ob6.M0(2131751319, null), new o(encryptedChat, hq7Var, (byte) 9));
        return alertDialog$Builder;
    }

    public static void T(e eVar, int i, znb znbVar, ynb ynbVar) {
        int i2;
        byte b;
        String str;
        if (eVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = eVar.getParentActivity();
        ij ijVar = new ij(parentActivity);
        String str2 = null;
        ijVar.setBackground(null);
        yob.F(ijVar, aob.u5, aob.v5, aob.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = ob6.M0(2131748012, null);
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131751718, null), new vr9((byte) 16));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            textView.setText(hl.S2(ob6.M0(2131751079, null)));
        } else {
            textView.setText(ob6.M0(2131751080, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(hl.L(23.0f), hl.L(12.0f), hl.L(23.0f), hl.L(6.0f));
        int i3 = aob.j5;
        yob.X(textView, i3, null);
        linearLayout.addView(textView, tre.o(-1, -2));
        ijVar.setTextSize(1, 16.0f);
        yob.X(ijVar, i3, null);
        ijVar.setMaxLines(1);
        ijVar.setLines(1);
        ijVar.setInputType(16385);
        ijVar.setGravity(51);
        ijVar.setSingleLine(true);
        ijVar.setImeOptions(6);
        ijVar.A(aob.G6, null);
        ijVar.setCursorSize(hl.L(20.0f));
        ijVar.setCursorWidth(1.5f);
        ijVar.setPadding(0, hl.L(4.0f), 0, 0);
        linearLayout.addView(ijVar, tre.t(-1, 36, 51, 24, 6, 24, 0));
        ijVar.setOnEditorActionListener(new mh((byte) 0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        c00.r(9306112, hashMap, "Berry", 14598550, "Brandy");
        c00.r(8391495, hashMap, "Cherry", 16744272, "Coral");
        c00.r(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        c00.r(14725375, hashMap, "Mauve", 16761035, "Pink");
        c00.r(16711680, hashMap, "Red", 16711807, "Rose");
        c00.r(8406555, hashMap, "Russet", 16720896, "Scarlet");
        c00.r(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        c00.r(16760576, hashMap, "Amber", 15438707, "Apricot");
        c00.r(16508850, hashMap, "Banana", 10601738, "Citrus");
        c00.r(11560192, hashMap, "Ginger", 16766720, "Gold");
        c00.r(16640272, hashMap, "Lemon", 16753920, "Orange");
        c00.r(16770484, hashMap, "Peach", 16739155, "Persimmon");
        c00.r(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        c00.r(16763004, hashMap, "Topaz", 16776960, "Yellow");
        c00.r(3688720, hashMap, "Clover", 8628829, "Cucumber");
        c00.r(5294200, hashMap, "Emerald", 11907932, "Olive");
        c00.r(65280, hashMap, "Green", 43115, "Jade");
        c00.r(2730887, hashMap, "Jungle", 12582656, "Lime");
        c00.r(776785, hashMap, "Malachite", 10026904, "Mint");
        c00.r(11394989, hashMap, "Moss", 3234721, "Azure");
        c00.r(jn7.d4, hashMap, "Blue", 18347, "Cobalt");
        c00.r(5204422, hashMap, "Indigo", 96647, "Lagoon");
        c00.r(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        c00.r(128, hashMap, "Navy", 3101086, "Sapphire");
        c00.r(7788522, hashMap, "Sky", 32896, "Teal");
        c00.r(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        c00.r(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        c00.r(13148872, hashMap, "Lilac", 11894492, "Lavender");
        c00.r(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        c00.r(6684825, hashMap, "Purple", 14204888, "Thistle");
        c00.r(14315734, hashMap, "Orchid", 2361920, "Violet");
        c00.r(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        c00.r(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        c00.r(7365973, hashMap, "Coffee", 7956873, "Rum");
        c00.r(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        c00.r(12759680, hashMap, "Sand", 8924439, "Sienna");
        c00.r(7864585, hashMap, "Maple", 15787660, "Khaki");
        c00.r(12088115, hashMap, "Copper", 12144200, "Chestnut");
        c00.r(15653316, hashMap, "Almond", 16776656, "Cream");
        c00.r(12186367, hashMap, "Diamond", 11109127, "Honey");
        c00.r(16777200, hashMap, "Ivory", 15392968, "Pearl");
        c00.r(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        c00.r(16777215, hashMap, "White", 8421504, "Gray");
        c00.r(0, hashMap, "Black", 15266260, "Chrome");
        c00.r(3556687, hashMap, "Charcoal", 789277, "Ebony");
        c00.r(12632256, hashMap, "Silver", 16119285, "Smoke");
        c00.r(2499381, hashMap, "Steel", 5220413, "Apple");
        c00.r(8434628, hashMap, "Glacier", 16693933, "Melon");
        c00.r(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        ynb i4 = ynbVar == null ? aob.B0().i(false) : ynbVar;
        if (i4 == null || (i2 = i4.c) == 0) {
            i2 = hl.q(aob.r0())[0];
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
            str = qu6.o((String) asList.get(secureRandom.nextInt(asList.size())), " ", str2, new StringBuilder());
        } else {
            str = str2 + " " + ((String) asList2.get(secureRandom.nextInt(asList2.size())));
        }
        ijVar.setText(str);
        ijVar.setSelection(ijVar.length());
        df dfVar = new df(ijVar, b);
        id idVar = alertDialog$Builder.a;
        idVar.setOnShowListener(dfVar);
        eVar.showDialog(idVar);
        ijVar.requestFocus();
        idVar.c(-1).setOnClickListener(new nh(eVar, ijVar, ynbVar, znbVar, idVar, (byte) 0));
    }

    public static void U(Activity activity, String str, int i, int i2, int i3, pcc pccVar) {
        if (activity == null) {
            return;
        }
        final byte b = 0;
        int w0 = aob.w0(null, aob.j5, false);
        int w02 = aob.w0(null, aob.h5, false);
        aob.w0(null, aob.Aj, false);
        aob.w0(null, aob.Ej, false);
        aob.w0(null, aob.E8, false);
        aob.w0(null, aob.G8, false);
        aob.w0(null, aob.i6, false);
        aob.w0(null, aob.Ji, false);
        aob.w0(null, aob.Fi, false);
        aob.w0(null, aob.Hi, false);
        final byte b2 = 1;
        nx0 i4 = ik8.i(activity, false, 1, null);
        i4.w0 = false;
        zh zhVar = new zh(activity, null);
        ai aiVar = new ai(activity, zhVar);
        aiVar.setOrientation(0);
        aiVar.setWeightSum(1.0f);
        zhVar.setAllItemsCount(24);
        zhVar.setItemCount(5);
        zhVar.setTextColor(w0);
        zhVar.setGravity(5);
        zhVar.setTextOffset(-hl.L(12.0f));
        bi biVar = new bi(activity, null);
        biVar.setWrapSelectorWheel(true);
        biVar.setAllItemsCount(60);
        biVar.setItemCount(5);
        biVar.setTextColor(w0);
        biVar.setGravity(3);
        biVar.setTextOffset(hl.L(12.0f));
        final jg jgVar = new jg(i2, i3, zhVar, biVar, i, aiVar);
        aiVar.addView(zhVar, tre.l(0.5f, 0, jn7.s4));
        zhVar.setFormatter(new bg((byte) 9));
        zhVar.setOnValueChangedListener(new fq7() { // from class: kg
            @Override // fq7
            public final void i(hq7 hq7Var, int i5) {
                byte b3 = b;
                jg jgVar2 = jgVar;
                switch (b3) {
                    case 0:
                        jgVar2.a(Boolean.TRUE);
                        break;
                    default:
                        jgVar2.a(Boolean.TRUE);
                        break;
                }
            }
        });
        aiVar.addView(biVar, tre.l(0.5f, 0, jn7.s4));
        biVar.setFormatter(new bg((byte) 10));
        biVar.setOnValueChangedListener(new fq7() { // from class: kg
            @Override // fq7
            public final void i(hq7 hq7Var, int i5) {
                byte b3 = b2;
                jg jgVar2 = jgVar;
                switch (b3) {
                    case 0:
                        jgVar2.a(Boolean.TRUE);
                        break;
                    default:
                        jgVar2.a(Boolean.TRUE);
                        break;
                }
            }
        });
        jgVar.a(Boolean.FALSE);
        ci ciVar = new ci(activity, zhVar, biVar);
        ciVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 8));
        ciVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
        ciVar.addView(aiVar, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        c51 c51Var = new c51(null, activity, true);
        c51Var.setRoundRadius(24);
        c51Var.i(ob6.M0(2131745400, null), false, true);
        c51Var.setOnClickListener(new g5(r1, b2));
        ciVar.addView(c51Var, tre.t(-1, 48, 0, 16, 12, 16, 12));
        i4.O = ciVar;
        i4.show();
        i4.setOnDismissListener(new cf(pccVar, zhVar, biVar, b2));
        i4.s0(w02);
        i4.K(w02);
        nx0[] nx0VarArr = {i4};
    }

    public static id V(Activity activity, final long j, final long j2, String str, final Runnable runnable, vnb vnbVar) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = uc7.s1(yac.t0).W3;
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
            strArr = new String[]{ob6.M0(2131743268, null), ob6.M0(2131745094, null), ob6.M0(2131748477, null), ob6.M0(2131743267, null)};
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
            strArr = new String[]{ob6.M0(2131743267, null), ob6.M0(2131743268, null), ob6.M0(2131745094, null), ob6.M0(2131748477, null), ob6.M0(2131747548, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout m = bs2.m(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        int i3 = 0;
        while (i3 < strArr2.length) {
            j29 j29Var = new j29(activity, vnbVar);
            j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            j29Var.setTag(Integer.valueOf(i3));
            a(j29Var, aob.g7, aob.E5, vnbVar);
            j29Var.b(strArr2[i3], iArr[0] == i3 ? z : false);
            m.addView(j29Var);
            j29Var.setOnClickListener(new View.OnClickListener() { // from class: pf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
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
                        ip7.n(yac.t0).f(j3, j2);
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
                            ip7.n(yac.t0).g(2);
                        } else if (str3.equals("vibrate_group")) {
                            ip7.n(yac.t0).g(0);
                        } else {
                            boolean equals = str3.equals("vibrate_react");
                            int i6 = yac.t0;
                            if (equals) {
                                ip7.n(i6).g(4);
                            } else {
                                ip7.n(i6).g(1);
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
        String M0 = ob6.M0(2131743269, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static id W(Context context, vnb vnbVar, String[] strArr, int i, String str, String str2, pt2 pt2Var) {
        vnb vnbVar2;
        boolean z;
        byte b = 1;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    vnbVar2 = vnbVar;
                    z = true;
                    break;
                }
            }
        }
        vnbVar2 = vnbVar;
        z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, context);
        int i2 = aob.L5;
        alertDialog$Builder.l(i, 72, aob.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        if (z) {
            str = str2;
        }
        SpannableStringBuilder S2 = hl.S2(str);
        id idVar = alertDialog$Builder.a;
        idVar.U = S2;
        alertDialog$Builder.j(ob6.M0(z ? 2131747027 : 2131752890, null), new ag(z, (Object) context, (Object) atomicBoolean, (Object) pt2Var, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131752885, null), new o(atomicBoolean, pt2Var, (byte) 6));
        idVar.setOnDismissListener(new gf(atomicBoolean, pt2Var, b));
        return idVar;
    }

    public static void X(int i, long j, int i2, pcc pccVar) {
        Y(i, j, i2, pccVar, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Y(final int i, final long j, int i2, pcc pccVar, long j2) {
        vnb x53Var;
        vnb vnbVar;
        TLRPC.Chat chat;
        char c;
        Activity activity;
        long M1 = uc7.s1(i).M1(j);
        if (M1 <= 0 && j > 0) {
            M1 = wf3.j(uc7.s1(i).P2(j));
        }
        long j3 = i2 * M1;
        jxa.v(i, false).P.put(Long.valueOf(j), Integer.valueOf(i2));
        if (j3 <= 0 || j2 == j3) {
            pccVar.a(Long.valueOf(j3));
            return false;
        }
        final long j4 = M1;
        final ce ceVar = new ce(i, j3, j, pccVar, j4, (byte) 1);
        if (j4 <= uc7.s1(i).X3.getLong(ik8.n(j, "ask_paid_message_", "_price"), 0L)) {
            ceVar.run();
            return true;
        }
        Activity u0 = hl.u0();
        e S = LaunchActivity.S();
        if (!PhotoViewer.q0().V0()) {
            if (S == null) {
                vnbVar = null;
                String r = wf3.r(i, j);
                if (xc2.o0(i, j)) {
                }
                c = 0;
                activity = u0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = (int) j4;
                Object[] objArr = new Object[1];
                objArr[c] = r;
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessage1", i3, ',', objArr)));
                spannableStringBuilder.append((CharSequence) " ");
                if (i2 != 1) {
                }
                f0(activity, ob6.M0(2131748308, null), spannableStringBuilder, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new pcc() { // from class: me
                    @Override // pcc
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i4 = i;
                            SharedPreferences.Editor edit = uc7.s1(i4).X3.edit();
                            long j5 = j;
                            edit.putLong(ik8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                            jxa.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                        }
                        hl.c3(ceVar);
                    }
                }, vnbVar, true);
                return true;
            }
            if (!S.hasShownSheet()) {
                x53Var = S.getResourceProvider();
                vnbVar = x53Var;
                String r2 = wf3.r(i, j);
                if (xc2.o0(i, j)) {
                    r2 = ro4.i(i, j);
                } else if (S instanceof zu1) {
                    zu1 zu1Var = (zu1) S;
                    if (zu1Var.v4 && zu1Var.a() == j && (chat = zu1Var.u4) != null) {
                        c = 0;
                        activity = u0;
                        r2 = wf3.r(i, -chat.id);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i32 = (int) j4;
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = r2;
                        spannableStringBuilder2.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessage1", i32, ',', objArr2)));
                        spannableStringBuilder2.append((CharSequence) " ");
                        if (i2 != 1) {
                            spannableStringBuilder2.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessage2One", i32)));
                        } else {
                            spannableStringBuilder2.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessage2Many1", (int) j3)));
                            spannableStringBuilder2.append((CharSequence) " ");
                            spannableStringBuilder2.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessage2Many2", i2)));
                        }
                        f0(activity, ob6.M0(2131748308, null), spannableStringBuilder2, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new pcc() { // from class: me
                            @Override // pcc
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i4 = i;
                                    SharedPreferences.Editor edit = uc7.s1(i4).X3.edit();
                                    long j5 = j;
                                    edit.putLong(ik8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                                    jxa.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                                }
                                hl.c3(ceVar);
                            }
                        }, vnbVar, true);
                        return true;
                    }
                }
                c = 0;
                activity = u0;
                SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
                int i322 = (int) j4;
                Object[] objArr22 = new Object[1];
                objArr22[c] = r2;
                spannableStringBuilder22.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessage1", i322, ',', objArr22)));
                spannableStringBuilder22.append((CharSequence) " ");
                if (i2 != 1) {
                }
                f0(activity, ob6.M0(2131748308, null), spannableStringBuilder22, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new pcc() { // from class: me
                    @Override // pcc
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i4 = i;
                            SharedPreferences.Editor edit = uc7.s1(i4).X3.edit();
                            long j5 = j;
                            edit.putLong(ik8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                            jxa.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                        }
                        hl.c3(ceVar);
                    }
                }, vnbVar, true);
                return true;
            }
        }
        x53Var = new x53();
        vnbVar = x53Var;
        String r22 = wf3.r(i, j);
        if (xc2.o0(i, j)) {
        }
        c = 0;
        activity = u0;
        SpannableStringBuilder spannableStringBuilder222 = new SpannableStringBuilder();
        int i3222 = (int) j4;
        Object[] objArr222 = new Object[1];
        objArr222[c] = r22;
        spannableStringBuilder222.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessage1", i3222, ',', objArr222)));
        spannableStringBuilder222.append((CharSequence) " ");
        if (i2 != 1) {
        }
        f0(activity, ob6.M0(2131748308, null), spannableStringBuilder222, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new pcc() { // from class: me
            @Override // pcc
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i4 = i;
                    SharedPreferences.Editor edit = uc7.s1(i4).X3.edit();
                    long j5 = j;
                    edit.putLong(ik8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                    jxa.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                }
                hl.c3(ceVar);
            }
        }, vnbVar, true);
        return true;
    }

    public static boolean Z(int i, ArrayList arrayList, int i2, pcc pccVar) {
        vnb x53Var;
        vnb vnbVar;
        if (arrayList.isEmpty()) {
            pccVar.a(new HashMap());
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
            long M1 = uc7.s1(i).M1(longValue);
            if (M1 <= j && longValue > j) {
                M1 = wf3.j(uc7.s1(i).P2(longValue));
            }
            hashMap.put(l, Long.valueOf(M1));
            j2 += M1;
            long j3 = j;
            jxa.v(i, false).P.put(l, Integer.valueOf(i2));
            if (M1 > j3) {
                i5++;
            }
            if (M1 > j3 && z && uc7.s1(i).X3.getLong(ik8.n(longValue, "ask_paid_message_", "_price"), j3) < M1) {
                z = false;
            }
            i3 = i5;
            j = 0;
        }
        int i6 = i3;
        long max = j2 * Math.max(1, i2);
        if (z || max <= 0) {
            pccVar.a(hashMap);
            return false;
        }
        Activity u0 = hl.u0();
        e S = LaunchActivity.S();
        if (!PhotoViewer.q0().V0()) {
            if (S == null) {
                vnbVar = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', ob6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
                f0(u0, ob6.M0(2131748308, null), spannableStringBuilder, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new le(i, max, vnbVar, pccVar, u0, arrayList, hashMap), vnbVar, true);
                return true;
            }
            if (!S.hasShownSheet()) {
                x53Var = S.getResourceProvider();
                vnbVar = x53Var;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', ob6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
                f0(u0, ob6.M0(2131748308, null), spannableStringBuilder2, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new le(i, max, vnbVar, pccVar, u0, arrayList, hashMap), vnbVar, true);
                return true;
            }
        }
        x53Var = new x53();
        vnbVar = x53Var;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
        spannableStringBuilder22.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
        spannableStringBuilder22.append((CharSequence) " ");
        spannableStringBuilder22.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', ob6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
        f0(u0, ob6.M0(2131748308, null), spannableStringBuilder22, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new le(i, max, vnbVar, pccVar, u0, arrayList, hashMap), vnbVar, true);
        return true;
    }

    public static void a(j29 j29Var, int i, int i2, vnb vnbVar) {
        for (int i3 = 0; i3 < j29Var.getChildCount(); i3++) {
            View childAt = j29Var.getChildAt(i3);
            if (childAt instanceof RadioButton) {
                yob.O((RadioButton) childAt, i, i2, vnbVar);
                return;
            }
        }
        j29Var.a(aob.v0(i, vnbVar), aob.v0(i2, vnbVar));
    }

    public static boolean a0(int i, long j) {
        long M1 = uc7.s1(i).M1(j);
        if (M1 <= 0 && j > 0) {
            M1 = wf3.j(uc7.s1(i).P2(j));
        }
        return M1 > 0 && M1 > uc7.s1(i).X3.getLong(ik8.n(j, "ask_paid_message_", "_price"), 0L);
    }

    public static void b(hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
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
        hq7Var3.setMaxValue(i5);
        hq7Var3.setMinValue(i2);
        int value = hq7Var3.getValue();
        hq7Var2.setMaxValue(value == i5 ? i6 : 11);
        hq7Var2.setMinValue(value == i2 ? i3 : 0);
        int value2 = hq7Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i5 && value2 == i6) {
            actualMaximum = Math.min(i7, actualMaximum);
        }
        hq7Var.setMaxValue(actualMaximum);
        if (value == i2 && value2 == i3) {
            i = i4;
        }
        hq7Var.setMinValue(i);
    }

    public static void b0(ij ijVar, id idVar, e eVar) {
        if (eVar.getParentActivity() != null) {
            hl.t1(ijVar);
            String obj = ijVar.getText().toString();
            int i = aob.a;
            znb znbVar = new znb();
            znbVar.b = new File(a.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
            znbVar.a = obj;
            aob.g0 = aob.Z0(aob.I.j0);
            znbVar.F = yac.t0;
            aob.v1(znbVar, true, true, false);
            jn7.e().k(jn7.r4, new Object[0]);
            new ThemeEditorView().d(eVar.getParentActivity(), znbVar);
            idVar.dismiss();
            SharedPreferences e1 = uc7.e1();
            if (e1.getBoolean("themehint", false)) {
                return;
            }
            e1.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(eVar.getParentActivity(), ob6.M0(2131751675, null), 1).show();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public static long c(c51 c51Var, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3, hq7 hq7Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((hq7Var2.getValue() - 120) / 12) + i2;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (hq7Var2.getValue() - 120) % 12);
        hq7Var.setMinValue(1);
        hq7Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = hq7Var.getValue();
        int value3 = hq7Var3.getValue();
        int value4 = hq7Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (c51Var != null) {
            if (value2 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            c51Var.setText(ob6.D0().w0(i + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static id c0(final int i, TLRPC.TL_error tL_error, e eVar, TLObject tLObject, Object... objArr) {
        String str;
        char c;
        String str2;
        final long j;
        long m;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long l = jxa.l(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    m = wf3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    m = wf3.m(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    m = wf3.m(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    m = wf3.m(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    m = wf3.m(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                } else {
                    j = 0;
                    if (l > 0) {
                        jxa.v(i, false).n(new Runnable() { // from class: sg
                            @Override // java.lang.Runnable
                            public final void run() {
                                vnb x53Var;
                                Activity u0 = hl.u0();
                                e S = LaunchActivity.S();
                                if (!PhotoViewer.q0().V0()) {
                                    if (S == null) {
                                        x53Var = null;
                                    } else if (!S.hasShownSheet()) {
                                        x53Var = S.getResourceProvider();
                                    }
                                    vnb vnbVar = x53Var;
                                    int i2 = i;
                                    long j2 = j;
                                    new dza(u0, vnbVar, l, 13, wf3.r(i2, j2), new kc((byte) 10), j2).show();
                                }
                                x53Var = new x53();
                                vnb vnbVar2 = x53Var;
                                int i22 = i;
                                long j22 = j;
                                new dza(u0, vnbVar2, l, 13, wf3.r(i22, j22), new kc((byte) 10), j22).show();
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
                    r0(eVar, ob6.M0(2131749120, null), ob6.M0(2131749121, null), null);
                    return null;
                }
                boolean z = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long m2 = wf3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (m2 >= 0) {
                        str2 = lbc.k(uc7.s1(i).X1(Long.valueOf(m2)), true);
                    } else {
                        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-m2));
                        str2 = M0 != null ? M0.title : "";
                    }
                    r0(eVar == null ? LaunchActivity.Q() : eVar, ob6.M0(2131748293, null), ob6.a0(null, null, 2131748294, str2), null);
                    uc7.s1(i).k2(0, m2);
                    return null;
                }
                boolean z2 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z2 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z2 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    e Q = eVar == null ? LaunchActivity.Q() : eVar;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        r0(Q, ob6.M0(2131749007, null), ob6.M0(2131749006, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        r0(Q, ob6.M0(2131749007, null), ob6.M0(2131748998, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            r0(Q, ob6.M0(2131749007, null), ob6.M0(2131749012, null), null);
                            return null;
                        }
                        r0(Q, ob6.M0(2131749007, null), ob6.M0(2131749013, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        r0(Q, ob6.M0(2131749007, null), ob6.M0(2131749009, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        r0(Q, ob6.M0(2131749007, null), ob6.M0(2131749011, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        r0(Q, ob6.M0(2131749007, null), ob6.M0(2131749008, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        r0(Q, ob6.M0(2131749007, null), ob6.M0(2131749010, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        r0(Q, ob6.M0(2131749007, null), ob6.M0(2131749005, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        j0(tL_error.text, Q);
                        return null;
                    }
                    r0(Q, ob6.M0(2131749007, null), ob6.M0(2131751070, null) + "\n" + tL_error.text, null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        e Q2 = eVar == null ? LaunchActivity.Q() : eVar;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            r0(Q2, null, ob6.M0(2131748933, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            r0(Q2, null, ob6.M0(2131750647, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            u0(Q2.getParentActivity(), ob6.M0(2131743475, null), true);
                            return null;
                        }
                        r0(Q2, null, ob6.M0(2131751070, null) + "\n" + tL_error.text, null);
                        return null;
                    }
                    boolean z3 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i2 = jn7.M0;
                    if (z3 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        String str3 = tL_error.text;
                        if (eVar != null) {
                            if (!str3.equals("CHANNELS_TOO_MUCH")) {
                                e0(tL_error, eVar, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                                return null;
                            }
                            if (eVar.getParentActivity() != null) {
                                eVar.showDialog(new l46(5, i, null, eVar.getParentActivity(), eVar));
                                return null;
                            }
                            if (z3 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                eVar.presentFragment(new axb(0));
                                return null;
                            }
                            eVar.presentFragment(new axb(1));
                            return null;
                        }
                        if (str3.equals("PEER_FLOOD")) {
                            jn7.f(i).k(i2, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            e Q3 = eVar == null ? LaunchActivity.Q() : eVar;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new l46(5, i, null, Q3.getParentActivity(), Q3));
                                    return null;
                                }
                                Q3.presentFragment(new axb(2));
                                return null;
                            }
                            e eVar2 = Q3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, eVar2);
                                return null;
                            }
                            e0(tL_error, eVar2, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            e Q4 = eVar == null ? LaunchActivity.Q() : eVar;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q4.getParentActivity() != null) {
                                    Q4.showDialog(new l46(5, i, null, Q4.getParentActivity(), Q4));
                                    return null;
                                }
                                Q4.presentFragment(new axb(2));
                                return null;
                            }
                            e eVar3 = Q4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                j0(tL_error.text, eVar3);
                                return null;
                            }
                            e0(tL_error, eVar3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (eVar != null) {
                                    r0(eVar, null, ob6.M0(2131751236, null), null);
                                    return null;
                                }
                                t0(ob6.M0(2131751236, null), null);
                                return null;
                            }
                        } else {
                            if (z || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long m3 = z ? wf3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? wf3.m(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? wf3.m(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? wf3.m(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? wf3.m(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? wf3.m(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? wf3.m(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str4 = tL_error.text;
                                if (str4 == null || !str4.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str5 = tL_error.text;
                                    str5.getClass();
                                    switch (str5) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            jn7.f(i).k(i2, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            jn7.f(i).k(i2, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            t0(ob6.M0(2131748283, null), eVar);
                                            break;
                                    }
                                    return null;
                                }
                                String str6 = tL_error.text;
                                TLRPC.Chat M02 = m3 < 0 ? uc7.s1(i).M0(Long.valueOf(-m3)) : null;
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
                                throw new UnsupportedOperationException("Method not decompiled: jj.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.e, org.telegram.tgnet.TLObject, java.lang.Object[]):id");
                            }

                            public static void d(hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i = 1;
                                int i2 = calendar.get(1);
                                int i3 = calendar.get(2);
                                int i4 = calendar.get(5);
                                hq7Var3.setMinValue(i2);
                                int value = hq7Var3.getValue();
                                hq7Var2.setMinValue(value == i2 ? i3 : 0);
                                int value2 = hq7Var2.getValue();
                                if (value == i2 && value2 == i3) {
                                    i = i4;
                                }
                                hq7Var.setMinValue(i);
                            }

                            public static void d0(Context context, vnb vnbVar, String str, TLRPC.WebPage webPage, final pcc pccVar, e62 e62Var) {
                                Activity W = hl.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final id[] idVarArr = new id[1];
                                byte b = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                                String M0 = ob6.M0(2131746880, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131746881, null);
                                final ni niVar = new ni(context);
                                niVar.setTextSize(1, 16.0f);
                                int i = aob.j5;
                                yob.X(niVar, i, vnbVar);
                                yob.D(niVar, aob.Oi, vnbVar);
                                niVar.setHint(ob6.M0(2131746879, null));
                                niVar.setInputType(17);
                                niVar.setImeOptions(6);
                                niVar.setMaxLines(10);
                                niVar.setSingleLine(false);
                                niVar.setPadding(hl.L(16.0f), hl.L(13.0f), hl.L(16.0f), hl.L(13.0f));
                                niVar.setCursorWidth(1.5f);
                                niVar.A(aob.q6, vnbVar);
                                if (str != null) {
                                    niVar.setText(str);
                                    niVar.setSelection(str.length());
                                }
                                niVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hg
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                                        if (i2 != 6) {
                                            return false;
                                        }
                                        ni niVar2 = ni.this;
                                        String trim = niVar2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : jj.a.matcher(trim.trim()).matches())) {
                                            hl.z3(niVar2);
                                            return true;
                                        }
                                        pccVar.a(trim);
                                        id idVar2 = idVarArr[0];
                                        if (idVar2 != null) {
                                            idVar2.dismiss();
                                        }
                                        View view = currentFocus;
                                        if (view != null) {
                                            view.requestFocus();
                                        }
                                        return true;
                                    }
                                });
                                ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i, vnbVar)));
                                uob K = yob.K(0.06f, i);
                                niVar.setBackground(b0);
                                yob.j(niVar, b0, K, null, vnbVar);
                                LinearLayout j = uh9.j(context, 1);
                                j.addView(niVar, tre.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i2 = yxc.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    yxc yxcVar = new yxc(context, vnbVar);
                                    yxcVar.setWebPage(webPage);
                                    j.addView(yxcVar, tre.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.b();
                                alertDialog$Builder.n(j);
                                idVar.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
                                alertDialog$Builder.j(ob6.M0(2131751319, null), new o(niVar, pccVar, (byte) 8));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), new bg((byte) 7));
                                if (e62Var != null) {
                                    alertDialog$Builder.h(ob6.M0(2131751563, null), new m0(e62Var, (byte) 14));
                                }
                                idVarArr[0] = idVar;
                                idVar.k0 = false;
                                idVar.setOnDismissListener(new o1(niVar, (byte) 2));
                                idVarArr[0].setOnShowListener(new ig(niVar, b));
                                idVarArr[0].show();
                                TextView textView = (TextView) idVarArr[0].c(-3);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, null);
                                }
                            }

                            public static void e(TextView textView, hq7 hq7Var, li liVar, mi miVar) {
                                int value = hq7Var.getValue();
                                int value2 = liVar.getValue();
                                int value3 = miVar.getValue();
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
                                textView.setText(ob6.a0(null, null, 2131746901, ob6.a0(null, null, 2131746900, i > 0 ? ob6.G(i, "Days", new Object[0]) : "", i2 > 0 ? ob6.G(i2, "Hours", new Object[0]) : "", i3 > 0 ? ob6.G(i3, "Minutes", new Object[0]) : "").trim()));
                            }

                            public static void e0(TLRPC.TL_error tL_error, e eVar, boolean z, boolean z2, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                id idVar;
                                byte b;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || eVar == null || eVar.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
                                String M0 = ob6.M0(R.string.AppName, null);
                                idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                String str = tL_error.text;
                                str.getClass();
                                b = 2;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        idVar.U = ob6.M0(2131748512, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        idVar.U = ob6.M0(2131746319, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        idVar.U = ob6.M0(2131751713, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z) {
                                            idVar.U = ob6.M0(2131749143, null);
                                            break;
                                        } else {
                                            idVar.U = ob6.M0(2131752236, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        idVar.U = ob6.M0(2131743383, null);
                                        break;
                                    case "PEER_FLOOD":
                                        idVar.U = ob6.M0(2131747857, null);
                                        alertDialog$Builder.g(ob6.M0(2131748085, null), new i6(eVar, b));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z) {
                                            idVar.U = ob6.M0(2131749141, null);
                                            break;
                                        } else {
                                            idVar.U = ob6.M0(2131752234, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            idVar.U = ob6.M0(2131754470, null);
                                            break;
                                        } else {
                                            idVar.U = ob6.M0(2131754357, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        idVar.U = ob6.M0(2131742473, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        idVar.U = ob6.M0(2131754458, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z) {
                                            idVar.U = ob6.M0(2131749144, null);
                                            break;
                                        } else {
                                            idVar.U = ob6.M0(2131752237, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z) {
                                            idVar.U = ob6.M0(2131749142, null);
                                            break;
                                        } else {
                                            idVar.U = ob6.M0(2131752235, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        idVar.S = ob6.M0(2131752248, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            idVar.U = ob6.M0(2131752249, null);
                                            break;
                                        } else {
                                            idVar.U = ob6.M0(2131752250, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        idVar.S = ob6.M0(2131752248, null);
                                        idVar.U = ob6.M0(2131743412, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z) {
                                            idVar.U = ob6.M0(2131749140, null);
                                            break;
                                        } else {
                                            idVar.U = ob6.M0(2131752233, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        idVar.U = ob6.M0(2131754469, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z2) {
                                            if (!z) {
                                                idVar.U = ob6.M0(2131748863, null);
                                                break;
                                            } else {
                                                idVar.U = ob6.M0(2131748866, null);
                                                break;
                                            }
                                        } else {
                                            idVar.U = ob6.M0(2131748865, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        idVar.S = ob6.M0(2131742958, null);
                                        idVar.U = ob6.M0(2131743028, null);
                                        break;
                                    default:
                                        idVar.U = ob6.M0(2131751070, null) + "\n" + tL_error.text;
                                        break;
                                }
                                c00.u(null, 2131747558, alertDialog$Builder, null);
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
                                        user = uc7.s1(i).X1(Long.valueOf(tL_missingInvitee2.user_id));
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
                                hl.d3(new l77(i, (Object) chat, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, (byte) 1), 200L);
                            }

                            public static id f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, pcc pccVar, vnb vnbVar, boolean z) {
                                if (activity == null) {
                                    pccVar.a(Boolean.FALSE);
                                    return null;
                                }
                                byte b = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
                                byte b2 = 1;
                                sg2[] sg2VarArr = new sg2[1];
                                boolean[] zArr = {false};
                                xb xbVar = new xb(activity, (byte) 10);
                                jn7.i(xbVar);
                                yob.X(xbVar, aob.j5, vnbVar);
                                xbVar.setTextSize(1, 16.0f);
                                xbVar.setGravity((ob6.a0 ? 5 : 3) | 48);
                                xbVar.setText(charSequence);
                                sh shVar = new sh(activity, sg2VarArr, b2);
                                id idVar = alertDialog$Builder.a;
                                idVar.H = (byte) 6;
                                alertDialog$Builder.n(shVar);
                                TextView textView = new TextView(activity);
                                qd4.w(textView, aob.E8, vnbVar, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                shVar.addView(textView, tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                shVar.addView(xbVar, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    sg2 sg2Var = new sg2(1, vnbVar, activity);
                                    sg2VarArr[0] = sg2Var;
                                    int i = aob.i6;
                                    hf0 f0 = aob.f0(aob.v0(i, vnbVar), 7, hl.L(12.0f));
                                    uob M = yob.M(i);
                                    sg2Var.setBackground(f0);
                                    yob.j(sg2Var, f0, null, M, vnbVar);
                                    sg2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sg2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (ob6.a0 ? 5 : 3) | 16;
                                    sg2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    sg2VarArr[0].e(charSequence2, "", false, false, false);
                                    sg2VarArr[0].setPadding(ob6.a0 ? hl.L(4.0f) : 0, hl.L(12.0f), ob6.a0 ? 0 : hl.L(4.0f), hl.L(12.0f));
                                    shVar.addView(sg2VarArr[0], tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    sg2VarArr[0].setOnClickListener(new de(zArr, b));
                                }
                                alertDialog$Builder.j(str2, new ee(b, pccVar, zArr));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                if (z) {
                                    idVar.Y0 = true;
                                }
                                idVar.show();
                                return idVar;
                            }

                            public static boolean g(TextView textView, TextView textView2, long j, long j2, int i, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
                                long j3;
                                int i2;
                                long j4;
                                int i3;
                                int i4;
                                int i5;
                                boolean z;
                                boolean z2;
                                String G;
                                int value = hq7Var.getValue();
                                int value2 = hq7Var2.getValue();
                                int value3 = hq7Var3.getValue();
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
                                hq7Var.setMinValue(0);
                                if (j6 > 0) {
                                    hq7Var.setMaxValue(i3);
                                }
                                int value4 = hq7Var.getValue();
                                hq7Var2.setMinValue(value4 == 0 ? i8 : 0);
                                if (j6 > 0) {
                                    hq7Var2.setMaxValue(value4 == i3 ? i4 : 23);
                                }
                                int value5 = hq7Var2.getValue();
                                hq7Var3.setMinValue((value4 == 0 && value5 == i8) ? i9 : 0);
                                if (j6 > 0) {
                                    hq7Var3.setMaxValue((value4 == i3 && value5 == i4) ? i7 : 59);
                                }
                                int value6 = hq7Var3.getValue();
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
                                    textView.setText(ob6.D0().w0((i * 3) + (value4 == 0 ? 0 : i2 == i10 ? 1 : 2)).format(timeInMillis2));
                                }
                                if (textView2 != null) {
                                    int i11 = (int) ((timeInMillis2 - j3) / 1000);
                                    if (i11 > 86400) {
                                        z2 = false;
                                        G = ob6.G(Math.round(i11 / 86400.0f), "DaysSchedule", new Object[0]);
                                    } else {
                                        z2 = false;
                                        z2 = false;
                                        z2 = false;
                                        G = i11 >= 3600 ? ob6.G(Math.round(i11 / 3600.0f), "HoursSchedule", new Object[0]) : i11 >= 60 ? ob6.G(Math.round(i11 / 60.0f), "MinutesSchedule", new Object[0]) : ob6.G(i11, "SecondsSchedule", new Object[0]);
                                    }
                                    if (textView2.getTag() != null) {
                                        z = true;
                                        Object[] objArr = new Object[1];
                                        objArr[z2 ? 1 : 0] = G;
                                        textView2.setText(ob6.a0("VoipChannelScheduleInfo", null, 2131743115, objArr));
                                    } else {
                                        z = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z2 ? 1 : 0] = G;
                                        textView2.setText(ob6.a0("VoipGroupScheduleInfo", null, 2131742994, objArr2));
                                    }
                                } else {
                                    z = true;
                                    z2 = false;
                                }
                                return timeInMillis - j3 > millis ? z : z2;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:36:0x01c1  */
                            /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
                            /* JADX WARN: Type inference failed for: r0v36, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
                            /* JADX WARN: Type inference failed for: r13v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
                            /* JADX WARN: Type inference failed for: r14v15 */
                            /* JADX WARN: Type inference failed for: r14v6, types: [fd, java.lang.String, vnb] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [sg2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [sg2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.e] */
                            /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [sg2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void g0(e eVar, long j, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z, TLRPC.ChatFull chatFull, final df7 df7Var, vnb vnbVar) {
                                long j2;
                                boolean z2;
                                String str;
                                String M0;
                                ?? r9;
                                ?? r14;
                                TextView textView;
                                String str2;
                                if (eVar.getParentActivity() == null) {
                                    return;
                                }
                                final k5 accountInstance = eVar.getAccountInstance();
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, eVar.getParentActivity());
                                SharedPreferences sharedPreferences = uc7.s1(eVar.getCurrentAccount()).W3;
                                int i = 1;
                                if (encryptedChat == null) {
                                    j2 = j;
                                    if (!qu6.v("dialog_bar_report", j2, sharedPreferences, false)) {
                                        z2 = false;
                                        id idVar = alertDialog$Builder.a;
                                        if (user == null) {
                                            idVar.S = ob6.a0("BlockUserTitle", null, 2131753678, lbc.k(user, true));
                                            idVar.U = hl.S2(ob6.a0("BlockUserAlert", null, 2131753684, lbc.k(user, true)));
                                            String M02 = ob6.M0(2131753686, null);
                                            int i2 = 2;
                                            r9 = new sg2[2];
                                            int i3 = 0;
                                            ?? linearLayout = new LinearLayout(eVar.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i4 = 0;
                                            while (i4 < i2) {
                                                if (i4 != 0 || z2) {
                                                    sg2 sg2Var = new sg2(i, vnbVar, eVar.getParentActivity());
                                                    r9[i4] = sg2Var;
                                                    sg2Var.setBackgroundDrawable(aob.L0(i3));
                                                    r9[i4].setTag(Integer.valueOf(i4));
                                                    if (i4 == 0) {
                                                        r9[i4].e(ob6.M0(2131751467, null), "", true, false, false);
                                                        str2 = M02;
                                                    } else {
                                                        str2 = M02;
                                                        r9[i4].e(ob6.a0("DeleteThisChat", null, 2131751447, new Object[i3]), "", true, false, false);
                                                    }
                                                    byte b = 0;
                                                    r9[i4].setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                                                    linearLayout.addView(r9[i4], tre.o(-1, -2));
                                                    r9[i4].setOnClickListener(new je(r9, b));
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
                                                idVar.S = ob6.M0(2131745927, null);
                                                if (!xc2.T(chat) || chat.megagroup) {
                                                    idVar.U = ob6.M0(2131745931, null);
                                                } else {
                                                    idVar.U = ob6.M0(2131745932, null);
                                                }
                                            } else {
                                                idVar.S = ob6.M0(2131745916, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        idVar.U = hl.S2(ob6.a0("ReportUnrelatedGroupText", null, 2131745915, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                idVar.U = ob6.M0(2131745914, null);
                                            }
                                            M0 = ob6.M0(2131745957, str);
                                            r9 = str;
                                            r14 = str;
                                        }
                                        final sg2[] sg2VarArr = r9;
                                        final long j3 = j2;
                                        alertDialog$Builder.j(M0, new fd() { // from class: ke
                                            @Override // fd
                                            public final void w(id idVar2, int i5) {
                                                sg2 sg2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                k5 k5Var = accountInstance;
                                                if (user2 != null) {
                                                    uc7.s1(k5Var.a).u(user2.id);
                                                }
                                                sg2[] sg2VarArr2 = sg2VarArr;
                                                long j4 = j3;
                                                TLRPC.Chat chat2 = chat;
                                                if (sg2VarArr2 == null || ((sg2Var2 = sg2VarArr2[0]) != null && sg2Var2.b())) {
                                                    uc7.s1(k5Var.a).z4(j4, user2, chat2, encryptedChat, chat2 != null && z);
                                                }
                                                df7 df7Var2 = df7Var;
                                                if (sg2VarArr2 != null && !sg2VarArr2[1].b()) {
                                                    df7Var2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    uc7.s1(k5Var.a).V(0, j4, false);
                                                } else if (xc2.r0(chat2)) {
                                                    uc7.s1(k5Var.a).V(0, j4, false);
                                                } else {
                                                    int i6 = k5Var.a;
                                                    uc7.s1(i6).d0(-j4, uc7.s1(i6).X1(Long.valueOf(yac.h(i6).e())));
                                                }
                                                df7Var2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.g(ob6.M0(2131752570, r14), r14);
                                        eVar.showDialog(idVar);
                                        textView = (TextView) idVar.c(-1);
                                        if (textView == null) {
                                            yob.X(textView, aob.q7, r14);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    j2 = j;
                                }
                                z2 = true;
                                id idVar2 = alertDialog$Builder.a;
                                if (user == null) {
                                }
                                final sg2[] sg2VarArr2 = r9;
                                final long j32 = j2;
                                alertDialog$Builder.j(M0, new fd() { // from class: ke
                                    @Override // fd
                                    public final void w(id idVar22, int i5) {
                                        sg2 sg2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        k5 k5Var = accountInstance;
                                        if (user2 != null) {
                                            uc7.s1(k5Var.a).u(user2.id);
                                        }
                                        sg2[] sg2VarArr22 = sg2VarArr2;
                                        long j4 = j32;
                                        TLRPC.Chat chat2 = chat;
                                        if (sg2VarArr22 == null || ((sg2Var2 = sg2VarArr22[0]) != null && sg2Var2.b())) {
                                            uc7.s1(k5Var.a).z4(j4, user2, chat2, encryptedChat, chat2 != null && z);
                                        }
                                        df7 df7Var2 = df7Var;
                                        if (sg2VarArr22 != null && !sg2VarArr22[1].b()) {
                                            df7Var2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            uc7.s1(k5Var.a).V(0, j4, false);
                                        } else if (xc2.r0(chat2)) {
                                            uc7.s1(k5Var.a).V(0, j4, false);
                                        } else {
                                            int i6 = k5Var.a;
                                            uc7.s1(i6).d0(-j4, uc7.s1(i6).X1(Long.valueOf(yac.h(i6).e())));
                                        }
                                        df7Var2.a(1);
                                    }
                                });
                                alertDialog$Builder.g(ob6.M0(2131752570, r14), r14);
                                eVar.showDialog(idVar2);
                                textView = (TextView) idVar2.c(-1);
                                if (textView == null) {
                                }
                            }

                            public static boolean h(Context context, int i, long j, boolean z) {
                                TLRPC.Chat M0;
                                if (!wf3.y(j) || (M0 = uc7.s1(i).M0(Long.valueOf(-j))) == null || !M0.slowmode_enabled || xc2.N(M0)) {
                                    return false;
                                }
                                if (!z) {
                                    TLRPC.ChatFull N0 = uc7.s1(i).N0(M0.id);
                                    if (N0 == null) {
                                        N0 = jf7.Y(i).C0(M0.id, xc2.T(M0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (N0 != null && N0.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    return false;
                                }
                                K(context, M0.title, ob6.M0(2131745030, null)).o();
                                return true;
                            }

                            public static void h0(zu1 zu1Var, r47 r47Var, long j, vnb vnbVar, hm1 hm1Var) {
                                if (zu1Var.getParentActivity() == null || r47Var == null) {
                                    return;
                                }
                                k5 accountInstance = zu1Var.getAccountInstance();
                                TLRPC.User X1 = j > 0 ? uc7.s1(accountInstance.a).X1(Long.valueOf(j)) : null;
                                TLRPC.Chat M0 = j < 0 ? uc7.s1(accountInstance.a).M0(Long.valueOf(-j)) : null;
                                if (X1 == null && M0 == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, zu1Var.getParentActivity());
                                id idVar = alertDialog$Builder.a;
                                idVar.Q0 = false;
                                idVar.O = new o1(hm1Var, (byte) 3);
                                idVar.S = ob6.M0(2131753685, null);
                                byte b = 1;
                                if (X1 != null) {
                                    idVar.U = hl.S2(ob6.a0("BlockUserReplyAlert", null, 2131753679, lbc.k(X1, true)));
                                } else {
                                    idVar.U = hl.S2(ob6.a0("BlockUserReplyAlert", null, 2131753679, M0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(zu1Var.getParentActivity());
                                linearLayout.setOrientation(1);
                                sg2[] sg2VarArr = {new sg2(1, vnbVar, zu1Var.getParentActivity())};
                                sg2VarArr[0].setBackgroundDrawable(aob.L0(false));
                                sg2VarArr[0].setTag(0);
                                sg2VarArr[0].e(ob6.M0(2131751467, null), "", true, false, false);
                                sg2VarArr[0].setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                                linearLayout.addView(sg2VarArr[0], tre.o(-1, -2));
                                sg2VarArr[0].setOnClickListener(new je(sg2VarArr, b));
                                alertDialog$Builder.n(linearLayout);
                                alertDialog$Builder.j(ob6.M0(2131753688, null), new kh(X1, accountInstance, zu1Var, M0, r47Var, sg2VarArr, vnbVar));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                zu1Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, null);
                                }
                            }

                            public static id i(Activity activity, fj fjVar) {
                                if (yac.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                id idVar = alertDialog$Builder.a;
                                uc ucVar = idVar.M0;
                                id[] idVarArr = new id[1];
                                LinearLayout m = bs2.m(activity, 1);
                                int i = 0;
                                while (true) {
                                    byte b = 4;
                                    if (i >= 4) {
                                        idVar.S = ob6.M0(2131745399, null);
                                        alertDialog$Builder.n(m);
                                        alertDialog$Builder.j(ob6.M0(2131752570, null), null);
                                        idVarArr[0] = idVar;
                                        return idVar;
                                    }
                                    if (yac.h(i).f() != null) {
                                        l5 l5Var = new l5(activity, false);
                                        l5Var.f = i;
                                        TLRPC.User f = yac.h(i).f();
                                        rb0 rb0Var = l5Var.e;
                                        rb0Var.q(f);
                                        l5Var.a.l(lv2.m(0, f.first_name, f.last_name), false);
                                        de0 de0Var = l5Var.c;
                                        de0Var.getImageReceiver().d = i;
                                        de0Var.f(f, rb0Var);
                                        l5Var.d.setVisibility(4);
                                        l5Var.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                                        l5Var.setBackgroundDrawable(aob.L0(false));
                                        m.addView(l5Var, tre.o(-1, 50));
                                        l5Var.setOnClickListener(new c0(idVarArr, ucVar, fjVar, b));
                                    }
                                    i++;
                                }
                            }

                            public static void i0(Context context, int i, long j) {
                                nx0 h = uh9.h(1, null, context, false);
                                LinearLayout j2 = uh9.j(context, 1);
                                j2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(8.0f));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                j2.addView(frameLayout, tre.t(-1, 92, 17, 0, 0, 0, 0));
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                imageView.setImageResource(R.drawable.story_link);
                                imageView.setScaleX(2.0f);
                                imageView.setScaleY(2.0f);
                                frameLayout2.addView(imageView, tre.e(-1, -1, 17));
                                int L = hl.L(80.0f);
                                int i2 = aob.Fi;
                                ShapeDrawable K = aob.K(L, aob.w0(null, i2, false));
                                uob M = yob.M(i2);
                                frameLayout2.setBackground(K);
                                yob.j(frameLayout2, K, M, null, null);
                                frameLayout.addView(frameLayout2, tre.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i3 = aob.G6;
                                qd4.w(textView, i3, null, 1, 20.0f);
                                textView.setText(ob6.M0(2131752605, null));
                                textView.setGravity(17);
                                TextView m = ik8.m(j2, textView, tre.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                yob.X(m, i3, null);
                                m.setTextSize(1, 14.0f);
                                uh9.r(null, null, 2131752606, new Object[]{wf3.k(i, j)}, m);
                                m.setGravity(17);
                                j2.addView(m, tre.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                c51 c51Var = new c51(null, context, true);
                                c51Var.i(ob6.M0(2131752607, null), false, true);
                                j2.addView(c51Var, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                h.O = j2;
                                c51Var.setOnClickListener(new jh(i, c51Var, h, j));
                                h.J();
                                h.show();
                            }

                            public static id j(Context context, vnb vnbVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                                String M0 = ob6.M0(2131754236, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.U = M0;
                                int i = aob.L5;
                                alertDialog$Builder.l(R.raw.permission_request_apk, 72, aob.w0(null, i, false), null);
                                alertDialog$Builder.m(i, null);
                                alertDialog$Builder.j(ob6.M0(2131747027, null), new qg(context, (byte) 0));
                                alertDialog$Builder.g(ob6.M0(2131751737, null), null);
                                return idVar;
                            }

                            public static void j0(String str, e eVar) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || eVar == null || eVar.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
                                String M0 = ob6.M0(R.string.AppName, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.a0("FloodWaitTime", null, 2131750646, G);
                                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                eVar.showDialog(idVar, true, null);
                            }

                            public static void k(Context context, vnb vnbVar, hj hjVar) {
                                int w0;
                                int w02;
                                int w03;
                                int w04;
                                int w05;
                                if (context == null) {
                                    return;
                                }
                                boolean z = false;
                                int i = aob.j5;
                                if (vnbVar != null) {
                                    w0 = vnbVar.f(i);
                                    w02 = vnbVar.f(aob.h5);
                                    vnbVar.f(aob.Aj);
                                    vnbVar.f(aob.Ej);
                                    vnbVar.f(aob.E8);
                                    vnbVar.f(aob.G8);
                                    vnbVar.f(aob.i6);
                                    w03 = vnbVar.f(aob.Ji);
                                    w04 = vnbVar.f(aob.Fi);
                                    w05 = vnbVar.f(aob.Hi);
                                } else {
                                    w0 = aob.w0(null, i, false);
                                    w02 = aob.w0(null, aob.h5, false);
                                    aob.w0(null, aob.Aj, false);
                                    aob.w0(null, aob.Ej, false);
                                    aob.w0(null, aob.E8, false);
                                    aob.w0(null, aob.G8, false);
                                    aob.w0(null, aob.i6, false);
                                    w03 = aob.w0(null, aob.Ji, false);
                                    w04 = aob.w0(null, aob.Fi, false);
                                    w05 = aob.w0(null, aob.Hi, false);
                                }
                                int i2 = w04;
                                int i3 = w05;
                                int i4 = w02;
                                int i5 = w03;
                                z8d z8dVar = new z8d(context, vnbVar);
                                ((nx0) z8dVar.b).w0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                qi qiVar = new qi(context, vnbVar, iArr);
                                qiVar.setMinValue(0);
                                qiVar.setMaxValue(16);
                                qiVar.setTextColor(w0);
                                qiVar.setValue(0);
                                byte b = 0;
                                qiVar.setFormatter(new pg(iArr, b));
                                ri riVar = new ri(context, qiVar, b);
                                boolean z2 = true;
                                riVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                riVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(ob6.M0(2131753870, null));
                                textView.setTextColor(w0);
                                bs2.t(textView, 1, 20.0f);
                                frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new q8((byte) 9));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                riVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                si siVar = new si(context, z2, z2, z, (byte) 0);
                                linearLayout.addView(qiVar, tre.l(1.0f, 0, jn7.s4));
                                siVar.setPadding(0, 0, 0, 0);
                                siVar.setGravity(17);
                                siVar.setTextColor(i5);
                                siVar.setTextSize(hl.L(14.0f));
                                siVar.setTypeface(hl.o());
                                int L = hl.L(8.0f);
                                siVar.setBackgroundDrawable(aob.i0(L, L, L, L, i2, i3, i3));
                                riVar.addView(siVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
                                siVar.setText(ob6.M0(2131751399, null));
                                qiVar.setOnValueChangedListener(new m0(siVar, (byte) 15));
                                siVar.setOnClickListener(new cg((Object) iArr, (Object) qiVar, (Object) hjVar, (Object) z8dVar, (byte) 1));
                                nx0 nx0Var = (nx0) z8dVar.b;
                                nx0Var.O = riVar;
                                nx0Var.show();
                                nx0Var.s0(i4);
                                nx0Var.K(i4);
                            }

                            public static void k0(Context context, vnb vnbVar, int i, TL_stars.StarGift starGift, long j, Runnable runnable) {
                                TLObject b2 = uc7.s1(i).b2(j);
                                LinearLayout j2 = uh9.j(context, 1);
                                j2.addView(new wta(context, starGift, b2), tre.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                yob.X(textView, aob.j5, vnbVar);
                                textView.setTextSize(1, 16.0f);
                                uh9.r(null, null, 2131749365, new Object[]{wf3.G(null, null, b2)}, textView);
                                j2.addView(textView, tre.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                                alertDialog$Builder.n(j2);
                                alertDialog$Builder.j(ob6.M0(2131749366, null), new td(runnable, (byte) 1));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.o();
                            }

                            public static z8d l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, pcc pccVar, Runnable runnable, boolean z, boolean z2, vnb vnbVar) {
                                if (context == null) {
                                    return null;
                                }
                                z8d z8dVar = new z8d(context, vnbVar);
                                byte b = 0;
                                ((nx0) z8dVar.b).w0 = false;
                                hq7 hq7Var = new hq7(context, vnbVar);
                                hq7Var.setTextOffset(hl.L(10.0f));
                                hq7Var.setItemCount(5);
                                hq7 hq7Var2 = new hq7(context, vnbVar);
                                hq7Var2.setItemCount(5);
                                hq7Var2.setTextOffset(-hl.L(10.0f));
                                hq7 hq7Var3 = new hq7(context, vnbVar);
                                hq7Var3.setItemCount(5);
                                hq7Var3.setTextOffset(-hl.L(24.0f));
                                ii iiVar = new ii(context, hq7Var, hq7Var2, hq7Var3);
                                iiVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                iiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
                                frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new q8((byte) 1));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                iiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i2 = calendar.get(5);
                                int i3 = calendar.get(2);
                                int i4 = calendar.get(1);
                                int i5 = i4 + 1;
                                xd xdVar = new xd(hq7Var3, i5, hq7Var, hq7Var2, i4, i3, i2);
                                System.currentTimeMillis();
                                ji jiVar = new ji(context);
                                linearLayout.addView(hq7Var, tre.l(0.25f, 0, jn7.s4));
                                hq7Var.setMinValue(1);
                                hq7Var.setMaxValue(31);
                                hq7Var.setWrapSelectorWheel(false);
                                hq7Var.setFormatter(new e((byte) 16));
                                m0 m0Var = new m0(xdVar, (byte) 9);
                                hq7Var.setOnScrollListener(m0Var);
                                hq7Var2.setMinValue(0);
                                hq7Var2.setMaxValue(11);
                                hq7Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(hq7Var2, tre.l(0.5f, 0, jn7.s4));
                                hq7Var2.setFormatter(new e((byte) 17));
                                hq7Var2.setOnScrollListener(m0Var);
                                hq7Var3.setMinValue(i);
                                hq7Var3.setMaxValue(i5);
                                hq7Var3.setWrapSelectorWheel(false);
                                hq7Var3.setFormatter(new yd(i5, b));
                                linearLayout.addView(hq7Var3, tre.l(0.25f, 0, jn7.s4));
                                hq7Var3.setOnScrollListener(m0Var);
                                if (tL_birthday != null) {
                                    hq7Var.setValue(tL_birthday.day);
                                    hq7Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        hq7Var3.setValue(tL_birthday.year);
                                    } else {
                                        hq7Var3.setValue(i5);
                                    }
                                } else {
                                    hq7Var.setValue(calendar.get(5));
                                    hq7Var2.setValue(calendar.get(2));
                                    hq7Var3.setValue(i5);
                                }
                                xdVar.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    p66 p66Var = new p66(context, null);
                                    p66Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                                    p66Var.setTextSize(1, 13.0f);
                                    yob.X(p66Var, aob.q5, vnbVar);
                                    yob.G(p66Var, aob.Xc, vnbVar);
                                    p66Var.setGravity(17);
                                    frameLayout2.addView(p66Var, tre.e(-2, -2, 17));
                                    iiVar.addView(frameLayout2, tre.o(-1, -2));
                                    int i6 = yac.t0;
                                    zd zdVar = new zd(i6, p66Var, b);
                                    zdVar.run();
                                    jn7.f(i6).h(frameLayout2, jn7.k0, new te2(zdVar, (byte) 3));
                                    lv2.r(i6).D(false);
                                }
                                if (z) {
                                    c51 c51Var = new c51(vnbVar, context, false);
                                    c51Var.i(ob6.M0(2131751635, null), false, true);
                                    c51Var.setOnClickListener(new ae(hq7Var3, i5, xdVar, b));
                                    iiVar.addView(c51Var, tre.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                jiVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                jiVar.setGravity(17);
                                yob.X(jiVar, aob.Ji, vnbVar);
                                jiVar.setTextSize(1, 14.0f);
                                jiVar.setTypeface(hl.o());
                                jiVar.setText(str2);
                                int L = hl.L(24.0f);
                                int i7 = aob.Fi;
                                int v0 = aob.v0(i7, vnbVar);
                                int i8 = aob.Hi;
                                int v02 = aob.v0(i8, vnbVar);
                                hf0 i0 = aob.i0(L, L, L, L, v0, v02, v02);
                                uob M = yob.M(i7);
                                uob M2 = yob.M(i8);
                                jiVar.setBackground(i0);
                                yob.j(jiVar, i0, M, M2, vnbVar);
                                iye.b(jiVar, 0.02f, 1.2f);
                                iiVar.addView(jiVar, tre.t(-1, 48, 83, 16, z ? 0 : 15, 16, z2 ? 0 : 16));
                                jiVar.setOnClickListener(new be(hq7Var, hq7Var2, hq7Var3, i5, z8dVar, pccVar));
                                if (z2) {
                                    c51 c51Var2 = new c51(vnbVar, context, false);
                                    c51Var2.i(ob6.M0(2131753708, null), false, true);
                                    c51Var2.f();
                                    c51Var2.setOnClickListener(new t(z8dVar, pccVar, (byte) 12));
                                    iiVar.addView(c51Var2, tre.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((nx0) z8dVar.b).O = iiVar;
                                return z8dVar;
                            }

                            public static void l0(Context context, vnb vnbVar, String str, boolean z, final icc iccVar) {
                                if (hl.C1(context)) {
                                    final byte b = 1;
                                    final id[] idVarArr = new id[1];
                                    final byte b2 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                                    String M0 = ob6.M0(2131747506, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i = aob.j5;
                                    yob.X(textView, i, vnbVar);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(hl.L(14.0f), hl.L(12.0f), hl.L(14.0f), hl.L(12.0f));
                                    ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i, vnbVar)));
                                    uob K = yob.K(0.06f, i);
                                    textView.setBackground(b0);
                                    yob.j(textView, b0, K, null, vnbVar);
                                    final sg2 sg2Var = new sg2(1, vnbVar, context);
                                    sg2Var.setMultiline(true);
                                    sg2Var.getTextView().getLayoutParams().width = -1;
                                    sg2Var.getTextView().setSingleLine(false);
                                    sg2Var.getTextView().setMaxLines(3);
                                    sg2Var.getTextView().setTextSize(1, 16.0f);
                                    sg2Var.e(ob6.M0(z ? 2131752858 : 2131752857, null), "", false, false, false);
                                    sg2Var.setOnClickListener(new qd(sg2Var, b2));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, tre.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(sg2Var, tre.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.n(linearLayout);
                                    idVar.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
                                    alertDialog$Builder.j(ob6.M0(2131747544, null), new fd() { // from class: rd
                                        @Override // fd
                                        public final void w(id idVar2, int i2) {
                                            byte b3 = b2;
                                            id[] idVarArr2 = idVarArr;
                                            sg2 sg2Var2 = sg2Var;
                                            icc iccVar2 = iccVar;
                                            switch (b3) {
                                                case 0:
                                                    iccVar2.a(Boolean.TRUE, Boolean.valueOf(sg2Var2.b()));
                                                    id idVar3 = idVarArr2[0];
                                                    if (idVar3 != null) {
                                                        idVar3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    iccVar2.a(Boolean.FALSE, Boolean.valueOf(sg2Var2.b()));
                                                    id idVar4 = idVarArr2[0];
                                                    if (idVar4 != null) {
                                                        idVar4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), new fd() { // from class: rd
                                        @Override // fd
                                        public final void w(id idVar2, int i2) {
                                            byte b3 = b;
                                            id[] idVarArr2 = idVarArr;
                                            sg2 sg2Var2 = sg2Var;
                                            icc iccVar2 = iccVar;
                                            switch (b3) {
                                                case 0:
                                                    iccVar2.a(Boolean.TRUE, Boolean.valueOf(sg2Var2.b()));
                                                    id idVar3 = idVarArr2[0];
                                                    if (idVar3 != null) {
                                                        idVar3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    iccVar2.a(Boolean.FALSE, Boolean.valueOf(sg2Var2.b()));
                                                    id idVar4 = idVarArr2[0];
                                                    if (idVar4 != null) {
                                                        idVar4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    idVarArr[0] = alertDialog$Builder.o();
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
                            /* JADX WARN: Type inference failed for: r8v8, types: [fd, java.lang.String, vnb] */
                            /* JADX WARN: Type inference failed for: r8v9 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void m(e eVar, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                sg2[] sg2VarArr;
                                sg2 sg2Var;
                                ?? r8;
                                if (eVar == null) {
                                    return;
                                }
                                Context context = eVar.getContext();
                                sg2[] sg2VarArr2 = new sg2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                dj djVar = new dj(context, null);
                                jn7.i(djVar);
                                yob.X(djVar, aob.j5, null);
                                yob.G(djVar, aob.Xc, null);
                                djVar.setTextSize(1, 16.0f);
                                djVar.setGravity((ob6.a0 ? 5 : 3) | 48);
                                ej ejVar = new ej(context, sg2VarArr2);
                                id idVar = alertDialog$Builder.a;
                                idVar.H = (byte) 6;
                                alertDialog$Builder.n(ejVar);
                                rb0 rb0Var = new rb0((vnb) null);
                                rb0Var.s(hl.L(18.0f));
                                de0 de0Var = new de0(context);
                                de0Var.setRoundRadius(hl.L(20.0f));
                                ejVar.addView(de0Var, tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                ema emaVar = new ema(context);
                                yob.W(emaVar, aob.E8, null);
                                emaVar.setTextSize(20);
                                emaVar.setTypeface(hl.o());
                                emaVar.setGravity((ob6.a0 ? 5 : 3) | 16);
                                emaVar.setEllipsizeByGradient(true);
                                emaVar.l(user.first_name, false);
                                if (user.scam) {
                                    emaVar.i(aob.f1);
                                } else if (user.fake) {
                                    emaVar.i(aob.g1);
                                } else if (user.verified) {
                                    Drawable e = c00.e(context, R.drawable.verified_area);
                                    int i = aob.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    yob.x(emaVar, e, i, null, mode);
                                    Drawable e2 = c00.e(context, R.drawable.verified_check);
                                    sg2VarArr = sg2VarArr2;
                                    yob.x(emaVar, e2, aob.A9, null, mode);
                                    emaVar.i(new zm2(e, e2));
                                    TextView textView = new TextView(context);
                                    yob.X(textView, aob.m5, null);
                                    byte b = 1;
                                    ik8.w(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!ob6.a0 ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new sd(user, eVar, alertDialog$Builder, b));
                                    SpannableString valueOf = SpannableString.valueOf(ob6.M0(2131748089, null).concat("  "));
                                    wm2 wm2Var = new wm2(R.drawable.attach_arrow_right, 0);
                                    wm2Var.n = 1;
                                    wm2Var.c(hl.L(10.0f));
                                    valueOf.setSpan(wm2Var, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z = ob6.a0;
                                    ejVar.addView(emaVar, tre.d(-1, -2.0f, (!z ? 5 : 3) | 48, !z ? 21 : 76, 0.0f, !z ? 76 : 21, 0.0f));
                                    boolean z2 = ob6.a0;
                                    ejVar.addView(textView, tre.d(-1, -2.0f, (!z2 ? 5 : 3) | 48, !z2 ? 21 : 76, 24.0f, z2 ? 76 : 21, 0.0f));
                                    ejVar.addView(djVar, tre.d(-2, -2.0f, (!ob6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    sg2Var = new sg2(1, eVar.getResourceProvider(), context);
                                    sg2VarArr[0] = sg2Var;
                                    if (!sg2Var.I) {
                                        te1 te1Var = sg2Var.c;
                                        te1Var.setLines(3);
                                        te1Var.setMaxLines(3);
                                        te1Var.setSingleLine(false);
                                    }
                                    sg2VarArr[0].setBackgroundDrawable(aob.L0(false));
                                    sg2VarArr[0].e(hl.S2(ob6.a0(null, null, 2131747507, lbc.r(user))), "", true, false, false);
                                    sg2VarArr[0].setPadding(!ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, !ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                                    sg2VarArr[0].c(true, false);
                                    ejVar.addView(sg2VarArr[0], tre.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    sg2VarArr[0].setOnClickListener(new k1(atomicBoolean, (byte) 8));
                                    if (lbc.B(user)) {
                                        r8 = 0;
                                        rb0Var.p = 1.0f;
                                        eVar.getCurrentAccount();
                                        rb0Var.q(user);
                                        de0Var.f(user, rb0Var);
                                    } else {
                                        rb0Var.p = 0.8f;
                                        rb0Var.f(12);
                                        r8 = 0;
                                        de0Var.m(null, null, rb0Var, user);
                                    }
                                    alertDialog$Builder.j(ob6.M0(2131744572, r8), new td(runnable, (byte) 2));
                                    alertDialog$Builder.g(ob6.M0(2131752570, r8), r8);
                                    eVar.showDialog(idVar);
                                    djVar.setText(hl.N2(ob6.M0(2131752877, r8), -1, 0, new vd(idVar, context, (byte) 1), r8));
                                }
                                sg2VarArr = sg2VarArr2;
                                TextView textView2 = new TextView(context);
                                yob.X(textView2, aob.m5, null);
                                byte b2 = 1;
                                ik8.w(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!ob6.a0 ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new sd(user, eVar, alertDialog$Builder, b2));
                                SpannableString valueOf2 = SpannableString.valueOf(ob6.M0(2131748089, null).concat("  "));
                                wm2 wm2Var2 = new wm2(R.drawable.attach_arrow_right, 0);
                                wm2Var2.n = 1;
                                wm2Var2.c(hl.L(10.0f));
                                valueOf2.setSpan(wm2Var2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z3 = ob6.a0;
                                ejVar.addView(emaVar, tre.d(-1, -2.0f, (!z3 ? 5 : 3) | 48, !z3 ? 21 : 76, 0.0f, !z3 ? 76 : 21, 0.0f));
                                boolean z22 = ob6.a0;
                                ejVar.addView(textView2, tre.d(-1, -2.0f, (!z22 ? 5 : 3) | 48, !z22 ? 21 : 76, 24.0f, z22 ? 76 : 21, 0.0f));
                                ejVar.addView(djVar, tre.d(-2, -2.0f, (!ob6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                sg2Var = new sg2(1, eVar.getResourceProvider(), context);
                                sg2VarArr[0] = sg2Var;
                                if (!sg2Var.I) {
                                }
                                sg2VarArr[0].setBackgroundDrawable(aob.L0(false));
                                sg2VarArr[0].e(hl.S2(ob6.a0(null, null, 2131747507, lbc.r(user))), "", true, false, false);
                                sg2VarArr[0].setPadding(!ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, !ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                                sg2VarArr[0].c(true, false);
                                ejVar.addView(sg2VarArr[0], tre.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                sg2VarArr[0].setOnClickListener(new k1(atomicBoolean, (byte) 8));
                                if (lbc.B(user)) {
                                }
                                alertDialog$Builder.j(ob6.M0(2131744572, r8), new td(runnable, (byte) 2));
                                alertDialog$Builder.g(ob6.M0(2131752570, r8), r8);
                                eVar.showDialog(idVar);
                                djVar.setText(hl.N2(ob6.M0(2131752877, r8), -1, 0, new vd(idVar, context, (byte) 1), r8));
                            }

                            public static void m0(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, l01 l01Var, TLRPC.WebPage webPage, vnb vnbVar) {
                                if (hl.C1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (m01.h(str) || !z3 || "mailto".equalsIgnoreCase(scheme)) {
                                        m01.t(context, Uri.parse(str), j == 0, z2, z4 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), l01Var, null, false, true, false, false);
                                        return;
                                    }
                                    String d = m01.d(str, z);
                                    re2 re2Var = new re2(context, str, j, z2, l01Var);
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                                    String M0 = ob6.M0(2131747506, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(d);
                                    textView.setTextSize(1, 14.0f);
                                    int i = aob.j5;
                                    yob.X(textView, i, vnbVar);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(hl.L(14.0f), hl.L(12.0f), hl.L(14.0f), hl.L(12.0f));
                                    ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i, vnbVar)));
                                    uob K = yob.K(0.06f, i);
                                    textView.setBackground(b0);
                                    yob.j(textView, b0, K, null, vnbVar);
                                    LinearLayout j2 = uh9.j(context, 1);
                                    j2.addView(textView, tre.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i2 = yxc.f;
                                    if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                        yxc yxcVar = new yxc(context, vnbVar);
                                        yxcVar.setWebPage(webPage);
                                        j2.addView(yxcVar, tre.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder.n(j2);
                                    idVar.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
                                    alertDialog$Builder.j(ob6.M0(2131747544, null), new m0(re2Var, (byte) 16));
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    alertDialog$Builder.o();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [fd, java.lang.String, vnb] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(e eVar, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r5;
                                Context context = eVar.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                zi ziVar = new zi(context, null);
                                jn7.i(ziVar);
                                yob.X(ziVar, aob.j5, null);
                                yob.G(ziVar, aob.Xc, null);
                                ziVar.setTextSize(1, 16.0f);
                                ziVar.setGravity((ob6.a0 ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                id idVar = alertDialog$Builder.a;
                                idVar.H = (byte) 6;
                                alertDialog$Builder.n(frameLayout);
                                rb0 rb0Var = new rb0((vnb) null);
                                rb0Var.s(hl.L(18.0f));
                                de0 de0Var = new de0(context);
                                de0Var.setRoundRadius(hl.L(20.0f));
                                frameLayout.addView(de0Var, tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                ema emaVar = new ema(context);
                                yob.W(emaVar, aob.E8, null);
                                emaVar.setTextSize(20);
                                emaVar.setTypeface(hl.o());
                                emaVar.setGravity((ob6.a0 ? 5 : 3) | 16);
                                emaVar.setEllipsizeByGradient(true);
                                emaVar.l(user.first_name, false);
                                if (user.scam) {
                                    emaVar.i(aob.f1);
                                } else if (user.fake) {
                                    emaVar.i(aob.g1);
                                } else if (user.verified) {
                                    Drawable e = c00.e(context, R.drawable.verified_area);
                                    int i = aob.z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    yob.x(emaVar, e, i, null, mode);
                                    Drawable e2 = c00.e(context, R.drawable.verified_check);
                                    yob.x(emaVar, e2, aob.A9, null, mode);
                                    emaVar.i(new zm2(e, e2));
                                }
                                TextView textView = new TextView(context);
                                yob.X(textView, aob.m5, null);
                                ik8.w(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new sd(user, eVar, alertDialog$Builder, (byte) 0));
                                SpannableString valueOf = SpannableString.valueOf(ob6.M0(2131748089, null).concat("  "));
                                wm2 wm2Var = new wm2(R.drawable.attach_arrow_right, 0);
                                wm2Var.n = 1;
                                wm2Var.c(hl.L(10.0f));
                                valueOf.setSpan(wm2Var, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z = ob6.a0;
                                frameLayout.addView(emaVar, tre.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 76, 0.0f, z ? 76 : 21, 0.0f));
                                boolean z2 = ob6.a0;
                                frameLayout.addView(textView, tre.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 24.0f, z2 ? 76 : 21, 0.0f));
                                frameLayout.addView(ziVar, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (lbc.B(user)) {
                                    rb0Var.p = 0.8f;
                                    rb0Var.f(12);
                                    r5 = 0;
                                    de0Var.m(null, null, rb0Var, user);
                                } else {
                                    r5 = 0;
                                    rb0Var.p = 1.0f;
                                    eVar.getCurrentAccount();
                                    rb0Var.q(user);
                                    de0Var.f(user, rb0Var);
                                }
                                byte b = 0;
                                alertDialog$Builder.j(ob6.M0(2131744572, r5), new td(runnable, b));
                                alertDialog$Builder.g(ob6.M0(2131752570, r5), r5);
                                eVar.showDialog(idVar, false, new ud(runnable2, b));
                                ziVar.setText(hl.N2(ob6.M0(2131752877, r5), -1, 0, new vd(idVar, context, b), r5));
                            }

                            public static void n0(e eVar, String str, boolean z, boolean z2) {
                                o0(eVar, str, z, true, z2, false, null, null, null);
                            }

                            public static z8d o(Activity activity, df7 df7Var, vnb vnbVar) {
                                if (activity == null) {
                                    return null;
                                }
                                z8d z8dVar = new z8d(activity, vnbVar);
                                ((nx0) z8dVar.b).w0 = false;
                                hq7 hq7Var = new hq7(activity, vnbVar);
                                hq7Var.setTextOffset(hl.L(10.0f));
                                hq7Var.setItemCount(5);
                                hq7 hq7Var2 = new hq7(activity, vnbVar);
                                hq7Var2.setItemCount(5);
                                hq7Var2.setTextOffset(-hl.L(10.0f));
                                hq7 hq7Var3 = new hq7(activity, vnbVar);
                                hq7Var3.setItemCount(5);
                                hq7Var3.setTextOffset(-hl.L(24.0f));
                                ai aiVar = new ai(activity, hq7Var, hq7Var2, hq7Var3, (byte) 6);
                                aiVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                aiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(ob6.M0(2131752097, null));
                                qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
                                frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new q8((byte) 10));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                aiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                xb xbVar = new xb(activity, (byte) 7);
                                linearLayout.addView(hq7Var, tre.l(0.25f, 0, jn7.s4));
                                hq7Var.setMinValue(1);
                                hq7Var.setMaxValue(31);
                                hq7Var.setWrapSelectorWheel(false);
                                hq7Var.setFormatter(new bg((byte) 11));
                                rf rfVar = new rf(hq7Var, hq7Var2, hq7Var3, (byte) 2);
                                hq7Var.setOnValueChangedListener(rfVar);
                                hq7Var2.setMinValue(0);
                                hq7Var2.setMaxValue(11);
                                hq7Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(hq7Var2, tre.l(0.5f, 0, jn7.s4));
                                hq7Var2.setFormatter(new bg((byte) 12));
                                hq7Var2.setOnValueChangedListener(rfVar);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i2 = calendar.get(1);
                                hq7Var3.setMinValue(i);
                                hq7Var3.setMaxValue(i2);
                                hq7Var3.setWrapSelectorWheel(false);
                                hq7Var3.setFormatter(new bg((byte) 13));
                                linearLayout.addView(hq7Var3, tre.l(0.25f, 0, jn7.s4));
                                hq7Var3.setOnValueChangedListener(rfVar);
                                hq7Var.setValue(31);
                                hq7Var2.setValue(12);
                                hq7Var3.setValue(i2);
                                b(hq7Var, hq7Var2, hq7Var3);
                                xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                xbVar.setGravity(17);
                                yob.X(xbVar, aob.Ji, vnbVar);
                                xbVar.setTextSize(1, 14.0f);
                                xbVar.setTypeface(hl.o());
                                xbVar.setText(ob6.M0(2131748819, null));
                                int L = hl.L(8.0f);
                                int i3 = aob.Fi;
                                int v0 = aob.v0(i3, vnbVar);
                                int i4 = aob.Hi;
                                int v02 = aob.v0(i4, vnbVar);
                                hf0 i0 = aob.i0(L, L, L, L, v0, v02, v02);
                                uob M = yob.M(i3);
                                uob M2 = yob.M(i4);
                                xbVar.setBackground(i0);
                                yob.j(xbVar, i0, M, M2, vnbVar);
                                aiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
                                xbVar.setOnClickListener(new xf(hq7Var, hq7Var2, hq7Var3, calendar, df7Var, z8dVar, (byte) 2));
                                ((nx0) z8dVar.b).O = aiVar;
                                return z8dVar;
                            }

                            public static void o0(e eVar, String str, boolean z, boolean z2, boolean z3, boolean z4, l01 l01Var, TLRPC.WebPage webPage, vnb vnbVar) {
                                if (eVar == null || eVar.getParentActivity() == null) {
                                    return;
                                }
                                m0(eVar.getParentActivity(), str, z, z2, z3, z4, eVar instanceof zu1 ? ((zu1) eVar).x8 : 0L, l01Var, webPage, vnbVar);
                            }

                            public static void p(e eVar, TLRPC.User user, boolean z) {
                                String M0;
                                String a0;
                                if (eVar.getParentActivity() == null || user == null || lbc.z(user) || yac.h(eVar.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                eVar.getCurrentAccount();
                                Activity parentActivity = eVar.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                byte b = 0;
                                if (z) {
                                    M0 = ob6.M0(2131743264, null);
                                    a0 = ob6.a0("VideoCallAlert", null, 2131743265, lbc.r(user));
                                } else {
                                    M0 = ob6.M0(2131752612, null);
                                    a0 = ob6.a0("CallAlert", null, 2131752613, lbc.r(user));
                                }
                                vh vhVar = new vh(parentActivity);
                                jn7.i(vhVar);
                                yob.X(vhVar, aob.j5, null);
                                vhVar.setTextSize(1, 16.0f);
                                vhVar.setGravity((ob6.a0 ? 5 : 3) | 48);
                                vhVar.setText(hl.S2(a0));
                                rb0 rb0Var = new rb0((vnb) null);
                                rb0Var.s(hl.L(12.0f));
                                rb0Var.p = 1.0f;
                                eVar.getCurrentAccount();
                                rb0Var.q(user);
                                de0 de0Var = new de0(parentActivity);
                                de0Var.setRoundRadius(hl.L(20.0f));
                                de0Var.f(user, rb0Var);
                                frameLayout.addView(de0Var, tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                qd4.w(textView, aob.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(M0);
                                boolean z2 = ob6.a0;
                                frameLayout.addView(textView, tre.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
                                frameLayout.addView(vhVar, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.j(ob6.M0(2131752615, null), new bh(eVar, user, z, b));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                eVar.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(Activity activity, int i, Runnable runnable, boolean z, vnb vnbVar) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i2 = uc7.s1(i).g3;
                                if ((i2 & 1) != 0) {
                                    c00.s(null, 2131748440, arrayList, 0, arrayList2);
                                }
                                if ((i2 & 2) != 0) {
                                    c00.s(null, 2131748442, arrayList, 1, arrayList2);
                                }
                                if ((i2 & 4) != 0) {
                                    c00.s(null, 2131748438, arrayList, 3, arrayList2);
                                }
                                arrayList.add(ob6.M0(2131748441, null));
                                byte b = 2;
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
                                alertDialog$Builder.a.S = ob6.M0(2131748439, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.n(linearLayout);
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    j29 j29Var = new j29(activity, vnbVar);
                                    j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                                    j29Var.setTag(Integer.valueOf(i3));
                                    a(j29Var, aob.g7, aob.E5, null);
                                    j29Var.b((CharSequence) arrayList.get(i3), xea.l0 == ((Integer) arrayList2.get(i3)).intValue());
                                    int i4 = aob.i6;
                                    hf0 f0 = aob.f0(aob.w0(null, i4, false), 2, -1);
                                    uob M = yob.M(i4);
                                    j29Var.setBackground(f0);
                                    yob.j(j29Var, f0, null, M, null);
                                    linearLayout.addView(j29Var);
                                    j29Var.setOnClickListener(new c0(arrayList2, runnable, alertDialog$Builder, b));
                                }
                                if (!z) {
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                }
                                id o = alertDialog$Builder.o();
                                if (z) {
                                    o.setCanceledOnTouchOutside(false);
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x0180, code lost:
                            
                                if (xc2.p0(r35) == false) goto L60;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x0198, code lost:
                            
                                r8 = new sg2(1, r38, r6);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(aob.L0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01a8, code lost:
                            
                                if (r35 == null) goto L63;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01aa, code lost:
                            
                                r11[0].e(ob6.M0(2131751489, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01dd, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e3, code lost:
                            
                                if (ob6.a0 == false) goto L67;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e5, code lost:
                            
                                r4 = hl.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01f0, code lost:
                            
                                if (ob6.a0 == false) goto L72;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01f2, code lost:
                            
                                r5 = hl.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01fd, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], tre.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new de(r1, 2));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01f8, code lost:
                            
                                r5 = hl.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01ea, code lost:
                            
                                r4 = hl.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01bf, code lost:
                            
                                r11[0].e(ob6.a0("DeleteMessagesOptionAlso", null, 2131751490, lbc.k(r34, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
                            
                                if (xc2.p0(r35) == false) goto L60;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(e eVar, int i, TLRPC.User user, TLRPC.Chat chat, boolean z, bf7 bf7Var, vnb vnbVar) {
                                boolean z2;
                                if (eVar == null || eVar.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = eVar.getCurrentAccount();
                                Activity parentActivity = eVar.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, parentActivity);
                                long e = yac.h(currentAccount).e();
                                sg2[] sg2VarArr = new sg2[1];
                                th thVar = new th(parentActivity);
                                jn7.i(thVar);
                                yob.X(thVar, aob.j5, null);
                                thVar.setTextSize(1, 16.0f);
                                thVar.setGravity((ob6.a0 ? 5 : 3) | 48);
                                uh uhVar = new uh(parentActivity, sg2VarArr);
                                alertDialog$Builder.n(uhVar);
                                TextView textView = new TextView(parentActivity);
                                qd4.w(textView, aob.E8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                uhVar.addView(textView, tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                uhVar.addView(thVar, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i == -1) {
                                    textView.setText(ob6.a0("ClearHistory", null, 2131752054, new Object[0]));
                                    if (user != null) {
                                        thVar.setText(hl.S2(ob6.a0("AreYouSureClearHistoryWithUser", null, 2131754100, lbc.r(user))));
                                    } else if (z) {
                                        if (xc2.V(chat)) {
                                            thVar.setText(hl.S2(ob6.a0("AreYouSureClearHistoryWithChannel", null, 2131754103, chat.title)));
                                            z2 = false;
                                        } else {
                                            thVar.setText(hl.S2(ob6.a0("AreYouSureClearHistoryWithChat", null, 2131754102, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        thVar.setText(ob6.M0(2131754105, null));
                                    } else {
                                        thVar.setText(ob6.M0(2131754107, null));
                                    }
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    textView.setText(ob6.G(i, "DeleteDays", new Object[0]));
                                    thVar.setText(ob6.M0(2131751500, null));
                                }
                                boolean[] zArr = new boolean[1];
                                zArr[z2 ? 1 : 0] = z2;
                                if (chat != null && z && xc2.t0(chat)) {
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
                                        if (!xc2.t0(chat)) {
                                            if (!xc2.V(chat)) {
                                            }
                                        }
                                    }
                                }
                                CharSequence M0 = ob6.M0(2131751563, null);
                                if (chat != null && z && xc2.t0(chat) && !xc2.V(chat)) {
                                    M0 = ob6.M0(2131752056, null);
                                }
                                alertDialog$Builder.j(M0, new o(bf7Var, zArr, (byte) 10));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                id idVar = alertDialog$Builder.a;
                                eVar.showDialog(idVar);
                                TextView textView2 = (TextView) idVar.c(-1);
                                if (textView2 != null) {
                                    yob.X(textView2, aob.q7, null);
                                }
                            }

                            public static void q0(int i, vnb vnbVar, e eVar) {
                                if (i == 0 || eVar == null || eVar.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, eVar.getParentActivity());
                                String M0 = ob6.M0(2131743571, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                if (i == 1) {
                                    idVar.U = ob6.M0(2131751052, null);
                                } else if (i == 2) {
                                    idVar.U = ob6.M0(2131751064, null);
                                } else if (i == 3) {
                                    idVar.U = ob6.M0(2131751058, null);
                                } else if (i == 4) {
                                    idVar.U = ob6.M0(2131751051, null);
                                } else if (i == 5) {
                                    idVar.U = ob6.M0(2131751063, null);
                                } else if (i == 6) {
                                    idVar.U = ob6.M0(2131751057, null);
                                } else if (i == 7) {
                                    idVar.U = ob6.M0(2131751055, null);
                                } else if (i == 8) {
                                    idVar.U = ob6.M0(2131751056, null);
                                } else if (i == 9) {
                                    idVar.U = ob6.M0(2131751047, null);
                                } else if (i == 10) {
                                    idVar.U = ob6.M0(2131751059, null);
                                } else if (i == 11) {
                                    idVar.U = ob6.M0(2131751048, null);
                                } else if (i == 12) {
                                    idVar.U = ob6.M0(2131751060, null);
                                } else if (i == 13) {
                                    idVar.U = ob6.M0(2131751045, null);
                                } else if (i == 14) {
                                    idVar.U = ob6.M0(2131751046, null);
                                } else if (i == 15) {
                                    idVar.U = ob6.M0(2131751053, null);
                                } else if (i == 16) {
                                    idVar.U = ob6.M0(2131751054, null);
                                } else if (i == 17) {
                                    idVar.U = ob6.M0(2131751065, null);
                                } else if (i == 18) {
                                    idVar.U = ob6.M0(2131751066, null);
                                } else if (i == 19) {
                                    idVar.U = ob6.M0(2131751061, null);
                                } else if (i == 20) {
                                    idVar.U = ob6.M0(2131751062, null);
                                } else if (i == 21) {
                                    idVar.U = ob6.M0(2131751049, null);
                                } else if (i == 22) {
                                    idVar.U = ob6.M0(2131751050, null);
                                }
                                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                eVar.showDialog(idVar, true, null);
                            }

                            public static void r(e eVar, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, bf7 bf7Var) {
                                s(eVar, z, false, chat, user, z2, z3, z4, z5, bf7Var, eVar != null ? eVar.getResourceProvider() : null);
                            }

                            public static id r0(e eVar, String str, String str2, vnb vnbVar) {
                                if (eVar == null) {
                                    eVar = LaunchActivity.S();
                                }
                                if (str2 == null || eVar == null || eVar.getParentActivity() == null) {
                                    return null;
                                }
                                id idVar = L(eVar.getParentActivity(), str, str2, null, null, vnbVar).a;
                                eVar.showDialog(idVar);
                                return idVar;
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
                            public static void s(final e eVar, final boolean z, final boolean z2, final TLRPC.Chat chat, final TLRPC.User user, final boolean z3, final boolean z4, boolean z5, final boolean z6, final bf7 bf7Var, final vnb vnbVar) {
                                long j;
                                boolean z7;
                                rb0 rb0Var;
                                TLRPC.Chat chat2;
                                sg2[] sg2VarArr;
                                ph phVar;
                                ArrayList arrayList;
                                id idVar;
                                rb0 rb0Var2;
                                float f;
                                float f2;
                                boolean z8;
                                rb0 rb0Var3;
                                boolean z9;
                                boolean z10;
                                String str;
                                CharSequence M0;
                                TextView textView;
                                if (eVar == null || eVar.getParentActivity() == null) {
                                    return;
                                }
                                if (chat == null && user == null) {
                                    return;
                                }
                                final int currentAccount = eVar.getCurrentAccount();
                                final Activity parentActivity = eVar.getParentActivity();
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, parentActivity);
                                long e = yac.h(currentAccount).e();
                                sg2[] sg2VarArr2 = new sg2[1];
                                ph phVar2 = new ph(parentActivity);
                                jn7.i(phVar2);
                                yob.X(phVar2, aob.j5, null);
                                phVar2.setTextSize(1, 16.0f);
                                phVar2.setGravity((ob6.a0 ? 5 : 3) | 48);
                                if (!z6 && xc2.T(chat) && xc2.t0(chat)) {
                                    j = e;
                                    z7 = true;
                                } else {
                                    j = e;
                                    z7 = false;
                                }
                                qh qhVar = new qh(parentActivity, sg2VarArr2);
                                id idVar2 = alertDialog$Builder.a;
                                idVar2.H = (byte) 6;
                                alertDialog$Builder.n(qhVar);
                                rb0 rb0Var4 = new rb0((vnb) null);
                                rb0Var4.s(hl.L(18.0f));
                                de0 de0Var = new de0(parentActivity);
                                de0Var.setRoundRadius(hl.L(15.0f));
                                qhVar.addView(de0Var, tre.d(30, 30.0f, (ob6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                in inVar = new in(parentActivity, false, false, false);
                                yob.U(inVar, aob.E8, null);
                                inVar.setTextSize(hl.L(20.0f));
                                inVar.setTypeface(hl.o());
                                inVar.setGravity((ob6.a0 ? 5 : 3) | 16);
                                inVar.setEllipsizeByGradient(true);
                                final boolean z11 = z7;
                                if (z) {
                                    if (z7) {
                                        inVar.setText(ob6.M0(2131752053, null));
                                    } else {
                                        inVar.setText(ob6.M0(2131752054, null));
                                    }
                                } else if (chat == null) {
                                    inVar.setText(ob6.M0(2131751518, null));
                                } else if (xc2.Y(chat)) {
                                    inVar.setText(ob6.M0(2131751899, null));
                                } else if (!xc2.T(chat)) {
                                    inVar.setText(ob6.M0(2131748745, null));
                                } else if (chat.monoforum) {
                                    inVar.setText(ob6.M0(2131748749, null));
                                } else if (chat.megagroup) {
                                    inVar.setText(ob6.M0(2131748745, null));
                                } else {
                                    inVar.setText(ob6.M0(2131748758, null));
                                }
                                boolean z12 = ob6.a0;
                                qhVar.addView(inVar, tre.d(-1, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 22 : 65, 7.66f, z12 ? 65 : 22, 0.0f));
                                qhVar.addView(phVar2, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (xc2.p0(chat)) {
                                    rb0Var = rb0Var4;
                                    chat2 = eVar.getMessagesController().u1(chat.id);
                                } else {
                                    rb0Var = rb0Var4;
                                    chat2 = null;
                                }
                                boolean z13 = !z3 && user != null && (user != null && !user.bot && (user.id > j ? 1 : (user.id == j ? 0 : -1)) != 0 && uc7.s1(currentAccount).V2) && (user != null ? uc7.s1(currentAccount).U2 : uc7.s1(currentAccount).T2) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    sg2VarArr = sg2VarArr2;
                                    phVar = phVar2;
                                    arrayList = (ArrayList) uc7.s1(currentAccount).S.f(user.id);
                                } else {
                                    sg2VarArr = sg2VarArr2;
                                    phVar = phVar2;
                                    arrayList = null;
                                }
                                boolean z14 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((r47) arrayList.get(0)).k == null || (!(((r47) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((r47) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f = 10.0f;
                                    if (user.bot) {
                                        rb0Var2 = rb0Var;
                                        f2 = 8.0f;
                                        if (user.id != 489000) {
                                            sg2 sg2Var = new sg2(1, vnbVar, parentActivity);
                                            sg2VarArr[0] = sg2Var;
                                            sg2Var.setBackground(aob.L0(false));
                                            sg2VarArr[0].e(ob6.M0(2131753687, null), "", false, false, false);
                                            idVar = idVar2;
                                            sg2VarArr[0].setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), hl.L(10.0f), ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), hl.L(10.0f));
                                            sg2 sg2Var2 = sg2VarArr[0];
                                            zArr[0] = true;
                                            sg2Var2.c(true, false);
                                            sg2VarArr[0].setMultiline(true);
                                            qhVar.addView(sg2VarArr[0], tre.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            sg2VarArr[0].setOnClickListener(new de(zArr, (byte) 1));
                                            rb0Var3 = rb0Var2;
                                            z9 = false;
                                            if (user == null) {
                                                rb0 rb0Var5 = rb0Var3;
                                                if (lbc.B(user)) {
                                                    rb0Var5.p = 0.6f;
                                                    rb0Var5.f(12);
                                                    de0Var.m(null, null, rb0Var5, user);
                                                } else if (user.id == j) {
                                                    rb0Var5.p = 0.6f;
                                                    rb0Var5.f(1);
                                                    de0Var.m(null, null, rb0Var5, user);
                                                } else {
                                                    rb0Var5.p = 1.0f;
                                                    eVar.getCurrentAccount();
                                                    rb0Var5.q(user);
                                                    de0Var.f(user, rb0Var5);
                                                }
                                            } else {
                                                rb0 rb0Var6 = rb0Var3;
                                                eVar.getCurrentAccount();
                                                rb0Var6.p(chat2 != null ? chat2 : chat);
                                                de0Var.f(chat2 != null ? chat2 : chat, rb0Var6);
                                            }
                                            if (z2) {
                                                ph phVar3 = phVar;
                                                if (!z) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z3) {
                                                            phVar3.setText(hl.S2(ob6.a0(null, null, 2131754080, lbc.r(user))));
                                                        } else if (user.id == j) {
                                                            phVar3.setText(hl.S2(ob6.M0(2131754083, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            phVar3.setText(hl.S2(ob6.a0(null, null, 2131754079, lbc.r(user))));
                                                        } else {
                                                            str = null;
                                                            phVar3.setText(hl.S2(ob6.a0(null, null, 2131754081, lbc.r(user))));
                                                        }
                                                    } else if (xc2.T(chat)) {
                                                        String a0 = chat2 != null ? ob6.a0(null, null, 2131748100, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            phVar3.setText(hl.S2(ob6.a0(null, null, 2131748397, a0)));
                                                        } else {
                                                            phVar3.setText(hl.S2(ob6.a0(null, null, 2131752361, a0)));
                                                        }
                                                    } else {
                                                        phVar3.setText(hl.S2(ob6.a0(null, null, 2131754097, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a02 = chat2 != null ? ob6.a0(null, null, 2131748100, chat2.title) : chat.title;
                                                    if (!xc2.T(chat) || (chat.megagroup && !xc2.t0(chat))) {
                                                        str = null;
                                                        phVar3.setText(hl.S2(ob6.a0(null, null, 2131754102, a02)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        phVar3.setText(ob6.M0(2131754105, null));
                                                    } else {
                                                        str = null;
                                                        phVar3.setText(ob6.M0(2131754107, null));
                                                    }
                                                } else if (z3) {
                                                    str = null;
                                                    phVar3.setText(hl.S2(ob6.a0(null, null, 2131754101, lbc.r(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j) {
                                                        phVar3.setText(hl.S2(ob6.M0(2131754104, null)));
                                                    } else {
                                                        phVar3.setText(hl.S2(ob6.a0(null, null, 2131754100, lbc.r(user))));
                                                    }
                                                }
                                            } else if (lbc.D(user)) {
                                                str = null;
                                                phVar.setText(hl.S2(ob6.M0(2131751546, null)));
                                            } else {
                                                ph phVar4 = phVar;
                                                str = null;
                                                if (chat == null || !xc2.V(chat)) {
                                                    phVar4.setText(hl.S2(ob6.M0(2131751550, null)));
                                                    str = null;
                                                } else {
                                                    phVar4.setText(hl.S2(ob6.M0(2131751549, null)));
                                                }
                                            }
                                            if (!z2) {
                                                M0 = ob6.M0(2131751555, str);
                                            } else if (z) {
                                                M0 = z11 ? ob6.M0(2131752053, str) : ob6.M0(2131752055, str);
                                            } else if (z9 && zArr[0]) {
                                                M0 = ob6.M0(xc2.V(chat) ? 2131752396 : 2131751495, str);
                                            } else {
                                                M0 = xc2.T(chat) ? chat.monoforum ? ob6.M0(2131748749, str) : chat.megagroup ? ob6.M0(2131748744, str) : ob6.M0(2131748756, str) : ob6.M0(2131751518, str);
                                            }
                                            id idVar3 = idVar;
                                            alertDialog$Builder.j(M0, new fd() { // from class: mg
                                                @Override // fd
                                                public final void w(id idVar4, int i) {
                                                    boolean z15 = z11;
                                                    final boolean z16 = z2;
                                                    final boolean[] zArr2 = zArr;
                                                    final bf7 bf7Var2 = bf7Var;
                                                    boolean z17 = true;
                                                    if (!z15 && !z16 && !z3) {
                                                        final TLRPC.User user2 = user;
                                                        boolean D = lbc.D(user2);
                                                        final e eVar2 = eVar;
                                                        final boolean z18 = z;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z19 = z4;
                                                        final boolean z20 = z6;
                                                        final vnb vnbVar2 = vnbVar;
                                                        if (D) {
                                                            jj.s(eVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, bf7Var2, vnbVar2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            jf7 Y = jf7.Y(eVar2.getCurrentAccount());
                                                            Y.a.c(new ke7(Y, user2.id, new df7() { // from class: fe
                                                                @Override // df7
                                                                public final void a(int i2) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    bf7 bf7Var3 = bf7Var2;
                                                                    if (i2 < 50) {
                                                                        bf7Var3.A(zArr3[0]);
                                                                    } else {
                                                                        jj.s(e.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, bf7Var3, vnbVar2);
                                                                    }
                                                                }
                                                            }, (byte) 0));
                                                            return;
                                                        }
                                                        if (xc2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final l01 g = alertDialog$Builder.a.g(-1, true, true);
                                                            g.d();
                                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                            tL_channels_getFutureCreatorAfterLeave.channel = uc7.i1(chat3);
                                                            final int i2 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                            ic icVar = new ic((byte) 0);
                                                            final Activity activity = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, icVar, new icc() { // from class: ge
                                                                @Override // icc
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    l01.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    bf7 bf7Var3 = bf7Var2;
                                                                    if (user4 == null) {
                                                                        bf7Var3.A(z16 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Activity activity2 = activity;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    te teVar = new te(activity2, chat4, user4, i2, bf7Var3, vnbVar2, (byte) 0);
                                                                    ue ueVar = new ue(bf7Var3, (byte) 0);
                                                                    e eVar3 = eVar2;
                                                                    if (eVar3 == null || eVar3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context = eVar3.getContext();
                                                                    TLRPC.User f3 = yac.h(eVar3.getCurrentAccount()).f();
                                                                    boolean V = xc2.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    de0 de0Var2 = new de0(context);
                                                                    rb0 rb0Var7 = new rb0((vnb) null);
                                                                    rb0Var7.q(f3);
                                                                    de0Var2.setRoundRadius(hl.L(30.0f));
                                                                    de0Var2.f(f3, rb0Var7);
                                                                    frameLayout.addView(de0Var2, tre.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    yob.s(imageView, aob.d7, eVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, tre.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    rh rhVar = new rh(context);
                                                                    rb0 rb0Var8 = new rb0((vnb) null);
                                                                    rb0Var8.q(user4);
                                                                    rhVar.setRoundRadius(hl.L(30.0f));
                                                                    rhVar.f(user4, rb0Var8);
                                                                    frameLayout.addView(rhVar, tre.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    de0 de0Var3 = new de0(context);
                                                                    rb0 rb0Var9 = new rb0((vnb) null);
                                                                    rb0Var9.p(chat4);
                                                                    de0Var3.setRoundRadius(hl.L(12.0f));
                                                                    de0Var3.f(chat4, rb0Var9);
                                                                    frameLayout.addView(de0Var3, tre.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                    id idVar5 = alertDialog$Builder2.a;
                                                                    idVar5.P0 = -1.0f;
                                                                    idVar5.W = frameLayout;
                                                                    idVar5.S = ob6.M0(V ? 2131748754 : 2131748746, null);
                                                                    idVar5.U = hl.S2(ob6.a0(null, null, V ? 2131748755 : 2131748747, lbc.r(user4), chat4.title));
                                                                    alertDialog$Builder2.g(ob6.M0(2131754203, null), new m0(teVar, (byte) 11));
                                                                    alertDialog$Builder2.h(ob6.M0(2131752570, null), null);
                                                                    alertDialog$Builder2.j(ob6.M0(V ? 2131748758 : 2131748744, null), new m0(ueVar, (byte) 12));
                                                                    idVar5.show();
                                                                    View c = idVar5.c(-1);
                                                                    if (c instanceof TextView) {
                                                                        yob.X((TextView) c, aob.q7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        bf7Var2 = bf7Var2;
                                                    }
                                                    if (!z16 && !zArr2[0]) {
                                                        z17 = false;
                                                    }
                                                    bf7Var2.A(z17);
                                                }
                                            });
                                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                            eVar.showDialog(idVar3);
                                            textView = (TextView) idVar3.c(-1);
                                            if (textView == null) {
                                                yob.X(textView, aob.q7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        idVar = idVar2;
                                        if (!z2 || (((!z3 || z) && !z13) || lbc.z(user) || z14)) {
                                            z8 = (z4 || z || chat == null || !chat.creator) ? false : true;
                                            if (!z8) {
                                                rb0Var3 = rb0Var2;
                                                z9 = z8;
                                                if (user == null) {
                                                }
                                                if (z2) {
                                                }
                                                if (!z2) {
                                                }
                                                id idVar32 = idVar;
                                                alertDialog$Builder.j(M0, new fd() { // from class: mg
                                                    @Override // fd
                                                    public final void w(id idVar4, int i) {
                                                        boolean z15 = z11;
                                                        final boolean z16 = z2;
                                                        final boolean[] zArr2 = zArr;
                                                        final bf7 bf7Var2 = bf7Var;
                                                        boolean z17 = true;
                                                        if (!z15 && !z16 && !z3) {
                                                            final TLRPC.User user2 = user;
                                                            boolean D = lbc.D(user2);
                                                            final e eVar2 = eVar;
                                                            final boolean z18 = z;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z19 = z4;
                                                            final boolean z20 = z6;
                                                            final vnb vnbVar2 = vnbVar;
                                                            if (D) {
                                                                jj.s(eVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, bf7Var2, vnbVar2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                jf7 Y = jf7.Y(eVar2.getCurrentAccount());
                                                                Y.a.c(new ke7(Y, user2.id, new df7() { // from class: fe
                                                                    @Override // df7
                                                                    public final void a(int i2) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        bf7 bf7Var3 = bf7Var2;
                                                                        if (i2 < 50) {
                                                                            bf7Var3.A(zArr3[0]);
                                                                        } else {
                                                                            jj.s(e.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, bf7Var3, vnbVar2);
                                                                        }
                                                                    }
                                                                }, (byte) 0));
                                                                return;
                                                            }
                                                            if (xc2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final l01 g = alertDialog$Builder.a.g(-1, true, true);
                                                                g.d();
                                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                                tL_channels_getFutureCreatorAfterLeave.channel = uc7.i1(chat3);
                                                                final int i2 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                                ic icVar = new ic((byte) 0);
                                                                final Activity activity = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, icVar, new icc() { // from class: ge
                                                                    @Override // icc
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        l01.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        bf7 bf7Var3 = bf7Var2;
                                                                        if (user4 == null) {
                                                                            bf7Var3.A(z16 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Activity activity2 = activity;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        te teVar = new te(activity2, chat4, user4, i2, bf7Var3, vnbVar2, (byte) 0);
                                                                        ue ueVar = new ue(bf7Var3, (byte) 0);
                                                                        e eVar3 = eVar2;
                                                                        if (eVar3 == null || eVar3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context = eVar3.getContext();
                                                                        TLRPC.User f3 = yac.h(eVar3.getCurrentAccount()).f();
                                                                        boolean V = xc2.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        de0 de0Var2 = new de0(context);
                                                                        rb0 rb0Var7 = new rb0((vnb) null);
                                                                        rb0Var7.q(f3);
                                                                        de0Var2.setRoundRadius(hl.L(30.0f));
                                                                        de0Var2.f(f3, rb0Var7);
                                                                        frameLayout.addView(de0Var2, tre.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        yob.s(imageView, aob.d7, eVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, tre.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        rh rhVar = new rh(context);
                                                                        rb0 rb0Var8 = new rb0((vnb) null);
                                                                        rb0Var8.q(user4);
                                                                        rhVar.setRoundRadius(hl.L(30.0f));
                                                                        rhVar.f(user4, rb0Var8);
                                                                        frameLayout.addView(rhVar, tre.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        de0 de0Var3 = new de0(context);
                                                                        rb0 rb0Var9 = new rb0((vnb) null);
                                                                        rb0Var9.p(chat4);
                                                                        de0Var3.setRoundRadius(hl.L(12.0f));
                                                                        de0Var3.f(chat4, rb0Var9);
                                                                        frameLayout.addView(de0Var3, tre.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                        id idVar5 = alertDialog$Builder2.a;
                                                                        idVar5.P0 = -1.0f;
                                                                        idVar5.W = frameLayout;
                                                                        idVar5.S = ob6.M0(V ? 2131748754 : 2131748746, null);
                                                                        idVar5.U = hl.S2(ob6.a0(null, null, V ? 2131748755 : 2131748747, lbc.r(user4), chat4.title));
                                                                        alertDialog$Builder2.g(ob6.M0(2131754203, null), new m0(teVar, (byte) 11));
                                                                        alertDialog$Builder2.h(ob6.M0(2131752570, null), null);
                                                                        alertDialog$Builder2.j(ob6.M0(V ? 2131748758 : 2131748744, null), new m0(ueVar, (byte) 12));
                                                                        idVar5.show();
                                                                        View c = idVar5.c(-1);
                                                                        if (c instanceof TextView) {
                                                                            yob.X((TextView) c, aob.q7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            bf7Var2 = bf7Var2;
                                                        }
                                                        if (!z16 && !zArr2[0]) {
                                                            z17 = false;
                                                        }
                                                        bf7Var2.A(z17);
                                                    }
                                                });
                                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                                eVar.showDialog(idVar32);
                                                textView = (TextView) idVar32.c(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z8 = false;
                                        }
                                        sg2 sg2Var3 = new sg2(1, vnbVar, parentActivity);
                                        sg2VarArr[0] = sg2Var3;
                                        sg2Var3.setBackground(aob.L0(false));
                                        if (!z8) {
                                            if (!xc2.T(chat) || chat.megagroup) {
                                                sg2VarArr[0].e(ob6.M0(2131751501, null), "", false, false, false);
                                            } else {
                                                sg2VarArr[0].e(ob6.M0(2131751522, null), "", false, false, false);
                                            }
                                            z10 = true;
                                        } else if (z) {
                                            z10 = true;
                                            sg2VarArr[0].e(ob6.a0(null, null, 2131752045, lbc.k(user, true)), "", false, false, false);
                                        } else {
                                            z10 = true;
                                            sg2VarArr[0].e(ob6.a0(null, null, 2131751490, lbc.k(user, true)), "", false, false, false);
                                        }
                                        sg2VarArr[0].setMultiline(z10);
                                        rb0Var3 = rb0Var2;
                                        sg2VarArr[0].setPadding(!ob6.a0 ? hl.L(16.0f) : hl.L(f2), hl.L(f), !ob6.a0 ? hl.L(f2) : hl.L(16.0f), hl.L(f));
                                        qhVar.addView(sg2VarArr[0], tre.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        lg lgVar = new lg(z8, chat, alertDialog$Builder, zArr);
                                        sg2VarArr[0].setOnClickListener(new t(zArr, lgVar, (byte) 15));
                                        if (z5) {
                                            sg2 sg2Var4 = sg2VarArr[0];
                                            zArr[0] = true;
                                            sg2Var4.c(true, false);
                                            lgVar.run();
                                        }
                                        z9 = z8;
                                        if (user == null) {
                                        }
                                        if (z2) {
                                        }
                                        if (!z2) {
                                        }
                                        id idVar322 = idVar;
                                        alertDialog$Builder.j(M0, new fd() { // from class: mg
                                            @Override // fd
                                            public final void w(id idVar4, int i) {
                                                boolean z15 = z11;
                                                final boolean z16 = z2;
                                                final boolean[] zArr2 = zArr;
                                                final bf7 bf7Var2 = bf7Var;
                                                boolean z17 = true;
                                                if (!z15 && !z16 && !z3) {
                                                    final TLRPC.User user2 = user;
                                                    boolean D = lbc.D(user2);
                                                    final e eVar2 = eVar;
                                                    final boolean z18 = z;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z19 = z4;
                                                    final boolean z20 = z6;
                                                    final vnb vnbVar2 = vnbVar;
                                                    if (D) {
                                                        jj.s(eVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, bf7Var2, vnbVar2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        jf7 Y = jf7.Y(eVar2.getCurrentAccount());
                                                        Y.a.c(new ke7(Y, user2.id, new df7() { // from class: fe
                                                            @Override // df7
                                                            public final void a(int i2) {
                                                                boolean[] zArr3 = zArr2;
                                                                bf7 bf7Var3 = bf7Var2;
                                                                if (i2 < 50) {
                                                                    bf7Var3.A(zArr3[0]);
                                                                } else {
                                                                    jj.s(e.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, bf7Var3, vnbVar2);
                                                                }
                                                            }
                                                        }, (byte) 0));
                                                        return;
                                                    }
                                                    if (xc2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final l01 g = alertDialog$Builder.a.g(-1, true, true);
                                                        g.d();
                                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                        tL_channels_getFutureCreatorAfterLeave.channel = uc7.i1(chat3);
                                                        final int i2 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                        ic icVar = new ic((byte) 0);
                                                        final Activity activity = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, icVar, new icc() { // from class: ge
                                                            @Override // icc
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                l01.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                bf7 bf7Var3 = bf7Var2;
                                                                if (user4 == null) {
                                                                    bf7Var3.A(z16 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Activity activity2 = activity;
                                                                TLRPC.Chat chat4 = chat3;
                                                                te teVar = new te(activity2, chat4, user4, i2, bf7Var3, vnbVar2, (byte) 0);
                                                                ue ueVar = new ue(bf7Var3, (byte) 0);
                                                                e eVar3 = eVar2;
                                                                if (eVar3 == null || eVar3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context = eVar3.getContext();
                                                                TLRPC.User f3 = yac.h(eVar3.getCurrentAccount()).f();
                                                                boolean V = xc2.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                de0 de0Var2 = new de0(context);
                                                                rb0 rb0Var7 = new rb0((vnb) null);
                                                                rb0Var7.q(f3);
                                                                de0Var2.setRoundRadius(hl.L(30.0f));
                                                                de0Var2.f(f3, rb0Var7);
                                                                frameLayout.addView(de0Var2, tre.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                yob.s(imageView, aob.d7, eVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, tre.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                rh rhVar = new rh(context);
                                                                rb0 rb0Var8 = new rb0((vnb) null);
                                                                rb0Var8.q(user4);
                                                                rhVar.setRoundRadius(hl.L(30.0f));
                                                                rhVar.f(user4, rb0Var8);
                                                                frameLayout.addView(rhVar, tre.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                de0 de0Var3 = new de0(context);
                                                                rb0 rb0Var9 = new rb0((vnb) null);
                                                                rb0Var9.p(chat4);
                                                                de0Var3.setRoundRadius(hl.L(12.0f));
                                                                de0Var3.f(chat4, rb0Var9);
                                                                frameLayout.addView(de0Var3, tre.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                id idVar5 = alertDialog$Builder2.a;
                                                                idVar5.P0 = -1.0f;
                                                                idVar5.W = frameLayout;
                                                                idVar5.S = ob6.M0(V ? 2131748754 : 2131748746, null);
                                                                idVar5.U = hl.S2(ob6.a0(null, null, V ? 2131748755 : 2131748747, lbc.r(user4), chat4.title));
                                                                alertDialog$Builder2.g(ob6.M0(2131754203, null), new m0(teVar, (byte) 11));
                                                                alertDialog$Builder2.h(ob6.M0(2131752570, null), null);
                                                                alertDialog$Builder2.j(ob6.M0(V ? 2131748758 : 2131748744, null), new m0(ueVar, (byte) 12));
                                                                idVar5.show();
                                                                View c = idVar5.c(-1);
                                                                if (c instanceof TextView) {
                                                                    yob.X((TextView) c, aob.q7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    bf7Var2 = bf7Var2;
                                                }
                                                if (!z16 && !zArr2[0]) {
                                                    z17 = false;
                                                }
                                                bf7Var2.A(z17);
                                            }
                                        });
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                        eVar.showDialog(idVar322);
                                        textView = (TextView) idVar322.c(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        idVar = idVar2;
                                        rb0Var2 = rb0Var;
                                    }
                                } else {
                                    idVar = idVar2;
                                    rb0Var2 = rb0Var;
                                    f = 10.0f;
                                }
                                f2 = 8.0f;
                                if (z2) {
                                }
                                if (z4) {
                                }
                                if (!z8) {
                                }
                                sg2 sg2Var32 = new sg2(1, vnbVar, parentActivity);
                                sg2VarArr[0] = sg2Var32;
                                sg2Var32.setBackground(aob.L0(false));
                                if (!z8) {
                                }
                                sg2VarArr[0].setMultiline(z10);
                                rb0Var3 = rb0Var2;
                                sg2VarArr[0].setPadding(!ob6.a0 ? hl.L(16.0f) : hl.L(f2), hl.L(f), !ob6.a0 ? hl.L(f2) : hl.L(16.0f), hl.L(f));
                                qhVar.addView(sg2VarArr[0], tre.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                lg lgVar2 = new lg(z8, chat, alertDialog$Builder, zArr);
                                sg2VarArr[0].setOnClickListener(new t(zArr, lgVar2, (byte) 15));
                                if (z5) {
                                }
                                z9 = z8;
                                if (user == null) {
                                }
                                if (z2) {
                                }
                                if (!z2) {
                                }
                                id idVar3222 = idVar;
                                alertDialog$Builder.j(M0, new fd() { // from class: mg
                                    @Override // fd
                                    public final void w(id idVar4, int i) {
                                        boolean z15 = z11;
                                        final boolean z16 = z2;
                                        final boolean[] zArr2 = zArr;
                                        final bf7 bf7Var2 = bf7Var;
                                        boolean z17 = true;
                                        if (!z15 && !z16 && !z3) {
                                            final TLRPC.User user2 = user;
                                            boolean D = lbc.D(user2);
                                            final e eVar2 = eVar;
                                            final boolean z18 = z;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z19 = z4;
                                            final boolean z20 = z6;
                                            final vnb vnbVar2 = vnbVar;
                                            if (D) {
                                                jj.s(eVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, bf7Var2, vnbVar2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                jf7 Y = jf7.Y(eVar2.getCurrentAccount());
                                                Y.a.c(new ke7(Y, user2.id, new df7() { // from class: fe
                                                    @Override // df7
                                                    public final void a(int i2) {
                                                        boolean[] zArr3 = zArr2;
                                                        bf7 bf7Var3 = bf7Var2;
                                                        if (i2 < 50) {
                                                            bf7Var3.A(zArr3[0]);
                                                        } else {
                                                            jj.s(e.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, bf7Var3, vnbVar2);
                                                        }
                                                    }
                                                }, (byte) 0));
                                                return;
                                            }
                                            if (xc2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final l01 g = alertDialog$Builder.a.g(-1, true, true);
                                                g.d();
                                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                tL_channels_getFutureCreatorAfterLeave.channel = uc7.i1(chat3);
                                                final int i2 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                ic icVar = new ic((byte) 0);
                                                final Activity activity = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, icVar, new icc() { // from class: ge
                                                    @Override // icc
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        l01.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        bf7 bf7Var3 = bf7Var2;
                                                        if (user4 == null) {
                                                            bf7Var3.A(z16 || zArr2[0]);
                                                            return;
                                                        }
                                                        Activity activity2 = activity;
                                                        TLRPC.Chat chat4 = chat3;
                                                        te teVar = new te(activity2, chat4, user4, i2, bf7Var3, vnbVar2, (byte) 0);
                                                        ue ueVar = new ue(bf7Var3, (byte) 0);
                                                        e eVar3 = eVar2;
                                                        if (eVar3 == null || eVar3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context = eVar3.getContext();
                                                        TLRPC.User f3 = yac.h(eVar3.getCurrentAccount()).f();
                                                        boolean V = xc2.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        de0 de0Var2 = new de0(context);
                                                        rb0 rb0Var7 = new rb0((vnb) null);
                                                        rb0Var7.q(f3);
                                                        de0Var2.setRoundRadius(hl.L(30.0f));
                                                        de0Var2.f(f3, rb0Var7);
                                                        frameLayout.addView(de0Var2, tre.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        yob.s(imageView, aob.d7, eVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, tre.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        rh rhVar = new rh(context);
                                                        rb0 rb0Var8 = new rb0((vnb) null);
                                                        rb0Var8.q(user4);
                                                        rhVar.setRoundRadius(hl.L(30.0f));
                                                        rhVar.f(user4, rb0Var8);
                                                        frameLayout.addView(rhVar, tre.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        de0 de0Var3 = new de0(context);
                                                        rb0 rb0Var9 = new rb0((vnb) null);
                                                        rb0Var9.p(chat4);
                                                        de0Var3.setRoundRadius(hl.L(12.0f));
                                                        de0Var3.f(chat4, rb0Var9);
                                                        frameLayout.addView(de0Var3, tre.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                        id idVar5 = alertDialog$Builder2.a;
                                                        idVar5.P0 = -1.0f;
                                                        idVar5.W = frameLayout;
                                                        idVar5.S = ob6.M0(V ? 2131748754 : 2131748746, null);
                                                        idVar5.U = hl.S2(ob6.a0(null, null, V ? 2131748755 : 2131748747, lbc.r(user4), chat4.title));
                                                        alertDialog$Builder2.g(ob6.M0(2131754203, null), new m0(teVar, (byte) 11));
                                                        alertDialog$Builder2.h(ob6.M0(2131752570, null), null);
                                                        alertDialog$Builder2.j(ob6.M0(V ? 2131748758 : 2131748744, null), new m0(ueVar, (byte) 12));
                                                        idVar5.show();
                                                        View c = idVar5.c(-1);
                                                        if (c instanceof TextView) {
                                                            yob.X((TextView) c, aob.q7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            bf7Var2 = bf7Var2;
                                        }
                                        if (!z16 && !zArr2[0]) {
                                            z17 = false;
                                        }
                                        bf7Var2.A(z17);
                                    }
                                });
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                eVar.showDialog(idVar3222);
                                textView = (TextView) idVar3222.c(-1);
                                if (textView == null) {
                                }
                            }

                            public static id s0(e eVar, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
                                TextView textView;
                                id M = M(eVar.getContext(), eVar.getResourceProvider(), str, charSequence, str2, runnable);
                                eVar.showDialog(M);
                                if (z && (textView = (TextView) M.c(-1)) != null) {
                                    yob.X(textView, aob.q7, null);
                                }
                                return M;
                            }

                            public static id t(Activity activity, final long j, final long j2, final int i, final Runnable runnable, vnb vnbVar) {
                                int i2;
                                SharedPreferences sharedPreferences = uc7.s1(yac.t0).W3;
                                final String p = ip7.p(j, j2, false);
                                if (j != 0) {
                                    StringBuilder sb = new StringBuilder("color_");
                                    sb.append(p);
                                    i2 = sharedPreferences.contains(sb.toString()) ? qu6.g("color_", p, sharedPreferences, -16776961) : wf3.y(j) ? sharedPreferences.getInt("GroupLed", -16776961) : sharedPreferences.getInt("MessagesLed", -16776961);
                                } else {
                                    i2 = i == 1 ? sharedPreferences.getInt("MessagesLed", -16776961) : i == 0 ? sharedPreferences.getInt("GroupLed", -16776961) : i == 3 ? sharedPreferences.getInt("StoriesLed", -16776961) : (i == 5 || i == 4) ? sharedPreferences.getInt("ReactionsLed", -16776961) : sharedPreferences.getInt("ChannelLed", -16776961);
                                }
                                LinearLayout m = bs2.m(activity, 1);
                                String[] strArr = {ob6.M0(2131751977, null), ob6.M0(2131751982, null), ob6.M0(2131751971, null), ob6.M0(2131751983, null), ob6.M0(2131751984, null), ob6.M0(2131751985, null), ob6.M0(2131751973, null), ob6.M0(2131751978, null), ob6.M0(2131751972, null)};
                                final int[] iArr = {i2};
                                for (int i3 = 0; i3 < 9; i3++) {
                                    j29 j29Var = new j29(activity, vnbVar);
                                    j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                                    j29Var.setTag(Integer.valueOf(i3));
                                    int i4 = ykb.e[i3];
                                    j29Var.a(i4, i4);
                                    j29Var.b(strArr[i3], i2 == ykb.f[i3]);
                                    m.addView(j29Var);
                                    j29Var.setOnClickListener(new nf(m, iArr));
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
                                String M0 = ob6.M0(2131748743, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                alertDialog$Builder.n(m);
                                alertDialog$Builder.j(ob6.M0(2131745278, null), new fd() { // from class: of
                                    @Override // fd
                                    public final void w(id idVar2, int i5) {
                                        SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
                                        long j3 = j;
                                        int[] iArr2 = iArr;
                                        if (j3 != 0) {
                                            edit.putInt(c00.i("color_", p), iArr2[0]);
                                            ip7.n(yac.t0).f(j3, j2);
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
                                            ip7.n(yac.t0).g(i6);
                                        }
                                        edit.commit();
                                        runnable.run();
                                    }
                                });
                                alertDialog$Builder.h(ob6.M0(2131748742, null), new lf(j, i, (Object) runnable, (byte) 1));
                                if (j != 0) {
                                    alertDialog$Builder.g(ob6.M0(2131751565, null), new o(p, runnable, (byte) 5));
                                }
                                return idVar;
                            }

                            public static void t0(String str, e eVar) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((eVar == null || eVar.getParentActivity() == null) ? a.b : eVar.getParentActivity(), str, 1).show();
                            }

                            public static void u(e eVar, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
                                String M0 = ob6.M0(2131751753, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.a0("ContactNotRegistered", null, 2131751754, lv2.m(0, str, str2));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.j(ob6.M0(2131748928, null), new ze((byte) 0, str3, eVar));
                                eVar.showDialog(idVar);
                            }

                            public static id u0(Context context, String str, boolean z) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String M0 = ob6.M0(R.string.AppName, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = str;
                                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                if (z) {
                                    alertDialog$Builder.g(ob6.M0(2131743476, null), new qg(context, (byte) 1));
                                }
                                return alertDialog$Builder.o();
                            }

                            public static AlertDialog$Builder v(Activity activity, final df7 df7Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i = aob.L5;
                                final byte b = 0;
                                alertDialog$Builder.l(R.raw.permission_request_contacts, 72, aob.w0(null, i, false), null);
                                alertDialog$Builder.m(i, null);
                                alertDialog$Builder.a.U = hl.S2(ob6.M0(2131751739, null));
                                alertDialog$Builder.j(ob6.M0(2131751738, null), new fd() { // from class: vg
                                    @Override // fd
                                    public final void w(id idVar, int i2) {
                                        byte b2 = b;
                                        df7 df7Var2 = df7Var;
                                        switch (b2) {
                                            case 0:
                                                df7Var2.a(1);
                                                break;
                                            default:
                                                df7Var2.a(0);
                                                break;
                                        }
                                    }
                                });
                                final byte b2 = 1;
                                alertDialog$Builder.g(ob6.M0(2131751737, null), new fd() { // from class: vg
                                    @Override // fd
                                    public final void w(id idVar, int i2) {
                                        byte b22 = b2;
                                        df7 df7Var2 = df7Var;
                                        switch (b22) {
                                            case 0:
                                                df7Var2.a(1);
                                                break;
                                            default:
                                                df7Var2.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, hq7Var2.getValue());
                                calendar.set(1, hq7Var3.getValue());
                                hq7Var.setMinValue(1);
                                hq7Var.setMaxValue(calendar.getActualMaximum(5));
                            }

                            public static AlertDialog$Builder w(Context context, int i, int i2, int i3, int i4, int i5, int i6, String str, final boolean z, bf bfVar) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final hq7 hq7Var = new hq7(context, null);
                                final hq7 hq7Var2 = new hq7(context, null);
                                final hq7 hq7Var3 = new hq7(context, null);
                                linearLayout.addView(hq7Var2, tre.l(0.3f, 0, -2));
                                final byte b = 0;
                                hq7Var2.setOnScrollListener(new eq7() { // from class: qf
                                    @Override // eq7
                                    public final void b(int i7) {
                                        byte b2 = b;
                                        hq7 hq7Var4 = hq7Var3;
                                        hq7 hq7Var5 = hq7Var;
                                        hq7 hq7Var6 = hq7Var2;
                                        boolean z2 = z;
                                        switch (b2) {
                                            case 0:
                                                if (z2 && i7 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i7 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i7 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                hq7Var.setMinValue(0);
                                hq7Var.setMaxValue(11);
                                linearLayout.addView(hq7Var, tre.l(0.3f, 0, -2));
                                hq7Var.setFormatter(new e((byte) 22));
                                hq7Var.setOnValueChangedListener(new rf(hq7Var2, hq7Var, hq7Var3, (byte) 0));
                                final byte b2 = 1;
                                hq7Var.setOnScrollListener(new eq7() { // from class: qf
                                    @Override // eq7
                                    public final void b(int i7) {
                                        byte b22 = b2;
                                        hq7 hq7Var4 = hq7Var3;
                                        hq7 hq7Var5 = hq7Var;
                                        hq7 hq7Var6 = hq7Var2;
                                        boolean z2 = z;
                                        switch (b22) {
                                            case 0:
                                                if (z2 && i7 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i7 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i7 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i7 = calendar.get(1);
                                hq7Var3.setMinValue(i + i7);
                                hq7Var3.setMaxValue(i2 + i7);
                                hq7Var3.setValue(i7 + i3);
                                linearLayout.addView(hq7Var3, tre.l(0.4f, 0, -2));
                                hq7Var3.setOnValueChangedListener(new rf(hq7Var2, hq7Var, hq7Var3, (byte) 1));
                                final byte b3 = 2;
                                hq7Var3.setOnScrollListener(new eq7() { // from class: qf
                                    @Override // eq7
                                    public final void b(int i72) {
                                        byte b22 = b3;
                                        hq7 hq7Var4 = hq7Var3;
                                        hq7 hq7Var5 = hq7Var;
                                        hq7 hq7Var6 = hq7Var2;
                                        boolean z2 = z;
                                        switch (b22) {
                                            case 0:
                                                if (z2 && i72 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i72 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i72 == 0) {
                                                    jj.d(hq7Var6, hq7Var5, hq7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                v0(hq7Var2, hq7Var, hq7Var3);
                                if (z) {
                                    d(hq7Var2, hq7Var, hq7Var3);
                                }
                                if (i4 != -1) {
                                    hq7Var2.setValue(i4);
                                    hq7Var.setValue(i5);
                                    hq7Var3.setValue(i6);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.S = str;
                                alertDialog$Builder.n(linearLayout);
                                alertDialog$Builder.j(ob6.M0(2131745278, null), new sf(z, hq7Var2, hq7Var, hq7Var3, bfVar));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                return alertDialog$Builder;
                            }

                            public static void x(Context context, String str, String str2, long j, hj hjVar) {
                                if (context == null) {
                                    return;
                                }
                                int w0 = aob.w0(null, aob.j5, false);
                                int w02 = aob.w0(null, aob.h5, false);
                                aob.w0(null, aob.Aj, false);
                                aob.w0(null, aob.Ej, false);
                                aob.w0(null, aob.E8, false);
                                aob.w0(null, aob.G8, false);
                                aob.w0(null, aob.i6, false);
                                int w03 = aob.w0(null, aob.Ji, false);
                                int w04 = aob.w0(null, aob.Fi, false);
                                int w05 = aob.w0(null, aob.Hi, false);
                                z8d z8dVar = new z8d(context, (vnb) null);
                                ((nx0) z8dVar.b).w0 = false;
                                hq7 hq7Var = new hq7(context, null);
                                hq7Var.setTextColor(w0);
                                hq7Var.setTextOffset(hl.L(10.0f));
                                hq7Var.setItemCount(5);
                                fi fiVar = new fi(context, null);
                                fiVar.setItemCount(5);
                                fiVar.setTextColor(w0);
                                fiVar.setTextOffset(-hl.L(10.0f));
                                hi hiVar = new hi(context, null);
                                hiVar.setItemCount(5);
                                hiVar.setTextColor(w0);
                                hiVar.setTextOffset(-hl.L(34.0f));
                                hq7 hq7Var2 = hq7Var;
                                ai aiVar = new ai(context, hq7Var2, fiVar, hiVar, (byte) 2);
                                aiVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                aiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                textView.setTextColor(w0);
                                textView.setTextSize(1, 20.0f);
                                textView.setTypeface(hl.o());
                                frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new q8((byte) 4));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                aiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                xb xbVar = new xb(context, (byte) 2);
                                linearLayout.addView(hq7Var2, tre.l(0.5f, 0, jn7.s4));
                                hq7Var2.setMinValue(0);
                                hq7Var2.setMaxValue(365);
                                hq7Var2.setWrapSelectorWheel(false);
                                hq7Var2.setFormatter(new e((byte) 25));
                                ie ieVar = new ie((Object) hq7Var2, (Object) fiVar, (Object) hiVar, (byte) 1);
                                hq7Var2.setOnValueChangedListener(ieVar);
                                fiVar.setMinValue(0);
                                fiVar.setMaxValue(23);
                                linearLayout.addView(fiVar, tre.l(0.2f, 0, jn7.s4));
                                fiVar.setFormatter(new e((byte) 26));
                                fiVar.setOnValueChangedListener(ieVar);
                                hiVar.setMinValue(0);
                                hiVar.setMaxValue(59);
                                hiVar.setValue(0);
                                hiVar.setFormatter(new e((byte) 27));
                                linearLayout.addView(hiVar, tre.l(0.3f, 0, jn7.s4));
                                hiVar.setOnValueChangedListener(ieVar);
                                if (j > 0 && j != 2147483646) {
                                    long j2 = j * 1000;
                                    calendar.setTimeInMillis(System.currentTimeMillis());
                                    calendar.set(12, 0);
                                    calendar.set(13, 0);
                                    calendar.set(14, 0);
                                    calendar.set(11, 0);
                                    int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
                                    calendar.setTimeInMillis(j2);
                                    if (timeInMillis >= 0) {
                                        hiVar.setValue(calendar.get(12));
                                        fiVar.setValue(calendar.get(11));
                                        hq7Var2 = hq7Var2;
                                        hq7Var2.setValue(timeInMillis);
                                    } else {
                                        hq7Var2 = hq7Var2;
                                    }
                                }
                                g(null, null, 0L, 0L, 0, hq7Var2, fiVar, hiVar);
                                xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                xbVar.setGravity(17);
                                xbVar.setTextColor(w03);
                                xbVar.setTextSize(1, 14.0f);
                                xbVar.setTypeface(hl.o());
                                int L = hl.L(8.0f);
                                xbVar.setBackgroundDrawable(aob.i0(L, L, L, L, w04, w05, w05));
                                xbVar.setText(str2);
                                aiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
                                xbVar.setOnClickListener(new xf(hq7Var2, fiVar, hiVar, calendar, hjVar, z8dVar, (byte) 0));
                                nx0 nx0Var = (nx0) z8dVar.b;
                                nx0Var.O = aiVar;
                                nx0Var.show();
                                nx0Var.s0(w02);
                                nx0Var.K(w02);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:415:0x0205, code lost:
                            
                                if (java.lang.Math.abs(r11 - r0.k.date) > 86400) goto L92;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:154:0x06b0  */
                            /* JADX WARN: Removed duplicated region for block: B:157:0x06fc  */
                            /* JADX WARN: Removed duplicated region for block: B:160:0x07d4  */
                            /* JADX WARN: Removed duplicated region for block: B:171:0x0879  */
                            /* JADX WARN: Removed duplicated region for block: B:175:0x0945  */
                            /* JADX WARN: Removed duplicated region for block: B:178:0x0953  */
                            /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:181:0x08b5  */
                            /* JADX WARN: Removed duplicated region for block: B:194:0x0814  */
                            /* JADX WARN: Removed duplicated region for block: B:222:0x0714  */
                            /* JADX WARN: Removed duplicated region for block: B:258:0x06d7  */
                            /* JADX WARN: Type inference failed for: r8v31 */
                            /* JADX WARN: Type inference failed for: r8v32, types: [fd, java.lang.String, vnb] */
                            /* JADX WARN: Type inference failed for: r8v34 */
                            /* JADX WARN: Type inference failed for: r8v57 */
                            /* JADX WARN: Type inference failed for: r8v58 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void y(final e eVar, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final r47 r47Var, final SparseArray[] sparseArrayArr, final m47 m47Var, final int i, final int i2, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, final hm1 hm1Var, final vnb vnbVar) {
                                Activity parentActivity;
                                boolean z;
                                long j2;
                                boolean z2;
                                boolean z3;
                                boolean z4;
                                int i3;
                                int i4;
                                boolean z5;
                                boolean z6;
                                boolean z7;
                                boolean z8;
                                int i5;
                                id idVar;
                                int i6;
                                boolean z9;
                                boolean z10;
                                boolean z11;
                                sg2 sg2Var;
                                String str;
                                int i7;
                                int i8;
                                TLRPC.MessageAction messageAction;
                                final boolean z12;
                                id idVar2;
                                String str2;
                                boolean z13;
                                String str3;
                                ?? r8;
                                AlertDialog$Builder alertDialog$Builder;
                                TextView textView;
                                TextView textView2;
                                int i9;
                                int i10;
                                boolean z14;
                                TLRPC.MessageAction messageAction2;
                                int i11;
                                int i12;
                                final int i13;
                                TLRPC.Message message;
                                int i14;
                                r47 r47Var2 = r47Var;
                                boolean z15 = i2 == 1;
                                boolean z16 = i2 == 3;
                                if (eVar == null) {
                                    return;
                                }
                                if ((user == null && chat == null && encryptedChat == null) || (parentActivity = eVar.getParentActivity()) == null) {
                                    return;
                                }
                                final int currentAccount = eVar.getCurrentAccount();
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vnbVar, parentActivity);
                                float f = hm1Var != null ? 0.5f : 0.6f;
                                id idVar3 = alertDialog$Builder2.a;
                                idVar3.R0 = f;
                                int size = m47Var != null ? m47Var.d.size() : r47Var2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                if (encryptedChat != null) {
                                    z = z16;
                                    j2 = wf3.E(encryptedChat.id);
                                } else {
                                    z = z16;
                                    j2 = user != null ? user.id : -chat.id;
                                }
                                if (z15) {
                                    if (r47Var2 == null || (message = r47Var2.k) == null || (i14 = message.schedule_repeat_period) <= 0) {
                                        if (m47Var != null) {
                                            ArrayList arrayList = m47Var.d;
                                            if (!arrayList.isEmpty() && arrayList.get(0) != null && ((r47) arrayList.get(0)).k != null && ((r47) arrayList.get(0)).k.schedule_repeat_period > 0) {
                                                int i15 = ((r47) arrayList.get(0)).k.date;
                                                i13 = ((r47) arrayList.get(0)).k.schedule_repeat_period;
                                                i12 = i15;
                                            }
                                        }
                                        i12 = 0;
                                        i13 = 0;
                                    } else {
                                        i12 = message.date;
                                        i13 = i14;
                                    }
                                    if (i12 > 0 && i13 > 0) {
                                        String a0 = ob6.a0(null, null, 2131748271, Integer.valueOf(i13));
                                        if (i13 == 31536000) {
                                            a0 = ob6.M0(2131748267, null);
                                        } else if (i13 >= 2592000) {
                                            a0 = ob6.G(i13 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                        } else if (i13 >= 604800) {
                                            a0 = ob6.G(i13 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                        } else if (i13 >= 86400) {
                                            a0 = ob6.G(i13 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                        }
                                        String str4 = a0;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, vnbVar, parentActivity);
                                        String M0 = ob6.M0(2131748265, null);
                                        id idVar4 = alertDialog$Builder3.a;
                                        idVar4.S = M0;
                                        idVar4.U = ob6.M0(2131748266, null);
                                        final int i16 = i12;
                                        alertDialog$Builder3.g(str4, new fd() { // from class: zg
                                            @Override // fd
                                            public final void w(id idVar5, int i17) {
                                                m47 m47Var2 = m47.this;
                                                int i18 = currentAccount;
                                                e eVar2 = eVar;
                                                int i19 = i16;
                                                int i20 = i13;
                                                if (m47Var2 != null) {
                                                    ArrayList arrayList2 = m47Var2.d;
                                                    if (!arrayList2.isEmpty()) {
                                                        r7a.B(i18).t((r47) arrayList2.get(0), eVar2, i19 + i20, i20);
                                                        return;
                                                    }
                                                }
                                                r7a.B(i18).t(r47Var, eVar2, i19 + i20, i20);
                                            }
                                        });
                                        final long j3 = j2;
                                        final boolean z17 = z;
                                        alertDialog$Builder3.h(ob6.M0(2131748278, null), new fd() { // from class: dh
                                            @Override // fd
                                            public final void w(id idVar5, int i17) {
                                                SparseArray[] sparseArrayArr2;
                                                ArrayList arrayList2;
                                                int i18;
                                                long j4;
                                                ArrayList arrayList3;
                                                TLRPC.Peer peer;
                                                int i19;
                                                long j5;
                                                ArrayList arrayList4;
                                                boolean z18 = z17;
                                                int i20 = currentAccount;
                                                long e = z18 ? yac.h(i20).e() : j3;
                                                r47 r47Var3 = r47Var;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j6 = j;
                                                int i21 = i;
                                                int i22 = i2;
                                                ArrayList arrayList5 = null;
                                                if (r47Var3 != null) {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    m47 m47Var2 = m47Var;
                                                    if (m47Var2 != null) {
                                                        ArrayList arrayList7 = m47Var2.d;
                                                        int i23 = 0;
                                                        while (i23 < arrayList7.size()) {
                                                            r47 r47Var4 = (r47) arrayList7.get(i23);
                                                            arrayList6.add(Integer.valueOf(r47Var4.e1()));
                                                            if (encryptedChat2 != null) {
                                                                arrayList4 = arrayList6;
                                                                if (r47Var4.k.random_id == 0 || r47Var4.D == 10) {
                                                                    i19 = i20;
                                                                    j5 = e;
                                                                } else {
                                                                    if (arrayList5 == null) {
                                                                        arrayList5 = new ArrayList();
                                                                    }
                                                                    ArrayList arrayList8 = arrayList5;
                                                                    i19 = i20;
                                                                    j5 = e;
                                                                    arrayList8.add(Long.valueOf(r47Var4.k.random_id));
                                                                    arrayList5 = arrayList8;
                                                                }
                                                            } else {
                                                                i19 = i20;
                                                                j5 = e;
                                                                arrayList4 = arrayList6;
                                                            }
                                                            i23++;
                                                            arrayList6 = arrayList4;
                                                            i20 = i19;
                                                            e = j5;
                                                        }
                                                        i18 = i20;
                                                        j4 = e;
                                                    } else {
                                                        i18 = i20;
                                                        j4 = e;
                                                        arrayList6.add(Integer.valueOf(r47Var3.e1()));
                                                        if (encryptedChat2 != null && r47Var3.k.random_id != 0 && r47Var3.D != 10) {
                                                            ArrayList arrayList9 = new ArrayList();
                                                            arrayList9.add(Long.valueOf(r47Var3.k.random_id));
                                                            arrayList3 = arrayList9;
                                                            uc7.s1(i18).X(arrayList6, arrayList3, encryptedChat2, (j6 == 0 && (peer = r47Var3.k.peer_id) != null && peer.chat_id == (-j6)) ? j6 : j4, i21, true, i22);
                                                        }
                                                    }
                                                    arrayList3 = arrayList5;
                                                    uc7.s1(i18).X(arrayList6, arrayList3, encryptedChat2, (j6 == 0 && (peer = r47Var3.k.peer_id) != null && peer.chat_id == (-j6)) ? j6 : j4, i21, true, i22);
                                                } else {
                                                    long j7 = e;
                                                    int i24 = 1;
                                                    while (i24 >= 0) {
                                                        ArrayList arrayList10 = new ArrayList();
                                                        int i25 = 0;
                                                        while (true) {
                                                            sparseArrayArr2 = sparseArrayArr;
                                                            if (i25 >= sparseArrayArr2[i24].size()) {
                                                                break;
                                                            }
                                                            arrayList10.add(Integer.valueOf(sparseArrayArr2[i24].keyAt(i25)));
                                                            i25++;
                                                        }
                                                        if (encryptedChat2 != null) {
                                                            ArrayList arrayList11 = new ArrayList();
                                                            for (int i26 = 0; i26 < sparseArrayArr2[i24].size(); i26++) {
                                                                r47 r47Var5 = (r47) sparseArrayArr2[i24].valueAt(i26);
                                                                long j8 = r47Var5.k.random_id;
                                                                if (j8 != 0 && r47Var5.D != 10) {
                                                                    arrayList11.add(Long.valueOf(j8));
                                                                }
                                                            }
                                                            arrayList2 = arrayList11;
                                                        } else {
                                                            arrayList2 = null;
                                                        }
                                                        uc7.s1(i20).X(arrayList10, arrayList2, encryptedChat2, (i24 != 1 || j6 == 0) ? j7 : j6, i21, true, i22);
                                                        sparseArrayArr2[i24].clear();
                                                        i24--;
                                                    }
                                                }
                                                runnable.run();
                                            }
                                        });
                                        alertDialog$Builder3.j(ob6.M0(2131752570, null), null);
                                        alertDialog$Builder3.c(-2);
                                        alertDialog$Builder3.c(-3);
                                        final byte b = 2;
                                        idVar4.O = new DialogInterface.OnDismissListener() { // from class: ah
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                byte b2 = b;
                                                hm1 hm1Var2 = hm1Var;
                                                switch (b2) {
                                                    case 0:
                                                        hm1Var2.run();
                                                        break;
                                                    case 1:
                                                        if (hm1Var2 != null) {
                                                            hm1Var2.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (hm1Var2 != null) {
                                                            hm1Var2.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        alertDialog$Builder3.o();
                                        return;
                                    }
                                    r47Var2 = r47Var;
                                }
                                final hm1 hm1Var2 = hm1Var;
                                final int i17 = currentAccount;
                                int currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
                                uc7.s1(i17).k4.h.g(TimeUnit.SECONDS);
                                if (r47Var2 != null) {
                                    z3 = !r47Var2.T2() || Math.abs(currentTime - r47Var2.k.date) > 86400;
                                    if (r47Var2.P3()) {
                                        TLRPC.Message message2 = r47Var2.k;
                                        z4 = message2.paid_suggested_post_stars;
                                        z2 = message2.paid_suggested_post_ton;
                                    } else {
                                        z4 = false;
                                        z2 = false;
                                    }
                                } else {
                                    int i18 = 0;
                                    z2 = false;
                                    boolean z18 = false;
                                    boolean z19 = false;
                                    while (i18 < 2) {
                                        int i19 = 0;
                                        while (true) {
                                            i3 = i18;
                                            if (i19 < sparseArrayArr[i18].size()) {
                                                r47 r47Var3 = (r47) sparseArrayArr[i3].valueAt(i19);
                                                if (r47Var3.T2()) {
                                                    i4 = i19;
                                                } else {
                                                    i4 = i19;
                                                }
                                                z18 = true;
                                                if (r47Var3.P3()) {
                                                    TLRPC.Message message3 = r47Var3.k;
                                                    z19 |= message3.paid_suggested_post_stars;
                                                    z2 |= message3.paid_suggested_post_ton;
                                                }
                                                i19 = i4 + 1;
                                                i18 = i3;
                                            }
                                        }
                                        i18 = i3 + 1;
                                    }
                                    z3 = z18;
                                    z4 = z19;
                                }
                                if (m47Var != null) {
                                    ArrayList arrayList2 = m47Var.d;
                                    z6 = z4;
                                    z5 = z3;
                                    int i20 = 0;
                                    while (i20 < arrayList2.size()) {
                                        r47 r47Var4 = (r47) arrayList2.get(i20);
                                        if (r47Var4.P3()) {
                                            TLRPC.Message message4 = r47Var4.k;
                                            i11 = i20;
                                            z6 |= message4.paid_suggested_post_stars;
                                            z2 |= message4.paid_suggested_post_ton;
                                        } else {
                                            i11 = i20;
                                        }
                                        i20 = i11 + 1;
                                    }
                                } else {
                                    z5 = z3;
                                    z6 = z4;
                                }
                                final boolean[] zArr = new boolean[1];
                                boolean z20 = user != null && uc7.s1(i17).V2;
                                int i21 = user != null ? uc7.s1(i17).U2 : uc7.s1(i17).T2;
                                if (encryptedChat == null && user != null && z20) {
                                    z7 = z20;
                                    if (i21 == Integer.MAX_VALUE) {
                                        z8 = true;
                                        if (chat != null || !chat.megagroup || z15 || z) {
                                            i5 = i17;
                                            if (!z15 || z || xc2.T(chat) || encryptedChat != null) {
                                                idVar = idVar3;
                                                i6 = 0;
                                                z9 = false;
                                            } else {
                                                if ((user == null || user.id == yac.h(i5).e() || (user.bot && !user.support)) && chat == null) {
                                                    i6 = 0;
                                                    z11 = false;
                                                } else if (r47Var2 != null) {
                                                    i6 = (r47Var2.m4() || !((messageAction = r47Var2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(r47Var2.N3() || z7 || xc2.N(chat)) || currentTime - r47Var2.k.date > i21)) ? 0 : 1;
                                                    z11 = !r47Var2.N3();
                                                } else {
                                                    int i22 = 1;
                                                    z11 = false;
                                                    int i23 = 0;
                                                    while (i22 >= 0) {
                                                        int i24 = 0;
                                                        while (true) {
                                                            i8 = i22;
                                                            if (i24 < sparseArrayArr[i22].size()) {
                                                                r47 r47Var5 = (r47) sparseArrayArr[i8].valueAt(i24);
                                                                int i25 = i24;
                                                                TLRPC.MessageAction messageAction3 = r47Var5.k.action;
                                                                boolean z21 = z11;
                                                                if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((r47Var5.N3() || z7 || (chat != null && xc2.w(2, chat))) && currentTime - r47Var5.k.date <= i21)) {
                                                                    i23++;
                                                                    if (!z21 && !r47Var5.N3()) {
                                                                        z11 = true;
                                                                        i24 = i25 + 1;
                                                                        i22 = i8;
                                                                    }
                                                                }
                                                                z11 = z21;
                                                                i24 = i25 + 1;
                                                                i22 = i8;
                                                            }
                                                        }
                                                        i22 = i8 - 1;
                                                    }
                                                    i6 = i23;
                                                }
                                                if (i6 <= 0 || !z5 || (user != null && lbc.z(user))) {
                                                    idVar = idVar3;
                                                    z9 = z11;
                                                } else {
                                                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                                                    sg2 sg2Var2 = new sg2(1, vnbVar, parentActivity);
                                                    sg2Var2.setBackgroundDrawable(aob.L0(false));
                                                    if (z8) {
                                                        sg2Var = sg2Var2;
                                                        sg2Var.e(ob6.a0("DeleteMessagesOptionAlso", null, 2131751490, lbc.k(user, true)), "", false, false, false);
                                                    } else {
                                                        sg2Var = sg2Var2;
                                                        if (chat == null) {
                                                            str = null;
                                                            i7 = 2131751491;
                                                        } else if (z11 || i6 == size) {
                                                            sg2Var.e(ob6.M0(2131751505, null), "", false, false, false);
                                                        } else {
                                                            i7 = 2131751491;
                                                            str = null;
                                                        }
                                                        sg2Var.e(ob6.M0(i7, str), "", false, false, false);
                                                    }
                                                    sg2 sg2Var3 = sg2Var;
                                                    sg2Var3.setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                                                    frameLayout.addView(sg2Var3, tre.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                    sg2Var3.setOnClickListener(new de(zArr, (byte) 4));
                                                    alertDialog$Builder2.n(frameLayout);
                                                    idVar3.H = (byte) 9;
                                                    idVar = idVar3;
                                                    z9 = z11;
                                                    z10 = true;
                                                }
                                            }
                                            z10 = false;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            if (r47Var2 != null) {
                                                TLRPC.MessageAction messageAction4 = r47Var2.k.action;
                                                if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                                                    if (m47Var != null) {
                                                        arrayList3.addAll(m47Var.d);
                                                    } else {
                                                        arrayList3.add(r47Var2);
                                                    }
                                                }
                                                i9 = (!r47Var2.m4() && r47.B0(r47Var2.k) == j && ((messageAction2 = r47Var2.k.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && r47Var2.N3() && currentTime - r47Var2.k.date <= i21) ? 1 : 0;
                                            } else {
                                                int i26 = 1;
                                                int i27 = 0;
                                                while (i26 >= 0) {
                                                    int i28 = i27;
                                                    int i29 = 0;
                                                    while (i29 < sparseArrayArr[i26].size()) {
                                                        r47 r47Var6 = (r47) sparseArrayArr[i26].valueAt(i29);
                                                        int i30 = i29;
                                                        if (i26 == 1 && r47Var6.N3()) {
                                                            TLRPC.Message message5 = r47Var6.k;
                                                            i10 = i26;
                                                            if (message5.action == null && currentTime - message5.date <= i21) {
                                                                i28++;
                                                            }
                                                        } else {
                                                            i10 = i26;
                                                        }
                                                        arrayList3.add(r47Var6);
                                                        i29 = i30 + 1;
                                                        i26 = i10;
                                                    }
                                                    i26--;
                                                    i27 = i28;
                                                }
                                                i9 = i27;
                                            }
                                            int i31 = i9;
                                            byte b2 = 0;
                                            ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new eh(b2)).mapToLong(new fh(b2)).distinct().mapToObj(new LongFunction() { // from class: gh
                                                @Override // java.util.function.LongFunction
                                                public final Object apply(long j4) {
                                                    int i32 = i17;
                                                    return j4 > 0 ? uc7.s1(i32).X1(Long.valueOf(j4)) : uc7.s1(i32).M0(Long.valueOf(-j4));
                                                }
                                            }).filter(new eh((byte) 1)).filter(new hh((byte) 0, yac.h(i17).e())).collect(Collectors.toCollection(new zl1((byte) 0)));
                                            if (!arrayList4.isEmpty()) {
                                                if (channelParticipantArr != null) {
                                                    me3 me3Var = new me3(eVar, chat, arrayList3, arrayList4, channelParticipantArr, j, i, i2, false, runnable);
                                                    if (hm1Var2 != null) {
                                                        final byte b3 = 0;
                                                        me3Var.I0 = new DialogInterface.OnDismissListener() { // from class: ah
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                byte b22 = b3;
                                                                hm1 hm1Var22 = hm1Var2;
                                                                switch (b22) {
                                                                    case 0:
                                                                        hm1Var22.run();
                                                                        break;
                                                                    case 1:
                                                                        if (hm1Var22 != null) {
                                                                            hm1Var22.run();
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (hm1Var22 != null) {
                                                                            hm1Var22.run();
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                    }
                                                    me3Var.show();
                                                    return;
                                                }
                                                final id[] idVarArr = {new id(3, null, parentActivity)};
                                                final int size2 = arrayList4.size();
                                                final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                                                int[] iArr = new int[size2];
                                                int[] iArr2 = new int[1];
                                                final int i32 = 0;
                                                while (i32 < size2) {
                                                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                                                    tL_channels_getParticipant.channel = uc7.i1(chat);
                                                    tL_channels_getParticipant.participant = uc7.k1((TLObject) arrayList4.get(i32));
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i17);
                                                    ArrayList arrayList5 = arrayList4;
                                                    final int[] iArr3 = iArr2;
                                                    final int[] iArr4 = iArr;
                                                    final hm1 hm1Var3 = hm1Var2;
                                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: ih
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            final int[] iArr5 = iArr3;
                                                            final int[] iArr6 = iArr4;
                                                            final int i33 = i32;
                                                            final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                                            final int i34 = size2;
                                                            final id[] idVarArr2 = idVarArr;
                                                            final e eVar2 = eVar;
                                                            final TLRPC.User user2 = user;
                                                            final TLRPC.Chat chat2 = chat;
                                                            final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                            final TLRPC.ChatFull chatFull2 = chatFull;
                                                            final long j4 = j;
                                                            final r47 r47Var7 = r47Var;
                                                            final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                                            final m47 m47Var2 = m47Var;
                                                            final int i35 = i;
                                                            final int i36 = i2;
                                                            final Runnable runnable2 = runnable;
                                                            final hm1 hm1Var4 = hm1Var3;
                                                            final vnb vnbVar2 = vnbVar;
                                                            hl.c3(new Runnable() { // from class: pe
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    id[] idVarArr3 = idVarArr2;
                                                                    int[] iArr7 = iArr5;
                                                                    iArr7[0] = iArr7[0] + 1;
                                                                    int[] iArr8 = iArr6;
                                                                    int i37 = i33;
                                                                    iArr8[i37] = 0;
                                                                    TLObject tLObject2 = tLObject;
                                                                    TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                                                    if (tLObject2 != null) {
                                                                        channelParticipantArr4[i37] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                                    }
                                                                    if (iArr7[0] == i34) {
                                                                        try {
                                                                            idVarArr3[0].dismiss();
                                                                        } catch (Throwable unused) {
                                                                        }
                                                                        idVarArr3[0] = null;
                                                                        jj.y(eVar2, user2, chat2, encryptedChat2, chatFull2, j4, r47Var7, sparseArrayArr2, m47Var2, i35, i36, channelParticipantArr4, runnable2, hm1Var4, vnbVar2);
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    };
                                                    int i33 = i32;
                                                    iArr4[i33] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                                                    hm1Var2 = hm1Var;
                                                    size2 = size2;
                                                    iArr = iArr4;
                                                    iArr2 = iArr3;
                                                    i32 = i33 + 1;
                                                    i17 = i17;
                                                    arrayList4 = arrayList5;
                                                }
                                                hl.d3(new l77((Object) idVarArr, (Object) iArr, i17, (Object) hm1Var, (Object) eVar, (byte) 3), 1000L);
                                                return;
                                            }
                                            i5 = i17;
                                            if (i31 <= 0 || !z5) {
                                                z14 = false;
                                            } else {
                                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                                sg2 sg2Var4 = new sg2(1, vnbVar, parentActivity);
                                                sg2Var4.setBackgroundDrawable(aob.L0(false));
                                                sg2Var4.e(ob6.M0(2131751491, null), "", false, false, false);
                                                sg2Var4.setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                                                frameLayout2.addView(sg2Var4, tre.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                sg2Var4.setOnClickListener(new de(zArr, (byte) 3));
                                                alertDialog$Builder2.n(frameLayout2);
                                                idVar3.H = (byte) 9;
                                                z14 = true;
                                            }
                                            idVar = idVar3;
                                            z10 = z14;
                                            i6 = i31;
                                            z9 = false;
                                        }
                                        id idVar5 = idVar;
                                        int i34 = i6;
                                        final long j4 = j2;
                                        int i35 = size;
                                        boolean z22 = z2;
                                        z12 = z;
                                        final int i36 = i5;
                                        final byte b4 = 1;
                                        fd fdVar = new fd() { // from class: ch
                                            /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                            /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                            /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                            /* JADX WARN: Type inference failed for: r3v13 */
                                            /* JADX WARN: Type inference failed for: r3v14, types: [boolean, byte, int] */
                                            /* JADX WARN: Type inference failed for: r3v15 */
                                            @Override // fd
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void w(id idVar6, int i37) {
                                                SparseArray[] sparseArrayArr2;
                                                ArrayList arrayList6;
                                                int i38;
                                                long j5;
                                                char c;
                                                ArrayList arrayList7;
                                                ?? r3;
                                                ArrayList arrayList8;
                                                long j6;
                                                int i39;
                                                int size3;
                                                int i40;
                                                long j7;
                                                TLRPC.Peer peer;
                                                long j8;
                                                boolean z23 = z12;
                                                int i41 = i36;
                                                long e = z23 ? yac.h(i41).e() : j4;
                                                r47 r47Var7 = r47Var;
                                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                long j9 = j;
                                                int i42 = i;
                                                boolean[] zArr2 = zArr;
                                                int i43 = i2;
                                                ArrayList arrayList9 = null;
                                                if (r47Var7 != null) {
                                                    ArrayList arrayList10 = new ArrayList();
                                                    ArrayList arrayList11 = new ArrayList();
                                                    m47 m47Var2 = m47Var;
                                                    if (m47Var2 != null) {
                                                        ArrayList arrayList12 = m47Var2.d;
                                                        c = 0;
                                                        int i44 = 0;
                                                        while (i44 < arrayList12.size()) {
                                                            r47 r47Var8 = (r47) arrayList12.get(i44);
                                                            int i45 = i41;
                                                            if (r47.c3(r47Var8.k)) {
                                                                arrayList10.add(r47Var8);
                                                            } else {
                                                                arrayList11.add(Integer.valueOf(r47Var8.e1()));
                                                                if (encryptedChat2 != null) {
                                                                    j8 = e;
                                                                    if (r47Var8.k.random_id != 0 && r47Var8.D != 10) {
                                                                        if (arrayList9 == null) {
                                                                            arrayList9 = new ArrayList();
                                                                        }
                                                                        ArrayList arrayList13 = arrayList9;
                                                                        arrayList13.add(Long.valueOf(r47Var8.k.random_id));
                                                                        arrayList9 = arrayList13;
                                                                    }
                                                                    i44++;
                                                                    e = j8;
                                                                    i41 = i45;
                                                                }
                                                            }
                                                            j8 = e;
                                                            i44++;
                                                            e = j8;
                                                            i41 = i45;
                                                        }
                                                        i38 = i41;
                                                        j5 = e;
                                                    } else {
                                                        i38 = i41;
                                                        j5 = e;
                                                        c = 0;
                                                        if (r47.c3(r47Var7.k)) {
                                                            arrayList10.add(r47Var7);
                                                        } else {
                                                            arrayList11.add(Integer.valueOf(r47Var7.e1()));
                                                            if (encryptedChat2 != null && r47Var7.k.random_id != 0 && r47Var7.D != 10) {
                                                                ArrayList arrayList14 = new ArrayList();
                                                                arrayList14.add(Long.valueOf(r47Var7.k.random_id));
                                                                arrayList7 = arrayList14;
                                                                long j10 = (j9 == 0 && (peer = r47Var7.k.peer_id) != null && peer.chat_id == (-j9)) ? j9 : j5;
                                                                if (arrayList11.isEmpty()) {
                                                                    r3 = c;
                                                                    arrayList8 = arrayList10;
                                                                    j6 = j10;
                                                                    i39 = 1;
                                                                    uc7.s1(i38).X(arrayList11, arrayList7, encryptedChat2, j6, i42, zArr2[c], i43);
                                                                } else {
                                                                    r3 = c;
                                                                    arrayList8 = arrayList10;
                                                                    j6 = j10;
                                                                    i39 = 1;
                                                                }
                                                                size3 = arrayList8.size();
                                                                i40 = r3;
                                                                while (i40 < size3) {
                                                                    Object obj = arrayList8.get(i40);
                                                                    i40++;
                                                                    r47 r47Var9 = (r47) obj;
                                                                    uc7 s1 = uc7.s1(i38);
                                                                    ArrayList arrayList15 = new ArrayList();
                                                                    arrayList15.add(Integer.valueOf(r47Var9.e1()));
                                                                    if (j6 == 0 || !wf3.y(j6)) {
                                                                        j7 = 0;
                                                                    } else {
                                                                        TLRPC.Chat M02 = s1.M0(Long.valueOf(-j6));
                                                                        j7 = xc2.T(M02) ? M02.id : 0L;
                                                                    }
                                                                    s1.t3(arrayList15, j6);
                                                                    jf7 messagesStorage = s1.getMessagesStorage();
                                                                    int P0 = r47Var9.P0();
                                                                    messagesStorage.getClass();
                                                                    zh6 zh6Var = new zh6(i39);
                                                                    ArrayList arrayList16 = new ArrayList(i39);
                                                                    arrayList16.add(Integer.valueOf(P0));
                                                                    zh6Var.k(j6, arrayList16);
                                                                    messagesStorage.H(new ds6((Object) messagesStorage, (Object) zh6Var, (boolean) r3, (byte) 3));
                                                                    s1.getMessagesStorage().M0(j6, arrayList15, true, true, r47.c5(r47Var9.k) ? 9 : r3, i42);
                                                                    s1.getMessagesStorage().O1(j6, j7, arrayList15, null);
                                                                    jn7 notificationCenter = s1.getNotificationCenter();
                                                                    Long valueOf = Long.valueOf(j7);
                                                                    Integer valueOf2 = Integer.valueOf((int) r3);
                                                                    Object[] objArr = new Object[6];
                                                                    objArr[r3] = arrayList15;
                                                                    objArr[i39] = valueOf;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    objArr[2] = bool;
                                                                    objArr[3] = bool;
                                                                    objArr[4] = bool;
                                                                    objArr[5] = valueOf2;
                                                                    notificationCenter.k(jn7.v, objArr);
                                                                    if (!r47.c5(r47Var9.k) || r47Var9.a5()) {
                                                                        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                        tL_deleteMessage.peer = s1.j1(r47.B0(r47Var9.k));
                                                                        TLRPC.Message message6 = r47Var9.k;
                                                                        tL_deleteMessage.receiver_id = s1.o1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                        tL_deleteMessage.id = r47Var9.P0();
                                                                        s1.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new pp0(r3));
                                                                    } else {
                                                                        TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                        tL_deleteWelcomeMessage.peer = s1.j1(r47.B0(r47Var9.k));
                                                                        tL_deleteWelcomeMessage.id = r47Var9.P0();
                                                                        s1.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new pp0(r3));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    arrayList7 = arrayList9;
                                                    if (j9 == 0) {
                                                    }
                                                    if (arrayList11.isEmpty()) {
                                                    }
                                                    size3 = arrayList8.size();
                                                    i40 = r3;
                                                    while (i40 < size3) {
                                                    }
                                                } else {
                                                    long j11 = e;
                                                    int i46 = 0;
                                                    int i47 = 1;
                                                    while (i47 >= 0) {
                                                        ArrayList arrayList17 = new ArrayList();
                                                        int i48 = i46;
                                                        while (true) {
                                                            sparseArrayArr2 = sparseArrayArr;
                                                            if (i48 >= sparseArrayArr2[i47].size()) {
                                                                break;
                                                            }
                                                            arrayList17.add(Integer.valueOf(sparseArrayArr2[i47].keyAt(i48)));
                                                            i48++;
                                                        }
                                                        if (encryptedChat2 != null) {
                                                            arrayList6 = new ArrayList();
                                                            int i49 = i46;
                                                            while (i49 < sparseArrayArr2[i47].size()) {
                                                                r47 r47Var10 = (r47) sparseArrayArr2[i47].valueAt(i49);
                                                                int i50 = i46;
                                                                long j12 = r47Var10.k.random_id;
                                                                if (j12 != 0 && r47Var10.D != 10) {
                                                                    arrayList6.add(Long.valueOf(j12));
                                                                }
                                                                i49++;
                                                                i46 = i50;
                                                            }
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                        int i51 = i46;
                                                        uc7.s1(i41).X(arrayList17, arrayList6, encryptedChat2, (i47 != 1 || j9 == 0) ? j11 : j9, i42, zArr2[i51], i43);
                                                        sparseArrayArr2[i47].clear();
                                                        i47--;
                                                        i46 = i51;
                                                    }
                                                }
                                                runnable.run();
                                            }
                                        };
                                        if (z12) {
                                            idVar2 = idVar5;
                                            str2 = null;
                                            if (i35 == 1) {
                                                idVar2.S = ob6.M0(2131751461, null);
                                            } else {
                                                idVar2.S = ob6.a0(null, null, 2131751484, ob6.G(i35, "messages", new Object[0]));
                                            }
                                        } else if (i35 == 1) {
                                            str2 = null;
                                            idVar2 = idVar5;
                                            idVar2.S = ob6.M0(2131743491, null);
                                        } else {
                                            idVar2 = idVar5;
                                            str2 = null;
                                            idVar2.S = ob6.a0(null, null, 2131743492, ob6.G(i35, "messages", new Object[0]));
                                        }
                                        if (z12) {
                                            if (chat == null || !z9) {
                                                if (!z10 || z8 || i34 == i35) {
                                                    if (chat == null || !chat.megagroup || z15) {
                                                        if (i35 == 1) {
                                                            idVar2.U = ob6.M0(2131754086, null);
                                                        } else {
                                                            idVar2.U = ob6.M0(2131754094, null);
                                                        }
                                                    } else if (i35 == 1) {
                                                        idVar2.U = ob6.M0((r47Var == null || !r47.c3(r47Var.k)) ? 2131754085 : 2131754086, null);
                                                    } else {
                                                        idVar2.U = ob6.M0(2131754093, null);
                                                    }
                                                } else if (chat != null) {
                                                    idVar2.U = ob6.a0("DeleteMessagesTextGroup", null, 2131751486, ob6.G(i34, "messages", new Object[0]));
                                                } else {
                                                    idVar2.U = hl.S2(ob6.a0("DeleteMessagesText", null, 2131751487, ob6.G(i34, "messages", new Object[0]), lbc.k(user, true)));
                                                }
                                            } else if (z10 && i34 != i35) {
                                                idVar2.U = ob6.a0(null, null, 2131751485, ob6.G(i34, "messages", new Object[0]));
                                            } else if (i35 == 1) {
                                                idVar2.U = ob6.M0(2131754086, null);
                                            } else {
                                                idVar2.U = ob6.M0(2131754094, null);
                                            }
                                        } else if (i35 == 1) {
                                            idVar2.U = ob6.M0(2131754056, str2);
                                        } else {
                                            idVar2.U = ob6.M0(2131754057, str2);
                                        }
                                        if (r47Var == null) {
                                            z13 = r47Var.u3() && !r47.l3(r47Var.k);
                                            if (z13) {
                                                long j5 = ((TLRPC.TL_messageMediaGiveaway) r47Var.k.media).until_date * 1000;
                                                str3 = ob6.D0().t0().format(new Date(j5));
                                                z13 = System.currentTimeMillis() < j5;
                                            }
                                            str3 = null;
                                        } else if (i35 == 1) {
                                            boolean z23 = false;
                                            str3 = null;
                                            for (int i37 = 1; i37 >= 0; i37--) {
                                                for (int i38 = 0; i38 < sparseArrayArr[i37].size(); i38++) {
                                                    r47 r47Var7 = (r47) sparseArrayArr[i37].valueAt(i38);
                                                    boolean z24 = r47Var7.u3() && !r47.l3(r47Var7.k);
                                                    if (z24) {
                                                        long j6 = ((TLRPC.TL_messageMediaGiveaway) r47Var7.k.media).until_date * 1000;
                                                        str3 = ob6.D0().t0().format(new Date(j6));
                                                        z23 = System.currentTimeMillis() < j6;
                                                    } else {
                                                        z23 = z24;
                                                    }
                                                }
                                            }
                                            z13 = z23;
                                        } else {
                                            z13 = false;
                                            str3 = null;
                                        }
                                        TimeUnit timeUnit = TimeUnit.HOURS;
                                        if (z6) {
                                            AlertDialog$Builder alertDialog$Builder4 = alertDialog$Builder2;
                                            r8 = 0;
                                            r8 = 0;
                                            r8 = 0;
                                            if (z22) {
                                                int g = (int) uc7.s1(i36).k4.h.g(timeUnit);
                                                idVar2.S = ob6.M0(2131743987, null);
                                                idVar2.U = hl.S2(ob6.a0(null, null, 2131743986, Integer.valueOf(g)));
                                                alertDialog$Builder4.j(ob6.M0(2131743989, null), fdVar);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else if (!z13 || z12) {
                                                alertDialog$Builder4.j(ob6.M0(z12 ? 2131746048 : 2131751563, null), fdVar);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            } else {
                                                idVar2.S = ob6.M0(2131753472, null);
                                                idVar2.U = hl.S2(ob6.a0(null, null, 2131753473, str3));
                                                alertDialog$Builder4.h(ob6.M0(2131751563, null), fdVar);
                                                alertDialog$Builder = alertDialog$Builder4;
                                            }
                                        } else {
                                            int g2 = (int) uc7.s1(i36).k4.h.g(timeUnit);
                                            r8 = 0;
                                            idVar2.S = ob6.M0(2131743990, null);
                                            idVar2.U = hl.S2(ob6.a0(null, null, 2131743988, Integer.valueOf(g2)));
                                            AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder2;
                                            alertDialog$Builder5.j(ob6.M0(2131743989, null), fdVar);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        }
                                        alertDialog$Builder.g(ob6.M0(2131752570, r8), r8);
                                        idVar2.O = new DialogInterface.OnDismissListener() { // from class: ah
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                byte b22 = b4;
                                                hm1 hm1Var22 = hm1Var;
                                                switch (b22) {
                                                    case 0:
                                                        hm1Var22.run();
                                                        break;
                                                    case 1:
                                                        if (hm1Var22 != null) {
                                                            hm1Var22.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (hm1Var22 != null) {
                                                            hm1Var22.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        eVar.showDialog(idVar2);
                                        textView = (TextView) idVar2.c(-1);
                                        if (textView != null) {
                                            yob.X(textView, aob.q7, r8);
                                        }
                                        textView2 = (TextView) idVar2.c(-3);
                                        if (textView2 == null) {
                                            idVar2.u0.setPadding(hl.L(12.0f), hl.L(0.0f), hl.L(8.0f), hl.L(12.0f));
                                            ((ViewGroup.MarginLayoutParams) idVar2.u0.getLayoutParams()).topMargin = hl.L(-8.0f);
                                            yob.X(textView2, aob.q7, null);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    z7 = z20;
                                }
                                z8 = false;
                                if (chat != null) {
                                }
                                i5 = i17;
                                if (z15) {
                                }
                                idVar = idVar3;
                                i6 = 0;
                                z9 = false;
                                z10 = false;
                                id idVar52 = idVar;
                                int i342 = i6;
                                final long j42 = j2;
                                int i352 = size;
                                boolean z222 = z2;
                                z12 = z;
                                final int i362 = i5;
                                final byte b42 = 1;
                                fd fdVar2 = new fd() { // from class: ch
                                    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                    /* JADX WARN: Type inference failed for: r3v13 */
                                    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, byte, int] */
                                    /* JADX WARN: Type inference failed for: r3v15 */
                                    @Override // fd
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void w(id idVar6, int i372) {
                                        SparseArray[] sparseArrayArr2;
                                        ArrayList arrayList6;
                                        int i382;
                                        long j52;
                                        char c;
                                        ArrayList arrayList7;
                                        ?? r3;
                                        ArrayList arrayList8;
                                        long j62;
                                        int i39;
                                        int size3;
                                        int i40;
                                        long j7;
                                        TLRPC.Peer peer;
                                        long j8;
                                        boolean z232 = z12;
                                        int i41 = i362;
                                        long e = z232 ? yac.h(i41).e() : j42;
                                        r47 r47Var72 = r47Var;
                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                        long j9 = j;
                                        int i42 = i;
                                        boolean[] zArr2 = zArr;
                                        int i43 = i2;
                                        ArrayList arrayList9 = null;
                                        if (r47Var72 != null) {
                                            ArrayList arrayList10 = new ArrayList();
                                            ArrayList arrayList11 = new ArrayList();
                                            m47 m47Var2 = m47Var;
                                            if (m47Var2 != null) {
                                                ArrayList arrayList12 = m47Var2.d;
                                                c = 0;
                                                int i44 = 0;
                                                while (i44 < arrayList12.size()) {
                                                    r47 r47Var8 = (r47) arrayList12.get(i44);
                                                    int i45 = i41;
                                                    if (r47.c3(r47Var8.k)) {
                                                        arrayList10.add(r47Var8);
                                                    } else {
                                                        arrayList11.add(Integer.valueOf(r47Var8.e1()));
                                                        if (encryptedChat2 != null) {
                                                            j8 = e;
                                                            if (r47Var8.k.random_id != 0 && r47Var8.D != 10) {
                                                                if (arrayList9 == null) {
                                                                    arrayList9 = new ArrayList();
                                                                }
                                                                ArrayList arrayList13 = arrayList9;
                                                                arrayList13.add(Long.valueOf(r47Var8.k.random_id));
                                                                arrayList9 = arrayList13;
                                                            }
                                                            i44++;
                                                            e = j8;
                                                            i41 = i45;
                                                        }
                                                    }
                                                    j8 = e;
                                                    i44++;
                                                    e = j8;
                                                    i41 = i45;
                                                }
                                                i382 = i41;
                                                j52 = e;
                                            } else {
                                                i382 = i41;
                                                j52 = e;
                                                c = 0;
                                                if (r47.c3(r47Var72.k)) {
                                                    arrayList10.add(r47Var72);
                                                } else {
                                                    arrayList11.add(Integer.valueOf(r47Var72.e1()));
                                                    if (encryptedChat2 != null && r47Var72.k.random_id != 0 && r47Var72.D != 10) {
                                                        ArrayList arrayList14 = new ArrayList();
                                                        arrayList14.add(Long.valueOf(r47Var72.k.random_id));
                                                        arrayList7 = arrayList14;
                                                        long j10 = (j9 == 0 && (peer = r47Var72.k.peer_id) != null && peer.chat_id == (-j9)) ? j9 : j52;
                                                        if (arrayList11.isEmpty()) {
                                                            r3 = c;
                                                            arrayList8 = arrayList10;
                                                            j62 = j10;
                                                            i39 = 1;
                                                            uc7.s1(i382).X(arrayList11, arrayList7, encryptedChat2, j62, i42, zArr2[c], i43);
                                                        } else {
                                                            r3 = c;
                                                            arrayList8 = arrayList10;
                                                            j62 = j10;
                                                            i39 = 1;
                                                        }
                                                        size3 = arrayList8.size();
                                                        i40 = r3;
                                                        while (i40 < size3) {
                                                            Object obj = arrayList8.get(i40);
                                                            i40++;
                                                            r47 r47Var9 = (r47) obj;
                                                            uc7 s1 = uc7.s1(i382);
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(Integer.valueOf(r47Var9.e1()));
                                                            if (j62 == 0 || !wf3.y(j62)) {
                                                                j7 = 0;
                                                            } else {
                                                                TLRPC.Chat M02 = s1.M0(Long.valueOf(-j62));
                                                                j7 = xc2.T(M02) ? M02.id : 0L;
                                                            }
                                                            s1.t3(arrayList15, j62);
                                                            jf7 messagesStorage = s1.getMessagesStorage();
                                                            int P0 = r47Var9.P0();
                                                            messagesStorage.getClass();
                                                            zh6 zh6Var = new zh6(i39);
                                                            ArrayList arrayList16 = new ArrayList(i39);
                                                            arrayList16.add(Integer.valueOf(P0));
                                                            zh6Var.k(j62, arrayList16);
                                                            messagesStorage.H(new ds6((Object) messagesStorage, (Object) zh6Var, (boolean) r3, (byte) 3));
                                                            s1.getMessagesStorage().M0(j62, arrayList15, true, true, r47.c5(r47Var9.k) ? 9 : r3, i42);
                                                            s1.getMessagesStorage().O1(j62, j7, arrayList15, null);
                                                            jn7 notificationCenter = s1.getNotificationCenter();
                                                            Long valueOf = Long.valueOf(j7);
                                                            Integer valueOf2 = Integer.valueOf((int) r3);
                                                            Object[] objArr = new Object[6];
                                                            objArr[r3] = arrayList15;
                                                            objArr[i39] = valueOf;
                                                            Boolean bool = Boolean.FALSE;
                                                            objArr[2] = bool;
                                                            objArr[3] = bool;
                                                            objArr[4] = bool;
                                                            objArr[5] = valueOf2;
                                                            notificationCenter.k(jn7.v, objArr);
                                                            if (!r47.c5(r47Var9.k) || r47Var9.a5()) {
                                                                TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                tL_deleteMessage.peer = s1.j1(r47.B0(r47Var9.k));
                                                                TLRPC.Message message6 = r47Var9.k;
                                                                tL_deleteMessage.receiver_id = s1.o1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                tL_deleteMessage.id = r47Var9.P0();
                                                                s1.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new pp0(r3));
                                                            } else {
                                                                TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                tL_deleteWelcomeMessage.peer = s1.j1(r47.B0(r47Var9.k));
                                                                tL_deleteWelcomeMessage.id = r47Var9.P0();
                                                                s1.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new pp0(r3));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList7 = arrayList9;
                                            if (j9 == 0) {
                                            }
                                            if (arrayList11.isEmpty()) {
                                            }
                                            size3 = arrayList8.size();
                                            i40 = r3;
                                            while (i40 < size3) {
                                            }
                                        } else {
                                            long j11 = e;
                                            int i46 = 0;
                                            int i47 = 1;
                                            while (i47 >= 0) {
                                                ArrayList arrayList17 = new ArrayList();
                                                int i48 = i46;
                                                while (true) {
                                                    sparseArrayArr2 = sparseArrayArr;
                                                    if (i48 >= sparseArrayArr2[i47].size()) {
                                                        break;
                                                    }
                                                    arrayList17.add(Integer.valueOf(sparseArrayArr2[i47].keyAt(i48)));
                                                    i48++;
                                                }
                                                if (encryptedChat2 != null) {
                                                    arrayList6 = new ArrayList();
                                                    int i49 = i46;
                                                    while (i49 < sparseArrayArr2[i47].size()) {
                                                        r47 r47Var10 = (r47) sparseArrayArr2[i47].valueAt(i49);
                                                        int i50 = i46;
                                                        long j12 = r47Var10.k.random_id;
                                                        if (j12 != 0 && r47Var10.D != 10) {
                                                            arrayList6.add(Long.valueOf(j12));
                                                        }
                                                        i49++;
                                                        i46 = i50;
                                                    }
                                                } else {
                                                    arrayList6 = null;
                                                }
                                                int i51 = i46;
                                                uc7.s1(i41).X(arrayList17, arrayList6, encryptedChat2, (i47 != 1 || j9 == 0) ? j11 : j9, i42, zArr2[i51], i43);
                                                sparseArrayArr2[i47].clear();
                                                i47--;
                                                i46 = i51;
                                            }
                                        }
                                        runnable.run();
                                    }
                                };
                                if (z12) {
                                }
                                if (z12) {
                                }
                                if (r47Var == null) {
                                }
                                TimeUnit timeUnit2 = TimeUnit.HOURS;
                                if (z6) {
                                }
                                alertDialog$Builder.g(ob6.M0(2131752570, r8), r8);
                                idVar2.O = new DialogInterface.OnDismissListener() { // from class: ah
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        byte b22 = b42;
                                        hm1 hm1Var22 = hm1Var;
                                        switch (b22) {
                                            case 0:
                                                hm1Var22.run();
                                                break;
                                            case 1:
                                                if (hm1Var22 != null) {
                                                    hm1Var22.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (hm1Var22 != null) {
                                                    hm1Var22.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                eVar.showDialog(idVar2);
                                textView = (TextView) idVar2.c(-1);
                                if (textView != null) {
                                }
                                textView2 = (TextView) idVar2.c(-3);
                                if (textView2 == null) {
                                }
                            }

                            public static id z(LaunchActivity launchActivity) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                                String M0 = ob6.M0(2131748471, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131748472, null);
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.j(ob6.M0(2131748474, null), new pd(launchActivity, (byte) 2));
                                return idVar;
                            }
                        }
