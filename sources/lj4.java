// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lj4 implements lv8, r9, sj5, r76, r6a, o44, nu4, pk6, cx9, au9, vcb, kb1, zv7, g22, x69, am0, kab {
    public static lj4 b;
    public Object a;

    public lj4(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }

    public static lj4 t() {
        lj4 lj4Var = b;
        if (lj4Var != null) {
            return lj4Var;
        }
        Point point = gm.q;
        int i = point.x;
        int i2 = point.y;
        lj4 lj4Var2 = new lj4();
        lj4Var2.a = a.b.getSharedPreferences(b10.g(i, i2, "pip_floating_", "_"), 0);
        b = lj4Var2;
        return lj4Var2;
    }

    public final void A() {
        tg5 tg5Var = (tg5) this.a;
        int i = tg5Var.I - 1;
        tg5Var.I = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (sh5 sh5Var : tg5Var.K) {
            sh5Var.d();
            i2 += sh5Var.Z.a;
        }
        uzb[] uzbVarArr = new uzb[i2];
        int i3 = 0;
        for (sh5 sh5Var2 : tg5Var.K) {
            sh5Var2.d();
            int i4 = sh5Var2.Z.a;
            int i5 = 0;
            while (i5 < i4) {
                sh5Var2.d();
                uzbVarArr[i3] = sh5Var2.Z.a(i5);
                i5++;
                i3++;
            }
        }
        tg5Var.J = new vzb(uzbVarArr);
        tg5Var.H.a(tg5Var);
    }

    @Override // g22
    public final boolean B() {
        return false;
    }

    @Override // kb1
    public final String B0() {
        return null;
    }

    @Override // r76
    public final void C(int i, int i2) {
        ((y59) this.a).p(i, i2);
    }

    @Override // r76
    public final void C0(int i, int i2) {
        ((y59) this.a).q(i, i2);
    }

    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        i22 i22Var;
        xz7 xz7Var = (xz7) this.a;
        if (xz7Var.getParentActivity() == null || (i22Var = xz7Var.S0) == null) {
            return;
        }
        if (i != 8) {
            if (i != 7) {
                i22Var.I(i);
                xz7Var.I1(i);
                return;
            }
            i22Var.a(true);
        }
        HashMap<Object, Object> selectedPhotos = xz7Var.S0.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = xz7Var.S0.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
            jo6 jo6Var = (jo6) selectedPhotos.get(selectedPhotosOrder.get(i4));
            z5a z5aVar = new z5a();
            String str = jo6Var.h;
            if (str != null) {
                z5aVar.c = str;
            } else {
                z5aVar.c = jo6Var.I;
            }
            arrayList.add(z5aVar);
            jo6Var.e();
        }
        xz7Var.J1(arrayList);
    }

    @Override // au9
    public final boolean F1(int i) {
        return true;
    }

    @Override // au9
    public final vh6 G0() {
        return null;
    }

    @Override // g22
    public final boolean K0() {
        return false;
    }

    @Override // am0
    public final int K1() {
        ProfileActivity profileActivity = (ProfileActivity) this.a;
        nm0 nm0Var = profileActivity.R5;
        return cmb.p1(profileActivity.g2(), nm0Var.a(nm0Var.e));
    }

    @Override // zv7
    public final void O(float f) {
        z8b z8bVar = (z8b) this.a;
        m58.e(z8bVar.v1).k(String.valueOf(u11.a.indexOf(z8bVar.E0.getCurrentBrush())), f);
        oeb oebVar = z8bVar.q1;
        oebVar.c = f;
        z8bVar.E0(oebVar, null, false);
    }

    @Override // r76
    public final void O0(int i, int i2) {
        ((y59) this.a).n(i, i2, null);
    }

    @Override // am0
    public final int V() {
        ProfileActivity profileActivity = (ProfileActivity) this.a;
        nm0 nm0Var = profileActivity.R5;
        return on2.f(profileActivity.g2(), 553648127, nm0Var.a(nm0Var.c));
    }

    @Override // kb1
    public final boolean X(String str, db1 db1Var) {
        return false;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    @Override // au9
    public final void a2(ArrayList arrayList) {
        k17 k17Var = (k17) this.a;
        String str = k17Var.a0;
        if (str != null) {
            k17Var.U(str, k17Var.d0, k17Var.e0, k17Var.c0, k17Var.b0);
        }
    }

    @Override // r6a
    public final void b(s6a s6aVar) {
        tg5 tg5Var = (tg5) this.a;
        tg5Var.H.b(tg5Var);
    }

    @Override // g22
    public final void b0() {
        gm.t1(((xz7) this.a).fragmentView.findFocus());
    }

    public final q05 c() {
        kz5 kz5Var = (kz5) this.a;
        ite.j("no included points", !Double.isNaN(kz5Var.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(kz5Var.b, kz5Var.d), new LatLng(kz5Var.c, kz5Var.e));
        q05 q05Var = new q05();
        q05Var.a = latLngBounds;
        return q05Var;
    }

    @Override // o44
    public final void d() {
        ((sa8) this.a).t0(null, true);
    }

    @Override // au9
    public final vh6 e1() {
        return null;
    }

    @Override // pk6
    public final Object f(Object obj, Object obj2) {
        return ((bs4) this.a).apply(obj2);
    }

    @Override // vcb
    public final /* synthetic */ lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    @Override // am0
    public final int g0() {
        return 0;
    }

    @Override // am0
    public final float g1() {
        return 0.0f;
    }

    @Override // zv7
    public final float get() {
        z8b z8bVar = (z8b) this.a;
        u11 currentBrush = z8bVar.E0.getCurrentBrush();
        int i = z8bVar.v1;
        return currentBrush == null ? m58.e(i).i : m58.e(i).f(String.valueOf(u11.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        h73 h73Var = (h73) this.a;
        sb.append((Object) h73Var.a.getText());
        sb.append(" ");
        sb.append((Object) h73Var.b.getText());
        return sb.toString();
    }

    @Override // kab
    public final boolean h(long j, int i, int i2, int i3, lab labVar) {
        ImageReceiver imageReceiver;
        au8 au8Var;
        au8 au8Var2;
        labVar.b = null;
        labVar.c = null;
        bp8 bp8Var = (bp8) this.a;
        yo8 yo8Var = bp8Var.h;
        ArrayList arrayList = bp8Var.x;
        if (bp8Var.O < 0.2f) {
            labVar.b = yo8Var.getImageReceiver();
            labVar.c = null;
            labVar.a = yo8Var;
            labVar.h = 0.0f;
            labVar.i = gm.q.y;
            labVar.g = (View) bp8Var.getParent();
            labVar.d = bp8Var.E;
            labVar.n = true;
            return true;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                imageReceiver = null;
                au8Var = null;
                au8Var2 = null;
                break;
            }
            au8 au8Var3 = (au8) arrayList.get(i4);
            if (au8Var3.e < 1.0f || au8Var3.a != i2) {
                i4++;
            } else {
                int i5 = i4 - 1;
                int i6 = i4 - 2;
                au8 d = ProfileStoriesView.d(i5 >= 0 ? (au8) arrayList.get(i5) : null, i6 >= 0 ? (au8) arrayList.get(i6) : null, au8Var3);
                imageReceiver = au8Var3.b;
                au8Var2 = d;
                au8Var = au8Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        labVar.c = imageReceiver;
        labVar.b = null;
        labVar.a = bp8Var;
        labVar.h = 0.0f;
        labVar.i = gm.q.y;
        labVar.g = (View) bp8Var.getParent();
        if (au8Var == null || au8Var2 == null) {
            labVar.f = null;
            return true;
        }
        labVar.f = new ki(this, new RectF(au8Var.m), au8Var, new RectF(au8Var2.m), au8Var2);
        return true;
    }

    @Override // am0
    public final int h1() {
        return 0;
    }

    @Override // o44
    public final w44 i() {
        return ((sa8) this.a).I0;
    }

    public final au6 j() {
        au6 au6Var = (au6) this.a;
        if (au6Var.a == null) {
            u36.j("media cannot be null.");
            return null;
        }
        if (!Double.isNaN(au6Var.d) && au6Var.d < 0.0d) {
            u36.j("startTime cannot be negative or NaN.");
            return null;
        }
        if (Double.isNaN(au6Var.e)) {
            u36.j("playbackDuration cannot be NaN.");
            return null;
        }
        if (!Double.isNaN(au6Var.f) && au6Var.f >= 0.0d) {
            return au6Var;
        }
        u36.j("preloadTime cannot be negative or Nan.");
        return null;
    }

    @Override // cx9
    public final int j0() {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0355, code lost:
    
        if (r7.equals("HOME") == false) goto L167;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup k(Activity activity, int i) {
        boolean z;
        String str;
        b68 b68Var;
        fm fmVar;
        int i2;
        String str2;
        d68 d68Var = (d68) this.a;
        ArrayList arrayList = d68Var.F1;
        ArrayList arrayList2 = d68Var.G1;
        boolean z2 = i != 0;
        if (z2) {
            b68 b68Var2 = new b68(activity);
            TextView textView = new TextView(activity);
            b68Var2.a = textView;
            int i3 = cmb.F6;
            int i4 = d68.I1;
            ylb ylbVar = d68Var.J0;
            boolean z3 = d68Var.D1;
            anb.X(textView, i3, ylbVar);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((jb6.a0 ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z4 = jb6.a0;
            b68Var2.addView(textView, qoe.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? z3 ? 17 : 64 : 72.0f, 10.0f, z4 ? 72.0f : z3 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(activity);
            b68Var2.b = textView2;
            anb.X(textView2, cmb.y6, d68Var.J0);
            wi8.w(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(jb6.a0 ? 5 : 3);
            boolean z5 = jb6.a0;
            b68Var2.addView(textView2, qoe.d(-2, -2.0f, z5 ? 5 : 3, z5 ? z3 ? 17 : 64 : 72.0f, 35.0f, z5 ? 72.0f : z3 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(activity);
            b68Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            anb.s(imageView, cmb.l6, d68Var.J0, PorterDuff.Mode.MULTIPLY);
            boolean z6 = jb6.a0;
            b68Var2.addView(imageView, qoe.d(-2, -2.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : 20.0f, 20.0f, z6 ? 20.0f : 0.0f, 0.0f));
            b68Var = b68Var2;
            if (!z3) {
                Switch r8 = new Switch(activity, null);
                b68Var2.d = r8;
                int i5 = cmb.L6;
                int i6 = cmb.M6;
                int i7 = cmb.c6;
                r8.d(i5, i6, i7, i7);
                b68Var2.addView(r8, qoe.d(37, 40.0f, (jb6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                b68Var = b68Var2;
            }
        } else {
            ?? c68Var = new c68(activity);
            c68Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = d68Var.H1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((fm) arrayList2.get(0)).c(true);
                z = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z = true;
                    str = null;
                } else {
                    str = jb6.d0(d68Var.a, tL_userContact_old2, null, null);
                    z = true;
                }
            }
            pc0 pc0Var = new pc0((ylb) null);
            pc0Var.s(gm.L(30.0f));
            pc0Var.q(tL_userContact_old2);
            bf0 bf0Var = new bf0(activity);
            bf0Var.setRoundRadius(gm.L(40.0f));
            bf0Var.f(tL_userContact_old2, pc0Var);
            c68Var.addView(bf0Var, qoe.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(activity);
            wi8.v(textView3, 1, 17.0f);
            anb.X(textView3, cmb.i5, d68Var.J0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(bw2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            c68Var.addView(textView3, qoe.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            b68Var = c68Var;
            if (str != null) {
                TextView textView4 = new TextView(activity);
                textView4.setTextSize(1, 14.0f);
                anb.X(textView4, cmb.q5, d68Var.J0);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setText(str);
                c68Var.addView(textView4, qoe.t(-2, -2, 49, 10, 3, 10, z ? 27 : 11));
                b68Var = c68Var;
            }
        }
        if (z2) {
            b68 b68Var3 = b68Var;
            int i8 = d68Var.z1;
            char c = 2;
            if (i < i8 || i >= d68Var.A1) {
                fmVar = (fm) arrayList.get(i - d68Var.B1);
                int i9 = fmVar.c;
                if (i9 == 1) {
                    i2 = R.drawable.msg_mention;
                } else if (i9 == 2) {
                    i2 = R.drawable.msg_location;
                } else if (i9 == 3) {
                    i2 = R.drawable.msg_link;
                } else {
                    if (i9 != 4) {
                        if (i9 == 5) {
                            i2 = R.drawable.msg_calendar2;
                        } else if (i9 == 6) {
                            i2 = "ORG".equalsIgnoreCase(fmVar.a(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                        }
                    }
                    i2 = R.drawable.msg_info;
                }
            } else {
                fmVar = (fm) arrayList2.get(i - i8);
                i2 = R.drawable.msg_calls;
            }
            boolean z7 = i != d68Var.y1 - 1;
            b68Var3.a.setText(fmVar.c(true));
            TextView textView5 = b68Var3.b;
            int i10 = fmVar.c;
            if (i10 == 4) {
                str2 = jb6.M0(2131751724, null);
            } else if (i10 == 3) {
                str2 = jb6.M0(2131751718, null);
            } else if (i10 == 5) {
                str2 = jb6.M0(2131751740, null);
            } else if (i10 == 6) {
                str2 = "ORG".equalsIgnoreCase(fmVar.a(true)) ? jb6.M0(2131751729, null) : jb6.M0(2131751728, null);
            } else {
                int indexOf = fmVar.b.indexOf(58);
                if (indexOf < 0) {
                    str2 = "";
                } else {
                    String substring = fmVar.b.substring(0, indexOf);
                    if (fmVar.c != 20) {
                        String[] split = substring.split(";");
                        for (int i11 = 0; i11 < split.length; i11++) {
                            if (split[i11].indexOf(61) < 0) {
                                substring = split[i11];
                            }
                        }
                        if (substring.startsWith("X-")) {
                            substring = substring.substring(2);
                        }
                        switch (substring.hashCode()) {
                            case -2015525726:
                                if (substring.equals("MOBILE")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2064738:
                                if (substring.equals("CELL")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2223327:
                                break;
                            case 2464291:
                                if (substring.equals("PREF")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2670353:
                                if (substring.equals("WORK")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 75532016:
                                if (substring.equals("OTHER")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                substring = jb6.M0(2131747024, null);
                                break;
                            case 2:
                                substring = jb6.M0(2131747026, null);
                                break;
                            case 3:
                                substring = jb6.M0(2131747025, null);
                                break;
                            case 4:
                                substring = jb6.M0(2131747014, null);
                                break;
                            case 5:
                                substring = jb6.M0(2131747015, null);
                                break;
                        }
                    } else {
                        substring = substring.substring(2).split(";")[0];
                    }
                    str2 = substring.substring(0, 1).toUpperCase() + substring.substring(1).toLowerCase();
                }
            }
            textView5.setText(str2);
            Switch r2 = b68Var3.d;
            if (r2 != null) {
                r2.c(fmVar.d, false);
            }
            b68Var3.c.setImageResource(i2);
            b68Var3.e = z7;
            b68Var3.setWillNotDraw(!z7);
        }
        return b68Var;
    }

    @Override // x69
    public final void k0(View view, boolean z) {
        if (z == ((w78) this.a).Y && (view instanceof q68)) {
            q68 q68Var = (q68) view;
            q68Var.y.c(q68Var);
        }
    }

    @Override // r76
    public final void l(int i, int i2) {
        ((y59) this.a).j(i, i2);
    }

    @Override // r9
    public final void m(Object obj) {
        Map map = (Map) obj;
        hq4 hq4Var = (hq4) this.a;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        dq4 dq4Var = (dq4) hq4Var.F.pollFirst();
        if (dq4Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = dq4Var.a;
            if (hq4Var.c.o(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    @Override // cx9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(boolean z, float f) {
        int i;
        float A;
        int i2;
        int i3;
        h73 h73Var = (h73) this.a;
        if (f <= 0.25f) {
            A = b10.A(f, 0.25f, 536576.0f, 512000.0f);
        } else {
            float f2 = f - 0.25f;
            if (f2 < 0.25f) {
                A = b10.A(f2, 0.25f, 9437184.0f, 1048576.0f);
            } else {
                float f3 = f2 - 0.25f;
                if (f3 > 0.25f) {
                    i = (int) ((((f3 - 0.25f) / 0.25f) * 1.9922944E9f) + 1.048576E8f);
                    long j = i;
                    h73Var.b.setText(jb6.a0("AutodownloadSizeLimitUpTo", null, 2131753737, gm.i0(j, false, false)));
                    h73Var.d = j;
                    bjb[] bjbVarArr = h73Var.h;
                    AnimatorSet[] animatorSetArr = h73Var.n;
                    i2 = h73Var.e;
                    i3 = h73Var.r.videosRow;
                    if (i2 != i3) {
                        h73Var.f.setText(jb6.a0("AutoDownloadPreloadVideoInfo", null, 2131753775, gm.i0(j, false, false)));
                        boolean z2 = i > 2097152;
                        if (z2 != bjbVarArr[0].isEnabled()) {
                            ArrayList arrayList = new ArrayList();
                            bjbVarArr[0].e(arrayList, z2);
                            AnimatorSet animatorSet = animatorSetArr[0];
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                animatorSetArr[0] = null;
                            }
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSetArr[0] = animatorSet2;
                            animatorSet2.playTogether(arrayList);
                            animatorSetArr[0].addListener(new kh2(h73Var, (byte) 6));
                            animatorSetArr[0].setDuration(150L);
                            animatorSetArr[0].start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                A = b10.A(f3, 0.25f, 9.437184E7f, 1.048576E7f);
            }
        }
        i = (int) A;
        long j2 = i;
        h73Var.b.setText(jb6.a0("AutodownloadSizeLimitUpTo", null, 2131753737, gm.i0(j2, false, false)));
        h73Var.d = j2;
        bjb[] bjbVarArr2 = h73Var.h;
        AnimatorSet[] animatorSetArr2 = h73Var.n;
        i2 = h73Var.e;
        i3 = h73Var.r.videosRow;
        if (i2 != i3) {
        }
    }

    @Override // au9
    public final void o(int i) {
        ((k17) this.a).f();
    }

    @Override // nu4
    public final boolean onDown(MotionEvent motionEvent) {
        or1 or1Var = (or1) this.a;
        View view = or1Var.a;
        if (view != null) {
            view.setPressed(true);
            or1Var.a.setSelected(true);
            or1Var.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // nu4
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // nu4
    public final void onLongPress(MotionEvent motionEvent) {
        or1 or1Var = (or1) this.a;
        yv1 yv1Var = or1Var.x;
        if (or1Var.a != null) {
            yv1Var.g9 = de0.b(yv1Var, or1Var.w, yv1Var.l6, yv1Var.d(), yv1Var.Ba);
            m8 m8Var = yv1Var.g9;
            if (m8Var != null) {
                or1Var.b = m8Var;
                m8Var.setOnDismissListener(new x6(or1Var, (byte) 3));
                yv1Var.A0.D0();
                yv1Var.C0.R = false;
                ImageView imageView = or1Var.w;
                yv1Var.Mb(imageView);
                yv1Var.y6(false, imageView != yv1Var.y1, 0.3f);
                yv1Var.H7(false);
                kt1 kt1Var = yv1Var.O3;
                if (kt1Var != null) {
                    kt1Var.d(1, true);
                }
                UndoView undoView = yv1Var.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                ms1 ms1Var = yv1Var.a0;
                if (ms1Var == null || ms1Var.getEditField() == null) {
                    return;
                }
                yv1Var.a0.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // nu4
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // nu4
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        or1 or1Var = (or1) this.a;
        if (or1Var.e || (view = or1Var.a) == null) {
            return false;
        }
        view.callOnClick();
        or1Var.e = true;
        return true;
    }

    @Override // vcb
    public final void p(byte[] bArr, int i, int i2, ucb ucbVar, fu2 fu2Var) {
        f53 a;
        yw7 yw7Var = (yw7) this.a;
        yw7Var.L(i2 + i, bArr);
        yw7Var.N(i);
        ArrayList arrayList = new ArrayList();
        while (yw7Var.a() > 0) {
            jte.e("Incomplete Mp4Webvtt Top Level box header found.", yw7Var.a() >= 8);
            int m = yw7Var.m() - 8;
            if (yw7Var.m() == 1987343459) {
                CharSequence charSequence = null;
                e53 e53Var = null;
                while (m > 0) {
                    jte.e("Incomplete vtt cue box header found.", m >= 8);
                    int m2 = yw7Var.m();
                    int m3 = yw7Var.m();
                    int i3 = m2 - 8;
                    byte[] bArr2 = yw7Var.a;
                    int i4 = yw7Var.b;
                    String str = hac.a;
                    String str2 = new String(bArr2, i4, i3, StandardCharsets.UTF_8);
                    yw7Var.O(i3);
                    m = (m - 8) - i3;
                    if (m3 == 1937011815) {
                        bxc bxcVar = new bxc();
                        cxc.e(str2, bxcVar);
                        e53Var = bxcVar.a();
                    } else if (m3 == 1885436268) {
                        charSequence = cxc.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (e53Var != null) {
                    e53Var.a = charSequence;
                    e53Var.b = null;
                    a = e53Var.a();
                } else {
                    Pattern pattern = cxc.a;
                    bxc bxcVar2 = new bxc();
                    bxcVar2.c = charSequence;
                    a = bxcVar2.a().a();
                }
                arrayList.add(a);
            } else {
                yw7Var.O(m);
            }
        }
        fu2Var.accept(new i53(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // x69
    public final void q(boolean z) {
        tk5 tk5Var;
        w78 w78Var = (w78) this.a;
        w78Var.X = z ? (byte) 1 : (byte) 0;
        if (z) {
            tk5Var = ((d) w78Var).parentLayout;
            tk5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        w78Var.L.e1(true);
    }

    @Override // kab
    public final void q0(long j, int i, j48 j48Var) {
        bp8 bp8Var = (bp8) this.a;
        int i2 = ProfileStoriesView.t0;
        bp8Var.f(true, false);
        j48Var.run();
    }

    @Override // vcb
    public final int r() {
        return 2;
    }

    @Override // x69
    public final boolean r0(int i) {
        w78 w78Var = (w78) this.a;
        yn6 yn6Var = w78Var.K;
        return w78Var.b.containsKey(yn6Var != null ? Integer.valueOf(((jo6) yn6Var.e.get(i)).C) : ((no6) w78Var.f.get(i)).B);
    }

    @Override // am0
    public final int r1() {
        ProfileActivity profileActivity = (ProfileActivity) this.a;
        nm0 nm0Var = profileActivity.R5;
        return cmb.p1(profileActivity.g2(), nm0Var.a(nm0Var.b));
    }

    public final String s(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            qw5 qw5Var = (qw5) this.a;
            ww5 ww5Var = new ww5(stringWriter, qw5Var.a, qw5Var.b, qw5Var.c, qw5Var.d);
            ww5Var.h(obj);
            ww5Var.j();
            ww5Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public final ClipDescription u() {
        return ((fq5) this.a).getDescription();
    }

    @Override // am0
    public final int u0() {
        ProfileActivity profileActivity = (ProfileActivity) this.a;
        nm0 nm0Var = profileActivity.R5;
        return on2.f(profileActivity.g2(), 352321535, nm0Var.a(nm0Var.d));
    }

    @Override // kb1
    public final void v(String str) {
        String c = l11.c(str);
        if (TextUtils.isEmpty(c)) {
            gm.c3(new bo6((byte) 4));
        } else {
            oc7.r1(((ml7) this.a).a).Z1().a(c, null, new bn0((byte) 19));
        }
    }

    @Override // x69
    public final boolean w(int i) {
        return ((w78) this.a).M.d(i) == 0;
    }

    @Override // am0
    public final float w0() {
        return -1.0f;
    }

    @Override // nu4
    public final void y() {
        or1 or1Var = (or1) this.a;
        View view = or1Var.a;
        if (view != null) {
            view.setPressed(false);
            or1Var.a.setSelected(false);
        }
        View view2 = or1Var.n;
        if (view2 == null || or1Var.d) {
            return;
        }
        view2.callOnClick();
        or1Var.d = true;
    }

    @Override // am0
    public final float y0() {
        return -1.0f;
    }

    public final lj4 z(xj5 xj5Var) {
        kz5 kz5Var = (kz5) this.a;
        LatLng latLng = new LatLng(xj5Var.a, xj5Var.b);
        kz5Var.getClass();
        double d = kz5Var.b;
        double d2 = latLng.a;
        kz5Var.b = Math.min(d, d2);
        kz5Var.c = Math.max(kz5Var.c, d2);
        boolean isNaN = Double.isNaN(kz5Var.d);
        double d3 = latLng.b;
        if (isNaN) {
            kz5Var.d = d3;
            kz5Var.e = d3;
            return this;
        }
        double d4 = kz5Var.d;
        double d5 = kz5Var.e;
        if (d4 > d5 ? !(d4 <= d3 || d3 <= d5) : !(d4 <= d3 && d3 <= d5)) {
            if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - d5) + 360.0d) % 360.0d) {
                kz5Var.d = d3;
                return this;
            }
            kz5Var.e = d3;
        }
        return this;
    }

    public /* synthetic */ lj4(Object obj) {
        this.a = obj;
    }

    @Override // g22
    public final void I() {
    }

    @Override // kb1
    public final void I0(yh7 yh7Var) {
    }

    @Override // kab
    public final void e(boolean z) {
    }

    @Override // g22
    public final void f0(Object obj) {
    }

    @Override // kb1
    public final void onDismiss() {
    }

    @Override // vcb
    public final void reset() {
    }

    @Override // cx9
    public final void x() {
    }

    @Override // g22
    public final void z0(TLRPC.User user) {
    }

    @Override // mv8
    public final Object get() {
        li4 li4Var = (li4) ((lq5) this.a).a;
        li4Var.getClass();
        f8a f8aVar = f8a.a;
        return f8a.a(li4Var);
    }

    @Override // g22
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
