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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ij {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static hd A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder T2 = gl.T2(k96.M0(2131747111, null));
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = T2;
        int i = bkb.K5;
        alertDialog$Builder.l(R.raw.permission_request_location, 72, bkb.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(k96.M0(2131747107, null), new mh(activity, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        return hdVar;
    }

    public static hd B(Activity activity, boolean z, TLRPC.User user, uc7 uc7Var, wjb wjbVar) {
        int[] iArr = new int[1];
        String[] strArr = {k96.M0(2131745425, null), k96.M0(2131745424, null), k96.M0(2131745423, null), k96.M0(2131745422, null)};
        LinearLayout m = ir2.m(activity, 1);
        m.setPadding(0, 0, 0, gl.L(4.0f));
        TextView textView = new TextView(activity);
        if (z) {
            textView.setText(k96.M0(2131748652, null));
        } else if (user != null) {
            textView.setText(k96.a0(null, null, 2131748649, l7c.k(user, true)));
        } else {
            textView.setText(k96.M0(2131748650, null));
        }
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 16.0f);
        byte b = 5;
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        m.addView(textView, nme.t(-2, -2, (k96.a0 ? 5 : 3) | 48, 24, z ? 4 : 0, 24, 8));
        int i = 0;
        while (i < 4) {
            wy8 wy8Var = new wy8(activity, wjbVar);
            wy8Var.d = (byte) 42;
            wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            wy8Var.setTag(Integer.valueOf(i));
            a(wy8Var, bkb.f7, bkb.D5, wjbVar);
            wy8Var.b(strArr[i], iArr[0] == i);
            m.addView(wy8Var);
            wy8Var.setOnClickListener(new ze(iArr, m));
            i++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        hd hdVar = alertDialog$Builder.a;
        if (z) {
            hdVar.S = k96.M0(2131748651, null);
        } else {
            int i2 = bkb.K5;
            int f = wjbVar != null ? wjbVar.f(i2) : bkb.w0(null, i2, false);
            hdVar.c0 = new xaa(activity, 0);
            hdVar.d0 = f;
            hdVar.e0 = -1;
            if (wjbVar == null) {
                alertDialog$Builder.m(i2, null);
            }
        }
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131745267, null), new o(iArr, uc7Var, b));
        alertDialog$Builder.h(k96.M0(2131752577, null), null);
        return hdVar;
    }

    public static fx0 C(final long j, final long j2, final wjb wjbVar, final d dVar) {
        if (dVar.getParentActivity() == null) {
            return null;
        }
        fx0 i = ug8.i(dVar.getParentActivity(), false, 1, wjbVar);
        i.P = k96.M0(2131747731, null);
        i.Q = true;
        CharSequence[] charSequenceArr = {k96.a0("MuteFor", null, 2131748120, k96.G(1, "Hours", new Object[0])), k96.a0("MuteFor", null, 2131748120, k96.G(8, "Hours", new Object[0])), k96.a0("MuteFor", null, 2131748120, k96.G(2, "Days", new Object[0])), k96.M0(2131748121, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: gh
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
                im7.n(y6c.t0).T(j, i3, j2);
                d dVar2 = dVar;
                if (u21.a(dVar2)) {
                    u21.z(dVar2, i3, 0, wjbVar).j();
                }
            }
        };
        i.M = charSequenceArr;
        i.L = onClickListener;
        return i;
    }

    public static void D(Context context, wjb wjbVar, gj gjVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        byte b = 0;
        int i = bkb.i5;
        if (wjbVar != null) {
            w0 = wjbVar.f(i);
            w02 = wjbVar.f(bkb.g5);
            wjbVar.f(bkb.zj);
            wjbVar.f(bkb.Dj);
            wjbVar.f(bkb.D8);
            wjbVar.f(bkb.F8);
            wjbVar.f(bkb.h6);
            w03 = wjbVar.f(bkb.Ii);
            w04 = wjbVar.f(bkb.Ei);
            w05 = wjbVar.f(bkb.Gi);
        } else {
            w0 = bkb.w0(null, i, false);
            w02 = bkb.w0(null, bkb.g5, false);
            bkb.w0(null, bkb.zj, false);
            bkb.w0(null, bkb.Dj, false);
            bkb.w0(null, bkb.D8, false);
            bkb.w0(null, bkb.F8, false);
            bkb.w0(null, bkb.h6, false);
            w03 = bkb.w0(null, bkb.Ii, false);
            w04 = bkb.w0(null, bkb.Ei, false);
            w05 = bkb.w0(null, bkb.Gi, false);
        }
        int i2 = w04;
        int i3 = w05;
        i4d i4dVar = new i4d(context, wjbVar);
        Object obj = i4dVar.a;
        ((fx0) obj).w0 = false;
        int[] iArr = {30, 60, 120, kk7.J2, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        vi viVar = new vi(context, wjbVar, iArr);
        viVar.setMinValue(0);
        viVar.setMaxValue(20);
        viVar.setTextColor(w0);
        viVar.setValue(0);
        viVar.setFormatter(new de(iArr, b));
        qi qiVar = new qi(context, viVar, (byte) 1);
        qiVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        qiVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131748118, null));
        textView.setTextColor(w0);
        ir2.t(textView, 1, 20.0f);
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        qiVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        wb wbVar = new wb(context, (byte) 6);
        linearLayout.addView(viVar, nme.l(1.0f, 0, kk7.s4));
        viVar.setOnValueChangedListener(new c((byte) 17));
        wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        wbVar.setGravity(17);
        wbVar.setTextColor(w03);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gl.o());
        int L = gl.L(8.0f);
        wbVar.setBackgroundDrawable(bkb.i0(L, L, L, L, i2, i3, i3));
        wbVar.setText(k96.M0(2131753863, null));
        qiVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
        wbVar.setOnClickListener(new ee((Object) iArr, (Object) viVar, (Object) gjVar, (Object) i4dVar, (byte) 0));
        fx0 fx0Var = (fx0) obj;
        fx0Var.O = qiVar;
        fx0Var.show();
        fx0Var.s0(w02);
        fx0Var.L(w02);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        HashMap hashMap = new HashMap();
        int i = bkb.K5;
        hashMap.put("info1", Integer.valueOf(bkb.w0(null, i, false)));
        hashMap.put("info2", Integer.valueOf(bkb.w0(null, i, false)));
        alertDialog$Builder.l(R.raw.not_available, 52, bkb.w0(null, i, false), hashMap);
        alertDialog$Builder.m(i, null);
        hdVar.X = true;
        alertDialog$Builder.j(k96.M0(2131752029, null), null);
        hdVar.U = str2;
        return alertDialog$Builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hd F(Activity activity, long j, final long j2, int i, final Runnable runnable, wjb wjbVar) {
        int i2;
        int i3;
        char c;
        CharSequence[] charSequenceArr;
        final long j3 = j;
        final int i4 = i;
        final SharedPreferences sharedPreferences = na7.q1(y6c.t0).W3;
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
            charSequenceArr = new String[]{k96.M0(2131747687, null), k96.M0(2131747689, null), k96.M0(2131747688, null), k96.M0(2131747690, null), k96.M0(2131747686, null)};
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
                charSequenceArr2[0] = k96.M0(2131747689, null);
                charSequenceArr2[1] = k96.M0(2131747688, null);
                charSequenceArr2[c] = k96.M0(2131747690, null);
                charSequenceArr2[3] = k96.M0(2131747686, null);
                charSequenceArr = charSequenceArr2;
            }
            c = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = k96.M0(2131747689, null);
            charSequenceArr22[1] = k96.M0(2131747688, null);
            charSequenceArr22[c] = k96.M0(2131747690, null);
            charSequenceArr22[3] = k96.M0(2131747686, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout m = ir2.m(activity, i2);
        int i7 = i3;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i7, wjbVar, activity);
        int i8 = i7;
        while (i8 < charSequenceArr.length) {
            wy8 wy8Var = new wy8(activity, wjbVar);
            wy8Var.setPadding(gl.L(4.0f), i7, gl.L(4.0f), i7);
            wy8Var.setTag(Integer.valueOf(i8));
            a(wy8Var, bkb.f7, bkb.D5, wjbVar);
            wy8Var.b(charSequenceArr[i8], iArr[i7] == i8 ? 1 : i7);
            m.addView(wy8Var);
            wy8Var.setOnClickListener(new View.OnClickListener() { // from class: eh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i9 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
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
                        im7.n(y6c.t0).f(j4, j2);
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
                        im7.n(y6c.t0).g(i13);
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
        String M0 = k96.M0(2131747713, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131752577, null), null);
        return hdVar;
    }

    public static void G(int i, long j, f53 f53Var, Context context, TLRPC.Photo photo) {
        if (context != null) {
            yg ygVar = new yg(i, j, f53Var, context, photo);
            fx0 fx0Var = new fx0(1, (wjb) f53Var, context, true);
            fx0Var.K();
            fx0Var.P = k96.M0(2131746019, null);
            fx0Var.Q = true;
            CharSequence[] charSequenceArr = {k96.M0(2131746028, null), k96.M0(2131746034, null), k96.M0(2131746027, null), k96.M0(2131746036, null), k96.M0(2131746033, null), k96.M0(2131746031, null), k96.M0(2131746030, null), k96.M0(2131746032, null)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            zg zgVar = new zg(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, context, f53Var, ygVar, (byte) 0);
            fx0Var.M = charSequenceArr;
            fx0Var.N = iArr;
            fx0Var.L = zgVar;
            fx0Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, zh] */
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
    public static i4d H(final Context context, final long j, long j2, int i, boolean z, final gj gjVar, Runnable runnable, fj fjVar, wjb wjbVar) {
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
        s67 s67Var;
        int[] iArr2;
        String[] strArr2;
        oy8 oy8Var;
        final ci ciVar;
        int i2;
        ry8 ry8Var;
        int i3;
        s67 s67Var2;
        ?? r4;
        int i4;
        final fx0 fx0Var;
        TLRPC.User V1;
        TLRPC.UserStatus userStatus;
        boolean z2;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i};
        long e = y6c.h(y6c.t0).e();
        final i4d i4dVar = new i4d(context, wjbVar);
        Object obj2 = i4dVar.a;
        ((fx0) obj2).w0 = false;
        final hn7 hn7Var = new hn7(context, wjbVar);
        int i5 = fjVar.a;
        int i6 = fjVar.c;
        int i7 = fjVar.b;
        hn7Var.setTextColor(i5);
        hn7Var.setTextOffset(gl.L(10.0f));
        hn7Var.setItemCount(5);
        final ci ciVar2 = new ci(context, wjbVar);
        ciVar2.setWrapSelectorWheel(true);
        ciVar2.setAllItemsCount(24);
        ciVar2.setItemCount(5);
        ciVar2.setTextColor(i5);
        ciVar2.setTextOffset(-gl.L(10.0f));
        final di diVar = new di(context, wjbVar);
        diVar.setWrapSelectorWheel(true);
        diVar.setAllItemsCount(60);
        diVar.setItemCount(5);
        diVar.setTextColor(i5);
        diVar.setTextOffset(-gl.L(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        ?? zhVar = new zh(context, hn7Var, ciVar2, diVar, (byte) 1);
        zhVar.setClipToPadding(false);
        zhVar.setClipChildren(false);
        zhVar.setOrientation(1);
        frameLayout2.addView(zhVar, nme.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        zhVar.addView(frameLayout4, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (j == e) {
            r22 = 0;
            textView.setText(k96.M0(2131745322, null));
        } else {
            r22 = 0;
            textView.setText(k96.M0(2131745667, null));
        }
        textView.setTextColor(i5);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        frameLayout4.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 13));
        boolean[] zArr2 = new boolean[1];
        zArr2[r22] = true;
        if (!cf3.D(j) || j == e || (V1 = na7.q1(y6c.t0).V1(Long.valueOf(j))) == null || V1.bot || (userStatus = V1.status) == null || userStatus.expires <= 0) {
            context2 = context;
            viewGroup = frameLayout2;
            obj = obj2;
            j3 = e;
            frameLayout = frameLayout3;
            c = 2;
            r8 = zhVar;
            viewGroup2 = frameLayout4;
            zArr = zArr2;
            r7Var = null;
        } else {
            String k = l7c.k(V1, true);
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
            r8 = zhVar;
            c = 2;
            zArr = zArr2;
            j3 = e;
            viewGroup2 = frameLayout4;
            r7Var = new r7(context, null, 0, fjVar.a, false, wjbVar);
            context2 = context;
            r7Var.setLongClickEnabled(z2);
            r7Var.setSubMenuOpenSide(2);
            r7Var.setIcon(R.drawable.ic_ab_other);
            r7Var.setBackground(bkb.f0(i6, 1, -1));
            viewGroup2.addView(r7Var, nme.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            r7Var.g(1, k96.a0(null, null, 2131745658, str));
            r7Var.setContentDescription(k96.M0(2131754838, null));
        }
        byte b = 12;
        if (r7Var != null) {
            r7Var.setOnClickListener(new t(r7Var, fjVar, b));
            r7Var.setDelegate(new ie((Object) gjVar, (Object) zArr, (Object) i4dVar, (byte) 0));
        }
        ry8 ry8Var2 = new ry8(context2);
        oy8 oy8Var2 = new oy8(R.raw.notify_toggle, gl.L(24.0f), gl.L(24.0f), true, null);
        oy8Var2.E(true);
        oy8Var2.h = true;
        oy8Var2.start();
        oy8Var2.H(40);
        oy8Var2.K(40);
        ry8Var2.setScaleType(ImageView.ScaleType.CENTER);
        ry8Var2.setAnimation(oy8Var2);
        ry8Var2.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
        ry8Var2.setBackground(bkb.f0(i6, 1, -1));
        viewGroup2.addView(ry8Var2, nme.d(40, 40.0f, 53, 0.0f, 8.0f, (r7Var != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r8.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        char c2 = c;
        final wb wbVar = new wb(context2, (byte) 1);
        linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
        hn7Var.setMinValue(0);
        hn7Var.setMaxValue(365);
        hn7Var.setWrapSelectorWheel(false);
        hn7Var.setFormatter(new c((byte) 18));
        Object obj3 = obj;
        final boolean[] zArr3 = zArr;
        final long j4 = j3;
        fn7 fn7Var = new fn7() { // from class: we
            @Override // fn7
            public final void i(hn7 hn7Var2, int i8) {
                ij.g(wb.this, null, 0L, 0L, j4 == j ? 1 : 0, hn7Var, ciVar2, diVar);
            }
        };
        hn7Var.setOnValueChangedListener(fn7Var);
        ciVar2.setMinValue(0);
        ciVar2.setMaxValue(23);
        final r7 r7Var2 = r7Var;
        linearLayout.addView(ciVar2, nme.l(0.2f, 0, kk7.s4));
        ciVar2.setFormatter(new c((byte) 19));
        ciVar2.setOnValueChangedListener(fn7Var);
        diVar.setMinValue(0);
        diVar.setMaxValue(59);
        diVar.setValue(0);
        diVar.setFormatter(new c((byte) 23));
        linearLayout.addView(diVar, nme.l(0.3f, 0, kk7.s4));
        diVar.setOnValueChangedListener(fn7Var);
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
                diVar.setValue(calendar.get(12));
                ciVar2.setValue(calendar.get(11));
                hn7Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(wbVar, null, 0L, 0L, j4 == j ? 1 : 0, hn7Var, ciVar2, diVar);
        if (ConnectionsManager.getInstance(y6c.t0).isTestBackend()) {
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
            strArr[0] = k96.M0(2131748308, null);
            strArr[1] = "Every minute";
            strArr[c2] = "Every 5 minutes";
            strArr[3] = k96.M0(2131748310, null);
            strArr[4] = k96.M0(2131748307, null);
            strArr[5] = k96.M0(2131748311, null);
            strArr[6] = k96.M0(2131748309, null);
            strArr[7] = k96.M0(2131748313, null);
            strArr[8] = k96.M0(2131748312, null);
            strArr[9] = k96.M0(2131748306, null);
            s67Var = null;
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
            s67Var = null;
            strArr[0] = k96.M0(2131748308, null);
            strArr[1] = k96.M0(2131748310, null);
            strArr[c2] = k96.M0(2131748307, null);
            strArr[3] = k96.M0(2131748311, null);
            strArr[4] = k96.M0(2131748309, null);
            strArr[5] = k96.M0(2131748313, null);
            strArr[6] = k96.M0(2131748312, null);
            strArr[7] = k96.M0(2131748306, null);
        }
        String[] strArr3 = strArr;
        if (z) {
            iArr2 = iArr;
            strArr2 = strArr3;
            oy8Var = oy8Var2;
            ciVar = ciVar2;
            i2 = i7;
            ry8Var = ry8Var2;
            i3 = 0;
            s67Var2 = s67Var;
            r4 = s67Var2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            i2 = i7;
            int v = bkb.v(i2, bkb.p1(0.075f, i5));
            int[] iArr4 = iArr;
            int p1 = bkb.p1(0.1f, i5);
            ?? textView2 = new TextView(context2);
            strArr2 = strArr3;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i5);
            textView2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
            int L = gl.L(14.0f);
            int v2 = bkb.v(v, p1);
            textView2.setBackground(bkb.i0(L, L, L, L, v, v2, v2));
            textView2.setGravity(17);
            ciVar = ciVar2;
            i3 = 0;
            oy8Var = oy8Var2;
            ry8Var = ry8Var2;
            s67Var2 = new s67(iArr4, iArr3, strArr2, textView2, (byte) 7);
            iArr2 = iArr4;
            s67Var2.run();
            frameLayout5.addView(textView2, nme.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r8.addView(frameLayout5, nme.o(-1, -2));
            s67Var = textView2;
            r4 = frameLayout5;
        }
        wbVar.setPadding(gl.L(34.0f), i3, gl.L(34.0f), i3);
        wbVar.setGravity(17);
        wbVar.setTextColor(fjVar.g);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gl.o());
        int i8 = fjVar.h;
        float[] fArr = new float[1];
        fArr[i3] = 24.0f;
        wbVar.setBackground(sjb.e(i8, fArr));
        r8.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        int i9 = i2;
        wbVar.setOnClickListener(new View.OnClickListener() { // from class: tf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr4[0] = false;
                int i10 = j4 == j ? 1 : 0;
                hn7 hn7Var2 = hn7Var;
                ci ciVar3 = ciVar;
                di diVar2 = diVar;
                boolean g = ij.g(null, null, 0L, 0L, i10, hn7Var2, ciVar3, diVar2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, hn7Var2.getValue());
                calendar4.set(11, ciVar3.getValue());
                calendar4.set(12, diVar2.getValue());
                if (g) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                gjVar.s((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                ((fx0) i4dVar.a).y0.run();
            }
        });
        fx0 fx0Var2 = (fx0) obj3;
        fx0Var2.O = viewGroup;
        fx0Var2.show();
        fx0Var2.setOnDismissListener(new vf(runnable, zArr4));
        fx0Var2.s0(i9);
        fx0Var2.L(i9);
        if (s67Var != null) {
            i4 = 1;
            fx0Var = fx0Var2;
            s67Var.setOnClickListener(new lh(frameLayout, wjbVar, fx0Var2, (FrameLayout) r4, iArr2, strArr2, iArr3, s67Var2));
        } else {
            i4 = 1;
            fx0Var = fx0Var2;
        }
        final je5[] je5VarArr = new je5[i4];
        final oy8 oy8Var3 = oy8Var;
        ry8Var.setOnClickListener(new View.OnClickListener() { // from class: xd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String M0;
                boolean[] zArr5 = zArr3;
                byte b2 = 0;
                boolean z3 = zArr5[0];
                zArr5[0] = !z3;
                oy8 oy8Var4 = oy8Var3;
                int i10 = oy8Var4.b0;
                if (z3) {
                    if (i10 < 40) {
                        oy8Var4.H(40);
                    }
                    oy8Var4.K(80);
                    oy8Var4.start();
                } else {
                    if (i10 >= 40) {
                        oy8Var4.H(0);
                    }
                    oy8Var4.K(40);
                    oy8Var4.start();
                }
                je5[] je5VarArr2 = je5VarArr;
                je5 je5Var = je5VarArr2[0];
                if (je5Var != null) {
                    je5Var.f(true);
                    je5VarArr2[0] = null;
                }
                na7 q1 = na7.q1(y6c.t0);
                long j6 = j;
                TLRPC.User V12 = q1.V1(Long.valueOf(j6));
                TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-j6));
                je5 je5Var2 = new je5(context, 3);
                je5VarArr2[0] = je5Var2;
                je5Var2.r();
                je5Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                je5Var2.q(20.0f);
                je5Var2.s(gl.L(12.0f), gl.L(4.0f), bkb.p1(0.25f, -16777216));
                if (hc2.V(K0)) {
                    M0 = k96.M0(zArr5[0] ? 2131745662 : 2131745666, null);
                } else if (K0 != null || V12 == null) {
                    M0 = k96.M0(zArr5[0] ? 2131745660 : 2131745664, null);
                } else if (j6 == j4) {
                    M0 = k96.M0(zArr5[0] ? 2131745659 : 2131745663, null);
                } else {
                    M0 = k96.a0(null, null, zArr5[0] ? 2131745661 : 2131745665, l7c.l(V12));
                }
                je5Var2.t(M0);
                je5Var2.d = 5000L;
                je5Var2.n(1.0f, -((r7Var2 != null ? 42 : -8) + 20));
                je5Var2.r0 = new hh(je5Var2, b2);
                fx0 fx0Var3 = fx0Var;
                fx0Var3.b.setClipToPadding(false);
                fx0Var3.b.setClipChildren(false);
                fx0Var3.b.addView(je5Var2, nme.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                je5Var2.v();
            }
        });
        return i4dVar;
    }

    public static void I(Context context, long j, gj gjVar) {
        H(context, j, -1L, 0, false, gjVar, null, new fj(null), null);
    }

    public static void J(Context context, long j, gj gjVar, wjb wjbVar) {
        H(context, j, -1L, 0, false, gjVar, null, new fj(wjbVar), wjbVar);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, wjb wjbVar) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        if (str == null) {
            str = k96.M0(R.string.AppName, null);
        }
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        if (str3 == null) {
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(str3, new ce(runnable, (byte) 4));
        return alertDialog$Builder;
    }

    public static hd M(Context context, wjb wjbVar, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = charSequence;
        alertDialog$Builder.j(str2, new ce(runnable, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        return hdVar;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
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

    public static void O(Context context, d dVar, String str, String str2, String str3, String str4, int i, String str5, wjb wjbVar, yc7 yc7Var) {
        Activity W = gl.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        hd[] hdVarArr = new hd[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        hj hjVar = new hj(context);
        hjVar.setTextSize(1, 16.0f);
        int i2 = bkb.i5;
        zkb.X(hjVar, i2, wjbVar);
        zkb.D(hjVar, bkb.Ni, wjbVar);
        hjVar.setHint(str3);
        hjVar.setFocusable(true);
        hjVar.setInputType(147457);
        hjVar.setImeOptions(6);
        hjVar.setMaxLines(10);
        hjVar.setPadding(gl.L(16.0f), gl.L(11.0f), gl.L(16.0f), gl.L(11.0f));
        hjVar.setCursorWidth(1.5f);
        hjVar.A(bkb.p6, wjbVar);
        if (str4 != null) {
            hjVar.setText(str4);
        }
        hjVar.setOnEditorActionListener(new yf(hjVar, i, yc7Var, hdVarArr, currentFocus, (byte) 0));
        hjVar.addTextChangedListener(new fi(i, hjVar));
        ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i2, wjbVar)));
        vkb K = zkb.K(0.06f, i2);
        hjVar.setBackground(b0);
        zkb.j(hjVar, b0, K, null, wjbVar);
        LinearLayout j = de9.j(context, 1);
        j.addView(hjVar, nme.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(j);
        hdVar.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
        byte b = 0;
        alertDialog$Builder.j(str5, new zf(hjVar, i, yc7Var, b));
        alertDialog$Builder.g(k96.M0(2131752577, null), new ag(b));
        hdVarArr[0] = hdVar;
        if (dVar != null) {
            gl.V2(W, dVar.getClassGuid());
        }
        hd hdVar2 = hdVarArr[0];
        hdVar2.k0 = false;
        hdVar2.setOnDismissListener(new bg(hjVar, dVar, W, b));
        hdVarArr[0].setOnShowListener(new be(hjVar, (byte) 1));
        hdVarArr[0].show();
        hjVar.setSelection(hjVar.getText().length());
    }

    public static void P(Context context, d dVar, wjb wjbVar, yc7 yc7Var) {
        O(context, dVar, k96.M0(2131744562, null), k96.M0(2131744569, null), k96.M0(2131744543, null), null, 12, k96.M0(2131751741, null), wjbVar, yc7Var);
    }

    public static i4d Q(Context context, long j, final gj gjVar, wjb wjbVar, int i) {
        int i2;
        int i3;
        int w0 = bkb.w0(null, bkb.i5, false);
        int w02 = bkb.w0(null, bkb.g5, false);
        bkb.w0(null, bkb.zj, false);
        bkb.w0(null, bkb.Dj, false);
        bkb.w0(null, bkb.D8, false);
        bkb.w0(null, bkb.F8, false);
        int i4 = bkb.h6;
        bkb.w0(null, i4, false);
        int w03 = bkb.w0(null, bkb.Ii, false);
        int w04 = bkb.w0(null, bkb.Ei, false);
        bkb.w0(null, bkb.Gi, false);
        if (context == null) {
            return null;
        }
        final i4d i4dVar = new i4d(context, wjbVar);
        Object obj = i4dVar.a;
        ((fx0) obj).w0 = false;
        final hn7 hn7Var = new hn7(context, wjbVar);
        hn7Var.setTextColor(w0);
        hn7Var.setTextOffset(gl.L(10.0f));
        hn7Var.setItemCount(5);
        final aj ajVar = new aj(context, wjbVar);
        ajVar.setWrapSelectorWheel(true);
        ajVar.setAllItemsCount(24);
        ajVar.setItemCount(5);
        ajVar.setTextColor(w0);
        ajVar.setTextOffset(-gl.L(10.0f));
        final bj bjVar = new bj(context, wjbVar);
        bjVar.setWrapSelectorWheel(true);
        bjVar.setAllItemsCount(60);
        bjVar.setItemCount(5);
        bjVar.setTextColor(w0);
        bjVar.setTextOffset(-gl.L(34.0f));
        zh zhVar = new zh(context, hn7Var, ajVar, bjVar, (byte) 7);
        zhVar.setOrientation(1);
        LinearLayout j2 = de9.j(context, 1);
        zhVar.addView(j2, nme.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(i == 1 ? 2131744133 : 2131746902, null));
        textView.setTextColor(w0);
        ir2.t(textView, 1, 20.0f);
        j2.addView(textView, nme.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new p8((byte) 3));
        TextView textView2 = new TextView(context);
        zkb.X(textView2, bkb.y6, wjbVar);
        ir2.r(14.0f, 1, 2131746901, textView2, null);
        j2.addView(textView2, nme.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new p8((byte) 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i5 = calendar.get(1);
        vr2 vr2Var = na7.q1(y6c.t0).k4.i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long g = vr2Var.g(timeUnit) << 1;
        final long g2 = na7.q1(y6c.t0).k4.j.g(timeUnit) - 86400;
        final wb wbVar = new wb(context, (byte) 8);
        linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
        hn7Var.setMinValue(0);
        hn7Var.setMaxValue(365);
        hn7Var.setWrapSelectorWheel(false);
        hn7Var.setFormatter(new qf(i5, (byte) 0));
        final int i6 = i == 1 ? 5 : 3;
        fn7 fn7Var = new fn7() { // from class: rf
            @Override // fn7
            public final void i(hn7 hn7Var2, int i7) {
                ij.g(wb.this, null, g, g2, i6, hn7Var, ajVar, bjVar);
            }
        };
        hn7Var.setOnValueChangedListener(fn7Var);
        ajVar.setMinValue(0);
        ajVar.setMaxValue(23);
        linearLayout.addView(ajVar, nme.l(0.2f, 0, kk7.s4));
        ajVar.setFormatter(new c((byte) 25));
        ajVar.setOnValueChangedListener(fn7Var);
        bjVar.setMinValue(0);
        bjVar.setMaxValue(59);
        bjVar.setValue(0);
        bjVar.setFormatter(new c((byte) 26));
        linearLayout.addView(bjVar, nme.l(0.3f, 0, kk7.s4));
        bjVar.setOnValueChangedListener(fn7Var);
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
                bjVar.setValue(calendar.get(12));
                ajVar.setValue(calendar.get(11));
                hn7Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(wbVar, null, g, g2, i6, hn7Var, ajVar, bjVar);
        wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        wbVar.setGravity(17);
        wbVar.setTextColor(w03);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gl.o());
        wbVar.setBackground(sjb.e(w04, 8.0f));
        zhVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 4));
        final int i7 = i6;
        wbVar.setOnClickListener(new View.OnClickListener() { // from class: sf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j4 = g;
                long j5 = g2;
                byte b = i7;
                hn7 hn7Var2 = hn7Var;
                aj ajVar2 = ajVar;
                bj bjVar2 = bjVar;
                boolean g3 = ij.g(null, null, j4, j5, b, hn7Var2, ajVar2, bjVar2);
                long epochMilli = LocalDate.now().plusDays(hn7Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, ajVar2.getValue());
                calendar2.set(12, bjVar2.getValue());
                if (g3) {
                    calendar2.set(13, 0);
                }
                gjVar.s((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((fx0) i4dVar.a).y0.run();
            }
        });
        ote.b(wbVar, 0.02f, 1.2f);
        wb wbVar2 = new wb(context, (byte) 9);
        wbVar2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        wbVar2.setGravity(17);
        wbVar2.setText(k96.M0(i == 1 ? 2131748279 : 2131746899, null));
        wbVar2.setTextColor(w04);
        wbVar2.setTextSize(1, 14.0f);
        int L = gl.L(8.0f);
        int i8 = bkb.c6;
        int w05 = bkb.w0(null, i8, false);
        int w06 = bkb.w0(null, i3, false);
        ff0 i0 = bkb.i0(L, L, L, L, w05, w06, w06);
        vkb M = zkb.M(i8);
        vkb M2 = zkb.M(i3);
        wbVar2.setBackground(i0);
        zkb.j(wbVar2, i0, M, M2, null);
        zhVar.addView(wbVar2, nme.t(-1, 48, 83, 16, 0, 16, 16));
        wbVar2.setOnClickListener(new b0(zArr, gjVar, i4dVar, (byte) 2));
        ote.b(wbVar2, 0.02f, 1.2f);
        fx0 fx0Var = (fx0) obj;
        fx0Var.O = zhVar;
        fx0Var.show();
        fx0Var.setOnDismissListener(new g5(zArr));
        fx0Var.s0(i2);
        fx0Var.L(i2);
        return i4dVar;
    }

    public static hd R(d dVar, wjb wjbVar) {
        if (dVar == null || dVar.getParentActivity() == null) {
            return null;
        }
        l46 l46Var = new l46(dVar.getParentActivity(), dVar.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(k96.M0(2131753982, null).replace("\n", "<br>")));
        byte b = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new ui(uRLSpan.getURL(), dVar), spanStart, spanEnd, 0);
        }
        l46Var.setText(spannableString);
        l46Var.setTextSize(1, 16.0f);
        zkb.G(l46Var, bkb.j5, wjbVar);
        zkb.C(l46Var, bkb.k5, wjbVar);
        l46Var.setPadding(gl.L(23.0f), 0, gl.L(23.0f), 0);
        l46Var.setMovementMethod(new cl(b));
        zkb.X(l46Var, bkb.i5, wjbVar);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, dVar.getParentActivity());
        alertDialog$Builder.n(l46Var);
        String M0 = k96.M0(2131753983, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.j(k96.M0(2131753981, null), new h6(dVar, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        return hdVar;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, wjb wjbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        alertDialog$Builder.a.S = k96.M0(2131748395, null);
        hn7 hn7Var = new hn7(context, null);
        hn7Var.setMinValue(0);
        hn7Var.setMaxValue(20);
        int i = encryptedChat.ttl;
        if (i > 0 && i < 16) {
            hn7Var.setValue(i);
        } else if (i == 30) {
            hn7Var.setValue(16);
        } else if (i == 60) {
            hn7Var.setValue(17);
        } else if (i == 3600) {
            hn7Var.setValue(18);
        } else if (i == 86400) {
            hn7Var.setValue(19);
        } else if (i == 604800) {
            hn7Var.setValue(20);
        } else if (i == 0) {
            hn7Var.setValue(0);
        }
        hn7Var.setFormatter(new ag((byte) 10));
        alertDialog$Builder.n(hn7Var);
        alertDialog$Builder.g(k96.M0(2131751342, null), new o(encryptedChat, hn7Var, (byte) 8));
        return alertDialog$Builder;
    }

    public static void T(d dVar, int i, akb akbVar, zjb zjbVar) {
        int i2;
        byte b;
        String str;
        if (dVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = dVar.getParentActivity();
        hj hjVar = new hj(parentActivity);
        String str2 = null;
        hjVar.setBackground(null);
        zkb.F(hjVar, bkb.t5, bkb.u5, bkb.p7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = k96.M0(2131748066, null);
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131751741, null), new ho9((byte) 13));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            textView.setText(gl.T2(k96.M0(2131751102, null)));
        } else {
            textView.setText(k96.M0(2131751103, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(gl.L(23.0f), gl.L(12.0f), gl.L(23.0f), gl.L(6.0f));
        int i3 = bkb.i5;
        zkb.X(textView, i3, null);
        linearLayout.addView(textView, nme.o(-1, -2));
        hjVar.setTextSize(1, 16.0f);
        zkb.X(hjVar, i3, null);
        hjVar.setMaxLines(1);
        hjVar.setLines(1);
        hjVar.setInputType(16385);
        hjVar.setGravity(51);
        hjVar.setSingleLine(true);
        hjVar.setImeOptions(6);
        hjVar.A(bkb.F6, null);
        hjVar.setCursorSize(gl.L(20.0f));
        hjVar.setCursorWidth(1.5f);
        hjVar.setPadding(0, gl.L(4.0f), 0, 0);
        linearLayout.addView(hjVar, nme.t(-1, 36, 51, 24, 6, 24, 0));
        hjVar.setOnEditorActionListener(new mg((byte) 0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        b00.q(9306112, hashMap, "Berry", 14598550, "Brandy");
        b00.q(8391495, hashMap, "Cherry", 16744272, "Coral");
        b00.q(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        b00.q(14725375, hashMap, "Mauve", 16761035, "Pink");
        b00.q(16711680, hashMap, "Red", 16711807, "Rose");
        b00.q(8406555, hashMap, "Russet", 16720896, "Scarlet");
        b00.q(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        b00.q(16760576, hashMap, "Amber", 15438707, "Apricot");
        b00.q(16508850, hashMap, "Banana", 10601738, "Citrus");
        b00.q(11560192, hashMap, "Ginger", 16766720, "Gold");
        b00.q(16640272, hashMap, "Lemon", 16753920, "Orange");
        b00.q(16770484, hashMap, "Peach", 16739155, "Persimmon");
        b00.q(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        b00.q(16763004, hashMap, "Topaz", 16776960, "Yellow");
        b00.q(3688720, hashMap, "Clover", 8628829, "Cucumber");
        b00.q(5294200, hashMap, "Emerald", 11907932, "Olive");
        b00.q(65280, hashMap, "Green", 43115, "Jade");
        b00.q(2730887, hashMap, "Jungle", 12582656, "Lime");
        b00.q(776785, hashMap, "Malachite", 10026904, "Mint");
        b00.q(11394989, hashMap, "Moss", 3234721, "Azure");
        b00.q(kk7.d4, hashMap, "Blue", 18347, "Cobalt");
        b00.q(5204422, hashMap, "Indigo", 96647, "Lagoon");
        b00.q(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        b00.q(128, hashMap, "Navy", 3101086, "Sapphire");
        b00.q(7788522, hashMap, "Sky", 32896, "Teal");
        b00.q(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        b00.q(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        b00.q(13148872, hashMap, "Lilac", 11894492, "Lavender");
        b00.q(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        b00.q(6684825, hashMap, "Purple", 14204888, "Thistle");
        b00.q(14315734, hashMap, "Orchid", 2361920, "Violet");
        b00.q(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        b00.q(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        b00.q(7365973, hashMap, "Coffee", 7956873, "Rum");
        b00.q(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        b00.q(12759680, hashMap, "Sand", 8924439, "Sienna");
        b00.q(7864585, hashMap, "Maple", 15787660, "Khaki");
        b00.q(12088115, hashMap, "Copper", 12144200, "Chestnut");
        b00.q(15653316, hashMap, "Almond", 16776656, "Cream");
        b00.q(12186367, hashMap, "Diamond", 11109127, "Honey");
        b00.q(16777200, hashMap, "Ivory", 15392968, "Pearl");
        b00.q(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        b00.q(16777215, hashMap, "White", 8421504, "Gray");
        b00.q(0, hashMap, "Black", 15266260, "Chrome");
        b00.q(3556687, hashMap, "Charcoal", 789277, "Ebony");
        b00.q(12632256, hashMap, "Silver", 16119285, "Smoke");
        b00.q(2499381, hashMap, "Steel", 5220413, "Apple");
        b00.q(8434628, hashMap, "Glacier", 16693933, "Melon");
        b00.q(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        zjb i4 = zjbVar == null ? bkb.B0().i(false) : zjbVar;
        if (i4 == null || (i2 = i4.c) == 0) {
            i2 = gl.q(bkb.r0())[0];
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
            str = ls6.o((String) asList.get(secureRandom.nextInt(asList.size())), " ", str2, new StringBuilder());
        } else {
            str = str2 + " " + ((String) asList2.get(secureRandom.nextInt(asList2.size())));
        }
        hjVar.setText(str);
        hjVar.setSelection(hjVar.length());
        be beVar = new be(hjVar, b);
        hd hdVar = alertDialog$Builder.a;
        hdVar.setOnShowListener(beVar);
        dVar.showDialog(hdVar);
        hjVar.requestFocus();
        hdVar.c(-1).setOnClickListener(new ng(dVar, hjVar, zjbVar, akbVar, hdVar, (byte) 0));
    }

    public static void U(Activity activity, String str, int i, int i2, int i3, p8c p8cVar) {
        if (activity == null) {
            return;
        }
        final byte b = 0;
        int w0 = bkb.w0(null, bkb.i5, false);
        int w02 = bkb.w0(null, bkb.g5, false);
        bkb.w0(null, bkb.zj, false);
        bkb.w0(null, bkb.Dj, false);
        bkb.w0(null, bkb.D8, false);
        bkb.w0(null, bkb.F8, false);
        bkb.w0(null, bkb.h6, false);
        bkb.w0(null, bkb.Ii, false);
        bkb.w0(null, bkb.Ei, false);
        bkb.w0(null, bkb.Gi, false);
        final byte b2 = 1;
        fx0 i4 = ug8.i(activity, false, 1, null);
        i4.w0 = false;
        yh yhVar = new yh(activity, null);
        zh zhVar = new zh(activity, yhVar);
        zhVar.setOrientation(0);
        zhVar.setWeightSum(1.0f);
        yhVar.setAllItemsCount(24);
        yhVar.setItemCount(5);
        yhVar.setTextColor(w0);
        yhVar.setGravity(5);
        yhVar.setTextOffset(-gl.L(12.0f));
        ai aiVar = new ai(activity, null);
        aiVar.setWrapSelectorWheel(true);
        aiVar.setAllItemsCount(60);
        aiVar.setItemCount(5);
        aiVar.setTextColor(w0);
        aiVar.setGravity(3);
        aiVar.setTextOffset(gl.L(12.0f));
        final kg kgVar = new kg(i2, i3, yhVar, aiVar, i, zhVar);
        zhVar.addView(yhVar, nme.l(0.5f, 0, kk7.s4));
        yhVar.setFormatter(new ag((byte) 8));
        yhVar.setOnValueChangedListener(new fn7() { // from class: lg
            @Override // fn7
            public final void i(hn7 hn7Var, int i5) {
                byte b3 = b;
                kg kgVar2 = kgVar;
                switch (b3) {
                    case 0:
                        kgVar2.a(Boolean.TRUE);
                        break;
                    default:
                        kgVar2.a(Boolean.TRUE);
                        break;
                }
            }
        });
        zhVar.addView(aiVar, nme.l(0.5f, 0, kk7.s4));
        aiVar.setFormatter(new ag((byte) 9));
        aiVar.setOnValueChangedListener(new fn7() { // from class: lg
            @Override // fn7
            public final void i(hn7 hn7Var, int i5) {
                byte b3 = b2;
                kg kgVar2 = kgVar;
                switch (b3) {
                    case 0:
                        kgVar2.a(Boolean.TRUE);
                        break;
                    default:
                        kgVar2.a(Boolean.TRUE);
                        break;
                }
            }
        });
        kgVar.a(Boolean.FALSE);
        bi biVar = new bi(activity, yhVar, aiVar);
        biVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 8));
        biVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
        biVar.addView(zhVar, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        u41 u41Var = new u41(null, activity, true);
        u41Var.setRoundRadius(24);
        u41Var.i(k96.M0(2131745480, null), false, true);
        u41Var.setOnClickListener(new f5(r1, b2));
        biVar.addView(u41Var, nme.t(-1, 48, 0, 16, 12, 16, 12));
        i4.O = biVar;
        i4.show();
        i4.setOnDismissListener(new bg(p8cVar, yhVar, aiVar, b2));
        i4.s0(w02);
        i4.L(w02);
        fx0[] fx0VarArr = {i4};
    }

    public static hd V(Activity activity, final long j, final long j2, String str, final Runnable runnable, wjb wjbVar) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences sharedPreferences = na7.q1(y6c.t0).W3;
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
            strArr = new String[]{k96.M0(2131743374, null), k96.M0(2131745174, null), k96.M0(2131748531, null), k96.M0(2131743373, null)};
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
            strArr = new String[]{k96.M0(2131743373, null), k96.M0(2131743374, null), k96.M0(2131745174, null), k96.M0(2131748531, null), k96.M0(2131747628, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout m = ir2.m(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        int i3 = 0;
        while (i3 < strArr2.length) {
            wy8 wy8Var = new wy8(activity, wjbVar);
            wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            wy8Var.setTag(Integer.valueOf(i3));
            a(wy8Var, bkb.f7, bkb.D5, wjbVar);
            wy8Var.b(strArr2[i3], iArr[0] == i3 ? z : false);
            m.addView(wy8Var);
            wy8Var.setOnClickListener(new View.OnClickListener() { // from class: bh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
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
                        im7.n(y6c.t0).f(j3, j2);
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
                            im7.n(y6c.t0).g(2);
                        } else if (str3.equals("vibrate_group")) {
                            im7.n(y6c.t0).g(0);
                        } else {
                            boolean equals = str3.equals("vibrate_react");
                            int i6 = y6c.t0;
                            if (equals) {
                                im7.n(i6).g(4);
                            } else {
                                im7.n(i6).g(1);
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
        String M0 = k96.M0(2131743375, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131752577, null), null);
        return hdVar;
    }

    public static hd W(Context context, wjb wjbVar, String[] strArr, int i, String str, String str2, vs2 vs2Var) {
        wjb wjbVar2;
        boolean z;
        byte b = 1;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    wjbVar2 = wjbVar;
                    z = true;
                    break;
                }
            }
        }
        wjbVar2 = wjbVar;
        z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, context);
        int i2 = bkb.K5;
        alertDialog$Builder.l(i, 72, bkb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        if (z) {
            str = str2;
        }
        SpannableStringBuilder T2 = gl.T2(str);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = T2;
        alertDialog$Builder.j(k96.M0(z ? 2131747107 : 2131752897, null), new xf(z, (Object) context, (Object) atomicBoolean, (Object) vs2Var, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131752892, null), new o(atomicBoolean, vs2Var, (byte) 6));
        hdVar.setOnDismissListener(new cf(atomicBoolean, vs2Var, b));
        return hdVar;
    }

    public static void X(int i, long j, int i2, p8c p8cVar) {
        Y(i, j, i2, p8cVar, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Y(final int i, final long j, int i2, p8c p8cVar, long j2) {
        wjb f53Var;
        wjb wjbVar;
        TLRPC.Chat chat;
        char c;
        Activity activity;
        long K1 = na7.q1(i).K1(j);
        if (K1 <= 0 && j > 0) {
            K1 = cf3.j(na7.q1(i).I2(j));
        }
        long j3 = i2 * K1;
        gta.v(i, false).P.put(Long.valueOf(j), Integer.valueOf(i2));
        if (j3 <= 0 || j2 == j3) {
            p8cVar.a(Long.valueOf(j3));
            return false;
        }
        final long j4 = K1;
        final re reVar = new re(i, j3, j, p8cVar, j4, (byte) 1);
        if (j4 <= na7.q1(i).X3.getLong(ug8.n(j, "ask_paid_message_", "_price"), 0L)) {
            reVar.run();
            return true;
        }
        Activity u0 = gl.u0();
        d S = LaunchActivity.S();
        if (!PhotoViewer.r0().U0()) {
            if (S == null) {
                wjbVar = null;
                String r = cf3.r(i, j);
                if (hc2.o0(i, j)) {
                }
                c = 0;
                activity = u0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = (int) j4;
                Object[] objArr = new Object[1];
                objArr[c] = r;
                spannableStringBuilder.append((CharSequence) gl.T2(k96.K("MessageLockedStarsConfirmMessage1", i3, ',', objArr)));
                spannableStringBuilder.append((CharSequence) " ");
                if (i2 != 1) {
                }
                f0(activity, k96.M0(2131748362, null), spannableStringBuilder, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new p8c() { // from class: ye
                    @Override // p8c
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i4 = i;
                            SharedPreferences.Editor edit = na7.q1(i4).X3.edit();
                            long j5 = j;
                            edit.putLong(ug8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                            gta.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                        }
                        gl.d3(reVar);
                    }
                }, wjbVar, true);
                return true;
            }
            if (!S.hasShownSheet()) {
                f53Var = S.getResourceProvider();
                wjbVar = f53Var;
                String r2 = cf3.r(i, j);
                if (hc2.o0(i, j)) {
                    r2 = mm4.i(i, j);
                } else if (S instanceof mu1) {
                    mu1 mu1Var = (mu1) S;
                    if (mu1Var.v4 && mu1Var.a() == j && (chat = mu1Var.u4) != null) {
                        c = 0;
                        activity = u0;
                        r2 = cf3.r(i, -chat.id);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i32 = (int) j4;
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = r2;
                        spannableStringBuilder2.append((CharSequence) gl.T2(k96.K("MessageLockedStarsConfirmMessage1", i32, ',', objArr2)));
                        spannableStringBuilder2.append((CharSequence) " ");
                        if (i2 != 1) {
                            spannableStringBuilder2.append((CharSequence) gl.T2(k96.H(',', "MessageLockedStarsConfirmMessage2One", i32)));
                        } else {
                            spannableStringBuilder2.append((CharSequence) gl.T2(k96.H(',', "MessageLockedStarsConfirmMessage2Many1", (int) j3)));
                            spannableStringBuilder2.append((CharSequence) " ");
                            spannableStringBuilder2.append((CharSequence) gl.T2(k96.H(',', "MessageLockedStarsConfirmMessage2Many2", i2)));
                        }
                        f0(activity, k96.M0(2131748362, null), spannableStringBuilder2, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new p8c() { // from class: ye
                            @Override // p8c
                            public final void a(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    int i4 = i;
                                    SharedPreferences.Editor edit = na7.q1(i4).X3.edit();
                                    long j5 = j;
                                    edit.putLong(ug8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                                    gta.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                                }
                                gl.d3(reVar);
                            }
                        }, wjbVar, true);
                        return true;
                    }
                }
                c = 0;
                activity = u0;
                SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
                int i322 = (int) j4;
                Object[] objArr22 = new Object[1];
                objArr22[c] = r2;
                spannableStringBuilder22.append((CharSequence) gl.T2(k96.K("MessageLockedStarsConfirmMessage1", i322, ',', objArr22)));
                spannableStringBuilder22.append((CharSequence) " ");
                if (i2 != 1) {
                }
                f0(activity, k96.M0(2131748362, null), spannableStringBuilder22, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new p8c() { // from class: ye
                    @Override // p8c
                    public final void a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            int i4 = i;
                            SharedPreferences.Editor edit = na7.q1(i4).X3.edit();
                            long j5 = j;
                            edit.putLong(ug8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                            gta.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                        }
                        gl.d3(reVar);
                    }
                }, wjbVar, true);
                return true;
            }
        }
        f53Var = new f53();
        wjbVar = f53Var;
        String r22 = cf3.r(i, j);
        if (hc2.o0(i, j)) {
        }
        c = 0;
        activity = u0;
        SpannableStringBuilder spannableStringBuilder222 = new SpannableStringBuilder();
        int i3222 = (int) j4;
        Object[] objArr222 = new Object[1];
        objArr222[c] = r22;
        spannableStringBuilder222.append((CharSequence) gl.T2(k96.K("MessageLockedStarsConfirmMessage1", i3222, ',', objArr222)));
        spannableStringBuilder222.append((CharSequence) " ");
        if (i2 != 1) {
        }
        f0(activity, k96.M0(2131748362, null), spannableStringBuilder222, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new p8c() { // from class: ye
            @Override // p8c
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i4 = i;
                    SharedPreferences.Editor edit = na7.q1(i4).X3.edit();
                    long j5 = j;
                    edit.putLong(ug8.n(j5, "ask_paid_message_", "_price"), j4).apply();
                    gta.v(i4, false).O.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                }
                gl.d3(reVar);
            }
        }, wjbVar, true);
        return true;
    }

    public static boolean Z(int i, ArrayList arrayList, int i2, p8c p8cVar) {
        wjb f53Var;
        wjb wjbVar;
        if (arrayList.isEmpty()) {
            p8cVar.a(new HashMap());
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
            long K1 = na7.q1(i).K1(longValue);
            if (K1 <= j && longValue > j) {
                K1 = cf3.j(na7.q1(i).I2(longValue));
            }
            hashMap.put(l, Long.valueOf(K1));
            j2 += K1;
            long j3 = j;
            gta.v(i, false).P.put(l, Integer.valueOf(i2));
            if (K1 > j3) {
                i5++;
            }
            if (K1 > j3 && z && na7.q1(i).X3.getLong(ug8.n(longValue, "ask_paid_message_", "_price"), j3) < K1) {
                z = false;
            }
            i3 = i5;
            j = 0;
        }
        int i6 = i3;
        long max = j2 * Math.max(1, i2);
        if (z || max <= 0) {
            p8cVar.a(hashMap);
            return false;
        }
        Activity u0 = gl.u0();
        d S = LaunchActivity.S();
        if (!PhotoViewer.r0().U0()) {
            if (S == null) {
                wjbVar = null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) gl.T2(k96.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) gl.T2(k96.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', k96.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
                f0(u0, k96.M0(2131748362, null), spannableStringBuilder, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fh(i, max, wjbVar, p8cVar, u0, arrayList, hashMap), wjbVar, true);
                return true;
            }
            if (!S.hasShownSheet()) {
                f53Var = S.getResourceProvider();
                wjbVar = f53Var;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) gl.T2(k96.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) gl.T2(k96.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', k96.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
                f0(u0, k96.M0(2131748362, null), spannableStringBuilder2, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fh(i, max, wjbVar, p8cVar, u0, arrayList, hashMap), wjbVar, true);
                return true;
            }
        }
        f53Var = new f53();
        wjbVar = f53Var;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
        spannableStringBuilder22.append((CharSequence) gl.T2(k96.H(',', "MessageLockedStarsConfirmMessageMulti1", i6)));
        spannableStringBuilder22.append((CharSequence) " ");
        spannableStringBuilder22.append((CharSequence) gl.T2(k96.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', k96.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i6) * i2))));
        f0(u0, k96.M0(2131748362, null), spannableStringBuilder22, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fh(i, max, wjbVar, p8cVar, u0, arrayList, hashMap), wjbVar, true);
        return true;
    }

    public static void a(wy8 wy8Var, int i, int i2, wjb wjbVar) {
        for (int i3 = 0; i3 < wy8Var.getChildCount(); i3++) {
            View childAt = wy8Var.getChildAt(i3);
            if (childAt instanceof RadioButton) {
                zkb.O((RadioButton) childAt, i, i2, wjbVar);
                return;
            }
        }
        wy8Var.a(bkb.v0(i, wjbVar), bkb.v0(i2, wjbVar));
    }

    public static boolean a0(int i, long j) {
        long K1 = na7.q1(i).K1(j);
        if (K1 <= 0 && j > 0) {
            K1 = cf3.j(na7.q1(i).I2(j));
        }
        return K1 > 0 && K1 > na7.q1(i).X3.getLong(ug8.n(j, "ask_paid_message_", "_price"), 0L);
    }

    public static void b(hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
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
        hn7Var3.setMaxValue(i5);
        hn7Var3.setMinValue(i2);
        int value = hn7Var3.getValue();
        hn7Var2.setMaxValue(value == i5 ? i6 : 11);
        hn7Var2.setMinValue(value == i2 ? i3 : 0);
        int value2 = hn7Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i5 && value2 == i6) {
            actualMaximum = Math.min(i7, actualMaximum);
        }
        hn7Var.setMaxValue(actualMaximum);
        if (value == i2 && value2 == i3) {
            i = i4;
        }
        hn7Var.setMinValue(i);
    }

    public static void b0(hj hjVar, hd hdVar, d dVar) {
        if (dVar.getParentActivity() != null) {
            gl.t1(hjVar);
            String obj = hjVar.getText().toString();
            int i = bkb.a;
            akb akbVar = new akb();
            akbVar.b = new File(a.h(), "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
            akbVar.a = obj;
            bkb.g0 = bkb.Z0(bkb.I.j0);
            akbVar.F = y6c.t0;
            bkb.v1(akbVar, true, true, false);
            kk7.e().k(kk7.q4, new Object[0]);
            new ThemeEditorView().d(dVar.getParentActivity(), akbVar);
            hdVar.dismiss();
            SharedPreferences c1 = na7.c1();
            if (c1.getBoolean("themehint", false)) {
                return;
            }
            c1.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(dVar.getParentActivity(), k96.M0(2131751698, null), 1).show();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public static long c(u41 u41Var, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, hn7 hn7Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((hn7Var2.getValue() - 120) / 12) + i2;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (hn7Var2.getValue() - 120) % 12);
        hn7Var.setMinValue(1);
        hn7Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = hn7Var.getValue();
        int value3 = hn7Var3.getValue();
        int value4 = hn7Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (u41Var != null) {
            if (value2 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            u41Var.setText(k96.D0().w0(i + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hd c0(final int i, TLRPC.TL_error tL_error, d dVar, TLObject tLObject, Object... objArr) {
        String str;
        char c;
        String str2;
        final long j;
        long m;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long l = gta.l(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    m = cf3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    m = cf3.m(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    m = cf3.m(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    m = cf3.m(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    m = cf3.m(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                } else {
                    j = 0;
                    if (l > 0) {
                        gta.v(i, false).n(new Runnable() { // from class: cg
                            @Override // java.lang.Runnable
                            public final void run() {
                                wjb f53Var;
                                Activity u0 = gl.u0();
                                d S = LaunchActivity.S();
                                if (!PhotoViewer.r0().U0()) {
                                    if (S == null) {
                                        f53Var = null;
                                    } else if (!S.hasShownSheet()) {
                                        f53Var = S.getResourceProvider();
                                    }
                                    wjb wjbVar = f53Var;
                                    int i2 = i;
                                    long j2 = j;
                                    new zua(u0, wjbVar, l, 13, cf3.r(i2, j2), new jc((byte) 10), j2).show();
                                }
                                f53Var = new f53();
                                wjb wjbVar2 = f53Var;
                                int i22 = i;
                                long j22 = j;
                                new zua(u0, wjbVar2, l, 13, cf3.r(i22, j22), new jc((byte) 10), j22).show();
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
                    r0(dVar, k96.M0(2131749174, null), k96.M0(2131749175, null), null);
                    return null;
                }
                boolean z = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long m2 = cf3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (m2 >= 0) {
                        str2 = l7c.k(na7.q1(i).V1(Long.valueOf(m2)), true);
                    } else {
                        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-m2));
                        str2 = K0 != null ? K0.title : "";
                    }
                    r0(dVar == null ? LaunchActivity.Q() : dVar, k96.M0(2131748347, null), k96.a0(null, null, 2131748348, str2), null);
                    na7.q1(i).i2(0, m2);
                    return null;
                }
                boolean z2 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z2 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z2 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    d Q = dVar == null ? LaunchActivity.Q() : dVar;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        r0(Q, k96.M0(2131749061, null), k96.M0(2131749060, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        r0(Q, k96.M0(2131749061, null), k96.M0(2131749052, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            r0(Q, k96.M0(2131749061, null), k96.M0(2131749066, null), null);
                            return null;
                        }
                        r0(Q, k96.M0(2131749061, null), k96.M0(2131749067, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        r0(Q, k96.M0(2131749061, null), k96.M0(2131749063, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        r0(Q, k96.M0(2131749061, null), k96.M0(2131749065, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        r0(Q, k96.M0(2131749061, null), k96.M0(2131749062, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        r0(Q, k96.M0(2131749061, null), k96.M0(2131749064, null), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        r0(Q, k96.M0(2131749061, null), k96.M0(2131749059, null), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        j0(tL_error.text, Q);
                        return null;
                    }
                    r0(Q, k96.M0(2131749061, null), k96.M0(2131751093, null) + "\n" + tL_error.text, null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        d Q2 = dVar == null ? LaunchActivity.Q() : dVar;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            r0(Q2, null, k96.M0(2131748987, null), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            r0(Q2, null, k96.M0(2131750670, null), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            u0(Q2.getParentActivity(), k96.M0(2131743581, null), true);
                            return null;
                        }
                        r0(Q2, null, k96.M0(2131751093, null) + "\n" + tL_error.text, null);
                        return null;
                    }
                    boolean z3 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    int i2 = kk7.L0;
                    if (z3 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        String str3 = tL_error.text;
                        if (dVar != null) {
                            if (!str3.equals("CHANNELS_TOO_MUCH")) {
                                e0(tL_error, dVar, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                                return null;
                            }
                            if (dVar.getParentActivity() != null) {
                                dVar.showDialog(new h26(5, i, null, dVar.getParentActivity(), dVar));
                                return null;
                            }
                            if (z3 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                dVar.presentFragment(new zsb(0));
                                return null;
                            }
                            dVar.presentFragment(new zsb(1));
                            return null;
                        }
                        if (str3.equals("PEER_FLOOD")) {
                            kk7.f(i).k(i2, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            d Q3 = dVar == null ? LaunchActivity.Q() : dVar;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (Q3.getParentActivity() != null) {
                                    Q3.showDialog(new h26(5, i, null, Q3.getParentActivity(), Q3));
                                    return null;
                                }
                                Q3.presentFragment(new zsb(2));
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
                                    Q4.showDialog(new h26(5, i, null, Q4.getParentActivity(), Q4));
                                    return null;
                                }
                                Q4.presentFragment(new zsb(2));
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
                                    r0(dVar, null, k96.M0(2131751259, null), null);
                                    return null;
                                }
                                t0(k96.M0(2131751259, null), null);
                                return null;
                            }
                        } else {
                            if (z || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long m3 = z ? cf3.m(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? cf3.m(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? cf3.m(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? cf3.m(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? cf3.m(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? cf3.m(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? cf3.m(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str4 = tL_error.text;
                                if (str4 == null || !str4.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str5 = tL_error.text;
                                    str5.getClass();
                                    switch (str5) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            kk7.f(i).k(i2, 5);
                                            break;
                                        case "PEER_FLOOD":
                                            kk7.f(i).k(i2, 0);
                                            break;
                                        case "SCHEDULE_TOO_MUCH":
                                            t0(k96.M0(2131748337, null), dVar);
                                            break;
                                    }
                                    return null;
                                }
                                String str6 = tL_error.text;
                                TLRPC.Chat K02 = m3 < 0 ? na7.q1(i).K0(Long.valueOf(-m3)) : null;
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
                                throw new UnsupportedOperationException("Method not decompiled: ij.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.d, org.telegram.tgnet.TLObject, java.lang.Object[]):hd");
                            }

                            public static void d(hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i = 1;
                                int i2 = calendar.get(1);
                                int i3 = calendar.get(2);
                                int i4 = calendar.get(5);
                                hn7Var3.setMinValue(i2);
                                int value = hn7Var3.getValue();
                                hn7Var2.setMinValue(value == i2 ? i3 : 0);
                                int value2 = hn7Var2.getValue();
                                if (value == i2 && value2 == i3) {
                                    i = i4;
                                }
                                hn7Var.setMinValue(i);
                            }

                            public static void d0(Context context, wjb wjbVar, String str, TLRPC.WebPage webPage, final p8c p8cVar, o52 o52Var) {
                                Activity W = gl.W(context);
                                final View currentFocus = W != null ? W.getCurrentFocus() : null;
                                final hd[] hdVarArr = new hd[1];
                                byte b = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                                String M0 = k96.M0(2131746960, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131746961, null);
                                final mi miVar = new mi(context);
                                miVar.setTextSize(1, 16.0f);
                                int i = bkb.i5;
                                zkb.X(miVar, i, wjbVar);
                                zkb.D(miVar, bkb.Ni, wjbVar);
                                miVar.setHint(k96.M0(2131746959, null));
                                miVar.setInputType(17);
                                miVar.setImeOptions(6);
                                miVar.setMaxLines(10);
                                miVar.setSingleLine(false);
                                miVar.setPadding(gl.L(16.0f), gl.L(13.0f), gl.L(16.0f), gl.L(13.0f));
                                miVar.setCursorWidth(1.5f);
                                miVar.A(bkb.p6, wjbVar);
                                if (str != null) {
                                    miVar.setText(str);
                                    miVar.setSelection(str.length());
                                }
                                miVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ig
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                                        if (i2 != 6) {
                                            return false;
                                        }
                                        mi miVar2 = mi.this;
                                        String trim = miVar2.getText().toString().trim();
                                        if (!(TextUtils.isEmpty(trim) ? false : ij.a.matcher(trim.trim()).matches())) {
                                            gl.A3(miVar2);
                                            return true;
                                        }
                                        p8cVar.a(trim);
                                        hd hdVar2 = hdVarArr[0];
                                        if (hdVar2 != null) {
                                            hdVar2.dismiss();
                                        }
                                        View view = currentFocus;
                                        if (view != null) {
                                            view.requestFocus();
                                        }
                                        return true;
                                    }
                                });
                                ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i, wjbVar)));
                                vkb K = zkb.K(0.06f, i);
                                miVar.setBackground(b0);
                                zkb.j(miVar, b0, K, null, wjbVar);
                                LinearLayout j = de9.j(context, 1);
                                j.addView(miVar, nme.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                                int i2 = jtc.f;
                                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                    jtc jtcVar = new jtc(context, wjbVar);
                                    jtcVar.setWebPage(webPage);
                                    j.addView(jtcVar, nme.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                }
                                alertDialog$Builder.b();
                                alertDialog$Builder.n(j);
                                hdVar.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
                                byte b2 = 7;
                                alertDialog$Builder.j(k96.M0(2131751342, null), new o(miVar, p8cVar, b2));
                                alertDialog$Builder.g(k96.M0(2131752577, null), new ag(b2));
                                if (o52Var != null) {
                                    alertDialog$Builder.h(k96.M0(2131751586, null), new l0(o52Var, (byte) 14));
                                }
                                hdVarArr[0] = hdVar;
                                hdVar.k0 = false;
                                hdVar.setOnDismissListener(new n1(miVar, (byte) 4));
                                hdVarArr[0].setOnShowListener(new jg(miVar, b));
                                hdVarArr[0].show();
                                TextView textView = (TextView) hdVarArr[0].c(-3);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, null);
                                }
                            }

                            public static void e(TextView textView, hn7 hn7Var, ki kiVar, li liVar) {
                                int value = hn7Var.getValue();
                                int value2 = kiVar.getValue();
                                int value3 = liVar.getValue();
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
                                textView.setText(k96.a0(null, null, 2131746981, k96.a0(null, null, 2131746980, i > 0 ? k96.G(i, "Days", new Object[0]) : "", i2 > 0 ? k96.G(i2, "Hours", new Object[0]) : "", i3 > 0 ? k96.G(i3, "Minutes", new Object[0]) : "").trim()));
                            }

                            public static void e0(TLRPC.TL_error tL_error, d dVar, boolean z, boolean z2, TLObject tLObject) {
                                AlertDialog$Builder alertDialog$Builder;
                                hd hdVar;
                                byte b;
                                if (tL_error == null || tL_error.code == 406 || tL_error.text == null || dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                                String M0 = k96.M0(R.string.AppName, null);
                                hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                String str = tL_error.text;
                                str.getClass();
                                b = 3;
                                switch (str) {
                                    case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                                        hdVar.U = k96.M0(2131748566, null);
                                        break;
                                    case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                                        hdVar.U = k96.M0(2131746399, null);
                                        break;
                                    case "USERS_TOO_FEW":
                                        hdVar.U = k96.M0(2131751736, null);
                                        break;
                                    case "USER_BLOCKED":
                                    case "USER_BOT":
                                    case "USER_ID_INVALID":
                                        if (!z) {
                                            hdVar.U = k96.M0(2131749197, null);
                                            break;
                                        } else {
                                            hdVar.U = k96.M0(2131752259, null);
                                            break;
                                        }
                                    case "USER_RESTRICTED":
                                        hdVar.U = k96.M0(2131743489, null);
                                        break;
                                    case "PEER_FLOOD":
                                        hdVar.U = k96.M0(2131747934, null);
                                        alertDialog$Builder.g(k96.M0(2131748139, null), new h6(dVar, b));
                                        break;
                                    case "BOTS_TOO_MUCH":
                                        if (!z) {
                                            hdVar.U = k96.M0(2131749195, null);
                                            break;
                                        } else {
                                            hdVar.U = k96.M0(2131752257, null);
                                            break;
                                        }
                                    case "USER_KICKED":
                                    case "CHAT_ADMIN_BAN_REQUIRED":
                                        if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                            hdVar.U = k96.M0(2131754474, null);
                                            break;
                                        } else {
                                            hdVar.U = k96.M0(2131754361, null);
                                            break;
                                        }
                                    case "YOU_BLOCKED_USER":
                                        hdVar.U = k96.M0(2131742579, null);
                                        break;
                                    case "USER_ADMIN_INVALID":
                                        hdVar.U = k96.M0(2131754462, null);
                                        break;
                                    case "USERS_TOO_MUCH":
                                        if (!z) {
                                            hdVar.U = k96.M0(2131749198, null);
                                            break;
                                        } else {
                                            hdVar.U = k96.M0(2131752260, null);
                                            break;
                                        }
                                    case "ADMINS_TOO_MUCH":
                                        if (!z) {
                                            hdVar.U = k96.M0(2131749196, null);
                                            break;
                                        } else {
                                            hdVar.U = k96.M0(2131752258, null);
                                            break;
                                        }
                                    case "CHANNELS_TOO_MUCH":
                                        hdVar.S = k96.M0(2131752270, null);
                                        if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                                            hdVar.U = k96.M0(2131752271, null);
                                            break;
                                        } else {
                                            hdVar.U = k96.M0(2131752272, null);
                                            break;
                                        }
                                    case "USER_CHANNELS_TOO_MUCH":
                                        hdVar.S = k96.M0(2131752270, null);
                                        hdVar.U = k96.M0(2131743518, null);
                                        break;
                                    case "USER_NOT_MUTUAL_CONTACT":
                                        if (!z) {
                                            hdVar.U = k96.M0(2131749194, null);
                                            break;
                                        } else {
                                            hdVar.U = k96.M0(2131752256, null);
                                            break;
                                        }
                                    case "CHAT_ADMIN_INVITE_REQUIRED":
                                        hdVar.U = k96.M0(2131754473, null);
                                        break;
                                    case "USER_PRIVACY_RESTRICTED":
                                        if (!z2) {
                                            if (!z) {
                                                hdVar.U = k96.M0(2131748917, null);
                                                break;
                                            } else {
                                                hdVar.U = k96.M0(2131748920, null);
                                                break;
                                            }
                                        } else {
                                            hdVar.U = k96.M0(2131748919, null);
                                            break;
                                        }
                                    case "USER_ALREADY_PARTICIPANT":
                                        hdVar.S = k96.M0(2131743064, null);
                                        hdVar.U = k96.M0(2131743134, null);
                                        break;
                                    default:
                                        hdVar.U = k96.M0(2131751093, null) + "\n" + tL_error.text;
                                        break;
                                }
                                b00.t(null, 2131747638, alertDialog$Builder, null);
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
                                        user = na7.q1(i).V1(Long.valueOf(tL_missingInvitee2.user_id));
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
                                gl.e3(new i57(i, (Object) chat, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, (byte) 1), 200L);
                            }

                            public static hd f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, p8c p8cVar, wjb wjbVar, boolean z) {
                                if (activity == null) {
                                    p8cVar.a(Boolean.FALSE);
                                    return null;
                                }
                                byte b = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
                                byte b2 = 1;
                                ag2[] ag2VarArr = new ag2[1];
                                boolean[] zArr = {false};
                                wb wbVar = new wb(activity, (byte) 10);
                                kk7.i(wbVar);
                                zkb.X(wbVar, bkb.i5, wjbVar);
                                wbVar.setTextSize(1, 16.0f);
                                byte b3 = 3;
                                wbVar.setGravity((k96.a0 ? 5 : 3) | 48);
                                wbVar.setText(charSequence);
                                rh rhVar = new rh(activity, ag2VarArr, b2);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.H = (byte) 6;
                                alertDialog$Builder.n(rhVar);
                                TextView textView = new TextView(activity);
                                tb4.w(textView, bkb.D8, wjbVar, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((k96.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(str);
                                rhVar.addView(textView, nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
                                rhVar.addView(wbVar, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    ag2 ag2Var = new ag2(1, wjbVar, activity);
                                    ag2VarArr[0] = ag2Var;
                                    int i = bkb.h6;
                                    ff0 f0 = bkb.f0(bkb.v0(i, wjbVar), 7, gl.L(12.0f));
                                    vkb M = zkb.M(i);
                                    ag2Var.setBackground(f0);
                                    zkb.j(ag2Var, f0, null, M, wjbVar);
                                    ag2VarArr[0].setMultiline(true);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ag2VarArr[0].getCheckBoxView().getLayoutParams();
                                    layoutParams.topMargin = 0;
                                    layoutParams.gravity = (k96.a0 ? 5 : 3) | 16;
                                    ag2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
                                    ag2VarArr[0].e(charSequence2, "", false, false, false);
                                    ag2VarArr[0].setPadding(k96.a0 ? gl.L(4.0f) : 0, gl.L(12.0f), k96.a0 ? 0 : gl.L(4.0f), gl.L(12.0f));
                                    rhVar.addView(ag2VarArr[0], nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
                                    ag2VarArr[0].setOnClickListener(new ge(zArr, b3));
                                }
                                alertDialog$Builder.j(str2, new ah(b, p8cVar, zArr));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                if (z) {
                                    hdVar.Y0 = true;
                                }
                                hdVar.show();
                                return hdVar;
                            }

                            public static boolean g(TextView textView, TextView textView2, long j, long j2, int i, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
                                long j3;
                                int i2;
                                long j4;
                                int i3;
                                int i4;
                                int i5;
                                boolean z;
                                boolean z2;
                                String G;
                                int value = hn7Var.getValue();
                                int value2 = hn7Var2.getValue();
                                int value3 = hn7Var3.getValue();
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
                                hn7Var.setMinValue(0);
                                if (j6 > 0) {
                                    hn7Var.setMaxValue(i3);
                                }
                                int value4 = hn7Var.getValue();
                                hn7Var2.setMinValue(value4 == 0 ? i8 : 0);
                                if (j6 > 0) {
                                    hn7Var2.setMaxValue(value4 == i3 ? i4 : 23);
                                }
                                int value5 = hn7Var2.getValue();
                                hn7Var3.setMinValue((value4 == 0 && value5 == i8) ? i9 : 0);
                                if (j6 > 0) {
                                    hn7Var3.setMaxValue((value4 == i3 && value5 == i4) ? i7 : 59);
                                }
                                int value6 = hn7Var3.getValue();
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
                                    textView.setText(k96.D0().w0((i * 3) + (value4 == 0 ? 0 : i2 == i10 ? 1 : 2)).format(timeInMillis2));
                                }
                                if (textView2 != null) {
                                    int i11 = (int) ((timeInMillis2 - j3) / 1000);
                                    if (i11 > 86400) {
                                        z2 = false;
                                        G = k96.G(Math.round(i11 / 86400.0f), "DaysSchedule", new Object[0]);
                                    } else {
                                        z2 = false;
                                        z2 = false;
                                        z2 = false;
                                        G = i11 >= 3600 ? k96.G(Math.round(i11 / 3600.0f), "HoursSchedule", new Object[0]) : i11 >= 60 ? k96.G(Math.round(i11 / 60.0f), "MinutesSchedule", new Object[0]) : k96.G(i11, "SecondsSchedule", new Object[0]);
                                    }
                                    if (textView2.getTag() != null) {
                                        z = true;
                                        Object[] objArr = new Object[1];
                                        objArr[z2 ? 1 : 0] = G;
                                        textView2.setText(k96.a0("VoipChannelScheduleInfo", null, 2131743221, objArr));
                                    } else {
                                        z = true;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[z2 ? 1 : 0] = G;
                                        textView2.setText(k96.a0("VoipGroupScheduleInfo", null, 2131743100, objArr2));
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
                            /* JADX WARN: Type inference failed for: r14v6, types: [ed, java.lang.String, wjb] */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r17v0, types: [ag2] */
                            /* JADX WARN: Type inference failed for: r23v0, types: [ag2] */
                            /* JADX WARN: Type inference failed for: r29v0, types: [org.telegram.ui.ActionBar.d] */
                            /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
                            /* JADX WARN: Type inference failed for: r9v0 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v5, types: [ag2[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void g0(d dVar, long j, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z, TLRPC.ChatFull chatFull, final uc7 uc7Var, wjb wjbVar) {
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
                                ?? alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, dVar.getParentActivity());
                                SharedPreferences sharedPreferences = na7.q1(dVar.getCurrentAccount()).W3;
                                int i = 1;
                                if (encryptedChat == null) {
                                    j2 = j;
                                    if (!ls6.v("dialog_bar_report", j2, sharedPreferences, false)) {
                                        z2 = false;
                                        hd hdVar = alertDialog$Builder.a;
                                        if (user == null) {
                                            hdVar.S = k96.a0("BlockUserTitle", null, 2131753682, l7c.k(user, true));
                                            hdVar.U = gl.T2(k96.a0("BlockUserAlert", null, 2131753688, l7c.k(user, true)));
                                            String M02 = k96.M0(2131753690, null);
                                            int i2 = 2;
                                            r9 = new ag2[2];
                                            int i3 = 0;
                                            ?? linearLayout = new LinearLayout(dVar.getParentActivity());
                                            linearLayout.setOrientation(1);
                                            int i4 = 0;
                                            while (i4 < i2) {
                                                if (i4 != 0 || z2) {
                                                    ag2 ag2Var = new ag2(i, wjbVar, dVar.getParentActivity());
                                                    r9[i4] = ag2Var;
                                                    ag2Var.setBackgroundDrawable(bkb.L0(i3));
                                                    r9[i4].setTag(Integer.valueOf(i4));
                                                    if (i4 == 0) {
                                                        r9[i4].e(k96.M0(2131751490, null), "", true, false, false);
                                                        str2 = M02;
                                                    } else {
                                                        str2 = M02;
                                                        r9[i4].e(k96.a0("DeleteThisChat", null, 2131751470, new Object[i3]), "", true, false, false);
                                                    }
                                                    r9[i4].setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                                                    linearLayout.addView(r9[i4], nme.o(-1, -2));
                                                    r9[i4].setOnClickListener(new yd(r9, (byte) 1));
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
                                                hdVar.S = k96.M0(2131746007, null);
                                                if (!hc2.T(chat) || chat.megagroup) {
                                                    hdVar.U = k96.M0(2131746011, null);
                                                } else {
                                                    hdVar.U = k96.M0(2131746012, null);
                                                }
                                            } else {
                                                hdVar.S = k96.M0(2131745996, null);
                                                if (chatFull != null) {
                                                    TLRPC.ChannelLocation channelLocation = chatFull.location;
                                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                        str = null;
                                                        hdVar.U = gl.T2(k96.a0("ReportUnrelatedGroupText", null, 2131745995, ((TLRPC.TL_channelLocation) channelLocation).address));
                                                    }
                                                }
                                                str = null;
                                                hdVar.U = k96.M0(2131745994, null);
                                            }
                                            M0 = k96.M0(2131746037, str);
                                            r9 = str;
                                            r14 = str;
                                        }
                                        final ag2[] ag2VarArr = r9;
                                        final long j3 = j2;
                                        alertDialog$Builder.j(M0, new ed() { // from class: xe
                                            @Override // ed
                                            public final void u(hd hdVar2, int i5) {
                                                ag2 ag2Var2;
                                                TLRPC.User user2 = TLRPC.User.this;
                                                j5 j5Var = accountInstance;
                                                if (user2 != null) {
                                                    na7.q1(j5Var.a).t(user2.id);
                                                }
                                                ag2[] ag2VarArr2 = ag2VarArr;
                                                long j4 = j3;
                                                TLRPC.Chat chat2 = chat;
                                                if (ag2VarArr2 == null || ((ag2Var2 = ag2VarArr2[0]) != null && ag2Var2.b())) {
                                                    na7.q1(j5Var.a).q4(j4, user2, chat2, encryptedChat, chat2 != null && z);
                                                }
                                                uc7 uc7Var2 = uc7Var;
                                                if (ag2VarArr2 != null && !ag2VarArr2[1].b()) {
                                                    uc7Var2.a(0);
                                                    return;
                                                }
                                                if (chat2 == null) {
                                                    na7.q1(j5Var.a).T(0, j4, false);
                                                } else if (hc2.r0(chat2)) {
                                                    na7.q1(j5Var.a).T(0, j4, false);
                                                } else {
                                                    int i6 = j5Var.a;
                                                    na7.q1(i6).b0(-j4, na7.q1(i6).V1(Long.valueOf(y6c.h(i6).e())));
                                                }
                                                uc7Var2.a(1);
                                            }
                                        });
                                        alertDialog$Builder.g(k96.M0(2131752577, r14), r14);
                                        dVar.showDialog(hdVar);
                                        textView = (TextView) hdVar.c(-1);
                                        if (textView == null) {
                                            zkb.X(textView, bkb.p7, r14);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    j2 = j;
                                }
                                z2 = true;
                                hd hdVar2 = alertDialog$Builder.a;
                                if (user == null) {
                                }
                                final ag2[] ag2VarArr2 = r9;
                                final long j32 = j2;
                                alertDialog$Builder.j(M0, new ed() { // from class: xe
                                    @Override // ed
                                    public final void u(hd hdVar22, int i5) {
                                        ag2 ag2Var2;
                                        TLRPC.User user2 = TLRPC.User.this;
                                        j5 j5Var = accountInstance;
                                        if (user2 != null) {
                                            na7.q1(j5Var.a).t(user2.id);
                                        }
                                        ag2[] ag2VarArr22 = ag2VarArr2;
                                        long j4 = j32;
                                        TLRPC.Chat chat2 = chat;
                                        if (ag2VarArr22 == null || ((ag2Var2 = ag2VarArr22[0]) != null && ag2Var2.b())) {
                                            na7.q1(j5Var.a).q4(j4, user2, chat2, encryptedChat, chat2 != null && z);
                                        }
                                        uc7 uc7Var2 = uc7Var;
                                        if (ag2VarArr22 != null && !ag2VarArr22[1].b()) {
                                            uc7Var2.a(0);
                                            return;
                                        }
                                        if (chat2 == null) {
                                            na7.q1(j5Var.a).T(0, j4, false);
                                        } else if (hc2.r0(chat2)) {
                                            na7.q1(j5Var.a).T(0, j4, false);
                                        } else {
                                            int i6 = j5Var.a;
                                            na7.q1(i6).b0(-j4, na7.q1(i6).V1(Long.valueOf(y6c.h(i6).e())));
                                        }
                                        uc7Var2.a(1);
                                    }
                                });
                                alertDialog$Builder.g(k96.M0(2131752577, r14), r14);
                                dVar.showDialog(hdVar2);
                                textView = (TextView) hdVar2.c(-1);
                                if (textView == null) {
                                }
                            }

                            public static boolean h(Context context, int i, long j, boolean z) {
                                TLRPC.Chat K0;
                                if (!cf3.y(j) || (K0 = na7.q1(i).K0(Long.valueOf(-j))) == null || !K0.slowmode_enabled || hc2.N(K0)) {
                                    return false;
                                }
                                if (!z) {
                                    TLRPC.ChatFull L0 = na7.q1(i).L0(K0.id);
                                    if (L0 == null) {
                                        L0 = ad7.Y(i).C0(K0.id, hc2.T(K0), new CountDownLatch(1), false, false, 0);
                                    }
                                    if (L0 != null && L0.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    return false;
                                }
                                K(context, K0.title, k96.M0(2131745110, null)).o();
                                return true;
                            }

                            public static void h0(mu1 mu1Var, k27 k27Var, long j, wjb wjbVar, vm1 vm1Var) {
                                if (mu1Var.getParentActivity() == null || k27Var == null) {
                                    return;
                                }
                                j5 accountInstance = mu1Var.getAccountInstance();
                                TLRPC.User V1 = j > 0 ? na7.q1(accountInstance.a).V1(Long.valueOf(j)) : null;
                                TLRPC.Chat K0 = j < 0 ? na7.q1(accountInstance.a).K0(Long.valueOf(-j)) : null;
                                if (V1 == null && K0 == null) {
                                    return;
                                }
                                byte b = 0;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, mu1Var.getParentActivity());
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.Q0 = false;
                                hdVar.O = new n1(vm1Var, (byte) 2);
                                hdVar.S = k96.M0(2131753689, null);
                                if (V1 != null) {
                                    hdVar.U = gl.T2(k96.a0("BlockUserReplyAlert", null, 2131753683, l7c.k(V1, true)));
                                } else {
                                    hdVar.U = gl.T2(k96.a0("BlockUserReplyAlert", null, 2131753683, K0.title));
                                }
                                LinearLayout linearLayout = new LinearLayout(mu1Var.getParentActivity());
                                linearLayout.setOrientation(1);
                                ag2[] ag2VarArr = {new ag2(1, wjbVar, mu1Var.getParentActivity())};
                                ag2VarArr[0].setBackgroundDrawable(bkb.L0(false));
                                ag2VarArr[0].setTag(0);
                                ag2VarArr[0].e(k96.M0(2131751490, null), "", true, false, false);
                                ag2VarArr[0].setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                                linearLayout.addView(ag2VarArr[0], nme.o(-1, -2));
                                ag2VarArr[0].setOnClickListener(new yd(ag2VarArr, b));
                                alertDialog$Builder.n(linearLayout);
                                alertDialog$Builder.j(k96.M0(2131753692, null), new zd(V1, accountInstance, mu1Var, K0, k27Var, ag2VarArr, wjbVar));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                mu1Var.showDialog(hdVar);
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, null);
                                }
                            }

                            public static hd i(Activity activity, ej ejVar) {
                                if (y6c.c() < 2) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                hd hdVar = alertDialog$Builder.a;
                                tc tcVar = hdVar.M0;
                                hd[] hdVarArr = new hd[1];
                                LinearLayout m = ir2.m(activity, 1);
                                for (int i = 0; i < 4; i++) {
                                    if (y6c.h(i).f() != null) {
                                        k5 k5Var = new k5(activity, false);
                                        k5Var.f = i;
                                        TLRPC.User f = y6c.h(i).f();
                                        pb0 pb0Var = k5Var.e;
                                        pb0Var.q(f);
                                        k5Var.a.l(qu2.m(0, f.first_name, f.last_name), false);
                                        be0 be0Var = k5Var.c;
                                        be0Var.getImageReceiver().d = i;
                                        be0Var.f(f, pb0Var);
                                        k5Var.d.setVisibility(4);
                                        k5Var.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                                        k5Var.setBackgroundDrawable(bkb.L0(false));
                                        m.addView(k5Var, nme.o(-1, 50));
                                        k5Var.setOnClickListener(new b0(hdVarArr, tcVar, ejVar, (byte) 3));
                                    }
                                }
                                hdVar.S = k96.M0(2131745479, null);
                                alertDialog$Builder.n(m);
                                alertDialog$Builder.j(k96.M0(2131752577, null), null);
                                hdVarArr[0] = hdVar;
                                return hdVar;
                            }

                            public static void i0(Context context, int i, long j) {
                                fx0 h = de9.h(1, null, context, false);
                                LinearLayout j2 = de9.j(context, 1);
                                j2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(8.0f));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                j2.addView(frameLayout, nme.t(-1, 92, 17, 0, 0, 0, 0));
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                imageView.setImageResource(R.drawable.story_link);
                                imageView.setScaleX(2.0f);
                                imageView.setScaleY(2.0f);
                                frameLayout2.addView(imageView, nme.e(-1, -1, 17));
                                int L = gl.L(80.0f);
                                int i2 = bkb.Ei;
                                ShapeDrawable K = bkb.K(L, bkb.w0(null, i2, false));
                                vkb M = zkb.M(i2);
                                frameLayout2.setBackground(K);
                                zkb.j(frameLayout2, K, M, null, null);
                                frameLayout.addView(frameLayout2, nme.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
                                TextView textView = new TextView(context);
                                int i3 = bkb.F6;
                                tb4.w(textView, i3, null, 1, 20.0f);
                                textView.setText(k96.M0(2131752612, null));
                                textView.setGravity(17);
                                TextView m = ug8.m(j2, textView, nme.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
                                zkb.X(m, i3, null);
                                m.setTextSize(1, 14.0f);
                                de9.r(null, null, 2131752613, new Object[]{cf3.k(i, j)}, m);
                                m.setGravity(17);
                                j2.addView(m, nme.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
                                u41 u41Var = new u41(null, context, true);
                                u41Var.i(k96.M0(2131752614, null), false, true);
                                j2.addView(u41Var, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
                                h.O = j2;
                                u41Var.setOnClickListener(new ih(i, u41Var, h, j));
                                h.K();
                                h.show();
                            }

                            public static hd j(Context context, wjb wjbVar) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                                String M0 = k96.M0(2131754240, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.U = M0;
                                int i = bkb.K5;
                                alertDialog$Builder.l(R.raw.permission_request_apk, 72, bkb.w0(null, i, false), null);
                                alertDialog$Builder.m(i, null);
                                alertDialog$Builder.j(k96.M0(2131747107, null), new od(context, (byte) 0));
                                alertDialog$Builder.g(k96.M0(2131751760, null), null);
                                return hdVar;
                            }

                            public static void j0(String str, d dVar) {
                                if (str == null || !str.startsWith("FLOOD_WAIT") || dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                int intValue = Utilities.z(str).intValue();
                                String G = intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0]);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                                String M0 = k96.M0(R.string.AppName, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.a0("FloodWaitTime", null, 2131750669, G);
                                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                dVar.showDialog(hdVar, true, null);
                            }

                            public static void k(Context context, wjb wjbVar, gj gjVar) {
                                int w0;
                                int w02;
                                int w03;
                                int w04;
                                int w05;
                                if (context == null) {
                                    return;
                                }
                                int i = bkb.i5;
                                if (wjbVar != null) {
                                    w0 = wjbVar.f(i);
                                    w02 = wjbVar.f(bkb.g5);
                                    wjbVar.f(bkb.zj);
                                    wjbVar.f(bkb.Dj);
                                    wjbVar.f(bkb.D8);
                                    wjbVar.f(bkb.F8);
                                    wjbVar.f(bkb.h6);
                                    w03 = wjbVar.f(bkb.Ii);
                                    w04 = wjbVar.f(bkb.Ei);
                                    w05 = wjbVar.f(bkb.Gi);
                                } else {
                                    w0 = bkb.w0(null, i, false);
                                    w02 = bkb.w0(null, bkb.g5, false);
                                    bkb.w0(null, bkb.zj, false);
                                    bkb.w0(null, bkb.Dj, false);
                                    bkb.w0(null, bkb.D8, false);
                                    bkb.w0(null, bkb.F8, false);
                                    bkb.w0(null, bkb.h6, false);
                                    w03 = bkb.w0(null, bkb.Ii, false);
                                    w04 = bkb.w0(null, bkb.Ei, false);
                                    w05 = bkb.w0(null, bkb.Gi, false);
                                }
                                int i2 = w04;
                                int i3 = w05;
                                int i4 = w02;
                                int i5 = w03;
                                i4d i4dVar = new i4d(context, wjbVar);
                                Object obj = i4dVar.a;
                                ((fx0) obj).w0 = false;
                                int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
                                pi piVar = new pi(context, wjbVar, iArr);
                                piVar.setMinValue(0);
                                piVar.setMaxValue(16);
                                piVar.setTextColor(w0);
                                piVar.setValue(0);
                                piVar.setFormatter(new de(iArr, (byte) 1));
                                qi qiVar = new qi(context, piVar, (byte) 0);
                                boolean z = true;
                                qiVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                qiVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(k96.M0(2131753874, null));
                                textView.setTextColor(w0);
                                ir2.t(textView, 1, 20.0f);
                                frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new p8((byte) 10));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                qiVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                ri riVar = new ri(context, z, z, false, (byte) 0);
                                linearLayout.addView(piVar, nme.l(1.0f, 0, kk7.s4));
                                riVar.setPadding(0, 0, 0, 0);
                                riVar.setGravity(17);
                                riVar.setTextColor(i5);
                                riVar.setTextSize(gl.L(14.0f));
                                riVar.setTypeface(gl.o());
                                int L = gl.L(8.0f);
                                riVar.setBackgroundDrawable(bkb.i0(L, L, L, L, i2, i3, i3));
                                qiVar.addView(riVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
                                riVar.setText(k96.M0(2131751422, null));
                                piVar.setOnValueChangedListener(new l0(riVar, (byte) 17));
                                riVar.setOnClickListener(new ee((Object) iArr, (Object) piVar, (Object) gjVar, (Object) i4dVar, (byte) 2));
                                fx0 fx0Var = (fx0) obj;
                                fx0Var.O = qiVar;
                                fx0Var.show();
                                fx0Var.s0(i4);
                                fx0Var.L(i4);
                            }

                            public static void k0(Context context, wjb wjbVar, int i, TL_stars.StarGift starGift, long j, Runnable runnable) {
                                TLObject Z1 = na7.q1(i).Z1(j);
                                LinearLayout j2 = de9.j(context, 1);
                                j2.addView(new vpa(context, starGift, Z1), nme.t(-1, -2, 48, 0, -4, 0, 0));
                                TextView textView = new TextView(context);
                                zkb.X(textView, bkb.i5, wjbVar);
                                textView.setTextSize(1, 16.0f);
                                de9.r(null, null, 2131749419, new Object[]{cf3.G(null, null, Z1)}, textView);
                                j2.addView(textView, nme.t(-1, -2, 48, 24, 0, 24, 4));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                                alertDialog$Builder.n(j2);
                                alertDialog$Builder.j(k96.M0(2131749420, null), new ce(runnable, (byte) 2));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.o();
                            }

                            public static i4d l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, p8c p8cVar, Runnable runnable, boolean z, boolean z2, wjb wjbVar) {
                                if (context == null) {
                                    return null;
                                }
                                i4d i4dVar = new i4d(context, wjbVar);
                                Object obj = i4dVar.a;
                                byte b = 0;
                                ((fx0) obj).w0 = false;
                                hn7 hn7Var = new hn7(context, wjbVar);
                                hn7Var.setTextOffset(gl.L(10.0f));
                                hn7Var.setItemCount(5);
                                hn7 hn7Var2 = new hn7(context, wjbVar);
                                hn7Var2.setItemCount(5);
                                hn7Var2.setTextOffset(-gl.L(10.0f));
                                hn7 hn7Var3 = new hn7(context, wjbVar);
                                hn7Var3.setItemCount(5);
                                hn7Var3.setTextOffset(-gl.L(24.0f));
                                hi hiVar = new hi(context, hn7Var, hn7Var2, hn7Var3);
                                hiVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                hiVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
                                frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new p8((byte) 9));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setGravity(17);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                hiVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                int i = calendar.get(1) - 149;
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i2 = calendar.get(5);
                                int i3 = calendar.get(2);
                                int i4 = calendar.get(1);
                                int i5 = i4 + 1;
                                ug ugVar = new ug(hn7Var3, i5, hn7Var, hn7Var2, i4, i3, i2);
                                System.currentTimeMillis();
                                ii iiVar = new ii(context);
                                linearLayout.addView(hn7Var, nme.l(0.25f, 0, kk7.s4));
                                hn7Var.setMinValue(1);
                                hn7Var.setMaxValue(31);
                                hn7Var.setWrapSelectorWheel(false);
                                hn7Var.setFormatter(new ag((byte) 11));
                                l0 l0Var = new l0(ugVar, (byte) 16);
                                hn7Var.setOnScrollListener(l0Var);
                                hn7Var2.setMinValue(0);
                                hn7Var2.setMaxValue(11);
                                hn7Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(hn7Var2, nme.l(0.5f, 0, kk7.s4));
                                hn7Var2.setFormatter(new ag((byte) 12));
                                hn7Var2.setOnScrollListener(l0Var);
                                hn7Var3.setMinValue(i);
                                hn7Var3.setMaxValue(i5);
                                hn7Var3.setWrapSelectorWheel(false);
                                hn7Var3.setFormatter(new qf(i5, (byte) 1));
                                linearLayout.addView(hn7Var3, nme.l(0.25f, 0, kk7.s4));
                                hn7Var3.setOnScrollListener(l0Var);
                                if (tL_birthday != null) {
                                    hn7Var.setValue(tL_birthday.day);
                                    hn7Var2.setValue(tL_birthday.month - 1);
                                    if ((tL_birthday.flags & 1) != 0) {
                                        hn7Var3.setValue(tL_birthday.year);
                                    } else {
                                        hn7Var3.setValue(i5);
                                    }
                                } else {
                                    hn7Var.setValue(calendar.get(5));
                                    hn7Var2.setValue(calendar.get(2));
                                    hn7Var3.setValue(i5);
                                }
                                ugVar.run();
                                if (runnable != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    l46 l46Var = new l46(context, null);
                                    l46Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                                    l46Var.setTextSize(1, 13.0f);
                                    zkb.X(l46Var, bkb.p5, wjbVar);
                                    zkb.G(l46Var, bkb.Wc, wjbVar);
                                    l46Var.setGravity(17);
                                    frameLayout2.addView(l46Var, nme.e(-2, -2, 17));
                                    hiVar.addView(frameLayout2, nme.o(-1, -2));
                                    int i6 = y6c.t0;
                                    eg egVar = new eg(i6, (Object) l46Var, (byte) 1);
                                    egVar.run();
                                    kk7.f(i6).h(frameLayout2, kk7.j0, new be2(egVar, (byte) 3));
                                    qu2.r(i6).D(false);
                                }
                                if (z) {
                                    u41 u41Var = new u41(wjbVar, context, false);
                                    u41Var.i(k96.M0(2131751658, null), false, true);
                                    u41Var.setOnClickListener(new wg(hn7Var3, i5, ugVar, b));
                                    hiVar.addView(u41Var, nme.t(-1, 48, 83, 16, 15, 16, 4));
                                }
                                iiVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                iiVar.setGravity(17);
                                zkb.X(iiVar, bkb.Ii, wjbVar);
                                iiVar.setTextSize(1, 14.0f);
                                iiVar.setTypeface(gl.o());
                                iiVar.setText(str2);
                                int L = gl.L(24.0f);
                                int i7 = bkb.Ei;
                                int v0 = bkb.v0(i7, wjbVar);
                                int i8 = bkb.Gi;
                                int v02 = bkb.v0(i8, wjbVar);
                                ff0 i0 = bkb.i0(L, L, L, L, v0, v02, v02);
                                vkb M = zkb.M(i7);
                                vkb M2 = zkb.M(i8);
                                iiVar.setBackground(i0);
                                zkb.j(iiVar, i0, M, M2, wjbVar);
                                ote.b(iiVar, 0.02f, 1.2f);
                                byte b2 = 15;
                                hiVar.addView(iiVar, nme.t(-1, 48, 83, 16, z ? 0 : 15, 16, z2 ? 0 : 16));
                                iiVar.setOnClickListener(new xg(hn7Var, hn7Var2, hn7Var3, i5, i4dVar, p8cVar));
                                if (z2) {
                                    u41 u41Var2 = new u41(wjbVar, context, false);
                                    u41Var2.i(k96.M0(2131753712, null), false, true);
                                    u41Var2.f();
                                    u41Var2.setOnClickListener(new t(i4dVar, p8cVar, b2));
                                    hiVar.addView(u41Var2, nme.t(-1, 48, 83, 16, 4, 16, 16));
                                }
                                ((fx0) obj).O = hiVar;
                                return i4dVar;
                            }

                            public static void l0(Context context, wjb wjbVar, String str, boolean z, final i8c i8cVar) {
                                if (gl.C1(context)) {
                                    final byte b = 1;
                                    final hd[] hdVarArr = new hd[1];
                                    final byte b2 = 0;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                                    String M0 = k96.M0(2131747586, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(str);
                                    textView.setTextSize(1, 14.0f);
                                    int i = bkb.i5;
                                    zkb.X(textView, i, wjbVar);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(gl.L(14.0f), gl.L(12.0f), gl.L(14.0f), gl.L(12.0f));
                                    ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i, wjbVar)));
                                    vkb K = zkb.K(0.06f, i);
                                    textView.setBackground(b0);
                                    zkb.j(textView, b0, K, null, wjbVar);
                                    final ag2 ag2Var = new ag2(1, wjbVar, context);
                                    ag2Var.setMultiline(true);
                                    ag2Var.getTextView().getLayoutParams().width = -1;
                                    ag2Var.getTextView().setSingleLine(false);
                                    ag2Var.getTextView().setMaxLines(3);
                                    ag2Var.getTextView().setTextSize(1, 16.0f);
                                    ag2Var.e(k96.M0(z ? 2131752865 : 2131752864, null), "", false, false, false);
                                    ag2Var.setOnClickListener(new ke(ag2Var, b2));
                                    LinearLayout linearLayout = new LinearLayout(context);
                                    linearLayout.setOrientation(1);
                                    linearLayout.addView(textView, nme.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    linearLayout.addView(ag2Var, nme.t(-1, -2, 3, 8, 6, 8, 4));
                                    alertDialog$Builder.n(linearLayout);
                                    hdVar.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
                                    alertDialog$Builder.j(k96.M0(2131747624, null), new ed() { // from class: le
                                        @Override // ed
                                        public final void u(hd hdVar2, int i2) {
                                            byte b3 = b2;
                                            hd[] hdVarArr2 = hdVarArr;
                                            ag2 ag2Var2 = ag2Var;
                                            i8c i8cVar2 = i8cVar;
                                            switch (b3) {
                                                case 0:
                                                    i8cVar2.a(Boolean.TRUE, Boolean.valueOf(ag2Var2.b()));
                                                    hd hdVar3 = hdVarArr2[0];
                                                    if (hdVar3 != null) {
                                                        hdVar3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i8cVar2.a(Boolean.FALSE, Boolean.valueOf(ag2Var2.b()));
                                                    hd hdVar4 = hdVarArr2[0];
                                                    if (hdVar4 != null) {
                                                        hdVar4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(k96.M0(2131752577, null), new ed() { // from class: le
                                        @Override // ed
                                        public final void u(hd hdVar2, int i2) {
                                            byte b3 = b;
                                            hd[] hdVarArr2 = hdVarArr;
                                            ag2 ag2Var2 = ag2Var;
                                            i8c i8cVar2 = i8cVar;
                                            switch (b3) {
                                                case 0:
                                                    i8cVar2.a(Boolean.TRUE, Boolean.valueOf(ag2Var2.b()));
                                                    hd hdVar3 = hdVarArr2[0];
                                                    if (hdVar3 != null) {
                                                        hdVar3.dismiss();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i8cVar2.a(Boolean.FALSE, Boolean.valueOf(ag2Var2.b()));
                                                    hd hdVar4 = hdVarArr2[0];
                                                    if (hdVar4 != null) {
                                                        hdVar4.dismiss();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    hdVarArr[0] = alertDialog$Builder.o();
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
                            /* JADX WARN: Type inference failed for: r8v8, types: [ed, java.lang.String, wjb] */
                            /* JADX WARN: Type inference failed for: r8v9 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void m(d dVar, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
                                ag2[] ag2VarArr;
                                ag2 ag2Var;
                                ?? r8;
                                if (dVar == null) {
                                    return;
                                }
                                Context context = dVar.getContext();
                                ag2[] ag2VarArr2 = new ag2[1];
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                cj cjVar = new cj(context, null);
                                kk7.i(cjVar);
                                zkb.X(cjVar, bkb.i5, null);
                                zkb.G(cjVar, bkb.Wc, null);
                                cjVar.setTextSize(1, 16.0f);
                                cjVar.setGravity((k96.a0 ? 5 : 3) | 48);
                                dj djVar = new dj(context, ag2VarArr2);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.H = (byte) 6;
                                alertDialog$Builder.n(djVar);
                                pb0 pb0Var = new pb0((wjb) null);
                                pb0Var.s(gl.L(18.0f));
                                be0 be0Var = new be0(context);
                                be0Var.setRoundRadius(gl.L(20.0f));
                                djVar.addView(be0Var, nme.d(40, 40.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                jia jiaVar = new jia(context);
                                zkb.W(jiaVar, bkb.D8, null);
                                jiaVar.setTextSize(20);
                                jiaVar.setTypeface(gl.o());
                                jiaVar.setGravity((k96.a0 ? 5 : 3) | 16);
                                jiaVar.setEllipsizeByGradient(true);
                                jiaVar.l(user.first_name, false);
                                if (user.scam) {
                                    jiaVar.i(bkb.f1);
                                } else if (user.fake) {
                                    jiaVar.i(bkb.g1);
                                } else if (user.verified) {
                                    Drawable d = b00.d(context, R.drawable.verified_area);
                                    int i = bkb.y9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    zkb.x(jiaVar, d, i, null, mode);
                                    Drawable d2 = b00.d(context, R.drawable.verified_check);
                                    ag2VarArr = ag2VarArr2;
                                    zkb.x(jiaVar, d2, bkb.z9, null, mode);
                                    jiaVar.i(new fm2(d, d2));
                                    TextView textView = new TextView(context);
                                    zkb.X(textView, bkb.l5, null);
                                    byte b = 1;
                                    ug8.w(textView, 1, 14.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((!k96.a0 ? 5 : 3) | 16);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setOnClickListener(new me(user, dVar, alertDialog$Builder, b));
                                    SpannableString valueOf = SpannableString.valueOf(k96.M0(2131748143, null).concat("  "));
                                    cm2 cm2Var = new cm2(R.drawable.attach_arrow_right, 0);
                                    cm2Var.n = 1;
                                    cm2Var.c(gl.L(10.0f));
                                    valueOf.setSpan(cm2Var, valueOf.length() - 1, valueOf.length(), 33);
                                    textView.setText(valueOf);
                                    boolean z = k96.a0;
                                    djVar.addView(jiaVar, nme.d(-1, -2.0f, (!z ? 5 : 3) | 48, !z ? 21 : 76, 0.0f, !z ? 76 : 21, 0.0f));
                                    boolean z2 = k96.a0;
                                    djVar.addView(textView, nme.d(-1, -2.0f, (!z2 ? 5 : 3) | 48, !z2 ? 21 : 76, 24.0f, z2 ? 76 : 21, 0.0f));
                                    djVar.addView(cjVar, nme.d(-2, -2.0f, (!k96.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                    atomicBoolean.set(true);
                                    ag2Var = new ag2(1, dVar.getResourceProvider(), context);
                                    ag2VarArr[0] = ag2Var;
                                    if (!ag2Var.I) {
                                        ke1 ke1Var = ag2Var.c;
                                        ke1Var.setLines(3);
                                        ke1Var.setMaxLines(3);
                                        ke1Var.setSingleLine(false);
                                    }
                                    ag2VarArr[0].setBackgroundDrawable(bkb.L0(false));
                                    ag2VarArr[0].e(gl.T2(k96.a0(null, null, 2131747587, l7c.q(user))), "", true, false, false);
                                    ag2VarArr[0].setPadding(!k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, !k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                                    ag2VarArr[0].c(true, false);
                                    djVar.addView(ag2VarArr[0], nme.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    ag2VarArr[0].setOnClickListener(new j1(atomicBoolean, (byte) 8));
                                    if (l7c.A(user)) {
                                        r8 = 0;
                                        pb0Var.p = 1.0f;
                                        dVar.getCurrentAccount();
                                        pb0Var.q(user);
                                        be0Var.f(user, pb0Var);
                                    } else {
                                        pb0Var.p = 0.8f;
                                        pb0Var.f(12);
                                        r8 = 0;
                                        be0Var.m(null, null, pb0Var, user);
                                    }
                                    alertDialog$Builder.j(k96.M0(2131744678, r8), new ce(runnable, (byte) 3));
                                    alertDialog$Builder.g(k96.M0(2131752577, r8), r8);
                                    dVar.showDialog(hdVar);
                                    cjVar.setText(gl.O2(k96.M0(2131752884, r8), -1, 0, new oe(hdVar, context, (byte) 1), r8));
                                }
                                ag2VarArr = ag2VarArr2;
                                TextView textView2 = new TextView(context);
                                zkb.X(textView2, bkb.l5, null);
                                byte b2 = 1;
                                ug8.w(textView2, 1, 14.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setGravity((!k96.a0 ? 5 : 3) | 16);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setOnClickListener(new me(user, dVar, alertDialog$Builder, b2));
                                SpannableString valueOf2 = SpannableString.valueOf(k96.M0(2131748143, null).concat("  "));
                                cm2 cm2Var2 = new cm2(R.drawable.attach_arrow_right, 0);
                                cm2Var2.n = 1;
                                cm2Var2.c(gl.L(10.0f));
                                valueOf2.setSpan(cm2Var2, valueOf2.length() - 1, valueOf2.length(), 33);
                                textView2.setText(valueOf2);
                                boolean z3 = k96.a0;
                                djVar.addView(jiaVar, nme.d(-1, -2.0f, (!z3 ? 5 : 3) | 48, !z3 ? 21 : 76, 0.0f, !z3 ? 76 : 21, 0.0f));
                                boolean z22 = k96.a0;
                                djVar.addView(textView2, nme.d(-1, -2.0f, (!z22 ? 5 : 3) | 48, !z22 ? 21 : 76, 24.0f, z22 ? 76 : 21, 0.0f));
                                djVar.addView(cjVar, nme.d(-2, -2.0f, (!k96.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                atomicBoolean.set(true);
                                ag2Var = new ag2(1, dVar.getResourceProvider(), context);
                                ag2VarArr[0] = ag2Var;
                                if (!ag2Var.I) {
                                }
                                ag2VarArr[0].setBackgroundDrawable(bkb.L0(false));
                                ag2VarArr[0].e(gl.T2(k96.a0(null, null, 2131747587, l7c.q(user))), "", true, false, false);
                                ag2VarArr[0].setPadding(!k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, !k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                                ag2VarArr[0].c(true, false);
                                djVar.addView(ag2VarArr[0], nme.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                ag2VarArr[0].setOnClickListener(new j1(atomicBoolean, (byte) 8));
                                if (l7c.A(user)) {
                                }
                                alertDialog$Builder.j(k96.M0(2131744678, r8), new ce(runnable, (byte) 3));
                                alertDialog$Builder.g(k96.M0(2131752577, r8), r8);
                                dVar.showDialog(hdVar);
                                cjVar.setText(gl.O2(k96.M0(2131752884, r8), -1, 0, new oe(hdVar, context, (byte) 1), r8));
                            }

                            public static void m0(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, c01 c01Var, TLRPC.WebPage webPage, wjb wjbVar) {
                                if (gl.C1(context)) {
                                    String scheme = str == null ? null : Uri.parse(str).getScheme();
                                    if (d01.g(Uri.parse(str), false, null) || !z3 || "mailto".equalsIgnoreCase(scheme)) {
                                        d01.s(context, Uri.parse(str), j == 0, z2, z4 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), c01Var, null, false, true, false, false);
                                        return;
                                    }
                                    String d = d01.d(str, z);
                                    fe2 fe2Var = new fe2(context, str, j, z2, c01Var);
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                                    String M0 = k96.M0(2131747586, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    TextView textView = new TextView(context);
                                    textView.setText(d);
                                    textView.setTextSize(1, 14.0f);
                                    int i = bkb.i5;
                                    zkb.X(textView, i, wjbVar);
                                    textView.setGravity(17);
                                    textView.setMaxLines(5);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setPadding(gl.L(14.0f), gl.L(12.0f), gl.L(14.0f), gl.L(12.0f));
                                    ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i, wjbVar)));
                                    vkb K = zkb.K(0.06f, i);
                                    textView.setBackground(b0);
                                    zkb.j(textView, b0, K, null, wjbVar);
                                    LinearLayout j2 = de9.j(context, 1);
                                    j2.addView(textView, nme.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                                    int i2 = jtc.f;
                                    if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                                        jtc jtcVar = new jtc(context, wjbVar);
                                        jtcVar.setWebPage(webPage);
                                        j2.addView(jtcVar, nme.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                                    }
                                    alertDialog$Builder.n(j2);
                                    hdVar.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
                                    alertDialog$Builder.j(k96.M0(2131747624, null), new l0(fe2Var, (byte) 15));
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    alertDialog$Builder.o();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v17 */
                            /* JADX WARN: Type inference failed for: r5v18, types: [ed, java.lang.String, wjb] */
                            /* JADX WARN: Type inference failed for: r5v21 */
                            public static void n(d dVar, TLRPC.User user, Runnable runnable, Runnable runnable2) {
                                ?? r5;
                                Context context = dVar.getContext();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                yi yiVar = new yi(context, null);
                                kk7.i(yiVar);
                                zkb.X(yiVar, bkb.i5, null);
                                zkb.G(yiVar, bkb.Wc, null);
                                yiVar.setTextSize(1, 16.0f);
                                yiVar.setGravity((k96.a0 ? 5 : 3) | 48);
                                FrameLayout frameLayout = new FrameLayout(context);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.H = (byte) 6;
                                alertDialog$Builder.n(frameLayout);
                                pb0 pb0Var = new pb0((wjb) null);
                                pb0Var.s(gl.L(18.0f));
                                be0 be0Var = new be0(context);
                                be0Var.setRoundRadius(gl.L(20.0f));
                                frameLayout.addView(be0Var, nme.d(40, 40.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                jia jiaVar = new jia(context);
                                zkb.W(jiaVar, bkb.D8, null);
                                jiaVar.setTextSize(20);
                                jiaVar.setTypeface(gl.o());
                                jiaVar.setGravity((k96.a0 ? 5 : 3) | 16);
                                jiaVar.setEllipsizeByGradient(true);
                                jiaVar.l(user.first_name, false);
                                if (user.scam) {
                                    jiaVar.i(bkb.f1);
                                } else if (user.fake) {
                                    jiaVar.i(bkb.g1);
                                } else if (user.verified) {
                                    Drawable d = b00.d(context, R.drawable.verified_area);
                                    int i = bkb.y9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    zkb.x(jiaVar, d, i, null, mode);
                                    Drawable d2 = b00.d(context, R.drawable.verified_check);
                                    zkb.x(jiaVar, d2, bkb.z9, null, mode);
                                    jiaVar.i(new fm2(d, d2));
                                }
                                TextView textView = new TextView(context);
                                zkb.X(textView, bkb.l5, null);
                                ug8.w(textView, 1, 14.0f, 1, 1);
                                textView.setSingleLine(true);
                                textView.setGravity((k96.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setOnClickListener(new me(user, dVar, alertDialog$Builder, (byte) 0));
                                SpannableString valueOf = SpannableString.valueOf(k96.M0(2131748143, null).concat("  "));
                                cm2 cm2Var = new cm2(R.drawable.attach_arrow_right, 0);
                                cm2Var.n = 1;
                                cm2Var.c(gl.L(10.0f));
                                valueOf.setSpan(cm2Var, valueOf.length() - 1, valueOf.length(), 33);
                                textView.setText(valueOf);
                                boolean z = k96.a0;
                                frameLayout.addView(jiaVar, nme.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 76, 0.0f, z ? 76 : 21, 0.0f));
                                boolean z2 = k96.a0;
                                frameLayout.addView(textView, nme.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 24.0f, z2 ? 76 : 21, 0.0f));
                                frameLayout.addView(yiVar, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                                if (l7c.A(user)) {
                                    pb0Var.p = 0.8f;
                                    pb0Var.f(12);
                                    r5 = 0;
                                    be0Var.m(null, null, pb0Var, user);
                                } else {
                                    r5 = 0;
                                    pb0Var.p = 1.0f;
                                    dVar.getCurrentAccount();
                                    pb0Var.q(user);
                                    be0Var.f(user, pb0Var);
                                }
                                alertDialog$Builder.j(k96.M0(2131744678, r5), new ce(runnable, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, r5), r5);
                                byte b = 0;
                                dVar.showDialog(hdVar, false, new ne(runnable2, b));
                                yiVar.setText(gl.O2(k96.M0(2131752884, r5), -1, 0, new oe(hdVar, context, b), r5));
                            }

                            public static void n0(d dVar, String str, boolean z, boolean z2) {
                                o0(dVar, str, z, true, z2, false, null, null, null);
                            }

                            public static i4d o(Activity activity, uc7 uc7Var, wjb wjbVar) {
                                if (activity == null) {
                                    return null;
                                }
                                i4d i4dVar = new i4d(activity, wjbVar);
                                Object obj = i4dVar.a;
                                ((fx0) obj).w0 = false;
                                hn7 hn7Var = new hn7(activity, wjbVar);
                                hn7Var.setTextOffset(gl.L(10.0f));
                                hn7Var.setItemCount(5);
                                hn7 hn7Var2 = new hn7(activity, wjbVar);
                                hn7Var2.setItemCount(5);
                                hn7Var2.setTextOffset(-gl.L(10.0f));
                                hn7 hn7Var3 = new hn7(activity, wjbVar);
                                hn7Var3.setItemCount(5);
                                hn7Var3.setTextOffset(-gl.L(24.0f));
                                zh zhVar = new zh(activity, hn7Var, hn7Var2, hn7Var3, (byte) 6);
                                zhVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(activity);
                                zhVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(activity);
                                textView.setText(k96.M0(2131752120, null));
                                tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
                                frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new p8((byte) 11));
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                System.currentTimeMillis();
                                wb wbVar = new wb(activity, (byte) 7);
                                linearLayout.addView(hn7Var, nme.l(0.25f, 0, kk7.s4));
                                hn7Var.setMinValue(1);
                                hn7Var.setMaxValue(31);
                                hn7Var.setWrapSelectorWheel(false);
                                hn7Var.setFormatter(new ag((byte) 13));
                                of ofVar = new of(hn7Var, hn7Var2, hn7Var3, (byte) 2);
                                hn7Var.setOnValueChangedListener(ofVar);
                                hn7Var2.setMinValue(0);
                                hn7Var2.setMaxValue(11);
                                hn7Var2.setWrapSelectorWheel(false);
                                linearLayout.addView(hn7Var2, nme.l(0.5f, 0, kk7.s4));
                                hn7Var2.setFormatter(new ag((byte) 14));
                                hn7Var2.setOnValueChangedListener(ofVar);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(1375315200000L);
                                int i = calendar.get(1);
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i2 = calendar.get(1);
                                hn7Var3.setMinValue(i);
                                hn7Var3.setMaxValue(i2);
                                hn7Var3.setWrapSelectorWheel(false);
                                hn7Var3.setFormatter(new ag((byte) 15));
                                linearLayout.addView(hn7Var3, nme.l(0.25f, 0, kk7.s4));
                                hn7Var3.setOnValueChangedListener(ofVar);
                                hn7Var.setValue(31);
                                hn7Var2.setValue(12);
                                hn7Var3.setValue(i2);
                                b(hn7Var, hn7Var2, hn7Var3);
                                wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                wbVar.setGravity(17);
                                zkb.X(wbVar, bkb.Ii, wjbVar);
                                wbVar.setTextSize(1, 14.0f);
                                wbVar.setTypeface(gl.o());
                                wbVar.setText(k96.M0(2131748873, null));
                                int L = gl.L(8.0f);
                                int i3 = bkb.Ei;
                                int v0 = bkb.v0(i3, wjbVar);
                                int i4 = bkb.Gi;
                                int v02 = bkb.v0(i4, wjbVar);
                                ff0 i0 = bkb.i0(L, L, L, L, v0, v02, v02);
                                vkb M = zkb.M(i3);
                                vkb M2 = zkb.M(i4);
                                wbVar.setBackground(i0);
                                zkb.j(wbVar, i0, M, M2, wjbVar);
                                zhVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
                                wbVar.setOnClickListener(new ef(hn7Var, hn7Var2, hn7Var3, calendar, uc7Var, i4dVar, (byte) 2));
                                ((fx0) obj).O = zhVar;
                                return i4dVar;
                            }

                            public static void o0(d dVar, String str, boolean z, boolean z2, boolean z3, boolean z4, c01 c01Var, TLRPC.WebPage webPage, wjb wjbVar) {
                                if (dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                m0(dVar.getParentActivity(), str, z, z2, z3, z4, dVar instanceof mu1 ? ((mu1) dVar).x8 : 0L, c01Var, webPage, wjbVar);
                            }

                            public static void p(d dVar, TLRPC.User user, boolean z) {
                                String M0;
                                String a0;
                                if (dVar.getParentActivity() == null || user == null || l7c.y(user) || y6c.h(dVar.getCurrentAccount()).e() == user.id) {
                                    return;
                                }
                                dVar.getCurrentAccount();
                                Activity parentActivity = dVar.getParentActivity();
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                byte b = 0;
                                if (z) {
                                    M0 = k96.M0(2131743370, null);
                                    a0 = k96.a0("VideoCallAlert", null, 2131743371, l7c.q(user));
                                } else {
                                    M0 = k96.M0(2131752619, null);
                                    a0 = k96.a0("CallAlert", null, 2131752620, l7c.q(user));
                                }
                                uh uhVar = new uh(parentActivity);
                                kk7.i(uhVar);
                                zkb.X(uhVar, bkb.i5, null);
                                uhVar.setTextSize(1, 16.0f);
                                uhVar.setGravity((k96.a0 ? 5 : 3) | 48);
                                uhVar.setText(gl.T2(a0));
                                pb0 pb0Var = new pb0((wjb) null);
                                pb0Var.s(gl.L(12.0f));
                                pb0Var.p = 1.0f;
                                dVar.getCurrentAccount();
                                pb0Var.q(user);
                                be0 be0Var = new be0(parentActivity);
                                be0Var.setRoundRadius(gl.L(20.0f));
                                be0Var.f(user, pb0Var);
                                frameLayout.addView(be0Var, nme.d(40, 40.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                TextView textView = new TextView(parentActivity);
                                tb4.w(textView, bkb.D8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((k96.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setText(M0);
                                boolean z2 = k96.a0;
                                frameLayout.addView(textView, nme.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
                                frameLayout.addView(uhVar, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.j(k96.M0(2131752622, null), new ch(dVar, user, z, b));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                dVar.showDialog(alertDialog$Builder.a);
                            }

                            public static void p0(Activity activity, int i, Runnable runnable, boolean z, wjb wjbVar) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int i2 = na7.q1(i).g3;
                                if ((i2 & 1) != 0) {
                                    b00.r(null, 2131748494, arrayList, 0, arrayList2);
                                }
                                if ((i2 & 2) != 0) {
                                    b00.r(null, 2131748496, arrayList, 1, arrayList2);
                                }
                                byte b = 4;
                                if ((i2 & 4) != 0) {
                                    b00.r(null, 2131748492, arrayList, 3, arrayList2);
                                }
                                arrayList.add(k96.M0(2131748495, null));
                                arrayList2.add(2);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
                                alertDialog$Builder.a.S = k96.M0(2131748493, null);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder.n(linearLayout);
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    wy8 wy8Var = new wy8(activity, wjbVar);
                                    wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                                    wy8Var.setTag(Integer.valueOf(i3));
                                    a(wy8Var, bkb.f7, bkb.D5, null);
                                    wy8Var.b((CharSequence) arrayList.get(i3), gba.l0 == ((Integer) arrayList2.get(i3)).intValue());
                                    int i4 = bkb.h6;
                                    ff0 f0 = bkb.f0(bkb.w0(null, i4, false), 2, -1);
                                    vkb M = zkb.M(i4);
                                    wy8Var.setBackground(f0);
                                    zkb.j(wy8Var, f0, null, M, null);
                                    linearLayout.addView(wy8Var);
                                    wy8Var.setOnClickListener(new b0(arrayList2, runnable, alertDialog$Builder, b));
                                }
                                if (!z) {
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                }
                                hd o = alertDialog$Builder.o();
                                if (z) {
                                    o.setCanceledOnTouchOutside(false);
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:39:0x0180, code lost:
                            
                                if (hc2.p0(r35) == false) goto L60;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x0198, code lost:
                            
                                r8 = new ag2(1, r38, r6);
                                r11[0] = r8;
                                r8.setBackgroundDrawable(bkb.L0(false));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x01a8, code lost:
                            
                                if (r35 == null) goto L63;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:42:0x01aa, code lost:
                            
                                r11[0].e(k96.M0(2131751512, null), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x01dd, code lost:
                            
                                r2 = r11[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x01e3, code lost:
                            
                                if (k96.a0 == false) goto L67;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e5, code lost:
                            
                                r4 = gl.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:47:0x01f0, code lost:
                            
                                if (k96.a0 == false) goto L72;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x01f2, code lost:
                            
                                r5 = gl.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x01fd, code lost:
                            
                                r2.setPadding(r4, 0, r5, 0);
                                r15.addView(r11[0], nme.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                r11[0].c(false, false);
                                r11[0].setOnClickListener(new ge(r1, 2));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:64:0x01f8, code lost:
                            
                                r5 = gl.L(16.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x01ea, code lost:
                            
                                r4 = gl.L(8.0f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x01bf, code lost:
                            
                                r11[0].e(k96.a0("DeleteMessagesOptionAlso", null, 2131751513, l7c.k(r34, true)), "", false, false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
                            
                                if (hc2.p0(r35) == false) goto L60;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static void q(d dVar, int i, TLRPC.User user, TLRPC.Chat chat, boolean z, sc7 sc7Var, wjb wjbVar) {
                                boolean z2;
                                if (dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                if (user == null && chat == null) {
                                    return;
                                }
                                int currentAccount = dVar.getCurrentAccount();
                                Activity parentActivity = dVar.getParentActivity();
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, parentActivity);
                                long e = y6c.h(currentAccount).e();
                                ag2[] ag2VarArr = new ag2[1];
                                sh shVar = new sh(parentActivity);
                                kk7.i(shVar);
                                zkb.X(shVar, bkb.i5, null);
                                shVar.setTextSize(1, 16.0f);
                                shVar.setGravity((k96.a0 ? 5 : 3) | 48);
                                th thVar = new th(parentActivity, ag2VarArr);
                                alertDialog$Builder.n(thVar);
                                TextView textView = new TextView(parentActivity);
                                tb4.w(textView, bkb.D8, null, 1, 20.0f);
                                textView.setLines(1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                textView.setGravity((k96.a0 ? 5 : 3) | 16);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                thVar.addView(textView, nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                                thVar.addView(shVar, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                                if (i == -1) {
                                    textView.setText(k96.a0("ClearHistory", null, 2131752077, new Object[0]));
                                    if (user != null) {
                                        shVar.setText(gl.T2(k96.a0("AreYouSureClearHistoryWithUser", null, 2131754104, l7c.q(user))));
                                    } else if (z) {
                                        if (hc2.V(chat)) {
                                            shVar.setText(gl.T2(k96.a0("AreYouSureClearHistoryWithChannel", null, 2131754107, chat.title)));
                                            z2 = false;
                                        } else {
                                            shVar.setText(gl.T2(k96.a0("AreYouSureClearHistoryWithChat", null, 2131754106, chat.title)));
                                        }
                                    } else if (chat.megagroup) {
                                        shVar.setText(k96.M0(2131754109, null));
                                    } else {
                                        shVar.setText(k96.M0(2131754111, null));
                                    }
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    textView.setText(k96.G(i, "DeleteDays", new Object[0]));
                                    shVar.setText(k96.M0(2131751523, null));
                                }
                                boolean[] zArr = new boolean[1];
                                zArr[z2 ? 1 : 0] = z2;
                                if (chat != null && z && hc2.t0(chat)) {
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
                                        if (!hc2.t0(chat)) {
                                            if (!hc2.V(chat)) {
                                            }
                                        }
                                    }
                                }
                                CharSequence M0 = k96.M0(2131751586, null);
                                if (chat != null && z && hc2.t0(chat) && !hc2.V(chat)) {
                                    M0 = k96.M0(2131752079, null);
                                }
                                alertDialog$Builder.j(M0, new o(sc7Var, zArr, (byte) 10));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                hd hdVar = alertDialog$Builder.a;
                                dVar.showDialog(hdVar);
                                TextView textView2 = (TextView) hdVar.c(-1);
                                if (textView2 != null) {
                                    zkb.X(textView2, bkb.p7, null);
                                }
                            }

                            public static void q0(int i, wjb wjbVar, d dVar) {
                                if (i == 0 || dVar == null || dVar.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, dVar.getParentActivity());
                                String M0 = k96.M0(2131743677, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                if (i == 1) {
                                    hdVar.U = k96.M0(2131751075, null);
                                } else if (i == 2) {
                                    hdVar.U = k96.M0(2131751087, null);
                                } else if (i == 3) {
                                    hdVar.U = k96.M0(2131751081, null);
                                } else if (i == 4) {
                                    hdVar.U = k96.M0(2131751074, null);
                                } else if (i == 5) {
                                    hdVar.U = k96.M0(2131751086, null);
                                } else if (i == 6) {
                                    hdVar.U = k96.M0(2131751080, null);
                                } else if (i == 7) {
                                    hdVar.U = k96.M0(2131751078, null);
                                } else if (i == 8) {
                                    hdVar.U = k96.M0(2131751079, null);
                                } else if (i == 9) {
                                    hdVar.U = k96.M0(2131751070, null);
                                } else if (i == 10) {
                                    hdVar.U = k96.M0(2131751082, null);
                                } else if (i == 11) {
                                    hdVar.U = k96.M0(2131751071, null);
                                } else if (i == 12) {
                                    hdVar.U = k96.M0(2131751083, null);
                                } else if (i == 13) {
                                    hdVar.U = k96.M0(2131751068, null);
                                } else if (i == 14) {
                                    hdVar.U = k96.M0(2131751069, null);
                                } else if (i == 15) {
                                    hdVar.U = k96.M0(2131751076, null);
                                } else if (i == 16) {
                                    hdVar.U = k96.M0(2131751077, null);
                                } else if (i == 17) {
                                    hdVar.U = k96.M0(2131751088, null);
                                } else if (i == 18) {
                                    hdVar.U = k96.M0(2131751089, null);
                                } else if (i == 19) {
                                    hdVar.U = k96.M0(2131751084, null);
                                } else if (i == 20) {
                                    hdVar.U = k96.M0(2131751085, null);
                                } else if (i == 21) {
                                    hdVar.U = k96.M0(2131751072, null);
                                } else if (i == 22) {
                                    hdVar.U = k96.M0(2131751073, null);
                                }
                                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                dVar.showDialog(hdVar, true, null);
                            }

                            public static void r(d dVar, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, sc7 sc7Var) {
                                s(dVar, z, false, chat, user, z2, z3, z4, z5, sc7Var, dVar != null ? dVar.getResourceProvider() : null);
                            }

                            public static hd r0(d dVar, String str, String str2, wjb wjbVar) {
                                if (dVar == null) {
                                    dVar = LaunchActivity.S();
                                }
                                if (str2 == null || dVar == null || dVar.getParentActivity() == null) {
                                    return null;
                                }
                                hd hdVar = L(dVar.getParentActivity(), str, str2, null, null, wjbVar).a;
                                dVar.showDialog(hdVar);
                                return hdVar;
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
                            public static void s(final d dVar, final boolean z, final boolean z2, final TLRPC.Chat chat, final TLRPC.User user, final boolean z3, final boolean z4, boolean z5, final boolean z6, final sc7 sc7Var, final wjb wjbVar) {
                                long j;
                                boolean z7;
                                pb0 pb0Var;
                                TLRPC.Chat chat2;
                                ag2[] ag2VarArr;
                                oh ohVar;
                                ArrayList arrayList;
                                hd hdVar;
                                pb0 pb0Var2;
                                float f;
                                float f2;
                                boolean z8;
                                pb0 pb0Var3;
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
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, parentActivity);
                                long e = y6c.h(currentAccount).e();
                                ag2[] ag2VarArr2 = new ag2[1];
                                oh ohVar2 = new oh(parentActivity);
                                kk7.i(ohVar2);
                                zkb.X(ohVar2, bkb.i5, null);
                                ohVar2.setTextSize(1, 16.0f);
                                ohVar2.setGravity((k96.a0 ? 5 : 3) | 48);
                                if (!z6 && hc2.T(chat) && hc2.t0(chat)) {
                                    j = e;
                                    z7 = true;
                                } else {
                                    j = e;
                                    z7 = false;
                                }
                                ph phVar = new ph(parentActivity, ag2VarArr2);
                                hd hdVar2 = alertDialog$Builder.a;
                                hdVar2.H = (byte) 6;
                                alertDialog$Builder.n(phVar);
                                pb0 pb0Var4 = new pb0((wjb) null);
                                pb0Var4.s(gl.L(18.0f));
                                be0 be0Var = new be0(parentActivity);
                                be0Var.setRoundRadius(gl.L(15.0f));
                                phVar.addView(be0Var, nme.d(30, 30.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                                hn hnVar = new hn(parentActivity, false, false, false);
                                zkb.U(hnVar, bkb.D8, null);
                                hnVar.setTextSize(gl.L(20.0f));
                                hnVar.setTypeface(gl.o());
                                hnVar.setGravity((k96.a0 ? 5 : 3) | 16);
                                hnVar.setEllipsizeByGradient(true);
                                final boolean z11 = z7;
                                if (z) {
                                    if (z7) {
                                        hnVar.setText(k96.M0(2131752076, null));
                                    } else {
                                        hnVar.setText(k96.M0(2131752077, null));
                                    }
                                } else if (chat == null) {
                                    hnVar.setText(k96.M0(2131751541, null));
                                } else if (hc2.Y(chat)) {
                                    hnVar.setText(k96.M0(2131751922, null));
                                } else if (!hc2.T(chat)) {
                                    hnVar.setText(k96.M0(2131748799, null));
                                } else if (chat.monoforum) {
                                    hnVar.setText(k96.M0(2131748803, null));
                                } else if (chat.megagroup) {
                                    hnVar.setText(k96.M0(2131748799, null));
                                } else {
                                    hnVar.setText(k96.M0(2131748812, null));
                                }
                                boolean z12 = k96.a0;
                                phVar.addView(hnVar, nme.d(-1, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 22 : 65, 7.66f, z12 ? 65 : 22, 0.0f));
                                phVar.addView(ohVar2, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
                                if (hc2.p0(chat)) {
                                    pb0Var = pb0Var4;
                                    chat2 = dVar.getMessagesController().s1(chat.id);
                                } else {
                                    pb0Var = pb0Var4;
                                    chat2 = null;
                                }
                                boolean z13 = !z3 && user != null && (user != null && !user.bot && (user.id > j ? 1 : (user.id == j ? 0 : -1)) != 0 && na7.q1(currentAccount).V2) && (user != null ? na7.q1(currentAccount).U2 : na7.q1(currentAccount).T2) == Integer.MAX_VALUE;
                                final boolean[] zArr = new boolean[1];
                                if (user != null) {
                                    ag2VarArr = ag2VarArr2;
                                    ohVar = ohVar2;
                                    arrayList = (ArrayList) na7.q1(currentAccount).S.f(user.id);
                                } else {
                                    ag2VarArr = ag2VarArr2;
                                    ohVar = ohVar2;
                                    arrayList = null;
                                }
                                boolean z14 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((k27) arrayList.get(0)).k == null || (!(((k27) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((k27) arrayList.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (user != null) {
                                    f = 10.0f;
                                    if (user.bot) {
                                        pb0Var2 = pb0Var;
                                        f2 = 8.0f;
                                        if (user.id != 489000) {
                                            ag2 ag2Var = new ag2(1, wjbVar, parentActivity);
                                            ag2VarArr[0] = ag2Var;
                                            ag2Var.setBackground(bkb.L0(false));
                                            ag2VarArr[0].e(k96.M0(2131753691, null), "", false, false, false);
                                            hdVar = hdVar2;
                                            ag2VarArr[0].setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), gl.L(10.0f), k96.a0 ? gl.L(8.0f) : gl.L(16.0f), gl.L(10.0f));
                                            ag2 ag2Var2 = ag2VarArr[0];
                                            zArr[0] = true;
                                            ag2Var2.c(true, false);
                                            ag2VarArr[0].setMultiline(true);
                                            phVar.addView(ag2VarArr[0], nme.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                            ag2VarArr[0].setOnClickListener(new ge(zArr, (byte) 1));
                                            pb0Var3 = pb0Var2;
                                            z9 = false;
                                            if (user == null) {
                                                pb0 pb0Var5 = pb0Var3;
                                                if (l7c.A(user)) {
                                                    pb0Var5.p = 0.6f;
                                                    pb0Var5.f(12);
                                                    be0Var.m(null, null, pb0Var5, user);
                                                } else if (user.id == j) {
                                                    pb0Var5.p = 0.6f;
                                                    pb0Var5.f(1);
                                                    be0Var.m(null, null, pb0Var5, user);
                                                } else {
                                                    pb0Var5.p = 1.0f;
                                                    dVar.getCurrentAccount();
                                                    pb0Var5.q(user);
                                                    be0Var.f(user, pb0Var5);
                                                }
                                            } else {
                                                pb0 pb0Var6 = pb0Var3;
                                                dVar.getCurrentAccount();
                                                pb0Var6.p(chat2 != null ? chat2 : chat);
                                                be0Var.f(chat2 != null ? chat2 : chat, pb0Var6);
                                            }
                                            if (z2) {
                                                oh ohVar3 = ohVar;
                                                if (!z) {
                                                    str = null;
                                                    if (user != null) {
                                                        if (z3) {
                                                            ohVar3.setText(gl.T2(k96.a0(null, null, 2131754084, l7c.q(user))));
                                                        } else if (user.id == j) {
                                                            ohVar3.setText(gl.T2(k96.M0(2131754087, null)));
                                                            str = null;
                                                        } else if (!user.bot || user.support) {
                                                            str = null;
                                                            ohVar3.setText(gl.T2(k96.a0(null, null, 2131754083, l7c.q(user))));
                                                        } else {
                                                            str = null;
                                                            ohVar3.setText(gl.T2(k96.a0(null, null, 2131754085, l7c.q(user))));
                                                        }
                                                    } else if (hc2.T(chat)) {
                                                        String a0 = chat2 != null ? k96.a0(null, null, 2131748154, chat2.title) : chat.title;
                                                        if (chat.megagroup) {
                                                            ohVar3.setText(gl.T2(k96.a0(null, null, 2131748451, a0)));
                                                        } else {
                                                            ohVar3.setText(gl.T2(k96.a0(null, null, 2131752377, a0)));
                                                        }
                                                    } else {
                                                        ohVar3.setText(gl.T2(k96.a0(null, null, 2131754101, chat.title)));
                                                    }
                                                } else if (user == null) {
                                                    String a02 = chat2 != null ? k96.a0(null, null, 2131748154, chat2.title) : chat.title;
                                                    if (!hc2.T(chat) || (chat.megagroup && !hc2.t0(chat))) {
                                                        str = null;
                                                        ohVar3.setText(gl.T2(k96.a0(null, null, 2131754106, a02)));
                                                    } else if (chat.megagroup) {
                                                        str = null;
                                                        ohVar3.setText(k96.M0(2131754109, null));
                                                    } else {
                                                        str = null;
                                                        ohVar3.setText(k96.M0(2131754111, null));
                                                    }
                                                } else if (z3) {
                                                    str = null;
                                                    ohVar3.setText(gl.T2(k96.a0(null, null, 2131754105, l7c.q(user))));
                                                } else {
                                                    str = null;
                                                    if (user.id == j) {
                                                        ohVar3.setText(gl.T2(k96.M0(2131754108, null)));
                                                    } else {
                                                        ohVar3.setText(gl.T2(k96.a0(null, null, 2131754104, l7c.q(user))));
                                                    }
                                                }
                                            } else if (l7c.C(user)) {
                                                str = null;
                                                ohVar.setText(gl.T2(k96.M0(2131751569, null)));
                                            } else {
                                                oh ohVar4 = ohVar;
                                                str = null;
                                                if (chat == null || !hc2.V(chat)) {
                                                    ohVar4.setText(gl.T2(k96.M0(2131751573, null)));
                                                    str = null;
                                                } else {
                                                    ohVar4.setText(gl.T2(k96.M0(2131751572, null)));
                                                }
                                            }
                                            if (!z2) {
                                                M0 = k96.M0(2131751578, str);
                                            } else if (z) {
                                                M0 = z11 ? k96.M0(2131752076, str) : k96.M0(2131752078, str);
                                            } else if (z9 && zArr[0]) {
                                                M0 = k96.M0(hc2.V(chat) ? 2131752410 : 2131751518, str);
                                            } else {
                                                M0 = hc2.T(chat) ? chat.monoforum ? k96.M0(2131748803, str) : chat.megagroup ? k96.M0(2131748798, str) : k96.M0(2131748810, str) : k96.M0(2131751541, str);
                                            }
                                            hd hdVar3 = hdVar;
                                            alertDialog$Builder.j(M0, new ed() { // from class: rg
                                                @Override // ed
                                                public final void u(hd hdVar4, int i) {
                                                    boolean z15 = z11;
                                                    final boolean z16 = z2;
                                                    final boolean[] zArr2 = zArr;
                                                    final sc7 sc7Var2 = sc7Var;
                                                    boolean z17 = true;
                                                    if (!z15 && !z16 && !z3) {
                                                        final TLRPC.User user2 = user;
                                                        boolean C = l7c.C(user2);
                                                        final d dVar2 = dVar;
                                                        final boolean z18 = z;
                                                        final TLRPC.Chat chat3 = chat;
                                                        final boolean z19 = z4;
                                                        final boolean z20 = z6;
                                                        final wjb wjbVar2 = wjbVar;
                                                        if (C) {
                                                            ij.s(dVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, sc7Var2, wjbVar2);
                                                            return;
                                                        }
                                                        if (user2 != null && zArr2[0]) {
                                                            ad7 Y = ad7.Y(dVar2.getCurrentAccount());
                                                            Y.a.c(new dc7(Y, user2.id, new uc7() { // from class: te
                                                                @Override // uc7
                                                                public final void a(int i2) {
                                                                    boolean[] zArr3 = zArr2;
                                                                    sc7 sc7Var3 = sc7Var2;
                                                                    if (i2 < 50) {
                                                                        sc7Var3.k(zArr3[0]);
                                                                    } else {
                                                                        ij.s(d.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, sc7Var3, wjbVar2);
                                                                    }
                                                                }
                                                            }, (byte) 0));
                                                            return;
                                                        }
                                                        if (hc2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                            final c01 g = alertDialog$Builder.a.g(-1, true, true);
                                                            g.d();
                                                            TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                            tL_messages_getFutureChatCreatorAfterLeave.peer = na7.j1(chat3);
                                                            final int i2 = currentAccount;
                                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                            hc hcVar = new hc((byte) 0);
                                                            final Activity activity = parentActivity;
                                                            connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, hcVar, new i8c() { // from class: ue
                                                                @Override // i8c
                                                                public final void a(Object obj, Object obj2) {
                                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                                    c01.this.c(false);
                                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                    sc7 sc7Var3 = sc7Var2;
                                                                    if (user4 == null) {
                                                                        sc7Var3.k(z16 || zArr2[0]);
                                                                        return;
                                                                    }
                                                                    Activity activity2 = activity;
                                                                    TLRPC.Chat chat4 = chat3;
                                                                    kf kfVar = new kf(activity2, chat4, user4, i2, sc7Var3, wjbVar2, (byte) 0);
                                                                    lf lfVar = new lf(sc7Var3, (byte) 0);
                                                                    d dVar3 = dVar2;
                                                                    if (dVar3 == null || dVar3.getParentActivity() == null || chat4 == null) {
                                                                        return;
                                                                    }
                                                                    Context context = dVar3.getContext();
                                                                    TLRPC.User f3 = y6c.h(dVar3.getCurrentAccount()).f();
                                                                    boolean V = hc2.V(chat4);
                                                                    FrameLayout frameLayout = new FrameLayout(context);
                                                                    frameLayout.setClipToPadding(false);
                                                                    frameLayout.setClipChildren(false);
                                                                    be0 be0Var2 = new be0(context);
                                                                    pb0 pb0Var7 = new pb0((wjb) null);
                                                                    pb0Var7.q(f3);
                                                                    be0Var2.setRoundRadius(gl.L(30.0f));
                                                                    be0Var2.f(f3, pb0Var7);
                                                                    frameLayout.addView(be0Var2, nme.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                    ImageView imageView = new ImageView(context);
                                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                    zkb.s(imageView, bkb.c7, dVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                    frameLayout.addView(imageView, nme.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                    qh qhVar = new qh(context);
                                                                    pb0 pb0Var8 = new pb0((wjb) null);
                                                                    pb0Var8.q(user4);
                                                                    qhVar.setRoundRadius(gl.L(30.0f));
                                                                    qhVar.f(user4, pb0Var8);
                                                                    frameLayout.addView(qhVar, nme.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                    be0 be0Var3 = new be0(context);
                                                                    pb0 pb0Var9 = new pb0((wjb) null);
                                                                    pb0Var9.p(chat4);
                                                                    be0Var3.setRoundRadius(gl.L(12.0f));
                                                                    be0Var3.f(chat4, pb0Var9);
                                                                    frameLayout.addView(be0Var3, nme.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                    hd hdVar5 = alertDialog$Builder2.a;
                                                                    hdVar5.P0 = -1.0f;
                                                                    hdVar5.W = frameLayout;
                                                                    hdVar5.S = k96.M0(V ? 2131748808 : 2131748800, null);
                                                                    hdVar5.U = gl.T2(k96.a0(null, null, V ? 2131748809 : 2131748801, l7c.q(user4), chat4.title));
                                                                    alertDialog$Builder2.g(k96.M0(2131754207, null), new l0(kfVar, (byte) 11));
                                                                    alertDialog$Builder2.h(k96.M0(2131752577, null), null);
                                                                    alertDialog$Builder2.j(k96.M0(V ? 2131748812 : 2131748798, null), new l0(lfVar, (byte) 12));
                                                                    hdVar5.show();
                                                                    View c = hdVar5.c(-1);
                                                                    if (c instanceof TextView) {
                                                                        zkb.X((TextView) c, bkb.p7, null);
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        sc7Var2 = sc7Var2;
                                                    }
                                                    if (!z16 && !zArr2[0]) {
                                                        z17 = false;
                                                    }
                                                    sc7Var2.k(z17);
                                                }
                                            });
                                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                            dVar.showDialog(hdVar3);
                                            textView = (TextView) hdVar3.c(-1);
                                            if (textView == null) {
                                                zkb.X(textView, bkb.p7, null);
                                                return;
                                            }
                                            return;
                                        }
                                        hdVar = hdVar2;
                                        if (!z2 || (((!z3 || z) && !z13) || l7c.y(user) || z14)) {
                                            z8 = (z4 || z || chat == null || !chat.creator) ? false : true;
                                            if (!z8) {
                                                pb0Var3 = pb0Var2;
                                                z9 = z8;
                                                if (user == null) {
                                                }
                                                if (z2) {
                                                }
                                                if (!z2) {
                                                }
                                                hd hdVar32 = hdVar;
                                                alertDialog$Builder.j(M0, new ed() { // from class: rg
                                                    @Override // ed
                                                    public final void u(hd hdVar4, int i) {
                                                        boolean z15 = z11;
                                                        final boolean z16 = z2;
                                                        final boolean[] zArr2 = zArr;
                                                        final sc7 sc7Var2 = sc7Var;
                                                        boolean z17 = true;
                                                        if (!z15 && !z16 && !z3) {
                                                            final TLRPC.User user2 = user;
                                                            boolean C = l7c.C(user2);
                                                            final d dVar2 = dVar;
                                                            final boolean z18 = z;
                                                            final TLRPC.Chat chat3 = chat;
                                                            final boolean z19 = z4;
                                                            final boolean z20 = z6;
                                                            final wjb wjbVar2 = wjbVar;
                                                            if (C) {
                                                                ij.s(dVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, sc7Var2, wjbVar2);
                                                                return;
                                                            }
                                                            if (user2 != null && zArr2[0]) {
                                                                ad7 Y = ad7.Y(dVar2.getCurrentAccount());
                                                                Y.a.c(new dc7(Y, user2.id, new uc7() { // from class: te
                                                                    @Override // uc7
                                                                    public final void a(int i2) {
                                                                        boolean[] zArr3 = zArr2;
                                                                        sc7 sc7Var3 = sc7Var2;
                                                                        if (i2 < 50) {
                                                                            sc7Var3.k(zArr3[0]);
                                                                        } else {
                                                                            ij.s(d.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, sc7Var3, wjbVar2);
                                                                        }
                                                                    }
                                                                }, (byte) 0));
                                                                return;
                                                            }
                                                            if (hc2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                                final c01 g = alertDialog$Builder.a.g(-1, true, true);
                                                                g.d();
                                                                TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                                tL_messages_getFutureChatCreatorAfterLeave.peer = na7.j1(chat3);
                                                                final int i2 = currentAccount;
                                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                                hc hcVar = new hc((byte) 0);
                                                                final Activity activity = parentActivity;
                                                                connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, hcVar, new i8c() { // from class: ue
                                                                    @Override // i8c
                                                                    public final void a(Object obj, Object obj2) {
                                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                                        c01.this.c(false);
                                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                        sc7 sc7Var3 = sc7Var2;
                                                                        if (user4 == null) {
                                                                            sc7Var3.k(z16 || zArr2[0]);
                                                                            return;
                                                                        }
                                                                        Activity activity2 = activity;
                                                                        TLRPC.Chat chat4 = chat3;
                                                                        kf kfVar = new kf(activity2, chat4, user4, i2, sc7Var3, wjbVar2, (byte) 0);
                                                                        lf lfVar = new lf(sc7Var3, (byte) 0);
                                                                        d dVar3 = dVar2;
                                                                        if (dVar3 == null || dVar3.getParentActivity() == null || chat4 == null) {
                                                                            return;
                                                                        }
                                                                        Context context = dVar3.getContext();
                                                                        TLRPC.User f3 = y6c.h(dVar3.getCurrentAccount()).f();
                                                                        boolean V = hc2.V(chat4);
                                                                        FrameLayout frameLayout = new FrameLayout(context);
                                                                        frameLayout.setClipToPadding(false);
                                                                        frameLayout.setClipChildren(false);
                                                                        be0 be0Var2 = new be0(context);
                                                                        pb0 pb0Var7 = new pb0((wjb) null);
                                                                        pb0Var7.q(f3);
                                                                        be0Var2.setRoundRadius(gl.L(30.0f));
                                                                        be0Var2.f(f3, pb0Var7);
                                                                        frameLayout.addView(be0Var2, nme.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                        ImageView imageView = new ImageView(context);
                                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                        zkb.s(imageView, bkb.c7, dVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                        frameLayout.addView(imageView, nme.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                        qh qhVar = new qh(context);
                                                                        pb0 pb0Var8 = new pb0((wjb) null);
                                                                        pb0Var8.q(user4);
                                                                        qhVar.setRoundRadius(gl.L(30.0f));
                                                                        qhVar.f(user4, pb0Var8);
                                                                        frameLayout.addView(qhVar, nme.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                        be0 be0Var3 = new be0(context);
                                                                        pb0 pb0Var9 = new pb0((wjb) null);
                                                                        pb0Var9.p(chat4);
                                                                        be0Var3.setRoundRadius(gl.L(12.0f));
                                                                        be0Var3.f(chat4, pb0Var9);
                                                                        frameLayout.addView(be0Var3, nme.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                        hd hdVar5 = alertDialog$Builder2.a;
                                                                        hdVar5.P0 = -1.0f;
                                                                        hdVar5.W = frameLayout;
                                                                        hdVar5.S = k96.M0(V ? 2131748808 : 2131748800, null);
                                                                        hdVar5.U = gl.T2(k96.a0(null, null, V ? 2131748809 : 2131748801, l7c.q(user4), chat4.title));
                                                                        alertDialog$Builder2.g(k96.M0(2131754207, null), new l0(kfVar, (byte) 11));
                                                                        alertDialog$Builder2.h(k96.M0(2131752577, null), null);
                                                                        alertDialog$Builder2.j(k96.M0(V ? 2131748812 : 2131748798, null), new l0(lfVar, (byte) 12));
                                                                        hdVar5.show();
                                                                        View c = hdVar5.c(-1);
                                                                        if (c instanceof TextView) {
                                                                            zkb.X((TextView) c, bkb.p7, null);
                                                                        }
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            sc7Var2 = sc7Var2;
                                                        }
                                                        if (!z16 && !zArr2[0]) {
                                                            z17 = false;
                                                        }
                                                        sc7Var2.k(z17);
                                                    }
                                                });
                                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                                dVar.showDialog(hdVar32);
                                                textView = (TextView) hdVar32.c(-1);
                                                if (textView == null) {
                                                }
                                            }
                                        } else {
                                            z8 = false;
                                        }
                                        ag2 ag2Var3 = new ag2(1, wjbVar, parentActivity);
                                        ag2VarArr[0] = ag2Var3;
                                        ag2Var3.setBackground(bkb.L0(false));
                                        if (!z8) {
                                            if (!hc2.T(chat) || chat.megagroup) {
                                                ag2VarArr[0].e(k96.M0(2131751524, null), "", false, false, false);
                                            } else {
                                                ag2VarArr[0].e(k96.M0(2131751545, null), "", false, false, false);
                                            }
                                            z10 = true;
                                        } else if (z) {
                                            z10 = true;
                                            ag2VarArr[0].e(k96.a0(null, null, 2131752068, l7c.k(user, true)), "", false, false, false);
                                        } else {
                                            z10 = true;
                                            ag2VarArr[0].e(k96.a0(null, null, 2131751513, l7c.k(user, true)), "", false, false, false);
                                        }
                                        ag2VarArr[0].setMultiline(z10);
                                        pb0Var3 = pb0Var2;
                                        ag2VarArr[0].setPadding(!k96.a0 ? gl.L(16.0f) : gl.L(f2), gl.L(f), !k96.a0 ? gl.L(f2) : gl.L(16.0f), gl.L(f));
                                        phVar.addView(ag2VarArr[0], nme.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                        qg qgVar = new qg(z8, chat, alertDialog$Builder, zArr);
                                        ag2VarArr[0].setOnClickListener(new t(zArr, qgVar, (byte) 13));
                                        if (z5) {
                                            ag2 ag2Var4 = ag2VarArr[0];
                                            zArr[0] = true;
                                            ag2Var4.c(true, false);
                                            qgVar.run();
                                        }
                                        z9 = z8;
                                        if (user == null) {
                                        }
                                        if (z2) {
                                        }
                                        if (!z2) {
                                        }
                                        hd hdVar322 = hdVar;
                                        alertDialog$Builder.j(M0, new ed() { // from class: rg
                                            @Override // ed
                                            public final void u(hd hdVar4, int i) {
                                                boolean z15 = z11;
                                                final boolean z16 = z2;
                                                final boolean[] zArr2 = zArr;
                                                final sc7 sc7Var2 = sc7Var;
                                                boolean z17 = true;
                                                if (!z15 && !z16 && !z3) {
                                                    final TLRPC.User user2 = user;
                                                    boolean C = l7c.C(user2);
                                                    final d dVar2 = dVar;
                                                    final boolean z18 = z;
                                                    final TLRPC.Chat chat3 = chat;
                                                    final boolean z19 = z4;
                                                    final boolean z20 = z6;
                                                    final wjb wjbVar2 = wjbVar;
                                                    if (C) {
                                                        ij.s(dVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, sc7Var2, wjbVar2);
                                                        return;
                                                    }
                                                    if (user2 != null && zArr2[0]) {
                                                        ad7 Y = ad7.Y(dVar2.getCurrentAccount());
                                                        Y.a.c(new dc7(Y, user2.id, new uc7() { // from class: te
                                                            @Override // uc7
                                                            public final void a(int i2) {
                                                                boolean[] zArr3 = zArr2;
                                                                sc7 sc7Var3 = sc7Var2;
                                                                if (i2 < 50) {
                                                                    sc7Var3.k(zArr3[0]);
                                                                } else {
                                                                    ij.s(d.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, sc7Var3, wjbVar2);
                                                                }
                                                            }
                                                        }, (byte) 0));
                                                        return;
                                                    }
                                                    if (hc2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                        final c01 g = alertDialog$Builder.a.g(-1, true, true);
                                                        g.d();
                                                        TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                        tL_messages_getFutureChatCreatorAfterLeave.peer = na7.j1(chat3);
                                                        final int i2 = currentAccount;
                                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                        hc hcVar = new hc((byte) 0);
                                                        final Activity activity = parentActivity;
                                                        connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, hcVar, new i8c() { // from class: ue
                                                            @Override // i8c
                                                            public final void a(Object obj, Object obj2) {
                                                                TLRPC.User user3 = (TLRPC.User) obj;
                                                                c01.this.c(false);
                                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                                sc7 sc7Var3 = sc7Var2;
                                                                if (user4 == null) {
                                                                    sc7Var3.k(z16 || zArr2[0]);
                                                                    return;
                                                                }
                                                                Activity activity2 = activity;
                                                                TLRPC.Chat chat4 = chat3;
                                                                kf kfVar = new kf(activity2, chat4, user4, i2, sc7Var3, wjbVar2, (byte) 0);
                                                                lf lfVar = new lf(sc7Var3, (byte) 0);
                                                                d dVar3 = dVar2;
                                                                if (dVar3 == null || dVar3.getParentActivity() == null || chat4 == null) {
                                                                    return;
                                                                }
                                                                Context context = dVar3.getContext();
                                                                TLRPC.User f3 = y6c.h(dVar3.getCurrentAccount()).f();
                                                                boolean V = hc2.V(chat4);
                                                                FrameLayout frameLayout = new FrameLayout(context);
                                                                frameLayout.setClipToPadding(false);
                                                                frameLayout.setClipChildren(false);
                                                                be0 be0Var2 = new be0(context);
                                                                pb0 pb0Var7 = new pb0((wjb) null);
                                                                pb0Var7.q(f3);
                                                                be0Var2.setRoundRadius(gl.L(30.0f));
                                                                be0Var2.f(f3, pb0Var7);
                                                                frameLayout.addView(be0Var2, nme.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                                ImageView imageView = new ImageView(context);
                                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                                zkb.s(imageView, bkb.c7, dVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                                frameLayout.addView(imageView, nme.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                                qh qhVar = new qh(context);
                                                                pb0 pb0Var8 = new pb0((wjb) null);
                                                                pb0Var8.q(user4);
                                                                qhVar.setRoundRadius(gl.L(30.0f));
                                                                qhVar.f(user4, pb0Var8);
                                                                frameLayout.addView(qhVar, nme.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                                be0 be0Var3 = new be0(context);
                                                                pb0 pb0Var9 = new pb0((wjb) null);
                                                                pb0Var9.p(chat4);
                                                                be0Var3.setRoundRadius(gl.L(12.0f));
                                                                be0Var3.f(chat4, pb0Var9);
                                                                frameLayout.addView(be0Var3, nme.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                                hd hdVar5 = alertDialog$Builder2.a;
                                                                hdVar5.P0 = -1.0f;
                                                                hdVar5.W = frameLayout;
                                                                hdVar5.S = k96.M0(V ? 2131748808 : 2131748800, null);
                                                                hdVar5.U = gl.T2(k96.a0(null, null, V ? 2131748809 : 2131748801, l7c.q(user4), chat4.title));
                                                                alertDialog$Builder2.g(k96.M0(2131754207, null), new l0(kfVar, (byte) 11));
                                                                alertDialog$Builder2.h(k96.M0(2131752577, null), null);
                                                                alertDialog$Builder2.j(k96.M0(V ? 2131748812 : 2131748798, null), new l0(lfVar, (byte) 12));
                                                                hdVar5.show();
                                                                View c = hdVar5.c(-1);
                                                                if (c instanceof TextView) {
                                                                    zkb.X((TextView) c, bkb.p7, null);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    sc7Var2 = sc7Var2;
                                                }
                                                if (!z16 && !zArr2[0]) {
                                                    z17 = false;
                                                }
                                                sc7Var2.k(z17);
                                            }
                                        });
                                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                        dVar.showDialog(hdVar322);
                                        textView = (TextView) hdVar322.c(-1);
                                        if (textView == null) {
                                        }
                                    } else {
                                        hdVar = hdVar2;
                                        pb0Var2 = pb0Var;
                                    }
                                } else {
                                    hdVar = hdVar2;
                                    pb0Var2 = pb0Var;
                                    f = 10.0f;
                                }
                                f2 = 8.0f;
                                if (z2) {
                                }
                                if (z4) {
                                }
                                if (!z8) {
                                }
                                ag2 ag2Var32 = new ag2(1, wjbVar, parentActivity);
                                ag2VarArr[0] = ag2Var32;
                                ag2Var32.setBackground(bkb.L0(false));
                                if (!z8) {
                                }
                                ag2VarArr[0].setMultiline(z10);
                                pb0Var3 = pb0Var2;
                                ag2VarArr[0].setPadding(!k96.a0 ? gl.L(16.0f) : gl.L(f2), gl.L(f), !k96.a0 ? gl.L(f2) : gl.L(16.0f), gl.L(f));
                                phVar.addView(ag2VarArr[0], nme.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                qg qgVar2 = new qg(z8, chat, alertDialog$Builder, zArr);
                                ag2VarArr[0].setOnClickListener(new t(zArr, qgVar2, (byte) 13));
                                if (z5) {
                                }
                                z9 = z8;
                                if (user == null) {
                                }
                                if (z2) {
                                }
                                if (!z2) {
                                }
                                hd hdVar3222 = hdVar;
                                alertDialog$Builder.j(M0, new ed() { // from class: rg
                                    @Override // ed
                                    public final void u(hd hdVar4, int i) {
                                        boolean z15 = z11;
                                        final boolean z16 = z2;
                                        final boolean[] zArr2 = zArr;
                                        final sc7 sc7Var2 = sc7Var;
                                        boolean z17 = true;
                                        if (!z15 && !z16 && !z3) {
                                            final TLRPC.User user2 = user;
                                            boolean C = l7c.C(user2);
                                            final d dVar2 = dVar;
                                            final boolean z18 = z;
                                            final TLRPC.Chat chat3 = chat;
                                            final boolean z19 = z4;
                                            final boolean z20 = z6;
                                            final wjb wjbVar2 = wjbVar;
                                            if (C) {
                                                ij.s(dVar2, z18, true, chat3, user2, false, z19, zArr2[0], z20, sc7Var2, wjbVar2);
                                                return;
                                            }
                                            if (user2 != null && zArr2[0]) {
                                                ad7 Y = ad7.Y(dVar2.getCurrentAccount());
                                                Y.a.c(new dc7(Y, user2.id, new uc7() { // from class: te
                                                    @Override // uc7
                                                    public final void a(int i2) {
                                                        boolean[] zArr3 = zArr2;
                                                        sc7 sc7Var3 = sc7Var2;
                                                        if (i2 < 50) {
                                                            sc7Var3.k(zArr3[0]);
                                                        } else {
                                                            ij.s(d.this, z18, true, chat3, user2, false, z19, zArr3[0], z20, sc7Var3, wjbVar2);
                                                        }
                                                    }
                                                }, (byte) 0));
                                                return;
                                            }
                                            if (hc2.T(chat3) && chat3.creator && !zArr2[0]) {
                                                final c01 g = alertDialog$Builder.a.g(-1, true, true);
                                                g.d();
                                                TLRPC.TL_messages_getFutureChatCreatorAfterLeave tL_messages_getFutureChatCreatorAfterLeave = new TLRPC.TL_messages_getFutureChatCreatorAfterLeave();
                                                tL_messages_getFutureChatCreatorAfterLeave.peer = na7.j1(chat3);
                                                final int i2 = currentAccount;
                                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                                hc hcVar = new hc((byte) 0);
                                                final Activity activity = parentActivity;
                                                connectionsManager.sendRequestTyped(tL_messages_getFutureChatCreatorAfterLeave, hcVar, new i8c() { // from class: ue
                                                    @Override // i8c
                                                    public final void a(Object obj, Object obj2) {
                                                        TLRPC.User user3 = (TLRPC.User) obj;
                                                        c01.this.c(false);
                                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                        sc7 sc7Var3 = sc7Var2;
                                                        if (user4 == null) {
                                                            sc7Var3.k(z16 || zArr2[0]);
                                                            return;
                                                        }
                                                        Activity activity2 = activity;
                                                        TLRPC.Chat chat4 = chat3;
                                                        kf kfVar = new kf(activity2, chat4, user4, i2, sc7Var3, wjbVar2, (byte) 0);
                                                        lf lfVar = new lf(sc7Var3, (byte) 0);
                                                        d dVar3 = dVar2;
                                                        if (dVar3 == null || dVar3.getParentActivity() == null || chat4 == null) {
                                                            return;
                                                        }
                                                        Context context = dVar3.getContext();
                                                        TLRPC.User f3 = y6c.h(dVar3.getCurrentAccount()).f();
                                                        boolean V = hc2.V(chat4);
                                                        FrameLayout frameLayout = new FrameLayout(context);
                                                        frameLayout.setClipToPadding(false);
                                                        frameLayout.setClipChildren(false);
                                                        be0 be0Var2 = new be0(context);
                                                        pb0 pb0Var7 = new pb0((wjb) null);
                                                        pb0Var7.q(f3);
                                                        be0Var2.setRoundRadius(gl.L(30.0f));
                                                        be0Var2.f(f3, pb0Var7);
                                                        frameLayout.addView(be0Var2, nme.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                        ImageView imageView = new ImageView(context);
                                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                        zkb.s(imageView, bkb.c7, dVar3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                        frameLayout.addView(imageView, nme.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                        qh qhVar = new qh(context);
                                                        pb0 pb0Var8 = new pb0((wjb) null);
                                                        pb0Var8.q(user4);
                                                        qhVar.setRoundRadius(gl.L(30.0f));
                                                        qhVar.f(user4, pb0Var8);
                                                        frameLayout.addView(qhVar, nme.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                        be0 be0Var3 = new be0(context);
                                                        pb0 pb0Var9 = new pb0((wjb) null);
                                                        pb0Var9.p(chat4);
                                                        be0Var3.setRoundRadius(gl.L(12.0f));
                                                        be0Var3.f(chat4, pb0Var9);
                                                        frameLayout.addView(be0Var3, nme.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                                        hd hdVar5 = alertDialog$Builder2.a;
                                                        hdVar5.P0 = -1.0f;
                                                        hdVar5.W = frameLayout;
                                                        hdVar5.S = k96.M0(V ? 2131748808 : 2131748800, null);
                                                        hdVar5.U = gl.T2(k96.a0(null, null, V ? 2131748809 : 2131748801, l7c.q(user4), chat4.title));
                                                        alertDialog$Builder2.g(k96.M0(2131754207, null), new l0(kfVar, (byte) 11));
                                                        alertDialog$Builder2.h(k96.M0(2131752577, null), null);
                                                        alertDialog$Builder2.j(k96.M0(V ? 2131748812 : 2131748798, null), new l0(lfVar, (byte) 12));
                                                        hdVar5.show();
                                                        View c = hdVar5.c(-1);
                                                        if (c instanceof TextView) {
                                                            zkb.X((TextView) c, bkb.p7, null);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            sc7Var2 = sc7Var2;
                                        }
                                        if (!z16 && !zArr2[0]) {
                                            z17 = false;
                                        }
                                        sc7Var2.k(z17);
                                    }
                                });
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                dVar.showDialog(hdVar3222);
                                textView = (TextView) hdVar3222.c(-1);
                                if (textView == null) {
                                }
                            }

                            public static hd s0(d dVar, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
                                TextView textView;
                                hd M = M(dVar.getContext(), dVar.getResourceProvider(), str, charSequence, str2, runnable);
                                dVar.showDialog(M);
                                if (z && (textView = (TextView) M.c(-1)) != null) {
                                    zkb.X(textView, bkb.p7, null);
                                }
                                return M;
                            }

                            public static hd t(Activity activity, final long j, final long j2, final int i, final Runnable runnable, wjb wjbVar) {
                                int i2;
                                byte b;
                                SharedPreferences sharedPreferences = na7.q1(y6c.t0).W3;
                                final String p = im7.p(j, j2, false);
                                if (j != 0) {
                                    StringBuilder sb = new StringBuilder("color_");
                                    sb.append(p);
                                    i2 = sharedPreferences.contains(sb.toString()) ? ls6.g("color_", p, sharedPreferences, -16776961) : cf3.y(j) ? sharedPreferences.getInt("GroupLed", -16776961) : sharedPreferences.getInt("MessagesLed", -16776961);
                                } else {
                                    i2 = i == 1 ? sharedPreferences.getInt("MessagesLed", -16776961) : i == 0 ? sharedPreferences.getInt("GroupLed", -16776961) : i == 3 ? sharedPreferences.getInt("StoriesLed", -16776961) : (i == 5 || i == 4) ? sharedPreferences.getInt("ReactionsLed", -16776961) : sharedPreferences.getInt("ChannelLed", -16776961);
                                }
                                LinearLayout m = ir2.m(activity, 1);
                                String[] strArr = {k96.M0(2131752000, null), k96.M0(2131752005, null), k96.M0(2131751994, null), k96.M0(2131752006, null), k96.M0(2131752007, null), k96.M0(2131752008, null), k96.M0(2131751996, null), k96.M0(2131752001, null), k96.M0(2131751995, null)};
                                final int[] iArr = {i2};
                                int i3 = 0;
                                while (true) {
                                    b = 9;
                                    if (i3 >= 9) {
                                        break;
                                    }
                                    wy8 wy8Var = new wy8(activity, wjbVar);
                                    wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                                    wy8Var.setTag(Integer.valueOf(i3));
                                    int i4 = chb.e[i3];
                                    wy8Var.a(i4, i4);
                                    wy8Var.b(strArr[i3], i2 == chb.f[i3]);
                                    m.addView(wy8Var);
                                    wy8Var.setOnClickListener(new ze(m, iArr));
                                    i3++;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
                                String M0 = k96.M0(2131748797, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                alertDialog$Builder.n(m);
                                alertDialog$Builder.j(k96.M0(2131745358, null), new ed() { // from class: sg
                                    @Override // ed
                                    public final void u(hd hdVar2, int i5) {
                                        SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
                                        long j3 = j;
                                        int[] iArr2 = iArr;
                                        if (j3 != 0) {
                                            edit.putInt(b00.h("color_", p), iArr2[0]);
                                            im7.n(y6c.t0).f(j3, j2);
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
                                            im7.n(y6c.t0).g(i6);
                                        }
                                        edit.commit();
                                        runnable.run();
                                    }
                                });
                                alertDialog$Builder.h(k96.M0(2131748796, null), new gf(j, i, (Object) runnable, (byte) 1));
                                if (j != 0) {
                                    alertDialog$Builder.g(k96.M0(2131751588, null), new o(p, runnable, b));
                                }
                                return hdVar;
                            }

                            public static void t0(String str, d dVar) {
                                if (str == null) {
                                    return;
                                }
                                Toast.makeText((dVar == null || dVar.getParentActivity() == null) ? a.b : dVar.getParentActivity(), str, 1).show();
                            }

                            public static void u(d dVar, String str, String str2, String str3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                                String M0 = k96.M0(2131751776, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.a0("ContactNotRegistered", null, 2131751777, qu2.m(0, str, str2));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131748982, null), new dg((byte) 0, str3, dVar));
                                dVar.showDialog(hdVar);
                            }

                            public static hd u0(Context context, String str, boolean z) {
                                if (context == null || str == null) {
                                    return null;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                String M0 = k96.M0(R.string.AppName, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = str;
                                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                if (z) {
                                    alertDialog$Builder.g(k96.M0(2131743582, null), new od(context, (byte) 1));
                                }
                                return alertDialog$Builder.o();
                            }

                            public static AlertDialog$Builder v(Activity activity, final uc7 uc7Var) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                                int i = bkb.K5;
                                final byte b = 0;
                                alertDialog$Builder.l(R.raw.permission_request_contacts, 72, bkb.w0(null, i, false), null);
                                alertDialog$Builder.m(i, null);
                                alertDialog$Builder.a.U = gl.T2(k96.M0(2131751762, null));
                                alertDialog$Builder.j(k96.M0(2131751761, null), new ed() { // from class: vg
                                    @Override // ed
                                    public final void u(hd hdVar, int i2) {
                                        byte b2 = b;
                                        uc7 uc7Var2 = uc7Var;
                                        switch (b2) {
                                            case 0:
                                                uc7Var2.a(1);
                                                break;
                                            default:
                                                uc7Var2.a(0);
                                                break;
                                        }
                                    }
                                });
                                final byte b2 = 1;
                                alertDialog$Builder.g(k96.M0(2131751760, null), new ed() { // from class: vg
                                    @Override // ed
                                    public final void u(hd hdVar, int i2) {
                                        byte b22 = b2;
                                        uc7 uc7Var2 = uc7Var;
                                        switch (b22) {
                                            case 0:
                                                uc7Var2.a(1);
                                                break;
                                            default:
                                                uc7Var2.a(0);
                                                break;
                                        }
                                    }
                                });
                                return alertDialog$Builder;
                            }

                            public static void v0(hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(2, hn7Var2.getValue());
                                calendar.set(1, hn7Var3.getValue());
                                hn7Var.setMinValue(1);
                                hn7Var.setMaxValue(calendar.getActualMaximum(5));
                            }

                            public static AlertDialog$Builder w(Context context, int i, int i2, int i3, int i4, int i5, int i6, String str, final boolean z, zf zfVar) {
                                if (context == null) {
                                    return null;
                                }
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                final hn7 hn7Var = new hn7(context, null);
                                final hn7 hn7Var2 = new hn7(context, null);
                                final hn7 hn7Var3 = new hn7(context, null);
                                linearLayout.addView(hn7Var2, nme.l(0.3f, 0, -2));
                                final byte b = 0;
                                hn7Var2.setOnScrollListener(new en7() { // from class: nf
                                    @Override // en7
                                    public final void b(int i7) {
                                        byte b2 = b;
                                        hn7 hn7Var4 = hn7Var3;
                                        hn7 hn7Var5 = hn7Var;
                                        hn7 hn7Var6 = hn7Var2;
                                        boolean z2 = z;
                                        switch (b2) {
                                            case 0:
                                                if (z2 && i7 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i7 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i7 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                hn7Var.setMinValue(0);
                                hn7Var.setMaxValue(11);
                                linearLayout.addView(hn7Var, nme.l(0.3f, 0, -2));
                                hn7Var.setFormatter(new c((byte) 24));
                                hn7Var.setOnValueChangedListener(new of(hn7Var2, hn7Var, hn7Var3, (byte) 0));
                                final byte b2 = 1;
                                hn7Var.setOnScrollListener(new en7() { // from class: nf
                                    @Override // en7
                                    public final void b(int i7) {
                                        byte b22 = b2;
                                        hn7 hn7Var4 = hn7Var3;
                                        hn7 hn7Var5 = hn7Var;
                                        hn7 hn7Var6 = hn7Var2;
                                        boolean z2 = z;
                                        switch (b22) {
                                            case 0:
                                                if (z2 && i7 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i7 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i7 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(System.currentTimeMillis());
                                int i7 = calendar.get(1);
                                hn7Var3.setMinValue(i + i7);
                                hn7Var3.setMaxValue(i2 + i7);
                                hn7Var3.setValue(i7 + i3);
                                linearLayout.addView(hn7Var3, nme.l(0.4f, 0, -2));
                                hn7Var3.setOnValueChangedListener(new of(hn7Var2, hn7Var, hn7Var3, (byte) 1));
                                final byte b3 = 2;
                                hn7Var3.setOnScrollListener(new en7() { // from class: nf
                                    @Override // en7
                                    public final void b(int i72) {
                                        byte b22 = b3;
                                        hn7 hn7Var4 = hn7Var3;
                                        hn7 hn7Var5 = hn7Var;
                                        hn7 hn7Var6 = hn7Var2;
                                        boolean z2 = z;
                                        switch (b22) {
                                            case 0:
                                                if (z2 && i72 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (z2 && i72 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (z2 && i72 == 0) {
                                                    ij.d(hn7Var6, hn7Var5, hn7Var4);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                v0(hn7Var2, hn7Var, hn7Var3);
                                if (z) {
                                    d(hn7Var2, hn7Var, hn7Var3);
                                }
                                if (i4 != -1) {
                                    hn7Var2.setValue(i4);
                                    hn7Var.setValue(i5);
                                    hn7Var3.setValue(i6);
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                alertDialog$Builder.a.S = str;
                                alertDialog$Builder.n(linearLayout);
                                alertDialog$Builder.j(k96.M0(2131745358, null), new pf(z, hn7Var2, hn7Var, hn7Var3, zfVar));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                return alertDialog$Builder;
                            }

                            public static void x(Context context, String str, String str2, long j, gj gjVar) {
                                Object obj;
                                wb wbVar;
                                if (context == null) {
                                    return;
                                }
                                int w0 = bkb.w0(null, bkb.i5, false);
                                int w02 = bkb.w0(null, bkb.g5, false);
                                bkb.w0(null, bkb.zj, false);
                                bkb.w0(null, bkb.Dj, false);
                                bkb.w0(null, bkb.D8, false);
                                bkb.w0(null, bkb.F8, false);
                                bkb.w0(null, bkb.h6, false);
                                int w03 = bkb.w0(null, bkb.Ii, false);
                                int w04 = bkb.w0(null, bkb.Ei, false);
                                int w05 = bkb.w0(null, bkb.Gi, false);
                                i4d i4dVar = new i4d(context, null);
                                Object obj2 = i4dVar.a;
                                ((fx0) obj2).w0 = false;
                                hn7 hn7Var = new hn7(context, null);
                                hn7Var.setTextColor(w0);
                                hn7Var.setTextOffset(gl.L(10.0f));
                                hn7Var.setItemCount(5);
                                ei eiVar = new ei(context, null);
                                eiVar.setItemCount(5);
                                eiVar.setTextColor(w0);
                                eiVar.setTextOffset(-gl.L(10.0f));
                                gi giVar = new gi(context, null);
                                giVar.setItemCount(5);
                                giVar.setTextColor(w0);
                                giVar.setTextOffset(-gl.L(34.0f));
                                zh zhVar = new zh(context, hn7Var, eiVar, giVar, (byte) 2);
                                zhVar.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(context);
                                zhVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(context);
                                textView.setText(str);
                                textView.setTextColor(w0);
                                textView.setTextSize(1, 20.0f);
                                textView.setTypeface(gl.o());
                                frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new p8((byte) 5));
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                                Calendar calendar = Calendar.getInstance();
                                wb wbVar2 = new wb(context, (byte) 2);
                                linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
                                hn7Var.setMinValue(0);
                                hn7Var.setMaxValue(365);
                                hn7Var.setWrapSelectorWheel(false);
                                hn7Var.setFormatter(new c((byte) 27));
                                ie ieVar = new ie((Object) hn7Var, (Object) eiVar, (Object) giVar, (byte) 2);
                                hn7Var.setOnValueChangedListener(ieVar);
                                eiVar.setMinValue(0);
                                eiVar.setMaxValue(23);
                                linearLayout.addView(eiVar, nme.l(0.2f, 0, kk7.s4));
                                eiVar.setFormatter(new c((byte) 28));
                                eiVar.setOnValueChangedListener(ieVar);
                                giVar.setMinValue(0);
                                giVar.setMaxValue(59);
                                giVar.setValue(0);
                                giVar.setFormatter(new c((byte) 29));
                                linearLayout.addView(giVar, nme.l(0.3f, 0, kk7.s4));
                                giVar.setOnValueChangedListener(ieVar);
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
                                        giVar.setValue(calendar.get(12));
                                        eiVar.setValue(calendar.get(11));
                                        hn7Var.setValue(timeInMillis);
                                    }
                                }
                                g(null, null, 0L, 0L, 0, hn7Var, eiVar, giVar);
                                wb wbVar3 = wbVar;
                                wbVar3.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                wbVar3.setGravity(17);
                                wbVar3.setTextColor(w03);
                                wbVar3.setTextSize(1, 14.0f);
                                wbVar3.setTypeface(gl.o());
                                int L = gl.L(8.0f);
                                wbVar3.setBackgroundDrawable(bkb.i0(L, L, L, L, w04, w05, w05));
                                wbVar3.setText(str2);
                                zhVar.addView(wbVar3, nme.t(-1, 48, 83, 16, 15, 16, 16));
                                wbVar3.setOnClickListener(new ef(hn7Var, eiVar, giVar, calendar, gjVar, i4dVar, (byte) 1));
                                fx0 fx0Var = (fx0) obj;
                                fx0Var.O = zhVar;
                                fx0Var.show();
                                fx0Var.s0(w02);
                                fx0Var.L(w02);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:412:0x0210, code lost:
                            
                                if (java.lang.Math.abs(r9 - r4.k.date) > 86400) goto L95;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[ADDED_TO_REGION] */
                            /* JADX WARN: Type inference failed for: r12v11 */
                            /* JADX WARN: Type inference failed for: r12v12, types: [ed, java.lang.String, wjb] */
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
                            public static void y(final d dVar, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final k27 k27Var, final SparseArray[] sparseArrayArr, final f27 f27Var, final int i, final int i2, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, final vm1 vm1Var, final wjb wjbVar) {
                                Activity parentActivity;
                                final vm1 vm1Var2;
                                final int i3;
                                boolean z;
                                boolean z2;
                                boolean z3;
                                int i4;
                                int i5;
                                boolean z4;
                                int i6;
                                hd hdVar;
                                boolean z5;
                                int i7;
                                boolean z6;
                                boolean z7;
                                boolean z8;
                                ag2 ag2Var;
                                String str;
                                int i8;
                                TLRPC.MessageAction messageAction;
                                hd hdVar2;
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
                                k27 k27Var2 = k27Var;
                                boolean z11 = i2 == 1;
                                boolean z12 = i2 == 3;
                                if (dVar != null) {
                                    if ((user == null && chat == null && encryptedChat == null) || (parentActivity = dVar.getParentActivity()) == null) {
                                        return;
                                    }
                                    int currentAccount = dVar.getCurrentAccount();
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wjbVar, parentActivity);
                                    float f = vm1Var != null ? 0.5f : 0.6f;
                                    hd hdVar3 = alertDialog$Builder2.a;
                                    hdVar3.R0 = f;
                                    int size = f27Var != null ? f27Var.d.size() : k27Var2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
                                    long E = encryptedChat != null ? cf3.E(encryptedChat.id) : user != null ? user.id : -chat.id;
                                    if (z11) {
                                        if (k27Var2 == null || (message = k27Var2.k) == null) {
                                            i12 = currentAccount;
                                        } else {
                                            i12 = currentAccount;
                                            i16 = message.schedule_repeat_period;
                                            if (i16 > 0) {
                                                i15 = message.date;
                                                i14 = i16;
                                                i13 = i15;
                                                if (i13 <= 0 && i14 > 0) {
                                                    String a0 = k96.a0(null, null, 2131748325, Integer.valueOf(i14));
                                                    if (i14 == 31536000) {
                                                        a0 = k96.M0(2131748321, null);
                                                    } else if (i14 >= 2592000) {
                                                        a0 = k96.G(i14 / 2592000, "MessageScheduledRepeatDeletePostponeMonths", new Object[0]);
                                                    } else if (i14 >= 604800) {
                                                        a0 = k96.G(i14 / 604800, "MessageScheduledRepeatDeletePostponeWeeks", new Object[0]);
                                                    } else if (i14 >= 86400) {
                                                        a0 = k96.G(i14 / 86400, "MessageScheduledRepeatDeletePostponeDays", new Object[0]);
                                                    }
                                                    String str4 = a0;
                                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, wjbVar, parentActivity);
                                                    String M0 = k96.M0(2131748319, null);
                                                    hd hdVar4 = alertDialog$Builder3.a;
                                                    hdVar4.S = M0;
                                                    hdVar4.U = k96.M0(2131748320, null);
                                                    final int i17 = i12;
                                                    alertDialog$Builder3.g(str4, new ed() { // from class: nh
                                                        @Override // ed
                                                        public final void u(hd hdVar5, int i18) {
                                                            f27 f27Var2 = f27.this;
                                                            int i19 = i17;
                                                            d dVar2 = dVar;
                                                            int i20 = i13;
                                                            int i21 = i14;
                                                            if (f27Var2 != null) {
                                                                ArrayList arrayList2 = f27Var2.d;
                                                                if (!arrayList2.isEmpty()) {
                                                                    z3a.B(i19).t((k27) arrayList2.get(0), dVar2, i20 + i21, i21);
                                                                    return;
                                                                }
                                                            }
                                                            z3a.B(i19).t(k27Var, dVar2, i20 + i21, i21);
                                                        }
                                                    });
                                                    final long j2 = E;
                                                    final boolean z13 = z12;
                                                    alertDialog$Builder3.h(k96.M0(2131748332, null), new ed() { // from class: rd
                                                        @Override // ed
                                                        public final void u(hd hdVar5, int i18) {
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
                                                            long e = z14 ? y6c.h(i21).e() : j2;
                                                            k27 k27Var3 = k27Var;
                                                            TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                            long j5 = j;
                                                            int i22 = i;
                                                            int i23 = i2;
                                                            ArrayList arrayList5 = null;
                                                            if (k27Var3 != null) {
                                                                ArrayList arrayList6 = new ArrayList();
                                                                f27 f27Var2 = f27Var;
                                                                if (f27Var2 != null) {
                                                                    ArrayList arrayList7 = f27Var2.d;
                                                                    int i24 = 0;
                                                                    while (i24 < arrayList7.size()) {
                                                                        k27 k27Var4 = (k27) arrayList7.get(i24);
                                                                        arrayList6.add(Integer.valueOf(k27Var4.e1()));
                                                                        if (encryptedChat2 != null) {
                                                                            arrayList4 = arrayList6;
                                                                            if (k27Var4.k.random_id == 0 || k27Var4.D == 10) {
                                                                                i20 = i21;
                                                                                j4 = e;
                                                                            } else {
                                                                                if (arrayList5 == null) {
                                                                                    arrayList5 = new ArrayList();
                                                                                }
                                                                                ArrayList arrayList8 = arrayList5;
                                                                                i20 = i21;
                                                                                j4 = e;
                                                                                arrayList8.add(Long.valueOf(k27Var4.k.random_id));
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
                                                                    arrayList6.add(Integer.valueOf(k27Var3.e1()));
                                                                    if (encryptedChat2 != null && k27Var3.k.random_id != 0 && k27Var3.D != 10) {
                                                                        ArrayList arrayList9 = new ArrayList();
                                                                        arrayList9.add(Long.valueOf(k27Var3.k.random_id));
                                                                        arrayList3 = arrayList9;
                                                                        na7.q1(i19).V(arrayList6, arrayList3, encryptedChat2, (j5 == 0 && (peer = k27Var3.k.peer_id) != null && peer.chat_id == (-j5)) ? j5 : j3, i22, true, i23);
                                                                    }
                                                                }
                                                                arrayList3 = arrayList5;
                                                                na7.q1(i19).V(arrayList6, arrayList3, encryptedChat2, (j5 == 0 && (peer = k27Var3.k.peer_id) != null && peer.chat_id == (-j5)) ? j5 : j3, i22, true, i23);
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
                                                                            k27 k27Var5 = (k27) sparseArrayArr2[i25].valueAt(i27);
                                                                            long j7 = k27Var5.k.random_id;
                                                                            if (j7 != 0 && k27Var5.D != 10) {
                                                                                arrayList11.add(Long.valueOf(j7));
                                                                            }
                                                                        }
                                                                        arrayList2 = arrayList11;
                                                                    } else {
                                                                        arrayList2 = null;
                                                                    }
                                                                    na7.q1(i21).V(arrayList10, arrayList2, encryptedChat2, (i25 != 1 || j5 == 0) ? j6 : j5, i22, true, i23);
                                                                    sparseArrayArr2[i25].clear();
                                                                    i25--;
                                                                }
                                                            }
                                                            runnable.run();
                                                        }
                                                    });
                                                    alertDialog$Builder3.j(k96.M0(2131752577, null), null);
                                                    alertDialog$Builder3.c(-2);
                                                    alertDialog$Builder3.c(-3);
                                                    final byte b = 1;
                                                    hdVar4.O = new DialogInterface.OnDismissListener() { // from class: qd
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b2 = b;
                                                            vm1 vm1Var3 = vm1Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (vm1Var3 != null) {
                                                                        vm1Var3.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    if (vm1Var3 != null) {
                                                                        vm1Var3.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    vm1Var3.run();
                                                                    break;
                                                            }
                                                        }
                                                    };
                                                    alertDialog$Builder3.o();
                                                    return;
                                                }
                                                k27Var2 = k27Var;
                                                vm1Var2 = vm1Var;
                                                i3 = i12;
                                            }
                                        }
                                        if (f27Var != null) {
                                            ArrayList arrayList2 = f27Var.d;
                                            if (!arrayList2.isEmpty() && arrayList2.get(0) != null && ((k27) arrayList2.get(0)).k != null && ((k27) arrayList2.get(0)).k.schedule_repeat_period > 0) {
                                                i15 = ((k27) arrayList2.get(0)).k.date;
                                                i16 = ((k27) arrayList2.get(0)).k.schedule_repeat_period;
                                                i14 = i16;
                                                i13 = i15;
                                                if (i13 <= 0) {
                                                }
                                                k27Var2 = k27Var;
                                                vm1Var2 = vm1Var;
                                                i3 = i12;
                                            }
                                        }
                                        i13 = 0;
                                        i14 = 0;
                                        if (i13 <= 0) {
                                        }
                                        k27Var2 = k27Var;
                                        vm1Var2 = vm1Var;
                                        i3 = i12;
                                    } else {
                                        vm1Var2 = vm1Var;
                                        i3 = currentAccount;
                                    }
                                    final long j3 = E;
                                    boolean z14 = z12;
                                    int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                                    na7.q1(i3).k4.h.g(TimeUnit.SECONDS);
                                    if (k27Var2 != null) {
                                        z3 = !k27Var2.T2() || Math.abs(currentTime - k27Var2.k.date) > 86400;
                                        if (k27Var2.P3()) {
                                            TLRPC.Message message2 = k27Var2.k;
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
                                                    k27 k27Var3 = (k27) sparseArrayArr[i4].valueAt(i19);
                                                    if (k27Var3.T2()) {
                                                        i5 = i19;
                                                    } else {
                                                        i5 = i19;
                                                    }
                                                    z16 = true;
                                                    if (k27Var3.P3()) {
                                                        TLRPC.Message message3 = k27Var3.k;
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
                                    if (f27Var != null) {
                                        ArrayList arrayList3 = f27Var.d;
                                        z4 = z3;
                                        int i20 = 0;
                                        while (i20 < arrayList3.size()) {
                                            k27 k27Var4 = (k27) arrayList3.get(i20);
                                            if (k27Var4.P3()) {
                                                TLRPC.Message message4 = k27Var4.k;
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
                                    boolean z19 = user != null && na7.q1(i3).V2;
                                    int i21 = user != null ? na7.q1(i3).U2 : na7.q1(i3).T2;
                                    boolean z20 = encryptedChat == null && user != null && z19 && i21 == Integer.MAX_VALUE;
                                    boolean z21 = z19;
                                    if (chat == null || !chat.megagroup || z11 || z14) {
                                        i6 = i3;
                                        hdVar = hdVar3;
                                        if (z11 || z14 || hc2.T(chat) || encryptedChat != null) {
                                            z5 = z14;
                                            i7 = 0;
                                            z6 = false;
                                            z7 = false;
                                        } else {
                                            int i22 = currentTime;
                                            boolean z22 = z14;
                                            if ((user == null || user.id == y6c.h(i6).e() || (user.bot && !user.support)) && chat == null) {
                                                z5 = z22;
                                                z8 = false;
                                                i7 = 0;
                                            } else if (k27Var2 != null) {
                                                i7 = (k27Var2.m4() || !((messageAction = k27Var2.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(k27Var2.N3() || z21 || hc2.N(chat)) || i22 - k27Var2.k.date > i21)) ? 0 : 1;
                                                z8 = !k27Var2.N3();
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
                                                        k27 k27Var5 = (k27) sparseArrayArr[i23].valueAt(i25);
                                                        int i26 = i25;
                                                        TLRPC.MessageAction messageAction3 = k27Var5.k.action;
                                                        int i27 = i22;
                                                        if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((k27Var5.N3() || z21 || (chat != null && hc2.w(2, chat))) && i27 - k27Var5.k.date <= i21)) {
                                                            i24++;
                                                            if (!z23 && !k27Var5.N3()) {
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
                                            if (i7 <= 0 || !z4 || (user != null && l7c.y(user))) {
                                                z7 = z8;
                                                z6 = false;
                                            } else {
                                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                                ag2 ag2Var2 = new ag2(1, wjbVar, parentActivity);
                                                ag2Var2.setBackgroundDrawable(bkb.L0(false));
                                                if (z20) {
                                                    ag2Var = ag2Var2;
                                                    ag2Var.e(k96.a0("DeleteMessagesOptionAlso", null, 2131751513, l7c.k(user, true)), "", false, false, false);
                                                } else {
                                                    ag2Var = ag2Var2;
                                                    if (chat == null) {
                                                        str = null;
                                                        i8 = 2131751514;
                                                    } else if (z8 || i7 == size) {
                                                        ag2Var.e(k96.M0(2131751528, null), "", false, false, false);
                                                    } else {
                                                        i8 = 2131751514;
                                                        str = null;
                                                    }
                                                    ag2Var.e(k96.M0(i8, str), "", false, false, false);
                                                }
                                                ag2 ag2Var3 = ag2Var;
                                                ag2Var3.setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                                                frameLayout.addView(ag2Var3, nme.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                                ag2Var3.setOnClickListener(new ge(zArr, (byte) 5));
                                                alertDialog$Builder2.n(frameLayout);
                                                hdVar.H = (byte) 9;
                                                z7 = z8;
                                                z6 = true;
                                            }
                                        }
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        if (k27Var2 != null) {
                                            TLRPC.MessageAction messageAction4 = k27Var2.k.action;
                                            if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                                                if (f27Var != null) {
                                                    arrayList4.addAll(f27Var.d);
                                                } else {
                                                    arrayList4.add(k27Var2);
                                                }
                                            }
                                            i10 = (!k27Var2.m4() && k27.B0(k27Var2.k) == j && ((messageAction2 = k27Var2.k.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && k27Var2.N3() && currentTime - k27Var2.k.date <= i21) ? 1 : 0;
                                        } else {
                                            int i28 = 1;
                                            int i29 = 0;
                                            while (i28 >= 0) {
                                                int i30 = 0;
                                                while (i30 < sparseArrayArr[i28].size()) {
                                                    k27 k27Var6 = (k27) sparseArrayArr[i28].valueAt(i30);
                                                    int i31 = i30;
                                                    if (i28 == 1 && k27Var6.N3()) {
                                                        TLRPC.Message message5 = k27Var6.k;
                                                        i11 = i28;
                                                        if (message5.action == null && currentTime - message5.date <= i21) {
                                                            i29++;
                                                        }
                                                    } else {
                                                        i11 = i28;
                                                    }
                                                    arrayList4.add(k27Var6);
                                                    i30 = i31 + 1;
                                                    i28 = i11;
                                                }
                                                i28--;
                                            }
                                            i10 = i29;
                                        }
                                        byte b2 = 0;
                                        ArrayList arrayList5 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new sd(b2)).mapToLong(new td(b2)).distinct().mapToObj(new LongFunction() { // from class: ud
                                            @Override // java.util.function.LongFunction
                                            public final Object apply(long j4) {
                                                int i32 = i3;
                                                return j4 > 0 ? na7.q1(i32).V1(Long.valueOf(j4)) : na7.q1(i32).K0(Long.valueOf(-j4));
                                            }
                                        }).filter(new sd((byte) 1)).filter(new vd((byte) 0, y6c.h(i3).e())).collect(Collectors.toCollection(new lm1((byte) 0)));
                                        if (!arrayList5.isEmpty()) {
                                            if (channelParticipantArr != null) {
                                                sd3 sd3Var = new sd3(dVar, chat, arrayList4, arrayList5, channelParticipantArr, j, i, i2, false, runnable);
                                                if (vm1Var2 != null) {
                                                    final byte b3 = 2;
                                                    sd3Var.I0 = new DialogInterface.OnDismissListener() { // from class: qd
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b22 = b3;
                                                            vm1 vm1Var3 = vm1Var2;
                                                            switch (b22) {
                                                                case 0:
                                                                    if (vm1Var3 != null) {
                                                                        vm1Var3.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    if (vm1Var3 != null) {
                                                                        vm1Var3.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    vm1Var3.run();
                                                                    break;
                                                            }
                                                        }
                                                    };
                                                }
                                                sd3Var.show();
                                                return;
                                            }
                                            final hd[] hdVarArr = {new hd(3, null, parentActivity)};
                                            final int size2 = arrayList5.size();
                                            TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                                            int[] iArr = new int[size2];
                                            int[] iArr2 = new int[1];
                                            int i32 = 0;
                                            while (i32 < size2) {
                                                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                                                tL_channels_getParticipant.channel = na7.g1(chat);
                                                tL_channels_getParticipant.participant = na7.i1((TLObject) arrayList5.get(i32));
                                                final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                                ArrayList arrayList6 = arrayList5;
                                                final vm1 vm1Var3 = vm1Var2;
                                                final int[] iArr3 = iArr;
                                                final int[] iArr4 = iArr2;
                                                final int i33 = i32;
                                                iArr3[i33] = ConnectionsManager.getInstance(i3).sendRequest(tL_channels_getParticipant, new RequestDelegate() { // from class: wd
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                        final int[] iArr5 = iArr4;
                                                        final int[] iArr6 = iArr3;
                                                        final int i34 = i33;
                                                        final TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                                        final int i35 = size2;
                                                        final hd[] hdVarArr2 = hdVarArr;
                                                        final d dVar2 = dVar;
                                                        final TLRPC.User user2 = user;
                                                        final TLRPC.Chat chat2 = chat;
                                                        final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                                        final TLRPC.ChatFull chatFull2 = chatFull;
                                                        final long j4 = j;
                                                        final k27 k27Var7 = k27Var;
                                                        final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                                        final f27 f27Var2 = f27Var;
                                                        final int i36 = i;
                                                        final int i37 = i2;
                                                        final Runnable runnable2 = runnable;
                                                        final vm1 vm1Var4 = vm1Var3;
                                                        final wjb wjbVar2 = wjbVar;
                                                        gl.d3(new Runnable() { // from class: jf
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                hd[] hdVarArr3 = hdVarArr2;
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
                                                                        hdVarArr3[0].dismiss();
                                                                    } catch (Throwable unused) {
                                                                    }
                                                                    hdVarArr3[0] = null;
                                                                    ij.y(dVar2, user2, chat2, encryptedChat2, chatFull2, j4, k27Var7, sparseArrayArr2, f27Var2, i36, i37, channelParticipantArr5, runnable2, vm1Var4, wjbVar2);
                                                                }
                                                            }
                                                        });
                                                    }
                                                });
                                                i32 = i33 + 1;
                                                vm1Var2 = vm1Var;
                                                size2 = size2;
                                                iArr = iArr3;
                                                channelParticipantArr2 = channelParticipantArr3;
                                                iArr2 = iArr4;
                                                arrayList5 = arrayList6;
                                                i3 = i3;
                                            }
                                            gl.e3(new i57((Object) hdVarArr, (Object) iArr, i3, (Object) vm1Var, (Object) dVar, (byte) 3), 1000L);
                                            return;
                                        }
                                        i6 = i3;
                                        if (i10 <= 0 || !z4) {
                                            hdVar = hdVar3;
                                            z10 = false;
                                        } else {
                                            FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                            ag2 ag2Var4 = new ag2(1, wjbVar, parentActivity);
                                            ag2Var4.setBackgroundDrawable(bkb.L0(false));
                                            ag2Var4.e(k96.M0(2131751514, null), "", false, false, false);
                                            ag2Var4.setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                                            frameLayout2.addView(ag2Var4, nme.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                            ag2Var4.setOnClickListener(new ge(zArr, (byte) 4));
                                            alertDialog$Builder2.n(frameLayout2);
                                            hdVar = hdVar3;
                                            hdVar.H = (byte) 9;
                                            z10 = true;
                                        }
                                        z6 = z10;
                                        z5 = z14;
                                        z7 = false;
                                        i7 = i10;
                                    }
                                    final boolean z24 = z5;
                                    hd hdVar5 = hdVar;
                                    int i34 = i7;
                                    final int i35 = i6;
                                    int i36 = size;
                                    ed edVar = new ed() { // from class: pd
                                        /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                                        /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
                                        /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
                                        /* JADX WARN: Type inference failed for: r3v13 */
                                        /* JADX WARN: Type inference failed for: r3v14, types: [boolean, byte, int] */
                                        /* JADX WARN: Type inference failed for: r3v15 */
                                        @Override // ed
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void u(hd hdVar6, int i37) {
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
                                            long e = z25 ? y6c.h(i41).e() : j3;
                                            k27 k27Var7 = k27Var;
                                            TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                            long j8 = j;
                                            int i42 = i;
                                            boolean[] zArr2 = zArr;
                                            int i43 = i2;
                                            ArrayList arrayList10 = null;
                                            if (k27Var7 != null) {
                                                ArrayList arrayList11 = new ArrayList();
                                                ArrayList arrayList12 = new ArrayList();
                                                f27 f27Var2 = f27Var;
                                                if (f27Var2 != null) {
                                                    ArrayList arrayList13 = f27Var2.d;
                                                    c = 0;
                                                    int i44 = 0;
                                                    while (i44 < arrayList13.size()) {
                                                        k27 k27Var8 = (k27) arrayList13.get(i44);
                                                        int i45 = i41;
                                                        if (k27.c3(k27Var8.k)) {
                                                            arrayList11.add(k27Var8);
                                                        } else {
                                                            arrayList12.add(Integer.valueOf(k27Var8.e1()));
                                                            if (encryptedChat2 != null) {
                                                                j7 = e;
                                                                if (k27Var8.k.random_id != 0 && k27Var8.D != 10) {
                                                                    if (arrayList10 == null) {
                                                                        arrayList10 = new ArrayList();
                                                                    }
                                                                    ArrayList arrayList14 = arrayList10;
                                                                    arrayList14.add(Long.valueOf(k27Var8.k.random_id));
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
                                                    if (k27.c3(k27Var7.k)) {
                                                        arrayList11.add(k27Var7);
                                                    } else {
                                                        arrayList12.add(Integer.valueOf(k27Var7.e1()));
                                                        if (encryptedChat2 != null && k27Var7.k.random_id != 0 && k27Var7.D != 10) {
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(Long.valueOf(k27Var7.k.random_id));
                                                            arrayList8 = arrayList15;
                                                            long j9 = (j8 == 0 && (peer = k27Var7.k.peer_id) != null && peer.chat_id == (-j8)) ? j8 : j4;
                                                            if (arrayList12.isEmpty()) {
                                                                r3 = c;
                                                                arrayList9 = arrayList11;
                                                                j5 = j9;
                                                                i39 = 1;
                                                                na7.q1(i38).V(arrayList12, arrayList8, encryptedChat2, j5, i42, zArr2[c], i43);
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
                                                                k27 k27Var9 = (k27) obj;
                                                                na7 q1 = na7.q1(i38);
                                                                ArrayList arrayList16 = new ArrayList();
                                                                arrayList16.add(Integer.valueOf(k27Var9.e1()));
                                                                if (j5 == 0 || !cf3.y(j5)) {
                                                                    j6 = 0;
                                                                } else {
                                                                    TLRPC.Chat K0 = q1.K0(Long.valueOf(-j5));
                                                                    j6 = hc2.T(K0) ? K0.id : 0L;
                                                                }
                                                                q1.m3(arrayList16, j5);
                                                                ad7 messagesStorage = q1.getMessagesStorage();
                                                                int P0 = k27Var9.P0();
                                                                messagesStorage.getClass();
                                                                vf6 vf6Var = new vf6(i39);
                                                                ArrayList arrayList17 = new ArrayList(i39);
                                                                arrayList17.add(Integer.valueOf(P0));
                                                                vf6Var.k(arrayList17, j5);
                                                                messagesStorage.H(new mn6((Object) messagesStorage, (Object) vf6Var, (boolean) r3, (byte) 3));
                                                                q1.getMessagesStorage().M0(j5, arrayList16, true, true, k27.c5(k27Var9.k) ? 9 : r3, i42);
                                                                q1.getMessagesStorage().O1(j5, j6, arrayList16, null);
                                                                kk7 notificationCenter = q1.getNotificationCenter();
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
                                                                notificationCenter.k(kk7.v, objArr);
                                                                if (!k27.c5(k27Var9.k) || k27Var9.a5()) {
                                                                    TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
                                                                    tL_deleteMessage.peer = q1.h1(k27.B0(k27Var9.k));
                                                                    TLRPC.Message message6 = k27Var9.k;
                                                                    tL_deleteMessage.receiver_id = q1.m1(message6 != null ? message6.ephemeralReceiverBotId : 0L);
                                                                    tL_deleteMessage.id = k27Var9.P0();
                                                                    q1.getConnectionsManager().sendRequestTyped(tL_deleteMessage, new np0(r3));
                                                                } else {
                                                                    TL_ephemeral.TL_deleteWelcomeMessage tL_deleteWelcomeMessage = new TL_ephemeral.TL_deleteWelcomeMessage();
                                                                    tL_deleteWelcomeMessage.peer = q1.h1(k27.B0(k27Var9.k));
                                                                    tL_deleteWelcomeMessage.id = k27Var9.P0();
                                                                    q1.getConnectionsManager().sendRequestTyped(tL_deleteWelcomeMessage, new np0(r3));
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
                                                            k27 k27Var10 = (k27) sparseArrayArr2[i47].valueAt(i49);
                                                            int i50 = i46;
                                                            long j11 = k27Var10.k.random_id;
                                                            if (j11 != 0 && k27Var10.D != 10) {
                                                                arrayList7.add(Long.valueOf(j11));
                                                            }
                                                            i49++;
                                                            i46 = i50;
                                                        }
                                                    } else {
                                                        arrayList7 = null;
                                                    }
                                                    int i51 = i46;
                                                    na7.q1(i41).V(arrayList18, arrayList7, encryptedChat2, (i47 != 1 || j8 == 0) ? j10 : j8, i42, zArr2[i51], i43);
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
                                            hdVar2 = hdVar5;
                                            hdVar2.S = k96.M0(2131743597, null);
                                        } else {
                                            hdVar2 = hdVar5;
                                            str2 = null;
                                            hdVar2.S = k96.a0(null, null, 2131743598, k96.G(i36, "messages", new Object[0]));
                                        }
                                    } else {
                                        hdVar2 = hdVar5;
                                        i9 = 1;
                                        i9 = 1;
                                        str2 = null;
                                        if (i36 == 1) {
                                            hdVar2.S = k96.M0(2131751484, null);
                                        } else {
                                            hdVar2.S = k96.a0(null, null, 2131751507, k96.G(i36, "messages", new Object[0]));
                                        }
                                    }
                                    if (!z24) {
                                        if (chat == null || !z7) {
                                            if (!z6 || z20 || i34 == i36) {
                                                if (chat == null || !chat.megagroup || z11) {
                                                    if (i36 == i9) {
                                                        hdVar2.U = k96.M0(2131754090, null);
                                                    } else {
                                                        hdVar2.U = k96.M0(2131754098, null);
                                                    }
                                                } else if (i36 == i9) {
                                                    hdVar2.U = k96.M0((k27Var == null || !k27.c3(k27Var.k)) ? 2131754089 : 2131754090, null);
                                                } else {
                                                    hdVar2.U = k96.M0(2131754097, null);
                                                }
                                            } else if (chat != null) {
                                                Object[] objArr = new Object[i9];
                                                objArr[0] = k96.G(i34, "messages", new Object[0]);
                                                hdVar2.U = k96.a0("DeleteMessagesTextGroup", null, 2131751509, objArr);
                                            } else {
                                                String G = k96.G(i34, "messages", new Object[0]);
                                                String k = l7c.k(user, i9);
                                                Object[] objArr2 = new Object[2];
                                                objArr2[0] = G;
                                                objArr2[i9] = k;
                                                hdVar2.U = gl.T2(k96.a0("DeleteMessagesText", null, 2131751510, objArr2));
                                            }
                                        } else if (z6 && i34 != i36) {
                                            Object[] objArr3 = new Object[i9];
                                            objArr3[0] = k96.G(i34, "messages", new Object[0]);
                                            hdVar2.U = k96.a0(null, null, 2131751508, objArr3);
                                        } else if (i36 == i9) {
                                            hdVar2.U = k96.M0(2131754090, null);
                                        } else {
                                            hdVar2.U = k96.M0(2131754098, null);
                                        }
                                    } else if (i36 == i9) {
                                        hdVar2.U = k96.M0(2131754060, str2);
                                    } else {
                                        hdVar2.U = k96.M0(2131754061, str2);
                                    }
                                    if (k27Var != null) {
                                        z9 = (!k27Var.u3() || k27.l3(k27Var.k)) ? false : i9;
                                        if (z9) {
                                            long j4 = ((TLRPC.TL_messageMediaGiveaway) k27Var.k.media).until_date * 1000;
                                            String format = k96.D0().t0().format(new Date(j4));
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
                                                k27 k27Var7 = (k27) sparseArrayArr[i37].valueAt(i38);
                                                boolean z26 = (!k27Var7.u3() || k27.l3(k27Var7.k)) ? false : i9;
                                                if (z26) {
                                                    long j5 = ((TLRPC.TL_messageMediaGiveaway) k27Var7.k.media).until_date * 1000;
                                                    String format2 = k96.D0().t0().format(new Date(j5));
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
                                        int g = (int) na7.q1(i35).k4.h.g(timeUnit);
                                        r12 = 0;
                                        hdVar2.S = k96.M0(2131744096, null);
                                        Object[] objArr4 = new Object[i9];
                                        objArr4[0] = Integer.valueOf(g);
                                        hdVar2.U = gl.T2(k96.a0(null, null, 2131744094, objArr4));
                                        AlertDialog$Builder alertDialog$Builder4 = alertDialog$Builder2;
                                        alertDialog$Builder4.j(k96.M0(2131744095, null), edVar);
                                        alertDialog$Builder = alertDialog$Builder4;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder2;
                                        r12 = 0;
                                        r12 = 0;
                                        r12 = 0;
                                        if (z17) {
                                            int g2 = (int) na7.q1(i35).k4.h.g(timeUnit);
                                            hdVar2.S = k96.M0(2131744093, null);
                                            Object[] objArr5 = new Object[i9];
                                            objArr5[0] = Integer.valueOf(g2);
                                            hdVar2.U = gl.T2(k96.a0(null, null, 2131744092, objArr5));
                                            alertDialog$Builder5.j(k96.M0(2131744095, null), edVar);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        } else if (!z9 || z24) {
                                            alertDialog$Builder5.j(k96.M0(z24 ? 2131746128 : 2131751586, null), edVar);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        } else {
                                            hdVar2.S = k96.M0(2131753476, null);
                                            Object[] objArr6 = new Object[i9];
                                            objArr6[0] = str3;
                                            hdVar2.U = gl.T2(k96.a0(null, null, 2131753477, objArr6));
                                            alertDialog$Builder5.h(k96.M0(2131751586, null), edVar);
                                            alertDialog$Builder = alertDialog$Builder5;
                                        }
                                    }
                                    alertDialog$Builder.g(k96.M0(2131752577, r12), r12);
                                    final byte b4 = 0;
                                    hdVar2.O = new DialogInterface.OnDismissListener() { // from class: qd
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            byte b22 = b4;
                                            vm1 vm1Var32 = vm1Var;
                                            switch (b22) {
                                                case 0:
                                                    if (vm1Var32 != null) {
                                                        vm1Var32.run();
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    if (vm1Var32 != null) {
                                                        vm1Var32.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    vm1Var32.run();
                                                    break;
                                            }
                                        }
                                    };
                                    dVar.showDialog(hdVar2);
                                    TextView textView = (TextView) hdVar2.c(-1);
                                    if (textView != null) {
                                        zkb.X(textView, bkb.p7, r12);
                                    }
                                    TextView textView2 = (TextView) hdVar2.c(-3);
                                    if (textView2 != null) {
                                        hdVar2.u0.setPadding(gl.L(12.0f), gl.L(0.0f), gl.L(8.0f), gl.L(12.0f));
                                        ((ViewGroup.MarginLayoutParams) hdVar2.u0.getLayoutParams()).topMargin = gl.L(-8.0f);
                                        zkb.X(textView2, bkb.p7, null);
                                    }
                                }
                            }

                            public static hd z(LaunchActivity launchActivity) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                                String M0 = k96.M0(2131748525, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131748526, null);
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131748528, null), new he(launchActivity, (byte) 1));
                                return hdVar;
                            }
                        }
