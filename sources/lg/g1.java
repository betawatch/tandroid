package lg;

import ai.d2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class g1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final e6 a;
    public final TextView b;
    public final TextView[] c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f;
    public final TextView[] h;
    public final TextView[][] n;
    public final mp r;
    public final FrameLayout s;
    public final LinearLayout w;
    public int x;
    public int y;

    public g1(Context context, e6 e6Var) {
        super(context);
        this.c = new TextView[2];
        this.f = new ViewGroup[7];
        this.h = new TextView[7];
        this.n = new TextView[7][];
        this.x = 1;
        this.y = 0;
        this.E = true;
        this.a = e6Var;
        setOrientation(1);
        setClipChildren(false);
        int i3 = 0;
        for (int i10 = 7; i3 < i10; i10 = 7) {
            if (i3 == 0) {
                ViewGroup d2Var = new d2(context, 6);
                d2Var.setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setGravity(bd.a0 ? 5 : 3);
                textView.setTextSize(1, 16.0f);
                d2Var.addView(textView, mf.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i3] = new TextView(context);
                this.h[i3].setGravity(bd.a0 ? 5 : 3);
                this.h[i3].setTextSize(1, 13.0f);
                r6.V(this.h[i3], k6.z6, e6Var);
                d2Var.addView(this.h[i3], mf.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.w = linearLayout;
                linearLayout.setOrientation(1);
                this.s = new FrameLayout(context);
                this.n[i3] = new TextView[2];
                for (int i11 = 0; i11 < 2; i11++) {
                    this.n[i3][i11] = new TextView(context);
                    this.n[i3][i11].setTextSize(1, 14.0f);
                    r6.V(this.n[i3][i11], k6.z6, e6Var);
                    this.n[i3][i11].setGravity(bd.a0 ? 3 : 5);
                    this.s.addView(this.n[i3][i11], mf.i(-1.0f, -1.0f, hs.E1, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    this.c[i12] = new TextView(context);
                    this.c[i12].setTextSize(1, 14.0f);
                    r6.V(this.c[i12], k6.z6, e6Var);
                    this.c[i12].setGravity(bd.a0 ? 3 : 5);
                    this.s.addView(this.c[i12], mf.i(-1.0f, -1.0f, hs.E1, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                r6.t(imageView, k6.z6, e6Var, PorterDuff.Mode.SRC_IN);
                this.s.addView(imageView, mf.h(20.0f, 20.0f, 8388629));
                this.w.addView(this.s, new LinearLayout.LayoutParams(mf.z(-1.0f), mf.z(-1.0f), Gravity.getAbsoluteGravity(hs.E1, bd.a0 ? 1 : 0)));
                mp mpVar = new mp(context);
                this.r = mpVar;
                mpVar.getDrawable().L = true;
                mpVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
                mpVar.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                mpVar.setGravity(bd.a0 ? 3 : 5);
                int L = org.telegram.messenger.g0.L(8.0f);
                int i13 = k6.o6;
                int w02 = k6.w0(i13, e6Var);
                a(w02);
                int r12 = k6.r1(0.1f, w02);
                int w03 = k6.w0(i13, e6Var);
                a(w03);
                int r13 = k6.r1(0.22f, w03);
                mpVar.setBackground(k6.k0(L, L, L, L, r12, r13, r13));
                int w04 = k6.w0(i13, e6Var);
                a(w04);
                mpVar.setTextColor(w04);
                mpVar.getDrawable().A = 0.6f;
                mpVar.setVisibility(8);
                this.w.addView(mpVar, mf.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.w, mf.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                d2Var.addView(frameLayout, mf.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f[i3] = d2Var;
                addView(d2Var, mf.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f10 = k5.f(context, 0);
                this.h[i3] = new TextView(context);
                this.h[i3].setTextSize(1, 14.0f);
                r6.V(this.h[i3], k6.G6, e6Var);
                this.h[i3].setGravity(bd.a0 ? 5 : 3);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.n[i3] = new TextView[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    this.n[i3][i14] = new TextView(context);
                    this.n[i3][i14].setTextSize(1, 14.0f);
                    r6.V(this.n[i3][i14], k6.z6, e6Var);
                    this.n[i3][i14].setGravity(bd.a0 ? 3 : 5);
                    frameLayout2.addView(this.n[i3][i14], mf.e(-1, -1, hs.E1));
                }
                if (bd.a0) {
                    f10.addView(frameLayout2, mf.r(-2, -1, 51));
                    f10.addView(this.h[i3], mf.r(-1, -1, 53));
                } else {
                    f10.addView(this.h[i3], mf.r(-2, -1, 51));
                    f10.addView(frameLayout2, mf.r(-1, -1, 53));
                }
                this.f[i3] = f10;
                addView(f10, mf.u(-1.0f, -2.0f, 51, 18.0f, i3 == 1 ? 1.0f : 11.66f, 28.0f, i3 == 6 ? 16.66f : 0.0f));
            }
            i3++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i3);

    /* JADX WARN: Code restructure failed: missing block: B:80:0x022e, code lost:
    
        if (r4 == 1439) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [int] */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50, types: [int] */
    /* JADX WARN: Type inference failed for: r6v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_account.TL_businessWorkHours tL_businessWorkHours, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i3;
        int offset;
        boolean z14;
        TextView[][] textViewArr;
        boolean z15;
        float f10;
        ?? r42;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        int i11;
        boolean z16;
        int i12;
        int i13;
        float f11;
        ArrayList[] arrayListArr;
        int i14;
        boolean z17;
        ArrayList arrayList3;
        TextView[][] textViewArr2;
        int i15;
        int i16;
        int i17;
        boolean z18;
        ArrayList[] arrayListArr2;
        int i18;
        boolean z19;
        float f12;
        boolean z20 = z10;
        this.G = z20;
        this.F = z12;
        if (tL_businessWorkHours == null) {
            return;
        }
        boolean z21 = true;
        if (!tL_businessWorkHours.weekly_open.isEmpty()) {
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (i19 < tL_businessWorkHours.weekly_open.size()) {
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = tL_businessWorkHours.weekly_open.get(i19);
                    if (tL_businessWeeklyOpen.start_minute > i20 + 1) {
                        break;
                    }
                    i20 = tL_businessWeeklyOpen.end_minute;
                    i19++;
                } else if (i20 >= 10079) {
                    z13 = true;
                }
            }
            if (z13) {
                this.G = false;
                z20 = false;
            }
            i3 = 8;
            int i21 = !z13 ? 8 : 0;
            ImageView imageView = this.d;
            imageView.setVisibility(i21);
            this.w.setTranslationX(!z13 ? org.telegram.messenger.g0.L(11.0f) : 0.0f);
            TLRPC.TL_timezone a10 = y1.b(h10.t0).a(tL_businessWorkHours.timezone_id);
            Calendar calendar = Calendar.getInstance();
            offset = ((calendar.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (a10 != null ? 0 : a10.utc_offset)) / 60;
            if (offset != 0 && !z13) {
                i3 = 0;
            }
            mp mpVar = this.r;
            mpVar.setVisibility(i3);
            boolean z22 = offset != 0 ? false : z11;
            invalidate();
            z14 = this.E;
            TextView[] textViewArr3 = this.c;
            int i22 = 60;
            textViewArr = this.n;
            if (z14) {
                ViewPropertyAnimator duration = textViewArr3[0].animate().alpha((z20 || z22) ? 0.0f : 1.0f).setDuration(320L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                ViewPropertyAnimator animate = textViewArr3[1].animate();
                if (z20 || !z22) {
                    z15 = false;
                    f10 = 0.0f;
                } else {
                    z15 = false;
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(320L).setInterpolator(xqVar).start();
                textViewArr[z15 ? 1 : 0][z15 ? 1 : 0].animate().alpha(z20 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(xqVar).start();
                textViewArr[z15 ? 1 : 0][1].animate().alpha(z20 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(xqVar).start();
                imageView.animate().rotation(z20 ? 180.0f : 0.0f).setDuration(320L).setInterpolator(xqVar).start();
            } else {
                textViewArr3[0].setAlpha((z20 || z22) ? 0.0f : 1.0f);
                textViewArr3[1].setAlpha((z20 || !z22) ? 0.0f : 1.0f);
                imageView.setRotation(z20 ? 180.0f : 0.0f);
                z15 = false;
            }
            for (r42 = z15; r42 < textViewArr.length; r42++) {
                ?? r62 = z15;
                while (true) {
                    TextView[] textViewArr4 = textViewArr[r42];
                    if (r62 < textViewArr4.length) {
                        if (r42 != 0 || z20) {
                            if ((r62 == z21 ? z21 : z15) == z22) {
                                f12 = 1.0f;
                                if (this.E) {
                                    textViewArr4[r62].animate().alpha(f12).setDuration(320L).setInterpolator(xq.h).start();
                                } else {
                                    textViewArr4[r62].setAlpha(f12);
                                }
                                z21 = true;
                                r62++;
                            }
                        }
                        f12 = 0.0f;
                        if (this.E) {
                        }
                        z21 = true;
                        r62++;
                    }
                }
                z21 = true;
            }
            mpVar.c(bd.M0(!z22 ? 2131752730 : 2131752731, null), (!bd.a0 || this.E) ? z15 : true, true);
            this.E = z15;
            ArrayList[] e02 = d1.e0(new ArrayList(tL_businessWorkHours.weekly_open));
            int i23 = (calendar.get(7) + 5) % 7;
            int i24 = calendar.get(11);
            int i25 = calendar.get(12);
            arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
            arrayList2 = new ArrayList(arrayList.size());
            i10 = 0;
            boolean z23 = z13;
            while (i10 < arrayList.size()) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i10);
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen3 = new TL_account.TL_businessWeeklyOpen();
                boolean z24 = z20;
                if (offset != 0) {
                    int i26 = tL_businessWeeklyOpen2.start_minute;
                    boolean z25 = z23;
                    int i27 = i26 % 1440;
                    int i28 = tL_businessWeeklyOpen2.end_minute;
                    arrayListArr2 = e02;
                    int i29 = (i28 - i26) + i27;
                    z18 = z25;
                    if (i27 == 0) {
                        i18 = i25;
                        if (i29 != 1440) {
                            z19 = z25;
                        }
                        tL_businessWeeklyOpen3.start_minute = i26;
                        tL_businessWeeklyOpen3.end_minute = i28;
                        arrayList2.add(tL_businessWeeklyOpen3);
                        z19 = z25;
                        i10++;
                        z20 = z24;
                        z23 = z19;
                        i25 = i18;
                        e02 = arrayListArr2;
                    }
                } else {
                    z18 = z23;
                    arrayListArr2 = e02;
                }
                i18 = i25;
                z19 = z18;
                tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
                tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
                arrayList2.add(tL_businessWeeklyOpen3);
                int i30 = tL_businessWeeklyOpen3.start_minute;
                if (i30 < 0) {
                    int i31 = tL_businessWeeklyOpen3.end_minute;
                    if (i31 < 0) {
                        tL_businessWeeklyOpen3.start_minute = i30 + 10080;
                        tL_businessWeeklyOpen3.end_minute = i31 + 10080;
                        z19 = z19;
                    } else {
                        tL_businessWeeklyOpen3.start_minute = 0;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen4 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen4.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                        tL_businessWeeklyOpen4.end_minute = 10079;
                        arrayList2.add(tL_businessWeeklyOpen4);
                        z19 = z19;
                    }
                } else {
                    int i32 = tL_businessWeeklyOpen3.end_minute;
                    z19 = z19;
                    if (i32 > 10080) {
                        if (i30 > 10080) {
                            tL_businessWeeklyOpen3.start_minute = i30 - 10080;
                            tL_businessWeeklyOpen3.end_minute = i32 - 10080;
                            z19 = z19;
                        } else {
                            tL_businessWeeklyOpen3.end_minute = 10079;
                            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen5 = new TL_account.TL_businessWeeklyOpen();
                            tL_businessWeeklyOpen5.start_minute = 0;
                            tL_businessWeeklyOpen5.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                            arrayList2.add(tL_businessWeeklyOpen5);
                            i10++;
                            z20 = z24;
                            z23 = z19;
                            i25 = i18;
                            e02 = arrayListArr2;
                        }
                    }
                }
                i10++;
                z20 = z24;
                z23 = z19;
                i25 = i18;
                e02 = arrayListArr2;
            }
            boolean z26 = z20;
            boolean z27 = z23;
            ArrayList[] arrayListArr3 = e02;
            Collections.sort(arrayList2, new a3.u(25));
            int i33 = (i23 * 1440) + (i24 * 60) + i25;
            for (i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen6 = (TL_account.TL_businessWeeklyOpen) arrayList2.get(i11);
                int i34 = tL_businessWeeklyOpen6.start_minute;
                if ((i33 >= i34 && i33 <= tL_businessWeeklyOpen6.end_minute) || (((i16 = i33 + 10080) >= i34 && i16 <= tL_businessWeeklyOpen6.end_minute) || (i33 - 10080 >= i34 && i17 <= tL_businessWeeklyOpen6.end_minute))) {
                    z16 = true;
                    break;
                }
            }
            z16 = false;
            ArrayList[] e03 = d1.e0(arrayList2);
            String M0 = bd.M0(!z16 ? 2131752742 : 2131752743, null);
            TextView textView = this.b;
            textView.setText(M0);
            r6.V(textView, !z16 ? k6.l8 : k6.p7, this.a);
            int i35 = this.y;
            i12 = this.x;
            this.x = 1;
            this.y = 0;
            i13 = 0;
            while (i13 < 2) {
                ArrayList[] arrayListArr4 = i13 == 0 ? arrayListArr3 : e03;
                int i36 = 0;
                while (i36 < 7) {
                    int i37 = (i23 + i36) % 7;
                    TextView[] textViewArr5 = this.h;
                    if (i36 == 0) {
                        arrayListArr = e03;
                        textViewArr5[i36].setText(bd.M0(2131752746, null));
                        i14 = i13;
                        z17 = z16;
                    } else {
                        arrayListArr = e03;
                        i14 = i13;
                        String displayName = DayOfWeek.values()[i37].getDisplayName(TextStyle.FULL, bd.E0().y);
                        StringBuilder sb2 = new StringBuilder();
                        z17 = z16;
                        sb2.append(displayName.substring(0, 1).toUpperCase());
                        sb2.append(displayName.substring(1));
                        textViewArr5[i36].setText(sb2.toString());
                        textViewArr[i36][0].setVisibility(z26 ? 0 : 4);
                        textViewArr[i36][1].setVisibility(z26 ? 0 : 4);
                        textViewArr5[i36].setVisibility(z26 ? 0 : 4);
                    }
                    int i38 = 0;
                    while (true) {
                        if (i38 < (i36 == 0 ? 2 : 1)) {
                            TextView textView2 = i38 == 0 ? textViewArr[i36][i14] : textViewArr3[i14];
                            if (i36 == 0 && !z17 && i38 == 1) {
                                int i39 = 0;
                                while (true) {
                                    if (i39 >= arrayList2.size()) {
                                        i15 = -1;
                                        break;
                                    }
                                    i15 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(i39)).start_minute;
                                    if (i33 < i15) {
                                        break;
                                    } else {
                                        i39++;
                                    }
                                }
                                if (i15 == -1 && !arrayList2.isEmpty()) {
                                    i15 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(0)).start_minute;
                                }
                                if (i15 == -1) {
                                    textView2.setText(bd.M0(2131752745, null));
                                    arrayList3 = arrayList2;
                                    textViewArr2 = textViewArr;
                                } else {
                                    int i40 = i15 < i33 ? (10080 - i33) + i15 : i15 - i33;
                                    if (i40 < i22) {
                                        arrayList3 = arrayList2;
                                        textView2.setText(bd.G(i40, "BusinessHoursProfileOpensInMinutes", new Object[0]));
                                        textViewArr2 = textViewArr;
                                    } else {
                                        arrayList3 = arrayList2;
                                        if (i40 < 1440) {
                                            textViewArr2 = textViewArr;
                                            textView2.setText(bd.G((int) Math.ceil(i40 / 60.0f), "BusinessHoursProfileOpensInHours", new Object[0]));
                                        } else {
                                            textViewArr2 = textViewArr;
                                            textView2.setText(bd.G((int) Math.ceil((i40 / 60.0f) / 24.0f), "BusinessHoursProfileOpensInDays", new Object[0]));
                                        }
                                    }
                                }
                            } else {
                                arrayList3 = arrayList2;
                                textViewArr2 = textViewArr;
                                if (z27) {
                                    textView2.setText(bd.M0(2131752744, null));
                                } else if (arrayListArr4[i37].isEmpty()) {
                                    textView2.setText(bd.M0(2131752745, null));
                                } else if (d1.h0(arrayListArr4[i37])) {
                                    textView2.setText(bd.M0(2131752741, null));
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i41 = 0; i41 < arrayListArr4[i37].size(); i41++) {
                                        if (i41 > 0) {
                                            sb3.append("\n");
                                        }
                                        sb3.append(arrayListArr4[i37].get(i41));
                                    }
                                    int size = arrayListArr4[i37].size();
                                    textView2.setText(sb3);
                                    if (i36 == 0) {
                                        this.x = Math.max(this.x, size);
                                        this.y = Math.max(this.y, textView2.getLineHeight() * size);
                                    }
                                }
                            }
                            i38++;
                            arrayList2 = arrayList3;
                            textViewArr = textViewArr2;
                            i22 = 60;
                        }
                    }
                    i36++;
                    e03 = arrayListArr;
                    i13 = i14;
                    z16 = z17;
                    i22 = 60;
                }
                i13++;
                z16 = z16;
                i22 = 60;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            f11 = 6.0f;
            layoutParams.topMargin = org.telegram.messenger.g0.L((this.x <= 2 || mpVar.getVisibility() == 0) ? 6.0f : 12.0f);
            if (this.x <= 2 && mpVar.getVisibility() != 0) {
                f11 = 12.0f;
            }
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(f11);
            layoutParams.gravity = ((this.x <= 2 || mpVar.getVisibility() == 0) ? 16 : 80) | (!bd.a0 ? 3 : 5);
            if (i12 == this.x || i35 != this.y) {
                requestLayout();
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
        i3 = 8;
        if (!z13) {
        }
        ImageView imageView2 = this.d;
        imageView2.setVisibility(i21);
        this.w.setTranslationX(!z13 ? org.telegram.messenger.g0.L(11.0f) : 0.0f);
        TLRPC.TL_timezone a102 = y1.b(h10.t0).a(tL_businessWorkHours.timezone_id);
        Calendar calendar2 = Calendar.getInstance();
        offset = ((calendar2.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (a102 != null ? 0 : a102.utc_offset)) / 60;
        if (offset != 0) {
            i3 = 0;
        }
        mp mpVar2 = this.r;
        mpVar2.setVisibility(i3);
        if (offset != 0) {
        }
        invalidate();
        z14 = this.E;
        TextView[] textViewArr32 = this.c;
        int i222 = 60;
        textViewArr = this.n;
        if (z14) {
        }
        while (r42 < textViewArr.length) {
        }
        mpVar2.c(bd.M0(!z22 ? 2131752730 : 2131752731, null), (!bd.a0 || this.E) ? z15 : true, true);
        this.E = z15;
        ArrayList[] e022 = d1.e0(new ArrayList(tL_businessWorkHours.weekly_open));
        int i232 = (calendar2.get(7) + 5) % 7;
        int i242 = calendar2.get(11);
        int i252 = calendar2.get(12);
        arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
        arrayList2 = new ArrayList(arrayList.size());
        i10 = 0;
        boolean z232 = z13;
        while (i10 < arrayList.size()) {
        }
        boolean z262 = z20;
        boolean z272 = z232;
        ArrayList[] arrayListArr32 = e022;
        Collections.sort(arrayList2, new a3.u(25));
        int i332 = (i232 * 1440) + (i242 * 60) + i252;
        while (i11 < arrayList2.size()) {
        }
        z16 = false;
        ArrayList[] e032 = d1.e0(arrayList2);
        String M02 = bd.M0(!z16 ? 2131752742 : 2131752743, null);
        TextView textView3 = this.b;
        textView3.setText(M02);
        r6.V(textView3, !z16 ? k6.l8 : k6.p7, this.a);
        int i352 = this.y;
        i12 = this.x;
        this.x = 1;
        this.y = 0;
        i13 = 0;
        while (i13 < 2) {
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        f11 = 6.0f;
        layoutParams2.topMargin = org.telegram.messenger.g0.L((this.x <= 2 || mpVar2.getVisibility() == 0) ? 6.0f : 12.0f);
        if (this.x <= 2) {
            f11 = 12.0f;
        }
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(f11);
        layoutParams2.gravity = ((this.x <= 2 || mpVar2.getVisibility() == 0) ? 16 : 80) | (!bd.a0 ? 3 : 5);
        if (i12 == this.x) {
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.F) {
            Paint W0 = k6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = k6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(bd.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(bd.a0 ? 21.33f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30);
        if (!this.G) {
            int L2 = org.telegram.messenger.g0.L(60.0f);
            int i11 = this.x;
            mp mpVar = this.r;
            if (i11 > 2 || mpVar.getVisibility() == 0) {
                L = org.telegram.messenger.g0.L(mpVar.getVisibility() == 0 ? 21.0f : 0.0f) + org.telegram.messenger.g0.L(15.0f) + this.y;
            } else {
                L = 0;
            }
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max(L2, L) + (this.F ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mp mpVar = this.r;
        if (mpVar == null || mpVar.getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        float x10 = motionEvent.getX();
        ViewGroup[] viewGroupArr = this.f;
        float x11 = x10 - viewGroupArr[0].getX();
        FrameLayout frameLayout = this.e;
        float x12 = x11 - frameLayout.getX();
        FrameLayout frameLayout2 = this.s;
        return mpVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - mpVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - mpVar.getY()));
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        mp mpVar = this.r;
        if (mpVar != null) {
            mpVar.setOnClickListener(onClickListener);
        }
    }
}
